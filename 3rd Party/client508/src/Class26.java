/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class26
{
    public static int anInt480;
    public static int anInt481;
    public static int anInt482;
    public int anInt483;
    public int anInt484;
    public int anInt485;
    public static int anInt486;
    public short[] aShortArray487 = new short[512];
    public static int anInt488;
    public static int anInt489;
    public static int anInt490;
    public static int anInt491;
    public int anInt492;
    public static int anInt493;
    public static int anInt494;
    public static Class20 aClass20_495 = new Class20(128);
    public short[] aShortArray496;
    public static int anInt497;
    public int anInt498;
    public static Class124 aClass124_499
	= (Class14_Sub2_Sub2.method263
	   (1178,
	    "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
    public static int anInt500;
    
    public static int method1010(int arg0, Class94 arg1, byte arg2) {
	try {
	while_0_:
	do {
	do {
	int i_09_;
	    try {
		anInt488++;
		if (arg1.anIntArrayArray1586 != null
		    && arg0 < arg1.anIntArrayArray1586.length)
		    break;
		i_09_ = -2;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_09_;
	} while (false);
	int[] is;
	int i;
	int i_0_;
	int i_1_;
	try {
	    is = arg1.anIntArrayArray1586[arg0];
	    if (arg2 <= 73)
		aClass124_499 = null;
	    i = 0;
	    i_0_ = 0;
	    i_1_ = 0;
	} catch (Exception exception) {
	    break;
	}
	for (;;) {
	    int i_2_ = is[i_1_++];
	    int i_3_ = 0;
	    int i_4_ = 0;
	    if (-1 == (i_2_ ^ 0xffffffff))
		return i;
	    try {
		int i_21_;
		try {
		    if ((i_2_ ^ 0xffffffff) == -16)
			i_3_ = 1;
		    if ((i_2_ ^ 0xffffffff) == -2)
			i_4_ = Class14_Sub8_Sub21.anIntArray4444[is[i_1_++]];
		    if (2 == i_2_)
			i_4_ = Class56.anIntArray913[is[i_1_++]];
		    if (-17 == (i_2_ ^ 0xffffffff))
			i_3_ = 2;
		    if ((i_2_ ^ 0xffffffff) == -18)
			i_3_ = 3;
		    if (3 == i_2_)
			i_4_ = Class14_Sub2_Sub12.anIntArray3916[is[i_1_++]];
		    if ((i_2_ ^ 0xffffffff) == -5) {
			int i_5_ = is[i_1_++] << 1984451952;
			i_5_ += is[i_1_++];
			Class94 class94 = Class55.method1233(i_5_, 21803);
			int i_6_ = is[i_1_++];
			if (-1 != i_6_ && (!(Class14_Sub8_Sub24.method605
					     (114, i_6_).aBoolean2306)
					   || Class132.aBoolean2170)) {
			    for (int i_7_ = 0;
				 ((i_7_ ^ 0xffffffff)
				  > (class94.anIntArray1452.length
				     ^ 0xffffffff));
				 i_7_++) {
				if ((i_6_ + 1 ^ 0xffffffff)
				    == (class94.anIntArray1452[i_7_]
					^ 0xffffffff))
				    i_4_ += class94.anIntArray1542[i_7_];
			    }
			}
		    }
		    if (5 == i_2_)
			i_4_ = Class14_Sub8_Sub11.anIntArray4275[is[i_1_++]];
		    if (i_2_ == 6)
			i_4_ = (Class14_Sub29.anIntArray3245
				[Class56.anIntArray913[is[i_1_++]] - 1]);
		    if (-8 == (i_2_ ^ 0xffffffff))
			i_4_ = (100
				* Class14_Sub8_Sub11.anIntArray4275[is[i_1_++]]
				/ 46875);
		    if (-9 == (i_2_ ^ 0xffffffff))
			i_4_ = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937;
		    if (9 == i_2_) {
			for (int i_8_ = 0; i_8_ < 25; i_8_++) {
			    if (Applet_Sub1.aBooleanArray20[i_8_])
				i_4_ += Class56.anIntArray913[i_8_];
			}
		    }
		    if (10 == i_2_) {
			int i_9_ = is[i_1_++] << 1639063920;
			i_9_ += is[i_1_++];
			Class94 class94 = Class55.method1233(i_9_, 21803);
			int i_10_ = is[i_1_++];
			if (i_10_ != -1 && (!(Class14_Sub8_Sub24.method605
					      (81, i_10_).aBoolean2306)
					    || Class132.aBoolean2170)) {
			    for (int i_11_ = 0;
				 ((class94.anIntArray1452.length ^ 0xffffffff)
				  < (i_11_ ^ 0xffffffff));
				 i_11_++) {
				if ((class94.anIntArray1452[i_11_]
				     ^ 0xffffffff)
				    == (i_10_ - -1 ^ 0xffffffff)) {
				    i_4_ = 999999999;
				    break;
				}
			    }
			}
		    }
		    if ((i_2_ ^ 0xffffffff) == -12)
			i_4_ = Class1.anInt73;
		    if (i_2_ == 12)
			i_4_ = Class14_Sub4.anInt2789;
		    if (i_2_ == 13) {
			int i_12_
			    = Class14_Sub8_Sub11.anIntArray4275[is[i_1_++]];
			int i_13_ = is[i_1_++];
			i_4_ = (i_12_ & 1 << i_13_ ^ 0xffffffff) != -1 ? 1 : 0;
		    }
		    if (-15 == (i_2_ ^ 0xffffffff)) {
			int i_14_ = is[i_1_++];
			i_4_ = Class104.method1534(i_14_, 82);
		    }
		    if (i_2_ == 18)
			i_4_ = (Class133_Sub6.anInt3676
				+ ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				    .anInt3495)
				   >> -34628089));
		    if ((i_2_ ^ 0xffffffff) == -20)
			i_4_ = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
				>> 461786759) - -Class58.anInt947;
		    if (20 == i_2_)
			i_4_ = is[i_1_++];
		    if (-1 != (i_3_ ^ 0xffffffff))
			i_0_ = i_3_;
		    else {
			if (0 == i_0_)
			    i += i_4_;
			if (-2 == (i_0_ ^ 0xffffffff))
			    i -= i_4_;
			if (i_0_ == 2 && -1 != (i_4_ ^ 0xffffffff))
			    i /= i_4_;
			if (-4 == (i_0_ ^ 0xffffffff))
			    i *= i_4_;
			i_0_ = 0;
		    }
		    continue;
		} catch (Exception exception) {
		    /* empty */
		}
		Object object;
		i_21_ = -1;
		return i_21_;
	    } catch (RuntimeException runtimeexception) {
		break while_0_;
	    }
	}
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("db.M(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
	}
	return -1;
    }
    
    public abstract void method1011(int i, int i_15_, byte i_16_);
    
    public abstract void method1012(int i);
    
    public abstract void method1013(int i);
    
    public static void method1014(byte arg0) {
	try {
	    if (arg0 <= 114)
		aClass124_499 = null;
	    aClass20_495 = null;
	    aClass124_499 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "db.G(" + arg0 + ')');
	}
    }
    
    public void method1015(byte arg0) {
	try {
	    Random random = new Random((long) anInt485);
	    anInt490++;
	    for (int i = 0; 255 > i; i++)
		aShortArray487[i] = (short) i;
	    if (arg0 >= -101)
		aClass20_495 = null;
	    for (int i = 0; -256 < (i ^ 0xffffffff); i++) {
		int i_17_ = -i + 255;
		int i_18_ = Class138.method1949(random, i_17_, -32640);
		short i_19_ = aShortArray487[i_18_];
		aShortArray487[i_18_] = aShortArray487[i_17_];
		aShortArray487[i_17_] = aShortArray487[i_17_ - -256] = i_19_;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "db.N(" + arg0 + ')');
	}
    }
    
    public static int method1016(boolean arg0, byte arg1) {
	try {
    while_0_:
	do {
	int i_8_;
	    do {
		int i_0_;
		try {
		    if (arg0 == true)
			break;
		    i_0_ = -97;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_0_;
	    } while (false);
	    do {
		int i_1_;
		try {
		    anInt489++;
		    if (-66 < (arg1 ^ 0xffffffff) || 90 < arg1)
			break;
		    i_1_ = -65 + arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_1_;
	    } while (false);
	    do {
		int i_2_;
		try {
		    if (97 > arg1 || (arg1 ^ 0xffffffff) < -123)
			break;
		    i_2_ = arg1 - 71;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_2_;
	    } while (false);
	    do {
		int i_3_;
		try {
		    if ((arg1 ^ 0xffffffff) > -49 || -58 > (arg1 ^ 0xffffffff))
			break;
		    i_3_ = 52 + (-48 + arg1);
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_3_;
	    } while (false);
	    do {
		int i_4_;
		try {
		    if (arg1 != 43)
			break;
		    i_4_ = 62;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_4_;
	    } while (false);
	    do {
		int i_5_;
		try {
		    if (-43 != (arg1 ^ 0xffffffff))
			break;
		    i_5_ = 62;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_5_;
	    } while (false);
	    do {
		int i_6_;
		try {
		    if (-48 != (arg1 ^ 0xffffffff))
			break;
		    i_6_ = 63;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_6_;
	    } while (false);
	    do {
		int i_7_;
		try {
		    if (arg1 != 45)
			break;
		    i_7_ = 63;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return i_7_;
	    } while (false);
	    try {
		i_8_ = -1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_8_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   "db.A(" + arg0 + ',' + arg1 + ')');
	}
	return 0;
    }
    
    public static int method1017(int arg0, int arg1, byte arg2, int arg3) {
	boolean bool;
	try {
    while_1_:
	do {
	int i_1_;
	    int i;
	    int i_20_;
	    do {
		int i_0_ = 0;
		try {
		    anInt486++;
		    i = arg3 >> -2130004217;
		    i_20_ = arg0 >> 899926727;
		    if (-1 >= (i_20_ ^ 0xffffffff) && 0 <= i && 103 >= i_20_
			&& i <= 103)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1_;
		}
		return i_0_;
	    } while (false);
	    try {
		int i_21_ = 0x7f & arg0;
		int i_22_ = 0x7f & arg3;
		int i_23_ = arg1;
		if (3 > i_23_
		    && (0x2 & (Class14_Sub8_Sub4.aByteArrayArrayArray4142[1]
			       [i_20_][i])
			^ 0xffffffff) == -3)
		    i_23_++;
		int i_24_
		    = (((Class114.anIntArrayArrayArray1896[i_23_][i_20_][i]
			 * (-i_21_ + 128))
			+ (Class114.anIntArrayArrayArray1896[i_23_][i_20_ - -1]
			   [i]) * i_21_)
		       >> 355764519);
		int i_25_
		    = (((Class114.anIntArrayArrayArray1896[i_23_][i_20_][1 + i]
			 * (-i_21_ + 128))
			- -((Class114.anIntArrayArrayArray1896[i_23_]
			     [i_20_ - -1][i + 1])
			    * i_21_))
		       >> -515499321);
		int i_26_ = -69 % ((-64 - arg2) / 39);
		i_1_ = (128 - i_22_) * i_24_ - -(i_22_ * i_25_) >> 1674193415;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("db.K(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
	}
	return 0;
    }
    
    public static void method1018(byte arg0, Class9 arg1) {
	try {
	    Class12.aClass9_332 = arg1;
	    if (arg0 != -68)
		anInt500 = -99;
	    anInt482++;
	    Class19.anInt2550 = Class12.aClass9_332.method177(16, 13537);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("db.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method1019(int arg0) {
	try {
	    anInt494++;
	    aShortArray496 = new short[anInt484];
	    for (int i = 0; (anInt484 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		aShortArray496[i] = (short) (int) Math.pow(2.0, (double) i);
	    if (arg0 != 2)
		aClass20_495 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "db.H(" + arg0 + ')');
	}
    }
    
    public void method1020(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt497++;
	    int[] is = new int[arg2];
	    int[] is_27_ = new int[arg0];
	    for (int i = 0; (i ^ 0xffffffff) > (arg2 ^ 0xffffffff); i++)
		is[i] = (i << 1243547980) / arg2;
	    for (int i = 0; (arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		is_27_[i] = (i << 16179468) / arg0;
	    int[] is_28_ = new int[arg1];
	    for (int i = arg3; arg1 > i; i++)
		is_28_[i] = (i << -558406356) / arg1;
	    method1013(-23880);
	    for (int i = 0; (i ^ 0xffffffff) > (arg1 ^ 0xffffffff); i++) {
		for (int i_29_ = 0; i_29_ < arg0; i_29_++) {
		    for (int i_30_ = 0; i_30_ < arg2; i_30_++) {
			for (int i_31_ = 0; i_31_ < anInt484; i_31_++) {
			    int i_32_ = aShortArray496[i_31_] << -41511540;
			    int i_33_ = is_28_[i] * i_32_ >> 336781132;
			    i_33_ *= anInt498;
			    int i_34_ = is[i_30_] * i_32_ >> 887172492;
			    int i_35_ = anInt498 * i_32_ >> 1625714636;
			    int i_36_ = i_32_ * anInt483 >> 2144840204;
			    int i_37_ = i_32_ * is_27_[i_29_] >> -345379060;
			    int i_38_ = i_33_ >> -1318185236;
			    int i_39_ = i_38_ - -1;
			    i_37_ *= anInt483;
			    i_34_ *= anInt492;
			    int i_40_ = i_34_ >> 497144748;
			    i_34_ &= 0xfff;
			    if (i_35_ <= i_39_)
				i_39_ = 0;
			    else
				i_39_ &= 0xff;
			    int i_41_ = Class24.anIntArray468[i_34_];
			    i_33_ &= 0xfff;
			    i_38_ &= 0xff;
			    int i_42_ = i_37_ >> -1509602260;
			    i_37_ &= 0xfff;
			    int i_43_ = aShortArray487[i_39_];
			    int i_44_ = -4096 + i_33_;
			    int i_45_ = i_40_ + 1;
			    int i_46_ = Class24.anIntArray468[i_33_];
			    int i_47_ = aShortArray487[i_38_];
			    int i_48_ = i_37_ + -4096;
			    int i_49_ = Class24.anIntArray468[i_37_];
			    i_40_ &= 0xff;
			    int i_50_ = i_34_ - 4096;
			    int i_51_ = i_42_ + 1;
			    if ((i_51_ ^ 0xffffffff) <= (i_36_ ^ 0xffffffff))
				i_51_ = 0;
			    else
				i_51_ &= 0xff;
			    int i_52_ = anInt492 * i_32_ >> 1546678668;
			    i_42_ &= 0xff;
			    int i_53_ = aShortArray487[i_51_ - -i_47_];
			    int i_54_ = aShortArray487[i_47_ + i_42_];
			    if ((i_52_ ^ 0xffffffff) >= (i_45_ ^ 0xffffffff))
				i_45_ = 0;
			    else
				i_45_ &= 0xff;
			    int i_55_ = aShortArray487[i_51_ + i_43_];
			    int i_56_ = aShortArray487[i_42_ + i_43_];
			    int i_57_
				= Class133.method1786(i_34_,
						      (aShortArray487
						       [i_40_ - -i_54_]),
						      13828, i_37_, i_33_);
			    int i_58_
				= Class133.method1786(i_50_,
						      (aShortArray487
						       [i_45_ - -i_54_]),
						      13828, i_37_, i_33_);
			    int i_59_
				= (((i_58_ + -i_57_) * i_41_ >> 393606316)
				   + i_57_);
			    i_57_ = Class133.method1786(i_34_,
							(aShortArray487
							 [i_40_ - -i_53_]),
							13828, i_48_, i_33_);
			    i_58_ = Class133.method1786(i_50_,
							(aShortArray487
							 [i_53_ + i_45_]),
							arg3 ^ 0x3604, i_48_,
							i_33_);
			    int i_60_ = i_57_ + ((-i_57_ + i_58_) * i_41_
						 >> 93719564);
			    int i_61_ = (((i_60_ - i_59_) * i_49_ >> 460247180)
					 + i_59_);
			    i_57_ = Class133.method1786(i_34_,
							(aShortArray487
							 [i_56_ + i_40_]),
							arg3 ^ 0x3604, i_37_,
							i_44_);
			    i_58_ = Class133.method1786(i_50_,
							(aShortArray487
							 [i_56_ + i_45_]),
							13828, i_37_, i_44_);
			    i_59_ = i_57_ - -((i_58_ - i_57_) * i_41_
					      >> -1201375924);
			    i_57_ = Class133.method1786(i_34_,
							(aShortArray487
							 [i_40_ - -i_55_]),
							13828, i_48_, i_44_);
			    i_58_ = Class133.method1786(i_50_,
							(aShortArray487
							 [i_55_ + i_45_]),
							arg3 + 13828, i_48_,
							i_44_);
			    i_60_ = i_57_ - -(i_41_ * (i_58_ + -i_57_)
					      >> -872615348);
			    int i_62_ = i_59_ + (i_49_ * (i_60_ - i_59_)
						 >> -199734388);
			    method1011(i_31_,
				       ((-i_61_ + i_62_) * i_46_
					>> -140152532) + i_61_,
				       (byte) -113);
			}
			method1012(0);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("db.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public static Class148 method1021(byte arg0) {
	Class148 aClass148;
	try {
	    anInt491++;
	    Class148_Sub2 class148_sub2
		= new Class148_Sub2(Class14_Sub11.anInt2952,
				    Class14_Sub30.anInt3279,
				    Class40.anIntArray675[0],
				    Class14_Sub2_Sub12.anIntArray3918[0],
				    Class17.anIntArray402[0],
				    Class76.anIntArray1204[0],
				    Class12.aByteArrayArray310[0],
				    Class73.anIntArray1114);
	    Class129.method1761((byte) 23);
	    if (arg0 != 71)
		aClass20_495 = null;
	    aClass148 = class148_sub2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "db.I(" + arg0 + ')');
	}
	return aClass148;
    }
    
    public static void method1022(int arg0) {
	try {
	    Class119.method1612();
	    Class141.anInterface2Array2245 = new Interface2[7];
	    Class141.anInterface2Array2245[1] = new Class23();
	    Class141.anInterface2Array2245[2] = new Class61();
	    Class141.anInterface2Array2245[3] = new Class8();
	    Class141.anInterface2Array2245[4] = new Class34();
	    Class141.anInterface2Array2245[5] = new Class19();
	    anInt481++;
	    Class141.anInterface2Array2245[6] = new Class101();
	    if (arg0 > -121)
		method1016(true, (byte) 124);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "db.E(" + arg0 + ')');
	}
    }
    
    public static void method1023(int arg0, int arg1, int arg2, Class94 arg3,
				  int arg4) {
	try {
	    Class138.method1946(139);
	    Class25.method999(arg0, arg1, arg0 + arg3.anInt1518,
			      arg3.anInt1545 + arg1);
	    if ((Class14_Sub8_Sub33.anInt4633 ^ 0xffffffff) != -3
		&& 5 != Class14_Sub8_Sub33.anInt4633
		&& null != Class133_Sub6.aClass14_Sub2_Sub19_3640) {
		int i
		    = Class14_Sub8_Sub19.anInt4408 + Class41.anInt696 & 0x7ff;
		int i_63_
		    = (48
		       + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32);
		int i_64_
		    = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32)
		       + 464);
		((Class14_Sub2_Sub19_Sub2)
		 Class133_Sub6.aClass14_Sub2_Sub19_3640)
		    .method420
		    (arg0, arg1, arg3.anInt1518, arg3.anInt1545, i_63_, i_64_,
		     i, 256 + Class32.anInt551,
		     (Class14_Sub2_Sub19_Sub2) arg3.method1476(false,
							       (byte) 61));
		if (Class79.aClass146_1261 != null) {
		    for (int i_65_ = 0;
			 ((Class79.aClass146_1261.anInt2353 ^ 0xffffffff)
			  < (i_65_ ^ 0xffffffff));
			 i_65_++) {
			if (Class79.aClass146_1261.method1990(-92, i_65_)) {
			    int i_66_
				= 2 + (4 * (-Class58.anInt947
					    + (Class79.aClass146_1261
					       .aShortArray2361[i_65_]))
				       - (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3436) / 32);
			    int i_67_
				= (-((Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3495)
				     / 32)
				   + 2
				   + 4 * ((Class79.aClass146_1261
					   .aShortArray2354[i_65_])
					  + -Class133_Sub6.anInt3676));
			    int i_68_ = Class3.anIntArray108[i];
			    int i_69_ = Class3.anIntArray111[i];
			    i_69_ = i_69_ * 256 / (Class32.anInt551 - -256);
			    i_68_ = i_68_ * 256 / (256 + Class32.anInt551);
			    int i_70_ = (i_69_ * i_66_ + -(i_68_ * i_67_)
					 >> 1445058192);
			    Class14_Sub2_Sub16 class14_sub2_sub16
				= Class56_Sub1.aClass14_Sub2_Sub16_3320;
			    if (Class79.aClass146_1261.method1994(i_65_, false)
				== 1)
				class14_sub2_sub16
				    = Class84.aClass14_Sub2_Sub16_1344;
			    if (2 == Class79.aClass146_1261.method1994(i_65_,
								       false))
				class14_sub2_sub16
				    = Class133_Sub3.aClass14_Sub2_Sub16_3567;
			    int i_71_ = (i_68_ * i_66_ - -(i_69_ * i_67_)
					 >> -1110089840);
			    int i_72_ = (class14_sub2_sub16.method344
					 ((Class79.aClass146_1261
					   .aClass124Array2362[i_65_]),
					  100));
			    i_71_ -= i_72_ / 2;
			    if (i_71_ >= -arg3.anInt1518
				&& arg3.anInt1518 >= i_71_
				&& -arg3.anInt1545 <= i_70_
				&& (i_70_ ^ 0xffffffff) >= (arg3.anInt1545
							    ^ 0xffffffff)) {
				int i_73_ = 16777215;
				if ((Class79.aClass146_1261.anIntArray2350
				     [i_65_])
				    != -1)
				    i_73_ = (Class79.aClass146_1261
					     .anIntArray2350[i_65_]);
				Class25.method1008((Class14_Sub2_Sub19_Sub2)
						   arg3.method1476(false,
								   (byte) 61));
				class14_sub2_sub16.method365
				    ((Class79.aClass146_1261.aClass124Array2362
				      [i_65_]),
				     i_71_ - -arg0 - -(arg3.anInt1518 / 2),
				     -i_70_ + arg3.anInt1545 / 2 + arg1, i_72_,
				     50, i_73_, 0, 256, 1, 0, 0);
				Class25.method996();
			    }
			}
		    }
		}
		for (int i_74_ = 0; Class18.anInt411 > i_74_; i_74_++) {
		    int i_75_
			= (4 * Class14.anIntArray363[i_74_] - -2
			   - (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
			      / 32));
		    int i_76_
			= (4 * Class17.anIntArray400[i_74_]
			   - (-2 - -((Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3436)
				     / 32)));
		    Class79 class79
			= Class79.method1377((byte) -106,
					     (Class14_Sub8_Sub25.anIntArray4512
					      [i_74_]));
		    if (null != class79.anIntArray1276) {
			class79 = class79.method1391(1);
			if (null == class79
			    || 0 == (class79.anInt1262 ^ 0xffffffff))
			    continue;
		    }
		    Class100.method1513(i_76_, arg1, i_75_, arg3,
					(Class14_Sub8_Sub17
					 .aClass14_Sub2_Sub19Array4366
					 [class79.anInt1262]),
					256, arg0);
		}
		for (int i_77_ = 0; (i_77_ ^ 0xffffffff) > -105; i_77_++) {
		    for (int i_78_ = 0; 104 > i_78_; i_78_++) {
			Class2 class2
			    = (Class128.aClass2ArrayArrayArray2119
			       [Class14_Sub2_Sub3.anInt3785][i_77_][i_78_]);
			if (class2 != null) {
			    int i_79_ = -((Class14_Sub3
					   .aClass133_Sub1_Sub1_2748.anInt3495)
					  / 32) + 4 * i_77_ + 2;
			    int i_80_ = -((Class14_Sub3
					   .aClass133_Sub1_Sub1_2748.anInt3436)
					  / 32) + (i_78_ * 4 - -2);
			    Class100.method1513(i_80_, arg1, i_79_, arg3,
						(Class14_Sub20
						 .aClass14_Sub2_Sub19Array3098
						 [0]),
						256, arg0);
			}
		    }
		}
		for (int i_81_ = 0;
		     ((i_81_ ^ 0xffffffff)
		      > (Class14_Sub8_Sub13.anInt4306 ^ 0xffffffff));
		     i_81_++) {
		    Class133_Sub1_Sub2 class133_sub1_sub2
			= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
			   [Class14_Sub2_Sub15.anIntArray3965[i_81_]]);
		    if (null != class133_sub1_sub2
			&& class133_sub1_sub2.method1804((byte) 115)) {
			Class12 class12 = class133_sub1_sub2.aClass12_4949;
			if (null != class12 && class12.anIntArray329 != null)
			    class12 = class12.method217((byte) -18);
			if (class12 != null && class12.aBoolean342
			    && class12.aBoolean308) {
			    int i_82_
				= (-((Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3495)
				     / 32)
				   + class133_sub1_sub2.anInt3495 / 32);
			    int i_83_
				= (class133_sub1_sub2.anInt3436 / 32
				   + -((Class14_Sub3.aClass133_Sub1_Sub1_2748
					.anInt3436)
				       / 32));
			    Class100.method1513(i_83_, arg1, i_82_, arg3,
						(Class14_Sub20
						 .aClass14_Sub2_Sub19Array3098
						 [1]),
						256, arg0);
			}
		    }
		}
		for (int i_84_ = 0; Class14_Sub10.anInt2878 > i_84_; i_84_++) {
		    Class133_Sub1_Sub1 class133_sub1_sub1
			= (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			   [Class14.anIntArray351[i_84_]]);
		    if (null != class133_sub1_sub1
			&& class133_sub1_sub1.method1804((byte) 115)) {
			int i_85_ = (class133_sub1_sub1.anInt3495 / 32
				     + -((Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3495)
					 / 32));
			int i_86_ = (class133_sub1_sub1.anInt3436 / 32
				     + -((Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3436)
					 / 32));
			boolean bool = false;
			long l
			    = class133_sub1_sub1.aClass124_4922.method1692(0);
			for (int i_87_ = 0;
			     i_87_ < Class14_Sub2_Sub1.anInt3728; i_87_++) {
			    if (l == Class133_Sub1_Sub2.aLongArray4951[i_87_]
				&& ((Class45.anIntArray743[i_87_] ^ 0xffffffff)
				    != -1)) {
				bool = true;
				break;
			    }
			}
			boolean bool_88_ = false;
			if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916
			     ^ 0xffffffff) != -1
			    && 0 != class133_sub1_sub1.anInt4916
			    && (((Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anInt4916)
				 ^ 0xffffffff)
				== (class133_sub1_sub1.anInt4916
				    ^ 0xffffffff)))
			    bool_88_ = true;
			if (bool)
			    Class100.method1513(i_86_, arg1, i_85_, arg3,
						(Class14_Sub20
						 .aClass14_Sub2_Sub19Array3098
						 [3]),
						256, arg0);
			else if (bool_88_)
			    Class100.method1513(i_86_, arg1, i_85_, arg3,
						(Class14_Sub20
						 .aClass14_Sub2_Sub19Array3098
						 [4]),
						256, arg0);
			else
			    Class100.method1513(i_86_, arg1, i_85_, arg3,
						(Class14_Sub20
						 .aClass14_Sub2_Sub19Array3098
						 [2]),
						256, arg0);
		    }
		}
		Class66[] class66s = Class14_Sub2_Sub1.aClass66Array3721;
		for (int i_89_ = 0; i_89_ < class66s.length; i_89_++) {
		    Class66 class66 = class66s[i_89_];
		    if (null != class66
			&& (class66.anInt1046 ^ 0xffffffff) != -1
			&& ((Class14_Sub2_Sub20.anInt4064 % 20 ^ 0xffffffff)
			    > -11)) {
			if ((class66.anInt1046 ^ 0xffffffff) == -2
			    && (class66.anInt1049 ^ 0xffffffff) <= -1
			    && ((Class14_Sub4
				 .aClass133_Sub1_Sub2Array2785).length
				> class66.anInt1049)) {
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				   [class66.anInt1049]);
			    if (null != class133_sub1_sub2) {
				int i_90_
				    = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3436)
					 / 32)
				       + class133_sub1_sub2.anInt3436 / 32);
				int i_91_
				    = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3495)
					 / 32)
				       + class133_sub1_sub2.anInt3495 / 32);
				Class14_Sub2_Sub14.method332(arg3, arg1, 90,
							     i_91_,
							     class66.anInt1035,
							     i_90_, arg0);
			    }
			}
			if (2 == class66.anInt1046) {
			    int i_92_
				= (-((Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3495)
				     / 32)
				   + (class66.anInt1047
				      - Class133_Sub6.anInt3676) * 4
				   - -2);
			    int i_93_
				= (4 * (-Class58.anInt947 + class66.anInt1044)
				   + (2
				      + -((Class14_Sub3
					   .aClass133_Sub1_Sub1_2748.anInt3436)
					  / 32)));
			    Class14_Sub2_Sub14.method332(arg3, arg1, 86, i_92_,
							 class66.anInt1035,
							 i_93_, arg0);
			}
			if (class66.anInt1046 == 10
			    && -1 >= (class66.anInt1049 ^ 0xffffffff)
			    && ((class66.anInt1049 ^ 0xffffffff)
				> ((Class14_Sub8_Sub23
				    .aClass133_Sub1_Sub1Array4474).length
				   ^ 0xffffffff))) {
			    Class133_Sub1_Sub1 class133_sub1_sub1
				= (Class14_Sub8_Sub23
				   .aClass133_Sub1_Sub1Array4474
				   [class66.anInt1049]);
			    if (null != class133_sub1_sub1) {
				int i_94_
				    = (class133_sub1_sub1.anInt3495 / 32
				       - (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3495) / 32);
				int i_95_ = (class133_sub1_sub1.anInt3436 / 32
					     + -((Class14_Sub3
						  .aClass133_Sub1_Sub1_2748
						  .anInt3436)
						 / 32));
				Class14_Sub2_Sub14.method332(arg3, arg1, 96,
							     i_94_,
							     class66.anInt1035,
							     i_95_, arg0);
			    }
			}
		    }
		}
		if (0 != Class71.anInt1085) {
		    int i_96_
			= (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
			     / 32)
			   + Class71.anInt1085 * 4 + 2);
		    int i_97_
			= (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
			     / 32)
			   + Class14_Sub8_Sub15.anInt4335 * 4 - -2);
		    Class100.method1513(i_97_, arg1, i_96_, arg3,
					Class149.aClass14_Sub2_Sub19_2384, 256,
					arg0);
		}
		Class25.method1004(-1 + (arg0 + arg3.anInt1518 / 2),
				   -1 + arg1 + arg3.anInt1545 / 2, 3, 3,
				   16777215);
	    } else {
		Class14_Sub2_Sub19 class14_sub2_sub19
		    = arg3.method1476(false, (byte) 61);
		if (class14_sub2_sub19 != null)
		    class14_sub2_sub19.method391(arg0, arg1);
	    }
	    Class14_Sub8_Sub36.aBooleanArray4698[arg2] = true;
	    Class7_Sub2_Sub1.aBooleanArray3703[arg2] = true;
	    if (arg4 < 111)
		aClass124_499 = null;
	    anInt493++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("db.L(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ')'));
	}
    }
    
    public Class26(int arg0, int arg1, int arg2, int arg3, int arg4) {
	anInt485 = 0;
	anInt483 = 4;
	anInt492 = 4;
	anInt484 = 4;
	anInt498 = 4;
	try {
	    anInt484 = arg1;
	    anInt492 = arg2;
	    anInt498 = arg4;
	    anInt485 = arg0;
	    anInt483 = arg3;
	    method1019(2);
	    method1015((byte) -125);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("db.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ')'));
	}
    }
}