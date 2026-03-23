/* Class14_Sub8_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub16 extends Class14_Sub8
{
    public static Class124 aClass124_4341
	= Class14_Sub2_Sub2.method263(1178, ")4a=");
    public static int anInt4342;
    public static int anInt4343;
    public static int anInt4344;
    public static int anInt4345;
    public static int anInt4346;
    public static int anInt4347;
    public static int anInt4348;
    public static int anInt4349;
    public static int anInt4350;
    public static Class86 aClass86_4351 = new Class86();
    public static int anInt4352 = 0;
    public static Class124 aClass124_4353
	= Class14_Sub2_Sub2.method263(1178, "(U2");
    public static Class14_Sub2_Sub9 aClass14_Sub2_Sub9_4354;
    public static int anInt4355;
    public static int anInt4356 = 0;
    public static boolean aBoolean4357 = false;
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    if (arg1 >= -58)
		aClass14_Sub2_Sub9_4354 = null;
	    anInt4344++;
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 117);
	    if (aClass149_2851.aBoolean2402) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i++) {
		    method564(-101, i, arg0);
		    int[] is_1_ = method483(0, (byte) -59,
					    Class14_Sub8_Sub20.anInt4429);
		    is_0_[i] = is_1_[Class71.anInt1083];
		}
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jh.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    int[][] is_2_ = aClass95_2838.method1481(1, arg0);
	    if (arg1 >= -4)
		method559(126, 39, -72, -98, 74, 115);
	    if (aClass95_2838.aBoolean1628) {
		int[] is_3_ = is_2_[0];
		int[] is_4_ = is_2_[1];
		int[] is_5_ = is_2_[2];
		for (int i = 0; i < Class112.anInt1876; i++) {
		    method564(-123, i, arg0);
		    int[][] is_6_
			= method480(0, 0, Class14_Sub8_Sub20.anInt4429);
		    is_3_[i] = is_6_[0][Class71.anInt1083];
		    is_4_[i] = is_6_[1][Class71.anInt1083];
		    is_5_[i] = is_6_[2][Class71.anInt1083];
		}
	    }
	    anInt4342++;
	    is = is_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jh.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method559(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
    while_379_:
	do {
	while_378_:
	    do {
		int i;
		int i_7_;
		do {
		    try {
			Class110.aClass148Array1848[0].method2001(arg2, arg4);
			anInt4345++;
			Class110.aClass148Array1848[1]
			    .method2001(arg2, arg4 + arg1 + -16);
			i = arg1 * (-32 + arg1) / arg5;
			if ((i ^ 0xffffffff) > -9)
			    i = 8;
			i_7_ = (-i + (arg1 - 32)) * arg3 / (arg5 - arg1);
			Class25.method1004(arg2, 16 + arg4, 16, arg1 + -32,
					   Class14_Sub8_Sub21.anInt4439);
			Class25.method1004(arg2, 16 + (arg4 - -i_7_), 16, i,
					   Class14.anInt366);
			Class25.method1000(arg2, i_7_ + (arg4 - -16), i,
					   Class134.anInt2612);
			Class25.method1000(1 + arg2, 16 + arg4 - -i_7_, i,
					   Class134.anInt2612);
			Class25.method1007(arg2, arg4 + 16 - -i_7_, 16,
					   Class134.anInt2612);
			Class25.method1007(arg2, i_7_ + arg4 - -17, 16,
					   Class134.anInt2612);
			Class25.method1000(arg2 + 15, i_7_ + (arg4 + 16), i,
					   Class14_Sub18.anInt3061);
			Class25.method1000(14 + arg2, arg4 - -17 - -i_7_,
					   -1 + i, Class14_Sub18.anInt3061);
			Class25.method1007(arg2, i + (i_7_ + arg4) + 15, 16,
					   Class14_Sub18.anInt3061);
			if (arg0 <= -21)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_378_;
		    }
		    return;
		} while (false);
		try {
		    Class25.method1007(1 + arg2, i_7_ + 14 + arg4 + i, 15,
				       Class14_Sub18.anInt3061);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_379_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("jh.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub16() {
	super(1, false);
    }
    
    public static void method560(int arg0) {
    while_381_:
	do {
	while_380_:
	    do {
		do {
		    try {
			anInt4347++;
			Class9.aClass52_236.method1209((byte) -96);
			if (arg0 == -12501)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_380_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub19.aClass52_4053.method1209((byte) -96);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_381_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "jh.D(" + arg0 + ')');
	} while (false);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4348++;
	    if (arg0 == 0)
		aBoolean2862 = 1 == arg2.method798(arg1 + -24665);
	    if (arg1 != 24777)
		anInt4356 = 42;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jh.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static int[] method561(int[] arg0, int arg1) {
    while_382_:
	do {
	    do {
		int[] is;
		try {
		    anInt4343++;
		    if (arg0 != null)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_382_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int[] is_8_ = new int[arg0.length];
		Class72.method1325(arg0, 0, is_8_, arg1, arg0.length);
		is = is_8_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("jh.J("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method562(int arg0) {
	try {
	    aClass124_4353 = null;
	    int i = -35 % ((arg0 - 6) / 42);
	    aClass124_4341 = null;
	    aClass14_Sub2_Sub9_4354 = null;
	    aClass86_4351 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jh.G(" + arg0 + ')');
	}
    }
    
    public static void method563(boolean arg0, Class124 arg1, byte arg2) {
    while_384_:
	do {
	while_383_:
	    do {
		do {
		    try {
			arg1 = arg1.method1716((byte) 63);
			anInt4349++;
			if (arg2 <= -112)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_383_;
		    }
		    return;
		} while (false);
		short[] is;
		int i;
		int i_9_;
		try {
		    is = new short[16];
		    i = 0;
		    i_9_ = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		for (/**/; i_9_ < Class108.anInt1816; i_9_++) {
		    Class142 class142 = Class14_Sub8_Sub24.method605(70, i_9_);
		    if ((!arg0 || class142.aBoolean2275)
			&& (class142.anInt2316 ^ 0xffffffff) == 0
			&& (class142.anInt2305 ^ 0xffffffff) == 0
			&& (class142.anInt2265 ^ 0xffffffff) == -1
			&& 0 != (class142.aClass124_2296.method1716
				     ((byte) 63).method1700(-19928, arg1)
				 ^ 0xffffffff)) {
			if ((i ^ 0xffffffff) <= -251) {
			    Class14_Sub8_Sub18.anInt4394 = -1;
			    Class133_Sub6.aShortArray3675 = null;
			    return;
			}
			try {
			    if (i >= is.length) {
				short[] is_10_ = new short[2 * is.length];
				for (int i_11_ = 0;
				     (i ^ 0xffffffff) < (i_11_ ^ 0xffffffff);
				     i_11_++)
				    is_10_[i_11_] = is[i_11_];
				is = is_10_;
			    }
			    is[i++] = (short) i_9_;
			} catch (RuntimeException runtimeexception) {
			    break while_383_;
			}
		    }
		}
		Class14_Sub8_Sub18.anInt4394 = i;
		Class12.anInt294 = 0;
		Class133_Sub6.aShortArray3675 = is;
		Class124[] class124s
		    = new Class124[Class14_Sub8_Sub18.anInt4394];
		for (int i_12_ = 0; Class14_Sub8_Sub18.anInt4394 > i_12_;
		     i_12_++)
		    class124s[i_12_] = (Class14_Sub8_Sub24.method605
					(93, is[i_12_]).aClass124_2296);
		Class14_Sub2_Sub1.method256(Class133_Sub6.aShortArray3675,
					    class124s, 23);
		break while_384_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("jh.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public void method564(int arg0, int arg1, int arg2) {
	try {
	    int i = -22 / ((arg0 - -37) / 61);
	    int i_13_ = Class14_Sub8_Sub4.anIntArray4145[arg1];
	    anInt4346++;
	    int i_14_ = Class133_Sub5.anIntArray3623[arg2];
	    float f = (float) Math.atan2((double) (-2048 + i_13_),
					 (double) (-2048 + i_14_));
	    if (!((double) f >= -3.141592653589793)
		|| !(-2.356194490192345 >= (double) f)) {
		if (!(-1.5707963267948966 >= (double) f)
		    || !(-2.356194490192345 <= (double) f)) {
		    if (!((double) f <= -0.7853981633974483)
			|| !(-1.5707963267948966 <= (double) f)) {
			if (f <= 0.0F && (double) f >= -0.7853981633974483) {
			    Class71.anInt1083 = arg1;
			    Class14_Sub8_Sub20.anInt4429
				= Class17.anInt407 + -arg2;
			} else if (0.0F <= f
				   && (double) f <= 0.7853981633974483) {
			    Class14_Sub8_Sub20.anInt4429
				= Class17.anInt407 - arg2;
			    Class71.anInt1083 = -arg1 + Class112.anInt1876;
			} else if (!(0.7853981633974483 <= (double) f)
				   || !(1.5707963267948966 >= (double) f)) {
			    if (!((double) f >= 1.5707963267948966)
				|| !((double) f <= 2.356194490192345)) {
				if (2.356194490192345 <= (double) f
				    && (double) f <= 3.141592653589793) {
				    Class71.anInt1083
					= Class112.anInt1876 - arg1;
				    Class14_Sub8_Sub20.anInt4429 = arg2;
				}
			    } else {
				Class71.anInt1083 = arg2;
				Class14_Sub8_Sub20.anInt4429
				    = Class17.anInt407 - arg1;
			    }
			} else {
			    Class71.anInt1083 = -arg2 + Class112.anInt1876;
			    Class14_Sub8_Sub20.anInt4429
				= -arg1 + Class17.anInt407;
			}
		    } else {
			Class14_Sub8_Sub20.anInt4429 = arg1;
			Class71.anInt1083 = -arg2 + Class112.anInt1876;
		    }
		} else {
		    Class14_Sub8_Sub20.anInt4429 = arg1;
		    Class71.anInt1083 = arg2;
		}
	    } else {
		Class71.anInt1083 = arg1;
		Class14_Sub8_Sub20.anInt4429 = arg2;
	    }
	    Class71.anInt1083 &= Class14_Sub10_Sub1.anInt4882;
	    Class14_Sub8_Sub20.anInt4429 &= Class115.anInt1927;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jh.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
}
