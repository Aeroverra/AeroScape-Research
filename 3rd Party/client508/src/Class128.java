/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class128
{
    public static Class2[][][] aClass2ArrayArrayArray2119
	= new Class2[4][104][104];
    public static int anInt2120;
    public static int anInt2121;
    public static Class124 aClass124_2122;
    public static Class124 aClass124_2123
	= Class14_Sub2_Sub2.method263(1178, "glow3:");
    public static int anInt2124;
    public static int anInt2125;
    public static Class124 aClass124_2126;
    public static int anInt2127;
    public static Class124 aClass124_2128
	= Class14_Sub2_Sub2.method263(1178, "p12_full");
    
    public static boolean method1755(int arg0) {
	boolean bool;
	try {
	    anInt2120++;
	    if (arg0 != 130068615)
		method1755(-57);
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "td.D(" + arg0 + ')');
	}
	return bool;
    }
    
    public static void method1756(boolean arg0) {
	try {
	    if (arg0 != true)
		aClass124_2128 = null;
	    aClass2ArrayArrayArray2119 = null;
	    aClass124_2128 = null;
	    aClass124_2126 = null;
	    aClass124_2122 = null;
	    aClass124_2123 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "td.B(" + arg0 + ')');
	}
    }
    
    public static boolean method1757(int arg0, int arg1, int arg2, int arg3,
				     Class133 arg4, int arg5, long arg6,
				     int arg7, int arg8, int arg9, int arg10) {
	if (arg4 == null)
	    return true;
	return Class14_Sub8_Sub19.method580(arg0, arg7, arg8, arg9 - arg7 + 1,
					    arg10 - arg8 + 1, arg1, arg2, arg3,
					    arg4, arg5, true, arg6);
    }
    
    public static void method1758(int arg0, byte arg1) {
	try {
	    if (null == Class14_Sub8_Sub6.anIntArray4191
		|| ((arg0 ^ 0xffffffff)
		    < (Class14_Sub8_Sub6.anIntArray4191.length ^ 0xffffffff)))
		Class14_Sub8_Sub6.anIntArray4191 = new int[arg0];
	    int i = -29 % ((35 - arg1) / 50);
	    anInt2127++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("td.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static int method1759(int arg0, byte arg1) {
    while_1144_:
	do {
	    double d;
	    double d_0_;
	    double d_1_;
	    do {
		int i;
		try {
		    d = (double) (arg0 & 0xff) / 256.0;
		    d_0_ = (double) ((0xffe7f9 & arg0) >> 765610416) / 256.0;
		    d_1_ = (double) (arg0 >> -125412728 & 0xff) / 256.0;
		    anInt2125++;
		    if (arg1 == 48)
			break;
		    i = 42;
		} catch (RuntimeException runtimeexception) {
		    break while_1144_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		double d_2_ = d_0_;
		double d_3_ = d_0_;
		double d_4_ = 0.0;
		if (d_3_ > d_1_)
		    d_3_ = d_1_;
		if (d_2_ < d_1_)
		    d_2_ = d_1_;
		double d_5_ = 0.0;
		if (d < d_3_)
		    d_3_ = d;
		if (d_2_ < d)
		    d_2_ = d;
		double d_6_ = (d_3_ + d_2_) / 2.0;
		if (d_3_ != d_2_) {
		    if (d_0_ == d_2_)
			d_4_ = (d_1_ - d) / (d_2_ - d_3_);
		    else if (d_1_ != d_2_) {
			if (d == d_2_)
			    d_4_ = (-d_1_ + d_0_) / (d_2_ - d_3_) + 4.0;
		    } else
			d_4_ = 2.0 + (-d_0_ + d) / (-d_3_ + d_2_);
		    if (d_6_ < 0.5)
			d_5_ = (d_2_ - d_3_) / (d_3_ + d_2_);
		    if (0.5 <= d_6_)
			d_5_ = (d_2_ - d_3_) / (-d_3_ + (2.0 - d_2_));
		}
		int i_7_ = (int) (d_6_ * 256.0);
		if ((i_7_ ^ 0xffffffff) <= -1) {
		    if (-256 > (i_7_ ^ 0xffffffff))
			i_7_ = 255;
		} else
		    i_7_ = 0;
		int i_8_ = (int) (256.0 * d_5_);
		if ((i_8_ ^ 0xffffffff) <= -1) {
		    if (i_8_ > 255)
			i_8_ = 255;
		} else
		    i_8_ = 0;
		if (243 >= i_7_) {
		    if (217 >= i_7_) {
			if (i_7_ <= 192) {
			    if (179 < i_7_)
				i_8_ >>= 1;
			} else
			    i_8_ >>= 2;
		    } else
			i_8_ >>= 3;
		} else
		    i_8_ >>= 4;
		d_4_ /= 6.0;
		int i_9_ = (int) (256.0 * d_4_);
		i = ((i_7_ >> -2072027615) + (i_9_ >> -1972992414 << 568804202)
		     + (i_8_ >> -1386562459 << 130068615));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "td.C(" + arg0 + ',' + arg1 + ')');
    }
    
    static {
	aClass124_2126 = aClass124_2123;
	aClass124_2122 = aClass124_2123;
    }
}
