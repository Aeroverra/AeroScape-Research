/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class70
{
    public static int anInt1075;
    public static int anInt1076;
    public static Class52 aClass52_1077 = new Class52(100);
    public static Class14_Sub2_Sub5 aClass14_Sub2_Sub5_1078;
    public static Class52 aClass52_1079 = new Class52(5);
    public static Class14_Sub10_Sub1 aClass14_Sub10_Sub1_1080
	= new Class14_Sub10_Sub1(5000);
    public static int anInt1081;
    public static int[] anIntArray1082
	= { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1,
	    1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1,
	    0, 4, 1, 5 };
    
    public static void method1312(int arg0) {
	try {
	    if (arg0 != 0)
		aClass14_Sub2_Sub5_1078 = null;
	    aClass14_Sub10_Sub1_1080 = null;
	    aClass52_1077 = null;
	    aClass14_Sub2_Sub5_1078 = null;
	    aClass52_1079 = null;
	    anIntArray1082 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jc.A(" + arg0 + ')');
	}
    }
    
    public static void method1313(int arg0) {
	try {
	    if (Class14_Sub2_Sub12.anInt3912 != -1)
		Class14_Sub2_Sub1.method250(Class14_Sub2_Sub12.anInt3912,
					    false);
	    for (int i = 0; i < Class14_Sub17.anInt3012; i++) {
		if (Class14_Sub8_Sub36.aBooleanArray4698[i])
		    Class7_Sub2_Sub1.aBooleanArray3703[i] = true;
		Class103.aBooleanArray1727[i]
		    = Class14_Sub8_Sub36.aBooleanArray4698[i];
		Class14_Sub8_Sub36.aBooleanArray4698[i] = false;
	    }
	    Class138.anInt2214 = -1;
	    Class14_Sub8_Sub34.anInt4666 = Class14_Sub2_Sub20.anInt4064;
	    Class141.aClass94_2239 = null;
	    Class14_Sub8_Sub24.anInt4503 = -1;
	    Class89.aBoolean1409 = true;
	    anInt1075++;
	    if (-1 != Class14_Sub2_Sub12.anInt3912) {
		Class14_Sub17.anInt3012 = 0;
		Class14_Sub8_Sub22.method594(Class14_Sub20.anInt3094, true, 0,
					     Class14_Sub2_Sub12.anInt3912, -1,
					     0, 0, Class83.anInt1340, 0);
	    }
	    Class25.method994();
	    Class51.anInt839 = 0;
	    if (arg0 != -11198)
		method1312(82);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jc.B(" + arg0 + ')');
	}
    }
    
    public static void method1314(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    Class14_Sub8_Sub14.anInt4327 = arg3;
	    Class14_Sub17.anInt3005 = arg0;
	    anInt1076++;
	    Class118.anInt1982 = arg4;
	    Class59.anInt955 = arg2;
	    int i = 75 % ((35 - arg1) / 35);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jc.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
}
