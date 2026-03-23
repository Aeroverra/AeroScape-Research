/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Graphics;

public abstract class Class108
{
    public static Class124 aClass124_1814;
    public static Class124 aClass124_1815;
    public static int anInt1816;
    public static Class9 aClass9_1817;
    public static int anInt1818;
    public static boolean[] aBooleanArray1819;
    public static int anInt1820;
    public static Class124 aClass124_1821;
    public static Class124 aClass124_1822
	= Class14_Sub2_Sub2.method263(1178, "Loaded sprites");
    public static Class124 aClass124_1823;
    public static int anInt1824 = -1;
    public static Class124 aClass124_1825;
    public static Class124 aClass124_1826;
    public static int anInt1827;
    public static Class124 aClass124_1828;
    
    public static void method1556(boolean arg0) {
	try {
	    aClass124_1822 = null;
	    aClass9_1817 = null;
	    aClass124_1821 = null;
	    aClass124_1814 = null;
	    aClass124_1823 = null;
	    aClass124_1815 = null;
	    if (arg0)
		aClass124_1826 = null;
	    aClass124_1825 = null;
	    aBooleanArray1819 = null;
	    aClass124_1828 = null;
	    aClass124_1826 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qi.G(" + arg0 + ')');
	}
    }
    
    public static void method1557(byte arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	try {
	    if (arg3 == arg6 && (arg1 ^ 0xffffffff) == (arg4 ^ 0xffffffff)
		&& arg8 == arg7 && arg5 == arg9)
		Class99_Sub2.method1510(arg9, arg2, (byte) -46, arg8, arg6,
					arg1);
	    else {
		int i = arg6;
		int i_0_ = arg1;
		int i_1_ = arg3 * 3;
		int i_2_ = 3 * arg1;
		int i_3_ = 3 * arg6;
		int i_4_ = 3 * arg4;
		int i_5_ = arg5 * 3;
		int i_6_ = 3 * arg7;
		int i_7_ = i_3_ + i_6_ - (i_1_ + i_1_);
		int i_8_ = i_1_ + -i_6_ + arg8 - arg6;
		int i_9_ = i_2_ + i_5_ + (-i_4_ + -i_4_);
		int i_10_ = -i_3_ + i_1_;
		int i_11_ = -arg1 + -i_5_ + arg9 - -i_4_;
		int i_12_ = -i_2_ + i_4_;
		for (int i_13_ = 128; 4096 >= i_13_; i_13_ += 128) {
		    int i_14_ = i_13_ * i_13_ >> 1314257580;
		    int i_15_ = i_14_ * i_13_ >> 1579237324;
		    int i_16_ = i_8_ * i_15_;
		    int i_17_ = i_15_ * i_11_;
		    int i_18_ = i_7_ * i_14_;
		    int i_19_ = i_12_ * i_13_;
		    int i_20_ = i_14_ * i_9_;
		    int i_21_ = i_10_ * i_13_;
		    int i_22_ = arg6 - -(i_18_ + i_16_ - -i_21_ >> 2134004748);
		    int i_23_
			= arg1 - -(i_17_ - (-i_20_ - i_19_) >> -1501999668);
		    Class99_Sub2.method1510(i_23_, arg2, (byte) 65, i_22_, i,
					    i_0_);
		    i = i_22_;
		    i_0_ = i_23_;
		}
	    }
	    int i = 102 % ((-20 - arg0) / 33);
	    anInt1820++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qi.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ')'));
	}
    }
    
    public abstract void method1558(int i, byte i_24_, Graphics graphics,
				    int i_25_);
    
    public static void method1559(byte arg0) {
    while_1048_:
	do {
	while_1047_:
	    do {
		do {
		    try {
			Class14_Sub2_Sub19.aClass55_4048.method1234(0);
			Class14_Sub8.aClass81_2844.method1395((byte) 127);
			anInt1818++;
			if (arg0 == -100)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1047_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub27.aClass81_4546.method1395((byte) 122);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1048_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "qi.D(" + arg0 + ')');
	} while (false);
    }
    
    public abstract void method1560(int i, byte i_26_, int i_27_, int i_28_,
				    Graphics graphics, int i_29_);
    
    public static void method1561(Class9 arg0, byte arg1, Class9 arg2) {
    while_1050_:
	do {
	while_1049_:
	    do {
		do {
		    try {
			if (arg1 >= 22)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1049_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub15.aClass9_4338 = arg0;
		    anInt1827++;
		    Class14_Sub1.aClass9_2711 = arg2;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1050_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("qi.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method1562(int[] arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg3][arg4]
	       [arg5]);
	if (class14_sub29 != null) {
	    Class153 class153 = class14_sub29.aClass153_3248;
	    if (class153 != null) {
		int i = class153.anInt2441;
		if (i != 0) {
		    for (int i_30_ = 0; i_30_ < 4; i_30_++) {
			arg0[arg1] = i;
			arg0[arg1 + 1] = i;
			arg0[arg1 + 2] = i;
			arg0[arg1 + 3] = i;
			arg1 += arg2;
		    }
		}
	    } else {
		Class6 class6 = class14_sub29.aClass6_3233;
		if (class6 != null) {
		    int i = class6.anInt152;
		    int i_31_ = class6.anInt151;
		    int i_32_ = class6.anInt154;
		    int i_33_ = class6.anInt156;
		    int[] is = Class14_Sub8_Sub18.anIntArrayArray4388[i];
		    int[] is_34_ = Class9.anIntArrayArray190[i_31_];
		    int i_35_ = 0;
		    if (i_32_ != 0) {
			for (int i_36_ = 0; i_36_ < 4; i_36_++) {
			    arg0[arg1]
				= is[is_34_[i_35_++]] == 0 ? i_32_ : i_33_;
			    arg0[arg1 + 1]
				= is[is_34_[i_35_++]] == 0 ? i_32_ : i_33_;
			    arg0[arg1 + 2]
				= is[is_34_[i_35_++]] == 0 ? i_32_ : i_33_;
			    arg0[arg1 + 3]
				= is[is_34_[i_35_++]] == 0 ? i_32_ : i_33_;
			    arg1 += arg2;
			}
		    } else {
			for (int i_37_ = 0; i_37_ < 4; i_37_++) {
			    if (is[is_34_[i_35_++]] != 0)
				arg0[arg1] = i_33_;
			    if (is[is_34_[i_35_++]] != 0)
				arg0[arg1 + 1] = i_33_;
			    if (is[is_34_[i_35_++]] != 0)
				arg0[arg1 + 2] = i_33_;
			    if (is[is_34_[i_35_++]] != 0)
				arg0[arg1 + 3] = i_33_;
			    arg1 += arg2;
			}
		    }
		}
	    }
	}
    }
    
    static {
	aClass124_1814 = aClass124_1822;
	aClass124_1823 = Class14_Sub2_Sub2.method263(1178, "wave2:");
	aClass124_1821 = aClass124_1823;
	aClass124_1815 = aClass124_1823;
	aClass124_1826 = Class14_Sub2_Sub2.method263(1178, "FULL");
	aClass124_1825 = aClass124_1826;
	aClass124_1828
	    = Class14_Sub2_Sub2.method263(1178, "Spielwelt erstellt)3");
    }
}
