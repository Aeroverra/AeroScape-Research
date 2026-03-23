package injection;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Copies the native DLLs and hdlibs.jar from the deobfuscator's own lib/
 * directory into the injection output, and generates a Boot.class entry point
 * that pre-loads them before launching the client.
 *
 * Source locations (relative to deobfuscator root):
 *   lib/jogl.dll, jogl_awt.dll, browsercontrol.dll, hdlibs.jar
 *
 * Output layout (inside injectionDir):
 *   lib/*.dll, lib/hdlibs.jar
 *   Boot.class
 */
public final class NativeLibraryBundler {

    private static final String[] NATIVE_DLLS = { "jogl.dll", "jogl_awt.dll", "browsercontrol.dll" };
    private static final String HDLIBS_NAME = "hdlibs.jar";

    private NativeLibraryBundler() {
    }

    /**
     * Bundles native libraries, hdlibs.jar, and Boot.class into the injection
     * output directory.
     *
     * @param injectionDir the injection output directory (e.g. output/508hd_Injection)
     * @param mainClass    the client main class name (e.g. "client")
     * @return true if all required files were found and copied
     */
    public static boolean bundle(File injectionDir, String mainClass) throws IOException {
        System.out.println();
        System.out.println("[NativeLibraryBundler] Bundling native libraries and hdlibs.jar ...");

        // Source: deobfuscator's own lib/ directory (next to src/, input/, output/)
        File deobRoot = new File(".").getAbsoluteFile().getParentFile();
        File srcLibDir = new File(deobRoot, "lib");

        // Destination: injectionDir/lib/
        File dstLibDir = new File(injectionDir, "lib");
        if (!dstLibDir.exists() && !dstLibDir.mkdirs()) {
            System.err.println("[NativeLibraryBundler] Failed to create: " + dstLibDir.getAbsolutePath());
            return false;
        }

        // --- Copy native DLLs ---
        int dllsCopied = 0;
        for (String dllName : NATIVE_DLLS) {
            File src = new File(srcLibDir, dllName);
            if (src.isFile() && src.length() > 0) {
                copyFile(src, new File(dstLibDir, dllName));
                System.out.println("[NativeLibraryBundler] Copied: lib/" + dllName);
                dllsCopied++;
            } else {
                System.err.println("[NativeLibraryBundler] WARNING: Not found: " + src.getAbsolutePath());
            }
        }

        // --- Copy hdlibs.jar ---
        boolean hdlibsCopied = false;
        File srcHdlibs = new File(srcLibDir, HDLIBS_NAME);
        if (srcHdlibs.isFile() && srcHdlibs.length() > 0) {
            copyFile(srcHdlibs, new File(dstLibDir, HDLIBS_NAME));
            System.out.println("[NativeLibraryBundler] Copied: lib/" + HDLIBS_NAME);
            hdlibsCopied = true;
        } else {
            System.err.println("[NativeLibraryBundler] WARNING: Not found: " + srcHdlibs.getAbsolutePath());
        }

        // --- Generate Boot.class ---
        byte[] bootClass = generateBootClass(mainClass);
        File bootFile = new File(injectionDir, "Boot.class");
        FileOutputStream fos = new FileOutputStream(bootFile);
        try {
            fos.write(bootClass);
        } finally {
            fos.close();
        }
        System.out.println("[NativeLibraryBundler] Generated: Boot.class (entry point -> " + mainClass + ")");

        System.out.println("[NativeLibraryBundler] Bundled " + dllsCopied + " DLLs, "
                + (hdlibsCopied ? "1" : "0") + " lib JARs, 1 Boot.class");

        return dllsCopied == NATIVE_DLLS.length && hdlibsCopied;
    }

    /**
     * Generates Boot.class bytecode using ASM. Equivalent to:
     *
     * <pre>
     * public class Boot {
     *     public static void main(String[] args) {
     *         // Force AWT native library initialisation (loads awt.dll + jawt.dll)
     *         // before the client's DLL-loading state machine runs.
     *         // The forName call is wrapped in try/catch so that headless
     *         // environments (where AWT is unavailable) don't abort the launch.
     *         try {
     *             Class.forName("java.awt.Toolkit");
     *         } catch (Throwable ignored) { }
     *
     *         // Pre-load jawt.dll from java.home/bin
     *         try { System.load(System.getProperty("java.home") + "/bin/jawt.dll"); }
     *         catch (Throwable ignored) { }
     *
     *         // Pre-load JOGL natives from lib/
     *         try { System.load(new File("lib", "jogl.dll").getAbsolutePath()); }
     *         catch (Throwable ignored) { }
     *         try { System.load(new File("lib", "jogl_awt.dll").getAbsolutePath()); }
     *         catch (Throwable ignored) { }
     *
     *         client.main(new String[]{"1", "live", "live", "software", "members", "english", "game0"});
     *     }
     * }
     * </pre>
     */
    private static byte[] generateBootClass(String mainClass) {
        ClassWriter cw = new ClassWriter(ClassWriter.COMPUTE_FRAMES | ClassWriter.COMPUTE_MAXS);
        cw.visit(Opcodes.V1_8, Opcodes.ACC_PUBLIC | Opcodes.ACC_SUPER,
                "Boot", null, "java/lang/Object", null);

        // Default constructor
        MethodVisitor init = cw.visitMethod(Opcodes.ACC_PUBLIC, "<init>", "()V", null, null);
        init.visitCode();
        init.visitVarInsn(Opcodes.ALOAD, 0);
        init.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
        init.visitInsn(Opcodes.RETURN);
        init.visitMaxs(0, 0);
        init.visitEnd();

        // public static void main(String[] args)
        MethodVisitor mv = cw.visitMethod(
                Opcodes.ACC_PUBLIC | Opcodes.ACC_STATIC,
                "main", "([Ljava/lang/String;)V", null, null);
        mv.visitCode();

        // --- Block 1: Class.forName("java.awt.Toolkit") in try/catch(Throwable) ---
        // This triggers the JVM's AWT native initialisation chain, which loads
        // awt.dll (and implicitly jawt.dll on some JREs) from java.home/bin.
        org.objectweb.asm.Label tryAwtStart  = new org.objectweb.asm.Label();
        org.objectweb.asm.Label tryAwtEnd    = new org.objectweb.asm.Label();
        org.objectweb.asm.Label catchAwtStart = new org.objectweb.asm.Label();
        org.objectweb.asm.Label afterAwtBlock = new org.objectweb.asm.Label();

        mv.visitTryCatchBlock(tryAwtStart, tryAwtEnd, catchAwtStart, "java/lang/Throwable");

        mv.visitLabel(tryAwtStart);
        mv.visitLdcInsn("java.awt.Toolkit");
        mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                "java/lang/Class", "forName",
                "(Ljava/lang/String;)Ljava/lang/Class;", false);
        mv.visitInsn(Opcodes.POP); // discard the Class object
        mv.visitLabel(tryAwtEnd);
        mv.visitJumpInsn(Opcodes.GOTO, afterAwtBlock);

        mv.visitLabel(catchAwtStart);
        mv.visitInsn(Opcodes.POP); // discard Throwable
        mv.visitLabel(afterAwtBlock);

        // --- Block 2: System.load(java.home + "/bin/jawt.dll") in try/catch(Throwable) ---
        // Explicitly loads jawt.dll using the full path.  Wrapped in try/catch
        // because it may already have been loaded by Block 1, or may not exist on
        // non-Windows platforms.
        org.objectweb.asm.Label tryJawtStart  = new org.objectweb.asm.Label();
        org.objectweb.asm.Label tryJawtEnd    = new org.objectweb.asm.Label();
        org.objectweb.asm.Label catchJawtStart = new org.objectweb.asm.Label();
        org.objectweb.asm.Label afterJawtBlock = new org.objectweb.asm.Label();

        mv.visitTryCatchBlock(tryJawtStart, tryJawtEnd, catchJawtStart, "java/lang/Throwable");

        mv.visitLabel(tryJawtStart);
        // javaHome = System.getProperty("java.home")
        mv.visitLdcInsn("java.home");
        mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                "java/lang/System", "getProperty",
                "(Ljava/lang/String;)Ljava/lang/String;", false);
        // jawtPath = javaHome + "/bin/jawt.dll"
        mv.visitLdcInsn("/bin/jawt.dll");
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL,
                "java/lang/String", "concat",
                "(Ljava/lang/String;)Ljava/lang/String;", false);
        // System.load(jawtPath)
        mv.visitMethodInsn(Opcodes.INVOKESTATIC,
                "java/lang/System", "load",
                "(Ljava/lang/String;)V", false);
        mv.visitLabel(tryJawtEnd);
        mv.visitJumpInsn(Opcodes.GOTO, afterJawtBlock);

        mv.visitLabel(catchJawtStart);
        mv.visitInsn(Opcodes.POP); // discard Throwable (already loaded, or not Windows)
        mv.visitLabel(afterJawtBlock);

        // --- Block 3 & 4: Load jogl.dll and jogl_awt.dll from lib/ ---
        String[] joglDlls = { "jogl.dll", "jogl_awt.dll" };
        for (String dll : joglDlls) {
            org.objectweb.asm.Label tryStart = new org.objectweb.asm.Label();
            org.objectweb.asm.Label tryEnd = new org.objectweb.asm.Label();
            org.objectweb.asm.Label catchLabel = new org.objectweb.asm.Label();
            org.objectweb.asm.Label afterLabel = new org.objectweb.asm.Label();

            mv.visitTryCatchBlock(tryStart, tryEnd, catchLabel, "java/lang/Throwable");
            mv.visitLabel(tryStart);
            // new File("lib", dll).getAbsolutePath()
            mv.visitTypeInsn(Opcodes.NEW, "java/io/File");
            mv.visitInsn(Opcodes.DUP);
            mv.visitLdcInsn("lib");
            mv.visitLdcInsn(dll);
            mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/io/File", "<init>",
                    "(Ljava/lang/String;Ljava/lang/String;)V", false);
            mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/io/File", "getAbsolutePath",
                    "()Ljava/lang/String;", false);
            mv.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/System", "load",
                    "(Ljava/lang/String;)V", false);
            mv.visitLabel(tryEnd);
            mv.visitJumpInsn(Opcodes.GOTO, afterLabel);
            mv.visitLabel(catchLabel);
            mv.visitInsn(Opcodes.POP);
            mv.visitLabel(afterLabel);
        }

        // --- Block 5: Launch the client ---
        mv.visitIntInsn(Opcodes.BIPUSH, 7);
        mv.visitTypeInsn(Opcodes.ANEWARRAY, "java/lang/String");

        String[] bootArgs = { "1", "live", "live", "software", "members", "english", "game0" };
        for (int i = 0; i < bootArgs.length; i++) {
            mv.visitInsn(Opcodes.DUP);
            mv.visitIntInsn(Opcodes.BIPUSH, i);
            mv.visitLdcInsn(bootArgs[i]);
            mv.visitInsn(Opcodes.AASTORE);
        }

        mv.visitMethodInsn(Opcodes.INVOKESTATIC, mainClass, "main",
                "([Ljava/lang/String;)V", false);

        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();

        cw.visitEnd();
        return cw.toByteArray();
    }

    private static void copyFile(File src, File dst) throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dst);
            byte[] buf = new byte[8192];
            int n;
            while ((n = fis.read(buf)) > 0) {
                fos.write(buf, 0, n);
            }
        } finally {
            if (fis != null) try { fis.close(); } catch (IOException ignored) { }
            if (fos != null) try { fos.close(); } catch (IOException ignored) { }
        }
    }
}
