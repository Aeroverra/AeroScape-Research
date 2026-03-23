/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.util.zip.Inflater;

public class Class49
{
    public static int anInt808;
    public static int anInt809;
    public static Class52 aClass52_810 = new Class52(50);
    public static int anInt811;
    public Inflater anInflater812;
    public static int anInt813;
    public static boolean aBoolean814 = false;
    public static int anInt815;
    public static Class124 aClass124_816
	= Class14_Sub2_Sub2.method263(1178, "(U1");
    public static int anInt817;
    public static int anInt818;
    public static Canvas aCanvas819;
    
    public Class49() {
	this(-1, 1000000, 1000000);
    }
    
    public static Class14_Sub2_Sub19 method1194
	(boolean arg0, int arg1, int arg2, boolean arg3, boolean arg4,
	 int arg5, boolean arg6, int arg7) {
    while_809_:
	do {
	    Class142 class142;
	    Class133_Sub7_Sub1 class133_sub7_sub1;
	    do {
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    anInt809++;
		    if (arg6 != true)
			anInt815 = 114;
		    class142 = Class14_Sub8_Sub24.method605(73, arg2);
		    if ((arg5 ^ 0xffffffff) < -2
			&& class142.anIntArray2325 != null) {
			int i = -1;
			for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			    if (((class142.anIntArray2320[i_0_] ^ 0xffffffff)
				 >= (arg5 ^ 0xffffffff))
				&& 0 != class142.anIntArray2320[i_0_])
				i = class142.anIntArray2325[i_0_];
			}
			if (i != -1)
			    class142 = Class14_Sub8_Sub24.method605(63, i);
		    }
		    class133_sub7_sub1 = class142.method1978(0);
		    if (class133_sub7_sub1 != null)
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_809_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
	while_808_:
	    do {
		do {
		    Class14_Sub2_Sub19 class14_sub2_sub19;
		    try {
			class14_sub2_sub19_sub1 = null;
			if ((class142.anInt2316 ^ 0xffffffff) == 0)
			    break;
			class14_sub2_sub19_sub1
			    = ((Class14_Sub2_Sub19_Sub1)
			       method1194(true, 1, class142.anInt2268, true,
					  false, 10, true, 0));
			if (null != class14_sub2_sub19_sub1)
			    break while_808_;
			class14_sub2_sub19 = null;
		    } catch (RuntimeException runtimeexception) {
			break while_809_;
		    }
		    return class14_sub2_sub19;
		} while (false);
		Class14_Sub2_Sub19 class14_sub2_sub19;
		try {
		    if (class142.anInt2305 == -1)
			break;
		    class14_sub2_sub19_sub1
			= ((Class14_Sub2_Sub19_Sub1)
			   method1194(true, arg1, class142.anInt2257, false,
				      false, arg5, arg6, arg7));
		    if (null != class14_sub2_sub19_sub1)
			break;
		    class14_sub2_sub19 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_809_;
		}
		return class14_sub2_sub19;
	    } while (false);
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_1_;
	    do {
		Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2;
		try {
		    int i = Class92.anInt1432;
		    int[] is = Class92.anIntArray1437;
		    int[] is_2_ = new int[4];
		    int i_3_ = Class92.anInt1435;
		    Class92.method1452(is_2_);
		    class14_sub2_sub19_sub1_1_
			= new Class14_Sub2_Sub19_Sub1(36, 32);
		    Class92.method1455((class14_sub2_sub19_sub1_1_
					.anIntArray5088),
				       36, 32);
		    Class3.method97();
		    Class3.method90(16, 16);
		    Class3.aBoolean107 = false;
		    int i_4_ = class142.anInt2273;
		    if (!arg3) {
			if (-3 == (arg1 ^ 0xffffffff))
			    i_4_ *= 1.04;
		    } else
			i_4_ *= 1.5;
		    int i_5_ = (i_4_ * Class3.anIntArray111[class142.anInt2317]
				>> -453639376);
		    int i_6_ = (Class3.anIntArray108[class142.anInt2317] * i_4_
				>> -1376050352);
		    class133_sub7_sub1.method1862
			(0, class142.anInt2286, class142.anInt2326,
			 class142.anInt2317, class142.anInt2293,
			 (-(class133_sub7_sub1.method1781() / 2) + i_6_
			  + class142.anInt2285),
			 i_5_ - -class142.anInt2285);
		    if ((arg1 ^ 0xffffffff) <= -2) {
			class14_sub2_sub19_sub1_1_.method411(1);
			if (-3 >= (arg1 ^ 0xffffffff))
			    class14_sub2_sub19_sub1_1_.method411(16777215);
			Class92.method1455((class14_sub2_sub19_sub1_1_
					    .anIntArray5088),
					   36, 32);
		    }
		    if (arg7 != 0)
			class14_sub2_sub19_sub1_1_.method408(arg7);
		    if (class142.anInt2316 != -1)
			class14_sub2_sub19_sub1.method391(0, 0);
		    else if (class142.anInt2305 != -1) {
			Class92.method1455((class14_sub2_sub19_sub1
					    .anIntArray5088),
					   36, 32);
			class14_sub2_sub19_sub1_1_.method391(0, 0);
			class14_sub2_sub19_sub1_1_ = class14_sub2_sub19_sub1;
		    }
		    if (arg4 && ((class142.anInt2309 ^ 0xffffffff) == -2
				 || -2 != (arg5 ^ 0xffffffff)) && arg5 != -1)
			Class4.aClass14_Sub2_Sub16_Sub1_137.method364
			    (Class14_Sub2_Sub1.method249(67, arg5), 0, 9,
			     16776960, 1);
		    Class92.method1455(is, i, i_3_);
		    Class92.method1459(is_2_);
		    Class3.method97();
		    Class3.aBoolean107 = true;
		    if (arg0)
			break;
		    class14_sub2_sub19_sub2 = (new Class14_Sub2_Sub19_Sub2
					       (class14_sub2_sub19_sub1_1_));
		} catch (RuntimeException runtimeexception) {
		    break while_809_;
		}
		return class14_sub2_sub19_sub2;
	    } while (false);
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_7_;
	    try {
		class14_sub2_sub19_sub1_7_ = class14_sub2_sub19_sub1_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub19_sub1_7_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("fj.C(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ',' + arg4
					    + ',' + arg5 + ',' + arg6 + ','
					    + arg7 + ')'));
    }
    
    public void method1195(byte[] arg0, boolean arg1, Class14_Sub10 arg2) {
	try {
	    anInt811++;
	    if (-32 != (arg2.aByteArray2895[arg2.anInt2908] ^ 0xffffffff)
		|| arg2.aByteArray2895[1 + arg2.anInt2908] != -117)
		throw new RuntimeException("Invalid GZIP header!");
	    if (anInflater812 == null)
		anInflater812 = new Inflater(true);
	    try {
		anInflater812.setInput(arg2.aByteArray2895,
				       10 + arg2.anInt2908,
				       (arg2.aByteArray2895.length
					- (10 + arg2.anInt2908 + 8)));
		anInflater812.inflate(arg0);
	    } catch (Exception exception) {
		anInflater812.reset();
		throw new RuntimeException("Invalid GZIP compressed data!");
	    }
	    if (arg1)
		aBoolean814 = true;
	    anInflater812.reset();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fj.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1196(byte arg0) {
	try {
	    aClass124_816 = null;
	    aCanvas819 = null;
	    aClass52_810 = null;
	    if (arg0 != 41)
		method1196((byte) 107);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fj.D(" + arg0 + ')');
	}
    }
    
    public static void method1197(int arg0, boolean arg1) {
    while_811_:
	do {
	while_810_:
	    do {
		do {
		    try {
			anInt813++;
			if ((arg0 ^ 0xffffffff) != 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_810_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (Class108.aBooleanArray1819[arg0])
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_810_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class83.aClass9_1335.method168(arg0, (byte) -90);
			if (Class1.aClass94ArrayArray75[arg0] != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_810_;
		    }
		    return;
		} while (false);
		try {
		    boolean bool = true;
		    for (int i = 0;
			 ((i ^ 0xffffffff)
			  > (Class1.aClass94ArrayArray75[arg0].length
			     ^ 0xffffffff));
			 i++) {
			if (null != Class1.aClass94ArrayArray75[arg0][i]) {
			    if (Class1.aClass94ArrayArray75[arg0][i].anInt1489
				!= 2)
				Class1.aClass94ArrayArray75[arg0][i] = null;
			    else
				bool = false;
			}
		    }
		    if (bool)
			Class1.aClass94ArrayArray75[arg0] = null;
		    Class108.aBooleanArray1819[arg0] = arg1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_811_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "fj.A(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public Class49(int arg0, int arg1, int arg2) {
	/* empty */
    }
}
