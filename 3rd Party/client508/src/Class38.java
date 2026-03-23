/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class38 implements Interface5
{
    public static int anInt2614;
    public static int anInt2615;
    public static int anInt2616 = 0;
    public static int anInt2617;
    public static int anInt2618;
    public static int anInt2619;
    public static int anInt2620;
    public static int anInt2621;
    public static int anInt2622 = 0;
    public static int anInt2623;
    public static int anInt2624;
    
    public Class124 method24(long arg0, int arg1, int[] arg2, boolean arg3) {
    while_731_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt2614++;
		    if (0 != arg1)
			break;
		    Class14_Sub2_Sub8 class14_sub2_sub8
			= Class99_Sub2.method1507(-8475, arg2[0]);
		    class124 = class14_sub2_sub8.method295(-68, (int) arg0);
		} catch (RuntimeException runtimeexception) {
		    break while_731_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if ((arg1 ^ 0xffffffff) != -2
			&& (arg1 ^ 0xffffffff) != -11)
			break;
		    Class142 class142
			= Class14_Sub8_Sub24.method605(102, (int) arg0);
		    class124 = class142.aClass124_2296;
		} catch (RuntimeException runtimeexception) {
		    break while_731_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (arg3 != true)
			anInt2618 = 100;
		    if (6 != arg1 && arg1 != 7)
			break;
		    class124 = Class99_Sub2.method1507(-8475, arg2[0])
				   .method295(-76, (int) arg0);
		} catch (RuntimeException runtimeexception) {
		    break while_731_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = null;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("eh.C(" + arg0 + ',' + arg1 + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ')'));
    }
    
    public static void method1114
	(int arg0, int arg1, float[][] arg2, int[][] arg3, boolean arg4,
	 Class14_Sub27 arg5, float[][] arg6, int arg7, int arg8, int arg9,
	 float[][] arg10, byte arg11, int arg12, int arg13, byte arg14,
	 int arg15) {
	try {
	    int i = (arg9 << -974868248) + 255;
	    anInt2619++;
	    int i_0_ = (arg1 << -24632440) + 255;
	    int i_1_ = (arg0 << -576020152) - -255;
	    int i_2_ = (arg12 << 34368520) + 255;
	    if (arg8 < 12)
		anInt2622 = -101;
	    int[] is = null;
	    int[] is_3_ = Class19.anIntArrayArray2545[arg14];
	    int[] is_4_ = new int[is_3_.length >> 701826785];
	    for (int i_5_ = 0; is_4_.length > i_5_; i_5_++)
		is_4_[i_5_]
		    = Class14_Sub17.method881(i_2_, i_1_, arg5, (byte) 12, i,
					      i_0_, arg11, false, arg6, arg10,
					      is_3_[1 + (i_5_ + i_5_)], arg15,
					      arg2, null, 0.0F, arg3, arg7,
					      is_3_[i_5_ + i_5_]);
	while_740_:
	    do {
		if (arg4) {
		    byte i_6_ = arg14;
		while_739_:
		    do {
		    while_738_:
			do {
			while_737_:
			    do {
			    while_736_:
				do {
				while_735_:
				    do {
				    while_734_:
					do {
					while_733_:
					    do {
					    while_732_:
						do {
						    do {
							if ((i_6_ ^ 0xffffffff)
							    != -2) {
							    if (-3
								!= (i_6_
								    ^ 0xffffffff)) {
								if ((i_6_
								     ^ 0xffffffff)
								    != -4) {
								    if (4
									!= i_6_) {
									if (5
									    != i_6_) {
									    if ((i_6_ ^ 0xffffffff) != -7) {
										if (7 != i_6_) {
										    if (-9 != (i_6_ ^ 0xffffffff)) {
											if (9 != i_6_) {
											    if (-11 != (i_6_ ^ 0xffffffff)) {
												if (i_6_ == 11)
												    break while_739_;
												break while_740_;
											    }
											} else
											    break while_737_;
											break while_738_;
										    }
										} else
										    break while_735_;
										break while_736_;
									    }
									} else
									    break while_733_;
									break while_734_;
								    }
								} else
								    break;
								break while_732_;
							    }
							} else {
							    is = new int[6];
							    int i_7_
								= (Class14_Sub17
								       .method881
								   (i_2_, i_1_,
								    arg5,
								    (byte) 12,
								    i, i_0_,
								    arg11,
								    true, arg6,
								    arg10, 128,
								    arg15,
								    arg2, null,
								    0.0F, arg3,
								    arg7, 64));
							    int i_8_
								= (Class14_Sub17
								       .method881
								   (i_2_, i_1_,
								    arg5,
								    (byte) 12,
								    i, i_0_,
								    arg11,
								    true, arg6,
								    arg10, 64,
								    arg15,
								    arg2, null,
								    0.0F, arg3,
								    arg7,
								    128));
							    is[2] = is_4_[2];
							    is[1] = i_7_;
							    is[0] = i_8_;
							    is[3] = i_7_;
							    is[5] = is_4_[2];
							    is[4] = is_4_[0];
							    break while_740_;
							}
							is = new int[6];
							int i_9_
							    = (Class14_Sub17
								   .method881
							       (i_2_, i_1_,
								arg5,
								(byte) 12, i,
								i_0_, arg11,
								true, arg6,
								arg10, 128,
								arg15, arg2,
								null, 0.0F,
								arg3, arg7,
								128));
							int i_10_
							    = (Class14_Sub17
								   .method881
							       (i_2_, i_1_,
								arg5,
								(byte) 12, i,
								i_0_, arg11,
								true, arg6,
								arg10, 0,
								arg15, arg2,
								null, 0.0F,
								arg3, arg7,
								64));
							is[2] = i_9_;
							is[1] = i_10_;
							is[3] = i_9_;
							is[0] = is_4_[0];
							is[4] = is_4_[1];
							is[5] = is_4_[0];
							break while_740_;
						    } while (false);
						    is = new int[6];
						    int i_11_
							= (Class14_Sub17
							       .method881
							   (i_2_, i_1_, arg5,
							    (byte) 12, i, i_0_,
							    arg11, true, arg6,
							    arg10, 128, arg15,
							    arg2, null, 0.0F,
							    arg3, arg7, 0));
						    int i_12_
							= (Class14_Sub17
							       .method881
							   (i_2_, i_1_, arg5,
							    (byte) 12, i, i_0_,
							    arg11, true, arg6,
							    arg10, 0, arg15,
							    arg2, null, 0.0F,
							    arg3, arg7, 64));
						    is[1] = is_4_[1];
						    is[0] = is_4_[2];
						    is[3] = i_11_;
						    is[2] = i_11_;
						    is[5] = is_4_[2];
						    is[4] = i_12_;
						    break while_740_;
						} while (false);
						is = new int[3];
						int i_13_
						    = (Class14_Sub17.method881
						       (i_2_, i_1_, arg5,
							(byte) 12, i, i_0_,
							arg11, true, arg6,
							arg10, 128, arg15,
							arg2, null, 0.0F, arg3,
							arg7, 0));
						is[0] = is_4_[3];
						is[2] = is_4_[0];
						is[1] = i_13_;
						break while_740_;
					    } while (false);
					    is = new int[3];
					    int i_14_
						= (Class14_Sub17.method881
						   (i_2_, i_1_, arg5,
						    (byte) 12, i, i_0_, arg11,
						    true, arg6, arg10, 128,
						    arg15, arg2, null, 0.0F,
						    arg3, arg7, 128));
					    is[1] = i_14_;
					    is[0] = is_4_[2];
					    is[2] = is_4_[3];
					    break while_740_;
					} while (false);
					is = new int[6];
					int i_15_
					    = (Class14_Sub17.method881
					       (i_2_, i_1_, arg5, (byte) 12, i,
						i_0_, arg11, true, arg6, arg10,
						0, arg15, arg2, null, 0.0F,
						arg3, arg7, 128));
					int i_16_
					    = (Class14_Sub17.method881
					       (i_2_, i_1_, arg5, (byte) 12, i,
						i_0_, arg11, true, arg6, arg10,
						128, arg15, arg2, null, 0.0F,
						arg3, arg7, 128));
					is[1] = i_15_;
					is[2] = i_16_;
					is[0] = is_4_[3];
					is[4] = is_4_[0];
					is[3] = i_16_;
					is[5] = is_4_[3];
					break while_740_;
				    } while (false);
				    is = new int[6];
				    int i_17_ = (Class14_Sub17.method881
						 (i_2_, i_1_, arg5, (byte) 12,
						  i, i_0_, arg11, true, arg6,
						  arg10, 128, arg15, arg2,
						  null, 0.0F, arg3, arg7, 0));
				    int i_18_ = (Class14_Sub17.method881
						 (i_2_, i_1_, arg5, (byte) 12,
						  i, i_0_, arg11, true, arg6,
						  arg10, 0, arg15, arg2, null,
						  0.0F, arg3, arg7, 128));
				    is[2] = i_17_;
				    is[4] = is_4_[2];
				    is[3] = i_17_;
				    is[0] = is_4_[1];
				    is[1] = i_18_;
				    is[5] = is_4_[1];
				    break while_740_;
				} while (false);
				is = new int[3];
				int i_19_
				    = Class14_Sub17.method881(i_2_, i_1_, arg5,
							      (byte) 12, i,
							      i_0_, arg11,
							      true, arg6,
							      arg10, 0, arg15,
							      arg2, null, 0.0F,
							      arg3, arg7, 0);
				is[1] = i_19_;
				is[0] = is_4_[3];
				is[2] = is_4_[4];
				break while_740_;
			    } while (false);
			    is = new int[15];
			    int i_20_
				= Class14_Sub17.method881(i_2_, i_1_, arg5,
							  (byte) 12, i, i_0_,
							  arg11, true, arg6,
							  arg10, 64, arg15,
							  arg2, null, 0.0F,
							  arg3, arg7, 128);
			    int i_21_
				= Class14_Sub17.method881(i_2_, i_1_, arg5,
							  (byte) 12, i, i_0_,
							  arg11, true, arg6,
							  arg10, 32, arg15,
							  arg2, null, 0.0F,
							  arg3, arg7, 96);
			    int i_22_
				= Class14_Sub17.method881(i_2_, i_1_, arg5,
							  (byte) 12, i, i_0_,
							  arg11, true, arg6,
							  arg10, 0, arg15,
							  arg2, null, 0.0F,
							  arg3, arg7, 64);
			    is[1] = i_20_;
			    is[3] = i_21_;
			    is[7] = is_4_[3];
			    is[5] = is_4_[3];
			    is[9] = i_21_;
			    is[2] = is_4_[4];
			    is[13] = is_4_[1];
			    is[12] = i_21_;
			    is[11] = is_4_[1];
			    is[6] = i_21_;
			    is[8] = is_4_[2];
			    is[4] = is_4_[4];
			    is[0] = i_21_;
			    is[14] = i_22_;
			    is[10] = is_4_[2];
			    break while_740_;
			} while (false);
			is = new int[9];
			int i_23_
			    = Class14_Sub17.method881(i_2_, i_1_, arg5,
						      (byte) 12, i, i_0_,
						      arg11, true, arg6, arg10,
						      128, arg15, arg2, null,
						      0.0F, arg3, arg7, 0);
			is[0] = is_4_[2];
			is[2] = is_4_[3];
			is[4] = i_23_;
			is[1] = i_23_;
			is[8] = is_4_[0];
			is[3] = is_4_[3];
			is[6] = is_4_[4];
			is[5] = is_4_[4];
			is[7] = i_23_;
			break while_740_;
		    } while (false);
		    is = new int[12];
		    int i_24_
			= Class14_Sub17.method881(i_2_, i_1_, arg5, (byte) 12,
						  i, i_0_, arg11, true, arg6,
						  arg10, 64, arg15, arg2, null,
						  0.0F, arg3, arg7, 0);
		    int i_25_
			= Class14_Sub17.method881(i_2_, i_1_, arg5, (byte) 12,
						  i, i_0_, arg11, true, arg6,
						  arg10, 64, arg15, arg2, null,
						  0.0F, arg3, arg7, 128);
		    is[5] = i_24_;
		    is[8] = i_24_;
		    is[0] = is_4_[3];
		    is[3] = is_4_[3];
		    is[1] = i_24_;
		    is[7] = i_25_;
		    is[2] = is_4_[0];
		    is[4] = is_4_[2];
		    is[10] = is_4_[1];
		    is[11] = i_25_;
		    is[9] = is_4_[2];
		    is[6] = is_4_[2];
		}
	    } while (false);
	    arg5.method920(arg13, arg7, arg15, is_4_, is, false);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("eh.B(" + arg0 + ',' + arg1 + ','
			+ (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
			+ (arg5 != null ? "{...}" : "null") + ','
			+ (arg6 != null ? "{...}" : "null") + ',' + arg7 + ','
			+ arg8 + ',' + arg9 + ','
			+ (arg10 != null ? "{...}" : "null") + ',' + arg11
			+ ',' + arg12 + ',' + arg13 + ',' + arg14 + ',' + arg15
			+ ')'));
	}
    }
    
    public static Class14_Sub2_Sub19[] method1115(boolean arg0, Class9 arg1,
						  int arg2, int arg3) {
    while_741_:
	do {
	    do {
		Class14_Sub2_Sub19[] class14_sub2_sub19s;
		try {
		    anInt2621++;
		    if (Class109.method1564(-2, arg2, arg3, arg1))
			break;
		    class14_sub2_sub19s = null;
		} catch (RuntimeException runtimeexception) {
		    break while_741_;
		}
		return class14_sub2_sub19s;
	    } while (false);
	    Class14_Sub2_Sub19[] class14_sub2_sub19s;
	    try {
		if (arg0)
		    method1116(-87, true);
		class14_sub2_sub19s = Class14_Sub8_Sub11.method535(!arg0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19s;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("eh.F(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ')'));
    }
    
    public static void method1116(int arg0, boolean arg1) {
	try {
	    anInt2615++;
	    if (((Class71.anInt1085 ^ 0xffffffff)
		 == ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
		      >> 526998471)
		     ^ 0xffffffff))
		&& (((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
		      >> -897962073)
		     ^ 0xffffffff)
		    == (Class14_Sub8_Sub15.anInt4335 ^ 0xffffffff)))
		Class71.anInt1085 = 0;
	    int i = Class14_Sub10.anInt2878;
	    if (arg0 != 1)
		anInt2624 = -52;
	    if (arg1)
		i = 1;
	    int i_26_ = 0;
	    for (/**/; (i_26_ ^ 0xffffffff) > (i ^ 0xffffffff); i_26_++) {
		long l;
		Class133_Sub1_Sub1 class133_sub1_sub1;
		if (arg1) {
		    class133_sub1_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
		    l = 8791798054912L;
		} else {
		    l = (long) Class14.anIntArray351[i_26_] << 1203070240;
		    class133_sub1_sub1
			= (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			   [Class14.anIntArray351[i_26_]]);
		}
		if (class133_sub1_sub1 != null
		    && class133_sub1_sub1.method1804((byte) 115)) {
		    class133_sub1_sub1.aBoolean4921 = false;
		    if ((Class135.aBoolean2190 && Class14_Sub10.anInt2878 > 200
			 || (Class14_Sub10.anInt2878 ^ 0xffffffff) < -51)
			&& !arg1
			&& (class133_sub1_sub1.anInt3452
			    == class133_sub1_sub1.anInt3433))
			class133_sub1_sub1.aBoolean4921 = true;
		    int i_27_ = class133_sub1_sub1.anInt3495 >> 1131101191;
		    int i_28_ = class133_sub1_sub1.anInt3436 >> -1150112345;
		    if (-1 >= (i_27_ ^ 0xffffffff)
			&& (i_27_ ^ 0xffffffff) > -105
			&& -1 >= (i_28_ ^ 0xffffffff) && 104 > i_28_) {
			if (class133_sub1_sub1.aClass133_Sub7_4933 == null
			    || (class133_sub1_sub1.anInt4929
				> Class14_Sub2_Sub20.anInt4064)
			    || (Class14_Sub2_Sub20.anInt4064
				>= class133_sub1_sub1.anInt4910)) {
			    if (((class133_sub1_sub1.anInt3493 ^ 0xffffffff)
				 == -2)
				&& -65 == (0x7f & class133_sub1_sub1.anInt3495
					   ^ 0xffffffff)
				&& ((0x7f & class133_sub1_sub1.anInt3436)
				    == 64)) {
				if ((Class14_Sub2_Sub8.anIntArrayArray3846
				     [i_27_][i_28_])
				    == Class42.anInt699)
				    continue;
				Class14_Sub2_Sub8.anIntArrayArray3846
				    [i_27_][i_28_]
				    = Class42.anInt699;
			    }
			    class133_sub1_sub1.anInt3500
				= (Class26.method1017
				   (class133_sub1_sub1.anInt3495,
				    Class14_Sub2_Sub3.anInt3785, (byte) 85,
				    class133_sub1_sub1.anInt3436));
			    Class14_Sub8_Sub8.method519
				(Class14_Sub2_Sub3.anInt3785,
				 class133_sub1_sub1.anInt3495,
				 class133_sub1_sub1.anInt3436,
				 class133_sub1_sub1.anInt3500,
				 60 + 64 * class133_sub1_sub1.anInt3493 - 64,
				 class133_sub1_sub1,
				 class133_sub1_sub1.anInt3461, l,
				 class133_sub1_sub1.aBoolean3488);
			} else {
			    class133_sub1_sub1.aBoolean4921 = false;
			    class133_sub1_sub1.anInt3500
				= (Class26.method1017
				   (class133_sub1_sub1.anInt3495,
				    Class14_Sub2_Sub3.anInt3785, (byte) -112,
				    class133_sub1_sub1.anInt3436));
			    Class128.method1757(Class14_Sub2_Sub3.anInt3785,
						class133_sub1_sub1.anInt3495,
						class133_sub1_sub1.anInt3436,
						class133_sub1_sub1.anInt3500,
						class133_sub1_sub1,
						class133_sub1_sub1.anInt3461,
						l,
						class133_sub1_sub1.anInt4914,
						class133_sub1_sub1.anInt4908,
						class133_sub1_sub1.anInt4906,
						class133_sub1_sub1.anInt4924);
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("eh.D(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1117(int arg0, int arg1, int arg2) {
	try {
	    if ((arg2 ^ 0xffffffff) != (Class112.anInt1876 ^ 0xffffffff)) {
		Class14_Sub8_Sub4.anIntArray4145 = new int[arg2];
		for (int i = 0; i < arg2; i++)
		    Class14_Sub8_Sub4.anIntArray4145[i]
			= (i << -1263918900) / arg2;
		Class112.anInt1876 = arg2;
		Class79.anInt1288 = 64 != arg2 ? 4096 : 2048;
		Class14_Sub10_Sub1.anInt4882 = -1 + arg2;
	    }
	    if (arg0 != 0)
		anInt2617 = -1;
	    if (Class17.anInt407 != arg1) {
		if (Class112.anInt1876 != arg1) {
		    Class133_Sub5.anIntArray3623 = new int[arg1];
		    for (int i = 0; arg1 > i; i++)
			Class133_Sub5.anIntArray3623[i]
			    = (i << 1405735084) / arg1;
		} else
		    Class133_Sub5.anIntArray3623
			= Class14_Sub8_Sub4.anIntArray4145;
		Class17.anInt407 = arg1;
		Class115.anInt1927 = -1 + arg1;
	    }
	    anInt2620++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("eh.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1118(int arg0, int arg1) {
	try {
	    anInt2623++;
	    if ((arg0 ^ 0xffffffff) == -38)
		Class14_Sub8.aFloat2854 = 3.0F;
	    else if ((arg0 ^ 0xffffffff) != -51) {
		if (arg0 == 75)
		    Class14_Sub8.aFloat2854 = 6.0F;
		else
		    Class14_Sub8.aFloat2854 = 8.0F;
	    } else
		Class14_Sub8.aFloat2854 = 4.0F;
	    Class14_Sub18.anInt3050 = -1;
	    Class14_Sub18.anInt3050 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("eh.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
