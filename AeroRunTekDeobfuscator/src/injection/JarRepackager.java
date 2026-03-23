package injection;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.JarOutputStream;
import java.util.jar.Manifest;

/**
 * Repackages a JAR with patched classes from the injection context.
 * Copies all non-class entries (resources, etc.) verbatim from the original JAR
 * and writes a proper MANIFEST.MF with the Main-Class attribute.
 */
public final class JarRepackager {

    private JarRepackager() {
    }

    /**
     * Creates a new JAR at outputJar containing:
     * - Patched .class files (re-serialized from dirty ClassNodes)
     * - Original .class files (byte-for-byte copy for unmodified classes)
     * - All non-class entries from the original JAR (resources, etc.)
     * - A fresh MANIFEST.MF with Main-Class set to the detected entry point
     *
     * @param originalJar the source JAR to read non-class entries from
     * @param ctx         the injection context with classes and dirty flags
     * @param outputJar   destination path for the new JAR
     * @param mainClass   the main class name for the manifest (e.g. "client")
     */
    public static void repack(File originalJar, InjectionContext ctx,
                              File outputJar, String mainClass) throws IOException {
        System.out.println("[JarRepackager] Repackaging to: " + outputJar.getName());

        Manifest manifest = new Manifest();
        manifest.getMainAttributes().put(Attributes.Name.MANIFEST_VERSION, "1.0");
        manifest.getMainAttributes().put(Attributes.Name.MAIN_CLASS, mainClass);

        JarOutputStream jos = null;
        JarInputStream jis = null;

        try {
            jos = new JarOutputStream(new FileOutputStream(outputJar), manifest);

            // Write all classes (patched or original)
            int patched = 0;
            int passthrough = 0;
            for (String name : ctx.classes.keySet()) {
                JarEntry entry = new JarEntry(name + ".class");
                jos.putNextEntry(entry);

                if (ctx.isDirty(name)) {
                    // Re-serialize the modified ClassNode with frame recomputation
                    ClassNode node = ctx.classes.get(name);
                    ClassWriter writer = new SafeClassWriter(ctx, ClassWriter.COMPUTE_MAXS);
                    node.accept(writer);
                    jos.write(writer.toByteArray());
                    patched++;
                } else {
                    // Copy original bytes unchanged
                    jos.write(ctx.originalBytes.get(name));
                    passthrough++;
                }

                jos.closeEntry();
            }

            // Copy non-class entries from the original JAR
            int resources = 0;
            jis = new JarInputStream(new FileInputStream(originalJar));
            JarEntry originalEntry;
            while ((originalEntry = jis.getNextJarEntry()) != null) {
                String entryName = originalEntry.getName();

                // Skip class files (already written above) and manifest (already created)
                if (originalEntry.isDirectory()
                        || entryName.endsWith(".class")
                        || entryName.equals("META-INF/MANIFEST.MF")
                        || entryName.equals("META-INF/")) {
                    continue;
                }

                JarEntry newEntry = new JarEntry(entryName);
                jos.putNextEntry(newEntry);
                jos.write(readEntry(jis));
                jos.closeEntry();
                resources++;
            }

            System.out.println("[JarRepackager] Written: " + patched + " patched, "
                    + passthrough + " unmodified, " + resources + " resources.");
            System.out.println("[JarRepackager] Main-Class: " + mainClass);

        } finally {
            if (jis != null) {
                try { jis.close(); } catch (IOException ignored) { }
            }
            if (jos != null) {
                try { jos.close(); } catch (IOException ignored) { }
            }
        }
    }

    /**
     * Detects the main class by looking for common RS client entry points.
     * Falls back to "client" if no standard entry point is found.
     */
    public static String detectMainClass(InjectionContext ctx) {
        // Check for common RS client entry points
        String[] candidates = { "client", "Client", "main", "Main", "loader", "Loader" };
        for (String candidate : candidates) {
            if (ctx.classes.containsKey(candidate)) {
                // Verify it has a main(String[]) method
                ClassNode node = ctx.classes.get(candidate);
                for (Object m : node.methods) {
                    org.objectweb.asm.tree.MethodNode method = (org.objectweb.asm.tree.MethodNode) m;
                    if ("main".equals(method.name)
                            && "([Ljava/lang/String;)V".equals(method.desc)) {
                        System.out.println("[JarRepackager] Detected entry point: " + candidate);
                        return candidate;
                    }
                }
            }
        }

        // Broader scan: find any class with public static void main(String[])
        for (ClassNode node : ctx.classes.values()) {
            for (Object m : node.methods) {
                org.objectweb.asm.tree.MethodNode method = (org.objectweb.asm.tree.MethodNode) m;
                if ("main".equals(method.name)
                        && "([Ljava/lang/String;)V".equals(method.desc)
                        && (method.access & org.objectweb.asm.Opcodes.ACC_PUBLIC) != 0
                        && (method.access & org.objectweb.asm.Opcodes.ACC_STATIC) != 0) {
                    System.out.println("[JarRepackager] Detected entry point (broad scan): " + node.name);
                    return node.name;
                }
            }
        }

        System.out.println("[JarRepackager] No entry point detected, defaulting to 'client'.");
        return "client";
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
