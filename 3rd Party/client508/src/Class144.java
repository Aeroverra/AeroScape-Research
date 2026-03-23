/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class144
{
    public static Object method1982
	(byte arg0, String arg1, Applet arg2, Object[] arg3) throws Throwable {
    while_1265_:
	do {
	    do {
		Object object;
		try {
		    if (arg0 > 83)
			break;
		    object = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1265_;
		}
		return object;
	    } while (false);
	    Object object;
	    try {
		object = JSObject.getWindow(arg2).call(arg1, arg3);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return object;
	} while (false);
	RuntimeException object = new RuntimeException();
	throw object;
    }
    
    public static void method1983(Applet arg0, byte arg1, String arg2)
	throws Throwable {
	if (arg1 <= -26)
	    JSObject.getWindow(arg0).eval(arg2);
    }
}
