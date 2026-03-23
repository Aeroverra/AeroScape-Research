/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class2
{
    public static int anInt76;
    public static int anInt77;
    public static int anInt78;
    public static int anInt79;
    public static int anInt80;
    public static int anInt81;
    public static int anInt82;
    public static int anInt83;
    public Class14 aClass14_84 = new Class14();
    public static int anInt85;
    public static int anInt86;
    public static int anInt87;
    public static int anInt88;
    public static int anInt89;
    public Class14 aClass14_90;
    public static int anInt91;
    public static Class55 aClass55_92 = new Class55(16);
    public static Class124 aClass124_93
	= Class14_Sub2_Sub2.method263(1178, "welle2:");
    public static Class124 aClass124_94;
    public static long aLong95;
    public static int anInt96 = 0;
    public static int anInt97;
    public static short[][] aShortArrayArray98;
    public static Class2 aClass2_99;
    public static Class124 aClass124_100
	= Class14_Sub2_Sub2.method263(1178, "Allocating memory");
    public static int anInt101;
    public static int anInt102;
    
    public int method74(int arg0) {
	int i;
	try {
	    int i_0_ = 0;
	    Class14 class14 = aClass14_84.aClass14_368;
	    anInt83++;
	    while (class14 != aClass14_84) {
		class14 = class14.aClass14_368;
		i_0_++;
	    }
	    if (arg0 != -20454)
		method88(true, -18);
	    i = i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "af.B(" + arg0 + ')');
	}
	return i;
    }
    
    public static void method75(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, int arg10) {
	try {
	    anInt91++;
	    int i = -arg1 + arg2;
	    if (arg8 < 76)
		method85(null, false);
	    int i_1_ = -arg9 + arg4;
	    boolean bool;
	    if (Class14.anInt365 > 0
		&& (Class14.anInt365 % 10 ^ 0xffffffff) > -6)
		bool = true;
	    else
		bool = false;
	    int i_2_ = 983040 / arg7;
	    int i_3_ = 983040 / arg3;
	    for (int i_4_ = -i_2_;
		 (i_2_ + i_1_ ^ 0xffffffff) < (i_4_ ^ 0xffffffff); i_4_++) {
		int i_5_ = arg0 + i_4_ * arg7 >> 1954140560;
		int i_6_ = arg0 - -((1 + i_4_) * arg7) >> 1441203280;
		int i_7_ = i_6_ - i_5_;
		if (0 < i_7_) {
		    i_6_ += arg6;
		    int i_8_ = i_4_ + arg9 >> 1900317798;
		    i_5_ += arg6;
		    if (-1 >= (i_8_ ^ 0xffffffff)
			&& (-1 + Class14_Sub25.anIntArrayArrayArray3174.length
			    ^ 0xffffffff) <= (i_8_ ^ 0xffffffff)) {
			int[][] is
			    = Class14_Sub25.anIntArrayArrayArray3174[i_8_];
			for (int i_9_ = -i_3_;
			     (i - -i_3_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
			     i_9_++) {
			    int i_10_
				= arg10 - -((1 + i_9_) * arg3) >> -412025616;
			    int i_11_ = arg3 * i_9_ + arg10 >> 255812432;
			    int i_12_ = i_10_ + -i_11_;
			    if (-1 > (i_12_ ^ 0xffffffff)) {
				i_10_ += arg5;
				i_11_ += arg5;
				int i_13_ = arg1 + i_9_ >> -246605050;
				if (0 <= i_13_
				    && (i_13_ ^ 0xffffffff) >= (-1 + is.length
								^ 0xffffffff)
				    && null != is[i_13_]) {
				    int i_14_ = ((arg9 + i_4_ & 0x3f)
						 + (i_9_ + arg1 << 1033735750
						    & 0xfc0));
				    int i_15_ = is[i_13_][i_14_];
				    if ((i_15_ ^ 0xffffffff) != -1) {
					Class79 class79
					    = Class79.method1377((byte) -106,
								 -1 + i_15_);
					if (bool && ((Class97.anInt1656
						      ^ 0xffffffff)
						     == (class79.anInt1262
							 ^ 0xffffffff))) {
					    Class14_Sub20 class14_sub20
						= new Class14_Sub20();
					    class14_sub20.anInt3083 = i_5_;
					    class14_sub20.anInt3085
						= class79.anInt1262;
					    class14_sub20.anInt3084 = i_11_;
					    Class14_Sub4.aClass2_2787.method80
						(class14_sub20, (byte) -123);
					}
					Class109
					    .aClass14_Sub2_Sub19_Sub1Array1835
					    [class79.anInt1262]
					    .method391(i_5_ - 7, -7 + i_11_);
				    }
				}
			    }
			}
		    }
		}
	    }
	    for (Class14_Sub20 class14_sub20
		     = (Class14_Sub20) Class14_Sub4.aClass2_2787.method77(0);
		 class14_sub20 != null;
		 class14_sub20 = ((Class14_Sub20)
				  Class14_Sub4.aClass2_2787.method84(-102))) {
		Class109.aClass14_Sub2_Sub19_Sub1Array1835
		    [class14_sub20.anInt3085].method391
		    (class14_sub20.anInt3083 - 7,
		     class14_sub20.anInt3084 + -7);
		Class92.method1460(class14_sub20.anInt3083,
				   class14_sub20.anInt3084, 15, 16776960, 128);
		Class92.method1460(class14_sub20.anInt3083,
				   class14_sub20.anInt3084, 7, 16777215, 256);
	    }
	    Class14_Sub4.aClass2_2787.method81((byte) -118);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("af.L(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ','
						+ arg10 + ')'));
	}
    }
    
    public Class14 method76(int arg0) {
    while_25_:
	do {
	    Class14 class14;
	    do {
		Class14 class14_16_;
		try {
		    anInt87++;
		    class14 = aClass14_90;
		    if (class14 != aClass14_84)
			break;
		    aClass14_90 = null;
		    class14_16_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_25_;
		}
		return class14_16_;
	    } while (false);
	    do {
		Class14 class14_17_;
		try {
		    if (arg0 == -1)
			break;
		    class14_17_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_25_;
		}
		return class14_17_;
	    } while (false);
	    Class14 class14_18_;
	    try {
		aClass14_90 = class14.aClass14_354;
		class14_18_ = class14;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_18_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "af.E(" + arg0 + ')');
    }
    
    public Class14 method77(int arg0) {
    while_26_:
	do {
	    Class14 class14;
	    do {
		Class14 class14_19_;
		try {
		    anInt81++;
		    if (arg0 != 0)
			anInt96 = 26;
		    class14 = aClass14_84.aClass14_368;
		    if (class14 != aClass14_84)
			break;
		    aClass14_90 = null;
		    class14_19_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return class14_19_;
	    } while (false);
	    Class14 class14_20_;
	    try {
		aClass14_90 = class14.aClass14_368;
		class14_20_ = class14;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_20_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "af.P(" + arg0 + ')');
    }
    
    public Class14 method78(int arg0) {
    while_27_:
	do {
	    Class14 class14;
	    do {
		Class14 class14_21_;
		try {
		    if (arg0 != 128)
			method79(122, 99, -124);
		    class14 = aClass14_84.aClass14_368;
		    anInt76++;
		    if (aClass14_84 != class14)
			break;
		    class14_21_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_27_;
		}
		return class14_21_;
	    } while (false);
	    Class14 class14_22_;
	    try {
		class14.method233(0);
		class14_22_ = class14;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_22_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "af.G(" + arg0 + ')');
    }
    
    public static long method79(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null || class14_sub29.aClass113_3250 == null)
	    return 0L;
	return class14_sub29.aClass113_3250.aLong1887;
    }
    
    public void method80(Class14 arg0, byte arg1) {
	try {
	    if (arg1 > -116)
		aClass55_92 = null;
	    anInt85++;
	    if (null != arg0.aClass14_354)
		arg0.method233(0);
	    arg0.aClass14_368 = aClass14_84;
	    arg0.aClass14_354 = aClass14_84.aClass14_354;
	    arg0.aClass14_354.aClass14_368 = arg0;
	    arg0.aClass14_368.aClass14_354 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("af.O("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method81(byte arg0) {
    while_29_:
	do {
	while_28_:
	    do {
		do {
		    try {
			anInt88++;
			if (arg0 < -72)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_28_;
		    }
		    return;
		} while (false);
		try {
		    for (;;) {
			Class14 class14 = aClass14_84.aClass14_368;
			if (aClass14_84 == class14)
			    break;
			class14.method233(0);
		    }
		    aClass14_90 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_29_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "af.A(" + arg0 + ')');
	} while (false);
    }
    
    public static int method82(int arg0, int arg1) {
    while_30_:
	do {
	    do {
		int i;
		try {
		    anInt89++;
		    if (arg1 > -98)
			anInt101 = -75;
		    if (16711935 != arg0)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_30_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = Class128.method1759(arg0, (byte) 48);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "af.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class14 method83(int arg0) {
    while_31_:
	do {
	    Class14 class14;
	    do {
		Class14 class14_23_;
		try {
		    anInt77++;
		    class14 = aClass14_84.aClass14_354;
		    if (class14 != aClass14_84)
			break;
		    aClass14_90 = null;
		    class14_23_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_31_;
		}
		return class14_23_;
	    } while (false);
	    do {
		Class14 class14_24_;
		try {
		    aClass14_90 = class14.aClass14_354;
		    if (arg0 == -1)
			break;
		    class14_24_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_31_;
		}
		return class14_24_;
	    } while (false);
	    Class14 class14_25_;
	    try {
		class14_25_ = class14;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_25_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "af.M(" + arg0 + ')');
    }
    
    public Class14 method84(int arg0) {
    while_32_:
	do {
	    Class14 class14;
	    do {
		Class14 class14_26_;
		try {
		    class14 = aClass14_90;
		    if (arg0 <= -47)
			break;
		    class14_26_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_32_;
		}
		return class14_26_;
	    } while (false);
	    do {
		Class14 class14_27_;
		try {
		    anInt86++;
		    if (aClass14_84 != class14)
			break;
		    aClass14_90 = null;
		    class14_27_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_32_;
		}
		return class14_27_;
	    } while (false);
	    Class14 class14_28_;
	    try {
		aClass14_90 = class14.aClass14_368;
		class14_28_ = class14;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_28_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "af.N(" + arg0 + ')');
    }
    
    public static void method85(Class9 arg0, boolean arg1) {
	try {
	    anInt82++;
	    Class97.aClass148_Sub1Array1651
		= Class125_Sub1.method1729(arg0, Class7_Sub3.anInt2681, 0,
					   (byte) 48);
	    Class32.aClass148_Sub1Array540
		= new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
	    Class14_Sub29.aClass148_Sub1Array3265
		= new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
	    Class133_Sub1_Sub1.aClass148_Sub1Array4938
		= new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class97.aClass148_Sub1Array1651.length ^ 0xffffffff));
		 i++) {
		Class97.aClass148_Sub1Array1651[i].method2004();
		Class32.aClass148_Sub1Array540[i]
		    = Class97.aClass148_Sub1Array1651[i].method2007();
		Class97.aClass148_Sub1Array1651[i].method2004();
		Class14_Sub29.aClass148_Sub1Array3265[i]
		    = Class97.aClass148_Sub1Array1651[i].method2007();
		Class97.aClass148_Sub1Array1651[i].method2004();
		Class133_Sub1_Sub1.aClass148_Sub1Array4938[i]
		    = Class97.aClass148_Sub1Array1651[i].method2007();
		Class97.aClass148_Sub1Array1651[i].method2004();
	    }
	    Class133.aClass14_Sub2_Sub19_Sub1Array2186
		= Class90.method1446(Class149.anInt2389, arg0, 127, 0);
	    Class133_Sub5.aClass14_Sub2_Sub19Array3609
		= Class125_Sub2.method1733((byte) 40, arg0, 0,
					   Class36.anInt629);
	    Class14_Sub8_Sub18.aClass14_Sub2_Sub19Array4385
		= Class125_Sub2.method1733((byte) 21, arg0, 0,
					   Class14_Sub2_Sub3.anInt3787);
	    Class98.aClass14_Sub2_Sub19Array1669
		= Class125_Sub2.method1733((byte) 118, arg0, 0,
					   Class153.anInt2450);
	    Class35.aClass14_Sub2_Sub19Array596
		= Class125_Sub2.method1733((byte) 43, arg0, 0,
					   Class133_Sub4.anInt3584);
	    Class76.aClass14_Sub2_Sub19Array1191
		= Class38.method1115(false, arg0, 0,
				     Class14_Sub2_Sub18_Sub2.anInt5087);
	    Class150.aClass14_Sub2_Sub19Array2417
		= Class38.method1115(false, arg0, 0, Class85.anInt1369);
	    Class149.aClass14_Sub2_Sub19_2384
		= Class58.method1259(-106, arg0, 0, Class38.anInt2618);
	    Class14_Sub2_Sub15.aClass14_Sub2_Sub19Array3958
		= Class38.method1115(false, arg0, 0, Class58.anInt937);
	    Class14_Sub20.aClass14_Sub2_Sub19Array3098
		= Class38.method1115(false, arg0, 0, Class111.anInt1857);
	    Class110.aClass148Array1848
		= Class126.method1747(0, Class14_Sub8_Sub38.anInt4735, 229,
				      arg0);
	    Class106.aClass148Array1777
		= Class126.method1747(0, Class82.anInt1334, 229, arg0);
	    Class56_Sub1.aClass14_Sub2_Sub16_3320
		.method352(Class106.aClass148Array1777, null);
	    Class84.aClass14_Sub2_Sub16_1344
		.method352(Class106.aClass148Array1777, null);
	    Class133_Sub3.aClass14_Sub2_Sub16_3567
		.method352(Class106.aClass148Array1777, null);
	    Class151.aClass148_Sub1Array2431
		= Class125_Sub1.method1729(arg0, Class9_Sub1.anInt2688, 0,
					   (byte) 48);
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class151.aClass148_Sub1Array2431.length ^ 0xffffffff));
		 i++)
		Class151.aClass148_Sub1Array2431[i].method2009();
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1
		= Class14_Sub8_Sub1.method485(-99, arg0,
					      Class14_Sub1.anInt2720, 0);
	    class14_sub2_sub19_sub1.method404();
	    Class14_Sub8_Sub25.aClass14_Sub2_Sub19_4508
		= new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
	    Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s
		= Class90.method1446(Class14_Sub8_Sub13.anInt4310, arg0, 120,
				     0);
	    for (int i = 0; i < class14_sub2_sub19_sub1s.length; i++)
		class14_sub2_sub19_sub1s[i].method404();
	    Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013
		= new Class14_Sub2_Sub19[class14_sub2_sub19_sub1s.length];
	    for (int i = 0; (i ^ 0xffffffff) > (class14_sub2_sub19_sub1s.length
						^ 0xffffffff); i++)
		Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013[i]
		    = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1s[i]);
	    if (arg1 != true)
		anInt102 = -61;
	    int i = (int) (Math.random() * 21.0) - 10;
	    int i_29_ = (int) (21.0 * Math.random()) + -10;
	    int i_30_ = -10 + (int) (Math.random() * 21.0);
	    int i_31_ = -20 + (int) (41.0 * Math.random());
	    for (int i_32_ = 0;
		 ((Class133.aClass14_Sub2_Sub19_Sub1Array2186.length
		   ^ 0xffffffff)
		  < (i_32_ ^ 0xffffffff));
		 i_32_++)
		Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_32_]
		    .method410(i_31_ + i, i_29_ - -i_31_, i_30_ + i_31_);
	    Class97.aClass148_Sub1Array1651[0]
		.method2003(i_31_ + i, i_29_ + i_31_, i_31_ + i_30_);
	    Class14_Sub8_Sub17.aClass14_Sub2_Sub19Array4366
		= (new Class14_Sub2_Sub19
		   [Class133.aClass14_Sub2_Sub19_Sub1Array2186.length]);
	    for (int i_33_ = 0;
		 Class133.aClass14_Sub2_Sub19_Sub1Array2186.length > i_33_;
		 i_33_++)
		Class14_Sub8_Sub17.aClass14_Sub2_Sub19Array4366[i_33_]
		    = (new Class14_Sub2_Sub19_Sub2
		       (Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_33_]));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("af.F("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method86(int arg0) {
    while_34_:
	do {
	while_33_:
	    do {
		do {
		    try {
			anInt78++;
			if (Class14_Sub2_Sub5.aBoolean3803)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_33_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = null;
		    Class133_Sub1_Sub1.aClass148_4915 = null;
		    if (arg0 > -9)
			method75(106, 44, 51, -42, -7, -46, 88, 107, 84, 88,
				 -48);
		    Class14_Sub2_Sub5.aBoolean3803 = false;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_34_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "af.J(" + arg0 + ')');
	} while (false);
    }
    
    public void method87(byte arg0, Class14 arg1) {
	try {
	    if (arg1.aClass14_354 != null)
		arg1.method233(0);
	    int i = 124 / ((arg0 - -45) / 51);
	    anInt79++;
	    arg1.aClass14_354 = aClass14_84;
	    arg1.aClass14_368 = aClass14_84.aClass14_368;
	    arg1.aClass14_354.aClass14_368 = arg1;
	    arg1.aClass14_368.aClass14_354 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("af.I(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class2() {
	try {
	    aClass14_84.aClass14_368 = aClass14_84;
	    aClass14_84.aClass14_354 = aClass14_84;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "af.<init>()");
	}
    }
    
    public static void method88(boolean arg0, int arg1) {
    while_36_:
	do {
	while_35_:
	    do {
		do {
		    try {
			Class14_Sub8_Sub9.aClass52_4240.method1208((byte) -112,
								   arg1);
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_35_;
		    }
		    return;
		} while (false);
		try {
		    anInt80++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_36_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "af.C(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method89(int arg0) {
    while_38_:
	do {
	while_37_:
	    do {
		do {
		    try {
			aClass124_100 = null;
			aClass124_93 = null;
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_37_;
		    }
		    return;
		} while (false);
		try {
		    aClass55_92 = null;
		    aClass2_99 = null;
		    aClass124_94 = null;
		    aShortArrayArray98 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_38_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "af.D(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass124_94 = aClass124_100;
	aLong95 = 0L;
	aClass2_99 = new Class2();
	anInt102 = 128;
    }
}
