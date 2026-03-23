/* Class125_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125_Sub1 extends Class125
{
    public static int anInt3360;
    public static int anInt3361;
    public int anInt3362;
    public static int anInt3363;
    public static int anInt3364;
    public static int anInt3365;
    public int anInt3366;
    public static int anInt3367 = 0;
    public static Class14_Sub29[][][] aClass14_Sub29ArrayArrayArray3368;
    public static int anInt3369;
    public int anInt3370;
    public static int anInt3371;
    public static short aShort3372;
    public int anInt3373;
    
    public void method1721(boolean arg0, int arg1, int arg2) {
    while_1122_:
	do {
	while_1121_:
	    do {
		do {
		    try {
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1121_;
		    }
		    return;
		} while (false);
		try {
		    anInt3361++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1122_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("cl.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public void method1726(int arg0, int arg1, int arg2) {
	try {
	    int i = anInt3370 * arg2 >> 1150782188;
	    int i_0_ = arg1 * anInt3373 >> 2901004;
	    if (arg0 <= 39)
		method1724(-2, 35, 47);
	    int i_1_ = anInt3362 * arg1 >> -1776736084;
	    anInt3371++;
	    int i_2_ = anInt3366 * arg2 >> -565330100;
	    Class14_Sub2_Sub3.method271((byte) 102, i_0_, i, anInt2079, i_2_,
					i_1_);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cl.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1724(int arg0, int arg1, int arg2) {
	try {
	    anInt3369++;
	    int i = arg2 * anInt3370 >> 390924332;
	    int i_3_ = arg2 * anInt3366 >> -1928412948;
	    int i_4_ = arg0 * anInt3373 >> 1867100428;
	    int i_5_ = arg0 * anInt3362 >> 286357452;
	    Class14_Sub2_Sub5.method283(i_3_, anInt2083, arg1 + 6, anInt2086,
					i, i_4_, anInt2079, i_5_);
	    if (arg1 != -6)
		aShort3372 = (short) -30;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cl.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1728(byte arg0) {
	try {
	    anInt3360++;
	    while (-12
		   >= (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			   .method840(Class14_Sub8_Sub12.anInt4280, (byte) -24)
		       ^ 0xffffffff)) {
		int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .method842(0, 11);
		if (i == 2047)
		    break;
		boolean bool = false;
		if (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i]
		    == null) {
		    bool = true;
		    Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i]
			= new Class133_Sub1_Sub1();
		    if (Class14_Sub2.aClass14_Sub10Array2742[i] != null)
			Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i]
			    .method1807
			    ((byte) -123,
			     Class14_Sub2.aClass14_Sub10Array2742[i]);
		}
		Class14.anIntArray351[Class14_Sub10.anInt2878++] = i;
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i];
		class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
		int i_6_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    5);
		int i_7_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		if (i_6_ > 15)
		    i_6_ -= 32;
		if ((i_7_ ^ 0xffffffff) == -2)
		    Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i;
		int i_8_ = (Class133.anIntArray2179
			    [Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method842(arg0 + -22, 3)]);
		if (bool)
		    class133_sub1_sub1.anInt3469
			= class133_sub1_sub1.anInt3461 = i_8_;
		int i_9_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method842(arg0 ^ 0x16, 5);
		if ((i_10_ ^ 0xffffffff) < -16)
		    i_10_ -= 32;
		class133_sub1_sub1.method1800((byte) -76,
					      (Class14_Sub3
					       .aClass133_Sub1_Sub1_2748
					       .anIntArray3443[0]) - -i_10_,
					      i_9_ == 1,
					      (Class14_Sub3
					       .aClass133_Sub1_Sub1_2748
					       .anIntArray3476[0]) + i_6_);
	    }
	    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method848((byte) -109);
	    if (arg0 != 22)
		method1730(30);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cl.I(" + arg0 + ')');
	}
    }
    
    public static Class148_Sub1[] method1729(Class9 arg0, int arg1, int arg2,
					     byte arg3) {
    while_1123_:
	do {
	    do {
		Class148_Sub1[] class148_sub1s;
		try {
		    anInt3364++;
		    if (arg3 != 48)
			method1729(null, -104, -52, (byte) -6);
		    if (Class109.method1564(-2, arg2, arg1, arg0))
			break;
		    class148_sub1s = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1123_;
		}
		return class148_sub1s;
	    } while (false);
	    Class148_Sub1[] class148_sub1s;
	    try {
		class148_sub1s = Class146.method1992((byte) -111);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148_sub1s;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("cl.H("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + arg3 + ')'));
    }
    
    public static void method1730(int arg0) {
	try {
	    aClass14_Sub29ArrayArrayArray3368 = null;
	    if (arg0 > -37)
		anInt3367 = 14;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cl.J(" + arg0 + ')');
	}
    }
    
    public Class125_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	try {
	    anInt3370 = arg0;
	    anInt3362 = arg3;
	    anInt3373 = arg1;
	    anInt3366 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cl.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	anInt3363 = 0;
	aShort3372 = (short) 256;
    }
}
