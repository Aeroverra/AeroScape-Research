import org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Decompiler
 *
 * Wraps the Vineflower decompiler library to programmatically decompile all
 * classes contained in a JAR file, writing individual .java source files into
 * the specified output directory.
 *
 * Vineflower (formerly Quiltflower) is a modern fork of FernFlower with
 * improved output quality for obfuscated bytecode.
 */
public final class Decompiler {

    private Decompiler() {
        // utility class - no instances
    }

    /**
     * Decompiles every class in {@code jarFile} and writes the resulting
     * .java source files into {@code outputDir}.
     *
     * @param jarFile   the JAR whose classes will be decompiled
     * @param outputDir directory where .java files will be written
     * @throws Exception if Vineflower encounters a fatal error
     */
    public static void decompile(File jarFile, File outputDir) throws Exception {
        System.out.println("[Decompiler] Decompiling with Vineflower: " + jarFile.getName() + " ...");
        System.out.println("[Decompiler] Output directory            : " + outputDir.getAbsolutePath());

        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        // ── Build Vineflower CLI args ─────────────────────────────────────────
        List<String> args = new ArrayList<String>();

        // Do NOT rename identifiers - we want the obfuscated names as-is
        args.add("-ren=0");

        // Decompile inner classes
        args.add("-din=1");

        // Decompile generic signatures
        args.add("-dgs=1");

        // Keep bridge methods visible (useful for obfuscated code analysis)
        args.add("-rbr=0");

        // Keep synthetic members visible
        args.add("-rsy=0");

        // Suppress the Vineflower banner comment
        args.add("-ban=");

        // Decode finally blocks
        args.add("-fdi=1");

        // Source JAR and output directory
        args.add(jarFile.getAbsolutePath());
        args.add(outputDir.getAbsolutePath());

        // ── Run Vineflower via its public CLI entry point ─────────────────────
        ConsoleDecompiler.main(args.toArray(new String[0]));

        System.out.println("[Decompiler] Decompilation complete.");
    }
}
