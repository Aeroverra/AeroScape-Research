/* Class14_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub22 extends Class14
{
    public static int[] anIntArray3117
	= { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
    public int anInt3118;
    public static int[] anIntArray3119;
    public int anInt3120;
    public static int anInt3121;
    public static int anInt3122;
    public static int anInt3123;
    public static Class124 aClass124_3124
	= Class14_Sub2_Sub2.method263(1178, "Schlie-8en");
    public static int[][][] anIntArrayArrayArray3125;
    
    public static void method898(int arg0, double arg1) {
	try {
	    if (arg1 != Class14_Sub9_Sub1.aDouble4756) {
		for (int i = 0; 256 > i; i++) {
		    int i_0_
			= (int) (255.0 * Math.pow((double) i / 255.0, arg1));
		    Class14_Sub9_Sub1.anIntArray4827[i]
			= 255 < i_0_ ? 255 : i_0_;
		}
		Class14_Sub9_Sub1.aDouble4756 = arg1;
	    }
	    if (arg0 < 64)
		anIntArray3119 = null;
	    anInt3122++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("si.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method899(long arg0, int arg1) {
    while_615_:
	do {
	while_614_:
	    do {
		do {
		    try {
			anInt3123++;
			if ((arg0 ^ 0xffffffffffffffffL) != -1L)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_614_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (100 > Class42.anInt698)
			    break;
			Class15.method943(Class14_Sub2_Sub19.aClass124_4045,
					  false,
					  Class14_Sub8_Sub9.aClass124_4244, 0);
		    } catch (RuntimeException runtimeexception) {
			break while_614_;
		    }
		    return;
		} while (false);
		Class124 class124;
		int i;
		try {
		    class124
			= Class46.method1174(arg0, (byte) 64).method1685(0);
		    int i_1_ = -33 / ((79 - arg1) / 38);
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		while ((Class42.anInt698 ^ 0xffffffff) < (i ^ 0xffffffff)) {
		    if (Class126.aLongArray2095[i] == arg0) {
			Class15.method943((Class14_Sub8_Sub7.method515
					   ((new Class124[]
					     { class124, (Class14_Sub8_Sub14
							  .aClass124_4330) }),
					    (byte) -14)),
					  false,
					  Class14_Sub8_Sub9.aClass124_4244, 0);
			return;
		    }
		    try {
			i++;
		    } catch (RuntimeException runtimeexception) {
			break while_614_;
		    }
		}
		i = 0;
		while (Class14_Sub2_Sub1.anInt3728 > i) {
		    if ((arg0 ^ 0xffffffffffffffffL)
			== (Class133_Sub1_Sub2.aLongArray4951[i]
			    ^ 0xffffffffffffffffL)) {
			Class15.method943((Class14_Sub8_Sub7.method515
					   ((new Class124[]
					     { Class138.aClass124_2226,
					       class124,
					       Class125_Sub3.aClass124_3409 }),
					    (byte) -80)),
					  false,
					  Class14_Sub8_Sub9.aClass124_4244, 0);
			return;
		    }
		    try {
			i++;
		    } catch (RuntimeException runtimeexception) {
			break while_614_;
		    }
		}
		if (class124.method1704((Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .aClass124_4922),
					(byte) 60))
		    Class15.method943(Class26_Sub1.aClass124_3291, false,
				      Class14_Sub8_Sub9.aClass124_4244, 0);
		else {
		    try {
			Class37.anInt651++;
			Class126.aLongArray2095[Class42.anInt698] = arg0;
			client.aClass124Array2645[Class42.anInt698++]
			    = Class46.method1174(arg0, (byte) 109);
			Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			Class55.aClass14_Sub10_Sub1_891.method843(0, 61);
			Class55.aClass14_Sub10_Sub1_891.method817(arg0, 117);
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		    break while_615_;
		}
		return;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "si.C(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public Class14_Sub22(int arg0, int arg1) {
	try {
	    anInt3118 = arg1;
	    anInt3120 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("si.<init>(" + arg0 + ','
						+ arg1 + ')'));
	}
    }
    
    public static void method900(byte arg0) {
	try {
	    anIntArray3119 = null;
	    anIntArray3117 = null;
	    anIntArrayArrayArray3125 = null;
	    int i = -13 % ((70 - arg0) / 55);
	    aClass124_3124 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "si.D(" + arg0 + ')');
	}
    }
    
    public static void method901(byte arg0) {
	try {
	    anInt3121++;
	    int i = Class14_Sub8_Sub28.aByteArrayArray4556.length;
	    for (int i_2_ = 0; i_2_ < i; i_2_++) {
		if (Class14_Sub8_Sub28.aByteArrayArray4556[i_2_] != null) {
		    int i_3_ = -1;
		    for (int i_4_ = 0; Class14_Sub2_Sub2.anInt3758 > i_4_;
			 i_4_++) {
			if ((Class14_Sub8.anIntArray2858[i_2_] ^ 0xffffffff)
			    == (Class120.anIntArray2009[i_4_] ^ 0xffffffff)) {
			    i_3_ = i_4_;
			    break;
			}
		    }
		    if (-1 == i_3_) {
			Class120.anIntArray2009[Class14_Sub2_Sub2.anInt3758]
			    = Class14_Sub8.anIntArray2858[i_2_];
			i_3_ = Class14_Sub2_Sub2.anInt3758++;
		    }
		    int i_5_ = 0;
		    Class14_Sub10 class14_sub10
			= new Class14_Sub10(Class14_Sub8_Sub28
					    .aByteArrayArray4556[i_2_]);
		    while ((Class14_Sub8_Sub28.aByteArrayArray4556[i_2_].length
			    > class14_sub10.anInt2908)
			   && (i_5_ ^ 0xffffffff) > -512) {
			int i_6_ = i_3_ | i_5_++ << 902103942;
			int i_7_ = class14_sub10.method784((byte) 108);
			int i_8_ = 0x3f & i_7_ >> -947955129;
			int i_9_ = (i_8_
				    + (Class14_Sub8.anIntArray2858[i_2_]
				       >> 1184381512) * 64
				    - Class133_Sub6.anInt3676);
			int i_10_ = 0x3f & i_7_;
			int i_11_
			    = ((Class14_Sub8.anIntArray2858[i_2_] & 0xff) * 64
			       + (-Class58.anInt947 - -i_10_));
			Class12 class12
			    = Class126.method1744(class14_sub10
						      .method784((byte) 115),
						  170);
			int i_12_ = i_7_ >> 1115295150;
			if ((Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_]
			     == null)
			    && (class12.aByte290 & 0x1 ^ 0xffffffff) < -1
			    && (i_12_ ^ 0xffffffff) == (Class142.anInt2295
							^ 0xffffffff)
			    && 0 <= i_9_
			    && -105 < (i_9_ - -class12.anInt334 ^ 0xffffffff)
			    && i_11_ >= 0
			    && -105 < (class12.anInt334 + i_11_
				       ^ 0xffffffff)) {
			    Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_]
				= new Class133_Sub1_Sub2();
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				   [i_6_]);
			    Class14_Sub2_Sub15.anIntArray3965
				[Class14_Sub8_Sub13.anInt4306++]
				= i_6_;
			    class133_sub1_sub2.aClass12_4949 = class12;
			    class133_sub1_sub2.anInt3457
				= class133_sub1_sub2.aClass12_4949.anInt296;
			    class133_sub1_sub2.anInt3447
				= Class14_Sub2_Sub20.anInt4064;
			    class133_sub1_sub2.anInt3492
				= class133_sub1_sub2.aClass12_4949.anInt303;
			    class133_sub1_sub2.anInt3463
				= class133_sub1_sub2.aClass12_4949.anInt276;
			    class133_sub1_sub2.anInt3433
				= class133_sub1_sub2.aClass12_4949.anInt323;
			    class133_sub1_sub2.anInt3493
				= class133_sub1_sub2.aClass12_4949.anInt334;
			    if ((class133_sub1_sub2.anInt3492 ^ 0xffffffff)
				== -1)
				class133_sub1_sub2.anInt3461 = 0;
			    class133_sub1_sub2.anInt3454
				= class133_sub1_sub2.aClass12_4949.anInt318;
			    class133_sub1_sub2.anInt3484
				= class133_sub1_sub2.aClass12_4949.anInt284;
			    class133_sub1_sub2.anInt3471
				= class133_sub1_sub2.aClass12_4949.anInt286;
			    class133_sub1_sub2.anInt3432
				= class133_sub1_sub2.aClass12_4949.anInt339;
			    class133_sub1_sub2.method1800((byte) -112, i_11_,
							  true, i_9_);
			}
		    }
		}
	    }
	    int i_13_ = 7 % ((60 - arg0) / 43);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "si.B(" + arg0 + ')');
	}
    }
}
