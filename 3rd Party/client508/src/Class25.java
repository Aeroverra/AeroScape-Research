/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class25
{
    public static int anInt475 = 0;
    public static int anInt476 = 0;
    public static int anInt477;
    public static int anInt478 = 0;
    public static Class14_Sub2_Sub19_Sub2 aClass14_Sub2_Sub19_Sub2_479;
    
    public static void method994() {
	anInt475 = 0;
	anInt478 = 0;
	anInt476 = Class121.anInt2033;
	anInt477 = Class121.anInt2034;
	GL gl = Class121.aGL2030;
	gl.glDisable(3089);
	method996();
    }
    
    public static void method995() {
	Class121.aGL2030.glClear(16640);
    }
    
    public static void method996() {
	aClass14_Sub2_Sub19_Sub2_479 = null;
    }
    
    public static void method997(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	Class121.method1637();
	float f = (float) arg0 + 0.3F;
	float f_0_ = f + (float) (arg2 - 1);
	float f_1_ = (float) Class121.anInt2034 - ((float) arg1 + 0.3F);
	float f_2_ = f_1_ - (float) (arg3 - 1);
	GL gl = Class121.aGL2030;
	gl.glBegin(2);
	gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4,
		      arg5 > 255 ? (byte) -1 : (byte) arg5);
	gl.glVertex2f(f, f_1_);
	gl.glVertex2f(f, f_2_);
	gl.glVertex2f(f_0_, f_2_);
	gl.glVertex2f(f_0_, f_1_);
	gl.glEnd();
    }
    
    public static void method998(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	Class121.method1637();
	float f = (float) arg0;
	float f_3_ = f + (float) arg2;
	float f_4_ = (float) (Class121.anInt2034 - arg1);
	float f_5_ = f_4_ - (float) arg3;
	GL gl = Class121.aGL2030;
	gl.glBegin(6);
	gl.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
	gl.glVertex2f(f_3_, f_4_);
	gl.glVertex2f(f, f_4_);
	gl.glColor3ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5);
	gl.glVertex2f(f, f_5_);
	gl.glVertex2f(f_3_, f_5_);
	gl.glEnd();
    }
    
    public static void method999(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg2 > Class121.anInt2033)
	    arg2 = Class121.anInt2033;
	if (arg3 > Class121.anInt2034)
	    arg3 = Class121.anInt2034;
	anInt475 = arg0;
	anInt478 = arg1;
	anInt476 = arg2;
	anInt477 = arg3;
	GL gl = Class121.aGL2030;
	gl.glEnable(3089);
	if (anInt475 > anInt476 || anInt478 > anInt477)
	    gl.glScissor(0, 0, 0, 0);
	else
	    gl.glScissor(anInt475, Class121.anInt2034 - anInt477,
			 anInt476 - anInt475, anInt477 - anInt478);
	method996();
    }
    
    public static void method1000(int arg0, int arg1, int arg2, int arg3) {
	Class121.method1637();
	float f = (float) arg0 + 0.3F;
	float f_6_ = (float) Class121.anInt2034 - ((float) arg1 + 0.3F);
	float f_7_ = f_6_ - (float) arg2;
	GL gl = Class121.aGL2030;
	gl.glBegin(1);
	gl.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
	gl.glVertex2f(f, f_6_);
	gl.glVertex2f(f, f_7_);
	gl.glEnd();
    }
    
    public static void method1001() {
	aClass14_Sub2_Sub19_Sub2_479 = null;
    }
    
    public static void method1002(int arg0, int arg1, int arg2, int arg3) {
	if (anInt475 < arg0)
	    anInt475 = arg0;
	if (anInt478 < arg1)
	    anInt478 = arg1;
	if (anInt476 > arg2)
	    anInt476 = arg2;
	if (anInt477 > arg3)
	    anInt477 = arg3;
	GL gl = Class121.aGL2030;
	gl.glEnable(3089);
	if (anInt475 > anInt476 || anInt478 > anInt477)
	    gl.glScissor(0, 0, 0, 0);
	else
	    gl.glScissor(anInt475, Class121.anInt2034 - anInt477,
			 anInt476 - anInt475, anInt477 - anInt478);
	method996();
    }
    
    public static void method1003(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	Class121.method1637();
	float f = (float) arg0 + 0.3F;
	float f_8_ = f + (float) (arg2 - 1);
	float f_9_ = (float) Class121.anInt2034 - ((float) arg1 + 0.3F);
	float f_10_ = f_9_ - (float) (arg3 - 1);
	GL gl = Class121.aGL2030;
	gl.glBegin(2);
	gl.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
	gl.glVertex2f(f, f_9_);
	gl.glVertex2f(f, f_10_);
	gl.glVertex2f(f_8_, f_10_);
	gl.glVertex2f(f_8_, f_9_);
	gl.glEnd();
    }
    
    public static void method1004(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	Class121.method1637();
	float f = (float) arg0;
	float f_11_ = f + (float) arg2;
	float f_12_ = (float) (Class121.anInt2034 - arg1);
	float f_13_ = f_12_ - (float) arg3;
	GL gl = Class121.aGL2030;
	gl.glBegin(6);
	gl.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
	gl.glVertex2f(f, f_12_);
	gl.glVertex2f(f, f_13_);
	gl.glVertex2f(f_11_, f_13_);
	gl.glVertex2f(f_11_, f_12_);
	gl.glEnd();
    }
    
    public static void method1005(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	Class121.method1637();
	float f = (float) arg0 + 0.3F;
	float f_14_ = (float) arg2 + 0.3F;
	float f_15_ = (float) Class121.anInt2034 - ((float) arg1 + 0.3F);
	float f_16_ = (float) Class121.anInt2034 - ((float) arg3 + 0.3F);
	GL gl = Class121.aGL2030;
	gl.glBegin(2);
	gl.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4);
	gl.glVertex2f(f, f_15_);
	gl.glVertex2f(f_14_, f_16_);
	gl.glEnd();
    }
    
    public static void method1006(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	int i = arg2 - arg0;
	int i_17_ = arg3 - arg1;
	int i_18_ = i >= 0 ? i : -i;
	int i_19_ = i_17_ >= 0 ? i_17_ : -i_17_;
	int i_20_ = i_18_;
	if (i_20_ < i_19_)
	    i_20_ = i_19_;
	if (i_20_ != 0) {
	    int i_21_ = (i << 16) / i_20_;
	    int i_22_ = (i_17_ << 16) / i_20_;
	    if (i_22_ <= i_21_)
		i_21_ = -i_21_;
	    else
		i_22_ = -i_22_;
	    int i_23_ = arg5 * i_22_ >> 17;
	    int i_24_ = arg5 * i_22_ + 1 >> 17;
	    int i_25_ = arg5 * i_21_ >> 17;
	    int i_26_ = arg5 * i_21_ + 1 >> 17;
	    int i_27_ = arg0 + i_23_;
	    int i_28_ = arg0 - i_24_;
	    int i_29_ = arg0 + i - i_24_;
	    int i_30_ = arg0 + i + i_23_;
	    int i_31_ = arg1 + i_25_;
	    int i_32_ = arg1 - i_26_;
	    int i_33_ = arg1 + i_17_ - i_26_;
	    int i_34_ = arg1 + i_17_ + i_25_;
	    Class121.method1637();
	    GL gl = Class121.aGL2030;
	    gl.glColor3ub((byte) (arg4 >> 16), (byte) (arg4 >> 8),
			  (byte) arg4);
	    gl.glBegin(6);
	    if (i_22_ <= i_21_) {
		gl.glVertex2f((float) i_30_,
			      (float) (Class121.anInt2034 - i_34_));
		gl.glVertex2f((float) i_29_,
			      (float) (Class121.anInt2034 - i_33_));
		gl.glVertex2f((float) i_28_,
			      (float) (Class121.anInt2034 - i_32_));
		gl.glVertex2f((float) i_27_,
			      (float) (Class121.anInt2034 - i_31_));
	    } else {
		gl.glVertex2f((float) i_27_,
			      (float) (Class121.anInt2034 - i_31_));
		gl.glVertex2f((float) i_28_,
			      (float) (Class121.anInt2034 - i_32_));
		gl.glVertex2f((float) i_29_,
			      (float) (Class121.anInt2034 - i_33_));
		gl.glVertex2f((float) i_30_,
			      (float) (Class121.anInt2034 - i_34_));
	    }
	    gl.glEnd();
	}
    }
    
    public static void method1007(int arg0, int arg1, int arg2, int arg3) {
	Class121.method1637();
	float f = (float) arg0 + 0.3F;
	float f_35_ = f + (float) arg2;
	float f_36_ = (float) Class121.anInt2034 - ((float) arg1 + 0.3F);
	GL gl = Class121.aGL2030;
	gl.glBegin(1);
	gl.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3);
	gl.glVertex2f(f, f_36_);
	gl.glVertex2f(f_35_, f_36_);
	gl.glEnd();
    }
    
    public static void method1008(Class14_Sub2_Sub19_Sub2 arg0) {
	if (arg0.anInt4042 != anInt477 - anInt478)
	    throw new IllegalArgumentException();
	aClass14_Sub2_Sub19_Sub2_479 = arg0;
    }
    
    public static void method1009(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	Class121.method1637();
	float f = (float) arg0;
	float f_37_ = f + (float) arg2;
	float f_38_ = (float) (Class121.anInt2034 - arg1);
	float f_39_ = f_38_ - (float) arg3;
	GL gl = Class121.aGL2030;
	gl.glBegin(6);
	gl.glColor4ub((byte) (arg4 >> 16), (byte) (arg4 >> 8), (byte) arg4,
		      arg5 > 255 ? (byte) -1 : (byte) arg5);
	gl.glVertex2f(f, f_38_);
	gl.glVertex2f(f, f_39_);
	gl.glVertex2f(f_37_, f_39_);
	gl.glVertex2f(f_37_, f_38_);
	gl.glEnd();
    }
    
    static {
	anInt477 = 0;
	aClass14_Sub2_Sub19_Sub2_479 = null;
    }
}
