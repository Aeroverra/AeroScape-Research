/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class11
{
    public static int anInt263;
    public static int anInt264 = 0;
    public static long aLong265;
    public static int anInt266;
    public static int anInt267;
    public static Class2 aClass2_268;
    public static Class2 aClass2_269;
    public static Class2 aClass2_270;
    public static Class2 aClass2_271;
    public static int[] anIntArray272;
    
    public static synchronized void method202(int arg0, int arg1, int arg2) {
	if (arg2 == anInt267) {
	    Class14_Sub1 class14_sub1 = new Class14_Sub1(arg1);
	    class14_sub1.aLong355 = (long) arg0;
	    aClass2_270.method80(class14_sub1, (byte) -126);
	}
    }
    
    public static synchronized void method203() {
	anInt267++;
	aClass2_268.method81((byte) -77);
	aClass2_269.method81((byte) -85);
	aClass2_270.method81((byte) -81);
	aClass2_271.method81((byte) -110);
	anInt264 = 0;
	anInt263 = 0;
	anInt266 = 0;
    }
    
    public static synchronized void method204(int arg0, int arg1, int arg2) {
	if (arg2 == anInt267) {
	    Class14_Sub1 class14_sub1 = new Class14_Sub1(arg1);
	    class14_sub1.aLong355 = (long) arg0;
	    aClass2_268.method80(class14_sub1, (byte) -125);
	}
    }
    
    public static synchronized void method205() {
	GL gl = Class121.aGL2030;
	int i = 0;
	for (;;) {
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass2_268.method78(128);
	    if (class14_sub1 == null)
		break;
	    anIntArray272[i++] = (int) class14_sub1.aLong355;
	    anInt264 -= class14_sub1.anInt2714;
	    if (i == 1000) {
		gl.glDeleteBuffersARB(i, anIntArray272, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    gl.glDeleteBuffersARB(i, anIntArray272, 0);
	    i = 0;
	}
	for (;;) {
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass2_269.method78(128);
	    if (class14_sub1 == null)
		break;
	    anIntArray272[i++] = (int) class14_sub1.aLong355;
	    anInt263 -= class14_sub1.anInt2714;
	    if (i == 1000) {
		gl.glDeleteTextures(i, anIntArray272, 0);
		i = 0;
	    }
	}
	for (;;) {
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass2_270.method78(128);
	    if (class14_sub1 == null)
		break;
	    anIntArray272[i++] = (int) class14_sub1.aLong355;
	    anInt266 -= class14_sub1.anInt2714;
	    if (i == 1000) {
		gl.glDeleteTextures(i, anIntArray272, 0);
		i = 0;
	    }
	}
	if (i > 0) {
	    gl.glDeleteTextures(i, anIntArray272, 0);
	    boolean bool = false;
	}
	for (;;) {
	    Class14_Sub1 class14_sub1
		= (Class14_Sub1) aClass2_271.method78(128);
	    if (class14_sub1 == null)
		break;
	    int i_0_ = (int) class14_sub1.aLong355;
	    gl.glDeleteLists(i_0_, 1);
	}
	if (anInt264 + anInt263 + anInt266 > 100663296
	    && Class84.method1413((byte) 105) > aLong265 + 60000L) {
	    System.gc();
	    aLong265 = Class84.method1413((byte) -43);
	}
    }
    
    public static synchronized void method206(int arg0, int arg1) {
	if (arg1 == anInt267) {
	    Class14_Sub1 class14_sub1 = new Class14_Sub1();
	    class14_sub1.aLong355 = (long) arg0;
	    aClass2_271.method80(class14_sub1, (byte) -124);
	}
    }
    
    public static void method207() {
	aClass2_268 = null;
	aClass2_269 = null;
	aClass2_270 = null;
	aClass2_271 = null;
	anIntArray272 = null;
    }
    
    public static synchronized void method208(int arg0, int arg1, int arg2) {
	if (arg2 == anInt267) {
	    Class14_Sub1 class14_sub1 = new Class14_Sub1(arg1);
	    class14_sub1.aLong355 = (long) arg0;
	    aClass2_269.method80(class14_sub1, (byte) -126);
	}
    }
    
    static {
	anInt263 = 0;
	anInt266 = 0;
	aLong265 = 0L;
	anInt267 = 0;
	aClass2_268 = new Class2();
	aClass2_269 = new Class2();
	aClass2_270 = new Class2();
	aClass2_271 = new Class2();
	anIntArray272 = new int[1000];
    }
}
