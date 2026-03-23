/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class150
{
    public static int anInt2403;
    public static int anInt2404;
    public int anInt2405;
    public static Class52 aClass52_2406 = new Class52(200);
    public boolean aBoolean2407;
    public static int anInt2408;
    public boolean aBoolean2409;
    public boolean aBoolean2410 = true;
    public int anInt2411;
    public static int anInt2412;
    public int anInt2413;
    public int anInt2414;
    public static int anInt2415;
    public int anInt2416;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array2417;
    public static Class124 aClass124_2418
	= Class14_Sub2_Sub2.method263(1178, "<col=ffffff>");
    public static int[][][] anIntArrayArrayArray2419;
    public static int anInt2420;
    public static Class71[][] aClass71ArrayArray2421 = new Class71[13][13];
    public static int[] anIntArray2422;
    public static int anInt2423;
    public int anInt2424;
    public static Class124 aClass124_2425
	= Class14_Sub2_Sub2.method263(1178, "sch-Utteln:");
    public int anInt2426;
    
    public static Class14_Sub2_Sub5 method2020(int arg0, boolean arg1,
					       int arg2) {
    while_1313_:
	do {
	    Class14_Sub2_Sub5 class14_sub2_sub5;
	    try {
		anInt2412++;
		if (arg1)
		    anIntArray2422 = null;
		class14_sub2_sub5
		    = (Class14_Sub2_Sub5) Class97.aClass2_1647.method77(0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (null != class14_sub2_sub5) {
		if (class14_sub2_sub5.aBoolean3809
		    && class14_sub2_sub5.method286(arg0, arg2, -1347621730))
		    return class14_sub2_sub5;
		try {
		    class14_sub2_sub5 = ((Class14_Sub2_Sub5)
					 Class97.aClass2_1647.method84(-122));
		} catch (RuntimeException runtimeexception) {
		    break while_1313_;
		}
	    }
	    return null;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("we.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public static void method2021(byte arg0) {
	try {
	    int i = -116 / ((-5 - arg0) / 55);
	    anIntArray2422 = null;
	    anIntArrayArrayArray2419 = null;
	    aClass14_Sub2_Sub19Array2417 = null;
	    aClass124_2418 = null;
	    aClass71ArrayArray2421 = null;
	    aClass124_2425 = null;
	    aClass52_2406 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "we.D(" + arg0 + ')');
	}
    }
    
    public static void method2022(int arg0, int arg1, int arg2,
				  Class133_Sub1 arg3, int arg4, int arg5,
				  int arg6) {
    while_1315_:
	do {
	while_1314_:
	    do {
		do {
		    try {
			if (arg2 == -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1314_;
		    }
		    return;
		} while (false);
		try {
		    Class53.method1213(arg0, arg1, arg3.anInt3495, arg5, arg6,
				       arg4, (byte) 126, arg3.anInt3436);
		    anInt2404++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1315_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("we.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	} while (false);
    }
    
    public static int method2023(int arg0, int arg1, int arg2, int arg3) {
    while_1316_:
	do {
	    do {
		int i;
		try {
		    anInt2415++;
		    if (arg3 == -10403)
			break;
		    i = -10;
		} catch (RuntimeException runtimeexception) {
		    break while_1316_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-1
			== (0x8 & (Class14_Sub8_Sub4.aByteArrayArrayArray4142
				   [arg1][arg2][arg0])
			    ^ 0xffffffff))
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_1316_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-1 <= (arg1 ^ 0xffffffff)
			|| 0 == ((Class14_Sub8_Sub4.aByteArrayArrayArray4142[1]
				  [arg2][arg0])
				 & 0x2))
			break;
		    i = arg1 - 1;
		} catch (RuntimeException runtimeexception) {
		    break while_1316_;
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
					   ("we.F(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public void method2024(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt2408++;
	    for (;;) {
		int i = arg2.method798(118);
		if (0 == i)
		    break;
		method2025(arg0, arg2, i, false);
	    }
	    if (arg1 != 0)
		method2021((byte) -98);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("we.A(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method2025(int arg0, Class14_Sub10 arg1, int arg2,
			   boolean arg3) {
    while_1318_:
	do {
	while_1317_:
	    do {
		do {
		    try {
			if (!arg3)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1317_;
		    }
		    return;
		} while (false);
		try {
		    anInt2403++;
		    if (1 != arg2) {
			if ((arg2 ^ 0xffffffff) != -3) {
			    if (3 == arg2) {
				anInt2414 = arg1.method784((byte) 112);
				if (65535 == anInt2414)
				    anInt2414 = -1;
			    } else if (-6 == (arg2 ^ 0xffffffff))
				aBoolean2410 = false;
			    else if (-8 != (arg2 ^ 0xffffffff)) {
				if (arg2 == 8)
				    Class4.anInt123 = arg0;
				else if ((arg2 ^ 0xffffffff) != -10) {
				    if (10 != arg2) {
					if ((arg2 ^ 0xffffffff) == -12)
					    anInt2416 = arg1.method798(-70);
					else if (arg2 != 12) {
					    if (-14 == (arg2 ^ 0xffffffff))
						anInt2426
						    = arg1.method829(-127);
					    else if (14 == arg2)
						anInt2413
						    = arg1.method798(126);
					} else
					    aBoolean2409 = true;
				    } else
					aBoolean2407 = false;
				} else
				    anInt2424 = arg1.method784((byte) 112);
			    } else
				anInt2405 = Class2.method82(arg1.method829(39),
							    -108);
			} else
			    anInt2414 = arg1.method798(57);
		    } else
			anInt2411
			    = Class2.method82(arg1.method829(-126), -116);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1318_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("we.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	} while (false);
    }
    
    public Class150() {
	anInt2405 = -1;
	anInt2416 = 8;
	aBoolean2409 = false;
	aBoolean2407 = true;
	anInt2413 = 16;
	anInt2411 = 0;
	anInt2414 = -1;
	anInt2424 = 128;
	anInt2426 = 1190717;
    }
}
