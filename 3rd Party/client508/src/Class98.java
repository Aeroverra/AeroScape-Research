/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class98
{
    public int[] anIntArray1658;
    public static Class5 aClass5_1659;
    public static int[] anIntArray1660;
    public static Class124 aClass124_1661
	= (Class14_Sub2_Sub2.method263
	   (1178, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0"));
    public Class14_Sub2_Sub21 aClass14_Sub2_Sub21_1662;
    public int anInt1663;
    public static int anInt1664;
    public static long[] aLongArray1665 = new long[100];
    public static Class9_Sub1 aClass9_Sub1_1666;
    public static byte[][] aByteArrayArray1667;
    public static int anInt1668;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array1669;
    public static int anInt1670;
    public static int anInt1671;
    public static int anInt1672;
    public static Class124 aClass124_1673
	= Class14_Sub2_Sub2.method263(1178,
				      "3D)2Softwarebibliothek gestartet)3");
    
    public static void method1492(int arg0, byte arg1) {
	try {
	    if (arg1 >= -43)
		method1492(38, (byte) 76);
	    if (arg0 == -1 && !Class14_Sub7.aBoolean2827)
		Class14_Sub8_Sub17.method569(-80);
	    else if (arg0 != -1
		     && (Class14_Sub8.anInt2856 != arg0
			 || !Class14_Sub11.method852(14326))
		     && -1 != (Class14_Sub23.anInt3135 ^ 0xffffffff)
		     && !Class14_Sub7.aBoolean2827)
		Class14_Sub8_Sub29.method636(arg0, 2, 25506,
					     Class14_Sub23.anInt3135, false,
					     Class125_Sub2.aClass9_Sub1_3374,
					     0);
	    Class14_Sub8.anInt2856 = arg0;
	    anInt1672++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pc.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static boolean method1493(int arg0, Class124 arg1) {
    while_1010_:
	do {
	    do {
		boolean bool;
		try {
		    anInt1670++;
		    if (arg1 != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1010_;
		}
		return bool;
	    } while (false);
	    int i;
	    try {
		if (arg0 != -1)
		    method1494(26, -128);
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while ((Class14_Sub2_Sub1.anInt3728 ^ 0xffffffff)
		   < (i ^ 0xffffffff)) {
		if (arg1.method1717(arg0 ^ ~0x28,
				    Class14_Sub10.aClass124Array2938[i]))
		    return true;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1010_;
		}
	    }
	    if (arg1.method1717(40, (Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .aClass124_4922)))
		return true;
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pc.D(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method1494(int arg0, int arg1) {
    while_1012_:
	do {
	while_1011_:
	    do {
		do {
		    try {
			if (((arg0 ^ 0xffffffff)
			     == (Class14_Sub2_Sub15.anInt3957 ^ 0xffffffff))
			    && -1 != (arg0 ^ 0xffffffff)) {
			    Interface2 interface2
				= Class141.anInterface2Array2245[arg0];
			    interface2.method1(Class112.anInt1871);
			}
			if (arg1 == -5651)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1011_;
		    }
		    return;
		} while (false);
		try {
		    anInt1664++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1012_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "pc.B(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method1495(int arg0) {
	try {
	    if (arg0 < 112)
		aClass124_1673 = null;
	    aClass9_Sub1_1666 = null;
	    aLongArray1665 = null;
	    aClass124_1673 = null;
	    anIntArray1660 = null;
	    aClass124_1661 = null;
	    aByteArrayArray1667 = null;
	    aClass5_1659 = null;
	    aClass14_Sub2_Sub19Array1669 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pc.A(" + arg0 + ')');
	}
    }
    
    public static void method1496(int arg0, int arg1, int arg2) {
	Class142.aBoolean2299 = true;
	Class86.anInt1389 = arg0;
	Class14_Sub19.anInt3073 = arg1;
	Class99_Sub2.anInt3334 = arg2;
	Class66.anInt1039 = -1;
	Class14_Sub8_Sub33.anInt4636 = -1;
    }
}
