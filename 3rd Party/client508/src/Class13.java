/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

public class Class13
{
    public ByteBuffer aByteBuffer343;
    public static byte[] aByteArray344 = new byte[16384];
    public Class29 aClass29_345;
    public boolean aBoolean346 = true;
    public Class29 aClass29_347;
    public int anInt348;
    public int anInt349 = -1;
    public ByteBuffer aByteBuffer350;
    
    public static void method225() {
	aByteArray344 = null;
    }
    
    public boolean method226(Class148_Sub1 arg0, int arg1, int arg2) {
	byte[] is = arg0.aByteArray3689;
	int i = arg0.anInt2371;
	int i_0_ = arg1 * 128 + 1 + (arg2 * 128 + 1) * i;
	int i_1_ = 0;
	for (int i_2_ = -128; i_2_ < 0; i_2_++) {
	    i_1_ = (i_1_ << 8) - i_1_;
	    for (int i_3_ = -128; i_3_ < 0; i_3_++) {
		if (is[i_0_++] != 0)
		    i_1_++;
	    }
	    i_0_ += i - 128;
	}
	if (i_1_ == anInt349)
	    return false;
	anInt349 = i_1_;
	i_0_ = arg1 * 128 + 1 + (arg2 * 128 + 1) * i;
	int i_4_ = 0;
	for (int i_5_ = -128; i_5_ < 0; i_5_++) {
	    for (int i_6_ = -128; i_6_ < 0; i_6_++) {
		if (is[i_0_] != 0)
		    aByteArray344[i_4_++] = (byte) 68;
		else {
		    int i_7_ = 0;
		    if (is[i_0_ - 1] != 0)
			i_7_++;
		    if (is[i_0_ + 1] != 0)
			i_7_++;
		    if (is[i_0_ - i] != 0)
			i_7_++;
		    if (is[i_0_ + i] != 0)
			i_7_++;
		    aByteArray344[i_4_++] = (byte) (17 * i_7_);
		}
		i_0_++;
	    }
	    i_0_ += i - 128;
	}
	GL gl = Class121.aGL2030;
	ByteBuffer bytebuffer = ByteBuffer.wrap(aByteArray344);
	bytebuffer.limit(16384);
	Class121.method1632(anInt348);
	gl.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, bytebuffer);
	return true;
    }
    
    public void method227(int[][] arg0, int arg1, int arg2) {
	Class14_Sub10 class14_sub10 = new Class14_Sub10(1620);
	for (int i = 0; i <= 8; i++) {
	    for (int i_8_ = 0; i_8_ <= 8; i_8_++) {
		if (Class121.aBoolean2046) {
		    class14_sub10.method834((float) i_8_ / 8.0F, (byte) -117);
		    class14_sub10.method834((float) i / 8.0F, (byte) -117);
		    class14_sub10.method834((float) (i_8_ * 128), (byte) -117);
		    class14_sub10.method834((float) (arg0[i_8_ + arg1]
						     [i + arg2]),
					    (byte) -117);
		    class14_sub10.method834((float) (i * 128), (byte) -117);
		} else {
		    class14_sub10.method788((float) i_8_ / 8.0F, 24671);
		    class14_sub10.method788((float) i / 8.0F, 24671);
		    class14_sub10.method788((float) (i_8_ * 128), 24671);
		    class14_sub10
			.method788((float) arg0[i_8_ + arg1][i + arg2], 24671);
		    class14_sub10.method788((float) (i * 128), 24671);
		}
	    }
	}
	if (Class121.aBoolean2021) {
	    ByteBuffer bytebuffer
		= ByteBuffer.wrap(class14_sub10.aByteArray2895, 0,
				  class14_sub10.anInt2908);
	    aClass29_345 = new Class29();
	    aClass29_345.method1051(bytebuffer);
	} else {
	    aByteBuffer350 = ByteBuffer.allocateDirect
				 (class14_sub10.anInt2908)
				 .order(ByteOrder.nativeOrder());
	    aByteBuffer350.put(class14_sub10.aByteArray2895, 0,
			       class14_sub10.anInt2908);
	    aByteBuffer350.flip();
	}
	Class14_Sub10 class14_sub10_9_ = new Class14_Sub10(1536);
	for (int i = 0; i < 8; i++) {
	    for (int i_10_ = 0; i_10_ < 8; i_10_++) {
		if (Class121.aBoolean2046) {
		    class14_sub10_9_.method803(i_10_ + (i + 1) * 9, 107);
		    class14_sub10_9_.method803(i_10_ + i * 9, 77);
		    class14_sub10_9_.method803(i_10_ + 1 + i * 9, 65);
		    class14_sub10_9_.method803(i_10_ + (i + 1) * 9, 122);
		    class14_sub10_9_.method803(i_10_ + 1 + i * 9, 101);
		    class14_sub10_9_.method803(i_10_ + 1 + (i + 1) * 9, 106);
		} else {
		    class14_sub10_9_.method825(-47, i_10_ + (i + 1) * 9);
		    class14_sub10_9_.method825(-76, i_10_ + i * 9);
		    class14_sub10_9_.method825(-69, i_10_ + 1 + i * 9);
		    class14_sub10_9_.method825(-21, i_10_ + (i + 1) * 9);
		    class14_sub10_9_.method825(-27, i_10_ + 1 + i * 9);
		    class14_sub10_9_.method825(-32, i_10_ + 1 + (i + 1) * 9);
		}
	    }
	}
	if (Class121.aBoolean2021) {
	    ByteBuffer bytebuffer
		= ByteBuffer.wrap(class14_sub10_9_.aByteArray2895, 0,
				  class14_sub10_9_.anInt2908);
	    aClass29_347 = new Class29();
	    aClass29_347.method1054(bytebuffer);
	} else {
	    aByteBuffer343
		= ByteBuffer.allocateDirect(class14_sub10_9_.anInt2908)
		      .order(ByteOrder.nativeOrder());
	    aByteBuffer343.put(class14_sub10_9_.aByteArray2895, 0,
			       class14_sub10_9_.anInt2908);
	    aByteBuffer343.flip();
	}
    }
    
    public void method228() {
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt348);
	if (aClass29_345 != null) {
	    aClass29_345.method1053();
	    gl.glInterleavedArrays(10791, 20, 0L);
	    Class121.aBoolean2027 = false;
	} else {
	    if (Class121.aBoolean2021)
		gl.glBindBufferARB(34962, 0);
	    gl.glInterleavedArrays(10791, 20, aByteBuffer350);
	    Class121.aBoolean2027 = false;
	}
	if (aClass29_347 != null) {
	    aClass29_347.method1055();
	    gl.glDrawElements(4, 384, 5125, 0L);
	} else {
	    if (Class121.aBoolean2021)
		gl.glBindBufferARB(34963, 0);
	    gl.glDrawElements(4, 384, 5125, aByteBuffer343);
	}
    }
    
    public Class13() {
	GL gl = Class121.aGL2030;
	int[] is = new int[1];
	gl.glGenTextures(1, is, 0);
	anInt348 = is[0];
	Class11.anInt266 += 16384;
	Class121.method1632(anInt348);
	gl.glTexParameteri(3553, 10241, 9729);
	gl.glTexParameteri(3553, 10240, 9729);
	gl.glTexParameteri(3553, 10242, 33071);
	gl.glTexParameteri(3553, 10243, 33071);
    }
}
