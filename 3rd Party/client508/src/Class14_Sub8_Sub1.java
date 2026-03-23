/* Class14_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class14_Sub8_Sub1 extends Class14_Sub8
{
    public static int anInt4091;
    public int anInt4092;
    public static int anInt4093;
    public static int anInt4094;
    public int anInt4095 = 2000;
    public static int anInt4096;
    public int anInt4097;
    public static Class76 aClass76_4098;
    public static int anInt4099;
    public static Class124 aClass124_4100;
    public static Class124 aClass124_4101
	= Class14_Sub2_Sub2.method263(1178, "<col=ff9040>");
    public static int anInt4102;
    public int anInt4103 = 0;
    public static int[] anIntArray4104 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
    public static int anInt4105;
    public int anInt4106;
    
    public static Class14_Sub2_Sub19_Sub1 method485(int arg0, Class9 arg1,
						    int arg2, int arg3) {
    while_261_:
	do {
	    do {
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
		try {
		    anInt4093++;
		    if (Class109.method1564(-2, arg3, arg2, arg1))
			break;
		    class14_sub2_sub19_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_261_;
		}
		return class14_sub2_sub19_sub1;
	    } while (false);
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
	    try {
		int i = -99 % ((-40 - arg0) / 57);
		class14_sub2_sub19_sub1
		    = Class14_Sub8_Sub30.method641((byte) -120);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("c.E(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ')'));
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4105++;
	    if (arg1 > -58)
		method475(73, -26, null);
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 110);
	    if (aClass149_2851.aBoolean2402) {
		int i = anInt4092 >> 1251255041;
		int[][] is_1_ = aClass149_2851.method2019(true);
		Random random = new Random((long) anInt4106);
		for (int i_2_ = 0; i_2_ < anInt4095; i_2_++) {
		    int i_3_
			= (0 < anInt4092
			   ? (anInt4103 + -i
			      + Class138.method1949(random, anInt4092, -32640))
			   : anInt4103);
		    int i_4_ = Class138.method1949(random, Class112.anInt1876,
						   -32640);
		    i_3_ = i_3_ >> -238793916 & 0xff;
		    int i_5_ = Class138.method1949(random, Class17.anInt407,
						   -32640);
		    int i_6_
			= (i_4_
			   - -(anInt4097 * Class99_Sub2.anIntArray3357[i_3_]
			       >> 1199817804));
		    int i_7_
			= ((Class14_Sub8_Sub21.anIntArray4435[i_3_] * anInt4097
			    >> -24607988)
			   + i_5_);
		    int i_8_ = -i_5_ + i_7_;
		    int i_9_ = i_6_ + -i_4_;
		    if (0 != i_9_ || 0 != i_8_) {
			if (-1 < (i_9_ ^ 0xffffffff))
			    i_9_ = -i_9_;
			if (0 > i_8_)
			    i_8_ = -i_8_;
			boolean bool
			    = (i_8_ ^ 0xffffffff) < (i_9_ ^ 0xffffffff);
			if (bool) {
			    int i_10_ = i_4_;
			    i_4_ = i_5_;
			    i_5_ = i_10_;
			    int i_11_ = i_6_;
			    i_6_ = i_7_;
			    i_7_ = i_11_;
			}
			if ((i_6_ ^ 0xffffffff) > (i_4_ ^ 0xffffffff)) {
			    int i_12_ = i_4_;
			    i_4_ = i_6_;
			    i_6_ = i_12_;
			    int i_13_ = i_5_;
			    i_5_ = i_7_;
			    i_7_ = i_13_;
			}
			int i_14_ = i_5_;
			int i_15_ = -i_4_ + i_6_;
			int i_16_ = i_7_ - i_5_;
			int i_17_ = 1024 + -(Class138.method1949(random, 4096,
								 -32640)
					     >> 298354370);
			int i_18_ = ((i_7_ ^ 0xffffffff) < (i_5_ ^ 0xffffffff)
				     ? 1 : -1);
			int i_19_ = -i_15_ / 2;
			int i_20_ = 2048 / i_15_;
			if (-1 < (i_16_ ^ 0xffffffff))
			    i_16_ = -i_16_;
			for (int i_21_ = i_4_;
			     (i_6_ ^ 0xffffffff) < (i_21_ ^ 0xffffffff);
			     i_21_++) {
			    i_19_ += i_16_;
			    int i_22_ = Class14_Sub10_Sub1.anInt4882 & i_21_;
			    int i_23_
				= i_17_ + (1024 + (-i_4_ + i_21_) * i_20_);
			    int i_24_ = Class115.anInt1927 & i_14_;
			    if (!bool)
				is_1_[i_22_][i_24_] = i_23_;
			    else
				is_1_[i_24_][i_22_] = i_23_;
			    if (i_19_ > 0) {
				i_19_ = -i_15_ + i_19_;
				i_14_ -= -i_18_;
			    }
			}
		    }
		}
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("c.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public Class14_Sub8_Sub1() {
	super(0, true);
	anInt4092 = 4096;
	anInt4106 = 0;
	anInt4097 = 16;
    }
    
    public static void method486(int arg0) {
	try {
	    aClass76_4098 = null;
	    aClass124_4101 = null;
	    aClass124_4100 = null;
	    if (arg0 < 61)
		anInt4102 = -22;
	    anIntArray4104 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "c.D(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_264_:
	    do {
	    while_263_:
		do {
		while_262_:
		    do {
			do {
			    if ((i ^ 0xffffffff) != -1) {
				if (i != 1) {
				    if (i != 2) {
					if ((i ^ 0xffffffff) != -4) {
					    if ((i ^ 0xffffffff) == -5)
						break while_263_;
					    break while_264_;
					}
				    } else
					break;
				    break while_262_;
				}
			    } else {
				anInt4106 = arg2.method798(73);
				break while_264_;
			    }
			    anInt4095 = arg2.method784((byte) 118);
			    break while_264_;
			} while (false);
			anInt4097 = arg2.method798(88);
			break while_264_;
		    } while (false);
		    anInt4103 = arg2.method784((byte) 121);
		    break while_264_;
		} while (false);
		anInt4092 = arg2.method784((byte) 109);
	    } while (false);
	    anInt4096++;
	    if (arg1 != 24777)
		anIntArray4104 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("c.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method487(byte arg0, int arg1, Class94 arg2, int arg3) {
    while_266_:
	do {
	while_265_:
	    do {
		do {
		    try {
			anInt4099++;
			if ((Class14_Sub8_Sub33.anInt4633 ^ 0xffffffff) == -1
			    || -4 == (Class14_Sub8_Sub33.anInt4633
				      ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_265_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg2.method1473(0))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_265_;
		    }
		    return;
		} while (false);
		do {
		    try {
			int i = arg2.anIntArray1522[arg1];
			if ((i ^ 0xffffffff) >= (arg3 ^ 0xffffffff)
			    && ((arg3 ^ 0xffffffff)
				>= (i + arg2.anIntArray1614[arg1]
				    ^ 0xffffffff)))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_265_;
		    }
		    return;
		} while (false);
		try {
		    arg3 -= arg2.anInt1518 / 2;
		    int i = (Class14_Sub8_Sub19.anInt4408 - -Class41.anInt696
			     & 0x7ff);
		    arg1 -= arg2.anInt1545 / 2;
		    int i_25_ = Class3.anIntArray108[i];
		    i_25_ = i_25_ * (Class32.anInt551 - -256) >> -69244728;
		    int i_26_ = Class3.anIntArray111[i];
		    i_26_ = i_26_ * (256 + Class32.anInt551) >> -1977438104;
		    int i_27_ = i_25_ * arg1 + arg3 * i_26_ >> 2019335659;
		    int i_28_ = arg1 * i_26_ - arg3 * i_25_ >> -1738721813;
		    int i_29_ = (i_27_ + (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3495)
				 >> 1820713575);
		    int i_30_
			= ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
			    - i_28_)
			   >> 1794474343);
		    if (Class152.anInt2439 > 0
			&& Class14_Sub8_Sub29.aBooleanArray4581[82]
			&& Class14_Sub8_Sub29.aBooleanArray4581[81])
			Class7_Sub2.method125(Class133_Sub6.anInt3676 + i_29_,
					      i_30_ + Class58.anInt947, 63,
					      Class14_Sub2_Sub3.anInt3785);
		    else {
			boolean bool = (Class14_Sub8_Sub35.method663
					((Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anIntArray3476[0]),
					 0, 0, 0, (byte) 109,
					 (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anIntArray3443[0]),
					 true, 0, i_29_, 1, 0, i_30_));
			if (bool) {
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      arg3);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      arg1);
			    Class55.aClass14_Sub10_Sub1_891.method833
				((byte) 124, Class14_Sub8_Sub19.anInt4408);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      57);
			    Class55.aClass14_Sub10_Sub1_891
				.method809(false, Class41.anInt696);
			    Class55.aClass14_Sub10_Sub1_891
				.method809(false, Class32.anInt551);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      89);
			    Class55.aClass14_Sub10_Sub1_891.method833
				((byte) 126,
				 (Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anInt3495));
			    Class55.aClass14_Sub10_Sub1_891.method833
				((byte) 87,
				 (Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anInt3436));
			    Class55.aClass14_Sub10_Sub1_891
				.method809(false, Class14_Sub10.anInt2911);
			    Class55.aClass14_Sub10_Sub1_891.method809(false,
								      63);
			}
		    }
		    if (arg0 < 88)
			method487((byte) -95, -34, null, 123);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_266_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("c.B(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	} while (false);
    }
    
    public void method472(int arg0) {
	try {
	    anInt4094++;
	    if (arg0 != 0)
		method487((byte) 3, -116, null, -26);
	    Class14_Sub2_Sub12.method321(256);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "c.I(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_4100 = Class14_Sub2_Sub2.method263(1178, "Lade)3)3)3");
    }
}
