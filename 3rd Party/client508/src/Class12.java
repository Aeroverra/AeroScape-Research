/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class12
{
    public static int anInt273;
    public static int anInt274;
    public int anInt275;
    public int anInt276;
    public int anInt277;
    public static Class124 aClass124_278;
    public int anInt279;
    public short aShort280;
    public int anInt281;
    public static long aLong282;
    public static int anInt283;
    public int anInt284;
    public short aShort285;
    public int anInt286;
    public boolean aBoolean287 = true;
    public static int anInt288;
    public int anInt289;
    public byte aByte290;
    public Class124[] aClass124Array291;
    public int anInt292;
    public int anInt293;
    public static int anInt294;
    public int anInt295;
    public int anInt296 = -1;
    public int anInt297;
    public static int anInt298;
    public static int anInt299;
    public static int anInt300;
    public int anInt301;
    public Class124 aClass124_302;
    public int anInt303;
    public Class55 aClass55_304;
    public short[] aShortArray305;
    public int anInt306;
    public boolean aBoolean307;
    public boolean aBoolean308;
    public int[] anIntArray309;
    public static byte[][] aByteArrayArray310;
    public static Class124 aClass124_311;
    public static int anInt312;
    public short aShort313;
    public short[] aShortArray314;
    public short aShort315;
    public int[][] anIntArrayArray316;
    public short[] aShortArray317;
    public int anInt318;
    public short[] aShortArray319;
    public static short[] aShortArray320 = { 6798, 8741, 25238, 4626, 4550 };
    public byte aByte321;
    public static int anInt322;
    public int anInt323;
    public static int anInt324;
    public static int anInt325;
    public int anInt326;
    public static int anInt327;
    public static Class124 aClass124_328;
    public int[] anIntArray329;
    public boolean aBoolean330;
    public byte aByte331;
    public static Class9 aClass9_332;
    public byte[] aByteArray333;
    public int anInt334;
    public int anInt335;
    public static int anInt336;
    public int anInt337;
    public int[] anIntArray338;
    public int anInt339;
    public static int anInt340;
    public static int anInt341;
    public boolean aBoolean342;
    
    public Class133_Sub7 method209(int arg0, int arg1, Class46 arg2,
				   Class46 arg3, int arg4) {
	try {
    while_2_:
	do {
	while_0_:
	    do {
		Class12 class12;
		do {
		Class133_Sub7 class133_sub7_0_;
		    try {
			anInt327++;
			if (arg4 > -29)
			    method213(98, 38, null, (byte) -10, -46, null,
				      null, -116);
			if (null == anIntArray329)
			    break while_0_;
			class12 = method217((byte) -18);
			if (class12 != null)
			    break;
			class133_sub7_0_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_2_;
		    }
		    return class133_sub7_0_;
		} while (false);
		Class133_Sub7 class133_sub7_1_;
		try {
		    class133_sub7_1_ = class12.method209(arg0, arg1, arg2, arg3, -30);
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return class133_sub7_1_;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	while_1_:
	    do {
		do {
		Class133_Sub7 class133_sub7_2_;
		    try {
			class133_sub7
			    = ((Class133_Sub7)
			       Class37.aClass52_635
				   .method1210((byte) 122, (long) anInt337));
			if (class133_sub7 != null)
			    break while_1_;
			boolean bool = false;
			for (int i = 0; i < anIntArray309.length; i++) {
			    if (!Class20.aClass9_429.method158(0,
							       (anIntArray309
								[i]),
							       (byte) 109))
				bool = true;
			}
			if (!bool)
			    break;
			class133_sub7_2_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_2_;
		    }
		    return class133_sub7_2_;
		} while (false);
		try {
		    Class133_Sub2[] class133_sub2s
			= new Class133_Sub2[anIntArray309.length];
		    for (int i = 0; i < anIntArray309.length; i++) {
			class133_sub2s[i]
			    = Class133_Sub2.method1824(Class20.aClass9_429,
						       anIntArray309[i], 0);
			if (anIntArrayArray316 != null
			    && anIntArrayArray316[i] != null
			    && null != class133_sub2s[i])
			    class133_sub2s[i].method1825
				(anIntArrayArray316[i][0],
				 anIntArrayArray316[i][1],
				 anIntArrayArray316[i][2]);
		    }
		    Class133_Sub2 class133_sub2;
		    if ((class133_sub2s.length ^ 0xffffffff) == -2)
			class133_sub2 = class133_sub2s[0];
		    else
			class133_sub2
			    = new Class133_Sub2(class133_sub2s,
						class133_sub2s.length);
		    if (null != aShortArray319) {
			for (int i = 0;
			     ((i ^ 0xffffffff)
			      > (aShortArray319.length ^ 0xffffffff));
			     i++) {
			    if (aByteArray333 == null
				|| (i ^ 0xffffffff) <= (aByteArray333.length
							^ 0xffffffff))
				class133_sub2.method1813(aShortArray319[i],
							 aShortArray317[i]);
			    else
				class133_sub2.method1813(aShortArray319[i],
							 (Class14_Sub8_Sub39
							  .aShortArray4747
							  [(0xff
							    & (aByteArray333
							       [i]))]));
			}
		    }
		    if (null != aShortArray314) {
			for (int i = 0; i < aShortArray314.length; i++)
			    class133_sub2.method1819(aShortArray314[i],
						     aShortArray305[i]);
		    }
		    class133_sub7 = class133_sub2.method1827(64 + anInt275,
							     850 + anInt279,
							     -30, -50, -30);
		    ((Class133_Sub7_Sub2) class133_sub7).method1895
			(false, false, false, true, false, false, true);
		    Class37.aClass52_635.method1205((byte) -93, class133_sub7,
						    (long) anInt337);
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
	    } while (false);
	    Class133_Sub7 class133_sub7_0_;
	    if (null == arg2 || arg3 == null) {
		if (arg2 == null) {
		    if (null != arg3)
			class133_sub7_0_
			    = arg3.method1168((byte) 126, arg0, class133_sub7);
		    else
			class133_sub7_0_
			    = class133_sub7.method1860(true, true);
		} else
		    class133_sub7_0_
			= arg2.method1168((byte) 122, arg1, class133_sub7);
	    } else
		class133_sub7_0_ = arg2.method1178(arg0, (byte) 46, arg1,
						   class133_sub7, arg3);
	    if ((anInt335 ^ 0xffffffff) != -129 || 128 != anInt297)
		class133_sub7_0_.method1869(anInt335, anInt297, anInt335);
	    return class133_sub7_0_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bi.D(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ',' + arg4 + ')'));
	}
	return null;
    }
    
    public static void method210(Class6 arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, boolean arg7) {
	int i = arg0.anIntArray164.length;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = arg0.anIntArray164[i_1_] - Class4.anInt125;
	    int i_3_ = arg0.anIntArray158[i_1_] - Class14_Sub2.anInt2741;
	    int i_4_ = arg0.anIntArray155[i_1_] - Class14_Sub2_Sub8.anInt3853;
	    int i_5_ = i_4_ * arg3 + i_2_ * arg4 >> 16;
	    i_4_ = i_4_ * arg4 - i_2_ * arg3 >> 16;
	    i_2_ = i_5_;
	    i_5_ = i_3_ * arg2 - i_4_ * arg1 >> 16;
	    i_4_ = i_3_ * arg1 + i_4_ * arg2 >> 16;
	    i_3_ = i_5_;
	    if (i_4_ < 50)
		return;
	    if (arg0.anIntArray168 != null) {
		Class6.anIntArray153[i_1_] = i_2_;
		Class6.anIntArray159[i_1_] = i_3_;
		Class6.anIntArray162[i_1_] = i_4_;
	    }
	    Class6.anIntArray161[i_1_] = Class3.anInt118 + (i_2_ << 9) / i_4_;
	    Class6.anIntArray148[i_1_] = Class3.anInt110 + (i_3_ << 9) / i_4_;
	}
	Class3.anInt116 = 0;
	i = arg0.anIntArray163.length;
	for (int i_6_ = 0; i_6_ < i; i_6_++) {
	    int i_7_ = arg0.anIntArray163[i_6_];
	    int i_8_ = arg0.anIntArray149[i_6_];
	    int i_9_ = arg0.anIntArray165[i_6_];
	    int i_10_ = Class6.anIntArray161[i_7_];
	    int i_11_ = Class6.anIntArray161[i_8_];
	    int i_12_ = Class6.anIntArray161[i_9_];
	    int i_13_ = Class6.anIntArray148[i_7_];
	    int i_14_ = Class6.anIntArray148[i_8_];
	    int i_15_ = Class6.anIntArray148[i_9_];
	    if (((i_10_ - i_11_) * (i_15_ - i_14_)
		 - (i_13_ - i_14_) * (i_12_ - i_11_)) > 0
		&& Class142.aBoolean2299
		&& Class14_Sub8_Sub13.method549((Class14_Sub19.anInt3073
						 + Class3.anInt118),
						(Class99_Sub2.anInt3334
						 + Class3.anInt110),
						i_13_, i_14_, i_15_, i_10_,
						i_11_, i_12_)) {
		Class66.anInt1039 = arg5;
		Class14_Sub8_Sub33.anInt4636 = arg6;
	    }
	}
    }
    
    public static void method211(byte arg0) {
	try {
	    if (arg0 > -56)
		method218(-79, 11, -39, 15, -68, -65, 100, -45);
	    aShortArray320 = null;
	    aClass124_278 = null;
	    aClass124_328 = null;
	    aClass9_332 = null;
	    aByteArrayArray310 = null;
	    aClass124_311 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bi.C(" + arg0 + ')');
	}
    }
    
    public boolean method212(byte arg0) {
	try {
    while_3_:
	do {
	    do {
		boolean bool_0_;
		try {
		    anInt336++;
		    if (anIntArray329 != null)
			break;
		    bool_0_ = (anInt289 != -1 || (anInt301 ^ 0xffffffff) != 0
			  || anInt292 != -1);
		} catch (RuntimeException runtimeexception) {
		    break while_3_;
		}
		return bool_0_;
	    } while (false);
	    int i;
	    try {
		if (arg0 >= -118)
		    method209(-80, -20, null, null, 21);
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (anIntArray329.length > i) {
		if (-1 != anIntArray329[i]) {
		    Class12 class12
			= Class126.method1744(anIntArray329[i], 170);
		    if ((class12.anInt289 ^ 0xffffffff) != 0
			|| class12.anInt301 != -1 || -1 != class12.anInt292)
			return true;
		}
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_3_;
		}
	    }
	    return false;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "bi.G(" + arg0 + ')');
	}
	return false;
    }
    
    public static void method213(int arg0, int arg1, Class79 arg2, byte arg3,
				 int arg4, Class133_Sub1_Sub1 arg5,
				 Class133_Sub1_Sub2 arg6, int arg7) {
	try {
	    Class14_Sub3 class14_sub3 = new Class14_Sub3();
	    if (arg3 != -35)
		method221(96, -74, (byte) 85);
	    class14_sub3.anInt2767 = 128 * arg1;
	    class14_sub3.anInt2763 = arg4;
	    anInt283++;
	    class14_sub3.anInt2774 = 128 * arg0;
	    if (arg2 != null) {
		class14_sub3.anInt2772 = arg2.anInt1289;
		class14_sub3.aClass79_2747 = arg2;
		class14_sub3.anInt2765 = arg2.anInt1271 * 128;
		int i = arg2.anInt1227;
		class14_sub3.anInt2769 = arg2.anInt1254;
		class14_sub3.anInt2753 = arg2.anInt1294;
		class14_sub3.anIntArray2746 = arg2.anIntArray1287;
		int i_16_ = arg2.anInt1245;
		if (arg7 == 1 || arg7 == 3) {
		    i = arg2.anInt1245;
		    i_16_ = arg2.anInt1227;
		}
		class14_sub3.anInt2761 = 128 * (i + arg0);
		class14_sub3.anInt2751 = (i_16_ + arg1) * 128;
		if (null != arg2.anIntArray1276) {
		    class14_sub3.aBoolean2757 = true;
		    class14_sub3.method452(18631);
		}
		if (null != class14_sub3.anIntArray2746)
		    class14_sub3.anInt2773
			= ((int) (Math.random()
				  * (double) (-class14_sub3.anInt2772
					      + class14_sub3.anInt2769))
			   + class14_sub3.anInt2772);
		Class152.aClass2_2438.method80(class14_sub3, (byte) -124);
	    } else if (null != arg6) {
		class14_sub3.aClass133_Sub1_Sub2_2762 = arg6;
		Class12 class12 = arg6.aClass12_4949;
		if (class12.anIntArray329 != null) {
		    class14_sub3.aBoolean2757 = true;
		    class12 = class12.method217((byte) -18);
		}
		if (null != class12) {
		    class14_sub3.anInt2751 = (class12.anInt334 + arg1) * 128;
		    class14_sub3.anInt2761 = 128 * (arg0 - -class12.anInt334);
		    class14_sub3.anInt2753 = Class99.method1500(arg6, -1);
		    class14_sub3.anInt2765 = class12.anInt293 * 128;
		}
		Class41.aClass2_683.method80(class14_sub3, (byte) -119);
	    } else if (arg5 != null) {
		class14_sub3.anInt2751 = (arg5.anInt3493 + arg1) * 128;
		class14_sub3.aClass133_Sub1_Sub1_2755 = arg5;
		class14_sub3.anInt2761 = 128 * (arg5.anInt3493 + arg0);
		class14_sub3.anInt2753 = Class116.method1597(false, arg5);
		class14_sub3.anInt2765 = 128 * arg5.anInt4917;
		Class88.aClass55_1398.method1224(8,
						 arg5.aClass124_4922
						     .method1692(0),
						 class14_sub3);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("bi.B(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ',' + (arg5 != null ? "{...}" : "null") + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7
			+ ')'));
	}
    }
    
    public int method214(int arg0, int arg1, int arg2) {
	try {
    while_4_:
	do {
	    do {
		int i_0_;
		try {
		    anInt324++;
		    if (null != aClass55_304)
			break;
		    i_0_ = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_4_;
		}
		return i_0_;
	    } while (false);
	    Class14_Sub1 class14_sub1;
	    do {
		int i_1_;
		try {
		    class14_sub1
			= (Class14_Sub1) aClass55_304.method1230((long) arg2,
								 (byte) -111);
		    if (arg0 < 113)
			aBoolean287 = false;
		    if (null != class14_sub1)
			break;
		    i_1_ = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_4_;
		}
		return i_1_;
	    } while (false);
		int i_2_;
	    try {
		i_2_ = class14_sub1.anInt2714;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_2_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bi.H(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
	}
	return 0;
    }
    
    public Class124 method215(int arg0, Class124 arg1, int arg2) {
	try {
    while_5_:
	do {
	    do {
		Class124 class124_0_;
		try {
		    anInt273++;
		    if (null != aClass55_304)
			break;
		    class124_0_ = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_5_;
		}
		return class124_0_;
	    } while (false);
	    do {
		Class124 class124_1_;
		try {
		    if (arg0 == -103)
			break;
		    class124_1_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_5_;
		}
		return class124_1_;
	    } while (false);
	    Class14_Sub30 class14_sub30;
	    do {
		Class124 class124_2_;
		try {
		    class14_sub30
			= (Class14_Sub30) aClass55_304.method1230((long) arg2,
								  (byte) 121);
		    if (null != class14_sub30)
			break;
		    class124_2_ = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_5_;
		}
		return class124_2_;
	    } while (false);
		Class124 class124_3_;
	    try {
		class124_3_ = class14_sub30.aClass124_3270;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124_3_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bi.M(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
	}
	return null;
    }
    
    public void method216(byte arg0, Class14_Sub10 arg1, int arg2) {
    while_7_:
	do {
	try {
	while_6_:
	    do {
		do {
		    try {
			if (arg0 < -97)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_6_;
		    }
		    return;
		} while (false);
		try {
		    if (1 != arg2) {
			if (-3 != (arg2 ^ 0xffffffff)) {
			    if ((arg2 ^ 0xffffffff) != -13) {
				if (arg2 != 13) {
				    if (14 != arg2) {
					if (15 == arg2)
					    anInt286
						= arg1.method784((byte) 112);
					else if (16 == arg2)
					    anInt318
						= arg1.method784((byte) 125);
					else if (arg2 == 17) {
					    anInt296
						= arg1.method784((byte) 103);
					    anInt284
						= arg1.method784((byte) 116);
					    anInt276
						= arg1.method784((byte) 105);
					    anInt339
						= arg1.method784((byte) 113);
					} else if (-31 < (arg2 ^ 0xffffffff)
						   || -36 >= (arg2
							      ^ 0xffffffff)) {
					    if ((arg2 ^ 0xffffffff) != -41) {
						if (-42
						    == (arg2 ^ 0xffffffff)) {
						    int i
							= arg1.method798(-122);
						    aShortArray314
							= new short[i];
						    aShortArray305
							= new short[i];
						    for (int i_17_ = 0;
							 ((i ^ 0xffffffff)
							  < (i_17_
							     ^ 0xffffffff));
							 i_17_++) {
							aShortArray314[i_17_]
							    = (short) (arg1.method784
								       ((byte) 108));
							aShortArray305[i_17_]
							    = (short) (arg1.method784
								       ((byte) 119));
						    }
						} else if (arg2 == 42) {
						    int i = arg1.method798(54);
						    aByteArray333
							= new byte[i];
						    for (int i_18_ = 0;
							 i_18_ < i; i_18_++)
							aByteArray333[i_18_]
							    = (arg1.method780
							       ((byte) -77));
						} else if (60 != arg2) {
						    if (93 == arg2)
							aBoolean342 = false;
						    else if (arg2 != 95) {
							if (97 != arg2) {
							    if (arg2 == 98)
								anInt297
								    = (arg1.method784
								       ((byte) 119));
							    else if ((arg2
								      ^ 0xffffffff)
								     != -100) {
								if (100
								    == arg2)
								    anInt275
									= (arg1.method780
									   ((byte) -77));
								else if (arg2
									 != 101) {
								    if ((arg2
									 ^ 0xffffffff)
									== -103)
									anInt306
									    = arg1.method784((byte) 111);
								    else if (103
									     == arg2)
									anInt303
									    = arg1.method784((byte) 121);
								    else if ((arg2
									      ^ 0xffffffff) == -107
									     || 118 == arg2) {
									anInt326
									    = arg1.method784((byte) 116);
									if ((anInt326
									     ^ 0xffffffff)
									    == -65536)
									    anInt326 = -1;
									int i
									    = -1;
									anInt277
									    = arg1.method784((byte) 125);
									if ((anInt277
									     ^ 0xffffffff)
									    == -65536)
									    anInt277 = -1;
									if (-119
									    == (arg2 ^ 0xffffffff)) {
									    i = arg1.method784((byte) 106);
									    if (-65536 == (i ^ 0xffffffff))
										i = -1;
									}
									int i_19_
									    = arg1.method798(-125);
									anIntArray329
									    = new int[2 + i_19_];
									for (int i_20_ = 0;
									     i_20_ <= i_19_;
									     i_20_++) {
									    anIntArray329[i_20_] = arg1.method784((byte) 117);
									    if ((anIntArray329[i_20_] ^ 0xffffffff) == -65536)
										anIntArray329[i_20_] = -1;
									}
									anIntArray329
									    [1 + i_19_]
									    = i;
								    } else if (107
									       == arg2)
									aBoolean308
									    = false;
								    else if ((arg2
									      ^ 0xffffffff)
									     == -110)
									aBoolean287
									    = false;
								    else if (111
									     == arg2)
									aBoolean330
									    = false;
								    else if (-114
									     == (arg2 ^ 0xffffffff)) {
									aShort313
									    = (short) arg1.method784((byte) 125);
									aShort285
									    = (short) arg1.method784((byte) 123);
								    } else if (arg2
									       == 114) {
									aByte321
									    = arg1.method780((byte) -77);
									aByte331
									    = arg1.method780((byte) -77);
								    } else if (arg2
									       != 115) {
									if (-120
									    == (arg2 ^ 0xffffffff))
									    aByte290 = arg1.method780((byte) -77);
									else if (120 == arg2) {
									    anInt289 = arg1.method784((byte) 126);
									    anInt301 = arg1.method784((byte) 121);
									    anInt292 = arg1.method784((byte) 109);
									    anInt293 = arg1.method798(-72);
									} else if ((arg2 ^ 0xffffffff) == -122) {
									    anIntArrayArray316 = new int[anIntArray309.length][];
									    int i = arg1.method798(-117);
									    for (int i_21_ = 0; i > i_21_; i_21_++) {
										int i_22_ = arg1.method798(-123);
										int[] is = anIntArrayArray316[i_22_] = new int[3];
										is[0] = arg1.method780((byte) -77);
										is[1] = arg1.method780((byte) -77);
										is[2] = arg1.method780((byte) -77);
									    }
									} else if ((arg2 ^ 0xffffffff) == -123)
									    anInt281 = arg1.method784((byte) 113);
									else if (249 == arg2) {
									    int i = arg1.method798(125);
									    if (null == aClass55_304) {
										int i_23_ = Class14_Sub8_Sub33.method653(i, 85);
										aClass55_304 = new Class55(i_23_);
									    }
									    for (int i_24_ = 0; (i_24_ ^ 0xffffffff) > (i ^ 0xffffffff); i_24_++) {
										boolean bool = arg1.method798(-119) == 1;
										int i_25_ = arg1.method829(-127);
										Class14 class14;
										if (bool)
										    class14 = new Class14_Sub30(arg1.method797(9467));
										else
										    class14 = new Class14_Sub1(arg1.method812((byte) -127));
										aClass55_304.method1224(8, (long) i_25_, class14);
									    }
									}
								    } else {
									aShort280
									    = (short) (arg1.method798(-13) * 4);
									aShort315
									    = (short) (4 * arg1.method798(-54));
								    }
								} else
								    anInt279
									= 5 * arg1.method780((byte) -77);
							    } else
								aBoolean307
								    = true;
							} else
							    anInt335
								= (arg1.method784
								   ((byte) 121));
						    } else
							anInt295
							    = (arg1.method784
							       ((byte) 125));
						} else {
						    int i
							= arg1.method798(-110);
						    anIntArray338 = new int[i];
						    for (int i_26_ = 0;
							 ((i_26_ ^ 0xffffffff)
							  > (i ^ 0xffffffff));
							 i_26_++)
							anIntArray338[i_26_]
							    = (arg1.method784
							       ((byte) 126));
						}
					    } else {
						int i = arg1.method798(-48);
						aShortArray319 = new short[i];
						aShortArray317 = new short[i];
						for (int i_27_ = 0; i_27_ < i;
						     i_27_++) {
						    aShortArray319[i_27_]
							= (short) (arg1.method784
								   ((byte) 106));
						    aShortArray317[i_27_]
							= (short) (arg1.method784
								   ((byte) 123));
						}
					    }
					} else {
					    aClass124Array291[-30 + arg2]
						= arg1.method797(9467);
					    if (aClass124Array291
						    [arg2 + -30].method1717
						(40, (Class14_Sub9_Sub1
						      .aClass124_4808)))
						aClass124Array291[-30 + arg2]
						    = null;
					}
				    } else
					anInt296 = arg1.method784((byte) 108);
				} else
				    anInt323 = arg1.method784((byte) 121);
			    } else
				anInt334 = arg1.method798(90);
			} else
			    aClass124_302 = arg1.method797(9467);
		    } else {
			int i = arg1.method798(58);
			anIntArray309 = new int[i];
			for (int i_28_ = 0; i > i_28_; i_28_++)
			    anIntArray309[i_28_] = arg1.method784((byte) 120);
		    }
		    anInt298++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_7_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("bi.N(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
		}
	} while (false);
    }
    
    public Class12 method217(byte arg0) {
	try {
    while_9_:
	do {
	    do {
		Class12 class12_0_;
		try {
		    anInt341++;
		    if (arg0 == -18)
			break;
		    class12_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_9_;
		}
		return class12_0_;
	    } while (false);
	    int i;
	while_8_:
	    do {
		int i_29_;
		do {
		Class12 class12_1_;
		    try {
			i = -1;
			if (0 != (anInt326 ^ 0xffffffff))
			    i = Class104.method1534(anInt326, arg0 + 143);
			else if (0 != (anInt277 ^ 0xffffffff))
			    i = Class14_Sub8_Sub11.anIntArray4275[anInt277];
			if (-1 >= (i ^ 0xffffffff)
			    && anIntArray329.length + -1 > i
			    && 0 != (anIntArray329[i] ^ 0xffffffff))
			    break while_8_;
			i_29_ = anIntArray329[anIntArray329.length + -1];
			if ((i_29_ ^ 0xffffffff) != 0)
			    break;
			class12_1_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_9_;
		    }
		    return class12_1_;
		} while (false);
		Class12 class12_2_;
		try {
		    class12_2_ = Class126.method1744(i_29_, 170);
		} catch (RuntimeException runtimeexception) {
		    break while_9_;
		}
		return class12_2_;
	    } while (false);
		Class12 class12_3_;
	    try {
		class12_3_ = Class126.method1744(anIntArray329[i], arg0 + 188);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class12_3_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "bi.A(" + arg0 + ')');
	}
	return null;
    }
    
    public static void method218(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
    while_11_:
	do {
	try {
	while_10_:
	    do {
		do {
		    try {
			anInt340++;
			if (Class126.method1741((byte) -113, arg4))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_10_;
		    }
		    return;
		} while (false);
		try {
		    if (arg0 != -30776)
			aClass124_328 = null;
		    client.method55(Class1.aClass94ArrayArray75[arg4], -1,
				    arg6, arg3, arg7, arg1, arg2, arg5);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_11_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("bi.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
		}
	} while (false);
    }
    
    public boolean method219(int arg0) {
	try {
    while_13_:
	do {
	boolean bool_4_;
	    do {
		boolean bool_0_;
		try {
		    anInt322++;
		    if (null != anIntArray329)
			break;
		    bool_0_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_13_;
		}
		return bool_0_;
	    } while (false);
	while_12_:
	    do {
		boolean bool_3_;
		do {
		boolean bool_1_;
		    try {
			int i = arg0;
			if (-1 == anInt326) {
			    if (0 != (anInt277 ^ 0xffffffff))
				i = (Class14_Sub8_Sub11.anIntArray4275
				     [anInt277]);
			} else
			    i = Class104.method1534(anInt326, 118);
			if (0 <= i && i < -1 + anIntArray329.length
			    && -1 != anIntArray329[i])
			    break while_12_;
			int i_30_ = anIntArray329[anIntArray329.length - 1];
			if (-1 != i_30_)
			    break;
			bool_1_ = false;
		    } catch (RuntimeException runtimeexception) {
			break while_13_;
		    }
		    return bool_1_;
		} while (false);
		try {
		    bool_3_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_13_;
		}
		return bool_3_;
	    } while (false);
	    try {
		bool_4_ = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool_4_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "bi.I(" + arg0 + ')');
	}
	return false;
    }
    
    public void method220(Class14_Sub10 arg0, boolean arg1) {
	try {
	    for (;;) {
		int i = arg0.method798(-125);
		if (0 == i)
		    break;
		method216((byte) -105, arg0, i);
	    }
	    anInt300++;
	    if (arg1 != true)
		method213(-95, 93, null, (byte) 88, 89, null, null, -46);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bi.L("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static int method221(int arg0, int arg1, byte arg2) {
	try {
    while_14_:
	do {
	int i_1_;
	    int i;
	    do {
		int i_0_;
		try {
		    anInt274++;
		    i = 1;
		    while ((arg0 ^ 0xffffffff) < -2) {
			if (-1 != (0x1 & arg0 ^ 0xffffffff))
			    i *= arg1;
			arg0 >>= 1;
			arg1 *= arg1;
		    }
		    if (arg2 != -96)
			aByteArrayArray310 = null;
		    if ((arg0 ^ 0xffffffff) != -2)
			break;
		    i_0_ = arg1 * i;
		} catch (RuntimeException runtimeexception) {
		    break while_14_;
		}
		return i_0_;
	    } while (false);
	    try {
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bi.P(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
	}
	return 0;
    }
    
    public static Class129 method222(int arg0) {
	Class129 class129_0_ = null;
	try {
	    anInt325++;
	    try {
		if (arg0 != -18108)
		    aByteArrayArray310 = null;
		class129_0_ = (Class129) Class.forName("Class129_Sub1").newInstance();
	    } catch (Throwable throwable) {
		try {
		do {
		Class129 class129_1_;
		    try {
			Object object;
			class129_1_ = null;
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		    return class129_1_;
		} while (false);
		} catch (RuntimeException runtimeexception) {
		throw Class14_Sub8_Sub14.method554(runtimeexception,
						   "bi.F(" + arg0 + ')');
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class129_0_;
    }
    
    public void method223(byte arg0) {
	try {
	    anInt299++;
	    if (arg0 <= 94)
		anInt306 = 73;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bi.O(" + arg0 + ')');
	}
    }
    
    public Class133_Sub7 method224(byte arg0, Class46 arg1, int arg2) {
	try {
    while_17_:
	do {
	while_15_:
	    do {
		Class133_Sub7 class133_sub7_1_;
		Class12 class12;
		do {
		Class133_Sub7 class133_sub7_0_;
		    try {
			anInt288++;
			if (anIntArray329 == null)
			    break while_15_;
			class12 = method217((byte) -18);
			if (null != class12)
			    break;
			class133_sub7_0_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return class133_sub7_0_;
		} while (false);
		try {
		    class133_sub7_1_ = class12.method224((byte) -117, arg1, arg2);
		} catch (RuntimeException runtimeexception) {
		    break while_17_;
		}
		return class133_sub7_1_;
	    } while (false);
	    do {
		Class133_Sub7 class133_sub7_2_;
		try {
		    if (null != anIntArray338)
			break;
		    class133_sub7_2_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_17_;
		}
		return class133_sub7_2_;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	while_16_:
	    do {
		do {
		Class133_Sub7 class133_sub7_3_;
		    try {
			class133_sub7
			    = ((Class133_Sub7)
			       Class14_Sub8_Sub6.aClass52_4186
				   .method1210((byte) 90, (long) anInt337));
			if (arg0 > -93)
			    anInt279 = 41;
			if (null != class133_sub7)
			    break while_16_;
			boolean bool = false;
			for (int i = 0; anIntArray338.length > i; i++) {
			    if (!Class20.aClass9_429.method158(0,
							       (anIntArray338
								[i]),
							       (byte) -121))
				bool = true;
			}
			if (!bool)
			    break;
			class133_sub7_3_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return class133_sub7_3_;
		} while (false);
		try {
		    Class133_Sub2[] class133_sub2s
			= new Class133_Sub2[anIntArray338.length];
		    for (int i = 0; anIntArray338.length > i; i++)
			class133_sub2s[i]
			    = Class133_Sub2.method1824(Class20.aClass9_429,
						       anIntArray338[i], 0);
		    Class133_Sub2 class133_sub2;
		    if (1 != class133_sub2s.length)
			class133_sub2
			    = new Class133_Sub2(class133_sub2s,
						class133_sub2s.length);
		    else
			class133_sub2 = class133_sub2s[0];
		    if (null != aShortArray319) {
			for (int i = 0; aShortArray319.length > i; i++) {
			    if (null != aByteArray333
				&& (i ^ 0xffffffff) > (aByteArray333.length
						       ^ 0xffffffff))
				class133_sub2.method1813(aShortArray319[i],
							 (Class14_Sub8_Sub39
							  .aShortArray4747
							  [(0xff
							    & (aByteArray333
							       [i]))]));
			    else
				class133_sub2.method1813(aShortArray319[i],
							 aShortArray317[i]);
			}
		    }
		    if (aShortArray314 != null) {
			for (int i = 0; aShortArray314.length > i; i++)
			    class133_sub2.method1819(aShortArray314[i],
						     aShortArray305[i]);
		    }
		    class133_sub7
			= class133_sub2.method1827(64, 768, -50, -10, -50);
		    Class14_Sub8_Sub6.aClass52_4186.method1205
			((byte) -93, class133_sub7, (long) anInt337);
		} catch (RuntimeException runtimeexception) {
		    break while_17_;
		}
	    } while (false);
	    if (null != arg1)
		class133_sub7 = arg1.method1167(arg2, 65535, class133_sub7);
	    return class133_sub7;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bi.E(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
	}
	return null;
    }
    
    public Class12() {
	anInt277 = -1;
	anInt289 = -1;
	anInt279 = 0;
	anInt303 = 32;
	anInt293 = 0;
	anInt306 = -1;
	aByte290 = (byte) 0;
	aClass124Array291 = new Class124[5];
	anInt275 = 0;
	aBoolean307 = false;
	anInt295 = -1;
	aBoolean308 = true;
	anInt281 = -1;
	anInt286 = -1;
	aClass124_302 = Class125_Sub3.aClass124_3412;
	aShort285 = (short) 0;
	aByte321 = (byte) -96;
	anInt284 = -1;
	anInt323 = -1;
	aBoolean330 = true;
	anInt292 = -1;
	anInt318 = -1;
	anInt301 = -1;
	anInt276 = -1;
	aShort280 = (short) 0;
	anInt335 = 128;
	anInt334 = 1;
	aShort313 = (short) 0;
	anInt326 = -1;
	aShort315 = (short) 0;
	anInt339 = -1;
	aByte331 = (byte) -16;
	anInt297 = 128;
	aBoolean342 = true;
    }
    
    static {
	aClass124_278 = Class14_Sub2_Sub2.method263(1178, "flash1:");
	aClass124_311 = aClass124_278;
	aClass124_328 = aClass124_278;
    }
}