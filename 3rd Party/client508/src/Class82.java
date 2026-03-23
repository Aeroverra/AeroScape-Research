/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class82
{
    public static Class124 aClass124_1329;
    public static int anInt1330;
    public static int anInt1331;
    public static int anInt1332;
    public static Class124 aClass124_1333
	= Class14_Sub2_Sub2.method263(1178, "um");
    public static int anInt1334;
    
    public static void method1404(byte arg0) {
	try {
	    if (arg0 >= -50)
		method1404((byte) -1);
	    aClass124_1329 = null;
	    aClass124_1333 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "m.B(" + arg0 + ')');
	}
    }
    
    public static Class124 method1405(byte arg0, Class94 arg1, int arg2) {
    while_969_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt1332++;
		    if (Class14_Sub3.method448((byte) 124, arg2,
					       client.method46(arg1))
			|| arg1.anObjectArray1535 != null)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_969_;
		}
		return class124;
	    } while (false);
	while_968_:
	    do {
		do {
		    Class124 class124;
		    try {
			int i = 49 % ((arg0 - 66) / 56);
			if (null != arg1.aClass124Array1573
			    && ((arg1.aClass124Array1573.length ^ 0xffffffff)
				< (arg2 ^ 0xffffffff))
			    && arg1.aClass124Array1573[arg2] != null
			    && (arg1.aClass124Array1573[arg2].method1684
				    ((byte) 9).method1693(0)
				^ 0xffffffff) != -1)
			    break while_968_;
			if (!Class125_Sub3.aBoolean3392)
			    break;
			class124 = (Class14_Sub8_Sub7.method515
				    ((new Class124[]
				      { Class7_Sub3_Sub1.aClass124_3706,
					Class83.method1407(61, arg2) }),
				     (byte) -102));
		    } catch (RuntimeException runtimeexception) {
			break while_969_;
		    }
		    return class124;
		} while (false);
		Class124 class124;
		try {
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_969_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = arg1.aClass124Array1573[arg2];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("m.A(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
    }
    
    public static synchronized byte[] method1406(int arg0, int arg1) {
    while_970_:
	do {
	    do {
		byte[] is;
		try {
		    anInt1331++;
		    if (arg1 <= 87)
			aClass124_1329 = null;
		    if (-101 != (arg0 ^ 0xffffffff)
			|| 0 >= Class14_Sub8_Sub4.anInt4152)
			break;
		    byte[] is_0_ = (Class106.aByteArrayArray1779
				    [--Class14_Sub8_Sub4.anInt4152]);
		    Class106.aByteArrayArray1779[Class14_Sub8_Sub4.anInt4152]
			= null;
		    is = is_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_970_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if (-5001 != (arg0 ^ 0xffffffff)
			|| 0 >= Class14_Sub8_Sub23.anInt4475)
			break;
		    byte[] is_1_ = (Class14_Sub2_Sub13.aByteArrayArray3922
				    [--Class14_Sub8_Sub23.anInt4475]);
		    Class14_Sub2_Sub13.aByteArrayArray3922[(Class14_Sub8_Sub23
							    .anInt4475)]
			= null;
		    is = is_1_;
		} catch (RuntimeException runtimeexception) {
		    break while_970_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if ((arg0 ^ 0xffffffff) != -30001
			|| -1 <= (Class46.anInt782 ^ 0xffffffff))
			break;
		    byte[] is_2_ = (Class14_Sub2_Sub20.aByteArrayArray4057
				    [--Class46.anInt782]);
		    Class14_Sub2_Sub20.aByteArrayArray4057[Class46.anInt782]
			= null;
		    is = is_2_;
		} catch (RuntimeException runtimeexception) {
		    break while_970_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		is = new byte[arg0];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "m.C(" + arg0 + ',' + arg1 + ')');
    }
    
    static {
	aClass124_1329 = Class14_Sub2_Sub2.method263(1178, "Freie Welt");
    }
}
