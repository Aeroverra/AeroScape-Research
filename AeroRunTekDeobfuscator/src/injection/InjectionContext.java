package injection;

import org.objectweb.asm.tree.ClassNode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Holds all loaded classes from a JAR for the injection pipeline.
 * Classes are stored both as parsed ASM tree nodes and as raw byte arrays.
 */
public final class InjectionContext {

    /** Internal class name (e.g. "client") -> parsed ASM ClassNode */
    public final Map<String, ClassNode> classes = new LinkedHashMap<String, ClassNode>();

    /** Internal class name -> original raw bytes (for unmodified passthrough) */
    public final Map<String, byte[]> originalBytes = new LinkedHashMap<String, byte[]>();

    /** Tracks which classes have been modified and need re-serialization */
    public final Map<String, Boolean> dirty = new LinkedHashMap<String, Boolean>();

    public void markDirty(String internalName) {
        dirty.put(internalName, Boolean.TRUE);
    }

    public boolean isDirty(String internalName) {
        return dirty.containsKey(internalName) && dirty.get(internalName);
    }
}
