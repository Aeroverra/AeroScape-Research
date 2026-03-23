/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class64
{
    public static Class124 aClass124_1009;
    public static Class124 aClass124_1010
	= Class14_Sub2_Sub2.method263(1178, "<col=ffff00>");
    public static Class124 aClass124_1011;
    public static int anInt1012;
    public static int anInt1013;
    public static long aLong1014;
    public static Class9_Sub1 aClass9_Sub1_1015;
    public static int[] anIntArray1016;
    public static Class124 aClass124_1017;
    public static int anInt1018;
    
    public static void method1285(int arg0, int arg1, int arg2, int arg3,
				  byte arg4) {
	try {
	    anInt1018++;
	    if (arg4 != -115)
		method1287(-75);
	    if ((Class14_Sub17.anInt3005 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
		&& (arg0 ^ 0xffffffff) >= (Class59.anInt955 ^ 0xffffffff)) {
		arg2 = Class67.method1301((byte) -83, arg2, Class118.anInt1982,
					  Class14_Sub8_Sub14.anInt4327);
		arg1 = Class67.method1301((byte) -93, arg1, Class118.anInt1982,
					  Class14_Sub8_Sub14.anInt4327);
		Class55.method1226(4, arg2, arg0, arg1, arg3);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ia.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method1286(byte arg0) {
	try {
	    anInt1013++;
	    for (int i = -1; i < Class14_Sub10.anInt2878; i++) {
		int i_0_;
		if (-1 != i)
		    i_0_ = Class14.anIntArray351[i];
		else
		    i_0_ = 2047;
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_];
		if (class133_sub1_sub1 != null
		    && (class133_sub1_sub1.anInt3473 ^ 0xffffffff) < -1) {
		    class133_sub1_sub1.anInt3473--;
		    if ((class133_sub1_sub1.anInt3473 ^ 0xffffffff) == -1)
			class133_sub1_sub1.aClass124_3462 = null;
		}
	    }
	    for (int i = 0; (i ^ 0xffffffff) > (Class14_Sub8_Sub13.anInt4306
						^ 0xffffffff); i++) {
		int i_1_ = Class14_Sub2_Sub15.anIntArray3965[i];
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_1_];
		if (class133_sub1_sub2 != null
		    && class133_sub1_sub2.anInt3473 > 0) {
		    class133_sub1_sub2.anInt3473--;
		    if (0 == class133_sub1_sub2.anInt3473)
			class133_sub1_sub2.aClass124_3462 = null;
		}
	    }
	    if (arg0 <= 29)
		aClass124_1017 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ia.C(" + arg0 + ')');
	}
    }
    
    public static void method1287(int arg0) {
	try {
	    if (arg0 != -12065)
		method1285(-5, 88, -88, 46, (byte) -119);
	    aClass9_Sub1_1015 = null;
	    aClass124_1010 = null;
	    anIntArray1016 = null;
	    aClass124_1017 = null;
	    aClass124_1011 = null;
	    aClass124_1009 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ia.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_1009 = Class14_Sub2_Sub2.method263(1178, "Versteckt");
	anIntArray1016 = new int[5];
	aClass124_1017 = Class14_Sub2_Sub2.method263(1178, "Choose Option");
	aLong1014 = 0L;
	anInt1012 = 0;
	aClass124_1011 = aClass124_1017;
    }
}
