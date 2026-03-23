/* Class14_Sub2_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import nativeadvert.browsercontrol;

public class Class14_Sub2_Sub20 extends Class14_Sub2
{
    public static int anInt4054;
    public static Class102 aClass102_4055;
    public static int anInt4056;
    public static byte[][] aByteArrayArray4057 = new byte[50][];
    public static int anInt4058;
    public static int anInt4059;
    public static int anInt4060;
    public static int anInt4061;
    public int anInt4062 = 0;
    public static int anInt4063;
    public static int anInt4064;
    
    public static int method427(byte[] arg0, byte arg1, int arg2, int arg3) {
    while_224_:
	do {
	    int i;
	    do {
		int i_0_;
		try {
		    anInt4056++;
		    i = -1;
		    for (int i_1_ = arg3;
			 (i_1_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_1_++)
			i = (Class14_Sub20.anIntArray3086
			     [(arg0[i_1_] ^ i) & 0xff]) ^ i >>> 831902920;
		    i ^= 0xffffffff;
		    if (arg1 == 82)
			break;
		    i_0_ = -14;
		} catch (RuntimeException runtimeexception) {
		    break while_224_;
		}
		return i_0_;
	    } while (false);
	    int i_2_;
	    try {
		i_2_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_2_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vh.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + arg3 + ')'));
    }
    
    public static void method428(int arg0) {
	try {
	    anInt4054++;
	    Class121.method1630();
	    int i = 38 / ((69 - arg0) / 51);
	    if (browsercontrol.iscreated())
		browsercontrol.hide();
	    if (null != Class14_Sub2_Sub15.aFrame3962)
		Class14_Sub2_Sub4.method278(Class14_Sub8_Sub34.aClass43_4647,
					    Class14_Sub2_Sub15.aFrame3962,
					    120);
	    Class14_Sub2_Sub15.aFrame3962 = null;
	    Class14_Sub8_Sub30.method643(0, (byte) -92);
	    Class14_Sub21.method897(121);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vh.E(" + arg0 + ')');
	}
    }
    
    public void method429(int arg0, Class14_Sub10 arg1) {
	try {
	    int i = -3 % ((arg0 - -30) / 62);
	    for (;;) {
		int i_3_ = arg1.method798(-30);
		if (-1 == (i_3_ ^ 0xffffffff))
		    break;
		method431(arg1, (byte) 121, i_3_);
	    }
	    anInt4063++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vh.C(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method430(boolean arg0) {
    while_226_:
	do {
	while_225_:
	    do {
		do {
		    try {
			aClass102_4055 = null;
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_225_;
		    }
		    return;
		} while (false);
		try {
		    aByteArrayArray4057 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_226_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "vh.B(" + arg0 + ')');
	} while (false);
    }
    
    public void method431(Class14_Sub10 arg0, byte arg1, int arg2) {
	try {
	    anInt4061++;
	    if (arg2 == 2)
		anInt4062 = arg0.method784((byte) 119);
	    if (arg1 < 109)
		aByteArrayArray4057 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vh.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public static Class14_Sub2_Sub5 method432(int arg0, Class124 arg1) {
    while_227_:
	do {
	    do {
		Class14_Sub2_Sub5 class14_sub2_sub5;
		try {
		    anInt4059++;
		    if (arg0 > 16)
			break;
		    class14_sub2_sub5 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_227_;
		}
		return class14_sub2_sub5;
	    } while (false);
	    Class14_Sub2_Sub5 class14_sub2_sub5;
	    try {
		class14_sub2_sub5
		    = (Class14_Sub2_Sub5) Class97.aClass2_1647.method77(0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (null != class14_sub2_sub5) {
		if (class14_sub2_sub5.aClass124_3804.method1704(arg1,
								(byte) 67))
		    return class14_sub2_sub5;
		try {
		    class14_sub2_sub5 = ((Class14_Sub2_Sub5)
					 Class97.aClass2_1647.method84(-124));
		} catch (RuntimeException runtimeexception) {
		    break while_227_;
		}
	    }
	    return null;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vh.F(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    static {
	aClass102_4055 = new Class102();
	anInt4064 = 0;
    }
}
