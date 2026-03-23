/* Class14_Sub8_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class14_Sub8_Sub33 extends Class14_Sub8
{
    public static int[] anIntArray4628;
    public static int anInt4629;
    public static int anInt4630;
    public static Class124 aClass124_4631;
    public static Class124 aClass124_4632
	= Class14_Sub2_Sub2.method263(1178, "blinken3:");
    public static int anInt4633;
    public static Class124 aClass124_4634;
    public static Class124 aClass124_4635;
    public static int anInt4636;
    public int anInt4637 = 4096;
    public static int anInt4638;
    public static int anInt4639;
    public static int anInt4640;
    public static int anInt4641;
    public static int anInt4642;
    public static Class124 aClass124_4643;
    public static Class124 aClass124_4644;
    
    public static int method653(int arg0, int arg1) {
	int i;
	try {
	    arg0--;
	    anInt4639++;
	    arg0 |= arg0 >>> 668247073;
	    arg0 |= arg0 >>> -311769726;
	    arg0 |= arg0 >>> -2049010684;
	    arg0 |= arg0 >>> -510542008;
	    arg0 |= arg0 >>> -403189392;
	    if (arg1 < 64)
		anInt4633 = 42;
	    i = arg0 - -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rk.D(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method654(int arg0) {
	try {
	    aClass124_4634 = null;
	    aClass124_4635 = null;
	    aClass124_4644 = null;
	    aClass124_4631 = null;
	    aClass124_4643 = null;
	    anIntArray4628 = null;
	    if (arg0 != 30)
		method654(-7);
	    aClass124_4632 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rk.E(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub33() {
	super(1, true);
    }
    
    public static short[] method655(int arg0, short[] arg1) {
    while_478_:
	do {
	    do {
		short[] is;
		try {
		    anInt4630++;
		    if (arg0 == 8111)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_478_;
		}
		return is;
	    } while (false);
	    do {
		short[] is;
		try {
		    if (null != arg1)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_478_;
		}
		return is;
	    } while (false);
	    short[] is;
	    try {
		short[] is_0_ = new short[arg1.length];
		Class72.method1319(arg1, 0, is_0_, 0, arg1.length);
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("rk.G(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static boolean method656(int arg0) throws IOException {
    while_490_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4641++;
		    if (Class14_Sub15.aClass36_2990 != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    int i;
	    do {
		boolean bool;
		try {
		    i = Class14_Sub15.aClass36_2990.method1104(24249);
		    if ((i ^ 0xffffffff) != -1)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	while_483_:
	    do {
		do {
		    boolean bool;
		    try {
			if (arg0 == Class133_Sub4.anInt3579) {
			    Class14_Sub15.aClass36_2990.method1099
				(1,
				 (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .aByteArray2895),
				 arg0 + 0, 0);
			    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.anInt2908
				= 0;
			    i--;
			    Class133_Sub4.anInt3579
				= Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734.method847(255);
			    Class14_Sub8_Sub12.anInt4280
				= (Class14_Sub14.anIntArray2985
				   [Class133_Sub4.anInt3579]);
			}
			if (0 != (Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff))
			    break while_483_;
			if (i > 0)
			    break;
			bool = false;
		    } catch (RuntimeException runtimeexception) {
			break while_490_;
		    }
		    return bool;
		} while (false);
		try {
		    Class14_Sub15.aClass36_2990.method1099
			(1, (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			     .aByteArray2895), arg0 ^ 0x0, 0);
		    i--;
		    Class14_Sub8_Sub12.anInt4280
			= (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			   .aByteArray2895[0]) & 0xff;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
	    } while (false);
	    if (-2 == Class14_Sub8_Sub12.anInt4280) {
		if (1 >= i)
		    return false;
		try {
		    Class14_Sub15.aClass36_2990.method1099
			(2, (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			     .aByteArray2895), -1, 0);
		    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.anInt2908 = 0;
		    Class14_Sub8_Sub12.anInt4280
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method784((byte) 115);
		    i -= 2;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
	    }
	    if ((i ^ 0xffffffff) > (Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff))
		return false;
	    do {
		boolean bool;
		try {
		    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.anInt2908 = 0;
		    Class14_Sub15.aClass36_2990.method1099
			(Class14_Sub8_Sub12.anInt4280,
			 (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			  .aByteArray2895),
			 arg0 + 0, 0);
		    Class14_Sub8_Sub2.anInt4114 = Class14_Sub2_Sub13.anInt3931;
		    Class14_Sub2_Sub13.anInt3931 = Class146.anInt2357;
		    Class146.anInt2357 = Class133_Sub4.anInt3579;
		    Class96.anInt1636 = 0;
		    if (-157 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_1_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method831(128);
		    int i_2_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method836((byte) 127);
		    int i_3_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method784((byte) 113);
		    Class60.method1270(i_3_, (byte) 46);
		    Class14_Sub8_Sub31.method645((byte) -26, i_2_, i_1_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -247)
			break;
		    int i_4_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method812((byte) -112);
		    Class14_Sub15 class14_sub15
			= ((Class14_Sub15)
			   Class14_Sub30.aClass55_3275.method1230((long) i_4_,
								  (byte) 73));
		    if (null != class14_sub15)
			Class14_Sub1.method236(true, class14_sub15,
					       (byte) -127);
		    if (Class125_Sub2.aClass94_3388 != null) {
			Class103.method1531((byte) -84,
					    Class125_Sub2.aClass94_3388);
			Class125_Sub2.aClass94_3388 = null;
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-212 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_5_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method798(arg0 ^ 0x4e);
		    int i_6_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method798(56);
		    int i_7_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method784((byte) 120);
		    int i_8_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method798(76);
		    int i_9_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method798(73);
		    Class7_Sub3_Sub1.method136(true, i_7_, i_9_, i_6_, 96,
					       i_5_, i_8_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 172)
			break;
		    int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -107);
		    RuntimeException_Sub1.aClass31_2458
			= Class14_Sub8_Sub34.aClass43_4647
			      .method1141((byte) 48, i_10_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-90 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(-127);
		    Class124 class124
			= (Class14_Sub2_Sub16.method368
			   (Class75.method1337
				(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734,
				 32767)
				.method1677(arg0 + 1)));
		    Class15.method943(class124, false,
				      Class46.method1174(l, (byte) 53)
					  .method1685(arg0 + 1),
				      6);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 117)
			break;
		    int i_11_ = (Class14_Sub8_Sub12.anInt4280
				 + (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .anInt2908));
		    int i_12_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 108);
		    int i_13_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 122);
		    if (Class14_Sub2_Sub12.anInt3912 != i_12_) {
			Class14_Sub2_Sub12.anInt3912 = i_12_;
			Class109.method1563(Class14_Sub2_Sub12.anInt3912, 106);
			Class26_Sub2.method1032(false, -1291652884);
			Class73.method1328(Class14_Sub2_Sub12.anInt3912, true);
			for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -101;
			     i_14_++)
			    Class14_Sub8_Sub36.aBooleanArray4698[i_14_] = true;
		    }
		    while (0 < i_13_--) {
			int i_15_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method812((byte) -90);
			int i_16_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 126);
			int i_17_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(118);
			Class14_Sub15 class14_sub15
			    = ((Class14_Sub15)
			       Class14_Sub30.aClass55_3275
				   .method1230((long) i_15_, (byte) 42));
			if (class14_sub15 != null) {
			    /* empty */
			}
			if (class14_sub15 != null
			    && class14_sub15.anInt2999 != i_16_) {
			    Class14_Sub1.method236(true, class14_sub15,
						   (byte) -127);
			    class14_sub15 = null;
			}
			if (class14_sub15 == null)
			    class14_sub15
				= Class14_Sub1.method237(1, i_15_, i_17_,
							 i_16_);
			class14_sub15.aBoolean2992 = true;
		    }
		    for (Class14_Sub15 class14_sub15
			     = (Class14_Sub15) Class14_Sub30.aClass55_3275
						   .method1228((byte) -97);
			 class14_sub15 != null;
			 class14_sub15
			     = (Class14_Sub15) Class14_Sub30.aClass55_3275
						   .method1227((byte) -23)) {
			if (!class14_sub15.aBoolean2992)
			    Class14_Sub1.method236(true, class14_sub15,
						   (byte) -123);
			else
			    class14_sub15.aBoolean2992 = false;
		    }
		    Class14_Sub8_Sub5.aClass55_4155
			.method1234(arg0 ^ 0xffffffff);
		    while (((Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			     .anInt2908)
			    ^ 0xffffffff)
			   > (i_11_ ^ 0xffffffff)) {
			int i_18_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method812((byte) -107);
			int i_19_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 103);
			int i_20_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 109);
			int i_21_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method812((byte) -115);
			for (int i_22_ = i_19_;
			     (i_20_ ^ 0xffffffff) <= (i_22_ ^ 0xffffffff);
			     i_22_++) {
			    long l
				= ((long) i_18_ << 1878237216) - -(long) i_22_;
			    Class14_Sub8_Sub5.aClass55_4155
				.method1224(8, l, new Class14_Sub1(i_21_));
			}
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 132)
			break;
		    Class14_Sub14.method870(6346, Class14_Sub8_Sub38
						      .aClass14_Sub10_Sub1_4734
						      .method797(9467));
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (178 != Class133_Sub4.anInt3579)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(-126);
		    long l_23_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 117);
		    long l_24_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method829(53);
		    int i_25_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-12);
		    long l_26_ = l_24_ + (l_23_ << 1938059296);
		    boolean bool_27_ = false;
		while_482_:
		    do {
			for (int i_28_ = 0; 100 > i_28_; i_28_++) {
			    if ((Class98.aLongArray1665[i_28_]
				 ^ 0xffffffffffffffffL)
				== (l_26_ ^ 0xffffffffffffffffL)) {
				bool_27_ = true;
				break while_482_;
			    }
			}
			if ((i_25_ ^ 0xffffffff) >= -2) {
			    if (1 == Class146.anInt2365
				|| -2 == (Class14_Sub2_Sub21.anInt4081
					  ^ 0xffffffff))
				bool_27_ = true;
			    else {
				for (int i_29_ = 0;
				     ((Class42.anInt698 ^ 0xffffffff)
				      < (i_29_ ^ 0xffffffff));
				     i_29_++) {
				    if ((l ^ 0xffffffffffffffffL)
					== (Class126.aLongArray2095[i_29_]
					    ^ 0xffffffffffffffffL)) {
					bool_27_ = true;
					break;
				    }
				}
			    }
			}
		    } while (false);
		    if (!bool_27_
			&& (Class14_Sub8_Sub39.anInt4754 ^ 0xffffffff) == -1) {
			Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352]
			    = l_26_;
			Class14_Sub8_Sub16.anInt4352
			    = (Class14_Sub8_Sub16.anInt4352 - -1) % 100;
			Class124 class124
			    = (Class14_Sub2_Sub16.method368
			       (Class75.method1337((Class14_Sub8_Sub38
						    .aClass14_Sub10_Sub1_4734),
						   32767).method1677(0)));
			if (-3 == (i_25_ ^ 0xffffffff) || i_25_ == 3)
			    Class15.method943
				(class124, false,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub19.aClass124_3075,
				      Class46.method1174(l, (byte) 67)
					  .method1685(arg0 + 1) }),
				   (byte) -111)),
				 7);
			else if (-2 == (i_25_ ^ 0xffffffff))
			    Class15.method943(class124, false,
					      (Class14_Sub8_Sub7.method515
					       ((new Class124[]
						 { (Class14_Sub21
						    .aClass124_3099),
						   Class46.method1174
						       (l, (byte) 91)
						       .method1685(0) }),
						(byte) -93)),
					      7);
			else
			    Class15.method943(class124, false,
					      Class46.method1174
						  (l, (byte) 112)
						  .method1685(0),
					      3);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -38)
			break;
		    Class45.method1160(0);
		    Class14_Sub4.anInt2789
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method805(0);
		    Class133_Sub4.anInt3579 = -1;
		    Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -174)
			break;
		    Class139.method1951((byte) 76, true);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	while_485_:
	    do {
	    while_484_:
		do {
		    long l;
		    int i_30_;
		    do {
			byte i_31_;
			Class124 class124;
			Class14_Sub23 class14_sub23;
			int i_32_;
			try {
			    if (-122 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
				break while_485_;
			    l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method796(arg0 + 32);
			    i_30_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 116);
			    i_31_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method780((byte) -77);
			    boolean bool = false;
			    if (0L != (~0x7fffffffffffffffL & l))
				bool = true;
			    if (bool)
				break;
			    class124
				= Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734
				      .method797(arg0 ^ ~0x24fb);
			    class14_sub23 = new Class14_Sub23();
			    class14_sub23.aLong355 = l;
			    class14_sub23.aClass124_3132
				= Class46.method1174(class14_sub23.aLong355,
						     (byte) 101);
			    class14_sub23.aByte3131 = i_31_;
			    class14_sub23.anInt3128 = i_30_;
			    class14_sub23.aClass124_3127 = class124;
			    i_32_ = Class14_Sub2_Sub21.anInt4084 + -1;
			} catch (RuntimeException runtimeexception) {
			    break while_490_;
			}
			while (-1 >= (i_32_ ^ 0xffffffff)) {
			    int i_33_
				= (Class133_Sub1_Sub2
				       .aClass14_Sub23Array4945[i_32_]
				       .aClass124_3132.method1698
				   ((byte) 81, class14_sub23.aClass124_3132));
			    if (0 == i_33_) {
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    [i_32_].anInt3128
				    = i_30_;
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    [i_32_].aByte3131
				    = i_31_;
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    [i_32_].aClass124_3127
				    = class124;
				if (Class48.aLong802 == l)
				    Class153.aByte2442 = i_31_;
				Class133_Sub4.anInt3579 = -1;
				Class7_Sub2_Sub1.anInt3705
				    = Class14_Sub8_Sub23.anInt4478;
				return true;
			    }
			    try {
				if (i_33_ < 0)
				    break;
				i_32_--;
			    } catch (RuntimeException runtimeexception) {
				break while_490_;
			    }
			}
			if ((Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff)
			    <= ((Class133_Sub1_Sub2
				 .aClass14_Sub23Array4945).length
				^ 0xffffffff)) {
			    Class133_Sub4.anInt3579 = -1;
			    return true;
			}
			try {
			    for (int i_34_ = Class14_Sub2_Sub21.anInt4084 + -1;
				 (i_32_ ^ 0xffffffff) > (i_34_ ^ 0xffffffff);
				 i_34_--)
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    [i_34_ - -1]
				    = (Class133_Sub1_Sub2
				       .aClass14_Sub23Array4945[i_34_]);
			    if (Class14_Sub2_Sub21.anInt4084 == 0)
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    = new Class14_Sub23[100];
			    Class133_Sub1_Sub2.aClass14_Sub23Array4945
				[1 + i_32_]
				= class14_sub23;
			    if (Class48.aLong802 == l)
				Class153.aByte2442 = i_31_;
			    Class14_Sub2_Sub21.anInt4084++;
			    break while_484_;
			} catch (RuntimeException runtimeexception) {
			    break while_490_;
			}
		    } while (false);
		    if (-1 == (Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff)) {
			Class133_Sub4.anInt3579 = -1;
			return true;
		    }
		    try {
			l &= 0x7fffffffffffffffL;
			boolean bool = false;
			int i_35_;
			for (i_35_ = 0;
			     (((i_35_ ^ 0xffffffff)
			       > (Class14_Sub2_Sub21.anInt4084 ^ 0xffffffff))
			      && ((Class133_Sub1_Sub2.aClass14_Sub23Array4945
				   [i_35_].aLong355) != l
				  || i_30_ != (Class133_Sub1_Sub2
					       .aClass14_Sub23Array4945[i_35_]
					       .anInt3128)));
			     i_35_++) {
			    /* empty */
			}
			if (i_35_ < Class14_Sub2_Sub21.anInt4084) {
			    for (/**/;
				 Class14_Sub2_Sub21.anInt4084 - 1 > i_35_;
				 i_35_++)
				Class133_Sub1_Sub2.aClass14_Sub23Array4945
				    [i_35_]
				    = (Class133_Sub1_Sub2
				       .aClass14_Sub23Array4945[i_35_ - -1]);
			    Class14_Sub2_Sub21.anInt4084--;
			    Class133_Sub1_Sub2.aClass14_Sub23Array4945
				[Class14_Sub2_Sub21.anInt4084]
				= null;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_490_;
		    }
		} while (false);
		Class7_Sub2_Sub1.anInt3705 = Class14_Sub8_Sub23.anInt4478;
		Class133_Sub4.anInt3579 = -1;
		return true;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-115 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    for (int i_36_ = 0;
			 ((i_36_ ^ 0xffffffff)
			  > ((Class14_Sub8_Sub23
			      .aClass133_Sub1_Sub1Array4474).length
			     ^ 0xffffffff));
			 i_36_++) {
			if (null != (Class14_Sub8_Sub23
				     .aClass133_Sub1_Sub1Array4474[i_36_]))
			    Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
				[i_36_].anInt3445
				= -1;
		    }
		    for (int i_37_ = 0;
			 ((i_37_ ^ 0xffffffff)
			  > (Class14_Sub4.aClass133_Sub1_Sub2Array2785.length
			     ^ 0xffffffff));
			 i_37_++) {
			if (null != (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				     [i_37_]))
			    Class14_Sub4.aClass133_Sub1_Sub2Array2785
				[i_37_].anInt3445
				= -1;
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -7)
			break;
		    int i_38_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method820((byte) 116);
		    int i_39_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method791(arg0 + -3976);
		    if (65535 == i_39_)
			i_39_ = -1;
		    Class94 class94 = Class55.method1233(i_38_, 21803);
		    if (2 != class94.anInt1543
			|| (i_39_ ^ 0xffffffff) != (class94.anInt1550
						    ^ 0xffffffff)) {
			class94.anInt1543 = 2;
			class94.anInt1550 = i_39_;
			Class103.method1531((byte) -127, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (64 != Class133_Sub4.anInt3579)
			break;
		    int i_40_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
		    if (i_40_ == 65535)
			i_40_ = -1;
		    int i_41_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method790(8);
		    Class94 class94
			= Class55.method1233(i_41_, arg0 ^ ~0x552b);
		    if (class94.anInt1543 != 1 || class94.anInt1550 != i_40_) {
			class94.anInt1543 = 1;
			class94.anInt1550 = i_40_;
			Class103.method1531((byte) -109, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -119)
			break;
		    int i_42_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -109);
		    int i_43_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -113);
		    Class14_Sub15 class14_sub15
			= ((Class14_Sub15)
			   Class14_Sub30.aClass55_3275
			       .method1230((long) i_42_, (byte) -110));
		    Class14_Sub15 class14_sub15_44_
			= ((Class14_Sub15)
			   Class14_Sub30.aClass55_3275
			       .method1230((long) i_43_, (byte) -114));
		    if (class14_sub15_44_ != null)
			Class14_Sub1.method236((null == class14_sub15
						|| ((class14_sub15.anInt2999
						     ^ 0xffffffff)
						    != ((class14_sub15_44_
							 .anInt2999)
							^ 0xffffffff))),
					       class14_sub15_44_, (byte) -119);
		    if (null != class14_sub15) {
			class14_sub15.method233(0);
			Class14_Sub30.aClass55_3275.method1224(8, (long) i_43_,
							       class14_sub15);
		    }
		    Class94 class94 = Class55.method1233(i_42_, 21803);
		    if (class94 != null)
			Class103.method1531((byte) -48, class94);
		    class94 = Class55.method1233(i_43_, 21803);
		    if (class94 != null) {
			Class103.method1531((byte) -88, class94);
			Class14_Sub2_Sub21.method445(class94, 18559, true);
		    }
		    if ((Class14_Sub2_Sub12.anInt3912 ^ 0xffffffff) != 0)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912,
					   (byte) 46, 1);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 174)
			break;
		    int i_45_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 110);
		    int i_46_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method791(-3977);
		    int i_47_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method820((byte) 118);
		    Class94 class94 = Class55.method1233(i_47_, 21803);
		    Class133_Sub4.anInt3579 = -1;
		    class94.anInt1505 = i_46_ + (i_45_ << 1374494736);
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	while_486_:
	    do {
		long l;
		do {
		    boolean bool;
		    try {
			if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -83)
			    break while_486_;
			Class7_Sub2_Sub1.anInt3705
			    = Class14_Sub8_Sub23.anInt4478;
			l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.method796(-118);
			if (l != 0L)
			    break;
			Class14_Sub2_Sub21.anInt4084 = 0;
			Class7_Sub3_Sub1.aClass124_3710 = null;
			Class133_Sub1_Sub2.aClass14_Sub23Array4945 = null;
			Class133_Sub4.anInt3579 = -1;
			Class4.aClass124_129 = null;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_490_;
		    }
		    return bool;
		} while (false);
		int i_48_;
		do {
		    boolean bool;
		    try {
			long l_49_
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method796(59);
			Class7_Sub3_Sub1.aClass124_3710
			    = Class46.method1174(l_49_, (byte) 55);
			Class4.aClass124_129
			    = Class46.method1174(l, (byte) 119);
			Class14_Sub30.aByte3283
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method780((byte) -77);
			i_48_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(96);
			if (i_48_ != 255)
			    break;
			Class133_Sub4.anInt3579 = -1;
			bool = true;
		    } catch (RuntimeException runtimeexception) {
			break while_490_;
		    }
		    return bool;
		} while (false);
		boolean bool;
		try {
		    Class14_Sub2_Sub21.anInt4084 = i_48_;
		    Class14_Sub23[] class14_sub23s = new Class14_Sub23[100];
		    for (int i_50_ = 0; Class14_Sub2_Sub21.anInt4084 > i_50_;
			 i_50_++) {
			class14_sub23s[i_50_] = new Class14_Sub23();
			class14_sub23s[i_50_].aLong355
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method796(-23);
			class14_sub23s[i_50_].aClass124_3132
			    = Class46.method1174((class14_sub23s[i_50_]
						  .aLong355),
						 (byte) 89);
			class14_sub23s[i_50_].anInt3128
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method784((byte) 124);
			class14_sub23s[i_50_].aByte3131
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method780((byte) -77);
			class14_sub23s[i_50_].aClass124_3127
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method797(arg0 + 9468);
			if (class14_sub23s[i_50_].aLong355 == Class48.aLong802)
			    Class153.aByte2442
				= class14_sub23s[i_50_].aByte3131;
		    }
		    boolean bool_51_ = false;
		    int i_52_ = Class14_Sub2_Sub21.anInt4084;
		    do {
			if (-1 <= (i_52_ ^ 0xffffffff))
			    break;
			i_52_--;
			bool_51_ = true;
			for (int i_53_ = 0;
			     (i_52_ ^ 0xffffffff) < (i_53_ ^ 0xffffffff);
			     i_53_++) {
			    if (-1
				> ((class14_sub23s[i_53_].aClass124_3132
					.method1698
				    ((byte) 52,
				     class14_sub23s[1 + i_53_].aClass124_3132))
				   ^ 0xffffffff)) {
				Class14_Sub23 class14_sub23
				    = class14_sub23s[i_53_];
				bool_51_ = false;
				class14_sub23s[i_53_]
				    = class14_sub23s[1 + i_53_];
				class14_sub23s[1 + i_53_] = class14_sub23;
			    }
			}
		    } while (!bool_51_);
		    Class133_Sub1_Sub2.aClass14_Sub23Array4945
			= class14_sub23s;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 99)
			break;
		    Class45.method1160(0);
		    Class1.anInt73
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(124);
		    Class133_Sub4.anInt3579 = -1;
		    Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 176)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(30);
		    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			.method780((byte) -77);
		    long l_54_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method796(26);
		    long l_55_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 113);
		    long l_56_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method829(arg0 + -118);
		    int i_57_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(arg0 + 56);
		    int i_58_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 111);
		    long l_59_ = (l_55_ << 1619452320) + l_56_;
		    boolean bool_60_ = false;
		while_481_:
		    do {
			for (int i_61_ = 0; (i_61_ ^ 0xffffffff) > -101;
			     i_61_++) {
			    if (l_59_ == Class98.aLongArray1665[i_61_]) {
				bool_60_ = true;
				break while_481_;
			    }
			}
			if (-2 <= (i_57_ ^ 0xffffffff)) {
			    for (int i_62_ = 0;
				 ((i_62_ ^ 0xffffffff)
				  > (Class42.anInt698 ^ 0xffffffff));
				 i_62_++) {
				if ((Class126.aLongArray2095[i_62_]
				     ^ 0xffffffffffffffffL)
				    == (l ^ 0xffffffffffffffffL)) {
				    bool_60_ = true;
				    break;
				}
			    }
			}
		    } while (false);
		    if (!bool_60_
			&& (Class14_Sub8_Sub39.anInt4754 ^ 0xffffffff) == -1) {
			Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352]
			    = l_59_;
			Class14_Sub8_Sub16.anInt4352
			    = (1 + Class14_Sub8_Sub16.anInt4352) % 100;
			Class124 class124
			    = (Class14_Sub2_Sub3.method272
				   (i_58_, (byte) 63).method442
			       (-1,
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
			if ((i_57_ ^ 0xffffffff) != -3 && i_57_ != 3) {
			    if (-2 != (i_57_ ^ 0xffffffff))
				Class14_Sub8_Sub3.method493((byte) -71,
							    Class46.method1174
								(l_54_,
								 (byte) 47)
								.method1685(0),
							    Class46.method1174
								(l, (byte) 104)
								.method1685(0),
							    20, class124,
							    i_58_);
			    else
				Class14_Sub8_Sub3.method493
				    ((byte) -89,
				     Class46.method1174(l_54_, (byte) 102)
					 .method1685(0),
				     (Class14_Sub8_Sub7.method515
				      ((new Class124[]
					{ Class14_Sub21.aClass124_3099,
					  (Class46.method1174(l, (byte) 50)
					       .method1685
					   (arg0 ^ 0xffffffff)) }),
				       (byte) -33)),
				     20, class124, i_58_);
			} else
			    Class14_Sub8_Sub3.method493
				((byte) -61,
				 Class46.method1174(l_54_, (byte) 127)
				     .method1685(0),
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub19.aClass124_3075,
				      Class46.method1174(l, (byte) 125)
					  .method1685(0) }),
				   (byte) -104)),
				 20, class124, i_58_);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 245)
			break;
		    int i_63_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method820((byte) 5);
		    int i_64_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method805(0);
		    Class94 class94 = Class55.method1233(i_63_, 21803);
		    if ((i_64_ ^ 0xffffffff) != (class94.anInt1598
						 ^ 0xffffffff)
			|| (i_64_ ^ 0xffffffff) == 0) {
			class94.anInt1598 = i_64_;
			class94.anInt1610 = 0;
			class94.anInt1603 = 0;
			Class103.method1531((byte) -61, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-105 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class14_Sub1.method238((byte) 55);
		    Class133_Sub4.anInt3579 = -1;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -240)
			break;
		    int i_65_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 110);
		    int i_66_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method819(arg0 + 4);
		    if (i_66_ == 2)
			Class14_Sub8_Sub12.method536(false);
		    Class14_Sub2_Sub12.anInt3912 = i_65_;
		    Class109.method1563(i_65_, arg0 ^ ~0x7c);
		    Class26_Sub2.method1032(false, -1291652884);
		    Class73.method1328(Class14_Sub2_Sub12.anInt3912, true);
		    for (int i_67_ = 0; (i_67_ ^ 0xffffffff) > -101; i_67_++)
			Class14_Sub8_Sub36.aBooleanArray4698[i_67_] = true;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-9 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class7_Sub2.anInt2675
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method781(false) * 30;
		    Class133_Sub4.anInt3579 = -1;
		    Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -102)
			break;
		    int i_68_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -114);
		    Class94 class94
			= Class55.method1233(i_68_, arg0 ^ ~0x552b);
		    class94.anInt1543 = 3;
		    class94.anInt1550
			= Class14_Sub3.aClass133_Sub1_Sub1_2748
			      .aClass102_4941.method1520(1073741824);
		    Class103.method1531((byte) -73, class94);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -147)
			break;
		    int i_69_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
		    if (-65536 == (i_69_ ^ 0xffffffff))
			i_69_ = -1;
		    Class98.method1492(i_69_, (byte) -85);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (251 != Class133_Sub4.anInt3579)
			break;
		    int i_70_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
		    if (65535 == i_70_)
			i_70_ = -1;
		    int i_71_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method828((byte) -120);
		    Class153.method2049(i_70_, i_71_, -1);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-256 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_72_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -92);
		    int i_73_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 111);
		    Class94 class94;
		    if (0 > i_72_)
			class94 = null;
		    else
			class94 = Class55.method1233(i_72_, 21803);
		    if (class94 != null) {
			for (int i_74_ = 0;
			     ((class94.anIntArray1452.length ^ 0xffffffff)
			      < (i_74_ ^ 0xffffffff));
			     i_74_++) {
			    class94.anIntArray1452[i_74_] = 0;
			    class94.anIntArray1542[i_74_] = 0;
			}
		    }
		    if (i_72_ < -70000)
			i_73_ += 32768;
		    Class124.method1687(i_73_, (byte) 88);
		    int i_75_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 111);
		    for (int i_76_ = 0; i_75_ > i_76_; i_76_++) {
			int i_77_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method832((byte) -76);
			if (-256 == (i_77_ ^ 0xffffffff))
			    i_77_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method820((byte) 115);
			int i_78_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method791(-3977);
			if (class94 != null
			    && ((i_76_ ^ 0xffffffff)
				> (class94.anIntArray1452.length
				   ^ 0xffffffff))) {
			    class94.anIntArray1452[i_76_] = i_78_;
			    class94.anIntArray1542[i_76_] = i_77_;
			}
			Class14_Sub8_Sub23.method604(i_76_, -1 + i_78_, i_73_,
						     i_77_, -48);
		    }
		    if (class94 != null)
			Class103.method1531((byte) -31, class94);
		    Class45.method1160(arg0 ^ 0xffffffff);
		    Class14_Sub4.anIntArray2786
			[Class14_Sub8_Sub26
			     .method617(Class133_Sub5.anInt3612++, 31)]
			= Class14_Sub8_Sub26.method617(i_73_, 32767);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-185 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_79_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -97);
		    int i_80_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method781(false);
		    int i_81_ = i_80_ >> -2246870 & 0x1f;
		    int i_82_ = i_80_ & 0x1f;
		    int i_83_ = (i_80_ & 0x3ef) >> 1972172517;
		    int i_84_
			= ((i_82_ << -1311487965)
			   + ((i_83_ << -69112885) + (i_81_ << 154711379)));
		    Class94 class94 = Class55.method1233(i_79_, 21803);
		    if ((class94.anInt1567 ^ 0xffffffff)
			!= (i_84_ ^ 0xffffffff)) {
			class94.anInt1567 = i_84_;
			Class103.method1531((byte) -76, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 109)
			break;
		    int i_85_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -114);
		    int i_86_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method791(-3977);
		    Class14_Sub2_Sub12.method318(i_86_, i_85_, false);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -253)
			break;
		    int i_87_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method806((byte) 115);
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(9467);
		    int i_88_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method806((byte) -128);
		    if ((i_88_ ^ 0xffffffff) <= -2
			&& (i_88_ ^ 0xffffffff) >= -9) {
			if (class124.method1717(40,
						Class133_Sub3.aClass124_3566))
			    class124 = null;
			Class56.aClass124Array919[-1 + i_88_] = class124;
			Class14_Sub8_Sub11.aBooleanArray4271[-1 + i_88_]
			    = i_87_ == 0;
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 120)
			break;
		    int i_89_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method805(0);
		    int i_90_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method820((byte) 127);
		    int i_91_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method805(0);
		    Class94 class94 = Class55.method1233(i_90_, 21803);
		    class94.anInt1583 = class94.anInt1609 = i_91_;
		    class94.aByte1496 = (byte) 0;
		    class94.aByte1502 = (byte) 0;
		    class94.anInt1523 = class94.anInt1561 = i_89_;
		    Class103.method1531((byte) -119, class94);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (135 != Class133_Sub4.anInt3579)
			break;
		    int i_92_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method812((byte) -127);
		    int i_93_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 115);
		    Class94 class94;
		    if (-1 < (i_92_ ^ 0xffffffff))
			class94 = null;
		    else
			class94 = Class55.method1233(i_92_, 21803);
		    if (-70000 > i_92_)
			i_93_ += 32768;
		    while ((Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff)
			   < ((Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .anInt2908)
			      ^ 0xffffffff)) {
			int i_94_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method818((byte) 58);
			int i_95_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method784((byte) 120);
			int i_96_ = 0;
			if ((i_95_ ^ 0xffffffff) != -1) {
			    i_96_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method798(87);
			    if (255 == i_96_)
				i_96_ = Class14_Sub8_Sub38
					    .aClass14_Sub10_Sub1_4734
					    .method812((byte) -93);
			}
			if (null != class94 && -1 >= (i_94_ ^ 0xffffffff)
			    && i_94_ < class94.anIntArray1452.length) {
			    class94.anIntArray1452[i_94_] = i_95_;
			    class94.anIntArray1542[i_94_] = i_96_;
			}
			Class14_Sub8_Sub23.method604(i_94_, -1 + i_95_, i_93_,
						     i_96_, -109);
		    }
		    if (null != class94)
			Class103.method1531((byte) -122, class94);
		    Class45.method1160(0);
		    Class14_Sub4.anIntArray2786
			[Class14_Sub8_Sub26
			     .method617(Class133_Sub5.anInt3612++, 31)]
			= Class14_Sub8_Sub26.method617(i_93_, 32767);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -162)
			break;
		    int i_97_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method784((byte) 123);
		    int i_98_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method790(8);
		    Canvas_Sub1.method58(i_98_, (byte) -1, i_97_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (55 != Class133_Sub4.anInt3579)
			break;
		    Class14_Sub2_Sub2.method264((Class14_Sub8_Sub38
						 .aClass14_Sub10_Sub1_4734),
						false);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 186)
			break;
		    Class14_Sub3.anInt2764
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(54);
		    Class14_Sub8_Sub25.anInt4505
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(-79);
		    Class32.anInt566
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(arg0 + -115);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-109 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class14_Sub10.method822(-99);
		    Class45.method1160(arg0 + 1);
		    Class22.anInt461 += 32;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (29 != Class133_Sub4.anInt3579
			&& Class133_Sub4.anInt3579 != 232
			&& 50 != Class133_Sub4.anInt3579
			&& -22 != (Class133_Sub4.anInt3579 ^ 0xffffffff)
			&& -76 != (Class133_Sub4.anInt3579 ^ 0xffffffff)
			&& 248 != Class133_Sub4.anInt3579
			&& Class133_Sub4.anInt3579 != 112
			&& -202 != (Class133_Sub4.anInt3579 ^ 0xffffffff)
			&& Class133_Sub4.anInt3579 != 25
			&& 110 != Class133_Sub4.anInt3579
			&& 196 != Class133_Sub4.anInt3579
			&& Class133_Sub4.anInt3579 != 30)
			break;
		    Class14_Sub8_Sub7.method512(true);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 177)
			break;
		    Class14_Sub4.anInt2788
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(76);
		    Class49.anInt817
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method832((byte) -99);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 142)
			break;
		    Class139.method1951((byte) -113, false);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -138)
			break;
		    int i_99_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(74);
		    if (0 != Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method798(112)) {
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .anInt2908--;
			Class14_Sub8_Sub7.aClass109Array4195[i_99_]
			    = new Class109(Class14_Sub8_Sub38
					   .aClass14_Sub10_Sub1_4734);
		    } else
			Class14_Sub8_Sub7.aClass109Array4195[i_99_]
			    = new Class109();
		    Class39.anInt660 = Class14_Sub8_Sub23.anInt4478;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-224 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_100_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 125);
		    if (65535 == i_100_)
			i_100_ = -1;
		    int i_101_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    int i_102_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method831(128);
		    if ((i_101_ ^ 0xffffffff) == -65536)
			i_101_ = -1;
		    int i_103_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method831(arg0 ^ ~0x80);
		    for (int i_104_ = i_101_; i_104_ <= i_100_; i_104_++) {
			long l = (long) i_104_ + ((long) i_102_ << 419068128);
			Class14 class14 = Class14_Sub8_Sub5.aClass55_4155
					      .method1230(l, (byte) -11);
			if (class14 != null)
			    class14.method233(0);
			Class14_Sub8_Sub5.aClass55_4155.method1224
			    (arg0 ^ ~0x8, l, new Class14_Sub1(i_103_));
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 222)
			break;
		    Class138.method1944(false);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (93 != Class133_Sub4.anInt3579)
			break;
		    int i_105_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 123);
		    int i_106_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method819(3);
		    int i_107_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method812((byte) -95);
		    Class14_Sub15 class14_sub15
			= ((Class14_Sub15)
			   Class14_Sub30.aClass55_3275
			       .method1230((long) i_107_, (byte) -102));
		    if (class14_sub15 != null)
			Class14_Sub1.method236(((i_105_ ^ 0xffffffff)
						!= (class14_sub15.anInt2999
						    ^ 0xffffffff)),
					       class14_sub15, (byte) -122);
		    Class14_Sub1.method237(1, i_107_, i_106_, i_105_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (100 != Class133_Sub4.anInt3579)
			break;
		    int i_108_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method836((byte) 3);
		    byte i_109_ = Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734
				      .method813(arg0 + 90);
		    Canvas_Sub1.method58(i_109_, (byte) -1, i_108_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 3)
			break;
		    Class133_Sub4.anInt3579 = -1;
		    Class71.anInt1085 = 0;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-60 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    boolean bool_110_
			= -2 == (Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method806((byte) 110)
				 ^ 0xffffffff);
		    int i_111_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method790(arg0 + 9);
		    Class94 class94 = Class55.method1233(i_111_, 21803);
		    if (!bool_110_ == class94.aBoolean1503) {
			class94.aBoolean1503 = bool_110_;
			Class103.method1531((byte) -123, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (41 != Class133_Sub4.anInt3579)
			break;
		    int i_112_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method790(8);
		    int i_113_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method836((byte) -1);
		    Class94 class94 = Class55.method1233(i_112_, 21803);
		    if (null != class94
			&& -1 == (class94.anInt1489 ^ 0xffffffff)) {
			if ((i_113_ ^ 0xffffffff)
			    < (class94.anInt1605 + -class94.anInt1545
			       ^ 0xffffffff))
			    i_113_ = class94.anInt1605 + -class94.anInt1545;
			if (0 > i_113_)
			    i_113_ = 0;
			if (class94.anInt1547 != i_113_) {
			    class94.anInt1547 = i_113_;
			    Class103.method1531((byte) -122, class94);
			}
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -250)
			break;
		    Class14_Sub4.anInt2788
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(-80);
		    Class49.anInt817
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(-21);
		    for (int i_114_ = Class49.anInt817;
			 i_114_ < Class49.anInt817 - -8; i_114_++) {
			for (int i_115_ = Class14_Sub4.anInt2788;
			     Class14_Sub4.anInt2788 - -8 > i_115_; i_115_++) {
			    if (null != (Class128.aClass2ArrayArrayArray2119
					 [Class14_Sub2_Sub3.anInt3785][i_114_]
					 [i_115_])) {
				Class128.aClass2ArrayArrayArray2119
				    [Class14_Sub2_Sub3.anInt3785][i_114_]
				    [i_115_]
				    = null;
				Class67.method1300(i_115_, arg0 ^ ~0x23fa,
						   i_114_);
			    }
			}
		    }
		    for (Class14_Sub14 class14_sub14
			     = (Class14_Sub14) Class33.aClass2_583.method77(0);
			 null != class14_sub14;
			 class14_sub14 = (Class14_Sub14) Class33
							     .aClass2_583
							     .method84(-124)) {
			if (((Class49.anInt817 ^ 0xffffffff)
			     >= (class14_sub14.anInt2967 ^ 0xffffffff))
			    && Class49.anInt817 - -8 > class14_sub14.anInt2967
			    && (class14_sub14.anInt2970
				>= Class14_Sub4.anInt2788)
			    && (Class14_Sub4.anInt2788 + 8
				> class14_sub14.anInt2970)
			    && (Class14_Sub2_Sub3.anInt3785
				== class14_sub14.anInt2969))
			    class14_sub14.anInt2975 = 0;
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-58 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_116_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method832((byte) -58);
		    int i_117_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method819(arg0 ^ ~0x3);
		    int i_118_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method819(3);
		    Class14_Sub2_Sub3.anInt3785 = i_116_ >> 669266753;
		    Class14_Sub3.aClass133_Sub1_Sub1_2748.method1800
			((byte) -108, i_117_, (0x1 & i_116_) == 1, i_118_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -50)
			break;
		    int i_119_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method791(arg0 + -3976);
		    int i_120_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 112);
		    int i_121_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method831(128);
		    int i_122_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method791(-3977);
		    Class94 class94
			= Class55.method1233(i_121_, arg0 ^ ~0x552b);
		    if (class94.anInt1465 != i_119_
			|| i_122_ != class94.anInt1578
			|| class94.anInt1513 != i_120_) {
			class94.anInt1465 = i_119_;
			class94.anInt1513 = i_120_;
			class94.anInt1578 = i_122_;
			Class103.method1531((byte) -43, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (210 != Class133_Sub4.anInt3579)
			break;
		    if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912,
					   (byte) 46, 0);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-206 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    if (Class14_Sub8_Sub12.anInt4280 != 0)
			Class7.aClass124_174
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method797(9467);
		    else
			Class7.aClass124_174 = Class44.aClass124_729;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 195)
			break;
		    int i_123_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method790(8);
		    int i_124_ = 0x3fff & i_123_;
		    int i_125_ = (i_123_ & 0x34e9799e) >> -1705153284;
		    int i_126_ = (0xfffcac2 & i_123_) >> 359246478;
		    int i_127_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 110);
		    int i_128_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(64);
		    i_126_ -= Class133_Sub6.anInt3676;
		    int i_129_ = 0x3 & i_128_;
		    i_124_ -= Class58.anInt947;
		    int i_130_ = i_128_ >> 499398978;
		    if (-65536 == (i_127_ ^ 0xffffffff))
			i_127_ = -1;
		    int i_131_ = Class14_Sub19.anIntArray3082[i_130_];
		    Class125.method1723(i_126_, i_131_, i_125_, i_124_,
					-1292647136, i_129_, i_127_, i_130_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-145 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    if (null != Class14_Sub2_Sub15.aFrame3962)
			Class14_Sub2_Sub20.method428(arg0 ^ 0x79);
		    byte[] is = new byte[Class14_Sub8_Sub12.anInt4280];
		    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			.method844(is, Class14_Sub8_Sub12.anInt4280, 0, -99);
		    Class52.method1211(Class14.method231((byte) 120,
							 (Class14_Sub8_Sub12
							  .anInt4280),
							 is, 0),
				       true, arg0 + 123);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (226 != Class133_Sub4.anInt3579)
			break;
		    anInt4633 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method798(-71);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 139)
			break;
		    Class133_Sub1.method1796((byte) 24,
					     Class14_Sub8_Sub34.aClass43_4647,
					     Class14_Sub8_Sub12.anInt4280,
					     (Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734));
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -171)
			break;
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(arg0 ^ ~0x24fb);
		    int i_132_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    int i_133_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    Class60.method1270(i_132_, (byte) 46);
		    Class123.method1662(i_133_, class124, 2);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-180 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(arg0 + 9468);
		    int i_134_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method790(8);
		    Class94 class94 = Class55.method1233(i_134_, arg0 + 21804);
		    if (!class124.method1704(class94.aClass124_1499,
					     (byte) 108)) {
			class94.aClass124_1499 = class124;
			Class103.method1531((byte) -126, class94);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 247)
			break;
		    int i_135_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method836((byte) 123);
		    int i_136_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method806((byte) -20);
		    int i_137_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    Class60.method1270(i_135_, (byte) 46);
		    Class14_Sub8_Sub31.method645((byte) -61, i_137_, i_136_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 227)
			break;
		    int i_138_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-32);
		    Class66 class66 = new Class66();
		    class66.anInt1046 = i_138_ & 0x3f;
		    class66.anInt1035
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(arg0 + -53);
		    int i_139_ = i_138_ >> 1920091686;
		    if (-1 >= (class66.anInt1035 ^ 0xffffffff)
			&& (Class76.aClass14_Sub2_Sub19Array1191.length
			    ^ 0xffffffff) < (class66.anInt1035 ^ 0xffffffff)) {
			if (-2 != (class66.anInt1046 ^ 0xffffffff)
			    && -11 != (class66.anInt1046 ^ 0xffffffff)) {
			    if (2 <= class66.anInt1046
				&& class66.anInt1046 <= 6) {
				if (2 == class66.anInt1046) {
				    class66.anInt1051 = 64;
				    class66.anInt1038 = 64;
				}
				if (3 == class66.anInt1046) {
				    class66.anInt1051 = 64;
				    class66.anInt1038 = 0;
				}
				if (-5 == (class66.anInt1046 ^ 0xffffffff)) {
				    class66.anInt1051 = 64;
				    class66.anInt1038 = 128;
				}
				if (5 == class66.anInt1046) {
				    class66.anInt1051 = 0;
				    class66.anInt1038 = 64;
				}
				if (6 == class66.anInt1046) {
				    class66.anInt1038 = 64;
				    class66.anInt1051 = 128;
				}
				class66.anInt1046 = 2;
				class66.anInt1047
				    = Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .method784((byte) 118);
				class66.anInt1044
				    = Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .method784((byte) 114);
				class66.anInt1041
				    = Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .method798(-110);
			    }
			} else {
			    class66.anInt1049
				= Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734
				      .method784((byte) 104);
			    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				.anInt2908
				+= 3;
			}
			class66.anInt1043
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method784((byte) 121);
			if ((class66.anInt1043 ^ 0xffffffff) == -65536)
			    class66.anInt1043 = -1;
			Class14_Sub2_Sub1.aClass66Array3721[i_139_] = class66;
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (218 != Class133_Sub4.anInt3579)
			break;
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(9467);
		    if (!class124.method1708(Class14_Sub2_Sub3.aClass124_3774,
					     (byte) -93)) {
			if (class124.method1708((Class14_Sub8_Sub6
						 .aClass124_4189),
						(byte) -72)) {
			    boolean bool_140_ = false;
			    Class124 class124_141_
				= (class124.method1697
				   (0,
				    class124.method1700(arg0 + -19927,
							Class62.aClass124_994),
				    (byte) -104));
			    long l = class124_141_.method1692(0);
			    for (int i_142_ = 0;
				 ((i_142_ ^ 0xffffffff)
				  > (Class42.anInt698 ^ 0xffffffff));
				 i_142_++) {
				if (Class126.aLongArray2095[i_142_] == l) {
				    bool_140_ = true;
				    break;
				}
			    }
			    if (!bool_140_
				&& Class14_Sub8_Sub39.anInt4754 == 0) {
				Class124 class124_143_
				    = (class124.method1697
				       ((class124.method1700(-19928,
							     (Class62
							      .aClass124_994))
					 - -1),
					class124.method1693(0) + -9,
					(byte) -104));
				Class15.method943(class124_143_, false,
						  class124_141_, 8);
			    }
			} else if (class124.method1708(Class152.aClass124_2432,
						       (byte) -107)) {
			    Class124 class124_144_
				= (class124.method1697
				   (0,
				    class124.method1700(-19928,
							Class62.aClass124_994),
				    (byte) -104));
			    long l = class124_144_.method1692(0);
			    boolean bool_145_ = false;
			    for (int i_146_ = 0; i_146_ < Class42.anInt698;
				 i_146_++) {
				if ((l ^ 0xffffffffffffffffL)
				    == (Class126.aLongArray2095[i_146_]
					^ 0xffffffffffffffffL)) {
				    bool_145_ = true;
				    break;
				}
			    }
			    if (!bool_145_
				&& 0 == Class14_Sub8_Sub39.anInt4754)
				Class15.method943((Class14_Sub8_Sub9
						   .aClass124_4244),
						  false, class124_144_, 10);
			} else if (class124.method1708(Class66.aClass124_1037,
						       (byte) -126)) {
			    Class124 class124_147_
				= (class124.method1697
				   (0,
				    class124.method1700(-19928,
							(Class66
							 .aClass124_1037)),
				    (byte) -104));
			    Class15.method943(class124_147_, false,
					      Class14_Sub8_Sub9.aClass124_4244,
					      11);
			} else if (!class124.method1708((Class111
							 .aClass124_1856),
							(byte) -97)) {
			    if (class124.method1708((Class26_Sub2
						     .aClass124_3316),
						    (byte) -99)) {
				Class124 class124_148_
				    = (class124.method1697
				       (0,
					class124.method1700(-19928,
							    (Class26_Sub2
							     .aClass124_3316)),
					(byte) -104));
				if (-1 == (Class14_Sub8_Sub39.anInt4754
					   ^ 0xffffffff))
				    Class15.method943(class124_148_, false,
						      (Class14_Sub8_Sub9
						       .aClass124_4244),
						      13);
			    } else if (!class124.method1708((Class123
							     .aClass124_2065),
							    (byte) -76)) {
				if (class124.method1708(Class46.aClass124_761,
							(byte) -124)) {
				    Class124 class124_149_
					= (class124.method1697
					   (0,
					    (class124.method1700
					     (arg0 ^ 0x4dd7,
					      Class62.aClass124_994)),
					    (byte) -104));
				    boolean bool_150_ = false;
				    long l = class124_149_.method1692(0);
				    for (int i_151_ = 0;
					 i_151_ < Class42.anInt698; i_151_++) {
					if (Class126.aLongArray2095[i_151_]
					    == l) {
					    bool_150_ = true;
					    break;
					}
				    }
				    if (!bool_150_
					&& (Class14_Sub8_Sub39.anInt4754
					    ^ 0xffffffff) == -1)
					Class15.method943((Class14_Sub8_Sub9
							   .aClass124_4244),
							  false, class124_149_,
							  15);
				} else if (!class124.method1708
					    (Class137.aClass124_2206,
					     (byte) -100))
				    Class15.method943(class124, false,
						      (Class14_Sub8_Sub9
						       .aClass124_4244),
						      0);
				else {
				    Class124 class124_152_
					= (class124.method1697
					   (0,
					    (class124.method1700
					     (-19928, Class62.aClass124_994)),
					    (byte) -104));
				    boolean bool_153_ = false;
				    long l = class124_152_.method1692(0);
				    for (int i_154_ = 0;
					 ((Class42.anInt698 ^ 0xffffffff)
					  < (i_154_ ^ 0xffffffff));
					 i_154_++) {
					if (l == (Class126.aLongArray2095
						  [i_154_])) {
					    bool_153_ = true;
					    break;
					}
				    }
				    if (!bool_153_
					&& -1 == (Class14_Sub8_Sub39.anInt4754
						  ^ 0xffffffff))
					Class15.method943((Class14_Sub8_Sub9
							   .aClass124_4244),
							  false, class124_152_,
							  16);
				}
			    } else {
				Class124 class124_155_
				    = (class124.method1697
				       (0,
					class124.method1700(-19928,
							    (Class62
							     .aClass124_994)),
					(byte) -104));
				boolean bool_156_ = false;
				long l = class124_155_.method1692(0);
				for (int i_157_ = 0; i_157_ < Class42.anInt698;
				     i_157_++) {
				    if (l == Class126.aLongArray2095[i_157_]) {
					bool_156_ = true;
					break;
				    }
				}
				if (!bool_156_
				    && Class14_Sub8_Sub39.anInt4754 == 0)
				    Class15.method943((Class14_Sub8_Sub9
						       .aClass124_4244),
						      false, class124_155_,
						      14);
			    }
			} else {
			    Class124 class124_158_
				= (class124.method1697
				   (0,
				    class124.method1700(-19928,
							(Class111
							 .aClass124_1856)),
				    (byte) -104));
			    if (-1
				== (Class14_Sub8_Sub39.anInt4754 ^ 0xffffffff))
				Class15.method943(class124_158_, false,
						  (Class14_Sub8_Sub9
						   .aClass124_4244),
						  12);
			}
		    } else {
			Class124 class124_159_
			    = (class124.method1697
			       (0,
				class124.method1700(-19928,
						    Class62.aClass124_994),
				(byte) -104));
			boolean bool_160_ = false;
			long l = class124_159_.method1692(arg0 + 1);
			for (int i_161_ = 0;
			     ((Class42.anInt698 ^ 0xffffffff)
			      < (i_161_ ^ 0xffffffff));
			     i_161_++) {
			    if (l == Class126.aLongArray2095[i_161_]) {
				bool_160_ = true;
				break;
			    }
			}
			if (!bool_160_ && 0 == Class14_Sub8_Sub39.anInt4754)
			    Class15.method943(Class14_Sub30.aClass124_3274,
					      false, class124_159_, 4);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 115)
			break;
		    Class15.anInt380
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method798(81);
		    Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 219)
			break;
		    int i_162_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method790(8);
		    Class94 class94 = Class55.method1233(i_162_, 21803);
		    for (int i_163_ = 0;
			 ((class94.anIntArray1452.length ^ 0xffffffff)
			  < (i_163_ ^ 0xffffffff));
			 i_163_++) {
			class94.anIntArray1452[i_163_] = -1;
			class94.anIntArray1452[i_163_] = 0;
		    }
		    Class103.method1531((byte) -85, class94);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-125 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class14_Sub4.anInt2788
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method806((byte) -110);
		    Class49.anInt817
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method832((byte) -122);
		    while ((Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff)
			   < ((Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			       .anInt2908)
			      ^ 0xffffffff)) {
			Class133_Sub4.anInt3579
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method798(63);
			Class14_Sub8_Sub7.method512(true);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -2)
			break;
		    int i_164_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method832((byte) -57);
		    int i_165_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    Class14_Sub2_Sub12.method318(i_165_, i_164_, false);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 38)
			break;
		    for (int i_166_ = 0;
			 Class14_Sub8_Sub11.anIntArray4275.length > i_166_;
			 i_166_++) {
			if (Class14_Sub9_Sub3.anIntArray4851[i_166_]
			    != Class14_Sub8_Sub11.anIntArray4275[i_166_]) {
			    Class14_Sub8_Sub11.anIntArray4275[i_166_]
				= Class14_Sub9_Sub3.anIntArray4851[i_166_];
			    Class122.method1660(arg0 + 15238, i_166_);
			    Class24.anIntArray467
				[Class14_Sub8_Sub26
				     .method617(31, Class22.anInt461++)]
				= i_166_;
			}
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 216)
			break;
		    Class113.method1580(true);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	while_489_:
	    do {
	    while_488_:
		do {
		    int i_167_;
		    int i_168_;
		    Class94 class94;
		while_487_:
		    do {
			do {
			    boolean bool;
			    try {
				if (Class133_Sub4.anInt3579 != 35)
				    break while_489_;
				int i_169_ = Class14_Sub8_Sub38
						 .aClass14_Sub10_Sub1_4734
						 .method820((byte) 100);
				i_167_ = Class14_Sub8_Sub38
					     .aClass14_Sub10_Sub1_4734
					     .method831(arg0 + 129);
				i_168_ = Class14_Sub8_Sub38
					     .aClass14_Sub10_Sub1_4734
					     .method781(false);
				class94 = Class55.method1233(i_169_, 21803);
				if (i_168_ == 65535)
				    i_168_ = -1;
				if (class94.aBoolean1455)
				    break while_487_;
				if ((i_168_ ^ 0xffffffff) != 0)
				    break;
				class94.anInt1543 = 0;
				Class133_Sub4.anInt3579 = -1;
				bool = true;
			    } catch (RuntimeException runtimeexception) {
				break while_490_;
			    }
			    return bool;
			} while (false);
			try {
			    Class142 class142
				= Class14_Sub8_Sub24.method605(arg0 ^ ~0x62,
							       i_168_);
			    class94.anInt1513
				= 100 * class142.anInt2273 / i_167_;
			    class94.anInt1578 = class142.anInt2286;
			    class94.anInt1550 = i_168_;
			    class94.anInt1543 = 4;
			    class94.anInt1465 = class142.anInt2317;
			    Class103.method1531((byte) -100, class94);
			    break while_488_;
			} catch (RuntimeException runtimeexception) {
			    break while_490_;
			}
		    } while (false);
		    class94.anInt1495 = i_167_;
		    class94.anInt1532 = i_168_;
		    Class142 class142
			= Class14_Sub8_Sub24.method605(arg0 ^ ~0x49, i_168_);
		    class94.anInt1465 = class142.anInt2317;
		    class94.anInt1516 = class142.anInt2326;
		    class94.anInt1482 = class142.anInt2285;
		    class94.anInt1459 = class142.anInt2293;
		    class94.anInt1578 = class142.anInt2286;
		    class94.anInt1513 = class142.anInt2273;
		    if (class94.anInt1514 <= 0) {
			if (-1 > (class94.anInt1485 ^ 0xffffffff))
			    class94.anInt1513
				= class94.anInt1513 * 32 / class94.anInt1485;
		    } else
			class94.anInt1513
			    = 32 * class94.anInt1513 / class94.anInt1514;
		    Class103.method1531((byte) -96, class94);
		} while (false);
		Class133_Sub4.anInt3579 = -1;
		return true;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 119)
			break;
		    int i_170_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 119);
		    if (65535 == i_170_)
			i_170_ = -1;
		    int i_171_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method798(arg0 + 106);
		    int i_172_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 109);
		    Class47.method1181(i_171_, i_170_, i_172_, (byte) -10);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (240 != Class133_Sub4.anInt3579)
			break;
		    Class42.anInt698 = Class14_Sub8_Sub12.anInt4280 / 8;
		    for (int i_173_ = 0; i_173_ < Class42.anInt698; i_173_++) {
			Class126.aLongArray2095[i_173_]
			    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				  .method796(-115);
			client.aClass124Array2645[i_173_]
			    = Class46.method1174((Class126.aLongArray2095
						  [i_173_]),
						 (byte) 84);
		    }
		    Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -230)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(arg0 + -23);
		    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			.method780((byte) -77);
		    long l_174_ = Class14_Sub8_Sub38
				      .aClass14_Sub10_Sub1_4734
				      .method796(-111);
		    long l_175_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 104);
		    long l_176_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method829(99);
		    int i_177_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-29);
		    boolean bool_178_ = false;
		    long l_179_ = (l_175_ << -290537888) + l_176_;
		while_480_:
		    do {
			for (int i_180_ = 0; 100 > i_180_; i_180_++) {
			    if ((Class98.aLongArray1665[i_180_]
				 ^ 0xffffffffffffffffL)
				== (l_179_ ^ 0xffffffffffffffffL)) {
				bool_178_ = true;
				break while_480_;
			    }
			}
			if (i_177_ <= 1) {
			    if (Class146.anInt2365 == 1
				|| ((Class14_Sub2_Sub21.anInt4081 ^ 0xffffffff)
				    == -2))
				bool_178_ = true;
			    else {
				for (int i_181_ = 0;
				     ((Class42.anInt698 ^ 0xffffffff)
				      < (i_181_ ^ 0xffffffff));
				     i_181_++) {
				    if (Class126.aLongArray2095[i_181_] == l) {
					bool_178_ = true;
					break;
				    }
				}
			    }
			}
		    } while (false);
		    if (!bool_178_ && Class14_Sub8_Sub39.anInt4754 == 0) {
			Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352]
			    = l_179_;
			Class14_Sub8_Sub16.anInt4352
			    = (1 + Class14_Sub8_Sub16.anInt4352) % 100;
			Class124 class124
			    = (Class14_Sub2_Sub16.method368
			       (Class75.method1337((Class14_Sub8_Sub38
						    .aClass14_Sub10_Sub1_4734),
						   32767).method1677(0)));
			if (2 == i_177_ || i_177_ == 3)
			    Class14_Sub7.method470
				(Class46.method1174(l_174_, (byte) 73)
				     .method1685(0),
				 class124, -126,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub19.aClass124_3075,
				      Class46.method1174(l, (byte) 64)
					  .method1685(arg0 + 1) }),
				   (byte) -128)),
				 9);
			else if (-2 == (i_177_ ^ 0xffffffff))
			    Class14_Sub7.method470
				(Class46.method1174(l_174_, (byte) 117)
				     .method1685(0),
				 class124, -125,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub21.aClass124_3099,
				      Class46.method1174(l, (byte) 66)
					  .method1685(arg0 + 1) }),
				   (byte) -50)),
				 9);
			else
			    Class14_Sub7.method470(Class46.method1174
						       (l_174_, (byte) 67)
						       .method1685(0),
						   class124, -125,
						   Class46.method1174
						       (l, (byte) 119)
						       .method1685(0),
						   9);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (191 != Class133_Sub4.anInt3579)
			break;
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(9467);
		    int i_182_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method791(-3977);
		    int i_183_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    Class60.method1270(i_183_, (byte) 46);
		    Class123.method1662(i_182_, class124, 2);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -191)
			break;
		    int i_184_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 112);
		    Class32.method1074(arg0 ^ 0x5e, i_184_);
		    Class14_Sub4.anIntArray2786
			[Class14_Sub8_Sub26
			     .method617(Class133_Sub5.anInt3612++, 31)]
			= Class14_Sub8_Sub26.method617(32767, i_184_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (12 != Class133_Sub4.anInt3579)
			break;
		    int i_185_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-121);
		    int i_186_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method798(arg0 + -21);
		    int i_187_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method798(arg0 ^ ~0x47);
		    int i_188_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method798(arg0 + 111);
		    int i_189_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 109);
		    Class112.aBooleanArray1872[i_185_] = true;
		    Class117.anIntArray1961[i_185_] = i_186_;
		    Class14_Sub29.anIntArray3264[i_185_] = i_187_;
		    Class133_Sub3.anIntArray3559[i_185_] = i_188_;
		    Class14_Sub8_Sub15.anIntArray4336[i_185_] = i_189_;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-41 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_190_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 120);
		    int i_191_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method791(-3977);
		    Class14_Sub8_Sub19.anInt4408 = i_190_;
		    Class2.anInt102 = i_191_;
		    Class33.method1084((byte) -35);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 234)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(-114);
		    int i_192_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 111);
		    Class124 class124
			= (Class14_Sub2_Sub3.method272(i_192_, (byte) 122)
			       .method442
			   (81, Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
		    Class14_Sub8_Sub3.method493((byte) -83, null,
						Class46.method1174
						    (l, (byte) 75)
						    .method1685(0),
						19, class124, i_192_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (154 != Class133_Sub4.anInt3579)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(-117);
		    boolean bool_193_ = true;
		    if ((l ^ 0xffffffffffffffffL) > -1L) {
			l &= 0x7fffffffffffffffL;
			bool_193_ = false;
		    }
		    int i_194_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 111);
		    int i_195_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-44);
		    Class124 class124 = Class14_Sub8_Sub9.aClass124_4244;
		    if (0 < i_194_)
			class124 = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method797(9467);
		    Class124 class124_196_ = Class46.method1174
						 (l, (byte) 62)
						 .method1685(arg0 + 1);
		    for (int i_197_ = 0;
			 ((Class14_Sub2_Sub1.anInt3728 ^ 0xffffffff)
			  < (i_197_ ^ 0xffffffff));
			 i_197_++) {
			if (Class133_Sub1_Sub2.aLongArray4951[i_197_] == l) {
			    if ((i_194_ ^ 0xffffffff)
				!= (Class45.anIntArray743[i_197_]
				    ^ 0xffffffff)) {
				Class45.anIntArray743[i_197_] = i_194_;
				if ((i_194_ ^ 0xffffffff) < -1)
				    Class15.method943
					((Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { class124_196_,
					      Class74.aClass124_1142 }),
					   (byte) -73)),
					 false,
					 Class14_Sub8_Sub9.aClass124_4244, 5);
				if (0 == i_194_)
				    Class15.method943
					((Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { class124_196_,
					      (Class14_Sub8_Sub2
					       .aClass124_4113) }),
					   (byte) -52)),
					 false,
					 Class14_Sub8_Sub9.aClass124_4244, 5);
			    }
			    Class14_Sub2_Sub15.aClass124Array3959[i_197_]
				= class124;
			    class124_196_ = null;
			    Class14_Sub2_Sub1.anIntArray3720[i_197_] = i_195_;
			    Class58.aBooleanArray950[i_197_] = bool_193_;
			    break;
			}
		    }
		    if (null != class124_196_
			&& Class14_Sub2_Sub1.anInt3728 < 200) {
			Class133_Sub1_Sub2.aLongArray4951[(Class14_Sub2_Sub1
							   .anInt3728)]
			    = l;
			Class14_Sub10.aClass124Array2938[(Class14_Sub2_Sub1
							  .anInt3728)]
			    = class124_196_;
			Class45.anIntArray743[Class14_Sub2_Sub1.anInt3728]
			    = i_194_;
			Class14_Sub2_Sub15.aClass124Array3959
			    [Class14_Sub2_Sub1.anInt3728]
			    = class124;
			Class14_Sub2_Sub1.anIntArray3720[(Class14_Sub2_Sub1
							  .anInt3728)]
			    = i_195_;
			Class58.aBooleanArray950[Class14_Sub2_Sub1.anInt3728]
			    = bool_193_;
			Class14_Sub2_Sub1.anInt3728++;
		    }
		    int i_198_ = Class14_Sub2_Sub1.anInt3728;
		    boolean bool_199_ = false;
		    Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
		    do {
			if (i_198_ <= 0)
			    break;
			i_198_--;
			bool_199_ = true;
			for (int i_200_ = 0;
			     (i_200_ ^ 0xffffffff) > (i_198_ ^ 0xffffffff);
			     i_200_++) {
			    if ((((Class45.anIntArray743[i_200_] ^ 0xffffffff)
				  != (Class120.anInt2005 ^ 0xffffffff))
				 && (Class45.anIntArray743[i_200_ + 1]
				     == Class120.anInt2005))
				|| (0 == Class45.anIntArray743[i_200_]
				    && (-1
					!= (Class45.anIntArray743[i_200_ - -1]
					    ^ 0xffffffff)))) {
				bool_199_ = false;
				int i_201_ = Class45.anIntArray743[i_200_];
				Class45.anIntArray743[i_200_]
				    = Class45.anIntArray743[1 + i_200_];
				Class45.anIntArray743[1 + i_200_] = i_201_;
				Class124 class124_202_
				    = (Class14_Sub2_Sub15.aClass124Array3959
				       [i_200_]);
				Class14_Sub2_Sub15.aClass124Array3959[i_200_]
				    = (Class14_Sub2_Sub15.aClass124Array3959
				       [i_200_ - -1]);
				Class14_Sub2_Sub15.aClass124Array3959[(i_200_
								       + 1)]
				    = class124_202_;
				Class124 class124_203_
				    = Class14_Sub10.aClass124Array2938[i_200_];
				Class14_Sub10.aClass124Array2938[i_200_]
				    = (Class14_Sub10.aClass124Array2938
				       [1 + i_200_]);
				Class14_Sub10.aClass124Array2938[1 + i_200_]
				    = class124_203_;
				long l_204_ = (Class133_Sub1_Sub2
					       .aLongArray4951[i_200_]);
				Class133_Sub1_Sub2.aLongArray4951[i_200_]
				    = (Class133_Sub1_Sub2.aLongArray4951
				       [i_200_ - -1]);
				Class133_Sub1_Sub2.aLongArray4951[i_200_ - -1]
				    = l_204_;
				int i_205_
				    = Class14_Sub2_Sub1.anIntArray3720[i_200_];
				Class14_Sub2_Sub1.anIntArray3720[i_200_]
				    = (Class14_Sub2_Sub1.anIntArray3720
				       [1 + i_200_]);
				Class14_Sub2_Sub1.anIntArray3720[1 + i_200_]
				    = i_205_;
				boolean bool_206_
				    = Class58.aBooleanArray950[i_200_];
				Class58.aBooleanArray950[i_200_]
				    = Class58.aBooleanArray950[1 + i_200_];
				Class58.aBooleanArray950[1 + i_200_]
				    = bool_206_;
			    }
			}
		    } while (!bool_199_);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (10 != Class133_Sub4.anInt3579)
			break;
		    int i_207_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method832((byte) -96);
		    int i_208_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    int i_209_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method781(false);
		    Class133_Sub1_Sub2 class133_sub1_sub2
			= Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_209_];
		    if (null != class133_sub1_sub2)
			Class14_Sub8_Sub24.method610(i_208_, i_207_,
						     class133_sub1_sub2,
						     12288);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (217 != Class133_Sub4.anInt3579)
			break;
		    Class45.method1160(0);
		    int i_210_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method806((byte) -61);
		    int i_211_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method820((byte) -100);
		    int i_212_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method806((byte) -111);
		    Class14_Sub2_Sub12.anIntArray3916[i_212_] = i_211_;
		    Class14_Sub8_Sub21.anIntArray4444[i_212_] = i_210_;
		    Class56.anIntArray913[i_212_] = 1;
		    for (int i_213_ = 0; -99 < (i_213_ ^ 0xffffffff);
			 i_213_++) {
			if ((Class14_Sub29.anIntArray3245[i_213_] ^ 0xffffffff)
			    >= (i_211_ ^ 0xffffffff))
			    Class56.anIntArray913[i_212_] = i_213_ - -2;
		    }
		    Class14_Sub2.anIntArray2727
			[Class14_Sub8_Sub26.method617(31,
						      Canvas_Sub2.anInt54++)]
			= i_212_;
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 140)
			break;
		    int i_214_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 119);
		    int i_215_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method812((byte) -120);
		    int i_216_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method791(arg0 ^ 0xf88);
		    int i_217_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 118);
		    if (0 == i_215_ >> -693730658) {
			if (-1 == (i_215_ >> 1637436957 ^ 0xffffffff)) {
			    if (i_215_ >> -338653828 != 0) {
				int i_218_ = 0xffff & i_215_;
				Class133_Sub1_Sub1 class133_sub1_sub1;
				if ((i_218_ ^ 0xffffffff)
				    != (Class14_Sub2_Sub10.anInt3868
					^ 0xffffffff))
				    class133_sub1_sub1
					= (Class14_Sub8_Sub23
					   .aClass133_Sub1_Sub1Array4474
					   [i_218_]);
				else
				    class133_sub1_sub1
					= (Class14_Sub3
					   .aClass133_Sub1_Sub1_2748);
				if (class133_sub1_sub1 != null) {
				    class133_sub1_sub1.anInt3485
					= (i_214_
					   + Class14_Sub2_Sub20.anInt4064);
				    class133_sub1_sub1.anInt3459 = 0;
				    class133_sub1_sub1.anInt3487 = i_216_;
				    class133_sub1_sub1.anInt3475 = i_217_;
				    if (65535 == class133_sub1_sub1.anInt3487)
					class133_sub1_sub1.anInt3487 = -1;
				    class133_sub1_sub1.anInt3470 = 0;
				    if (class133_sub1_sub1.anInt3485
					> Class14_Sub2_Sub20.anInt4064)
					class133_sub1_sub1.anInt3470 = -1;
				}
			    }
			} else {
			    int i_219_ = i_215_ & 0xffff;
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				   [i_219_]);
			    if (class133_sub1_sub2 != null) {
				class133_sub1_sub2.anInt3485
				    = Class14_Sub2_Sub20.anInt4064 - -i_214_;
				class133_sub1_sub2.anInt3475 = i_217_;
				class133_sub1_sub2.anInt3470 = 0;
				class133_sub1_sub2.anInt3487 = i_216_;
				class133_sub1_sub2.anInt3459 = 0;
				if ((class133_sub1_sub2.anInt3485 ^ 0xffffffff)
				    < (Class14_Sub2_Sub20.anInt4064
				       ^ 0xffffffff))
				    class133_sub1_sub2.anInt3470 = -1;
				if (-65536 == (class133_sub1_sub2.anInt3487
					       ^ 0xffffffff))
				    class133_sub1_sub2.anInt3487 = -1;
			    }
			}
		    } else {
			int i_220_ = (-Class133_Sub6.anInt3676
				      + (0x3fff & i_215_ >> 509736558));
			int i_221_ = (i_215_ & 0x36213ad7) >> -1244566628;
			int i_222_ = -Class58.anInt947 + (i_215_ & 0x3fff);
			if (0 <= i_220_ && 0 <= i_222_
			    && (i_220_ ^ 0xffffffff) > -105
			    && (i_222_ ^ 0xffffffff) > -105) {
			    i_222_ = i_222_ * 128 - -64;
			    i_220_ = i_220_ * 128 + 64;
			    Class133_Sub5 class133_sub5
				= (new Class133_Sub5
				   (i_216_, i_221_, i_220_, i_222_,
				    -i_217_ + Class26.method1017(i_220_,
								 i_221_,
								 (byte) -127,
								 i_222_),
				    i_214_, Class14_Sub2_Sub20.anInt4064));
			    Class79.aClass2_1268.method80
				(new Class14_Sub2_Sub7(class133_sub5),
				 (byte) -125);
			}
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-194 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    int i_223_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-122);
		    int i_224_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method798(arg0 + -101);
		    int i_225_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 112);
		    int i_226_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-50);
		    int i_227_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(101);
		    Class125.method1725(i_225_, i_223_, i_226_, i_227_, i_224_,
					(byte) 86);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (Class133_Sub4.anInt3579 != 149)
			break;
		    long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method796(-124);
		    long l_228_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 114);
		    long l_229_
			= (long) Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method829(103);
		    long l_230_ = l_229_ + (l_228_ << 406953120);
		    int i_231_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734.method798(-29);
		    boolean bool_232_ = false;
		    int i_233_ = Class14_Sub8_Sub38
				     .aClass14_Sub10_Sub1_4734
				     .method784((byte) 109);
		while_479_:
		    do {
			for (int i_234_ = 0; i_234_ < 100; i_234_++) {
			    if (Class98.aLongArray1665[i_234_] == l_230_) {
				bool_232_ = true;
				break while_479_;
			    }
			}
			if (i_231_ <= 1) {
			    for (int i_235_ = 0; Class42.anInt698 > i_235_;
				 i_235_++) {
				if ((Class126.aLongArray2095[i_235_]
				     ^ 0xffffffffffffffffL)
				    == (l ^ 0xffffffffffffffffL)) {
				    bool_232_ = true;
				    break;
				}
			    }
			}
		    } while (false);
		    if (!bool_232_
			&& -1 == (Class14_Sub8_Sub39.anInt4754 ^ 0xffffffff)) {
			Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352]
			    = l_230_;
			Class14_Sub8_Sub16.anInt4352
			    = (1 + Class14_Sub8_Sub16.anInt4352) % 100;
			Class124 class124
			    = (Class14_Sub2_Sub3.method272
				   (i_233_, (byte) 70).method442
			       (-118,
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
			if (2 == i_231_)
			    Class14_Sub8_Sub3.method493
				((byte) -60, null,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub19.aClass124_3075,
				      Class46.method1174(l, (byte) 121)
					  .method1685(0) }),
				   (byte) -7)),
				 18, class124, i_233_);
			else if (i_231_ == 1)
			    Class14_Sub8_Sub3.method493
				((byte) -85, null,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub21.aClass124_3099,
				      Class46.method1174(l, (byte) 94)
					  .method1685(0) }),
				   (byte) -127)),
				 18, class124, i_233_);
			else
			    Class14_Sub8_Sub3.method493((byte) -62, null,
							Class46.method1174
							    (l, (byte) 78)
							    .method1685(0),
							18, class124, i_233_);
		    }
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-153 != (Class133_Sub4.anInt3579 ^ 0xffffffff))
			break;
		    Class124 class124
			= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			      .method797(9467);
		    Object[] objects
			= new Object[1 + class124.method1693(arg0 + 1)];
		    for (int i_236_ = -1 + class124.method1693(0);
			 -1 >= (i_236_ ^ 0xffffffff); i_236_--) {
			if (115 != class124.method1710(arg0 + 1, i_236_))
			    objects[1 + i_236_]
				= new Integer(Class14_Sub8_Sub38
						  .aClass14_Sub10_Sub1_4734
						  .method812((byte) -110));
			else
			    objects[i_236_ + 1]
				= (Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734.method797
				   (Canvas_Sub2.method69(arg0, -9468)));
		    }
		    objects[0] = new Integer(Class14_Sub8_Sub38
						 .aClass14_Sub10_Sub1_4734
						 .method812((byte) -108));
		    Class14_Sub21 class14_sub21 = new Class14_Sub21();
		    class14_sub21.anObjectArray3115 = objects;
		    Class133_Sub3.method1830(class14_sub21,
					     arg0 + -1976917688);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((Class133_Sub4.anInt3579 ^ 0xffffffff) != -57)
			break;
		    Class48.method1191((byte) 124);
		    Class133_Sub4.anInt3579 = -1;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_490_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		Class14_Sub9_Sub3.method738(("T1 - " + Class133_Sub4.anInt3579
					     + ","
					     + Class14_Sub2_Sub13.anInt3931
					     + ","
					     + Class14_Sub8_Sub2.anInt4114
					     + " - "
					     + Class14_Sub8_Sub12.anInt4280),
					    null, 95);
		Class14_Sub1.method238((byte) 123);
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "rk.B(" + arg0 + ')');
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4642++;
	    if (arg1 > -58)
		aClass124_4632 = null;
	    int[] is_237_ = aClass149_2851.method2014(arg0, (byte) 104);
	    if (aClass149_2851.aBoolean2402) {
		int[] is_238_
		    = method483(0, (byte) -120, arg0 - 1 & Class115.anInt1927);
		int[] is_239_ = method483(0, (byte) -23, arg0);
		int[] is_240_
		    = method483(0, (byte) -64, Class115.anInt1927 & arg0 - -1);
		for (int i = 0;
		     (Class112.anInt1876 ^ 0xffffffff) < (i ^ 0xffffffff);
		     i++) {
		    int i_241_ = (is_240_[i] + -is_238_[i]) * anInt4637;
		    int i_242_
			= ((-is_239_[Class14_Sub10_Sub1.anInt4882 & i - 1]
			    + is_239_[Class14_Sub10_Sub1.anInt4882 & 1 + i])
			   * anInt4637);
		    int i_243_ = i_241_ >> 522873612;
		    int i_244_ = i_242_ >> 226691276;
		    int i_245_ = i_244_ * i_244_ >> -582843572;
		    int i_246_ = i_243_ * i_243_ >> -363770292;
		    int i_247_
			= (int) (Math.sqrt((double) ((float) (4096
							      + (i_246_
								 + i_245_))
						     / 4096.0F))
				 * 4096.0);
		    int i_248_
			= -1 == (i_247_ ^ 0xffffffff) ? 0 : 16777216 / i_247_;
		    is_237_[i] = -i_248_ + 4096;
		}
	    }
	    is = is_237_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rk.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    if (-1 == (arg0 ^ 0xffffffff))
		anInt4637 = arg2.method784((byte) 113);
	    anInt4638++;
	    if (arg1 != 24777)
		method654(-71);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rk.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anIntArray4628
	    = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047,
			  4095, 8191, 16383, 32767, 65535, 131071, 262143,
			  524287, 1048575, 2097151, 4194303, 8388607, 16777215,
			  33554431, 67108863, 134217727, 268435455, 536870911,
			  1073741823, 2147483647, -1 };
	anInt4633 = 0;
	aClass124_4635
	    = Class14_Sub2_Sub2.method263(1178,
					  "Benutzeroberfl-=che geladen)3");
	anInt4640 = 0;
	aClass124_4631 = Class14_Sub2_Sub2.method263(1178, ")3");
	anInt4636 = -1;
	aClass124_4634 = Class14_Sub2_Sub2.method263(1178, "<col=ff0000>");
	aClass124_4643 = Class14_Sub2_Sub2.method263(1178, "mapdots");
	aClass124_4644
	    = Class14_Sub2_Sub2.method263(1178, "Suche nach Updates )2 ");
    }
}
