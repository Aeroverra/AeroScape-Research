/* Class14_Sub8_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub7 extends Class14_Sub8
{
    public static Class109[] aClass109Array4195;
    public static Class124 aClass124_4196
	= Class14_Sub2_Sub2.method263(1178, "Select a world");
    public static int anInt4197;
    public int anInt4198;
    public static int anInt4199;
    public static int anInt4200;
    public static Class124 aClass124_4201
	= (Class14_Sub2_Sub2.method263
	   (1178, "You can(Wt add yourself to your own friend list)3"));
    public static Class124 aClass124_4202;
    public static Class124 aClass124_4203 = aClass124_4196;
    public static int anInt4204;
    public static int anInt4205;
    public static int anInt4206;
    public static int anInt4207 = -1;
    public static int anInt4208;
    public static int anInt4209;
    public static int anInt4210;
    public static int anInt4211;
    public int anInt4212;
    public int anInt4213;
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt4199++;
	    if (arg1 > -4)
		method474(8, 111);
	    int[][] is_0_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628) {
		int[] is_1_ = is_0_[0];
		int[] is_2_ = is_0_[2];
		int[] is_3_ = is_0_[1];
		for (int i = 0;
		     (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i++) {
		    is_1_[i] = anInt4213;
		    is_3_[i] = anInt4212;
		    is_2_[i] = anInt4198;
		}
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fd.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method510(int arg0) {
	try {
	    aClass124_4196 = null;
	    aClass124_4202 = null;
	    if (arg0 >= -82)
		anInt4207 = -49;
	    aClass124_4201 = null;
	    aClass109Array4195 = null;
	    aClass124_4203 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fd.E(" + arg0 + ')');
	}
    }
    
    public static void method511(int arg0) {
    while_331_:
	do {
	while_330_:
	    do {
		do {
		    try {
			anInt4211++;
			if (-1 != Class45.anInt751
			    && Class14_Sub8_Sub35.anInt4687 != -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_330_;
		    }
		    return;
		} while (false);
		try {
		    int i = 2 * Class19.anInt2552;
		    int i_4_
			= (Class14_Sub21.anInt3102
			   + (Class102.anInt1717 * (Class36.anInt612
						    - Class14_Sub21.anInt3102)
			      >> -974132304));
		    float[] fs = new float[arg0];
		    Class102.anInt1717 += i_4_;
		    if (-65536 >= (Class102.anInt1717 ^ 0xffffffff)) {
			if (Class73.aBoolean1119)
			    Class14_Sub8_Sub18.aBoolean4383 = false;
			else
			    Class14_Sub8_Sub18.aBoolean4383 = true;
			Class102.anInt1717 = 65535;
			Class73.aBoolean1119 = true;
		    } else {
			Class73.aBoolean1119 = false;
			Class14_Sub8_Sub18.aBoolean4383 = false;
		    }
		    float f = (float) Class102.anInt1717 / 65535.0F;
		    for (int i_5_ = 0; i_5_ < 3; i_5_++) {
			int i_6_ = ((Class89.anIntArrayArrayArray1405
				     [Class45.anInt751][i][i_5_])
				    * 3);
			int i_7_ = ((Class89.anIntArrayArrayArray1405
				     [Class45.anInt751][1 + i][i_5_])
				    * 3);
			int i_8_ = (Class89.anIntArrayArrayArray1405
				    [Class45.anInt751][i][i_5_]);
			int i_9_ = (((Class89.anIntArrayArrayArray1405
				      [Class45.anInt751][i + 2][i_5_])
				     + (-(Class89.anIntArrayArrayArray1405
					  [Class45.anInt751][i - -3][i_5_])
					+ (Class89.anIntArrayArrayArray1405
					   [Class45.anInt751][i - -2][i_5_])))
				    * 3);
			int i_10_ = i_7_ - i_6_;
			int i_11_ = i_6_ - 2 * i_7_ - -i_9_;
			int i_12_
			    = (-i_9_ + i_7_
			       + (-i_8_ + (Class89.anIntArrayArrayArray1405
					   [Class45.anInt751][i - -2][i_5_])));
			fs[i_5_] = (f * (f * (float) i_12_ + (float) i_11_)
				    + (float) i_10_) * f + (float) i_8_;
		    }
		    if (Class133_Sub6.anInt3676 == 0
			&& -1 == (Class58.anInt947 ^ 0xffffffff)) {
			Class133_Sub6.anInt3676
			    = ((int) fs[0] >> 37823722) * 8 + -48;
			Class58.anInt947
			    = ((int) fs[2] >> -1898031638) * 8 - 48;
		    }
		    Class14_Sub10.anInt2926 = -1 * (int) fs[1];
		    Class14_Sub8_Sub38.anInt4741
			= -(Class133_Sub6.anInt3676 * 128) + (int) fs[0];
		    float[] fs_13_ = new float[3];
		    Class14_Sub30.anInt3271
			= -(Class58.anInt947 * 128) + (int) fs[2];
		    int i_14_ = 2 * Class79.anInt1240;
		    for (int i_15_ = 0; 3 > i_15_; i_15_++) {
			int i_16_ = 3 * (Class89.anIntArrayArrayArray1405
					 [Class14_Sub8_Sub35.anInt4687][i_14_]
					 [i_15_]);
			int i_17_ = ((Class89.anIntArrayArrayArray1405
				      [Class14_Sub8_Sub35.anInt4687][1 + i_14_]
				      [i_15_])
				     * 3);
			int i_18_
			    = (Class89.anIntArrayArrayArray1405
			       [Class14_Sub8_Sub35.anInt4687][i_14_][i_15_]);
			int i_19_ = (((Class89.anIntArrayArrayArray1405
				       [Class14_Sub8_Sub35.anInt4687]
				       [i_14_ - -2][i_15_])
				      + -(Class89.anIntArrayArrayArray1405
					  [Class14_Sub8_Sub35.anInt4687]
					  [3 + i_14_][i_15_])
				      + (Class89.anIntArrayArrayArray1405
					 [Class14_Sub8_Sub35.anInt4687]
					 [i_14_ - -2][i_15_]))
				     * 3);
			int i_20_ = i_19_ + -(i_17_ * 2) + i_16_;
			int i_21_
			    = (i_17_
			       + (-i_18_ + (Class89.anIntArrayArrayArray1405
					    [Class14_Sub8_Sub35.anInt4687]
					    [2 + i_14_][i_15_]))
			       + -i_19_);
			int i_22_ = i_17_ + -i_16_;
			fs_13_[i_15_]
			    = ((float) i_18_
			       + (((float) i_20_ + f * (float) i_21_) * f
				  + (float) i_22_) * f);
		    }
		    float f_23_ = (-fs[1] + fs_13_[1]) * -1.0F;
		    float f_24_ = fs_13_[0] - fs[0];
		    float f_25_ = -fs[2] + fs_13_[2];
		    double d
			= Math.sqrt((double) (f_24_ * f_24_ + f_25_ * f_25_));
		    Class14_Sub17.aFloat3023
			= (float) Math.atan2((double) f_23_, d);
		    Class56_Sub1.aFloat3323
			= -(float) Math.atan2((double) f_24_, (double) f_25_);
		    Class69.anInt1072
			= 0x7ff & (int) (325.949
					 * (double) Class56_Sub1.aFloat3323);
		    Class7_Sub3_Sub1.anInt3719
			= ((int) (325.949 * (double) Class14_Sub17.aFloat3023)
			   & 0x7ff);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_331_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fd.J(" + arg0 + ')');
	} while (false);
    }
    
    public Class14_Sub8_Sub7(int arg0) {
	super(0, false);
	try {
	    method513(arg0, 739418402);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fd.<init>(" + arg0 + ')');
	}
    }
    
    public static void method512(boolean arg0) {
    while_333_:
	do {
	while_332_:
	    do {
		do {
		    try {
			anInt4205++;
			if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -202)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(127);
			int i_26_
			    = Class49.anInt817 + ((i & 0x7a) >> -2134173084);
			int i_27_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_28_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 116);
			if (-1 >= (i_26_ ^ 0xffffffff) && i_27_ >= 0
			    && i_26_ < 104 && 104 > i_27_) {
			    Class2 class2
				= (Class128.aClass2ArrayArrayArray2119
				   [Class14_Sub2_Sub3.anInt3785][i_26_]
				   [i_27_]);
			    if (null != class2) {
				for (Class14_Sub2_Sub4 class14_sub2_sub4
					 = ((Class14_Sub2_Sub4)
					    class2.method77(0));
				     class14_sub2_sub4 != null;
				     class14_sub2_sub4
					 = ((Class14_Sub2_Sub4)
					    class2.method84(-112))) {
				    if ((i_28_ & 0x7fff ^ 0xffffffff)
					== ((class14_sub2_sub4
					     .aClass133_Sub3_3789.anInt3557)
					    ^ 0xffffffff)) {
					class14_sub2_sub4.method233(0);
					break;
				    }
				}
				if (class2.method77(0) == null)
				    Class128.aClass2ArrayArrayArray2119
					[Class14_Sub2_Sub3.anInt3785][i_26_]
					[i_27_]
					= null;
				Class67.method1300(i_27_, 9210, i_26_);
			    }
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-113 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-105);
			int i_29_ = Class14_Sub4.anInt2788 + (0x7 & i);
			int i_30_ = Class49.anInt817 - -(i >> 145810820 & 0x7);
			int i_31_ = i_30_ - -Class14_Sub8_Sub38
						 .aClass14_Sub10_Sub1_4734
						 .method780((byte) -77);
			int i_32_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method780((byte) -77) + i_29_;
			int i_33_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734.method805(0);
			int i_34_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 115);
			int i_35_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(-75) * 4;
			int i_36_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(93) * 4;
			int i_37_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 118);
			int i_38_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 127);
			int i_39_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(64);
			int i_40_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(-31);
			if ((i_30_ ^ 0xffffffff) <= -1 && 0 <= i_29_
			    && (i_30_ ^ 0xffffffff) > -105
			    && (i_29_ ^ 0xffffffff) > -105
			    && -1 >= (i_31_ ^ 0xffffffff)
			    && (i_32_ ^ 0xffffffff) <= -1
			    && (i_31_ ^ 0xffffffff) > -105
			    && (i_32_ ^ 0xffffffff) > -105 && i_34_ != 65535) {
			    i_31_ = 128 * i_31_ + 64;
			    i_29_ = i_29_ * 128 + 64;
			    i_30_ = 64 + 128 * i_30_;
			    i_32_ = i_32_ * 128 + 64;
			    Class133_Sub6 class133_sub6
				= (new Class133_Sub6
				   (i_34_, Class14_Sub2_Sub3.anInt3785, i_30_,
				    i_29_,
				    (-i_35_
				     + Class26.method1017(i_30_,
							  (Class14_Sub2_Sub3
							   .anInt3785),
							  (byte) 105, i_29_)),
				    Class14_Sub2_Sub20.anInt4064 + i_37_,
				    Class14_Sub2_Sub20.anInt4064 + i_38_,
				    i_39_, i_40_, i_33_, i_36_));
			    class133_sub6.method1849
				(Class14_Sub2_Sub20.anInt4064 + i_37_,
				 (byte) -122, i_31_, i_32_,
				 (Class26.method1017(i_31_,
						     (Class14_Sub2_Sub3
						      .anInt3785),
						     (byte) 79, i_32_)
				  + -i_36_));
			    Class4.aClass2_127.method80
				(new Class14_Sub2_Sub10(class133_sub6),
				 (byte) -124);
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (232 != Class133_Sub4.anInt3579)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-87);
			int i_41_ = (i >> 212087428 & 0x7) + Class49.anInt817;
			int i_42_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_43_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 121);
			if (i_43_ == 65535)
			    i_43_ = -1;
			int i_44_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(125);
			int i_45_ = (i_44_ & 0xfa) >> 1375989764;
			int i_46_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(-80);
			int i_47_ = i_44_ & 0x7;
			if ((i_41_ ^ 0xffffffff) <= -1 && i_42_ >= 0
			    && (i_41_ ^ 0xffffffff) > -105
			    && (i_42_ ^ 0xffffffff) > -105) {
			    int i_48_ = i_45_ - -1;
			    if (((Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anIntArray3476[0])
				 ^ 0xffffffff) <= (i_41_ - i_48_ ^ 0xffffffff)
				&& (Class14_Sub3.aClass133_Sub1_Sub1_2748
				    .anIntArray3476[0]) <= i_41_ - -i_48_
				&& (Class14_Sub3.aClass133_Sub1_Sub1_2748
				    .anIntArray3443[0]) >= i_42_ - i_48_
				&& ((i_48_ + i_42_ ^ 0xffffffff)
				    <= ((Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .anIntArray3443[0])
					^ 0xffffffff))
				&& -1 != (Class100.anInt1691 ^ 0xffffffff)
				&& -1 > (i_47_ ^ 0xffffffff)
				&& -51 < (Class2.anInt96 ^ 0xffffffff)
				&& i_43_ != -1) {
				Class153.anIntArray2454[Class2.anInt96]
				    = i_43_;
				Class14_Sub2_Sub19.anIntArray4052[(Class2
								   .anInt96)]
				    = i_47_;
				Class14_Sub2_Sub14.anIntArray3949[(Class2
								   .anInt96)]
				    = i_46_;
				Class137.aClass91Array2197[Class2.anInt96]
				    = null;
				Class116.anIntArray1928[Class2.anInt96]
				    = ((i_42_ << 1672568200)
				       + ((i_41_ << -1267616688) + i_45_));
				Class2.anInt96++;
			    }
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-51 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(65);
			int i_49_ = Class49.anInt817 - -(i >> 99279908 & 0x7);
			int i_50_ = Class14_Sub4.anInt2788 + (i & 0x7);
			int i_51_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 115);
			int i_52_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 102);
			int i_53_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 106);
			if (0 <= i_49_ && -1 >= (i_50_ ^ 0xffffffff)
			    && i_49_ < 104 && (i_50_ ^ 0xffffffff) > -105) {
			    Class2 class2
				= (Class128.aClass2ArrayArrayArray2119
				   [Class14_Sub2_Sub3.anInt3785][i_49_]
				   [i_50_]);
			    if (null != class2) {
				for (Class14_Sub2_Sub4 class14_sub2_sub4
					 = ((Class14_Sub2_Sub4)
					    class2.method77(0));
				     class14_sub2_sub4 != null;
				     class14_sub2_sub4
					 = ((Class14_Sub2_Sub4)
					    class2.method84(-61))) {
				    Class133_Sub3 class133_sub3
					= (class14_sub2_sub4
					   .aClass133_Sub3_3789);
				    if (((0x7fff & i_51_)
					 == class133_sub3.anInt3557)
					&& class133_sub3.anInt3558 == i_52_) {
					class133_sub3.anInt3558 = i_53_;
					break;
				    }
				}
				Class67.method1300(i_50_, 9210, i_49_);
			    }
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-31 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method791(-3977);
			int i_54_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734.method819(3);
			int i_55_ = Class14_Sub4.anInt2788 + (0x7 & i_54_);
			int i_56_
			    = (i_54_ >> -625366492 & 0x7) + Class49.anInt817;
			int i_57_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method806((byte) -58);
			int i_58_ = i_57_ & 0x3;
			int i_59_ = i_57_ >> 739418402;
			int i_60_ = Class14_Sub19.anIntArray3082[i_59_];
			if (0 <= i_56_ && i_55_ >= 0 && i_56_ < 104
			    && (i_55_ ^ 0xffffffff) > -105)
			    Class106.method1541(i_56_, i_59_, i_58_,
						Class14_Sub2_Sub3.anInt3785,
						i_55_, -1, 0, !arg0, i_60_, i);
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -249)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(109);
			int i_61_ = Class49.anInt817 + (0x7 & i >> -198077756);
			int i_62_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_63_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 123);
			int i_64_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(-13);
			int i_65_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 110);
			if (-1 >= (i_61_ ^ 0xffffffff) && i_62_ >= 0
			    && 104 > i_61_ && 104 > i_62_) {
			    i_62_ = 64 + 128 * i_62_;
			    i_61_ = 128 * i_61_ + 64;
			    Class133_Sub5 class133_sub5
				= (new Class133_Sub5
				   (i_63_, Class14_Sub2_Sub3.anInt3785, i_61_,
				    i_62_,
				    (Class26.method1017(i_61_,
							(Class14_Sub2_Sub3
							 .anInt3785),
							(byte) 116, i_62_)
				     + -i_64_),
				    i_65_, Class14_Sub2_Sub20.anInt4064));
			    Class79.aClass2_1268.method80
				(new Class14_Sub2_Sub7(class133_sub5),
				 (byte) -123);
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			do {
			    if (-22
				== (Class133_Sub4.anInt3579 ^ 0xffffffff)) {
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method819(3);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method780((byte) -77);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method813(125);
				int i = Class14_Sub8_Sub38
					    .aClass14_Sub10_Sub1_4734
					    .method836((byte) -72);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 109);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-52);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method813(113);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method791(-3977);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method782((byte) 105);
				if (Class14_Sub2_Sub10.anInt3868 != i)
				    break;
			    }
			} while (false);
			if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -111)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method832((byte) -102);
			int i_66_ = i >> -461348670;
			int i_67_ = 0x3 & i;
			int i_68_ = Class14_Sub19.anIntArray3082[i_66_];
			int i_69_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method781(false);
			if (i_69_ == 65535)
			    i_69_ = -1;
			int i_70_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method832((byte) -109);
			int i_71_
			    = Class49.anInt817 + ((i_70_ & 0x78) >> 711285924);
			int i_72_ = Class14_Sub4.anInt2788 + (0x7 & i_70_);
			Class125.method1723(i_71_, i_68_,
					    Class14_Sub2_Sub3.anInt3785, i_72_,
					    -1292647136, i_67_, i_69_, i_66_);
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (Class133_Sub4.anInt3579 != 196)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method806((byte) -92);
			int i_73_ = Class14_Sub4.anInt2788 + (0x7 & i);
			int i_74_
			    = ((0x72 & i) >> 566941956) + Class49.anInt817;
			int i_75_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method806((byte) 110);
			int i_76_ = i_75_ >> -1970404222;
			int i_77_ = i_75_ & 0x3;
			int i_78_ = Class14_Sub19.anIntArray3082[i_76_];
			if (i_74_ >= 0 && (i_73_ ^ 0xffffffff) <= -1
			    && 104 > i_74_ && (i_73_ ^ 0xffffffff) > -105)
			    Class106.method1541(i_74_, i_76_, i_77_,
						Class14_Sub2_Sub3.anInt3785,
						i_73_, -1, 0, false, i_78_,
						-1);
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg0 != true)
			    aClass109Array4195 = null;
			if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -76)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method836((byte) 12);
			int i_79_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 108);
			int i_80_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 123);
			int i_81_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method806((byte) 124);
			int i_82_ = (((i_81_ & 0x73) >> 1446787396)
				     + Class49.anInt817);
			int i_83_ = (0x7 & i_81_) + Class14_Sub4.anInt2788;
			if (0 <= i_82_ && i_83_ >= 0 && i_82_ < 104
			    && 104 > i_83_
			    && Class14_Sub2_Sub10.anInt3868 != i) {
			    Class133_Sub3 class133_sub3 = new Class133_Sub3();
			    class133_sub3.anInt3557 = i_79_;
			    class133_sub3.anInt3558 = i_80_;
			    if ((Class128.aClass2ArrayArrayArray2119
				 [Class14_Sub2_Sub3.anInt3785][i_82_][i_83_])
				== null)
				Class128.aClass2ArrayArrayArray2119
				    [Class14_Sub2_Sub3.anInt3785][i_82_][i_83_]
				    = new Class2();
			    Class128.aClass2ArrayArrayArray2119
				[Class14_Sub2_Sub3.anInt3785][i_82_][i_83_]
				.method80
				(new Class14_Sub2_Sub4(class133_sub3),
				 (byte) -118);
			    Class67.method1300(i_83_, 9210, i_82_);
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (29 != Class133_Sub4.anInt3579)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-75);
			int i_84_ = (i & 0xf) + 2 * Class14_Sub4.anInt2788;
			int i_85_ = (2 * Class49.anInt817
				     + ((i & 0xf5) >> -510104604));
			int i_86_ = i_85_ - -Class14_Sub8_Sub38
						 .aClass14_Sub10_Sub1_4734
						 .method780((byte) -77);
			int i_87_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method780((byte) -77) + i_84_;
			int i_88_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734.method805(0);
			int i_89_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 115);
			int i_90_
			    = 4 * Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734.method798(-50);
			int i_91_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(-68) * 4;
			int i_92_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 121);
			int i_93_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 116);
			int i_94_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(87);
			int i_95_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(95);
			if ((i_85_ ^ 0xffffffff) <= -1
			    && -1 >= (i_84_ ^ 0xffffffff)
			    && (i_85_ ^ 0xffffffff) > -209
			    && (i_84_ ^ 0xffffffff) > -209
			    && (i_86_ ^ 0xffffffff) <= -1 && i_87_ >= 0
			    && -209 < (i_86_ ^ 0xffffffff) && i_87_ < 208
			    && -65536 != (i_89_ ^ 0xffffffff)) {
			    i_87_ = 64 * i_87_;
			    i_86_ = 64 * i_86_;
			    i_85_ *= 64;
			    i_84_ *= 64;
			    Class133_Sub6 class133_sub6
				= (new Class133_Sub6
				   (i_89_, Class14_Sub2_Sub3.anInt3785, i_85_,
				    i_84_,
				    (Class26.method1017(i_85_,
							(Class14_Sub2_Sub3
							 .anInt3785),
							(byte) 95, i_84_)
				     - i_90_),
				    Class14_Sub2_Sub20.anInt4064 + i_92_,
				    i_93_ + Class14_Sub2_Sub20.anInt4064,
				    i_94_, i_95_, i_88_, i_91_));
			    class133_sub6.method1849
				(i_92_ - -Class14_Sub2_Sub20.anInt4064,
				 (byte) -122, i_86_, i_87_,
				 (Class26.method1017(i_86_,
						     (Class14_Sub2_Sub3
						      .anInt3785),
						     (byte) -105, i_87_)
				  - i_91_));
			    Class4.aClass2_127.method80
				(new Class14_Sub2_Sub10(class133_sub6),
				 (byte) -119);
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (25 != Class133_Sub4.anInt3579)
			    break;
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
			int i_96_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(69);
			int i_97_
			    = (i_96_ >> -1687234268 & 0x7) + Class49.anInt817;
			int i_98_ = Class14_Sub4.anInt2788 + (i_96_ & 0x7);
			int i_99_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method781(!arg0);
			if (0 <= i_97_ && (i_98_ ^ 0xffffffff) <= -1
			    && (i_97_ ^ 0xffffffff) > -105 && i_98_ < 104) {
			    Class133_Sub3 class133_sub3 = new Class133_Sub3();
			    class133_sub3.anInt3557 = i_99_;
			    class133_sub3.anInt3558 = i;
			    if ((Class128.aClass2ArrayArrayArray2119
				 [Class14_Sub2_Sub3.anInt3785][i_97_][i_98_])
				== null)
				Class128.aClass2ArrayArrayArray2119
				    [Class14_Sub2_Sub3.anInt3785][i_97_][i_98_]
				    = new Class2();
			    Class128.aClass2ArrayArrayArray2119
				[Class14_Sub2_Sub3.anInt3785][i_97_][i_98_]
				.method80
				(new Class14_Sub2_Sub4(class133_sub3),
				 (byte) -121);
			    Class67.method1300(i_98_, 9210, i_97_);
			}
		    } catch (RuntimeException runtimeexception) {
			break while_332_;
		    }
		    break;
		} while (false);
		break while_333_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fd.B(" + arg0 + ')');
	} while (false);
    }
    
    public void method513(int arg0, int arg1) {
    while_335_:
	do {
	while_334_:
	    do {
		do {
		    try {
			anInt4213 = (0xff0000 & arg0) >> 1780049836;
			anInt4212 = arg0 >> 1358351876 & 0xff0;
			anInt4198 = (arg0 & 0xff) << 113096932;
			if (arg1 == 739418402)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_334_;
		    }
		    return;
		} while (false);
		try {
		    anInt4209++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_335_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "fd.G(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method514(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt4206++;
	    Class94 class94 = Class14_Sub6.method464(arg2, arg1, (byte) -19);
	    if (null != class94 && null != class94.anObjectArray1562) {
		Class14_Sub21 class14_sub21 = new Class14_Sub21();
		class14_sub21.anObjectArray3115 = class94.anObjectArray1562;
		class14_sub21.aClass94_3116 = class94;
		Class133_Sub3.method1830(class14_sub21, -1976917689);
	    }
	    if (arg0 != 32767)
		method510(100);
	    Class14_Sub29.anInt3238 = arg2;
	    Class14_Sub2_Sub11.anInt3874 = arg1;
	    Class2.anInt101 = arg3;
	    Class14_Sub4.aBoolean2784 = true;
	    Class103.method1531((byte) -36, class94);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fd.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public static Class124 method515(Class124[] arg0, byte arg1) {
	Class124 class124;
	try {
	    anInt4200++;
	    if (arg1 >= 0)
		method510(-69);
	    if (2 > arg0.length)
		throw new IllegalArgumentException();
	    class124 = Class14_Sub8_Sub39_Sub1.method683(true, 0, arg0.length,
							 arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fd.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class124;
    }
    
    public Class14_Sub8_Sub7() {
	this(0);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4204++;
	    int i = arg0;
	    if (0 == i)
		method513(arg2.method829(76), 739418402);
	    if (arg1 != 24777)
		anInt4207 = 122;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fd.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_4202 = aClass124_4201;
	aClass109Array4195 = new Class109[6];
    }
}
