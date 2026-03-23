/* Class14_Sub2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub7 extends Class14_Sub2
{
    public static int anInt3820;
    public static Class124 aClass124_3821;
    public Class133_Sub5 aClass133_Sub5_3822;
    public static int anInt3823;
    public static Class9_Sub1 aClass9_Sub1_3824;
    public static int[] anIntArray3825 = new int[2048];
    public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_3826;
    
    public static void method288(int arg0) {
	try {
	    if (arg0 != 1)
		method289((byte) 0, -63, null, null, 35);
	    aClass14_Sub2_Sub19_3826 = null;
	    aClass124_3821 = null;
	    anIntArray3825 = null;
	    aClass9_Sub1_3824 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "g.A(" + arg0 + ')');
	}
    }
    
    public static void method289(byte arg0, int arg1, int[] arg2,
				 Object[] arg3, int arg4) {
	try {
	    if ((arg4 ^ 0xffffffff) > (arg1 ^ 0xffffffff)) {
		int i = (arg1 + arg4) / 2;
		int i_0_ = arg4;
		int i_1_ = arg2[i];
		arg2[i] = arg2[arg1];
		arg2[arg1] = i_1_;
		Object object = arg3[i];
		arg3[i] = arg3[arg1];
		arg3[arg1] = object;
		for (int i_2_ = arg4;
		     (arg1 ^ 0xffffffff) < (i_2_ ^ 0xffffffff); i_2_++) {
		    if (arg2[i_2_] < (0x1 & i_2_) + i_1_) {
			int i_3_ = arg2[i_2_];
			arg2[i_2_] = arg2[i_0_];
			arg2[i_0_] = i_3_;
			Object object_4_ = arg3[i_2_];
			arg3[i_2_] = arg3[i_0_];
			arg3[i_0_++] = object_4_;
		    }
		}
		arg2[arg1] = arg2[i_0_];
		arg2[i_0_] = i_1_;
		arg3[arg1] = arg3[i_0_];
		arg3[i_0_] = object;
		method289((byte) 127, i_0_ + -1, arg2, arg3, arg4);
		method289((byte) 127, arg1, arg2, arg3, i_0_ + 1);
	    }
	    anInt3823++;
	    if (arg0 <= 123)
		method289((byte) -96, 52, null, null, 107);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("g.B(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ')'));
	}
    }
    
    public Class14_Sub2_Sub7(Class133_Sub5 arg0) {
	try {
	    aClass133_Sub5_3822 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "g.<init>(" + (arg0 != null
							      ? "{...}"
							      : "null") + ')');
	}
    }
    
    static {
	aClass124_3821 = Class14_Sub2_Sub2.method263(1178, "blinken1:");
    }
}
