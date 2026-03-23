/* Class129_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class129_Sub1 extends Class129 implements MouseWheelListener
{
    public int anInt3430 = 0;
    
    public synchronized void mouseWheelMoved(MouseWheelEvent arg0) {
	anInt3430 += arg0.getWheelRotation();
    }
    
    public void method1760(int arg0, Component arg1) {
	arg1.addMouseWheelListener(this);
	if (arg0 != -14827)
	    anInt3430 = -10;
    }
    
    public void method1765(boolean arg0, Component arg1) {
	if (arg0 != true)
	    anInt3430 = 123;
	arg1.removeMouseWheelListener(this);
    }
    
    public synchronized int method1763(int arg0) {
	int i;
	try {
	    if (arg0 > -122)
		method1763(-57);
	    int i_0_ = anInt3430;
	    anInt3430 = 0;
	    i = i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return i;
    }
}
