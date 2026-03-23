/* Class14_Sub8_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.KeyEvent;
import java.util.Random;

public class Class14_Sub8_Sub36 extends Class14_Sub8
{
    public static int[] anIntArray4691;
    public int anInt4692 = 1;
    public static int anInt4693;
    public static Class124 aClass124_4694;
    public static int anInt4695;
    public static Class124 aClass124_4696;
    public static int anInt4697;
    public static boolean[] aBooleanArray4698 = new boolean[100];
    public byte[] aByteArray4699;
    public static Class124 aClass124_4700;
    public int anInt4701;
    public static Class124 aClass124_4702;
    public short[] aShortArray4703 = new short[512];
    public static long aLong4704;
    public int anInt4705;
    public static Class124 aClass124_4706;
    public static int anInt4707;
    public static int anInt4708;
    public static int anInt4709;
    public int anInt4710;
    public static int anInt4711;
    public int anInt4712;
    public static int anInt4713;
    public int anInt4714;
    
    public static void method668(byte arg0) {
	try {
	    aClass124_4700 = null;
	    anIntArray4691 = null;
	    aClass124_4706 = null;
	    aBooleanArray4698 = null;
	    if (arg0 != -109)
		method672(45, 43, -12, 30, 57, null, -48);
	    aClass124_4702 = null;
	    aClass124_4696 = null;
	    aClass124_4694 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "va.H(" + arg0 + ')');
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_4_:
	    do {
	    while_3_:
		do {
		while_2_:
		    do {
		    while_1_:
			do {
			while_0_:
			    do {
				do {
				    if (-1 != (i ^ 0xffffffff)) {
					if (1 != i) {
					    if ((i ^ 0xffffffff) != -3) {
						if ((i ^ 0xffffffff) != -4) {
						    if (-5
							!= (i ^ 0xffffffff)) {
							if (i != 5) {
							    if (-7
								== (i
								    ^ 0xffffffff))
								break while_3_;
							    break while_4_;
							}
						    } else
							break while_1_;
						    break while_2_;
						}
					    } else
						break;
					    break while_0_;
					}
				    } else {
					anInt4701 = anInt4712
					    = arg2.method798(67);
					break while_4_;
				    }
				    anInt4705 = arg2.method798(-13);
				    break while_4_;
				} while (false);
				anInt4710 = arg2.method784((byte) 125);
				break while_4_;
			    } while (false);
			    anInt4714 = arg2.method798(98);
			    break while_4_;
			} while (false);
			anInt4692 = arg2.method798(arg1 + -24651);
			break while_4_;
		    } while (false);
		    anInt4701 = arg2.method798(-25);
		    break while_4_;
		} while (false);
		anInt4712 = arg2.method798(-20);
	    } while (false);
	    anInt4695++;
	    if (arg1 != 24777)
		method472(-124);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("va.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
  public static void method669(int arg0) {
    try
    {
      anInt4697 += 1;
      synchronized (Class14_Sub8_Sub20.anObject4417) {
        if (arg0 <= 61)
        return;

        if ((Class138.anInt2223 ^ 0xFFFFFFFF) != -1)
        Class138.anInt2223 = 1; 
        try { Class14_Sub8_Sub20.anObject4417.wait();
        } catch (InterruptedException localInterruptedException) {
        }
      }
    } catch (RuntimeException localRuntimeException) {
      throw Class14_Sub8_Sub14.method554(localRuntimeException, "va.D(" + arg0 + ')');
    }
  }
    
    public Class14_Sub8_Sub36() {
	super(0, true);
	aByteArray4699 = new byte[512];
	anInt4701 = 5;
	anInt4705 = 0;
	anInt4712 = 5;
	anInt4710 = 2048;
	anInt4714 = 2;
    }
    
    public void method472(int arg0) {
	try {
	    anInt4707++;
	    aByteArray4699
		= Class14_Sub8_Sub10.method527(anInt4705, (byte) -84);
	    method670(11672);
	    if (arg0 != 0)
		method484(-64, (byte) -59);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "va.I(" + arg0 + ')');
	}
    }
    
    public void method670(int arg0) {
    while_6_:
	do {
	try {
	while_5_:
	    do {
		do {
		    try {
			if (arg0 == 11672)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_5_;
		    }
		    return;
		} while (false);
		try {
		    anInt4711++;
		    Random random = new Random((long) anInt4705);
		    aShortArray4703 = new short[512];
		    if ((anInt4710 ^ 0xffffffff) < -1) {
			for (int i = 0; (i ^ 0xffffffff) > -513; i++)
			    aShortArray4703[i]
				= (short) Class138.method1949(random,
							      anInt4710,
							      -32640);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_6_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "va.E(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static int method671(KeyEvent arg0, int arg1) {
	try {
    while_7_:
	do {
	int i_1_;
	    int i;
	    do {
		int i_0_;
		try {
		    anInt4709++;
		    i = arg0.getKeyChar();
		    if (-8365 != (i ^ 0xffffffff))
			break;
		    i_0_ = 128;
		} catch (RuntimeException runtimeexception) {
		    break while_7_;
		}
		return i_0_;
	    } while (false);
	    try {
		if (arg1 != 0)
		    aClass124_4700 = null;
		if ((i ^ 0xffffffff) >= -1 || 256 <= i)
		    i = -1;
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("va.G("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
	}
	return 0;
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] intarray_0_ = aClass149_2851.method2014(arg0, (byte) 117);
	try {
	    int[] is = aClass149_2851.method2014(arg0, (byte) 117);
	    if (aClass149_2851.aBoolean2402) {
		int i = anInt4712 * Class133_Sub5.anIntArray3623[arg0] + 2048;
		int i_1_ = i >> 608153452;
		int i_2_ = 1 + i_1_;
		int i_3_ = 0;
	    while_15_:
		for (/**/; Class112.anInt1876 > i_3_; i_3_++) {
		    Class14_Sub8_Sub17.anInt4377 = Class141.anInt2252
			= Class7_Sub1.anInt2664 = Class7_Sub1.anInt2662
			= 2147483647;
		    int i_4_
			= (Class14_Sub8_Sub4.anIntArray4145[i_3_] * anInt4701
			   + 2048);
		    int i_5_ = i_4_ >> -873543028;
		    int i_6_ = 1 + i_5_;
		    for (int i_7_ = -1 + i_1_; i_2_ >= i_7_; i_7_++) {
			int i_8_ = ((aByteArray4699
				     [((i_7_ ^ 0xffffffff) <= (anInt4712
							       ^ 0xffffffff)
				       ? i_7_ - anInt4712 : i_7_) & 0xff])
				    & 0xff);
			for (int i_9_ = i_5_ + -1; i_9_ <= i_6_; i_9_++) {
			    int i_10_
				= ((aByteArray4699[0xff & (i_9_ >= anInt4701
							   ? i_9_ + -anInt4701
							   : i_9_) + i_8_]
				    & 0xff)
				   * 2);
			    int i_11_ = (-aShortArray4703[i_10_++]
					 - ((i_9_ << 2090324076) - i_4_));
			    int i_12_ = (-(i_7_ << -1124060756)
					 + (-aShortArray4703[i_10_] + i));
			    int i_13_ = anInt4692;
			    int i_14_;
			while_11_:
			    do {
			    while_10_:
				do {
				while_9_:
				    do {
				    while_8_:
					do {
					    do {
						if (-2
						    != (i_13_ ^ 0xffffffff)) {
						    if (i_13_ != 3) {
							if (i_13_ != 4) {
							    if (-6
								!= (i_13_
								    ^ 0xffffffff)) {
								if ((i_13_
								     ^ 0xffffffff)
								    == -3)
								    break while_9_;
								break while_10_;
							    }
							} else
							    break;
							break while_8_;
						    }
						} else {
						    i_14_ = ((i_11_ * i_11_
							      + i_12_ * i_12_)
							     >> -1373168276);
						    break while_11_;
						}
						i_12_ = (-1 < (i_12_
							       ^ 0xffffffff)
							 ? -i_12_ : i_12_);
						i_11_
						    = ((i_11_ ^ 0xffffffff)
						       > -1) ? -i_11_ : i_11_;
						i_14_
						    = (((i_12_ ^ 0xffffffff)
							> (i_11_ ^ 0xffffffff))
						       ? i_11_ : i_12_);
						break while_11_;
					    } while (false);
					    i_11_
						= (int) ((Math.sqrt
							  ((double) ((float) (i_11_ < 0
									      ? -i_11_
									      : i_11_)
								     / 4096.0F)))
							 * 4096.0);
					    i_12_
						= (int) ((Math.sqrt
							  ((double) ((float) (i_12_ >= 0
									      ? i_12_
									      : -i_12_)
								     / 4096.0F)))
							 * 4096.0);
					    i_14_ = i_11_ + i_12_;
					    i_14_ = i_14_ * i_14_ >> 547045452;
					    break while_11_;
					} while (false);
					i_12_ *= i_12_;
					i_11_ *= i_11_;
					i_14_
					    = (int) (4096.0
						     * (Math.sqrt
							(Math.sqrt
							 ((double) ((float) (i_11_
									     - -i_12_)
								    / 1.6777216E7F)))));
					break while_11_;
				    } while (false);
				    i_14_ = ((0 > i_11_ ? -i_11_ : i_11_)
					     - -((i_12_ ^ 0xffffffff) <= -1
						 ? i_12_ : -i_12_));
				    break while_11_;
				} while (false);
				i_14_
				    = (int) (4096.0
					     * (Math.sqrt
						((double) ((float) ((i_12_
								     * i_12_)
								    + (i_11_
								       * i_11_))
							   / 1.6777216E7F))));
			    } while (false);
			    if ((Class14_Sub8_Sub17.anInt4377 ^ 0xffffffff)
				< (i_14_ ^ 0xffffffff)) {
				Class7_Sub1.anInt2662 = Class7_Sub1.anInt2664;
				Class7_Sub1.anInt2664 = Class141.anInt2252;
				Class141.anInt2252
				    = Class14_Sub8_Sub17.anInt4377;
				Class14_Sub8_Sub17.anInt4377 = i_14_;
			    } else if ((i_14_ ^ 0xffffffff)
				       <= (Class141.anInt2252 ^ 0xffffffff)) {
				if ((Class7_Sub1.anInt2664 ^ 0xffffffff)
				    >= (i_14_ ^ 0xffffffff)) {
				    if (i_14_ < Class7_Sub1.anInt2662)
					Class7_Sub1.anInt2662 = i_14_;
				} else {
				    Class7_Sub1.anInt2662
					= Class7_Sub1.anInt2664;
				    Class7_Sub1.anInt2664 = i_14_;
				}
			    } else {
				Class7_Sub1.anInt2662 = Class7_Sub1.anInt2664;
				Class7_Sub1.anInt2664 = Class141.anInt2252;
				Class141.anInt2252 = i_14_;
			    }
			}
		    }
		    int i_15_ = anInt4714;
		while_13_:
		    do {
		    while_12_:
			do {
			    do {
				if (i_15_ != 0) {
				    if ((i_15_ ^ 0xffffffff) != -2) {
					if (i_15_ != 3) {
					    if (4 != i_15_) {
						if ((i_15_ ^ 0xffffffff) == -3)
						    break while_13_;
						continue while_15_;
					    }
					} else
					    break;
					break while_12_;
				    }
				} else {
				    is[i_3_] = Class14_Sub8_Sub17.anInt4377;
				    continue while_15_;
				}
				is[i_3_] = Class141.anInt2252;
				continue while_15_;
			    } while (false);
			    is[i_3_] = Class7_Sub1.anInt2664;
			    continue while_15_;
			} while (false);
			is[i_3_] = Class7_Sub1.anInt2662;
			continue while_15_;
		    } while (false);
		    is[i_3_]
			= -Class14_Sub8_Sub17.anInt4377 + Class141.anInt2252;
		}
	    }
	    if (arg1 >= -58)
		method669(-115);
	    anInt4693++;
	    intarray_0_ = is;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("va.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return intarray_0_;
    }
    
    public static Class133_Sub7 method672(int arg0, int arg1, int arg2,
					  int arg3, int arg4,
					  Class133_Sub7 arg5, int arg6) {
	try {
    while_17_:
	do {
	Class133_Sub7 class133_sub7_1_;
	    Class133_Sub7 class133_sub7;
	while_16_:
	    do {
		long l;
		Class133_Sub2 class133_sub2;
		do {
		Class133_Sub7 class133_sub7_0_;
		    try {
			anInt4713++;
			l = (long) arg2;
			class133_sub7
			    = (Class133_Sub7) Class14_Sub28.aClass52_3217
						  .method1210((byte) 103, l);
			if (class133_sub7 != null)
			    break while_16_;
			class133_sub2
			    = Class133_Sub2.method1824((Class14_Sub8_Sub38
							.aClass9_Sub1_4739),
						       arg2, 0);
			if (class133_sub2 != null)
			    break;
			class133_sub7_0_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_17_;
		    }
		    return class133_sub7_0_;
		} while (false);
		try {
		    class133_sub7
			= class133_sub2.method1827(64, 768, -50, -10, -50);
		    Class14_Sub28.aClass52_3217.method1205((byte) -93,
							   class133_sub7, l);
		} catch (RuntimeException runtimeexception) {
		    break while_17_;
		}
	    } while (false);
	    int i = arg5.method1867();
	    int i_16_ = arg5.method1856();
	    if (arg3 != 4435)
		return null;
	    try {
		int i_17_ = arg5.method1868();
		int i_18_ = arg5.method1865();
		class133_sub7 = class133_sub7.method1870(true, true);
		if (0 != arg4)
		    class133_sub7.method1874(arg4);
		Class133_Sub7_Sub2 class133_sub7_sub2
		    = (Class133_Sub7_Sub2) class133_sub7;
		if (arg1 != Class26.method1017(arg6 - -i,
					       Class14_Sub2_Sub3.anInt3785,
					       (byte) -114, i_17_ + arg0)
		    || Class26.method1017(i_16_ + arg6,
					  Class14_Sub2_Sub3.anInt3785,
					  (byte) -106, i_18_ + arg0) != arg1) {
		    for (int i_19_ = 0; class133_sub7_sub2.anInt5033 > i_19_;
			 i_19_++)
			class133_sub7_sub2.anIntArray5022[i_19_]
			    += Class26.method1017(((class133_sub7_sub2
						    .anIntArray5027[i_19_])
						   + arg6),
						  Class14_Sub2_Sub3.anInt3785,
						  (byte) -5,
						  ((class133_sub7_sub2
						    .anIntArray5010[i_19_])
						   - -arg0)) - arg1;
		    class133_sub7_sub2.aClass50_5013.aBoolean820 = false;
		    class133_sub7_sub2.aClass41_5028.aBoolean682 = false;
		}
		class133_sub7_1_ = class133_sub7;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("va.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ','
					    + (arg5 != null ? "{...}" : "null")
					    + ',' + arg6 + ')'));
	}
	return null;
    }
    
    static {
	aClass124_4694 = Class14_Sub2_Sub2.method263(1178, "<col=ffff00>");
	anIntArray4691 = new int[4096];
	aLong4704 = 0L;
	aClass124_4696
	    = Class14_Sub2_Sub2.method263(1178, " weitere Optionen");
	aClass124_4700 = Class14_Sub2_Sub2.method263(1178, "Allocated memory");
	aClass124_4706
	    = Class14_Sub2_Sub2.method263(1178, "Speicher wird zugewiesen)3");
	aClass124_4702 = aClass124_4700;
    }
}