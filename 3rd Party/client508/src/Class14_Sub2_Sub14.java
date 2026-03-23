/* Class14_Sub2_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class14_Sub2_Sub14 extends Class14_Sub2
{
    public static int anInt3934;
    public static int anInt3935;
    public static int anInt3936;
    public static int anInt3937;
    public int anInt3938;
    public static int anInt3939;
    public static int anInt3940;
    public int anInt3941 = -1;
    public static Class52 aClass52_3942 = new Class52(64);
    public int anInt3943 = 0;
    public static Class124 aClass124_3944;
    public static Class9 aClass9_3945;
    public static Class124 aClass124_3946
	= Class14_Sub2_Sub2.method263(1178, " more options");
    public static int anInt3947;
    public static Class124 aClass124_3948;
    public static int[] anIntArray3949;
    
    public static void method332(Class94 arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
    while_209_:
	do {
	while_208_:
	    do {
		int i;
		do {
		    try {
			anInt3935++;
			i = arg3 * arg3 - -(arg5 * arg5);
			if (-360001 <= (i ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_208_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (arg2 >= 72)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_208_;
		    }
		    return;
		} while (false);
		try {
		    int i_0_
			= Math.min(arg0.anInt1518 / 2, arg0.anInt1545 / 2);
		    if ((i ^ 0xffffffff) >= (i_0_ * i_0_ ^ 0xffffffff))
			Class100.method1513(arg5, arg1, arg3, arg0,
					    (Class150
					     .aClass14_Sub2_Sub19Array2417
					     [arg4]),
					    256, arg6);
		    else {
			i_0_ -= 10;
			int i_1_
			    = (Class41.anInt696 + Class14_Sub8_Sub19.anInt4408
			       & 0x7ff);
			int i_2_ = Class3.anIntArray111[i_1_];
			i_2_ = 256 * i_2_ / (Class32.anInt551 + 256);
			int i_3_ = Class3.anIntArray108[i_1_];
			i_3_ = i_3_ * 256 / (Class32.anInt551 + 256);
			int i_4_ = arg3 * i_2_ + arg5 * i_3_ >> 1809573424;
			int i_5_ = -(i_3_ * arg3) + i_2_ * arg5 >> -1672671312;
			double d = Math.atan2((double) i_4_, (double) i_5_);
			int i_6_ = (int) (Math.sin(d) * (double) i_0_);
			int i_7_ = (int) (Math.cos(d) * (double) i_0_);
			((Class14_Sub2_Sub19_Sub2)
			 Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013[arg4])
			    .method425
			    (240, 240,
			     (i_6_ + (arg0.anInt1518 / 2 + arg6)) * 16,
			     16 * (-i_7_ + arg0.anInt1545 / 2 + arg1),
			     (int) (d * 10430.378), 4096);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_209_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ml.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	} while (false);
    }
    
    public static void method333(byte arg0, byte arg1) {
	try {
	    if (null == Class28.aByteArrayArrayArray512)
		Class28.aByteArrayArrayArray512 = new byte[4][104][104];
	    anInt3939++;
	    for (int i = 0; -5 < (i ^ 0xffffffff); i++) {
		for (int i_8_ = 0; 104 > i_8_; i_8_++) {
		    for (int i_9_ = 0; -105 < (i_9_ ^ 0xffffffff); i_9_++)
			Class28.aByteArrayArrayArray512[i][i_8_][i_9_] = arg0;
		}
	    }
	    int i = -124 / ((46 - arg1) / 52);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ml.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method334(int arg0) {
	try {
	    aClass9_3945 = null;
	    aClass124_3946 = null;
	    if (arg0 > -96)
		aClass124_3948 = null;
	    aClass52_3942 = null;
	    aClass124_3944 = null;
	    aClass124_3948 = null;
	    anIntArray3949 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ml.F(" + arg0 + ')');
	}
    }
    
    public void finalize() throws Throwable {
	try {
	    if ((anInt3941 ^ 0xffffffff) != 0) {
		Class11.method202(anInt3941, anInt3943, anInt3938);
		anInt3941 = -1;
		anInt3943 = 0;
	    }
	    super.finalize();
	    anInt3937++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ml.finalize()");
	}
    }
    
    public static Class65 method335(int arg0, int arg1) {
    while_210_:
	do {
	    do {
		Class65 class65;
		try {
		    anInt3934++;
		    if (arg0 >= -16)
			aClass9_3945 = null;
		    Class65 class65_10_
			= ((Class65)
			   Class139.aClass52_2229.method1210((byte) 122,
							     (long) arg1));
		    if (class65_10_ == null)
			break;
		    class65 = class65_10_;
		} catch (RuntimeException runtimeexception) {
		    break while_210_;
		}
		return class65;
	    } while (false);
	    Class65 class65;
	    try {
		byte[] is = Class14_Sub17.aClass9_3034.method163(arg1, 1, 0);
		Class65 class65_11_ = new Class65();
		if (is != null)
		    class65_11_.method1288(arg1, (byte) -114,
					   new Class14_Sub10(is));
		Class139.aClass52_2229.method1205((byte) -93, class65_11_,
						  (long) arg1);
		class65 = class65_11_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class65;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ml.E(" + arg0 + ',' + arg1 + ')');
    }
    
    public static Class14_Sub2_Sub16_Sub1 method336(int arg0, byte[] arg1) {
    while_211_:
	do {
	    do {
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1;
		try {
		    anInt3936++;
		    if (null != arg1)
			break;
		    class14_sub2_sub16_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_211_;
		}
		return class14_sub2_sub16_sub1;
	    } while (false);
	    Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1;
	    try {
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1_12_
		    = new Class14_Sub2_Sub16_Sub1(arg1, Class40.anIntArray675,
						  (Class14_Sub2_Sub12
						   .anIntArray3918),
						  Class17.anIntArray402,
						  Class76.anIntArray1204,
						  Class12.aByteArrayArray310);
		if (arg0 != 4)
		    method332(null, 25, -60, -103, 2, 125, 49);
		Class129.method1761((byte) 32);
		class14_sub2_sub16_sub1 = class14_sub2_sub16_sub1_12_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub16_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ml.A(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method337(boolean arg0) {
    while_213_:
	do {
	while_212_:
	    do {
		int i;
		do {
		    try {
			anInt3940++;
			i = Class37.method1111(0);
			if (arg0 == true)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_212_;
		    }
		    return;
		} while (false);
		try {
		    if (0 == (0x1 & i))
			Class121.method1632(anInt3941);
		    if ((i & 0x2) == 0)
			Class121.method1638(0);
		    if (0 == (i & 0x4))
			Class121.method1656(0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_213_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ml.B(" + arg0 + ')');
	} while (false);
    }
    
    public Class14_Sub2_Sub14(int arg0) {
	try {
	    GL gl = Class121.aGL2030;
	    int[] is = new int[1];
	    gl.glGenTextures(1, is, 0);
	    anInt3941 = is[0];
	    anInt3938 = Class11.anInt267;
	    Class121.method1632(anInt3941);
	    int i = Class3.anIntArray119[arg0];
	    byte[] is_13_ = { (byte) (i >> -2001015760),
			      (byte) (i >> 47383624), (byte) i, -1 };
	    ByteBuffer bytebuffer = ByteBuffer.wrap(is_13_);
	    gl.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, bytebuffer);
	    gl.glTexParameteri(3553, 10241, 9729);
	    gl.glTexParameteri(3553, 10240, 9729);
	    Class11.anInt266 += bytebuffer.limit() - anInt3943;
	    anInt3943 = bytebuffer.limit();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ml.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_3944 = Class14_Sub2_Sub2.method263(1178, "headicons_pk");
	aClass124_3948 = aClass124_3946;
	anIntArray3949 = new int[50];
    }
}
