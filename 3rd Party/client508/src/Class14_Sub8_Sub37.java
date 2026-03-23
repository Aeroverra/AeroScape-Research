/* Class14_Sub8_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub8_Sub37 extends Class14_Sub8
{
    public int anInt4715 = 1;
    public static Class81 aClass81_4716 = new Class81();
    public int anInt4717 = 0;
    public static int anInt4718;
    public static Class124 aClass124_4719
	= Class14_Sub2_Sub2.method263(1178, "Ablegen");
    public static int anInt4720;
    public static boolean aBoolean4721 = false;
    public static int anInt4722;
    public int anInt4723 = 0;
    public static volatile int anInt4724 = -1;
    public static int anInt4725;
    
    public int[] method484(int arg0, byte arg1) {
    while_515_:
	do {
	    int[] is;
	    do {
		int[] is_0_;
		try {
		    anInt4725++;
		    is = aClass149_2851.method2014(arg0, (byte) 124);
		    if (aClass149_2851.aBoolean2402) {
			int i = Class133_Sub5.anIntArray3623[arg0];
			int i_1_ = i + -2048 >> -1938252863;
			for (int i_2_ = 0;
			     ((i_2_ ^ 0xffffffff)
			      > (Class112.anInt1876 ^ 0xffffffff));
			     i_2_++) {
			    int i_3_ = Class14_Sub8_Sub4.anIntArray4145[i_2_];
			    int i_4_ = -2048 + i_3_ >> -1253378143;
			    int i_5_;
			    if (0 == anInt4723)
				i_5_ = (-i + i_3_) * anInt4715;
			    else {
				int i_6_
				    = i_1_ * i_1_ + i_4_ * i_4_ >> -188256468;
				i_5_ = (int) (4096.0
					      * (Math.sqrt
						 ((double) ((float) i_6_
							    / 4096.0F))));
				i_5_ = (int) (3.141592653589793
					      * (double) (i_5_ * anInt4715));
			    }
			    i_5_ -= i_5_ & ~0xfff;
			    if (-1 == (anInt4717 ^ 0xffffffff))
				i_5_ = ((Class14_Sub8_Sub21.anIntArray4435
					 [i_5_ >> 1433489156 & 0xff]) + 4096
					>> 109940225);
			    else if (2 == anInt4717) {
				i_5_ -= 2048;
				if (0 > i_5_)
				    i_5_ = -i_5_;
				i_5_ = 2048 + -i_5_ << -241469727;
			    }
			    is[i_2_] = i_5_;
			}
		    }
		    if (arg1 < -58)
			break;
		    is_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_515_;
		}
		return is_0_;
	    } while (false);
	    int[] is_7_;
	    try {
		is_7_ = is;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is_7_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "vj.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method475(int arg0, int arg1, Class14_Sub10 arg2) {
	try {
	    int i = arg0;
	while_516_:
	    do {
		do {
		    if (-1 != (i ^ 0xffffffff)) {
			if (-2 != (i ^ 0xffffffff)) {
			    if (-4 == (i ^ 0xffffffff))
				break;
			    break while_516_;
			}
		    } else {
			anInt4723 = arg2.method798(-18);
			break while_516_;
		    }
		    anInt4717 = arg2.method798(88);
		    break while_516_;
		} while (false);
		anInt4715 = arg2.method798(arg1 ^ 0x60a7);
	    } while (false);
	    if (arg1 != 24777)
		method472(-89);
	    anInt4720++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vj.F(" + arg0 + ',' + arg1
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method673(boolean arg0) {
    while_518_:
	do {
	while_517_:
	    do {
		do {
		    try {
			aClass81_4716 = null;
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_517_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_4719 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_518_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "vj.B(" + arg0 + ')');
	} while (false);
    }
    
    public void method472(int arg0) {
	try {
	    anInt4718++;
	    if (arg0 != 0)
		aBoolean4721 = false;
	    Class14_Sub2_Sub12.method321(256);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vj.I(" + arg0 + ')');
	}
    }
    
    public Class14_Sub8_Sub37() {
	super(0, true);
    }
}
