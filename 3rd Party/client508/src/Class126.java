/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class126
{
    public static int anInt2087;
    public static int anInt2088;
    public static int anInt2089 = 0;
    public static int anInt2090;
    public static int anInt2091;
    public static int anInt2092;
    public static Class2 aClass2_2093 = new Class2();
    public static int[] anIntArray2094
	= { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
	    19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35,
	    36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52,
	    53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78,
	    83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107,
	    108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125,
	    133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155,
	    157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181,
	    182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194,
	    195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207,
	    208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220,
	    221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233,
	    234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246,
	    247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87,
	    87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109,
	    109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139,
	    139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158,
	    158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };
    public static long[] aLongArray2095 = new long[100];
    
    public abstract void method1740(byte[] is, int i);
    
    public static boolean method1741(byte arg0, int arg1) {
    while_1131_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2088++;
		    if (!Class108.aBooleanArray1819[arg1])
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1131_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class83.aClass9_1335.method161((byte) 116, arg1))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1131_;
		}
		return bool;
	    } while (false);
	    int i;
	    do {
		boolean bool;
		try {
		    i = Class83.aClass9_1335.method177(arg1, 13537);
		    if (i != 0)
			break;
		    Class108.aBooleanArray1819[arg1] = true;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1131_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		int i_0_ = 76 % ((-51 - arg0) / 50);
		if (null == Class1.aClass94ArrayArray75[arg1])
		    Class1.aClass94ArrayArray75[arg1] = new Class94[i];
		for (int i_1_ = 0; i_1_ < i; i_1_++) {
		    if (Class1.aClass94ArrayArray75[arg1][i_1_] == null) {
			byte[] is
			    = Class83.aClass9_1335.method163(i_1_, arg1, 0);
			if (is != null) {
			    Class1.aClass94ArrayArray75[arg1][i_1_]
				= new Class94();
			    Class1.aClass94ArrayArray75[arg1][i_1_].anInt1548
				= i_1_ + (arg1 << -1082371568);
			    if (-1 == is[0])
				Class1.aClass94ArrayArray75[arg1][i_1_]
				    .method1469(new Class14_Sub10(is), -121);
			    else
				Class1.aClass94ArrayArray75[arg1][i_1_]
				    .method1474
				    ((byte) -117, new Class14_Sub10(is));
			}
		    }
		}
		Class108.aBooleanArray1819[arg1] = true;
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ta.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1742(byte arg0, long arg1) {
	try {
	    anInt2091++;
	    try {
		Thread.sleep(arg1);
		if (arg0 >= -59)
		    aClass2_2093 = null;
	    } catch (InterruptedException interruptedexception) {
		/* empty */
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ta.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1743(int arg0, int arg1) {
    while_1133_:
	do {
	while_1132_:
	    do {
		do {
		    try {
			anInt2092++;
			if (Class14_Sub8_Sub16.anInt4356 != arg1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1132_;
		    }
		    return;
		} while (false);
		try {
		    if (-1 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff))
			Class14_Sub8_Sub30.method639(-1);
		    if (arg1 == 40)
			Class14_Sub2_Sub18.method380(Class75.anInt1163,
						     (Class14_Sub8_Sub9
						      .aClass124_4242),
						     (Class14_Sub8_Sub9
						      .aClass124_4241),
						     true);
		    if (-41 != (arg1 ^ 0xffffffff)
			&& null != Class21.aClass36_441) {
			Class21.aClass36_441.method1101((byte) -10);
			Class21.aClass36_441 = null;
		    }
		    if ((arg1 ^ 0xffffffff) == -26
			|| (arg1 ^ 0xffffffff) == -29) {
			Class14_Sub18.anInt3064 = 0;
			Class14_Sub8_Sub28.anInt4560 = 1;
			Class14_Sub2_Sub1.anInt3732 = 1;
			Class149.anInt2383 = 0;
			client.anInt2648 = 0;
			Class69.method1311((byte) 118);
		    }
		    if (-6 == (arg1 ^ 0xffffffff))
			Class14_Sub2_Sub18_Sub2.method385
			    ((byte) 67, Class14_Sub3.aClass9_Sub1_2750);
		    else
			Class2.method86(-123);
		    boolean bool = (-6 == (arg1 ^ 0xffffffff) || arg1 == 10
				    || (arg1 ^ 0xffffffff) == -29);
		    if (arg0 != 27252)
			method1746(58);
		    boolean bool_2_ = (Class14_Sub8_Sub16.anInt4356 == 5
				       || -11 == (Class14_Sub8_Sub16.anInt4356
						  ^ 0xffffffff)
				       || -29 == (Class14_Sub8_Sub16.anInt4356
						  ^ 0xffffffff));
		    if (!bool_2_ == bool) {
			if (!bool) {
			    Class69.method1308(2, (byte) -114);
			    Class14_Sub3.method449(true, 4);
			} else {
			    Class14_Sub8.anInt2856 = Class2.anInt97;
			    if (Class14_Sub23.anInt3135 != 0)
				Class14_Sub8_Sub29.method636
				    (Class2.anInt97, 2, arg0 + -1746, 255,
				     false, Class125_Sub2.aClass9_Sub1_3374,
				     0);
			    else
				Class69.method1308(2, (byte) -115);
			    Class14_Sub3.method449(false, arg0 ^ 0x6a70);
			}
		    }
		    if (-26 == (arg1 ^ 0xffffffff) || 28 == arg1
			|| (arg1 ^ 0xffffffff) == -41)
			Class121.method1627();
		    Class14_Sub8_Sub16.anInt4356 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1133_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ta.A(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static Class12 method1744(int arg0, int arg1) {
    while_1134_:
	do {
	    do {
		Class12 class12;
		try {
		    anInt2087++;
		    Class12 class12_3_
			= (Class12) Class14_Sub14.aClass52_2982
					.method1210((byte) 68, (long) arg0);
		    if (class12_3_ == null)
			break;
		    class12 = class12_3_;
		} catch (RuntimeException runtimeexception) {
		    break while_1134_;
		}
		return class12;
	    } while (false);
	    Class12 class12;
	    try {
		if (arg1 != 170)
		    anIntArray2094 = null;
		byte[] is
		    = (Class108.aClass9_1817.method163
		       (Class55.method1229(arg0, 122),
			Class153.method2045(arg0, arg1 ^ ~0x63e7ad2), 0));
		Class12 class12_4_ = new Class12();
		class12_4_.anInt337 = arg0;
		if (null != is)
		    class12_4_.method220(new Class14_Sub10(is), true);
		class12_4_.method223((byte) 126);
		Class14_Sub14.aClass52_2982.method1205((byte) -93, class12_4_,
						       (long) arg0);
		class12 = class12_4_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class12;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ta.F(" + arg0 + ',' + arg1 + ')');
    }
    
    public abstract byte[] method1745(byte i);
    
    public static void method1746(int arg0) {
    while_1136_:
	do {
	while_1135_:
	    do {
		do {
		    try {
			aLongArray2095 = null;
			if (arg0 == 255)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1135_;
		    }
		    return;
		} while (false);
		try {
		    aClass2_2093 = null;
		    anIntArray2094 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1136_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ta.E(" + arg0 + ')');
	} while (false);
    }
    
    public static Class148[] method1747(int arg0, int arg1, int arg2,
					Class9 arg3) {
    while_1137_:
	do {
	    do {
		Class148[] class148s;
		try {
		    if (arg2 != 229)
			anIntArray2094 = null;
		    anInt2090++;
		    if (Class109.method1564(-2, arg0, arg1, arg3))
			break;
		    class148s = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1137_;
		}
		return class148s;
	    } while (false);
	    Class148[] class148s;
	    try {
		class148s = Class14_Sub2_Sub19.method392(120);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148s;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ta.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
}
