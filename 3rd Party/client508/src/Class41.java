/* Class41 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class41
{
    public static int anInt681;
    public boolean aBoolean682 = false;
    public static Class2 aClass2_683;
    public ByteBuffer aByteBuffer684;
    public static int anInt685;
    public int anInt686 = 0;
    public int anInt687 = 0;
    public static int anInt688;
    public static int anInt689;
    public static int anInt690;
    public static Class124 aClass124_691
	= Class14_Sub2_Sub2.method263(1178, "document)3cookie=(R");
    public Class29 aClass29_692;
    public static Class124 aClass124_693;
    public static Class124 aClass124_694;
    public static Class124 aClass124_695;
    public static int anInt696;
    public static Class124 aClass124_697;
    
    public static void method1128(byte arg0) {
    while_746_:
	do {
	while_745_:
	    do {
		do {
		    try {
			anInt689++;
			if (arg0 <= -41)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_745_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub6.aClass52_2817.method1203((byte) -86);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_746_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ek.F(" + arg0 + ')');
	} while (false);
    }
    
    public static Class46 method1129(int arg0, int arg1) {
    while_747_:
	do {
	    do {
		Class46 class46;
		try {
		    anInt688++;
		    Class46 class46_0_
			= ((Class46)
			   Class21.aClass52_444.method1210((byte) 67,
							   (long) arg0));
		    if (null == class46_0_)
			break;
		    class46 = class46_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_747_;
		}
		return class46;
	    } while (false);
	    Class46 class46;
	    try {
		byte[] is = (Class33.aClass9_579.method163
			     (Class36.method1103((byte) -128, arg0),
			      Class14_Sub21.method896(-115, arg0), 0));
		Class46 class46_1_ = new Class46();
		if (null != is)
		    class46_1_.method1179(new Class14_Sub10(is), (byte) 89);
		class46_1_.method1171(86);
		Class21.aClass52_444.method1205((byte) -93, class46_1_,
						(long) arg0);
		int i = 88 % ((-83 - arg1) / 36);
		class46 = class46_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class46;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ek.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1130(int arg0, int arg1) {
	try {
	    if (arg1 != 11300)
		aClass124_694 = null;
	    anInt681++;
	    Class21.aClass52_444.method1208((byte) -112, arg0);
	    Class14_Sub2_Sub12.aClass52_3894.method1208((byte) -112, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ek.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1131(int arg0) {
	try {
	    anInt685++;
	    int i
		= Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0, 8);
	    if (Class14_Sub10.anInt2878 > i) {
		for (int i_2_ = i; i_2_ < Class14_Sub10.anInt2878; i_2_++)
		    Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++]
			= Class14.anIntArray351[i_2_];
	    }
	    int i_3_ = 30 / ((arg0 - -24) / 54);
	    if (Class14_Sub10.anInt2878 < i)
		throw new RuntimeException("gppov1");
	    Class14_Sub10.anInt2878 = 0;
	    for (int i_4_ = 0; i_4_ < i; i_4_++) {
		int i_5_ = Class14.anIntArray351[i_4_];
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_5_];
		int i_6_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		if (0 == i_6_) {
		    Class14.anIntArray351[Class14_Sub10.anInt2878++] = i_5_;
		    class133_sub1_sub1.anInt3447
			= Class14_Sub2_Sub20.anInt4064;
		} else {
		    int i_7_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method842(0, 2);
		    if (i_7_ == 0) {
			Class14.anIntArray351[Class14_Sub10.anInt2878++]
			    = i_5_;
			class133_sub1_sub1.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++]
			    = i_5_;
		    } else if (i_7_ == 1) {
			Class14.anIntArray351[Class14_Sub10.anInt2878++]
			    = i_5_;
			class133_sub1_sub1.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			int i_8_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(0, 3);
			class133_sub1_sub1.method1799(false, (byte) -40, i_8_);
			int i_9_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(0, 1);
			if (-2 == (i_9_ ^ 0xffffffff))
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= i_5_;
		    } else if (i_7_ == 2) {
			Class14.anIntArray351[Class14_Sub10.anInt2878++]
			    = i_5_;
			class133_sub1_sub1.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			int i_10_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 3);
			class133_sub1_sub1.method1799(true, (byte) -119,
						      i_10_);
			int i_11_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 3);
			class133_sub1_sub1.method1799(true, (byte) 127, i_11_);
			int i_12_ = Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734
					.method842(0, 1);
			if ((i_12_ ^ 0xffffffff) == -2)
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= i_5_;
		    } else if (3 == i_7_)
			Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++]
			    = i_5_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ek.A(" + arg0 + ')');
	}
    }
    
    public static void method1132(int arg0) {
	try {
	    aClass124_691 = null;
	    aClass124_695 = null;
	    aClass2_683 = null;
	    aClass124_697 = null;
	    aClass124_693 = null;
	    aClass124_694 = null;
	    if (arg0 <= 104)
		aClass124_691 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ek.C(" + arg0 + ')');
	}
    }
    
    public static void method1133(byte arg0) {
	try {
	    int i = 35 % ((arg0 - 8) / 38);
	    Class21.aClass52_444.method1203((byte) -80);
	    anInt690++;
	    Class14_Sub2_Sub12.aClass52_3894.method1203((byte) -88);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ek.E(" + arg0 + ')');
	}
    }
    
    static {
	aClass2_683 = new Class2();
	aClass124_693 = Class14_Sub2_Sub2.method263(1178, "M");
	aClass124_694 = aClass124_693;
	aClass124_695 = aClass124_693;
	anInt696 = 0;
	aClass124_697 = Class14_Sub2_Sub2.method263(1178, "sl_stars");
    }
}
