/* Class133_Sub7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class133_Sub7_Sub2 extends Class133_Sub7
{
    public boolean aBoolean5009;
    public int[] anIntArray5010;
    public static Class14_Sub10 aClass14_Sub10_5011 = new Class14_Sub10(10000);
    public float[] aFloatArray5012;
    public Class50 aClass50_5013;
    public int anInt5014 = 0;
    public int[][] anIntArrayArray5015;
    public byte[] aByteArray5016;
    public short[] aShortArray5017;
    public Class41 aClass41_5018;
    public short[] aShortArray5019;
    public Class29 aClass29_5020;
    public short[] aShortArray5021;
    public int[] anIntArray5022;
    public byte aByte5023;
    public short aShort5024;
    public short[] aShortArray5025;
    public byte aByte5026;
    public int[] anIntArray5027;
    public Class41 aClass41_5028;
    public Class41 aClass41_5029;
    public Class41 aClass41_5030;
    public int[] anIntArray5031;
    public short aShort5032;
    public int anInt5033;
    public int[] anIntArray5034;
    public int[] anIntArray5035;
    public short[] aShortArray5036;
    public short[] aShortArray5037;
    public short[] aShortArray5038;
    public Class77 aClass77_5039;
    public int anInt5040;
    public short[] aShortArray5041;
    public short[] aShortArray5042;
    public byte[] aByteArray5043;
    public int[][] anIntArrayArray5044;
    public short[] aShortArray5045;
    public Class41 aClass41_5046;
    public float[] aFloatArray5047;
    public static long[] aLongArray5048;
    public static Class133_Sub7_Sub2 aClass133_Sub7_Sub2_5049
	= new Class133_Sub7_Sub2();
    public static ByteBuffer aByteBuffer5050;
    public static Class133_Sub7_Sub2 aClass133_Sub7_Sub2_5051
	= new Class133_Sub7_Sub2();
    public static Class133_Sub7_Sub2 aClass133_Sub7_Sub2_5052
	= new Class133_Sub7_Sub2();
    public static Class133_Sub7_Sub2 aClass133_Sub7_Sub2_5053
	= new Class133_Sub7_Sub2();
    public static int anInt5054;
    public static int anInt5055;
    public static float aFloat5056;
    public static int[] anIntArray5057;
    public static float aFloat5058;
    public static int anInt5059;
    public static float aFloat5060;
    public static int[] anIntArray5061 = new int[1];
    public static float aFloat5062;
    public static float aFloat5063;
    public static float aFloat5064;
    
    public void method1887() {
	GL gl = Class121.aGL2030;
	if (anInt5014 != 0) {
	    if (aByte5026 != 0)
		method1905(true,
			   (!aClass41_5028.aBoolean682
			    && (aByte5026 & 0x1) != 0),
			   (!aClass41_5030.aBoolean682
			    && (aByte5026 & 0x2) != 0),
			   (aClass41_5018 != null && !aClass41_5018.aBoolean682
			    && (aByte5026 & 0x4) != 0),
			   false);
	    method1905(false, !aClass41_5028.aBoolean682,
		       !aClass41_5030.aBoolean682,
		       aClass41_5018 != null && !aClass41_5018.aBoolean682,
		       !aClass41_5029.aBoolean682);
	    if (!aClass41_5046.aBoolean682)
		method1902();
	    if (aByte5023 != 0) {
		if ((aByte5023 & 0x1) != 0) {
		    anIntArray5027 = null;
		    anIntArray5022 = null;
		    anIntArray5010 = null;
		    aShortArray5036 = null;
		    anIntArray5031 = null;
		}
		if ((aByte5023 & 0x2) != 0) {
		    aShortArray5045 = null;
		    aByteArray5043 = null;
		}
		if ((aByte5023 & 0x4) != 0) {
		    aShortArray5041 = null;
		    aShortArray5019 = null;
		    aShortArray5042 = null;
		    aShortArray5017 = null;
		}
		if ((aByte5023 & 0x8) != 0) {
		    aFloatArray5047 = null;
		    aFloatArray5012 = null;
		}
		if ((aByte5023 & 0x10) != 0) {
		    aShortArray5021 = null;
		    aShortArray5025 = null;
		    aShortArray5038 = null;
		}
		aByte5023 = (byte) 0;
	    }
	    Class29 class29 = null;
	    if (aClass41_5028.aClass29_692 != null) {
		aClass41_5028.aClass29_692.method1053();
		class29 = aClass41_5028.aClass29_692;
		gl.glVertexPointer(3, 5126, aClass41_5028.anInt687,
				   (long) aClass41_5028.anInt686);
	    }
	    if (aClass41_5030.aClass29_692 != null) {
		if (class29 != aClass41_5030.aClass29_692) {
		    aClass41_5030.aClass29_692.method1053();
		    class29 = aClass41_5030.aClass29_692;
		}
		gl.glColorPointer(4, 5121, aClass41_5030.anInt687,
				  (long) aClass41_5030.anInt686);
	    }
	    if (Class7_Sub1.aBoolean2661
		&& aClass41_5018.aClass29_692 != null) {
		if (class29 != aClass41_5018.aClass29_692) {
		    aClass41_5018.aClass29_692.method1053();
		    class29 = aClass41_5018.aClass29_692;
		}
		gl.glNormalPointer(5126, aClass41_5018.anInt687,
				   (long) aClass41_5018.anInt686);
	    }
	    if (aClass41_5029.aClass29_692 != null) {
		if (class29 != aClass41_5029.aClass29_692) {
		    aClass41_5029.aClass29_692.method1053();
		    class29 = aClass41_5029.aClass29_692;
		}
		gl.glTexCoordPointer(2, 5126, aClass41_5029.anInt687,
				     (long) aClass41_5029.anInt686);
	    }
	    if (aClass41_5046.aClass29_692 != null)
		aClass41_5046.aClass29_692.method1055();
	    if (aClass41_5028.aClass29_692 == null
		|| aClass41_5030.aClass29_692 == null
		|| (Class7_Sub1.aBoolean2661
		    && aClass41_5018.aClass29_692 == null)
		|| aClass41_5029.aClass29_692 == null) {
		if (Class121.aBoolean2021)
		    gl.glBindBufferARB(34962, 0);
		if (aClass41_5028.aClass29_692 == null) {
		    aClass41_5028.aByteBuffer684
			.position(aClass41_5028.anInt686);
		    gl.glVertexPointer(3, 5126, aClass41_5028.anInt687,
				       aClass41_5028.aByteBuffer684);
		}
		if (aClass41_5030.aClass29_692 == null) {
		    aClass41_5030.aByteBuffer684
			.position(aClass41_5030.anInt686);
		    gl.glColorPointer(4, 5121, aClass41_5030.anInt687,
				      aClass41_5030.aByteBuffer684);
		}
		if (Class7_Sub1.aBoolean2661
		    && aClass41_5018.aClass29_692 == null) {
		    aClass41_5018.aByteBuffer684
			.position(aClass41_5018.anInt686);
		    gl.glNormalPointer(5126, aClass41_5018.anInt687,
				       aClass41_5018.aByteBuffer684);
		}
		if (aClass41_5029.aClass29_692 == null) {
		    aClass41_5029.aByteBuffer684
			.position(aClass41_5029.anInt686);
		    gl.glTexCoordPointer(2, 5126, aClass41_5029.anInt687,
					 aClass41_5029.aByteBuffer684);
		}
	    }
	    if (aClass41_5046.aClass29_692 == null && Class121.aBoolean2021)
		gl.glBindBufferARB(34963, 0);
	    int i = anIntArray5035.length - 1;
	    for (int i_0_ = 0; i_0_ < i; i_0_++) {
		int i_1_ = anIntArray5035[i_0_];
		int i_2_ = anIntArray5035[i_0_ + 1];
		int i_3_ = aShortArray5037[i_1_];
		if (i_3_ == -1) {
		    Class121.method1632(-1);
		    Class132.method1778(0, (byte) -104, 0);
		} else
		    Class3.anInterface3_117.method16(i_3_ & 0xffff, (byte) 97);
		if (aClass41_5046.aClass29_692 != null)
		    gl.glDrawElements(4, (i_2_ - i_1_) * 3, 5125,
				      (long) (i_1_ * 12));
		else {
		    aClass41_5046.aByteBuffer684.position(i_1_ * 12);
		    gl.glDrawElements(4, (i_2_ - i_1_) * 3, 5125,
				      aClass41_5046.aByteBuffer684);
		}
	    }
	}
    }
    
    public void method1862(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6) {
	if (anInt5040 != 0) {
	    GL gl = Class121.aGL2030;
	    gl.glPushMatrix();
	    if (arg3 != 0)
		gl.glRotatef((float) arg3 * 0.17578125F, 1.0F, 0.0F, 0.0F);
	    gl.glTranslatef((float) arg4, (float) arg5, (float) arg6);
	    if (arg1 != 0)
		gl.glRotatef((float) arg1 * 0.17578125F, 0.0F, 1.0F, 0.0F);
	    if (arg0 != 0)
		gl.glRotatef((float) arg0 * 0.17578125F, 1.0F, 0.0F, 0.0F);
	    if (arg2 != 0)
		gl.glRotatef((float) -arg2 * 0.17578125F, 0.0F, 0.0F, 1.0F);
	    method1887();
	    gl.glPopMatrix();
	}
    }
    
    public static void method1888
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 float[] arg7, int arg8, float arg9, float arg10, float arg11) {
	arg0 -= arg3;
	arg1 -= arg4;
	arg2 -= arg5;
	float f = ((float) arg0 * arg7[0] + (float) arg1 * arg7[1]
		   + (float) arg2 * arg7[2]);
	float f_4_ = ((float) arg0 * arg7[3] + (float) arg1 * arg7[4]
		      + (float) arg2 * arg7[5]);
	float f_5_ = ((float) arg0 * arg7[6] + (float) arg1 * arg7[7]
		      + (float) arg2 * arg7[8]);
	float f_6_;
	float f_7_;
	if (arg6 == 0) {
	    f_6_ = f + arg9 + 0.5F;
	    f_7_ = -f_5_ + arg11 + 0.5F;
	} else if (arg6 == 1) {
	    f_6_ = f + arg9 + 0.5F;
	    f_7_ = f_5_ + arg11 + 0.5F;
	} else if (arg6 == 2) {
	    f_6_ = -f + arg9 + 0.5F;
	    f_7_ = -f_4_ + arg10 + 0.5F;
	} else if (arg6 == 3) {
	    f_6_ = f + arg9 + 0.5F;
	    f_7_ = -f_4_ + arg10 + 0.5F;
	} else if (arg6 == 4) {
	    f_6_ = f_5_ + arg11 + 0.5F;
	    f_7_ = -f_4_ + arg10 + 0.5F;
	} else {
	    f_6_ = -f_5_ + arg11 + 0.5F;
	    f_7_ = -f_4_ + arg10 + 0.5F;
	}
	if (arg8 == 1) {
	    float f_8_ = f_6_;
	    f_6_ = -f_7_;
	    f_7_ = f_8_;
	} else if (arg8 == 2) {
	    f_6_ = -f_6_;
	    f_7_ = -f_7_;
	} else if (arg8 == 3) {
	    float f_9_ = f_6_;
	    f_6_ = f_7_;
	    f_7_ = -f_9_;
	}
	aFloat5056 = f_6_;
	aFloat5063 = f_7_;
    }
    
    public Class148_Sub1 method1889(Class148_Sub1 arg0) {
	if (anInt5040 == 0)
	    return null;
	if (!aClass50_5013.aBoolean820)
	    method1891();
	int i;
	int i_10_;
	if (Class57.anInt934 > 0) {
	    i = (aClass50_5013.aShort827
		 - (aClass50_5013.aShort826 * Class57.anInt934 >> 8)) >> 3;
	    i_10_ = (aClass50_5013.aShort824
		     - (aClass50_5013.aShort825 * Class57.anInt934 >> 8)) >> 3;
	} else {
	    i = (aClass50_5013.aShort827
		 - (aClass50_5013.aShort825 * Class57.anInt934 >> 8)) >> 3;
	    i_10_ = (aClass50_5013.aShort824
		     - (aClass50_5013.aShort826 * Class57.anInt934 >> 8)) >> 3;
	}
	int i_11_;
	int i_12_;
	if (Class57.anInt928 > 0) {
	    i_11_ = (aClass50_5013.aShort822
		     - (aClass50_5013.aShort826 * Class57.anInt928 >> 8)) >> 3;
	    i_12_ = (aClass50_5013.aShort821
		     - (aClass50_5013.aShort825 * Class57.anInt928 >> 8)) >> 3;
	} else {
	    i_11_ = (aClass50_5013.aShort822
		     - (aClass50_5013.aShort825 * Class57.anInt928 >> 8)) >> 3;
	    i_12_ = (aClass50_5013.aShort821
		     - (aClass50_5013.aShort826 * Class57.anInt928 >> 8)) >> 3;
	}
	int i_13_ = i_10_ - i + 1;
	int i_14_ = i_12_ - i_11_ + 1;
	Class148_Sub1 class148_sub1;
	if (arg0 != null && arg0.aByteArray3689.length >= i_13_ * i_14_) {
	    class148_sub1 = arg0;
	    class148_sub1.anInt2378 = class148_sub1.anInt2371 = i_13_;
	    class148_sub1.anInt2373 = class148_sub1.anInt2376 = i_14_;
	    class148_sub1.method2010();
	} else
	    class148_sub1 = new Class148_Sub1(i_13_, i_14_, 0);
	class148_sub1.anInt2375 = i;
	class148_sub1.anInt2374 = i_11_;
	if (anIntArray5061.length < anInt5040) {
	    anIntArray5061 = new int[anInt5040];
	    anIntArray5057 = new int[anInt5040];
	}
	for (int i_15_ = 0; i_15_ < anInt5033; i_15_++) {
	    int i_16_ = (((anIntArray5027[i_15_]
			   - (anIntArray5022[i_15_] * Class57.anInt934 >> 8))
			  >> 3)
			 - i);
	    int i_17_ = (((anIntArray5010[i_15_]
			   - (anIntArray5022[i_15_] * Class57.anInt928 >> 8))
			  >> 3)
			 - i_11_);
	    int i_18_ = anIntArray5031[i_15_];
	    int i_19_ = anIntArray5031[i_15_ + 1];
	    for (int i_20_ = i_18_; i_20_ < i_19_; i_20_++) {
		int i_21_ = aShortArray5036[i_20_] - 1;
		if (i_21_ == -1)
		    break;
		anIntArray5061[i_21_] = i_16_;
		anIntArray5057[i_21_] = i_17_;
	    }
	}
	for (int i_22_ = 0; i_22_ < anInt5014; i_22_++) {
	    if (aByteArray5043[i_22_] <= 128) {
		short i_23_ = aShortArray5021[i_22_];
		short i_24_ = aShortArray5025[i_22_];
		short i_25_ = aShortArray5038[i_22_];
		int i_26_ = anIntArray5061[i_23_];
		int i_27_ = anIntArray5061[i_24_];
		int i_28_ = anIntArray5061[i_25_];
		int i_29_ = anIntArray5057[i_23_];
		int i_30_ = anIntArray5057[i_24_];
		int i_31_ = anIntArray5057[i_25_];
		if (((i_26_ - i_27_) * (i_30_ - i_31_)
		     - (i_30_ - i_29_) * (i_28_ - i_27_))
		    > 0)
		    Class3.method91(class148_sub1.aByteArray3689, i_29_, i_30_,
				    i_31_, i_26_, i_27_, i_28_, i_13_);
	    }
	}
	return class148_sub1;
    }
    
    public void method1890() {
	if (aShortArray5041 == null)
	    method1875();
	else {
	    for (int i = 0; i < anInt5033; i++) {
		int i_32_ = anIntArray5010[i];
		anIntArray5010[i] = anIntArray5027[i];
		anIntArray5027[i] = -i_32_;
	    }
	    for (int i = 0; i < anInt5040; i++) {
		int i_33_ = aShortArray5042[i];
		aShortArray5042[i] = aShortArray5041[i];
		aShortArray5041[i] = (short) -i_33_;
	    }
	    aClass50_5013.aBoolean820 = false;
	    aClass41_5028.aBoolean682 = false;
	    if (aClass41_5018 != null)
		aClass41_5018.aBoolean682 = false;
	}
    }
    
    public void method1891() {
	int i = 32767;
	int i_34_ = 32767;
	int i_35_ = 32767;
	int i_36_ = -32768;
	int i_37_ = -32768;
	int i_38_ = -32768;
	int i_39_ = 0;
	int i_40_ = 0;
	for (int i_41_ = 0; i_41_ < anInt5033; i_41_++) {
	    int i_42_ = anIntArray5027[i_41_];
	    int i_43_ = anIntArray5022[i_41_];
	    int i_44_ = anIntArray5010[i_41_];
	    if (i_42_ < i)
		i = i_42_;
	    if (i_42_ > i_36_)
		i_36_ = i_42_;
	    if (i_43_ < i_34_)
		i_34_ = i_43_;
	    if (i_43_ > i_37_)
		i_37_ = i_43_;
	    if (i_44_ < i_35_)
		i_35_ = i_44_;
	    if (i_44_ > i_38_)
		i_38_ = i_44_;
	    int i_45_ = i_42_ * i_42_ + i_44_ * i_44_;
	    if (i_45_ > i_39_)
		i_39_ = i_45_;
	    i_45_ = i_42_ * i_42_ + i_44_ * i_44_ + i_43_ * i_43_;
	    if (i_45_ > i_40_)
		i_40_ = i_45_;
	}
	aClass50_5013.aShort827 = (short) i;
	aClass50_5013.aShort824 = (short) i_36_;
	aClass50_5013.aShort825 = (short) i_34_;
	aClass50_5013.aShort826 = (short) i_37_;
	aClass50_5013.aShort822 = (short) i_35_;
	aClass50_5013.aShort821 = (short) i_38_;
	aClass50_5013.aShort823
	    = (short) (int) (Math.sqrt((double) i_39_) + 0.99);
	Math.sqrt((double) i_40_);
	aClass50_5013.aBoolean820 = true;
    }
    
    public void method1892(int arg0) {
	aShort5032 = (short) arg0;
	aClass41_5030.aBoolean682 = false;
    }
    
    public void method1893(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 == 0) {
	    int i = 0;
	    anInt5055 = 0;
	    anInt5059 = 0;
	    anInt5054 = 0;
	    for (int i_46_ = 0; i_46_ < anInt5033; i_46_++) {
		anInt5055 += anIntArray5027[i_46_];
		anInt5059 += anIntArray5022[i_46_];
		anInt5054 += anIntArray5010[i_46_];
		i++;
	    }
	    if (i > 0) {
		anInt5055 = anInt5055 / i + arg1;
		anInt5059 = anInt5059 / i + arg2;
		anInt5054 = anInt5054 / i + arg3;
	    } else {
		anInt5055 = arg1;
		anInt5059 = arg2;
		anInt5054 = arg3;
	    }
	} else if (arg0 == 1) {
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] += arg1;
		anIntArray5022[i] += arg2;
		anIntArray5010[i] += arg3;
	    }
	} else if (arg0 == 2) {
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] -= anInt5055;
		anIntArray5022[i] -= anInt5059;
		anIntArray5010[i] -= anInt5054;
		if (arg3 != 0) {
		    int i_47_ = Class3.anIntArray108[arg3];
		    int i_48_ = Class3.anIntArray111[arg3];
		    int i_49_ = ((anIntArray5022[i] * i_47_
				  + anIntArray5027[i] * i_48_ + 32767)
				 >> 16);
		    anIntArray5022[i]
			= (anIntArray5022[i] * i_48_
			   - anIntArray5027[i] * i_47_ + 32767) >> 16;
		    anIntArray5027[i] = i_49_;
		}
		if (arg1 != 0) {
		    int i_50_ = Class3.anIntArray108[arg1];
		    int i_51_ = Class3.anIntArray111[arg1];
		    int i_52_ = ((anIntArray5022[i] * i_51_
				  - anIntArray5010[i] * i_50_ + 32767)
				 >> 16);
		    anIntArray5010[i]
			= (anIntArray5022[i] * i_50_
			   + anIntArray5010[i] * i_51_ + 32767) >> 16;
		    anIntArray5022[i] = i_52_;
		}
		if (arg2 != 0) {
		    int i_53_ = Class3.anIntArray108[arg2];
		    int i_54_ = Class3.anIntArray111[arg2];
		    int i_55_ = ((anIntArray5010[i] * i_53_
				  + anIntArray5027[i] * i_54_ + 32767)
				 >> 16);
		    anIntArray5010[i]
			= (anIntArray5010[i] * i_54_
			   - anIntArray5027[i] * i_53_ + 32767) >> 16;
		    anIntArray5027[i] = i_55_;
		}
		anIntArray5027[i] += anInt5055;
		anIntArray5022[i] += anInt5059;
		anIntArray5010[i] += anInt5054;
	    }
	} else if (arg0 == 3) {
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] -= anInt5055;
		anIntArray5022[i] -= anInt5059;
		anIntArray5010[i] -= anInt5054;
		anIntArray5027[i] = anIntArray5027[i] * arg1 / 128;
		anIntArray5022[i] = anIntArray5022[i] * arg2 / 128;
		anIntArray5010[i] = anIntArray5010[i] * arg3 / 128;
		anIntArray5027[i] += anInt5055;
		anIntArray5022[i] += anInt5059;
		anIntArray5010[i] += anInt5054;
	    }
	} else if (arg0 == 5) {
	    for (int i = 0; i < anInt5014; i++) {
		int i_56_ = (aByteArray5043[i] & 0xff) + arg1 * 8;
		if (i_56_ < 0)
		    i_56_ = 0;
		else if (i_56_ > 255)
		    i_56_ = 255;
		aByteArray5043[i] = (byte) i_56_;
	    }
	    aClass41_5030.aBoolean682 = false;
	}
    }
    
    public static float[] method1894(float[] arg0, int arg1) {
	float[] fs = new float[arg1];
	Class72.method1323(arg0, 0, fs, 0, arg1);
	return fs;
    }
    
    public void method1873(Class14_Sub2_Sub15 arg0, int arg1,
			   Class14_Sub2_Sub15 arg2, int arg3, int[] arg4,
			   boolean arg5) {
	if (arg1 != -1) {
	    if (arg4 == null || arg3 == -1)
		method1857(arg0, arg1, arg5);
	    else {
		Class143 class143 = arg0.aClass143Array3951[arg1];
		Class143 class143_57_ = arg2.aClass143Array3951[arg3];
		Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
		for (int i = 0; i < anInt5033; i++) {
		    anIntArray5027[i] <<= 4;
		    anIntArray5022[i] <<= 4;
		    anIntArray5010[i] <<= 4;
		}
		anInt5055 = 0;
		anInt5059 = 0;
		anInt5054 = 0;
		int i = 0;
		int i_58_ = arg4[i++];
		for (int i_59_ = 0; i_59_ < class143.anInt2336; i_59_++) {
		    int i_60_;
		    for (i_60_ = class143.aShortArray2335[i_59_];
			 i_60_ > i_58_; i_58_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_60_ != i_58_
			|| class14_sub5.anIntArray2795[i_60_] == 0) {
			if (class143.aShortArray2338[i_59_] != -1)
			    method1917(0,
				       (class14_sub5.anIntArrayArray2798
					[class143.aShortArray2338[i_59_]]),
				       0, 0, 0, arg5);
			method1917(class14_sub5.anIntArray2795[i_60_],
				   class14_sub5.anIntArrayArray2798[i_60_],
				   class143.aShortArray2331[i_59_],
				   class143.aShortArray2340[i_59_],
				   class143.aShortArray2333[i_59_], arg5);
		    }
		}
		anInt5055 = 0;
		anInt5059 = 0;
		anInt5054 = 0;
		i = 0;
		i_58_ = arg4[i++];
		for (int i_61_ = 0; i_61_ < class143_57_.anInt2336; i_61_++) {
		    int i_62_;
		    for (i_62_ = class143_57_.aShortArray2335[i_61_];
			 i_62_ > i_58_; i_58_ = arg4[i++]) {
			/* empty */
		    }
		    if (i_62_ == i_58_
			|| class14_sub5.anIntArray2795[i_62_] == 0) {
			if (class143_57_.aShortArray2338[i_61_] != -1)
			    method1917(0,
				       (class14_sub5.anIntArrayArray2798
					[class143_57_.aShortArray2338[i_61_]]),
				       0, 0, 0, arg5);
			method1917(class14_sub5.anIntArray2795[i_62_],
				   class14_sub5.anIntArrayArray2798[i_62_],
				   class143_57_.aShortArray2331[i_61_],
				   class143_57_.aShortArray2340[i_61_],
				   class143_57_.aShortArray2333[i_61_], arg5);
		    }
		}
		for (int i_63_ = 0; i_63_ < anInt5033; i_63_++) {
		    anIntArray5027[i_63_] >>= 4;
		    anIntArray5022[i_63_] >>= 4;
		    anIntArray5010[i_63_] >>= 4;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.aBoolean682 = false;
	    }
	}
    }
    
    public Class133_Sub7 method1870(boolean arg0, boolean arg1) {
	return method1907(arg0, arg1, aClass133_Sub7_Sub2_5053,
			  aClass133_Sub7_Sub2_5052);
    }
    
    public void method1895(boolean arg0, boolean arg1, boolean arg2,
			   boolean arg3, boolean arg4, boolean arg5,
			   boolean arg6) {
	if (aByte5026 != 0)
	    throw new IllegalArgumentException();
	if (anInt5040 != 0) {
	    if (arg6) {
		boolean bool
		    = (!aClass41_5030.aBoolean682
		       && (arg1 || arg2 && !Class7_Sub1.aBoolean2661));
		method1905(false, !aClass41_5028.aBoolean682 && arg0, bool,
			   (aClass41_5018 != null && !aClass41_5018.aBoolean682
			    && arg2),
			   !aClass41_5029.aBoolean682 && arg3);
		if (!aClass41_5046.aBoolean682 && arg4 && arg1)
		    method1902();
	    }
	    if (arg0) {
		if (aClass41_5028.aBoolean682) {
		    anIntArray5027 = null;
		    anIntArray5022 = null;
		    anIntArray5010 = null;
		    aShortArray5036 = null;
		    anIntArray5031 = null;
		} else
		    aByte5023 |= 0x1;
	    }
	    if (arg1) {
		if (aClass41_5030.aBoolean682) {
		    aShortArray5045 = null;
		    aByteArray5043 = null;
		} else
		    aByte5023 |= 0x2;
	    }
	    if (arg2 && Class7_Sub1.aBoolean2661) {
		if (aClass41_5018.aBoolean682) {
		    aShortArray5041 = null;
		    aShortArray5019 = null;
		    aShortArray5042 = null;
		    aShortArray5017 = null;
		} else
		    aByte5023 |= 0x4;
	    }
	    if (arg3) {
		if (aClass41_5029.aBoolean682) {
		    aFloatArray5047 = null;
		    aFloatArray5012 = null;
		} else
		    aByte5023 |= 0x8;
	    }
	    if (arg4 && arg1) {
		if (aClass41_5046.aBoolean682 && aClass41_5030.aBoolean682) {
		    aShortArray5021 = null;
		    aShortArray5025 = null;
		    aShortArray5038 = null;
		} else
		    aByte5023 |= 0x10;
	    }
	    if (arg5) {
		anIntArray5034 = null;
		aByteArray5016 = null;
		anIntArrayArray5044 = null;
		anIntArrayArray5015 = null;
	    }
	}
    }
    
    public int method1896() {
	return aShort5032;
    }
    
    public void method1858(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_64_ = Class3.anIntArray111[arg0];
	for (int i_65_ = 0; i_65_ < anInt5033; i_65_++) {
	    int i_66_
		= (anIntArray5022[i_65_] * i + anIntArray5027[i_65_] * i_64_
		   >> 16);
	    anIntArray5022[i_65_]
		= (anIntArray5022[i_65_] * i_64_ - anIntArray5027[i_65_] * i
		   >> 16);
	    anIntArray5027[i_65_] = i_66_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public void method1897(int arg0, int arg1, Class133_Sub7_Sub2 arg2,
			   int[][] arg3, int[][] arg4, int arg5, int arg6,
			   int arg7) {
	if (!arg2.aClass50_5013.aBoolean820)
	    arg2.method1891();
	int i = arg5 + arg2.aClass50_5013.aShort827;
	int i_67_ = arg5 + arg2.aClass50_5013.aShort824;
	int i_68_ = arg7 + arg2.aClass50_5013.aShort822;
	int i_69_ = arg7 + arg2.aClass50_5013.aShort821;
	if (arg0 != 1 && arg0 != 2 && arg0 != 3 && arg0 != 5
	    || (i >= 0 && i_67_ + 128 >> 7 < arg3.length && i_68_ >= 0
		&& i_69_ + 128 >> 7 < arg3[0].length)) {
	    if (arg0 == 4 || arg0 == 5) {
		if (arg4 == null
		    || (i < 0 || i_67_ + 128 >> 7 >= arg4.length || i_68_ < 0
			|| i_69_ + 128 >> 7 >= arg4[0].length))
		    return;
	    } else {
		i >>= 7;
		i_67_ = i_67_ + 127 >> 7;
		i_68_ >>= 7;
		i_69_ = i_69_ + 127 >> 7;
		if (arg3[i][i_68_] == arg6 && arg3[i_67_][i_68_] == arg6
		    && arg3[i][i_69_] == arg6 && arg3[i_67_][i_69_] == arg6)
		    return;
	    }
	    if (arg0 == 1) {
		for (int i_70_ = 0; i_70_ < anInt5033; i_70_++) {
		    int i_71_ = anIntArray5027[i_70_] + arg5;
		    int i_72_ = anIntArray5010[i_70_] + arg7;
		    int i_73_ = i_71_ & 0x7f;
		    int i_74_ = i_72_ & 0x7f;
		    int i_75_ = i_71_ >> 7;
		    int i_76_ = i_72_ >> 7;
		    int i_77_ = ((arg3[i_75_][i_76_] * (128 - i_73_)
				  + arg3[i_75_ + 1][i_76_] * i_73_)
				 >> 7);
		    int i_78_ = ((arg3[i_75_][i_76_ + 1] * (128 - i_73_)
				  + arg3[i_75_ + 1][i_76_ + 1] * i_73_)
				 >> 7);
		    int i_79_ = i_77_ * (128 - i_74_) + i_78_ * i_74_ >> 7;
		    anIntArray5022[i_70_]
			= anIntArray5022[i_70_] + i_79_ - arg6;
		}
	    } else if (arg0 == 2) {
		int i_80_ = arg2.aClass50_5013.aShort825;
		for (int i_81_ = 0; i_81_ < anInt5033; i_81_++) {
		    int i_82_ = (anIntArray5022[i_81_] << 16) / i_80_;
		    if (i_82_ < arg1) {
			int i_83_ = anIntArray5027[i_81_] + arg5;
			int i_84_ = anIntArray5010[i_81_] + arg7;
			int i_85_ = i_83_ & 0x7f;
			int i_86_ = i_84_ & 0x7f;
			int i_87_ = i_83_ >> 7;
			int i_88_ = i_84_ >> 7;
			int i_89_ = ((arg3[i_87_][i_88_] * (128 - i_85_)
				      + arg3[i_87_ + 1][i_88_] * i_85_)
				     >> 7);
			int i_90_ = ((arg3[i_87_][i_88_ + 1] * (128 - i_85_)
				      + arg3[i_87_ + 1][i_88_ + 1] * i_85_)
				     >> 7);
			int i_91_ = i_89_ * (128 - i_86_) + i_90_ * i_86_ >> 7;
			anIntArray5022[i_81_]
			    = (anIntArray5022[i_81_]
			       + (i_91_ - arg6) * (arg1 - i_82_) / arg1);
		    }
		}
	    } else if (arg0 == 3) {
		int i_92_ = (arg1 & 0xff) * 4;
		int i_93_ = (arg1 >> 8 & 0xff) * 4;
		method1863(arg3, arg5, arg6, arg7, i_92_, i_93_);
	    } else if (arg0 == 4) {
		int i_94_ = (arg2.aClass50_5013.aShort826
			     - arg2.aClass50_5013.aShort825);
		for (int i_95_ = 0; i_95_ < anInt5033; i_95_++) {
		    int i_96_ = anIntArray5027[i_95_] + arg5;
		    int i_97_ = anIntArray5010[i_95_] + arg7;
		    int i_98_ = i_96_ & 0x7f;
		    int i_99_ = i_97_ & 0x7f;
		    int i_100_ = i_96_ >> 7;
		    int i_101_ = i_97_ >> 7;
		    int i_102_ = ((arg4[i_100_][i_101_] * (128 - i_98_)
				   + arg4[i_100_ + 1][i_101_] * i_98_)
				  >> 7);
		    int i_103_ = ((arg4[i_100_][i_101_ + 1] * (128 - i_98_)
				   + arg4[i_100_ + 1][i_101_ + 1] * i_98_)
				  >> 7);
		    int i_104_ = i_102_ * (128 - i_99_) + i_103_ * i_99_ >> 7;
		    anIntArray5022[i_95_]
			= anIntArray5022[i_95_] + (i_104_ - arg6) + i_94_;
		}
	    } else if (arg0 == 5) {
		int i_105_ = (arg2.aClass50_5013.aShort826
			      - arg2.aClass50_5013.aShort825);
		for (int i_106_ = 0; i_106_ < anInt5033; i_106_++) {
		    int i_107_ = anIntArray5027[i_106_] + arg5;
		    int i_108_ = anIntArray5010[i_106_] + arg7;
		    int i_109_ = i_107_ & 0x7f;
		    int i_110_ = i_108_ & 0x7f;
		    int i_111_ = i_107_ >> 7;
		    int i_112_ = i_108_ >> 7;
		    int i_113_ = ((arg3[i_111_][i_112_] * (128 - i_109_)
				   + arg3[i_111_ + 1][i_112_] * i_109_)
				  >> 7);
		    int i_114_ = ((arg3[i_111_][i_112_ + 1] * (128 - i_109_)
				   + arg3[i_111_ + 1][i_112_ + 1] * i_109_)
				  >> 7);
		    int i_115_
			= i_113_ * (128 - i_110_) + i_114_ * i_110_ >> 7;
		    i_113_ = (arg4[i_111_][i_112_] * (128 - i_109_)
			      + arg4[i_111_ + 1][i_112_] * i_109_) >> 7;
		    i_114_ = (arg4[i_111_][i_112_ + 1] * (128 - i_109_)
			      + arg4[i_111_ + 1][i_112_ + 1] * i_109_) >> 7;
		    int i_116_
			= i_113_ * (128 - i_110_) + i_114_ * i_110_ >> 7;
		    int i_117_ = i_115_ - i_116_;
		    anIntArray5022[i_106_]
			= ((anIntArray5022[i_106_] << 8) / i_105_ * i_117_
			   >> 8) - (arg6 - i_115_);
		}
	    }
	    aClass41_5028.aBoolean682 = false;
	    aClass50_5013.aBoolean820 = false;
	}
    }
    
    public static int method1898(float arg0, float arg1, float arg2) {
	float f = arg0 < 0.0F ? -arg0 : arg0;
	float f_118_ = arg1 < 0.0F ? -arg1 : arg1;
	float f_119_ = arg2 < 0.0F ? -arg2 : arg2;
	if (f_118_ > f && f_118_ > f_119_) {
	    if (arg1 > 0.0F)
		return 0;
	    return 1;
	}
	if (f_119_ > f && f_119_ > f_118_) {
	    if (arg2 > 0.0F)
		return 2;
	    return 3;
	}
	if (arg0 > 0.0F)
	    return 4;
	return 5;
    }
    
    public void method1899() {
	if (aShortArray5041 == null)
	    method1872();
	else {
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] = -anIntArray5027[i];
		anIntArray5010[i] = -anIntArray5010[i];
	    }
	    for (int i = 0; i < anInt5040; i++) {
		aShortArray5041[i] = (short) -aShortArray5041[i];
		aShortArray5042[i] = (short) -aShortArray5042[i];
	    }
	    aClass50_5013.aBoolean820 = false;
	    aClass41_5028.aBoolean682 = false;
	    if (aClass41_5018 != null)
		aClass41_5018.aBoolean682 = false;
	}
    }
    
    public void method1900(int arg0) {
	aShort5024 = (short) arg0;
	if (aClass41_5018 != null)
	    aClass41_5018.aBoolean682 = false;
    }
    
    public short method1901(Class133_Sub2 arg0, int arg1, long arg2, int arg3,
			    int arg4, int arg5, int arg6, float arg7,
			    float arg8) {
	int i = anIntArray5031[arg1];
	int i_120_ = anIntArray5031[arg1 + 1];
	int i_121_ = 0;
	for (int i_122_ = i; i_122_ < i_120_; i_122_++) {
	    short i_123_ = aShortArray5036[i_122_];
	    if (i_123_ == 0) {
		i_121_ = i_122_;
		break;
	    }
	    if (aLongArray5048[i_122_] == arg2)
		return (short) (i_123_ - 1);
	}
	aShortArray5036[i_121_] = (short) (anInt5040 + 1);
	aLongArray5048[i_121_] = arg2;
	aShortArray5041[anInt5040] = (short) arg3;
	aShortArray5019[anInt5040] = (short) arg4;
	aShortArray5042[anInt5040] = (short) arg5;
	aShortArray5017[anInt5040] = (short) arg6;
	aFloatArray5047[anInt5040] = arg7;
	aFloatArray5012[anInt5040] = arg8;
	return (short) anInt5040++;
    }
    
    public void method1902() {
	if (aClass14_Sub10_5011.aByteArray2895.length < anInt5040 * 12)
	    aClass14_Sub10_5011 = new Class14_Sub10((anInt5040 + 100) * 12);
	else
	    aClass14_Sub10_5011.anInt2908 = 0;
	if (Class121.aBoolean2046) {
	    for (int i = 0; i < anInt5014; i++) {
		aClass14_Sub10_5011.method803(aShortArray5021[i], 116);
		aClass14_Sub10_5011.method803(aShortArray5025[i], 74);
		aClass14_Sub10_5011.method803(aShortArray5038[i], 79);
	    }
	} else {
	    for (int i = 0; i < anInt5014; i++) {
		aClass14_Sub10_5011.method825(-70, aShortArray5021[i]);
		aClass14_Sub10_5011.method825(-82, aShortArray5025[i]);
		aClass14_Sub10_5011.method825(-65, aShortArray5038[i]);
	    }
	}
	if (Class121.aBoolean2021) {
	    Class29 class29 = new Class29();
	    ByteBuffer bytebuffer
		= ByteBuffer.wrap(aClass14_Sub10_5011.aByteArray2895, 0,
				  aClass14_Sub10_5011.anInt2908);
	    class29.method1051(bytebuffer);
	    aClass41_5046.aBoolean682 = true;
	    aClass41_5046.aByteBuffer684 = null;
	    aClass41_5046.aClass29_692 = class29;
	} else {
	    ByteBuffer bytebuffer
		= ByteBuffer.allocateDirect(aClass14_Sub10_5011.anInt2908);
	    bytebuffer.put(aClass14_Sub10_5011.aByteArray2895, 0,
			   aClass14_Sub10_5011.anInt2908);
	    bytebuffer.flip();
	    aClass41_5046.aBoolean682 = true;
	    aClass41_5046.aByteBuffer684 = bytebuffer;
	    aClass41_5046.aClass29_692 = null;
	}
    }
    
    public void method1874(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_124_ = Class3.anIntArray111[arg0];
	for (int i_125_ = 0; i_125_ < anInt5033; i_125_++) {
	    int i_126_
		= (anIntArray5010[i_125_] * i + anIntArray5027[i_125_] * i_124_
		   >> 16);
	    anIntArray5010[i_125_]
		= (anIntArray5010[i_125_] * i_124_ - anIntArray5027[i_125_] * i
		   >> 16);
	    anIntArray5027[i_125_] = i_126_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public Class133_Sub7_Sub2 method1903
	(boolean arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4,
	 boolean arg5, boolean arg6, boolean arg7, boolean arg8, boolean arg9,
	 boolean arg10) {
	Class133_Sub7_Sub2 class133_sub7_sub2 = new Class133_Sub7_Sub2();
	class133_sub7_sub2.anInt5033 = anInt5033;
	class133_sub7_sub2.anInt5040 = anInt5040;
	class133_sub7_sub2.anInt5014 = anInt5014;
	if (arg0) {
	    class133_sub7_sub2.anIntArray5027 = anIntArray5027;
	    class133_sub7_sub2.anIntArray5010 = anIntArray5010;
	} else {
	    class133_sub7_sub2.anIntArray5027
		= Class14_Sub8_Sub16.method561(anIntArray5027, 0);
	    class133_sub7_sub2.anIntArray5010
		= Class14_Sub8_Sub16.method561(anIntArray5010, 0);
	}
	if (arg1)
	    class133_sub7_sub2.anIntArray5022 = anIntArray5022;
	else
	    class133_sub7_sub2.anIntArray5022
		= Class14_Sub8_Sub16.method561(anIntArray5022, 0);
	if (arg0 && arg1) {
	    class133_sub7_sub2.aClass41_5028 = aClass41_5028;
	    class133_sub7_sub2.aClass50_5013 = aClass50_5013;
	} else {
	    class133_sub7_sub2.aClass41_5028 = new Class41();
	    class133_sub7_sub2.aClass50_5013 = new Class50();
	}
	if (arg2)
	    class133_sub7_sub2.aShortArray5045 = aShortArray5045;
	else
	    class133_sub7_sub2.aShortArray5045
		= Class14_Sub8_Sub33.method655(8111, aShortArray5045);
	if (arg3)
	    class133_sub7_sub2.aByteArray5043 = aByteArray5043;
	else
	    class133_sub7_sub2.aByteArray5043
		= Class39.method1121(aByteArray5043, 24);
	if (arg2 && arg3 && arg4 && (arg7 && arg5 || Class7_Sub1.aBoolean2661))
	    class133_sub7_sub2.aClass41_5030 = aClass41_5030;
	else
	    class133_sub7_sub2.aClass41_5030 = new Class41();
	if (arg5) {
	    class133_sub7_sub2.aShortArray5041 = aShortArray5041;
	    class133_sub7_sub2.aShortArray5019 = aShortArray5019;
	    class133_sub7_sub2.aShortArray5042 = aShortArray5042;
	    class133_sub7_sub2.aShortArray5017 = aShortArray5017;
	} else {
	    class133_sub7_sub2.aShortArray5041
		= Class14_Sub8_Sub33.method655(8111, aShortArray5041);
	    class133_sub7_sub2.aShortArray5019
		= Class14_Sub8_Sub33.method655(8111, aShortArray5019);
	    class133_sub7_sub2.aShortArray5042
		= Class14_Sub8_Sub33.method655(8111, aShortArray5042);
	    class133_sub7_sub2.aShortArray5017
		= Class14_Sub8_Sub33.method655(8111, aShortArray5017);
	}
	if (Class7_Sub1.aBoolean2661) {
	    if (arg5 && arg6 && arg7)
		class133_sub7_sub2.aClass41_5018 = aClass41_5018;
	    else
		class133_sub7_sub2.aClass41_5018 = new Class41();
	} else
	    class133_sub7_sub2.aClass41_5018 = null;
	if (arg8) {
	    class133_sub7_sub2.aFloatArray5047 = aFloatArray5047;
	    class133_sub7_sub2.aFloatArray5012 = aFloatArray5012;
	    class133_sub7_sub2.aClass41_5029 = aClass41_5029;
	} else {
	    class133_sub7_sub2.aFloatArray5047
		= Canvas_Sub2.method62(aFloatArray5047, false);
	    class133_sub7_sub2.aFloatArray5012
		= Canvas_Sub2.method62(aFloatArray5012, false);
	    class133_sub7_sub2.aClass41_5029 = new Class41();
	}
	if (arg9) {
	    class133_sub7_sub2.aShortArray5021 = aShortArray5021;
	    class133_sub7_sub2.aShortArray5025 = aShortArray5025;
	    class133_sub7_sub2.aShortArray5038 = aShortArray5038;
	    class133_sub7_sub2.aClass41_5046 = aClass41_5046;
	} else {
	    class133_sub7_sub2.aShortArray5021
		= Class14_Sub8_Sub33.method655(8111, aShortArray5021);
	    class133_sub7_sub2.aShortArray5025
		= Class14_Sub8_Sub33.method655(8111, aShortArray5025);
	    class133_sub7_sub2.aShortArray5038
		= Class14_Sub8_Sub33.method655(8111, aShortArray5038);
	    class133_sub7_sub2.aClass41_5046 = new Class41();
	}
	if (arg10)
	    class133_sub7_sub2.aShortArray5037 = aShortArray5037;
	else
	    class133_sub7_sub2.aShortArray5037
		= Class14_Sub8_Sub33.method655(8111, aShortArray5037);
	class133_sub7_sub2.anIntArray5034 = anIntArray5034;
	class133_sub7_sub2.anIntArrayArray5044 = anIntArrayArray5044;
	class133_sub7_sub2.aByteArray5016 = aByteArray5016;
	class133_sub7_sub2.anIntArrayArray5015 = anIntArrayArray5015;
	class133_sub7_sub2.anIntArray5035 = anIntArray5035;
	class133_sub7_sub2.aShortArray5036 = aShortArray5036;
	class133_sub7_sub2.anIntArray5031 = anIntArray5031;
	class133_sub7_sub2.aShort5032 = aShort5032;
	class133_sub7_sub2.aShort5024 = aShort5024;
	return class133_sub7_sub2;
    }
    
    public int method1867() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort827;
    }
    
    public static int method1904(int arg0, short arg1, int arg2, byte arg3) {
	int i
	    = Class3.anIntArray119[Class133_Sub7_Sub1.method1880(arg0, arg2)];
	if (arg1 != -1) {
	    int i_127_ = Class3.anInterface3_117.method14(arg1 & 0xffff, 25);
	    if (i_127_ != 0) {
		int i_128_;
		if (arg2 < 0)
		    i_128_ = 0;
		else if (arg2 > 127)
		    i_128_ = 16777215;
		else
		    i_128_ = 131586 * arg2;
		if (i_127_ == 256)
		    i = i_128_;
		else {
		    int i_129_ = i_127_;
		    int i_130_ = 256 - i_127_;
		    i = ((((i_128_ & 0xff00ff) * i_129_
			   + (i & 0xff00ff) * i_130_)
			  & ~0xff00ff)
			 + ((i_128_ & 0xff00) * i_129_ + (i & 0xff00) * i_130_
			    & 0xff0000)) >> 8;
		}
	    }
	    int i_131_ = Class3.anInterface3_117.method9(arg1 & 0xffff, -62);
	    if (i_131_ != 0) {
		i_131_ += 256;
		int i_132_ = ((i & 0xff0000) >> 16) * i_131_;
		if (i_132_ > 65535)
		    i_132_ = 65535;
		int i_133_ = ((i & 0xff00) >> 8) * i_131_;
		if (i_133_ > 65535)
		    i_133_ = 65535;
		int i_134_ = (i & 0xff) * i_131_;
		if (i_134_ > 65535)
		    i_134_ = 65535;
		i = (i_132_ << 8 & 0xff0000) + (i_133_ & 0xff00) + (i_134_
								    >> 8);
	    }
	}
	return (i << 8) + (255 - (arg3 & 0xff));
    }
    
    public void method1905(boolean arg0, boolean arg1, boolean arg2,
			   boolean arg3, boolean arg4) {
	int i = 0;
	if (arg1) {
	    aClass41_5028.anInt686 = i;
	    i += 12;
	}
	if (arg2) {
	    aClass41_5030.anInt686 = i;
	    i += 4;
	}
	if (arg3) {
	    aClass41_5018.anInt686 = i;
	    i += 12;
	}
	if (arg4) {
	    aClass41_5029.anInt686 = i;
	    i += 8;
	}
	if (i != 0) {
	    if (aClass14_Sub10_5011.aByteArray2895.length < anInt5040 * i)
		aClass14_Sub10_5011 = new Class14_Sub10((anInt5040 + 100) * i);
	    else
		aClass14_Sub10_5011.anInt2908 = 0;
	    if (arg1) {
		if (Class121.aBoolean2046) {
		    for (int i_135_ = 0; i_135_ < anInt5033; i_135_++) {
			int i_136_
			    = Float.floatToRawIntBits((float) anIntArray5027
							      [i_135_]);
			int i_137_
			    = Float.floatToRawIntBits((float) anIntArray5022
							      [i_135_]);
			int i_138_
			    = Float.floatToRawIntBits((float) anIntArray5010
							      [i_135_]);
			int i_139_ = anIntArray5031[i_135_];
			int i_140_ = anIntArray5031[i_135_ + 1];
			for (int i_141_ = i_139_; i_141_ < i_140_; i_141_++) {
			    int i_142_ = aShortArray5036[i_141_] - 1;
			    if (i_142_ == -1)
				break;
			    aClass14_Sub10_5011.anInt2908 = i_142_ * i;
			    aClass14_Sub10_5011.method803(i_136_, 123);
			    aClass14_Sub10_5011.method803(i_137_, 90);
			    aClass14_Sub10_5011.method803(i_138_, 85);
			}
		    }
		} else {
		    for (int i_143_ = 0; i_143_ < anInt5033; i_143_++) {
			int i_144_
			    = Float.floatToRawIntBits((float) anIntArray5027
							      [i_143_]);
			int i_145_
			    = Float.floatToRawIntBits((float) anIntArray5022
							      [i_143_]);
			int i_146_
			    = Float.floatToRawIntBits((float) anIntArray5010
							      [i_143_]);
			int i_147_ = anIntArray5031[i_143_];
			int i_148_ = anIntArray5031[i_143_ + 1];
			for (int i_149_ = i_147_; i_149_ < i_148_; i_149_++) {
			    int i_150_ = aShortArray5036[i_149_] - 1;
			    if (i_150_ == -1)
				break;
			    aClass14_Sub10_5011.anInt2908 = i_150_ * i;
			    aClass14_Sub10_5011.method825(-32, i_144_);
			    aClass14_Sub10_5011.method825(-79, i_145_);
			    aClass14_Sub10_5011.method825(-99, i_146_);
			}
		    }
		}
	    }
	    if (arg2) {
		if (!Class7_Sub1.aBoolean2661) {
		    int i_151_ = (int) Class57.aFloatArray927[0];
		    int i_152_ = (int) Class57.aFloatArray927[1];
		    int i_153_ = (int) Class57.aFloatArray927[2];
		    int i_154_ = (int) Math.sqrt((double) (i_151_ * i_151_
							   + i_152_ * i_152_
							   + i_153_ * i_153_));
		    int i_155_ = (int) ((float) aShort5032 * 1.3F);
		    int i_156_ = aShort5024 * i_154_ >> 8;
		    for (int i_157_ = 0; i_157_ < anInt5014; i_157_++) {
			int i_158_ = aShortArray5021[i_157_];
			int i_159_ = aShortArray5017[i_158_];
			int i_160_;
			if (i_159_ < 0)
			    i_160_ = -1 - i_159_;
			else {
			    if (i_159_ != 0)
				i_160_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_158_]
					   + i_152_ * aShortArray5019[i_158_]
					   + i_153_ * aShortArray5042[i_158_])
					  / (i_156_ * i_159_)));
			    else
				i_160_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_158_]
					   + i_152_ * aShortArray5019[i_158_]
					   + i_153_ * aShortArray5042[i_158_])
					  / (i_156_ + i_156_ / 2)));
			    if (i_160_ < 0)
				i_160_ = 0;
			    else if (i_160_ > 16384)
				i_160_ = 16384;
			    aShortArray5017[i_158_] = (short) (-1 - i_160_);
			}
			int i_161_ = aShortArray5025[i_157_];
			int i_162_ = aShortArray5017[i_161_];
			int i_163_;
			if (i_162_ < 0)
			    i_163_ = -1 - i_162_;
			else {
			    if (i_162_ != 0)
				i_163_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_161_]
					   + i_152_ * aShortArray5019[i_161_]
					   + i_153_ * aShortArray5042[i_161_])
					  / (i_156_ * i_162_)));
			    else
				i_163_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_161_]
					   + i_152_ * aShortArray5019[i_161_]
					   + i_153_ * aShortArray5042[i_161_])
					  / (i_156_ + i_156_ / 2)));
			    if (i_163_ < 0)
				i_163_ = 0;
			    else if (i_163_ > 16384)
				i_163_ = 16384;
			    aShortArray5017[i_161_] = (short) (-1 - i_163_);
			}
			int i_164_ = aShortArray5038[i_157_];
			int i_165_ = aShortArray5017[i_164_];
			int i_166_;
			if (i_165_ < 0)
			    i_166_ = -1 - i_165_;
			else {
			    if (i_165_ != 0)
				i_166_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_164_]
					   + i_152_ * aShortArray5019[i_164_]
					   + i_153_ * aShortArray5042[i_164_])
					  / (i_156_ * i_165_)));
			    else
				i_166_
				    = (i_155_
				       + ((i_151_ * aShortArray5041[i_164_]
					   + i_152_ * aShortArray5019[i_164_]
					   + i_153_ * aShortArray5042[i_164_])
					  / (i_156_ + i_156_ / 2)));
			    if (i_166_ < 0)
				i_166_ = 0;
			    else if (i_166_ > 16384)
				i_166_ = 16384;
			    aShortArray5017[i_164_] = (short) (-1 - i_166_);
			}
			int i_167_
			    = method1904(aShortArray5045[i_157_],
					 aShortArray5037[i_157_], i_160_,
					 aByteArray5043[i_157_]);
			int i_168_
			    = method1904(aShortArray5045[i_157_],
					 aShortArray5037[i_157_], i_163_,
					 aByteArray5043[i_157_]);
			int i_169_
			    = method1904(aShortArray5045[i_157_],
					 aShortArray5037[i_157_], i_166_,
					 aByteArray5043[i_157_]);
			aClass14_Sub10_5011.anInt2908
			    = aClass41_5030.anInt686 + i_158_ * i;
			aClass14_Sub10_5011.method803(i_167_, 118);
			aClass14_Sub10_5011.anInt2908
			    = aClass41_5030.anInt686 + i_161_ * i;
			aClass14_Sub10_5011.method803(i_168_, 105);
			aClass14_Sub10_5011.anInt2908
			    = aClass41_5030.anInt686 + i_164_ * i;
			aClass14_Sub10_5011.method803(i_169_, 90);
		    }
		    aShortArray5041 = null;
		    aShortArray5019 = null;
		    aShortArray5042 = null;
		} else {
		    for (int i_170_ = 0; i_170_ < anInt5014; i_170_++) {
			int i_171_
			    = method1904(aShortArray5045[i_170_],
					 aShortArray5037[i_170_], aShort5032,
					 aByteArray5043[i_170_]);
			aClass14_Sub10_5011.anInt2908
			    = (aClass41_5030.anInt686
			       + aShortArray5021[i_170_] * i);
			aClass14_Sub10_5011.method803(i_171_, 90);
			aClass14_Sub10_5011.anInt2908
			    = (aClass41_5030.anInt686
			       + aShortArray5025[i_170_] * i);
			aClass14_Sub10_5011.method803(i_171_, 108);
			aClass14_Sub10_5011.anInt2908
			    = (aClass41_5030.anInt686
			       + aShortArray5038[i_170_] * i);
			aClass14_Sub10_5011.method803(i_171_, 91);
		    }
		}
	    }
	    if (arg3) {
		float f = 3.0F / (float) aShort5024;
		float f_172_ = 3.0F / (float) (aShort5024 + aShort5024 / 2);
		aClass14_Sub10_5011.anInt2908 = aClass41_5018.anInt686;
		if (Class121.aBoolean2046) {
		    for (int i_173_ = 0; i_173_ < anInt5040; i_173_++) {
			short i_174_ = aShortArray5017[i_173_];
			if (i_174_ == 0) {
			    aClass14_Sub10_5011.method834
				((float) aShortArray5041[i_173_] * f_172_,
				 (byte) -117);
			    aClass14_Sub10_5011.method834
				((float) aShortArray5019[i_173_] * f_172_,
				 (byte) -117);
			    aClass14_Sub10_5011.method834
				((float) aShortArray5042[i_173_] * f_172_,
				 (byte) -117);
			} else {
			    float f_175_ = f / (float) i_174_;
			    aClass14_Sub10_5011.method834
				((float) aShortArray5041[i_173_] * f_175_,
				 (byte) -117);
			    aClass14_Sub10_5011.method834
				((float) aShortArray5019[i_173_] * f_175_,
				 (byte) -117);
			    aClass14_Sub10_5011.method834
				((float) aShortArray5042[i_173_] * f_175_,
				 (byte) -117);
			}
			aClass14_Sub10_5011.anInt2908 += i - 12;
		    }
		} else {
		    for (int i_176_ = 0; i_176_ < anInt5040; i_176_++) {
			short i_177_ = aShortArray5017[i_176_];
			if (i_177_ == 0) {
			    aClass14_Sub10_5011.method788
				((float) aShortArray5041[i_176_] * f_172_,
				 24671);
			    aClass14_Sub10_5011.method788
				((float) aShortArray5019[i_176_] * f_172_,
				 24671);
			    aClass14_Sub10_5011.method788
				((float) aShortArray5042[i_176_] * f_172_,
				 24671);
			} else {
			    float f_178_ = f / (float) i_177_;
			    aClass14_Sub10_5011.method788
				((float) aShortArray5041[i_176_] * f_178_,
				 24671);
			    aClass14_Sub10_5011.method788
				((float) aShortArray5019[i_176_] * f_178_,
				 24671);
			    aClass14_Sub10_5011.method788
				((float) aShortArray5042[i_176_] * f_178_,
				 24671);
			}
			aClass14_Sub10_5011.anInt2908 += i - 12;
		    }
		}
	    }
	    if (arg4) {
		aClass14_Sub10_5011.anInt2908 = aClass41_5029.anInt686;
		if (Class121.aBoolean2046) {
		    for (int i_179_ = 0; i_179_ < anInt5040; i_179_++) {
			aClass14_Sub10_5011.method834(aFloatArray5047[i_179_],
						      (byte) -117);
			aClass14_Sub10_5011.method834(aFloatArray5012[i_179_],
						      (byte) -117);
			aClass14_Sub10_5011.anInt2908 += i - 8;
		    }
		} else {
		    for (int i_180_ = 0; i_180_ < anInt5040; i_180_++) {
			aClass14_Sub10_5011.method788(aFloatArray5047[i_180_],
						      24671);
			aClass14_Sub10_5011.method788(aFloatArray5012[i_180_],
						      24671);
			aClass14_Sub10_5011.anInt2908 += i - 8;
		    }
		}
	    }
	    aClass14_Sub10_5011.anInt2908 = i * anInt5040;
	    if (arg0) {
		if (Class121.aBoolean2051) {
		    ByteBuffer bytebuffer
			= ByteBuffer.wrap(aClass14_Sub10_5011.aByteArray2895,
					  0, aClass14_Sub10_5011.anInt2908);
		    if (aClass29_5020 == null) {
			aClass29_5020 = new Class29(true);
			aClass29_5020.method1051(bytebuffer);
		    } else
			aClass29_5020.method1052(bytebuffer);
		    if (arg1) {
			aClass41_5028.aBoolean682 = true;
			aClass41_5028.aByteBuffer684 = null;
			aClass41_5028.aClass29_692 = aClass29_5020;
			aClass41_5028.anInt687 = i;
		    }
		    if (arg2) {
			aClass41_5030.aBoolean682 = true;
			aClass41_5030.aByteBuffer684 = null;
			aClass41_5030.aClass29_692 = aClass29_5020;
			aClass41_5030.anInt687 = i;
		    }
		    if (arg3) {
			aClass41_5018.aBoolean682 = true;
			aClass41_5018.aByteBuffer684 = null;
			aClass41_5018.aClass29_692 = aClass29_5020;
			aClass41_5018.anInt687 = i;
		    }
		    if (arg4) {
			aClass41_5029.aBoolean682 = true;
			aClass41_5029.aByteBuffer684 = null;
			aClass41_5029.aClass29_692 = aClass29_5020;
			aClass41_5029.anInt687 = i;
		    }
		} else {
		    if (aByteBuffer5050 == null
			|| (aByteBuffer5050.capacity()
			    < aClass14_Sub10_5011.anInt2908))
			aByteBuffer5050
			    = ByteBuffer.allocateDirect((aClass14_Sub10_5011
							 .anInt2908)
							+ 100 * i);
		    else
			aByteBuffer5050.clear();
		    aByteBuffer5050.put(aClass14_Sub10_5011.aByteArray2895, 0,
					aClass14_Sub10_5011.anInt2908);
		    aByteBuffer5050.flip();
		    if (arg1) {
			aClass41_5028.aBoolean682 = true;
			aClass41_5028.aByteBuffer684 = aByteBuffer5050;
			aClass41_5028.aClass29_692 = null;
			aClass41_5028.anInt687 = i;
		    }
		    if (arg2) {
			aClass41_5030.aBoolean682 = true;
			aClass41_5030.aByteBuffer684 = aByteBuffer5050;
			aClass41_5028.aClass29_692 = null;
			aClass41_5030.anInt687 = i;
		    }
		    if (arg3) {
			aClass41_5018.aBoolean682 = true;
			aClass41_5018.aByteBuffer684 = aByteBuffer5050;
			aClass41_5018.aClass29_692 = null;
			aClass41_5018.anInt687 = i;
		    }
		    if (arg4) {
			aClass41_5029.aBoolean682 = true;
			aClass41_5029.aByteBuffer684 = aByteBuffer5050;
			aClass41_5029.aClass29_692 = null;
			aClass41_5029.anInt687 = i;
		    }
		}
	    } else if (Class121.aBoolean2021) {
		Class29 class29 = new Class29();
		ByteBuffer bytebuffer
		    = ByteBuffer.wrap(aClass14_Sub10_5011.aByteArray2895, 0,
				      aClass14_Sub10_5011.anInt2908);
		class29.method1051(bytebuffer);
		if (arg1) {
		    aClass41_5028.aBoolean682 = true;
		    aClass41_5028.aByteBuffer684 = null;
		    aClass41_5028.aClass29_692 = class29;
		    aClass41_5028.anInt687 = i;
		}
		if (arg2) {
		    aClass41_5030.aBoolean682 = true;
		    aClass41_5030.aByteBuffer684 = null;
		    aClass41_5030.aClass29_692 = class29;
		    aClass41_5030.anInt687 = i;
		}
		if (arg3) {
		    aClass41_5018.aBoolean682 = true;
		    aClass41_5018.aByteBuffer684 = null;
		    aClass41_5018.aClass29_692 = class29;
		    aClass41_5018.anInt687 = i;
		}
		if (arg4) {
		    aClass41_5029.aBoolean682 = true;
		    aClass41_5029.aByteBuffer684 = null;
		    aClass41_5029.aClass29_692 = class29;
		    aClass41_5029.anInt687 = i;
		}
	    } else {
		ByteBuffer bytebuffer
		    = ByteBuffer.allocateDirect(aClass14_Sub10_5011.anInt2908);
		bytebuffer.put(aClass14_Sub10_5011.aByteArray2895, 0,
			       aClass14_Sub10_5011.anInt2908);
		bytebuffer.flip();
		if (arg1) {
		    aClass41_5028.aBoolean682 = true;
		    aClass41_5028.aByteBuffer684 = bytebuffer;
		    aClass41_5028.aClass29_692 = null;
		    aClass41_5028.anInt687 = i;
		}
		if (arg2) {
		    aClass41_5030.aBoolean682 = true;
		    aClass41_5030.aByteBuffer684 = bytebuffer;
		    aClass41_5028.aClass29_692 = null;
		    aClass41_5030.anInt687 = i;
		}
		if (arg3) {
		    aClass41_5018.aBoolean682 = true;
		    aClass41_5018.aByteBuffer684 = bytebuffer;
		    aClass41_5018.aClass29_692 = null;
		    aClass41_5018.anInt687 = i;
		}
		if (arg4) {
		    aClass41_5029.aBoolean682 = true;
		    aClass41_5029.aByteBuffer684 = bytebuffer;
		    aClass41_5029.aClass29_692 = null;
		    aClass41_5029.anInt687 = i;
		}
	    }
	}
    }
    
    public void method1906(short arg0, short arg1) {
	for (int i = 0; i < anInt5014; i++) {
	    if (aShortArray5037[i] == arg0)
		aShortArray5037[i] = arg1;
	}
	int i = 0;
	int i_181_ = 0;
	if (arg0 != -1) {
	    i = Class3.anInterface3_117.method14(arg0 & 0xffff, 82);
	    i_181_ = Class3.anInterface3_117.method9(arg0 & 0xffff, -32);
	}
	int i_182_ = 0;
	int i_183_ = 0;
	if (arg1 != -1) {
	    i_182_ = Class3.anInterface3_117.method14(arg1 & 0xffff, 70);
	    i_183_ = Class3.anInterface3_117.method9(arg1 & 0xffff, -36);
	}
	if (i != i_182_ || i_181_ != i_183_)
	    aClass41_5030.aBoolean682 = false;
    }
    
    public int method1866() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort823;
    }
    
    public Class133_Sub7 method1907(boolean arg0, boolean arg1,
				    Class133_Sub7_Sub2 arg2,
				    Class133_Sub7_Sub2 arg3) {
	arg2.anInt5033 = anInt5033;
	arg2.anInt5040 = anInt5040;
	arg2.anInt5014 = anInt5014;
	arg2.aShort5032 = aShort5032;
	arg2.aShort5024 = aShort5024;
	arg2.aByte5026 = (byte) (0x1 | (arg0 ? 0 : 2) | (arg1 ? 0 : 4));
	if (arg2.anIntArray5027 == null
	    || arg2.anIntArray5027.length < anInt5033) {
	    arg2.anIntArray5027 = new int[anInt5033 + 100];
	    arg2.anIntArray5022 = new int[anInt5033 + 100];
	    arg2.anIntArray5010 = new int[anInt5033 + 100];
	}
	for (int i = 0; i < anInt5033; i++) {
	    arg2.anIntArray5027[i] = anIntArray5027[i];
	    arg2.anIntArray5022[i] = anIntArray5022[i];
	    arg2.anIntArray5010[i] = anIntArray5010[i];
	}
	if (arg2.aClass41_5028 == null)
	    arg2.aClass41_5028 = new Class41();
	arg2.aClass41_5028.aBoolean682 = false;
	if (arg2.aClass50_5013 == null)
	    arg2.aClass50_5013 = new Class50();
	arg2.aClass50_5013.aBoolean820 = false;
	if (arg0) {
	    arg2.aByteArray5043 = aByteArray5043;
	    arg2.aClass41_5030 = aClass41_5030;
	} else {
	    if (arg3.aByteArray5043 == null
		|| arg3.aByteArray5043.length < anInt5014)
		arg3.aByteArray5043 = new byte[anInt5014 + 100];
	    arg2.aByteArray5043 = arg3.aByteArray5043;
	    for (int i = 0; i < anInt5014; i++)
		arg2.aByteArray5043[i] = aByteArray5043[i];
	    if (arg3.aClass41_5030 == null)
		arg3.aClass41_5030 = new Class41();
	    arg2.aClass41_5030 = arg3.aClass41_5030;
	    arg2.aClass41_5030.aBoolean682 = false;
	}
	if (arg1) {
	    arg2.aShortArray5041 = aShortArray5041;
	    arg2.aShortArray5019 = aShortArray5019;
	    arg2.aShortArray5042 = aShortArray5042;
	    arg2.aShortArray5017 = aShortArray5017;
	    arg2.aClass41_5018 = aClass41_5018;
	} else {
	    if (arg3.aShortArray5041 == null
		|| arg3.aShortArray5041.length < anInt5040) {
		arg3.aShortArray5041 = new short[anInt5040 + 100];
		arg3.aShortArray5019 = new short[anInt5040 + 100];
		arg3.aShortArray5042 = new short[anInt5040 + 100];
		arg3.aShortArray5017 = new short[anInt5040 + 100];
	    }
	    arg2.aShortArray5041 = arg3.aShortArray5041;
	    arg2.aShortArray5019 = arg3.aShortArray5019;
	    arg2.aShortArray5042 = arg3.aShortArray5042;
	    arg2.aShortArray5017 = arg3.aShortArray5017;
	    for (int i = 0; i < anInt5040; i++) {
		arg2.aShortArray5041[i] = aShortArray5041[i];
		arg2.aShortArray5019[i] = aShortArray5019[i];
		arg2.aShortArray5042[i] = aShortArray5042[i];
		arg2.aShortArray5017[i] = aShortArray5017[i];
	    }
	    if (Class7_Sub1.aBoolean2661) {
		if (arg3.aClass41_5018 == null)
		    arg3.aClass41_5018 = new Class41();
		arg2.aClass41_5018 = arg3.aClass41_5018;
		arg2.aClass41_5018.aBoolean682 = false;
	    } else
		arg2.aClass41_5018 = null;
	}
	arg2.aFloatArray5047 = aFloatArray5047;
	arg2.aFloatArray5012 = aFloatArray5012;
	arg2.anIntArray5034 = anIntArray5034;
	arg2.anIntArrayArray5044 = anIntArrayArray5044;
	arg2.aShortArray5045 = aShortArray5045;
	arg2.aShortArray5021 = aShortArray5021;
	arg2.aShortArray5025 = aShortArray5025;
	arg2.aShortArray5038 = aShortArray5038;
	arg2.aShortArray5037 = aShortArray5037;
	arg2.aByteArray5016 = aByteArray5016;
	arg2.anIntArrayArray5015 = anIntArrayArray5015;
	arg2.aClass41_5029 = aClass41_5029;
	arg2.aClass41_5046 = aClass41_5046;
	arg2.anIntArray5035 = anIntArray5035;
	arg2.aShortArray5036 = aShortArray5036;
	arg2.anIntArray5031 = anIntArray5031;
	arg2.aBoolean3687 = aBoolean3687;
	return arg2;
    }
    
    public void method1859(Class14_Sub2_Sub15 arg0, int arg1) {
	if (anIntArrayArray5044 != null && arg1 != -1) {
	    Class143 class143 = arg0.aClass143Array3951[arg1];
	    Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
	    anInt5055 = 0;
	    anInt5059 = 0;
	    anInt5054 = 0;
	    for (int i = 0; i < class143.anInt2336; i++) {
		short i_184_ = class143.aShortArray2335[i];
		if (class14_sub5.aBooleanArray2791[i_184_]) {
		    if (class143.aShortArray2338[i] != -1)
			method1893(0, 0, 0, 0);
		    method1893(class14_sub5.anIntArray2795[i_184_],
			       class143.aShortArray2331[i],
			       class143.aShortArray2340[i],
			       class143.aShortArray2333[i]);
		}
	    }
	    aClass41_5028.aBoolean682 = false;
	    aClass50_5013.aBoolean820 = false;
	}
    }
    
    public void method1861(int arg0) {
	int i = Class3.anIntArray108[arg0];
	int i_185_ = Class3.anIntArray111[arg0];
	for (int i_186_ = 0; i_186_ < anInt5033; i_186_++) {
	    int i_187_
		= (anIntArray5022[i_186_] * i_185_ - anIntArray5010[i_186_] * i
		   >> 16);
	    anIntArray5010[i_186_]
		= (anIntArray5022[i_186_] * i + anIntArray5010[i_186_] * i_185_
		   >> 16);
	    anIntArray5022[i_186_] = i_187_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public static void method1908() {
	aClass133_Sub7_Sub2_5049 = new Class133_Sub7_Sub2();
	aClass133_Sub7_Sub2_5051 = new Class133_Sub7_Sub2();
	aClass133_Sub7_Sub2_5052 = new Class133_Sub7_Sub2();
	aClass133_Sub7_Sub2_5053 = new Class133_Sub7_Sub2();
    }
    
    public static void method1909() {
	aLongArray5048 = null;
	aClass14_Sub10_5011 = null;
	aByteBuffer5050 = null;
	aClass133_Sub7_Sub2_5049 = null;
	aClass133_Sub7_Sub2_5051 = null;
	aClass133_Sub7_Sub2_5052 = null;
	aClass133_Sub7_Sub2_5053 = null;
	anIntArray5061 = null;
	anIntArray5057 = null;
    }
    
    public void method1857(Class14_Sub2_Sub15 arg0, int arg1, boolean arg2) {
	if (anIntArrayArray5044 != null && arg1 != -1) {
	    Class143 class143 = arg0.aClass143Array3951[arg1];
	    Class14_Sub5 class14_sub5 = class143.aClass14_Sub5_2329;
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] <<= 4;
		anIntArray5022[i] <<= 4;
		anIntArray5010[i] <<= 4;
	    }
	    anInt5055 = 0;
	    anInt5059 = 0;
	    anInt5054 = 0;
	    for (int i = 0; i < class143.anInt2336; i++) {
		short i_188_ = class143.aShortArray2335[i];
		if (class143.aShortArray2338[i] != -1)
		    method1917(0,
			       (class14_sub5.anIntArrayArray2798
				[class143.aShortArray2338[i]]),
			       0, 0, 0, arg2);
		method1917(class14_sub5.anIntArray2795[i_188_],
			   class14_sub5.anIntArrayArray2798[i_188_],
			   class143.aShortArray2331[i],
			   class143.aShortArray2340[i],
			   class143.aShortArray2333[i], arg2);
	    }
	    for (int i = 0; i < anInt5033; i++) {
		anIntArray5027[i] >>= 4;
		anIntArray5022[i] >>= 4;
		anIntArray5010[i] >>= 4;
	    }
	    aClass50_5013.aBoolean820 = false;
	    aClass41_5028.aBoolean682 = false;
	}
    }
    
    public int method1910() {
	return aShort5024;
    }
    
    public void method1792(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8) {
	if (anInt5040 != 0) {
	    if (!aClass50_5013.aBoolean820)
		method1891();
	    int i = aClass50_5013.aShort823;
	    int i_189_ = aClass50_5013.aShort825;
	    int i_190_ = aClass50_5013.aShort826;
	    int i_191_ = arg7 * arg4 - arg5 * arg3 >> 16;
	    int i_192_ = arg6 * arg1 + i_191_ * arg2 >> 16;
	    int i_193_ = i_192_ + (i * arg2 + i_190_ * arg1 >> 16);
	    if (i_193_ > 50) {
		int i_194_ = i_192_ + (-i * arg2 + i_189_ * arg1 >> 16);
		if (i_194_ < 3584) {
		    int i_195_ = arg7 * arg3 + arg5 * arg4 >> 16;
		    int i_196_ = i_195_ + i << 9;
		    if (i_196_ / i_193_ > Class20.anInt425) {
			int i_197_ = i_195_ - i << 9;
			if (i_197_ / i_193_ < Class14_Sub8_Sub27.anInt4547) {
			    int i_198_ = arg6 * arg2 - i_191_ * arg1 >> 16;
			    int i_199_
				= (i_198_ + (i * arg1 + i_190_ * arg2 >> 16)
				   << 9);
			    if (i_199_ / i_193_ > Class58.anInt948) {
				int i_200_
				    = (i_198_ + (-i * arg1 + i_189_ * arg2
						 >> 16)
				       << 9);
				if (i_200_ / i_193_ < Class70.anInt1081) {
				    int i_201_ = 0;
				    int i_202_ = 0;
				    if (arg0 != 0) {
					i_201_ = Class3.anIntArray108[arg0];
					i_202_ = Class3.anIntArray111[arg0];
				    }
				while_1226_:
				    do {
					if (arg8 > 0L && Class90.aBoolean1417
					    && i_194_ > 0) {
					    int i_203_;
					    int i_204_;
					    if (i_195_ > 0) {
						i_203_ = i_197_ / i_193_;
						i_204_ = i_196_ / i_194_;
					    } else {
						i_203_ = i_197_ / i_194_;
						i_204_ = i_196_ / i_193_;
					    }
					    int i_205_;
					    int i_206_;
					    if (i_198_ > 0) {
						i_205_ = i_200_ / i_193_;
						i_206_ = i_199_ / i_194_;
					    } else {
						i_205_ = i_200_ / i_194_;
						i_206_ = i_199_ / i_193_;
					    }
					    if ((Class14_Sub2.anInt2726
						 >= i_203_)
						&& (Class14_Sub2.anInt2726
						    <= i_204_)
						&& Class38.anInt2622 >= i_205_
						&& (Class38.anInt2622
						    <= i_206_)) {
						i_203_ = 999999;
						i_204_ = -999999;
						i_205_ = 999999;
						i_206_ = -999999;
						int i_207_
						    = aClass50_5013.aShort827;
						int i_208_
						    = aClass50_5013.aShort824;
						int i_209_
						    = aClass50_5013.aShort822;
						int i_210_
						    = aClass50_5013.aShort821;
						int[] is
						    = { i_207_, i_208_, i_207_,
							i_208_, i_207_, i_208_,
							i_207_, i_208_ };
						int[] is_211_
						    = { i_209_, i_209_, i_210_,
							i_210_, i_209_, i_209_,
							i_210_, i_210_ };
						int[] is_212_
						    = { i_189_, i_189_, i_189_,
							i_189_, i_190_, i_190_,
							i_190_, i_190_ };
						for (int i_213_ = 0;
						     i_213_ < 8; i_213_++) {
						    int i_214_ = is[i_213_];
						    int i_215_
							= is_212_[i_213_];
						    int i_216_
							= is_211_[i_213_];
						    if (arg0 != 0) {
							int i_217_
							    = ((i_216_ * i_201_
								+ (i_214_
								   * i_202_))
							       >> 16);
							i_216_
							    = ((i_216_ * i_202_
								- (i_214_
								   * i_201_))
							       >> 16);
							i_214_ = i_217_;
						    }
						    i_214_ += arg5;
						    i_215_ += arg6;
						    i_216_ += arg7;
						    int i_218_
							= ((i_216_ * arg3
							    + i_214_ * arg4)
							   >> 16);
						    i_216_ = ((i_216_ * arg4
							       - i_214_ * arg3)
							      >> 16);
						    i_214_ = i_218_;
						    i_218_ = ((i_215_ * arg2
							       - i_216_ * arg1)
							      >> 16);
						    i_216_ = ((i_215_ * arg1
							       + i_216_ * arg2)
							      >> 16);
						    i_215_ = i_218_;
						    if (i_216_ > 0) {
							int i_219_
							    = ((i_214_ << 9)
							       / i_216_);
							int i_220_
							    = ((i_215_ << 9)
							       / i_216_);
							if (i_219_ < i_203_)
							    i_203_ = i_219_;
							if (i_219_ > i_204_)
							    i_204_ = i_219_;
							if (i_220_ < i_205_)
							    i_205_ = i_220_;
							if (i_220_ > i_206_)
							    i_206_ = i_220_;
						    }
						}
						if ((Class14_Sub2.anInt2726
						     >= i_203_)
						    && (Class14_Sub2.anInt2726
							<= i_204_)
						    && (Class38.anInt2622
							>= i_205_)
						    && (Class38.anInt2622
							<= i_206_)) {
						    if (aBoolean3687)
							Class7_Sub3
							    .aLongArray2685
							    [Class14_Sub15
								 .anInt2996++]
							    = arg8;
						    else {
							if (anIntArray5061.length
							    < anInt5040) {
							    anIntArray5061
								= (new int
								   [anInt5040]);
							    anIntArray5057
								= (new int
								   [anInt5040]);
							}
							for (int i_221_ = 0;
							     (i_221_
							      < anInt5033);
							     i_221_++) {
							    int i_222_
								= (anIntArray5027
								   [i_221_]);
							    int i_223_
								= (anIntArray5022
								   [i_221_]);
							    int i_224_
								= (anIntArray5010
								   [i_221_]);
							    if (arg0 != 0) {
								int i_225_
								    = (((i_224_
									 * i_201_)
									+ (i_222_
									   * i_202_))
								       >> 16);
								i_224_
								    = (((i_224_
									 * i_202_)
									- (i_222_
									   * i_201_))
								       >> 16);
								i_222_
								    = i_225_;
							    }
							    i_222_ += arg5;
							    i_223_ += arg6;
							    i_224_ += arg7;
							    int i_226_
								= (((i_224_
								     * arg3)
								    + (i_222_
								       * arg4))
								   >> 16);
							    i_224_
								= (((i_224_
								     * arg4)
								    - (i_222_
								       * arg3))
								   >> 16);
							    i_222_ = i_226_;
							    i_226_
								= (((i_223_
								     * arg2)
								    - (i_224_
								       * arg1))
								   >> 16);
							    i_224_
								= (((i_223_
								     * arg1)
								    + (i_224_
								       * arg2))
								   >> 16);
							    i_223_ = i_226_;
							    if (i_224_ < 50)
								break while_1226_;
							    int i_227_
								= ((i_222_
								    << 9)
								   / i_224_);
							    int i_228_
								= ((i_223_
								    << 9)
								   / i_224_);
							    int i_229_
								= (anIntArray5031
								   [i_221_]);
							    int i_230_
								= (anIntArray5031
								   [(i_221_
								     + 1)]);
							    for (int i_231_
								     = i_229_;
								 (i_231_
								  < i_230_);
								 i_231_++) {
								int i_232_
								    = ((aShortArray5036
									[i_231_])
								       - 1);
								if (i_232_
								    == -1)
								    break;
								anIntArray5061
								    [i_232_]
								    = i_227_;
								anIntArray5057
								    [i_232_]
								    = i_228_;
							    }
							}
							for (int i_233_ = 0;
							     (i_233_
							      < anInt5014);
							     i_233_++) {
							    short i_234_
								= (aShortArray5021
								   [i_233_]);
							    short i_235_
								= (aShortArray5025
								   [i_233_]);
							    short i_236_
								= (aShortArray5038
								   [i_233_]);
							    if (method1920
								((Class14_Sub2
								  .anInt2726),
								 (Class38
								  .anInt2622),
								 (anIntArray5057
								  [i_234_]),
								 (anIntArray5057
								  [i_235_]),
								 (anIntArray5057
								  [i_236_]),
								 (anIntArray5061
								  [i_234_]),
								 (anIntArray5061
								  [i_235_]),
								 (anIntArray5061
								  [i_236_]))) {
								Class7_Sub3
								    .aLongArray2685
								    [Class14_Sub15
									 .anInt2996++]
								    = arg8;
								break;
							    }
							}
						    }
						}
					    }
					}
				    } while (false);
				    GL gl = Class121.aGL2030;
				    gl.glPushMatrix();
				    gl.glTranslatef((float) arg5, (float) arg6,
						    (float) arg7);
				    gl.glRotatef((float) arg0 * 0.17578125F,
						 0.0F, 1.0F, 0.0F);
				    method1887();
				    gl.glPopMatrix();
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public void method1875() {
	for (int i = 0; i < anInt5033; i++) {
	    int i_237_ = anIntArray5010[i];
	    anIntArray5010[i] = anIntArray5027[i];
	    anIntArray5027[i] = -i_237_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public void method1855(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt5033; i++) {
	    anIntArray5027[i] += arg0;
	    anIntArray5022[i] += arg1;
	    anIntArray5010[i] += arg2;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public static float[] method1911(int arg0, int arg1, int arg2, int arg3,
				     float arg4, float arg5, float arg6) {
	float[] fs = new float[9];
	float[] fs_238_ = new float[9];
	float f = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
	float f_239_
	    = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
	float f_240_ = 1.0F - f;
	fs[0] = f;
	fs[1] = 0.0F;
	fs[2] = f_239_;
	fs[3] = 0.0F;
	fs[4] = 1.0F;
	fs[5] = 0.0F;
	fs[6] = -f_239_;
	fs[7] = 0.0F;
	fs[8] = f;
	float[] fs_241_ = new float[9];
	float f_242_ = 1.0F;
	float f_243_ = 0.0F;
	f = (float) arg1 / 32767.0F;
	f_239_ = -(float) Math.sqrt((double) (1.0F - f * f));
	f_240_ = 1.0F - f;
	float f_244_ = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
	if (f_244_ == 0.0F && f == 0.0F)
	    fs_238_ = fs;
	else {
	    if (f_244_ != 0.0F) {
		f_242_ = (float) -arg2 / f_244_;
		f_243_ = (float) arg0 / f_244_;
	    }
	    fs_241_[0] = f + f_242_ * f_242_ * f_240_;
	    fs_241_[1] = f_243_ * f_239_;
	    fs_241_[2] = f_243_ * f_242_ * f_240_;
	    fs_241_[3] = -f_243_ * f_239_;
	    fs_241_[4] = f;
	    fs_241_[5] = f_242_ * f_239_;
	    fs_241_[6] = f_242_ * f_243_ * f_240_;
	    fs_241_[7] = -f_242_ * f_239_;
	    fs_241_[8] = f + f_243_ * f_243_ * f_240_;
	    fs_238_[0]
		= fs[0] * fs_241_[0] + fs[1] * fs_241_[3] + fs[2] * fs_241_[6];
	    fs_238_[1]
		= fs[0] * fs_241_[1] + fs[1] * fs_241_[4] + fs[2] * fs_241_[7];
	    fs_238_[2]
		= fs[0] * fs_241_[2] + fs[1] * fs_241_[5] + fs[2] * fs_241_[8];
	    fs_238_[3]
		= fs[3] * fs_241_[0] + fs[4] * fs_241_[3] + fs[5] * fs_241_[6];
	    fs_238_[4]
		= fs[3] * fs_241_[1] + fs[4] * fs_241_[4] + fs[5] * fs_241_[7];
	    fs_238_[5]
		= fs[3] * fs_241_[2] + fs[4] * fs_241_[5] + fs[5] * fs_241_[8];
	    fs_238_[6]
		= fs[6] * fs_241_[0] + fs[7] * fs_241_[3] + fs[8] * fs_241_[6];
	    fs_238_[7]
		= fs[6] * fs_241_[1] + fs[7] * fs_241_[4] + fs[8] * fs_241_[7];
	    fs_238_[8]
		= fs[6] * fs_241_[2] + fs[7] * fs_241_[5] + fs[8] * fs_241_[8];
	}
	fs_238_[0] *= arg4;
	fs_238_[1] *= arg4;
	fs_238_[2] *= arg4;
	fs_238_[3] *= arg5;
	fs_238_[4] *= arg5;
	fs_238_[5] *= arg5;
	fs_238_[6] *= arg6;
	fs_238_[7] *= arg6;
	fs_238_[8] *= arg6;
	return fs_238_;
    }
    
    public void method1869(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt5033; i++) {
	    anIntArray5027[i] = anIntArray5027[i] * arg0 >> 7;
	    anIntArray5022[i] = anIntArray5022[i] * arg1 >> 7;
	    anIntArray5010[i] = anIntArray5010[i] * arg2 >> 7;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public int method1865() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort821;
    }
    
    public void method1871() {
	for (int i = 0; i < anInt5033; i++) {
	    int i_245_ = anIntArray5027[i];
	    anIntArray5027[i] = anIntArray5010[i];
	    anIntArray5010[i] = -i_245_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public void method1788(Class133 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	Class133_Sub7_Sub2 class133_sub7_sub2 = (Class133_Sub7_Sub2) arg0;
	if (anInt5014 != 0 && class133_sub7_sub2.anInt5014 != 0) {
	    int i = class133_sub7_sub2.anInt5033;
	    int[] is = class133_sub7_sub2.anIntArray5027;
	    int[] is_246_ = class133_sub7_sub2.anIntArray5022;
	    int[] is_247_ = class133_sub7_sub2.anIntArray5010;
	    short[] is_248_ = class133_sub7_sub2.aShortArray5041;
	    short[] is_249_ = class133_sub7_sub2.aShortArray5019;
	    short[] is_250_ = class133_sub7_sub2.aShortArray5042;
	    short[] is_251_ = class133_sub7_sub2.aShortArray5017;
	    short[] is_252_;
	    short[] is_253_;
	    short[] is_254_;
	    short[] is_255_;
	    if (aClass77_5039 != null) {
		is_252_ = aClass77_5039.aShortArray1219;
		is_253_ = aClass77_5039.aShortArray1216;
		is_254_ = aClass77_5039.aShortArray1218;
		is_255_ = aClass77_5039.aShortArray1217;
	    } else {
		is_252_ = null;
		is_253_ = null;
		is_254_ = null;
		is_255_ = null;
	    }
	    short[] is_256_;
	    short[] is_257_;
	    short[] is_258_;
	    short[] is_259_;
	    if (class133_sub7_sub2.aClass77_5039 != null) {
		is_256_ = class133_sub7_sub2.aClass77_5039.aShortArray1219;
		is_257_ = class133_sub7_sub2.aClass77_5039.aShortArray1216;
		is_258_ = class133_sub7_sub2.aClass77_5039.aShortArray1218;
		is_259_ = class133_sub7_sub2.aClass77_5039.aShortArray1217;
	    } else {
		is_256_ = null;
		is_257_ = null;
		is_258_ = null;
		is_259_ = null;
	    }
	    int[] is_260_ = class133_sub7_sub2.anIntArray5031;
	    short[] is_261_ = class133_sub7_sub2.aShortArray5036;
	    if (!class133_sub7_sub2.aClass50_5013.aBoolean820)
		class133_sub7_sub2.method1891();
	    int i_262_ = class133_sub7_sub2.aClass50_5013.aShort825;
	    int i_263_ = class133_sub7_sub2.aClass50_5013.aShort826;
	    int i_264_ = class133_sub7_sub2.aClass50_5013.aShort827;
	    int i_265_ = class133_sub7_sub2.aClass50_5013.aShort824;
	    int i_266_ = class133_sub7_sub2.aClass50_5013.aShort822;
	    int i_267_ = class133_sub7_sub2.aClass50_5013.aShort821;
	    for (int i_268_ = 0; i_268_ < anInt5033; i_268_++) {
		int i_269_ = anIntArray5022[i_268_] - arg2;
		if (i_269_ >= i_262_ && i_269_ <= i_263_) {
		    int i_270_ = anIntArray5027[i_268_] - arg1;
		    if (i_270_ >= i_264_ && i_270_ <= i_265_) {
			int i_271_ = anIntArray5010[i_268_] - arg3;
			if (i_271_ >= i_266_ && i_271_ <= i_267_) {
			    int i_272_ = -1;
			    int i_273_ = anIntArray5031[i_268_];
			    int i_274_ = anIntArray5031[i_268_ + 1];
			    for (int i_275_ = i_273_; i_275_ < i_274_;
				 i_275_++) {
				i_272_ = aShortArray5036[i_275_] - 1;
				if (i_272_ == -1
				    || aShortArray5017[i_272_] != 0)
				    break;
			    }
			    if (i_272_ != -1) {
				for (int i_276_ = 0; i_276_ < i; i_276_++) {
				    if (i_270_ == is[i_276_]
					&& i_271_ == is_247_[i_276_]
					&& i_269_ == is_246_[i_276_]) {
					int i_277_ = -1;
					i_273_ = is_260_[i_276_];
					i_274_ = is_260_[i_276_ + 1];
					for (int i_278_ = i_273_;
					     i_278_ < i_274_; i_278_++) {
					    i_277_ = is_261_[i_278_] - 1;
					    if (i_277_ == -1
						|| is_251_[i_277_] != 0)
						break;
					}
					if (i_277_ != -1) {
					    if (is_252_ == null) {
						aClass77_5039 = new Class77();
						is_252_
						    = aClass77_5039
							  .aShortArray1219
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111,
							aShortArray5041));
						is_253_
						    = aClass77_5039
							  .aShortArray1216
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111,
							aShortArray5019));
						is_254_
						    = aClass77_5039
							  .aShortArray1218
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111,
							aShortArray5042));
						is_255_
						    = aClass77_5039
							  .aShortArray1217
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111,
							aShortArray5017));
					    }
					    if (is_256_ == null) {
						Class77 class77
						    = (class133_sub7_sub2
							   .aClass77_5039
						       = new Class77());
						is_256_
						    = class77.aShortArray1219
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111, is_248_));
						is_257_
						    = class77.aShortArray1216
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111, is_249_));
						is_258_
						    = class77.aShortArray1218
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111, is_250_));
						is_259_
						    = class77.aShortArray1217
						    = (Class14_Sub8_Sub33
							   .method655
						       (8111, is_251_));
					    }
					    short i_279_
						= aShortArray5041[i_272_];
					    short i_280_
						= aShortArray5019[i_272_];
					    short i_281_
						= aShortArray5042[i_272_];
					    short i_282_
						= aShortArray5017[i_272_];
					    i_273_ = is_260_[i_276_];
					    i_274_ = is_260_[i_276_ + 1];
					    for (int i_283_ = i_273_;
						 i_283_ < i_274_; i_283_++) {
						int i_284_
						    = is_261_[i_283_] - 1;
						if (i_284_ == -1)
						    break;
						if (is_259_[i_284_] != 0) {
						    is_256_[i_284_] += i_279_;
						    is_257_[i_284_] += i_280_;
						    is_258_[i_284_] += i_281_;
						    is_259_[i_284_] += i_282_;
						}
					    }
					    i_279_ = is_248_[i_277_];
					    i_280_ = is_249_[i_277_];
					    i_281_ = is_250_[i_277_];
					    i_282_ = is_251_[i_277_];
					    i_273_ = anIntArray5031[i_268_];
					    i_274_
						= anIntArray5031[i_268_ + 1];
					    for (int i_285_ = i_273_;
						 i_285_ < i_274_; i_285_++) {
						int i_286_
						    = (aShortArray5036[i_285_]
						       - 1);
						if (i_286_ == -1)
						    break;
						if (is_255_[i_286_] != 0) {
						    is_252_[i_286_] += i_279_;
						    is_253_[i_286_] += i_280_;
						    is_254_[i_286_] += i_281_;
						    is_255_[i_286_] += i_282_;
						}
					    }
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
    }
    
    public int method1868() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort822;
    }
    
    public void method1912() {
	for (int i = 0; i < anInt5033; i++)
	    anIntArray5010[i] = -anIntArray5010[i];
	if (aShortArray5042 != null) {
	    for (int i = 0; i < anInt5040; i++)
		aShortArray5042[i] = (short) -aShortArray5042[i];
	}
	for (int i = 0; i < anInt5014; i++) {
	    short i_287_ = aShortArray5021[i];
	    aShortArray5021[i] = aShortArray5038[i];
	    aShortArray5038[i] = i_287_;
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
	if (aClass41_5018 != null)
	    aClass41_5018.aBoolean682 = false;
	aClass41_5046.aBoolean682 = false;
    }
    
    public Class133 method1791(int arg0, int arg1, int arg2) {
	aBoolean5009 = false;
	if (aClass77_5039 != null) {
	    aShortArray5041 = aClass77_5039.aShortArray1219;
	    aShortArray5019 = aClass77_5039.aShortArray1216;
	    aShortArray5042 = aClass77_5039.aShortArray1218;
	    aShortArray5017 = aClass77_5039.aShortArray1217;
	    aClass77_5039 = null;
	}
	return this;
    }
    
    public void method1913() {
	if (anIntArray5034 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_288_ = 0; i_288_ < anInt5033; i_288_++) {
		int i_289_ = anIntArray5034[i_288_] & 0xff;
		is[i_289_]++;
		if (i_289_ > i)
		    i = i_289_;
	    }
	    anIntArrayArray5044 = new int[i + 1][];
	    for (int i_290_ = 0; i_290_ <= i; i_290_++) {
		anIntArrayArray5044[i_290_] = new int[is[i_290_]];
		is[i_290_] = 0;
	    }
	    for (int i_291_ = 0; i_291_ < anInt5033; i_291_++) {
		int i_292_ = anIntArray5034[i_291_] & 0xff;
		anIntArrayArray5044[i_292_][is[i_292_]++] = i_291_;
	    }
	    anIntArray5034 = null;
	}
	if (aByteArray5016 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_293_ = 0; i_293_ < anInt5014; i_293_++) {
		int i_294_ = aByteArray5016[i_293_] & 0xff;
		is[i_294_]++;
		if (i_294_ > i)
		    i = i_294_;
	    }
	    anIntArrayArray5015 = new int[i + 1][];
	    for (int i_295_ = 0; i_295_ <= i; i_295_++) {
		anIntArrayArray5015[i_295_] = new int[is[i_295_]];
		is[i_295_] = 0;
	    }
	    for (int i_296_ = 0; i_296_ < anInt5014; i_296_++) {
		int i_297_ = aByteArray5016[i_296_] & 0xff;
		anIntArrayArray5015[i_297_][is[i_297_]++] = i_296_;
	    }
	    aByteArray5016 = null;
	}
    }
    
    public int method1781() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort825;
    }
    
    public static short[] method1914(short[] arg0, int arg1) {
	short[] is = new short[arg1];
	Class72.method1319(arg0, 0, is, 0, arg1);
	return is;
    }
    
    public void method1915(int arg0) {
	if (aShortArray5041 == null)
	    method1874(arg0);
	else {
	    int i = Class3.anIntArray108[arg0];
	    int i_298_ = Class3.anIntArray111[arg0];
	    for (int i_299_ = 0; i_299_ < anInt5033; i_299_++) {
		int i_300_ = ((anIntArray5010[i_299_] * i
			       + anIntArray5027[i_299_] * i_298_)
			      >> 16);
		anIntArray5010[i_299_] = (anIntArray5010[i_299_] * i_298_
					  - anIntArray5027[i_299_] * i) >> 16;
		anIntArray5027[i_299_] = i_300_;
	    }
	    for (int i_301_ = 0; i_301_ < anInt5040; i_301_++) {
		int i_302_ = ((aShortArray5042[i_301_] * i
			       + aShortArray5041[i_301_] * i_298_)
			      >> 16);
		aShortArray5042[i_301_]
		    = (short) ((aShortArray5042[i_301_] * i_298_
				- aShortArray5041[i_301_] * i)
			       >> 16);
		aShortArray5041[i_301_] = (short) i_302_;
	    }
	    aClass50_5013.aBoolean820 = false;
	    aClass41_5028.aBoolean682 = false;
	    if (aClass41_5018 != null)
		aClass41_5018.aBoolean682 = false;
	}
    }
    
    public Class133_Sub7_Sub2() {
	aBoolean5009 = false;
	aByte5023 = (byte) 0;
	anInt5040 = 0;
	aByte5026 = (byte) 0;
	anInt5033 = 0;
    }
    
    public void method1872() {
	for (int i = 0; i < anInt5033; i++) {
	    anIntArray5027[i] = -anIntArray5027[i];
	    anIntArray5010[i] = -anIntArray5010[i];
	}
	aClass50_5013.aBoolean820 = false;
	aClass41_5028.aBoolean682 = false;
    }
    
    public Class133_Sub7_Sub2(Class133_Sub2 arg0, int arg1, int arg2,
			      boolean arg3) {
	aBoolean5009 = false;
	aByte5023 = (byte) 0;
	anInt5040 = 0;
	aByte5026 = (byte) 0;
	anInt5033 = 0;
	int[] is = new int[arg0.anInt3547];
	anIntArray5031 = new int[arg0.anInt3521 + 1];
	for (int i = 0; i < arg0.anInt3547; i++) {
	    if ((arg0.aByteArray3534 == null || arg0.aByteArray3534[i] != 2)
		&& (arg0.aShortArray3528 == null
		    || arg0.aShortArray3528[i] == -1
		    || !Class3.anInterface3_117.method7((arg0.aShortArray3528
							 [i]) & 0xffff,
							false))) {
		is[anInt5014++] = i;
		anIntArray5031[arg0.anIntArray3549[i]]++;
		anIntArray5031[arg0.anIntArray3507[i]]++;
		anIntArray5031[arg0.anIntArray3540[i]]++;
	    }
	}
	long[] ls = new long[anInt5014];
	for (int i = 0; i < anInt5014; i++) {
	    int i_303_ = is[i];
	    int i_304_ = 0;
	    int i_305_ = 0;
	    int i_306_ = 0;
	    int i_307_ = 0;
	    int i_308_ = -1;
	    if (arg0.aShortArray3528 != null) {
		i_308_ = arg0.aShortArray3528[i_303_];
		if (i_308_ != -1) {
		    i_306_ = Class3.anInterface3_117.method12(true,
							      i_308_ & 0xffff);
		    i_307_ = Class3.anInterface3_117.method8((byte) 123,
							     i_308_ & 0xffff);
		}
	    }
	    boolean bool
		= ((arg0.aByteArray3541 != null
		    && arg0.aByteArray3541[i_303_] != 0)
		   || i_308_ != -1 && !Class3.anInterface3_117
					   .method6(i_308_ & 0xffff, -98));
	    if ((arg3 || bool) && arg0.aByteArray3546 != null)
		i_304_ += arg0.aByteArray3546[i_303_] << 17;
	    if (bool)
		i_304_ += 65536;
	    i_304_ += (i_306_ & 0xff) << 8;
	    i_304_ += i_307_ & 0xff;
	    i_305_ += (i_308_ & 0xffff) << 16;
	    i_305_ += i & 0xffff;
	    ls[i] = ((long) i_304_ << 32) + (long) i_305_;
	}
	Class117.method1602(is, (byte) 125, ls);
	anInt5033 = arg0.anInt3521;
	anIntArray5027 = arg0.anIntArray3530;
	anIntArray5022 = arg0.anIntArray3526;
	anIntArray5010 = arg0.anIntArray3510;
	anIntArray5034 = arg0.anIntArray3513;
	int i = anInt5014 * 3;
	aShortArray5041 = new short[i];
	aShortArray5019 = new short[i];
	aShortArray5042 = new short[i];
	aShortArray5017 = new short[i];
	aFloatArray5047 = new float[i];
	aFloatArray5012 = new float[i];
	aShortArray5045 = new short[anInt5014];
	aByteArray5043 = new byte[anInt5014];
	aShortArray5021 = new short[anInt5014];
	aShortArray5025 = new short[anInt5014];
	aShortArray5038 = new short[anInt5014];
	aShortArray5037 = new short[anInt5014];
	if (arg0.anIntArray3532 != null)
	    aByteArray5016 = new byte[anInt5014];
	aClass50_5013 = new Class50();
	aClass41_5028 = new Class41();
	aClass41_5030 = new Class41();
	if (Class7_Sub1.aBoolean2661)
	    aClass41_5018 = new Class41();
	aClass41_5029 = new Class41();
	aClass41_5046 = new Class41();
	aShort5032 = (short) arg1;
	aShort5024 = (short) arg2;
	aShortArray5036 = new short[i];
	aLongArray5048 = new long[i];
	int i_309_ = 0;
	for (int i_310_ = 0; i_310_ < arg0.anInt3521; i_310_++) {
	    int i_311_ = anIntArray5031[i_310_];
	    anIntArray5031[i_310_] = i_309_;
	    i_309_ += i_311_;
	}
	anIntArray5031[arg0.anInt3521] = i_309_;
	int[] is_312_ = null;
	int[] is_313_ = null;
	int[] is_314_ = null;
	float[][] fs = null;
	if (arg0.aByteArray3535 != null) {
	    int i_315_ = arg0.anInt3544;
	    int[] is_316_ = new int[i_315_];
	    int[] is_317_ = new int[i_315_];
	    int[] is_318_ = new int[i_315_];
	    int[] is_319_ = new int[i_315_];
	    int[] is_320_ = new int[i_315_];
	    int[] is_321_ = new int[i_315_];
	    for (int i_322_ = 0; i_322_ < i_315_; i_322_++) {
		is_316_[i_322_] = 2147483647;
		is_317_[i_322_] = -2147483647;
		is_318_[i_322_] = 2147483647;
		is_319_[i_322_] = -2147483647;
		is_320_[i_322_] = 2147483647;
		is_321_[i_322_] = -2147483647;
	    }
	    for (int i_323_ = 0; i_323_ < anInt5014; i_323_++) {
		int i_324_ = is[i_323_];
		if (arg0.aByteArray3535[i_324_] != -1) {
		    int i_325_ = arg0.aByteArray3535[i_324_] & 0xff;
		    for (int i_326_ = 0; i_326_ < 3; i_326_++) {
			int i_327_;
			if (i_326_ == 0)
			    i_327_ = arg0.anIntArray3549[i_324_];
			else if (i_326_ == 1)
			    i_327_ = arg0.anIntArray3507[i_324_];
			else
			    i_327_ = arg0.anIntArray3540[i_324_];
			int i_328_ = arg0.anIntArray3530[i_327_];
			int i_329_ = arg0.anIntArray3526[i_327_];
			int i_330_ = arg0.anIntArray3510[i_327_];
			if (i_328_ < is_316_[i_325_])
			    is_316_[i_325_] = i_328_;
			if (i_328_ > is_317_[i_325_])
			    is_317_[i_325_] = i_328_;
			if (i_329_ < is_318_[i_325_])
			    is_318_[i_325_] = i_329_;
			if (i_329_ > is_319_[i_325_])
			    is_319_[i_325_] = i_329_;
			if (i_330_ < is_320_[i_325_])
			    is_320_[i_325_] = i_330_;
			if (i_330_ > is_321_[i_325_])
			    is_321_[i_325_] = i_330_;
		    }
		}
	    }
	    is_312_ = new int[i_315_];
	    is_313_ = new int[i_315_];
	    is_314_ = new int[i_315_];
	    fs = new float[i_315_][];
	    for (int i_331_ = 0; i_331_ < i_315_; i_331_++) {
		byte i_332_ = arg0.aByteArray3514[i_331_];
		if (i_332_ > 0) {
		    is_312_[i_331_] = (is_316_[i_331_] + is_317_[i_331_]) / 2;
		    is_313_[i_331_] = (is_318_[i_331_] + is_319_[i_331_]) / 2;
		    is_314_[i_331_] = (is_320_[i_331_] + is_321_[i_331_]) / 2;
		    float f;
		    float f_333_;
		    float f_334_;
		    if (i_332_ == 1) {
			int i_335_ = arg0.aShortArray3512[i_331_];
			if (i_335_ == 0) {
			    f = 1.0F;
			    f_334_ = 1.0F;
			} else if (i_335_ > 0) {
			    f = 1.0F;
			    f_334_ = (float) i_335_ / 1024.0F;
			} else {
			    f_334_ = 1.0F;
			    f = (float) -i_335_ / 1024.0F;
			}
			f_333_ = 64.0F / (float) (arg0.aShortArray3522[i_331_]
						  & 0xffff);
		    } else if (i_332_ == 2) {
			f = 64.0F / (float) (arg0.aShortArray3512[i_331_]
					     & 0xffff);
			f_333_ = 64.0F / (float) (arg0.aShortArray3522[i_331_]
						  & 0xffff);
			f_334_ = 64.0F / (float) (arg0.aShortArray3527[i_331_]
						  & 0xffff);
		    } else {
			f = (float) arg0.aShortArray3512[i_331_] / 1024.0F;
			f_333_
			    = (float) arg0.aShortArray3522[i_331_] / 1024.0F;
			f_334_
			    = (float) arg0.aShortArray3527[i_331_] / 1024.0F;
		    }
		    fs[i_331_] = method1911(arg0.aShortArray3520[i_331_],
					    arg0.aShortArray3531[i_331_],
					    arg0.aShortArray3511[i_331_],
					    arg0.aByteArray3516[i_331_] & 0xff,
					    f, f_333_, f_334_);
		}
	    }
	}
	for (int i_336_ = 0; i_336_ < anInt5014; i_336_++) {
	    int i_337_ = is[i_336_];
	    int i_338_ = arg0.aShortArray3533[i_337_] & 0xffff;
	    short i_339_;
	    if (arg0.aShortArray3528 == null)
		i_339_ = (short) -1;
	    else
		i_339_ = arg0.aShortArray3528[i_337_];
	    int i_340_;
	    if (arg0.aByteArray3535 == null)
		i_340_ = -1;
	    else
		i_340_ = arg0.aByteArray3535[i_337_];
	    int i_341_;
	    if (arg0.aByteArray3541 == null)
		i_341_ = 0;
	    else
		i_341_ = arg0.aByteArray3541[i_337_] & 0xff;
	    float f = 0.0F;
	    float f_342_ = 0.0F;
	    float f_343_ = 0.0F;
	    float f_344_ = 0.0F;
	    float f_345_ = 0.0F;
	    float f_346_ = 0.0F;
	    int i_347_ = 0;
	    int i_348_ = 0;
	    int i_349_ = 0;
	    if (i_339_ != -1) {
		if (i_340_ == -1) {
		    f = 0.0F;
		    f_342_ = 1.0F;
		    f_343_ = 1.0F;
		    f_344_ = 1.0F;
		    i_347_ = 1;
		    f_345_ = 0.0F;
		    f_346_ = 0.0F;
		    i_348_ = 2;
		} else {
		    i_340_ &= 0xff;
		    byte i_350_ = arg0.aByteArray3514[i_340_];
		    if (i_350_ == 0) {
			int i_351_ = arg0.anIntArray3549[i_337_];
			int i_352_ = arg0.anIntArray3507[i_337_];
			int i_353_ = arg0.anIntArray3540[i_337_];
			short i_354_ = arg0.aShortArray3520[i_340_];
			short i_355_ = arg0.aShortArray3531[i_340_];
			short i_356_ = arg0.aShortArray3511[i_340_];
			float f_357_ = (float) arg0.anIntArray3530[i_354_];
			float f_358_ = (float) arg0.anIntArray3526[i_354_];
			float f_359_ = (float) arg0.anIntArray3510[i_354_];
			float f_360_
			    = (float) arg0.anIntArray3530[i_355_] - f_357_;
			float f_361_
			    = (float) arg0.anIntArray3526[i_355_] - f_358_;
			float f_362_
			    = (float) arg0.anIntArray3510[i_355_] - f_359_;
			float f_363_
			    = (float) arg0.anIntArray3530[i_356_] - f_357_;
			float f_364_
			    = (float) arg0.anIntArray3526[i_356_] - f_358_;
			float f_365_
			    = (float) arg0.anIntArray3510[i_356_] - f_359_;
			float f_366_
			    = (float) arg0.anIntArray3530[i_351_] - f_357_;
			float f_367_
			    = (float) arg0.anIntArray3526[i_351_] - f_358_;
			float f_368_
			    = (float) arg0.anIntArray3510[i_351_] - f_359_;
			float f_369_
			    = (float) arg0.anIntArray3530[i_352_] - f_357_;
			float f_370_
			    = (float) arg0.anIntArray3526[i_352_] - f_358_;
			float f_371_
			    = (float) arg0.anIntArray3510[i_352_] - f_359_;
			float f_372_
			    = (float) arg0.anIntArray3530[i_353_] - f_357_;
			float f_373_
			    = (float) arg0.anIntArray3526[i_353_] - f_358_;
			float f_374_
			    = (float) arg0.anIntArray3510[i_353_] - f_359_;
			float f_375_ = f_361_ * f_365_ - f_362_ * f_364_;
			float f_376_ = f_362_ * f_363_ - f_360_ * f_365_;
			float f_377_ = f_360_ * f_364_ - f_361_ * f_363_;
			float f_378_ = f_364_ * f_377_ - f_365_ * f_376_;
			float f_379_ = f_365_ * f_375_ - f_363_ * f_377_;
			float f_380_ = f_363_ * f_376_ - f_364_ * f_375_;
			float f_381_
			    = 1.0F / (f_378_ * f_360_ + f_379_ * f_361_
				      + f_380_ * f_362_);
			f = (f_378_ * f_366_ + f_379_ * f_367_
			     + f_380_ * f_368_) * f_381_;
			f_343_ = (f_378_ * f_369_ + f_379_ * f_370_
				  + f_380_ * f_371_) * f_381_;
			f_345_ = (f_378_ * f_372_ + f_379_ * f_373_
				  + f_380_ * f_374_) * f_381_;
			f_378_ = f_361_ * f_377_ - f_362_ * f_376_;
			f_379_ = f_362_ * f_375_ - f_360_ * f_377_;
			f_380_ = f_360_ * f_376_ - f_361_ * f_375_;
			f_381_ = 1.0F / (f_378_ * f_363_ + f_379_ * f_364_
					 + f_380_ * f_365_);
			f_342_ = (f_378_ * f_366_ + f_379_ * f_367_
				  + f_380_ * f_368_) * f_381_;
			f_344_ = (f_378_ * f_369_ + f_379_ * f_370_
				  + f_380_ * f_371_) * f_381_;
			f_346_ = (f_378_ * f_372_ + f_379_ * f_373_
				  + f_380_ * f_374_) * f_381_;
		    } else {
			int i_382_ = arg0.anIntArray3549[i_337_];
			int i_383_ = arg0.anIntArray3507[i_337_];
			int i_384_ = arg0.anIntArray3540[i_337_];
			int i_385_ = is_312_[i_340_];
			int i_386_ = is_313_[i_340_];
			int i_387_ = is_314_[i_340_];
			float[] fs_388_ = fs[i_340_];
			byte i_389_ = arg0.aByteArray3548[i_340_];
			float f_390_
			    = (float) arg0.aByteArray3554[i_340_] / 256.0F;
			if (i_350_ == 1) {
			    float f_391_
				= ((float) (arg0.aShortArray3527[i_340_]
					    & 0xffff)
				   / 1024.0F);
			    method1921(arg0.anIntArray3530[i_382_],
				       arg0.anIntArray3526[i_382_],
				       arg0.anIntArray3510[i_382_], i_385_,
				       i_386_, i_387_, fs_388_, f_391_, i_389_,
				       f_390_);
			    f = aFloat5064;
			    f_342_ = aFloat5060;
			    method1921(arg0.anIntArray3530[i_383_],
				       arg0.anIntArray3526[i_383_],
				       arg0.anIntArray3510[i_383_], i_385_,
				       i_386_, i_387_, fs_388_, f_391_, i_389_,
				       f_390_);
			    f_343_ = aFloat5064;
			    f_344_ = aFloat5060;
			    method1921(arg0.anIntArray3530[i_384_],
				       arg0.anIntArray3526[i_384_],
				       arg0.anIntArray3510[i_384_], i_385_,
				       i_386_, i_387_, fs_388_, f_391_, i_389_,
				       f_390_);
			    f_345_ = aFloat5064;
			    f_346_ = aFloat5060;
			    float f_392_ = f_391_ / 2.0F;
			    if ((i_389_ & 0x1) == 0) {
				if (f_343_ - f > f_392_) {
				    f_343_ -= f_391_;
				    i_347_ = 1;
				} else if (f - f_343_ > f_392_) {
				    f_343_ += f_391_;
				    i_347_ = 2;
				}
				if (f_345_ - f > f_392_) {
				    f_345_ -= f_391_;
				    i_348_ = 1;
				} else if (f - f_345_ > f_392_) {
				    f_345_ += f_391_;
				    i_348_ = 2;
				}
			    } else {
				if (f_344_ - f_342_ > f_392_) {
				    f_344_ -= f_391_;
				    i_347_ = 1;
				} else if (f_342_ - f_344_ > f_392_) {
				    f_344_ += f_391_;
				    i_347_ = 2;
				}
				if (f_346_ - f_342_ > f_392_) {
				    f_346_ -= f_391_;
				    i_348_ = 1;
				} else if (f_342_ - f_346_ > f_392_) {
				    f_346_ += f_391_;
				    i_348_ = 2;
				}
			    }
			} else if (i_350_ == 2) {
			    float f_393_
				= (float) arg0.aByteArray3518[i_340_] / 256.0F;
			    float f_394_
				= (float) arg0.aByteArray3529[i_340_] / 256.0F;
			    int i_395_ = (arg0.anIntArray3530[i_383_]
					  - arg0.anIntArray3530[i_382_]);
			    int i_396_ = (arg0.anIntArray3526[i_383_]
					  - arg0.anIntArray3526[i_382_]);
			    int i_397_ = (arg0.anIntArray3510[i_383_]
					  - arg0.anIntArray3510[i_382_]);
			    int i_398_ = (arg0.anIntArray3530[i_384_]
					  - arg0.anIntArray3530[i_382_]);
			    int i_399_ = (arg0.anIntArray3526[i_384_]
					  - arg0.anIntArray3526[i_382_]);
			    int i_400_ = (arg0.anIntArray3510[i_384_]
					  - arg0.anIntArray3510[i_382_]);
			    int i_401_ = i_396_ * i_400_ - i_399_ * i_397_;
			    int i_402_ = i_397_ * i_398_ - i_400_ * i_395_;
			    int i_403_ = i_395_ * i_399_ - i_398_ * i_396_;
			    float f_404_
				= 64.0F / (float) (arg0.aShortArray3512[i_340_]
						   & 0xffff);
			    float f_405_
				= 64.0F / (float) (arg0.aShortArray3522[i_340_]
						   & 0xffff);
			    float f_406_
				= 64.0F / (float) (arg0.aShortArray3527[i_340_]
						   & 0xffff);
			    float f_407_ = (((float) i_401_ * fs_388_[0]
					     + (float) i_402_ * fs_388_[1]
					     + (float) i_403_ * fs_388_[2])
					    / f_404_);
			    float f_408_ = (((float) i_401_ * fs_388_[3]
					     + (float) i_402_ * fs_388_[4]
					     + (float) i_403_ * fs_388_[5])
					    / f_405_);
			    float f_409_ = (((float) i_401_ * fs_388_[6]
					     + (float) i_402_ * fs_388_[7]
					     + (float) i_403_ * fs_388_[8])
					    / f_406_);
			    i_349_ = method1898(f_407_, f_408_, f_409_);
			    method1888(arg0.anIntArray3530[i_382_],
				       arg0.anIntArray3526[i_382_],
				       arg0.anIntArray3510[i_382_], i_385_,
				       i_386_, i_387_, i_349_, fs_388_, i_389_,
				       f_390_, f_393_, f_394_);
			    f = aFloat5056;
			    f_342_ = aFloat5063;
			    method1888(arg0.anIntArray3530[i_383_],
				       arg0.anIntArray3526[i_383_],
				       arg0.anIntArray3510[i_383_], i_385_,
				       i_386_, i_387_, i_349_, fs_388_, i_389_,
				       f_390_, f_393_, f_394_);
			    f_343_ = aFloat5056;
			    f_344_ = aFloat5063;
			    method1888(arg0.anIntArray3530[i_384_],
				       arg0.anIntArray3526[i_384_],
				       arg0.anIntArray3510[i_384_], i_385_,
				       i_386_, i_387_, i_349_, fs_388_, i_389_,
				       f_390_, f_393_, f_394_);
			    f_345_ = aFloat5056;
			    f_346_ = aFloat5063;
			} else if (i_350_ == 3) {
			    method1916(arg0.anIntArray3530[i_382_],
				       arg0.anIntArray3526[i_382_],
				       arg0.anIntArray3510[i_382_], i_385_,
				       i_386_, i_387_, fs_388_, i_389_,
				       f_390_);
			    f = aFloat5062;
			    f_342_ = aFloat5058;
			    method1916(arg0.anIntArray3530[i_383_],
				       arg0.anIntArray3526[i_383_],
				       arg0.anIntArray3510[i_383_], i_385_,
				       i_386_, i_387_, fs_388_, i_389_,
				       f_390_);
			    f_343_ = aFloat5062;
			    f_344_ = aFloat5058;
			    method1916(arg0.anIntArray3530[i_384_],
				       arg0.anIntArray3526[i_384_],
				       arg0.anIntArray3510[i_384_], i_385_,
				       i_386_, i_387_, fs_388_, i_389_,
				       f_390_);
			    f_345_ = aFloat5062;
			    f_346_ = aFloat5058;
			    if ((i_389_ & 0x1) == 0) {
				if (f_343_ - f > 0.5F) {
				    f_343_--;
				    i_347_ = 1;
				} else if (f - f_343_ > 0.5F) {
				    f_343_++;
				    i_347_ = 2;
				}
				if (f_345_ - f > 0.5F) {
				    f_345_--;
				    i_348_ = 1;
				} else if (f - f_345_ > 0.5F) {
				    f_345_++;
				    i_348_ = 2;
				}
			    } else {
				if (f_344_ - f_342_ > 0.5F) {
				    f_344_--;
				    i_347_ = 1;
				} else if (f_342_ - f_344_ > 0.5F) {
				    f_344_++;
				    i_347_ = 2;
				}
				if (f_346_ - f_342_ > 0.5F) {
				    f_346_--;
				    i_348_ = 1;
				} else if (f_342_ - f_346_ > 0.5F) {
				    f_346_++;
				    i_348_ = 2;
				}
			    }
			}
		    }
		}
	    }
	    arg0.method1826();
	    byte i_410_;
	    if (arg0.aByteArray3534 == null)
		i_410_ = (byte) 0;
	    else
		i_410_ = arg0.aByteArray3534[i_337_];
	    if (i_410_ == 0) {
		long l = ((long) (i_340_ << 2)
			  + (((long) (i_349_ << 24) + (long) (i_338_ << 8)
			      + (long) i_341_)
			     << 32));
		int i_411_ = arg0.anIntArray3549[i_337_];
		Class89 class89 = arg0.aClass89Array3552[i_411_];
		aShortArray5021[i_336_]
		    = method1901(arg0, i_411_, l, class89.anInt1414,
				 class89.anInt1404, class89.anInt1406,
				 class89.anInt1410, f, f_342_);
		int i_412_ = arg0.anIntArray3507[i_337_];
		Class89 class89_413_ = arg0.aClass89Array3552[i_412_];
		aShortArray5025[i_336_]
		    = method1901(arg0, i_412_, l + (long) i_347_,
				 class89_413_.anInt1414,
				 class89_413_.anInt1404,
				 class89_413_.anInt1406,
				 class89_413_.anInt1410, f_343_, f_344_);
		int i_414_ = arg0.anIntArray3540[i_337_];
		Class89 class89_415_ = arg0.aClass89Array3552[i_414_];
		aShortArray5038[i_336_]
		    = method1901(arg0, i_414_, l + (long) i_348_,
				 class89_415_.anInt1414,
				 class89_415_.anInt1404,
				 class89_415_.anInt1406,
				 class89_415_.anInt1410, f_345_, f_346_);
	    } else if (i_410_ == 1) {
		Class138 class138 = arg0.aClass138Array3536[i_337_];
		long l = ((long) ((i_340_ << 2)
				  + (class138.anInt2208 > 0 ? 1024 : 2048)
				  + (class138.anInt2217 + 256 << 12)
				  + (class138.anInt2209 + 256 << 22))
			  + (((long) (i_349_ << 24) + (long) (i_338_ << 8)
			      + (long) i_341_)
			     << 32));
		aShortArray5021[i_336_]
		    = method1901(arg0, arg0.anIntArray3549[i_337_], l,
				 class138.anInt2208, class138.anInt2217,
				 class138.anInt2209, 0, f, f_342_);
		aShortArray5025[i_336_]
		    = method1901(arg0, arg0.anIntArray3507[i_337_],
				 l + (long) i_347_, class138.anInt2208,
				 class138.anInt2217, class138.anInt2209, 0,
				 f_343_, f_344_);
		aShortArray5038[i_336_]
		    = method1901(arg0, arg0.anIntArray3540[i_337_],
				 l + (long) i_348_, class138.anInt2208,
				 class138.anInt2217, class138.anInt2209, 0,
				 f_345_, f_346_);
	    }
	    if (arg0.aShortArray3528 != null)
		aShortArray5037[i_336_] = arg0.aShortArray3528[i_337_];
	    else
		aShortArray5037[i_336_] = (short) -1;
	    if (aByteArray5016 != null)
		aByteArray5016[i_336_] = (byte) arg0.anIntArray3532[i_337_];
	    aShortArray5045[i_336_] = arg0.aShortArray3533[i_337_];
	    if (arg0.aByteArray3541 != null)
		aByteArray5043[i_336_] = arg0.aByteArray3541[i_337_];
	}
	int i_416_ = 0;
	short i_417_ = -10000;
	for (int i_418_ = 0; i_418_ < anInt5014; i_418_++) {
	    short i_419_ = aShortArray5037[i_418_];
	    if (i_419_ != i_417_) {
		i_416_++;
		i_417_ = i_419_;
	    }
	}
	anIntArray5035 = new int[i_416_ + 1];
	i_416_ = 0;
	i_417_ = (short) -10000;
	for (int i_420_ = 0; i_420_ < anInt5014; i_420_++) {
	    short i_421_ = aShortArray5037[i_420_];
	    if (i_421_ != i_417_) {
		anIntArray5035[i_416_++] = i_420_;
		i_417_ = i_421_;
	    }
	}
	anIntArray5035[i_416_] = anInt5014;
	aLongArray5048 = null;
	aShortArray5041 = method1914(aShortArray5041, anInt5040);
	aShortArray5019 = method1914(aShortArray5019, anInt5040);
	aShortArray5042 = method1914(aShortArray5042, anInt5040);
	aShortArray5017 = method1914(aShortArray5017, anInt5040);
	aFloatArray5047 = method1894(aFloatArray5047, anInt5040);
	aFloatArray5012 = method1894(aFloatArray5012, anInt5040);
    }
    
    public Class133_Sub7 method1860(boolean arg0, boolean arg1) {
	return method1907(arg0, arg1, aClass133_Sub7_Sub2_5051,
			  aClass133_Sub7_Sub2_5049);
    }
    
    public static void method1916(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, float[] arg6, int arg7,
				  float arg8) {
	arg0 -= arg3;
	arg1 -= arg4;
	arg2 -= arg5;
	float f = ((float) arg0 * arg6[0] + (float) arg1 * arg6[1]
		   + (float) arg2 * arg6[2]);
	float f_422_ = ((float) arg0 * arg6[3] + (float) arg1 * arg6[4]
			+ (float) arg2 * arg6[5]);
	float f_423_ = ((float) arg0 * arg6[6] + (float) arg1 * arg6[7]
			+ (float) arg2 * arg6[8]);
	float f_424_ = (float) Math.sqrt((double) (f * f + f_422_ * f_422_
						   + f_423_ * f_423_));
	float f_425_
	    = ((float) Math.atan2((double) f, (double) f_423_) / 6.2831855F
	       + 0.5F);
	float f_426_
	    = ((float) Math.asin((double) (f_422_ / f_424_)) / 3.1415927F
	       + 0.5F + arg8);
	if (arg7 == 1) {
	    float f_427_ = f_425_;
	    f_425_ = -f_426_;
	    f_426_ = f_427_;
	} else if (arg7 == 2) {
	    f_425_ = -f_425_;
	    f_426_ = -f_426_;
	} else if (arg7 == 3) {
	    float f_428_ = f_425_;
	    f_425_ = f_426_;
	    f_426_ = -f_428_;
	}
	aFloat5062 = f_425_;
	aFloat5058 = f_426_;
    }
    
    public int method1856() {
	if (!aClass50_5013.aBoolean820)
	    method1891();
	return aClass50_5013.aShort824;
    }
    
    public void method1917(int arg0, int[] arg1, int arg2, int arg3, int arg4,
			   boolean arg5) {
	int i = arg1.length;
	if (arg0 == 0) {
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    int i_429_ = 0;
	    anInt5055 = 0;
	    anInt5059 = 0;
	    anInt5054 = 0;
	    for (int i_430_ = 0; i_430_ < i; i_430_++) {
		int i_431_ = arg1[i_430_];
		if (i_431_ < anIntArrayArray5044.length) {
		    int[] is = anIntArrayArray5044[i_431_];
		    for (int i_432_ = 0; i_432_ < is.length; i_432_++) {
			int i_433_ = is[i_432_];
			anInt5055 += anIntArray5027[i_433_];
			anInt5059 += anIntArray5022[i_433_];
			anInt5054 += anIntArray5010[i_433_];
			i_429_++;
		    }
		}
	    }
	    if (i_429_ > 0) {
		anInt5055 = anInt5055 / i_429_ + arg2;
		anInt5059 = anInt5059 / i_429_ + arg3;
		anInt5054 = anInt5054 / i_429_ + arg4;
	    } else {
		anInt5055 = arg2;
		anInt5059 = arg3;
		anInt5054 = arg4;
	    }
	} else if (arg0 == 1) {
	    arg2 <<= 4;
	    arg3 <<= 4;
	    arg4 <<= 4;
	    for (int i_434_ = 0; i_434_ < i; i_434_++) {
		int i_435_ = arg1[i_434_];
		if (i_435_ < anIntArrayArray5044.length) {
		    int[] is = anIntArrayArray5044[i_435_];
		    for (int i_436_ = 0; i_436_ < is.length; i_436_++) {
			int i_437_ = is[i_436_];
			anIntArray5027[i_437_] += arg2;
			anIntArray5022[i_437_] += arg3;
			anIntArray5010[i_437_] += arg4;
		    }
		}
	    }
	} else if (arg0 == 2) {
	    for (int i_438_ = 0; i_438_ < i; i_438_++) {
		int i_439_ = arg1[i_438_];
		if (i_439_ < anIntArrayArray5044.length) {
		    int[] is = anIntArrayArray5044[i_439_];
		    for (int i_440_ = 0; i_440_ < is.length; i_440_++) {
			int i_441_ = is[i_440_];
			anIntArray5027[i_441_] -= anInt5055;
			anIntArray5022[i_441_] -= anInt5059;
			anIntArray5010[i_441_] -= anInt5054;
			if (arg4 != 0) {
			    int i_442_ = Class3.anIntArray108[arg4];
			    int i_443_ = Class3.anIntArray111[arg4];
			    int i_444_
				= ((anIntArray5022[i_441_] * i_442_
				    + anIntArray5027[i_441_] * i_443_ + 32767)
				   >> 16);
			    anIntArray5022[i_441_]
				= ((anIntArray5022[i_441_] * i_443_
				    - anIntArray5027[i_441_] * i_442_ + 32767)
				   >> 16);
			    anIntArray5027[i_441_] = i_444_;
			}
			if (arg2 != 0) {
			    int i_445_ = Class3.anIntArray108[arg2];
			    int i_446_ = Class3.anIntArray111[arg2];
			    int i_447_
				= ((anIntArray5022[i_441_] * i_446_
				    - anIntArray5010[i_441_] * i_445_ + 32767)
				   >> 16);
			    anIntArray5010[i_441_]
				= ((anIntArray5022[i_441_] * i_445_
				    + anIntArray5010[i_441_] * i_446_ + 32767)
				   >> 16);
			    anIntArray5022[i_441_] = i_447_;
			}
			if (arg3 != 0) {
			    int i_448_ = Class3.anIntArray108[arg3];
			    int i_449_ = Class3.anIntArray111[arg3];
			    int i_450_
				= ((anIntArray5010[i_441_] * i_448_
				    + anIntArray5027[i_441_] * i_449_ + 32767)
				   >> 16);
			    anIntArray5010[i_441_]
				= ((anIntArray5010[i_441_] * i_449_
				    - anIntArray5027[i_441_] * i_448_ + 32767)
				   >> 16);
			    anIntArray5027[i_441_] = i_450_;
			}
			anIntArray5027[i_441_] += anInt5055;
			anIntArray5022[i_441_] += anInt5059;
			anIntArray5010[i_441_] += anInt5054;
		    }
		}
	    }
	    if (arg5 && aShortArray5041 != null) {
		for (int i_451_ = 0; i_451_ < i; i_451_++) {
		    int i_452_ = arg1[i_451_];
		    if (i_452_ < anIntArrayArray5044.length) {
			int[] is = anIntArrayArray5044[i_452_];
			for (int i_453_ = 0; i_453_ < is.length; i_453_++) {
			    int i_454_ = is[i_453_];
			    int i_455_ = anIntArray5031[i_454_];
			    int i_456_ = anIntArray5031[i_454_ + 1];
			    for (int i_457_ = i_455_; i_457_ < i_456_;
				 i_457_++) {
				int i_458_ = aShortArray5036[i_457_] - 1;
				if (i_458_ == -1)
				    break;
				if (arg4 != 0) {
				    int i_459_ = Class3.anIntArray108[arg4];
				    int i_460_ = Class3.anIntArray111[arg4];
				    int i_461_
					= ((aShortArray5019[i_458_] * i_459_
					    + aShortArray5041[i_458_] * i_460_
					    + 32767)
					   >> 16);
				    aShortArray5019[i_458_]
					= (short) (((aShortArray5019[i_458_]
						     * i_460_)
						    - (aShortArray5041[i_458_]
						       * i_459_)
						    + 32767)
						   >> 16);
				    aShortArray5041[i_458_] = (short) i_461_;
				}
				if (arg2 != 0) {
				    int i_462_ = Class3.anIntArray108[arg2];
				    int i_463_ = Class3.anIntArray111[arg2];
				    int i_464_
					= ((aShortArray5019[i_458_] * i_463_
					    - aShortArray5042[i_458_] * i_462_
					    + 32767)
					   >> 16);
				    aShortArray5042[i_458_]
					= (short) (((aShortArray5019[i_458_]
						     * i_462_)
						    + (aShortArray5042[i_458_]
						       * i_463_)
						    + 32767)
						   >> 16);
				    aShortArray5019[i_458_] = (short) i_464_;
				}
				if (arg3 != 0) {
				    int i_465_ = Class3.anIntArray108[arg3];
				    int i_466_ = Class3.anIntArray111[arg3];
				    int i_467_
					= ((aShortArray5042[i_458_] * i_465_
					    + aShortArray5041[i_458_] * i_466_
					    + 32767)
					   >> 16);
				    aShortArray5042[i_458_]
					= (short) (((aShortArray5042[i_458_]
						     * i_466_)
						    - (aShortArray5041[i_458_]
						       * i_465_)
						    + 32767)
						   >> 16);
				    aShortArray5041[i_458_] = (short) i_467_;
				}
			    }
			}
		    }
		}
		if (aClass41_5018 != null)
		    aClass41_5018.aBoolean682 = false;
	    }
	} else if (arg0 == 3) {
	    for (int i_468_ = 0; i_468_ < i; i_468_++) {
		int i_469_ = arg1[i_468_];
		if (i_469_ < anIntArrayArray5044.length) {
		    int[] is = anIntArrayArray5044[i_469_];
		    for (int i_470_ = 0; i_470_ < is.length; i_470_++) {
			int i_471_ = is[i_470_];
			anIntArray5027[i_471_] -= anInt5055;
			anIntArray5022[i_471_] -= anInt5059;
			anIntArray5010[i_471_] -= anInt5054;
			anIntArray5027[i_471_]
			    = anIntArray5027[i_471_] * arg2 >> 7;
			anIntArray5022[i_471_]
			    = anIntArray5022[i_471_] * arg3 >> 7;
			anIntArray5010[i_471_]
			    = anIntArray5010[i_471_] * arg4 >> 7;
			anIntArray5027[i_471_] += anInt5055;
			anIntArray5022[i_471_] += anInt5059;
			anIntArray5010[i_471_] += anInt5054;
		    }
		}
	    }
	} else if (arg0 == 5 && anIntArrayArray5015 != null
		   && aByteArray5043 != null) {
	    for (int i_472_ = 0; i_472_ < i; i_472_++) {
		int i_473_ = arg1[i_472_];
		if (i_473_ < anIntArrayArray5015.length) {
		    int[] is = anIntArrayArray5015[i_473_];
		    for (int i_474_ = 0; i_474_ < is.length; i_474_++) {
			int i_475_ = is[i_474_];
			int i_476_
			    = (aByteArray5043[i_475_] & 0xff) + arg2 * 8;
			if (i_476_ < 0)
			    i_476_ = 0;
			else if (i_476_ > 255)
			    i_476_ = 255;
			aByteArray5043[i_475_] = (byte) i_476_;
		    }
		    if (is.length > 0)
			aClass41_5030.aBoolean682 = false;
		}
	    }
	}
    }
    
    public void method1918() {
	if (aShortArray5041 == null)
	    method1871();
	else {
	    for (int i = 0; i < anInt5033; i++) {
		int i_477_ = anIntArray5027[i];
		anIntArray5027[i] = anIntArray5010[i];
		anIntArray5010[i] = -i_477_;
	    }
	    for (int i = 0; i < anInt5040; i++) {
		int i_478_ = aShortArray5041[i];
		aShortArray5041[i] = aShortArray5042[i];
		aShortArray5042[i] = (short) -i_478_;
	    }
	    aClass50_5013.aBoolean820 = false;
	    aClass41_5028.aBoolean682 = false;
	    if (aClass41_5018 != null)
		aClass41_5018.aBoolean682 = false;
	}
    }
    
    public void method1919(short arg0, short arg1) {
	for (int i = 0; i < anInt5014; i++) {
	    if (aShortArray5045[i] == arg0)
		aShortArray5045[i] = arg1;
	}
	aClass41_5030.aBoolean682 = false;
    }
    
    public boolean method1784() {
	return (aBoolean5009 && anIntArray5027 != null
		&& aShortArray5041 != null);
    }
    
    public boolean method1920(int arg0, int arg1, int arg2, int arg3, int arg4,
			      int arg5, int arg6, int arg7) {
	if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4)
	    return false;
	if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4)
	    return false;
	if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7)
	    return false;
	if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7)
	    return false;
	return true;
    }
    
    public static void method1921(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, float[] arg6, float arg7,
				  int arg8, float arg9) {
	arg0 -= arg3;
	arg1 -= arg4;
	arg2 -= arg5;
	float f = ((float) arg0 * arg6[0] + (float) arg1 * arg6[1]
		   + (float) arg2 * arg6[2]);
	float f_479_ = ((float) arg0 * arg6[3] + (float) arg1 * arg6[4]
			+ (float) arg2 * arg6[5]);
	float f_480_ = ((float) arg0 * arg6[6] + (float) arg1 * arg6[7]
			+ (float) arg2 * arg6[8]);
	float f_481_
	    = ((float) Math.atan2((double) f, (double) f_480_) / 6.2831855F
	       + 0.5F);
	if (arg7 != 1.0F)
	    f_481_ *= arg7;
	float f_482_ = f_479_ + 0.5F + arg9;
	if (arg8 == 1) {
	    float f_483_ = f_481_;
	    f_481_ = -f_482_;
	    f_482_ = f_483_;
	} else if (arg8 == 2) {
	    f_481_ = -f_481_;
	    f_482_ = -f_482_;
	} else if (arg8 == 3) {
	    float f_484_ = f_481_;
	    f_481_ = f_482_;
	    f_482_ = -f_484_;
	}
	aFloat5064 = f_481_;
	aFloat5060 = f_482_;
    }
    
    static {
	anIntArray5057 = new int[1];
    }
}
