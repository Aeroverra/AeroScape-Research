/* Class14_Sub8_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub32 extends Class14_Sub8
{
    public int anInt4611 = 3216;
    public static int anInt4612;
    public static int anInt4613;
    public static int anInt4614;
    public static int anInt4615;
    public static int anInt4616 = 0;
    public static int anInt4617;
    public static int[] anIntArray4618 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
    public static int anInt4619;
    public int[] anIntArray4620 = new int[3];
    public int anInt4621 = 3216;
    public static int anInt4622;
    public static int anInt4623;
    public static int anInt4624;
    public int anInt4625 = 4096;
    public static Class124[] aClass124Array4626 = new Class124[100];
    public static int anInt4627;
    
    public void method650(int arg0) {
    while_471_:
	do {
	while_470_:
	    do {
		int i;
		do {
		    try {
			anInt4615++;
			double d
			    = Math.cos((double) ((float) anInt4621 / 4096.0F));
			anIntArray4620[0]
			    = (int) (4096.0
				     * (Math.sin((double) ((float) anInt4611
							   / 4096.0F))
					* d));
			anIntArray4620[1]
			    = (int) (d
				     * Math.cos((double) ((float) anInt4611
							  / 4096.0F))
				     * 4096.0);
			anIntArray4620[2]
			    = (int) (Math.sin((double) ((float) anInt4621
							/ 4096.0F))
				     * 4096.0);
			int i_0_ = (anIntArray4620[2] * anIntArray4620[2]
				    >> -926238004);
			int i_1_ = (anIntArray4620[0] * anIntArray4620[0]
				    >> -98991700);
			int i_2_ = (anIntArray4620[1] * anIntArray4620[1]
				    >> -1186983924);
			i = (int) (Math.sqrt((double) (i_0_ + i_2_ + i_1_
						       >> -1853860468))
				   * 4096.0);
			if (arg0 == -29812)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_470_;
		    }
		    return;
		} while (false);
		try {
		    if (0 != i) {
			anIntArray4620[1]
			    = (anIntArray4620[1] << -214902100) / i;
			anIntArray4620[2]
			    = (anIntArray4620[2] << -1826139092) / i;
			anIntArray4620[0]
			    = (anIntArray4620[0] << -1201829556) / i;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_471_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "rc.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method651(int arg0) {
	try {
	    anIntArray4618 = null;
	    aClass124Array4626 = null;
	    if (arg0 != -28268)
		aClass124Array4626 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rc.B(" + arg0 + ')');
	}
    }
    
    public int[] method484(int arg0, byte arg1) {
	int[] is;
	try {
	    anInt4627++;
	    if (arg1 >= -58)
		method484(-113, (byte) 124);
	    int[] is_3_ = aClass149_2851.method2014(arg0, (byte) 117);
	    if (aClass149_2851.aBoolean2402) {
		int i = anInt4625 * Class79.anInt1288 >> -755695924;
		int[] is_4_
		    = method483(0, (byte) -31, -1 + arg0 & Class115.anInt1927);
		int[] is_5_ = method483(0, (byte) -68, arg0);
		int[] is_6_
		    = method483(0, (byte) -76, arg0 - -1 & Class115.anInt1927);
		for (int i_7_ = 0;
		     (i_7_ ^ 0xffffffff) > (Class112.anInt1876 ^ 0xffffffff);
		     i_7_++) {
		    int i_8_ = (is_6_[i_7_] + -is_4_[i_7_]) * i >> -2046043860;
		    int i_9_
			= (((-is_5_[Class14_Sub10_Sub1.anInt4882 & i_7_ - -1]
			     + is_5_[i_7_ + -1 & Class14_Sub10_Sub1.anInt4882])
			    * i)
			   >> 1327576140);
		    int i_10_ = i_9_ >> -1215087548;
		    if (0 > i_10_)
			i_10_ = -i_10_;
		    if (i_10_ > 255)
			i_10_ = 255;
		    int i_11_ = i_8_ >> 1958202980;
		    if (i_11_ < 0)
			i_11_ = -i_11_;
		    if (-256 > (i_11_ ^ 0xffffffff))
			i_11_ = 255;
		    int i_12_
			= (0xff
			   & (Class14_Sub2_Sub4.aByteArray3794
			      [(i_11_ * (1 + i_11_) >> 512329409) + i_10_]));
		    int i_13_ = i_12_ * 4096 >> 341582600;
		    int i_14_ = i_12_ * i_9_ >> -1344217816;
		    int i_15_ = i_12_ * i_8_ >> -1040548888;
		    i_13_ = anIntArray4620[2] * i_13_ >> -1676660724;
		    i_14_ = anIntArray4620[0] * i_14_ >> 166666572;
		    i_15_ = i_15_ * anIntArray4620[1] >> 555034412;
		    is_3_[i_7_] = i_13_ + i_14_ + i_15_;
		}
	    }
	    is = is_3_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rc.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return is;
    }
    
    public static void method652(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
    while_474_:
	do {
	while_473_:
	    do {
		int i;
		int i_16_;
	    while_472_:
		do {
		    do {
			try {
			    anInt4619++;
			    i = -arg4 + arg2;
			    i_16_ = arg0 + -arg5;
			    if (0 == i)
				break;
			    if (-1 != (i_16_ ^ 0xffffffff))
				break while_472_;
			    Class55.method1226(4, arg4, arg5, arg2, arg3);
			} catch (RuntimeException runtimeexception) {
			    break while_473_;
			}
			return;
		    } while (false);
		    try {
			if (-1 != (i_16_ ^ 0xffffffff))
			    Class79.method1387(arg4, arg3, arg0, arg5, 82);
		    } catch (RuntimeException runtimeexception) {
			break while_473_;
		    }
		    return;
		} while (false);
		try {
		    if (0 > i)
			i = -i;
		    if (0 > i_16_)
			i_16_ = -i_16_;
		    boolean bool = i_16_ > i;
		    if (bool) {
			int i_17_ = arg2;
			int i_18_ = arg4;
			arg4 = arg5;
			arg5 = i_18_;
			arg2 = arg0;
			arg0 = i_17_;
		    }
		    if ((arg2 ^ 0xffffffff) > (arg4 ^ 0xffffffff)) {
			int i_19_ = arg4;
			int i_20_ = arg5;
			arg4 = arg2;
			arg5 = arg0;
			arg2 = i_19_;
			arg0 = i_20_;
		    }
		    if (arg1 < 9)
			anInt4614 = 39;
		    int i_21_ = arg5;
		    int i_22_ = arg0 + -arg5;
		    if ((i_22_ ^ 0xffffffff) > -1)
			i_22_ = -i_22_;
		    int i_23_ = -arg4 + arg2;
		    int i_24_ = -(i_23_ >> -1896230719);
		    int i_25_ = arg5 < arg0 ? 1 : -1;
		    if (!bool) {
			for (int i_26_ = arg4; i_26_ <= arg2; i_26_++) {
			    i_24_ += i_22_;
			    Class14_Sub2_Sub19.anIntArrayArray4038[i_21_]
				[i_26_]
				= arg3;
			    if (0 < i_24_) {
				i_24_ -= i_23_;
				i_21_ += i_25_;
			    }
			}
		    } else {
			for (int i_27_ = arg4; arg2 >= i_27_; i_27_++) {
			    Class14_Sub2_Sub19.anIntArrayArray4038[i_27_]
				[i_21_]
				= arg3;
			    i_24_ += i_22_;
			    if ((i_24_ ^ 0xffffffff) < -1) {
				i_24_ -= i_23_;
				i_21_ += i_25_;
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_474_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("rc.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	} while (false);
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
    while_477_:
	do {
	while_476_:
	    do {
		do {
		    try {
			if (arg1 == 24777)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_476_;
		    }
		    return;
		} while (false);
		try {
		    int i = arg0;
		while_475_:
		    do {
			do {
			    if (-1 != (i ^ 0xffffffff)) {
				if (1 != i) {
				    if (2 == i)
					break;
				    break while_475_;
				}
			    } else {
				anInt4625 = arg2.method784((byte) 118);
				break while_475_;
			    }
			    anInt4611 = arg2.method784((byte) 110);
			    break while_475_;
			} while (false);
			anInt4621 = arg2.method784((byte) 112);
		    } while (false);
		    anInt4617++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_477_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("rc.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public Class14_Sub8_Sub32() {
	super(1, true);
    }
    
    public void method472(int arg0) {
	try {
	    anInt4623++;
	    method650(-29812);
	    if (arg0 != 0)
		method650(84);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rc.I(" + arg0 + ')');
	}
    }
    
    static {
	anInt4612 = 0;
    }
}
