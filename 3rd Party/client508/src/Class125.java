/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class125
{
    public static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_2071;
    public static int anInt2072;
    public static int anInt2073;
    public static int anInt2074;
    public static Class52 aClass52_2075;
    public static short aShort2076 = 1;
    public static Class124 aClass124_2077;
    public static int anInt2078;
    public int anInt2079;
    public static Class124 aClass124_2080;
    public static int[] anIntArray2081 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
    public static Class124 aClass124_2082;
    public int anInt2083;
    public static Class124 aClass124_2084
	= Class14_Sub2_Sub2.method263(1178, "scape main");
    public static int anInt2085;
    public int anInt2086;
    
    public abstract void method1721(boolean bool, int i, int i_0_);
    
    public static void method1722(Class133_Sub1 arg0, byte arg1) {
    while_1120_:
	do {
	while_1119_:
	    do {
		do {
		    try {
			arg0.aBoolean3488 = false;
			anInt2072++;
			if (-1 != arg0.anInt3452) {
			    Class46 class46
				= Class41.method1129(arg0.anInt3452, 68);
			    if (class46 != null
				&& class46.anIntArray768 != null) {
				arg0.anInt3431++;
				if (((class46.anIntArray768.length
				      ^ 0xffffffff)
				     < (arg0.anInt3483 ^ 0xffffffff))
				    && arg0.anInt3431 > (class46.anIntArray763
							 [arg0.anInt3483])) {
				    arg0.anInt3431 = 1;
				    arg0.anInt3483++;
				    Class14_Sub8_Sub6.method509
					(arg0.anInt3495, arg0.anInt3483, -123,
					 (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  == arg0),
					 class46, arg0.anInt3436);
				}
				if (class46.anIntArray768.length
				    <= arg0.anInt3483) {
				    arg0.anInt3483 = 0;
				    arg0.anInt3431 = 0;
				    Class14_Sub8_Sub6.method509
					(arg0.anInt3495, arg0.anInt3483, -102,
					 (Class14_Sub3.aClass133_Sub1_Sub1_2748
					  == arg0),
					 class46, arg0.anInt3436);
				}
			    } else
				arg0.anInt3452 = -1;
			}
			if (arg1 >= -82)
			    aClass124_2080 = null;
			if (arg0.anInt3487 != -1
			    && (Class14_Sub2_Sub20.anInt4064
				>= arg0.anInt3485)) {
			    if ((arg0.anInt3470 ^ 0xffffffff) > -1)
				arg0.anInt3470 = 0;
			    int i = (Class127.method1749
				     (arg0.anInt3487, (byte) 38).anInt966);
			    if (-1 == i)
				arg0.anInt3487 = -1;
			    else {
				Class46 class46 = Class41.method1129(i, -119);
				if (class46 != null
				    && class46.anIntArray768 != null) {
				    arg0.anInt3459++;
				    if ((arg0.anInt3470
					 < class46.anIntArray768.length)
					&& (arg0.anInt3459
					    > (class46.anIntArray763
					       [arg0.anInt3470]))) {
					arg0.anInt3470++;
					arg0.anInt3459 = 1;
					Class14_Sub8_Sub6.method509
					    (arg0.anInt3495, arg0.anInt3470,
					     -102,
					     (arg0
					      == (Class14_Sub3
						  .aClass133_Sub1_Sub1_2748)),
					     class46, arg0.anInt3436);
				    }
				    if (class46.anIntArray768.length
					<= arg0.anInt3470)
					arg0.anInt3487 = -1;
				} else
				    arg0.anInt3487 = -1;
			    }
			}
			if (0 == (arg0.anInt3445 ^ 0xffffffff)
			    || -2 > (arg0.anInt3467 ^ 0xffffffff))
			    break;
			Class46 class46
			    = Class41.method1129(arg0.anInt3445, -12);
			if (-2 != (class46.anInt758 ^ 0xffffffff)
			    || 0 >= arg0.anInt3477
			    || ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
				> (arg0.anInt3494 ^ 0xffffffff))
			    || Class14_Sub2_Sub20.anInt4064 <= arg0.anInt3455)
			    break;
			arg0.anInt3467 = 1;
		    } catch (RuntimeException runtimeexception) {
			break while_1119_;
		    }
		    return;
		} while (false);
		try {
		    if (0 != (arg0.anInt3445 ^ 0xffffffff)
			&& (arg0.anInt3467 ^ 0xffffffff) == -1) {
			Class46 class46
			    = Class41.method1129(arg0.anInt3445, 32);
			if (class46 != null && class46.anIntArray768 != null) {
			    arg0.anInt3458++;
			    if (arg0.anInt3501 < class46.anIntArray768.length
				&& (class46.anIntArray763[arg0.anInt3501]
				    < arg0.anInt3458)) {
				arg0.anInt3501++;
				arg0.anInt3458 = 1;
				Class14_Sub8_Sub6.method509
				    (arg0.anInt3495, arg0.anInt3501, -111,
				     (Class14_Sub3.aClass133_Sub1_Sub1_2748
				      == arg0),
				     class46, arg0.anInt3436);
			    }
			    if ((arg0.anInt3501 ^ 0xffffffff)
				<= (class46.anIntArray768.length
				    ^ 0xffffffff)) {
				arg0.anInt3501 -= class46.anInt760;
				arg0.anInt3482++;
				if ((arg0.anInt3482 ^ 0xffffffff)
				    <= (class46.anInt770 ^ 0xffffffff))
				    arg0.anInt3445 = -1;
				else if (-1 < (arg0.anInt3501 ^ 0xffffffff)
					 || (arg0.anInt3501
					     >= class46.anIntArray768.length))
				    arg0.anInt3445 = -1;
				else
				    Class14_Sub8_Sub6.method509
					(arg0.anInt3495, arg0.anInt3501, -125,
					 arg0 == (Class14_Sub3
						  .aClass133_Sub1_Sub1_2748),
					 class46, arg0.anInt3436);
			    }
			    arg0.aBoolean3488 = class46.aBoolean757;
			} else
			    arg0.anInt3445 = -1;
		    }
		    if ((arg0.anInt3467 ^ 0xffffffff) < -1)
			arg0.anInt3467--;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1120_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("t.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	} while (false);
    }
    
    public static void method1723(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	try {
	    if (-1 >= (arg0 ^ 0xffffffff) && -1 >= (arg3 ^ 0xffffffff)
		&& -104 < (arg0 ^ 0xffffffff) && 103 > arg3) {
		if (arg1 == 0) {
		    Class113 class113
			= Class14_Sub4.method458(arg2, arg0, arg3);
		    if (null != class113) {
			int i = ((int) (class113.aLong1887 >>> 2094404704)
				 & 0x7fffffff);
			if (-3 != (arg7 ^ 0xffffffff))
			    class113.aClass133_1877
				= new Class133_Sub4(i, arg7, arg5, arg2, arg0,
						    arg3, arg6, false,
						    class113.aClass133_1877);
			else {
			    class113.aClass133_1877
				= new Class133_Sub4(i, 2, 4 + arg5, arg2, arg0,
						    arg3, arg6, false,
						    class113.aClass133_1877);
			    class113.aClass133_1884
				= new Class133_Sub4(i, 2, 0x3 & 1 + arg5, arg2,
						    arg0, arg3, arg6, false,
						    class113.aClass133_1884);
			}
		    }
		}
		if (arg1 == 1) {
		    Class37 class37
			= Class14_Sub8_Sub4.method497(arg2, arg0, arg3);
		    if (class37 != null) {
			int i = (0x7fffffff
				 & (int) (class37.aLong634 >>> -1292647136));
			if (4 != arg7 && (arg7 ^ 0xffffffff) != -6) {
			    if (6 != arg7) {
				if (7 != arg7) {
				    if ((arg7 ^ 0xffffffff) == -9) {
					class37.aClass133_642
					    = (new Class133_Sub4
					       (i, 4, arg5 + 4, arg2, arg0,
						arg3, arg6, false,
						class37.aClass133_642));
					class37.aClass133_638
					    = (new Class133_Sub4
					       (i, 4, (arg5 - -2 & 0x3) + 4,
						arg2, arg0, arg3, arg6, false,
						class37.aClass133_638));
				    }
				} else
				    class37.aClass133_642
					= new Class133_Sub4(i, 4,
							    4 + (0x3
								 & arg5 - -2),
							    arg2, arg0, arg3,
							    arg6, false,
							    (class37
							     .aClass133_642));
			    } else
				class37.aClass133_642
				    = new Class133_Sub4(i, 4, 4 + arg5, arg2,
							arg0, arg3, arg6,
							false,
							class37.aClass133_642);
			} else
			    class37.aClass133_642
				= new Class133_Sub4(i, 4, arg5, arg2, arg0,
						    arg3, arg6, false,
						    class37.aClass133_642);
		    }
		}
		if (arg1 == 2) {
		    if (11 == arg7)
			arg7 = 10;
		    Class40 class40 = Class65.method1291(arg2, arg0, arg3);
		    if (class40 != null)
			class40.aClass133_679
			    = new Class133_Sub4(((int) (class40.aLong677
							>>> -1646603168)
						 & 0x7fffffff),
						arg7, arg5, arg2, arg0, arg3,
						arg6, false,
						class40.aClass133_679);
		}
		if (-4 == (arg1 ^ 0xffffffff)) {
		    Class4 class4 = Class47.method1180(arg2, arg0, arg3);
		    if (null != class4)
			class4.aClass133_124
			    = new Class133_Sub4(((int) (class4.aLong132
							>>> -428332448)
						 & 0x7fffffff),
						22, arg5, arg2, arg0, arg3,
						arg6, false,
						class4.aClass133_124);
		}
	    }
	    if (arg4 != -1292647136)
		method1723(-62, -93, 80, 56, 86, 113, 1, -67);
	    anInt2074++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("t.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
    }
    
    public abstract void method1724(int i, int i_1_, int i_2_);
    
    public static void method1725(int arg0, int arg1, int arg2, int arg3,
				  int arg4, byte arg5) {
	try {
	    int i = 70 % ((-8 - arg5) / 32);
	    Class33.anInt577 = arg4;
	    Class7.anInt177 = arg3;
	    anInt2078++;
	    Class117.anInt1948 = arg1;
	    Class14_Sub29.anInt3267 = arg2;
	    Class14_Sub2_Sub9.anInt3866 = arg0;
	    if ((Class7.anInt177 ^ 0xffffffff) <= -101) {
		int i_3_ = 128 * Class117.anInt1948 + 64;
		int i_4_ = Class33.anInt577 * 128 - -64;
		int i_5_
		    = (Class26.method1017(i_3_, Class14_Sub2_Sub3.anInt3785,
					  (byte) -18, i_4_)
		       - Class14_Sub2_Sub9.anInt3866);
		int i_6_ = -Class14_Sub10.anInt2926 + i_5_;
		int i_7_ = i_3_ + -Class14_Sub8_Sub38.anInt4741;
		int i_8_ = i_4_ - Class14_Sub30.anInt3271;
		int i_9_
		    = (int) Math.sqrt((double) (i_8_ * i_8_ + i_7_ * i_7_));
		Class7_Sub3_Sub1.anInt3719
		    = 0x7ff & (int) (Math.atan2((double) i_6_, (double) i_9_)
				     * 325.949);
		Class69.anInt1072
		    = 0x7ff & (int) (Math.atan2((double) i_7_, (double) i_8_)
				     * -325.949);
		if (128 > Class7_Sub3_Sub1.anInt3719)
		    Class7_Sub3_Sub1.anInt3719 = 128;
		if (Class7_Sub3_Sub1.anInt3719 > 383)
		    Class7_Sub3_Sub1.anInt3719 = 383;
	    }
	    Class89.anInt1415 = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("t.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public abstract void method1726(int i, int i_10_, int i_11_);
    
    public static void method1727(int arg0) {
	try {
	    aClass124_2080 = null;
	    aClass124_2084 = null;
	    anIntArray2081 = null;
	    aClass124_2077 = null;
	    aClass124_2082 = null;
	    aClass14_Sub9_Sub1_2071 = null;
	    if (arg0 != 10)
		anInt2073 = 98;
	    aClass52_2075 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "t.C(" + arg0 + ')');
	}
    }
    
    public Class125(int arg0, int arg1, int arg2) {
	try {
	    anInt2086 = arg2;
	    anInt2083 = arg1;
	    anInt2079 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("t.<init>(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    static {
	aClass124_2082 = null;
	aClass124_2080 = Class14_Sub2_Sub2.method263(1178, "Unable to find ");
	aClass124_2077 = aClass124_2080;
	aClass52_2075 = new Class52(50);
    }
}
