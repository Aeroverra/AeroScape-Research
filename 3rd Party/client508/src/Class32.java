/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class32
{
    public int anInt532;
    public static int[] anIntArray533;
    public static int[] anIntArray534;
    public static int[] anIntArray535;
    public static int anInt536;
    public static int[] anIntArray537;
    public static int anInt538;
    public static int anInt539;
    public static Class148_Sub1[] aClass148_Sub1Array540;
    public static int anInt541;
    public static Class124[] aClass124Array542;
    public static int anInt543;
    public static int anInt544;
    public int anInt545;
    public int[][] anIntArrayArray546;
    public static int anInt547;
    public int anInt548;
    public static int anInt549 = 50;
    public static int anInt550;
    public static int anInt551;
    public static int anInt552;
    public static int anInt553;
    public static int anInt554;
    public static int anInt555;
    public static int anInt556;
    public static int anInt557;
    public static int anInt558;
    public static int anInt559;
    public static int anInt560;
    public static int anInt561;
    public int anInt562;
    public static int anInt563;
    public static int[] anIntArray564;
    public static int[] anIntArray565;
    public static int anInt566;
    public static int anInt567;
    public static int[] anIntArray568;
    public static int anInt569;
    public static int anInt570;
    public static int anInt571;
    public static int anInt572;
    
    public boolean method1062(int arg0, int arg1, byte arg2, int arg3,
			      int arg4) {
    while_665_:
	do {
	    do {
		boolean bool;
		try {
		    anInt554++;
		    if ((arg1 ^ 0xffffffff) != (arg3 ^ 0xffffffff)
			|| (arg4 ^ 0xffffffff) != (arg0 ^ 0xffffffff))
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_665_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg2 != 24)
			method1079(36, -22, 126, 46, -41, 112, 98, -42,
				   (byte) 102);
		    arg3 -= anInt532;
		    arg0 -= anInt545;
		    if (0 <= arg3 && arg3 < anInt548 && 0 <= arg0
			&& (anInt562 ^ 0xffffffff) < (arg0 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_665_;
		}
		return bool;
	    } while (false);
	while_664_:
	    do {
		int i;
		int i_0_;
		do {
		    int i_1_;
		    int i_2_;
		    try {
			arg4 -= anInt545;
			arg1 -= anInt532;
			if (arg1 < arg3)
			    i = -arg1 + arg3;
			else
			    i = arg1 + -arg3;
			if (arg4 < arg0)
			    i_0_ = arg0 - arg4;
			else
			    i_0_ = arg4 + -arg0;
			if (i > i_0_)
			    break;
			i_1_ = 65536 * i / i_0_;
			i_2_ = 32768;
		    } catch (RuntimeException runtimeexception) {
			break while_665_;
		    }
		while_661_:
		    while ((arg4 ^ 0xffffffff) != (arg0 ^ 0xffffffff)) {
			if ((arg4 ^ 0xffffffff) <= (arg0 ^ 0xffffffff)) {
			    if (arg4 > arg0) {
				if (0 != (0x12c0120
					  & anIntArrayArray546[arg1][arg4]))
				    return false;
				try {
				    arg4--;
				} catch (RuntimeException runtimeexception) {
				    break while_665_;
				}
			    }
			} else if (0 == (0x12c0102
					 & anIntArrayArray546[arg1][arg4]))
			    arg4++;
			else
			    return false;
		    while_660_:
			do {
			    do {
				boolean bool;
				try {
				    i_2_ += i_1_;
				    if (65536 > i_2_)
					continue while_661_;
				    i_2_ -= 65536;
				    if (arg3 > arg1)
					break while_660_;
				    if (arg3 >= arg1)
					continue while_661_;
				    if (-1 == (0x12c0180 & (anIntArrayArray546
							    [arg1][arg4])
					       ^ 0xffffffff))
					break;
				    bool = false;
				} catch (RuntimeException runtimeexception) {
				    break while_665_;
				}
				return bool;
			    } while (false);
			    try {
				arg1--;
				continue while_661_;
			    } catch (RuntimeException runtimeexception) {
				break while_665_;
			    }
			} while (false);
			if ((0x12c0108 & anIntArrayArray546[arg1][arg4]
			     ^ 0xffffffff)
			    != -1)
			    return false;
			try {
			    arg1++;
			} catch (RuntimeException runtimeexception) {
			    break while_665_;
			}
		    }
		    break while_664_;
		} while (false);
		int i_3_ = i_0_ * 65536 / i;
		int i_4_ = 32768;
	    while_663_:
		while ((arg1 ^ 0xffffffff) != (arg3 ^ 0xffffffff)) {
		    do {
			if (arg1 < arg3) {
			    if (0 == (anIntArrayArray546[arg1][arg4]
				      & 0x12c0108))
				arg1++;
			    else
				return false;
			} else {
			    boolean bool;
			    try {
				if ((arg1 ^ 0xffffffff) >= (arg3 ^ 0xffffffff))
				    break;
				if (0 == (0x12c0180
					  & anIntArrayArray546[arg1][arg4])) {
				    arg1--;
				    break;
				}
				bool = false;
			    } catch (RuntimeException runtimeexception) {
				break while_665_;
			    }
			    return bool;
			}
		    } while (false);
		while_662_:
		    do {
			do {
			    boolean bool;
			    try {
				i_4_ += i_3_;
				if (65536 > i_4_)
				    continue while_663_;
				i_4_ -= 65536;
				if ((arg0 ^ 0xffffffff) < (arg4 ^ 0xffffffff))
				    break while_662_;
				if ((arg0 ^ 0xffffffff) <= (arg4 ^ 0xffffffff))
				    continue while_663_;
				if (0 == (0x12c0120
					  & anIntArrayArray546[arg1][arg4]))
				    break;
				bool = false;
			    } catch (RuntimeException runtimeexception) {
				break while_665_;
			    }
			    return bool;
			} while (false);
			try {
			    arg4--;
			    continue while_663_;
			} catch (RuntimeException runtimeexception) {
			    break while_665_;
			}
		    } while (false);
		    if ((anIntArrayArray546[arg1][arg4] & 0x12c0102
			 ^ 0xffffffff)
			!= -1)
			return false;
		    try {
			arg4++;
		    } catch (RuntimeException runtimeexception) {
			break while_665_;
		    }
		}
	    } while (false);
	    if (-1
		!= (0x1240100 & anIntArrayArray546[arg3][arg0] ^ 0xffffffff))
		return false;
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
					   ("dm.H(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ')'));
    }
    
    public boolean method1063(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7, int arg8,
			      int arg9) {
    while_670_:
	do {
	while_669_:
	    do {
		int i;
		int i_5_;
		int i_6_;
		int i_7_;
	    while_668_:
		do {
		while_667_:
		    do {
		    while_666_:
			do {
			    do {
				int i_8_;
				try {
				    anInt559++;
				    if (arg4 != 2)
					anIntArray533 = null;
				    i = arg5 + arg6;
				    i_5_ = arg2 - -arg0;
				    i_6_ = arg9 - -arg8;
				    i_7_ = arg1 - -arg7;
				    if (arg9 >= arg2 && i_5_ > arg9)
					break while_668_;
				    if ((arg2 ^ 0xffffffff) > (i_6_
							       ^ 0xffffffff)
					&& i_5_ >= i_6_)
					break while_667_;
				    if (arg6 >= arg1
					&& ((i_7_ ^ 0xffffffff)
					    < (arg6 ^ 0xffffffff)))
					break while_666_;
				    if ((arg1 ^ 0xffffffff) <= (i ^ 0xffffffff)
					|| ((i_7_ ^ 0xffffffff)
					    > (i ^ 0xffffffff)))
					break while_669_;
				    if ((arg2 ^ 0xffffffff) != (i_6_
								^ 0xffffffff)
					|| 0 != (0x8 & arg3))
					break;
				    i_8_ = arg1;
				} catch (RuntimeException runtimeexception) {
				    break while_670_;
				}
				while ((i_8_ ^ 0xffffffff)
				       > (i ^ 0xffffffff)) {
				    if (0 == ((anIntArrayArray546
					       [-1 + -anInt532 + i_6_]
					       [i_8_ - anInt545])
					      & 0x8))
					return true;
				    try {
					i_8_++;
				    } catch (RuntimeException runtimeexception) {
					break while_670_;
				    }
				}
				break while_669_;
			    } while (false);
			    if (arg9 == i_5_ && 0 == (arg3 & 0x2)) {
				int i_9_ = arg1;
				while (i > i_9_) {
				    if (((anIntArrayArray546[-anInt532 + arg9]
					  [i_9_ - anInt545])
					 & 0x80)
					== 0)
					return true;
				    try {
					i_9_++;
				    } catch (RuntimeException runtimeexception) {
					break while_670_;
				    }
				}
			    }
			    break while_669_;
			} while (false);
			if (arg2 == i_6_ && (0x8 & arg3) == 0) {
			    int i_10_ = i_7_ < i ? i_7_ : i;
			    int i_11_ = arg6;
			    while (i_11_ < i_10_) {
				if (((anIntArrayArray546
				      [-1 + (-anInt532 + i_6_)]
				      [i_11_ - anInt545])
				     & 0x8)
				    == 0)
				    return true;
				try {
				    i_11_++;
				} catch (RuntimeException runtimeexception) {
				    break while_670_;
				}
			    }
			} else if (arg9 == i_5_
				   && -1 == (0x2 & arg3 ^ 0xffffffff)) {
			    int i_12_
				= ((i_7_ ^ 0xffffffff) <= (i ^ 0xffffffff) ? i
				   : i_7_);
			    int i_13_ = arg6;
			    while (i_13_ < i_12_) {
				if (((anIntArrayArray546[-anInt532 + arg9]
				      [-anInt545 + i_13_]) & 0x80
				     ^ 0xffffffff)
				    == -1)
				    return true;
				try {
				    i_13_++;
				} catch (RuntimeException runtimeexception) {
				    break while_670_;
				}
			    }
			}
			break while_669_;
		    } while (false);
		    if (arg1 != i || (0x4 & arg3) != 0) {
			if (i_7_ == arg6 && (0x1 & arg3 ^ 0xffffffff) == -1) {
			    int i_14_ = arg2;
			    while ((i_14_ ^ 0xffffffff)
				   > (i_6_ ^ 0xffffffff)) {
				if (-1 == (0x20 & (anIntArrayArray546
						   [-anInt532 + i_14_]
						   [arg6 - anInt545])
					   ^ 0xffffffff))
				    return true;
				try {
				    i_14_++;
				} catch (RuntimeException runtimeexception) {
				    break while_670_;
				}
			    }
			}
		    } else {
			int i_15_ = arg2;
			while (i_15_ < i_6_) {
			    if (-1 == (0x2 & (anIntArrayArray546
					      [-anInt532 + i_15_]
					      [-1 + i - anInt545])
				       ^ 0xffffffff))
				return true;
			    try {
				i_15_++;
			    } catch (RuntimeException runtimeexception) {
				break while_670_;
			    }
			}
		    }
		    break while_669_;
		} while (false);
		if ((arg1 ^ 0xffffffff) == (i ^ 0xffffffff)
		    && (arg3 & 0x4) == 0) {
		    int i_16_ = arg9;
		    int i_17_ = i_5_ >= i_6_ ? i_6_ : i_5_;
		    while ((i_17_ ^ 0xffffffff) < (i_16_ ^ 0xffffffff)) {
			if ((0x2 & (anIntArrayArray546[-anInt532 + i_16_]
				    [-1 + -anInt545 + i])
			     ^ 0xffffffff)
			    == -1)
			    return true;
			try {
			    i_16_++;
			} catch (RuntimeException runtimeexception) {
			    break while_670_;
			}
		    }
		} else if ((i_7_ ^ 0xffffffff) == (arg6 ^ 0xffffffff)
			   && (0x1 & arg3 ^ 0xffffffff) == -1) {
		    int i_18_ = i_6_ > i_5_ ? i_5_ : i_6_;
		    int i_19_ = arg9;
		    while ((i_19_ ^ 0xffffffff) > (i_18_ ^ 0xffffffff)) {
			if (((anIntArrayArray546[i_19_ + -anInt532]
			      [arg6 + -anInt545]) & 0x20
			     ^ 0xffffffff)
			    == -1)
			    return true;
			try {
			    i_19_++;
			} catch (RuntimeException runtimeexception) {
			    break while_670_;
			}
		    }
		}
	    } while (false);
	    return false;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("dm.G(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ',' + arg9
					    + ')'));
    }
    
    public static void method1064
	(byte[][] arg0, byte[][] arg1, float[][] arg2, byte[][] arg3,
	 float[][] arg4, Class73[] arg5, int arg6, int arg7, int[][] arg8,
	 byte[][] arg9, int arg10, float[][] arg11) {
	try {
	    for (int i = 0; i < arg10; i++) {
		Class73 class73 = arg5[i];
		if (class73.anInt1125 == arg7) {
		    int i_20_ = 0;
		    Class130 class130 = new Class130();
		    int i_21_ = ((class73.anInt1124 >> 1637948551)
				 + -class73.anInt1120);
		    int i_22_ = ((class73.anInt1124 >> -1643819225)
				 - -class73.anInt1120);
		    if (i_21_ < 0) {
			i_20_ -= i_21_;
			i_21_ = 0;
		    }
		    if (103 < i_22_)
			i_22_ = 103;
		    int i_23_ = (-class73.anInt1120
				 + (class73.anInt1128 >> 1908163687));
		    for (int i_24_ = i_21_; i_24_ <= i_22_; i_24_++) {
			int i_25_ = class73.aShortArray1106[i_20_];
			int i_26_ = (i_25_ >> -738114968) + i_23_;
			int i_27_ = i_26_ + (i_25_ & 0xff) + -1;
			if (i_26_ < 0)
			    i_26_ = 0;
			if (-104 > (i_27_ ^ 0xffffffff))
			    i_27_ = 103;
			for (int i_28_ = i_26_; i_27_ >= i_28_; i_28_++) {
			    int i_29_ = 0xff & arg9[i_28_][i_24_];
			    int i_30_ = arg3[i_28_][i_24_] & 0xff;
			    boolean bool = false;
			    if ((i_30_ ^ 0xffffffff) != -1) {
				if (-1 != (i_29_ ^ 0xffffffff)) {
				    Class150 class150
					= Class97.method1489(i_29_ + -1,
							     -9810);
				    if ((class150.anInt2411 ^ 0xffffffff)
					== 0) {
					byte i_31_ = arg1[i_28_][i_24_];
					if (i_31_ != 0) {
					    int[] is
						= (Class21.anIntArrayArray452
						   [i_31_]);
					    class130.anInt2144
						+= (-2 + (is.length
							  >> 2142185729)) * 3;
					    class130.anInt2151
						+= is.length >> 1115326433;
					}
					continue;
				    }
				    byte i_32_ = arg1[i_28_][i_24_];
				    if (i_32_ != 0)
					bool = true;
				}
			    } else {
				if (-1 == (i_29_ ^ 0xffffffff))
				    continue;
				Class150 class150
				    = Class97.method1489(-1 + i_29_, -9810);
				if ((class150.anInt2411 ^ 0xffffffff) == 0)
				    continue;
				if (arg1[i_28_][i_24_] != 0) {
				    int[] is = (Class19.anIntArrayArray2545
						[arg1[i_28_][i_24_]]);
				    class130.anInt2144
					+= 3 * ((is.length >> -11617887) + -2);
				    class130.anInt2151
					+= is.length >> 1744429825;
				    continue;
				}
			    }
			    Class40 class40
				= Class65.method1291(arg7, i_28_, i_24_);
			    if (null != class40) {
				int i_33_
				    = ((int) (class40.aLong677 >> -1002422450)
				       & 0x3f);
				if (-10 == (i_33_ ^ 0xffffffff)) {
				    int[] is = null;
				    int i_34_ = ((int) (class40.aLong677
							>> 252346452)
						 & 0x3);
				    if (0 == (i_34_ & 0x1)) {
					boolean bool_35_ = i_28_ - 1 >= i_26_;
					boolean bool_36_
					    = ((i_27_ ^ 0xffffffff)
					       <= (i_28_ + 1 ^ 0xffffffff));
					if (!bool_35_
					    && ((1 + i_24_ ^ 0xffffffff)
						>= (i_22_ ^ 0xffffffff))) {
					    int i_37_
						= (class73.aShortArray1106
						   [1 + i_20_]);
					    int i_38_
						= (i_23_
						   - -(i_37_ >> -1171104024));
					    int i_39_ = (i_37_ & 0xff) + i_38_;
					    bool_35_
						= (((i_28_ ^ 0xffffffff)
						    < (i_38_ ^ 0xffffffff))
						   && i_28_ < i_39_);
					}
					if (!bool_36_
					    && ((i_21_ ^ 0xffffffff)
						>= (i_24_ - 1 ^ 0xffffffff))) {
					    int i_40_
						= (class73.aShortArray1106
						   [-1 + i_20_]);
					    int i_41_
						= i_23_ + (i_40_ >> 860476168);
					    int i_42_ = (0xff & i_40_) + i_41_;
					    bool_36_
						= (((i_41_ ^ 0xffffffff)
						    > (i_28_ ^ 0xffffffff))
						   && ((i_28_ ^ 0xffffffff)
						       > (i_42_
							  ^ 0xffffffff)));
					}
					if (!bool_35_ || !bool_36_) {
					    if (bool_35_)
						is = (Class19
						      .anIntArrayArray2545[1]);
					    else if (bool_36_)
						is = (Class19
						      .anIntArrayArray2545[1]);
					} else
					    is = (Class19.anIntArrayArray2545
						  [0]);
				    } else {
					boolean bool_43_
					    = ((i_26_ ^ 0xffffffff)
					       >= (-1 + i_28_ ^ 0xffffffff));
					if (!bool_43_ && i_21_ <= i_24_ - 1) {
					    int i_44_
						= (class73.aShortArray1106
						   [i_20_ + -1]);
					    int i_45_ = ((i_44_ >> 1677292520)
							 + i_23_);
					    int i_46_ = (i_44_ & 0xff) + i_45_;
					    bool_43_
						= (((i_28_ ^ 0xffffffff)
						    < (i_45_ ^ 0xffffffff))
						   && ((i_46_ ^ 0xffffffff)
						       < (i_28_
							  ^ 0xffffffff)));
					}
					boolean bool_47_ = 1 + i_28_ <= i_27_;
					if (!bool_47_ && 1 + i_24_ <= i_22_) {
					    int i_48_
						= (class73.aShortArray1106
						   [1 + i_20_]);
					    int i_49_
						= (i_23_
						   - -(i_48_ >> 281506472));
					    int i_50_ = (i_48_ & 0xff) + i_49_;
					    bool_47_
						= (((i_28_ ^ 0xffffffff)
						    < (i_49_ ^ 0xffffffff))
						   && i_50_ > i_28_);
					}
					if (!bool_43_ || !bool_47_) {
					    if (!bool_43_) {
						if (bool_47_)
						    is = (Class19
							  .anIntArrayArray2545
							  [1]);
					    } else
						is = (Class19
						      .anIntArrayArray2545[1]);
					} else
					    is = (Class19.anIntArrayArray2545
						  [0]);
				    }
				    if (is != null) {
					class130.anInt2144
					    += (((is.length >> 1710010593) - 2)
						* 3);
					class130.anInt2151
					    += is.length >> 511428961;
				    }
				    continue;
				}
			    }
			    if (!bool) {
				int[] is = Class19.anIntArrayArray2545[0];
				class130.anInt2144
				    += ((is.length >> 1836207937) - 2) * 3;
				class130.anInt2151 += is.length >> 440286497;
			    } else {
				int[] is = (Class19.anIntArrayArray2545
					    [arg1[i_28_][i_24_]]);
				int[] is_51_ = (Class21.anIntArrayArray452
						[arg1[i_28_][i_24_]]);
				class130.anInt2144
				    += 3 * ((is.length >> 920890625) + -2);
				class130.anInt2144
				    += 3 * (-2
					    + (is_51_.length >> -890562751));
				class130.anInt2151 += is.length >> -374576639;
				class130.anInt2151
				    += is_51_.length >> -127913567;
			    }
			}
			i_20_++;
		    }
		    class130.method1771();
		    i_20_ = 0;
		    if ((class73.anInt1124 >> -1618448217) - class73.anInt1120
			< 0)
			i_20_ -= ((class73.anInt1124 >> 60697991)
				  - class73.anInt1120);
		    for (int i_52_ = i_21_;
			 (i_22_ ^ 0xffffffff) <= (i_52_ ^ 0xffffffff);
			 i_52_++) {
			int i_53_ = class73.aShortArray1106[i_20_];
			int i_54_ = (i_53_ >> -1372915736) + i_23_;
			int i_55_ = -1 + ((i_53_ & 0xff) + i_54_);
			if ((i_54_ ^ 0xffffffff) > -1)
			    i_54_ = 0;
			if (i_55_ > 103)
			    i_55_ = 103;
			for (int i_56_ = i_54_;
			     (i_56_ ^ 0xffffffff) >= (i_55_ ^ 0xffffffff);
			     i_56_++) {
			    byte i_57_ = arg0[i_56_][i_52_];
			    int i_58_ = arg9[i_56_][i_52_] & 0xff;
			    int i_59_ = 0xff & arg3[i_56_][i_52_];
			    boolean bool = false;
			    if (-1 == (i_59_ ^ 0xffffffff)) {
				if (0 == i_58_)
				    continue;
				Class150 class150
				    = Class97.method1489(-1 + i_58_, -9810);
				if ((class150.anInt2411 ^ 0xffffffff) == 0)
				    continue;
				if (0 != arg1[i_56_][i_52_]) {
				    Class133.method1787((Class19
							 .anIntArrayArray2545
							 [arg1[i_56_][i_52_]]),
							arg0[i_56_][i_52_],
							arg11, i_52_, class130,
							arg2, arg8, i_56_,
							arg4, true, class73);
				    continue;
				}
			    } else if (-1 != (i_58_ ^ 0xffffffff)) {
				Class150 class150
				    = Class97.method1489(-1 + i_58_, -9810);
				if (-1 != class150.anInt2411) {
				    byte i_60_ = arg1[i_56_][i_52_];
				    if (0 != i_60_)
					bool = true;
				} else {
				    Class133.method1787((Class21
							 .anIntArrayArray452
							 [arg1[i_56_][i_52_]]),
							arg0[i_56_][i_52_],
							arg11, i_52_, class130,
							arg2, arg8, i_56_,
							arg4, true, class73);
				    continue;
				}
			    } else
				i_57_ = (byte) 0;
			    Class40 class40
				= Class65.method1291(arg7, i_56_, i_52_);
			    if (class40 != null) {
				int i_61_ = 0x3f & (int) (class40.aLong677
							  >> -1583518130);
				if (-10 == (i_61_ ^ 0xffffffff)) {
				    int[] is = null;
				    int i_62_ = ((int) (class40.aLong677
							>> -99813356)
						 & 0x3);
				    if ((0x1 & i_62_) != 0) {
					boolean bool_63_
					    = ((i_56_ + -1 ^ 0xffffffff)
					       <= (i_54_ ^ 0xffffffff));
					if (!bool_63_ && ((i_21_ ^ 0xffffffff)
							  >= (i_52_ + -1
							      ^ 0xffffffff))) {
					    int i_64_
						= (class73.aShortArray1106
						   [i_20_ + -1]);
					    int i_65_ = ((i_64_ >> 1655045640)
							 + i_23_);
					    int i_66_ = (0xff & i_64_) + i_65_;
					    bool_63_ = (i_56_ > i_65_
							&& i_56_ < i_66_);
					}
					boolean bool_67_
					    = ((1 + i_56_ ^ 0xffffffff)
					       >= (i_55_ ^ 0xffffffff));
					if (!bool_67_ && i_52_ - -1 <= i_22_) {
					    int i_68_
						= (class73.aShortArray1106
						   [1 + i_20_]);
					    int i_69_
						= (i_68_ >> 136313128) + i_23_;
					    int i_70_
						= i_69_ - -(0xff & i_68_);
					    bool_67_ = (i_69_ < i_56_
							&& i_56_ < i_70_);
					}
					if (bool_63_ && bool_67_)
					    is = (Class19.anIntArrayArray2545
						  [0]);
					else if (bool_63_) {
					    is = (Class19.anIntArrayArray2545
						  [1]);
					    i_57_ = (byte) 0;
					} else if (bool_67_) {
					    is = (Class19.anIntArrayArray2545
						  [1]);
					    i_57_ = (byte) 2;
					}
				    } else {
					boolean bool_71_ = i_56_ - 1 >= i_54_;
					if (!bool_71_ && ((i_22_ ^ 0xffffffff)
							  <= (i_52_ - -1
							      ^ 0xffffffff))) {
					    int i_72_
						= (class73.aShortArray1106
						   [1 + i_20_]);
					    int i_73_ = ((i_72_ >> 1631070184)
							 + i_23_);
					    int i_74_ = (0xff & i_72_) + i_73_;
					    bool_71_
						= (i_56_ > i_73_
						   && ((i_56_ ^ 0xffffffff)
						       > (i_74_
							  ^ 0xffffffff)));
					}
					boolean bool_75_ = 1 + i_56_ <= i_55_;
					if (!bool_75_ && -1 + i_52_ >= i_21_) {
					    int i_76_
						= (class73.aShortArray1106
						   [i_20_ - 1]);
					    int i_77_
						= (i_23_
						   + (i_76_ >> -587573368));
					    int i_78_ = (i_76_ & 0xff) + i_77_;
					    bool_75_
						= (i_56_ > i_77_
						   && ((i_78_ ^ 0xffffffff)
						       < (i_56_
							  ^ 0xffffffff)));
					}
					if (bool_71_ && bool_75_)
					    is = (Class19.anIntArrayArray2545
						  [0]);
					else if (!bool_71_) {
					    if (bool_75_) {
						i_57_ = (byte) 3;
						is = (Class19
						      .anIntArrayArray2545[1]);
					    }
					} else {
					    i_57_ = (byte) 1;
					    is = (Class19.anIntArrayArray2545
						  [1]);
					}
				    }
				    if (null != is)
					Class133.method1787(is, i_57_, arg11,
							    i_52_, class130,
							    arg2, arg8, i_56_,
							    arg4, true,
							    class73);
				    continue;
				}
			    }
			    if (bool) {
				Class133.method1787((Class21.anIntArrayArray452
						     [arg1[i_56_][i_52_]]),
						    arg0[i_56_][i_52_], arg11,
						    i_52_, class130, arg2,
						    arg8, i_56_, arg4, true,
						    class73);
				Class133.method1787((Class19
						     .anIntArrayArray2545
						     [arg1[i_56_][i_52_]]),
						    arg0[i_56_][i_52_], arg11,
						    i_52_, class130, arg2,
						    arg8, i_56_, arg4, true,
						    class73);
			    } else
				Class133.method1787((Class19
						     .anIntArrayArray2545[0]),
						    i_57_, arg11, i_52_,
						    class130, arg2, arg8,
						    i_56_, arg4, true,
						    class73);
			}
			i_20_++;
		    }
		    if (-1 > (class130.anInt2140 ^ 0xffffffff)
			&& (class130.anInt2152 ^ 0xffffffff) < -1) {
			class130.method1767();
			class73.aClass130_1103 = class130;
		    }
		}
	    }
	    if (arg6 >= -37)
		method1064(null, null, null, null, null, null, 47, 39, null,
			   null, 1, null);
	    anInt572++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("dm.R(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ',' + arg6 + ','
			+ arg7 + ',' + (arg8 != null ? "{...}" : "null") + ','
			+ (arg9 != null ? "{...}" : "null") + ',' + arg10 + ','
			+ (arg11 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method1065(int arg0, byte arg1, int arg2) {
	try {
	    anInt555++;
	    arg2 -= anInt545;
	    arg0 -= anInt532;
	    anIntArrayArray546[arg0][arg2]
		= Class66.method1294(anIntArrayArray546[arg0][arg2], 262144);
	    int i = 114 / ((arg1 - -9) / 58);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public boolean method1066(int arg0, int arg1, int arg2, int arg3, int arg4,
			      byte arg5, int arg6, int arg7) {
    while_681_:
	do {
	while_671_:
	    do {
		do {
		    boolean bool;
		    try {
			anInt538++;
			if ((arg0 ^ 0xffffffff) != -2)
			    break;
			if (arg7 != arg2 || arg3 != arg4)
			    break while_671_;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_681_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    if ((arg7 ^ 0xffffffff) > (arg2 ^ 0xffffffff)
			|| (arg7 ^ 0xffffffff) < (arg0 + (arg2 - 1)
						  ^ 0xffffffff)
			|| arg3 < arg3 || arg3 > -1 + arg3 - -arg0)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_681_;
		}
		return bool;
	    } while (false);
	while_680_:
	    do {
	    while_677_:
		do {
		    int i;
		    int i_79_;
		while_675_:
		    do {
		    while_672_:
			do {
			    do {
				boolean bool;
				try {
				    arg2 -= anInt532;
				    arg3 -= anInt545;
				    arg4 -= anInt545;
				    int i_80_ = 112 / ((arg5 - 61) / 56);
				    arg7 -= anInt532;
				    if (-2 == (arg0 ^ 0xffffffff))
					break while_677_;
				    i = -1 + (arg0 + arg2);
				    i_79_ = -1 + arg4 + arg0;
				    if (-7 != (arg1 ^ 0xffffffff) && arg1 != 7)
					break while_675_;
				    if (7 == arg1)
					arg6 = arg6 - -2 & 0x3;
				    if ((arg6 ^ 0xffffffff) != -1)
					break while_672_;
				    if ((arg2 ^ 0xffffffff) != (1 + arg7
								^ 0xffffffff)
					|| arg4 > arg3 || arg3 > i_79_
					|| 0 != (anIntArrayArray546[arg2][arg3]
						 & 0x80))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (arg7 < arg2 || arg7 > i
				    || (arg4 ^ 0xffffffff) != (arg3 + -arg0
							       ^ 0xffffffff)
				    || 0 != (0x2 & (anIntArrayArray546[arg7]
						    [i_79_])))
				    break while_675_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
		    while_673_:
			do {
			    do {
				boolean bool;
				try {
				    if (1 != arg6)
					break while_673_;
				    if (((-arg0 + arg7 ^ 0xffffffff)
					 != (arg2 ^ 0xffffffff))
					|| (arg4 ^ 0xffffffff) < (arg3
								  ^ 0xffffffff)
					|| i_79_ < arg3
					|| ((0x8 & anIntArrayArray546[i][arg3])
					    != 0))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if ((arg2 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
				    || i < arg7
				    || ((-arg0 + arg3 ^ 0xffffffff)
					!= (arg4 ^ 0xffffffff))
				    || (anIntArrayArray546[arg7][i_79_] & 0x2
					^ 0xffffffff) != -1)
				    break while_675_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
		    while_674_:
			do {
			    do {
				boolean bool;
				try {
				    if (-3 == (arg6 ^ 0xffffffff))
					break while_674_;
				    if ((arg6 ^ 0xffffffff) != -4)
					break while_675_;
				    if (((arg7 - -1 ^ 0xffffffff)
					 != (arg2 ^ 0xffffffff))
					|| (arg4 ^ 0xffffffff) < (arg3
								  ^ 0xffffffff)
					|| arg3 > i_79_
					|| -1 != (0x80 & (anIntArrayArray546
							  [arg2][arg3])
						  ^ 0xffffffff))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (arg7 < arg2 || arg7 > i
				    || ((1 + arg3 ^ 0xffffffff)
					!= (arg4 ^ 0xffffffff))
				    || (anIntArrayArray546[arg7][arg4] & 0x20
					^ 0xffffffff) != -1)
				    break while_675_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg2 != arg7 - arg0 || arg4 > arg3
				    || (i_79_ ^ 0xffffffff) > (arg3
							       ^ 0xffffffff)
				    || -1 != (anIntArrayArray546[i][arg3] & 0x8
					      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if ((arg2 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
				|| (arg7 ^ 0xffffffff) < (i ^ 0xffffffff)
				|| arg4 != arg3 + 1
				|| -1 != (0x20 & anIntArrayArray546[arg7][arg4]
					  ^ 0xffffffff))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_681_;
			}
			return bool;
		    } while (false);
		while_676_:
		    do {
			do {
			    boolean bool;
			    try {
				if (arg1 != 8)
				    break while_676_;
				if (arg2 > arg7 || i < arg7
				    || (arg4 ^ 0xffffffff) != (1 + arg3
							       ^ 0xffffffff)
				    || (0x20 & anIntArrayArray546[arg7][arg4]
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg2 ^ 0xffffffff) < (arg7 ^ 0xffffffff)
				    || arg7 > i || -arg0 + arg3 != arg4
				    || -1 != ((anIntArrayArray546[arg7][i_79_]
					       & 0x2)
					      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (-arg0 + arg7 != arg2
				    || (arg3 ^ 0xffffffff) > (arg4
							      ^ 0xffffffff)
				    || i_79_ < arg3
				    || ((anIntArrayArray546[i][arg3] & 0x8)
					!= 0))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if ((arg2 ^ 0xffffffff) != (arg7 - -1 ^ 0xffffffff)
				|| arg3 < arg4 || arg3 > i_79_
				|| 0 != (0x80
					 & anIntArrayArray546[arg2][arg3]))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_681_;
			}
			return bool;
		    } while (false);
		    try {
			break while_680_;
		    } catch (RuntimeException runtimeexception) {
			break while_681_;
		    }
		} while (false);
	    while_679_:
		do {
		    if (arg1 == 6 || arg1 == 7) {
			if ((arg1 ^ 0xffffffff) == -8)
			    arg6 = 0x3 & 2 + arg6;
			if (-1 != (arg6 ^ 0xffffffff)) {
			    if ((arg6 ^ 0xffffffff) == -2) {
				if ((arg2 ^ 0xffffffff) == (arg7 + -1
							    ^ 0xffffffff)
				    && (arg3 ^ 0xffffffff) == (arg4
							       ^ 0xffffffff)
				    && 0 == (0x8
					     & anIntArrayArray546[arg2][arg4]))
				    return true;
				boolean bool;
				try {
				    if ((arg7 ^ 0xffffffff) != (arg2
								^ 0xffffffff)
					|| ((arg4 ^ 0xffffffff)
					    != (-1 + arg3 ^ 0xffffffff))
					|| 0 != (anIntArrayArray546[arg2][arg4]
						 & 0x2))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    }
			while_678_:
			    do {
				do {
				    boolean bool;
				    try {
					if ((arg6 ^ 0xffffffff) == -3)
					    break while_678_;
					if (3 != arg6)
					    break while_679_;
					if (arg7 - -1 != arg2 || arg3 != arg4
					    || (anIntArrayArray546[arg2][arg4]
						& 0x80) != 0)
					    break;
					bool = true;
				    } catch (RuntimeException runtimeexception) {
					break while_681_;
				    }
				    return bool;
				} while (false);
				boolean bool;
				try {
				    if ((arg7 ^ 0xffffffff) != (arg2
								^ 0xffffffff)
					|| 1 + arg3 != arg4
					|| (anIntArrayArray546[arg2][arg4]
					    & 0x20) != 0)
					break while_679_;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg2 != -1 + arg7
					|| ((arg3 ^ 0xffffffff)
					    != (arg4 ^ 0xffffffff))
					|| ((anIntArrayArray546[arg2][arg4]
					     & 0x8)
					    ^ 0xffffffff) != -1)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_681_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if ((arg2 ^ 0xffffffff) != (arg7 ^ 0xffffffff)
				    || arg3 + 1 != arg4
				    || -1 != ((anIntArrayArray546[arg2][arg4]
					       & 0x20)
					      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			}
			do {
			    boolean bool;
			    try {
				if (arg2 != 1 + arg7 || arg4 != arg3
				    || (0x80 & anIntArrayArray546[arg2][arg4]
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_681_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (arg2 != arg7
				|| (arg4 ^ 0xffffffff) != (arg3 + -1
							   ^ 0xffffffff)
				|| 0 != (0x2 & anIntArrayArray546[arg2][arg4]))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_681_;
			}
			return bool;
		    }
		} while (false);
		do {
		    boolean bool;
		    try {
			if (8 != arg1)
			    break while_680_;
			if ((arg7 ^ 0xffffffff) != (arg2 ^ 0xffffffff)
			    || (arg4 ^ 0xffffffff) != (arg3 - -1 ^ 0xffffffff)
			    || 0 != (0x20 & anIntArrayArray546[arg2][arg4]))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_681_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if (arg7 != arg2
			    || (arg4 ^ 0xffffffff) != (arg3 + -1 ^ 0xffffffff)
			    || (0x2 & anIntArrayArray546[arg2][arg4]) != 0)
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_681_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if ((arg7 + -1 ^ 0xffffffff) != (arg2 ^ 0xffffffff)
			    || arg4 != arg3
			    || 0 != (anIntArrayArray546[arg2][arg4] & 0x8))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_681_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    if ((arg7 + 1 ^ 0xffffffff) != (arg2 ^ 0xffffffff)
			|| arg3 != arg4
			|| 0 != (anIntArrayArray546[arg2][arg4] & 0x80))
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_681_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("dm.O(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ')'));
    }
    
    public static void method1067(int arg0) {
	try {
	    anIntArray535 = null;
	    anIntArray537 = null;
	    anIntArray568 = null;
	    anIntArray564 = null;
	    aClass148_Sub1Array540 = null;
	    aClass124Array542 = null;
	    if (arg0 != 10826)
		method1064(null, null, null, null, null, null, 95, 61, null,
			   null, -18, null);
	    anIntArray534 = null;
	    anIntArray533 = null;
	    anIntArray565 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "dm.C(" + arg0 + ')');
	}
    }
    
    public void method1068(boolean arg0, int arg1, byte arg2, int arg3,
			   int arg4, int arg5, int arg6) {
	try {
	    arg5 -= anInt532;
	    if (arg2 > -73)
		method1081((byte) 81);
	    int i = 256;
	    arg6 -= anInt545;
	    anInt558++;
	    if (-2 == (arg1 ^ 0xffffffff) || arg1 == 3) {
		int i_81_ = arg4;
		arg4 = arg3;
		arg3 = i_81_;
	    }
	    if (arg0)
		i += 131072;
	    for (int i_82_ = arg5; i_82_ < arg5 - -arg4; i_82_++) {
		if ((i_82_ ^ 0xffffffff) <= -1
		    && (i_82_ ^ 0xffffffff) > (anInt548 ^ 0xffffffff)) {
		    for (int i_83_ = arg6; arg6 + arg3 > i_83_; i_83_++) {
			if ((i_83_ ^ 0xffffffff) <= -1
			    && (i_83_ ^ 0xffffffff) > (anInt562 ^ 0xffffffff))
			    method1083(i, i_82_, (byte) 93, i_83_);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
    }
    
    public void method1069(int arg0, int arg1, int arg2) {
	try {
	    anInt553++;
	    arg1 -= anInt545;
	    arg2 -= anInt532;
	    anIntArrayArray546[arg2][arg1]
		= Class14_Sub8_Sub26.method617(anIntArrayArray546[arg2][arg1],
					       arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1070(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt556++;
	    anIntArrayArray546[arg3][arg0]
		= Class66.method1294(anIntArrayArray546[arg3][arg0], arg2);
	    if (arg1 != 31396)
		anInt548 = -117;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.T(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public void method1071(boolean arg0) {
    while_683_:
	do {
	while_682_:
	    do {
		do {
		    try {
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_682_;
		    }
		    return;
		} while (false);
		try {
		    for (int i = 0; (i ^ 0xffffffff) > (anInt548 ^ 0xffffffff);
			 i++) {
			for (int i_84_ = 0;
			     (anInt562 ^ 0xffffffff) < (i_84_ ^ 0xffffffff);
			     i_84_++) {
			    if (-1 != (i ^ 0xffffffff)
				&& (i_84_ ^ 0xffffffff) != -1
				&& anInt548 + -5 > i && -5 + anInt562 > i_84_)
				anIntArrayArray546[i][i_84_] = 16777216;
			    else
				anIntArrayArray546[i][i_84_] = 16777215;
			}
		    }
		    anInt560++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_683_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "dm.V(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1072(Class9 arg0, byte arg1) {
	try {
	    anInt557++;
	    Class14.aClass9_372 = arg0;
	    Class131.anInt2159 = Class14.aClass9_372.method177(4, 13537);
	    if (arg1 >= -14)
		method1074(-76, -127);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.K("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method1073(int arg0, int arg1, int arg2, int arg3,
			   boolean arg4, boolean arg5) {
	try {
	    anInt544++;
	    arg2 -= anInt545;
	    arg1 -= anInt532;
	    int i = 256;
	    if (arg5)
		method1062(28, -22, (byte) 42, 27, -21);
	    if (arg4)
		i += 131072;
	    for (int i_85_ = arg1; arg1 - -arg0 > i_85_; i_85_++) {
		if (0 <= i_85_ && i_85_ < anInt548) {
		    for (int i_86_ = arg2; i_86_ < arg2 - -arg3; i_86_++) {
			if ((i_86_ ^ 0xffffffff) <= -1
			    && (anInt562 ^ 0xffffffff) < (i_86_ ^ 0xffffffff))
			    method1070(i_86_, 31396, i, i_85_);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.N(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static void method1074(int arg0, int arg1) {
    while_685_:
	do {
	while_684_:
	    do {
		Class14_Sub25 class14_sub25;
		do {
		    try {
			anInt569++;
			if (arg0 > -74)
			    anIntArray535 = null;
			class14_sub25
			    = ((Class14_Sub25)
			       Class132.aClass55_2167.method1230((long) arg1,
								 (byte) 82));
			if (null != class14_sub25)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_684_;
		    }
		    return;
		} while (false);
		try {
		    class14_sub25.method233(0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_685_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "dm.B(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public void method1075(boolean arg0, int arg1, int arg2, int arg3,
			   int arg4, byte arg5) {
	try {
	    arg3 -= anInt545;
	    anInt552++;
	    arg1 -= anInt532;
	    if ((arg2 ^ 0xffffffff) == -1) {
		if (0 == arg4) {
		    method1070(arg3, 31396, 128, arg1);
		    method1070(arg3, 31396, 8, arg1 + -1);
		}
		if (-2 == (arg4 ^ 0xffffffff)) {
		    method1070(arg3, 31396, 2, arg1);
		    method1070(arg3 - -1, 31396, 32, arg1);
		}
		if (-3 == (arg4 ^ 0xffffffff)) {
		    method1070(arg3, 31396, 8, arg1);
		    method1070(arg3, 31396, 128, 1 + arg1);
		}
		if ((arg4 ^ 0xffffffff) == -4) {
		    method1070(arg3, 31396, 32, arg1);
		    method1070(-1 + arg3, 31396, 2, arg1);
		}
	    }
	    if (-2 == (arg2 ^ 0xffffffff) || (arg2 ^ 0xffffffff) == -4) {
		if (arg4 == 0) {
		    method1070(arg3, 31396, 1, arg1);
		    method1070(1 + arg3, 31396, 16, -1 + arg1);
		}
		if (-2 == (arg4 ^ 0xffffffff)) {
		    method1070(arg3, 31396, 4, arg1);
		    method1070(arg3 - -1, 31396, 64, 1 + arg1);
		}
		if ((arg4 ^ 0xffffffff) == -3) {
		    method1070(arg3, 31396, 16, arg1);
		    method1070(arg3 - 1, 31396, 1, arg1 + 1);
		}
		if (-4 == (arg4 ^ 0xffffffff)) {
		    method1070(arg3, 31396, 64, arg1);
		    method1070(arg3 + -1, 31396, 4, arg1 + -1);
		}
	    }
	    if (arg2 == 2) {
		if (arg4 == 0) {
		    method1070(arg3, 31396, 130, arg1);
		    method1070(arg3, 31396, 8, -1 + arg1);
		    method1070(1 + arg3, 31396, 32, arg1);
		}
		if (-2 == (arg4 ^ 0xffffffff)) {
		    method1070(arg3, 31396, 10, arg1);
		    method1070(arg3 + 1, 31396, 32, arg1);
		    method1070(arg3, 31396, 128, 1 + arg1);
		}
		if (arg4 == 2) {
		    method1070(arg3, 31396, 40, arg1);
		    method1070(arg3, 31396, 128, arg1 - -1);
		    method1070(arg3 + -1, 31396, 2, arg1);
		}
		if (arg4 == 3) {
		    method1070(arg3, 31396, 160, arg1);
		    method1070(-1 + arg3, 31396, 2, arg1);
		    method1070(arg3, 31396, 8, -1 + arg1);
		}
	    }
	    if (arg0) {
		if ((arg2 ^ 0xffffffff) == -1) {
		    if (0 == arg4) {
			method1070(arg3, 31396, 65536, arg1);
			method1070(arg3, 31396, 4096, arg1 + -1);
		    }
		    if (-2 == (arg4 ^ 0xffffffff)) {
			method1070(arg3, 31396, 1024, arg1);
			method1070(1 + arg3, 31396, 16384, arg1);
		    }
		    if (-3 == (arg4 ^ 0xffffffff)) {
			method1070(arg3, 31396, 4096, arg1);
			method1070(arg3, 31396, 65536, arg1 + 1);
		    }
		    if (3 == arg4) {
			method1070(arg3, 31396, 16384, arg1);
			method1070(-1 + arg3, 31396, 1024, arg1);
		    }
		}
		if ((arg2 ^ 0xffffffff) == -2 || -4 == (arg2 ^ 0xffffffff)) {
		    if (0 == arg4) {
			method1070(arg3, 31396, 512, arg1);
			method1070(1 + arg3, 31396, 8192, arg1 - 1);
		    }
		    if (arg4 == 1) {
			method1070(arg3, 31396, 2048, arg1);
			method1070(1 + arg3, 31396, 32768, arg1 + 1);
		    }
		    if (-3 == (arg4 ^ 0xffffffff)) {
			method1070(arg3, 31396, 8192, arg1);
			method1070(arg3 + -1, 31396, 512, 1 + arg1);
		    }
		    if (-4 == (arg4 ^ 0xffffffff)) {
			method1070(arg3, 31396, 32768, arg1);
			method1070(-1 + arg3, 31396, 2048, -1 + arg1);
		    }
		}
		if (arg2 == 2) {
		    if (arg4 == 0) {
			method1070(arg3, 31396, 66560, arg1);
			method1070(arg3, 31396, 4096, arg1 - 1);
			method1070(arg3 + 1, 31396, 16384, arg1);
		    }
		    if (arg4 == 1) {
			method1070(arg3, 31396, 5120, arg1);
			method1070(1 + arg3, 31396, 16384, arg1);
			method1070(arg3, 31396, 65536, arg1 - -1);
		    }
		    if (2 == arg4) {
			method1070(arg3, 31396, 20480, arg1);
			method1070(arg3, 31396, 65536, 1 + arg1);
			method1070(-1 + arg3, 31396, 1024, arg1);
		    }
		    if (arg4 == 3) {
			method1070(arg3, 31396, 81920, arg1);
			method1070(arg3 - 1, 31396, 1024, arg1);
			method1070(arg3, 31396, 4096, arg1 + -1);
		    }
		}
	    }
	    if (arg5 < 102)
		method1068(false, -16, (byte) -102, 58, -85, -115, -94);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.P(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public boolean method1076(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
    while_705_:
	do {
	while_686_:
	    do {
		do {
		    boolean bool;
		    try {
			anInt570++;
			if (-2 == (arg1 ^ 0xffffffff))
			    break;
			if ((arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff)
			    || ((arg1 + (arg5 - 1) ^ 0xffffffff)
				> (arg4 ^ 0xffffffff))
			    || arg3 > arg3 || -1 + (arg3 - -arg1) < arg3)
			    break while_686_;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    if (arg5 != arg4 || arg3 != arg6)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_705_;
		}
		return bool;
	    } while (false);
	while_704_:
	    do {
	    while_695_:
		do {
		while_690_:
		    do {
		    while_687_:
			do {
			    do {
				boolean bool;
				try {
				    arg4 -= anInt532;
				    arg6 -= anInt545;
				    arg5 -= anInt532;
				    arg3 -= anInt545;
				    if (1 != arg1)
					break while_695_;
				    if (arg2 != 0)
					break while_690_;
				    if (arg0 != 0)
					break while_687_;
				    if (arg4 - 1 != arg5
					|| ((arg6 ^ 0xffffffff)
					    != (arg3 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg4 != arg5 || arg6 != arg3 + 1
					|| (anIntArrayArray546[arg5][arg6]
					    & 0x12c0120) != 0)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (arg5 != arg4 || -1 + arg3 != arg6
				    || 0 != (0x12c0102
					     & anIntArrayArray546[arg5][arg6]))
				    break while_690_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
		    while_688_:
			do {
			    do {
				boolean bool;
				try {
				    if ((arg0 ^ 0xffffffff) != -2)
					break while_688_;
				    if ((arg4 ^ 0xffffffff) != (arg5
								^ 0xffffffff)
					|| arg3 + 1 != arg6)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if ((arg5 ^ 0xffffffff) != (arg4 + -1
								^ 0xffffffff)
					|| ((arg6 ^ 0xffffffff)
					    != (arg3 ^ 0xffffffff))
					|| ((0x12c0108
					     & anIntArrayArray546[arg5][arg6])
					    != 0))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if ((arg5 ^ 0xffffffff) != (arg4 + 1
							    ^ 0xffffffff)
				    || arg3 != arg6
				    || ((0x12c0180
					 & anIntArrayArray546[arg5][arg6])
					^ 0xffffffff) != -1)
				    break while_690_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
		    while_689_:
			do {
			    do {
				boolean bool;
				try {
				    if (-3 != (arg0 ^ 0xffffffff))
					break while_689_;
				    if (arg5 != 1 + arg4
					|| ((arg6 ^ 0xffffffff)
					    != (arg3 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg5 != arg4
					|| ((arg3 - -1 ^ 0xffffffff)
					    != (arg6 ^ 0xffffffff))
					|| ((anIntArrayArray546[arg5][arg6]
					     & 0x12c0120)
					    ^ 0xffffffff) != -1)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if ((arg5 ^ 0xffffffff) != (arg4 ^ 0xffffffff)
				    || ((arg3 - 1 ^ 0xffffffff)
					!= (arg6 ^ 0xffffffff))
				    || 0 != (anIntArrayArray546[arg5][arg6]
					     & 0x12c0102))
				    break while_690_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (3 != arg0)
				    break while_690_;
				if (arg5 != arg4 || arg6 != -1 + arg3)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg4 + -1 ^ 0xffffffff) != (arg5
								 ^ 0xffffffff)
				    || (arg3 ^ 0xffffffff) != (arg6
							       ^ 0xffffffff)
				    || ((0x12c0108
					 & anIntArrayArray546[arg5][arg6])
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if ((1 + arg4 ^ 0xffffffff) != (arg5 ^ 0xffffffff)
				|| (arg3 ^ 0xffffffff) != (arg6 ^ 0xffffffff)
				|| (anIntArrayArray546[arg5][arg6]
				    & 0x12c0180) != 0)
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		while_694_:
		    do {
		    while_691_:
			do {
			    do {
				boolean bool;
				try {
				    if (arg2 != 2)
					break while_694_;
				    if (0 != arg0)
					break while_691_;
				    if ((arg5 ^ 0xffffffff) != (arg4 - 1
								^ 0xffffffff)
					|| ((arg3 ^ 0xffffffff)
					    != (arg6 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if ((arg4 ^ 0xffffffff) != (arg5
								^ 0xffffffff)
					|| arg6 != 1 + arg3)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg4 + 1 != arg5 || arg3 != arg6
					|| (anIntArrayArray546[arg5][arg6]
					    & 0x12c0180) != 0)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (arg4 != arg5
				    || ((arg3 + -1 ^ 0xffffffff)
					!= (arg6 ^ 0xffffffff))
				    || -1 != ((anIntArrayArray546[arg5][arg6]
					       & 0x12c0102)
					      ^ 0xffffffff))
				    break while_694_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
		    while_692_:
			do {
			    do {
				boolean bool;
				try {
				    if (arg0 != 1)
					break while_692_;
				    if (((arg4 + -1 ^ 0xffffffff)
					 != (arg5 ^ 0xffffffff))
					|| arg3 != arg6
					|| -1 != ((anIntArrayArray546[arg5]
						   [arg6]) & 0x12c0108
						  ^ 0xffffffff))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg5 != arg4
					|| ((arg3 + 1 ^ 0xffffffff)
					    != (arg6 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (arg5 != 1 + arg4
					|| ((arg6 ^ 0xffffffff)
					    != (arg3 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if ((arg4 ^ 0xffffffff) != (arg5 ^ 0xffffffff)
				    || (arg6 ^ 0xffffffff) != (arg3 - 1
							       ^ 0xffffffff)
				    || (0x12c0102
					& anIntArrayArray546[arg5][arg6]) != 0)
				    break while_694_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
		    while_693_:
			do {
			    do {
				boolean bool;
				try {
				    if (2 != arg0)
					break while_693_;
				    if (arg4 + -1 != arg5
					|| ((arg6 ^ 0xffffffff)
					    != (arg3 ^ 0xffffffff))
					|| 0 != (anIntArrayArray546[arg5][arg6]
						 & 0x12c0108))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if ((arg5 ^ 0xffffffff) != (arg4
								^ 0xffffffff)
					|| arg6 != 1 + arg3
					|| ((anIntArrayArray546[arg5][arg6]
					     & 0x12c0120)
					    ^ 0xffffffff) != -1)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (((arg4 + 1 ^ 0xffffffff)
					 != (arg5 ^ 0xffffffff))
					|| arg6 != arg3)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (arg4 != arg5
				    || (arg6 ^ 0xffffffff) != (-1 + arg3
							       ^ 0xffffffff))
				    break while_694_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (-4 != (arg0 ^ 0xffffffff))
				    break while_694_;
				if ((arg4 - 1 ^ 0xffffffff) != (arg5
								^ 0xffffffff)
				    || arg6 != arg3)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg5 != arg4
				    || ((arg3 + 1 ^ 0xffffffff)
					!= (arg6 ^ 0xffffffff))
				    || ((anIntArrayArray546[arg5][arg6]
					 & 0x12c0120)
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg4 - -1 ^ 0xffffffff) != (arg5
								 ^ 0xffffffff)
				    || arg6 != arg3
				    || 0 != (0x12c0180
					     & anIntArrayArray546[arg5][arg6]))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (arg5 != arg4 || arg3 - 1 != arg6)
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (9 != arg2)
				break while_704_;
			    if (arg5 != arg4 || arg6 != 1 + arg3
				|| 0 != (0x20
					 & anIntArrayArray546[arg5][arg6]))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (arg5 != arg4 || arg6 != -1 + arg3
				|| -1 != (0x2 & anIntArrayArray546[arg5][arg6]
					  ^ 0xffffffff))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if ((-1 + arg4 ^ 0xffffffff) != (arg5 ^ 0xffffffff)
				|| arg6 != arg3
				|| 0 != (0x8 & anIntArrayArray546[arg5][arg6]))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    boolean bool;
		    try {
			if (1 + arg4 != arg5 || arg3 != arg6
			    || (anIntArrayArray546[arg5][arg6] & 0x80) != 0)
			    break while_704_;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		int i;
		int i_87_;
	    while_699_:
		do {
		while_696_:
		    do {
			do {
			    boolean bool;
			    try {
				i = arg1 + arg5 - 1;
				i_87_ = arg6 - (-arg1 + 1);
				if (0 != arg2)
				    break while_699_;
				if ((arg0 ^ 0xffffffff) != -1)
				    break while_696_;
				if (arg4 - arg1 != arg5 || arg6 > arg3
				    || arg3 > i_87_)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg4 < arg5
				    || (arg4 ^ 0xffffffff) < (i ^ 0xffffffff)
				    || arg3 - -1 != arg6
				    || ((0x12c0120
					 & anIntArrayArray546[arg4][arg6])
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if ((arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff)
				|| i < arg4 || -arg1 + arg3 != arg6
				|| (0x12c0102 & anIntArrayArray546[arg4][i_87_]
				    ^ 0xffffffff) != -1)
				break while_699_;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		while_698_:
		    do {
		    while_697_:
			do {
			    do {
				boolean bool;
				try {
				    if (-2 == (arg0 ^ 0xffffffff))
					break while_698_;
				    if ((arg0 ^ 0xffffffff) == -3)
					break while_697_;
				    if (arg0 != 3)
					break while_699_;
				    if ((arg4 ^ 0xffffffff) > (arg5
							       ^ 0xffffffff)
					|| i < arg4
					|| ((arg6 ^ 0xffffffff)
					    != (-arg1 + arg3 ^ 0xffffffff)))
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    do {
				boolean bool;
				try {
				    if (-arg1 + arg4 != arg5 || arg6 > arg3
					|| (arg3 ^ 0xffffffff) < (i_87_
								  ^ 0xffffffff)
					|| ((anIntArrayArray546[i][arg3]
					     & 0x12c0108)
					    ^ 0xffffffff) != -1)
					break;
				    bool = true;
				} catch (RuntimeException runtimeexception) {
				    break while_705_;
				}
				return bool;
			    } while (false);
			    boolean bool;
			    try {
				if (1 + arg4 != arg5 || arg6 > arg3
				    || (arg3 ^ 0xffffffff) < (i_87_
							      ^ 0xffffffff)
				    || -1 != ((anIntArrayArray546[arg5][arg3]
					       & 0x12c0180)
					      ^ 0xffffffff))
				    break while_699_;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg5 != 1 + arg4
				    || (arg3 ^ 0xffffffff) > (arg6
							      ^ 0xffffffff)
				    || (arg3 ^ 0xffffffff) < (i_87_
							      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg4 ^ 0xffffffff) > (arg5 ^ 0xffffffff)
				    || i < arg4
				    || ((arg3 + 1 ^ 0xffffffff)
					!= (arg6 ^ 0xffffffff))
				    || -1 != (0x12c0120 & (anIntArrayArray546
							   [arg4][arg6])
					      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if ((arg4 ^ 0xffffffff) > (arg5 ^ 0xffffffff)
				|| (arg4 ^ 0xffffffff) < (i ^ 0xffffffff)
				|| ((arg3 + -arg1 ^ 0xffffffff)
				    != (arg6 ^ 0xffffffff))
				|| 0 != (0x12c0102
					 & anIntArrayArray546[arg4][i_87_]))
				break while_699_;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if ((arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff)
				|| i < arg4 || arg6 != arg3 - -1)
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (arg5 != -arg1 + arg4
				|| (arg3 ^ 0xffffffff) > (arg6 ^ 0xffffffff)
				|| (arg3 ^ 0xffffffff) < (i_87_ ^ 0xffffffff)
				|| ((anIntArrayArray546[i][arg3] & 0x12c0108)
				    != 0))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    boolean bool;
		    try {
			if ((arg5 ^ 0xffffffff) != (1 + arg4 ^ 0xffffffff)
			    || (arg6 ^ 0xffffffff) < (arg3 ^ 0xffffffff)
			    || arg3 > i_87_
			    || 0 != (0x12c0180
				     & anIntArrayArray546[arg5][arg3]))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
	    while_703_:
		do {
		while_700_:
		    do {
			do {
			    boolean bool;
			    try {
				if (-3 != (arg2 ^ 0xffffffff))
				    break while_703_;
				if (-1 != (arg0 ^ 0xffffffff))
				    break while_700_;
				if (arg4 + -arg1 != arg5
				    || (arg6 ^ 0xffffffff) < (arg3
							      ^ 0xffffffff)
				    || (arg3 ^ 0xffffffff) < (i_87_
							      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg4 < arg5 || i < arg4
				    || ((arg3 + 1 ^ 0xffffffff)
					!= (arg6 ^ 0xffffffff)))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg5 ^ 0xffffffff) != (1 + arg4
							    ^ 0xffffffff)
				    || arg6 > arg3 || i_87_ < arg3
				    || ((anIntArrayArray546[arg5][arg3]
					 & 0x12c0180)
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (arg4 < arg5
				|| (arg4 ^ 0xffffffff) < (i ^ 0xffffffff)
				|| arg3 + -arg1 != arg6
				|| (0x12c0102
				    & anIntArrayArray546[arg4][i_87_]) != 0)
				break while_703_;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		while_701_:
		    do {
			do {
			    boolean bool;
			    try {
				if (-2 != (arg0 ^ 0xffffffff))
				    break while_701_;
				if (arg5 != arg4 + -arg1
				    || (arg3 ^ 0xffffffff) > (arg6
							      ^ 0xffffffff)
				    || arg3 > i_87_
				    || (0x12c0108
					& anIntArrayArray546[i][arg3]) != 0)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if ((arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff)
				    || (i ^ 0xffffffff) > (arg4 ^ 0xffffffff)
				    || arg6 != 1 + arg3)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg4 + 1 != arg5 || arg3 < arg6
				    || arg3 > i_87_)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (arg4 < arg5
				|| (arg4 ^ 0xffffffff) < (i ^ 0xffffffff)
				|| (arg6 ^ 0xffffffff) != (-arg1 + arg3
							   ^ 0xffffffff)
				|| (anIntArrayArray546[arg4][i_87_]
				    & 0x12c0102) != 0)
				break while_703_;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		while_702_:
		    do {
			do {
			    boolean bool;
			    try {
				if (2 != arg0)
				    break while_702_;
				if (arg5 != arg4 - arg1
				    || (arg3 ^ 0xffffffff) > (arg6
							      ^ 0xffffffff)
				    || (i_87_ ^ 0xffffffff) > (arg3
							       ^ 0xffffffff)
				    || -1 != ((0x12c0108
					       & anIntArrayArray546[i][arg3])
					      ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg4 < arg5
				    || (i ^ 0xffffffff) > (arg4 ^ 0xffffffff)
				    || arg6 != 1 + arg3
				    || ((anIntArrayArray546[arg4][arg6]
					 & 0x12c0120)
					^ 0xffffffff) != -1)
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			do {
			    boolean bool;
			    try {
				if (arg5 != 1 + arg4
				    || (arg6 ^ 0xffffffff) < (arg3
							      ^ 0xffffffff)
				    || (i_87_ ^ 0xffffffff) > (arg3
							       ^ 0xffffffff))
				    break;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_705_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (arg5 > arg4 || i < arg4 || arg3 - arg1 != arg6)
				break while_703_;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (-4 != (arg0 ^ 0xffffffff))
				break while_703_;
			    if ((arg5 ^ 0xffffffff) != (arg4 - arg1
							^ 0xffffffff)
				|| (arg3 ^ 0xffffffff) > (arg6 ^ 0xffffffff)
				|| (arg3 ^ 0xffffffff) < (i_87_ ^ 0xffffffff))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (arg4 < arg5
				|| (arg4 ^ 0xffffffff) < (i ^ 0xffffffff)
				|| (arg6 ^ 0xffffffff) != (arg3 - -1
							   ^ 0xffffffff)
				|| 0 != (anIntArrayArray546[arg4][arg6]
					 & 0x12c0120))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    do {
			boolean bool;
			try {
			    if (1 + arg4 != arg5 || arg6 > arg3 || arg3 > i_87_
				|| -1 != ((anIntArrayArray546[arg5][arg3]
					   & 0x12c0180)
					  ^ 0xffffffff))
				break;
			    bool = true;
			} catch (RuntimeException runtimeexception) {
			    break while_705_;
			}
			return bool;
		    } while (false);
		    boolean bool;
		    try {
			if ((arg4 ^ 0xffffffff) > (arg5 ^ 0xffffffff)
			    || i < arg4 || arg6 != arg3 - arg1)
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if (-10 != (arg2 ^ 0xffffffff))
			    break while_704_;
			if ((arg4 ^ 0xffffffff) > (arg5 ^ 0xffffffff)
			    || (i ^ 0xffffffff) > (arg4 ^ 0xffffffff)
			    || (1 + arg3 ^ 0xffffffff) != (arg6 ^ 0xffffffff)
			    || 0 != (0x12c0120
				     & anIntArrayArray546[arg4][arg6]))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if ((arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff)
			    || i < arg4 || -arg1 + arg3 != arg6
			    || 0 != (anIntArrayArray546[arg4][i_87_]
				     & 0x12c0102))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		do {
		    boolean bool;
		    try {
			if ((arg5 ^ 0xffffffff) != (-arg1 + arg4 ^ 0xffffffff)
			    || arg6 > arg3
			    || (arg3 ^ 0xffffffff) < (i_87_ ^ 0xffffffff)
			    || (0x12c0108 & anIntArrayArray546[i][arg3]) != 0)
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_705_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    if ((arg5 ^ 0xffffffff) != (arg4 - -1 ^ 0xffffffff)
			|| arg6 > arg3
			|| (arg3 ^ 0xffffffff) < (i_87_ ^ 0xffffffff)
			|| (0x12c0180 & anIntArrayArray546[arg5][arg3]) != 0)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_705_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg7 == 18288)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_705_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("dm.L(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ')'));
    }
    
    public void method1077(int arg0, int arg1, boolean arg2, int arg3,
			   int arg4, int arg5) {
	try {
	    arg4 -= anInt545;
	    if (arg1 != -1)
		method1074(96, -126);
	    arg5 -= anInt532;
	    if (arg0 == 0) {
		if (arg3 == 0) {
		    method1083(128, arg5, (byte) 99, arg4);
		    method1083(8, -1 + arg5, (byte) 88, arg4);
		}
		if (1 == arg3) {
		    method1083(2, arg5, (byte) 111, arg4);
		    method1083(32, arg5, (byte) 92, arg4 - -1);
		}
		if ((arg3 ^ 0xffffffff) == -3) {
		    method1083(8, arg5, (byte) 100, arg4);
		    method1083(128, arg5 - -1, (byte) 115, arg4);
		}
		if (arg3 == 3) {
		    method1083(32, arg5, (byte) 103, arg4);
		    method1083(2, arg5, (byte) 94, -1 + arg4);
		}
	    }
	    if (arg0 == 1 || arg0 == 3) {
		if ((arg3 ^ 0xffffffff) == -1) {
		    method1083(1, arg5, (byte) 96, arg4);
		    method1083(16, -1 + arg5, (byte) 73, arg4 + 1);
		}
		if (1 == arg3) {
		    method1083(4, arg5, (byte) 99, arg4);
		    method1083(64, 1 + arg5, (byte) 127, arg4 - -1);
		}
		if (2 == arg3) {
		    method1083(16, arg5, (byte) 116, arg4);
		    method1083(1, arg5 - -1, (byte) 109, arg4 - 1);
		}
		if (-4 == (arg3 ^ 0xffffffff)) {
		    method1083(64, arg5, (byte) 109, arg4);
		    method1083(4, -1 + arg5, (byte) 74, arg4 - 1);
		}
	    }
	    if (-3 == (arg0 ^ 0xffffffff)) {
		if ((arg3 ^ 0xffffffff) == -1) {
		    method1083(130, arg5, (byte) 118, arg4);
		    method1083(8, arg5 - 1, (byte) 103, arg4);
		    method1083(32, arg5, (byte) 92, arg4 + 1);
		}
		if (1 == arg3) {
		    method1083(10, arg5, (byte) 80, arg4);
		    method1083(32, arg5, (byte) 112, arg4 - -1);
		    method1083(128, arg5 + 1, (byte) 99, arg4);
		}
		if (2 == arg3) {
		    method1083(40, arg5, (byte) 120, arg4);
		    method1083(128, 1 + arg5, (byte) 81, arg4);
		    method1083(2, arg5, (byte) 98, -1 + arg4);
		}
		if (arg3 == 3) {
		    method1083(160, arg5, (byte) 85, arg4);
		    method1083(2, arg5, (byte) 103, arg4 - 1);
		    method1083(8, arg5 + -1, (byte) 89, arg4);
		}
	    }
	    anInt539++;
	    if (arg2) {
		if ((arg0 ^ 0xffffffff) == -1) {
		    if (arg3 == 0) {
			method1083(65536, arg5, (byte) 125, arg4);
			method1083(4096, -1 + arg5, (byte) 96, arg4);
		    }
		    if ((arg3 ^ 0xffffffff) == -2) {
			method1083(1024, arg5, (byte) 80, arg4);
			method1083(16384, arg5, (byte) 118, arg4 - -1);
		    }
		    if (arg3 == 2) {
			method1083(4096, arg5, (byte) 96, arg4);
			method1083(65536, 1 + arg5, (byte) 77, arg4);
		    }
		    if (3 == arg3) {
			method1083(16384, arg5, (byte) 80, arg4);
			method1083(1024, arg5, (byte) 80, arg4 + -1);
		    }
		}
		if ((arg0 ^ 0xffffffff) == -2 || 3 == arg0) {
		    if (-1 == (arg3 ^ 0xffffffff)) {
			method1083(512, arg5, (byte) 110, arg4);
			method1083(8192, arg5 + -1, (byte) 105, arg4 - -1);
		    }
		    if (-2 == (arg3 ^ 0xffffffff)) {
			method1083(2048, arg5, (byte) 117, arg4);
			method1083(32768, 1 + arg5, (byte) 77, arg4 - -1);
		    }
		    if ((arg3 ^ 0xffffffff) == -3) {
			method1083(8192, arg5, (byte) 104, arg4);
			method1083(512, 1 + arg5, (byte) 77, arg4 + -1);
		    }
		    if (3 == arg3) {
			method1083(32768, arg5, (byte) 127, arg4);
			method1083(2048, arg5 - 1, (byte) 100, -1 + arg4);
		    }
		}
		if (-3 == (arg0 ^ 0xffffffff)) {
		    if (0 == arg3) {
			method1083(66560, arg5, (byte) 78, arg4);
			method1083(4096, -1 + arg5, (byte) 105, arg4);
			method1083(16384, arg5, (byte) 104, arg4 - -1);
		    }
		    if ((arg3 ^ 0xffffffff) == -2) {
			method1083(5120, arg5, (byte) 78, arg4);
			method1083(16384, arg5, (byte) 82, 1 + arg4);
			method1083(65536, 1 + arg5, (byte) 126, arg4);
		    }
		    if (-3 == (arg3 ^ 0xffffffff)) {
			method1083(20480, arg5, (byte) 88, arg4);
			method1083(65536, arg5 + 1, (byte) 103, arg4);
			method1083(1024, arg5, (byte) 88, arg4 + -1);
		    }
		    if (arg3 == 3) {
			method1083(81920, arg5, (byte) 107, arg4);
			method1083(1024, arg5, (byte) 81, arg4 + -1);
			method1083(4096, -1 + arg5, (byte) 109, arg4);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.S(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public boolean method1078(int arg0, int arg1, int arg2, int arg3,
			      byte arg4, int arg5, int arg6, int arg7,
			      int arg8) {
    while_707_:
	do {
	while_706_:
	    do {
		do {
		    boolean bool;
		    try {
			anInt567++;
			if (-2 <= (arg7 ^ 0xffffffff))
			    break while_706_;
			if (!method1079(arg7, arg2, arg1, arg8, arg6, arg0,
					arg5, arg7, (byte) -84))
			    break;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_707_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    bool = method1063(arg8, arg6, arg5, arg3, 2, arg7, arg0,
				      arg1, arg7, arg2);
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    int i;
	    int i_88_;
	    do {
		boolean bool;
		try {
		    i = -1 + arg5 + arg8;
		    i_88_ = -1 + arg1 + arg6;
		    if (arg2 < arg5 || (arg2 ^ 0xffffffff) < (i ^ 0xffffffff)
			|| (arg0 ^ 0xffffffff) > (arg6 ^ 0xffffffff)
			|| arg0 > i_88_)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-1 + arg5 != arg2
			|| (arg6 ^ 0xffffffff) < (arg0 ^ 0xffffffff)
			|| i_88_ < arg0
			|| -1 != (0x8 & (anIntArrayArray546[-anInt532 + arg2]
					 [arg0 - anInt545])
				  ^ 0xffffffff)
			|| (0x8 & arg3 ^ 0xffffffff) != -1)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (i + 1 != arg2
			|| (arg0 ^ 0xffffffff) > (arg6 ^ 0xffffffff)
			|| (arg0 ^ 0xffffffff) < (i_88_ ^ 0xffffffff)
			|| 0 != ((anIntArrayArray546[-anInt532 + arg2]
				  [arg0 + -anInt545])
				 & 0x80)
			|| 0 != (arg3 & 0x2))
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg4 == -63)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg0 != arg6 + -1 || arg5 > arg2
			|| (i ^ 0xffffffff) > (arg2 ^ 0xffffffff)
			|| -1 != ((anIntArrayArray546[-anInt532 + arg2]
				   [-anInt545 + arg0]) & 0x2
				  ^ 0xffffffff)
			|| -1 != (arg3 & 0x4 ^ 0xffffffff))
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((arg0 ^ 0xffffffff) != (1 + i_88_ ^ 0xffffffff)
			|| arg2 < arg5
			|| (i ^ 0xffffffff) > (arg2 ^ 0xffffffff)
			|| 0 != (0x20 & (anIntArrayArray546[-anInt532 + arg2]
					 [arg0 + -anInt545]))
			|| (arg3 & 0x1) != 0)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_707_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("dm.M(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ')'));
    }
    
    public boolean method1079(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7, byte arg8) {
    while_708_:
	do {
	    do {
		boolean bool;
		try {
		    anInt541++;
		    if (arg8 < 0)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_708_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((arg6 + arg3 ^ 0xffffffff) < (arg1 ^ 0xffffffff)
			&& (arg6 ^ 0xffffffff) > (arg7 + arg1 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_708_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg5 < arg4 + arg2
			&& (arg0 + arg5 ^ 0xffffffff) < (arg4 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_708_;
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
					   ("dm.U(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ')'));
    }
    
    public void method1080(int arg0, int arg1, int arg2) {
	try {
	    arg0 -= anInt532;
	    arg2 -= anInt545;
	    anIntArrayArray546[arg0][arg2]
		= Class66.method1294(anIntArrayArray546[arg0][arg2], 2097152);
	    anInt550++;
	    if (arg1 > -57)
		anIntArrayArray546 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.Q(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class32(int arg0, int arg1) {
	try {
	    anInt545 = 0;
	    anInt548 = arg0;
	    anInt562 = arg1;
	    anInt532 = 0;
	    anIntArrayArray546 = new int[anInt548][anInt562];
	    method1071(true);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.<init>(" + arg0 + ','
						+ arg1 + ')'));
	}
    }
    
    public static void method1081(byte arg0) {
	try {
	    int i = -85 % ((45 - arg0) / 41);
	    try {
		if (Class14_Sub2_Sub19.aClass104_4037 == null)
		    Class14_Sub2_Sub19.aClass104_4037
			= new Class104(Class14_Sub8_Sub34.aClass43_4647,
				       Class14_Sub8_Sub7.method515
					   ((new Class124[]
					     { Class86.method1419((byte) 127),
					       Class59.aClass124_958 }),
					    (byte) -103)
					   .method1676((byte) -52));
	    } catch (Exception exception) {
		exception.printStackTrace();
		Class14_Sub2_Sub19.aClass104_4037 = null;
	    }
	    anInt543++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "dm.J(" + arg0 + ')');
	}
    }
    
    public static void method1082(int arg0, int arg1, int arg2) {
	try {
	    anInt561++;
	    int[] is = new int[4];
	    int i = 125 % ((arg2 - -29) / 60);
	    is[0] = arg0;
	    int[] is_89_ = new int[4];
	    int i_90_ = 1;
	    is_89_[0] = arg1;
	    for (int i_91_ = 0; -5 < (i_91_ ^ 0xffffffff); i_91_++) {
		if ((Class71.anIntArray1086[i_91_] ^ 0xffffffff)
		    != (arg0 ^ 0xffffffff)) {
		    is[i_90_] = Class71.anIntArray1086[i_91_];
		    is_89_[i_90_] = Class45.anIntArray737[i_91_];
		    i_90_++;
		}
	    }
	    Class45.anIntArray737 = is_89_;
	    Class71.anIntArray1086 = is;
	    Class14_Sub2_Sub11.method309(Class133_Sub1.aClass45Array3435,
					 -1 + (Class133_Sub1
					       .aClass45Array3435).length,
					 (byte) 99, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1083(int arg0, int arg1, byte arg2, int arg3) {
	try {
	    if (arg2 <= 69)
		method1069(114, -21, 84);
	    anIntArrayArray546[arg1][arg3]
		= Class14_Sub8_Sub26.method617(anIntArrayArray546[arg1][arg3],
					       arg0 ^ 0xffffffff);
	    anInt536++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dm.I(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    static {
	anIntArray535 = new int[anInt549];
	anInt551 = 0;
	anIntArray534 = new int[anInt549];
	anIntArray533 = new int[anInt549];
	aClass124Array542 = new Class124[anInt549];
	anInt566 = 0;
	anIntArray565 = new int[anInt549];
	anIntArray537 = new int[anInt549];
	anIntArray564 = new int[anInt549];
	anIntArray568 = new int[anInt549];
    }
}
