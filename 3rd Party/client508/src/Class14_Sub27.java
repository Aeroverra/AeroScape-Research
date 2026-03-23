/* Class14_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

public class Class14_Sub27 extends Class14
{
    public int anInt3180 = 0;
    public int anInt3181;
    public Class29 aClass29_3182;
    public int[] anIntArray3183;
    public int[][] anIntArrayArray3184;
    public float[] aFloatArray3185;
    public static Class14_Sub10 aClass14_Sub10_3186;
    public int anInt3187 = 0;
    public float[] aFloatArray3188;
    public static Class14_Sub10 aClass14_Sub10_3189;
    public int anInt3190;
    public int[] anIntArray3191;
    public static ByteBuffer aByteBuffer3192;
    public float[] aFloatArray3193;
    public boolean[] aBooleanArray3194;
    public Class55 aClass55_3195;
    public int[] anIntArray3196;
    public int[] anIntArray3197;
    public float[] aFloatArray3198;
    public int[] anIntArray3199;
    public static ByteBuffer aByteBuffer3200;
    public boolean aBoolean3201;
    public int anInt3202;
    public int[][] anIntArrayArray3203;
    public int anInt3204;
    public int[] anIntArray3205;
    public ByteBuffer aByteBuffer3206;
    public int[] anIntArray3207;
    public int anInt3208;
    public boolean aBoolean3209;
    public int anInt3210;
    public float aFloat3211;
    
    public int method920(int arg0, int arg1, int arg2, int[] arg3, int[] arg4,
			 boolean arg5) {
	if (aBoolean3201) {
	    anIntArrayArray3203[anInt3187] = arg4;
	    aBooleanArray3194[anInt3187] = arg5;
	    if (arg4 != null)
		anInt3210 += arg4.length;
	    if (arg5)
		anInt3210 += 3 * (arg3.length - 2);
	    else
		anInt3208 += 3 * (arg3.length - 2);
	} else
	    anInt3208 += 3 * (arg3.length - 2);
	anIntArray3196[anInt3187] = arg0;
	anIntArray3199[anInt3187] = arg1;
	anIntArray3205[anInt3187] = arg2;
	anIntArrayArray3184[anInt3187] = arg3;
	return anInt3187++;
    }
    
    public int method921(int arg0, int arg1, int arg2, float arg3, float arg4,
			 float arg5, int arg6, float arg7) {
	long l = 0L;
	if ((arg0 & 0x7f) == 0 || (arg2 & 0x7f) == 0) {
	    l = (long) (arg0 + (arg2 << 16)) + ((long) arg6 << 32);
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass55_3195.method1230(l, (byte) -8);
	    if (class14_sub1 != null) {
		if (arg1 < anIntArray3183[class14_sub1.anInt2714])
		    anIntArray3183[class14_sub1.anInt2714] = arg1;
		return class14_sub1.anInt2714;
	    }
	}
	anIntArray3197[anInt3202] = arg0;
	anIntArray3183[anInt3202] = arg1;
	anIntArray3191[anInt3202] = arg2;
	if (aBoolean3209)
	    aFloatArray3188[anInt3202] = arg7;
	aFloatArray3198[anInt3202] = arg3;
	aFloatArray3193[anInt3202] = arg4;
	aFloatArray3185[anInt3202] = arg5;
	anIntArray3207[anInt3202] = arg6;
	if (l != 0L)
	    aClass55_3195.method1224(8, l, new Class14_Sub1(anInt3202));
	return anInt3202++;
    }
    
    public void method922(Class14_Sub29[][][] arg0, float arg1, boolean arg2) {
	if (aClass14_Sub10_3186 == null
	    || aClass14_Sub10_3186.aByteArray2895.length < anInt3208 * 4)
	    aClass14_Sub10_3186 = new Class14_Sub10(anInt3208 * 4);
	else
	    aClass14_Sub10_3186.anInt2908 = 0;
	if (aClass14_Sub10_3189 == null
	    || aClass14_Sub10_3189.aByteArray2895.length < anInt3210 * 4)
	    aClass14_Sub10_3189 = new Class14_Sub10(anInt3210 * 4);
	else
	    aClass14_Sub10_3189.anInt2908 = 0;
	if (Class121.aBoolean2046) {
	    for (int i = 0; i < anInt3187; i++) {
		Class14_Sub29 class14_sub29
		    = (arg0[anIntArray3196[i]][anIntArray3199[i]]
		       [anIntArray3205[i]]);
		if (class14_sub29 != null && class14_sub29.aBoolean3235) {
		    int[] is = anIntArrayArray3184[i];
		    Class14_Sub10 class14_sub10;
		    if (aBoolean3201) {
			int[] is_0_ = anIntArrayArray3203[i];
			if (is_0_ != null) {
			    for (int i_1_ = 0; i_1_ < is_0_.length; i_1_++)
				aClass14_Sub10_3189.method803(is_0_[i_1_],
							      110);
			}
			class14_sub10
			    = (aBooleanArray3194[i] ? aClass14_Sub10_3189
			       : aClass14_Sub10_3186);
		    } else
			class14_sub10 = aClass14_Sub10_3186;
		    for (int i_2_ = 1; i_2_ < is.length - 1; i_2_++) {
			class14_sub10.method803(is[0], 121);
			class14_sub10.method803(is[i_2_], 103);
			class14_sub10.method803(is[i_2_ + 1], 111);
		    }
		}
	    }
	} else {
	    for (int i = 0; i < anInt3187; i++) {
		Class14_Sub29 class14_sub29
		    = (arg0[anIntArray3196[i]][anIntArray3199[i]]
		       [anIntArray3205[i]]);
		if (class14_sub29 != null && class14_sub29.aBoolean3235) {
		    int[] is = anIntArrayArray3184[i];
		    Class14_Sub10 class14_sub10;
		    if (aBoolean3201) {
			int[] is_3_ = anIntArrayArray3203[i];
			if (is_3_ != null) {
			    for (int i_4_ = 0; i_4_ < is_3_.length; i_4_++)
				aClass14_Sub10_3189.method825(-73,
							      is_3_[i_4_]);
			}
			class14_sub10
			    = (aBooleanArray3194[i] ? aClass14_Sub10_3189
			       : aClass14_Sub10_3186);
		    } else
			class14_sub10 = aClass14_Sub10_3186;
		    for (int i_5_ = 1; i_5_ < is.length - 1; i_5_++) {
			class14_sub10.method825(-117, is[0]);
			class14_sub10.method825(-94, is[i_5_]);
			class14_sub10.method825(-85, is[i_5_ + 1]);
		    }
		}
	    }
	}
	if (aClass14_Sub10_3186.anInt2908 != 0
	    || aClass14_Sub10_3189.anInt2908 != 0) {
	    GL gl = Class121.aGL2030;
	    if (anInt3204 == -1 || arg2) {
		Class121.method1632(-1);
		Class132.method1778(0, (byte) -48, 0);
	    } else
		Class3.anInterface3_117.method16(anInt3204, (byte) 97);
	    int i = aBoolean3209 ? 40 : 36;
	    if (aClass29_3182 != null) {
		aClass29_3182.method1053();
		gl.glVertexPointer(3, 5126, i, 0L);
		gl.glColorPointer(4, 5121, i, 12L);
		if (Class7_Sub1.aBoolean2661)
		    gl.glNormalPointer(5126, i, 16L);
		gl.glTexCoordPointer(2, 5126, i, 28L);
		if (aBoolean3209) {
		    gl.glClientActiveTexture(Class8.method144());
		    gl.glTexCoordPointer(1, 5126, i, 36L);
		    gl.glClientActiveTexture(33984);
		}
	    } else {
		if (Class121.aBoolean2021)
		    gl.glBindBufferARB(34962, 0);
		aByteBuffer3206.position(0);
		gl.glVertexPointer(3, 5126, i, aByteBuffer3206);
		aByteBuffer3206.position(12);
		gl.glColorPointer(4, 5121, i, aByteBuffer3206);
		if (Class7_Sub1.aBoolean2661) {
		    aByteBuffer3206.position(16);
		    gl.glNormalPointer(5126, i, aByteBuffer3206);
		}
		aByteBuffer3206.position(28);
		gl.glTexCoordPointer(2, 5126, i, aByteBuffer3206);
		if (aBoolean3209) {
		    gl.glClientActiveTexture(Class8.method144());
		    aByteBuffer3206.position(36);
		    gl.glTexCoordPointer(1, 5126, i, aByteBuffer3206);
		    gl.glClientActiveTexture(33984);
		}
	    }
	    if (Class121.aBoolean2021)
		gl.glBindBufferARB(34963, 0);
	    if (aClass14_Sub10_3186.anInt2908 != 0) {
		if (aByteBuffer3200 == null
		    || (aByteBuffer3200.capacity()
			< aClass14_Sub10_3186.anInt2908))
		    aByteBuffer3200 = ByteBuffer.allocateDirect
					  (aClass14_Sub10_3186.anInt2908)
					  .order(ByteOrder.nativeOrder());
		else
		    aByteBuffer3200.clear();
		aByteBuffer3200.put(aClass14_Sub10_3186.aByteArray2895, 0,
				    aClass14_Sub10_3186.anInt2908);
		aByteBuffer3200.flip();
		Class121.method1640(arg1);
		gl.glDrawElements(4, aClass14_Sub10_3186.anInt2908 / 4, 5125,
				  aByteBuffer3200);
	    }
	    if (aClass14_Sub10_3189.anInt2908 != 0) {
		if (aByteBuffer3192 == null
		    || (aByteBuffer3192.capacity()
			< aClass14_Sub10_3189.anInt2908))
		    aByteBuffer3192 = ByteBuffer.allocateDirect
					  (aClass14_Sub10_3189.anInt2908)
					  .order(ByteOrder.nativeOrder());
		else
		    aByteBuffer3192.clear();
		aByteBuffer3192.put(aClass14_Sub10_3189.aByteArray2895, 0,
				    aClass14_Sub10_3189.anInt2908);
		aByteBuffer3192.flip();
		Class121.method1640(arg1 - 100.0F);
		Class121.method1646();
		gl.glDrawElements(4, aClass14_Sub10_3189.anInt2908 / 4, 5125,
				  aByteBuffer3192);
		Class121.method1625();
	    }
	}
    }
    
    public static void method923() {
	aClass14_Sub10_3186 = null;
	aClass14_Sub10_3189 = null;
	aByteBuffer3200 = null;
	aByteBuffer3192 = null;
    }
    
    public void method924() {
	anIntArray3197 = new int[anInt3181];
	anIntArray3183 = new int[anInt3181];
	anIntArray3191 = new int[anInt3181];
	if (aBoolean3209)
	    aFloatArray3188 = new float[anInt3181];
	anIntArray3207 = new int[anInt3181];
	aFloatArray3198 = new float[anInt3181];
	aFloatArray3193 = new float[anInt3181];
	aFloatArray3185 = new float[anInt3181];
	anIntArray3199 = new int[anInt3180];
	anIntArray3205 = new int[anInt3180];
	anIntArray3196 = new int[anInt3180];
	anIntArrayArray3184 = new int[anInt3180][];
	aClass55_3195
	    = new Class55(Class14_Sub8_Sub33.method653(anInt3181, 72));
	if (aBoolean3201) {
	    anIntArrayArray3203 = new int[anInt3180][];
	    aBooleanArray3194 = new boolean[anInt3180];
	}
    }
    
    public void method925() {
	Class14_Sub10 class14_sub10
	    = new Class14_Sub10((aBoolean3209 ? 40 : 36) * anInt3202);
	for (int i = 0; i < anInt3202; i++) {
	    if (Class121.aBoolean2046) {
		class14_sub10.method834((float) anIntArray3197[i],
					(byte) -117);
		class14_sub10.method834((float) anIntArray3183[i],
					(byte) -117);
		class14_sub10.method834((float) anIntArray3191[i],
					(byte) -117);
		class14_sub10.method803(anIntArray3207[i], 103);
		class14_sub10.method834(aFloatArray3198[i], (byte) -117);
		class14_sub10.method834(aFloatArray3193[i], (byte) -117);
		class14_sub10.method834(aFloatArray3185[i], (byte) -117);
		class14_sub10.method834((float) anIntArray3197[i] / aFloat3211,
					(byte) -117);
		class14_sub10.method834((float) anIntArray3191[i] / aFloat3211,
					(byte) -117);
		if (aBoolean3209)
		    class14_sub10.method834(aFloatArray3188[i], (byte) -117);
	    } else {
		class14_sub10.method788((float) anIntArray3197[i], 24671);
		class14_sub10.method788((float) anIntArray3183[i], 24671);
		class14_sub10.method788((float) anIntArray3191[i], 24671);
		class14_sub10.method803(anIntArray3207[i], 119);
		class14_sub10.method788(aFloatArray3198[i], 24671);
		class14_sub10.method788(aFloatArray3193[i], 24671);
		class14_sub10.method788(aFloatArray3185[i], 24671);
		class14_sub10.method788((float) anIntArray3197[i] / aFloat3211,
					24671);
		class14_sub10.method788((float) anIntArray3191[i] / aFloat3211,
					24671);
		if (aBoolean3209)
		    class14_sub10.method788(aFloatArray3188[i], 24671);
	    }
	}
	if (Class121.aBoolean2021) {
	    ByteBuffer bytebuffer
		= ByteBuffer.wrap(class14_sub10.aByteArray2895, 0,
				  class14_sub10.anInt2908);
	    aClass29_3182 = new Class29();
	    aClass29_3182.method1051(bytebuffer);
	} else {
	    aByteBuffer3206
		= ByteBuffer.allocateDirect(class14_sub10.anInt2908)
		      .order(ByteOrder.nativeOrder());
	    aByteBuffer3206.put(class14_sub10.aByteArray2895, 0,
				class14_sub10.anInt2908);
	    aByteBuffer3206.flip();
	}
	anIntArray3197 = null;
	anIntArray3183 = null;
	anIntArray3191 = null;
	anIntArray3207 = null;
	aFloatArray3198 = null;
	aFloatArray3193 = null;
	aFloatArray3185 = null;
	aClass55_3195 = null;
	aFloatArray3188 = null;
    }
    
    public Class14_Sub27(int arg0, float arg1, boolean arg2, boolean arg3,
			 int arg4) {
	anInt3181 = 0;
	anInt3208 = 0;
	anInt3202 = 0;
	anInt3210 = 0;
	anInt3204 = arg0;
	aFloat3211 = arg1;
	aBoolean3201 = arg2;
	aBoolean3209 = arg3;
	anInt3190 = arg4;
    }
}
