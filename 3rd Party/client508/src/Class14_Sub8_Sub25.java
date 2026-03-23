/* Class14_Sub8_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub25 extends Class14_Sub8
{
    public static int anInt4505;
    public int anInt4506;
    public int anInt4507 = 1;
    public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_4508;
    public static int anInt4509;
    public static Class124 aClass124_4510;
    public static Class124 aClass124_4511;
    public static int[] anIntArray4512 = new int[1000];
    public static int anInt4513;
    public static int anInt4514;
    public static int anInt4515;
    public static int anInt4516;
    public static int anInt4517;
    public static boolean aBoolean4518;
    public static int anInt4519;
    public static int anInt4520;
    
    public static void method613(Class133_Sub1 arg0, int arg1) {
    while_439_:
	do {
	while_438_:
	    do {
		do {
		    try {
			if (arg0.anInt3455 == Class14_Sub2_Sub20.anInt4064
			    || -1 == arg0.anInt3445
			    || (arg0.anInt3467 ^ 0xffffffff) != -1
			    || ((arg0.anInt3458 - -1 ^ 0xffffffff)
				< ((Class41.method1129(arg0.anInt3445, 45)
				    .anIntArray763[arg0.anInt3501])
				   ^ 0xffffffff))) {
			    int i = (Class14_Sub2_Sub20.anInt4064
				     - arg0.anInt3494);
			    int i_0_
				= 64 * arg0.anInt3493 + 128 * arg0.anInt3451;
			    int i_1_
				= 64 * arg0.anInt3493 + arg0.anInt3472 * 128;
			    int i_2_ = -arg0.anInt3494 + arg0.anInt3455;
			    int i_3_
				= arg0.anInt3493 * 64 + arg0.anInt3478 * 128;
			    arg0.anInt3495
				= (i_3_ * i + (-i + i_2_) * i_0_) / i_2_;
			    int i_4_
				= arg0.anInt3493 * 64 + arg0.anInt3489 * 128;
			    arg0.anInt3436
				= ((i_2_ - i) * i_1_ - -(i * i_4_)) / i_2_;
			}
			if (arg0.anInt3444 == 0)
			    arg0.anInt3469 = 1024;
			arg0.anInt3437 = 0;
			if ((arg0.anInt3444 ^ 0xffffffff) == -2)
			    arg0.anInt3469 = 1536;
			if (arg1 < -11)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_438_;
		    }
		    return;
		} while (false);
		try {
		    if (-3 == (arg0.anInt3444 ^ 0xffffffff))
			arg0.anInt3469 = 0;
		    anInt4517++;
		    if (-4 == (arg0.anInt3444 ^ 0xffffffff))
			arg0.anInt3469 = 512;
		    arg0.anInt3461 = arg0.anInt3469;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_439_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("o.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	} while (false);
    }
    
    public static void method614(byte arg0) {
	try {
	    aClass124_4511 = null;
	    aClass14_Sub2_Sub19_4508 = null;
	    aClass124_4510 = null;
	    int i = -18 % ((37 - arg0) / 55);
	    anIntArray4512 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "o.B(" + arg0 + ')');
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4516++;
	    int[] is_5_ = aClass149_2851.method2014(arg0, (byte) 127);
	    if (arg1 >= -58)
		method474(105, -19);
	    if (aClass149_2851.aBoolean2402) {
		int i = anInt4506 + (anInt4506 + 1);
		int i_6_ = anInt4507 + anInt4507 + 1;
		int i_7_ = 65536 / i_6_;
		int[][] is_8_ = new int[i][];
		int i_9_ = 65536 / i;
		for (int i_10_ = -anInt4506 + arg0;
		     (i_10_ ^ 0xffffffff) >= (anInt4506 + arg0 ^ 0xffffffff);
		     i_10_++) {
		    int[] is_11_
			= method483(0, (byte) -40, Class115.anInt1927 & i_10_);
		    int i_12_ = 0;
		    for (int i_13_ = -anInt4507; anInt4507 >= i_13_; i_13_++)
			i_12_ += is_11_[i_13_ & Class14_Sub10_Sub1.anInt4882];
		    int[] is_14_ = new int[Class112.anInt1876];
		    int i_15_ = 0;
		    while (Class112.anInt1876 > i_15_) {
			is_14_[i_15_] = i_7_ * i_12_ >> 821719600;
			i_12_ -= is_11_[(Class14_Sub10_Sub1.anInt4882
					 & i_15_ - anInt4507)];
			i_15_++;
			i_12_ += is_11_[(i_15_ - -anInt4507
					 & Class14_Sub10_Sub1.anInt4882)];
		    }
		    is_8_[-arg0 + (anInt4506 + i_10_)] = is_14_;
		}
		for (int i_16_ = 0;
		     (i_16_ ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i_16_++) {
		    int i_17_ = 0;
		    for (int i_18_ = 0; i_18_ < i; i_18_++)
			i_17_ += is_8_[i_18_][i_16_];
		    is_5_[i_16_] = i_17_ * i_9_ >> -987631696;
		}
	    }
	    is = is_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("o.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt4514++;
	    int[][] is_19_ = aClass95_2838.method1481(1, arg0);
	    if (arg1 >= -4)
		aClass124_4510 = null;
	    if (aClass95_2838.aBoolean1628) {
		int i = 1 + anInt4506 + anInt4506;
		int i_20_ = 65536 / i;
		int[][][] is_21_ = new int[i][][];
		int i_22_ = 1 + anInt4507 - -anInt4507;
		int i_23_ = 65536 / i_22_;
		for (int i_24_ = arg0 + -anInt4506;
		     (anInt4506 + arg0 ^ 0xffffffff) <= (i_24_ ^ 0xffffffff);
		     i_24_++) {
		    int[][] is_25_
			= method480(0, 0, i_24_ & Class115.anInt1927);
		    int[][] is_26_ = new int[3][Class112.anInt1876];
		    int i_27_ = 0;
		    int i_28_ = 0;
		    int i_29_ = 0;
		    int[] is_30_ = is_25_[0];
		    int[] is_31_ = is_25_[1];
		    int[] is_32_ = is_25_[2];
		    for (int i_33_ = -anInt4507; anInt4507 >= i_33_; i_33_++) {
			int i_34_ = Class14_Sub10_Sub1.anInt4882 & i_33_;
			i_29_ += is_31_[i_34_];
			i_28_ += is_30_[i_34_];
			i_27_ += is_32_[i_34_];
		    }
		    int[] is_35_ = is_26_[1];
		    int[] is_36_ = is_26_[2];
		    int[] is_37_ = is_26_[0];
		    int i_38_ = 0;
		    while ((i_38_ ^ 0xffffffff)
			   > (Class112.anInt1876 ^ 0xffffffff)) {
			is_37_[i_38_] = i_28_ * i_23_ >> -360795600;
			is_35_[i_38_] = i_29_ * i_23_ >> 991083184;
			is_36_[i_38_] = i_27_ * i_23_ >> -557719440;
			int i_39_
			    = Class14_Sub10_Sub1.anInt4882 & i_38_ - anInt4507;
			i_38_++;
			i_27_ -= is_32_[i_39_];
			i_29_ -= is_31_[i_39_];
			i_28_ -= is_30_[i_39_];
			i_39_
			    = anInt4507 + i_38_ & Class14_Sub10_Sub1.anInt4882;
			i_28_ += is_30_[i_39_];
			i_27_ += is_32_[i_39_];
			i_29_ += is_31_[i_39_];
		    }
		    is_21_[anInt4506 + i_24_ - arg0] = is_26_;
		}
		int[] is_40_ = is_19_[0];
		int[] is_41_ = is_19_[1];
		int[] is_42_ = is_19_[2];
		for (int i_43_ = 0; i_43_ < Class112.anInt1876; i_43_++) {
		    int i_44_ = 0;
		    int i_45_ = 0;
		    int i_46_ = 0;
		    for (int i_47_ = 0;
			 (i ^ 0xffffffff) < (i_47_ ^ 0xffffffff); i_47_++) {
			int[][] is_48_ = is_21_[i_47_];
			i_45_ += is_48_[1][i_43_];
			i_44_ += is_48_[0][i_43_];
			i_46_ += is_48_[2][i_43_];
		    }
		    is_40_[i_43_] = i_44_ * i_20_ >> 557133968;
		    is_41_[i_43_] = i_20_ * i_45_ >> 1927998352;
		    is_42_[i_43_] = i_46_ * i_20_ >> -236327568;
		}
	    }
	    is = is_19_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("o.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4519++;
	    int i = arg0;
	while_440_:
	    do {
		do {
		    if ((i ^ 0xffffffff) != -1) {
			if (i != 1) {
			    if (i == 2)
				break;
			    break while_440_;
			}
		    } else {
			anInt4507 = arg2.method798(59);
			break while_440_;
		    }
		    anInt4506 = arg2.method798(arg1 ^ ~0x60e2);
		    break while_440_;
		} while (false);
		aBoolean2862
		    = (arg2.method798(arg1 + -24654) ^ 0xffffffff) == -2;
	    } while (false);
	    if (arg1 != 24777)
		method615(47);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("o.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method615(int arg0) {
	try {
	    anInt4513++;
	    if (arg0 != 300)
		anIntArray4512 = null;
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class64.anInt1012 ^ 0xffffffff); i++) {
		int i_49_ = Class14_Sub2_Sub7.anIntArray3825[i];
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_49_];
		int i_50_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method798(-94);
		if (-1 != (i_50_ & 0x10 ^ 0xffffffff)) {
		    class133_sub1_sub2.anInt3453
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method784((byte) 117);
		    if ((class133_sub1_sub2.anInt3453 ^ 0xffffffff) == -65536)
			class133_sub1_sub2.anInt3453 = -1;
		}
		if (0 != (0x8 & i_50_)) {
		    if (class133_sub1_sub2.aClass12_4949
			    .method212((byte) -121))
			Class37.method1112(class133_sub1_sub2, (byte) -26);
		    class133_sub1_sub2.aClass12_4949
			= Class126.method1744(Class14_Sub8_Sub38
						  .aClass14_Sub10_Sub1_4734
						  .method791(-3977),
					      arg0 ^ 0x186);
		    class133_sub1_sub2.anInt3432
			= class133_sub1_sub2.aClass12_4949.anInt339;
		    class133_sub1_sub2.anInt3493
			= class133_sub1_sub2.aClass12_4949.anInt334;
		    class133_sub1_sub2.anInt3457
			= class133_sub1_sub2.aClass12_4949.anInt296;
		    class133_sub1_sub2.anInt3492
			= class133_sub1_sub2.aClass12_4949.anInt303;
		    class133_sub1_sub2.anInt3471
			= class133_sub1_sub2.aClass12_4949.anInt286;
		    class133_sub1_sub2.anInt3433
			= class133_sub1_sub2.aClass12_4949.anInt323;
		    class133_sub1_sub2.anInt3454
			= class133_sub1_sub2.aClass12_4949.anInt318;
		    class133_sub1_sub2.anInt3463
			= class133_sub1_sub2.aClass12_4949.anInt276;
		    class133_sub1_sub2.anInt3484
			= class133_sub1_sub2.aClass12_4949.anInt284;
		    if (class133_sub1_sub2.aClass12_4949
			    .method212((byte) -122))
			Class12.method213(class133_sub1_sub2.anIntArray3476[0],
					  class133_sub1_sub2.anIntArray3443[0],
					  null, (byte) -35,
					  Class14_Sub2_Sub3.anInt3785, null,
					  class133_sub1_sub2, 0);
		}
		if ((0x40 & i_50_) != 0) {
		    class133_sub1_sub2.aClass124_3462
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(arg0 ^ 0x25d7);
		    class133_sub1_sub2.anInt3473 = 100;
		}
		if ((0x1 & i_50_) != 0) {
		    int i_51_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method836((byte) -14);
		    if (65535 == i_51_)
			i_51_ = -1;
		    int i_52_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(arg0 + -210);
		    Class14_Sub8_Sub24.method610(i_51_, i_52_,
						 class133_sub1_sub2, 12288);
		}
		if (-1 != (0x2 & i_50_ ^ 0xffffffff)) {
		    class133_sub1_sub2.anInt3487
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method836((byte) 123);
		    int i_53_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method820((byte) 109);
		    if (class133_sub1_sub2.anInt3487 == 65535)
			class133_sub1_sub2.anInt3487 = -1;
		    class133_sub1_sub2.anInt3459 = 0;
		    class133_sub1_sub2.anInt3475 = i_53_ >> -1068529616;
		    class133_sub1_sub2.anInt3485
			= Class14_Sub2_Sub20.anInt4064 + (i_53_ & 0xffff);
		    class133_sub1_sub2.anInt3470 = 0;
		    if (class133_sub1_sub2.anInt3485
			> Class14_Sub2_Sub20.anInt4064)
			class133_sub1_sub2.anInt3470 = -1;
		}
		if ((i_50_ & 0x20) != 0) {
		    int i_54_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-85);
		    int i_55_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method832((byte) -108);
		    class133_sub1_sub2.method1801(0, i_55_,
						  Class14_Sub2_Sub20.anInt4064,
						  i_54_);
		}
		if (0 != (i_50_ & 0x80)) {
		    class133_sub1_sub2.anInt3504
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method836((byte) 125);
		    class133_sub1_sub2.anInt3480
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method781(false);
		}
		if ((i_50_ & 0x4 ^ 0xffffffff) != -1) {
		    int i_56_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(arg0 ^ 0x16c);
		    int i_57_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-27);
		    class133_sub1_sub2.method1801(0, i_57_,
						  Class14_Sub2_Sub20.anInt4064,
						  i_56_);
		    class133_sub1_sub2.anInt3450
			= 300 + Class14_Sub2_Sub20.anInt4064;
		    class133_sub1_sub2.anInt3438
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method832((byte) -69);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "o.E(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub25() {
	super(1, false);
	anInt4506 = 1;
    }
    
    static {
	anInt4505 = 0;
	aBoolean4518 = true;
	anInt4509 = -1;
	aClass124_4510
	    = Class14_Sub2_Sub2.method263(1178, "Created gameworld");
	anInt4515 = 0;
	aClass124_4511 = aClass124_4510;
	anInt4520 = 0;
    }
}
