/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class60
{
    public short[] aShortArray961;
    public int anInt962;
    public int anInt963 = 128;
    public int anInt964;
    public int anInt965;
    public int anInt966;
    public static long[] aLongArray967 = new long[256];
    public short[] aShortArray968;
    public int anInt969;
    public static int anInt970;
    public short[] aShortArray971;
    public static int anInt972;
    public int anInt973 = 0;
    public static int anInt974;
    public static int anInt975;
    public static int anInt976;
    public int anInt977;
    public boolean aBoolean978;
    public static int anInt979;
    public static Class94[] aClass94Array980;
    public short[] aShortArray981;
    public static Class124 aClass124_982;
    public static boolean aBoolean983;
    public static int anInt984;
    public static Class124 aClass124_985;
    
    public static void method1264(int arg0) {
	try {
	    anInt972++;
	    Class127.aClass52_2112.method1203((byte) -87);
	    int i = -21 / ((69 - arg0) / 37);
	    Class112.aClass52_1868.method1203((byte) -85);
	    Class62.aClass52_991.method1203((byte) -103);
	    Class49.aClass52_810.method1203((byte) -95);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hf.F(" + arg0 + ')');
	}
    }
    
    public static boolean method1265(byte arg0, int arg1, byte[] arg2,
				     int arg3) {
	boolean bool;
	try {
	    anInt974++;
	    Class14_Sub10 class14_sub10 = new Class14_Sub10(arg2);
	    int i = -1;
	    boolean bool_0_ = true;
	    for (;;) {
		int i_1_ = class14_sub10.method802(-116);
		if ((i_1_ ^ 0xffffffff) == -1)
		    break;
		i += i_1_;
		int i_2_ = 0;
		boolean bool_3_ = false;
		for (;;) {
		    if (bool_3_) {
			int i_4_ = class14_sub10.method818((byte) 80);
			if (i_4_ == 0)
			    break;
			class14_sub10.method798(-109);
		    } else {
			int i_5_ = class14_sub10.method818((byte) -103);
			if (-1 == (i_5_ ^ 0xffffffff))
			    break;
			i_2_ += -1 + i_5_;
			int i_6_ = i_2_ >> -1134363546 & 0x3f;
			int i_7_ = class14_sub10.method798(-25) >> 768620034;
			int i_8_ = 0x3f & i_2_;
			int i_9_ = arg3 + i_6_;
			int i_10_ = arg1 + i_8_;
			if ((i_9_ ^ 0xffffffff) < -1
			    && (i_10_ ^ 0xffffffff) < -1 && 103 > i_9_
			    && (i_10_ ^ 0xffffffff) > -104) {
			    Class79 class79
				= Class79.method1377((byte) -106, i);
			    if (22 != i_7_ || Class148.aBoolean2372
				|| 0 != class79.anInt1250
				|| (class79.anInt1229 ^ 0xffffffff) == -2
				|| class79.aBoolean1228) {
				if (!class79.method1379(120)) {
				    bool_0_ = false;
				    Class149.anInt2383++;
				}
				bool_3_ = true;
			    }
			}
		    }
		}
	    }
	    int i_11_ = 23 % ((67 - arg0) / 39);
	    bool = bool_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hf.E(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
	return bool;
    }
    
    public void method1266(Class14_Sub10 arg0, int arg1, boolean arg2) {
	try {
	    if ((arg1 ^ 0xffffffff) != -2) {
		if (-3 != (arg1 ^ 0xffffffff)) {
		    if (arg1 == 4)
			anInt963 = arg0.method784((byte) 108);
		    else if (5 != arg1) {
			if (6 != arg1) {
			    if (arg1 == 7)
				anInt973 = arg0.method798(95);
			    else if (8 == arg1)
				anInt969 = arg0.method798(88);
			    else if ((arg1 ^ 0xffffffff) != -10) {
				if (-41 != (arg1 ^ 0xffffffff)) {
				    if (arg1 == 41) {
					int i = arg0.method798(86);
					aShortArray968 = new short[i];
					aShortArray971 = new short[i];
					for (int i_12_ = 0; i > i_12_;
					     i_12_++) {
					    aShortArray968[i_12_]
						= (short) (arg0.method784
							   ((byte) 115));
					    aShortArray971[i_12_]
						= (short) (arg0.method784
							   ((byte) 111));
					}
				    }
				} else {
				    int i = arg0.method798(-62);
				    aShortArray961 = new short[i];
				    aShortArray981 = new short[i];
				    for (int i_13_ = 0;
					 ((i ^ 0xffffffff)
					  < (i_13_ ^ 0xffffffff));
					 i_13_++) {
					aShortArray981[i_13_]
					    = (short) (arg0.method784
						       ((byte) 104));
					aShortArray961[i_13_]
					    = (short) (arg0.method784
						       ((byte) 121));
				    }
				}
			    } else
				aBoolean978 = true;
			} else
			    anInt964 = arg0.method784((byte) 101);
		    } else
			anInt965 = arg0.method784((byte) 118);
		} else
		    anInt966 = arg0.method784((byte) 124);
	    } else
		anInt977 = arg0.method784((byte) 105);
	    anInt975++;
	    if (arg2)
		method1269((byte) 23);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hf.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public Class133_Sub7 method1267(int arg0, int arg1) {
    while_859_:
	do {
	    Class133_Sub7 class133_sub7;
	while_858_:
	    do {
		Class133_Sub2 class133_sub2;
		do {
		    Class133_Sub7 class133_sub7_14_;
		    try {
			anInt970++;
			class133_sub7
			    = ((Class133_Sub7)
			       Class14_Sub2_Sub19.aClass52_4053
				   .method1210((byte) 92, (long) anInt962));
			if (null != class133_sub7)
			    break while_858_;
			class133_sub2
			    = Class133_Sub2.method1824((Class14_Sub1
							.aClass9_2711),
						       anInt977, 0);
			if (class133_sub2 != null)
			    break;
			class133_sub7_14_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_859_;
		    }
		    return class133_sub7_14_;
		} while (false);
		try {
		    if (aShortArray981 != null) {
			for (int i = 0; i < aShortArray981.length; i++)
			    class133_sub2.method1813(aShortArray981[i],
						     aShortArray961[i]);
		    }
		    if (aShortArray968 != null) {
			for (int i = 0; i < aShortArray968.length; i++)
			    class133_sub2.method1819(aShortArray968[i],
						     aShortArray971[i]);
		    }
		    class133_sub7 = class133_sub2.method1827(anInt973 + 64,
							     850 + anInt969,
							     -30, -50, -30);
		    Class14_Sub2_Sub19.aClass52_4053.method1205
			((byte) -93, class133_sub7, (long) anInt962);
		} catch (RuntimeException runtimeexception) {
		    break while_859_;
		}
	    } while (false);
	    Class133_Sub7 class133_sub7_15_;
	    if (0 != (anInt966 ^ 0xffffffff) && (arg1 ^ 0xffffffff) != 0)
		class133_sub7_15_
		    = Class41.method1129(anInt966, -125)
			  .method1173(arg1, 65535, class133_sub7);
	    else
		class133_sub7_15_ = class133_sub7.method1870(true, true);
	    if (anInt963 != 128 || -129 != (anInt965 ^ 0xffffffff))
		class133_sub7_15_.method1869(anInt963, anInt965, anInt963);
	    if (anInt964 != arg0) {
		if ((anInt964 ^ 0xffffffff) == -91)
		    class133_sub7_15_.method1871();
		if (-181 == (anInt964 ^ 0xffffffff))
		    class133_sub7_15_.method1872();
		if (270 == anInt964)
		    class133_sub7_15_.method1875();
	    }
	    return class133_sub7_15_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "hf.G(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method1268(int arg0, Class14_Sub10 arg1) {
    while_861_:
	do {
	while_860_:
	    do {
		do {
		    try {
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_860_;
		    }
		    return;
		} while (false);
		try {
		    anInt976++;
		    for (;;) {
			int i = arg1.method798(-99);
			if (i == 0)
			    break;
			method1266(arg1, i, false);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_861_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("hf.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method1269(byte arg0) {
    while_863_:
	do {
	while_862_:
	    do {
		do {
		    try {
			aClass124_985 = null;
			aClass94Array980 = null;
			aClass124_982 = null;
			if (arg0 == 4)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_862_;
		    }
		    return;
		} while (false);
		try {
		    aLongArray967 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_863_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hf.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1270(int arg0, byte arg1) {
	try {
	    if (arg1 != 46)
		method1264(-75);
	    anInt979++;
	    Class14_Sub8_Sub5.aClass2_4163.method80(new Class14_Sub1(arg0),
						    (byte) -126);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hf.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class60() {
	anInt964 = 0;
	anInt969 = 0;
	anInt965 = 128;
	aBoolean978 = false;
	anInt966 = -1;
    }
    
    static {
	for (int i = 0; (i ^ 0xffffffff) > -257; i++) {
	    long l = (long) i;
	    for (int i_16_ = 0; (i_16_ ^ 0xffffffff) > -9; i_16_++) {
		if (-2L == (0x1L & l ^ 0xffffffffffffffffL))
		    l = l >>> -428430463 ^ ~0x3693a86a2878f0bdL;
		else
		    l >>>= 1;
	    }
	    aLongArray967[i] = l;
	}
	aClass124_982 = Class14_Sub2_Sub2.method263(1178, " loggt sich aus)3");
	aBoolean983 = true;
	aClass124_985 = Class14_Sub2_Sub2.method263(1178, "Card:");
    }
}
