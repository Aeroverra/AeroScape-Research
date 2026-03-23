package injection;

import org.objectweb.asm.ClassReader;
import org.objectweb.asm.tree.ClassNode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/**
 * Loads every .class entry from a JAR into an InjectionContext.
 */
public final class JarLoader {

    private JarLoader() {
    }

    /**
     * Reads all .class entries from the given JAR and returns a populated context.
     */
    public static InjectionContext load(File jarFile) throws IOException {
        System.out.println("[JarLoader] Loading classes from: " + jarFile.getName());

        InjectionContext ctx = new InjectionContext();
        JarInputStream jis = null;

        try {
            jis = new JarInputStream(new FileInputStream(jarFile));
            JarEntry entry;

            while ((entry = jis.getNextJarEntry()) != null) {
                if (entry.isDirectory() || !entry.getName().endsWith(".class")) {
                    continue;
                }

                byte[] bytes = readEntry(jis);
                String internalName = entry.getName().replace(".class", "");

                ClassNode node = new ClassNode();
                ClassReader reader = new ClassReader(bytes);
                reader.accept(node, ClassReader.EXPAND_FRAMES);

                ctx.classes.put(internalName, node);
                ctx.originalBytes.put(internalName, bytes);
            }
        } finally {
            if (jis != null) {
                try { jis.close(); } catch (IOException ignored) { }
            }
        }

        System.out.println("[JarLoader] Loaded " + ctx.classes.size() + " classes.");
        return ctx;
    }

    private static byte[] readEntry(InputStream in) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream(4096);
        byte[] buf = new byte[4096];
        int n;
        while ((n = in.read(buf)) > 0) {
            baos.write(buf, 0, n);
        }
        return baos.toByteArray();
    }
}
