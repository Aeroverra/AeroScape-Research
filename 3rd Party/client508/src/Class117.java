/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class117
{
    public int[] anIntArray1935;
    public byte[] aByteArray1936;
    public int[][] anIntArrayArray1937 = new int[6][258];
    public int[] anIntArray1938;
    public int anInt1939;
    public int anInt1940;
    public static Class124 aClass124_1941;
    public int anInt1942;
    public int anInt1943;
    public int anInt1944;
    public static Class124 aClass124_1945;
    public int anInt1946;
    public int anInt1947;
    public static int anInt1948;
    public int anInt1949;
    public int anInt1950;
    public int anInt1951;
    public static int anInt1952;
    public int anInt1953;
    public byte[] aByteArray1954;
    public int[][] anIntArrayArray1955;
    public int[][] anIntArrayArray1956;
    public boolean[] aBooleanArray1957;
    public static int anInt1958;
    public byte[] aByteArray1959;
    public byte aByte1960;
    public static int[] anIntArray1961 = new int[5];
    public byte[] aByteArray1962;
    public int anInt1963;
    public int anInt1964;
    public boolean[] aBooleanArray1965;
    public byte[] aByteArray1966;
    public byte[][] aByteArrayArray1967;
    public int[] anIntArray1968;
    public int[] anIntArray1969;
    public int anInt1970;
    public byte[] aByteArray1971;
    public int anInt1972;
    
    public static void method1600(byte arg0) {
    while_1076_:
	do {
	while_1075_:
	    do {
		do {
		    try {
			aClass124_1941 = null;
			aClass124_1945 = null;
			if (arg0 == 113)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1075_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray1961 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1076_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "sb.A(" + arg0 + ')');
	} while (false);
    }
    
    public static int method1601(Class124 arg0, int arg1) {
    while_1077_:
	do {
	    do {
		int i;
		try {
		    if (arg1 != 6)
			method1602(null, (byte) -19, null);
		    anInt1958++;
		    if (arg0 != null)
			break;
		    i = -1;
		} catch (RuntimeException runtimeexception) {
		    break while_1077_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    while (Class14_Sub2_Sub1.anInt3728 > i) {
		if (arg0.method1717(40, Class14_Sub10.aClass124Array2938[i]))
		    return i;
		try {
		    i++;
		} catch (RuntimeException runtimeexception) {
		    break while_1077_;
		}
	    }
	    return -1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("sb.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method1602(int[] arg0, byte arg1, long[] arg2) {
	try {
	    int i = 27 / ((-66 - arg1) / 47);
	    Class14_Sub8_Sub21.method587(arg2, arg2.length - 1, arg0, false,
					 0);
	    anInt1952++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("sb.B("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class117() {
	aByteArray1936 = new byte[18002];
	anIntArray1935 = new int[256];
	anIntArray1938 = new int[257];
	anIntArrayArray1956 = new int[6][258];
	anInt1950 = 0;
	aBooleanArray1965 = new boolean[256];
	aByteArray1962 = new byte[18002];
	aByteArrayArray1967 = new byte[6][258];
	aBooleanArray1957 = new boolean[16];
	anInt1944 = 0;
	aByteArray1966 = new byte[4096];
	aByteArray1959 = new byte[256];
	anIntArrayArray1955 = new int[6][258];
	anIntArray1969 = new int[6];
	anIntArray1968 = new int[16];
    }
    
    static {
	aClass124_1945
	    = (Class14_Sub2_Sub2.method263
	       (1178,
		"Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3"));
	aClass124_1941 = aClass124_1945;
    }
}
