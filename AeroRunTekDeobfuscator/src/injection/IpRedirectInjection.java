package injection;

import org.objectweb.asm.tree.AbstractInsnNode;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.LdcInsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;

import java.util.Iterator;
import java.util.regex.Pattern;

/**
 * IP Redirect Injection
 *
 * Scans all classes for string constants (LDC) containing game server IPs,
 * hostnames, or URL patterns, as well as java/net/Socket and InetAddress usage.
 * Replaces connection targets with 127.0.0.1 for local server connectivity.
 *
 * Heuristic-based: uses pattern matching on string constants and proximity
 * analysis around network API call sites.
 */
public final class IpRedirectInjection {

    private static final String LOCALHOST = "127.0.0.1";

    /** Matches IPv4 addresses like 192.168.1.1, 74.222.166.47, etc. */
    private static final Pattern IP_PATTERN =
            Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$");

    /** Matches RuneScape/Jagex server hostnames */
    private static final Pattern HOSTNAME_PATTERN = Pattern.compile(
            "(?i)(world|login|update|lobby|game|js5|oldschool)\\d*\\.(runescape|jagex)\\.(com|net)"
    );

    /** Matches broader Jagex-related domain references */
    private static final Pattern DOMAIN_PATTERN = Pattern.compile(
            "(?i)(runescape|jagex)\\.(com|net)"
    );

    private IpRedirectInjection() {
    }

    /**
     * Applies IP redirect patches to all matching string constants.
     *
     * @return number of LDC constants patched
     */
    public static int apply(InjectionContext ctx) {
        System.out.println("[IP Redirect] Scanning for server connection strings...");

        int patchCount = 0;

        for (ClassNode classNode : ctx.classes.values()) {
            for (MethodNode method : classNode.methods) {
                int patches = patchMethod(classNode.name, method);
                if (patches > 0) {
                    ctx.markDirty(classNode.name);
                    patchCount += patches;
                }
            }
        }

        if (patchCount == 0) {
            System.out.println("[IP Redirect] No server connection strings found.");
        } else {
            System.out.println("[IP Redirect] Total constants patched: " + patchCount);
        }

        return patchCount;
    }

    /**
     * Scans a single method for patchable string constants.
     * Two-pass approach:
     *   Pass 1: Patch LDC strings that match known IP/hostname patterns.
     *   Pass 2: Patch LDC strings near InetAddress.getByName / Socket.<init> calls.
     */
    private static int patchMethod(String className, MethodNode method) {
        if (method.instructions == null) return 0;

        int patches = 0;

        // Pass 1: Direct pattern matching on LDC string constants
        Iterator<AbstractInsnNode> it = method.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode insn = it.next();

            if (insn instanceof LdcInsnNode) {
                LdcInsnNode ldc = (LdcInsnNode) insn;
                if (ldc.cst instanceof String) {
                    String value = (String) ldc.cst;

                    if (isServerAddress(value)) {
                        System.out.println("[IP Redirect] " + className + "."
                                + method.name + ": \"" + value + "\" -> \"" + LOCALHOST + "\"");
                        ldc.cst = LOCALHOST;
                        patches++;
                    }
                }
            }
        }

        // Pass 2: Proximity scan around InetAddress.getByName calls
        it = method.instructions.iterator();
        while (it.hasNext()) {
            AbstractInsnNode insn = it.next();

            if (insn.getType() == AbstractInsnNode.METHOD_INSN) {
                MethodInsnNode methodInsn = (MethodInsnNode) insn;

                boolean isGetByName = "java/net/InetAddress".equals(methodInsn.owner)
                        && "getByName".equals(methodInsn.name);
                boolean isSocketInit = "java/net/Socket".equals(methodInsn.owner)
                        && "<init>".equals(methodInsn.name);

                if (isGetByName || isSocketInit) {
                    // Walk backwards to find the nearest LDC string argument
                    LdcInsnNode nearestLdc = findPrecedingLdc(insn, 8);
                    if (nearestLdc != null && nearestLdc.cst instanceof String) {
                        String value = (String) nearestLdc.cst;
                        if (!LOCALHOST.equals(value) && looksLikeHostOrIp(value)) {
                            System.out.println("[IP Redirect] " + className + "."
                                    + method.name + " (near " + methodInsn.name
                                    + "): \"" + value + "\" -> \"" + LOCALHOST + "\"");
                            nearestLdc.cst = LOCALHOST;
                            patches++;
                        }
                    }
                }
            }
        }

        return patches;
    }

    /**
     * Determines if a string looks like a game server address that should be redirected.
     */
    private static boolean isServerAddress(String value) {
        if (value == null || value.isEmpty()) return false;
        if (LOCALHOST.equals(value) || "127.0.0.1".equals(value) || "localhost".equals(value)) return false;

        // Match direct IPs (non-local)
        if (IP_PATTERN.matcher(value).matches()) {
            return !value.startsWith("127.") && !value.startsWith("0.");
        }

        // Match known RuneScape/Jagex hostnames
        if (HOSTNAME_PATTERN.matcher(value).find()) return true;

        return false;
    }

    /**
     * Checks if a string near a network call looks like a hostname or IP.
     * More lenient than isServerAddress() since we have call-site context.
     */
    private static boolean looksLikeHostOrIp(String value) {
        if (value == null || value.isEmpty() || value.length() > 256) return false;
        if (IP_PATTERN.matcher(value).matches()) return true;
        if (HOSTNAME_PATTERN.matcher(value).find()) return true;
        if (DOMAIN_PATTERN.matcher(value).find()) return true;
        // Simple hostname heuristic: contains a dot, no spaces, looks like a domain
        if (value.contains(".") && !value.contains(" ") && !value.startsWith("/")
                && !value.startsWith("http") && value.length() < 64) {
            return true;
        }
        return false;
    }

    /**
     * Walks backwards from the given instruction up to maxSteps to find the
     * nearest LDC instruction that loads a String.
     */
    private static LdcInsnNode findPrecedingLdc(AbstractInsnNode from, int maxSteps) {
        AbstractInsnNode current = from.getPrevious();
        for (int i = 0; i < maxSteps && current != null; i++) {
            if (current instanceof LdcInsnNode) {
                LdcInsnNode ldc = (LdcInsnNode) current;
                if (ldc.cst instanceof String) {
                    return ldc;
                }
            }
            current = current.getPrevious();
        }
        return null;
    }
}
