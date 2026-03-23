package injection;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;
import org.objectweb.asm.Type;

import java.util.Iterator;

/**
 * RSA Lobotomy Injection
 *
 * Scans all classes for methods that invoke {@code java/math/BigInteger.modPow}
 * and patches them to bypass RSA encryption entirely.
 *
 * The standard RS login RSA pattern in bytecode:
 *   1. Read raw bytes from packet buffer into a local byte[]
 *   2. new BigInteger(rawBytes).modPow(exp, mod).toByteArray() -> encryptedBytes
 *   3. Write encryptedBytes back to the packet buffer
 *
 * The patch replaces the BigInteger block (step 2) with a simple variable copy,
 * so the raw unencrypted bytes are written back instead of encrypted ones.
 * This works because private servers don't perform RSA decryption.
 *
 * Heuristic-based: works on any client revision that uses BigInteger.modPow for
 * login packet encryption.
 */
public final class RsaLobotomyInjection {

    private RsaLobotomyInjection() {
    }

    /**
     * Applies the RSA lobotomy to all matching methods in the context.
     *
     * @return number of methods patched
     */
    public static int apply(InjectionContext ctx) {
        System.out.println("[RSA Lobotomy] Scanning for BigInteger.modPow usage...");

        int patchCount = 0;

        for (ClassNode classNode : ctx.classes.values()) {
            for (MethodNode method : classNode.methods) {
                if (containsModPow(method)) {
                    System.out.println("[RSA Lobotomy] Found modPow in: "
                            + classNode.name + "." + method.name + method.desc);
                    patchMethod(method);
                    ctx.markDirty(classNode.name);
                    patchCount++;
                }
            }
        }

        if (patchCount == 0) {
            System.out.println("[RSA Lobotomy] No BigInteger.modPow usage found.");
        } else {
            System.out.println("[RSA Lobotomy] Total methods patched: " + patchCount);
        }

        return patchCount;
    }

    /**
     * Checks whether a method contains an INVOKEVIRTUAL to BigInteger.modPow.
     */
    private static boolean containsModPow(MethodNode method) {
        if (method.instructions == null) return false;

        Iterator<AbstractInsnNode> it = method.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode insn = it.next();
            if (insn.getType() == AbstractInsnNode.METHOD_INSN) {
                MethodInsnNode methodInsn = (MethodInsnNode) insn;
                if ("java/math/BigInteger".equals(methodInsn.owner)
                        && "modPow".equals(methodInsn.name)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Patches a method to bypass RSA encryption.
     *
     * Locates the byte array variable that feeds into the BigInteger constructor
     * (the raw unencrypted bytes) and the variable that receives the result of
     * toByteArray() (the encrypted bytes). Replaces the entire BigInteger block
     * with ALOAD raw; ASTORE encrypted — effectively a no-op on the data.
     *
     * Falls back to replacing the entire method body with RETURN if the pattern
     * cannot be matched.
     */
    private static void patchMethod(MethodNode method) {
        InsnList insns = method.instructions;
        if (insns == null || insns.size() == 0) {
            applyFallbackPatch(method);
            return;
        }

        // Pass 1: Locate key instructions in the BigInteger RSA pattern
        // Pattern: ... ALOAD rawSlot ... NEW BigInteger ... modPow ... toByteArray ... ASTORE encSlot
        AbstractInsnNode bigIntNew = null;
        AbstractInsnNode toByteArrayInsn = null;
        AbstractInsnNode encryptedStore = null;  // ASTORE after toByteArray
        boolean foundModPow = false;
        int rawBytesSlot = -1;

        Iterator<AbstractInsnNode> it = insns.iterator();
        while (it.hasNext()) {
            AbstractInsnNode insn = it.next();

            // Find NEW java/math/BigInteger
            if (insn.getOpcode() == Opcodes.NEW && insn instanceof org.objectweb.asm.tree.TypeInsnNode) {
                org.objectweb.asm.tree.TypeInsnNode typeInsn = (org.objectweb.asm.tree.TypeInsnNode) insn;
                if ("java/math/BigInteger".equals(typeInsn.desc)) {
                    bigIntNew = insn;

                    // Find the raw byte[] slot: scan backwards for the ASTORE that
                    // stored the newarray byte result (pattern: NEWARRAY T_BYTE ... ASTORE X)
                    rawBytesSlot = findRawBytesSlot(insn);
                }
            }

            // Find modPow call
            if (insn.getType() == AbstractInsnNode.METHOD_INSN) {
                MethodInsnNode mi = (MethodInsnNode) insn;
                if ("java/math/BigInteger".equals(mi.owner) && "modPow".equals(mi.name)) {
                    foundModPow = true;
                }
                // Find toByteArray after modPow
                if (foundModPow && "java/math/BigInteger".equals(mi.owner)
                        && "toByteArray".equals(mi.name)) {
                    toByteArrayInsn = insn;

                    // The next real instruction should be ASTORE for the encrypted result
                    AbstractInsnNode next = insn.getNext();
                    while (next != null && next.getOpcode() == -1) {
                        next = next.getNext(); // skip labels/frames/line numbers
                    }
                    if (next != null && next.getOpcode() == Opcodes.ASTORE) {
                        encryptedStore = next;
                    }
                    break;
                }
            }
        }

        // Validate we found the complete pattern
        if (bigIntNew == null || toByteArrayInsn == null || encryptedStore == null
                || rawBytesSlot < 0) {
            System.out.println("[RSA Lobotomy] Could not match full pattern, using fallback.");
            applyFallbackPatch(method);
            return;
        }

        int encryptedSlot = ((VarInsnNode) encryptedStore).var;

        System.out.println("[RSA Lobotomy] Raw bytes slot: " + rawBytesSlot
                + ", encrypted slot: " + encryptedSlot);

        // Pass 2: Remove everything from NEW BigInteger through ASTORE encryptedSlot
        AbstractInsnNode current = bigIntNew;
        AbstractInsnNode afterStore = encryptedStore.getNext();

        while (current != null && current != afterStore) {
            AbstractInsnNode next = current.getNext();
            insns.remove(current);
            current = next;
        }

        // Insert: ALOAD rawBytesSlot; ASTORE encryptedSlot
        // This bridges the raw bytes directly to where encrypted bytes were expected
        InsnList bridge = new InsnList();
        bridge.add(new VarInsnNode(Opcodes.ALOAD, rawBytesSlot));
        bridge.add(new VarInsnNode(Opcodes.ASTORE, encryptedSlot));

        if (afterStore != null) {
            insns.insertBefore(afterStore, bridge);
        } else {
            insns.add(bridge);
        }

        System.out.println("[RSA Lobotomy] Patched: raw bytes (slot " + rawBytesSlot
                + ") bypass RSA -> slot " + encryptedSlot);
    }

    /**
     * Scans backwards from the NEW BigInteger instruction to find the local
     * variable slot holding the raw byte array.
     *
     * Looks for the pattern: NEWARRAY T_BYTE ... ASTORE X, where X is the slot
     * that holds the unencrypted bytes fed into the BigInteger constructor.
     */
    private static int findRawBytesSlot(AbstractInsnNode newBigInt) {
        // The raw byte array is created before the BigInteger:
        //   ILOAD len
        //   NEWARRAY T_BYTE
        //   ASTORE rawSlot
        // Then later:
        //   ... (buffer read into rawSlot) ...
        //   NEW BigInteger
        //   DUP
        //   ALOAD rawSlot
        //   INVOKESPECIAL BigInteger.<init>([B)V

        // Strategy: find the ALOAD just after DUP (which loads the raw bytes into BigInteger)
        AbstractInsnNode dup = newBigInt.getNext();
        // Skip non-instruction nodes
        while (dup != null && dup.getOpcode() == -1) {
            dup = dup.getNext();
        }

        if (dup != null && dup.getOpcode() == Opcodes.DUP) {
            AbstractInsnNode aload = dup.getNext();
            while (aload != null && aload.getOpcode() == -1) {
                aload = aload.getNext();
            }
            if (aload != null && aload.getOpcode() == Opcodes.ALOAD) {
                return ((VarInsnNode) aload).var;
            }
        }

        // Fallback: scan backwards for NEWARRAY byte -> ASTORE
        AbstractInsnNode scan = newBigInt.getPrevious();
        for (int i = 0; i < 30 && scan != null; i++) {
            if (scan.getOpcode() == Opcodes.NEWARRAY) {
                // Found newarray, the next instruction should be ASTORE
                AbstractInsnNode next = scan.getNext();
                while (next != null && next.getOpcode() == -1) {
                    next = next.getNext();
                }
                if (next != null && next.getOpcode() == Opcodes.ASTORE) {
                    return ((VarInsnNode) next).var;
                }
            }
            scan = scan.getPrevious();
        }

        return -1;
    }

    /**
     * Fallback: clears the method body and replaces it with an immediate return.
     */
    private static void applyFallbackPatch(MethodNode method) {
        Type returnType = Type.getReturnType(method.desc);

        method.instructions.clear();
        method.tryCatchBlocks.clear();
        method.localVariables = null;

        InsnList patch = new InsnList();

        switch (returnType.getSort()) {
            case Type.VOID:
                patch.add(new InsnNode(Opcodes.RETURN));
                break;
            case Type.INT:
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.CHAR:
            case Type.SHORT:
                patch.add(new InsnNode(Opcodes.ICONST_0));
                patch.add(new InsnNode(Opcodes.IRETURN));
                break;
            case Type.LONG:
                patch.add(new InsnNode(Opcodes.LCONST_0));
                patch.add(new InsnNode(Opcodes.LRETURN));
                break;
            case Type.FLOAT:
                patch.add(new InsnNode(Opcodes.FCONST_0));
                patch.add(new InsnNode(Opcodes.FRETURN));
                break;
            case Type.DOUBLE:
                patch.add(new InsnNode(Opcodes.DCONST_0));
                patch.add(new InsnNode(Opcodes.DRETURN));
                break;
            case Type.ARRAY:
            case Type.OBJECT:
                patch.add(new InsnNode(Opcodes.ACONST_NULL));
                patch.add(new InsnNode(Opcodes.ARETURN));
                break;
            default:
                patch.add(new InsnNode(Opcodes.RETURN));
                break;
        }

        method.instructions.add(patch);
        method.maxStack = 2;
        method.maxLocals = Type.getArgumentTypes(method.desc).length + 1;

        System.out.println("[RSA Lobotomy] Applied fallback patch (method replaced with no-op).");
    }
}
