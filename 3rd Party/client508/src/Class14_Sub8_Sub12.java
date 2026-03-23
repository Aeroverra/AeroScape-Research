/* Class14_Sub8_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub12 extends Class14_Sub8
{
    public boolean aBoolean4277 = true;
    public static int anInt4278;
    public static int anInt4279;
    public static int anInt4280 = 0;
    public static int anInt4281;
    public int anInt4282 = 4;
    public static int anInt4283;
    public byte[] aByteArray4284 = new byte[512];
    public static int anInt4285;
    public static int anInt4286;
    public static byte aByte4287 = 0;
    public short[] aShortArray4288;
    public int anInt4289;
    public static int anInt4290;
    public int anInt4291 = 4;
    public static int anInt4292;
    public static int anInt4293;
    public static int anInt4294;
    public static int anInt4295;
    public static int anInt4296;
    public int anInt4297;
    public short[] aShortArray4298;
    public static int anInt4299;
    public int anInt4300;
    public static int anInt4301;
    
    public static void method536(boolean arg0) {
    while_357_:
	do {
	while_356_:
	    do {
		do {
		    try {
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_356_;
		    }
		    return;
		} while (false);
		try {
		    Class69.method1311((byte) 112);
		    anInt4296++;
		    System.gc();
		    Class126.method1743(27252, 25);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_357_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hk.L(" + arg0 + ')');
	} while (false);
    }
    
    public int method537(int arg0, int arg1, int arg2, boolean arg3, int arg4,
			 int arg5, int arg6) {
	int i;
	try {
	    anInt4286++;
	    int i_0_ = -4096 + arg1;
	    int i_1_ = arg2 >> -652348148;
	    int i_2_ = i_1_ - -1;
	    arg2 &= 0xfff;
	    if (arg5 <= i_2_)
		i_2_ = 0;
	    i_2_ &= 0xff;
	    int i_3_ = arg2 + -4096;
	    int i_4_ = Class24.anIntArray468[arg2];
	    i_1_ &= 0xff;
	    int i_5_ = aByteArray4284[i_1_ + arg6] & 0x3;
	    int i_6_;
	    if (1 < i_5_)
		i_6_ = 2 != i_5_ ? -arg2 + -arg1 : arg2 + -arg1;
	    else
		i_6_ = (i_5_ ^ 0xffffffff) == -1 ? arg2 - -arg1 : -arg2 + arg1;
	    if (arg3 != true)
		anInt4291 = -71;
	    i_5_ = 0x3 & aByteArray4284[arg6 + i_2_];
	    int i_7_;
	    if ((i_5_ ^ 0xffffffff) < -2)
		i_7_ = 2 != i_5_ ? -i_3_ + -arg1 : i_3_ - arg1;
	    else
		i_7_ = (i_5_ ^ 0xffffffff) == -1 ? i_3_ - -arg1 : arg1 - i_3_;
	    i_5_ = aByteArray4284[arg0 + i_1_] & 0x3;
	    int i_8_ = ((i_7_ - i_6_) * i_4_ >> -44682996) + i_6_;
	    if (1 < i_5_)
		i_6_ = i_5_ != 2 ? -i_0_ + -arg2 : -i_0_ + arg2;
	    else
		i_6_ = i_5_ != 0 ? -arg2 + i_0_ : i_0_ + arg2;
	    i_5_ = aByteArray4284[arg0 + i_2_] & 0x3;
	    if (1 >= i_5_)
		i_7_ = -1 != (i_5_ ^ 0xffffffff) ? i_0_ + -i_3_ : i_0_ + i_3_;
	    else
		i_7_ = 2 == i_5_ ? i_3_ + -i_0_ : -i_0_ + -i_3_;
	    int i_9_ = i_6_ + (i_4_ * (i_7_ - i_6_) >> 912937004);
	    i = i_8_ + ((-i_8_ + i_9_) * arg4 >> -1706998548);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
	return i;
    }
    
    public Class14_Sub8_Sub12() {
	super(0, true);
	anInt4289 = 4;
	anInt4297 = 1638;
	anInt4300 = 0;
    }
    
    public void method472(int arg0) {
	try {
	    anInt4299++;
	    aByteArray4284
		= Class14_Sub8_Sub10.method527(anInt4300, (byte) -97);
	    method540(arg0 + 125);
	    if (arg0 != 0)
		anInt4300 = 125;
	    for (int i = anInt4289 + -1; (i ^ 0xffffffff) <= -2; i--) {
		short i_10_ = aShortArray4288[i];
		if (i_10_ > 8 || (i_10_ ^ 0xffffffff) > 7)
		    break;
		anInt4289--;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hk.I(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_362_:
	    do {
	    while_361_:
		do {
		while_360_:
		    do {
		    while_359_:
			do {
			while_358_:
			    do {
				do {
				    if (i != 0) {
					if (1 != i) {
					    if (i != 2) {
						if ((i ^ 0xffffffff) != -4) {
						    if (4 != i) {
							if (-6
							    != (i
								^ 0xffffffff)) {
							    if ((i
								 ^ 0xffffffff)
								== -7)
								break while_361_;
							    break while_362_;
							}
						    } else
							break while_359_;
						    break while_360_;
						}
					    } else
						break;
					    break while_358_;
					}
				    } else {
					aBoolean4277
					    = arg2.method798(-79) == 1;
					break while_362_;
				    }
				    anInt4289 = arg2.method798(arg1 ^ 0x60b2);
				    break while_362_;
				} while (false);
				anInt4297 = arg2.method805(0);
				if (anInt4297 < 0) {
				    aShortArray4288 = new short[anInt4289];
				    for (i = 0; ((anInt4289 ^ 0xffffffff)
						 < (i ^ 0xffffffff)); i++)
					aShortArray4288[i]
					    = (short) arg2.method805(arg1
								     + -24777);
				}
				break while_362_;
			    } while (false);
			    anInt4282 = anInt4291
				= arg2.method798(arg1 ^ 0x60b3);
			    break while_362_;
			} while (false);
			anInt4300 = arg2.method798(88);
			break while_362_;
		    } while (false);
		    anInt4282 = arg2.method798(61);
		    break while_362_;
		} while (false);
		anInt4291 = arg2.method798(arg1 + -24670);
	    } while (false);
	    anInt4281++;
	    if (arg1 != 24777)
		anInt4291 = 41;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method538(byte arg0) {
	try {
	    if (arg0 > -120)
		anInt4295 = -101;
	    Class150.aClass52_2406.method1203((byte) -71);
	    anInt4292++;
	    Class14_Sub8_Sub30.aClass52_4588.method1203((byte) -40);
	    Class83.aClass52_1339.method1203((byte) -68);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hk.J(" + arg0 + ')');
	}
    }
    
    public static void method539(int arg0, Class94[] arg1, int arg2) {
	try {
	    anInt4294++;
	    if (arg0 != -2081454068)
		method541(-15, -103);
	    int i = 0;
	    for (/**/; (i ^ 0xffffffff) > (arg1.length ^ 0xffffffff); i++) {
		Class94 class94 = arg1[i];
		if (class94 != null) {
		    if (-1 == (class94.anInt1489 ^ 0xffffffff)) {
			if (class94.aClass94Array1486 != null)
			    method539(-2081454068, class94.aClass94Array1486,
				      arg2);
			Class14_Sub15 class14_sub15
			    = ((Class14_Sub15)
			       (Class14_Sub30.aClass55_3275.method1230
				((long) class94.anInt1548, (byte) -117)));
			if (class14_sub15 != null)
			    Class74.method1333(class14_sub15.anInt2999,
					       (byte) 46, arg2);
		    }
		    if (0 == arg2 && class94.anObjectArray1526 != null) {
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.aClass94_3116 = class94;
			class14_sub21.anObjectArray3115
			    = class94.anObjectArray1526;
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		    }
		    if ((arg2 ^ 0xffffffff) == -2
			&& null != class94.anObjectArray1473) {
			if (-1 >= (class94.anInt1478 ^ 0xffffffff)) {
			    Class94 class94_11_
				= Class55.method1233(class94.anInt1548, 21803);
			    if (class94_11_ == null
				|| class94_11_.aClass94Array1486 == null
				|| ((class94_11_.aClass94Array1486.length
				     ^ 0xffffffff)
				    >= (class94.anInt1478 ^ 0xffffffff))
				|| (class94_11_.aClass94Array1486
				    [class94.anInt1478]) != class94)
				continue;
			}
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.aClass94_3116 = class94;
			class14_sub21.anObjectArray3115
			    = class94.anObjectArray1473;
			Class133_Sub3.method1830(class14_sub21,
						 arg0 ^ 0x9c5294b);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method540(int arg0) {
	try {
	    anInt4278++;
	    if (arg0 <= 117)
		aByteArray4284 = null;
	    if (0 < anInt4297) {
		aShortArray4298 = new short[anInt4289];
		aShortArray4288 = new short[anInt4289];
		for (int i = 0; i < anInt4289; i++) {
		    aShortArray4288[i]
			= (short) (int) (4096.0
					 * Math.pow((double) ((float) anInt4297
							      / 4096.0F),
						    (double) i));
		    aShortArray4298[i]
			= (short) (int) Math.pow(2.0, (double) i);
		}
	    } else if (null != aShortArray4288
		       && (anInt4289 ^ 0xffffffff) == (aShortArray4288.length
						       ^ 0xffffffff)) {
		aShortArray4298 = new short[anInt4289];
		for (int i = 0; i < anInt4289; i++)
		    aShortArray4298[i]
			= (short) (int) Math.pow(2.0, (double) i);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hk.B(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub11 method541(int arg0, int arg1) {
    while_363_:
	do {
	    do {
		Class14_Sub2_Sub11 class14_sub2_sub11;
		try {
		    anInt4290++;
		    Class14_Sub2_Sub11 class14_sub2_sub11_12_
			= ((Class14_Sub2_Sub11)
			   Class7_Sub3.aClass20_2680.method974((long) arg0,
							       arg1 + -20083));
		    if (null == class14_sub2_sub11_12_)
			break;
		    class14_sub2_sub11 = class14_sub2_sub11_12_;
		} catch (RuntimeException runtimeexception) {
		    break while_363_;
		}
		return class14_sub2_sub11;
	    } while (false);
	    byte[] is;
	    do {
		Class14_Sub2_Sub11 class14_sub2_sub11;
		try {
		    if (-32769 >= (arg0 ^ 0xffffffff))
			is = Class62.aClass9_993.method163(arg0 & 0x7fff, 0,
							   0);
		    else
			is = Class54.aClass9_885.method163(arg0, 0, 0);
		    if (arg1 == 20083)
			break;
		    class14_sub2_sub11 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_363_;
		}
		return class14_sub2_sub11;
	    } while (false);
	    Class14_Sub2_Sub11 class14_sub2_sub11;
	    try {
		Class14_Sub2_Sub11 class14_sub2_sub11_13_
		    = new Class14_Sub2_Sub11();
		if (null != is)
		    class14_sub2_sub11_13_.method315((byte) -120,
						     new Class14_Sub10(is));
		if (-32769 >= (arg0 ^ 0xffffffff))
		    class14_sub2_sub11_13_.method310(18859);
		Class7_Sub3.aClass20_2680.method971(arg1 ^ ~0x4e73,
						    class14_sub2_sub11_13_,
						    (long) arg0);
		class14_sub2_sub11 = class14_sub2_sub11_13_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub11;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "hk.K(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method542(int arg0, int arg1, int[] arg2) {
	try {
	    int i = Class133_Sub5.anIntArray3623[arg1] * anInt4291;
	    anInt4285++;
	    if (arg0 != (anInt4289 ^ 0xffffffff)) {
		int i_14_ = aShortArray4288[0];
		if (-9 > (i_14_ ^ 0xffffffff) || i_14_ < -8) {
		    int i_15_ = aShortArray4298[0] << -2081454068;
		    int i_16_ = i_15_ * anInt4291 >> -518613140;
		    int i_17_ = i_15_ * i >> 297604396;
		    int i_18_ = i_17_ >> 796715852;
		    int i_19_ = 1 + i_18_;
		    i_17_ &= 0xfff;
		    int i_20_ = Class24.anIntArray468[i_17_];
		    int i_21_ = aByteArray4284[i_18_ & 0xff] & 0xff;
		    if (i_16_ <= i_19_)
			i_19_ = 0;
		    int i_22_ = i_15_ * anInt4282 >> -148630388;
		    int i_23_ = aByteArray4284[0xff & i_19_] & 0xff;
		    for (int i_24_ = 0; i_24_ < Class112.anInt1876; i_24_++) {
			int i_25_ = (Class14_Sub8_Sub4.anIntArray4145[i_24_]
				     * anInt4282);
			int i_26_ = method537(i_23_, i_17_,
					      i_25_ * i_15_ >> -1526198676,
					      true, i_20_, i_22_, i_21_);
			arg2[i_24_] = i_26_ * i_14_ >> 7449836;
		    }
		}
		for (int i_27_ = 1;
		     (i_27_ ^ 0xffffffff) > (anInt4289 ^ 0xffffffff);
		     i_27_++) {
		    i_14_ = aShortArray4288[i_27_];
		    if ((i_14_ ^ 0xffffffff) < -9 || i_14_ < -8) {
			int i_28_ = aShortArray4298[i_27_] << 466639980;
			int i_29_ = i_28_ * i >> 378905100;
			int i_30_ = i_29_ >> -1674604788;
			i_29_ &= 0xfff;
			int i_31_ = aByteArray4284[0xff & i_30_] & 0xff;
			int i_32_ = i_28_ * anInt4282 >> -1450856532;
			int i_33_ = Class24.anIntArray468[i_29_];
			int i_34_ = 1 + i_30_;
			int i_35_ = i_28_ * anInt4291 >> 1017779500;
			if ((i_35_ ^ 0xffffffff) >= (i_34_ ^ 0xffffffff))
			    i_34_ = 0;
			int i_36_ = aByteArray4284[i_34_ & 0xff] & 0xff;
			if (aBoolean4277 && ((-1 + anInt4289 ^ 0xffffffff)
					     == (i_27_ ^ 0xffffffff))) {
			    for (int i_37_ = 0;
				 ((Class112.anInt1876 ^ 0xffffffff)
				  < (i_37_ ^ 0xffffffff));
				 i_37_++) {
				int i_38_
				    = anInt4282 * (Class14_Sub8_Sub4
						   .anIntArray4145[i_37_]);
				int i_39_
				    = method537(i_36_, i_29_,
						i_28_ * i_38_ >> -83532756,
						true, i_33_, i_32_, i_31_);
				i_39_ = ((i_39_ * i_14_ >> -514139348)
					 + arg2[i_37_]);
				arg2[i_37_] = 2048 - -(i_39_ >> 1984476641);
			    }
			} else {
			    for (int i_40_ = 0;
				 ((Class112.anInt1876 ^ 0xffffffff)
				  < (i_40_ ^ 0xffffffff));
				 i_40_++) {
				int i_41_
				    = (Class14_Sub8_Sub4.anIntArray4145[i_40_]
				       * anInt4282);
				int i_42_
				    = method537(i_36_, i_29_,
						i_41_ * i_28_ >> 1826333612,
						true, i_33_, i_32_, i_31_);
				arg2[i_40_] += i_42_ * i_14_ >> -197342068;
			    }
			}
		    }
		}
	    } else {
		int i_43_ = aShortArray4298[0] << 1680330220;
		int i_44_ = i_43_ * anInt4282 >> -320291924;
		int i_45_ = i_43_ * i >> 271049196;
		int i_46_ = anInt4291 * i_43_ >> 170976780;
		int i_47_ = aShortArray4288[0];
		int i_48_ = i_45_ >> -915715028;
		int i_49_ = aByteArray4284[0xff & i_48_] & 0xff;
		int i_50_ = 1 + i_48_;
		i_45_ &= 0xfff;
		if ((i_46_ ^ 0xffffffff) >= (i_50_ ^ 0xffffffff))
		    i_50_ = 0;
		int i_51_ = aByteArray4284[i_50_ & 0xff] & 0xff;
		int i_52_ = Class24.anIntArray468[i_45_];
		if (aBoolean4277) {
		    for (int i_53_ = 0; ((Class112.anInt1876 ^ 0xffffffff)
					 < (i_53_ ^ 0xffffffff)); i_53_++) {
			int i_54_ = (Class14_Sub8_Sub4.anIntArray4145[i_53_]
				     * anInt4282);
			int i_55_ = method537(i_51_, i_45_,
					      i_54_ * i_43_ >> -1560245812,
					      true, i_52_, i_44_, i_49_);
			i_55_ = i_55_ * i_47_ >> 1164430380;
			arg2[i_53_] = (i_55_ >> -439320255) + 2048;
		    }
		} else {
		    for (int i_56_ = 0; i_56_ < Class112.anInt1876; i_56_++) {
			int i_57_ = (Class14_Sub8_Sub4.anIntArray4145[i_56_]
				     * anInt4282);
			int i_58_ = method537(i_51_, i_45_,
					      i_57_ * i_43_ >> 1917490732,
					      true, i_52_, i_44_, i_49_);
			arg2[i_56_] = i_47_ * i_58_ >> 69322092;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.D(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    if (arg1 >= -58)
		anInt4289 = -91;
	    anInt4283++;
	    int[] is_59_ = aClass149_2851.method2014(arg0, (byte) 122);
	    if (aClass149_2851.aBoolean2402)
		method542(-2, arg0, is_59_);
	    is = is_59_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method543(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt4293++;
	    int i = -16 / ((32 - arg5) / 43);
	    int i_60_ = arg1 - 334;
	    if (-1 < (i_60_ ^ 0xffffffff))
		i_60_ = 0;
	    else if (100 < i_60_)
		i_60_ = 100;
	    int i_61_ = (i_60_ * (-Class125_Sub1.aShort3372
				  + Class28.aShort511) / 100
			 + Class125_Sub1.aShort3372);
	    arg6 = arg6 * i_61_ >> 48267560;
	    i = 0x7ff & 2048 - arg2;
	    i_60_ = 0x7ff & 2048 + -arg3;
	    int i_62_ = arg6;
	    int i_63_ = 0;
	    if (-1 != (i ^ 0xffffffff)) {
		int i_64_ = Class3.anIntArray111[i];
		int i_65_ = Class3.anIntArray108[i];
		i_63_ = i_65_ * -i_62_ >> 102807312;
		i_62_ = i_64_ * i_62_ >> -930920240;
	    }
	    i_61_ = 0;
	    if ((i_60_ ^ 0xffffffff) != -1) {
		int i_66_ = Class3.anIntArray111[i_60_];
		int i_67_ = Class3.anIntArray108[i_60_];
		i_61_ = i_62_ * i_67_ >> 359590192;
		i_62_ = i_66_ * i_62_ >> 905982800;
	    }
	    Class69.anInt1072 = arg3;
	    Class14_Sub30.anInt3271 = -i_62_ + arg4;
	    Class14_Sub8_Sub38.anInt4741 = arg7 - i_61_;
	    Class7_Sub3_Sub1.anInt3719 = arg2;
	    Class14_Sub10.anInt2926 = arg0 - i_63_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hk.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
    }
}
