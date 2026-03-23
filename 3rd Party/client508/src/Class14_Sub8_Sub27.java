/* Class14_Sub8_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub27 extends Class14_Sub8
{
    public static int anInt4535;
    public static int anInt4536;
    public static int anInt4537;
    public static Class124 aClass124_4538;
    public static int anInt4539;
    public boolean aBoolean4540 = true;
    public static Class124 aClass124_4541;
    public static int anInt4542;
    public boolean aBoolean4543 = true;
    public static int[] anIntArray4544 = new int[500];
    public static Class124 aClass124_4545;
    public static Class81 aClass81_4546;
    public static int anInt4547;
    public static int anInt4548;
    public static Class124[] aClass124Array4549;
    public static int anInt4550;
    public static int anInt4551;
    public static Class124 aClass124_4552;
    
    public static void method621(byte arg0) {
	try {
	    Class14_Sub13.method859(0, 5);
	    anInt4551++;
	    Class4.method109(16, 5);
	    Class14_Sub8_Sub13.method548(5, 1);
	    Class140.method1957(true, 5);
	    Class118.method1606(123, 5);
	    Class14_Sub11.method851(1, 5);
	    int i = 116 % ((arg0 - 44) / 63);
	    Class41.method1130(5, 11300);
	    Class141.method1960(5, 74);
	    Class2.method88(true, 5);
	    Class53.method1215(-23980, 5);
	    Class7_Sub3.method131(5, -54);
	    Class133_Sub6.method1853(50, -32768);
	    Class14_Sub25.method915(5, 28091);
	    Class14_Sub30.method937(5, false);
	    Class14_Sub8_Sub30.aClass52_4596.method1208((byte) -112, 5);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pk.E(" + arg0 + ')');
	}
    }
    
    public static Class148 method622(int arg0, int arg1, Class9 arg2) {
    while_444_:
	do {
	    do {
		Class148 class148;
		try {
		    if (arg1 == 0)
			break;
		    class148 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_444_;
		}
		return class148;
	    } while (false);
	    do {
		Class148 class148;
		try {
		    anInt4542++;
		    if (Class26_Sub1.method1027(arg2, arg0, (byte) 100))
			break;
		    class148 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_444_;
		}
		return class148;
	    } while (false);
	    Class148 class148;
	    try {
		class148 = Class26.method1021((byte) 71);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pk.B(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method623(boolean arg0, Class14_Sub2_Sub16 arg1) {
	try {
	    anInt4537++;
	    if (arg0)
		anInt4550 = -16;
	    int i = Class14_Sub20.anInt3094;
	    int i_0_ = i * 956 / 503;
	    Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826
		.method389((Class83.anInt1340 + -i_0_) / 2, 0, i_0_, i);
	    Class133_Sub1_Sub1.aClass148_4915.method2001
		((Class83.anInt1340 / 2
		  + -(Class133_Sub1_Sub1.aClass148_4915.anInt2371 / 2)),
		 18);
	    arg1.method345(Class53.aClass124_869, Class83.anInt1340 / 2,
			   Class14_Sub20.anInt3094 / 2 - 26, 16777215, -1);
	    i = -18 + Class14_Sub20.anInt3094 / 2;
	    Class25.method1003(-152 + Class83.anInt1340 / 2, i, 304, 34,
			       9179409);
	    Class25.method1003(-151 + Class83.anInt1340 / 2, 1 + i, 302, 32,
			       0);
	    Class25.method1004(Class83.anInt1340 / 2 - 150, 2 + i,
			       3 * Class51.anInt828, 30, 9179409);
	    Class25.method1004((Class51.anInt828 * 3 + Class83.anInt1340 / 2
				- 150),
			       2 + i, 300 + -(3 * Class51.anInt828), 30, 0);
	    arg1.method345(Class14_Sub9_Sub1.aClass124_4761,
			   Class83.anInt1340 / 2,
			   Class14_Sub20.anInt3094 / 2 - -4, 16777215, -1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pk.G(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    if (arg1 > -4)
		method484(80, (byte) 47);
	    int[][] is_1_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628) {
		int[][] is_2_
		    = method480(0, 0, (aBoolean4540
				       ? -arg0 + Class115.anInt1927 : arg0));
		int[] is_3_ = is_2_[1];
		int[] is_4_ = is_2_[0];
		int[] is_5_ = is_2_[2];
		int[] is_6_ = is_1_[1];
		int[] is_7_ = is_1_[0];
		int[] is_8_ = is_1_[2];
		if (aBoolean4543) {
		    for (int i = 0; Class112.anInt1876 > i; i++) {
			is_7_[i] = is_4_[Class14_Sub10_Sub1.anInt4882 - i];
			is_6_[i] = is_3_[Class14_Sub10_Sub1.anInt4882 + -i];
			is_8_[i] = is_5_[Class14_Sub10_Sub1.anInt4882 + -i];
		    }
		} else {
		    for (int i = 0;
			 (i ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
			 i++) {
			is_7_[i] = is_4_[i];
			is_6_[i] = is_3_[i];
			is_8_[i] = is_5_[i];
		    }
		}
	    }
	    anInt4535++;
	    is = is_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pk.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public Class14_Sub8_Sub27() {
	super(1, false);
    }
    
    public static void method624(int arg0) {
	try {
	    aClass124_4541 = null;
	    if (arg0 != 2)
		method624(-69);
	    aClass124_4552 = null;
	    aClass124_4538 = null;
	    aClass124Array4549 = null;
	    aClass124_4545 = null;
	    aClass81_4546 = null;
	    anIntArray4544 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pk.D(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_445_:
	    do {
		do {
		    if (0 != i) {
			if ((i ^ 0xffffffff) != -2) {
			    if (-3 == (i ^ 0xffffffff))
				break;
			    break while_445_;
			}
		    } else {
			aBoolean4543 = arg2.method798(87) == 1;
			break while_445_;
		    }
		    aBoolean4540 = 1 == arg2.method798(-119);
		    break while_445_;
		} while (false);
		aBoolean2862 = (arg2.method798(101) ^ 0xffffffff) == -2;
	    } while (false);
	    anInt4539++;
	    if (arg1 != 24777)
		aClass124_4552 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pk.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4536++;
	    if (arg1 > -58)
		aBoolean4543 = false;
	    int[] is_9_ = aClass149_2851.method2014(arg0, (byte) 114);
	    if (aClass149_2851.aBoolean2402) {
		int[] is_10_ = method483(0, (byte) -124,
					 (!aBoolean4540 ? arg0
					  : -arg0 + Class115.anInt1927));
		if (aBoolean4543) {
		    for (int i = 0; Class112.anInt1876 > i; i++)
			is_9_[i] = is_10_[Class14_Sub10_Sub1.anInt4882 - i];
		} else
		    Class72.method1325(is_10_, 0, is_9_, 0,
				       Class112.anInt1876);
	    }
	    is = is_9_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pk.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    static {
	aClass124_4541 = Class14_Sub2_Sub2.method263(1178, "wave:");
	aClass124_4538 = aClass124_4541;
	anInt4548 = -1;
	aClass124_4545 = aClass124_4541;
	aClass124_4552 = Class14_Sub2_Sub2.method263(1178, "(Y");
	aClass81_4546 = new Class81();
    }
}
