/* Class124 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

public class Class124 implements Interface1
{
    public static int anInt2467;
    public static int anInt2468;
    public static int anInt2469;
    public static int anInt2470;
    public static int anInt2471;
    public static int anInt2472;
    public static int[] anIntArray2473;
    public static int anInt2474;
    public static int anInt2475;
    public static Class124 aClass124_2476;
    public static int anInt2477;
    public static int anInt2478;
    public static Class124 aClass124_2479
	= Class14_Sub2_Sub2.method263(1178, "glow1:");
    public static int anInt2480;
    public static int anInt2481;
    public static int anInt2482;
    public static int anInt2483;
    public static int anInt2484;
    public static int anInt2485;
    public static int anInt2486;
    public static int anInt2487;
    public static int anInt2488;
    public static int anInt2489;
    public static int anInt2490;
    public static int anInt2491;
    public static int anInt2492;
    public static int anInt2493;
    public static int anInt2494;
    public byte[] aByteArray2495;
    public static int anInt2496;
    public static Class124 aClass124_2497;
    public static int anInt2498;
    public static int anInt2499;
    public static int anInt2500;
    public static int anInt2501;
    public static int anInt2502;
    public static int anInt2503;
    public static int anInt2504;
    public static int anInt2505;
    public static int anInt2506;
    public int anInt2507;
    public static Class124[] aClass124Array2508;
    public static int anInt2509;
    public static int anInt2510;
    public static int anInt2511;
    public static int anInt2512;
    public static int anInt2513;
    public static int anInt2514;
    public static int anInt2515;
    public static int anInt2516;
    public int anInt2517;
    public static int anInt2518;
    public static int anInt2519;
    public static int anInt2520;
    public static int anInt2521;
    public static int anInt2522;
    public static int anInt2523;
    public static int anInt2524;
    public static int anInt2525;
    public static int anInt2526;
    public static int anInt2527;
    public static int anInt2528;
    public static int anInt2529;
    public static int anInt2530;
    public static int anInt2531;
    public boolean aBoolean2532 = true;
    public static int anInt2533;
    /*synthetic*/ public static Class aClass2534;
    
    public Class124 method1665(int arg0, int arg1, int arg2) {
	Class124 class124;
	try {
	    anInt2492++;
	    if (arg0 < 9)
		method1690(null, 13);
	    byte i = (byte) arg1;
	    byte i_0_ = (byte) arg2;
	    Class124 class124_1_ = new Class124();
	    class124_1_.anInt2507 = anInt2507;
	    class124_1_.aByteArray2495 = new byte[anInt2507];
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (anInt2507 ^ 0xffffffff);
		 i_2_++) {
		byte i_3_ = aByteArray2495[i_2_];
		if (i_3_ != i)
		    class124_1_.aByteArray2495[i_2_] = i_3_;
		else
		    class124_1_.aByteArray2495[i_2_] = i_0_;
	    }
	    class124 = class124_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return class124;
    }
    
    public int hashCode() {
	int i;
	try {
	    anInt2530++;
	    i = method1709(53);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.hashCode()");
	}
	return i;
    }
    
    public Object method1666(Applet arg0, boolean arg1) throws Throwable {
	Object object;
	try {
	    if (arg1)
		aClass124_2497 = null;
	    anInt2502++;
	    String string = new String(aByteArray2495, 0, anInt2507);
	    Object object_4_
		= Class144.method1982((byte) 88, string, arg0, null);
	    if (object_4_ instanceof String) {
		byte[] is = ((String) object_4_).getBytes();
		object_4_ = Class14.method231((byte) 114, is.length, is, 0);
	    }
	    object = object_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.FB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return object;
    }
    
    public static void method1667(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9, int arg10) {
	try {
	    anInt2488++;
	    int i = -arg9 + arg10;
	    int i_5_ = arg3 + -arg1;
	    if (Class14_Sub2_Sub9.anInt3856 > arg10)
		i++;
	    if (arg3 < Class14_Sub8_Sub15.anInt4332)
		i_5_++;
	    int i_6_ = 0;
	    if (arg7 != 1)
		anInt2494 = 4;
	    for (/**/; (i ^ 0xffffffff) < (i_6_ ^ 0xffffffff); i_6_++) {
		int i_7_ = arg4 + arg5 * i_6_ >> -1473644048;
		int i_8_ = arg4 - -((1 + i_6_) * arg5) >> -121568848;
		int i_9_ = -i_7_ + i_8_;
		if (0 < i_9_) {
		    int i_10_ = i_6_ + arg9 >> 225756550;
		    if (i_10_ < 0
			|| i_10_ > -1 + (Class14_Sub22
					 .anIntArrayArrayArray3125).length) {
			i_7_ += arg8;
			for (int i_11_ = 0; i_5_ > i_11_; i_11_++) {
			    int i_12_;
			    if (-1 == (Class7_Sub1.aClass14_Sub2_Sub5_2665
				       .anInt3802)) {
				if ((0x4 & arg1 + i_11_ ^ 0xffffffff)
				    != (0x4 & i_6_ + arg9 ^ 0xffffffff))
				    i_12_ = 4936552;
				else
				    i_12_ = (Class56.anIntArray917
					     [1 + Class4.anInt123]);
			    } else
				i_12_ = (Class7_Sub1.aClass14_Sub2_Sub5_2665
					 .anInt3802);
			    int i_13_
				= (i_11_ * arg6 + arg2 >> -107744112) + arg0;
			    if (i_12_ == 0)
				i_12_ = 1;
			    int i_14_
				= ((arg6 * (1 + i_11_) + arg2 >> 1441892176)
				   - -arg0);
			    int i_15_ = i_14_ - i_13_;
			    Class92.method1454(i_7_, i_13_, i_9_, i_15_,
					       i_12_);
			}
			i_8_ += arg8;
		    } else {
			i_8_ += arg8;
			int[][] is
			    = Class14_Sub22.anIntArrayArrayArray3125[i_10_];
			i_7_ += arg8;
			byte[][] is_16_
			    = Class86.aByteArrayArrayArray1383[i_10_];
			byte[][] is_17_ = (Class14_Sub2_Sub5
					   .aByteArrayArrayArray3816[i_10_]);
			byte[][] is_18_ = (Class14_Sub8_Sub10
					   .aByteArrayArrayArray4257[i_10_]);
			byte[][] is_19_ = (Class14_Sub2_Sub9
					   .aByteArrayArrayArray3864[i_10_]);
			byte[][] is_20_ = (Class14_Sub8_Sub3
					   .aByteArrayArrayArray4130[i_10_]);
			int i_21_ = 0;
			for (/**/; i_21_ < i_5_; i_21_++) {
			    int i_22_ = i_21_ * arg6 + arg2 >> 1399049776;
			    int i_23_
				= arg2 - -(arg6 * (i_21_ - -1)) >> -1688000880;
			    int i_24_ = -i_22_ + i_23_;
			    if (0 < i_24_) {
				i_22_ += arg0;
				i_23_ += arg0;
				int i_25_ = i_21_ + arg1 >> 1411345574;
				int i_26_ = arg1 + i_21_ & 0x3f;
				int i_27_ = arg9 + i_6_ & 0x3f;
				int i_28_ = (i_26_ << 1486487110) + i_27_;
				int i_29_;
				if (i_25_ < 0
				    || ((is.length + -1 ^ 0xffffffff)
					> (i_25_ ^ 0xffffffff))
				    || is[i_25_] == null) {
				    if ((Class7_Sub1.aClass14_Sub2_Sub5_2665
					 .anInt3802)
					!= -1)
					i_29_ = (Class7_Sub1
						 .aClass14_Sub2_Sub5_2665
						 .anInt3802);
				    else if ((0x4 & arg9 + i_6_ ^ 0xffffffff)
					     != (i_21_ - -arg1 & 0x4
						 ^ 0xffffffff))
					i_29_ = 4936552;
				    else
					i_29_ = (Class56.anIntArray917
						 [1 + Class4.anInt123]);
				    if ((i_25_ ^ 0xffffffff) > -1
					|| i_25_ > is.length + -1) {
					if (i_29_ == 0)
					    i_29_ = 1;
					Class92.method1454(i_7_, i_22_, i_9_,
							   i_24_, i_29_);
					continue;
				    }
				} else
				    i_29_ = is[i_25_][i_28_];
				if ((i_29_ ^ 0xffffffff) == -1)
				    i_29_ = 1;
				int i_30_
				    = (is_17_[i_25_] == null ? 0
				       : (Class56.anIntArray917
					  [is_17_[i_25_][i_28_] & 0xff]));
				int i_31_ = (null != is_18_[i_25_]
					     ? (Class56.anIntArray917
						[0xff & is_18_[i_25_][i_28_]])
					     : 0);
				if ((i_30_ ^ 0xffffffff) != -1 || 0 != i_31_) {
				    if (i_30_ != 0) {
					int i_32_
					    = (null != is_16_[i_25_]
					       ? is_16_[i_25_][i_28_] : 0);
					int i_33_ = i_32_ & 0xfc;
					if (i_30_ == -1)
					    i_30_ = 1;
					if (i_33_ != 0
					    && -2 > (i_9_ ^ 0xffffffff)
					    && i_24_ > 1)
					    Class131.method1774
						(Class92.anIntArray1437,
						 i_32_ & 0x3, i_29_, i_7_,
						 i_33_ >> 1523368226, true,
						 i_9_, false, i_30_, i_22_,
						 i_24_);
					else
					    Class92.method1454(i_7_, i_22_,
							       i_9_, i_24_,
							       i_30_);
				    }
				    if (-1 != (i_31_ ^ 0xffffffff)) {
					if (-1 == i_31_)
					    i_31_ = i_29_;
					int i_34_ = is_20_[i_25_][i_28_];
					int i_35_ = 0xfc & i_34_;
					if (-1 == (i_35_ ^ 0xffffffff)
					    || (i_9_ ^ 0xffffffff) >= -2
					    || 1 >= i_24_)
					    Class92.method1454(i_7_, i_22_,
							       i_9_, i_24_,
							       i_31_);
					Class131.method1774
					    (Class92.anIntArray1437,
					     0x3 & i_34_, 0, i_7_,
					     i_35_ >> 321800066,
					     -1 == (i_30_ ^ 0xffffffff), i_9_,
					     false, i_31_, i_22_, i_24_);
				    }
				} else
				    Class92.method1454(i_7_, i_22_, i_9_,
						       i_24_, i_29_);
				if (null != is_19_[i_25_]) {
				    int i_36_ = 0xff & is_19_[i_25_][i_28_];
				    if (i_36_ != 0) {
					int i_37_;
					if (i_9_ != 1)
					    i_37_ = -1 + i_8_;
					else
					    i_37_ = i_7_;
					int i_38_;
					if ((i_24_ ^ 0xffffffff) != -2)
					    i_38_ = -1 + i_23_;
					else
					    i_38_ = i_22_;
					int i_39_ = 13421772;
					if ((-6 >= (i_36_ ^ 0xffffffff)
					     && i_36_ <= 8)
					    || i_36_ >= 13 && i_36_ <= 16
					    || (-22 >= (i_36_ ^ 0xffffffff)
						&& (i_36_ ^ 0xffffffff) >= -25)
					    || i_36_ == 27
					    || -29 == (i_36_ ^ 0xffffffff)) {
					    i_36_ -= 4;
					    i_39_ = 13369344;
					}
					if (i_36_ != 1) {
					    if (-3 != (i_36_ ^ 0xffffffff)) {
						if ((i_36_ ^ 0xffffffff) == -4)
						    Class92.method1461(i_37_,
								       i_22_,
								       i_24_,
								       i_39_);
						else if (-5 == (i_36_
								^ 0xffffffff))
						    Class92.method1458(i_7_,
								       i_38_,
								       i_9_,
								       i_39_);
						else if (i_36_ != 9) {
						    if (10 == i_36_) {
							Class92.method1461
							    (i_37_, i_22_,
							     i_24_, 16777215);
							Class92.method1458
							    (i_7_, i_22_, i_9_,
							     i_39_);
						    } else if (i_36_ != 11) {
							if (-13
							    == (i_36_
								^ 0xffffffff)) {
							    Class92.method1461
								(i_7_, i_22_,
								 i_24_,
								 16777215);
							    Class92.method1458
								(i_7_, i_38_,
								 i_9_, i_39_);
							} else if (17
								   != i_36_) {
							    if (-19
								!= (i_36_
								    ^ 0xffffffff)) {
								if (-20
								    == (i_36_
									^ 0xffffffff))
								    Class92
									.method1458
									(i_37_,
									 i_38_,
									 1,
									 i_39_);
								else if ((i_36_
									  ^ 0xffffffff)
									 == -21)
								    Class92
									.method1458
									(i_7_,
									 i_38_,
									 1,
									 i_39_);
								else if (i_36_
									 != 25) {
								    if (-27
									== (i_36_
									    ^ 0xffffffff)) {
									for (int i_40_ = 0;
									     (i_24_
									      ^ 0xffffffff) < (i_40_ ^ 0xffffffff);
									     i_40_++)
									    Class92.method1458(i_40_ + i_7_, i_40_ + i_22_, 1, i_39_);
								    }
								} else {
								    for (int i_41_
									     = 0;
									 (i_24_
									  > i_41_);
									 i_41_++)
									Class92
									    .method1458
									    (i_7_ - -i_41_,
									     i_38_ - i_41_,
									     1,
									     i_39_);
								}
							    } else
								Class92
								    .method1458
								    (i_37_,
								     i_22_, 1,
								     i_39_);
							} else
							    Class92.method1458
								(i_7_, i_22_,
								 1, i_39_);
						    } else {
							Class92.method1461
							    (i_37_, i_22_,
							     i_24_, 16777215);
							Class92.method1458
							    (i_7_, i_38_, i_9_,
							     i_39_);
						    }
						} else {
						    Class92.method1461
							(i_7_, i_22_, i_24_,
							 16777215);
						    Class92.method1458(i_7_,
								       i_22_,
								       i_9_,
								       i_39_);
						}
					    } else
						Class92.method1458(i_7_, i_22_,
								   i_9_,
								   i_39_);
					} else
					    Class92.method1461(i_7_, i_22_,
							       i_24_, i_39_);
				    }
				}
			    }
			}
		    }
		}
	    }
	    for (i_6_ = -2; 2 + i > i_6_; i_6_++) {
		int i_42_ = arg4 - -(i_6_ * arg5) >> 1581574160;
		int i_43_ = arg4 + (i_6_ - -1) * arg5 >> 2144949168;
		int i_44_ = i_43_ - i_42_;
		if (i_44_ > 0) {
		    i_42_ += arg8;
		    i_43_ += arg8;
		    int i_45_ = i_6_ - -arg9 >> 850932966;
		    if (i_45_ >= 0
			&& (Class79.aShortArrayArrayArray1247.length - 1
			    >= i_45_)) {
			short[][] is
			    = Class79.aShortArrayArrayArray1247[i_45_];
			for (int i_46_ = -2; i_5_ + 2 > i_46_; i_46_++) {
			    int i_47_ = arg2 - -(arg6 * i_46_) >> -748161648;
			    int i_48_ = (1 + i_46_) * arg6 + arg2 >> 629898000;
			    int i_49_ = i_48_ + -i_47_;
			    if (i_49_ > 0) {
				i_47_ += arg0;
				i_48_ += arg0;
				int i_50_ = arg1 + i_46_ >> -818765882;
				if (i_50_ >= 0 && i_50_ <= is.length + -1) {
				    int i_51_ = (((0x3f & i_46_ - -arg1)
						  << -2073358330)
						 - -(0x3f & arg9 + i_6_));
				    if (null != is[i_50_]) {
					int i_52_ = 0x3fff & is[i_50_][i_51_];
					int i_53_
					    = ((is[i_50_][i_51_] & 0xd79a)
					       >> -1281155186);
					if (0 != i_52_) {
					    if (0 != i_53_) {
						if (-2
						    != (i_53_ ^ 0xffffffff)) {
						    if (i_53_ == 2)
							Class14_Sub2_Sub2
							    .aClass148_Sub1Array3762
							    [i_52_ + -1]
							    .method2006
							    (i_42_, i_47_,
							     2 * i_44_,
							     2 * i_49_);
						    else if (3 == i_53_)
							Class99_Sub2
							    .aClass148_Sub1Array3358
							    [i_52_ - 1]
							    .method2006
							    (i_42_, i_47_,
							     2 * i_44_,
							     2 * i_49_);
						} else
						    Class7_Sub2
							.aClass148_Sub1Array2677
							[i_52_ + -1].method2006
							(i_42_, i_47_,
							 2 * i_44_, i_49_ * 2);
					    } else
						Class133_Sub4
						    .aClass148_Sub1Array3581
						    [-1 + i_52_].method2006
						    (i_42_, i_47_, 2 * i_44_,
						     i_49_ * 2);
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.AA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ','
						+ arg10 + ')'));
	}
    }
    
    public Class124 method1668(Class124 arg0, int arg1, int arg2, int arg3) {
	Class124 class124;
	try {
	    anInt2506++;
	    if (!aBoolean2532)
		throw new IllegalArgumentException();
	    if (0 > arg3 || (arg1 ^ 0xffffffff) > (arg3 ^ 0xffffffff)
		|| arg1 > arg0.anInt2507)
		throw new IllegalArgumentException();
	    anInt2517 = arg2;
	    if (aByteArray2495.length < -arg3 + anInt2507 + arg1) {
		int i;
		for (i = 1; (i ^ 0xffffffff) > (anInt2507 + arg0.anInt2507
						^ 0xffffffff); i += i) {
		    /* empty */
		}
		byte[] is = new byte[i];
		Class72.method1322(aByteArray2495, 0, is, 0, anInt2507);
		aByteArray2495 = is;
	    }
	    Class72.method1322(arg0.aByteArray2495, arg3, aByteArray2495,
			       anInt2507, -arg3 + arg1);
	    anInt2507 += -arg3 + arg1;
	    class124 = this;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.PA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	}
	return class124;
    }
    
    public void method1669(int arg0, Applet arg1) throws Throwable {
    while_1091_:
	do {
	while_1090_:
	    do {
		do {
		    try {
			anInt2490++;
			if (arg0 == 27664)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1090_;
		    }
		    return;
		} while (false);
		try {
		    String string = new String(aByteArray2495, 0, anInt2507);
		    Class144.method1983(arg1, (byte) -111, string);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1091_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("sl.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public int method1670(boolean arg0, int arg1) {
	int i;
	try {
	    anInt2529++;
	    byte i_54_ = (byte) arg1;
	    int i_55_ = 0;
	    for (int i_56_ = 0; i_56_ < anInt2507; i_56_++) {
		if ((aByteArray2495[i_56_] ^ 0xffffffff)
		    == (i_54_ ^ 0xffffffff))
		    i_55_++;
	    }
	    if (arg0)
		aByteArray2495 = null;
	    i = i_55_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.F(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public int method1671(int arg0, int arg1) {
	int i;
	try {
	    if (arg0 != 255)
		method1675((byte) 23, null);
	    anInt2480++;
	    boolean bool = false;
	    if ((arg1 ^ 0xffffffff) > -2 || (arg1 ^ 0xffffffff) < -37)
		arg1 = 10;
	    boolean bool_57_ = false;
	    int i_58_ = 0;
	    for (int i_59_ = 0; i_59_ < anInt2507; i_59_++) {
		int i_60_ = aByteArray2495[i_59_] & 0xff;
		if (0 == i_59_) {
		    if ((i_60_ ^ 0xffffffff) == -46) {
			bool = true;
			continue;
		    }
		    if (-44 == (i_60_ ^ 0xffffffff))
			continue;
		}
		if (i_60_ >= 48 && 57 >= i_60_)
		    i_60_ -= 48;
		else if ((i_60_ ^ 0xffffffff) <= -66 && i_60_ <= 90)
		    i_60_ -= 55;
		else if (i_60_ >= 97 && (i_60_ ^ 0xffffffff) >= -123)
		    i_60_ -= 87;
		else
		    throw new NumberFormatException();
		if (arg1 <= i_60_)
		    throw new NumberFormatException();
		if (bool)
		    i_60_ = -i_60_;
		int i_61_ = i_60_ + arg1 * i_58_;
		if (i_58_ != i_61_ / arg1)
		    throw new NumberFormatException();
		bool_57_ = true;
		i_58_ = i_61_;
	    }
	    if (!bool_57_)
		throw new NumberFormatException();
	    i = i_58_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.FA(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public boolean method1672(int arg0, Class124 arg1) {
    while_1092_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2523++;
		    if ((arg1.anInt2507 ^ 0xffffffff)
			>= (anInt2507 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1092_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		if (arg0 < 39)
		    method1694(48, 55);
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((arg1.anInt2507 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		byte i_62_ = arg1.aByteArray2495[i];
		byte i_63_ = aByteArray2495[i];
		if (-66 >= (i_62_ ^ 0xffffffff) && i_62_ <= 90
		    || (63 >= (i_62_ ^ 0xffffffff) && i_62_ <= -34
			&& -41 != i_62_))
		    i_62_ += 32;
		if (65 <= i_63_ && i_63_ <= 90
		    || (63 >= (i_63_ ^ 0xffffffff)
			&& (i_63_ ^ 0xffffffff) >= 33
			&& (i_63_ ^ 0xffffffff) != 40))
		    i_63_ += 32;
		if ((i_63_ ^ 0xffffffff) != (i_62_ ^ 0xffffffff))
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1092_;
		}
	    }
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.DB(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public byte[] method1673(int arg0) {
    while_1093_:
	do {
	    do {
		byte[] is;
		try {
		    anInt2478++;
		    if (anInt2507 != 0)
			break;
		    is = new byte[0];
		} catch (RuntimeException runtimeexception) {
		    break while_1093_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		int i = 3 + anInt2507 & ~0x3;
		int i_64_ = 3 * (i / 4);
		if ((anInt2507 ^ 0xffffffff) >= (-2 + i ^ 0xffffffff)
		    || Class26.method1016(true, aByteArray2495[i - 2]) == -1)
		    i_64_ -= 2;
		else if ((anInt2507 ^ 0xffffffff) >= (-1 + i ^ 0xffffffff)
			 || -1 == Class26.method1016(true,
						     aByteArray2495[-1 + i]))
		    i_64_--;
		if (arg0 < 41)
		    method1708(null, (byte) 88);
		byte[] is_65_ = new byte[i_64_];
		method1706(0, 118, is_65_);
		is = is_65_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.EB(" + arg0 + ')');
    }
    
    public int method1674(Class124 arg0, byte arg1) {
    while_1095_:
	do {
	    int i;
	    int i_66_;
	    int i_67_;
	    int i_68_;
	    int i_69_;
	    int i_70_;
	    int i_71_;
	    int i_72_;
	    try {
		anInt2519++;
		i = 0;
		i_66_ = 0;
		if (arg1 != 92)
		    method1712((byte) 48);
		i_67_ = arg0.anInt2507;
		i_68_ = anInt2507;
		i_69_ = anInt2507;
		i_70_ = arg0.anInt2507;
		i_71_ = 0;
		i_72_ = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	while_1094_:
	    do {
		int i_73_;
		for (;;) {
		    if (i_68_ == 0 || (i_70_ ^ 0xffffffff) == -1)
			break while_1094_;
		    if ((i ^ 0xffffffff) != -157 && (i ^ 0xffffffff) != -231) {
			if (i != 140 && i != 198) {
			    if (-224 != (i ^ 0xffffffff)) {
				i = aByteArray2495[i_71_] & 0xff;
				i_71_++;
			    } else
				i = 115;
			} else
			    i = 69;
		    } else
			i = 101;
		    if (Class14_Sub30.method938(i, 18024))
			i_69_++;
		    else
			i_68_--;
		    if ((i_66_ ^ 0xffffffff) == -157
			|| (i_66_ ^ 0xffffffff) == -231)
			i_66_ = 101;
		    else if ((i_66_ ^ 0xffffffff) == -141 || 198 == i_66_)
			i_66_ = 69;
		    else if ((i_66_ ^ 0xffffffff) != -224) {
			i_66_ = 0xff & arg0.aByteArray2495[i_72_];
			i_72_++;
		    } else
			i_66_ = 115;
		    if (!Class14_Sub30.method938(i_66_, 18024))
			i_70_--;
		    else
			i_67_++;
		    if (Class126.anIntArray2094[i]
			< Class126.anIntArray2094[i_66_])
			return -1;
		    try {
			if (Class126.anIntArray2094[i]
			    > Class126.anIntArray2094[i_66_]) {
			    i_73_ = 1;
			    break;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_1095_;
		    }
		}
		return i_73_;
	    } while (false);
	    do {
		int i_74_;
		try {
		    if (i_67_ <= i_69_)
			break;
		    i_74_ = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_1095_;
		}
		return i_74_;
	    } while (false);
	    do {
		int i_75_;
		try {
		    if ((i_69_ ^ 0xffffffff) >= (i_67_ ^ 0xffffffff))
			break;
		    i_75_ = 1;
		} catch (RuntimeException runtimeexception) {
		    break while_1095_;
		}
		return i_75_;
	    } while (false);
	    int i_76_;
	    try {
		i_76_ = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_76_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.DA("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public Class124 method1675(byte arg0, Class124 arg1) {
	Class124 class124;
	try {
	    anInt2516++;
	    if (!aBoolean2532)
		throw new IllegalArgumentException();
	    anInt2517 = 0;
	    if (aByteArray2495.length < anInt2507 - -arg1.anInt2507) {
		int i;
		for (i = 1; arg1.anInt2507 + anInt2507 > i; i += i) {
		    /* empty */
		}
		byte[] is = new byte[i];
		Class72.method1322(aByteArray2495, 0, is, 0, anInt2507);
		aByteArray2495 = is;
	    }
	    if (arg0 >= -126)
		method1677(-68);
	    Class72.method1322(arg1.aByteArray2495, 0, aByteArray2495,
			       anInt2507, arg1.anInt2507);
	    anInt2507 += arg1.anInt2507;
	    class124 = this;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.T(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class124;
    }
    
    public URL method1676(byte arg0) throws MalformedURLException {
	URL url;
	try {
	    if (arg0 != -52)
		anInt2517 = 75;
	    anInt2487++;
	    url = new URL(new String(aByteArray2495, 0, anInt2507));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.D(" + arg0 + ')');
	}
	return url;
    }
    
    public Class124 method1677(int arg0) {
	Class124 class124;
	try {
	    anInt2471++;
	    Class124 class124_77_ = new Class124();
	    int i = 2;
	    class124_77_.anInt2507 = anInt2507;
	    class124_77_.aByteArray2495 = new byte[anInt2507];
	    for (int i_78_ = arg0; i_78_ < anInt2507; i_78_++) {
		byte i_79_ = aByteArray2495[i_78_];
		if (97 <= i_79_ && i_79_ <= 122
		    || (i_79_ >= -32 && (i_79_ ^ 0xffffffff) >= 1
			&& i_79_ != -9)) {
		    if (-3 == (i ^ 0xffffffff))
			i_79_ -= 32;
		    i = 0;
		} else if (65 <= i_79_ && i_79_ <= 90
			   || (i_79_ >= -64 && 33 <= (i_79_ ^ 0xffffffff)
			       && i_79_ != -41)) {
		    if (-1 == (i ^ 0xffffffff))
			i_79_ += 32;
		    i = 0;
		} else if ((i_79_ ^ 0xffffffff) != -47 && 33 != i_79_
			   && 63 != i_79_) {
		    if ((i_79_ ^ 0xffffffff) != -33)
			i = 1;
		    else if ((i ^ 0xffffffff) != -3)
			i = 1;
		} else
		    i = 2;
		class124_77_.aByteArray2495[i_78_] = i_79_;
	    }
	    class124 = class124_77_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.W(" + arg0 + ')');
	}
	return class124;
    }
    
    public int method1678(int arg0, int arg1, int arg2) {
    while_1096_:
	do {
	    do {
		int i;
		try {
		    anInt2486++;
		    if (arg1 == 27575)
			break;
		    i = 59;
		} catch (RuntimeException runtimeexception) {
		    break while_1096_;
		}
		return i;
	    } while (false);
	    byte i;
	    int i_80_;
	    try {
		i = (byte) arg2;
		i_80_ = arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (anInt2507 > i_80_) {
		if ((i ^ 0xffffffff) == (aByteArray2495[i_80_] ^ 0xffffffff))
		    return i_80_;
		try {
		    i_80_++;
		} catch (RuntimeException runtimeexception) {
		    break while_1096_;
		}
	    }
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.RA(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public boolean method1679(int arg0, int arg1) {
    while_1097_:
	do {
	    boolean bool;
	    boolean bool_81_;
	    int i;
	    int i_82_;
	    try {
		bool = false;
		anInt2467++;
		bool_81_ = false;
		i = 0;
		if ((arg0 ^ 0xffffffff) > -2 || arg0 > 36)
		    arg0 = 10;
		i_82_ = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    for (/**/; i_82_ < anInt2507; i_82_++) {
		int i_83_ = 0xff & aByteArray2495[i_82_];
		if (i_82_ == 0) {
		    if (-46 == (i_83_ ^ 0xffffffff)) {
			bool = true;
			continue;
		    }
		    if (-44 == (i_83_ ^ 0xffffffff))
			continue;
		}
		do {
		    if (-49 >= (i_83_ ^ 0xffffffff) && 57 >= i_83_)
			i_83_ -= 48;
		    else {
			if ((i_83_ ^ 0xffffffff) > -66
			    || -91 > (i_83_ ^ 0xffffffff)) {
			    if (97 > i_83_ || 122 < i_83_)
				return false;
			    try {
				i_83_ -= 87;
				break;
			    } catch (RuntimeException runtimeexception) {
				break while_1097_;
			    }
			}
			i_83_ -= 55;
		    }
		} while (false);
		if ((arg0 ^ 0xffffffff) >= (i_83_ ^ 0xffffffff))
		    return false;
		int i_84_;
		do {
		    boolean bool_85_;
		    try {
			if (bool)
			    i_83_ = -i_83_;
			i_84_ = i * arg0 + i_83_;
			if ((i ^ 0xffffffff) == (i_84_ / arg0 ^ 0xffffffff))
			    break;
			bool_85_ = false;
		    } catch (RuntimeException runtimeexception) {
			break while_1097_;
		    }
		    return bool_85_;
		} while (false);
		try {
		    i = i_84_;
		    bool_81_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1097_;
		}
	    }
	    return bool_81_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "sl.V(" + arg0 + ',' + arg1 + ')');
    }
    
    public long method1680(int arg0) {
	long l;
	try {
	    anInt2489++;
	    long l_86_ = 0L;
	    int i = 0;
	    if (arg0 <= 15)
		method1688(76);
	    for (/**/; i < anInt2507; i++)
		l_86_
		    = (long) (0xff & aByteArray2495[i]) + ((l_86_ << 739388933)
							   + -l_86_);
	    l = l_86_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.S(" + arg0 + ')');
	}
	return l;
    }
    
    public byte[] method1681(int arg0) {
	byte[] is;
	try {
	    anInt2498++;
	    byte[] is_87_ = new byte[anInt2507];
	    int i = 10 / ((arg0 - -53) / 59);
	    Class72.method1322(aByteArray2495, 0, is_87_, 0, anInt2507);
	    is = is_87_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.O(" + arg0 + ')');
	}
	return is;
    }
    
    public static void method1682(int arg0, int arg1) {
	try {
	    anInt2513++;
	    Class14_Sub2_Sub13 class14_sub2_sub13
		= Class14_Sub8_Sub28.method626(-118, arg1, 1);
	    class14_sub2_sub13.method327((byte) 51);
	    if (arg0 != 3163)
		method1667(27, 18, -37, 37, 35, 66, -109, -49, 65, -110, 36);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.Q(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class124 method1683(int arg0) {
	Class124 class124;
	try {
	    anInt2527++;
	    if (arg0 != 115)
		method1683(10);
	    if (!aBoolean2532)
		throw new IllegalArgumentException();
	    anInt2517 = 0;
	    if (anInt2507 != aByteArray2495.length) {
		byte[] is = new byte[anInt2507];
		Class72.method1322(aByteArray2495, 0, is, 0, anInt2507);
		aByteArray2495 = is;
	    }
	    class124 = this;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.OA(" + arg0 + ')');
	}
	return class124;
    }
    
    public Class124 method1684(byte arg0) {
    while_1098_:
	do {
	    int i;
	    do {
		Class124 class124;
		try {
		    anInt2515++;
		    i = 0;
		    if (arg0 == 9)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1098_;
		}
		return class124;
	    } while (false);
	    int i_88_;
	    do {
		Class124 class124;
		try {
		    for (/**/;
			 (i < anInt2507
			  && ((0 <= aByteArray2495[i]
			       && -33 <= (aByteArray2495[i] ^ 0xffffffff))
			      || (aByteArray2495[i] & 0xff) == 160));
			 i++) {
			/* empty */
		    }
		    for (i_88_ = anInt2507;
			 ((i ^ 0xffffffff) > (i_88_ ^ 0xffffffff)
			  && ((-1 >= (aByteArray2495[i_88_ - 1] ^ 0xffffffff)
			       && ((aByteArray2495[i_88_ + -1] ^ 0xffffffff)
				   >= -33))
			      || (0xff & aByteArray2495[i_88_ - 1]
				  ^ 0xffffffff) == -161));
			 i_88_--) {
			/* empty */
		    }
		    if (0 != i || anInt2507 != i_88_)
			break;
		    class124 = this;
		} catch (RuntimeException runtimeexception) {
		    break while_1098_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		Class124 class124_89_ = new Class124();
		class124_89_.anInt2507 = i_88_ - i;
		class124_89_.aByteArray2495 = new byte[class124_89_.anInt2507];
		for (int i_90_ = 0;
		     ((i_90_ ^ 0xffffffff)
		      > (class124_89_.anInt2507 ^ 0xffffffff));
		     i_90_++)
		    class124_89_.aByteArray2495[i_90_]
			= aByteArray2495[i_90_ + i];
		class124 = class124_89_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.VA(" + arg0 + ')');
    }
    
    public Class124 method1685(int arg0) {
	Class124 class124;
	try {
	    Class124 class124_91_ = new Class124();
	    class124_91_.anInt2507 = anInt2507;
	    anInt2533++;
	    class124_91_.aByteArray2495 = new byte[anInt2507];
	    boolean bool = true;
	    for (int i = arg0; i < anInt2507; i++) {
		byte i_92_ = aByteArray2495[i];
		if (i_92_ == 95) {
		    bool = true;
		    class124_91_.aByteArray2495[i] = (byte) 32;
		} else if ((i_92_ ^ 0xffffffff) > -98 || i_92_ > 122
			   || !bool) {
		    bool = false;
		    class124_91_.aByteArray2495[i] = i_92_;
		} else {
		    class124_91_.aByteArray2495[i] = (byte) (-32 + i_92_);
		    bool = false;
		}
	    }
	    class124 = class124_91_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.LA(" + arg0 + ')');
	}
	return class124;
    }
    
    public Class124 method1686(byte arg0, int arg1) {
	Class124 class124;
	try {
	    anInt2503++;
	    if (arg1 <= 0 || -256 > (arg1 ^ 0xffffffff))
		throw new IllegalArgumentException("invalid char:" + arg1);
	    if (!aBoolean2532)
		throw new IllegalArgumentException();
	    anInt2517 = 0;
	    if (anInt2507 == aByteArray2495.length) {
		int i;
		for (i = 1; anInt2507 >= i; i += i) {
		    /* empty */
		}
		byte[] is = new byte[i];
		Class72.method1322(aByteArray2495, 0, is, 0, anInt2507);
		aByteArray2495 = is;
	    }
	    if (arg0 != -5)
		method1677(43);
	    aByteArray2495[anInt2507++] = (byte) arg1;
	    class124 = this;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return class124;
    }
    
    public static void method1687(int arg0, byte arg1) {
    while_1100_:
	do {
	while_1099_:
	    do {
		Class14_Sub25 class14_sub25;
		do {
		    try {
			anInt2499++;
			class14_sub25
			    = ((Class14_Sub25)
			       Class132.aClass55_2167.method1230((long) arg0,
								 (byte) -117));
			if (class14_sub25 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1099_;
		    }
		    return;
		} while (false);
		try {
		    for (int i = 0;
			 ((class14_sub25.anIntArray3178.length ^ 0xffffffff)
			  < (i ^ 0xffffffff));
			 i++) {
			class14_sub25.anIntArray3178[i] = -1;
			class14_sub25.anIntArray3177[i] = 0;
		    }
		    if (arg1 != 88)
			method1714(107, -30, -100, 125, 29);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1100_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("sl.TA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public Class124 method1688(int arg0) {
    while_1101_:
	do {
	    Class124 class124;
	    do {
		Class124 class124_93_;
		try {
		    class124 = Class46.method1174(method1692(0), (byte) 78);
		    anInt2500++;
		    if (arg0 != 15)
			aBoolean2532 = false;
		    if (class124 != null)
			break;
		    class124_93_ = Canvas_Sub1.aClass124_42;
		} catch (RuntimeException runtimeexception) {
		    break while_1101_;
		}
		return class124_93_;
	    } while (false);
	    Class124 class124_94_;
	    try {
		class124_94_ = class124;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124_94_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.P(" + arg0 + ')');
    }
    
    public int method1689(int arg0, int arg1, byte[] arg2, int arg3,
			  int arg4) {
    while_1102_:
	do {
	    do {
		int i;
		try {
		    if (arg3 == -586)
			break;
		    i = -105;
		} catch (RuntimeException runtimeexception) {
		    break while_1102_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		Class72.method1322(aByteArray2495, arg0, arg2, arg1,
				   -arg0 + arg4);
		anInt2511++;
		i = arg4 - arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.JA(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ',' + arg4 + ')'));
    }
    
    public boolean method1690(Class124 arg0, int arg1) {
    while_1103_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2484++;
		    if (anInt2507 >= arg0.anInt2507)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1103_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		if (arg1 != 33)
		    anInt2494 = -82;
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((arg0.anInt2507 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		if (aByteArray2495[i] != arg0.aByteArray2495[i])
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1103_;
		}
	    }
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.WA("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public URL method1691(int arg0, URL arg1) throws MalformedURLException {
	URL url;
	try {
	    if (arg0 != 0)
		method1717(66, null);
	    anInt2470++;
	    url = new URL(arg1, new String(aByteArray2495, 0, anInt2507));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.N(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return url;
    }
    
    public long method1692(int arg0) {
	long l;
	try {
	    anInt2491++;
	    long l_95_ = 0L;
	    for (int i = arg0; i < anInt2507 && -13 < (i ^ 0xffffffff); i++) {
		l_95_ *= 37L;
		int i_96_ = aByteArray2495[i];
		if (i_96_ < 65 || i_96_ > 90) {
		    if ((i_96_ ^ 0xffffffff) > -98 || 122 < i_96_) {
			if (-49 >= (i_96_ ^ 0xffffffff) && i_96_ <= 57)
			    l_95_ += (long) (i_96_ + -21);
		    } else
			l_95_ += (long) (-96 - -i_96_);
		} else
		    l_95_ += (long) (i_96_ + -64);
	    }
	    for (/**/;
		 0L == l_95_ % 37L && -1L != (l_95_ ^ 0xffffffffffffffffL);
		 l_95_ /= 37L) {
		/* empty */
	    }
	    l = l_95_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.QA(" + arg0 + ')');
	}
	return l;
    }
    
    public int method1693(int arg0) {
	int i;
	try {
	    if (arg0 != 0)
		aClass124_2476 = null;
	    anInt2493++;
	    i = anInt2507;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.K(" + arg0 + ')');
	}
	return i;
    }
    
    public Class124 method1694(int arg0, int arg1) {
	Class124 class124;
	try {
	    anInt2505++;
	    if (arg1 <= 0 || (arg1 ^ 0xffffffff) < -256)
		throw new IllegalArgumentException("invalid char");
	    if (arg0 != 24861)
		aClass124_2479 = null;
	    Class124 class124_97_ = new Class124();
	    class124_97_.aByteArray2495 = new byte[anInt2507 + 1];
	    class124_97_.anInt2507 = anInt2507 - -1;
	    Class72.method1322(aByteArray2495, 0, class124_97_.aByteArray2495,
			       0, anInt2507);
	    class124_97_.aByteArray2495[anInt2507] = (byte) arg1;
	    class124 = class124_97_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.M(" + arg0 + ',' + arg1
						+ ')'));
	}
	return class124;
    }
    
    public int method1695(FontMetrics arg0, byte arg1) {
	int i;
	try {
	    String string;
	    try {
		string
		    = new String(aByteArray2495, 0, anInt2507, "ISO-8859-1");
	    } catch (UnsupportedEncodingException unsupportedencodingexception) {
		string = new String(aByteArray2495, 0, anInt2507);
	    }
	    anInt2514++;
	    if (arg1 > -83)
		anInt2494 = -102;
	    i = arg0.stringWidth(string);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.R("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return i;
    }
    
    public Class124 method1696(int arg0, int arg1) {
	Class124 class124;
	try {
	    anInt2468++;
	    if (arg1 != 15)
		aClass124_2479 = null;
	    class124 = method1697(arg0, anInt2507, (byte) -104);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.HB(" + arg0 + ',' + arg1
						+ ')'));
	}
	return class124;
    }
    
    public Class124 method1697(int arg0, int arg1, byte arg2) {
	Class124 class124;
	try {
	    if (arg2 != -104)
		method1685(-2);
	    Class124 class124_98_ = new Class124();
	    class124_98_.aByteArray2495 = new byte[arg1 - arg0];
	    anInt2475++;
	    class124_98_.anInt2507 = arg1 + -arg0;
	    Class72.method1322(aByteArray2495, arg0,
			       class124_98_.aByteArray2495, 0,
			       class124_98_.anInt2507);
	    class124 = class124_98_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return class124;
    }
    
    public int method1698(byte arg0, Class124 arg1) {
    while_1104_:
	do {
	    int i;
	    int i_99_;
	    try {
		if (arg0 <= 48)
		    method1667(-82, 57, 26, -11, 20, -29, 110, -29, 49, 5, 15);
		anInt2501++;
		if (arg1.anInt2507 < anInt2507)
		    i = arg1.anInt2507;
		else
		    i = anInt2507;
		i_99_ = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((i ^ 0xffffffff) < (i_99_ ^ 0xffffffff)) {
		if ((0xff & arg1.aByteArray2495[i_99_])
		    > (0xff & aByteArray2495[i_99_]))
		    return -1;
		do {
		    int i_100_;
		    try {
			if ((0xff & aByteArray2495[i_99_] ^ 0xffffffff)
			    >= (arg1.aByteArray2495[i_99_] & 0xff
				^ 0xffffffff))
			    break;
			i_100_ = 1;
		    } catch (RuntimeException runtimeexception) {
			break while_1104_;
		    }
		    return i_100_;
		} while (false);
		try {
		    i_99_++;
		} catch (RuntimeException runtimeexception) {
		    break while_1104_;
		}
	    }
	    if (arg1.anInt2507 > anInt2507)
		return -1;
	    do {
		int i_101_;
		try {
		    if (anInt2507 <= arg1.anInt2507)
			break;
		    i_101_ = 1;
		} catch (RuntimeException runtimeexception) {
		    break while_1104_;
		}
		return i_101_;
	    } while (false);
	    int i_102_;
	    try {
		i_102_ = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_102_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.U(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method1699(int arg0, byte arg1) {
	try {
	    anInt2517 = 0;
	    anInt2504++;
	    if (!aBoolean2532)
		throw new IllegalArgumentException();
	    if (-1 < (arg0 ^ 0xffffffff))
		throw new IllegalArgumentException();
	    if ((aByteArray2495.length ^ 0xffffffff) > (arg0 ^ 0xffffffff)) {
		int i;
		for (i = 1; i < arg0; i += i) {
		    /* empty */
		}
		byte[] is = new byte[i];
		Class72.method1322(aByteArray2495, 0, is, 0, anInt2507);
		aByteArray2495 = is;
	    }
	    if (arg1 < 29)
		method1674(null, (byte) 76);
	    for (int i = anInt2507; (arg0 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++)
		aByteArray2495[i] = (byte) 32;
	    anInt2507 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.UA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public int method1700(int arg0, Class124 arg1) {
	int i;
	try {
	    if (arg0 != -19928)
		anIntArray2473 = null;
	    anInt2481++;
	    i = method1707(arg1, (byte) 59, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.NA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return i;
    }
    
    public boolean method1701(int arg0) {
    while_1105_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2472++;
		    if (arg0 >= 118)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1105_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = method1679(10, 0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.SA(" + arg0 + ')');
    }
    
    public String toString() {
	try {
	    anInt2526++;
	    throw new RuntimeException();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.toString()");
	}
    }
    
    public int method1702(int arg0) {
	int i;
	try {
	    anInt2525++;
	    if (arg0 <= 41)
		aClass124Array2508 = null;
	    i = method1671(255, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.AB(" + arg0 + ')');
	}
	return i;
    }
    
    public Class124 method1703(Applet arg0, byte arg1) {
    while_1106_:
	do {
	    String string;
	    do {
		Class124 class124;
		try {
		    anInt2524++;
		    String string_103_
			= new String(aByteArray2495, 0, anInt2507);
		    int i = 15 % ((66 - arg1) / 53);
		    string = arg0.getParameter(string_103_);
		    if (string != null)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1106_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class14.method230(string, 0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.BA("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public boolean method1704(Class124 arg0, byte arg1) {
    while_1107_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2521++;
		    if (null != arg0)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1107_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((arg0.anInt2507 ^ 0xffffffff)
			== (anInt2507 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1107_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (aBoolean2532 && arg0.aBoolean2532)
			break;
		    if (-1 == (anInt2517 ^ 0xffffffff)) {
			anInt2517 = method1709(98);
			if (anInt2517 == 0)
			    anInt2517 = 1;
		    }
		    if (0 == arg0.anInt2517) {
			arg0.anInt2517 = arg0.method1709(49);
			if (0 == arg0.anInt2517)
			    arg0.anInt2517 = 1;
		    }
		    if (arg0.anInt2517 == anInt2517)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1107_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (anInt2507 > i) {
		if (aByteArray2495[i] != arg0.aByteArray2495[i])
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1107_;
		}
	    }
	    if (arg1 <= 40)
		aClass124_2497 = null;
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.BB("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public void method1705(byte arg0) {
	try {
	    anInt2520++;
	    String string;
	    try {
		int i = -77 % ((47 - arg0) / 48);
		string
		    = new String(aByteArray2495, 0, anInt2507, "ISO-8859-1");
	    } catch (UnsupportedEncodingException unsupportedencodingexception) {
		string = new String(aByteArray2495, 0, anInt2507);
	    }
	    System.out.println(string);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.IA(" + arg0 + ')');
	}
    }
    
    public int method1706(int arg0, int arg1, byte[] arg2) {
	int i;
	try {
	    anInt2474++;
	    int i_104_ = arg0;
	    for (int i_105_ = 0;
		 (i_105_ ^ 0xffffffff) > (anInt2507 ^ 0xffffffff);
		 i_105_ += 4) {
		int i_106_ = Class26.method1016(true, aByteArray2495[i_105_]);
		int i_107_
		    = ((anInt2507 ^ 0xffffffff) < (1 + i_105_ ^ 0xffffffff)
		       ? Class26.method1016(true, aByteArray2495[1 + i_105_])
		       : -1);
		int i_108_
		    = (2 + i_105_ < anInt2507
		       ? Class26.method1016(true, aByteArray2495[2 + i_105_])
		       : -1);
		int i_109_
		    = ((anInt2507 ^ 0xffffffff) < (i_105_ - -3 ^ 0xffffffff)
		       ? Class26.method1016(true, aByteArray2495[i_105_ + 3])
		       : -1);
		arg2[arg0++]
		    = (byte) Class66.method1294(i_107_ >>> -1656312156,
						i_106_ << -2073869054);
		if (0 == (i_108_ ^ 0xffffffff))
		    break;
		arg2[arg0++]
		    = (byte) Class66.method1294((Class14_Sub8_Sub26
						     .method617(15, i_107_)
						 << 1670025092),
						i_108_ >>> -476543006);
		if (-1 == i_109_)
		    break;
		arg2[arg0++]
		    = (byte) Class66.method1294(i_109_,
						(Class14_Sub8_Sub26.method617
						 (192, i_108_ << 1608289830)));
	    }
	    if (arg1 <= 110)
		method1674(null, (byte) 13);
	    i = -i_104_ + arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.EA(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return i;
    }
    
    public int method1707(Class124 arg0, byte arg1, int arg2) {
    while_1108_:
	do {
	    int[] is;
	    int[] is_110_;
	    int i;
	    try {
		if (arg1 != 59)
		    method1670(false, 7);
		anInt2518++;
		is = new int[256];
		is_110_ = new int[arg0.anInt2507];
		int[] is_111_ = new int[arg0.anInt2507];
		for (int i_112_ = 0; i_112_ < is.length; i_112_++)
		    is[i_112_] = arg0.anInt2507;
		for (int i_113_ = 1;
		     (arg0.anInt2507 ^ 0xffffffff) <= (i_113_ ^ 0xffffffff);
		     i_113_++) {
		    is_110_[i_113_ - 1]
			= -i_113_ + (arg0.anInt2507 << -2042780383);
		    is[Class14_Sub8_Sub26
			   .method617(arg0.aByteArray2495[-1 + i_113_], 255)]
			= -i_113_ + arg0.anInt2507;
		}
		int i_114_ = arg0.anInt2507 - -1;
		int i_115_ = arg0.anInt2507;
		while (0 < i_115_) {
		    is_111_[i_115_ + -1] = i_114_;
		    for (/**/;
			 (arg0.anInt2507 >= i_114_
			  && (arg0.aByteArray2495[i_114_ - 1]
			      != arg0.aByteArray2495[i_115_ + -1]));
			 i_114_ = is_111_[-1 + i_114_]) {
			if (arg0.anInt2507 + -i_115_ <= is_110_[i_114_ - 1])
			    is_110_[i_114_ + -1] = -i_115_ + arg0.anInt2507;
		    }
		    i_115_--;
		    i_114_--;
		}
		i_115_ = i_114_;
		int i_116_ = 1;
		int i_117_ = 0;
		i_114_ = 1 + arg0.anInt2507 + -i_115_;
		for (i = 1; i <= i_114_; i++) {
		    is_111_[i - 1] = i_117_;
		    for (/**/;
			 ((i_117_ ^ 0xffffffff) <= -2
			  && (arg0.aByteArray2495[i_117_ + -1]
			      != arg0.aByteArray2495[i + -1]));
			 i_117_ = is_111_[-1 + i_117_]) {
			/* empty */
		    }
		    i_117_++;
		}
		while (i_115_ < arg0.anInt2507) {
		    for (i = i_116_; i_115_ >= i; i++) {
			if (is_110_[i + -1] >= arg0.anInt2507 + (i_115_ + -i))
			    is_110_[i - 1] = i_115_ + (arg0.anInt2507 + -i);
		    }
		    i_116_ = i_115_ + 1;
		    i_115_ = -is_111_[-1 + i_114_] + i_115_ - -i_114_;
		    i_114_ = is_111_[-1 + i_114_];
		}
		i = arg0.anInt2507 + arg2 + -1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((i ^ 0xffffffff) > (anInt2507 ^ 0xffffffff)) {
		int i_118_;
		for (i_118_ = arg0.anInt2507 + -1;
		     (i_118_ >= 0
		      && ((aByteArray2495[i] ^ 0xffffffff)
			  == (arg0.aByteArray2495[i_118_] ^ 0xffffffff)));
		     i_118_--)
		    i--;
		if ((i_118_ ^ 0xffffffff) == 0)
		    return i + 1;
		try {
		    i += Math.max(is[aByteArray2495[i] & 0xff],
				  is_110_[i_118_]);
		} catch (RuntimeException runtimeexception) {
		    break while_1108_;
		}
	    }
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.I("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public boolean method1708(Class124 arg0, byte arg1) {
    while_1109_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2485++;
		    if (anInt2507 >= arg0.anInt2507)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1109_;
		}
		return bool;
	    } while (false);
	    int i;
	    int i_119_;
	    try {
		i = anInt2507 - arg0.anInt2507;
		i_119_ = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (arg0.anInt2507 > i_119_) {
		if ((aByteArray2495[i + i_119_] ^ 0xffffffff)
		    != (arg0.aByteArray2495[i_119_] ^ 0xffffffff))
		    return false;
		try {
		    i_119_++;
		} catch (RuntimeException runtimeexception) {
		    break while_1109_;
		}
	    }
	    if (arg1 >= -66)
		anInt2517 = 115;
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.CA("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public int method1709(int arg0) {
    while_1110_:
	do {
	    int i;
	    do {
		int i_120_;
		try {
		    anInt2510++;
		    i = 0;
		    if (arg0 > 48)
			break;
		    i_120_ = -78;
		} catch (RuntimeException runtimeexception) {
		    break while_1110_;
		}
		return i_120_;
	    } while (false);
	    int i_121_;
	    try {
		for (int i_122_ = 0; i_122_ < anInt2507; i_122_++)
		    i = (i << -443612347) + -i - -(0xff
						   & aByteArray2495[i_122_]);
		i_121_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_121_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.KA(" + arg0 + ')');
    }
    
    public int method1710(int arg0, int arg1) {
	int i;
	try {
	    if (arg0 != 0)
		method1690(null, -80);
	    anInt2509++;
	    i = aByteArray2495[arg1] & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.CB(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public int method1711(int arg0, byte arg1) {
	int i;
	try {
	    if (arg1 != 89)
		aClass124_2476 = null;
	    anInt2469++;
	    i = method1678(0, 27575, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.GA(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public Class124 method1712(byte arg0) {
    while_1113_:
	do {
	while_1112_:
	    do {
		Class var_class;
		synchronized(aClass2534 == null
					     ? (aClass2534
						= method1720("Class124"))
					     : aClass2534) {
	    while_1111_:
		do {
		    long l;
		    do {
			Class14_Sub30 class14_sub30;
			try {
			    if (arg0 <= 68)
				method1706(52, 61, null);
			    l = method1680(105);
			    anInt2528++;
			    try {
				if (null == Class14_Sub2.aClass55_2733) {
				    Class14_Sub2.aClass55_2733
					= new Class55(4096);
				    break;
				}
				class14_sub30
				    = ((Class14_Sub30)
				       Class14_Sub2.aClass55_2733
					   .method1230(l, (byte) -109));
			    } catch (Throwable throwable) {
				break while_1111_;
			    }
			} catch (RuntimeException runtimeexception) {
			    break while_1113_;
			}
			while (null != class14_sub30) {
			    if (method1704(class14_sub30.aClass124_3270,
					   (byte) 56)) {
				Class124 class124
				    = class14_sub30.aClass124_3270;
				return class124;
			    }
			    try {
				try {
				    class14_sub30
					= (Class14_Sub30) Class14_Sub2
							      .aClass55_2733
							      .method1231(-1);
				} catch (Throwable throwable) {
				    break while_1111_;
				}
			    } catch (RuntimeException runtimeexception) {
				break while_1113_;
			    }
			}
		    } while (false);
		    Class14_Sub30 class14_sub30 = new Class14_Sub30();
		    aBoolean2532 = false;
		    class14_sub30.aClass124_3270 = this;
		    Class14_Sub2.aClass55_2733.method1224(8, l, class14_sub30);
		    break while_1112_;
		} while (false);
		RuntimeException object = new RuntimeException();
		throw object;
		}
	    } while (false);
	    return this;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "sl.L(" + arg0 + ')');
    }
    
    public boolean equals(Object arg0) {
    while_1114_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2482++;
		    if (!(arg0 instanceof Class124))
			break;
		    bool = method1704((Class124) arg0, (byte) 95);
		} catch (RuntimeException runtimeexception) {
		    break while_1114_;
		}
		return bool;
	    } while (false);
	    try {
		throw new IllegalArgumentException();
	    } catch (RuntimeException runtimeexception) {
		/* empty */
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.equals("
					    + (arg0 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method1713(boolean arg0, int arg1, int arg2, Graphics arg3) {
	try {
	    if (arg0)
		aByteArray2495 = null;
	    anInt2522++;
	    String string;
	    try {
		string
		    = new String(aByteArray2495, 0, anInt2507, "ISO-8859-1");
	    } catch (UnsupportedEncodingException unsupportedencodingexception) {
		string = new String(aByteArray2495, 0, anInt2507);
	    }
	    arg3.drawString(string, arg1, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sl.GB(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static boolean method1714(int arg0, int arg1, int arg2, int arg3,
				     int arg4) {
	int i = arg3 * Class14_Sub1.anInt2719 + arg0 * Class37.anInt643 >> 16;
	int i_123_
	    = arg3 * Class37.anInt643 - arg0 * Class14_Sub1.anInt2719 >> 16;
	int i_124_
	    = (arg1 * Class150.anInt2420 + i_123_ * Class7_Sub3_Sub1.anInt3718
	       >> 16);
	int i_125_
	    = (arg1 * Class7_Sub3_Sub1.anInt3718 - i_123_ * Class150.anInt2420
	       >> 16);
	if (i_124_ < 1)
	    i_124_ = 1;
	int i_126_ = (i << 9) / i_124_;
	int i_127_ = (i_125_ << 9) / i_124_;
	int i_128_
	    = (arg2 * Class150.anInt2420 + i_123_ * Class7_Sub3_Sub1.anInt3718
	       >> 16);
	int i_129_
	    = (arg2 * Class7_Sub3_Sub1.anInt3718 - i_123_ * Class150.anInt2420
	       >> 16);
	if (i_128_ < 1)
	    i_128_ = 1;
	int i_130_ = (i << 9) / i_128_;
	int i_131_ = (i_129_ << 9) / i_128_;
	if (i_124_ < 50 && i_128_ < 50)
	    return false;
	if (i_124_ > arg4 && i_128_ > arg4)
	    return false;
	if (i_126_ < Class20.anInt425 && i_130_ < Class20.anInt425)
	    return false;
	if (i_126_ > Class14_Sub8_Sub27.anInt4547
	    && i_130_ > Class14_Sub8_Sub27.anInt4547)
	    return false;
	if (i_127_ < Class58.anInt948 && i_131_ < Class58.anInt948)
	    return false;
	if (i_127_ > Class70.anInt1081 && i_131_ > Class70.anInt1081)
	    return false;
	return true;
    }
    
    public static void method1715(byte arg0) {
	try {
	    aClass124_2479 = null;
	    aClass124_2497 = null;
	    if (arg0 != -83)
		aClass124_2479 = null;
	    aClass124Array2508 = null;
	    anIntArray2473 = null;
	    aClass124_2476 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.IB(" + arg0 + ')');
	}
    }
    
    public Class124 method1716(byte arg0) {
	Class124 class124;
	try {
	    if (arg0 != 63)
		method1711(32, (byte) 59);
	    Class124 class124_132_ = new Class124();
	    anInt2512++;
	    class124_132_.anInt2507 = anInt2507;
	    class124_132_.aByteArray2495 = new byte[anInt2507];
	    for (int i = 0; anInt2507 > i; i++) {
		byte i_133_ = aByteArray2495[i];
		if (((i_133_ ^ 0xffffffff) <= -66
		     && (i_133_ ^ 0xffffffff) >= -91)
		    || (i_133_ >= -64 && (i_133_ ^ 0xffffffff) >= 33
			&& -41 != i_133_))
		    i_133_ += 32;
		class124_132_.aByteArray2495[i] = i_133_;
	    }
	    class124 = class124_132_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sl.MA(" + arg0 + ')');
	}
	return class124;
    }
    
    public boolean method1717(int arg0, Class124 arg1) {
    while_1115_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 != 40)
			anInt2507 = -24;
		    anInt2496++;
		    if (arg1 != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1115_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((anInt2507 ^ 0xffffffff)
			== (arg1.anInt2507 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1115_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (anInt2507 > i) {
		byte i_134_ = arg1.aByteArray2495[i];
		byte i_135_ = aByteArray2495[i];
		if (-66 >= (i_135_ ^ 0xffffffff) && -91 <= (i_135_
							    ^ 0xffffffff)
		    || (i_135_ >= -64 && 33 <= (i_135_ ^ 0xffffffff)
			&& i_135_ != -41))
		    i_135_ += 32;
		if ((i_134_ ^ 0xffffffff) <= -66 && i_134_ <= 90
		    || (63 >= (i_134_ ^ 0xffffffff) && -34 >= i_134_
			&& 40 != (i_134_ ^ 0xffffffff)))
		    i_134_ += 32;
		if ((i_135_ ^ 0xffffffff) != (i_134_ ^ 0xffffffff))
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1115_;
		}
	    }
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sl.H(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method1718(int arg0) {
    while_1117_:
	do {
	while_1116_:
	    do {
		do {
		    try {
			anInt2477++;
			Class127.aClass52_2112.method1209((byte) -96);
			if (arg0 == 48)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1116_;
		    }
		    return;
		} while (false);
		try {
		    Class112.aClass52_1868.method1209((byte) -96);
		    Class62.aClass52_991.method1209((byte) -96);
		    Class49.aClass52_810.method1209((byte) -96);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1117_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "sl.J(" + arg0 + ')');
	} while (false);
    }
    
    public Class124[] method1719(int arg0, int arg1) {
    while_1118_:
	do {
	    int i;
	    Class124[] class124s;
	    do {
		Class124[] class124s_136_;
		try {
		    anInt2531++;
		    i = 0;
		    for (int i_137_ = 0;
			 (i_137_ ^ 0xffffffff) > (anInt2507 ^ 0xffffffff);
			 i_137_++) {
			if ((aByteArray2495[i_137_] ^ 0xffffffff)
			    == (arg0 ^ 0xffffffff))
			    i++;
		    }
		    class124s = new Class124[1 + i];
		    if (0 != i)
			break;
		    class124s[0] = this;
		    class124s_136_ = class124s;
		} catch (RuntimeException runtimeexception) {
		    break while_1118_;
		}
		return class124s_136_;
	    } while (false);
	    Class124[] class124s_138_;
	    try {
		int i_139_ = 0;
		int i_140_ = 0;
		int i_141_ = 0;
		int i_142_ = -31 % ((44 - arg1) / 58);
		for (/**/; i > i_141_; i_141_++) {
		    int i_143_;
		    for (i_143_ = 0;
			 ((aByteArray2495[i_143_ + i_140_] ^ 0xffffffff)
			  != (arg0 ^ 0xffffffff));
			 i_143_++) {
			/* empty */
		    }
		    class124s[i_139_++]
			= method1697(i_140_, i_140_ + i_143_, (byte) -104);
		    i_140_ += i_143_ - -1;
		}
		class124s[i] = method1697(i_140_, anInt2507, (byte) -104);
		class124s_138_ = class124s;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124s_138_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "sl.HA(" + arg0 + ',' + arg1 + ')');
    }
    
    /*synthetic*/ public static Class method1720(String arg0) {
	Class var_class;
	try {
	    var_class = Class.forName(arg0);
	} catch (ClassNotFoundException classnotfoundexception) {
	    return null;
	}
	return var_class;
    }
    
    static {
	aClass124_2476 = aClass124_2479;
	anInt2494 = 0;
	aClass124_2497 = aClass124_2479;
	aClass124Array2508 = new Class124[100];
    }
}
