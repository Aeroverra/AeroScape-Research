/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class67
{
    public static int anInt1052;
    public static int anInt1053;
    public static int anInt1054;
    public static Class97 aClass97_1055 = new Class97();
    public static int anInt1056;
    public static int anInt1057;
    public static int anInt1058 = 0;
    public static int anInt1059;
    public static Class94 aClass94_1060 = null;
    
    public static void method1298(int arg0) {
	try {
	    aClass97_1055 = null;
	    aClass94_1060 = null;
	    if (arg0 != -2)
		aClass94_1060 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ii.B(" + arg0 + ')');
	}
    }
    
    public static int method1299(int arg0, int arg1, int arg2, int arg3) {
    while_879_:
	do {
	    do {
		int i;
		try {
		    arg1 &= 0x3;
		    if (arg2 > 71)
			break;
		    i = 109;
		} catch (RuntimeException runtimeexception) {
		    break while_879_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    anInt1056++;
		    if ((arg1 ^ 0xffffffff) != -1)
			break;
		    i = arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_879_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (1 != arg1)
			break;
		    i = 7 - arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_879_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if ((arg1 ^ 0xffffffff) != -3)
			break;
		    i = -arg3 + 7;
		} catch (RuntimeException runtimeexception) {
		    break while_879_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ii.E(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public static void method1300(int arg0, int arg1, int arg2) {
    while_881_:
	do {
	while_880_:
	    do {
		Class2 class2;
		do {
		    try {
			anInt1054++;
			class2 = (Class128.aClass2ArrayArrayArray2119
				  [Class14_Sub2_Sub3.anInt3785][arg2][arg0]);
			if (class2 != null)
			    break;
			Class135.method1928(Class14_Sub2_Sub3.anInt3785, arg2,
					    arg0);
		    } catch (RuntimeException runtimeexception) {
			break while_880_;
		    }
		    return;
		} while (false);
		Class14_Sub2_Sub4 class14_sub2_sub4;
		do {
		    try {
			int i = -99999999;
			class14_sub2_sub4 = null;
			for (Class14_Sub2_Sub4 class14_sub2_sub4_0_
				 = ((Class14_Sub2_Sub4)
				    class2.method77(arg1 + -9210));
			     null != class14_sub2_sub4_0_;
			     class14_sub2_sub4_0_
				 = (Class14_Sub2_Sub4) class2.method84(-77)) {
			    Class142 class142
				= (Class14_Sub8_Sub24.method605
				   (63, (class14_sub2_sub4_0_
					 .aClass133_Sub3_3789.anInt3557)));
			    int i_1_ = class142.anInt2288;
			    if (-2 == (class142.anInt2309 ^ 0xffffffff))
				i_1_ *= 1 + (class14_sub2_sub4_0_
					     .aClass133_Sub3_3789.anInt3558);
			    if ((i ^ 0xffffffff) > (i_1_ ^ 0xffffffff)) {
				i = i_1_;
				class14_sub2_sub4 = class14_sub2_sub4_0_;
			    }
			}
			if (null != class14_sub2_sub4)
			    break;
			Class135.method1928(Class14_Sub2_Sub3.anInt3785, arg2,
					    arg0);
		    } catch (RuntimeException runtimeexception) {
			break while_880_;
		    }
		    return;
		} while (false);
		try {
		    Class133_Sub3 class133_sub3 = null;
		    if (arg1 != 9210)
			anInt1059 = -106;
		    class2.method87((byte) 10, class14_sub2_sub4);
		    Class133_Sub3 class133_sub3_2_ = null;
		    for (Class14_Sub2_Sub4 class14_sub2_sub4_3_
			     = (Class14_Sub2_Sub4) class2.method77(0);
			 class14_sub2_sub4_3_ != null;
			 class14_sub2_sub4_3_
			     = (Class14_Sub2_Sub4) class2.method84(-106)) {
			Class133_Sub3 class133_sub3_4_
			    = class14_sub2_sub4_3_.aClass133_Sub3_3789;
			if (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557
			    != class133_sub3_4_.anInt3557) {
			    if (class133_sub3 == null)
				class133_sub3 = class133_sub3_4_;
			    if (((class133_sub3.anInt3557 ^ 0xffffffff)
				 != (class133_sub3_4_.anInt3557 ^ 0xffffffff))
				&& null == class133_sub3_2_)
				class133_sub3_2_ = class133_sub3_4_;
			}
		    }
		    long l = (long) ((arg0 << -1255498009)
				     + (arg2 - -1610612736));
		    Canvas_Sub2.method61(Class14_Sub2_Sub3.anInt3785, arg2,
					 arg0,
					 Class26.method1017(arg2 * 128 - -64,
							    (Class14_Sub2_Sub3
							     .anInt3785),
							    (byte) -119,
							    64 + 128 * arg0),
					 class14_sub2_sub4.aClass133_Sub3_3789,
					 l, class133_sub3, class133_sub3_2_);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_881_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ii.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static int method1301(byte arg0, int arg1, int arg2, int arg3) {
	int i;
	try {
	    anInt1057++;
	    int i_5_ = -42 / ((arg0 - -17) / 41);
	    i = arg2 <= arg1 ? arg3 >= arg1 ? arg1 : arg3 : arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ii.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return i;
    }
    
    public static Class14_Sub2_Sub19 method1302(boolean arg0) {
    while_882_:
	do {
	    byte[] is;
	    int i;
	    int[] is_6_;
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    anInt1053++;
		    is = Class12.aByteArrayArray310[0];
		    i = Class17.anIntArray402[0] * Class76.anIntArray1204[0];
		    is_6_ = new int[i];
		    if (!arg0)
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_882_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2;
	    try {
		for (int i_7_ = 0; (i_7_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_7_++)
		    is_6_[i_7_]
			= (Class73.anIntArray1114
			   [Class14_Sub8_Sub26.method617(is[i_7_], 255)]);
		Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2_8_
		    = new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952,
						  Class14_Sub30.anInt3279,
						  Class40.anIntArray675[0],
						  (Class14_Sub2_Sub12
						   .anIntArray3918[0]),
						  Class17.anIntArray402[0],
						  Class76.anIntArray1204[0],
						  is_6_);
		Class129.method1761((byte) 12);
		class14_sub2_sub19_sub2 = class14_sub2_sub19_sub2_8_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ii.D(" + arg0 + ')');
    }
}
