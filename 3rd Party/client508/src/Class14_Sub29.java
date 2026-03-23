/* Class14_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub29 extends Class14
{
    public int anInt3231;
    public static int anInt3232;
    public Class6 aClass6_3233;
    public int anInt3234;
    public boolean aBoolean3235;
    public int anInt3236;
    public Class4 aClass4_3237;
    public static int anInt3238;
    public int anInt3239;
    public boolean aBoolean3240;
    public static int anInt3241;
    public int anInt3242;
    public int anInt3243;
    public static int anInt3244;
    public static int[] anIntArray3245 = new int[99];
    public static int anInt3246;
    public int[] anIntArray3247 = new int[5];
    public Class153 aClass153_3248;
    public int anInt3249;
    public Class113 aClass113_3250;
    public boolean aBoolean3251;
    public int anInt3252;
    public static int anInt3253;
    public static int anInt3254;
    public Class37 aClass37_3255;
    public Class115 aClass115_3256;
    public Class40[] aClass40Array3257 = new Class40[5];
    public int anInt3258;
    public static int anInt3259;
    public Class14_Sub29 aClass14_Sub29_3260;
    public int anInt3261;
    public static short[] aShortArray3262;
    public static Class124 aClass124_3263;
    public static int[] anIntArray3264;
    public static Class148_Sub1[] aClass148_Sub1Array3265;
    public static int anInt3266;
    public static int anInt3267;
    
    public Class14_Sub29(int arg0, int arg1, int arg2) {
	anInt3249 = 0;
	try {
	    anInt3239 = arg2;
	    anInt3258 = arg1;
	    anInt3261 = anInt3243 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ve.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ')'));
	}
    }
    
    public static void method930(byte arg0) {
    while_1_:
	do {
	try {
	while_0_:
	    do {
		do {
		    try {
			if (arg0 == -34)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_0_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_3263 = null;
		    anIntArray3245 = null;
		    anIntArray3264 = null;
		    aShortArray3262 = null;
		    aClass148_Sub1Array3265 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ve.D(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static int method931(int arg0, int arg1, int arg2) {
	try {
	boolean bool;
    while_2_:
	do {
	int i_2_; 
	    Class14_Sub25 class14_sub25;
	    do {
		int i_0_ = 0;
		try {
		    class14_sub25
			= ((Class14_Sub25)
			   Class132.aClass55_2167.method1230((long) arg2,
							     (byte) -100));
		    anInt3246++;
		    if (null != class14_sub25)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return i_0_;
	    } while (false);
	    do {
		int i_1_ = 0;
		try {
		    if ((arg0 ^ 0xffffffff) <= -1
			&& class14_sub25.anIntArray3177.length > arg0)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return i_1_;
	    } while (false);
	    try {
		if (arg1 != 3958)
		    method936(-33);
		i_2_ = class14_sub25.anIntArray3177[arg0];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_2_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ve.G(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
	}
	return 0;
    }
    
    public static int method932(int arg0, int arg1) {
	int anInt;
	try {
	    anInt3254++;
	    if (arg1 != 21661)
		method932(-66, -87);
	    anInt = arg0 >>> -1759527640;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ve.F(" + arg0 + ',' + arg1
						+ ')'));
	}
	return anInt;
    }
    
    public static Class14_Sub2_Sub15 method933
	(Class9 arg0, Class9 arg1, int arg2, byte arg3, boolean arg4) {
	boolean bool = false;
	int[] is = arg1.method176((byte) 84, arg2);
	Class14_Sub2_Sub15 class14_sub2_sub15_2_ = null;
	do {
	Class14_Sub2_Sub15 class14_sub2_sub15_0_;
	    try {
		anInt3232++;
		bool = true;
		is = arg1.method176((byte) 84, arg2);
		if (arg3 < -52)
		    break;
		class14_sub2_sub15_0_ = null;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub15_0_;
	} while (false);
	do {
	Class14_Sub2_Sub15 class14_sub2_sub15_1_;
	    try {
		for (int i = 0; (i ^ 0xffffffff) > (is.length ^ 0xffffffff);
		     i++) {
		    byte[] is_0_ = arg1.method157(is[i], arg2, 20983);
		    if (is_0_ == null)
			bool = false;
		    else {
			int i_1_
			    = 0xff & is_0_[1] | (is_0_[0] & 0xff) << 578725896;
			byte[] is_2_;
			if (arg4)
			    is_2_ = arg0.method157(i_1_, 0, 20983);
			else
			    is_2_ = arg0.method157(0, i_1_, 20983);
			if (is_2_ == null)
			    bool = false;
		    }
		}
		if (bool)
		    break;
		class14_sub2_sub15_1_ = null;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub15_1_;
	} while (false);
	try {
	    class14_sub2_sub15_2_ = new Class14_Sub2_Sub15(arg1, arg0, arg2, arg4);
	} catch (Exception exception) {
	    do {
		try {
		    Object object;
		    class14_sub2_sub15_2_ = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		return class14_sub2_sub15_2_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ve.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
		}
	return class14_sub2_sub15_2_;
    }
    
    public static void method934(Class9 arg0, int arg1) {
	try {
	    int i = -57 / ((arg1 - 3) / 39);
	    Class14_Sub8_Sub17.aClass9_4371 = arg0;
	    anInt3244++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ve.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method935(int arg0, boolean arg1) {
	try {
	    Class7_Sub2.anInt2676 = 99;
	    Class21.anIntArray442 = new int[104];
	    Class115.anIntArray1917 = new int[104];
	    Class14_Sub2_Sub18.anIntArray4023 = new int[104];
	    anInt3259++;
	    Class14_Sub2_Sub17.anIntArray4020 = new int[104];
	    Class14_Sub2_Sub3.anIntArray3773 = new int[104];
	    int i;
	    if (!arg1)
		i = 4;
	    else
		i = 1;
	    Class99_Sub2.aByteArrayArrayArray3354 = new byte[i][105][105];
	    Class97.aByteArrayArrayArray1645 = new byte[i][104][104];
	    Class20.aByteArrayArrayArray430 = new byte[i][104][104];
	    Class15.aByteArrayArrayArray385 = new byte[i][104][104];
	    if (arg0 != 5)
		method932(-78, -17);
	    Class66.anIntArrayArrayArray1050 = new int[i][105][105];
	    Class14_Sub8_Sub6.aByteArrayArrayArray4194 = new byte[i][104][104];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ve.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method936(int arg0) {
	try {
	    if (arg0 != 99)
		method933(null, null, 6, (byte) -22, false);
	    Class40.aClass2_664 = new Class2();
	    anInt3253++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ve.A(" + arg0 + ')');
	}
    }
    
    static {
	anInt3238 = -1;
	int i = 0;
	for (int i_3_ = 0; i_3_ < 99; i_3_++) {
	    int i_4_ = i_3_ - -1;
	    int i_5_ = (int) ((double) i_4_
			      + Math.pow(2.0, (double) i_4_ / 7.0) * 300.0);
	    i += i_5_;
	    anIntArray3245[i_3_] = i / 4;
	}
	aShortArray3262 = new short[500];
	anIntArray3264 = new int[5];
	anInt3266 = 127;
	aClass124_3263 = Class14_Sub2_Sub2.method263(1178, "::");
    }
}