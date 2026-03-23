/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;

import nativeadvert.browsercontrol;

public class client extends Applet_Sub1
{
    public static Class124 aClass124_2625;
    public static int anInt2626;
    public static int anInt2627;
    public static int anInt2628;
    public static int anInt2629;
    public static int anInt2630;
    public static Class124 aClass124_2631;
    public static int anInt2632;
    public static int anInt2633;
    public static int anInt2634;
    public static int anInt2635;
    public static Class124 aClass124_2636
	= Class14_Sub2_Sub2.method263(1178, "Loading )2 please wait)3");
    public static Class124 aClass124_2637
	= Class14_Sub2_Sub2.method263(1178, "Loaded textures");
    public static int anInt2638;
    public static Class124 aClass124_2639;
    public static int anInt2640;
    public static int anInt2641;
    public static int anInt2642;
    public static int anInt2643;
    public static int[] anIntArray2644;
    public static Class124[] aClass124Array2645;
    public static int anInt2646;
    public static int anInt2647;
    public static int anInt2648;
    public static int anInt2649;
    public static boolean aBoolean2650;
    
    public void method43(int arg0) {
    while_4_:
	do {
	try {
	while_3_:
	    do {
		do {
		    try {
			anInt2629++;
			if (4 > Class24.anInt465)
			    break;
			method28("js5crc", -1);
			Class14_Sub8_Sub16.anInt4356 = 1000;
		    } catch (RuntimeException runtimeexception) {
			break while_3_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if ((Class51.anInt829 ^ 0xffffffff) > -5)
			    break;
			if (-1 != (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)
			    && Class14_Sub8_Sub16.anInt4356 != 5) {
			    Class51.anInt829 = 3;
			    Class81.anInt1314 = 3000;
			    break;
			}
			method28("js5io", -1);
			Class14_Sub8_Sub16.anInt4356 = 1000;
		    } catch (RuntimeException runtimeexception) {
			break while_3_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-1 <= (Class81.anInt1314-- ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_3_;
		    }
		    return;
		} while (false);
	    while_2_:
		do {
		while_1_:
		    do {
		    while_0_:
			do {
			    do {
				try {
				    if (-1 == (Class14_Sub1.anInt2721
					       ^ 0xffffffff)) {
					Class81.aClass31_1328
					    = (Class14_Sub8_Sub34
						   .aClass43_4647.method1153
					       (0,
						Class14_Sub8_Sub31.aString4605,
						Class131.anInt2164));
					Class14_Sub1.anInt2721++;
				    }
				    if (Class14_Sub1.anInt2721 != 1)
					break while_0_;
				    if (-3 != (Class81.aClass31_1328.anInt529
					       ^ 0xffffffff))
					break;
				    method54(-1, (byte) -123);
				} catch (RuntimeException runtimeexception) {
				    break while_3_;
				}
				return;
			    } while (false);
			    try {
				if ((Class81.aClass31_1328.anInt529
				     ^ 0xffffffff)
				    == -2)
				    Class14_Sub1.anInt2721++;
			    } catch (RuntimeException runtimeexception) {
				break while_3_;
			    }
			} while (false);
			if (2 == Class14_Sub1.anInt2721) {
			    Class133_Sub1_Sub1.aClass36_4939
				= new Class36((Socket) (Class81.aClass31_1328
							.anObject530),
					      (Class14_Sub8_Sub34
					       .aClass43_4647));
			    Class14_Sub10 class14_sub10 = new Class14_Sub10(5);
			    class14_sub10.method809(false, 15);
			    class14_sub10.method803(508, 112);
			    Class133_Sub1_Sub1.aClass36_4939.method1100
				(0, 3, 5, class14_sub10.aByteArray2895);
			    Class14_Sub1.anInt2721++;
			    Class12.aLong282 = Class84.method1413((byte) 121);
			}
			if (arg0 > -99)
			    aClass124_2637 = null;
			if (-4 == (Class14_Sub1.anInt2721 ^ 0xffffffff)) {
			    if (-1 != (Class14_Sub8_Sub16.anInt4356
				       ^ 0xffffffff)
				&& 5 != Class14_Sub8_Sub16.anInt4356
				&& Class133_Sub1_Sub1.aClass36_4939
				       .method1104(24249) <= 0) {
				if (30000L < (Class84.method1413((byte) -100)
					      + -Class12.aLong282)) {
				    method54(-2, (byte) -120);
				    return;
				}
			    } else {
				do {
				    try {
					int i
					    = Class133_Sub1_Sub1
						  .aClass36_4939
						  .method1107((byte) 30);
					if (0 == i)
					    break;
					method54(i, (byte) -122);
				    } catch (IOException ioexception) {
					break while_1_;
				    } catch (RuntimeException runtimeexception) {
					break while_3_;
				    }
				    return;
				} while (false);
				try {
					Class14_Sub1.anInt2721++;
				} catch (RuntimeException runtimeexception) {
				    break while_3_;
				}
			    }
			}
			if ((Class14_Sub1.anInt2721 ^ 0xffffffff) == -5) {
			    boolean bool
				= (((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)
				    == -6)
				   || 10 == Class14_Sub8_Sub16.anInt4356
				   || 28 == Class14_Sub8_Sub16.anInt4356);
			    Class133.method1783((Class133_Sub1_Sub1
						 .aClass36_4939),
						(byte) 49, !bool);
			    Class81.aClass31_1328 = null;
			    Class125_Sub1.anInt3363 = 0;
			    Class133_Sub1_Sub1.aClass36_4939 = null;
			    Class14_Sub1.anInt2721 = 0;
			}
			break while_2_;
		    } while (false);
		    Object object;
		    method54(-3, (byte) -123);
		} while (false);
		break while_4_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.C(" + arg0 + ')');
		}
	} while (false);
    }
    
    public void method29(int arg0) {
    while_6_:
	do {
	try {
	while_5_:
	    do {
		do {
		    try {
			anInt2641++;
			if (-1001
			    != (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_5_;
		    }
		    return;
		} while (false);
		try {
		    boolean bool = Class113.method1581(0);
		    if (bool && Class14_Sub7.aBoolean2827
			&& null != Class14_Sub8_Sub35.aClass75_4682)
			Class14_Sub8_Sub35.aClass75_4682.method1344(true);
		    if (-31 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)
			|| ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)
			    == -11)) {
			if (Class54.aBoolean877)
			    Class14_Sub21.method897(120);
			else if (Class132.aLong2169 != 0L
				 && (Class132.aLong2169
				     < Class84.method1413((byte) -66)))
			    Class14_Sub21.method897(122);
		    }
		    if (-1L != (Class56_Sub1.aLong3317 ^ 0xffffffffffffffffL)
			&& ((Class56_Sub1.aLong3317 ^ 0xffffffffffffffffL)
			    > (Class84.method1413((byte) 122)
			       ^ 0xffffffffffffffffL))
			&& Class14_Sub15.aClass36_2990 != null
			&& ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == -31
			    || Class14_Sub8_Sub16.anInt4356 == 25))
			Class88.method1436((byte) -125);
		    if (null == Class14_Sub2_Sub15.aFrame3962) {
			Container container;
			if (Class14_Sub2_Sub15.aFrame3962 == null) {
			    if (null == Class14_Sub14.aFrame2986)
				container = (Class14_Sub8_Sub34.aClass43_4647
					     .anApplet712);
			    else
				container = Class14_Sub14.aFrame2986;
			} else
			    container = Class14_Sub2_Sub15.aFrame3962;
			int i = container.getSize().width;
			int i_0_ = container.getSize().height;
			if (container == Class14_Sub14.aFrame2986) {
			    Insets insets
				= Class14_Sub14.aFrame2986.getInsets();
			    i -= insets.right + insets.left;
			    i_0_ -= insets.top + insets.bottom;
			}
			if (Class14_Sub8_Sub32.anInt4622 != i
			    || Class14_Sub2_Sub21.anInt4086 != i_0_)
			    Class14_Sub8_Sub30.method643(500, (byte) -93);
		    }
		    if (Class14_Sub2_Sub15.aFrame3962 != null
			&& !Class83.aBoolean1342
			&& (Class14_Sub8_Sub16.anInt4356 == 30
			    || -11 == (Class14_Sub8_Sub16.anInt4356
				       ^ 0xffffffff)))
			Class14_Sub2_Sub20.method428(arg0 + -7);
		    if (arg0 != 1)
			method43(-81);
		    boolean bool_1_ = false;
		    if (Class141.aBoolean2244) {
			bool_1_ = true;
			Class141.aBoolean2244 = false;
		    }
		    if (bool_1_)
			Class132.method1779(0);
		    for (int i = 0; -101 < (i ^ 0xffffffff); i++)
			Class14_Sub8_Sub36.aBooleanArray4698[i] = true;
		    if (0 != Class14_Sub8_Sub16.anInt4356) {
			if (Class14_Sub8_Sub16.anInt4356 == 5)
			    Class14_Sub8_Sub27.method623
				(false,
				 Class133_Sub3.aClass14_Sub2_Sub16_3567);
			else if (Class14_Sub8_Sub16.anInt4356 != 10) {
			    if (Class14_Sub8_Sub16.anInt4356 != 25
				&& -29 != (Class14_Sub8_Sub16.anInt4356
					   ^ 0xffffffff)) {
				if (Class14_Sub8_Sub16.anInt4356 != 30) {
				    if (-41 == (Class14_Sub8_Sub16.anInt4356
						^ 0xffffffff))
					Class84.method1411
					    (false,
					     (Class14_Sub8_Sub7.method515
					      ((new Class124[]
						{ (RuntimeException_Sub1
						   .aClass124_2462),
						  Class14_Sub6.aClass124_2807,
						  Class56.aClass124_923 }),
					       (byte) -15)),
					     true);
				} else
				    Class14_Sub8_Sub8.method516((byte) -107);
			    } else if ((Class14_Sub18.anInt3064 ^ 0xffffffff)
				       != -2) {
				if (Class14_Sub18.anInt3064 != 2)
				    Class84.method1411(false, aClass124_2639,
						       true);
				else {
				    if (Class149.anInt2383
					> Class14_Sub8_Sub28.anInt4560)
					Class14_Sub8_Sub28.anInt4560
					    = Class149.anInt2383;
				    int i = 50 - -(50
						   * (-Class149.anInt2383
						      + (Class14_Sub8_Sub28
							 .anInt4560))
						   / (Class14_Sub8_Sub28
						      .anInt4560));
				    Class84.method1411
					(false, (Class14_Sub8_Sub7.method515
						 ((new Class124[]
						   { aClass124_2639,
						     Class122.aClass124_2053,
						     Class83.method1407(99, i),
						     (Class14_Sub2_Sub19
						      .aClass124_4051) }),
						  (byte) -59)), true);
				}
			    } else {
				if ((anInt2648 ^ 0xffffffff)
				    < (Class14_Sub2_Sub1.anInt3732
				       ^ 0xffffffff))
				    Class14_Sub2_Sub1.anInt3732 = anInt2648;
				int i = ((Class14_Sub2_Sub1.anInt3732
					  + -anInt2648)
					 * 50 / Class14_Sub2_Sub1.anInt3732);
				Class84.method1411
				    (false,
				     (Class14_Sub8_Sub7.method515
				      ((new Class124[]
					{ aClass124_2639,
					  Class122.aClass124_2053,
					  Class83.method1407(arg0 + 45, i),
					  Class14_Sub2_Sub19.aClass124_4051 }),
				       (byte) -10)),
				     true);
			    }
			} else
			    Class70.method1313(-11198);
		    } else
			Class22.method984(Class51.anInt828, -1644, bool_1_,
					  null,
					  Class14_Sub9_Sub1.aClass124_4761);
		    if (0 != Class14_Sub8_Sub16.anInt4356) {
			Class121.method1657();
			for (int i = 0; Class14_Sub17.anInt3012 > i; i++)
			    Class7_Sub2_Sub1.aBooleanArray3703[i] = false;
		    } else if ((-31 == (Class14_Sub8_Sub16.anInt4356
					^ 0xffffffff)
				|| Class14_Sub8_Sub16.anInt4356 == 10)
			       && -1 == (Class124.anInt2494 ^ 0xffffffff)
			       && !bool_1_) {
			try {
			    Graphics graphics
				= Class49.aCanvas819.getGraphics();
			    for (int i = 0; Class14_Sub17.anInt3012 > i; i++) {
				if (Class7_Sub2_Sub1.aBooleanArray3703[i]) {
				    Class122.aClass108_2059.method1560
					(Class74.anIntArray1135[i],
					 (byte) -128,
					 Class110.anIntArray1854[i],
					 Class137.anIntArray2205[i], graphics,
					 Class9.anIntArray215[i]);
				    Class7_Sub2_Sub1.aBooleanArray3703[i]
					= false;
				}
			    }
			} catch (Exception exception) {
			    Class49.aCanvas819.repaint();
			}
		    } else if (0 != Class14_Sub8_Sub16.anInt4356) {
			try {
			    Graphics graphics
				= Class49.aCanvas819.getGraphics();
			    Class122.aClass108_2059.method1558(0, (byte) 29,
							       graphics, 0);
			    for (int i = 0;
				 ((i ^ 0xffffffff)
				  > (Class14_Sub17.anInt3012 ^ 0xffffffff));
				 i++)
				Class7_Sub2_Sub1.aBooleanArray3703[i] = false;
			} catch (Exception exception) {
			    Class49.aCanvas819.repaint();
			}
		    }
		    if (Class65.aBoolean1026)
			Class14_Sub8_Sub27.method621((byte) -55);
		    if (browsercontrol.iscreated()
			&& (Class14_Sub13.anInt2964 ^ 0xffffffff) != -1) {
			try {
			    Point point
				= Class49.aCanvas819.getLocationOnScreen();
			    Dimension dimension = Class49.aCanvas819.getSize();
			    browsercontrol.set_position
				(point.x, -Class14_Sub13.anInt2964 + point.y,
				 dimension.width, Class14_Sub13.anInt2964);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_6_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.A(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static int method44(boolean arg0, int arg1) {
	int anInt = 0;
	try {
    while_7_:
	do {
	    long l;
	    do {
		try {
		    l = Class84.method1413((byte) -30);
		    anInt2634++;
		    if (arg1 == -1)
			break;
		    anInt = -126;
		} catch (RuntimeException runtimeexception) {
		    break while_7_;
		}
		return anInt;
	    } while (false);
	    Class14_Sub13 class14_sub13;
	    try {
		class14_sub13
		    = (!arg0
		       ? ((Class14_Sub13)
			  Class2.aClass55_92.method1227((byte) -23))
		       : ((Class14_Sub13)
			  Class2.aClass55_92.method1228((byte) -85)));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (null != class14_sub13) {
		if ((0x3fffffffffffffffL & class14_sub13.aLong2963
		     ^ 0xffffffffffffffffL)
		    > (l ^ 0xffffffffffffffffL)) {
		    if (0L == (0x4000000000000000L & class14_sub13.aLong2963))
			class14_sub13.method233(0);
		    else {
			int i = (int) class14_sub13.aLong355;
			Class14_Sub8_Sub11.anIntArray4275[i]
			    = Class14_Sub9_Sub3.anIntArray4851[i];
			class14_sub13.method233(0);
			return i;
		    }
		}
		try {
		    class14_sub13
			= ((Class14_Sub13)
			   Class2.aClass55_92.method1227((byte) -23));
		} catch (RuntimeException runtimeexception) {
		    break while_7_;
		}
	    }
	    return -1;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14
		  .method554(throwable, "client.O(" + arg0 + ',' + arg1 + ')');
	}
	return anInt;
    }
    
    public static void method45(int arg0, int arg1, int arg2, Class94 arg3) {
	try {
	    if ((arg3.anInt1572 ^ 0xffffffff) == -2) {
		Class14_Sub11.method853(32, arg3.aClass124_1556,
					arg3.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244,
					(short) 22, 0L, 0);
		Class14_Sub8_Sub7.anInt4208++;
	    }
	    anInt2635++;
	    if (-3 == (arg3.anInt1572 ^ 0xffffffff)
		&& !Class14_Sub4.aBoolean2784) {
		Class124 class124 = Class54.method1217(arg3, -109);
		if (null != class124) {
		    Class14_Sub11.method853
			(32, class124, arg3.anInt1548,
			 Class14_Sub8_Sub7.method515((new Class124[]
						      { (Class14_Sub8_Sub2
							 .aClass124_4116),
							arg3.aClass124_1483 }),
						     (byte) -116),
			 (short) 48, 0L, -1);
		    Class14_Sub2_Sub15.anInt3954++;
		}
	    }
	    if (3 == arg3.anInt1572) {
		Class24.anInt466++;
		Class14_Sub11.method853(32, Class133_Sub5.aClass124_3610,
					arg3.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244,
					(short) 7, 0L, 0);
	    }
	    if (-5 == (arg3.anInt1572 ^ 0xffffffff)) {
		Class14_Sub11.method853(arg0 + 32, arg3.aClass124_1556,
					arg3.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244,
					(short) 15, 0L, 0);
		Class99_Sub2.anInt3344++;
	    }
	    if (-6 == (arg3.anInt1572 ^ 0xffffffff)) {
		Class14_Sub11.method853(32, arg3.aClass124_1556,
					arg3.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244,
					(short) 40, 0L, 0);
		Class128.anInt2121++;
	    }
	    if (-7 == (arg3.anInt1572 ^ 0xffffffff)
		&& null == Class125_Sub2.aClass94_3388) {
		Class66.anInt1045++;
		Class14_Sub11.method853(arg0 + 32, arg3.aClass124_1556,
					arg3.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244,
					(short) 4, 0L, -1);
	    }
	    if (2 == arg3.anInt1489) {
		int i = 0;
		for (int i_2_ = 0; i_2_ < arg3.anInt1488; i_2_++) {
		    for (int i_3_ = 0;
			 (i_3_ ^ 0xffffffff) > (arg3.anInt1485 ^ 0xffffffff);
			 i_3_++) {
			int i_4_ = i_3_ * (32 + arg3.anInt1454);
			int i_5_ = (32 + arg3.anInt1613) * i_2_;
			if ((i ^ 0xffffffff) > -21) {
			    i_5_ += arg3.anIntArray1510[i];
			    i_4_ += arg3.anIntArray1559[i];
			}
			if (i_4_ <= arg2
			    && (arg1 ^ 0xffffffff) <= (i_5_ ^ 0xffffffff)
			    && arg2 < 32 + i_4_
			    && (arg1 ^ 0xffffffff) > (i_5_ + 32
						      ^ 0xffffffff)) {
			    Class14_Sub8_Sub31.anInt4601 = i;
			    Class141.aClass94_2239 = arg3;
			    if (-1 > (arg3.anIntArray1452[i] ^ 0xffffffff)) {
				Class142 class142
				    = (Class14_Sub8_Sub24.method605
				       (62, -1 + arg3.anIntArray1452[i]));
				if ((Class51.anInt831 ^ 0xffffffff) != -2
				    || !Class14_Sub2_Sub5
					    .method282(method46(arg3), -1)) {
				    if (Class14_Sub4.aBoolean2784
					&& (Class14_Sub2_Sub5.method282
					    (method46(arg3),
					     arg0 ^ 0xffffffff))) {
					if (16 == (Class2.anInt101 & 0x10)) {
					    Class14_Sub11.method853
						(32, Class125.aClass124_2082,
						 arg3.anInt1548,
						 (Class14_Sub8_Sub7.method515
						  ((new Class124[]
						    { Class17.aClass124_408,
						      (Class14_Sub25
						       .aClass124_3172),
						      (class142
						       .aClass124_2296) }),
						   (byte) -67)),
						 (short) 36,
						 (long) class142.anInt2276, i);
					    Class56.anInt920++;
					}
				    } else {
					Class124[] class124s
					    = class142.aClass124Array2304;
					if (Class49.aBoolean814)
					    class124s = (Class106.method1545
							 (5, class124s));
					if (Class14_Sub2_Sub5.method282
					    (method46(arg3),
					     arg0 ^ 0xffffffff)) {
					    for (int i_6_ = 4;
						 -4 >= (i_6_ ^ 0xffffffff);
						 i_6_--) {
						if (class124s == null
						    || (class124s[i_6_]
							== null)) {
						    if ((i_6_ ^ 0xffffffff)
							== -5) {
							Class103.anInt1731++;
							Class14_Sub11.method853
							    (32,
							     (Class14_Sub8_Sub2
							      .aClass124_4118),
							     arg3.anInt1548,
							     (Class14_Sub8_Sub7
								  .method515
							      ((new Class124[]
								{ (Class14_Sub8_Sub1
								   .aClass124_4101),
								  (class142
								   .aClass124_2296) }),
							       (byte) -8)),
							     (short) 28,
							     (long) (class142
								     .anInt2276),
							     i);
						    }
						} else {
						    short i_7_;
						    if (i_6_ == 3)
							i_7_ = (short) 26;
						    else
							i_7_ = (short) 28;
						    Class14_Sub11.method853
							(arg0 + 32,
							 class124s[i_6_],
							 arg3.anInt1548,
							 (Class14_Sub8_Sub7
							      .method515
							  ((new Class124[]
							    { (Class14_Sub8_Sub1
							       .aClass124_4101),
							      (class142
							       .aClass124_2296) }),
							   (byte) -86)),
							 i_7_,
							 (long) (class142
								 .anInt2276),
							 i);
						    Class14_Sub1.anInt2710++;
						}
					    }
					}
					if (Class81.method1396
					    (-124, method46(arg3))) {
					    Class14_Sub11.method853
						(32, Class40.aClass124_665,
						 arg3.anInt1548,
						 (Class14_Sub8_Sub7.method515
						  ((new Class124[]
						    { (Class14_Sub8_Sub1
						       .aClass124_4101),
						      (class142
						       .aClass124_2296) }),
						   (byte) -2)),
						 (short) 25,
						 (long) class142.anInt2276, i);
					    Canvas_Sub1.anInt44++;
					}
					Class14_Sub7.anInt2826++;
					if (Class14_Sub2_Sub5
						.method282(method46(arg3), -1)
					    && null != class124s) {
					    for (int i_8_ = 2;
						 (i_8_ ^ 0xffffffff) <= -1;
						 i_8_--) {
						if (null != class124s[i_8_]) {
						    Class125_Sub4.anInt3422++;
						    short i_9_ = 0;
						    if ((i_8_ ^ 0xffffffff)
							== -1)
							i_9_ = (short) 29;
						    if (1 == i_8_)
							i_9_ = (short) 12;
						    if (i_8_ == 2)
							i_9_ = (short) 44;
						    Class14_Sub11.method853
							(32, class124s[i_8_],
							 arg3.anInt1548,
							 (Class14_Sub8_Sub7
							      .method515
							  ((new Class124[]
							    { (Class14_Sub8_Sub1
							       .aClass124_4101),
							      (class142
							       .aClass124_2296) }),
							   (byte) -52)),
							 i_9_,
							 (long) (class142
								 .anInt2276),
							 i);
						}
					    }
					}
					class124s = arg3.aClass124Array1479;
					if (Class49.aBoolean814)
					    class124s = (Class106.method1545
							 (5, class124s));
					if (class124s != null) {
					    for (int i_10_ = 4; 0 <= i_10_;
						 i_10_--) {
						if (class124s[i_10_] != null) {
						    Class98.anInt1668++;
						    short i_11_ = 0;
						    if ((i_10_ ^ 0xffffffff)
							== -1)
							i_11_ = (short) 57;
						    if ((i_10_ ^ 0xffffffff)
							== -2)
							i_11_ = (short) 42;
						    if (i_10_ == 2)
							i_11_ = (short) 5;
						    if (i_10_ == 3)
							i_11_ = (short) 35;
						    if (4 == i_10_)
							i_11_ = (short) 58;
						    Class14_Sub11.method853
							(32, class124s[i_10_],
							 arg3.anInt1548,
							 (Class14_Sub8_Sub7
							      .method515
							  ((new Class124[]
							    { (Class14_Sub8_Sub1
							       .aClass124_4101),
							      (class142
							       .aClass124_2296) }),
							   (byte) -46)),
							 i_11_,
							 (long) (class142
								 .anInt2276),
							 i);
						}
					    }
					}
					Class14_Sub11.method853
					    (32, Class14_Sub5.aClass124_2802,
					     arg3.anInt1548,
					     (Class14_Sub8_Sub7.method515
					      ((new Class124[]
						{ (Class14_Sub8_Sub1
						   .aClass124_4101),
						  class142.aClass124_2296 }),
					       (byte) -105)),
					     (short) 1001,
					     (long) class142.anInt2276, i);
				    }
				} else if ((arg3.anInt1548
					    != Class14_Sub2_Sub15.anInt3960)
					   || Class14_Sub8.anInt2853 != i) {
				    Class14_Sub11.method853
					(32, Class40.aClass124_665,
					 arg3.anInt1548,
					 (Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { Class14_Sub6.aClass124_2809,
					      Class14_Sub25.aClass124_3172,
					      class142.aClass124_2296 }),
					   (byte) -50)),
					 (short) 32, (long) class142.anInt2276,
					 i);
				    Class14_Sub18.anInt3055++;
				}
			    }
			}
			i++;
		    }
		}
	    }
	    if (arg0 != 0)
		method44(true, 36);
	    if (arg3.aBoolean1455) {
		if (!Class14_Sub4.aBoolean2784) {
		    for (int i = 9; i >= 5; i--) {
			Class124 class124
			    = Class82.method1405((byte) -89, arg3, i);
			if (class124 != null) {
			    Class14_Sub11.method853(32, class124,
						    arg3.anInt1548,
						    arg3.aClass124_1508,
						    (short) 1007,
						    (long) (i + 1),
						    arg3.anInt1478);
			    Class125_Sub3.anInt3411++;
			}
		    }
		    Class124 class124 = Class54.method1217(arg3, -99);
		    if (null != class124) {
			Class14_Sub11.method853(32, class124, arg3.anInt1548,
						arg3.aClass124_1508,
						(short) 48, 0L,
						arg3.anInt1478);
			Class14_Sub2_Sub15.anInt3954++;
		    }
		    for (int i = 4; -1 >= (i ^ 0xffffffff); i--) {
			Class124 class124_12_
			    = Class82.method1405((byte) 124, arg3, i);
			if (class124_12_ != null) {
			    Class125_Sub3.anInt3411++;
			    Class14_Sub11.method853(32, class124_12_,
						    arg3.anInt1548,
						    arg3.aClass124_1508,
						    (short) 1, (long) (i + 1),
						    arg3.anInt1478);
			}
		    }
		    if (Class14_Sub8_Sub39.method682(65280, method46(arg3))) {
			Class14_Sub11.method853(32, Class106.aClass124_1781,
						arg3.anInt1548,
						(Class14_Sub8_Sub9
						 .aClass124_4244),
						(short) 4, 0L, arg3.anInt1478);
			Class66.anInt1045++;
		    }
		} else if (Class36.method1105((byte) -105, method46(arg3))
			   && (Class2.anInt101 & 0x20 ^ 0xffffffff) == -33) {
		    Class14_Sub11.method853
			(arg0 + 32, Class125.aClass124_2082, arg3.anInt1548,
			 Class14_Sub8_Sub7.method515((new Class124[]
						      { Class17.aClass124_408,
							Class54.aClass124_886,
							arg3.aClass124_1508 }),
						     (byte) -59),
			 (short) 43, 0L, arg3.anInt1478);
		    Class133_Sub5.anInt3619++;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("client.M(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static int method46(Class94 arg0) {
	Class14_Sub1 class14_sub1
	    = ((Class14_Sub1)
	       (Class14_Sub8_Sub5.aClass55_4155.method1230
		(((long) arg0.anInt1548 << 32) + (long) arg0.anInt1478,
		 (byte) -18)));
	if (class14_sub1 != null)
	    return class14_sub1.anInt2714;
	return arg0.anInt1565;
    }
    
    public void method47(byte arg0) {
    while_18_:
	do {
	try {
	while_17_:
	    do {
	    while_8_:
		do {
		    do {
			try {
			    anInt2640++;
			    if (0 != Class62.anInt988)
				break while_8_;
			    Runtime runtime = Runtime.getRuntime();
			    int i = (int) ((runtime.totalMemory()
					    + -runtime.freeMemory())
					   / 1024L);
			    long l = Class84.method1413((byte) -104);
			    if ((Class64.aLong1014 ^ 0xffffffffffffffffL)
				== -1L)
				Class64.aLong1014 = l;
			    if (-16385 <= (i ^ 0xffffffff)
				|| (l - Class64.aLong1014
				    ^ 0xffffffffffffffffL) <= -5001L)
				break;
			    if (1000L < l - Class17.aLong410) {
				System.gc();
				Class17.aLong410 = l;
			    }
			    Class51.anInt828 = 5;
			    Class14_Sub9_Sub1.aClass124_4761
				= Class2.aClass124_94;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub8_Sub36.aClass124_4702;
			Class51.anInt828 = 5;
			Class62.anInt988 = 10;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (Class62.anInt988 != 10)
			    break;
			Class66.method1296(4, 104, 104, 28);
			Class10.method189(4, 104, 104);
			for (int i = 0; (i ^ 0xffffffff) > -5; i++)
			    Class14_Sub21.aClass32Array3100[i]
				= new Class32(104, 104);
			Class62.anInt988 = 30;
			Class51.anInt828 = 10;
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub8_Sub25.aClass124_4511;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (30 != Class62.anInt988)
			    break;
			Class75.aClass9_Sub1_1167
			    = method51(true, 0, (byte) 10, true, false);
			Class109.aClass9_Sub1_1834
			    = method51(true, 1, (byte) -111, true, false);
			Class138.aClass9_Sub1_2222
			    = method51(false, 2, (byte) -102, true, true);
			Class14_Sub17.aClass9_Sub1_3021
			    = method51(true, 3, (byte) 98, true, false);
			Class14_Sub10.aClass9_Sub1_2901
			    = method51(true, 4, (byte) -121, true, false);
			Class14_Sub13.aClass9_Sub1_2958
			    = method51(true, 5, (byte) 20, true, true);
			Class125_Sub2.aClass9_Sub1_3374
			    = method51(true, 6, (byte) -127, false, true);
			Class14_Sub8_Sub38.aClass9_Sub1_4739
			    = method51(true, 7, (byte) 61, true, false);
			Class14_Sub3.aClass9_Sub1_2750
			    = method51(true, 8, (byte) -104, true, false);
			Class98.aClass9_Sub1_1666
			    = method51(true, 9, (byte) 119, true, false);
			Class14_Sub8_Sub14.aClass9_Sub1_4323
			    = method51(true, 10, (byte) -84, true, false);
			Class14_Sub8_Sub31.aClass9_Sub1_4603
			    = method51(true, 11, (byte) 76, true, false);
			Class14_Sub8_Sub26.aClass9_Sub1_4521
			    = method51(true, 12, (byte) 9, true, false);
			Class64.aClass9_Sub1_1015
			    = method51(true, 13, (byte) 69, true, false);
			Class14_Sub2_Sub18_Sub2.aClass9_Sub1_5085
			    = method51(true, 14, (byte) -89, false, false);
			Class47.aClass9_Sub1_790
			    = method51(true, 15, (byte) 58, true, false);
			Class89.aClass9_Sub1_1407
			    = method51(true, 16, (byte) -117, true, false);
			Class14.aClass9_Sub1_369
			    = method51(true, 17, (byte) -78, true, false);
			Class102.aClass9_Sub1_1712
			    = method51(true, 18, (byte) -76, true, false);
			Class127.aClass9_Sub1_2111
			    = method51(true, 19, (byte) -83, true, false);
			Class22.aClass9_Sub1_459
			    = method51(true, 20, (byte) 126, true, false);
			Class100.aClass9_Sub1_1690
			    = method51(true, 21, (byte) -99, true, false);
			Class14_Sub8.aClass9_Sub1_2848
			    = method51(true, 22, (byte) 22, true, false);
			Class7_Sub1.aClass9_Sub1_2657
			    = method51(true, 23, (byte) -127, true, true);
			Class14_Sub21.aClass9_Sub1_3111
			    = method51(true, 24, (byte) -128, true, false);
			Class28.aClass9_Sub1_513
			    = method51(true, 25, (byte) 73, true, false);
			Class14_Sub2_Sub7.aClass9_Sub1_3824
			    = method51(true, 26, (byte) -85, true, true);
			Class51.anInt828 = 15;
			Class62.anInt988 = 40;
			Class14_Sub9_Sub1.aClass124_4761
			    = Class100.aClass124_1693;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_9_:
		do {
		    do {
			try {
			    if (40 != Class62.anInt988)
				break while_9_;
			    int i = 0;
			    i += Class75.aClass9_Sub1_1167
				     .method186((byte) 91) * 4 / 100;
			    i += 4 * Class109.aClass9_Sub1_1834
					 .method186((byte) 65) / 100;
			    i += Class138.aClass9_Sub1_2222
				     .method186((byte) 119) * 1 / 100;
			    i += Class14_Sub17.aClass9_Sub1_3021
				     .method186((byte) 75) * 2 / 100;
			    i += Class14_Sub10.aClass9_Sub1_2901
				     .method186((byte) 61) * 6 / 100;
			    i += 4 * Class14_Sub13.aClass9_Sub1_2958
					 .method186((byte) 93) / 100;
			    i += Class125_Sub2.aClass9_Sub1_3374
				     .method186((byte) 103) * 2 / 100;
			    i += Class14_Sub8_Sub38.aClass9_Sub1_4739
				     .method186((byte) 106) * 50 / 100;
			    i += Class14_Sub3.aClass9_Sub1_2750
				     .method186((byte) 100) * 2 / 100;
			    i += 2 * Class98.aClass9_Sub1_1666
					 .method186((byte) 99) / 100;
			    i += Class14_Sub8_Sub14.aClass9_Sub1_4323
				     .method186((byte) 76) * 2 / 100;
			    i += Class14_Sub8_Sub31.aClass9_Sub1_4603
				     .method186((byte) 108) * 2 / 100;
			    i += 2 * Class14_Sub8_Sub26.aClass9_Sub1_4521
					 .method186((byte) 72) / 100;
			    i += Class64.aClass9_Sub1_1015
				     .method186((byte) 113) * 2 / 100;
			    i += 2 * Class14_Sub2_Sub18_Sub2
					 .aClass9_Sub1_5085
					 .method186((byte) 85) / 100;
			    i += 2 * Class47.aClass9_Sub1_790
					 .method186((byte) 111) / 100;
			    i += Class89.aClass9_Sub1_1407
				     .method186((byte) 104) * 1 / 100;
			    i += 1 * Class14.aClass9_Sub1_369
					 .method186((byte) 104) / 100;
			    i += Class102.aClass9_Sub1_1712
				     .method186((byte) 68) * 1 / 100;
			    i += 1 * Class127.aClass9_Sub1_2111
					 .method186((byte) 109) / 100;
			    i += 1 * Class22.aClass9_Sub1_459
					 .method186((byte) 96) / 100;
			    i += Class100.aClass9_Sub1_1690
				     .method186((byte) 97) * 1 / 100;
			    i += Class14_Sub8.aClass9_Sub1_2848
				     .method186((byte) 90) * 1 / 100;
			    i += 1 * Class7_Sub1.aClass9_Sub1_2657
					 .method186((byte) 95) / 100;
			    i += Class14_Sub21.aClass9_Sub1_3111
				     .method186((byte) 120) * 1 / 100;
			    i += 1 * Class28.aClass9_Sub1_513
					 .method186((byte) 119) / 100;
			    i += 1 * Class14_Sub2_Sub7.aClass9_Sub1_3824
					 .method186((byte) 81) / 100;
			    if (-101 == (i ^ 0xffffffff))
				break;
			    if (-1 != (i ^ 0xffffffff))
				Class14_Sub9_Sub1.aClass124_4761
				    = (Class14_Sub8_Sub7.method515
				       ((new Class124[]
					 { Class17.aClass124_405,
					   Class83.method1407(106, i),
					   Class14_Sub21.aClass124_3104 }),
					(byte) -38));
			    Class51.anInt828 = 20;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub8_Sub22.aClass124_4453;
			Class51.anInt828 = 20;
			Class55.method1222(Class14_Sub3.aClass9_Sub1_2750,
					   (byte) 89);
			Class14_Sub2_Sub21
			    .method444(-30451, Class14_Sub3.aClass9_Sub1_2750);
			Class152.method2044(Class14_Sub3.aClass9_Sub1_2750,
					    (byte) -126);
			Class14_Sub2_Sub17.method376((byte) 111,
						     (Class14_Sub3
						      .aClass9_Sub1_2750));
			Class62.anInt988 = 45;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if ((Class62.anInt988 ^ 0xffffffff) != -46)
			    break;
			Class131.method1772(Class14_Sub8_Sub26.aBoolean4528, 2,
					    (byte) 29, 22050);
			Class125.aClass14_Sub9_Sub1_2071
			    = new Class14_Sub9_Sub1();
			Class125.aClass14_Sub9_Sub1_2071.method702(0, 9, 128);
			Class14_Sub8_Sub35.aClass75_4682
			    = Class14_Sub1.method235(22050, 68,
						     (Class14_Sub8_Sub34
						      .aClass43_4647),
						     Class49.aCanvas819, 0);
			Class14_Sub8_Sub35.aClass75_4682.method1352
			    (Class125.aClass14_Sub9_Sub1_2071, false);
			Class88.method1438(Class125.aClass14_Sub9_Sub1_2071,
					   (Class14_Sub2_Sub18_Sub2
					    .aClass9_Sub1_5085),
					   false, Class47.aClass9_Sub1_790,
					   Class14_Sub10.aClass9_Sub1_2901);
			Class134.aClass75_2588
			    = Class14_Sub1.method235(2048, 97,
						     (Class14_Sub8_Sub34
						      .aClass43_4647),
						     Class49.aCanvas819, 1);
			Class33.aClass14_Sub9_Sub2_585
			    = new Class14_Sub9_Sub2();
			Class134.aClass75_2588
			    .method1352(Class33.aClass14_Sub9_Sub2_585, false);
			Class85.aClass18_1362
			    = new Class18(22050, Class115.anInt1909);
			Class2.anInt97
			    = Class125_Sub2.aClass9_Sub1_3374
				  .method146(Class125.aClass124_2084, 0);
			Class14_Sub9_Sub1.aClass124_4761
			    = Class4.aClass124_131;
			Class51.anInt828 = 30;
			Class62.anInt988 = 50;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_10_:
		do {
		    do {
			try {
			    if (50 != Class62.anInt988)
				break while_10_;
			    int i
				= Class47.method1185(Class64.aClass9_Sub1_1015,
						     true,
						     (Class14_Sub3
						      .aClass9_Sub1_2750));
			    int i_13_ = Class76.method1357(-21193);
			    if ((i ^ 0xffffffff) <= (i_13_ ^ 0xffffffff))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class110.aClass124_1853,
				       Class83.method1407(53, 100 * i / i_13_),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -82));
			    Class51.anInt828 = 35;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class51.anInt828 = 35;
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub8.aClass124_2855;
			Class62.anInt988 = 60;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_11_:
		do {
		    do {
			try {
			    if (-61 != (Class62.anInt988 ^ 0xffffffff))
				break while_11_;
			    int i = (Class14_Sub8_Sub14.method550
				     (Class14_Sub3.aClass9_Sub1_2750,
				      (byte) 61));
			    int i_14_ = Class115.method1589((byte) -91);
			    if (i >= i_14_)
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub8_Sub2.aClass124_4122,
				       Class83.method1407(28, 100 * i / i_14_),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -107));
			    Class51.anInt828 = 40;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class62.anInt988 = 65;
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub8_Sub13.aClass124_4302;
			Class51.anInt828 = 40;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    int i;
		    try {
			int i_15_ = 80 / ((21 - arg0) / 38);
			if (Class62.anInt988 != 65)
			    break;
			i = 0;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    while (6 > i) {
			Class31 class31 = Class14_Sub8_Sub34.aClass43_4647
					      .method1142(this.getClass(), 10);
			while (-1 == (class31.anInt529 ^ 0xffffffff))
			    Class14_Sub13.method864(100L, (byte) 64);
			if (-2 == (class31.anInt529 ^ 0xffffffff))
			    break;
			if (5 == i) {
			    method28("dll", -1);
			    Class14_Sub8_Sub16.anInt4356 = 1000;
			    return;
			}
			try {
			    Class14_Sub13.method864(1000L, (byte) 64);
			    i++;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
		    }
		    i = Class121.method1621(Class49.aCanvas819,
					    Class135.anInt2189 * 2);
		    if ((i ^ 0xffffffff) != -1) {
			String string = Class121.aString2031;
			String string_16_ = "unknown";
			String string_17_ = Class121.aString2037;
			String string_18_ = string.toLowerCase();
			if (string_18_.indexOf("microsoft") != -1)
			    string_16_ = "vesa";
			else if ((string_18_.indexOf("nvidia") ^ 0xffffffff)
				 == 0) {
			    if ((string_18_.indexOf("intel") ^ 0xffffffff)
				!= 0)
				string_16_ = "intel";
			    else if (0 == (string_18_.indexOf("s3")
					   ^ 0xffffffff)) {
				if ((string_18_.indexOf("ati") ^ 0xffffffff)
				    != 0)
				    string_16_ = "ati";
			    } else if ((string_17_.toLowerCase()
					    .indexOf("unichrome")
					^ 0xffffffff)
				       == 0)
				string_16_ = "s3";
			    else
				string_16_ = "via_s3";
			} else
			    string_16_ = "nvidia";
			String string_19_
			    = method50(true, (Class43.aString709 + " "
					      + Class43.aString704 + " "
					      + Class43.aString717));
			String string_20_
			    = method50(true, string + " " + string_17_);
			method35(("os=" + string_19_ + "&gcard=" + string_20_
				  + "&error_code=" + i),
				 "caps_" + string_16_, (byte) 52);
			Class14_Sub8_Sub16.anInt4356 = 1000;
		    } else {
			try {
			    Class151.method2029(104, 104);
			    Class14_Sub15.method871((Class14_Sub3
						     .aClass9_Sub1_2750),
						    Class64.aClass9_Sub1_1015,
						    -102);
			    Class51.anInt828 = 45;
			    Class14_Sub9_Sub1.aClass124_4761
				= Class123.aClass124_2068;
			    Class126.method1743(27252, 5);
			    Class62.anInt988 = 70;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    }
		    return;
		} while (false);
	    while_12_:
		do {
		    do {
			try {
			    if (70 != Class62.anInt988)
				break while_12_;
			    Class138.aClass9_Sub1_2222.method170(false);
			    int i = 0;
			    i += Class138.aClass9_Sub1_2222.method173(100);
			    Class89.aClass9_Sub1_1407.method170(false);
			    i += Class89.aClass9_Sub1_1407.method173(100);
			    Class14.aClass9_Sub1_369.method170(false);
			    i += Class14.aClass9_Sub1_369.method173(100);
			    Class102.aClass9_Sub1_1712.method170(false);
			    i += Class102.aClass9_Sub1_1712.method173(100);
			    Class127.aClass9_Sub1_2111.method170(false);
			    i += Class127.aClass9_Sub1_2111.method173(100);
			    Class22.aClass9_Sub1_459.method170(false);
			    i += Class22.aClass9_Sub1_459.method173(100);
			    Class100.aClass9_Sub1_1690.method170(false);
			    i += Class100.aClass9_Sub1_1690.method173(100);
			    Class14_Sub8.aClass9_Sub1_2848.method170(false);
			    i += Class14_Sub8.aClass9_Sub1_2848.method173(100);
			    Class14_Sub21.aClass9_Sub1_3111.method170(false);
			    i += Class14_Sub21.aClass9_Sub1_3111
				     .method173(100);
			    Class28.aClass9_Sub1_513.method170(false);
			    i += Class28.aClass9_Sub1_513.method173(100);
			    if (i >= 1000)
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub28.aClass124_3226,
				       Class83.method1407(28, i / 10),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -57));
			    Class51.anInt828 = 50;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class86.method1424(-256, Class138.aClass9_Sub1_2222);
			Class32.method1072(Class138.aClass9_Sub1_2222,
					   (byte) -104);
			Class133_Sub1.method1793(Class138.aClass9_Sub1_2222,
						 14555);
			Class14_Sub8_Sub19.method581((Class138
						      .aClass9_Sub1_2222),
						     false,
						     (Class14_Sub8_Sub38
						      .aClass9_Sub1_4739));
			Class7_Sub3_Sub1.method138(false,
						   Class89.aClass9_Sub1_1407,
						   (Class14_Sub8_Sub38
						    .aClass9_Sub1_4739),
						   Class132.aBoolean2170);
			Class14_Sub19.method891(Class102.aClass9_Sub1_1712,
						-127,
						(Class14_Sub8_Sub38
						 .aClass9_Sub1_4739));
			Class123.method1664
			    (Class127.aClass9_Sub1_2111, Class132.aBoolean2170,
			     Class131.aClass14_Sub2_Sub16_Sub1_2160,
			     (byte) -26, Class14_Sub8_Sub38.aClass9_Sub1_4739);
			Class14_Sub29.method934(Class138.aClass9_Sub1_2222,
						54);
			Class148.method2000(Class75.aClass9_Sub1_1167,
					    Class22.aClass9_Sub1_459,
					    (byte) -86,
					    Class109.aClass9_Sub1_1834);
			Class108.method1561(Class100.aClass9_Sub1_1690,
					    (byte) 127,
					    (Class14_Sub8_Sub38
					     .aClass9_Sub1_4739));
			Class14_Sub1.method234(Class14_Sub8.aClass9_Sub1_2848,
					       (byte) -77);
			Class26.method1018((byte) -68,
					   Class138.aClass9_Sub1_2222);
			Class14_Sub2_Sub9.method305
			    (Class64.aClass9_Sub1_1015,
			     Class14_Sub8_Sub38.aClass9_Sub1_4739,
			     Class14_Sub3.aClass9_Sub1_2750,
			     Class14_Sub17.aClass9_Sub1_3021, (byte) -97);
			Class132.method1777((byte) -57,
					    Class138.aClass9_Sub1_2222);
			Class45.method1164(Class14.aClass9_Sub1_369, 35);
			Applet_Sub1.method31(Class28.aClass9_Sub1_513,
					     (byte) -4, new Class38(),
					     Class14_Sub21.aClass9_Sub1_3111);
			Class14_Sub30.method939((Class14_Sub21
						 .aClass9_Sub1_3111),
						Class28.aClass9_Sub1_513, 16);
			Class14_Sub9_Sub1.aClass124_4761
			    = Class28.aClass124_514;
			Class51.anInt828 = 50;
			Class14_Sub8_Sub20.method583(-111);
			Class62.anInt988 = 80;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_13_:
		do {
		    do {
			try {
			    if ((Class62.anInt988 ^ 0xffffffff) != -81)
				break while_13_;
			    int i = (Class133_Sub1_Sub1.method1805
				     (31673, Class14_Sub3.aClass9_Sub1_2750));
			    int i_21_ = Class84.method1412((byte) -125);
			    if (i >= i_21_)
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class75.aClass124_1182,
				       Class83.method1407(72, 100 * i / i_21_),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -45));
			    Class51.anInt828 = 60;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class2.method85(Class14_Sub3.aClass9_Sub1_2750, true);
			Class14_Sub9_Sub1.aClass124_4761
			    = Class108.aClass124_1814;
			Class62.anInt988 = 90;
			Class51.anInt828 = 60;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_14_:
		do {
		    do {
			try {
			    if (-91 != (Class62.anInt988 ^ 0xffffffff))
				break while_14_;
			    if (Class14_Sub2_Sub7.aClass9_Sub1_3824
				    .method170(false))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub2_Sub12.aClass124_3910,
				       (Class83.method1407
					(43,
					 Class14_Sub2_Sub7
					     .aClass9_Sub1_3824
					     .method173(100))),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -32));
			    Class51.anInt828 = 70;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class134 class134
			    = new Class134(Class98.aClass9_Sub1_1666,
					   Class14_Sub2_Sub7.aClass9_Sub1_3824,
					   Class14_Sub3.aClass9_Sub1_2750, 200,
					   !Class125_Sub3.aBoolean3397);
			Class3.method93(class134);
			if (!Class7_Sub1.aBoolean2661) {
			    if (1 == Class14_Sub8_Sub6.anInt4190)
				Class3.method103(0.9F);
			    if (-3
				== (Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff))
				Class3.method103(0.8F);
			    if ((Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff)
				== -4)
				Class3.method103(0.7F);
			    if ((Class14_Sub8_Sub6.anInt4190 ^ 0xffffffff)
				== -5)
				Class3.method103(0.6F);
			} else
			    Class3.method103(0.7F);
			Class14_Sub9_Sub1.aClass124_4761 = aClass124_2631;
			Class51.anInt828 = 70;
			Class62.anInt988 = 100;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-101 != (Class62.anInt988 ^ 0xffffffff))
			    break;
			Class62.anInt988 = 110;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-111 != (Class62.anInt988 ^ 0xffffffff))
			    break;
			Class14_Sub2_Sub11.aClass100_3878 = new Class100();
			Class14_Sub8_Sub34.aClass43_4647.method1143
			    (10, Class14_Sub2_Sub11.aClass100_3878, 0);
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub9_Sub1.aClass124_4773;
			Class51.anInt828 = 75;
			Class62.anInt988 = 120;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_15_:
		do {
		    do {
			try {
			    if ((Class62.anInt988 ^ 0xffffffff) != -121)
				break while_15_;
			    if (Class14_Sub8_Sub14.aClass9_Sub1_4323.method159
				(4, Class14_Sub8_Sub9.aClass124_4244,
				 Class14_Sub10_Sub1.aClass124_4891))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { RuntimeException_Sub1.aClass124_2456,
				       Class14_Sub11.aClass124_2942 }),
				    (byte) -59));
			    Class51.anInt828 = 80;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class5 class5
			    = new Class5(Class14_Sub8_Sub14
					     .aClass9_Sub1_4323.method167
					 (Class14_Sub10_Sub1.aClass124_4891,
					  Class14_Sub8_Sub9.aClass124_4244,
					  -65));
			Class139.method1955(-83, class5);
			Class51.anInt828 = 80;
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub2_Sub8.aClass124_3852;
			Class62.anInt988 = 130;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
	    while_16_:
		do {
		    do {
			try {
			    if (Class62.anInt988 != 130)
				break while_16_;
			    if (Class14_Sub17.aClass9_Sub1_3021
				    .method170(false))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub17.aClass124_3033,
				       (Class83.method1407
					(67, Class14_Sub17
						 .aClass9_Sub1_3021
						 .method173(100) * 3 / 4)),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -64));
			    Class51.anInt828 = 85;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class14_Sub8_Sub26.aClass9_Sub1_4521
				    .method170(false))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub17.aClass124_3033,
				       (Class83.method1407
					(71, 75 - -(Class14_Sub8_Sub26
							.aClass9_Sub1_4521
							.method173(100)
						    / 10))),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -11));
			    Class51.anInt828 = 85;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class64.aClass9_Sub1_1015.method170(false))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub17.aClass124_3033,
				       (Class83.method1407
					(85, Class64.aClass9_Sub1_1015
						 .method173(100) / 20 + 85)),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -8));
			    Class51.anInt828 = 85;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class7_Sub1.aClass9_Sub1_2657.method160
				(Class14_Sub9_Sub3.aClass124_4844,
				 (byte) -102))
				break;
			    Class14_Sub9_Sub1.aClass124_4761
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class14_Sub17.aClass124_3033,
				       (Class83.method1407
					(28,
					 (90
					  + (Class7_Sub1.aClass9_Sub1_2657
						 .method151
					     (Class14_Sub9_Sub3.aClass124_4844,
					      -121)) / 10))),
				       Class14_Sub21.aClass124_3104 }),
				    (byte) -50));
			    Class51.anInt828 = 85;
			} catch (RuntimeException runtimeexception) {
			    break while_17_;
			}
			return;
		    } while (false);
		    try {
			Class14_Sub8.method471
			    (Class133_Sub1_Sub1.aClass148_Sub1Array4938,
			     Class32.aClass148_Sub1Array540,
			     Class97.aClass148_Sub1Array1651,
			     Class133.aClass14_Sub2_Sub19_Sub1Array2186,
			     Class7_Sub1.aClass9_Sub1_2657, 90,
			     Class14_Sub29.aClass148_Sub1Array3265);
			Class14_Sub9_Sub1.aClass124_4761
			    = Class14_Sub9_Sub1.aClass124_4762;
			Class62.anInt988 = 140;
			Class51.anInt828 = 100;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (-141 != (Class62.anInt988 ^ 0xffffffff))
			    break;
			Class14_Sub8_Sub6.anInt4187
			    = (Class14_Sub17.aClass9_Sub1_3021.method146
			       (Class14_Sub8_Sub21.aClass124_4445, 0));
			Class14_Sub13.aClass9_Sub1_2958.method175((byte) -99,
								  true, false);
			Class125_Sub2.aClass9_Sub1_3374.method175((byte) -99,
								  true, true);
			Class14_Sub3.aClass9_Sub1_2750.method175((byte) -99,
								 true, true);
			Class64.aClass9_Sub1_1015.method175((byte) -99, true,
							    true);
			Class14_Sub8_Sub14.aClass9_Sub1_4323
			    .method175((byte) -99, true, true);
			Class14_Sub17.aClass9_Sub1_3021.method175((byte) -99,
								  true, true);
			Class65.aBoolean1026 = true;
			Class109.method1568((byte) -55);
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    break;
		} while (false);
		break while_18_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.H(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static void method48(byte arg0) {
    while_23_:
	do {
	try {
	while_22_:
	    do {
	    while_21_:
		do {
		while_20_:
		    do {
		    while_19_:
			do {
			    do {
				try {
				    anInt2626++;
				    try {
					if (-2 != (Class14_Sub2_Sub11.anInt3889
						   ^ 0xffffffff))
					    break while_19_;
					int i = Class133_Sub5
						    .aClass14_Sub9_Sub1_3625
						    .method727(0);
					if (-1 <= (i ^ 0xffffffff)
					    || !Class133_Sub5
						    .aClass14_Sub9_Sub1_3625
						    .method721((byte) 111))
					    break;
					i -= Class14_Sub15.anInt2989;
					if (i < 0)
					    i = 0;
					Class133_Sub5
					    .aClass14_Sub9_Sub1_3625
					    .method710(-28225, i);
				    } catch (Exception exception) {
					break while_20_;
				    }
				} catch (RuntimeException runtimeexception) {
				    break while_22_;
				}
				return;
			    } while (false);
			    try {
				try {
				    Class133_Sub5.aClass14_Sub9_Sub1_3625
					.method697(76);
				    Class133_Sub5.aClass14_Sub9_Sub1_3625
					.method716((byte) -43);
				    Class14_Sub9_Sub1.aClass14_Sub16_4780
					= null;
				    Class52.aClass120_854 = null;
				    if (null == Class9_Sub1.aClass9_2696)
					Class14_Sub2_Sub11.anInt3889 = 0;
				    else
					Class14_Sub2_Sub11.anInt3889 = 2;
				} catch (Exception exception) {
				    break while_20_;
				}
			    } catch (RuntimeException runtimeexception) {
				break while_22_;
			    }
			} while (false);
			if (arg0 != 116)
			    method46(null);
			break while_21_;
		    } while (false);
		    Exception exception = new Exception();
		    exception.printStackTrace();
		    Class133_Sub5.aClass14_Sub9_Sub1_3625
			.method697(arg0 + -43);
		    Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
		    Class14_Sub2_Sub11.anInt3889 = 0;
		    Class9_Sub1.aClass9_2696 = null;
		    Class52.aClass120_854 = null;
		} while (false);
		break while_23_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.F(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static boolean method49(Class94 arg0) {
	if (Class125_Sub3.aBoolean3392) {
	    if (method46(arg0) != 0)
		return false;
	    if (arg0.anInt1489 == 0)
		return false;
	}
	return arg0.aBoolean1503;
    }
    
    public void method33(int arg0) {
	try {
	    anInt2633++;
	    method52(121);
	    Class124.method1715((byte) -83);
	    Class56.method1237(1232386310);
	    Class14_Sub2_Sub5.method284(12800);
	    Class146.method1995(-103);
	    Applet_Sub1.method39(true);
	    Class121.method1654();
	    Class99.method1502(-17808);
	    Class108.method1556(false);
	    Class100.method1515(-25576);
	    Class66.method1295(-597398239);
	    Class14_Sub10.method815(0);
	    Class36.method1102((byte) -40);
	    Class9_Sub1.method181(97);
	    Class76.method1364(53);
	    Class114.method1585(false);
	    Class52.method1206((byte) -89);
	    Class133_Sub1_Sub2.method1811(-1);
	    Class14_Sub10_Sub1.method846((byte) 0);
	    Class2.method89(arg0 + -31);
	    Class32.method1067(arg0 + 10795);
	    Class94.method1470(-56);
	    Class88.method1437(false);
	    Class133_Sub1_Sub1.method1806(arg0 + 86);
	    Class55.method1236((byte) -128);
	    Class129.method1764(arg0 ^ ~0x73);
	    Class14_Sub23.method902(-7741);
	    Class109.method1571(0);
	    Class14_Sub2_Sub19.method388(-117);
	    Class14_Sub9_Sub1.method703(false);
	    Class75.method1346((byte) 78);
	    Class18.method962((byte) -118);
	    Class102.method1525(123);
	    Class46.method1175(arg0 + -153);
	    Class133_Sub1.method1797(79);
	    Class14_Sub29.method930((byte) -34);
	    Class14_Sub14.method869((byte) 92);
	    Class12.method211((byte) -83);
	    Class14_Sub15.method872((byte) 114);
	    Class14.method232(-21518);
	    Class81.method1403(0);
	    Class106.method1542(-86);
	    Class122.method1659(-103);
	    Class33.method1085(arg0 ^ 0x67e8c58);
	    Class69.method1309(21954);
	    RuntimeException_Sub1.method2051(-64);
	    Class110.method1575(true);
	    Class140.method1956((byte) 120);
	    Class42.method1134(0);
	    Class79.method1380(true);
	    Class53.method1212(-1);
	    Class57.method1244();
	    Class22.method988((byte) -108);
	    Class9.method150(3);
	    Class133_Sub2.method1828();
	    Class86.method1421((byte) 2);
	    Class133_Sub7_Sub2.method1909();
	    Class142.method1969(true);
	    Class133_Sub7_Sub1.method1877();
	    Class141.method1962(false);
	    Class97.method1490((byte) 110);
	    Class84.method1414(false);
	    Class118.method1604(-4);
	    Class24.method992((byte) 64);
	    Class103.method1527((byte) 121);
	    Class120.method1614((byte) -16);
	    Class11.method207();
	    Class90.method1445(-104);
	    Class64.method1287(arg0 + -12096);
	    Class148.method1997(64);
	    Class14_Sub2_Sub16.method367();
	    Class15.method945(0);
	    Class14_Sub27.method923();
	    Class40.method1127(0);
	    Class85.method1416(2);
	    Class133.method1785((byte) -78);
	    Class37.method1110(arg0 ^ arg0);
	    Class4.method108((byte) 127);
	    Class115.method1588((byte) 102);
	    Class153.method2048(2);
	    Class6.method114();
	    Class14_Sub2_Sub6.method287();
	    Class14_Sub2.method248(32);
	    Class20.method970(5);
	    Class134.method1925((byte) 32);
	    Class3.method106();
	    Class92.method1463();
	    Class14_Sub2_Sub1.method258(1869706832);
	    Class14_Sub2_Sub14.method334(-121);
	    Class10.method191();
	    Class73.method1327((byte) -100);
	    Class14_Sub2_Sub15.method339(15121);
	    Class41.method1132(118);
	    Class151.method2040();
	    Class13.method225();
	    Class83.method1410(-28990);
	    Class25.method1001();
	    Class104.method1535((byte) -122);
	    Class56_Sub1.method1243((byte) -115);
	    Class87.method1434();
	    Class116.method1599(-16844);
	    Class63.method1281((byte) -122);
	    Class49.method1196((byte) 41);
	    Canvas_Sub2.method65((byte) -7);
	    Class58.method1258(1);
	    Class14_Sub2_Sub9.method302((byte) 118);
	    Class14_Sub18.method883(1);
	    Class27.method1034();
	    Class14_Sub9_Sub3.method736(arg0 + -31);
	    Class14_Sub28.method926((byte) 27);
	    Class48.method1193(50);
	    Class47.method1186(-192);
	    Class14_Sub2_Sub2.method262((byte) 111);
	    Class150.method2021((byte) -85);
	    Class137.method1940((byte) 103);
	    Class21.method979(arg0 ^ 0x45);
	    Class14_Sub2_Sub3.method276(arg0 ^ ~0x3bec);
	    Class111.method1576(arg0 + 84);
	    Class67.method1298(arg0 + -33);
	    Class60.method1269((byte) 4);
	    Class51.method1200(arg0 + -21);
	    Class35.method1095(-572);
	    Class14_Sub2_Sub20.method430(true);
	    Class14_Sub2_Sub8.method291((byte) -78);
	    Class14_Sub2_Sub21.method436(-106);
	    Class14_Sub2_Sub11.method313(112);
	    Class5.method111((byte) 76);
	    Class131.method1775(-93);
	    Class44.method1157((byte) 95);
	    Class112.method1579((byte) -128);
	    Class98.method1495(115);
	    Class14_Sub21.method893((byte) 113);
	    Class71.method1316(true);
	    Class139.method1953((byte) -98);
	    Class59.method1261((byte) 16);
	    Class54.method1219(123);
	    Class14_Sub13.method863((byte) 92);
	    Class14_Sub2_Sub13.method325(8);
	    Class14_Sub25.method916(-111);
	    Class14_Sub3.method453(-24);
	    Class70.method1312(0);
	    Class14_Sub2_Sub12.method320((byte) -48);
	    Class74.method1334((byte) -127);
	    Class105.method1537();
	    Class62.method1274(124);
	    Class96.method1487(false);
	    Class123.method1661(-19);
	    Class133_Sub6.method1852(112);
	    Class133_Sub5.method1846(false);
	    Class14_Sub1.method239(false);
	    Class133_Sub3.method1831((byte) -44);
	    Class133_Sub4.method1837(0);
	    Class128.method1756(true);
	    Class14_Sub30.method942(8);
	    Class82.method1404((byte) -69);
	    Class14_Sub4.method455(arg0 ^ ~0x6a);
	    Canvas_Sub1.method60(5027);
	    Class17.method959(-1);
	    Class99_Sub2.method1509(0);
	    Class138.method1948(arg0 + 69);
	    Class89.method1442(127);
	    Class126.method1746(arg0 ^ 0xe0);
	    Class14_Sub2_Sub18.method381(arg0 ^ ~0x5d);
	    Class14_Sub2_Sub18_Sub2.method383(2);
	    Class39.method1119(127);
	    Class14_Sub17.method880(arg0 ^ 0x1e);
	    Class127.method1753(false);
	    Class75_Sub2.method1355();
	    Class145.method1987();
	    Class143.method1981();
	    Class1.method72(false);
	    Class136.method1929();
	    Class117.method1600((byte) 113);
	    Class14_Sub5.method461(-61);
	    Class14_Sub19.method887((byte) -103);
	    Class14_Sub24.method914();
	    Class16.method948();
	    Class107.method1554((byte) -118);
	    Class14_Sub8.method476((byte) -65);
	    Class152.method2043(119);
	    Class26.method1014((byte) 116);
	    Class95.method1484(arg0 ^ 0x1d);
	    Class149.method2017((byte) -115);
	    Class119.method1613();
	    Class61.method1271();
	    Class34.method1090();
	    Class19.method967(-20514);
	    Class14_Sub11.method856((byte) 8);
	    Class68.method1306(-84);
	    Class132.method1776(true);
	    Class28.method1050((byte) 109);
	    Class14_Sub8_Sub23.method600(1);
	    Class14_Sub8_Sub39.method680((byte) -82);
	    Class14_Sub8_Sub19.method579((byte) 95);
	    Class14_Sub8_Sub7.method510(arg0 ^ ~0x6b);
	    Class14_Sub8_Sub22.method599(false);
	    Class14_Sub8_Sub14.method553(0);
	    Class14_Sub8_Sub34.method660(false);
	    Class14_Sub8_Sub25.method614((byte) 119);
	    Class14_Sub8_Sub5.method500((byte) 122);
	    Class14_Sub8_Sub2.method489(-51);
	    Class14_Sub8_Sub21.method590(true);
	    Class14_Sub8_Sub27.method624(2);
	    Class14_Sub8_Sub17.method570(4);
	    Class14_Sub8_Sub4.method496((byte) 64);
	    Class14_Sub8_Sub37.method673(false);
	    Class14_Sub8_Sub11.method533(true);
	    Class14_Sub8_Sub15.method556(127);
	    Class14_Sub8_Sub36.method668((byte) -109);
	    Class14_Sub8_Sub38.method677(127);
	    Class14_Sub8_Sub24.method612((byte) 117);
	    Class14_Sub8_Sub39_Sub1.method684(16711680);
	    Class14_Sub8_Sub29.method635(-45);
	    Class14_Sub8_Sub30.method640(127);
	    Class14_Sub8_Sub13.method547((byte) 38);
	    Class14_Sub8_Sub26.method620(false);
	    Class14_Sub8_Sub16.method562(-84);
	    Class14_Sub8_Sub31.method646(true);
	    Class14_Sub8_Sub20.method585((byte) 127);
	    Class14_Sub8_Sub8.method518((byte) 88);
	    Class14_Sub8_Sub10.method528(512);
	    Class14_Sub8_Sub6.method508((byte) -123);
	    Class14_Sub8_Sub18.method573(3);
	    Class14_Sub8_Sub9.method524(56800372);
	    Class14_Sub8_Sub28.method629(-123);
	    Class14_Sub8_Sub32.method651(-28268);
	    Class14_Sub8_Sub3.method491(0);
	    Class14_Sub8_Sub33.method654(arg0 + -1);
	    Class14_Sub8_Sub35.method666(false);
	    Class14_Sub8_Sub1.method486(120);
	    Class26_Sub2.method1030(arg0 + -158);
	    Class26_Sub1.method1024(4095);
	    Class7_Sub2.method126(117);
	    Class7.method119(arg0 + -110);
	    Class7_Sub2_Sub1.method129(75);
	    Class7_Sub1.method123((byte) -18);
	    Class7_Sub3_Sub1.method137(-8020);
	    Class7_Sub3.method133(true);
	    Class14_Sub2_Sub4.method280((byte) 106);
	    Class14_Sub2_Sub10.method306(0);
	    Class14_Sub2_Sub7.method288(1);
	    Class14_Sub20.method892(15075);
	    Class45.method1165((byte) -62);
	    Class14_Sub2_Sub17.method374((byte) 73);
	    Class14_Sub22.method900((byte) 127);
	    Class14_Sub6.method467(-270693430);
	    Class125.method1727(10);
	    Class125_Sub2.method1731(-16888);
	    Class125_Sub3.method1738(-1);
	    Class125_Sub4.method1739(-23);
	    Class125_Sub1.method1730(arg0 ^ ~0x7a);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "client.T(" + arg0 + ')');
	}
    }
    
    public String method50(boolean arg0, String arg1) {
	String aString;
	try {
	    StringBuffer stringbuffer = new StringBuffer();
	    if (arg0 != true)
		method29(-17);
	    anInt2649++;
	    for (int i = 0; i < arg1.length(); i++) {
		char c = arg1.charAt(i);
		if ((c ^ 0xffffffff) <= -49 && c <= 57 || c >= 97 && 122 >= c
		    || (c ^ 0xffffffff) <= -66 && c <= 90)
		    stringbuffer.append(c);
		else {
		    stringbuffer.append('%');
		    int i_22_ = (0xfe & c) >> -953753436;
		    if (-1 < (i_22_ ^ 0xffffffff)
			|| (i_22_ ^ 0xffffffff) < -10) {
			if (10 <= i_22_ && -16 <= (i_22_ ^ 0xffffffff))
			    stringbuffer.append((char) (65 + i_22_ - 10));
		    } else
			stringbuffer.append((char) (48 + i_22_));
		    i_22_ = 0xf & c;
		    if (i_22_ >= 0 && 9 >= i_22_)
			stringbuffer.append((char) (i_22_ + 48));
		    else if (10 <= i_22_ && i_22_ <= 15)
			stringbuffer.append((char) (65 + i_22_ - 10));
		}
	    }
	    aString = stringbuffer.toString();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("client.R(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return aString;
    }
    
    public static Class9_Sub1 method51(boolean arg0, int arg1, byte arg2,
				       boolean arg3, boolean arg4) {
	Class9_Sub1 aClass9_Sub1;
	try {
	    Class114 class114 = null;
	    int i = -104 / ((-31 - arg2) / 40);
	    anInt2647++;
	    if (Class14_Sub8_Sub1.aClass76_4098 != null)
		class114
		    = new Class114(arg1, Class14_Sub8_Sub1.aClass76_4098,
				   Class58.aClass76Array944[arg1], 1000000);
	    aClass9_Sub1 = new Class9_Sub1(class114, Class14_Sub23.aClass114_3126, arg1,
				 arg4, arg0, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("client.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
	return aClass9_Sub1;
    }
    
    public void method34(boolean arg0) {
    while_25_:
	do {
	try {
	while_24_:
	    do {
		do {
		    try {
			anInt2638++;
			if (Class14_Sub8_Sub16.anInt4356 != 1000)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_24_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class14_Sub2_Sub20.anInt4064++;
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_24_;
		    }
		    return;
		} while (false);
		try {
		    if ((Class14_Sub2_Sub20.anInt4064 % 1000 ^ 0xffffffff)
			== -2) {
			GregorianCalendar gregoriancalendar
			    = new GregorianCalendar();
			Class32.anInt563 = (gregoriancalendar.get(11) * 600
					    - -(10 * gregoriancalendar.get(12))
					    + gregoriancalendar.get(13) / 6);
			Class104.aRandom1732.setSeed((long) Class32.anInt563);
		    }
		    method56(20);
		    Class14_Sub8_Sub31.method648((byte) 74);
		    method48((byte) 116);
		    Class138.method1946(139);
		    Class17.method956(false);
		    Class14_Sub2_Sub21.method440((byte) -114);
		    Class11.method205();
		    if (null != Class44.aClass129_726) {
			int i = Class44.aClass129_726.method1763(-128);
			Class113.anInt1881 = i;
		    }
		    if (0 == Class14_Sub8_Sub16.anInt4356) {
			method47((byte) 119);
			Class14_Sub8_Sub11.method531((byte) -112);
		    } else if (-6 != (Class14_Sub8_Sub16.anInt4356
				      ^ 0xffffffff)) {
			if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == -26
			    || -29 == (Class14_Sub8_Sub16.anInt4356
				       ^ 0xffffffff))
			    Class14_Sub2_Sub13.method329(true);
		    } else {
			method47((byte) 122);
			Class14_Sub8_Sub11.method531((byte) -112);
		    }
		    if (-11 == (Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)) {
			method53((byte) 102);
			Class115.method1593(-2);
			Class71.method1315(0);
		    } else if (Class14_Sub8_Sub16.anInt4356 != 30) {
			if (40 == Class14_Sub8_Sub16.anInt4356) {
			    Class71.method1315(0);
			    if (Class14_Sub8_Sub26.anInt4525 != -3) {
				if ((Class14_Sub8_Sub26.anInt4525 ^ 0xffffffff)
				    != -16) {
				    if (Class14_Sub8_Sub26.anInt4525 != 2)
					Class109.method1568((byte) -96);
				} else
				    Class111.method1578(86);
			    }
			}
		    } else
			Class14_Sub5.method460(0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_25_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.K(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static void method52(int arg0) {
	try {
	    aClass124Array2645 = null;
	    if (arg0 < 54)
		method49(null);
	    aClass124_2625 = null;
	    anIntArray2644 = null;
	    aClass124_2639 = null;
	    aClass124_2636 = null;
	    aClass124_2637 = null;
	    aClass124_2631 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "client.D(" + arg0 + ')');
	}
    }
    
    public void method38(boolean arg0) {
	try {
	    anInt2628++;
	    Class121.method1630();
	    if (browsercontrol.iscreated())
		browsercontrol.destroy();
	    if (null != Class14_Sub2_Sub15.aFrame3962) {
		Class14_Sub2_Sub4.method278(Class14_Sub8_Sub34.aClass43_4647,
					    Class14_Sub2_Sub15.aFrame3962,
					    -119);
		Class14_Sub2_Sub15.aFrame3962 = null;
	    }
	    if (null != Class14_Sub8_Sub34.aClass43_4647)
		Class14_Sub8_Sub34.aClass43_4647.method1151(this.getClass(),
							    false);
	    if (Class14_Sub2_Sub11.aClass100_3878 != null)
		Class14_Sub2_Sub11.aClass100_3878.aBoolean1686 = false;
	    Class14_Sub2_Sub11.aClass100_3878 = null;
	    if (Class14_Sub15.aClass36_2990 != null) {
		Class14_Sub15.aClass36_2990.method1101((byte) -115);
		Class14_Sub15.aClass36_2990 = null;
	    }
	    Class63.method1280(Class49.aCanvas819, (byte) 127);
	    Class76.method1356(false, Class49.aCanvas819);
	    if (null != Class44.aClass129_726)
		Class44.aClass129_726.method1765(true, Class49.aCanvas819);
	    Class14_Sub8_Sub3.method494((byte) -94);
	    Class14_Sub8_Sub38.method676(-96);
	    Class44.aClass129_726 = null;
	    if (Class14_Sub8_Sub35.aClass75_4682 != null)
		Class14_Sub8_Sub35.aClass75_4682.method1345(25065);
	    if (Class134.aClass75_2588 != null)
		Class134.aClass75_2588.method1345(25065);
	    Class14_Sub14.method866(arg0);
	    Class14_Sub8_Sub36.method669(79);
	    try {
		if (Class14_Sub8_Sub1.aClass76_4098 != null)
		    Class14_Sub8_Sub1.aClass76_4098.method1358(-1473276056);
		if (null != Class58.aClass76Array944) {
		    for (int i = 0; Class58.aClass76Array944.length > i; i++) {
			if (null != Class58.aClass76Array944[i])
			    Class58.aClass76Array944[i]
				.method1358(-1473276056);
		    }
		}
		if (null != Class14_Sub8_Sub28.aClass76_4569)
		    Class14_Sub8_Sub28.aClass76_4569.method1358(-1473276056);
		if (Class14_Sub2_Sub17.aClass76_4022 != null)
		    Class14_Sub2_Sub17.aClass76_4022.method1358(-1473276056);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "client.J(" + arg0 + ')');
	}
    }
    
    public void method53(byte arg0) {
    while_29_:
	do {
	try {
	while_28_:
	    do {
		do {
		    try {
			if (arg0 == 102)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_28_;
		    }
		    return;
		} while (false);
		try {
		    anInt2630++;
		    Class7_Sub3_Sub1.method140(this, arg0 ^ ~0x7292);
		    for (Class152.anInt2440 = 0;
			 (Class14_Sub8_Sub5.method503(true)
			  && 128 > Class152.anInt2440);
			 Class152.anInt2440++) {
			Class14_Sub11.anIntArray2948[Class152.anInt2440]
			    = Class36.anInt630;
			Class125_Sub3.anIntArray3398[Class152.anInt2440]
			    = Class146.anInt2358;
		    }
		    Class51.anInt839++;
		    if (-1 != Class14_Sub2_Sub12.anInt3912)
			Class12.method218(-30776, Class14_Sub20.anInt3094, 0,
					  0, Class14_Sub2_Sub12.anInt3912, 0,
					  0, Class83.anInt1340);
		    Class14_Sub8_Sub23.anInt4478++;
		    int i = 19137023;
		while_27_:
		    for (int i_23_ = 0; i_23_ < 32768; i_23_++) {
			Class133_Sub1_Sub2 class133_sub1_sub2
			    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_23_];
			if (class133_sub1_sub2 != null) {
			    byte i_24_
				= class133_sub1_sub2.aClass12_4949.aByte290;
			    if (0 < (i_24_ & 0x2)
				&& ((class133_sub1_sub2.anInt3498 ^ 0xffffffff)
				    == -1)
				&& 10.0 > Math.random() * 1000.0) {
				int i_25_
				    = (int) Math.round(2.0 * Math.random()
						       - 1.0);
				int i_26_
				    = (int) Math.round(-1.0
						       + 2.0 * Math.random());
				if ((i_25_ ^ 0xffffffff) != -1
				    || (i_26_ ^ 0xffffffff) != -1) {
				    class133_sub1_sub2.anIntArray3476[0]
					= i_25_ + (class133_sub1_sub2.anInt3495
						   >> 651018631);
				    class133_sub1_sub2.anIntArray3443[0]
					= i_26_ + (class133_sub1_sub2.anInt3436
						   >> -1718837081);
				    Class14_Sub21.aClass32Array3100
					[Class14_Sub2_Sub3.anInt3785]
					.method1068
					(false, 0, (byte) -97,
					 class133_sub1_sub2.anInt3493,
					 class133_sub1_sub2.anInt3493,
					 (class133_sub1_sub2.anInt3495
					  >> 797018343),
					 (class133_sub1_sub2.anInt3436
					  >> 423658535));
				    if ((class133_sub1_sub2.anIntArray3476[0]
					 >= 0)
					&& (((class133_sub1_sub2.anIntArray3476
					      [0])
					     ^ 0xffffffff)
					    >= (104 + -(class133_sub1_sub2
							.anInt3493)
						^ 0xffffffff))
					&& ((class133_sub1_sub2.anIntArray3443
					     [0])
					    ^ 0xffffffff) <= -1
					&& (((-class133_sub1_sub2.anInt3493
					      + 104)
					     ^ 0xffffffff)
					    <= ((class133_sub1_sub2
						 .anIntArray3443[0])
						^ 0xffffffff))
					&& (Class14_Sub21.aClass32Array3100
						[Class14_Sub2_Sub3.anInt3785]
						.method1062
					    ((class133_sub1_sub2.anIntArray3443
					      [0]),
					     (class133_sub1_sub2.anInt3495
					      >> 1024603623),
					     (byte) 24,
					     (class133_sub1_sub2.anIntArray3476
					      [0]),
					     (class133_sub1_sub2.anInt3436
					      >> 878223751)))) {
					if (1 < class133_sub1_sub2.anInt3493) {
					    for (int i_27_
						     = (class133_sub1_sub2
							.anIntArray3476[0]);
						 ((((class133_sub1_sub2
						     .anIntArray3476[0])
						    - -(class133_sub1_sub2
							.anInt3493))
						   ^ 0xffffffff)
						  < (i_27_ ^ 0xffffffff));
						 i_27_++) {
						for (int i_28_
							 = (class133_sub1_sub2
							    .anIntArray3443
							    [0]);
						     ((((class133_sub1_sub2
							 .anIntArray3443[0])
							- -(class133_sub1_sub2
							    .anInt3493))
						       ^ 0xffffffff)
						      < (i_28_ ^ 0xffffffff));
						     i_28_++) {
						    if ((i
							 & (Class14_Sub21
							    .aClass32Array3100
							    [(Class14_Sub2_Sub3
							      .anInt3785)]
							    .anIntArrayArray546
							    [i_27_][i_28_]))
							!= 0)
							continue while_27_;
						}
					    }
					}
					class133_sub1_sub2.anInt3498 = 1;
				    }
				}
			    }
			    Class14_Sub2_Sub10.method307(-71,
							 class133_sub1_sub2);
			    Class47.method1183((byte) 118, class133_sub1_sub2);
			    Class125.method1722(class133_sub1_sub2,
						(byte) -112);
			    Class14_Sub21.aClass32Array3100
				[Class14_Sub2_Sub3.anInt3785].method1073
				(class133_sub1_sub2.anInt3493,
				 class133_sub1_sub2.anInt3495 >> 1303664455,
				 class133_sub1_sub2.anInt3436 >> 1621482279,
				 class133_sub1_sub2.anInt3493, false, false);
			}
		    }
		    if (-1 == (Class142.anInt2315 ^ 0xffffffff)
			&& Class56.anInt918 == 0) {
			if ((Class89.anInt1415 ^ 0xffffffff) == -3)
			    Class53.method1216(128);
			else
			    Class14_Sub8_Sub7.method511(3);
			if ((Class14_Sub8_Sub38.anInt4741 >> -920570553
			     ^ 0xffffffff) > -15
			    || (Class14_Sub8_Sub38.anInt4741 >> -477370329
				^ 0xffffffff) <= -91
			    || Class14_Sub30.anInt3271 >> -1412956057 < 14
			    || -91 >= (Class14_Sub30.anInt3271 >> 483139463
				       ^ 0xffffffff))
			    Class118.method1608(-13873);
		    }
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = ((Class14_Sub21)
			       Class126.aClass2_2093.method78(128));
			if (class14_sub21 == null)
			    break;
			Class94 class94 = class14_sub21.aClass94_3116;
			if (-1 >= (class94.anInt1478 ^ 0xffffffff)) {
			    Class94 class94_29_
				= Class55.method1233(class94.anInt1540, 21803);
			    if (null == class94_29_
				|| class94_29_.aClass94Array1486 == null
				|| ((class94.anInt1478 ^ 0xffffffff)
				    <= (class94_29_.aClass94Array1486.length
					^ 0xffffffff))
				|| (class94_29_.aClass94Array1486
				    [class94.anInt1478]) != class94)
				continue;
			}
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		    }
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = ((Class14_Sub21)
			       Class14_Sub15.aClass2_2988.method78(128));
			if (class14_sub21 == null)
			    break;
			Class94 class94 = class14_sub21.aClass94_3116;
			if (0 <= class94.anInt1478) {
			    Class94 class94_30_
				= Class55.method1233(class94.anInt1540, 21803);
			    if (class94_30_ == null
				|| class94_30_.aClass94Array1486 == null
				|| ((class94.anInt1478 ^ 0xffffffff)
				    <= (class94_30_.aClass94Array1486.length
					^ 0xffffffff))
				|| class94 != (class94_30_.aClass94Array1486
					       [class94.anInt1478]))
				continue;
			}
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		    }
		    for (;;) {
			Class14_Sub21 class14_sub21
			    = ((Class14_Sub21)
			       Class1.aClass2_70.method78(arg0 ^ 0xe6));
			if (class14_sub21 == null)
			    break;
			Class94 class94 = class14_sub21.aClass94_3116;
			if (class94.anInt1478 >= 0) {
			    Class94 class94_31_
				= Class55.method1233(class94.anInt1540, 21803);
			    if (class94_31_ == null
				|| class94_31_.aClass94Array1486 == null
				|| ((class94.anInt1478 ^ 0xffffffff)
				    <= (class94_31_.aClass94Array1486.length
					^ 0xffffffff))
				|| (class94_31_.aClass94Array1486
				    [class94.anInt1478]) != class94)
				continue;
			}
			Class133_Sub3.method1830(class14_sub21,
						 arg0 ^ ~0x75d55ede);
		    }
		    if (null != Class67.aClass94_1060)
			Class7_Sub1.method122(false);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_29_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "client.E(" + arg0 + ')');
		}
	} while (false);
    }
    
    public void method54(int arg0, byte arg1) {
	try {
	    Class14_Sub1.anInt2721 = 0;
	    Class81.aClass31_1328 = null;
	    if ((Class84.anInt1346 ^ 0xffffffff)
		!= (Class131.anInt2164 ^ 0xffffffff))
		Class131.anInt2164 = Class84.anInt1346;
	    else
		Class131.anInt2164 = Class99_Sub2.anInt3348;
	    Class133_Sub1_Sub1.aClass36_4939 = null;
	    Class125_Sub1.anInt3363++;
	    if (2 > Class125_Sub1.anInt3363
		|| -8 != (arg0 ^ 0xffffffff) && (arg0 ^ 0xffffffff) != -10) {
		if (Class125_Sub1.anInt3363 < 2 || arg0 != 6) {
		    if (4 <= Class125_Sub1.anInt3363) {
			if (Class14_Sub8_Sub16.anInt4356 != 0
			    && ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff)
				!= -6))
			    Class81.anInt1314 = 3000;
			else {
			    method28("js5connect", -1);
			    Class14_Sub8_Sub16.anInt4356 = 1000;
			}
		    }
		} else {
		    method28("js5connect_outofdate", -1);
		    Class14_Sub8_Sub16.anInt4356 = 1000;
		}
	    } else if (0 == Class14_Sub8_Sub16.anInt4356
		       || Class14_Sub8_Sub16.anInt4356 == 5) {
		method28("js5connect_full", -1);
		Class14_Sub8_Sub16.anInt4356 = 1000;
	    } else
		Class81.anInt1314 = 3000;
	    anInt2632++;
	    if (arg1 >= -118)
		aClass124_2625 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("client.P(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void main(String[] arg0) {
	try {
	    try {
		if (-8 < (arg0.length ^ 0xffffffff) || arg0.length > 8)
		    Class44.method1154(-10033);
		Class120.anInt2005 = Integer.parseInt(arg0[0]);
		if (!arg0[1].equals("live")) {
		    if (!arg0[1].equals("office")) {
			if (arg0[1].equals("local"))
			    Class7.anInt182 = 2;
			else
			    Class44.method1154(-10033);
		    } else
			Class7.anInt182 = 1;
		} else
		    Class7.anInt182 = 0;
		if (!arg0[2].equals("live")) {
		    if (arg0[2].equals("rc"))
			Class111.anInt1859 = 1;
		    else if (!arg0[2].equals("wip"))
			Class44.method1154(-10033);
		    else
			Class111.anInt1859 = 2;
		} else
		    Class111.anInt1859 = 0;
		if (!arg0[4].equals("free")) {
		    if (arg0[4].equals("members"))
			Class132.aBoolean2170 = true;
		    else
			Class44.method1154(-10033);
		} else
		    Class132.aBoolean2170 = false;
		if (arg0[5].equals("english"))
		    Class125_Sub2.anInt3383 = 0;
		else if (arg0[5].equals("german")) {
		    Class133_Sub5.method1848(false);
		    Class125_Sub2.anInt3383 = 1;
		} else
		    Class44.method1154(-10033);
		if (!arg0[6].equals("game0")) {
		    if (!arg0[6].equals("game1"))
			Class44.method1154(-10033);
		    else
			Class14_Sub2_Sub1.anInt3749 = 1;
		} else
		    Class14_Sub2_Sub1.anInt3749 = 0;
		if (-9 != (arg0.length ^ 0xffffffff))
		    Class14_Sub8_Sub37.aBoolean4721 = false;
		else if (arg0[7].equals("safemode"))
		    Class14_Sub8_Sub37.aBoolean4721 = true;
		else
		    Class44.method1154(-10033);
		Class14_Sub8_Sub31.aString4605 = "127.0.0.1";
		Class14_Sub2_Sub11.anInt3884 = 0;
		Class14_Sub9_Sub1.aClass124_4829
		    = Class14_Sub8_Sub9.aClass124_4244;
		client var_client = new client();
		var_client.method32(27, 508, 503, 765, "runescape",
				    Class111.anInt1859 + 32, (byte) 124);
		Class14_Sub14.aFrame2986.setLocation(40, 40);
	    } catch (Exception exception) {
		Class14_Sub9_Sub3.method738(null, exception, 95);
	    }
	    anInt2643++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("client.main("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method55(Class94[] arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7) {
	for (int i = 0; i < arg0.length; i++) {
	    Class94 class94 = arg0[i];
	    if (class94 != null && class94.anInt1540 == arg1
		&& (!class94.aBoolean1455 || class94.anInt1489 == 0
		    || class94.aBoolean1564 || method46(class94) != 0
		    || class94 == Class20.aClass94_420
		    || class94.anInt1498 == 1338)
		&& (!class94.aBoolean1455 || !method49(class94))) {
		int i_32_ = class94.anInt1523 + arg6;
		int i_33_ = class94.anInt1583 + arg7;
		int i_34_;
		int i_35_;
		int i_36_;
		int i_37_;
		if (class94.anInt1489 == 2) {
		    i_34_ = arg2;
		    i_35_ = arg3;
		    i_36_ = arg4;
		    i_37_ = arg5;
		} else {
		    int i_38_ = i_32_ + class94.anInt1518;
		    int i_39_ = i_33_ + class94.anInt1545;
		    if (class94.anInt1489 == 9) {
			i_38_++;
			i_39_++;
		    }
		    i_34_ = i_32_ > arg2 ? i_32_ : arg2;
		    i_35_ = i_33_ > arg3 ? i_33_ : arg3;
		    i_36_ = i_38_ < arg4 ? i_38_ : arg4;
		    i_37_ = i_39_ < arg5 ? i_39_ : arg5;
		}
		if (class94 == Class67.aClass94_1060) {
		    Class122.aBoolean2056 = true;
		    Class35.anInt602 = i_32_;
		    Class47.anInt796 = i_33_;
		}
		if (!class94.aBoolean1455 || i_34_ < i_36_ && i_35_ < i_37_) {
		    if (class94.anInt1489 == 0) {
			if (!class94.aBoolean1455 && method49(class94)
			    && Class125_Sub3.aClass94_3410 != class94)
			    continue;
			if (class94.aBoolean1584
			    && Class14_Sub8_Sub33.anInt4640 >= i_34_
			    && Class107.anInt1804 >= i_35_
			    && Class14_Sub8_Sub33.anInt4640 < i_36_
			    && Class107.anInt1804 < i_37_) {
			    for (Class14_Sub21 class14_sub21
				     = ((Class14_Sub21)
					Class1.aClass2_70.method77(0));
				 class14_sub21 != null;
				 class14_sub21
				     = ((Class14_Sub21)
					Class1.aClass2_70.method84(-60))) {
				if (class14_sub21.aBoolean3109)
				    class14_sub21.method233(0);
			    }
			    if (Class125_Sub4.anInt3419 == 0) {
				Class67.aClass94_1060 = null;
				Class20.aClass94_420 = null;
			    }
			    Class14_Sub2.aBoolean2736 = false;
			}
		    }
		    if (class94.aBoolean1455) {
			boolean bool;
			if (Class14_Sub8_Sub33.anInt4640 >= i_34_
			    && Class107.anInt1804 >= i_35_
			    && Class14_Sub8_Sub33.anInt4640 < i_36_
			    && Class107.anInt1804 < i_37_)
			    bool = true;
			else
			    bool = false;
			boolean bool_40_ = false;
			if (Class14_Sub8_Sub30.anInt4599 == 1 && bool)
			    bool_40_ = true;
			boolean bool_41_ = false;
			if (Class7_Sub3_Sub1.anInt3714 == 1
			    && Class125_Sub1.anInt3367 >= i_34_
			    && Class139.anInt2230 >= i_35_
			    && Class125_Sub1.anInt3367 < i_36_
			    && Class139.anInt2230 < i_37_)
			    bool_41_ = true;
			if (Class152.anInt2440 > 0
			    && class94.aByteArray1491 != null) {
			    for (int i_42_ = 0;
				 i_42_ < class94.aByteArray1491.length;
				 i_42_++) {
				for (int i_43_ = 0; i_43_ < Class152.anInt2440;
				     i_43_++) {
				    int i_44_
					= class94.aByteArray1491[i_42_] & 0xff;
				    if (i_44_
					== Class14_Sub11.anIntArray2948[i_43_])
					Class14_Sub8_Sub18.method574
					    (i_42_ + 1, -1, 123,
					     class94.anInt1548,
					     Class14_Sub8_Sub9.aClass124_4244);
				}
			    }
			}
			if (bool_41_)
			    Class133_Sub5.method1843
				(-46, Class139.anInt2230 - i_33_, class94,
				 Class125_Sub1.anInt3367 - i_32_);
			if (Class67.aClass94_1060 != null
			    && Class67.aClass94_1060 != class94 && bool
			    && Class14_Sub8_Sub9.method521((byte) 77,
							   method46(class94)))
			    Class14_Sub19.aClass94_3070 = class94;
			if (class94 == Class20.aClass94_420) {
			    Class59.aBoolean954 = true;
			    Class108.anInt1824 = i_32_;
			    Class48.anInt798 = i_33_;
			}
			if (class94.aBoolean1564 || class94.anInt1498 != 0) {
			    if (bool && Class113.anInt1881 != 0
				&& class94.anObjectArray1463 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aBoolean3109 = true;
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anInt3106 = Class113.anInt1881;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1463;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -128);
			    }
			    if (Class67.aClass94_1060 != null
				|| Class14_Sub8_Sub21.aClass94_4446 != null
				|| Class133_Sub5.aBoolean3628
				|| (class94.anInt1498 != 1400
				    && Class14_Sub2.aBoolean2736)) {
				bool_41_ = false;
				bool_40_ = false;
				bool = false;
			    }
			    if (class94.anInt1498 != 0) {
				if (class94.anInt1498 == 1337) {
				    Class127.aClass94_2114 = class94;
				    Class103.method1531((byte) -50, class94);
				    continue;
				}
				if (class94.anInt1498 == 1338) {
				    if (bool_41_)
					Class14_Sub8_Sub1.method487
					    ((byte) 108,
					     Class139.anInt2230 - i_33_,
					     class94,
					     Class125_Sub1.anInt3367 - i_32_);
				    continue;
				}
				if (class94.anInt1498 == 1400) {
				    Class97.aClass94_1657 = class94;
				    if (bool_41_) {
					if ((Class14_Sub8_Sub29
					     .aBooleanArray4581[82])
					    && Class152.anInt2439 > 0) {
					    int i_45_
						= (int) ((double) ((Class125_Sub1
								    .anInt3367)
								   - i_32_
								   - ((class94
								       .anInt1518)
								      / 2))
							 * 2.0
							 / (double) (Class90
								     .aFloat1426));
					    int i_46_
						= (int) ((double) ((Class139
								    .anInt2230)
								   - i_33_
								   - ((class94
								       .anInt1545)
								      / 2))
							 * 2.0
							 / (double) (Class90
								     .aFloat1426));
					    int i_47_
						= Class37.anInt644 + i_45_;
					    int i_48_
						= (Class133_Sub6.anInt3659
						   + i_46_);
					    int i_49_
						= i_47_ + Class65.anInt1034;
					    int i_50_
						= (Class14_Sub8_Sub15.anInt4332
						   - 1 - i_48_
						   + Class35.anInt603);
					    Class7_Sub2.method125(i_49_, i_50_,
								  63, 0);
					    Class140.method1958((byte) 73);
					} else {
					    Class14_Sub2.aBoolean2736 = true;
					    Class14_Sub8_Sub3.anInt4132
						= Class14_Sub8_Sub33.anInt4640;
					    Canvas_Sub2.anInt63
						= Class107.anInt1804;
					    Class36.anInt631
						= Class37.anInt644;
					    Class33.anInt586
						= Class133_Sub6.anInt3659;
					}
				    } else if (bool_40_
					       && Class14_Sub2.aBoolean2736) {
					Class44.method1155
					    (-1,
					     (Class36.anInt631
					      + (int) ((double) ((Class14_Sub8_Sub3
								  .anInt4132)
								 - (Class14_Sub8_Sub33
								    .anInt4640))
						       * 2.0
						       / (double) (Class14_Sub8
								   .aFloat2854))));
					Class14_Sub2.method242
					    (-1,
					     (Class33.anInt586
					      + (int) ((double) ((Canvas_Sub2
								  .anInt63)
								 - (Class107
								    .anInt1804))
						       * 2.0
						       / (double) (Class14_Sub8
								   .aFloat2854))));
				    } else
					Class14_Sub2.aBoolean2736 = false;
				    continue;
				}
				if (class94.anInt1498 == 1401) {
				    if (bool_40_)
					Class73.method1330(((Class14_Sub8_Sub33
							     .anInt4640)
							    - i_32_),
							   class94.anInt1518,
							   class94.anInt1545,
							   (Class107.anInt1804
							    - i_33_),
							   -1);
				    continue;
				}
				if (class94.anInt1498 == 1402
				    || class94.anInt1498 == 1404)
				    continue;
			    }
			    if (!class94.aBoolean1511 && bool_41_) {
				class94.aBoolean1511 = true;
				if (class94.anObjectArray1458 != null) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aBoolean3109 = true;
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anInt3114
					= Class125_Sub1.anInt3367 - i_32_;
				    class14_sub21.anInt3106
					= Class139.anInt2230 - i_33_;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1458;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -120);
				}
			    }
			    if (class94.aBoolean1511 && bool_40_
				&& class94.anObjectArray1591 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aBoolean3109 = true;
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anInt3114
				    = Class14_Sub8_Sub33.anInt4640 - i_32_;
				class14_sub21.anInt3106
				    = Class107.anInt1804 - i_33_;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1591;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -120);
			    }
			    if (class94.aBoolean1511 && !bool_40_) {
				class94.aBoolean1511 = false;
				if (class94.anObjectArray1592 != null) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aBoolean3109 = true;
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anInt3114
					= Class14_Sub8_Sub33.anInt4640 - i_32_;
				    class14_sub21.anInt3106
					= Class107.anInt1804 - i_33_;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1592;
				    Class14_Sub15.aClass2_2988
					.method80(class14_sub21, (byte) -126);
				}
			    }
			    if (bool_40_
				&& class94.anObjectArray1594 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aBoolean3109 = true;
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anInt3114
				    = Class14_Sub8_Sub33.anInt4640 - i_32_;
				class14_sub21.anInt3106
				    = Class107.anInt1804 - i_33_;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1594;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -117);
			    }
			    if (!class94.aBoolean1462 && bool) {
				class94.aBoolean1462 = true;
				if (class94.anObjectArray1600 != null) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aBoolean3109 = true;
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anInt3114
					= Class14_Sub8_Sub33.anInt4640 - i_32_;
				    class14_sub21.anInt3106
					= Class107.anInt1804 - i_33_;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1600;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -123);
				}
			    }
			    if (class94.aBoolean1462 && bool
				&& class94.anObjectArray1456 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aBoolean3109 = true;
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anInt3114
				    = Class14_Sub8_Sub33.anInt4640 - i_32_;
				class14_sub21.anInt3106
				    = Class107.anInt1804 - i_33_;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1456;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -118);
			    }
			    if (class94.aBoolean1462 && !bool) {
				class94.aBoolean1462 = false;
				if (class94.anObjectArray1576 != null) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aBoolean3109 = true;
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anInt3114
					= Class14_Sub8_Sub33.anInt4640 - i_32_;
				    class14_sub21.anInt3106
					= Class107.anInt1804 - i_33_;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1576;
				    Class14_Sub15.aClass2_2988
					.method80(class14_sub21, (byte) -123);
				}
			    }
			    if (class94.anObjectArray1461 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1461;
				Class126.aClass2_2093.method80(class14_sub21,
							       (byte) -119);
			    }
			    if (class94.anObjectArray1596 != null
				&& (Class14_Sub8_Sub17.anInt4378
				    > class94.anInt1611)) {
				if (class94.anIntArray1566 == null
				    || (Class14_Sub8_Sub17.anInt4378
					- class94.anInt1611) > 32) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1596;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -126);
				} else {
				while_30_:
				    for (int i_51_ = class94.anInt1611;
					 i_51_ < Class14_Sub8_Sub17.anInt4378;
					 i_51_++) {
					int i_52_ = (Class141.anIntArray2246
						     [i_51_ & 0x1f]);
					for (int i_53_ = 0;
					     (i_53_
					      < class94.anIntArray1566.length);
					     i_53_++) {
					    if (class94.anIntArray1566[i_53_]
						== i_52_) {
						Class14_Sub21 class14_sub21
						    = new Class14_Sub21();
						class14_sub21.aClass94_3116
						    = class94;
						class14_sub21.anObjectArray3115
						    = (class94
						       .anObjectArray1596);
						Class1.aClass2_70.method80
						    (class14_sub21,
						     (byte) -128);
						break while_30_;
					    }
					}
				    }
				}
				class94.anInt1611
				    = Class14_Sub8_Sub17.anInt4378;
			    }
			    if (class94.anObjectArray1517 != null
				&& (Class14_Sub2_Sub17.anInt4018
				    > class94.anInt1525)) {
				if (class94.anIntArray1546 == null
				    || (Class14_Sub2_Sub17.anInt4018
					- class94.anInt1525) > 32) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1517;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -123);
				} else {
				while_31_:
				    for (int i_54_ = class94.anInt1525;
					 i_54_ < Class14_Sub2_Sub17.anInt4018;
					 i_54_++) {
					int i_55_ = (Class5.anIntArray147
						     [i_54_ & 0x1f]);
					for (int i_56_ = 0;
					     (i_56_
					      < class94.anIntArray1546.length);
					     i_56_++) {
					    if (class94.anIntArray1546[i_56_]
						== i_55_) {
						Class14_Sub21 class14_sub21
						    = new Class14_Sub21();
						class14_sub21.aClass94_3116
						    = class94;
						class14_sub21.anObjectArray3115
						    = (class94
						       .anObjectArray1517);
						Class1.aClass2_70.method80
						    (class14_sub21,
						     (byte) -124);
						break while_31_;
					    }
					}
				    }
				}
				class94.anInt1525
				    = Class14_Sub2_Sub17.anInt4018;
			    }
			    if (class94.anObjectArray1585 != null
				&& Class22.anInt461 > class94.anInt1593) {
				if (class94.anIntArray1557 == null
				    || (Class22.anInt461 - class94.anInt1593
					> 32)) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1585;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -121);
				} else {
				while_32_:
				    for (int i_57_ = class94.anInt1593;
					 i_57_ < Class22.anInt461; i_57_++) {
					int i_58_ = (Class24.anIntArray467
						     [i_57_ & 0x1f]);
					for (int i_59_ = 0;
					     (i_59_
					      < class94.anIntArray1557.length);
					     i_59_++) {
					    if (class94.anIntArray1557[i_59_]
						== i_58_) {
						Class14_Sub21 class14_sub21
						    = new Class14_Sub21();
						class14_sub21.aClass94_3116
						    = class94;
						class14_sub21.anObjectArray3115
						    = (class94
						       .anObjectArray1585);
						Class1.aClass2_70.method80
						    (class14_sub21,
						     (byte) -128);
						break while_32_;
					    }
					}
				    }
				}
				class94.anInt1593 = Class22.anInt461;
			    }
			    if (class94.anObjectArray1608 != null
				&& (Class133_Sub5.anInt3612
				    > class94.anInt1494)) {
				if (class94.anIntArray1470 == null
				    || (Class133_Sub5.anInt3612
					- class94.anInt1494) > 32) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1608;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -128);
				} else {
				while_33_:
				    for (int i_60_ = class94.anInt1494;
					 i_60_ < Class133_Sub5.anInt3612;
					 i_60_++) {
					int i_61_
					    = (Class14_Sub4.anIntArray2786
					       [i_60_ & 0x1f]);
					for (int i_62_ = 0;
					     (i_62_
					      < class94.anIntArray1470.length);
					     i_62_++) {
					    if (class94.anIntArray1470[i_62_]
						== i_61_) {
						Class14_Sub21 class14_sub21
						    = new Class14_Sub21();
						class14_sub21.aClass94_3116
						    = class94;
						class14_sub21.anObjectArray3115
						    = (class94
						       .anObjectArray1608);
						Class1.aClass2_70.method80
						    (class14_sub21,
						     (byte) -122);
						break while_33_;
					    }
					}
				    }
				}
				class94.anInt1494 = Class133_Sub5.anInt3612;
			    }
			    if (class94.anObjectArray1504 != null
				&& Canvas_Sub2.anInt54 > class94.anInt1553) {
				if (class94.anIntArray1539 == null
				    || (Canvas_Sub2.anInt54 - class94.anInt1553
					> 32)) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1504;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -127);
				} else {
				while_34_:
				    for (int i_63_ = class94.anInt1553;
					 i_63_ < Canvas_Sub2.anInt54;
					 i_63_++) {
					int i_64_
					    = (Class14_Sub2.anIntArray2727
					       [i_63_ & 0x1f]);
					for (int i_65_ = 0;
					     (i_65_
					      < class94.anIntArray1539.length);
					     i_65_++) {
					    if (class94.anIntArray1539[i_65_]
						== i_64_) {
						Class14_Sub21 class14_sub21
						    = new Class14_Sub21();
						class14_sub21.aClass94_3116
						    = class94;
						class14_sub21.anObjectArray3115
						    = (class94
						       .anObjectArray1504);
						Class1.aClass2_70.method80
						    (class14_sub21,
						     (byte) -118);
						break while_34_;
					    }
					}
				    }
				}
				class94.anInt1553 = Canvas_Sub2.anInt54;
			    }
			    if ((Class14_Sub10_Sub1.anInt4877
				 > class94.anInt1587)
				&& class94.anObjectArray1524 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1524;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -120);
			    }
			    if (Class38.anInt2616 > class94.anInt1587
				&& class94.anObjectArray1500 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1500;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -128);
			    }
			    if (Class7_Sub2_Sub1.anInt3705 > class94.anInt1587
				&& class94.anObjectArray1457 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1457;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -118);
			    }
			    if (Class39.anInt660 > class94.anInt1587
				&& class94.anObjectArray1555 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1555;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -126);
			    }
			    if (Class129.anInt2131 > class94.anInt1587
				&& class94.anObjectArray1484 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1484;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -122);
			    }
			    class94.anInt1587 = Class14_Sub8_Sub23.anInt4478;
			    if (class94.anObjectArray1519 != null) {
				for (int i_66_ = 0; i_66_ < Class152.anInt2440;
				     i_66_++) {
				    Class14_Sub21 class14_sub21
					= new Class14_Sub21();
				    class14_sub21.aClass94_3116 = class94;
				    class14_sub21.anInt3113
					= Class14_Sub11.anIntArray2948[i_66_];
				    class14_sub21.anInt3103
					= Class125_Sub3.anIntArray3398[i_66_];
				    class14_sub21.anObjectArray3115
					= class94.anObjectArray1519;
				    Class1.aClass2_70.method80(class14_sub21,
							       (byte) -127);
				}
			    }
			    if (Class14_Sub8_Sub18.aBoolean4383
				&& class94.anObjectArray1601 != null) {
				Class14_Sub21 class14_sub21
				    = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115
				    = class94.anObjectArray1601;
				Class1.aClass2_70.method80(class14_sub21,
							   (byte) -127);
			    }
			}
		    }
		    if (!class94.aBoolean1455 && Class67.aClass94_1060 == null
			&& Class14_Sub8_Sub21.aClass94_4446 == null
			&& !Class133_Sub5.aBoolean3628) {
			if ((class94.anInt1563 >= 0 || class94.anInt1493 != 0)
			    && Class14_Sub8_Sub33.anInt4640 >= i_34_
			    && Class107.anInt1804 >= i_35_
			    && Class14_Sub8_Sub33.anInt4640 < i_36_
			    && Class107.anInt1804 < i_37_) {
			    if (class94.anInt1563 >= 0)
				Class125_Sub3.aClass94_3410
				    = arg0[class94.anInt1563];
			    else
				Class125_Sub3.aClass94_3410 = class94;
			}
			if (class94.anInt1489 == 8
			    && Class14_Sub8_Sub33.anInt4640 >= i_34_
			    && Class107.anInt1804 >= i_35_
			    && Class14_Sub8_Sub33.anInt4640 < i_36_
			    && Class107.anInt1804 < i_37_)
			    Class47.aClass94_784 = class94;
			if (class94.anInt1605 > class94.anInt1545)
			    Class97.method1491(i_32_ + class94.anInt1518,
					       i_33_, Class107.anInt1804,
					       class94.anInt1605, true,
					       Class14_Sub8_Sub33.anInt4640,
					       class94.anInt1545, class94);
		    }
		    if (class94.anInt1489 == 0) {
			method55(arg0, class94.anInt1548, i_34_, i_35_, i_36_,
				 i_37_, i_32_ - class94.anInt1490,
				 i_33_ - class94.anInt1547);
			if (class94.aClass94Array1486 != null)
			    method55(class94.aClass94Array1486,
				     class94.anInt1548, i_34_, i_35_, i_36_,
				     i_37_, i_32_ - class94.anInt1490,
				     i_33_ - class94.anInt1547);
			Class14_Sub15 class14_sub15
			    = ((Class14_Sub15)
			       (Class14_Sub30.aClass55_3275.method1230
				((long) class94.anInt1548, (byte) -120)));
			if (class14_sub15 != null)
			    Class12.method218(-30776, i_37_, i_32_, i_35_,
					      class14_sub15.anInt2999, i_33_,
					      i_34_, i_36_);
		    }
		}
	    }
	}
    }
    
    public void init() {
    while_36_:
	do {
	try {
	while_35_:
	    do {
		do {
		    try {
			anInt2627++;
			if (method41(0))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_35_;
		    }
		    return;
		} while (false);
		try {
		    Class120.anInt2005
			= Integer.parseInt(getParameter("worldid"));
		    Class111.anInt1859
			= Integer.parseInt(getParameter("modewhat"));
		    Class7.anInt182
			= Integer.parseInt(getParameter("modewhere"));
		    String string = getParameter("safemode");
		    if (string == null || !string.equals("1"))
			Class14_Sub8_Sub37.aBoolean4721 = false;
		    else
			Class14_Sub8_Sub37.aBoolean4721 = true;
		    String string_67_ = getParameter("members");
		    if (string_67_ != null && string_67_.equals("1"))
			Class132.aBoolean2170 = true;
		    else
			Class132.aBoolean2170 = false;
		    String string_68_ = getParameter("lang");
		    if (null != string_68_ && string_68_.equals("1")) {
			Class133_Sub5.method1848(false);
			Class125_Sub2.anInt3383 = 1;
		    }
		    String string_69_ = getParameter("game");
		    if (null == string_69_ || !string_69_.equals("1"))
			Class14_Sub2_Sub1.anInt3749 = 0;
		    else
			Class14_Sub2_Sub1.anInt3749 = 1;
		    try {
			Class99_Sub2.anInt3352
			    = Integer.parseInt(getParameter("js"));
			Class14_Sub2_Sub3.anInt3771
			    = Integer.parseInt(getParameter("plug"));
			Class14_Sub2_Sub11.anInt3884
			    = Integer.parseInt(getParameter("affid"));
		    } catch (Exception exception) {
			/* empty */
		    }
		    Class14_Sub9_Sub1.aClass124_4829
			= Class14_Sub2_Sub18_Sub2.aClass124_5083
			      .method1703(this, (byte) 127);
		    if (Class14_Sub9_Sub1.aClass124_4829 == null)
			Class14_Sub9_Sub1.aClass124_4829
			    = Class14_Sub8_Sub9.aClass124_4244;
		    String string_70_ = getParameter("advert");
		    if (null != string_70_) {
			byte[] is;
			try {
			    is = string_70_.getBytes("ISO-8859-1");
			} catch (UnsupportedEncodingException unsupportedencodingexception) {
			    is = string_70_.getBytes();
			}
			Class124 class124
			    = Class14.method231((byte) 98, is.length, is, 0);
			boolean bool = Class58.method1257(class124, 28883);
			if (bool)
			    Class5.aClass124_138 = class124;
		    }
		    Class14_Sub8_Sub31.aString4605 = getCodeBase().getHost();
		    method40(Class111.anInt1859 + 32, 503, 13062, 765, 508);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_36_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable, "client.init()");
		}
	} while (false);
    }
    
    public void method25(int arg0) {
	try {
	    if (Class111.anInt1859 != 0) {
		/* empty */
	    }
	    Class14_Sub14.method865(Class14_Sub8_Sub34.aClass43_4647,
				    Class14_Sub8_Sub37.aBoolean4721, -2);
	    Class99_Sub2.anInt3348 = (-1 != (Class7.anInt182 ^ 0xffffffff)
				      ? 50000 + Class120.anInt2005 : 443);
	    Class33.aShortArray580 = Class14_Sub1.aShortArray2717
		= Class14_Sub8_Sub39.aShortArray4747
		= Class7_Sub1.aShortArray2663 = new short[256];
	    if (-2 == (Class14_Sub2_Sub1.anInt3749 ^ 0xffffffff)) {
		Class14_Sub8_Sub24.aShortArrayArray4496
		    = Class14_Sub8_Sub5.aShortArrayArray4157;
		Class24.aShortArray471 = Class14_Sub8_Sub3.aShortArray4133;
		Class2.aShortArrayArray98
		    = Class14_Sub2_Sub10.aShortArrayArray3871;
		Class57.anInt935 = 16777215;
		Class57.anInt929 = 0;
		Class53.aShortArray866 = Class14_Sub8_Sub18.aShortArray4392;
	    } else {
		Class14_Sub8_Sub24.aShortArrayArray4496
		    = Class63.aShortArrayArray1001;
		Class53.aShortArray866 = Class12.aShortArray320;
		Class24.aShortArray471 = Class7.aShortArray183;
		Class2.aShortArrayArray98 = Canvas_Sub1.aShortArrayArray50;
	    }
	    Class84.anInt1346 = (-1 != (Class7.anInt182 ^ 0xffffffff)
				 ? 40000 - -Class120.anInt2005 : 43594);
	    Class131.anInt2164 = Class84.anInt1346;
	    Canvas_Sub2.method66(false);
	    Class14_Sub8_Sub17.method572(Class49.aCanvas819, false);
	    anInt2646++;
	    Class56_Sub1.method1242(Class49.aCanvas819, arg0 ^ 0xffffffff);
	    Class44.aClass129_726 = Class12.method222(-18108);
	    if (Class44.aClass129_726 != null)
		Class44.aClass129_726.method1760(-14827, Class49.aCanvas819);
	    Class14_Sub8_Sub3.anInt4128 = Class43.anInt708;
	    try {
		if (null != Class14_Sub8_Sub34.aClass43_4647.aClass30_720) {
		    Class14_Sub8_Sub1.aClass76_4098
			= new Class76((Class14_Sub8_Sub34.aClass43_4647
				       .aClass30_720),
				      5200, 0);
		    for (int i = 0; i < 27; i++)
			Class58.aClass76Array944[i]
			    = new Class76((Class14_Sub8_Sub34.aClass43_4647
					   .aClass30Array711[i]),
					  6000, 0);
		    Class14_Sub8_Sub28.aClass76_4569
			= new Class76((Class14_Sub8_Sub34.aClass43_4647
				       .aClass30_722),
				      6000, 0);
		    Class14_Sub23.aClass114_3126
			= new Class114(255, Class14_Sub8_Sub1.aClass76_4098,
				       Class14_Sub8_Sub28.aClass76_4569,
				       500000);
		    Class14_Sub2_Sub17.aClass76_4022
			= new Class76((Class14_Sub8_Sub34.aClass43_4647
				       .aClass30_716),
				      24, 0);
		    Class14_Sub8_Sub34.aClass43_4647.aClass30Array711 = null;
		    Class14_Sub8_Sub34.aClass43_4647.aClass30_716 = null;
		    Class14_Sub8_Sub34.aClass43_4647.aClass30_722 = null;
		    Class14_Sub8_Sub34.aClass43_4647.aClass30_720 = null;
		}
	    } catch (IOException ioexception) {
		Class14_Sub2_Sub17.aClass76_4022 = null;
		Class14_Sub8_Sub1.aClass76_4098 = null;
		Class14_Sub23.aClass114_3126 = null;
		Class14_Sub8_Sub28.aClass76_4569 = null;
	    }
	    if ((Class7.anInt182 ^ 0xffffffff) != arg0)
		Class133_Sub6.aBoolean3663 = true;
	    Class14_Sub8_Sub39_Sub1.aClass124_5099 = Class53.aClass124_869;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "client.G(" + arg0 + ')');
	}
    }
    
    public void method56(int arg0) {
	try {
	    anInt2642++;
	    if (arg0 <= 0)
		aClass124_2639 = null;
	    boolean bool = Class79.method1386(0);
	    if (!bool)
		method43(-123);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "client.L(" + arg0 + ')');
	}
    }
    
    public static Class94 method57(Class94 arg0) {
	int i = Class14_Sub8.method482(method46(arg0), true);
	if (i == 0)
	    return null;
	for (int i_71_ = 0; i_71_ < i; i_71_++) {
	    arg0 = Class55.method1233(arg0.anInt1540, 21803);
	    if (arg0 == null)
		return null;
	}
	return arg0;
    }
    
    static {
	aClass124_2625
	    = Class14_Sub2_Sub2.method263(1178, "Lade Wordpack )2 ");
	aClass124_2639 = aClass124_2636;
	aClass124Array2645 = new Class124[100];
	anInt2648 = 0;
	aClass124_2631 = aClass124_2637;
	anIntArray2644 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
    }
}