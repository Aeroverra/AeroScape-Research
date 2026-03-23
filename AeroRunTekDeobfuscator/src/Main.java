import java.io.File;
import java.io.IOException;

/**
 * AeroRunTekDeobfuscator - Pipeline Entry Point
 *
 * Scans the "input" folder for .jar / .pack200 / .packclass files and processes
 * each one. Output goes to "output/{jarName}/" as a subfolder per JAR.
 *
 * No arguments needed - just drop JARs into the input/ folder and run.
 */
public class Main {

    private static final String INPUT_DIR = "input";
    private static final String OUTPUT_DIR = "output";

    private static boolean skipDecompile = false;

    public static void main(String[] args) {
        // Parse flags
        for (String arg : args) {
            if ("--skip-decompile".equals(arg)) {
                skipDecompile = true;
            }
        }

        File inputDir = new File(INPUT_DIR);
        File outputRoot = new File(OUTPUT_DIR);

        if (!inputDir.exists()) {
            inputDir.mkdirs();
            System.out.println("[INFO] Created input directory: " + inputDir.getAbsolutePath());
            System.out.println("[INFO] Place .jar, .pack200, or .packclass files in the input/ folder and run again.");
            return;
        }

        File[] files = inputDir.listFiles(new java.io.FileFilter() {
            @Override
            public boolean accept(File f) {
                if (!f.isFile()) return false;
                String name = f.getName().toLowerCase();
                return name.endsWith(".jar") || name.endsWith(".pack200")
                        || name.endsWith(".packclass") || name.endsWith(".pack");
            }
        });

        if (files == null || files.length == 0) {
            System.out.println("[INFO] No .jar / .pack200 / .packclass files found in: " + inputDir.getAbsolutePath());
            System.out.println("[INFO] Place client files in the input/ folder and run again.");
            return;
        }

        System.out.println("=================================================");
        System.out.println("  AeroRunTekDeobfuscator - RuneTek 4 Client Pipeline");
        System.out.println("=================================================");
        System.out.println("  Found " + files.length + " file(s) in input/");
        System.out.println("-------------------------------------------------");

        int success = 0;
        for (File inputFile : files) {
            String baseName = stripExtension(inputFile.getName());
            File outputDir = new File(outputRoot, baseName);

            System.out.println();
            System.out.println("[" + inputFile.getName() + "] Processing...");

            if (!outputDir.exists() && !outputDir.mkdirs()) {
                System.err.println("[ERROR] Could not create output directory: " + outputDir.getAbsolutePath());
                continue;
            }

            if (processFile(inputFile, outputDir)) {
                success++;
            }
        }

        System.out.println();
        System.out.println("=================================================");
        System.out.println("[DONE] Processed " + success + "/" + files.length + " file(s).");
        System.out.println("       Output -> " + outputRoot.getAbsolutePath());
        System.out.println("=================================================");
    }

    private static boolean processFile(File inputFile, File outputDir) {
        String baseName = stripExtension(inputFile.getName());
        // Step 1: Unpack pack200 if needed
        File jarFile;
        try {
            jarFile = Pack200Unpacker.unpack(inputFile);
        } catch (IOException e) {
            System.err.println("[ERROR] Pack200 unpacking failed: " + e.getMessage());
            e.printStackTrace(System.err);
            return false;
        }

        if (!skipDecompile) {
            // Step 2: Decompile with Vineflower
            try {
                Decompiler.decompile(jarFile, outputDir);
            } catch (Exception e) {
                System.err.println("[ERROR] Decompilation failed: " + e.getMessage());
                e.printStackTrace(System.err);
                cleanupTemp(jarFile, inputFile);
                return false;
            }

            // Step 3: Copy JAR into output so the wrapper can reference it
            String jarName = baseName + ".jar";
            File outputJar = new File(outputDir, jarName);
            try {
                copyFile(jarFile, outputJar);
                System.out.println("[INFO] Client JAR copied to: " + outputJar.getAbsolutePath());
            } catch (IOException e) {
                System.err.println("[ERROR] Failed to copy JAR to output: " + e.getMessage());
                cleanupTemp(jarFile, inputFile);
                return false;
            }

            // Step 4: Generate wrapper
            try {
                WrapperGenerator.generate(outputDir, outputJar);
            } catch (IOException e) {
                System.err.println("[ERROR] Wrapper generation failed: " + e.getMessage());
                e.printStackTrace(System.err);
                cleanupTemp(jarFile, inputFile);
                return false;
            }
        } else {
            System.out.println("[INFO] Skipping decompilation (--skip-decompile).");
        }

        // Phase 2: ASM Injection Pipeline (parallel output, does not affect Step 1)
        try {
            InjectionPipeline.run(jarFile, outputDir.getParentFile(), baseName);
        } catch (Exception e) {
            System.err.println("[WARN] Injection pipeline failed (non-fatal): " + e.getMessage());
            e.printStackTrace(System.err);
        }

        cleanupTemp(jarFile, inputFile);

        System.out.println("[" + inputFile.getName() + "] Done -> " + outputDir.getAbsolutePath());
        return true;
    }

    private static void cleanupTemp(File jarFile, File originalInput) {
        if (jarFile != null && !jarFile.getAbsolutePath().equals(originalInput.getAbsolutePath())) {
            if (jarFile.delete()) {
                System.out.println("[INFO] Temporary JAR removed.");
            }
        }
    }

    private static void copyFile(File src, File dst) throws IOException {
        java.io.FileInputStream fis = null;
        java.io.FileOutputStream fos = null;
        try {
            fis = new java.io.FileInputStream(src);
            fos = new java.io.FileOutputStream(dst);
            byte[] buf = new byte[8192];
            int n;
            while ((n = fis.read(buf)) > 0) {
                fos.write(buf, 0, n);
            }
        } finally {
            if (fis != null) try { fis.close(); } catch (IOException ignored) {}
            if (fos != null) try { fos.close(); } catch (IOException ignored) {}
        }
    }

    private static String stripExtension(String filename) {
        // Handle double extensions like .pack200
        if (filename.toLowerCase().endsWith(".pack200")) {
            return filename.substring(0, filename.length() - ".pack200".length());
        }
        int dot = filename.lastIndexOf('.');
        return dot > 0 ? filename.substring(0, dot) : filename;
    }
}
