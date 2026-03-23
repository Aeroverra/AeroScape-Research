/* Class56_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class56_Sub1 extends Class56
{
    public static long aLong3317 = 0L;
    public static int anInt3318;
    public static Class14_Sub6 aClass14_Sub6_3319;
    public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_3320;
    public static Class124 aClass124_3321
	= Class14_Sub2_Sub2.method263(1178, "Lade Sprites )2 ");
    public static int anInt3322;
    public static float aFloat3323;
    public static int anInt3324;
    
    public static void method1241(int arg0, int arg1, byte arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    Class51.method1201(Class14_Sub2_Sub19.anIntArrayArray4038[arg5++],
			       arg1, arg0, -5973, arg3);
	    anInt3318++;
	    int i = -65 % ((-73 - arg2) / 33);
	    Class51.method1201(Class14_Sub2_Sub19.anIntArrayArray4038[arg4--],
			       arg1, arg0, -5973, arg3);
	    for (int i_0_ = arg5; (i_0_ ^ 0xffffffff) >= (arg4 ^ 0xffffffff);
		 i_0_++) {
		int[] is = Class14_Sub2_Sub19.anIntArrayArray4038[i_0_];
		is[arg1] = is[arg0] = arg3;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("u.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static void method1242(Component arg0, int arg1) {
	try {
	    arg0.addMouseListener(Class67.aClass97_1055);
	    anInt3324++;
	    if (arg1 != 0)
		aLong3317 = 25L;
	    arg0.addMouseMotionListener(Class67.aClass97_1055);
	    arg0.addFocusListener(Class67.aClass97_1055);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("u.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method1243(byte arg0) {
	try {
	    aClass124_3321 = null;
	    if (arg0 != -115)
		method1243((byte) -64);
	    aClass14_Sub2_Sub16_3320 = null;
	    aClass14_Sub6_3319 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "u.G(" + arg0 + ')');
	}
    }
    
    static {
	aClass14_Sub6_3319 = new Class14_Sub6(0, 0);
    }
}
