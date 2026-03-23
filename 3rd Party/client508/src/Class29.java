/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class29
{
    public int anInt517;
    public int anInt518 = 0;
    public boolean aBoolean519;
    public int anInt520 = -1;
    
    public void method1051(ByteBuffer arg0) {
	GL gl = Class121.aGL2030;
	gl.glBindBufferARB(34962, anInt520);
	gl.glBufferDataARB(34962, arg0.limit(), arg0,
			   aBoolean519 ? 35040 : 35044);
	Class11.anInt264 += arg0.limit() - anInt518;
	anInt518 = arg0.limit();
    }
    
    public void method1052(ByteBuffer arg0) {
	if (arg0.limit() <= anInt518) {
	    GL gl = Class121.aGL2030;
	    gl.glBindBufferARB(34962, anInt520);
	    gl.glBufferSubDataARB(34962, 0, arg0.limit(), arg0);
	} else
	    method1051(arg0);
    }
    
    public void method1053() {
	GL gl = Class121.aGL2030;
	gl.glBindBufferARB(34962, anInt520);
    }
    
    public Class29() {
	this(false);
    }
    
    public void finalize() throws Throwable {
	if (anInt520 != -1) {
	    Class11.method204(anInt520, anInt518, anInt517);
	    anInt520 = -1;
	    anInt518 = 0;
	}
	super.finalize();
    }
    
    public void method1054(ByteBuffer arg0) {
	GL gl = Class121.aGL2030;
	gl.glBindBufferARB(34963, anInt520);
	gl.glBufferDataARB(34963, arg0.limit(), arg0,
			   aBoolean519 ? 35040 : 35044);
	Class11.anInt264 += arg0.limit() - anInt518;
	anInt518 = arg0.limit();
    }
    
    public void method1055() {
	GL gl = Class121.aGL2030;
	gl.glBindBufferARB(34963, anInt520);
    }
    
    public Class29(boolean arg0) {
	GL gl = Class121.aGL2030;
	int[] is = new int[1];
	gl.glGenBuffersARB(1, is, 0);
	aBoolean519 = arg0;
	anInt520 = is[0];
	anInt517 = Class11.anInt267;
    }
}
