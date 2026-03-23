import org.glavo.pack200.Pack200;

import java.io.*;
import java.util.jar.JarOutputStream;
import java.util.zip.Inflater;

/**
 * Standalone unpacker - reads 508hd.pack200 and writes 508hd_raw.jar
 * to a specified output path. No patches applied.
 */
public class UnpackOnly {

    private static final int PACK200_MAGIC = 0xCAFED00D;

    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.err.println("Usage: UnpackOnly <input.pack200> <output.jar>");
            System.exit(1);
        }
        File input = new File(args[0]);
        File output = new File(args[1]);

        System.out.println("[UnpackOnly] Reading: " + input.getAbsolutePath());
        byte[] rawData = readAllBytes(input);

        int magic = ((rawData[0] & 0xFF) << 24) | ((rawData[1] & 0xFF) << 16)
                  | ((rawData[2] & 0xFF) << 8)  |  (rawData[3] & 0xFF);

        InputStream packStream;
        if (magic == PACK200_MAGIC) {
            System.out.println("[UnpackOnly] Detected raw pack200 format.");
            packStream = new ByteArrayInputStream(rawData);
        } else {
            System.out.println("[UnpackOnly] Not raw pack200 (magic=" + String.format("%08X", magic)
                    + "), trying deflate at offset 8 ...");
            packStream = new ByteArrayInputStream(inflateFrom(rawData, 8));
        }

        output.getParentFile().mkdirs();
        FileOutputStream fos = new FileOutputStream(output);
        JarOutputStream jos = new JarOutputStream(fos);

        Pack200.Unpacker unpacker = Pack200.newUnpacker();
        unpacker.properties().put(Pack200.Unpacker.DEFLATE_HINT, "false");
        unpacker.unpack(packStream, jos);

        jos.finish();
        jos.close();
        fos.close();
        packStream.close();

        System.out.println("[UnpackOnly] Written: " + output.getAbsolutePath()
                + " (" + output.length() + " bytes)");
    }

    private static byte[] inflateFrom(byte[] data, int offset) throws IOException {
        try {
            Inflater inf = new Inflater(true);
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
            System.out.println("[UnpackOnly] Inflated " + data.length + " -> " + result.length + " bytes.");
            return result;
        } catch (java.util.zip.DataFormatException e) {
            throw new IOException("Failed to inflate: " + e.getMessage(), e);
        }
    }

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
            fis.close();
        }
        return data;
    }
}
