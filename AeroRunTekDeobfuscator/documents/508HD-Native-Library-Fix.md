# 508 HD Client Native Library Fix

## Date: 2026-03-24

## Problem

The 508 HD client crashes with `error_game_dll` immediately after connecting to the server. This occurs on both the raw (unpatched) JAR and the ASM-patched JAR.

## Environment

- OS: Windows 11 Enterprise (10.0.26200)
- JDK (client): Adoptium JDK 8u472 32-bit (jdk-8.0.472.8-hotspot)
- JDK (pipeline): Adoptium JDK 25
- Native DLLs: PE32 i386 (jogl.dll, jogl_awt.dll, browsercontrol.dll)
- JOGL version: 1.x (javax.media.opengl, bundled in hdlibs.jar)

## Root Cause

The pack200-compressed 508 HD client (`508hd.pack200`) contains class `f` (originally Class43) which implements a worker thread command dispatcher in `f.run()`. This dispatcher only handles 5 commands: {1, 2, 4, 8, 9}.

**Command 10 (native DLL loading) does not exist in this build.** When the client queues command 10, the dispatcher falls through to `throw new Exception()` at bytecode offset 183 (source line 134), which is caught silently and sets the error state (`dl.f = 2`). After 6 retries, the client shows `error_game_dll`.

The JODE-decompiled `Class43.java` in `3rd Party/client508/src/` is from a **different build** that includes commands 3, 5, 6, 7, 10, 11, 12, 13 with full DLL loading logic. The pack200 file is a stripped browser-applet version where native libraries were loaded by the Jagex browser plugin, not by the client JAR.

## Key Evidence

1. **Exception type**: `java.lang.Exception` (not `UnsatisfiedLinkError`) — DLL loading was never attempted
2. **Stack trace**: `f.run(f.java:134)` → `Thread.run()` — the worker thread dispatcher
3. **Bytecode analysis** (`javap -l -c f.class`):
   - Line 134 maps to bytecode offset 183
   - Offset 183 is `NEW java/lang/Exception; DUP; INVOKESPECIAL; ATHROW`
   - This is the unknown-command fallthrough guard
   - Only commands 1, 2, 4, 8, 9 have handlers; all others throw
4. **String search**: All 305 classes searched — zero matches for `loadLibrary`, `jogl`, `jawt`, or `load0`
5. **Clean room test**: Unpatched raw JAR also fails with `error_game_dll` — ASM injections are innocent

## The Fix (Two Parts)

### Part 1: NativeLoaderInjection.java

ASM injection that adds a command-10 handler to `f.run()`. Finds the `throw new Exception()` sentinel pattern and inserts before it:

```
BIPUSH 10
ILOAD 2          // command number variable
IF_ICMPNE throw  // not command 10 → fall through to original throw
GOTO success     // command 10 → jump to dl.f = 1 (success assignment)
```

This makes command 10 a no-op that reports success. The actual DLL loading is handled by Boot.class (see Part 2).

Pattern searched for (throw sentinel):
```
NEW java/lang/Exception
DUP
INVOKESPECIAL java/lang/Exception.<init>:()V
ATHROW
```

Pattern searched for (success target):
```
ALOAD_1          // class31 reference
ICONST_1         // success value
PUTFIELD dl.f:I  // anInt529 = 1
```

### Part 2: Boot.class Native Pre-Loading

The generated Boot.class (from NativeLibraryBundler) pre-loads all native DLLs before calling `client.main()`:

1. `Class.forName("java.awt.Toolkit")` — triggers AWT init, loads awt.dll (jawt.dll dependency)
2. `System.load(java.home + "/bin/jawt.dll")` — JDK's AWT-native bridge
3. `System.load("cache/runescape/jogl.dll")` — JOGL OpenGL bindings
4. `System.load("cache/runescape/jogl_awt.dll")` — JOGL AWT integration

Each wrapped in `try/catch(Throwable)` for resilience.

### Part 3: run.bat PATH Setup

```batch
setlocal EnableDelayedExpansion
for /f "delims=" %%i in ('where java') do set "JAVA_BIN=%%~dpi"
set "PATH=!JAVA_BIN!..\jre\bin;!PATH!"
```

`setlocal EnableDelayedExpansion` is required because `Program Files (x86)` contains parentheses that break cmd.exe's parser with standard `%VAR%` expansion.

## Key Lessons Learned

1. **Decompiled source doesn't always match the binary.** The JODE-decompiled Class43.java was from a different build. Always verify against actual bytecode with `javap`.

2. **Silent catch blocks hide root causes.** The `catch (Throwable) { anInt529 = 2; }` pattern silently swallowed exceptions. Our temporary DllDebugInjection (since removed) was essential to surface the real error.

3. **Pack200 clients are often browser-applet stubs.** The 2008 HD client expected native libraries to be loaded by the browser plugin. When run standalone, the DLL loading command simply doesn't exist.

4. **jawt.dll has a dependency chain.** On Adoptium JDK 8, jawt.dll depends on awt.dll (in jre/bin). Loading jawt before AWT initialization fails with "Can't find dependent libraries". Solution: trigger `Class.forName("java.awt.Toolkit")` first.

5. **JOGL's JAWTFactory has its own JNI bridge.** Even after jawt.dll is loaded, JOGL's `JAWTFactory.JAWT_GetAWT0` native method lives in jogl.dll, not jawt.dll. Both jogl.dll and jogl_awt.dll must be loaded for OpenGL to initialize.

## Related Files

- `src/injection/NativeLoaderInjection.java` — command-10 handler injection
- `src/injection/NativeLibraryBundler.java` — generates Boot.class, copies DLLs/libs
- `src/InjectionPipeline.java` — wires all injections together
- `3rd Party/client508/cache/runescape/` — source of native DLLs
- `3rd Party/client508/lib/hdlibs.jar` — JOGL 1.x Java bindings
