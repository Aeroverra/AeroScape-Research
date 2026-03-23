/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class134 implements Interface3
{
    public static Class124 aClass124_2570;
    public byte[] aByteArray2571;
    public static int anInt2572;
    public static int anInt2573;
    public static int anInt2574;
    public static Class124 aClass124_2575
	= Class14_Sub2_Sub2.method263(1178, "::cardmem");
    public byte[] aByteArray2576;
    public static int anInt2577;
    public static int anInt2578;
    public static int anInt2579;
    public Class9 aClass9_2580;
    public boolean aBoolean2581 = false;
    public int anInt2582 = 50;
    public boolean[] aBooleanArray2583;
    public static int anInt2584;
    public Class20 aClass20_2585;
    public static int anInt2586;
    public Class9 aClass9_2587;
    public static Class75 aClass75_2588;
    public static int anInt2589;
    public static int[] anIntArray2590;
    public static int anInt2591;
    public static int anInt2592;
    public static int anInt2593;
    public boolean[] aBooleanArray2594;
    public Class20 aClass20_2595;
    public static int anInt2596;
    public static int anInt2597;
    public static Class9 aClass9_2598;
    public static Class124 aClass124_2599;
    public boolean[] aBooleanArray2600;
    public static int anInt2601;
    public byte[] aByteArray2602;
    public short[] aShortArray2603;
    public boolean[] aBooleanArray2604;
    public static int anInt2605;
    public static int anInt2606;
    public static int anInt2607;
    public byte[] aByteArray2608;
    public boolean[] aBooleanArray2609;
    public static int anInt2610;
    public static int anInt2611;
    public static int anInt2612;
    public static int anInt2613;
    
    public boolean method15(int arg0, int arg1) {
    while_1227_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2577++;
		    if (!aBoolean2581 && !aBooleanArray2604[arg1])
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1227_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg0 == 1)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1227_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.L(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method16(int arg0, byte arg1) {
	try {
	    boolean bool = false;
	    anInt2610++;
	    Class132.method1778(0xff & aByteArray2608[arg0], (byte) 124,
				aByteArray2602[arg0] & 0xff);
	    Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(arg0, false);
	    if (null != class14_sub2_sub1)
		bool
		    = class14_sub2_sub1.method252(this,
						  (aBoolean2581
						   || aBooleanArray2604[arg0]),
						  110, aClass9_2587);
	    if (!bool) {
		Class14_Sub2_Sub14 class14_sub2_sub14
		    = method1923(false, arg0);
		class14_sub2_sub14.method337(true);
	    }
	    if (arg1 != 97)
		method6(114, 26);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public int method14(int arg0, int arg1) {
	int i;
	try {
	    anInt2586++;
	    if (arg1 < 2)
		method13(17, 68);
	    i = 0xff & aByteArray2576[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.J(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public boolean method6(int arg0, int arg1) {
    while_1228_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg1 <= -90)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1228_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		anInt2606++;
		bool = aBooleanArray2600[arg0];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method5(int arg0, byte arg1) {
	int i;
	try {
	    if (arg1 > -94)
		method10((byte) -53, 13);
	    anInt2591++;
	    i = aShortArray2603[arg0] & 0xffff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.D(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public void method1922(int arg0, byte arg1) {
	try {
	    anInt2589++;
	    for (Class14_Sub2_Sub1 class14_sub2_sub1
		     = (Class14_Sub2_Sub1) aClass20_2595.method968((byte) 114);
		 class14_sub2_sub1 != null;
		 class14_sub2_sub1 = ((Class14_Sub2_Sub1)
				      aClass20_2595.method973((byte) 11))) {
		if (class14_sub2_sub1.aBoolean3746) {
		    class14_sub2_sub1.method253(arg0, false);
		    class14_sub2_sub1.aBoolean3746 = false;
		}
	    }
	    if (arg1 >= -81)
		method10((byte) -68, -111);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.O(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public boolean method7(int arg0, boolean arg1) {
	boolean bool;
	try {
	    if (arg1)
		method16(-97, (byte) 58);
	    anInt2597++;
	    bool = aBooleanArray2609[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public Class14_Sub2_Sub14 method1923(boolean arg0, int arg1) {
    while_1229_:
	do {
	    do {
		Class14_Sub2_Sub14 class14_sub2_sub14;
		try {
		    anInt2611++;
		    Class14_Sub2_Sub14 class14_sub2_sub14_0_
			= ((Class14_Sub2_Sub14)
			   aClass20_2585.method974((long) arg1, 0));
		    if (null == class14_sub2_sub14_0_)
			break;
		    class14_sub2_sub14 = class14_sub2_sub14_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1229_;
		}
		return class14_sub2_sub14;
	    } while (false);
	    Class14_Sub2_Sub14 class14_sub2_sub14;
	    try {
		if (arg0)
		    anInt2612 = -54;
		Class14_Sub2_Sub14 class14_sub2_sub14_1_
		    = new Class14_Sub2_Sub14(0xffff & aShortArray2603[arg1]);
		aClass20_2585.method971(-1, class14_sub2_sub14_1_,
					(long) arg1);
		class14_sub2_sub14 = class14_sub2_sub14_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub14;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.Q(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method1924(boolean arg0, int arg1) {
	try {
	    anInt2607++;
	    if (arg1 > -8)
		method5(-90, (byte) -62);
	    aBoolean2581 = arg0;
	    method1927(0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.R(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public int method8(byte arg0, int arg1) {
	int i;
	try {
	    int i_2_ = 74 / ((-41 - arg0) / 58);
	    anInt2579++;
	    i = 0xff & aByteArray2602[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public boolean method13(int arg0, int arg1) {
	boolean bool;
	try {
	    anInt2601++;
	    if (arg0 != 0)
		aClass20_2585 = null;
	    bool = aBooleanArray2594[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.H(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public int[] method17(int arg0, int arg1) {
    while_1230_:
	do {
	    do {
		int[] is;
		try {
		    if (arg0 == -16210)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1230_;
		}
		return is;
	    } while (false);
	    Class14_Sub2_Sub1 class14_sub2_sub1;
	    do {
		int[] is;
		try {
		    anInt2592++;
		    class14_sub2_sub1 = method1926(arg1, false);
		    if (null != class14_sub2_sub1)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1230_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		is = class14_sub2_sub1.method257(false, aClass9_2587,
						 (aBoolean2581
						  || aBooleanArray2604[arg1]),
						 this);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.M(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1925(byte arg0) {
	try {
	    aClass124_2570 = null;
	    aClass124_2599 = null;
	    aClass75_2588 = null;
	    anIntArray2590 = null;
	    aClass124_2575 = null;
	    aClass9_2598 = null;
	    if (arg0 <= 0)
		aClass124_2599 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "tj.P(" + arg0 + ')');
	}
    }
    
    public Class14_Sub2_Sub1 method1926(int arg0, boolean arg1) {
    while_1231_:
	do {
	    do {
		Class14_Sub2_Sub1 class14_sub2_sub1;
		try {
		    anInt2613++;
		    Class14_Sub2_Sub1 class14_sub2_sub1_3_
			= ((Class14_Sub2_Sub1)
			   aClass20_2595.method974((long) arg0, 0));
		    if (null == class14_sub2_sub1_3_)
			break;
		    class14_sub2_sub1 = class14_sub2_sub1_3_;
		} catch (RuntimeException runtimeexception) {
		    break while_1231_;
		}
		return class14_sub2_sub1;
	    } while (false);
	    byte[] is;
	    do {
		Class14_Sub2_Sub1 class14_sub2_sub1;
		try {
		    is = aClass9_2580.method163(0, arg0, 0);
		    if (is != null)
			break;
		    class14_sub2_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1231_;
		}
		return class14_sub2_sub1;
	    } while (false);
	    Class14_Sub2_Sub1 class14_sub2_sub1;
	    try {
		if (arg1)
		    method1922(-51, (byte) -71);
		Class14_Sub10 class14_sub10 = new Class14_Sub10(is);
		Class14_Sub2_Sub1 class14_sub2_sub1_4_
		    = new Class14_Sub2_Sub1(class14_sub10);
		aClass20_2595.method971(-1, class14_sub2_sub1_4_, (long) arg0);
		class14_sub2_sub1 = class14_sub2_sub1_4_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.N(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method12(boolean arg0, int arg1) {
	int i;
	try {
	    anInt2584++;
	    if (arg0 != true)
		method5(6, (byte) -53);
	    i = aByteArray2608[arg1] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("tj.K(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public void method1927(int arg0) {
    while_1233_:
	do {
	while_1232_:
	    do {
		do {
		    try {
			aClass20_2595.method972(53);
			anInt2574++;
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1232_;
		    }
		    return;
		} while (false);
		try {
		    aClass20_2585.method972(81);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1233_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "tj.S(" + arg0 + ')');
	} while (false);
    }
    
    public boolean method10(byte arg0, int arg1) {
    while_1234_:
	do {
	    Class14_Sub2_Sub1 class14_sub2_sub1;
	    do {
		boolean bool;
		try {
		    if (arg0 > -79)
			method17(24, -98);
		    anInt2596++;
		    class14_sub2_sub1 = method1926(arg1, false);
		    if (null != class14_sub2_sub1)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1234_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = class14_sub2_sub1.method254(aClass9_2587, 255, this);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.I(" + arg0 + ',' + arg1 + ')');
    }
    
    public int[] method11(float arg0, int arg1, int arg2) {
    while_1235_:
	do {
	    Class14_Sub2_Sub1 class14_sub2_sub1;
	    do {
		int[] is;
		try {
		    anInt2605++;
		    class14_sub2_sub1 = method1926(arg1, false);
		    if (class14_sub2_sub1 != null)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1235_;
		}
		return is;
	    } while (false);
	    do {
		int[] is;
		try {
		    class14_sub2_sub1.aBoolean3746 = true;
		    if (arg2 >= 16)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1235_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		is = class14_sub2_sub1.method255(this, arg0, -1, aClass9_2587,
						 (aBoolean2581
						  || aBooleanArray2604[arg1]));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("tj.G(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public int method9(int arg0, int arg1) {
    while_1236_:
	do {
	    do {
		int i;
		try {
		    if (arg1 < -2)
			break;
		    i = 49;
		} catch (RuntimeException runtimeexception) {
		    break while_1236_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt2593++;
		i = 0xff & aByteArray2571[arg0];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tj.F(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class134(Class9 arg0, Class9 arg1, Class9 arg2, int arg3,
		    boolean arg4) {
	try {
	    aClass9_2580 = arg0;
	    aClass9_2587 = arg2;
	    aBoolean2581 = arg4;
	    anInt2582 = arg3;
	    aClass20_2595 = new Class20(anInt2582);
	    aClass20_2585 = new Class20(anInt2582);
	    Class14_Sub10 class14_sub10
		= new Class14_Sub10(arg1.method163(0, 0, 0));
	    int i = class14_sub10.method784((byte) 126);
	    aByteArray2602 = new byte[i];
	    aBooleanArray2600 = new boolean[i];
	    aShortArray2603 = new short[i];
	    aByteArray2576 = new byte[i];
	    aBooleanArray2604 = new boolean[i];
	    aByteArray2571 = new byte[i];
	    aBooleanArray2594 = new boolean[i];
	    aBooleanArray2609 = new boolean[i];
	    aBooleanArray2583 = new boolean[i];
	    aByteArray2608 = new byte[i];
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (i ^ 0xffffffff); i_5_++)
		aBooleanArray2583[i_5_]
		    = (class14_sub10.method798(-71) ^ 0xffffffff) == -2;
	    for (int i_6_ = 0; i > i_6_; i_6_++) {
		if (aBooleanArray2583[i_6_])
		    aBooleanArray2594[i_6_]
			= class14_sub10.method798(-51) == 1;
	    }
	    for (int i_7_ = 0; i > i_7_; i_7_++) {
		if (aBooleanArray2583[i_7_])
		    aBooleanArray2600[i_7_] = class14_sub10.method798(72) == 1;
	    }
	    for (int i_8_ = 0; (i ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
		 i_8_++) {
		if (aBooleanArray2583[i_8_])
		    aBooleanArray2604[i_8_]
			= (class14_sub10.method798(56) ^ 0xffffffff) == -2;
	    }
	    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_9_++) {
		if (aBooleanArray2583[i_9_])
		    aBooleanArray2609[i_9_]
			= class14_sub10.method798(111) == 1;
	    }
	    for (int i_10_ = 0; i > i_10_; i_10_++) {
		if (aBooleanArray2583[i_10_])
		    aByteArray2571[i_10_]
			= class14_sub10.method780((byte) -77);
	    }
	    for (int i_11_ = 0; (i_11_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_11_++) {
		if (aBooleanArray2583[i_11_])
		    aByteArray2576[i_11_]
			= class14_sub10.method780((byte) -77);
	    }
	    for (int i_12_ = 0; i > i_12_; i_12_++) {
		if (aBooleanArray2583[i_12_])
		    aByteArray2608[i_12_]
			= class14_sub10.method780((byte) -77);
	    }
	    for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_13_++) {
		if (aBooleanArray2583[i_13_])
		    aByteArray2602[i_13_]
			= class14_sub10.method780((byte) -77);
	    }
	    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_14_++) {
		if (aBooleanArray2583[i_14_])
		    aShortArray2603[i_14_]
			= (short) class14_sub10.method784((byte) 115);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("tj.<init>(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ',' + arg3 + ','
			+ arg4 + ')'));
	}
    }
    
    static {
	aClass124_2570 = Class14_Sub2_Sub2.method263(1178, " ");
	aClass124_2599 = Class14_Sub2_Sub2.method263(1178, "(U5");
	anInt2612 = 7759444;
    }
}
