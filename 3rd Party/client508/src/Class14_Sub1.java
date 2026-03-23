/* Class14_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class14_Sub1 extends Class14
{
    public static float aFloat2709;
    public static int anInt2710;
    public static Class9 aClass9_2711;
    public static int anInt2712;
    public static int anInt2713;
    public int anInt2714;
    public static int anInt2715;
    public static int anInt2716;
    public static short[] aShortArray2717 = new short[256];
    public static int anInt2718;
    public static int anInt2719;
    public static int anInt2720;
    public static int anInt2721;
    public static boolean aBoolean2722 = true;
    public static int anInt2723;
    public static int[][][] anIntArrayArrayArray2724;
    
    public static void method234(Class9 arg0, byte arg1) {
	try {
	    anInt2723++;
	    Class7_Sub1.aClass9_2652 = arg0;
	    if (arg1 > -62)
		aClass9_2711 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ba.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static Class75 method235(int arg0, int arg1, Class43 arg2,
				    Component arg3, int arg4) {
    while_133_:
	do {
	while_132_:
	    do {
		do {
		    Class75 class75;
		    try {
			anInt2715++;
			if (Class115.anInt1909 == 0)
			    throw new IllegalStateException();
			if (-1 < (arg4 ^ 0xffffffff) || 2 <= arg4)
			    throw new IllegalArgumentException();
			if (256 > arg0)
			    arg0 = 256;
			try {
			    if (arg1 >= 38)
				break;
			    class75 = null;
			} catch (Throwable throwable) {
			    break while_132_;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_133_;
		    }
		    return class75;
		} while (false);
		Class75 class75;
		try {
		    Class75 class75_0_
			= ((Class75)
			   Class.forName("Class75_Sub1").newInstance());
		    class75_0_.anIntArray1150
			= new int[256 * (!Class14_Sub2_Sub2.aBoolean3763 ? 1
					 : 2)];
		    class75_0_.anInt1173 = arg0;
		    class75_0_.method1350(arg3);
		    class75_0_.anInt1174 = 1024 + (arg0 & ~0x3ff);
		    if (-16385 > (class75_0_.anInt1174 ^ 0xffffffff))
			class75_0_.anInt1174 = 16384;
		    class75_0_.method1347(class75_0_.anInt1174);
		    if ((Class99.anInt1674 ^ 0xffffffff) < -1
			&& Class69.aClass90_1070 == null) {
			Class69.aClass90_1070 = new Class90();
			Class69.aClass90_1070.aClass43_1421 = arg2;
			arg2.method1143(Class99.anInt1674,
					Class69.aClass90_1070, 0);
		    }
		    if (null != Class69.aClass90_1070) {
			if (null
			    != Class69.aClass90_1070.aClass75Array1422[arg4])
			    throw new IllegalArgumentException();
			Class69.aClass90_1070.aClass75Array1422[arg4]
			    = class75_0_;
		    }
		    class75 = class75_0_;
		} catch (Throwable throwable) {
		    break;
		}
		return class75;
	    } while (false);
	    try {
		Object object = new Throwable();
		try {
		    Class75_Sub2 class75_sub2 = new Class75_Sub2(arg2, arg4);
		    class75_sub2.anInt1173 = arg0;
		    class75_sub2.anIntArray1150
			= new int[256 * (Class14_Sub2_Sub2.aBoolean3763 ? 2
					 : 1)];
		    class75_sub2.method1350(arg3);
		    class75_sub2.anInt1174 = 16384;
		    class75_sub2.method1347(class75_sub2.anInt1174);
		    if (0 < Class99.anInt1674
			&& Class69.aClass90_1070 == null) {
			Class69.aClass90_1070 = new Class90();
			Class69.aClass90_1070.aClass43_1421 = arg2;
			arg2.method1143(Class99.anInt1674,
					Class69.aClass90_1070, 0);
		    }
		    if (null != Class69.aClass90_1070) {
			if (Class69.aClass90_1070.aClass75Array1422[arg4]
			    != null)
			    throw new IllegalArgumentException();
			Class69.aClass90_1070.aClass75Array1422[arg4]
			    = class75_sub2;
		    }
		    return class75_sub2;
		} catch (Throwable throwable) {
		    break;
		}
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	} while (false);
	return null;
    }
    
    public Class14_Sub1() {
	/* empty */
    }
    
    public static void method236(boolean arg0, Class14_Sub15 arg1, byte arg2) {
	try {
	    anInt2712++;
	    int i = arg1.anInt2999;
	    int i_1_ = (int) arg1.aLong355;
	    arg1.method233(0);
	    if (arg0)
		Class49.method1197(i, false);
	    Class14_Sub8_Sub31.method644(i, (byte) 92);
	    Class94 class94 = Class55.method1233(i_1_, 21803);
	    if (class94 != null)
		Class103.method1531((byte) -115, class94);
	    Class14_Sub8_Sub38.anInt4729 = 0;
	    Class133_Sub5.aBoolean3628 = false;
	    if (arg2 > -116)
		aBoolean2722 = true;
	    Class14_Sub13.method862(122, Class14_Sub14.anInt2984,
				    Class14_Sub8_Sub27.anInt4550,
				    Class14_Sub2_Sub8.anInt3832,
				    Class26.anInt500);
	    if (-1 != Class14_Sub2_Sub12.anInt3912)
		Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ba.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static Class14_Sub15 method237(int arg0, int arg1, int arg2,
					  int arg3) {
	Class14_Sub15 class14_sub15;
	try {
	    anInt2716++;
	    Class14_Sub15 class14_sub15_2_ = new Class14_Sub15();
	    class14_sub15_2_.anInt2999 = arg3;
	    class14_sub15_2_.anInt2991 = arg2;
	    Class14_Sub30.aClass55_3275.method1224(8, (long) arg1,
						   class14_sub15_2_);
	    if (arg0 != 1)
		method239(false);
	    Class109.method1563(arg3, arg0 ^ ~0x33);
	    Class94 class94 = Class55.method1233(arg1, 21803);
	    if (class94 != null)
		Class103.method1531((byte) -113, class94);
	    if (Class125_Sub2.aClass94_3388 != null) {
		Class103.method1531((byte) -45, Class125_Sub2.aClass94_3388);
		Class125_Sub2.aClass94_3388 = null;
	    }
	    Class14_Sub8_Sub38.anInt4729 = 0;
	    Class133_Sub5.aBoolean3628 = false;
	    Class14_Sub13.method862(arg0 + 125, Class14_Sub14.anInt2984,
				    Class14_Sub8_Sub27.anInt4550,
				    Class14_Sub2_Sub8.anInt3832,
				    Class26.anInt500);
	    if (null != class94)
		Class14_Sub2_Sub21.method445(class94, 18559, false);
	    Class73.method1328(arg3, true);
	    if ((Class14_Sub2_Sub12.anInt3912 ^ 0xffffffff) != 0)
		Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
	    class14_sub15 = class14_sub15_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ba.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return class14_sub15;
    }
    
    public Class14_Sub1(int arg0) {
	try {
	    anInt2714 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ba.<init>(" + arg0 + ')');
	}
    }
    
    public static void method238(byte arg0) {
	try {
	    if (null != Class14_Sub15.aClass36_2990) {
		Class14_Sub15.aClass36_2990.method1101((byte) -31);
		Class14_Sub15.aClass36_2990 = null;
	    }
	    Class14_Sub3.method451(0);
	    anInt2718++;
	    Class56.method1240();
	    for (int i = 0; -5 < (i ^ 0xffffffff); i++)
		Class14_Sub21.aClass32Array3100[i].method1071(true);
	    Class69.method1311((byte) 124);
	    System.gc();
	    Class69.method1308(2, (byte) -14);
	    Class14_Sub8.anInt2856 = -1;
	    Class14_Sub7.aBoolean2827 = false;
	    Class137.method1941(true, (byte) -84);
	    Class58.anInt947 = 0;
	    Class133_Sub6.anInt3676 = 0;
	    Class7_Sub2_Sub1.aBoolean3699 = false;
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class14_Sub2_Sub1.aClass66Array3721.length ^ 0xffffffff));
		 i++)
		Class14_Sub2_Sub1.aClass66Array3721[i] = null;
	    Class14_Sub10.anInt2878 = 0;
	    Class14_Sub8_Sub13.anInt4306 = 0;
	    for (int i = 0; 2048 > i; i++) {
		Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i] = null;
		Class14_Sub2.aClass14_Sub10Array2742[i] = null;
	    }
	    for (int i = 0; -32769 < (i ^ 0xffffffff); i++)
		Class14_Sub4.aClass133_Sub1_Sub2Array2785[i] = null;
	    if (arg0 <= 46)
		method238((byte) -64);
	    for (int i = 0; 4 > i; i++) {
		for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -105; i_3_++) {
		    for (int i_4_ = 0; 104 > i_4_; i_4_++)
			Class128.aClass2ArrayArrayArray2119[i][i_3_][i_4_]
			    = null;
		}
	    }
	    Class109.method1568((byte) -43);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ba.D(" + arg0 + ')');
	}
    }
    
    public static void method239(boolean arg0) {
	try {
	    anIntArrayArrayArray2724 = null;
	    aClass9_2711 = null;
	    aShortArray2717 = null;
	    if (arg0)
		anIntArrayArrayArray2724 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ba.B(" + arg0 + ')');
	}
    }
    
    public static void method240(int arg0) {
	try {
	    anInt2713++;
	    for (Class14_Sub3 class14_sub3
		     = (Class14_Sub3) Class152.aClass2_2438.method77(0);
		 class14_sub3 != null;
		 class14_sub3 = (Class14_Sub3) Class152.aClass2_2438
						   .method84(arg0 ^ ~0x17f)) {
		if (class14_sub3.aBoolean2757)
		    class14_sub3.method452(18631);
	    }
	    for (Class14_Sub3 class14_sub3
		     = ((Class14_Sub3)
			Class41.aClass2_683.method77(arg0 ^ arg0));
		 null != class14_sub3;
		 class14_sub3
		     = (Class14_Sub3) Class41.aClass2_683.method84(-54)) {
		if (class14_sub3.aBoolean2757)
		    class14_sub3.method452(18631);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ba.G(" + arg0 + ')');
	}
    }
    
    static {
	anInt2721 = 0;
    }
}
