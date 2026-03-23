/* Class14_Sub8_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub20 extends Class14_Sub8
{
    public int[] anIntArray4415 = new int[3];
    public static int anInt4416;
    public static Object anObject4417;
    public static int anInt4418;
    public static int anInt4419 = 0;
    public static boolean aBoolean4420;
    public int anInt4421 = 4096;
    public static int[] anIntArray4422 = new int[2];
    public int anInt4423 = 4096;
    public static int anInt4424;
    public static int anInt4425;
    public int anInt4426;
    public static int anInt4427;
    public int anInt4428 = 409;
    public static int anInt4429;
    
    public static void method583(int arg0) {
	try {
	    anInt4416++;
	    int i = -88 / ((arg0 - -14) / 47);
	    int[] is = new int[Class108.anInt1816];
	    int i_0_ = 0;
	    for (int i_1_ = 0; i_1_ < Class108.anInt1816; i_1_++) {
		Class142 class142 = Class14_Sub8_Sub24.method605(63, i_1_);
		if (class142.anInt2274 >= 0
		    || (class142.anInt2264 ^ 0xffffffff) <= -1)
		    is[i_0_++] = i_1_;
	    }
	    Class107.anIntArray1809 = new int[i_0_];
	    for (int i_2_ = 0; (i_2_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
		 i_2_++)
		Class107.anIntArray1809[i_2_] = is[i_2_];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lc.D(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub20() {
	super(1, false);
	anInt4426 = 4096;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_407_:
	    do {
	    while_406_:
		do {
		while_405_:
		    do {
			do {
			    if (-1 != (i ^ 0xffffffff)) {
				if (-2 != (i ^ 0xffffffff)) {
				    if (i != 2) {
					if (i != 3) {
					    if (i == 4)
						break while_406_;
					    break while_407_;
					}
				    } else
					break;
				    break while_405_;
				}
			    } else {
				anInt4428 = arg2.method784((byte) 123);
				break while_407_;
			    }
			    anInt4421 = arg2.method784((byte) 107);
			    break while_407_;
			} while (false);
			anInt4426 = arg2.method784((byte) 107);
			break while_407_;
		    } while (false);
		    anInt4423 = arg2.method784((byte) 109);
		    break while_407_;
		} while (false);
		int i_3_ = arg2.method829(arg1 ^ 0x609d);
		anIntArray4415[2]
		    = Class14_Sub8_Sub26.method617(i_3_ >> 933406924, 0);
		anIntArray4415[0]
		    = Class14_Sub8_Sub26.method617(267386880,
						   i_3_ << -632368668);
		anIntArray4415[1]
		    = Class14_Sub8_Sub26.method617(i_3_ >> -971707388, 4080);
	    } while (false);
	    anInt4418++;
	    if (arg1 != 24777)
		method584(71);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lc.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static Class14_Sub2_Sub13 method584(int arg0) {
    while_409_:
	do {
	    do {
		Class14_Sub2_Sub13 class14_sub2_sub13;
		try {
		    if (arg0 != -11988)
			anObject4417 = null;
		    anInt4425++;
		    Class14_Sub2_Sub13 class14_sub2_sub13_4_
			= (Class14_Sub2_Sub13) Class14_Sub8_Sub27
						   .aClass81_4546
						   .method1400((byte) 79);
		    if (null == class14_sub2_sub13_4_)
			break;
		    class14_sub2_sub13_4_.method233(0);
		    class14_sub2_sub13_4_.method246(-26366);
		    class14_sub2_sub13 = class14_sub2_sub13_4_;
		} catch (RuntimeException runtimeexception) {
		    break while_409_;
		}
		return class14_sub2_sub13;
	    } while (false);
	while_408_:
	    for (;;) {
		Class14_Sub2_Sub13 class14_sub2_sub13;
		do {
		    Class14_Sub2_Sub13 class14_sub2_sub13_5_;
		    try {
			class14_sub2_sub13
			    = (Class14_Sub2_Sub13) Class14_Sub8
						       .aClass81_2844
						       .method1400((byte) 40);
			if (class14_sub2_sub13 != null)
			    break;
			class14_sub2_sub13_5_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_408_;
		    }
		    return class14_sub2_sub13_5_;
		} while (false);
		do {
		    Class14_Sub2_Sub13 class14_sub2_sub13_6_;
		    try {
			if (class14_sub2_sub13.method330((byte) -103)
			    <= Class84.method1413((byte) -61))
			    break;
			class14_sub2_sub13_6_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_408_;
		    }
		    return class14_sub2_sub13_6_;
		} while (false);
		do {
		    Class14_Sub2_Sub13 class14_sub2_sub13_7_;
		    try {
			class14_sub2_sub13.method233(0);
			class14_sub2_sub13.method246(-26366);
			if ((~0x7fffffffffffffffL
			     & class14_sub2_sub13.aLong2737)
			    == 0L)
			    break;
			class14_sub2_sub13_7_ = class14_sub2_sub13;
		    } catch (RuntimeException runtimeexception) {
			break while_408_;
		    }
		    return class14_sub2_sub13_7_;
		} while (false);
		try {
		    /* empty */
		} catch (RuntimeException runtimeexception) {
		    break;
		}
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "lc.B(" + arg0 + ')');
    }
    
    public int[][] method474(int arg0, int arg1) {
    while_410_:
	do {
	    int[][] is;
	    do {
		int[][] is_8_;
		try {
		    is = aClass95_2838.method1481(1, arg0);
		    if (aClass95_2838.aBoolean1628) {
			int[][] is_9_ = method480(0, 0, arg0);
			int[] is_10_ = is_9_[0];
			int[] is_11_ = is_9_[2];
			int[] is_12_ = is_9_[1];
			int[] is_13_ = is[0];
			int[] is_14_ = is[1];
			int[] is_15_ = is[2];
			for (int i = 0;
			     ((i ^ 0xffffffff)
			      > (Class112.anInt1876 ^ 0xffffffff));
			     i++) {
			    int i_16_ = is_10_[i];
			    int i_17_ = i_16_ - anIntArray4415[0];
			    if (-1 < (i_17_ ^ 0xffffffff))
				i_17_ = -i_17_;
			    if (i_17_ > anInt4428) {
				is_13_[i] = i_16_;
				is_14_[i] = is_12_[i];
				is_15_[i] = is_11_[i];
			    } else {
				int i_18_ = is_12_[i];
				i_17_ = -anIntArray4415[1] + i_18_;
				if ((i_17_ ^ 0xffffffff) > -1)
				    i_17_ = -i_17_;
				if (anInt4428 < i_17_) {
				    is_13_[i] = i_16_;
				    is_14_[i] = i_18_;
				    is_15_[i] = is_11_[i];
				} else {
				    int i_19_ = is_11_[i];
				    i_17_ = -anIntArray4415[2] + i_19_;
				    if (0 > i_17_)
					i_17_ = -i_17_;
				    if (anInt4428 < i_17_) {
					is_13_[i] = i_16_;
					is_14_[i] = i_18_;
					is_15_[i] = i_19_;
				    } else {
					is_13_[i]
					    = i_16_ * anInt4423 >> 1803990444;
					is_14_[i]
					    = i_18_ * anInt4426 >> -1245385204;
					is_15_[i]
					    = i_19_ * anInt4421 >> 789330348;
				    }
				}
			    }
			}
		    }
		    anInt4424++;
		    if (arg1 <= -4)
			break;
		    is_8_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_410_;
		}
		return is_8_;
	    } while (false);
	    int[][] is_20_;
	    try {
		is_20_ = is;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is_20_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "lc.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method585(byte arg0) {
	try {
	    if (arg0 <= 86)
		anObject4417 = null;
	    anObject4417 = null;
	    anIntArray4422 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lc.E(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean4420 = true;
	anInt4429 = 0;
	anObject4417 = new Object();
    }
}
