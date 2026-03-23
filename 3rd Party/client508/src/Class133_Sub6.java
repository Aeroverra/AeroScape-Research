/* Class133_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import nativeadvert.browsercontrol;

public class Class133_Sub6 extends Class133
{
    public static Class124 aClass124_3632;
    public double aDouble3633;
    public static int anInt3634 = 0;
    public static Class124 aClass124_3635;
    public static Class124 aClass124_3636;
    public static Class124 aClass124_3637;
    public Class46 aClass46_3638;
    public static Class124 aClass124_3639;
    public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_3640;
    public int anInt3641;
    public static Class124[] aClass124Array3642;
    public boolean aBoolean3643 = false;
    public int anInt3644;
    public static int anInt3645;
    public double aDouble3646;
    public static int anInt3647;
    public static int anInt3648;
    public static Class124 aClass124_3649;
    public double aDouble3650;
    public static Class124 aClass124_3651
	= Class14_Sub2_Sub2.method263(1178, "Oct");
    public int anInt3652;
    public static int anInt3653;
    public static Class124 aClass124_3654;
    public int anInt3655;
    public int anInt3656 = 0;
    public static Class124 aClass124_3657;
    public int anInt3658;
    public static int anInt3659;
    public static Class124 aClass124_3660
	= Class14_Sub2_Sub2.method263(1178, "Dec");
    public double aDouble3661;
    public int anInt3662;
    public static boolean aBoolean3663;
    public static Class124 aClass124_3664;
    public int anInt3665;
    public static Class124 aClass124_3666;
    public int anInt3667;
    public static int anInt3668;
    public int anInt3669;
    public int anInt3670;
    public static int anInt3671;
    public double aDouble3672;
    public static int anInt3673;
    public double aDouble3674;
    public static short[] aShortArray3675;
    public static int anInt3676;
    public static Class124 aClass124_3677;
    public double aDouble3678;
    public int anInt3679;
    public double aDouble3680;
    public static Class124 aClass124_3681;
    public int anInt3682;
    public int anInt3683;
    public static int anInt3684;
    public int anInt3685;
    public int anInt3686;
    
    public void method1849(int arg0, byte arg1, int arg2, int arg3, int arg4) {
    while_1220_:
	do {
	while_1219_:
	    do {
		double d;
		do {
		    try {
			if (!aBoolean3643) {
			    d = (double) (-anInt3686 + arg2);
			    double d_0_ = (double) (arg3 - anInt3683);
			    double d_1_ = Math.sqrt(d_0_ * d_0_ + d * d);
			    aDouble3633 = (double) anInt3685;
			    aDouble3678 = ((double) anInt3686
					   + d * (double) anInt3658 / d_1_);
			    aDouble3646 = ((double) anInt3683
					   + d_0_ * (double) anInt3658 / d_1_);
			}
			anInt3671++;
			d = (double) (1 + anInt3644 + -arg0);
			aDouble3650 = ((double) arg3 - aDouble3646) / d;
			aDouble3672 = ((double) arg2 - aDouble3678) / d;
			aDouble3674 = Math.sqrt(aDouble3650 * aDouble3650
						+ aDouble3672 * aDouble3672);
			if (arg1 == -122)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1219_;
		    }
		    return;
		} while (false);
		try {
		    if (!aBoolean3643)
			aDouble3680
			    = (-aDouble3674
			       * Math.tan(0.02454369 * (double) anInt3682));
		    aDouble3661 = 2.0 * (-aDouble3633 + (double) arg4
					 - d * aDouble3680) / (d * d);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1220_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("oh.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public int method1781() {
	int i;
	try {
	    anInt3648++;
	    i = anInt3670;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "oh.H()");
	}
	return i;
    }
    
    public Class133_Sub7 method1850(int arg0) {
    while_1221_:
	do {
	    Class133_Sub7 class133_sub7;
	    do {
		Class133_Sub7 class133_sub7_2_;
		try {
		    anInt3653++;
		    Class60 class60
			= Class127.method1749(anInt3652, (byte) 42);
		    if (arg0 >= -114)
			method1853(73, -56);
		    class133_sub7 = class60.method1267(0, anInt3641);
		    if (null != class133_sub7)
			break;
		    class133_sub7_2_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1221_;
		}
		return class133_sub7_2_;
	    } while (false);
	    Class133_Sub7 class133_sub7_3_;
	    try {
		class133_sub7.method1861(anInt3662);
		class133_sub7_3_ = class133_sub7;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_3_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "oh.C(" + arg0 + ')');
    }
    
    public void method1851(int arg0, int arg1) {
	try {
	    aDouble3646 += aDouble3650 * (double) arg1;
	    aDouble3678 += aDouble3672 * (double) arg1;
	    anInt3668++;
	    aDouble3633
		+= (aDouble3680 * (double) arg1
		    + (double) arg1 * (0.5 * aDouble3661 * (double) arg1));
	    aDouble3680 += (double) arg1 * aDouble3661;
	    if (arg0 > -87)
		method1781();
	    aBoolean3643 = true;
	    anInt3665 = ((int) (325.949 * Math.atan2(aDouble3672, aDouble3650))
			 - -1024) & 0x7ff;
	    anInt3662 = ((int) (Math.atan2(aDouble3680, aDouble3674) * 325.949)
			 & 0x7ff);
	    if (aClass46_3638 != null) {
		anInt3656 += arg1;
		while (aClass46_3638.anIntArray763[anInt3641] < anInt3656) {
		    anInt3656 -= aClass46_3638.anIntArray763[anInt3641];
		    anInt3641++;
		    if ((aClass46_3638.anIntArray768.length ^ 0xffffffff)
			>= (anInt3641 ^ 0xffffffff)) {
			anInt3641 -= aClass46_3638.anInt760;
			if (0 > anInt3641
			    || (aClass46_3638.anIntArray768.length
				^ 0xffffffff) >= (anInt3641 ^ 0xffffffff))
			    anInt3641 = 0;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("oh.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1852(int arg0) {
	try {
	    aClass124_3635 = null;
	    aClass124_3666 = null;
	    aClass124_3660 = null;
	    aClass124_3632 = null;
	    aClass124_3637 = null;
	    aClass124_3677 = null;
	    aClass124_3639 = null;
	    aClass124_3649 = null;
	    aClass124_3654 = null;
	    aClass124_3681 = null;
	    aClass124_3657 = null;
	    aShortArray3675 = null;
	    aClass124_3651 = null;
	    aClass124_3664 = null;
	    aClass14_Sub2_Sub19_3640 = null;
	    if (arg0 <= 75)
		method1853(97, 113);
	    aClass124Array3642 = null;
	    aClass124_3636 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "oh.F(" + arg0 + ')');
	}
    }
    
    public static void method1853(int arg0, int arg1) {
	try {
	    anInt3647++;
	    Class150.aClass52_2406.method1208((byte) -112, arg0);
	    Class14_Sub8_Sub30.aClass52_4588.method1208((byte) -112, arg0);
	    if (arg1 != -32768)
		method1854(-5, -101, 81);
	    Class83.aClass52_1339.method1208((byte) -112, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("oh.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method1792(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8) {
    while_1223_:
	do {
	while_1222_:
	    do {
		Class133_Sub7 class133_sub7;
		do {
		    try {
			anInt3684++;
			class133_sub7 = method1850(-126);
			if (null != class133_sub7)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1222_;
		    }
		    return;
		} while (false);
		try {
		    class133_sub7.method1792(arg0, arg1, arg2, arg3, arg4,
					     arg5, arg6, arg7, arg8);
		    anInt3670 = class133_sub7.method1781();
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1223_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("oh.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	} while (false);
    }
    
    public static void method1854(int arg0, int arg1, int arg2) {
    while_1225_:
	do {
	while_1224_:
	    do {
		do {
		    try {
			anInt3645++;
			Class121.method1630();
			if (browsercontrol.iscreated())
			    browsercontrol.hide();
			if (arg2 >= 32)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1224_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub15.aFrame3962
			= Class138.method1950(arg1, 95, 0, arg0,
					      Class14_Sub8_Sub34.aClass43_4647,
					      0);
		    if (null != Class14_Sub2_Sub15.aFrame3962) {
			Class14_Sub2.anInt2725 = arg1;
			Class54.anInt887 = arg0;
			Class14_Sub8_Sub22.method595(257411150,
						     (Class14_Sub8_Sub34
						      .aClass43_4647));
			Class14_Sub8_Sub30.method643(0, (byte) -82);
			Class14_Sub21.method897(110);
		    } else
			Class14_Sub2_Sub20.method428(121);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1225_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("oh.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public Class133_Sub6(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9,
			 int arg10) {
	anInt3641 = 0;
	anInt3670 = -32768;
	try {
	    anInt3669 = arg9;
	    anInt3658 = arg8;
	    anInt3644 = arg6;
	    aBoolean3643 = false;
	    anInt3655 = arg1;
	    anInt3686 = arg2;
	    anInt3679 = arg5;
	    anInt3652 = arg0;
	    anInt3682 = arg7;
	    anInt3685 = arg4;
	    anInt3683 = arg3;
	    anInt3667 = arg10;
	    int i = Class127.method1749(anInt3652, (byte) 66).anInt966;
	    if (i != -1)
		aClass46_3638 = Class41.method1129(i, -124);
	    else
		aClass46_3638 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("oh.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ','
						+ arg7 + ',' + arg8 + ','
						+ arg9 + ',' + arg10 + ')'));
	}
    }
    
    static {
	aClass124_3635 = Class14_Sub2_Sub2.method263(1178, "gr-Un:");
	aClass124_3639 = Class14_Sub2_Sub2.method263(1178, "Mar");
	aClass124_3636 = Class14_Sub2_Sub2.method263(1178, "Nov");
	aClass124_3664 = Class14_Sub2_Sub2.method263(1178, "Apr");
	aBoolean3663 = false;
	aClass124_3666
	    = Class14_Sub2_Sub2.method263(1178, "Texturen geladen)3");
	aClass124_3649 = Class14_Sub2_Sub2.method263(1178, "Jul");
	aClass124_3632 = Class14_Sub2_Sub2.method263(1178, "May");
	aClass124_3637 = Class14_Sub2_Sub2.method263(1178, "Feb");
	aClass124_3681 = Class14_Sub2_Sub2.method263(1178, "Jan");
	aClass124_3654 = Class14_Sub2_Sub2.method263(1178, "Aug");
	aClass124_3677 = Class14_Sub2_Sub2.method263(1178, "Sep");
	aClass124_3657 = Class14_Sub2_Sub2.method263(1178, "Jun");
	aClass124Array3642
	    = new Class124[] { aClass124_3681, aClass124_3637, aClass124_3639,
			       aClass124_3664, aClass124_3632, aClass124_3657,
			       aClass124_3649, aClass124_3654, aClass124_3677,
			       aClass124_3651, aClass124_3636,
			       aClass124_3660 };
    }
}
