/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class17
{
    public static Class124 aClass124_398;
    public static Class124 aClass124_399
	= Class14_Sub2_Sub2.method263(1178, "Checking for updates )2 ");
    public static int[] anIntArray400;
    public static int anInt401;
    public static int[] anIntArray402;
    public static Class124 aClass124_403
	= Class14_Sub2_Sub2.method263(1178, "compass");
    public static int anInt404;
    public static Class124 aClass124_405;
    public static int anInt406;
    public static int anInt407;
    public static Class124 aClass124_408;
    public static int anInt409;
    public static long aLong410;
    
    public static void method956(boolean arg0) {
    while_631_:
	do {
	while_630_:
	    do {
		do {
		    try {
			Class141 class141 = Class14_Sub8_Sub9.aClass141_4239;
			synchronized (class141) {
			    Class86.anInt1385++;
			    Class14_Sub9_Sub3.anInt4850
				= Class14_Sub8_Sub21.anInt4436;
			    if (-1 >= (Class120.anInt2014 ^ 0xffffffff)) {
				while ((Class120.anInt2014 ^ 0xffffffff)
				       != (Class14_Sub8_Sub4.anInt4146
					   ^ 0xffffffff)) {
				    int i = (Class14_Sub8_Sub3.anIntArray4139
					     [Class14_Sub8_Sub4.anInt4146]);
				    Class14_Sub8_Sub4.anInt4146
					= (0x7f
					   & 1 + Class14_Sub8_Sub4.anInt4146);
				    if (i < 0)
					Class14_Sub8_Sub29
					    .aBooleanArray4581[i ^ 0xffffffff]
					    = false;
				    else
					Class14_Sub8_Sub29.aBooleanArray4581[i]
					    = true;
				}
			    } else {
				for (int i = 0; -113 < (i ^ 0xffffffff); i++)
				    Class14_Sub8_Sub29.aBooleanArray4581[i]
					= false;
				Class120.anInt2014
				    = Class14_Sub8_Sub4.anInt4146;
			    }
			    Class14_Sub8_Sub21.anInt4436
				= Class7_Sub3.anInt2682;
			}
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_630_;
		    }
		    return;
		} while (false);
		try {
		    anInt401++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_631_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "cb.C(" + arg0 + ')');
	} while (false);
    }
    
    public static void method957(byte arg0) {
	try {
	    for (int i = -1;
		 (i ^ 0xffffffff) > (Class14_Sub10.anInt2878 ^ 0xffffffff);
		 i++) {
		int i_0_;
		if (-1 == i)
		    i_0_ = 2047;
		else
		    i_0_ = Class14.anIntArray351[i];
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_];
		if (class133_sub1_sub1 != null)
		    Class14_Sub8_Sub30.method637(class133_sub1_sub1,
						 class133_sub1_sub1.anInt3493,
						 -116);
	    }
	    anInt404++;
	    if (arg0 >= -41)
		method958((byte) -58, -94);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cb.D(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub2 method958(byte arg0, int arg1) {
    while_632_:
	do {
	    do {
		Class14_Sub2_Sub2 class14_sub2_sub2;
		try {
		    anInt409++;
		    Class14_Sub2_Sub2 class14_sub2_sub2_1_
			= ((Class14_Sub2_Sub2)
			   Class14_Sub2_Sub18_Sub2.aClass20_5081
			       .method974((long) arg1, 0));
		    if (class14_sub2_sub2_1_ == null)
			break;
		    class14_sub2_sub2 = class14_sub2_sub2_1_;
		} catch (RuntimeException runtimeexception) {
		    break while_632_;
		}
		return class14_sub2_sub2;
	    } while (false);
	    Class14_Sub2_Sub2 class14_sub2_sub2;
	    try {
		byte[] is = Class14.aClass9_367.method163(arg1, 11, 0);
		int i = -45 / ((-70 - arg0) / 53);
		Class14_Sub2_Sub2 class14_sub2_sub2_2_
		    = new Class14_Sub2_Sub2();
		if (is != null)
		    class14_sub2_sub2_2_.method265(0, new Class14_Sub10(is));
		Class14_Sub2_Sub18_Sub2.aClass20_5081
		    .method971(-1, class14_sub2_sub2_2_, (long) arg1);
		class14_sub2_sub2 = class14_sub2_sub2_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub2;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "cb.B(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method959(int arg0) {
	try {
	    anIntArray402 = null;
	    aClass124_405 = null;
	    aClass124_408 = null;
	    aClass124_398 = null;
	    aClass124_403 = null;
	    anIntArray400 = null;
	    aClass124_399 = null;
	    if (arg0 != -1)
		method958((byte) 56, 36);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "cb.A(" + arg0 + ')');
	}
    }
    
    public static Class14_Sub2_Sub20 method960(int arg0, int arg1) {
    while_633_:
	do {
	    do {
		Class14_Sub2_Sub20 class14_sub2_sub20;
		try {
		    Class14_Sub2_Sub20 class14_sub2_sub20_3_
			= ((Class14_Sub2_Sub20)
			   Class14_Sub17.aClass20_3018.method974((long) arg1,
								 0));
		    anInt406++;
		    if (class14_sub2_sub20_3_ == null)
			break;
		    class14_sub2_sub20 = class14_sub2_sub20_3_;
		} catch (RuntimeException runtimeexception) {
		    break while_633_;
		}
		return class14_sub2_sub20;
	    } while (false);
	    Class14_Sub2_Sub20 class14_sub2_sub20;
	    try {
		if (arg0 != 24205)
		    aClass124_399 = null;
		byte[] is
		    = Class71.aClass9_1084.method163(arg1, 5, arg0 + -24205);
		Class14_Sub2_Sub20 class14_sub2_sub20_4_
		    = new Class14_Sub2_Sub20();
		if (null != is)
		    class14_sub2_sub20_4_.method429(96, new Class14_Sub10(is));
		Class14_Sub17.aClass20_3018
		    .method971(-1, class14_sub2_sub20_4_, (long) arg1);
		class14_sub2_sub20 = class14_sub2_sub20_4_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub20;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "cb.E(" + arg0 + ',' + arg1 + ')');
    }
    
    static {
	anIntArray400 = new int[1000];
	aClass124_405 = aClass124_399;
	aClass124_398 = Class14_Sub2_Sub2.method263(1178, "<col=ffffff>");
	aClass124_408 = null;
	aLong410 = 0L;
    }
}
