/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class53
{
    public static boolean aBoolean865 = true;
    public static short[] aShortArray866;
    public static Class124 aClass124_867
	= Class14_Sub2_Sub2.method263(1178, ")1");
    public static Class124 aClass124_868;
    public static Class124 aClass124_869;
    public static long aLong870;
    public static int anInt871;
    public static int anInt872;
    public static boolean[][] aBooleanArrayArray873;
    public static int anInt874 = 0;
    public static int anInt875;
    public static int anInt876;
    
    public static void method1212(int arg0) {
	try {
	    aClass124_867 = null;
	    aClass124_869 = null;
	    aBooleanArrayArray873 = null;
	    if (arg0 != -1)
		method1215(-92, 50);
	    aClass124_868 = null;
	    aShortArray866 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gj.A(" + arg0 + ')');
	}
    }
    
    public static void method1213(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, byte arg6, int arg7) {
    while_824_:
	do {
	while_823_:
	    do {
		do {
		    try {
			anInt875++;
			if (arg6 != 126)
			    aClass124_867 = null;
			if (arg2 >= 128 && -129 >= (arg7 ^ 0xffffffff)
			    && (arg2 ^ 0xffffffff) >= -13057 && arg7 <= 13056)
			    break;
			Class120.anInt2007 = -1;
			Class14_Sub8_Sub27.anInt4548 = -1;
		    } catch (RuntimeException runtimeexception) {
			break while_823_;
		    }
		    return;
		} while (false);
		try {
		    int i = (-arg5
			     + Class26.method1017(arg2,
						  Class14_Sub2_Sub3.anInt3785,
						  (byte) -8, arg7));
		    arg2 -= Class14_Sub8_Sub38.anInt4741;
		    arg7 -= Class14_Sub30.anInt3271;
		    int i_0_
			= Class3.anIntArray108[Class7_Sub3_Sub1.anInt3719];
		    int i_1_
			= Class3.anIntArray111[Class7_Sub3_Sub1.anInt3719];
		    int i_2_ = Class3.anIntArray108[Class69.anInt1072];
		    int i_3_ = Class3.anIntArray111[Class69.anInt1072];
		    i -= Class14_Sub10.anInt2926;
		    int i_4_ = arg7 * i_2_ - -(i_3_ * arg2) >> 605819568;
		    arg7 = -(i_2_ * arg2) + arg7 * i_3_ >> -1360284528;
		    arg2 = i_4_;
		    i_4_ = -(i_0_ * arg7) + i_1_ * i >> -475383824;
		    arg7 = i_0_ * i - -(arg7 * i_1_) >> 1043956112;
		    i = i_4_;
		    if (-51 >= (arg7 ^ 0xffffffff)) {
			int i_5_ = arg1 * 512 >> -647826264;
			int i_6_ = arg0 * 512 >> -647597496;
			Class120.anInt2007 = i_5_ * arg2 / arg7 + arg4;
			Class14_Sub8_Sub27.anInt4548 = i * i_6_ / arg7 + arg3;
		    } else {
			Class120.anInt2007 = -1;
			Class14_Sub8_Sub27.anInt4548 = -1;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_824_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("gj.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	} while (false);
    }
    
    public static Class125_Sub1 method1214(Class14_Sub10 arg0, byte arg1) {
	Class125_Sub1 class125_sub1;
	try {
	    if (arg1 >= -83)
		method1212(40);
	    anInt871++;
	    class125_sub1
		= new Class125_Sub1(arg0.method805(0), arg0.method805(0),
				    arg0.method805(0), arg0.method805(0),
				    arg0.method829(115), arg0.method829(100),
				    arg0.method798(-115));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gj.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class125_sub1;
    }
    
    public static void method1215(int arg0, int arg1) {
	try {
	    Class148.aClass52_2370.method1208((byte) -112, arg1);
	    if (arg0 != -23980)
		method1216(49);
	    anInt872++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gj.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1216(int arg0) {
	try {
	    anInt876++;
	    int i = 64 + Class123.anInt2062 * arg0;
	    int i_7_ = 64 + 128 * Class14_Sub8_Sub38.anInt4731;
	    int i_8_ = (Class26.method1017(i, Class14_Sub2_Sub3.anInt3785,
					   (byte) -121, i_7_)
			- Class14_Sub8_Sub23.anInt4480);
	    if ((Class69.anInt1071 ^ 0xffffffff) > -101) {
		if ((i_8_ ^ 0xffffffff)
		    < (Class14_Sub10.anInt2926 ^ 0xffffffff)) {
		    Class14_Sub10.anInt2926
			+= ((Class69.anInt1071
			     * (-Class14_Sub10.anInt2926 + i_8_) / 1000)
			    + Class14_Sub20.anInt3095);
		    if (Class14_Sub10.anInt2926 > i_8_)
			Class14_Sub10.anInt2926 = i_8_;
		}
		if ((i ^ 0xffffffff)
		    < (Class14_Sub8_Sub38.anInt4741 ^ 0xffffffff)) {
		    Class14_Sub8_Sub38.anInt4741
			+= ((Class69.anInt1071
			     * (-Class14_Sub8_Sub38.anInt4741 + i) / 1000)
			    + Class14_Sub20.anInt3095);
		    if (Class14_Sub8_Sub38.anInt4741 > i)
			Class14_Sub8_Sub38.anInt4741 = i;
		}
		if (Class14_Sub10.anInt2926 > i_8_) {
		    Class14_Sub10.anInt2926
			-= (Class14_Sub20.anInt3095
			    - -((Class14_Sub10.anInt2926 + -i_8_)
				* Class69.anInt1071 / 1000));
		    if (i_8_ > Class14_Sub10.anInt2926)
			Class14_Sub10.anInt2926 = i_8_;
		}
		if ((i_7_ ^ 0xffffffff)
		    < (Class14_Sub30.anInt3271 ^ 0xffffffff)) {
		    Class14_Sub30.anInt3271
			+= (Class14_Sub20.anInt3095
			    + ((-Class14_Sub30.anInt3271 + i_7_)
			       * Class69.anInt1071 / 1000));
		    if ((Class14_Sub30.anInt3271 ^ 0xffffffff)
			< (i_7_ ^ 0xffffffff))
			Class14_Sub30.anInt3271 = i_7_;
		}
		if ((Class14_Sub30.anInt3271 ^ 0xffffffff)
		    < (i_7_ ^ 0xffffffff)) {
		    Class14_Sub30.anInt3271
			-= (Class14_Sub20.anInt3095
			    - -(Class69.anInt1071
				* (-i_7_ + Class14_Sub30.anInt3271) / 1000));
		    if ((i_7_ ^ 0xffffffff)
			< (Class14_Sub30.anInt3271 ^ 0xffffffff))
			Class14_Sub30.anInt3271 = i_7_;
		}
		if (i < Class14_Sub8_Sub38.anInt4741) {
		    Class14_Sub8_Sub38.anInt4741
			-= (Class14_Sub20.anInt3095
			    + (Class69.anInt1071
			       * (-i + Class14_Sub8_Sub38.anInt4741) / 1000));
		    if (Class14_Sub8_Sub38.anInt4741 < i)
			Class14_Sub8_Sub38.anInt4741 = i;
		}
	    } else {
		Class14_Sub30.anInt3271
		    = 64 + 128 * Class14_Sub8_Sub38.anInt4731;
		Class14_Sub8_Sub38.anInt4741 = 64 + Class123.anInt2062 * 128;
		Class14_Sub10.anInt2926
		    = (Class26.method1017(Class14_Sub8_Sub38.anInt4741,
					  Class14_Sub2_Sub3.anInt3785,
					  (byte) -123, Class14_Sub30.anInt3271)
		       + -Class14_Sub8_Sub23.anInt4480);
	    }
	    i_7_ = 128 * Class33.anInt577 + 64;
	    i = 64 + 128 * Class117.anInt1948;
	    i_8_ = (Class26.method1017(i, Class14_Sub2_Sub3.anInt3785,
				       (byte) -117, i_7_)
		    - Class14_Sub2_Sub9.anInt3866);
	    int i_9_ = -Class14_Sub30.anInt3271 + i_7_;
	    int i_10_ = i + -Class14_Sub8_Sub38.anInt4741;
	    int i_11_ = i_8_ - Class14_Sub10.anInt2926;
	    int i_12_
		= (int) Math.sqrt((double) (i_9_ * i_9_ + i_10_ * i_10_));
	    int i_13_
		= ((int) (Math.atan2((double) i_11_, (double) i_12_) * 325.949)
		   & 0x7ff);
	    int i_14_
		= ((int) (-325.949 * Math.atan2((double) i_10_, (double) i_9_))
		   & 0x7ff);
	    int i_15_ = i_14_ - Class69.anInt1072;
	    if ((i_15_ ^ 0xffffffff) < -1025)
		i_15_ -= 2048;
	    if (128 > i_13_)
		i_13_ = 128;
	    if (1023 < (i_15_ ^ 0xffffffff))
		i_15_ += 2048;
	    if (i_13_ > 383)
		i_13_ = 383;
	    if (i_13_ > Class7_Sub3_Sub1.anInt3719) {
		Class7_Sub3_Sub1.anInt3719
		    += ((-Class7_Sub3_Sub1.anInt3719 + i_13_) * Class7.anInt177
			/ 1000) + Class14_Sub29.anInt3267;
		if ((Class7_Sub3_Sub1.anInt3719 ^ 0xffffffff)
		    < (i_13_ ^ 0xffffffff))
		    Class7_Sub3_Sub1.anInt3719 = i_13_;
	    }
	    if (Class7_Sub3_Sub1.anInt3719 > i_13_) {
		Class7_Sub3_Sub1.anInt3719
		    -= (Class7.anInt177 * (-i_13_ + Class7_Sub3_Sub1.anInt3719)
			/ 1000) + Class14_Sub29.anInt3267;
		if ((i_13_ ^ 0xffffffff)
		    < (Class7_Sub3_Sub1.anInt3719 ^ 0xffffffff))
		    Class7_Sub3_Sub1.anInt3719 = i_13_;
	    }
	    if (-1 > (i_15_ ^ 0xffffffff)) {
		Class69.anInt1072 += (i_15_ * Class7.anInt177 / 1000
				      + Class14_Sub29.anInt3267);
		Class69.anInt1072 &= 0x7ff;
	    }
	    if (i_15_ < 0) {
		Class69.anInt1072 -= (-i_15_ * Class7.anInt177 / 1000
				      + Class14_Sub29.anInt3267);
		Class69.anInt1072 &= 0x7ff;
	    }
	    int i_16_ = i_14_ + -Class69.anInt1072;
	    if (-1025 > (i_16_ ^ 0xffffffff))
		i_16_ -= 2048;
	    if (i_16_ < -1024)
		i_16_ += 2048;
	    if (i_16_ < 0 && (i_15_ ^ 0xffffffff) < -1
		|| 0 < i_16_ && 0 > i_15_)
		Class69.anInt1072 = i_14_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gj.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_868 = (Class14_Sub2_Sub2.method263
			 (1178, "RuneScape is loading )2 please wait)3)3)3"));
	aClass124_869 = aClass124_868;
    }
}
