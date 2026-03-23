/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class127
{
    public int anInt2096;
    public int anInt2097;
    public byte[] aByteArray2098;
    public int anInt2099;
    public int anInt2100;
    public static int anInt2101;
    public static int anInt2102;
    public int anInt2103;
    public static int anInt2104;
    public static volatile int anInt2105 = 0;
    public int anInt2106;
    public static int anInt2107;
    public int anInt2108;
    public byte[] aByteArray2109;
    public static int anInt2110;
    public static Class9_Sub1 aClass9_Sub1_2111;
    public static Class52 aClass52_2112 = new Class52(64);
    public static Class124 aClass124_2113;
    public static Class94 aClass94_2114 = null;
    public static int anInt2115;
    public static Class124 aClass124_2116
	= Class14_Sub2_Sub2.method263(1178, "flash2:");
    public static Class124 aClass124_2117;
    public static int anInt2118;
    
    public static void method1748(int arg0, int arg1, int arg2, int arg3,
				  Class133 arg4, Class133 arg5, int arg6,
				  int arg7, int arg8, int arg9, long arg10) {
	if (arg4 != null) {
	    Class37 class37 = new Class37();
	    class37.aLong634 = arg10;
	    class37.anInt653 = arg1 * 128 + 64;
	    class37.anInt633 = arg2 * 128 + 64;
	    class37.anInt650 = arg3;
	    class37.aClass133_642 = arg4;
	    class37.aClass133_638 = arg5;
	    class37.anInt649 = arg6;
	    class37.anInt647 = arg7;
	    class37.anInt641 = arg8;
	    class37.anInt646 = arg9;
	    for (int i = arg0; i >= 0; i--) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg1]
		     [arg2])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[arg1][arg2]
			= new Class14_Sub29(i, arg1, arg2);
	    }
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass37_3255
		= class37;
	}
    }
    
    public static Class60 method1749(int arg0, byte arg1) {
    while_1138_:
	do {
	    do {
		Class60 class60;
		try {
		    anInt2115++;
		    Class60 class60_0_
			= ((Class60)
			   Class9.aClass52_236.method1210((byte) 70,
							  (long) arg0));
		    if (null == class60_0_)
			break;
		    class60 = class60_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1138_;
		}
		return class60;
	    } while (false);
	    Class60 class60;
	    try {
		byte[] is = (Class14_Sub8_Sub15.aClass9_4338.method163
			     (Class79.method1378(arg0, 5823),
			      Class131.method1773(arg0, (byte) -124), 0));
		Class60 class60_1_ = new Class60();
		class60_1_.anInt962 = arg0;
		if (is != null)
		    class60_1_.method1268(0, new Class14_Sub10(is));
		Class9.aClass52_236.method1205((byte) -93, class60_1_,
					       (long) arg0);
		int i = -57 / ((-65 - arg1) / 39);
		class60 = class60_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class60;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tb.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public static Class124 method1750(Class124 arg0, byte arg1) {
    while_1139_:
	do {
	    int i;
	    do {
		Class124 class124;
		try {
		    int i_2_ = -36 % ((arg1 - -25) / 60);
		    i = Class14_Sub8_Sub13.method546(arg0, -23861);
		    anInt2110++;
		    if ((i ^ 0xffffffff) != 0)
			break;
		    class124 = Class14.aClass124_364;
		} catch (RuntimeException runtimeexception) {
		    break while_1139_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class152.aClass146_2435.aClass124Array2362[i];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("tb.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1751(int arg0, byte arg1, int arg2, int arg3,
				  int arg4) {
    while_1141_:
	do {
	while_1140_:
	    do {
		int i;
		int i_3_;
		int i_4_;
		int i_5_;
		do {
		    try {
			i = arg4;
			i_3_ = -arg4;
			anInt2101++;
			int i_6_
			    = Class67.method1301((byte) -118, arg2 - -arg4,
						 Class118.anInt1982,
						 Class14_Sub8_Sub14.anInt4327);
			i_4_ = 0;
			int i_7_
			    = Class67.method1301((byte) 65, arg2 - arg4,
						 Class118.anInt1982,
						 Class14_Sub8_Sub14.anInt4327);
			Class51.method1201((Class14_Sub2_Sub19
					    .anIntArrayArray4038[arg3]),
					   i_7_, i_6_, -5973, arg0);
			i_5_ = -1;
			if (arg1 <= -64)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1140_;
		    }
		    return;
		} while (false);
		try {
		    while (i > i_4_) {
			i_5_ += 2;
			i_3_ += i_5_;
			if ((i_3_ ^ 0xffffffff) < -1) {
			    i--;
			    int i_8_ = arg3 - -i;
			    i_3_ -= i << -740843999;
			    int i_9_ = arg3 - i;
			    if (Class14_Sub17.anInt3005 <= i_8_
				&& ((Class59.anInt955 ^ 0xffffffff)
				    <= (i_9_ ^ 0xffffffff))) {
				int i_10_
				    = Class67.method1301((byte) -101,
							 arg2 + i_4_,
							 Class118.anInt1982,
							 (Class14_Sub8_Sub14
							  .anInt4327));
				int i_11_
				    = Class67.method1301((byte) -93,
							 -i_4_ + arg2,
							 Class118.anInt1982,
							 (Class14_Sub8_Sub14
							  .anInt4327));
				if ((Class59.anInt955 ^ 0xffffffff)
				    <= (i_8_ ^ 0xffffffff))
				    Class51.method1201((Class14_Sub2_Sub19
							.anIntArrayArray4038
							[i_8_]),
						       i_11_, i_10_, -5973,
						       arg0);
				if (Class14_Sub17.anInt3005 <= i_9_)
				    Class51.method1201((Class14_Sub2_Sub19
							.anIntArrayArray4038
							[i_9_]),
						       i_11_, i_10_, -5973,
						       arg0);
			    }
			}
			int i_12_ = -++i_4_ + arg3;
			int i_13_ = arg3 - -i_4_;
			if ((i_13_ ^ 0xffffffff) <= (Class14_Sub17.anInt3005
						     ^ 0xffffffff)
			    && i_12_ <= Class59.anInt955) {
			    int i_14_ = Class67.method1301((byte) 57, i + arg2,
							   Class118.anInt1982,
							   (Class14_Sub8_Sub14
							    .anInt4327));
			    int i_15_
				= Class67.method1301((byte) -127, -i + arg2,
						     Class118.anInt1982,
						     (Class14_Sub8_Sub14
						      .anInt4327));
			    if (Class59.anInt955 >= i_13_)
				Class51.method1201((Class14_Sub2_Sub19
						    .anIntArrayArray4038
						    [i_13_]),
						   i_15_, i_14_, -5973, arg0);
			    if (i_12_ >= Class14_Sub17.anInt3005)
				Class51.method1201((Class14_Sub2_Sub19
						    .anIntArrayArray4038
						    [i_12_]),
						   i_15_, i_14_, -5973, arg0);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1141_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("tb.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public static Class148_Sub1 method1752(int arg0, Class9 arg1, boolean arg2,
					   int arg3) {
    while_1142_:
	do {
	    do {
		Class148_Sub1 class148_sub1;
		try {
		    if (arg2 != true)
			method1750(null, (byte) 88);
		    anInt2107++;
		    if (Class109.method1564(-2, arg0, arg3, arg1))
			break;
		    class148_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1142_;
		}
		return class148_sub1;
	    } while (false);
	    Class148_Sub1 class148_sub1;
	    try {
		class148_sub1 = Class22.method985(-90);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("tb.F(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ')'));
    }
    
    public static void method1753(boolean arg0) {
	try {
	    aClass94_2114 = null;
	    aClass52_2112 = null;
	    if (arg0)
		method1748(-93, 123, -15, 22, null, null, 82, 104, 38, -95,
			   79L);
	    aClass124_2117 = null;
	    aClass124_2113 = null;
	    aClass9_Sub1_2111 = null;
	    aClass124_2116 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "tb.E(" + arg0 + ')');
	}
    }
    
    public static boolean method1754(int arg0, int arg1) {
    while_1143_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2102++;
		    if (arg0 != 128)
			method1753(true);
		    if (-1 >= (arg1 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1143_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    int i = Class14_Sub29.aShortArray3262[arg1];
		    if (i >= 2000)
			i -= 2000;
		    if ((i ^ 0xffffffff) != -1008)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1143_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "tb.G(" + arg0 + ',' + arg1 + ')');
    }
    
    static {
	aClass124_2113 = aClass124_2116;
	anInt2118 = -1;
	aClass124_2117 = aClass124_2116;
    }
}
