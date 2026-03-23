/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class100 implements Runnable
{
    public static int anInt1681 = -1;
    public static Class124 aClass124_1682;
    public static Class124 aClass124_1683;
    public static int anInt1684;
    public static int anInt1685;
    public boolean aBoolean1686 = true;
    public static int anInt1687;
    public Object anObject1688 = new Object();
    public static Class124 aClass124_1689;
    public static Class9_Sub1 aClass9_Sub1_1690;
    public static int anInt1691 = 127;
    public static int anInt1692;
    public static Class124 aClass124_1693;
    public static Class124 aClass124_1694;
    public static int anInt1695;
    public int anInt1696;
    public int[] anIntArray1697 = new int[500];
    public static Class124 aClass124_1698;
    public static int anInt1699;
    public int[] anIntArray1700 = new int[500];
    
    public void run() {
	try {
	    while (aBoolean1686) {
		Object object = anObject1688;
		synchronized (object) {
		    if (-501 < (anInt1696 ^ 0xffffffff)) {
			anIntArray1700[anInt1696]
			    = Class14_Sub8_Sub33.anInt4640;
			anIntArray1697[anInt1696] = Class107.anInt1804;
			anInt1696++;
		    }
		}
		Class14_Sub13.method864(50L, (byte) 64);
	    }
	    anInt1684++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "pg.run()");
	}
    }
    
    public static void method1512(boolean arg0, byte arg1) {
	try {
	    anInt1692++;
	    if (arg1 >= -100)
		aClass124_1682 = null;
	    int i;
	    byte[][] is;
	    if (arg0) {
		is = Class14_Sub2_Sub12.aByteArrayArray3913;
		i = 1;
	    } else {
		i = 4;
		is = Class5.aByteArrayArray139;
	    }
	    int i_0_ = is.length;
	    for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
		int i_2_ = (64 * (Class14_Sub8.anIntArray2858[i_1_] & 0xff)
			    - Class58.anInt947);
		byte[] is_3_ = is[i_1_];
		int i_4_
		    = ((Class14_Sub8.anIntArray2858[i_1_] >> -736799416) * 64
		       + -Class133_Sub6.anInt3676);
		if (is_3_ != null) {
		    Class138.method1946(139);
		    Class14_Sub8_Sub24.method608(8 * Class49.anInt818 - 48,
						 arg0,
						 -48 + 8 * Class129.anInt2133,
						 i_2_, is_3_, i_4_, (byte) 80,
						 (Class14_Sub21
						  .aClass32Array3100));
		}
	    }
	    for (int i_5_ = 0; i_0_ > i_5_; i_5_++) {
		int i_6_
		    = (-Class133_Sub6.anInt3676
		       + (Class14_Sub8.anIntArray2858[i_5_] >> 50658472) * 64);
		byte[] is_7_ = is[i_5_];
		int i_8_ = (64 * (Class14_Sub8.anIntArray2858[i_5_] & 0xff)
			    + -Class58.anInt947);
		if (null == is_7_ && (Class49.anInt818 ^ 0xffffffff) > -801) {
		    Class138.method1946(139);
		    for (int i_9_ = 0; i_9_ < i; i_9_++)
			Class107.method1547(i_9_, i_8_, i_6_, 64, 64, false);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pg.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1513(int arg0, int arg1, int arg2, Class94 arg3,
				  Class14_Sub2_Sub19 arg4, int arg5,
				  int arg6) {
    while_1026_:
	do {
	while_1025_:
	    do {
		do {
		    try {
			anInt1699++;
			if (arg4 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1025_;
		    }
		    return;
		} while (false);
		int i;
		do {
		    try {
			i = (Class14_Sub8_Sub19.anInt4408 - -Class41.anInt696
			     & 0x7ff);
			int i_10_ = arg2 * arg2 + arg0 * arg0;
			int i_11_ = 10 + Math.max(arg3.anInt1518 / 2,
						  arg3.anInt1545 / 2);
			if ((i_10_ ^ 0xffffffff)
			    >= (i_11_ * i_11_ ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1025_;
		    }
		    return;
		} while (false);
		try {
		    int i_12_ = Class3.anIntArray108[i];
		    int i_13_ = Class3.anIntArray111[i];
		    i_13_ = arg5 * i_13_ / (256 + Class32.anInt551);
		    i_12_ = i_12_ * 256 / (Class32.anInt551 - -256);
		    int i_14_ = -(i_12_ * arg2) + i_13_ * arg0 >> -1535847888;
		    int i_15_ = i_12_ * arg0 - -(arg2 * i_13_) >> -1359475728;
		    ((Class14_Sub2_Sub19_Sub2) arg4).method419
			(i_15_ + (arg6 + arg3.anInt1518 / 2
				  - arg4.anInt4034 / 2),
			 arg1 + arg3.anInt1545 / 2 - (i_14_
						      + arg4.anInt4046 / 2),
			 (Class14_Sub2_Sub19_Sub2) arg3.method1476(false,
								   (byte) 61));
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1026_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554
		      (throwable, ("pg.D(" + arg0 + ',' + arg1 + ',' + arg2
				   + ',' + (arg3 != null ? "{...}" : "null")
				   + ',' + (arg4 != null ? "{...}" : "null")
				   + ',' + arg5 + ',' + arg6 + ')'));
	} while (false);
    }
    
    public static int method1514(int arg0, int arg1, int arg2) {
	int i;
	try {
	    anInt1695++;
	    int i_16_ = 0;
	    int i_17_ = 63 % ((30 - arg1) / 34);
	    while ((arg0 ^ 0xffffffff) < -1) {
		arg0--;
		i_16_ = 0x1 & arg2 | i_16_ << 242968321;
		arg2 >>>= 1;
	    }
	    i = i_16_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pg.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public static void method1515(int arg0) {
	try {
	    if (arg0 != -25576)
		method1512(true, (byte) 5);
	    aClass124_1693 = null;
	    aClass124_1683 = null;
	    aClass124_1698 = null;
	    aClass9_Sub1_1690 = null;
	    aClass124_1694 = null;
	    aClass124_1689 = null;
	    aClass124_1682 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pg.B(" + arg0 + ')');
	}
    }
    
    public Class100() {
	anInt1696 = 0;
    }
    
    static {
	anInt1685 = 0;
	aClass124_1698 = Class14_Sub2_Sub2.method263(1178, "scroll:");
	aClass124_1683 = aClass124_1698;
	aClass124_1689
	    = Class14_Sub2_Sub2.method263(1178, "Schrifts-=tze geladen)3");
	aClass124_1682 = aClass124_1698;
	aClass124_1694
	    = Class14_Sub2_Sub2.method263(1178, "Connecting to update server");
	aClass124_1693 = aClass124_1694;
    }
}
