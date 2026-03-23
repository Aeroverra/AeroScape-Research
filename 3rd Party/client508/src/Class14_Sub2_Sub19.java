/* Class14_Sub2_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class14_Sub2_Sub19 extends Class14_Sub2
{
    public static int anInt4030;
    public static int anInt4031 = 0;
    public static int anInt4032;
    public int anInt4033;
    public int anInt4034;
    public int anInt4035;
    public static int anInt4036;
    public static Class104 aClass104_4037;
    public static int[][] anIntArrayArray4038;
    public static Class124 aClass124_4039
	= Class14_Sub2_Sub2.method263(1178, "");
    public static Class124 aClass124_4040;
    public static Class124 aClass124_4041
	= Class14_Sub2_Sub2.method263(1178, "<)4col> x");
    public int anInt4042;
    public static int anInt4043;
    public static Class124 aClass124_4044
	= Class14_Sub2_Sub2.method263(1178, ")1p");
    public static Class124 aClass124_4045;
    public int anInt4046;
    public static int anInt4047;
    public static Class55 aClass55_4048;
    public static Class124 aClass124_4049
	= (Class14_Sub2_Sub2.method263
	   (1178, "Your ignore list is full)3 Max of 100 users)3"));
    public int anInt4050;
    public static Class124 aClass124_4051;
    public static int[] anIntArray4052;
    public static Class52 aClass52_4053;
    
    public static void method388(int arg0) {
	try {
	    anIntArray4052 = null;
	    aClass124_4045 = null;
	    aClass124_4040 = null;
	    anIntArrayArray4038 = null;
	    aClass124_4051 = null;
	    aClass124_4049 = null;
	    aClass124_4039 = null;
	    aClass124_4041 = null;
	    aClass52_4053 = null;
	    aClass55_4048 = null;
	    aClass124_4044 = null;
	    int i = 120 / ((-40 - arg0) / 41);
	    aClass104_4037 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "se.DA(" + arg0 + ')');
	}
    }
    
    public abstract void method389(int i, int i_0_, int i_1_, int i_2_);
    
    public abstract void method390(int i, int i_3_);
    
    public abstract void method391(int i, int i_4_);
    
    public static Class148[] method392(int arg0) {
    while_223_:
	do {
	    Class148[] class148s;
	    do {
		Class148[] class148s_5_;
		try {
		    class148s = new Class148[Class32.anInt547];
		    if (arg0 > 99)
			break;
		    class148s_5_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_223_;
		}
		return class148s_5_;
	    } while (false);
	    Class148[] class148s_6_;
	    try {
		for (int i = 0; i < Class32.anInt547; i++)
		    class148s[i]
			= new Class148_Sub2(Class14_Sub11.anInt2952,
					    Class14_Sub30.anInt3279,
					    Class40.anIntArray675[i],
					    (Class14_Sub2_Sub12.anIntArray3918
					     [i]),
					    Class17.anIntArray402[i],
					    Class76.anIntArray1204[i],
					    Class12.aByteArrayArray310[i],
					    Class73.anIntArray1114);
		anInt4030++;
		Class129.method1761((byte) 97);
		class148s_6_ = class148s;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148s_6_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "se.FA(" + arg0 + ')');
    }
    
    public void method393(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    anInt4047++;
	    if (arg4 != 0)
		method390(-36, -88);
	    int i = anInt4034 << 1493315683;
	    arg1 = (arg1 << -1761514908) + (i & 0xf);
	    int i_7_ = anInt4046 << -365948861;
	    arg2 = (0xf & i_7_) + (arg2 << 692134436);
	    method395(i, i_7_, arg1, arg2, arg0, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("se.HA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method394(byte arg0, Class14_Sub9 arg1) {
	try {
	    anInt4032++;
	    if (null != arg1.aClass14_Sub12_2866)
		arg1.aClass14_Sub12_2866.anInt2953 = 0;
	    arg1.aBoolean2864 = false;
	    if (arg0 > -21)
		method397(61, 28, (byte) 79, 56, 124, 36);
	    for (Class14_Sub9 class14_sub9 = arg1.method688();
		 class14_sub9 != null; class14_sub9 = arg1.method686())
		method394((byte) -39, class14_sub9);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("se.EA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public abstract void method395(int i, int i_8_, int i_9_, int i_10_,
				   int i_11_, int i_12_);
    
    public abstract void method396(int i, int i_13_, int i_14_, int i_15_,
				   int i_16_);
    
    public static void method397(int arg0, int arg1, byte arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    Class14_Sub8_Sub1.anInt4091 = arg5;
	    anInt4036++;
	    Class125.anInt2073 = arg3;
	    Class14_Sub20.anInt3091 = arg1;
	    Class137.anInt2194 = arg0;
	    Class14_Sub3.anInt2758 = arg4;
	    if (arg2 <= 56)
		method394((byte) -123, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("se.GA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public abstract void method398(int i, int i_17_, int i_18_);
    
    public static void method399(int arg0, int arg1, boolean arg2,
				 boolean arg3, int arg4, int arg5) {
	try {
	    Class42.anInt699++;
	    if (!arg2) {
		Class38.method1116(1, true);
		Class14_Sub2_Sub18_Sub2.method384(true, 10312);
		Class38.method1116(1, false);
	    }
	    anInt4043++;
	    Class14_Sub2_Sub18_Sub2.method384(false, 10312);
	    if (!arg2)
		Canvas_Sub2.method64((byte) 89);
	    Class153.method2046(-76);
	    Class35.method1092(arg5, true, arg4, arg0, 34, arg1);
	    arg5 = Class14_Sub8_Sub3.anInt4135;
	    arg0 = Class14_Sub19.anInt3071;
	    arg1 = anInt4031;
	    arg4 = Class14_Sub2_Sub15.anInt3952;
	    if (1 == Class89.anInt1415) {
		int i = Class2.anInt102;
		int i_19_
		    = (0x7ff
		       & Class142.anInt2307 + Class14_Sub8_Sub19.anInt4408);
		if ((i ^ 0xffffffff)
		    > (Class14_Sub8_Sub38.anInt4740 / 256 ^ 0xffffffff))
		    i = Class14_Sub8_Sub38.anInt4740 / 256;
		if (Class112.aBooleanArray1872[4]
		    && ((128 + Class14_Sub29.anIntArray3264[4] ^ 0xffffffff)
			< (i ^ 0xffffffff)))
		    i = 128 + Class14_Sub29.anIntArray3264[4];
		Class14_Sub8_Sub12.method543
		    (-50 + (Class26.method1017
			    (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495,
			     Class14_Sub2_Sub3.anInt3785, (byte) 11,
			     Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436)),
		     arg5, i, i_19_, Class55.anInt905, 90, 3 * i + 600,
		     Class140.anInt2238);
	    }
	    int i = Class14_Sub10.anInt2926;
	    int i_20_ = Class14_Sub30.anInt3271;
	    int i_21_ = Class14_Sub8_Sub38.anInt4741;
	    int i_22_ = Class69.anInt1072;
	    int i_23_ = Class7_Sub3_Sub1.anInt3719;
	    for (int i_24_ = 0; 5 > i_24_; i_24_++) {
		if (Class112.aBooleanArray1872[i_24_]) {
		    int i_25_
			= (int) ((double) (Class117.anIntArray1961[i_24_] * 2
					   + 1) * Math.random()
				 - (double) Class117.anIntArray1961[i_24_]
				 + (Math.sin((double) (Class14_Sub8_Sub15
						       .anIntArray4336[i_24_])
					     * ((double) (Class133_Sub3
							  .anIntArray3559
							  [i_24_])
						/ 100.0))
				    * (double) (Class14_Sub29.anIntArray3264
						[i_24_])));
		    if (1 == i_24_)
			Class14_Sub10.anInt2926 += i_25_;
		    if (i_24_ == 4) {
			Class7_Sub3_Sub1.anInt3719 += i_25_;
			if (-129 < (Class7_Sub3_Sub1.anInt3719 ^ 0xffffffff))
			    Class7_Sub3_Sub1.anInt3719 = 128;
			if (-384 > (Class7_Sub3_Sub1.anInt3719 ^ 0xffffffff))
			    Class7_Sub3_Sub1.anInt3719 = 383;
		    }
		    if ((i_24_ ^ 0xffffffff) == -1)
			Class14_Sub8_Sub38.anInt4741 += i_25_;
		    if (3 == i_24_)
			Class69.anInt1072 = 0x7ff & Class69.anInt1072 - -i_25_;
		    if (2 == i_24_)
			Class14_Sub30.anInt3271 += i_25_;
		}
	    }
	    Class35.method1097((byte) 125);
	    Class25.method999(arg0, arg1, arg0 + arg4, arg5 + arg1);
	    float f = 0.17578125F * (float) Class7_Sub3_Sub1.anInt3719;
	    float f_26_ = (float) Class69.anInt1072 * 0.17578125F;
	    if (-4 == (Class89.anInt1415 ^ 0xffffffff)) {
		f = 360.0F * Class14_Sub17.aFloat3023 / 6.2831855F;
		f_26_ = 360.0F * Class56_Sub1.aFloat3323 / 6.2831855F;
	    }
	    Class121.method1647(arg0, arg1, arg4, arg5, arg4 / 2 + arg0,
				arg1 + arg5 / 2, f, f_26_,
				Class14_Sub8_Sub10.anInt4251,
				Class14_Sub8_Sub10.anInt4251);
	    if (!Class133_Sub5.aBoolean3628
		&& (arg0 ^ 0xffffffff) >= (Class14_Sub8_Sub33.anInt4629
					   ^ 0xffffffff)
		&& arg4 + arg0 > Class14_Sub8_Sub33.anInt4629
		&& ((Class14_Sub8_Sub32.anInt4613 ^ 0xffffffff)
		    <= (arg1 ^ 0xffffffff))
		&& ((Class14_Sub8_Sub32.anInt4613 ^ 0xffffffff)
		    > (arg5 + arg1 ^ 0xffffffff))) {
		Class14_Sub15.anInt2996 = 0;
		int i_27_ = Class20.anInt425;
		int i_28_ = Class58.anInt948;
		int i_29_ = Class70.anInt1081;
		int i_30_ = Class14_Sub8_Sub27.anInt4547;
		Class90.aBoolean1417 = true;
		Class14_Sub2.anInt2726
		    = i_27_ + ((Class14_Sub8_Sub33.anInt4629 - arg0)
			       * (i_30_ - i_27_) / arg4);
		Class38.anInt2622
		    = i_28_ + ((i_29_ + -i_28_)
			       * (-arg1 + Class14_Sub8_Sub32.anInt4613)
			       / arg5);
	    } else {
		Class14_Sub15.anInt2996 = 0;
		Class90.aBoolean1417 = false;
	    }
	    Class138.method1946(139);
	    byte i_31_ = (2 == Class14_Sub2_Sub8.method296((byte) 79)
			  ? (byte) Class42.anInt699 : (byte) 1);
	    Class121.method1645();
	    Class121.method1652(true);
	    boolean bool = false;
	    Class121.method1626(true);
	    int i_32_;
	    if (-11 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff))
		i_32_ = (Class14_Sub8_Sub18.method576
			 (Class51.anInt839,
			  Class14_Sub8_Sub38.anInt4741 >> 1246909194,
			  Class14_Sub30.anInt3271 >> 1076782218, -3217,
			  Class14_Sub8_Sub6.anInt4190));
	    else
		i_32_ = (Class14_Sub8_Sub18.method576
			 (Class51.anInt839,
			  (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476
			   [0]) >> -1107671517,
			  (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443
			   [0]) >> 462361923,
			  -3217, Class14_Sub8_Sub6.anInt4190));
	    Class10.method190(Class14_Sub2_Sub20.anInt4064,
			      !Class33.aBoolean584);
	    Class121.method1631(i_32_);
	    method397(Class7_Sub3_Sub1.anInt3719, Class14_Sub30.anInt3271,
		      (byte) 124, Class14_Sub8_Sub38.anInt4741,
		      Class14_Sub10.anInt2926, Class69.anInt1072);
	    Class121.anInt2045 = Class14_Sub2_Sub20.anInt4064;
	    Class14_Sub8_Sub21.method588
		(Class14_Sub8_Sub38.anInt4741, Class14_Sub10.anInt2926,
		 Class14_Sub30.anInt3271, Class7_Sub3_Sub1.anInt3719,
		 Class69.anInt1072, Class28.aByteArrayArrayArray512,
		 Class14_Sub2_Sub11.anIntArray3872,
		 Class14_Sub8_Sub20.anIntArray4422,
		 Class14_Sub19.anIntArray3079, Class120.anIntArray2008,
		 Class96.anIntArray1630, 1 + Class14_Sub2_Sub3.anInt3785,
		 i_31_,
		 Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 753088071,
		 Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 965417959);
	    Class89.aBoolean1409 = true;
	    Class10.method188();
	    method397(0, 0, (byte) 89, 0, 0, 0);
	    Class138.method1946(139);
	    Class14_Sub2_Sub9.method304();
	    Class14_Sub7.method469(arg5, arg0, Class14_Sub8_Sub10.anInt4251,
				   arg4, arg3, arg1,
				   Class14_Sub8_Sub10.anInt4251);
	    Class120.method1615(arg4, Class14_Sub8_Sub10.anInt4251, arg0,
				Class14_Sub8_Sub10.anInt4251, -26, arg5, arg1);
	    ((Class134) Class3.anInterface3_117).method1922(Class51.anInt839,
							    (byte) -118);
	    Class75.method1343(arg1, -74, arg0, arg4, arg5);
	    Class7_Sub3_Sub1.anInt3719 = i_23_;
	    Class14_Sub10.anInt2926 = i;
	    Class69.anInt1072 = i_22_;
	    Class14_Sub8_Sub38.anInt4741 = i_21_;
	    Class14_Sub30.anInt3271 = i_20_;
	    if (Class14_Sub1.aBoolean2722
		&& Class14_Sub25.method917(false, true, (byte) 96) == 0)
		Class14_Sub1.aBoolean2722 = false;
	    if (Class14_Sub1.aBoolean2722) {
		Class25.method1004(arg0, arg1, arg4, arg5, 0);
		Class84.method1411(false, client.aClass124_2639, true);
	    }
	    if (!arg2 && !Class14_Sub1.aBoolean2722
		&& !Class133_Sub5.aBoolean3628
		&& ((Class14_Sub8_Sub33.anInt4629 ^ 0xffffffff)
		    <= (arg0 ^ 0xffffffff))
		&& (arg4 + arg0 ^ 0xffffffff) < (Class14_Sub8_Sub33.anInt4629
						 ^ 0xffffffff)
		&& Class14_Sub8_Sub32.anInt4613 >= arg1
		&& arg5 + arg1 > Class14_Sub8_Sub32.anInt4613)
		Class14_Sub8_Sub28.method628(Class14_Sub8_Sub33.anInt4629,
					     Class14_Sub8_Sub32.anInt4613,
					     arg0, arg1, arg3, arg4, arg5);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("se.CA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public abstract void method400(int i, int i_33_, int i_34_, int i_35_);
    
    static {
	aClass124_4045 = aClass124_4049;
	aClass124_4040
	    = Class14_Sub2_Sub2.method263(1178,
					  "Starte 3D)2Softwarebibliothek)3");
	aClass55_4048 = new Class55(16);
	aClass124_4051 = Class14_Sub2_Sub2.method263(1178, "(U(Y");
	anIntArray4052 = new int[50];
	aClass52_4053 = new Class52(30);
    }
}
