/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class45
{
    public static int anInt736;
    public static int[] anIntArray737 = { 1, 1, 1, 1 };
    public static Class124 aClass124_738
	= Class14_Sub2_Sub2.method263(1178, "AUS");
    public static int anInt739;
    public static int anInt740;
    public Class124 aClass124_741;
    public int anInt742;
    public static int[] anIntArray743 = new int[200];
    public int anInt744;
    public int anInt745;
    public static int anInt746;
    public static int anInt747;
    public static int anInt748;
    public boolean aBoolean749;
    public static Class124 aClass124_750
	= Class14_Sub2_Sub2.method263(1178, "::rect_debug");
    public static int anInt751 = -1;
    public int anInt752;
    
    public static void method1160(int arg0) {
	try {
	    Class14_Sub15 class14_sub15
		= ((Class14_Sub15)
		   Class14_Sub30.aClass55_3275.method1228((byte) -59));
	    if (arg0 != 0)
		method1166(true, false);
	    for (/**/; null != class14_sub15;
		 class14_sub15 = (Class14_Sub15) Class14_Sub30
						     .aClass55_3275
						     .method1227((byte) -23)) {
		int i = class14_sub15.anInt2999;
		if (Class126.method1741((byte) 100, i)) {
		    boolean bool = true;
		    Class94[] class94s = Class1.aClass94ArrayArray75[i];
		    for (int i_0_ = 0;
			 (i_0_ ^ 0xffffffff) > (class94s.length ^ 0xffffffff);
			 i_0_++) {
			if (class94s[i_0_] != null) {
			    bool = class94s[i_0_].aBoolean1455;
			    break;
			}
		    }
		    if (!bool) {
			int i_1_ = (int) class14_sub15.aLong355;
			Class94 class94
			    = Class55.method1233(i_1_, arg0 + 21803);
			if (null != class94)
			    Class103.method1531((byte) -59, class94);
		    }
		}
	    }
	    anInt748++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ff.B(" + arg0 + ')');
	}
    }
    
    public static void method1161(int arg0) {
    while_759_:
	do {
	while_758_:
	    do {
		do {
		    try {
			anInt740++;
			if (Class7_Sub1.aClass14_Sub2_Sub5_2665 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_758_;
		    }
		    return;
		} while (false);
	    while_757_:
		do {
		    do {
			try {
			    if (Class14_Sub8_Sub32.anInt4616 >= 10)
				break while_757_;
			    if ((Class14_Sub8_Sub28.aClass9_4570.method160
				 ((Class7_Sub1.aClass14_Sub2_Sub5_2665
				   .aClass124_3804),
				  (byte) -102))
				&& (Class14_Sub8_Sub28.aClass9_4570.method160
				    ((Class14_Sub8_Sub7.method515
				      ((new Class124[]
					{ (Class7_Sub1.aClass14_Sub2_Sub5_2665
					   .aClass124_3804),
					  Class71.aClass124_1099 }),
				       (byte) -79)),
				     (byte) -102)))
				break;
			    Class14_Sub8_Sub32.anInt4616
				= (Class7_Sub1.aClass9_Sub1_2657.method151
				   ((Class7_Sub1.aClass14_Sub2_Sub5_2665
				     .aClass124_3804),
				    arg0 ^ ~0x46)) / 10;
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    try {
			Class14_Sub8_Sub17.method568(arg0 ^ 0x38);
			Class14_Sub8_Sub32.anInt4616 = 10;
		    } catch (RuntimeException runtimeexception) {
			break while_758_;
		    }
		} while (false);
		if (10 == Class14_Sub8_Sub32.anInt4616) {
		    Class65.anInt1034
			= (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3797
			   >> -2051534778 << 1508209222);
		    Class14_Sub2_Sub9.anInt3856
			= (64
			   + (-Class65.anInt1034
			      + (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3810
				 >> -2103968762 << -2145454042)));
		    int i = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495
			      >> -859835065)
			     + (Class133_Sub6.anInt3676 + -Class65.anInt1034));
		    Class14_Sub8.aFloat2854 = Class90.aFloat1426 = 8.0F;
		    Class35.anInt603
			= (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3806
			   >> 1920923910 << -496269850);
		    i += (int) (Math.random() * 10.0) + -5;
		    Class14_Sub8_Sub15.anInt4332
			= ((Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3805
			    >> -563865306 << 60166022)
			   + (-Class35.anInt603 + 64));
		    int i_2_
			= (Class35.anInt603 + -Class58.anInt947
			   + -(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436
			       >> 1653809607)
			   + (Class14_Sub8_Sub15.anInt4332 - 1));
		    i_2_ += (int) (10.0 * Math.random()) + -5;
		    if (-1 < (i ^ 0xffffffff)
			|| i >= Class14_Sub2_Sub9.anInt3856
			|| -1 < (i_2_ ^ 0xffffffff)
			|| (i_2_ ^ 0xffffffff) <= (Class14_Sub8_Sub15.anInt4332
						   ^ 0xffffffff)) {
			Class133_Sub6.anInt3659
			    = (Class35.anInt603
			       - (64 * (Class7_Sub1.aClass14_Sub2_Sub5_2665
					.anInt3812)
				  - (-1 + Class14_Sub8_Sub15.anInt4332)));
			Class37.anInt644
			    = 64 * (Class7_Sub1.aClass14_Sub2_Sub5_2665
				    .anInt3813) + -Class65.anInt1034;
		    } else {
			Class37.anInt644 = i;
			Class133_Sub6.anInt3659 = i_2_;
		    }
		    Class39.method1126((byte) -22);
		    int i_3_ = Class14_Sub2_Sub9.anInt3856 >> -217948538;
		    Class56.anIntArray917 = new int[Class131.anInt2159 + 1];
		    int i_4_ = Class14_Sub8_Sub15.anInt4332 >> 807422726;
		    Class14_Sub8_Sub10.aByteArrayArrayArray4257
			= new byte[i_3_][i_4_][];
		    Class14_Sub2_Sub9.aByteArrayArrayArray3864
			= new byte[i_3_][i_4_][];
		    Class14_Sub2_Sub5.aByteArrayArrayArray3816
			= new byte[i_3_][i_4_][];
		    Class14_Sub8_Sub3.aByteArrayArrayArray4130
			= new byte[i_3_][i_4_][];
		    int i_5_ = Class14_Sub8_Sub26.anInt4527 >> 25859361;
		    Class14_Sub22.anIntArrayArrayArray3125
			= new int[i_3_][i_4_][];
		    Class86.aByteArrayArrayArray1383 = new byte[i_3_][i_4_][];
		    Class14_Sub25.anIntArrayArrayArray3174
			= new int[i_3_][i_4_][];
		    Class79.aShortArrayArrayArray1247
			= new short[i_3_][i_4_][];
		    int i_6_ = Class51.anInt830 >> -1311625470 << -232933782;
		    Class54.method1221(i_5_, true, i_6_);
		    Class14_Sub8_Sub32.anInt4616 = 20;
		} else {
		    do {
			try {
			    if ((Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff)
				!= -21)
				break;
			    Class46.method1176
				(false,
				 new Class14_Sub10(Class14_Sub8_Sub28
						       .aClass9_4570.method167
						   ((Class7_Sub1
						     .aClass14_Sub2_Sub5_2665
						     .aClass124_3804),
						    (Class14_Sub2_Sub15
						     .aClass124_3956),
						    -128)));
			    Class14_Sub8_Sub32.anInt4616 = 30;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class14_Sub8_Sub32.anInt4616 != 30)
				break;
			    Class14_Sub2.method241
				(11075,
				 new Class14_Sub10(Class14_Sub8_Sub28
						       .aClass9_4570.method167
						   ((Class7_Sub1
						     .aClass14_Sub2_Sub5_2665
						     .aClass124_3804),
						    (Class14_Sub10
						     .aClass124_2869),
						    104)));
			    Class14_Sub8_Sub32.anInt4616 = 40;
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (40 != Class14_Sub8_Sub32.anInt4616)
				break;
			    Class138.method1945
				((byte) -102,
				 new Class14_Sub10(Class14_Sub8_Sub28
						       .aClass9_4570.method167
						   ((Class7_Sub1
						     .aClass14_Sub2_Sub5_2665
						     .aClass124_3804),
						    (Class14_Sub8_Sub29
						     .aClass124_4574),
						    arg0 + -133)));
			    Class14_Sub8_Sub32.anInt4616 = 50;
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (50 != Class14_Sub8_Sub32.anInt4616)
				break;
			    Class14_Sub8_Sub23.method601
				(-113,
				 new Class14_Sub10(Class14_Sub8_Sub28
						       .aClass9_4570.method167
						   ((Class7_Sub1
						     .aClass14_Sub2_Sub5_2665
						     .aClass124_3804),
						    Class131.aClass124_2161,
						    -70)));
			    Class14_Sub8_Sub32.anInt4616 = 60;
			    Class14_Sub2_Sub1.method259(true, arg0 ^ 0x2ee8);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class14_Sub8_Sub32.anInt4616 != arg0)
				break;
			    Class152.aClass146_2435
				= (Class14_Sub8_Sub6.method507
				   (true,
				    (Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { (Class7_Sub1.aClass14_Sub2_Sub5_2665
					  .aClass124_3804),
					 Class71.aClass124_1099 }),
				      (byte) -30)),
				    Class14_Sub8_Sub28.aClass9_4570));
			    Class14_Sub8_Sub32.anInt4616 = 70;
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if ((Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff)
				!= -71)
				break;
			    Class14_Sub17.aClass87_3004
				= new Class87(11, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 73;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if ((Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff)
				!= -74)
				break;
			    Class48.aClass87_805
				= new Class87(12, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 76;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class14_Sub8_Sub32.anInt4616 != 76)
				break;
			    Class54.aClass87_888
				= new Class87(14, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 79;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (79 != Class14_Sub8_Sub32.anInt4616)
				break;
			    Class52.aClass87_858
				= new Class87(17, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 82;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (-83
				!= (Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff))
				break;
			    Class14_Sub8_Sub35.aClass87_4672
				= new Class87(19, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 85;
			    Class14_Sub2_Sub1.method259(true, arg0 + 11928);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (Class14_Sub8_Sub32.anInt4616 != 85)
				break;
			    Class141.aClass87_2242
				= new Class87(22, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 88;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    do {
			try {
			    if (-89
				!= (Class14_Sub8_Sub32.anInt4616 ^ 0xffffffff))
				break;
			    Class48.aClass87_803
				= new Class87(26, true, Class49.aCanvas819);
			    Class14_Sub8_Sub32.anInt4616 = 91;
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class14_Sub8_Sub11.method531((byte) -112);
			} catch (RuntimeException runtimeexception) {
			    break while_758_;
			}
			return;
		    } while (false);
		    try {
			Class132.aClass87_2171
			    = new Class87(30, true, Class49.aCanvas819);
			Class14_Sub8_Sub32.anInt4616 = 100;
			Class14_Sub2_Sub1.method259(true, arg0 ^ 0x2ee8);
			Class14_Sub8_Sub11.method531((byte) -112);
			Class14_Sub18.anInt3050 = -1;
			Class20.anInt427 = -1;
			System.gc();
		    } catch (RuntimeException runtimeexception) {
			break;
		    }
		    break while_759_;
		}
		return;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ff.A(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1162(int arg0, int arg1, int arg2, int arg3,
				  byte arg4, int arg5, boolean arg6) {
    while_761_:
	do {
	while_760_:
	    do {
		do {
		    try {
			anInt736++;
			if (arg1 != Class129.anInt2133
			    || ((Class49.anInt818 ^ 0xffffffff)
				!= (arg0 ^ 0xffffffff))
			    || ((arg2 ^ 0xffffffff) != (Class142.anInt2295
							^ 0xffffffff)
				&& !Class128.method1755(130068615)))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_760_;
		    }
		    return;
		} while (false);
		try {
		    Class49.anInt818 = arg0;
		    Class129.anInt2133 = arg1;
		    Class142.anInt2295 = arg2;
		    if (Class128.method1755(130068615))
			Class142.anInt2295 = 0;
		    if (!arg6)
			Class126.method1743(27252, 25);
		    else
			Class126.method1743(27252, 28);
		    Class84.method1411(true, client.aClass124_2639, true);
		    int i = Class58.anInt947;
		    int i_7_ = Class133_Sub6.anInt3676;
		    Class133_Sub6.anInt3676 = 8 * (-6 + arg1);
		    Class58.anInt947 = arg0 * 8 + -48;
		    Class70.aClass14_Sub2_Sub5_1078
			= Class150.method2020(8 * Class129.anInt2133, false,
					      8 * Class49.anInt818);
		    int i_8_ = Class133_Sub6.anInt3676 - i_7_;
		    int i_9_ = Class58.anInt947 + -i;
		    i_7_ = Class133_Sub6.anInt3676;
		    i = Class58.anInt947;
		    if (arg6) {
			Class14_Sub8_Sub13.anInt4306 = 0;
			for (int i_10_ = 0; 32768 > i_10_; i_10_++) {
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				   [i_10_]);
			    if (class133_sub1_sub2 != null) {
				class133_sub1_sub2.anInt3436 -= 128 * i_9_;
				class133_sub1_sub2.anInt3495 -= 128 * i_8_;
				if (0 <= class133_sub1_sub2.anInt3495
				    && 13184 >= class133_sub1_sub2.anInt3495
				    && 0 <= class133_sub1_sub2.anInt3436
				    && 13184 >= class133_sub1_sub2.anInt3436) {
				    for (int i_11_ = 0;
					 (i_11_ ^ 0xffffffff) > -11; i_11_++) {
					class133_sub1_sub2.anIntArray3476
					    [i_11_]
					    -= i_8_;
					class133_sub1_sub2.anIntArray3443
					    [i_11_]
					    -= i_9_;
				    }
				    Class14_Sub2_Sub15.anIntArray3965
					[Class14_Sub8_Sub13.anInt4306++]
					= i_10_;
				} else {
				    Class14_Sub4
					.aClass133_Sub1_Sub2Array2785[i_10_]
					.aClass12_4949
					= null;
				    Class14_Sub4
					.aClass133_Sub1_Sub2Array2785[i_10_]
					= null;
				}
			    }
			}
		    } else {
			for (int i_12_ = 0; 32768 > i_12_; i_12_++) {
			    Class133_Sub1_Sub2 class133_sub1_sub2
				= (Class14_Sub4.aClass133_Sub1_Sub2Array2785
				   [i_12_]);
			    if (null != class133_sub1_sub2) {
				for (int i_13_ = 0; i_13_ < 10; i_13_++) {
				    class133_sub1_sub2.anIntArray3476[i_13_]
					-= i_8_;
				    class133_sub1_sub2.anIntArray3443[i_13_]
					-= i_9_;
				}
				class133_sub1_sub2.anInt3436 -= i_9_ * 128;
				class133_sub1_sub2.anInt3495 -= i_8_ * 128;
			    }
			}
		    }
		    for (int i_14_ = 0; (i_14_ ^ 0xffffffff) > -2049;
			 i_14_++) {
			Class133_Sub1_Sub1 class133_sub1_sub1
			    = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			       [i_14_]);
			if (class133_sub1_sub1 != null) {
			    for (int i_15_ = 0; i_15_ < 10; i_15_++) {
				class133_sub1_sub1.anIntArray3476[i_15_]
				    -= i_8_;
				class133_sub1_sub1.anIntArray3443[i_15_]
				    -= i_9_;
			    }
			    class133_sub1_sub1.anInt3436 -= i_9_ * 128;
			    class133_sub1_sub1.anInt3495 -= 128 * i_8_;
			}
		    }
		    int i_16_ = 0;
		    Class14_Sub2_Sub3.anInt3785 = arg2;
		    if (arg4 > -116)
			method1163(false, -63);
		    Class14_Sub3.aClass133_Sub1_Sub1_2748
			.method1800((byte) -85, arg3, false, arg5);
		    int i_17_ = 104;
		    int i_18_ = 0;
		    int i_19_ = 1;
		    if (0 > i_8_) {
			i_17_ = -1;
			i_19_ = -1;
			i_16_ = 103;
		    }
		    int i_20_ = 1;
		    int i_21_ = 104;
		    if (-1 < (i_9_ ^ 0xffffffff)) {
			i_21_ = -1;
			i_18_ = 103;
			i_20_ = -1;
		    }
		    for (int i_22_ = i_16_; i_17_ != i_22_; i_22_ += i_19_) {
			for (int i_23_ = i_18_;
			     (i_23_ ^ 0xffffffff) != (i_21_ ^ 0xffffffff);
			     i_23_ += i_20_) {
			    int i_24_ = i_22_ - -i_8_;
			    int i_25_ = i_23_ + i_9_;
			    for (int i_26_ = 0; -5 < (i_26_ ^ 0xffffffff);
				 i_26_++) {
				if (-1 < (i_24_ ^ 0xffffffff) || 0 > i_25_
				    || i_24_ >= 104 || i_25_ >= 104)
				    Class128.aClass2ArrayArrayArray2119
					[i_26_][i_22_][i_23_]
					= null;
				else
				    Class128.aClass2ArrayArrayArray2119
					[i_26_][i_22_][i_23_]
					= (Class128.aClass2ArrayArrayArray2119
					   [i_26_][i_24_][i_25_]);
			    }
			}
		    }
		    for (Class14_Sub14 class14_sub14
			     = (Class14_Sub14) Class33.aClass2_583.method77(0);
			 class14_sub14 != null;
			 class14_sub14 = ((Class14_Sub14)
					  Class33.aClass2_583.method84(-93))) {
			class14_sub14.anInt2970 -= i_9_;
			class14_sub14.anInt2967 -= i_8_;
			if (class14_sub14.anInt2967 < 0
			    || class14_sub14.anInt2970 < 0
			    || class14_sub14.anInt2967 >= 104
			    || 104 <= class14_sub14.anInt2970)
			    class14_sub14.method233(0);
		    }
		    if (0 != Class71.anInt1085) {
			Class14_Sub8_Sub15.anInt4335 -= i_9_;
			Class71.anInt1085 -= i_8_;
		    }
		    if (!arg6)
			Class89.anInt1415 = 1;
		    else {
			Class14_Sub8_Sub38.anInt4731 -= i_9_;
			Class33.anInt577 -= i_9_;
			Class117.anInt1948 -= i_8_;
			Class123.anInt2062 -= i_8_;
		    }
		    Class2.anInt96 = 0;
		    if (arg6 && (Math.abs(i_8_) > 104
				 || -105 > (Math.abs(i_9_) ^ 0xffffffff)))
			Class14_Sub13.method858(-1);
		    Class14_Sub8_Sub7.anInt4207 = -1;
		    Class79.aClass2_1268.method81((byte) -106);
		    Class4.aClass2_127.method81((byte) -77);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_761_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ff.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ')'));
	} while (false);
    }
    
    public static void method1163(boolean arg0, int arg1) {
	try {
	    anInt739++;
	    byte[][] is;
	    int i;
	    if (arg0) {
		i = 1;
		is = Class14.aByteArrayArray362;
	    } else {
		is = Class14_Sub20.aByteArrayArray3097;
		i = 4;
	    }
	    int i_27_ = 0;
	    if (arg1 > -16)
		anIntArray737 = null;
	    for (/**/; i_27_ < i; i_27_++) {
		Class138.method1946(139);
		for (int i_28_ = 0; 13 > i_28_; i_28_++) {
		    for (int i_29_ = 0; i_29_ < 13; i_29_++) {
			int i_30_ = (Class7.anIntArrayArrayArray169[i_27_]
				     [i_28_][i_29_]);
			if (0 != (i_30_ ^ 0xffffffff)) {
			    int i_31_ = (0x383a193 & i_30_) >> 1985881048;
			    if (!arg0 || -1 == (i_31_ ^ 0xffffffff)) {
				int i_32_ = 0x3ff & i_30_ >> 1632631470;
				int i_33_ = (i_30_ & 0x7) >> -1099003103;
				int i_34_ = (i_30_ & 0x3ff8) >> 1416314307;
				int i_35_
				    = (i_32_ / 8 << -278703960) + i_34_ / 8;
				for (int i_36_ = 0;
				     ((i_36_ ^ 0xffffffff)
				      > (Class14_Sub8.anIntArray2858.length
					 ^ 0xffffffff));
				     i_36_++) {
				    if ((Class14_Sub8.anIntArray2858[i_36_]
					 == i_35_)
					&& is[i_36_] != null) {
					RuntimeException_Sub1.method2053
					    (Class14_Sub21.aClass32Array3100,
					     is[i_36_], i_33_, arg0, i_31_,
					     false, 8 * i_28_, 8 * i_29_,
					     (0x7 & i_32_) * 8, i_27_,
					     8 * (0x7 & i_34_));
					break;
				    }
				}
			    }
			}
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ff.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1164(Class9 arg0, int arg1) {
	try {
	    Class14_Sub2_Sub5.aClass9_3817 = arg0;
	    anInt747++;
	    if (arg1 <= 31)
		aClass124_738 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ff.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method1165(byte arg0) {
	try {
	    anIntArray737 = null;
	    anIntArray743 = null;
	    if (arg0 != -62)
		aClass124_750 = null;
	    aClass124_750 = null;
	    aClass124_738 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ff.C(" + arg0 + ')');
	}
    }
    
    public static void method1166(boolean arg0, boolean arg1) {
	try {
	    byte[][] is;
	    if (!arg0)
		is = Class14_Sub20.aByteArrayArray3097;
	    else
		is = Class14.aByteArrayArray362;
	    int i = Class5.aByteArrayArray139.length;
	    anInt746++;
	    if (arg1)
		anIntArray743 = null;
	    for (int i_37_ = 0; (i ^ 0xffffffff) < (i_37_ ^ 0xffffffff);
		 i_37_++) {
		byte[] is_38_ = is[i_37_];
		if (null != is_38_) {
		    int i_39_ = (-Class133_Sub6.anInt3676
				 + (Class14_Sub8.anIntArray2858[i_37_]
				    >> 1200946952) * 64);
		    int i_40_
			= (64 * (0xff & Class14_Sub8.anIntArray2858[i_37_])
			   - Class58.anInt947);
		    Class138.method1946(139);
		    Class90.method1447(i_40_, Class14_Sub21.aClass32Array3100,
				       arg0, is_38_, i_39_, -23935);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ff.F(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
}
