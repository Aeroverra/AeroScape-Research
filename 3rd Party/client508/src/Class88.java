/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class88
{
    public int anInt1396;
    public int anInt1397;
    public static Class55 aClass55_1398 = new Class55(16);
    public static int anInt1399;
    public static int anInt1400;
    public static int anInt1401;
    public int anInt1402;
    public int anInt1403;
    
    public static void method1435(byte arg0) {
	try {
	    Canvas_Sub1.method59((byte) -115);
	    Class44.method1156((byte) -54);
	    Class14_Sub8_Sub11.method530((byte) -11);
	    anInt1399++;
	    Class124.method1718(48);
	    Class96.method1488(2);
	    Class14_Sub8_Sub13.method544((byte) 124);
	    Class116.method1598(58);
	    Class14_Sub8_Sub16.method560(-12501);
	    Class90.method1443(2);
	    int i = -49 / ((90 - arg0) / 36);
	    Class24.method991((byte) -2);
	    Class39.method1124(97);
	    Class14_Sub30.method941((byte) 11);
	    Class7_Sub3.method134(0);
	    Class133.method1789((byte) -115);
	    Class14_Sub8_Sub30.aClass52_4596.method1209((byte) -96);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nl.A(" + arg0 + ')');
	}
    }
    
    public static void method1436(byte arg0) {
	try {
	    Class55.aClass14_Sub10_Sub1_891.method843(0, 129);
	    if (arg0 >= -50)
		method1439(11, -123, -108, 106);
	    Class14_Sub15.anInt3001++;
	    Class55.aClass14_Sub10_Sub1_891
		.method809(false, Class1.method73((byte) -58));
	    Class55.aClass14_Sub10_Sub1_891.method833((byte) 109,
						      Class83.anInt1340);
	    Class55.aClass14_Sub10_Sub1_891.method833((byte) 94,
						      Class14_Sub20.anInt3094);
	    Class56_Sub1.aLong3317 = 0L;
	    anInt1401++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nl.E(" + arg0 + ')');
	}
    }
    
    public static void method1437(boolean arg0) {
	try {
	    if (arg0)
		aClass55_1398 = null;
	    aClass55_1398 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "nl.D(" + arg0 + ')');
	}
    }
    
    public static boolean method1438(Class14_Sub9_Sub1 arg0, Class9 arg1,
				     boolean arg2, Class9 arg3, Class9 arg4) {
	boolean bool;
	try {
	    Class59.aClass9_957 = arg3;
	    Class133_Sub5.aClass14_Sub9_Sub1_3625 = arg0;
	    if (arg2)
		aClass55_1398 = null;
	    Class44.aClass9_725 = arg1;
	    anInt1400++;
	    Class14_Sub2_Sub14.aClass9_3945 = arg4;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("nl.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ','
			+ (arg4 != null ? "{...}" : "null") + ')'));
	}
	return bool;
    }
    
    public static void method1439(int arg0, int arg1, int arg2, int arg3) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 != null) {
	    Class37 class37 = class14_sub29.aClass37_3255;
	    if (class37 != null) {
		class37.anInt641 = class37.anInt641 * arg3 / 16;
		class37.anInt646 = class37.anInt646 * arg3 / 16;
	    }
	}
    }
}
