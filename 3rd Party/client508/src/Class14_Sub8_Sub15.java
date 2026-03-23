/* Class14_Sub8_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.UnsupportedEncodingException;

public class Class14_Sub8_Sub15 extends Class14_Sub8
{
    public static int anInt4331;
    public static int anInt4332;
    public static int anInt4333;
    public static int anInt4334;
    public static int anInt4335 = 0;
    public static int[] anIntArray4336 = new int[5];
    public static int anInt4337;
    public static Class9 aClass9_4338;
    public int anInt4339 = 585;
    public static int anInt4340;
    
    public Class14_Sub8_Sub15() {
	super(0, true);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	    if (0 == i)
		anInt4339 = arg2.method784((byte) 115);
	    if (arg1 != 24777)
		anInt4339 = 19;
	    anInt4340++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("il.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method556(int arg0) {
	try {
	    anIntArray4336 = null;
	    aClass9_4338 = null;
	    if (arg0 <= 44)
		method558(78L, (byte) 109);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "il.D(" + arg0 + ')');
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4331++;
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 125);
	    if (arg1 > -58)
		method475(-113, -55, null);
	    if (aClass149_2851.aBoolean2402) {
		int i = Class133_Sub5.anIntArray3623[arg0];
		for (int i_1_ = 0; Class112.anInt1876 > i_1_; i_1_++) {
		    int i_2_ = Class14_Sub8_Sub4.anIntArray4145[i_1_];
		    if ((i_2_ ^ 0xffffffff) < (anInt4339 ^ 0xffffffff)
			&& i_2_ < -anInt4339 + 4096
			&& (i ^ 0xffffffff) < (2048 - anInt4339 ^ 0xffffffff)
			&& 2048 + anInt4339 > i) {
			int i_3_ = -i_2_ + 2048;
			i_3_ = -1 >= (i_3_ ^ 0xffffffff) ? i_3_ : -i_3_;
			i_3_ <<= 12;
			i_3_ /= 2048 - anInt4339;
			is_0_[i_1_] = 4096 + -i_3_;
		    } else if ((i_2_ ^ 0xffffffff) < (-anInt4339 + 2048
						      ^ 0xffffffff)
			       && anInt4339 + 2048 > i_2_) {
			int i_4_ = -2048 + i;
			i_4_ = -1 >= (i_4_ ^ 0xffffffff) ? i_4_ : -i_4_;
			i_4_ -= anInt4339;
			i_4_ <<= 12;
			is_0_[i_1_] = i_4_ / (-anInt4339 + 2048);
		    } else if ((i ^ 0xffffffff) > (anInt4339 ^ 0xffffffff)
			       || (i ^ 0xffffffff) < (-anInt4339 + 4096
						      ^ 0xffffffff)) {
			int i_5_ = -2048 + i_2_;
			i_5_ = i_5_ >= 0 ? i_5_ : -i_5_;
			i_5_ -= anInt4339;
			i_5_ <<= 12;
			is_0_[i_1_] = i_5_ / (-anInt4339 + 2048);
		    } else if (i_2_ < anInt4339 || 4096 + -anInt4339 < i_2_) {
			int i_6_ = -i + 2048;
			i_6_ = (i_6_ ^ 0xffffffff) <= -1 ? i_6_ : -i_6_;
			i_6_ <<= 12;
			i_6_ /= 2048 + -anInt4339;
			is_0_[i_1_] = 4096 - i_6_;
		    } else
			is_0_[i_1_] = 0;
		}
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("il.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static Class124 method557(int arg0, Class124 arg1, Class94 arg2) {
	Class124 class124;
	try {
	    anInt4334++;
	    int i = 78 / ((arg0 - 23) / 54);
	    if (0 != (arg1.method1700(-19928, Class14_Sub21.aClass124_3104)
		      ^ 0xffffffff)) {
		for (;;) {
		    int i_7_ = arg1.method1700(-19928, Class49.aClass124_816);
		    if (i_7_ == -1)
			break;
		    arg1 = (Class14_Sub8_Sub7.method515
			    ((new Class124[]
			      { arg1.method1697(0, i_7_, (byte) -104),
				(Class104.method1532
				 (4, Class26.method1010(0, arg2, (byte) 78))),
				arg1.method1696(i_7_ + 2, 15) }),
			     (byte) -16));
		}
		for (;;) {
		    int i_8_
			= arg1.method1700(-19928,
					  Class14_Sub8_Sub16.aClass124_4353);
		    if (0 == (i_8_ ^ 0xffffffff))
			break;
		    arg1 = (Class14_Sub8_Sub7.method515
			    ((new Class124[]
			      { arg1.method1697(0, i_8_, (byte) -104),
				(Class104.method1532
				 (4, Class26.method1010(1, arg2, (byte) 76))),
				arg1.method1696(i_8_ - -2, 15) }),
			     (byte) -111));
		}
		for (;;) {
		    int i_9_
			= arg1.method1700(-19928, Class138.aClass124_2207);
		    if (0 == (i_9_ ^ 0xffffffff))
			break;
		    arg1 = (Class14_Sub8_Sub7.method515
			    ((new Class124[]
			      { arg1.method1697(0, i_9_, (byte) -104),
				(Class104.method1532
				 (4, Class26.method1010(2, arg2, (byte) 110))),
				arg1.method1696(i_9_ + 2, 15) }),
			     (byte) -15));
		}
		for (;;) {
		    int i_10_
			= arg1.method1700(-19928,
					  Class14_Sub8_Sub13.aClass124_4313);
		    if ((i_10_ ^ 0xffffffff) == 0)
			break;
		    arg1 = (Class14_Sub8_Sub7.method515
			    ((new Class124[]
			      { arg1.method1697(0, i_10_, (byte) -104),
				(Class104.method1532
				 (4, Class26.method1010(3, arg2, (byte) 103))),
				arg1.method1696(i_10_ + 2, 15) }),
			     (byte) -60));
		}
		for (;;) {
		    int i_11_
			= arg1.method1700(-19928, Class134.aClass124_2599);
		    if ((i_11_ ^ 0xffffffff) == 0)
			break;
		    arg1 = (Class14_Sub8_Sub7.method515
			    ((new Class124[]
			      { arg1.method1697(0, i_11_, (byte) -104),
				(Class104.method1532
				 (4, Class26.method1010(4, arg2, (byte) 123))),
				arg1.method1696(i_11_ - -2, 15) }),
			     (byte) -93));
		}
		for (;;) {
		    int i_12_
			= arg1.method1700(-19928, Class26_Sub2.aClass124_3314);
		    if (0 == (i_12_ ^ 0xffffffff))
			break;
		    Class124 class124_13_ = Class14_Sub8_Sub9.aClass124_4244;
		    if (RuntimeException_Sub1.aClass31_2458 != null) {
			class124_13_
			    = Class107.method1552((RuntimeException_Sub1
						   .aClass31_2458.anInt526),
						  27968);
			try {
			    if (null != (RuntimeException_Sub1.aClass31_2458
					 .anObject530)) {
				byte[] is
				    = ((String) (RuntimeException_Sub1
						 .aClass31_2458.anObject530))
					  .getBytes("ISO-8859-1");
				class124_13_
				    = Class14.method231((byte) 114, is.length,
							is, 0);
			    }
			} catch (UnsupportedEncodingException unsupportedencodingexception) {
			    /* empty */
			}
		    }
		    arg1
			= (Class14_Sub8_Sub7.method515
			   (new Class124[] { arg1.method1697(0, i_12_,
							     (byte) -104),
					     class124_13_,
					     arg1.method1696(i_12_ - -4, 15) },
			    (byte) -104));
		}
	    }
	    class124 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("il.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class124;
    }
    
    public static void method558(long arg0, byte arg1) {
    while_377_:
	do {
	while_376_:
	    do {
		do {
		    try {
			anInt4333++;
			if (0L != arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_376_;
		    }
		    return;
		} while (false);
		try {
		    if (arg1 != -17)
			method557(114, null, null);
		    for (int i = 0; i < Class14_Sub2_Sub1.anInt3728; i++) {
			if (Class133_Sub1_Sub2.aLongArray4951[i] == arg0) {
			    Class14_Sub2_Sub1.anInt3728--;
			    Class14_Sub8_Sub7.anInt4210++;
			    for (int i_14_ = i;
				 ((Class14_Sub2_Sub1.anInt3728 ^ 0xffffffff)
				  < (i_14_ ^ 0xffffffff));
				 i_14_++) {
				Class14_Sub10.aClass124Array2938[i_14_]
				    = (Class14_Sub10.aClass124Array2938
				       [1 + i_14_]);
				Class45.anIntArray743[i_14_]
				    = Class45.anIntArray743[i_14_ + 1];
				Class14_Sub2_Sub15.aClass124Array3959[i_14_]
				    = (Class14_Sub2_Sub15.aClass124Array3959
				       [1 + i_14_]);
				Class133_Sub1_Sub2.aLongArray4951[i_14_]
				    = (Class133_Sub1_Sub2.aLongArray4951
				       [i_14_ + 1]);
				Class14_Sub2_Sub1.anIntArray3720[i_14_]
				    = (Class14_Sub2_Sub1.anIntArray3720
				       [1 + i_14_]);
				Class58.aBooleanArray950[i_14_]
				    = Class58.aBooleanArray950[i_14_ - -1];
			    }
			    Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 132);
			    Class55.aClass14_Sub10_Sub1_891
				.method817(arg0, arg1 ^ ~0x49);
			    break;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_377_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "il.E(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
}
