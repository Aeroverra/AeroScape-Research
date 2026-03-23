/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class139
{
    public static int anInt2228;
    public static Class52 aClass52_2229;
    public static int anInt2230 = 0;
    public static int anInt2231;
    public static int anInt2232;
    public static boolean aBoolean2233;
    
    public static void method1951(byte arg0, boolean arg1) {
	try {
	    anInt2228++;
	    Class7_Sub2_Sub1.aBoolean3699 = arg1;
	    if (!Class7_Sub2_Sub1.aBoolean3699) {
		int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .method836((byte) 125);
		int i_0_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .method781(false);
		int i_1_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .method836((byte) -113);
		int i_2_ = ((Class14_Sub8_Sub12.anInt4280
			     - (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.anInt2908))
			    / 16);
		Class125_Sub3.anIntArrayArray3391 = new int[i_2_][4];
		for (int i_3_ = 0; i_2_ > i_3_; i_3_++) {
		    for (int i_4_ = 0; -5 < (i_4_ ^ 0xffffffff); i_4_++)
			Class125_Sub3.anIntArrayArray3391[i_3_][i_4_]
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method812((byte) -108);
		}
		int i_5_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .method806((byte) -16);
		int i_6_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .method784((byte) 114);
		boolean bool = false;
		if ((-49 == (i / 8 ^ 0xffffffff)
		     || -50 == (i / 8 ^ 0xffffffff))
		    && 48 == i_6_ / 8)
		    bool = true;
		Class14_Sub20.aByteArrayArray3097 = new byte[i_2_][];
		Class62.anIntArray992 = new int[i_2_];
		Class14_Sub8_Sub28.aByteArrayArray4556 = null;
		Class134.anIntArray2590 = null;
		Class14_Sub8.anIntArray2858 = new int[i_2_];
		Class150.anIntArray2422 = new int[i_2_];
		if (-49 == (i / 8 ^ 0xffffffff)
		    && -149 == (i_6_ / 8 ^ 0xffffffff))
		    bool = true;
		Class5.aByteArrayArray139 = new byte[i_2_][];
		Class14_Sub2_Sub12.aByteArrayArray3913 = new byte[i_2_][];
		Class14_Sub22.anIntArray3119 = new int[i_2_];
		Class14_Sub2_Sub15.anIntArray3955 = new int[i_2_];
		Class14.aByteArrayArray362 = new byte[i_2_][];
		i_2_ = 0;
		for (int i_7_ = (i + -6) / 8; (i - -6) / 8 >= i_7_; i_7_++) {
		    for (int i_8_ = (i_6_ + -6) / 8;
			 (i_8_ ^ 0xffffffff) >= ((i_6_ - -6) / 8 ^ 0xffffffff);
			 i_8_++) {
			int i_9_ = (i_7_ << 68027496) - -i_8_;
			if (bool && ((i_8_ ^ 0xffffffff) == -50 || 149 == i_8_
				     || (i_8_ ^ 0xffffffff) == -148
				     || -51 == (i_7_ ^ 0xffffffff)
				     || (-50 == (i_7_ ^ 0xffffffff)
					 && (i_8_ ^ 0xffffffff) == -48))) {
			    Class14_Sub8.anIntArray2858[i_2_] = i_9_;
			    Class62.anIntArray992[i_2_] = -1;
			    Class150.anIntArray2422[i_2_] = -1;
			    Class14_Sub2_Sub15.anIntArray3955[i_2_] = -1;
			    Class14_Sub22.anIntArray3119[i_2_] = -1;
			} else {
			    Class14_Sub8.anIntArray2858[i_2_] = i_9_;
			    Class62.anIntArray992[i_2_]
				= (Class14_Sub13.aClass9_Sub1_2958.method146
				   ((Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { Class35.aClass124_601,
					 Class83.method1407(43, i_7_),
					 Class111.aClass124_1866,
					 Class83.method1407(81, i_8_) }),
				      (byte) -103)),
				    0));
			    Class150.anIntArray2422[i_2_]
				= (Class14_Sub13.aClass9_Sub1_2958.method146
				   ((Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { Class111.aClass124_1863,
					 Class83.method1407(112, i_7_),
					 Class111.aClass124_1866,
					 Class83.method1407(47, i_8_) }),
				      (byte) -21)),
				    0));
			    Class14_Sub2_Sub15.anIntArray3955[i_2_]
				= (Class14_Sub13.aClass9_Sub1_2958.method146
				   ((Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { Class82.aClass124_1333,
					 Class83.method1407(41, i_7_),
					 Class111.aClass124_1866,
					 Class83.method1407(87, i_8_) }),
				      (byte) -123)),
				    0));
			    Class14_Sub22.anIntArray3119[i_2_]
				= (Class14_Sub13.aClass9_Sub1_2958.method146
				   ((Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { Class133_Sub1_Sub1.aClass124_4943,
					 Class83.method1407(94, i_7_),
					 Class111.aClass124_1866,
					 Class83.method1407(47, i_8_) }),
				      (byte) -39)),
				    0));
			}
			i_2_++;
		    }
		}
		Class45.method1162(i_6_, i, i_5_, i_0_, (byte) -118, i_1_,
				   false);
	    } else {
		int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .method832((byte) -72);
		int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method784((byte) 115);
		int i_11_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method836((byte) -57);
		Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method845(true);
		for (int i_12_ = 0; i_12_ < 4; i_12_++) {
		    for (int i_13_ = 0; (i_13_ ^ 0xffffffff) > -14; i_13_++) {
			for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -14;
			     i_14_++) {
			    int i_15_
				= Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734
				      .method842(0, 1);
			    if (1 != i_15_)
				Class7.anIntArrayArrayArray169[i_12_]
				    [i_13_][i_14_]
				    = -1;
			    else
				Class7.anIntArrayArrayArray169[i_12_]
				    [i_13_][i_14_]
				    = Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .method842(0, 26);
			}
		    }
		}
		Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
		    .method848((byte) -108);
		int i_16_ = ((Class14_Sub8_Sub12.anInt4280
			      + -(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .anInt2908))
			     / 16);
		Class125_Sub3.anIntArrayArray3391 = new int[i_16_][4];
		for (int i_17_ = 0;
		     (i_17_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff); i_17_++) {
		    for (int i_18_ = 0; 4 > i_18_; i_18_++)
			Class125_Sub3.anIntArrayArray3391[i_17_][i_18_]
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method831(128);
		}
		int i_19_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method836((byte) -19);
		int i_20_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method836((byte) 126);
		Class62.anIntArray992 = new int[i_16_];
		Class14_Sub2_Sub12.aByteArrayArray3913 = new byte[i_16_][];
		Class14_Sub2_Sub15.anIntArray3955 = new int[i_16_];
		Class14.aByteArrayArray362 = new byte[i_16_][];
		Class14_Sub22.anIntArray3119 = new int[i_16_];
		Class14_Sub8.anIntArray2858 = new int[i_16_];
		Class150.anIntArray2422 = new int[i_16_];
		Class14_Sub8_Sub28.aByteArrayArray4556 = null;
		Class134.anIntArray2590 = null;
		Class14_Sub20.aByteArrayArray3097 = new byte[i_16_][];
		Class5.aByteArrayArray139 = new byte[i_16_][];
		i_16_ = 0;
		for (int i_21_ = 0; 4 > i_21_; i_21_++) {
		    for (int i_22_ = 0; 13 > i_22_; i_22_++) {
			for (int i_23_ = 0; (i_23_ ^ 0xffffffff) > -14;
			     i_23_++) {
			    int i_24_ = (Class7.anIntArrayArrayArray169[i_21_]
					 [i_22_][i_23_]);
			    if (-1 != i_24_) {
				int i_25_ = 0x7ff & i_24_ >> -1470411037;
				int i_26_ = i_24_ >> 993673870 & 0x3ff;
				int i_27_
				    = (i_26_ / 8 << -221554552) - -(i_25_ / 8);
				for (int i_28_ = 0;
				     ((i_16_ ^ 0xffffffff)
				      < (i_28_ ^ 0xffffffff));
				     i_28_++) {
				    if ((Class14_Sub8.anIntArray2858[i_28_]
					 ^ 0xffffffff)
					== (i_27_ ^ 0xffffffff)) {
					i_27_ = -1;
					break;
				    }
				}
				if (0 != (i_27_ ^ 0xffffffff)) {
				    Class14_Sub8.anIntArray2858[i_16_] = i_27_;
				    int i_29_ = (0xff04 & i_27_) >> 1848581512;
				    int i_30_ = i_27_ & 0xff;
				    Class62.anIntArray992[i_16_]
					= (Class14_Sub13.aClass9_Sub1_2958
					       .method146
					   ((Class14_Sub8_Sub7.method515
					     ((new Class124[]
					       { Class35.aClass124_601,
						 Class83.method1407(62, i_29_),
						 Class111.aClass124_1866,
						 Class83.method1407(81,
								    i_30_) }),
					      (byte) -40)),
					    0));
				    Class150.anIntArray2422[i_16_]
					= (Class14_Sub13.aClass9_Sub1_2958
					       .method146
					   ((Class14_Sub8_Sub7.method515
					     ((new Class124[]
					       { Class111.aClass124_1863,
						 Class83.method1407(105,
								    i_29_),
						 Class111.aClass124_1866,
						 Class83.method1407(79,
								    i_30_) }),
					      (byte) -42)),
					    0));
				    Class14_Sub2_Sub15.anIntArray3955[i_16_]
					= (Class14_Sub13.aClass9_Sub1_2958
					       .method146
					   ((Class14_Sub8_Sub7.method515
					     ((new Class124[]
					       { Class82.aClass124_1333,
						 Class83.method1407(29, i_29_),
						 Class111.aClass124_1866,
						 Class83.method1407(14,
								    i_30_) }),
					      (byte) -88)),
					    0));
				    Class14_Sub22.anIntArray3119[i_16_]
					= (Class14_Sub13.aClass9_Sub1_2958
					       .method146
					   ((Class14_Sub8_Sub7.method515
					     ((new Class124[]
					       { (Class133_Sub1_Sub1
						  .aClass124_4943),
						 Class83.method1407(13, i_29_),
						 Class111.aClass124_1866,
						 Class83.method1407(55,
								    i_30_) }),
					      (byte) -6)),
					    0));
				    i_16_++;
				}
			    }
			}
		    }
		}
		Class45.method1162(i_10_, i_20_, i, i_19_, (byte) -121, i_11_,
				   false);
	    }
	    int i = 125 % ((-45 - arg0) / 57);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("uk.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static boolean method1952(int arg0, int arg1, int arg2, long arg3) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return false;
	if (class14_sub29.aClass113_3250 != null
	    && class14_sub29.aClass113_3250.aLong1887 == arg3)
	    return true;
	if (class14_sub29.aClass37_3255 != null
	    && class14_sub29.aClass37_3255.aLong634 == arg3)
	    return true;
	if (class14_sub29.aClass4_3237 != null
	    && class14_sub29.aClass4_3237.aLong132 == arg3)
	    return true;
	for (int i = 0; i < class14_sub29.anInt3242; i++) {
	    if (class14_sub29.aClass40Array3257[i].aLong677 == arg3)
		return true;
	}
	return false;
    }
    
    public static void method1953(byte arg0) {
	try {
	    aClass52_2229 = null;
	    if (arg0 != -98)
		anInt2230 = -45;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "uk.A(" + arg0 + ')');
	}
    }
    
    public static void method1954(Class14_Sub2_Sub16 arg0, int arg1, int arg2,
				  int arg3, int arg4, int arg5, Class94 arg6,
				  Class14_Sub2_Sub16 arg7) {
    while_1245_:
	do {
	while_1244_:
	    do {
		do {
		    try {
			Class14_Sub28.aClass94_3230 = arg6;
			anInt2232++;
			int i = -21 / ((arg4 - 0) / 61);
			Class14_Sub8_Sub11.anInt4266 = arg5;
			Class14_Sub17.anInt3032 = arg1;
			Class134.anInt2573 = arg3;
			Class150.anInt2423 = arg2;
			if (null == Class14_Sub2_Sub19.aClass104_4037)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1244_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub16.aBoolean4357 = true;
		    if (Class14_Sub8_Sub30.aClass14_Sub2_Sub19Array4595
			== null)
			Class14_Sub8_Sub30.aClass14_Sub2_Sub19Array4595
			    = Class38.method1115(false,
						 (Class14_Sub3
						  .aClass9_Sub1_2750),
						 0, Class14.anInt371);
		    if (Class14_Sub8_Sub29.aClass148Array4580 == null)
			Class14_Sub8_Sub29.aClass148Array4580
			    = Class126.method1747(0,
						  (Class14_Sub8_Sub39_Sub1
						   .anInt5098),
						  229,
						  (Class14_Sub3
						   .aClass9_Sub1_2750));
		    if (Class75.aClass148Array1184 == null)
			Class75.aClass148Array1184
			    = Class126.method1747(0,
						  Class14_Sub8_Sub26.anInt4532,
						  229,
						  (Class14_Sub3
						   .aClass9_Sub1_2750));
		    if (Class14_Sub8_Sub23.aClass148Array4473 == null)
			Class14_Sub8_Sub23.aClass148Array4473
			    = Class126.method1747(0, Class127.anInt2118, 229,
						  (Class14_Sub3
						   .aClass9_Sub1_2750));
		    int i = Class150.anInt2423 / 5;
		    int i_31_ = Class150.anInt2423 / 5 * 4;
		    Class25.method1009(Class14_Sub8_Sub11.anInt4266,
				       Class134.anInt2573, Class150.anInt2423,
				       Class14_Sub17.anInt3032, 0, 168);
		    Class25.method998(Class14_Sub8_Sub11.anInt4266,
				      Class134.anInt2573, i, 23, 12425273,
				      9135624);
		    Class25.method998(i + Class14_Sub8_Sub11.anInt4266,
				      Class134.anInt2573, i_31_, 23, 5197647,
				      2697513);
		    arg0.method345(Class14_Sub8_Sub7.aClass124_4203,
				   i / 2 + Class14_Sub8_Sub11.anInt4266,
				   Class134.anInt2573 + 15, 0, -1);
		    if (Class14_Sub8_Sub23.aClass148Array4473 != null) {
			Class14_Sub8_Sub23.aClass148Array4473[1].method2001
			    (Class14_Sub8_Sub11.anInt4266 - (-i - 2),
			     Class134.anInt2573 - -1);
			arg7.method364(Class118.aClass124_1981,
				       12 + (i + Class14_Sub8_Sub11.anInt4266),
				       10 + Class134.anInt2573, 16777215, -1);
			Class14_Sub8_Sub23.aClass148Array4473[0].method2001
			    (2 + (i + Class14_Sub8_Sub11.anInt4266),
			     Class134.anInt2573 - -12);
			arg7.method364(Class14_Sub9_Sub1.aClass124_4770,
				       Class14_Sub8_Sub11.anInt4266 - (-i
								       + -12),
				       21 + Class134.anInt2573, 16777215, -1);
		    }
		    if (Class75.aClass148Array1184 != null) {
			int i_32_ = 140 + Class14_Sub8_Sub11.anInt4266 + i;
			if (Class71.anIntArray1086[0] == 0
			    && Class45.anIntArray737[0] == 0)
			    Class75.aClass148Array1184[2]
				.method2001(i_32_, 4 + Class134.anInt2573);
			else
			    Class75.aClass148Array1184[0]
				.method2001(i_32_, Class134.anInt2573 - -4);
			if (-1 == (Class71.anIntArray1086[0] ^ 0xffffffff)
			    && Class45.anIntArray737[0] == 1)
			    Class75.aClass148Array1184[3].method2001
				(15 + i_32_, Class134.anInt2573 + 4);
			else
			    Class75.aClass148Array1184[1].method2001
				(i_32_ - -15, Class134.anInt2573 - -4);
			arg0.method364(Class14_Sub8.aClass124_2852, 32 + i_32_,
				       17 + Class134.anInt2573, 16777215, -1);
			int i_33_ = 250 + (i + Class14_Sub8_Sub11.anInt4266);
			if (1 != Class71.anIntArray1086[0]
			    || 0 != Class45.anIntArray737[0])
			    Class75.aClass148Array1184[0]
				.method2001(i_33_, 4 + Class134.anInt2573);
			else
			    Class75.aClass148Array1184[2]
				.method2001(i_33_, 4 + Class134.anInt2573);
			if (Class71.anIntArray1086[0] == 1
			    && -2 == (Class45.anIntArray737[0] ^ 0xffffffff))
			    Class75.aClass148Array1184[3].method2001
				(15 + i_33_, 4 + Class134.anInt2573);
			else
			    Class75.aClass148Array1184[1].method2001
				(15 + i_33_, 4 + Class134.anInt2573);
			arg0.method364(Class133.aClass124_2183, 32 + i_33_,
				       Class134.anInt2573 - -17, 16777215, -1);
			int i_34_ = 360 + i + Class14_Sub8_Sub11.anInt4266;
			if (-3 != (Class71.anIntArray1086[0] ^ 0xffffffff)
			    || 0 != Class45.anIntArray737[0])
			    Class75.aClass148Array1184[0]
				.method2001(i_34_, 4 + Class134.anInt2573);
			else
			    Class75.aClass148Array1184[2]
				.method2001(i_34_, 4 + Class134.anInt2573);
			if (-3 != (Class71.anIntArray1086[0] ^ 0xffffffff)
			    || 1 != Class45.anIntArray737[0])
			    Class75.aClass148Array1184[1].method2001
				(i_34_ - -15, Class134.anInt2573 + 4);
			else
			    Class75.aClass148Array1184[3].method2001
				(i_34_ - -15, Class134.anInt2573 + 4);
			arg0.method364(Class14_Sub8_Sub5.aClass124_4167,
				       i_34_ - -32, 17 + Class134.anInt2573,
				       16777215, -1);
			int i_35_ = i + Class14_Sub8_Sub11.anInt4266 + 470;
			if (-4 != (Class71.anIntArray1086[0] ^ 0xffffffff)
			    || -1 != (Class45.anIntArray737[0] ^ 0xffffffff))
			    Class75.aClass148Array1184[0]
				.method2001(i_35_, Class134.anInt2573 - -4);
			else
			    Class75.aClass148Array1184[2]
				.method2001(i_35_, 4 + Class134.anInt2573);
			if (3 != Class71.anIntArray1086[0]
			    || (Class45.anIntArray737[0] ^ 0xffffffff) != -2)
			    Class75.aClass148Array1184[1].method2001
				(i_35_ + 15, 4 + Class134.anInt2573);
			else
			    Class75.aClass148Array1184[3].method2001
				(15 + i_35_, Class134.anInt2573 - -4);
			arg0.method364(Class129.aClass124_2129, 32 + i_35_,
				       17 + Class134.anInt2573, 16777215, -1);
		    }
		    Class25.method1004(-10 + (Class150.anInt2423 - 58),
				       4 + Class134.anInt2573, 58, 16, 0);
		    Class14_Sub5.anInt2801 = -1;
		    if (Class14_Sub8_Sub30.aClass14_Sub2_Sub19Array4595
			!= null) {
			int i_36_ = 88;
			int i_37_ = Class150.anInt2423 / (i_36_ + 1);
			int i_38_ = 19;
			int i_39_
			    = (-23 + Class14_Sub17.anInt3032) / (1 + i_38_);
			int i_40_;
			int i_41_;
			do {
			    i_40_ = i_39_;
			    i_41_ = i_37_;
			    if ((i_37_ + -1) * i_39_ >= Class73.anInt1129)
				i_37_--;
			    if ((Class73.anInt1129 ^ 0xffffffff)
				>= ((-1 + i_39_) * i_37_ ^ 0xffffffff))
				i_39_--;
			    if (Class73.anInt1129 <= (-1 + i_39_) * i_37_)
				i_39_--;
			} while ((i_39_ ^ 0xffffffff) != (i_40_ ^ 0xffffffff)
				 || (i_37_ ^ 0xffffffff) != (i_41_
							     ^ 0xffffffff));
			i_40_
			    = (-(i_37_ * i_36_) + Class150.anInt2423) / (i_37_
									 - -1);
			if (i_40_ > 5)
			    i_40_ = 5;
			i_41_ = ((-(i_39_ * i_38_)
				  + (-23 + Class14_Sub17.anInt3032))
				 / (1 + i_39_));
			if ((i_41_ ^ 0xffffffff) < -6)
			    i_41_ = 5;
			int i_42_ = ((-((i_39_ + -1) * i_41_)
				      + (-23 + (Class14_Sub17.anInt3032
						+ -(i_39_ * i_38_))))
				     / 2);
			int i_43_ = 23 - -i_42_;
			int i_44_
			    = ((-(i_40_ * (-1 + i_37_))
				+ (-(i_37_ * i_36_) + Class150.anInt2423))
			       / 2);
			int i_45_ = 0;
			int i_46_ = i_44_;
			for (int i_47_ = 0;
			     ((i_47_ ^ 0xffffffff)
			      > (Class73.anInt1129 ^ 0xffffffff));
			     i_47_++) {
			    boolean bool = true;
			    Class45 class45
				= Class133_Sub1.aClass45Array3435[i_47_];
			    Class124 class124
				= Class83.method1407(81, class45.anInt752);
			    if (0 != (class45.anInt752 ^ 0xffffffff)) {
				if (class45.anInt752 > 1980) {
				    class124 = Class108.aClass124_1825;
				    bool = false;
				}
			    } else {
				class124 = Class7_Sub2.aClass124_2669;
				bool = false;
			    }
			    if (((i_46_ ^ 0xffffffff)
				 < (Class14_Sub8_Sub33.anInt4640 ^ 0xffffffff))
				|| Class107.anInt1804 < i_43_
				|| (Class14_Sub8_Sub33.anInt4640
				    >= i_46_ + i_36_)
				|| Class107.anInt1804 >= i_43_ - -i_38_
				|| !bool)
				Class14_Sub8_Sub30
				    .aClass14_Sub2_Sub19Array4595
				    [class45.aBoolean749 ? 1 : 0].method391
				    (i_46_ + Class14_Sub8_Sub11.anInt4266,
				     i_43_ + Class134.anInt2573);
			    else {
				Class14_Sub5.anInt2801 = i_47_;
				Class14_Sub8_Sub30
				    .aClass14_Sub2_Sub19Array4595
				    [class45.aBoolean749 ? 1 : 0].method400
				    (i_46_ + Class14_Sub8_Sub11.anInt4266,
				     i_43_ + Class134.anInt2573, 128,
				     16777215);
			    }
			    if (Class14_Sub8_Sub29.aClass148Array4580 != null)
				Class14_Sub8_Sub29.aClass148Array4580
				    [((!class45.aBoolean749 ? 0
				       : (Class14_Sub8_Sub29
					  .aClass148Array4580).length / 2)
				      - -class45.anInt745)]
				    .method2001
				    (i_46_ + Class14_Sub8_Sub11.anInt4266 + 29,
				     i_43_ + Class134.anInt2573);
			    arg0.method345
				(Class83.method1407(45, class45.anInt744),
				 15 + i_46_ + Class14_Sub8_Sub11.anInt4266,
				 i_43_ + Class134.anInt2573 + (i_38_ / 2 - -5),
				 0, -1);
			    arg7.method345(class124,
					   (60 + i_46_
					    + Class14_Sub8_Sub11.anInt4266),
					   (5 + i_38_ / 2 + Class134.anInt2573
					    - -i_43_),
					   268435455, -1);
			    i_43_ += i_41_ - -i_38_;
			    if (++i_45_ >= i_39_) {
				i_46_ += i_40_ + i_36_;
				i_45_ = 0;
				i_43_ = i_42_ + 23;
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1245_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554
		      (throwable,
		       ("uk.E(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ','
			+ arg5 + ',' + (arg6 != null ? "{...}" : "null") + ','
			+ (arg7 != null ? "{...}" : "null") + ')'));
	} while (false);
    }
    
    public static void method1955(int arg0, Class5 arg1) {
    while_1247_:
	do {
	while_1246_:
	    do {
		do {
		    try {
			if (arg0 < -58)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1246_;
		    }
		    return;
		} while (false);
		try {
		    Class98.aClass5_1659 = arg1;
		    anInt2231++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1247_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("uk.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    static {
	aClass52_2229 = new Class52(64);
	aBoolean2233 = true;
    }
}
