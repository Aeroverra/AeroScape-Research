/* Class73 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class73
{
    public int anInt1102;
    public Class130 aClass130_1103;
    public int anInt1104;
    public static Class124 aClass124_1105
	= Class14_Sub2_Sub2.method263(1178, "titlebg");
    public short[] aShortArray1106;
    public float aFloat1107;
    public static int anInt1108;
    public int anInt1109;
    public static int anInt1110;
    public float aFloat1111;
    public boolean aBoolean1112;
    public int anInt1113;
    public static int[] anIntArray1114;
    public int anInt1115;
    public static int anInt1116;
    public static int anInt1117;
    public static int anInt1118;
    public static boolean aBoolean1119 = false;
    public int anInt1120;
    public int anInt1121;
    public int anInt1122;
    public boolean aBoolean1123;
    public int anInt1124;
    public int anInt1125;
    public static int anInt1126;
    public static int anInt1127;
    public int anInt1128;
    public static int anInt1129 = 0;
    public int anInt1130;
    public float[] aFloatArray1131;
    public static int anInt1132;
    public static int anInt1133;
    
    public void method1326(int arg0, byte arg1, boolean arg2) {
	try {
	    anInt1116++;
	    int i = 0x7ff & anInt1121 * arg0 / 50 + anInt1109;
	    int i_0_ = anInt1115;
	    int i_1_;
	while_897_:
	    do {
	    while_896_:
		do {
		while_895_:
		    do {
		    while_894_:
			do {
			    do {
				if (1 != i_0_) {
				    if (i_0_ != 3) {
					if (4 != i_0_) {
					    if (i_0_ != 2) {
						if (5 == i_0_)
						    break while_895_;
						break while_896_;
					    }
					} else
					    break;
					break while_894_;
				    }
				} else {
				    i_1_ = 1024 + (Class3.anIntArray108[i]
						   >> -1420606874);
				    break while_897_;
				}
				i_1_ = (Class14_Sub2_Sub18_Sub2.anIntArray5082
					[i]) >> 1129230049;
				break while_897_;
			    } while (false);
			    i_1_ = i >> 566808938 << 952173227;
			    break while_897_;
			} while (false);
			i_1_ = i;
			break while_897_;
		    } while (false);
		    i_1_ = (i < 1024 ? i : -i + 2048) << 1401378401;
		    break while_897_;
		} while (false);
		i_1_ = 2048;
	    } while (false);
	    if (arg2)
		i_1_ = 2048;
	    aFloat1107 = (float) (anInt1113 - -(i_1_ * anInt1102
						>> 293407755)) / 2048.0F;
	    float f = aFloat1107 / 255.0F;
	    aFloatArray1131[2]
		= (float) Class14_Sub8_Sub26.method617(255, anInt1122) * f;
	    if (arg1 >= -86)
		aClass130_1103 = null;
	    aFloatArray1131[0]
		= (float) Class14_Sub8_Sub26.method617(anInt1122 >> 515447344,
						       255) * f;
	    aFloatArray1131[1]
		= f * (float) Class14_Sub8_Sub26
				  .method617(anInt1122 >> -123283800, 255);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jl.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1327(byte arg0) {
	try {
	    aClass124_1105 = null;
	    anIntArray1114 = null;
	    if (arg0 >= -97)
		method1329(46);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jl.G(" + arg0 + ')');
	}
    }
    
    public static void method1328(int arg0, boolean arg1) {
    while_899_:
	do {
	while_898_:
	    do {
		do {
		    try {
			anInt1133++;
			if (-1 != arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_898_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (Class126.method1741((byte) 72, arg0))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_898_;
		    }
		    return;
		} while (false);
		try {
		    if (arg1 != true)
			method1330(-75, -104, -48, -108, -34);
		    Class94[] class94s = Class1.aClass94ArrayArray75[arg0];
		    for (int i = 0; class94s.length > i; i++) {
			Class94 class94 = class94s[i];
			if (null != class94.anObjectArray1529) {
			    Class14_Sub21 class14_sub21 = new Class14_Sub21();
			    class14_sub21.aClass94_3116 = class94;
			    class14_sub21.anObjectArray3115
				= class94.anObjectArray1529;
			    Class116.method1596(2000000, (byte) 79,
						class14_sub21);
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_899_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "jl.C(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static void method1329(int arg0) {
	try {
	    anInt1127++;
	    Class96.anApplet_Sub1_1632.method37(arg0 ^ 0x5);
	    if (arg0 != 0)
		anInt1132 = -44;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jl.F(" + arg0 + ')');
	}
    }
    
    public static void method1330(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt1118++;
	    Class133_Sub6.anInt3659
		= arg3 * Class14_Sub8_Sub15.anInt4332 / arg2;
	    Class20.anInt427 = arg4;
	    Class14_Sub18.anInt3050 = -1;
	    Class37.anInt644 = Class14_Sub2_Sub9.anInt3856 * arg0 / arg1;
	    Class39.method1126((byte) -22);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jl.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public void method1331(int arg0) {
	try {
	    anInt1117++;
	    int i = arg0 + (anInt1120 << 1580844871);
	    aFloat1111 = 1.0F / (float) (i * i);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jl.A(" + arg0 + ')');
	}
    }
    
    public void method1332(byte arg0) {
    while_915_:
	do {
	while_914_:
	    do {
		do {
		    try {
			anInt1126++;
			if (arg0 == 101)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_914_;
		    }
		    return;
		} while (false);
	    while_913_:
		do {
		    try {
			int i = anInt1130;
		    while_912_:
			do {
			while_911_:
			    do {
			    while_910_:
				do {
				while_909_:
				    do {
				    while_908_:
					do {
					while_907_:
					    do {
					    while_906_:
						do {
						while_905_:
						    do {
						    while_904_:
							do {
							while_903_:
							    do {
							    while_902_:
								do {
								while_901_:
								    do {
								    while_900_:
									do {
									    do {
										if (2 != i) {
										    if (i != 3) {
											if (i != 4) {
											    if (5 != i) {
												if (-13 != (i ^ 0xffffffff)) {
												    if (-14 != (i ^ 0xffffffff)) {
													if (-11 != (i ^ 0xffffffff)) {
													    if (11 != i) {
														if (i != 6) {
														    if (i != 7) {
															if ((i ^ 0xffffffff) != -9) {
															    if (9 != i) {
																if (i != 14) {
																    if (15 != i) {
																	if (i == 16)
																	    break while_911_;
																	break while_912_;
																    }
																} else
																    break while_909_;
																break while_910_;
															    }
															} else
															    break while_907_;
															break while_908_;
														    }
														} else
														    break while_905_;
														break while_906_;
													    }
													} else
													    break while_903_;
													break while_904_;
												    }
												} else
												    break while_901_;
												break while_902_;
											    }
											} else
											    break;
											break while_900_;
										    }
										} else {
										    anInt1115 = 1;
										    anInt1121 = 2048;
										    anInt1102 = 2048;
										    anInt1113 = 0;
										    break while_913_;
										}
										anInt1115 = 1;
										anInt1113 = 0;
										anInt1102 = 2048;
										anInt1121 = 4096;
										break while_913_;
									    } while (false);
									    anInt1115 = 4;
									    anInt1102 = 2048;
									    anInt1113 = 0;
									    anInt1121 = 2048;
									    break while_913_;
									} while (false);
									anInt1102
									    = 2048;
									anInt1121
									    = 8192;
									anInt1113
									    = 0;
									anInt1115
									    = 4;
									break while_913_;
								    } while (false);
								    anInt1115
									= 2;
								    anInt1121
									= 2048;
								    anInt1113
									= 0;
								    anInt1102
									= 2048;
								    break while_913_;
								} while (false);
								anInt1115 = 2;
								anInt1121
								    = 8192;
								anInt1102
								    = 2048;
								anInt1113 = 0;
								break while_913_;
							    } while (false);
							    anInt1115 = 3;
							    anInt1121 = 2048;
							    anInt1102 = 512;
							    anInt1113 = 1536;
							    break while_913_;
							} while (false);
							anInt1113 = 1536;
							anInt1121 = 4096;
							anInt1102 = 512;
							anInt1115 = 3;
							break while_913_;
						    } while (false);
						    anInt1115 = 3;
						    anInt1113 = 1280;
						    anInt1102 = 768;
						    anInt1121 = 2048;
						    break while_913_;
						} while (false);
						anInt1102 = 768;
						anInt1115 = 3;
						anInt1113 = 1280;
						anInt1121 = 4096;
						break while_913_;
					    } while (false);
					    anInt1115 = 3;
					    anInt1121 = 2048;
					    anInt1102 = 1024;
					    anInt1113 = 1024;
					    break while_913_;
					} while (false);
					anInt1115 = 3;
					anInt1102 = 1024;
					anInt1121 = 4096;
					anInt1113 = 1024;
					break while_913_;
				    } while (false);
				    anInt1113 = 1280;
				    anInt1115 = 1;
				    anInt1121 = 2048;
				    anInt1102 = 768;
				    break while_913_;
				} while (false);
				anInt1113 = 1536;
				anInt1115 = 1;
				anInt1102 = 512;
				anInt1121 = 4096;
				break while_913_;
			    } while (false);
			    anInt1113 = 1792;
			    anInt1121 = 8192;
			    anInt1102 = 256;
			    anInt1115 = 1;
			    break while_913_;
			} while (false);
			anInt1113 = 0;
			anInt1102 = 2048;
			anInt1121 = 2048;
			anInt1115 = 0;
		    } catch (RuntimeException runtimeexception) {
			break while_914_;
		    }
		} while (false);
		break while_915_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "jl.E(" + arg0 + ')');
	} while (false);
    }
    
    public Class73() {
	aFloatArray1131 = new float[4];
	try {
	    if (Class14_Sub2_Sub18_Sub2.anIntArray5082 == null)
		Class14_Sub10.method830(-32768);
	    method1332((byte) 101);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jl.<init>()");
	}
    }
    
    public Class73(Class14_Sub10 arg0) {
	aFloatArray1131 = new float[4];
	try {
	    if (Class14_Sub2_Sub18_Sub2.anIntArray5082 == null)
		Class14_Sub10.method830(-32768);
	    anInt1125 = arg0.method798(78);
	    aBoolean1112 = (0x10 & anInt1125 ^ 0xffffffff) != -1;
	    aBoolean1123 = (anInt1125 & 0x8 ^ 0xffffffff) != -1;
	    anInt1125 = anInt1125 & 0x7;
	    anInt1128 = arg0.method784((byte) 113);
	    anInt1124 = arg0.method784((byte) 113);
	    anInt1104 = arg0.method784((byte) 107);
	    anInt1120 = arg0.method798(110);
	    method1331(64);
	    aShortArray1106 = new short[1 + 2 * anInt1120];
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aShortArray1106.length ^ 0xffffffff); i++)
		aShortArray1106[i] = (short) arg0.method784((byte) 124);
	    anInt1122 = Class3.anIntArray119[arg0.method784((byte) 116)];
	    int i = arg0.method798(88);
	    anInt1130 = i & 0x1f;
	    anInt1109 = (0xe0 & i) << -1214701021;
	    method1332((byte) 101);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jl.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
}
