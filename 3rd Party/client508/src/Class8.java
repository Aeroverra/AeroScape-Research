/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class8 implements Interface2
{
    public int anInt2535 = -1;
    public static boolean aBoolean2536 = false;
    public int anInt2537;
    public float[] aFloatArray2538 = new float[4];
    
    public void method1(int arg0) {
	GL gl = Class121.aGL2030;
	gl.glActiveTexture(33985);
	if (aBoolean2536 || arg0 >= 0) {
	    gl.glPushMatrix();
	    gl.glLoadIdentity();
	    gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
	    gl.glRotatef((float) Class137.anInt2194 * 360.0F / 2048.0F, 1.0F,
			 0.0F, 0.0F);
	    gl.glRotatef(((float) Class14_Sub8_Sub1.anInt4091 * 360.0F
			  / 2048.0F),
			 0.0F, 1.0F, 0.0F);
	    gl.glTranslatef((float) -Class125.anInt2073,
			    (float) -Class14_Sub3.anInt2758,
			    (float) -Class14_Sub20.anInt3091);
	    if (aBoolean2536) {
		aFloatArray2538[0] = 0.0010F;
		aFloatArray2538[1] = 9.0E-4F;
		aFloatArray2538[2] = 0.0F;
		aFloatArray2538[3] = 0.0F;
		gl.glTexGenfv(8192, 9474, aFloatArray2538, 0);
		aFloatArray2538[0] = 0.0F;
		aFloatArray2538[1] = 9.0E-4F;
		aFloatArray2538[2] = 0.0010F;
		aFloatArray2538[3] = 0.0F;
		gl.glTexGenfv(8193, 9474, aFloatArray2538, 0);
		aFloatArray2538[0] = 0.0F;
		aFloatArray2538[1] = 0.0F;
		aFloatArray2538[2] = 0.0F;
		aFloatArray2538[3] = (float) Class121.anInt2045 * 0.01F;
		gl.glTexGenfv(8194, 9474, aFloatArray2538, 0);
		gl.glActiveTexture(33986);
	    }
	    gl.glTexEnvfv(8960, 8705, Class115.method1590(false), 0);
	    if (arg0 >= 0) {
		aFloatArray2538[0] = 0.0F;
		aFloatArray2538[1] = 1.0F / (float) Class133_Sub4.anInt3578;
		aFloatArray2538[2] = 0.0F;
		aFloatArray2538[3]
		    = 1.0F * (float) arg0 / (float) Class133_Sub4.anInt3578;
		gl.glTexGenfv(8192, 9474, aFloatArray2538, 0);
		gl.glEnable(3168);
	    } else
		gl.glDisable(3168);
	    gl.glPopMatrix();
	} else
	    gl.glDisable(3168);
	gl.glActiveTexture(33984);
    }
    
    public void method2() {
	GL gl = Class121.aGL2030;
	gl.glCallList(anInt2537 + 1);
    }
    
    public static void method142() {
	GL gl = Class121.aGL2030;
	gl.glClientActiveTexture(method144());
	gl.glEnableClientState(32888);
	gl.glClientActiveTexture(33984);
    }
    
    public static void method143() {
	GL gl = Class121.aGL2030;
	gl.glClientActiveTexture(method144());
	gl.glDisableClientState(32888);
	gl.glClientActiveTexture(33984);
    }
    
    public void method4() {
	GL gl = Class121.aGL2030;
	gl.glCallList(anInt2537);
    }
    
    public int method3() {
	return 0;
    }
    
    public static int method144() {
	return aBoolean2536 ? 33986 : 33985;
    }
    
    public void method145() {
	GL gl = Class121.aGL2030;
	anInt2537 = gl.glGenLists(2);
	gl.glNewList(anInt2537, 4864);
	gl.glActiveTexture(33985);
	if (aBoolean2536) {
	    gl.glBindTexture(32879, Class119.anInt1993);
	    gl.glTexEnvi(8960, 34161, 260);
	    gl.glTexEnvi(8960, 34192, 768);
	    gl.glTexEnvi(8960, 34162, 7681);
	    gl.glTexEnvi(8960, 34184, 34168);
	    gl.glTexGeni(8192, 9472, 9216);
	    gl.glTexGeni(8194, 9472, 9216);
	    gl.glTexGeni(8193, 9472, 9216);
	    gl.glTexGeni(8195, 9472, 9217);
	    gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F },
			  0);
	    gl.glEnable(3168);
	    gl.glEnable(3169);
	    gl.glEnable(3170);
	    gl.glEnable(3171);
	    gl.glEnable(32879);
	    gl.glActiveTexture(33986);
	    gl.glTexEnvi(8960, 8704, 34160);
	}
	gl.glBindTexture(3552, anInt2535);
	gl.glTexEnvi(8960, 34161, 34165);
	gl.glTexEnvi(8960, 34176, 34166);
	gl.glTexEnvi(8960, 34178, 5890);
	gl.glTexEnvi(8960, 34162, 7681);
	gl.glTexEnvi(8960, 34184, 34168);
	gl.glTexGeni(8192, 9472, 9216);
	gl.glEnable(3552);
	gl.glEnable(3168);
	gl.glActiveTexture(33984);
	gl.glEndList();
	gl.glNewList(anInt2537 + 1, 4864);
	gl.glActiveTexture(33985);
	if (aBoolean2536) {
	    gl.glTexEnvi(8960, 34161, 8448);
	    gl.glTexEnvi(8960, 34192, 768);
	    gl.glTexEnvi(8960, 34162, 8448);
	    gl.glTexEnvi(8960, 34184, 5890);
	    gl.glDisable(3168);
	    gl.glDisable(3169);
	    gl.glDisable(3170);
	    gl.glDisable(3171);
	    gl.glDisable(32879);
	    gl.glActiveTexture(33986);
	    gl.glTexEnvi(8960, 8704, 8448);
	}
	gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
	gl.glTexEnvi(8960, 34161, 8448);
	gl.glTexEnvi(8960, 34176, 5890);
	gl.glTexEnvi(8960, 34178, 34166);
	gl.glTexEnvi(8960, 34162, 8448);
	gl.glTexEnvi(8960, 34184, 5890);
	gl.glDisable(3552);
	gl.glDisable(3168);
	gl.glActiveTexture(33984);
	gl.glEndList();
    }
    
    public Class8() {
	anInt2537 = -1;
	if (Class121.anInt2019 >= 2) {
	    int[] is = new int[1];
	    byte[] is_0_ = new byte[8];
	    int i = 0;
	    while (i < 8)
		is_0_[i] = (byte) (96 + ++i * 159 / 8);
	    GL gl = Class121.aGL2030;
	    gl.glGenTextures(1, is, 0);
	    gl.glBindTexture(3552, is[0]);
	    gl.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121,
			    ByteBuffer.wrap(is_0_));
	    gl.glTexParameteri(3552, 10241, 9729);
	    gl.glTexParameteri(3552, 10240, 9729);
	    gl.glTexParameteri(3552, 10242, 33071);
	    anInt2535 = is[0];
	    aBoolean2536 = Class121.anInt2019 > 2 && Class121.aBoolean2042;
	    method145();
	}
    }
}
