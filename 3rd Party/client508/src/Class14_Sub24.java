/* Class14_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub24 extends Class14
{
    public static int anInt3136;
    public static Class147[] aClass147Array3137;
    public static float[] aFloatArray3138;
    public int anInt3139;
    public static Class16[] aClass16Array3140;
    public static int[] anIntArray3141;
    public static float[] aFloatArray3142;
    public static int anInt3143;
    public static int anInt3144;
    public int anInt3145;
    public static int[] anIntArray3146;
    public float[] aFloatArray3147;
    public int anInt3148;
    public static float[] aFloatArray3149;
    public static float[] aFloatArray3150;
    public boolean aBoolean3151;
    public static float[] aFloatArray3152;
    public static float[] aFloatArray3153;
    public static boolean[] aBooleanArray3154;
    public static boolean aBoolean3155 = false;
    public boolean aBoolean3156;
    public static byte[] aByteArray3157;
    public static float[] aFloatArray3158;
    public static Class78[] aClass78Array3159;
    public byte[][] aByteArrayArray3160;
    public static int[] anIntArray3161;
    public int anInt3162;
    public static int anInt3163;
    public static Class80[] aClass80Array3164;
    public int anInt3165;
    public int anInt3166;
    public int anInt3167;
    public int anInt3168;
    public byte[] aByteArray3169;
    
    public Class14_Sub12_Sub1 method904(int[] arg0) {
	if (arg0 != null && arg0[0] <= 0)
	    return null;
	if (aByteArray3169 == null) {
	    anInt3148 = 0;
	    aFloatArray3147 = new float[anInt3163];
	    aByteArray3169 = new byte[anInt3145];
	    anInt3167 = 0;
	    anInt3168 = 0;
	}
	for (/**/; anInt3168 < aByteArrayArray3160.length; anInt3168++) {
	    if (arg0 != null && arg0[0] <= 0)
		return null;
	    float[] fs = method913(anInt3168);
	    if (fs != null) {
		int i = anInt3167;
		int i_0_ = fs.length;
		if (i_0_ > anInt3145 - i)
		    i_0_ = anInt3145 - i;
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
		    int i_2_ = (int) (128.0F + fs[i_1_] * 128.0F);
		    if ((i_2_ & ~0xff) != 0)
			i_2_ = (i_2_ ^ 0xffffffff) >> 31;
		    aByteArray3169[i++] = (byte) (i_2_ - 128);
		}
		if (arg0 != null)
		    arg0[0] -= i - anInt3167;
		anInt3167 = i;
	    }
	}
	aFloatArray3147 = null;
	byte[] is = aByteArray3169;
	aByteArray3169 = null;
	return new Class14_Sub12_Sub1(anInt3139, is, anInt3166, anInt3165,
				      aBoolean3156);
    }
    
    public static void method905(byte[] arg0) {
	method911(arg0, 0);
	anInt3143 = 1 << method906(4);
	anInt3163 = 1 << method906(4);
	aFloatArray3153 = new float[anInt3163];
	for (int i = 0; i < 2; i++) {
	    int i_3_ = i != 0 ? anInt3163 : anInt3143;
	    int i_4_ = i_3_ >> 1;
	    int i_5_ = i_3_ >> 2;
	    int i_6_ = i_3_ >> 3;
	    float[] fs = new float[i_4_];
	    for (int i_7_ = 0; i_7_ < i_5_; i_7_++) {
		fs[2 * i_7_]
		    = (float) Math.cos((double) (4 * i_7_) * 3.141592653589793
				       / (double) i_3_);
		fs[2 * i_7_ + 1]
		    = -(float) Math.sin((double) (4 * i_7_) * 3.141592653589793
					/ (double) i_3_);
	    }
	    float[] fs_8_ = new float[i_4_];
	    for (int i_9_ = 0; i_9_ < i_5_; i_9_++) {
		fs_8_[2 * i_9_] = (float) Math.cos((double) (2 * i_9_ + 1)
						   * 3.141592653589793
						   / (double) (2 * i_3_));
		fs_8_[2 * i_9_ + 1] = (float) Math.sin((double) (2 * i_9_ + 1)
						       * 3.141592653589793
						       / (double) (2 * i_3_));
	    }
	    float[] fs_10_ = new float[i_5_];
	    for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
		fs_10_[2 * i_11_]
		    = (float) Math.cos((double) (4 * i_11_ + 2)
				       * 3.141592653589793 / (double) i_3_);
		fs_10_[2 * i_11_ + 1]
		    = -(float) Math.sin((double) (4 * i_11_ + 2)
					* 3.141592653589793 / (double) i_3_);
	    }
	    int[] is = new int[i_6_];
	    int i_12_ = Class48.method1192(i_6_ - 1, 25039);
	    for (int i_13_ = 0; i_13_ < i_6_; i_13_++)
		is[i_13_] = Class100.method1514(i_12_, -66, i_13_);
	    if (i != 0) {
		aFloatArray3149 = fs;
		aFloatArray3152 = fs_8_;
		aFloatArray3138 = fs_10_;
		anIntArray3161 = is;
	    } else {
		aFloatArray3150 = fs;
		aFloatArray3158 = fs_8_;
		aFloatArray3142 = fs_10_;
		anIntArray3141 = is;
	    }
	}
	int i = method906(8) + 1;
	aClass78Array3159 = new Class78[i];
	for (int i_14_ = 0; i_14_ < i; i_14_++)
	    aClass78Array3159[i_14_] = new Class78();
	int i_15_ = method906(6) + 1;
	for (int i_16_ = 0; i_16_ < i_15_; i_16_++)
	    method906(16);
	i_15_ = method906(6) + 1;
	aClass16Array3140 = new Class16[i_15_];
	for (int i_17_ = 0; i_17_ < i_15_; i_17_++)
	    aClass16Array3140[i_17_] = new Class16();
	int i_18_ = method906(6) + 1;
	aClass80Array3164 = new Class80[i_18_];
	for (int i_19_ = 0; i_19_ < i_18_; i_19_++)
	    aClass80Array3164[i_19_] = new Class80();
	int i_20_ = method906(6) + 1;
	aClass147Array3137 = new Class147[i_20_];
	for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
	    aClass147Array3137[i_21_] = new Class147();
	int i_22_ = method906(6) + 1;
	aBooleanArray3154 = new boolean[i_22_];
	anIntArray3146 = new int[i_22_];
	for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
	    aBooleanArray3154[i_23_] = method908() != 0;
	    method906(16);
	    method906(16);
	    anIntArray3146[i_23_] = method906(8);
	}
    }
    
    public static int method906(int arg0) {
	int i = 0;
	int i_24_ = 0;
	int i_25_;
	for (/**/; arg0 >= 8 - anInt3144; arg0 -= i_25_) {
	    i_25_ = 8 - anInt3144;
	    int i_26_ = (1 << i_25_) - 1;
	    i += (aByteArray3157[anInt3136] >> anInt3144 & i_26_) << i_24_;
	    anInt3144 = 0;
	    anInt3136++;
	    i_24_ += i_25_;
	}
	if (arg0 > 0) {
	    i_25_ = (1 << arg0) - 1;
	    i += (aByteArray3157[anInt3136] >> anInt3144 & i_25_) << i_24_;
	    anInt3144 += arg0;
	}
	return i;
    }
    
    public static float method907(int arg0) {
	int i = arg0 & 0x1fffff;
	int i_27_ = arg0 & ~0x7fffffff;
	int i_28_ = (arg0 & 0x7fe00000) >> 21;
	if (i_27_ != 0)
	    i = -i;
	return (float) ((double) i * Math.pow(2.0, (double) (i_28_ - 788)));
    }
    
    public static int method908() {
	int i = aByteArray3157[anInt3136] >> anInt3144 & 0x1;
	anInt3144++;
	anInt3136 += anInt3144 >> 3;
	anInt3144 &= 0x7;
	return i;
    }
    
    public static boolean method909(Class9 arg0) {
	if (!aBoolean3155) {
	    byte[] is = arg0.method163(0, 0, 0);
	    if (is == null)
		return false;
	    method905(is);
	    aBoolean3155 = true;
	}
	return true;
    }
    
    public static Class14_Sub24 method910(Class9 arg0, int arg1, int arg2) {
	if (!method909(arg0)) {
	    arg0.method158(arg2, arg1, (byte) 85);
	    return null;
	}
	byte[] is = arg0.method163(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class14_Sub24(is);
    }
    
    public static void method911(byte[] arg0, int arg1) {
	aByteArray3157 = arg0;
	anInt3136 = arg1;
	anInt3144 = 0;
    }
    
    public void method912(byte[] arg0) {
	Class14_Sub10 class14_sub10 = new Class14_Sub10(arg0);
	anInt3139 = class14_sub10.method812((byte) -99);
	anInt3145 = class14_sub10.method812((byte) -119);
	anInt3166 = class14_sub10.method812((byte) -117);
	anInt3165 = class14_sub10.method812((byte) -109);
	if (anInt3165 < 0) {
	    anInt3165 = anInt3165 ^ 0xffffffff;
	    aBoolean3156 = true;
	}
	int i = class14_sub10.method812((byte) -128);
	aByteArrayArray3160 = new byte[i][];
	for (int i_29_ = 0; i_29_ < i; i_29_++) {
	    int i_30_ = 0;
	    int i_31_;
	    do {
		i_31_ = class14_sub10.method798(57);
		i_30_ += i_31_;
	    } while (i_31_ >= 255);
	    byte[] is = new byte[i_30_];
	    class14_sub10.method824(i_30_, (byte) 75, 0, is);
	    aByteArrayArray3160[i_29_] = is;
	}
    }
    
    public float[] method913(int arg0) {
	method911(aByteArrayArray3160[arg0], 0);
	method908();
	int i
	    = method906(Class48.method1192(anIntArray3146.length - 1, 25039));
	boolean bool = aBooleanArray3154[i];
	int i_32_ = bool ? anInt3163 : anInt3143;
	boolean bool_33_ = false;
	boolean bool_34_ = false;
	if (bool) {
	    bool_33_ = method908() != 0;
	    bool_34_ = method908() != 0;
	}
	int i_35_ = i_32_ >> 1;
	int i_36_;
	int i_37_;
	int i_38_;
	if (bool && !bool_33_) {
	    i_36_ = (i_32_ >> 2) - (anInt3143 >> 2);
	    i_37_ = (i_32_ >> 2) + (anInt3143 >> 2);
	    i_38_ = anInt3143 >> 1;
	} else {
	    i_36_ = 0;
	    i_37_ = i_35_;
	    i_38_ = i_32_ >> 1;
	}
	int i_39_;
	int i_40_;
	int i_41_;
	if (bool && !bool_34_) {
	    i_39_ = i_32_ - (i_32_ >> 2) - (anInt3143 >> 2);
	    i_40_ = i_32_ - (i_32_ >> 2) + (anInt3143 >> 2);
	    i_41_ = anInt3143 >> 1;
	} else {
	    i_39_ = i_35_;
	    i_40_ = i_32_;
	    i_41_ = i_32_ >> 1;
	}
	Class147 class147 = aClass147Array3137[anIntArray3146[i]];
	int i_42_ = class147.anInt2366;
	int i_43_ = class147.anIntArray2367[i_42_];
	boolean bool_44_ = !aClass16Array3140[i_43_].method952();
	boolean bool_45_ = bool_44_;
	for (i_43_ = 0; i_43_ < class147.anInt2368; i_43_++) {
	    Class80 class80
		= aClass80Array3164[class147.anIntArray2369[i_43_]];
	    float[] fs = aFloatArray3153;
	    class80.method1393(fs, i_32_ >> 1, bool_45_);
	}
	if (!bool_44_) {
	    i_43_ = class147.anInt2366;
	    int i_46_ = class147.anIntArray2367[i_43_];
	    aClass16Array3140[i_46_].method949(aFloatArray3153, i_32_ >> 1);
	}
	if (bool_44_) {
	    for (i_43_ = i_32_ >> 1; i_43_ < i_32_; i_43_++)
		aFloatArray3153[i_43_] = 0.0F;
	} else {
	    i_43_ = i_32_ >> 1;
	    int i_47_ = i_32_ >> 2;
	    int i_48_ = i_32_ >> 3;
	    float[] fs = aFloatArray3153;
	    for (int i_49_ = 0; i_49_ < i_43_; i_49_++)
		fs[i_49_] *= 0.5F;
	    for (int i_50_ = i_43_; i_50_ < i_32_; i_50_++)
		fs[i_50_] = -fs[i_32_ - i_50_ - 1];
	    float[] fs_51_ = bool ? aFloatArray3149 : aFloatArray3150;
	    float[] fs_52_ = bool ? aFloatArray3152 : aFloatArray3158;
	    float[] fs_53_ = bool ? aFloatArray3138 : aFloatArray3142;
	    int[] is = bool ? anIntArray3161 : anIntArray3141;
	    for (int i_54_ = 0; i_54_ < i_47_; i_54_++) {
		float f = fs[4 * i_54_] - fs[i_32_ - 4 * i_54_ - 1];
		float f_55_ = fs[4 * i_54_ + 2] - fs[i_32_ - 4 * i_54_ - 3];
		float f_56_ = fs_51_[2 * i_54_];
		float f_57_ = fs_51_[2 * i_54_ + 1];
		fs[i_32_ - 4 * i_54_ - 1] = f * f_56_ - f_55_ * f_57_;
		fs[i_32_ - 4 * i_54_ - 3] = f * f_57_ + f_55_ * f_56_;
	    }
	    for (int i_58_ = 0; i_58_ < i_48_; i_58_++) {
		float f = fs[i_43_ + 3 + 4 * i_58_];
		float f_59_ = fs[i_43_ + 1 + 4 * i_58_];
		float f_60_ = fs[4 * i_58_ + 3];
		float f_61_ = fs[4 * i_58_ + 1];
		fs[i_43_ + 3 + 4 * i_58_] = f + f_60_;
		fs[i_43_ + 1 + 4 * i_58_] = f_59_ + f_61_;
		float f_62_ = fs_51_[i_43_ - 4 - 4 * i_58_];
		float f_63_ = fs_51_[i_43_ - 3 - 4 * i_58_];
		fs[4 * i_58_ + 3]
		    = (f - f_60_) * f_62_ - (f_59_ - f_61_) * f_63_;
		fs[4 * i_58_ + 1]
		    = (f_59_ - f_61_) * f_62_ + (f - f_60_) * f_63_;
	    }
	    int i_64_ = Class48.method1192(i_32_ - 1, 25039);
	    for (int i_65_ = 0; i_65_ < i_64_ - 3; i_65_++) {
		int i_66_ = i_32_ >> i_65_ + 2;
		int i_67_ = 8 << i_65_;
		for (int i_68_ = 0; i_68_ < 2 << i_65_; i_68_++) {
		    int i_69_ = i_32_ - i_66_ * 2 * i_68_;
		    int i_70_ = i_32_ - i_66_ * (2 * i_68_ + 1);
		    for (int i_71_ = 0; i_71_ < i_32_ >> i_65_ + 4; i_71_++) {
			int i_72_ = 4 * i_71_;
			float f = fs[i_69_ - 1 - i_72_];
			float f_73_ = fs[i_69_ - 3 - i_72_];
			float f_74_ = fs[i_70_ - 1 - i_72_];
			float f_75_ = fs[i_70_ - 3 - i_72_];
			fs[i_69_ - 1 - i_72_] = f + f_74_;
			fs[i_69_ - 3 - i_72_] = f_73_ + f_75_;
			float f_76_ = fs_51_[i_71_ * i_67_];
			float f_77_ = fs_51_[i_71_ * i_67_ + 1];
			fs[i_70_ - 1 - i_72_]
			    = (f - f_74_) * f_76_ - (f_73_ - f_75_) * f_77_;
			fs[i_70_ - 3 - i_72_]
			    = (f_73_ - f_75_) * f_76_ + (f - f_74_) * f_77_;
		    }
		}
	    }
	    for (int i_78_ = 1; i_78_ < i_48_ - 1; i_78_++) {
		int i_79_ = is[i_78_];
		if (i_78_ < i_79_) {
		    int i_80_ = 8 * i_78_;
		    int i_81_ = 8 * i_79_;
		    float f = fs[i_80_ + 1];
		    fs[i_80_ + 1] = fs[i_81_ + 1];
		    fs[i_81_ + 1] = f;
		    f = fs[i_80_ + 3];
		    fs[i_80_ + 3] = fs[i_81_ + 3];
		    fs[i_81_ + 3] = f;
		    f = fs[i_80_ + 5];
		    fs[i_80_ + 5] = fs[i_81_ + 5];
		    fs[i_81_ + 5] = f;
		    f = fs[i_80_ + 7];
		    fs[i_80_ + 7] = fs[i_81_ + 7];
		    fs[i_81_ + 7] = f;
		}
	    }
	    for (int i_82_ = 0; i_82_ < i_43_; i_82_++)
		fs[i_82_] = fs[2 * i_82_ + 1];
	    for (int i_83_ = 0; i_83_ < i_48_; i_83_++) {
		fs[i_32_ - 1 - 2 * i_83_] = fs[4 * i_83_];
		fs[i_32_ - 2 - 2 * i_83_] = fs[4 * i_83_ + 1];
		fs[i_32_ - i_47_ - 1 - 2 * i_83_] = fs[4 * i_83_ + 2];
		fs[i_32_ - i_47_ - 2 - 2 * i_83_] = fs[4 * i_83_ + 3];
	    }
	    for (int i_84_ = 0; i_84_ < i_48_; i_84_++) {
		float f = fs_53_[2 * i_84_];
		float f_85_ = fs_53_[2 * i_84_ + 1];
		float f_86_ = fs[i_43_ + 2 * i_84_];
		float f_87_ = fs[i_43_ + 2 * i_84_ + 1];
		float f_88_ = fs[i_32_ - 2 - 2 * i_84_];
		float f_89_ = fs[i_32_ - 1 - 2 * i_84_];
		float f_90_ = f_85_ * (f_86_ - f_88_) + f * (f_87_ + f_89_);
		fs[i_43_ + 2 * i_84_] = (f_86_ + f_88_ + f_90_) * 0.5F;
		fs[i_32_ - 2 - 2 * i_84_] = (f_86_ + f_88_ - f_90_) * 0.5F;
		f_90_ = f_85_ * (f_87_ + f_89_) - f * (f_86_ - f_88_);
		fs[i_43_ + 2 * i_84_ + 1] = (f_87_ - f_89_ + f_90_) * 0.5F;
		fs[i_32_ - 1 - 2 * i_84_] = (-f_87_ + f_89_ + f_90_) * 0.5F;
	    }
	    for (int i_91_ = 0; i_91_ < i_47_; i_91_++) {
		fs[i_91_]
		    = (fs[2 * i_91_ + i_43_] * fs_52_[2 * i_91_]
		       + fs[2 * i_91_ + 1 + i_43_] * fs_52_[2 * i_91_ + 1]);
		fs[i_43_ - 1 - i_91_]
		    = (fs[2 * i_91_ + i_43_] * fs_52_[2 * i_91_ + 1]
		       - fs[2 * i_91_ + 1 + i_43_] * fs_52_[2 * i_91_]);
	    }
	    for (int i_92_ = 0; i_92_ < i_47_; i_92_++)
		fs[i_32_ - i_47_ + i_92_] = -fs[i_92_];
	    for (int i_93_ = 0; i_93_ < i_47_; i_93_++)
		fs[i_93_] = fs[i_47_ + i_93_];
	    for (int i_94_ = 0; i_94_ < i_47_; i_94_++)
		fs[i_47_ + i_94_] = -fs[i_47_ - i_94_ - 1];
	    for (int i_95_ = 0; i_95_ < i_47_; i_95_++)
		fs[i_43_ + i_95_] = fs[i_32_ - i_95_ - 1];
	    for (int i_96_ = i_36_; i_96_ < i_37_; i_96_++) {
		float f = (float) Math.sin(((double) (i_96_ - i_36_) + 0.5)
					   / (double) i_38_ * 0.5
					   * 3.141592653589793);
		aFloatArray3153[i_96_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	    for (int i_97_ = i_39_; i_97_ < i_40_; i_97_++) {
		float f = (float) Math.sin((((double) (i_97_ - i_39_) + 0.5)
					    / (double) i_41_ * 0.5
					    * 3.141592653589793)
					   + 1.5707963267948966);
		aFloatArray3153[i_97_]
		    *= (float) Math.sin(1.5707963267948966 * (double) f
					* (double) f);
	    }
	}
	float[] fs = null;
	if (anInt3148 > 0) {
	    int i_98_ = anInt3148 + i_32_ >> 2;
	    fs = new float[i_98_];
	    if (!aBoolean3151) {
		for (int i_99_ = 0; i_99_ < anInt3162; i_99_++) {
		    int i_100_ = (anInt3148 >> 1) + i_99_;
		    fs[i_99_] += aFloatArray3147[i_100_];
		}
	    }
	    if (!bool_44_) {
		for (int i_101_ = i_36_; i_101_ < i_32_ >> 1; i_101_++) {
		    int i_102_ = fs.length - (i_32_ >> 1) + i_101_;
		    fs[i_102_] += aFloatArray3153[i_101_];
		}
	    }
	}
	float[] fs_103_ = aFloatArray3147;
	aFloatArray3147 = aFloatArray3153;
	aFloatArray3153 = fs_103_;
	anInt3148 = i_32_;
	anInt3162 = i_40_ - (i_32_ >> 1);
	aBoolean3151 = bool_44_;
	return fs;
    }
    
    public static void method914() {
	aByteArray3157 = null;
	aClass78Array3159 = null;
	aClass16Array3140 = null;
	aClass80Array3164 = null;
	aClass147Array3137 = null;
	aBooleanArray3154 = null;
	anIntArray3146 = null;
	aFloatArray3153 = null;
	aFloatArray3150 = null;
	aFloatArray3158 = null;
	aFloatArray3142 = null;
	aFloatArray3149 = null;
	aFloatArray3152 = null;
	aFloatArray3138 = null;
	anIntArray3141 = null;
	anIntArray3161 = null;
    }
    
    public Class14_Sub24(byte[] arg0) {
	method912(arg0);
    }
}
