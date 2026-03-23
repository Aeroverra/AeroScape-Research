/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class110
{
    public static int anInt1847;
    public static Class148[] aClass148Array1848;
    public static Class124 aClass124_1849;
    public static Class124 aClass124_1850
	= Class14_Sub2_Sub2.method263(1178, ")2");
    public static int anInt1851;
    public static BigInteger aBigInteger1852;
    public static Class124 aClass124_1853;
    public static int[] anIntArray1854;
    public static Class124 aClass124_1855;
    
    public static void method1574(int arg0, int arg1, int arg2) {
	try {
	    if (arg0 <= 46)
		method1575(false);
	    anInt1847++;
	    Class51 class51 = Class47.method1187(arg2, true);
	    int i = class51.anInt842;
	    int i_0_ = class51.anInt832;
	    int i_1_ = class51.anInt834;
	    int i_2_ = Class1.anIntArray69[-i_0_ + i_1_];
	    if (arg1 < 0 || (arg1 ^ 0xffffffff) < (i_2_ ^ 0xffffffff))
		arg1 = 0;
	    i_2_ <<= i_0_;
	    Class14_Sub9_Sub1.method700(i, -127, (arg1 << i_0_ & i_2_
						  | ((i_2_ ^ 0xffffffff)
						     & (Class14_Sub8_Sub11
							.anIntArray4275[i]))));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qk.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1575(boolean arg0) {
	try {
	    aClass124_1850 = null;
	    aClass148Array1848 = null;
	    aClass124_1849 = null;
	    aClass124_1855 = null;
	    anIntArray1854 = null;
	    aClass124_1853 = null;
	    aBigInteger1852 = null;
	    if (arg0 != true)
		anIntArray1854 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qk.B(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_1849 = Class14_Sub2_Sub2.method263(1178, "Nehmen");
	aBigInteger1852
	    = (new BigInteger
	       ("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083"));
	anIntArray1854 = new int[100];
	aClass124_1855
	    = Class14_Sub2_Sub2.method263(1178, "Loading fonts )2 ");
	aClass124_1853 = aClass124_1855;
    }
}
