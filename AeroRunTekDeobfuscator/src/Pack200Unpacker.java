import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.zip.Inflater;

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

    /** Pack200 magic bytes: CAFED00D */
    private static final int PACK200_MAGIC = 0xCAFED00D;

    /**
     * Performs the actual Pack200 -> JAR conversion.
     * Detects if the file is raw pack200 or deflate-wrapped (Jagex JS5 format
     * with an 8-byte header followed by raw deflate containing pack200 data).
     */
    private static File unpackPack200(File packFile) throws IOException {
        System.out.println("[Pack200Unpacker] Unpacking pack200: " + packFile.getName() + " ...");

        byte[] rawData = readAllBytes(packFile);

        // Check if the file starts with the pack200 magic
        int magic = ((rawData[0] & 0xFF) << 24) | ((rawData[1] & 0xFF) << 16)
                  | ((rawData[2] & 0xFF) << 8)  |  (rawData[3] & 0xFF);

        InputStream packStream;
        if (magic == PACK200_MAGIC) {
            System.out.println("[Pack200Unpacker] Detected raw pack200 format.");
            packStream = new ByteArrayInputStream(rawData);
        } else {
            // Try deflate from offset 8 (Jagex JS5 container: 8-byte header + raw deflate)
            System.out.println("[Pack200Unpacker] Not raw pack200 (magic=" + String.format("%08X", magic)
                    + "), trying deflate at offset 8 ...");
            packStream = new ByteArrayInputStream(inflateFrom(rawData, 8, packFile.getName()));
        }

        // Create a temp file that will hold the resulting JAR.
        File tempJar = File.createTempFile("aerodeob_", ".jar");

        Pack200.Unpacker unpacker = Pack200.newUnpacker();
        unpacker.properties().put(Pack200.Unpacker.DEFLATE_HINT, Pack200.Unpacker.FALSE);

        OutputStream out = null;
        JarOutputStream jos = null;

        try {
            out = new FileOutputStream(tempJar);
            jos = new JarOutputStream(out);
            unpacker.unpack(packStream, jos);
            jos.finish();
            System.out.println("[Pack200Unpacker] Unpacked to temporary JAR: " + tempJar.getAbsolutePath());
            return tempJar;
        } catch (IOException e) {
            safeDelete(tempJar);
            throw new IOException("Failed to unpack pack200 file '" + packFile.getName() + "': " + e.getMessage(), e);
        } finally {
            closeQuietly(jos);
            closeQuietly(out);
            closeQuietly(packStream);
        }
    }

    /**
     * Inflates raw deflate data starting at the given offset.
     */
    private static byte[] inflateFrom(byte[] data, int offset, String fileName) throws IOException {
        try {
            Inflater inf = new Inflater(true); // raw deflate (no zlib header)
            inf.setInput(data, offset, data.length - offset);

            ByteArrayOutputStream baos = new ByteArrayOutputStream(data.length * 4);
            byte[] buf = new byte[8192];
            while (!inf.finished()) {
                int n = inf.inflate(buf);
                if (n == 0 && inf.needsInput()) break;
                baos.write(buf, 0, n);
            }
            inf.end();

            byte[] result = baos.toByteArray();
            System.out.println("[Pack200Unpacker] Inflated " + data.length + " -> " + result.length + " bytes.");
            return result;
        } catch (java.util.zip.DataFormatException e) {
            throw new IOException("Failed to inflate '" + fileName + "' from offset " + offset + ": " + e.getMessage(), e);
        }
    }

    /**
     * Reads an entire file into a byte array.
     */
    private static byte[] readAllBytes(File f) throws IOException {
        byte[] data = new byte[(int) f.length()];
        FileInputStream fis = new FileInputStream(f);
        try {
            int off = 0;
            while (off < data.length) {
                int n = fis.read(data, off, data.length - off);
                if (n < 0) break;
                off += n;
            }
        } finally {
            closeQuietly(fis);
        }
        return data;
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
