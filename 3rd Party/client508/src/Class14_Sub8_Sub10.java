/* Class14_Sub8_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class14_Sub8_Sub10 extends Class14_Sub8
{
    public static boolean aBoolean4245;
    public static int anInt4246;
    public static int anInt4247;
    public static int anInt4248;
    public static boolean aBoolean4249;
    public static int anInt4250;
    public static int anInt4251 = 0;
    public int[] anIntArray4252;
    public int[] anIntArray4253;
    public int anInt4254 = 2048;
    public static int anInt4255 = 0;
    public static int anInt4256;
    public static byte[][][] aByteArrayArrayArray4257;
    public int anInt4258 = 10;
    public static Class124 aClass124_4259
	= Class14_Sub2_Sub2.method263(1178, "Lade Konfiguration )2 ");
    public static int anInt4260;
    public static int[][] anIntArrayArray4261;
    public static int anInt4262;
    public int anInt4263 = 0;
    
    public static int method526(byte arg0, int arg1, int arg2) {
    while_348_:
	do {
	    Class14_Sub25 class14_sub25;
	    do {
		int i;
		try {
		    anInt4247++;
		    int i_0_ = 57 / ((arg0 - -55) / 62);
		    class14_sub25
			= ((Class14_Sub25)
			   Class132.aClass55_2167.method1230((long) arg2,
							     (byte) -118));
		    if (null != class14_sub25)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_348_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (0 <= arg1 && (class14_sub25.anIntArray3178.length
				      ^ 0xffffffff) < (arg1 ^ 0xffffffff))
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_348_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = class14_sub25.anIntArray3178[arg1];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("gf.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public void method472(int arg0) {
	try {
	    if (arg0 != 0)
		method529(-19);
	    anInt4250++;
	    method529(255);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gf.I(" + arg0 + ')');
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4246++;
	    int[] is_1_ = aClass149_2851.method2014(arg0, (byte) 121);
	    if (arg1 >= -58)
		anInt4258 = -19;
	    if (aClass149_2851.aBoolean2402) {
		int i = Class133_Sub5.anIntArray3623[arg0];
		if (anInt4263 == 0) {
		    int i_2_ = 0;
		    for (int i_3_ = 0; i_3_ < anInt4258; i_3_++) {
			if (i >= anIntArray4253[i_3_]
			    && (i ^ 0xffffffff) > (anIntArray4253[i_3_ - -1]
						   ^ 0xffffffff)) {
			    if (anIntArray4252[i_3_] > i)
				i_2_ = 4096;
			    break;
			}
		    }
		    Class72.method1324(is_1_, 0, Class112.anInt1876, i_2_);
		} else {
		    for (int i_4_ = 0; Class112.anInt1876 > i_4_; i_4_++) {
			int i_5_ = 0;
			int i_6_ = 0;
			int i_7_ = Class14_Sub8_Sub4.anIntArray4145[i_4_];
			int i_8_ = anInt4263;
		    while_349_:
			do {
			    do {
				if (-2 != (i_8_ ^ 0xffffffff)) {
				    if (i_8_ != 2) {
					if (i_8_ == 3)
					    break;
					break while_349_;
				    }
				} else {
				    i_5_ = i_7_;
				    break while_349_;
				}
				i_5_
				    = (i_7_ - (4096 - i) >> -667012863) + 2048;
				break while_349_;
			    } while (false);
			    i_5_ = (-i + i_7_ >> 2108979009) + 2048;
			} while (false);
			for (i_8_ = 0;
			     (anInt4258 ^ 0xffffffff) < (i_8_ ^ 0xffffffff);
			     i_8_++) {
			    if ((i_5_ ^ 0xffffffff) <= (anIntArray4253[i_8_]
							^ 0xffffffff)
				&& i_5_ < anIntArray4253[i_8_ + 1]) {
				if (i_5_ < anIntArray4252[i_8_])
				    i_6_ = 4096;
				break;
			    }
			}
			is_1_[i_4_] = i_6_;
		    }
		}
	    }
	    is = is_1_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gf.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_350_:
	    do {
		do {
		    if (0 != i) {
			if (i != 1) {
			    if (i == 2)
				break;
			    break while_350_;
			}
		    } else {
			anInt4258 = arg2.method798(95);
			break while_350_;
		    }
		    anInt4254 = arg2.method784((byte) 124);
		    break while_350_;
		} while (false);
		anInt4263 = arg2.method798(91);
	    } while (false);
	    anInt4262++;
	    if (arg1 != 24777)
		aBoolean4249 = false;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gf.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class14_Sub8_Sub10() {
	super(0, true);
    }
    
    public static byte[] method527(int arg0, byte arg1) {
	byte[] is;
	try {
	    anInt4256++;
	    Class14_Sub2_Sub17 class14_sub2_sub17
		= ((Class14_Sub2_Sub17)
		   Class14_Sub2_Sub18_Sub2.aClass20_5073.method974((long) arg0,
								   0));
	    if (arg1 > -77)
		method528(24);
	    if (null == class14_sub2_sub17) {
		byte[] is_9_ = new byte[512];
		Random random = new Random((long) arg0);
		for (int i = 0; (i ^ 0xffffffff) > -256; i++)
		    is_9_[i] = (byte) i;
		for (int i = 0; i < 255; i++) {
		    int i_10_ = 255 + -i;
		    int i_11_ = Class138.method1949(random, i_10_, -32640);
		    byte i_12_ = is_9_[i_11_];
		    is_9_[i_11_] = is_9_[i_10_];
		    is_9_[i_10_] = is_9_[-i + 511] = i_12_;
		}
		class14_sub2_sub17 = new Class14_Sub2_Sub17(is_9_);
		Class14_Sub2_Sub18_Sub2.aClass20_5073
		    .method971(-1, class14_sub2_sub17, (long) arg0);
	    }
	    is = class14_sub2_sub17.aByteArray4014;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gf.E(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method528(int arg0) {
    while_352_:
	do {
	while_351_:
	    do {
		do {
		    try {
			aClass124_4259 = null;
			if (arg0 == 512)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_351_;
		    }
		    return;
		} while (false);
		try {
		    anIntArrayArray4261 = null;
		    aByteArrayArrayArray4257 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_352_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "gf.G(" + arg0 + ')');
	} while (false);
    }
    
    public void method529(int arg0) {
    while_354_:
	do {
	while_353_:
	    do {
		do {
		    try {
			if (arg0 == 255)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_353_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray4253 = new int[anInt4258 + 1];
		    anInt4248++;
		    int i = 4096 / anInt4258;
		    int i_13_ = 0;
		    anIntArray4252 = new int[anInt4258 + 1];
		    int i_14_ = anInt4254 * i >> 1115079276;
		    for (int i_15_ = 0;
			 (anInt4258 ^ 0xffffffff) < (i_15_ ^ 0xffffffff);
			 i_15_++) {
			anIntArray4253[i_15_] = i_13_;
			anIntArray4252[i_15_] = i_14_ + i_13_;
			i_13_ += i;
		    }
		    anIntArray4253[anInt4258] = 4096;
		    anIntArray4252[anInt4258] = anIntArray4252[0] + 4096;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_354_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "gf.D(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aBoolean4249 = false;
	anIntArrayArray4261 = new int[5][5000];
	aBoolean4245 = false;
    }
}
