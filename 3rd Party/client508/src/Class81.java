/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class81
{
    public static int anInt1314;
    public static int anInt1315;
    public static int anInt1316;
    public static int anInt1317;
    public static Class124 aClass124_1318
	= Class14_Sub2_Sub2.method263(1178, "sl_back");
    public static int anInt1319;
    public static int anInt1320;
    public static int anInt1321;
    public static int anInt1322;
    public Class14_Sub2 aClass14_Sub2_1323 = new Class14_Sub2();
    public static int anInt1324;
    public Class14_Sub2 aClass14_Sub2_1325;
    public static Class124 aClass124_1326;
    public static int anInt1327;
    public static Class31 aClass31_1328;
    
    public void method1394(Class14_Sub2 arg0, byte arg1) {
	try {
	    if (arg1 != -78)
		method1399(-127, -29, 91, (byte) -107, -81);
	    anInt1327++;
	    if (arg0.aClass14_Sub2_2728 != null)
		arg0.method246(-26366);
	    arg0.aClass14_Sub2_2728 = aClass14_Sub2_1323;
	    arg0.aClass14_Sub2_2738 = aClass14_Sub2_1323.aClass14_Sub2_2738;
	    arg0.aClass14_Sub2_2728.aClass14_Sub2_2738 = arg0;
	    arg0.aClass14_Sub2_2738.aClass14_Sub2_2728 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lk.J("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method1395(byte arg0) {
	try {
	    anInt1320++;
	    for (;;) {
		Class14_Sub2 class14_sub2
		    = aClass14_Sub2_1323.aClass14_Sub2_2738;
		if (aClass14_Sub2_1323 == class14_sub2)
		    break;
		class14_sub2.method246(-26366);
	    }
	    aClass14_Sub2_1325 = null;
	    int i = -127 % ((arg0 - 77) / 39);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lk.E(" + arg0 + ')');
	}
    }
    
    public static boolean method1396(int arg0, int arg1) {
	boolean bool;
	try {
	    anInt1322++;
	    int i = 105 / ((-61 - arg0) / 32);
	    bool = 0 != (0x1 & arg1 >> -1937322529);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lk.H(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public Class14_Sub2 method1397(int arg0) {
    while_963_:
	do {
	    Class14_Sub2 class14_sub2;
	    do {
		Class14_Sub2 class14_sub2_0_;
		try {
		    anInt1317++;
		    class14_sub2 = aClass14_Sub2_1323.aClass14_Sub2_2738;
		    if (arg0 != -3)
			method1400((byte) -5);
		    if (aClass14_Sub2_1323 != class14_sub2)
			break;
		    class14_sub2_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_963_;
		}
		return class14_sub2_0_;
	    } while (false);
	    Class14_Sub2 class14_sub2_1_;
	    try {
		class14_sub2.method246(-26366);
		class14_sub2_1_ = class14_sub2;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "lk.I(" + arg0 + ')');
    }
    
    public static Class14_Sub27[] method1398
	(int[][] arg0, byte[][] arg1, int arg2, byte[][] arg3, byte[][] arg4,
	 int arg5, float[][] arg6, float[][] arg7, int[][] arg8,
	 byte[][][] arg9, float[][] arg10, byte[][] arg11) {
	Class14_Sub27[] class14_sub27s;
	try {
	    anInt1316++;
	    Class55 class55 = new Class55(128);
	    for (int i = 1; -103 <= (i ^ 0xffffffff); i++) {
		for (int i_2_ = 1; (i_2_ ^ 0xffffffff) >= -103; i_2_++) {
		    int i_3_ = 0xff & arg11[i][i_2_];
		    int i_4_ = arg3[i][i_2_] & 0xff;
		    if ((i_4_ ^ 0xffffffff) != -1) {
			Class150 class150
			    = Class97.method1489(-1 + i_4_, -9810);
			if (0 == (class150.anInt2411 ^ 0xffffffff))
			    continue;
			Class14_Sub27 class14_sub27
			    = Class39.method1122(class55, -91, class150);
			int i_5_ = arg4[i][i_2_];
			int[] is = Class19.anIntArrayArray2545[i_5_];
			class14_sub27.anInt3181 += is.length / 2;
			class14_sub27.anInt3180++;
			if (class150.aBoolean2409 && -1 != (i_3_ ^ 0xffffffff))
			    class14_sub27.anInt3181
				+= Class14_Sub2.anIntArray2731[i_5_];
		    }
		    if (0 != (0xff & arg11[i][i_2_])
			|| 0 != i_4_ && -1 == (arg4[i][i_2_] ^ 0xffffffff)) {
			int i_6_ = 0;
			int i_7_ = 0;
			int[] is = new int[8];
			int i_8_ = 0;
			int i_9_ = 0;
			int i_10_ = 0xff & arg3[i][i_2_ + 1];
			int i_11_ = 0xff & arg3[i - 1][i_2_];
			int i_12_ = 0;
			int i_13_ = arg3[i][-1 + i_2_] & 0xff;
			int i_14_ = arg3[i + 1][i_2_] & 0xff;
			int i_15_ = arg3[-1 + i][1 + i_2_] & 0xff;
			int i_16_ = 0xff & arg3[i - 1][i_2_ + -1];
			int i_17_ = arg3[i - -1][i_2_ + -1] & 0xff;
			int i_18_ = 0xff & arg3[1 + i][i_2_ - -1];
			if (0 != i_15_ && i_15_ != i_4_) {
			    Class150 class150
				= Class97.method1489(i_15_ + -1,
						     arg2 ^ ~0x2655);
			    if (!class150.aBoolean2409
				|| 0 == (class150.anInt2411 ^ 0xffffffff)) {
				boolean bool = false;
			    } else {
				int i_19_ = arg1[-1 + i][i_2_ - -1];
				int i_20_ = arg4[-1 + i][1 + i_2_];
				int i_21_ = (Class70.anIntArray1082
					     [(0x3 & 3 + i_19_) + i_20_ * 4]);
				int i_22_ = (Class70.anIntArray1082
					     [(i_19_ + 2 & 0x3) + 4 * i_20_]);
				if (Class95.aBooleanArrayArray1623[i_21_][1]
				    && (Class95.aBooleanArrayArray1623[i_22_]
					[0])) {
				    boolean bool = false;
				} else {
				    for (int i_23_ = 0; 8 > i_23_; i_23_++) {
					if ((i_6_ ^ 0xffffffff)
					    == (i_23_ ^ 0xffffffff)) {
					    is[i_6_++] = i_15_;
					    break;
					}
					if (i_15_ == is[i_23_])
					    break;
				    }
				}
			    }
			} else {
			    boolean bool = false;
			}
			if ((i_16_ ^ 0xffffffff) == -1
			    || (i_4_ ^ 0xffffffff) == (i_16_ ^ 0xffffffff)) {
			    boolean bool = false;
			} else {
			    Class150 class150
				= Class97.method1489(-1 + i_16_, arg2 + -9814);
			    if (!class150.aBoolean2409
				|| class150.anInt2411 == -1) {
				boolean bool = false;
			    } else {
				int i_24_ = arg1[-1 + i][-1 + i_2_];
				int i_25_ = arg4[-1 + i][i_2_ + -1];
				int i_26_ = (Class70.anIntArray1082
					     [4 * i_25_ + (0x3 & i_24_)]);
				int i_27_ = (Class70.anIntArray1082
					     [(i_24_ - -3 & 0x3) + 4 * i_25_]);
				if (!Class95.aBooleanArrayArray1623[i_26_][1]
				    || !(Class95.aBooleanArrayArray1623[i_27_]
					 [0])) {
				    for (int i_28_ = 0;
					 (i_28_ ^ 0xffffffff) > -9; i_28_++) {
					if ((i_28_ ^ 0xffffffff)
					    == (i_6_ ^ 0xffffffff)) {
					    is[i_6_++] = i_16_;
					    break;
					}
					if (i_16_ == is[i_28_])
					    break;
				    }
				} else {
				    boolean bool = false;
				}
			    }
			}
			if (0 == i_17_
			    || (i_4_ ^ 0xffffffff) == (i_17_ ^ 0xffffffff)) {
			    boolean bool = false;
			} else {
			    Class150 class150
				= Class97.method1489(-1 + i_17_, arg2 + -9814);
			    if (!class150.aBoolean2409
				|| (class150.anInt2411 ^ 0xffffffff) == 0) {
				boolean bool = false;
			    } else {
				int i_29_ = arg1[1 + i][-1 + i_2_];
				int i_30_ = arg4[i - -1][-1 + i_2_];
				int i_31_ = (Class70.anIntArray1082
					     [4 * i_30_ - -(0x3 & i_29_)]);
				int i_32_ = (Class70.anIntArray1082
					     [(1 + i_29_ & 0x3) + i_30_ * 4]);
				if (Class95.aBooleanArrayArray1623[i_32_][1]
				    && (Class95.aBooleanArrayArray1623[i_31_]
					[0])) {
				    boolean bool = false;
				} else {
				    for (int i_33_ = 0;
					 -9 < (i_33_ ^ 0xffffffff); i_33_++) {
					if ((i_33_ ^ 0xffffffff)
					    == (i_6_ ^ 0xffffffff)) {
					    is[i_6_++] = i_17_;
					    break;
					}
					if ((is[i_33_] ^ 0xffffffff)
					    == (i_17_ ^ 0xffffffff))
					    break;
				    }
				}
			    }
			}
			if (0 != i_18_
			    && (i_18_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(-1 + i_18_,
						     arg2 ^ ~0x2655);
			    if (class150.aBoolean2409
				&& -1 != class150.anInt2411) {
				int i_34_ = arg4[i - -1][1 + i_2_];
				int i_35_ = arg1[i + 1][1 + i_2_];
				int i_36_ = (Class70.anIntArray1082
					     [(i_35_ - -2 & 0x3) + i_34_ * 4]);
				int i_37_ = (Class70.anIntArray1082
					     [(0x3 & i_35_ + 1) + i_34_ * 4]);
				if (Class95.aBooleanArrayArray1623[i_36_][1]
				    && (Class95.aBooleanArrayArray1623[i_37_]
					[0])) {
				    boolean bool = false;
				} else {
				    for (int i_38_ = 0; 8 > i_38_; i_38_++) {
					if ((i_6_ ^ 0xffffffff)
					    == (i_38_ ^ 0xffffffff)) {
					    is[i_6_++] = i_18_;
					    break;
					}
					if (is[i_38_] == i_18_)
					    break;
				    }
				}
			    } else {
				boolean bool = false;
			    }
			} else {
			    boolean bool = false;
			}
			if (i_10_ != 0 && i_4_ != i_10_) {
			    Class150 class150
				= Class97.method1489(i_10_ - 1, -9810);
			    if (class150.aBoolean2409
				&& -1 != class150.anInt2411) {
				i_7_ = (Class70.anIntArray1082
					[(arg4[i][1 + i_2_] * 4
					  + (arg1[i][i_2_ - -1] - -2 & 0x3))]);
				for (int i_39_ = 0; i_39_ < 8; i_39_++) {
				    if (i_39_ == i_6_) {
					is[i_6_++] = i_10_;
					break;
				    }
				    if ((i_10_ ^ 0xffffffff)
					== (is[i_39_] ^ 0xffffffff))
					break;
				}
			    }
			}
			if ((i_11_ ^ 0xffffffff) != -1
			    && (i_4_ ^ 0xffffffff) != (i_11_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(-1 + i_11_, -9810);
			    if (class150.aBoolean2409
				&& (class150.anInt2411 ^ 0xffffffff) != 0) {
				i_8_ = (Class70.anIntArray1082
					[((arg1[-1 + i][i_2_] + 3 & 0x3)
					  + 4 * arg4[-1 + i][i_2_])]);
				for (int i_40_ = 0; (i_40_ ^ 0xffffffff) > -9;
				     i_40_++) {
				    if ((i_6_ ^ 0xffffffff)
					== (i_40_ ^ 0xffffffff)) {
					is[i_6_++] = i_11_;
					break;
				    }
				    if ((i_11_ ^ 0xffffffff)
					== (is[i_40_] ^ 0xffffffff))
					break;
				}
			    }
			}
			if (i_13_ != 0 && i_4_ != i_13_) {
			    Class150 class150
				= Class97.method1489(i_13_ + -1, -9810);
			    if (class150.aBoolean2409
				&& (class150.anInt2411 ^ 0xffffffff) != 0) {
				i_9_ = (Class70.anIntArray1082
					[(4 * arg4[i][-1 + i_2_]
					  - -(0x3 & arg1[i][i_2_ + -1]))]);
				for (int i_41_ = 0; i_41_ < 8; i_41_++) {
				    if ((i_41_ ^ 0xffffffff)
					== (i_6_ ^ 0xffffffff)) {
					is[i_6_++] = i_13_;
					break;
				    }
				    if ((is[i_41_] ^ 0xffffffff)
					== (i_13_ ^ 0xffffffff))
					break;
				}
			    }
			}
			if ((i_14_ ^ 0xffffffff) != -1
			    && (i_14_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(-1 + i_14_, -9810);
			    if (class150.aBoolean2409
				&& (class150.anInt2411 ^ 0xffffffff) != 0) {
				i_12_ = (Class70.anIntArray1082
					 [((0x3 & 1 + arg1[1 + i][i_2_])
					   + 4 * arg4[i - -1][i_2_])]);
				for (int i_42_ = 0; -9 < (i_42_ ^ 0xffffffff);
				     i_42_++) {
				    if ((i_6_ ^ 0xffffffff)
					== (i_42_ ^ 0xffffffff)) {
					is[i_6_++] = i_14_;
					break;
				    }
				    if ((i_14_ ^ 0xffffffff)
					== (is[i_42_] ^ 0xffffffff))
					break;
				}
			    }
			}
			for (int i_43_ = 0;
			     (i_6_ ^ 0xffffffff) < (i_43_ ^ 0xffffffff);
			     i_43_++) {
			    int i_44_ = is[i_43_];
			    boolean[] bools
				= (Class95.aBooleanArrayArray1623
				   [((i_10_ ^ 0xffffffff) == (i_44_
							      ^ 0xffffffff)
				     ? i_7_ : 0)]);
			    boolean[] bools_45_
				= (Class95.aBooleanArrayArray1623
				   [((i_44_ ^ 0xffffffff) == (i_13_
							      ^ 0xffffffff)
				     ? i_9_ : 0)]);
			    boolean[] bools_46_
				= (Class95.aBooleanArrayArray1623
				   [i_11_ == i_44_ ? i_8_ : 0]);
			    boolean[] bools_47_
				= (Class95.aBooleanArrayArray1623
				   [i_44_ != i_14_ ? 0 : i_12_]);
			    Class150 class150
				= Class97.method1489(-1 + i_44_, -9810);
			    Class14_Sub27 class14_sub27
				= Class39.method1122(class55, arg2 + 123,
						     class150);
			    class14_sub27.anInt3181 += 5;
			    class14_sub27.anInt3181 += bools.length + -2;
			    class14_sub27.anInt3181 += bools_46_.length + -2;
			    class14_sub27.anInt3181 += -2 + bools_45_.length;
			    class14_sub27.anInt3181 += bools_47_.length - 2;
			    class14_sub27.anInt3180++;
			}
		    }
		}
	    }
	    for (Class14_Sub27 class14_sub27
		     = (Class14_Sub27) class55.method1228((byte) -53);
		 null != class14_sub27;
		 class14_sub27
		     = (Class14_Sub27) class55.method1227((byte) -23))
		class14_sub27.method924();
	    for (int i = 1; i <= 102; i++) {
		for (int i_48_ = 1; -103 <= (i_48_ ^ 0xffffffff); i_48_++) {
		    int i_49_;
		    if ((0x8 & arg9[arg5][i][i_48_]) == 0) {
			if (-3 != (0x2 & arg9[1][i][i_48_] ^ 0xffffffff)
			    || -1 <= (arg5 ^ 0xffffffff))
			    i_49_ = arg5;
			else
			    i_49_ = -1 + arg5;
		    } else
			i_49_ = 0;
		    int i_50_ = 0xff & arg11[i][i_48_];
		    int i_51_ = 0xff & arg3[i][i_48_];
		    if (0 != i_51_) {
			Class150 class150
			    = Class97.method1489(i_51_ - 1, -9810);
			if (0 == (class150.anInt2411 ^ 0xffffffff))
			    continue;
			Class14_Sub27 class14_sub27
			    = Class39.method1122(class55, arg2 ^ ~0x2e,
						 class150);
			byte i_52_ = arg1[i][i_48_];
			byte i_53_ = arg4[i][i_48_];
			int i_54_
			    = Class141.method1961(arg8[i][i_48_], (byte) 115,
						  class150.anInt2414,
						  class150.anInt2411);
			int i_55_ = Class141.method1961(arg8[i + 1][i_48_],
							(byte) 122,
							class150.anInt2414,
							class150.anInt2411);
			int i_56_
			    = Class141.method1961(arg8[i - -1][1 + i_48_],
						  (byte) 113,
						  class150.anInt2414,
						  class150.anInt2411);
			int i_57_ = Class141.method1961(arg8[i][i_48_ + 1],
							(byte) 107,
							class150.anInt2414,
							class150.anInt2411);
			Class38.method1114(i_56_, i_54_, arg6, arg0,
					   0 != i_50_ && class150.aBoolean2409,
					   class14_sub27, arg10, i, 104, i_55_,
					   arg7, i_52_, i_57_, i_49_, i_53_,
					   i_48_);
		    }
		    if ((arg11[i][i_48_] & 0xff) != 0
			|| (-1 != (i_51_ ^ 0xffffffff)
			    && -1 == (arg4[i][i_48_] ^ 0xffffffff))) {
			int i_58_ = 0;
			int[] is = new int[8];
			int i_59_ = 0;
			int i_60_ = 0;
			int i_61_ = 0;
			int i_62_ = 0;
			int i_63_ = 0xff & arg3[i - 1][i_48_];
			int i_64_ = 0xff & arg3[i][i_48_ - -1];
			int i_65_ = arg3[-1 + i][1 + i_48_] & 0xff;
			int i_66_ = 0xff & arg3[i + -1][-1 + i_48_];
			int i_67_ = arg3[1 + i][i_48_] & 0xff;
			int i_68_ = arg3[i][-1 + i_48_] & 0xff;
			int i_69_ = arg3[i - -1][i_48_ - 1] & 0xff;
			int i_70_ = 0xff & arg3[1 + i][i_48_ + 1];
			if ((i_65_ ^ 0xffffffff) == -1
			    || (i_51_ ^ 0xffffffff) == (i_65_ ^ 0xffffffff))
			    i_65_ = 0;
			else {
			    Class150 class150
				= Class97.method1489(i_65_ + -1, -9810);
			    if (!class150.aBoolean2409
				|| 0 == (class150.anInt2411 ^ 0xffffffff))
				i_65_ = 0;
			    else {
				int i_71_ = arg4[-1 + i][i_48_ + 1];
				int i_72_ = arg1[-1 + i][i_48_ + 1];
				int i_73_ = (Class70.anIntArray1082
					     [(i_72_ - -2 & 0x3) + i_71_ * 4]);
				int i_74_ = (Class70.anIntArray1082
					     [i_71_ * 4 - -(i_72_ + 3 & 0x3)]);
				if (Class95.aBooleanArrayArray1623[i_74_][1]
				    && (Class95.aBooleanArrayArray1623[i_73_]
					[0]))
				    i_65_ = 0;
				else {
				    for (int i_75_ = 0;
					 -9 < (i_75_ ^ 0xffffffff); i_75_++) {
					if ((i_75_ ^ 0xffffffff)
					    == (i_58_ ^ 0xffffffff)) {
					    is[i_58_++] = i_65_;
					    break;
					}
					if ((i_65_ ^ 0xffffffff)
					    == (is[i_75_] ^ 0xffffffff))
					    break;
				    }
				}
			    }
			}
			if (i_66_ == 0
			    || (i_66_ ^ 0xffffffff) == (i_51_ ^ 0xffffffff))
			    i_66_ = 0;
			else {
			    Class150 class150
				= Class97.method1489(-1 + i_66_, -9810);
			    if (!class150.aBoolean2409
				|| 0 == (class150.anInt2411 ^ 0xffffffff))
				i_66_ = 0;
			    else {
				int i_76_ = arg1[-1 + i][-1 + i_48_];
				int i_77_ = arg4[i - 1][i_48_ + -1];
				int i_78_ = (Class70.anIntArray1082
					     [i_77_ * 4 - -(i_76_ & 0x3)]);
				int i_79_ = (Class70.anIntArray1082
					     [(0x3 & i_76_ + 3) + 4 * i_77_]);
				if (Class95.aBooleanArrayArray1623[i_78_][1]
				    && (Class95.aBooleanArrayArray1623[i_79_]
					[0]))
				    i_66_ = 0;
				else {
				    for (int i_80_ = 0; i_80_ < 8; i_80_++) {
					if (i_58_ == i_80_) {
					    is[i_58_++] = i_66_;
					    break;
					}
					if ((is[i_80_] ^ 0xffffffff)
					    == (i_66_ ^ 0xffffffff))
					    break;
				    }
				}
			    }
			}
			if (0 == i_69_ || i_51_ == i_69_)
			    i_69_ = 0;
			else {
			    Class150 class150
				= Class97.method1489(i_69_ - 1, -9810);
			    if (class150.aBoolean2409
				&& 0 != (class150.anInt2411 ^ 0xffffffff)) {
				int i_81_ = arg1[i + 1][-1 + i_48_];
				int i_82_ = arg4[1 + i][-1 + i_48_];
				int i_83_ = (Class70.anIntArray1082
					     [(0x3 & 1 + i_81_) + i_82_ * 4]);
				int i_84_ = (Class70.anIntArray1082
					     [i_82_ * 4 - -(0x3 & i_81_)]);
				if (Class95.aBooleanArrayArray1623[i_83_][1]
				    && (Class95.aBooleanArrayArray1623[i_84_]
					[0]))
				    i_69_ = 0;
				else {
				    for (int i_85_ = 0;
					 -9 < (i_85_ ^ 0xffffffff); i_85_++) {
					if ((i_58_ ^ 0xffffffff)
					    == (i_85_ ^ 0xffffffff)) {
					    is[i_58_++] = i_69_;
					    break;
					}
					if (i_69_ == is[i_85_])
					    break;
				    }
				}
			    } else
				i_69_ = 0;
			}
			if (-1 != (i_70_ ^ 0xffffffff)
			    && (i_51_ ^ 0xffffffff) != (i_70_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(i_70_ + -1, arg2 + -9814);
			    if (!class150.aBoolean2409
				|| 0 == (class150.anInt2411 ^ 0xffffffff))
				i_70_ = 0;
			    else {
				int i_86_ = arg1[1 + i][1 + i_48_];
				int i_87_ = arg4[1 + i][i_48_ - -1];
				int i_88_ = (Class70.anIntArray1082
					     [(0x3 & i_86_ + 2) + i_87_ * 4]);
				int i_89_ = (Class70.anIntArray1082
					     [4 * i_87_ + (1 + i_86_ & 0x3)]);
				if (!Class95.aBooleanArrayArray1623[i_88_][1]
				    || !(Class95.aBooleanArrayArray1623[i_89_]
					 [0])) {
				    for (int i_90_ = 0;
					 -9 < (i_90_ ^ 0xffffffff); i_90_++) {
					if ((i_58_ ^ 0xffffffff)
					    == (i_90_ ^ 0xffffffff)) {
					    is[i_58_++] = i_70_;
					    break;
					}
					if (is[i_90_] == i_70_)
					    break;
				    }
				} else
				    i_70_ = 0;
			    }
			} else
			    i_70_ = 0;
			if (-1 != (i_64_ ^ 0xffffffff)
			    && (i_51_ ^ 0xffffffff) != (i_64_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(-1 + i_64_, arg2 + -9814);
			    if (class150.aBoolean2409
				&& class150.anInt2411 != -1) {
				i_59_ = (Class70.anIntArray1082
					 [((arg1[i][1 + i_48_] + 2 & 0x3)
					   + arg4[i][1 + i_48_] * 4)]);
				for (int i_91_ = 0; -9 < (i_91_ ^ 0xffffffff);
				     i_91_++) {
				    if ((i_91_ ^ 0xffffffff)
					== (i_58_ ^ 0xffffffff)) {
					is[i_58_++] = i_64_;
					break;
				    }
				    if (is[i_91_] == i_64_)
					break;
				}
			    }
			}
			if ((i_63_ ^ 0xffffffff) != -1 && i_51_ != i_63_) {
			    Class150 class150
				= Class97.method1489(-1 + i_63_, -9810);
			    if (class150.aBoolean2409
				&& (class150.anInt2411 ^ 0xffffffff) != 0) {
				i_60_ = (Class70.anIntArray1082
					 [((arg1[i + -1][i_48_] + 3 & 0x3)
					   + 4 * arg4[-1 + i][i_48_])]);
				for (int i_92_ = 0; -9 < (i_92_ ^ 0xffffffff);
				     i_92_++) {
				    if ((i_92_ ^ 0xffffffff)
					== (i_58_ ^ 0xffffffff)) {
					is[i_58_++] = i_63_;
					break;
				    }
				    if ((is[i_92_] ^ 0xffffffff)
					== (i_63_ ^ 0xffffffff))
					break;
				}
			    }
			}
			if (-1 != (i_68_ ^ 0xffffffff)
			    && (i_51_ ^ 0xffffffff) != (i_68_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(-1 + i_68_, -9810);
			    if (class150.aBoolean2409
				&& -1 != class150.anInt2411) {
				i_62_ = (Class70.anIntArray1082
					 [(4 * arg4[i][i_48_ + -1]
					   + (0x3 & arg1[i][i_48_ - 1]))]);
				for (int i_93_ = 0; 8 > i_93_; i_93_++) {
				    if (i_93_ == i_58_) {
					is[i_58_++] = i_68_;
					break;
				    }
				    if ((i_68_ ^ 0xffffffff)
					== (is[i_93_] ^ 0xffffffff))
					break;
				}
			    }
			}
			if ((i_67_ ^ 0xffffffff) != -1
			    && (i_67_ ^ 0xffffffff) != (i_51_ ^ 0xffffffff)) {
			    Class150 class150
				= Class97.method1489(i_67_ - 1, -9810);
			    if (class150.aBoolean2409
				&& (class150.anInt2411 ^ 0xffffffff) != 0) {
				i_61_
				    = (Class70.anIntArray1082
				       [(arg4[i + 1][i_48_] * 4
					 - -(arg1[1 + i][i_48_] + 1 & 0x3))]);
				for (int i_94_ = 0; -9 < (i_94_ ^ 0xffffffff);
				     i_94_++) {
				    if (i_94_ == i_58_) {
					is[i_58_++] = i_67_;
					break;
				    }
				    if (is[i_94_] == i_67_)
					break;
				}
			    }
			}
			for (int i_95_ = 0;
			     (i_95_ ^ 0xffffffff) > (i_58_ ^ 0xffffffff);
			     i_95_++) {
			    int i_96_ = is[i_95_];
			    boolean[] bools = (Class95.aBooleanArrayArray1623
					       [i_64_ != i_96_ ? 0 : i_59_]);
			    boolean[] bools_97_
				= (Class95.aBooleanArrayArray1623
				   [((i_63_ ^ 0xffffffff) == (i_96_
							      ^ 0xffffffff)
				     ? i_60_ : 0)]);
			    boolean[] bools_98_
				= (Class95.aBooleanArrayArray1623
				   [((i_96_ ^ 0xffffffff) != (i_68_
							      ^ 0xffffffff)
				     ? 0 : i_62_)]);
			    boolean[] bools_99_
				= (Class95.aBooleanArrayArray1623
				   [((i_96_ ^ 0xffffffff) != (i_67_
							      ^ 0xffffffff)
				     ? 0 : i_61_)]);
			    Class150 class150
				= Class97.method1489(i_96_ + -1, -9810);
			    Class14_Sub27 class14_sub27
				= Class39.method1122(class55, 102, class150);
			    int i_100_
				= (0xff
				   | (Class141.method1961(arg8[i][i_48_],
							  (byte) 108,
							  class150.anInt2414,
							  class150.anInt2411)
				      << -1774039384));
			    int i_101_
				= (0xff
				   | (Class141.method1961(arg8[i + 1][i_48_],
							  (byte) 113,
							  class150.anInt2414,
							  class150.anInt2411)
				      << 1783229480));
			    int i_102_
				= (0xff
				   | (Class141.method1961((arg8[i - -1]
							   [i_48_ - -1]),
							  (byte) 123,
							  class150.anInt2414,
							  class150.anInt2411)
				      << -103477080));
			    int i_103_ = 6;
			    int i_104_
				= (0xff
				   | (Class141.method1961(arg8[i][1 + i_48_],
							  (byte) 109,
							  class150.anInt2414,
							  class150.anInt2411)
				      << 1318600744));
			    i_103_ += -2 + bools.length;
			    boolean bool
				= i_96_ != i_65_ && bools_97_[0] && bools[1];
			    i_103_ += -2 + bools_97_.length;
			    i_103_ += bools_98_.length + -2;
			    boolean bool_105_
				= ((i_96_ ^ 0xffffffff) != (i_70_ ^ 0xffffffff)
				   && bools[0] && bools_99_[1]);
			    boolean bool_106_ = (i_66_ != i_96_ && bools_98_[0]
						 && bools_97_[1]);
			    i_103_ += -2 + bools_99_.length;
			    int[] is_107_ = new int[i_103_];
			    i_103_ = 0;
			    boolean bool_108_
				= ((i_69_ ^ 0xffffffff) != (i_96_ ^ 0xffffffff)
				   && bools_99_[0] && bools_98_[1]);
			    int i_109_
				= Class14_Sub17.method881(i_104_, i_102_,
							  class14_sub27,
							  (byte) 12, i_101_,
							  i_100_, 0, true,
							  arg10, arg7, 64,
							  i_48_, arg6, null,
							  0.0F, arg0, i, 64);
			    int i_110_
				= Class14_Sub17.method881(i_104_, i_102_,
							  class14_sub27,
							  (byte) 12, i_101_,
							  i_100_, 0, bool,
							  arg10, arg7, 128,
							  i_48_, arg6, null,
							  0.0F, arg0, i, 0);
			    int i_111_
				= Class14_Sub17.method881(i_104_, i_102_,
							  class14_sub27,
							  (byte) 12, i_101_,
							  i_100_, 0, bool_105_,
							  arg10, arg7, 128,
							  i_48_, arg6, null,
							  0.0F, arg0, i, 128);
			    int i_112_
				= Class14_Sub17.method881(i_104_, i_102_,
							  class14_sub27,
							  (byte) 12, i_101_,
							  i_100_, 0, bool_106_,
							  arg10, arg7, 0,
							  i_48_, arg6, null,
							  0.0F, arg0, i, 0);
			    int i_113_
				= Class14_Sub17.method881(i_104_, i_102_,
							  class14_sub27,
							  (byte) 12, i_101_,
							  i_100_, 0, bool_108_,
							  arg10, arg7, 0,
							  i_48_, arg6, null,
							  0.0F, arg0, i, 128);
			    is_107_[i_103_++] = i_109_;
			    is_107_[i_103_++] = i_111_;
			    if (bools.length > 2)
				is_107_[i_103_++]
				    = Class14_Sub17.method881(i_104_, i_102_,
							      class14_sub27,
							      (byte) 12,
							      i_101_, i_100_,
							      0, bools[2],
							      arg10, arg7, 128,
							      i_48_, arg6,
							      null, 0.0F, arg0,
							      i, 64);
			    is_107_[i_103_++] = i_110_;
			    if (bools_97_.length > 2)
				is_107_[i_103_++]
				    = Class14_Sub17.method881(i_104_, i_102_,
							      class14_sub27,
							      (byte) 12,
							      i_101_, i_100_,
							      0, bools_97_[2],
							      arg10, arg7, 64,
							      i_48_, arg6,
							      null, 0.0F, arg0,
							      i, 0);
			    is_107_[i_103_++] = i_112_;
			    if ((bools_98_.length ^ 0xffffffff) < -3)
				is_107_[i_103_++]
				    = Class14_Sub17.method881(i_104_, i_102_,
							      class14_sub27,
							      (byte) 12,
							      i_101_, i_100_,
							      0, bools_98_[2],
							      arg10, arg7, 0,
							      i_48_, arg6,
							      null, 0.0F, arg0,
							      i, 64);
			    is_107_[i_103_++] = i_113_;
			    if (2 < bools_99_.length)
				is_107_[i_103_++]
				    = Class14_Sub17.method881(i_104_, i_102_,
							      class14_sub27,
							      (byte) 12,
							      i_101_, i_100_,
							      0, bools_99_[2],
							      arg10, arg7, 64,
							      i_48_, arg6,
							      null, 0.0F, arg0,
							      i, 128);
			    is_107_[i_103_++] = i_111_;
			    class14_sub27.method920(i_49_, i, i_48_, is_107_,
						    null, true);
			}
		    }
		}
	    }
	    for (Class14_Sub27 class14_sub27
		     = (Class14_Sub27) class55.method1228((byte) -93);
		 null != class14_sub27;
		 class14_sub27
		     = (Class14_Sub27) class55.method1227((byte) -23)) {
		if (class14_sub27.anInt3202 == 0)
		    class14_sub27.method233(0);
		else
		    class14_sub27.method925();
	    }
	    int i = class55.method1223((byte) 39);
	    long[] ls = new long[i];
	    Class14_Sub27[] class14_sub27s_114_ = new Class14_Sub27[i];
	    class55.method1232(83, class14_sub27s_114_);
	    if (arg2 != 4)
		method1396(-83, -65);
	    for (int i_115_ = 0; i_115_ < i; i_115_++)
		ls[i_115_] = class14_sub27s_114_[i_115_].aLong355;
	    Class99_Sub2.method1506(class14_sub27s_114_, ls, true);
	    class14_sub27s = class14_sub27s_114_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("lk.G(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ',' + arg5 + ','
			+ (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ','
			+ (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ','
			+ (arg10 != null ? "{...}" : "null") + ','
			+ (arg11 != null ? "{...}" : "null") + ')'));
	}
	return class14_sub27s;
    }
    
    public static void method1399(int arg0, int arg1, int arg2, byte arg3,
				  int arg4) {
    while_965_:
	do {
	while_964_:
	    do {
		do {
		    try {
			anInt1319++;
			if (100 > Class14_Sub8_Sub32.anInt4616)
			    Class45.method1161(60);
			Class25.method999(arg4, arg2, arg0 + arg4,
					  arg1 + arg2);
			if ((Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff)
			    <= -101)
			    break;
			int i = arg0 / 2 + arg4;
			int i_116_ = 20;
			int i_117_ = arg1 / 2 + (arg2 + (-18 + -i_116_));
			Class25.method1004(arg4, arg2, arg0, arg1, 0);
			Class25.method1003(-152 + i, i_117_, 304, 34, 9179409);
			Class25.method1003(i + -151, i_117_ + 1, 302, 32, 0);
			Class25.method1004(-150 + i, i_117_ - -2,
					   Class14_Sub8_Sub32.anInt4616 * 3,
					   30, 9179409);
			Class25.method1004(-150 + (i + 3 * (Class14_Sub8_Sub32
							    .anInt4616)),
					   2 + i_117_,
					   (-(Class14_Sub8_Sub32.anInt4616 * 3)
					    + 300),
					   30, 0);
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method345
			    (Class14_Sub10_Sub1.aClass124_4886, i,
			     i_116_ + i_117_, 16777215, -1);
		    } catch (RuntimeException runtimeexception) {
			break while_964_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class14.anInt356
			    = (int) ((float) (arg0 * 2) / Class90.aFloat1426);
			Class98.anInt1671
			    = (-(int) ((float) arg0 / Class90.aFloat1426)
			       + Class37.anInt644);
			Class60.anInt984
			    = (Class133_Sub6.anInt3659
			       - (int) ((float) arg1 / Class90.aFloat1426));
			if (arg3 < -54)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_964_;
		    }
		    return;
		} while (false);
		try {
		    int i = (-(int) ((float) arg0 / Class90.aFloat1426)
			     + Class37.anInt644);
		    int i_118_ = (-(int) ((float) arg1 / Class90.aFloat1426)
				  + Class133_Sub6.anInt3659);
		    Class134.anInt2572
			= (int) ((float) (2 * arg1) / Class90.aFloat1426);
		    int i_119_ = (Class37.anInt644
				  + (int) ((float) arg0 / Class90.aFloat1426));
		    int i_120_ = ((int) ((float) arg1 / Class90.aFloat1426)
				  + Class133_Sub6.anInt3659);
		    if (null == (Class14_Sub2_Sub8
				 .aClass14_Sub2_Sub19_Sub1_Sub2_3836)
			|| ((Class14_Sub2_Sub8
			     .aClass14_Sub2_Sub19_Sub1_Sub2_3836.anInt4035)
			    != arg0)
			|| arg1 != (Class14_Sub2_Sub8
				    .aClass14_Sub2_Sub19_Sub1_Sub2_3836
				    .anInt4042))
			Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836
			    = new Class14_Sub2_Sub19_Sub1_Sub2(arg0, arg1);
		    Class92.method1455((Class14_Sub2_Sub8
					.aClass14_Sub2_Sub19_Sub1_Sub2_3836
					.anIntArray5088),
				       arg0, arg1);
		    Class133_Sub1_Sub1.method1810(i_120_, 0, -24, i_118_, arg1,
						  i, arg0, i_119_, 0);
		    Class153.method2050(i_118_, i_120_, arg0, 1, arg1, 0, i, 0,
					i_119_);
		    Class14_Sub8_Sub23.method603(0, 0, i, i_118_, i_119_, arg1,
						 arg0, -127, i_120_);
		    Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836
			.method390(arg4, arg2);
		    if (-1 > (Class14.anInt365 ^ 0xffffffff))
			Class14.anInt365--;
		    if (Class133_Sub6.aBoolean3663) {
			int i_121_ = -5 + (arg4 - -arg0);
			int i_122_ = -8 + arg1 + arg2;
			Class84.aClass14_Sub2_Sub16_1344.method348
			    ((Class14_Sub8_Sub7.method515
			      ((new Class124[]
				{ Class99_Sub2.aClass124_3351,
				  Class83.method1407(16, (Class14_Sub9_Sub3
							  .anInt4843)) }),
			       (byte) -123)),
			     i_121_, i_122_, 16776960, -1);
			i_122_ -= 15;
			Runtime runtime = Runtime.getRuntime();
			int i_123_ = 16776960;
			int i_124_ = (int) ((runtime.totalMemory()
					     - runtime.freeMemory())
					    / 1024L);
			if (65536 < i_124_)
			    i_123_ = 16711680;
			Class84.aClass14_Sub2_Sub16_1344.method348
			    ((Class14_Sub8_Sub7.method515
			      (new Class124[] { Class1.aClass124_72,
						Class83.method1407(120,
								   i_124_),
						Class62.aClass124_995 },
			       (byte) -128)),
			     i_121_, i_122_, i_123_, -1);
			i_122_ -= 15;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_965_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("lk.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public Class14_Sub2 method1400(byte arg0) {
    while_966_:
	do {
	    Class14_Sub2 class14_sub2;
	    do {
		Class14_Sub2 class14_sub2_125_;
		try {
		    anInt1321++;
		    if (arg0 < 12)
			aClass124_1318 = null;
		    class14_sub2 = aClass14_Sub2_1323.aClass14_Sub2_2738;
		    if (class14_sub2 != aClass14_Sub2_1323)
			break;
		    aClass14_Sub2_1325 = null;
		    class14_sub2_125_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_966_;
		}
		return class14_sub2_125_;
	    } while (false);
	    Class14_Sub2 class14_sub2_126_;
	    try {
		aClass14_Sub2_1325 = class14_sub2.aClass14_Sub2_2738;
		class14_sub2_126_ = class14_sub2;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_126_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "lk.A(" + arg0 + ')');
    }
    
    public Class81() {
	try {
	    aClass14_Sub2_1323.aClass14_Sub2_2728 = aClass14_Sub2_1323;
	    aClass14_Sub2_1323.aClass14_Sub2_2738 = aClass14_Sub2_1323;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lk.<init>()");
	}
    }
    
    public void method1401(boolean arg0, Class14_Sub2 arg1) {
	try {
	    anInt1315++;
	    if (arg1.aClass14_Sub2_2728 != null)
		arg1.method246(-26366);
	    arg1.aClass14_Sub2_2728 = aClass14_Sub2_1323.aClass14_Sub2_2728;
	    if (arg0)
		aClass14_Sub2_1325 = null;
	    arg1.aClass14_Sub2_2738 = aClass14_Sub2_1323;
	    arg1.aClass14_Sub2_2728.aClass14_Sub2_2738 = arg1;
	    arg1.aClass14_Sub2_2738.aClass14_Sub2_2728 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lk.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class14_Sub2 method1402(int arg0) {
    while_967_:
	do {
	    Class14_Sub2 class14_sub2;
	    do {
		Class14_Sub2 class14_sub2_127_;
		try {
		    anInt1324++;
		    class14_sub2 = aClass14_Sub2_1325;
		    if (class14_sub2 != aClass14_Sub2_1323)
			break;
		    aClass14_Sub2_1325 = null;
		    class14_sub2_127_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_967_;
		}
		return class14_sub2_127_;
	    } while (false);
	    Class14_Sub2 class14_sub2_128_;
	    try {
		if (arg0 != -28046)
		    method1395((byte) 33);
		aClass14_Sub2_1325 = class14_sub2.aClass14_Sub2_2738;
		class14_sub2_128_ = class14_sub2;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_128_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "lk.C(" + arg0 + ')');
    }
    
    public static void method1403(int arg0) {
	try {
	    aClass124_1318 = null;
	    if (arg0 != 0)
		aClass124_1326 = null;
	    aClass124_1326 = null;
	    aClass31_1328 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lk.F(" + arg0 + ')');
	}
    }
    
    static {
	anInt1314 = 0;
	aClass124_1326 = Class14_Sub2_Sub2.method263(1178, "Abbrechen");
    }
}
