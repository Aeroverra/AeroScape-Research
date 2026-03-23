/* Class133_Sub7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub7_Sub1 extends Class133_Sub7
{
    public short aShort4954;
    public int anInt4955 = 0;
    public int[] anIntArray4956;
    public int[] anIntArray4957;
    public int[] anIntArray4958;
    public int[][] anIntArrayArray4959;
    public int[] anIntArray4960;
    public int[][] anIntArrayArray4961;
    public int[] anIntArray4962;
    public short aShort4963;
    public int[] anIntArray4964;
    public int[] anIntArray4965;
    public int anInt4966;
    public short aShort4967;
    public int[] anIntArray4968;
    public int[] anIntArray4969;
    public short aShort4970;
    public byte[] aByteArray4971;
    public int[] anIntArray4972;
    public byte[] aByteArray4973;
    public boolean aBoolean4974 = false;
    public static Class133_Sub7_Sub1 aClass133_Sub7_Sub1_4975
	= new Class133_Sub7_Sub1();
    public short aShort4976;
    public short aShort4977;
    public int[] anIntArray4978;
    public short aShort4979;
    public short aShort4980;
    public int[] anIntArray4981;
    public int anInt4982;
    public byte[] aByteArray4983;
    public short[] aShortArray4984;
    public static Class133_Sub7_Sub1 aClass133_Sub7_Sub1_4985;
    public static byte[] aByteArray4986 = new byte[1];
    public static int[] anIntArray4987;
    public static boolean[] aBooleanArray4988;
    public static int[] anIntArray4989;
    public static int[] anIntArray4990;
    public static byte[] aByteArray4991;
    public static int[] anIntArray4992;
    public static int[] anIntArray4993;
    public static int[] anIntArray4994;
    public static int anInt4995;
    public static int[] anIntArray4996;
    public static int[] anIntArray4997;
    public static int anInt4998;
    public static int[][] anIntArrayArray4999;
    public static int[] anIntArray5000;
    public static int[] anIntArray5001;
    public static boolean[] aBooleanArray5002;
    public static int anInt5003;
    public static int[] anIntArray5004;
    public static int[] anIntArray5005;
    public static int[] anIntArray5006;
    public static int[] anIntArray5007;
    public static int[] anIntArray5008;
    
    public Class133_Sub7 method1870(boolean arg0, boolean arg1) {
	if (!arg0 && aByteArray4991.length < anInt4982)
	    aByteArray4991 = new byte[anInt4982 + 100];
	return method1886(arg0, aClass133_Sub7_Sub1_4985, aByteArray4991);
    }
    
    public int method1867() {
	if (!aBoolean4974)
	    method1876();
	return aShort4977;
    }
    
    public void method1876() {
	int i = 32767;
	int i_0_ = 32767;
	int i_1_ = 32767;
	int i_2_ = -32768;
	int i_3_ = -32768;
	int i_4_ = -32768;
	int i_5_ = 0;
	int i_6_ = 0;
	for (int i_7_ = 0; i_7_ < anInt4955; i_7_++) {
	    int i_8_ = anIntArray4962[i_7_];
	    int i_9_ = anIntArray4958[i_7_];
	    int i_10_ = anIntArray4969[i_7_];
	    if (i_8_ < i)
		i = i_8_;
	    if (i_8_ > i_2_)
		i_2_ = i_8_;
	    if (i_9_ < i_0_)
		i_0_ = i_9_;
	    if (i_9_ > i_3_)
		i_3_ = i_9_;
	    if (i_10_ < i_1_)
		i_1_ = i_10_;
	    if (i_10_ > i_4_)
		i_4_ = i_10_;
	    int i_11_ = i_8_ * i_8_ + i_10_ * i_10_;
	    if (i_11_ > i_5_)
		i_5_ = i_11_;
	    i_11_ += i_9_ * i_9_;
	    if (i_11_ > i_6_)
		i_6_ = i_11_;
	}
	aShort4977 = (short) i;
	aShort4967 = (short) i_2_;
	aShort4954 = (short) i_0_;
	aShort4979 = (short) i_3_;
	aShort4980 = (short) i_1_;
	aShort4970 = (short) i_4_;
	aShort4963 = (short) (int) (Math.sqrt((double) i_5_) + 0.99);
	aShort4976 = (short) (int) (Math.sqrt((double) i_6_) + 0.99);
	aBoolean4974 = true;
    }
    
    public void method1873(Class14_Sub2_Sub15 arg0, int arg1,
			   Class14_Sub2_Sub15 arg2, int arg3, int[] arg4,
			   boolean arg5) {
	if (arg1 != -1) {
	    if (arg4 == null || arg3 == -1)
		method1857(arg0, arg1, arg5);
	    else {
		Class143 class143 = arg0.aClass143Array3951[arg1];
		Class143 class143_12_ = arg2.aClass143Array3951[arg3];
		Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
		anInt5003 = 0;
		anInt4998 = 0;
		anInt4995 = 0;
		int i = 0;
		int i_13_ = arg4[i++];
		for (int i_14_ = 0; i_14_ < class143.anInt2336; i_14_++) {
		    int i_15_;
		    for (i_15_ = class143.aShortArray2335[i_14_];
			 i_15_ > i_13_; i_13_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_15_ != i_13_
			|| class14_sub5.anIntArray2795[i_15_] == 0) {
			if (class143.aShortArray2338[i_14_] != -1)
			    method1885(0,
				       (class14_sub5.anIntArrayArray2798
					[class143.aShortArray2338[i_14_]]),
				       0, 0, 0);
			method1885(class14_sub5.anIntArray2795[i_15_],
				   class14_sub5.anIntArrayArray2798[i_15_],
				   class143.aShortArray2331[i_14_],
				   class143.aShortArray2340[i_14_],
				   class143.aShortArray2333[i_14_]);
		    }
		}
		anInt5003 = 0;
		anInt4998 = 0;
		anInt4995 = 0;
		i = 0;
		i_13_ = arg4[i++];
		for (int i_16_ = 0; i_16_ < class143_12_.anInt2336; i_16_++) {
		    int i_17_;
		    for (i_17_ = class143_12_.aShortArray2335[i_16_];
			 i_17_ > i_13_; i_13_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_17_ == i_13_
			|| class14_sub5.anIntArray2795[i_17_] == 0) {
			if (class143_12_.aShortArray2338[i_16_] != -1)
			    method1885(0,
				       (class14_sub5.anIntArrayArray2798
					[class143_12_.aShortArray2338[i_16_]]),
				       0, 0, 0);
			method1885(class14_sub5.anIntArray2795[i_17_],
				   class14_sub5.anIntArrayArray2798[i_17_],
				   class143_12_.aShortArray2331[i_16_],
				   class143_12_.aShortArray2340[i_16_],
				   class143_12_.aShortArray2333[i_16_]);
		    }
		}
		aBoolean4974 = false;
	    }
	}
    }
    
    public void method1862(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	try {
	    if (!aBoolean4974)
		method1876();
	    int i = Class3.anInt118;
	    int i_18_ = Class3.anInt110;
	    int i_19_ = Class3.anIntArray108[arg0];
	    int i_20_ = Class3.anIntArray111[arg0];
	    int i_21_ = Class3.anIntArray108[arg1];
	    int i_22_ = Class3.anIntArray111[arg1];
	    int i_23_ = Class3.anIntArray108[arg2];
	    int i_24_ = Class3.anIntArray111[arg2];
	    int i_25_ = Class3.anIntArray108[arg3];
	    int i_26_ = Class3.anIntArray111[arg3];
	    int i_27_ = arg5 * i_25_ + arg6 * i_26_ >> 16;
	    for (int i_28_ = 0; i_28_ < anInt4955; i_28_++) {
		int i_29_ = anIntArray4962[i_28_];
		int i_30_ = anIntArray4958[i_28_];
		int i_31_ = anIntArray4969[i_28_];
		if (arg2 != 0) {
		    int i_32_ = i_30_ * i_23_ + i_29_ * i_24_ >> 16;
		    i_30_ = i_30_ * i_24_ - i_29_ * i_23_ >> 16;
		    i_29_ = i_32_;
		}
		if (arg0 != 0) {
		    int i_33_ = i_30_ * i_20_ - i_31_ * i_19_ >> 16;
		    i_31_ = i_30_ * i_19_ + i_31_ * i_20_ >> 16;
		    i_30_ = i_33_;
		}
		if (arg1 != 0) {
		    int i_34_ = i_31_ * i_21_ + i_29_ * i_22_ >> 16;
		    i_31_ = i_31_ * i_22_ - i_29_ * i_21_ >> 16;
		    i_29_ = i_34_;
		}
		i_29_ += arg4;
		i_30_ += arg5;
		i_31_ += arg6;
		int i_35_ = i_30_ * i_26_ - i_31_ * i_25_ >> 16;
		i_31_ = i_30_ * i_25_ + i_31_ * i_26_ >> 16;
		i_30_ = i_35_;
		anIntArray4994[i_28_] = i_31_ - i_27_;
		anIntArray5006[i_28_] = i + (i_29_ << 9) / i_31_;
		anIntArray4992[i_28_] = i_18_ + (i_30_ << 9) / i_31_;
		if (anInt4966 > 0) {
		    anIntArray4993[i_28_] = i_29_;
		    anIntArray4997[i_28_] = i_30_;
		    anIntArray4987[i_28_] = i_31_;
		}
	    }
	    method1878(false, false, 0L, aShort4976, aShort4976 << 1);
	} catch (RuntimeException runtimeexception) {
	    /* empty */
	}
    }
    
    public static void method1877() {
	aClass133_Sub7_Sub1_4975 = null;
	aByteArray4986 = null;
	aClass133_Sub7_Sub1_4985 = null;
	aByteArray4991 = null;
	aBooleanArray4988 = null;
	aBooleanArray5002 = null;
	anIntArray5006 = null;
	anIntArray4992 = null;
	anIntArray4994 = null;
	anIntArray4993 = null;
	anIntArray4997 = null;
	anIntArray4987 = null;
	anIntArray5005 = null;
	anIntArray4989 = null;
	anIntArray5001 = null;
	anIntArrayArray4999 = null;
	anIntArray5007 = null;
	anIntArray5000 = null;
	anIntArray4990 = null;
	anIntArray5004 = null;
	anIntArray4996 = null;
	anIntArray5008 = null;
    }
    
    public void method1855(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt4955; i++) {
	    anIntArray4962[i] += arg0;
	    anIntArray4958[i] += arg1;
	    anIntArray4969[i] += arg2;
	}
	aBoolean4974 = false;
    }
    
    public void method1792(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8) {
	if (!aBoolean4974)
	    method1876();
	int i = arg7 * arg4 - arg5 * arg3 >> 16;
	int i_36_ = arg6 * arg1 + i * arg2 >> 16;
	int i_37_ = i_36_ + (aShort4963 * arg2 + aShort4979 * arg1 >> 16);
	if (i_37_ > 50) {
	    int i_38_ = i_36_ + (-aShort4963 * arg2 + aShort4954 * arg1 >> 16);
	    if (i_38_ < 3500) {
		int i_39_ = arg7 * arg3 + arg5 * arg4 >> 16;
		int i_40_ = i_39_ + aShort4963 << 9;
		if (i_40_ / i_37_ > Class20.anInt425) {
		    int i_41_ = i_39_ - aShort4963 << 9;
		    if (i_41_ / i_37_ < Class14_Sub8_Sub27.anInt4547) {
			int i_42_ = arg6 * arg2 - i * arg1 >> 16;
			int i_43_
			    = (i_42_ + (aShort4963 * arg1 + aShort4979 * arg2
					>> 16)
			       << 9);
			if (i_43_ / i_37_ > Class58.anInt948) {
			    int i_44_ = (i_42_ + ((-aShort4963 * arg1
						   + aShort4954 * arg2)
						  >> 16)
					 << 9);
			    if (i_44_ / i_37_ < Class70.anInt1081) {
				boolean bool = false;
				boolean bool_45_ = i_38_ <= 50;
				boolean bool_46_ = bool_45_ || anInt4966 > 0;
				int i_47_ = Class3.anInt118;
				int i_48_ = Class3.anInt110;
				int i_49_ = 0;
				int i_50_ = 0;
				if (arg0 != 0) {
				    i_49_ = Class3.anIntArray108[arg0];
				    i_50_ = Class3.anIntArray111[arg0];
				}
				boolean bool_51_ = false;
				if (arg8 > 0L && Class90.aBoolean1417
				    && i_38_ > 0) {
				    int i_52_;
				    int i_53_;
				    if (i_39_ > 0) {
					i_52_ = i_41_ / i_37_;
					i_53_ = i_40_ / i_38_;
				    } else {
					i_52_ = i_41_ / i_38_;
					i_53_ = i_40_ / i_37_;
				    }
				    int i_54_;
				    int i_55_;
				    if (i_42_ > 0) {
					i_54_ = i_44_ / i_37_;
					i_55_ = i_43_ / i_38_;
				    } else {
					i_54_ = i_44_ / i_38_;
					i_55_ = i_43_ / i_37_;
				    }
				    if (Class14_Sub2.anInt2726 >= i_52_
					&& Class14_Sub2.anInt2726 <= i_53_
					&& Class38.anInt2622 >= i_54_
					&& Class38.anInt2622 <= i_55_) {
					i_52_ = 999999;
					i_53_ = -999999;
					i_54_ = 999999;
					i_55_ = -999999;
					int[] is
					    = (new int[]
					       { aShort4977, aShort4967,
						 aShort4977, aShort4967,
						 aShort4977, aShort4967,
						 aShort4977, aShort4967 });
					int[] is_56_
					    = (new int[]
					       { aShort4980, aShort4980,
						 aShort4970, aShort4970,
						 aShort4980, aShort4980,
						 aShort4970, aShort4970 });
					int[] is_57_
					    = (new int[]
					       { aShort4954, aShort4954,
						 aShort4954, aShort4954,
						 aShort4979, aShort4979,
						 aShort4979, aShort4979 });
					for (int i_58_ = 0; i_58_ < 8;
					     i_58_++) {
					    int i_59_ = is[i_58_];
					    int i_60_ = is_57_[i_58_];
					    int i_61_ = is_56_[i_58_];
					    if (arg0 != 0) {
						int i_62_ = ((i_61_ * i_49_
							      + i_59_ * i_50_)
							     >> 16);
						i_61_
						    = (i_61_ * i_50_
						       - i_59_ * i_49_) >> 16;
						i_59_ = i_62_;
					    }
					    i_59_ += arg5;
					    i_60_ += arg6;
					    i_61_ += arg7;
					    int i_63_
						= (i_61_ * arg3 + i_59_ * arg4
						   >> 16);
					    i_61_
						= (i_61_ * arg4 - i_59_ * arg3
						   >> 16);
					    i_59_ = i_63_;
					    i_63_
						= (i_60_ * arg2 - i_61_ * arg1
						   >> 16);
					    i_61_
						= (i_60_ * arg1 + i_61_ * arg2
						   >> 16);
					    i_60_ = i_63_;
					    if (i_61_ > 0) {
						int i_64_
						    = (i_59_ << 9) / i_61_;
						int i_65_
						    = (i_60_ << 9) / i_61_;
						if (i_64_ < i_52_)
						    i_52_ = i_64_;
						if (i_64_ > i_53_)
						    i_53_ = i_64_;
						if (i_65_ < i_54_)
						    i_54_ = i_65_;
						if (i_65_ > i_55_)
						    i_55_ = i_65_;
					    }
					}
					if (Class14_Sub2.anInt2726 >= i_52_
					    && Class14_Sub2.anInt2726 <= i_53_
					    && Class38.anInt2622 >= i_54_
					    && Class38.anInt2622 <= i_55_) {
					    if (aBoolean3687)
						Class7_Sub3.aLongArray2685
						    [Class14_Sub15.anInt2996++]
						    = arg8;
					    else
						bool_51_ = true;
					}
				    }
				}
				for (int i_66_ = 0; i_66_ < anInt4955;
				     i_66_++) {
				    int i_67_ = anIntArray4962[i_66_];
				    int i_68_ = anIntArray4958[i_66_];
				    int i_69_ = anIntArray4969[i_66_];
				    if (arg0 != 0) {
					int i_70_
					    = (i_69_ * i_49_ + i_67_ * i_50_
					       >> 16);
					i_69_ = (i_69_ * i_50_ - i_67_ * i_49_
						 >> 16);
					i_67_ = i_70_;
				    }
				    i_67_ += arg5;
				    i_68_ += arg6;
				    i_69_ += arg7;
				    int i_71_
					= i_69_ * arg3 + i_67_ * arg4 >> 16;
				    i_69_ = i_69_ * arg4 - i_67_ * arg3 >> 16;
				    i_67_ = i_71_;
				    i_71_ = i_68_ * arg2 - i_69_ * arg1 >> 16;
				    i_69_ = i_68_ * arg1 + i_69_ * arg2 >> 16;
				    i_68_ = i_71_;
				    anIntArray4994[i_66_] = i_69_ - i_36_;
				    if (i_69_ >= 50) {
					anIntArray5006[i_66_]
					    = i_47_ + (i_67_ << 9) / i_69_;
					anIntArray4992[i_66_]
					    = i_48_ + (i_68_ << 9) / i_69_;
				    } else {
					anIntArray5006[i_66_] = -5000;
					bool = true;
				    }
				    if (bool_46_) {
					anIntArray4993[i_66_] = i_67_;
					anIntArray4997[i_66_] = i_68_;
					anIntArray4987[i_66_] = i_69_;
				    }
				}
				try {
				    method1878(bool, bool_51_, arg8,
					       i_36_ - i_38_,
					       i_37_ - i_38_ + 2);
				} catch (Exception exception) {
				    /* empty */
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method1878(boolean arg0, boolean arg1, long arg2, int arg3,
			   int arg4) {
	if (arg4 < 1600) {
	    int i = 0;
	    for (int i_72_ = 0; i_72_ < anInt4982; i_72_++) {
		if (anIntArray4965[i_72_] != -2) {
		    int i_73_ = anIntArray4968[i_72_];
		    int i_74_ = anIntArray4956[i_72_];
		    int i_75_ = anIntArray4972[i_72_];
		    int i_76_ = anIntArray5006[i_73_];
		    int i_77_ = anIntArray5006[i_74_];
		    int i_78_ = anIntArray5006[i_75_];
		    if (arg0 && (i_76_ == -5000 || i_77_ == -5000
				 || i_78_ == -5000)) {
			int i_79_ = anIntArray4993[i_73_];
			int i_80_ = anIntArray4993[i_74_];
			int i_81_ = anIntArray4993[i_75_];
			int i_82_ = anIntArray4997[i_73_];
			int i_83_ = anIntArray4997[i_74_];
			int i_84_ = anIntArray4997[i_75_];
			int i_85_ = anIntArray4987[i_73_];
			int i_86_ = anIntArray4987[i_74_];
			int i_87_ = anIntArray4987[i_75_];
			i_79_ -= i_80_;
			i_81_ -= i_80_;
			i_82_ -= i_83_;
			i_84_ -= i_83_;
			i_85_ -= i_86_;
			i_87_ -= i_86_;
			int i_88_ = i_82_ * i_87_ - i_85_ * i_84_;
			int i_89_ = i_85_ * i_81_ - i_79_ * i_87_;
			int i_90_ = i_79_ * i_84_ - i_82_ * i_81_;
			if (i_80_ * i_88_ + i_83_ * i_89_ + i_86_ * i_90_
			    > 0) {
			    aBooleanArray5002[i_72_] = true;
			    anIntArray5005[i] = (anIntArray4994[i_73_]
						 + anIntArray4994[i_74_]
						 + anIntArray4994[i_75_]) / 3;
			    anIntArray4989[i++] = i_72_;
			}
		    } else {
			if (arg1
			    && method1879((Class14_Sub2.anInt2726
					   + Class3.anInt118),
					  Class38.anInt2622 + Class3.anInt110,
					  anIntArray4992[i_73_],
					  anIntArray4992[i_74_],
					  anIntArray4992[i_75_], i_76_, i_77_,
					  i_78_)) {
			    Class7_Sub3.aLongArray2685
				[Class14_Sub15.anInt2996++]
				= arg2;
			    arg1 = false;
			}
			if (((i_76_ - i_77_) * (anIntArray4992[i_75_]
						- anIntArray4992[i_74_])
			     - ((anIntArray4992[i_73_] - anIntArray4992[i_74_])
				* (i_78_ - i_77_)))
			    > 0) {
			    aBooleanArray5002[i_72_] = false;
			    if (i_76_ < 0 || i_77_ < 0 || i_78_ < 0
				|| i_76_ > Class3.anInt109
				|| i_77_ > Class3.anInt109
				|| i_78_ > Class3.anInt109)
				aBooleanArray4988[i_72_] = true;
			    else
				aBooleanArray4988[i_72_] = false;
			    anIntArray5005[i] = (anIntArray4994[i_73_]
						 + anIntArray4994[i_74_]
						 + anIntArray4994[i_75_]) / 3;
			    anIntArray4989[i++] = i_72_;
			}
		    }
		}
	    }
	    Class95.method1486(i - 1, 0, (byte) -110, anIntArray4989,
			       anIntArray5005);
	    if (aByteArray4973 == null) {
		for (int i_91_ = 0; i_91_ < i; i_91_++)
		    method1883(anIntArray4989[i_91_]);
	    } else {
		for (int i_92_ = 0; i_92_ < 12; i_92_++) {
		    anIntArray5001[i_92_] = 0;
		    anIntArray4990[i_92_] = 0;
		}
		for (int i_93_ = 0; i_93_ < i; i_93_++) {
		    int i_94_ = anIntArray4989[i_93_];
		    int i_95_ = anIntArray5005[i_93_];
		    byte i_96_ = aByteArray4973[i_94_];
		    int i_97_ = anIntArray5001[i_96_]++;
		    anIntArrayArray4999[i_96_][i_97_] = i_94_;
		    if (i_96_ < 10)
			anIntArray4990[i_96_] += i_95_;
		    else if (i_96_ == 10)
			anIntArray5007[i_97_] = i_95_;
		    else
			anIntArray5000[i_97_] = i_95_;
		}
		int i_98_ = 0;
		if (anIntArray5001[1] > 0 || anIntArray5001[2] > 0)
		    i_98_ = ((anIntArray4990[1] + anIntArray4990[2])
			     / (anIntArray5001[1] + anIntArray5001[2]));
		int i_99_ = 0;
		if (anIntArray5001[3] > 0 || anIntArray5001[4] > 0)
		    i_99_ = ((anIntArray4990[3] + anIntArray4990[4])
			     / (anIntArray5001[3] + anIntArray5001[4]));
		int i_100_ = 0;
		if (anIntArray5001[6] > 0 || anIntArray5001[8] > 0)
		    i_100_ = ((anIntArray4990[6] + anIntArray4990[8])
			      / (anIntArray5001[6] + anIntArray5001[8]));
		int i_101_ = 0;
		int i_102_ = anIntArray5001[10];
		int[] is = anIntArrayArray4999[10];
		int[] is_103_ = anIntArray5007;
		if (i_101_ == i_102_) {
		    i_101_ = 0;
		    i_102_ = anIntArray5001[11];
		    is = anIntArrayArray4999[11];
		    is_103_ = anIntArray5000;
		}
		int i_104_;
		if (i_101_ < i_102_)
		    i_104_ = is_103_[i_101_];
		else
		    i_104_ = -1000;
		for (int i_105_ = 0; i_105_ < 10; i_105_++) {
		    while (i_105_ == 0 && i_104_ > i_98_) {
			method1883(is[i_101_++]);
			if (i_101_ == i_102_
			    && is != anIntArrayArray4999[11]) {
			    i_101_ = 0;
			    i_102_ = anIntArray5001[11];
			    is = anIntArrayArray4999[11];
			    is_103_ = anIntArray5000;
			}
			if (i_101_ < i_102_)
			    i_104_ = is_103_[i_101_];
			else
			    i_104_ = -1000;
		    }
		    while (i_105_ == 3 && i_104_ > i_99_) {
			method1883(is[i_101_++]);
			if (i_101_ == i_102_
			    && is != anIntArrayArray4999[11]) {
			    i_101_ = 0;
			    i_102_ = anIntArray5001[11];
			    is = anIntArrayArray4999[11];
			    is_103_ = anIntArray5000;
			}
			if (i_101_ < i_102_)
			    i_104_ = is_103_[i_101_];
			else
			    i_104_ = -1000;
		    }
		    while (i_105_ == 5 && i_104_ > i_100_) {
			method1883(is[i_101_++]);
			if (i_101_ == i_102_
			    && is != anIntArrayArray4999[11]) {
			    i_101_ = 0;
			    i_102_ = anIntArray5001[11];
			    is = anIntArrayArray4999[11];
			    is_103_ = anIntArray5000;
			}
			if (i_101_ < i_102_)
			    i_104_ = is_103_[i_101_];
			else
			    i_104_ = -1000;
		    }
		    int i_106_ = anIntArray5001[i_105_];
		    int[] is_107_ = anIntArrayArray4999[i_105_];
		    for (int i_108_ = 0; i_108_ < i_106_; i_108_++)
			method1883(is_107_[i_108_]);
		}
		while (i_104_ != -1000) {
		    method1883(is[i_101_++]);
		    if (i_101_ == i_102_ && is != anIntArrayArray4999[11]) {
			i_101_ = 0;
			is = anIntArrayArray4999[11];
			i_102_ = anIntArray5001[11];
			is_103_ = anIntArray5000;
		    }
		    if (i_101_ < i_102_)
			i_104_ = is_103_[i_101_];
		    else
			i_104_ = -1000;
		}
	    }
	}
    }
    
    public void method1857(Class14_Sub2_Sub15 arg0, int arg1, boolean arg2) {
	if (anIntArrayArray4959 != null && arg1 != -1) {
	    Class143 class143 = arg0.aClass143Array3951[arg1];
	    Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
	    anInt5003 = 0;
	    anInt4998 = 0;
	    anInt4995 = 0;
	    for (int i = 0; i < class143.anInt2336; i++) {
		short i_109_ = class143.aShortArray2335[i];
		if (class143.aShortArray2338[i] != -1)
		    method1885(0, (class14_sub5.anIntArrayArray2798
				   [class143.aShortArray2338[i]]), 0, 0, 0);
		method1885(class14_sub5.anIntArray2795[i_109_],
			   class14_sub5.anIntArrayArray2798[i_109_],
			   class143.aShortArray2331[i],
			   class143.aShortArray2340[i],
			   class143.aShortArray2333[i]);
	    }
	    aBoolean4974 = false;
	}
    }
    
    public boolean method1879(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	return true;
    }
    
    public int method1781() {
	if (!aBoolean4974)
	    method1876();
	return aShort4954;
    }
    
    public static int method1880(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public void method1872() {
	for (int i = 0; i < anInt4955; i++) {
	    anIntArray4962[i] = -anIntArray4962[i];
	    anIntArray4969[i] = -anIntArray4969[i];
	}
	aBoolean4974 = false;
    }
    
    public void method1875() {
	for (int i = 0; i < anInt4955; i++) {
	    int i_110_ = anIntArray4969[i];
	    anIntArray4969[i] = anIntArray4962[i];
	    anIntArray4962[i] = -i_110_;
	}
	aBoolean4974 = false;
    }
    
    public int method1868() {
	if (!aBoolean4974)
	    method1876();
	return aShort4980;
    }
    
    public void method1859(Class14_Sub2_Sub15 arg0, int arg1) {
	if (anIntArrayArray4959 != null && arg1 != -1) {
	    Class143 class143 = arg0.aClass143Array3951[arg1];
	    Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
	    anInt5003 = 0;
	    anInt4998 = 0;
	    anInt4995 = 0;
	    for (int i = 0; i < class143.anInt2336; i++) {
		short i_111_ = class143.aShortArray2335[i];
		if (class14_sub5.aBooleanArray2791[i_111_]) {
		    if (class143.aShortArray2338[i] != -1)
			method1884(0, 0, 0, 0);
		    method1884(class14_sub5.anIntArray2795[i_111_],
			       class143.aShortArray2331[i],
			       class143.aShortArray2340[i],
			       class143.aShortArray2333[i]);
		}
	    }
	    aBoolean4974 = false;
	}
    }
    
    public Class133_Sub7 method1860(boolean arg0, boolean arg1) {
	if (!arg0 && aByteArray4986.length < anInt4982)
	    aByteArray4986 = new byte[anInt4982 + 100];
	return method1886(arg0, aClass133_Sub7_Sub1_4975, aByteArray4986);
    }
    
    public void method1869(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt4955; i++) {
	    anIntArray4962[i] = anIntArray4962[i] * arg0 / 128;
	    anIntArray4958[i] = anIntArray4958[i] * arg1 / 128;
	    anIntArray4969[i] = anIntArray4969[i] * arg2 / 128;
	}
	aBoolean4974 = false;
    }
    
    public static int method1881(int arg0) {
	if (arg0 < 2)
	    arg0 = 2;
	else if (arg0 > 126)
	    arg0 = 126;
	return arg0;
    }
    
    public int method1856() {
	if (!aBoolean4974)
	    method1876();
	return aShort4967;
    }
    
    public void method1882(int arg0) {
	int i = Class3.anInt118;
	int i_112_ = Class3.anInt110;
	int i_113_ = 0;
	int i_114_ = anIntArray4968[arg0];
	int i_115_ = anIntArray4956[arg0];
	int i_116_ = anIntArray4972[arg0];
	int i_117_ = anIntArray4987[i_114_];
	int i_118_ = anIntArray4987[i_115_];
	int i_119_ = anIntArray4987[i_116_];
	if (aByteArray4983 == null)
	    Class3.anInt116 = 0;
	else
	    Class3.anInt116 = aByteArray4983[arg0] & 0xff;
	if (i_117_ >= 50) {
	    anIntArray5004[i_113_] = anIntArray5006[i_114_];
	    anIntArray4996[i_113_] = anIntArray4992[i_114_];
	    anIntArray5008[i_113_++] = anIntArray4957[arg0];
	} else {
	    int i_120_ = anIntArray4993[i_114_];
	    int i_121_ = anIntArray4997[i_114_];
	    int i_122_ = anIntArray4957[arg0];
	    if (i_119_ >= 50) {
		int i_123_
		    = (50 - i_117_) * Class3.anIntArray105[i_119_ - i_117_];
		anIntArray5004[i_113_]
		    = i + (i_120_ + ((anIntArray4993[i_116_] - i_120_) * i_123_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_121_ + ((anIntArray4997[i_116_] - i_121_) * i_123_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_122_ + ((anIntArray4965[arg0] - i_122_) * i_123_
				>> 16);
	    }
	    if (i_118_ >= 50) {
		int i_124_
		    = (50 - i_117_) * Class3.anIntArray105[i_118_ - i_117_];
		anIntArray5004[i_113_]
		    = i + (i_120_ + ((anIntArray4993[i_115_] - i_120_) * i_124_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_121_ + ((anIntArray4997[i_115_] - i_121_) * i_124_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_122_ + ((anIntArray4978[arg0] - i_122_) * i_124_
				>> 16);
	    }
	}
	if (i_118_ >= 50) {
	    anIntArray5004[i_113_] = anIntArray5006[i_115_];
	    anIntArray4996[i_113_] = anIntArray4992[i_115_];
	    anIntArray5008[i_113_++] = anIntArray4978[arg0];
	} else {
	    int i_125_ = anIntArray4993[i_115_];
	    int i_126_ = anIntArray4997[i_115_];
	    int i_127_ = anIntArray4978[arg0];
	    if (i_117_ >= 50) {
		int i_128_
		    = (50 - i_118_) * Class3.anIntArray105[i_117_ - i_118_];
		anIntArray5004[i_113_]
		    = i + (i_125_ + ((anIntArray4993[i_114_] - i_125_) * i_128_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_126_ + ((anIntArray4997[i_114_] - i_126_) * i_128_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_127_ + ((anIntArray4957[arg0] - i_127_) * i_128_
				>> 16);
	    }
	    if (i_119_ >= 50) {
		int i_129_
		    = (50 - i_118_) * Class3.anIntArray105[i_119_ - i_118_];
		anIntArray5004[i_113_]
		    = i + (i_125_ + ((anIntArray4993[i_116_] - i_125_) * i_129_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_126_ + ((anIntArray4997[i_116_] - i_126_) * i_129_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_127_ + ((anIntArray4965[arg0] - i_127_) * i_129_
				>> 16);
	    }
	}
	if (i_119_ >= 50) {
	    anIntArray5004[i_113_] = anIntArray5006[i_116_];
	    anIntArray4996[i_113_] = anIntArray4992[i_116_];
	    anIntArray5008[i_113_++] = anIntArray4965[arg0];
	} else {
	    int i_130_ = anIntArray4993[i_116_];
	    int i_131_ = anIntArray4997[i_116_];
	    int i_132_ = anIntArray4965[arg0];
	    if (i_118_ >= 50) {
		int i_133_
		    = (50 - i_119_) * Class3.anIntArray105[i_118_ - i_119_];
		anIntArray5004[i_113_]
		    = i + (i_130_ + ((anIntArray4993[i_115_] - i_130_) * i_133_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_131_ + ((anIntArray4997[i_115_] - i_131_) * i_133_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_132_ + ((anIntArray4978[arg0] - i_132_) * i_133_
				>> 16);
	    }
	    if (i_117_ >= 50) {
		int i_134_
		    = (50 - i_119_) * Class3.anIntArray105[i_117_ - i_119_];
		anIntArray5004[i_113_]
		    = i + (i_130_ + ((anIntArray4993[i_114_] - i_130_) * i_134_
				     >> 16)
			   << 9) / 50;
		anIntArray4996[i_113_]
		    = (i_112_
		       + (i_131_ + ((anIntArray4997[i_114_] - i_131_) * i_134_
				    >> 16)
			  << 9) / 50);
		anIntArray5008[i_113_++]
		    = i_132_ + ((anIntArray4957[arg0] - i_132_) * i_134_
				>> 16);
	    }
	}
	int i_135_ = anIntArray5004[0];
	int i_136_ = anIntArray5004[1];
	int i_137_ = anIntArray5004[2];
	int i_138_ = anIntArray4996[0];
	int i_139_ = anIntArray4996[1];
	int i_140_ = anIntArray4996[2];
	Class3.aBoolean112 = false;
	if (i_113_ == 3) {
	    if (i_135_ < 0 || i_136_ < 0 || i_137_ < 0
		|| i_135_ > Class3.anInt109 || i_136_ > Class3.anInt109
		|| i_137_ > Class3.anInt109)
		Class3.aBoolean112 = true;
	    if (aShortArray4984 == null || aShortArray4984[arg0] == -1) {
		if (anIntArray4965[arg0] == -1)
		    Class3.method107(i_138_, i_139_, i_140_, i_135_, i_136_,
				     i_137_,
				     (Class3.anIntArray119
				      [anIntArray4957[arg0]]));
		else
		    Class3.method104(i_138_, i_139_, i_140_, i_135_, i_136_,
				     i_137_, anIntArray5008[0],
				     anIntArray5008[1], anIntArray5008[2]);
	    } else {
		int i_141_;
		int i_142_;
		int i_143_;
		if (aByteArray4971 != null && aByteArray4971[arg0] != -1) {
		    int i_144_ = aByteArray4971[arg0] & 0xff;
		    i_141_ = anIntArray4960[i_144_];
		    i_142_ = anIntArray4981[i_144_];
		    i_143_ = anIntArray4964[i_144_];
		} else {
		    i_141_ = i_114_;
		    i_142_ = i_115_;
		    i_143_ = i_116_;
		}
		if (anIntArray4965[arg0] == -1)
		    Class3.method98(i_138_, i_139_, i_140_, i_135_, i_136_,
				    i_137_, anIntArray4957[arg0],
				    anIntArray4957[arg0], anIntArray4957[arg0],
				    anIntArray4993[i_141_],
				    anIntArray4993[i_142_],
				    anIntArray4993[i_143_],
				    anIntArray4997[i_141_],
				    anIntArray4997[i_142_],
				    anIntArray4997[i_143_],
				    anIntArray4987[i_141_],
				    anIntArray4987[i_142_],
				    anIntArray4987[i_143_],
				    aShortArray4984[arg0]);
		else
		    Class3.method98(i_138_, i_139_, i_140_, i_135_, i_136_,
				    i_137_, anIntArray5008[0],
				    anIntArray5008[1], anIntArray5008[2],
				    anIntArray4993[i_141_],
				    anIntArray4993[i_142_],
				    anIntArray4993[i_143_],
				    anIntArray4997[i_141_],
				    anIntArray4997[i_142_],
				    anIntArray4997[i_143_],
				    anIntArray4987[i_141_],
				    anIntArray4987[i_142_],
				    anIntArray4987[i_143_],
				    aShortArray4984[arg0]);
	    }
	}
	if (i_113_ == 4) {
	    if (i_135_ < 0 || i_136_ < 0 || i_137_ < 0
		|| i_135_ > Class3.anInt109 || i_136_ > Class3.anInt109
		|| i_137_ > Class3.anInt109 || anIntArray5004[3] < 0
		|| anIntArray5004[3] > Class3.anInt109)
		Class3.aBoolean112 = true;
	    if (aShortArray4984 == null || aShortArray4984[arg0] == -1) {
		if (anIntArray4965[arg0] == -1) {
		    int i_145_ = Class3.anIntArray119[anIntArray4957[arg0]];
		    Class3.method107(i_138_, i_139_, i_140_, i_135_, i_136_,
				     i_137_, i_145_);
		    Class3.method107(i_138_, i_140_, anIntArray4996[3], i_135_,
				     i_137_, anIntArray5004[3], i_145_);
		} else {
		    Class3.method104(i_138_, i_139_, i_140_, i_135_, i_136_,
				     i_137_, anIntArray5008[0],
				     anIntArray5008[1], anIntArray5008[2]);
		    Class3.method104(i_138_, i_140_, anIntArray4996[3], i_135_,
				     i_137_, anIntArray5004[3],
				     anIntArray5008[0], anIntArray5008[2],
				     anIntArray5008[3]);
		}
	    } else {
		int i_146_;
		int i_147_;
		int i_148_;
		if (aByteArray4971 != null && aByteArray4971[arg0] != -1) {
		    int i_149_ = aByteArray4971[arg0] & 0xff;
		    i_146_ = anIntArray4960[i_149_];
		    i_147_ = anIntArray4981[i_149_];
		    i_148_ = anIntArray4964[i_149_];
		} else {
		    i_146_ = i_114_;
		    i_147_ = i_115_;
		    i_148_ = i_116_;
		}
		short i_150_ = aShortArray4984[arg0];
		if (anIntArray4965[arg0] == -1) {
		    Class3.method98(i_138_, i_139_, i_140_, i_135_, i_136_,
				    i_137_, anIntArray4957[arg0],
				    anIntArray4957[arg0], anIntArray4957[arg0],
				    anIntArray4993[i_146_],
				    anIntArray4993[i_147_],
				    anIntArray4993[i_148_],
				    anIntArray4997[i_146_],
				    anIntArray4997[i_147_],
				    anIntArray4997[i_148_],
				    anIntArray4987[i_146_],
				    anIntArray4987[i_147_],
				    anIntArray4987[i_148_], i_150_);
		    Class3.method98(i_138_, i_140_, anIntArray4996[3], i_135_,
				    i_137_, anIntArray5004[3],
				    anIntArray4957[arg0], anIntArray4957[arg0],
				    anIntArray4957[arg0],
				    anIntArray4993[i_146_],
				    anIntArray4993[i_147_],
				    anIntArray4993[i_148_],
				    anIntArray4997[i_146_],
				    anIntArray4997[i_147_],
				    anIntArray4997[i_148_],
				    anIntArray4987[i_146_],
				    anIntArray4987[i_147_],
				    anIntArray4987[i_148_], i_150_);
		} else {
		    Class3.method98(i_138_, i_139_, i_140_, i_135_, i_136_,
				    i_137_, anIntArray5008[0],
				    anIntArray5008[1], anIntArray5008[2],
				    anIntArray4993[i_146_],
				    anIntArray4993[i_147_],
				    anIntArray4993[i_148_],
				    anIntArray4997[i_146_],
				    anIntArray4997[i_147_],
				    anIntArray4997[i_148_],
				    anIntArray4987[i_146_],
				    anIntArray4987[i_147_],
				    anIntArray4987[i_148_], i_150_);
		    Class3.method98(i_138_, i_140_, anIntArray4996[3], i_135_,
				    i_137_, anIntArray5004[3],
				    anIntArray5008[0], anIntArray5008[2],
				    anIntArray5008[3], anIntArray4993[i_146_],
				    anIntArray4993[i_147_],
				    anIntArray4993[i_148_],
				    anIntArray4997[i_146_],
				    anIntArray4997[i_147_],
				    anIntArray4997[i_148_],
				    anIntArray4987[i_146_],
				    anIntArray4987[i_147_],
				    anIntArray4987[i_148_], i_150_);
		}
	    }
	}
    }
    
    public void method1861(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_151_ = Class3.anIntArray111[arg0];
	for (int i_152_ = 0; i_152_ < anInt4955; i_152_++) {
	    int i_153_
		= (anIntArray4958[i_152_] * i_151_ - anIntArray4969[i_152_] * i
		   >> 16);
	    anIntArray4969[i_152_]
		= (anIntArray4958[i_152_] * i + anIntArray4969[i_152_] * i_151_
		   >> 16);
	    anIntArray4958[i_152_] = i_153_;
	}
	aBoolean4974 = false;
    }
    
    public void method1858(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_154_ = Class3.anIntArray111[arg0];
	for (int i_155_ = 0; i_155_ < anInt4955; i_155_++) {
	    int i_156_
		= (anIntArray4958[i_155_] * i + anIntArray4962[i_155_] * i_154_
		   >> 16);
	    anIntArray4958[i_155_]
		= (anIntArray4958[i_155_] * i_154_ - anIntArray4962[i_155_] * i
		   >> 16);
	    anIntArray4962[i_155_] = i_156_;
	}
	aBoolean4974 = false;
    }
    
    public void method1883(int arg0) {
	if (aBooleanArray5002[arg0])
	    method1882(arg0);
	else {
	    int i = anIntArray4968[arg0];
	    int i_157_ = anIntArray4956[arg0];
	    int i_158_ = anIntArray4972[arg0];
	    Class3.aBoolean112 = aBooleanArray4988[arg0];
	    if (aByteArray4983 == null)
		Class3.anInt116 = 0;
	    else
		Class3.anInt116 = aByteArray4983[arg0] & 0xff;
	    if (aShortArray4984 == null || aShortArray4984[arg0] == -1) {
		if (anIntArray4965[arg0] == -1)
		    Class3.method107(anIntArray4992[i], anIntArray4992[i_157_],
				     anIntArray4992[i_158_], anIntArray5006[i],
				     anIntArray5006[i_157_],
				     anIntArray5006[i_158_],
				     (Class3.anIntArray119
				      [anIntArray4957[arg0]]));
		else
		    Class3.method104(anIntArray4992[i], anIntArray4992[i_157_],
				     anIntArray4992[i_158_], anIntArray5006[i],
				     anIntArray5006[i_157_],
				     anIntArray5006[i_158_],
				     anIntArray4957[arg0],
				     anIntArray4978[arg0],
				     anIntArray4965[arg0]);
	    } else {
		int i_159_;
		int i_160_;
		int i_161_;
		if (aByteArray4971 != null && aByteArray4971[arg0] != -1) {
		    int i_162_ = aByteArray4971[arg0] & 0xff;
		    i_159_ = anIntArray4960[i_162_];
		    i_160_ = anIntArray4981[i_162_];
		    i_161_ = anIntArray4964[i_162_];
		} else {
		    i_159_ = i;
		    i_160_ = i_157_;
		    i_161_ = i_158_;
		}
		if (anIntArray4965[arg0] == -1)
		    Class3.method98
			(anIntArray4992[i], anIntArray4992[i_157_],
			 anIntArray4992[i_158_], anIntArray5006[i],
			 anIntArray5006[i_157_], anIntArray5006[i_158_],
			 anIntArray4957[arg0], anIntArray4957[arg0],
			 anIntArray4957[arg0], anIntArray4993[i_159_],
			 anIntArray4993[i_160_], anIntArray4993[i_161_],
			 anIntArray4997[i_159_], anIntArray4997[i_160_],
			 anIntArray4997[i_161_], anIntArray4987[i_159_],
			 anIntArray4987[i_160_], anIntArray4987[i_161_],
			 aShortArray4984[arg0]);
		else
		    Class3.method98
			(anIntArray4992[i], anIntArray4992[i_157_],
			 anIntArray4992[i_158_], anIntArray5006[i],
			 anIntArray5006[i_157_], anIntArray5006[i_158_],
			 anIntArray4957[arg0], anIntArray4978[arg0],
			 anIntArray4965[arg0], anIntArray4993[i_159_],
			 anIntArray4993[i_160_], anIntArray4993[i_161_],
			 anIntArray4997[i_159_], anIntArray4997[i_160_],
			 anIntArray4997[i_161_], anIntArray4987[i_159_],
			 anIntArray4987[i_160_], anIntArray4987[i_161_],
			 aShortArray4984[arg0]);
	    }
	}
    }
    
    public void method1884(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 == 0) {
	    int i = 0;
	    anInt5003 = 0;
	    anInt4998 = 0;
	    anInt4995 = 0;
	    for (int i_163_ = 0; i_163_ < anInt4955; i_163_++) {
		anInt5003 += anIntArray4962[i_163_];
		anInt4998 += anIntArray4958[i_163_];
		anInt4995 += anIntArray4969[i_163_];
		i++;
	    }
	    if (i > 0) {
		anInt5003 = anInt5003 / i + arg1;
		anInt4998 = anInt4998 / i + arg2;
		anInt4995 = anInt4995 / i + arg3;
	    } else {
		anInt5003 = arg1;
		anInt4998 = arg2;
		anInt4995 = arg3;
	    }
	} else if (arg0 == 1) {
	    for (int i = 0; i < anInt4955; i++) {
		anIntArray4962[i] += arg1;
		anIntArray4958[i] += arg2;
		anIntArray4969[i] += arg3;
	    }
	} else if (arg0 == 2) {
	    for (int i = 0; i < anInt4955; i++) {
		anIntArray4962[i] -= anInt5003;
		anIntArray4958[i] -= anInt4998;
		anIntArray4969[i] -= anInt4995;
		if (arg3 != 0) {
		    int i_164_ = Class3.anIntArray108[arg3];
		    int i_165_ = Class3.anIntArray111[arg3];
		    int i_166_ = ((anIntArray4958[i] * i_164_
				   + anIntArray4962[i] * i_165_ + 32767)
				  >> 16);
		    anIntArray4958[i]
			= (anIntArray4958[i] * i_165_
			   - anIntArray4962[i] * i_164_ + 32767) >> 16;
		    anIntArray4962[i] = i_166_;
		}
		if (arg1 != 0) {
		    int i_167_ = Class3.anIntArray108[arg1];
		    int i_168_ = Class3.anIntArray111[arg1];
		    int i_169_ = ((anIntArray4958[i] * i_168_
				   - anIntArray4969[i] * i_167_ + 32767)
				  >> 16);
		    anIntArray4969[i]
			= (anIntArray4958[i] * i_167_
			   + anIntArray4969[i] * i_168_ + 32767) >> 16;
		    anIntArray4958[i] = i_169_;
		}
		if (arg2 != 0) {
		    int i_170_ = Class3.anIntArray108[arg2];
		    int i_171_ = Class3.anIntArray111[arg2];
		    int i_172_ = ((anIntArray4969[i] * i_170_
				   + anIntArray4962[i] * i_171_ + 32767)
				  >> 16);
		    anIntArray4969[i]
			= (anIntArray4969[i] * i_171_
			   - anIntArray4962[i] * i_170_ + 32767) >> 16;
		    anIntArray4962[i] = i_172_;
		}
		anIntArray4962[i] += anInt5003;
		anIntArray4958[i] += anInt4998;
		anIntArray4969[i] += anInt4995;
	    }
	} else if (arg0 == 3) {
	    for (int i = 0; i < anInt4955; i++) {
		anIntArray4962[i] -= anInt5003;
		anIntArray4958[i] -= anInt4998;
		anIntArray4969[i] -= anInt4995;
		anIntArray4962[i] = anIntArray4962[i] * arg1 / 128;
		anIntArray4958[i] = anIntArray4958[i] * arg2 / 128;
		anIntArray4969[i] = anIntArray4969[i] * arg3 / 128;
		anIntArray4962[i] += anInt5003;
		anIntArray4958[i] += anInt4998;
		anIntArray4969[i] += anInt4995;
	    }
	} else if (arg0 == 5) {
	    for (int i = 0; i < anInt4982; i++) {
		int i_173_ = (aByteArray4983[i] & 0xff) + arg1 * 8;
		if (i_173_ < 0)
		    i_173_ = 0;
		else if (i_173_ > 255)
		    i_173_ = 255;
		aByteArray4983[i] = (byte) i_173_;
	    }
	}
    }
    
    public int method1865() {
	if (!aBoolean4974)
	    method1876();
	return aShort4970;
    }
    
    public void method1885(int arg0, int[] arg1, int arg2, int arg3,
			   int arg4) {
	int i = arg1.length;
	if (arg0 == 0) {
	    int i_174_ = 0;
	    anInt5003 = 0;
	    anInt4998 = 0;
	    anInt4995 = 0;
	    for (int i_175_ = 0; i_175_ < i; i_175_++) {
		int i_176_ = arg1[i_175_];
		if (i_176_ < anIntArrayArray4959.length) {
		    int[] is = anIntArrayArray4959[i_176_];
		    for (int i_177_ = 0; i_177_ < is.length; i_177_++) {
			int i_178_ = is[i_177_];
			anInt5003 += anIntArray4962[i_178_];
			anInt4998 += anIntArray4958[i_178_];
			anInt4995 += anIntArray4969[i_178_];
			i_174_++;
		    }
		}
	    }
	    if (i_174_ > 0) {
		anInt5003 = anInt5003 / i_174_ + arg2;
		anInt4998 = anInt4998 / i_174_ + arg3;
		anInt4995 = anInt4995 / i_174_ + arg4;
	    } else {
		anInt5003 = arg2;
		anInt4998 = arg3;
		anInt4995 = arg4;
	    }
	} else if (arg0 == 1) {
	    for (int i_179_ = 0; i_179_ < i; i_179_++) {
		int i_180_ = arg1[i_179_];
		if (i_180_ < anIntArrayArray4959.length) {
		    int[] is = anIntArrayArray4959[i_180_];
		    for (int i_181_ = 0; i_181_ < is.length; i_181_++) {
			int i_182_ = is[i_181_];
			anIntArray4962[i_182_] += arg2;
			anIntArray4958[i_182_] += arg3;
			anIntArray4969[i_182_] += arg4;
		    }
		}
	    }
	} else if (arg0 == 2) {
	    for (int i_183_ = 0; i_183_ < i; i_183_++) {
		int i_184_ = arg1[i_183_];
		if (i_184_ < anIntArrayArray4959.length) {
		    int[] is = anIntArrayArray4959[i_184_];
		    for (int i_185_ = 0; i_185_ < is.length; i_185_++) {
			int i_186_ = is[i_185_];
			anIntArray4962[i_186_] -= anInt5003;
			anIntArray4958[i_186_] -= anInt4998;
			anIntArray4969[i_186_] -= anInt4995;
			if (arg4 != 0) {
			    int i_187_ = Class3.anIntArray108[arg4];
			    int i_188_ = Class3.anIntArray111[arg4];
			    int i_189_
				= ((anIntArray4958[i_186_] * i_187_
				    + anIntArray4962[i_186_] * i_188_ + 32767)
				   >> 16);
			    anIntArray4958[i_186_]
				= ((anIntArray4958[i_186_] * i_188_
				    - anIntArray4962[i_186_] * i_187_ + 32767)
				   >> 16);
			    anIntArray4962[i_186_] = i_189_;
			}
			if (arg2 != 0) {
			    int i_190_ = Class3.anIntArray108[arg2];
			    int i_191_ = Class3.anIntArray111[arg2];
			    int i_192_
				= ((anIntArray4958[i_186_] * i_191_
				    - anIntArray4969[i_186_] * i_190_ + 32767)
				   >> 16);
			    anIntArray4969[i_186_]
				= ((anIntArray4958[i_186_] * i_190_
				    + anIntArray4969[i_186_] * i_191_ + 32767)
				   >> 16);
			    anIntArray4958[i_186_] = i_192_;
			}
			if (arg3 != 0) {
			    int i_193_ = Class3.anIntArray108[arg3];
			    int i_194_ = Class3.anIntArray111[arg3];
			    int i_195_
				= ((anIntArray4969[i_186_] * i_193_
				    + anIntArray4962[i_186_] * i_194_ + 32767)
				   >> 16);
			    anIntArray4969[i_186_]
				= ((anIntArray4969[i_186_] * i_194_
				    - anIntArray4962[i_186_] * i_193_ + 32767)
				   >> 16);
			    anIntArray4962[i_186_] = i_195_;
			}
			anIntArray4962[i_186_] += anInt5003;
			anIntArray4958[i_186_] += anInt4998;
			anIntArray4969[i_186_] += anInt4995;
		    }
		}
	    }
	} else if (arg0 == 3) {
	    for (int i_196_ = 0; i_196_ < i; i_196_++) {
		int i_197_ = arg1[i_196_];
		if (i_197_ < anIntArrayArray4959.length) {
		    int[] is = anIntArrayArray4959[i_197_];
		    for (int i_198_ = 0; i_198_ < is.length; i_198_++) {
			int i_199_ = is[i_198_];
			anIntArray4962[i_199_] -= anInt5003;
			anIntArray4958[i_199_] -= anInt4998;
			anIntArray4969[i_199_] -= anInt4995;
			anIntArray4962[i_199_]
			    = anIntArray4962[i_199_] * arg2 / 128;
			anIntArray4958[i_199_]
			    = anIntArray4958[i_199_] * arg3 / 128;
			anIntArray4969[i_199_]
			    = anIntArray4969[i_199_] * arg4 / 128;
			anIntArray4962[i_199_] += anInt5003;
			anIntArray4958[i_199_] += anInt4998;
			anIntArray4969[i_199_] += anInt4995;
		    }
		}
	    }
	} else if (arg0 == 5 && anIntArrayArray4961 != null
		   && aByteArray4983 != null) {
	    for (int i_200_ = 0; i_200_ < i; i_200_++) {
		int i_201_ = arg1[i_200_];
		if (i_201_ < anIntArrayArray4961.length) {
		    int[] is = anIntArrayArray4961[i_201_];
		    for (int i_202_ = 0; i_202_ < is.length; i_202_++) {
			int i_203_ = is[i_202_];
			int i_204_
			    = (aByteArray4983[i_203_] & 0xff) + arg2 * 8;
			if (i_204_ < 0)
			    i_204_ = 0;
			else if (i_204_ > 255)
			    i_204_ = 255;
			aByteArray4983[i_203_] = (byte) i_204_;
		    }
		}
	    }
	}
    }
    
    public int method1866() {
	if (!aBoolean4974)
	    method1876();
	return aShort4963;
    }
    
    public void method1871() {
	for (int i = 0; i < anInt4955; i++) {
	    int i_205_ = anIntArray4962[i];
	    anIntArray4962[i] = anIntArray4969[i];
	    anIntArray4969[i] = -i_205_;
	}
	aBoolean4974 = false;
    }
    
    public Class133_Sub7 method1886(boolean arg0, Class133_Sub7_Sub1 arg1,
				    byte[] arg2) {
	arg1.anInt4955 = anInt4955;
	arg1.anInt4982 = anInt4982;
	arg1.anInt4966 = anInt4966;
	if (arg1.anIntArray4962 == null
	    || arg1.anIntArray4962.length < anInt4955) {
	    arg1.anIntArray4962 = new int[anInt4955 + 100];
	    arg1.anIntArray4958 = new int[anInt4955 + 100];
	    arg1.anIntArray4969 = new int[anInt4955 + 100];
	}
	for (int i = 0; i < anInt4955; i++) {
	    arg1.anIntArray4962[i] = anIntArray4962[i];
	    arg1.anIntArray4958[i] = anIntArray4958[i];
	    arg1.anIntArray4969[i] = anIntArray4969[i];
	}
	if (arg0)
	    arg1.aByteArray4983 = aByteArray4983;
	else {
	    arg1.aByteArray4983 = arg2;
	    if (aByteArray4983 == null) {
		for (int i = 0; i < anInt4982; i++)
		    arg1.aByteArray4983[i] = (byte) 0;
	    } else {
		for (int i = 0; i < anInt4982; i++)
		    arg1.aByteArray4983[i] = aByteArray4983[i];
	    }
	}
	arg1.anIntArray4968 = anIntArray4968;
	arg1.anIntArray4956 = anIntArray4956;
	arg1.anIntArray4972 = anIntArray4972;
	arg1.anIntArray4957 = anIntArray4957;
	arg1.anIntArray4978 = anIntArray4978;
	arg1.anIntArray4965 = anIntArray4965;
	arg1.aByteArray4973 = aByteArray4973;
	arg1.aByteArray4971 = aByteArray4971;
	arg1.aShortArray4984 = aShortArray4984;
	arg1.anIntArray4960 = anIntArray4960;
	arg1.anIntArray4981 = anIntArray4981;
	arg1.anIntArray4964 = anIntArray4964;
	arg1.anIntArrayArray4959 = anIntArrayArray4959;
	arg1.anIntArrayArray4961 = anIntArrayArray4961;
	arg1.aBoolean3687 = aBoolean3687;
	arg1.aBoolean4974 = false;
	return arg1;
    }
    
    public void method1874(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_206_ = Class3.anIntArray111[arg0];
	for (int i_207_ = 0; i_207_ < anInt4955; i_207_++) {
	    int i_208_
		= (anIntArray4969[i_207_] * i + anIntArray4962[i_207_] * i_206_
		   >> 16);
	    anIntArray4969[i_207_]
		= (anIntArray4969[i_207_] * i_206_ - anIntArray4962[i_207_] * i
		   >> 16);
	    anIntArray4962[i_207_] = i_208_;
	}
	aBoolean4974 = false;
    }
    
    public Class133_Sub7_Sub1() {
	anInt4966 = 0;
	anInt4982 = 0;
    }
    
    public Class133_Sub7_Sub1(Class133_Sub2 arg0, int arg1, int arg2, int arg3,
			      int arg4, int arg5) {
	anInt4966 = 0;
	anInt4982 = 0;
	arg0.method1826();
	arg0.method1823();
	anInt4955 = arg0.anInt3521;
	anIntArray4962 = arg0.anIntArray3530;
	anIntArray4958 = arg0.anIntArray3526;
	anIntArray4969 = arg0.anIntArray3510;
	anInt4982 = arg0.anInt3547;
	anIntArray4968 = arg0.anIntArray3549;
	anIntArray4956 = arg0.anIntArray3507;
	anIntArray4972 = arg0.anIntArray3540;
	aByteArray4973 = arg0.aByteArray3546;
	aByteArray4983 = arg0.aByteArray3541;
	anIntArrayArray4959 = arg0.anIntArrayArray3545;
	anIntArrayArray4961 = arg0.anIntArrayArray3509;
	int i = (int) Math.sqrt((double) (arg3 * arg3 + arg4 * arg4
					  + arg5 * arg5));
	int i_209_ = arg2 * i >> 8;
	anIntArray4957 = new int[anInt4982];
	anIntArray4978 = new int[anInt4982];
	anIntArray4965 = new int[anInt4982];
	if (arg0.aShortArray3528 != null) {
	    aShortArray4984 = new short[anInt4982];
	    for (int i_210_ = 0; i_210_ < anInt4982; i_210_++) {
		short i_211_ = arg0.aShortArray3528[i_210_];
		if (i_211_ != -1
		    && Class3.anInterface3_117.method13(0, i_211_))
		    aShortArray4984[i_210_] = i_211_;
		else
		    aShortArray4984[i_210_] = (short) -1;
	    }
	} else
	    aShortArray4984 = null;
	if (arg0.anInt3544 > 0 && arg0.aByteArray3535 != null) {
	    int[] is = new int[arg0.anInt3544];
	    for (int i_212_ = 0; i_212_ < anInt4982; i_212_++) {
		if (arg0.aByteArray3535[i_212_] != -1)
		    is[arg0.aByteArray3535[i_212_] & 0xff]++;
	    }
	    anInt4966 = 0;
	    for (int i_213_ = 0; i_213_ < arg0.anInt3544; i_213_++) {
		if (is[i_213_] > 0 && arg0.aByteArray3514[i_213_] == 0)
		    anInt4966++;
	    }
	    anIntArray4960 = new int[anInt4966];
	    anIntArray4981 = new int[anInt4966];
	    anIntArray4964 = new int[anInt4966];
	    int i_214_ = 0;
	    for (int i_215_ = 0; i_215_ < arg0.anInt3544; i_215_++) {
		if (is[i_215_] > 0 && arg0.aByteArray3514[i_215_] == 0) {
		    anIntArray4960[i_214_]
			= arg0.aShortArray3520[i_215_] & 0xffff;
		    anIntArray4981[i_214_]
			= arg0.aShortArray3531[i_215_] & 0xffff;
		    anIntArray4964[i_214_]
			= arg0.aShortArray3511[i_215_] & 0xffff;
		    is[i_215_] = i_214_++;
		} else
		    is[i_215_] = -1;
	    }
	    aByteArray4971 = new byte[anInt4982];
	    for (int i_216_ = 0; i_216_ < anInt4982; i_216_++) {
		if (arg0.aByteArray3535[i_216_] != -1) {
		    aByteArray4971[i_216_]
			= (byte) is[arg0.aByteArray3535[i_216_] & 0xff];
		    if (aByteArray4971[i_216_] == -1
			&& aShortArray4984 != null)
			aShortArray4984[i_216_] = (short) -1;
		} else
		    aByteArray4971[i_216_] = (byte) -1;
	    }
	}
	for (int i_217_ = 0; i_217_ < anInt4982; i_217_++) {
	    byte i_218_;
	    if (arg0.aByteArray3534 == null)
		i_218_ = (byte) 0;
	    else
		i_218_ = arg0.aByteArray3534[i_217_];
	    byte i_219_;
	    if (arg0.aByteArray3541 == null)
		i_219_ = (byte) 0;
	    else
		i_219_ = arg0.aByteArray3541[i_217_];
	    short i_220_;
	    if (aShortArray4984 == null)
		i_220_ = (short) -1;
	    else
		i_220_ = aShortArray4984[i_217_];
	    if (i_219_ == -2)
		i_218_ = (byte) 3;
	    if (i_219_ == -1)
		i_218_ = (byte) 2;
	    if (i_220_ == -1) {
		if (i_218_ == 0) {
		    int i_221_ = arg0.aShortArray3533[i_217_] & 0xffff;
		    Class89 class89;
		    if (arg0.aClass89Array3515 != null
			&& (arg0.aClass89Array3515[anIntArray4968[i_217_]]
			    != null))
			class89
			    = arg0.aClass89Array3515[anIntArray4968[i_217_]];
		    else
			class89
			    = arg0.aClass89Array3552[anIntArray4968[i_217_]];
		    int i_222_ = arg1 + ((arg3 * class89.anInt1414
					  + arg4 * class89.anInt1404
					  + arg5 * class89.anInt1406)
					 / (i_209_ * class89.anInt1410));
		    anIntArray4957[i_217_] = method1880(i_221_, i_222_);
		    if (arg0.aClass89Array3515 != null
			&& (arg0.aClass89Array3515[anIntArray4956[i_217_]]
			    != null))
			class89
			    = arg0.aClass89Array3515[anIntArray4956[i_217_]];
		    else
			class89
			    = arg0.aClass89Array3552[anIntArray4956[i_217_]];
		    i_222_ = arg1 + ((arg3 * class89.anInt1414
				      + arg4 * class89.anInt1404
				      + arg5 * class89.anInt1406)
				     / (i_209_ * class89.anInt1410));
		    anIntArray4978[i_217_] = method1880(i_221_, i_222_);
		    if (arg0.aClass89Array3515 != null
			&& (arg0.aClass89Array3515[anIntArray4972[i_217_]]
			    != null))
			class89
			    = arg0.aClass89Array3515[anIntArray4972[i_217_]];
		    else
			class89
			    = arg0.aClass89Array3552[anIntArray4972[i_217_]];
		    i_222_ = arg1 + ((arg3 * class89.anInt1414
				      + arg4 * class89.anInt1404
				      + arg5 * class89.anInt1406)
				     / (i_209_ * class89.anInt1410));
		    anIntArray4965[i_217_] = method1880(i_221_, i_222_);
		} else if (i_218_ == 1) {
		    Class138 class138 = arg0.aClass138Array3536[i_217_];
		    int i_223_ = arg1 + ((arg3 * class138.anInt2208
					  + arg4 * class138.anInt2217
					  + arg5 * class138.anInt2209)
					 / (i_209_ + i_209_ / 2));
		    anIntArray4957[i_217_]
			= method1880(arg0.aShortArray3533[i_217_] & 0xffff,
				     i_223_);
		    anIntArray4965[i_217_] = -1;
		} else if (i_218_ == 3) {
		    anIntArray4957[i_217_] = 128;
		    anIntArray4965[i_217_] = -1;
		} else
		    anIntArray4965[i_217_] = -2;
	    } else if (i_218_ == 0) {
		Class89 class89;
		if (arg0.aClass89Array3515 != null
		    && arg0.aClass89Array3515[anIntArray4968[i_217_]] != null)
		    class89 = arg0.aClass89Array3515[anIntArray4968[i_217_]];
		else
		    class89 = arg0.aClass89Array3552[anIntArray4968[i_217_]];
		int i_224_ = arg1 + ((arg3 * class89.anInt1414
				      + arg4 * class89.anInt1404
				      + arg5 * class89.anInt1406)
				     / (i_209_ * class89.anInt1410));
		anIntArray4957[i_217_] = method1881(i_224_);
		if (arg0.aClass89Array3515 != null
		    && arg0.aClass89Array3515[anIntArray4956[i_217_]] != null)
		    class89 = arg0.aClass89Array3515[anIntArray4956[i_217_]];
		else
		    class89 = arg0.aClass89Array3552[anIntArray4956[i_217_]];
		i_224_ = arg1 + ((arg3 * class89.anInt1414
				  + arg4 * class89.anInt1404
				  + arg5 * class89.anInt1406)
				 / (i_209_ * class89.anInt1410));
		anIntArray4978[i_217_] = method1881(i_224_);
		if (arg0.aClass89Array3515 != null
		    && arg0.aClass89Array3515[anIntArray4972[i_217_]] != null)
		    class89 = arg0.aClass89Array3515[anIntArray4972[i_217_]];
		else
		    class89 = arg0.aClass89Array3552[anIntArray4972[i_217_]];
		i_224_ = arg1 + ((arg3 * class89.anInt1414
				  + arg4 * class89.anInt1404
				  + arg5 * class89.anInt1406)
				 / (i_209_ * class89.anInt1410));
		anIntArray4965[i_217_] = method1881(i_224_);
	    } else if (i_218_ == 1) {
		Class138 class138 = arg0.aClass138Array3536[i_217_];
		int i_225_ = arg1 + ((arg3 * class138.anInt2208
				      + arg4 * class138.anInt2217
				      + arg5 * class138.anInt2209)
				     / (i_209_ + i_209_ / 2));
		anIntArray4957[i_217_] = method1881(i_225_);
		anIntArray4965[i_217_] = -1;
	    } else
		anIntArray4965[i_217_] = -2;
	}
    }
    
    static {
	aClass133_Sub7_Sub1_4985 = new Class133_Sub7_Sub1();
	anIntArray4993 = new int[4096];
	aBooleanArray4988 = new boolean[4096];
	anIntArray4992 = new int[4096];
	aByteArray4991 = new byte[1];
	anIntArray4987 = new int[4096];
	anIntArray4994 = new int[4096];
	aBooleanArray5002 = new boolean[4096];
	anIntArray5005 = new int[4096];
	anIntArray4989 = new int[4096];
	anIntArray5004 = new int[10];
	anIntArray5000 = new int[4096];
	anIntArray5006 = new int[4096];
	anIntArrayArray4999 = new int[12][4096];
	anIntArray5007 = new int[4096];
	anIntArray5008 = new int[10];
	anIntArray4990 = new int[12];
	anIntArray5001 = new int[12];
	anIntArray4997 = new int[4096];
	anIntArray4996 = new int[10];
    }
}
