/* Class14_Sub2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub11 extends Class14_Sub2
{
    public static int[] anIntArray3872 = new int[2];
    public static int anInt3873;
    public static int anInt3874;
    public static int anInt3875;
    public Class124 aClass124_3876;
    public static int anInt3877;
    public static Class100 aClass100_3878;
    public static int anInt3879;
    public static int anInt3880;
    public static int anInt3881 = 0;
    public int[] anIntArray3882;
    public static int anInt3883;
    public static int anInt3884 = 0;
    public int[] anIntArray3885;
    public int[] anIntArray3886;
    public static int anInt3887;
    public int[] anIntArray3888;
    public static int anInt3889 = 0;
    public static int anInt3890;
    public static int anInt3891;
    public static Class124 aClass124_3892
	= Class14_Sub2_Sub2.method263(1178, "cookieprefix");
    
    public int method308(byte arg0, int arg1) {
    while_190_:
	do {
	    do {
		int i;
		try {
		    anInt3890++;
		    if (anIntArray3885 != null)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_190_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
		int i_0_ = 66 % ((arg0 - -15) / 38);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((anIntArray3885.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
		if ((arg1 ^ 0xffffffff) == (anIntArray3888[i] ^ 0xffffffff))
		    return anIntArray3885[i];
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_190_;
		}
	    }
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "kc.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method309(Class45[] arg0, int arg1, byte arg2,
				 int arg3) {
	try {
	    if (arg3 < arg1) {
		int i = arg3 - 1;
		int i_1_ = 1 + arg1;
		int i_2_ = (arg3 - -arg1) / 2;
		Class45 class45 = arg0[i_2_];
		arg0[i_2_] = arg0[arg3];
		arg0[arg3] = class45;
		while (i_1_ > i) {
		    boolean bool = true;
		    do {
			i_1_--;
			for (int i_3_ = 0; i_3_ < 4; i_3_++) {
			    int i_4_;
			    int i_5_;
			    if (2 != Class71.anIntArray1086[i_3_]) {
				if ((Class71.anIntArray1086[i_3_] ^ 0xffffffff)
				    != -2) {
				    if (-4 != (Class71.anIntArray1086[i_3_]
					       ^ 0xffffffff)) {
					i_5_ = class45.anInt744;
					i_4_ = arg0[i_1_].anInt744;
				    } else {
					i_5_ = class45.aBoolean749 ? 1 : 0;
					i_4_ = !arg0[i_1_].aBoolean749 ? 0 : 1;
				    }
				} else {
				    i_5_ = class45.anInt752;
				    i_4_ = arg0[i_1_].anInt752;
				    if ((i_4_ ^ 0xffffffff) == 0
					&& Class45.anIntArray737[i_3_] == 1)
					i_4_ = 2001;
				    if ((i_5_ ^ 0xffffffff) == 0
					&& (Class45.anIntArray737[i_3_]
					    ^ 0xffffffff) == -2)
					i_5_ = 2001;
				}
			    } else {
				i_4_ = arg0[i_1_].anInt742;
				i_5_ = class45.anInt742;
			    }
			    if ((i_5_ ^ 0xffffffff) != (i_4_ ^ 0xffffffff)) {
				if ((-2 != (Class45.anIntArray737[i_3_]
					    ^ 0xffffffff)
				     || i_5_ >= i_4_)
				    && (-1 != (Class45.anIntArray737[i_3_]
					       ^ 0xffffffff)
					|| i_5_ <= i_4_))
				    bool = false;
				break;
			    }
			    if ((i_3_ ^ 0xffffffff) == -4)
				bool = false;
			}
		    } while (bool);
		    bool = true;
		    do {
			i++;
			for (int i_6_ = 0; i_6_ < 4; i_6_++) {
			    int i_7_;
			    int i_8_;
			    if ((Class71.anIntArray1086[i_6_] ^ 0xffffffff)
				== -3) {
				i_7_ = class45.anInt742;
				i_8_ = arg0[i].anInt742;
			    } else if (-2 == (Class71.anIntArray1086[i_6_]
					      ^ 0xffffffff)) {
				i_7_ = class45.anInt752;
				if (i_7_ == -1 && (Class45.anIntArray737[i_6_]
						   ^ 0xffffffff) == -2)
				    i_7_ = 2001;
				i_8_ = arg0[i].anInt752;
				if (i_8_ == -1 && (Class45.anIntArray737[i_6_]
						   ^ 0xffffffff) == -2)
				    i_8_ = 2001;
			    } else if (3 == Class71.anIntArray1086[i_6_]) {
				i_8_ = !arg0[i].aBoolean749 ? 0 : 1;
				i_7_ = class45.aBoolean749 ? 1 : 0;
			    } else {
				i_7_ = class45.anInt744;
				i_8_ = arg0[i].anInt744;
			    }
			    if ((i_8_ ^ 0xffffffff) == (i_7_ ^ 0xffffffff)) {
				if ((i_6_ ^ 0xffffffff) == -4)
				    bool = false;
			    } else {
				if ((-2 != (Class45.anIntArray737[i_6_]
					    ^ 0xffffffff)
				     || i_7_ <= i_8_)
				    && ((Class45.anIntArray737[i_6_]
					 ^ 0xffffffff) != -1
					|| i_7_ >= i_8_))
				    bool = false;
				break;
			    }
			}
		    } while (bool);
		    if (i_1_ > i) {
			Class45 class45_9_ = arg0[i];
			arg0[i] = arg0[i_1_];
			arg0[i_1_] = class45_9_;
		    }
		}
		method309(arg0, i_1_, (byte) 106, arg3);
		method309(arg0, arg1, (byte) 122, i_1_ - -1);
	    }
	    anInt3875++;
	    if (arg2 <= 98)
		method316(112L, -97);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kc.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	}
    }
    
    public void method310(int arg0) {
	try {
	    anInt3879++;
	    if (anIntArray3882 != null) {
		for (int i = 0; i < anIntArray3882.length; i++)
		    anIntArray3882[i]
			= Class66.method1294(anIntArray3882[i], 32768);
	    }
	    if (null != anIntArray3885) {
		for (int i = 0;
		     (anIntArray3885.length ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++)
		    anIntArray3885[i]
			= Class66.method1294(anIntArray3885[i], 32768);
	    }
	    if (arg0 != 18859)
		anInt3881 = 98;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kc.E(" + arg0 + ')');
	}
    }
    
    public int method311(int arg0, int arg1) {
    while_191_:
	do {
	    do {
		int i;
		try {
		    anInt3887++;
		    if (anIntArray3882 != null)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_191_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (i < anIntArray3882.length) {
		if ((anIntArray3886[i] ^ 0xffffffff) == (arg0 ^ 0xffffffff))
		    return anIntArray3882[i];
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_191_;
		}
	    }
	    if (arg1 >= -116)
		method308((byte) 45, 111);
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "kc.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method312(Class14_Sub10 arg0, byte arg1, int arg2) {
    while_193_:
	do {
	while_192_:
	    do {
		do {
		    try {
			if (-2 == (arg2 ^ 0xffffffff))
			    aClass124_3876 = arg0.method797(9467);
			else if (arg2 == 2) {
			    int i = arg0.method798(72);
			    anIntArray3885 = new int[i];
			    anIntArray3888 = new int[i];
			    for (int i_10_ = 0; i_10_ < i; i_10_++) {
				anIntArray3885[i_10_]
				    = arg0.method784((byte) 105);
				int i_11_ = arg0.method798(116);
				if (-1 == (i_11_ ^ 0xffffffff))
				    anIntArray3888[i_10_] = -1;
				else
				    anIntArray3888[i_10_] = i_11_;
			    }
			} else if ((arg2 ^ 0xffffffff) != -4) {
			    if (-5 != (arg2 ^ 0xffffffff)) {
				/* empty */
			    }
			} else {
			    int i = arg0.method798(108);
			    anIntArray3886 = new int[i];
			    anIntArray3882 = new int[i];
			    for (int i_12_ = 0; i_12_ < i; i_12_++) {
				anIntArray3882[i_12_]
				    = arg0.method784((byte) 114);
				int i_13_ = arg0.method798(-99);
				if (-1 != (i_13_ ^ 0xffffffff))
				    anIntArray3886[i_12_] = i_13_;
				else
				    anIntArray3886[i_12_] = -1;
			    }
			}
			if (arg1 > 9)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_192_;
		    }
		    return;
		} while (false);
		try {
		    anInt3891++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_193_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("kc.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	} while (false);
    }
    
    public static void method313(int arg0) {
    while_195_:
	do {
	while_194_:
	    do {
		do {
		    try {
			aClass124_3892 = null;
			aClass100_3878 = null;
			if (arg0 >= 77)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_194_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray3872 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_195_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "kc.I(" + arg0 + ')');
	} while (false);
    }
    
    public static void method314(byte arg0, int arg1, int arg2, int arg3,
				 int arg4) {
    while_197_:
	do {
	while_196_:
	    do {
		do {
		    try {
			if (arg0 > 61)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_196_;
		    }
		    return;
		} while (false);
		try {
		    for (Class14_Sub3 class14_sub3
			     = ((Class14_Sub3)
				Class152.aClass2_2438.method77(0));
			 class14_sub3 != null;
			 class14_sub3 = ((Class14_Sub3)
					 Class152.aClass2_2438.method84(-55)))
			Class58.method1255(arg3, class14_sub3, arg2, arg1,
					   -31083, arg4);
		    anInt3883++;
		    for (Class14_Sub3 class14_sub3
			     = (Class14_Sub3) Class41.aClass2_683.method77(0);
			 null != class14_sub3;
			 class14_sub3 = ((Class14_Sub3)
					 Class41.aClass2_683.method84(-103))) {
			int i = 1;
			if (class14_sub3.aClass133_Sub1_Sub2_2762.anInt3433
			    != (class14_sub3.aClass133_Sub1_Sub2_2762
				.anInt3452)) {
			    if (((class14_sub3.aClass133_Sub1_Sub2_2762
				  .anInt3456)
				 ^ 0xffffffff)
				== ((class14_sub3.aClass133_Sub1_Sub2_2762
				     .anInt3452)
				    ^ 0xffffffff))
				i = 2;
			} else
			    i = 0;
			if ((i ^ 0xffffffff)
			    != (class14_sub3.anInt2756 ^ 0xffffffff)) {
			    int i_14_
				= (Class99.method1500
				   (class14_sub3.aClass133_Sub1_Sub2_2762,
				    -1));
			    if ((class14_sub3.anInt2753 ^ 0xffffffff)
				!= (i_14_ ^ 0xffffffff)) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775
				    != null) {
				    Class33.aClass14_Sub9_Sub2_585.method730
					(class14_sub3.aClass14_Sub9_Sub4_2775);
				    class14_sub3.aClass14_Sub9_Sub4_2775
					= null;
				}
				class14_sub3.anInt2753 = i_14_;
			    }
			    class14_sub3.anInt2756 = i;
			}
			class14_sub3.anInt2751
			    = ((class14_sub3.aClass133_Sub1_Sub2_2762.anInt3493
				* 64)
			       + (class14_sub3.aClass133_Sub1_Sub2_2762
				  .anInt3436));
			class14_sub3.anInt2774
			    = class14_sub3.aClass133_Sub1_Sub2_2762.anInt3495;
			class14_sub3.anInt2761
			    = (64 * (class14_sub3.aClass133_Sub1_Sub2_2762
				     .anInt3493)
			       + (class14_sub3.aClass133_Sub1_Sub2_2762
				  .anInt3495));
			class14_sub3.anInt2767
			    = class14_sub3.aClass133_Sub1_Sub2_2762.anInt3436;
			Class58.method1255(arg3, class14_sub3, arg2, arg1,
					   -31083, arg4);
		    }
		    for (Class14_Sub3 class14_sub3
			     = ((Class14_Sub3)
				Class88.aClass55_1398.method1228((byte) -65));
			 class14_sub3 != null;
			 class14_sub3
			     = (Class14_Sub3) Class88.aClass55_1398
						  .method1227((byte) -23)) {
			int i = 1;
			if ((class14_sub3.aClass133_Sub1_Sub1_2755.anInt3433
			     ^ 0xffffffff)
			    == (class14_sub3.aClass133_Sub1_Sub1_2755.anInt3452
				^ 0xffffffff))
			    i = 0;
			else if ((class14_sub3.aClass133_Sub1_Sub1_2755
				  .anInt3456)
				 == (class14_sub3.aClass133_Sub1_Sub1_2755
				     .anInt3452))
			    i = 2;
			if ((i ^ 0xffffffff)
			    != (class14_sub3.anInt2756 ^ 0xffffffff)) {
			    int i_15_
				= (Class116.method1597
				   (false,
				    class14_sub3.aClass133_Sub1_Sub1_2755));
			    if ((class14_sub3.anInt2753 ^ 0xffffffff)
				!= (i_15_ ^ 0xffffffff)) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775
				    != null) {
				    Class33.aClass14_Sub9_Sub2_585.method730
					(class14_sub3.aClass14_Sub9_Sub4_2775);
				    class14_sub3.aClass14_Sub9_Sub4_2775
					= null;
				}
				class14_sub3.anInt2753 = i_15_;
			    }
			    class14_sub3.anInt2756 = i;
			}
			class14_sub3.anInt2767
			    = class14_sub3.aClass133_Sub1_Sub1_2755.anInt3436;
			class14_sub3.anInt2761
			    = ((class14_sub3.aClass133_Sub1_Sub1_2755.anInt3493
				* 64)
			       + (class14_sub3.aClass133_Sub1_Sub1_2755
				  .anInt3495));
			class14_sub3.anInt2774
			    = class14_sub3.aClass133_Sub1_Sub1_2755.anInt3495;
			class14_sub3.anInt2751
			    = (64 * (class14_sub3.aClass133_Sub1_Sub1_2755
				     .anInt3493)
			       + (class14_sub3.aClass133_Sub1_Sub1_2755
				  .anInt3436));
			Class58.method1255(arg3, class14_sub3, arg2, arg1,
					   -31083, arg4);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_197_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("kc.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    public void method315(byte arg0, Class14_Sub10 arg1) {
	try {
	    for (;;) {
		int i = arg1.method798(55);
		if (0 == i)
		    break;
		method312(arg1, (byte) 30, i);
	    }
	    anInt3877++;
	    if (arg0 > -118)
		aClass100_3878 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kc.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method316(long arg0, int arg1) {
	try {
	    anInt3880++;
	    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
	    Class55.aClass14_Sub10_Sub1_891.method809(false, 118);
	    Class55.aClass14_Sub10_Sub1_891.method817(arg0, 114);
	    Class14_Sub2.anInt2734 = -3;
	    Class129.anInt2136 = 0;
	    if (arg1 != 24967)
		method314((byte) 35, 43, -40, -1, 83);
	    Class14_Sub8_Sub35.anInt4686 = 0;
	    Class56.anInt918 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kc.F(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
