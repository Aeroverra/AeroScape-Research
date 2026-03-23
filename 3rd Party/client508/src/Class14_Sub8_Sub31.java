/* Class14_Sub8_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub31 extends Class14_Sub8
{
    public static int anInt4600;
    public static int anInt4601;
    public static volatile int anInt4602;
    public static Class9_Sub1 aClass9_Sub1_4603;
    public static int anInt4604;
    public static String aString4605;
    public static int anInt4606;
    public static Class124 aClass124_4607
	= Class14_Sub2_Sub2.method263(1178, "Hidden)2use");
    public static int anInt4608 = 0;
    public static int anInt4609;
    public static int anInt4610;
    
    public static void method644(int arg0, byte arg1) {
	try {
	    anInt4609++;
	    Class14_Sub1 class14_sub1
		= ((Class14_Sub1)
		   Class14_Sub8_Sub5.aClass55_4155.method1228((byte) -115));
	    if (arg1 <= 24)
		method647(-118, -4, -122, -121, null, 59);
	    for (/**/; null != class14_sub1;
		 class14_sub1 = (Class14_Sub1) Class14_Sub8_Sub5
						   .aClass55_4155
						   .method1227((byte) -23)) {
		if ((class14_sub1.aLong355 >> -1250315344 & 0xffffL
		     ^ 0xffffffffffffffffL)
		    == ((long) arg0 ^ 0xffffffffffffffffL))
		    class14_sub1.method233(0);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rb.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method645(byte arg0, int arg1, int arg2) {
	try {
	    if (arg0 > -9)
		anInt4602 = 17;
	    Class14_Sub2_Sub13 class14_sub2_sub13
		= Class14_Sub8_Sub28.method626(-121, arg1, 1);
	    anInt4604++;
	    class14_sub2_sub13.method326(false);
	    class14_sub2_sub13.anInt3920 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rb.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method646(boolean arg0) {
	try {
	    aClass124_4607 = null;
	    aClass9_Sub1_4603 = null;
	    aString4605 = null;
	    if (arg0 != true)
		method645((byte) 36, 112, 118);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rb.J(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub31() {
	super(1, true);
    }
    
    public static int method647(int arg0, int arg1, int arg2, int arg3,
				int[][] arg4, int arg5) {
    while_468_:
	do {
	    do {
		int i;
		try {
		    anInt4600++;
		    if (arg1 == -501955161)
			break;
		    i = 114;
		} catch (RuntimeException runtimeexception) {
		    break while_468_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_0_ = ((arg2 * arg4[arg5 + 1][arg0]
			     + (128 + -arg2) * arg4[arg5][arg0])
			    >> -1008343769);
		int i_1_ = ((arg2 * arg4[arg5 - -1][1 + arg0]
			     + arg4[arg5][1 + arg0] * (128 + -arg2))
			    >> -501955161);
		i = i_1_ * arg3 + i_0_ * (128 - arg3) >> -1870168633;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("rb.D(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ','
					    + (arg4 != null ? "{...}" : "null")
					    + ',' + arg5 + ')'));
    }
    
    public int[] method484(int arg0, byte arg1) {
    while_469_:
	do {
	    do {
		int[] is;
		try {
		    if (arg1 < -58)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_469_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		anInt4610++;
		int[] is_2_ = aClass149_2851.method2014(arg0, (byte) 103);
		if (aClass149_2851.aBoolean2402) {
		    int[][] is_3_ = method480(0, 0, arg0);
		    int[] is_4_ = is_3_[0];
		    int[] is_5_ = is_3_[1];
		    int[] is_6_ = is_3_[2];
		    for (int i = 0;
			 (Class112.anInt1876 ^ 0xffffffff) < (i ^ 0xffffffff);
			 i++)
			is_2_[i] = (is_6_[i] + (is_4_[i] + is_5_[i])) / 3;
		}
		is = is_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "rb.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method648(byte arg0) {
	do {
	    try {
		int i = 52 % ((-23 - arg0) / 47);
		anInt4606++;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    for (;;) {
		Class2 class2 = Class14_Sub8_Sub19.aClass2_4404;
		Class14_Sub19 class14_sub19;
		synchronized (class2) {
		    class14_sub19
			= (Class14_Sub19) Class2.aClass2_99.method78(128);
		}
		if (class14_sub19 == null)
		    return;
		try {
		    class14_sub19.aClass9_Sub1_3076.method182
			(class14_sub19.aClass114_3077,
			 (int) class14_sub19.aLong355,
			 class14_sub19.aByteArray3069, false, (byte) 55);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "rb.G(" + arg0 + ')');
    }
    
    public static Class4 method649(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	Class4 class4 = class14_sub29.aClass4_3237;
	class14_sub29.aClass4_3237 = null;
	return class4;
    }
    
    static {
	anInt4601 = 0;
	anInt4602 = 0;
    }
}
