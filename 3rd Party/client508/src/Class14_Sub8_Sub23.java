/* Class14_Sub8_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub23 extends Class14_Sub8
{
    public static int anInt4467;
    public static int anInt4468;
    public static int anInt4469;
    public static int anInt4470;
    public static int anInt4471;
    public static int anInt4472;
    public static Class148[] aClass148Array4473;
    public static Class133_Sub1_Sub1[] aClass133_Sub1_Sub1Array4474;
    public static int anInt4475 = 0;
    public static int anInt4476;
    public static Class2 aClass2_4477;
    public static int anInt4478;
    public int anInt4479 = 4096;
    public static int anInt4480;
    public static Class124 aClass124_4481;
    public static Class124 aClass124_4482;
    
    public static void method600(int arg0) {
	try {
	    aClass133_Sub1_Sub1Array4474 = null;
	    aClass124_4482 = null;
	    aClass124_4481 = null;
	    if (arg0 != 1)
		method601(-75, null);
	    aClass148Array4473 = null;
	    aClass2_4477 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lh.B(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub23(int arg0) {
	super(0, true);
	try {
	    anInt4479 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lh.<init>(" + arg0 + ')');
	}
    }
    
    public static void method601(int arg0, Class14_Sub10 arg1) {
    while_424_:
	do {
	while_423_:
	    do {
		do {
		    try {
			if (arg0 < -7)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_423_;
		    }
		    return;
		} while (false);
		try {
		    anInt4467++;
		    while ((arg1.aByteArray2895.length ^ 0xffffffff)
			   < (arg1.anInt2908 ^ 0xffffffff)) {
			boolean bool = false;
			int i = 0;
			int i_0_ = 0;
			if (1 == arg1.method798(70)) {
			    bool = true;
			    i = arg1.method798(-60);
			    i_0_ = arg1.method798(-60);
			}
			int i_1_ = arg1.method798(-126);
			int i_2_ = arg1.method798(-81);
			int i_3_ = (Class35.anInt603 - 64 * i_2_
				    + (Class14_Sub8_Sub15.anInt4332 + -1));
			int i_4_ = -Class65.anInt1034 + 64 * i_1_;
			if (-1 < (i_4_ ^ 0xffffffff)
			    || (-63 + i_3_ ^ 0xffffffff) > -1
			    || ((Class14_Sub2_Sub9.anInt3856 ^ 0xffffffff)
				>= (63 + i_4_ ^ 0xffffffff))
			    || Class14_Sub8_Sub15.anInt4332 <= i_3_) {
			    for (int i_5_ = 0; (!bool ? 4096 : 64) > i_5_;
				 i_5_++) {
				int i_6_ = arg1.method798(96);
				if (-1 != (i_6_ ^ 0xffffffff)) {
				    if (-2 == (0x1 & i_6_ ^ 0xffffffff))
					arg1.anInt2908++;
				    if ((i_6_ & 0x2 ^ 0xffffffff) == -3)
					arg1.anInt2908 += 2;
				    if ((i_6_ & 0x4 ^ 0xffffffff) == -5)
					arg1.anInt2908 += 3;
				}
			    }
			} else {
			    int i_7_ = i_4_ >> -2136032090;
			    int i_8_ = i_3_ >> -917682362;
			    for (int i_9_ = 0; i_9_ < 64; i_9_++) {
				for (int i_10_ = 0; 64 > i_10_; i_10_++) {
				    if (!bool
					|| (8 * i <= i_9_ && i_9_ < 8 + i * 8
					    && ((i_10_ ^ 0xffffffff)
						<= (8 * i_0_ ^ 0xffffffff))
					    && i_10_ < 8 * i_0_ + 8)) {
					int i_11_ = arg1.method798(123);
					if (i_11_ != 0) {
					    if ((i_11_ & 0x1) == 1) {
						int i_12_ = arg1.method798(80);
						if ((Class14_Sub2_Sub9
						     .aByteArrayArrayArray3864
						     [i_7_][i_8_])
						    == null)
						    Class14_Sub2_Sub9
							.aByteArrayArrayArray3864
							[i_7_][i_8_]
							= new byte[4096];
						Class14_Sub2_Sub9
						    .aByteArrayArrayArray3864
						    [i_7_][i_8_]
						    [i_9_ + (-i_10_ + 63
							     << 1380386022)]
						    = (byte) i_12_;
					    }
					    if (2 == (0x2 & i_11_)) {
						int i_13_ = (arg1.method784
							     ((byte) 101));
						if (null
						    == (Class79
							.aShortArrayArrayArray1247
							[i_7_][i_8_]))
						    Class79
							.aShortArrayArrayArray1247
							[i_7_][i_8_]
							= new short[4096];
						Class79
						    .aShortArrayArrayArray1247
						    [i_7_][i_8_]
						    [i_9_ + (-i_10_ + 63
							     << 1859398438)]
						    = (short) i_13_;
					    }
					    if (4 == (i_11_ & 0x4)) {
						int i_14_
						    = ((0xff0000
							& (arg1.method798(66)
							   << 44440176))
						       + ((0xff
							   & (arg1.method798
							      (116)))
							  << -303242200)
						       - -(arg1.method798(-23)
							   & 0xff));
						if ((Class14_Sub25
						     .anIntArrayArrayArray3174
						     [i_7_][i_8_])
						    == null)
						    Class14_Sub25
							.anIntArrayArrayArray3174
							[i_7_][i_8_]
							= new int[4096];
						Class79 class79
						    = (Class79.method1377
						       ((byte) -106, --i_14_));
						if (class79.anIntArray1276
						    != null) {
						    class79
							= class79
							      .method1391(1);
						    if (class79 == null
							|| (class79.anInt1262
							    == -1))
							continue;
						}
						Class14_Sub25
						    .anIntArrayArrayArray3174
						    [i_7_][i_8_]
						    [(-i_10_ + 63
						      << -631316858) - -i_9_]
						    = class79.anInt1257 - -1;
						Class14_Sub20 class14_sub20
						    = new Class14_Sub20();
						class14_sub20.anInt3085
						    = class79.anInt1262;
						class14_sub20.anInt3083 = i_4_;
						class14_sub20.anInt3084 = i_3_;
						Class35.aClass2_589.method80
						    (class14_sub20,
						     (byte) -118);
					    }
					}
				    }
				}
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_424_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("lh.G(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method602(int arg0) {
	try {
	    anInt4470++;
	    int i = Class14_Sub2_Sub8.method296((byte) 44);
	    if (arg0 != (i ^ 0xffffffff)) {
		if (-2 != (i ^ 0xffffffff)) {
		    Class14_Sub2_Sub14.method333((byte) (-4 + Class42.anInt699
							 & 0xff),
						 (byte) -109);
		    Class14_Sub8_Sub4.method499(false, 2);
		} else {
		    Class14_Sub2_Sub14.method333((byte) 0, (byte) -79);
		    Class14_Sub8_Sub4.method499(false, 512);
		    Class14_Sub8_Sub26.method618(1);
		}
	    } else {
		Class28.aByteArrayArrayArray512 = null;
		Class14_Sub8_Sub4.method499(false, 0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "lh.H(" + arg0 + ')');
	}
    }
    
    public static void method603(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	try {
	    int i = -119 % ((arg7 - -73) / 52);
	    for (int i_15_ = 0;
		 ((i_15_ ^ 0xffffffff)
		  > (Class152.aClass146_2435.anInt2353 ^ 0xffffffff));
		 i_15_++) {
		int i_16_ = (Class35.anInt603
			     - (Class152.aClass146_2435.aShortArray2361[i_15_]
				- (Class14_Sub8_Sub15.anInt4332 - 1)));
		int i_17_ = (Class152.aClass146_2435.aShortArray2354[i_15_]
			     + -Class65.anInt1034);
		int i_18_ = arg1 - -((arg5 - arg1) * (-arg3 + i_16_)
				     / (-arg3 + arg8));
		int i_19_
		    = (-arg2 + i_17_) * (arg6 - arg0) / (arg4 + -arg2) + arg0;
		int i_20_ = Class152.aClass146_2435.method1994(i_15_, false);
		int i_21_ = 16777215;
		Class87 class87 = null;
		if (0 == i_20_) {
		    if (3.0 == (double) Class90.aFloat1426)
			class87 = Class14_Sub17.aClass87_3004;
		    if (4.0 == (double) Class90.aFloat1426)
			class87 = Class48.aClass87_805;
		    if (6.0 == (double) Class90.aFloat1426)
			class87 = Class54.aClass87_888;
		    if (8.0 == (double) Class90.aFloat1426)
			class87 = Class52.aClass87_858;
		}
		if (1 == i_20_) {
		    if (3.0 == (double) Class90.aFloat1426)
			class87 = Class54.aClass87_888;
		    if ((double) Class90.aFloat1426 == 4.0)
			class87 = Class52.aClass87_858;
		    if ((double) Class90.aFloat1426 == 6.0)
			class87 = Class14_Sub8_Sub35.aClass87_4672;
		    if ((double) Class90.aFloat1426 == 8.0)
			class87 = Class141.aClass87_2242;
		}
		if (i_20_ == 2) {
		    if ((double) Class90.aFloat1426 == 3.0)
			class87 = Class14_Sub8_Sub35.aClass87_4672;
		    i_21_ = 16755200;
		    if ((double) Class90.aFloat1426 == 4.0)
			class87 = Class141.aClass87_2242;
		    if ((double) Class90.aFloat1426 == 6.0)
			class87 = Class48.aClass87_803;
		    if ((double) Class90.aFloat1426 == 8.0)
			class87 = Class132.aClass87_2171;
		}
		if (0 != (Class152.aClass146_2435.anIntArray2350[i_15_]
			  ^ 0xffffffff))
		    i_21_ = Class152.aClass146_2435.anIntArray2350[i_15_];
		if (class87 != null) {
		    Class124[] class124s
			= (new Class124
			   [Class152.aClass146_2435.aClass124Array2362
				[i_15_].method1670(false, 60) - -1]);
		    Class56_Sub1.aClass14_Sub2_Sub16_3320.method351
			(Class152.aClass146_2435.aClass124Array2362[i_15_],
			 null, class124s);
		    int i_22_ = class124s.length;
		    i_18_ -= (-1 + i_22_) * class87.method1432() / 2;
		    i_18_ += class87.method1425() / 2;
		    for (int i_23_ = 0;
			 (i_22_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff);
			 i_23_++) {
			Class124 class124
			    = (-1 + i_22_ == i_23_ ? class124s[i_23_]
			       : (class124s[i_23_].method1697
				  (0, class124s[i_23_].method1693(0) - 4,
				   (byte) -104)));
			class87.method1429(class124, i_19_, i_18_, i_21_,
					   true);
			i_18_ += class87.method1432();
		    }
		}
	    }
	    anInt4469++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lh.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	}
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    anInt4471++;
	    if (arg1 != 24777)
		anInt4480 = -14;
	    int i = arg0;
	    if (-1 == (i ^ 0xffffffff))
		anInt4479
		    = (arg2.method798(arg1 + -24859) << -915163700) / 255;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lh.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method604(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	try {
	    Class14_Sub25 class14_sub25
		= ((Class14_Sub25)
		   Class132.aClass55_2167.method1230((long) arg2,
						     (byte) -104));
	    if (class14_sub25 == null) {
		class14_sub25 = new Class14_Sub25();
		Class132.aClass55_2167.method1224(8, (long) arg2,
						  class14_sub25);
	    }
	    anInt4472++;
	    if ((class14_sub25.anIntArray3178.length ^ 0xffffffff)
		>= (arg0 ^ 0xffffffff)) {
		int[] is = new int[1 + arg0];
		int[] is_24_ = new int[arg0 + 1];
		for (int i = 0;
		     ((i ^ 0xffffffff)
		      > (class14_sub25.anIntArray3178.length ^ 0xffffffff));
		     i++) {
		    is[i] = class14_sub25.anIntArray3178[i];
		    is_24_[i] = class14_sub25.anIntArray3177[i];
		}
		for (int i = class14_sub25.anIntArray3178.length;
		     (arg0 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		    is[i] = -1;
		    is_24_[i] = 0;
		}
		class14_sub25.anIntArray3177 = is_24_;
		class14_sub25.anIntArray3178 = is;
	    }
	    class14_sub25.anIntArray3178[arg0] = arg1;
	    class14_sub25.anIntArray3177[arg0] = arg3;
	    int i = -44 / ((65 - arg4) / 51);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lh.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public Class14_Sub8_Sub23() {
	this(4096);
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4468++;
	    if (arg1 > -58)
		anInt4479 = -34;
	    int[] is_25_ = aClass149_2851.method2014(arg0, (byte) 115);
	    if (aClass149_2851.aBoolean2402)
		Class72.method1324(is_25_, 0, Class112.anInt1876, anInt4479);
	    is = is_25_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("lh.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    static {
	aClass133_Sub1_Sub1Array4474 = new Class133_Sub1_Sub1[2048];
	anInt4478 = 1;
	aClass2_4477 = new Class2();
	aClass124_4481 = Class14_Sub2_Sub2.method263(1178, "www)2wtrc");
	aClass124_4482
	    = Class14_Sub2_Sub2.method263(1178, "Eingabeprozedur geladen)3");
    }
}
