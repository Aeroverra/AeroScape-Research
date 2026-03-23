/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class111
{
    public static Class124 aClass124_1856
	= Class14_Sub2_Sub2.method263(1178, ":trade:");
    public static int anInt1857;
    public static Class124 aClass124_1858;
    public static int anInt1859;
    public static volatile int anInt1860 = 0;
    public static Class124 aClass124_1861
	= Class14_Sub2_Sub2.method263(1178, "K");
    public static int anInt1862;
    public static Class124 aClass124_1863;
    public static Class124 aClass124_1864 = aClass124_1861;
    public static int anInt1865 = 0;
    public static Class124 aClass124_1866;
    public static int anInt1867;
    
    public static void method1576(int arg0) {
    while_1056_:
	do {
	while_1055_:
	    do {
		do {
		    try {
			aClass124_1866 = null;
			aClass124_1864 = null;
			aClass124_1858 = null;
			if (arg0 >= 86)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1055_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_1861 = null;
		    aClass124_1863 = null;
		    aClass124_1856 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1056_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ra.C(" + arg0 + ')');
	} while (false);
    }
    
    public static boolean method1577(byte arg0, int arg1) {
    while_1057_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 <= -30)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1057_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		anInt1862++;
		bool = -1 != ((0x19db8103 & arg1) >> -1992153412 ^ 0xffffffff);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ra.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1578(int arg0) {
	try {
	    Class133_Sub5.aBoolean3628 = false;
	    Class146.anInt2357 = -1;
	    Class14_Sub8_Sub12.anInt4280 = 0;
	    Class96.anInt1636 = 0;
	    Class71.anInt1085 = 0;
	    Class14_Sub8_Sub38.anInt4729 = 0;
	    Class7_Sub2.anInt2675 = 0;
	    Class133_Sub4.anInt3579 = -1;
	    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
	    Class14_Sub8_Sub2.anInt4114 = -1;
	    anInt1867++;
	    Class14_Sub8_Sub33.anInt4633 = 0;
	    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.anInt2908 = 0;
	    Class14_Sub2_Sub13.anInt3931 = -1;
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474.length
		     ^ 0xffffffff));
		 i++) {
		if (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i] != null)
		    Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i]
			.anInt3453
			= -1;
	    }
	    for (int i = 0;
		 ((i ^ 0xffffffff)
		  > (Class14_Sub4.aClass133_Sub1_Sub2Array2785.length
		     ^ 0xffffffff));
		 i++) {
		if (null != Class14_Sub4.aClass133_Sub1_Sub2Array2785[i])
		    Class14_Sub4.aClass133_Sub1_Sub2Array2785[i].anInt3453
			= -1;
	    }
	    Class33.method1088((byte) 127);
	    Class89.anInt1415 = 1;
	    Class126.method1743(27252, 30);
	    int i = 68 % ((-21 - arg0) / 53);
	    for (int i_0_ = 0; -101 < (i_0_ ^ 0xffffffff); i_0_++)
		Class14_Sub8_Sub36.aBooleanArray4698[i_0_] = true;
	    Class14_Sub8_Sub5.aClass2_4163.method81((byte) -90);
	    Class88.method1436((byte) -121);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ra.B(" + arg0 + ')');
	}
    }
    
    static {
	anInt1859 = 0;
	aClass124_1863 = Class14_Sub2_Sub2.method263(1178, "l");
	aClass124_1866 = Class14_Sub2_Sub2.method263(1178, "_");
	aClass124_1858 = aClass124_1861;
    }
}
