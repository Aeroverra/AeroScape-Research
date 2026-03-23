/* Class14_Sub2_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub12 extends Class14_Sub2
{
    public static int anInt3893;
    public static Class52 aClass52_3894;
    public static Class124 aClass124_3895
	= Class14_Sub2_Sub2.method263(1178, "blinken2:");
    public int anInt3896;
    public static Class124 aClass124_3897
	= Class14_Sub2_Sub2.method263(1178, "Loading textures )2 ");
    public static int anInt3898;
    public Class124[] aClass124Array3899;
    public int[] anIntArray3900;
    public int anInt3901;
    public static int anInt3902;
    public Class55[] aClass55Array3903;
    public int anInt3904;
    public static int anInt3905;
    public Class124 aClass124_3906;
    public int[] anIntArray3907;
    public static int anInt3908;
    public static int anInt3909;
    public static Class124 aClass124_3910 = aClass124_3897;
    public int anInt3911;
    public static int anInt3912;
    public static byte[][] aByteArrayArray3913;
    public static long[] aLongArray3914;
    public static Class124 aClass124_3915;
    public static int[] anIntArray3916;
    public static int[] anIntArray3917;
    public static int[] anIntArray3918;
    
    public static void method317(byte arg0) {
    while_199_:
	do {
	while_198_:
	    do {
		do {
		    try {
			anInt3908++;
			if (Class128.method1755(130068615)
			    || ((Class142.anInt2295 ^ 0xffffffff)
				== (Class14_Sub2_Sub3.anInt3785 ^ 0xffffffff)))
			    break;
			Class45.method1162(Class49.anInt818,
					   Class129.anInt2133,
					   Class14_Sub2_Sub3.anInt3785,
					   (Class14_Sub3
					    .aClass133_Sub1_Sub1_2748
					    .anIntArray3443[0]),
					   (byte) -117,
					   (Class14_Sub3
					    .aClass133_Sub1_Sub1_2748
					    .anIntArray3476[0]),
					   false);
		    } catch (RuntimeException runtimeexception) {
			break while_198_;
		    }
		    return;
		} while (false);
		try {
		    if (arg0 > -116)
			anIntArray3917 = null;
		    if (Class14_Sub8_Sub7.anInt4207
			!= Class14_Sub2_Sub3.anInt3785) {
			Class14_Sub8_Sub7.anInt4207
			    = Class14_Sub2_Sub3.anInt3785;
			Class14_Sub8_Sub5
			    .method502(false, Class14_Sub2_Sub3.anInt3785);
			Class14_Sub8_Sub23.method602(-1);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_199_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ll.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method318(int arg0, int arg1, boolean arg2) {
	try {
	    Class51 class51 = Class47.method1187(arg0, true);
	    if (arg2)
		method323(75, 25, 72);
	    anInt3909++;
	    int i = class51.anInt842;
	    int i_0_ = class51.anInt834;
	    int i_1_ = class51.anInt832;
	    int i_2_ = Class1.anIntArray69[i_0_ + -i_1_];
	    if (arg1 < 0 || (arg1 ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
		arg1 = 0;
	    i_2_ <<= i_1_;
	    Canvas_Sub1.method58((i_2_ & arg1 << i_1_
				  | (Class14_Sub9_Sub3.anIntArray4851[i]
				     & (i_2_ ^ 0xffffffff))),
				 (byte) -1, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ll.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method319(int arg0) {
	try {
	    anInt3905++;
	    Class151.method2029(104, 104);
	    Class14_Sub15.method871(Class14_Sub3.aClass9_Sub1_2750,
				    Class64.aClass9_Sub1_1015, -125);
	    Class2.method85(Class14_Sub3.aClass9_Sub1_2750, true);
	    if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == -11)
		Class126.method1743(27252, 28);
	    if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == arg0)
		Class126.method1743(27252, 25);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ll.G(" + arg0 + ')');
	}
    }
    
    public static void method320(byte arg0) {
	try {
	    anIntArray3917 = null;
	    aClass124_3895 = null;
	    aClass124_3915 = null;
	    aClass124_3897 = null;
	    anIntArray3916 = null;
	    aByteArrayArray3913 = null;
	    aClass124_3910 = null;
	    if (arg0 != -48)
		aClass124_3897 = null;
	    aClass52_3894 = null;
	    aLongArray3914 = null;
	    anIntArray3918 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ll.E(" + arg0 + ')');
	}
    }
    
    public static void method321(int arg0) {
	try {
	    if (Class14_Sub8_Sub21.anIntArray4435 == null
		|| null == Class99_Sub2.anIntArray3357) {
		Class99_Sub2.anIntArray3357 = new int[256];
		Class14_Sub8_Sub21.anIntArray4435 = new int[256];
		for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
		    double d = (double) i / 255.0 * 6.283185307179586;
		    Class14_Sub8_Sub21.anIntArray4435[i]
			= (int) (Math.sin(d) * 4096.0);
		    Class99_Sub2.anIntArray3357[i]
			= (int) (4096.0 * Math.cos(d));
		}
	    }
	    anInt3898++;
	    if (arg0 != 256)
		method323(-23, 57, 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ll.C(" + arg0 + ')');
	}
    }
    
    public static int method322(int arg0, byte arg1, int arg2) {
    while_200_:
	do {
	    Class14_Sub25 class14_sub25;
	    do {
		int i;
		try {
		    anInt3893++;
		    class14_sub25
			= ((Class14_Sub25)
			   Class132.aClass55_2167.method1230((long) arg0,
							     (byte) -116));
		    if (class14_sub25 != null)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_200_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg2 != -1)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_200_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_3_ = 0;
		if (arg1 != 55)
		    anIntArray3916 = null;
		for (int i_4_ = 0; class14_sub25.anIntArray3177.length > i_4_;
		     i_4_++) {
		    if (arg2 == class14_sub25.anIntArray3178[i_4_])
			i_3_ += class14_sub25.anIntArray3177[i_4_];
		}
		i = i_3_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ll.H(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public static long method323(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null || class14_sub29.aClass37_3255 == null)
	    return 0L;
	return class14_sub29.aClass37_3255.aLong634;
    }
    
    public static void method324(int arg0, int arg1, int arg2, int arg3,
				 byte arg4, int arg5) {
	try {
	    anInt3902++;
	    int i = 71 % ((arg4 - -91) / 32);
	    int i_5_
		= Class67.method1301((byte) -84, arg5, Class14_Sub17.anInt3005,
				     Class59.anInt955);
	    int i_6_ = Class67.method1301((byte) -112, arg2,
					  Class14_Sub17.anInt3005,
					  Class59.anInt955);
	    int i_7_
		= Class67.method1301((byte) -103, arg0, Class118.anInt1982,
				     Class14_Sub8_Sub14.anInt4327);
	    int i_8_ = Class67.method1301((byte) -60, arg3, Class118.anInt1982,
					  Class14_Sub8_Sub14.anInt4327);
	    for (int i_9_ = i_5_; (i_6_ ^ 0xffffffff) <= (i_9_ ^ 0xffffffff);
		 i_9_++)
		Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
				    [i_9_]),
				   i_7_, i_8_, -5973, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ll.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    static {
	aClass52_3894 = new Class52(100);
	anInt3912 = -1;
	aLongArray3914 = new long[32];
	anIntArray3916 = new int[25];
	aClass124_3915 = (Class14_Sub2_Sub2.method263
			  (1178, "(U0a )2 non)2existant gosub script)2num: "));
	anIntArray3917 = new int[] { 16776960, 16711680, 65280, 65535,
				     16711935, 16777215 };
    }
}
