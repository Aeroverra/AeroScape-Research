/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public class Class105
{
    public int anInt1752;
    public int anInt1753;
    public Class145 aClass145_1754;
    public static int[] anIntArray1755;
    public Class93 aClass93_1756;
    public int[] anIntArray1757;
    public Class93 aClass93_1758;
    public Class93 aClass93_1759;
    public int[] anIntArray1760 = { 0, 0, 0, 0, 0 };
    public static int[] anIntArray1761;
    public int anInt1762 = 0;
    public static int[] anIntArray1763 = new int[32768];
    public int[] anIntArray1764;
    public Class93 aClass93_1765;
    public Class93 aClass93_1766;
    public static int[] anIntArray1767;
    public Class93 aClass93_1768;
    public static int[] anIntArray1769;
    public Class93 aClass93_1770;
    public static int[] anIntArray1771;
    public Class93 aClass93_1772;
    public Class93 aClass93_1773;
    public static int[] anIntArray1774;
    public static int[] anIntArray1775;
    public int anInt1776;
    
    public int[] method1536(int arg0, int arg1) {
	Class72.method1321(anIntArray1761, 0, arg0);
	if (arg1 < 10)
	    return anIntArray1761;
	double d = (double) arg0 / ((double) arg1 + 0.0);
	aClass93_1758.method1464();
	aClass93_1770.method1464();
	int i = 0;
	int i_0_ = 0;
	int i_1_ = 0;
	if (aClass93_1765 != null) {
	    aClass93_1765.method1464();
	    aClass93_1756.method1464();
	    i = (int) ((double) (aClass93_1765.anInt1446
				 - aClass93_1765.anInt1444)
		       * 32.768 / d);
	    i_0_ = (int) ((double) aClass93_1765.anInt1444 * 32.768 / d);
	}
	int i_2_ = 0;
	int i_3_ = 0;
	int i_4_ = 0;
	if (aClass93_1759 != null) {
	    aClass93_1759.method1464();
	    aClass93_1768.method1464();
	    i_2_ = (int) ((double) (aClass93_1759.anInt1446
				    - aClass93_1759.anInt1444)
			  * 32.768 / d);
	    i_3_ = (int) ((double) aClass93_1759.anInt1444 * 32.768 / d);
	}
	for (int i_5_ = 0; i_5_ < 5; i_5_++) {
	    if (anIntArray1757[i_5_] != 0) {
		anIntArray1775[i_5_] = 0;
		anIntArray1771[i_5_]
		    = (int) ((double) anIntArray1764[i_5_] * d);
		anIntArray1769[i_5_] = (anIntArray1757[i_5_] << 14) / 100;
		anIntArray1774[i_5_]
		    = (int) ((double) (aClass93_1758.anInt1446
				       - aClass93_1758.anInt1444)
			     * 32.768
			     * Math.pow(1.0057929410678534,
					(double) anIntArray1760[i_5_])
			     / d);
		anIntArray1767[i_5_]
		    = (int) ((double) aClass93_1758.anInt1444 * 32.768 / d);
	    }
	}
	for (int i_6_ = 0; i_6_ < arg0; i_6_++) {
	    int i_7_ = aClass93_1758.method1465(arg0);
	    int i_8_ = aClass93_1770.method1465(arg0);
	    if (aClass93_1765 != null) {
		int i_9_ = aClass93_1765.method1465(arg0);
		int i_10_ = aClass93_1756.method1465(arg0);
		i_7_ += method1539(i_1_, i_10_, aClass93_1765.anInt1441) >> 1;
		i_1_ += (i_9_ * i >> 16) + i_0_;
	    }
	    if (aClass93_1759 != null) {
		int i_11_ = aClass93_1759.method1465(arg0);
		int i_12_ = aClass93_1768.method1465(arg0);
		i_8_
		    = i_8_ * ((method1539(i_4_, i_12_, aClass93_1759.anInt1441)
			       >> 1)
			      + 32768) >> 15;
		i_4_ += (i_11_ * i_2_ >> 16) + i_3_;
	    }
	    for (int i_13_ = 0; i_13_ < 5; i_13_++) {
		if (anIntArray1757[i_13_] != 0) {
		    int i_14_ = i_6_ + anIntArray1771[i_13_];
		    if (i_14_ < arg0) {
			anIntArray1761[i_14_]
			    += method1539(anIntArray1775[i_13_],
					  i_8_ * anIntArray1769[i_13_] >> 15,
					  aClass93_1758.anInt1441);
			anIntArray1775[i_13_]
			    += ((i_7_ * anIntArray1774[i_13_] >> 16)
				+ anIntArray1767[i_13_]);
		    }
		}
	    }
	}
	if (aClass93_1766 != null) {
	    aClass93_1766.method1464();
	    aClass93_1772.method1464();
	    int i_15_ = 0;
	    boolean bool = false;
	    boolean bool_16_ = true;
	    for (int i_17_ = 0; i_17_ < arg0; i_17_++) {
		int i_18_ = aClass93_1766.method1465(arg0);
		int i_19_ = aClass93_1772.method1465(arg0);
		int i_20_;
		if (bool_16_)
		    i_20_ = (aClass93_1766.anInt1444
			     + ((aClass93_1766.anInt1446
				 - aClass93_1766.anInt1444) * i_18_
				>> 8));
		else
		    i_20_ = (aClass93_1766.anInt1444
			     + ((aClass93_1766.anInt1446
				 - aClass93_1766.anInt1444) * i_19_
				>> 8));
		i_15_ += 256;
		if (i_15_ >= i_20_) {
		    i_15_ = 0;
		    bool_16_ = !bool_16_;
		}
		if (bool_16_)
		    anIntArray1761[i_17_] = 0;
	    }
	}
	if (anInt1762 > 0 && anInt1752 > 0) {
	    int i_21_ = (int) ((double) anInt1762 * d);
	    for (int i_22_ = i_21_; i_22_ < arg0; i_22_++)
		anIntArray1761[i_22_]
		    += anIntArray1761[i_22_ - i_21_] * anInt1752 / 100;
	}
	if (aClass145_1754.anIntArray2346[0] > 0
	    || aClass145_1754.anIntArray2346[1] > 0) {
	    aClass93_1773.method1464();
	    int i_23_ = aClass93_1773.method1465(arg0 + 1);
	    int i_24_ = aClass145_1754.method1984(0, (float) i_23_ / 65536.0F);
	    int i_25_ = aClass145_1754.method1984(1, (float) i_23_ / 65536.0F);
	    if (arg0 >= i_24_ + i_25_) {
		int i_26_ = 0;
		int i_27_ = i_25_;
		if (i_27_ > arg0 - i_24_)
		    i_27_ = arg0 - i_24_;
		for (/**/; i_26_ < i_27_; i_26_++) {
		    int i_28_ = (int) (((long) anIntArray1761[i_26_ + i_24_]
					* (long) Class145.anInt2347)
				       >> 16);
		    for (int i_29_ = 0; i_29_ < i_24_; i_29_++)
			i_28_ += (int) (((long) (anIntArray1761
						 [i_26_ + i_24_ - 1 - i_29_])
					 * (long) (Class145.anIntArrayArray2345
						   [0][i_29_]))
					>> 16);
		    for (int i_30_ = 0; i_30_ < i_26_; i_30_++)
			i_28_
			    -= (int) (((long) anIntArray1761[i_26_ - 1 - i_30_]
				       * (long) (Class145.anIntArrayArray2345
						 [1][i_30_]))
				      >> 16);
		    anIntArray1761[i_26_] = i_28_;
		    i_23_ = aClass93_1773.method1465(arg0 + 1);
		}
		i_27_ = 128;
		for (;;) {
		    if (i_27_ > arg0 - i_24_)
			i_27_ = arg0 - i_24_;
		    for (/**/; i_26_ < i_27_; i_26_++) {
			int i_31_
			    = (int) (((long) anIntArray1761[i_26_ + i_24_]
				      * (long) Class145.anInt2347)
				     >> 16);
			for (int i_32_ = 0; i_32_ < i_24_; i_32_++)
			    i_31_
				+= (int) (((long) (anIntArray1761
						   [i_26_ + i_24_ - 1 - i_32_])
					   * (long) (Class145
						     .anIntArrayArray2345[0]
						     [i_32_]))
					  >> 16);
			for (int i_33_ = 0; i_33_ < i_25_; i_33_++)
			    i_31_ -= (int) (((long) (anIntArray1761
						     [i_26_ - 1 - i_33_])
					     * (long) (Class145
						       .anIntArrayArray2345[1]
						       [i_33_]))
					    >> 16);
			anIntArray1761[i_26_] = i_31_;
			i_23_ = aClass93_1773.method1465(arg0 + 1);
		    }
		    if (i_26_ >= arg0 - i_24_)
			break;
		    i_24_
			= aClass145_1754.method1984(0,
						    (float) i_23_ / 65536.0F);
		    i_25_
			= aClass145_1754.method1984(1,
						    (float) i_23_ / 65536.0F);
		    i_27_ += 128;
		}
		for (/**/; i_26_ < arg0; i_26_++) {
		    int i_34_ = 0;
		    for (int i_35_ = i_26_ + i_24_ - arg0; i_35_ < i_24_;
			 i_35_++)
			i_34_ += (int) (((long) (anIntArray1761
						 [i_26_ + i_24_ - 1 - i_35_])
					 * (long) (Class145.anIntArrayArray2345
						   [0][i_35_]))
					>> 16);
		    for (int i_36_ = 0; i_36_ < i_25_; i_36_++)
			i_34_
			    -= (int) (((long) anIntArray1761[i_26_ - 1 - i_36_]
				       * (long) (Class145.anIntArrayArray2345
						 [1][i_36_]))
				      >> 16);
		    anIntArray1761[i_26_] = i_34_;
		    i_23_ = aClass93_1773.method1465(arg0 + 1);
		}
	    }
	}
	for (int i_37_ = 0; i_37_ < arg0; i_37_++) {
	    if (anIntArray1761[i_37_] < -32768)
		anIntArray1761[i_37_] = -32768;
	    if (anIntArray1761[i_37_] > 32767)
		anIntArray1761[i_37_] = 32767;
	}
	return anIntArray1761;
    }
    
    public static void method1537() {
	anIntArray1761 = null;
	anIntArray1763 = null;
	anIntArray1755 = null;
	anIntArray1775 = null;
	anIntArray1771 = null;
	anIntArray1769 = null;
	anIntArray1774 = null;
	anIntArray1767 = null;
    }
    
    public void method1538(Class14_Sub10 arg0) {
	aClass93_1758 = new Class93();
	aClass93_1758.method1467(arg0);
	aClass93_1770 = new Class93();
	aClass93_1770.method1467(arg0);
	int i = arg0.method798(97);
	if (i != 0) {
	    arg0.anInt2908--;
	    aClass93_1765 = new Class93();
	    aClass93_1765.method1467(arg0);
	    aClass93_1756 = new Class93();
	    aClass93_1756.method1467(arg0);
	}
	i = arg0.method798(-100);
	if (i != 0) {
	    arg0.anInt2908--;
	    aClass93_1759 = new Class93();
	    aClass93_1759.method1467(arg0);
	    aClass93_1768 = new Class93();
	    aClass93_1768.method1467(arg0);
	}
	i = arg0.method798(110);
	if (i != 0) {
	    arg0.anInt2908--;
	    aClass93_1766 = new Class93();
	    aClass93_1766.method1467(arg0);
	    aClass93_1772 = new Class93();
	    aClass93_1772.method1467(arg0);
	}
	for (int i_38_ = 0; i_38_ < 10; i_38_++) {
	    int i_39_ = arg0.method818((byte) 42);
	    if (i_39_ == 0)
		break;
	    anIntArray1757[i_38_] = i_39_;
	    anIntArray1760[i_38_] = arg0.method793(-879985848);
	    anIntArray1764[i_38_] = arg0.method818((byte) -90);
	}
	anInt1762 = arg0.method818((byte) -97);
	anInt1752 = arg0.method818((byte) 108);
	anInt1753 = arg0.method784((byte) 119);
	anInt1776 = arg0.method784((byte) 101);
	aClass145_1754 = new Class145();
	aClass93_1773 = new Class93();
	aClass145_1754.method1988(arg0, aClass93_1773);
    }
    
    public int method1539(int arg0, int arg1, int arg2) {
	if (arg2 == 1) {
	    if ((arg0 & 0x7fff) < 16384)
		return arg1;
	    return -arg1;
	}
	if (arg2 == 2)
	    return anIntArray1755[arg0 & 0x7fff] * arg1 >> 14;
	if (arg2 == 3)
	    return ((arg0 & 0x7fff) * arg1 >> 14) - arg1;
	if (arg2 == 4)
	    return anIntArray1763[arg0 / 2607 & 0x7fff] * arg1;
	return 0;
    }
    
    public Class105() {
	anInt1752 = 100;
	anIntArray1757 = new int[] { 0, 0, 0, 0, 0 };
	anIntArray1764 = new int[] { 0, 0, 0, 0, 0 };
	anInt1776 = 0;
	anInt1753 = 500;
    }
    
    static {
	Random random = new Random(0L);
	for (int i = 0; i < 32768; i++)
	    anIntArray1763[i] = (random.nextInt() & 0x2) - 1;
	anIntArray1755 = new int[32768];
	for (int i = 0; i < 32768; i++)
	    anIntArray1755[i]
		= (int) (Math.sin((double) i / 5215.1903) * 16384.0);
	anIntArray1761 = new int[220500];
	anIntArray1767 = new int[5];
	anIntArray1771 = new int[5];
	anIntArray1769 = new int[5];
	anIntArray1775 = new int[5];
	anIntArray1774 = new int[5];
    }
}
