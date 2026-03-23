/* Class14_Sub8_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub39 extends Class14_Sub8
{
    public static int anInt4742;
    public int[] anIntArray4743;
    public int anInt4744;
    public static int anInt4745;
    public static int anInt4746;
    public static short[] aShortArray4747 = new short[256];
    public static int anInt4748;
    public static int anInt4749;
    public static int anInt4750;
    public static int anInt4751;
    public int anInt4752 = -1;
    public int anInt4753;
    public static int anInt4754 = 0;
    
    public static int method678(boolean arg0, int arg1, int arg2) {
	int i;
	try {
	    anInt4749++;
	    if (arg0)
		aShortArray4747 = null;
	    int i_0_ = arg2 * 57 + arg1;
	    i_0_ ^= i_0_ << 1086421261;
	    int i_1_ = (0x7fffffff
			& i_0_ * (i_0_ * i_0_ * 15731 - -789221) + 1376312589);
	    i = (i_1_ & 0x7fd9819) >> 1038550579;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wk.AA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public boolean method679(boolean arg0) {
    while_521_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 != true)
			method679(true);
		    anInt4745++;
		    if (anIntArray4743 == null)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_521_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (anInt4752 < 0)
			break;
		    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1
			= Class14_Sub2_Sub3.method269(Class7_Sub2.aClass9_2671,
						      0, anInt4752);
		    class14_sub2_sub19_sub1.method404();
		    anInt4753 = class14_sub2_sub19_sub1.anInt4035;
		    anInt4744 = class14_sub2_sub19_sub1.anInt4042;
		    anIntArray4743 = class14_sub2_sub19_sub1.anIntArray5088;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_521_;
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
	throw Class14_Sub8_Sub14.method554(throwable, "wk.DA(" + arg0 + ')');
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_523_:
	do {
	while_522_:
	    do {
		do {
		    try {
			anInt4750++;
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_522_;
		    }
		    return;
		} while (false);
		try {
		    if (-1 == (arg0 ^ 0xffffffff))
			anInt4752 = arg2.method784((byte) 119);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_523_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("wk.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub39() {
	super(0, false);
    }
    
    public void method478(int arg0) {
	try {
	    super.method478(arg0);
	    anInt4746++;
	    anIntArray4743 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wk.U(" + arg0 + ')');
	}
    }
    
    public int method477(int arg0) {
	int i;
	try {
	    if (arg0 != -2538)
		method682(85, -123);
	    anInt4751++;
	    i = anInt4752;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wk.V(" + arg0 + ')');
	}
	return i;
    }
    
    public static void method680(byte arg0) {
	try {
	    aShortArray4747 = null;
	    if (arg0 >= -66)
		anInt4754 = 61;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wk.BA(" + arg0 + ')');
	}
    }
    
    public static Class113 method681(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	Class113 class113 = class14_sub29.aClass113_3250;
	class14_sub29.aClass113_3250 = null;
	return class113;
    }
    
    public static boolean method682(int arg0, int arg1) {
	boolean bool;
	try {
	    anInt4742++;
	    if (arg0 != 65280)
		method678(false, -93, 96);
	    bool = (0x1 & arg1) != 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wk.W(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    if (arg1 > -4)
		aShortArray4747 = null;
	    anInt4748++;
	    int[][] is_2_ = aClass95_2838.method1481(1, arg0);
	    if (aClass95_2838.aBoolean1628 && method679(true)) {
		int[] is_3_ = is_2_[0];
		int[] is_4_ = is_2_[1];
		int[] is_5_ = is_2_[2];
		int i = (anInt4753
			 * ((anInt4744 ^ 0xffffffff) == (Class17.anInt407
							 ^ 0xffffffff)
			    ? arg0 : anInt4744 * arg0 / Class17.anInt407));
		if ((Class112.anInt1876 ^ 0xffffffff)
		    != (anInt4753 ^ 0xffffffff)) {
		    for (int i_6_ = 0; ((Class112.anInt1876 ^ 0xffffffff)
					< (i_6_ ^ 0xffffffff)); i_6_++) {
			int i_7_ = i_6_ * anInt4753 / Class112.anInt1876;
			int i_8_ = anIntArray4743[i + i_7_];
			is_5_[i_6_] = (Class14_Sub8_Sub26.method617(255, i_8_)
				       << -15524892);
			is_4_[i_6_]
			    = (Class14_Sub8_Sub26.method617(i_8_, 65280)
			       >> -1522129820);
			is_3_[i_6_]
			    = (Class14_Sub8_Sub26.method617(16711680, i_8_)
			       >> -2118832596);
		    }
		} else {
		    for (int i_9_ = 0; Class112.anInt1876 > i_9_; i_9_++) {
			int i_10_ = anIntArray4743[i++];
			is_5_[i_9_]
			    = Class14_Sub8_Sub26
				  .method617(4080, i_10_ << -950424828);
			is_4_[i_9_]
			    = (Class14_Sub8_Sub26.method617(i_10_, 65280)
			       >> 1706426244);
			is_3_[i_9_]
			    = Class14_Sub8_Sub26
				  .method617(4080, i_10_ >> -297320020);
		    }
		}
	    }
	    is = is_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wk.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
}
