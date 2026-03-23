/* Class14_Sub8_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class14_Sub8_Sub34 extends Class14_Sub8
{
    public static int anInt4645;
    public int anInt4646;
    public static Class43 aClass43_4647;
    public int[][] anIntArrayArray4648;
    public int anInt4649;
    public static int anInt4650;
    public int anInt4651 = 204;
    public int anInt4652;
    public static Class124 aClass124_4653
	= Class14_Sub2_Sub2.method263(1178, "<col=ff3000>");
    public int anInt4654;
    public int anInt4655;
    public static int anInt4656;
    public int anInt4657;
    public int[][] anIntArrayArray4658;
    public static int anInt4659;
    public static int anInt4660;
    public static int anInt4661;
    public int anInt4662;
    public int[] anIntArray4663;
    public int anInt4664;
    public int anInt4665;
    public static int anInt4666 = -2;
    public static int anInt4667;
    public int anInt4668;
    
    public Class14_Sub8_Sub34() {
	super(0, true);
	anInt4646 = 81;
	anInt4655 = 1024;
	anInt4649 = 4;
	anInt4657 = 409;
	anInt4652 = 0;
	anInt4665 = 8;
	anInt4664 = 1024;
    }
    
    public static float[] method657(int arg0, int arg1) {
    while_491_:
	do {
	    float f;
	    int i;
	    do {
		float[] fs;
		try {
		    anInt4645++;
		    f = Class57.method1247() + Class57.method1249();
		    i = Class57.method1251();
		    Class14_Sub2_Sub15.aFloatArray3964[3] = 1.0F;
		    if (arg0 == 81)
			break;
		    fs = null;
		} catch (RuntimeException runtimeexception) {
		    break while_491_;
		}
		return fs;
	    } while (false);
	    float[] fs;
	    try {
		float f_0_ = (float) ((i & 0xff52) >> -840357784) / 255.0F;
		float f_1_ = (float) (i >> -1040636080 & 0xff) / 255.0F;
		float f_2_ = (float) (0xff & i) / 255.0F;
		float f_3_ = 0.58823526F;
		Class14_Sub2_Sub15.aFloatArray3964[2]
		    = f_3_ * ((float) Class14_Sub8_Sub26.method617(arg1, 255)
			      / 255.0F * f_2_) * f;
		Class14_Sub2_Sub15.aFloatArray3964[0]
		    = f_3_ * (f_1_ * ((float) (Class14_Sub8_Sub26
						   .method617(16764275, arg1)
					       >> -954026960)
				      / 255.0F)) * f;
		Class14_Sub2_Sub15.aFloatArray3964[1]
		    = f * (f_3_
			   * ((float) Class14_Sub8_Sub26
					  .method617(255, arg1 >> 841919144)
			      / 255.0F * f_0_));
		fs = Class14_Sub2_Sub15.aFloatArray3964;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return fs;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ud.L(" + arg0 + ',' + arg1 + ')');
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4659++;
	    int[] is_4_ = aClass149_2851.method2014(arg0, (byte) 103);
	    if (arg1 >= -58)
		method660(false);
	    if (aClass149_2851.aBoolean2402) {
		int i = 0;
		int i_5_;
		for (i_5_ = anInt4652 + Class133_Sub5.anIntArray3623[arg0];
		     -1 < (i_5_ ^ 0xffffffff); i_5_ += 4096) {
		    /* empty */
		}
		for (/**/; (i_5_ ^ 0xffffffff) < -4097; i_5_ -= 4096) {
		    /* empty */
		}
		for (/**/; i < anInt4665 && anIntArray4663[i] <= i_5_; i++) {
		    /* empty */
		}
		boolean bool = 0 == (0x1 & i);
		int i_6_ = -1 + i;
		int i_7_ = anIntArray4663[i];
		int i_8_ = anIntArray4663[-1 + i];
		if (anInt4662 + i_8_ >= i_5_
		    || (i_5_ ^ 0xffffffff) <= (i_7_ - anInt4662 ^ 0xffffffff))
		    Class72.method1324(is_4_, 0, Class112.anInt1876, 0);
		else {
		    for (int i_9_ = 0;
			 ((i_9_ ^ 0xffffffff)
			  > (Class112.anInt1876 ^ 0xffffffff));
			 i_9_++) {
			int i_10_ = bool ? anInt4664 : -anInt4664;
			int i_11_ = ((anInt4654 * i_10_ >> -421672980)
				     + Class14_Sub8_Sub4.anIntArray4145[i_9_]);
			int i_12_ = 0;
			for (/**/; 0 > i_11_; i_11_ += 4096) {
			    /* empty */
			}
			for (/**/; -4097 > (i_11_ ^ 0xffffffff);
			     i_11_ -= 4096) {
			    /* empty */
			}
			for (/**/;
			     (anInt4649 > i_12_
			      && anIntArrayArray4658[i_6_][i_12_] <= i_11_);
			     i_12_++) {
			    /* empty */
			}
			int i_13_ = anIntArrayArray4658[i_6_][i_12_];
			int i_14_ = i_12_ - 1;
			int i_15_ = anIntArrayArray4658[i_6_][i_14_];
			if (i_11_ > i_15_ - -anInt4662
			    && -anInt4662 + i_13_ > i_11_)
			    is_4_[i_9_] = anIntArrayArray4648[i_6_][i_14_];
			else
			    is_4_[i_9_] = 0;
		    }
		}
	    }
	    is = is_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ud.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static int method658(byte arg0, int arg1) {
    while_492_:
	do {
	    do {
		int i;
		try {
		    anInt4661++;
		    if ((arg1 ^ 0xffffffff) <= -1)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_492_;
		}
		return i;
	    } while (false);
	    Class14_Sub25 class14_sub25;
	    do {
		int i;
		try {
		    class14_sub25
			= ((Class14_Sub25)
			   Class132.aClass55_2167.method1230((long) arg1,
							     (byte) -115));
		    if (class14_sub25 != null)
			break;
		    i = Class17.method960(arg0 ^ ~0x5ee3, arg1).anInt4062;
		} catch (RuntimeException runtimeexception) {
		    break while_492_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_16_ = 0;
		if (arg0 != -111)
		    aClass124_4653 = null;
		for (int i_17_ = 0;
		     class14_sub25.anIntArray3178.length > i_17_; i_17_++) {
		    if (-1 == class14_sub25.anIntArray3178[i_17_])
			i_16_++;
		}
		i_16_ += (Class17.method960(24205, arg1).anInt4062
			  - class14_sub25.anIntArray3178.length);
		i = i_16_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ud.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method659(int arg0) {
	try {
	    anInt4656++;
	    Random random = new Random((long) anInt4665);
	    anIntArray4663 = new int[anInt4665 + 1];
	    anIntArray4663[0] = 0;
	    anIntArrayArray4658 = new int[anInt4665][anInt4649 - -1];
	    anIntArrayArray4648 = new int[anInt4665][anInt4649];
	    anInt4668 = 4096 / anInt4665;
	    int i = anInt4668 / 2;
	    anInt4662 = anInt4646 / 2;
	    anInt4654 = 4096 / anInt4649;
	    int i_18_ = anInt4654 / 2;
	    for (int i_19_ = 0; anInt4665 > i_19_; i_19_++) {
		if ((i_19_ ^ 0xffffffff) < -1) {
		    int i_20_ = anInt4668;
		    int i_21_ = ((Class138.method1949(random, 4096, -32640)
				  + -2048) * anInt4651
				 >> -512706708);
		    i_20_ += i * i_21_ >> -1544916500;
		    anIntArray4663[i_19_]
			= anIntArray4663[-1 + i_19_] - -i_20_;
		}
		anIntArrayArray4658[i_19_][0] = 0;
		for (int i_22_ = 0; anInt4649 > i_22_; i_22_++) {
		    if (0 < i_22_) {
			int i_23_ = anInt4654;
			int i_24_ = ((-2048 + Class138.method1949(random, 4096,
								  -32640))
				     * anInt4657) >> 562468172;
			i_23_ += i_24_ * i_18_ >> -863742036;
			anIntArrayArray4658[i_19_][i_22_]
			    = i_23_ + anIntArrayArray4658[i_19_][i_22_ - 1];
		    }
		    anIntArrayArray4648[i_19_][i_22_]
			= ((anInt4655 ^ 0xffffffff) < -1
			   ? (-Class138.method1949(random, anInt4655, -32640)
			      + 4096)
			   : 4096);
		}
		anIntArrayArray4658[i_19_][anInt4649] = 4096;
	    }
	    if (arg0 <= 30)
		method484(-111, (byte) -38);
	    anIntArray4663[anInt4665] = 4096;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ud.M(" + arg0 + ')');
	}
    }
    
    public static void method660(boolean arg0) {
	try {
	    aClass43_4647 = null;
	    aClass124_4653 = null;
	    if (arg0)
		method661(false, 105);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ud.J(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub3 method661(boolean arg0, int arg1) {
    while_493_:
	do {
	    do {
		Class14_Sub2_Sub3 class14_sub2_sub3;
		try {
		    if (arg0 == true)
			break;
		    class14_sub2_sub3 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_493_;
		}
		return class14_sub2_sub3;
	    } while (false);
	    do {
		Class14_Sub2_Sub3 class14_sub2_sub3;
		try {
		    anInt4660++;
		    Class14_Sub2_Sub3 class14_sub2_sub3_25_
			= ((Class14_Sub2_Sub3)
			   Class75.aClass20_1147.method974((long) arg1, 0));
		    if (class14_sub2_sub3_25_ == null)
			break;
		    class14_sub2_sub3 = class14_sub2_sub3_25_;
		} catch (RuntimeException runtimeexception) {
		    break while_493_;
		}
		return class14_sub2_sub3;
	    } while (false);
	    Class14_Sub2_Sub3 class14_sub2_sub3;
	    try {
		byte[] is
		    = Class14_Sub8_Sub17.aClass9_4371.method163(arg1, 26, 0);
		Class14_Sub2_Sub3 class14_sub2_sub3_26_
		    = new Class14_Sub2_Sub3();
		if (null != is)
		    class14_sub2_sub3_26_.method268(new Class14_Sub10(is), -1);
		Class75.aClass20_1147.method971(-1, class14_sub2_sub3_26_,
						(long) arg1);
		class14_sub2_sub3 = class14_sub2_sub3_26_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub3;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ud.K(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method472(int arg0) {
	try {
	    method659(88);
	    anInt4667++;
	    if (arg0 != 0)
		anInt4652 = 125;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ud.I(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4650++;
	    int i = arg0;
	while_499_:
	    do {
	    while_498_:
		do {
		while_497_:
		    do {
		    while_496_:
			do {
			while_495_:
			    do {
			    while_494_:
				do {
				    do {
					if (i != 0) {
					    if ((i ^ 0xffffffff) != -2) {
						if ((i ^ 0xffffffff) != -3) {
						    if (-4
							!= (i ^ 0xffffffff)) {
							if (i != 4) {
							    if (i != 5) {
								if (-7
								    != (i
									^ 0xffffffff)) {
								    if ((i
									 ^ 0xffffffff)
									!= -8)
									break while_499_;
								} else
								    break while_497_;
								break while_498_;
							    }
							} else
							    break while_495_;
							break while_496_;
						    }
						} else
						    break;
						break while_494_;
					    }
					} else {
					    anInt4649
						= arg2.method798(arg1
								 ^ ~0x60e2);
					    break while_499_;
					}
					anInt4665
					    = arg2.method798(arg1 + -24815);
					break while_499_;
				    } while (false);
				    anInt4657 = arg2.method784((byte) 127);
				    break while_499_;
				} while (false);
				anInt4651 = arg2.method784((byte) 115);
				break while_499_;
			    } while (false);
			    anInt4664 = arg2.method784((byte) 119);
			    break while_499_;
			} while (false);
			anInt4652 = arg2.method784((byte) 101);
			break while_499_;
		    } while (false);
		    anInt4646 = arg2.method784((byte) 112);
		    break while_499_;
		} while (false);
		anInt4655 = arg2.method784((byte) 107);
	    } while (false);
	    if (arg1 != 24777)
		anInt4646 = 7;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ud.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
}
