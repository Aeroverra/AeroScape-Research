/* Class14_Sub2_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.lang.ref.SoftReference;

public class Class14_Sub2_Sub18_Sub1 extends Class14_Sub2_Sub18
{
    public SoftReference aSoftReference5071;
    
    public Object method377(boolean arg0) {
	Object object;
	try {
	    if (arg0 != true)
		aSoftReference5071 = null;
	    object = aSoftReference5071.get();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return object;
    }
    
    public boolean method379(byte arg0) {
	boolean bool;
	try {
	    if (arg0 >= -68)
		aSoftReference5071 = null;
	    bool = true;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool;
    }
    
    public Class14_Sub2_Sub18_Sub1(Object arg0) {
	aSoftReference5071 = new SoftReference(arg0);
    }
}
