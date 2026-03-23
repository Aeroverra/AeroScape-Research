/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class80
{
    public int anInt1307;
    public int anInt1308;
    public int[] anIntArray1309;
    public int anInt1310 = Class14_Sub24.method906(16);
    public int anInt1311;
    public int anInt1312;
    public int anInt1313;
    
    public void method1393(float[] arg0, int arg1, boolean arg2) {
	for (int i = 0; i < arg1; i++)
	    arg0[i] = 0.0F;
	if (!arg2) {
	    int i = Class14_Sub24.aClass78Array3159[anInt1308].anInt1224;
	    int i_0_ = anInt1313 - anInt1307;
	    int i_1_ = i_0_ / anInt1312;
	    int[] is = new int[i_1_];
	    for (int i_2_ = 0; i_2_ < 8; i_2_++) {
		int i_3_ = 0;
		while (i_3_ < i_1_) {
		    if (i_2_ == 0) {
			int i_4_ = Class14_Sub24.aClass78Array3159
				       [anInt1308].method1371();
			for (int i_5_ = i - 1; i_5_ >= 0; i_5_--) {
			    if (i_3_ + i_5_ < i_1_)
				is[i_3_ + i_5_] = i_4_ % anInt1311;
			    i_4_ /= anInt1311;
			}
		    }
		    for (int i_6_ = 0; i_6_ < i; i_6_++) {
			int i_7_ = is[i_3_];
			int i_8_ = anIntArray1309[i_7_ * 8 + i_2_];
			if (i_8_ >= 0) {
			    int i_9_ = anInt1307 + i_3_ * anInt1312;
			    Class78 class78
				= Class14_Sub24.aClass78Array3159[i_8_];
			    if (anInt1310 == 0) {
				int i_10_ = anInt1312 / class78.anInt1224;
				for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				    float[] fs = class78.method1373();
				    for (int i_12_ = 0;
					 i_12_ < class78.anInt1224; i_12_++)
					arg0[i_9_ + i_11_ + i_12_ * i_10_]
					    += fs[i_12_];
				}
			    } else {
				int i_13_ = 0;
				while (i_13_ < anInt1312) {
				    float[] fs = class78.method1373();
				    for (int i_14_ = 0;
					 i_14_ < class78.anInt1224; i_14_++) {
					arg0[i_9_ + i_13_] += fs[i_14_];
					i_13_++;
				    }
				}
			    }
			}
			if (++i_3_ >= i_1_)
			    break;
		    }
		}
	    }
	}
    }
    
    public Class80() {
	anInt1307 = Class14_Sub24.method906(24);
	anInt1313 = Class14_Sub24.method906(24);
	anInt1312 = Class14_Sub24.method906(24) + 1;
	anInt1311 = Class14_Sub24.method906(6) + 1;
	anInt1308 = Class14_Sub24.method906(8);
	int[] is = new int[anInt1311];
	for (int i = 0; i < anInt1311; i++) {
	    int i_15_ = 0;
	    int i_16_ = Class14_Sub24.method906(3);
	    boolean bool = Class14_Sub24.method908() != 0;
	    if (bool)
		i_15_ = Class14_Sub24.method906(5);
	    is[i] = i_15_ << 3 | i_16_;
	}
	anIntArray1309 = new int[anInt1311 * 8];
	for (int i = 0; i < anInt1311 * 8; i++)
	    anIntArray1309[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0
				 ? Class14_Sub24.method906(8) : -1);
    }
}
