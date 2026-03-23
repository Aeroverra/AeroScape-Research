/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public abstract class Class129
{
    public static Class124 aClass124_2129;
    public static int anInt2130;
    public static int anInt2131 = 0;
    public static int anInt2132;
    public static int anInt2133;
    public static Class124 aClass124_2134;
    public static int anInt2135;
    public static int anInt2136 = 0;
    
    public abstract void method1760(int i, Component component);
    
    public static void method1761(byte arg0) {
    while_1146_:
	do {
	while_1145_:
	    do {
		do {
		    try {
			Class14_Sub2_Sub12.anIntArray3918 = null;
			if (arg0 > 2)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1145_;
		    }
		    return;
		} while (false);
		try {
		    Class12.aByteArrayArray310 = null;
		    Class76.anIntArray1204 = null;
		    Class17.anIntArray402 = null;
		    Class40.anIntArray675 = null;
		    anInt2135++;
		    Class73.anIntArray1114 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1146_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "te.A(" + arg0 + ')');
	} while (false);
    }
    
    public static Class125_Sub2 method1762(byte arg0, Class14_Sub10 arg1) {
    while_1147_:
	do {
	    do {
		Class125_Sub2 class125_sub2;
		try {
		    if (arg0 > 93)
			break;
		    class125_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1147_;
		}
		return class125_sub2;
	    } while (false);
	    Class125_Sub2 class125_sub2;
	    try {
		anInt2130++;
		class125_sub2
		    = new Class125_Sub2(arg1.method805(0), arg1.method805(0),
					arg1.method805(0), arg1.method805(0),
					arg1.method829(47),
					arg1.method798(-103));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class125_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("te.G(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public abstract int method1763(int i);
    
    public static void method1764(int arg0) {
	try {
	    aClass124_2129 = null;
	    int i = -53 % ((arg0 - -59) / 47);
	    aClass124_2134 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "te.B(" + arg0 + ')');
	}
    }
    
    public abstract void method1765(boolean bool, Component component);
    
    public static Class124 method1766(int[] arg0, int arg1, byte arg2,
				      long arg3) {
    while_1148_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt2132++;
		    if (null == Canvas_Sub1.anInterface5_48)
			break;
		    Class124 class124_0_
			= Canvas_Sub1.anInterface5_48.method24(arg3, arg1,
							       arg0, true);
		    if (class124_0_ == null)
			break;
		    class124 = class124_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1148_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (arg1 != 5)
			break;
		    class124
			= Class46.method1174(arg3, (byte) 88).method1685(0);
		} catch (RuntimeException runtimeexception) {
		    break while_1148_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (arg2 >= 123)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1148_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class14_Sub2_Sub18_Sub2.method387(arg3, true);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("te.F("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + arg3 + ')'));
    }
    
    static {
	aClass124_2134 = Class14_Sub2_Sub2.method263(1178, "Type");
	aClass124_2129 = aClass124_2134;
    }
}
