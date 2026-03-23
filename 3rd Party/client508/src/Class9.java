/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class9
{
    public static int[][] anIntArrayArray190
	= { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
	    { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
	    { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
	    { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
    public static int anInt191;
    public Object[] anObjectArray192;
    public static int anInt193;
    public int[] anIntArray194;
    public static int anInt195;
    public static int anInt196;
    public int[] anIntArray197;
    public int[][] anIntArrayArray198;
    public static int anInt199;
    public static int anInt200;
    public static int anInt201;
    public int[] anIntArray202;
    public int[] anIntArray203;
    public static int anInt204;
    public static int anInt205;
    public static int anInt206;
    public static Class124 aClass124_207
	= Class14_Sub2_Sub2.method263(1178, "headicons_prayer");
    public int[] anIntArray208;
    public static int anInt209;
    public static int anInt210;
    public int anInt211;
    public static int[] anIntArray212;
    public Class63[] aClass63Array213;
    public static boolean aBoolean214;
    public static int[] anIntArray215;
    public static int anInt216;
    public static int anInt217;
    public int[][] anIntArrayArray218;
    public Class63 aClass63_219;
    public boolean aBoolean220;
    public static Class124 aClass124_221;
    public static int anInt222;
    public int[] anIntArray223;
    public static int anInt224;
    public static int anInt225;
    public static int anInt226;
    public static Class124 aClass124_227
	= Class14_Sub2_Sub2.method263(1178, "mapflag");
    public static int anInt228;
    public static int anInt229;
    public static int anInt230;
    public static int anInt231;
    public static int anInt232;
    public static int anInt233;
    public static int anInt234;
    public static int anInt235;
    public static Class52 aClass52_236;
    public Object[][] anObjectArrayArray237;
    public static int anInt238;
    public static int anInt239;
    public static int anInt240;
    public static int anInt241;
    public int anInt242;
    public static int anInt243;
    public boolean aBoolean244;
    public static int anInt245;
    public static int anInt246;
    
    public int method146(Class124 arg0, int arg1) {
    while_64_:
	do {
	    int i;
	    do {
		int i_0_;
		try {
		    anInt195++;
		    arg0 = arg0.method1716((byte) 63);
		    i = aClass63_219.method1283(-9, arg0.method1709(86));
		    if (arg1 != 0)
			anIntArrayArray198 = null;
		    if (method153(i, -1))
			break;
		    i_0_ = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_64_;
		}
		return i_0_;
	    } while (false);
	    int i_1_;
	    try {
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public void method147(byte[] arg0, int arg1) {
	try {
	    if (arg1 != 15)
		anIntArray212 = null;
	    anInt222++;
	    anInt242 = Class68.method1303(arg0, arg1 + -15, arg0.length);
	    Class14_Sub10 class14_sub10
		= new Class14_Sub10(Class7_Sub3_Sub1.method139(-28009, arg0));
	    int i = class14_sub10.method798(arg1 + 69);
	    if (-6 != (i ^ 0xffffffff) && (i ^ 0xffffffff) != -7)
		throw new RuntimeException("Incorrect JS5 protocol number: "
					   + i);
	    if (-7 >= (i ^ 0xffffffff))
		class14_sub10.method812((byte) -102);
	    int i_2_ = class14_sub10.method798(60);
	    anInt211 = class14_sub10.method784((byte) 111);
	    int i_3_ = 0;
	    int i_4_ = -1;
	    anIntArray223 = new int[anInt211];
	    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > (anInt211 ^ 0xffffffff);
		 i_5_++) {
		anIntArray223[i_5_] = i_3_
		    += class14_sub10.method784((byte) 104);
		if ((i_4_ ^ 0xffffffff) > (anIntArray223[i_5_] ^ 0xffffffff))
		    i_4_ = anIntArray223[i_5_];
	    }
	    anIntArray194 = new int[1 + i_4_];
	    anIntArray202 = new int[1 + i_4_];
	    anObjectArray192 = new Object[i_4_ + 1];
	    anIntArrayArray218 = new int[1 + i_4_][];
	    anIntArray203 = new int[1 + i_4_];
	    anObjectArrayArray237 = new Object[i_4_ + 1][];
	    anIntArray208 = new int[i_4_ + 1];
	    if (0 != i_2_) {
		anIntArray197 = new int[i_4_ - -1];
		for (int i_6_ = 0; i_6_ < 1 + i_4_; i_6_++)
		    anIntArray197[i_6_] = -1;
		for (int i_7_ = 0;
		     (i_7_ ^ 0xffffffff) > (anInt211 ^ 0xffffffff); i_7_++)
		    anIntArray197[anIntArray223[i_7_]]
			= class14_sub10.method812((byte) -121);
		aClass63_219 = new Class63(anIntArray197);
	    }
	    for (int i_8_ = 0; (i_8_ ^ 0xffffffff) > (anInt211 ^ 0xffffffff);
		 i_8_++)
		anIntArray202[anIntArray223[i_8_]]
		    = class14_sub10.method812((byte) -108);
	    for (int i_9_ = 0; anInt211 > i_9_; i_9_++)
		anIntArray194[anIntArray223[i_9_]]
		    = class14_sub10.method812((byte) -102);
	    for (int i_10_ = 0; (anInt211 ^ 0xffffffff) < (i_10_ ^ 0xffffffff);
		 i_10_++)
		anIntArray203[anIntArray223[i_10_]]
		    = class14_sub10.method784((byte) 122);
	    for (int i_11_ = 0; i_11_ < anInt211; i_11_++) {
		i_3_ = 0;
		int i_12_ = anIntArray223[i_11_];
		int i_13_ = anIntArray203[i_12_];
		int i_14_ = -1;
		anIntArrayArray218[i_12_] = new int[i_13_];
		for (int i_15_ = 0;
		     (i_13_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
		    int i_16_ = (anIntArrayArray218[i_12_][i_15_] = i_3_
				 += class14_sub10.method784((byte) 112));
		    if (i_16_ > i_14_)
			i_14_ = i_16_;
		}
		anIntArray208[i_12_] = 1 + i_14_;
		if (1 + i_14_ == i_13_)
		    anIntArrayArray218[i_12_] = null;
	    }
	    if ((i_2_ ^ 0xffffffff) != -1) {
		aClass63Array213 = new Class63[1 + i_4_];
		anIntArrayArray198 = new int[i_4_ + 1][];
		for (int i_17_ = 0; anInt211 > i_17_; i_17_++) {
		    int i_18_ = anIntArray223[i_17_];
		    int i_19_ = anIntArray203[i_18_];
		    anIntArrayArray198[i_18_] = new int[anIntArray208[i_18_]];
		    for (int i_20_ = 0; ((anIntArray208[i_18_] ^ 0xffffffff)
					 < (i_20_ ^ 0xffffffff)); i_20_++)
			anIntArrayArray198[i_18_][i_20_] = -1;
		    for (int i_21_ = 0; i_21_ < i_19_; i_21_++) {
			int i_22_;
			if (null != anIntArrayArray218[i_18_])
			    i_22_ = anIntArrayArray218[i_18_][i_21_];
			else
			    i_22_ = i_21_;
			anIntArrayArray198[i_18_][i_22_]
			    = class14_sub10.method812((byte) -116);
		    }
		    aClass63Array213[i_18_]
			= new Class63(anIntArrayArray198[i_18_]);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.R("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public boolean method148(int arg0, int arg1, int arg2) {
    while_65_:
	do {
	    do {
		boolean bool;
		try {
		    anInt228++;
		    if (arg2 >= (arg1 ^ 0xffffffff) && arg0 >= 0
			&& arg1 < anIntArray208.length
			&& arg0 < anIntArray208[arg1])
			break;
		    if (Class133_Sub1.aBoolean3499)
			throw new IllegalArgumentException(arg1 + "," + arg0);
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_65_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.AA(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public byte[] method149(int arg0, int arg1, int[] arg2, int arg3) {
    while_66_:
	do {
	    do {
		byte[] is;
		try {
		    anInt217++;
		    if (method148(arg1, arg3, -1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_66_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if (null != anObjectArrayArray237[arg3]
			&& anObjectArrayArray237[arg3][arg1] != null)
			break;
		    boolean bool = method156((byte) -17, arg3, arg2);
		    if (bool)
			break;
		    method164(-128, arg3);
		    bool = method156((byte) -107, arg3, arg2);
		    if (bool)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_66_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		if (arg0 != -23245)
		    anObjectArrayArray237 = null;
		byte[] is_23_
		    = Class63.method1282(anObjectArrayArray237[arg3][arg1],
					 (byte) 91, false);
		if (aBoolean244) {
		    anObjectArrayArray237[arg3][arg1] = null;
		    if (anIntArray208[arg3] == 1)
			anObjectArrayArray237[arg3] = null;
		}
		is = is_23_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.K(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ')'));
    }
    
    public static void method150(int arg0) {
	try {
	    if (arg0 != 3)
		method154(-67, -54, (byte) -71, -11, 15);
	    aClass124_227 = null;
	    aClass124_207 = null;
	    aClass124_221 = null;
	    aClass52_236 = null;
	    anIntArray215 = null;
	    anIntArray212 = null;
	    anIntArrayArray190 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bc.G(" + arg0 + ')');
	}
    }
    
    public int method151(Class124 arg0, int arg1) {
	int i;
	try {
	    arg0 = arg0.method1716((byte) 63);
	    anInt239++;
	    if (arg1 >= -119)
		anIntArray208 = null;
	    int i_24_ = aClass63_219.method1283(-9, arg0.method1709(108));
	    i = method178(0, i_24_);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.HA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return i;
    }
    
    public void method152(int arg0) {
    while_68_:
	do {
	while_67_:
	    do {
		do {
		    try {
			for (int i = 0; i < anObjectArrayArray237.length; i++)
			    anObjectArrayArray237[i] = null;
			if (arg0 < -104)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_67_;
		    }
		    return;
		} while (false);
		try {
		    anInt193++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_68_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "bc.I(" + arg0 + ')');
	} while (false);
    }
    
    public boolean method153(int arg0, int arg1) {
    while_70_:
	do {
	while_69_:
	    do {
		do {
		    boolean bool;
		    try {
			anInt225++;
			if (arg1 != -1)
			    aClass52_236 = null;
			if (0 <= arg0 && anIntArray208.length > arg0
			    && anIntArray208[arg0] != 0)
			    break while_69_;
			if (Class133_Sub1.aBoolean3499)
			    break;
			bool = false;
		    } catch (RuntimeException runtimeexception) {
			break while_70_;
		    }
		    return bool;
		} while (false);
		try {
		    throw new IllegalArgumentException(Integer.toString(arg0));
		} catch (RuntimeException runtimeexception) {
		    break while_70_;
		}
	    } while (false);
	    return true;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.S(" + arg0 + ',' + arg1 + ')');
    }
    
    public static int method154(int arg0, int arg1, byte arg2, int arg3,
				int arg4) {
	int i;
	try {
	    int i_25_ = (65536 - Class3.anIntArray111[arg1 * 1024 / arg0]
			 >> -1405707263);
	    if (arg2 >= -120)
		aClass124_227 = null;
	    anInt196++;
	    i = (arg4 * i_25_ >> 1095416592) + (arg3 * (65536 + -i_25_)
						>> 1640497648);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
	return i;
    }
    
    public int method155(int arg0) {
    while_71_:
	do {
	    do {
		int i;
		try {
		    anInt235++;
		    if (arg0 == 6756)
			break;
		    i = -40;
		} catch (RuntimeException runtimeexception) {
		    break while_71_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anIntArray208.length;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "bc.GA(" + arg0 + ')');
    }
    
    public boolean method156(byte arg0, int arg1, int[] arg2) {
    while_72_:
	do {
	    do {
		boolean bool;
		try {
		    anInt240++;
		    if (method153(arg1, -1))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_72_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (anObjectArray192[arg1] != null)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_72_;
		}
		return bool;
	    } while (false);
	    int[] is;
	    int i;
	    Object[] objects;
	    boolean bool;
	    do {
		boolean bool_26_;
		try {
		    is = anIntArrayArray218[arg1];
		    i = anIntArray203[arg1];
		    if (null == anObjectArrayArray237[arg1])
			anObjectArrayArray237[arg1]
			    = new Object[anIntArray208[arg1]];
		    objects = anObjectArrayArray237[arg1];
		    bool = true;
		    if (arg0 <= -10)
			break;
		    bool_26_ = false;
		} catch (RuntimeException runtimeexception) {
		    break while_72_;
		}
		return bool_26_;
	    } while (false);
	    do {
		boolean bool_27_;
		try {
		    for (int i_28_ = 0;
			 (i_28_ ^ 0xffffffff) > (i ^ 0xffffffff); i_28_++) {
			int i_29_;
			if (is != null)
			    i_29_ = is[i_28_];
			else
			    i_29_ = i_28_;
			if (null == objects[i_29_]) {
			    bool = false;
			    break;
			}
		    }
		    if (!bool)
			break;
		    bool_27_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_72_;
		}
		return bool_27_;
	    } while (false);
	    boolean bool_30_;
	    try {
		byte[] is_31_;
		if (arg2 == null
		    || (arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0
			&& (arg2[3] ^ 0xffffffff) == -1))
		    is_31_ = Class63.method1282(anObjectArray192[arg1],
						(byte) 89, false);
		else {
		    is_31_ = Class63.method1282(anObjectArray192[arg1],
						(byte) 48, true);
		    Class14_Sub10 class14_sub10 = new Class14_Sub10(is_31_);
		    class14_sub10.method799(arg2,
					    (class14_sub10
					     .aByteArray2895).length,
					    14802, 5);
		}
		byte[] is_32_;
		try {
		    is_32_ = Class7_Sub3_Sub1.method139(-28009, is_31_);
		} catch (RuntimeException runtimeexception) {
		    throw Class14_Sub8_Sub14.method554
			      (runtimeexception,
			       ("T3 - " + (arg2 != null) + "," + arg1 + ","
				+ is_31_.length + ","
				+ Class68.method1303(is_31_, 0, is_31_.length)
				+ ","
				+ Class68.method1303(is_31_, 0,
						     -2 + is_31_.length)
				+ "," + anIntArray202[arg1] + "," + anInt242));
		}
		if (aBoolean220)
		    anObjectArray192[arg1] = null;
		if (i > 1) {
		    int i_33_ = is_32_.length;
		    int[] is_34_ = new int[i];
		    int i_35_ = is_32_[--i_33_] & 0xff;
		    i_33_ -= 4 * i * i_35_;
		    Class14_Sub10 class14_sub10 = new Class14_Sub10(is_32_);
		    class14_sub10.anInt2908 = i_33_;
		    for (int i_36_ = 0;
			 (i_36_ ^ 0xffffffff) > (i_35_ ^ 0xffffffff);
			 i_36_++) {
			int i_37_ = 0;
			for (int i_38_ = 0; i > i_38_; i_38_++) {
			    i_37_ += class14_sub10.method812((byte) -122);
			    is_34_[i_38_] += i_37_;
			    if (null == is) {
				/* empty */
			    }
			}
		    }
		    byte[][] is_39_ = new byte[i][];
		    for (int i_40_ = 0; i_40_ < i; i_40_++) {
			is_39_[i_40_] = new byte[is_34_[i_40_]];
			is_34_[i_40_] = 0;
		    }
		    int i_41_ = 0;
		    class14_sub10.anInt2908 = i_33_;
		    for (int i_42_ = 0;
			 (i_35_ ^ 0xffffffff) < (i_42_ ^ 0xffffffff);
			 i_42_++) {
			int i_43_ = 0;
			for (int i_44_ = 0;
			     (i_44_ ^ 0xffffffff) > (i ^ 0xffffffff);
			     i_44_++) {
			    i_43_ += class14_sub10.method812((byte) -115);
			    Class72.method1322(is_32_, i_41_, is_39_[i_44_],
					       is_34_[i_44_], i_43_);
			    i_41_ += i_43_;
			    is_34_[i_44_] += i_43_;
			}
		    }
		    for (int i_45_ = 0; i_45_ < i; i_45_++) {
			int i_46_;
			if (null != is)
			    i_46_ = is[i_45_];
			else
			    i_46_ = i_45_;
			if (!aBoolean244)
			    objects[i_46_]
				= Class14_Sub2_Sub1
				      .method251(false, is_39_[i_45_], -125);
			else
			    objects[i_46_] = is_39_[i_45_];
		    }
		} else {
		    int i_47_;
		    if (null != is)
			i_47_ = is[0];
		    else
			i_47_ = 0;
		    if (aBoolean244)
			objects[i_47_] = is_32_;
		    else
			objects[i_47_]
			    = Class14_Sub2_Sub1.method251(false, is_32_, -83);
		}
		bool_30_ = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool_30_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.N(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public byte[] method157(int arg0, int arg1, int arg2) {
    while_73_:
	do {
	    do {
		byte[] is;
		try {
		    if (arg2 != 20983)
			aClass124_207 = null;
		    anInt232++;
		    if (method148(arg0, arg1, -1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_73_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if (anObjectArrayArray237[arg1] != null
			&& null != anObjectArrayArray237[arg1][arg0])
			break;
		    boolean bool = method156((byte) -19, arg1, null);
		    if (bool)
			break;
		    method164(77, arg1);
		    bool = method156((byte) -88, arg1, null);
		    if (bool)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_73_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		byte[] is_48_
		    = Class63.method1282(anObjectArrayArray237[arg1][arg0],
					 (byte) 39, false);
		is = is_48_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public boolean method158(int arg0, int arg1, byte arg2) {
    while_74_:
	do {
	    do {
		boolean bool;
		try {
		    anInt210++;
		    if (method148(arg0, arg1, -1))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_74_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (anObjectArrayArray237[arg1] == null
			|| null == anObjectArrayArray237[arg1][arg0])
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_74_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (anObjectArray192[arg1] == null)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_74_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    method164(108, arg1);
		    int i = 26 % ((arg2 - -22) / 62);
		    if (null == anObjectArray192[arg1])
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_74_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.P(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public boolean method159(int arg0, Class124 arg1, Class124 arg2) {
    while_75_:
	do {
	    int i;
	    do {
		boolean bool;
		try {
		    anInt204++;
		    arg2 = arg2.method1716((byte) 63);
		    arg1 = arg1.method1716((byte) 63);
		    i = aClass63_219.method1283(arg0 + -13,
						arg2.method1709(49));
		    if (method153(i, -1))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_75_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		int i_49_
		    = aClass63Array213[i].method1283(-9, arg1.method1709(93));
		if (arg0 != 4)
		    anIntArrayArray218 = null;
		bool = method158(i_49_, i, (byte) 79);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.F(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public boolean method160(Class124 arg0, byte arg1) {
	boolean bool;
	try {
	    arg0 = arg0.method1716((byte) 63);
	    if (arg1 != -102)
		anIntArray215 = null;
	    anInt201++;
	    int i = aClass63_219.method1283(-9, arg0.method1709(111));
	    bool = method161((byte) 116, i);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.DA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return bool;
    }
    
    public boolean method161(byte arg0, int arg1) {
    while_76_:
	do {
	    do {
		boolean bool;
		try {
		    anInt238++;
		    if (method153(arg1, -1))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_76_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (null == anObjectArray192[arg1])
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_76_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    method164(arg0 + -243, arg1);
		    if (arg0 == 116)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_76_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (anObjectArray192[arg1] == null)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_76_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.IA(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method162(byte arg0, Class124 arg1) {
	try {
	    arg1 = arg1.method1716((byte) 63);
	    anInt243++;
	    int i = aClass63_219.method1283(-9, arg1.method1709(57));
	    method174((byte) -92, i);
	    if (arg0 != -106)
		method168(97, (byte) -53);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.BA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public byte[] method163(int arg0, int arg1, int arg2) {
	byte[] is;
	try {
	    if (arg2 != 0)
		aClass124_221 = null;
	    anInt206++;
	    is = method149(-23245, arg0, null, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return is;
    }
    
    public void method164(int arg0, int arg1) {
	try {
	    int i = -111 % ((-86 - arg0) / 36);
	    anInt231++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.U(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public byte[] method165(int arg0, int arg1) {
    while_77_:
	do {
	    do {
		byte[] is;
		try {
		    anInt245++;
		    if (anIntArray208.length != 1)
			break;
		    is = method163(arg1, 0, 0);
		} catch (RuntimeException runtimeexception) {
		    break while_77_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if (method153(arg1, -1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_77_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    int i = 109 / ((-20 - arg0) / 56);
		    if (anIntArray208[arg1] != 1)
			break;
		    is = method163(0, arg1, 0);
		} catch (RuntimeException runtimeexception) {
		    break while_77_;
		}
		return is;
	    } while (false);
	    try {
		throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		/* empty */
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.J(" + arg0 + ',' + arg1 + ')');
    }
    
    public boolean method166(byte arg0, Class124 arg1) {
    while_78_:
	do {
	    do {
		boolean bool;
		try {
		    anInt229++;
		    int i = 41 % ((arg0 - 56) / 58);
		    arg1 = arg1.method1716((byte) 63);
		    int i_50_
			= aClass63_219.method1283(-9, arg1.method1709(108));
		    if ((i_50_ ^ 0xffffffff) <= -1)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_78_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.Q(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public byte[] method167(Class124 arg0, Class124 arg1, int arg2) {
    while_79_:
	do {
	    int i;
	    do {
		byte[] is;
		try {
		    arg0 = arg0.method1716((byte) 63);
		    int i_51_ = 125 % ((arg2 - 3) / 60);
		    anInt230++;
		    arg1 = arg1.method1716((byte) 63);
		    i = aClass63_219.method1283(-9, arg0.method1709(99));
		    if (method153(i, -1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_79_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		int i_52_
		    = aClass63Array213[i].method1283(-9, arg1.method1709(74));
		is = method163(i_52_, i, 0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("bc.L("
					    + (arg0 != null ? "{...}" : "null")
					    + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
    }
    
    public void method168(int arg0, byte arg1) {
    while_81_:
	do {
	while_80_:
	    do {
		do {
		    try {
			anInt205++;
			if (method153(arg0, -1))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_80_;
		    }
		    return;
		} while (false);
		try {
		    anObjectArrayArray237[arg0] = null;
		    if (arg1 != -90)
			method160(null, (byte) -8);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_81_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "bc.T(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method169(int arg0) {
    while_83_:
	do {
	while_82_:
	    do {
		do {
		    try {
			if (arg0 == -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_82_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub14 class14_sub14
			= ((Class14_Sub14)
			   Class33.aClass2_583.method77(arg0 + 1));
		    anInt224++;
		    for (/**/; class14_sub14 != null;
			 class14_sub14 = ((Class14_Sub14)
					  Class33.aClass2_583.method84(-88))) {
			if (0 < class14_sub14.anInt2975)
			    class14_sub14.anInt2975--;
			if ((class14_sub14.anInt2975 ^ 0xffffffff) == -1) {
			    if (class14_sub14.anInt2979 < 0
				|| Class63.method1284((byte) -116,
						      class14_sub14.anInt2966,
						      (class14_sub14
						       .anInt2979))) {
				Class133_Sub4.method1838
				    (class14_sub14.anInt2966,
				     class14_sub14.anInt2967,
				     class14_sub14.anInt2970,
				     class14_sub14.anInt2969,
				     class14_sub14.anInt2979, (byte) 74,
				     class14_sub14.anInt2971,
				     class14_sub14.anInt2968);
				class14_sub14.method233(arg0 + 1);
			    }
			} else {
			    if ((class14_sub14.anInt2980 ^ 0xffffffff) < -1)
				class14_sub14.anInt2980--;
			    if (class14_sub14.anInt2980 == 0
				&& -2 >= (class14_sub14.anInt2967 ^ 0xffffffff)
				&& 1 <= class14_sub14.anInt2970
				&& ((class14_sub14.anInt2967 ^ 0xffffffff)
				    >= -103)
				&& 102 >= class14_sub14.anInt2970
				&& (class14_sub14.anInt2976 < 0
				    || Class63.method1284((byte) -116,
							  (class14_sub14
							   .anInt2981),
							  (class14_sub14
							   .anInt2976)))) {
				Class133_Sub4.method1838
				    (class14_sub14.anInt2981,
				     class14_sub14.anInt2967,
				     class14_sub14.anInt2970,
				     class14_sub14.anInt2969,
				     class14_sub14.anInt2976, (byte) 74,
				     class14_sub14.anInt2971,
				     class14_sub14.anInt2965);
				class14_sub14.anInt2980 = -1;
				if (((class14_sub14.anInt2979 ^ 0xffffffff)
				     != (class14_sub14.anInt2976 ^ 0xffffffff))
				    || ((class14_sub14.anInt2979 ^ 0xffffffff)
					!= 0)) {
				    if ((class14_sub14.anInt2976
					 == class14_sub14.anInt2979)
					&& (class14_sub14.anInt2968
					    == class14_sub14.anInt2965)
					&& ((class14_sub14.anInt2981
					     ^ 0xffffffff)
					    == (class14_sub14.anInt2966
						^ 0xffffffff)))
					class14_sub14
					    .method233(arg0 ^ 0xffffffff);
				} else
				    class14_sub14.method233(0);
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_83_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "bc.A(" + arg0 + ')');
	} while (false);
    }
    
    public boolean method170(boolean arg0) {
	boolean bool;
	try {
	    anInt199++;
	    if (arg0)
		aClass124_227 = null;
	    boolean bool_53_ = true;
	    for (int i = 0;
		 (i ^ 0xffffffff) > (anIntArray223.length ^ 0xffffffff); i++) {
		int i_54_ = anIntArray223[i];
		if (anObjectArray192[i_54_] == null) {
		    method164(126, i_54_);
		    if (null == anObjectArray192[i_54_])
			bool_53_ = false;
		}
	    }
	    bool = bool_53_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "bc.CA(" + arg0 + ')');
	}
	return bool;
    }
    
    public boolean method171(int arg0, int arg1) {
    while_84_:
	do {
	    do {
		boolean bool;
		try {
		    anInt234++;
		    if (arg0 != 29499)
			method168(43, (byte) 17);
		    if (1 != anIntArray208.length)
			break;
		    bool = method158(arg1, 0, (byte) 100);
		} catch (RuntimeException runtimeexception) {
		    break while_84_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (method153(arg1, arg0 + -29500))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_84_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-2 != (anIntArray208[arg1] ^ 0xffffffff))
			break;
		    bool = method158(0, arg1, (byte) 49);
		} catch (RuntimeException runtimeexception) {
		    break while_84_;
		}
		return bool;
	    } while (false);
	    try {
		throw new RuntimeException();
	    } catch (RuntimeException runtimeexception) {
		/* empty */
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.E(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method172(byte arg0) {
    while_86_:
	do {
	while_85_:
	    do {
		do {
		    try {
			if (arg0 >= 96)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_85_;
		    }
		    return;
		} while (false);
		try {
		    anInt216++;
		    Class14_Sub8_Sub6.aClass52_4186.method1203((byte) -106);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_86_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "bc.W(" + arg0 + ')');
	} while (false);
    }
    
    public int method173(int arg0) {
    while_87_:
	do {
	    int i;
	    int i_55_;
	    do {
		int i_56_;
		try {
		    anInt233++;
		    i = 0;
		    i_55_ = 0;
		    for (int i_57_ = 0; anObjectArray192.length > i_57_;
			 i_57_++) {
			if (-1 > (anIntArray203[i_57_] ^ 0xffffffff)) {
			    i_55_ += method178(0, i_57_);
			    i += 100;
			}
		    }
		    if (0 != i)
			break;
		    i_56_ = 100;
		} catch (RuntimeException runtimeexception) {
		    break while_87_;
		}
		return i_56_;
	    } while (false);
	    int i_58_;
	    try {
		int i_59_ = i_55_ * arg0 / i;
		i_58_ = i_59_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_58_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "bc.M(" + arg0 + ')');
    }
    
    public void method174(byte arg0, int arg1) {
    while_89_:
	do {
	while_88_:
	    do {
		do {
		    try {
			if (arg0 <= -62)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_88_;
		    }
		    return;
		} while (false);
		try {
		    anInt209++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_89_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("bc.EA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public void method175(byte arg0, boolean arg1, boolean arg2) {
	try {
	    if (arg0 != -99)
		aClass52_236 = null;
	    if (arg2) {
		aClass63_219 = null;
		anIntArray197 = null;
	    }
	    if (arg1) {
		anIntArrayArray198 = null;
		aClass63Array213 = null;
	    }
	    anInt200++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.O(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public int[] method176(byte arg0, int arg1) {
    while_90_:
	do {
	    do {
		int[] is;
		try {
		    anInt191++;
		    if (arg0 >= 1)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_90_;
		}
		return is;
	    } while (false);
	    do {
		int[] is;
		try {
		    if (method153(arg1, -1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_90_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int[] is_60_ = anIntArrayArray218[arg1];
		if (is_60_ == null) {
		    is_60_ = new int[anIntArray203[arg1]];
		    for (int i = 0;
			 (is_60_.length ^ 0xffffffff) < (i ^ 0xffffffff); i++)
			is_60_[i] = i;
		}
		is = is_60_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.JA(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method177(int arg0, int arg1) {
    while_91_:
	do {
	    do {
		int i;
		try {
		    anInt226++;
		    if (arg1 == 13537)
			break;
		    i = -39;
		} catch (RuntimeException runtimeexception) {
		    break while_91_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (method153(arg0, arg1 + -13538))
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_91_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anIntArray208[arg0];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.V(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class9(boolean arg0, boolean arg1) {
	try {
	    aBoolean244 = arg1;
	    aBoolean220 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("bc.<init>(" + arg0 + ','
						+ arg1 + ')'));
	}
    }
    
    public int method178(int arg0, int arg1) {
    while_92_:
	do {
	    do {
		int i;
		try {
		    anInt241++;
		    if (method153(arg1, arg0 ^ 0xffffffff))
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_92_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg0 != 0)
			method175((byte) 16, false, true);
		    if (anObjectArray192[arg1] == null)
			break;
		    i = 100;
		} catch (RuntimeException runtimeexception) {
		    break while_92_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "bc.FA(" + arg0 + ',' + arg1 + ')');
    }
    
    static {
	aBoolean214 = true;
	anIntArray212 = new int[] { 0, -1, 0, 1 };
	aClass124_221
	    = Class14_Sub2_Sub2.method263(1178, "Lade Schrifts-=tze )2 ");
	anIntArray215 = new int[100];
	aClass52_236 = new Class52(64);
	anInt246 = 0;
    }
}
