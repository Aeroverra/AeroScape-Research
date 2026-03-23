/* Class14_Sub8_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub29 extends Class14_Sub8
{
    public static int anInt4572;
    public static int anInt4573;
    public static Class124 aClass124_4574;
    public static int anInt4575;
    public static int anInt4576;
    public static int anInt4577;
    public int anInt4578 = 32768;
    public static int anInt4579;
    public static Class148[] aClass148Array4580;
    public static boolean[] aBooleanArray4581 = new boolean[112];
    public static int anInt4582;
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4575++;
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 106);
	    if (aClass149_2851.aBoolean2402) {
		int[] is_1_ = method483(1, (byte) -123, arg0);
		int[] is_2_ = method483(2, (byte) -71, arg0);
		for (int i = 0;
		     (Class112.anInt1876 ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    int i_3_ = anInt4578 * is_2_[i] >> -2041738420;
		    int i_4_ = (0xffb & is_1_[i]) >> -207592252;
		    int i_5_ = (i_3_ * Class99_Sub2.anIntArray3357[i_4_]
				>> -624451188);
		    int i_6_ = (i_3_ * Class14_Sub8_Sub21.anIntArray4435[i_4_]
				>> -789631860);
		    int i_7_ = (Class14_Sub10_Sub1.anInt4882
				& (i_5_ >> -313551700) + i);
		    int i_8_
			= Class115.anInt1927 & (i_6_ >> -1869731700) + arg0;
		    int[] is_9_ = method483(0, (byte) -101, i_8_);
		    is_0_[i] = is_9_[i_7_];
		}
	    }
	    if (arg1 > -58)
		aBooleanArray4581 = null;
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qe.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public Class14_Sub8_Sub29() {
	super(3, false);
    }
    
    public static void method633(byte arg0, int arg1, Class9_Sub1 arg2,
				 int arg3, boolean arg4, int arg5, int arg6) {
    while_460_:
	do {
	while_459_:
	    do {
		long l;
		do {
		    try {
			anInt4572++;
			l = (long) (arg6 + (arg3 << -2068478704));
			if (arg1 >= 98)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_459_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class14_Sub2_Sub9 class14_sub2_sub9
			    = ((Class14_Sub2_Sub9)
			       Class71.aClass55_1092.method1230(l, (byte) 82));
			if (null == class14_sub2_sub9)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_459_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class14_Sub2_Sub9 class14_sub2_sub9
			    = ((Class14_Sub2_Sub9)
			       Class14_Sub8_Sub2.aClass55_4112
				   .method1230(l, (byte) -101));
			if (class14_sub2_sub9 == null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_459_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class14_Sub2_Sub9 class14_sub2_sub9
			    = ((Class14_Sub2_Sub9)
			       Class7_Sub2_Sub1.aClass55_3698
				   .method1230(l, (byte) 39));
			if (null == class14_sub2_sub9)
			    break;
			if (arg4) {
			    class14_sub2_sub9.method246(-26366);
			    Class71.aClass55_1092
				.method1224(8, l, class14_sub2_sub9);
			    Class63.anInt998--;
			    Class14_Sub8_Sub32.anInt4612++;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_459_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg4)
			    break;
			Class14_Sub2_Sub9 class14_sub2_sub9
			    = ((Class14_Sub2_Sub9)
			       Class14_Sub8_Sub9.aClass55_4227
				   .method1230(l, (byte) -20));
			if (class14_sub2_sub9 == null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_459_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub9 class14_sub2_sub9
			= new Class14_Sub2_Sub9();
		    class14_sub2_sub9.aClass9_Sub1_3857 = arg2;
		    class14_sub2_sub9.aByte3862 = arg0;
		    class14_sub2_sub9.anInt3865 = arg5;
		    if (!arg4) {
			Class14_Sub8_Sub37.aClass81_4716
			    .method1401(false, class14_sub2_sub9);
			Class7_Sub2_Sub1.aClass55_3698
			    .method1224(8, l, class14_sub2_sub9);
			Class63.anInt998++;
		    } else {
			Class71.aClass55_1092.method1224(8, l,
							 class14_sub2_sub9);
			Class14_Sub8_Sub32.anInt4612++;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_460_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("qe.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	} while (false);
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt4582++;
	    if (arg1 >= -4)
		aBooleanArray4581 = null;
	    int[][] is_10_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628) {
		int[] is_11_ = method483(1, (byte) -27, arg0);
		int[] is_12_ = method483(2, (byte) -23, arg0);
		int[] is_13_ = is_10_[0];
		int[] is_14_ = is_10_[1];
		int[] is_15_ = is_10_[2];
		for (int i = 0; Class112.anInt1876 > i; i++) {
		    int i_16_ = (255 * is_11_[i] & 0xffcd7) >> -1398046132;
		    int i_17_ = is_12_[i] * anInt4578 >> 1823087148;
		    int i_18_ = (Class99_Sub2.anIntArray3357[i_16_] * i_17_
				 >> -616512468);
		    int i_19_
			= (Class14_Sub8_Sub21.anIntArray4435[i_16_] * i_17_
			   >> 1442737484);
		    int i_20_ = ((i_18_ >> -1077331764) + i
				 & Class14_Sub10_Sub1.anInt4882);
		    int i_21_
			= arg0 + (i_19_ >> -1824487156) & Class115.anInt1927;
		    int[][] is_22_ = method480(0, 0, i_21_);
		    is_13_[i] = is_22_[0][i_20_];
		    is_14_[i] = is_22_[1][i_20_];
		    is_15_[i] = is_22_[2][i_20_];
		}
	    }
	    is = is_10_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qe.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static int method634(int arg0, int arg1, int arg2, int arg3) {
    while_461_:
	do {
	    do {
		int i;
		try {
		    arg2 &= 0x3;
		    anInt4579++;
		    if (arg1 == -207592252)
			break;
		    i = 72;
		} catch (RuntimeException runtimeexception) {
		    break while_461_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-1 != (arg2 ^ 0xffffffff))
			break;
		    i = arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_461_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if ((arg2 ^ 0xffffffff) != -2)
			break;
		    i = arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_461_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (2 != arg2)
			break;
		    i = -arg3 + 1023;
		} catch (RuntimeException runtimeexception) {
		    break while_461_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = -arg0 + 1023;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qe.G(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public static void method635(int arg0) {
    while_463_:
	do {
	while_462_:
	    do {
		do {
		    try {
			aClass148Array4580 = null;
			if (arg0 < -40)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_462_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_4574 = null;
		    aBooleanArray4581 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_463_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "qe.D(" + arg0 + ')');
	} while (false);
    }
    
    public void method472(int arg0) {
	try {
	    anInt4573++;
	    if (arg0 != 0)
		anInt4578 = -99;
	    Class14_Sub2_Sub12.method321(256);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qe.I(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	    do {
		if (-1 != (i ^ 0xffffffff)) {
		    if ((i ^ 0xffffffff) != -2)
			break;
		} else {
		    anInt4578 = arg2.method784((byte) 109) << -985639804;
		    break;
		}
		aBoolean2862 = 1 == arg2.method798(arg1 ^ ~0x60b0);
	    } while (false);
	    if (arg1 != 24777)
		method484(-80, (byte) 11);
	    anInt4577++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qe.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method636(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4, Class9 arg5, int arg6) {
	try {
	    Class38.anInt2624 = arg0;
	    Class14_Sub15.anInt2989 = arg1;
	    Class14_Sub2_Sub11.anInt3889 = 1;
	    Class9_Sub1.aClass9_2696 = arg5;
	    Class14_Sub2_Sub13.anInt3930 = arg6;
	    anInt4576++;
	    if (arg2 != 25506)
		aClass148Array4580 = null;
	    Class35.aBoolean593 = arg4;
	    Class73.anInt1132 = arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qe.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ',' + arg6 + ')'));
	}
    }
    
    static {
	aClass124_4574 = Class14_Sub2_Sub2.method263(1178, "overlay2");
    }
}
