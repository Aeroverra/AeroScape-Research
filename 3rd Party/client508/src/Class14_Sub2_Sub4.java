/* Class14_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class14_Sub2_Sub4 extends Class14_Sub2
{
    public Class133_Sub3 aClass133_Sub3_3789;
    public static int anInt3790;
    public static int[] anIntArray3791;
    public static int anInt3792;
    public static Class124 aClass124_3793;
    public static byte[] aByteArray3794;
    public static Class124 aClass124_3795
	= Class14_Sub2_Sub2.method263(1178, "sl_flags");
    public static Class14_Sub10 aClass14_Sub10_3796;
    
    public Class14_Sub2_Sub4(Class133_Sub3 arg0) {
	try {
	    aClass133_Sub3_3789 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cd.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method278(Class43 arg0, Frame arg1, int arg2) {
	try {
	    for (;;) {
		Class31 class31 = arg0.method1135(arg1, -30170);
		while (-1 == (class31.anInt529 ^ 0xffffffff))
		    Class14_Sub13.method864(10L, (byte) 64);
		if (1 == class31.anInt529)
		    break;
		Class14_Sub13.method864(100L, (byte) 64);
	    }
	    arg1.setVisible(false);
	    arg1.dispose();
	    anInt3790++;
	    int i = -114 / ((arg2 - 20) / 56);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cd.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static int[][] method279(int arg0, int arg1, int arg2, int arg3,
				    int arg4, int arg5, int arg6, float arg7,
				    boolean arg8) {
    while_169_:
	do {
	    Class14_Sub8_Sub12 class14_sub8_sub12;
	    int[][] is;
	    do {
		int[][] is_0_;
		try {
		    anInt3792++;
		    class14_sub8_sub12 = new Class14_Sub8_Sub12();
		    class14_sub8_sub12.anInt4297 = (int) (arg7 * 4096.0F);
		    class14_sub8_sub12.anInt4291 = arg2;
		    class14_sub8_sub12.aBoolean4277 = arg8;
		    is = new int[arg1][arg6];
		    if (arg0 == 256)
			break;
		    is_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_169_;
		}
		return is_0_;
	    } while (false);
	    int[][] is_1_;
	    try {
		class14_sub8_sub12.anInt4289 = arg5;
		class14_sub8_sub12.anInt4282 = arg4;
		class14_sub8_sub12.method472(0);
		Class38.method1117(0, arg1, arg6);
		for (int i = 0; i < arg1; i++)
		    class14_sub8_sub12.method542(-2, i, is[i]);
		is_1_ = is;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("cd.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ')'));
    }
    
    public static void method280(byte arg0) {
	try {
	    anIntArray3791 = null;
	    int i = 4 % ((arg0 - 28) / 48);
	    aClass124_3793 = null;
	    aClass14_Sub10_3796 = null;
	    aClass124_3795 = null;
	    aByteArray3794 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cd.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_3793
	    = Class14_Sub2_Sub2
		  .method263(1178, " zuerst von Ihrer Freunde)2Liste(Q");
	anIntArray3791 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };
	aByteArray3794 = new byte[32896];
	int i = 0;
	for (int i_2_ = 0; 256 > i_2_; i_2_++) {
	    for (int i_3_ = 0; i_3_ <= i_2_; i_3_++)
		aByteArray3794[i++]
		    = (byte) (int) (255.0
				    / Math.sqrt((double) ((float) (65535
								   + (i_2_
								      * i_2_)
								   + (i_3_
								      * i_3_))
							  / 65535.0F)));
	}
    }
}
