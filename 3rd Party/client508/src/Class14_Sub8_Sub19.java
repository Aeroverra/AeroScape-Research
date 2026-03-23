/* Class14_Sub8_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub19 extends Class14_Sub8
{
    public int anInt4399;
    public static int anInt4400;
    public static int anInt4401;
    public static int anInt4402;
    public static int anInt4403;
    public static Class2 aClass2_4404;
    public static int anInt4405;
    public static int anInt4406;
    public static int anInt4407;
    public static int anInt4408 = 0;
    public static Class124 aClass124_4409;
    public int anInt4410;
    public static int anInt4411;
    public static Class124 aClass124_4412
	= Class14_Sub2_Sub2.method263(1178, "Zugewiesener Speicher)3");
    public int anInt4413 = -1;
    public int[] anIntArray4414;
    
    public Class14_Sub8_Sub19() {
	super(0, false);
    }
    
    public boolean method577(int arg0) {
    while_402_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4401++;
		    if (anIntArray4414 == null)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_402_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (0 > anInt4413)
			break;
		    int i = Class112.anInt1876;
		    int i_0_ = Class17.anInt407;
		    int i_1_
			= (Class14_Sub13.anInterface3_2960.method15(1,
								    anInt4413)
			   ? 64 : 128);
		    anIntArray4414
			= Class14_Sub13.anInterface3_2960.method17(-16210,
								   anInt4413);
		    anInt4399 = i_1_;
		    anInt4410 = i_1_;
		    Class38.method1117(0, i_0_, i);
		    bool = anIntArray4414 != null;
		} catch (RuntimeException runtimeexception) {
		    break while_402_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		if (arg0 < 91)
		    method474(-30, 4);
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "kj.Q(" + arg0 + ')');
    }
    
    public static long method578(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null || class14_sub29.aClass4_3237 == null)
	    return 0L;
	return class14_sub29.aClass4_3237.aLong132;
    }
    
    public static void method579(byte arg0) {
	try {
	    aClass124_4412 = null;
	    aClass2_4404 = null;
	    aClass124_4409 = null;
	    int i = -63 % ((57 - arg0) / 36);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kj.R(" + arg0 + ')');
	}
    }
    
    public void method478(int arg0) {
	try {
	    anInt4406++;
	    super.method478(arg0);
	    anIntArray4414 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kj.U(" + arg0 + ')');
	}
    }
    
    public static boolean method580
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, Class133 arg8, int arg9, boolean arg10, long arg11) {
	boolean bool = (Class114.anIntArrayArrayArray1896
			== Class150.anIntArrayArrayArray2419);
	int i = 0;
	for (int i_2_ = arg1; i_2_ < arg1 + arg3; i_2_++) {
	    for (int i_3_ = arg2; i_3_ < arg2 + arg4; i_3_++) {
		if (i_2_ < 0 || i_3_ < 0 || i_2_ >= Class99_Sub2.anInt3338
		    || i_3_ >= Class14_Sub8_Sub15.anInt4337)
		    return false;
		Class14_Sub29 class14_sub29
		    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0]
		       [i_2_][i_3_]);
		if (class14_sub29 != null && class14_sub29.anInt3242 >= 5)
		    return false;
	    }
	}
	Class40 class40 = new Class40();
	class40.aLong677 = arg11;
	class40.anInt672 = arg0;
	class40.anInt667 = arg5;
	class40.anInt666 = arg6;
	class40.anInt671 = arg7;
	class40.aClass133_679 = arg8;
	class40.anInt663 = arg9;
	class40.anInt668 = arg1;
	class40.anInt678 = arg2;
	class40.anInt670 = arg1 + arg3 - 1;
	class40.anInt669 = arg2 + arg4 - 1;
	for (int i_4_ = arg1; i_4_ < arg1 + arg3; i_4_++) {
	    for (int i_5_ = arg2; i_5_ < arg2 + arg4; i_5_++) {
		int i_6_ = 0;
		if (i_4_ > arg1)
		    i_6_++;
		if (i_4_ < arg1 + arg3 - 1)
		    i_6_ += 4;
		if (i_5_ > arg2)
		    i_6_ += 8;
		if (i_5_ < arg2 + arg4 - 1)
		    i_6_ += 2;
		for (int i_7_ = arg0; i_7_ >= 0; i_7_--) {
		    if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_7_]
			 [i_4_][i_5_])
			== null)
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368
			    [i_7_][i_4_][i_5_]
			    = new Class14_Sub29(i_7_, i_4_, i_5_);
		}
		Class14_Sub29 class14_sub29
		    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0]
		       [i_4_][i_5_]);
		class14_sub29.aClass40Array3257[class14_sub29.anInt3242]
		    = class40;
		class14_sub29.anIntArray3247[class14_sub29.anInt3242] = i_6_;
		class14_sub29.anInt3249 |= i_6_;
		class14_sub29.anInt3242++;
		if (bool && Class14_Sub5.anIntArrayArray2799[i_4_][i_5_] != 0)
		    i = Class14_Sub5.anIntArrayArray2799[i_4_][i_5_];
	    }
	}
	if (bool && i != 0) {
	    for (int i_8_ = arg1; i_8_ < arg1 + arg3; i_8_++) {
		for (int i_9_ = arg2; i_9_ < arg2 + arg4; i_9_++) {
		    if (Class14_Sub5.anIntArrayArray2799[i_8_][i_9_] == 0)
			Class14_Sub5.anIntArrayArray2799[i_8_][i_9_] = i;
		}
	    }
	}
	if (arg10)
	    Class14_Sub20.aClass40Array3093[Class14_Sub8_Sub38.anInt4727++]
		= class40;
	return true;
    }
    
    public int method479(byte arg0) {
	int i;
	try {
	    anInt4403++;
	    if (arg0 < 38)
		anInt4410 = 15;
	    i = anInt4413;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kj.S(" + arg0 + ')');
	}
	return i;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    if ((arg0 ^ 0xffffffff) == -1)
		anInt4413 = arg2.method784((byte) 110);
	    anInt4411++;
	    if (arg1 != 24777)
		method582((byte) 116, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kj.F(" + arg0 + ',' + arg1
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
		aClass124_4412 = null;
	    anInt4405++;
	    int[][] is_10_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628 && method577(110)) {
		int[] is_11_ = is_10_[0];
		int[] is_12_ = is_10_[1];
		int i = anInt4399 * (Class17.anInt407 == anInt4410 ? arg0
				     : anInt4410 * arg0 / Class17.anInt407);
		int[] is_13_ = is_10_[2];
		if ((anInt4399 ^ 0xffffffff)
		    != (Class112.anInt1876 ^ 0xffffffff)) {
		    for (int i_14_ = 0; i_14_ < Class112.anInt1876; i_14_++) {
			int i_15_ = anInt4399 * i_14_ / Class112.anInt1876;
			int i_16_ = anIntArray4414[i + i_15_];
			is_13_[i_14_]
			    = (Class14_Sub8_Sub26.method617(255, i_16_)
			       << -1168916476);
			is_12_[i_14_]
			    = Class14_Sub8_Sub26.method617(i_16_ >> 631338020,
							   4080);
			is_11_[i_14_]
			    = Class14_Sub8_Sub26
				  .method617(4080, i_16_ >> -2100863668);
		    }
		} else {
		    for (int i_17_ = 0; ((Class112.anInt1876 ^ 0xffffffff)
					 < (i_17_ ^ 0xffffffff)); i_17_++) {
			int i_18_ = anIntArray4414[i++];
			is_13_[i_17_]
			    = (Class14_Sub8_Sub26.method617(i_18_, 255)
			       << -286719420);
			is_12_[i_17_]
			    = Class14_Sub8_Sub26
				  .method617(i_18_ >> -2046636764, 4080);
			is_11_[i_17_]
			    = (Class14_Sub8_Sub26.method617(16711680, i_18_)
			       >> -901660884);
		    }
		}
	    }
	    is = is_10_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kj.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method581(Class9 arg0, boolean arg1, Class9 arg2) {
    while_404_:
	do {
	while_403_:
	    do {
		do {
		    try {
			Class14_Sub5.aClass9_2792 = arg0;
			if (!arg1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_403_;
		    }
		    return;
		} while (false);
		try {
		    anInt4402++;
		    Class14_Sub2_Sub8.aClass9_3848 = arg2;
		    Class38.anInt2617
			= Class14_Sub5.aClass9_2792.method177(3, 13537);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_404_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("kj.P("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method582(byte arg0, Class94 arg1) {
	try {
	    if (arg0 != -124)
		aClass124_4409 = null;
	    anInt4400++;
	    Class94 class94 = Class21.method975(arg1, false);
	    int i;
	    int i_19_;
	    if (null == class94) {
		i_19_ = Class14_Sub20.anInt3094;
		i = Class83.anInt1340;
	    } else {
		i = class94.anInt1518;
		i_19_ = class94.anInt1545;
	    }
	    Class14_Sub21.method894(arg1, 1, false, i, i_19_);
	    Class118.method1607(1, i_19_, i, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kj.T(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_4409 = Class14_Sub2_Sub2.method263(1178, ")2");
	aClass2_4404 = new Class2();
    }
}
