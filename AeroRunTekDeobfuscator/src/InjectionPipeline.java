import injection.InjectionContext;
import injection.IpRedirectInjection;
import injection.IsaacBypassInjection;
import injection.JarLoader;
import injection.JarRepackager;
import injection.RsaLobotomyInjection;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Phase 2: ASM Injection Pipeline
 *
 * Reads the original client JAR, applies pattern-matched bytecode modifications
 * (RSA bypass and IP redirect), and outputs a new runnable JAR.
 *
 * Output goes to: output/{baseName}_Injection/{baseName}_patched.jar
 * Does not interfere with Step 1 decompiled source output.
 */
public final class InjectionPipeline {

    private InjectionPipeline() {
    }

    /**
     * Runs the full injection pipeline on the given JAR.
     *
     * @param jarFile    the unpacked client JAR to patch
     * @param outputRoot the root output directory (e.g. "output")
     * @param baseName   the base name of the client (e.g. "508sd")
     * @return true if the pipeline completed successfully
     */
    public static boolean run(File jarFile, File outputRoot, String baseName) throws IOException {
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("  Phase 2: ASM Injection Pipeline");
        System.out.println("-------------------------------------------------");

        // Create injection output directory
        File injectionDir = new File(outputRoot, baseName + "_Injection");
        if (!injectionDir.exists() && !injectionDir.mkdirs()) {
            System.err.println("[InjectionPipeline] Failed to create directory: "
                    + injectionDir.getAbsolutePath());
            return false;
        }

        // Step 1: Load all classes from the JAR
        InjectionContext ctx = JarLoader.load(jarFile);

        if (ctx.classes.isEmpty()) {
            System.err.println("[InjectionPipeline] No classes found in JAR.");
            return false;
        }

        // Step 2: Apply RSA Lobotomy
        int rsaPatches = RsaLobotomyInjection.apply(ctx);

        // Step 3: Apply IP Redirect
        int ipPatches = IpRedirectInjection.apply(ctx);

        // Step 4: Apply ISAAC Cipher Bypass
        int isaacPatches = IsaacBypassInjection.apply(ctx);

        // Step 5: Detect main class and repackage
        String mainClass = JarRepackager.detectMainClass(ctx);
        File outputJar = new File(injectionDir, baseName + "_patched.jar");
        JarRepackager.repack(jarFile, ctx, outputJar, mainClass);

        // Step 6: Generate run.bat
        generateRunBat(injectionDir, outputJar.getName(), mainClass);

        // Summary
        System.out.println();
        System.out.println("[InjectionPipeline] ======= Injection Summary =======");
        System.out.println("[InjectionPipeline] RSA patches applied   : " + rsaPatches);
        System.out.println("[InjectionPipeline] IP patches applied    : " + ipPatches);
        System.out.println("[InjectionPipeline] ISAAC patches applied : " + isaacPatches);
        System.out.println("[InjectionPipeline] Output JAR          : " + outputJar.getAbsolutePath());
        System.out.println("[InjectionPipeline] Main-Class          : " + mainClass);
        System.out.println("[InjectionPipeline] ================================");

        return true;
    }

    /**
     * Generates a run.bat in the injection output directory that launches the
     * patched JAR with the standard RS 508 boot arguments.
     */
    private static void generateRunBat(File dir, String jarName, String mainClass) throws IOException {
        File runBat = new File(dir, "run.bat");
        BufferedWriter w = null;
        try {
            w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(runBat), "UTF-8"));
            w.write("@echo off\r\n");
            w.write("echo Launching patched RS 508 client...\r\n");
            w.write("java -jar \"" + jarName + "\" 1 live live software members english game0\r\n");
            w.write("pause\r\n");
        } finally {
            if (w != null) {
                try { w.close(); } catch (IOException ignored) { }
            }
        }
        System.out.println("[InjectionPipeline] Written: run.bat");
    }
}
