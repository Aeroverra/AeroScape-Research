/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class130
{
    public Class29 aClass29_2137;
    public Class55 aClass55_2138;
    public ByteBuffer aByteBuffer2139;
    public int anInt2140;
    public byte[] aByteArray2141;
    public Class29 aClass29_2142;
    public int[] anIntArray2143;
    public int anInt2144;
    public byte[] aByteArray2145;
    public byte[] aByteArray2146;
    public ByteBuffer aByteBuffer2147;
    public int[] anIntArray2148;
    public int[] anIntArray2149;
    public int[] anIntArray2150;
    public int anInt2151;
    public int anInt2152;
    
    public void method1767() {
	Class14_Sub10 class14_sub10 = new Class14_Sub10(anInt2152 * 4);
	Class14_Sub10 class14_sub10_0_ = new Class14_Sub10(anInt2140 * 16);
	if (Class121.aBoolean2046) {
	    for (int i = 0; i < anInt2140; i++) {
		class14_sub10_0_.method809(false, aByteArray2145[i]);
		class14_sub10_0_.method809(false, aByteArray2141[i]);
		class14_sub10_0_.method809(false, aByteArray2146[i]);
		class14_sub10_0_.method809(false, 255);
		class14_sub10_0_.method834((float) anIntArray2143[i],
					   (byte) -117);
		class14_sub10_0_.method834((float) anIntArray2148[i],
					   (byte) -117);
		class14_sub10_0_.method834((float) anIntArray2150[i],
					   (byte) -117);
	    }
	    for (int i = 0; i < anInt2152; i++)
		class14_sub10.method803(anIntArray2149[i], 107);
	} else {
	    for (int i = 0; i < anInt2140; i++) {
		class14_sub10_0_.method809(false, aByteArray2145[i]);
		class14_sub10_0_.method809(false, aByteArray2141[i]);
		class14_sub10_0_.method809(false, aByteArray2146[i]);
		class14_sub10_0_.method809(false, 255);
		class14_sub10_0_.method788((float) anIntArray2143[i], 24671);
		class14_sub10_0_.method788((float) anIntArray2148[i], 24671);
		class14_sub10_0_.method788((float) anIntArray2150[i], 24671);
	    }
	    for (int i = 0; i < anInt2152; i++)
		class14_sub10.method825(-99, anIntArray2149[i]);
	}
	if (Class121.aBoolean2021) {
	    aClass29_2137 = new Class29();
	    ByteBuffer bytebuffer
		= ByteBuffer.wrap(class14_sub10_0_.aByteArray2895);
	    aClass29_2137.method1051(bytebuffer);
	    aClass29_2142 = new Class29();
	    bytebuffer = ByteBuffer.wrap(class14_sub10.aByteArray2895);
	    aClass29_2142.method1054(bytebuffer);
	} else {
	    aByteBuffer2147
		= ByteBuffer.allocateDirect(class14_sub10_0_.anInt2908);
	    aByteBuffer2147.put(class14_sub10_0_.aByteArray2895);
	    aByteBuffer2147.flip();
	    aByteBuffer2139
		= ByteBuffer.allocateDirect(class14_sub10.anInt2908);
	    aByteBuffer2139.put(class14_sub10.aByteArray2895);
	    aByteBuffer2139.flip();
	}
	anIntArray2143 = null;
	anIntArray2148 = null;
	anIntArray2150 = null;
	aByteArray2145 = null;
	aByteArray2141 = null;
	aByteArray2146 = null;
	anIntArray2149 = null;
	aClass55_2138 = null;
    }
    
    public void method1768() {
	GL gl = Class121.aGL2030;
	if (Class121.aBoolean2021) {
	    aClass29_2137.method1053();
	    gl.glInterleavedArrays(10787, 16, 0L);
	    Class121.aBoolean2027 = false;
	    aClass29_2142.method1055();
	    gl.glDrawElements(4, anInt2152, 5125, 0L);
	} else {
	    if (Class121.aBoolean2021) {
		gl.glBindBufferARB(34962, 0);
		gl.glBindBufferARB(34963, 0);
	    }
	    gl.glInterleavedArrays(10787, 16, aByteBuffer2147);
	    Class121.aBoolean2027 = false;
	    gl.glDrawElements(4, anInt2152, 5125, aByteBuffer2139);
	}
    }
    
    public int method1769(Class73 arg0, int arg1, int arg2, int arg3,
			  float arg4, float arg5, float arg6) {
	long l = 0L;
	if ((arg1 & 0x7f) == 0 || (arg3 & 0x7f) == 0) {
	    l = (long) (arg1 + (arg3 << 16));
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass55_2138.method1230(l, (byte) -116);
	    if (class14_sub1 != null)
		return class14_sub1.anInt2714;
	}
	int i = arg0.anInt1122;
	float f = (float) (arg0.anInt1128 - arg1);
	float f_1_ = (float) (arg0.anInt1104 - arg2);
	float f_2_ = (float) (arg0.anInt1124 - arg3);
	float f_3_
	    = (float) Math.sqrt((double) (f * f + f_1_ * f_1_ + f_2_ * f_2_));
	float f_4_ = 1.0F / f_3_;
	f *= f_4_;
	f_1_ *= f_4_;
	f_2_ *= f_4_;
	float f_5_ = f_3_ / (float) ((arg0.anInt1120 << 7) + 64);
	float f_6_ = 1.0F - f_5_ * f_5_;
	if (f_6_ < 0.0F)
	    f_6_ = 0.0F;
	float f_7_ = f * arg4 + f_1_ * arg5 + f_2_ * arg6;
	if (f_7_ < 0.0F)
	    f_7_ = 0.0F;
	float f_8_ = f_7_ * f_6_ * 2.0F;
	if (f_8_ > 1.0F)
	    f_8_ = 1.0F;
	int i_9_ = (int) (f_8_ * (float) (i >> 16 & 0xff));
	if (i_9_ > 255)
	    i_9_ = 255;
	int i_10_ = (int) (f_8_ * (float) (i >> 8 & 0xff));
	if (i_10_ > 255)
	    i_10_ = 255;
	int i_11_ = (int) (f_8_ * (float) (i & 0xff));
	if (i_11_ > 255)
	    i_11_ = 255;
	aByteArray2145[anInt2140] = (byte) i_9_;
	aByteArray2141[anInt2140] = (byte) i_10_;
	aByteArray2146[anInt2140] = (byte) i_11_;
	anIntArray2143[anInt2140] = arg1;
	anIntArray2148[anInt2140] = arg2;
	anIntArray2150[anInt2140] = arg3;
	aClass55_2138.method1224(8, l, new Class14_Sub1(anInt2140));
	return anInt2140++;
    }
    
    public void method1770(int[] arg0) {
	for (int i = 1; i < arg0.length - 1; i++) {
	    anIntArray2149[anInt2152++] = arg0[0];
	    anIntArray2149[anInt2152++] = arg0[i];
	    anIntArray2149[anInt2152++] = arg0[i + 1];
	}
    }
    
    public void method1771() {
	anIntArray2149 = new int[anInt2144];
	anIntArray2143 = new int[anInt2151];
	anIntArray2148 = new int[anInt2151];
	anIntArray2150 = new int[anInt2151];
	aByteArray2145 = new byte[anInt2151];
	aByteArray2141 = new byte[anInt2151];
	aByteArray2146 = new byte[anInt2151];
	aClass55_2138
	    = new Class55(Class14_Sub8_Sub33.method653(anInt2151, 97));
    }
}
