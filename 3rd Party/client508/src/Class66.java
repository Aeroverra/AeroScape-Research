/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class66
{
    public int anInt1035;
    public static int anInt1036;
    public static Class124 aClass124_1037
	= Class14_Sub2_Sub2.method263(1178, ":clan:");
    public int anInt1038;
    public static int anInt1039 = -1;
    public static int anInt1040;
    public int anInt1041;
    public static Class124 aClass124_1042
	= Class14_Sub2_Sub2.method263(1178, "Mem:");
    public int anInt1043 = -1;
    public int anInt1044;
    public static int anInt1045;
    public int anInt1046;
    public int anInt1047;
    public static int anInt1048;
    public int anInt1049;
    public static int[][][] anIntArrayArrayArray1050;
    public int anInt1051;
    
    public static void method1293(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    Class51.method1201(Class14_Sub2_Sub19.anIntArrayArray4038[arg0],
			       -arg2 + arg1, arg1 - -arg2, -5973, arg5);
	    anInt1048++;
	    int i = 0;
	    int i_0_ = arg2 * arg2;
	    int i_1_ = arg4;
	    int i_2_ = arg4 * arg4;
	    int i_3_ = i_2_ << -1080500031;
	    int i_4_ = i_0_ << 914683937;
	    int i_5_ = 64 % ((85 - arg3) / 32);
	    int i_6_ = arg4 << -597398239;
	    int i_7_ = (1 + -i_6_) * i_0_ + i_3_;
	    int i_8_ = i_0_ << 67691650;
	    int i_9_ = i_2_ + -((-1 + i_6_) * i_4_);
	    int i_10_ = i_2_ << -1435794046;
	    int i_11_ = (-3 + (i_1_ << -1883771167)) * i_4_;
	    int i_12_ = (3 + (i << -1492830207)) * i_3_;
	    int i_13_ = (1 + i) * i_10_;
	    int i_14_ = (i_1_ - 1) * i_8_;
	    while (0 < i_1_) {
		i_1_--;
		if (0 > i_7_) {
		    while (i_7_ < 0) {
			i_7_ += i_12_;
			i_12_ += i_10_;
			i_9_ += i_13_;
			i_13_ += i_10_;
			i++;
		    }
		}
		if (-1 < (i_9_ ^ 0xffffffff)) {
		    i_9_ += i_13_;
		    i_7_ += i_12_;
		    i_13_ += i_10_;
		    i_12_ += i_10_;
		    i++;
		}
		int i_15_ = arg0 + -i_1_;
		i_7_ += -i_14_;
		i_9_ += -i_11_;
		i_14_ -= i_8_;
		i_11_ -= i_8_;
		int i_16_ = arg0 + i_1_;
		int i_17_ = i + arg1;
		int i_18_ = arg1 - i;
		Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
				    [i_15_]),
				   i_18_, i_17_, -5973, arg5);
		Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
				    [i_16_]),
				   i_18_, i_17_, -5973, arg5);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ih.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static int method1294(int arg0, int arg1) {
	int i;
	try {
	    i = arg0 | arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ih.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method1295(int arg0) {
	try {
	    anIntArrayArrayArray1050 = null;
	    if (arg0 != -597398239)
		method1295(-108);
	    aClass124_1042 = null;
	    aClass124_1037 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ih.C(" + arg0 + ')');
	}
    }
    
    public static void method1296(int arg0, int arg1, int arg2, int arg3) {
	Class14_Sub14.aClass14_Sub29ArrayArrayArray2987
	    = new Class14_Sub29[arg0][arg1][arg2];
	Class149.anIntArrayArrayArray2391 = new int[arg0][arg1 + 1][arg2 + 1];
	Class14_Sub30.aClass14_Sub27ArrayArray3273 = new Class14_Sub27[4][];
	Class14_Sub8_Sub28.method627(false);
	Class99_Sub2.anInt3338 = arg1;
	Class14_Sub8_Sub15.anInt4337 = arg2;
	Class14_Sub1.anIntArrayArrayArray2724
	    = new int[arg0][arg1 + 1][arg2 + 1];
	Class56.method1240();
	Class73.anInt1108 = arg3;
	Class53.aBooleanArrayArray873
	    = (new boolean[Class73.anInt1108 + Class73.anInt1108 + 1]
	       [Class73.anInt1108 + Class73.anInt1108 + 1]);
	Class14_Sub8_Sub3.aBooleanArrayArray4138
	    = (new boolean[Class73.anInt1108 + Class73.anInt1108 + 2]
	       [Class73.anInt1108 + Class73.anInt1108 + 2]);
    }
    
    public static void method1297(int arg0, Class12 arg1, int arg2, int arg3,
				  byte arg4) {
    while_878_:
	do {
	while_877_:
	    do {
		do {
		    try {
			anInt1040++;
			if (Class14_Sub8_Sub38.anInt4729 < 400)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_877_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (null != arg1.anIntArray329)
			    arg1 = arg1.method217((byte) -18);
			if (null != arg1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_877_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg4 >= 76)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_877_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg1.aBoolean308)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_877_;
		    }
		    return;
		} while (false);
		try {
		    Class124 class124 = arg1.aClass124_302;
		    if (-1 != (arg1.anInt295 ^ 0xffffffff))
			class124
			    = (Class14_Sub8_Sub7.method515
			       ((new Class124[]
				 { class124,
				   (Class153.method2047
				    (1, (Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .anInt4937), arg1.anInt295)),
				   Class14_Sub8_Sub17.aClass124_4360,
				   Class48.aClass124_797,
				   Class83.method1407(76, arg1.anInt295),
				   Class14_Sub8_Sub27.aClass124_4552 }),
				(byte) -28));
		    if ((Class51.anInt831 ^ 0xffffffff) != -2) {
			if (!Class14_Sub4.aBoolean2784) {
			    Class14.anInt353++;
			    Class124[] class124s = arg1.aClass124Array291;
			    if (Class49.aBoolean814)
				class124s = Class106.method1545(5, class124s);
			    if (null != class124s) {
				for (int i = 4; (i ^ 0xffffffff) <= -1; i--) {
				    if (null != class124s[i]
					&& (Class14_Sub2_Sub1.anInt3749 != 0
					    || !(class124s[i].method1717
						 (40,
						  Class118.aClass124_1973)))) {
					Class36.anInt610++;
					short i_19_ = 0;
					if (-1 == (i ^ 0xffffffff))
					    i_19_ = (short) 2;
					if (i == 1)
					    i_19_ = (short) 11;
					if ((i ^ 0xffffffff) == -3)
					    i_19_ = (short) 31;
					if (i == 3)
					    i_19_ = (short) 14;
					if (4 == i)
					    i_19_ = (short) 50;
					Class14_Sub11.method853
					    (32, class124s[i], arg0,
					     (Class14_Sub8_Sub7.method515
					      ((new Class124[]
						{ (Class14_Sub8_Sub36
						   .aClass124_4694),
						  class124 }),
					       (byte) -93)),
					     i_19_, (long) arg3, arg2);
				    }
				}
			    }
			    if (-1 == (Class14_Sub2_Sub1.anInt3749
				       ^ 0xffffffff)
				&& null != class124s) {
				for (int i = 4; -1 >= (i ^ 0xffffffff); i--) {
				    if (null != class124s[i]
					&& (class124s[i].method1717
					    (40, Class118.aClass124_1973))) {
					short i_20_ = 0;
					short i_21_ = 0;
					if ((Class14_Sub3
					     .aClass133_Sub1_Sub1_2748
					     .anInt4937)
					    < arg1.anInt295)
					    i_20_ = (short) 2000;
					Class14_Sub2_Sub3.anInt3776++;
					if (i == 0)
					    i_21_ = (short) 2;
					if ((i ^ 0xffffffff) == -2)
					    i_21_ = (short) 11;
					if (2 == i)
					    i_21_ = (short) 31;
					if (-4 == (i ^ 0xffffffff))
					    i_21_ = (short) 14;
					if (-5 == (i ^ 0xffffffff))
					    i_21_ = (short) 50;
					if ((i_21_ ^ 0xffffffff) != -1)
					    i_21_ += i_20_;
					Class14_Sub11.method853
					    (32, class124s[i], arg0,
					     (Class14_Sub8_Sub7.method515
					      ((new Class124[]
						{ (Class14_Sub8_Sub36
						   .aClass124_4694),
						  class124 }),
					       (byte) -97)),
					     i_21_, (long) arg3, arg2);
				    }
				}
			    }
			    Class14_Sub11.method853
				(32, Class14_Sub5.aClass124_2802, arg0,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class14_Sub8_Sub36.aClass124_4694,
				      class124 }),
				   (byte) -96)),
				 (short) 1002, (long) arg3, arg2);
			} else if (2 == (0x2 & Class2.anInt101)) {
			    Class14_Sub11.method853
				(32, Class125.aClass124_2082, arg0,
				 (Class14_Sub8_Sub7.method515
				  ((new Class124[]
				    { Class17.aClass124_408,
				      Class14_Sub2_Sub1.aClass124_3724,
				      class124 }),
				   (byte) -83)),
				 (short) 34, (long) arg3, arg2);
			    Class37.anInt639++;
			}
		    } else {
			Class14_Sub30.anInt3277++;
			Class14_Sub11.method853
			    (32, Class40.aClass124_665, arg0,
			     Class14_Sub8_Sub7.method515((new Class124[]
							  { (Class14_Sub6
							     .aClass124_2809),
							    (Class14_Sub2_Sub1
							     .aClass124_3724),
							    class124 }),
							 (byte) -123),
			     (short) 30, (long) arg3, arg2);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_878_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ih.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
}
