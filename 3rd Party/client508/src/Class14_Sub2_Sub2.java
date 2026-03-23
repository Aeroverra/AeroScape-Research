/* Class14_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub2 extends Class14_Sub2
{
    public static int anInt3754;
    public static int anInt3755;
    public static int anInt3756;
    public static int anInt3757;
    public static int anInt3758 = 0;
    public static int anInt3759;
    public Class124 aClass124_3760;
    public static int anInt3761;
    public static Class148_Sub1[] aClass148_Sub1Array3762;
    public static boolean aBoolean3763;
    public int anInt3764;
    public static int anInt3765;
    public int anInt3766;
    
    public void method260(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt3755++;
	    if ((arg0 ^ 0xffffffff) != -2) {
		if ((arg0 ^ 0xffffffff) != -3) {
		    if (-6 == (arg0 ^ 0xffffffff))
			aClass124_3760 = arg2.method797(9467);
		} else
		    anInt3766 = arg2.method812((byte) -91);
	    } else
		anInt3764 = arg2.method798(-37);
	    if (arg1 >= -11)
		anInt3758 = -76;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("b.G(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public boolean method261(byte arg0) {
    while_155_:
	do {
	    do {
		boolean bool;
		try {
		    anInt3757++;
		    if (arg0 >= 9)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_155_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = -116 == (anInt3764 ^ 0xffffffff);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "b.D(" + arg0 + ')');
    }
    
    public static void method262(byte arg0) {
	try {
	    aClass148_Sub1Array3762 = null;
	    if (arg0 != 111)
		aBoolean3763 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "b.E(" + arg0 + ')');
	}
    }
    
    public static Class124 method263(int arg0, String arg1) {
	Class124 class124;
	try {
	    anInt3756++;
	    byte[] is = arg1.getBytes();
	    int i = is.length;
	    Class124 class124_0_ = new Class124();
	    if (arg0 != 1178)
		anInt3758 = -71;
	    int i_1_ = 0;
	    class124_0_.aByteArray2495 = new byte[i];
	    while (i_1_ < i) {
		int i_2_ = is[i_1_++] & 0xff;
		if (-46 <= (i_2_ ^ 0xffffffff) && -41 >= (i_2_ ^ 0xffffffff)) {
		    if ((i_1_ ^ 0xffffffff) <= (i ^ 0xffffffff))
			break;
		    int i_3_ = 0xff & is[i_1_++];
		    class124_0_.aByteArray2495[class124_0_.anInt2507++]
			= (byte) ((-40 + i_2_) * 43 - 48 + i_3_);
		} else if (0 != i_2_)
		    class124_0_.aByteArray2495[class124_0_.anInt2507++]
			= (byte) i_2_;
	    }
	    class124_0_.method1683(115);
	    class124 = class124_0_.method1712((byte) 99);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("b.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class124;
    }
    
    public static void method264(Class14_Sub10 arg0, boolean arg1) {
	try {
	    if (Class14_Sub2_Sub17.aClass76_4022 != null) {
		try {
		    Class14_Sub2_Sub17.aClass76_4022.method1361(0, 0L);
		    Class14_Sub2_Sub17.aClass76_4022.method1362
			(arg0.anInt2908, 24, (byte) 105, arg0.aByteArray2895);
		} catch (Exception exception) {
		    /* empty */
		}
	    }
	    anInt3761++;
	    arg0.anInt2908 += 24;
	    if (arg1)
		aClass148_Sub1Array3762 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("b.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method265(int arg0, Class14_Sub10 arg1) {
	try {
	    for (;;) {
		int i = arg1.method798(arg0 ^ ~0x68);
		if (i == 0)
		    break;
		method260(i, -16, arg1);
	    }
	    if (arg0 != 0)
		method260(-19, 55, null);
	    anInt3765++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("b.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static int method266(int arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6) {
    while_156_:
	do {
	    do {
		int i;
		try {
		    arg6 &= 0x3;
		    anInt3759++;
		    if ((0x1 & arg3) == 1) {
			int i_4_ = arg2;
			arg2 = arg1;
			arg1 = i_4_;
		    }
		    if ((arg6 ^ 0xffffffff) != -1)
			break;
		    i = arg4;
		} catch (RuntimeException runtimeexception) {
		    break while_156_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-2 != (arg6 ^ 0xffffffff))
			break;
		    i = 1 + -arg2 + (-arg0 + 7);
		} catch (RuntimeException runtimeexception) {
		    break while_156_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg5 == 7)
			break;
		    i = -119;
		} catch (RuntimeException runtimeexception) {
		    break while_156_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if ((arg6 ^ 0xffffffff) != -3)
			break;
		    i = 1 + (-arg1 + (7 - arg4));
		} catch (RuntimeException runtimeexception) {
		    break while_156_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("b.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ')'));
    }
}
