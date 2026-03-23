/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class122
{
    public static Class124 aClass124_2053;
    public static int anInt2054;
    public static int anInt2055;
    public static boolean aBoolean2056 = false;
    public static int anInt2057;
    public static Class124 aClass124_2058;
    public static Class108 aClass108_2059;
    public static int anInt2060;
    
    public static Class124 method1658(byte arg0, boolean arg1, int arg2) {
	Class124 class124;
	try {
	    anInt2055++;
	    if (arg0 != -54)
		method1659(-61);
	    class124 = Class54.method1220(arg2, true, arg1, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sj.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return class124;
    }
    
    public static void method1659(int arg0) {
    while_1087_:
	do {
	while_1086_:
	    do {
		do {
		    try {
			if (arg0 <= -58)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1086_;
		    }
		    return;
		} while (false);
		try {
		    aClass108_2059 = null;
		    aClass124_2053 = null;
		    aClass124_2058 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1087_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "sj.B(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1660(int arg0, int arg1) {
    while_1089_:
	do {
	while_1088_:
	    do {
		int i;
		do {
		    try {
			Class45.method1160(0);
			Class14_Sub1.method240(256);
			anInt2057++;
			i = Class133.method1780((byte) 111, arg1).anInt587;
			if (0 != i)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1088_;
		    }
		    return;
		} while (false);
		int i_0_;
		do {
		    try {
			i_0_ = Class14_Sub8_Sub11.anIntArray4275[arg1];
			if (i == 6)
			    Class14_Sub28.anInt3222 = i_0_;
			if ((i ^ 0xffffffff) == -10)
			    Class14_Sub4.anInt2782 = i_0_;
			if (arg0 == 15237)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1088_;
		    }
		    return;
		} while (false);
		try {
		    if ((i ^ 0xffffffff) == -6)
			Class103.anInt1730 = i_0_;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1089_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "sj.A(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    static {
	aClass124_2053 = Class14_Sub2_Sub2.method263(1178, "<br>(X");
	aClass124_2058
	    = Class14_Sub2_Sub2.method263(1178, "Musik)2Engine vorbereitet)3");
	anInt2054 = 0;
	anInt2060 = -16 + (int) (33.0 * Math.random());
    }
}
