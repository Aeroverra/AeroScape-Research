/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class21
{
    public static int[] anIntArray437;
    public static int anInt438;
    public static int anInt439;
    public static int anInt440;
    public static Class36 aClass36_441;
    public static int[] anIntArray442;
    public static int anInt443;
    public static Class52 aClass52_444 = new Class52(64);
    public short[] aShortArray445;
    public int anInt446 = -1;
    public int[] anIntArray447 = { -1, -1, -1, -1, -1 };
    public static int anInt448;
    public boolean aBoolean449 = false;
    public short[] aShortArray450;
    public static int anInt451;
    public static int[][] anIntArrayArray452
	= { new int[0], { 128, 0, 128, 128, 0, 128 },
	    { 0, 0, 128, 0, 128, 128, 64, 128 },
	    { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 },
	    { 128, 128, 64, 128, 128, 0 },
	    { 64, 0, 128, 0, 128, 128, 64, 128 },
	    { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
	    { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 },
	    { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
	    { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };
    public short[] aShortArray453;
    public static int anInt454;
    public short[] aShortArray455;
    public static int anInt456;
    public int[] anIntArray457;
    
    public static Class94 method975(Class94 arg0, boolean arg1) {
    while_646_:
	do {
	    do {
		Class94 class94;
		try {
		    anInt439++;
		    if (-1 == arg0.anInt1540)
			break;
		    class94 = Class55.method1233(arg0.anInt1540, 21803);
		} catch (RuntimeException runtimeexception) {
		    break while_646_;
		}
		return class94;
	    } while (false);
	    int i;
	    do {
		Class94 class94;
		try {
		    i = arg0.anInt1548 >>> -2121508944;
		    if (!arg1)
			break;
		    class94 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_646_;
		}
		return class94;
	    } while (false);
	    Class14_Sub15 class14_sub15;
	    try {
		class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
						    .method1228((byte) -72);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (null != class14_sub15) {
		if ((class14_sub15.anInt2999 ^ 0xffffffff) == (i ^ 0xffffffff))
		    return Class55.method1233((int) class14_sub15.aLong355,
					      21803);
		try {
		    class14_sub15
			= ((Class14_Sub15)
			   Class14_Sub30.aClass55_3275.method1227((byte) -23));
		} catch (RuntimeException runtimeexception) {
		    break while_646_;
		}
	    }
	    return null;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("cg.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public void method976(Class14_Sub10 arg0, int arg1, int arg2) {
	try {
	    anInt454++;
	    if (arg2 != -71)
		method980(78, null);
	    if (-2 == (arg1 ^ 0xffffffff))
		anInt446 = arg0.method798(115);
	    else if (arg1 == 2) {
		int i = arg0.method798(87);
		anIntArray457 = new int[i];
		for (int i_0_ = 0; i_0_ < i; i_0_++)
		    anIntArray457[i_0_] = arg0.method784((byte) 118);
	    } else if ((arg1 ^ 0xffffffff) != -4) {
		if (40 == arg1) {
		    int i = arg0.method798(85);
		    aShortArray445 = new short[i];
		    aShortArray450 = new short[i];
		    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > (i ^ 0xffffffff);
			 i_1_++) {
			aShortArray445[i_1_]
			    = (short) arg0.method784((byte) 116);
			aShortArray450[i_1_]
			    = (short) arg0.method784((byte) 103);
		    }
		} else if ((arg1 ^ 0xffffffff) == -42) {
		    int i = arg0.method798(123);
		    aShortArray453 = new short[i];
		    aShortArray455 = new short[i];
		    for (int i_2_ = 0; (i ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
			 i_2_++) {
			aShortArray453[i_2_]
			    = (short) arg0.method784((byte) 113);
			aShortArray455[i_2_]
			    = (short) arg0.method784((byte) 122);
		    }
		} else if (arg1 >= 60 && (arg1 ^ 0xffffffff) > -71)
		    anIntArray447[-60 + arg1] = arg0.method784((byte) 107);
	    } else
		aBoolean449 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cg.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public Class133_Sub2 method977(byte arg0) {
	Class133_Sub2 class133_sub2;
	try {
	    anInt451++;
	    Class133_Sub2[] class133_sub2s = new Class133_Sub2[5];
	    int i = 0;
	    for (int i_3_ = 0; 5 > i_3_; i_3_++) {
		if ((anIntArray447[i_3_] ^ 0xffffffff) != 0)
		    class133_sub2s[i++]
			= Class133_Sub2.method1824((Class14_Sub2_Sub8
						    .aClass9_3848),
						   anIntArray447[i_3_], 0);
	    }
	    if (arg0 != 61)
		method977((byte) 61);
	    Class133_Sub2 class133_sub2_4_
		= new Class133_Sub2(class133_sub2s, i);
	    if (null != aShortArray445) {
		for (int i_5_ = 0; i_5_ < aShortArray445.length; i_5_++)
		    class133_sub2_4_.method1813(aShortArray445[i_5_],
						aShortArray450[i_5_]);
	    }
	    if (null != aShortArray453) {
		for (int i_6_ = 0; aShortArray453.length > i_6_; i_6_++)
		    class133_sub2_4_.method1819(aShortArray453[i_6_],
						aShortArray455[i_6_]);
	    }
	    class133_sub2 = class133_sub2_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cg.G(" + arg0 + ')');
	}
	return class133_sub2;
    }
    
    public static Class88[] method978(int arg0) {
	Class88[] class88s;
	try {
	    anInt438++;
	    int i = 63 / ((0 - arg0) / 39);
	    if (null == Class76.aClass88Array1211) {
		Class88[] class88s_7_
		    = Class14_Sub18
			  .method884(-3189, Class14_Sub8_Sub34.aClass43_4647);
		Class88[] class88s_8_ = new Class88[class88s_7_.length];
		int i_9_ = 0;
	    while_648_:
		for (int i_10_ = 0;
		     (i_10_ ^ 0xffffffff) > (class88s_7_.length ^ 0xffffffff);
		     i_10_++) {
		    Class88 class88 = class88s_7_[i_10_];
		    if (((class88.anInt1402 ^ 0xffffffff) >= -1
			 || (class88.anInt1402 ^ 0xffffffff) <= -25)
			&& class88.anInt1396 >= 800
			&& class88.anInt1397 >= 600) {
			for (int i_11_ = 0; i_11_ < i_9_; i_11_++) {
			    Class88 class88_12_ = class88s_8_[i_11_];
			    if (((class88.anInt1396 ^ 0xffffffff)
				 == (class88_12_.anInt1396 ^ 0xffffffff))
				&& ((class88.anInt1397 ^ 0xffffffff)
				    == (class88_12_.anInt1397 ^ 0xffffffff))) {
				if ((class88_12_.anInt1402 ^ 0xffffffff)
				    > (class88.anInt1402 ^ 0xffffffff))
				    class88s_8_[i_11_] = class88;
				continue while_648_;
			    }
			}
			class88s_8_[i_9_] = class88;
			i_9_++;
		    }
		}
		Class76.aClass88Array1211 = new Class88[i_9_];
		Class72.method1320(class88s_8_, 0, Class76.aClass88Array1211,
				   0, i_9_);
		int[] is = new int[Class76.aClass88Array1211.length];
		for (int i_13_ = 0; i_13_ < Class76.aClass88Array1211.length;
		     i_13_++) {
		    Class88 class88 = Class76.aClass88Array1211[i_13_];
		    is[i_13_] = class88.anInt1397 * class88.anInt1396;
		}
		Class114.method1586(is, Class76.aClass88Array1211, (byte) 122);
	    }
	    class88s = Class76.aClass88Array1211;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cg.F(" + arg0 + ')');
	}
	return class88s;
    }
    
    public static void method979(int arg0) {
	try {
	    aClass52_444 = null;
	    aClass36_441 = null;
	    anIntArray437 = null;
	    anIntArrayArray452 = null;
	    anIntArray442 = null;
	    int i = -8 / ((-18 - arg0) / 38);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cg.I(" + arg0 + ')');
	}
    }
    
    public void method980(int arg0, Class14_Sub10 arg1) {
	try {
	    for (;;) {
		int i = arg1.method798(arg0 + 29580);
		if (i == 0)
		    break;
		method976(arg1, i, arg0 + 29431);
	    }
	    anInt443++;
	    if (arg0 != -29502)
		anInt446 = 124;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cg.H(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class133_Sub2 method981(byte arg0) {
    while_649_:
	do {
	    do {
		Class133_Sub2 class133_sub2;
		try {
		    anInt456++;
		    if (anIntArray457 != null)
			break;
		    class133_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_649_;
		}
		return class133_sub2;
	    } while (false);
	    Class133_Sub2[] class133_sub2s;
	    do {
		Class133_Sub2 class133_sub2;
		try {
		    class133_sub2s = new Class133_Sub2[anIntArray457.length];
		    for (int i = 0; ((anIntArray457.length ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++)
			class133_sub2s[i]
			    = Class133_Sub2.method1824((Class14_Sub2_Sub8
							.aClass9_3848),
						       anIntArray457[i], 0);
		    if (arg0 == -47)
			break;
		    class133_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_649_;
		}
		return class133_sub2;
	    } while (false);
	    Class133_Sub2 class133_sub2;
	    try {
		Class133_Sub2 class133_sub2_14_;
		if (class133_sub2s.length == 1)
		    class133_sub2_14_ = class133_sub2s[0];
		else
		    class133_sub2_14_
			= new Class133_Sub2(class133_sub2s,
					    class133_sub2s.length);
		if (null != aShortArray445) {
		    for (int i = 0; ((aShortArray445.length ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++)
			class133_sub2_14_.method1813(aShortArray445[i],
						     aShortArray450[i]);
		}
		if (aShortArray453 != null) {
		    for (int i = 0; ((aShortArray453.length ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++)
			class133_sub2_14_.method1819(aShortArray453[i],
						     aShortArray455[i]);
		}
		class133_sub2 = class133_sub2_14_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "cg.D(" + arg0 + ')');
    }
    
    public boolean method982(boolean arg0) {
    while_650_:
	do {
	    do {
		boolean bool;
		try {
		    anInt448++;
		    if (null != anIntArray457)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_650_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		if (arg0)
		    aClass52_444 = null;
		boolean bool_15_ = true;
		for (int i = 0;
		     (i ^ 0xffffffff) > (anIntArray457.length ^ 0xffffffff);
		     i++) {
		    if (!Class14_Sub2_Sub8.aClass9_3848
			     .method158(0, anIntArray457[i], (byte) 124))
			bool_15_ = false;
		}
		bool = bool_15_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "cg.E(" + arg0 + ')');
    }
    
    public boolean method983(boolean arg0) {
	boolean bool;
	try {
	    boolean bool_16_ = true;
	    for (int i = 0; i < 5; i++) {
		if ((anIntArray447[i] ^ 0xffffffff) != 0
		    && !Class14_Sub2_Sub8.aClass9_3848
			    .method158(0, anIntArray447[i], (byte) 74))
		    bool_16_ = false;
	    }
	    if (arg0)
		anIntArray437 = null;
	    anInt440++;
	    bool = bool_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cg.A(" + arg0 + ')');
	}
	return bool;
    }
}
