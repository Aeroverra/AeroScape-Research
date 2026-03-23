/* Class14_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class14_Sub5 extends Class14
{
    public boolean[] aBooleanArray2791;
    public static Class9 aClass9_2792;
    public static int anInt2793;
    public int anInt2794;
    public int[] anIntArray2795;
    public static Class124 aClass124_2796
	= Class14_Sub2_Sub2.method263(1178, "Examine");
    public static int anInt2797;
    public int[][] anIntArrayArray2798;
    public static int[][] anIntArrayArray2799;
    public static long aLong2800 = 0L;
    public static int anInt2801 = -1;
    public static Class124 aClass124_2802;
    public static int anInt2803;
    public static Class124 aClass124_2804;
    public int anInt2805;
    
    public static void method460(int arg0) {
    while_248_:
	do {
	while_247_:
	    do {
		do {
		    try {
			if (Class7_Sub2.anInt2675 > 1) {
			    Class7_Sub2.anInt2675--;
			    Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
			}
			anInt2803++;
			if (Class62.anInt990 > 0)
			    Class62.anInt990--;
			if (!Class89.aBoolean1416)
			    break;
			Class89.aBoolean1416 = false;
			Class99_Sub2.method1508((byte) 122);
		    } catch (RuntimeException runtimeexception) {
			break while_247_;
		    }
		    return;
		} while (false);
		do {
		    try {
			for (int i = 0;
			     100 > i && Class14_Sub8_Sub35.method664(false);
			     i++) {
			    /* empty */
			}
			if (-31 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_247_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class106.method1540(Class55.aClass14_Sub10_Sub1_891,
					    141, -15);
			Object object = (Class14_Sub2_Sub11.aClass100_3878.anObject1688);
			synchronized (object) {
			    if (Class14_Sub8_Sub10.aBoolean4249) {
				if (-1 != (Class7_Sub3_Sub1.anInt3714
					   ^ 0xffffffff)
				    || (Class14_Sub2_Sub11.aClass100_3878
					.anInt1696) >= 40) {
				    Class14_Sub2_Sub20.anInt4060++;
				    Class55.aClass14_Sub10_Sub1_891
					.method843(arg0 + 0, 117);
				    int i = 0;
				    Class55.aClass14_Sub10_Sub1_891
					.method809(false, 0);
				    int i_0_ = (Class55.aClass14_Sub10_Sub1_891
						.anInt2908);
				    for (int i_1_ = 0;
					 (((i_1_ ^ 0xffffffff)
					   > ((Class14_Sub2_Sub11
					       .aClass100_3878.anInt1696)
					      ^ 0xffffffff))
					  && 240 > (Class55
						    .aClass14_Sub10_Sub1_891
						    .anInt2908) + -i_0_);
					 i_1_++) {
					i++;
					int i_2_ = (Class14_Sub2_Sub11
						    .aClass100_3878
						    .anIntArray1697[i_1_]);
					int i_3_ = (Class14_Sub2_Sub11
						    .aClass100_3878
						    .anIntArray1700[i_1_]);
					if (0 <= i_2_) {
					    if (-65535 > (i_2_ ^ 0xffffffff))
						i_2_ = 65534;
					} else
					    i_2_ = 0;
					if ((i_3_ ^ 0xffffffff) > -1)
					    i_3_ = 0;
					else if (i_3_ > 65534)
					    i_3_ = 65534;
					boolean bool = false;
					if (((Class14_Sub2_Sub11.aClass100_3878
					      .anIntArray1697[i_1_])
					     ^ 0xffffffff) == 0
					    && 0 == ((Class14_Sub2_Sub11
						      .aClass100_3878
						      .anIntArray1700[i_1_])
						     ^ 0xffffffff)) {
					    bool = true;
					    i_2_ = -1;
					    i_3_ = -1;
					}
					if (Class14_Sub17.anInt3020 == i_3_
					    && Class102.anInt1709 == i_2_) {
					    if (Class14_Sub8_Sub5.anInt4166
						< 2047)
						Class14_Sub8_Sub5.anInt4166++;
					} else {
					    int i_4_
						= i_2_ + -Class102.anInt1709;
					    Class102.anInt1709 = i_2_;
					    int i_5_
						= (-Class14_Sub17.anInt3020
						   + i_3_);
					    Class14_Sub17.anInt3020 = i_3_;
					    if ((Class14_Sub8_Sub5.anInt4166
						 ^ 0xffffffff) > -9
						&& (i_5_ ^ 0xffffffff) <= 31
						&& 31 >= i_5_ && i_4_ >= -32
						&& 31 >= i_4_) {
						i_4_ += 32;
						i_5_ += 32;
						Class55
						    .aClass14_Sub10_Sub1_891
						    .method833
						    ((byte) 86,
						     (((Class14_Sub8_Sub5
							.anInt4166)
						       << -1929775668)
						      - -(i_5_ << -1870333306)
						      + i_4_));
						Class14_Sub8_Sub5.anInt4166
						    = 0;
					    } else if ((Class14_Sub8_Sub5
							.anInt4166) < 32
						       && 127 >= (i_5_
								  ^ 0xffffffff)
						       && ((i_5_ ^ 0xffffffff)
							   >= -128)
						       && -128 <= i_4_
						       && ((i_4_ ^ 0xffffffff)
							   >= -128)) {
						i_5_ += 128;
						i_4_ += 128;
						Class55
						    .aClass14_Sub10_Sub1_891
						    .method809
						    (false,
						     128 - -(Class14_Sub8_Sub5
							     .anInt4166));
						Class55
						    .aClass14_Sub10_Sub1_891
						    .method833
						    ((byte) 95,
						     ((i_5_ << -2063830424)
						      - -i_4_));
						Class14_Sub8_Sub5.anInt4166
						    = 0;
					    } else if (-33
						       < ((Class14_Sub8_Sub5
							   .anInt4166)
							  ^ 0xffffffff)) {
						Class55
						    .aClass14_Sub10_Sub1_891
						    .method809
						    (false,
						     192 + (Class14_Sub8_Sub5
							    .anInt4166));
						if (bool)
						    Class55
							.aClass14_Sub10_Sub1_891
							.method803
							(-2147483648, 119);
						else
						    Class55
							.aClass14_Sub10_Sub1_891
							.method803
							((i_2_ << 1580425936
							  | i_3_),
							 113);
						Class14_Sub8_Sub5.anInt4166
						    = 0;
					    } else {
						Class55
						    .aClass14_Sub10_Sub1_891
						    .method833
						    ((byte) 98,
						     (Class14_Sub8_Sub5
						      .anInt4166) + 57344);
						if (!bool)
						    Class55
							.aClass14_Sub10_Sub1_891
							.method803
							((i_2_ << 1246397232
							  | i_3_),
							 arg0 + 127);
						else
						    Class55
							.aClass14_Sub10_Sub1_891
							.method803
							(-2147483648, 101);
						Class14_Sub8_Sub5.anInt4166
						    = 0;
					    }
					}
				    }
				    Class55.aClass14_Sub10_Sub1_891.method804
					(-i_0_ + (Class55
						  .aClass14_Sub10_Sub1_891
						  .anInt2908),
					 (byte) 32);
				    if (i < (Class14_Sub2_Sub11.aClass100_3878
					     .anInt1696)) {
					Class14_Sub2_Sub11.aClass100_3878
					    .anInt1696
					    -= i;
					for (int i_6_ = 0;
					     ((i_6_ ^ 0xffffffff)
					      > ((Class14_Sub2_Sub11
						  .aClass100_3878.anInt1696)
						 ^ 0xffffffff));
					     i_6_++) {
					    Class14_Sub2_Sub11
						.aClass100_3878.anIntArray1700
						[i_6_]
						= (Class14_Sub2_Sub11
						   .aClass100_3878
						   .anIntArray1700[i_6_ + i]);
					    Class14_Sub2_Sub11
						.aClass100_3878.anIntArray1697
						[i_6_]
						= (Class14_Sub2_Sub11
						   .aClass100_3878
						   .anIntArray1697[i_6_ + i]);
					}
				    } else
					Class14_Sub2_Sub11.aClass100_3878
					    .anInt1696
					    = 0;
				}
			    } else
				Class14_Sub2_Sub11.aClass100_3878.anInt1696
				    = 0;
			}
			if ((Class7_Sub3_Sub1.anInt3714 ^ 0xffffffff) != -1) {
			    long l = (-Class2.aLong95 + aLong2800) / 50L;
			    int i = Class125_Sub1.anInt3367;
			    Class2.aLong95 = aLong2800;
			    if (0 > i)
				i = 0;
			    else if ((i ^ 0xffffffff) < -65536)
				i = 65535;
			    Class120.anInt1998++;
			    int i_7_ = Class139.anInt2230;
			    int i_8_ = 0;
			    if (-1 < (i_7_ ^ 0xffffffff))
				i_7_ = 0;
			    else if ((i_7_ ^ 0xffffffff) < -65536)
				i_7_ = 65535;
			    if (32767L < l)
				l = 32767L;
			    if ((Class7_Sub3_Sub1.anInt3714 ^ 0xffffffff)
				== -3)
				i_8_ = 1;
			    int i_9_ = (int) l;
			    Class55.aClass14_Sub10_Sub1_891
				.method843(arg0 ^ 0x0, 59);
			    Class55.aClass14_Sub10_Sub1_891.method833
				((byte) 126, i_8_ << 1874551695 | i_9_);
			    Class55.aClass14_Sub10_Sub1_891.method811
				(i | i_7_ << -1605211440, (byte) -96);
			}
			if (-1 > (Class100.anInt1685 ^ 0xffffffff))
			    Class100.anInt1685--;
			if (Class14_Sub8_Sub29.aBooleanArray4581[96]
			    || Class14_Sub8_Sub29.aBooleanArray4581[97]
			    || Class14_Sub8_Sub29.aBooleanArray4581[98]
			    || Class14_Sub8_Sub29.aBooleanArray4581[99])
			    Class47.aBoolean788 = true;
			if (Class47.aBoolean788 && Class100.anInt1685 <= 0) {
			    Class100.anInt1685 = 20;
			    Class133_Sub3.anInt3565++;
			    Class47.aBoolean788 = false;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 99);
			    Class55.aClass14_Sub10_Sub1_891
				.method801((byte) -89, Class2.anInt102);
			    Class55.aClass14_Sub10_Sub1_891.method792
				(Class14_Sub8_Sub19.anInt4408, (byte) -98);
			}
			if (true == Class83.aBoolean1342
			    && Class54.aBoolean879 != true) {
			    Class54.aBoolean879 = true;
			    Class14_Sub2_Sub2.anInt3754++;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 248);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      1);
			}
			if (!Class83.aBoolean1342
			    && false == !Class54.aBoolean879) {
			    Class14_Sub2_Sub2.anInt3754++;
			    Class54.aBoolean879 = false;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 248);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      0);
			}
			if (!Class9.aBoolean214) {
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 165);
			    Class14_Sub2_Sub20.anInt4058++;
			    Class55.aClass14_Sub10_Sub1_891.method808
				(Class14_Sub6.method463((byte) -124),
				 (byte) -119);
			    Class9.aBoolean214 = true;
			}
			Class14_Sub2_Sub12.method317((byte) -127);
			if (-31 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_247_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class9.method169(-1);
			Class71.method1318((byte) 112);
			Class96.anInt1636++;
			if (-751 <= (Class96.anInt1636 ^ 0xffffffff))
			    break;
			Class99_Sub2.method1508((byte) 123);
		    } catch (RuntimeException runtimeexception) {
			break while_247_;
		    }
		    return;
		} while (false);
		try {
		    Class17.method957((byte) -93);
		    Class14_Sub8_Sub11.method532(0);
		    Class64.method1286((byte) 120);
		    if (Class97.aClass94_1657 != null)
			Class36.method1106(-1);
		    for (int i = client.method44(true, -1); i != -1;
			 i = client.method44(false, -1)) {
			Class122.method1660(15237, i);
			Class24.anIntArray467
			    [Class14_Sub8_Sub26.method617(Class22.anInt461++,
							  31)]
			    = i;
		    }
		    for (Class14_Sub2_Sub13 class14_sub2_sub13
			     = Class14_Sub8_Sub20.method584(arg0 + -11988);
			 null != class14_sub2_sub13;
			 class14_sub2_sub13
			     = Class14_Sub8_Sub20.method584(arg0 + -11988)) {
			int i = class14_sub2_sub13.method328((byte) 114);
			int i_10_
			    = class14_sub2_sub13.method331(arg0 ^ 0x2205);
			if (i != 1) {
			    if ((i ^ 0xffffffff) == -3) {
				Class14_Sub8_Sub24.aClass124Array4499[i_10_]
				    = class14_sub2_sub13.aClass124_3925;
				Class5.anIntArray147
				    [(Class14_Sub8_Sub26.method617
				      (31, Class14_Sub2_Sub17.anInt4018++))]
				    = i_10_;
			    }
			} else {
			    Class133_Sub1_Sub2.anIntArray4944[i_10_]
				= class14_sub2_sub13.anInt3920;
			    Class141.anIntArray2246
				[(Class14_Sub8_Sub26.method617
				  (Class14_Sub8_Sub17.anInt4378++, 31))]
				= i_10_;
			}
		    }
		    if (0 != Class14_Sub2_Sub11.anInt3881) {
			Class14_Sub2_Sub17.anInt4017 += 20;
			if ((Class14_Sub2_Sub17.anInt4017 ^ 0xffffffff)
			    <= -401)
			    Class14_Sub2_Sub11.anInt3881 = 0;
		    }
		    Class51.anInt839++;
		    if (null != Class94.aClass94_1469) {
			Class14_Sub8_Sub3.anInt4124++;
			if (Class14_Sub8_Sub3.anInt4124 >= 15) {
			    Class103.method1531((byte) -111,
						Class94.aClass94_1469);
			    Class94.aClass94_1469 = null;
			}
		    }
		    if (Class14_Sub8_Sub21.aClass94_4446 != null) {
			Class103.method1531((byte) -114,
					    Class14_Sub8_Sub21.aClass94_4446);
			if (((Class133_Sub1_Sub1.anInt4936 + 5 ^ 0xffffffff)
			     > (Class14_Sub8_Sub33.anInt4640 ^ 0xffffffff))
			    || (Class14_Sub8_Sub33.anInt4640
				< Class133_Sub1_Sub1.anInt4936 - 5)
			    || ((5 + Class111.anInt1865 ^ 0xffffffff)
				> (Class107.anInt1804 ^ 0xffffffff))
			    || Class107.anInt1804 < -5 + Class111.anInt1865)
			    Class14_Sub8_Sub8.aBoolean4221 = true;
			Class113.anInt1879++;
			if (Class14_Sub8_Sub30.anInt4599 == 0) {
			    if (!Class14_Sub8_Sub8.aBoolean4221
				|| (Class113.anInt1879 ^ 0xffffffff) > -6) {
				if ((Class103.anInt1730 == 1
				     || Class127.method1754(128,
							    (Class14_Sub8_Sub38
							     .anInt4729) + -1))
				    && (Class14_Sub8_Sub38.anInt4729
					^ 0xffffffff) < -3)
				    Class14_Sub2_Sub18.method382((byte) 124);
				else if ((Class14_Sub8_Sub38.anInt4729
					  ^ 0xffffffff)
					 < -1)
				    Class107.method1551(-23473);
			    } else if ((Class14_Sub8_Sub21.aClass94_4446
					== Class141.aClass94_2239)
				       && (Class14_Sub8_Sub31.anInt4601
					   != Class122.anInt2054)) {
				Class14_Sub8_Sub22.anInt4455++;
				Class94 class94
				    = Class14_Sub8_Sub21.aClass94_4446;
				int i = 0;
				if (-2 == (Class14_Sub4.anInt2782 ^ 0xffffffff)
				    && 206 == class94.anInt1498)
				    i = 1;
				if ((class94.anIntArray1452
				     [Class14_Sub8_Sub31.anInt4601])
				    <= 0)
				    i = 0;
				if (!Class14_Sub6.method468
				     (arg0 ^ 0x68, client.method46(class94))) {
				    if ((i ^ 0xffffffff) != -2)
					class94.method1472((Class14_Sub8_Sub31
							    .anInt4601),
							   -10944,
							   Class122.anInt2054);
				    else {
					int i_11_ = Class122.anInt2054;
					int i_12_
					    = Class14_Sub8_Sub31.anInt4601;
					while ((i_11_ ^ 0xffffffff)
					       != (i_12_ ^ 0xffffffff)) {
					    if ((i_12_ ^ 0xffffffff)
						<= (i_11_ ^ 0xffffffff)) {
						if (i_12_ > i_11_) {
						    class94.method1472
							(1 + i_11_, -10944,
							 i_11_);
						    i_11_++;
						}
					    } else {
						class94.method1472(-1 + i_11_,
								   -10944,
								   i_11_);
						i_11_--;
					    }
					}
				    }
				} else {
				    int i_13_ = Class122.anInt2054;
				    int i_14_ = Class14_Sub8_Sub31.anInt4601;
				    class94.anIntArray1452[i_14_]
					= class94.anIntArray1452[i_13_];
				    class94.anIntArray1542[i_14_]
					= class94.anIntArray1542[i_13_];
				    class94.anIntArray1452[i_13_] = -1;
				    class94.anIntArray1542[i_13_] = 0;
				}
				Class55.aClass14_Sub10_Sub1_891.method843(0,
									  167);
				Class55.aClass14_Sub10_Sub1_891.method801
				    ((byte) -64, Class14_Sub8_Sub31.anInt4601);
				Class55.aClass14_Sub10_Sub1_891
				    .method823(i, true);
				Class55.aClass14_Sub10_Sub1_891
				    .method801((byte) -65, Class122.anInt2054);
				Class55.aClass14_Sub10_Sub1_891.method785
				    (-102, (Class14_Sub8_Sub21.aClass94_4446
					    .anInt1548));
			    }
			    Class7_Sub3_Sub1.anInt3714 = 0;
			    Class14_Sub8_Sub3.anInt4124 = 10;
			    Class14_Sub8_Sub21.aClass94_4446 = null;
			}
		    }
		    Class14_Sub19.aClass94_3070 = null;
		    Class94 class94 = Class125_Sub3.aClass94_3410;
		    Class152.anInt2440 = 0;
		    Class125_Sub3.aClass94_3410 = null;
		    Class122.aBoolean2056 = false;
		    Class59.aBoolean954 = false;
		    Class94 class94_15_ = Class47.aClass94_784;
		    Class47.aClass94_784 = null;
		    for (/**/;
			 (Class14_Sub8_Sub5.method503(true)
			  && (Class152.anInt2440 ^ 0xffffffff) > -129);
			 Class152.anInt2440++) {
			Class14_Sub11.anIntArray2948[Class152.anInt2440]
			    = Class36.anInt630;
			Class125_Sub3.anIntArray3398[Class152.anInt2440]
			    = Class146.anInt2358;
		    }
		    Class97.aClass94_1657 = null;
		    if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class12.method218(arg0 ^ ~0x7837,
					  Class14_Sub20.anInt3094, 0, 0,
					  Class14_Sub2_Sub12.anInt3912, 0, 0,
					  Class83.anInt1340);
		    Class14_Sub8_Sub23.anInt4478++;
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = ((Class14_Sub21)
			       Class126.aClass2_2093.method78(128));
			if (null == class14_sub21)
			    break;
			Class94 class94_16_ = class14_sub21.aClass94_3116;
			if ((class94_16_.anInt1478 ^ 0xffffffff) <= -1) {
			    Class94 class94_17_
				= Class55.method1233(class94_16_.anInt1540,
						     21803);
			    if (null == class94_17_
				|| class94_17_.aClass94Array1486 == null
				|| ((class94_16_.anInt1478 ^ 0xffffffff)
				    <= (class94_17_.aClass94Array1486.length
					^ 0xffffffff))
				|| class94_16_ != (class94_17_
						   .aClass94Array1486
						   [class94_16_.anInt1478]))
				continue;
			}
			Class133_Sub3.method1830(class14_sub21,
						 arg0 ^ ~0x75d55eb8);
		    }
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = ((Class14_Sub21)
			       Class14_Sub15.aClass2_2988.method78(128));
			if (null == class14_sub21)
			    break;
			Class94 class94_18_ = class14_sub21.aClass94_3116;
			if ((class94_18_.anInt1478 ^ 0xffffffff) <= -1) {
			    Class94 class94_19_
				= Class55.method1233(class94_18_.anInt1540,
						     21803);
			    if (null == class94_19_
				|| null == class94_19_.aClass94Array1486
				|| (class94_19_.aClass94Array1486.length
				    <= class94_18_.anInt1478)
				|| class94_18_ != (class94_19_
						   .aClass94Array1486
						   [class94_18_.anInt1478]))
				continue;
			}
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		    }
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = (Class14_Sub21) Class1.aClass2_70.method78(128);
			if (class14_sub21 == null)
			    break;
			Class94 class94_20_ = class14_sub21.aClass94_3116;
			if (class94_20_.anInt1478 >= 0) {
			    Class94 class94_21_
				= Class55.method1233(class94_20_.anInt1540,
						     21803);
			    if (null == class94_21_
				|| class94_21_.aClass94Array1486 == null
				|| (class94_21_.aClass94Array1486.length
				    <= class94_20_.anInt1478)
				|| (class94_21_.aClass94Array1486
				    [class94_20_.anInt1478]) != class94_20_)
				continue;
			}
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		    }
		    if (Class14_Sub2.aBoolean2736
			&& null == Class97.aClass94_1657)
			Class14_Sub2.aBoolean2736 = false;
		    if (Class67.aClass94_1060 != null)
			Class7_Sub1.method122(false);
		    if ((Class152.anInt2439 ^ 0xffffffff) < -1
			&& Class14_Sub8_Sub29.aBooleanArray4581[82]
			&& Class14_Sub8_Sub29.aBooleanArray4581[81]
			&& -1 != (Class113.anInt1881 ^ 0xffffffff)) {
			int i
			    = Class14_Sub2_Sub3.anInt3785 - Class113.anInt1881;
			if (i < 0)
			    i = 0;
			else if ((i ^ 0xffffffff) < -4)
			    i = 3;
			Class7_Sub2.method125((Class133_Sub6.anInt3676
					       + (Class14_Sub3
						  .aClass133_Sub1_Sub1_2748
						  .anIntArray3476[0])),
					      (Class58.anInt947
					       - -(Class14_Sub3
						   .aClass133_Sub1_Sub1_2748
						   .anIntArray3443[0])),
					      arg0 + 63, i);
		    }
		    if (Class66.anInt1039 != -1) {
			int i = Class14_Sub8_Sub33.anInt4636;
			int i_22_ = Class66.anInt1039;
			if (-1 <= (Class152.anInt2439 ^ 0xffffffff)
			    || !Class14_Sub8_Sub29.aBooleanArray4581[82]
			    || !Class14_Sub8_Sub29.aBooleanArray4581[81]) {
			    boolean bool
				= (Class14_Sub8_Sub35.method663
				   ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .anIntArray3476[0]),
				    0, 0, 0, (byte) 109,
				    (Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .anIntArray3443[0]),
				    true, 0, i_22_, 0, 0, i));
			    if (bool) {
				Class14_Sub2_Sub11.anInt3881 = 1;
				Class14_Sub8_Sub25.anInt4515
				    = Class139.anInt2230;
				Class14_Sub8_Sub9.anInt4243
				    = Class125_Sub1.anInt3367;
				Class14_Sub2_Sub17.anInt4017 = 0;
			    }
			} else
			    Class7_Sub2.method125((i_22_
						   + Class133_Sub6.anInt3676),
						  i + Class58.anInt947, 63,
						  Class14_Sub2_Sub3.anInt3785);
			Class66.anInt1039 = -1;
		    }
		    Class14_Sub18.method886((byte) -102);
		    if (Class125_Sub3.aClass94_3410 != class94) {
			if (null != class94)
			    Class103.method1531((byte) -88, class94);
			if (null != Class125_Sub3.aClass94_3410)
			    Class103.method1531((byte) -33,
						Class125_Sub3.aClass94_3410);
		    }
		    if (Class47.aClass94_784 != class94_15_
			&& ((Class14_Sub8_Sub39_Sub1.anInt5097 ^ 0xffffffff)
			    == (Class7_Sub3.anInt2683 ^ 0xffffffff))) {
			if (class94_15_ != null)
			    Class103.method1531((byte) -125, class94_15_);
			if (null != Class47.aClass94_784)
			    Class103.method1531((byte) -125,
						Class47.aClass94_784);
		    }
		    if (null == Class47.aClass94_784) {
			if (Class14_Sub8_Sub39_Sub1.anInt5097 > 0)
			    Class14_Sub8_Sub39_Sub1.anInt5097--;
		    } else if ((Class14_Sub8_Sub39_Sub1.anInt5097 ^ 0xffffffff)
			       > (Class7_Sub3.anInt2683 ^ 0xffffffff)) {
			Class14_Sub8_Sub39_Sub1.anInt5097++;
			if (Class7_Sub3.anInt2683
			    == Class14_Sub8_Sub39_Sub1.anInt5097)
			    Class103.method1531((byte) -68,
						Class47.aClass94_784);
		    }
		    if (-2 == (Class89.anInt1415 ^ 0xffffffff))
			Class85.method1415(arg0 ^ 0x2);
		    else if ((Class89.anInt1415 ^ 0xffffffff) != -3)
			Class14_Sub8_Sub7.method511(3);
		    else
			Class53.method1216(arg0 + 128);
		    for (int i = arg0; 5 > i; i++)
			Class14_Sub8_Sub15.anIntArray4336[i]++;
		    int i = Class14_Sub2.method244(107);
		    int i_23_ = Class46.method1172(arg0 ^ 0x3a);
		    if ((i ^ 0xffffffff) < -4501
			&& (i_23_ ^ 0xffffffff) < -4501) {
			Class141.anInt2249++;
			Class62.anInt990 = 250;
			Class14_Sub2.method245(4000, (byte) -42);
			Class55.aClass14_Sub10_Sub1_891.method843(0, 47);
		    }
		    Class9.anInt246++;
		    Class14_Sub8_Sub20.anInt4419++;
		    Class58.anInt949++;
		    if (-501 > (Class58.anInt949 ^ 0xffffffff)) {
			Class58.anInt949 = 0;
			int i_24_ = (int) (Math.random() * 8.0);
			if (-2 == (0x1 & i_24_ ^ 0xffffffff))
			    Class7_Sub1.anInt2655 += Class116.anInt1929;
			if ((i_24_ & 0x4 ^ 0xffffffff) == -5)
			    Class142.anInt2307 += Class14_Sub8_Sub8.anInt4217;
			if ((i_24_ & 0x2) == 2)
			    Class14_Sub8_Sub25.anInt4520 += Class97.anInt1652;
		    }
		    if (Class142.anInt2307 < -40)
			Class14_Sub8_Sub8.anInt4217 = 1;
		    if (Class14_Sub8_Sub25.anInt4520 < -55)
			Class97.anInt1652 = 2;
		    if (Class142.anInt2307 > 40)
			Class14_Sub8_Sub8.anInt4217 = -1;
		    if ((Class14_Sub8_Sub20.anInt4419 ^ 0xffffffff) < -501) {
			int i_25_ = (int) (8.0 * Math.random());
			Class14_Sub8_Sub20.anInt4419 = 0;
			if ((i_25_ & 0x1 ^ 0xffffffff) == -2)
			    Class41.anInt696 += Class76.anInt1207;
			if ((0x2 & i_25_ ^ 0xffffffff) == -3)
			    Class32.anInt551 += Canvas_Sub1.anInt43;
		    }
		    if (Class41.anInt696 < -60)
			Class76.anInt1207 = 2;
		    if ((Class41.anInt696 ^ 0xffffffff) < -61)
			Class76.anInt1207 = -2;
		    if (-50 > Class7_Sub1.anInt2655)
			Class116.anInt1929 = 2;
		    if ((Class7_Sub1.anInt2655 ^ 0xffffffff) < -51)
			Class116.anInt1929 = -2;
		    if (-20 > Class32.anInt551)
			Canvas_Sub1.anInt43 = 1;
		    if (55 < Class14_Sub8_Sub25.anInt4520)
			Class97.anInt1652 = -2;
		    if ((Class32.anInt551 ^ 0xffffffff) < -11)
			Canvas_Sub1.anInt43 = -1;
		    if (50 < Class9.anInt246) {
			Class32.anInt571++;
			Class55.aClass14_Sub10_Sub1_891.method843(0, 115);
		    }
		    Class86.method1420(104);
		    try {
			if (Class14_Sub15.aClass36_2990 != null
			    && 0 < Class55.aClass14_Sub10_Sub1_891.anInt2908) {
			    Class14_Sub15.aClass36_2990.method1100
				(0, arg0 ^ 0x3,
				 Class55.aClass14_Sub10_Sub1_891.anInt2908,
				 (Class55.aClass14_Sub10_Sub1_891
				  .aByteArray2895));
			    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
			    Class9.anInt246 = 0;
			}
		    } catch (IOException ioexception) {
			Class99_Sub2.method1508((byte) 112);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_248_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fk.B(" + arg0 + ')');
	} while (false);
    }
    
    public static void method461(int arg0) {
	try {
	    anIntArrayArray2799 = null;
	    aClass124_2796 = null;
	    aClass9_2792 = null;
	    if (arg0 > -38)
		anIntArrayArray2799 = null;
	    aClass124_2804 = null;
	    aClass124_2802 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fk.C(" + arg0 + ')');
	}
    }
    
    public static void method462(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    anInt2793++;
	    long l = Class2.method79(arg3, arg0, arg2);
	    if (l != 0L) {
		int i = (0x3f4c3e & (int) l) >> 474562228;
		int i_26_ = arg1;
		int i_27_ = (0x7fb8f & (int) l) >> -404487634;
		int i_28_ = 4 * arg0 + 24624 - -(4 * (-(arg2 * 512) + 52736));
		int[] is = Class92.anIntArray1437;
		if (0L < l)
		    i_26_ = arg5;
		int i_29_ = (int) (l >>> -361241824) & 0x7fffffff;
		Class79 class79 = Class79.method1377((byte) -106, i_29_);
		if ((class79.anInt1281 ^ 0xffffffff) != 0) {
		    Class148_Sub1 class148_sub1 = null;
		    if (!class79.aBoolean1264)
			class148_sub1 = (Class97.aClass148_Sub1Array1651
					 [class79.anInt1281]);
		    else if (i == 0)
			class148_sub1 = (Class97.aClass148_Sub1Array1651
					 [class79.anInt1281]);
		    else if (-2 != (i ^ 0xffffffff)) {
			if (-3 != (i ^ 0xffffffff)) {
			    if (-4 == (i ^ 0xffffffff))
				class148_sub1 = (Class133_Sub1_Sub1
						 .aClass148_Sub1Array4938
						 [class79.anInt1281]);
			} else
			    class148_sub1
				= (Class14_Sub29.aClass148_Sub1Array3265
				   [class79.anInt1281]);
		    } else
			class148_sub1 = (Class32.aClass148_Sub1Array540
					 [class79.anInt1281]);
		    if (null != class148_sub1) {
			int i_30_ = ((-class148_sub1.anInt2376
				      + 4 * class79.anInt1245)
				     / 2);
			int i_31_ = ((-class148_sub1.anInt2371
				      + 4 * class79.anInt1227)
				     / 2);
			class148_sub1.method2001(arg0 * 4 + 48 + i_31_,
						 (i_30_
						  + (4 * (-class79.anInt1245
							  + -arg2 + 104)
						     + 48)));
		    }
		} else {
		    if (i_27_ == 0 || (i_27_ ^ 0xffffffff) == -3) {
			if (i != 0) {
			    if ((i ^ 0xffffffff) == -2) {
				is[i_28_] = i_26_;
				is[1 + i_28_] = i_26_;
				is[2 + i_28_] = i_26_;
				is[3 + i_28_] = i_26_;
			    } else if (2 != i) {
				if (i == 3) {
				    is[1536 + i_28_] = i_26_;
				    is[1537 + i_28_] = i_26_;
				    is[2 + (i_28_ + 1536)] = i_26_;
				    is[3 + i_28_ - -1536] = i_26_;
				}
			    } else {
				is[3 + i_28_] = i_26_;
				is[512 + i_28_ + 3] = i_26_;
				is[3 + (i_28_ + 1024)] = i_26_;
				is[3 + i_28_ + 1536] = i_26_;
			    }
			} else {
			    is[i_28_] = i_26_;
			    is[512 + i_28_] = i_26_;
			    is[1024 + i_28_] = i_26_;
			    is[1536 + i_28_] = i_26_;
			}
		    }
		    if (-4 == (i_27_ ^ 0xffffffff)) {
			if (i == 0)
			    is[i_28_] = i_26_;
			else if (-2 != (i ^ 0xffffffff)) {
			    if (2 != i) {
				if (3 == i)
				    is[i_28_ + 1536] = i_26_;
			    } else
				is[1536 + (i_28_ - -3)] = i_26_;
			} else
			    is[3 + i_28_] = i_26_;
		    }
		    if (-3 == (i_27_ ^ 0xffffffff)) {
			if (-4 != (i ^ 0xffffffff)) {
			    if (i != 0) {
				if (1 != i) {
				    if ((i ^ 0xffffffff) == -3) {
					is[i_28_ + 1536] = i_26_;
					is[i_28_ + 1537] = i_26_;
					is[1536 + (i_28_ - -2)] = i_26_;
					is[3 + (1536 + i_28_)] = i_26_;
				    }
				} else {
				    is[3 + i_28_] = i_26_;
				    is[512 + i_28_ + 3] = i_26_;
				    is[i_28_ - -3 + 1024] = i_26_;
				    is[1539 + i_28_] = i_26_;
				}
			    } else {
				is[i_28_] = i_26_;
				is[i_28_ - -1] = i_26_;
				is[2 + i_28_] = i_26_;
				is[3 + i_28_] = i_26_;
			    }
			} else {
			    is[i_28_] = i_26_;
			    is[512 + i_28_] = i_26_;
			    is[1024 + i_28_] = i_26_;
			    is[i_28_ + 1536] = i_26_;
			}
		    }
		}
	    }
	    l = Class14_Sub8_Sub38.method675(arg3, arg0, arg2);
	    if (-1L != (l ^ 0xffffffffffffffffL)) {
		int i = ((int) l & 0x399f49) >> 2055205620;
		int i_32_ = (0x7c105 & (int) l) >> -332382130;
		int i_33_ = 0x7fffffff & (int) (l >>> 1247291680);
		Class79 class79 = Class79.method1377((byte) -106, i_33_);
		if (class79.anInt1281 == -1) {
		    if (i_32_ == 9) {
			int i_34_ = 15658734;
			int[] is = Class92.anIntArray1437;
			if (l > 0L)
			    i_34_ = 15597568;
			int i_35_
			    = 4 * arg0 + (24624 - -(4 * (-arg2 + 103) * 512));
			if (0 == i || -3 == (i ^ 0xffffffff)) {
			    is[i_35_ + 1536] = i_34_;
			    is[1 + (i_35_ - -1024)] = i_34_;
			    is[514 + i_35_] = i_34_;
			    is[i_35_ + 3] = i_34_;
			} else {
			    is[i_35_] = i_34_;
			    is[1 + (i_35_ + 512)] = i_34_;
			    is[i_35_ + 1024 + 2] = i_34_;
			    is[i_35_ - -1539] = i_34_;
			}
		    }
		} else {
		    Class148_Sub1 class148_sub1 = null;
		    if (!class79.aBoolean1264)
			class148_sub1 = (Class97.aClass148_Sub1Array1651
					 [class79.anInt1281]);
		    else if (i == 0)
			class148_sub1 = (Class97.aClass148_Sub1Array1651
					 [class79.anInt1281]);
		    else if (i != 1) {
			if (2 == i)
			    class148_sub1
				= (Class14_Sub29.aClass148_Sub1Array3265
				   [class79.anInt1281]);
			else if ((i ^ 0xffffffff) == -4)
			    class148_sub1
				= (Class133_Sub1_Sub1.aClass148_Sub1Array4938
				   [class79.anInt1281]);
		    } else
			class148_sub1 = (Class32.aClass148_Sub1Array540
					 [class79.anInt1281]);
		    if (null != class148_sub1) {
			int i_36_ = ((4 * class79.anInt1227
				      + -class148_sub1.anInt2371)
				     / 2);
			int i_37_ = ((-class148_sub1.anInt2376
				      + class79.anInt1245 * 4)
				     / 2);
			class148_sub1.method2001(i_36_ + (4 * arg0 + 48),
						 (4 * (-class79.anInt1245
						       + -arg2 + 104)
						  + (48 + i_37_)));
		    }
		}
	    }
	    l = Class14_Sub8_Sub19.method578(arg3, arg0, arg2);
	    if ((long) arg4 != l) {
		int i = 0x3 & (int) l >> -416448812;
		int i_38_ = 0x7fffffff & (int) (l >>> -994299040);
		Class79 class79 = Class79.method1377((byte) -106, i_38_);
		if (-1 != class79.anInt1281) {
		    Class148_Sub1 class148_sub1 = null;
		    if (class79.aBoolean1264) {
			if (-1 == (i ^ 0xffffffff))
			    class148_sub1 = (Class97.aClass148_Sub1Array1651
					     [class79.anInt1281]);
			else if ((i ^ 0xffffffff) != -2) {
			    if (-3 != (i ^ 0xffffffff)) {
				if (-4 == (i ^ 0xffffffff))
				    class148_sub1 = (Class133_Sub1_Sub1
						     .aClass148_Sub1Array4938
						     [class79.anInt1281]);
			    } else
				class148_sub1
				    = (Class14_Sub29.aClass148_Sub1Array3265
				       [class79.anInt1281]);
			} else
			    class148_sub1 = (Class32.aClass148_Sub1Array540
					     [class79.anInt1281]);
		    } else
			class148_sub1 = (Class97.aClass148_Sub1Array1651
					 [class79.anInt1281]);
		    if (class148_sub1 != null) {
			int i_39_ = ((-class148_sub1.anInt2371
				      + 4 * class79.anInt1227)
				     / 2);
			int i_40_ = ((-class148_sub1.anInt2376
				      + class79.anInt1245 * 4)
				     / 2);
			class148_sub1.method2001(48 - (-(4 * arg0) - i_39_),
						 (4 * (104 + -arg2
						       + -class79.anInt1245)
						  + 48 - -i_40_));
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fk.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public Class14_Sub5(int arg0, byte[] arg1) {
	try {
	    anInt2805 = arg0;
	    Class14_Sub10 class14_sub10 = new Class14_Sub10(arg1);
	    anInt2794 = class14_sub10.method798(-82);
	    anIntArrayArray2798 = new int[anInt2794][];
	    anIntArray2795 = new int[anInt2794];
	    aBooleanArray2791 = new boolean[anInt2794];
	    for (int i = 0; i < anInt2794; i++)
		anIntArray2795[i] = class14_sub10.method798(-31);
	    for (int i = 0; i < anInt2794; i++)
		aBooleanArray2791[i]
		    = (class14_sub10.method798(80) ^ 0xffffffff) == -2;
	    for (int i = 0; i < anInt2794; i++)
		anIntArrayArray2798[i] = new int[class14_sub10.method798(-85)];
	    for (int i = 0; (i ^ 0xffffffff) > (anInt2794 ^ 0xffffffff); i++) {
		for (int i_41_ = 0;
		     ((i_41_ ^ 0xffffffff)
		      > (anIntArrayArray2798[i].length ^ 0xffffffff));
		     i_41_++)
		    anIntArrayArray2798[i][i_41_]
			= class14_sub10.method798(-62);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fk.<init>(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anInt2797 = 0;
	aClass124_2802 = aClass124_2796;
	aClass124_2804 = Class14_Sub2_Sub2.method263(1178, "Standort");
    }
}
