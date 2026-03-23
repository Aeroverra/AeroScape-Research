/* Class14_Sub2_Sub19_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class14_Sub2_Sub19_Sub2_Sub1 extends Class14_Sub2_Sub19_Sub2
{
    public Class14_Sub2_Sub19_Sub2_Sub1(Class14_Sub2_Sub19_Sub1 arg0) {
	super(arg0);
    }
    
    public Class14_Sub2_Sub19_Sub2_Sub1(int arg0, int arg1, int arg2, int arg3,
					int arg4, int arg5, int[] arg6) {
	super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    public void method426(int[] arg0) {
	anInt5092 = Class14_Sub8_Sub33.method653(anInt4035, 124);
	anInt5093 = Class14_Sub8_Sub33.method653(anInt4042, 79);
	byte[] is = new byte[anInt5092 * anInt5093 * 4];
	int i = 0;
	int i_0_ = 0;
	int i_1_ = (anInt5092 - anInt4035) * 4;
	for (int i_2_ = 0; i_2_ < anInt4042; i_2_++) {
	    for (int i_3_ = 0; i_3_ < anInt4035; i_3_++) {
		int i_4_ = arg0[i_0_++];
		if (i_4_ != 0) {
		    is[i++] = (byte) (i_4_ >> 16);
		    is[i++] = (byte) (i_4_ >> 8);
		    is[i++] = (byte) i_4_;
		    is[i++] = (byte) (i_4_ >> 24);
		} else
		    i += 4;
	    }
	    i += i_1_;
	}
	ByteBuffer bytebuffer = ByteBuffer.wrap(is);
	GL gl = Class121.aGL2030;
	if (anInt5089 == -1) {
	    int[] is_5_ = new int[1];
	    gl.glGenTextures(1, is_5_, 0);
	    anInt5089 = is_5_[0];
	}
	Class121.method1632(anInt5089);
	gl.glTexImage2D(3553, 0, 6408, anInt5092, anInt5093, 0, 6408, 5121,
			bytebuffer);
	Class11.anInt263 += bytebuffer.limit() - anInt5091;
	anInt5091 = bytebuffer.limit();
    }
}
