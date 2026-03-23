/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class145
{
    public static float[][] aFloatArrayArray2342 = new float[2][8];
    public int[] anIntArray2343 = new int[2];
    public static float aFloat2344;
    public static int[][] anIntArrayArray2345 = new int[2][8];
    public int[] anIntArray2346 = new int[2];
    public static int anInt2347;
    public int[][][] anIntArrayArrayArray2348;
    public int[][][] anIntArrayArrayArray2349 = new int[2][2][4];
    
    public int method1984(int arg0, float arg1) {
	if (arg0 == 0) {
	    float f
		= ((float) anIntArray2343[0]
		   + (float) (anIntArray2343[1] - anIntArray2343[0]) * arg1);
	    f *= 0.0030517578F;
	    aFloat2344 = (float) Math.pow(0.1, (double) (f / 20.0F));
	    anInt2347 = (int) (aFloat2344 * 65536.0F);
	}
	if (anIntArray2346[arg0] == 0)
	    return 0;
	float f = method1986(arg0, 0, arg1);
	aFloatArrayArray2342[arg0][0]
	    = -2.0F * f * (float) Math.cos((double) method1985(arg0, 0, arg1));
	aFloatArrayArray2342[arg0][1] = f * f;
	for (int i = 1; i < anIntArray2346[arg0]; i++) {
	    f = method1986(arg0, i, arg1);
	    float f_0_
		= (-2.0F * f
		   * (float) Math.cos((double) method1985(arg0, i, arg1)));
	    float f_1_ = f * f;
	    aFloatArrayArray2342[arg0][i * 2 + 1]
		= aFloatArrayArray2342[arg0][i * 2 - 1] * f_1_;
	    aFloatArrayArray2342[arg0][i * 2]
		= (aFloatArrayArray2342[arg0][i * 2 - 1] * f_0_
		   + aFloatArrayArray2342[arg0][i * 2 - 2] * f_1_);
	    for (int i_2_ = i * 2 - 1; i_2_ >= 2; i_2_--)
		aFloatArrayArray2342[arg0][i_2_]
		    += (aFloatArrayArray2342[arg0][i_2_ - 1] * f_0_
			+ aFloatArrayArray2342[arg0][i_2_ - 2] * f_1_);
	    aFloatArrayArray2342[arg0][1]
		+= aFloatArrayArray2342[arg0][0] * f_0_ + f_1_;
	    aFloatArrayArray2342[arg0][0] += f_0_;
	}
	if (arg0 == 0) {
	    for (int i = 0; i < anIntArray2346[0] * 2; i++)
		aFloatArrayArray2342[0][i] *= aFloat2344;
	}
	for (int i = 0; i < anIntArray2346[arg0] * 2; i++)
	    anIntArrayArray2345[arg0][i]
		= (int) (aFloatArrayArray2342[arg0][i] * 65536.0F);
	return anIntArray2346[arg0] * 2;
    }
    
    public float method1985(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2348[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2348[arg0][1][arg1]
				 - anIntArrayArrayArray2348[arg0][0][arg1]));
	f *= 1.2207031E-4F;
	return method1989(f);
    }
    
    public float method1986(int arg0, int arg1, float arg2) {
	float f
	    = ((float) anIntArrayArrayArray2349[arg0][0][arg1]
	       + arg2 * (float) (anIntArrayArrayArray2349[arg0][1][arg1]
				 - anIntArrayArrayArray2349[arg0][0][arg1]));
	f *= 0.0015258789F;
	return 1.0F - (float) Math.pow(10.0, (double) (-f / 20.0F));
    }
    
    public static void method1987() {
	aFloatArrayArray2342 = null;
	anIntArrayArray2345 = null;
    }
    
    public void method1988(Class14_Sub10 arg0, Class93 arg1) {
	int i = arg0.method798(71);
	anIntArray2346[0] = i >> 4;
	anIntArray2346[1] = i & 0xf;
	if (i != 0) {
	    anIntArray2343[0] = arg0.method784((byte) 107);
	    anIntArray2343[1] = arg0.method784((byte) 103);
	    int i_3_ = arg0.method798(-81);
	    for (int i_4_ = 0; i_4_ < 2; i_4_++) {
		for (int i_5_ = 0; i_5_ < anIntArray2346[i_4_]; i_5_++) {
		    anIntArrayArrayArray2348[i_4_][0][i_5_]
			= arg0.method784((byte) 108);
		    anIntArrayArrayArray2349[i_4_][0][i_5_]
			= arg0.method784((byte) 121);
		}
	    }
	    for (int i_6_ = 0; i_6_ < 2; i_6_++) {
		for (int i_7_ = 0; i_7_ < anIntArray2346[i_6_]; i_7_++) {
		    if ((i_3_ & 1 << i_6_ * 4 << i_7_) != 0) {
			anIntArrayArrayArray2348[i_6_][1][i_7_]
			    = arg0.method784((byte) 108);
			anIntArrayArrayArray2349[i_6_][1][i_7_]
			    = arg0.method784((byte) 125);
		    } else {
			anIntArrayArrayArray2348[i_6_][1][i_7_]
			    = anIntArrayArrayArray2348[i_6_][0][i_7_];
			anIntArrayArrayArray2349[i_6_][1][i_7_]
			    = anIntArrayArrayArray2349[i_6_][0][i_7_];
		    }
		}
	    }
	    if (i_3_ != 0 || anIntArray2343[1] != anIntArray2343[0])
		arg1.method1466(arg0);
	} else
	    anIntArray2343[0] = anIntArray2343[1] = 0;
    }
    
    public static float method1989(float arg0) {
	float f = 32.703197F * (float) Math.pow(2.0, (double) arg0);
	return f * 3.1415927F / 11025.0F;
    }
    
    public Class145() {
	anIntArrayArrayArray2348 = new int[2][2][4];
    }
}
