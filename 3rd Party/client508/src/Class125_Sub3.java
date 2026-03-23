/* Class125_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125_Sub3 extends Class125
{
    public int anInt3390;
    public static int[][] anIntArrayArray3391;
    public static boolean aBoolean3392;
    public static int anInt3393;
    public static Class124 aClass124_3394;
    public int anInt3395;
    public int anInt3396;
    public static boolean aBoolean3397;
    public static int[] anIntArray3398 = new int[128];
    public static int anInt3399;
    public int anInt3400;
    public int anInt3401;
    public static int anInt3402;
    public int anInt3403;
    public static int anInt3404;
    public static int anInt3405;
    public static int anInt3406;
    public int anInt3407;
    public static Class124 aClass124_3408
	= Class14_Sub2_Sub2.method263(1178, "http:)4)4");
    public static Class124 aClass124_3409;
    public static Class94 aClass94_3410;
    public static int anInt3411;
    public static Class124 aClass124_3412;
    public static int anInt3413;
    public int anInt3414;
    public static int anInt3415;
    
    public static void method1735(byte arg0, int arg1, Class94[] arg2) {
    while_1128_:
	do {
	while_1127_:
	    do {
		do {
		    try {
			anInt3393++;
			if (arg0 == 31)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1127_;
		    }
		    return;
		} while (false);
		try {
		    int i = 0;
		    for (/**/; arg2.length > i; i++) {
			Class94 class94 = arg2[i];
			if (class94 != null
			    && (arg1 ^ 0xffffffff) == (class94.anInt1540
						       ^ 0xffffffff)
			    && (!class94.aBoolean1455
				|| !client.method49(class94))) {
			    if ((class94.anInt1489 ^ 0xffffffff) == -1) {
				if (!class94.aBoolean1455
				    && client.method49(class94)
				    && aClass94_3410 != class94)
				    continue;
				method1735((byte) 31, class94.anInt1548, arg2);
				if (class94.aClass94Array1486 != null)
				    method1735((byte) 31, class94.anInt1548,
					       class94.aClass94Array1486);
				Class14_Sub15 class14_sub15
				    = ((Class14_Sub15)
				       (Class14_Sub30.aClass55_3275.method1230
					((long) class94.anInt1548,
					 (byte) -23)));
				if (class14_sub15 != null)
				    Class14_Sub2_Sub1.method250((class14_sub15
								 .anInt2999),
								false);
			    }
			    if (6 == class94.anInt1489) {
				if (-1 != class94.anInt1598
				    || (class94.anInt1533 ^ 0xffffffff) != 0) {
				    boolean bool
					= Class89.method1440(class94,
							     arg0 ^ 0x27b8);
				    int i_0_;
				    if (!bool)
					i_0_ = class94.anInt1598;
				    else
					i_0_ = class94.anInt1533;
				    if (i_0_ != -1) {
					Class46 class46
					    = Class41.method1129(i_0_, -16);
					if (null != class46) {
					    class94.anInt1603
						+= Class51.anInt839;
					    while ((class94.anInt1603
						    ^ 0xffffffff)
						   < ((class46.anIntArray763
						       [class94.anInt1610])
						      ^ 0xffffffff)) {
						class94.anInt1603
						    -= (class46.anIntArray763
							[class94.anInt1610]);
						class94.anInt1610++;
						if (class94.anInt1610
						    >= (class46
							.anIntArray768).length) {
						    class94.anInt1610
							-= class46.anInt760;
						    if ((class94.anInt1610
							 ^ 0xffffffff) > -1
							|| (((class46
							      .anIntArray768).length
							     ^ 0xffffffff)
							    >= ((class94
								 .anInt1610)
								^ 0xffffffff)))
							class94.anInt1610 = 0;
						}
						Class103.method1531
						    ((byte) -116, class94);
					    }
					}
				    }
				}
				if (class94.anInt1505 != 0
				    && !class94.aBoolean1455) {
				    int i_1_ = class94.anInt1505 >> 1556180208;
				    i_1_ *= Class51.anInt839;
				    int i_2_ = (class94.anInt1505 << 854444496
						>> 808381392);
				    class94.anInt1465
					= i_1_ + class94.anInt1465 & 0x7ff;
				    i_2_ *= Class51.anInt839;
				    class94.anInt1578
					= i_2_ + class94.anInt1578 & 0x7ff;
				    Class103.method1531((byte) -50, class94);
				}
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1128_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("r.I(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public void method1721(boolean arg0, int arg1, int arg2) {
	try {
	    anInt3404++;
	    int i = anInt3401 * arg2 >> -1829483092;
	    int i_3_ = arg1 * anInt3403 >> 1728424588;
	    int i_4_ = anInt3414 * arg1 >> 1691378476;
	    int i_5_ = anInt3396 * arg2 >> 1421402348;
	    int i_6_ = anInt3400 * arg1 >> 1527854924;
	    int i_7_ = anInt3395 * arg2 >> -1396446740;
	    int i_8_ = anInt3390 * arg1 >> 1503701036;
	    int i_9_ = arg2 * anInt3407 >> -1527553908;
	    Class137.method1939(i_4_, arg0, anInt2083, i_9_, i, i_7_, i_5_,
				i_3_, i_8_, i_6_);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("r.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static Class99 method1736(int arg0) {
	do {
	    Class99 class99;
	    try {
		anInt3413++;
		try {
		    int i = -73 % ((59 - arg0) / 62);
		    class99 = ((Class99)
			       Class.forName("Class99_Sub1").newInstance());
		} catch (Throwable throwable) {
		    break;
		}
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class99;
	} while (false);
	return null;
    }
    
    public void method1726(int arg0, int arg1, int arg2) {
	try {
	    anInt3399++;
	    if (arg0 < 39)
		method1726(67, 44, -69);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("r.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public void method1724(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != -6)
		aClass124_3394 = null;
	    anInt3415++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("r.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1737(boolean arg0, int arg1, int arg2,
				  Class14_Sub10 arg3, int arg4, int arg5,
				  int arg6, int arg7, int arg8) {
	try {
	    if (arg1 != 16482)
		aBoolean3397 = true;
	    if (0 <= arg7 && -105 < (arg7 ^ 0xffffffff)
		&& (arg8 ^ 0xffffffff) <= -1 && (arg8 ^ 0xffffffff) > -105) {
		if (!arg0)
		    Class14_Sub8_Sub4.aByteArrayArrayArray4142[arg2][arg7]
			[arg8]
			= (byte) 0;
		for (;;) {
		    int i = arg3.method798(-47);
		    if ((i ^ 0xffffffff) == -1) {
			if (!arg0) {
			    if (0 != arg2)
				Class114.anIntArrayArrayArray1896[arg2]
				    [arg7][arg8]
				    = -240 + (Class114.anIntArrayArrayArray1896
					      [-1 + arg2][arg7][arg8]);
			    else
				Class114.anIntArrayArrayArray1896[0][arg7]
				    [arg8]
				    = (8
				       * -Class14_Sub6.method465((arg8 + 556238
								  - -arg5),
								 (byte) 29,
								 (arg7 + 932731
								  - -arg6)));
			} else
			    Class114.anIntArrayArrayArray1896[0][arg7][arg8]
				= (Class149.anIntArrayArrayArray2391[0][arg7]
				   [arg8]);
			break;
		    }
		    if (-2 == (i ^ 0xffffffff)) {
			int i_10_ = arg3.method798(99);
			if (!arg0) {
			    if ((i_10_ ^ 0xffffffff) == -2)
				i_10_ = 0;
			    if ((arg2 ^ 0xffffffff) == -1)
				Class114.anIntArrayArrayArray1896[0][arg7]
				    [arg8]
				    = 8 * -i_10_;
			    else
				Class114.anIntArrayArrayArray1896[arg2]
				    [arg7][arg8]
				    = -(i_10_ * 8) + (Class114
						      .anIntArrayArrayArray1896
						      [arg2 + -1][arg7][arg8]);
			} else
			    Class114.anIntArrayArrayArray1896[0][arg7][arg8]
				= (Class149.anIntArrayArrayArray2391[0][arg7]
				   [arg8]) + 8 * i_10_;
			break;
		    }
		    if ((i ^ 0xffffffff) >= -50) {
			Class14_Sub8_Sub6.aByteArrayArrayArray4194[arg2]
			    [arg7][arg8]
			    = arg3.method780((byte) -77);
			Class20.aByteArrayArrayArray430[arg2][arg7][arg8]
			    = (byte) ((-2 + i) / 4);
			Class15.aByteArrayArrayArray385[arg2][arg7][arg8]
			    = (byte) Class14_Sub8_Sub26
					 .method617(arg4 + (-2 + i), 3);
		    } else if (81 >= i) {
			if (!arg0)
			    Class14_Sub8_Sub4.aByteArrayArrayArray4142
				[arg2][arg7][arg8]
				= (byte) (i - 49);
		    } else
			Class97.aByteArrayArrayArray1645[arg2][arg7][arg8]
			    = (byte) (-81 + i);
		}
	    } else {
		for (;;) {
		    int i = arg3.method798(-116);
		    if (i == 0)
			break;
		    if (-2 == (i ^ 0xffffffff)) {
			arg3.method798(89);
			break;
		    }
		    if (49 >= i)
			arg3.method798(81);
		}
	    }
	    anInt3406++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("r.J(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	}
    }
    
    public Class125_Sub3(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9) {
	super(-1, arg8, arg9);
	try {
	    anInt3403 = arg0;
	    anInt3414 = arg2;
	    anInt3401 = arg1;
	    anInt3396 = arg3;
	    anInt3395 = arg5;
	    anInt3400 = arg4;
	    anInt3407 = arg7;
	    anInt3390 = arg6;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("r.<init>(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ')'));
	}
    }
    
    public static void method1738(int arg0) {
	try {
	    anIntArrayArray3391 = null;
	    anIntArray3398 = null;
	    aClass124_3394 = null;
	    aClass124_3412 = null;
	    aClass124_3408 = null;
	    aClass124_3409 = null;
	    aClass94_3410 = null;
	    if (arg0 != -1)
		aClass124_3408 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "r.H(" + arg0 + ')');
	}
    }
    
    static {
	aBoolean3392 = false;
	aClass124_3394
	    = Class14_Sub2_Sub2.method263(1178,
					  " from your friend list first)3");
	aClass124_3409 = aClass124_3394;
	aBoolean3397 = true;
	aClass124_3412 = Class14_Sub2_Sub2.method263(1178, "null");
    }
}
