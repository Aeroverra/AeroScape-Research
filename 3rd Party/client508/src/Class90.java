/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class90 implements Runnable
{
    public static boolean aBoolean1417 = false;
    public static int anInt1418;
    public volatile boolean aBoolean1419;
    public static int anInt1420;
    public Class43 aClass43_1421;
    public volatile Class75[] aClass75Array1422 = new Class75[2];
    public static int anInt1423;
    public static Class124 aClass124_1424
	= Class14_Sub2_Sub2.method263(1178, "showVideoAd");
    public static Class124 aClass124_1425
	= Class14_Sub2_Sub2.method263(1178, "::gc");
    public static float aFloat1426;
    public static int anInt1427;
    public volatile boolean aBoolean1428 = false;
    
    public static void method1443(int arg0) {
	try {
	    anInt1420++;
	    Class14_Sub8_Sub9.aClass52_4240.method1209((byte) -96);
	    if (arg0 != 2)
		method1445(95);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ob.A(" + arg0 + ')');
	}
    }
    
    public static void method1444(int arg0, int arg1, int arg2, int arg3,
				  Class133 arg4, Class133 arg5, int arg6,
				  int arg7, long arg8) {
	if (arg4 != null || arg5 != null) {
	    Class113 class113 = new Class113();
	    class113.aLong1887 = arg8;
	    class113.anInt1878 = arg1 * 128 + 64;
	    class113.anInt1886 = arg2 * 128 + 64;
	    class113.anInt1882 = arg3;
	    class113.aClass133_1877 = arg4;
	    class113.aClass133_1884 = arg5;
	    class113.anInt1880 = arg6;
	    class113.anInt1888 = arg7;
	    for (int i = arg0; i >= 0; i--) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg1]
		     [arg2])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[arg1][arg2]
			= new Class14_Sub29(i, arg1, arg2);
	    }
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass113_3250
		= class113;
	}
    }
    
    public static void method1445(int arg0) {
	try {
	    aClass124_1425 = null;
	    if (arg0 != -104)
		method1446(96, null, -82, 36);
	    aClass124_1424 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ob.D(" + arg0 + ')');
	}
    }
    
    public void run() {
    while_0_:
	do {
	    try {
		anInt1423++;
		aBoolean1419 = true;
		try {
		    try {
			while (!aBoolean1428) {
			    for (int i = 0; 2 > i; i++) {
				Class75 class75 = aClass75Array1422[i];
				if (class75 != null)
				    class75.method1341(-82);
			    }
			    Class14_Sub13.method864(10L, (byte) 64);
			    Class14_Sub8_Sub14.method555(45, aClass43_1421,
							 null);
			}
		    } catch (Exception exception) {
			do {
			    try {
				Throwable throwable = new Throwable();
				Class14_Sub9_Sub3.method738(null, throwable,
							    95);
			    } catch (Throwable throwable) {
				break;
			    }
			    aBoolean1419 = false;
			    break while_0_;
			} while (false);
			RuntimeException runtimeexception = new RuntimeException();
			aBoolean1419 = false;
			throw runtimeexception;
		    }
		} catch (Throwable throwable) {
		    /* empty */
		}
		aBoolean1419 = false;
	    } catch (RuntimeException runtimeexception) {
		throw Class14_Sub8_Sub14.method554(runtimeexception,
						   "ob.run()");
	    }
	} while (false);
    }
    
    public static Class14_Sub2_Sub19_Sub1[] method1446(int arg0, Class9 arg1,
						       int arg2, int arg3) {
	try {
    while_1_:
	do {
	Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s_1_;
	    do {
		Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s_0_;
		try {
		    anInt1418++;
		    if (Class109.method1564(-2, arg3, arg0, arg1))
			break;
		    class14_sub2_sub19_sub1s_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1_;
		}
		return class14_sub2_sub19_sub1s_0_;
	    } while (false);
	    try {
		if (arg2 < 42)
		    aFloat1426 = -0.05313204F;
		class14_sub2_sub19_sub1s_1_ = Class14_Sub17.method878((byte) -108);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19_sub1s_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ob.C(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ')'));
	}
	return null;
    }
    
    public static void method1447(int arg0, Class32[] arg1, boolean arg2,
				  byte[] arg3, int arg4, int arg5) {
    while_3_:
	do {
	try {
	while_2_:
	    do {
		Class14_Sub10 class14_sub10;
		do {
		    try {
			anInt1427++;
			class14_sub10 = new Class14_Sub10(arg3);
			if (arg5 == -23935)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_2_;
		    }
		    return;
		} while (false);
		try {
		    int i = -1;
		    for (;;) {
			int i_0_ = class14_sub10.method802(-73);
			if (0 == i_0_)
			    break;
			int i_1_ = 0;
			i += i_0_;
			for (;;) {
			    int i_2_ = class14_sub10.method818((byte) 108);
			    if (0 == i_2_)
				break;
			    i_1_ += -1 + i_2_;
			    int i_3_ = i_1_ & 0x3f;
			    int i_4_ = i_1_ >> -589063668;
			    int i_5_ = (0xfe8 & i_1_) >> 355240902;
			    int i_6_ = class14_sub10.method798(60);
			    int i_7_ = arg4 + i_5_;
			    int i_8_ = 0x3 & i_6_;
			    int i_9_ = arg0 + i_3_;
			    int i_10_ = i_6_ >> 1713143586;
			    if ((i_7_ ^ 0xffffffff) < -1
				&& (i_9_ ^ 0xffffffff) < -1
				&& (i_7_ ^ 0xffffffff) > -104 && 103 > i_9_) {
				Class32 class32 = null;
				if (!arg2) {
				    int i_11_ = i_4_;
				    if (-3 == (0x2 & (Class14_Sub8_Sub4
						      .aByteArrayArrayArray4142
						      [1][i_7_][i_9_])
					       ^ 0xffffffff))
					i_11_--;
				    if (-1 >= (i_11_ ^ 0xffffffff))
					class32 = arg1[i_11_];
				}
				Class55.method1235(arg2, i_8_, !arg2,
						   (byte) 50, class32, i_4_,
						   i_9_, i_10_, i_7_, i, i_4_);
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_3_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ob.E(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5
						+ ')'));
		}
	} while (false);
    }
    
    public Class90() {
	aBoolean1419 = false;
    }
}