/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Font;

public class Class123
{
    public static int anInt2061;
    public static int anInt2062;
    public static Font aFont2063;
    public static Class124 aClass124_2064
	= Class14_Sub2_Sub2.method263(1178, "Started 3d library");
    public static Class124 aClass124_2065
	= Class14_Sub2_Sub2.method263(1178, ":duelstake:");
    public static int anInt2066;
    public static float aFloat2067;
    public static Class124 aClass124_2068 = aClass124_2064;
    public static int anInt2069;
    public static int anInt2070;
    
    public static void method1661(int arg0) {
	try {
	    aClass124_2065 = null;
	    if (arg0 != -19)
		method1661(14);
	    aClass124_2064 = null;
	    aFont2063 = null;
	    aClass124_2068 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sk.D(" + arg0 + ')');
	}
    }
    
    public static void method1662(int arg0, Class124 arg1, int arg2) {
	try {
	    anInt2066++;
	    Class14_Sub2_Sub13 class14_sub2_sub13
		= Class14_Sub8_Sub28.method626(arg2 + -115, arg0, arg2);
	    class14_sub2_sub13.method326(false);
	    class14_sub2_sub13.aClass124_3925 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sk.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1663(byte arg0) {
	try {
	    anInt2061++;
	    int i = Class26.anInt500;
	    int i_0_ = Class14_Sub8_Sub27.anInt4550;
	    int i_1_ = Class14_Sub14.anInt2984;
	    int i_2_ = Class14_Sub2_Sub8.anInt3832;
	    int i_3_ = 6116423;
	    Class25.method1004(i, i_2_, i_1_, i_0_, i_3_);
	    Class25.method1004(i - -1, 1 + i_2_, i_1_ + -2, 16, 0);
	    Class25.method1003(1 + i, 18 + i_2_, i_1_ - 2, i_0_ + -19, 0);
	    Class133_Sub3.aClass14_Sub2_Sub16_3567.method364((Class64
							      .aClass124_1011),
							     3 + i, i_2_ - -14,
							     i_3_, -1);
	    int i_4_ = Class14_Sub8_Sub33.anInt4640;
	    int i_5_ = Class107.anInt1804;
	    if (arg0 <= 115)
		method1661(-17);
	    for (int i_6_ = 0; i_6_ < Class14_Sub8_Sub38.anInt4729; i_6_++) {
		int i_7_ = ((Class14_Sub8_Sub38.anInt4729 + -1 - i_6_) * 15
			    + (i_2_ - -31));
		int i_8_ = 16777215;
		if ((i ^ 0xffffffff) > (i_4_ ^ 0xffffffff)
		    && (i_4_ ^ 0xffffffff) > (i_1_ + i ^ 0xffffffff)
		    && i_7_ - 13 < i_5_
		    && (i_5_ ^ 0xffffffff) > (3 + i_7_ ^ 0xffffffff))
		    i_8_ = 16776960;
		Class133_Sub3.aClass14_Sub2_Sub16_3567.method364
		    (Class46.method1170((byte) -99, i_6_), i + 3, i_7_, i_8_,
		     0);
	    }
	    Class71.method1317(Class14_Sub2_Sub8.anInt3832,
			       Class14_Sub8_Sub27.anInt4550,
			       Class14_Sub14.anInt2984, 127, Class26.anInt500);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sk.C(" + arg0 + ')');
	}
    }
    
    public static void method1664(Class9 arg0, boolean arg1,
				  Class14_Sub2_Sub16_Sub1 arg2, byte arg3,
				  Class9 arg4) {
	try {
	    Class14_Sub3.aBoolean2752 = arg1;
	    anInt2070++;
	    Class15.aClass9_384 = arg0;
	    if (arg3 >= -12)
		method1662(87, null, 24);
	    Class14_Sub8_Sub6.aClass9_4193 = arg4;
	    int i = Class15.aClass9_384.method155(6756) - 1;
	    Class108.anInt1816
		= Class15.aClass9_384.method177(i, 13537) + i * 256;
	    Class4.aClass14_Sub2_Sub16_Sub1_137 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("sk.A(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + (arg4 != null ? "{...}" : "null")
			+ ')'));
	}
    }
}
