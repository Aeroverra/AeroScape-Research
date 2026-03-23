/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class120
{
    public static int anInt1997;
    public static int anInt1998;
    public static int anInt1999;
    public static int anInt2000;
    public static Class124 aClass124_2001
	= Class14_Sub2_Sub2.method263(1178, "welle:");
    public static int[] anIntArray2002;
    public Class9 aClass9_2003;
    public Class55 aClass55_2004 = new Class55(256);
    public static int anInt2005;
    public static int anInt2006;
    public static int anInt2007 = -1;
    public static int[] anIntArray2008;
    public static int[] anIntArray2009;
    public Class9 aClass9_2010;
    public static int anInt2011;
    public static Class124 aClass124_2012;
    public static int anInt2013;
    public static int anInt2014;
    public Class55 aClass55_2015 = new Class55(256);
    
    public static void method1614(byte arg0) {
    while_1080_:
	do {
	while_1079_:
	    do {
		do {
		    try {
			anIntArray2002 = null;
			aClass124_2001 = null;
			if (arg0 <= -2)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1079_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray2009 = null;
		    anIntArray2008 = null;
		    aClass124_2012 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1080_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "sg.F(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1615(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    if (arg4 >= 0)
		anIntArray2009 = null;
	    int i = 0;
	    for (Class66[] class66s = Class14_Sub2_Sub1.aClass66Array3721;
		 (i ^ 0xffffffff) > (class66s.length ^ 0xffffffff); i++) {
		Class66 class66 = class66s[i];
		if (null != class66 && class66.anInt1046 == 2) {
		    Class53.method1213(arg3, arg1,
				       ((class66.anInt1047
					 + -Class133_Sub6.anInt3676)
					<< 1230012871) - -class66.anInt1038,
				       arg5 >> 1219993025, arg0 >> 755311713,
				       class66.anInt1041 * 2, (byte) 126,
				       (class66.anInt1051
					+ ((-Class58.anInt947
					    + class66.anInt1044)
					   << 2057714119)));
		    if (anInt2007 > -1
			&& Class14_Sub2_Sub20.anInt4064 % 20 < 10)
			Class76.aClass14_Sub2_Sub19Array1191
			    [class66.anInt1035].method391
			    (-12 + (arg2 + anInt2007),
			     Class14_Sub8_Sub27.anInt4548 + arg6 - 28);
		}
	    }
	    anInt2000++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sg.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
    }
    
    public Class14_Sub12_Sub1 method1616(int arg0, int arg1, int[] arg2,
					 boolean arg3) {
    while_1081_:
	do {
	    long l;
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    int i = arg1 ^ ((arg0 & 0x40000fff) << 40731524
				    | arg0 >>> -199040788);
		    i |= arg0 << -1400276592;
		    anInt1999++;
		    l = (long) i;
		    if (arg3 == true)
			break;
		    class14_sub12_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1081_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    Class14_Sub12_Sub1 class14_sub12_sub1_0_
			= ((Class14_Sub12_Sub1)
			   aClass55_2015.method1230(l, (byte) 57));
		    if (class14_sub12_sub1_0_ == null)
			break;
		    class14_sub12_sub1 = class14_sub12_sub1_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1081_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    if (null == arg2 || -1 > (arg2[0] ^ 0xffffffff))
			break;
		    class14_sub12_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1081_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    Class91 class91;
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    class91 = Class91.method1451(aClass9_2010, arg0, arg1);
		    if (class91 != null)
			break;
		    class14_sub12_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1081_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    Class14_Sub12_Sub1 class14_sub12_sub1;
	    try {
		Class14_Sub12_Sub1 class14_sub12_sub1_1_
		    = class91.method1449();
		aClass55_2015.method1224(8, l, class14_sub12_sub1_1_);
		if (arg2 != null)
		    arg2[0] -= class14_sub12_sub1_1_.aByteArray4899.length;
		class14_sub12_sub1 = class14_sub12_sub1_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub12_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sg.E(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ')'));
    }
    
    public Class14_Sub12_Sub1 method1617(int arg0, int arg1, int[] arg2,
					 int arg3) {
    while_1083_:
	do {
	    long l;
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    anInt2011++;
		    int i = arg3 ^ (0xfffc & arg0 << 561473924
				    | arg0 >>> 374005868);
		    i |= arg0 << -122089040;
		    l = 0x100000000L ^ (long) i;
		    Class14_Sub12_Sub1 class14_sub12_sub1_2_
			= ((Class14_Sub12_Sub1)
			   aClass55_2015.method1230(l, (byte) -24));
		    if (class14_sub12_sub1_2_ == null)
			break;
		    class14_sub12_sub1 = class14_sub12_sub1_2_;
		} catch (RuntimeException runtimeexception) {
		    break while_1083_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    if (null == arg2 || arg2[0] > 0)
			break;
		    class14_sub12_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1083_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    Class14_Sub24 class14_sub24;
	while_1082_:
	    do {
		do {
		    Class14_Sub12_Sub1 class14_sub12_sub1;
		    try {
			class14_sub24
			    = ((Class14_Sub24)
			       aClass55_2004.method1230(l, (byte) -117));
			if (null != class14_sub24)
			    break while_1082_;
			class14_sub24 = Class14_Sub24.method910(aClass9_2003,
								arg0, arg3);
			if (class14_sub24 != null)
			    break;
			class14_sub12_sub1 = null;
		    } catch (RuntimeException runtimeexception) {
			break while_1083_;
		    }
		    return class14_sub12_sub1;
		} while (false);
		try {
		    aClass55_2004.method1224(8, l, class14_sub24);
		} catch (RuntimeException runtimeexception) {
		    break while_1083_;
		}
	    } while (false);
	    Class14_Sub12_Sub1 class14_sub12_sub1
		= class14_sub24.method904(arg2);
	    if (class14_sub12_sub1 == null)
		return null;
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1_3_;
		try {
		    class14_sub24.method233(0);
		    aClass55_2015.method1224(8, l, class14_sub12_sub1);
		    if (arg1 == 7711)
			break;
		    class14_sub12_sub1_3_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1083_;
		}
		return class14_sub12_sub1_3_;
	    } while (false);
	    Class14_Sub12_Sub1 class14_sub12_sub1_4_;
	    try {
		class14_sub12_sub1_4_ = class14_sub12_sub1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub12_sub1_4_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sg.B(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ')'));
    }
    
    public Class14_Sub12_Sub1 method1618(int[] arg0, byte arg1, int arg2) {
    while_1084_:
	do {
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    anInt2006++;
		    if (-2
			!= (aClass9_2003.method155(arg1 + 6794) ^ 0xffffffff))
			break;
		    class14_sub12_sub1 = method1617(0, 7711, arg0, arg2);
		} catch (RuntimeException runtimeexception) {
		    break while_1084_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    if (1 != aClass9_2003.method177(arg2, arg1 ^ ~0x34c4))
			break;
		    class14_sub12_sub1 = method1617(arg2, 7711, arg0, 0);
		} catch (RuntimeException runtimeexception) {
		    break while_1084_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    try {
		if (arg1 != -38)
		    method1614((byte) -7);
		throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		/* empty */
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sg.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public Class14_Sub12_Sub1 method1619(int[] arg0, int arg1, int arg2) {
    while_1085_:
	do {
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    anInt2013++;
		    if (1 != aClass9_2010.method155(6756))
			break;
		    class14_sub12_sub1 = method1616(0, arg2, arg0, true);
		} catch (RuntimeException runtimeexception) {
		    break while_1085_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    do {
		Class14_Sub12_Sub1 class14_sub12_sub1;
		try {
		    if (-2
			!= (aClass9_2010.method177(arg2, 13537) ^ 0xffffffff))
			break;
		    class14_sub12_sub1 = method1616(arg2, 0, arg0, true);
		} catch (RuntimeException runtimeexception) {
		    break while_1085_;
		}
		return class14_sub12_sub1;
	    } while (false);
	    try {
		if (arg1 != 23698)
		    method1615(-46, 50, 33, -16, -7, -102, -40);
		throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		/* empty */
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sg.D("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public Class120(Class9 arg0, Class9 arg1) {
	try {
	    aClass9_2003 = arg1;
	    aClass9_2010 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sg.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anInt2005 = 1;
	aClass124_2012 = Class14_Sub2_Sub2.method263(1178, "::qa_op_test");
	anIntArray2008 = new int[2];
	anInt2014 = 0;
	anIntArray2009 = new int[64];
    }
}
