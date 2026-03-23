/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class33
{
    public static int anInt573;
    public static int anInt574;
    public static int[][] anIntArrayArray575 = new int[104][104];
    public static int anInt576;
    public static int anInt577;
    public static Class124 aClass124_578
	= Class14_Sub2_Sub2.method263(1178, "");
    public static Class9 aClass9_579;
    public static short[] aShortArray580;
    public static int anInt581;
    public static int anInt582;
    public static Class2 aClass2_583;
    public static boolean aBoolean584 = true;
    public static Class14_Sub9_Sub2 aClass14_Sub9_Sub2_585;
    public static int anInt586;
    
    public static void method1084(byte arg0) {
	try {
	    if (128 > Class2.anInt102)
		Class2.anInt102 = 128;
	    Class14_Sub8_Sub19.anInt4408 &= 0x7ff;
	    if (383 < Class2.anInt102)
		Class2.anInt102 = 383;
	    int i = Class55.anInt905 >> 108956743;
	    anInt576++;
	    int i_0_ = -49 % ((-89 - arg0) / 35);
	    int i_1_ = Class140.anInt2238 >> -154653209;
	    int i_2_ = Class26.method1017(Class140.anInt2238,
					  Class14_Sub2_Sub3.anInt3785,
					  (byte) 90, Class55.anInt905);
	    int i_3_ = 0;
	    if ((i_1_ ^ 0xffffffff) < -4 && i > 3 && -101 < (i_1_ ^ 0xffffffff)
		&& 100 > i) {
		for (int i_4_ = -4 + i_1_; i_1_ + 4 >= i_4_; i_4_++) {
		    for (int i_5_ = -4 + i;
			 (4 + i ^ 0xffffffff) <= (i_5_ ^ 0xffffffff); i_5_++) {
			int i_6_ = Class14_Sub2_Sub3.anInt3785;
			if (3 > i_6_ && (0x2 & (Class14_Sub8_Sub4
						.aByteArrayArrayArray4142[1]
						[i_4_][i_5_])) == 2)
			    i_6_++;
			int i_7_ = (-(Class114.anIntArrayArrayArray1896[i_6_]
				      [i_4_][i_5_])
				    + i_2_);
			if (i_7_ > i_3_)
			    i_3_ = i_7_;
		    }
		}
	    }
	    int i_8_ = 192 * i_3_;
	    if (98048 < i_8_)
		i_8_ = 98048;
	    if (-32769 < (i_8_ ^ 0xffffffff))
		i_8_ = 32768;
	    if (Class14_Sub8_Sub38.anInt4740 >= i_8_) {
		if (i_8_ < Class14_Sub8_Sub38.anInt4740)
		    Class14_Sub8_Sub38.anInt4740
			+= (i_8_ + -Class14_Sub8_Sub38.anInt4740) / 80;
	    } else
		Class14_Sub8_Sub38.anInt4740
		    += (-Class14_Sub8_Sub38.anInt4740 + i_8_) / 24;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "eb.C(" + arg0 + ')');
	}
    }
    
    public static void method1085(int arg0) {
	try {
	    aShortArray580 = null;
	    if (arg0 != 108956743)
		method1084((byte) 52);
	    aClass2_583 = null;
	    aClass14_Sub9_Sub2_585 = null;
	    anIntArrayArray575 = null;
	    aClass124_578 = null;
	    aClass9_579 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "eb.E(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub16 method1086(byte[] arg0, int arg1) {
    while_709_:
	do {
	    do {
		Class14_Sub2_Sub16 class14_sub2_sub16;
		try {
		    anInt581++;
		    if (arg1 != 24)
			aBoolean584 = false;
		    if (arg0 != null)
			break;
		    class14_sub2_sub16 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_709_;
		}
		return class14_sub2_sub16;
	    } while (false);
	    Class14_Sub2_Sub16_Sub2 class14_sub2_sub16_sub2;
	    try {
		Class14_Sub2_Sub16_Sub2 class14_sub2_sub16_sub2_9_
		    = new Class14_Sub2_Sub16_Sub2(arg0, Class40.anIntArray675,
						  (Class14_Sub2_Sub12
						   .anIntArray3918),
						  Class17.anIntArray402,
						  Class76.anIntArray1204,
						  Class12.aByteArrayArray310);
		Class129.method1761((byte) 5);
		class14_sub2_sub16_sub2 = class14_sub2_sub16_sub2_9_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub16_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("eb.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1087(int arg0, int arg1, boolean arg2, int arg3,
				  Class9 arg4, int arg5) {
	try {
	    Class14_Sub2_Sub13.anInt3930 = arg1;
	    if (arg0 != 1936)
		anIntArrayArray575 = null;
	    Class14_Sub2_Sub11.anInt3889 = 1;
	    Class73.anInt1132 = arg5;
	    Class35.aBoolean593 = arg2;
	    Class14_Sub15.anInt2989 = 10000;
	    Class9_Sub1.aClass9_2696 = arg4;
	    Class38.anInt2624 = arg3;
	    anInt573++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("eb.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ')'));
	}
    }
    
    public static void method1088(byte arg0) {
	try {
	    anInt582++;
	    Class132.aClass55_2167 = new Class55(32);
	    if (arg0 != 127)
		method1088((byte) -62);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "eb.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass2_583 = new Class2();
    }
}
