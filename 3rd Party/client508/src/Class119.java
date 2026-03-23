/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class119
{
    public static int anInt1990;
    public static int[] anIntArray1991 = null;
    public static ByteBuffer aByteBuffer1992;
    public static int anInt1993 = -1;
    public static int[] anIntArray1994;
    public static ByteBuffer aByteBuffer1995;
    public static boolean aBoolean1996;
    
    public static void method1609() {
	if (anInt1993 != -1) {
	    GL gl = Class121.aGL2030;
	    int[] is = { anInt1993 };
	    gl.glDeleteTextures(1, is, 0);
	    anInt1993 = -1;
	    Class11.anInt266 -= aByteBuffer1992.limit() * 2;
	}
	if (anIntArray1994 != null) {
	    GL gl = Class121.aGL2030;
	    gl.glDeleteTextures(64, anIntArray1994, 0);
	    anIntArray1994 = null;
	    Class11.anInt266 -= aByteBuffer1992.limit() * 2;
	}
	if (anInt1990 != -1) {
	    GL gl = Class121.aGL2030;
	    int[] is = { anInt1990 };
	    gl.glDeleteTextures(1, is, 0);
	    anInt1990 = -1;
	    Class11.anInt266 -= aByteBuffer1995.limit() * 2;
	}
	if (anIntArray1991 != null) {
	    GL gl = Class121.aGL2030;
	    gl.glDeleteTextures(64, anIntArray1991, 0);
	    anIntArray1991 = null;
	    Class11.anInt266 -= aByteBuffer1995.limit() * 2;
	}
    }
    
    public static void method1610() {
	GL gl = Class121.aGL2030;
	if (aBoolean1996) {
	    int[] is = new int[1];
	    gl.glGenTextures(1, is, 0);
	    gl.glBindTexture(32879, is[0]);
	    aByteBuffer1995.position(0);
	    gl.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121,
			    aByteBuffer1995);
	    gl.glTexParameteri(32879, 10241, 9729);
	    gl.glTexParameteri(32879, 10240, 9729);
	    anInt1990 = is[0];
	    Class11.anInt266 += aByteBuffer1995.limit() * 2;
	} else {
	    anIntArray1991 = new int[64];
	    gl.glGenTextures(64, anIntArray1991, 0);
	    for (int i = 0; i < 64; i++) {
		Class121.method1632(anIntArray1991[i]);
		aByteBuffer1995.position(i * 64 * 64 * 2);
		gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121,
				aByteBuffer1995);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
	    }
	    Class11.anInt266 += aByteBuffer1995.limit() * 2;
	}
    }
    
    public static void method1611() {
	GL gl = Class121.aGL2030;
	if (aBoolean1996) {
	    int[] is = new int[1];
	    gl.glGenTextures(1, is, 0);
	    gl.glBindTexture(32879, is[0]);
	    aByteBuffer1992.position(0);
	    gl.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121,
			    aByteBuffer1992);
	    gl.glTexParameteri(32879, 10241, 9729);
	    gl.glTexParameteri(32879, 10240, 9729);
	    anInt1993 = is[0];
	    Class11.anInt266 += aByteBuffer1992.limit() * 2;
	} else {
	    anIntArray1994 = new int[64];
	    gl.glGenTextures(64, anIntArray1994, 0);
	    for (int i = 0; i < 64; i++) {
		Class121.method1632(anIntArray1994[i]);
		aByteBuffer1992.position(i * 64 * 64 * 2);
		gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121,
				aByteBuffer1992);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
	    }
	    Class11.anInt266 += aByteBuffer1992.limit() * 2;
	}
    }
    
    public static void method1612() {
	aBoolean1996 = Class121.aBoolean2042;
	if (aByteBuffer1992 == null) {
	    Class26_Sub2_Sub1 class26_sub2_sub1 = new Class26_Sub2_Sub1();
	    byte[] is;
	    if (aBoolean1996)
		is = class26_sub2_sub1.method1033(128, 128, 32);
	    else
		is = class26_sub2_sub1.method1033(64, 64, 64);
	    aByteBuffer1992 = ByteBuffer.allocateDirect(is.length);
	    aByteBuffer1992.position(0);
	    aByteBuffer1992.put(is);
	    aByteBuffer1992.flip();
	}
	if (aByteBuffer1995 == null) {
	    Class26_Sub1_Sub1 class26_sub1_sub1 = new Class26_Sub1_Sub1();
	    byte[] is;
	    if (aBoolean1996)
		is = class26_sub1_sub1.method1029(128, 128, 32);
	    else
		is = class26_sub1_sub1.method1029(64, 64, 64);
	    aByteBuffer1995 = ByteBuffer.allocateDirect(is.length);
	    aByteBuffer1995.position(0);
	    aByteBuffer1995.put(is);
	    aByteBuffer1995.flip();
	}
	method1611();
	method1610();
    }
    
    public static void method1613() {
	anIntArray1994 = null;
	anIntArray1991 = null;
	aByteBuffer1992 = null;
	aByteBuffer1995 = null;
    }
    
    static {
	anInt1990 = -1;
	anIntArray1994 = null;
    }
}
