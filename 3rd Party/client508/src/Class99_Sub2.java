/* Class99_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99_Sub2 extends Class99
{
    public static int anInt3334;
    public long[] aLongArray3335 = new long[10];
    public int anInt3336;
    public static Class124 aClass124_3337;
    public static int anInt3338;
    public static int anInt3339;
    public static int anInt3340;
    public long aLong3341;
    public static int anInt3342;
    public static int anInt3343;
    public static int anInt3344;
    public static int anInt3345;
    public static int anInt3346;
    public static Class124 aClass124_3347
	= Class14_Sub2_Sub2.method263(1178, "Konfig geladen)3");
    public static int anInt3348;
    public static int anInt3349;
    public static int anInt3350;
    public static Class124 aClass124_3351;
    public static int anInt3352 = 1;
    public static Class124 aClass124_3353
	= Class14_Sub2_Sub2.method263(1178, "W-=hlen Sie eine Option");
    public static byte[][][] aByteArrayArrayArray3354;
    public int anInt3355;
    public int anInt3356;
    public static int[] anIntArray3357;
    public static Class148_Sub1[] aClass148_Sub1Array3358;
    public int anInt3359;
    
    public static void method1505(boolean arg0) {
    while_1015_:
	do {
	while_1014_:
	    do {
		do {
		    try {
			anInt3350++;
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1014_;
		    }
		    return;
		} while (false);
		try {
		    Class125.aClass52_2075.method1203((byte) -113);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1015_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hb.E(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1506(Object[] arg0, long[] arg1, boolean arg2) {
	try {
	    Class141.method1963(0, arg0, -1 + arg1.length, (byte) 85, arg1);
	    if (arg2 != true)
		aClass124_3351 = null;
	    anInt3349++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hb.I("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static Class14_Sub2_Sub8 method1507(int arg0, int arg1) {
    while_1016_:
	do {
	    do {
		Class14_Sub2_Sub8 class14_sub2_sub8;
		try {
		    if (arg0 == -8475)
			break;
		    class14_sub2_sub8 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1016_;
		}
		return class14_sub2_sub8;
	    } while (false);
	    do {
		Class14_Sub2_Sub8 class14_sub2_sub8;
		try {
		    anInt3342++;
		    Class14_Sub2_Sub8 class14_sub2_sub8_0_
			= ((Class14_Sub2_Sub8)
			   Class26.aClass20_495.method974((long) arg1,
							  arg0 + 8475));
		    if (class14_sub2_sub8_0_ == null)
			break;
		    class14_sub2_sub8 = class14_sub2_sub8_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1016_;
		}
		return class14_sub2_sub8;
	    } while (false);
	    Class14_Sub2_Sub8 class14_sub2_sub8;
	    try {
		byte[] is = (Class14_Sub2_Sub5.aClass9_3817.method163
			     (Class7.method118((byte) 68, arg1),
			      Class14_Sub19.method890(arg1, 2), 0));
		Class14_Sub2_Sub8 class14_sub2_sub8_1_
		    = new Class14_Sub2_Sub8();
		if (null != is)
		    class14_sub2_sub8_1_.method290(true,
						   new Class14_Sub10(is));
		Class26.aClass20_495.method971(-1, class14_sub2_sub8_1_,
					       (long) arg1);
		class14_sub2_sub8 = class14_sub2_sub8_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub8;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "hb.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method1501(int arg0, int arg1, int arg2) {
	int i;
	try {
	    anInt3339++;
	    int i_2_ = anInt3336;
	    int i_3_ = anInt3359;
	    anInt3336 = 1;
	    anInt3359 = 300;
	    if (arg1 != -1)
		method1511(85, 74, -128, 31, 102, -72, -95);
	    aLong3341 = Class84.method1413((byte) 120);
	    if (0L == aLongArray3335[anInt3356]) {
		anInt3359 = i_3_;
		anInt3336 = i_2_;
	    } else if (aLong3341 > aLongArray3335[anInt3356])
		anInt3359 = (int) ((long) (2560 * arg2)
				   / (-aLongArray3335[anInt3356] + aLong3341));
	    if ((anInt3359 ^ 0xffffffff) > -26)
		anInt3359 = 25;
	    if (256 < anInt3359) {
		anInt3359 = 256;
		anInt3336
		    = (int) (-((aLong3341 + -aLongArray3335[anInt3356]) / 10L)
			     + (long) arg2);
	    }
	    if ((anInt3336 ^ 0xffffffff) < (arg2 ^ 0xffffffff))
		anInt3336 = arg2;
	    aLongArray3335[anInt3356] = aLong3341;
	    anInt3356 = (anInt3356 + 1) % 10;
	    if (-2 > (anInt3336 ^ 0xffffffff)) {
		for (int i_4_ = 0; -11 < (i_4_ ^ 0xffffffff); i_4_++) {
		    if ((aLongArray3335[i_4_] ^ 0xffffffffffffffffL) != -1L)
			aLongArray3335[i_4_]
			    = aLongArray3335[i_4_] - -(long) anInt3336;
		}
	    }
	    if ((anInt3336 ^ 0xffffffff) > (arg0 ^ 0xffffffff))
		anInt3336 = arg0;
	    int i_5_ = 0;
	    Class14_Sub13.method864((long) anInt3336, (byte) 64);
	    for (/**/; (anInt3355 ^ 0xffffffff) > -257; anInt3355 += anInt3359)
		i_5_++;
	    anInt3355 &= 0xff;
	    i = i_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hb.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public static void method1508(byte arg0) {
    while_1018_:
	do {
	while_1017_:
	    do {
		do {
		    try {
			anInt3346++;
			if ((Class62.anInt990 ^ 0xffffffff) >= -1)
			    break;
			Class14_Sub1.method238((byte) 78);
		    } catch (RuntimeException runtimeexception) {
			break while_1017_;
		    }
		    return;
		} while (false);
		try {
		    Class21.aClass36_441 = Class14_Sub15.aClass36_2990;
		    Class14_Sub15.aClass36_2990 = null;
		    if (arg0 <= 87)
			method1508((byte) 102);
		    Class126.method1743(27252, 40);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1018_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hb.C(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1509(int arg0) {
    while_1020_:
	do {
	while_1019_:
	    do {
		do {
		    try {
			anIntArray3357 = null;
			aClass124_3337 = null;
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1019_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_3347 = null;
		    aClass124_3353 = null;
		    aClass124_3351 = null;
		    aByteArrayArrayArray3354 = null;
		    aClass148_Sub1Array3358 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1020_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hb.F(" + arg0 + ')');
	} while (false);
    }
    
    public void method1504(byte arg0) {
	try {
	    for (int i = 0; (i ^ 0xffffffff) > -11; i++)
		aLongArray3335[i] = 0L;
	    anInt3343++;
	    if (arg0 >= -54)
		aByteArrayArrayArray3354 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hb.A(" + arg0 + ')');
	}
    }
    
    public static void method1510(int arg0, int arg1, byte arg2, int arg3,
				  int arg4, int arg5) {
    while_1023_:
	do {
	while_1022_:
	    do {
		int i;
		int i_6_;
	    while_1021_:
		do {
		    do {
			try {
			    anInt3340++;
			    i = -arg4 + arg3;
			    i_6_ = arg0 + -arg5;
			    if (0 == i)
				break;
			    if (i_6_ != 0)
				break while_1021_;
			    Class64.method1285(arg5, arg3, arg4, arg1,
					       (byte) -115);
			} catch (RuntimeException runtimeexception) {
			    break while_1022_;
			}
			return;
		    } while (false);
		    try {
			if (-1 != (i_6_ ^ 0xffffffff))
			    Class19.method966(arg0, arg1, arg4, (byte) 112,
					      arg5);
		    } catch (RuntimeException runtimeexception) {
			break while_1022_;
		    }
		    return;
		} while (false);
		try {
		    int i_7_ = -55 / ((arg2 - 21) / 42);
		    int i_8_ = (i_6_ << -893759284) / i;
		    int i_9_ = -(arg4 * i_8_ >> -263690836) + arg5;
		    int i_10_;
		    int i_11_;
		    if (Class118.anInt1982 <= arg4) {
			if (Class14_Sub8_Sub14.anInt4327 < arg4) {
			    i_11_ = (Class14_Sub8_Sub14.anInt4327 * i_8_
				     >> 1218691180) + i_9_;
			    i_10_ = Class14_Sub8_Sub14.anInt4327;
			} else {
			    i_10_ = arg4;
			    i_11_ = arg5;
			}
		    } else {
			i_10_ = Class118.anInt1982;
			i_11_ = i_9_ + (Class118.anInt1982 * i_8_
					>> -1899503220);
		    }
		    int i_12_;
		    int i_13_;
		    if (Class118.anInt1982 <= arg3) {
			if ((arg3 ^ 0xffffffff)
			    >= (Class14_Sub8_Sub14.anInt4327 ^ 0xffffffff)) {
			    i_13_ = arg0;
			    i_12_ = arg3;
			} else {
			    i_13_ = (i_8_ * Class14_Sub8_Sub14.anInt4327
				     >> -675459956) + i_9_;
			    i_12_ = Class14_Sub8_Sub14.anInt4327;
			}
		    } else {
			i_12_ = Class118.anInt1982;
			i_13_ = ((Class118.anInt1982 * i_8_ >> -1803849044)
				 + i_9_);
		    }
		    if ((Class14_Sub17.anInt3005 ^ 0xffffffff)
			>= (i_11_ ^ 0xffffffff)) {
			if (i_11_ > Class59.anInt955) {
			    i_10_ = ((-i_9_ + Class59.anInt955 << 1990163020)
				     / i_8_);
			    i_11_ = Class59.anInt955;
			}
		    } else {
			i_11_ = Class14_Sub17.anInt3005;
			i_10_ = (-i_9_ + Class14_Sub17.anInt3005
				 << -2131902100) / i_8_;
		    }
		    if ((Class14_Sub17.anInt3005 ^ 0xffffffff)
			>= (i_13_ ^ 0xffffffff)) {
			if (i_13_ > Class59.anInt955) {
			    i_12_ = ((Class59.anInt955 - i_9_ << 896219340)
				     / i_8_);
			    i_13_ = Class59.anInt955;
			}
		    } else {
			i_13_ = Class14_Sub17.anInt3005;
			i_12_ = (Class14_Sub17.anInt3005 - i_9_
				 << -1036622100) / i_8_;
		    }
		    Class14_Sub8_Sub32.method652(i_13_, 63, i_12_, arg1, i_10_,
						 i_11_);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1023_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("hb.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	} while (false);
    }
    
    public Class99_Sub2() {
	try {
	    anInt3355 = 0;
	    anInt3336 = 1;
	    anInt3359 = 256;
	    aLong3341 = Class84.method1413((byte) -125);
	    for (int i = 0; -11 < (i ^ 0xffffffff); i++)
		aLongArray3335[i] = aLong3341;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hb.<init>()");
	}
    }
    
    public static int method1511(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
    while_1024_:
	do {
	    do {
		int i;
		try {
		    arg6 &= 0x3;
		    anInt3345++;
		    if (1 == (arg5 & 0x1)) {
			int i_14_ = arg0;
			arg0 = arg2;
			arg2 = i_14_;
		    }
		    if (arg6 != 0)
			break;
		    i = arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_1024_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (1 != arg6)
			break;
		    i = arg4;
		} catch (RuntimeException runtimeexception) {
		    break while_1024_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg1 != -675459956)
			method1509(-5);
		    if (arg6 != 2)
			break;
		    i = -arg3 + 7 + (1 + -arg0);
		} catch (RuntimeException runtimeexception) {
		    break while_1024_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = -arg2 + (8 - arg4);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("hb.G(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ')'));
    }
    
    static {
	aClass124_3337 = Class14_Sub2_Sub2.method263(1178, "gleiten:");
	anInt3334 = 0;
	aClass124_3351 = Class14_Sub2_Sub2.method263(1178, "Fps:");
    }
}
