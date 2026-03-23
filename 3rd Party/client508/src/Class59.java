/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class59
{
    public static int anInt951;
    public static int anInt952;
    public static Class124 aClass124_953;
    public static boolean aBoolean954 = false;
    public static int anInt955;
    public static Class124 aClass124_956;
    public static Class9 aClass9_957;
    public static Class124 aClass124_958;
    public static int anInt959;
    public static int anInt960;
    
    public static boolean method1260
	(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    while_851_:
	do {
	    int i;
	    int i_0_;
	while_850_:
	    do {
		do {
		    boolean bool;
		    try {
			anInt951++;
			for (i_0_ = 0; 104 > i_0_; i_0_++) {
			    for (i = 0; (i ^ 0xffffffff) > -105; i++) {
				Class33.anIntArrayArray575[i_0_][i] = 0;
				Class137.anIntArrayArray2203[i_0_][i]
				    = 99999999;
			    }
			}
			i = arg11;
			i_0_ = arg9;
			Class33.anIntArrayArray575[arg9][arg11] = 99;
			Class137.anIntArrayArray2203[arg9][arg11] = 0;
			int i_1_ = 0;
			int i_2_ = 0;
			boolean bool_3_ = false;
			Class14_Sub8_Sub36.anIntArray4691[i_2_] = arg9;
			Class14_Sub2_Sub21.anIntArray4078[i_2_++] = arg11;
			int[][] is = (Class14_Sub21.aClass32Array3100
				      [Class14_Sub2_Sub3.anInt3785]
				      .anIntArrayArray546);
			while ((i_1_ ^ 0xffffffff) != (i_2_ ^ 0xffffffff)) {
			    i = Class14_Sub2_Sub21.anIntArray4078[i_1_];
			    i_0_ = Class14_Sub8_Sub36.anIntArray4691[i_1_];
			    i_1_ = 0xfff & i_1_ + 1;
			    if ((arg8 ^ 0xffffffff) == (i_0_ ^ 0xffffffff)
				&& i == arg5) {
				bool_3_ = true;
				break;
			    }
			    if ((arg1 ^ 0xffffffff) != -1) {
				if (arg1 >= 5 && (arg1 ^ 0xffffffff) != -11
				    || !(Class14_Sub21.aClass32Array3100
					     [Class14_Sub2_Sub3.anInt3785]
					     .method1076
					 (arg3, 1, -1 + arg1, arg5, arg8, i_0_,
					  i, arg6 + 18288))) {
				    if ((arg1 ^ 0xffffffff) > -11
					&& (Class14_Sub21.aClass32Array3100
						[Class14_Sub2_Sub3.anInt3785]
						.method1066
					    (1, arg1 - 1, i_0_, arg5, i,
					     (byte) -39, arg3, arg8))) {
					bool_3_ = true;
					break;
				    }
				} else {
				    bool_3_ = true;
				    break;
				}
			    }
			    if (0 != arg2 && (arg4 ^ 0xffffffff) != -1
				&& (Class14_Sub21.aClass32Array3100
					[Class14_Sub2_Sub3.anInt3785]
					.method1078
				    (i, arg4, i_0_, arg7, (byte) -63, arg8,
				     arg5, 1, arg2))) {
				bool_3_ = true;
				break;
			    }
			    int i_4_
				= 1 + Class137.anIntArrayArray2203[i_0_][i];
			    if (0 < i_0_
				&& (Class33.anIntArrayArray575[-1 + i_0_][i]
				    == 0)
				&& ((0x12c0108 & is[i_0_ + -1][i] ^ 0xffffffff)
				    == -1)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = i_0_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_2_] = i;
				Class33.anIntArrayArray575[i_0_ + -1][i] = 2;
				i_2_ = i_2_ - -1 & 0xfff;
				Class137.anIntArrayArray2203[i_0_ + -1][i]
				    = i_4_;
			    }
			    if (103 > i_0_
				&& 0 == Class33.anIntArrayArray575[1 + i_0_][i]
				&& (is[1 + i_0_][i] & 0x12c0180) == 0) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = 1 + i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_] = i;
				Class33.anIntArrayArray575[i_0_ + 1][i] = 8;
				Class137.anIntArrayArray2203[1 + i_0_][i]
				    = i_4_;
				i_2_ = 0xfff & i_2_ + 1;
			    }
			    if (-1 > (i ^ 0xffffffff)
				&& (Class33.anIntArrayArray575[i_0_][-1 + i]
				    ^ 0xffffffff) == -1
				&& -1 == (0x12c0102 & is[i_0_][i + -1]
					  ^ 0xffffffff)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_] = i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = -1 + i;
				Class33.anIntArrayArray575[i_0_][-1 + i] = 1;
				i_2_ = 0xfff & 1 + i_2_;
				Class137.anIntArrayArray2203[i_0_][i - 1]
				    = i_4_;
			    }
			    if (103 > i
				&& (-1
				    == (Class33.anIntArrayArray575[i_0_][i + 1]
					^ 0xffffffff))
				&& -1 == (0x12c0120 & is[i_0_][1 + i]
					  ^ 0xffffffff)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_] = i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = i + 1;
				i_2_ = 0xfff & 1 + i_2_;
				Class33.anIntArrayArray575[i_0_][1 + i] = 4;
				Class137.anIntArrayArray2203[i_0_][i + 1]
				    = i_4_;
			    }
			    if (0 < i_0_ && i > 0
				&& 0 == (Class33.anIntArrayArray575[i_0_ - 1]
					 [-1 + i])
				&& (0x12c010e & is[i_0_ - 1][i + -1]
				    ^ 0xffffffff) == -1
				&& ((0x12c0108 & is[i_0_ - 1][i] ^ 0xffffffff)
				    == -1)
				&& (0x12c0102 & is[i_0_][i - 1]) == 0) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = -1 + i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = -1 + i;
				Class33.anIntArrayArray575[i_0_ + -1][-1 + i]
				    = 3;
				i_2_ = 0xfff & i_2_ + 1;
				Class137.anIntArrayArray2203[-1 + i_0_][i + -1]
				    = i_4_;
			    }
			    if ((i_0_ ^ 0xffffffff) > -104
				&& -1 > (i ^ 0xffffffff)
				&& -1 == ((Class33.anIntArrayArray575[1 + i_0_]
					   [-1 + i])
					  ^ 0xffffffff)
				&& -1 == (is[i_0_ - -1][i + -1] & 0x12c0183
					  ^ 0xffffffff)
				&& ((is[1 + i_0_][i] & 0x12c0180 ^ 0xffffffff)
				    == -1)
				&& -1 == (0x12c0102 & is[i_0_][i - 1]
					  ^ 0xffffffff)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = 1 + i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = i - 1;
				Class33.anIntArrayArray575[i_0_ - -1][i + -1]
				    = 9;
				i_2_ = 0xfff & 1 + i_2_;
				Class137.anIntArrayArray2203[1 + i_0_][i + -1]
				    = i_4_;
			    }
			    if (i_0_ > 0 && -104 < (i ^ 0xffffffff)
				&& ((Class33.anIntArrayArray575[i_0_ - 1]
				     [i - -1])
				    ^ 0xffffffff) == -1
				&& (is[i_0_ + -1][1 + i] & 0x12c0138) == 0
				&& 0 == (0x12c0108 & is[i_0_ + -1][i])
				&& ((is[i_0_][1 + i] & 0x12c0120 ^ 0xffffffff)
				    == -1)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = i_0_ + -1;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = 1 + i;
				i_2_ = 1 + i_2_ & 0xfff;
				Class33.anIntArrayArray575[-1 + i_0_][1 + i]
				    = 6;
				Class137.anIntArrayArray2203[i_0_ - 1][1 + i]
				    = i_4_;
			    }
			    if ((i_0_ ^ 0xffffffff) > -104
				&& (i ^ 0xffffffff) > -104
				&& (Class33.anIntArrayArray575[1 + i_0_][i + 1]
				    == 0)
				&& (is[1 + i_0_][i + 1] & 0x12c01e0) == 0
				&& -1 == (is[i_0_ + 1][i] & 0x12c0180
					  ^ 0xffffffff)
				&& ((0x12c0120 & is[i_0_][i + 1] ^ 0xffffffff)
				    == -1)) {
				Class14_Sub8_Sub36.anIntArray4691[i_2_]
				    = 1 + i_0_;
				Class14_Sub2_Sub21.anIntArray4078[i_2_]
				    = i + 1;
				Class33.anIntArrayArray575[1 + i_0_][1 + i]
				    = 12;
				Class137.anIntArrayArray2203[1 + i_0_][1 + i]
				    = i_4_;
				i_2_ = i_2_ - -1 & 0xfff;
			    }
			}
			Class14_Sub10.anInt2911 = arg6;
			if (bool_3_)
			    break while_850_;
			if (arg0)
			    break;
			bool = false;
		    } catch (RuntimeException runtimeexception) {
			break while_851_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			int i_5_ = 1000;
			int i_6_ = 100;
			int i_7_ = 10;
			for (int i_8_ = arg8 + -i_7_; arg8 + i_7_ >= i_8_;
			     i_8_++) {
			    for (int i_9_ = -i_7_ + arg5; arg5 + i_7_ >= i_9_;
				 i_9_++) {
				if ((i_8_ ^ 0xffffffff) <= -1 && i_9_ >= 0
				    && -105 < (i_8_ ^ 0xffffffff) && i_9_ < 104
				    && 100 > (Class137.anIntArrayArray2203
					      [i_8_][i_9_])) {
				    int i_10_ = 0;
				    if (i_8_ >= arg8) {
					if (arg8 + (arg2 - 1) < i_8_)
					    i_10_
						= i_8_ - (-1 + (arg8 + arg2));
				    } else
					i_10_ = arg8 - i_8_;
				    int i_11_ = 0;
				    if ((i_9_ ^ 0xffffffff)
					> (arg5 ^ 0xffffffff))
					i_11_ = -i_9_ + arg5;
				    else if ((i_9_ ^ 0xffffffff)
					     < (arg5 + (arg4 + -1)
						^ 0xffffffff))
					i_11_ = -arg5 - arg4 - -1 + i_9_;
				    int i_12_ = i_10_ * i_10_ + i_11_ * i_11_;
				    if (i_12_ < i_5_
					|| (((i_5_ ^ 0xffffffff)
					     == (i_12_ ^ 0xffffffff))
					    && (Class137.anIntArrayArray2203
						[i_8_][i_9_]) < i_6_)) {
					i_5_ = i_12_;
					i = i_9_;
					i_6_ = (Class137.anIntArrayArray2203
						[i_8_][i_9_]);
					i_0_ = i_8_;
				    }
				}
			    }
			}
			if (1000 != i_5_)
			    break;
			bool = false;
		    } catch (RuntimeException runtimeexception) {
			break while_851_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if (i_0_ != arg9 || i != arg11)
			    break;
			bool = false;
		    } catch (RuntimeException runtimeexception) {
			break while_851_;
		    }
		    return bool;
		} while (false);
		try {
		    Class14_Sub10.anInt2911 = 1;
		} catch (RuntimeException runtimeexception) {
		    break while_851_;
		}
	    } while (false);
	    int i_13_ = 0;
	    Class14_Sub8_Sub36.anIntArray4691[i_13_] = i_0_;
	    Class14_Sub2_Sub21.anIntArray4078[i_13_++] = i;
	    int i_15_;
	    int i_14_ = i_15_ = Class33.anIntArrayArray575[i_0_][i];
	    while (i_0_ != arg9 || (i ^ 0xffffffff) != (arg11 ^ 0xffffffff)) {
		if ((i_15_ ^ 0xffffffff) != (i_14_ ^ 0xffffffff)) {
		    Class14_Sub8_Sub36.anIntArray4691[i_13_] = i_0_;
		    i_15_ = i_14_;
		    Class14_Sub2_Sub21.anIntArray4078[i_13_++] = i;
		}
		if (-1 != (0x1 & i_14_ ^ 0xffffffff))
		    i++;
		else if ((0x4 & i_14_) != 0)
		    i--;
		if ((0x2 & i_14_) != 0)
		    i_0_++;
		else if ((0x8 & i_14_) != 0)
		    i_0_--;
		i_14_ = Class33.anIntArrayArray575[i_0_][i];
	    }
	    if (0 < i_13_) {
		Class133.method1782(-20179, i_13_, arg10);
		return true;
	    }
	    do {
		boolean bool;
		try {
		    if (arg10 != 1)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_851_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("he.D(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ',' + arg9
					    + ',' + arg10 + ',' + arg11
					    + ')'));
    }
    
    public static void method1261(byte arg0) {
    while_853_:
	do {
	while_852_:
	    do {
		do {
		    try {
			if (arg0 == 16)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_852_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_958 = null;
		    aClass9_957 = null;
		    aClass124_953 = null;
		    aClass124_956 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_853_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "he.B(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1262(boolean arg0) {
    while_855_:
	do {
	while_854_:
	    do {
		do {
		    try {
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .method845(arg0);
			anInt960++;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method842(0, 1);
			if (i != 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_854_;
		    }
		    return;
		} while (false);
		int i;
		do {
		    try {
			i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method842(0, 2);
			if (i != 0)
			    break;
			Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++]
			    = 2047;
		    } catch (RuntimeException runtimeexception) {
			break while_854_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (i != 1)
			    break;
			int i_16_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 3);
			Class14_Sub3.aClass133_Sub1_Sub1_2748
			    .method1799(false, (byte) 127, i_16_);
			int i_17_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 1);
			if ((i_17_ ^ 0xffffffff) == -2)
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= 2047;
		    } catch (RuntimeException runtimeexception) {
			break while_854_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-3 != (i ^ 0xffffffff))
			    break;
			int i_18_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 3);
			Class14_Sub3.aClass133_Sub1_Sub1_2748
			    .method1799(true, (byte) 100, i_18_);
			int i_19_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 3);
			Class14_Sub3.aClass133_Sub1_Sub1_2748
			    .method1799(true, (byte) 123, i_19_);
			int i_20_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 1);
			if (-2 == (i_20_ ^ 0xffffffff))
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= 2047;
		    } catch (RuntimeException runtimeexception) {
			break while_854_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-4 != (i ^ 0xffffffff))
			    break;
			int i_21_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 7);
			int i_22_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 1);
			Class14_Sub2_Sub3.anInt3785
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method842(0, 2);
			int i_23_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 1);
			if (1 == i_23_)
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= 2047;
			int i_24_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 7);
			Class14_Sub3.aClass133_Sub1_Sub1_2748
			    .method1800((byte) -87, i_24_, 1 == i_22_, i_21_);
		    } catch (RuntimeException runtimeexception) {
			break while_854_;
		    }
		    break;
		} while (false);
		break while_855_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "he.C(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1263(byte arg0) {
    while_857_:
	do {
	while_856_:
	    do {
		do {
		    try {
			anInt952++;
			if (arg0 != -66)
			    method1261((byte) -34);
			if (5 == Class142.anInt2315)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_856_;
		    }
		    return;
		} while (false);
		try {
		    Class142.anInt2315 = 6;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_857_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "he.A(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass124_953 = Class14_Sub2_Sub2.method263(1178, "k");
	aClass124_956 = Class14_Sub2_Sub2.method263(1178, "M");
	aClass124_958
	    = Class14_Sub2_Sub2.method263(1178, "slr2)3ws?order=LPWM");
	anInt959 = 1;
	anInt955 = 100;
    }
}
