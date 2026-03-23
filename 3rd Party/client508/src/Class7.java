/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.zip.CRC32;

public class Class7
{
    public static int[][][] anIntArrayArrayArray169 = new int[4][13][13];
    public static int anInt170;
    public static CRC32 aCRC32_171 = new CRC32();
    public static int anInt172;
    public static int anInt173;
    public static Class124 aClass124_174;
    public static int anInt175;
    public static Class124 aClass124_176
	= Class14_Sub2_Sub2.method263(1178, "Sat");
    public static int anInt177;
    public static Class124[] aClass124Array178;
    public static int anInt179;
    public static Class124 aClass124_180;
    public static Class124 aClass124_181;
    public static int anInt182;
    public static short[] aShortArray183;
    public static Class124 aClass124_184;
    public static Class124 aClass124_185
	= Class14_Sub2_Sub2.method263(1178, "Wed");
    public static Class124 aClass124_186;
    public static Class124 aClass124_187;
    public static Class124 aClass124_188;
    public static Class124 aClass124_189;
    
    public static int method115(byte arg0, int arg1) {
	int i;
	try {
	    if (arg0 < 115)
		method117(null, -42, (byte) 126);
	    anInt173++;
	    i = arg1 >>> -1321547960;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("am.L(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static int method116(int arg0, int arg1) {
	int i;
	try {
	    anInt170++;
	    if (arg1 != 14719)
		method117(null, -104, (byte) 88);
	    i = arg0 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("am.J(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static Class14_Sub2_Sub19 method117(Class9 arg0, int arg1,
					       byte arg2) {
    while_42_:
	do {
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    anInt172++;
		    int i = -86 / ((17 - arg2) / 57);
		    if (Class26_Sub1.method1027(arg0, arg1, (byte) 126))
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_42_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19 class14_sub2_sub19;
	    try {
		class14_sub2_sub19 = Class67.method1302(false);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("am.H("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public static int method118(byte arg0, int arg1) {
    while_43_:
	do {
	    do {
		int i;
		try {
		    if (arg0 == 68)
			break;
		    i = -59;
		} catch (RuntimeException runtimeexception) {
		    break while_43_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt175++;
		i = arg1 & 0xff;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "am.I(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method119(int arg0) {
    while_45_:
	do {
	while_44_:
	    do {
		do {
		    try {
			aClass124Array178 = null;
			aClass124_189 = null;
			aClass124_187 = null;
			aClass124_185 = null;
			aClass124_176 = null;
			aClass124_188 = null;
			if (arg0 < -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_44_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_180 = null;
		    aClass124_184 = null;
		    aClass124_174 = null;
		    anIntArrayArrayArray169 = null;
		    aShortArray183 = null;
		    aClass124_181 = null;
		    aClass124_186 = null;
		    aCRC32_171 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_45_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "am.K(" + arg0 + ')');
	} while (false);
    }
    
    public static void method120(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	Class85 class85 = new Class85();
	class85.anInt1374 = arg1 / 128;
	class85.anInt1364 = arg2 / 128;
	class85.anInt1363 = arg3 / 128;
	class85.anInt1377 = arg4 / 128;
	class85.anInt1373 = arg0;
	class85.anInt1353 = arg1;
	class85.anInt1361 = arg2;
	class85.anInt1359 = arg3;
	class85.anInt1366 = arg4;
	class85.anInt1368 = arg5;
	class85.anInt1358 = arg6;
	Class51.aClass85Array838[Class14_Sub8_Sub26.anInt4533++] = class85;
    }
    
    static {
	anInt179 = 0;
	aClass124_184 = Class14_Sub2_Sub2.method263(1178, "Mon");
	aClass124_181 = Class14_Sub2_Sub2.method263(1178, "Sun");
	anInt182 = 0;
	aShortArray183 = new short[] { -10304, 9104, -1, -1, -1 };
	aClass124_187 = Class14_Sub2_Sub2.method263(1178, "Thu");
	aClass124_186 = Class14_Sub2_Sub2.method263(1178, "Cancel");
	aClass124_189 = Class14_Sub2_Sub2.method263(1178, "Tue");
	aClass124_188 = Class14_Sub2_Sub2.method263(1178, "Fri");
	aClass124Array178
	    = new Class124[] { aClass124_181, aClass124_184, aClass124_189,
			       aClass124_185, aClass124_187, aClass124_188,
			       aClass124_176 };
	aClass124_180 = aClass124_186;
    }
}
