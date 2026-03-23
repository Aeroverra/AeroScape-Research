/* Class14_Sub8_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class14_Sub8_Sub6 extends Class14_Sub8
{
    public int anInt4169;
    public int anInt4170;
    public static int anInt4171;
    public static int anInt4172;
    public int anInt4173;
    public int anInt4174;
    public static int anInt4175;
    public int anInt4176 = 1024;
    public int anInt4177;
    public int anInt4178;
    public int anInt4179;
    public int anInt4180;
    public static int anInt4181;
    public static int anInt4182;
    public static int anInt4183;
    public static int anInt4184;
    public int anInt4185;
    public static Class52 aClass52_4186 = new Class52(5);
    public static int anInt4187;
    public static boolean aBoolean4188;
    public static Class124 aClass124_4189;
    public static int anInt4190 = 3;
    public static int[] anIntArray4191;
    public static Class124 aClass124_4192;
    public static Class9 aClass9_4193;
    public static byte[][][] aByteArrayArrayArray4194;
    
    public void method472(int arg0) {
	try {
	    if (arg0 != 0)
		method507(false, null, null);
	    anInt4171++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ef.I(" + arg0 + ')');
	}
    }
    
    public void method505(int arg0, int arg1, int arg2, int[][] arg3, int arg4,
			  Random arg5, int arg6) {
    while_313_:
	do {
	while_312_:
	    do {
	    while_311_:
		do {
		    int i;
		while_310_:
		    do {
			int i_0_;
			do {
			    try {
				anInt4175++;
				i = (0 >= anInt4178 ? 4096
				     : 4096 - Class138.method1949(arg5,
								  anInt4178,
								  -32640));
				if (arg1 >= -82)
				    aClass52_4186 = null;
				int i_1_ = anInt4177 * anInt4179 >> 952334988;
				i_0_ = (anInt4179
					+ -(0 >= i_1_ ? 0
					    : Class138.method1949(arg5, i_1_,
								  -32640)));
				if (Class112.anInt1876 <= arg0)
				    arg0 -= Class112.anInt1876;
				if (i_0_ <= 0)
				    break while_310_;
				if (arg2 > 0 && (arg4 ^ 0xffffffff) < -1)
				    break;
			    } catch (RuntimeException runtimeexception) {
				break while_312_;
			    }
			    return;
			} while (false);
			try {
			    int i_2_ = arg4 / 2;
			    int i_3_ = arg2 / 2;
			    int i_4_ = i_0_ > i_2_ ? i_2_ : i_0_;
			    int i_5_ = arg4 - 2 * i_4_;
			    int i_6_ = i_0_ > i_3_ ? i_3_ : i_0_;
			    int i_7_ = i_4_ + arg0;
			    for (int i_8_ = 0; i_8_ < arg2; i_8_++) {
				int[] is = arg3[arg6 + i_8_];
				if (i_6_ > i_8_) {
				    int i_9_ = i * i_8_ / i_6_;
				    if (0 == anInt4170) {
					for (int i_10_ = 0; i_4_ > i_10_;
					     i_10_++) {
					    int i_11_ = i_10_ * i / i_4_;
					    is[(Class14_Sub8_Sub26.method617
						(Class14_Sub10_Sub1.anInt4882,
						 i_10_ + arg0))]
						= is[(Class14_Sub8_Sub26
							  .method617
						      ((-i_10_ + (arg4 + arg0)
							+ -1),
						       (Class14_Sub10_Sub1
							.anInt4882)))]
						= i_11_ * i_9_ >> 1651662156;
					}
				    } else {
					for (int i_12_ = 0; i_4_ > i_12_;
					     i_12_++) {
					    int i_13_ = i * i_12_ / i_4_;
					    is[(Class14_Sub8_Sub26.method617
						(Class14_Sub10_Sub1.anInt4882,
						 arg0 - -i_12_))]
						= is[(Class14_Sub8_Sub26
							  .method617
						      ((-1 + (-i_12_ + arg0)
							+ arg4),
						       (Class14_Sub10_Sub1
							.anInt4882)))]
						= (((i_13_ ^ 0xffffffff)
						    <= (i_9_ ^ 0xffffffff))
						   ? i_9_ : i_13_);
					}
				    }
				    if ((Class112.anInt1876 ^ 0xffffffff)
					> (i_7_ + i_5_ ^ 0xffffffff)) {
					int i_14_ = Class112.anInt1876 - i_7_;
					Class72.method1324(is, i_7_, i_14_,
							   i_9_);
					Class72.method1324(is, 0,
							   -i_14_ + i_5_,
							   i_9_);
				    } else
					Class72.method1324(is, i_7_, i_5_,
							   i_9_);
				} else {
				    int i_15_ = -i_8_ + arg2 - 1;
				    if ((i_6_ ^ 0xffffffff)
					< (i_15_ ^ 0xffffffff)) {
					int i_16_ = i * i_15_ / i_6_;
					if ((anInt4170 ^ 0xffffffff) != -1) {
					    for (int i_17_ = 0;
						 ((i_4_ ^ 0xffffffff)
						  < (i_17_ ^ 0xffffffff));
						 i_17_++) {
						int i_18_ = i_17_ * i / i_4_;
						is[(Class14_Sub8_Sub26
							.method617
						    ((Class14_Sub10_Sub1
						      .anInt4882),
						     i_17_ + arg0))]
						    = is[(Class14_Sub8_Sub26
							      .method617
							  ((-1 + -i_17_
							    + (arg4 + arg0)),
							   (Class14_Sub10_Sub1
							    .anInt4882)))]
						    = (((i_16_ ^ 0xffffffff)
							< (i_18_ ^ 0xffffffff))
						       ? i_18_ : i_16_);
					    }
					} else {
					    for (int i_19_ = 0;
						 ((i_4_ ^ 0xffffffff)
						  < (i_19_ ^ 0xffffffff));
						 i_19_++) {
						int i_20_ = i * i_19_ / i_4_;
						is[(Class14_Sub8_Sub26
							.method617
						    ((Class14_Sub10_Sub1
						      .anInt4882),
						     arg0 - -i_19_))]
						    = is[(Class14_Sub8_Sub26
							      .method617
							  ((-1 + arg0 - -arg4
							    - i_19_),
							   (Class14_Sub10_Sub1
							    .anInt4882)))]
						    = (i_16_ * i_20_
						       >> 1189867564);
					    }
					}
					if (i_5_ + i_7_ <= Class112.anInt1876)
					    Class72.method1324(is, i_7_, i_5_,
							       i_16_);
					else {
					    int i_21_
						= Class112.anInt1876 + -i_7_;
					    Class72.method1324(is, i_7_, i_21_,
							       i_16_);
					    Class72.method1324(is, 0,
							       i_5_ + -i_21_,
							       i_16_);
					}
				    } else {
					for (int i_22_ = 0; i_4_ > i_22_;
					     i_22_++)
					    is[(Class14_Sub8_Sub26.method617
						(Class14_Sub10_Sub1.anInt4882,
						 i_22_ + arg0))]
						= is[(Class14_Sub8_Sub26
							  .method617
						      ((-1 + (arg0 + arg4)
							+ -i_22_),
						       (Class14_Sub10_Sub1
							.anInt4882)))]
						= i_22_ * i / i_4_;
					if ((i_5_ + i_7_ ^ 0xffffffff)
					    < (Class112.anInt1876
					       ^ 0xffffffff)) {
					    int i_23_
						= Class112.anInt1876 + -i_7_;
					    Class72.method1324(is, i_7_, i_23_,
							       i);
					    Class72.method1324(is, 0,
							       -i_23_ + i_5_,
							       i);
					} else
					    Class72.method1324(is, i_7_, i_5_,
							       i);
				    }
				}
			    }
			    break while_311_;
			} catch (RuntimeException runtimeexception) {
			    break while_312_;
			}
		    } while (false);
		    if (Class112.anInt1876 >= arg0 - -arg4) {
			for (int i_24_ = 0; arg2 > i_24_; i_24_++)
			    Class72.method1324(arg3[i_24_ + arg6], arg0, arg4,
					       i);
		    } else {
			int i_25_ = Class112.anInt1876 - arg0;
			for (int i_26_ = 0; i_26_ < arg2; i_26_++) {
			    int[] is = arg3[i_26_ + arg6];
			    Class72.method1324(is, arg0, i_25_, i);
			    Class72.method1324(is, 0, arg4 + -i_25_, i);
			}
		    }
		} while (false);
		break while_313_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ef.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ',' + arg6 + ')'));
	} while (false);
    }
    
    public static void method506(int arg0, Class124 arg1) {
    while_315_:
	do {
	while_314_:
	    do {
		int i;
		do {
		    try {
			anInt4184++;
			if (arg0 != 25514)
			    anInt4190 = 28;
			i = Class14_Sub8_Sub13.method546(arg1, -23861);
			if (i != -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_314_;
		    }
		    return;
		} while (false);
		try {
		    Class20.anInt427
			= (Class152.aClass146_2435.aShortArray2354[i]
			   + -Class65.anInt1034);
		    Class14_Sub18.anInt3050
			= (Class14_Sub8_Sub15.anInt4332 + -1
			   + (-Class152.aClass146_2435.aShortArray2361[i]
			      - -Class35.anInt603));
		    int i_27_
			= (Class20.anInt427
			   - (int) ((float) Class97.aClass94_1657.anInt1518
				    / Class90.aFloat1426));
		    int i_28_
			= (-(int) ((float) Class97.aClass94_1657.anInt1545
				   / Class90.aFloat1426)
			   + Class14_Sub18.anInt3050);
		    int i_29_
			= (Class20.anInt427
			   + (int) ((float) Class97.aClass94_1657.anInt1518
				    / Class90.aFloat1426));
		    if (i_27_ < 0)
			Class20.anInt427
			    = (int) ((float) Class97.aClass94_1657.anInt1518
				     / Class90.aFloat1426);
		    if ((i_29_ ^ 0xffffffff)
			< (Class14_Sub2_Sub9.anInt3856 ^ 0xffffffff))
			Class20.anInt427
			    = (-(int) ((float) Class97.aClass94_1657.anInt1518
				       / Class90.aFloat1426)
			       + Class14_Sub2_Sub9.anInt3856);
		    int i_30_
			= (Class14_Sub18.anInt3050
			   - -(int) ((float) Class97.aClass94_1657.anInt1545
				     / Class90.aFloat1426));
		    if (-1 < (i_28_ ^ 0xffffffff))
			Class14_Sub18.anInt3050
			    = (int) ((float) Class97.aClass94_1657.anInt1545
				     / Class90.aFloat1426);
		    if ((i_30_ ^ 0xffffffff)
			< (Class14_Sub8_Sub15.anInt4332 ^ 0xffffffff))
			Class14_Sub18.anInt3050
			    = (-(int) ((float) Class97.aClass94_1657.anInt1545
				       / Class90.aFloat1426)
			       + Class14_Sub8_Sub15.anInt4332);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_315_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ef.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static Class146 method507(boolean arg0, Class124 arg1,
				     Class9 arg2) {
    while_316_:
	do {
	    int i;
	    do {
		Class146 class146;
		try {
		    anInt4172++;
		    i = arg2.method146(arg1, 0);
		    if (-1 != i)
			break;
		    class146 = new Class146(0);
		} catch (RuntimeException runtimeexception) {
		    break while_316_;
		}
		return class146;
	    } while (false);
	    Class146 class146;
	    try {
		int[] is = arg2.method176((byte) 78, i);
		if (arg0 != true)
		    anInt4190 = 7;
		Class146 class146_31_ = new Class146(is.length);
		for (int i_32_ = 0; i_32_ < class146_31_.anInt2353; i_32_++) {
		    Class14_Sub10 class14_sub10
			= new Class14_Sub10(arg2.method163(is[i_32_], i, 0));
		    class146_31_.aClass124Array2362[i_32_]
			= class14_sub10.method797(9467);
		    class146_31_.aByteArray2355[i_32_]
			= class14_sub10.method780((byte) -77);
		    class146_31_.aShortArray2354[i_32_]
			= (short) class14_sub10.method784((byte) 126);
		    class146_31_.aShortArray2361[i_32_]
			= (short) class14_sub10.method784((byte) 122);
		    class146_31_.anIntArray2350[i_32_]
			= class14_sub10.method812((byte) -108);
		}
		class146 = class146_31_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class146;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ef.B(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public int[] method484(int arg0, byte arg1) {
    while_318_:
	do {
	    int[] is;
	while_317_:
	    do {
		int[][] is_33_;
		int i;
		int i_34_;
		int i_35_;
		int i_36_;
		boolean bool;
		int i_37_;
		boolean bool_38_;
		int i_39_;
		int i_40_;
		int i_41_;
		int i_42_;
		int i_43_;
		int i_44_;
		do {
		    int[] is_45_;
		    try {
			if (arg1 > -58)
			    method506(-9, null);
			is = aClass149_2851.method2014(arg0, (byte) 111);
			anInt4183++;
			if (!aClass149_2851.aBoolean2402)
			    break while_317_;
			is_33_ = aClass149_2851.method2019(true);
			i = 0;
			i_34_ = 0;
			i_35_ = 0;
			i_36_ = 0;
			bool = true;
			i_37_ = 0;
			bool_38_ = true;
			i_39_ = 0;
			i_40_ = 0;
			i_41_ = Class112.anInt1876 * anInt4173 >> -571934548;
			i_42_ = anInt4169 * Class17.anInt407 >> -719867828;
			i_43_ = anInt4180 * Class17.anInt407 >> 1299855468;
			i_44_ = anInt4174 * Class112.anInt1876 >> 415718028;
			if (1 < i_43_)
			    break;
			is_45_ = is_33_[arg0];
		    } catch (RuntimeException runtimeexception) {
			break while_318_;
		    }
		    return is_45_;
		} while (false);
		try {
		    anInt4179
			= anInt4176 * (Class112.anInt1876 / 8) >> -593660916;
		    int i_46_ = Class112.anInt1876 / i_41_ + 1;
		    int[][] is_47_ = new int[i_46_][3];
		    Random random = new Random((long) anInt4185);
		    int[][] is_48_ = new int[i_46_][3];
		    for (;;) {
			int i_49_ = Class138.method1949(random, -i_41_ + i_44_,
							-32640) + i_41_;
			int i_50_
			    = (i_42_
			       - -Class138.method1949(random, -i_42_ + i_43_,
						      -32640));
			int i_51_ = i_49_ + i_37_;
			if (i_51_ > Class112.anInt1876) {
			    i_51_ = Class112.anInt1876;
			    i_49_ = Class112.anInt1876 - i_37_;
			}
			int i_52_;
			if (bool_38_)
			    i_52_ = 0;
			else {
			    int i_53_ = i_36_;
			    int[] is_54_ = is_47_[i_36_];
			    i_52_ = is_54_[2];
			    int i_55_ = 0;
			    int i_56_ = i + i_51_;
			    if ((i_56_ ^ 0xffffffff) > -1)
				i_56_ += Class112.anInt1876;
			    if ((i_56_ ^ 0xffffffff)
				< (Class112.anInt1876 ^ 0xffffffff))
				i_56_ -= Class112.anInt1876;
			    for (;;) {
				int[] is_57_ = is_47_[i_53_];
				if ((i_56_ ^ 0xffffffff) <= (is_57_[0]
							     ^ 0xffffffff)
				    && ((is_57_[1] ^ 0xffffffff)
					<= (i_56_ ^ 0xffffffff)))
				    break;
				if ((i_39_ ^ 0xffffffff)
				    >= (++i_53_ ^ 0xffffffff))
				    i_53_ = 0;
				i_55_++;
			    }
			    if (i_53_ != i_36_) {
				int i_58_ = i + i_37_;
				if (i_58_ < 0)
				    i_58_ += Class112.anInt1876;
				if (i_58_ > Class112.anInt1876)
				    i_58_ -= Class112.anInt1876;
				for (int i_59_ = 1; i_59_ <= i_55_; i_59_++) {
				    int[] is_60_
					= is_47_[(i_36_ - -i_59_) % i_39_];
				    i_52_ = Math.max(i_52_, is_60_[2]);
				}
				for (int i_61_ = 0;
				     ((i_61_ ^ 0xffffffff)
				      >= (i_55_ ^ 0xffffffff));
				     i_61_++) {
				    int[] is_62_
					= is_47_[(i_36_ - -i_61_) % i_39_];
				    int i_63_ = is_62_[2];
				    if ((i_63_ ^ 0xffffffff)
					!= (i_52_ ^ 0xffffffff)) {
					int i_64_ = is_62_[0];
					int i_65_ = is_62_[1];
					int i_66_;
					int i_67_;
					if ((i_58_ ^ 0xffffffff)
					    > (i_56_ ^ 0xffffffff)) {
					    i_66_ = Math.max(i_58_, i_64_);
					    i_67_ = Math.min(i_56_, i_65_);
					} else if (-1
						   == (i_64_ ^ 0xffffffff)) {
					    i_66_ = 0;
					    i_67_ = Math.min(i_56_, i_65_);
					} else {
					    i_66_ = Math.max(i_58_, i_64_);
					    i_67_ = Class112.anInt1876;
					}
					method505(i_35_ + i_66_, -93,
						  -i_63_ + i_52_, is_33_,
						  -i_66_ + i_67_, random,
						  i_63_);
				    }
				}
			    }
			    i_36_ = i_53_;
			}
			if ((i_52_ + i_50_ ^ 0xffffffff)
			    >= (Class17.anInt407 ^ 0xffffffff))
			    bool = false;
			else
			    i_50_ = Class17.anInt407 + -i_52_;
			if ((i_51_ ^ 0xffffffff)
			    != (Class112.anInt1876 ^ 0xffffffff)) {
			    int[] is_68_ = is_48_[i_40_++];
			    is_68_[0] = i_37_;
			    is_68_[1] = i_51_;
			    is_68_[2] = i_50_ + i_52_;
			    method505(i_37_ - -i_34_, -111, i_50_, is_33_,
				      i_49_, random, i_52_);
			    i_37_ = i_51_;
			} else {
			    method505(i_34_ + i_37_, -122, i_50_, is_33_,
				      i_49_, random, i_52_);
			    if (bool)
				break;
			    i_35_ = i_34_;
			    int[] is_69_ = is_48_[i_40_++];
			    bool = true;
			    bool_38_ = false;
			    i_36_ = 0;
			    i_39_ = i_40_;
			    is_69_[0] = i_37_;
			    int[][] is_70_ = is_47_;
			    is_47_ = is_48_;
			    i_37_ = 0;
			    is_69_[1] = i_51_;
			    is_48_ = is_70_;
			    i_40_ = 0;
			    is_69_[2] = i_52_ + i_50_;
			    i_34_ = Class138.method1949(random,
							Class112.anInt1876,
							-32640);
			    i = -i_35_ + i_34_;
			    int i_71_ = i;
			    if ((i_71_ ^ 0xffffffff) > -1)
				i_71_ += Class112.anInt1876;
			    if ((Class112.anInt1876 ^ 0xffffffff)
				> (i_71_ ^ 0xffffffff))
				i_71_ -= Class112.anInt1876;
			    for (;;) {
				int[] is_72_ = is_47_[i_36_];
				if ((is_72_[0] ^ 0xffffffff) >= (i_71_
								 ^ 0xffffffff)
				    && ((is_72_[1] ^ 0xffffffff)
					<= (i_71_ ^ 0xffffffff)))
				    break;
				if (i_39_ <= ++i_36_)
				    i_36_ = 0;
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break while_318_;
		}
	    } while (false);
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ef.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_325_:
	    do {
	    while_324_:
		do {
		while_323_:
		    do {
		    while_322_:
			do {
			while_321_:
			    do {
			    while_320_:
				do {
				while_319_:
				    do {
					do {
					    if (0 != i) {
						if (-2 != (i ^ 0xffffffff)) {
						    if (2 != i) {
							if (-4
							    != (i
								^ 0xffffffff)) {
							    if (4 != i) {
								if (i != 5) {
								    if (-7
									!= (i
									    ^ 0xffffffff)) {
									if ((i
									     ^ 0xffffffff)
									    != -8) {
									    if (-9 == (i ^ 0xffffffff))
										break while_324_;
									    break while_325_;
									}
								    } else
									break while_322_;
								    break while_323_;
								}
							    } else
								break while_320_;
							    break while_321_;
							}
						    } else
							break;
						    break while_319_;
						}
					    } else {
						anInt4185
						    = arg2.method798(arg1
								     + -24809);
						break while_325_;
					    }
					    anInt4173
						= arg2.method784((byte) 103);
					    break while_325_;
					} while (false);
					anInt4174 = arg2.method784((byte) 104);
					break while_325_;
				    } while (false);
				    anInt4169 = arg2.method784((byte) 112);
				    break while_325_;
				} while (false);
				anInt4180 = arg2.method784((byte) 106);
				break while_325_;
			    } while (false);
			    anInt4176 = arg2.method784((byte) 123);
			    break while_325_;
			} while (false);
			anInt4170 = arg2.method798(87);
			break while_325_;
		    } while (false);
		    anInt4177 = arg2.method784((byte) 106);
		    break while_325_;
		} while (false);
		anInt4178 = arg2.method784((byte) 117);
	    } while (false);
	    if (arg1 != 24777)
		method475(-107, 94, null);
	    anInt4182++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ef.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method508(byte arg0) {
    while_327_:
	do {
	while_326_:
	    do {
		do {
		    try {
			if (arg0 == -123)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_326_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_4189 = null;
		    aClass124_4192 = null;
		    aClass52_4186 = null;
		    anIntArray4191 = null;
		    aByteArrayArrayArray4194 = null;
		    aClass9_4193 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_327_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ef.G(" + arg0 + ')');
	} while (false);
    }
    
    public static void method509(int arg0, int arg1, int arg2, boolean arg3,
				 Class46 arg4, int arg5) {
    while_329_:
	do {
	while_328_:
	    do {
		do {
		    try {
			anInt4181++;
			if ((Class2.anInt96 ^ 0xffffffff) > -51)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_328_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg4.anIntArrayArray776 != null
			    && ((arg4.anIntArrayArray776.length ^ 0xffffffff)
				< (arg1 ^ 0xffffffff))
			    && arg4.anIntArrayArray776[arg1] != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_328_;
		    }
		    return;
		} while (false);
		int i;
		int i_73_;
		int i_74_;
		do {
		    try {
			int i_75_ = arg4.anIntArrayArray776[arg1][0];
			i = i_75_ >> -1001757560;
			i_73_ = i_75_ & 0xf;
			int i_76_ = 31 / ((-39 - arg2) / 61);
			i_74_ = i_75_ >> -274441948 & 0x7;
			if (arg4.anIntArrayArray776[arg1].length > 1) {
			    int i_77_
				= (int) ((double) (arg4.anIntArrayArray776
						   [arg1]).length
					 * Math.random());
			    if ((i_77_ ^ 0xffffffff) < -1)
				i = arg4.anIntArrayArray776[arg1][i_77_];
			}
			if (i_73_ != 0)
			    break;
			if (arg3)
			    Class47.method1181(i_74_, i, 0, (byte) -125);
		    } catch (RuntimeException runtimeexception) {
			break while_328_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if ((Class100.anInt1691 ^ 0xffffffff) != -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_328_;
		    }
		    return;
		} while (false);
		try {
		    Class153.anIntArray2454[Class2.anInt96] = i;
		    Class14_Sub2_Sub19.anIntArray4052[Class2.anInt96] = i_74_;
		    int i_78_ = (arg0 + -64) / 128;
		    int i_79_ = (-64 + arg5) / 128;
		    Class14_Sub2_Sub14.anIntArray3949[Class2.anInt96] = 0;
		    Class137.aClass91Array2197[Class2.anInt96] = null;
		    Class116.anIntArray1928[Class2.anInt96]
			= i_73_ + (i_78_ << 1184726384) + (i_79_
							   << -1992769240);
		    Class2.anInt96++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_329_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ef.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub6() {
	super(0, true);
	anInt4174 = 2048;
	anInt4170 = 0;
	anInt4173 = 1024;
	anInt4178 = 1024;
	anInt4169 = 409;
	anInt4180 = 819;
	anInt4177 = 1024;
	anInt4185 = 0;
    }
    
    static {
	aBoolean4188 = false;
	aClass124_4189 = Class14_Sub2_Sub2.method263(1178, ":chalreq:");
	aClass124_4192 = Class14_Sub2_Sub2.method263(1178, "_labels");
    }
}
