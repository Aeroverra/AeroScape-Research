/* Class152 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class152
{
    public static Class124 aClass124_2432
	= Class14_Sub2_Sub2.method263(1178, ":assistreq:");
    public static BigInteger aBigInteger2433
	= (new BigInteger
	   ("58778699976184461502525193738213253649000149147835990136706041084440742975821"));
    public static int anInt2434;
    public static Class146 aClass146_2435;
    public static int anInt2436;
    public static int anInt2437;
    public static Class2 aClass2_2438 = new Class2();
    public static int anInt2439 = 0;
    public static int anInt2440 = 0;
    
    public static void method2043(int arg0) {
    while_1321_:
	do {
	while_1320_:
	    do {
		do {
		    try {
			aBigInteger2433 = null;
			if (arg0 > 117)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1320_;
		    }
		    return;
		} while (false);
		try {
		    aClass2_2438 = null;
		    aClass124_2432 = null;
		    aClass146_2435 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1321_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "wh.A(" + arg0 + ')');
	} while (false);
    }
    
    public static void method2044(Class9 arg0, byte arg1) {
	try {
	    anInt2437++;
	    arg0.method146(Class76.aClass124_1192, 0);
	    if (arg1 >= -123)
		method2043(77);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wh.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
}
