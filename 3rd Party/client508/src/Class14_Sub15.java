/* Class14_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub15 extends Class14
{
    public static Class2 aClass2_2988;
    public static int anInt2989;
    public static Class36 aClass36_2990;
    public int anInt2991;
    public boolean aBoolean2992 = false;
    public static Class124 aClass124_2993
	= Class14_Sub2_Sub2.method263(1178, "<img=0>");
    public static int anInt2994;
    public static Class124 aClass124_2995
	= Class14_Sub2_Sub2.method263(1178, "cookiehost");
    public static int anInt2996 = 0;
    public static int anInt2997;
    public static int anInt2998;
    public int anInt2999;
    public static int anInt3000;
    public static int anInt3001;
    
    public static void method871(Class9 arg0, Class9 arg1, int arg2) {
    while_594_:
	do {
	while_593_:
	    do {
		do {
		    try {
			anInt3000++;
			Class56_Sub1.aClass14_Sub2_Sub16_3320
			    = Class14_Sub19.method888(-107,
						      (Class14_Sub2_Sub21
						       .anInt4088),
						      arg1, 0, arg0);
			Class131.aClass14_Sub2_Sub16_Sub1_2160
			    = Class146.method1991(0, arg0, arg1, -13824,
						  (Class14_Sub2_Sub21
						   .anInt4088));
			Class84.aClass14_Sub2_Sub16_1344
			    = Class14_Sub19.method888(-110,
						      (Class14_Sub8_Sub17
						       .anInt4367),
						      arg1, 0, arg0);
			if (arg2 <= -83)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_593_;
		    }
		    return;
		} while (false);
		try {
		    Class133_Sub3.aClass14_Sub2_Sub16_3567
			= Class14_Sub19.method888(-108,
						  Class14_Sub8_Sub1.anInt4102,
						  arg1, 0, arg0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_594_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("lf.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static void method872(byte arg0) {
	try {
	    aClass124_2995 = null;
	    aClass36_2990 = null;
	    int i = -85 % ((arg0 - -6) / 61);
	    aClass2_2988 = null;
	    aClass124_2993 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lf.B(" + arg0 + ')');
	}
    }
    
    public static int method873(int arg0, int arg1) {
	int i;
	try {
	    if (arg0 != 1023)
		method872((byte) -113);
	    anInt2998++;
	    i = arg1 & 0x3ff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lf.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static boolean method874(byte arg0, Class94 arg1) {
    while_595_:
	do {
	    do {
		boolean bool;
		try {
		    int i = 4 % ((64 - arg0) / 48);
		    anInt2997++;
		    if (205 != arg1.anInt1498)
			break;
		    Class62.anInt990 = 250;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_595_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("lf.C(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    static {
	aClass2_2988 = new Class2();
    }
}
