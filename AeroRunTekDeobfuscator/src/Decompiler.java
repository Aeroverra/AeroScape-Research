import org.benf.cfr.reader.api.CfrDriver;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Decompiler
 *
 * Wraps the CFR decompiler library to programmatically decompile all classes
 * contained in a JAR file, writing individual .java source files into the
 * specified output directory.
 *
 * CFR version: 0.152  (last release with full Java 8 class-file support)
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
     * @throws Exception if CFR encounters a fatal error
     */
    public static void decompile(File jarFile, File outputDir) throws Exception {
        System.out.println("[Decompiler] Decompiling with CFR: " + jarFile.getName() + " ...");
        System.out.println("[Decompiler] Output directory    : " + outputDir.getAbsolutePath());

        // ── Build CFR options ─────────────────────────────────────────────────
        Map<String, String> options = new HashMap<String, String>();

        // Write decompiled sources to disk
        options.put("outputdir", outputDir.getAbsolutePath());

        // Do NOT rename identifiers - we want the obfuscated names as-is
        options.put("renameillegalidents", "false");

        // Keep all boilerplate (constructors, default methods, etc.)
        options.put("removeboilerplate", "false");

        // Enable recovery mode so CFR tries its best on obfuscated bytecode
        options.put("recover", "true");

        // Suppress the CFR version header comment
        options.put("showversion", "false");

        // Keep inner class information consistent
        options.put("decodefinally", "true");

        // ── Run CFR (using default file-writing sink) ─────────────────────────
        CfrDriver driver = new CfrDriver.Builder()
                .withOptions(options)
                .build();

        // Pass the JAR path; CFR decompiles all classes it finds inside.
        driver.analyse(Collections.singletonList(jarFile.getAbsolutePath()));

        System.out.println("[Decompiler] Decompilation complete.");
    }
}
