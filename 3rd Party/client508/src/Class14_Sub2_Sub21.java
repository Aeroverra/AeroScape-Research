/* Class14_Sub2_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub21 extends Class14_Sub2
{
    public static int anInt4065;
    public static int anInt4066;
    public static int anInt4067;
    public static int anInt4068;
    public static int anInt4069;
    public static Class124 aClass124_4070;
    public static int anInt4071;
    public static int anInt4072;
    public int[] anIntArray4073;
    public static int anInt4074;
    public int[][] anIntArrayArray4075;
    public static int anInt4076;
    public static int[] anIntArray4077;
    public static int[] anIntArray4078;
    public static int anInt4079;
    public Class124[] aClass124Array4080;
    public static int anInt4081 = 0;
    public int[] anIntArray4082;
    public static Class124 aClass124_4083;
    public static int anInt4084;
    public static int anInt4085;
    public static int anInt4086;
    public static int anInt4087;
    public static int anInt4088;
    public static int anInt4089;
    public static int anInt4090;
    
    public int method433(int arg0, int arg1) {
    while_228_:
	do {
	    do {
		int i;
		try {
		    anInt4068++;
		    if (arg0 > -49)
			anIntArray4073 = null;
		    if (null != anIntArray4073 && arg1 >= 0
			&& ((anIntArray4073.length ^ 0xffffffff)
			    <= (arg1 ^ 0xffffffff)))
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_228_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anIntArray4073[arg1];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "wb.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method434(int arg0, int arg1, Class79 arg2, int arg3,
				 int arg4) {
    while_230_:
	do {
	while_229_:
	    do {
		Class14_Sub3 class14_sub3;
		try {
		    anInt4072++;
		    class14_sub3
			= (Class14_Sub3) Class152.aClass2_2438.method77(0);
		    if (arg3 != 128)
			anIntArray4077 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		while (null != class14_sub3) {
		    if (class14_sub3.anInt2763 == arg1
			&& (arg0 * 128 ^ 0xffffffff) == (class14_sub3.anInt2774
							 ^ 0xffffffff)
			&& (128 * arg4 ^ 0xffffffff) == (class14_sub3.anInt2767
							 ^ 0xffffffff)
			&& (class14_sub3.aClass79_2747.anInt1257
			    == arg2.anInt1257)) {
			if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
			    Class33.aClass14_Sub9_Sub2_585.method730
				(class14_sub3.aClass14_Sub9_Sub4_2775);
			    class14_sub3.aClass14_Sub9_Sub4_2775 = null;
			}
			if (null != class14_sub3.aClass14_Sub9_Sub4_2760) {
			    Class33.aClass14_Sub9_Sub2_585.method730
				(class14_sub3.aClass14_Sub9_Sub4_2760);
			    class14_sub3.aClass14_Sub9_Sub4_2760 = null;
			}
			class14_sub3.method233(arg3 ^ 0x80);
			break;
		    }
		    try {
			class14_sub3
			    = ((Class14_Sub3)
			       Class152.aClass2_2438.method84(arg3 ^ ~0xbb));
		    } catch (RuntimeException runtimeexception) {
			break while_229_;
		    }
		}
		break while_230_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("wb.K(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4
						+ ')'));
	} while (false);
    }
    
    public int method435(int arg0, int arg1, byte arg2) {
    while_231_:
	do {
	    do {
		int i;
		try {
		    anInt4087++;
		    int i_0_ = -76 / ((arg2 - -7) / 52);
		    if (null != anIntArray4073 && 0 <= arg0
			&& (arg0 ^ 0xffffffff) >= (anIntArray4073.length
						   ^ 0xffffffff))
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_231_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (null != anIntArrayArray4075[arg0] && 0 <= arg1
			&& anIntArrayArray4075[arg0].length >= arg1)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_231_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anIntArrayArray4075[arg0][arg1];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("wb.M(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public static void method436(int arg0) {
	try {
	    aClass124_4070 = null;
	    aClass124_4083 = null;
	    anIntArray4078 = null;
	    if (arg0 >= -100)
		anInt4081 = -54;
	    anIntArray4077 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wb.C(" + arg0 + ')');
	}
    }
    
    public void method437(Class14_Sub10 arg0, int arg1) {
	try {
	    anInt4071++;
	    if (arg1 <= 87)
		aClass124_4083 = null;
	    for (;;) {
		int i = arg0.method798(-91);
		if (-1 == (i ^ 0xffffffff))
		    break;
		method447(0, arg0, i);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wb.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public Class124 method438(int arg0) {
    while_232_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt4067++;
		    if (arg0 >= 116)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_232_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    do {
		Class124 class124_1_;
		try {
		    class124 = Class7_Sub1.method121(80, 112);
		    if (null != aClass124Array4080)
			break;
		    class124_1_ = Class7_Sub1.aClass124_2656;
		} catch (RuntimeException runtimeexception) {
		    break while_232_;
		}
		return class124_1_;
	    } while (false);
	    Class124 class124_2_;
	    try {
		class124.method1675((byte) -128, aClass124Array4080[0]);
		for (int i = 1; aClass124Array4080.length > i; i++) {
		    class124.method1675((byte) -127, Class109.aClass124_1836);
		    class124.method1675((byte) -128, aClass124Array4080[i]);
		}
		class124_2_ = class124.method1683(115);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124_2_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "wb.E(" + arg0 + ')');
    }
    
    public void method439(int arg0) {
	try {
	    if (anIntArray4082 != null) {
		for (int i = 0;
		     (i ^ 0xffffffff) > (anIntArray4082.length ^ 0xffffffff);
		     i++)
		    anIntArray4082[i]
			= Class66.method1294(anIntArray4082[i], 32768);
	    }
	    anInt4089++;
	    if (arg0 != 19712)
		method439(19);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wb.F(" + arg0 + ')');
	}
    }
    
    public static void method440(byte arg0) {
	try {
	    Class97 class97 = Class67.aClass97_1055;
	    synchronized (class97) {
		Class14_Sub8_Sub31.anInt4602++;
		Class14_Sub8_Sub30.anInt4599 = Class14_Sub4.anInt2790;
		Class14_Sub8_Sub33.anInt4640 = Class14_Sub8_Sub37.anInt4724;
		Class107.anInt1804 = Class14_Sub9_Sub3.anInt4848;
		Class7_Sub3_Sub1.anInt3714 = Class127.anInt2105;
		Class125_Sub1.anInt3367 = Class111.anInt1860;
		Class139.anInt2230 = Class118.anInt1976;
		int i = -59 / ((-55 - arg0) / 58);
		Class14_Sub5.aLong2800 = Applet_Sub1.aLong6;
		Class127.anInt2105 = 0;
	    }
	    anInt4065++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wb.O(" + arg0 + ')');
	}
    }
    
    public static int method441(int arg0, int arg1, int arg2) {
    while_233_:
	do {
	    do {
		int i;
		try {
		    anInt4076++;
		    if (0 != (arg2 ^ 0xffffffff))
			break;
		    i = 12345678;
		} catch (RuntimeException runtimeexception) {
		    break while_233_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		arg0 = (arg1 & arg2) * arg0 >> -152885305;
		if (2 > arg0)
		    arg0 = 2;
		else if ((arg0 ^ 0xffffffff) < -127)
		    arg0 = 126;
		i = (0xff80 & arg2) - -arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("wb.J(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public Class124 method442(int arg0, Class14_Sub10 arg1) {
	Class124 class124;
	try {
	    anInt4074++;
	    Class124 class124_3_ = Class7_Sub1.method121(80, -122);
	    int i = -22 / ((arg0 - -45) / 42);
	    if (null != anIntArray4073) {
		for (int i_4_ = 0; i_4_ < anIntArray4073.length; i_4_++) {
		    class124_3_.method1675((byte) -127,
					   aClass124Array4080[i_4_]);
		    class124_3_.method1675
			((byte) -128,
			 Class129.method1766(anIntArrayArray4075[i_4_],
					     anIntArray4073[i_4_], (byte) 124,
					     arg1.method837((Class153
							     .anIntArray2453
							     [(anIntArray4073
							       [i_4_])]),
							    -115)));
		}
	    }
	    class124_3_.method1675((byte) -128,
				   (aClass124Array4080
				    [-1 + aClass124Array4080.length]));
	    class124 = class124_3_.method1683(115);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wb.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class124;
    }
    
    public void method443(Class14_Sub10 arg0, byte arg1, int[] arg2) {
    while_235_:
	do {
	while_234_:
	    do {
		do {
		    try {
			anInt4066++;
			if (null != anIntArray4073)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_234_;
		    }
		    return;
		} while (false);
		try {
		    if (arg1 >= -27)
			method444(-65, null);
		    for (int i = 0; ((i ^ 0xffffffff) > (anIntArray4073.length
							 ^ 0xffffffff)
				     && arg2.length > i); i++) {
			int i_5_ = (Class14_Sub2_Sub4.anIntArray3791
				    [method433(-94, i)]);
			if (-1 > (i_5_ ^ 0xffffffff))
			    arg0.method827((long) arg2[i], i_5_, (byte) 118);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_235_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("wb.L("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method444(int arg0, Class9 arg1) {
	try {
	    Class14_Sub8_Sub25.anInt4509
		= arg1.method146(Class73.aClass124_1105, arg0 + 30451);
	    if (arg0 != -30451)
		method444(69, null);
	    Class14_Sub8_Sub30.anInt4594
		= arg1.method146(Class20.aClass124_422, 0);
	    anInt4079++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wb.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method445(Class94 arg0, int arg1, boolean arg2) {
	try {
	    int i = ((arg0.anInt1544 ^ 0xffffffff) == -1 ? arg0.anInt1518
		     : arg0.anInt1544);
	    int i_6_ = (-1 != (arg0.anInt1605 ^ 0xffffffff) ? arg0.anInt1605
			: arg0.anInt1545);
	    anInt4069++;
	    if (arg1 != 18559)
		anInt4086 = -91;
	    Class14_Sub2_Sub15.method340((Class1.aClass94ArrayArray75
					  [arg0.anInt1548 >> 166652752]),
					 arg2, arg0.anInt1548, i, (byte) -73,
					 i_6_);
	    if (arg0.aClass94Array1486 != null)
		Class14_Sub2_Sub15.method340(arg0.aClass94Array1486, arg2,
					     arg0.anInt1548, i, (byte) -56,
					     i_6_);
	    Class14_Sub15 class14_sub15
		= ((Class14_Sub15)
		   Class14_Sub30.aClass55_3275
		       .method1230((long) arg0.anInt1548, (byte) -100));
	    if (null != class14_sub15)
		Class14_Sub8_Sub17.method566(i, class14_sub15.anInt2999, -1,
					     i_6_, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wb.G("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public int method446(byte arg0) {
    while_236_:
	do {
	    do {
		int i;
		try {
		    anInt4085++;
		    int i_7_ = 126 / ((-72 - arg0) / 50);
		    if (anIntArray4073 != null)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_236_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anIntArray4073.length;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "wb.I(" + arg0 + ')');
    }
    
    public void method447(int arg0, Class14_Sub10 arg1, int arg2) {
	try {
	    anInt4090++;
	    if (arg0 != 0)
		anInt4088 = -124;
	    if ((arg2 ^ 0xffffffff) != -2) {
		if (2 == arg2) {
		    int i = arg1.method798(arg0 + -73);
		    anIntArray4082 = new int[i];
		    for (int i_8_ = 0; i > i_8_; i_8_++)
			anIntArray4082[i_8_] = arg1.method784((byte) 123);
		} else if ((arg2 ^ 0xffffffff) == -4) {
		    int i = arg1.method798(arg0 + -67);
		    anIntArrayArray4075 = new int[i][];
		    anIntArray4073 = new int[i];
		    for (int i_9_ = 0; (i ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
			 i_9_++) {
			int i_10_ = arg1.method784((byte) 123);
			anIntArray4073[i_9_] = i_10_;
			anIntArrayArray4075[i_9_]
			    = new int[Class14_Sub9_Sub1.anIntArray4804[i_10_]];
			for (int i_11_ = 0;
			     ((Class14_Sub9_Sub1.anIntArray4804[i_10_]
			       ^ 0xffffffff)
			      < (i_11_ ^ 0xffffffff));
			     i_11_++)
			    anIntArrayArray4075[i_9_][i_11_]
				= arg1.method784((byte) 121);
		    }
		}
	    } else
		aClass124Array4080
		    = arg1.method797(arg0 ^ 0x24fb).method1719(60, 123);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wb.N(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    static {
	anIntArray4077 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
	anIntArray4078 = new int[4096];
	aClass124_4070 = Class14_Sub2_Sub2.method263(1178, "skill)2");
	aClass124_4083 = aClass124_4070;
    }
}
