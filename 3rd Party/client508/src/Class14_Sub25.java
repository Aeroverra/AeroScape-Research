/* Class14_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub25 extends Class14
{
    public static boolean[][] aBooleanArrayArray3170;
    public static float[] aFloatArray3171;
    public static Class124 aClass124_3172
	= Class14_Sub2_Sub2.method263(1178, " )2> <col=ff9040>");
    public static int anInt3173;
    public static int[][][] anIntArrayArrayArray3174;
    public static Class124 aClass124_3175
	= Class14_Sub2_Sub2.method263(1178, "Lade Texturen )2 ");
    public static int anInt3176;
    public int[] anIntArray3177;
    public int[] anIntArray3178 = { -1 };
    
    public static void method915(int arg0, int arg1) {
	try {
	    if (arg1 != 28091)
		aClass124_3172 = null;
	    Class14_Sub28.aClass52_3217.method1208((byte) -112, arg0);
	    anInt3173++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ub.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method916(int arg0) {
	try {
	    aClass124_3172 = null;
	    anIntArrayArrayArray3174 = null;
	    aClass124_3175 = null;
	    aFloatArray3171 = null;
	    aBooleanArrayArray3170 = null;
	    if (arg0 >= -109)
		method916(-91);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ub.B(" + arg0 + ')');
	}
    }
    
    public static int method917(boolean arg0, boolean arg1, byte arg2) {
    while_616_:
	do {
	    int i;
	    do {
		int i_0_;
		try {
		    anInt3176++;
		    i = 0;
		    if (arg2 == 96)
			break;
		    i_0_ = 45;
		} catch (RuntimeException runtimeexception) {
		    break while_616_;
		}
		return i_0_;
	    } while (false);
	    int i_1_;
	    try {
		if (arg1)
		    i += (Class14_Sub8_Sub32.anInt4612
			  + Class14_Sub2_Sub8.anInt3833);
		if (arg0)
		    i += Class63.anInt998 - -Class85.anInt1355;
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ub.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public Class14_Sub25() {
	anIntArray3177 = new int[] { 0 };
    }
    
    static {
	aBooleanArrayArray3170
	    = (new boolean[][]
	       { new boolean[0], { true, false, true },
		 { true, false, false, true }, { false, false, true, true },
		 { true, true, false }, { false, true, true },
		 { true, false, false, true },
		 { false, false, false, true, true }, { false, true, true },
		 { true, false, true, true, true },
		 { false, true, true, true, true },
		 { false, true, true, true, true, false } });
	aFloatArray3171 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };
    }
}
