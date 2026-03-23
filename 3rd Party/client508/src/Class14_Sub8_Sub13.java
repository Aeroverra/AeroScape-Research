/* Class14_Sub8_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub13 extends Class14_Sub8
{
    public static Class124 aClass124_4302;
    public static int anInt4303;
    public static int anInt4304;
    public static Class124 aClass124_4305
	= Class14_Sub2_Sub2.method263(1178, " from your ignore list first)3");
    public static int anInt4306 = 0;
    public static int anInt4307;
    public static int anInt4308;
    public static int anInt4309;
    public static int anInt4310;
    public static int anInt4311;
    public static Class124 aClass124_4312;
    public static Class124 aClass124_4313
	= Class14_Sub2_Sub2.method263(1178, "(U4");
    public static int anInt4314 = 0;
    public static Class124 aClass124_4315;
    public static int anInt4316;
    public static int anInt4317;
    
    public static void method544(byte arg0) {
	try {
	    if (arg0 <= 112)
		anInt4310 = -111;
	    anInt4304++;
	    Class133_Sub1_Sub1.aClass52_4926.method1209((byte) -96);
	    Class125.aClass52_2075.method1209((byte) -96);
	    Class70.aClass52_1077.method1209((byte) -96);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ib.G(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_365_:
	do {
	while_364_:
	    do {
		do {
		    try {
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_364_;
		    }
		    return;
		} while (false);
		try {
		    if (arg0 == 0)
			aBoolean2862 = -2 == (arg2.method798(arg1 ^ 0x60a0)
					      ^ 0xffffffff);
		    anInt4303++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_365_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ib.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static int method545(byte arg0, int arg1, int arg2) {
	int i;
	try {
	    int i_0_ = arg2 >> 695524447 & -1 + arg1;
	    anInt4311++;
	    int i_1_ = 126 / ((-49 - arg0) / 43);
	    i = (arg2 - -(arg2 >>> 2128508639)) % arg1 + i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ib.J(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public static int method546(Class124 arg0, int arg1) {
    while_366_:
	do {
	    do {
		int i;
		try {
		    anInt4307++;
		    if (arg0.method1693(0) != 0)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_366_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (i < Class152.aClass146_2435.anInt2353) {
		if (Class152.aClass146_2435.aClass124Array2362[i]
			.method1672(60, arg0))
		    return i;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_366_;
		}
	    }
	    if (arg1 != -23861)
		method544((byte) -115);
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ib.H("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method547(byte arg0) {
    while_368_:
	do {
	while_367_:
	    do {
		do {
		    try {
			aClass124_4305 = null;
			aClass124_4315 = null;
			aClass124_4312 = null;
			if (arg0 == 38)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_367_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_4302 = null;
		    aClass124_4313 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_368_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ib.E(" + arg0 + ')');
	} while (false);
    }
    
    public static void method548(int arg0, int arg1) {
    while_370_:
	do {
	while_369_:
	    do {
		do {
		    try {
			Class14_Sub6.aClass52_2817.method1208((byte) -112,
							      arg0);
			if (arg1 == 1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_369_;
		    }
		    return;
		} while (false);
		try {
		    anInt4309++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_370_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ib.D(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static boolean method549(int arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	int i = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
	int i_2_
	    = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
	int i_3_
	    = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
	if (i * i_3_ > 0 && i_3_ * i_2_ > 0)
	    return true;
	return false;
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    if (arg1 >= -4)
		aClass124_4315 = null;
	    anInt4316++;
	    int[][] is_4_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628) {
		int[] is_5_ = method483(2, (byte) -128, arg0);
		int[][] is_6_ = method480(0, 0, arg0);
		int[][] is_7_ = method480(0, 1, arg0);
		int[] is_8_ = is_4_[1];
		int[] is_9_ = is_6_[0];
		int[] is_10_ = is_6_[1];
		int[] is_11_ = is_4_[0];
		int[] is_12_ = is_6_[2];
		int[] is_13_ = is_4_[2];
		int[] is_14_ = is_7_[1];
		int[] is_15_ = is_7_[2];
		int[] is_16_ = is_7_[0];
		for (int i = 0; Class112.anInt1876 > i; i++) {
		    int i_17_ = is_5_[i];
		    if (4096 != i_17_) {
			if (0 == i_17_) {
			    is_11_[i] = is_16_[i];
			    is_8_[i] = is_14_[i];
			    is_13_[i] = is_15_[i];
			} else {
			    int i_18_ = -i_17_ + 4096;
			    is_11_[i] = (is_9_[i] * i_17_ + i_18_ * is_16_[i]
					 >> -205763700);
			    is_8_[i] = (i_18_ * is_14_[i] + i_17_ * is_10_[i]
					>> 1562575244);
			    is_13_[i]
				= (i_17_ * is_12_[i] - -(i_18_ * is_15_[i])
				   >> -485697812);
			}
		    } else {
			is_11_[i] = is_9_[i];
			is_8_[i] = is_10_[i];
			is_13_[i] = is_12_[i];
		    }
		}
	    }
	    is = is_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ib.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public Class14_Sub8_Sub13() {
	super(3, false);
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    if (arg1 >= -58)
		method484(-114, (byte) 117);
	    int[] is_19_ = aClass149_2851.method2014(arg0, (byte) 102);
	    anInt4308++;
	    if (aClass149_2851.aBoolean2402) {
		int[] is_20_ = method483(0, (byte) -57, arg0);
		int[] is_21_ = method483(1, (byte) -99, arg0);
		int[] is_22_ = method483(2, (byte) -85, arg0);
		for (int i = 0; Class112.anInt1876 > i; i++) {
		    int i_23_ = is_22_[i];
		    if ((i_23_ ^ 0xffffffff) != -4097) {
			if (0 == i_23_)
			    is_19_[i] = is_21_[i];
			else
			    is_19_[i]
				= (i_23_ * is_20_[i] - -(is_21_[i]
							 * (-i_23_ + 4096))
				   >> -1206224244);
		    } else
			is_19_[i] = is_20_[i];
		}
	    }
	    is = is_19_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ib.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    static {
	aClass124_4312
	    = Class14_Sub2_Sub2.method263(1178, "Starting 3d library");
	aClass124_4315 = aClass124_4305;
	aClass124_4302 = aClass124_4312;
    }
}
