/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class99
{
    public static int anInt1674;
    public static int anInt1675;
    public static int anInt1676;
    public static Class124 aClass124_1677
	= Class14_Sub2_Sub2.method263(1178, "details");
    public static int anInt1678;
    public static Class124 aClass124_1679
	= Class14_Sub2_Sub2
	      .method263(1178, "Clientscript error )2 check log for details");
    public static int anInt1680;
    
	public static Class39 method1497(boolean arg0) {
		try {
			if(!arg0)
				return (Class39)null;
		} catch(RuntimeException runtimeexception) {
			throw Class14_Sub8_Sub14.method554(runtimeexception, "pe.N(" + arg0 + ')');
		}
		anInt1678++;
		try {
			return (Class39)Class.forName("Class39_Sub1").newInstance();
		} catch(Throwable throwable) {
			return null;
		}
	}
    
    public static boolean method1498(byte arg0, boolean arg1, int arg2,
				     Class14_Sub29[][][] arg3, int arg4,
				     int arg5) {
	try {
    while_2_:
	do {
	boolean bool_3_;
	    byte i;
	    do {
		boolean bool_0_;
		try {
		    i = arg1 ? (byte) 1 : (byte) (0xff & Class42.anInt699);
		    anInt1675++;
		    if ((Class28.aByteArrayArrayArray512
			 [Class14_Sub2_Sub3.anInt3785][arg4][arg2])
			!= i)
			break;
		    bool_0_ = false;
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return bool_0_;
	    } while (false);
	    do {
		boolean bool_1_;
		try {
		    if (-1
			!= ((Class14_Sub8_Sub4.aByteArrayArrayArray4142
			     [Class14_Sub2_Sub3.anInt3785][arg4][arg2]) & 0x4
			    ^ 0xffffffff))
			break;
		    bool_1_ = false;
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return bool_1_;
	    } while (false);
	    try {
		int i_0_ = 0;
		if (arg0 < 30)
		    method1498((byte) 107, true, -126, null, 40, 117);
		int i_1_ = 0;
		Class14_Sub8_Sub36.anIntArray4691[i_1_] = arg4;
		Class14_Sub2_Sub21.anIntArray4078[i_1_++] = arg2;
		Class28.aByteArrayArrayArray512
		    [Class14_Sub2_Sub3.anInt3785][arg4][arg2]
		    = i;
		while ((i_0_ ^ 0xffffffff) != (i_1_ ^ 0xffffffff)) {
		    int i_2_
			= Class14_Sub8_Sub36.anIntArray4691[i_0_] & 0xffff;
		    int i_3_
			= (Class14_Sub8_Sub36.anIntArray4691[i_0_] >> -83128624
			   & 0xff);
		    int i_4_ = ((Class14_Sub8_Sub36.anIntArray4691[i_0_]
				 >> -1987840488)
				& 0xff);
		    int i_5_
			= Class14_Sub2_Sub21.anIntArray4078[i_0_] & 0xffff;
		    int i_6_
			= ((0xfff2fd & Class14_Sub2_Sub21.anIntArray4078[i_0_])
			   >> -548334608);
		    i_0_ = i_0_ + 1 & 0xfff;
		    boolean bool = false;
		    if (0 == ((Class14_Sub8_Sub4.aByteArrayArrayArray4142
			       [Class14_Sub2_Sub3.anInt3785][i_2_][i_5_])
			      & 0x4))
			bool = true;
		    boolean bool_7_ = false;
		while_1_:
		    for (int i_8_ = 1 + Class14_Sub2_Sub3.anInt3785; i_8_ <= 3;
			 i_8_++) {
			if (((Class14_Sub8_Sub4.aByteArrayArrayArray4142[i_8_]
			      [i_2_][i_5_]) & 0x8
			     ^ 0xffffffff)
			    == -1) {
			    if (bool && null != arg3[i_8_][i_2_][i_5_]) {
				if (null
				    != arg3[i_8_][i_2_][i_5_].aClass113_3250) {
				    int i_9_ = Class79.method1382(-23, i_3_);
				    if (((arg3[i_8_][i_2_][i_5_].aClass113_3250
					  .anInt1880)
					 ^ 0xffffffff) == (i_9_ ^ 0xffffffff)
					|| (arg3[i_8_][i_2_][i_5_]
					    .aClass113_3250.anInt1888) == i_9_)
					continue;
				    if (0 != i_4_) {
					int i_10_
					    = Class79.method1382(-120, i_4_);
					if ((((arg3[i_8_][i_2_][i_5_]
					       .aClass113_3250.anInt1880)
					      ^ 0xffffffff)
					     == (i_10_ ^ 0xffffffff))
					    || ((arg3[i_8_][i_2_][i_5_]
						 .aClass113_3250.anInt1888)
						== i_10_))
					    continue;
				    }
				    if (-1 != (i_6_ ^ 0xffffffff)) {
					int i_11_
					    = Class79.method1382(-15, i_6_);
					if (((arg3[i_8_][i_2_][i_5_]
					      .aClass113_3250.anInt1880)
					     == i_11_)
					    || ((arg3[i_8_][i_2_][i_5_]
						 .aClass113_3250.anInt1888)
						== i_11_))
					    continue;
				    }
				}
				if (arg3[i_8_][i_2_][i_5_].aClass40Array3257
				    != null) {
				    for (int i_12_ = 0;
					 (arg3[i_8_][i_2_][i_5_].anInt3242
					  > i_12_);
					 i_12_++) {
					int i_13_
					    = (int) (0x3L
						     & ((arg3[i_8_][i_2_][i_5_]
							 .aClass40Array3257
							 [i_12_].aLong677)
							>> 710531412));
					int i_14_
					    = (int) ((arg3[i_8_][i_2_][i_5_]
						      .aClass40Array3257[i_12_]
						      .aLong677) >> 1873171854
						     & 0x3fL);
					if (i_14_ == 21)
					    i_14_ = 19;
					int i_15_ = i_13_ << 455013926 | i_14_;
					if (i_15_ == i_3_
					    || 0 != i_4_ && i_4_ == i_15_
					    || ((i_6_ ^ 0xffffffff) != -1
						&& ((i_6_ ^ 0xffffffff)
						    == (i_15_ ^ 0xffffffff))))
					    continue while_1_;
				    }
				}
			    }
			    bool_7_ = true;
			    Class14_Sub29 class14_sub29
				= arg3[i_8_][i_2_][i_5_];
			    if (null != class14_sub29
				&& class14_sub29.anInt3242 > 0) {
				for (int i_16_ = 0;
				     ((class14_sub29.anInt3242 ^ 0xffffffff)
				      < (i_16_ ^ 0xffffffff));
				     i_16_++) {
				    Class40 class40
					= (class14_sub29.aClass40Array3257
					   [i_16_]);
				    if (class40.anInt670 != class40.anInt668
					|| ((class40.anInt669 ^ 0xffffffff)
					    != (class40.anInt678
						^ 0xffffffff))) {
					for (int i_17_ = class40.anInt668;
					     i_17_ <= class40.anInt670;
					     i_17_++) {
					    for (int i_18_ = class40.anInt678;
						 ((i_18_ ^ 0xffffffff)
						  >= (class40.anInt669
						      ^ 0xffffffff));
						 i_18_++)
						Class28
						    .aByteArrayArrayArray512
						    [i_8_][i_17_][i_18_]
						    = i;
					}
				    }
				}
			    }
			    Class28.aByteArrayArrayArray512[i_8_][i_2_][i_5_]
				= i;
			}
		    }
		    if (bool_7_) {
			if ((Class114.anIntArrayArrayArray1896
			     [1 + Class14_Sub2_Sub3.anInt3785][i_2_][i_5_])
			    > Class14_Sub2_Sub11.anIntArray3872[arg5])
			    Class14_Sub2_Sub11.anIntArray3872[arg5]
				= (Class114.anIntArrayArrayArray1896
				   [1 + Class14_Sub2_Sub3.anInt3785][i_2_]
				   [i_5_]);
			int i_19_ = i_2_ << 2101676807;
			if ((Class14_Sub8_Sub20.anIntArray4422[arg5]
			     ^ 0xffffffff)
			    >= (i_19_ ^ 0xffffffff)) {
			    if ((Class14_Sub19.anIntArray3079[arg5]
				 ^ 0xffffffff)
				> (i_19_ ^ 0xffffffff))
				Class14_Sub19.anIntArray3079[arg5] = i_19_;
			} else
			    Class14_Sub8_Sub20.anIntArray4422[arg5] = i_19_;
			int i_20_ = i_5_ << -116375449;
			if ((Class96.anIntArray1630[arg5] ^ 0xffffffff)
			    >= (i_20_ ^ 0xffffffff)) {
			    if (i_20_ > Class120.anIntArray2008[arg5])
				Class120.anIntArray2008[arg5] = i_20_;
			} else
			    Class96.anIntArray1630[arg5] = i_20_;
		    }
		    if (!bool) {
			if ((i_2_ ^ 0xffffffff) <= -2
			    && i != (Class28.aByteArrayArrayArray512
				     [Class14_Sub2_Sub3.anInt3785][-1 + i_2_]
				     [i_5_])) {
			    Class14_Sub8_Sub36.anIntArray4691[i_1_]
				= (Class66.method1294
				   (Class66.method1294(i_2_ + -1, 1179648),
				    -754974720));
			    Class14_Sub2_Sub21.anIntArray4078[i_1_]
				= Class66.method1294(i_5_, 1245184);
			    i_1_ = 1 + i_1_ & 0xfff;
			    Class28.aByteArrayArrayArray512
				[Class14_Sub2_Sub3.anInt3785][i_2_ + -1][i_5_]
				= i;
			}
			if (-105 < (++i_5_ ^ 0xffffffff)) {
			    if ((i_2_ + -1 ^ 0xffffffff) <= -1
				&& ((Class28.aByteArrayArrayArray512
				     [Class14_Sub2_Sub3.anInt3785][i_2_ + -1]
				     [i_5_])
				    ^ 0xffffffff) != (i ^ 0xffffffff)
				&& 0 == ((Class14_Sub8_Sub4
					  .aByteArrayArrayArray4142
					  [Class14_Sub2_Sub3.anInt3785][i_2_]
					  [i_5_])
					 & 0x4)
				&& (0x4 & (Class14_Sub8_Sub4
					   .aByteArrayArrayArray4142
					   [Class14_Sub2_Sub3.anInt3785]
					   [i_2_ - 1][-1 + i_5_])) == 0) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (Class66.method1294(i_2_ - 1, 1179648),
					1375731712));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(1245184, i_5_);
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][i_2_ + -1]
				    [i_5_]
				    = i;
				i_1_ = 0xfff & 1 + i_1_;
			    }
			    if ((Class28.aByteArrayArrayArray512
				 [Class14_Sub2_Sub3.anInt3785][i_2_][i_5_])
				!= i) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (Class66.method1294(5373952, i_2_),
					318767104));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(5439488, i_5_);
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][i_2_][i_5_]
				    = i;
				i_1_ = 1 + i_1_ & 0xfff;
			    }
			    if (104 > i_2_ - -1
				&& i != (Class28.aByteArrayArrayArray512
					 [Class14_Sub2_Sub3.anInt3785]
					 [1 + i_2_][i_5_])
				&& ((Class14_Sub8_Sub4.aByteArrayArrayArray4142
				     [Class14_Sub2_Sub3.anInt3785][i_2_]
				     [i_5_]) & 0x4
				    ^ 0xffffffff) == -1
				&& ((Class14_Sub8_Sub4.aByteArrayArrayArray4142
				     [Class14_Sub2_Sub3.anInt3785][1 + i_2_]
				     [-1 + i_5_]) & 0x4
				    ^ 0xffffffff) == -1) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (Class66.method1294(5373952, i_2_ - -1),
					-1845493760));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(5439488, i_5_);
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][i_2_ + 1]
				    [i_5_]
				    = i;
				i_1_ = 0xfff & i_1_ - -1;
			    }
			}
			i_5_--;
			if (104 > 1 + i_2_
			    && ((Class28.aByteArrayArrayArray512
				 [Class14_Sub2_Sub3.anInt3785][i_2_ - -1]
				 [i_5_])
				^ 0xffffffff) != (i ^ 0xffffffff)) {
			    Class14_Sub8_Sub36.anIntArray4691[i_1_]
				= (Class66.method1294
				   (1392508928,
				    Class66.method1294(i_2_ + 1, 9568256)));
			    Class14_Sub2_Sub21.anIntArray4078[i_1_]
				= Class66.method1294(9633792, i_5_);
			    i_1_ = 0xfff & i_1_ + 1;
			    Class28.aByteArrayArrayArray512
				[Class14_Sub2_Sub3.anInt3785][i_2_ - -1][i_5_]
				= i;
			}
			if ((--i_5_ ^ 0xffffffff) <= -1) {
			    if (-1 >= (i_2_ + -1 ^ 0xffffffff)
				&& i != (Class28.aByteArrayArrayArray512
					 [Class14_Sub2_Sub3.anInt3785]
					 [i_2_ + -1][i_5_])
				&& -1 == ((Class14_Sub8_Sub4
					   .aByteArrayArrayArray4142
					   [Class14_Sub2_Sub3.anInt3785][i_2_]
					   [i_5_]) & 0x4
					  ^ 0xffffffff)
				&& (0x4 & (Class14_Sub8_Sub4
					   .aByteArrayArrayArray4142
					   [Class14_Sub2_Sub3.anInt3785]
					   [-1 + i_2_][i_5_ + 1])) == 0) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (Class66.method1294(i_2_ + -1,
							   13762560),
					301989888));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(i_5_, 13828096);
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][-1 + i_2_]
				    [i_5_]
				    = i;
				i_1_ = 0xfff & 1 + i_1_;
			    }
			    if (i != (Class28.aByteArrayArrayArray512
				      [Class14_Sub2_Sub3.anInt3785][i_2_]
				      [i_5_])) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (-1828716544,
					Class66.method1294(13762560, i_2_)));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(i_5_, 13828096);
				i_1_ = i_1_ - -1 & 0xfff;
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][i_2_][i_5_]
				    = i;
			    }
			    if (-105 < (1 + i_2_ ^ 0xffffffff)
				&& ((Class28.aByteArrayArrayArray512
				     [Class14_Sub2_Sub3.anInt3785][1 + i_2_]
				     [i_5_])
				    ^ 0xffffffff) != (i ^ 0xffffffff)
				&& ((Class14_Sub8_Sub4.aByteArrayArrayArray4142
				     [Class14_Sub2_Sub3.anInt3785][i_2_][i_5_])
				    & 0x4) == 0
				&& (0x4 & (Class14_Sub8_Sub4
					   .aByteArrayArrayArray4142
					   [Class14_Sub2_Sub3.anInt3785]
					   [1 + i_2_][i_5_ + 1])) == 0) {
				Class14_Sub8_Sub36.anIntArray4691[i_1_]
				    = (Class66.method1294
				       (Class66.method1294(1 + i_2_, 9568256),
					-771751936));
				Class14_Sub2_Sub21.anIntArray4078[i_1_]
				    = Class66.method1294(i_5_, 9633792);
				i_1_ = i_1_ + 1 & 0xfff;
				Class28.aByteArrayArrayArray512
				    [Class14_Sub2_Sub3.anInt3785][i_2_ - -1]
				    [i_5_]
				    = i;
			    }
			}
		    }
		}
		if (999999 != (Class14_Sub2_Sub11.anIntArray3872[arg5]
			       ^ 0xffffffff)) {
		    Class14_Sub2_Sub11.anIntArray3872[arg5] += 10;
		    Class14_Sub8_Sub20.anIntArray4422[arg5] -= 50;
		    Class14_Sub19.anIntArray3079[arg5] += 50;
		    Class120.anIntArray2008[arg5] += 50;
		    Class96.anIntArray1630[arg5] -= 50;
		}
		bool_3_ = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool_3_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pe.O(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ',' + arg4 + ',' + arg5 + ')'));
	}
	return false;
    }
    
    public static boolean method1499(int arg0) {
	try {
    while_3_:
	do {
	    do {
		boolean bool_0_;
		try {
		    anInt1680++;
		    if (arg0 == Class99_Sub2.anInt3352)
			break;
		    try {
			Class90.aClass124_1424.method1666((Class14_Sub8_Sub34
							   .aClass43_4647
							   .anApplet712),
							  false);
			bool_0_ = true;
		    } catch (Throwable throwable) {
			try {
			    Object object;
			    break;
			} catch (RuntimeException runtimeexception) {
			    break while_3_;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break while_3_;
		}
		return bool_0_;
	    } while (false);
	    return false;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "pe.J(" + arg0 + ')');
	}
	return false;
    }
    
    public static int method1500(Class133_Sub1_Sub2 arg0, int arg1) {
	try {
    while_4_:
	do {
	int i_1_;
	    Class12 class12;
	    do {
		int i_0_;
		try {
		    class12 = arg0.aClass12_4949;
		    anInt1676++;
		    if (null == class12.anIntArray329)
			break;
		    class12 = class12.method217((byte) -18);
		    if (class12 != null)
			break;
		    i_0_ = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_4_;
		}
		return i_0_;
	    } while (false);
	    try {
		int i = class12.anInt301;
		if ((arg0.anInt3433 ^ 0xffffffff)
		    != (arg0.anInt3452 ^ 0xffffffff)) {
		    if (arg0.anInt3452 == arg0.anInt3456)
			i = class12.anInt292;
		} else
		    i = class12.anInt289;
		if (arg1 != -1)
		    method1500(null, -70);
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pe.K("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
	}
	return 0;
    }
    
    public abstract int method1501(int i, int i_21_, int i_22_);
    
    public static void method1502(int arg0) {
	try {
	    if (arg0 != -17808)
		method1500(null, -8);
	    aClass124_1677 = null;
	    aClass124_1679 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pe.M(" + arg0 + ')');
	}
    }
    
    public static void method1503() {
	Class133_Sub6.anInt3634 = 0;
    while_9_:
	for (int i = 0; i < Class14_Sub8_Sub26.anInt4533; i++) {
	    Class85 class85 = Class51.aClass85Array838[i];
	    if (Class21.anIntArray437 != null) {
		for (int i_23_ = 0; i_23_ < Class21.anIntArray437.length;
		     i_23_++) {
		    if (Class21.anIntArray437[i_23_] != -1000000
			&& (class85.anInt1368 <= Class21.anIntArray437[i_23_]
			    || (class85.anInt1358
				<= Class21.anIntArray437[i_23_]))
			&& (class85.anInt1353 <= Class106.anIntArray1790[i_23_]
			    || (class85.anInt1361
				<= Class106.anIntArray1790[i_23_]))
			&& (class85.anInt1353 >= Class98.anIntArray1660[i_23_]
			    || (class85.anInt1361
				>= Class98.anIntArray1660[i_23_]))
			&& (class85.anInt1359 <= Class142.anIntArray2284[i_23_]
			    || (class85.anInt1366
				<= Class142.anIntArray2284[i_23_]))
			&& (class85.anInt1359 >= Class104.anIntArray1737[i_23_]
			    || (class85.anInt1366
				>= Class104.anIntArray1737[i_23_])))
			continue while_9_;
		}
	    }
	    if (class85.anInt1373 == 1) {
		int i_24_ = (class85.anInt1374 - Class71.anInt1101
			     + Class73.anInt1108);
		if (i_24_ >= 0
		    && i_24_ <= Class73.anInt1108 + Class73.anInt1108) {
		    int i_25_ = (class85.anInt1363 - Class102.anInt1724
				 + Class73.anInt1108);
		    if (i_25_ < 0)
			i_25_ = 0;
		    int i_26_ = (class85.anInt1377 - Class102.anInt1724
				 + Class73.anInt1108);
		    if (i_26_ > Class73.anInt1108 + Class73.anInt1108)
			i_26_ = Class73.anInt1108 + Class73.anInt1108;
		    boolean bool = false;
		while_5_:
		    do {
			do {
			    if (i_25_ > i_26_)
				break while_5_;
			} while (!Class53.aBooleanArrayArray873[i_24_]
				  [i_25_++]);
			bool = true;
		    } while (false);
		    if (bool) {
			int i_27_ = Class4.anInt125 - class85.anInt1353;
			if (i_27_ > 32)
			    class85.anInt1376 = 1;
			else {
			    if (i_27_ >= -32)
				continue;
			    class85.anInt1376 = 2;
			    i_27_ = -i_27_;
			}
			class85.anInt1360
			    = (class85.anInt1359 - Class14_Sub2_Sub8.anInt3853
			       << 8) / i_27_;
			class85.anInt1354
			    = (class85.anInt1366 - Class14_Sub2_Sub8.anInt3853
			       << 8) / i_27_;
			class85.anInt1371
			    = (class85.anInt1368 - Class14_Sub2.anInt2741
			       << 8) / i_27_;
			class85.anInt1367
			    = (class85.anInt1358 - Class14_Sub2.anInt2741
			       << 8) / i_27_;
			Class14_Sub20.aClass85Array3092
			    [Class133_Sub6.anInt3634++]
			    = class85;
		    }
		}
	    } else if (class85.anInt1373 == 2) {
		int i_28_ = (class85.anInt1363 - Class102.anInt1724
			     + Class73.anInt1108);
		if (i_28_ >= 0
		    && i_28_ <= Class73.anInt1108 + Class73.anInt1108) {
		    int i_29_ = (class85.anInt1374 - Class71.anInt1101
				 + Class73.anInt1108);
		    if (i_29_ < 0)
			i_29_ = 0;
		    int i_30_ = (class85.anInt1364 - Class71.anInt1101
				 + Class73.anInt1108);
		    if (i_30_ > Class73.anInt1108 + Class73.anInt1108)
			i_30_ = Class73.anInt1108 + Class73.anInt1108;
		    boolean bool = false;
		while_6_:
		    do {
			do {
			    if (i_29_ > i_30_)
				break while_6_;
			} while (!Class53.aBooleanArrayArray873[i_29_++]
				  [i_28_]);
			bool = true;
		    } while (false);
		    if (bool) {
			int i_31_
			    = Class14_Sub2_Sub8.anInt3853 - class85.anInt1359;
			if (i_31_ > 32)
			    class85.anInt1376 = 3;
			else {
			    if (i_31_ >= -32)
				continue;
			    class85.anInt1376 = 4;
			    i_31_ = -i_31_;
			}
			class85.anInt1356
			    = ((class85.anInt1353 - Class4.anInt125 << 8)
			       / i_31_);
			class85.anInt1357
			    = ((class85.anInt1361 - Class4.anInt125 << 8)
			       / i_31_);
			class85.anInt1371
			    = (class85.anInt1368 - Class14_Sub2.anInt2741
			       << 8) / i_31_;
			class85.anInt1367
			    = (class85.anInt1358 - Class14_Sub2.anInt2741
			       << 8) / i_31_;
			Class14_Sub20.aClass85Array3092
			    [Class133_Sub6.anInt3634++]
			    = class85;
		    }
		}
	    } else if (class85.anInt1373 == 4) {
		int i_32_ = class85.anInt1368 - Class14_Sub2.anInt2741;
		if (i_32_ > 128) {
		    int i_33_ = (class85.anInt1363 - Class102.anInt1724
				 + Class73.anInt1108);
		    if (i_33_ < 0)
			i_33_ = 0;
		    int i_34_ = (class85.anInt1377 - Class102.anInt1724
				 + Class73.anInt1108);
		    if (i_34_ > Class73.anInt1108 + Class73.anInt1108)
			i_34_ = Class73.anInt1108 + Class73.anInt1108;
		    if (i_33_ <= i_34_) {
			int i_35_ = (class85.anInt1374 - Class71.anInt1101
				     + Class73.anInt1108);
			if (i_35_ < 0)
			    i_35_ = 0;
			int i_36_ = (class85.anInt1364 - Class71.anInt1101
				     + Class73.anInt1108);
			if (i_36_ > Class73.anInt1108 + Class73.anInt1108)
			    i_36_ = Class73.anInt1108 + Class73.anInt1108;
			boolean bool = false;
		    while_7_:
			for (int i_37_ = i_35_; i_37_ <= i_36_; i_37_++) {
			    for (int i_38_ = i_33_; i_38_ <= i_34_; i_38_++) {
				if (Class53.aBooleanArrayArray873[i_37_]
				    [i_38_]) {
				    bool = true;
				    break while_7_;
				}
			    }
			}
			if (bool) {
			    class85.anInt1376 = 5;
			    class85.anInt1356
				= ((class85.anInt1353 - Class4.anInt125 << 8)
				   / i_32_);
			    class85.anInt1357
				= ((class85.anInt1361 - Class4.anInt125 << 8)
				   / i_32_);
			    class85.anInt1360
				= ((class85.anInt1359
				    - Class14_Sub2_Sub8.anInt3853)
				   << 8) / i_32_;
			    class85.anInt1354
				= ((class85.anInt1366
				    - Class14_Sub2_Sub8.anInt3853)
				   << 8) / i_32_;
			    Class14_Sub20.aClass85Array3092
				[Class133_Sub6.anInt3634++]
				= class85;
			}
		    }
		}
	    }
	}
    }
    
    public abstract void method1504(byte i);
}