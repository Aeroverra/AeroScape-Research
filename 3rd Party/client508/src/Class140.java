/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class140
{
    public static Class124 aClass124_2234
	= Class14_Sub2_Sub2.method263(1178, "");
    public static int anInt2235;
    public static int anInt2236;
    public static int anInt2237;
    public static int anInt2238;
    
    public static void method1956(byte arg0) {
	try {
	    if (arg0 < 118)
		aClass124_2234 = null;
	    aClass124_2234 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ul.D(" + arg0 + ')');
	}
    }
    
    public static void method1957(boolean arg0, int arg1) {
	try {
	    Class127.aClass52_2112.method1208((byte) -112, arg1);
	    Class112.aClass52_1868.method1208((byte) -112, arg1);
	    if (arg0 != true)
		aClass124_2234 = null;
	    anInt2236++;
	    Class62.aClass52_991.method1208((byte) -112, arg1);
	    Class49.aClass52_810.method1208((byte) -112, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ul.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1958(byte arg0) {
	try {
	    Class14_Sub8_Sub36.anInt4708++;
	    anInt2235++;
	    Class55.aClass14_Sub10_Sub1_891.method843(0, 108);
	    for (Class14_Sub15 class14_sub15
		     = ((Class14_Sub15)
			Class14_Sub30.aClass55_3275.method1228((byte) -98));
		 null != class14_sub15;
		 class14_sub15 = (Class14_Sub15) Class14_Sub30
						     .aClass55_3275
						     .method1227((byte) -23)) {
		if ((class14_sub15.anInt2991 ^ 0xffffffff) == -1)
		    Class14_Sub1.method236(true, class14_sub15, (byte) -117);
	    }
	    if (arg0 <= 67)
		method1959(null, -107);
	    if (Class125_Sub2.aClass94_3388 != null) {
		Class103.method1531((byte) -120, Class125_Sub2.aClass94_3388);
		Class125_Sub2.aClass94_3388 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ul.A(" + arg0 + ')');
	}
    }
    
    public static void method1959(Class94 arg0, int arg1) {
    while_1250_:
	do {
	while_1249_:
	    do {
		int i;
		do {
		    try {
			i = arg0.anInt1498;
			anInt2237++;
			if (arg1 != -29163)
			    method1959(null, -38);
			if (324 != i)
			    break;
			if (-1 == Class100.anInt1681) {
			    Class14_Sub2_Sub13.anInt3929 = arg0.anInt1568;
			    Class100.anInt1681 = arg0.anInt1487;
			}
			if (Class14_Sub2_Sub20.aClass102_4055.aBoolean1711)
			    arg0.anInt1487 = Class100.anInt1681;
			else
			    arg0.anInt1487 = Class14_Sub2_Sub13.anInt3929;
		    } catch (RuntimeException runtimeexception) {
			break while_1249_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (i != 325)
			    break;
			if (0 == (Class100.anInt1681 ^ 0xffffffff)) {
			    Class14_Sub2_Sub13.anInt3929 = arg0.anInt1568;
			    Class100.anInt1681 = arg0.anInt1487;
			}
			if (Class14_Sub2_Sub20.aClass102_4055.aBoolean1711)
			    arg0.anInt1487 = Class14_Sub2_Sub13.anInt3929;
			else
			    arg0.anInt1487 = Class100.anInt1681;
		    } catch (RuntimeException runtimeexception) {
			break while_1249_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (i != 327)
			    break;
			arg0.anInt1465 = 150;
			arg0.anInt1578
			    = (0x7ff
			       & (int) (Math.sin((double) (Class14_Sub2_Sub20
							   .anInt4064) / 40.0)
					* 256.0));
			arg0.anInt1543 = 5;
			arg0.anInt1550 = -1;
		    } catch (RuntimeException runtimeexception) {
			break while_1249_;
		    }
		    return;
		} while (false);
	    while_1248_:
		do {
		    do {
			try {
			    if (328 != i)
				break while_1248_;
			    if (null != (Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .aClass124_4922))
				break;
			    arg0.anInt1550 = 0;
			} catch (RuntimeException runtimeexception) {
			    break while_1249_;
			}
			return;
		    } while (false);
		    try {
			arg0.anInt1465 = 150;
			arg0.anInt1578
			    = ((int) (256.0
				      * Math.sin((double) (Class14_Sub2_Sub20
							   .anInt4064) / 40.0))
			       & 0x7ff);
			arg0.anInt1543 = 5;
			arg0.anInt1550
			    = 2047 + ((int) Class14_Sub3
						.aClass133_Sub1_Sub1_2748
						.aClass124_4922
						.method1692(arg1 + 29163)
				      << -1731308021);
			arg0.anInt1598
			    = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3452;
			arg0.anInt1610
			    = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3483;
		    } catch (RuntimeException runtimeexception) {
			break while_1249_;
		    }
		    break;
		} while (false);
		break while_1250_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ul.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	} while (false);
    }
}
