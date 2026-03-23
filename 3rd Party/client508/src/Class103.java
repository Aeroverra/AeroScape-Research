/* Class103 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class103
{
    public static int anInt1725;
    public static int anInt1726;
    public static boolean[] aBooleanArray1727 = new boolean[100];
    public static int anInt1728;
    public static int anInt1729;
    public static int anInt1730 = 0;
    public static int anInt1731;
    
    public static void method1527(byte arg0) {
	try {
	    if (arg0 <= 96)
		method1530(100, -70, 69, 118);
	    aBooleanArray1727 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qa.E(" + arg0 + ')');
	}
    }
    
    public static int method1528(int arg0, int arg1, int arg2, int arg3) {
    while_1036_:
	do {
	    do {
		int i;
		try {
		    if (arg3 < 17)
			method1527((byte) -18);
		    anInt1726++;
		    arg2 &= 0x3;
		    if (arg2 != 0)
			break;
		    i = arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_1036_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if ((arg2 ^ 0xffffffff) != -2)
			break;
		    i = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_1036_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-3 != (arg2 ^ 0xffffffff))
			break;
		    i = 7 - arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_1036_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 7 + -arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qa.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public static boolean method1529(int arg0, int arg1, int arg2) {
	int i = Class14_Sub1.anIntArrayArrayArray2724[arg0][arg1][arg2];
	if (i == -Class67.anInt1059)
	    return false;
	if (i == Class67.anInt1059)
	    return true;
	int i_0_ = arg1 << 7;
	int i_1_ = arg2 << 7;
	if (Class69.method1310(i_0_ + 1, (Class114.anIntArrayArrayArray1896
					  [arg0][arg1][arg2]), i_1_ + 1)
	    && Class69.method1310(i_0_ + 128 - 1,
				  (Class114.anIntArrayArrayArray1896[arg0]
				   [arg1 + 1][arg2]),
				  i_1_ + 1)
	    && Class69.method1310(i_0_ + 128 - 1,
				  (Class114.anIntArrayArrayArray1896[arg0]
				   [arg1 + 1][arg2 + 1]),
				  i_1_ + 128 - 1)
	    && Class69.method1310(i_0_ + 1,
				  (Class114.anIntArrayArrayArray1896[arg0]
				   [arg1][arg2 + 1]),
				  i_1_ + 128 - 1)) {
	    Class14_Sub1.anIntArrayArrayArray2724[arg0][arg1][arg2]
		= Class67.anInt1059;
	    return true;
	}
	Class14_Sub1.anIntArrayArrayArray2724[arg0][arg1][arg2]
	    = -Class67.anInt1059;
	return false;
    }
    
    public static boolean method1530(int arg0, int arg1, int arg2, int arg3) {
	if (!method1529(arg0, arg1, arg2))
	    return false;
	int i = arg1 << 7;
	int i_2_ = arg2 << 7;
	int i_3_ = Class114.anIntArrayArrayArray1896[arg0][arg1][arg2] - 1;
	int i_4_ = i_3_ - 120;
	int i_5_ = i_3_ - 230;
	int i_6_ = i_3_ - 238;
	if (arg3 < 16) {
	    if (arg3 == 1) {
		if (i > Class4.anInt125) {
		    if (!Class69.method1310(i, i_3_, i_2_))
			return false;
		    if (!Class69.method1310(i, i_3_, i_2_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class69.method1310(i, i_4_, i_2_))
			return false;
		    if (!Class69.method1310(i, i_4_, i_2_ + 128))
			return false;
		}
		if (!Class69.method1310(i, i_5_, i_2_))
		    return false;
		if (!Class69.method1310(i, i_5_, i_2_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 2) {
		if (i_2_ < Class14_Sub2_Sub8.anInt3853) {
		    if (!Class69.method1310(i, i_3_, i_2_ + 128))
			return false;
		    if (!Class69.method1310(i + 128, i_3_, i_2_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class69.method1310(i, i_4_, i_2_ + 128))
			return false;
		    if (!Class69.method1310(i + 128, i_4_, i_2_ + 128))
			return false;
		}
		if (!Class69.method1310(i, i_5_, i_2_ + 128))
		    return false;
		if (!Class69.method1310(i + 128, i_5_, i_2_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 4) {
		if (i < Class4.anInt125) {
		    if (!Class69.method1310(i + 128, i_3_, i_2_))
			return false;
		    if (!Class69.method1310(i + 128, i_3_, i_2_ + 128))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class69.method1310(i + 128, i_4_, i_2_))
			return false;
		    if (!Class69.method1310(i + 128, i_4_, i_2_ + 128))
			return false;
		}
		if (!Class69.method1310(i + 128, i_5_, i_2_))
		    return false;
		if (!Class69.method1310(i + 128, i_5_, i_2_ + 128))
		    return false;
		return true;
	    }
	    if (arg3 == 8) {
		if (i_2_ > Class14_Sub2_Sub8.anInt3853) {
		    if (!Class69.method1310(i, i_3_, i_2_))
			return false;
		    if (!Class69.method1310(i + 128, i_3_, i_2_))
			return false;
		}
		if (arg0 > 0) {
		    if (!Class69.method1310(i, i_4_, i_2_))
			return false;
		    if (!Class69.method1310(i + 128, i_4_, i_2_))
			return false;
		}
		if (!Class69.method1310(i, i_5_, i_2_))
		    return false;
		if (!Class69.method1310(i + 128, i_5_, i_2_))
		    return false;
		return true;
	    }
	}
	if (!Class69.method1310(i + 64, i_6_, i_2_ + 64))
	    return false;
	if (arg3 == 16) {
	    if (!Class69.method1310(i, i_5_, i_2_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 32) {
	    if (!Class69.method1310(i + 128, i_5_, i_2_ + 128))
		return false;
	    return true;
	}
	if (arg3 == 64) {
	    if (!Class69.method1310(i + 128, i_5_, i_2_))
		return false;
	    return true;
	}
	if (arg3 == 128) {
	    if (!Class69.method1310(i, i_5_, i_2_))
		return false;
	    return true;
	}
	return true;
    }
    
    public static void method1531(byte arg0, Class94 arg1) {
	try {
	    anInt1729++;
	    if (arg0 > -30)
		anInt1730 = 51;
	    if ((arg1.anInt1481 ^ 0xffffffff)
		== (Class14_Sub8_Sub34.anInt4666 ^ 0xffffffff))
		Class14_Sub8_Sub36.aBooleanArray4698[arg1.anInt1515] = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qa.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
}
