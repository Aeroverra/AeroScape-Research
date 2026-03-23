/* Class148 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class148
{
    public static Class52 aClass52_2370;
    public int anInt2371;
    public static boolean aBoolean2372 = true;
    public int anInt2373;
    public int anInt2374;
    public int anInt2375;
    public int anInt2376;
    public static int anInt2377;
    public int anInt2378;
    public static int anInt2379;
    public static Class124 aClass124_2380
	= Class14_Sub2_Sub2.method263(1178, "::noclip");
    public static int anInt2381;
    public static Class124 aClass124_2382;
    
    public static void method1996(byte arg0) {
    while_1268_:
	do {
	while_1267_:
	    do {
		do {
		    try {
			if (arg0 >= 48)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1267_;
		    }
		    return;
		} while (false);
		try {
		    anInt2381++;
		    if (10 == Class14_Sub8_Sub16.anInt4356)
			Class126.method1743(27252, 28);
		    if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == -31)
			Class126.method1743(27252, 25);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1268_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "wc.M(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1997(int arg0) {
	try {
	    if (arg0 != 64)
		aClass52_2370 = null;
	    aClass124_2380 = null;
	    aClass52_2370 = null;
	    aClass124_2382 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wc.N(" + arg0 + ')');
	}
    }
    
    public static Class124 method1998(int arg0, byte arg1,
				      Class14_Sub10 arg2) {
    while_1270_:
	do {
	while_1269_:
	    do {
		do {
		    Class124 class124;
		    try {
			anInt2379++;
			try {
			    if (arg1 < -122)
				break;
			    class124 = null;
			} catch (Exception exception) {
			    break while_1269_;
			}
		    } catch (RuntimeException runtimeexception) {
			break while_1270_;
		    }
		    return class124;
		} while (false);
		Class124 class124;
		try {
		    Class124 class124_0_ = new Class124();
		    class124_0_.anInt2507 = arg2.method818((byte) 76);
		    if (arg0 < class124_0_.anInt2507)
			class124_0_.anInt2507 = arg0;
		    class124_0_.aByteArray2495
			= new byte[class124_0_.anInt2507];
		    arg2.anInt2908
			+= Class98.aClass5_1659.method110(arg2.aByteArray2895,
							  (class124_0_
							   .aByteArray2495),
							  0, arg2.anInt2908,
							  (class124_0_
							   .anInt2507),
							  (byte) -30);
		    class124 = class124_0_;
		} catch (Exception exception) {
		    break;
		}
		return class124;
	    } while (false);
	    try {
		Object object = new Throwable();
		return Class18.aClass124_418;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("wc.O(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public abstract void method1999(int i, int i_1_, int i_2_);
    
    public static void method2000(Class9 arg0, Class9 arg1, byte arg2,
				  Class9 arg3) {
	try {
	    anInt2377++;
	    if (arg2 >= -1)
		aClass124_2382 = null;
	    Class33.aClass9_579 = arg1;
	    Class125_Sub4.aClass9_3427 = arg0;
	    Class133_Sub1_Sub1.aClass9_4935 = arg3;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("wc.L(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public abstract void method2001(int i, int i_3_);
    
    static {
	aClass52_2370 = new Class52(64);
	aClass124_2382 = Class14_Sub2_Sub2.method263(1178, "null");
    }
}
