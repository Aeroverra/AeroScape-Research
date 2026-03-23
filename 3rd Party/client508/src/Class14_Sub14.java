/* Class14_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.io.IOException;
import java.util.zip.CRC32;

public class Class14_Sub14 extends Class14
{
    public int anInt2965;
    public int anInt2966;
    public int anInt2967;
    public int anInt2968;
    public int anInt2969;
    public int anInt2970;
    public int anInt2971;
    public static int anInt2972;
    public static int anInt2973;
    public static int anInt2974;
    public int anInt2975;
    public int anInt2976;
    public static int anInt2977;
    public static int anInt2978;
    public int anInt2979;
    public int anInt2980 = 0;
    public int anInt2981;
    public static Class52 aClass52_2982 = new Class52(64);
    public static CRC32 aCRC32_2983 = new CRC32();
    public static int anInt2984;
    public static int[] anIntArray2985
	= { 0, 3, 0, 0, 0, 0, 6, 0, 2, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14,
	    0, 0, 0, 5, 0, 0, 0, 15, 4, 0, 0, 0, 0, 10, 0, 2, 0, 0, 4, 6, 4, 0,
	    0, 0, 0, -1, 0, 10, 7, 0, 0, 0, 0, 24, 0, 3, 0, 5, 0, 0, 0, 0, 6,
	    0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0,
	    0, 0, -1, 0, 0, 0, 7, 0, 0, 0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0,
	    6, 4, 0, 15, 0, 0, 1, 0, -2, 8, 5, 8, -1, 0, 0, -2, 0, 0, 0, 0, 0,
	    8, 0, -1, 0, 0, -2, 0, 20, 0, -2, 10, 0, -2, 0, -1, 0, 2, 0, 0, -1,
	    0, 0, -2, 4, -1, 0, 8, 0, 0, 1, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, -2,
	    1, 4, -2, 8, 0, -1, 2, -1, -2, 0, 0, 0, 0, 6, 0, 3, 0, 0, 0, 2, -1,
	    0, 6, 0, 7, 2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 6, 0, 0,
	    0, 0, -2, 6, -1, 4, 0, 0, -2, 12, 0, 0, 1, 9, 0, -1, 0, 0, 5, 0,
	    -1, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 6, 4, 5, 6, 2, 0, 5, -1, 0, 0,
	    -2 };
    public static Frame aFrame2986;
    public static Class14_Sub29[][][] aClass14_Sub29ArrayArrayArray2987;
    
    public static void method865(Class43 arg0, boolean arg1, int arg2) {
	try {
	    anInt2973++;
	    if (arg1) {
		Class14_Sub8_Sub6.anInt4190 = 3;
		Class14_Sub8_Sub3.method495((byte) -47, false);
		Class15.aBoolean374 = false;
		Class14_Sub29.anInt3266 = 127;
		Class148.aBoolean2372 = false;
		Class33.aBoolean584 = false;
		Class7_Sub1.aBoolean2661 = false;
		Class139.aBoolean2233 = false;
		Class100.anInt1691 = 127;
		Class52.aBoolean845 = false;
		Class14_Sub8_Sub20.aBoolean4420 = false;
		Class14_Sub2.anInt2725 = 0;
		Class135.aBoolean2190 = false;
		Class54.anInt887 = 0;
		Class14_Sub8_Sub26.aBoolean4528 = false;
		Class14_Sub8_Sub25.aBoolean4518 = false;
		Class89.anInt1413 = 0;
		Class28.aBoolean516 = false;
		Class135.anInt2189 = 0;
		Class125_Sub3.aBoolean3397 = false;
		Class14_Sub23.anInt3135 = 255;
		Class14_Sub8_Sub22.method595(257411150, arg0);
	    } else {
		Class14_Sub8_Sub6.anInt4190 = 3;
		Class30 class30 = null;
		Class14_Sub8_Sub3.method495((byte) -47, true);
		Class15.aBoolean374 = true;
		Class100.anInt1691 = 127;
		Class14_Sub8_Sub26.aBoolean4528 = true;
		Class33.aBoolean584 = true;
		Class14_Sub29.anInt3266 = 127;
		Class14_Sub23.anInt3135 = 255;
		Class28.aBoolean516 = true;
		Class139.aBoolean2233 = true;
		Class14_Sub8_Sub20.aBoolean4420 = true;
		Class135.anInt2189 = 0;
		Class52.aBoolean845 = true;
		Class54.anInt887 = 0;
		Class135.aBoolean2190 = true;
		Class125_Sub3.aBoolean3397 = true;
		Class7_Sub1.aBoolean2661 = true;
		Class14_Sub8_Sub25.aBoolean4518 = true;
		Class89.anInt1413 = 2;
		Class14_Sub2.anInt2725 = 0;
		Class148.aBoolean2372 = true;
		try {
		    Class31 class31 = arg0.method1152("runescape", 0);
		    while ((class31.anInt529 ^ 0xffffffff) == -1)
			Class14_Sub13.method864(1L, (byte) 64);
		    if (class31.anInt529 == 1) {
			class30 = (Class30) class31.anObject530;
			int i = 0;
			int i_0_;
			byte[] is;
			for (is = (new byte
				   [(int) class30.method1061((byte) -111)]);
			     (is.length ^ 0xffffffff) < (i ^ 0xffffffff);
			     i += i_0_) {
			    i_0_ = class30.method1060(is, 0, i, is.length - i);
			    if (i_0_ == -1)
				throw new IOException("EOF");
			}
			Class14_Sub8_Sub24.method611(arg2 ^ 0xffffffff,
						     new Class14_Sub10(is));
		    }
		} catch (Exception exception) {
		    /* empty */
		}
		try {
		    if (null != class30)
			class30.method1057(25861);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	    if (arg2 != -2)
		method869((byte) -91);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("l.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public static void method866(boolean arg0) {
    while_588_:
	do {
	while_587_:
	    do {
		do {
		    try {
			anInt2972++;
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_587_;
		    }
		    return;
		} while (false);
		try {
		    if (Class4.aClass36_134 != null)
			Class4.aClass36_134.method1101((byte) 110);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_588_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "l.E(" + arg0 + ')');
	} while (false);
    }
    
    public static void method867(byte arg0, Class124 arg1, int arg2) {
    while_590_:
	do {
	while_589_:
	    do {
		do {
		    try {
			Class55.aClass14_Sub10_Sub1_891.method843(0, 111);
			Class7_Sub2_Sub1.anInt3700++;
			Class55.aClass14_Sub10_Sub1_891.method809(false, arg2);
			anInt2977++;
			if (arg0 >= 81)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_589_;
		    }
		    return;
		} while (false);
		try {
		    Class55.aClass14_Sub10_Sub1_891
			.method835(arg1.method1692(0), true);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_590_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("l.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static void method868(int arg0) {
	try {
	    anInt2978++;
	    int i = (Class133_Sub6.anInt3676
		     + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
			>> -418618297));
	    Class14_Sub8_Sub39.anInt4754 = 0;
	    int i_1_ = -6 % ((-28 - arg0) / 50);
	    int i_2_ = (Class58.anInt947
			+ (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
			   >> 2065190215));
	    if (i >= 3053 && i <= 3156 && (i_2_ ^ 0xffffffff) <= -3057
		&& 3136 >= i_2_)
		Class14_Sub8_Sub39.anInt4754 = 1;
	    if ((i ^ 0xffffffff) <= -3073 && (i ^ 0xffffffff) >= -3119
		&& i_2_ >= 9492 && (i_2_ ^ 0xffffffff) >= -9536)
		Class14_Sub8_Sub39.anInt4754 = 1;
	    if (1 == Class14_Sub8_Sub39.anInt4754 && (i ^ 0xffffffff) <= -3140
		&& i <= 3199 && 3008 <= i_2_ && (i_2_ ^ 0xffffffff) >= -3063)
		Class14_Sub8_Sub39.anInt4754 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "l.A(" + arg0 + ')');
	}
    }
    
    public static void method869(byte arg0) {
	try {
	    int i = 47 / ((-11 - arg0) / 46);
	    anIntArray2985 = null;
	    aCRC32_2983 = null;
	    aClass52_2982 = null;
	    aFrame2986 = null;
	    aClass14_Sub29ArrayArrayArray2987 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "l.F(" + arg0 + ')');
	}
    }
    
    public static void method870(int arg0, Class124 arg1) {
    while_592_:
	do {
	while_591_:
	    do {
		do {
		    try {
			anInt2974++;
			Class14_Sub9_Sub1.aClass124_4829 = arg1;
			if (null
			    != Class14_Sub8_Sub34.aClass43_4647.anApplet712)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_591_;
		    }
		    return;
		} while (false);
		try {
		    try {
			Class124 class124
			    = (Class14_Sub2_Sub11.aClass124_3892.method1703
			       (Class14_Sub8_Sub34.aClass43_4647.anApplet712,
				(byte) -106));
			Class124 class124_3_
			    = (Class14_Sub15.aClass124_2995.method1703
			       (Class14_Sub8_Sub34.aClass43_4647.anApplet712,
				(byte) -33));
			Class124 class124_4_
			    = (Class14_Sub8_Sub7.method515
			       ((new Class124[]
				 { class124, Class14_Sub9_Sub1.aClass124_4814,
				   arg1, Class133_Sub1.aClass124_3502,
				   class124_3_ }),
				(byte) -120));
			if (0 == arg1.method1693(arg0 + -6346))
			    class124_4_
				= (Class14_Sub8_Sub7.method515
				   (new Class124[] { class124_4_,
						     Class98.aClass124_1661 },
				    (byte) -122));
			else
			    class124_4_
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { class124_4_,
				       Class14_Sub8_Sub11.aClass124_4272,
				       (Class14_Sub8_Sub8.method517
					((byte) 124,
					 (94608000000L
					  + Class84.method1413((byte) -127)))),
				       Class118.aClass124_1989,
				       Class14_Sub2_Sub18_Sub2
					   .method387(94608000L, true) }),
				    (byte) -109));
			Class14_Sub8_Sub7.method515
			    (new Class124[] { Class41.aClass124_691,
					      class124_4_,
					      Class14_Sub2.aClass124_2730 },
			     (byte) -34)
			    .method1669
			    (27664,
			     Class14_Sub8_Sub34.aClass43_4647.anApplet712);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		    if (arg0 != 6346)
			aFrame2986 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_592_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("l.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class14_Sub14() {
	anInt2975 = -1;
    }
}
