/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class27
{
    public static byte[] aByteArray501
	= { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
	    1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
	    2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    public Class14_Sub10 aClass14_Sub10_502;
    public long aLong503;
    public int anInt504;
    public int[] anIntArray505;
    public int anInt506;
    public int[] anIntArray507;
    public int[] anIntArray508;
    public int[] anIntArray509;
    
    public static void method1034() {
	aByteArray501 = null;
    }
    
    public void method1035(byte[] arg0) {
	aClass14_Sub10_502.aByteArray2895 = arg0;
	aClass14_Sub10_502.anInt2908 = 10;
	int i = aClass14_Sub10_502.method784((byte) 102);
	anInt506 = aClass14_Sub10_502.method784((byte) 124);
	anInt504 = 500000;
	anIntArray509 = new int[i];
	int i_0_ = 0;
	while (i_0_ < i) {
	    int i_1_ = aClass14_Sub10_502.method812((byte) -97);
	    int i_2_ = aClass14_Sub10_502.method812((byte) -115);
	    if (i_1_ == 1297379947) {
		anIntArray509[i_0_] = aClass14_Sub10_502.anInt2908;
		i_0_++;
	    }
	    aClass14_Sub10_502.anInt2908 += i_2_;
	}
	aLong503 = 0L;
	anIntArray508 = new int[i];
	for (i_0_ = 0; i_0_ < i; i_0_++)
	    anIntArray508[i_0_] = anIntArray509[i_0_];
	anIntArray507 = new int[i];
	anIntArray505 = new int[i];
    }
    
    public void method1036(int arg0) {
	anIntArray508[arg0] = aClass14_Sub10_502.anInt2908;
    }
    
    public void method1037(long arg0) {
	aLong503 = arg0;
	int i = anIntArray508.length;
	for (int i_3_ = 0; i_3_ < i; i_3_++) {
	    anIntArray507[i_3_] = 0;
	    anIntArray505[i_3_] = 0;
	    aClass14_Sub10_502.anInt2908 = anIntArray509[i_3_];
	    method1042(i_3_);
	    anIntArray508[i_3_] = aClass14_Sub10_502.anInt2908;
	}
    }
    
    public long method1038(int arg0) {
	return aLong503 + (long) arg0 * (long) anInt504;
    }
    
    public int method1039(int arg0) {
	int i = method1047(arg0);
	return i;
    }
    
    public int method1040(int arg0, int arg1) {
	if (arg1 == 255) {
	    int i = aClass14_Sub10_502.method798(108);
	    int i_4_ = aClass14_Sub10_502.method800(127);
	    if (i == 47) {
		aClass14_Sub10_502.anInt2908 += i_4_;
		return 1;
	    }
	    if (i == 81) {
		int i_5_ = aClass14_Sub10_502.method829(31);
		i_4_ -= 3;
		int i_6_ = anIntArray507[arg0];
		aLong503 += (long) i_6_ * (long) (anInt504 - i_5_);
		anInt504 = i_5_;
		aClass14_Sub10_502.anInt2908 += i_4_;
		return 2;
	    }
	    aClass14_Sub10_502.anInt2908 += i_4_;
	    return 3;
	}
	byte i = aByteArray501[arg1 - 128];
	int i_7_ = arg1;
	if (i >= 1)
	    i_7_ |= aClass14_Sub10_502.method798(-31) << 8;
	if (i >= 2)
	    i_7_ |= aClass14_Sub10_502.method798(-20) << 16;
	return i_7_;
    }
    
    public boolean method1041() {
	int i = anIntArray508.length;
	for (int i_8_ = 0; i_8_ < i; i_8_++) {
	    if (anIntArray508[i_8_] >= 0)
		return false;
	}
	return true;
    }
    
    public void method1042(int arg0) {
	int i = aClass14_Sub10_502.method800(127);
	anIntArray507[arg0] += i;
    }
    
    public int method1043() {
	return anIntArray508.length;
    }
    
    public int method1044() {
	int i = anIntArray508.length;
	int i_9_ = -1;
	int i_10_ = 2147483647;
	for (int i_11_ = 0; i_11_ < i; i_11_++) {
	    if (anIntArray508[i_11_] >= 0 && anIntArray507[i_11_] < i_10_) {
		i_9_ = i_11_;
		i_10_ = anIntArray507[i_11_];
	    }
	}
	return i_9_;
    }
    
    public void method1045() {
	aClass14_Sub10_502.anInt2908 = -1;
    }
    
    public void method1046() {
	aClass14_Sub10_502.aByteArray2895 = null;
	anIntArray509 = null;
	anIntArray508 = null;
	anIntArray507 = null;
	anIntArray505 = null;
    }
    
    public int method1047(int arg0) {
	int i
	    = aClass14_Sub10_502.aByteArray2895[aClass14_Sub10_502.anInt2908];
	if (i < 0) {
	    i &= 0xff;
	    anIntArray505[arg0] = i;
	    aClass14_Sub10_502.anInt2908++;
	} else
	    i = anIntArray505[arg0];
	if (i == 240 || i == 247) {
	    int i_12_ = aClass14_Sub10_502.method800(127);
	    if (i == 247 && i_12_ > 0) {
		int i_13_ = ((aClass14_Sub10_502.aByteArray2895
			      [aClass14_Sub10_502.anInt2908])
			     & 0xff);
		if (i_13_ >= 241 && i_13_ <= 243 || i_13_ == 246
		    || i_13_ == 248 || i_13_ >= 250 && i_13_ <= 252
		    || i_13_ == 254) {
		    aClass14_Sub10_502.anInt2908++;
		    anIntArray505[arg0] = i_13_;
		    return method1040(arg0, i_13_);
		}
	    }
	    aClass14_Sub10_502.anInt2908 += i_12_;
	    return 0;
	}
	return method1040(arg0, i);
    }
    
    public void method1048(int arg0) {
	aClass14_Sub10_502.anInt2908 = anIntArray508[arg0];
    }
    
    public boolean method1049() {
	return aClass14_Sub10_502.aByteArray2895 != null;
    }
    
    public Class27() {
	aClass14_Sub10_502 = new Class14_Sub10(null);
    }
    
    public Class27(byte[] arg0) {
	aClass14_Sub10_502 = new Class14_Sub10(null);
	method1035(arg0);
    }
}
