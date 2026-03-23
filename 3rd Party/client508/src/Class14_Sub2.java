/* Class14_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2 extends Class14
{
    public static int anInt2725;
    public static int anInt2726;
    public static int[] anIntArray2727;
    public Class14_Sub2 aClass14_Sub2_2728;
    public static int anInt2729;
    public static Class124 aClass124_2730
	= Class14_Sub2_Sub2.method263(1178, "(R");
    public static int[] anIntArray2731
	= { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
    public static int anInt2732;
    public static Class55 aClass55_2733;
    public static int anInt2734;
    public static int anInt2735;
    public static boolean aBoolean2736;
    public long aLong2737;
    public Class14_Sub2 aClass14_Sub2_2738;
    public static int anInt2739;
    public static int anInt2740;
    public static int anInt2741;
    public static Class14_Sub10[] aClass14_Sub10Array2742;
    public static int anInt2743;
    public static int anInt2744;
    
    public static void method241(int arg0, Class14_Sub10 arg1) {
    while_135_:
	do {
	while_134_:
	    do {
		do {
		    try {
			if (arg0 == 11075)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_134_;
		    }
		    return;
		} while (false);
		try {
		    anInt2732++;
		    while ((arg1.aByteArray2895.length ^ 0xffffffff)
			   < (arg1.anInt2908 ^ 0xffffffff)) {
			boolean bool = false;
			int i = 0;
			int i_0_ = 0;
			if (arg1.method798(73) == 1) {
			    bool = true;
			    i = arg1.method798(58);
			    i_0_ = arg1.method798(126);
			}
			int i_1_ = arg1.method798(102);
			int i_2_ = arg1.method798(106);
			int i_3_ = (-(i_2_ * 64)
				    - (-Class35.anInt603
				       - Class14_Sub8_Sub15.anInt4332 - -1));
			int i_4_ = -Class65.anInt1034 + i_1_ * 64;
			if (0 <= i_4_ && -1 >= (i_3_ + -63 ^ 0xffffffff)
			    && ((i_4_ - -63 ^ 0xffffffff)
				> (Class14_Sub2_Sub9.anInt3856 ^ 0xffffffff))
			    && Class14_Sub8_Sub15.anInt4332 > i_3_) {
			    int i_5_ = i_4_ >> 425470470;
			    int i_6_ = i_3_ >> 1439534086;
			    for (int i_7_ = 0; 64 > i_7_; i_7_++) {
				for (int i_8_ = 0; i_8_ < 64; i_8_++) {
				    if (!bool
					|| (((i_7_ ^ 0xffffffff)
					     <= (i * 8 ^ 0xffffffff))
					    && ((8 * i + 8 ^ 0xffffffff)
						< (i_7_ ^ 0xffffffff))
					    && ((i_8_ ^ 0xffffffff)
						<= (8 * i_0_ ^ 0xffffffff))
					    && ((8 * i_0_ - -8 ^ 0xffffffff)
						< (i_8_ ^ 0xffffffff)))) {
					byte i_9_ = arg1.method780((byte) -77);
					if (-1 != (i_9_ ^ 0xffffffff)) {
					    if (null
						== (Class14_Sub2_Sub5
						    .aByteArrayArrayArray3816
						    [i_5_][i_6_]))
						Class14_Sub2_Sub5
						    .aByteArrayArrayArray3816
						    [i_5_][i_6_]
						    = new byte[4096];
					    Class14_Sub2_Sub5
						.aByteArrayArrayArray3816[i_5_]
						[i_6_]
						[i_7_ + (63 + -i_8_
							 << -1881773274)]
						= i_9_;
					    byte i_10_
						= arg1.method780((byte) -77);
					    if (null
						== (Class86
						    .aByteArrayArrayArray1383
						    [i_5_][i_6_]))
						Class86
						    .aByteArrayArrayArray1383
						    [i_5_][i_6_]
						    = new byte[4096];
					    Class86
						.aByteArrayArrayArray1383[i_5_]
						[i_6_]
						[i_7_ + (-i_8_ + 63
							 << 1993086854)]
						= i_10_;
					}
				    }
				}
			    }
			} else {
			    for (int i_11_ = 0; (!bool ? 4096 : 64) > i_11_;
				 i_11_++) {
				byte i_12_ = arg1.method780((byte) -77);
				if ((i_12_ ^ 0xffffffff) != -1)
				    arg1.anInt2908++;
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_135_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ci.NA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method242(int arg0, int arg1) {
	try {
	    anInt2744++;
	    Class133_Sub6.anInt3659 = arg1;
	    Class14_Sub18.anInt3050 = arg0;
	    Class14_Sub18.anInt3050 = -1;
	    Class39.method1126((byte) -22);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ci.OA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static Class14_Sub2_Sub19[] method243(byte arg0) {
    while_136_:
	do {
	    Class14_Sub2_Sub19[] class14_sub2_sub19s;
	    do {
		Class14_Sub2_Sub19[] class14_sub2_sub19s_13_;
		try {
		    anInt2735++;
		    class14_sub2_sub19s
			= new Class14_Sub2_Sub19[Class32.anInt547];
		    if (arg0 == 39)
			break;
		    class14_sub2_sub19s_13_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_136_;
		}
		return class14_sub2_sub19s_13_;
	    } while (false);
	    Class14_Sub2_Sub19[] class14_sub2_sub19s_14_;
	    try {
		for (int i = 0;
		     (Class32.anInt547 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    byte[] is = Class12.aByteArrayArray310[i];
		    int i_15_
			= Class17.anIntArray402[i] * Class76.anIntArray1204[i];
		    if (Class125_Sub4.aBooleanArray3416[i]) {
			byte[] is_16_ = Class98.aByteArrayArray1667[i];
			int[] is_17_ = new int[i_15_];
			for (int i_18_ = 0;
			     (i_18_ ^ 0xffffffff) > (i_15_ ^ 0xffffffff);
			     i_18_++)
			    is_17_[i_18_]
				= (Class66.method1294
				   ((Class73.anIntArray1114
				     [Class14_Sub8_Sub26.method617(is[i_18_],
								   255)]),
				    (Class14_Sub8_Sub26.method617
				     (-16777216,
				      is_16_[i_18_] << -51070952))));
			class14_sub2_sub19s[i]
			    = (new Class14_Sub2_Sub19_Sub2_Sub1
			       (Class14_Sub11.anInt2952,
				Class14_Sub30.anInt3279,
				Class40.anIntArray675[i],
				Class14_Sub2_Sub12.anIntArray3918[i],
				Class17.anIntArray402[i],
				Class76.anIntArray1204[i], is_17_));
		    } else {
			int[] is_19_ = new int[i_15_];
			for (int i_20_ = 0; i_15_ > i_20_; i_20_++)
			    is_19_[i_20_]
				= (Class73.anIntArray1114
				   [Class14_Sub8_Sub26.method617(255,
								 is[i_20_])]);
			class14_sub2_sub19s[i]
			    = (new Class14_Sub2_Sub19_Sub2
			       (Class14_Sub11.anInt2952,
				Class14_Sub30.anInt3279,
				Class40.anIntArray675[i],
				Class14_Sub2_Sub12.anIntArray3918[i],
				Class17.anIntArray402[i],
				Class76.anIntArray1204[i], is_19_));
		    }
		}
		Class129.method1761((byte) 19);
		class14_sub2_sub19s_14_ = class14_sub2_sub19s;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19s_14_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ci.IA(" + arg0 + ')');
    }
    
    public static int method244(int arg0) {
	int i;
	try {
	    if (arg0 < 29)
		anInt2734 = 44;
	    anInt2729++;
	    i = Class14_Sub8_Sub31.anInt4602;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ci.LA(" + arg0 + ')');
	}
	return i;
    }
    
    public static void method245(int arg0, byte arg1) {
	try {
	    int i = 75 % ((arg1 - 14) / 46);
	    anInt2743++;
	    Class97 class97 = Class67.aClass97_1055;
	    synchronized (class97) {
		Class14_Sub8_Sub31.anInt4602 = arg0;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ci.MA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method246(int arg0) {
    while_138_:
	do {
	while_137_:
	    do {
		do {
		    try {
			anInt2740++;
			if (null != aClass14_Sub2_2728)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_137_;
		    }
		    return;
		} while (false);
		try {
		    aClass14_Sub2_2728.aClass14_Sub2_2738 = aClass14_Sub2_2738;
		    if (arg0 != -26366)
			method243((byte) 54);
		    aClass14_Sub2_2738.aClass14_Sub2_2728 = aClass14_Sub2_2728;
		    aClass14_Sub2_2738 = null;
		    aClass14_Sub2_2728 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_138_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ci.KA(" + arg0 + ')');
	} while (false);
    }
    
    public static void method247(byte arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    int i = -102 / ((-67 - arg0) / 57);
	    anInt2739++;
	    int i_21_ = arg1;
	    int i_22_ = 0;
	    Class51.method1201(Class14_Sub2_Sub19.anIntArrayArray4038[arg3],
			       -arg1 + arg2, arg2 + arg1, -5973, arg4);
	    int i_23_ = -arg1;
	    int i_24_ = -1;
	    while (i_22_ < i_21_) {
		i_24_ += 2;
		i_22_++;
		i_23_ += i_24_;
		if ((i_23_ ^ 0xffffffff) <= -1) {
		    i_21_--;
		    int[] is = (Class14_Sub2_Sub19.anIntArrayArray4038
				[arg3 - -i_21_]);
		    int[] is_25_ = (Class14_Sub2_Sub19.anIntArrayArray4038
				    [-i_21_ + arg3]);
		    i_23_ -= i_21_ << 1821516641;
		    int i_26_ = arg2 + -i_22_;
		    int i_27_ = arg2 + i_22_;
		    Class51.method1201(is, i_26_, i_27_, -5973, arg4);
		    Class51.method1201(is_25_, i_26_, i_27_, -5973, arg4);
		}
		int i_28_ = arg2 - -i_21_;
		int i_29_ = arg2 + -i_21_;
		int[] is
		    = Class14_Sub2_Sub19.anIntArrayArray4038[i_22_ + arg3];
		int[] is_30_
		    = Class14_Sub2_Sub19.anIntArrayArray4038[arg3 + -i_22_];
		Class51.method1201(is, i_29_, i_28_, -5973, arg4);
		Class51.method1201(is_30_, i_29_, i_28_, -5973, arg4);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ci.JA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method248(int arg0) {
    while_140_:
	do {
	while_139_:
	    do {
		do {
		    try {
			if (arg0 == 32)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_139_;
		    }
		    return;
		} while (false);
		try {
		    aClass55_2733 = null;
		    aClass14_Sub10Array2742 = null;
		    anIntArray2731 = null;
		    anIntArray2727 = null;
		    aClass124_2730 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_140_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ci.PA(" + arg0 + ')');
	} while (false);
    }
    
    static {
	anInt2726 = 0;
	anInt2725 = 0;
	anInt2734 = -2;
	anIntArray2727 = new int[32];
	aClass14_Sub10Array2742 = new Class14_Sub10[2048];
	aBoolean2736 = false;
    }
}
