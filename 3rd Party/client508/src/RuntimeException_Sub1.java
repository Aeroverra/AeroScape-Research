/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class RuntimeException_Sub1 extends RuntimeException
{
    public static Class124 aClass124_2455
	= Class14_Sub2_Sub2.method263(1178, "Loading wordpack )2 ");
    public static Class124 aClass124_2456;
    public String aString2457;
    public static Class31 aClass31_2458;
    public static Class124[] aClass124Array2459;
    public static int anInt2460;
    public Throwable aThrowable2461;
    public static Class124 aClass124_2462;
    public static int anInt2463 = 0;
    public static Class14_Sub27[][] aClass14_Sub27ArrayArray2464;
    public static int anInt2465;
    public static Class124 aClass124_2466;
    
    public static void method2051(int arg0) {
	aClass124_2462 = null;
	aClass14_Sub27ArrayArray2464 = null;
	aClass124_2466 = null;
	aClass124_2456 = null;
	aClass124_2455 = null;
	if (arg0 < -51) {
	    aClass124Array2459 = null;
	    aClass31_2458 = null;
	}
    }
    
    public static int method2052(byte arg0, int arg1) {
    while_1425_:
	do {
	    do {
		int i;
		try {
		    anInt2465++;
		    if ((97 > arg1 || (arg1 ^ 0xffffffff) < -123)
			&& (arg1 < 224 || arg1 > 254
			    || (arg1 ^ 0xffffffff) == -248))
			break;
		    i = arg1 + -32;
		} catch (RuntimeException runtimeexception) {
		    break while_1425_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg0 <= 108)
			aClass124_2456 = null;
		    if (arg1 != 255)
			break;
		    i = 159;
		} catch (RuntimeException runtimeexception) {
		    break while_1425_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-157 != (arg1 ^ 0xffffffff))
			break;
		    i = 140;
		} catch (RuntimeException runtimeexception) {
		    break while_1425_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "jg.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public RuntimeException_Sub1(Throwable arg0, String arg1) {
	aThrowable2461 = arg0;
	aString2457 = arg1;
    }
    
    public static void method2053
	(Class32[] arg0, byte[] arg1, int arg2, boolean arg3, int arg4,
	 boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
    while_1427_:
	do {
	while_1426_:
	    do {
		Class14_Sub10 class14_sub10;
		int i;
		do {
		    try {
			anInt2460++;
			class14_sub10 = new Class14_Sub10(arg1);
			i = -1;
			if (!arg5)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1426_;
		    }
		    return;
		} while (false);
		try {
		    for (;;) {
			int i_0_ = class14_sub10.method802(-85);
			if ((i_0_ ^ 0xffffffff) == -1)
			    break;
			i += i_0_;
			int i_1_ = 0;
			for (;;) {
			    int i_2_ = class14_sub10.method818((byte) -110);
			    if (-1 == (i_2_ ^ 0xffffffff))
				break;
			    i_1_ += -1 + i_2_;
			    int i_3_ = (i_1_ & 0xfde) >> -822815866;
			    int i_4_ = i_1_ & 0x3f;
			    int i_5_ = i_1_ >> -373502068;
			    int i_6_ = class14_sub10.method798(-123);
			    int i_7_ = i_6_ >> -1385166782;
			    int i_8_ = i_6_ & 0x3;
			    if ((arg4 ^ 0xffffffff) == (i_5_ ^ 0xffffffff)
				&& arg8 <= i_3_
				&& (i_3_ ^ 0xffffffff) > (8 + arg8
							  ^ 0xffffffff)
				&& (i_4_ ^ 0xffffffff) <= (arg10 ^ 0xffffffff)
				&& i_4_ < 8 + arg10) {
				Class79 class79
				    = Class79.method1377((byte) -106, i);
				int i_9_ = ((Class99_Sub2.method1511
					     (class79.anInt1227, -675459956,
					      class79.anInt1245, i_3_ & 0x7,
					      0x7 & i_4_, i_8_, arg2))
					    + arg6);
				int i_10_ = ((Class14_Sub2_Sub2.method266
					      (i_3_ & 0x7, class79.anInt1245,
					       class79.anInt1227, i_8_,
					       0x7 & i_4_, 7, arg2))
					     + arg7);
				if (i_9_ > 0 && (i_10_ ^ 0xffffffff) < -1
				    && 103 > i_9_
				    && -104 < (i_10_ ^ 0xffffffff)) {
				    Class32 class32 = null;
				    if (!arg3) {
					int i_11_ = arg9;
					if (((Class14_Sub8_Sub4
					      .aByteArrayArrayArray4142[1]
					      [i_9_][i_10_]) & 0x2
					     ^ 0xffffffff)
					    == -3)
					    i_11_--;
					if (-1 >= (i_11_ ^ 0xffffffff))
					    class32 = arg0[i_11_];
				    }
				    Class55.method1235(arg3,
						       0x3 & i_8_ - -arg2,
						       !arg3, (byte) 50,
						       class32, arg9, i_10_,
						       i_7_, i_9_, i, arg9);
				}
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1427_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554
		      (throwable,
		       ("jg.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ','
			+ arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')'));
	} while (false);
    }
    
    static {
	aClass124Array2459 = new Class124[500];
	aClass124_2466
	    = Class14_Sub2_Sub2.method263(1178, "Connection lost)3");
	aClass124_2462 = aClass124_2466;
	aClass124_2456 = aClass124_2455;
    }
}
