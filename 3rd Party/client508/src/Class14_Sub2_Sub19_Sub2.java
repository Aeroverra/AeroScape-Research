/* Class14_Sub2_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class14_Sub2_Sub19_Sub2 extends Class14_Sub2_Sub19
{
    public int anInt5089 = -1;
    public int anInt5090;
    public int anInt5091;
    public int anInt5092;
    public int anInt5093;
    public int anInt5094 = -1;
    public int anInt5095;
    
    public void method398(int arg0, int arg1, int arg2) {
	Class121.method1655();
	arg0 += anInt4033;
	arg1 += anInt4050;
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	gl.glColor4f(1.0F, 1.0F, 1.0F, (float) arg2 / 256.0F);
	gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			0.0F);
	gl.glCallList(anInt5094);
	gl.glLoadIdentity();
    }
    
    public void method419(int arg0, int arg1, Class14_Sub2_Sub19_Sub2 arg2) {
	if (arg2 != null) {
	    Class121.method1622();
	    Class121.method1632(arg2.anInt5089);
	    arg2.method423(1);
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5089);
	    method423(1);
	    gl.glActiveTexture(33985);
	    gl.glEnable(3553);
	    gl.glBindTexture(3553, arg2.anInt5089);
	    gl.glTexEnvi(8960, 34161, 7681);
	    gl.glTexEnvi(8960, 34176, 34168);
	    float f
		= (float) (arg0 - Class25.anInt475) / (float) arg2.anInt5092;
	    float f_0_
		= (float) (arg1 - Class25.anInt478) / (float) arg2.anInt5093;
	    float f_1_ = ((float) (arg0 + anInt4035 - Class25.anInt475)
			  / (float) arg2.anInt5092);
	    float f_2_ = ((float) (arg1 + anInt4042 - Class25.anInt478)
			  / (float) arg2.anInt5093);
	    arg0 += anInt4033;
	    arg1 += anInt4050;
	    gl.glBegin(6);
	    gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	    float f_3_ = (float) anInt4035 / (float) anInt5092;
	    float f_4_ = (float) anInt4042 / (float) anInt5093;
	    gl.glMultiTexCoord2f(33985, f_1_, f_0_);
	    gl.glTexCoord2f(f_3_, 0.0F);
	    gl.glVertex2f((float) (arg0 + anInt4035),
			  (float) (Class121.anInt2034 - arg1));
	    gl.glMultiTexCoord2f(33985, f, f_0_);
	    gl.glTexCoord2f(0.0F, 0.0F);
	    gl.glVertex2f((float) arg0, (float) (Class121.anInt2034 - arg1));
	    gl.glMultiTexCoord2f(33985, f, f_2_);
	    gl.glTexCoord2f(0.0F, f_4_);
	    gl.glVertex2f((float) arg0,
			  (float) (Class121.anInt2034 - (arg1 + anInt4042)));
	    gl.glMultiTexCoord2f(33985, f_1_, f_2_);
	    gl.glTexCoord2f(f_3_, f_4_);
	    gl.glVertex2f((float) (arg0 + anInt4035),
			  (float) (Class121.anInt2034 - (arg1 + anInt4042)));
	    gl.glEnd();
	    gl.glTexEnvi(8960, 34161, 8448);
	    gl.glTexEnvi(8960, 34176, 5890);
	    gl.glDisable(3553);
	    gl.glActiveTexture(33984);
	}
    }
    
    public void method400(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 == 256)
	    method391(arg0, arg1);
	else {
	    Class121.method1620();
	    arg0 += anInt4033;
	    arg1 += anInt4050;
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5089);
	    method423(1);
	    gl.glColor3ub((byte) (arg3 >> 16), (byte) (arg3 >> 8),
			  (byte) arg3);
	    gl.glTexEnvfv(8960, 8705,
			  new float[] { 0.0F, 0.0F, 0.0F,
					(float) arg2 / 256.0F },
			  0);
	    gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			    0.0F);
	    gl.glCallList(anInt5094);
	    gl.glLoadIdentity();
	}
    }
    
    public void method420(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, int arg7,
			  Class14_Sub2_Sub19_Sub2 arg8) {
	if (arg8 != null) {
	    Class121.method1622();
	    Class121.method1632(arg8.anInt5089);
	    arg8.method423(1);
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5089);
	    method423(1);
	    gl.glActiveTexture(33985);
	    gl.glEnable(3553);
	    gl.glBindTexture(3553, arg8.anInt5089);
	    gl.glTexEnvi(8960, 34161, 7681);
	    gl.glTexEnvi(8960, 34176, 34168);
	    int i = -arg2 / 2;
	    int i_5_ = -arg3 / 2;
	    int i_6_ = -i;
	    int i_7_ = -i_5_;
	    int i_8_ = (int) (Math.sin((double) arg6 / 326.11) * 65536.0);
	    int i_9_ = (int) (Math.cos((double) arg6 / 326.11) * 65536.0);
	    i_8_ = i_8_ * arg7 >> 8;
	    i_9_ = i_9_ * arg7 >> 8;
	    int i_10_ = (arg4 << 16) + (i_5_ * i_8_ + i * i_9_);
	    int i_11_ = (arg5 << 16) + (i_5_ * i_9_ - i * i_8_);
	    int i_12_ = (arg4 << 16) + (i_5_ * i_8_ + i_6_ * i_9_);
	    int i_13_ = (arg5 << 16) + (i_5_ * i_9_ - i_6_ * i_8_);
	    int i_14_ = (arg4 << 16) + (i_7_ * i_8_ + i * i_9_);
	    int i_15_ = (arg5 << 16) + (i_7_ * i_9_ - i * i_8_);
	    int i_16_ = (arg4 << 16) + (i_7_ * i_8_ + i_6_ * i_9_);
	    int i_17_ = (arg5 << 16) + (i_7_ * i_9_ - i_6_ * i_8_);
	    float f = (float) arg8.anInt4035 / (float) arg8.anInt5092;
	    float f_18_ = (float) arg8.anInt4042 / (float) arg8.anInt5093;
	    gl.glBegin(6);
	    gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	    float f_19_ = 65536.0F * (float) anInt5092;
	    float f_20_ = (float) (65536 * anInt5093);
	    gl.glMultiTexCoord2f(33985, f, 0.0F);
	    gl.glTexCoord2f((float) i_12_ / f_19_, (float) i_13_ / f_20_);
	    gl.glVertex2f((float) (arg0 + arg2),
			  (float) (Class121.anInt2034 - arg1));
	    gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
	    gl.glTexCoord2f((float) i_10_ / f_19_, (float) i_11_ / f_20_);
	    gl.glVertex2f((float) arg0, (float) (Class121.anInt2034 - arg1));
	    gl.glMultiTexCoord2f(33985, 0.0F, f_18_);
	    gl.glTexCoord2f((float) i_14_ / f_19_, (float) i_15_ / f_20_);
	    gl.glVertex2f((float) arg0,
			  (float) (Class121.anInt2034 - (arg1 + arg3)));
	    gl.glMultiTexCoord2f(33985, f, f_18_);
	    gl.glTexCoord2f((float) i_16_ / f_19_, (float) i_17_ / f_20_);
	    gl.glVertex2f((float) (arg0 + arg2),
			  (float) (Class121.anInt2034 - (arg1 + arg3)));
	    gl.glEnd();
	    gl.glTexEnvi(8960, 34161, 8448);
	    gl.glTexEnvi(8960, 34176, 5890);
	    gl.glDisable(3553);
	    gl.glActiveTexture(33984);
	}
    }
    
    public void method421(int arg0, int arg1, int arg2, int arg3) {
	Class121.method1622();
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	float f = (float) anInt4035 / (float) anInt5092;
	float f_21_ = (float) anInt4042 / (float) anInt5093;
	f *= (float) arg2;
	f_21_ *= (float) arg3;
	int i = arg0 + anInt4033;
	int i_22_ = i + anInt4035 * arg2;
	int i_23_ = Class121.anInt2034 - arg1 - anInt4050;
	int i_24_ = i_23_ - anInt4042 * arg3;
	gl.glBegin(6);
	gl.glTexCoord2f(f, 0.0F);
	gl.glVertex2f((float) i_22_, (float) i_23_);
	gl.glTexCoord2f(0.0F, 0.0F);
	gl.glVertex2f((float) i, (float) i_23_);
	gl.glTexCoord2f(0.0F, f_21_);
	gl.glVertex2f((float) i, (float) i_24_);
	gl.glTexCoord2f(f, f_21_);
	gl.glVertex2f((float) i_22_, (float) i_24_);
	gl.glEnd();
    }
    
    public void method422() {
	float f = (float) anInt4035 / (float) anInt5092;
	float f_25_ = (float) anInt4042 / (float) anInt5093;
	GL gl = Class121.aGL2030;
	if (anInt5094 == -1) {
	    anInt5094 = gl.glGenLists(1);
	    anInt5095 = Class11.anInt267;
	}
	gl.glNewList(anInt5094, 4864);
	gl.glBegin(6);
	gl.glTexCoord2f(f, 0.0F);
	gl.glVertex2f((float) anInt4035, 0.0F);
	gl.glTexCoord2f(0.0F, 0.0F);
	gl.glVertex2f(0.0F, 0.0F);
	gl.glTexCoord2f(0.0F, f_25_);
	gl.glVertex2f(0.0F, (float) -anInt4042);
	gl.glTexCoord2f(f, f_25_);
	gl.glVertex2f((float) anInt4035, (float) -anInt4042);
	gl.glEnd();
	gl.glEndList();
    }
    
    public void method423(int arg0) {
	if (anInt5090 != arg0) {
	    anInt5090 = arg0;
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
    
    public void method391(int arg0, int arg1) {
	Class121.method1622();
	arg0 += anInt4033;
	arg1 += anInt4050;
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			0.0F);
	gl.glCallList(anInt5094);
	gl.glLoadIdentity();
    }
    
    public void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 > 0 && arg3 > 0) {
	    Class121.method1655();
	    int i = anInt4035;
	    int i_26_ = anInt4042;
	    int i_27_ = 0;
	    int i_28_ = 0;
	    int i_29_ = anInt4034;
	    int i_30_ = anInt4046;
	    int i_31_ = (i_29_ << 16) / arg2;
	    int i_32_ = (i_30_ << 16) / arg3;
	    if (anInt4033 > 0) {
		int i_33_ = ((anInt4033 << 16) + i_31_ - 1) / i_31_;
		arg0 += i_33_;
		i_27_ += i_33_ * i_31_ - (anInt4033 << 16);
	    }
	    if (anInt4050 > 0) {
		int i_34_ = ((anInt4050 << 16) + i_32_ - 1) / i_32_;
		arg1 += i_34_;
		i_28_ += i_34_ * i_32_ - (anInt4050 << 16);
	    }
	    if (i < i_29_)
		arg2 = ((i << 16) - i_27_ + i_31_ - 1) / i_31_;
	    if (i_26_ < i_30_)
		arg3 = ((i_26_ << 16) - i_28_ + i_32_ - 1) / i_32_;
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5089);
	    method423(1);
	    float f = (float) arg0;
	    float f_35_ = f + (float) arg2;
	    float f_36_ = (float) (Class121.anInt2034 - arg1);
	    float f_37_ = f_36_ - (float) arg3;
	    float f_38_ = (float) anInt4035 / (float) anInt5092;
	    float f_39_ = (float) anInt4042 / (float) anInt5093;
	    float f_40_ = (float) arg4 / 256.0F;
	    gl.glBegin(6);
	    gl.glColor4f(1.0F, 1.0F, 1.0F, f_40_);
	    gl.glTexCoord2f(f_38_, 0.0F);
	    gl.glVertex2f(f_35_, f_36_);
	    gl.glTexCoord2f(0.0F, 0.0F);
	    gl.glVertex2f(f, f_36_);
	    gl.glTexCoord2f(0.0F, f_39_);
	    gl.glVertex2f(f, f_37_);
	    gl.glTexCoord2f(f_38_, f_39_);
	    gl.glVertex2f(f_35_, f_37_);
	    gl.glEnd();
	}
    }
    
    public void method395(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	Class121.method1622();
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	arg0 -= anInt4033 << 4;
	arg1 -= anInt4050 << 4;
	gl.glTranslatef((float) arg2 / 16.0F,
			(float) Class121.anInt2034 - (float) arg3 / 16.0F,
			0.0F);
	gl.glRotatef((float) arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
	if (arg5 != 4096)
	    gl.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
	gl.glTranslatef((float) -arg0 / 16.0F, (float) arg1 / 16.0F, 0.0F);
	gl.glCallList(anInt5094);
	gl.glLoadIdentity();
    }
    
    public void finalize() throws Throwable {
	if (anInt5089 != -1) {
	    Class11.method208(anInt5089, anInt5091, anInt5095);
	    anInt5089 = -1;
	    anInt5091 = 0;
	}
	if (anInt5094 != -1) {
	    Class11.method206(anInt5094, anInt5095);
	    anInt5094 = -1;
	}
	super.finalize();
    }
    
    public void method390(int arg0, int arg1) {
	Class121.method1622();
	arg0 += anInt4033;
	arg1 += anInt4050;
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	gl.glTranslatef((float) arg0, (float) (Class121.anInt2034 - arg1),
			0.0F);
	gl.glCallList(anInt5094);
	gl.glLoadIdentity();
    }
    
    public void method389(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 > 0 && arg3 > 0) {
	    Class121.method1622();
	    int i = anInt4035;
	    int i_41_ = anInt4042;
	    int i_42_ = 0;
	    int i_43_ = 0;
	    int i_44_ = anInt4034;
	    int i_45_ = anInt4046;
	    int i_46_ = (i_44_ << 16) / arg2;
	    int i_47_ = (i_45_ << 16) / arg3;
	    if (anInt4033 > 0) {
		int i_48_ = ((anInt4033 << 16) + i_46_ - 1) / i_46_;
		arg0 += i_48_;
		i_42_ += i_48_ * i_46_ - (anInt4033 << 16);
	    }
	    if (anInt4050 > 0) {
		int i_49_ = ((anInt4050 << 16) + i_47_ - 1) / i_47_;
		arg1 += i_49_;
		i_43_ += i_49_ * i_47_ - (anInt4050 << 16);
	    }
	    if (i < i_44_)
		arg2 = ((i << 16) - i_42_ + i_46_ - 1) / i_46_;
	    if (i_41_ < i_45_)
		arg3 = ((i_41_ << 16) - i_43_ + i_47_ - 1) / i_47_;
	    GL gl = Class121.aGL2030;
	    Class121.method1632(anInt5089);
	    method423(2);
	    float f = (float) arg0;
	    float f_50_ = f + (float) arg2;
	    float f_51_ = (float) (Class121.anInt2034 - arg1);
	    float f_52_ = f_51_ - (float) arg3;
	    float f_53_ = (float) anInt4035 / (float) anInt5092;
	    float f_54_ = (float) anInt4042 / (float) anInt5093;
	    gl.glBegin(6);
	    gl.glTexCoord2f(f_53_, 0.0F);
	    gl.glVertex2f(f_50_, f_51_);
	    gl.glTexCoord2f(0.0F, 0.0F);
	    gl.glVertex2f(f, f_51_);
	    gl.glTexCoord2f(0.0F, f_54_);
	    gl.glVertex2f(f, f_52_);
	    gl.glTexCoord2f(f_53_, f_54_);
	    gl.glVertex2f(f_50_, f_52_);
	    gl.glEnd();
	}
    }
    
    public void method424(int arg0, int arg1, int arg2, int arg3, int arg4) {
	Class121.method1655();
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(1);
	float f = (float) anInt4035 / (float) anInt5092;
	float f_55_ = (float) anInt4042 / (float) anInt5093;
	f *= (float) arg3;
	f_55_ *= (float) arg4;
	int i = arg0 + anInt4033;
	int i_56_ = i + anInt4035 * arg3;
	int i_57_ = Class121.anInt2034 - arg1 - anInt4050;
	int i_58_ = i_57_ - anInt4042 * arg4;
	float f_59_ = (float) arg2 / 256.0F;
	gl.glBegin(6);
	gl.glColor4f(1.0F, 1.0F, 1.0F, f_59_);
	gl.glTexCoord2f(f, 0.0F);
	gl.glVertex2f((float) i_56_, (float) i_57_);
	gl.glTexCoord2f(0.0F, 0.0F);
	gl.glVertex2f((float) i, (float) i_57_);
	gl.glTexCoord2f(0.0F, f_55_);
	gl.glVertex2f((float) i, (float) i_58_);
	gl.glTexCoord2f(f, f_55_);
	gl.glVertex2f((float) i_56_, (float) i_58_);
	gl.glEnd();
    }
    
    public void method425(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	Class121.method1622();
	GL gl = Class121.aGL2030;
	Class121.method1632(anInt5089);
	method423(2);
	arg0 -= anInt4033 << 4;
	arg1 -= anInt4050 << 4;
	gl.glTranslatef((float) arg2 / 16.0F,
			(float) Class121.anInt2034 - (float) arg3 / 16.0F,
			0.0F);
	gl.glRotatef((float) -arg4 * 0.005493164F, 0.0F, 0.0F, 1.0F);
	if (arg5 != 4096)
	    gl.glScalef((float) arg5 / 4096.0F, (float) arg5 / 4096.0F, 0.0F);
	gl.glTranslatef((float) -arg0 / 16.0F, (float) arg1 / 16.0F, 0.0F);
	gl.glCallList(anInt5094);
	gl.glLoadIdentity();
    }
    
    public Class14_Sub2_Sub19_Sub2(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int[] arg6) {
	anInt5090 = 0;
	anInt5091 = 0;
	anInt4034 = arg0;
	anInt4046 = arg1;
	anInt4033 = arg2;
	anInt4050 = arg3;
	anInt4035 = arg4;
	anInt4042 = arg5;
	method426(arg6);
	method422();
    }
    
    public Class14_Sub2_Sub19_Sub2(Class14_Sub2_Sub19_Sub1 arg0) {
	anInt5090 = 0;
	anInt5091 = 0;
	anInt4034 = arg0.anInt4034;
	anInt4046 = arg0.anInt4046;
	anInt4033 = arg0.anInt4033;
	anInt4050 = arg0.anInt4050;
	anInt4035 = arg0.anInt4035;
	anInt4042 = arg0.anInt4042;
	method426(arg0.anIntArray5088);
	method422();
    }
    
    public void method426(int[] arg0) {
	anInt5092 = Class14_Sub8_Sub33.method653(anInt4035, 122);
	anInt5093 = Class14_Sub8_Sub33.method653(anInt4042, 122);
	byte[] is = new byte[anInt5092 * anInt5093 * 4];
	int i = 0;
	int i_60_ = 0;
	int i_61_ = (anInt5092 - anInt4035) * 4;
	for (int i_62_ = 0; i_62_ < anInt4042; i_62_++) {
	    for (int i_63_ = 0; i_63_ < anInt4035; i_63_++) {
		int i_64_ = arg0[i_60_++];
		if (i_64_ != 0) {
		    is[i++] = (byte) (i_64_ >> 16);
		    is[i++] = (byte) (i_64_ >> 8);
		    is[i++] = (byte) i_64_;
		    is[i++] = (byte) -1;
		} else
		    i += 4;
	    }
	    i += i_61_;
	}
	ByteBuffer bytebuffer = ByteBuffer.wrap(is);
	GL gl = Class121.aGL2030;
	if (anInt5089 == -1) {
	    int[] is_65_ = new int[1];
	    gl.glGenTextures(1, is_65_, 0);
	    anInt5089 = is_65_[0];
	    anInt5095 = Class11.anInt267;
	}
	Class121.method1632(anInt5089);
	gl.glTexImage2D(3553, 0, 6408, anInt5092, anInt5093, 0, 6408, 5121,
			bytebuffer);
	Class11.anInt263 += bytebuffer.limit() - anInt5091;
	anInt5091 = bytebuffer.limit();
    }
}
