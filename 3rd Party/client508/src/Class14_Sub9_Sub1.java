/* Class14_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub9_Sub1 extends Class14_Sub9
{
    public static int anInt4755;
    public static double aDouble4756;
    public static int anInt4757;
    public static int anInt4758;
    public static int anInt4759;
    public static int anInt4760;
    public static Class124 aClass124_4761;
    public static Class124 aClass124_4762;
    public static int anInt4763;
    public int anInt4764;
    public static int anInt4765;
    public int[] anIntArray4766 = new int[16];
    public static Class124 aClass124_4767;
    public static int anInt4768;
    public static int anInt4769;
    public static Class124 aClass124_4770;
    public int[] anIntArray4771 = new int[16];
    public int[] anIntArray4772;
    public static Class124 aClass124_4773;
    public static int anInt4774;
    public int[] anIntArray4775;
    public static int anInt4776;
    public int[] anIntArray4777;
    public static int anInt4778;
    public static int anInt4779;
    public static Class14_Sub16 aClass14_Sub16_4780;
    public Class55 aClass55_4781;
    public static int anInt4782;
    public static int anInt4783;
    public int[] anIntArray4784;
    public static int anInt4785;
    public static int anInt4786;
    public static int anInt4787;
    public static int anInt4788;
    public Class27 aClass27_4789;
    public static Class124 aClass124_4790
	= Class14_Sub2_Sub2.method263(1178, "Free world");
    public static int anInt4791;
    public static int anInt4792;
    public static int anInt4793;
    public static Class124 aClass124_4794;
    public static int anInt4795;
    public int[] anIntArray4796;
    public static int anInt4797;
    public int[] anIntArray4798;
    public static int anInt4799;
    public static int anInt4800;
    public int[] anIntArray4801;
    public static int anInt4802;
    public static int anInt4803;
    public static int[] anIntArray4804;
    public int[] anIntArray4805;
    public int anInt4806;
    public static int anInt4807;
    public static Class124 aClass124_4808;
    public static int anInt4809;
    public static Class124 aClass124_4810;
    public static int anInt4811;
    public static int anInt4812;
    public static int anInt4813;
    public static Class124 aClass124_4814;
    public int[] anIntArray4815;
    public static int anInt4816;
    public int[] anIntArray4817;
    public static int anInt4818;
    public int[] anIntArray4819;
    public static int anInt4820;
    public static int anInt4821;
    public static int anInt4822;
    public Class14_Sub18[][] aClass14_Sub18ArrayArray4823;
    public static int anInt4824;
    public Class14_Sub18[][] aClass14_Sub18ArrayArray4825;
    public int[] anIntArray4826;
    public static int[] anIntArray4827;
    public static int anInt4828;
    public static Class124 aClass124_4829;
    public static int anInt4830;
    public static Class124 aClass124_4831;
    public int[] anIntArray4832;
    public int anInt4833;
    public int anInt4834;
    public Class14_Sub9_Sub3 aClass14_Sub9_Sub3_4835;
    public long aLong4836;
    public boolean aBoolean4837;
    public long aLong4838;
    
    public synchronized Class14_Sub9 method686() {
	Class14_Sub9 class14_sub9;
	try {
	    anInt4812++;
	    class14_sub9 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ea.I()");
	}
	return class14_sub9;
    }
    
    public int method693(Class14_Sub18 arg0, boolean arg1) {
    while_527_:
	do {
	    int i;
	    do {
		int i_0_;
		try {
		    i = anIntArray4801[arg0.anInt3053];
		    if (arg1 != true)
			method696((byte) 3);
		    anInt4807++;
		    if (8192 > i)
			break;
		    i_0_ = -(32 + (128 + -arg0.anInt3038) * (16384 - i)
			     >> -1543809274) + 16384;
		} catch (RuntimeException runtimeexception) {
		    break while_527_;
		}
		return i_0_;
	    } while (false);
	    int i_1_;
	    try {
		i_1_ = 32 + i * arg0.anInt3038 >> 1339148710;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ea.MA("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public void method694(int arg0, int arg1, int arg2) {
	try {
	    anInt4763++;
	    anIntArray4798[arg1] = arg0;
	    if (arg2 < 13)
		aClass55_4781 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.RA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public synchronized void method692(int arg0) {
	try {
	    anInt4759++;
	    if (aClass27_4789.method1049()) {
		int i
		    = aClass27_4789.anInt506 * anInt4806 / Class115.anInt1909;
		do {
		    long l = aLong4838 + (long) arg0 * (long) i;
		    if ((aLong4836 - l ^ 0xffffffffffffffffL) <= -1L) {
			aLong4838 = l;
			break;
		    }
		    int i_2_
			= (int) (((long) i + aLong4836 + (-aLong4838 + -1L))
				 / (long) i);
		    aLong4838 += (long) i_2_ * (long) i;
		    arg0 -= i_2_;
		    aClass14_Sub9_Sub3_4835.method692(i_2_);
		    method704(-12887);
		} while (aClass27_4789.method1049());
	    }
	    aClass14_Sub9_Sub3_4835.method692(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.J(" + arg0 + ')');
	}
    }
    
    public synchronized Class14_Sub9 method688() {
	Class14_Sub9_Sub3 class14_sub9_sub3;
	try {
	    anInt4776++;
	    class14_sub9_sub3 = aClass14_Sub9_Sub3_4835;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ea.L()");
	}
	return class14_sub9_sub3;
    }
    
    public void method695(int arg0, int arg1, int arg2) {
	try {
	    anInt4802++;
	    anIntArray4832[arg0] = arg2;
	    anIntArray4777[arg0] = Class14_Sub8_Sub26.method617(arg2, arg1);
	    method713(arg2, arg0, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.N(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method696(byte arg0) {
	try {
	    Object object = Class14_Sub8_Sub20.anObject4417;
	    synchronized (object) {
		if ((Class138.anInt2223 ^ 0xffffffff) == -1)
		    Class14_Sub8_Sub34.aClass43_4647
			.method1143(5, new Class24(), 0);
		Class138.anInt2223 = 600;
	    }
	    anInt4791++;
	    if (arg0 != -119)
		aClass124_4790 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.G(" + arg0 + ')');
	}
    }
    
    public synchronized void method697(int arg0) {
	try {
	    anInt4821++;
	    int i = -44 / ((-56 - arg0) / 53);
	    aClass27_4789.method1046();
	    method707(2676);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.T(" + arg0 + ')');
	}
    }
    
    public int method698(int arg0, Class14_Sub18 arg1) {
    while_528_:
	do {
	    Class127 class127;
	    int i;
	    do {
		int i_3_;
		try {
		    anInt4793++;
		    i = ((anIntArray4771[arg1.anInt3053]
			  * anIntArray4784[arg1.anInt3053]) - -4096
			 >> -1586577203);
		    i = i * i + 16384 >> -627246801;
		    i = arg1.anInt3046 * i - -16384 >> 93787471;
		    class127 = arg1.aClass127_3062;
		    i = i * anInt4764 - -128 >> -1134686552;
		    if (arg0 == -627246801)
			break;
		    i_3_ = -49;
		} catch (RuntimeException runtimeexception) {
		    break while_528_;
		}
		return i_3_;
	    } while (false);
	    int i_4_;
	    try {
		if (0 < class127.anInt2097)
		    i = (int) (0.5
			       + ((double) i
				  * Math.pow(0.5,
					     ((double) class127.anInt2097
					      * (1.953125E-5
						 * (double) (arg1
							     .anInt3040))))));
		if (class127.aByteArray2109 != null) {
		    int i_5_ = arg1.anInt3058;
		    int i_6_ = class127.aByteArray2109[arg1.anInt3045 - -1];
		    if ((class127.aByteArray2109.length - 2 ^ 0xffffffff)
			< (arg1.anInt3045 ^ 0xffffffff)) {
			int i_7_ = (class127.aByteArray2109[2 + arg1.anInt3045]
				    << 373310568) & 0xff00;
			int i_8_
			    = ((class127.aByteArray2109[arg1.anInt3045] & 0xff)
			       << 2022543048);
			i_6_
			    += ((-i_6_
				 + class127.aByteArray2109[3 + arg1.anInt3045])
				* (-i_8_ + i_5_) / (-i_8_ + i_7_));
		    }
		    i = 32 + i_6_ * i >> -852550842;
		}
		if (arg1.anInt3041 > 0 && null != class127.aByteArray2098) {
		    int i_9_ = arg1.anInt3041;
		    int i_10_ = class127.aByteArray2098[arg1.anInt3035 + 1];
		    if (-2 + class127.aByteArray2098.length > arg1.anInt3035) {
			int i_11_
			    = ((0xff
				& class127.aByteArray2098[2 + arg1.anInt3035])
			       << 988710280);
			int i_12_
			    = 0xff00 & (class127.aByteArray2098[arg1.anInt3035]
					<< 1351665864);
			i_10_ += ((-i_12_ + i_9_)
				  * (-i_10_ + (class127.aByteArray2098
					       [arg1.anInt3035 + 3]))
				  / (-i_12_ + i_11_));
		    }
		    i = 32 + i * i_10_ >> -1312057850;
		}
		i_4_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_4_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ea.C(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method699(int arg0, int arg1, int arg2, int arg3) {
    while_530_:
	do {
	while_529_:
	    do {
		do {
		    Class14_Sub18 class14_sub18;
		    try {
			anInt4769++;
			method722(-31396, 64, arg1, arg0);
			if ((0x2 & anIntArray4817[arg1]) == 0)
			    break;
			class14_sub18
			    = (Class14_Sub18) aClass14_Sub9_Sub3_4835
						  .aClass2_4858.method83(-1);
		    } catch (RuntimeException runtimeexception) {
			break while_529_;
		    }
		    while (class14_sub18 != null) {
			if (arg1 == class14_sub18.anInt3053
			    && (class14_sub18.anInt3041 ^ 0xffffffff) > -1) {
			    aClass14_Sub18ArrayArray4823[arg1][(class14_sub18
								.anInt3037)]
				= null;
			    aClass14_Sub18ArrayArray4823[arg1][arg0]
				= class14_sub18;
			    int i = (((class14_sub18.anInt3056
				       * class14_sub18.anInt3063)
				      >> -1082876756)
				     + class14_sub18.anInt3052);
			    class14_sub18.anInt3052
				+= (arg0 + -class14_sub18.anInt3037
				    << -2044620632);
			    class14_sub18.anInt3056
				= -class14_sub18.anInt3052 + i;
			    class14_sub18.anInt3063 = 4096;
			    class14_sub18.anInt3037 = arg0;
			    return;
			}
			try {
			    class14_sub18
				= (Class14_Sub18) aClass14_Sub9_Sub3_4835
						      .aClass2_4858
						      .method76(-1);
			} catch (RuntimeException runtimeexception) {
			    break while_529_;
			}
		    }
		} while (false);
		Class14_Sub28 class14_sub28
		    = ((Class14_Sub28)
		       aClass55_4781.method1230((long) anIntArray4775[arg1],
						(byte) 23));
		if (null != class14_sub28) {
		    Class14_Sub12_Sub1 class14_sub12_sub1;
		    do {
			try {
			    class14_sub12_sub1
				= (class14_sub28.aClass14_Sub12_Sub1Array3212
				   [arg0]);
			    if (class14_sub12_sub1 != null)
				break;
			} catch (RuntimeException runtimeexception) {
			    break while_529_;
			}
			return;
		    } while (false);
		    try {
			Class14_Sub18 class14_sub18 = new Class14_Sub18();
			class14_sub18.anInt3053 = arg1;
			class14_sub18.aClass14_Sub12_Sub1_3059
			    = class14_sub12_sub1;
			class14_sub18.aClass14_Sub28_3054 = class14_sub28;
			class14_sub18.aClass127_3062
			    = class14_sub28.aClass127Array3221[arg0];
			class14_sub18.anInt3039
			    = class14_sub28.aByteArray3220[arg0];
			class14_sub18.anInt3037 = arg0;
			class14_sub18.anInt3046
			    = (1024 + (class14_sub28.aByteArray3213[arg0]
				       * arg3
				       * (arg3 * class14_sub28.anInt3224))
			       >> 1586668459);
			class14_sub18.anInt3038
			    = class14_sub28.aByteArray3227[arg0] & 0xff;
			if (arg2 <= 77)
			    method694(-62, -34, -49);
			class14_sub18.anInt3052
			    = ((arg0 << -639226168)
			       + -(0x7fff
				   & class14_sub28.aShortArray3223[arg0]));
			class14_sub18.anInt3058 = 0;
			class14_sub18.anInt3045 = 0;
			class14_sub18.anInt3040 = 0;
			class14_sub18.anInt3035 = 0;
			class14_sub18.anInt3041 = -1;
			if ((anIntArray4826[arg1] ^ 0xffffffff) == -1)
			    class14_sub18.aClass14_Sub9_Sub4_3051
				= (Class14_Sub9_Sub4.method763
				   (class14_sub12_sub1,
				    method718(class14_sub18, -128),
				    method698(-627246801, class14_sub18),
				    method693(class14_sub18, true)));
			else {
			    class14_sub18.aClass14_Sub9_Sub4_3051
				= (Class14_Sub9_Sub4.method763
				   (class14_sub12_sub1,
				    method718(class14_sub18, -113), 0,
				    method693(class14_sub18, true)));
			    method705(106, class14_sub18,
				      -1 < (class14_sub28.aShortArray3223[arg0]
					    ^ 0xffffffff));
			}
			if (0 > class14_sub28.aShortArray3223[arg0])
			    class14_sub18.aClass14_Sub9_Sub4_3051
				.method765(-1);
			if (-1 >= (class14_sub18.anInt3039 ^ 0xffffffff)) {
			    Class14_Sub18 class14_sub18_13_
				= (aClass14_Sub18ArrayArray4825[arg1]
				   [class14_sub18.anInt3039]);
			    if (class14_sub18_13_ != null
				&& ((class14_sub18_13_.anInt3041 ^ 0xffffffff)
				    > -1)) {
				aClass14_Sub18ArrayArray4823[arg1]
				    [class14_sub18_13_.anInt3037]
				    = null;
				class14_sub18_13_.anInt3041 = 0;
			    }
			    aClass14_Sub18ArrayArray4825[arg1][(class14_sub18
								.anInt3039)]
				= class14_sub18;
			}
			aClass14_Sub9_Sub3_4835.aClass2_4858
			    .method80(class14_sub18, (byte) -126);
			aClass14_Sub18ArrayArray4823[arg1][arg0]
			    = class14_sub18;
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		    break while_530_;
		}
		return;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.OA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	} while (false);
    }
    
    public static void method700(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 >= -100)
		aDouble4756 = -0.8864850902319418;
	    Class14_Sub8_Sub11.anIntArray4275[arg0] = arg2;
	    anInt4786++;
	    Class14_Sub13 class14_sub13
		= ((Class14_Sub13)
		   Class2.aClass55_92.method1230((long) arg0, (byte) -117));
	    if (null == class14_sub13) {
		class14_sub13
		    = new Class14_Sub13(Class84.method1413((byte) -46)
					- -500L);
		Class2.aClass55_92.method1224(8, (long) arg0, class14_sub13);
	    } else
		class14_sub13.aLong2963
		    = Class84.method1413((byte) 116) - -500L;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.DA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method701(byte arg0, int arg1, int arg2) {
	try {
	    anInt4758++;
	    if (arg0 != 73)
		anIntArray4826 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.S(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public synchronized void method702(int arg0, int arg1, int arg2) {
	try {
	    method695(arg1, -128, arg2);
	    anInt4765++;
	    if (arg0 != 0)
		aClass55_4781 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method703(boolean arg0) {
	try {
	    if (arg0)
		aDouble4756 = -0.6316306604150126;
	    aClass124_4808 = null;
	    aClass124_4829 = null;
	    aClass124_4767 = null;
	    anIntArray4804 = null;
	    aClass124_4762 = null;
	    aClass124_4810 = null;
	    aClass124_4831 = null;
	    aClass124_4773 = null;
	    anIntArray4827 = null;
	    aClass124_4770 = null;
	    aClass14_Sub16_4780 = null;
	    aClass124_4761 = null;
	    aClass124_4790 = null;
	    aClass124_4794 = null;
	    aClass124_4814 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.U(" + arg0 + ')');
	}
    }
    
    public void method704(int arg0) {
    while_532_:
	do {
	while_531_:
	    do {
		int i;
		int i_14_;
		long l;
		try {
		    if (arg0 != -12887)
			anInt4764 = -71;
		    anInt4811++;
		    i = anInt4834;
		    i_14_ = anInt4833;
		    l = aLong4836;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		while ((anInt4833 ^ 0xffffffff) == (i_14_ ^ 0xffffffff)) {
		    while ((aClass27_4789.anIntArray507[i] ^ 0xffffffff)
			   == (i_14_ ^ 0xffffffff)) {
			aClass27_4789.method1048(i);
			int i_15_ = aClass27_4789.method1039(i);
			if (1 == i_15_) {
			    aClass27_4789.method1045();
			    aClass27_4789.method1036(i);
			    if (aClass27_4789.method1041()) {
				if (aBoolean4837 && -1 != (i_14_ ^ 0xffffffff))
				    aClass27_4789.method1037(l);
				else {
				    method707(2676);
				    aClass27_4789.method1046();
				    return;
				}
			    }
			    break;
			}
			try {
			    if (0 != (0x80 & i_15_))
				method717(true, i_15_);
			    aClass27_4789.method1042(i);
			    aClass27_4789.method1036(i);
			} catch (RuntimeException runtimeexception) {
			    break while_531_;
			}
		    }
		    i = aClass27_4789.method1044();
		    i_14_ = aClass27_4789.anIntArray507[i];
		    l = aClass27_4789.method1038(i_14_);
		}
		anInt4833 = i_14_;
		aLong4836 = l;
		anInt4834 = i;
		break while_532_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ea.QA(" + arg0 + ')');
	} while (false);
    }
    
    public void method705(int arg0, Class14_Sub18 arg1, boolean arg2) {
	try {
	    anInt4774++;
	    int i = 10 % ((70 - arg0) / 35);
	    int i_16_ = arg1.aClass14_Sub12_Sub1_3059.aByteArray4899.length;
	    int i_17_;
	    if (!arg2 || !arg1.aClass14_Sub12_Sub1_3059.aBoolean4897)
		i_17_ = (int) (((long) anIntArray4826[arg1.anInt3053]
				* (long) i_16_)
			       >> -517547578);
	    else {
		int i_18_ = (i_16_ - -i_16_
			     + -arg1.aClass14_Sub12_Sub1_3059.anInt4896);
		i_16_ <<= 8;
		i_17_ = (int) (((long) i_18_
				* (long) anIntArray4826[arg1.anInt3053])
			       >> -172087802);
		if (i_17_ >= i_16_) {
		    arg1.aClass14_Sub9_Sub4_3051.method779(true);
		    i_17_ = -1 + (i_16_ - -i_16_) - i_17_;
		}
	    }
	    arg1.aClass14_Sub9_Sub4_3051.method778(i_17_);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.V(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public synchronized boolean method706
	(int arg0, Class14_Sub16 arg1, int arg2, Class9 arg3, Class120 arg4) {
	boolean bool;
	try {
	    int i = 91 / ((24 - arg2) / 62);
	    arg1.method877();
	    boolean bool_19_ = true;
	    int[] is = null;
	    if (arg0 > 0)
		is = new int[] { arg0 };
	    anInt4803++;
	    for (Class14_Sub17 class14_sub17
		     = ((Class14_Sub17)
			arg1.aClass55_3003.method1228((byte) -120));
		 null != class14_sub17;
		 class14_sub17 = ((Class14_Sub17)
				  arg1.aClass55_3003.method1227((byte) -23))) {
		int i_20_ = (int) class14_sub17.aLong355;
		Class14_Sub28 class14_sub28
		    = ((Class14_Sub28)
		       aClass55_4781.method1230((long) i_20_, (byte) -108));
		if (class14_sub28 == null) {
		    class14_sub28
			= Class14_Sub2_Sub5.method285(i_20_, arg3, (byte) 98);
		    if (null == class14_sub28) {
			bool_19_ = false;
			continue;
		    }
		    aClass55_4781.method1224(8, (long) i_20_, class14_sub28);
		}
		if (!class14_sub28.method927(is, arg4, true,
					     class14_sub17.aByteArray3011))
		    bool_19_ = false;
	    }
	    if (bool_19_)
		arg1.method876();
	    bool = bool_19_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("ea.O(" + arg0 + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
	return bool;
    }
    
    public void method707(int arg0) {
    while_534_:
	do {
	while_533_:
	    do {
		do {
		    try {
			method720(-1, 121);
			method724(-1, -25515);
			anInt4792++;
			for (int i = 0; i < 16; i++)
			    anIntArray4775[i] = anIntArray4832[i];
			if (arg0 == 2676)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_533_;
		    }
		    return;
		} while (false);
		try {
		    for (int i = 0; -17 < (i ^ 0xffffffff); i++)
			anIntArray4777[i]
			    = Class14_Sub8_Sub26.method617(anIntArray4832[i],
							   -128);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_534_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ea.A(" + arg0 + ')');
	} while (false);
    }
    
    public synchronized int method690() {
	int i;
	try {
	    anInt4795++;
	    i = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ea.F()");
	}
	return i;
    }
    
    public static void method708(byte[] arg0, int arg1) {
	try {
	    Class14_Sub10 class14_sub10 = new Class14_Sub10(arg0);
	    anInt4757++;
	    class14_sub10.anInt2908 = -2 + arg0.length;
	    Class32.anInt547 = class14_sub10.method784((byte) 123);
	    Class98.aByteArrayArray1667 = new byte[Class32.anInt547][];
	    Class12.aByteArrayArray310 = new byte[Class32.anInt547][];
	    Class14_Sub2_Sub12.anIntArray3918 = new int[Class32.anInt547];
	    Class40.anIntArray675 = new int[Class32.anInt547];
	    Class76.anIntArray1204 = new int[Class32.anInt547];
	    Class125_Sub4.aBooleanArray3416 = new boolean[Class32.anInt547];
	    Class17.anIntArray402 = new int[Class32.anInt547];
	    class14_sub10.anInt2908 = arg0.length - (7 + 8 * Class32.anInt547);
	    Class14_Sub11.anInt2952 = class14_sub10.method784((byte) 105);
	    Class14_Sub30.anInt3279 = class14_sub10.method784((byte) 116);
	    int i = 1 + (0xff & class14_sub10.method798(arg1 + -18));
	    for (int i_21_ = 0; i_21_ < Class32.anInt547; i_21_++)
		Class40.anIntArray675[i_21_]
		    = class14_sub10.method784((byte) 123);
	    for (int i_22_ = 0; Class32.anInt547 > i_22_; i_22_++)
		Class14_Sub2_Sub12.anIntArray3918[i_22_]
		    = class14_sub10.method784((byte) 112);
	    int i_23_ = 0;
	    if (arg1 != 144)
		method703(true);
	    for (/**/; i_23_ < Class32.anInt547; i_23_++)
		Class17.anIntArray402[i_23_]
		    = class14_sub10.method784((byte) 126);
	    for (i_23_ = 0; i_23_ < Class32.anInt547; i_23_++)
		Class76.anIntArray1204[i_23_]
		    = class14_sub10.method784((byte) 114);
	    class14_sub10.anInt2908
		= -(8 * Class32.anInt547) + arg0.length - (7
							   - -((-1 + i) * 3));
	    Class73.anIntArray1114 = new int[i];
	    for (i_23_ = 1; i_23_ < i; i_23_++) {
		Class73.anIntArray1114[i_23_]
		    = class14_sub10.method829(arg1 + -30);
		if (-1 == (Class73.anIntArray1114[i_23_] ^ 0xffffffff))
		    Class73.anIntArray1114[i_23_] = 1;
	    }
	    class14_sub10.anInt2908 = 0;
	    for (i_23_ = 0;
		 (Class32.anInt547 ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
		 i_23_++) {
		int i_24_ = Class17.anIntArray402[i_23_];
		boolean bool = false;
		int i_25_ = Class76.anIntArray1204[i_23_];
		int i_26_ = i_25_ * i_24_;
		byte[] is = new byte[i_26_];
		byte[] is_27_ = new byte[i_26_];
		Class12.aByteArrayArray310[i_23_] = is_27_;
		Class98.aByteArrayArray1667[i_23_] = is;
		int i_28_ = class14_sub10.method798(-46);
		if (0 == (i_28_ & 0x1)) {
		    for (int i_29_ = 0;
			 (i_29_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff); i_29_++)
			is_27_[i_29_] = class14_sub10.method780((byte) -77);
		    if (-1 != (0x2 & i_28_ ^ 0xffffffff)) {
			for (int i_30_ = 0;
			     (i_30_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff);
			     i_30_++) {
			    byte i_31_
				= (is[i_30_]
				   = class14_sub10.method780((byte) -77));
			    bool = bool | -1 != i_31_;
			}
		    }
		} else {
		    for (int i_32_ = 0;
			 (i_24_ ^ 0xffffffff) < (i_32_ ^ 0xffffffff);
			 i_32_++) {
			for (int i_33_ = 0; i_25_ > i_33_; i_33_++)
			    is_27_[i_32_ - -(i_33_ * i_24_)]
				= class14_sub10.method780((byte) -77);
		    }
		    if (0 != (i_28_ & 0x2)) {
			for (int i_34_ = 0; i_24_ > i_34_; i_34_++) {
			    for (int i_35_ = 0; i_25_ > i_35_; i_35_++) {
				byte i_36_
				    = (is[i_24_ * i_35_ + i_34_]
				       = class14_sub10.method780((byte) -77));
				bool = bool | (i_36_ ^ 0xffffffff) != 0;
			    }
			}
		    }
		}
		Class125_Sub4.aBooleanArray3416[i_23_] = bool;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.P("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public synchronized void method687(int[] arg0, int arg1, int arg2) {
	try {
	    anInt4768++;
	    if (aClass27_4789.method1049()) {
		int i
		    = aClass27_4789.anInt506 * anInt4806 / Class115.anInt1909;
		do {
		    long l = aLong4838 - -((long) arg2 * (long) i);
		    if (aLong4836 + -l >= 0L) {
			aLong4838 = l;
			break;
		    }
		    int i_37_
			= (int) (((long) i + aLong4836 + -aLong4838 + -1L)
				 / (long) i);
		    aLong4838 += (long) i_37_ * (long) i;
		    arg2 -= i_37_;
		    aClass14_Sub9_Sub3_4835.method687(arg0, arg1, i_37_);
		    method704(-12887);
		    arg1 += i_37_;
		} while (aClass27_4789.method1049());
	    }
	    aClass14_Sub9_Sub3_4835.method687(arg0, arg1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public void method709(int arg0, int arg1) {
	try {
	    if (-1 != (anIntArray4817[arg1] & 0x4 ^ 0xffffffff)) {
		for (Class14_Sub18 class14_sub18
			 = ((Class14_Sub18)
			    aClass14_Sub9_Sub3_4835.aClass2_4858.method77(0));
		     class14_sub18 != null;
		     class14_sub18
			 = (Class14_Sub18) aClass14_Sub9_Sub3_4835
					       .aClass2_4858.method84(-58)) {
		    if (arg1 == class14_sub18.anInt3053)
			class14_sub18.anInt3044 = 0;
		}
	    }
	    int i = 76 % ((arg0 - 32) / 61);
	    anInt4755++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.EA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public synchronized void method710(int arg0, int arg1) {
    while_536_:
	do {
	while_535_:
	    do {
		do {
		    try {
			anInt4764 = arg1;
			if (arg0 == -28225)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_535_;
		    }
		    return;
		} while (false);
		try {
		    anInt4824++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_536_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.GA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public static Class method711(String arg0, int arg1)
	throws ClassNotFoundException {
    while_537_:
	do {
	    do {
		Class var_class;
		try {
		    anInt4822++;
		    if (!arg0.equals("B"))
			break;
		    var_class = Byte.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("I"))
			break;
		    var_class = Integer.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("S"))
			break;
		    var_class = Short.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    int i = 90 / ((arg1 - -37) / 63);
		    if (!arg0.equals("J"))
			break;
		    var_class = Long.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("Z"))
			break;
		    var_class = Boolean.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("F"))
			break;
		    var_class = Float.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("D"))
			break;
		    var_class = Double.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    do {
		Class var_class;
		try {
		    if (!arg0.equals("C"))
			break;
		    var_class = Character.TYPE;
		} catch (RuntimeException runtimeexception) {
		    break while_537_;
		}
		return var_class;
	    } while (false);
	    Class var_class;
	    try {
		var_class = Class.forName(arg0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return var_class;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ea.W("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public void method712(int arg0, int arg1) {
    while_539_:
	do {
	while_538_:
	    do {
		do {
		    try {
			for (Class14_Sub18 class14_sub18
				 = (Class14_Sub18) aClass14_Sub9_Sub3_4835
						       .aClass2_4858
						       .method77(0);
			     null != class14_sub18;
			     class14_sub18
				 = ((Class14_Sub18)
				    aClass14_Sub9_Sub3_4835.aClass2_4858
					.method84(arg1 ^ 0x27042683))) {
			    if (((arg0 ^ 0xffffffff) > -1
				 || arg0 == class14_sub18.anInt3053)
				&& ((class14_sub18.anInt3041 ^ 0xffffffff)
				    > -1)) {
				aClass14_Sub18ArrayArray4823
				    [class14_sub18.anInt3053]
				    [class14_sub18.anInt3037]
				    = null;
				class14_sub18.anInt3041 = 0;
			    }
			}
			if (arg1 == -654583480)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_538_;
		    }
		    return;
		} while (false);
		try {
		    anInt4800++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_539_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.AA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public void method713(int arg0, int arg1, int arg2) {
	try {
	    anInt4787++;
	    if (arg2 != 0)
		aClass124_4829 = null;
	    if (arg0 != anIntArray4775[arg1]) {
		anIntArray4775[arg1] = arg0;
		for (int i = 0; -129 < (i ^ 0xffffffff); i++)
		    aClass14_Sub18ArrayArray4825[arg1][i] = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.R(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method714(int arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg3 != 2)
		method728(45, -59);
	    anInt4820++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.BA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    public synchronized void method715(int arg0) {
	try {
	    anInt4799++;
	    for (Class14_Sub28 class14_sub28
		     = (Class14_Sub28) aClass55_4781.method1228((byte) -52);
		 null != class14_sub28;
		 class14_sub28
		     = (Class14_Sub28) aClass55_4781.method1227((byte) -23))
		class14_sub28.method929((byte) -104);
	    if (arg0 != -22255)
		method704(83);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.FA(" + arg0 + ')');
	}
    }
    
    public synchronized void method716(byte arg0) {
	try {
	    anInt4813++;
	    for (Class14_Sub28 class14_sub28
		     = (Class14_Sub28) aClass55_4781.method1228((byte) -94);
		 class14_sub28 != null;
		 class14_sub28
		     = (Class14_Sub28) aClass55_4781.method1227((byte) -23))
		class14_sub28.method233(0);
	    if (arg0 >= -42)
		method694(-113, 27, -27);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.E(" + arg0 + ')');
	}
    }
    
    public void method717(boolean arg0, int arg1) {
    while_541_:
	do {
	while_540_:
	    do {
		int i;
		do {
		    try {
			anInt4785++;
			i = 0xf0 & arg1;
			if (-129 != (i ^ 0xffffffff))
			    break;
			int i_38_ = arg1 & 0xf;
			int i_39_ = 0x7f & arg1 >> -654583480;
			int i_40_ = (0x7f070a & arg1) >> 1717035024;
			method722(-31396, i_40_, i_38_, i_39_);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (144 != i)
			    break;
			int i_41_ = 0xf & arg1;
			int i_42_ = (0x7feb & arg1) >> -489418104;
			int i_43_ = (arg1 & 0x7f6820) >> -1104603664;
			if (i_43_ <= 0)
			    method722(-31396, 64, i_41_, i_42_);
			else
			    method699(i_42_, i_41_, 115, i_43_);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-161 != (i ^ 0xffffffff))
			    break;
			int i_44_ = 0xf & arg1;
			int i_45_ = (arg1 & 0x7fdc) >> -879881176;
			int i_46_ = 0x7f & arg1 >> -1231068816;
			method714(i_44_, i_45_, i_46_, 2);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (176 != i)
			    break;
			int i_47_ = (0x7ff2 & arg1) >> -1343323672;
			int i_48_ = 0xf & arg1;
			int i_49_ = 0x7f & arg1 >> 2088550672;
			if (0 == i_47_)
			    anIntArray4777[i_48_]
				= ((i_49_ << -1585236082)
				   + (Class14_Sub8_Sub26.method617
				      (anIntArray4777[i_48_], -2080769)));
			if (i_47_ == 32)
			    anIntArray4777[i_48_]
				= (Class14_Sub8_Sub26.method617((anIntArray4777
								 [i_48_]),
								-16257)
				   - -(i_49_ << 78463879));
			if (-2 == (i_47_ ^ 0xffffffff))
			    anIntArray4819[i_48_]
				= ((i_49_ << 1490248583)
				   + (Class14_Sub8_Sub26.method617
				      (anIntArray4819[i_48_], -16257)));
			if ((i_47_ ^ 0xffffffff) == -34)
			    anIntArray4819[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(-128, anIntArray4819[i_48_])
				   + i_49_);
			if (5 == i_47_)
			    anIntArray4805[i_48_]
				= (Class14_Sub8_Sub26.method617((anIntArray4805
								 [i_48_]),
								-16257)
				   - -(i_49_ << -1456906105));
			if ((i_47_ ^ 0xffffffff) == -38)
			    anIntArray4805[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(anIntArray4805[i_48_], -128)
				   - -i_49_);
			if (-8 == (i_47_ ^ 0xffffffff))
			    anIntArray4771[i_48_]
				= ((i_49_ << 2110724487)
				   + (Class14_Sub8_Sub26.method617
				      (anIntArray4771[i_48_], -16257)));
			if ((i_47_ ^ 0xffffffff) == -40)
			    anIntArray4771[i_48_]
				= i_49_ + (Class14_Sub8_Sub26.method617
					   (anIntArray4771[i_48_], -128));
			if (10 == i_47_)
			    anIntArray4801[i_48_]
				= (Class14_Sub8_Sub26.method617(-16257,
								(anIntArray4801
								 [i_48_]))
				   + (i_49_ << 854305063));
			if (42 == i_47_)
			    anIntArray4801[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(-128, anIntArray4801[i_48_])
				   + i_49_);
			if (11 == i_47_)
			    anIntArray4784[i_48_]
				= ((i_49_ << 1624297031)
				   + (Class14_Sub8_Sub26.method617
				      (anIntArray4784[i_48_], -16257)));
			if (-44 == (i_47_ ^ 0xffffffff))
			    anIntArray4784[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(-128, anIntArray4784[i_48_])
				   - -i_49_);
			if (-65 == (i_47_ ^ 0xffffffff)) {
			    if (i_49_ >= 64)
				anIntArray4817[i_48_]
				    = Class66.method1294(anIntArray4817[i_48_],
							 1);
			    else
				anIntArray4817[i_48_]
				    = (Class14_Sub8_Sub26.method617
				       (anIntArray4817[i_48_], -2));
			}
			if ((i_47_ ^ 0xffffffff) == -66) {
			    if ((i_49_ ^ 0xffffffff) > -65) {
				method728(101, i_48_);
				anIntArray4817[i_48_]
				    = (Class14_Sub8_Sub26.method617
				       (anIntArray4817[i_48_], -3));
			    } else
				anIntArray4817[i_48_]
				    = Class66.method1294(anIntArray4817[i_48_],
							 2);
			}
			if (99 == i_47_)
			    anIntArray4772[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(anIntArray4772[i_48_], 127)
				   + (i_49_ << -234861177));
			if (98 == i_47_)
			    anIntArray4772[i_48_]
				= i_49_ + (Class14_Sub8_Sub26.method617
					   (16256, anIntArray4772[i_48_]));
			if (-102 == (i_47_ ^ 0xffffffff))
			    anIntArray4772[i_48_]
				= (16384
				   + Class14_Sub8_Sub26
					 .method617(127, anIntArray4772[i_48_])
				   + (i_49_ << 1593969095));
			if (100 == i_47_)
			    anIntArray4772[i_48_]
				= (i_49_ + 16384
				   - -(Class14_Sub8_Sub26.method617
				       (16256, anIntArray4772[i_48_])));
			if (-121 == (i_47_ ^ 0xffffffff))
			    method720(i_48_, 110);
			if (121 == i_47_)
			    method724(i_48_, -25515);
			if ((i_47_ ^ 0xffffffff) == -124)
			    method712(i_48_, -654583480);
			if ((i_47_ ^ 0xffffffff) == -7) {
			    int i_50_ = anIntArray4772[i_48_];
			    if (16384 == i_50_)
				anIntArray4815[i_48_]
				    = ((Class14_Sub8_Sub26.method617
					(anIntArray4815[i_48_], -16257))
				       - -(i_49_ << 11414951));
			}
			if (38 == i_47_) {
			    int i_51_ = anIntArray4772[i_48_];
			    if (i_51_ == 16384)
				anIntArray4815[i_48_]
				    = i_49_ + (Class14_Sub8_Sub26.method617
					       (anIntArray4815[i_48_], -128));
			}
			if (16 == i_47_)
			    anIntArray4826[i_48_]
				= (Class14_Sub8_Sub26.method617(-16257,
								(anIntArray4826
								 [i_48_]))
				   + (i_49_ << 1079372647));
			if (48 == i_47_)
			    anIntArray4826[i_48_]
				= (Class14_Sub8_Sub26
				       .method617(-128, anIntArray4826[i_48_])
				   - -i_49_);
			if (-82 == (i_47_ ^ 0xffffffff)) {
			    if (64 <= i_49_)
				anIntArray4817[i_48_]
				    = Class66.method1294(anIntArray4817[i_48_],
							 4);
			    else {
				method709(-75, i_48_);
				anIntArray4817[i_48_]
				    = (Class14_Sub8_Sub26.method617
				       (anIntArray4817[i_48_], -5));
			    }
			}
			if (17 == i_47_)
			    method723((byte) -63,
				      ((i_49_ << -1466859865)
				       + (anIntArray4766[i_48_] & ~0x3f80)),
				      i_48_);
			if (i_47_ == 49)
			    method723((byte) 76,
				      i_49_ + (anIntArray4766[i_48_] & ~0x7f),
				      i_48_);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if ((i ^ 0xffffffff) != -193)
			    break;
			int i_52_ = 0xf & arg1;
			int i_53_ = (0x7f55 & arg1) >> -1763507896;
			method713(i_53_ + anIntArray4777[i_52_], i_52_, 0);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (208 != i)
			    break;
			int i_54_ = 0xf & arg1;
			int i_55_ = arg1 >> -2038152568 & 0x7f;
			method701((byte) 73, i_54_, i_55_);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (224 != i)
			    break;
			int i_56_ = arg1 & 0xf;
			int i_57_ = ((arg1 >> 1034488649 & 0x3f80)
				     - -((0x7f57 & arg1) >> -126600248));
			method694(i_57_, i_56_, 72);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    return;
		} while (false);
		do {
		    try {
			i = 0xff & arg1;
			if ((i ^ 0xffffffff) != -256)
			    break;
			method707(2676);
		    } catch (RuntimeException runtimeexception) {
			break while_540_;
		    }
		    break;
		} while (false);
		break while_541_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.HA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public int method718(Class14_Sub18 arg0, int arg1) {
	int i;
	try {
	    int i_58_ = (arg0.anInt3052
			 - -(arg0.anInt3063 * arg0.anInt3056 >> -489542836));
	    if (arg1 >= -109)
		method698(-56, null);
	    anInt4760++;
	    i_58_
		+= (anIntArray4815[arg0.anInt3053]
		    * (-8192 + anIntArray4798[arg0.anInt3053])) >> 1309227116;
	    Class127 class127 = arg0.aClass127_3062;
	    if (-1 > (class127.anInt2103 ^ 0xffffffff)
		&& (0 < class127.anInt2108
		    || -1 > (anIntArray4819[arg0.anInt3053] ^ 0xffffffff))) {
		int i_59_ = class127.anInt2100 << 1031626817;
		int i_60_ = class127.anInt2108 << -1416593118;
		if ((i_59_ ^ 0xffffffff) < (arg0.anInt3043 ^ 0xffffffff))
		    i_60_ = i_60_ * arg0.anInt3043 / i_59_;
		i_60_ += anIntArray4819[arg0.anInt3053] >> -1625938649;
		double d = Math.sin(0.01227184630308513
				    * (double) (0x1ff & arg0.anInt3049));
		i_58_ += (int) (d * (double) i_60_);
	    }
	    int i_61_
		= (int) (0.5
			 + ((double) (256 * (arg0.aClass14_Sub12_Sub1_3059
					     .anInt4895))
			    * Math.pow(2.0,
				       3.255208333333333E-4 * (double) i_58_)
			    / (double) Class115.anInt1909));
	    i = (i_61_ ^ 0xffffffff) <= -2 ? i_61_ : 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.LA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return i;
    }
    
    public synchronized void method719(int arg0, boolean arg1,
				       Class14_Sub16 arg2) {
	try {
	    method697(-120);
	    aClass27_4789.method1035(arg2.aByteArray3002);
	    aBoolean4837 = arg1;
	    aLong4838 = 0L;
	    anInt4797++;
	    int i = aClass27_4789.method1043();
	    for (int i_62_ = arg0; i > i_62_; i_62_++) {
		aClass27_4789.method1048(i_62_);
		aClass27_4789.method1042(i_62_);
		aClass27_4789.method1036(i_62_);
	    }
	    anInt4834 = aClass27_4789.method1044();
	    anInt4833 = aClass27_4789.anIntArray507[anInt4834];
	    aLong4836 = aClass27_4789.method1038(anInt4833);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.B(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method720(int arg0, int arg1) {
	try {
	    for (Class14_Sub18 class14_sub18
		     = ((Class14_Sub18)
			aClass14_Sub9_Sub3_4835.aClass2_4858.method77(0));
		 null != class14_sub18;
		 class14_sub18
		     = ((Class14_Sub18)
			aClass14_Sub9_Sub3_4835.aClass2_4858.method84(-92))) {
		if (0 > arg0 || class14_sub18.anInt3053 == arg0) {
		    if (null != class14_sub18.aClass14_Sub9_Sub4_3051) {
			class14_sub18.aClass14_Sub9_Sub4_3051
			    .method777(Class115.anInt1909 / 100);
			if (class14_sub18.aClass14_Sub9_Sub4_3051.method776())
			    aClass14_Sub9_Sub3_4835.aClass14_Sub9_Sub2_4859
				.method735
				(class14_sub18.aClass14_Sub9_Sub4_3051);
			class14_sub18.method885(false);
		    }
		    if ((class14_sub18.anInt3041 ^ 0xffffffff) > -1)
			aClass14_Sub18ArrayArray4823
			    [class14_sub18.anInt3053][class14_sub18.anInt3037]
			    = null;
		    class14_sub18.method233(0);
		}
	    }
	    if (arg1 <= 89)
		aDouble4756 = -2.1490784692665255;
	    anInt4779++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.CA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public synchronized boolean method721(byte arg0) {
	boolean bool;
	try {
	    if (arg0 < 108)
		anInt4833 = -1;
	    anInt4788++;
	    bool = aClass27_4789.method1049();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.NA(" + arg0 + ')');
	}
	return bool;
    }
    
    public void method722(int arg0, int arg1, int arg2, int arg3) {
    while_543_:
	do {
	while_542_:
	    do {
		Class14_Sub18 class14_sub18;
		do {
		    try {
			if (arg0 != -31396)
			    method703(true);
			class14_sub18
			    = aClass14_Sub18ArrayArray4823[arg2][arg3];
			anInt4816++;
			if (class14_sub18 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_542_;
		    }
		    return;
		} while (false);
		try {
		    aClass14_Sub18ArrayArray4823[arg2][arg3] = null;
		    if ((anIntArray4817[arg2] & 0x2 ^ 0xffffffff) != -1) {
			for (Class14_Sub18 class14_sub18_63_
				 = (Class14_Sub18) aClass14_Sub9_Sub3_4835
						       .aClass2_4858
						       .method77(arg0 + 31396);
			     null != class14_sub18_63_;
			     class14_sub18_63_
				 = (Class14_Sub18) aClass14_Sub9_Sub3_4835
						       .aClass2_4858
						       .method84(-118)) {
			    if (((class14_sub18_63_.anInt3053 ^ 0xffffffff)
				 == (class14_sub18.anInt3053 ^ 0xffffffff))
				&& class14_sub18_63_.anInt3041 < 0
				&& class14_sub18 != class14_sub18_63_) {
				class14_sub18.anInt3041 = 0;
				break;
			    }
			}
		    } else
			class14_sub18.anInt3041 = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_543_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.Q(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	} while (false);
    }
    
    public void method723(byte arg0, int arg1, int arg2) {
	try {
	    anIntArray4766[arg2] = arg1;
	    anInt4809++;
	    int i = -111 % ((arg0 - 17) / 39);
	    anIntArray4796[arg2]
		= (int) (2097152.0 * Math.pow(2.0,
					      (double) arg1 * 5.4931640625E-4)
			 + 0.5);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.JA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method724(int arg0, int arg1) {
    while_545_:
	do {
	while_544_:
	    do {
		do {
		    try {
			anInt4828++;
			if (arg0 >= 0)
			    break;
			for (arg0 = 0; -17 < (arg0 ^ 0xffffffff); arg0++)
			    method724(arg0, -25515);
		    } catch (RuntimeException runtimeexception) {
			break while_544_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray4771[arg0] = 12800;
		    anIntArray4801[arg0] = 8192;
		    anIntArray4784[arg0] = 16383;
		    if (arg1 != -25515)
			method699(3, 23, 13, -58);
		    anIntArray4798[arg0] = 8192;
		    anIntArray4819[arg0] = 0;
		    anIntArray4805[arg0] = 8192;
		    method728(85, arg0);
		    method709(102, arg0);
		    anIntArray4817[arg0] = 0;
		    anIntArray4772[arg0] = 32767;
		    anIntArray4815[arg0] = 256;
		    anIntArray4826[arg0] = 0;
		    method723((byte) 87, 8192, arg0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_545_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ea.KA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public boolean method725(int[] arg0, Class14_Sub18 arg1, int arg2,
			     int arg3, int arg4) {
    while_546_:
	do {
	    do {
		boolean bool;
		try {
		    arg1.anInt3048 = Class115.anInt1909 / 100;
		    anInt4778++;
		    if (-1 < (arg1.anInt3041 ^ 0xffffffff)
			|| (null != arg1.aClass14_Sub9_Sub4_3051
			    && !arg1.aClass14_Sub9_Sub4_3051.method748()))
			break;
		    arg1.method885(false);
		    arg1.method233(0);
		    if (0 < arg1.anInt3039
			&& (aClass14_Sub18ArrayArray4825[arg1.anInt3053]
			    [arg1.anInt3039]) == arg1)
			aClass14_Sub18ArrayArray4825[arg1.anInt3053]
			    [arg1.anInt3039]
			    = null;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_546_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg2 >= 69)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_546_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    int i = arg1.anInt3063;
		    if (0 < i) {
			i -= (int) (0.5
				    + (16.0
				       * (Math.pow
					  (2.0,
					   (4.921259842519685E-4
					    * (double) (anIntArray4805
							[arg1.anInt3053]))))));
			if ((i ^ 0xffffffff) > -1)
			    i = 0;
			arg1.anInt3063 = i;
		    }
		    arg1.aClass14_Sub9_Sub4_3051.method741(method718(arg1,
								     -112));
		    arg1.anInt3043++;
		    Class127 class127 = arg1.aClass127_3062;
		    arg1.anInt3049 += class127.anInt2103;
		    double d = ((double) ((arg1.anInt3037 + -60 << 1256429512)
					  + (arg1.anInt3063 * arg1.anInt3056
					     >> -510670964))
				* 5.086263020833333E-6);
		    boolean bool_64_ = false;
		    if (0 < class127.anInt2097) {
			if (class127.anInt2106 <= 0)
			    arg1.anInt3040 += 128;
			else
			    arg1.anInt3040
				+= (int) (Math.pow(2.0,
						   ((double) class127.anInt2106
						    * d)) * 128.0
					  + 0.5);
			if ((arg1.anInt3040 * class127.anInt2097 ^ 0xffffffff)
			    <= -819201)
			    bool_64_ = true;
		    }
		    if (null != class127.aByteArray2109) {
			if (0 >= class127.anInt2096)
			    arg1.anInt3058 += 128;
			else
			    arg1.anInt3058
				+= (int) ((Math.pow(2.0,
						    d * (double) (class127
								  .anInt2096))
					   * 128.0)
					  + 0.5);
			for (/**/;
			     (((arg1.anInt3045 ^ 0xffffffff)
			       > (-2 + class127.aByteArray2109.length
				  ^ 0xffffffff))
			      && arg1.anInt3058 > (0xff00
						   & ((class127.aByteArray2109
						       [arg1.anInt3045 - -2])
						      << -1874416248)));
			     arg1.anInt3045 += 2) {
			    /* empty */
			}
			if ((-2 + class127.aByteArray2109.length
			     == arg1.anInt3045)
			    && (class127.aByteArray2109[1 + arg1.anInt3045]
				== 0))
			    bool_64_ = true;
		    }
		    if (arg1.anInt3041 >= 0 && null != class127.aByteArray2098
			&& 0 == (anIntArray4817[arg1.anInt3053] & 0x1)
			&& (0 > arg1.anInt3039
			    || arg1 != (aClass14_Sub18ArrayArray4825
					[arg1.anInt3053][arg1.anInt3039]))) {
			if (0 < class127.anInt2099)
			    arg1.anInt3041
				+= (int) (0.5
					  + (128.0
					     * Math.pow(2.0,
							((double) (class127
								   .anInt2099)
							 * d))));
			else
			    arg1.anInt3041 += 128;
			for (/**/;
			     (((arg1.anInt3035 ^ 0xffffffff)
			       > (class127.aByteArray2098.length - 2
				  ^ 0xffffffff))
			      && arg1.anInt3041 > (0xff00
						   & ((class127.aByteArray2098
						       [arg1.anInt3035 + 2])
						      << 594721064)));
			     arg1.anInt3035 += 2) {
			    /* empty */
			}
			if ((-2 + class127.aByteArray2098.length ^ 0xffffffff)
			    == (arg1.anInt3035 ^ 0xffffffff))
			    bool_64_ = true;
		    }
		    if (!bool_64_)
			break;
		    arg1.aClass14_Sub9_Sub4_3051.method777(arg1.anInt3048);
		    if (null == arg0)
			arg1.aClass14_Sub9_Sub4_3051.method692(arg3);
		    else
			arg1.aClass14_Sub9_Sub4_3051.method687(arg0, arg4,
							       arg3);
		    if (arg1.aClass14_Sub9_Sub4_3051.method776())
			aClass14_Sub9_Sub3_4835.aClass14_Sub9_Sub2_4859
			    .method735(arg1.aClass14_Sub9_Sub4_3051);
		    arg1.method885(false);
		    if (0 <= arg1.anInt3041) {
			arg1.method233(0);
			if ((arg1.anInt3039 ^ 0xffffffff) < -1
			    && (aClass14_Sub18ArrayArray4825[arg1.anInt3053]
				[arg1.anInt3039]) == arg1)
			    aClass14_Sub18ArrayArray4825[arg1.anInt3053]
				[arg1.anInt3039]
				= null;
		    }
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_546_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		arg1.aClass14_Sub9_Sub4_3051.method746(arg1.anInt3048,
						       method698(-627246801,
								 arg1),
						       method693(arg1, true));
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ea.H("
					    + (arg0 != null ? "{...}" : "null")
					    + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ','
					    + arg4 + ')'));
    }
    
    public boolean method726(Class14_Sub18 arg0, int arg1) {
    while_547_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg1 != 2)
			method709(50, -89);
		    anInt4782++;
		    if (arg0.aClass14_Sub9_Sub4_3051 != null)
			break;
		    if (arg0.anInt3041 >= 0) {
			arg0.method233(arg1 + -2);
			if ((arg0.anInt3039 ^ 0xffffffff) < -1
			    && arg0 == (aClass14_Sub18ArrayArray4825
					[arg0.anInt3053][arg0.anInt3039]))
			    aClass14_Sub18ArrayArray4825[arg0.anInt3053]
				[arg0.anInt3039]
				= null;
		    }
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_547_;
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
					   ("ea.M("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public int method727(int arg0) {
    while_548_:
	do {
	    do {
		int i;
		try {
		    if (arg0 == 0)
			break;
		    i = 61;
		} catch (RuntimeException runtimeexception) {
		    break while_548_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt4818++;
		i = anInt4764;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ea.IA(" + arg0 + ')');
    }
    
    public void method728(int arg0, int arg1) {
	try {
	    if (arg0 < 61)
		aClass27_4789 = null;
	    anInt4783++;
	    if (0 != (anIntArray4817[arg1] & 0x2)) {
		for (Class14_Sub18 class14_sub18
			 = ((Class14_Sub18)
			    aClass14_Sub9_Sub3_4835.aClass2_4858.method77(0));
		     null != class14_sub18;
		     class14_sub18
			 = (Class14_Sub18) aClass14_Sub9_Sub3_4835
					       .aClass2_4858.method84(-106)) {
		    if (arg1 == class14_sub18.anInt3053
			&& (aClass14_Sub18ArrayArray4823[arg1]
			    [class14_sub18.anInt3037]) == null
			&& (class14_sub18.anInt3041 ^ 0xffffffff) > -1)
			class14_sub18.anInt3041 = 0;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ea.PA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class14_Sub9_Sub1() {
	anInt4764 = 256;
	anIntArray4777 = new int[16];
	anIntArray4784 = new int[16];
	anIntArray4798 = new int[16];
	aClass14_Sub18ArrayArray4825 = new Class14_Sub18[16][128];
	anInt4806 = 1000000;
	anIntArray4805 = new int[16];
	aClass14_Sub18ArrayArray4823 = new Class14_Sub18[16][128];
	anIntArray4815 = new int[16];
	anIntArray4772 = new int[16];
	anIntArray4826 = new int[16];
	anIntArray4796 = new int[16];
	anIntArray4817 = new int[16];
	anIntArray4801 = new int[16];
	anIntArray4775 = new int[16];
	anIntArray4832 = new int[16];
	anIntArray4819 = new int[16];
	aClass27_4789 = new Class27();
	aClass14_Sub9_Sub3_4835 = new Class14_Sub9_Sub3(this);
	try {
	    aClass55_4781 = new Class55(128);
	    method707(2676);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ea.<init>()");
	}
    }
    
    static {
	aClass124_4770 = aClass124_4790;
	anIntArray4804 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
	aClass124_4794 = Class14_Sub2_Sub2.method263(1178, "Hidden");
	aClass124_4810
	    = Class14_Sub2_Sub2.method263(1178, "Loaded interfaces");
	aClass124_4767
	    = Class14_Sub2_Sub2.method263(1178, "Loaded input handler");
	aClass124_4762 = aClass124_4810;
	aClass124_4808 = aClass124_4794;
	anIntArray4827 = new int[256];
	aClass124_4814 = Class14_Sub2_Sub2.method263(1178, "settings=");
	aClass124_4773 = aClass124_4767;
	aClass124_4829 = null;
	aDouble4756 = -1.0;
	aClass124_4831 = Class14_Sub2_Sub2.method263(1178, "");
	aClass124_4761 = aClass124_4831;
    }
}
