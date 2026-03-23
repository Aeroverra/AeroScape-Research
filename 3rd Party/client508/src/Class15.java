/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class15
{
    public static Class124 aClass124_373;
    public static boolean aBoolean374 = true;
    public static int anInt375;
    public static int anInt376;
    public static int anInt377;
    public static int anInt378;
    public static int anInt379;
    public static int anInt380 = 0;
    public static Class124 aClass124_381
	= Class14_Sub2_Sub2.method263(1178, "cyan:");
    public static Class9 aClass9_382;
    public static Class124 aClass124_383;
    public static Class9 aClass9_384;
    public static byte[][][] aByteArrayArrayArray385;
    
    public static void method943(Class124 arg0, boolean arg1, Class124 arg2,
				 int arg3) {
	try {
	    anInt379++;
	    if (arg1)
		method943(null, true, null, 25);
	    Class14_Sub8_Sub3.method493((byte) -57, null, arg2, arg3, arg0,
					-1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bm.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
    }
    
    public static boolean method944(boolean arg0, int arg1) {
    while_627_:
	do {
	    do {
		boolean bool;
		try {
		    anInt377++;
		    if (!arg0)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_627_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool
		    = (arg1 ^ 0xffffffff) <= -49 && (arg1 ^ 0xffffffff) >= -58;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bm.E(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method945(int arg0) {
	try {
	    aClass124_383 = null;
	    aClass124_381 = null;
	    aClass9_384 = null;
	    aClass9_382 = null;
	    aClass124_373 = null;
	    aByteArrayArrayArray385 = null;
	    if (arg0 != 0)
		method946((byte) -84);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bm.A(" + arg0 + ')');
	}
    }
    
    public static void method946(byte arg0) {
	try {
	    anInt378++;
	    Class133_Sub1_Sub1.aClass52_4926.method1203((byte) -111);
	    Class125.aClass52_2075.method1203((byte) -123);
	    Class70.aClass52_1077.method1203((byte) -103);
	    if (arg0 != -2)
		method945(-17);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bm.C(" + arg0 + ')');
	}
    }
    
    public static void method947(int arg0, int arg1) {
    while_629_:
	do {
	while_628_:
	    do {
		do {
		    try {
			anInt375++;
			if (arg1 == -14158)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_628_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub2_Sub13 class14_sub2_sub13
			= Class14_Sub8_Sub28.method626(arg1 + 14051, arg0, 2);
		    class14_sub2_sub13.method327((byte) 51);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_629_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "bm.B(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    static {
	aClass124_373 = aClass124_381;
	aClass124_383 = aClass124_381;
    }
}
