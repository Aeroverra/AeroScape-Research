/* Class133_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub5 extends Class133
{
    public static int anInt3604;
    public int anInt3605;
    public static int anInt3606;
    public static Class124 aClass124_3607;
    public int anInt3608 = 0;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3609;
    public static Class124 aClass124_3610;
    public Class46 aClass46_3611;
    public static int anInt3612 = 0;
    public int anInt3613 = 0;
    public static int anInt3614;
    public static int anInt3615;
    public int anInt3616;
    public int anInt3617;
    public static int anInt3618;
    public static int anInt3619;
    public int anInt3620;
    public boolean aBoolean3621 = false;
    public int anInt3622;
    public static int[] anIntArray3623;
    public static int anInt3624;
    public static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_3625;
    public static int anInt3626;
    public static int anInt3627;
    public static boolean aBoolean3628 = false;
    public int anInt3629;
    public static int anInt3630;
    public int anInt3631;
    
    public static void method1843(int arg0, int arg1, Class94 arg2, int arg3) {
    while_1212_:
	do {
	while_1211_:
	    do {
		do {
		    try {
			anInt3630++;
			if (null == Class67.aClass94_1060 && !aBoolean3628)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1211_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (null != arg2
			    && Class14_Sub2_Sub15.method341(0, arg2) != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1211_;
		    }
		    return;
		} while (false);
		try {
		    Class67.aClass94_1060 = arg2;
		    Class20.aClass94_420
			= Class14_Sub2_Sub15.method341(0, arg2);
		    Class14_Sub8_Sub3.anInt4132 = arg3;
		    Class125_Sub4.anInt3419 = 0;
		    int i = 106 % ((arg0 - 9) / 39);
		    Class14_Sub8_Sub6.aBoolean4188 = false;
		    Canvas_Sub2.anInt63 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1212_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("nh.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	} while (false);
    }
    
    public static void method1844(int arg0) {
	try {
	    Class14_Sub2_Sub14.aClass52_3942.method1203((byte) -75);
	    if (arg0 != -32768)
		method1843(-36, 86, null, -1);
	    anInt3604++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nh.F(" + arg0 + ')');
	}
    }
    
    public void method1845(byte arg0, int arg1) {
    while_1215_:
	do {
	while_1214_:
	    do {
		do {
		    try {
			anInt3618++;
			if (arg0 > 81)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1214_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (!aBoolean3621)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1214_;
		    }
		    return;
		} while (false);
	    while_1213_:
		do {
		    try {
			anInt3608 += arg1;
			do {
			    if ((anInt3608 ^ 0xffffffff)
				>= (aClass46_3611.anIntArray763[anInt3613]
				    ^ 0xffffffff))
				break while_1213_;
			    anInt3608
				-= aClass46_3611.anIntArray763[anInt3613];
			    anInt3613++;
			} while ((anInt3613 ^ 0xffffffff)
				 > (aClass46_3611.anIntArray768.length
				    ^ 0xffffffff));
			aBoolean3621 = true;
		    } catch (RuntimeException runtimeexception) {
			break while_1214_;
		    }
		} while (false);
		break while_1215_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "nh.B(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method1846(boolean arg0) {
	try {
	    if (arg0)
		aClass14_Sub2_Sub19Array3609 = null;
	    aClass14_Sub2_Sub19Array3609 = null;
	    aClass124_3610 = null;
	    anIntArray3623 = null;
	    aClass124_3607 = null;
	    aClass14_Sub9_Sub1_3625 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nh.A(" + arg0 + ')');
	}
    }
    
    public Class133_Sub7 method1847(int arg0) {
    while_1216_:
	do {
	    Class133_Sub7 class133_sub7;
	    do {
		Class133_Sub7 class133_sub7_0_;
		try {
		    if (arg0 <= 4)
			aClass14_Sub9_Sub1_3625 = null;
		    anInt3615++;
		    Class60 class60
			= Class127.method1749(anInt3605, (byte) -109);
		    if (aBoolean3621)
			class133_sub7 = class60.method1267(0, -1);
		    else
			class133_sub7 = class60.method1267(0, anInt3613);
		    if (class133_sub7 != null)
			break;
		    class133_sub7_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1216_;
		}
		return class133_sub7_0_;
	    } while (false);
	    Class133_Sub7 class133_sub7_1_;
	    try {
		class133_sub7_1_ = class133_sub7;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "nh.D(" + arg0 + ')');
    }
    
    public int method1781() {
	int i;
	try {
	    anInt3606++;
	    i = anInt3617;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "nh.H()");
	}
	return i;
    }
    
    public static void method1848(boolean arg0) {
	try {
	    Class14_Sub2_Sub8.aClass124_3852 = Class96.aClass124_1634;
	    anInt3626++;
	    Class7.aClass124_180 = Class81.aClass124_1326;
	    Class137.aClass124_2201 = Class14_Sub20.aClass124_3089;
	    Class7_Sub2.aClass124_2669 = Class45.aClass124_738;
	    Class28.aClass124_514 = Class99_Sub2.aClass124_3347;
	    Class14_Sub2_Sub19.aClass124_4045 = Class131.aClass124_2156;
	    Class108.aClass124_1821 = Class2.aClass124_93;
	    Class14_Sub9_Sub1.aClass124_4773
		= Class14_Sub8_Sub23.aClass124_4482;
	    Class14_Sub2_Sub21.aClass124_4083 = Class14_Sub20.aClass124_3088;
	    Class4.aClass124_131 = Class122.aClass124_2058;
	    RuntimeException_Sub1.aClass124_2462 = Class86.aClass124_1384;
	    Class14_Sub8.aClass124_2852 = Class7_Sub3_Sub1.aClass124_3715;
	    Class14_Sub2_Sub17.aClass124_4019 = Class99_Sub2.aClass124_3337;
	    Class123.aClass124_2068 = Class98.aClass124_1673;
	    Class84.aClass124_1352 = Class133_Sub6.aClass124_3635;
	    Class125.aClass124_2077 = Class14_Sub8_Sub17.aClass124_4365;
	    Class138.aClass124_2226 = Class84.aClass124_1349;
	    Class14_Sub8_Sub17.aClass124_4368 = Class110.aClass124_1849;
	    Class7_Sub2.aClass124_2672 = Class14_Sub8_Sub33.aClass124_4632;
	    Class111.aClass124_1864 = Class14_Sub2_Sub3.aClass124_3778;
	    Class14_Sub8_Sub11.aClass124_4264 = Class76.aClass124_1203;
	    Class14_Sub8_Sub14.aClass124_4330
		= Class7_Sub3_Sub1.aClass124_3711;
	    Class14_Sub28.aClass124_3226 = Class14_Sub8_Sub10.aClass124_4259;
	    Class14_Sub30.aClass124_3274 = Class14_Sub8_Sub8.aClass124_4224;
	    Class14_Sub8_Sub27.aClass124_4538 = Class120.aClass124_2001;
	    client.aClass124_2631 = Class133_Sub6.aClass124_3666;
	    Class2.aClass124_94 = Class14_Sub8_Sub36.aClass124_4706;
	    Class133_Sub3.aClass124_3568 = Class115.aClass124_1924;
	    Class125_Sub3.aClass124_3409 = Class14_Sub2_Sub4.aClass124_3793;
	    Class14_Sub5.aClass124_2802 = Class19.aClass124_2542;
	    Class64.aClass124_1011 = Class99_Sub2.aClass124_3353;
	    Class127.aClass124_2117 = Class14_Sub2_Sub12.aClass124_3895;
	    Class14_Sub8_Sub2.aClass124_4113 = Class60.aClass124_982;
	    aClass124_3610 = Class14_Sub22.aClass124_3124;
	    Class124.aClass124_2497 = Class75.aClass124_1152;
	    Class14_Sub17.aClass124_3033 = Class14_Sub2_Sub1.aClass124_3747;
	    Class14_Sub8_Sub25.aClass124_4511 = Class108.aClass124_1828;
	    Class48.aClass124_797 = Class102.aClass124_1710;
	    Class12.aClass124_328 = Class14_Sub2_Sub7.aClass124_3821;
	    Class41.aClass124_694 = Class59.aClass124_956;
	    Class117.aClass124_1941 = Class1.aClass124_71;
	    Class14_Sub10.aClass124_2872 = Class115.aClass124_1910;
	    Class14_Sub11.aClass124_2943 = Class150.aClass124_2425;
	    if (arg0)
		aClass124_3607 = null;
	    Class14_Sub10_Sub1.aClass124_4886
		= Class14_Sub8_Sub1.aClass124_4100;
	    Class44.aClass124_729 = Class89.aClass124_1408;
	    Class14_Sub8_Sub5.aClass124_4167 = Class14_Sub5.aClass124_2804;
	    Class26_Sub1.aClass124_3291 = Class131.aClass124_2163;
	    Class14_Sub8_Sub13.aClass124_4302
		= Class14_Sub2_Sub19.aClass124_4040;
	    Class58.aClass124_942 = Class7_Sub1.aClass124_2660;
	    Class118.aClass124_1988 = Class133_Sub1_Sub2.aClass124_4950;
	    Class110.aClass124_1853 = Class9.aClass124_221;
	    Class97.aClass124_1640 = Class131.aClass124_2153;
	    Class14_Sub8_Sub2.aClass124_4122 = Class84.aClass124_1350;
	    RuntimeException_Sub1.aClass124_2456 = client.aClass124_2625;
	    Class111.aClass124_1858 = Class14_Sub2_Sub3.aClass124_3778;
	    Class79.aClass124_1255 = Class14_Sub8_Sub37.aClass124_4719;
	    Class14_Sub8_Sub7.aClass124_4203 = Class14_Sub23.aClass124_3130;
	    Class14_Sub9_Sub1.aClass124_4762
		= Class14_Sub8_Sub33.aClass124_4635;
	    Class14_Sub8_Sub22.aClass124_4453 = Class74.aClass124_1137;
	    Class17.aClass124_405 = Class14_Sub8_Sub33.aClass124_4644;
	    Class100.aClass124_1693 = Class74.aClass124_1141;
	    Class104.aClass124_1736 = Class14_Sub8_Sub2.aClass124_4121;
	    client.aClass124_2639 = Class14_Sub8.aClass124_2857;
	    Class129.aClass124_2129 = Class74.aClass124_1139;
	    Class128.aClass124_2122 = Class14_Sub8_Sub14.aClass124_4325;
	    Class14_Sub8_Sub7.aClass124_4202 = Class26.aClass124_499;
	    Class108.aClass124_1825 = Class107.aClass124_1801;
	    Class53.aClass124_869 = Class14_Sub8_Sub18.aClass124_4393;
	    Class74.aClass124_1142 = Class14_Sub20.aClass124_3096;
	    Class14_Sub28.aClass124_3229 = Class75.aClass124_1165;
	    Class14_Sub8_Sub13.aClass124_4315
		= Class14_Sub2_Sub10.aClass124_3867;
	    Class14_Sub8_Sub2.aClass124_4118 = Class14_Sub13.aClass124_2955;
	    Class14_Sub2_Sub14.aClass124_3948
		= Class14_Sub8_Sub36.aClass124_4696;
	    Class100.aClass124_1683 = Class133_Sub1_Sub2.aClass124_4948;
	    Class75.aClass124_1182 = Class56_Sub1.aClass124_3321;
	    Class104.aClass124_1743 = Class40.aClass124_680;
	    Class15.aClass124_373 = Class133_Sub1_Sub1.aClass124_4942;
	    Class14_Sub8_Sub36.aClass124_4702
		= Class14_Sub8_Sub19.aClass124_4412;
	    Class41.aClass124_695 = Class59.aClass124_956;
	    Class118.aClass124_1981 = Class14_Sub30.aClass124_3281;
	    Class14_Sub6.aClass124_2810 = Class138.aClass124_2227;
	    Class14_Sub8.aClass124_2855 = Class100.aClass124_1689;
	    Class14_Sub2_Sub12.aClass124_3910 = Class14_Sub25.aClass124_3175;
	    Class14_Sub9_Sub1.aClass124_4770 = Class82.aClass124_1329;
	    Class40.aClass124_665 = Class35.aClass124_598;
	    Class138.aClass124_2219 = Class84.aClass124_1349;
	    Class108.aClass124_1814 = Class47.aClass124_787;
	    Class14_Sub9_Sub1.aClass124_4808 = Class64.aClass124_1009;
	    Class56.aClass124_923 = Class69.aClass124_1067;
	    Class106.aClass124_1781 = Class51.aClass124_841;
	    Class133.aClass124_2183 = Class133.aClass124_2175;
	    Class118.aClass124_1973 = Class138.aClass124_2215;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nh.C(" + arg0 + ')');
	}
    }
    
    public void method1792(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8) {
    while_1218_:
	do {
	while_1217_:
	    do {
		Class133_Sub7 class133_sub7;
		do {
		    try {
			anInt3624++;
			class133_sub7 = method1847(5);
			if (class133_sub7 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1217_;
		    }
		    return;
		} while (false);
		try {
		    class133_sub7.method1792(arg0, arg1, arg2, arg3, arg4,
					     arg5, arg6, arg7, arg8);
		    anInt3617 = class133_sub7.method1781();
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1218_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("nh.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	} while (false);
    }
    
    public Class133_Sub5(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	anInt3617 = -32768;
	try {
	    anInt3620 = arg1;
	    anInt3622 = arg2;
	    anInt3616 = arg5 + arg6;
	    anInt3631 = arg3;
	    anInt3605 = arg0;
	    anInt3629 = arg4;
	    int i = Class127.method1749(anInt3605, (byte) 45).anInt966;
	    if (0 != (i ^ 0xffffffff)) {
		aBoolean3621 = false;
		aClass46_3611 = Class41.method1129(i, -120);
	    } else
		aBoolean3621 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("nh.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	}
    }
    
    static {
	aClass124_3607 = Class14_Sub2_Sub2.method263(1178, "Close");
	aClass124_3610 = aClass124_3607;
    }
}
