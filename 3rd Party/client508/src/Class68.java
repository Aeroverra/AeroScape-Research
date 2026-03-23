/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class68
{
    public static int anInt1061;
    public static int anInt1062;
    public static int anInt1063;
    public static Class124 aClass124_1064
	= Class14_Sub2_Sub2.method263(1178, " )2> <col=ffffff>");
    public static int anInt1065;
    
    public static int method1303(byte[] arg0, int arg1, int arg2) {
	int i;
	try {
	    if (arg1 != 0)
		aClass124_1064 = null;
	    anInt1061++;
	    i = Class14_Sub2_Sub20.method427(arg0, (byte) 82, arg2, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ik.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
	return i;
    }
    
    public static void method1304(int arg0, int arg1) {
	try {
	    anInt1065++;
	    Class14_Sub25.aFloatArray3171[2]
		= (float) Class14_Sub8_Sub26.method617(arg1, 255) / 255.0F;
	    Class14_Sub25.aFloatArray3171[1]
		= (float) Class14_Sub8_Sub26.method617(arg1 >> 1175159912,
						       255) / 255.0F;
	    if (arg0 < 2)
		method1304(-16, 8);
	    Class14_Sub25.aFloatArray3171[0]
		= (float) (Class14_Sub8_Sub26.method617(arg1, 16745398)
			   >> 1169075920) / 255.0F;
	    Class98.method1494(3, -5651);
	    Class98.method1494(4, -5651);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ik.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1305(int arg0, int arg1, int arg2, Class79 arg3,
				  int arg4, int arg5, int arg6, int arg7,
				  byte arg8) {
	try {
	    anInt1063++;
	    int i = 0x3 & arg1;
	    int i_0_;
	    int i_1_;
	    if (1 == i || (i ^ 0xffffffff) == -4) {
		i_0_ = arg3.anInt1227;
		i_1_ = arg3.anInt1245;
	    } else {
		i_0_ = arg3.anInt1245;
		i_1_ = arg3.anInt1227;
	    }
	    int i_2_;
	    int i_3_;
	    if ((arg0 - -i_1_ ^ 0xffffffff) >= -105) {
		i_2_ = arg0 - -(1 + i_1_ >> 1822728545);
		i_3_ = arg0 + (i_1_ >> -708852543);
	    } else {
		i_2_ = 1 + arg0;
		i_3_ = arg0;
	    }
	    int i_4_;
	    int i_5_;
	    if ((arg6 + i_0_ ^ 0xffffffff) < -105) {
		i_5_ = arg6 - -1;
		i_4_ = arg6;
	    } else {
		i_4_ = arg6 + (i_0_ >> 2046662081);
		i_5_ = arg6 + (1 + i_0_ >> -1590474911);
	    }
	    if (arg8 < 76)
		method1305(1, -118, 116, null, 10, 73, -73, 28, (byte) 127);
	    int i_6_ = (arg0 << 800719559) + (i_1_ << -850201498);
	    int i_7_ = (i_0_ << -42221114) + (arg6 << -793724217);
	    int i_8_ = 0;
	    int[][] is = Class114.anIntArrayArrayArray1896[arg7];
	    int i_9_ = ((is[i_2_][i_5_] + is[i_3_][i_5_] + is[i_2_][i_4_]
			 + is[i_3_][i_4_])
			>> 404281442);
	    if (arg7 != 0) {
		int[][] is_10_ = Class114.anIntArrayArrayArray1896[0];
		i_8_ = i_9_ - ((is_10_[i_3_][i_5_] + is_10_[i_2_][i_4_]
				+ is_10_[i_3_][i_4_] + is_10_[i_2_][i_5_])
			       >> 536132194);
	    }
	    int[][] is_11_ = null;
	    if ((arg7 ^ 0xffffffff) > -4)
		is_11_ = Class114.anIntArrayArrayArray1896[arg7 + 1];
	    Class86 class86
		= arg3.method1383(i_9_, arg4, is, is_11_, false, arg1, true,
				  true, null, i_6_, i_7_);
	    Class151.method2030(class86.aClass148_Sub1_1386, i_6_ + -arg5,
				i_8_, i_7_ - arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ik.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	}
    }
    
    public static void method1306(int arg0) {
	try {
	    aClass124_1064 = null;
	    if (arg0 >= -24)
		method1306(-101);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ik.E(" + arg0 + ')');
	}
    }
    
    public static void method1307(byte arg0) {
    while_884_:
	do {
	while_883_:
	    do {
		do {
		    try {
			anInt1062++;
			if (arg0 == -58)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_883_;
		    }
		    return;
		} while (false);
		try {
		    for (Class14_Sub14 class14_sub14
			     = (Class14_Sub14) Class33.aClass2_583.method77(0);
			 null != class14_sub14;
			 class14_sub14
			     = ((Class14_Sub14)
				Class33.aClass2_583.method84(arg0 ^ 0x54))) {
			if (0 == (class14_sub14.anInt2975 ^ 0xffffffff)) {
			    class14_sub14.anInt2980 = 0;
			    Class7_Sub3_Sub1.method141(4, class14_sub14);
			} else
			    class14_sub14.method233(arg0 ^ ~0x39);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_884_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ik.C(" + arg0 + ')');
	} while (false);
    }
}
