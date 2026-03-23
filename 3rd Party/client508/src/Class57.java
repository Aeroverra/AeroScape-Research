/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class57
{
    public static int anInt924 = -1;
    public static float[] aFloatArray925 = new float[4];
    public static float aFloat926;
    public static float[] aFloatArray927;
    public static int anInt928;
    public static int anInt929;
    public static float aFloat930;
    public static int anInt931 = -1;
    public static float aFloat932;
    public static float[] aFloatArray933;
    public static int anInt934;
    public static int anInt935;
    public static int anInt936;
    
    public static void method1244() {
	aFloatArray927 = null;
	aFloatArray925 = null;
	aFloatArray933 = null;
    }
    
    public static void method1245() {
	GL gl = Class121.aGL2030;
	gl.glLightfv(16384, 4611, aFloatArray927, 0);
	gl.glLightfv(16385, 4611, aFloatArray925, 0);
    }
    
    public static void method1246(float[] arg0) {
	if (arg0 == null)
	    arg0 = aFloatArray933;
	GL gl = Class121.aGL2030;
	gl.glFogfv(2918, arg0, 0);
    }
    
    public static float method1247() {
	return aFloat926;
    }
    
    public static void method1248(int arg0, float arg1, float arg2,
				  float arg3) {
	if (anInt931 != arg0 || aFloat926 != arg1 || aFloat932 != arg2
	    || aFloat930 != arg3) {
	    anInt931 = arg0;
	    aFloat926 = arg1;
	    aFloat932 = arg2;
	    aFloat930 = arg3;
	    GL gl = Class121.aGL2030;
	    float f = (float) (arg0 >> 16 & 0xff) / 255.0F;
	    float f_0_ = (float) (arg0 >> 8 & 0xff) / 255.0F;
	    float f_1_ = (float) (arg0 & 0xff) / 255.0F;
	    float[] fs = { arg1 * f, arg1 * f_0_, arg1 * f_1_, 1.0F };
	    gl.glLightModelfv(2899, fs, 0);
	    float[] fs_2_ = { arg2 * f, arg2 * f_0_, arg2 * f_1_, 1.0F };
	    gl.glLightfv(16384, 4609, fs_2_, 0);
	    float[] fs_3_ = { -arg3 * f, -arg3 * f_0_, -arg3 * f_1_, 1.0F };
	    gl.glLightfv(16385, 4609, fs_3_, 0);
	}
    }
    
    public static float method1249() {
	return aFloat932;
    }
    
    public static void method1250(int arg0, int arg1) {
	if (anInt936 != arg0 || anInt924 != arg1) {
	    anInt936 = arg0;
	    anInt924 = arg1;
	    GL gl = Class121.aGL2030;
	    int i = 50;
	    int i_4_ = 3584;
	    aFloatArray933[0] = (float) (arg0 >> 16 & 0xff) / 255.0F;
	    aFloatArray933[1] = (float) (arg0 >> 8 & 0xff) / 255.0F;
	    aFloatArray933[2] = (float) (arg0 & 0xff) / 255.0F;
	    gl.glFogi(2917, 9729);
	    gl.glFogf(2914, 0.95F);
	    gl.glHint(3156, 4353);
	    int i_5_ = i_4_ - 512 - arg1;
	    if (i_5_ < i)
		i_5_ = i;
	    gl.glFogf(2915, (float) i_5_);
	    gl.glFogf(2916, (float) (i_4_ - 256));
	    gl.glFogfv(2918, aFloatArray933, 0);
	}
    }
    
    public static int method1251() {
	return anInt931;
    }
    
    public static void method1252(float arg0, float arg1, float arg2) {
	if (aFloatArray927[0] != arg0 || aFloatArray927[1] != arg1
	    || aFloatArray927[2] != arg2) {
	    aFloatArray927[0] = arg0;
	    aFloatArray927[1] = arg1;
	    aFloatArray927[2] = arg2;
	    aFloatArray925[0] = -arg0;
	    aFloatArray925[1] = -arg1;
	    aFloatArray925[2] = -arg2;
	    anInt934 = (int) (arg0 * 256.0F / arg1);
	    anInt928 = (int) (arg2 * 256.0F / arg1);
	}
    }
    
    public static void method1253() {
	GL gl = Class121.aGL2030;
	gl.glColorMaterial(1028, 5634);
	gl.glEnable(2903);
	float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
	gl.glLightfv(16384, 4608, fs, 0);
	gl.glEnable(16384);
	float[] fs_6_ = { 0.0F, 0.0F, 0.0F, 1.0F };
	gl.glLightfv(16385, 4608, fs_6_, 0);
	gl.glEnable(16385);
	anInt931 = -1;
	anInt936 = -1;
	method1254();
    }
    
    public static void method1254() {
	method1248(anInt935, 1.1523438F, 0.69921875F, 1.2F);
	method1252(-50.0F, -60.0F, -50.0F);
	method1250(anInt929, 0);
    }
    
    static {
	aFloatArray927 = new float[4];
	aFloat932 = -1.0F;
	aFloat930 = -1.0F;
	aFloatArray933 = new float[4];
	anInt935 = 16777215;
	anInt929 = 13156520;
	anInt936 = -1;
    }
}
