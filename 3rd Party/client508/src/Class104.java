/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

public class Class104
{
    public static Random aRandom1732 = new Random();
    public DataInputStream aDataInputStream1733;
    public int anInt1734;
    public Class31 aClass31_1735;
    public static Class124 aClass124_1736;
    public static int[] anIntArray1737;
    public static int anInt1738;
    public static Class124 aClass124_1739
	= Class14_Sub2_Sub2.method263(1178, " ");
    public long aLong1740;
    public static int anInt1741;
    public static int anInt1742;
    public static Class124 aClass124_1743;
    public byte[] aByteArray1744 = new byte[4];
    public static int anInt1745;
    public int anInt1746;
    public byte[] aByteArray1747;
    public static Class124 aClass124_1748;
    public static Class124 aClass124_1749;
    public static Class124 aClass124_1750;
    public int anInt1751;
    
    public static Class124 method1532(int arg0, int arg1) {
    while_1037_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt1745++;
		    if (arg0 != 4)
			aClass124_1739 = null;
		    if (999999999 <= arg1)
			break;
		    class124 = Class83.method1407(75, arg1);
		} catch (RuntimeException runtimeexception) {
		    break while_1037_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124 = Class79.aClass124_1265;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "qd.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public byte[] method1533(byte arg0) throws IOException {
    while_1038_:
	do {
	    do {
		byte[] is;
		try {
		    anInt1742++;
		    if ((aLong1740 ^ 0xffffffffffffffffL)
			> (Class84.method1413((byte) -34)
			   ^ 0xffffffffffffffffL))
			throw new IOException("fdt");
		    if (arg0 == 81)
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1038_;
		}
		return is;
	    } while (false);
	    do {
		byte[] is;
		try {
		    if ((anInt1734 ^ 0xffffffff) == -1) {
			if (-3 == (aClass31_1735.anInt529 ^ 0xffffffff))
			    throw new IOException("fds");
			if (aClass31_1735.anInt529 == 1) {
			    aDataInputStream1733
				= (DataInputStream) aClass31_1735.anObject530;
			    anInt1734 = 1;
			}
		    }
		    if ((anInt1734 ^ 0xffffffff) == -2) {
			int i = aDataInputStream1733.available();
			if (-1 > (i ^ 0xffffffff)) {
			    if ((i + anInt1751 ^ 0xffffffff) < -5)
				i = 4 + -anInt1751;
			    anInt1751
				+= aDataInputStream1733.read(aByteArray1744,
							     anInt1751, i);
			    if (4 == anInt1751) {
				int i_0_ = new Class14_Sub10
					       (aByteArray1744)
					       .method812((byte) -92);
				anInt1734 = 2;
				aByteArray1747 = new byte[i_0_];
			    }
			}
		    }
		    if (anInt1734 != 2)
			break;
		    int i = aDataInputStream1733.available();
		    if (i <= 0)
			break;
		    if (aByteArray1747.length < i - -anInt1746)
			i = -anInt1746 + aByteArray1747.length;
		    anInt1746 += aDataInputStream1733.read(aByteArray1747,
							   anInt1746, i);
		    if (anInt1746 != aByteArray1747.length)
			break;
		    is = aByteArray1747;
		} catch (RuntimeException runtimeexception) {
		    break while_1038_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		is = null;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "qd.B(" + arg0 + ')');
    }
    
    public static int method1534(int arg0, int arg1) {
    while_1039_:
	do {
	    Class51 class51;
	    int i;
	    do {
		int i_1_;
		try {
		    anInt1741++;
		    class51 = Class47.method1187(arg0, true);
		    i = class51.anInt842;
		    if (arg1 >= 77)
			break;
		    i_1_ = 63;
		} catch (RuntimeException runtimeexception) {
		    break while_1039_;
		}
		return i_1_;
	    } while (false);
	    int i_2_;
	    try {
		int i_3_ = class51.anInt832;
		int i_4_ = class51.anInt834;
		int i_5_ = Class1.anIntArray69[i_4_ - i_3_];
		i_2_ = i_5_ & Class14_Sub8_Sub11.anIntArray4275[i] >> i_3_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_2_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "qd.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1535(byte arg0) {
	try {
	    aClass124_1739 = null;
	    aClass124_1736 = null;
	    aRandom1732 = null;
	    aClass124_1743 = null;
	    int i = -58 % ((arg0 - -43) / 41);
	    aClass124_1749 = null;
	    aClass124_1748 = null;
	    aClass124_1750 = null;
	    anIntArray1737 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qd.A(" + arg0 + ')');
	}
    }
    
    public Class104(Class43 arg0, URL arg1) {
	try {
	    aClass31_1735 = arg0.method1147((byte) -109, arg1);
	    anInt1734 = 0;
	    aLong1740 = Class84.method1413((byte) -31) - -30000L;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qd.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_1736 = aClass124_1739;
	aClass124_1749 = Class14_Sub2_Sub2.method263(1178, "yellow:");
	aClass124_1748 = aClass124_1749;
	aClass124_1743 = aClass124_1749;
	aClass124_1750 = Class14_Sub2_Sub2.method263(1178, "<col=80ff00>");
    }
}
