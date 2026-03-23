/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class54
{
    public static volatile boolean aBoolean877 = false;
    public static int anInt878;
    public static boolean aBoolean879 = true;
    public static int anInt880;
    public static boolean aBoolean881 = false;
    public static int anInt882;
    public static Class124 aClass124_883
	= Class14_Sub2_Sub2.method263(1178, ")3google)3com");
    public static int anInt884;
    public static Class9 aClass9_885;
    public static Class124 aClass124_886
	= Class14_Sub2_Sub2.method263(1178, " )2> ");
    public static int anInt887 = 0;
    public static Class87 aClass87_888;
    public static int anInt889;
    
    public static Class124 method1217(Class94 arg0, int arg1) {
    while_826_:
	do {
	    do {
		Class124 class124;
		try {
		    if (arg1 > -97)
			method1218(-119, -82, -81);
		    anInt878++;
		    if (0 != Class44.method1158(client.method46(arg0), false))
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_826_;
		}
		return class124;
	    } while (false);
	while_825_:
	    do {
		do {
		    Class124 class124;
		    try {
			if (arg0.aClass124_1589 != null
			    && (arg0.aClass124_1589.method1684((byte) 9)
				    .method1693(0)
				^ 0xffffffff) != -1)
			    break while_825_;
			if (!Class125_Sub3.aBoolean3392)
			    break;
			class124 = Class14_Sub8_Sub31.aClass124_4607;
		    } catch (RuntimeException runtimeexception) {
			break while_826_;
		    }
		    return class124;
		} while (false);
		Class124 class124;
		try {
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_826_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = arg0.aClass124_1589;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("gk.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1218(int arg0, int arg1, int arg2) {
    while_828_:
	do {
	while_827_:
	    do {
		do {
		    try {
			anInt882++;
			if (2 <= Class14_Sub8_Sub38.anInt4729
			    || Class51.anInt831 != 0
			    || Class14_Sub4.aBoolean2784)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_827_;
		    }
		    return;
		} while (false);
		try {
		    Class124 class124;
		    if (-2 != (Class51.anInt831 ^ 0xffffffff)
			|| (Class14_Sub8_Sub38.anInt4729 ^ 0xffffffff) <= -3) {
			if (!Class14_Sub4.aBoolean2784
			    || 2 <= Class14_Sub8_Sub38.anInt4729)
			    class124
				= Class46.method1170((byte) -99,
						     -1 + (Class14_Sub8_Sub38
							   .anInt4729));
			else
			    class124
				= (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { Class125.aClass124_2082,
				       Class104.aClass124_1736,
				       Class17.aClass124_408,
				       Class14_Sub8_Sub5.aClass124_4165 }),
				    (byte) -42));
		    } else
			class124 = (Class14_Sub8_Sub7.method515
				    ((new Class124[]
				      { Class40.aClass124_665,
					Class104.aClass124_1736,
					Class14_Sub6.aClass124_2809,
					Class14_Sub8_Sub5.aClass124_4165 }),
				     (byte) -41));
		    if (2 < Class14_Sub8_Sub38.anInt4729)
			class124
			    = (Class14_Sub8_Sub7.method515
			       ((new Class124[]
				 { class124, Class115.aClass124_1906,
				   Class83.method1407(81, (Class14_Sub8_Sub38
							   .anInt4729) - 2),
				   Class14_Sub2_Sub14.aClass124_3948 }),
				(byte) -83));
		    int i = (Class133_Sub3.aClass14_Sub2_Sub16_3567.method350
			     (class124, 4 + arg0, arg2 - -15, 16777215, 0,
			      Class104.aRandom1732, Class32.anInt563));
		    if (arg1 > -44)
			method1220(-54, true, false, -79);
		    Class14_Sub13.method862(124,
					    i + Class133_Sub3
						    .aClass14_Sub2_Sub16_3567
						    .method361(class124),
					    15, arg2, arg0 - -4);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_828_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("gk.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static void method1219(int arg0) {
    while_830_:
	do {
	while_829_:
	    do {
		do {
		    try {
			aClass124_886 = null;
			aClass87_888 = null;
			aClass124_883 = null;
			if (arg0 > 38)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_829_;
		    }
		    return;
		} while (false);
		try {
		    aClass9_885 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_830_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "gk.A(" + arg0 + ')');
	} while (false);
    }
    
    public static Class124 method1220(int arg0, boolean arg1, boolean arg2,
				      int arg3) {
	Class124 class124;
	try {
	    anInt889++;
	    if ((arg3 ^ 0xffffffff) > -3 || -37 > (arg3 ^ 0xffffffff))
		throw new IllegalArgumentException("Invalid radix:" + arg3);
	    int i = arg0 / arg3;
	    int i_0_ = 1;
	    while (-1 != (i ^ 0xffffffff)) {
		i /= arg3;
		i_0_++;
	    }
	    int i_1_ = i_0_;
	    if ((arg0 ^ 0xffffffff) > -1 || arg2)
		i_1_++;
	    byte[] is = new byte[i_1_];
	    if (0 > arg0)
		is[0] = (byte) 45;
	    else if (arg2)
		is[0] = (byte) 43;
	    for (int i_2_ = 0; i_0_ > i_2_; i_2_++) {
		int i_3_ = arg0 % arg3;
		arg0 /= arg3;
		if (0 > i_3_)
		    i_3_ = -i_3_;
		if (i_3_ > 9)
		    i_3_ += 39;
		is[-1 + (-i_2_ + i_1_)] = (byte) (48 + i_3_);
	    }
	    Class124 class124_4_ = new Class124();
	    class124_4_.anInt2507 = i_1_;
	    class124_4_.aByteArray2495 = is;
	    if (arg1 != true)
		aClass124_886 = null;
	    class124 = class124_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gk.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return class124;
    }
    
    public static void method1221(int arg0, boolean arg1, int arg2) {
	try {
	    anInt884++;
	    if (arg1 != true)
		method1220(-109, false, false, -28);
	    for (int i = 0;
		 (Class131.anInt2159 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		Class150 class150 = Class97.method1489(i, -9810);
		if (class150 != null) {
		    int i_5_ = class150.anInt2414;
		    if (-1 >= (i_5_ ^ 0xffffffff)
			&& !Class3.anInterface3_117.method13(0, i_5_))
			i_5_ = -1;
		    int i_6_;
		    if (0 > class150.anInt2405) {
			if (i_5_ >= 0)
			    i_6_ = (Class3.anIntArray119
				    [(Class7_Sub3_Sub1.method135
				      (false, 96,
				       Class3.anInterface3_117
					   .method5(i_5_, (byte) -113)))]);
			else if (-1 != class150.anInt2411) {
			    int i_7_ = class150.anInt2411;
			    int i_8_ = arg0 + (i_7_ & 0x7f);
			    if (i_8_ < 0)
				i_8_ = 0;
			    else if (i_8_ > 127)
				i_8_ = 127;
			    int i_9_ = (i_8_ + (0x380 & i_7_)
					+ (0xfc00 & i_7_ + arg2));
			    i_6_ = (Class3.anIntArray119
				    [Class7_Sub3_Sub1.method135(false, 96,
								i_9_)]);
			} else
			    i_6_ = -1;
		    } else {
			int i_10_ = class150.anInt2405;
			int i_11_ = arg0 + (i_10_ & 0x7f);
			if (i_11_ < 0)
			    i_11_ = 0;
			else if ((i_11_ ^ 0xffffffff) < -128)
			    i_11_ = 127;
			int i_12_ = (i_11_ + (0xfc00 & arg2 + i_10_)
				     - -(0x380 & i_10_));
			i_6_
			    = (Class3.anIntArray119
			       [Class7_Sub3_Sub1.method135(false, 96, i_12_)]);
		    }
		    Class56.anIntArray917[1 + i] = i_6_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gk.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
}
