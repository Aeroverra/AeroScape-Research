/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class19 implements Interface2
{
    public static boolean aBoolean2539;
    public static short aShort2540;
    public static int anInt2541;
    public static Class124 aClass124_2542
	= Class14_Sub2_Sub2.method263(1178, "Untersuchen");
    public static int anInt2543;
    public static int anInt2544;
    public static int[][] anIntArrayArray2545;
    public static int anInt2546;
    public float[] aFloatArray2547 = new float[4];
    public int anInt2548;
    public static int anInt2549;
    public static int anInt2550;
    public static int anInt2551;
    public static int anInt2552;
    public static int anInt2553;
    
    public void method965(int arg0) {
    while_640_:
	do {
	while_639_:
	    do {
		GL gl;
		do {
		    try {
			anInt2541++;
			gl = Class121.aGL2030;
			anInt2548 = gl.glGenLists(2);
			gl.glNewList(anInt2548, 4864);
			gl.glActiveTexture(33985);
			if (!Class119.aBoolean1996)
			    gl.glEnable(3553);
			else {
			    gl.glBindTexture(32879, Class119.anInt1990);
			    gl.glTexGeni(8194, 9472, 9217);
			    gl.glEnable(3170);
			    gl.glEnable(32879);
			}
			gl.glTexGeni(8192, 9472, 9216);
			gl.glTexGeni(8193, 9472, 9216);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glActiveTexture(33984);
			gl.glEndList();
			gl.glNewList(1 + anInt2548, 4864);
			gl.glActiveTexture(33985);
			if (Class119.aBoolean1996) {
			    gl.glDisable(32879);
			    gl.glDisable(3170);
			} else
			    gl.glDisable(3553);
			gl.glDisable(3168);
			if (arg0 >= 69)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_639_;
		    }
		    return;
		} while (false);
		try {
		    gl.glDisable(3169);
		    gl.glActiveTexture(33984);
		    gl.glEndList();
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_640_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ce.D(" + arg0 + ')');
	} while (false);
    }
    
    public int method3() {
	int i;
	try {
	    anInt2549++;
	    i = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ce.B()");
	}
	return i;
    }
    
    public void method4() {
	try {
	    anInt2546++;
	    GL gl = Class121.aGL2030;
	    gl.glCallList(anInt2548);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ce.C()");
	}
    }
    
    public static void method966(int arg0, int arg1, int arg2, byte arg3,
				 int arg4) {
	try {
	    int i = -68 % ((58 - arg3) / 41);
	    if ((Class118.anInt1982 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)
		&& Class14_Sub8_Sub14.anInt4327 >= arg2) {
		arg4 = Class67.method1301((byte) -101, arg4,
					  Class14_Sub17.anInt3005,
					  Class59.anInt955);
		arg0 = Class67.method1301((byte) 115, arg0,
					  Class14_Sub17.anInt3005,
					  Class59.anInt955);
		Class79.method1387(arg2, arg1, arg0, arg4, 52);
	    }
	    anInt2543++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ce.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public void method2() {
	try {
	    anInt2544++;
	    GL gl = Class121.aGL2030;
	    gl.glCallList(1 + anInt2548);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ce.A()");
	}
    }
    
    public Class19() {
	try {
	    method965(98);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ce.<init>()");
	}
    }
    
    public static void method967(int arg0) {
    while_642_:
	do {
	while_641_:
	    do {
		do {
		    try {
			aClass124_2542 = null;
			if (arg0 == -20514)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_641_;
		    }
		    return;
		} while (false);
		try {
		    anIntArrayArray2545 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_642_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ce.G(" + arg0 + ')');
	} while (false);
    }
    
    public void method1(int arg0) {
	try {
	    anInt2551++;
	    GL gl = Class121.aGL2030;
	    float f = (float) ((arg0 & 0x3) - -1) * -0.01F;
	    float f_0_ = (float) ((arg0 >> -856209661 & 0x3) - -1) * 0.01F;
	    float f_1_ = ((0x40 & arg0 ^ 0xffffffff) == -1 ? 4.8828125E-4F
			  : 9.765625E-4F);
	    boolean bool = (arg0 & 0x80 ^ 0xffffffff) != -1;
	    if (bool) {
		aFloatArray2547[3] = 0.0F;
		aFloatArray2547[1] = 0.0F;
		aFloatArray2547[2] = 0.0F;
		aFloatArray2547[0] = f_1_;
	    } else {
		aFloatArray2547[2] = f_1_;
		aFloatArray2547[3] = 0.0F;
		aFloatArray2547[0] = 0.0F;
		aFloatArray2547[1] = 0.0F;
	    }
	    gl.glActiveTexture(33985);
	    gl.glMatrixMode(5888);
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
	    gl.glTexGenfv(8192, 9474, aFloatArray2547, 0);
	    aFloatArray2547[0] = 0.0F;
	    aFloatArray2547[3] = (float) Class121.anInt2045 * f;
	    aFloatArray2547[1] = f_1_;
	    aFloatArray2547[2] = 0.0F;
	    gl.glTexGenfv(8193, 9474, aFloatArray2547, 0);
	    gl.glPopMatrix();
	    if (!Class119.aBoolean1996) {
		int i = (int) ((float) Class121.anInt2045 * f_0_ * 64.0F);
		gl.glBindTexture(3553, Class119.anIntArray1991[i % 64]);
	    } else {
		aFloatArray2547[3] = (float) Class121.anInt2045 * f_0_;
		aFloatArray2547[1] = 0.0F;
		aFloatArray2547[2] = 0.0F;
		aFloatArray2547[0] = 0.0F;
		gl.glTexGenfv(8194, 9473, aFloatArray2547, 0);
	    }
	    gl.glActiveTexture(33984);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ce.F(" + arg0 + ')');
	}
    }
    
    static {
	aShort2540 = (short) 256;
	anIntArrayArray2545
	    = (new int[][]
	       { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 },
		 { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 },
		 { 0, 0, 128, 0, 128, 128, 64, 128 },
		 { 0, 128, 0, 0, 128, 0, 64, 128 },
		 { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
		 { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 },
		 { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
		 { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 },
		 { 0, 0, 128, 0, 96, 32, 32, 32 } });
	anInt2552 = 0;
	aBoolean2539 = false;
    }
}
