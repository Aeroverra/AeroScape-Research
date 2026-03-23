/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class78
{
    public int[] anIntArray1220;
    public int anInt1221;
    public float[][] aFloatArrayArray1222;
    public int[] anIntArray1223;
    public int anInt1224;
    public int[] anIntArray1225;
    
    public static int method1370(int arg0, int arg1) {
	int i;
	for (i = (int) Math.pow((double) arg0, 1.0 / (double) arg1) + 1;
	     Class12.method221(arg1, i, (byte) -96) > arg0; i--) {
	    /* empty */
	}
	return i;
    }
    
    public int method1371() {
	int i;
	for (i = 0; anIntArray1225[i] >= 0;
	     i = Class14_Sub24.method908() != 0 ? anIntArray1225[i] : i + 1) {
	    /* empty */
	}
	return anIntArray1225[i] ^ 0xffffffff;
    }
    
    public void method1372() {
	int[] is = new int[anInt1221];
	int[] is_0_ = new int[33];
	for (int i = 0; i < anInt1221; i++) {
	    int i_1_ = anIntArray1223[i];
	    if (i_1_ != 0) {
		int i_2_ = 1 << 32 - i_1_;
		int i_3_ = is_0_[i_1_];
		is[i] = i_3_;
		int i_4_;
		if ((i_3_ & i_2_) != 0)
		    i_4_ = is_0_[i_1_ - 1];
		else {
		    i_4_ = i_3_ | i_2_;
		    for (int i_5_ = i_1_ - 1; i_5_ >= 1; i_5_--) {
			int i_6_ = is_0_[i_5_];
			if (i_6_ != i_3_)
			    break;
			int i_7_ = 1 << 32 - i_5_;
			if ((i_6_ & i_7_) != 0) {
			    is_0_[i_5_] = is_0_[i_5_ - 1];
			    break;
			}
			is_0_[i_5_] = i_6_ | i_7_;
		    }
		}
		is_0_[i_1_] = i_4_;
		for (int i_8_ = i_1_ + 1; i_8_ <= 32; i_8_++) {
		    int i_9_ = is_0_[i_8_];
		    if (i_9_ == i_3_)
			is_0_[i_8_] = i_4_;
		}
	    }
	}
	anIntArray1225 = new int[8];
	int i = 0;
	for (int i_10_ = 0; i_10_ < anInt1221; i_10_++) {
	    int i_11_ = anIntArray1223[i_10_];
	    if (i_11_ != 0) {
		int i_12_ = is[i_10_];
		int i_13_ = 0;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
		    int i_15_ = -2147483648 >>> i_14_;
		    if ((i_12_ & i_15_) != 0) {
			if (anIntArray1225[i_13_] == 0)
			    anIntArray1225[i_13_] = i;
			i_13_ = anIntArray1225[i_13_];
		    } else
			i_13_++;
		    if (i_13_ >= anIntArray1225.length) {
			int[] is_16_ = new int[anIntArray1225.length * 2];
			for (int i_17_ = 0; i_17_ < anIntArray1225.length;
			     i_17_++)
			    is_16_[i_17_] = anIntArray1225[i_17_];
			anIntArray1225 = is_16_;
		    }
		    i_15_ >>>= 1;
		}
		anIntArray1225[i_13_] = i_10_ ^ 0xffffffff;
		if (i_13_ >= i)
		    i = i_13_ + 1;
	    }
	}
    }
    
    public float[] method1373() {
	return aFloatArrayArray1222[method1371()];
    }
    
    public Class78() {
	Class14_Sub24.method906(24);
	anInt1224 = Class14_Sub24.method906(16);
	anInt1221 = Class14_Sub24.method906(24);
	anIntArray1223 = new int[anInt1221];
	boolean bool = Class14_Sub24.method908() != 0;
	if (bool) {
	    int i = 0;
	    int i_18_ = Class14_Sub24.method906(5) + 1;
	    while (i < anInt1221) {
		int i_19_
		    = Class14_Sub24.method906(Class48.method1192(anInt1221 - i,
								 25039));
		for (int i_20_ = 0; i_20_ < i_19_; i_20_++)
		    anIntArray1223[i++] = i_18_;
		i_18_++;
	    }
	} else {
	    boolean bool_21_ = Class14_Sub24.method908() != 0;
	    for (int i = 0; i < anInt1221; i++) {
		if (bool_21_ && Class14_Sub24.method908() == 0)
		    anIntArray1223[i] = 0;
		else
		    anIntArray1223[i] = Class14_Sub24.method906(5) + 1;
	    }
	}
	method1372();
	int i = Class14_Sub24.method906(4);
	if (i > 0) {
	    float f = Class14_Sub24.method907(Class14_Sub24.method906(32));
	    float f_22_ = Class14_Sub24.method907(Class14_Sub24.method906(32));
	    int i_23_ = Class14_Sub24.method906(4) + 1;
	    boolean bool_24_ = Class14_Sub24.method908() != 0;
	    int i_25_;
	    if (i == 1)
		i_25_ = method1370(anInt1221, anInt1224);
	    else
		i_25_ = anInt1221 * anInt1224;
	    anIntArray1220 = new int[i_25_];
	    for (int i_26_ = 0; i_26_ < i_25_; i_26_++)
		anIntArray1220[i_26_] = Class14_Sub24.method906(i_23_);
	    aFloatArrayArray1222 = new float[anInt1221][anInt1224];
	    if (i == 1) {
		for (int i_27_ = 0; i_27_ < anInt1221; i_27_++) {
		    float f_28_ = 0.0F;
		    int i_29_ = 1;
		    for (int i_30_ = 0; i_30_ < anInt1224; i_30_++) {
			int i_31_ = i_27_ / i_29_ % i_25_;
			float f_32_ = ((float) anIntArray1220[i_31_] * f_22_
				       + f + f_28_);
			aFloatArrayArray1222[i_27_][i_30_] = f_32_;
			if (bool_24_)
			    f_28_ = f_32_;
			i_29_ *= i_25_;
		    }
		}
	    } else {
		for (int i_33_ = 0; i_33_ < anInt1221; i_33_++) {
		    float f_34_ = 0.0F;
		    int i_35_ = i_33_ * anInt1224;
		    for (int i_36_ = 0; i_36_ < anInt1224; i_36_++) {
			float f_37_ = ((float) anIntArray1220[i_35_] * f_22_
				       + f + f_34_);
			aFloatArrayArray1222[i_33_][i_36_] = f_37_;
			if (bool_24_)
			    f_34_ = f_37_;
			i_35_++;
		    }
		}
	    }
	}
    }
}
