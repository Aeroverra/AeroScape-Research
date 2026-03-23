/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class48
{
    public static Class124 aClass124_797;
    public static int anInt798 = -1;
    public static Class124 aClass124_799
	= Class14_Sub2_Sub2.method263(1178, "level)2");
    public static int anInt800;
    public static Class124 aClass124_801;
    public static long aLong802;
    public static Class87 aClass87_803;
    public static Class99 aClass99_804;
    public static Class87 aClass87_805;
    public static int anInt806;
    public static long aLong807;
    
    public static void method1191(byte arg0) {
	try {
	    int i = 0;
	    if (arg0 <= 122)
		method1192(-124, 3);
	    for (/**/; (i ^ 0xffffffff) > -6; i++)
		Class112.aBooleanArray1872[i] = false;
	    Class14_Sub8_Sub35.anInt4687 = -1;
	    anInt800++;
	    Class45.anInt751 = -1;
	    Class89.anInt1415 = 1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fi.C(" + arg0 + ')');
	}
    }
    
    public static int method1192(int arg0, int arg1) {
	int i;
	try {
	    if (arg1 != 25039)
		aClass87_805 = null;
	    anInt806++;
	    int i_0_ = 0;
	    if (-1 < (arg0 ^ 0xffffffff) || arg0 >= 65536) {
		arg0 >>>= 16;
		i_0_ += 16;
	    }
	    if ((arg0 ^ 0xffffffff) <= -257) {
		arg0 >>>= 8;
		i_0_ += 8;
	    }
	    if (16 <= arg0) {
		i_0_ += 4;
		arg0 >>>= 4;
	    }
	    if (4 <= arg0) {
		arg0 >>>= 2;
		i_0_ += 2;
	    }
	    if (arg0 >= 1) {
		i_0_++;
		arg0 >>>= 1;
	    }
	    i = arg0 + i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fi.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method1193(int arg0) {
	try {
	    aClass87_803 = null;
	    aClass87_805 = null;
	    aClass124_801 = null;
	    aClass124_797 = null;
	    aClass124_799 = null;
	    aClass99_804 = null;
	    if (arg0 != 50)
		aClass124_797 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fi.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_797 = aClass124_799;
	aClass124_801 = Class14_Sub2_Sub2.method263(1178, "<col=ffb000>");
    }
}
