/* Class148_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class148_Sub2 extends Class148
{
    public int anInt3690;
    public int anInt3691;
    public int anInt3692 = 0;
    public int anInt3693;
    public int anInt3694;
    public int anInt3695;
    public int anInt3696;
    
    public void method2001(int arg0, int arg1) {
	Class121.method1622();
	arg0 += anInt2375;
	arg1 += anInt2374;
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt3691);
	method2012(1);
	gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			0.0F);
	gl.glCallList(anInt3694);
	gl.glLoadIdentity();
    }
    
    public void method1999(int arg0, int arg1, int arg2) {
	Class121.method1655();
	arg0 += anInt2375;
	arg1 += anInt2374;
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt3691);
	method2012(1);
	gl.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
	gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			0.0F);
	gl.glCallList(anInt3694);
	gl.glLoadIdentity();
    }
    
    public void method2011() {
	float f = (float) anInt2371 / (float) anInt3696;
	float f_0_ = (float) anInt2376 / (float) anInt3693;
	GL gl = Class121.aGL2030;
	if (anInt3694 == -1) {
	    anInt3694 = gl.glGenLists(1);
	    anInt3690 = Class11.anInt267;
	}
	gl.glNewList(anInt3694, 4864);
	gl.glBegin(6);
	gl.glTexCoord2f(f, 0.0F);
	gl.glVertex2f((float) anInt2371, 0.0F);
	gl.glTexCoord2f(0.0F, 0.0F);
	gl.glVertex2f(0.0F, 0.0F);
	gl.glTexCoord2f(0.0F, f_0_);
	gl.glVertex2f(0.0F, (float) -anInt2376);
	gl.glTexCoord2f(f, f_0_);
	gl.glVertex2f((float) anInt2371, (float) -anInt2376);
	gl.glEnd();
	gl.glEndList();
    }
    
    public void method2012(int arg0) {
	if (anInt3692 != arg0) {
	    anInt3692 = arg0;
	    GL gl = Class121.aGL2030;
	    if (arg0 == 2) {
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
	    } else {
		gl.glTexParameteri(3553, 10241, 9728);
		gl.glTexParameteri(3553, 10240, 9728);
	    }
	}
    }
    
    public void finalize() throws Throwable {
	if (anInt3691 != -1) {
	    Class11.method208(anInt3691, anInt3695, anInt3690);
	    anInt3691 = -1;
	    anInt3695 = 0;
	}
	if (anInt3694 != -1) {
	    Class11.method206(anInt3694, anInt3690);
	    anInt3694 = -1;
	}
	super.finalize();
    }
    
    public void method2013(byte[] arg0, int[] arg1) {
	anInt3696 = Class14_Sub8_Sub33.method653(anInt2371, 91);
	anInt3693 = Class14_Sub8_Sub33.method653(anInt2376, 87);
	byte[] is = new byte[anInt3696 * anInt3693 * 4];
	int i = 0;
	int i_1_ = 0;
	for (int i_2_ = 0; i_2_ < anInt2376; i_2_++) {
	    for (int i_3_ = 0; i_3_ < anInt2371; i_3_++) {
		byte i_4_ = arg0[i_1_++];
		if (i_4_ != 0) {
		    int i_5_ = arg1[i_4_];
		    is[i++] = (byte) (i_5_ >> 16);
		    is[i++] = (byte) (i_5_ >> 8);
		    is[i++] = (byte) i_5_;
		    is[i++] = (byte) -1;
		} else
		    i += 4;
	    }
	    i += (anInt3696 - anInt2371) * 4;
	}
	ByteBuffer bytebuffer = ByteBuffer.wrap(is);
	GL gl = Class121.aGL2030;
	if (anInt3691 == -1) {
	    int[] is_6_ = new int[1];
	    gl.glGenTextures(1, is_6_, 0);
	    anInt3691 = is_6_[0];
	    anInt3690 = Class11.anInt267;
	}
	Class121.method1632(anInt3691);
	gl.glTexImage2D(3553, 0, 6408, anInt3696, anInt3693, 0, 6408, 5121,
			bytebuffer);
	Class11.anInt263 += bytebuffer.limit() - anInt3695;
	anInt3695 = bytebuffer.limit();
    }
    
    public Class148_Sub2(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, byte[] arg6, int[] arg7) {
	anInt3691 = -1;
	anInt3694 = -1;
	anInt3695 = 0;
	anInt2378 = arg0;
	anInt2373 = arg1;
	anInt2375 = arg2;
	anInt2374 = arg3;
	anInt2371 = arg4;
	anInt2376 = arg5;
	method2013(arg6, arg7);
	method2011();
    }
}
