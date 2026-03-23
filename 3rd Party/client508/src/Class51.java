/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class51
{
    public static int anInt828;
    public static int anInt829 = 0;
    public static int anInt830;
    public static int anInt831;
    public int anInt832;
    public static Class9 aClass9_833;
    public int anInt834;
    public static int[] anIntArray835;
    public static int anInt836;
    public static int anInt837;
    public static Class85[] aClass85Array838 = new Class85[500];
    public static int anInt839;
    public static int anInt840;
    public static Class124 aClass124_841;
    public int anInt842;
    
    public void method1198(Class14_Sub10 arg0, int arg1) {
	try {
	    int i = 121 % ((arg1 - -61) / 53);
	    for (;;) {
		int i_0_ = arg0.method798(-66);
		if (0 == i_0_)
		    break;
		method1199(i_0_, arg0, (byte) -61);
	    }
	    anInt840++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ge.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method1199(int arg0, Class14_Sub10 arg1, byte arg2) {
	try {
	    if ((arg0 ^ 0xffffffff) == -2) {
		anInt842 = arg1.method784((byte) 126);
		anInt832 = arg1.method798(-104);
		anInt834 = arg1.method798(-50);
	    }
	    anInt836++;
	    int i = -46 / ((9 - arg2) / 44);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ge.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1200(int arg0) {
    while_813_:
	do {
	while_812_:
	    do {
		do {
		    try {
			aClass9_833 = null;
			aClass124_841 = null;
			anIntArray835 = null;
			if (arg0 == 10)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_812_;
		    }
		    return;
		} while (false);
		try {
		    aClass85Array838 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_813_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ge.C(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1201(int[] arg0, int arg1, int arg2, int arg3,
				  int arg4) {
    while_815_:
	do {
	while_814_:
	    do {
		do {
		    try {
			if (arg3 == -5973)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_814_;
		    }
		    return;
		} while (false);
		try {
		    anInt837++;
		    arg1--;
		    int i = --arg2 - 7;
		    while ((arg1 ^ 0xffffffff) > (i ^ 0xffffffff)) {
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
			arg0[++arg1] = arg4;
		    }
		    while ((arg2 ^ 0xffffffff) < (arg1 ^ 0xffffffff))
			arg0[++arg1] = arg4;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_815_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ge.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ')'));
	} while (false);
    }
    
    static {
	anInt828 = 10;
	aClass124_841 = Class14_Sub2_Sub2.method263(1178, "Weiter");
	anInt839 = 0;
	anInt830 = -8 + (int) (17.0 * Math.random());
	anInt831 = 0;
    }
}
