/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class65
{
    public int anInt1019;
    public boolean aBoolean1020 = true;
    public static int anInt1021;
    public int anInt1022;
    public int anInt1023;
    public int anInt1024;
    public static int anInt1025;
    public static boolean aBoolean1026 = false;
    public int anInt1027;
    public int anInt1028;
    public static int anInt1029;
    public int anInt1030;
    public static int anInt1031;
    public static int anInt1032;
    public static int anInt1033;
    public static int anInt1034;
    
    public void method1288(int arg0, byte arg1, Class14_Sub10 arg2) {
	try {
	    for (;;) {
		int i = arg2.method798(71);
		if (0 == i)
		    break;
		method1290(arg2, arg0, (byte) 70, i);
	    }
	    int i = 16 / ((arg1 - -53) / 55);
	    anInt1032++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ic.D(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1289(boolean arg0) {
	try {
	    anInt1033++;
	    if (arg0 != true)
		method1291(39, -31, 22);
	    Class148.aClass52_2370.method1203((byte) -80);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ic.B(" + arg0 + ')');
	}
    }
    
    public void method1290(Class14_Sub10 arg0, int arg1, byte arg2, int arg3) {
    while_876_:
	do {
	while_875_:
	    do {
		do {
		    try {
			if (arg2 >= 57)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_875_;
		    }
		    return;
		} while (false);
		try {
		    if (-2 == (arg3 ^ 0xffffffff)) {
			anInt1024 = arg0.method829(-109);
			method1292(anInt1024, (byte) 87);
		    } else if (2 == arg3) {
			anInt1030 = arg0.method784((byte) 109);
			if ((anInt1030 ^ 0xffffffff) == -65536)
			    anInt1030 = -1;
		    } else if ((arg3 ^ 0xffffffff) == -4)
			anInt1019 = arg0.method784((byte) 103);
		    else if (4 == arg3)
			aBoolean1020 = false;
		    anInt1029++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_876_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ic.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	} while (false);
    }
    
    public static Class40 method1291(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	for (int i = 0; i < class14_sub29.anInt3242; i++) {
	    Class40 class40 = class14_sub29.aClass40Array3257[i];
	    if ((class40.aLong677 >> 29 & 0x3L) == 2L
		&& class40.anInt668 == arg1 && class40.anInt678 == arg2)
		return class40;
	}
	return null;
    }
    
    public void method1292(int arg0, byte arg1) {
	try {
	    anInt1021++;
	    double d = (double) (arg0 & 0xff) / 256.0;
	    double d_0_ = (double) ((arg0 & 0xff1d) >> 456515208) / 256.0;
	    double d_1_ = (double) (0xff & arg0 >> -1802069520) / 256.0;
	    double d_2_ = d_1_;
	    if (d_0_ < d_2_)
		d_2_ = d_0_;
	    if (d < d_2_)
		d_2_ = d;
	    double d_3_ = 0.0;
	    double d_4_ = d_1_;
	    if (d_4_ < d_0_)
		d_4_ = d_0_;
	    if (arg1 < 43)
		anInt1028 = -76;
	    if (d > d_4_)
		d_4_ = d;
	    double d_5_ = 0.0;
	    double d_6_ = (d_4_ + d_2_) / 2.0;
	    anInt1023 = (int) (256.0 * d_6_);
	    if (d_4_ != d_2_) {
		if (d_6_ < 0.5)
		    d_5_ = (-d_2_ + d_4_) / (d_4_ + d_2_);
		if (0.5 <= d_6_)
		    d_5_ = (d_4_ - d_2_) / (-d_2_ + (-d_4_ + 2.0));
		if (d_1_ != d_4_) {
		    if (d_4_ == d_0_)
			d_3_ = 2.0 + (-d_1_ + d) / (-d_2_ + d_4_);
		    else if (d == d_4_)
			d_3_ = (-d_0_ + d_1_) / (d_4_ - d_2_) + 4.0;
		} else
		    d_3_ = (d_0_ - d) / (-d_2_ + d_4_);
	    }
	    d_3_ /= 6.0;
	    if (d_6_ > 0.5)
		anInt1027 = (int) (512.0 * (d_5_ * (1.0 - d_6_)));
	    else
		anInt1027 = (int) (d_5_ * d_6_ * 512.0);
	    if (-2 < (anInt1027 ^ 0xffffffff))
		anInt1027 = 1;
	    if (-1 < (anInt1023 ^ 0xffffffff))
		anInt1023 = 0;
	    else if (255 < anInt1023)
		anInt1023 = 255;
	    anInt1022 = (int) ((double) anInt1027 * d_3_);
	    anInt1028 = (int) (d_5_ * 256.0);
	    if (anInt1028 >= 0) {
		if (-256 > (anInt1028 ^ 0xffffffff))
		    anInt1028 = 255;
	    } else
		anInt1028 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ic.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public Class65() {
	anInt1019 = 128;
	anInt1024 = 0;
	anInt1030 = -1;
    }
    
    static {
	anInt1025 = 20;
    }
}
