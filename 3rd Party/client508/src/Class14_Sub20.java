/* Class14_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub20 extends Class14
{
    public int anInt3083;
    public int anInt3084;
    public int anInt3085;
    public static int[] anIntArray3086 = new int[256];
    public static int anInt3087;
    public static Class124 aClass124_3088;
    public static Class124 aClass124_3089;
    public static int anInt3090;
    public static int anInt3091;
    public static Class85[] aClass85Array3092;
    public static Class40[] aClass40Array3093;
    public static int anInt3094;
    public static int anInt3095;
    public static Class124 aClass124_3096;
    public static byte[][] aByteArrayArray3097;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3098;
    
    public static void method892(int arg0) {
    while_612_:
	do {
	while_611_:
	    do {
		do {
		    try {
			aByteArrayArray3097 = null;
			aClass40Array3093 = null;
			aClass124_3088 = null;
			aClass124_3096 = null;
			if (arg0 == 15075)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_611_;
		    }
		    return;
		} while (false);
		try {
		    aClass85Array3092 = null;
		    anIntArray3086 = null;
		    aClass14_Sub2_Sub19Array3098 = null;
		    aClass124_3089 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_612_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "pf.A(" + arg0 + ')');
	} while (false);
    }
    
    static {
	for (int i = 0; -257 < (i ^ 0xffffffff); i++) {
	    int i_0_ = i;
	    for (int i_1_ = 0; 8 > i_1_; i_1_++) {
		if (-2 != (0x1 & i_0_ ^ 0xffffffff))
		    i_0_ >>>= 1;
		else
		    i_0_ = i_0_ >>> 92938497 ^ ~0x12477cdf;
	    }
	    anIntArray3086[i] = i_0_;
	}
	anInt3087 = 0;
	aClass124_3088 = Class14_Sub2_Sub2.method263(1178, "Fertigkeit)2");
	anInt3090 = 0;
	aClass124_3089 = Class14_Sub2_Sub2.method263(1178, "lila:");
	aClass85Array3092 = new Class85[500];
	aClass40Array3093 = new Class40[5000];
	aClass124_3096
	    = Class14_Sub2_Sub2.method263(1178, " loggt sich ein)3");
    }
}
