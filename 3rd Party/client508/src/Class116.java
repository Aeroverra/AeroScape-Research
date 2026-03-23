/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.UnsupportedEncodingException;
import java.util.Date;

import nativeadvert.browsercontrol;

public class Class116
{
    public static int[] anIntArray1928 = new int[50];
    public static int anInt1929 = 2;
    public static int anInt1930;
    public static int anInt1931;
    public static int anInt1932;
    public static int anInt1933;
    public static int anInt1934;
    
    public static boolean method1594(int arg0, int arg1) {
	boolean bool;
	try {
	    if (arg1 != 474)
		method1596(88, (byte) -108, null);
	    anInt1930++;
	    bool = arg0 == (arg0 & -arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sa.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public static void method1595(int arg0) {
	try {
	    Class139.aClass52_2229.method1203((byte) -39);
	    if (arg0 != 0)
		method1597(false, null);
	    anInt1932++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sa.E(" + arg0 + ')');
	}
    }
    
    public static void method1596(int arg0, byte arg1, Class14_Sub21 arg2) {
    while_1074_:
	do {
	while_1073_:
	    do {
		Object[] objects;
		Class14_Sub2_Sub12 class14_sub2_sub12;
		do {
		    try {
			anInt1933++;
			objects = arg2.anObjectArray3115;
			int i = ((Integer) objects[0]).intValue();
			class14_sub2_sub12 = Class118.method1605(true, i);
			if (class14_sub2_sub12 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1073_;
		    }
		    return;
		} while (false);
		int i;
		int[] is;
		int i_0_;
	    while_1072_:
		do {
		    int i_1_;
		    int i_2_;
		    int[] is_3_;
		    do {
			try {
			    Class67.anInt1058 = 0;
			    i_1_ = 0;
			    i = -1;
			    i_2_ = 0;
			    is = class14_sub2_sub12.anIntArray3900;
			    is_3_ = class14_sub2_sub12.anIntArray3907;
			    i_0_ = -1;
			    try {
				Class26_Sub1.aClass124Array3287
				    = (new Class124
				       [class14_sub2_sub12.anInt3904]);
				Class51.anIntArray835
				    = new int[class14_sub2_sub12.anInt3901];
				if (arg1 == 79)
				    break;
			    } catch (Exception exception) {
				break while_1072_;
			    }
			} catch (RuntimeException runtimeexception) {
			    break while_1073_;
			}
			return;
		    } while (false);
		    int i_4_;
		    try {
			int i_5_ = 0;
			int i_6_ = 0;
			for (i_4_ = 1; i_4_ < objects.length; i_4_++) {
			    if (!(objects[i_4_] instanceof Integer)) {
				if (objects[i_4_] instanceof Class124) {
				    Class124 class124
					= (Class124) objects[i_4_];
				    if (class124.method1704((Class79
							     .aClass124_1306),
							    (byte) 65))
					class124 = arg2.aClass124_3101;
				    Class26_Sub1.aClass124Array3287[i_6_++]
					= class124;
				}
			    } else {
				int i_7_
				    = ((Integer) objects[i_4_]).intValue();
				if (2147483646 == (i_7_ ^ 0xffffffff))
				    i_7_ = arg2.anInt3114;
				if (-2147483646 == i_7_)
				    i_7_ = arg2.anInt3106;
				if (i_7_ == -2147483645)
				    i_7_ = (arg2.aClass94_3116 != null
					    ? arg2.aClass94_3116.anInt1548
					    : -1);
				if ((i_7_ ^ 0xffffffff) == 2147483643)
				    i_7_ = arg2.anInt3108;
				if ((i_7_ ^ 0xffffffff) == 2147483642)
				    i_7_ = (arg2.aClass94_3116 != null
					    ? arg2.aClass94_3116.anInt1478
					    : -1);
				if (2147483641 == (i_7_ ^ 0xffffffff))
				    i_7_ = (null == arg2.aClass94_3105 ? -1
					    : arg2.aClass94_3105.anInt1548);
				if ((i_7_ ^ 0xffffffff) == 2147483640)
				    i_7_ = (null != arg2.aClass94_3105
					    ? arg2.aClass94_3105.anInt1478
					    : -1);
				if ((i_7_ ^ 0xffffffff) == 2147483639)
				    i_7_ = arg2.anInt3113;
				if ((i_7_ ^ 0xffffffff) == 2147483638)
				    i_7_ = arg2.anInt3103;
				Class51.anIntArray835[i_5_++] = i_7_;
			    }
			}
			i_4_ = 0;
		    } catch (Exception exception) {
			break;
		    }
		    for (;;) {
			if ((++i_4_ ^ 0xffffffff) < (arg0 ^ 0xffffffff))
			    throw new RuntimeException("slow");
			i_0_ = is_3_[++i];
			if (i_0_ < 100) {
			    if (0 == i_0_) {
				Class79.anIntArray1305[i_1_++] = is[i];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -2) {
				int i_8_ = is[i];
				Class79.anIntArray1305[i_1_++]
				    = Class14_Sub8_Sub11.anIntArray4275[i_8_];
				continue;
			    }
			    if (-3 == (i_0_ ^ 0xffffffff)) {
				int i_9_ = is[i];
				Class14_Sub9_Sub1.method700(i_9_, -105,
							    (Class79
							     .anIntArray1305
							     [--i_1_]));
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -4) {
				Class14_Sub8_Sub39_Sub1.aClass124Array5101
				    [i_2_++]
				    = class14_sub2_sub12.aClass124Array3899[i];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -7) {
				i += is[i];
				continue;
			    }
			    if (i_0_ == 7) {
				i_1_ -= 2;
				if (Class79.anIntArray1305[1 + i_1_]
				    != Class79.anIntArray1305[i_1_])
				    i += is[i];
				continue;
			    }
			    if (-9 == (i_0_ ^ 0xffffffff)) {
				i_1_ -= 2;
				if ((Class79.anIntArray1305[i_1_] ^ 0xffffffff)
				    == (Class79.anIntArray1305[i_1_ - -1]
					^ 0xffffffff))
				    i += is[i];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -10) {
				i_1_ -= 2;
				if (Class79.anIntArray1305[i_1_]
				    < Class79.anIntArray1305[i_1_ - -1])
				    i += is[i];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -11) {
				i_1_ -= 2;
				if ((Class79.anIntArray1305[1 + i_1_]
				     ^ 0xffffffff)
				    > (Class79.anIntArray1305[i_1_]
				       ^ 0xffffffff))
				    i += is[i];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -22) {
				if (Class67.anInt1058 != 0) {
				    try {
					try {
					    Class112 class112
						= (Class83.aClass112Array1341
						   [--Class67.anInt1058]);
					    Class51.anIntArray835
						= class112.anIntArray1870;
					    Class26_Sub1.aClass124Array3287
						= class112.aClass124Array1869;
					    i = class112.anInt1874;
					    class14_sub2_sub12
						= (class112
						   .aClass14_Sub2_Sub12_1873);
					    is_3_ = (class14_sub2_sub12
						     .anIntArray3907);
					    is = (class14_sub2_sub12
						  .anIntArray3900);
					    continue;
					} catch (Exception exception) {
					    break while_1072_;
					}
				    } catch (RuntimeException runtimeexception) {
					break while_1073_;
				    }
				}
				return;
			    }
			    if ((i_0_ ^ 0xffffffff) == -26) {
				int i_10_ = is[i];
				Class79.anIntArray1305[i_1_++]
				    = Class104.method1534(i_10_, 94);
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -28) {
				int i_11_ = is[i];
				Class110.method1574(arg1 + -21,
						    (Class79.anIntArray1305
						     [--i_1_]),
						    i_11_);
				continue;
			    }
			    if (i_0_ == 31) {
				i_1_ -= 2;
				if ((Class79.anIntArray1305[i_1_ + 1]
				     ^ 0xffffffff)
				    <= (Class79.anIntArray1305[i_1_]
					^ 0xffffffff))
				    i += is[i];
				continue;
			    }
			    if (-33 == (i_0_ ^ 0xffffffff)) {
				i_1_ -= 2;
				if ((Class79.anIntArray1305[i_1_ + 1]
				     ^ 0xffffffff)
				    >= (Class79.anIntArray1305[i_1_]
					^ 0xffffffff))
				    i += is[i];
				continue;
			    }
			    if (33 == i_0_) {
				Class79.anIntArray1305[i_1_++]
				    = Class51.anIntArray835[is[i]];
				continue;
			    }
			    if (i_0_ == 34) {
				Class51.anIntArray835[is[i]]
				    = Class79.anIntArray1305[--i_1_];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -36) {
				Class14_Sub8_Sub39_Sub1.aClass124Array5101
				    [i_2_++]
				    = Class26_Sub1.aClass124Array3287[is[i]];
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -37) {
				Class26_Sub1.aClass124Array3287[is[i]]
				    = (Class14_Sub8_Sub39_Sub1
				       .aClass124Array5101[--i_2_]);
				continue;
			    }
			    if (i_0_ == 37) {
				int i_12_ = is[i];
				i_2_ -= i_12_;
				Class124 class124
				    = (Class14_Sub8_Sub39_Sub1.method683
				       (true, i_2_, i_12_,
					(Class14_Sub8_Sub39_Sub1
					 .aClass124Array5101)));
				Class14_Sub8_Sub39_Sub1.aClass124Array5101
				    [i_2_++]
				    = class124;
				continue;
			    }
			    if (i_0_ == 38) {
				i_1_--;
				continue;
			    }
			    if (i_0_ == 39) {
				i_2_--;
				continue;
			    }
			    if (-41 == (i_0_ ^ 0xffffffff)) {
				int i_13_ = is[i];
				Class14_Sub2_Sub12 class14_sub2_sub12_14_
				    = Class118.method1605(true, i_13_);
				int[] is_15_
				    = (new int
				       [class14_sub2_sub12_14_.anInt3901]);
				Class124[] class124s
				    = (new Class124
				       [class14_sub2_sub12_14_.anInt3904]);
				for (int i_16_ = 0;
				     class14_sub2_sub12_14_.anInt3896 > i_16_;
				     i_16_++)
				    is_15_[i_16_]
					= (Class79.anIntArray1305
					   [i_16_ + (-(class14_sub2_sub12_14_
						       .anInt3896)
						     + i_1_)]);
				for (int i_17_ = 0;
				     ((i_17_ ^ 0xffffffff)
				      > (class14_sub2_sub12_14_.anInt3911
					 ^ 0xffffffff));
				     i_17_++)
				    class124s[i_17_]
					= (Class14_Sub8_Sub39_Sub1
					   .aClass124Array5101
					   [(-class14_sub2_sub12_14_.anInt3911
					     + i_2_ - -i_17_)]);
				i_2_ -= class14_sub2_sub12_14_.anInt3911;
				i_1_ -= class14_sub2_sub12_14_.anInt3896;
				Class112 class112 = new Class112();
				class112.aClass14_Sub2_Sub12_1873
				    = class14_sub2_sub12;
				class112.anInt1874 = i;
				class112.anIntArray1870
				    = Class51.anIntArray835;
				class112.aClass124Array1869
				    = Class26_Sub1.aClass124Array3287;
				if (Class83.aClass112Array1341.length
				    <= Class67.anInt1058)
				    throw new RuntimeException();
				class14_sub2_sub12 = class14_sub2_sub12_14_;
				Class83.aClass112Array1341[Class67.anInt1058++]
				    = class112;
				Class26_Sub1.aClass124Array3287 = class124s;
				Class51.anIntArray835 = is_15_;
				is = class14_sub2_sub12.anIntArray3900;
				is_3_ = class14_sub2_sub12.anIntArray3907;
				i = -1;
				continue;
			    }
			    if (-43 == (i_0_ ^ 0xffffffff)) {
				Class79.anIntArray1305[i_1_++]
				    = Class133_Sub1_Sub2.anIntArray4944[is[i]];
				continue;
			    }
			    if (43 == i_0_) {
				int i_18_ = is[i];
				Class133_Sub1_Sub2.anIntArray4944[i_18_]
				    = Class79.anIntArray1305[--i_1_];
				Class124.method1682(arg1 ^ 0xc14, i_18_);
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -45) {
				int i_19_ = 0xffff & is[i];
				int i_20_ = is[i] >> -1670039664;
				int i_21_ = Class79.anIntArray1305[--i_1_];
				if (-1 < (i_21_ ^ 0xffffffff)
				    || -5001 > (i_21_ ^ 0xffffffff))
				    throw new RuntimeException();
				int i_22_ = -1;
				if (-106 == (i_19_ ^ 0xffffffff))
				    i_22_ = 0;
				Class64.anIntArray1016[i_20_] = i_21_;
				for (int i_23_ = 0;
				     ((i_21_ ^ 0xffffffff)
				      < (i_23_ ^ 0xffffffff));
				     i_23_++)
				    Class14_Sub8_Sub10.anIntArrayArray4261
					[i_20_][i_23_]
					= i_22_;
				continue;
			    }
			    if ((i_0_ ^ 0xffffffff) == -46) {
				int i_24_ = is[i];
				int i_25_ = Class79.anIntArray1305[--i_1_];
				if (-1 < (i_25_ ^ 0xffffffff)
				    || Class64.anIntArray1016[i_24_] <= i_25_)
				    throw new RuntimeException();
				Class79.anIntArray1305[i_1_++]
				    = (Class14_Sub8_Sub10.anIntArrayArray4261
				       [i_24_][i_25_]);
				continue;
			    }
			    if (i_0_ == 46) {
				i_1_ -= 2;
				int i_26_ = is[i];
				int i_27_ = Class79.anIntArray1305[i_1_];
				if ((i_27_ ^ 0xffffffff) > -1
				    || ((i_27_ ^ 0xffffffff)
					<= (Class64.anIntArray1016[i_26_]
					    ^ 0xffffffff)))
				    throw new RuntimeException();
				Class14_Sub8_Sub10.anIntArrayArray4261
				    [i_26_][i_27_]
				    = Class79.anIntArray1305[i_1_ + 1];
				continue;
			    }
			    if (-48 == (i_0_ ^ 0xffffffff)) {
				Class124 class124
				    = (Class14_Sub8_Sub24.aClass124Array4499
				       [is[i]]);
				if (class124 == null)
				    class124
					= Class14_Sub8_Sub21.aClass124_4442;
				Class14_Sub8_Sub39_Sub1.aClass124Array5101
				    [i_2_++]
				    = class124;
				continue;
			    }
			    if (i_0_ == 48) {
				int i_28_ = is[i];
				Class14_Sub8_Sub24.aClass124Array4499[i_28_]
				    = (Class14_Sub8_Sub39_Sub1
				       .aClass124Array5101[--i_2_]);
				Class15.method947(i_28_, arg1 ^ ~0x3702);
				continue;
			    }
			    if (-52 == (i_0_ ^ 0xffffffff)) {
				Class55 class55 = (class14_sub2_sub12
						   .aClass55Array3903[is[i]]);
				Class14_Sub1 class14_sub1
				    = ((Class14_Sub1)
				       (class55.method1230
					((long) Class79.anIntArray1305[--i_1_],
					 (byte) -123)));
				if (null != class14_sub1)
				    i += class14_sub1.anInt2714;
				continue;
			    }
			}
			boolean bool;
			if ((is[i] ^ 0xffffffff) == -2)
			    bool = true;
			else
			    bool = false;
			if ((i_0_ ^ 0xffffffff) <= -301) {
			    if ((i_0_ ^ 0xffffffff) > -501) {
				if ((i_0_ ^ 0xffffffff) == -404) {
				    i_1_ -= 2;
				    int i_29_ = Class79.anIntArray1305[i_1_];
				    if (-8 >= (i_29_ ^ 0xffffffff))
					i_29_ -= 7;
				    int i_30_
					= Class79.anIntArray1305[i_1_ + 1];
				    Class14_Sub3.aClass133_Sub1_Sub1_2748
					.aClass102_4941
					.method1518(i_29_, i_30_, 119);
				} else if (i_0_ == 404) {
				    i_1_ -= 2;
				    int i_31_ = Class79.anIntArray1305[i_1_];
				    int i_32_
					= Class79.anIntArray1305[1 + i_1_];
				    Class14_Sub3.aClass133_Sub1_Sub1_2748
					.aClass102_4941
					.method1526(false, i_32_, i_31_);
				} else {
				    if (-411 != (i_0_ ^ 0xffffffff))
					break;
				    boolean bool_33_
					= ((Class79.anIntArray1305[--i_1_]
					    ^ 0xffffffff)
					   != -1);
				    Class14_Sub3.aClass133_Sub1_Sub1_2748
					.aClass102_4941
					.method1519(bool_33_, false);
				}
			    } else if ((i_0_ < 1000 || i_0_ >= 1100)
				       && ((i_0_ ^ 0xffffffff) > -2001
					   || 2100 <= i_0_)) {
				if ((1100 > i_0_ || 1200 <= i_0_)
				    && (2100 > i_0_
					|| (i_0_ ^ 0xffffffff) <= -2201)) {
				    if ((1200 > i_0_
					 || -1301 >= (i_0_ ^ 0xffffffff))
					&& ((i_0_ ^ 0xffffffff) > -2201
					    || 2300 <= i_0_)) {
					if ((-1301 < (i_0_ ^ 0xffffffff)
					     || i_0_ >= 1400)
					    && ((i_0_ ^ 0xffffffff) > -2301
						|| -2401 >= (i_0_
							     ^ 0xffffffff))) {
					    if (((i_0_ ^ 0xffffffff) > -1401
						 || 1500 <= i_0_)
						&& (2400 > i_0_
						    || ((i_0_ ^ 0xffffffff)
							<= -2501))) {
						if ((i_0_ ^ 0xffffffff)
						    <= -1601) {
						    if (-1701
							>= (i_0_
							    ^ 0xffffffff)) {
							if (i_0_ < 1800) {
							    Class94 class94
								= (!bool
								   ? (Class14_Sub8_Sub8
								      .aClass94_4223)
								   : (Class85
								      .aClass94_1372));
							    if (-1701
								== (i_0_
								    ^ 0xffffffff))
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1532);
							    else if (-1702
								     == (i_0_
									 ^ 0xffffffff)) {
								if (-1
								    == (class94
									.anInt1532))
								    Class79
									.anIntArray1305
									[i_1_++]
									= 0;
								else
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1495);
							    } else if (1702
								       == i_0_)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1478);
							    else
								break;
							} else if (-1901
								   < (i_0_
								      ^ 0xffffffff)) {
							    Class94 class94
								= (bool
								   ? (Class85
								      .aClass94_1372)
								   : (Class14_Sub8_Sub8
								      .aClass94_4223));
							    if (1800 == i_0_)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (Class44
									   .method1158
								       ((client
									     .method46
									 (class94)),
									false));
							    else if (i_0_
								     == 1801) {
								int i_34_
								    = (Class79
								       .anIntArray1305
								       [--i_1_]);
								i_34_--;
								if (((class94
								      .aClass124Array1573)
								     == null)
								    || (i_34_
									>= (class94
									    .aClass124Array1573).length)
								    || (null
									== (class94
									    .aClass124Array1573
									    [i_34_])))
								    Class14_Sub8_Sub39_Sub1
									.aClass124Array5101
									[i_2_++]
									= (Class140
									   .aClass124_2234);
								else
								    Class14_Sub8_Sub39_Sub1
									.aClass124Array5101
									[i_2_++]
									= (class94
									   .aClass124Array1573
									   [i_34_]);
							    } else if ((i_0_
									^ 0xffffffff)
								       == -1803) {
								if ((class94
								     .aClass124_1508)
								    != null)
								    Class14_Sub8_Sub39_Sub1
									.aClass124Array5101
									[i_2_++]
									= (class94
									   .aClass124_1508);
								else
								    Class14_Sub8_Sub39_Sub1
									.aClass124Array5101
									[i_2_++]
									= (Class140
									   .aClass124_2234);
							    } else
								break;
							} else if ((i_0_
								    ^ 0xffffffff)
								   <= -2601) {
							    if (2700 > i_0_) {
								Class94 class94
								    = (Class55
									   .method1233
								       ((Class79
									 .anIntArray1305
									 [--i_1_]),
									21803));
								if ((i_0_
								     ^ 0xffffffff)
								    == -2601)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1490);
								else if (i_0_
									 == 2601)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1547);
								else if (i_0_
									 == 2602)
								    Class14_Sub8_Sub39_Sub1
									.aClass124Array5101
									[i_2_++]
									= (class94
									   .aClass124_1499);
								else if (-2604
									 == (i_0_
									     ^ 0xffffffff))
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1544);
								else if ((i_0_
									  ^ 0xffffffff)
									 == -2605)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1605);
								else if (-2606
									 == (i_0_
									     ^ 0xffffffff))
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1513);
								else if (-2607
									 == (i_0_
									     ^ 0xffffffff))
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1465);
								else if (i_0_
									 == 2607)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1516);
								else if (2608
									 == i_0_)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1578);
								else if (2609
									 == i_0_)
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1590);
								else
								    break;
							    } else if ((i_0_
									^ 0xffffffff)
								       <= -2801) {
								if (-2901
								    < (i_0_
								       ^ 0xffffffff)) {
								    Class94 class94
									= (Class55.method1233
									   ((Class79
									     .anIntArray1305
									     [--i_1_]),
									    21803));
								    if (-2801
									== (i_0_
									    ^ 0xffffffff))
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class44.method1158(client.method46(class94), false);
								    else if (2801
									     == i_0_) {
									int i_35_
									    = Class79.anIntArray1305[--i_1_];
									i_35_--;
									if ((null
									     == class94.aClass124Array1573)
									    || (i_35_ ^ 0xffffffff) <= (class94.aClass124Array1573.length ^ 0xffffffff)
									    || null == class94.aClass124Array1573[i_35_])
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class94.aClass124Array1573[i_35_];
								    } else if (i_0_
									       == 2802) {
									if (class94.aClass124_1508
									    == null)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class94.aClass124_1508;
								    } else
									break;
								} else if (i_0_
									   < 3200) {
								    if (-3101
									== (i_0_
									    ^ 0xffffffff)) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class15
									    .method943
									    (class124,
									     false,
									     Class140.aClass124_2234,
									     0);
								    } else if (3101
									       == i_0_) {
									i_1_ -= 2;
									Class83
									    .method1408
									    (Class14_Sub3.aClass133_Sub1_Sub1_2748,
									     Class79.anIntArray1305[1 + i_1_],
									     false,
									     Class79.anIntArray1305[i_1_]);
								    } else if (-3104
									       == (i_0_ ^ 0xffffffff))
									Class140
									    .method1958
									    ((byte) 81);
								    else if (-3105
									     == (i_0_ ^ 0xffffffff)) {
									Class14_Sub2_Sub11
									    .anInt3873++;
									int i_36_
									    = 0;
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									if (class124.method1701
									    (124))
									    i_36_ = class124.method1702(arg1 ^ 0x38);
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method843
									    (0,
									     43);
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method803
									    (i_36_,
									     124);
								    } else if (3105
									       == i_0_) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method843
									    (0,
									     189);
									Class14_Sub15
									    .anInt2994++;
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method817
									    (class124.method1692(arg1 + -79),
									     90);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3107) {
									Class14_Sub8_Sub28
									    .anInt4557++;
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method843
									    (0,
									     127);
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method809
									    (false,
									     1 + class124.method1693(arg1 ^ 0x4f));
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method814
									    (arg1 + 32689,
									     class124);
								    } else if (-3108
									       == (i_0_ ^ 0xffffffff)) {
									int i_37_
									    = Class79.anIntArray1305[--i_1_];
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class114
									    .method1587
									    (class124,
									     0,
									     i_37_);
								    } else if (i_0_
									       == 3108) {
									i_1_ -= 3;
									int i_38_
									    = Class79.anIntArray1305[i_1_];
									int i_39_
									    = Class79.anIntArray1305[i_1_ + 2];
									int i_40_
									    = Class79.anIntArray1305[i_1_ + 1];
									Class94 class94
									    = Class55.method1233(i_39_, 21803);
									Class133_Sub5
									    .method1843
									    (arg1 + -179,
									     i_40_,
									     class94,
									     i_38_);
								    } else if (3109
									       == i_0_) {
									i_1_ -= 2;
									int i_41_
									    = Class79.anIntArray1305[i_1_];
									Class94 class94
									    = bool ? Class85.aClass94_1372 : Class14_Sub8_Sub8.aClass94_4223;
									int i_42_
									    = Class79.anIntArray1305[1 + i_1_];
									Class133_Sub5
									    .method1843
									    (104,
									     i_42_,
									     class94,
									     i_41_);
								    } else {
									if (3110
									    != i_0_)
									    break;
									Class14_Sub8_Sub12
									    .anInt4301++;
									int i_43_
									    = Class79.anIntArray1305[--i_1_];
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method843
									    (0,
									     195);
									Class55
									    .aClass14_Sub10_Sub1_891
									    .method833
									    ((byte) 114,
									     i_43_);
								    }
								} else if (-3301
									   < (i_0_
									      ^ 0xffffffff)) {
								    if (i_0_
									== 3200) {
									i_1_ -= 3;
									Class47
									    .method1181
									    (Class79.anIntArray1305[1 + i_1_],
									     Class79.anIntArray1305[i_1_],
									     Class79.anIntArray1305[2 + i_1_],
									     (byte) -62);
								    } else if (3201
									       == i_0_)
									Class98
									    .method1492
									    (Class79.anIntArray1305[--i_1_],
									     (byte) -107);
								    else {
									if ((i_0_
									     ^ 0xffffffff)
									    != -3203)
									    break;
									i_1_ -= 2;
									Class153
									    .method2049
									    (Class79.anIntArray1305[i_1_],
									     Class79.anIntArray1305[i_1_ - -1],
									     arg1 ^ ~0x4f);
								    }
								} else if (i_0_
									   < 3400) {
								    if (i_0_
									== 3300)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub2_Sub20.anInt4064;
								    else if ((i_0_
									      ^ 0xffffffff)
									     == -3302) {
									i_1_ -= 2;
									int i_44_
									    = Class79.anIntArray1305[i_1_];
									int i_45_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub10.method526((byte) 117, i_45_, i_44_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3303) {
									i_1_ -= 2;
									int i_46_
									    = Class79.anIntArray1305[i_1_];
									int i_47_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub29.method931(i_47_, arg1 + 3879, i_46_);
								    } else if (i_0_
									       == 3303) {
									i_1_ -= 2;
									int i_48_
									    = Class79.anIntArray1305[i_1_];
									int i_49_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub2_Sub12.method322(i_48_, (byte) 55, i_49_);
								    } else if (-3305
									       == (i_0_ ^ 0xffffffff)) {
									int i_50_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class17.method960(24205, i_50_).anInt4062;
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3306) {
									int i_51_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub21.anIntArray4444[i_51_];
								    } else if (-3307
									       == (i_0_ ^ 0xffffffff)) {
									int i_52_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class56.anIntArray913[i_52_];
								    } else if (-3308
									       == (i_0_ ^ 0xffffffff)) {
									int i_53_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub2_Sub12.anIntArray3916[i_53_];
								    } else if (-3309
									       == (i_0_ ^ 0xffffffff)) {
									int i_54_
									    = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
									       >> 153637831) + Class133_Sub6.anInt3676;
									int i_55_
									    = Class14_Sub2_Sub3.anInt3785;
									int i_56_
									    = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
									       >> 600890983) + Class58.anInt947;
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (i_54_
									       << 1730778990) + (i_55_ << -1070061380) + i_56_;
								    } else if (3309
									       == i_0_) {
									int i_57_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub26.method617(268419723, i_57_) >> 989902542;
								    } else if (i_0_
									       == 3310) {
									int i_58_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_58_ >> -754239492;
								    } else if (i_0_
									       == 3311) {
									int i_59_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub26.method617(16383, i_59_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3313)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class132.aBoolean2170 ? 1 : 0;
								    else if ((i_0_
									      ^ 0xffffffff)
									     == -3314) {
									i_1_ -= 2;
									int i_60_
									    = Class79.anIntArray1305[i_1_ + 1];
									int i_61_
									    = 32768 + Class79.anIntArray1305[i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub10.method526((byte) -123, i_60_, i_61_);
								    } else if (3314
									       == i_0_) {
									i_1_ -= 2;
									int i_62_
									    = Class79.anIntArray1305[i_1_] - -32768;
									int i_63_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub29.method931(i_63_, 3958, i_62_);
								    } else if (i_0_
									       == 3315) {
									i_1_ -= 2;
									int i_64_
									    = 32768 + Class79.anIntArray1305[i_1_];
									int i_65_
									    = Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub2_Sub12.method322(i_64_, (byte) 55, i_65_);
								    } else if (3316
									       == i_0_) {
									if (Class152.anInt2439
									    < 2)
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = Class152.anInt2439;
								    } else if (3317
									       == i_0_)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class7_Sub2.anInt2675;
								    else if (i_0_
									     == 3318)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class120.anInt2005;
								    else if (i_0_
									     == 3321)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class1.anInt73;
								    else if (3322
									     == i_0_)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub4.anInt2789;
								    else if (3323
									     == i_0_) {
									if ((-6
									     < (Class14_Sub10.anInt2889 ^ 0xffffffff))
									    || 9 < Class14_Sub10.anInt2889)
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = 1;
								    } else if (-3325
									       == (i_0_ ^ 0xffffffff)) {
									if ((-6
									     < (Class14_Sub10.anInt2889 ^ 0xffffffff))
									    || -10 > (Class14_Sub10.anInt2889 ^ 0xffffffff))
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = Class14_Sub10.anInt2889;
								    } else if (-3326
									       == (i_0_ ^ 0xffffffff)) {
									if (Class14_Sub20.anInt3090
									    > 0)
									    Class79.anIntArray1305[i_1_++] = 1;
									else
									    Class79.anIntArray1305[i_1_++] = 0;
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3327)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937;
								    else if (-3328
									     == (i_0_ ^ 0xffffffff))
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941.aBoolean1711 ? 1 : 0;
								    else if (3328
									     == i_0_)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class146.anInt2365;
								    else if (i_0_
									     == 3329)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub2_Sub21.anInt4081;
								    else if (i_0_
									     == 3330) {
									int i_66_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub34.method658((byte) -111, i_66_);
								    } else if (3331
									       == i_0_) {
									i_1_ -= 2;
									int i_67_
									    = Class79.anIntArray1305[i_1_];
									int i_68_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class24.method993(false, -28006, i_68_, i_67_);
								    } else if (-3333
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 2;
									int i_69_
									    = Class79.anIntArray1305[i_1_];
									int i_70_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class24.method993(true, -28006, i_70_, i_69_);
								    } else {
									if (-3334
									    != (i_0_ ^ 0xffffffff))
									    break;
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class75.anInt1163;
								    }
								} else if (3500
									   > i_0_) {
								    if ((i_0_
									 ^ 0xffffffff)
									== -3401) {
									i_1_ -= 2;
									int i_71_
									    = Class79.anIntArray1305[i_1_];
									int i_72_
									    = Class79.anIntArray1305[1 + i_1_];
									Class14_Sub2_Sub8 class14_sub2_sub8
									    = Class99_Sub2.method1507(-8475, i_71_);
									if (class14_sub2_sub8.anInt3845
									    != 115) {
									    /* empty */
									}
									Class14_Sub8_Sub39_Sub1
									    .aClass124Array5101
									    [i_2_++]
									    = class14_sub2_sub8.method295(-66, i_72_);
								    } else if (-3409
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 4;
									int i_73_
									    = Class79.anIntArray1305[i_1_];
									int i_74_
									    = Class79.anIntArray1305[1 + i_1_];
									int i_75_
									    = Class79.anIntArray1305[i_1_ + 2];
									int i_76_
									    = Class79.anIntArray1305[3 + i_1_];
									Class14_Sub2_Sub8 class14_sub2_sub8
									    = Class99_Sub2.method1507(-8475, i_75_);
									if ((i_73_
									     != class14_sub2_sub8.anInt3851)
									    || (class14_sub2_sub8.anInt3845 ^ 0xffffffff) != (i_74_ ^ 0xffffffff))
									    throw new RuntimeException("C3408-1");
									if ((i_74_
									     ^ 0xffffffff)
									    == -116)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class14_sub2_sub8.method295(Canvas_Sub2.method69(arg1, -60), i_76_);
									else
									    Class79.anIntArray1305[i_1_++] = class14_sub2_sub8.method299(Canvas_Sub2.method69(arg1, 77), i_76_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3410) {
									i_1_ -= 3;
									int i_77_
									    = Class79.anIntArray1305[1 + i_1_];
									int i_78_
									    = Class79.anIntArray1305[i_1_];
									int i_79_
									    = Class79.anIntArray1305[i_1_ - -2];
									Class14_Sub2_Sub8 class14_sub2_sub8
									    = Class99_Sub2.method1507(-8475, i_77_);
									if (i_78_
									    != class14_sub2_sub8.anInt3845)
									    throw new RuntimeException("C3409-1");
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = class14_sub2_sub8.method294(i_79_, 96) ? 1 : 0;
								    } else {
									if (-3411
									    != (i_0_ ^ 0xffffffff))
									    break;
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									int i_80_
									    = Class79.anIntArray1305[--i_1_];
									Class14_Sub2_Sub8 class14_sub2_sub8
									    = Class99_Sub2.method1507(-8475, i_80_);
									if (class14_sub2_sub8.anInt3845
									    != 115)
									    throw new RuntimeException("C3410-1");
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = class14_sub2_sub8.method300(class124, (byte) -98) ? 1 : 0;
								    }
								} else if (-3701
									   < (i_0_
									      ^ 0xffffffff)) {
								    if ((i_0_
									 ^ 0xffffffff)
									== -3601) {
									if ((Class15.anInt380
									     ^ 0xffffffff)
									    == -1)
									    Class79.anIntArray1305[i_1_++] = -2;
									else if (1 == Class15.anInt380)
									    Class79.anIntArray1305[i_1_++] = -1;
									else
									    Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub1.anInt3728;
								    } else if (-3602
									       == (i_0_ ^ 0xffffffff)) {
									int i_81_
									    = Class79.anIntArray1305[--i_1_];
									if (2 != Class15.anInt380
									    || (i_81_ ^ 0xffffffff) <= (Class14_Sub2_Sub1.anInt3728 ^ 0xffffffff))
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub10.aClass124Array2938[i_81_];
								    } else if (i_0_
									       == 3602) {
									int i_82_
									    = Class79.anIntArray1305[--i_1_];
									if ((Class15.anInt380
									     == 2)
									    && i_82_ < Class14_Sub2_Sub1.anInt3728)
									    Class79.anIntArray1305[i_1_++] = Class45.anIntArray743[i_82_];
									else
									    Class79.anIntArray1305[i_1_++] = 0;
								    } else if (3603
									       == i_0_) {
									int i_83_
									    = Class79.anIntArray1305[--i_1_];
									if ((-3
									     != (Class15.anInt380 ^ 0xffffffff))
									    || i_83_ >= Class14_Sub2_Sub1.anInt3728)
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub1.anIntArray3720[i_83_];
								    } else if (i_0_
									       == 3604) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									int i_84_
									    = Class79.anIntArray1305[--i_1_];
									Class14_Sub14
									    .method867
									    ((byte) 123,
									     class124,
									     i_84_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3606) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class14_Sub8_Sub28
									    .method630
									    (1003,
									     class124.method1692(arg1 + -79));
								    } else if (-3607
									       == (i_0_ ^ 0xffffffff)) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class14_Sub8_Sub15
									    .method558
									    (class124.method1692(0),
									     (byte) -17);
								    } else if (-3608
									       == (i_0_ ^ 0xffffffff)) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class14_Sub22
									    .method899
									    (class124.method1692(0),
									     -106);
								    } else if (-3609
									       == (i_0_ ^ 0xffffffff)) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class14_Sub8_Sub9
									    .method520
									    (1,
									     class124.method1692(0));
								    } else if (3609
									       == i_0_) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									if ((class124.method1690
									     (Class14_Sub15.aClass124_2993,
									      33))
									    || class124.method1690(Canvas_Sub1.aClass124_46, 33))
									    class124 = class124.method1696(7, arg1 + -64);
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = !Class98.method1493(-1, class124) ? 0 : 1;
								    } else if (3610
									       == i_0_) {
									int i_85_
									    = Class79.anIntArray1305[--i_1_];
									if (2 == Class15.anInt380
									    && i_85_ < Class14_Sub2_Sub1.anInt3728)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub2_Sub15.aClass124Array3959[i_85_];
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
								    } else if (i_0_
									       == 3611) {
									if (Class7_Sub3_Sub1.aClass124_3710
									    == null)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class7_Sub3_Sub1.aClass124_3710.method1685(0);
								    } else if (3612
									       == i_0_) {
									if (Class7_Sub3_Sub1.aClass124_3710
									    != null)
									    Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub21.anInt4084;
									else
									    Class79.anIntArray1305[i_1_++] = 0;
								    } else if (3613
									       == i_0_) {
									int i_86_
									    = Class79.anIntArray1305[--i_1_];
									if ((Class7_Sub3_Sub1.aClass124_3710
									     != null)
									    && Class14_Sub2_Sub21.anInt4084 > i_86_)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_86_].aClass124_3132.method1685(0);
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
								    } else if (-3615
									       == (i_0_ ^ 0xffffffff)) {
									int i_87_
									    = Class79.anIntArray1305[--i_1_];
									if ((Class7_Sub3_Sub1.aClass124_3710
									     != null)
									    && (i_87_ ^ 0xffffffff) > (Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff))
									    Class79.anIntArray1305[i_1_++] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_87_].anInt3128;
									else
									    Class79.anIntArray1305[i_1_++] = 0;
								    } else if (-3616
									       == (i_0_ ^ 0xffffffff)) {
									int i_88_
									    = Class79.anIntArray1305[--i_1_];
									if ((null
									     == Class7_Sub3_Sub1.aClass124_3710)
									    || (i_88_ ^ 0xffffffff) <= (Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff))
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_88_].aByte3131;
								    } else if (-3617
									       == (i_0_ ^ 0xffffffff))
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub30.aByte3283;
								    else if ((i_0_
									      ^ 0xffffffff)
									     == -3618) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class14_Sub4
									    .method459
									    (class124,
									     2);
								    } else if (i_0_
									       == 3618)
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class153.aByte2442;
								    else if (i_0_
									     == 3619) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									Class89
									    .method1441
									    (class124.method1692(0),
									     true);
								    } else if (-3621
									       == (i_0_ ^ 0xffffffff))
									Class133_Sub4
									    .method1835
									    (-73);
								    else if (-3622
									     == (i_0_ ^ 0xffffffff)) {
									if ((Class15.anInt380
									     ^ 0xffffffff)
									    == -1)
									    Class79.anIntArray1305[i_1_++] = -1;
									else
									    Class79.anIntArray1305[i_1_++] = Class42.anInt698;
								    } else if (-3623
									       == (i_0_ ^ 0xffffffff)) {
									int i_89_
									    = Class79.anIntArray1305[--i_1_];
									if ((-1
									     != (Class15.anInt380 ^ 0xffffffff))
									    && (i_89_ ^ 0xffffffff) > (Class42.anInt698 ^ 0xffffffff))
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class46.method1174(Class126.aLongArray2095[i_89_], (byte) 76).method1685(0);
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
								    } else if (i_0_
									       == 3623) {
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									if ((class124.method1690
									     (Class14_Sub15.aClass124_2993,
									      33))
									    || class124.method1690(Canvas_Sub1.aClass124_46, 33))
									    class124 = class124.method1696(7, arg1 + -64);
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = !Class14_Sub8_Sub22.method597(class124, 0) ? 0 : 1;
								    } else if ((i_0_ ^ 0xffffffff)
									       == -3625) {
									int i_90_
									    = Class79.anIntArray1305[--i_1_];
									if ((null
									     == Class133_Sub1_Sub2.aClass14_Sub23Array4945)
									    || (i_90_ ^ 0xffffffff) <= (Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff)
									    || !Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_90_].aClass124_3132.method1717(40, Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922))
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = 1;
								    } else if (3625
									       == i_0_) {
									if (null
									    != Class4.aClass124_129)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class4.aClass124_129.method1685(0);
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
								    } else if (3626
									       == i_0_) {
									int i_91_
									    = Class79.anIntArray1305[--i_1_];
									if ((Class7_Sub3_Sub1.aClass124_3710
									     == null)
									    || Class14_Sub2_Sub21.anInt4084 <= i_91_)
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									else
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_91_].aClass124_3127;
								    } else if (-3628
									       == (i_0_ ^ 0xffffffff)) {
									int i_92_
									    = Class79.anIntArray1305[--i_1_];
									if ((Class15.anInt380
									     != 2)
									    || -1 < (i_92_ ^ 0xffffffff)
									    || (i_92_ ^ 0xffffffff) <= (Class14_Sub2_Sub1.anInt3728 ^ 0xffffffff))
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = !Class58.aBooleanArray950[i_92_] ? 0 : 1;
								    } else {
									if (i_0_
									    != 3628)
									    break;
									Class124 class124
									    = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									if ((class124.method1690
									     (Class14_Sub15.aClass124_2993,
									      33))
									    || class124.method1690(Canvas_Sub1.aClass124_46, 33))
									    class124 = class124.method1696(7, 15);
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class117.method1601(class124, 6);
								    }
								} else if (4000
									   <= i_0_) {
								    if (i_0_
									>= 4100) {
									if ((i_0_
									     ^ 0xffffffff)
									    <= -4201) {
									    if (-4301 >= (i_0_ ^ 0xffffffff)) {
										if (4400 <= i_0_) {
										    if (4500 > i_0_) {
											if (-4401 != (i_0_ ^ 0xffffffff))
											    break;
											i_1_ -= 2;
											int i_93_ = Class79.anIntArray1305[1 + i_1_];
											int i_94_ = Class79.anIntArray1305[i_1_];
											Class14_Sub2_Sub2 class14_sub2_sub2 = Class17.method958((byte) -15, i_93_);
											if (!class14_sub2_sub2.method261((byte) 57))
											    Class79.anIntArray1305[i_1_++] = Class79.method1377((byte) -106, i_94_).method1388(i_93_, class14_sub2_sub2.anInt3766, 92);
											else
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class79.method1377((byte) -106, i_94_).method1390((byte) -120, i_93_, class14_sub2_sub2.aClass124_3760);
										    } else if (4600 > i_0_) {
											if ((i_0_ ^ 0xffffffff) != -4501)
											    break;
											i_1_ -= 2;
											int i_95_ = Class79.anIntArray1305[i_1_ + 1];
											int i_96_ = Class79.anIntArray1305[i_1_];
											Class14_Sub2_Sub2 class14_sub2_sub2 = Class17.method958((byte) -127, i_95_);
											if (!class14_sub2_sub2.method261((byte) 92))
											    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub34.method661(true, i_96_).method267((byte) -109, i_95_, class14_sub2_sub2.anInt3766);
											else
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub34.method661(true, i_96_).method275(i_95_, 1, class14_sub2_sub2.aClass124_3760);
										    } else if (-5101 < (i_0_ ^ 0xffffffff)) {
											if ((i_0_ ^ 0xffffffff) == -5001)
											    Class79.anIntArray1305[i_1_++] = Class14_Sub3.anInt2764;
											else if (i_0_ == 5001) {
											    i_1_ -= 3;
											    Class14_Sub3.anInt2764 = Class79.anIntArray1305[i_1_];
											    Class14_Sub8_Sub25.anInt4505 = Class79.anIntArray1305[1 + i_1_];
											    Class67.anInt1052++;
											    Class32.anInt566 = Class79.anIntArray1305[i_1_ + 2];
											    Class55.aClass14_Sub10_Sub1_891.method843(0, 212);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, Class14_Sub3.anInt2764);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, Class14_Sub8_Sub25.anInt4505);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, Class32.anInt566);
											} else if (-5003 == (i_0_ ^ 0xffffffff)) {
											    Class133_Sub1.anInt3503++;
											    i_1_ -= 2;
											    int i_97_ = Class79.anIntArray1305[1 + i_1_];
											    int i_98_ = Class79.anIntArray1305[i_1_];
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
											    Class55.aClass14_Sub10_Sub1_891.method843(arg1 ^ 0x4f, 159);
											    Class55.aClass14_Sub10_Sub1_891.method817(class124.method1692(arg1 ^ 0x4f), arg1 + 32);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, -1 + i_98_);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, i_97_);
											} else if (-5004 == (i_0_ ^ 0xffffffff)) {
											    Class124 class124 = null;
											    int i_99_ = Class79.anIntArray1305[--i_1_];
											    if (100 > i_99_)
												class124 = Class14_Sub2_Sub18.aClass124Array4024[i_99_];
											    if (null == class124)
												class124 = Class140.aClass124_2234;
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
											} else if ((i_0_ ^ 0xffffffff) == -5005) {
											    int i_100_ = Class79.anIntArray1305[--i_1_];
											    int i_101_ = -1;
											    if (i_100_ < 100 && Class14_Sub2_Sub18.aClass124Array4024[i_100_] != null)
												i_101_ = Class114.anIntArray1902[i_100_];
											    Class79.anIntArray1305[i_1_++] = i_101_;
											} else if (5005 == i_0_)
											    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub25.anInt4505;
											else if ((i_0_ ^ 0xffffffff) == -5009) {
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
											    if (class124.method1690(Class14_Sub29.aClass124_3263, 33))
												Class133_Sub1.method1798(class124, (byte) 7);
											    else if (-1 != (Class152.anInt2439 ^ 0xffffffff) || 1 != Class146.anInt2365 && Class14_Sub2_Sub21.anInt4081 != 1) {
												Class124 class124_102_ = class124.method1716((byte) 63);
												Class19.anInt2553++;
												int i_103_ = 0;
												if (class124_102_.method1690(Class104.aClass124_1748, 33)) {
												    class124 = class124.method1696(Class104.aClass124_1748.method1693(0), 15);
												    i_103_ = 0;
												} else if (class124_102_.method1690(Class58.aClass124_943, 33)) {
												    i_103_ = 1;
												    class124 = class124.method1696(Class58.aClass124_943.method1693(0), 15);
												} else if (!class124_102_.method1690(Class84.aClass124_1347, 33)) {
												    if (class124_102_.method1690(Class15.aClass124_383, 33)) {
													i_103_ = 3;
													class124 = class124.method1696(Class15.aClass124_383.method1693(0), 15);
												    } else if (class124_102_.method1690(Class137.aClass124_2202, 33)) {
													i_103_ = 4;
													class124 = class124.method1696(Class137.aClass124_2202.method1693(0), 15);
												    } else if (class124_102_.method1690(Class118.aClass124_1979, 33)) {
													class124 = class124.method1696(Class118.aClass124_1979.method1693(arg1 ^ 0x4f), 15);
													i_103_ = 5;
												    } else if (!class124_102_.method1690(Class12.aClass124_311, arg1 + -46)) {
													if (class124_102_.method1690(Class127.aClass124_2113, 33)) {
													    class124 = class124.method1696(Class127.aClass124_2113.method1693(0), arg1 + -64);
													    i_103_ = 7;
													} else if (!class124_102_.method1690(Class7_Sub2.aClass124_2670, arg1 + -46)) {
													    if (class124_102_.method1690(Class124.aClass124_2476, 33)) {
														class124 = class124.method1696(Class124.aClass124_2476.method1693(0), 15);
														i_103_ = 9;
													    } else if (class124_102_.method1690(Class14_Sub10.aClass124_2887, 33)) {
														i_103_ = 10;
														class124 = class124.method1696(Class14_Sub10.aClass124_2887.method1693(arg1 + -79), 15);
													    } else if (!class124_102_.method1690(Class128.aClass124_2126, arg1 ^ 0x6e)) {
														if (0 != Class125_Sub2.anInt3383) {
														    if (!class124_102_.method1690(Class104.aClass124_1743, 33)) {
															if (class124_102_.method1690(Class58.aClass124_942, 33)) {
															    i_103_ = 1;
															    class124 = class124.method1696(Class58.aClass124_942.method1693(arg1 ^ 0x4f), 15);
															} else if (!class124_102_.method1690(Class84.aClass124_1352, 33)) {
															    if (class124_102_.method1690(Class15.aClass124_373, 33)) {
																class124 = class124.method1696(Class15.aClass124_373.method1693(arg1 ^ 0x4f), 15);
																i_103_ = 3;
															    } else if (!class124_102_.method1690(Class137.aClass124_2201, 33)) {
																if (class124_102_.method1690(Class118.aClass124_1988, 33)) {
																    class124 = class124.method1696(Class118.aClass124_1988.method1693(0), 15);
																    i_103_ = 5;
																} else if (!class124_102_.method1690(Class12.aClass124_328, 33)) {
																    if (class124_102_.method1690(Class127.aClass124_2117, 33)) {
																	class124 = class124.method1696(Class127.aClass124_2117.method1693(0), arg1 + -64);
																	i_103_ = 7;
																    } else if (!class124_102_.method1690(Class7_Sub2.aClass124_2672, 33)) {
																	if (!class124_102_.method1690(Class124.aClass124_2497, 33)) {
																	    if (class124_102_.method1690(Class14_Sub10.aClass124_2872, arg1 ^ 0x6e)) {
																		i_103_ = 10;
																		class124 = class124.method1696(Class14_Sub10.aClass124_2872.method1693(0), arg1 ^ 0x40);
																	    } else if (class124_102_.method1690(Class128.aClass124_2122, 33)) {
																		class124 = class124.method1696(Class128.aClass124_2122.method1693(arg1 ^ 0x4f), 15);
																		i_103_ = 11;
																	    }
																	} else {
																	    class124 = class124.method1696(Class124.aClass124_2497.method1693(0), arg1 ^ 0x40);
																	    i_103_ = 9;
																	}
																    } else {
																	i_103_ = 8;
																	class124 = class124.method1696(Class7_Sub2.aClass124_2672.method1693(0), 15);
																    }
																} else {
																    class124 = class124.method1696(Class12.aClass124_328.method1693(0), arg1 + -64);
																    i_103_ = 6;
																}
															    } else {
																i_103_ = 4;
																class124 = class124.method1696(Class137.aClass124_2201.method1693(arg1 ^ 0x4f), 15);
															    }
															} else {
															    i_103_ = 2;
															    class124 = class124.method1696(Class84.aClass124_1352.method1693(arg1 + -79), arg1 ^ 0x40);
															}
														    } else {
															i_103_ = 0;
															class124 = class124.method1696(Class104.aClass124_1743.method1693(arg1 ^ 0x4f), arg1 ^ 0x40);
														    }
														}
													    } else {
														i_103_ = 11;
														class124 = class124.method1696(Class128.aClass124_2126.method1693(arg1 + -79), 15);
													    }
													} else {
													    i_103_ = 8;
													    class124 = class124.method1696(Class7_Sub2.aClass124_2670.method1693(0), 15);
													}
												    } else {
													class124 = class124.method1696(Class12.aClass124_311.method1693(arg1 + -79), 15);
													i_103_ = 6;
												    }
												} else {
												    i_103_ = 2;
												    class124 = class124.method1696(Class84.aClass124_1347.method1693(0), 15);
												}
												class124_102_ = class124.method1716((byte) 63);
												int i_104_ = 0;
												if (class124_102_.method1690(Class14_Sub8_Sub27.aClass124_4545, 33)) {
												    class124 = class124.method1696(Class14_Sub8_Sub27.aClass124_4545.method1693(0), 15);
												    i_104_ = 1;
												} else if (class124_102_.method1690(Class108.aClass124_1815, 33)) {
												    i_104_ = 2;
												    class124 = class124.method1696(Class108.aClass124_1815.method1693(arg1 ^ 0x4f), 15);
												} else if (class124_102_.method1690(Class14_Sub11.aClass124_2941, 33)) {
												    i_104_ = 3;
												    class124 = class124.method1696(Class14_Sub11.aClass124_2941.method1693(0), 15);
												} else if (!class124_102_.method1690(Class100.aClass124_1682, 33)) {
												    if (class124_102_.method1690(Class14_Sub2_Sub17.aClass124_4021, 33)) {
													i_104_ = 5;
													class124 = class124.method1696(Class14_Sub2_Sub17.aClass124_4021.method1693(0), 15);
												    } else if (Class125_Sub2.anInt3383 != 0) {
													if (!class124_102_.method1690(Class14_Sub8_Sub27.aClass124_4538, 33)) {
													    if (class124_102_.method1690(Class108.aClass124_1821, 33)) {
														i_104_ = 2;
														class124 = class124.method1696(Class108.aClass124_1821.method1693(0), 15);
													    } else if (!class124_102_.method1690(Class14_Sub11.aClass124_2943, 33)) {
														if (!class124_102_.method1690(Class100.aClass124_1683, 33)) {
														    if (class124_102_.method1690(Class14_Sub2_Sub17.aClass124_4019, arg1 + -46)) {
															class124 = class124.method1696(Class14_Sub2_Sub17.aClass124_4019.method1693(0), arg1 ^ 0x40);
															i_104_ = 5;
														    }
														} else {
														    i_104_ = 4;
														    class124 = class124.method1696(Class100.aClass124_1683.method1693(arg1 ^ 0x4f), arg1 + -64);
														}
													    } else {
														i_104_ = 3;
														class124 = class124.method1696(Class14_Sub11.aClass124_2943.method1693(0), 15);
													    }
													} else {
													    i_104_ = 1;
													    class124 = class124.method1696(Class14_Sub8_Sub27.aClass124_4538.method1693(0), 15);
													}
												    }
												} else {
												    class124 = class124.method1696(Class100.aClass124_1682.method1693(arg1 ^ 0x4f), 15);
												    i_104_ = 4;
												}
												Class55.aClass14_Sub10_Sub1_891.method843(0, 222);
												Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
												int i_105_ = Class55.aClass14_Sub10_Sub1_891.anInt2908;
												Class55.aClass14_Sub10_Sub1_891.method809(false, i_103_);
												Class55.aClass14_Sub10_Sub1_891.method809(false, i_104_);
												Class14_Sub11.method854(Class55.aClass14_Sub10_Sub1_891, -10502, class124);
												Class55.aClass14_Sub10_Sub1_891.method804(Class55.aClass14_Sub10_Sub1_891.anInt2908 + -i_105_, (byte) 32);
											    }
											} else if (-5010 == (i_0_ ^ 0xffffffff)) {
											    i_2_ -= 2;
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - -1];
											    Class124 class124_106_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
											    if ((Class152.anInt2439 ^ 0xffffffff) != -1 || -2 != (Class146.anInt2365 ^ 0xffffffff) && 1 != Class14_Sub2_Sub21.anInt4081) {
												Class55.aClass14_Sub10_Sub1_891.method843(0, 178);
												Class152.anInt2434++;
												Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
												int i_107_ = Class55.aClass14_Sub10_Sub1_891.anInt2908;
												Class55.aClass14_Sub10_Sub1_891.method817(class124_106_.method1692(0), 88);
												Class14_Sub11.method854(Class55.aClass14_Sub10_Sub1_891, -10502, class124);
												Class55.aClass14_Sub10_Sub1_891.method804(-i_107_ + Class55.aClass14_Sub10_Sub1_891.anInt2908, (byte) 32);
											    }
											} else if (-5011 == (i_0_ ^ 0xffffffff)) {
											    Class124 class124 = null;
											    int i_108_ = Class79.anIntArray1305[--i_1_];
											    if (i_108_ < 100)
												class124 = Class14_Sub8_Sub32.aClass124Array4626[i_108_];
											    if (null == class124)
												class124 = Class140.aClass124_2234;
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
											} else if (-5012 == (i_0_ ^ 0xffffffff)) {
											    int i_109_ = Class79.anIntArray1305[--i_1_];
											    Class124 class124 = null;
											    if (i_109_ < 100)
												class124 = Class124.aClass124Array2508[i_109_];
											    if (null == class124)
												class124 = Class140.aClass124_2234;
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
											} else if (-5013 == (i_0_ ^ 0xffffffff)) {
											    int i_110_ = Class79.anIntArray1305[--i_1_];
											    int i_111_ = -1;
											    if (i_110_ < 100)
												i_111_ = Class133.anIntArray2176[i_110_];
											    Class79.anIntArray1305[i_1_++] = i_111_;
											} else if (i_0_ == 5015) {
											    Class124 class124;
											    if (null == Class14_Sub3.aClass133_Sub1_Sub1_2748 || Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922 == null)
												class124 = Class14_Sub8_Sub9.aClass124_4241;
											    else
												class124 = Class14_Sub3.aClass133_Sub1_Sub1_2748.method1808(true);
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
											} else if (-5017 == (i_0_ ^ 0xffffffff))
											    Class79.anIntArray1305[i_1_++] = Class32.anInt566;
											else if (-5018 == (i_0_ ^ 0xffffffff))
											    Class79.anIntArray1305[i_1_++] = Class53.anInt874;
											else if (5050 == i_0_) {
											    int i_112_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub12.method541(i_112_, 20083).aClass124_3876;
											} else if ((i_0_ ^ 0xffffffff) == -5052) {
											    int i_113_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub2_Sub11 class14_sub2_sub11 = Class14_Sub8_Sub12.method541(i_113_, 20083);
											    if (null == class14_sub2_sub11.anIntArray3885)
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = class14_sub2_sub11.anIntArray3885.length;
											} else if (i_0_ == 5052) {
											    i_1_ -= 2;
											    int i_114_ = Class79.anIntArray1305[i_1_];
											    int i_115_ = Class79.anIntArray1305[i_1_ + 1];
											    Class14_Sub2_Sub11 class14_sub2_sub11 = Class14_Sub8_Sub12.method541(i_114_, 20083);
											    int i_116_ = class14_sub2_sub11.anIntArray3885[i_115_];
											    Class79.anIntArray1305[i_1_++] = i_116_;
											} else if (i_0_ == 5053) {
											    int i_117_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub2_Sub11 class14_sub2_sub11 = Class14_Sub8_Sub12.method541(i_117_, 20083);
											    if (class14_sub2_sub11.anIntArray3882 == null)
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = class14_sub2_sub11.anIntArray3882.length;
											} else if (5054 == i_0_) {
											    i_1_ -= 2;
											    int i_118_ = Class79.anIntArray1305[1 + i_1_];
											    int i_119_ = Class79.anIntArray1305[i_1_];
											    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub12.method541(i_119_, 20083).anIntArray3882[i_118_];
											} else if (i_0_ == 5055) {
											    int i_120_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub2_Sub3.method272(i_120_, (byte) 74).method438(125);
											} else if ((i_0_ ^ 0xffffffff) == -5057) {
											    int i_121_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub2_Sub21 class14_sub2_sub21 = Class14_Sub2_Sub3.method272(i_121_, (byte) 99);
											    if (class14_sub2_sub21.anIntArray4082 == null)
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = class14_sub2_sub21.anIntArray4082.length;
											} else if (5057 == i_0_) {
											    i_1_ -= 2;
											    int i_122_ = Class79.anIntArray1305[i_1_];
											    int i_123_ = Class79.anIntArray1305[1 + i_1_];
											    Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub3.method272(i_122_, (byte) 119).anIntArray4082[i_123_];
											} else if (i_0_ == 5058) {
											    Class22.aClass98_464 = new Class98();
											    Class22.aClass98_464.anInt1663 = Class79.anIntArray1305[--i_1_];
											    Class22.aClass98_464.aClass14_Sub2_Sub21_1662 = Class14_Sub2_Sub3.method272(Class22.aClass98_464.anInt1663, (byte) 67);
											    Class22.aClass98_464.anIntArray1658 = new int[Class22.aClass98_464.aClass14_Sub2_Sub21_1662.method446((byte) -124)];
											} else if (5059 == i_0_) {
											    Class14_Sub10_Sub1.anInt4892++;
											    Class55.aClass14_Sub10_Sub1_891.method843(0, 250);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
											    int i_124_ = Class55.aClass14_Sub10_Sub1_891.anInt2908;
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
											    Class55.aClass14_Sub10_Sub1_891.method833((byte) 114, Class22.aClass98_464.anInt1663);
											    Class22.aClass98_464.aClass14_Sub2_Sub21_1662.method443(Class55.aClass14_Sub10_Sub1_891, (byte) -103, Class22.aClass98_464.anIntArray1658);
											    Class55.aClass14_Sub10_Sub1_891.method804(Class55.aClass14_Sub10_Sub1_891.anInt2908 - i_124_, (byte) 32);
											} else if (i_0_ == 5060) {
											    Class110.anInt1851++;
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
											    Class55.aClass14_Sub10_Sub1_891.method843(0, 78);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
											    int i_125_ = Class55.aClass14_Sub10_Sub1_891.anInt2908;
											    Class55.aClass14_Sub10_Sub1_891.method817(class124.method1692(0), 127);
											    Class55.aClass14_Sub10_Sub1_891.method833((byte) 121, Class22.aClass98_464.anInt1663);
											    Class22.aClass98_464.aClass14_Sub2_Sub21_1662.method443(Class55.aClass14_Sub10_Sub1_891, (byte) -64, Class22.aClass98_464.anIntArray1658);
											    Class55.aClass14_Sub10_Sub1_891.method804(-i_125_ + Class55.aClass14_Sub10_Sub1_891.anInt2908, (byte) 32);
											} else if (5061 == i_0_) {
											    Class55.aClass14_Sub10_Sub1_891.method843(0, 250);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
											    int i_126_ = Class55.aClass14_Sub10_Sub1_891.anInt2908;
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 1);
											    Class14_Sub10_Sub1.anInt4892++;
											    Class55.aClass14_Sub10_Sub1_891.method833((byte) 100, Class22.aClass98_464.anInt1663);
											    Class22.aClass98_464.aClass14_Sub2_Sub21_1662.method443(Class55.aClass14_Sub10_Sub1_891, (byte) -70, Class22.aClass98_464.anIntArray1658);
											    Class55.aClass14_Sub10_Sub1_891.method804(Class55.aClass14_Sub10_Sub1_891.anInt2908 + -i_126_, (byte) 32);
											} else if (-5063 == (i_0_ ^ 0xffffffff)) {
											    i_1_ -= 2;
											    int i_127_ = Class79.anIntArray1305[i_1_ - -1];
											    int i_128_ = Class79.anIntArray1305[i_1_];
											    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub12.method541(i_128_, 20083).anIntArray3888[i_127_];
											} else if (i_0_ == 5063) {
											    i_1_ -= 2;
											    int i_129_ = Class79.anIntArray1305[i_1_ - -1];
											    int i_130_ = Class79.anIntArray1305[i_1_];
											    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub12.method541(i_130_, 20083).anIntArray3886[i_129_];
											} else if ((i_0_ ^ 0xffffffff) == -5065) {
											    i_1_ -= 2;
											    int i_131_ = Class79.anIntArray1305[i_1_];
											    int i_132_ = Class79.anIntArray1305[1 + i_1_];
											    if ((i_132_ ^ 0xffffffff) != 0)
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub12.method541(i_131_, 20083).method308((byte) 27, i_132_);
											    else
												Class79.anIntArray1305[i_1_++] = -1;
											} else if (5065 == i_0_) {
											    i_1_ -= 2;
											    int i_133_ = Class79.anIntArray1305[i_1_];
											    int i_134_ = Class79.anIntArray1305[1 + i_1_];
											    if (i_134_ == -1)
												Class79.anIntArray1305[i_1_++] = -1;
											    else
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub12.method541(i_133_, 20083).method311(i_134_, -128);
											} else if (5066 == i_0_) {
											    int i_135_ = Class79.anIntArray1305[--i_1_];
											    Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub3.method272(i_135_, (byte) 112).method446((byte) 75);
											} else if (i_0_ == 5067) {
											    i_1_ -= 2;
											    int i_136_ = Class79.anIntArray1305[i_1_];
											    int i_137_ = Class79.anIntArray1305[i_1_ - -1];
											    int i_138_ = Class14_Sub2_Sub3.method272(i_136_, (byte) 107).method433(-116, i_137_);
											    Class79.anIntArray1305[i_1_++] = i_138_;
											} else if (-5069 == (i_0_ ^ 0xffffffff)) {
											    i_1_ -= 2;
											    int i_139_ = Class79.anIntArray1305[i_1_];
											    int i_140_ = Class79.anIntArray1305[1 + i_1_];
											    Class22.aClass98_464.anIntArray1658[i_139_] = i_140_;
											} else if (i_0_ == 5069) {
											    i_1_ -= 2;
											    int i_141_ = Class79.anIntArray1305[i_1_];
											    int i_142_ = Class79.anIntArray1305[1 + i_1_];
											    Class22.aClass98_464.anIntArray1658[i_141_] = i_142_;
											} else {
											    if (i_0_ != 5070)
												break;
											    i_1_ -= 3;
											    int i_143_ = Class79.anIntArray1305[i_1_];
											    int i_144_ = Class79.anIntArray1305[1 + i_1_];
											    int i_145_ = Class79.anIntArray1305[i_1_ - -2];
											    Class14_Sub2_Sub21 class14_sub2_sub21 = Class14_Sub2_Sub3.method272(i_143_, (byte) 106);
											    if (-1 != (class14_sub2_sub21.method433(-51, i_144_) ^ 0xffffffff))
												throw new RuntimeException("bad command");
											    Class79.anIntArray1305[i_1_++] = class14_sub2_sub21.method435(i_144_, i_145_, (byte) -84);
											}
										    } else if ((i_0_ ^ 0xffffffff) > -5201) {
											if (i_0_ == 5100) {
											    if (!Class14_Sub8_Sub29.aBooleanArray4581[86])
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = 1;
											} else if ((i_0_ ^ 0xffffffff) == -5102) {
											    if (!Class14_Sub8_Sub29.aBooleanArray4581[82])
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = 1;
											} else {
											    if (5102 != i_0_)
												break;
											    if (!Class14_Sub8_Sub29.aBooleanArray4581[81])
												Class79.anIntArray1305[i_1_++] = 0;
											    else
												Class79.anIntArray1305[i_1_++] = 1;
											}
										    } else if (i_0_ < 5300) {
											if (i_0_ == 5200)
											    Class38.method1118(Class79.anIntArray1305[--i_1_], -1);
											else if ((i_0_ ^ 0xffffffff) == -5202)
											    Class79.anIntArray1305[i_1_++] = Class7_Sub2_Sub1.method128(1);
											else if ((i_0_ ^ 0xffffffff) == -5203)
											    Class14_Sub8_Sub28.method631(-118, Class79.anIntArray1305[--i_1_]);
											else if ((i_0_ ^ 0xffffffff) == -5204)
											    Class14_Sub8_Sub6.method506(25514, Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_]);
											else if (-5205 == (i_0_ ^ 0xffffffff))
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ + -1] = Class127.method1750(Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - 1], (byte) 43);
											else if (-5206 == (i_0_ ^ 0xffffffff))
											    Class22.method986(Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_], arg1 + -154);
											else if (i_0_ == 5206) {
											    int i_146_ = Class79.anIntArray1305[--i_1_];
											    Class14_Sub2_Sub5 class14_sub2_sub5 = Class150.method2020(i_146_ >> 782804302 & 0x3fff, false, 0x3fff & i_146_);
											    if (null == class14_sub2_sub5)
												Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
											    else
												Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class14_sub2_sub5.aClass124_3804;
											} else {
											    if ((i_0_ ^ 0xffffffff) != -5208)
												break;
											    Class14_Sub2_Sub5 class14_sub2_sub5 = Class14_Sub2_Sub20.method432(101, Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_]);
											    if (null == class14_sub2_sub5 || class14_sub2_sub5.aClass124_3807 == null)
												Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
											    else
												Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class14_sub2_sub5.aClass124_3807;
											}
										    } else if (-5401 < (i_0_ ^ 0xffffffff)) {
											if (i_0_ == 5300) {
											    i_1_ -= 2;
											    int i_147_ = Class79.anIntArray1305[i_1_];
											    int i_148_ = Class79.anIntArray1305[1 + i_1_];
											    if (Class14_Sub2_Sub15.aFrame3962 != null)
												Class14_Sub2_Sub20.method428(125);
											    Class133_Sub6.method1854(i_147_, i_148_, arg1 + -45);
											    Class79.anIntArray1305[i_1_++] = null != Class14_Sub2_Sub15.aFrame3962 ? 1 : 0;
											} else if ((i_0_ ^ 0xffffffff) == -5302) {
											    if (null != Class14_Sub2_Sub15.aFrame3962)
												Class14_Sub2_Sub20.method428(-13);
											} else if (-5303 == (i_0_ ^ 0xffffffff)) {
											    Class88[] class88s = Class21.method978(108);
											    Class79.anIntArray1305[i_1_++] = class88s.length;
											} else if (-5304 == (i_0_ ^ 0xffffffff)) {
											    int i_149_ = Class79.anIntArray1305[--i_1_];
											    Class88[] class88s = Class21.method978(arg1 + -153);
											    Class79.anIntArray1305[i_1_++] = class88s[i_149_].anInt1396;
											    Class79.anIntArray1305[i_1_++] = class88s[i_149_].anInt1397;
											} else if (i_0_ == 5305) {
											    int i_150_ = -1;
											    int i_151_ = Class54.anInt887;
											    int i_152_ = Class14_Sub2.anInt2725;
											    Class88[] class88s = Class21.method978(98);
											    for (int i_153_ = 0; (i_153_ ^ 0xffffffff) > (class88s.length ^ 0xffffffff); i_153_++) {
												Class88 class88 = class88s[i_153_];
												if (class88.anInt1396 == i_151_ && class88.anInt1397 == i_152_) {
												    i_150_ = i_153_;
												    break;
												}
											    }
											    Class79.anIntArray1305[i_1_++] = i_150_;
											} else {
											    if (5306 != i_0_)
												break;
											    Class79.anIntArray1305[i_1_++] = Class1.method73((byte) -58);
											}
										    } else if ((i_0_ ^ 0xffffffff) > -5501) {
											if (5400 == i_0_) {
											    i_2_ -= 2;
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - -1];
											    Class14_Sub8_Sub22.anInt4457++;
											    int i_154_ = Class79.anIntArray1305[--i_1_];
											    Class124 class124_155_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
											    Class55.aClass14_Sub10_Sub1_891.method843(arg1 ^ 0x4f, 161);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, 1 + (Class107.method1550(class124_155_, (byte) -107) + Class107.method1550(class124, (byte) -107)));
											    Class55.aClass14_Sub10_Sub1_891.method814(arg1 + 32689, class124_155_);
											    Class55.aClass14_Sub10_Sub1_891.method814(32768, class124);
											    Class55.aClass14_Sub10_Sub1_891.method809(false, i_154_);
											} else if ((i_0_ ^ 0xffffffff) == -5402) {
											    i_1_ -= 2;
											    Class33.aShortArray580[Class79.anIntArray1305[i_1_]] = (short) Class128.method1759(Class79.anIntArray1305[1 + i_1_], (byte) 48);
											    Class99_Sub2.method1505(true);
											    Class14_Sub23.method903((byte) 54);
											    Class14_Sub10_Sub1.method839(8);
											    Class9.method172((byte) 98);
											    Class14_Sub2_Sub8.method297((byte) -81);
											} else if ((i_0_ ^ 0xffffffff) == -5406) {
											    i_1_ -= 2;
											    int i_156_ = Class79.anIntArray1305[i_1_];
											    int i_157_ = Class79.anIntArray1305[1 + i_1_];
											    if (-1 >= (i_156_ ^ 0xffffffff) && -3 < (i_156_ ^ 0xffffffff))
												Class89.anIntArrayArrayArray1405[i_156_] = new int[i_157_ << 1919611105][4];
											} else if (5406 == i_0_) {
											    i_1_ -= 7;
											    int i_158_ = Class79.anIntArray1305[i_1_ + 1] << -112460511;
											    int i_159_ = Class79.anIntArray1305[i_1_ + 2];
											    int i_160_ = Class79.anIntArray1305[i_1_];
											    int i_161_ = Class79.anIntArray1305[4 + i_1_];
											    int i_162_ = Class79.anIntArray1305[5 + i_1_];
											    int i_163_ = Class79.anIntArray1305[i_1_ + 6];
											    int i_164_ = Class79.anIntArray1305[3 + i_1_];
											    if ((i_160_ ^ 0xffffffff) <= -1 && i_160_ < 2 && Class89.anIntArrayArrayArray1405[i_160_] != null && (i_158_ ^ 0xffffffff) <= -1 && i_158_ < Class89.anIntArrayArrayArray1405[i_160_].length) {
												Class89.anIntArrayArrayArray1405[i_160_][i_158_] = new int[] { Class14_Sub8_Sub26.method617(i_159_ >> -1970649042, 16383) * 128, i_164_, Class14_Sub8_Sub26.method617(16383, i_159_) * 128, i_163_ };
												Class89.anIntArrayArrayArray1405[i_160_][i_158_ - -1] = new int[] { 128 * (Class14_Sub8_Sub26.method617(i_161_, 268430875) >> -245294034), i_162_, Class14_Sub8_Sub26.method617(i_161_, 16383) * 128 };
											    }
											} else if (i_0_ == 5407) {
											    int i_165_ = Class89.anIntArrayArrayArray1405[Class79.anIntArray1305[--i_1_]].length >> -493878111;
											    Class79.anIntArray1305[i_1_++] = i_165_;
											} else if (-5409 == (i_0_ ^ 0xffffffff))
											    Class79.anIntArray1305[i_1_++] = 1;
											else if (-5410 == (i_0_ ^ 0xffffffff))
											    Class32.method1081((byte) 96);
											else if (-5412 == (i_0_ ^ 0xffffffff)) {
											    if (Class14_Sub2_Sub15.aFrame3962 != null)
												Class14_Sub2_Sub20.method428(121);
											    if (Class14_Sub14.aFrame2986 == null)
												Class52.method1211(Class86.method1419((byte) 125), false, 87);
											    else
												System.exit(0);
											} else if ((i_0_ ^ 0xffffffff) == -5420) {
											    Class124 class124 = Class140.aClass124_2234;
											    if (null != RuntimeException_Sub1.aClass31_2458) {
												class124 = Class107.method1552(RuntimeException_Sub1.aClass31_2458.anInt526, 27968);
												try {
												    if (RuntimeException_Sub1.aClass31_2458.anObject530 != null) {
													byte[] is_166_ = ((String) RuntimeException_Sub1.aClass31_2458.anObject530).getBytes("ISO-8859-1");
													class124 = Class14.method231((byte) 114, is_166_.length, is_166_, 0);
												    }
												} catch (UnsupportedEncodingException unsupportedencodingexception) {
												    /* empty */
												}
											    }
											    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
											} else if (5420 == i_0_)
											    Class79.anIntArray1305[i_1_++] = (Class14_Sub2_Sub3.anInt3771 ^ 0xffffffff) == -3 ? 1 : 0;
											else if ((i_0_ ^ 0xffffffff) == -5422) {
											    if (Class14_Sub2_Sub15.aFrame3962 != null)
												Class14_Sub2_Sub20.method428(120);
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
											    boolean bool_167_ = Class79.anIntArray1305[--i_1_] == 1;
											    Class52.method1211(Class14_Sub8_Sub7.method515(new Class124[] { Class86.method1419((byte) 126), class124 }, (byte) -59), bool_167_, arg1 ^ 0x67);
											} else {
											    if (-5423 != (i_0_ ^ 0xffffffff))
												break;
											    i_2_ -= 2;
											    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
											    Class124 class124_168_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - -1];
											    int i_169_ = Class79.anIntArray1305[--i_1_];
											    if (class124.method1693(0) > 0) {
												if (Class7_Sub2.aClass124Array2674 == null)
												    Class7_Sub2.aClass124Array2674 = new Class124[Class115.anIntArray1916[Class14_Sub2_Sub1.anInt3749]];
												Class7_Sub2.aClass124Array2674[i_169_] = class124;
											    }
											    if (class124_168_.method1693(arg1 ^ 0x4f) > 0) {
												if (Class52.aClass124Array859 == null)
												    Class52.aClass124Array859 = new Class124[Class115.anIntArray1916[Class14_Sub2_Sub1.anInt3749]];
												Class52.aClass124Array859[i_169_] = class124_168_;
											    }
											}
										    } else if ((i_0_ ^ 0xffffffff) <= -5601) {
											if (i_0_ < 5700) {
											    if ((i_0_ ^ 0xffffffff) == -5601) {
												i_2_ -= 2;
												Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[1 + i_2_];
												Class124 class124_170_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
												int i_171_ = Class79.anIntArray1305[--i_1_];
												if (Class14_Sub8_Sub16.anInt4356 == 10 && (Class142.anInt2315 ^ 0xffffffff) == -1 && (Class56.anInt918 ^ 0xffffffff) == -1)
												    Class14_Sub2_Sub18.method380(i_171_, class124, class124_170_, true);
											    } else if (i_0_ == 5601)
												Class59.method1263((byte) -66);
											    else if (i_0_ == 5602) {
												if ((Class142.anInt2315 ^ 0xffffffff) == -1)
												    Class14_Sub8_Sub26.anInt4525 = -2;
											    } else if (i_0_ == 5603) {
												i_1_ -= 4;
												if (10 == Class14_Sub8_Sub16.anInt4356 && 0 == Class142.anInt2315 && Class56.anInt918 == 0)
												    Class14_Sub8_Sub2.method490(Class79.anIntArray1305[i_1_ - -1], Class79.anIntArray1305[i_1_ - -2], Class79.anIntArray1305[3 + i_1_], Class79.anIntArray1305[i_1_], (byte) -28);
											    } else if (-5605 == (i_0_ ^ 0xffffffff)) {
												i_2_--;
												if (-11 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) && (Class142.anInt2315 ^ 0xffffffff) == -1 && 0 == Class56.anInt918)
												    Class14_Sub2_Sub11.method316(Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_].method1692(arg1 + -79), arg1 + 24888);
											    } else if (i_0_ == 5605) {
												i_2_ -= 2;
												i_1_ -= 4;
												if (-11 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) && -1 == (Class142.anInt2315 ^ 0xffffffff) && Class56.anInt918 == 0)
												    Class5.method112(Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_].method1692(0), (byte) 120, Class79.anIntArray1305[3 + i_1_], Class79.anIntArray1305[1 + i_1_], Class79.anIntArray1305[i_1_], Class14_Sub8_Sub39_Sub1.aClass124Array5101[1 + i_2_], Class79.anIntArray1305[2 + i_1_]);
											    } else if (i_0_ == 5606) {
												if ((Class56.anInt918 ^ 0xffffffff) == -1)
												    Class14_Sub2.anInt2734 = -2;
											    } else if (-5608 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub26.anInt4525;
											    else if (5608 == i_0_)
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub30.anInt4598;
											    else if (-5610 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class14_Sub2.anInt2734;
											    else {
												if (i_0_ != 5610)
												    break;
												for (int i_172_ = 0; -6 < (i_172_ ^ 0xffffffff); i_172_++)
												    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = (Class14_Sub8_Sub27.aClass124Array4549.length ^ 0xffffffff) < (i_172_ ^ 0xffffffff) ? Class14_Sub8_Sub27.aClass124Array4549[i_172_] : Class140.aClass124_2234;
												Class14_Sub8_Sub27.aClass124Array4549 = null;
											    }
											} else if (-6101 >= (i_0_ ^ 0xffffffff)) {
											    if ((i_0_ ^ 0xffffffff) <= -6201) {
												if (6300 > i_0_) {
												    if (6200 == i_0_) {
													i_1_ -= 2;
													Class19.aShort2540 = (short) Class79.anIntArray1305[i_1_];
													if (0 >= Class19.aShort2540)
													    Class19.aShort2540 = (short) 256;
													Class14_Sub8_Sub28.aShort4568 = (short) Class79.anIntArray1305[i_1_ + 1];
													if ((Class14_Sub8_Sub28.aShort4568 ^ 0xffffffff) >= -1)
													    Class14_Sub8_Sub28.aShort4568 = (short) 205;
												    } else if (i_0_ == 6201) {
													i_1_ -= 2;
													Class125_Sub1.aShort3372 = (short) Class79.anIntArray1305[i_1_];
													if (Class125_Sub1.aShort3372 <= 0)
													    Class125_Sub1.aShort3372 = (short) 256;
													Class28.aShort511 = (short) Class79.anIntArray1305[i_1_ + 1];
													if (-1 <= (Class28.aShort511 ^ 0xffffffff))
													    Class28.aShort511 = (short) 320;
												    } else if ((i_0_ ^ 0xffffffff) == -6203) {
													i_1_ -= 4;
													Class14_Sub2_Sub8.aShort3839 = (short) Class79.anIntArray1305[i_1_];
													if ((Class14_Sub2_Sub8.aShort3839 ^ 0xffffffff) >= -1)
													    Class14_Sub2_Sub8.aShort3839 = (short) 1;
													Applet_Sub1.aShort22 = (short) Class79.anIntArray1305[1 + i_1_];
													if ((Applet_Sub1.aShort22 ^ 0xffffffff) >= -1)
													    Applet_Sub1.aShort22 = (short) 32767;
													else if (Applet_Sub1.aShort22 < Class14_Sub2_Sub8.aShort3839)
													    Applet_Sub1.aShort22 = Class14_Sub2_Sub8.aShort3839;
													Class125.aShort2076 = (short) Class79.anIntArray1305[2 + i_1_];
													if (-1 <= (Class125.aShort2076 ^ 0xffffffff))
													    Class125.aShort2076 = (short) 1;
													Class96.aShort1633 = (short) Class79.anIntArray1305[3 + i_1_];
													if (Class96.aShort1633 > 0) {
													    if ((Class125.aShort2076 ^ 0xffffffff) < (Class96.aShort1633 ^ 0xffffffff))
														Class96.aShort1633 = Class125.aShort2076;
													} else
													    Class96.aShort1633 = (short) 32767;
												    } else if (-6204 == (i_0_ ^ 0xffffffff)) {
													Class35.method1092(Class127.aClass94_2114.anInt1545, false, Class127.aClass94_2114.anInt1518, 0, arg1 ^ 0x64, 0);
													Class79.anIntArray1305[i_1_++] = Class14_Sub2_Sub15.anInt3952;
													Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub3.anInt4135;
												    } else if (-6205 == (i_0_ ^ 0xffffffff)) {
													Class79.anIntArray1305[i_1_++] = Class125_Sub1.aShort3372;
													Class79.anIntArray1305[i_1_++] = Class28.aShort511;
												    } else {
													if (-6206 != (i_0_ ^ 0xffffffff))
													    break;
													Class79.anIntArray1305[i_1_++] = Class19.aShort2540;
													Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub28.aShort4568;
												    }
												} else if (-6401 >= (i_0_ ^ 0xffffffff)) {
												    if (i_0_ >= 6500)
													break;
												    if ((i_0_ ^ 0xffffffff) == -6401)
													Class79.anIntArray1305[i_1_++] = !Class14_Sub10.aBoolean2870 ? 0 : 1;
												    else if (-6402 == (i_0_ ^ 0xffffffff)) {
													Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
													int i_173_ = Class79.anIntArray1305[--i_1_];
													String string;
													try {
													    string = new String(class124.method1681(arg1 + -204), "ISO-8859-1");
													} catch (UnsupportedEncodingException unsupportedencodingexception) {
													    string = new String(class124.method1681(arg1 + -193));
													}
													if (Class14_Sub10.aBoolean2870) {
													    if (!browsercontrol.iscreated())
														browsercontrol.create("about:blank");
													    if (browsercontrol.iscreated()) {
														browsercontrol.navigate(string);
														Class14_Sub13.anInt2964 = i_173_;
														Class14_Sub8_Sub30.method643(0, (byte) -116);
													    }
													}
												    } else if (6402 == i_0_) {
													if (browsercontrol.iscreated()) {
													    browsercontrol.navigate("about:blank");
													    browsercontrol.hide();
													    Class14_Sub13.anInt2964 = 0;
													    Class14_Sub8_Sub30.method643(0, (byte) -123);
													}
												    } else if ((i_0_ ^ 0xffffffff) == -6404)
													Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class5.aClass124_138;
												    else if (i_0_ == 6404)
													Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class42.aClass124_700;
												    else if (i_0_ == 6405)
													Class79.anIntArray1305[i_1_++] = Class99.method1499(0) ? 1 : 0;
												    else {
													if (-6407 != (i_0_ ^ 0xffffffff))
													    break;
													Class79.anIntArray1305[i_1_++] = !Class14_Sub8_Sub28.method625(-128) ? 0 : 1;
												    }
												} else if (6300 == i_0_)
												    Class79.anIntArray1305[i_1_++] = (int) (Class84.method1413((byte) -95) / 60000L);
												else if (i_0_ == 6301)
												    Class79.anIntArray1305[i_1_++] = -11745 + (int) (Class84.method1413((byte) 110) / 86400000L);
												else if (i_0_ == 6302) {
												    i_1_ -= 3;
												    int i_174_ = Class79.anIntArray1305[i_1_ - -1];
												    int i_175_ = Class79.anIntArray1305[i_1_ - -2];
												    int i_176_ = Class79.anIntArray1305[i_1_];
												    Class153.aCalendar2449.clear();
												    Class153.aCalendar2449.set(11, 12);
												    Class153.aCalendar2449.set(i_175_, i_174_, i_176_);
												    Class79.anIntArray1305[i_1_++] = (int) (Class153.aCalendar2449.getTime().getTime() / 86400000L) - 11745;
												} else if (-6304 == (i_0_ ^ 0xffffffff)) {
												    Class153.aCalendar2449.clear();
												    Class153.aCalendar2449.setTime(new Date(Class84.method1413((byte) 113)));
												    Class79.anIntArray1305[i_1_++] = Class153.aCalendar2449.get(1);
												} else {
												    if (-6305 != (i_0_ ^ 0xffffffff))
													break;
												    boolean bool_177_ = true;
												    int i_178_ = Class79.anIntArray1305[--i_1_];
												    if (i_178_ < 0)
													bool_177_ = -1 == ((1 + i_178_) % 4 ^ 0xffffffff);
												    else if (i_178_ >= 1582) {
													if (i_178_ % 4 != 0)
													    bool_177_ = false;
													else if (i_178_ % 100 != 0)
													    bool_177_ = true;
													else if (0 != i_178_ % 400)
													    bool_177_ = false;
												    } else
													bool_177_ = 0 == i_178_ % 4;
												    Class79.anIntArray1305[i_1_++] = bool_177_ ? 1 : 0;
												}
											    } else if (-6102 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub6.anInt4190;
											    else if (i_0_ == 6102)
												Class79.anIntArray1305[i_1_++] = Class128.method1755(Canvas_Sub2.method69(arg1, 130068680)) ? 1 : 0;
											    else if ((i_0_ ^ 0xffffffff) == -6104)
												Class79.anIntArray1305[i_1_++] = Class139.aBoolean2233 ? 1 : 0;
											    else if (-6106 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class148.aBoolean2372 ? 1 : 0;
											    else if (-6107 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class125_Sub3.aBoolean3397 ? 1 : 0;
											    else if (-6108 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = !Class135.aBoolean2190 ? 0 : 1;
											    else if (6108 == i_0_)
												Class79.anIntArray1305[i_1_++] = Class33.aBoolean584 ? 1 : 0;
											    else if (-6110 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class28.aBoolean516 ? 1 : 0;
											    else if (i_0_ == 6110)
												Class79.anIntArray1305[i_1_++] = !Class14_Sub8_Sub25.aBoolean4518 ? 0 : 1;
											    else if ((i_0_ ^ 0xffffffff) == -6112)
												Class79.anIntArray1305[i_1_++] = Class89.anInt1413;
											    else if (i_0_ == 6112)
												Class79.anIntArray1305[i_1_++] = !Class7_Sub1.aBoolean2661 ? 0 : 1;
											    else if (-6115 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = !Class15.aBoolean374 ? 0 : 1;
											    else if (-6116 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub20.aBoolean4420 ? 1 : 0;
											    else if (-6117 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class135.anInt2189;
											    else if (i_0_ == 6117)
												Class79.anIntArray1305[i_1_++] = !Class14_Sub8_Sub26.aBoolean4528 ? 0 : 1;
											    else if (i_0_ == 6118)
												Class79.anIntArray1305[i_1_++] = Class14_Sub29.anInt3266;
											    else if (-6120 == (i_0_ ^ 0xffffffff))
												Class79.anIntArray1305[i_1_++] = Class14_Sub23.anInt3135;
											    else if (6120 == i_0_)
												Class79.anIntArray1305[i_1_++] = Class100.anInt1691;
											    else if (6121 == i_0_)
												Class79.anIntArray1305[i_1_++] = Class121.aBoolean2050 ? 1 : 0;
											    else {
												if (6122 != i_0_)
												    break;
												Class79.anIntArray1305[i_1_++] = !Class52.aBoolean845 ? 0 : 1;
											    }
											} else if (i_0_ == 6001) {
											    int i_179_ = Class79.anIntArray1305[--i_1_];
											    if (i_179_ < 1)
												i_179_ = 1;
											    if (-5 > (i_179_ ^ 0xffffffff))
												i_179_ = 4;
											    Class14_Sub8_Sub6.anInt4190 = i_179_;
											    if (!Class7_Sub1.aBoolean2661) {
												if (1 == Class14_Sub8_Sub6.anInt4190)
												    Class3.method103(0.9F);
												if ((Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff) == -3)
												    Class3.method103(0.8F);
												if (-4 == (Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff))
												    Class3.method103(0.7F);
												if (Class14_Sub8_Sub6.anInt4190 == 4)
												    Class3.method103(0.6F);
											    }
											    Class14_Sub13.method858(-1);
											    if (!Class7_Sub1.aBoolean2661)
												Class148.method1996((byte) 74);
											    Class14_Sub23.method903((byte) 54);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (i_0_ == 6002) {
											    Class14_Sub8_Sub3.method495((byte) -47, 1 == Class79.anIntArray1305[--i_1_]);
											    Class60.method1264(111);
											    Class148.method1996((byte) 91);
											    Class14_Sub8_Sub23.method602(-1);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if ((i_0_ ^ 0xffffffff) == -6004) {
											    Class139.aBoolean2233 = Class79.anIntArray1305[--i_1_] == 1;
											    Class14_Sub8_Sub23.method602(-1);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6006 == (i_0_ ^ 0xffffffff)) {
											    Class148.aBoolean2372 = Class79.anIntArray1305[--i_1_] == 1;
											    Class148.method1996((byte) 83);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (i_0_ == 6006) {
											    Class125_Sub3.aBoolean3397 = Class79.anIntArray1305[--i_1_] == 1;
											    ((Class134) Class3.anInterface3_117).method1924(!Class125_Sub3.aBoolean3397, arg1 + -112);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (i_0_ == 6007) {
											    Class135.aBoolean2190 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6009 == (i_0_ ^ 0xffffffff)) {
											    Class33.aBoolean584 = (Class79.anIntArray1305[--i_1_] ^ 0xffffffff) == -2;
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6010 == (i_0_ ^ 0xffffffff)) {
											    Class28.aBoolean516 = Class79.anIntArray1305[--i_1_] == 1;
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6011 == (i_0_ ^ 0xffffffff)) {
											    Class14_Sub8_Sub25.aBoolean4518 = (Class79.anIntArray1305[--i_1_] ^ 0xffffffff) == -2;
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if ((i_0_ ^ 0xffffffff) == -6012) {
											    int i_180_ = Class79.anIntArray1305[--i_1_];
											    if ((i_180_ ^ 0xffffffff) > -1 || (i_180_ ^ 0xffffffff) < -3)
												i_180_ = 0;
											    Class89.anInt1413 = i_180_;
											    Class14_Sub8_Sub22.method595(arg1 ^ 0xf57c801, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6013 == (i_0_ ^ 0xffffffff)) {
											    Class132.method1778(0, (byte) -96, 0);
											    Class7_Sub1.aBoolean2661 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    if (!Class7_Sub1.aBoolean2661) {
												if (1 == Class14_Sub8_Sub6.anInt4190)
												    Class3.method103(0.9F);
												if (Class14_Sub8_Sub6.anInt4190 == 2)
												    Class3.method103(0.8F);
												if (Class14_Sub8_Sub6.anInt4190 == 3)
												    Class3.method103(0.7F);
												if (-5 == (Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff))
												    Class3.method103(0.6F);
											    } else
												Class3.method103(0.7F);
											    Class148.method1996((byte) 64);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6015 == (i_0_ ^ 0xffffffff)) {
											    Class15.aBoolean374 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    Class148.method1996((byte) 111);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (i_0_ == 6015) {
											    Class14_Sub8_Sub20.aBoolean4420 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    Class14_Sub13.method858(-1);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (6016 == i_0_) {
											    int i_181_ = Class79.anIntArray1305[--i_1_];
											    if (-1 < (i_181_ ^ 0xffffffff) || -3 > (i_181_ ^ 0xffffffff))
												i_181_ = 0;
											    Class54.aBoolean877 = true;
											    Class135.anInt2189 = i_181_;
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if ((i_0_ ^ 0xffffffff) == -6018) {
											    Class14_Sub8_Sub26.aBoolean4528 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    Class14_Sub2_Sub17.method375(126);
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (i_0_ == 6018) {
											    int i_182_ = Class79.anIntArray1305[--i_1_];
											    if (0 > i_182_)
												i_182_ = 0;
											    if (-128 > (i_182_ ^ 0xffffffff))
												i_182_ = 127;
											    Class14_Sub29.anInt3266 = i_182_;
											    Class14_Sub8_Sub22.method595(arg1 ^ 0xf57c801, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if ((i_0_ ^ 0xffffffff) == -6020) {
											    int i_183_ = Class79.anIntArray1305[--i_1_];
											    if (i_183_ < 0)
												i_183_ = 0;
											    if (-256 > (i_183_ ^ 0xffffffff))
												i_183_ = 255;
											    if ((Class14_Sub23.anInt3135 ^ 0xffffffff) != (i_183_ ^ 0xffffffff)) {
												if (Class14_Sub23.anInt3135 != 0 || Class14_Sub8.anInt2856 == -1) {
												    if (i_183_ == 0) {
													Class14_Sub8_Sub17.method569(arg1 + -183);
													Class14_Sub7.aBoolean2827 = false;
												    } else
													Class47.method1188(i_183_, 0);
												} else {
												    Class33.method1087(1936, 0, false, Class14_Sub8.anInt2856, Class125_Sub2.aClass9_Sub1_3374, i_183_);
												    Class14_Sub7.aBoolean2827 = false;
												}
												Class14_Sub23.anInt3135 = i_183_;
											    }
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if ((i_0_ ^ 0xffffffff) == -6021) {
											    int i_184_ = Class79.anIntArray1305[--i_1_];
											    if (-1 < (i_184_ ^ 0xffffffff))
												i_184_ = 0;
											    if (-128 > (i_184_ ^ 0xffffffff))
												i_184_ = 127;
											    Class100.anInt1691 = i_184_;
											    Class14_Sub8_Sub22.method595(arg1 ^ 0xf57c801, Class14_Sub8_Sub34.aClass43_4647);
											    Class9.aBoolean214 = false;
											} else if (-6022 == (i_0_ ^ 0xffffffff)) {
											    Class1.aBoolean74 = -2 == (Class79.anIntArray1305[--i_1_] ^ 0xffffffff);
											    Class14_Sub8_Sub23.method602(-1);
											} else {
											    if (-6023 != (i_0_ ^ 0xffffffff))
												break;
											    Class52.aBoolean845 = Class79.anIntArray1305[--i_1_] == 1;
											    Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
											    Class14_Sub8_Sub30.method643(0, (byte) -126);
											}
										    } else if ((i_0_ ^ 0xffffffff) == -5501) {
											i_1_ -= 4;
											int i_185_ = Class79.anIntArray1305[i_1_];
											int i_186_ = Class79.anIntArray1305[i_1_ + 1];
											int i_187_ = Class79.anIntArray1305[i_1_ - -2];
											int i_188_ = Class79.anIntArray1305[i_1_ - -3];
											Class7_Sub3_Sub1.method136(false, i_186_, i_188_, -Class58.anInt947 + (i_185_ & 0x3fff), -86, (i_185_ >> -1359926258 & 0x3fff) - Class133_Sub6.anInt3676, i_187_);
										    } else if (i_0_ == 5501) {
											i_1_ -= 4;
											int i_189_ = Class79.anIntArray1305[i_1_ + 3];
											int i_190_ = Class79.anIntArray1305[i_1_];
											int i_191_ = Class79.anIntArray1305[i_1_ + 1];
											int i_192_ = Class79.anIntArray1305[i_1_ - -2];
											Class125.method1725(i_191_, (i_190_ >> 613973518 & 0x3fff) + -Class133_Sub6.anInt3676, i_192_, i_189_, (i_190_ & 0x3fff) - Class58.anInt947, (byte) 89);
										    } else if (i_0_ == 5502) {
											i_1_ -= 6;
											int i_193_ = Class79.anIntArray1305[i_1_];
											if (i_193_ >= 2)
											    throw new RuntimeException();
											Class45.anInt751 = i_193_;
											int i_194_ = Class79.anIntArray1305[i_1_ + 1];
											if ((i_194_ + 1 ^ 0xffffffff) <= (Class89.anIntArrayArrayArray1405[Class45.anInt751].length >> -2035840543 ^ 0xffffffff))
											    throw new RuntimeException();
											Class19.anInt2552 = i_194_;
											Class102.anInt1717 = 0;
											Class14_Sub21.anInt3102 = Class79.anIntArray1305[i_1_ + 2];
											Class36.anInt612 = Class79.anIntArray1305[3 + i_1_];
											int i_195_ = Class79.anIntArray1305[4 + i_1_];
											if (2 <= i_195_)
											    throw new RuntimeException();
											Class14_Sub8_Sub35.anInt4687 = i_195_;
											int i_196_ = Class79.anIntArray1305[i_1_ - -5];
											if ((Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687].length >> 1806757153 ^ 0xffffffff) >= (i_196_ - -1 ^ 0xffffffff))
											    throw new RuntimeException();
											Class79.anInt1240 = i_196_;
											Class89.anInt1415 = 3;
										    } else if (5503 == i_0_)
											Class48.method1191((byte) 126);
										    else if (i_0_ == 5504) {
											i_1_ -= 2;
											Class2.anInt102 = Class79.anIntArray1305[i_1_];
											Class14_Sub8_Sub19.anInt4408 = Class79.anIntArray1305[1 + i_1_];
											Class33.method1084((byte) 113);
										    } else if (5505 == i_0_)
											Class79.anIntArray1305[i_1_++] = Class2.anInt102;
										    else {
											if (-5507 != (i_0_ ^ 0xffffffff))
											    break;
											Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub19.anInt4408;
										    }
										} else {
										    if (4300 != i_0_)
											break;
										    i_1_ -= 2;
										    int i_197_ = Class79.anIntArray1305[i_1_ + 1];
										    int i_198_ = Class79.anIntArray1305[i_1_];
										    Class14_Sub2_Sub2 class14_sub2_sub2 = Class17.method958((byte) 6, i_197_);
										    if (class14_sub2_sub2.method261((byte) 42))
											Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class126.method1744(i_198_, 170).method215(-103, class14_sub2_sub2.aClass124_3760, i_197_);
										    else
											Class79.anIntArray1305[i_1_++] = Class126.method1744(i_198_, arg1 + 91).method214(arg1 + 40, class14_sub2_sub2.anInt3766, i_197_);
										}
									    } else if ((i_0_ ^ 0xffffffff) == -4201) {
										int i_199_ = Class79.anIntArray1305[--i_1_];
										Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub24.method605(69, i_199_).aClass124_2296;
									    } else if (i_0_ == 4201) {
										i_1_ -= 2;
										int i_200_ = Class79.anIntArray1305[i_1_];
										int i_201_ = Class79.anIntArray1305[1 + i_1_];
										Class142 class142 = Class14_Sub8_Sub24.method605(70, i_200_);
										if ((i_201_ ^ 0xffffffff) <= -2 && (i_201_ ^ 0xffffffff) >= -6 && class142.aClass124Array2263[-1 + i_201_] != null)
										    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class142.aClass124Array2263[i_201_ - 1];
										else
										    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									    } else if ((i_0_ ^ 0xffffffff) == -4203) {
										i_1_ -= 2;
										int i_202_ = Class79.anIntArray1305[i_1_];
										int i_203_ = Class79.anIntArray1305[i_1_ + 1];
										Class142 class142 = Class14_Sub8_Sub24.method605(arg1 + -19, i_202_);
										if (i_203_ >= 1 && -6 <= (i_203_ ^ 0xffffffff) && null != class142.aClass124Array2304[-1 + i_203_])
										    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class142.aClass124Array2304[i_203_ + -1];
										else
										    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class140.aClass124_2234;
									    } else if ((i_0_ ^ 0xffffffff) == -4204) {
										int i_204_ = Class79.anIntArray1305[--i_1_];
										Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub24.method605(Canvas_Sub2.method69(arg1, 21), i_204_).anInt2288;
									    } else if (4204 == i_0_) {
										int i_205_ = Class79.anIntArray1305[--i_1_];
										Class79.anIntArray1305[i_1_++] = -2 != (Class14_Sub8_Sub24.method605(96, i_205_).anInt2309 ^ 0xffffffff) ? 0 : 1;
									    } else if (-4206 == (i_0_ ^ 0xffffffff)) {
										int i_206_ = Class79.anIntArray1305[--i_1_];
										Class142 class142 = Class14_Sub8_Sub24.method605(73, i_206_);
										if (-1 == class142.anInt2316 && class142.anInt2268 >= 0)
										    Class79.anIntArray1305[i_1_++] = class142.anInt2268;
										else
										    Class79.anIntArray1305[i_1_++] = i_206_;
									    } else if ((i_0_ ^ 0xffffffff) == -4207) {
										int i_207_ = Class79.anIntArray1305[--i_1_];
										Class142 class142 = Class14_Sub8_Sub24.method605(77, i_207_);
										if ((class142.anInt2316 ^ 0xffffffff) > -1 || (class142.anInt2268 ^ 0xffffffff) > -1)
										    Class79.anIntArray1305[i_1_++] = i_207_;
										else
										    Class79.anIntArray1305[i_1_++] = class142.anInt2268;
									    } else if ((i_0_ ^ 0xffffffff) == -4208) {
										int i_208_ = Class79.anIntArray1305[--i_1_];
										Class79.anIntArray1305[i_1_++] = !Class14_Sub8_Sub24.method605(90, i_208_).aBoolean2306 ? 0 : 1;
									    } else if (4208 == i_0_) {
										i_1_ -= 2;
										int i_209_ = Class79.anIntArray1305[i_1_ - -1];
										int i_210_ = Class79.anIntArray1305[i_1_];
										Class14_Sub2_Sub2 class14_sub2_sub2 = Class17.method958((byte) -123, i_209_);
										if (!class14_sub2_sub2.method261((byte) 55))
										    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub24.method605(114, i_210_).method1977(class14_sub2_sub2.anInt3766, i_209_, arg1 + 46);
										else
										    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub24.method605(85, i_210_).method1979(i_209_, class14_sub2_sub2.aClass124_3760, (byte) 62);
									    } else if (-4211 == (i_0_ ^ 0xffffffff)) {
										Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
										int i_211_ = Class79.anIntArray1305[--i_1_];
										Class14_Sub8_Sub16.method563(-2 == (i_211_ ^ 0xffffffff), class124, (byte) -116);
										Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub18.anInt4394;
									    } else if ((i_0_ ^ 0xffffffff) == -4212) {
										if (Class133_Sub6.aShortArray3675 == null || (Class14_Sub8_Sub18.anInt4394 ^ 0xffffffff) >= (Class12.anInt294 ^ 0xffffffff))
										    Class79.anIntArray1305[i_1_++] = -1;
										else
										    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub26.method617(Class133_Sub6.aShortArray3675[Class12.anInt294++], 65535);
									    } else {
										if (i_0_ != 4212)
										    break;
										Class12.anInt294 = 0;
									    }
									} else if (4100 == i_0_) {
									    int i_212_ = Class79.anIntArray1305[--i_1_];
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub7.method515(new Class124[] { class124, Class83.method1407(Canvas_Sub2.method69(arg1, 32), i_212_) }, (byte) -115);
									} else if ((i_0_ ^ 0xffffffff) == -4102) {
									    i_2_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
									    Class124 class124_213_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ + 1];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub7.method515(new Class124[] { class124, class124_213_ }, (byte) -23);
									} else if (-4103 == (i_0_ ^ 0xffffffff)) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    int i_214_ = Class79.anIntArray1305[--i_1_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub7.method515(new Class124[] { class124, Class122.method1658((byte) -54, true, i_214_) }, (byte) -99);
									} else if (4103 == i_0_) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124.method1716((byte) 63);
									} else if ((i_0_ ^ 0xffffffff) == -4105) {
									    int i_215_ = Class79.anIntArray1305[--i_1_];
									    long l = 86400000L * (11745L + (long) i_215_);
									    Class153.aCalendar2449.setTime(new Date(l));
									    int i_216_ = Class153.aCalendar2449.get(5);
									    int i_217_ = Class153.aCalendar2449.get(2);
									    int i_218_ = Class153.aCalendar2449.get(1);
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub8_Sub7.method515(new Class124[] { Class83.method1407(32, i_216_), Class110.aClass124_1850, Class14_Sub17.aClass124Array3025[i_217_], Class110.aClass124_1850, Class83.method1407(33, i_218_) }, (byte) -116);
									} else if (-4106 == (i_0_ ^ 0xffffffff)) {
									    i_2_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
									    Class124 class124_219_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - -1];
									    if (null == Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941 || !Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941.aBoolean1711)
										Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
									    else
										Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124_219_;
									} else if (i_0_ == 4106) {
									    int i_220_ = Class79.anIntArray1305[--i_1_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class83.method1407(105, i_220_);
									} else if (4107 == i_0_) {
									    i_2_ -= 2;
									    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_].method1674(Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_ - -1], (byte) 92);
									} else if (i_0_ == 4108) {
									    i_1_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    int i_221_ = Class79.anIntArray1305[i_1_];
									    int i_222_ = Class79.anIntArray1305[1 + i_1_];
									    byte[] is_223_ = Class64.aClass9_Sub1_1015.method163(0, i_222_, arg1 ^ 0x4f);
									    Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(is_223_);
									    class14_sub2_sub16_sub1.method352(Class106.aClass148Array1777, null);
									    Class79.anIntArray1305[i_1_++] = class14_sub2_sub16_sub1.method358(class124, i_221_);
									} else if (i_0_ == 4109) {
									    i_1_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    int i_224_ = Class79.anIntArray1305[i_1_];
									    int i_225_ = Class79.anIntArray1305[1 + i_1_];
									    byte[] is_226_ = Class64.aClass9_Sub1_1015.method163(0, i_225_, 0);
									    Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(is_226_);
									    class14_sub2_sub16_sub1.method352(Class106.aClass148Array1777, null);
									    Class79.anIntArray1305[i_1_++] = class14_sub2_sub16_sub1.method344(class124, i_224_);
									} else if (-4111 == (i_0_ ^ 0xffffffff)) {
									    i_2_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[1 + i_2_];
									    Class124 class124_227_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
									    if (1 == Class79.anIntArray1305[--i_1_])
										Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124_227_;
									    else
										Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124;
									} else if (4111 == i_0_) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = Class14_Sub2_Sub16.method368(class124);
									} else if (i_0_ == 4112) {
									    int i_228_ = Class79.anIntArray1305[--i_1_];
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    if (0 == (i_228_ ^ 0xffffffff))
										throw new RuntimeException("null char");
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124.method1694(24861, i_228_);
									} else if (4113 == i_0_) {
									    int i_229_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = Class14_Sub10_Sub1.method841(i_229_, 127) ? 1 : 0;
									} else if (4114 == i_0_) {
									    int i_230_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = Class14_Sub8_Sub22.method598(i_230_, Canvas_Sub2.method69(arg1, 46)) ? 1 : 0;
									} else if (i_0_ == 4115) {
									    int i_231_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = Class9_Sub1.method184((byte) 108, i_231_) ? 1 : 0;
									} else if (4116 == i_0_) {
									    int i_232_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = !Class15.method944(false, i_232_) ? 0 : 1;
									} else if (i_0_ == 4117) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    if (class124 == null)
										Class79.anIntArray1305[i_1_++] = 0;
									    else
										Class79.anIntArray1305[i_1_++] = class124.method1693(0);
									} else if (-4119 == (i_0_ ^ 0xffffffff)) {
									    i_1_ -= 2;
									    int i_233_ = Class79.anIntArray1305[1 + i_1_];
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    int i_234_ = Class79.anIntArray1305[i_1_];
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124.method1697(i_234_, i_233_, (byte) -104);
									} else if (i_0_ == 4119) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    Class124 class124_235_ = Class7_Sub1.method121(class124.method1693(0), -127);
									    boolean bool_236_ = false;
									    for (int i_237_ = 0; i_237_ < class124.method1693(0); i_237_++) {
										int i_238_ = class124.method1710(0, i_237_);
										if (60 == i_238_)
										    bool_236_ = true;
										else if (-63 != (i_238_ ^ 0xffffffff)) {
										    if (!bool_236_)
											class124_235_.method1686((byte) -5, i_238_);
										} else
										    bool_236_ = false;
									    }
									    class124_235_.method1683(arg1 + 36);
									    Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_++] = class124_235_;
									} else if (-4121 == (i_0_ ^ 0xffffffff)) {
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[--i_2_];
									    i_1_ -= 2;
									    int i_239_ = Class79.anIntArray1305[i_1_];
									    int i_240_ = Class79.anIntArray1305[1 + i_1_];
									    Class79.anIntArray1305[i_1_++] = class124.method1678(i_240_, 27575, i_239_);
									} else if ((i_0_ ^ 0xffffffff) == -4122) {
									    i_2_ -= 2;
									    Class124 class124 = Class14_Sub8_Sub39_Sub1.aClass124Array5101[i_2_];
									    Class124 class124_241_ = Class14_Sub8_Sub39_Sub1.aClass124Array5101[1 + i_2_];
									    int i_242_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = class124.method1707(class124_241_, (byte) 59, i_242_);
									} else if (i_0_ == 4122) {
									    int i_243_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = Class102.method1523(i_243_, 6427);
									} else {
									    if ((i_0_ ^ 0xffffffff) != -4124)
										break;
									    int i_244_ = Class79.anIntArray1305[--i_1_];
									    Class79.anIntArray1305[i_1_++] = RuntimeException_Sub1.method2052((byte) 120, i_244_);
									}
								    } else if (i_0_
									       == 4000) {
									i_1_ -= 2;
									int i_245_
									    = Class79.anIntArray1305[1 + i_1_];
									int i_246_
									    = Class79.anIntArray1305[i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_245_ + i_246_;
								    } else if (4001
									       == i_0_) {
									i_1_ -= 2;
									int i_247_
									    = Class79.anIntArray1305[i_1_];
									int i_248_
									    = Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = -i_248_ + i_247_;
								    } else if (-4003
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 2;
									int i_249_
									    = Class79.anIntArray1305[i_1_];
									int i_250_
									    = Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_250_ * i_249_;
								    } else if (4003
									       == i_0_) {
									i_1_ -= 2;
									int i_251_
									    = Class79.anIntArray1305[i_1_];
									int i_252_
									    = Class79.anIntArray1305[i_1_ + 1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_251_ / i_252_;
								    } else if (i_0_
									       == 4004) {
									int i_253_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (int) ((double) i_253_ * Math.random());
								    } else if (4005
									       == i_0_) {
									int i_254_
									    = Class79.anIntArray1305[--i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (int) (Math.random() * (double) (1 + i_254_));
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4007) {
									i_1_ -= 5;
									int i_255_
									    = Class79.anIntArray1305[i_1_];
									int i_256_
									    = Class79.anIntArray1305[2 + i_1_];
									int i_257_
									    = Class79.anIntArray1305[i_1_ + 1];
									int i_258_
									    = Class79.anIntArray1305[i_1_ + 4];
									int i_259_
									    = Class79.anIntArray1305[3 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (i_258_
									       - i_256_) * (-i_255_ + i_257_) / (-i_256_ + i_259_) + i_255_;
								    } else if (-4008
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 2;
									long l
									    = (long) Class79.anIntArray1305[i_1_];
									long l_260_
									    = (long) Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (int) (l - -(l * l_260_ / 100L));
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4009) {
									i_1_ -= 2;
									int i_261_
									    = Class79.anIntArray1305[i_1_ - -1];
									int i_262_
									    = Class79.anIntArray1305[i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class66.method1294(i_262_, 1 << i_261_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4010) {
									i_1_ -= 2;
									int i_263_
									    = Class79.anIntArray1305[i_1_];
									int i_264_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub26.method617(-1 + -(1 << i_264_), i_263_);
								    } else if (-4011
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 2;
									int i_265_
									    = Class79.anIntArray1305[i_1_];
									int i_266_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = 0 != Class14_Sub8_Sub26.method617(1 << i_266_, i_265_) ? 1 : 0;
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4012) {
									i_1_ -= 2;
									int i_267_
									    = Class79.anIntArray1305[i_1_];
									int i_268_
									    = Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_267_ % i_268_;
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4013) {
									i_1_ -= 2;
									int i_269_
									    = Class79.anIntArray1305[i_1_];
									int i_270_
									    = Class79.anIntArray1305[i_1_ - -1];
									if (0
									    == i_269_)
									    Class79.anIntArray1305[i_1_++] = 0;
									else
									    Class79.anIntArray1305[i_1_++] = (int) Math.pow((double) i_269_, (double) i_270_);
								    } else if (-4014
									       == (i_0_ ^ 0xffffffff)) {
									i_1_ -= 2;
									int i_271_
									    = Class79.anIntArray1305[i_1_ + 1];
									int i_272_
									    = Class79.anIntArray1305[i_1_];
									if (-1
									    != (i_272_ ^ 0xffffffff)) {
									    if (-1 == (i_271_ ^ 0xffffffff))
										Class79.anIntArray1305[i_1_++] = 2147483647;
									    else
										Class79.anIntArray1305[i_1_++] = (int) Math.pow((double) i_272_, 1.0 / (double) i_271_);
									} else
									    Class79.anIntArray1305[i_1_++] = 0;
								    } else if (4014
									       == i_0_) {
									i_1_ -= 2;
									int i_273_
									    = Class79.anIntArray1305[i_1_ - -1];
									int i_274_
									    = Class79.anIntArray1305[i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class14_Sub8_Sub26.method617(i_273_, i_274_);
								    } else if (i_0_
									       == 4015) {
									i_1_ -= 2;
									int i_275_
									    = Class79.anIntArray1305[i_1_];
									int i_276_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = Class66.method1294(i_275_, i_276_);
								    } else if ((i_0_ ^ 0xffffffff)
									       == -4017) {
									i_1_ -= 2;
									int i_277_
									    = Class79.anIntArray1305[i_1_];
									int i_278_
									    = Class79.anIntArray1305[1 + i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = i_277_ >= i_278_ ? i_278_ : i_277_;
								    } else if (i_0_
									       == 4017) {
									i_1_ -= 2;
									int i_279_
									    = Class79.anIntArray1305[i_1_];
									int i_280_
									    = Class79.anIntArray1305[i_1_ - -1];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (i_279_
									       ^ 0xffffffff) < (i_280_ ^ 0xffffffff) ? i_279_ : i_280_;
								    } else {
									if ((i_0_
									     ^ 0xffffffff)
									    != -4019)
									    break;
									i_1_ -= 3;
									long l
									    = (long) Class79.anIntArray1305[1 + i_1_];
									long l_281_
									    = (long) Class79.anIntArray1305[i_1_ - -2];
									long l_282_
									    = (long) Class79.anIntArray1305[i_1_];
									Class79
									    .anIntArray1305
									    [i_1_++]
									    = (int) (l_281_ * l_282_ / l);
								    }
								} else if ((i_0_
									    ^ 0xffffffff)
									   == -3904) {
								    int i_283_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= Class14_Sub8_Sub7
									      .aClass109Array4195
									      [i_283_]
									      .method1573(true);
								} else if ((i_0_
									    ^ 0xffffffff)
									   == -3905) {
								    int i_284_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (Class14_Sub8_Sub7
									   .aClass109Array4195
									   [i_284_]
									   .anInt1830);
								} else if (-3906
									   == (i_0_
									       ^ 0xffffffff)) {
								    int i_285_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (Class14_Sub8_Sub7
									   .aClass109Array4195
									   [i_285_]
									   .anInt1833);
								} else if (-3907
									   == (i_0_
									       ^ 0xffffffff)) {
								    int i_286_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (Class14_Sub8_Sub7
									   .aClass109Array4195
									   [i_286_]
									   .anInt1841);
								} else if (-3908
									   == (i_0_
									       ^ 0xffffffff)) {
								    int i_287_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (Class14_Sub8_Sub7
									   .aClass109Array4195
									   [i_287_]
									   .anInt1845);
								} else if ((i_0_
									    ^ 0xffffffff)
									   == -3909) {
								    int i_288_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (Class14_Sub8_Sub7
									   .aClass109Array4195
									   [i_288_]
									   .anInt1829);
								} else if (i_0_
									   == 3910) {
								    int i_289_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    int i_290_
									= Class14_Sub8_Sub7
									      .aClass109Array4195
									      [i_289_]
									      .method1572((byte) 42);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (0 != i_290_
									   ? 0
									   : 1);
								} else if (i_0_
									   == 3911) {
								    int i_291_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    int i_292_
									= Class14_Sub8_Sub7
									      .aClass109Array4195
									      [i_291_]
									      .method1572((byte) 42);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (((i_292_
									     ^ 0xffffffff)
									    != -3)
									   ? 0
									   : 1);
								} else if (i_0_
									   == 3912) {
								    int i_293_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    int i_294_
									= Class14_Sub8_Sub7
									      .aClass109Array4195
									      [i_293_]
									      .method1572((byte) 42);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (5 != i_294_
									   ? 0
									   : 1);
								} else {
								    if (-3914
									!= (i_0_
									    ^ 0xffffffff))
									break;
								    int i_295_
									= (Class79
									   .anIntArray1305
									   [--i_1_]);
								    int i_296_
									= Class14_Sub8_Sub7
									      .aClass109Array4195
									      [i_295_]
									      .method1572((byte) 42);
								    Class79
									.anIntArray1305
									[i_1_++]
									= (((i_296_
									     ^ 0xffffffff)
									    != -2)
									   ? 0
									   : 1);
								}
							    } else if (-2701
								       == (i_0_
									   ^ 0xffffffff)) {
								Class94 class94
								    = (Class55
									   .method1233
								       ((Class79
									 .anIntArray1305
									 [--i_1_]),
									21803));
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1532);
							    } else if (i_0_
								       == 2701) {
								Class94 class94
								    = (Class55
									   .method1233
								       ((Class79
									 .anIntArray1305
									 [--i_1_]),
									21803));
								if ((class94
								     .anInt1532)
								    == -1)
								    Class79
									.anIntArray1305
									[i_1_++]
									= 0;
								else
								    Class79
									.anIntArray1305
									[i_1_++]
									= (class94
									   .anInt1495);
							    } else if (2702
								       == i_0_) {
								int i_297_
								    = (Class79
								       .anIntArray1305
								       [--i_1_]);
								Class14_Sub15 class14_sub15
								    = ((Class14_Sub15)
								       (Class14_Sub30
									    .aClass55_3275
									    .method1230
									((long) i_297_,
									 (byte) -110)));
								if (null
								    == class14_sub15)
								    Class79
									.anIntArray1305
									[i_1_++]
									= 0;
								else
								    Class79
									.anIntArray1305
									[i_1_++]
									= 1;
							    } else if (i_0_
								       == 2703) {
								Class94 class94
								    = (Class55
									   .method1233
								       ((Class79
									 .anIntArray1305
									 [--i_1_]),
									21803));
								if (null
								    == (class94
									.aClass94Array1486))
								    Class79
									.anIntArray1305
									[i_1_++]
									= 0;
								else {
								    int i_298_
									= (class94
									   .aClass94Array1486).length;
								    for (int i_299_
									     = 0;
									 (i_299_
									  < class94.aClass94Array1486.length);
									 i_299_++) {
									if ((class94
									     .aClass94Array1486
									     [i_299_])
									    == null) {
									    i_298_ = i_299_;
									    break;
									}
								    }
								    Class79
									.anIntArray1305
									[i_1_++]
									= i_298_;
								}
							    } else {
								if ((2704
								     != i_0_)
								    && ((i_0_
									 ^ 0xffffffff)
									!= -2706))
								    break;
								i_1_ -= 2;
								int i_300_
								    = (Class79
								       .anIntArray1305
								       [i_1_]);
								int i_301_
								    = (Class79
								       .anIntArray1305
								       [1 + i_1_]);
								Class14_Sub15 class14_sub15
								    = ((Class14_Sub15)
								       (Class14_Sub30
									    .aClass55_3275
									    .method1230
									((long) i_300_,
									 (byte) 8)));
								if ((class14_sub15
								     == null)
								    || (i_301_
									!= (class14_sub15
									    .anInt2999)))
								    Class79
									.anIntArray1305
									[i_1_++]
									= 0;
								else
								    Class79
									.anIntArray1305
									[i_1_++]
									= 1;
							    }
							} else {
							    Class94 class94
								= (Class55
								       .method1233
								   ((Class79
								     .anIntArray1305
								     [--i_1_]),
								    21803));
							    if (-2501
								== (i_0_
								    ^ 0xffffffff))
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1523);
							    else if ((i_0_
								      ^ 0xffffffff)
								     == -2502)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1583);
							    else if ((i_0_
								      ^ 0xffffffff)
								     == -2503)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1518);
							    else if (2503
								     == i_0_)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1545);
							    else if ((i_0_
								      ^ 0xffffffff)
								     == -2505)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (!(class94
									 .aBoolean1503)
								       ? 0
								       : 1);
							    else if (i_0_
								     == 2505)
								Class79
								    .anIntArray1305
								    [i_1_++]
								    = (class94
								       .anInt1540);
							    else
								break;
							}
						    } else {
							Class94 class94
							    = (bool
							       ? (Class85
								  .aClass94_1372)
							       : (Class14_Sub8_Sub8
								  .aClass94_4223));
							if (-1601
							    == (i_0_
								^ 0xffffffff))
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1490);
							else if (1601 == i_0_)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1547);
							else if (1602 == i_0_)
							    Class14_Sub8_Sub39_Sub1
								.aClass124Array5101
								[i_2_++]
								= (class94
								   .aClass124_1499);
							else if (i_0_ == 1603)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1544);
							else if (i_0_ == 1604)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1605);
							else if ((i_0_
								  ^ 0xffffffff)
								 == -1606)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1513);
							else if (1606 == i_0_)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1465);
							else if (-1608
								 == (i_0_
								     ^ 0xffffffff))
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1516);
							else if (1608 == i_0_)
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1578);
							else if (-1610
								 == (i_0_
								     ^ 0xffffffff))
							    Class79
								.anIntArray1305
								[i_1_++]
								= (class94
								   .anInt1590);
							else
							    break;
						    }
						} else {
						    Class94 class94
							= (!bool
							   ? (Class14_Sub8_Sub8
							      .aClass94_4223)
							   : (Class85
							      .aClass94_1372));
						    if (-1501
							== (i_0_ ^ 0xffffffff))
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (class94
							       .anInt1523);
						    else if ((i_0_
							      ^ 0xffffffff)
							     == -1502)
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (class94
							       .anInt1583);
						    else if ((i_0_
							      ^ 0xffffffff)
							     == -1503)
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (class94
							       .anInt1518);
						    else if (1503 == i_0_)
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (class94
							       .anInt1545);
						    else if (-1505
							     == (i_0_
								 ^ 0xffffffff))
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (!(class94
								 .aBoolean1503)
							       ? 0 : 1);
						    else if (1505 == i_0_)
							Class79
							    .anIntArray1305
							    [i_1_++]
							    = (class94
							       .anInt1540);
						    else
							break;
						}
					    } else {
						Class94 class94;
						if (-2001
						    < (i_0_ ^ 0xffffffff))
						    class94
							= (!bool
							   ? (Class14_Sub8_Sub8
							      .aClass94_4223)
							   : (Class85
							      .aClass94_1372));
						else {
						    class94
							= (Class55.method1233
							   ((Class79
							     .anIntArray1305
							     [--i_1_]),
							    21803));
						    i_0_ -= 1000;
						}
						Class124 class124
						    = (Class14_Sub8_Sub39_Sub1
						       .aClass124Array5101
						       [--i_2_]);
						int[] is_302_ = null;
						if (0 < class124.method1693(0)
						    && ((class124.method1710
							 (0,
							  -1 + (class124
								    .method1693
								(0))))
							^ 0xffffffff) == -90) {
						    int i_303_
							= (Class79
							   .anIntArray1305
							   [--i_1_]);
						    if (-1 > (i_303_
							      ^ 0xffffffff)) {
							is_302_
							    = new int[i_303_];
							while (0 < i_303_--)
							    is_302_[i_303_]
								= (Class79
								   .anIntArray1305
								   [--i_1_]);
						    }
						    class124
							= (class124.method1697
							   (0,
							    (-1
							     + (class124
								    .method1693
								(0))),
							    (byte) -104));
						}
						Object[] objects_304_
						    = (new Object
						       [(class124.method1693
							 (arg1 ^ 0x4f)) - -1]);
						for (int i_305_
							 = (objects_304_.length
							    - 1);
						     -2 >= (i_305_
							    ^ 0xffffffff);
						     i_305_--) {
						    if (115
							!= (class124.method1710
							    (0, i_305_ + -1)))
							objects_304_[i_305_]
							    = (new Integer
							       (Class79
								.anIntArray1305
								[--i_1_]));
						    else
							objects_304_[i_305_]
							    = (Class14_Sub8_Sub39_Sub1
							       .aClass124Array5101
							       [--i_2_]);
						}
						int i_306_
						    = (Class79.anIntArray1305
						       [--i_1_]);
						if (-1 != i_306_)
						    objects_304_[0]
							= new Integer(i_306_);
						else
						    objects_304_ = null;
						if (i_0_ != 1400) {
						    if (1401 == i_0_)
							class94
							    .anObjectArray1594
							    = objects_304_;
						    else if (i_0_ == 1402)
							class94
							    .anObjectArray1592
							    = objects_304_;
						    else if (i_0_ == 1403)
							class94
							    .anObjectArray1600
							    = objects_304_;
						    else if (-1405
							     != (i_0_
								 ^ 0xffffffff)) {
							if (1405 == i_0_)
							    class94
								.anObjectArray1581
								= objects_304_;
							else if (-1407
								 != (i_0_
								     ^ 0xffffffff)) {
							    if ((i_0_
								 ^ 0xffffffff)
								!= -1408) {
								if (-1409
								    == (i_0_
									^ 0xffffffff))
								    class94
									.anObjectArray1461
									= objects_304_;
								else if ((i_0_
									  ^ 0xffffffff)
									 == -1410)
								    class94
									.anObjectArray1535
									= objects_304_;
								else if ((i_0_
									  ^ 0xffffffff)
									 == -1411)
								    class94
									.anObjectArray1475
									= objects_304_;
								else if (i_0_
									 != 1411) {
								    if (1412
									!= i_0_) {
									if (i_0_
									    == 1414) {
									    class94.anObjectArray1608 = objects_304_;
									    class94.anIntArray1470 = is_302_;
									} else if (1415 != i_0_) {
									    if ((i_0_ ^ 0xffffffff) != -1417) {
										if (-1418 != (i_0_ ^ 0xffffffff)) {
										    if (i_0_ == 1418)
											class94.anObjectArray1524 = objects_304_;
										    else if (1419 != i_0_) {
											if (-1421 != (i_0_ ^ 0xffffffff)) {
											    if (-1422 == (i_0_ ^ 0xffffffff))
												class94.anObjectArray1457 = objects_304_;
											    else if ((i_0_ ^ 0xffffffff) != -1423) {
												if (1423 == i_0_)
												    class94.anObjectArray1526 = objects_304_;
												else if ((i_0_ ^ 0xffffffff) != -1425) {
												    if (1425 == i_0_)
													class94.anObjectArray1555 = objects_304_;
												    else if (-1427 != (i_0_ ^ 0xffffffff)) {
													if (-1428 == (i_0_ ^ 0xffffffff))
													    class94.anObjectArray1604 = objects_304_;
													else if ((i_0_ ^ 0xffffffff) != -1429) {
													    if ((i_0_ ^ 0xffffffff) == -1430) {
														class94.anIntArray1546 = is_302_;
														class94.anObjectArray1517 = objects_304_;
													    }
													} else {
													    class94.anIntArray1566 = is_302_;
													    class94.anObjectArray1596 = objects_304_;
													}
												    } else
													class94.anObjectArray1601 = objects_304_;
												} else
												    class94.anObjectArray1473 = objects_304_;
											    } else
												class94.anObjectArray1484 = objects_304_;
											} else
											    class94.anObjectArray1500 = objects_304_;
										    } else
											class94.anObjectArray1519 = objects_304_;
										} else
										    class94.anObjectArray1463 = objects_304_;
									    } else
										class94.anObjectArray1562 = objects_304_;
									} else {
									    class94.anObjectArray1504 = objects_304_;
									    class94.anIntArray1539 = is_302_;
									}
								    } else
									class94
									    .anObjectArray1456
									    = objects_304_;
								} else
								    class94
									.anObjectArray1591
									= objects_304_;
							    } else {
								class94
								    .anObjectArray1585
								    = objects_304_;
								class94
								    .anIntArray1557
								    = is_302_;
							    }
							} else
							    class94
								.anObjectArray1468
								= objects_304_;
						    } else
							class94
							    .anObjectArray1576
							    = objects_304_;
						} else
						    class94.anObjectArray1458
							= objects_304_;
						class94.aBoolean1564 = true;
					    }
					} else {
					    Class94 class94;
					    if ((i_0_ ^ 0xffffffff) <= -2001) {
						class94
						    = (Class55.method1233
						       ((Class79.anIntArray1305
							 [--i_1_]),
							21803));
						i_0_ -= 1000;
					    } else
						class94
						    = (bool
						       ? Class85.aClass94_1372
						       : (Class14_Sub8_Sub8
							  .aClass94_4223));
					    if (-1301 == (i_0_ ^ 0xffffffff)) {
						int i_307_
						    = ((Class79.anIntArray1305
							[--i_1_])
						       + -1);
						if (0 > i_307_ || 9 < i_307_)
						    i_2_--;
						else
						    class94.method1477
							((Class14_Sub8_Sub39_Sub1
							  .aClass124Array5101
							  [--i_2_]),
							 (byte) 109, i_307_);
					    } else if (i_0_ == 1301) {
						i_1_ -= 2;
						int i_308_
						    = (Class79.anIntArray1305
						       [i_1_]);
						int i_309_
						    = (Class79.anIntArray1305
						       [1 + i_1_]);
						class94.aClass94_1492
						    = (Class14_Sub6.method464
						       (i_309_, i_308_,
							(byte) -19));
					    } else if ((i_0_ ^ 0xffffffff)
						       == -1303)
						class94.aBoolean1507
						    = ((Class79.anIntArray1305
							[--i_1_])
						       ^ 0xffffffff) == -2;
					    else if (-1304
						     == (i_0_ ^ 0xffffffff))
						class94.anInt1580
						    = (Class79.anIntArray1305
						       [--i_1_]);
					    else if (1304 == i_0_)
						class94.anInt1549
						    = (Class79.anIntArray1305
						       [--i_1_]);
					    else if (1305 == i_0_)
						class94.aClass124_1508
						    = (Class14_Sub8_Sub39_Sub1
						       .aClass124Array5101
						       [--i_2_]);
					    else if ((i_0_ ^ 0xffffffff)
						     == -1307)
						class94.aClass124_1589
						    = (Class14_Sub8_Sub39_Sub1
						       .aClass124Array5101
						       [--i_2_]);
					    else if ((i_0_ ^ 0xffffffff)
						     == -1308)
						class94.aClass124Array1573
						    = null;
					    else
						break;
					}
				    } else {
					Class94 class94;
					if ((i_0_ ^ 0xffffffff) <= -2001) {
					    class94 = (Class55.method1233
						       ((Class79.anIntArray1305
							 [--i_1_]),
							21803));
					    i_0_ -= 1000;
					} else
					    class94
						= (bool ? Class85.aClass94_1372
						   : (Class14_Sub8_Sub8
						      .aClass94_4223));
					Class103.method1531((byte) -56,
							    class94);
					if ((i_0_ ^ 0xffffffff) == -1201
					    || -1206 == (i_0_ ^ 0xffffffff)) {
					    i_1_ -= 2;
					    int i_310_
						= Class79.anIntArray1305[i_1_];
					    int i_311_
						= (Class79.anIntArray1305
						   [i_1_ + 1]);
					    if ((i_310_ ^ 0xffffffff) == 0) {
						class94.anInt1550 = -1;
						class94.anInt1532 = -1;
						class94.anInt1543 = 1;
					    } else {
						class94.anInt1495 = i_311_;
						class94.anInt1532 = i_310_;
						Class142 class142
						    = (Class14_Sub8_Sub24
							   .method605
						       (121, i_310_));
						class94.anInt1516
						    = class142.anInt2326;
						class94.anInt1465
						    = class142.anInt2317;
						class94.anInt1482
						    = class142.anInt2285;
						if ((i_0_ ^ 0xffffffff)
						    != -1206)
						    class94.aBoolean1575
							= true;
						else
						    class94.aBoolean1575
							= false;
						class94.anInt1459
						    = class142.anInt2293;
						class94.anInt1578
						    = class142.anInt2286;
						class94.anInt1513
						    = class142.anInt2273;
						if (-1 > (class94.anInt1514
							  ^ 0xffffffff))
						    class94.anInt1513
							= (class94.anInt1513
							   * 32
							   / (class94
							      .anInt1514));
						else if (-1
							 > (class94.anInt1485
							    ^ 0xffffffff))
						    class94.anInt1513
							= (32
							   * class94.anInt1513
							   / (class94
							      .anInt1485));
					    }
					} else if (i_0_ == 1201) {
					    class94.anInt1543 = 2;
					    class94.anInt1550
						= (Class79.anIntArray1305
						   [--i_1_]);
					} else if (i_0_ == 1202) {
					    class94.anInt1543 = 3;
					    class94.anInt1550
						= Class14_Sub3
						      .aClass133_Sub1_Sub1_2748
						      .aClass102_4941
						      .method1520(1073741824);
					} else if ((i_0_ ^ 0xffffffff)
						   == -1204) {
					    class94.anInt1543 = 6;
					    class94.anInt1550
						= (Class79.anIntArray1305
						   [--i_1_]);
					} else if (1204 == i_0_) {
					    class94.anInt1543 = 5;
					    class94.anInt1550
						= (Class79.anIntArray1305
						   [--i_1_]);
					} else
					    break;
				    }
				} else {
				    Class94 class94;
				    if ((i_0_ ^ 0xffffffff) <= -2001) {
					i_0_ -= 1000;
					class94
					    = (Class55.method1233
					       (Class79.anIntArray1305[--i_1_],
						arg1 + 21724));
				    } else
					class94 = (bool ? Class85.aClass94_1372
						   : (Class14_Sub8_Sub8
						      .aClass94_4223));
				    if (i_0_ == 1100) {
					i_1_ -= 2;
					class94.anInt1490
					    = Class79.anIntArray1305[i_1_];
					if (class94.anInt1490
					    > (class94.anInt1544
					       - class94.anInt1518))
					    class94.anInt1490
						= (class94.anInt1544
						   - class94.anInt1518);
					if (0 > class94.anInt1490)
					    class94.anInt1490 = 0;
					class94.anInt1547
					    = Class79.anIntArray1305[i_1_ + 1];
					if (((-class94.anInt1545
					      + class94.anInt1605)
					     ^ 0xffffffff)
					    > (class94.anInt1547 ^ 0xffffffff))
					    class94.anInt1547
						= (class94.anInt1605
						   - class94.anInt1545);
					if (class94.anInt1547 < 0)
					    class94.anInt1547 = 0;
					Class103.method1531((byte) -125,
							    class94);
				    } else if (i_0_ == 1101) {
					class94.anInt1567
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -42,
							    class94);
				    } else if (i_0_ == 1102) {
					class94.aBoolean1497
					    = -2 == ((Class79.anIntArray1305
						      [--i_1_])
						     ^ 0xffffffff);
					Class103.method1531((byte) -85,
							    class94);
				    } else if (1103 == i_0_) {
					class94.anInt1590
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -74,
							    class94);
				    } else if ((i_0_ ^ 0xffffffff) == -1105) {
					class94.anInt1506
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -65,
							    class94);
				    } else if (-1106 == (i_0_ ^ 0xffffffff)) {
					class94.anInt1487
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -36,
							    class94);
				    } else if (1106 == i_0_) {
					class94.anInt1474
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -63,
							    class94);
				    } else if (1107 == i_0_) {
					class94.aBoolean1520
					    = 1 == (Class79.anIntArray1305
						    [--i_1_]);
					Class103.method1531((byte) -96,
							    class94);
				    } else if (i_0_ == 1108) {
					class94.anInt1543 = 1;
					class94.anInt1550
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -115,
							    class94);
				    } else if (-1110 == (i_0_ ^ 0xffffffff)) {
					i_1_ -= 6;
					class94.anInt1459
					    = Class79.anIntArray1305[i_1_];
					class94.anInt1482
					    = Class79.anIntArray1305[1 + i_1_];
					class94.anInt1465
					    = (Class79.anIntArray1305
					       [i_1_ - -2]);
					class94.anInt1578
					    = Class79.anIntArray1305[3 + i_1_];
					class94.anInt1516
					    = Class79.anIntArray1305[4 + i_1_];
					class94.anInt1513
					    = Class79.anIntArray1305[5 + i_1_];
					Class103.method1531((byte) -83,
							    class94);
				    } else if (-1111 == (i_0_ ^ 0xffffffff)) {
					int i_312_
					    = Class79.anIntArray1305[--i_1_];
					if ((i_312_ ^ 0xffffffff)
					    != (class94.anInt1598
						^ 0xffffffff)) {
					    class94.anInt1598 = i_312_;
					    class94.anInt1610 = 0;
					    class94.anInt1603 = 0;
					    Class103.method1531((byte) -71,
								class94);
					}
				    } else if (-1112 == (i_0_ ^ 0xffffffff)) {
					class94.aBoolean1599
					    = (Class79.anIntArray1305[--i_1_]
					       ^ 0xffffffff) == -2;
					Class103.method1531((byte) -55,
							    class94);
				    } else if ((i_0_ ^ 0xffffffff) == -1113) {
					Class124 class124
					    = (Class14_Sub8_Sub39_Sub1
					       .aClass124Array5101[--i_2_]);
					if (!class124.method1704
					     (class94.aClass124_1499,
					      (byte) 119)) {
					    class94.aClass124_1499 = class124;
					    Class103.method1531((byte) -64,
								class94);
					}
				    } else if (-1114 == (i_0_ ^ 0xffffffff)) {
					class94.anInt1588
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -69,
							    class94);
				    } else if ((i_0_ ^ 0xffffffff) == -1115) {
					i_1_ -= 3;
					class94.anInt1571
					    = Class79.anIntArray1305[i_1_];
					class94.anInt1538
					    = (Class79.anIntArray1305
					       [i_1_ - -1]);
					class94.anInt1460
					    = (Class79.anIntArray1305
					       [i_1_ - -2]);
					Class103.method1531((byte) -100,
							    class94);
				    } else if (i_0_ == 1115) {
					class94.aBoolean1471
					    = (Class79.anIntArray1305[--i_1_]
					       == 1);
					Class103.method1531((byte) -81,
							    class94);
				    } else if (1116 == i_0_) {
					class94.anInt1597
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -63,
							    class94);
				    } else if (i_0_ == 1117) {
					class94.anInt1570
					    = Class79.anIntArray1305[--i_1_];
					Class103.method1531((byte) -62,
							    class94);
				    } else if (-1119 == (i_0_ ^ 0xffffffff)) {
					class94.aBoolean1472
					    = 1 == (Class79.anIntArray1305
						    [--i_1_]);
					Class103.method1531((byte) -116,
							    class94);
				    } else if (1119 == i_0_) {
					class94.aBoolean1612
					    = (Class79.anIntArray1305[--i_1_]
					       == 1);
					Class103.method1531((byte) -116,
							    class94);
				    } else if (-1121 == (i_0_ ^ 0xffffffff)) {
					i_1_ -= 2;
					class94.anInt1544
					    = Class79.anIntArray1305[i_1_];
					class94.anInt1605
					    = (Class79.anIntArray1305
					       [i_1_ - -1]);
					Class103.method1531((byte) -127,
							    class94);
					if (-1 == (class94.anInt1489
						   ^ 0xffffffff))
					    Class14_Sub2_Sub21.method445
						(class94, 18559, false);
				    } else if (-1122 == (i_0_ ^ 0xffffffff)) {
					i_1_ -= 2;
					class94.aShort1602
					    = (short) (Class79.anIntArray1305
						       [i_1_]);
					class94.aShort1528
					    = (short) (Class79.anIntArray1305
						       [1 + i_1_]);
					Class103.method1531((byte) -126,
							    class94);
				    } else if (i_0_ == 1122) {
					class94.aBoolean1577
					    = (Class79.anIntArray1305[--i_1_]
					       == 1);
					Class103.method1531((byte) -63,
							    class94);
				    } else
					break;
				}
			    } else {
				Class94 class94;
				if (i_0_ < 2000)
				    class94
					= (bool ? Class85.aClass94_1372
					   : Class14_Sub8_Sub8.aClass94_4223);
				else {
				    class94
					= Class55.method1233((Class79
							      .anIntArray1305
							      [--i_1_]),
							     21803);
				    i_0_ -= 1000;
				}
				if (-1001 == (i_0_ ^ 0xffffffff)) {
				    i_1_ -= 4;
				    class94.anInt1561
					= Class79.anIntArray1305[i_1_];
				    class94.anInt1609
					= Class79.anIntArray1305[1 + i_1_];
				    int i_313_
					= Class79.anIntArray1305[i_1_ + 2];
				    int i_314_
					= Class79.anIntArray1305[i_1_ + 3];
				    if (0 > i_313_)
					i_313_ = 0;
				    else if (5 < i_313_)
					i_313_ = 5;
				    if (0 <= i_314_) {
					if ((i_314_ ^ 0xffffffff) < -6)
					    i_314_ = 5;
				    } else
					i_314_ = 0;
				    class94.aByte1502 = (byte) i_314_;
				    class94.aByte1496 = (byte) i_313_;
				    Class103.method1531((byte) -79, class94);
				    Class14_Sub8_Sub19.method582((byte) -124,
								 class94);
				} else if (i_0_ == 1001) {
				    i_1_ -= 4;
				    class94.anInt1485
					= Class79.anIntArray1305[i_1_];
				    class94.anInt1488
					= Class79.anIntArray1305[1 + i_1_];
				    class94.anInt1514 = 0;
				    class94.anInt1534 = 0;
				    int i_315_
					= Class79.anIntArray1305[i_1_ - -3];
				    int i_316_
					= Class79.anIntArray1305[i_1_ + 2];
				    if (i_316_ >= 0) {
					if (4 < i_316_)
					    i_316_ = 4;
				    } else
					i_316_ = 0;
				    if ((i_315_ ^ 0xffffffff) > -1)
					i_315_ = 0;
				    else if (i_315_ > 4)
					i_315_ = 4;
				    class94.aByte1536 = (byte) i_315_;
				    class94.aByte1509 = (byte) i_316_;
				    Class103.method1531((byte) -100, class94);
				    Class14_Sub8_Sub19.method582((byte) -124,
								 class94);
				    if ((class94.anInt1489 ^ 0xffffffff) == -1)
					Class14_Sub2_Sub21
					    .method445(class94, 18559, false);
				} else if (i_0_ == 1003) {
				    boolean bool_317_
					= 1 == Class79.anIntArray1305[--i_1_];
				    if (!class94.aBoolean1503 != !bool_317_) {
					class94.aBoolean1503 = bool_317_;
					Class103.method1531((byte) -110,
							    class94);
				    }
				} else if (-1005 == (i_0_ ^ 0xffffffff)) {
				    i_1_ -= 2;
				    class94.anInt1467
					= Class79.anIntArray1305[i_1_];
				    class94.anInt1464
					= Class79.anIntArray1305[1 + i_1_];
				    Class103.method1531((byte) -61, class94);
				    Class14_Sub8_Sub19.method582((byte) -124,
								 class94);
				    if (class94.anInt1489 == 0)
					Class14_Sub2_Sub21
					    .method445(class94, 18559, false);
				} else
				    break;
			    }
			} else if ((i_0_ ^ 0xffffffff) == -101) {
			    i_1_ -= 3;
			    int i_318_ = Class79.anIntArray1305[i_1_];
			    int i_319_ = Class79.anIntArray1305[i_1_ + 1];
			    int i_320_ = Class79.anIntArray1305[2 + i_1_];
			    if (-1 == (i_319_ ^ 0xffffffff))
				throw new RuntimeException();
			    Class94 class94
				= Class55.method1233(i_318_, 21803);
			    if (null == class94.aClass94Array1486)
				class94.aClass94Array1486
				    = new Class94[1 + i_320_];
			    if (i_320_ >= class94.aClass94Array1486.length) {
				Class94[] class94s = new Class94[i_320_ - -1];
				for (int i_321_ = 0;
				     ((i_321_ ^ 0xffffffff)
				      > (class94.aClass94Array1486.length
					 ^ 0xffffffff));
				     i_321_++)
				    class94s[i_321_]
					= class94.aClass94Array1486[i_321_];
				class94.aClass94Array1486 = class94s;
			    }
			    if ((i_320_ ^ 0xffffffff) < -1
				&& (null
				    == class94.aClass94Array1486[i_320_ - 1]))
				throw new RuntimeException("Gap at:"
							   + (-1 + i_320_));
			    Class94 class94_322_ = new Class94();
			    class94_322_.aBoolean1455 = true;
			    class94_322_.anInt1478 = i_320_;
			    class94_322_.anInt1540 = class94_322_.anInt1548
				= class94.anInt1548;
			    class94_322_.anInt1489 = i_319_;
			    class94.aClass94Array1486[i_320_] = class94_322_;
			    if (bool)
				Class85.aClass94_1372 = class94_322_;
			    else
				Class14_Sub8_Sub8.aClass94_4223 = class94_322_;
			    Class103.method1531((byte) -107, class94);
			} else if (101 == i_0_) {
			    Class94 class94
				= (bool ? Class85.aClass94_1372
				   : Class14_Sub8_Sub8.aClass94_4223);
			    if (0 == (class94.anInt1478 ^ 0xffffffff)) {
				if (bool)
				    throw new RuntimeException
					      ("Tried to .cc_delete static .active-component!");
				throw new RuntimeException
					  ("Tried to cc_delete static active-component!");
			    }
			    Class94 class94_323_
				= Class55.method1233(class94.anInt1548,
						     arg1 ^ 0x5564);
			    class94_323_.aClass94Array1486[class94.anInt1478]
				= null;
			    Class103.method1531((byte) -77, class94_323_);
			} else if (102 == i_0_) {
			    Class94 class94
				= Class55.method1233((Class79.anIntArray1305
						      [--i_1_]),
						     21803);
			    class94.aClass94Array1486 = null;
			    Class103.method1531((byte) -68, class94);
			} else if (-201 == (i_0_ ^ 0xffffffff)) {
			    i_1_ -= 2;
			    int i_324_ = Class79.anIntArray1305[1 + i_1_];
			    int i_325_ = Class79.anIntArray1305[i_1_];
			    Class94 class94
				= Class14_Sub6.method464(i_324_, i_325_,
							 (byte) -19);
			    if (class94 == null || 0 == (i_324_ ^ 0xffffffff))
				Class79.anIntArray1305[i_1_++] = 0;
			    else {
				Class79.anIntArray1305[i_1_++] = 1;
				if (!bool)
				    Class14_Sub8_Sub8.aClass94_4223 = class94;
				else
				    Class85.aClass94_1372 = class94;
			    }
			} else {
			    if ((i_0_ ^ 0xffffffff) != -202)
				break;
			    int i_326_ = Class79.anIntArray1305[--i_1_];
			    Class94 class94
				= Class55.method1233(i_326_, 21803);
			    if (class94 != null) {
				Class79.anIntArray1305[i_1_++] = 1;
				if (bool)
				    Class85.aClass94_1372 = class94;
				else
				    Class14_Sub8_Sub8.aClass94_4223 = class94;
			    } else
				Class79.anIntArray1305[i_1_++] = 0;
			}
		    }
		    throw new IllegalStateException();
		} while (false);
		Throwable throwable = new Throwable();
		if (class14_sub2_sub12.aClass124_3906 != null) {
		    Class124 class124 = Class7_Sub1.method121(30, 121);
		    class124.method1675
			((byte) -127, Class132.aClass124_2172).method1675
			((byte) -127, class14_sub2_sub12.aClass124_3906);
		    for (int i_327_ = Class67.anInt1058 + -1;
			 (i_327_ ^ 0xffffffff) <= -1; i_327_--)
			class124.method1675
			    ((byte) -128, Class125_Sub4.aClass124_3428)
			    .method1675
			    ((byte) -128,
			     (Class83.aClass112Array1341[i_327_]
			      .aClass14_Sub2_Sub12_1873.aClass124_3906));
		    if (i_0_ == 40) {
			int i_328_ = is[i];
			class124.method1675
			    ((byte) -127, Class14_Sub2_Sub12.aClass124_3915)
			    .method1675
			    ((byte) -128, Class83.method1407(56, i_328_));
		    }
		    if (-1 != (Class7.anInt182 ^ 0xffffffff))
			Class15.method943((Class14_Sub8_Sub7.method515
					   ((new Class124[]
					     { Class14_Sub17.aClass124_3019,
					       (class14_sub2_sub12
						.aClass124_3906) }),
					    (byte) -75)),
					  false, Class140.aClass124_2234, 0);
		    Class14_Sub9_Sub3.method738
			(("CS2 - scr:" + class14_sub2_sub12.aLong355 + " op:"
			  + i_0_
			  + new String(class124.method1681(arg1 + -27))),
			 throwable, 95);
		} else {
		    if (Class7.anInt182 != 0)
			Class15.method943(Class99.aClass124_1679, false,
					  Class140.aClass124_2234, 0);
		    Class14_Sub9_Sub3.method738(("CS2 - scr:"
						 + class14_sub2_sub12.aLong355
						 + " op:" + i_0_),
						throwable, 95);
		}
		break while_1074_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("sa.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static int method1597(boolean arg0, Class133_Sub1_Sub1 arg1) {
	int i;
	try {
	    anInt1931++;
	    if (arg0)
		method1597(false, null);
	    int i_329_ = arg1.anInt4940;
	    if ((arg1.anInt3452 ^ 0xffffffff) == (arg1.anInt3433 ^ 0xffffffff))
		i_329_ = arg1.anInt4909;
	    else if (arg1.anInt3456 == arg1.anInt3452)
		i_329_ = arg1.anInt4932;
	    i = i_329_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sa.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return i;
    }
    
    public static void method1598(int arg0) {
	try {
	    if (arg0 <= 46)
		anInt1929 = -62;
	    anInt1934++;
	    Class21.aClass52_444.method1209((byte) -96);
	    Class14_Sub2_Sub12.aClass52_3894.method1209((byte) -96);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sa.D(" + arg0 + ')');
	}
    }
    
    public static void method1599(int arg0) {
	try {
	    anIntArray1928 = null;
	    if (arg0 != -16844)
		method1597(true, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sa.A(" + arg0 + ')');
	}
    }
}
