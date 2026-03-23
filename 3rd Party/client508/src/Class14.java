/* Class14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.UnsupportedEncodingException;

public class Class14
{
    public static int[] anIntArray351;
    public static int anInt352;
    public static int anInt353;
    public Class14 aClass14_354;
    public long aLong355;
    public static int anInt356;
    public static short[] aShortArray357;
    public static Class43 aClass43_358;
    public static int anInt359;
    public static Class124 aClass124_360;
    public static int anInt361;
    public static byte[][] aByteArrayArray362;
    public static int[] anIntArray363 = new int[1000];
    public static Class124 aClass124_364;
    public static int anInt365;
    public static int anInt366;
    public static Class9 aClass9_367;
    public Class14 aClass14_368;
    public static Class9_Sub1 aClass9_Sub1_369;
    public static int anInt370;
    public static int anInt371;
    public static Class9 aClass9_372;
    
    public boolean method229(byte arg0) {
    while_129_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 == -109)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_129_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    anInt359++;
		    if (null != aClass14_354)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_129_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "bl.IB(" + arg0 + ')');
    }
    
    public static Class124 method230(String arg0, int arg1) {
	Class124 class124;
	try {
	    anInt352++;
	    byte[] is;
	    try {
		is = arg0.getBytes("ISO-8859-1");
	    } catch (UnsupportedEncodingException unsupportedencodingexception) {
		is = arg0.getBytes();
	    }
	    Class124 class124_0_ = new Class124();
	    class124_0_.aByteArray2495 = is;
	    class124_0_.anInt2507 = arg1;
	    for (int i = 0; (i ^ 0xffffffff) > (is.length ^ 0xffffffff); i++) {
		if (is[i] != 0)
		    is[class124_0_.anInt2507++] = is[i];
	    }
	    class124 = class124_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bl.JB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class124;
    }
    
    public static Class124 method231(byte arg0, int arg1, byte[] arg2,
				     int arg3) {
	Class124 class124;
	try {
	    anInt361++;
	    Class124 class124_1_ = new Class124();
	    class124_1_.anInt2507 = 0;
	    class124_1_.aByteArray2495 = new byte[arg1];
	    if (arg0 <= 71)
		anIntArray351 = null;
	    for (int i = arg3; arg1 + arg3 > i; i++) {
		if (0 != arg2[i])
		    class124_1_.aByteArray2495[class124_1_.anInt2507++]
			= arg2[i];
	    }
	    class124 = class124_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bl.HB(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
	return class124;
    }
    
    public static void method232(int arg0) {
	try {
	    aClass9_367 = null;
	    aByteArrayArray362 = null;
	    aClass124_364 = null;
	    aShortArray357 = null;
	    aClass124_360 = null;
	    aClass9_Sub1_369 = null;
	    aClass43_358 = null;
	    aClass9_372 = null;
	    if (arg0 != -21518)
		method230(null, -53);
	    anIntArray351 = null;
	    anIntArray363 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bl.KB(" + arg0 + ')');
	}
    }
    
    public void method233(int arg0) {
    while_131_:
	do {
	while_130_:
	    do {
		do {
		    try {
			anInt370++;
			if (aClass14_354 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_130_;
		    }
		    return;
		} while (false);
		try {
		    aClass14_354.aClass14_368 = aClass14_368;
		    aClass14_368.aClass14_354 = aClass14_354;
		    aClass14_368 = null;
		    aClass14_354 = null;
		    if (arg0 != 0)
			anIntArray363 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_131_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "bl.LB(" + arg0 + ')');
	} while (false);
    }
    
    static {
	anIntArray351 = new int[2048];
	aShortArray357 = new short[] { 13, 10, 37, 47, 33, 20, 45, 18 };
	aClass124_364 = Class14_Sub2_Sub2.method263(1178, "");
	anInt365 = 0;
	anInt366 = 5063219;
	anInt371 = -1;
	aClass124_360 = Class14_Sub2_Sub2.method263(1178, " )2> <col=00ffff>");
    }
}
