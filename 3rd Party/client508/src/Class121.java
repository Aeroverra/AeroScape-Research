/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;

public class Class121
{
    public static int anInt2016;
    public static boolean aBoolean2017 = true;
    public static int anInt2018;
    public static int anInt2019;
    public static float[] aFloatArray2020;
    public static boolean aBoolean2021;
    public static int anInt2022;
    public static boolean aBoolean2023;
    public static Class124 aClass124_2024;
    public static float aFloat2025 = 0.09765625F;
    public static boolean aBoolean2026;
    public static boolean aBoolean2027;
    public static float aFloat2028;
    public static boolean aBoolean2029 = false;
    public static GL aGL2030;
    public static String aString2031;
    public static boolean aBoolean2032;
    public static int anInt2033;
    public static int anInt2034;
    public static float aFloat2035;
    public static int anInt2036;
    public static String aString2037;
    public static int anInt2038;
    public static boolean aBoolean2039;
    public static GLContext aGLContext2040;
    public static boolean aBoolean2041;
    public static boolean aBoolean2042;
    public static int anInt2043;
    public static float aFloat2044;
    public static int anInt2045;
    public static boolean aBoolean2046;
    public static int anInt2047;
    public static boolean aBoolean2048;
    public static GLDrawable aGLDrawable2049;
    public static boolean aBoolean2050;
    public static boolean aBoolean2051;
    public static float aFloat2052;
    
    public static void method1620() {
	Class132.method1778(0, (byte) 118, 0);
	method1648();
	method1638(5);
	method1656(0);
	method1639(false);
	method1652(false);
	method1626(false);
	method1651();
    }
    
    public static int method1621(Canvas arg0, int arg1) {
	if (!arg0.isDisplayable())
	    throw new IllegalStateException("Supplied canvas not on screen");
	GLCapabilities glcapabilities = new GLCapabilities();
	if (arg1 > 0) {
	    glcapabilities.setSampleBuffers(true);
	    glcapabilities.setNumSamples(arg1);
	}
	GLDrawableFactory gldrawablefactory = GLDrawableFactory.getFactory();
	aGLDrawable2049
	    = gldrawablefactory.getGLDrawable(arg0, glcapabilities, null);
	aGLDrawable2049.setRealized(true);
	for (/**/; true; Class14_Sub13.method864(1000L, (byte) 64)) {
	    aGLContext2040 = aGLDrawable2049.createContext(null);
	    try {
		int i = aGLContext2040.makeCurrent();
		if (i == 0)
		    continue;
	    } catch (Exception exception) {
		continue;
	    }
	    break;
	}
	aGL2030 = aGLContext2040.getGL();
	new GLU();
	anInt2033 = arg0.getSize().width;
	anInt2034 = arg0.getSize().height;
	if (!aBoolean2041) {
	    int i = method1636();
	    if (i != 0)
		return i;
	    aBoolean2041 = true;
	}
	method1650();
	method1643();
	aGL2030.glClear(16384);
	int i = 0;
	while (i < 10) {
	    try {
		aGLDrawable2049.swapBuffers();
		break;
	    } catch (Exception exception) {
		Class14_Sub13.method864(100L, (byte) 64);
		i++;
	    }
	}
	aGL2030.glClear(16384);
	return 0;
    }
    
    public static void method1622() {
	Class132.method1778(0, (byte) 1, 0);
	method1648();
	method1638(1);
	method1656(1);
	method1639(false);
	method1652(false);
	method1626(false);
	method1651();
    }
    
    public static void method1623() {
	Class132.method1778(0, (byte) -50, 0);
	method1648();
	method1638(0);
	method1656(0);
	method1639(false);
	method1652(false);
	method1626(false);
	method1651();
    }
    
    public static float method1624() {
	return aFloat2044;
    }
    
    public static void method1625() {
	aGL2030.glDepthMask(true);
    }
    
    public static void method1626(boolean arg0) {
	if (arg0 != aBoolean2017) {
	    if (arg0)
		aGL2030.glEnable(2912);
	    else
		aGL2030.glDisable(2912);
	    aBoolean2017 = arg0;
	}
    }
    
    public static void method1627() {
	int[] is = new int[2];
	aGL2030.glGetIntegerv(3073, is, 0);
	aGL2030.glGetIntegerv(3074, is, 1);
	aGL2030.glDrawBuffer(1026);
	aGL2030.glReadBuffer(1024);
	method1632(-1);
	aGL2030.glPushAttrib(8192);
	aGL2030.glDisable(2912);
	aGL2030.glDisable(3042);
	aGL2030.glDisable(2929);
	aGL2030.glDisable(3008);
	aGL2030.glRasterPos2i(0, 0);
	aGL2030.glCopyPixels(0, 0, anInt2033, anInt2034, 6144);
	aGL2030.glPopAttrib();
	aGL2030.glDrawBuffer(is[0]);
	aGL2030.glReadBuffer(is[1]);
    }
    
    public static void method1628(int arg0, int arg1) {
	anInt2033 = arg0;
	anInt2034 = arg1;
	aBoolean2029 = false;
    }
    
    public static void method1629() {
	aGL2030.glClear(256);
    }
    
    public static void method1630() {
	if (aGLContext2040 != null) {
	    if (GLContext.getCurrent() == aGLContext2040)
		aGLContext2040.release();
	    aGLContext2040.destroy();
	    aGLContext2040 = null;
	}
	if (aGLDrawable2049 != null) {
	    aGLDrawable2049.setRealized(false);
	    aGLDrawable2049 = null;
	}
    }
    
    public static void method1631(int arg0) {
	aGL2030.glClearColor((float) (arg0 >> 16 & 0xff) / 255.0F,
			     (float) (arg0 >> 8 & 0xff) / 255.0F,
			     (float) (arg0 & 0xff) / 255.0F, 0.0F);
	aGL2030.glClear(16640);
    }
    
    public static void method1632(int arg0) {
	if (arg0 != anInt2036) {
	    if (arg0 != -1) {
		if (anInt2036 == -1)
		    aGL2030.glEnable(3553);
		aGL2030.glBindTexture(3553, arg0);
	    } else
		aGL2030.glDisable(3553);
	    anInt2036 = arg0;
	}
    }
    
    public static Class124 method1633(String arg0) {
	byte[] is;
	try {
	    is = arg0.getBytes("ISO-8859-1");
	} catch (UnsupportedEncodingException unsupportedencodingexception) {
	    is = arg0.getBytes();
	}
	return Class14.method231((byte) 120, is.length, is, 0);
    }
    
    public static void method1634(boolean arg0) {
	if (arg0 != aBoolean2027) {
	    if (arg0)
		aGL2030.glEnableClientState(32885);
	    else
		aGL2030.glDisableClientState(32885);
	    aBoolean2027 = arg0;
	}
    }
    
    public static void method1635(float arg0, float arg1) {
	if (!aBoolean2029 && (arg0 != aFloat2052 || arg1 != aFloat2044)) {
	    aFloat2052 = arg0;
	    aFloat2044 = arg1;
	    if (arg1 != 0.0F) {
		float f = arg0 / (arg1 + arg0);
		float f_0_ = f * f;
		float f_1_ = -aFloat2035 * (1.0F - f) * (1.0F - f) / arg1;
		aFloatArray2020[10] = aFloat2028 + f_1_;
		aFloatArray2020[14] = aFloat2035 * f_0_;
	    } else {
		aFloatArray2020[10] = aFloat2028;
		aFloatArray2020[14] = aFloat2035;
	    }
	    aGL2030.glMatrixMode(5889);
	    aGL2030.glLoadMatrixf(aFloatArray2020, 0);
	    aGL2030.glMatrixMode(5888);
	}
    }
    
    public static int method1636() {
	int i = 0;
	aString2031 = aGL2030.glGetString(7936);
	aString2037 = aGL2030.glGetString(7937);
	String string = aString2031.toLowerCase();
	if (string.indexOf("microsoft") != -1)
	    i |= 0x1;
	if (string.indexOf("brian paul") != -1 || string.indexOf("mesa") != -1)
	    i |= 0x1;
	String string_2_ = aGL2030.glGetString(7938);
	String[] strings = string_2_.split("[. ]");
	if (strings.length >= 2) {
	    try {
		int i_3_ = Integer.parseInt(strings[0]);
		int i_4_ = Integer.parseInt(strings[1]);
		anInt2018 = i_3_ * 10 + i_4_;
	    } catch (NumberFormatException numberformatexception) {
		i |= 0x4;
	    }
	} else
	    i |= 0x4;
	if (anInt2018 < 12)
	    i |= 0x2;
	if (!aGL2030.isExtensionAvailable("GL_ARB_multitexture"))
	    i |= 0x8;
	if (!aGL2030.isExtensionAvailable("GL_ARB_texture_env_combine"))
	    i |= 0x20;
	int[] is = new int[1];
	aGL2030.glGetIntegerv(34018, is, 0);
	anInt2019 = is[0];
	aGL2030.glGetIntegerv(34929, is, 0);
	anInt2043 = is[0];
	aGL2030.glGetIntegerv(34930, is, 0);
	anInt2047 = is[0];
	if (anInt2019 < 2 || anInt2043 < 2 || anInt2047 < 2)
	    i |= 0x10;
	if (i != 0)
	    return i;
	aBoolean2046 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
	aBoolean2021
	    = aGL2030.isExtensionAvailable("GL_ARB_vertex_buffer_object");
	aBoolean2050 = aGL2030.isExtensionAvailable("GL_ARB_multisample");
	aBoolean2026 = aGL2030.isExtensionAvailable("GL_ARB_texture_cube_map");
	aBoolean2048 = aGL2030.isExtensionAvailable("GL_ARB_vertex_program");
	aBoolean2042 = aGL2030.isExtensionAvailable("GL_EXT_texture3D");
	Class124 class124 = method1633(aString2037).method1716((byte) 63);
	if (class124.method1700(-19928, aClass124_2024) != -1) {
	    int i_5_ = 0;
	    Class124[] class124s
		= class124.method1665(14, 47, 32).method1719(32, -88);
	    for (int i_6_ = 0; i_6_ < class124s.length; i_6_++) {
		Class124 class124_7_ = class124s[i_6_];
		if (class124_7_.method1693(0) >= 4
		    && class124_7_.method1697(0, 4, (byte) -104)
			   .method1701(119)) {
		    i_5_ = class124_7_.method1697(0, 4, (byte) -104)
			       .method1702(80);
		    break;
		}
	    }
	    if (i_5_ >= 7000 && i_5_ <= 7999)
		aBoolean2021 = false;
	    if (i_5_ >= 7000 && i_5_ <= 9250)
		aBoolean2042 = false;
	    aBoolean2051 = aBoolean2021;
	}
	return 0;
    }
    
    public static void method1637() {
	Class132.method1778(0, (byte) 110, 0);
	method1648();
	method1632(-1);
	method1639(false);
	method1652(false);
	method1626(false);
	method1651();
    }
    
    public static void method1638(int arg0) {
	if (arg0 != anInt2016) {
	    if (arg0 == 0)
		aGL2030.glTexEnvi(8960, 34161, 8448);
	    if (arg0 == 1)
		aGL2030.glTexEnvi(8960, 34161, 7681);
	    if (arg0 == 2)
		aGL2030.glTexEnvi(8960, 34161, 260);
	    if (arg0 == 3)
		aGL2030.glTexEnvi(8960, 34161, 34023);
	    if (arg0 == 4)
		aGL2030.glTexEnvi(8960, 34161, 34164);
	    if (arg0 == 5)
		aGL2030.glTexEnvi(8960, 34161, 34165);
	    anInt2016 = arg0;
	}
    }
    
    public static void method1639(boolean arg0) {
	if (arg0 != aBoolean2023) {
	    if (arg0)
		aGL2030.glEnable(2896);
	    else
		aGL2030.glDisable(2896);
	    aBoolean2023 = arg0;
	}
    }
    
    public static void method1640(float arg0) {
	method1635(3000.0F, arg0 * 1.5F);
    }
    
    public static void method1641(float arg0, float arg1, float arg2) {
	aGL2030.glMatrixMode(5890);
	if (aBoolean2039)
	    aGL2030.glLoadIdentity();
	aGL2030.glTranslatef(arg0, arg1, arg2);
	aGL2030.glMatrixMode(5888);
	aBoolean2039 = true;
    }
    
    public static void method1642(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	int i = -arg0;
	int i_8_ = anInt2033 - arg0;
	int i_9_ = -arg1;
	int i_10_ = anInt2034 - arg1;
	aGL2030.glMatrixMode(5889);
	aGL2030.glLoadIdentity();
	float f = (float) arg2 / 512.0F;
	float f_11_ = f * (256.0F / (float) arg4);
	float f_12_ = f * (256.0F / (float) arg5);
	aGL2030.glOrtho((double) ((float) i * f_11_),
			(double) ((float) i_8_ * f_11_),
			(double) ((float) -i_10_ * f_12_),
			(double) ((float) -i_9_ * f_12_), (double) (50 - arg3),
			(double) (3584 - arg3));
	aGL2030.glViewport(0, 0, anInt2033, anInt2034);
	aGL2030.glMatrixMode(5888);
	aGL2030.glLoadIdentity();
	aGL2030.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
	aBoolean2029 = false;
    }
    
    public static void method1643() {
	aBoolean2029 = false;
	aGL2030.glDisable(3553);
	anInt2036 = -1;
	aGL2030.glTexEnvi(8960, 8704, 34160);
	aGL2030.glTexEnvi(8960, 34161, 8448);
	anInt2016 = 0;
	aGL2030.glTexEnvi(8960, 34162, 8448);
	anInt2022 = 0;
	aGL2030.glEnable(2896);
	aGL2030.glEnable(2912);
	aGL2030.glEnable(2929);
	aBoolean2023 = true;
	aBoolean2032 = true;
	aBoolean2017 = true;
	Class14_Sub8_Sub39_Sub1.method685(-53);
	aGL2030.glActiveTexture(33985);
	aGL2030.glTexEnvi(8960, 8704, 34160);
	aGL2030.glTexEnvi(8960, 34161, 8448);
	aGL2030.glTexEnvi(8960, 34162, 8448);
	aGL2030.glActiveTexture(33984);
	aGL2030.setSwapInterval(0);
	aGL2030.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
	aGL2030.glShadeModel(7425);
	aGL2030.glClearDepth(1.0);
	aGL2030.glDepthFunc(515);
	method1625();
	aGL2030.glMatrixMode(5890);
	aGL2030.glLoadIdentity();
	aGL2030.glPolygonMode(1028, 6914);
	aGL2030.glEnable(2884);
	aGL2030.glCullFace(1029);
	aGL2030.glEnable(3042);
	aGL2030.glBlendFunc(770, 771);
	aGL2030.glEnable(3008);
	aGL2030.glAlphaFunc(516, 0.0F);
	aGL2030.glEnableClientState(32884);
	aGL2030.glEnableClientState(32885);
	aBoolean2027 = true;
	aGL2030.glEnableClientState(32886);
	aGL2030.glEnableClientState(32888);
	aGL2030.glMatrixMode(5888);
	aGL2030.glLoadIdentity();
	Class57.method1253();
	Class10.method194();
    }
    
    public static void method1644(int arg0, int arg1, int arg2, int arg3) {
	method1647(0, 0, anInt2033, anInt2034, arg0, arg1, 0.0F, 0.0F, arg2,
		   arg3);
    }
    
    public static void method1645() {
	if (Class7_Sub1.aBoolean2661) {
	    method1639(true);
	    method1634(true);
	} else {
	    method1639(false);
	    method1634(false);
	}
    }
    
    public static void method1646() {
	aGL2030.glDepthMask(false);
    }
    
    public static void method1647(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, float arg6, float arg7,
				  int arg8, int arg9) {
	int i = (arg0 - arg4 << 8) / arg8;
	int i_13_ = (arg0 + arg2 - arg4 << 8) / arg8;
	int i_14_ = (arg1 - arg5 << 8) / arg9;
	int i_15_ = (arg1 + arg3 - arg5 << 8) / arg9;
	aGL2030.glMatrixMode(5889);
	aGL2030.glLoadIdentity();
	method1649((float) i * aFloat2025, (float) i_13_ * aFloat2025,
		   (float) -i_15_ * aFloat2025, (float) -i_14_ * aFloat2025,
		   50.0F, 3584.0F);
	aGL2030.glViewport(arg0, anInt2034 - arg1 - arg3, arg2, arg3);
	aGL2030.glMatrixMode(5888);
	aGL2030.glLoadIdentity();
	aGL2030.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
	if (arg6 != 0.0F)
	    aGL2030.glRotatef(arg6, 1.0F, 0.0F, 0.0F);
	if (arg7 != 0.0F)
	    aGL2030.glRotatef(arg7, 0.0F, 1.0F, 0.0F);
	aBoolean2029 = false;
	Class20.anInt425 = i;
	Class14_Sub8_Sub27.anInt4547 = i_13_;
	Class58.anInt948 = i_14_;
	Class70.anInt1081 = i_15_;
    }
    
    public static void method1648() {
	if (!aBoolean2029) {
	    aGL2030.glMatrixMode(5889);
	    aGL2030.glLoadIdentity();
	    aGL2030.glOrtho(0.0, (double) anInt2033, 0.0, (double) anInt2034,
			    -1.0, 1.0);
	    aGL2030.glViewport(0, 0, anInt2033, anInt2034);
	    aGL2030.glMatrixMode(5888);
	    aGL2030.glLoadIdentity();
	    aBoolean2029 = true;
	}
    }
    
    public static void method1649(float arg0, float arg1, float arg2,
				  float arg3, float arg4, float arg5) {
	float f = arg4 * 2.0F;
	aFloatArray2020[0] = f / (arg1 - arg0);
	aFloatArray2020[1] = 0.0F;
	aFloatArray2020[2] = 0.0F;
	aFloatArray2020[3] = 0.0F;
	aFloatArray2020[4] = 0.0F;
	aFloatArray2020[5] = f / (arg3 - arg2);
	aFloatArray2020[6] = 0.0F;
	aFloatArray2020[7] = 0.0F;
	aFloatArray2020[8] = (arg1 + arg0) / (arg1 - arg0);
	aFloatArray2020[9] = (arg3 + arg2) / (arg3 - arg2);
	aFloatArray2020[10] = aFloat2028 = -(arg5 + arg4) / (arg5 - arg4);
	aFloatArray2020[11] = -1.0F;
	aFloatArray2020[12] = 0.0F;
	aFloatArray2020[13] = 0.0F;
	aFloatArray2020[14] = aFloat2035 = -(f * arg5) / (arg5 - arg4);
	aFloatArray2020[15] = 0.0F;
	aGL2030.glLoadMatrixf(aFloatArray2020, 0);
	aFloat2052 = 0.0F;
	aFloat2044 = 0.0F;
    }
    
    public static void method1650() {
	int[] is = new int[1];
	aGL2030.glGenTextures(1, is, 0);
	anInt2038 = is[0];
	aGL2030.glBindTexture(3553, anInt2038);
	aGL2030.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121,
			     IntBuffer.wrap(new int[] { -1 }));
	Class26.method1022(-124);
    }
    
    public static void method1651() {
	if (aBoolean2039) {
	    aGL2030.glMatrixMode(5890);
	    aGL2030.glLoadIdentity();
	    aGL2030.glMatrixMode(5888);
	    aBoolean2039 = false;
	}
    }
    
    public static void method1652(boolean arg0) {
	if (arg0 != aBoolean2032) {
	    if (arg0)
		aGL2030.glEnable(2929);
	    else
		aGL2030.glDisable(2929);
	    aBoolean2032 = arg0;
	}
    }
    
    public static float method1653() {
	return aFloat2052;
    }
    
    public static void method1654() {
	aClass124_2024 = null;
	aString2037 = null;
	aString2031 = null;
	aGL2030 = null;
	aGLDrawable2049 = null;
	aGLContext2040 = null;
	aFloatArray2020 = null;
    }
    
    public static void method1655() {
	Class132.method1778(0, (byte) 120, 0);
	method1648();
	method1638(0);
	method1656(0);
	method1639(false);
	method1652(false);
	method1626(false);
	method1651();
    }
    
    public static void method1656(int arg0) {
	if (arg0 != anInt2022) {
	    if (arg0 == 0)
		aGL2030.glTexEnvi(8960, 34162, 8448);
	    if (arg0 == 1)
		aGL2030.glTexEnvi(8960, 34162, 7681);
	    if (arg0 == 2)
		aGL2030.glTexEnvi(8960, 34162, 260);
	    anInt2022 = arg0;
	}
    }
    
    public static void method1657() {
	try {
	    aGLDrawable2049.swapBuffers();
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    static {
	anInt2016 = 0;
	aClass124_2024 = Class14_Sub2_Sub2.method263(1178, "radeon");
	aBoolean2023 = true;
	aBoolean2039 = false;
	aFloatArray2020 = new float[16];
	anInt2045 = 0;
	anInt2022 = 0;
	aFloat2044 = 0.0F;
	aBoolean2041 = false;
	aBoolean2032 = true;
	aBoolean2027 = true;
	anInt2036 = -1;
	aFloat2052 = 0.0F;
    }
}
