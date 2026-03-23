/* Class14_Sub2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub9 extends Class14_Sub2
{
    public static int anInt3856;
    public Class9_Sub1 aClass9_Sub1_3857;
    public static int anInt3858;
    public static int[] anIntArray3859 = { -1, -1, 1, 1 };
    public static int anInt3860;
    public static Class124 aClass124_3861
	= Class14_Sub2_Sub2.method263(1178, ")1j");
    public byte aByte3862;
    public static int anInt3863;
    public static byte[][][] aByteArrayArrayArray3864;
    public int anInt3865;
    public static int anInt3866;
    
    public static void method302(byte arg0) {
	try {
	    int i = 115 % ((78 - arg0) / 40);
	    anIntArray3859 = null;
	    aClass124_3861 = null;
	    aByteArrayArrayArray3864 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "j.D(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub8 method303(int arg0, Class14_Sub10 arg1) {
	Class14_Sub8 class14_sub8;
	try {
	    anInt3860++;
	    arg1.method798(arg0 ^ 0x45);
	    int i = arg1.method798(115);
	    Class14_Sub8 class14_sub8_0_ = Class149.method2016(i, arg0 ^ 0x7d);
	    class14_sub8_0_.anInt2837 = arg1.method798(93);
	    int i_1_ = arg1.method798(-53);
	    for (int i_2_ = 0; (i_1_ ^ 0xffffffff) < (i_2_ ^ 0xffffffff);
		 i_2_++) {
		int i_3_ = arg1.method798(67);
		class14_sub8_0_.method475(i_3_, arg0 ^ 0x60c9, arg1);
	    }
	    class14_sub8_0_.method472(arg0);
	    class14_sub8 = class14_sub8_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("j.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class14_sub8;
    }
    
    public static void method304() {
	for (int i = 0; i < Class14_Sub8_Sub38.anInt4727; i++) {
	    Class40 class40 = Class14_Sub20.aClass40Array3093[i];
	    Class63.method1279(class40);
	    Class14_Sub20.aClass40Array3093[i] = null;
	}
	Class14_Sub8_Sub38.anInt4727 = 0;
    }
    
    public static void method305(Class9 arg0, Class9 arg1, Class9 arg2,
				 Class9 arg3, byte arg4) {
    while_186_:
	do {
	while_185_:
	    do {
		do {
		    try {
			anInt3858++;
			Class134.aClass9_2598 = arg2;
			Class83.aClass9_1335 = arg3;
			if (arg4 <= -48)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_185_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub24.aClass9_4486 = arg1;
		    Class51.aClass9_833 = arg0;
		    Class1.aClass94ArrayArray75
			= new Class94[Class83.aClass9_1335.method155(6756)][];
		    Class108.aBooleanArray1819
			= new boolean[Class83.aClass9_1335.method155(6756)];
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_186_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554
		      (throwable, ("j.B(" + (arg0 != null ? "{...}" : "null")
				   + ',' + (arg1 != null ? "{...}" : "null")
				   + ',' + (arg2 != null ? "{...}" : "null")
				   + ',' + (arg3 != null ? "{...}" : "null")
				   + ',' + arg4 + ')'));
	} while (false);
    }
}
