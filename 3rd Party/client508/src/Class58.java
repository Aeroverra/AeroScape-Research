/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.security.MessageDigest;

public class Class58
{
    public static int anInt937;
    public static int anInt938;
    public static Class124 aClass124_939
	= Class14_Sub2_Sub2.method263(1178, "red:");
    public static int anInt940;
    public static Class124 aClass124_941
	= Class14_Sub2_Sub2.method263(1178, "::errortest");
    public static Class124 aClass124_942 = aClass124_939;
    public static Class124 aClass124_943;
    public static Class76[] aClass76Array944 = new Class76[27];
    public static int anInt945;
    public static int anInt946;
    public static int anInt947;
    public static int anInt948;
    public static int anInt949;
    public static boolean[] aBooleanArray950;
    
    public static void method1255(int arg0, Class14_Sub3 arg1, int arg2,
				  int arg3, int arg4, int arg5) {
    while_846_:
	do {
	while_845_:
	    do {
		do {
		    try {
			anInt940++;
			if (arg1.anInt2753 != -1
			    || arg1.anIntArray2746 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_845_;
		    }
		    return;
		} while (false);
		int i;
		do {
		    try {
			i = 0;
			if (arg4 != -31083)
			    method1255(-118, null, 96, 63, 22, -74);
			if ((arg5 ^ 0xffffffff)
			    < (arg1.anInt2761 ^ 0xffffffff))
			    i += -arg1.anInt2761 + arg5;
			else if (arg5 < arg1.anInt2774)
			    i += -arg5 + arg1.anInt2774;
			if (arg3 > arg1.anInt2751)
			    i += -arg1.anInt2751 + arg3;
			else if (arg1.anInt2767 > arg3)
			    i += arg1.anInt2767 + -arg3;
			if (arg1.anInt2765 != 0 && arg1.anInt2765 >= i - 64
			    && Class100.anInt1691 != 0
			    && (arg1.anInt2763 ^ 0xffffffff) == (arg2
								 ^ 0xffffffff))
			    break;
			if (arg1.aClass14_Sub9_Sub4_2775 != null) {
			    Class33.aClass14_Sub9_Sub2_585
				.method730(arg1.aClass14_Sub9_Sub4_2775);
			    arg1.aClass14_Sub9_Sub4_2775 = null;
			}
			if (null != arg1.aClass14_Sub9_Sub4_2760) {
			    Class33.aClass14_Sub9_Sub2_585
				.method730(arg1.aClass14_Sub9_Sub4_2760);
			    arg1.aClass14_Sub9_Sub4_2760 = null;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_845_;
		    }
		    return;
		} while (false);
		try {
		    i -= 64;
		    if ((i ^ 0xffffffff) > -1)
			i = 0;
		    int i_0_ = (Class100.anInt1691 * (-i + arg1.anInt2765)
				/ arg1.anInt2765);
		    if (null == arg1.aClass14_Sub9_Sub4_2775) {
			if (arg1.anInt2753 >= 0) {
			    Class91 class91
				= Class91.method1451((Class14_Sub10
						      .aClass9_Sub1_2901),
						     arg1.anInt2753, 0);
			    if (class91 != null) {
				Class14_Sub12_Sub1 class14_sub12_sub1
				    = class91.method1449()
					  .method857(Class85.aClass18_1362);
				Class14_Sub9_Sub4 class14_sub9_sub4
				    = (Class14_Sub9_Sub4.method775
				       (class14_sub12_sub1, 100, i_0_));
				class14_sub9_sub4.method765(-1);
				Class33.aClass14_Sub9_Sub2_585
				    .method735(class14_sub9_sub4);
				arg1.aClass14_Sub9_Sub4_2775
				    = class14_sub9_sub4;
			    }
			}
		    } else
			arg1.aClass14_Sub9_Sub4_2775.method768(i_0_);
		    if (null != arg1.aClass14_Sub9_Sub4_2760) {
			arg1.aClass14_Sub9_Sub4_2760.method768(i_0_);
			if (!arg1.aClass14_Sub9_Sub4_2760
				 .method229((byte) -109))
			    arg1.aClass14_Sub9_Sub4_2760 = null;
		    } else if (null != arg1.anIntArray2746
			       && -1 <= ((arg1.anInt2773 -= arg0)
					 ^ 0xffffffff)) {
			int i_1_ = (int) ((double) arg1.anIntArray2746.length
					  * Math.random());
			Class91 class91
			    = Class91.method1451((Class14_Sub10
						  .aClass9_Sub1_2901),
						 arg1.anIntArray2746[i_1_], 0);
			if (class91 != null) {
			    Class14_Sub12_Sub1 class14_sub12_sub1
				= class91.method1449()
				      .method857(Class85.aClass18_1362);
			    Class14_Sub9_Sub4 class14_sub9_sub4
				= (Class14_Sub9_Sub4.method775
				   (class14_sub12_sub1, 100, i_0_));
			    class14_sub9_sub4.method765(0);
			    Class33.aClass14_Sub9_Sub2_585
				.method735(class14_sub9_sub4);
			    arg1.aClass14_Sub9_Sub4_2760 = class14_sub9_sub4;
			    arg1.anInt2773
				= (int) ((double) (arg1.anInt2769
						   + -arg1.anInt2772)
					 * Math.random()) + arg1.anInt2772;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_846_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("hc.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	} while (false);
    }
    
    public static Class124 method1256(int arg0, boolean arg1, long arg2,
				      int arg3) {
	Class124 class124;
	try {
	    anInt938++;
	    if (arg3 < 2 || -37 > (arg3 ^ 0xffffffff))
		throw new IllegalArgumentException("Invalid radix:" + arg3);
	    long l = arg2 / (long) arg3;
	    int i = 1;
	    while (0L != l) {
		l /= (long) arg3;
		i++;
	    }
	    int i_2_ = i;
	    if (0L > arg2 || arg1)
		i_2_++;
	    byte[] is = new byte[i_2_];
	    if (0L > arg2)
		is[0] = (byte) 45;
	    else if (arg1)
		is[0] = (byte) 43;
	    int i_3_ = -84 % ((arg0 - -54) / 46);
	    for (int i_4_ = 0; (i ^ 0xffffffff) < (i_4_ ^ 0xffffffff);
		 i_4_++) {
		int i_5_ = (int) (arg2 % (long) arg3);
		if (-1 < (i_5_ ^ 0xffffffff))
		    i_5_ = -i_5_;
		arg2 /= (long) arg3;
		if ((i_5_ ^ 0xffffffff) < -10)
		    i_5_ += 39;
		is[i_2_ - i_4_ - 1] = (byte) (i_5_ + 48);
	    }
	    Class124 class124_6_ = new Class124();
	    class124_6_.aByteArray2495 = is;
	    class124_6_.anInt2507 = i_2_;
	    class124 = class124_6_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hc.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return class124;
    }
    
    public static boolean method1257(Class124 arg0, int arg1) {
    while_848_:
	do {
	while_847_:
	    do {
		int i;
		do {
		    boolean bool;
		    try {
			anInt945++;
			try {
			    i = arg0.method1711(44, (byte) 89);
			    if (i != -1)
				break;
			    bool = false;
			} catch (Exception exception) {
			    break while_847_;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_848_;
		    }
		    return bool;
		} while (false);
		byte[] is;
		Class14_Sub10 class14_sub10;
		do {
		    boolean bool;
		    try {
			Class124 class124 = arg0.method1697(0, i, (byte) -104);
			Class124 class124_7_ = arg0.method1696(1 + i, 15);
			MessageDigest messagedigest
			    = MessageDigest.getInstance("SHA");
			messagedigest.reset();
			messagedigest.update(class124.method1681(-128));
			is = messagedigest.digest();
			byte[] is_8_ = class124_7_.method1673(46);
			class14_sub10 = new Class14_Sub10(5000);
			class14_sub10.method807(is_8_.length, is_8_, 0,
						arg1 ^ ~0x40294fcc);
			class14_sub10.anInt2908 = 0;
			class14_sub10.method816((Class14_Sub2_Sub18_Sub2
						 .aBigInteger5086),
						Class110.aBigInteger1852,
						false);
			if (1 == class14_sub10.aByteArray2895[0])
			    break;
			bool = false;
		    } catch (Exception exception) {
			break while_847_;
		    }
		    return bool;
		} while (false);
		int i_9_;
		try {
		    if (arg1 != 28883)
			method1258(-38);
		    i_9_ = 0;
		} catch (Exception exception) {
		    break;
		}
		while (-21 < (i_9_ ^ 0xffffffff)) {
		    if ((is[i_9_] ^ 0xffffffff)
			!= (class14_sub10.aByteArray2895[i_9_ - -1]
			    ^ 0xffffffff))
			return false;
		    try {
			i_9_++;
		    } catch (Exception exception) {
			break while_847_;
		    }
		}
		return true;
	    } while (false);
	    try {
		Object object = new Throwable();
		return false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("hc.B("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1258(int arg0) {
	try {
	    aClass124_941 = null;
	    aClass124_942 = null;
	    aClass124_939 = null;
	    aClass76Array944 = null;
	    aClass124_943 = null;
	    aBooleanArray950 = null;
	    if (arg0 != 1)
		anInt948 = 118;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hc.D(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub19 method1259(int arg0, Class9 arg1,
						int arg2, int arg3) {
    while_849_:
	do {
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    anInt946++;
		    if (arg0 >= -80)
			method1257(null, -79);
		    if (Class109.method1564(-2, arg2, arg3, arg1))
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_849_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19 class14_sub2_sub19;
	    try {
		class14_sub2_sub19 = Class67.method1302(false);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("hc.E(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ')'));
    }
    
    static {
	aClass124_943 = aClass124_939;
	anInt949 = 0;
	aBooleanArray950 = new boolean[200];
    }
}
