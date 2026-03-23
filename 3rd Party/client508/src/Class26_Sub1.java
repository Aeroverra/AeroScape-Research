/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26_Sub1 extends Class26
{
    public int anInt3284;
    public static int anInt3285;
    public static int anInt3286;
    public static Class124[] aClass124Array3287;
    public static int[] anIntArray3288 = new int[500];
    public static int anInt3289;
    public byte[] aByteArray3290;
    public static Class124 aClass124_3291;
    public static int anInt3292;
    public int[] anIntArray3293;
    public static int anInt3294;
    public static int anInt3295;
    public static int anInt3296;
    public static Class124 aClass124_3297
	= (Class14_Sub2_Sub2.method263
	   (1178, "You can(Wt add yourself to your own ignore list)3"));
    public int anInt3298;
    
    public void method1011(int arg0, int arg1, byte arg2) {
	try {
	    anInt3286++;
	    anInt3298 += anIntArray3293[arg0] * arg1 >> -1162161620;
	    if (arg2 > -112)
		aByteArray3290 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gh.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1024(int arg0) {
    while_654_:
	do {
	while_653_:
	    do {
		do {
		    try {
			anIntArray3288 = null;
			aClass124Array3287 = null;
			if (arg0 == 4095)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_653_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_3297 = null;
		    aClass124_3291 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_654_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "gh.Q(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1025(int arg0) {
	try {
	    if (arg0 != 25192)
		aClass124_3291 = null;
	    Class9.aClass52_236.method1203((byte) -44);
	    anInt3295++;
	    Class14_Sub2_Sub19.aClass52_4053.method1203((byte) -116);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gh.T(" + arg0 + ')');
	}
    }
    
    public void method1013(int arg0) {
	try {
	    anInt3284 = 0;
	    anInt3294++;
	    if (arg0 != -23880)
		anInt3284 = 85;
	    anInt3298 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gh.J(" + arg0 + ')');
	}
    }
    
    public void method1026(int arg0, byte arg1) {
	try {
	    anInt3296++;
	    aByteArray3290[anInt3284++]
		= (byte) (127
			  + Class14_Sub8_Sub26.method617(127,
							 arg1 >> 2106658401));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gh.O(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method1012(int arg0) {
	try {
	    anInt3285++;
	    anInt3298 = Math.abs(anInt3298);
	    if (anInt3298 >= 4096)
		anInt3298 = 4095;
	    method1026(anInt3284++, (byte) (anInt3298 >> 1168144356));
	    anInt3298 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gh.B(" + arg0 + ')');
	}
    }
    
    public static boolean method1027(Class9 arg0, int arg1, byte arg2) {
    while_655_:
	do {
	    byte[] is;
	    do {
		boolean bool;
		try {
		    anInt3289++;
		    is = arg0.method165(73, arg1);
		    if (is != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_655_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg2 > 10)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_655_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		Class14_Sub9_Sub1.method708(is, 144);
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("gh.R("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public static int method1028(int arg0, int arg1, int arg2, int arg3) {
    while_656_:
	do {
	    do {
		int i;
		try {
		    arg0 &= 0x3;
		    anInt3292++;
		    if (arg2 != (arg0 ^ 0xffffffff))
			break;
		    i = arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_656_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if ((arg0 ^ 0xffffffff) != -2)
			break;
		    i = -arg1 + 1023;
		} catch (RuntimeException runtimeexception) {
		    break while_656_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg0 != 2)
			break;
		    i = 1023 - arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_656_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("gh.S(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public Class26_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			float arg5) {
	super(arg0, arg1, arg2, arg3, arg4);
	try {
	    anIntArray3293 = new int[anInt484];
	    for (int i = 0; i < anInt484; i++)
		anIntArray3293[i]
		    = (short) (int) (Math.pow((double) arg5, (double) i)
				     * 4096.0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gh.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ')'));
	}
    }
    
    static {
	aClass124_3291 = aClass124_3297;
    }
}
