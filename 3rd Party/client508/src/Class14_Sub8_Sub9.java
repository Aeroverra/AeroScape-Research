/* Class14_Sub8_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub9 extends Class14_Sub8
{
    public int anInt4225 = 2048;
    public int anInt4226 = 3072;
    public static Class55 aClass55_4227 = new Class55(4096);
    public static int anInt4228;
    public static int anInt4229;
    public int anInt4230 = 1024;
    public static int anInt4231;
    public static int anInt4232;
    public static long[] aLongArray4233 = new long[32];
    public static int anInt4234;
    public static int anInt4235;
    public static int anInt4236;
    public static int anInt4237;
    public static int anInt4238;
    public static Class141 aClass141_4239 = new Class141();
    public static Class52 aClass52_4240 = new Class52(64);
    public static Class124 aClass124_4241;
    public static Class124 aClass124_4242;
    public static int anInt4243 = 0;
    public static Class124 aClass124_4244
	= Class14_Sub2_Sub2.method263(1178, "");
    
    public static void method520(int arg0, long arg1) {
    while_340_:
	do {
	while_339_:
	    do {
		do {
		    try {
			anInt4236++;
			if (-1L != (arg1 ^ 0xffffffffffffffffL))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_339_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg0 == 1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_339_;
		    }
		    return;
		} while (false);
		try {
		    for (int i = 0; Class42.anInt698 > i; i++) {
			if ((arg1 ^ 0xffffffffffffffffL)
			    == (Class126.aLongArray2095[i]
				^ 0xffffffffffffffffL)) {
			    Class114.anInt1891++;
			    Class42.anInt698--;
			    for (int i_0_ = i;
				 ((i_0_ ^ 0xffffffff)
				  > (Class42.anInt698 ^ 0xffffffff));
				 i_0_++) {
				Class126.aLongArray2095[i_0_]
				    = Class126.aLongArray2095[1 + i_0_];
				client.aClass124Array2645[i_0_]
				    = client.aClass124Array2645[1 + i_0_];
			    }
			    Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 2);
			    Class55.aClass14_Sub10_Sub1_891.method817(arg1,
								      91);
			    break;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_340_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ga.G(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static boolean method521(byte arg0, int arg1) {
    while_341_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4228++;
		    if (arg0 == 77)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_341_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = -1 != ((0x10236d & arg1) >> 56800372 ^ 0xffffffff);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ga.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method522(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
    while_343_:
	do {
	while_342_:
	    do {
		int i;
		int i_1_;
		do {
		    try {
			anInt4234++;
			i = Class67.method1301((byte) -122, arg0,
					       Class14_Sub17.anInt3005,
					       Class59.anInt955);
			i_1_ = Class67.method1301((byte) 116, arg4,
						  Class14_Sub17.anInt3005,
						  Class59.anInt955);
			if (arg5 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_342_;
		    }
		    return;
		} while (false);
		try {
		    int i_2_
			= Class67.method1301((byte) -95, arg2,
					     Class118.anInt1982,
					     Class14_Sub8_Sub14.anInt4327);
		    int i_3_
			= Class67.method1301((byte) 40, arg6,
					     Class118.anInt1982,
					     Class14_Sub8_Sub14.anInt4327);
		    int i_4_ = Class67.method1301((byte) -124, arg7 + arg0,
						  Class14_Sub17.anInt3005,
						  Class59.anInt955);
		    int i_5_ = Class67.method1301((byte) 106, arg4 - arg7,
						  Class14_Sub17.anInt3005,
						  Class59.anInt955);
		    for (int i_6_ = i; i_4_ > i_6_; i_6_++)
			Class51.method1201((Class14_Sub2_Sub19
					    .anIntArrayArray4038[i_6_]),
					   i_2_, i_3_, arg5 ^ ~0x1754, arg3);
		    for (int i_7_ = i_1_; i_7_ > i_5_; i_7_--)
			Class51.method1201((Class14_Sub2_Sub19
					    .anIntArrayArray4038[i_7_]),
					   i_2_, i_3_, arg5 + -5973, arg3);
		    int i_8_
			= Class67.method1301((byte) 67, arg7 + arg2,
					     Class118.anInt1982,
					     Class14_Sub8_Sub14.anInt4327);
		    int i_9_
			= Class67.method1301((byte) -74, arg6 - arg7,
					     Class118.anInt1982,
					     Class14_Sub8_Sub14.anInt4327);
		    for (int i_10_ = i_4_;
			 (i_10_ ^ 0xffffffff) >= (i_5_ ^ 0xffffffff);
			 i_10_++) {
			int[] is
			    = Class14_Sub2_Sub19.anIntArrayArray4038[i_10_];
			Class51.method1201(is, i_2_, i_8_, arg5 + -5973, arg3);
			Class51.method1201(is, i_8_, i_9_, arg5 ^ ~0x1754,
					   arg1);
			Class51.method1201(is, i_9_, i_3_, -5973, arg3);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_343_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ga.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	} while (false);
    }
    
    public static Class125_Sub4 method523(Class14_Sub10 arg0, byte arg1) {
	Class125_Sub4 class125_sub4;
	try {
	    if (arg1 >= -17)
		aClass52_4240 = null;
	    anInt4237++;
	    class125_sub4
		= new Class125_Sub4(arg0.method805(0), arg0.method805(0),
				    arg0.method805(0), arg0.method805(0),
				    arg0.method829(46), arg0.method829(-119),
				    arg0.method798(-74));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ga.J("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class125_sub4;
    }
    
    public void method472(int arg0) {
	try {
	    if (arg0 != 0)
		method523(null, (byte) -53);
	    anInt4235++;
	    anInt4225 = -anInt4230 + anInt4226;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ga.I(" + arg0 + ')');
	}
    }
    
    public static void method524(int arg0) {
    while_345_:
	do {
	while_344_:
	    do {
		do {
		    try {
			aClass124_4242 = null;
			if (arg0 == 56800372)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_344_;
		    }
		    return;
		} while (false);
		try {
		    aLongArray4233 = null;
		    aClass141_4239 = null;
		    aClass124_4244 = null;
		    aClass52_4240 = null;
		    aClass124_4241 = null;
		    aClass55_4227 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_345_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ga.B(" + arg0 + ')');
	} while (false);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_346_:
	    do {
		do {
		    if (0 != i) {
			if (1 != i) {
			    if (-3 == (i ^ 0xffffffff))
				break;
			    break while_346_;
			}
		    } else {
			anInt4230 = arg2.method784((byte) 119);
			break while_346_;
		    }
		    anInt4226 = arg2.method784((byte) 123);
		    break while_346_;
		} while (false);
		aBoolean2862 = -2 == (arg2.method798(-65) ^ 0xffffffff);
	    } while (false);
	    if (arg1 != 24777)
		aClass141_4239 = null;
	    anInt4238++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ga.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class14_Sub8_Sub9() {
	super(1, false);
    }
    
    public static void method525(Class124[] arg0, int arg1, int arg2, int arg3,
				 short[] arg4) {
	try {
	    if (arg1 != -25279)
		anInt4243 = -24;
	    if (arg3 < arg2) {
		int i = arg3;
		int i_11_ = (arg3 - -arg2) / 2;
		Class124 class124 = arg0[i_11_];
		arg0[i_11_] = arg0[arg2];
		arg0[arg2] = class124;
		short i_12_ = arg4[i_11_];
		arg4[i_11_] = arg4[arg2];
		arg4[arg2] = i_12_;
		for (int i_13_ = arg3;
		     (i_13_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_13_++) {
		    if (class124 == null
			|| (arg0[i_13_] != null
			    && (arg0[i_13_].method1698((byte) 86, class124)
				< (0x1 & i_13_)))) {
			Class124 class124_14_ = arg0[i_13_];
			arg0[i_13_] = arg0[i];
			arg0[i] = class124_14_;
			short i_15_ = arg4[i_13_];
			arg4[i_13_] = arg4[i];
			arg4[i++] = i_15_;
		    }
		}
		arg0[arg2] = arg0[i];
		arg0[i] = class124;
		arg4[arg2] = arg4[i];
		arg4[i] = i_12_;
		method525(arg0, arg1 ^ 0x0, -1 + i, arg3, arg4);
		method525(arg0, arg1 + 0, arg2, 1 + i, arg4);
	    }
	    anInt4231++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ga.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
    while_347_:
	do {
	    do {
		int[] is;
		try {
		    anInt4232++;
		    if (arg1 < -58)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_347_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int[] is_16_ = aClass149_2851.method2014(arg0, (byte) 112);
		if (aClass149_2851.aBoolean2402) {
		    int[] is_17_ = method483(0, (byte) -21, arg0);
		    for (int i = 0; Class112.anInt1876 > i; i++)
			is_16_[i]
			    = (anInt4225 * is_17_[i] >> 58809644) + anInt4230;
		}
		is = is_16_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ga.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt4229++;
	    int[][] is_18_ = aClass95_2838.method1481(1, arg0);
	    if (arg1 >= -4)
		aClass124_4244 = null;
	    if (aClass95_2838.aBoolean1628) {
		int[][] is_19_ = method480(0, 0, arg0);
		int[] is_20_ = is_19_[1];
		int[] is_21_ = is_19_[2];
		int[] is_22_ = is_18_[0];
		int[] is_23_ = is_18_[1];
		int[] is_24_ = is_19_[0];
		int[] is_25_ = is_18_[2];
		for (int i = 0; Class112.anInt1876 > i; i++) {
		    is_22_[i]
			= (is_24_[i] * anInt4225 >> -156113236) + anInt4230;
		    is_23_[i]
			= (anInt4225 * is_20_[i] >> -1220735156) + anInt4230;
		    is_25_[i]
			= (is_21_[i] * anInt4225 >> 1854927564) + anInt4230;
		}
	    }
	    is = is_18_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ga.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    static {
	aClass124_4242 = aClass124_4244;
	aClass124_4241 = aClass124_4244;
    }
}
