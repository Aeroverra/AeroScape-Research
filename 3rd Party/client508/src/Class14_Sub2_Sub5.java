/* Class14_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub5 extends Class14_Sub2
{
    public int anInt3797 = 12800;
    public static int anInt3798;
    public static int anInt3799;
    public static int anInt3800;
    public Class2 aClass2_3801;
    public int anInt3802;
    public static boolean aBoolean3803;
    public Class124 aClass124_3804;
    public int anInt3805 = 0;
    public int anInt3806 = 12800;
    public Class124 aClass124_3807;
    public static int anInt3808;
    public boolean aBoolean3809;
    public int anInt3810 = 0;
    public static int anInt3811;
    public int anInt3812;
    public int anInt3813;
    public static Class124 aClass124_3814
	= Class14_Sub2_Sub2.method263(1178, "(Y<)4col>");
    public static Class20 aClass20_3815 = new Class20(128);
    public static byte[][][] aByteArrayArrayArray3816;
    public static Class9 aClass9_3817;
    public static boolean aBoolean3818 = false;
    
    public void method281(int arg0) {
	try {
	    anInt3797 = arg0;
	    anInt3810 = 0;
	    anInt3799++;
	    anInt3805 = 0;
	    anInt3806 = 12800;
	    for (Class14_Sub4 class14_sub4
		     = (Class14_Sub4) aClass2_3801.method77(arg0 ^ 0x3200);
		 class14_sub4 != null;
		 class14_sub4 = (Class14_Sub4) aClass2_3801.method84(-123)) {
		if ((class14_sub4.anInt2779 ^ 0xffffffff)
		    > (anInt3797 ^ 0xffffffff))
		    anInt3797 = class14_sub4.anInt2779;
		if ((class14_sub4.anInt2776 ^ 0xffffffff)
		    > (anInt3806 ^ 0xffffffff))
		    anInt3806 = class14_sub4.anInt2776;
		if (anInt3810 < class14_sub4.anInt2777)
		    anInt3810 = class14_sub4.anInt2777;
		if ((anInt3805 ^ 0xffffffff)
		    > (class14_sub4.anInt2778 ^ 0xffffffff))
		    anInt3805 = class14_sub4.anInt2778;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "d.E(" + arg0 + ')');
	}
    }
    
    public static boolean method282(int arg0, int arg1) {
	boolean bool;
	try {
	    anInt3811++;
	    if (arg1 != -1)
		aBoolean3803 = false;
	    bool = -1 != (arg0 >> -1347621730 & 0x1 ^ 0xffffffff);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("d.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public static void method283(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
    while_171_:
	do {
	while_170_:
	    do {
		do {
		    try {
			anInt3808++;
			if (arg7 != arg0)
			    break;
			Class133_Sub1.method1802(arg4, arg5, arg3, 128, arg6,
						 arg1, arg0);
		    } catch (RuntimeException runtimeexception) {
			break while_170_;
		    }
		    return;
		} while (false);
		try {
		    if ((arg4 + -arg0 ^ 0xffffffff) <= (Class118.anInt1982
							^ 0xffffffff)
			&& Class14_Sub8_Sub14.anInt4327 >= arg0 + arg4
			&& Class14_Sub17.anInt3005 <= arg5 + -arg7
			&& arg7 + arg5 <= Class59.anInt955)
			Class14_Sub8_Sub24.method606(arg6, arg3, arg7, arg5,
						     -15882, arg1, arg0, arg4);
		    else
			Class14_Sub8_Sub22.method593(arg4, arg0, arg1, arg7,
						     arg2 ^ ~0x77, arg3, arg5,
						     arg6);
		    if (arg2 != 0)
			aClass20_3815 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_171_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("d.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	} while (false);
    }
    
    public static void method284(int arg0) {
	try {
	    aClass9_3817 = null;
	    aClass20_3815 = null;
	    aByteArrayArrayArray3816 = null;
	    aClass124_3814 = null;
	    if (arg0 != 12800)
		method284(41);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "d.F(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub28 method285(int arg0, Class9 arg1, byte arg2) {
    while_172_:
	do {
	    do {
		Class14_Sub28 class14_sub28;
		try {
		    anInt3798++;
		    if (arg2 > 51)
			break;
		    class14_sub28 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_172_;
		}
		return class14_sub28;
	    } while (false);
	    byte[] is;
	    do {
		Class14_Sub28 class14_sub28;
		try {
		    is = arg1.method165(83, arg0);
		    if (is != null)
			break;
		    class14_sub28 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_172_;
		}
		return class14_sub28;
	    } while (false);
	    Class14_Sub28 class14_sub28;
	    try {
		class14_sub28 = new Class14_Sub28(is);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub28;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("d.B(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
    }
    
    public boolean method286(int arg0, int arg1, int arg2) {
    while_173_:
	do {
	    do {
		boolean bool;
		try {
		    anInt3800++;
		    if (arg2 == -1347621730)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_173_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((anInt3797 ^ 0xffffffff) >= (arg0 ^ 0xffffffff)
			&& arg0 <= anInt3810 && arg1 >= anInt3806
			&& anInt3805 >= arg1)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_173_;
		}
		return bool;
	    } while (false);
	    Class14_Sub4 class14_sub4;
	    try {
		class14_sub4 = (Class14_Sub4) aClass2_3801.method77(0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (null != class14_sub4) {
		if (class14_sub4.method456(arg0, arg1, true))
		    return true;
		try {
		    class14_sub4 = (Class14_Sub4) aClass2_3801.method84(-80);
		} catch (RuntimeException runtimeexception) {
		    break while_173_;
		}
	    }
	    return false;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("d.A(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public Class14_Sub2_Sub5(Class124 arg0, Class124 arg1, int arg2, int arg3,
			     int arg4, boolean arg5) {
	anInt3802 = -1;
	aBoolean3809 = true;
	try {
	    anInt3813 = arg2;
	    aClass124_3804 = arg0;
	    anInt3812 = arg3;
	    anInt3802 = arg4;
	    aBoolean3809 = arg5;
	    aClass124_3807 = arg1;
	    aClass2_3801 = new Class2();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("d.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
}
