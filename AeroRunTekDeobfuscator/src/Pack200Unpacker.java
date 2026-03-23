import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;

/**
 * Pack200Unpacker
 *
 * Handles conversion of .pack200 / .packclass files into standard JAR files
 * using the native Java 8 {@link Pack200} API.
 *
 * If the input is already a plain JAR file it is returned unchanged.
 */
public final class Pack200Unpacker {

    private Pack200Unpacker() {
        // utility class - no instances
    }

    /**
     * Given an input file that is either a .jar, .pack200, or .packclass,
     * returns a {@link File} pointing at a valid JAR.
     *
     * <ul>
     *   <li>For .jar files: returns the input file directly (no copy made).</li>
     *   <li>For .pack200/.packclass files: unpacks to a temporary .jar in the
     *       system temp directory and returns that temp file.  The caller is
     *       responsible for deleting the temp file when it is no longer needed.</li>
     * </ul>
     *
     * @param input the input file (.jar, .pack200, or .packclass)
     * @return a File pointing at a standard JAR
     * @throws IOException              if I/O fails during unpacking
     * @throws IllegalArgumentException if the file extension is not recognised
     */
    public static File unpack(File input) throws IOException {
        String name = input.getName().toLowerCase();

        if (name.endsWith(".jar")) {
            // Already a JAR - nothing to do.
            System.out.println("[Pack200Unpacker] Input is a JAR file, skipping unpack.");
            return input;
        }

        if (name.endsWith(".pack200") || name.endsWith(".packclass") || name.endsWith(".pack")) {
            return unpackPack200(input);
        }

        throw new IllegalArgumentException(
                "Unsupported input format: '" + input.getName() + "'. " +
                "Expected .jar, .pack200, or .packclass"
        );
    }

    /**
     * Performs the actual Pack200 -> JAR conversion.
     *
     * @param packFile the .pack200 / .packclass source file
     * @return a temporary JAR file containing the unpacked contents
     * @throws IOException if reading or writing fails
     */
    private static File unpackPack200(File packFile) throws IOException {
        System.out.println("[Pack200Unpacker] Unpacking pack200: " + packFile.getName() + " ...");

        // Create a temp file that will hold the resulting JAR.
        File tempJar = File.createTempFile("aerodeob_", ".jar");
        // Do NOT deleteOnExit here - Main.java handles cleanup so it can use
        // the file for subsequent pipeline steps.

        Pack200.Unpacker unpacker = Pack200.newUnpacker();

        // Recommended properties for reliable unpacking
        unpacker.properties().put(Pack200.Unpacker.DEFLATE_HINT, Pack200.Unpacker.FALSE);

        InputStream  in  = null;
        OutputStream out = null;
        JarOutputStream jos = null;

        try {
            in  = new java.io.FileInputStream(packFile);
            out = new FileOutputStream(tempJar);
            jos = new JarOutputStream(out);

            unpacker.unpack(in, jos);

            jos.finish();
            System.out.println("[Pack200Unpacker] Unpacked to temporary JAR: " + tempJar.getAbsolutePath());
            return tempJar;

        } catch (IOException e) {
            // Attempt to clean up the incomplete temp file before propagating.
            safeDelete(tempJar);
            throw new IOException("Failed to unpack pack200 file '" + packFile.getName() + "': " + e.getMessage(), e);
        } finally {
            closeQuietly(jos);
            closeQuietly(out);
            closeQuietly(in);
        }
    }

    // ── Helpers ───────────────────────────────────────────────────────────────

    private static void closeQuietly(InputStream s) {
        if (s != null) {
            try { s.close(); } catch (IOException ignored) { /* best-effort */ }
        }
    }

    private static void closeQuietly(OutputStream s) {
        if (s != null) {
            try { s.close(); } catch (IOException ignored) { /* best-effort */ }
        }
    }

    private static void safeDelete(File f) {
        if (f != null && f.exists()) {
            //noinspection ResultOfMethodCallIgnored
            f.delete();
        }
    }
}
