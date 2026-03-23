/* Class14_Sub2_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;

public class Class14_Sub2_Sub15 extends Class14_Sub2
{
    public static int anInt3950;
    public Class143[] aClass143Array3951;
    public static int anInt3952 = 0;
    public static int anInt3953;
    public static int anInt3954;
    public static int[] anIntArray3955;
    public static Class124 aClass124_3956;
    public static int anInt3957 = 0;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3958;
    public static Class124[] aClass124Array3959;
    public static int anInt3960;
    public static int anInt3961;
    public static Frame aFrame3962;
    public static int anInt3963;
    public static float[] aFloatArray3964;
    public static int[] anIntArray3965;
    
    public boolean method338(byte arg0, int arg1) {
	boolean bool;
	try {
	    if (arg0 < 105)
		method338((byte) -108, -102);
	    anInt3961++;
	    bool = aClass143Array3951[arg1].aBoolean2332;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("na.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public static void method339(int arg0) {
	try {
	    anIntArray3955 = null;
	    aClass124_3956 = null;
	    aFloatArray3964 = null;
	    anIntArray3965 = null;
	    aFrame3962 = null;
	    aClass124Array3959 = null;
	    if (arg0 != 15121)
		method339(59);
	    aClass14_Sub2_Sub19Array3958 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "na.A(" + arg0 + ')');
	}
    }
    
    public static void method340(Class94[] arg0, boolean arg1, int arg2,
				 int arg3, byte arg4, int arg5) {
	try {
	    anInt3963++;
	    int i = -33 % ((54 - arg4) / 49);
	    for (int i_0_ = 0;
		 (arg0.length ^ 0xffffffff) < (i_0_ ^ 0xffffffff); i_0_++) {
		Class94 class94 = arg0[i_0_];
		if (null != class94 && arg2 == class94.anInt1540) {
		    Class14_Sub21.method894(class94, 1, arg1, arg3, arg5);
		    Class118.method1607(1, arg5, arg3, class94);
		    if ((class94.anInt1547 ^ 0xffffffff)
			< (-class94.anInt1545 + class94.anInt1605
			   ^ 0xffffffff))
			class94.anInt1547
			    = class94.anInt1605 + -class94.anInt1545;
		    if (0 > class94.anInt1547)
			class94.anInt1547 = 0;
		    if (-class94.anInt1518 + class94.anInt1544
			< class94.anInt1490)
			class94.anInt1490
			    = -class94.anInt1518 + class94.anInt1544;
		    if (0 > class94.anInt1490)
			class94.anInt1490 = 0;
		    if (0 == class94.anInt1489)
			Class14_Sub2_Sub21.method445(class94, 18559, arg1);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("na.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ')'));
	}
    }
    
    public static Class94 method341(int arg0, Class94 arg1) {
    while_214_:
	do {
	    do {
		Class94 class94;
		try {
		    if (arg0 == 0)
			break;
		    class94 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_214_;
		}
		return class94;
	    } while (false);
	    Class94 class94;
	    try {
		anInt3950++;
		Class94 class94_1_ = client.method57(arg1);
		if (class94_1_ == null)
		    class94_1_ = arg1.aClass94_1492;
		class94 = class94_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class94;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("na.D(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public Class14_Sub2_Sub15(Class9 arg0, Class9 arg1, int arg2,
			      boolean arg3) {
	try {
	    Class2 class2 = new Class2();
	    int i = arg0.method177(arg2, 13537);
	    aClass143Array3951 = new Class143[i];
	    int[] is = arg0.method176((byte) 45, arg2);
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (is.length ^ 0xffffffff);
		 i_2_++) {
		Class14_Sub5 class14_sub5 = null;
		byte[] is_3_ = arg0.method163(is[i_2_], arg2, 0);
		int i_4_ = is_3_[1] & 0xff | 0xff00 & is_3_[0] << 7242568;
		for (Class14_Sub5 class14_sub5_5_
			 = (Class14_Sub5) class2.method77(0);
		     null != class14_sub5_5_;
		     class14_sub5_5_ = (Class14_Sub5) class2.method84(-106)) {
		    if (class14_sub5_5_.anInt2805 == i_4_) {
			class14_sub5 = class14_sub5_5_;
			break;
		    }
		}
		if (class14_sub5 == null) {
		    byte[] is_6_;
		    if (!arg3)
			is_6_ = arg1.method157(0, i_4_, 20983);
		    else
			is_6_ = arg1.method157(i_4_, 0, 20983);
		    class14_sub5 = new Class14_Sub5(i_4_, is_6_);
		    class2.method80(class14_sub5, (byte) -124);
		}
		aClass143Array3951[is[i_2_]]
		    = new Class143(is_3_, class14_sub5);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("na.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
    }
    
    static {
	aClass124_3956 = Class14_Sub2_Sub2.method263(1178, "underlay");
	aClass124Array3959 = new Class124[200];
	aFloatArray3964 = new float[4];
	anIntArray3965 = new int[32768];
    }
}
