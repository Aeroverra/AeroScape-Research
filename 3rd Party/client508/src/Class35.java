/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class35
{
    public int anInt587 = 0;
    public static Class124 aClass124_588
	= Class14_Sub2_Sub2.method263(1178, " <col=00ff80>");
    public static Class2 aClass2_589;
    public static int anInt590;
    public static int anInt591;
    public static int anInt592;
    public static boolean aBoolean593;
    public static int anInt594;
    public static int anInt595;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array596;
    public static Class124 aClass124_597
	= Class14_Sub2_Sub2.method263(1178, "zap");
    public static Class124 aClass124_598
	= Class14_Sub2_Sub2.method263(1178, "Benutzen");
    public static Class20 aClass20_599;
    public static float aFloat600;
    public static Class124 aClass124_601;
    public static int anInt602;
    public static int anInt603;
    
    public static void method1092(int arg0, boolean arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    int i = arg0 + -334;
	    if (-1 < (i ^ 0xffffffff))
		i = 0;
	    else if (100 < i)
		i = 100;
	    int i_0_ = (((-Class19.aShort2540 + Class14_Sub8_Sub28.aShort4568)
			 * i / 100)
			+ Class19.aShort2540);
	    int i_1_ = -85 % ((-48 - arg4) / 41);
	    if ((Class14_Sub2_Sub8.aShort3839 ^ 0xffffffff)
		>= (i_0_ ^ 0xffffffff)) {
		if (Applet_Sub1.aShort22 < i_0_)
		    i_0_ = Applet_Sub1.aShort22;
	    } else
		i_0_ = Class14_Sub2_Sub8.aShort3839;
	    int i_2_ = 512 * (arg0 * i_0_) / (334 * arg2);
	    if (i_2_ >= Class125.aShort2076) {
		if (i_2_ > Class96.aShort1633) {
		    i_2_ = Class96.aShort1633;
		    i_0_ = arg2 * i_2_ * 334 / (512 * arg0);
		    if (i_0_ < Class14_Sub2_Sub8.aShort3839) {
			i_0_ = Class14_Sub2_Sub8.aShort3839;
			int i_3_ = i_2_ * arg2 * 334 / (i_0_ * 512);
			int i_4_ = (-i_3_ + arg0) / 2;
			if (arg1) {
			    Class25.method994();
			    Class25.method1004(arg3, arg5, arg2, i_4_, 0);
			    Class25.method1004(arg3, arg5 + (arg0 - i_4_),
					       arg2, i_4_, 0);
			}
			arg5 += i_4_;
			arg0 -= i_4_ * 2;
		    }
		}
	    } else {
		i_2_ = Class125.aShort2076;
		i_0_ = 334 * i_2_ * arg2 / (512 * arg0);
		if (Applet_Sub1.aShort22 < i_0_) {
		    i_0_ = Applet_Sub1.aShort22;
		    int i_5_ = i_0_ * (arg0 * 512) / (334 * i_2_);
		    int i_6_ = (-i_5_ + arg2) / 2;
		    if (arg1) {
			Class25.method994();
			Class25.method1004(arg3, arg5, i_6_, arg0, 0);
			Class25.method1004(arg2 + (arg3 - i_6_), arg5, i_6_,
					   arg0, 0);
		    }
		    arg2 -= 2 * i_6_;
		    arg3 += i_6_;
		}
	    }
	    Class14_Sub8_Sub10.anInt4251 = arg0 * i_0_ / 334;
	    Class14_Sub2_Sub15.anInt3952 = (short) arg2;
	    anInt591++;
	    Class14_Sub2_Sub19.anInt4031 = arg5;
	    Class14_Sub19.anInt3071 = arg3;
	    Class14_Sub8_Sub3.anInt4135 = (short) arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ed.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public static void method1093(int arg0) {
	try {
	    int i = -42 / ((arg0 - -28) / 33);
	    anInt592++;
	    Class57.method1254();
	    Class57.method1245();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ed.B(" + arg0 + ')');
	}
    }
    
    public void method1094(byte arg0, Class14_Sub10 arg1) {
	try {
	    for (;;) {
		int i = arg1.method798(123);
		if (i == 0)
		    break;
		method1096(arg1, i, -14431);
	    }
	    anInt595++;
	    if (arg0 != 102)
		aClass124_601 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ed.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1095(int arg0) {
	try {
	    if (arg0 != -572)
		method1097((byte) -44);
	    aClass20_599 = null;
	    aClass124_601 = null;
	    aClass14_Sub2_Sub19Array596 = null;
	    aClass124_598 = null;
	    aClass2_589 = null;
	    aClass124_597 = null;
	    aClass124_588 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ed.C(" + arg0 + ')');
	}
    }
    
    public void method1096(Class14_Sub10 arg0, int arg1, int arg2) {
	try {
	    if (arg1 == 5)
		anInt587 = arg0.method784((byte) 123);
	    anInt594++;
	    if (arg2 != -14431)
		anInt602 = -105;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ed.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public static void method1097(byte arg0) {
    while_713_:
	do {
	while_712_:
	    do {
		do {
		    try {
			anInt590++;
			if (-3 == (Class14_Sub2_Sub8.method296((byte) 75)
				   ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_712_;
		    }
		    return;
		} while (false);
		do {
		    try {
			byte i = (byte) (0xff & -4 + Class42.anInt699);
			int i_7_ = Class42.anInt699 % 104;
			for (int i_8_ = 0; -5 < (i_8_ ^ 0xffffffff); i_8_++) {
			    for (int i_9_ = 0; (i_9_ ^ 0xffffffff) > -105;
				 i_9_++)
				Class28.aByteArrayArrayArray512[i_8_][i_7_]
				    [i_9_]
				    = i;
			}
			if (3 != Class14_Sub2_Sub3.anInt3785)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_712_;
		    }
		    return;
		} while (false);
	    while_711_:
		do {
		    try {
			for (int i = 0; i < 2; i++) {
			    Class14_Sub2_Sub11.anIntArray3872[i] = -1000000;
			    Class14_Sub8_Sub20.anIntArray4422[i] = 1000000;
			    Class14_Sub19.anIntArray3079[i] = 0;
			    Class96.anIntArray1630[i] = 1000000;
			    Class120.anIntArray2008[i] = 0;
			}
			int i = -21 / ((arg0 - 73) / 40);
			if ((Class89.anInt1415 ^ 0xffffffff) != -2) {
			    int i_10_
				= Class26.method1017((Class14_Sub8_Sub38
						      .anInt4741),
						     (Class14_Sub2_Sub3
						      .anInt3785),
						     (byte) -119,
						     Class14_Sub30.anInt3271);
			    if (800 > -Class14_Sub10.anInt2926 + i_10_
				&& -1 != ((Class14_Sub8_Sub4
					   .aByteArrayArrayArray4142
					   [Class14_Sub2_Sub3.anInt3785]
					   [(Class14_Sub8_Sub38.anInt4741
					     >> -1606062969)]
					   [(Class14_Sub30.anInt3271
					     >> 881719143)]) & 0x4
					  ^ 0xffffffff))
				Class99.method1498
				    ((byte) 92, false,
				     Class14_Sub30.anInt3271 >> 1610484359,
				     (Class125_Sub1
				      .aClass14_Sub29ArrayArrayArray3368),
				     Class14_Sub8_Sub38.anInt4741 >> 821630663,
				     1);
			} else {
			    if (0
				!= (0x4
				    & (Class14_Sub8_Sub4
				       .aByteArrayArrayArray4142
				       [Class14_Sub2_Sub3.anInt3785]
				       [(Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .anInt3495) >> -182278297]
				       [(Class14_Sub3.aClass133_Sub1_Sub1_2748
					 .anInt3436) >> 1253894567])))
				Class99.method1498
				    ((byte) 95, false,
				     (Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3436) >> 674763111,
				     (Class125_Sub1
				      .aClass14_Sub29ArrayArrayArray3368),
				     (Class14_Sub3.aClass133_Sub1_Sub1_2748
				      .anInt3495) >> -1737359449,
				     0);
			    if (310 > Class7_Sub3_Sub1.anInt3719) {
				int i_11_ = (Class14_Sub8_Sub38.anInt4741
					     >> -1279111577);
				i = Class14_Sub30.anInt3271 >> 2046597543;
				int i_12_
				    = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
					.anInt3436)
				       >> -1323180697);
				int i_13_;
				if ((i ^ 0xffffffff) <= (i_12_ ^ 0xffffffff))
				    i_13_ = i + -i_12_;
				else
				    i_13_ = -i + i_12_;
				int i_14_
				    = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
					.anInt3495)
				       >> -379556633);
				int i_15_;
				if (i_14_ > i_11_)
				    i_15_ = i_14_ - i_11_;
				else
				    i_15_ = -i_14_ + i_11_;
				if ((i_15_ ^ 0xffffffff)
				    < (i_13_ ^ 0xffffffff)) {
				    int i_16_ = i_13_ * 65536 / i_15_;
				    int i_17_ = 32768;
				while_710_:
				    do {
					for (;;) {
					    if ((i_14_ ^ 0xffffffff)
						== (i_11_ ^ 0xffffffff))
						break while_710_;
					    if ((i_11_ ^ 0xffffffff)
						<= (i_14_ ^ 0xffffffff)) {
						if (i_14_ < i_11_)
						    i_11_--;
					    } else
						i_11_++;
					    if (((Class14_Sub8_Sub4
						  .aByteArrayArrayArray4142
						  [Class14_Sub2_Sub3.anInt3785]
						  [i_11_][i])
						 & 0x4)
						!= 0) {
						Class99.method1498
						    ((byte) 52, false, i,
						     (Class125_Sub1
						      .aClass14_Sub29ArrayArrayArray3368),
						     i_11_, 1);
						break while_710_;
					    }
					    i_17_ += i_16_;
					    if ((i_17_ ^ 0xffffffff)
						<= -65537) {
						i_17_ -= 65536;
						if ((i ^ 0xffffffff)
						    <= (i_12_ ^ 0xffffffff)) {
						    if (i_12_ < i)
							i--;
						} else
						    i++;
						if (-1
						    != ((0x4
							 & (Class14_Sub8_Sub4
							    .aByteArrayArrayArray4142
							    [(Class14_Sub2_Sub3
							      .anInt3785)]
							    [i_11_][i]))
							^ 0xffffffff))
						    break;
					    }
					}
					Class99.method1498
					    ((byte) 38, false, i,
					     (Class125_Sub1
					      .aClass14_Sub29ArrayArrayArray3368),
					     i_11_, 1);
				    } while (false);
				} else {
				    int i_18_ = i_15_ * 65536 / i_13_;
				    int i_19_ = 32768;
				    for (;;) {
					if ((i_12_ ^ 0xffffffff)
					    == (i ^ 0xffffffff))
					    break while_711_;
					if (i_12_ > i)
					    i++;
					else if ((i ^ 0xffffffff)
						 < (i_12_ ^ 0xffffffff))
					    i--;
					if (-1
					    != ((Class14_Sub8_Sub4
						 .aByteArrayArrayArray4142
						 [Class14_Sub2_Sub3.anInt3785]
						 [i_11_][i]) & 0x4
						^ 0xffffffff)) {
					    Class99.method1498
						((byte) 48, false, i,
						 (Class125_Sub1
						  .aClass14_Sub29ArrayArrayArray3368),
						 i_11_, 1);
					    break while_711_;
					}
					i_19_ += i_18_;
					if ((i_19_ ^ 0xffffffff) <= -65537) {
					    if ((i_14_ ^ 0xffffffff)
						< (i_11_ ^ 0xffffffff))
						i_11_++;
					    else if ((i_11_ ^ 0xffffffff)
						     < (i_14_ ^ 0xffffffff))
						i_11_--;
					    i_19_ -= 65536;
					    if (-1
						!= ((0x4
						     & (Class14_Sub8_Sub4
							.aByteArrayArrayArray4142
							[(Class14_Sub2_Sub3
							  .anInt3785)]
							[i_11_][i]))
						    ^ 0xffffffff))
						break;
					}
				    }
				    Class99.method1498
					((byte) 86, false, i,
					 (Class125_Sub1
					  .aClass14_Sub29ArrayArrayArray3368),
					 i_11_, 1);
				}
			    }
			}
		    } catch (RuntimeException runtimeexception) {
			break while_712_;
		    }
		} while (false);
		break while_713_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ed.A(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass2_589 = new Class2();
	aClass20_599 = new Class20(64);
	aClass124_601 = Class14_Sub2_Sub2.method263(1178, "m");
	anInt602 = -1;
    }
}
