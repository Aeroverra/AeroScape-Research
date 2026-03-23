/* Class14_Sub8_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Container;
import java.awt.Insets;

public class Class14_Sub8_Sub30 extends Class14_Sub8
{
    public static int anInt4583;
    public static int anInt4584;
    public static int anInt4585;
    public static int anInt4586;
    public static int anInt4587;
    public static Class52 aClass52_4588 = new Class52(50);
    public static int anInt4589;
    public static int anInt4590;
    public int anInt4591;
    public static int anInt4592;
    public int anInt4593 = 4;
    public static int anInt4594 = -1;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4595;
    public static Class52 aClass52_4596 = new Class52(4);
    public static int anInt4597;
    public static int anInt4598;
    public static int anInt4599 = 0;
    
    public Class14_Sub8_Sub30() {
	super(1, false);
	anInt4591 = 4;
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_464_:
	do {
	    do {
		int[][] is;
		try {
		    if (arg1 <= -4)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_464_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		anInt4590++;
		int[][] is_0_ = aClass95_2838.method1481(1, arg0);
		if (aClass95_2838.aBoolean1628) {
		    int i = Class17.anInt407 / anInt4593;
		    int i_1_ = Class112.anInt1876 / anInt4591;
		    int[][] is_2_;
		    if (-1 <= (i ^ 0xffffffff))
			is_2_ = method480(0, 0, 0);
		    else {
			int i_3_ = arg0 % i;
			is_2_ = method480(0, 0, i_3_ * Class17.anInt407 / i);
		    }
		    int[] is_4_ = is_2_[0];
		    int[] is_5_ = is_0_[0];
		    int[] is_6_ = is_2_[1];
		    int[] is_7_ = is_2_[2];
		    int[] is_8_ = is_0_[1];
		    int[] is_9_ = is_0_[2];
		    for (int i_10_ = 0; i_10_ < Class112.anInt1876; i_10_++) {
			int i_11_;
			if (0 < i_1_) {
			    int i_12_ = i_10_ % i_1_;
			    i_11_ = i_12_ * Class112.anInt1876 / i_1_;
			} else
			    i_11_ = 0;
			is_5_[i_10_] = is_4_[i_11_];
			is_8_[i_10_] = is_6_[i_11_];
			is_9_[i_10_] = is_7_[i_11_];
		    }
		}
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ql.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method637(Class133_Sub1 arg0, int arg1, int arg2) {
    while_466_:
	do {
	while_465_:
	    do {
		do {
		    try {
			anInt4583++;
			if ((arg0.anInt3494 ^ 0xffffffff)
			    < (Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff))
			    Class14_Sub8_Sub4.method498(arg0, (byte) -82);
			else if (arg0.anInt3455 < Class14_Sub2_Sub20.anInt4064)
			    Class14_Sub2_Sub10.method307(-125, arg0);
			else
			    Class14_Sub8_Sub25.method613(arg0, -120);
			if (arg2 < -4)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_465_;
		    }
		    return;
		} while (false);
		try {
		    if ((arg0.anInt3495 ^ 0xffffffff) > -129
			|| (arg0.anInt3436 ^ 0xffffffff) > -129
			|| 13184 <= arg0.anInt3495
			|| (arg0.anInt3436 ^ 0xffffffff) <= -13185) {
			arg0.anInt3487 = -1;
			arg0.anInt3495 = (arg0.anIntArray3476[0] * 128
					  + 64 * arg0.anInt3493);
			arg0.anInt3455 = 0;
			arg0.anInt3494 = 0;
			arg0.anInt3445 = -1;
			arg0.anInt3436 = (arg0.anInt3493 * 64
					  + 128 * arg0.anIntArray3443[0]);
			arg0.method1794(false);
		    }
		    if (arg0 == Class14_Sub3.aClass133_Sub1_Sub1_2748
			&& (1536 > arg0.anInt3495
			    || (arg0.anInt3436 ^ 0xffffffff) > -1537
			    || arg0.anInt3495 >= 11776
			    || 11776 <= arg0.anInt3436)) {
			arg0.anInt3494 = 0;
			arg0.anInt3455 = 0;
			arg0.anInt3445 = -1;
			arg0.anInt3495 = (arg0.anInt3493 * 64
					  + 128 * arg0.anIntArray3476[0]);
			arg0.anInt3436 = (128 * arg0.anIntArray3443[0]
					  + arg0.anInt3493 * 64);
			arg0.anInt3487 = -1;
			arg0.method1794(false);
		    }
		    Class47.method1183((byte) 117, arg0);
		    Class125.method1722(arg0, (byte) -87);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_466_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ql.J("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	} while (false);
    }
    
    public static int method638(int arg0, byte arg1, int arg2, int arg3) {
	int i;
	try {
	    anInt4592++;
	    int i_13_ = arg0 / arg3;
	    int i_14_ = arg0 & -1 + arg3;
	    int i_15_ = arg2 / arg3;
	    int i_16_ = Class9_Sub1.method179(i_13_, i_15_, (byte) -75);
	    int i_17_ = arg3 + -1 & arg2;
	    int i_18_ = -108 / ((arg1 - -53) / 56);
	    int i_19_ = Class9_Sub1.method179(1 + i_13_, i_15_, (byte) -75);
	    int i_20_ = Class9_Sub1.method179(i_13_, 1 + i_15_, (byte) -75);
	    int i_21_
		= Class9_Sub1.method179(1 + i_13_, i_15_ - -1, (byte) -75);
	    int i_22_
		= Class9.method154(arg3, i_14_, (byte) -128, i_16_, i_19_);
	    int i_23_
		= Class9.method154(arg3, i_14_, (byte) -128, i_20_, i_21_);
	    i = Class9.method154(arg3, i_17_, (byte) -127, i_22_, i_23_);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ql.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return i;
    }
    
    public static void method639(int arg0) {
	try {
	    Class14_Sub2_Sub8.anImage3830 = null;
	    Class123.aFont2063 = null;
	    Class14_Sub19.aFontMetrics3081 = null;
	    if (arg0 != -1)
		aClass52_4596 = null;
	    anInt4586++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ql.E(" + arg0 + ')');
	}
    }
    
    public static void method640(int arg0) {
	try {
	    aClass14_Sub2_Sub19Array4595 = null;
	    if (arg0 < 118)
		method640(14);
	    aClass52_4596 = null;
	    aClass52_4588 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ql.K(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	do {
	    try {
		if (arg1 != 24777)
		    method637(null, -14, -32);
		anInt4589++;
		int i = arg0;
		if (-1 != (i ^ 0xffffffff)) {
		    if (-2 != (i ^ 0xffffffff))
			break;
		} else {
		    anInt4591 = arg2.method798(arg1 ^ 0x60b8);
		    break;
		}
		anInt4593 = arg2.method798(77);
	    } catch (RuntimeException runtimeexception) {
		throw Class14_Sub8_Sub14.method554(runtimeexception,
						   ("ql.F(" + arg0 + ',' + arg1
						    + ','
						    + (arg2 != null ? "{...}"
						       : "null")
						    + ')'));
	    }
	} while (false);
    }
    
    public static Class14_Sub2_Sub19_Sub1 method641(byte arg0) {
	Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
	try {
	    anInt4585++;
	    int i = 71 / ((arg0 - -32) / 55);
	    int i_24_ = Class17.anIntArray402[0] * Class76.anIntArray1204[0];
	    byte[] is = Class12.aByteArrayArray310[0];
	    int[] is_25_ = new int[i_24_];
	    for (int i_26_ = 0; (i_24_ ^ 0xffffffff) < (i_26_ ^ 0xffffffff);
		 i_26_++)
		is_25_[i_26_]
		    = (Class73.anIntArray1114
		       [Class14_Sub8_Sub26.method617(is[i_26_], 255)]);
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_27_
		= new Class14_Sub2_Sub19_Sub1(Class14_Sub11.anInt2952,
					      Class14_Sub30.anInt3279,
					      Class40.anIntArray675[0],
					      (Class14_Sub2_Sub12
					       .anIntArray3918[0]),
					      Class17.anIntArray402[0],
					      Class76.anIntArray1204[0],
					      is_25_);
	    Class129.method1761((byte) 95);
	    class14_sub2_sub19_sub1 = class14_sub2_sub19_sub1_27_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ql.B(" + arg0 + ')');
	}
	return class14_sub2_sub19_sub1;
    }
    
    public int[] method484(int arg0, byte arg1) {
    while_467_:
	do {
	    do {
		int[] is;
		try {
		    anInt4587++;
		    if (arg1 < -58)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_467_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int[] is_28_ = aClass149_2851.method2014(arg0, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
		    int i = Class17.anInt407 / anInt4593;
		    int i_29_ = Class112.anInt1876 / anInt4591;
		    int[] is_30_;
		    if ((i ^ 0xffffffff) >= -1)
			is_30_ = method483(0, (byte) -104, 0);
		    else {
			int i_31_ = arg0 % i;
			is_30_ = method483(0, (byte) -91,
					   i_31_ * Class17.anInt407 / i);
		    }
		    for (int i_32_ = 0; i_32_ < Class112.anInt1876; i_32_++) {
			if ((i_29_ ^ 0xffffffff) < -1) {
			    int i_33_ = i_32_ % i_29_;
			    is_28_[i_32_]
				= is_30_[i_33_ * Class112.anInt1876 / i_29_];
			} else
			    is_28_[i_32_] = is_30_[0];
		    }
		}
		is = is_28_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ql.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method642(int arg0, int arg1, int arg2, int arg3,
				 Class133 arg4, long arg5, boolean arg6) {
	if (arg4 != null) {
	    Class4 class4 = new Class4();
	    class4.aClass133_124 = arg4;
	    class4.anInt136 = arg1 * 128 + 64;
	    class4.anInt122 = arg2 * 128 + 64;
	    class4.anInt121 = arg3;
	    class4.aLong132 = arg5;
	    class4.aBoolean133 = arg6;
	    if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		 [arg2])
		== null)
		Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		    [arg2]
		    = new Class14_Sub29(arg0, arg1, arg2);
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass4_3237
		= class4;
	}
    }
    
    public static void method643(int arg0, byte arg1) {
	try {
	    anInt4584++;
	    Container container;
	    if (Class14_Sub2_Sub15.aFrame3962 != null)
		container = Class14_Sub2_Sub15.aFrame3962;
	    else if (null == Class14_Sub14.aFrame2986)
		container = Class14_Sub8_Sub34.aClass43_4647.anApplet712;
	    else
		container = Class14_Sub14.aFrame2986;
	    Class14_Sub8_Sub32.anInt4622 = container.getSize().width;
	    Class14_Sub2_Sub21.anInt4086 = container.getSize().height;
	    if (Class14_Sub14.aFrame2986 == container) {
		Insets insets = Class14_Sub14.aFrame2986.getInsets();
		Class14_Sub2_Sub21.anInt4086 -= insets.top + insets.bottom;
		Class14_Sub8_Sub32.anInt4622 -= insets.right + insets.left;
	    }
	    if (Class52.aBoolean845 || null != Class14_Sub2_Sub15.aFrame3962) {
		Class14_Sub20.anInt3094
		    = -Class14_Sub13.anInt2964 + Class14_Sub2_Sub21.anInt4086;
		Class83.anInt1340 = Class14_Sub8_Sub32.anInt4622;
		Class76.anInt1197 = Class14_Sub13.anInt2964;
		Class55.anInt895 = 0;
	    } else {
		Class14_Sub20.anInt3094 = 503;
		Class83.anInt1340 = 765;
		Class76.anInt1197 = Class14_Sub13.anInt2964;
		Class55.anInt895 = (-765 + Class14_Sub8_Sub32.anInt4622) / 2;
	    }
	    Class121.method1628(Class83.anInt1340, Class14_Sub20.anInt3094);
	    Class49.aCanvas819.setSize(Class83.anInt1340,
				       Class14_Sub20.anInt3094);
	    if (container == Class14_Sub14.aFrame2986) {
		Insets insets = Class14_Sub14.aFrame2986.getInsets();
		Class49.aCanvas819.setLocation(insets.left + Class55.anInt895,
					       Class76.anInt1197 + insets.top);
	    } else
		Class49.aCanvas819.setLocation(Class55.anInt895,
					       Class76.anInt1197);
	    if (-1 != Class14_Sub2_Sub12.anInt3912)
		Class26_Sub2.method1032(true, -1291652884);
	    Class132.method1779(0);
	    if (Class43.aString705.startsWith("mac"))
		Class132.aLong2169
		    = Class84.method1413((byte) -57) - -(long) arg0;
	    if (arg1 > -77)
		method643(-67, (byte) 80);
	    Class56_Sub1.aLong3317
		= Class84.method1413((byte) 105) - -(long) arg0;
	    if (0 == arg0 && null != Class14_Sub15.aClass36_2990
		&& (30 == Class14_Sub8_Sub16.anInt4356
		    || Class14_Sub8_Sub16.anInt4356 == 25))
		Class88.method1436((byte) -92);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ql.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    static {
	anInt4598 = 0;
    }
}
