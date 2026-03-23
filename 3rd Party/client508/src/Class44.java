/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class44
{
    public static Class9 aClass9_725;
    public static Class129 aClass129_726;
    public static int anInt727;
    public static Class124 aClass124_728;
    public static Class124 aClass124_729;
    public static Class124 aClass124_730
	= Class14_Sub2_Sub2.method263(1178, "Walk here");
    public static int anInt731;
    public static Class124 aClass124_732
	= Class14_Sub2_Sub2.method263(1178, "sl_arrows");
    public static int anInt733;
    public static int anInt734;
    public static int anInt735;
    
    public static void method1154(int arg0) {
	try {
	    anInt734++;
	    if (arg0 != -10033)
		aClass124_732 = null;
	    System.out.println
		("Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
	    System.exit(1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fb.A(" + arg0 + ')');
	}
    }
    
    public static void method1155(int arg0, int arg1) {
	try {
	    Class20.anInt427 = arg0;
	    Class37.anInt644 = arg1;
	    Class14_Sub18.anInt3050 = -1;
	    Class39.method1126((byte) -22);
	    anInt735++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fb.F(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1156(byte arg0) {
    while_754_:
	do {
	while_753_:
	    do {
		do {
		    try {
			anInt731++;
			if (arg0 < -48)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_753_;
		    }
		    return;
		} while (false);
		try {
		    Class139.aClass52_2229.method1209((byte) -96);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_754_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fb.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1157(byte arg0) {
    while_756_:
	do {
	while_755_:
	    do {
		do {
		    try {
			aClass124_730 = null;
			aClass9_725 = null;
			aClass124_729 = null;
			aClass124_732 = null;
			if (arg0 == 95)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_755_;
		    }
		    return;
		} while (false);
		try {
		    aClass129_726 = null;
		    aClass124_728 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_756_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fb.E(" + arg0 + ')');
	} while (false);
    }
    
    public static int method1158(int arg0, boolean arg1) {
	int i;
	try {
	    anInt727++;
	    if (arg1)
		aClass124_729 = null;
	    i = (arg0 & 0x1f902) >> -1819115541;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fb.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method1159(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  int arg8, int arg9) {
	try {
	    if (arg4 != -13755)
		aClass124_728 = null;
	    anInt733++;
	    if ((arg6 ^ 0xffffffff) == (arg3 ^ 0xffffffff)
		&& (arg8 ^ 0xffffffff) == (arg5 ^ 0xffffffff)
		&& (arg2 ^ 0xffffffff) == (arg7 ^ 0xffffffff) && arg0 == arg9)
		Class14_Sub8_Sub32.method652(arg0, arg4 + 13858, arg2, arg1,
					     arg6, arg5);
	    else {
		int i = arg6;
		int i_0_ = 3 * arg6;
		int i_1_ = 3 * arg5;
		int i_2_ = arg5;
		int i_3_ = arg3 * 3;
		int i_4_ = 3 * arg8;
		int i_5_ = 3 * arg9;
		int i_6_ = arg7 * 3;
		int i_7_ = -i_4_ + i_5_ - (i_4_ + -i_1_);
		int i_8_ = i_0_ + (-i_3_ + -i_3_ + i_6_);
		int i_9_ = -arg5 + (i_4_ + arg0 + -i_5_);
		int i_10_ = -arg6 + (arg2 - (i_6_ + -i_3_));
		int i_11_ = i_3_ - i_0_;
		int i_12_ = -i_1_ + i_4_;
		for (int i_13_ = 128; i_13_ <= 4096; i_13_ += 128) {
		    int i_14_ = i_13_ * i_13_ >> 880371436;
		    int i_15_ = i_14_ * i_13_ >> 1142495980;
		    int i_16_ = i_15_ * i_9_;
		    int i_17_ = i_8_ * i_14_;
		    int i_18_ = i_15_ * i_10_;
		    int i_19_ = i_7_ * i_14_;
		    int i_20_ = i_13_ * i_12_;
		    int i_21_ = i_13_ * i_11_;
		    int i_22_
			= arg5 + (i_19_ + (i_16_ - -i_20_) >> -699797972);
		    int i_23_ = (i_18_ - -i_17_ - -i_21_ >> -754545940) + arg6;
		    Class14_Sub8_Sub32.method652(i_22_, 101, i_23_, arg1, i,
						 i_2_);
		    i = i_23_;
		    i_2_ = i_22_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fb.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ')'));
	}
    }
    
    static {
	aClass124_729 = aClass124_730;
	aClass124_728 = Class14_Sub2_Sub2.method263(1178, "::rebuild");
    }
}
