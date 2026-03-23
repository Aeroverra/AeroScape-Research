package injection;

import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.FieldInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Iterator;

/**
 * ISAAC Cipher Bypass Injection
 *
 * RuneScape clients use ISAAC to encrypt/decrypt packet opcodes:
 *
 *   Outgoing: buffer[p++] = (byte)(opcode + isaac.nextValue())
 *   Incoming: opcode = (buffer[p++] - isaac.nextValue()) & 0xFF
 *
 * In bytecode, the incoming variant uses INEG + IADD instead of ISUB:
 *
 *   Outgoing: ... INVOKEVIRTUAL ng.b:(B)I → IADD
 *   Incoming: ... INVOKEVIRTUAL ng.b:(B)I → INEG → IADD
 *
 * This injection removes both patterns, leaving raw opcode reads and writes.
 *
 * Heuristic-based: scans for the ISAAC field load + nextValue call + arithmetic
 * pattern. Works across client revisions.
 */
public final class IsaacBypassInjection {

    private IsaacBypassInjection() {
    }

    /**
     * Applies the ISAAC bypass to all matching methods in the context.
     *
     * @return number of methods patched
     */
    public static int apply(InjectionContext ctx) {
        System.out.println("[ISAAC Bypass] Scanning for ISAAC cipher usage...");

        int patchCount = 0;

        for (ClassNode classNode : ctx.classes.values()) {
            for (MethodNode method : classNode.methods) {
                int hits = patchIsaacUsage(classNode, method);
                if (hits > 0) {
                    ctx.markDirty(classNode.name);
                    patchCount += hits;
                }
            }
        }

        if (patchCount == 0) {
            System.out.println("[ISAAC Bypass] No ISAAC cipher usage found.");
        } else {
            System.out.println("[ISAAC Bypass] Total patches applied: " + patchCount);
        }

        return patchCount;
    }

    /**
     * Scans a method for ISAAC cipher patterns and removes them.
     *
     * Matches two variants:
     *
     * Variant A (outgoing encryption):
     *   ALOAD_0 → GETFIELD Jb:Lng → BIPUSH → INVOKEVIRTUAL ng.b:(B)I → IADD
     *
     * Variant B (incoming decryption):
     *   ALOAD_0 → GETFIELD Jb:Lng → BIPUSH → INVOKEVIRTUAL ng.b:(B)I → INEG → IADD
     *
     * Both are reduced to nothing, leaving the raw value on the stack.
     *
     * @return number of patches applied within this method
     */
    private static int patchIsaacUsage(ClassNode classNode, MethodNode method) {
        if (method.instructions == null || method.instructions.size() == 0) return 0;

        int patches = 0;

        // We scan for INVOKEVIRTUAL calls that match the ISAAC nextValue signature,
        // then verify the surrounding context (field load before, arithmetic after).
        // Using a fresh iterator each time since we modify the instruction list.
        boolean found;
        do {
            found = false;
            Iterator<AbstractInsnNode> it = method.instructions.iterator();

            while (it.hasNext()) {
                AbstractInsnNode insn = it.next();

                // Look for INVOKEVIRTUAL <class>.<method>:(B)I or similar returning int
                if (insn.getType() != AbstractInsnNode.METHOD_INSN) continue;
                MethodInsnNode invoke = (MethodInsnNode) insn;
                if (invoke.getOpcode() != Opcodes.INVOKEVIRTUAL) continue;
                if (!invoke.desc.endsWith(")I")) continue;

                // Check: before the invoke there's a dummy constant push
                AbstractInsnNode dummyArg = skipNonInsn(invoke.getPrevious());
                if (dummyArg == null || !isPushConstant(dummyArg)) continue;

                // Check: before the dummy arg there's GETFIELD loading an object
                AbstractInsnNode getfield = skipNonInsn(dummyArg.getPrevious());
                if (getfield == null || getfield.getOpcode() != Opcodes.GETFIELD) continue;
                FieldInsnNode fieldInsn = (FieldInsnNode) getfield;
                if (!fieldInsn.desc.startsWith("L")) continue;

                // Verify field type matches the invoked method's owner class
                String fieldType = fieldInsn.desc.substring(1, fieldInsn.desc.length() - 1);
                if (!fieldType.equals(invoke.owner)) continue;

                // Check: before GETFIELD there's ALOAD_0
                AbstractInsnNode aload = skipNonInsn(getfield.getPrevious());
                if (aload == null || aload.getOpcode() != Opcodes.ALOAD) continue;

                // Now check what comes AFTER the invoke:
                // Variant A: IADD (outgoing)
                // Variant B: INEG → IADD (incoming)
                AbstractInsnNode afterInvoke = skipNonInsn(invoke.getNext());
                if (afterInvoke == null) continue;

                AbstractInsnNode ineg = null;
                AbstractInsnNode iadd = null;

                if (afterInvoke.getOpcode() == Opcodes.IADD) {
                    // Variant A: direct IADD
                    iadd = afterInvoke;
                } else if (afterInvoke.getOpcode() == Opcodes.INEG) {
                    // Variant B: INEG then IADD
                    ineg = afterInvoke;
                    AbstractInsnNode afterIneg = skipNonInsn(ineg.getNext());
                    if (afterIneg != null && afterIneg.getOpcode() == Opcodes.IADD) {
                        iadd = afterIneg;
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }

                // Pattern confirmed
                String variant = (ineg != null) ? "incoming (INEG+IADD)" : "outgoing (IADD)";
                System.out.println("[ISAAC Bypass] Found " + variant + " in: "
                        + classNode.name + "." + method.name + method.desc);
                System.out.println("[ISAAC Bypass]   ISAAC class: " + invoke.owner
                        + ", field: " + fieldInsn.owner + "." + fieldInsn.name
                        + ", nextValue: " + invoke.name + invoke.desc);

                // Remove: ALOAD_0, GETFIELD, dummyArg, INVOKEVIRTUAL, [INEG], IADD
                method.instructions.remove(aload);
                method.instructions.remove(getfield);
                method.instructions.remove(dummyArg);
                method.instructions.remove(invoke);
                if (ineg != null) {
                    method.instructions.remove(ineg);
                }
                method.instructions.remove(iadd);

                System.out.println("[ISAAC Bypass]   Removed -> raw opcode " + variant + ".");
                patches++;
                found = true;
                break; // restart scan since instruction list was modified
            }
        } while (found);

        return patches;
    }

    /**
     * Skips label, frame, and line number nodes to find the previous real instruction.
     */
    private static AbstractInsnNode skipNonInsn(AbstractInsnNode node) {
        while (node != null && node.getOpcode() == -1) {
            node = node.getPrevious();
        }
        return node;
    }

    /**
     * Checks if an instruction is a constant push (ICONST_*, BIPUSH, SIPUSH, LDC int).
     */
    private static boolean isPushConstant(AbstractInsnNode insn) {
        int op = insn.getOpcode();
        return op == Opcodes.BIPUSH || op == Opcodes.SIPUSH
                || (op >= Opcodes.ICONST_M1 && op <= Opcodes.ICONST_5)
                || (op == Opcodes.LDC && insn instanceof org.objectweb.asm.tree.LdcInsnNode
                    && ((org.objectweb.asm.tree.LdcInsnNode) insn).cst instanceof Integer);
    }
}
