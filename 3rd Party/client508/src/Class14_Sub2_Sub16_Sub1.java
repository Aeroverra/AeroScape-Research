/* Class14_Sub2_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub16_Sub1 extends Class14_Sub2_Sub16
{
    public byte[][] aByteArrayArray5065;
    
    public void method349(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, boolean arg6) {
	int i = arg1 + arg2 * Class92.anInt1432;
	int i_0_ = Class92.anInt1432 - arg3;
	int i_1_ = 0;
	int i_2_ = 0;
	if (arg2 < Class92.anInt1438) {
	    int i_3_ = Class92.anInt1438 - arg2;
	    arg4 -= i_3_;
	    arg2 = Class92.anInt1438;
	    i_2_ += i_3_ * arg3;
	    i += i_3_ * Class92.anInt1432;
	}
	if (arg2 + arg4 > Class92.anInt1436)
	    arg4 -= arg2 + arg4 - Class92.anInt1436;
	if (arg1 < Class92.anInt1433) {
	    int i_4_ = Class92.anInt1433 - arg1;
	    arg3 -= i_4_;
	    arg1 = Class92.anInt1433;
	    i_2_ += i_4_;
	    i += i_4_;
	    i_1_ += i_4_;
	    i_0_ += i_4_;
	}
	if (arg1 + arg3 > Class92.anInt1434) {
	    int i_5_ = arg1 + arg3 - Class92.anInt1434;
	    arg3 -= i_5_;
	    i_1_ += i_5_;
	    i_0_ += i_5_;
	}
	if (arg3 > 0 && arg4 > 0) {
	    if (Class92.anIntArray1440 != null)
		method370(Class92.anIntArray1437, aByteArrayArray5065[arg0],
			  arg1, arg2, arg3, arg4, arg5, i_2_, i, i_0_, i_1_,
			  Class92.anIntArray1440, Class92.anIntArray1439);
	    else
		method371(Class92.anIntArray1437, aByteArrayArray5065[arg0],
			  arg5, i_2_, i, arg3, arg4, i_0_, i_1_);
	}
    }
    
    public static void method369(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	arg2 = ((arg2 & 0xff00ff) * arg9 & ~0xff00ff) + ((arg2 & 0xff00) * arg9
							 & 0xff0000) >> 8;
	arg9 = 256 - arg9;
	for (int i = -arg6; i < 0; i++) {
	    for (int i_6_ = -arg5; i_6_ < 0; i_6_++) {
		if (arg1[arg3++] != 0) {
		    int i_7_ = arg0[arg4];
		    arg0[arg4++] = ((((i_7_ & 0xff00ff) * arg9 & ~0xff00ff)
				     + ((i_7_ & 0xff00) * arg9 & 0xff0000))
				    >> 8) + arg2;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public static void method370(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int[] arg11,
				 int[] arg12) {
	int i = arg2 - Class92.anInt1433;
	int i_8_ = arg3 - Class92.anInt1438;
	for (int i_9_ = i_8_; i_9_ < i_8_ + arg5; i_9_++) {
	    int i_10_ = arg11[i_9_];
	    int i_11_ = arg12[i_9_];
	    int i_12_ = arg4;
	    if (i > i_10_) {
		int i_13_ = i - i_10_;
		if (i_13_ >= i_11_) {
		    arg7 += arg4 + arg10;
		    arg8 += arg4 + arg9;
		    continue;
		}
		i_11_ -= i_13_;
	    } else {
		int i_14_ = i_10_ - i;
		if (i_14_ >= arg4) {
		    arg7 += arg4 + arg10;
		    arg8 += arg4 + arg9;
		    continue;
		}
		arg7 += i_14_;
		i_12_ -= i_14_;
		arg8 += i_14_;
	    }
	    int i_15_ = 0;
	    if (i_12_ < i_11_)
		i_11_ = i_12_;
	    else
		i_15_ = i_12_ - i_11_;
	    for (int i_16_ = -i_11_; i_16_ < 0; i_16_++) {
		if (arg1[arg7++] != 0)
		    Class92.anIntArray1437[arg8++] = arg6;
		else
		    arg8++;
	    }
	    arg7 += i_15_ + arg10;
	    arg8 += i_15_ + arg9;
	}
    }
    
    public void method363(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5, int arg6, boolean arg7) {
	int i = arg1 + arg2 * Class92.anInt1432;
	int i_17_ = Class92.anInt1432 - arg3;
	int i_18_ = 0;
	int i_19_ = 0;
	if (arg2 < Class92.anInt1438) {
	    int i_20_ = Class92.anInt1438 - arg2;
	    arg4 -= i_20_;
	    arg2 = Class92.anInt1438;
	    i_19_ += i_20_ * arg3;
	    i += i_20_ * Class92.anInt1432;
	}
	if (arg2 + arg4 > Class92.anInt1436)
	    arg4 -= arg2 + arg4 - Class92.anInt1436;
	if (arg1 < Class92.anInt1433) {
	    int i_21_ = Class92.anInt1433 - arg1;
	    arg3 -= i_21_;
	    arg1 = Class92.anInt1433;
	    i_19_ += i_21_;
	    i += i_21_;
	    i_18_ += i_21_;
	    i_17_ += i_21_;
	}
	if (arg1 + arg3 > Class92.anInt1434) {
	    int i_22_ = arg1 + arg3 - Class92.anInt1434;
	    arg3 -= i_22_;
	    i_18_ += i_22_;
	    i_17_ += i_22_;
	}
	if (arg3 > 0 && arg4 > 0)
	    method369(Class92.anIntArray1437, aByteArrayArray5065[arg0], arg5,
		      i_19_, i, arg3, arg4, i_17_, i_18_, arg6);
    }
    
    public Class14_Sub2_Sub16_Sub1(byte[] arg0, int[] arg1, int[] arg2,
				   int[] arg3, int[] arg4, byte[][] arg5) {
	super(arg0, arg1, arg2, arg3, arg4);
	aByteArrayArray5065 = new byte[256][];
	aByteArrayArray5065 = arg5;
    }
    
    public static void method371(int[] arg0, byte[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_23_ = -arg6; i_23_ < 0; i_23_++) {
	    for (int i_24_ = i; i_24_ < 0; i_24_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_25_ = arg5; i_25_ < 0; i_25_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class14_Sub2_Sub16_Sub1(byte[] arg0) {
	super(arg0);
	aByteArrayArray5065 = new byte[256][];
    }
}
