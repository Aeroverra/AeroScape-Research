/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class39
{
    public static int anInt654;
    public static int anInt655;
    public static int anInt656;
    public static int anInt657;
    public static int anInt658;
    public static int anInt659;
    public static int anInt660 = 0;
    public static Class124 aClass124_661
	= Class14_Sub2_Sub2.method263(1178, "::clientdrop");
    
    public static void method1119(int arg0) {
	try {
	    if (arg0 < 66)
		method1121(null, 71);
	    aClass124_661 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ei.H(" + arg0 + ')');
	}
    }
    
    public static void method1120(int arg0, byte arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    int i = 87 % ((arg1 - 26) / 43);
	    if ((Class118.anInt1982 ^ 0xffffffff) < (arg3 - arg4 ^ 0xffffffff)
		|| Class14_Sub8_Sub14.anInt4327 < arg3 + arg4
		|| (arg2 - arg4 ^ 0xffffffff) > (Class14_Sub17.anInt3005
						 ^ 0xffffffff)
		|| Class59.anInt955 < arg4 + arg2)
		Class127.method1751(arg0, (byte) -66, arg3, arg2, arg4);
	    else
		Class14_Sub2.method247((byte) -127, arg4, arg3, arg2, arg0);
	    anInt656++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ei.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static byte[] method1121(byte[] arg0, int arg1) {
    while_742_:
	do {
	    do {
		byte[] is;
		try {
		    anInt658++;
		    if (arg0 != null)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_742_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if (arg1 == 24)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_742_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		byte[] is_0_ = new byte[arg0.length];
		Class72.method1322(arg0, 0, is_0_, 0, arg0.length);
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ei.D("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static Class14_Sub27 method1122(Class55 arg0, int arg1,
					   Class150 arg2) {
	Class14_Sub27 class14_sub27;
	try {
	    int i = 62 % ((29 - arg1) / 52);
	    long l = (((long) arg2.anInt2416 << 1362814136)
		      - -((long) arg2.anInt2426 << -594959840)
		      - (long) (-(arg2.anInt2414 + 1 << -1534144464)
				- arg2.anInt2424));
	    anInt657++;
	    Class14_Sub27 class14_sub27_1_
		= (Class14_Sub27) arg0.method1230(l, (byte) -113);
	    if (null == class14_sub27_1_) {
		class14_sub27_1_
		    = new Class14_Sub27(arg2.anInt2414, (float) arg2.anInt2424,
					true, false, arg2.anInt2426);
		arg0.method1224(8, l, class14_sub27_1_);
	    }
	    class14_sub27 = class14_sub27_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ei.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class14_sub27;
    }
    
    public abstract Class14_Sub2_Sub18 method1123
	(Class14_Sub2_Sub18 class14_sub2_sub18, int i);
    
    public static void method1124(int arg0) {
    while_744_:
	do {
	while_743_:
	    do {
		do {
		    try {
			Class36.aClass52_621.method1209((byte) -96);
			if (arg0 > 95)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_743_;
		    }
		    return;
		} while (false);
		try {
		    Class70.aClass52_1079.method1209((byte) -96);
		    anInt655++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_744_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ei.E(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1125(Class14_Sub10 arg0, byte arg1) {
	try {
	    anInt659++;
	    byte[] is = new byte[24];
	    if (arg1 != -108)
		method1119(-6);
	    if (null != Class14_Sub2_Sub17.aClass76_4022) {
		try {
		    int i = 0;
		    Class14_Sub2_Sub17.aClass76_4022.method1361(arg1 ^ ~0x6b,
								0L);
		    Class14_Sub2_Sub17.aClass76_4022.method1366((byte) -33,
								is);
		    for (/**/;
			 (i ^ 0xffffffff) > -25 && (is[i] ^ 0xffffffff) == -1;
			 i++) {
			/* empty */
		    }
		    if ((i ^ 0xffffffff) <= -25)
			throw new IOException();
		} catch (Exception exception) {
		    for (int i = 0; i < 24; i++)
			is[i] = (byte) -1;
		}
	    }
	    arg0.method807(24, is, 0, -1076444960);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ei.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method1126(byte arg0) {
	try {
	    if (-1 < (Class37.anInt644 ^ 0xffffffff)) {
		Class20.anInt427 = -1;
		Class37.anInt644 = 0;
		Class14_Sub18.anInt3050 = -1;
	    }
	    if ((Class14_Sub2_Sub9.anInt3856 ^ 0xffffffff)
		> (Class37.anInt644 ^ 0xffffffff)) {
		Class37.anInt644 = Class14_Sub2_Sub9.anInt3856;
		Class14_Sub18.anInt3050 = -1;
		Class20.anInt427 = -1;
	    }
	    if (0 > Class133_Sub6.anInt3659) {
		Class20.anInt427 = -1;
		Class14_Sub18.anInt3050 = -1;
		Class133_Sub6.anInt3659 = 0;
	    }
	    if ((Class14_Sub8_Sub15.anInt4332 ^ 0xffffffff)
		> (Class133_Sub6.anInt3659 ^ 0xffffffff)) {
		Class133_Sub6.anInt3659 = Class14_Sub8_Sub15.anInt4332;
		Class20.anInt427 = -1;
		Class14_Sub18.anInt3050 = -1;
	    }
	    if (arg0 != -22)
		aClass124_661 = null;
	    anInt654++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ei.F(" + arg0 + ')');
	}
    }
}
