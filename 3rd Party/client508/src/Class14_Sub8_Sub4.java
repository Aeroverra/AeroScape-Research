/* Class14_Sub8_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub4 extends Class14_Sub8
{
    public int anInt4140;
    public static int anInt4141;
    public static byte[][][] aByteArrayArrayArray4142 = new byte[4][104][104];
    public static Class40[] aClass40Array4143 = new Class40[100];
    public int anInt4144 = 4096;
    public static int[] anIntArray4145;
    public static int anInt4146;
    public int anInt4147 = 4096;
    public static int anInt4148;
    public static Class124 aClass124_4149
	= Class14_Sub2_Sub2.method263(1178, " x ");
    public static int anInt4150;
    public static int anInt4151;
    public static int anInt4152;
    
    public static void method496(byte arg0) {
    while_303_:
	do {
	while_302_:
	    do {
		do {
		    try {
			anIntArray4145 = null;
			aClass40Array4143 = null;
			if (arg0 > 45)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_302_;
		    }
		    return;
		} while (false);
		try {
		    aByteArrayArrayArray4142 = null;
		    aClass124_4149 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_303_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "dd.E(" + arg0 + ')');
	} while (false);
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_304_:
	do {
	    do {
		int[][] is;
		try {
		    if (arg1 < -4)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_304_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		int[][] is_0_ = aClass95_2838.method1481(1, arg0);
		if (aClass95_2838.aBoolean1628) {
		    int[][] is_1_ = method480(0, 0, arg0);
		    int[] is_2_ = is_1_[1];
		    int[] is_3_ = is_1_[0];
		    int[] is_4_ = is_0_[0];
		    int[] is_5_ = is_0_[1];
		    int[] is_6_ = is_1_[2];
		    int[] is_7_ = is_0_[2];
		    for (int i = 0; Class112.anInt1876 > i; i++) {
			int i_8_ = is_3_[i];
			int i_9_ = is_2_[i];
			int i_10_ = is_6_[i];
			if ((i_10_ ^ 0xffffffff) == (i_8_ ^ 0xffffffff)
			    && (i_9_ ^ 0xffffffff) == (i_10_ ^ 0xffffffff)) {
			    is_4_[i] = anInt4140 * i_8_ >> -2038177204;
			    is_5_[i] = anInt4144 * i_10_ >> -1345472084;
			    is_7_[i] = i_9_ * anInt4147 >> 703769132;
			} else {
			    is_4_[i] = anInt4140;
			    is_5_[i] = anInt4144;
			    is_7_[i] = anInt4147;
			}
		    }
		}
		anInt4148++;
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "dd.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static Class37 method497(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	return class14_sub29.aClass37_3255;
    }
    
    public static void method498(Class133_Sub1 arg0, byte arg1) {
	try {
	    int i = -Class14_Sub2_Sub20.anInt4064 + arg0.anInt3494;
	    arg0.anInt3437 = 0;
	    int i_11_ = 128 * arg0.anInt3451 - -(arg0.anInt3493 * 64);
	    int i_12_ = arg0.anInt3493 * 64 + 128 * arg0.anInt3472;
	    if (-1 == (arg0.anInt3444 ^ 0xffffffff))
		arg0.anInt3469 = 1024;
	    arg0.anInt3495 += (-arg0.anInt3495 + i_11_) / i;
	    anInt4150++;
	    if ((arg0.anInt3444 ^ 0xffffffff) == -2)
		arg0.anInt3469 = 1536;
	    if (arg1 != -82)
		method498(null, (byte) -105);
	    if (2 == arg0.anInt3444)
		arg0.anInt3469 = 0;
	    if (arg0.anInt3444 == 3)
		arg0.anInt3469 = 512;
	    arg0.anInt3436 += (-arg0.anInt3436 + i_12_) / i;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dd.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_305_:
	do {
	    try {
		anInt4141++;
		if (arg1 != 24777)
		    anInt4147 = 90;
		int i = arg0;
		do {
		    if ((i ^ 0xffffffff) != -1) {
			if (-2 != (i ^ 0xffffffff)) {
			    if (i == 2)
				break;
			    break while_305_;
			}
		    } else {
			anInt4140 = arg2.method784((byte) 111);
			break while_305_;
		    }
		    anInt4144 = arg2.method784((byte) 115);
		    break while_305_;
		} while (false);
		anInt4147 = arg2.method784((byte) 105);
	    } catch (RuntimeException runtimeexception) {
		throw Class14_Sub8_Sub14.method554(runtimeexception,
						   ("dd.F(" + arg0 + ',' + arg1
						    + ','
						    + (arg2 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	} while (false);
    }
    
    public Class14_Sub8_Sub4() {
	super(1, false);
	anInt4140 = 4096;
    }
    
    public static void method499(boolean arg0, int arg1) {
	try {
	    Class96.anIntArray1630 = new int[arg1];
	    Class120.anIntArray2008 = new int[arg1];
	    Class14_Sub19.anIntArray3079 = new int[arg1];
	    Class14_Sub2_Sub11.anIntArray3872 = new int[arg1];
	    if (arg0)
		method496((byte) 56);
	    anInt4151++;
	    Class14_Sub8_Sub20.anIntArray4422 = new int[arg1];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dd.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    static {
	anInt4146 = 0;
	anInt4152 = 0;
    }
}
