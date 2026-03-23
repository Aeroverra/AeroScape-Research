/* Class14_Sub8_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub11 extends Class14_Sub8
{
    public static Class124 aClass124_4264;
    public static Class124 aClass124_4265
	= Class14_Sub2_Sub2.method263(1178, "<col=c0ff00>");
    public static int anInt4266;
    public static int anInt4267;
    public static int anInt4268;
    public static int anInt4269;
    public static int anInt4270;
    public static boolean[] aBooleanArray4271;
    public static Class124 aClass124_4272
	= Class14_Sub2_Sub2.method263(1178, "; Expires=");
    public static int anInt4273;
    public static Class124 aClass124_4274
	= Class14_Sub2_Sub2.method263(1178, "Ok");
    public static int[] anIntArray4275;
    public static int anInt4276;
    
    public static void method530(byte arg0) {
	try {
	    anInt4276++;
	    if (arg0 != -11)
		aBooleanArray4271 = null;
	    Class14_Sub6.aClass52_2817.method1209((byte) -96);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hg.H(" + arg0 + ')');
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4273++;
	    if (arg1 >= -58)
		method532(48);
	    int[] is_0_ = aClass149_2851.method2014(arg0, (byte) 107);
	    if (aClass149_2851.aBoolean2402) {
		int i = Class133_Sub5.anIntArray3623[arg0];
		for (int i_1_ = 0;
		     (i_1_ ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i_1_++)
		    is_0_[i_1_]
			= (method534(i, (byte) 12,
				     Class14_Sub8_Sub4.anIntArray4145[i_1_])
			   % 4096);
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hg.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method531(byte arg0) {
	try {
	    anInt4267++;
	    Class48.aClass99_804.method1504((byte) -111);
	    if (arg0 != -112)
		method535(true);
	    for (int i = 0; 32 > i; i++)
		Class14_Sub2_Sub12.aLongArray3914[i] = 0L;
	    for (int i = 0; (i ^ 0xffffffff) > -33; i++)
		Class14_Sub8_Sub9.aLongArray4233[i] = 0L;
	    Class102.anInt1702 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hg.E(" + arg0 + ')');
	}
    }
    
    public static void method532(int arg0) {
	try {
	    for (int i = arg0; (i ^ 0xffffffff) > (Class14_Sub8_Sub13.anInt4306
						   ^ 0xffffffff); i++) {
		int i_2_ = Class14_Sub2_Sub15.anIntArray3965[i];
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_2_];
		if (class133_sub1_sub2 != null)
		    Class14_Sub8_Sub30.method637(class133_sub1_sub2,
						 (class133_sub1_sub2
						  .aClass12_4949.anInt334),
						 -52);
	    }
	    anInt4270++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hg.J(" + arg0 + ')');
	}
    }
    
    public static void method533(boolean arg0) {
	try {
	    aClass124_4272 = null;
	    aBooleanArray4271 = null;
	    if (arg0 != true)
		aClass124_4274 = null;
	    aClass124_4265 = null;
	    aClass124_4264 = null;
	    anIntArray4275 = null;
	    aClass124_4274 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "hg.D(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub11() {
	super(0, true);
    }
    
    public int method534(int arg0, byte arg1, int arg2) {
	int i;
	try {
	    anInt4268++;
	    int i_3_ = arg2 - -(57 * arg0);
	    if (arg1 < 6)
		aClass124_4265 = null;
	    i_3_ = i_3_ << -874472895 ^ i_3_;
	    i = 4096 - (1376312589 + i_3_ * (15731 * (i_3_ * i_3_) + 789221)
			& 0x7fffffff) / 262144;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("hg.G(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public static Class14_Sub2_Sub19[] method535(boolean arg0) {
    while_355_:
	do {
	    Class14_Sub2_Sub19[] class14_sub2_sub19s;
	    do {
		Class14_Sub2_Sub19[] class14_sub2_sub19s_4_;
		try {
		    class14_sub2_sub19s
			= new Class14_Sub2_Sub19[Class32.anInt547];
		    if (arg0 == true)
			break;
		    class14_sub2_sub19s_4_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_355_;
		}
		return class14_sub2_sub19s_4_;
	    } while (false);
	    Class14_Sub2_Sub19[] class14_sub2_sub19s_5_;
	    try {
		for (int i = 0; Class32.anInt547 > i; i++) {
		    byte[] is = Class12.aByteArrayArray310[i];
		    int i_6_
			= Class17.anIntArray402[i] * Class76.anIntArray1204[i];
		    int[] is_7_ = new int[i_6_];
		    for (int i_8_ = 0; i_6_ > i_8_; i_8_++)
			is_7_[i_8_]
			    = (Class73.anIntArray1114
			       [Class14_Sub8_Sub26.method617(255, is[i_8_])]);
		    class14_sub2_sub19s[i]
			= new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952,
						      Class14_Sub30.anInt3279,
						      Class40.anIntArray675[i],
						      (Class14_Sub2_Sub12
						       .anIntArray3918[i]),
						      Class17.anIntArray402[i],
						      (Class76.anIntArray1204
						       [i]),
						      is_7_);
		}
		anInt4269++;
		Class129.method1761((byte) 81);
		class14_sub2_sub19s_5_ = class14_sub2_sub19s;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19s_5_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "hg.B(" + arg0 + ')');
    }
    
    static {
	aClass124_4264 = aClass124_4274;
	anIntArray4275 = new int[2000];
	aBooleanArray4271 = new boolean[8];
    }
}
