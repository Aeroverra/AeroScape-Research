/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class107
{
    public static Class124 aClass124_1795;
    public static int anInt1796;
    public Class14_Sub8 aClass14_Sub8_1797;
    public Class14_Sub8[] aClass14_Sub8Array1798;
    public static int anInt1799;
    public static Class124 aClass124_1800;
    public static Class124 aClass124_1801
	= Class14_Sub2_Sub2.method263(1178, "VOLL");
    public static int anInt1802;
    public static int anInt1803;
    public static int anInt1804;
    public int[] anIntArray1805;
    public static int anInt1806;
    public static int anInt1807;
    public static int anInt1808;
    public static int[] anIntArray1809;
    public int[] anIntArray1810;
    public static int anInt1811;
    public static int anInt1812;
    public Class14_Sub8 aClass14_Sub8_1813;
    
    public static void method1547(int arg0, int arg1, int arg2, int arg3,
				  int arg4, boolean arg5) {
	try {
	    anInt1803++;
	    for (int i = arg1; (arg3 + arg1 ^ 0xffffffff) <= (i ^ 0xffffffff);
		 i++) {
		for (int i_0_ = arg2;
		     (i_0_ ^ 0xffffffff) >= (arg2 - -arg4 ^ 0xffffffff);
		     i_0_++) {
		    if (0 <= i_0_ && (i_0_ ^ 0xffffffff) > -105
			&& -1 >= (i ^ 0xffffffff) && 104 > i)
			Class99_Sub2.aByteArrayArrayArray3354[arg0][i_0_][i]
			    = (byte) 127;
		}
	    }
	    if (arg5)
		method1552(111, 119);
	    for (int i = arg1; (arg3 + arg1 ^ 0xffffffff) < (i ^ 0xffffffff);
		 i++) {
		for (int i_1_ = arg2; arg4 + arg2 > i_1_; i_1_++) {
		    if (-1 >= (i_1_ ^ 0xffffffff) && i_1_ < 104 && 0 <= i
			&& i < 104)
			Class114.anIntArrayArrayArray1896[arg0][i_1_][i]
			    = ((arg0 ^ 0xffffffff) < -1
			       ? (Class114.anIntArrayArrayArray1896[arg0 - 1]
				  [i_1_][i])
			       : 0);
		}
	    }
	    if ((arg2 ^ 0xffffffff) < -1 && arg2 < 104) {
		for (int i = 1 + arg1; i < arg3 + arg1; i++) {
		    if (i >= 0 && -105 < (i ^ 0xffffffff))
			Class114.anIntArrayArrayArray1896[arg0][arg2][i]
			    = (Class114.anIntArrayArrayArray1896[arg0]
			       [-1 + arg2][i]);
		}
	    }
	    if (-1 > (arg1 ^ 0xffffffff) && (arg1 ^ 0xffffffff) > -105) {
		for (int i = arg2 - -1;
		     (arg4 + arg2 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    if (i >= 0 && -105 < (i ^ 0xffffffff))
			Class114.anIntArrayArrayArray1896[arg0][i][arg1]
			    = (Class114.anIntArrayArrayArray1896[arg0][i]
			       [arg1 - 1]);
		}
	    }
	    if (arg2 >= 0 && 0 <= arg1 && 104 > arg2
		&& (arg1 ^ 0xffffffff) > -105) {
		if (0 == arg0) {
		    if ((arg2 ^ 0xffffffff) < -1
			&& ((Class114.anIntArrayArrayArray1896[arg0][arg2 + -1]
			     [arg1])
			    ^ 0xffffffff) != -1)
			Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
			    = (Class114.anIntArrayArrayArray1896[arg0]
			       [-1 + arg2][arg1]);
		    else if (arg1 <= 0
			     || 0 == (Class114.anIntArrayArrayArray1896[arg0]
				      [arg2][arg1 - 1])) {
			if ((arg2 ^ 0xffffffff) < -1
			    && (arg1 ^ 0xffffffff) < -1
			    && (Class114.anIntArrayArrayArray1896[arg0]
				[-1 + arg2][-1 + arg1]) != 0)
			    Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
				= (Class114.anIntArrayArrayArray1896[arg0]
				   [arg2 + -1][-1 + arg1]);
		    } else
			Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
			    = (Class114.anIntArrayArrayArray1896[arg0][arg2]
			       [-1 + arg1]);
		} else if (arg2 > 0 && (((Class114.anIntArrayArrayArray1896
					  [-1 + arg0][arg2 - 1][arg1])
					 ^ 0xffffffff)
					!= ((Class114.anIntArrayArrayArray1896
					     [arg0][-1 + arg2][arg1])
					    ^ 0xffffffff)))
		    Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
			= (Class114.anIntArrayArrayArray1896[arg0][-1 + arg2]
			   [arg1]);
		else if (-1 <= (arg1 ^ 0xffffffff)
			 || ((Class114.anIntArrayArrayArray1896[-1 + arg0]
			      [arg2][arg1 - 1])
			     == (Class114.anIntArrayArrayArray1896[arg0][arg2]
				 [arg1 + -1]))) {
		    if (arg2 > 0 && arg1 > 0
			&& ((Class114.anIntArrayArrayArray1896[arg0][-1 + arg2]
			     [arg1 - 1])
			    != (Class114.anIntArrayArrayArray1896[-1 + arg0]
				[-1 + arg2][-1 + arg1])))
			Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
			    = (Class114.anIntArrayArrayArray1896[arg0]
			       [arg2 - 1][-1 + arg1]);
		} else
		    Class114.anIntArrayArrayArray1896[arg0][arg2][arg1]
			= (Class114.anIntArrayArrayArray1896[arg0][arg2]
			   [arg1 + -1]);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qh.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public boolean method1548(Interface3 arg0, int arg1, Class9 arg2) {
    while_1044_:
	do {
	    int i;
	    try {
		anInt1812++;
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((anIntArray1810.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
		if (!arg2.method171(29499, anIntArray1810[i]))
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1044_;
		}
	    }
	    i = 0;
	    if (arg1 > -118)
		anInt1804 = -91;
	    while ((anIntArray1805.length ^ 0xffffffff) < (i ^ 0xffffffff)) {
		if (!arg0.method10((byte) -93, anIntArray1805[i]))
		    return false;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1044_;
		}
	    }
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qh.I("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method1549(int arg0, int arg1) {
	try {
	    anInt1796++;
	    Class133_Sub4.anInt3578 = arg0;
	    Class98.method1494(arg1, -5651);
	    Class98.method1494(4, -5651);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qh.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static int method1550(Class124 arg0, byte arg1) {
    while_1045_:
	do {
	    do {
		int i;
		try {
		    anInt1807++;
		    if (arg1 == -107)
			break;
		    i = -20;
		} catch (RuntimeException runtimeexception) {
		    break while_1045_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 1 + arg0.method1693(arg1 ^ ~0x6a);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qh.F("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1551(int arg0) {
	try {
	    anInt1799++;
	    if (-3 != (Class14_Sub8_Sub31.anInt4608 ^ 0xffffffff)) {
		if (((Class125_Sub1.anInt3367 ^ 0xffffffff)
		     == (Class14_Sub8_Sub33.anInt4629 ^ 0xffffffff))
		    && Class139.anInt2230 == Class14_Sub8_Sub32.anInt4613) {
		    Class14_Sub8_Sub31.anInt4608 = 0;
		    Class14_Sub8_Sub14
			.method552(0, Class14_Sub8_Sub38.anInt4729 - 1);
		} else {
		    Class95.anInt1622 = Class139.anInt2230;
		    Class26_Sub2.anInt3299 = Class125_Sub1.anInt3367;
		    Class14_Sub8_Sub31.anInt4608 = 2;
		}
	    } else if (((Class14_Sub8_Sub33.anInt4629 ^ 0xffffffff)
			== (Class26_Sub2.anInt3299 ^ 0xffffffff))
		       && Class14_Sub8_Sub32.anInt4613 == Class95.anInt1622) {
		Class14_Sub8_Sub31.anInt4608 = 0;
		Class14_Sub8_Sub14.method552(0,
					     Class14_Sub8_Sub38.anInt4729 - 1);
	    }
	    if (arg0 != -23473)
		method1554((byte) 13);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qh.A(" + arg0 + ')');
	}
    }
    
    public static Class124 method1552(int arg0, int arg1) {
	Class124 class124;
	try {
	    if (arg1 != 27968)
		anIntArray1809 = null;
	    anInt1811++;
	    class124
		= (Class14_Sub8_Sub7.method515
		   ((new Class124[]
		     { Class83.method1407(arg1 ^ 0x6d52,
					  arg0 >> 1416413912 & 0xff),
		       Class14_Sub8_Sub33.aClass124_4631,
		       Class83.method1407(arg1 ^ 0x6d21,
					  (arg0 & 0xffe2bd) >> 1249029840),
		       Class14_Sub8_Sub33.aClass124_4631,
		       Class83.method1407(20, (0xff43 & arg0) >> 1438332424),
		       Class14_Sub8_Sub33.aClass124_4631,
		       Class83.method1407(59, 0xff & arg0) }),
		    (byte) -39));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qh.H(" + arg0 + ',' + arg1
						+ ')'));
	}
	return class124;
    }
    
    public int[] method1553(int arg0, boolean arg1, int arg2, boolean arg3,
			    Class9 arg4, double arg5, int arg6,
			    Interface3 arg7) {
	int[] is;
	try {
	    Class14_Sub22.method898(arg2 + 100, arg5);
	    anInt1808++;
	    Class14_Sub13.anInterface3_2960 = arg7;
	    Class7_Sub2.aClass9_2671 = arg4;
	    Class38.method1117(0, arg6, arg0);
	    for (int i = 0; (i ^ 0xffffffff) > (aClass14_Sub8Array1798.length
						^ 0xffffffff); i++)
		aClass14_Sub8Array1798[i].method473(arg6, arg0, -120);
	    int[] is_2_ = new int[arg0 * arg6];
	    int i = 0;
	    int i_3_;
	    int i_4_;
	    int i_5_;
	    if (!arg1) {
		i_3_ = 0;
		i_4_ = 1;
		i_5_ = arg0;
	    } else {
		i_3_ = arg0 - 1;
		i_4_ = -1;
		i_5_ = -1;
	    }
	    for (int i_6_ = arg2; (i_6_ ^ 0xffffffff) > (arg6 ^ 0xffffffff);
		 i_6_++) {
		if (arg3)
		    i = i_6_;
		int[] is_7_;
		int[] is_8_;
		int[] is_9_;
		if (!aClass14_Sub8_1797.aBoolean2862) {
		    int[][] is_10_ = aClass14_Sub8_1797.method474(i_6_, -100);
		    is_8_ = is_10_[1];
		    is_9_ = is_10_[0];
		    is_7_ = is_10_[2];
		} else {
		    int[] is_11_
			= aClass14_Sub8_1797.method484(i_6_, (byte) -100);
		    is_7_ = is_11_;
		    is_8_ = is_11_;
		    is_9_ = is_11_;
		}
		for (int i_12_ = i_3_;
		     (i_5_ ^ 0xffffffff) != (i_12_ ^ 0xffffffff);
		     i_12_ += i_4_) {
		    int i_13_ = is_9_[i_12_] >> -1589047228;
		    if ((i_13_ ^ 0xffffffff) < -256)
			i_13_ = 255;
		    int i_14_ = is_8_[i_12_] >> -1587544380;
		    if (i_14_ > 255)
			i_14_ = 255;
		    if (i_13_ < 0)
			i_13_ = 0;
		    i_13_ = Class14_Sub9_Sub1.anIntArray4827[i_13_];
		    if (i_14_ < 0)
			i_14_ = 0;
		    int i_15_ = is_7_[i_12_] >> 1995487940;
		    if (i_15_ > 255)
			i_15_ = 255;
		    if (0 > i_15_)
			i_15_ = 0;
		    i_15_ = Class14_Sub9_Sub1.anIntArray4827[i_15_];
		    i_14_ = Class14_Sub9_Sub1.anIntArray4827[i_14_];
		    is_2_[i++] = ((i_14_ << 1539251112) + (i_13_ << 1860976016)
				  + i_15_);
		    if (arg3)
			i += -1 + arg0;
		}
	    }
	    for (int i_16_ = 0;
		 ((i_16_ ^ 0xffffffff)
		  > (aClass14_Sub8Array1798.length ^ 0xffffffff));
		 i_16_++)
		aClass14_Sub8Array1798[i_16_].method478(arg2 ^ 0x0);
	    is = is_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qh.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ',' + arg6 + ','
						+ (arg7 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return is;
    }
    
    public static void method1554(byte arg0) {
	try {
	    aClass124_1795 = null;
	    anIntArray1809 = null;
	    aClass124_1801 = null;
	    aClass124_1800 = null;
	    if (arg0 >= -64)
		anIntArray1809 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qh.B(" + arg0 + ')');
	}
    }
    
    public Class107() {
	try {
	    anIntArray1810 = new int[0];
	    anIntArray1805 = new int[0];
	    aClass14_Sub8_1797 = new Class14_Sub8_Sub23();
	    aClass14_Sub8_1797.anInt2837 = 1;
	    aClass14_Sub8_1813 = new Class14_Sub8_Sub23();
	    aClass14_Sub8Array1798 = new Class14_Sub8[] { aClass14_Sub8_1797,
							  aClass14_Sub8_1813 };
	    aClass14_Sub8_1813.anInt2837 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qh.<init>()");
	}
    }
    
    public byte[] method1555(int arg0, Interface3 arg1, double arg2,
			     boolean arg3, int arg4, byte arg5, Class9 arg6) {
    while_1046_:
	do {
	    byte[] is;
	    do {
		byte[] is_17_;
		try {
		    anInt1802++;
		    Class14_Sub22.method898(93, arg2);
		    is = new byte[arg4 * (arg0 * 4)];
		    Class14_Sub13.anInterface3_2960 = arg1;
		    Class7_Sub2.aClass9_2671 = arg6;
		    if (arg5 <= -33)
			break;
		    is_17_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1046_;
		}
		return is_17_;
	    } while (false);
	    byte[] is_18_;
	    try {
		Class38.method1117(0, arg4, arg0);
		for (int i = 0; ((aClass14_Sub8Array1798.length ^ 0xffffffff)
				 < (i ^ 0xffffffff)); i++)
		    aClass14_Sub8Array1798[i].method473(arg4, arg0, -73);
		int i = 0;
		for (int i_19_ = 0; i_19_ < arg4; i_19_++) {
		    if (arg3)
			i = i_19_ << 441684002;
		    int[] is_20_;
		    int[] is_21_;
		    int[] is_22_;
		    if (aClass14_Sub8_1797.aBoolean2862) {
			int[] is_23_
			    = aClass14_Sub8_1797.method484(i_19_, (byte) -110);
			is_22_ = is_23_;
			is_20_ = is_23_;
			is_21_ = is_23_;
		    } else {
			int[][] is_24_
			    = aClass14_Sub8_1797.method474(i_19_, -45);
			is_20_ = is_24_[2];
			is_21_ = is_24_[0];
			is_22_ = is_24_[1];
		    }
		    int[] is_25_;
		    if (aClass14_Sub8_1813.aBoolean2862)
			is_25_
			    = aClass14_Sub8_1813.method484(i_19_, (byte) -97);
		    else
			is_25_ = aClass14_Sub8_1813.method474(i_19_, -26)[0];
		    for (int i_26_ = -1 + arg0; (i_26_ ^ 0xffffffff) <= -1;
			 i_26_--) {
			int i_27_ = is_22_[i_26_] >> 375445060;
			if (i_27_ > 255)
			    i_27_ = 255;
			int i_28_ = is_21_[i_26_] >> 1761307236;
			if (i_28_ > 255)
			    i_28_ = 255;
			if (i_28_ < 0)
			    i_28_ = 0;
			if (-1 < (i_27_ ^ 0xffffffff))
			    i_27_ = 0;
			int i_29_ = is_20_[i_26_] >> -44764156;
			i_27_ = Class14_Sub9_Sub1.anIntArray4827[i_27_];
			if ((i_29_ ^ 0xffffffff) < -256)
			    i_29_ = 255;
			i_28_ = Class14_Sub9_Sub1.anIntArray4827[i_28_];
			if ((i_29_ ^ 0xffffffff) > -1)
			    i_29_ = 0;
			i_29_ = Class14_Sub9_Sub1.anIntArray4827[i_29_];
			int i_30_;
			if (-1 == (i_28_ ^ 0xffffffff)
			    && (i_27_ ^ 0xffffffff) == -1
			    && -1 == (i_29_ ^ 0xffffffff))
			    i_30_ = 0;
			else {
			    i_30_ = is_25_[i_26_] >> 1647957892;
			    if ((i_30_ ^ 0xffffffff) < -256)
				i_30_ = 255;
			    if ((i_30_ ^ 0xffffffff) > -1)
				i_30_ = 0;
			}
			is[i++] = (byte) i_28_;
			is[i++] = (byte) i_27_;
			is[i++] = (byte) i_29_;
			is[i++] = (byte) i_30_;
			if (arg3)
			    i += -4 + (arg0 << -1893150014);
		    }
		}
		for (int i_31_ = 0;
		     ((aClass14_Sub8Array1798.length ^ 0xffffffff)
		      < (i_31_ ^ 0xffffffff));
		     i_31_++)
		    aClass14_Sub8Array1798[i_31_].method478(0);
		is_18_ = is;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is_18_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qh.D(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ','
					    + arg4 + ',' + arg5 + ','
					    + (arg6 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public Class107(Class14_Sub10 arg0) {
	try {
	    int i = arg0.method798(-34);
	    aClass14_Sub8Array1798 = new Class14_Sub8[i];
	    int i_32_ = 0;
	    int[][] is = new int[i][];
	    int i_33_ = 0;
	    for (int i_34_ = 0; i_34_ < i; i_34_++) {
		Class14_Sub8 class14_sub8
		    = Class14_Sub2_Sub9.method303(0, arg0);
		if (0 <= class14_sub8.method477(-2538))
		    i_32_++;
		if ((class14_sub8.method479((byte) 83) ^ 0xffffffff) <= -1)
		    i_33_++;
		int i_35_ = class14_sub8.aClass14_Sub8Array2831.length;
		is[i_34_] = new int[i_35_];
		for (int i_36_ = 0; i_36_ < i_35_; i_36_++)
		    is[i_34_][i_36_] = arg0.method798(79);
		aClass14_Sub8Array1798[i_34_] = class14_sub8;
	    }
	    anIntArray1805 = new int[i_33_];
	    anIntArray1810 = new int[i_32_];
	    i_33_ = 0;
	    i_32_ = 0;
	    for (int i_37_ = 0; (i_37_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_37_++) {
		Class14_Sub8 class14_sub8 = aClass14_Sub8Array1798[i_37_];
		int i_38_ = class14_sub8.aClass14_Sub8Array2831.length;
		for (int i_39_ = 0;
		     (i_39_ ^ 0xffffffff) > (i_38_ ^ 0xffffffff); i_39_++)
		    class14_sub8.aClass14_Sub8Array2831[i_39_]
			= aClass14_Sub8Array1798[is[i_37_][i_39_]];
		int i_40_ = class14_sub8.method477(-2538);
		int i_41_ = class14_sub8.method479((byte) 127);
		if (-1 > (i_40_ ^ 0xffffffff))
		    anIntArray1810[i_32_++] = i_40_;
		if (0 < i_41_)
		    anIntArray1805[i_33_++] = i_41_;
		is[i_37_] = null;
	    }
	    aClass14_Sub8_1797 = aClass14_Sub8Array1798[arg0.method798(59)];
	    aClass14_Sub8_1813 = aClass14_Sub8Array1798[arg0.method798(-120)];
	    is = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qh.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_1800
	    = Class14_Sub2_Sub2.method263(1178, ")3runescape)3com)4l=");
	anInt1806 = 0;
	aClass124_1795 = Class14_Sub2_Sub2.method263(1178, "hitmarks");
	anInt1804 = 0;
    }
}
