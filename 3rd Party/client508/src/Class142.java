/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class142
{
    public int anInt2255;
    public int anInt2256;
    public int anInt2257;
    public int anInt2258;
    public static int anInt2259;
    public Class55 aClass55_2260;
    public int anInt2261;
    public static int anInt2262;
    public Class124[] aClass124Array2263;
    public int anInt2264;
    public int anInt2265;
    public static int anInt2266;
    public static int anInt2267;
    public int anInt2268;
    public short[] aShortArray2269;
    public static int anInt2270;
    public static Class124 aClass124_2271;
    public static int anInt2272;
    public int anInt2273 = 2000;
    public int anInt2274;
    public boolean aBoolean2275;
    public int anInt2276;
    public int anInt2277;
    public short[] aShortArray2278;
    public short[] aShortArray2279;
    public static int anInt2280;
    public int anInt2281;
    public static int anInt2282;
    public short[] aShortArray2283;
    public static int[] anIntArray2284;
    public int anInt2285;
    public int anInt2286;
    public static int anInt2287;
    public int anInt2288;
    public int[][] anIntArrayArray2289;
    public int anInt2290;
    public int anInt2291;
    public int anInt2292;
    public int anInt2293;
    public static int anInt2294;
    public static int anInt2295;
    public Class124 aClass124_2296;
    public int anInt2297;
    public int anInt2298;
    public static boolean aBoolean2299;
    public static int anInt2300;
    public int anInt2301;
    public static int anInt2302;
    public int anInt2303;
    public Class124[] aClass124Array2304;
    public int anInt2305;
    public boolean aBoolean2306;
    public static int anInt2307 = 0;
    public static int anInt2308;
    public int anInt2309;
    public int anInt2310;
    public int anInt2311;
    public static int anInt2312;
    public int anInt2313;
    public static int anInt2314;
    public static int anInt2315;
    public int anInt2316;
    public int anInt2317;
    public byte[] aByteArray2318;
    public int anInt2319;
    public int[] anIntArray2320;
    public static Class124 aClass124_2321;
    public int anInt2322;
    public static int anInt2323;
    public int anInt2324;
    public int[] anIntArray2325;
    public int anInt2326;
    public int anInt2327;
    public int anInt2328;
    
    public boolean method1964(boolean arg0, byte arg1) {
    while_1251_:
	do {
	    int i;
	    int i_0_;
	    int i_1_;
	    do {
		boolean bool;
		try {
		    anInt2282++;
		    i = anInt2274;
		    i_0_ = anInt2255;
		    i_1_ = anInt2292;
		    if (arg0) {
			i_1_ = anInt2303;
			i_0_ = anInt2322;
			i = anInt2264;
		    }
		    if (-1 != i)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1251_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		if (arg1 >= -54)
		    method1979(114, null, (byte) -25);
		boolean bool_2_ = true;
		if (!Class14_Sub8_Sub6.aClass9_4193.method158(0, i, (byte) 46))
		    bool_2_ = false;
		if (0 != (i_0_ ^ 0xffffffff)
		    && !Class14_Sub8_Sub6.aClass9_4193.method158(0, i_0_,
								 (byte) -112))
		    bool_2_ = false;
		if (i_1_ != -1
		    && !Class14_Sub8_Sub6.aClass9_4193.method158(0, i_1_,
								 (byte) 88))
		    bool_2_ = false;
		bool = bool_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vc.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class133_Sub2 method1965(int arg0, boolean arg1) {
    while_1252_:
	do {
	    int i;
	    int i_3_;
	    int i_4_;
	    do {
		Class133_Sub2 class133_sub2;
		try {
		    anInt2280++;
		    i = anInt2255;
		    i_3_ = anInt2274;
		    i_4_ = anInt2292;
		    if (arg1) {
			i = anInt2322;
			i_3_ = anInt2264;
			i_4_ = anInt2303;
		    }
		    if (0 != (i_3_ ^ 0xffffffff))
			break;
		    class133_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1252_;
		}
		return class133_sub2;
	    } while (false);
	    Class133_Sub2 class133_sub2;
	    try {
		Class133_Sub2 class133_sub2_5_
		    = Class133_Sub2.method1824(Class14_Sub8_Sub6.aClass9_4193,
					       i_3_, 0);
		if (0 != (i ^ 0xffffffff)) {
		    Class133_Sub2 class133_sub2_6_
			= Class133_Sub2.method1824((Class14_Sub8_Sub6
						    .aClass9_4193),
						   i, 0);
		    if (0 == (i_4_ ^ 0xffffffff)) {
			Class133_Sub2[] class133_sub2s
			    = { class133_sub2_5_, class133_sub2_6_ };
			class133_sub2_5_
			    = new Class133_Sub2(class133_sub2s, 2);
		    } else {
			Class133_Sub2 class133_sub2_7_
			    = Class133_Sub2.method1824((Class14_Sub8_Sub6
							.aClass9_4193),
						       i_4_, 0);
			Class133_Sub2[] class133_sub2s
			    = { class133_sub2_5_, class133_sub2_6_,
				class133_sub2_7_ };
			class133_sub2_5_
			    = new Class133_Sub2(class133_sub2s, 3);
		    }
		}
		if (!arg1 && (-1 != (anInt2297 ^ 0xffffffff) || 0 != anInt2256
			      || anInt2319 != 0))
		    class133_sub2_5_.method1825(anInt2297, anInt2256,
						anInt2319);
		if (arg1 && ((anInt2258 ^ 0xffffffff) != -1
			     || -1 != (anInt2290 ^ 0xffffffff)
			     || -1 != (anInt2324 ^ 0xffffffff)))
		    class133_sub2_5_.method1825(anInt2258, anInt2290,
						anInt2324);
		if (aShortArray2278 != null) {
		    for (int i_8_ = 0; aShortArray2278.length > i_8_; i_8_++)
			class133_sub2_5_.method1813(aShortArray2278[i_8_],
						    aShortArray2269[i_8_]);
		}
		int i_9_ = -32 / ((arg0 - -53) / 62);
		if (null != aShortArray2283) {
		    for (int i_10_ = 0; i_10_ < aShortArray2283.length;
			 i_10_++)
			class133_sub2_5_.method1819(aShortArray2283[i_10_],
						    aShortArray2279[i_10_]);
		}
		class133_sub2 = class133_sub2_5_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vc.N(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method1966(Class142 arg0, int arg1, Class142 arg2) {
    while_1254_:
	do {
	while_1253_:
	    do {
		do {
		    try {
			anInt2288 = 0;
			anInt2326 = arg0.anInt2326;
			anInt2258 = arg2.anInt2258;
			anInt2292 = arg2.anInt2292;
			aShortArray2278 = arg2.aShortArray2278;
			aClass124Array2304 = new Class124[5];
			aShortArray2269 = arg2.aShortArray2269;
			anInt2273 = arg0.anInt2273;
			aClass124_2296 = arg2.aClass124_2296;
			anInt2319 = arg2.anInt2319;
			anInt2298 = arg2.anInt2298;
			anInt2290 = arg2.anInt2290;
			anInt2285 = arg0.anInt2285;
			anInt2277 = arg2.anInt2277;
			if (arg1 < -111)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1253_;
		    }
		    return;
		} while (false);
		try {
		    anInt2287++;
		    anInt2293 = arg0.anInt2293;
		    aClass124Array2263 = arg2.aClass124Array2263;
		    aByteArray2318 = arg2.aByteArray2318;
		    aShortArray2283 = arg2.aShortArray2283;
		    anInt2311 = arg0.anInt2311;
		    aClass55_2260 = arg2.aClass55_2260;
		    anInt2256 = arg2.anInt2256;
		    aShortArray2279 = arg2.aShortArray2279;
		    aBoolean2306 = arg2.aBoolean2306;
		    anInt2317 = arg0.anInt2317;
		    anInt2297 = arg2.anInt2297;
		    anInt2301 = arg2.anInt2301;
		    anInt2313 = arg2.anInt2313;
		    anInt2274 = arg2.anInt2274;
		    anInt2264 = arg2.anInt2264;
		    anInt2255 = arg2.anInt2255;
		    anInt2322 = arg2.anInt2322;
		    anInt2286 = arg0.anInt2286;
		    anInt2310 = arg2.anInt2310;
		    anInt2303 = arg2.anInt2303;
		    anInt2324 = arg2.anInt2324;
		    if (arg2.aClass124Array2304 != null) {
			for (int i = 0; i < 4; i++)
			    aClass124Array2304[i] = arg2.aClass124Array2304[i];
		    }
		    aClass124Array2304[4] = Class79.aClass124_1255;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1254_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("vc.F("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public void method1967(int arg0) {
	try {
	    if (arg0 <= 52)
		anInt2305 = -60;
	    anInt2312++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vc.E(" + arg0 + ')');
	}
    }
    
    public void method1968(Class142 arg0, Class142 arg1, int arg2) {
	try {
	    aClass124_2296 = arg1.aClass124_2296;
	    aShortArray2279 = arg0.aShortArray2279;
	    aShortArray2269 = arg0.aShortArray2269;
	    anInt2288 = arg1.anInt2288;
	    anInt2273 = arg0.anInt2273;
	    aByteArray2318 = arg0.aByteArray2318;
	    if (arg2 <= 116)
		method1976((byte) 29);
	    anInt2326 = arg0.anInt2326;
	    aShortArray2278 = arg0.aShortArray2278;
	    anInt2309 = 1;
	    anInt2293 = arg0.anInt2293;
	    anInt2317 = arg0.anInt2317;
	    aBoolean2306 = arg1.aBoolean2306;
	    aShortArray2283 = arg0.aShortArray2283;
	    anInt2286 = arg0.anInt2286;
	    anInt2285 = arg0.anInt2285;
	    anInt2311 = arg0.anInt2311;
	    anInt2314++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vc.I("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1969(boolean arg0) {
    while_1256_:
	do {
	while_1255_:
	    do {
		do {
		    try {
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1255_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray2284 = null;
		    aClass124_2271 = null;
		    aClass124_2321 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1256_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "vc.M(" + arg0 + ')');
	} while (false);
    }
    
    public Class142 method1970(int arg0, boolean arg1) {
    while_1257_:
	do {
	    do {
		Class142 class142;
		try {
		    anInt2270++;
		    if (anIntArray2325 == null || arg0 <= 1)
			break;
		    int i = -1;
		    for (int i_11_ = 0; i_11_ < 10; i_11_++) {
			if (arg0 >= anIntArray2320[i_11_]
			    && anIntArray2320[i_11_] != 0)
			    i = anIntArray2325[i_11_];
		    }
		    if (0 == (i ^ 0xffffffff))
			break;
		    class142 = Class14_Sub8_Sub24.method605(95, i);
		} catch (RuntimeException runtimeexception) {
		    break while_1257_;
		}
		return class142;
	    } while (false);
	    Class142 class142;
	    try {
		if (arg1)
		    method1974(null, 112, -121, -104);
		class142 = this;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class142;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vc.O(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method1971(Class14_Sub10 arg0, boolean arg1) {
	try {
	    if (arg1 != true)
		method1969(true);
	    for (;;) {
		int i = arg0.method798(-91);
		if ((i ^ 0xffffffff) == -1)
		    break;
		method1972(i, -19943, arg0);
	    }
	    anInt2294++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vc.K("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method1972(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt2308++;
	    if ((arg0 ^ 0xffffffff) == -2)
		anInt2311 = arg2.method784((byte) 104);
	    else if (-3 == (arg0 ^ 0xffffffff))
		aClass124_2296 = arg2.method797(9467);
	    else if (-5 != (arg0 ^ 0xffffffff)) {
		if (-6 == (arg0 ^ 0xffffffff))
		    anInt2317 = arg2.method784((byte) 102);
		else if (6 == arg0)
		    anInt2286 = arg2.method784((byte) 111);
		else if ((arg0 ^ 0xffffffff) != -8) {
		    if ((arg0 ^ 0xffffffff) != -9) {
			if (11 == arg0)
			    anInt2309 = 1;
			else if (-13 == (arg0 ^ 0xffffffff))
			    anInt2288 = arg2.method812((byte) -112);
			else if (-17 != (arg0 ^ 0xffffffff)) {
			    if (arg0 == 23)
				anInt2274 = arg2.method784((byte) 116);
			    else if (24 != arg0) {
				if (25 == arg0)
				    anInt2264 = arg2.method784((byte) 118);
				else if ((arg0 ^ 0xffffffff) != -27) {
				    if ((arg0 ^ 0xffffffff) <= -31
					&& -36 < (arg0 ^ 0xffffffff)) {
					aClass124Array2263[arg0 + -30]
					    = arg2.method797(9467);
					if (aClass124Array2263[-30 + arg0]
						.method1717
					    (arg1 + 19983,
					     Class14_Sub9_Sub1.aClass124_4808))
					    aClass124Array2263[arg0 + -30]
						= null;
				    } else if (arg0 < 35
					       || -41 >= (arg0 ^ 0xffffffff)) {
					if ((arg0 ^ 0xffffffff) != -41) {
					    if (41 == arg0) {
						int i = arg2.method798(86);
						aShortArray2283 = new short[i];
						aShortArray2279 = new short[i];
						for (int i_12_ = 0; i_12_ < i;
						     i_12_++) {
						    aShortArray2283[i_12_]
							= (short) (arg2.method784
								   ((byte) 109));
						    aShortArray2279[i_12_]
							= (short) (arg2.method784
								   ((byte) 124));
						}
					    } else if ((arg0 ^ 0xffffffff)
						       != -43) {
						if ((arg0 ^ 0xffffffff) == -66)
						    aBoolean2275 = true;
						else if (arg0 != 78) {
						    if (79 == arg0)
							anInt2303
							    = (arg2.method784
							       ((byte) 114));
						    else if (arg0 != 90) {
							if (91 != arg0) {
							    if (-93
								!= (arg0
								    ^ 0xffffffff)) {
								if (93 == arg0)
								    anInt2277
									= (arg2.method784
									   ((byte) 121));
								else if ((arg0
									  ^ 0xffffffff)
									 != -96) {
								    if (arg0
									== 96)
									anInt2265
									    = arg2.method798(96);
								    else if (-98
									     != (arg0 ^ 0xffffffff)) {
									if (arg0
									    != 98) {
									    if (100 <= arg0 && 110 > arg0) {
										if (null == anIntArray2325) {
										    anIntArray2325 = new int[10];
										    anIntArray2320 = new int[10];
										}
										anIntArray2325[-100 + arg0] = arg2.method784((byte) 112);
										anIntArray2320[-100 + arg0] = arg2.method784((byte) 118);
									    } else if (arg0 != 110) {
										if (-112 != (arg0 ^ 0xffffffff)) {
										    if (arg0 != 112) {
											if (arg0 == 113)
											    anInt2281 = arg2.method780((byte) -77);
											else if ((arg0 ^ 0xffffffff) != -115) {
											    if ((arg0 ^ 0xffffffff) == -116)
												anInt2310 = arg2.method798(-102);
											    else if ((arg0 ^ 0xffffffff) != -122) {
												if (122 == arg0)
												    anInt2305 = arg2.method784((byte) 123);
												else if (arg0 == 124) {
												    if (null == anIntArrayArray2289)
													anIntArrayArray2289 = new int[11][];
												    int i = arg2.method798(arg1 ^ 0x4da1);
												    anIntArrayArray2289[i] = new int[6];
												    for (int i_13_ = 0; -7 < (i_13_ ^ 0xffffffff); i_13_++)
													anIntArrayArray2289[i][i_13_] = arg2.method805(arg1 + 19943);
												} else if (arg0 == 125) {
												    anInt2297 = arg2.method780((byte) -77);
												    anInt2256 = arg2.method780((byte) -77);
												    anInt2319 = arg2.method780((byte) -77);
												} else if ((arg0 ^ 0xffffffff) != -127) {
												    if ((arg0 ^ 0xffffffff) == -250) {
													int i = arg2.method798(arg1 + 19900);
													if (aClass55_2260 == null) {
													    int i_14_ = Class14_Sub8_Sub33.method653(i, 80);
													    aClass55_2260 = new Class55(i_14_);
													}
													for (int i_15_ = 0; (i ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
													    boolean bool = -2 == (arg2.method798(-124) ^ 0xffffffff);
													    int i_16_ = arg2.method829(71);
													    Class14 class14;
													    if (bool)
														class14 = new Class14_Sub30(arg2.method797(9467));
													    else
														class14 = new Class14_Sub1(arg2.method812((byte) -110));
													    aClass55_2260.method1224(arg1 ^ ~0x4dee, (long) i_16_, class14);
													}
												    }
												} else {
												    anInt2258 = arg2.method780((byte) -77);
												    anInt2290 = arg2.method780((byte) -77);
												    anInt2324 = arg2.method780((byte) -77);
												}
											    } else
												anInt2257 = arg2.method784((byte) 118);
											} else
											    anInt2261 = 5 * arg2.method780((byte) -77);
										    } else
											anInt2327 = arg2.method784((byte) 119);
										} else
										    anInt2291 = arg2.method784((byte) 103);
									    } else
										anInt2328 = arg2.method784((byte) 117);
									} else
									    anInt2316 = arg2.method784((byte) 121);
								    } else
									anInt2268
									    = arg2.method784((byte) 120);
								} else
								    anInt2326
									= (arg2.method784
									   ((byte) 117));
							    } else
								anInt2298
								    = (arg2.method784
								       ((byte) 114));
							} else
							    anInt2301
								= (arg2.method784
								   ((byte) 115));
						    } else
							anInt2313
							    = (arg2.method784
							       ((byte) 102));
						} else
						    anInt2292 = (arg2.method784
								 ((byte) 125));
					    } else {
						int i = arg2.method798(90);
						aByteArray2318 = new byte[i];
						for (int i_17_ = 0;
						     ((i_17_ ^ 0xffffffff)
						      > (i ^ 0xffffffff));
						     i_17_++)
						    aByteArray2318[i_17_]
							= (arg2.method780
							   ((byte) -77));
					    }
					} else {
					    int i = arg2.method798(arg1
								   ^ ~0x4db4);
					    aShortArray2278 = new short[i];
					    aShortArray2269 = new short[i];
					    for (int i_18_ = 0; i > i_18_;
						 i_18_++) {
						aShortArray2278[i_18_]
						    = (short) (arg2.method784
							       ((byte) 114));
						aShortArray2269[i_18_]
						    = (short) (arg2.method784
							       ((byte) 113));
					    }
					}
				    } else
					aClass124Array2304[-35 + arg0]
					    = arg2.method797(arg1 + 29410);
				} else
				    anInt2322 = arg2.method784((byte) 123);
			    } else
				anInt2255 = arg2.method784((byte) 123);
			} else
			    aBoolean2306 = true;
		    } else {
			anInt2285 = arg2.method784((byte) 127);
			if (32767 < anInt2285)
			    anInt2285 -= 65536;
		    }
		} else {
		    anInt2293 = arg2.method784((byte) 127);
		    if (32767 < anInt2293)
			anInt2293 -= 65536;
		}
	    } else
		anInt2273 = arg2.method784((byte) 121);
	    if (arg1 != -19943)
		anInt2293 = -62;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vc.Q(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class133_Sub2 method1973(int arg0, boolean arg1) {
    while_1258_:
	do {
	    do {
		Class133_Sub2 class133_sub2;
		try {
		    anInt2300++;
		    if (arg0 < -34)
			break;
		    class133_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1258_;
		}
		return class133_sub2;
	    } while (false);
	    int i;
	    int i_19_;
	    do {
		Class133_Sub2 class133_sub2;
		try {
		    i = anInt2298;
		    i_19_ = anInt2313;
		    if (arg1) {
			i_19_ = anInt2301;
			i = anInt2277;
		    }
		    if (0 != (i_19_ ^ 0xffffffff))
			break;
		    class133_sub2 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1258_;
		}
		return class133_sub2;
	    } while (false);
	    Class133_Sub2 class133_sub2;
	    try {
		Class133_Sub2 class133_sub2_20_
		    = Class133_Sub2.method1824(Class14_Sub8_Sub6.aClass9_4193,
					       i_19_, 0);
		if ((i ^ 0xffffffff) != 0) {
		    Class133_Sub2 class133_sub2_21_
			= Class133_Sub2.method1824((Class14_Sub8_Sub6
						    .aClass9_4193),
						   i, 0);
		    Class133_Sub2[] class133_sub2s
			= { class133_sub2_20_, class133_sub2_21_ };
		    class133_sub2_20_ = new Class133_Sub2(class133_sub2s, 2);
		}
		if (aShortArray2278 != null) {
		    for (int i_22_ = 0; i_22_ < aShortArray2278.length;
			 i_22_++)
			class133_sub2_20_.method1813(aShortArray2278[i_22_],
						     aShortArray2269[i_22_]);
		}
		if (null != aShortArray2283) {
		    for (int i_23_ = 0; i_23_ < aShortArray2283.length;
			 i_23_++)
			class133_sub2_20_.method1819(aShortArray2283[i_23_],
						     aShortArray2279[i_23_]);
		}
		class133_sub2 = class133_sub2_20_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vc.L(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class133_Sub7 method1974(Class46 arg0, int arg1, int arg2,
				    int arg3) {
    while_1260_:
	do {
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    if (arg2 == 0)
			break;
		    class133_sub7 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1260_;
		}
		return class133_sub7;
	    } while (false);
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt2272++;
		    if (anIntArray2325 == null || -2 <= (arg3 ^ 0xffffffff))
			break;
		    int i = -1;
		    for (int i_24_ = 0; i_24_ < 10; i_24_++) {
			if (arg3 >= anIntArray2320[i_24_]
			    && -1 != (anIntArray2320[i_24_] ^ 0xffffffff))
			    i = anIntArray2325[i_24_];
		    }
		    if ((i ^ 0xffffffff) == 0)
			break;
		    class133_sub7 = Class14_Sub8_Sub24.method605(96, i)
					.method1974(arg0, arg1, 0, 1);
		} catch (RuntimeException runtimeexception) {
		    break while_1260_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	while_1259_:
	    do {
		Class133_Sub2 class133_sub2;
		do {
		    Class133_Sub7 class133_sub7_25_;
		    try {
			class133_sub7
			    = ((Class133_Sub7)
			       Class125.aClass52_2075
				   .method1210((byte) 121, (long) anInt2276));
			if (null != class133_sub7)
			    break while_1259_;
			class133_sub2
			    = Class133_Sub2.method1824((Class14_Sub8_Sub6
							.aClass9_4193),
						       anInt2311, 0);
			if (class133_sub2 != null)
			    break;
			class133_sub7_25_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_1260_;
		    }
		    return class133_sub7_25_;
		} while (false);
		try {
		    if (null != aShortArray2278) {
			for (int i = 0; i < aShortArray2278.length; i++) {
			    if (null != aByteArray2318
				&& (i ^ 0xffffffff) > (aByteArray2318.length
						       ^ 0xffffffff))
				class133_sub2.method1813(aShortArray2278[i],
							 (Class7_Sub1
							  .aShortArray2663
							  [(aByteArray2318[i]
							    & 0xff)]));
			    else
				class133_sub2.method1813(aShortArray2278[i],
							 aShortArray2269[i]);
			}
		    }
		    if (aShortArray2283 != null) {
			for (int i = 0; i < aShortArray2283.length; i++)
			    class133_sub2.method1819(aShortArray2283[i],
						     aShortArray2279[i]);
		    }
		    class133_sub7 = class133_sub2.method1827(anInt2281 + 64,
							     768 - -anInt2261,
							     -50, -10, -50);
		    if (128 != anInt2328 || anInt2291 != 128
			|| (anInt2327 ^ 0xffffffff) != -129)
			class133_sub7.method1869(anInt2328, anInt2291,
						 anInt2327);
		    class133_sub7.aBoolean3687 = true;
		    ((Class133_Sub7_Sub2) class133_sub7).method1895
			(false, false, false, true, false, false, true);
		    Class125.aClass52_2075.method1205((byte) -93,
						      class133_sub7,
						      (long) anInt2276);
		} catch (RuntimeException runtimeexception) {
		    break while_1260_;
		}
	    } while (false);
	    if (null != arg0)
		class133_sub7 = arg0.method1167(arg1, 65535, class133_sub7);
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vc.G("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + arg3 + ')'));
    }
    
    public boolean method1975(int arg0, boolean arg1) {
    while_1261_:
	do {
	    int i;
	    int i_26_;
	    do {
		boolean bool;
		try {
		    anInt2266++;
		    i = anInt2313;
		    i_26_ = anInt2298;
		    if (arg1) {
			i_26_ = anInt2277;
			i = anInt2301;
		    }
		    if ((i ^ 0xffffffff) != arg0)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_1261_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		boolean bool_27_ = true;
		if (!Class14_Sub8_Sub6.aClass9_4193.method158(0, i, (byte) 76))
		    bool_27_ = false;
		if (i_26_ != -1
		    && !Class14_Sub8_Sub6.aClass9_4193.method158(0, i_26_,
								 (byte) -90))
		    bool_27_ = false;
		bool = bool_27_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vc.P(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1976(byte arg0) {
	try {
	    anInt2262++;
	    Class71 class71 = new Class71();
	    int i = 0;
	    int i_28_ = 60 % ((-46 - arg0) / 63);
	    for (/**/; (i ^ 0xffffffff) > -14; i++) {
		for (int i_29_ = 0; (i_29_ ^ 0xffffffff) > -14; i_29_++)
		    Class150.aClass71ArrayArray2421[i][i_29_] = class71;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vc.J(" + arg0 + ')');
	}
    }
    
    public int method1977(int arg0, int arg1, int arg2) {
    while_1262_:
	do {
	    do {
		int i;
		try {
		    anInt2267++;
		    if (arg2 != 125)
			anInt2293 = 63;
		    if (null != aClass55_2260)
			break;
		    i = arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_1262_;
		}
		return i;
	    } while (false);
	    Class14_Sub1 class14_sub1;
	    do {
		int i;
		try {
		    class14_sub1
			= (Class14_Sub1) aClass55_2260.method1230((long) arg1,
								  (byte) -104);
		    if (null != class14_sub1)
			break;
		    i = arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_1262_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = class14_sub1.anInt2714;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vc.H(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public Class133_Sub7_Sub1 method1978(int arg0) {
    while_1263_:
	do {
	    Class133_Sub2 class133_sub2;
	    do {
		Class133_Sub7_Sub1 class133_sub7_sub1;
		try {
		    class133_sub2 = Class133_Sub2.method1824((Class14_Sub8_Sub6
							      .aClass9_4193),
							     anInt2311, arg0);
		    anInt2259++;
		    if (null != class133_sub2)
			break;
		    class133_sub7_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1263_;
		}
		return class133_sub7_sub1;
	    } while (false);
	    Class133_Sub7_Sub1 class133_sub7_sub1;
	    try {
		if (null != aShortArray2278) {
		    for (int i = 0; i < aShortArray2278.length; i++) {
			if (null != aByteArray2318
			    && aByteArray2318.length > i)
			    class133_sub2.method1813(aShortArray2278[i],
						     (Class7_Sub1
						      .aShortArray2663
						      [(aByteArray2318[i]
							& 0xff)]));
			else
			    class133_sub2.method1813(aShortArray2278[i],
						     aShortArray2269[i]);
		    }
		}
		if (null != aShortArray2283) {
		    for (int i = 0; i < aShortArray2283.length; i++)
			class133_sub2.method1819(aShortArray2283[i],
						 aShortArray2279[i]);
		}
		Class133_Sub7_Sub1 class133_sub7_sub1_30_
		    = class133_sub2.method1822(anInt2281 + 64, anInt2261 + 768,
					       -50, -10, -50);
		if (anInt2328 != 128 || 128 != anInt2291 || anInt2327 != 128)
		    class133_sub7_sub1_30_.method1869(anInt2328, anInt2291,
						      anInt2327);
		class133_sub7_sub1 = class133_sub7_sub1_30_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "vc.D(" + arg0 + ')');
    }
    
    public Class124 method1979(int arg0, Class124 arg1, byte arg2) {
    while_1264_:
	do {
	    do {
		Class124 class124;
		try {
		    if (arg2 <= 37)
			anInt2295 = -114;
		    anInt2323++;
		    if (aClass55_2260 != null)
			break;
		    class124 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_1264_;
		}
		return class124;
	    } while (false);
	    Class14_Sub30 class14_sub30;
	    do {
		Class124 class124;
		try {
		    class14_sub30
			= (Class14_Sub30) aClass55_2260.method1230((long) arg0,
								   (byte) 46);
		    if (class14_sub30 != null)
			break;
		    class124 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break while_1264_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = class14_sub30.aClass124_3270;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vc.C(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
    }
    
    public static void method1980(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt2302++;
	    int i = -arg7 + arg5;
	    int i_31_ = arg1 - -arg7;
	    int i_32_ = -arg7 + arg3;
	    for (int i_33_ = arg1; (i_31_ ^ 0xffffffff) < (i_33_ ^ 0xffffffff);
		 i_33_++)
		Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
				    [i_33_]),
				   arg2, arg3, -5973, arg0);
	    int i_34_ = arg2 - -arg7;
	    if (arg6 < 23)
		method1980(90, 12, -14, -101, -7, 82, 71, 101);
	    for (int i_35_ = arg5; i < i_35_; i_35_--)
		Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
				    [i_35_]),
				   arg2, arg3, -5973, arg0);
	    for (int i_36_ = i_31_; (i ^ 0xffffffff) <= (i_36_ ^ 0xffffffff);
		 i_36_++) {
		int[] is = Class14_Sub2_Sub19.anIntArrayArray4038[i_36_];
		Class51.method1201(is, arg2, i_34_, -5973, arg0);
		Class51.method1201(is, i_34_, i_32_, -5973, arg4);
		Class51.method1201(is, i_32_, arg3, -5973, arg0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vc.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
    }
    
    public Class142() {
	anInt2268 = -1;
	anInt2265 = 0;
	anInt2281 = 0;
	anInt2255 = -1;
	anInt2286 = 0;
	aBoolean2275 = false;
	anInt2288 = 1;
	anInt2292 = -1;
	anInt2291 = 128;
	anInt2293 = 0;
	anInt2285 = 0;
	anInt2290 = 0;
	anInt2256 = 0;
	anInt2303 = -1;
	anInt2301 = -1;
	anInt2297 = 0;
	anInt2298 = -1;
	aBoolean2306 = false;
	aClass124Array2304
	    = new Class124[] { null, null, null, null,
			       Class14_Sub8_Sub2.aClass124_4118 };
	anInt2264 = -1;
	anInt2261 = 0;
	aClass124_2296 = Class137.aClass124_2200;
	anInt2305 = -1;
	anInt2274 = -1;
	anInt2310 = 0;
	anInt2319 = 0;
	anInt2317 = 0;
	aClass124Array2263
	    = new Class124[] { null, null, Class14_Sub8_Sub17.aClass124_4368,
			       null, null };
	anInt2258 = 0;
	anInt2257 = -1;
	anInt2277 = -1;
	anInt2324 = 0;
	anInt2313 = -1;
	anInt2309 = 0;
	anInt2316 = -1;
	anInt2326 = 0;
	anInt2327 = 128;
	anInt2328 = 128;
	anInt2322 = -1;
    }
    
    static {
	aClass124_2271 = Class14_Sub2_Sub2.method263(1178, "http:)4)4");
	anInt2295 = 0;
	aBoolean2299 = false;
	anInt2315 = 0;
	aClass124_2321 = Class14_Sub2_Sub2.method263(1178, "::fpson");
    }
}
