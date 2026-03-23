/* Class14_Sub8_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub39_Sub1 extends Class14_Sub8_Sub39
{
    public static int anInt5096;
    public static int anInt5097 = 0;
    public static int anInt5098;
    public static Class124 aClass124_5099 = null;
    public static int anInt5100;
    public static Class124[] aClass124Array5101 = new Class124[1000];
    public static byte[] aByteArray5102;
    public static int anInt5103;
    
    public static Class124 method683(boolean arg0, int arg1, int arg2,
				     Class124[] arg3) {
    while_524_:
	do {
	    int i;
	    int i_0_;
	    byte[] is;
	    do {
		Class124 class124;
		try {
		    anInt5103++;
		    i = 0;
		    for (int i_1_ = 0;
			 (i_1_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_1_++) {
			if (null == arg3[arg1 + i_1_])
			    arg3[arg1 - -i_1_] = Class148.aClass124_2382;
			i += arg3[i_1_ + arg1].anInt2507;
		    }
		    i_0_ = 0;
		    is = new byte[i];
		    if (arg0 == true)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_524_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		for (int i_2_ = 0; (arg2 ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		     i_2_++) {
		    Class124 class124_3_ = arg3[i_2_ + arg1];
		    Class72.method1322(class124_3_.aByteArray2495, 0, is, i_0_,
				       class124_3_.anInt2507);
		    i_0_ += class124_3_.anInt2507;
		}
		Class124 class124_4_ = new Class124();
		class124_4_.aByteArray2495 = is;
		class124_4_.anInt2507 = i;
		class124 = class124_4_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("me.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method684(int arg0) {
    while_526_:
	do {
	while_525_:
	    do {
		do {
		    try {
			if (arg0 == 16711680)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_525_;
		    }
		    return;
		} while (false);
		try {
		    aByteArray5102 = null;
		    aClass124Array5101 = null;
		    aClass124_5099 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_526_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "me.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method685(int arg0) {
	try {
	    anInt5096++;
	    Class132.method1778(0, (byte) 120, 0);
	    if (arg0 > -25)
		method683(false, -66, -51, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "me.E(" + arg0 + ')');
	}
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt5100++;
	    if (arg1 >= -4)
		method684(-110);
	    int[][] is_5_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628 && method679(true)) {
		int[] is_6_ = is_5_[0];
		int[] is_7_ = is_5_[1];
		int i = arg0 % anInt4744 * anInt4744;
		int[] is_8_ = is_5_[2];
		for (int i_9_ = 0; Class112.anInt1876 > i_9_; i_9_++) {
		    int i_10_ = anIntArray4743[i + i_9_ % anInt4753];
		    is_8_[i_9_]
			= Class14_Sub8_Sub26.method617(4080,
						       i_10_ << 786563556);
		    is_7_[i_9_] = (Class14_Sub8_Sub26.method617(i_10_, 65280)
				   >> 2017713476);
		    is_6_[i_9_]
			= (Class14_Sub8_Sub26.method617(i_10_, 16711680)
			   >> -1501880692);
		}
	    }
	    is = is_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("me.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    static {
	anInt5098 = -1;
	aByteArray5102 = new byte[520];
    }
}
