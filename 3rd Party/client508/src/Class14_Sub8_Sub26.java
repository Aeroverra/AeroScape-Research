/* Class14_Sub8_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub26 extends Class14_Sub8
{
    public static Class9_Sub1 aClass9_Sub1_4521;
    public static int anInt4522;
    public static int anInt4523;
    public static int anInt4524;
    public static int anInt4525;
    public static int anInt4526;
    public static int anInt4527 = (int) (Math.random() * 33.0) - 16;
    public static boolean aBoolean4528;
    public static Class124 aClass124_4529;
    public static int anInt4530;
    public static int anInt4531;
    public static int anInt4532;
    public static int anInt4533;
    public static int anInt4534;
    
    public Class14_Sub8_Sub26() {
	super(1, false);
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4523++;
	    if (arg1 > -58)
		anInt4527 = 105;
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 118);
	    if (aClass149_2851.aBoolean2402) {
		int[] is_1_ = method483(0, (byte) -81, arg0);
		for (int i = 0;
		     (Class112.anInt1876 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		    is_0_[i] = 4096 + -is_1_[i];
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("od.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static byte[] method616(byte[] arg0, int arg1) {
    while_441_:
	do {
	    do {
		byte[] is;
		try {
		    anInt4531++;
		    if (arg1 > 75)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_441_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		int i = arg0.length;
		byte[] is_2_ = new byte[i];
		Class72.method1322(arg0, 0, is_2_, 0, i);
		is = is_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("od.H("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static int method617(int arg0, int arg1) {
	int i;
	try {
	    i = arg0 & arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("od.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method618(int arg0) {
    while_443_:
	do {
	while_442_:
	    do {
		int i;
		int i_3_;
		try {
		    anInt4524++;
		    if (arg0 != 1)
			aClass124_4529 = null;
		    i = 0;
		    i_3_ = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		for (/**/; -105 < (i_3_ ^ 0xffffffff); i_3_++) {
		    int i_4_ = 0;
		    while (104 > i_4_) {
			if (Class99.method1498
			    ((byte) 53, true, i_4_,
			     Class125_Sub1.aClass14_Sub29ArrayArrayArray3368,
			     i_3_, i))
			    i++;
			if (-513 >= (i ^ 0xffffffff))
			    return;
			try {
			    i_4_++;
			} catch (RuntimeException runtimeexception) {
			    break while_442_;
			}
		    }
		}
		break while_443_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "od.E(" + arg0 + ')');
	} while (false);
    }
    
    public static boolean method619(int arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5) {
	if (arg1 == arg2 && arg3 == arg4) {
	    if (!Class103.method1529(arg0, arg1, arg3))
		return false;
	    int i = arg1 << 7;
	    int i_5_ = arg3 << 7;
	    if (Class69.method1310(i + 1,
				   (Class114.anIntArrayArrayArray1896[arg0]
				    [arg1][arg3]) + arg5,
				   i_5_ + 1)
		&& Class69.method1310(i + 128 - 1,
				      (Class114.anIntArrayArrayArray1896[arg0]
				       [arg1 + 1][arg3]) + arg5,
				      i_5_ + 1)
		&& Class69.method1310(i + 128 - 1,
				      (Class114.anIntArrayArrayArray1896[arg0]
				       [arg1 + 1][arg3 + 1]) + arg5,
				      i_5_ + 128 - 1)
		&& Class69.method1310(i + 1,
				      (Class114.anIntArrayArrayArray1896[arg0]
				       [arg1][arg3 + 1]) + arg5,
				      i_5_ + 128 - 1))
		return true;
	    return false;
	}
	for (int i = arg1; i <= arg2; i++) {
	    for (int i_6_ = arg3; i_6_ <= arg4; i_6_++) {
		if (Class14_Sub1.anIntArrayArrayArray2724[arg0][i][i_6_]
		    == -Class67.anInt1059)
		    return false;
	    }
	}
	int i = (arg1 << 7) + 1;
	int i_7_ = (arg3 << 7) + 2;
	int i_8_ = Class114.anIntArrayArrayArray1896[arg0][arg1][arg3] + arg5;
	if (!Class69.method1310(i, i_8_, i_7_))
	    return false;
	int i_9_ = (arg2 << 7) - 1;
	if (!Class69.method1310(i_9_, i_8_, i_7_))
	    return false;
	int i_10_ = (arg4 << 7) - 1;
	if (!Class69.method1310(i, i_8_, i_10_))
	    return false;
	if (!Class69.method1310(i_9_, i_8_, i_10_))
	    return false;
	return true;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    if (arg1 != 24777)
		aClass124_4529 = null;
	    anInt4522++;
	    if (arg0 == 0)
		aBoolean2862 = (arg2.method798(91) ^ 0xffffffff) == -2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("od.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    if (arg1 > -4)
		anInt4527 = -124;
	    anInt4534++;
	    int[][] is_11_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628) {
		int[][] is_12_ = method480(0, 0, arg0);
		int[] is_13_ = is_12_[0];
		int[] is_14_ = is_12_[2];
		int[] is_15_ = is_11_[2];
		int[] is_16_ = is_11_[1];
		int[] is_17_ = is_12_[1];
		int[] is_18_ = is_11_[0];
		for (int i = 0; i < Class112.anInt1876; i++) {
		    is_18_[i] = 4096 + -is_13_[i];
		    is_16_[i] = 4096 - is_17_[i];
		    is_15_[i] = -is_14_[i] + 4096;
		}
	    }
	    is = is_11_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("od.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method620(boolean arg0) {
	try {
	    if (arg0)
		method619(4, -52, 126, 78, -70, 66);
	    aClass124_4529 = null;
	    aClass9_Sub1_4521 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "od.D(" + arg0 + ')');
	}
    }
    
    static {
	anInt4525 = -2;
	anInt4532 = -1;
	aClass124_4529 = Class14_Sub2_Sub2.method263(1178, ")1 ");
	aBoolean4528 = true;
    }
}
