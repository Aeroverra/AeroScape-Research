/* Class14_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub13 extends Class14
{
    public static int anInt2954;
    public static Class124 aClass124_2955
	= Class14_Sub2_Sub2.method263(1178, "Fallen lassen");
    public static int anInt2956;
    public static int anInt2957;
    public static Class9_Sub1 aClass9_Sub1_2958;
    public static int anInt2959;
    public static Interface3 anInterface3_2960;
    public static int anInt2961;
    public static int anInt2962;
    public long aLong2963;
    public static int anInt2964 = 0;
    
    public static void method858(int arg0) {
	try {
	    if (arg0 != -1)
		method861(-123, 57, (byte) -1, 25, 48, 31, 123);
	    anInt2957++;
	    Class60.aBoolean983 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ki.G(" + arg0 + ')');
	}
    }
    
    public static void method859(int arg0, int arg1) {
	try {
	    anInt2959++;
	    Class14_Sub2_Sub14.aClass52_3942.method1208((byte) -112, arg1);
	    if (arg0 != 0)
		method861(103, -45, (byte) 72, -58, 112, -24, 116);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ki.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static Class125_Sub3 method860(Class14_Sub10 arg0, boolean arg1) {
	Class125_Sub3 class125_sub3;
	try {
	    anInt2954++;
	    if (arg1 != true)
		method861(-50, 110, (byte) 88, 69, 33, 3, 63);
	    class125_sub3
		= new Class125_Sub3(arg0.method805(0), arg0.method805(0),
				    arg0.method805(0), arg0.method805(0),
				    arg0.method805(0), arg0.method805(0),
				    arg0.method805(0), arg0.method805(0),
				    arg0.method829(-119), arg0.method798(101));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ki.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class125_sub3;
    }
    
    public static void method861(int arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	try {
	    Class128.method1758(arg3, (byte) 98);
	    int i = 0;
	    int i_0_ = arg3 + -arg6;
	    anInt2956++;
	    int i_1_ = -arg3;
	    if ((i_0_ ^ 0xffffffff) > -1)
		i_0_ = 0;
	    int i_2_ = arg3;
	    int i_3_ = i_0_;
	    int i_4_ = -1;
	    int i_5_ = -i_0_;
	    if (arg2 != -100)
		method864(-32L, (byte) -39);
	    int i_6_ = -1;
	    int[] is = Class14_Sub2_Sub19.anIntArrayArray4038[arg4];
	    int i_7_ = arg0 - i_0_;
	    int i_8_ = i_0_ + arg0;
	    Class51.method1201(is, -arg3 + arg0, i_7_, -5973, arg5);
	    Class51.method1201(is, i_7_, i_8_, -5973, arg1);
	    Class51.method1201(is, i_8_, arg0 - -arg3, -5973, arg5);
	    while ((i ^ 0xffffffff) > (i_2_ ^ 0xffffffff)) {
		i_4_ += 2;
		i_1_ += i_4_;
		i_6_ += 2;
		i_5_ += i_6_;
		if (i_5_ >= 0 && i_3_ >= 1) {
		    Class14_Sub8_Sub6.anIntArray4191[i_3_] = i;
		    i_3_--;
		    i_5_ -= i_3_ << 2106965825;
		}
		i++;
		if ((i_1_ ^ 0xffffffff) <= -1) {
		    i_2_--;
		    i_1_ -= i_2_ << 46104577;
		    if (i_0_ <= i_2_) {
			int[] is_9_ = (Class14_Sub2_Sub19.anIntArrayArray4038
				       [arg4 + -i_2_]);
			int i_10_ = i + arg0;
			int[] is_11_ = (Class14_Sub2_Sub19.anIntArrayArray4038
					[arg4 - -i_2_]);
			int i_12_ = -i + arg0;
			Class51.method1201(is_11_, i_12_, i_10_, -5973, arg5);
			Class51.method1201(is_9_, i_12_, i_10_, arg2 + -5873,
					   arg5);
		    } else {
			int[] is_13_ = (Class14_Sub2_Sub19.anIntArrayArray4038
					[arg4 - i_2_]);
			int i_14_ = arg0 - -i;
			int[] is_15_ = (Class14_Sub2_Sub19.anIntArrayArray4038
					[i_2_ + arg4]);
			int i_16_ = Class14_Sub8_Sub6.anIntArray4191[i_2_];
			int i_17_ = arg0 + -i_16_;
			int i_18_ = -i + arg0;
			int i_19_ = i_16_ + arg0;
			Class51.method1201(is_15_, i_18_, i_17_, -5973, arg5);
			Class51.method1201(is_15_, i_17_, i_19_, -5973, arg1);
			Class51.method1201(is_15_, i_19_, i_14_, -5973, arg5);
			Class51.method1201(is_13_, i_18_, i_17_, -5973, arg5);
			Class51.method1201(is_13_, i_17_, i_19_, -5973, arg1);
			Class51.method1201(is_13_, i_19_, i_14_, -5973, arg5);
		    }
		}
		int[] is_20_
		    = Class14_Sub2_Sub19.anIntArrayArray4038[arg4 + i];
		int[] is_21_
		    = Class14_Sub2_Sub19.anIntArrayArray4038[-i + arg4];
		int i_22_ = i_2_ + arg0;
		int i_23_ = arg0 - i_2_;
		if (i_0_ > i) {
		    int i_24_ = (i_3_ >= i ? i_3_
				 : Class14_Sub8_Sub6.anIntArray4191[i]);
		    int i_25_ = arg0 + i_24_;
		    int i_26_ = -i_24_ + arg0;
		    Class51.method1201(is_20_, i_23_, i_26_, -5973, arg5);
		    Class51.method1201(is_20_, i_26_, i_25_, -5973, arg1);
		    Class51.method1201(is_20_, i_25_, i_22_, -5973, arg5);
		    Class51.method1201(is_21_, i_23_, i_26_, -5973, arg5);
		    Class51.method1201(is_21_, i_26_, i_25_, -5973, arg1);
		    Class51.method1201(is_21_, i_25_, i_22_, -5973, arg5);
		} else {
		    Class51.method1201(is_20_, i_23_, i_22_, -5973, arg5);
		    Class51.method1201(is_21_, i_23_, i_22_, -5973, arg5);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ki.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
    }
    
    public static void method862(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    if (arg0 <= 121)
		aClass124_2955 = null;
	    for (int i = 0; i < Class14_Sub17.anInt3012; i++) {
		if (Class110.anIntArray1854[i] + Class9.anIntArray215[i] > arg4
		    && (Class9.anIntArray215[i] ^ 0xffffffff) > (arg4 - -arg1
								 ^ 0xffffffff)
		    && arg3 < (Class74.anIntArray1135[i]
			       + Class137.anIntArray2205[i])
		    && Class74.anIntArray1135[i] < arg3 + arg2)
		    Class14_Sub8_Sub36.aBooleanArray4698[i] = true;
	    }
	    anInt2961++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ki.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method863(byte arg0) {
	try {
	    anInterface3_2960 = null;
	    aClass9_Sub1_2958 = null;
	    aClass124_2955 = null;
	    if (arg0 < 66)
		anInterface3_2960 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ki.B(" + arg0 + ')');
	}
    }
    
    public static void method864(long arg0, byte arg1) {
    while_586_:
	do {
	while_585_:
	    do {
		do {
		    try {
			if (arg1 != 64)
			    method858(13);
			anInt2962++;
			if (arg0 > 0L)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_585_;
		    }
		    return;
		} while (false);
		try {
		    if (-1L != (arg0 % 10L ^ 0xffffffffffffffffL))
			Class126.method1742((byte) -74, arg0);
		    else {
			Class126.method1742((byte) -94, arg0 - 1L);
			Class126.method1742((byte) -83, 1L);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_586_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ki.F(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public Class14_Sub13() {
	/* empty */
    }
    
    public Class14_Sub13(long arg0) {
	try {
	    aLong2963 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ki.<init>(" + arg0 + ')');
	}
    }
}
