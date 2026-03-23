/* Class14_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub2 extends Class14_Sub8
{
    public static int anInt4107;
    public int anInt4108 = 6;
    public static int anInt4109;
    public static int anInt4110;
    public static int anInt4111;
    public static Class55 aClass55_4112;
    public static Class124 aClass124_4113;
    public static int anInt4114;
    public static Class124 aClass124_4115
	= Class14_Sub2_Sub2.method263(1178, " has logged out)3");
    public static Class124 aClass124_4116;
    public static int anInt4117;
    public static Class124 aClass124_4118;
    public static Class124 aClass124_4119;
    public static Class124 aClass124_4120;
    public static Class124 aClass124_4121;
    public static Class124 aClass124_4122;
    
    public int[] method484(int arg0, byte arg1) {
    while_277_:
	do {
	    int[] is;
	    do {
		int[] is_0_;
		try {
		    is = aClass149_2851.method2014(arg0, (byte) 104);
		while_276_:
		    do {
			if (aClass149_2851.aBoolean2402) {
			    int[] is_1_ = method483(0, (byte) -63, arg0);
			    int[] is_2_ = method483(1, (byte) -55, arg0);
			    int i = anInt4108;
			while_275_:
			    do {
			    while_274_:
				do {
				while_273_:
				    do {
				    while_272_:
					do {
					while_271_:
					    do {
					    while_270_:
						do {
						while_269_:
						    do {
						    while_268_:
							do {
							while_267_:
							    do {
								do {
								    if (1
									!= i) {
									if ((i
									     ^ 0xffffffff)
									    != -3) {
									    if (3 != i) {
										if (-5 != (i ^ 0xffffffff)) {
										    if (5 != i) {
											if (i != 6) {
											    if ((i ^ 0xffffffff) != -8) {
												if (8 != i) {
												    if (9 != i) {
													if (-11 != (i ^ 0xffffffff)) {
													    if (-12 != (i ^ 0xffffffff)) {
														if ((i ^ 0xffffffff) != -13)
														    break while_276_;
													    } else
														break while_274_;
													    break while_275_;
													}
												    } else
													break while_272_;
												    break while_273_;
												}
											    } else
												break while_270_;
											    break while_271_;
											}
										    } else
											break while_268_;
										    break while_269_;
										}
									    } else
										break;
									    break while_267_;
									}
								    } else {
									for (i = 0;
									     Class112.anInt1876 > i;
									     i++)
									    is[i] = is_2_[i] + is_1_[i];
									break while_276_;
								    }
								    for (i = 0;
									 ((Class112
									   .anInt1876)
									  > i);
									 i++)
									is[i]
									    = -is_2_[i] + is_1_[i];
								    break while_276_;
								} while (false);
								for (i = 0;
								     (i
								      < (Class112
									 .anInt1876));
								     i++)
								    is[i]
									= ((is_2_[i]
									    * is_1_[i])
									   >> 1835801356);
								break while_276_;
							    } while (false);
							    for (i = 0;
								 ((Class112
								   .anInt1876)
								  > i);
								 i++) {
								int i_3_
								    = is_2_[i];
								is[i]
								    = ((i_3_
									== 0)
								       ? 4096
								       : (((is_1_
									    [i])
									   << -1750849428)
									  / i_3_));
							    }
							    break while_276_;
							} while (false);
							for (i = 0;
							     i < (Class112
								  .anInt1876);
							     i++)
							    is[i]
								= (-(((-(is_2_
									 [i])
								       + 4096)
								      * (4096
									 + -is_1_[i]))
								     >> 141815308)
								   + 4096);
							break while_276_;
						    } while (false);
						    for (i = 0;
							 i < (Class112
							      .anInt1876);
							 i++) {
							int i_4_ = is_2_[i];
							is[i]
							    = (2048 > i_4_
							       ? ((is_1_[i]
								   * i_4_)
								  >> -1579163733)
							       : (4096
								  + -(((-(is_1_
									  [i])
									+ 4096)
								       * (4096
									  - i_4_))
								      >> -1348770485)));
						    }
						    break while_276_;
						} while (false);
						for (i = 0;
						     ((Class112.anInt1876
						       ^ 0xffffffff)
						      < (i ^ 0xffffffff));
						     i++) {
						    int i_5_ = is_1_[i];
						    is[i]
							= (4096 != i_5_
							   ? ((is_2_[i]
							       << 416247468)
							      / (4096 - i_5_))
							   : 4096);
						}
						break while_276_;
					    } while (false);
					    for (i = 0;
						 ((i ^ 0xffffffff)
						  > (Class112.anInt1876
						     ^ 0xffffffff));
						 i++) {
						int i_6_ = is_1_[i];
						is[i]
						    = (((i_6_ ^ 0xffffffff)
							== -1)
						       ? 0
						       : (4096
							  - ((4096 + -is_2_[i]
							      << 605420364)
							     / i_6_)));
					    }
					    break while_276_;
					} while (false);
					for (i = 0;
					     ((Class112.anInt1876 ^ 0xffffffff)
					      < (i ^ 0xffffffff));
					     i++) {
					    int i_7_ = is_1_[i];
					    int i_8_ = is_2_[i];
					    is[i] = (((i_8_ ^ 0xffffffff)
						      >= (i_7_ ^ 0xffffffff))
						     ? i_8_ : i_7_);
					}
					break while_276_;
				    } while (false);
				    for (i = 0;
					 ((i ^ 0xffffffff)
					  > (Class112.anInt1876 ^ 0xffffffff));
					 i++) {
					int i_9_ = is_1_[i];
					int i_10_ = is_2_[i];
					is[i] = i_9_ > i_10_ ? i_9_ : i_10_;
				    }
				    break while_276_;
				} while (false);
				for (i = 0; ((Class112.anInt1876 ^ 0xffffffff)
					     < (i ^ 0xffffffff)); i++) {
				    int i_11_ = is_1_[i];
				    int i_12_ = is_2_[i];
				    is[i] = (((i_12_ ^ 0xffffffff)
					      <= (i_11_ ^ 0xffffffff))
					     ? i_12_ + -i_11_ : i_11_ - i_12_);
				}
				break while_276_;
			    } while (false);
			    for (i = 0;
				 ((i ^ 0xffffffff)
				  > (Class112.anInt1876 ^ 0xffffffff));
				 i++) {
				int i_13_ = is_2_[i];
				int i_14_ = is_1_[i];
				is[i] = (-(i_14_ * i_13_ >> -1121126869)
					 + (i_13_ + i_14_));
			    }
			}
		    } while (false);
		    anInt4107++;
		    if (arg1 < -58)
			break;
		    is_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_277_;
		}
		return is_0_;
	    } while (false);
	    int[] is_15_;
	    try {
		is_15_ = is;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is_15_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "cm.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public int[][] method474(int arg0, int arg1) {
	int[][] is;
	try {
	    anInt4111++;
	    if (arg1 >= -4)
		aClass124_4122 = null;
	    int[][] is_16_ = aClass95_2838.method1481(1, arg0);
	while_287_:
	    do {
		if (aClass95_2838.aBoolean1628) {
		    int[][] is_17_ = method480(0, 0, arg0);
		    int[][] is_18_ = method480(0, 1, arg0);
		    int[] is_19_ = is_16_[1];
		    int[] is_20_ = is_16_[0];
		    int[] is_21_ = is_16_[2];
		    int[] is_22_ = is_17_[1];
		    int[] is_23_ = is_17_[0];
		    int[] is_24_ = is_17_[2];
		    int[] is_25_ = is_18_[0];
		    int[] is_26_ = is_18_[1];
		    int[] is_27_ = is_18_[2];
		    int i = anInt4108;
		while_286_:
		    do {
		    while_285_:
			do {
			while_284_:
			    do {
			    while_283_:
				do {
				while_282_:
				    do {
				    while_281_:
					do {
					while_280_:
					    do {
					    while_279_:
						do {
						while_278_:
						    do {
							do {
							    if (i != 1) {
								if (-3
								    != (i
									^ 0xffffffff)) {
								    if ((i
									 ^ 0xffffffff)
									!= -4) {
									if (-5
									    != (i ^ 0xffffffff)) {
									    if (-6 != (i ^ 0xffffffff)) {
										if ((i ^ 0xffffffff) != -7) {
										    if (-8 != (i ^ 0xffffffff)) {
											if (8 != i) {
											    if (-10 != (i ^ 0xffffffff)) {
												if ((i ^ 0xffffffff) != -11) {
												    if ((i ^ 0xffffffff) != -12) {
													if ((i ^ 0xffffffff) != -13)
													    break while_287_;
												    } else
													break while_285_;
												    break while_286_;
												}
											    } else
												break while_283_;
											    break while_284_;
											}
										    } else
											break while_281_;
										    break while_282_;
										}
									    } else
										break while_279_;
									    break while_280_;
									}
								    } else
									break;
								    break while_278_;
								}
							    } else {
								for (i = 0;
								     ((Class112
								       .anInt1876)
								      > i);
								     i++) {
								    is_20_[i]
									= ((is_23_
									    [i])
									   - -is_25_[i]);
								    is_19_[i]
									= ((is_26_
									    [i])
									   + is_22_[i]);
								    is_21_[i]
									= ((is_24_
									    [i])
									   + is_27_[i]);
								}
								break while_287_;
							    }
							    for (i = 0;
								 ((Class112
								   .anInt1876)
								  > i);
								 i++) {
								is_20_[i]
								    = (-(is_25_
									 [i])
								       + (is_23_
									  [i]));
								is_19_[i]
								    = (-(is_26_
									 [i])
								       + (is_22_
									  [i]));
								is_21_[i]
								    = ((is_24_
									[i])
								       + -(is_27_
									   [i]));
							    }
							    break while_287_;
							} while (false);
							for (i = 0;
							     ((Class112
							       .anInt1876)
							      > i);
							     i++) {
							    is_20_[i]
								= ((is_23_[i]
								    * (is_25_
								       [i]))
								   >> 2003476492);
							    is_19_[i]
								= ((is_22_[i]
								    * (is_26_
								       [i]))
								   >> 357227276);
							    is_21_[i]
								= ((is_24_[i]
								    * (is_27_
								       [i]))
								   >> -2285844);
							}
							break while_287_;
						    } while (false);
						    for (i = 0;
							 ((Class112.anInt1876
							   ^ 0xffffffff)
							  < (i ^ 0xffffffff));
							 i++) {
							int i_28_ = is_25_[i];
							int i_29_ = is_27_[i];
							int i_30_ = is_26_[i];
							is_20_[i]
							    = (0 == i_28_
							       ? 4096
							       : ((is_23_[i]
								   << 1750460012)
								  / i_28_));
							is_19_[i]
							    = (((i_30_
								 ^ 0xffffffff)
								== -1)
							       ? 4096
							       : ((is_22_[i]
								   << 1427231020)
								  / i_30_));
							is_21_[i]
							    = (0 == i_29_
							       ? 4096
							       : ((is_24_[i]
								   << -960958484)
								  / i_29_));
						    }
						    break while_287_;
						} while (false);
						for (i = 0;
						     ((i ^ 0xffffffff)
						      > (Class112.anInt1876
							 ^ 0xffffffff));
						     i++) {
						    is_20_[i]
							= (-(((-is_23_[i]
							       + 4096)
							      * (4096
								 + -is_25_[i]))
							     >> 1911602412)
							   + 4096);
						    is_19_[i]
							= (-(((-is_22_[i]
							       + 4096)
							      * (-is_26_[i]
								 + 4096))
							     >> 249693356)
							   + 4096);
						    is_21_[i]
							= (4096
							   + -(((-is_27_[i]
								 + 4096)
								* (-is_24_[i]
								   + 4096))
							       >> 2046769164));
						}
						break while_287_;
					    } while (false);
					    for (i = 0;
						 ((i ^ 0xffffffff)
						  > (Class112.anInt1876
						     ^ 0xffffffff));
						 i++) {
						int i_31_ = is_25_[i];
						int i_32_ = is_26_[i];
						int i_33_ = is_27_[i];
						is_20_[i]
						    = (2048 > i_31_
						       ? (i_31_ * is_23_[i]
							  >> 1403394635)
						       : (4096
							  + -(((4096
								+ -is_23_[i])
							       * (-i_31_
								  + 4096))
							      >> 112444683)));
						is_19_[i]
						    = (i_32_ >= 2048
						       ? (4096
							  + -(((-i_32_ + 4096)
							       * (4096
								  - is_22_[i]))
							      >> 1130183211))
						       : (is_22_[i] * i_32_
							  >> 1745915211));
						is_21_[i]
						    = (((i_33_ ^ 0xffffffff)
							> -2049)
						       ? (i_33_ * is_24_[i]
							  >> 1750957803)
						       : (-(((-is_24_[i]
							      + 4096)
							     * (-i_33_ + 4096))
							    >> -1649915637)
							  + 4096));
					    }
					    break while_287_;
					} while (false);
					for (i = 0;
					     ((Class112.anInt1876 ^ 0xffffffff)
					      < (i ^ 0xffffffff));
					     i++) {
					    int i_34_ = is_24_[i];
					    int i_35_ = is_23_[i];
					    int i_36_ = is_22_[i];
					    is_20_[i]
						= (i_35_ == 4096 ? 4096
						   : ((is_25_[i] << 2000950764)
						      / (4096 - i_35_)));
					    is_19_[i] = (4096 == i_36_ ? 4096
							 : ((is_26_[i]
							     << -1710006260)
							    / (4096 - i_36_)));
					    is_21_[i]
						= (((i_34_ ^ 0xffffffff)
						    == -4097)
						   ? 4096
						   : ((is_27_[i]
						       << -1328133076)
						      / (-i_34_ + 4096)));
					}
					break while_287_;
				    } while (false);
				    for (i = 0; i < Class112.anInt1876; i++) {
					int i_37_ = is_24_[i];
					int i_38_ = is_22_[i];
					int i_39_ = is_23_[i];
					is_20_[i]
					    = (i_39_ == 0 ? 0
					       : 4096 - ((-is_25_[i] + 4096
							  << -1465851284)
							 / i_39_));
					is_19_[i]
					    = (i_38_ != 0
					       ? 4096 + -((4096 - is_26_[i]
							   << -384383572)
							  / i_38_)
					       : 0);
					is_21_[i]
					    = ((i_37_ ^ 0xffffffff) == -1 ? 0
					       : -((4096 - is_27_[i]
						    << 937307276)
						   / i_37_) + 4096);
				    }
				    break while_287_;
				} while (false);
				for (i = 0; i < Class112.anInt1876; i++) {
				    int i_40_ = is_22_[i];
				    int i_41_ = is_24_[i];
				    int i_42_ = is_27_[i];
				    int i_43_ = is_26_[i];
				    int i_44_ = is_25_[i];
				    int i_45_ = is_23_[i];
				    is_20_[i] = i_45_ < i_44_ ? i_45_ : i_44_;
				    is_19_[i] = (((i_43_ ^ 0xffffffff)
						  < (i_40_ ^ 0xffffffff))
						 ? i_40_ : i_43_);
				    is_21_[i] = (((i_41_ ^ 0xffffffff)
						  <= (i_42_ ^ 0xffffffff))
						 ? i_42_ : i_41_);
				}
				break while_287_;
			    } while (false);
			    for (i = 0;
				 ((i ^ 0xffffffff)
				  > (Class112.anInt1876 ^ 0xffffffff));
				 i++) {
				int i_46_ = is_27_[i];
				int i_47_ = is_25_[i];
				int i_48_ = is_26_[i];
				int i_49_ = is_22_[i];
				int i_50_ = is_24_[i];
				int i_51_ = is_23_[i];
				is_20_[i]
				    = ((i_51_ ^ 0xffffffff) >= (i_47_
								^ 0xffffffff)
				       ? i_47_ : i_51_);
				is_19_[i]
				    = ((i_49_ ^ 0xffffffff) >= (i_48_
								^ 0xffffffff)
				       ? i_48_ : i_49_);
				is_21_[i]
				    = ((i_46_ ^ 0xffffffff) > (i_50_
							       ^ 0xffffffff)
				       ? i_50_ : i_46_);
			    }
			    break while_287_;
			} while (false);
			for (i = 0; ((Class112.anInt1876 ^ 0xffffffff)
				     < (i ^ 0xffffffff)); i++) {
			    int i_52_ = is_25_[i];
			    int i_53_ = is_22_[i];
			    int i_54_ = is_23_[i];
			    int i_55_ = is_26_[i];
			    int i_56_ = is_27_[i];
			    int i_57_ = is_24_[i];
			    is_20_[i]
				= ((i_52_ ^ 0xffffffff) > (i_54_ ^ 0xffffffff)
				   ? i_54_ + -i_52_ : i_52_ - i_54_);
			    is_19_[i] = (i_53_ <= i_55_ ? i_55_ - i_53_
					 : i_53_ + -i_55_);
			    is_21_[i] = (i_56_ < i_57_ ? -i_56_ + i_57_
					 : -i_57_ + i_56_);
			}
			break while_287_;
		    } while (false);
		    for (i = 0;
			 (Class112.anInt1876 ^ 0xffffffff) < (i ^ 0xffffffff);
			 i++) {
			int i_58_ = is_26_[i];
			int i_59_ = is_27_[i];
			int i_60_ = is_22_[i];
			int i_61_ = is_24_[i];
			int i_62_ = is_25_[i];
			int i_63_ = is_23_[i];
			is_20_[i]
			    = i_63_ + (i_62_ + -(i_62_ * i_63_ >> 2111173483));
			is_19_[i]
			    = i_60_ - -i_58_ - (i_58_ * i_60_ >> 471946155);
			is_21_[i]
			    = i_61_ + i_59_ + -(i_59_ * i_61_ >> -1983009141);
		    }
		}
	    } while (false);
	    is = is_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cm.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	    do {
		if (i != 0) {
		    if (-2 != (i ^ 0xffffffff))
			break;
		} else {
		    anInt4108 = arg2.method798(60);
		    break;
		}
		aBoolean2862
		    = (arg2.method798(arg1 + -24900) ^ 0xffffffff) == -2;
	    } while (false);
	    anInt4109++;
	    if (arg1 != 24777)
		method474(-96, -78);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cm.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class14_Sub8_Sub2() {
	super(2, false);
    }
    
    public static void method488(int arg0, Class32[] arg1, boolean arg2) {
	try {
	    anInt4110++;
	    if (!arg2) {
		for (int i = 0; -5 < (i ^ 0xffffffff); i++) {
		    for (int i_64_ = 0; 104 > i_64_; i_64_++) {
			for (int i_65_ = 0; (i_65_ ^ 0xffffffff) > -105;
			     i_65_++) {
			    if (((Class14_Sub8_Sub4.aByteArrayArrayArray4142[i]
				  [i_64_][i_65_]) & 0x1
				 ^ 0xffffffff)
				== -2) {
				int i_66_ = i;
				if (-3 == ((Class14_Sub8_Sub4
					    .aByteArrayArrayArray4142[1][i_64_]
					    [i_65_]) & 0x2
					   ^ 0xffffffff))
				    i_66_--;
				if (-1 >= (i_66_ ^ 0xffffffff))
				    arg1[i_66_].method1080(i_64_, -115, i_65_);
			    }
			}
		    }
		}
		Class51.anInt830 += -2 + (int) (Math.random() * 5.0);
		if (7 < (Class51.anInt830 ^ 0xffffffff))
		    Class51.anInt830 = -8;
		Class14_Sub8_Sub26.anInt4527
		    += -2 + (int) (Math.random() * 5.0);
		if ((Class51.anInt830 ^ 0xffffffff) < -9)
		    Class51.anInt830 = 8;
		if (15 < (Class14_Sub8_Sub26.anInt4527 ^ 0xffffffff))
		    Class14_Sub8_Sub26.anInt4527 = -16;
		if (-17 > (Class14_Sub8_Sub26.anInt4527 ^ 0xffffffff))
		    Class14_Sub8_Sub26.anInt4527 = 16;
	    }
	    int i = Class14_Sub8_Sub26.anInt4527 >> 1269940961;
	    int i_67_;
	    if (!arg2)
		i_67_ = 4;
	    else
		i_67_ = 1;
	    int[][] is = new int[104][104];
	    int[][] is_68_ = new int[104][104];
	    int i_69_ = Class51.anInt830 >> -104899262 << -1627972406;
	    int i_70_ = 20 % ((-26 - arg0) / 44);
	    for (int i_71_ = 0; (i_71_ ^ 0xffffffff) > (i_67_ ^ 0xffffffff);
		 i_71_++) {
		byte[][] is_72_ = Class99_Sub2.aByteArrayArrayArray3354[i_71_];
		if (!Class7_Sub1.aBoolean2661) {
		    int i_73_ = (int) Class57.aFloatArray927[0];
		    int i_74_ = (int) Class57.aFloatArray927[1];
		    int i_75_ = (int) Class57.aFloatArray927[2];
		    int i_76_ = (int) Math.sqrt((double) (i_73_ * i_73_
							  + i_74_ * i_74_
							  - -(i_75_ * i_75_)));
		    int i_77_ = i_76_ * 1024 >> -1253507768;
		    for (int i_78_ = 1; (i_78_ ^ 0xffffffff) > -104; i_78_++) {
			for (int i_79_ = 1; i_79_ < 103; i_79_++) {
			    int i_80_ = 96;
			    int i_81_ = (-(Class114.anIntArrayArrayArray1896
					   [i_71_][i_79_][-1 + i_78_])
					 + (Class114.anIntArrayArrayArray1896
					    [i_71_][i_79_][1 + i_78_]));
			    int i_82_ = (-(Class114.anIntArrayArrayArray1896
					   [i_71_][i_79_ + -1][i_78_])
					 + (Class114.anIntArrayArrayArray1896
					    [i_71_][1 + i_79_][i_78_]));
			    int i_83_
				= (int) Math.sqrt((double) (65536
							    + i_82_ * i_82_
							    - -(i_81_
								* i_81_)));
			    int i_84_ = (i_82_ << 1690926792) / i_83_;
			    int i_85_ = -65536 / i_83_;
			    int i_86_ = (i_81_ << 904973864) / i_83_;
			    int i_87_
				= ((is_72_[i_79_][i_78_ + 1] >> -1266193085)
				   + ((is_72_[i_79_][i_78_ - 1] >> -424377214)
				      + ((is_72_[-1 + i_79_][i_78_]
					  >> -1177471518)
					 - (-(is_72_[1 + i_79_][i_78_]
					      >> -546231517)
					    + -(is_72_[i_79_][i_78_]
						>> 67643265)))));
			    i_80_ += (i_75_ * i_86_ + i_73_ * i_84_
				      - -(i_85_ * i_74_)) / i_77_;
			    is_68_[i_79_][i_78_]
				= -(int) (1.7F * (float) i_87_) + i_80_;
			}
		    }
		} else {
		    for (int i_88_ = 1; (i_88_ ^ 0xffffffff) > -104; i_88_++) {
			for (int i_89_ = 1; 103 > i_89_; i_89_++) {
			    int i_90_ = 74;
			    int i_91_
				= ((is_72_[i_89_][i_88_ - 1] >> 633100322)
				   + (is_72_[i_89_ - -1][i_88_] >> -1004976605)
				   + ((is_72_[-1 + i_89_][i_88_] >> 1060955394)
				      - (-(is_72_[i_89_][1 + i_88_]
					   >> 1449085059)
					 + -(is_72_[i_89_][i_88_]
					     >> -1970788959))));
			    is_68_[i_89_][i_88_] = -i_91_ + i_90_;
			}
		    }
		}
		for (int i_92_ = 0; i_92_ < 104; i_92_++) {
		    Class115.anIntArray1917[i_92_] = 0;
		    Class14_Sub2_Sub3.anIntArray3773[i_92_] = 0;
		    Class21.anIntArray442[i_92_] = 0;
		    Class14_Sub2_Sub18.anIntArray4023[i_92_] = 0;
		    Class14_Sub2_Sub17.anIntArray4020[i_92_] = 0;
		}
		for (int i_93_ = -5; i_93_ < 104; i_93_++) {
		    for (int i_94_ = 0; i_94_ < 104; i_94_++) {
			int i_95_ = 5 + i_93_;
			if (-105 < (i_95_ ^ 0xffffffff)) {
			    int i_96_ = ((Class97.aByteArrayArrayArray1645
					  [i_71_][i_95_][i_94_])
					 & 0xff);
			    if ((i_96_ ^ 0xffffffff) < -1) {
				Class65 class65
				    = Class14_Sub2_Sub14.method335(-100,
								   -1 + i_96_);
				Class115.anIntArray1917[i_94_]
				    += class65.anInt1022;
				Class14_Sub2_Sub3.anIntArray3773[i_94_]
				    += class65.anInt1028;
				Class21.anIntArray442[i_94_]
				    += class65.anInt1023;
				Class14_Sub2_Sub18.anIntArray4023[i_94_]
				    += class65.anInt1027;
				Class14_Sub2_Sub17.anIntArray4020[i_94_]++;
			    }
			}
			int i_97_ = -5 + i_93_;
			if (i_97_ >= 0) {
			    int i_98_ = ((Class97.aByteArrayArrayArray1645
					  [i_71_][i_97_][i_94_])
					 & 0xff);
			    if (0 < i_98_) {
				Class65 class65
				    = Class14_Sub2_Sub14.method335(-98,
								   -1 + i_98_);
				Class115.anIntArray1917[i_94_]
				    -= class65.anInt1022;
				Class14_Sub2_Sub3.anIntArray3773[i_94_]
				    -= class65.anInt1028;
				Class21.anIntArray442[i_94_]
				    -= class65.anInt1023;
				Class14_Sub2_Sub18.anIntArray4023[i_94_]
				    -= class65.anInt1027;
				Class14_Sub2_Sub17.anIntArray4020[i_94_]--;
			    }
			}
		    }
		    if (i_93_ >= 0) {
			int i_99_ = 0;
			int i_100_ = 0;
			int i_101_ = 0;
			int i_102_ = 0;
			int i_103_ = 0;
			for (int i_104_ = -5; -105 < (i_104_ ^ 0xffffffff);
			     i_104_++) {
			    int i_105_ = i_104_ + -5;
			    int i_106_ = i_104_ + 5;
			    if ((i_106_ ^ 0xffffffff) > -105) {
				i_102_ += (Class14_Sub2_Sub17.anIntArray4020
					   [i_106_]);
				i_101_ += Class21.anIntArray442[i_106_];
				i_99_ += Class115.anIntArray1917[i_106_];
				i_100_ += (Class14_Sub2_Sub3.anIntArray3773
					   [i_106_]);
				i_103_ += (Class14_Sub2_Sub18.anIntArray4023
					   [i_106_]);
			    }
			    if (i_105_ >= 0) {
				i_99_ -= Class115.anIntArray1917[i_105_];
				i_101_ -= Class21.anIntArray442[i_105_];
				i_102_ -= (Class14_Sub2_Sub17.anIntArray4020
					   [i_105_]);
				i_100_ -= (Class14_Sub2_Sub3.anIntArray3773
					   [i_105_]);
				i_103_ -= (Class14_Sub2_Sub18.anIntArray4023
					   [i_105_]);
			    }
			    if (0 <= i_104_ && (i_102_ ^ 0xffffffff) < -1)
				is[i_93_][i_104_]
				    = Class37.method1113(256 * i_99_ / i_103_,
							 i_100_ / i_102_,
							 (byte) 69,
							 i_101_ / i_102_);
			}
		    }
		}
		for (int i_107_ = 1; 103 > i_107_; i_107_++) {
		    for (int i_108_ = 1; -104 < (i_108_ ^ 0xffffffff);
			 i_108_++) {
			if (arg2 || Class128.method1755(130068615)
			    || ((Class14_Sub8_Sub4.aByteArrayArrayArray4142[0]
				 [i_107_][i_108_]) & 0x2
				^ 0xffffffff) != -1
			    || (0 == ((Class14_Sub8_Sub4
				       .aByteArrayArrayArray4142[i_71_][i_107_]
				       [i_108_])
				      & 0x10)
				&& (Class150.method2023(i_108_, i_71_, i_107_,
							-10403)
				    == Class142.anInt2295))) {
			    if ((i_71_ ^ 0xffffffff)
				> (Class7_Sub2.anInt2676 ^ 0xffffffff))
				Class7_Sub2.anInt2676 = i_71_;
			    int i_109_ = ((Class97.aByteArrayArrayArray1645
					   [i_71_][i_107_][i_108_])
					  & 0xff);
			    int i_110_ = 0xff & (Class14_Sub8_Sub6
						 .aByteArrayArrayArray4194
						 [i_71_][i_107_][i_108_]);
			    if ((i_109_ ^ 0xffffffff) < -1 || 0 < i_110_) {
				int i_111_ = (Class114.anIntArrayArrayArray1896
					      [i_71_][i_107_][i_108_]);
				int i_112_
				    = (Class114.anIntArrayArrayArray1896[i_71_]
				       [1 + i_107_][i_108_ - -1]);
				int i_113_ = (Class114.anIntArrayArrayArray1896
					      [i_71_][i_107_ - -1][i_108_]);
				int i_114_ = (Class114.anIntArrayArrayArray1896
					      [i_71_][i_107_][i_108_ + 1]);
				if (0 < i_71_) {
				    boolean bool = true;
				    if (i_109_ == 0
					&& -1 != ((Class20
						   .aByteArrayArrayArray430
						   [i_71_][i_107_][i_108_])
						  ^ 0xffffffff))
					bool = false;
				    if (-1 > (i_110_ ^ 0xffffffff)
					&& !(Class97.method1489
					     (-1 + i_110_, -9810)
					     .aBoolean2410))
					bool = false;
				    if (bool && i_113_ == i_111_
					&& i_112_ == i_111_
					&& i_114_ == i_111_)
					Class66.anIntArrayArrayArray1050
					    [i_71_][i_107_][i_108_]
					    = (Class66.method1294
					       ((Class66
						 .anIntArrayArrayArray1050
						 [i_71_][i_107_][i_108_]),
						4));
				}
				int i_115_;
				int i_116_;
				if ((i_109_ ^ 0xffffffff) < -1) {
				    i_116_ = is[i_107_][i_108_];
				    int i_117_ = (i_116_ & 0x7f) + i;
				    if (0 <= i_117_) {
					if (-128 > (i_117_ ^ 0xffffffff))
					    i_117_ = 127;
				    } else
					i_117_ = 0;
				    int i_118_
					= (i_117_ + (i_116_ + i_69_ & 0xfc00)
					   - -(0x380 & i_116_));
				    i_115_
					= (Class3.anIntArray119
					   [Class14_Sub2_Sub21
						.method441(96, 127, i_118_)]);
				} else {
				    i_115_ = 0;
				    i_116_ = -1;
				}
				int i_119_ = is_68_[i_107_][i_108_];
				int i_120_ = is_68_[i_107_ - -1][i_108_];
				int i_121_ = is_68_[i_107_ - -1][i_108_ - -1];
				int i_122_ = is_68_[i_107_][1 + i_108_];
				if (0 == i_110_) {
				    Class22.method987
					(i_71_, i_107_, i_108_, 0, 0, -1,
					 i_111_, i_113_, i_112_, i_114_,
					 Class14_Sub2_Sub21
					     .method441(i_119_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_120_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_121_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_122_, 127, i_116_),
					 0, 0, 0, 0, i_115_, 0);
				    if (0 < i_71_ && i_116_ != -1
					&& (Class14_Sub2_Sub14.method335
					    (-107, -1 + i_109_).aBoolean1020))
					Class151.method2042
					    (0, 0, true, false, i_107_, i_108_,
					     -(Class114
					       .anIntArrayArrayArray1896[0]
					       [i_107_][i_108_]) + i_111_,
					     (i_113_
					      - (Class114
						 .anIntArrayArrayArray1896[0]
						 [1 + i_107_][i_108_])),
					     (-(Class114
						.anIntArrayArrayArray1896[0]
						[1 + i_107_][1 + i_108_])
					      + i_112_),
					     -(Class114
					       .anIntArrayArrayArray1896[0]
					       [i_107_][1 + i_108_]) + i_114_);
				    if (!arg2
					&& null != (Class14_Sub5
						    .anIntArrayArray2799)
					&& (i_71_ ^ 0xffffffff) == -1) {
				    while_288_:
					for (int i_123_ = -1 + i_107_;
					     ((i_107_ + 1 ^ 0xffffffff)
					      <= (i_123_ ^ 0xffffffff));
					     i_123_++) {
					    for (int i_124_ = -1 + i_108_;
						 i_124_ <= 1 + i_108_;
						 i_124_++) {
						if ((((i_107_ ^ 0xffffffff)
						      != (i_123_ ^ 0xffffffff))
						     || ((i_108_ ^ 0xffffffff)
							 != (i_124_
							     ^ 0xffffffff)))
						    && i_123_ >= 0
						    && 104 > i_123_
						    && 0 <= i_124_
						    && -105 < (i_124_
							       ^ 0xffffffff)) {
						    int i_125_
							= (0xff
							   & (Class14_Sub8_Sub6
							      .aByteArrayArrayArray4194
							      [i_71_][i_123_]
							      [i_124_]));
						    if ((i_125_ ^ 0xffffffff)
							!= -1) {
							Class150 class150
							    = (Class97
								   .method1489
							       (-1 + i_125_,
								-9810));
							if ((class150.anInt2414
							     != -1)
							    && (((Class3
								      .anInterface3_117
								      .method12
								  (true,
								   (class150
								    .anInt2414)))
								 ^ 0xffffffff)
								== -5)) {
							    Class14_Sub5
								.anIntArrayArray2799
								[i_107_]
								[i_108_]
								= ((class150
								    .anInt2426)
								   + ((class150
								       .anInt2413)
								      << -915548552));
							    break while_288_;
							}
						    }
						}
					    }
					}
				    }
				} else {
				    int i_126_
					= ((Class20.aByteArrayArrayArray430
					    [i_71_][i_107_][i_108_])
					   + 1);
				    byte i_127_
					= (Class15.aByteArrayArrayArray385
					   [i_71_][i_107_][i_108_]);
				    Class150 class150
					= Class97.method1489(i_110_ - 1,
							     -9810);
				    if (!arg2
					&& (Class14_Sub5.anIntArrayArray2799
					    != null)
					&& 0 == i_71_) {
					if (0 == (class150.anInt2414
						  ^ 0xffffffff)
					    || -5 != ((Class3
							   .anInterface3_117
							   .method12
						       (true,
							class150.anInt2414))
						      ^ 0xffffffff)) {
					while_289_:
					    for (int i_128_ = i_107_ + -1;
						 i_128_ <= 1 + i_107_;
						 i_128_++) {
						for (int i_129_ = i_108_ - 1;
						     ((1 + i_108_ ^ 0xffffffff)
						      <= (i_129_
							  ^ 0xffffffff));
						     i_129_++) {
						    if ((i_128_ != i_107_
							 || i_129_ != i_108_)
							&& -1 >= (i_128_
								  ^ 0xffffffff)
							&& ((i_128_
							     ^ 0xffffffff)
							    > -105)
							&& 0 <= i_129_
							&& (-105
							    < (i_129_
							       ^ 0xffffffff))) {
							int i_130_
							    = (Class14_Sub8_Sub6
							       .aByteArrayArrayArray4194
							       [i_71_][i_128_]
							       [i_129_]) & 0xff;
							if (-1
							    != (i_130_
								^ 0xffffffff)) {
							    Class150 class150_131_
								= (Class97
								       .method1489
								   (i_130_ - 1,
								    -9810));
							    if (((class150_131_
								  .anInt2414)
								 != -1)
								&& (4
								    == (Class3
									    .anInterface3_117
									    .method12
									(true,
									 (class150_131_
									  .anInt2414))))) {
								Class14_Sub5
								    .anIntArrayArray2799
								    [i_107_]
								    [i_108_]
								    = (((class150_131_
									 .anInt2413)
									<< 311103480)
								       + (class150_131_
									  .anInt2426));
								break while_289_;
							    }
							}
						    }
						}
					    }
					} else
					    Class14_Sub5
						.anIntArrayArray2799[i_107_]
						[i_108_]
						= (class150.anInt2426
						   + (class150.anInt2413
						      << -53073960));
				    }
				    int i_132_ = class150.anInt2414;
				    if ((i_132_ ^ 0xffffffff) <= -1
					&& !Class3.anInterface3_117
						.method13(0, i_132_))
					i_132_ = -1;
				    int i_133_;
				    int i_134_;
				    if (-1 < (i_132_ ^ 0xffffffff)) {
					if (class150.anInt2411 != -1) {
					    i_133_ = class150.anInt2411;
					    int i_135_ = (0x7f & i_133_) - -i;
					    if ((i_135_ ^ 0xffffffff) > -1)
						i_135_ = 0;
					    else if (127 < i_135_)
						i_135_ = 127;
					    int i_136_
						= ((0xfc00 & i_69_ + i_133_)
						   + ((0x380 & i_133_)
						      + i_135_));
					    i_134_
						= (Class3.anIntArray119
						   [(Class7_Sub3_Sub1.method135
						     (false, 96, i_136_))]);
					} else {
					    i_133_ = -2;
					    i_134_ = 0;
					}
				    } else {
					i_133_ = -1;
					i_134_
					    = (Class3.anIntArray119
					       [(Class7_Sub3_Sub1.method135
						 (false, 96,
						  (Class3.anInterface3_117
						       .method5
						   (i_132_, (byte) -116))))]);
				    }
				    if (class150.anInt2405 >= 0) {
					int i_137_ = class150.anInt2405;
					int i_138_ = i + (0x7f & i_137_);
					if (i_138_ >= 0) {
					    if ((i_138_ ^ 0xffffffff) < -128)
						i_138_ = 127;
					} else
					    i_138_ = 0;
					int i_139_
					    = (i_138_ + (0x380 & i_137_)
					       + (i_69_ + i_137_ & 0xfc00));
					i_134_ = (Class3.anIntArray119
						  [(Class7_Sub3_Sub1.method135
						    (false, 96, i_139_))]);
				    }
				    Class22.method987
					(i_71_, i_107_, i_108_, i_126_, i_127_,
					 i_132_, i_111_, i_113_, i_112_,
					 i_114_,
					 Class14_Sub2_Sub21
					     .method441(i_119_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_120_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_121_, 127, i_116_),
					 Class14_Sub2_Sub21
					     .method441(i_122_, 127, i_116_),
					 Class7_Sub3_Sub1
					     .method135(false, i_119_, i_133_),
					 Class7_Sub3_Sub1
					     .method135(false, i_120_, i_133_),
					 Class7_Sub3_Sub1
					     .method135(false, i_121_, i_133_),
					 Class7_Sub3_Sub1
					     .method135(false, i_122_, i_133_),
					 i_115_, i_134_);
				    if (i_71_ > 0)
					Class151.method2042
					    (i_126_, i_127_,
					     (i_133_ == -2
					      || !class150.aBoolean2407),
					     (0 == (i_116_ ^ 0xffffffff)
					      || !(Class14_Sub2_Sub14.method335
						   (-92, i_109_ - 1)
						   .aBoolean1020)),
					     i_107_, i_108_,
					     (i_111_
					      - (Class114
						 .anIntArrayArrayArray1896[0]
						 [i_107_][i_108_])),
					     (i_113_
					      + -(Class114
						  .anIntArrayArrayArray1896[0]
						  [i_107_ + 1][i_108_])),
					     (i_112_
					      + -(Class114
						  .anIntArrayArrayArray1896[0]
						  [i_107_ - -1][1 + i_108_])),
					     (i_114_
					      - (Class114
						 .anIntArrayArrayArray1896[0]
						 [i_107_][1 + i_108_])));
				}
			    }
			}
		    }
		}
		float[][] fs = new float[105][105];
		float[][] fs_140_ = new float[105][105];
		int[][] is_141_ = Class114.anIntArrayArrayArray1896[i_71_];
		float[][] fs_142_ = new float[105][105];
		for (int i_143_ = 1; -104 <= (i_143_ ^ 0xffffffff); i_143_++) {
		    for (int i_144_ = 1; i_144_ <= 103; i_144_++) {
			int i_145_ = (-is_141_[i_144_ - 1][i_143_]
				      + is_141_[i_144_ - -1][i_143_]);
			int i_146_ = (is_141_[i_144_][i_143_ + 1]
				      + -is_141_[i_144_][i_143_ + -1]);
			float f
			    = (float) Math.sqrt((double) (i_146_ * i_146_
							  + 65536
							  + i_145_ * i_145_));
			fs[i_144_][i_143_] = (float) i_145_ / f;
			fs_140_[i_144_][i_143_] = -256.0F / f;
			fs_142_[i_144_][i_143_] = (float) i_146_ / f;
		    }
		}
		if (arg2) {
		    Class14_Sub27[] class14_sub27s
			= (Class47.method1189
			   (fs_140_, is_68_,
			    Class149.anIntArrayArrayArray2391[0], fs,
			    (byte) -125,
			    Class14_Sub8_Sub4.aByteArrayArrayArray4142, i_71_,
			    is, Class15.aByteArrayArrayArray385[i_71_],
			    Class97.aByteArrayArrayArray1645[i_71_],
			    Class14_Sub8_Sub6.aByteArrayArrayArray4194[i_71_],
			    Class14_Sub5.anIntArrayArray2799,
			    Class20.aByteArrayArrayArray430[i_71_], fs_142_,
			    Class114.anIntArrayArrayArray1896[i_71_]));
		    Class14_Sub21.method895(i_71_, class14_sub27s);
		} else {
		    Class14_Sub27[] class14_sub27s
			= (Class47.method1189
			   (fs_140_, is_68_, null, fs, (byte) -109,
			    Class14_Sub8_Sub4.aByteArrayArrayArray4142, i_71_,
			    is, Class15.aByteArrayArrayArray385[i_71_],
			    Class97.aByteArrayArrayArray1645[i_71_],
			    Class14_Sub8_Sub6.aByteArrayArrayArray4194[i_71_],
			    null, Class20.aByteArrayArrayArray430[i_71_],
			    fs_142_,
			    Class114.anIntArrayArrayArray1896[i_71_]));
		    Class14_Sub27[] class14_sub27s_147_
			= (Class81.method1398
			   (Class114.anIntArrayArrayArray1896[i_71_],
			    Class15.aByteArrayArrayArray385[i_71_], 4,
			    Class14_Sub8_Sub6.aByteArrayArrayArray4194[i_71_],
			    Class20.aByteArrayArrayArray430[i_71_], i_71_, fs,
			    fs_140_, is_68_,
			    Class14_Sub8_Sub4.aByteArrayArrayArray4142,
			    fs_142_, Class97.aByteArrayArrayArray1645[i_71_]));
		    Class14_Sub27[] class14_sub27s_148_
			= new Class14_Sub27[(class14_sub27s.length
					     - -class14_sub27s_147_.length)];
		    for (int i_149_ = 0;
			 ((i_149_ ^ 0xffffffff)
			  > (class14_sub27s.length ^ 0xffffffff));
			 i_149_++)
			class14_sub27s_148_[i_149_] = class14_sub27s[i_149_];
		    for (int i_150_ = 0;
			 ((class14_sub27s_147_.length ^ 0xffffffff)
			  < (i_150_ ^ 0xffffffff));
			 i_150_++)
			class14_sub27s_148_[class14_sub27s.length + i_150_]
			    = class14_sub27s_147_[i_150_];
		    Class14_Sub21.method895(i_71_, class14_sub27s_148_);
		    Class32.method1064
			(Class15.aByteArrayArrayArray385[i_71_],
			 Class20.aByteArrayArrayArray430[i_71_], fs_140_,
			 Class97.aByteArrayArrayArray1645[i_71_], fs_142_,
			 Class10.aClass73Array247, -46, i_71_,
			 Class114.anIntArrayArrayArray1896[i_71_],
			 Class14_Sub8_Sub6.aByteArrayArrayArray4194[i_71_],
			 Class10.anInt251, fs);
		}
		Class97.aByteArrayArrayArray1645[i_71_] = null;
		Class14_Sub8_Sub6.aByteArrayArrayArray4194[i_71_] = null;
		Class20.aByteArrayArrayArray430[i_71_] = null;
		Class15.aByteArrayArrayArray385[i_71_] = null;
		Class99_Sub2.aByteArrayArrayArray3354[i_71_] = null;
	    }
	    Class1.method70(-50, -10, -50);
	    if (!arg2) {
		for (int i_151_ = 0; 104 > i_151_; i_151_++) {
		    for (int i_152_ = 0; (i_152_ ^ 0xffffffff) > -105;
			 i_152_++) {
			if (2 == (0x2
				  & (Class14_Sub8_Sub4.aByteArrayArrayArray4142
				     [1][i_151_][i_152_])))
			    Class109.method1569(i_151_, i_152_);
		    }
		}
		for (int i_153_ = 0; i_153_ < 4; i_153_++) {
		    for (int i_154_ = 0; i_154_ <= 104; i_154_++) {
			for (int i_155_ = 0; -105 <= (i_155_ ^ 0xffffffff);
			     i_155_++) {
			    if (-1 != ((Class66.anIntArrayArrayArray1050
					[i_153_][i_155_][i_154_]) & 0x1
				       ^ 0xffffffff)) {
				int i_156_;
				for (i_156_ = i_154_;
				     ((i_156_ ^ 0xffffffff) < -1
				      && 0 != ((Class66
						.anIntArrayArrayArray1050
						[i_153_][i_155_][i_156_ + -1])
					       & 0x1));
				     i_156_--) {
				    /* empty */
				}
				int i_157_;
				for (i_157_ = i_154_;
				     (-105 < (i_157_ ^ 0xffffffff)
				      && ((Class66.anIntArrayArrayArray1050
					   [i_153_][i_155_][1 + i_157_]) & 0x1
					  ^ 0xffffffff) != -1);
				     i_157_++) {
				    /* empty */
				}
				int i_158_;
			    while_290_:
				for (i_158_ = i_153_;
				     (i_158_ ^ 0xffffffff) < -1; i_158_--) {
				    for (int i_159_ = i_156_; i_157_ >= i_159_;
					 i_159_++) {
					if (-1 == ((Class66
						    .anIntArrayArrayArray1050
						    [i_158_ + -1][i_155_]
						    [i_159_]) & 0x1
						   ^ 0xffffffff))
					    break while_290_;
				    }
				}
				int i_160_;
			    while_291_:
				for (i_160_ = i_153_; 3 > i_160_; i_160_++) {
				    for (int i_161_ = i_156_; i_161_ <= i_157_;
					 i_161_++) {
					if ((0x1 & (Class66
						    .anIntArrayArrayArray1050
						    [1 + i_160_][i_155_]
						    [i_161_])
					     ^ 0xffffffff)
					    == -1)
					    break while_291_;
				    }
				}
				int i_162_ = ((-i_158_ + i_160_ + 1)
					      * (1 + (i_157_ - i_156_)));
				if (8 <= i_162_) {
				    int i_163_ = 240;
				    int i_164_
					= ((Class114.anIntArrayArrayArray1896
					    [i_160_][i_155_][i_156_])
					   - i_163_);
				    int i_165_
					= (Class114.anIntArrayArrayArray1896
					   [i_158_][i_155_][i_156_]);
				    Class7.method120(1, 128 * i_155_,
						     i_155_ * 128,
						     128 * i_156_,
						     128 + 128 * i_157_,
						     i_164_, i_165_);
				    for (int i_166_ = i_158_; i_160_ >= i_166_;
					 i_166_++) {
					for (int i_167_ = i_156_;
					     i_167_ <= i_157_; i_167_++)
					    Class66
						.anIntArrayArrayArray1050
						[i_166_][i_155_][i_167_]
						= (Class14_Sub8_Sub26.method617
						   ((Class66
						     .anIntArrayArrayArray1050
						     [i_166_][i_155_][i_167_]),
						    -2));
				    }
				}
			    }
			    if (((Class66.anIntArrayArrayArray1050[i_153_]
				  [i_155_][i_154_]) & 0x2
				 ^ 0xffffffff)
				!= -1) {
				int i_168_;
				for (i_168_ = i_155_;
				     (i_168_ > 0
				      && ((Class66.anIntArrayArrayArray1050
					   [i_153_][i_168_ - 1][i_154_]) & 0x2
					  ^ 0xffffffff) != -1);
				     i_168_--) {
				    /* empty */
				}
				int i_169_;
				for (i_169_ = i_155_;
				     (i_169_ < 104
				      && 0 != ((Class66
						.anIntArrayArrayArray1050
						[i_153_][1 + i_169_][i_154_])
					       & 0x2));
				     i_169_++) {
				    /* empty */
				}
				int i_170_ = i_153_;
				int i_171_ = i_153_;
			    while_292_:
				for (/**/; 0 < i_170_; i_170_--) {
				    for (int i_172_ = i_168_; i_169_ >= i_172_;
					 i_172_++) {
					if (-1
					    == ((0x2
						 & (Class66
						    .anIntArrayArrayArray1050
						    [-1 + i_170_][i_172_]
						    [i_154_]))
						^ 0xffffffff))
					    break while_292_;
				    }
				}
			    while_293_:
				for (/**/; (i_171_ ^ 0xffffffff) > -4;
				     i_171_++) {
				    for (int i_173_ = i_168_; i_173_ <= i_169_;
					 i_173_++) {
					if ((0x2 & (Class66
						    .anIntArrayArrayArray1050
						    [i_171_ + 1][i_173_]
						    [i_154_])
					     ^ 0xffffffff)
					    == -1)
					    break while_293_;
				    }
				}
				int i_174_ = ((1 + i_169_ - i_168_)
					      * (1 + i_171_ + -i_170_));
				if (8 <= i_174_) {
				    int i_175_ = 240;
				    int i_176_
					= (Class114.anIntArrayArrayArray1896
					   [i_170_][i_168_][i_154_]);
				    int i_177_
					= (-i_175_
					   + (Class114.anIntArrayArrayArray1896
					      [i_171_][i_168_][i_154_]));
				    Class7.method120(2, 128 * i_168_,
						     128 + 128 * i_169_,
						     i_154_ * 128,
						     i_154_ * 128, i_177_,
						     i_176_);
				    for (int i_178_ = i_170_; i_178_ <= i_171_;
					 i_178_++) {
					for (int i_179_ = i_168_;
					     ((i_169_ ^ 0xffffffff)
					      <= (i_179_ ^ 0xffffffff));
					     i_179_++)
					    Class66
						.anIntArrayArrayArray1050
						[i_178_][i_179_][i_154_]
						= (Class14_Sub8_Sub26.method617
						   ((Class66
						     .anIntArrayArrayArray1050
						     [i_178_][i_179_][i_154_]),
						    -3));
				    }
				}
			    }
			    if (((Class66.anIntArrayArrayArray1050[i_153_]
				  [i_155_][i_154_]) & 0x4
				 ^ 0xffffffff)
				!= -1) {
				int i_180_ = i_155_;
				int i_181_ = i_154_;
				int i_182_ = i_154_;
				int i_183_ = i_155_;
				for (/**/;
				     (-105 < (i_181_ ^ 0xffffffff)
				      && -1 != (((Class66
						  .anIntArrayArrayArray1050
						  [i_153_][i_155_][1 + i_181_])
						 & 0x4)
						^ 0xffffffff));
				     i_181_++) {
				    /* empty */
				}
				for (/**/;
				     ((i_182_ ^ 0xffffffff) < -1
				      && (-1
					  != (0x4 & (Class66
						     .anIntArrayArrayArray1050
						     [i_153_][i_155_]
						     [i_182_ - 1])
					      ^ 0xffffffff)));
				     i_182_--) {
				    /* empty */
				}
			    while_294_:
				for (/**/; -1 > (i_180_ ^ 0xffffffff);
				     i_180_--) {
				    for (int i_184_ = i_182_;
					 ((i_184_ ^ 0xffffffff)
					  >= (i_181_ ^ 0xffffffff));
					 i_184_++) {
					if (-1
					    == ((0x4
						 & (Class66
						    .anIntArrayArrayArray1050
						    [i_153_][-1 + i_180_]
						    [i_184_]))
						^ 0xffffffff))
					    break while_294_;
				    }
				}
			    while_295_:
				for (/**/; -105 < (i_183_ ^ 0xffffffff);
				     i_183_++) {
				    for (int i_185_ = i_182_;
					 ((i_185_ ^ 0xffffffff)
					  >= (i_181_ ^ 0xffffffff));
					 i_185_++) {
					if ((0x4
					     & (Class66
						.anIntArrayArrayArray1050
						[i_153_][1 + i_183_][i_185_]))
					    == 0)
					    break while_295_;
				    }
				}
				if (4 <= ((-i_180_ + (i_183_ + 1))
					  * (i_181_ + (-i_182_ - -1)))) {
				    int i_186_
					= (Class114.anIntArrayArrayArray1896
					   [i_153_][i_180_][i_182_]);
				    Class7.method120(4, 128 * i_180_,
						     i_183_ * 128 + 128,
						     i_182_ * 128,
						     128 * i_181_ - -128,
						     i_186_, i_186_);
				    for (int i_187_ = i_180_; i_187_ <= i_183_;
					 i_187_++) {
					for (int i_188_ = i_182_;
					     i_188_ <= i_181_; i_188_++)
					    Class66
						.anIntArrayArrayArray1050
						[i_153_][i_187_][i_188_]
						= (Class14_Sub8_Sub26.method617
						   ((Class66
						     .anIntArrayArrayArray1050
						     [i_153_][i_187_][i_188_]),
						    -5));
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("cm.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method489(int arg0) {
	try {
	    aClass55_4112 = null;
	    aClass124_4116 = null;
	    aClass124_4119 = null;
	    int i = -37 % ((arg0 - 41) / 51);
	    aClass124_4122 = null;
	    aClass124_4115 = null;
	    aClass124_4121 = null;
	    aClass124_4118 = null;
	    aClass124_4113 = null;
	    aClass124_4120 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cm.D(" + arg0 + ')');
	}
    }
    
    public static void method490(int arg0, int arg1, int arg2, int arg3,
				 byte arg4) {
    while_297_:
	do {
	while_296_:
	    do {
		do {
		    try {
			Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
			Class55.aClass14_Sub10_Sub1_891.method809(false, 85);
			Class55.aClass14_Sub10_Sub1_891.method809(false, arg3);
			Class55.aClass14_Sub10_Sub1_891.method809(false, arg0);
			anInt4117++;
			if (arg4 == -28)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_296_;
		    }
		    return;
		} while (false);
		try {
		    Class55.aClass14_Sub10_Sub1_891.method833((byte) 100,
							      arg1);
		    Class55.aClass14_Sub10_Sub1_891.method833((byte) 96, arg2);
		    Class56.anInt918 = 1;
		    Class14_Sub8_Sub35.anInt4686 = 0;
		    Class14_Sub2.anInt2734 = -3;
		    Class129.anInt2136 = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_297_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("cm.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	} while (false);
    }
    
    static {
	anInt4114 = 0;
	aClass124_4116 = Class14_Sub2_Sub2.method263(1178, "<col=00ff00>");
	aClass124_4113 = aClass124_4115;
	aClass55_4112 = new Class55(32);
	aClass124_4120
	    = Class14_Sub2_Sub2.method263(1178, "Loading title screen )2 ");
	aClass124_4121 = Class14_Sub2_Sub2.method263(1178, ": ");
	aClass124_4122 = aClass124_4120;
	aClass124_4119 = Class14_Sub2_Sub2.method263(1178, "Drop");
	aClass124_4118 = aClass124_4119;
    }
}
