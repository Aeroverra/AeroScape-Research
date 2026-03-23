/* Class14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;

public class Class14_Sub3 extends Class14
{
    public static float aFloat2745;
    public int[] anIntArray2746;
    public Class79 aClass79_2747;
    public static Class133_Sub1_Sub1 aClass133_Sub1_Sub1_2748;
    public static int anInt2749;
    public static Class9_Sub1 aClass9_Sub1_2750;
    public int anInt2751;
    public static boolean aBoolean2752;
    public int anInt2753;
    public static int anInt2754;
    public Class133_Sub1_Sub1 aClass133_Sub1_Sub1_2755;
    public int anInt2756 = 0;
    public boolean aBoolean2757;
    public static int anInt2758;
    public static int anInt2759;
    public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2760;
    public int anInt2761;
    public Class133_Sub1_Sub2 aClass133_Sub1_Sub2_2762;
    public int anInt2763;
    public static int anInt2764 = 0;
    public int anInt2765;
    public static int anInt2766;
    public int anInt2767;
    public static int anInt2768;
    public int anInt2769;
    public static int anInt2770;
    public static int anInt2771;
    public int anInt2772;
    public int anInt2773;
    public int anInt2774;
    public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2775;
    
    public static boolean method448(byte arg0, int arg1, int arg2) {
	boolean bool;
	try {
	    if (arg0 != 124)
		method450(50, -54, 83, -58);
	    anInt2759++;
	    bool = 0 != (arg2 >> 1 + arg1 & 0x1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("em.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return bool;
    }
    
    public static void method449(boolean arg0, int arg1) {
    while_238_:
	do {
	while_237_:
	    do {
		do {
		    try {
			anInt2766++;
			if (Class4.aClass36_134 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_237_;
		    }
		    return;
		} while (false);
		try {
		    try {
			Class14_Sub10 class14_sub10 = new Class14_Sub10(4);
			class14_sub10.method809(false, !arg0 ? 3 : 2);
			class14_sub10.method783(255, 0);
			Class4.aClass36_134.method1100(0, 3, arg1,
						       (class14_sub10
							.aByteArray2895));
		    } catch (IOException ioexception) {
			try {
			    Class4.aClass36_134.method1101((byte) 127);
			} catch (Exception exception) {
			    /* empty */
			}
			Class4.aClass36_134 = null;
			Class51.anInt829++;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_238_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "em.A(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static int method450(int arg0, int arg1, int arg2, int arg3) {
    while_239_:
	do {
	    do {
		int i;
		try {
		    anInt2754++;
		    if (arg0 != 5030)
			method448((byte) -48, 12, -71);
		    if ((arg1 ^ 0xffffffff) != (arg3 ^ 0xffffffff))
			break;
		    i = arg3;
		} catch (RuntimeException runtimeexception) {
		    break while_239_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_0_ = -arg2 + 128;
		int i_1_
		    = (~0xff00ff
		       & (i_0_ * (arg3 >>> -1580263993 & 0x1fe01fe)
			  - -(((arg1 & ~0xff00ff) >>> -1126188313) * arg2)));
		int i_2_
		    = (~0xff00ff
		       & (0xff00ff & arg3) * i_0_ + arg2 * (0xff00ff & arg1));
		i = i_1_ - -(i_2_ >> 338064423);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("em.E(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ')'));
    }
    
    public static void method451(int arg0) {
	try {
	    anInt2749++;
	    Class133_Sub5.method1844(-32768);
	    Class116.method1595(arg0);
	    Class41.method1128((byte) -83);
	    Class60.method1264(arg0 + 115);
	    Class14_Sub8_Sub5.method501((byte) 61);
	    Class15.method946((byte) -2);
	    Class41.method1133((byte) -30);
	    Class26_Sub1.method1025(25192);
	    Class7_Sub2_Sub1.method130((byte) 110);
	    Class65.method1289(true);
	    Class125_Sub2.method1732(-25300);
	    Class14_Sub8_Sub12.method538((byte) -121);
	    Class115.method1592((byte) 23);
	    Class7_Sub2.method127(arg0 ^ 0x0);
	    Class14_Sub2_Sub5.aClass20_3815.method972(46);
	    Class75.aClass9_Sub1_1167.method152(-118);
	    Class109.aClass9_Sub1_1834.method152(-123);
	    Class14_Sub17.aClass9_Sub1_3021.method152(arg0 ^ ~0x6b);
	    Class14_Sub10.aClass9_Sub1_2901.method152(-107);
	    Class14_Sub13.aClass9_Sub1_2958.method152(-112);
	    Class125_Sub2.aClass9_Sub1_3374.method152(-124);
	    Class14_Sub8_Sub38.aClass9_Sub1_4739.method152(-116);
	    aClass9_Sub1_2750.method152(-105);
	    Class14_Sub8_Sub14.aClass9_Sub1_4323.method152(-106);
	    Class14_Sub8_Sub31.aClass9_Sub1_4603.method152(-125);
	    Class14_Sub8_Sub26.aClass9_Sub1_4521.method152(-122);
	    Class14_Sub8_Sub30.aClass52_4596.method1203((byte) -51);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "em.B(" + arg0 + ')');
	}
    }
    
    public void method452(int arg0) {
	try {
	    if (arg0 != 18631)
		method450(109, 125, 60, -78);
	    anInt2768++;
	    int i = anInt2753;
	    if (null == aClass79_2747) {
		if (null != aClass133_Sub1_Sub2_2762) {
		    int i_3_
			= Class99.method1500(aClass133_Sub1_Sub2_2762, -1);
		    if ((i_3_ ^ 0xffffffff) != (i ^ 0xffffffff)) {
			Class12 class12
			    = aClass133_Sub1_Sub2_2762.aClass12_4949;
			anInt2753 = i_3_;
			if (class12.anIntArray329 != null)
			    class12 = class12.method217((byte) -18);
			if (class12 == null)
			    anInt2765 = 0;
			else
			    anInt2765 = 128 * class12.anInt293;
		    }
		} else if (null != aClass133_Sub1_Sub1_2755) {
		    anInt2753
			= Class116.method1597(false, aClass133_Sub1_Sub1_2755);
		    anInt2765 = aClass133_Sub1_Sub1_2755.anInt4917 * 128;
		}
	    } else {
		Class79 class79 = aClass79_2747.method1391(arg0 + -18630);
		if (class79 != null) {
		    anInt2753 = class79.anInt1294;
		    anInt2765 = class79.anInt1271 * 128;
		    anInt2769 = class79.anInt1254;
		    anInt2772 = class79.anInt1289;
		    anIntArray2746 = class79.anIntArray1287;
		} else {
		    anInt2753 = -1;
		    anInt2769 = 0;
		    anInt2772 = 0;
		    anInt2765 = 0;
		    anIntArray2746 = null;
		}
	    }
	    if ((anInt2753 ^ 0xffffffff) != (i ^ 0xffffffff)
		&& null != aClass14_Sub9_Sub4_2775) {
		Class33.aClass14_Sub9_Sub2_585
		    .method730(aClass14_Sub9_Sub4_2775);
		aClass14_Sub9_Sub4_2775 = null;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "em.F(" + arg0 + ')');
	}
    }
    
    public static void method453(int arg0) {
	try {
	    int i = 115 / ((arg0 - 41) / 63);
	    aClass9_Sub1_2750 = null;
	    aClass133_Sub1_Sub1_2748 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "em.D(" + arg0 + ')');
	}
    }
}
