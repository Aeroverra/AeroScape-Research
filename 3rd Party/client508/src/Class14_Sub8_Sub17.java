/* Class14_Sub8_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.lang.reflect.Method;

public class Class14_Sub8_Sub17 extends Class14_Sub8
{
    public static int anInt4358;
    public static Class124 aClass124_4359;
    public static Class124 aClass124_4360;
    public static int anInt4361;
    public static Class124 aClass124_4362;
    public static Class124 aClass124_4363
	= Class14_Sub2_Sub2.method263(1178, "Take");
    public static int anInt4364;
    public static Class124 aClass124_4365;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4366;
    public static int anInt4367;
    public static Class124 aClass124_4368;
    public static int anInt4369;
    public static int anInt4370;
    public static Class9 aClass9_4371;
    public int[] anIntArray4372 = new int[257];
    public static int anInt4373;
    public static int anInt4374;
    public static int anInt4375;
    public int[][] anIntArrayArray4376;
    public static int anInt4377;
    public static int anInt4378;
    public static int anInt4379;
    public static int anInt4380;
    public static int anInt4381;
    
    public void method472(int arg0) {
	try {
	    if (null == anIntArrayArray4376)
		method567(true, 1);
	    if (arg0 != 0)
		method565(107);
	    anInt4380++;
	    method565(-27458);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.I(" + arg0 + ')');
	}
    }
    
    public void method565(int arg0) {
	try {
	    anInt4370++;
	    if (arg0 != -27458)
		method567(false, -71);
	    int i = anIntArrayArray4376.length;
	    if (i > 0) {
		for (int i_0_ = 0; -258 < (i_0_ ^ 0xffffffff); i_0_++) {
		    int i_1_ = 0;
		    int i_2_ = i_0_ << -1970329564;
		    for (int i_3_ = 0;
			 ((i_3_ ^ 0xffffffff) > (i ^ 0xffffffff)
			  && anIntArrayArray4376[i_3_][0] <= i_2_);
			 i_3_++)
			i_1_++;
		    int i_4_;
		    int i_5_;
		    int i_6_;
		    if ((i_1_ ^ 0xffffffff) <= (i ^ 0xffffffff)) {
			int[] is = anIntArrayArray4376[-1 + i];
			i_6_ = is[3];
			i_5_ = is[2];
			i_4_ = is[1];
		    } else {
			int[] is = anIntArrayArray4376[i_1_];
			if (i_1_ > 0) {
			    int[] is_7_ = anIntArrayArray4376[i_1_ - 1];
			    int i_8_ = ((i_2_ - is_7_[0] << 582765292)
					/ (is[0] - is_7_[0]));
			    int i_9_ = -i_8_ + 4096;
			    i_4_
				= i_9_ * is_7_[1] + i_8_ * is[1] >> 1481153420;
			    i_5_ = is_7_[2] * i_9_ + i_8_ * is[2] >> -9411604;
			    i_6_
				= i_9_ * is_7_[3] + i_8_ * is[3] >> -580079220;
			} else {
			    i_5_ = is[2];
			    i_4_ = is[1];
			    i_6_ = is[3];
			}
		    }
		    i_5_ >>= 4;
		    i_6_ >>= 4;
		    i_4_ >>= 4;
		    if (i_4_ >= 0) {
			if (255 < i_4_)
			    i_4_ = 255;
		    } else
			i_4_ = 0;
		    if (0 <= i_5_) {
			if (i_5_ > 255)
			    i_5_ = 255;
		    } else
			i_5_ = 0;
		    if ((i_6_ ^ 0xffffffff) > -1)
			i_6_ = 0;
		    else if (255 < i_6_)
			i_6_ = 255;
		    anIntArray4372[i_0_]
			= (Class66.method1294
			   (i_6_, Class66.method1294(i_5_ << 190366184,
						     i_4_ << 317045648)));
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.E(" + arg0 + ')');
	}
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_385_:
	do {
	    do {
		int[][] is;
		try {
		    anInt4375++;
		    if (arg1 < -4)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_385_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		int[][] is_10_ = aClass95_2838.method1481(1, arg0);
		if (aClass95_2838.aBoolean1628) {
		    int[] is_11_ = method483(0, (byte) -41, arg0);
		    int[] is_12_ = is_10_[0];
		    int[] is_13_ = is_10_[1];
		    int[] is_14_ = is_10_[2];
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
			 i++) {
			int i_15_ = is_11_[i] >> 885583620;
			if ((i_15_ ^ 0xffffffff) > -1)
			    i_15_ = 0;
			if (i_15_ > 256)
			    i_15_ = 256;
			i_15_ = anIntArray4372[i_15_];
			is_12_[i] = Class14_Sub8_Sub26
					.method617(4080, i_15_ >> -1016281236);
			is_13_[i] = Class14_Sub8_Sub26
					.method617(i_15_ >> -2145851900, 4080);
			is_14_[i] = Class14_Sub8_Sub26
					.method617(i_15_ << -1625400348, 4080);
		    }
		}
		is = is_10_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "kf.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method566(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4) {
    while_387_:
	do {
	while_386_:
	    do {
		do {
		    try {
			anInt4369++;
			if (Class126.method1741((byte) -101, arg1))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_386_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub15.method340((Class1.aClass94ArrayArray75
						  [arg1]),
						 arg4, arg2, arg0, (byte) 125,
						 arg3);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_387_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("kf.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public void method567(boolean arg0, int arg1) {
	try {
	    anInt4381++;
	while_392_:
	    do {
		if (-1 != (arg1 ^ 0xffffffff)) {
		    int i = arg1;
		while_391_:
		    do {
		    while_390_:
			do {
			while_389_:
			    do {
			    while_388_:
				do {
				    do {
					if (i != 1) {
					    if (-3 != (i ^ 0xffffffff)) {
						if (i != 3) {
						    if (i != 4) {
							if ((i ^ 0xffffffff)
							    != -6) {
							    if (i != 6)
								break while_391_;
							} else
							    break while_389_;
							break while_390_;
						    }
						} else
						    break;
						break while_388_;
					    }
					} else {
					    anIntArrayArray4376
						= new int[2][4];
					    anIntArrayArray4376[0][0] = 0;
					    anIntArrayArray4376[1][0] = 4096;
					    anIntArrayArray4376[0][3] = 0;
					    anIntArrayArray4376[0][1] = 0;
					    anIntArrayArray4376[0][2] = 0;
					    anIntArrayArray4376[1][1] = 4096;
					    anIntArrayArray4376[1][3] = 4096;
					    anIntArrayArray4376[1][2] = 4096;
					    break while_392_;
					}
					anIntArrayArray4376 = new int[8][4];
					anIntArrayArray4376[0][0] = 0;
					anIntArrayArray4376[1][0] = 2867;
					anIntArrayArray4376[2][0] = 3072;
					anIntArrayArray4376[0][3] = 2361;
					anIntArrayArray4376[1][3] = 1558;
					anIntArrayArray4376[3][0] = 3276;
					anIntArrayArray4376[4][0] = 3481;
					anIntArrayArray4376[0][1] = 2650;
					anIntArrayArray4376[0][2] = 2602;
					anIntArrayArray4376[5][0] = 3686;
					anIntArrayArray4376[6][0] = 3891;
					anIntArrayArray4376[1][1] = 2313;
					anIntArrayArray4376[7][0] = 4096;
					anIntArrayArray4376[2][3] = 1413;
					anIntArrayArray4376[2][1] = 2618;
					anIntArrayArray4376[3][3] = 947;
					anIntArrayArray4376[4][3] = 722;
					anIntArrayArray4376[5][3] = 1766;
					anIntArrayArray4376[3][1] = 2296;
					anIntArrayArray4376[4][1] = 2072;
					anIntArrayArray4376[6][3] = 915;
					anIntArrayArray4376[5][1] = 2730;
					anIntArrayArray4376[1][2] = 1799;
					anIntArrayArray4376[7][3] = 1140;
					anIntArrayArray4376[2][2] = 1734;
					anIntArrayArray4376[3][2] = 1220;
					anIntArrayArray4376[4][2] = 963;
					anIntArrayArray4376[6][1] = 2232;
					anIntArrayArray4376[7][1] = 1686;
					anIntArrayArray4376[5][2] = 2152;
					anIntArrayArray4376[6][2] = 1060;
					anIntArrayArray4376[7][2] = 1413;
					break while_392_;
				    } while (false);
				    anIntArrayArray4376 = new int[7][4];
				    anIntArrayArray4376[0][2] = 0;
				    anIntArrayArray4376[0][3] = 4096;
				    anIntArrayArray4376[0][1] = 0;
				    anIntArrayArray4376[1][3] = 4096;
				    anIntArrayArray4376[1][1] = 0;
				    anIntArrayArray4376[2][3] = 0;
				    anIntArrayArray4376[0][0] = 0;
				    anIntArrayArray4376[3][3] = 0;
				    anIntArrayArray4376[1][2] = 4096;
				    anIntArrayArray4376[2][2] = 4096;
				    anIntArrayArray4376[1][0] = 663;
				    anIntArrayArray4376[4][3] = 0;
				    anIntArrayArray4376[3][2] = 4096;
				    anIntArrayArray4376[2][0] = 1363;
				    anIntArrayArray4376[2][1] = 0;
				    anIntArrayArray4376[3][1] = 4096;
				    anIntArrayArray4376[5][3] = 4096;
				    anIntArrayArray4376[6][3] = 4096;
				    anIntArrayArray4376[4][2] = 0;
				    anIntArrayArray4376[3][0] = 2048;
				    anIntArrayArray4376[4][1] = 4096;
				    anIntArrayArray4376[4][0] = 2727;
				    anIntArrayArray4376[5][2] = 0;
				    anIntArrayArray4376[5][0] = 3411;
				    anIntArrayArray4376[6][2] = 0;
				    anIntArrayArray4376[6][0] = 4096;
				    anIntArrayArray4376[5][1] = 4096;
				    anIntArrayArray4376[6][1] = 0;
				    break while_392_;
				} while (false);
				anIntArrayArray4376 = new int[6][4];
				anIntArrayArray4376[0][1] = 0;
				anIntArrayArray4376[1][1] = 0;
				anIntArrayArray4376[0][0] = 0;
				anIntArrayArray4376[0][3] = 0;
				anIntArrayArray4376[1][0] = 1843;
				anIntArrayArray4376[1][3] = 1493;
				anIntArrayArray4376[2][3] = 2939;
				anIntArrayArray4376[2][1] = 0;
				anIntArrayArray4376[2][0] = 2457;
				anIntArrayArray4376[3][1] = 0;
				anIntArrayArray4376[4][1] = 546;
				anIntArrayArray4376[3][3] = 3565;
				anIntArrayArray4376[0][2] = 0;
				anIntArrayArray4376[3][0] = 2781;
				anIntArrayArray4376[1][2] = 0;
				anIntArrayArray4376[5][1] = 4096;
				anIntArrayArray4376[4][3] = 4031;
				anIntArrayArray4376[4][0] = 3481;
				anIntArrayArray4376[2][2] = 0;
				anIntArrayArray4376[5][3] = 4096;
				anIntArrayArray4376[3][2] = 1124;
				anIntArrayArray4376[4][2] = 3084;
				anIntArrayArray4376[5][0] = 4096;
				anIntArrayArray4376[5][2] = 4096;
				break while_392_;
			    } while (false);
			    anIntArrayArray4376 = new int[16][4];
			    anIntArrayArray4376[0][2] = 192;
			    anIntArrayArray4376[1][2] = 449;
			    anIntArrayArray4376[0][3] = 321;
			    anIntArrayArray4376[2][2] = 690;
			    anIntArrayArray4376[0][0] = 0;
			    anIntArrayArray4376[1][0] = 155;
			    anIntArrayArray4376[2][0] = 389;
			    anIntArrayArray4376[3][0] = 671;
			    anIntArrayArray4376[0][1] = 80;
			    anIntArrayArray4376[4][0] = 897;
			    anIntArrayArray4376[3][2] = 995;
			    anIntArrayArray4376[4][2] = 1397;
			    anIntArrayArray4376[1][1] = 321;
			    anIntArrayArray4376[5][0] = 1175;
			    anIntArrayArray4376[1][3] = 562;
			    anIntArrayArray4376[2][1] = 578;
			    anIntArrayArray4376[5][2] = 1429;
			    anIntArrayArray4376[6][0] = 1368;
			    anIntArrayArray4376[7][0] = 1507;
			    anIntArrayArray4376[2][3] = 803;
			    anIntArrayArray4376[8][0] = 1736;
			    anIntArrayArray4376[9][0] = 2088;
			    anIntArrayArray4376[3][3] = 1140;
			    anIntArrayArray4376[6][2] = 1461;
			    anIntArrayArray4376[10][0] = 2355;
			    anIntArrayArray4376[11][0] = 2691;
			    anIntArrayArray4376[3][1] = 947;
			    anIntArrayArray4376[7][2] = 1525;
			    anIntArrayArray4376[4][3] = 1509;
			    anIntArrayArray4376[8][2] = 1590;
			    anIntArrayArray4376[4][1] = 1285;
			    anIntArrayArray4376[5][1] = 1525;
			    anIntArrayArray4376[5][3] = 1413;
			    anIntArrayArray4376[6][3] = 1333;
			    anIntArrayArray4376[12][0] = 3031;
			    anIntArrayArray4376[9][2] = 2056;
			    anIntArrayArray4376[6][1] = 1734;
			    anIntArrayArray4376[13][0] = 3522;
			    anIntArrayArray4376[7][3] = 1702;
			    anIntArrayArray4376[7][1] = 1413;
			    anIntArrayArray4376[8][1] = 1108;
			    anIntArrayArray4376[14][0] = 3727;
			    anIntArrayArray4376[10][2] = 2586;
			    anIntArrayArray4376[9][1] = 1766;
			    anIntArrayArray4376[15][0] = 4096;
			    anIntArrayArray4376[8][3] = 2056;
			    anIntArrayArray4376[11][2] = 3148;
			    anIntArrayArray4376[12][2] = 3710;
			    anIntArrayArray4376[13][2] = 3421;
			    anIntArrayArray4376[14][2] = 3148;
			    anIntArrayArray4376[9][3] = 2666;
			    anIntArrayArray4376[10][3] = 3276;
			    anIntArrayArray4376[11][3] = 3228;
			    anIntArrayArray4376[15][2] = 2505;
			    anIntArrayArray4376[10][1] = 2409;
			    anIntArrayArray4376[11][1] = 3116;
			    anIntArrayArray4376[12][1] = 3806;
			    anIntArrayArray4376[13][1] = 3437;
			    anIntArrayArray4376[12][3] = 3196;
			    anIntArrayArray4376[13][3] = 3019;
			    anIntArrayArray4376[14][1] = 3116;
			    anIntArrayArray4376[15][1] = 2377;
			    anIntArrayArray4376[14][3] = 3228;
			    anIntArrayArray4376[15][3] = 2746;
			    break while_392_;
			} while (false);
			anIntArrayArray4376 = new int[4][4];
			anIntArrayArray4376[0][3] = 0;
			anIntArrayArray4376[0][0] = 2048;
			anIntArrayArray4376[1][0] = 2867;
			anIntArrayArray4376[0][2] = 4096;
			anIntArrayArray4376[1][3] = 0;
			anIntArrayArray4376[2][0] = 3276;
			anIntArrayArray4376[0][1] = 0;
			anIntArrayArray4376[3][0] = 4096;
			anIntArrayArray4376[1][2] = 4096;
			anIntArrayArray4376[2][3] = 0;
			anIntArrayArray4376[3][3] = 0;
			anIntArrayArray4376[1][1] = 4096;
			anIntArrayArray4376[2][2] = 4096;
			anIntArrayArray4376[2][1] = 4096;
			anIntArrayArray4376[3][2] = 0;
			anIntArrayArray4376[3][1] = 4096;
			break while_392_;
		    } while (false);
		    throw new RuntimeException("Invalid gradient preset");
		}
	    } while (false);
	    if (arg0 != true)
		aClass124_4360 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kf.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method568(int arg0) {
	try {
	    Class56.method1240();
	    int i = 0;
	    if (arg0 != 4)
		anInt4378 = 6;
	    for (/**/; i < 4; i++)
		Class14_Sub21.aClass32Array3100[i].method1071(true);
	    System.gc();
	    anInt4373++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.L(" + arg0 + ')');
	}
    }
    
    public static void method569(int arg0) {
	try {
	    if (arg0 > -79)
		method568(-112);
	    anInt4374++;
	    Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(11);
	    Class14_Sub2_Sub11.anInt3889 = 1;
	    Class9_Sub1.aClass9_2696 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.H(" + arg0 + ')');
	}
    }
    
    public static void method570(int arg0) {
	try {
	    aClass9_4371 = null;
	    if (arg0 != 4)
		method572(null, true);
	    aClass124_4359 = null;
	    aClass124_4363 = null;
	    aClass124_4365 = null;
	    aClass124_4362 = null;
	    aClass124_4360 = null;
	    aClass124_4368 = null;
	    aClass14_Sub2_Sub19Array4366 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.G(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_394_:
	do {
	while_393_:
	    do {
		do {
		    try {
			anInt4358++;
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_393_;
		    }
		    return;
		} while (false);
		try {
		    if (0 == arg0) {
			int i = arg2.method798(107);
			if ((i ^ 0xffffffff) == -1) {
			    anIntArrayArray4376
				= new int[arg2.method798(-27)][4];
			    for (int i_16_ = 0;
				 anIntArrayArray4376.length > i_16_; i_16_++) {
				anIntArrayArray4376[i_16_][0]
				    = arg2.method784((byte) 115);
				anIntArrayArray4376[i_16_][1]
				    = arg2.method798(66) << 629259364;
				anIntArrayArray4376[i_16_][2]
				    = arg2.method798(-42) << -581633948;
				anIntArrayArray4376[i_16_][3]
				    = arg2.method798(77) << -379750908;
			    }
			} else
			    method567(true, i);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_394_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("kf.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub17() {
	super(1, false);
    }
    
    public static void method571(boolean arg0) {
	try {
	    if (arg0)
		method572(null, true);
	    for (int i = 0; Class64.anInt1012 > i; i++) {
		int i_17_ = Class14_Sub2_Sub7.anIntArray3825[i];
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_17_];
		int i_18_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method798(102);
		if ((i_18_ & 0x10) != 0)
		    i_18_ += Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method798(60) << 100054888;
		Class118.method1603(1, class133_sub1_sub1, i_18_, i_17_);
	    }
	    anInt4364++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kf.J(" + arg0 + ')');
	}
    }
    
    public static void method572(Component arg0, boolean arg1) {
	try {
	    anInt4361++;
	    Method method = Class43.aMethod707;
	    if (arg1)
		method566(-35, 74, -4, -122, true);
	    if (method != null) {
		try {
		    method.invoke(arg0, new Object[] { Boolean.FALSE });
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	    arg0.addKeyListener(Class14_Sub8_Sub9.aClass141_4239);
	    arg0.addFocusListener(Class14_Sub8_Sub9.aClass141_4239);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kf.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    static {
	aClass124_4362 = Class14_Sub2_Sub2.method263(1178, "mem=");
	aClass124_4360 = Class14_Sub2_Sub2.method263(1178, " (X");
	aClass124_4359 = Class14_Sub2_Sub2.method263(1178, "<col=00ffff>");
	anInt4378 = 0;
	aClass124_4365
	    = Class14_Sub2_Sub2
		  .method263(1178, "Spieler kann nicht gefunden werden: ");
	aClass124_4368 = aClass124_4363;
    }
}
