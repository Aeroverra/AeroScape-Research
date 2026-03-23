/* Class4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class4
{
    public int anInt121;
    public int anInt122;
    public static int anInt123;
    public Class133 aClass133_124;
    public static int anInt125;
    public static Class124 aClass124_126;
    public static Class2 aClass2_127;
    public static int[] anIntArray128 = { 16, 32, 64, 128 };
    public static Class124 aClass124_129;
    public static int anInt130;
    public static Class124 aClass124_131;
    public long aLong132;
    public boolean aBoolean133 = false;
    public static Class36 aClass36_134;
    public static int anInt135;
    public int anInt136;
    public static Class14_Sub2_Sub16_Sub1 aClass14_Sub2_Sub16_Sub1_137;
    
    public static void method108(byte arg0) {
	try {
	    aClass124_126 = null;
	    anIntArray128 = null;
	    aClass124_131 = null;
	    if (arg0 <= 126)
		aClass36_134 = null;
	    aClass36_134 = null;
	    aClass2_127 = null;
	    aClass124_129 = null;
	    aClass14_Sub2_Sub16_Sub1_137 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ai.B(" + arg0 + ')');
	}
    }
    
    public static void method109(int arg0, int arg1) {
	try {
	    anInt130++;
	    Class139.aClass52_2229.method1208((byte) -112, arg1);
	    if (arg0 != 16)
		method109(1, 105);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ai.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    static {
	anInt123 = 0;
	aClass124_129 = null;
	aClass124_126
	    = Class14_Sub2_Sub2.method263(1178, "Prepared sound engine");
	aClass124_131 = aClass124_126;
	aClass2_127 = new Class2();
    }
}
