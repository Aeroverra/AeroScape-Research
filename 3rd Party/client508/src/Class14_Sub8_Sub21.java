/* Class14_Sub8_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub21 extends Class14_Sub8
{
    public static int anInt4430;
    public int[] anIntArray4431;
    public static int anInt4432;
    public static int anInt4433;
    public static Class124 aClass124_4434
	= Class14_Sub2_Sub2.method263(1178, "b12_full");
    public static int[] anIntArray4435;
    public static int anInt4436;
    public static int anInt4437;
    public int anInt4438 = 0;
    public static int anInt4439 = 2301979;
    public static int anInt4440;
    public int[][] anIntArrayArray4441;
    public static Class124 aClass124_4442;
    public static int anInt4443;
    public static int[] anIntArray4444;
    public static Class124 aClass124_4445;
    public static Class94 aClass94_4446;
    public int[] anIntArray4447;
    public short[] aShortArray4448 = new short[257];
    public static int anInt4449;
    public static int anInt4450;
    public static int anInt4451;
    
    public void method472(int arg0) {
	try {
	    if (null == anIntArrayArray4441)
		anIntArrayArray4441 = new int[][] { { 0, 0 }, { 4096, 4096 } };
	    anInt4433++;
	    if (2 > anIntArrayArray4441.length)
		throw new RuntimeException
			  ("Curve operation requires at least two markers");
	    if (2 == anInt4438)
		method586(true);
	    Class14_Sub2_Sub12.method321(256);
	    if (arg0 != 0)
		method586(false);
	    method592((byte) 111);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "le.I(" + arg0 + ')');
	}
    }
    
    public void method586(boolean arg0) {
    while_412_:
	do {
	while_411_:
	    do {
		do {
		    try {
			anInt4432++;
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_411_;
		    }
		    return;
		} while (false);
		try {
		    int[] is = anIntArrayArray4441[0];
		    int[] is_0_ = anIntArrayArray4441[1];
		    int[] is_1_
			= anIntArrayArray4441[anIntArrayArray4441.length - 2];
		    int[] is_2_
			= anIntArrayArray4441[-1 + anIntArrayArray4441.length];
		    anIntArray4447
			= new int[] { is_1_[0] - is_2_[0] + is_1_[0],
				      -is_2_[1] - -is_1_[1] + is_1_[1] };
		    anIntArray4431 = new int[] { is[0] - (-is[0] + is_0_[0]),
						 is[1] - is_0_[1] - -is[1] };
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_412_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "le.J(" + arg0 + ')');
	} while (false);
    }
    
    public Class14_Sub8_Sub21() {
	super(1, true);
    }
    
    public static void method587(long[] arg0, int arg1, int[] arg2,
				 boolean arg3, int arg4) {
	try {
	    anInt4443++;
	    if (arg1 > arg4) {
		int i = arg4;
		int i_3_ = (arg1 + arg4) / 2;
		long l = arg0[i_3_];
		arg0[i_3_] = arg0[arg1];
		arg0[arg1] = l;
		int i_4_ = arg2[i_3_];
		arg2[i_3_] = arg2[arg1];
		arg2[arg1] = i_4_;
		for (int i_5_ = arg4; i_5_ < arg1; i_5_++) {
		    if (arg0[i_5_] < (long) (i_5_ & 0x1) + l) {
			long l_6_ = arg0[i_5_];
			arg0[i_5_] = arg0[i];
			arg0[i] = l_6_;
			int i_7_ = arg2[i_5_];
			arg2[i_5_] = arg2[i];
			arg2[i++] = i_7_;
		    }
		}
		arg0[arg1] = arg0[i];
		arg0[i] = l;
		arg2[arg1] = arg2[i];
		arg2[i] = i_4_;
		method587(arg0, -1 + i, arg2, false, arg4);
		method587(arg0, arg1, arg2, false, i - -1);
	    }
	    if (arg3)
		method587(null, 67, null, true, 8);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("le.H("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4
						+ ')'));
	}
    }
    
    public static void method588
	(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5,
	 int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10,
	 int arg11, byte arg12, int arg13, int arg14) {
	if (arg0 < 0)
	    arg0 = 0;
	else if (arg0 >= Class99_Sub2.anInt3338 * 128)
	    arg0 = Class99_Sub2.anInt3338 * 128 - 1;
	if (arg2 < 0)
	    arg2 = 0;
	else if (arg2 >= Class14_Sub8_Sub15.anInt4337 * 128)
	    arg2 = Class14_Sub8_Sub15.anInt4337 * 128 - 1;
	Class150.anInt2420 = Class3.anIntArray108[arg3];
	Class7_Sub3_Sub1.anInt3718 = Class3.anIntArray111[arg3];
	Class14_Sub1.anInt2719 = Class3.anIntArray108[arg4];
	Class37.anInt643 = Class3.anIntArray111[arg4];
	Class4.anInt125 = arg0;
	Class14_Sub2.anInt2741 = arg1;
	Class14_Sub2_Sub8.anInt3853 = arg2;
	Class71.anInt1101 = arg0 / 128;
	Class102.anInt1724 = arg2 / 128;
	Class7_Sub1.anInt2659 = Class71.anInt1101 - Class73.anInt1108;
	if (Class7_Sub1.anInt2659 < 0)
	    Class7_Sub1.anInt2659 = 0;
	Class14_Sub9_Sub3.anInt4849 = Class102.anInt1724 - Class73.anInt1108;
	if (Class14_Sub9_Sub3.anInt4849 < 0)
	    Class14_Sub9_Sub3.anInt4849 = 0;
	Class14_Sub8_Sub37.anInt4722 = Class71.anInt1101 + Class73.anInt1108;
	if (Class14_Sub8_Sub37.anInt4722 > Class99_Sub2.anInt3338)
	    Class14_Sub8_Sub37.anInt4722 = Class99_Sub2.anInt3338;
	Class14_Sub8_Sub26.anInt4526 = Class102.anInt1724 + Class73.anInt1108;
	if (Class14_Sub8_Sub26.anInt4526 > Class14_Sub8_Sub15.anInt4337)
	    Class14_Sub8_Sub26.anInt4526 = Class14_Sub8_Sub15.anInt4337;
	int i = 3584;
	for (int i_8_ = 0; i_8_ < Class73.anInt1108 + Class73.anInt1108 + 2;
	     i_8_++) {
	    for (int i_9_ = 0;
		 i_9_ < Class73.anInt1108 + Class73.anInt1108 + 2; i_9_++) {
		int i_10_ = ((i_8_ - Class73.anInt1108 << 7)
			     - (Class4.anInt125 & 0x7f));
		int i_11_ = ((i_9_ - Class73.anInt1108 << 7)
			     - (Class14_Sub2_Sub8.anInt3853 & 0x7f));
		int i_12_ = Class71.anInt1101 - Class73.anInt1108 + i_8_;
		int i_13_ = Class102.anInt1724 - Class73.anInt1108 + i_9_;
		if (i_12_ >= 0 && i_13_ >= 0 && i_12_ < Class99_Sub2.anInt3338
		    && i_13_ < Class14_Sub8_Sub15.anInt4337) {
		    int i_14_;
		    if (Class150.anIntArrayArrayArray2419 != null)
			i_14_ = (Class150.anIntArrayArrayArray2419[0][i_12_]
				 [i_13_]) - Class14_Sub2.anInt2741 + 128;
		    else
			i_14_ = (Class149.anIntArrayArrayArray2391[0][i_12_]
				 [i_13_]) - Class14_Sub2.anInt2741 + 128;
		    int i_15_
			= (Class149.anIntArrayArrayArray2391[3][i_12_][i_13_]
			   - Class14_Sub2.anInt2741 - 1000);
		    Class14_Sub8_Sub3.aBooleanArrayArray4138[i_8_][i_9_]
			= Class124.method1714(i_10_, i_15_, i_14_, i_11_, i);
		} else
		    Class14_Sub8_Sub3.aBooleanArrayArray4138[i_8_][i_9_]
			= false;
	    }
	}
	for (int i_16_ = 0; i_16_ < Class73.anInt1108 + Class73.anInt1108 + 1;
	     i_16_++) {
	    for (int i_17_ = 0;
		 i_17_ < Class73.anInt1108 + Class73.anInt1108 + 1; i_17_++)
		Class53.aBooleanArrayArray873[i_16_][i_17_]
		    = (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_16_][i_17_]
		       || (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_16_ + 1]
			   [i_17_])
		       || (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_16_]
			   [i_17_ + 1])
		       || (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_16_ + 1]
			   [i_17_ + 1]));
	}
	Class21.anIntArray437 = arg6;
	Class98.anIntArray1660 = arg7;
	Class106.anIntArray1790 = arg8;
	Class142.anIntArray2284 = arg9;
	Class104.anIntArray1737 = arg10;
	Class99.method1503();
	if (Class40.aClass14_Sub29ArrayArrayArray674 != null) {
	    Class14_Sub8_Sub28.method627(true);
	    Canvas_Sub2.method67(arg0, arg1, arg2, null, 0, (byte) 0, arg13,
				 arg14);
	    Class14_Sub30.aBoolean3269 = false;
	    Class132.method1778(0, (byte) -79, 0);
	    Class57.method1246(null);
	    Class10.method188();
	    Class14_Sub8_Sub28.method627(false);
	}
	Canvas_Sub2.method67(arg0, arg1, arg2, arg5, arg11, arg12, arg13,
			     arg14);
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4451++;
	    if (arg1 > -58)
		anInt4439 = 20;
	    int[] is_18_ = aClass149_2851.method2014(arg0, (byte) 104);
	    if (aClass149_2851.aBoolean2402) {
		int[] is_19_ = method483(0, (byte) -120, arg0);
		for (int i = 0; i < Class112.anInt1876; i++) {
		    int i_20_ = is_19_[i] >> -2031357884;
		    if (0 > i_20_)
			i_20_ = 0;
		    if (256 < i_20_)
			i_20_ = 256;
		    is_18_[i] = aShortArray4448[i_20_];
		}
	    }
	    is = is_18_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("le.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public int[] method589(int arg0, int arg1) {
    while_413_:
	do {
	    do {
		int[] is;
		try {
		    if (arg0 < 10)
			aClass124_4442 = null;
		    anInt4440++;
		    if (0 <= arg1)
			break;
		    is = anIntArray4431;
		} catch (RuntimeException runtimeexception) {
		    break while_413_;
		}
		return is;
	    } while (false);
	    do {
		int[] is;
		try {
		    if (anIntArrayArray4441.length > arg1)
			break;
		    is = anIntArray4447;
		} catch (RuntimeException runtimeexception) {
		    break while_413_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		is = anIntArrayArray4441[arg1];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "le.E(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method590(boolean arg0) {
	try {
	    aClass94_4446 = null;
	    aClass124_4445 = null;
	    aClass124_4434 = null;
	    if (arg0 != true)
		anIntArray4435 = null;
	    anIntArray4435 = null;
	    aClass124_4442 = null;
	    anIntArray4444 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "le.G(" + arg0 + ')');
	}
    }
    
    public static void method591(int arg0, Class133_Sub1_Sub1 arg1, int arg2,
				 int arg3, int arg4) {
    while_415_:
	do {
	while_414_:
	    do {
		do {
		    try {
			anInt4430++;
			if (Class14_Sub3.aClass133_Sub1_Sub1_2748 != arg1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_414_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (Class14_Sub8_Sub38.anInt4729 < 400)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_414_;
		    }
		    return;
		} while (false);
		try {
		    Class124 class124;
		    if (0 == arg1.anInt4928)
			class124
			    = (Class14_Sub8_Sub7.method515
			       ((new Class124[]
				 { arg1.method1808(true),
				   (Class153.method2047
				    (1, (Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .anInt4937), arg1.anInt4937)),
				   Class14_Sub8_Sub17.aClass124_4360,
				   Class48.aClass124_797,
				   Class83.method1407(52, arg1.anInt4937),
				   Class14_Sub8_Sub27.aClass124_4552 }),
				(byte) -95));
		    else
			class124 = (Class14_Sub8_Sub7.method515
				    ((new Class124[]
				      { arg1.method1808(true),
					Class14_Sub8_Sub17.aClass124_4360,
					Class14_Sub2_Sub21.aClass124_4083,
					Class83.method1407(90, arg1.anInt4928),
					Class14_Sub8_Sub27.aClass124_4552 }),
				     (byte) -98));
		    if (arg0 < 73)
			method587(null, 36, null, false, 106);
		    if (-2 != (Class51.anInt831 ^ 0xffffffff)) {
			if (!Class14_Sub4.aBoolean2784) {
			    for (int i = 7; -1 >= (i ^ 0xffffffff); i--) {
				if (Class56.aClass124Array919[i] != null) {
				    short i_21_ = 0;
				    if (-1 == (Class14_Sub2_Sub1.anInt3749
					       ^ 0xffffffff)
					&& (Class56.aClass124Array919[i]
						.method1717
					    (40, Class118.aClass124_1973))) {
					if (((Class14_Sub3
					      .aClass133_Sub1_Sub1_2748
					      .anInt4937)
					     ^ 0xffffffff)
					    > (arg1.anInt4937 ^ 0xffffffff))
					    i_21_ = (short) 2000;
					if (0 != (Class14_Sub3
						  .aClass133_Sub1_Sub1_2748
						  .anInt4916)
					    && -1 != (arg1.anInt4916
						      ^ 0xffffffff)) {
					    if (arg1.anInt4916
						!= (Class14_Sub3
						    .aClass133_Sub1_Sub1_2748
						    .anInt4916))
						i_21_ = (short) 0;
					    else
						i_21_ = (short) 2000;
					}
				    } else if (Class14_Sub8_Sub11
					       .aBooleanArray4271[i])
					i_21_ = (short) 2000;
				    Class14_Sub9_Sub1.anInt4830++;
				    boolean bool = false;
				    short i_22_ = Class14.aShortArray357[i];
				    i_22_ += i_21_;
				    Class14_Sub11.method853
					(32, Class56.aClass124Array919[i],
					 arg2,
					 (Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { Class17.aClass124_398,
					      class124 }),
					   (byte) -127)),
					 i_22_, (long) arg4, arg3);
				}
			    }
			} else if ((Class2.anInt101 & 0x8) == 8) {
			    Class14_Sub3.anInt2770++;
			    Class14_Sub11.method853
				(32, Class125.aClass124_2082, arg2,
				 (Class14_Sub8_Sub7.method515
				  (new Class124[] { Class17.aClass124_408,
						    Class68.aClass124_1064,
						    class124 },
				   (byte) -16)),
				 (short) 16, (long) arg4, arg3);
			}
		    } else {
			Class26.anInt480++;
			Class14_Sub11.method853
			    (32, Class40.aClass124_665, arg2,
			     Class14_Sub8_Sub7.method515((new Class124[]
							  { (Class14_Sub6
							     .aClass124_2809),
							    (Class68
							     .aClass124_1064),
							    class124 }),
							 (byte) -97),
			     (short) 49, (long) arg4, arg3);
		    }
		    for (int i = 0; i < Class14_Sub8_Sub38.anInt4729; i++) {
			if ((Class14_Sub29.aShortArray3262[i] ^ 0xffffffff)
			    == -9) {
			    RuntimeException_Sub1.aClass124Array2459[i]
				= (Class14_Sub8_Sub7.method515
				   (new Class124[] { Class17.aClass124_398,
						     class124 },
				    (byte) -124));
			    break;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_415_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("le.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_417_:
	do {
	while_416_:
	    do {
		do {
		    try {
			anInt4449++;
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_416_;
		    }
		    return;
		} while (false);
		try {
		    if (arg0 == 0) {
			anInt4438 = arg2.method798(88);
			anIntArrayArray4441
			    = new int[arg2.method798(arg1 + -24903)][2];
			for (int i = 0;
			     ((anIntArrayArray4441.length ^ 0xffffffff)
			      < (i ^ 0xffffffff));
			     i++) {
			    anIntArrayArray4441[i][0]
				= arg2.method784((byte) 113);
			    anIntArrayArray4441[i][1]
				= arg2.method784((byte) 126);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_417_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("le.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public void method592(byte arg0) {
	try {
	    anInt4437++;
	    int i = anInt4438;
	while_418_:
	    do {
		do {
		    if (-3 != (i ^ 0xffffffff)) {
			if (1 != i)
			    break;
		    } else {
			for (i = 0; 257 > i; i++) {
			    int i_23_ = i << 1653956452;
			    int i_24_;
			    for (i_24_ = 1;
				 ((anIntArrayArray4441.length + -1
				   ^ 0xffffffff) < (i_24_ ^ 0xffffffff)
				  && ((i_23_ ^ 0xffffffff)
				      <= (anIntArrayArray4441[i_24_][0]
					  ^ 0xffffffff)));
				 i_24_++) {
				/* empty */
			    }
			    int[] is = anIntArrayArray4441[-1 + i_24_];
			    int[] is_25_ = anIntArrayArray4441[i_24_];
			    int i_26_ = method589(114, -2 + i_24_)[1];
			    int i_27_ = is[1];
			    int i_28_ = is_25_[1];
			    int i_29_ = method589(106, 1 + i_24_)[1];
			    int i_30_ = ((-is[0] + i_23_ << 1671943020)
					 / (is_25_[0] - is[0]));
			    int i_31_ = i_30_ * i_30_ >> -1019254516;
			    int i_32_ = i_27_ + -i_26_ + (i_29_ + -i_28_);
			    int i_33_ = -i_27_ + (i_26_ + -i_32_);
			    int i_34_ = i_28_ + -i_26_;
			    int i_35_ = (i_31_ * (i_30_ * i_32_ >> -923080852)
					 >> 1617707308);
			    int i_36_ = i_27_;
			    int i_37_ = i_30_ * i_34_ >> 1324441420;
			    int i_38_ = i_33_ * i_31_ >> -1895335924;
			    int i_39_ = i_37_ + (i_35_ + i_38_ + i_36_);
			    if (-32768 >= i_39_)
				i_39_ = -32767;
			    if ((i_39_ ^ 0xffffffff) <= -32769)
				i_39_ = 32767;
			    aShortArray4448[i] = (short) i_39_;
			}
			break while_418_;
		    }
		    for (i = 0; (i ^ 0xffffffff) > -258; i++) {
			int i_40_ = i << -1665502844;
			int i_41_;
			for (i_41_ = 1;
			     (i_41_ < -1 + anIntArrayArray4441.length
			      && anIntArrayArray4441[i_41_][0] <= i_40_);
			     i_41_++) {
			    /* empty */
			}
			int[] is = anIntArrayArray4441[i_41_ + -1];
			int[] is_42_ = anIntArrayArray4441[i_41_];
			int i_43_ = ((i_40_ - is[0] << 1626764524)
				     / (-is[0] + is_42_[0]));
			int i_44_ = (-(Class99_Sub2.anIntArray3357
				       [(0x1fe4 & i_43_) >> 1583673317]) + 4096
				     >> -348233407);
			int i_45_ = 4096 + -i_44_;
			int i_46_
			    = is[1] * i_45_ + i_44_ * is_42_[1] >> 961847020;
			if ((i_46_ ^ 0xffffffff) >= 32767)
			    i_46_ = -32767;
			if (32768 <= i_46_)
			    i_46_ = 32767;
			aShortArray4448[i] = (short) i_46_;
		    }
		    break while_418_;
		} while (false);
		for (i = 0; 257 > i; i++) {
		    int i_47_ = i << 316502564;
		    int i_48_;
		    for (i_48_ = 1;
			 (((anIntArrayArray4441.length + -1 ^ 0xffffffff)
			   < (i_48_ ^ 0xffffffff))
			  && ((anIntArrayArray4441[i_48_][0] ^ 0xffffffff)
			      >= (i_47_ ^ 0xffffffff)));
			 i_48_++) {
			/* empty */
		    }
		    int[] is = anIntArrayArray4441[i_48_];
		    int[] is_49_ = anIntArrayArray4441[i_48_ + -1];
		    int i_50_ = ((i_47_ - is_49_[0] << 680032876)
				 / (is[0] - is_49_[0]));
		    int i_51_ = 4096 - i_50_;
		    int i_52_
			= i_51_ * is_49_[1] + is[1] * i_50_ >> -1483050836;
		    if (i_52_ <= -32768)
			i_52_ = -32767;
		    if (32768 <= i_52_)
			i_52_ = 32767;
		    aShortArray4448[i] = (short) i_52_;
		}
	    } while (false);
	    i = 119 % ((arg0 - 52) / 59);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "le.K(" + arg0 + ')');
	}
    }
    
    static {
	anInt4436 = 0;
	aClass124_4442 = Class14_Sub2_Sub2.method263(1178, "null");
	aClass124_4445 = Class14_Sub2_Sub2.method263(1178, "loginscreen");
	anIntArray4444 = new int[25];
    }
}
