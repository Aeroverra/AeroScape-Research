package injection;

import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.tree.ClassNode;

/**
 * A ClassWriter that resolves the class hierarchy from the InjectionContext
 * instead of trying to load classes via the system classloader.
 *
 * This is necessary when using COMPUTE_FRAMES or COMPUTE_MAXS on classes
 * that aren't on the tool's own classpath (i.e., the game client classes).
 */
public final class SafeClassWriter extends ClassWriter {

    private final InjectionContext ctx;

    public SafeClassWriter(InjectionContext ctx, int flags) {
        super(flags);
        this.ctx = ctx;
    }

    /**
     * Resolves the common superclass of two types using the InjectionContext.
     * Falls back to "java/lang/Object" if either type is unknown.
     */
    @Override
    protected String getCommonSuperClass(String type1, String type2) {
        if ("java/lang/Object".equals(type1) || "java/lang/Object".equals(type2)) {
            return "java/lang/Object";
        }

        // Check if type1 is assignable from type2 or vice versa by walking the hierarchy
        String ancestor = type1;
        while (ancestor != null) {
            if (isAssignableFrom(ancestor, type2)) {
                return ancestor;
            }
            ancestor = getSuperName(ancestor);
        }

        ancestor = type2;
        while (ancestor != null) {
            if (isAssignableFrom(ancestor, type1)) {
                return ancestor;
            }
            ancestor = getSuperName(ancestor);
        }

        return "java/lang/Object";
    }

    private boolean isAssignableFrom(String parent, String child) {
        String current = child;
        while (current != null) {
            if (parent.equals(current)) return true;
            current = getSuperName(current);
        }
        return false;
    }

    private String getSuperName(String internalName) {
        if ("java/lang/Object".equals(internalName)) return null;

        ClassNode node = ctx.classes.get(internalName);
        if (node != null) {
            return node.superName;
        }

        // For JDK classes not in the context, try the system classloader
        try {
            Class<?> cls = Class.forName(internalName.replace('/', '.'), false,
                    getClass().getClassLoader());
            Class<?> sup = cls.getSuperclass();
            return sup == null ? null : sup.getName().replace('.', '/');
        } catch (ClassNotFoundException e) {
            return "java/lang/Object";
        }
    }
}
