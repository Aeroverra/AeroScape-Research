/* Class14_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub10_Sub1 extends Class14_Sub10
{
    public static int anInt4875;
    public static Class124 aClass124_4876;
    public static int anInt4877 = 0;
    public int anInt4878;
    public static int anInt4879;
    public Class106 aClass106_4880;
    public static int anInt4881;
    public static int anInt4882;
    public static int anInt4883;
    public static int anInt4884;
    public static int anInt4885;
    public static Class124 aClass124_4886;
    public static Class124 aClass124_4887;
    public static int anInt4888;
    public static int anInt4889;
    public static int anInt4890;
    public static Class124 aClass124_4891;
    public static int anInt4892;
    public static int anInt4893;
    public static int anInt4894;
    
    public static void method839(int arg0) {
	try {
	    anInt4893++;
	    Class37.aClass52_635.method1203((byte) -67);
	    if (arg0 != 8)
		method839(53);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "e.EC(" + arg0 + ')');
	}
    }
    
    public Class14_Sub10_Sub1(int arg0) {
	super(arg0);
    }
    
    public int method840(int arg0, byte arg1) {
	int i;
	try {
	    anInt4883++;
	    if (arg1 >= -3)
		method839(-101);
	    i = -anInt4878 + arg0 * 8;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.UB(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static boolean method841(int arg0, int arg1) {
    while_579_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4881++;
		    if (32 <= arg0)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_579_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (-128 != (arg0 ^ 0xffffffff))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_579_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if (arg1 >= 67)
			break;
		    bool = true;
		} catch (RuntimeException runtimeexception) {
		    break while_579_;
		}
		return bool;
	    } while (false);
	    do {
		boolean bool;
		try {
		    if ((arg0 ^ 0xffffffff) > -130 || 159 < arg0)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_579_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "e.TB(" + arg0 + ',' + arg1 + ')');
    }
    
    public int method842(int arg0, int arg1) {
	int i;
	try {
	    anInt4875++;
	    int i_0_ = -(anInt4878 & 0x7) + 8;
	    int i_1_ = anInt4878 >> -623473629;
	    anInt4878 += arg1;
	    int i_2_ = arg0;
	    for (/**/; arg1 > i_0_; i_0_ = 8) {
		i_2_ += ((aByteArray2895[i_1_++]
			  & Class14_Sub8_Sub33.anIntArray4628[i_0_])
			 << -i_0_ + arg1);
		arg1 -= i_0_;
	    }
	    if (i_0_ != arg1)
		i_2_ += (aByteArray2895[i_1_] >> i_0_ + -arg1
			 & Class14_Sub8_Sub33.anIntArray4628[arg1]);
	    else
		i_2_ += (aByteArray2895[i_1_]
			 & Class14_Sub8_Sub33.anIntArray4628[i_0_]);
	    i = i_2_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.GC(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public void method843(int arg0, int arg1) {
	try {
	    anInt4879++;
	    if (arg0 != 0)
		aClass124_4886 = null;
	    aByteArray2895[anInt2908++]
		= (byte) (aClass106_4880.method1543((byte) 125) + arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.CC(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method844(byte[] arg0, int arg1, int arg2, int arg3) {
	try {
	    if (arg3 > -61)
		aClass124_4876 = null;
	    anInt4884++;
	    for (int i = 0; (arg1 ^ 0xffffffff) < (i ^ 0xffffffff); i++)
		arg0[arg2 + i]
		    = (byte) (aByteArray2895[anInt2908++]
			      + -aClass106_4880.method1543((byte) 114));
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.AC("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	}
    }
    
    public void method845(boolean arg0) {
	try {
	    anInt4878 = anInt2908 * 8;
	    if (arg0 != true)
		method840(-43, (byte) -25);
	    anInt4885++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "e.VB(" + arg0 + ')');
	}
    }
    
    public static void method846(byte arg0) {
	try {
	    aClass124_4891 = null;
	    aClass124_4887 = null;
	    aClass124_4876 = null;
	    aClass124_4886 = null;
	    if (arg0 != 0)
		aClass124_4887 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "e.WB(" + arg0 + ')');
	}
    }
    
    public int method847(int arg0) {
	int i;
	try {
	    anInt4894++;
	    if (arg0 != 255)
		aClass124_4891 = null;
	    i = (aByteArray2895[anInt2908++]
		 + -aClass106_4880.method1543((byte) 112)) & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "e.BC(" + arg0 + ')');
	}
	return i;
    }
    
    public void method848(byte arg0) {
	try {
	    if (arg0 > -60)
		aClass106_4880 = null;
	    anInt4890++;
	    anInt2908 = (7 + anInt4878) / 8;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "e.FC(" + arg0 + ')');
	}
    }
    
    public static void method849(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5) {
	try {
	    if ((arg4 ^ 0xffffffff) >= (Class59.anInt955 ^ 0xffffffff)
		&& Class14_Sub17.anInt3005 <= arg1) {
		boolean bool;
		if (arg0 < Class118.anInt1982) {
		    bool = false;
		    arg0 = Class118.anInt1982;
		} else if (Class14_Sub8_Sub14.anInt4327 >= arg0)
		    bool = true;
		else {
		    arg0 = Class14_Sub8_Sub14.anInt4327;
		    bool = false;
		}
		boolean bool_3_;
		if (arg5 >= Class118.anInt1982) {
		    if ((Class14_Sub8_Sub14.anInt4327 ^ 0xffffffff)
			> (arg5 ^ 0xffffffff)) {
			bool_3_ = false;
			arg5 = Class14_Sub8_Sub14.anInt4327;
		    } else
			bool_3_ = true;
		} else {
		    arg5 = Class118.anInt1982;
		    bool_3_ = false;
		}
		if ((Class14_Sub17.anInt3005 ^ 0xffffffff)
		    >= (arg4 ^ 0xffffffff))
		    Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
					[arg4++]),
				       arg5, arg0, -5973, arg3);
		else
		    arg4 = Class14_Sub17.anInt3005;
		if ((arg1 ^ 0xffffffff) >= (Class59.anInt955 ^ 0xffffffff))
		    Class51.method1201((Class14_Sub2_Sub19.anIntArrayArray4038
					[arg1--]),
				       arg5, arg0, -5973, arg3);
		else
		    arg1 = Class59.anInt955;
		if (!bool_3_ || !bool) {
		    if (!bool_3_) {
			if (bool) {
			    for (int i = arg4; i <= arg1; i++)
				Class14_Sub2_Sub19.anIntArrayArray4038[i][arg0]
				    = arg3;
			}
		    } else {
			for (int i = arg4;
			     (i ^ 0xffffffff) >= (arg1 ^ 0xffffffff); i++)
			    Class14_Sub2_Sub19.anIntArrayArray4038[i][arg5]
				= arg3;
		    }
		} else {
		    for (int i = arg4; i <= arg1; i++) {
			int[] is = Class14_Sub2_Sub19.anIntArrayArray4038[i];
			is[arg5] = is[arg0] = arg3;
		    }
		}
	    }
	    anInt4889++;
	    if (arg2 != 0)
		method846((byte) -97);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.DC(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public void method850(int[] arg0, int arg1) {
	try {
	    anInt4888++;
	    if (arg1 > -102)
		method850(null, -9);
	    aClass106_4880 = new Class106(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("e.SB("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    static {
	aClass124_4876 = Class14_Sub2_Sub2.method263(1178, "Null");
	aClass124_4891 = Class14_Sub2_Sub2.method263(1178, "huffman");
	aClass124_4887 = Class14_Sub2_Sub2.method263(1178, "Loading)3)3)3");
	aClass124_4886 = aClass124_4887;
    }
}
