/* Class14_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub3 extends Class14_Sub8
{
    public static int anInt4123;
    public static int anInt4124 = 0;
    public static int anInt4125;
    public boolean aBoolean4126;
    public int anInt4127 = 4096;
    public static int anInt4128;
    public static int anInt4129;
    public static byte[][][] aByteArrayArrayArray4130;
    public static int anInt4131;
    public static int anInt4132 = 0;
    public static short[] aShortArray4133
	= { -4160, -4163, -8256, -8259, 22461 };
    public static int anInt4134;
    public static int anInt4135 = 0;
    public static int anInt4136;
    public static Class39 aClass39_4137 = Class99.method1497(true);
    public static boolean[][] aBooleanArrayArray4138;
    public static int[] anIntArray4139 = new int[128];
    
    public Class14_Sub8_Sub3() {
	super(1, false);
	aBoolean4126 = true;
    }
    
    public static void method491(int arg0) {
    while_299_:
	do {
	while_298_:
	    do {
		do {
		    try {
			aClass39_4137 = null;
			aByteArrayArrayArray4130 = null;
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_298_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray4139 = null;
		    aShortArray4133 = null;
		    aBooleanArrayArray4138 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_299_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "dc.G(" + arg0 + ')');
	} while (false);
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_300_:
	do {
	    do {
		int[][] is;
		try {
		    if (arg1 <= -4)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_300_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		int[][] is_0_ = aClass95_2838.method1481(1, arg0);
		if (aClass95_2838.aBoolean1628) {
		    int[] is_1_ = method483(0, (byte) -76,
					    Class115.anInt1927 & -1 + arg0);
		    int[] is_2_ = method483(0, (byte) -75, arg0);
		    int[] is_3_ = method483(0, (byte) -68,
					    arg0 - -1 & Class115.anInt1927);
		    int[] is_4_ = is_0_[1];
		    int[] is_5_ = is_0_[0];
		    int[] is_6_ = is_0_[2];
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
			 i++) {
			int i_7_ = anInt4127 * (-is_1_[i] + is_3_[i]);
			int i_8_
			    = ((-is_2_[Class14_Sub10_Sub1.anInt4882 & i + -1]
				+ is_2_[Class14_Sub10_Sub1.anInt4882 & 1 + i])
			       * anInt4127);
			int i_9_ = i_8_ >> 1602724876;
			int i_10_ = i_7_ >> 70832268;
			int i_11_ = i_9_ * i_9_ >> 422953036;
			int i_12_ = i_10_ * i_10_ >> -61018324;
			int i_13_
			    = (int) (Math.sqrt((double) ((float) (4096 + i_11_
								  + i_12_)
							 / 4096.0F))
				     * 4096.0);
			int i_14_;
			int i_15_;
			int i_16_;
			if ((i_13_ ^ 0xffffffff) != -1) {
			    i_14_ = i_8_ / i_13_;
			    i_15_ = 16777216 / i_13_;
			    i_16_ = i_7_ / i_13_;
			} else {
			    i_14_ = 0;
			    i_15_ = 0;
			    i_16_ = 0;
			}
			if (aBoolean4126) {
			    i_15_ = 2048 - -(i_15_ >> -1334131135);
			    i_14_ = (i_14_ >> 1009319937) + 2048;
			    i_16_ = (i_16_ >> -1791422079) + 2048;
			}
			is_5_[i] = i_14_;
			is_4_[i] = i_16_;
			is_6_[i] = i_15_;
		    }
		}
		anInt4123++;
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "dc.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static int method492(int arg0, int arg1) {
    while_301_:
	do {
	    do {
		int i;
		try {
		    anInt4125++;
		    if (arg0 == 11604)
			break;
		    i = 76;
		} catch (RuntimeException runtimeexception) {
		    break while_301_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg1 & 0xff;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "dc.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method493(byte arg0, Class124 arg1, Class124 arg2,
				 int arg3, Class124 arg4, int arg5) {
	try {
	    for (int i = 99; 0 < i; i--) {
		Class114.anIntArray1902[i] = Class114.anIntArray1902[i - 1];
		Class14_Sub8_Sub32.aClass124Array4626[i]
		    = Class14_Sub8_Sub32.aClass124Array4626[-1 + i];
		Class14_Sub2_Sub18.aClass124Array4024[i]
		    = Class14_Sub2_Sub18.aClass124Array4024[i + -1];
		Class124.aClass124Array2508[i]
		    = Class124.aClass124Array2508[-1 + i];
		Class133.anIntArray2176[i] = Class133.anIntArray2176[-1 + i];
	    }
	    if (arg0 > -46)
		aByteArrayArrayArray4130 = null;
	    Class14_Sub8_Sub32.aClass124Array4626[0] = arg2;
	    anInt4134++;
	    Class114.anIntArray1902[0] = arg3;
	    Class14_Sub10_Sub1.anInt4877 = Class14_Sub8_Sub23.anInt4478;
	    Class53.anInt874++;
	    Class14_Sub2_Sub18.aClass124Array4024[0] = arg4;
	    Class133.anIntArray2176[0] = arg5;
	    Class124.aClass124Array2508[0] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dc.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ')'));
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	    do {
		if (0 != i) {
		    if (1 != i)
			break;
		} else {
		    anInt4127 = arg2.method784((byte) 112);
		    break;
		}
		aBoolean4126 = 1 == arg2.method798(-25);
	    } while (false);
	    anInt4131++;
	    if (arg1 != 24777)
		method475(-114, 26, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dc.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method494(byte arg0) {
	try {
	    if (Class14_Sub8_Sub9.aClass141_4239 != null) {
		Class141 class141 = Class14_Sub8_Sub9.aClass141_4239;
		synchronized (class141) {
		    Class14_Sub8_Sub9.aClass141_4239 = null;
		}
	    }
	    anInt4129++;
	    if (arg0 > -64)
		method491(-123);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "dc.D(" + arg0 + ')');
	}
    }
    
    public static void method495(byte arg0, boolean arg1) {
	try {
	    Class53.aBoolean865 = arg1;
	    anInt4136++;
	    if (arg0 != -47)
		method491(-27);
	    Class19.aBoolean2539 = !Class128.method1755(130068615);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("dc.H(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
