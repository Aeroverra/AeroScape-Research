/* Class26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26_Sub2 extends Class26
{
    public static int anInt3299 = 0;
    public int anInt3300;
    public static Class124 aClass124_3301;
    public int anInt3302;
    public int anInt3303;
    public int anInt3304;
    public byte[] aByteArray3305;
    public int anInt3306;
    public int anInt3307;
    public int anInt3308;
    public static int anInt3309;
    public static int anInt3310;
    public static int anInt3311;
    public int anInt3312;
    public static int anInt3313;
    public static Class124 aClass124_3314
	= Class14_Sub2_Sub2.method263(1178, "(Udns");
    public static int anInt3315;
    public static Class124 aClass124_3316
	= Class14_Sub2_Sub2.method263(1178, ":assist:");
    
    public static void method1030(int arg0) {
	try {
	    aClass124_3314 = null;
	    aClass124_3316 = null;
	    aClass124_3301 = null;
	    if (arg0 >= -126)
		method1032(true, -82);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pj.O(" + arg0 + ')');
	}
    }
    
    public Class26_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			float arg5, float arg6, float arg7) {
	super(arg0, arg1, arg2, arg3, arg4);
	try {
	    anInt3302 = (int) (arg7 * 4096.0F);
	    anInt3304 = (int) (arg6 * 4096.0F);
	    anInt3307 = anInt3300
		= (int) (Math.pow(0.5, (double) -arg5) * 4096.0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pj.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ','
						+ arg7 + ')'));
	}
    }
    
    public void method1031(int arg0, byte arg1) {
	try {
	    anInt3311++;
	    aByteArray3305[arg0] = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pj.Q(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1032(boolean arg0, int arg1) {
	try {
	    Class14_Sub8_Sub17.method566(Class83.anInt1340,
					 Class14_Sub2_Sub12.anInt3912, -1,
					 Class14_Sub20.anInt3094, arg0);
	    if (arg1 != -1291652884)
		method1032(true, -90);
	    anInt3310++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pj.P(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method1011(int arg0, int arg1, byte arg2) {
	try {
	    anInt3315++;
	    if (arg0 == 0) {
		anInt3312 = anInt3304 - (arg1 >= 0 ? arg1 : -arg1);
		anInt3312 = anInt3312 * anInt3312 >> 2093089196;
		anInt3308 = anInt3312;
		anInt3303 = 4096;
	    } else {
		anInt3303 = anInt3312 * anInt3302 >> -1291652884;
		anInt3312
		    = anInt3304 - (-1 < (arg1 ^ 0xffffffff) ? -arg1 : arg1);
		if (0 <= anInt3303) {
		    if ((anInt3303 ^ 0xffffffff) < -4097)
			anInt3303 = 4096;
		} else
		    anInt3303 = 0;
		anInt3312 = anInt3312 * anInt3312 >> 572242892;
		anInt3312 = anInt3303 * anInt3312 >> 721084396;
		anInt3308 += anInt3312 * anInt3307 >> 289211436;
		anInt3307 = anInt3307 * anInt3300 >> 898455372;
	    }
	    if (arg2 >= -112)
		anInt3312 = 42;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pj.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1012(int arg0) {
	try {
	    anInt3308 >>= 4;
	    if ((anInt3308 ^ 0xffffffff) <= -1) {
		if ((anInt3308 ^ 0xffffffff) < -256)
		    anInt3308 = 255;
	    } else
		anInt3308 = 0;
	    anInt3307 = anInt3300;
	    method1031(anInt3306++, (byte) anInt3308);
	    anInt3309++;
	    anInt3308 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pj.B(" + arg0 + ')');
	}
    }
    
    public void method1013(int arg0) {
    while_658_:
	do {
	while_657_:
	    do {
		do {
		    try {
			if (arg0 == -23880)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_657_;
		    }
		    return;
		} while (false);
		try {
		    anInt3306 = 0;
		    anInt3313++;
		    anInt3308 = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_658_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "pj.J(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass124_3301 = Class14_Sub2_Sub2.method263(1178, "<br>(X100(U(Y");
    }
}
