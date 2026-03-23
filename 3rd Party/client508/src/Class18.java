/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class18
{
    public static int anInt411;
    public static int anInt412;
    public int[][] anIntArrayArray413;
    public int anInt414;
    public static Class124 aClass124_415
	= Class14_Sub2_Sub2.method263(1178, "unzap");
    public static int anInt416;
    public static int anInt417;
    public static Class124 aClass124_418;
    public int anInt419;
    
    public byte[] method961(boolean arg0, byte[] arg1) {
    while_636_:
	do {
	    do {
		byte[] is;
		try {
		    anInt412++;
		    if (anIntArrayArray413 != null) {
			int i = ((int) ((long) arg1.length * (long) anInt414
					/ (long) anInt419)
				 + 14);
			int[] is_0_ = new int[i];
			int i_1_ = 0;
			int i_2_ = 0;
			for (int i_3_ = 0;
			     (i_3_ ^ 0xffffffff) > (arg1.length ^ 0xffffffff);
			     i_3_++) {
			    int i_4_ = arg1[i_3_];
			    int[] is_5_ = anIntArrayArray413[i_1_];
			    for (int i_6_ = 0; 14 > i_6_; i_6_++)
				is_0_[i_2_ - -i_6_] += is_5_[i_6_] * i_4_;
			    i_1_ += anInt414;
			    int i_7_ = i_1_ / anInt419;
			    i_1_ -= i_7_ * anInt419;
			    i_2_ += i_7_;
			}
			arg1 = new byte[i];
			for (int i_8_ = 0;
			     (i ^ 0xffffffff) < (i_8_ ^ 0xffffffff); i_8_++) {
			    int i_9_ = is_0_[i_8_] + 32768 >> -1867115856;
			    if (-128 <= i_9_) {
				if ((i_9_ ^ 0xffffffff) >= -128)
				    arg1[i_8_] = (byte) i_9_;
				else
				    arg1[i_8_] = (byte) 127;
			    } else
				arg1[i_8_] = (byte) -128;
			}
		    }
		    if (arg0 == true)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_636_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		is = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("cc.A(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method962(byte arg0) {
	try {
	    if (arg0 >= -76)
		aClass124_415 = null;
	    aClass124_415 = null;
	    aClass124_418 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cc.C(" + arg0 + ')');
	}
    }
    
    public int method963(int arg0, int arg1) {
    while_637_:
	do {
	    do {
		int i;
		try {
		    if (arg1 >= 24)
			break;
		    i = -121;
		} catch (RuntimeException runtimeexception) {
		    break while_637_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		if (anIntArrayArray413 != null)
		    arg0 = (int) ((long) anInt414 * (long) arg0
				  / (long) anInt419) + 6;
		anInt417++;
		i = arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "cc.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method964(byte arg0, int arg1) {
    while_638_:
	do {
	    do {
		int i;
		try {
		    anInt416++;
		    if (anIntArrayArray413 != null)
			arg1 = (int) ((long) arg1 * (long) anInt414
				      / (long) anInt419);
		    if (arg0 == -56)
			break;
		    i = -30;
		} catch (RuntimeException runtimeexception) {
		    break while_638_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "cc.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class18(int arg0, int arg1) {
    while_635_:
	do {
	while_634_:
	    do {
		do {
		    try {
			if (arg1 != arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_634_;
		    }
		    return;
		} while (false);
		try {
		    int i = Class95.method1482(arg0, arg1, 90);
		    arg0 /= i;
		    arg1 /= i;
		    anInt414 = arg1;
		    anInt419 = arg0;
		    anIntArrayArray413 = new int[arg0][14];
		    for (int i_10_ = 0; arg0 > i_10_; i_10_++) {
			int[] is = anIntArrayArray413[i_10_];
			double d = (double) arg1 / (double) arg0;
			double d_11_ = 6.0 + (double) i_10_ / (double) arg0;
			int i_12_ = (int) Math.floor(1.0 + (-7.0 + d_11_));
			if (0 > i_12_)
			    i_12_ = 0;
			int i_13_ = (int) Math.ceil(7.0 + d_11_);
			if ((i_13_ ^ 0xffffffff) < -15)
			    i_13_ = 14;
			for (/**/; (i_12_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff);
			     i_12_++) {
			    double d_14_ = d;
			    double d_15_
				= ((double) i_12_ - d_11_) * 3.141592653589793;
			    if (-1.0E-4 > d_15_ || 1.0E-4 < d_15_)
				d_14_ *= Math.sin(d_15_) / d_15_;
			    d_14_
				*= (0.54
				    + 0.46 * Math.cos(((double) i_12_ - d_11_)
						      * 0.2243994752564138));
			    is[i_12_]
				= (int) Math.floor(65536.0 * d_14_ + 0.5);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_635_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("cc.<init>(" + arg0 + ','
						+ arg1 + ')'));
	} while (false);
    }
    
    static {
	anInt411 = 0;
	aClass124_418 = Class14_Sub2_Sub2.method263(1178, "Cabbage");
    }
}
