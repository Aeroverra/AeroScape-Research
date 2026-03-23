/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class109
{
    public int anInt1829;
    public int anInt1830;
    public static Class124 aClass124_1831
	= Class14_Sub2_Sub2.method263(1178, "null");
    public static int anInt1832;
    public int anInt1833;
    public static Class9_Sub1 aClass9_Sub1_1834;
    public static Class14_Sub2_Sub19_Sub1[] aClass14_Sub2_Sub19_Sub1Array1835;
    public static Class124 aClass124_1836
	= Class14_Sub2_Sub2.method263(1178, ")3)3)3");
    public static int anInt1837;
    public byte aByte1838;
    public static Class124 aClass124_1839
	= Class14_Sub2_Sub2.method263(1178, "::fpsoff");
    public static int anInt1840;
    public int anInt1841;
    public static int anInt1842;
    public static int anInt1843;
    public static int anInt1844;
    public int anInt1845;
    public static int anInt1846;
    
    public static void method1563(int arg0, int arg1) {
    while_1052_:
	do {
	while_1051_:
	    do {
		do {
		    try {
			anInt1844++;
			if (Class126.method1741((byte) 108, arg0))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1051_;
		    }
		    return;
		} while (false);
		try {
		    Class94[] class94s = Class1.aClass94ArrayArray75[arg0];
		    int i = -41 % ((43 - arg1) / 47);
		    for (int i_0_ = 0; i_0_ < class94s.length; i_0_++) {
			Class94 class94 = class94s[i_0_];
			if (class94 != null) {
			    class94.anInt1603 = 0;
			    class94.anInt1610 = 0;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1052_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "qj.E(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static boolean method1564(int arg0, int arg1, int arg2,
				     Class9 arg3) {
    while_1053_:
	do {
	    byte[] is;
	    do {
		boolean bool;
		try {
		    is = arg3.method163(arg1, arg2, arg0 + 2);
		    anInt1832++;
		    if (null != is)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1053_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		Class14_Sub9_Sub1.method708(is, arg0 ^ ~0x91);
		if (arg0 != -2)
		    aClass9_Sub1_1834 = null;
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qj.F(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static Class14_Sub2_Sub19 method1565
	(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
    while_1054_:
	do {
	    int i;
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    i = ((arg0 << -142169519) + arg3
			 - (-(arg2 ? 65536 : 0) - (arg5 << -1320293389)));
		    if (arg4 <= -35)
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1054_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    long l;
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    anInt1840++;
		    int i_1_ = arg1;
		    l = 3147483667L * (long) i_1_ - -((long) i * 3849834839L);
		    Class14_Sub2_Sub19 class14_sub2_sub19_2_
			= ((Class14_Sub2_Sub19)
			   Class70.aClass52_1077.method1210((byte) 115, l));
		    if (class14_sub2_sub19_2_ == null)
			break;
		    class14_sub2_sub19 = class14_sub2_sub19_2_;
		} catch (RuntimeException runtimeexception) {
		    break while_1054_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19 class14_sub2_sub19;
	    try {
		Class3.aBoolean103 = false;
		Class14_Sub2_Sub19 class14_sub2_sub19_3_
		    = Class49.method1194(false, arg0, arg3, false, arg2, arg1,
					 true, arg5);
		if (class14_sub2_sub19_3_ != null && !Class3.aBoolean103)
		    Class70.aClass52_1077.method1205((byte) -93,
						     class14_sub2_sub19_3_, l);
		class14_sub2_sub19 = class14_sub2_sub19_3_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qj.K(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ')'));
    }
    
    public static void method1566(int arg0) {
	Class14_Sub23.anInt3134 = arg0;
	for (int i = 0; i < Class99_Sub2.anInt3338; i++) {
	    for (int i_4_ = 0; i_4_ < Class14_Sub8_Sub15.anInt4337; i_4_++) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][i]
		     [i_4_])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0]
			[i][i_4_]
			= new Class14_Sub29(arg0, i, i_4_);
	    }
	}
    }
    
    public static int[] method1567(boolean arg0, int arg1, int arg2, int arg3,
				   int arg4, float arg5, int arg6, int arg7) {
	int[] is;
	try {
	    int i = 30 / ((-69 - arg2) / 49);
	    int[] is_5_ = new int[arg4];
	    anInt1837++;
	    Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
	    class14_sub8_sub12.aBoolean4277 = arg0;
	    class14_sub8_sub12.anInt4289 = arg7;
	    class14_sub8_sub12.anInt4300 = arg3;
	    class14_sub8_sub12.anInt4282 = arg6;
	    class14_sub8_sub12.anInt4291 = arg1;
	    class14_sub8_sub12.anInt4297 = (int) (arg5 * 4096.0F);
	    class14_sub8_sub12.method472(0);
	    Class38.method1117(0, 1, arg4);
	    class14_sub8_sub12.method542(-2, 0, is_5_);
	    is = is_5_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qj.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
	return is;
    }
    
    public static void method1568(byte arg0) {
	try {
	    anInt1843++;
	    Class14_Sub2_Sub12.anInt3912 = Class14_Sub8_Sub6.anInt4187;
	    Class26_Sub2.method1032(false, -1291652884);
	    Class14_Sub2_Sub8.method297((byte) -36);
	    Class73.method1328(Class14_Sub2_Sub12.anInt3912, true);
	    Class14_Sub3.aClass133_Sub1_Sub1_2748 = new Class133_Sub1_Sub1();
	    Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 = 3000;
	    Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 = 3000;
	    if (Class89.anInt1415 == 2) {
		Class133_Sub6.anInt3676 = -48 + Class123.anInt2062;
		Class14_Sub8_Sub38.anInt4741
		    = 64 + (Class123.anInt2062 * 128
			    + -(Class133_Sub6.anInt3676 * 128));
		Class123.anInt2062
		    = Class14_Sub8_Sub38.anInt4741 >> -1511616729;
		Class58.anInt947 = Class14_Sub8_Sub38.anInt4731 - 48;
		Class14_Sub30.anInt3271 = (Class14_Sub8_Sub38.anInt4731 * 128
					   + 64 + -(Class58.anInt947 * 128));
		Class14_Sub8_Sub38.anInt4731
		    = Class14_Sub30.anInt3271 >> -1784097465;
	    } else
		Class14_Sub8_Sub7.method511(3);
	    Class14_Sub13.method858(-1);
	    if (arg0 > -25)
		aClass124_1836 = null;
	    Class118.method1608(-13873);
	    Class126.method1743(27252, 28);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qj.I(" + arg0 + ')');
	}
    }
    
    public static void method1569(int arg0, int arg1) {
	Class14_Sub29 class14_sub29
	    = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][arg0][arg1];
	for (int i = 0; i < 3; i++) {
	    Class14_Sub29 class14_sub29_6_
		= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg0]
		       [arg1]
		   = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i + 1]
		      [arg0][arg1]));
	    if (class14_sub29_6_ != null) {
		class14_sub29_6_.anInt3243--;
		for (int i_7_ = 0; i_7_ < class14_sub29_6_.anInt3242; i_7_++) {
		    Class40 class40 = class14_sub29_6_.aClass40Array3257[i_7_];
		    if ((class40.aLong677 >> 29 & 0x3L) == 2L
			&& class40.anInt668 == arg0
			&& class40.anInt678 == arg1)
			class40.anInt672--;
		}
	    }
	}
	if (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][arg0][arg1]
	    == null)
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][arg0][arg1]
		= new Class14_Sub29(0, arg0, arg1);
	Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][arg0][arg1]
	    .aClass14_Sub29_3260
	    = class14_sub29;
	Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[3][arg0][arg1] = null;
    }
    
    public static boolean method1570(int arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5, Class133 arg6,
				     int arg7, long arg8) {
	if (arg6 == null)
	    return true;
	int i = arg1 * 128 + 64 * arg4;
	int i_8_ = arg2 * 128 + 64 * arg5;
	return Class14_Sub8_Sub19.method580(arg0, arg1, arg2, arg4, arg5, i,
					    i_8_, arg3, arg6, arg7, false,
					    arg8);
    }
    
    public static void method1571(int arg0) {
	try {
	    aClass124_1836 = null;
	    if (arg0 != 0)
		method1564(-99, 61, 81, null);
	    aClass14_Sub2_Sub19_Sub1Array1835 = null;
	    aClass124_1831 = null;
	    aClass9_Sub1_1834 = null;
	    aClass124_1839 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qj.H(" + arg0 + ')');
	}
    }
    
    public int method1572(byte arg0) {
	int i;
	try {
	    anInt1842++;
	    if (arg0 != 42)
		aClass9_Sub1_1834 = null;
	    i = 0x7 & aByte1838;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qj.B(" + arg0 + ')');
	}
	return i;
    }
    
    public int method1573(boolean arg0) {
	int i;
	try {
	    anInt1846++;
	    if (arg0 != true)
		anInt1841 = -49;
	    i = 8 == (0x8 & aByte1838) ? 1 : 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qj.A(" + arg0 + ')');
	}
	return i;
    }
    
    public Class109() {
	/* empty */
    }
    
    public Class109(Class14_Sub10 arg0) {
	try {
	    aByte1838 = arg0.method780((byte) -77);
	    anInt1830 = arg0.method784((byte) 125);
	    anInt1833 = arg0.method812((byte) -99);
	    anInt1841 = arg0.method812((byte) -102);
	    anInt1845 = arg0.method812((byte) -117);
	    anInt1829 = arg0.method812((byte) -97);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qj.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
}
