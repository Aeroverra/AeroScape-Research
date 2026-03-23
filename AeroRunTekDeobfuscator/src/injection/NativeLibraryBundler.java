package injection;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Searches the project tree for the native DLLs and hdlibs.jar required by
 * the 508 HD client, copies them into the injection output directory, and
 * generates a Boot.class entry point.
 *
 * The 508 client loads native DLLs via Runtime.load0() using absolute paths
 * constructed from its cache directory: ./cache/runescape/. The DLLs must
 * be placed there — java.library.path has no effect.
 */
public final class NativeLibraryBundler {

    private static final String[] NATIVE_DLLS = { "jogl.dll", "jogl_awt.dll", "browsercontrol.dll" };
    private static final String HDLIBS_NAME = "hdlibs.jar";
    /** The client resolves its cache (and DLL) directory to ./cache/runescape/ */
    private static final String CACHE_SUBDIR = "cache/runescape";

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
        System.out.println("[NativeLibraryBundler] Searching for native libraries and hdlibs.jar ...");

        File projectRoot = findProjectRoot(injectionDir);
        System.out.println("[NativeLibraryBundler] Project root: " + projectRoot.getAbsolutePath());

        // --- Find and copy native DLLs to cache/runescape/ ---
        // The client loads DLLs via Runtime.load0() with absolute paths from
        // ./cache/runescape/ — java.library.path is not used.
        File cacheDir = new File(injectionDir, CACHE_SUBDIR);
        if (!cacheDir.exists() && !cacheDir.mkdirs()) {
            System.err.println("[NativeLibraryBundler] Failed to create cache directory: "
                    + cacheDir.getAbsolutePath());
            return false;
        }

        int dllsCopied = 0;
        for (String dllName : NATIVE_DLLS) {
            File found = findFile(projectRoot, dllName, injectionDir);
            if (found != null) {
                File dest = new File(cacheDir, dllName);
                copyFile(found, dest);
                System.out.println("[NativeLibraryBundler] Copied: " + CACHE_SUBDIR + "/" + dllName
                        + " <- " + found.getAbsolutePath());
                dllsCopied++;
            } else {
                System.err.println("[NativeLibraryBundler] WARNING: Could not find " + dllName);
            }
        }

        // --- Find and copy hdlibs.jar ---
        File libDir = new File(injectionDir, "lib");
        if (!libDir.exists() && !libDir.mkdirs()) {
            System.err.println("[NativeLibraryBundler] Failed to create lib directory.");
            return false;
        }

        boolean hdlibsCopied = false;
        File hdlibs = findFile(projectRoot, HDLIBS_NAME, injectionDir);
        if (hdlibs != null) {
            File dest = new File(libDir, HDLIBS_NAME);
            copyFile(hdlibs, dest);
            System.out.println("[NativeLibraryBundler] Copied: lib/" + HDLIBS_NAME
                    + " <- " + hdlibs.getAbsolutePath());
            hdlibsCopied = true;
        } else {
            System.err.println("[NativeLibraryBundler] WARNING: Could not find " + HDLIBS_NAME);
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
     * Walks up from the given directory to find the project root
     * (the directory containing "3rd Party" or the git root).
     */
    private static File findProjectRoot(File startDir) {
        File dir = startDir.getAbsoluteFile();
        while (dir != null) {
            if (new File(dir, "3rd Party").isDirectory() || new File(dir, ".git").exists()) {
                return dir;
            }
            dir = dir.getParentFile();
        }
        return new File(".").getAbsoluteFile().getParentFile();
    }

    /**
     * Recursively searches for a file by name under the given root.
     * Returns the first match found, or null.
     */
    private static File findFile(File root, String fileName) {
        return findFile(root, fileName, null);
    }

    /**
     * Recursively searches for a file by name under the given root,
     * skipping the excludeDir (to avoid finding our own output).
     * Only returns files with non-zero size.
     */
    private static File findFile(File root, String fileName, File excludeDir) {
        List<File> stack = new ArrayList<>();
        stack.add(root);

        String excludePath = excludeDir != null ? excludeDir.getAbsolutePath() : null;

        while (!stack.isEmpty()) {
            File dir = stack.remove(stack.size() - 1);
            File[] children = dir.listFiles();
            if (children == null) continue;

            for (File child : children) {
                if (child.isFile()
                        && child.getName().equalsIgnoreCase(fileName)
                        && child.length() > 0) {
                    return child;
                }
                if (child.isDirectory()
                        && !child.getName().equals(".git")
                        && !child.getName().equals("target")
                        && !child.getName().equals("node_modules")) {
                    if (excludePath != null
                            && child.getAbsolutePath().equals(excludePath)) {
                        continue;
                    }
                    stack.add(child);
                }
            }
        }
        return null;
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
     *         // Pre-load jawt.dll explicitly from java.home/bin so the client's
     *         // command-10 handler (patched to a no-op) never needs to do it.
     *         try {
     *             String javaHome = System.getProperty("java.home");
     *             System.load(javaHome + "/bin/jawt.dll");
     *         } catch (Throwable ignored) { }
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

        // --- Block 3 & 4: Load jogl.dll and jogl_awt.dll from cache/runescape ---
        String[] joglDlls = { "jogl.dll", "jogl_awt.dll" };
        for (String dll : joglDlls) {
            org.objectweb.asm.Label tryStart = new org.objectweb.asm.Label();
            org.objectweb.asm.Label tryEnd = new org.objectweb.asm.Label();
            org.objectweb.asm.Label catchLabel = new org.objectweb.asm.Label();
            org.objectweb.asm.Label afterLabel = new org.objectweb.asm.Label();

            mv.visitTryCatchBlock(tryStart, tryEnd, catchLabel, "java/lang/Throwable");
            mv.visitLabel(tryStart);
            // new File("cache" + File.separator + "runescape", dll).getAbsolutePath()
            mv.visitTypeInsn(Opcodes.NEW, "java/io/File");
            mv.visitInsn(Opcodes.DUP);
            mv.visitLdcInsn("cache/runescape");
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
