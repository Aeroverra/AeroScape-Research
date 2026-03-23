/* Class14_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import nativeadvert.browsercontrol;

public class Class14_Sub21 extends Class14
{
    public static Class124 aClass124_3099;
    public static Class32[] aClass32Array3100;
    public Class124 aClass124_3101;
    public static int anInt3102 = 0;
    public int anInt3103;
    public static Class124 aClass124_3104;
    public Class94 aClass94_3105;
    public int anInt3106;
    public static int anInt3107;
    public int anInt3108;
    public boolean aBoolean3109;
    public static int anInt3110;
    public static Class9_Sub1 aClass9_Sub1_3111;
    public static int anInt3112;
    public int anInt3113;
    public int anInt3114;
    public Object[] anObjectArray3115;
    public Class94 aClass94_3116;
    
    public static void method893(byte arg0) {
	try {
	    int i = -5 % ((arg0 - 57) / 37);
	    aClass9_Sub1_3111 = null;
	    aClass124_3104 = null;
	    aClass32Array3100 = null;
	    aClass124_3099 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qc.D(" + arg0 + ')');
	}
    }
    
    public static void method894(Class94 arg0, int arg1, boolean arg2,
				 int arg3, int arg4) {
	try {
	    int i = arg0.anInt1518;
	    if (0 == arg0.aByte1509)
		arg0.anInt1518 = arg0.anInt1485;
	    else if (1 == arg0.aByte1509)
		arg0.anInt1518 = -arg0.anInt1485 + arg3;
	    else if (arg0.aByte1509 != 2) {
		if ((arg0.aByte1509 ^ 0xffffffff) == -4) {
		    if (-3 != (arg0.anInt1489 ^ 0xffffffff)) {
			if (-8 == (arg0.anInt1489 ^ 0xffffffff))
			    arg0.anInt1518
				= (arg0.anInt1485 * 115
				   + arg0.anInt1454 * (-1 + arg0.anInt1485));
		    } else
			arg0.anInt1518 = ((arg0.anInt1485 - 1) * arg0.anInt1454
					  + arg0.anInt1485 * 32);
		}
	    } else
		arg0.anInt1518 = arg0.anInt1485 * arg3 >> 1882110318;
	    if (arg1 != 1)
		aClass9_Sub1_3111 = null;
	    int i_0_ = arg0.anInt1545;
	    anInt3112++;
	    if ((arg0.aByte1536 ^ 0xffffffff) == -1)
		arg0.anInt1545 = arg0.anInt1488;
	    else if (1 != arg0.aByte1536) {
		if (arg0.aByte1536 != 2) {
		    if (-4 == (arg0.aByte1536 ^ 0xffffffff)) {
			if ((arg0.anInt1489 ^ 0xffffffff) == -3)
			    arg0.anInt1545
				= ((-1 + arg0.anInt1488) * arg0.anInt1613
				   + 32 * arg0.anInt1488);
			else if (7 == arg0.anInt1489)
			    arg0.anInt1545
				= (arg0.anInt1613 * (arg0.anInt1488 - 1)
				   + arg0.anInt1488 * 12);
		    }
		} else
		    arg0.anInt1545 = arg4 * arg0.anInt1488 >> 287847726;
	    } else
		arg0.anInt1545 = -arg0.anInt1488 + arg4;
	    if (-5 == (arg0.aByte1509 ^ 0xffffffff))
		arg0.anInt1518
		    = arg0.anInt1467 * arg0.anInt1545 / arg0.anInt1464;
	    if (4 == arg0.aByte1536)
		arg0.anInt1545
		    = arg0.anInt1464 * arg0.anInt1518 / arg0.anInt1467;
	    if (Class125_Sub3.aBoolean3392
		&& (0 != client.method46(arg0) || arg0.anInt1489 == 0)) {
		if (arg0.anInt1545 < 5 && (arg0.anInt1518 ^ 0xffffffff) > -6) {
		    arg0.anInt1545 = 5;
		    arg0.anInt1518 = 5;
		} else {
		    if ((arg0.anInt1518 ^ 0xffffffff) >= -1)
			arg0.anInt1518 = 5;
		    if (arg0.anInt1545 <= 0)
			arg0.anInt1545 = 5;
		}
	    }
	    if (1337 == arg0.anInt1498)
		Class127.aClass94_2114 = arg0;
	    if (arg2 && null != arg0.anObjectArray1604
		&& ((arg0.anInt1518 ^ 0xffffffff) != (i ^ 0xffffffff)
		    || i_0_ != arg0.anInt1545)) {
		Class14_Sub21 class14_sub21 = new Class14_Sub21();
		class14_sub21.aClass94_3116 = arg0;
		class14_sub21.anObjectArray3115 = arg0.anObjectArray1604;
		Class1.aClass2_70.method80(class14_sub21, (byte) -126);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qc.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method895(int arg0, Class14_Sub27[] arg1) {
	RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[arg0] = arg1;
    }
    
    public static int method896(int arg0, int arg1) {
    while_613_:
	do {
	    do {
		int i;
		try {
		    anInt3110++;
		    if (arg0 <= -96)
			break;
		    i = 123;
		} catch (RuntimeException runtimeexception) {
		    break while_613_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg1 >>> -1822596025;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "qc.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method897(int arg0) {
	try {
	    Class121.method1630();
	    if (arg0 <= 108)
		method893((byte) 29);
	    anInt3107++;
	    if (browsercontrol.iscreated())
		browsercontrol.hide();
	    Class63.method1280(Class49.aCanvas819, (byte) 123);
	    Class76.method1356(false, Class49.aCanvas819);
	    if (null != Class44.aClass129_726)
		Class44.aClass129_726.method1765(true, Class49.aCanvas819);
	    Class73.method1329(0);
	    Class14_Sub8_Sub17.method572(Class49.aCanvas819, false);
	    Class56_Sub1.method1242(Class49.aCanvas819, 0);
	    if (null != Class44.aClass129_726)
		Class44.aClass129_726.method1760(-14827, Class49.aCanvas819);
	    Class63.method1276(-105);
	    Class121.method1621(Class49.aCanvas819, Class135.anInt2189 * 2);
	    Class14_Sub2_Sub12.method319(-31);
	    Class132.method1779(0);
	    Class132.aLong2169 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qc.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_3099 = Class14_Sub2_Sub2.method263(1178, "<img=0>");
	aClass124_3104 = Class14_Sub2_Sub2.method263(1178, "(U");
	aClass32Array3100 = new Class32[4];
    }
}
