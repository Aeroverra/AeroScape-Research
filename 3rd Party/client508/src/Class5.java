/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class5
{
    public static Class124 aClass124_138;
    public static byte[][] aByteArrayArray139;
    public static int anInt140;
    public static int anInt141;
    public static int anInt142;
    public static Class124 aClass124_143
	= (Class14_Sub2_Sub2.method263
	   (1178, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729"));
    public int[] anIntArray144;
    public byte[] aByteArray145;
    public int[] anIntArray146;
    public static int[] anIntArray147;
    
    public int method110(byte[] arg0, byte[] arg1, int arg2, int arg3,
			 int arg4, byte arg5) {
    while_39_:
	do {
	    do {
		int i;
		try {
		    anInt141++;
		    if (arg4 != 0)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_39_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_0_ = 0;
		arg4 += arg2;
		if (arg5 != -30)
		    aClass124_143 = null;
		int i_1_ = arg3;
		for (;;) {
		    byte i_2_ = arg0[i_1_];
		    if (i_2_ < 0)
			i_0_ = anIntArray146[i_0_];
		    else
			i_0_++;
		    int i_3_;
		    if (((i_3_ = anIntArray146[i_0_]) ^ 0xffffffff) > -1) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if (arg4 <= arg2)
			    break;
			i_0_ = 0;
		    }
		    if ((0x40 & i_2_ ^ 0xffffffff) != -1)
			i_0_ = anIntArray146[i_0_];
		    else
			i_0_++;
		    if (0 > (i_3_ = anIntArray146[i_0_])) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if (arg4 <= arg2)
			    break;
			i_0_ = 0;
		    }
		    if (0 == (i_2_ & 0x20))
			i_0_++;
		    else
			i_0_ = anIntArray146[i_0_];
		    if (0 > (i_3_ = anIntArray146[i_0_])) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if ((arg4 ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
			    break;
			i_0_ = 0;
		    }
		    if (0 != (i_2_ & 0x10))
			i_0_ = anIntArray146[i_0_];
		    else
			i_0_++;
		    if (-1 < ((i_3_ = anIntArray146[i_0_]) ^ 0xffffffff)) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if ((arg4 ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
			    break;
			i_0_ = 0;
		    }
		    if (0 == (i_2_ & 0x8))
			i_0_++;
		    else
			i_0_ = anIntArray146[i_0_];
		    if (0 > (i_3_ = anIntArray146[i_0_])) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if (arg4 <= arg2)
			    break;
			i_0_ = 0;
		    }
		    if ((i_2_ & 0x4 ^ 0xffffffff) == -1)
			i_0_++;
		    else
			i_0_ = anIntArray146[i_0_];
		    if ((i_3_ = anIntArray146[i_0_]) < 0) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if ((arg2 ^ 0xffffffff) <= (arg4 ^ 0xffffffff))
			    break;
			i_0_ = 0;
		    }
		    if ((i_2_ & 0x2 ^ 0xffffffff) == -1)
			i_0_++;
		    else
			i_0_ = anIntArray146[i_0_];
		    if (((i_3_ = anIntArray146[i_0_]) ^ 0xffffffff) > -1) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if (arg4 <= arg2)
			    break;
			i_0_ = 0;
		    }
		    if (0 != (i_2_ & 0x1))
			i_0_ = anIntArray146[i_0_];
		    else
			i_0_++;
		    if (0 > (i_3_ = anIntArray146[i_0_])) {
			arg1[arg2++] = (byte) (i_3_ ^ 0xffffffff);
			if ((arg4 ^ 0xffffffff) >= (arg2 ^ 0xffffffff))
			    break;
			i_0_ = 0;
		    }
		    i_1_++;
		}
		i = 1 + i_1_ - arg3;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("aj.C("
					    + (arg0 != null ? "{...}" : "null")
					    + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ',' + arg3 + ','
					    + arg4 + ',' + arg5 + ')'));
    }
    
    public static void method111(byte arg0) {
	try {
	    aClass124_138 = null;
	    if (arg0 != 76)
		method111((byte) -124);
	    anIntArray147 = null;
	    aClass124_143 = null;
	    aByteArrayArray139 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "aj.D(" + arg0 + ')');
	}
    }
    
    public static void method112(long arg0, byte arg1, int arg2, int arg3,
				 int arg4, Class124 arg5, int arg6) {
    while_41_:
	do {
	while_40_:
	    do {
		Class14_Sub10 class14_sub10;
		do {
		    try {
			class14_sub10 = new Class14_Sub10(128);
			class14_sub10.method809(false, 10);
			anInt140++;
			class14_sub10.method833((byte) 104,
						(int) (Math.random()
						       * 99999.0));
			class14_sub10.method833((byte) 94, 508);
			class14_sub10.method817(arg0, 82);
			class14_sub10.method803((int) (9.9999999E7
						       * Math.random()),
						90);
			class14_sub10.method814(32768, arg5);
			if (arg1 > 5)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_40_;
		    }
		    return;
		} while (false);
		try {
		    class14_sub10
			.method803((int) (9.9999999E7 * Math.random()), 105);
		    class14_sub10.method833((byte) 120,
					    Class14_Sub2_Sub11.anInt3884);
		    class14_sub10.method809(false, arg4);
		    class14_sub10.method809(false, arg3);
		    class14_sub10
			.method803((int) (9.9999999E7 * Math.random()), 99);
		    class14_sub10.method833((byte) 104, arg6);
		    class14_sub10.method833((byte) 90, arg2);
		    class14_sub10
			.method803((int) (Math.random() * 9.9999999E7), 92);
		    class14_sub10.method794(Class9_Sub1.aBigInteger2704,
					    Class152.aBigInteger2433, 0);
		    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
		    Class55.aClass14_Sub10_Sub1_891.method809(false, 48);
		    Class55.aClass14_Sub10_Sub1_891
			.method809(false, class14_sub10.anInt2908);
		    Class55.aClass14_Sub10_Sub1_891.method807
			(class14_sub10.anInt2908, class14_sub10.aByteArray2895,
			 0, -1076444960);
		    Class56.anInt918 = 1;
		    Class14_Sub8_Sub35.anInt4686 = 0;
		    Class14_Sub2.anInt2734 = -3;
		    Class129.anInt2136 = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_41_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("aj.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ',' + arg6 + ')'));
	} while (false);
    }
    
    public Class5(byte[] arg0) {
	try {
	    int i = arg0.length;
	    int[] is = new int[33];
	    anIntArray144 = new int[i];
	    aByteArray145 = arg0;
	    int i_4_ = 0;
	    anIntArray146 = new int[8];
	    for (int i_5_ = 0; i > i_5_; i_5_++) {
		int i_6_ = arg0[i_5_];
		if (0 != i_6_) {
		    int i_7_ = 1 << 32 - i_6_;
		    int i_8_ = is[i_6_];
		    anIntArray144[i_5_] = i_8_;
		    int i_9_;
		    if (-1 != (i_7_ & i_8_ ^ 0xffffffff))
			i_9_ = is[-1 + i_6_];
		    else {
			for (int i_10_ = -1 + i_6_; (i_10_ ^ 0xffffffff) <= -2;
			     i_10_--) {
			    int i_11_ = is[i_10_];
			    if ((i_11_ ^ 0xffffffff) != (i_8_ ^ 0xffffffff))
				break;
			    int i_12_ = 1 << 32 + -i_10_;
			    if (0 == (i_11_ & i_12_))
				is[i_10_] = Class66.method1294(i_12_, i_11_);
			    else {
				is[i_10_] = is[-1 + i_10_];
				break;
			    }
			}
			i_9_ = i_8_ | i_7_;
		    }
		    is[i_6_] = i_9_;
		    for (int i_13_ = i_6_ + 1; 32 >= i_13_; i_13_++) {
			if (i_8_ == is[i_13_])
			    is[i_13_] = i_9_;
		    }
		    int i_14_ = 0;
		    for (int i_15_ = 0;
			 (i_6_ ^ 0xffffffff) < (i_15_ ^ 0xffffffff); i_15_++) {
			int i_16_ = -2147483648 >>> i_15_;
			if ((i_16_ & i_8_ ^ 0xffffffff) == -1)
			    i_14_++;
			else {
			    if (-1 == (anIntArray146[i_14_] ^ 0xffffffff))
				anIntArray146[i_14_] = i_4_;
			    i_14_ = anIntArray146[i_14_];
			}
			if (anIntArray146.length <= i_14_) {
			    int[] is_17_ = new int[anIntArray146.length * 2];
			    for (int i_18_ = 0; anIntArray146.length > i_18_;
				 i_18_++)
				is_17_[i_18_] = anIntArray146[i_18_];
			    anIntArray146 = is_17_;
			}
			i_16_ >>>= 1;
		    }
		    anIntArray146[i_14_] = i_5_ ^ 0xffffffff;
		    if (i_14_ >= i_4_)
			i_4_ = i_14_ + 1;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("aj.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int method113(int arg0, byte[] arg1, int arg2, int arg3, int arg4,
			 byte[] arg5) {
	int i;
	try {
	    anInt142++;
	    int i_19_ = arg0;
	    arg3 += arg2;
	    int i_20_ = arg4 << -1059931709;
	    for (/**/; arg2 < arg3; arg2++) {
		int i_21_ = 0xff & arg5[arg2];
		int i_22_ = aByteArray145[i_21_];
		int i_23_ = anIntArray144[i_21_];
		if ((i_22_ ^ 0xffffffff) == -1)
		    throw new RuntimeException("No codeword for data value "
					       + i_21_);
		int i_24_ = i_20_ & 0x7;
		i_19_ &= -i_24_ >> 323735583;
		int i_25_ = i_20_ >> 785292515;
		i_20_ += i_22_;
		int i_26_ = (-1 + (i_24_ - -i_22_) >> 2135366947) + i_25_;
		i_24_ += 24;
		arg1[i_25_]
		    = (byte) (i_19_
			      = Class66.method1294(i_19_, i_23_ >>> i_24_));
		if ((i_26_ ^ 0xffffffff) < (i_25_ ^ 0xffffffff)) {
		    i_24_ -= 8;
		    i_25_++;
		    arg1[i_25_] = (byte) (i_19_ = i_23_ >>> i_24_);
		    if ((i_25_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff)) {
			i_25_++;
			i_24_ -= 8;
			arg1[i_25_] = (byte) (i_19_ = i_23_ >>> i_24_);
			if ((i_25_ ^ 0xffffffff) > (i_26_ ^ 0xffffffff)) {
			    i_25_++;
			    i_24_ -= 8;
			    arg1[i_25_] = (byte) (i_19_ = i_23_ >>> i_24_);
			    if (i_26_ > i_25_) {
				i_24_ -= 8;
				i_25_++;
				arg1[i_25_] = (byte) (i_19_ = i_23_ << -i_24_);
			    }
			}
		    }
		}
	    }
	    i = -arg4 + (7 + i_20_ >> -462591773);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("aj.A(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ','
						+ (arg5 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return i;
    }
    
    static {
	aClass124_138 = aClass124_143;
	anIntArray147 = new int[32];
    }
}
