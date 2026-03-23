/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class10
{
    public static Class73[] aClass73Array247 = new Class73[255];
    public static int anInt248;
    public static int anInt249;
    public static int anInt250;
    public static int anInt251 = 0;
    public static int[] anIntArray252 = new int[4];
    public static boolean[] aBooleanArray253 = new boolean[4];
    public static int[][][] anIntArrayArrayArray254;
    public static boolean[] aBooleanArray255;
    public static int anInt256;
    public static float[] aFloatArray257;
    public static int anInt258;
    public static int[] anIntArray259 = new int[4];
    public static int anInt260;
    public static int anInt261;
    public static int anInt262;
    
    public static void method187(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	if (Class7_Sub1.aBoolean2661
	    && (anInt248 != arg3 || anInt250 != arg4 || anInt256 != arg5
		|| anInt261 != arg4 || anInt258 != arg5)) {
	    for (int i = 0; i < 4; i++)
		aBooleanArray253[i] = false;
	    int i = 0;
	    int i_0_ = anIntArrayArrayArray254[arg3][arg4][arg5];
	while_108_:
	    while (i_0_ != 0) {
		int i_1_ = (i_0_ & 0xff) - 1;
		i_0_ >>>= 8;
		for (int i_2_ = 0; i_2_ < 4; i_2_++) {
		    if (i_1_ == anIntArray259[i_2_]) {
			aBooleanArray253[i_2_] = true;
			continue while_108_;
		    }
		}
		anIntArray252[i++] = i_1_;
	    }
	    for (int i_3_ = 0; i_3_ < i; i_3_++) {
		for (int i_4_ = 0; i_4_ < 4; i_4_++) {
		    if (!aBooleanArray253[i_4_]) {
			anIntArray259[i_4_] = anIntArray252[i_3_];
			aBooleanArray253[i_4_] = true;
			method197(i_4_, aClass73Array247[anIntArray252[i_3_]],
				  arg0, arg1, arg2);
			break;
		    }
		}
	    }
	    for (int i_5_ = 0; i_5_ < 4; i_5_++) {
		if (!aBooleanArray253[i_5_]) {
		    anIntArray259[i_5_] = -1;
		    method198(i_5_);
		}
	    }
	    anInt248 = arg3;
	    anInt250 = arg4;
	    anInt256 = arg5;
	    anInt261 = arg4;
	    anInt258 = arg5;
	}
    }
    
    public static void method188() {
	for (int i = 0; i < 4; i++) {
	    anIntArray259[i] = -1;
	    method198(i);
	}
    }
    
    public static void method189(int arg0, int arg1, int arg2) {
	anInt262 = arg0;
	anInt260 = arg1;
	anInt249 = arg2;
	anIntArrayArrayArray254 = new int[anInt262][anInt260][anInt249];
    }
    
    public static void method190(int arg0, boolean arg1) {
	for (int i = 0; i < anInt251; i++)
	    aClass73Array247[i].method1326(arg0, (byte) -100, arg1);
	anInt248 = -1;
	anInt250 = -1;
	anInt256 = -1;
	anInt261 = -1;
	anInt258 = -1;
    }
    
    public static void method191() {
	aClass73Array247 = null;
	anIntArrayArrayArray254 = null;
	anIntArray259 = null;
	aBooleanArray255 = null;
	aFloatArray257 = null;
	anIntArray252 = null;
	aBooleanArray253 = null;
    }
    
    public static void method192(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	if (Class7_Sub1.aBoolean2661) {
	    if (arg0 == 1 && arg5 > 0)
		method187(arg1, arg2, arg3, arg4, arg5 - 1, arg6);
	    else if (arg0 == 4 && arg5 < anInt260 - 1)
		method187(arg1, arg2, arg3, arg4, arg5 + 1, arg6);
	    else if (arg0 == 8 && arg6 > 0)
		method187(arg1, arg2, arg3, arg4, arg5, arg6 - 1);
	    else if (arg0 == 2 && arg6 < anInt249 - 1)
		method187(arg1, arg2, arg3, arg4, arg5, arg6 + 1);
	    else if (arg0 == 16 && arg5 > 0 && arg6 < anInt249 - 1)
		method187(arg1, arg2, arg3, arg4, arg5 - 1, arg6 + 1);
	    else if (arg0 == 32 && arg5 < anInt260 - 1 && arg6 < anInt249 - 1)
		method187(arg1, arg2, arg3, arg4, arg5 + 1, arg6 + 1);
	    else if (arg0 == 128 && arg5 > 0 && arg6 > 0)
		method187(arg1, arg2, arg3, arg4, arg5 - 1, arg6 - 1);
	    else if (arg0 == 64 && arg5 < anInt260 - 1 && arg6 > 0)
		method187(arg1, arg2, arg3, arg4, arg5 + 1, arg6 - 1);
	}
    }
    
    public static void method193(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (Class7_Sub1.aBoolean2661
	    && (anInt248 != arg3 || anInt250 != arg4 || anInt256 != arg5
		|| anInt261 != arg6 || anInt258 != arg7)) {
	    for (int i = 0; i < 4; i++)
		aBooleanArray253[i] = false;
	    int i = 0;
	    int i_6_ = 0;
	while_110_:
	    for (int i_7_ = arg4; i_7_ <= arg6; i_7_++) {
		for (int i_8_ = arg5; i_8_ <= arg7; i_8_++) {
		    int i_9_ = anIntArrayArrayArray254[arg3][i_7_][i_8_];
		while_109_:
		    while (i_9_ != 0) {
			int i_10_ = (i_9_ & 0xff) - 1;
			i_9_ >>>= 8;
			for (int i_11_ = 0; i_11_ < i_6_; i_11_++) {
			    if (i_10_ == anIntArray252[i_11_])
				continue while_109_;
			}
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
			    if (i_10_ == anIntArray259[i_12_]) {
				if (!aBooleanArray253[i_12_]) {
				    aBooleanArray253[i_12_] = true;
				    if (++i == 4)
					break while_110_;
				}
				continue while_109_;
			    }
			}
			anIntArray252[i_6_++] = i_10_;
			if (++i == 4)
			    break while_110_;
		    }
		}
	    }
	    for (int i_13_ = 0; i_13_ < i_6_; i_13_++) {
		for (int i_14_ = 0; i_14_ < 4; i_14_++) {
		    if (!aBooleanArray253[i_14_]) {
			anIntArray259[i_14_] = anIntArray252[i_13_];
			aBooleanArray253[i_14_] = true;
			method197(i_14_,
				  aClass73Array247[anIntArray252[i_13_]], arg0,
				  arg1, arg2);
			break;
		    }
		}
	    }
	    for (int i_15_ = 0; i_15_ < 4; i_15_++) {
		if (!aBooleanArray253[i_15_]) {
		    anIntArray259[i_15_] = -1;
		    method198(i_15_);
		}
	    }
	    anInt248 = arg3;
	    anInt250 = arg4;
	    anInt256 = arg5;
	    anInt261 = arg6;
	    anInt258 = arg7;
	}
    }
    
    public static void method194() {
	GL gl = Class121.aGL2030;
	for (int i = 0; i < 4; i++) {
	    int i_16_ = 16388 + i;
	    gl.glLightfv(i_16_, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F },
			 0);
	    gl.glLightf(i_16_, 4616, 0.0F);
	    gl.glLightf(i_16_, 4615, 0.0F);
	}
    }
    
    public static void method195(int arg0, int arg1,
				 Class14_Sub29[][][] arg2) {
	if (Class7_Sub1.aBoolean2661) {
	    GL gl = Class121.aGL2030;
	    Class132.method1778(0, (byte) 1, 0);
	    Class121.method1638(0);
	    Class121.method1651();
	    Class121.method1632(Class121.anInt2038);
	    gl.glDepthMask(false);
	    Class121.method1639(false);
	    gl.glBlendFunc(774, 1);
	    gl.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
	    gl.glTexEnvi(8960, 34176, 34166);
	    gl.glTexEnvi(8960, 34192, 770);
	    for (int i = 0; i < anInt251; i++) {
		Class73 class73 = aClass73Array247[i];
		if (class73.aClass130_1103 != null) {
		    int i_17_ = 0;
		    int i_18_ = (class73.anInt1124 >> 7) - class73.anInt1120;
		    int i_19_ = (class73.anInt1124 >> 7) + class73.anInt1120;
		    if (i_19_ >= Class14_Sub8_Sub26.anInt4526)
			i_19_ = Class14_Sub8_Sub26.anInt4526 - 1;
		    if (i_18_ < Class14_Sub9_Sub3.anInt4849) {
			i_17_ += Class14_Sub9_Sub3.anInt4849 - i_18_;
			i_18_ = Class14_Sub9_Sub3.anInt4849;
		    }
		while_111_:
		    for (int i_20_ = i_18_; i_20_ <= i_19_; i_20_++) {
			int i_21_ = class73.aShortArray1106[i_17_++];
			int i_22_ = ((class73.anInt1128 >> 7)
				     - class73.anInt1120 + (i_21_ >> 8));
			int i_23_ = i_22_ + (i_21_ & 0xff) - 1;
			if (i_22_ < Class7_Sub1.anInt2659)
			    i_22_ = Class7_Sub1.anInt2659;
			if (i_23_ >= Class14_Sub8_Sub37.anInt4722)
			    i_23_ = Class14_Sub8_Sub37.anInt4722 - 1;
			for (int i_24_ = i_22_; i_24_ <= i_23_; i_24_++) {
			    Class14_Sub29 class14_sub29
				= arg2[class73.anInt1125][i_24_][i_20_];
			    if (class14_sub29 != null
				&& class14_sub29.aBoolean3235) {
				Class121.method1640(201.5F
						    - ((float) (class73
								.anInt1125)
						       * 50.0F)
						    - 1.5F);
				gl.glTexEnvfv(8960, 8705,
					      (new float[]
					       { 0.0F, 0.0F, 0.0F,
						 class73.aFloat1107 }),
					      0);
				class73.aClass130_1103.method1768();
				break while_111_;
			    }
			}
		    }
		}
	    }
	    gl.glTexEnvi(8960, 34176, 5890);
	    gl.glTexEnvi(8960, 34192, 768);
	    gl.glBlendFunc(770, 771);
	    gl.glDepthMask(true);
	    gl.glFogfv(2918, Class57.aFloatArray933, 0);
	    gl.glEnableClientState(32888);
	    Class121.method1645();
	}
    }
    
    public static void method196(int arg0, int arg1, int arg2, int arg3,
				 int arg4) {
	if (Class7_Sub1.aBoolean2661) {
	while_113_:
	    for (int i = 0; i < 4; i++) {
		if (anIntArray259[i] != -1) {
		    int i_25_ = anIntArrayArrayArray254[arg0][arg1][arg2];
		    while (i_25_ != 0) {
			int i_26_ = (i_25_ & 0xff) - 1;
			i_25_ >>>= 8;
			if (i_26_ == anIntArray259[i])
			    continue while_113_;
		    }
		    i_25_ = anIntArrayArrayArray254[arg0][arg3][arg4];
		    while (i_25_ != 0) {
			int i_27_ = (i_25_ & 0xff) - 1;
			i_25_ >>>= 8;
			if (i_27_ == anIntArray259[i])
			    continue while_113_;
		    }
		}
		anIntArray259[i] = -1;
		method198(i);
	    }
	}
    }
    
    public static void method197(int arg0, Class73 arg1, int arg2, int arg3,
				 int arg4) {
	int i = arg0 + 16384 + 4;
	GL gl = Class121.aGL2030;
	if (!aBooleanArray255[arg0]) {
	    gl.glEnable(i);
	    aBooleanArray255[arg0] = true;
	}
	gl.glLightf(i, 4617, arg1.aFloat1111);
	gl.glLightfv(i, 4609, arg1.aFloatArray1131, 0);
	aFloatArray257[0] = (float) (arg1.anInt1128 - arg2);
	aFloatArray257[1] = (float) (arg1.anInt1104 - arg3);
	aFloatArray257[2] = (float) (arg1.anInt1124 - arg4);
	gl.glLightfv(i, 4611, aFloatArray257, 0);
    }
    
    public static void method198(int arg0) {
	if (aBooleanArray255[arg0]) {
	    aBooleanArray255[arg0] = false;
	    int i = arg0 + 16384 + 4;
	    GL gl = Class121.aGL2030;
	    gl.glDisable(i);
	}
    }
    
    public static void method199() {
	for (int i = 0; i < anInt251; i++) {
	    Class73 class73 = aClass73Array247[i];
	    int i_28_ = class73.anInt1125;
	    if (class73.aBoolean1112)
		i_28_ = 0;
	    int i_29_ = class73.anInt1125;
	    if (class73.aBoolean1123)
		i_29_ = 3;
	    for (int i_30_ = i_28_; i_30_ <= i_29_; i_30_++) {
		int i_31_ = 0;
		int i_32_ = (class73.anInt1124 >> 7) - class73.anInt1120;
		if (i_32_ < 0) {
		    i_31_ -= i_32_;
		    i_32_ = 0;
		}
		int i_33_ = (class73.anInt1124 >> 7) + class73.anInt1120;
		if (i_33_ > anInt249 - 1)
		    i_33_ = anInt249 - 1;
		for (int i_34_ = i_32_; i_34_ <= i_33_; i_34_++) {
		    int i_35_ = class73.aShortArray1106[i_31_++];
		    int i_36_ = ((class73.anInt1128 >> 7) - class73.anInt1120
				 + (i_35_ >> 8));
		    int i_37_ = i_36_ + (i_35_ & 0xff) - 1;
		    if (i_36_ < 0)
			i_36_ = 0;
		    if (i_37_ > anInt260 - 1)
			i_37_ = anInt260 - 1;
		    for (int i_38_ = i_36_; i_38_ <= i_37_; i_38_++) {
			int i_39_
			    = anIntArrayArrayArray254[i_30_][i_38_][i_34_];
			if ((i_39_ & 0xff) == 0)
			    anIntArrayArrayArray254[i_30_][i_38_][i_34_]
				= i_39_ | i + 1;
			else if ((i_39_ & 0xff00) == 0)
			    anIntArrayArrayArray254[i_30_][i_38_][i_34_]
				= i_39_ | i + 1 << 8;
			else if ((i_39_ & 0xff0000) == 0)
			    anIntArrayArrayArray254[i_30_][i_38_][i_34_]
				= i_39_ | i + 1 << 16;
			else if ((i_39_ & ~0xffffff) == 0)
			    anIntArrayArrayArray254[i_30_][i_38_][i_34_]
				= i_39_ | i + 1 << 24;
		    }
		}
	    }
	}
    }
    
    public static void method200(Class73 arg0) {
	if (anInt251 >= 255)
	    System.out.println("Number of lights added exceeds maximum!");
	else
	    aClass73Array247[anInt251++] = arg0;
    }
    
    public static void method201() {
	anInt251 = 0;
	for (int i = 0; i < anInt262; i++) {
	    for (int i_40_ = 0; i_40_ < anInt260; i_40_++) {
		for (int i_41_ = 0; i_41_ < anInt249; i_41_++)
		    anIntArrayArrayArray254[i][i_40_][i_41_] = 0;
	    }
	}
    }
    
    static {
	aBooleanArray255 = new boolean[4];
	aFloatArray257 = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
    }
}
