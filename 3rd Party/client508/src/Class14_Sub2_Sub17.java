/* Class14_Sub2_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub17 extends Class14_Sub2
{
    public static Class124 aClass124_4012;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4013;
    public byte[] aByteArray4014;
    public static int anInt4015;
    public static int anInt4016;
    public static int anInt4017;
    public static int anInt4018 = 0;
    public static Class124 aClass124_4019;
    public static int[] anIntArray4020;
    public static Class124 aClass124_4021;
    public static Class76 aClass76_4022;
    
    public static void method374(byte arg0) {
	try {
	    aClass124_4012 = null;
	    aClass124_4019 = null;
	    anIntArray4020 = null;
	    aClass14_Sub2_Sub19Array4013 = null;
	    int i = 91 % ((-25 - arg0) / 61);
	    aClass76_4022 = null;
	    aClass124_4021 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rj.C(" + arg0 + ')');
	}
    }
    
    public Class14_Sub2_Sub17(byte[] arg0) {
	try {
	    aByteArray4014 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rj.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method375(int arg0) {
	try {
	    if (Class14_Sub8_Sub35.aClass75_4682 != null)
		Class14_Sub8_Sub35.aClass75_4682.method1345(25065);
	    if (null != Class134.aClass75_2588)
		Class134.aClass75_2588.method1345(25065);
	    Class131.method1772(Class14_Sub8_Sub26.aBoolean4528, 2, (byte) 26,
				22050);
	    anInt4016++;
	    Class14_Sub8_Sub35.aClass75_4682
		= Class14_Sub1.method235(22050, 68,
					 Class14_Sub8_Sub34.aClass43_4647,
					 Class49.aCanvas819, 0);
	    Class14_Sub8_Sub35.aClass75_4682
		.method1352(Class125.aClass14_Sub9_Sub1_2071, false);
	    int i = -48 % ((-26 - arg0) / 57);
	    Class134.aClass75_2588
		= Class14_Sub1.method235(2048, 102,
					 Class14_Sub8_Sub34.aClass43_4647,
					 Class49.aCanvas819, 1);
	    Class134.aClass75_2588.method1352(Class33.aClass14_Sub9_Sub2_585,
					      false);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rj.A(" + arg0 + ')');
	}
    }
    
    public static void method376(byte arg0, Class9 arg1) {
	try {
	    Class14.anInt371 = arg1.method146(Class81.aClass124_1318, 0);
	    Class14_Sub8_Sub39_Sub1.anInt5098
		= arg1.method146(Class14_Sub2_Sub4.aClass124_3795, 0);
	    if (arg0 < 19)
		aClass124_4019 = null;
	    Class14_Sub8_Sub26.anInt4532
		= arg1.method146(Class44.aClass124_732, 0);
	    anInt4015++;
	    Class127.anInt2118 = arg1.method146(Class41.aClass124_697, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rj.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anInt4017 = 0;
	aClass124_4012 = Class14_Sub2_Sub2.method263(1178, "slide:");
	aClass124_4021 = aClass124_4012;
	aClass124_4019 = aClass124_4012;
    }
}
