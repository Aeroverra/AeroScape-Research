/* Class14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub4 extends Class14
{
    public int anInt2776;
    public int anInt2777;
    public int anInt2778;
    public int anInt2779;
    public static int anInt2780;
    public static int anInt2781;
    public static int anInt2782;
    public static int anInt2783;
    public static boolean aBoolean2784;
    public static Class133_Sub1_Sub2[] aClass133_Sub1_Sub2Array2785;
    public static int[] anIntArray2786 = new int[32];
    public static Class2 aClass2_2787;
    public static int anInt2788;
    public static int anInt2789;
    public static volatile int anInt2790;
    
    public static void method454(Class14_Sub29 arg0, boolean arg1) {
	Class14_Sub8_Sub23.aClass2_4477.method80(arg0, (byte) -120);
    while_242_:
	for (;;) {
	    Class14_Sub29 class14_sub29
		= ((Class14_Sub29)
		   Class14_Sub8_Sub23.aClass2_4477.method78(128));
	    if (class14_sub29 == null)
		break;
	    if (class14_sub29.aBoolean3240) {
		int i = class14_sub29.anInt3258;
		int i_0_ = class14_sub29.anInt3239;
		int i_1_ = class14_sub29.anInt3243;
		int i_2_ = class14_sub29.anInt3261;
		Class14_Sub29[][] class14_sub29s
		    = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_1_];
		float f = 0.0F;
		if (Class150.anIntArrayArrayArray2419
		    == Class114.anIntArrayArrayArray1896) {
		    int i_3_ = Class14_Sub5.anIntArrayArray2799[i][i_0_];
		    int i_4_ = i_3_ & 0xffffff;
		    if (i_4_ != Class7_Sub1.anInt2653) {
			Class7_Sub1.anInt2653 = i_4_;
			Class68.method1304(55, i_4_);
			Class57.method1246(Class115.method1590(false));
		    }
		    int i_5_ = i_3_ >>> 24 << 3;
		    if (i_5_ != Class14_Sub8_Sub35.anInt4675) {
			Class14_Sub8_Sub35.anInt4675 = i_5_;
			Class107.method1549(i_5_, 3);
		    }
		    int i_6_
			= ((Class149.anIntArrayArrayArray2391[0][i][i_0_]
			    + Class149.anIntArrayArrayArray2391[0][i + 1][i_0_]
			    + Class149.anIntArrayArrayArray2391[0][i][i_0_ + 1]
			    + (Class149.anIntArrayArrayArray2391[0][i + 1]
			       [i_0_ + 1]))
			   >> 2);
		    Class132.method1778(3, (byte) 125, -i_6_);
		    f = 201.5F;
		    Class121.method1640(f);
		} else {
		    f = 201.5F - 50.0F * (float) (i_2_ + 1);
		    Class121.method1640(f);
		}
		if (class14_sub29.aBoolean3235) {
		    if (arg1) {
			if (i_1_ > 0) {
			    Class14_Sub29 class14_sub29_7_
				= (Class125_Sub1
				   .aClass14_Sub29ArrayArrayArray3368[i_1_ - 1]
				   [i][i_0_]);
			    if (class14_sub29_7_ != null
				&& class14_sub29_7_.aBoolean3240)
				continue;
			}
			if (i <= Class71.anInt1101
			    && i > Class7_Sub1.anInt2659) {
			    Class14_Sub29 class14_sub29_8_
				= class14_sub29s[i - 1][i_0_];
			    if (class14_sub29_8_ != null
				&& class14_sub29_8_.aBoolean3240
				&& (class14_sub29_8_.aBoolean3235
				    || (class14_sub29.anInt3249 & 0x1) == 0))
				continue;
			}
			if (i >= Class71.anInt1101
			    && i < Class14_Sub8_Sub37.anInt4722 - 1) {
			    Class14_Sub29 class14_sub29_9_
				= class14_sub29s[i + 1][i_0_];
			    if (class14_sub29_9_ != null
				&& class14_sub29_9_.aBoolean3240
				&& (class14_sub29_9_.aBoolean3235
				    || (class14_sub29.anInt3249 & 0x4) == 0))
				continue;
			}
			if (i_0_ <= Class102.anInt1724
			    && i_0_ > Class14_Sub9_Sub3.anInt4849) {
			    Class14_Sub29 class14_sub29_10_
				= class14_sub29s[i][i_0_ - 1];
			    if (class14_sub29_10_ != null
				&& class14_sub29_10_.aBoolean3240
				&& (class14_sub29_10_.aBoolean3235
				    || (class14_sub29.anInt3249 & 0x8) == 0))
				continue;
			}
			if (i_0_ >= Class102.anInt1724
			    && i_0_ < Class14_Sub8_Sub26.anInt4526 - 1) {
			    Class14_Sub29 class14_sub29_11_
				= class14_sub29s[i][i_0_ + 1];
			    if (class14_sub29_11_ != null
				&& class14_sub29_11_.aBoolean3240
				&& (class14_sub29_11_.aBoolean3235
				    || (class14_sub29.anInt3249 & 0x2) == 0))
				continue;
			}
		    } else
			arg1 = true;
		    class14_sub29.aBoolean3235 = false;
		    if (class14_sub29.aClass14_Sub29_3260 != null) {
			Class14_Sub29 class14_sub29_12_
			    = class14_sub29.aClass14_Sub29_3260;
			Class121.method1640(201.5F
					    - (50.0F
					       * (float) ((class14_sub29_12_
							   .anInt3261)
							  + 1)));
			if (class14_sub29_12_.aClass153_3248 != null) {
			    if (!Class103.method1529(0, i, i_0_))
				Class14_Sub30.method940((class14_sub29_12_
							 .aClass153_3248),
							0, Class150.anInt2420,
							(Class7_Sub3_Sub1
							 .anInt3718),
							Class14_Sub1.anInt2719,
							Class37.anInt643, i,
							i_0_, false);
			    else
				Class14_Sub30.method940((class14_sub29_12_
							 .aClass153_3248),
							0, Class150.anInt2420,
							(Class7_Sub3_Sub1
							 .anInt3718),
							Class14_Sub1.anInt2719,
							Class37.anInt643, i,
							i_0_, true);
			} else if (class14_sub29_12_.aClass6_3233 != null) {
			    if (!Class103.method1529(0, i, i_0_))
				Class12.method210((class14_sub29_12_
						   .aClass6_3233),
						  Class150.anInt2420,
						  Class7_Sub3_Sub1.anInt3718,
						  Class14_Sub1.anInt2719,
						  Class37.anInt643, i, i_0_,
						  false);
			    else
				Class12.method210((class14_sub29_12_
						   .aClass6_3233),
						  Class150.anInt2420,
						  Class7_Sub3_Sub1.anInt3718,
						  Class14_Sub1.anInt2719,
						  Class37.anInt643, i, i_0_,
						  true);
			}
			Class113 class113 = class14_sub29_12_.aClass113_3250;
			if (class113 != null) {
			    if ((class113.anInt1880 & class14_sub29.anInt3236)
				!= 0)
				Class10.method192(class113.anInt1880,
						  Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_2_, i, i_0_);
			    else
				Class10.method187(Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_1_, i, i_0_);
			    class113.aClass133_1877.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class113.anInt1878 - Class4.anInt125,
				 class113.anInt1882 - Class14_Sub2.anInt2741,
				 (class113.anInt1886
				  - Class14_Sub2_Sub8.anInt3853),
				 class113.aLong1887);
			}
			for (int i_13_ = 0;
			     i_13_ < class14_sub29_12_.anInt3242; i_13_++) {
			    Class40 class40
				= class14_sub29_12_.aClass40Array3257[i_13_];
			    if (class40 != null) {
				Class10.method187(Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_1_, i, i_0_);
				class40.aClass133_679.method1792
				    (class40.anInt663, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class40.anInt667 - Class4.anInt125,
				     class40.anInt671 - Class14_Sub2.anInt2741,
				     (class40.anInt666
				      - Class14_Sub2_Sub8.anInt3853),
				     class40.aLong677);
			    }
			}
			Class121.method1640(f);
		    }
		    boolean bool = false;
		    if (class14_sub29.aClass153_3248 != null) {
			if (!Class103.method1529(i_2_, i, i_0_)) {
			    bool = true;
			    if ((class14_sub29.aClass153_3248.anInt2443
				 != 12345678)
				|| (Class142.aBoolean2299
				    && i_1_ <= Class86.anInt1389))
				Class14_Sub30.method940
				    (class14_sub29.aClass153_3248, i_2_,
				     Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     i, i_0_, false);
			} else
			    Class14_Sub30.method940((class14_sub29
						     .aClass153_3248),
						    i_2_, Class150.anInt2420,
						    Class7_Sub3_Sub1.anInt3718,
						    Class14_Sub1.anInt2719,
						    Class37.anInt643, i, i_0_,
						    true);
		    } else if (class14_sub29.aClass6_3233 != null) {
			if (!Class103.method1529(i_2_, i, i_0_)) {
			    bool = true;
			    Class12.method210(class14_sub29.aClass6_3233,
					      Class150.anInt2420,
					      Class7_Sub3_Sub1.anInt3718,
					      Class14_Sub1.anInt2719,
					      Class37.anInt643, i, i_0_,
					      false);
			} else
			    Class12.method210(class14_sub29.aClass6_3233,
					      Class150.anInt2420,
					      Class7_Sub3_Sub1.anInt3718,
					      Class14_Sub1.anInt2719,
					      Class37.anInt643, i, i_0_, true);
		    }
		    if (bool) {
			Class4 class4 = class14_sub29.aClass4_3237;
			if (class4 != null
			    && (class4.aLong132 & 0x80000000L) != 0L) {
			    if (class4.aBoolean133)
				Class121.method1640(f + 50.0F - 1.5F);
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    class4.aClass133_124.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class4.anInt136 - Class4.anInt125,
				 class4.anInt121 - Class14_Sub2.anInt2741,
				 class4.anInt122 - Class14_Sub2_Sub8.anInt3853,
				 class4.aLong132);
			    if (class4.aBoolean133)
				Class121.method1640(f);
			}
		    }
		    int i_14_ = 0;
		    int i_15_ = 0;
		    Class113 class113 = class14_sub29.aClass113_3250;
		    Class37 class37 = class14_sub29.aClass37_3255;
		    if (class113 != null || class37 != null) {
			if (Class71.anInt1101 == i)
			    i_14_++;
			else if (Class71.anInt1101 < i)
			    i_14_ += 2;
			if (Class102.anInt1724 == i_0_)
			    i_14_ += 3;
			else if (Class102.anInt1724 > i_0_)
			    i_14_ += 6;
			i_15_ = Class14_Sub22.anIntArray3117[i_14_];
			class14_sub29.anInt3236
			    = Class14_Sub8_Sub32.anIntArray4618[i_14_];
		    }
		    if (class113 != null) {
			if ((class113.anInt1880
			     & Class14_Sub2_Sub8.anIntArray3834[i_14_])
			    != 0) {
			    if (class113.anInt1880 == 16) {
				class14_sub29.anInt3231 = 3;
				class14_sub29.anInt3252
				    = Class125.anIntArray2081[i_14_];
				class14_sub29.anInt3234
				    = 3 - class14_sub29.anInt3252;
			    } else if (class113.anInt1880 == 32) {
				class14_sub29.anInt3231 = 6;
				class14_sub29.anInt3252
				    = Class14_Sub2_Sub21.anIntArray4077[i_14_];
				class14_sub29.anInt3234
				    = 6 - class14_sub29.anInt3252;
			    } else if (class113.anInt1880 == 64) {
				class14_sub29.anInt3231 = 12;
				class14_sub29.anInt3252
				    = Class14_Sub8_Sub1.anIntArray4104[i_14_];
				class14_sub29.anInt3234
				    = 12 - class14_sub29.anInt3252;
			    } else {
				class14_sub29.anInt3231 = 9;
				class14_sub29.anInt3252
				    = Canvas_Sub2.anIntArray65[i_14_];
				class14_sub29.anInt3234
				    = 9 - class14_sub29.anInt3252;
			    }
			} else
			    class14_sub29.anInt3231 = 0;
			if ((class113.anInt1880 & i_15_) != 0
			    && !Class103.method1530(i_2_, i, i_0_,
						    class113.anInt1880)) {
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    class113.aClass133_1877.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class113.anInt1878 - Class4.anInt125,
				 class113.anInt1882 - Class14_Sub2.anInt2741,
				 (class113.anInt1886
				  - Class14_Sub2_Sub8.anInt3853),
				 class113.aLong1887);
			}
			if ((class113.anInt1888 & i_15_) != 0
			    && !Class103.method1530(i_2_, i, i_0_,
						    class113.anInt1888)) {
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    class113.aClass133_1884.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class113.anInt1878 - Class4.anInt125,
				 class113.anInt1882 - Class14_Sub2.anInt2741,
				 (class113.anInt1886
				  - Class14_Sub2_Sub8.anInt3853),
				 class113.aLong1887);
			}
		    }
		    if (class37 != null
			&& !Class94.method1478(i_2_, i, i_0_,
					       class37.aClass133_642
						   .method1781())) {
			Class121.method1640(f - 0.5F);
			if ((class37.anInt649 & i_15_) != 0) {
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    class37.aClass133_642.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 (class37.anInt653 - Class4.anInt125
				  + class37.anInt641),
				 class37.anInt650 - Class14_Sub2.anInt2741,
				 (class37.anInt633
				  - Class14_Sub2_Sub8.anInt3853
				  + class37.anInt646),
				 class37.aLong634);
			} else if (class37.anInt649 == 256) {
			    int i_16_ = class37.anInt653 - Class4.anInt125;
			    int i_17_
				= class37.anInt650 - Class14_Sub2.anInt2741;
			    int i_18_ = (class37.anInt633
					 - Class14_Sub2_Sub8.anInt3853);
			    int i_19_ = class37.anInt647;
			    int i_20_;
			    if (i_19_ == 1 || i_19_ == 2)
				i_20_ = -i_16_;
			    else
				i_20_ = i_16_;
			    int i_21_;
			    if (i_19_ == 2 || i_19_ == 3)
				i_21_ = -i_18_;
			    else
				i_21_ = i_18_;
			    if (i_21_ < i_20_) {
				Class10.method187(Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_1_, i, i_0_);
				class37.aClass133_642.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     i_16_ + class37.anInt641, i_17_,
				     i_18_ + class37.anInt646,
				     class37.aLong634);
			    } else if (class37.aClass133_638 != null) {
				Class10.method187(Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_1_, i, i_0_);
				class37.aClass133_638.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     i_16_, i_17_, i_18_, class37.aLong634);
			    }
			}
			Class121.method1640(f);
		    }
		    if (bool) {
			Class4 class4 = class14_sub29.aClass4_3237;
			if (class4 != null
			    && (class4.aLong132 & 0x80000000L) == 0L) {
			    if (class4.aBoolean133)
				Class121.method1640(f + 50.0F - 1.5F);
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    class4.aClass133_124.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class4.anInt136 - Class4.anInt125,
				 class4.anInt121 - Class14_Sub2.anInt2741,
				 class4.anInt122 - Class14_Sub2_Sub8.anInt3853,
				 class4.aLong132);
			    if (class4.aBoolean133)
				Class121.method1640(f);
			}
			Class115 class115 = class14_sub29.aClass115_3256;
			if (class115 != null && class115.anInt1914 == 0) {
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    if (class115.aClass133_1926 != null)
				class115.aClass133_1926.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			    if (class115.aClass133_1921 != null)
				class115.aClass133_1921.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			    if (class115.aClass133_1919 != null)
				class115.aClass133_1919.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			}
		    }
		    int i_22_ = class14_sub29.anInt3249;
		    if (i_22_ != 0) {
			if (i < Class71.anInt1101 && (i_22_ & 0x4) != 0) {
			    Class14_Sub29 class14_sub29_23_
				= class14_sub29s[i + 1][i_0_];
			    if (class14_sub29_23_ != null
				&& class14_sub29_23_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_23_, (byte) -125);
			}
			if (i_0_ < Class102.anInt1724 && (i_22_ & 0x2) != 0) {
			    Class14_Sub29 class14_sub29_24_
				= class14_sub29s[i][i_0_ + 1];
			    if (class14_sub29_24_ != null
				&& class14_sub29_24_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_24_, (byte) -117);
			}
			if (i > Class71.anInt1101 && (i_22_ & 0x1) != 0) {
			    Class14_Sub29 class14_sub29_25_
				= class14_sub29s[i - 1][i_0_];
			    if (class14_sub29_25_ != null
				&& class14_sub29_25_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_25_, (byte) -118);
			}
			if (i_0_ > Class102.anInt1724 && (i_22_ & 0x8) != 0) {
			    Class14_Sub29 class14_sub29_26_
				= class14_sub29s[i][i_0_ - 1];
			    if (class14_sub29_26_ != null
				&& class14_sub29_26_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_26_, (byte) -124);
			}
		    }
		}
		if (class14_sub29.anInt3231 != 0) {
		    boolean bool = true;
		    for (int i_27_ = 0; i_27_ < class14_sub29.anInt3242;
			 i_27_++) {
			if ((class14_sub29.aClass40Array3257[i_27_].anInt662
			     != Class67.anInt1059)
			    && ((class14_sub29.anIntArray3247[i_27_]
				 & class14_sub29.anInt3231)
				== class14_sub29.anInt3252)) {
			    bool = false;
			    break;
			}
		    }
		    if (bool) {
			Class113 class113 = class14_sub29.aClass113_3250;
			if (!Class103.method1530(i_2_, i, i_0_,
						 class113.anInt1880)) {
			    do {
				if ((class113.aLong1887 & 0xfc000L)
				    == 16384L) {
				    int i_28_
					= class113.anInt1878 - Class4.anInt125;
				    int i_29_
					= (class113.anInt1886
					   - Class14_Sub2_Sub8.anInt3853);
				    int i_30_ = (int) (class113.aLong1887 >> 20
						       & 0x3L);
				    if (i_30_ == 0) {
					i_28_ -= 64;
					i_29_ += 64;
					if (i_29_ < i_28_ && i > 0
					    && i_0_ < (Class14_Sub8_Sub15
						       .anInt4337) - 1) {
					    Class10.method187
						(Class4.anInt125,
						 Class14_Sub2.anInt2741,
						 Class14_Sub2_Sub8.anInt3853,
						 i_1_, i - 1, i_0_ + 1);
					    break;
					}
				    } else if (i_30_ == 1) {
					i_28_ += 64;
					i_29_ += 64;
					if (i_29_ < -i_28_
					    && i < Class99_Sub2.anInt3338 - 1
					    && i_0_ < (Class14_Sub8_Sub15
						       .anInt4337) - 1) {
					    Class10.method187
						(Class4.anInt125,
						 Class14_Sub2.anInt2741,
						 Class14_Sub2_Sub8.anInt3853,
						 i_1_, i + 1, i_0_ + 1);
					    break;
					}
				    } else if (i_30_ == 2) {
					i_28_ += 64;
					i_29_ -= 64;
					if (i_29_ > i_28_
					    && i < Class99_Sub2.anInt3338 - 1
					    && i_0_ > 0) {
					    Class10.method187
						(Class4.anInt125,
						 Class14_Sub2.anInt2741,
						 Class14_Sub2_Sub8.anInt3853,
						 i_1_, i + 1, i_0_ - 1);
					    break;
					}
				    } else if (i_30_ == 3) {
					i_28_ -= 64;
					i_29_ -= 64;
					if (i_29_ > -i_28_ && i > 0
					    && i_0_ > 0) {
					    Class10.method187
						(Class4.anInt125,
						 Class14_Sub2.anInt2741,
						 Class14_Sub2_Sub8.anInt3853,
						 i_1_, i - 1, i_0_ - 1);
					    break;
					}
				    }
				}
				Class10.method187(Class4.anInt125,
						  Class14_Sub2.anInt2741,
						  Class14_Sub2_Sub8.anInt3853,
						  i_1_, i, i_0_);
			    } while (false);
			    class113.aClass133_1877.method1792
				(0, Class150.anInt2420,
				 Class7_Sub3_Sub1.anInt3718,
				 Class14_Sub1.anInt2719, Class37.anInt643,
				 class113.anInt1878 - Class4.anInt125,
				 class113.anInt1882 - Class14_Sub2.anInt2741,
				 (class113.anInt1886
				  - Class14_Sub2_Sub8.anInt3853),
				 class113.aLong1887);
			}
			class14_sub29.anInt3231 = 0;
		    }
		}
		if (class14_sub29.aBoolean3251) {
		    do {
			try {
			    int i_31_ = class14_sub29.anInt3242;
			    class14_sub29.aBoolean3251 = false;
			    int i_32_ = 0;
			while_241_:
			    for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
				Class40 class40
				    = class14_sub29.aClass40Array3257[i_33_];
				if (class40.anInt662 != Class67.anInt1059) {
				    for (int i_34_ = class40.anInt668;
					 i_34_ <= class40.anInt670; i_34_++) {
					for (int i_35_ = class40.anInt678;
					     i_35_ <= class40.anInt669;
					     i_35_++) {
					    Class14_Sub29 class14_sub29_36_
						= class14_sub29s[i_34_][i_35_];
					    if (class14_sub29_36_
						.aBoolean3235) {
						class14_sub29.aBoolean3251
						    = true;
						continue while_241_;
					    }
					    if (class14_sub29_36_.anInt3231
						!= 0) {
						int i_37_ = 0;
						if (i_34_ > class40.anInt668)
						    i_37_++;
						if (i_34_ < class40.anInt670)
						    i_37_ += 4;
						if (i_35_ > class40.anInt678)
						    i_37_ += 8;
						if (i_35_ < class40.anInt669)
						    i_37_ += 2;
						if ((i_37_ & (class14_sub29_36_
							      .anInt3231))
						    == (class14_sub29
							.anInt3234)) {
						    class14_sub29.aBoolean3251
							= true;
						    continue while_241_;
						}
					    }
					}
				    }
				    Class14_Sub8_Sub4.aClass40Array4143
					[i_32_++]
					= class40;
				    int i_38_
					= Class71.anInt1101 - class40.anInt668;
				    int i_39_
					= class40.anInt670 - Class71.anInt1101;
				    if (i_39_ > i_38_)
					i_38_ = i_39_;
				    int i_40_ = (Class102.anInt1724
						 - class40.anInt678);
				    int i_41_ = (class40.anInt669
						 - Class102.anInt1724);
				    if (i_41_ > i_40_)
					class40.anInt673 = i_38_ + i_41_;
				    else
					class40.anInt673 = i_38_ + i_40_;
				}
			    }
			    while (i_32_ > 0) {
				int i_42_ = -50;
				int i_43_ = -1;
				for (int i_44_ = 0; i_44_ < i_32_; i_44_++) {
				    Class40 class40
					= (Class14_Sub8_Sub4.aClass40Array4143
					   [i_44_]);
				    if (class40.anInt662
					!= Class67.anInt1059) {
					if (class40.anInt673 > i_42_) {
					    i_42_ = class40.anInt673;
					    i_43_ = i_44_;
					} else if (class40.anInt673 == i_42_) {
					    int i_45_ = (class40.anInt667
							 - Class4.anInt125);
					    int i_46_ = (class40.anInt666
							 - (Class14_Sub2_Sub8
							    .anInt3853));
					    int i_47_ = ((Class14_Sub8_Sub4
							  .aClass40Array4143
							  [i_43_].anInt667)
							 - Class4.anInt125);
					    int i_48_ = ((Class14_Sub8_Sub4
							  .aClass40Array4143
							  [i_43_].anInt666)
							 - (Class14_Sub2_Sub8
							    .anInt3853));
					    if (i_45_ * i_45_ + i_46_ * i_46_
						> (i_47_ * i_47_
						   + i_48_ * i_48_))
						i_43_ = i_44_;
					}
				    }
				}
				if (i_43_ == -1)
				    break;
				Class40 class40 = (Class14_Sub8_Sub4
						   .aClass40Array4143[i_43_]);
				class40.anInt662 = Class67.anInt1059;
				if (!Class14_Sub8_Sub26.method619
				     (i_2_, class40.anInt668, class40.anInt670,
				      class40.anInt678, class40.anInt669,
				      class40.aClass133_679.method1781())) {
				    if ((class40.aLong677 & 0xfc000L)
					== 147456L) {
					Class10.method187(Class4.anInt125,
							  (Class14_Sub2
							   .anInt2741),
							  (Class14_Sub2_Sub8
							   .anInt3853),
							  i_1_, i, i_0_);
					int i_49_ = (class40.anInt667
						     - Class4.anInt125);
					int i_50_
					    = (class40.anInt666
					       - Class14_Sub2_Sub8.anInt3853);
					int i_51_
					    = (int) (class40.aLong677 >> 20
						     & 0x3L);
					if (i_51_ == 1 || i_51_ == 3) {
					    if (i_50_ > -i_49_)
						Class10.method196(i_1_, i,
								  i_0_ - 1,
								  i - 1, i_0_);
					    else
						Class10.method196(i_1_, i,
								  i_0_ + 1,
								  i + 1, i_0_);
					} else if (i_50_ > i_49_)
					    Class10.method196(i_1_, i,
							      i_0_ - 1, i + 1,
							      i_0_);
					else
					    Class10.method196(i_1_, i,
							      i_0_ + 1, i - 1,
							      i_0_);
				    } else
					Class10.method193(Class4.anInt125,
							  (Class14_Sub2
							   .anInt2741),
							  (Class14_Sub2_Sub8
							   .anInt3853),
							  i_1_,
							  class40.anInt668,
							  class40.anInt678,
							  class40.anInt670,
							  class40.anInt669);
				    class40.aClass133_679.method1792
					(class40.anInt663, Class150.anInt2420,
					 Class7_Sub3_Sub1.anInt3718,
					 Class14_Sub1.anInt2719,
					 Class37.anInt643,
					 class40.anInt667 - Class4.anInt125,
					 (class40.anInt671
					  - Class14_Sub2.anInt2741),
					 (class40.anInt666
					  - Class14_Sub2_Sub8.anInt3853),
					 class40.aLong677);
				}
				for (int i_52_ = class40.anInt668;
				     i_52_ <= class40.anInt670; i_52_++) {
				    for (int i_53_ = class40.anInt678;
					 i_53_ <= class40.anInt669; i_53_++) {
					Class14_Sub29 class14_sub29_54_
					    = class14_sub29s[i_52_][i_53_];
					if (class14_sub29_54_.anInt3231 != 0)
					    Class14_Sub8_Sub23.aClass2_4477
						.method80
						(class14_sub29_54_,
						 (byte) -126);
					else if ((i_52_ != i || i_53_ != i_0_)
						 && (class14_sub29_54_
						     .aBoolean3240))
					    Class14_Sub8_Sub23.aClass2_4477
						.method80
						(class14_sub29_54_,
						 (byte) -122);
				    }
				}
			    }
			    if (!class14_sub29.aBoolean3251)
				break;
			} catch (Exception exception) {
			    class14_sub29.aBoolean3251 = false;
			    break;
			}
			continue while_242_;
		    } while (false);
		}
		if (class14_sub29.aBoolean3240) {
		    if (class14_sub29.anInt3231 == 0) {
			if (i <= Class71.anInt1101
			    && i > Class7_Sub1.anInt2659) {
			    Class14_Sub29 class14_sub29_55_
				= class14_sub29s[i - 1][i_0_];
			    if (class14_sub29_55_ != null
				&& class14_sub29_55_.aBoolean3240)
				continue;
			}
			if (i >= Class71.anInt1101
			    && i < Class14_Sub8_Sub37.anInt4722 - 1) {
			    Class14_Sub29 class14_sub29_56_
				= class14_sub29s[i + 1][i_0_];
			    if (class14_sub29_56_ != null
				&& class14_sub29_56_.aBoolean3240)
				continue;
			}
			if (i_0_ <= Class102.anInt1724
			    && i_0_ > Class14_Sub9_Sub3.anInt4849) {
			    Class14_Sub29 class14_sub29_57_
				= class14_sub29s[i][i_0_ - 1];
			    if (class14_sub29_57_ != null
				&& class14_sub29_57_.aBoolean3240)
				continue;
			}
			if (i_0_ >= Class102.anInt1724
			    && i_0_ < Class14_Sub8_Sub26.anInt4526 - 1) {
			    Class14_Sub29 class14_sub29_58_
				= class14_sub29s[i][i_0_ + 1];
			    if (class14_sub29_58_ != null
				&& class14_sub29_58_.aBoolean3240)
				continue;
			}
			class14_sub29.aBoolean3240 = false;
			Class107.anInt1806--;
			Class115 class115 = class14_sub29.aClass115_3256;
			if (class115 != null && class115.anInt1914 != 0) {
			    Class10.method187(Class4.anInt125,
					      Class14_Sub2.anInt2741,
					      Class14_Sub2_Sub8.anInt3853,
					      i_1_, i, i_0_);
			    if (class115.aClass133_1926 != null)
				class115.aClass133_1926.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741
				      - class115.anInt1914),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			    if (class115.aClass133_1921 != null)
				class115.aClass133_1921.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741
				      - class115.anInt1914),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			    if (class115.aClass133_1919 != null)
				class115.aClass133_1919.method1792
				    (0, Class150.anInt2420,
				     Class7_Sub3_Sub1.anInt3718,
				     Class14_Sub1.anInt2719, Class37.anInt643,
				     class115.anInt1913 - Class4.anInt125,
				     (class115.anInt1911
				      - Class14_Sub2.anInt2741
				      - class115.anInt1914),
				     (class115.anInt1925
				      - Class14_Sub2_Sub8.anInt3853),
				     class115.aLong1915);
			}
			if (class14_sub29.anInt3236 != 0) {
			    Class37 class37 = class14_sub29.aClass37_3255;
			    if (class37 != null
				&& !Class94.method1478(i_2_, i, i_0_,
						       class37
							   .aClass133_642
							   .method1781())) {
				if ((class37.anInt649
				     & class14_sub29.anInt3236)
				    != 0) {
				    Class10.method187(Class4.anInt125,
						      Class14_Sub2.anInt2741,
						      (Class14_Sub2_Sub8
						       .anInt3853),
						      i_1_, i, i_0_);
				    class37.aClass133_642.method1792
					(0, Class150.anInt2420,
					 Class7_Sub3_Sub1.anInt3718,
					 Class14_Sub1.anInt2719,
					 Class37.anInt643,
					 (class37.anInt653 - Class4.anInt125
					  + class37.anInt641),
					 (class37.anInt650
					  - Class14_Sub2.anInt2741),
					 (class37.anInt633
					  - Class14_Sub2_Sub8.anInt3853
					  + class37.anInt646),
					 class37.aLong634);
				} else if (class37.anInt649 == 256) {
				    int i_59_
					= class37.anInt653 - Class4.anInt125;
				    int i_60_ = (class37.anInt650
						 - Class14_Sub2.anInt2741);
				    int i_61_
					= (class37.anInt633
					   - Class14_Sub2_Sub8.anInt3853);
				    int i_62_ = class37.anInt647;
				    int i_63_;
				    if (i_62_ == 1 || i_62_ == 2)
					i_63_ = -i_59_;
				    else
					i_63_ = i_59_;
				    int i_64_;
				    if (i_62_ == 2 || i_62_ == 3)
					i_64_ = -i_61_;
				    else
					i_64_ = i_61_;
				    if (i_64_ >= i_63_) {
					Class10.method187(Class4.anInt125,
							  (Class14_Sub2
							   .anInt2741),
							  (Class14_Sub2_Sub8
							   .anInt3853),
							  i_1_, i, i_0_);
					class37.aClass133_642.method1792
					    (0, Class150.anInt2420,
					     Class7_Sub3_Sub1.anInt3718,
					     Class14_Sub1.anInt2719,
					     Class37.anInt643,
					     i_59_ + class37.anInt641, i_60_,
					     i_61_ + class37.anInt646,
					     class37.aLong634);
				    } else if (class37.aClass133_638 != null) {
					Class10.method187(Class4.anInt125,
							  (Class14_Sub2
							   .anInt2741),
							  (Class14_Sub2_Sub8
							   .anInt3853),
							  i_1_, i, i_0_);
					class37.aClass133_638.method1792
					    (0, Class150.anInt2420,
					     Class7_Sub3_Sub1.anInt3718,
					     Class14_Sub1.anInt2719,
					     Class37.anInt643, i_59_, i_60_,
					     i_61_, class37.aLong634);
				    }
				}
			    }
			    Class113 class113 = class14_sub29.aClass113_3250;
			    if (class113 != null) {
				if ((class113.anInt1888
				     & class14_sub29.anInt3236) != 0
				    && !Class103.method1530(i_2_, i, i_0_,
							    (class113
							     .anInt1888))) {
				    Class10.method192(class113.anInt1888,
						      Class4.anInt125,
						      Class14_Sub2.anInt2741,
						      (Class14_Sub2_Sub8
						       .anInt3853),
						      i_2_, i, i_0_);
				    class113.aClass133_1884.method1792
					(0, Class150.anInt2420,
					 Class7_Sub3_Sub1.anInt3718,
					 Class14_Sub1.anInt2719,
					 Class37.anInt643,
					 class113.anInt1878 - Class4.anInt125,
					 (class113.anInt1882
					  - Class14_Sub2.anInt2741),
					 (class113.anInt1886
					  - Class14_Sub2_Sub8.anInt3853),
					 class113.aLong1887);
				}
				if ((class113.anInt1880
				     & class14_sub29.anInt3236) != 0
				    && !Class103.method1530(i_2_, i, i_0_,
							    (class113
							     .anInt1880))) {
				    Class10.method192(class113.anInt1880,
						      Class4.anInt125,
						      Class14_Sub2.anInt2741,
						      (Class14_Sub2_Sub8
						       .anInt3853),
						      i_2_, i, i_0_);
				    class113.aClass133_1877.method1792
					(0, Class150.anInt2420,
					 Class7_Sub3_Sub1.anInt3718,
					 Class14_Sub1.anInt2719,
					 Class37.anInt643,
					 class113.anInt1878 - Class4.anInt125,
					 (class113.anInt1882
					  - Class14_Sub2.anInt2741),
					 (class113.anInt1886
					  - Class14_Sub2_Sub8.anInt3853),
					 class113.aLong1887);
				}
			    }
			}
			if (i_1_ < Class83.anInt1338 - 1) {
			    Class14_Sub29 class14_sub29_65_
				= (Class125_Sub1
				   .aClass14_Sub29ArrayArrayArray3368[i_1_ + 1]
				   [i][i_0_]);
			    if (class14_sub29_65_ != null
				&& class14_sub29_65_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_65_, (byte) -117);
			}
			if (i < Class71.anInt1101) {
			    Class14_Sub29 class14_sub29_66_
				= class14_sub29s[i + 1][i_0_];
			    if (class14_sub29_66_ != null
				&& class14_sub29_66_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_66_, (byte) -124);
			}
			if (i_0_ < Class102.anInt1724) {
			    Class14_Sub29 class14_sub29_67_
				= class14_sub29s[i][i_0_ + 1];
			    if (class14_sub29_67_ != null
				&& class14_sub29_67_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_67_, (byte) -118);
			}
			if (i > Class71.anInt1101) {
			    Class14_Sub29 class14_sub29_68_
				= class14_sub29s[i - 1][i_0_];
			    if (class14_sub29_68_ != null
				&& class14_sub29_68_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_68_, (byte) -119);
			}
			if (i_0_ > Class102.anInt1724) {
			    Class14_Sub29 class14_sub29_69_
				= class14_sub29s[i][i_0_ - 1];
			    if (class14_sub29_69_ != null
				&& class14_sub29_69_.aBoolean3240)
				Class14_Sub8_Sub23.aClass2_4477
				    .method80(class14_sub29_69_, (byte) -117);
			}
		    }
		}
	    }
	}
    }
    
    public static void method455(int arg0) {
	try {
	    aClass2_2787 = null;
	    anIntArray2786 = null;
	    aClass133_Sub1_Sub2Array2785 = null;
	    if (arg0 >= -108)
		method454(null, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fa.D(" + arg0 + ')');
	}
    }
    
    public boolean method456(int arg0, int arg1, boolean arg2) {
    while_243_:
	do {
	    do {
		boolean bool;
		try {
		    anInt2781++;
		    if (arg2 != true)
			aBoolean2784 = false;
		    if ((arg0 ^ 0xffffffff) <= (anInt2779 ^ 0xffffffff)
			&& anInt2777 >= arg0 && anInt2776 <= arg1
			&& (anInt2778 ^ 0xffffffff) <= (arg1 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_243_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fa.E(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public static Class14_Sub2_Sub15 method457(int arg0, int arg1) {
    while_244_:
	do {
	    do {
		Class14_Sub2_Sub15 class14_sub2_sub15;
		try {
		    anInt2780++;
		    Class14_Sub2_Sub15 class14_sub2_sub15_70_
			= ((Class14_Sub2_Sub15)
			   Class14_Sub2_Sub12.aClass52_3894
			       .method1210((byte) 65, (long) arg1));
		    if (class14_sub2_sub15_70_ == null)
			break;
		    class14_sub2_sub15 = class14_sub2_sub15_70_;
		} catch (RuntimeException runtimeexception) {
		    break while_244_;
		}
		return class14_sub2_sub15;
	    } while (false);
	    Class14_Sub2_Sub15 class14_sub2_sub15;
	    try {
		Class14_Sub2_Sub15 class14_sub2_sub15_71_
		    = Class14_Sub29.method933(Class133_Sub1_Sub1.aClass9_4935,
					      Class125_Sub4.aClass9_3427, arg1,
					      (byte) -101, false);
		if (arg0 != 3)
		    method459(null, 52);
		if (null != class14_sub2_sub15_71_)
		    Class14_Sub2_Sub12.aClass52_3894.method1205
			((byte) -93, class14_sub2_sub15_71_, (long) arg1);
		class14_sub2_sub15 = class14_sub2_sub15_71_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub15;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "fa.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static Class113 method458(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	return class14_sub29.aClass113_3250;
    }
    
    public Class14_Sub4(int arg0, int arg1, int arg2, int arg3) {
	try {
	    anInt2776 = arg1;
	    anInt2778 = arg3;
	    anInt2779 = arg0;
	    anInt2777 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fa.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	}
    }
    
    public static void method459(Class124 arg0, int arg1) {
    while_246_:
	do {
	while_245_:
	    do {
		do {
		    try {
			if (arg1 != 2)
			    aBoolean2784 = false;
			anInt2783++;
			if (Class133_Sub1_Sub2.aClass14_Sub23Array4945 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_245_;
		    }
		    return;
		} while (false);
		long l;
		int i;
		do {
		    try {
			l = arg0.method1692(0);
			i = 0;
			if ((l ^ 0xffffffffffffffffL) != -1L)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_245_;
		    }
		    return;
		} while (false);
		do {
		    try {
			for (/**/;
			     (((Class133_Sub1_Sub2
				.aClass14_Sub23Array4945).length
			       ^ 0xffffffff) < (i ^ 0xffffffff)
			      && l != (Class133_Sub1_Sub2
				       .aClass14_Sub23Array4945[i].aLong355));
			     i++) {
			    /* empty */
			}
			if ((Class133_Sub1_Sub2.aClass14_Sub23Array4945.length
			     ^ 0xffffffff) < (i ^ 0xffffffff)
			    && (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i]
				!= null))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_245_;
		    }
		    return;
		} while (false);
		try {
		    Class153.anInt2446++;
		    Class55.aClass14_Sub10_Sub1_891.method843(0, 200);
		    Class55.aClass14_Sub10_Sub1_891.method817
			((Class133_Sub1_Sub2.aClass14_Sub23Array4945[i]
			  .aLong355),
			 112);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_246_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("fa.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	} while (false);
    }
    
    static {
	anInt2782 = 0;
	aBoolean2784 = false;
	aClass133_Sub1_Sub2Array2785 = new Class133_Sub1_Sub2[32768];
	anInt2790 = 0;
	anInt2789 = 0;
	aClass2_2787 = new Class2();
    }
}
