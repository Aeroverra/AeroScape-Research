/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class46
{
    public int anInt753;
    public boolean aBoolean754;
    public static Class124 aClass124_755;
    public int anInt756 = -1;
    public boolean aBoolean757;
    public int anInt758;
    public static int anInt759;
    public int anInt760;
    public static Class124 aClass124_761
	= Class14_Sub2_Sub2.method263(1178, ":duelfriend:");
    public static int anInt762;
    public int[] anIntArray763;
    public static int anInt764;
    public static int anInt765;
    public static int anInt766;
    public static int anInt767;
    public int[] anIntArray768;
    public static int anInt769;
    public int anInt770;
    public int anInt771;
    public static int anInt772;
    public static int anInt773;
    public static int anInt774;
    public int[] anIntArray775;
    public int[][] anIntArrayArray776;
    public int anInt777;
    public static int anInt778;
    public static int anInt779;
    public int[] anIntArray780;
    public int anInt781;
    public static int anInt782;
    
    public Class133_Sub7 method1167(int arg0, int arg1, Class133_Sub7 arg2) {
    while_762_:
	do {
	    int i;
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt773++;
		    i = anIntArray768[arg0];
		    class14_sub2_sub15
			= Class14_Sub4.method457(3, i >> 1755809040);
		    i &= arg1;
		    if (null != class14_sub2_sub15)
			break;
		    class133_sub7 = arg2.method1860(true, true);
		} catch (RuntimeException runtimeexception) {
		    break while_762_;
		}
		return class133_sub7;
	    } while (false);
	    Class14_Sub2_Sub15 class14_sub2_sub15_0_;
	    int i_1_;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    class14_sub2_sub15_0_ = null;
		    i_1_ = 0;
		    if (anIntArray775 != null
			&& ((anIntArray775.length ^ 0xffffffff)
			    < (arg0 ^ 0xffffffff))) {
			i_1_ = anIntArray775[arg0];
			class14_sub2_sub15_0_
			    = Class14_Sub4.method457(arg1 + -65532,
						     i_1_ >> -1816217872);
			i_1_ &= 0xffff;
		    }
		    if (class14_sub2_sub15_0_ != null && i_1_ != 65535)
			break;
		    Class133_Sub7 class133_sub7_2_
			= arg2.method1860(!class14_sub2_sub15
					       .method338((byte) 109, i),
					  !aBoolean754);
		    class133_sub7_2_.method1857(class14_sub2_sub15, i,
						aBoolean754);
		    class133_sub7 = class133_sub7_2_;
		} catch (RuntimeException runtimeexception) {
		    break while_762_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    try {
		Class133_Sub7 class133_sub7_3_
		    = arg2.method1860((!class14_sub2_sub15
					    .method338((byte) 107, i)
				       & !class14_sub2_sub15_0_
					      .method338((byte) 115, i_1_)),
				      !aBoolean754);
		class133_sub7_3_.method1857(class14_sub2_sub15, i,
					    aBoolean754);
		class133_sub7_3_.method1857(class14_sub2_sub15_0_, i_1_,
					    aBoolean754);
		class133_sub7 = class133_sub7_3_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fg.G(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public Class133_Sub7 method1168(byte arg0, int arg1, Class133_Sub7 arg2) {
    while_763_:
	do {
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt759++;
		    if (arg0 <= 119)
			method1170((byte) 113, -37);
		    arg1 = anIntArray768[arg1];
		    class14_sub2_sub15
			= Class14_Sub4.method457(3, arg1 >> 1771959216);
		    arg1 &= 0xffff;
		    if (class14_sub2_sub15 != null)
			break;
		    class133_sub7 = arg2.method1860(true, true);
		} catch (RuntimeException runtimeexception) {
		    break while_763_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    try {
		Class133_Sub7 class133_sub7_4_
		    = arg2.method1860(!class14_sub2_sub15.method338((byte) 115,
								    arg1),
				      !aBoolean754);
		class133_sub7_4_.method1857(class14_sub2_sub15, arg1,
					    aBoolean754);
		class133_sub7 = class133_sub7_4_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fg.L(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method1169(int arg0, Class14_Sub10 arg1, int arg2) {
    while_765_:
	do {
	while_764_:
	    do {
		do {
		    try {
			anInt767++;
			if (arg2 == -11)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_764_;
		    }
		    return;
		} while (false);
		try {
		    if (-2 == (arg0 ^ 0xffffffff)) {
			int i = arg1.method784((byte) 102);
			anIntArray763 = new int[i];
			for (int i_5_ = 0; i > i_5_; i_5_++)
			    anIntArray763[i_5_] = arg1.method784((byte) 123);
			anIntArray768 = new int[i];
			for (int i_6_ = 0;
			     (i ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++)
			    anIntArray768[i_6_] = arg1.method784((byte) 117);
			for (int i_7_ = 0; i > i_7_; i_7_++)
			    anIntArray768[i_7_]
				= ((arg1.method784((byte) 103) << 1028970864)
				   + anIntArray768[i_7_]);
		    } else if (arg0 == 2)
			anInt760 = arg1.method784((byte) 120);
		    else if ((arg0 ^ 0xffffffff) == -4) {
			int i = arg1.method798(72);
			anIntArray780 = new int[i + 1];
			for (int i_8_ = 0; i > i_8_; i_8_++)
			    anIntArray780[i_8_]
				= arg1.method798(Canvas_Sub2.method69(arg2,
								      35));
			anIntArray780[i] = 9999999;
		    } else if ((arg0 ^ 0xffffffff) == -5)
			aBoolean757 = true;
		    else if ((arg0 ^ 0xffffffff) != -6) {
			if ((arg0 ^ 0xffffffff) != -7) {
			    if ((arg0 ^ 0xffffffff) == -8)
				anInt781 = arg1.method784((byte) 102);
			    else if (-9 == (arg0 ^ 0xffffffff))
				anInt770 = arg1.method798(-63);
			    else if (arg0 == 9)
				anInt758 = arg1.method798(-111);
			    else if ((arg0 ^ 0xffffffff) == -11)
				anInt756 = arg1.method798(arg2 + 85);
			    else if (arg0 != 11) {
				if (arg0 != 12) {
				    if (13 == arg0) {
					int i = arg1.method784((byte) 102);
					anIntArrayArray776 = new int[i][];
					for (int i_9_ = 0; i > i_9_; i_9_++) {
					    int i_10_ = arg1.method798(-42);
					    if ((i_10_ ^ 0xffffffff) < -1) {
						anIntArrayArray776[i_9_]
						    = new int[i_10_];
						anIntArrayArray776[i_9_][0]
						    = arg1.method829(41);
						for (int i_11_ = 1;
						     ((i_10_ ^ 0xffffffff)
						      < (i_11_ ^ 0xffffffff));
						     i_11_++)
						    anIntArrayArray776
							[i_9_][i_11_]
							= (arg1.method784
							   ((byte) 113));
					    }
					}
				    } else if (-15 == (arg0 ^ 0xffffffff))
					aBoolean754 = true;
				} else {
				    int i = arg1.method798(-42);
				    anIntArray775 = new int[i];
				    for (int i_12_ = 0;
					 ((i ^ 0xffffffff)
					  < (i_12_ ^ 0xffffffff));
					 i_12_++)
					anIntArray775[i_12_]
					    = arg1.method784((byte) 109);
				    for (int i_13_ = 0; i_13_ < i; i_13_++)
					anIntArray775[i_13_]
					    = ((arg1.method784((byte) 125)
						<< 1265028464)
					       - -anIntArray775[i_13_]);
				}
			    } else
				anInt753 = arg1.method798(-89);
			} else
			    anInt771 = arg1.method784((byte) 123);
		    } else
			anInt777 = arg1.method798(arg2 ^ 0x5);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_765_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("fg.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static Class124 method1170(byte arg0, int arg1) {
    while_766_:
	do {
	    do {
		Class124 class124;
		try {
		    if (arg0 == -99)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_766_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    anInt779++;
		    if (-1 <= (RuntimeException_Sub1.aClass124Array2459
				   [arg1].method1693(arg0 ^ ~0x62)
			       ^ 0xffffffff))
			break;
		    class124
			= (Class14_Sub8_Sub7.method515
			   (new Class124[] { Class112.aClass124Array1875[arg1],
					     Class104.aClass124_1736,
					     (RuntimeException_Sub1
					      .aClass124Array2459[arg1]) },
			    (byte) -118));
		} catch (RuntimeException runtimeexception) {
		    break while_766_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class112.aClass124Array1875[arg1];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "fg.K(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method1171(int arg0) {
	try {
	    if (-1 == anInt756) {
		if (anIntArray780 != null)
		    anInt756 = 2;
		else
		    anInt756 = 0;
	    }
	    int i = -79 / ((24 - arg0) / 45);
	    anInt762++;
	    if (0 == (anInt758 ^ 0xffffffff)) {
		if (null != anIntArray780)
		    anInt758 = 2;
		else
		    anInt758 = 0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fg.A(" + arg0 + ')');
	}
    }
    
    public static int method1172(int arg0) {
	int i;
	try {
	    if (arg0 < 52)
		aClass124_755 = null;
	    anInt778++;
	    i = Class86.anInt1385;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fg.J(" + arg0 + ')');
	}
	return i;
    }
    
    public Class133_Sub7 method1173(int arg0, int arg1, Class133_Sub7 arg2) {
    while_767_:
	do {
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    arg0 = anIntArray768[arg0];
		    anInt766++;
		    class14_sub2_sub15
			= Class14_Sub4.method457(3, arg0 >> 1791344496);
		    arg0 &= arg1;
		    if (null != class14_sub2_sub15)
			break;
		    class133_sub7 = arg2.method1870(true, true);
		} catch (RuntimeException runtimeexception) {
		    break while_767_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    try {
		Class133_Sub7 class133_sub7_14_
		    = arg2.method1870(!class14_sub2_sub15.method338((byte) 113,
								    arg0),
				      !aBoolean754);
		class133_sub7_14_.method1857(class14_sub2_sub15, arg0,
					     aBoolean754);
		class133_sub7 = class133_sub7_14_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fg.E(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static Class124 method1174(long arg0, byte arg1) {
    while_768_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt769++;
		    if (-1L > (arg0 ^ 0xffffffffffffffffL)
			&& -6582952005840035282L < (arg0
						    ^ 0xffffffffffffffffL))
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_768_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (0L != arg0 % 37L)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_768_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		int i = 0;
		long l = arg0;
		if (arg1 < 46)
		    method1176(false, null);
		for (/**/; (l ^ 0xffffffffffffffffL) != -1L; l /= 37L)
		    i++;
		byte[] is = new byte[i];
		while ((arg0 ^ 0xffffffffffffffffL) != -1L) {
		    long l_15_ = arg0;
		    arg0 /= 37L;
		    is[--i] = Class97.aByteArray1638[(int) (-(37L * arg0)
							    + l_15_)];
		}
		Class124 class124_16_ = new Class124();
		class124_16_.aByteArray2495 = is;
		class124_16_.anInt2507 = is.length;
		class124 = class124_16_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "fg.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1175(int arg0) {
	try {
	    int i = 1 / ((arg0 - 42) / 61);
	    aClass124_755 = null;
	    aClass124_761 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fg.C(" + arg0 + ')');
	}
    }
    
    public static void method1176(boolean arg0, Class14_Sub10 arg1) {
    while_770_:
	do {
	while_769_:
	    do {
		int i;
		int i_17_;
		do {
		    try {
			anInt764++;
			i = Class122.anInt2060 >> 1906445345;
			i_17_ = (Class14_Sub8_Sub8.anInt4222 >> 1968704706
				 << 1084717770);
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_769_;
		    }
		    return;
		} while (false);
		try {
		    byte[][] is = (new byte[Class14_Sub2_Sub9.anInt3856]
				   [Class14_Sub8_Sub15.anInt4332]);
		    while ((arg1.aByteArray2895.length ^ 0xffffffff)
			   < (arg1.anInt2908 ^ 0xffffffff)) {
			boolean bool = false;
			int i_18_ = 0;
			int i_19_ = 0;
			if (-2 == (arg1.method798(-72) ^ 0xffffffff)) {
			    bool = true;
			    i_19_ = arg1.method798(-34);
			    i_18_ = arg1.method798(85);
			}
			int i_20_ = arg1.method798(-126);
			int i_21_ = arg1.method798(-84);
			int i_22_ = 64 * i_20_ - Class65.anInt1034;
			int i_23_ = (Class14_Sub8_Sub15.anInt4332 + -1
				     + (-(i_21_ * 64) + Class35.anInt603));
			if (-1 >= (i_22_ ^ 0xffffffff)
			    && -1 >= (-63 + i_23_ ^ 0xffffffff)
			    && i_22_ + 63 < Class14_Sub2_Sub9.anInt3856
			    && ((i_23_ ^ 0xffffffff)
				> (Class14_Sub8_Sub15.anInt4332
				   ^ 0xffffffff))) {
			    for (int i_24_ = 0; i_24_ < 64; i_24_++) {
				byte[] is_25_ = is[i_22_ - -i_24_];
				for (int i_26_ = 0; 64 > i_26_; i_26_++) {
				    if (!bool
					|| (8 * i_19_ <= i_24_
					    && ((i_24_ ^ 0xffffffff)
						> (8 + 8 * i_19_ ^ 0xffffffff))
					    && ((i_26_ ^ 0xffffffff)
						<= (8 * i_18_ ^ 0xffffffff))
					    && ((i_26_ ^ 0xffffffff)
						> (8 * i_18_ - -8
						   ^ 0xffffffff))))
					is_25_[i_23_ - i_26_]
					    = arg1.method780((byte) -77);
				}
			    }
			} else if (bool)
			    arg1.anInt2908 += 64;
			else
			    arg1.anInt2908 += 4096;
		    }
		    int i_27_ = Class14_Sub8_Sub15.anInt4332;
		    int i_28_ = Class14_Sub2_Sub9.anInt3856;
		    int[] is_29_ = new int[i_27_];
		    int[] is_30_ = new int[i_27_];
		    int[] is_31_ = new int[i_27_];
		    int[] is_32_ = new int[i_27_];
		    int[] is_33_ = new int[i_27_];
		    for (int i_34_ = -5; i_28_ > i_34_; i_34_++) {
			for (int i_35_ = 0;
			     (i_27_ ^ 0xffffffff) < (i_35_ ^ 0xffffffff);
			     i_35_++) {
			    int i_36_ = i_34_ - -5;
			    if (i_36_ < i_28_) {
				int i_37_ = is[i_36_][i_35_] & 0xff;
				if (-1 > (i_37_ ^ 0xffffffff)) {
				    Class65 class65
					= Class14_Sub2_Sub14
					      .method335(-52, -1 + i_37_);
				    is_29_[i_35_] += class65.anInt1022;
				    is_30_[i_35_] += class65.anInt1028;
				    is_32_[i_35_] += class65.anInt1023;
				    is_31_[i_35_] += class65.anInt1027;
				    is_33_[i_35_]++;
				}
			    }
			    int i_38_ = -5 + i_34_;
			    if (-1 >= (i_38_ ^ 0xffffffff)) {
				int i_39_ = is[i_38_][i_35_] & 0xff;
				if (-1 > (i_39_ ^ 0xffffffff)) {
				    Class65 class65
					= Class14_Sub2_Sub14
					      .method335(-112, i_39_ - 1);
				    is_29_[i_35_] -= class65.anInt1022;
				    is_30_[i_35_] -= class65.anInt1028;
				    is_32_[i_35_] -= class65.anInt1023;
				    is_31_[i_35_] -= class65.anInt1027;
				    is_33_[i_35_]--;
				}
			    }
			}
			if (i_34_ >= 0) {
			    int[][] is_40_
				= (Class14_Sub22.anIntArrayArrayArray3125
				   [i_34_ >> -713696474]);
			    int i_41_ = 0;
			    int i_42_ = 0;
			    int i_43_ = 0;
			    int i_44_ = 0;
			    int i_45_ = 0;
			    for (int i_46_ = -5; i_27_ > i_46_; i_46_++) {
				int i_47_ = i_46_ - -5;
				if ((i_47_ ^ 0xffffffff)
				    > (i_27_ ^ 0xffffffff)) {
				    i_45_ += is_33_[i_47_];
				    i_43_ += is_30_[i_47_];
				    i_42_ += is_31_[i_47_];
				    i_44_ += is_32_[i_47_];
				    i_41_ += is_29_[i_47_];
				}
				int i_48_ = -5 + i_46_;
				if (-1 >= (i_48_ ^ 0xffffffff)) {
				    i_43_ -= is_30_[i_48_];
				    i_42_ -= is_31_[i_48_];
				    i_44_ -= is_32_[i_48_];
				    i_45_ -= is_33_[i_48_];
				    i_41_ -= is_29_[i_48_];
				}
				if (i_46_ >= 0 && -1 > (i_45_ ^ 0xffffffff)) {
				    int[] is_49_ = is_40_[i_46_ >> 450225702];
				    int i_50_
					= ((i_42_ ^ 0xffffffff) == -1 ? 0
					   : Class37.method1113((256 * i_41_
								 / i_42_),
								i_43_ / i_45_,
								(byte) 69,
								(i_44_
								 / i_45_)));
				    if (0 != is[i_34_][i_46_]) {
					if (is_49_ == null)
					    is_49_
						= is_40_[i_46_ >> 227032582]
						= new int[4096];
					int i_51_ = (0x7f & i_50_) + i;
					if (0 > i_51_)
					    i_51_ = 0;
					else if (127 < i_51_)
					    i_51_ = 127;
					int i_52_
					    = ((i_50_ & 0x380)
					       + ((0xfc00 & i_17_ + i_50_)
						  - -i_51_));
					is_49_[((Class14_Sub8_Sub26.method617
						 (4032, i_46_ << -405335706))
						- -Class14_Sub8_Sub26
						       .method617(i_34_, 63))]
					    = (Class3.anIntArray119
					       [(Class14_Sub2_Sub21.method441
						 (96, 127, i_52_))]);
				    } else if (is_49_ != null)
					is_49_[((Class14_Sub8_Sub26.method617
						 (4032, i_46_ << -776809658))
						+ Class14_Sub8_Sub26
						      .method617(i_34_, 63))]
					    = 0;
				}
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_770_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("fg.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class133_Sub7 method1177(byte arg0, int arg1, int arg2,
				    Class133_Sub7 arg3) {
    while_771_:
	do {
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt765++;
		    arg2 = anIntArray768[arg2];
		    class14_sub2_sub15
			= Class14_Sub4.method457(3, arg2 >> -453107760);
		    arg2 &= 0xffff;
		    if (null != class14_sub2_sub15)
			break;
		    class133_sub7 = arg3.method1860(true, true);
		} catch (RuntimeException runtimeexception) {
		    break while_771_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    try {
		arg1 &= 0x3;
		if (arg0 > -20)
		    anInt756 = -117;
		Class133_Sub7 class133_sub7_53_
		    = arg3.method1860(!class14_sub2_sub15.method338((byte) 121,
								    arg2),
				      !aBoolean754);
		if (1 != arg1) {
		    if (2 == arg1)
			class133_sub7_53_.method1872();
		    else if ((arg1 ^ 0xffffffff) == -4)
			class133_sub7_53_.method1871();
		} else
		    class133_sub7_53_.method1875();
		class133_sub7_53_.method1857(class14_sub2_sub15, arg2,
					     aBoolean754);
		if (1 != arg1) {
		    if (-3 != (arg1 ^ 0xffffffff)) {
			if ((arg1 ^ 0xffffffff) == -4)
			    class133_sub7_53_.method1875();
		    } else
			class133_sub7_53_.method1872();
		} else
		    class133_sub7_53_.method1871();
		class133_sub7 = class133_sub7_53_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fg.M(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public Class133_Sub7 method1178(int arg0, byte arg1, int arg2,
				    Class133_Sub7 arg3, Class46 arg4) {
    while_772_:
	do {
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt772++;
		    arg2 = anIntArray768[arg2];
		    class14_sub2_sub15
			= Class14_Sub4.method457(arg1 + -43,
						 arg2 >> 1661641680);
		    arg2 &= 0xffff;
		    if (class14_sub2_sub15 != null)
			break;
		    class133_sub7 = arg4.method1168((byte) 123, arg0, arg3);
		} catch (RuntimeException runtimeexception) {
		    break while_772_;
		}
		return class133_sub7;
	    } while (false);
	    Class14_Sub2_Sub15 class14_sub2_sub15_54_;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    if (arg1 != 46)
			method1178(21, (byte) -18, 81, null, null);
		    arg0 = arg4.anIntArray768[arg0];
		    class14_sub2_sub15_54_
			= Class14_Sub4.method457(3, arg0 >> -1670973776);
		    arg0 &= 0xffff;
		    if (null != class14_sub2_sub15_54_)
			break;
		    Class133_Sub7 class133_sub7_55_
			= arg3.method1860(!class14_sub2_sub15
					       .method338((byte) 113, arg2),
					  !aBoolean754);
		    class133_sub7_55_.method1857(class14_sub2_sub15, arg2,
						 aBoolean754);
		    class133_sub7 = class133_sub7_55_;
		} catch (RuntimeException runtimeexception) {
		    break while_772_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    try {
		Class133_Sub7 class133_sub7_56_
		    = arg3.method1860((!class14_sub2_sub15
					    .method338((byte) 115, arg2)
				       & !class14_sub2_sub15_54_
					      .method338((byte) 107, arg0)),
				      !arg4.aBoolean754 & !aBoolean754);
		class133_sub7_56_.method1873(class14_sub2_sub15, arg2,
					     class14_sub2_sub15_54_, arg0,
					     anIntArray780,
					     arg4.aBoolean754 | aBoolean754);
		class133_sub7 = class133_sub7_56_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fg.H(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ','
					    + (arg4 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method1179(Class14_Sub10 arg0, byte arg1) {
	try {
	    for (;;) {
		int i = arg0.method798(-57);
		if (0 == i)
		    break;
		method1169(i, arg0, -11);
	    }
	    anInt774++;
	    if (arg1 < 73)
		anIntArray775 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fg.I("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public Class46() {
	aBoolean754 = false;
	aBoolean757 = false;
	anInt758 = -1;
	anInt760 = -1;
	anInt770 = 99;
	anInt777 = 5;
	anInt771 = -1;
	anInt753 = 2;
	anInt781 = -1;
    }
    
    static {
	aClass124_755 = Class14_Sub2_Sub2.method263(1178, ")4a=");
	anInt782 = 0;
    }
}
