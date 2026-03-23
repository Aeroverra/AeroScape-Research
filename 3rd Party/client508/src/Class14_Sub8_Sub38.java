/* Class14_Sub8_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub38 extends Class14_Sub8
{
    public int anInt4726;
    public static int anInt4727 = 0;
    public static int anInt4728;
    public static int anInt4729 = 0;
    public static int anInt4730;
    public static int anInt4731;
    public int anInt4732 = 204;
    public int anInt4733;
    public static Class14_Sub10_Sub1 aClass14_Sub10_Sub1_4734
	= new Class14_Sub10_Sub1(5000);
    public static int anInt4735;
    public static int anInt4736;
    public static int anInt4737;
    public static int anInt4738;
    public static Class9_Sub1 aClass9_Sub1_4739;
    public static int anInt4740 = 0;
    public static int anInt4741;
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4738++;
	    int i = arg0;
	while_519_:
	    do {
		do {
		    if (i != 0) {
			if ((i ^ 0xffffffff) != -2) {
			    if (2 == i)
				break;
			    break while_519_;
			}
		    } else {
			anInt4733 = arg2.method798(arg1 ^ ~0x60d7);
			break while_519_;
		    }
		    anInt4726 = arg2.method798(arg1 + -24709);
		    break while_519_;
		} while (false);
		anInt4732 = arg2.method784((byte) 107);
	    } while (false);
	    if (arg1 != 24777)
		anInt4733 = 101;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wa.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method674(byte arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    anInt4737++;
	    int i = arg4;
	    if (arg0 != 92)
		method677(-98);
	    for (/**/; i <= arg5; i++)
		Class51.method1201(Class14_Sub2_Sub19.anIntArrayArray4038[i],
				   arg3, arg1, -5973, arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wa.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
    while_520_:
	do {
	    do {
		int[] is;
		try {
		    if (arg1 <= -58)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_520_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 110);
		anInt4728++;
		if (aClass149_2851.aBoolean2402) {
		    int i = 0;
		    for (/**/; Class112.anInt1876 > i; i++) {
			int i_1_ = Class133_Sub5.anIntArray3623[arg0];
			int i_2_ = anInt4726 * i_1_ >> -1683990996;
			int i_3_ = i_1_ % (4096 / anInt4726) * anInt4726;
			int i_4_ = Class14_Sub8_Sub4.anIntArray4145[i];
			int i_5_ = anInt4733 * i_4_ >> -1109716788;
			int i_6_ = anInt4733 * (i_4_ % (4096 / anInt4733));
			if (anInt4732 > i_3_) {
			    for (i_5_ -= i_2_; i_5_ < 0; i_5_ += 4) {
				/* empty */
			    }
			    for (/**/; (i_5_ ^ 0xffffffff) < -4; i_5_ -= 4) {
				/* empty */
			    }
			    if (1 != i_5_) {
				is_0_[i] = 0;
				continue;
			    }
			    if (anInt4732 > i_6_) {
				is_0_[i] = 0;
				continue;
			    }
			}
			if (anInt4732 > i_6_) {
			    for (i_5_ -= i_2_; -1 < (i_5_ ^ 0xffffffff);
				 i_5_ += 4) {
				/* empty */
			    }
			    for (/**/; i_5_ > 3; i_5_ -= 4) {
				/* empty */
			    }
			    if (i_5_ > 0) {
				is_0_[i] = 0;
				continue;
			    }
			}
			is_0_[i] = 4096;
		    }
		}
		is = is_0_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "wa.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static long method675(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return 0L;
	for (int i = 0; i < class14_sub29.anInt3242; i++) {
	    Class40 class40 = class14_sub29.aClass40Array3257[i];
	    if ((class40.aLong677 >> 29 & 0x3L) == 2L
		&& class40.anInt668 == arg1 && class40.anInt678 == arg2)
		return class40.aLong677;
	}
	return 0L;
    }
    
    public Class14_Sub8_Sub38() {
	super(0, true);
	anInt4726 = 1;
	anInt4733 = 1;
    }
    
    public static void method676(int arg0) {
	try {
	    anInt4730++;
	    if (Class67.aClass97_1055 != null) {
		Class97 class97 = Class67.aClass97_1055;
		synchronized (class97) {
		    Class67.aClass97_1055 = null;
		}
	    }
	    int i = 113 / ((-19 - arg0) / 58);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wa.D(" + arg0 + ')');
	}
    }
    
    public static void method677(int arg0) {
	try {
	    aClass14_Sub10_Sub1_4734 = null;
	    if (arg0 <= 55)
		anInt4727 = -94;
	    aClass9_Sub1_4739 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wa.B(" + arg0 + ')');
	}
    }
}
