/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class86
{
    public static int anInt1378;
    public Class133 aClass133_1379;
    public static int anInt1380;
    public static int anInt1381;
    public static int anInt1382;
    public static byte[][][] aByteArrayArrayArray1383;
    public static Class124 aClass124_1384;
    public static volatile int anInt1385 = 0;
    public Class148_Sub1 aClass148_Sub1_1386;
    public static int anInt1387;
    public static int anInt1388;
    public static int anInt1389 = 0;
    
    public static Class37 method1418(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	Class37 class37 = class14_sub29.aClass37_3255;
	class14_sub29.aClass37_3255 = null;
	return class37;
    }
    
    public static Class124 method1419(byte arg0) {
	Class124 class124;
	try {
	    anInt1388++;
	    Class124 class124_0_ = Class14_Sub8_Sub14.aClass124_4326;
	    if (arg0 <= 124)
		aClass124_1384 = null;
	    if (0 != Class7.anInt182)
		class124_0_ = Class14_Sub8_Sub23.aClass124_4481;
	    class124
		= (Class14_Sub8_Sub7.method515
		   ((new Class124[]
		     { Class142.aClass124_2271, class124_0_,
		       Class107.aClass124_1800,
		       Class83.method1407(102, Class125_Sub2.anInt3383),
		       Class14_Sub8_Sub16.aClass124_4341,
		       Class83.method1407(111, Class14_Sub2_Sub11.anInt3884),
		       Class137.aClass124_2195 }),
		    (byte) -24));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nf.D(" + arg0 + ')');
	}
	return class124;
    }
    
    public static void method1420(int arg0) {
    while_975_:
	do {
	while_974_:
	    do {
		do {
		    try {
			anInt1382++;
			int i
			    = Class14_Sub8_Sub5.aClass2_4163.method74(-20454);
			if ((i ^ 0xffffffff) != -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_974_;
		    }
		    return;
		} while (false);
		try {
		    Class55.aClass14_Sub10_Sub1_891.method843(0, 67);
		    Class14_Sub8_Sub32.anInt4624++;
		    Class55.aClass14_Sub10_Sub1_891.method809(false, 0);
		    int i = Class55.aClass14_Sub10_Sub1_891.anInt2908;
		    Class14_Sub1 class14_sub1
			= ((Class14_Sub1)
			   Class14_Sub8_Sub5.aClass2_4163.method78(128));
		    Class55.aClass14_Sub10_Sub1_891
			.method833((byte) 108, class14_sub1.anInt2714);
		    int i_1_ = class14_sub1.anInt2714;
		    if (arg0 <= 73)
			method1422(29, null);
		    int i_2_ = 0;
		    while ((class14_sub1
			    = ((Class14_Sub1)
			       Class14_Sub8_Sub5.aClass2_4163.method78(128)))
			   != null) {
			if ((i_2_ ^ 0xffffffff) <= -256
			    || class14_sub1.anInt2714 != i_1_ - -1) {
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      i_2_);
			    i_2_ = 0;
			    Class55.aClass14_Sub10_Sub1_891
				.method833((byte) 122, class14_sub1.anInt2714);
			} else
			    i_2_++;
			i_1_ = class14_sub1.anInt2714;
		    }
		    Class55.aClass14_Sub10_Sub1_891.method809(false, i_2_);
		    Class55.aClass14_Sub10_Sub1_891.method804
			(Class55.aClass14_Sub10_Sub1_891.anInt2908 - i,
			 (byte) 32);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_975_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "nf.B(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1421(byte arg0) {
	try {
	    if (arg0 != 2)
		aByteArrayArrayArray1383 = null;
	    aClass124_1384 = null;
	    aByteArrayArrayArray1383 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nf.F(" + arg0 + ')');
	}
    }
    
    public static Class98 method1422(int arg0, Class14_Sub10 arg1) {
	Class98 class98;
	try {
	    anInt1378++;
	    int i = 52 % ((3 - arg0) / 36);
	    Class98 class98_3_ = new Class98();
	    class98_3_.anInt1663 = arg1.method784((byte) 102);
	    class98_3_.aClass14_Sub2_Sub21_1662
		= Class14_Sub2_Sub3.method272(class98_3_.anInt1663, (byte) 46);
	    class98 = class98_3_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("nf.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class98;
    }
    
    public static void method1423(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	try {
	    anInt1380++;
	    int i = 23 % ((28 - arg6) / 44);
	    if (Class118.anInt1982 <= arg3
		&& ((Class14_Sub8_Sub14.anInt4327 ^ 0xffffffff)
		    <= (arg1 ^ 0xffffffff))
		&& arg5 >= Class14_Sub17.anInt3005
		&& Class59.anInt955 >= arg2) {
		if (-2 != (arg0 ^ 0xffffffff))
		    Class14_Sub17.method879(arg5, arg4, 255, arg2, arg0, arg1,
					    arg3);
		else
		    Class56_Sub1.method1241(arg1, arg3, (byte) -119, arg4,
					    arg2, arg5);
	    } else if (-2 != (arg0 ^ 0xffffffff))
		Class14_Sub6.method466(arg3, arg5, -32718, arg4, arg0, arg1,
				       arg2);
	    else
		Class14_Sub10_Sub1.method849(arg1, arg2, 0, arg4, arg5, arg3);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("nf.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	}
    }
    
    public static void method1424(int arg0, Class9 arg1) {
    while_977_:
	do {
	while_976_:
	    do {
		do {
		    try {
			anInt1381++;
			if (arg0 == -256)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_976_;
		    }
		    return;
		} while (false);
		try {
		    Class14.aClass9_367 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_977_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("nf.G(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    static {
	aClass124_1384
	    = Class14_Sub2_Sub2.method263(1178, "Verbindung abgebrochen)3");
    }
}
