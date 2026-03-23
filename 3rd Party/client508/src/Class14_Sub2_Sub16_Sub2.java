/* Class14_Sub2_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class14_Sub2_Sub16_Sub2 extends Class14_Sub2_Sub16
{
    public int anInt5066;
    public int anInt5067;
    public int anInt5068 = 0;
    public int[] anIntArray5069;
    public int anInt5070 = -1;
    
    public void method372(byte[][] arg0) {
	if (anInt5070 == -1) {
	    anInt5067 = 0;
	    for (int i = 0; i < 256; i++) {
		if (anIntArray3991[i] > anInt5067)
		    anInt5067 = anIntArray3991[i];
		if (anIntArray3989[i] > anInt5067)
		    anInt5067 = anIntArray3989[i];
	    }
	    anInt5067 *= 16;
	    anInt5067 = Class14_Sub8_Sub33.method653(anInt5067, 82);
	    int i = anInt5067 / 16;
	    byte[] is = new byte[anInt5067 * anInt5067 * 2];
	    for (int i_0_ = 0; i_0_ < 256; i_0_++) {
		int i_1_ = i_0_ % 16 * i;
		int i_2_ = i_0_ / 16 * i;
		int i_3_ = (i_2_ * anInt5067 + i_1_) * 2;
		int i_4_ = 0;
		int i_5_ = anIntArray3991[i_0_];
		int i_6_ = anIntArray3989[i_0_];
		byte[] is_7_ = arg0[i_0_];
		for (int i_8_ = 0; i_8_ < i_5_; i_8_++) {
		    for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			if (is_7_[i_4_++] != 0) {
			    is[i_3_++] = (byte) -1;
			    is[i_3_++] = (byte) -1;
			} else
			    i_3_ += 2;
		    }
		    i_3_ += (anInt5067 - i_6_) * 2;
		}
	    }
	    ByteBuffer bytebuffer = ByteBuffer.wrap(is);
	    GL gl = Class121.aGL2030;
	    if (anInt5070 == -1) {
		int[] is_10_ = new int[1];
		gl.glGenTextures(1, is_10_, 0);
		anInt5070 = is_10_[0];
		anInt5066 = Class11.anInt267;
	    }
	    Class121.method1632(anInt5070);
	    gl.glTexImage2D(3553, 0, 6410, anInt5067, anInt5067, 0, 6410, 5121,
			    bytebuffer);
	    Class11.anInt263 += bytebuffer.limit() - anInt5068;
	    anInt5068 = bytebuffer.limit();
	    gl.glTexParameteri(3553, 10241, 9728);
	    gl.glTexParameteri(3553, 10240, 9728);
	}
    }
    
    public void method373() {
	if (anIntArray5069 == null) {
	    anIntArray5069 = new int[256];
	    GL gl = Class121.aGL2030;
	    for (int i = 0; i < 256; i++) {
		float f = (float) (i % 16) / 16.0F;
		float f_11_ = (float) (i / 16) / 16.0F;
		float f_12_
		    = f + (float) anIntArray3989[i] / (float) anInt5067;
		float f_13_
		    = f_11_ + (float) anIntArray3991[i] / (float) anInt5067;
		anIntArray5069[i] = gl.glGenLists(1);
		gl.glNewList(anIntArray5069[i], 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f_12_, f_11_);
		gl.glVertex2f((float) anIntArray3989[i], 0.0F);
		gl.glTexCoord2f(f, f_11_);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(f, f_13_);
		gl.glVertex2f(0.0F, (float) -anIntArray3991[i]);
		gl.glTexCoord2f(f_12_, f_13_);
		gl.glVertex2f((float) anIntArray3989[i],
			      (float) -anIntArray3991[i]);
		gl.glEnd();
		gl.glEndList();
	    }
	    anInt5066 = Class11.anInt267;
	}
    }
    
    public void finalize() throws Throwable {
	if (anInt5070 != -1) {
	    Class11.method208(anInt5070, anInt5068, anInt5066);
	    anInt5070 = -1;
	    anInt5068 = 0;
	}
	if (anIntArray5069 != null) {
	    for (int i = 0; i < anIntArray5069.length; i++)
		Class11.method206(anIntArray5069[i], anInt5066);
	    anIntArray5069 = null;
	}
	super.finalize();
    }
    
    public void method349(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, boolean arg6) {
	if (Class25.aClass14_Sub2_Sub19_Sub2_479 != null) {
	    Class121.method1623();
	    GL gl = Class121.aGL2030;
	    gl.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8),
			  (byte) arg5);
	    gl.glTranslatef((float) arg1, (float) (Class121.anInt2034 - arg2),
			    0.0F);
	    float f = (float) (arg0 % 16) / 16.0F;
	    float f_14_ = (float) (arg0 / 16) / 16.0F;
	    float f_15_ = f + (float) anIntArray3989[arg0] / (float) anInt5067;
	    float f_16_
		= f_14_ + (float) anIntArray3991[arg0] / (float) anInt5067;
	    Class121.method1632(anInt5070);
	    Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2
		= Class25.aClass14_Sub2_Sub19_Sub2_479;
	    gl.glActiveTexture(33985);
	    gl.glEnable(3553);
	    gl.glBindTexture(3553, class14_sub2_sub19_sub2.anInt5089);
	    gl.glTexEnvi(8960, 34161, 7681);
	    gl.glTexEnvi(8960, 34176, 34168);
	    float f_17_ = ((float) (arg1 - Class25.anInt475)
			   / (float) class14_sub2_sub19_sub2.anInt5092);
	    float f_18_ = ((float) (arg2 - Class25.anInt478)
			   / (float) class14_sub2_sub19_sub2.anInt5093);
	    float f_19_ = ((float) (arg1 + arg3 - Class25.anInt475)
			   / (float) class14_sub2_sub19_sub2.anInt5092);
	    float f_20_ = ((float) (arg2 + arg4 - Class25.anInt478)
			   / (float) class14_sub2_sub19_sub2.anInt5093);
	    gl.glBegin(6);
	    gl.glMultiTexCoord2f(33985, f_19_, f_18_);
	    gl.glTexCoord2f(f_15_, f_14_);
	    gl.glVertex2f((float) anIntArray3989[arg0], 0.0F);
	    gl.glMultiTexCoord2f(33985, f_17_, f_18_);
	    gl.glTexCoord2f(f, f_14_);
	    gl.glVertex2f(0.0F, 0.0F);
	    gl.glMultiTexCoord2f(33985, f_17_, f_20_);
	    gl.glTexCoord2f(f, f_16_);
	    gl.glVertex2f(0.0F, (float) -anIntArray3991[arg0]);
	    gl.glMultiTexCoord2f(33985, f_19_, f_20_);
	    gl.glTexCoord2f(f_15_, f_16_);
	    gl.glVertex2f((float) anIntArray3989[arg0],
			  (float) -anIntArray3991[arg0]);
	    gl.glEnd();
	    gl.glTexEnvi(8960, 34161, 8448);
	    gl.glTexEnvi(8960, 34176, 5890);
	    gl.glDisable(3553);
	    gl.glActiveTexture(33984);
	    gl.glLoadIdentity();
	} else {
	    Class121.method1623();
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5070);
	    gl.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8),
			  (byte) arg5);
	    gl.glTranslatef((float) arg1, (float) (Class121.anInt2034 - arg2),
			    0.0F);
	    gl.glCallList(anIntArray5069[arg0]);
	    gl.glLoadIdentity();
	}
    }
    
    public Class14_Sub2_Sub16_Sub2(byte[] arg0, int[] arg1, int[] arg2,
				   int[] arg3, int[] arg4, byte[][] arg5) {
	super(arg0, arg1, arg2, arg3, arg4);
	method372(arg5);
	method373();
    }
    
    public void method363(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean arg7) {
	Class121.method1623();
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5070);
	gl.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5,
		      arg6 > 255 ? (byte) -1 : (byte) arg6);
	gl.glTranslatef((float) arg1, (float) (Class121.anInt2034 - arg2),
			0.0F);
	gl.glCallList(anIntArray5069[arg0]);
	gl.glLoadIdentity();
    }
}
