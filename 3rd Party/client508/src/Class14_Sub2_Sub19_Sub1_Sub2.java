/* Class14_Sub2_Sub19_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class14_Sub2_Sub19_Sub1_Sub2 extends Class14_Sub2_Sub19_Sub1
{
    public byte[] aByteArray5104;
    public ByteBuffer aByteBuffer5105;
    
    public void method390(int arg0, int arg1) {
	Class121.method1637();
	if (aByteArray5104 == null) {
	    aByteArray5104 = new byte[anInt4035 * anInt4042 * 4];
	    aByteBuffer5105 = ByteBuffer.wrap(aByteArray5104);
	}
	int i = 0;
	for (int i_0_ = anInt4042 - 1; i_0_ >= 0; i_0_--) {
	    int i_1_ = i_0_ * anInt4035;
	    for (int i_2_ = 0; i_2_ < anInt4035; i_2_++) {
		int i_3_ = anIntArray5088[i_1_++];
		if (i_3_ != 0) {
		    aByteArray5104[i++] = (byte) (i_3_ >> 16);
		    aByteArray5104[i++] = (byte) (i_3_ >> 8);
		    aByteArray5104[i++] = (byte) i_3_;
		    aByteArray5104[i++] = (byte) -1;
		} else {
		    aByteArray5104[i++] = (byte) 0;
		    aByteArray5104[i++] = (byte) 0;
		    aByteArray5104[i++] = (byte) 0;
		    aByteArray5104[i++] = (byte) 0;
		}
	    }
	}
	GL gl = Class121.aGL2030;
	gl.glRasterPos2i(arg0 + anInt4033,
			 Class121.anInt2034 - (arg1 + anInt4050) - anInt4042);
	gl.glDrawPixels(anInt4035, anInt4042, 6408, 5121, aByteBuffer5105);
    }
    
    public void method391(int arg0, int arg1) {
	method390(arg0, arg1);
    }
    
    public Class14_Sub2_Sub19_Sub1_Sub2(int arg0, int arg1) {
	super(arg0, arg1);
    }
}
