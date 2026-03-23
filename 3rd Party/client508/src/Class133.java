/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public abstract class Class133
{
    public static int anInt2173;
    public static int anInt2174;
    public static Class124 aClass124_2175
	= Class14_Sub2_Sub2.method263(1178, "Spieler");
    public static int[] anIntArray2176 = new int[100];
    public static int anInt2177;
    public static int anInt2178;
    public static int[] anIntArray2179
	= { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
    public static int anInt2180;
    public static int anInt2181;
    public static int anInt2182;
    public static Class124 aClass124_2183;
    public static int anInt2184;
    public static int anInt2185;
    public static Class14_Sub2_Sub19_Sub1[] aClass14_Sub2_Sub19_Sub1Array2186;
    public static int anInt2187;
    public static Class124 aClass124_2188
	= Class14_Sub2_Sub2.method263(1178, "Players");
    
    public static Class35 method1780(byte arg0, int arg1) {
    while_1167_:
	do {
	    do {
		Class35 class35;
		try {
		    anInt2174++;
		    Class35 class35_0_
			= ((Class35)
			   Class148.aClass52_2370.method1210((byte) 116,
							     (long) arg1));
		    if (arg0 != 111)
			method1785((byte) 101);
		    if (null == class35_0_)
			break;
		    class35 = class35_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1167_;
		}
		return class35;
	    } while (false);
	    Class35 class35;
	    try {
		byte[] is
		    = Class12.aClass9_332.method163(arg1, 16, arg0 + -111);
		Class35 class35_1_ = new Class35();
		if (null != is)
		    class35_1_.method1094((byte) 102, new Class14_Sub10(is));
		Class148.aClass52_2370.method1205((byte) -93, class35_1_,
						  (long) arg1);
		class35 = class35_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class35;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ti.JC(" + arg0 + ',' + arg1 + ')');
    }
    
    public abstract int method1781();
    
    public static void method1782(int arg0, int arg1, int arg2) {
	try {
	    anInt2185++;
	    int i = arg1;
	    if (25 < i)
		i = 25;
	    arg1--;
	    int i_2_ = Class14_Sub8_Sub36.anIntArray4691[arg1];
	    int i_3_ = Class14_Sub2_Sub21.anIntArray4078[arg1];
	    if (arg2 == 0) {
		Class55.aClass14_Sub10_Sub1_891.method843(0, 49);
		Class55.aClass14_Sub10_Sub1_891.method809(false, 3 + i - -i);
		Class149.anInt2398++;
	    }
	    if (arg2 == 1) {
		Class55.aClass14_Sub10_Sub1_891.method843(0, 119);
		Class55.aClass14_Sub10_Sub1_891.method809(false,
							  3 + i + (i + 14));
		Class14_Sub2_Sub3.anInt3775++;
	    }
	    if (arg2 == 2) {
		Class113.anInt1885++;
		Class55.aClass14_Sub10_Sub1_891.method843(arg0 ^ ~0x4ed2, 138);
		Class55.aClass14_Sub10_Sub1_891.method809(false, i + i + 3);
	    }
	    Class55.aClass14_Sub10_Sub1_891
		.method801((byte) -86, i_2_ - -Class133_Sub6.anInt3676);
	    Class55.aClass14_Sub10_Sub1_891.method792(i_3_ + Class58.anInt947,
						      (byte) -98);
	    Class55.aClass14_Sub10_Sub1_891.method795(!(Class14_Sub8_Sub29
							.aBooleanArray4581
							[82]) ? 0 : 1,
						      arg0 + -1503987590);
	    Class71.anInt1085 = Class14_Sub8_Sub36.anIntArray4691[0];
	    Class14_Sub8_Sub15.anInt4335
		= Class14_Sub2_Sub21.anIntArray4078[0];
	    int i_4_ = 1;
	    if (arg0 != -20179)
		anIntArray2176 = null;
	    for (/**/; (i_4_ ^ 0xffffffff) > (i ^ 0xffffffff); i_4_++) {
		arg1--;
		Class55.aClass14_Sub10_Sub1_891.method809(false,
							  (Class14_Sub8_Sub36
							   .anIntArray4691
							   [arg1]) - i_2_);
		Class55.aClass14_Sub10_Sub1_891.method789((Class14_Sub2_Sub21
							   .anIntArray4078
							   [arg1]) + -i_3_,
							  273558984);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ti.IC(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1783(Class36 arg0, byte arg1, boolean arg2) {
    while_1169_:
	do {
	while_1168_:
	    do {
		do {
		    try {
			if (Class4.aClass36_134 != null) {
			    try {
				Class4.aClass36_134.method1101((byte) 122);
			    } catch (Exception exception) {
				/* empty */
			    }
			    Class4.aClass36_134 = null;
			}
			Class4.aClass36_134 = arg0;
			Class14_Sub3.method449(arg2, arg1 + -45);
			Class62.aClass14_Sub10_989 = null;
			Class14_Sub18.aClass14_Sub10_3036.anInt2908 = 0;
			anInt2180++;
			Class14_Sub8_Sub16.aClass14_Sub2_Sub9_4354 = null;
			Class14_Sub2_Sub3.anInt3769 = 0;
			for (;;) {
			    Class14_Sub2_Sub9 class14_sub2_sub9
				= ((Class14_Sub2_Sub9)
				   Class14_Sub8_Sub2.aClass55_4112
				       .method1228((byte) -84));
			    if (null == class14_sub2_sub9)
				break;
			    Class71.aClass55_1092.method1224
				(arg1 ^ 0x39, class14_sub2_sub9.aLong355,
				 class14_sub2_sub9);
			    Class14_Sub2_Sub8.anInt3833--;
			    Class14_Sub8_Sub32.anInt4612++;
			}
			for (;;) {
			    Class14_Sub2_Sub9 class14_sub2_sub9
				= ((Class14_Sub2_Sub9)
				   Class14_Sub8_Sub9.aClass55_4227
				       .method1228((byte) -109));
			    if (class14_sub2_sub9 == null)
				break;
			    Class14_Sub8_Sub37.aClass81_4716
				.method1394(class14_sub2_sub9, (byte) -78);
			    Class7_Sub2_Sub1.aClass55_3698.method1224
				(8, class14_sub2_sub9.aLong355,
				 class14_sub2_sub9);
			    Class63.anInt998++;
			    Class85.anInt1355--;
			}
			if (-1
			    != (Class14_Sub8_Sub12.aByte4287 ^ 0xffffffff)) {
			    try {
				Class14_Sub10 class14_sub10
				    = new Class14_Sub10(4);
				class14_sub10.method809(false, 4);
				class14_sub10.method809(false,
							(Class14_Sub8_Sub12
							 .aByte4287));
				class14_sub10.method833((byte) 118, 0);
				Class4.aClass36_134.method1100
				    (0, arg1 + -46, 4,
				     class14_sub10.aByteArray2895);
			    } catch (IOException ioexception) {
				try {
				    Class4.aClass36_134.method1101((byte) 112);
				} catch (Exception exception) {
				    /* empty */
				}
				Class51.anInt829++;
				Class4.aClass36_134 = null;
			    }
			}
			Class52.anInt853 = 0;
			if (arg1 == 49)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1168_;
		    }
		    return;
		} while (false);
		try {
		    Class146.aLong2364 = Class84.method1413((byte) 121);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1169_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ti.GC("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	} while (false);
    }
    
    public boolean method1784() {
	boolean bool;
	try {
	    anInt2182++;
	    bool = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ti.UA()");
	}
	return bool;
    }
    
    public static void method1785(byte arg0) {
	try {
	    anIntArray2176 = null;
	    aClass124_2175 = null;
	    anIntArray2179 = null;
	    aClass124_2183 = null;
	    aClass124_2188 = null;
	    aClass14_Sub2_Sub19_Sub1Array2186 = null;
	    int i = -94 % ((arg0 - 48) / 54);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ti.HC(" + arg0 + ')');
	}
    }
    
    public static int method1786(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
    while_1170_:
	do {
	    int i;
	    int i_5_;
	    do {
		int i_6_;
		try {
		    anInt2177++;
		    i = arg1 & 0xf;
		    i_5_ = (i ^ 0xffffffff) > -9 ? arg0 : arg3;
		    if (arg2 == 13828)
			break;
		    i_6_ = 4;
		} catch (RuntimeException runtimeexception) {
		    break while_1170_;
		}
		return i_6_;
	    } while (false);
	    int i_7_;
	    try {
		int i_8_ = (i < 4 ? arg3 : 12 == i || -15 == (i ^ 0xffffffff)
			    ? arg0 : arg4);
		i_7_ = (((i & 0x1 ^ 0xffffffff) == -1 ? i_5_ : -i_5_)
			- -(0 != (i & 0x2) ? -i_8_ : i_8_));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_7_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ti.FC(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ')'));
    }
    
    public static void method1787(int[] arg0, int arg1, float[][] arg2,
				  int arg3, Class130 arg4, float[][] arg5,
				  int[][] arg6, int arg7, float[][] arg8,
				  boolean arg9, Class73 arg10) {
	try {
	    anInt2178++;
	    int[] is = new int[arg0.length / 2];
	    for (int i = 0; (is.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		int i_9_ = arg0[i + i];
		int i_10_ = arg0[i + (i + 1)];
		if ((arg1 ^ 0xffffffff) == -2) {
		    int i_11_ = i_9_;
		    i_9_ = i_10_;
		    i_10_ = 128 - i_11_;
		} else if (2 != arg1) {
		    if ((arg1 ^ 0xffffffff) == -4) {
			int i_12_ = i_9_;
			i_9_ = 128 - i_10_;
			i_10_ = i_12_;
		    }
		} else {
		    i_9_ = 128 + -i_9_;
		    i_10_ = -i_10_ + 128;
		}
		float f;
		float f_13_;
		float f_14_;
		if (0 == i_9_ && 0 == i_10_) {
		    f_13_ = arg5[arg7][arg3];
		    f = arg2[arg7][arg3];
		    f_14_ = arg8[arg7][arg3];
		} else if (128 != i_9_ || i_10_ != 0) {
		    if (i_9_ != 128 || -129 != (i_10_ ^ 0xffffffff)) {
			if (-1 != (i_9_ ^ 0xffffffff) || i_10_ != 128) {
			    f = arg2[arg7][arg3];
			    f_13_ = arg5[arg7][arg3];
			    float f_15_ = (float) i_9_ / 128.0F;
			    f_14_ = arg8[arg7][arg3];
			    float f_16_ = arg2[arg7][arg3 - -1];
			    f += (-f + arg2[1 + arg7][arg3]) * f_15_;
			    f_14_ += f_15_ * (arg8[1 + arg7][arg3] - f_14_);
			    f_13_ += f_15_ * (arg5[1 + arg7][arg3] - f_13_);
			    f_16_ += f_15_ * (-f_16_
					      + arg2[arg7 - -1][arg3 - -1]);
			    float f_17_ = arg5[arg7][arg3 + 1];
			    f_17_
				+= (arg5[1 + arg7][1 + arg3] - f_17_) * f_15_;
			    float f_18_ = arg8[arg7][arg3 - -1];
			    float f_19_ = (float) i_10_ / 128.0F;
			    f_18_ += ((-f_18_ + arg8[arg7 + 1][arg3 - -1])
				      * f_15_);
			    f_13_ += (f_17_ - f_13_) * f_19_;
			    f_14_ += (f_18_ - f_14_) * f_19_;
			    f += (f_16_ - f) * f_19_;
			} else {
			    f_14_ = arg8[arg7][arg3 - -1];
			    f = arg2[arg7][1 + arg3];
			    f_13_ = arg5[arg7][1 + arg3];
			}
		    } else {
			f_14_ = arg8[arg7 + 1][1 + arg3];
			f = arg2[arg7 - -1][arg3 + 1];
			f_13_ = arg5[arg7 + 1][arg3 - -1];
		    }
		} else {
		    f_14_ = arg8[arg7 + 1][arg3];
		    f_13_ = arg5[1 + arg7][arg3];
		    f = arg2[1 + arg7][arg3];
		}
		int i_20_ = i_9_ + (arg7 << 965057831);
		int i_21_
		    = Class14_Sub8_Sub31.method647(arg3, -501955161, i_9_,
						   i_10_, arg6, arg7);
		int i_22_ = i_10_ + (arg3 << 1143644807);
		is[i] = arg4.method1769(arg10, i_20_, i_21_, i_22_, f, f_13_,
					f_14_);
	    }
	    arg4.method1770(is);
	    if (arg9 != true)
		anIntArray2176 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("ti.KC(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ arg3 + ',' + (arg4 != null ? "{...}" : "null") + ','
			+ (arg5 != null ? "{...}" : "null") + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7 + ','
			+ (arg8 != null ? "{...}" : "null") + ',' + arg9 + ','
			+ (arg10 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method1788(Class133 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	try {
	    anInt2187++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ti.SB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ')'));
	}
    }
    
    public static void method1789(byte arg0) {
	try {
	    int i = 57 % ((-16 - arg0) / 44);
	    anInt2184++;
	    Class14_Sub11.aClass52_2946.method1209((byte) -96);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ti.EC(" + arg0 + ')');
	}
    }
    
    public void method1790(int arg0, int arg1, int arg2, int arg3, int arg4) {
	try {
	    int i = -12 % ((-73 - arg4) / 40);
	    anInt2173++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ti.EA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public Class133 method1791(int arg0, int arg1, int arg2) {
	Class133 class133;
	try {
	    anInt2181++;
	    class133 = this;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ti.HB(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return class133;
    }
    
    public abstract void method1792(int i, int i_23_, int i_24_, int i_25_,
				    int i_26_, int i_27_, int i_28_, int i_29_,
				    long l);
    
    static {
	aClass124_2183 = aClass124_2188;
    }
}
