/* Class14_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub30 extends Class14
{
    public static int anInt3268;
    public static boolean aBoolean3269 = false;
    public Class124 aClass124_3270;
    public static int anInt3271;
    public static int anInt3272;
    public static Class14_Sub27[][] aClass14_Sub27ArrayArray3273;
    public static Class124 aClass124_3274;
    public static Class55 aClass55_3275;
    public static int anInt3276;
    public static int anInt3277;
    public static Class124 aClass124_3278
	= Class14_Sub2_Sub2.method263(1178, "wishes to trade with you)3");
    public static int anInt3279;
    public static int anInt3280;
    public static Class124 aClass124_3281;
    public static int anInt3282;
    public static byte aByte3283;
    
    public static void method937(int arg0, boolean arg1) {
    while_623_:
	do {
	while_622_:
	    do {
		do {
		    try {
			if (!arg1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_622_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub11.aClass52_2946.method1208((byte) -112, arg0);
		    anInt3268++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_623_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "wg.E(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static boolean method938(int arg0, int arg1) {
    while_624_:
	do {
	    do {
		boolean bool;
		try {
		    anInt3276++;
		    if (arg1 == 18024)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_624_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = (-199 == (arg0 ^ 0xffffffff) || 230 == arg0
			|| 156 == arg0 || (arg0 ^ 0xffffffff) == -141
			|| (arg0 ^ 0xffffffff) == -224);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "wg.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method939(Class9 arg0, Class9 arg1, int arg2) {
	try {
	    Class54.aClass9_885 = arg0;
	    if (arg2 != 16)
		aClass124_3281 = null;
	    Class62.aClass9_993 = arg1;
	    anInt3280++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wg.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public Class14_Sub30() {
	/* empty */
    }
    
    public static void method940(Class153 arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 boolean arg8) {
	int i_0_;
	int i = i_0_ = (arg6 << 7) - Class4.anInt125;
	int i_2_;
	int i_1_ = i_2_ = (arg7 << 7) - Class14_Sub2_Sub8.anInt3853;
	int i_4_;
	int i_3_ = i_4_ = i + 128;
	int i_6_;
	int i_5_ = i_6_ = i_1_ + 128;
	int i_7_ = (Class114.anIntArrayArrayArray1896[arg1][arg6][arg7]
		    - Class14_Sub2.anInt2741);
	int i_8_ = (Class114.anIntArrayArrayArray1896[arg1][arg6 + 1][arg7]
		    - Class14_Sub2.anInt2741);
	int i_9_ = (Class114.anIntArrayArrayArray1896[arg1][arg6 + 1][arg7 + 1]
		    - Class14_Sub2.anInt2741);
	int i_10_ = (Class114.anIntArrayArrayArray1896[arg1][arg6][arg7 + 1]
		     - Class14_Sub2.anInt2741);
	int i_11_ = i_1_ * arg4 + i * arg5 >> 16;
	i_1_ = i_1_ * arg5 - i * arg4 >> 16;
	i = i_11_;
	i_11_ = i_7_ * arg3 - i_1_ * arg2 >> 16;
	i_1_ = i_7_ * arg2 + i_1_ * arg3 >> 16;
	i_7_ = i_11_;
	if (i_1_ >= 50) {
	    i_11_ = i_2_ * arg4 + i_3_ * arg5 >> 16;
	    i_2_ = i_2_ * arg5 - i_3_ * arg4 >> 16;
	    i_3_ = i_11_;
	    i_11_ = i_8_ * arg3 - i_2_ * arg2 >> 16;
	    i_2_ = i_8_ * arg2 + i_2_ * arg3 >> 16;
	    i_8_ = i_11_;
	    if (i_2_ >= 50) {
		i_11_ = i_5_ * arg4 + i_4_ * arg5 >> 16;
		i_5_ = i_5_ * arg5 - i_4_ * arg4 >> 16;
		i_4_ = i_11_;
		i_11_ = i_9_ * arg3 - i_5_ * arg2 >> 16;
		i_5_ = i_9_ * arg2 + i_5_ * arg3 >> 16;
		i_9_ = i_11_;
		if (i_5_ >= 50) {
		    i_11_ = i_6_ * arg4 + i_0_ * arg5 >> 16;
		    i_6_ = i_6_ * arg5 - i_0_ * arg4 >> 16;
		    i_0_ = i_11_;
		    i_11_ = i_10_ * arg3 - i_6_ * arg2 >> 16;
		    i_6_ = i_10_ * arg2 + i_6_ * arg3 >> 16;
		    i_10_ = i_11_;
		    if (i_6_ >= 50) {
			int i_12_ = Class3.anInt118 + (i << 9) / i_1_;
			int i_13_ = Class3.anInt110 + (i_7_ << 9) / i_1_;
			int i_14_ = Class3.anInt118 + (i_3_ << 9) / i_2_;
			int i_15_ = Class3.anInt110 + (i_8_ << 9) / i_2_;
			int i_16_ = Class3.anInt118 + (i_4_ << 9) / i_5_;
			int i_17_ = Class3.anInt110 + (i_9_ << 9) / i_5_;
			int i_18_ = Class3.anInt118 + (i_0_ << 9) / i_6_;
			int i_19_ = Class3.anInt110 + (i_10_ << 9) / i_6_;
			Class3.anInt116 = 0;
			if (((i_16_ - i_18_) * (i_15_ - i_19_)
			     - (i_17_ - i_19_) * (i_14_ - i_18_)) > 0
			    && Class142.aBoolean2299
			    && (Class14_Sub8_Sub13.method549
				(Class14_Sub19.anInt3073 + Class3.anInt118,
				 Class99_Sub2.anInt3334 + Class3.anInt110,
				 i_17_, i_19_, i_15_, i_16_, i_18_, i_14_))) {
			    Class66.anInt1039 = arg6;
			    Class14_Sub8_Sub33.anInt4636 = arg7;
			}
			if (((i_12_ - i_14_) * (i_19_ - i_15_)
			     - (i_13_ - i_15_) * (i_18_ - i_14_)) > 0
			    && Class142.aBoolean2299
			    && (Class14_Sub8_Sub13.method549
				(Class14_Sub19.anInt3073 + Class3.anInt118,
				 Class99_Sub2.anInt3334 + Class3.anInt110,
				 i_13_, i_15_, i_19_, i_12_, i_14_, i_18_))) {
			    Class66.anInt1039 = arg6;
			    Class14_Sub8_Sub33.anInt4636 = arg7;
			}
		    }
		}
	    }
	}
    }
    
    public static void method941(byte arg0) {
    while_626_:
	do {
	while_625_:
	    do {
		do {
		    try {
			Class150.aClass52_2406.method1209((byte) -96);
			Class14_Sub8_Sub30.aClass52_4588
			    .method1209((byte) -96);
			anInt3272++;
			if (arg0 == 11)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_625_;
		    }
		    return;
		} while (false);
		try {
		    Class83.aClass52_1339.method1209((byte) -96);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_626_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "wg.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method942(int arg0) {
	try {
	    aClass124_3281 = null;
	    aClass124_3274 = null;
	    aClass55_3275 = null;
	    if (arg0 != 8)
		method940(null, -60, 80, -16, -90, -43, -65, -108, false);
	    aClass14_Sub27ArrayArray3273 = null;
	    aClass124_3278 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wg.C(" + arg0 + ')');
	}
    }
    
    public Class14_Sub30(Class124 arg0) {
	try {
	    aClass124_3270 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wg.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_3274 = aClass124_3278;
	aClass124_3281 = Class14_Sub2_Sub2.method263(1178, "Mitglieder)2Welt");
	aClass55_3275 = new Class55(8);
    }
}
