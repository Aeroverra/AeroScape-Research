/* Class14_Sub8_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub24 extends Class14_Sub8
{
    public static int anInt4483;
    public int anInt4484;
    public int anInt4485 = 0;
    public static Class9 aClass9_4486;
    public int anInt4487;
    public static int anInt4488;
    public static int anInt4489;
    public int anInt4490;
    public static int anInt4491;
    public int anInt4492;
    public static int anInt4493;
    public static int anInt4494;
    public int anInt4495;
    public static short[][] aShortArrayArray4496;
    public int anInt4497;
    public int anInt4498;
    public static Class124[] aClass124Array4499 = new Class124[1000];
    public static int anInt4500;
    public static int anInt4501;
    public static int anInt4502;
    public static int anInt4503 = -1;
    public int anInt4504;
    
    public static Class142 method605(int arg0, int arg1) {
    while_425_:
	do {
	    do {
		Class142 class142;
		try {
		    anInt4494++;
		    Class142 class142_0_
			= (Class142) Class133_Sub1_Sub1.aClass52_4926
					 .method1210((byte) 57, (long) arg1);
		    if (class142_0_ == null)
			break;
		    class142 = class142_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_425_;
		}
		return class142;
	    } while (false);
	    Class142 class142;
	    try {
		byte[] is = (Class15.aClass9_384.method163
			     (Class7.method116(arg1, 14719),
			      Class7.method115((byte) 124, arg1), 0));
		Class142 class142_1_ = new Class142();
		class142_1_.anInt2276 = arg1;
		if (null != is)
		    class142_1_.method1971(new Class14_Sub10(is), true);
		class142_1_.method1967(78);
		if (class142_1_.anInt2316 != -1)
		    class142_1_.method1968(method605(123,
						     class142_1_.anInt2316),
					   method605(97,
						     class142_1_.anInt2268),
					   117);
		if (-1 != class142_1_.anInt2305)
		    class142_1_.method1966(method605(93,
						     class142_1_.anInt2305),
					   -126,
					   method605(86,
						     class142_1_.anInt2257));
		if (arg0 < 58)
		    method605(37, -42);
		if (!Class14_Sub3.aBoolean2752 && class142_1_.aBoolean2306) {
		    class142_1_.aBoolean2275 = false;
		    class142_1_.aClass124Array2263 = null;
		    class142_1_.anInt2310 = 0;
		    class142_1_.aClass124_2296 = Class133_Sub3.aClass124_3568;
		    class142_1_.aClass124Array2304 = null;
		}
		Class133_Sub1_Sub1.aClass52_4926
		    .method1205((byte) -93, class142_1_, (long) arg1);
		class142 = class142_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class142;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ni.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method606(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
    while_427_:
	do {
	while_426_:
	    do {
		int i;
		int i_2_;
		int i_3_;
		int i_4_;
		int i_5_;
		int i_6_;
		int i_7_;
		int i_8_;
		int i_9_;
		int i_10_;
		int i_11_;
		int i_12_;
		int i_13_;
		int i_14_;
		int i_15_;
		int i_16_;
		int i_17_;
		do {
		    try {
			anInt4502++;
			i = 0;
			i_2_ = 0;
			i_3_ = arg2;
			i_4_ = -arg1 + arg6;
			int i_18_ = arg6 * arg6;
			i_5_ = arg2 - arg1;
			int i_19_ = i_5_ * i_5_;
			int i_20_ = arg2 * arg2;
			int i_21_ = i_18_ << 121038977;
			int i_22_ = i_4_ * i_4_;
			int i_23_ = i_19_ << 2071908641;
			int i_24_ = i_20_ << 1439128481;
			int i_25_ = i_22_ << 915499105;
			int i_26_ = arg2 << 417362849;
			i_6_ = -(i_21_ * (-1 + i_26_)) + i_20_;
			int i_27_ = i_5_ << 464259393;
			i_7_ = i_18_ * (-i_26_ + 1) - -i_24_;
			i_8_ = i_23_ + (-i_27_ + 1) * i_22_;
			i_9_ = i_20_ << 1540366722;
			i_10_ = i_19_ + -(i_25_ * (i_27_ + -1));
			i_11_ = i_18_ << -1823808382;
			i_12_ = i_22_ << -2115370174;
			i_13_ = i_19_ << 88598530;
			i_14_ = 3 * i_24_;
			i_15_ = 3 * i_23_;
			i_16_ = (-3 + i_26_) * i_21_;
			i_17_ = i_25_ * (i_27_ - 3);
			if (arg4 == -15882)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_426_;
		    }
		    return;
		} while (false);
		try {
		    int i_28_ = i_9_;
		    int i_29_ = i_11_ * (-1 + arg2);
		    int i_30_ = i_13_;
		    int i_31_ = (-1 + i_5_) * i_12_;
		    int[] is = Class14_Sub2_Sub19.anIntArrayArray4038[arg3];
		    Class51.method1201(is, -arg6 + arg7, -i_4_ + arg7, -5973,
				       arg5);
		    Class51.method1201(is, -i_4_ + arg7, i_4_ + arg7, -5973,
				       arg0);
		    Class51.method1201(is, arg7 + i_4_, arg7 - -arg6, -5973,
				       arg5);
		    while (-1 > (i_3_ ^ 0xffffffff)) {
			if (-1 < (i_7_ ^ 0xffffffff)) {
			    while (0 > i_7_) {
				i_6_ += i_28_;
				i++;
				i_28_ += i_9_;
				i_7_ += i_14_;
				i_14_ += i_9_;
			    }
			}
			if (i_6_ < 0) {
			    i_7_ += i_14_;
			    i_14_ += i_9_;
			    i++;
			    i_6_ += i_28_;
			    i_28_ += i_9_;
			}
			i_6_ += -i_16_;
			i_16_ -= i_11_;
			boolean bool = i_5_ >= i_3_;
			i_7_ += -i_29_;
			int i_32_ = i + arg7;
			if (bool) {
			    if (0 > i_8_) {
				while (0 > i_8_) {
				    i_2_++;
				    i_10_ += i_30_;
				    i_8_ += i_15_;
				    i_15_ += i_13_;
				    i_30_ += i_13_;
				}
			    }
			    if ((i_10_ ^ 0xffffffff) > -1) {
				i_2_++;
				i_8_ += i_15_;
				i_10_ += i_30_;
				i_15_ += i_13_;
				i_30_ += i_13_;
			    }
			    i_10_ += -i_17_;
			    i_8_ += -i_31_;
			    i_17_ -= i_12_;
			    i_31_ -= i_12_;
			}
			i_29_ -= i_11_;
			int i_33_ = arg7 + -i;
			i_3_--;
			int i_34_ = arg3 - i_3_;
			int i_35_ = arg3 - -i_3_;
			if (!bool) {
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_34_]),
					       i_33_, i_32_, -5973, arg5);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_35_]),
					       i_33_, i_32_, -5973, arg5);
			} else {
			    int i_36_ = arg7 - -i_2_;
			    int i_37_ = -i_2_ + arg7;
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_34_]),
					       i_33_, i_37_, -5973, arg5);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_34_]),
					       i_37_, i_36_, -5973, arg0);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_34_]),
					       i_36_, i_32_, -5973, arg5);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_35_]),
					       i_33_, i_37_, -5973, arg5);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_35_]),
					       i_37_, i_36_, -5973, arg0);
			    Class51.method1201((Class14_Sub2_Sub19
						.anIntArrayArray4038[i_35_]),
					       i_36_, i_32_, arg4 ^ 0x295d,
					       arg5);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_427_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ni.J(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	} while (false);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    if (arg1 != 24777)
		method474(-87, 90);
	    int i = arg0;
	while_428_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if (i == 2)
				break;
			    break while_428_;
			}
		    } else {
			anInt4485 = arg2.method805(arg1 + -24777);
			break while_428_;
		    }
		    anInt4504
			= (arg2.method780((byte) -77) << 1484096460) / 100;
		    break while_428_;
		} while (false);
		anInt4484 = (arg2.method780((byte) -77) << -1108440436) / 100;
	    } while (false);
	    anInt4493++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ni.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class14_Sub8_Sub24() {
	super(1, false);
	anInt4484 = 0;
	anInt4504 = 0;
    }
    
    public void method607(int arg0, int arg1, byte arg2, int arg3) {
	try {
	    anInt4500++;
	    int i = (-2049 > (arg0 ^ 0xffffffff)
		     ? -(arg1 * arg0 >> 393384012) + (arg0 + arg1)
		     : (4096 + arg1) * arg0 >> -1141578996);
	    if (arg2 != 60)
		method611(-32, null);
	    if (0 < i) {
		arg3 *= 6;
		int i_38_ = arg0 + (arg0 - i);
		int i_39_ = (-i_38_ + i << -1168804052) / i;
		int i_40_ = arg3 >> -449815092;
		int i_41_ = arg3 + -(i_40_ << -673528436);
		int i_42_ = i;
		i_42_ = i_42_ * i_39_ >> -2087712500;
		i_42_ = i_42_ * i_41_ >> -1665424404;
		int i_43_ = i_42_ + i_38_;
		int i_44_ = -i_42_ + i;
		int i_45_ = i_40_;
	    while_432_:
		do {
		while_431_:
		    do {
		    while_430_:
			do {
			while_429_:
			    do {
				do {
				    if (0 != i_45_) {
					if (i_45_ != 1) {
					    if ((i_45_ ^ 0xffffffff) != -3) {
						if (i_45_ != 3) {
						    if (4 != i_45_) {
							if (-6
							    != (i_45_
								^ 0xffffffff))
							    break while_432_;
						    } else
							break while_430_;
						    break while_431_;
						}
					    } else
						break;
					    break while_429_;
					}
				    } else {
					anInt4487 = i_38_;
					anInt4490 = i;
					anInt4497 = i_43_;
					break while_432_;
				    }
				    anInt4487 = i_38_;
				    anInt4490 = i_44_;
				    anInt4497 = i;
				    break while_432_;
				} while (false);
				anInt4490 = i_38_;
				anInt4497 = i;
				anInt4487 = i_43_;
				break while_432_;
			    } while (false);
			    anInt4487 = i;
			    anInt4490 = i_38_;
			    anInt4497 = i_44_;
			    break while_432_;
			} while (false);
			anInt4497 = i_38_;
			anInt4487 = i;
			anInt4490 = i_43_;
			break while_432_;
		    } while (false);
		    anInt4490 = i;
		    anInt4497 = i_38_;
		    anInt4487 = i_44_;
		} while (false);
	    } else
		anInt4490 = anInt4497 = anInt4487 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ni.L(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public static void method608(int arg0, boolean arg1, int arg2, int arg3,
				 byte[] arg4, int arg5, byte arg6,
				 Class32[] arg7) {
	try {
	    anInt4501++;
	    if (arg6 <= 16)
		method605(-106, 125);
	    if (!arg1) {
		for (int i = 0; 4 > i; i++) {
		    for (int i_46_ = 0; 64 > i_46_; i_46_++) {
			for (int i_47_ = 0; -65 < (i_47_ ^ 0xffffffff);
			     i_47_++) {
			    if ((arg5 + i_46_ ^ 0xffffffff) < -1
				&& 103 > i_46_ + arg5 && 0 < i_47_ + arg3
				&& i_47_ + arg3 < 103)
				arg7[i].anIntArrayArray546[arg5 + i_46_]
				    [i_47_ + arg3]
				    = (Class14_Sub8_Sub26.method617
				       ((arg7[i].anIntArrayArray546
					 [arg5 + i_46_][i_47_ + arg3]),
					-16777217));
			}
		    }
		}
	    }
	    Class14_Sub10 class14_sub10 = new Class14_Sub10(arg4);
	    int i;
	    if (arg1)
		i = 1;
	    else
		i = 4;
	    for (int i_48_ = 0; (i_48_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_48_++) {
		for (int i_49_ = 0; (i_49_ ^ 0xffffffff) > -65; i_49_++) {
		    for (int i_50_ = 0; (i_50_ ^ 0xffffffff) > -65; i_50_++)
			Class125_Sub3.method1737(arg1, 16482, i_48_,
						 class14_sub10, 0, arg0, arg2,
						 arg5 + i_49_, arg3 + i_50_);
		}
	    }
	    if (!arg1) {
		Class71 class71 = null;
		while (class14_sub10.anInt2908
		       < class14_sub10.aByteArray2895.length) {
		    int i_51_ = class14_sub10.method798(124);
		    if ((i_51_ ^ 0xffffffff) != -1) {
			if (-2 != (i_51_ ^ 0xffffffff))
			    throw new IllegalStateException();
			int i_52_ = class14_sub10.method798(-14);
			if (i_52_ > 0) {
			    for (int i_53_ = 0;
				 (i_53_ ^ 0xffffffff) > (i_52_ ^ 0xffffffff);
				 i_53_++) {
				Class73 class73 = new Class73(class14_sub10);
				class73.anInt1124 += arg3 << -117128057;
				int i_54_ = class73.anInt1124 >> 1814044007;
				class73.anInt1128 += arg5 << -1395900473;
				int i_55_ = class73.anInt1128 >> 601964967;
				if (-1 >= (i_55_ ^ 0xffffffff) && 0 <= i_54_
				    && -105 < (i_55_ ^ 0xffffffff)
				    && (i_54_ ^ 0xffffffff) > -105) {
				    class73.anInt1104
					= (-class73.anInt1104
					   + (Class114.anIntArrayArrayArray1896
					      [class73.anInt1125][i_55_]
					      [i_54_]));
				    Class10.method200(class73);
				}
			    }
			}
		    } else
			class71 = new Class71(class14_sub10);
		}
		if (class71 == null)
		    class71 = new Class71();
		for (int i_56_ = 0; (i_56_ ^ 0xffffffff) > -9; i_56_++) {
		    for (int i_57_ = 0; (i_57_ ^ 0xffffffff) > -9; i_57_++) {
			int i_58_ = i_57_ + (arg3 >> 551882627);
			int i_59_ = (arg5 >> -190000349) - -i_56_;
			if (-1 >= (i_59_ ^ 0xffffffff) && i_59_ < 13
			    && i_58_ >= 0 && (i_58_ ^ 0xffffffff) > -14)
			    Class150.aClass71ArrayArray2421[i_59_][i_58_]
				= class71;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ni.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ',' + arg6 + ','
						+ (arg7 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method609(int arg0, int arg1, int arg2, byte arg3) {
	try {
	    anInt4489++;
	    int i = arg0 <= arg1 ? arg0 : arg1;
	    if (arg3 != 53)
		method474(92, -3);
	    i = i > arg2 ? arg2 : i;
	    int i_60_ = arg1 > arg0 ? arg1 : arg0;
	    i_60_ = (arg2 ^ 0xffffffff) >= (i_60_ ^ 0xffffffff) ? i_60_ : arg2;
	    int i_61_ = -i + i_60_;
	    anInt4492 = (i_60_ + i) / 2;
	    if (-1 > (anInt4492 ^ 0xffffffff)
		&& -4097 < (anInt4492 ^ 0xffffffff))
		anInt4495 = ((i_61_ << -1728490612)
			     / (-2049 > (anInt4492 ^ 0xffffffff)
				? -(2 * anInt4492) + 8192 : 2 * anInt4492));
	    else
		anInt4495 = 0;
	    if (0 >= i_61_)
		anInt4498 = 0;
	    else {
		int i_62_ = (-arg1 + i_60_ << -1047579188) / i_61_;
		int i_63_ = (i_60_ + -arg0 << 1548333804) / i_61_;
		int i_64_ = (-arg2 + i_60_ << 62432428) / i_61_;
		if (i_60_ == arg1)
		    anInt4498 = ((arg0 ^ 0xffffffff) == (i ^ 0xffffffff)
				 ? 20480 - -i_64_ : 4096 - i_63_);
		else if ((i_60_ ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		    anInt4498 = i == arg2 ? i_62_ + 4096 : 12288 + -i_64_;
		else
		    anInt4498 = arg1 != i ? 20480 + -i_62_ : i_63_ + 12288;
		anInt4498 /= 6;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ni.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public static void method610(int arg0, int arg1, Class133_Sub1_Sub2 arg2,
				 int arg3) {
    while_434_:
	do {
	while_433_:
	    do {
		do {
		    try {
			if ((arg0 ^ 0xffffffff) == (arg2.anInt3445
						    ^ 0xffffffff)
			    && (arg0 ^ 0xffffffff) != 0) {
			    Class46 class46
				= Class41.method1129(arg0, arg3 ^ 0x302b);
			    int i = class46.anInt753;
			    if (1 == i) {
				arg2.anInt3482 = 0;
				arg2.anInt3458 = 0;
				arg2.anInt3501 = 0;
				arg2.anInt3467 = arg1;
				Class14_Sub8_Sub6.method509(arg2.anInt3495,
							    arg2.anInt3501, 25,
							    false, class46,
							    arg2.anInt3436);
			    }
			    if (i == 2)
				arg2.anInt3482 = 0;
			} else if (-1 == arg0
				   || 0 == (arg2.anInt3445 ^ 0xffffffff)
				   || ((Class41.method1129(arg0, -119).anInt777
					^ 0xffffffff)
				       <= ((Class41.method1129
					    (arg2.anInt3445, -127).anInt777)
					   ^ 0xffffffff))) {
			    arg2.anInt3467 = arg1;
			    arg2.anInt3458 = 0;
			    arg2.anInt3501 = 0;
			    arg2.anInt3482 = 0;
			    arg2.anInt3445 = arg0;
			    arg2.anInt3477 = arg2.anInt3498;
			    if (-1 != arg2.anInt3445)
				Class14_Sub8_Sub6.method509
				    (arg2.anInt3495, arg2.anInt3501, 113,
				     false,
				     Class41.method1129(arg2.anInt3445, -122),
				     arg2.anInt3436);
			}
			if (arg3 == 12288)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_433_;
		    }
		    return;
		} while (false);
		try {
		    anInt4488++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_434_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ni.H(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	} while (false);
    }
    
    public static void method611(int arg0, Class14_Sub10 arg1) {
    while_436_:
	do {
	while_435_:
	    do {
		do {
		    try {
			anInt4491++;
			if ((arg1.aByteArray2895.length + -arg1.anInt2908
			     ^ 0xffffffff)
			    <= -2)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_435_;
		    }
		    return;
		} while (false);
		int i;
		do {
		    try {
			i = arg1.method798(83);
			if ((i ^ 0xffffffff) <= -1 && (i ^ 0xffffffff) >= -4)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_435_;
		    }
		    return;
		} while (false);
		do {
		    try {
			int i_65_;
			if (i != 3) {
			    if ((i ^ 0xffffffff) != -3) {
				if ((i ^ 0xffffffff) != -2)
				    i_65_ = 19;
				else
				    i_65_ = 23;
			    } else
				i_65_ = 22;
			} else
			    i_65_ = 23;
			if (arg1.aByteArray2895.length - arg1.anInt2908
			    >= i_65_)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_435_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub6.anInt4190 = arg1.method798(arg0 ^ ~0x27);
		    if (-2 >= (Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff)) {
			if (-5 > (Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff))
			    Class14_Sub8_Sub6.anInt4190 = 4;
		    } else
			Class14_Sub8_Sub6.anInt4190 = 1;
		    Class14_Sub8_Sub3.method495((byte) -47,
						(arg1.method798(arg0 + -73)
						 ^ 0xffffffff) == -2);
		    Class139.aBoolean2233 = arg1.method798(115) == 1;
		    Class148.aBoolean2372 = arg1.method798(111) == 1;
		    Class125_Sub3.aBoolean3397
			= (arg1.method798(-107) ^ 0xffffffff) == -2;
		    Class135.aBoolean2190 = arg1.method798(56) == arg0;
		    Class33.aBoolean584 = arg1.method798(-125) == 1;
		    Class28.aBoolean516 = 1 == arg1.method798(66);
		    Class14_Sub8_Sub25.aBoolean4518
			= arg1.method798(arg0 + -93) == 1;
		    Class89.anInt1413 = arg1.method798(-10);
		    if (Class89.anInt1413 > 2)
			Class89.anInt1413 = 2;
		    if (2 > i) {
			Class7_Sub1.aBoolean2661 = 1 == arg1.method798(-74);
			arg1.method798(-103);
		    } else
			Class7_Sub1.aBoolean2661
			    = (arg1.method798(61) ^ 0xffffffff) == -2;
		    Class15.aBoolean374
			= (arg1.method798(124) ^ 0xffffffff) == -2;
		    Class14_Sub8_Sub20.aBoolean4420 = 1 == arg1.method798(-31);
		    Class135.anInt2189 = arg1.method798(89);
		    if ((Class135.anInt2189 ^ 0xffffffff) < -3)
			Class135.anInt2189 = 2;
		    Class14_Sub8_Sub26.aBoolean4528
			= -2 == (arg1.method798(118) ^ 0xffffffff);
		    Class14_Sub29.anInt3266 = arg1.method798(96);
		    if (-128 > (Class14_Sub29.anInt3266 ^ 0xffffffff))
			Class14_Sub29.anInt3266 = 127;
		    Class14_Sub23.anInt3135 = arg1.method798(77);
		    Class100.anInt1691 = arg1.method798(76);
		    if ((Class100.anInt1691 ^ 0xffffffff) < -128)
			Class100.anInt1691 = 127;
		    if (i >= 1) {
			Class54.anInt887 = arg1.method784((byte) 121);
			Class14_Sub2.anInt2725 = arg1.method784((byte) 108);
		    }
		    if (i >= 3)
			Class52.aBoolean845
			    = arg1.method798(arg0 ^ ~0x2c) == 1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_436_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ni.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method612(byte arg0) {
	try {
	    aShortArrayArray4496 = null;
	    aClass9_4486 = null;
	    aClass124Array4499 = null;
	    if (arg0 < 96)
		aShortArrayArray4496 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ni.K(" + arg0 + ')');
	}
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_437_:
	do {
	    do {
		int[][] is;
		try {
		    anInt4483++;
		    if (arg1 <= -4)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_437_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		int[][] is_66_ = aClass95_2838.method1481(1, arg0);
		if (aClass95_2838.aBoolean1628) {
		    int[][] is_67_ = method480(0, 0, arg0);
		    int[] is_68_ = is_67_[0];
		    int[] is_69_ = is_67_[2];
		    int[] is_70_ = is_66_[1];
		    int[] is_71_ = is_66_[2];
		    int[] is_72_ = is_67_[1];
		    int[] is_73_ = is_66_[0];
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
			 i++) {
			method609(is_72_[i], is_68_[i], is_69_[i], (byte) 53);
			anInt4495 += anInt4504;
			anInt4498 += anInt4485;
			if (anInt4495 < 0)
			    anInt4495 = 0;
			if (-4097 > (anInt4495 ^ 0xffffffff))
			    anInt4495 = 4096;
			anInt4492 += anInt4484;
			if (0 > anInt4492)
			    anInt4492 = 0;
			if (anInt4492 > 4096)
			    anInt4492 = 4096;
			for (/**/; 0 > anInt4498; anInt4498 += 4096) {
			    /* empty */
			}
			for (/**/; anInt4498 > 4096; anInt4498 -= 4096) {
			    /* empty */
			}
			method607(anInt4492, anInt4495, (byte) 60, anInt4498);
			is_73_[i] = anInt4490;
			is_70_[i] = anInt4497;
			is_71_[i] = anInt4487;
		    }
		}
		is = is_66_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ni.C(" + arg0 + ',' + arg1 + ')');
    }
}
