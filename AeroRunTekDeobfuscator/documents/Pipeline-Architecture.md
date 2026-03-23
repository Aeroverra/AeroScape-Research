# AeroRunTekDeobfuscator Pipeline Architecture

## Date: 2026-03-24

## Overview

The deobfuscator processes RuneScape 508 client `.pack200` files through an automated pipeline that unpacks, decompiles, patches, and produces a self-contained runnable client.

## Pipeline Flow

```
Input:  input/508hd.pack200
  |
  v
[Pack200Unpacker] ---- org.glavo:pack200:0.3.0 (standalone, JDK 25 compatible)
  |                     Detects raw pack200 (magic 0xCAFED00D) or Jagex JS5
  |                     container (8-byte header + raw deflate). Outputs temp JAR.
  v
[Phase 1: Decompilation] ---- Vineflower 1.11.0
  |                           Output: output/{baseName}/ with .java source files
  v
[Phase 2: ASM Injection Pipeline]
  |
  |-- Step 1: JarLoader ---- Loads all .class files into InjectionContext
  |-- Step 2: RsaLobotomyInjection ---- Bypasses BigInteger.modPow RSA encryption
  |-- Step 3: IpRedirectInjection ---- Scans for hardcoded server IPs/hostnames
  |-- Step 4: IsaacBypassInjection ---- Removes ISAAC cipher opcode encryption
  |-- Step 5: NativeLoaderInjection ---- Adds command-10 handler to f.run()
  |-- Step 6: JarRepackager ---- Writes patched JAR with MANIFEST.MF
  |-- Step 7: NativeLibraryBundler ---- Copies DLLs, hdlibs.jar, generates Boot.class
  |-- Step 8: generateRunBat ---- Creates run.bat launcher
  |
  v
Output: output/{baseName}_Injection/
  |- {baseName}_patched.jar    Patched client JAR
  |- Boot.class                Entry point (pre-loads natives, launches client)
  |- run.bat                   Launcher (sets PATH for JRE deps)
  |- cache/runescape/          Native DLLs (jogl.dll, jogl_awt.dll, browsercontrol.dll)
  |- lib/hdlibs.jar            JOGL 1.x Java bindings
```

## Injection Details

### RsaLobotomyInjection (2 patches)
- Scans for `BigInteger.modPow()` calls
- Replaces RSA-encrypted data with raw unencrypted bytes
- Allows the client to connect without Jagex's RSA keys

### IpRedirectInjection (0 patches in current build)
- Scans for IP address patterns and hostname strings near `InetAddress.getByName`/`Socket.<init>`
- Would redirect connections to a custom server IP
- No hardcoded IPs found in this pack200 build

### IsaacBypassInjection (2 patches)
- Finds ISAAC cipher usage pattern: `GETFIELD isaacField; INVOKEVIRTUAL nextValue; INEG; IADD`
- Removes the ISAAC XOR from incoming packet opcodes
- Allows unencrypted packet communication with the server

### NativeLoaderInjection (1 patch)
- Finds class `f` (Class43) by: implements Runnable + has File field
- Locates `throw new Exception()` sentinel in run() method
- Inserts command-10 check before the throw: if i==10, jump to success
- Boot.class handles actual DLL loading, so this is a no-op success handler

### NativeLibraryBundler
- Searches project tree for DLLs and hdlibs.jar (excludes output directory)
- Copies to injection output with correct directory structure
- Generates Boot.class using ASM with native pre-loading logic

## Build Requirements

- JDK 25 (pipeline compilation and execution)
- JDK 8 32-bit (client execution — DLLs are PE32 i386)
- Maven (build system, dependencies in pom.xml)

## Dependencies (pom.xml)

- `org.vineflower:vineflower:1.11.0` — Java decompiler
- `org.ow2.asm:asm:9.7.1` — bytecode manipulation
- `org.ow2.asm:asm-tree:9.7.1` — ASM tree API
- `org.glavo:pack200:0.3.0` — standalone Pack200 unpacker (JDK 14+ compatible)

## Class Mapping (Pack200 → Decompiled)

Key obfuscated class names in the pack200 JAR:

| Obfuscated | Original (from JODE source) | Purpose |
|------------|---------------------------|---------|
| f | Class43 | Worker thread, command dispatcher |
| dl | Class31 | Command data (command number, args, result) |
| pb | Applet_Sub1 | Applet base class, error handling |
| client | client | Main client class, entry point |
| e | (network) | Packet I/O, ISAAC cipher usage |
| k | (crypto) | RSA BigInteger operations |
| sh | Class121 | OpenGL initialization (JOGL) |
| di | Class30 | File I/O (cache, random access) |

Note: The JODE-decompiled source in `3rd Party/client508/src/` is from a DIFFERENT build
than the pack200 file. Do not assume 1:1 correspondence between source and bytecode.
