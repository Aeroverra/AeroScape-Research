/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class89
{
    public int anInt1404;
    public static int[][][] anIntArrayArrayArray1405 = new int[2][][];
    public int anInt1406;
    public static Class9_Sub1 aClass9_Sub1_1407;
    public static Class124 aClass124_1408;
    public static boolean aBoolean1409 = false;
    public int anInt1410;
    public static int anInt1411;
    public static int anInt1412;
    public static int anInt1413;
    public int anInt1414;
    public static int anInt1415;
    public static boolean aBoolean1416 = false;
    
    public static boolean method1440(Class94 arg0, int arg1) {
    while_982_:
	do {
	    do {
		boolean bool;
		try {
		    anInt1411++;
		    if (arg1 == 10151)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_982_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg0.anIntArray1531 != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_982_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((i ^ 0xffffffff)
		   > (arg0.anIntArray1531.length ^ 0xffffffff)) {
		int i_0_ = Class26.method1010(i, arg0, (byte) 75);
		int i_1_ = arg0.anIntArray1527[i];
		do {
		    if (arg0.anIntArray1531[i] != 2) {
			if (3 != arg0.anIntArray1531[i]) {
			    if ((arg0.anIntArray1531[i] ^ 0xffffffff) != -5) {
				if (i_0_ != i_1_)
				    return false;
			    } else {
				boolean bool;
				try {
				    if (i_1_ != i_0_)
					break;
				    bool = false;
				} catch (RuntimeException runtimeexception) {
				    break while_982_;
				}
				return bool;
			    }
			} else {
			    boolean bool;
			    try {
				if ((i_1_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff))
				    break;
				bool = false;
			    } catch (RuntimeException runtimeexception) {
				break while_982_;
			    }
			    return bool;
			}
		    } else {
			boolean bool;
			try {
			    if (i_0_ < i_1_)
				break;
			    bool = false;
			} catch (RuntimeException runtimeexception) {
			    break while_982_;
			}
			return bool;
		    }
		} while (false);
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_982_;
		}
	    }
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("oa.B("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1441(long arg0, boolean arg1) {
    while_984_:
	do {
	while_983_:
	    do {
		do {
		    try {
			anInt1412++;
			if (arg0 != 0L)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_983_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub20.anInt4427++;
		    if (arg1 != true)
			method1441(-111L, false);
		    Class55.aClass14_Sub10_Sub1_891.method843(0, 42);
		    Class55.aClass14_Sub10_Sub1_891.method817(arg0, 110);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_984_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "oa.A(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public Class89() {
	/* empty */
    }
    
    public Class89(Class89 arg0) {
	try {
	    anInt1410 = arg0.anInt1410;
	    anInt1414 = arg0.anInt1414;
	    anInt1406 = arg0.anInt1406;
	    anInt1404 = arg0.anInt1404;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("oa.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1442(int arg0) {
	try {
	    aClass124_1408 = null;
	    if (arg0 <= 81)
		aBoolean1409 = false;
	    anIntArrayArrayArray1405 = null;
	    aClass9_Sub1_1407 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "oa.C(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_1408 = Class14_Sub2_Sub2.method263(1178, "Hierhin gehen");
	anInt1413 = 2;
    }
}
