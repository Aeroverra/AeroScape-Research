/* Class14_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub7 extends Class14
{
    public int[] anIntArray2819;
    public int[] anIntArray2820;
    public int anInt2821;
    public static int anInt2822;
    public byte[][][] aByteArrayArrayArray2823;
    public Class31[] aClass31Array2824;
    public int[] anIntArray2825;
    public static int anInt2826;
    public static boolean aBoolean2827 = false;
    public Class31[] aClass31Array2828;
    public static int anInt2829;
    public int anInt2830;
    
    public static void method469(int arg0, int arg1, int arg2, int arg3,
				 boolean arg4, int arg5, int arg6) {
	try {
	    anInt2829++;
	    Class126.anInt2089 = 0;
	    for (int i = -1;
		 Class14_Sub10.anInt2878 - -Class14_Sub8_Sub13.anInt4306 > i;
		 i++) {
		Class133_Sub1 class133_sub1;
		if ((i ^ 0xffffffff) == 0)
		    class133_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
		else if (Class14_Sub10.anInt2878 <= i)
		    class133_sub1 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				     [(Class14_Sub2_Sub15.anIntArray3965
				       [-Class14_Sub10.anInt2878 + i])]);
		else
		    class133_sub1
			= (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			   [Class14.anIntArray351[i]]);
		if (null != class133_sub1
		    && class133_sub1.method1804((byte) 115)) {
		    if (class133_sub1 instanceof Class133_Sub1_Sub2) {
			Class12 class12 = (((Class133_Sub1_Sub2) class133_sub1)
					   .aClass12_4949);
			if (class12.anIntArray329 != null)
			    class12 = class12.method217((byte) -18);
			if (class12 == null)
			    continue;
		    }
		    if ((i ^ 0xffffffff)
			<= (Class14_Sub10.anInt2878 ^ 0xffffffff)) {
			Class12 class12 = (((Class133_Sub1_Sub2) class133_sub1)
					   .aClass12_4949);
			if (null != class12.anIntArray329)
			    class12 = class12.method217((byte) -18);
			if (class12.anInt306 >= 0
			    && ((Class35.aClass14_Sub2_Sub19Array596.length
				 ^ 0xffffffff)
				< (class12.anInt306 ^ 0xffffffff))) {
			    Class150.method2022(arg2, arg6, -1, class133_sub1,
						class133_sub1
						    .method1795(12806) + 15,
						arg0 >> 635421761,
						arg3 >> 1666076033);
			    if (Class120.anInt2007 > -1)
				Class35.aClass14_Sub2_Sub19Array596
				    [class12.anInt306].method391
				    (-12 + Class120.anInt2007 + arg1,
				     Class14_Sub8_Sub27.anInt4548 + (arg5
								     - 30));
			}
			Class66[] class66s
			    = Class14_Sub2_Sub1.aClass66Array3721;
			for (int i_0_ = 0;
			     ((i_0_ ^ 0xffffffff)
			      > (class66s.length ^ 0xffffffff));
			     i_0_++) {
			    Class66 class66 = class66s[i_0_];
			    if (class66 != null && class66.anInt1046 == 1
				&& ((Class14_Sub2_Sub15.anIntArray3965
				     [i + -Class14_Sub10.anInt2878])
				    == class66.anInt1049)
				&& (Class14_Sub2_Sub20.anInt4064 % 20
				    ^ 0xffffffff) > -11) {
				Class150.method2022
				    (arg2, arg6, -1, class133_sub1,
				     15 + class133_sub1.method1795(12806),
				     arg0 >> -1545464127, arg3 >> -46289631);
				if ((Class120.anInt2007 ^ 0xffffffff) < 0)
				    Class76.aClass14_Sub2_Sub19Array1191
					[class66.anInt1035].method391
					(-12 + Class120.anInt2007 + arg1,
					 -28 + (Class14_Sub8_Sub27.anInt4548
						+ arg5));
			    }
			}
		    } else {
			Class133_Sub1_Sub1 class133_sub1_sub1
			    = (Class133_Sub1_Sub1) class133_sub1;
			int i_1_ = 30;
			if ((class133_sub1_sub1.anInt4902 ^ 0xffffffff) != 0
			    || 0 != (class133_sub1_sub1.anInt4904
				     ^ 0xffffffff)) {
			    Class150.method2022(arg2, arg6, -1, class133_sub1,
						15 + class133_sub1
							 .method1795(12806),
						arg0 >> 868910657,
						arg3 >> -807403551);
			    if (Class120.anInt2007 > -1) {
				if ((class133_sub1_sub1.anInt4902 ^ 0xffffffff)
				    != 0) {
				    Class98.aClass14_Sub2_Sub19Array1669
					[class133_sub1_sub1.anInt4902]
					.method391
					(-12 + Class120.anInt2007 + arg1,
					 (Class14_Sub8_Sub27.anInt4548 + arg5
					  + -i_1_));
				    i_1_ += 25;
				}
				if (-1 != class133_sub1_sub1.anInt4904) {
				    Class35.aClass14_Sub2_Sub19Array596
					[class133_sub1_sub1.anInt4904]
					.method391
					(arg1 - -Class120.anInt2007 - 12,
					 (Class14_Sub8_Sub27.anInt4548 + arg5
					  + -i_1_));
				    i_1_ += 25;
				}
			    }
			}
			if (0 <= i) {
			    Class66[] class66s
				= Class14_Sub2_Sub1.aClass66Array3721;
			    for (int i_2_ = 0;
				 ((class66s.length ^ 0xffffffff)
				  < (i_2_ ^ 0xffffffff));
				 i_2_++) {
				Class66 class66 = class66s[i_2_];
				if (null != class66
				    && -11 == (class66.anInt1046 ^ 0xffffffff)
				    && (Class14.anIntArray351[i]
					== class66.anInt1049)) {
				    Class150.method2022(arg2, arg6, -1,
							class133_sub1,
							(class133_sub1
							     .method1795(12806)
							 - -15),
							arg0 >> 1445613281,
							arg3 >> 2008951905);
				    if (0 > (Class120.anInt2007 ^ 0xffffffff))
					Class76
					    .aClass14_Sub2_Sub19Array1191
					    [class66.anInt1035].method391
					    (Class120.anInt2007 + (arg1 - 12),
					     (-i_1_
					      + Class14_Sub8_Sub27.anInt4548
					      + arg5));
				}
			    }
			}
		    }
		    if (null != class133_sub1.aClass124_3462
			&& (((Class14_Sub10.anInt2878 ^ 0xffffffff)
			     >= (i ^ 0xffffffff))
			    || Class14_Sub3.anInt2764 == 0
			    || Class14_Sub3.anInt2764 == 3
			    || (Class14_Sub3.anInt2764 == 1
				&& Class98.method1493(-1,
						      (((Class133_Sub1_Sub1)
							class133_sub1)
						       .aClass124_4922))))) {
			Class150.method2022(arg2, arg6, -1, class133_sub1,
					    class133_sub1.method1795(12806),
					    arg0 >> 1729369441,
					    arg3 >> -1323711807);
			if (-1 < Class120.anInt2007
			    && ((Class32.anInt549 ^ 0xffffffff)
				< (Class126.anInt2089 ^ 0xffffffff))) {
			    Class32.anIntArray533[Class126.anInt2089]
				= (Class133_Sub3.aClass14_Sub2_Sub16_3567
				       .method361(class133_sub1.aClass124_3462)
				   / 2);
			    Class32.anIntArray565[Class126.anInt2089]
				= (Class133_Sub3.aClass14_Sub2_Sub16_3567
				   .anInt3978);
			    Class32.anIntArray535[Class126.anInt2089]
				= Class120.anInt2007;
			    Class32.anIntArray534[Class126.anInt2089]
				= Class14_Sub8_Sub27.anInt4548;
			    Class32.anIntArray564[Class126.anInt2089]
				= class133_sub1.anInt3466;
			    Class32.anIntArray537[Class126.anInt2089]
				= class133_sub1.anInt3439;
			    Class32.anIntArray568[Class126.anInt2089]
				= class133_sub1.anInt3473;
			    Class32.aClass124Array542[Class126.anInt2089]
				= class133_sub1.aClass124_3462;
			    Class126.anInt2089++;
			}
		    }
		    if ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
			> (class133_sub1.anInt3450 ^ 0xffffffff)) {
			Class14_Sub2_Sub19 class14_sub2_sub19
			    = (Class14_Sub8_Sub18.aClass14_Sub2_Sub19Array4385
			       [0]);
			Class14_Sub2_Sub19 class14_sub2_sub19_3_
			    = (Class14_Sub8_Sub18.aClass14_Sub2_Sub19Array4385
			       [1]);
			if (class133_sub1 instanceof Class133_Sub1_Sub2) {
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class133_Sub1_Sub2) class133_sub1;
			    Class14_Sub2_Sub19[] class14_sub2_sub19s
				= ((Class14_Sub2_Sub19[])
				   (Class14_Sub8_Sub30.aClass52_4596.method1210
				    ((byte) 98,
				     (long) (class133_sub1_sub2.aClass12_4949
					     .anInt281))));
			    if (class14_sub2_sub19s == null) {
				class14_sub2_sub19s
				    = (Class125_Sub2.method1733
				       ((byte) 23,
					Class14_Sub3.aClass9_Sub1_2750, 0,
					(class133_sub1_sub2.aClass12_4949
					 .anInt281)));
				if (class14_sub2_sub19s != null)
				    Class14_Sub8_Sub30.aClass52_4596.method1205
					((byte) -93, class14_sub2_sub19s,
					 (long) (class133_sub1_sub2
						 .aClass12_4949.anInt281));
			    }
			    if (class14_sub2_sub19s != null
				&& class14_sub2_sub19s.length == 2) {
				class14_sub2_sub19 = class14_sub2_sub19s[0];
				class14_sub2_sub19_3_ = class14_sub2_sub19s[1];
			    }
			}
			Class150.method2022(arg2, arg6, -1, class133_sub1,
					    (class133_sub1.method1795(12806)
					     - -10
					     + class14_sub2_sub19.anInt4042),
					    arg0 >> -1489960255,
					    arg3 >> 1408693217);
			if (0 > (Class120.anInt2007 ^ 0xffffffff)) {
			    int i_4_ = arg1 + (Class120.anInt2007
					       + -(class14_sub2_sub19.anInt4035
						   >> -1850072575));
			    int i_5_
				= arg5 - (-Class14_Sub8_Sub27.anInt4548 - -3);
			    class14_sub2_sub19.method391(i_4_, i_5_);
			    int i_6_ = class14_sub2_sub19.anInt4042;
			    int i_7_ = (class133_sub1.anInt3438
					* class14_sub2_sub19.anInt4035 / 255);
			    Class25.method1002(i_4_, i_5_, i_7_ + i_4_,
					       i_6_ + i_5_);
			    class14_sub2_sub19_3_.method391(i_4_, i_5_);
			    Class25.method999(arg1, arg5, arg1 - -arg3,
					      arg0 + arg5);
			}
		    }
		    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > -5; i_8_++) {
			if ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
			    > (class133_sub1.anIntArray3442[i_8_]
			       ^ 0xffffffff)) {
			    Class150.method2022(arg2, arg6, -1, class133_sub1,
						class133_sub1
						    .method1795(12806) / 2,
						arg0 >> 2135384257,
						arg3 >> 674493601);
			    if (0 > (Class120.anInt2007 ^ 0xffffffff)) {
				if ((i_8_ ^ 0xffffffff) == -2)
				    Class14_Sub8_Sub27.anInt4548 -= 20;
				if (-3 == (i_8_ ^ 0xffffffff)) {
				    Class14_Sub8_Sub27.anInt4548 -= 10;
				    Class120.anInt2007 -= 15;
				}
				if (3 == i_8_) {
				    Class14_Sub8_Sub27.anInt4548 -= 10;
				    Class120.anInt2007 += 15;
				}
				Class133_Sub5.aClass14_Sub2_Sub19Array3609
				    [class133_sub1.anIntArray3496[i_8_]]
				    .method391
				    (arg1 + Class120.anInt2007 - 12,
				     arg5 + Class14_Sub8_Sub27.anInt4548 - 12);
				Class56_Sub1.aClass14_Sub2_Sub16_3320.method345
				    (Class83.method1407(87, (class133_sub1
							     .anIntArray3486
							     [i_8_])),
				     Class120.anInt2007 + (arg1 + -1),
				     3 + Class14_Sub8_Sub27.anInt4548 + arg5,
				     16777215, 0);
			    }
			}
		    }
		}
	    }
	    if (arg4 != true)
		aBoolean2827 = true;
	    for (int i = 0;
		 (i ^ 0xffffffff) > (Class126.anInt2089 ^ 0xffffffff); i++) {
		int i_9_ = Class32.anIntArray535[i];
		int i_10_ = Class32.anIntArray533[i];
		boolean bool = true;
		int i_11_ = Class32.anIntArray534[i];
		int i_12_ = Class32.anIntArray565[i];
		while (bool) {
		    bool = false;
		    for (int i_13_ = 0; i > i_13_; i_13_++) {
			if ((-Class32.anIntArray565[i_13_]
			     + Class32.anIntArray534[i_13_]) < 2 + i_11_
			    && (2 + Class32.anIntArray534[i_13_]
				> -i_12_ + i_11_)
			    && i_9_ + -i_10_ < (Class32.anIntArray533[i_13_]
						+ Class32.anIntArray535[i_13_])
			    && ((i_10_ + i_9_ ^ 0xffffffff)
				< ((-Class32.anIntArray533[i_13_]
				    + Class32.anIntArray535[i_13_])
				   ^ 0xffffffff))
			    && ((i_11_ ^ 0xffffffff)
				< ((-Class32.anIntArray565[i_13_]
				    + Class32.anIntArray534[i_13_])
				   ^ 0xffffffff))) {
			    i_11_ = (-Class32.anIntArray565[i_13_]
				     + Class32.anIntArray534[i_13_]);
			    bool = true;
			}
		    }
		}
		Class120.anInt2007 = Class32.anIntArray535[i];
		Class14_Sub8_Sub27.anInt4548 = Class32.anIntArray534[i]
		    = i_11_;
		Class124 class124 = Class32.aClass124Array542[i];
		if (Class14_Sub28.anInt3222 == 0) {
		    int i_14_ = 16776960;
		    if (Class32.anIntArray564[i] < 6)
			i_14_ = (Class14_Sub2_Sub12.anIntArray3917
				 [Class32.anIntArray564[i]]);
		    if ((Class32.anIntArray564[i] ^ 0xffffffff) == -7)
			i_14_ = (-11 >= (Class42.anInt699 % 20 ^ 0xffffffff)
				 ? 16776960 : 16711680);
		    if ((Class32.anIntArray564[i] ^ 0xffffffff) == -8)
			i_14_ = 10 > Class42.anInt699 % 20 ? 255 : 65535;
		    if (Class32.anIntArray564[i] == 8)
			i_14_ = 10 <= Class42.anInt699 % 20 ? 8454016 : 45056;
		    if (-10 == (Class32.anIntArray564[i] ^ 0xffffffff)) {
			int i_15_ = 150 - Class32.anIntArray568[i];
			if ((i_15_ ^ 0xffffffff) > -51)
			    i_14_ = 16711680 - -(1280 * i_15_);
			else if ((i_15_ ^ 0xffffffff) <= -101) {
			    if ((i_15_ ^ 0xffffffff) > -151)
				i_14_ = 65280 + (i_15_ - 100) * 5;
			} else
			    i_14_ = -((-50 + i_15_) * 327680) + 16776960;
		    }
		    if (-11 == (Class32.anIntArray564[i] ^ 0xffffffff)) {
			int i_16_ = -Class32.anIntArray568[i] + 150;
			if (50 <= i_16_) {
			    if (i_16_ >= 100) {
				if (-151 < (i_16_ ^ 0xffffffff))
				    i_14_ = (-32768000 + i_16_ * 327680 + 255
					     + -((-100 + i_16_) * 5));
			    } else
				i_14_
				    = 16711935 + -(327680 * i_16_) + 16384000;
			} else
			    i_14_ = i_16_ * 5 + 16711680;
		    }
		    if (11 == Class32.anIntArray564[i]) {
			int i_17_ = 150 + -Class32.anIntArray568[i];
			if (-51 < (i_17_ ^ 0xffffffff))
			    i_14_ = -(327685 * i_17_) + 16777215;
			else if (i_17_ < 100)
			    i_14_ = 65280 - -(327685 * (i_17_ - 50));
			else if (-151 < (i_17_ ^ 0xffffffff))
			    i_14_ = -(327680 * (-100 + i_17_)) + 16777215;
		    }
		    if (0 == Class32.anIntArray537[i])
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method345
			    (class124, arg1 + Class120.anInt2007,
			     arg5 - -Class14_Sub8_Sub27.anInt4548, i_14_, 0);
		    if (-2 == (Class32.anIntArray537[i] ^ 0xffffffff))
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method353
			    (class124, arg1 + Class120.anInt2007,
			     Class14_Sub8_Sub27.anInt4548 + arg5, i_14_, 0,
			     Class42.anInt699);
		    if (Class32.anIntArray537[i] == 2)
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method357
			    (class124, Class120.anInt2007 + arg1,
			     Class14_Sub8_Sub27.anInt4548 + arg5, i_14_, 0,
			     Class42.anInt699);
		    if (3 == Class32.anIntArray537[i])
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method343
			    (class124, arg1 - -Class120.anInt2007,
			     Class14_Sub8_Sub27.anInt4548 + arg5, i_14_, 0,
			     Class42.anInt699,
			     -Class32.anIntArray568[i] + 150);
		    if ((Class32.anIntArray537[i] ^ 0xffffffff) == -5) {
			int i_18_
			    = ((-Class32.anIntArray568[i] + 150)
			       * (100 + Class133_Sub3
					    .aClass14_Sub2_Sub16_3567
					    .method361(class124))
			       / 150);
			Class25.method1002(-50 + (Class120.anInt2007 + arg1),
					   arg5,
					   Class120.anInt2007 + arg1 + 50,
					   arg0 + arg5);
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method364
			    (class124,
			     -i_18_ + (arg1 - -Class120.anInt2007) + 50,
			     Class14_Sub8_Sub27.anInt4548 + arg5, i_14_, 0);
			Class25.method999(arg1, arg5, arg1 + arg3,
					  arg5 - -arg0);
		    }
		    if (-6 == (Class32.anIntArray537[i] ^ 0xffffffff)) {
			int i_19_ = -Class32.anIntArray568[i] + 150;
			Class25.method1002
			    (arg1,
			     (-Class133_Sub3.aClass14_Sub2_Sub16_3567.anInt3978
			      + arg5 + Class14_Sub8_Sub27.anInt4548 - 1),
			     arg3 + arg1,
			     arg5 - -Class14_Sub8_Sub27.anInt4548 - -5);
			int i_20_ = 0;
			if (i_19_ >= 25) {
			    if (125 < i_19_)
				i_20_ = -125 + i_19_;
			} else
			    i_20_ = -25 + i_19_;
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method345
			    (class124, Class120.anInt2007 + arg1,
			     Class14_Sub8_Sub27.anInt4548 + (arg5 + i_20_),
			     i_14_, 0);
			Class25.method999(arg1, arg5, arg1 - -arg3,
					  arg0 + arg5);
		    }
		} else
		    Class133_Sub3.aClass14_Sub2_Sub16_3567.method345
			(class124, Class120.anInt2007 + arg1,
			 arg5 - -Class14_Sub8_Sub27.anInt4548, 16776960, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hd.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
    }
    
    public static void method470(Class124 arg0, Class124 arg1, int arg2,
				 Class124 arg3, int arg4) {
	try {
	    Class14_Sub8_Sub3.method493((byte) -97, arg0, arg3, arg4, arg1,
					-1);
	    anInt2822++;
	    if (arg2 > -124)
		method470(null, null, -113, null, 71);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("hd.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4
			+ ')'));
	}
    }
}
