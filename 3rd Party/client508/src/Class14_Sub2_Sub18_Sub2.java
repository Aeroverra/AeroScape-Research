/* Class14_Sub2_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class14_Sub2_Sub18_Sub2 extends Class14_Sub2_Sub18
{
    public static int anInt5072;
    public static Class20 aClass20_5073;
    public static int anInt5074;
    public static int anInt5075;
    public static int anInt5076;
    public Object anObject5077;
    public static int anInt5078;
    public static Class124 aClass124_5079
	= Class14_Sub2_Sub2.method263(1178, "n");
    public static int anInt5080;
    public static Class20 aClass20_5081;
    public static int[] anIntArray5082;
    public static Class124 aClass124_5083;
    public static Class124 aClass124_5084;
    public static Class9_Sub1 aClass9_Sub1_5085;
    public static BigInteger aBigInteger5086;
    public static int anInt5087;
    
    public static void method383(int arg0) {
	try {
	    aBigInteger5086 = null;
	    aClass124_5084 = null;
	    aClass124_5083 = null;
	    aClass124_5079 = null;
	    aClass20_5081 = null;
	    anIntArray5082 = null;
	    if (arg0 != 2)
		method385((byte) 121, null);
	    aClass20_5073 = null;
	    aClass9_Sub1_5085 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mg.E(" + arg0 + ')');
	}
    }
    
    public static void method384(boolean arg0, int arg1) {
	try {
	    anInt5080++;
	    int i = 0;
	    if (arg1 != 10312)
		anInt5087 = 12;
	    for (/**/; ((Class14_Sub8_Sub13.anInt4306 ^ 0xffffffff)
			< (i ^ 0xffffffff)); i++) {
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = (Class14_Sub4.aClass133_Sub1_Sub2Array2785
		       [Class14_Sub2_Sub15.anIntArray3965[i]]);
		long l = (0x20000000L
			  | ((long) Class14_Sub2_Sub15.anIntArray3965[i]
			     << -1999661344));
		if (class133_sub1_sub2 != null
		    && class133_sub1_sub2.method1804((byte) 115)
		    && class133_sub1_sub2.aClass12_4949.aBoolean307 == arg0
		    && class133_sub1_sub2.aClass12_4949.method219(-1)) {
		    int i_0_ = class133_sub1_sub2.anInt3495 >> -81102041;
		    int i_1_ = class133_sub1_sub2.anInt3436 >> 288135591;
		    if (0 <= i_0_ && i_0_ < 104 && (i_1_ ^ 0xffffffff) <= -1
			&& 104 > i_1_) {
			if (1 == class133_sub1_sub2.anInt3493
			    && (0x7f & class133_sub1_sub2.anInt3495
				^ 0xffffffff) == -65
			    && (0x7f & class133_sub1_sub2.anInt3436) == 64) {
			    if (((Class14_Sub2_Sub8.anIntArrayArray3846[i_0_]
				  [i_1_])
				 ^ 0xffffffff)
				== (Class42.anInt699 ^ 0xffffffff))
				continue;
			    Class14_Sub2_Sub8.anIntArrayArray3846[i_0_][i_1_]
				= Class42.anInt699;
			}
			if (!class133_sub1_sub2.aClass12_4949.aBoolean308)
			    l |= ~0x7fffffffffffffffL;
			class133_sub1_sub2.anInt3500
			    = Class26.method1017(class133_sub1_sub2.anInt3495,
						 Class14_Sub2_Sub3.anInt3785,
						 (byte) -127,
						 class133_sub1_sub2.anInt3436);
			Class14_Sub8_Sub8.method519
			    (Class14_Sub2_Sub3.anInt3785,
			     class133_sub1_sub2.anInt3495,
			     class133_sub1_sub2.anInt3436,
			     class133_sub1_sub2.anInt3500,
			     64 * (-1 + class133_sub1_sub2.anInt3493) - -60,
			     class133_sub1_sub2, class133_sub1_sub2.anInt3461,
			     l, class133_sub1_sub2.aBoolean3488);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("mg.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method385(byte arg0, Class9 arg1) {
    while_220_:
	do {
	while_219_:
	    do {
		do {
		    try {
			anInt5076++;
			if (!Class14_Sub2_Sub5.aBoolean3803)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_219_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg0 == 67)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_219_;
		    }
		    return;
		} while (false);
		try {
		    Class25.method995();
		    Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826
			= Class7.method117(arg1, Class14_Sub8_Sub25.anInt4509,
					   (byte) -100);
		    int i = Class14_Sub20.anInt3094;
		    int i_2_ = i * 956 / 503;
		    Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389
			((-i_2_ + Class83.anInt1340) / 2, 0, i_2_, i);
		    Class133_Sub1_Sub1.aClass148_4915
			= Class14_Sub8_Sub27.method622((Class14_Sub8_Sub30
							.anInt4594),
						       arg0 + -67, arg1);
		    Class133_Sub1_Sub1.aClass148_4915.method2001
			((Class83.anInt1340 / 2
			  + -(Class133_Sub1_Sub1.aClass148_4915.anInt2371
			      / 2)),
			 18);
		    Class14_Sub2_Sub5.aBoolean3803 = true;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_220_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("mg.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Object method377(boolean arg0) {
	Object object;
	try {
	    if (arg0 != true)
		method385((byte) 113, null);
	    anInt5078++;
	    object = anObject5077;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mg.D(" + arg0 + ')');
	}
	return object;
    }
    
    public static void method386(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	try {
	    anInt5072++;
	    if ((arg2 ^ 0xffffffff) > (Class118.anInt1982 ^ 0xffffffff)
		|| Class14_Sub8_Sub14.anInt4327 < arg1
		|| arg6 < Class14_Sub17.anInt3005
		|| (arg0 ^ 0xffffffff) < (Class59.anInt955 ^ 0xffffffff))
		Class14_Sub8_Sub9.method522(arg6, arg5, arg2, arg4, arg0, 0,
					    arg1, arg3);
	    else
		Class142.method1980(arg4, arg6, arg2, arg1, arg5, arg0, 41,
				    arg3);
	    if (arg7 != -25230)
		method383(-108);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("mg.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ')'));
	}
    }
    
    public static Class124 method387(long arg0, boolean arg1) {
    while_221_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt5075++;
		    if (arg1 == true)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_221_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class58.method1256(-111, false, arg0, 10);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "mg.F(" + arg0 + ',' + arg1 + ')');
    }
    
    public boolean method379(byte arg0) {
    while_222_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 < -68)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_222_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		anInt5074++;
		bool = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "mg.G(" + arg0 + ')');
    }
    
    public Class14_Sub2_Sub18_Sub2(Object arg0) {
	try {
	    anObject5077 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("mg.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass20_5073 = new Class20(16);
	aClass20_5081 = new Class20(64);
	aClass124_5084 = Class14_Sub2_Sub2.method263(1178, "<)4col>");
	aClass124_5083 = Class14_Sub2_Sub2.method263(1178, "settings");
	aBigInteger5086
	    = (new BigInteger
	       ("111425062890301051365206642964372080941130087045221691750738418203817739415579"));
    }
}
