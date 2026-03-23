/* Class14_Sub8_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub35 extends Class14_Sub8
{
    public static int anInt4669;
    public static int anInt4670;
    public static int anInt4671;
    public static Class87 aClass87_4672;
    public int anInt4673 = 2048;
    public int anInt4674;
    public static int anInt4675 = -1;
    public static Class124 aClass124_4676
	= Class14_Sub2_Sub2.method263(1178, "::fullscreen");
    public static int anInt4677;
    public static int anInt4678;
    public static int anInt4679;
    public int anInt4680 = 0;
    public static int anInt4681;
    public static Class75 aClass75_4682;
    public static int anInt4683;
    public static int anInt4684;
    public int anInt4685;
    public static int anInt4686 = 0;
    public static int anInt4687 = -1;
    public int anInt4688;
    public int anInt4689;
    public int anInt4690;
    
    public boolean method662(int arg0, int arg1, byte arg2) {
	boolean bool;
	try {
	    if (arg2 <= 111)
		anInt4674 = 38;
	    anInt4670++;
	    int i = anInt4685 * (arg0 - -arg1) >> -258382548;
	    int i_0_
		= Class99_Sub2.anIntArray3357[255 * i >> -1935777044 & 0xff];
	    i_0_ = (i_0_ << -163930036) / anInt4685;
	    i_0_ = (i_0_ << -299549076) / anInt4674;
	    i_0_ = i_0_ * anInt4688 >> 374355564;
	    bool = ((arg0 - arg1 ^ 0xffffffff) > (i_0_ ^ 0xffffffff)
		    && (-i_0_ ^ 0xffffffff) > (-arg1 + arg0 ^ 0xffffffff));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("uj.H(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return bool;
    }
    
    public static boolean method663
	(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5,
	 boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
    while_500_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4681++;
		    if (arg4 != 109)
			aClass124_4676 = null;
		    if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493
			 ^ 0xffffffff)
			!= -3)
			break;
		    bool = Class14_Sub2_Sub3.method277(arg7, arg0, arg9,
						       (byte) 98, arg8, arg6,
						       arg3, arg5, arg11,
						       arg10, arg2, arg1);
		} catch (RuntimeException runtimeexception) {
		    break while_500_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (2 >= Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493)
			break;
		    bool = Class47.method1190(arg11, arg5, arg9, arg0, arg3,
					      arg6, 122, arg2,
					      (Class14_Sub3
					       .aClass133_Sub1_Sub1_2748
					       .anInt3493),
					      arg7, arg10, arg1, arg8);
		} catch (RuntimeException runtimeexception) {
		    break while_500_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = Class59.method1260(arg6, arg7, arg10, arg2, arg1, arg11,
					  arg4 ^ 0x6d, arg3, arg8, arg0, arg9,
					  arg5);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("uj.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ',' + arg8 + ',' + arg9
					    + ',' + arg10 + ',' + arg11
					    + ')'));
    }
    
    public static boolean method664(boolean arg0) {
	do {
	    boolean bool;
	    try {
		anInt4677++;
		if (arg0)
		    anInt4687 = -70;
		try {
		    bool = Class14_Sub8_Sub33.method656(-1);
		} catch (java.io.IOException ioexception) {
		    try {
			Object object = new Throwable();
			Class99_Sub2.method1508((byte) 100);
			return true;
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		} catch (Exception exception) {
		    try {
			Throwable throwable = new Throwable();
			String string
			    = ("T2 - " + Class133_Sub4.anInt3579 + ","
			       + Class14_Sub2_Sub13.anInt3931 + ","
			       + Class14_Sub8_Sub2.anInt4114 + " - "
			       + Class14_Sub8_Sub12.anInt4280 + ","
			       + (Class133_Sub6.anInt3676
				  + (Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .anIntArray3476[0]))
			       + ","
			       + ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				   .anIntArray3443[0])
				  + Class58.anInt947)
			       + " - ");
			for (int i = 0;
			     ((i ^ 0xffffffff) > (Class14_Sub8_Sub12.anInt4280
						  ^ 0xffffffff)
			      && 50 > i);
			     i++)
			    string
				+= (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .aByteArray2895[i]) + ",";
			Class14_Sub9_Sub3.method738(string, throwable, 95);
			Class14_Sub1.method238((byte) 66);
			return true;
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		}
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "uj.G(" + arg0 + ')');
    }
    
    public static void method665
	(int[][] arg0, float[][] arg1, byte arg2, int arg3, int arg4, int arg5,
	 int arg6, float[][] arg7, boolean arg8, int arg9, boolean[] arg10,
	 byte arg11, Class14_Sub27 arg12, int arg13, int arg14, int arg15,
	 boolean arg16, boolean arg17, boolean arg18, int[][] arg19,
	 int[] arg20, float[][] arg21) {
	try {
	    int i = 50 / ((arg2 - 48) / 56);
	    anInt4683++;
	    int i_1_ = (arg18 ? 255 : 0) + (arg6 << 1357782952);
	    int i_2_ = (arg14 << 2062440872) + (arg16 ? 255 : 0);
	    int i_3_ = (arg4 << -1521056472) + (!arg8 ? 0 : 255);
	    int i_4_ = (arg9 << 283930440) + (!arg17 ? 0 : 255);
	    int[] is = new int[arg20.length / 2];
	    for (int i_5_ = 0; (is.length ^ 0xffffffff) < (i_5_ ^ 0xffffffff);
		 i_5_++) {
		int i_6_ = arg20[i_5_ + i_5_];
		int i_7_ = arg20[1 + (i_5_ + i_5_)];
		int[][] is_8_ = (arg0 == null || null == arg10 || !arg10[i_5_]
				 ? arg19 : arg0);
		is[i_5_]
		    = Class14_Sub17.method881(i_4_, i_1_, arg12, (byte) 12,
					      i_3_, i_2_, arg11, false, arg21,
					      arg1, i_7_, arg3, arg7, arg0,
					      (float) arg13, is_8_, arg15,
					      i_6_);
	    }
	    arg12.method920(arg5, arg15, arg3, is, null, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("uj.D(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ (arg7 != null ? "{...}" : "null") + ',' + arg8 + ','
			+ arg9 + ',' + (arg10 != null ? "{...}" : "null") + ','
			+ arg11 + ',' + (arg12 != null ? "{...}" : "null")
			+ ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + arg16
			+ ',' + arg17 + ',' + arg18 + ','
			+ (arg19 != null ? "{...}" : "null") + ','
			+ (arg20 != null ? "{...}" : "null") + ','
			+ (arg21 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public void method472(int arg0) {
	try {
	    anInt4671++;
	    Class14_Sub2_Sub12.method321(256);
	    if (arg0 != 0)
		anInt4689 = -15;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "uj.I(" + arg0 + ')');
	}
    }
    
    public static void method666(boolean arg0) {
    while_502_:
	do {
	while_501_:
	    do {
		do {
		    try {
			aClass87_4672 = null;
			aClass124_4676 = null;
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_501_;
		    }
		    return;
		} while (false);
		try {
		    aClass75_4682 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_502_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "uj.J(" + arg0 + ')');
	} while (false);
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4679++;
	    if (arg1 > -58)
		anInt4687 = -67;
	    int[] is_9_ = aClass149_2851.method2014(arg0, (byte) 108);
	    if (aClass149_2851.aBoolean2402) {
		int i = Class133_Sub5.anIntArray3623[arg0] - 2048;
		for (int i_10_ = 0;
		     (i_10_ ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i_10_++) {
		    int i_11_ = i - -anInt4680;
		    i_11_ = 2047 < (i_11_ ^ 0xffffffff) ? 4096 + i_11_ : i_11_;
		    int i_12_ = Class14_Sub8_Sub4.anIntArray4145[i_10_] - 2048;
		    i_11_ = 2048 >= i_11_ ? i_11_ : i_11_ - 4096;
		    int i_13_ = i_12_ + anInt4673;
		    int i_14_ = anInt4690 + i;
		    int i_15_ = anInt4689 + i_12_;
		    i_14_
			= 2047 >= (i_14_ ^ 0xffffffff) ? i_14_ : 4096 + i_14_;
		    i_14_ = (-2049 <= (i_14_ ^ 0xffffffff) ? i_14_
			     : -4096 + i_14_);
		    i_15_ = 2047 < (i_15_ ^ 0xffffffff) ? 4096 + i_15_ : i_15_;
		    i_15_
			= -2049 <= (i_15_ ^ 0xffffffff) ? i_15_ : i_15_ - 4096;
		    i_13_ = i_13_ >= -2048 ? i_13_ : i_13_ + 4096;
		    i_13_
			= (i_13_ ^ 0xffffffff) < -2049 ? i_13_ - 4096 : i_13_;
		    is_9_[i_10_]
			= (!method667(i_11_, 13508, i_13_)
			   && !method662(i_14_, i_15_, (byte) 123)) ? 0 : 4096;
		}
	    }
	    is = is_9_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("uj.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public boolean method667(int arg0, int arg1, int arg2) {
	boolean bool;
	try {
	    anInt4678++;
	    if (arg1 != 13508)
		method664(true);
	    int i = (-arg2 + arg0) * anInt4685 >> 814174892;
	    int i_16_ = (Class99_Sub2.anIntArray3357
			 [(0xff9a9 & i * 255) >> -486991668]);
	    i_16_ = (i_16_ << 236789516) / anInt4685;
	    i_16_ = (i_16_ << -46157108) / anInt4674;
	    i_16_ = anInt4688 * i_16_ >> 1544095756;
	    bool = ((i_16_ ^ 0xffffffff) < (arg0 + arg2 ^ 0xffffffff)
		    && (arg2 + arg0 ^ 0xffffffff) < (-i_16_ ^ 0xffffffff));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("uj.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return bool;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_509_:
	do {
	while_508_:
	    do {
		do {
		    try {
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_508_;
		    }
		    return;
		} while (false);
		try {
		    int i = arg0;
		while_507_:
		    do {
		    while_506_:
			do {
			while_505_:
			    do {
			    while_504_:
				do {
				while_503_:
				    do {
					do {
					    if (0 != i) {
						if ((i ^ 0xffffffff) != -2) {
						    if ((i ^ 0xffffffff)
							!= -3) {
							if (i != 3) {
							    if ((i
								 ^ 0xffffffff)
								!= -5) {
								if (i != 5) {
								    if (6 == i)
									break while_506_;
								    break while_507_;
								}
							    } else
								break while_504_;
							    break while_505_;
							}
						    } else
							break;
						    break while_503_;
						}
					    } else {
						anInt4673 = (arg2.method784
							     ((byte) 114));
						break while_507_;
					    }
					    anInt4680
						= arg2.method784((byte) 120);
					    break while_507_;
					} while (false);
					anInt4689 = arg2.method784((byte) 104);
					break while_507_;
				    } while (false);
				    anInt4690 = arg2.method784((byte) 111);
				    break while_507_;
				} while (false);
				anInt4685 = arg2.method784((byte) 111);
				break while_507_;
			    } while (false);
			    anInt4688 = arg2.method784((byte) 113);
			    break while_507_;
			} while (false);
			anInt4674 = arg2.method784((byte) 122);
		    } while (false);
		    anInt4684++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_509_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("uj.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub35() {
	super(0, true);
	anInt4674 = 8192;
	anInt4685 = 12288;
	anInt4689 = 0;
	anInt4688 = 4096;
	anInt4690 = 2048;
    }
}
