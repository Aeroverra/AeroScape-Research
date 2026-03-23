/* Class148_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class148_Sub1 extends Class148
{
    public int[] anIntArray3688;
    public byte[] aByteArray3689;
    
    public static void method2002
	(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
	int i = arg3;
	for (int i_0_ = -arg8; i_0_ < 0; i_0_++) {
	    int i_1_ = (arg4 >> 16) * arg11;
	    for (int i_2_ = -arg7; i_2_ < 0; i_2_++) {
		int i_3_ = arg1[(arg3 >> 16) + i_1_];
		if (i_3_ != 0)
		    arg0[arg5++] = arg2[i_3_ & 0xff];
		else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public void method2003(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray3688.length; i++) {
	    int i_4_ = anIntArray3688[i] >> 16 & 0xff;
	    i_4_ += arg0;
	    if (i_4_ < 0)
		i_4_ = 0;
	    else if (i_4_ > 255)
		i_4_ = 255;
	    int i_5_ = anIntArray3688[i] >> 8 & 0xff;
	    i_5_ += arg1;
	    if (i_5_ < 0)
		i_5_ = 0;
	    else if (i_5_ > 255)
		i_5_ = 255;
	    int i_6_ = anIntArray3688[i] & 0xff;
	    i_6_ += arg2;
	    if (i_6_ < 0)
		i_6_ = 0;
	    else if (i_6_ > 255)
		i_6_ = 255;
	    anIntArray3688[i] = (i_4_ << 16) + (i_5_ << 8) + i_6_;
	}
    }
    
    public void method2004() {
	byte[] is = new byte[anInt2371 * anInt2376];
	int i = 0;
	for (int i_7_ = 0; i_7_ < anInt2371; i_7_++) {
	    for (int i_8_ = anInt2376 - 1; i_8_ >= 0; i_8_--)
		is[i++] = aByteArray3689[i_7_ + i_8_ * anInt2371];
	}
	aByteArray3689 = is;
	int i_9_ = anInt2374;
	anInt2374 = anInt2375;
	anInt2375 = anInt2373 - anInt2376 - i_9_;
	i_9_ = anInt2376;
	anInt2376 = anInt2371;
	anInt2371 = i_9_;
	i_9_ = anInt2373;
	anInt2373 = anInt2378;
	anInt2378 = i_9_;
    }
    
    public void method1999(int arg0, int arg1, int arg2) {
	arg0 += anInt2375;
	arg1 += anInt2374;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_10_ = 0;
	int i_11_ = anInt2376;
	int i_12_ = anInt2371;
	int i_13_ = Class92.anInt1432 - i_12_;
	int i_14_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_15_ = Class92.anInt1438 - arg1;
	    i_11_ -= i_15_;
	    arg1 = Class92.anInt1438;
	    i_10_ += i_15_ * i_12_;
	    i += i_15_ * Class92.anInt1432;
	}
	if (arg1 + i_11_ > Class92.anInt1436)
	    i_11_ -= arg1 + i_11_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_16_ = Class92.anInt1433 - arg0;
	    i_12_ -= i_16_;
	    arg0 = Class92.anInt1433;
	    i_10_ += i_16_;
	    i += i_16_;
	    i_14_ += i_16_;
	    i_13_ += i_16_;
	}
	if (arg0 + i_12_ > Class92.anInt1434) {
	    int i_17_ = arg0 + i_12_ - Class92.anInt1434;
	    i_12_ -= i_17_;
	    i_14_ += i_17_;
	    i_13_ += i_17_;
	}
	if (i_12_ > 0 && i_11_ > 0)
	    method2008(Class92.anIntArray1437, aByteArray3689, anIntArray3688,
		       i_10_, i, i_12_, i_11_, i_13_, i_14_, arg2);
    }
    
    public static void method2005(int[] arg0, byte[] arg1, int[] arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	int i = -(arg6 >> 2);
	arg6 = -(arg6 & 0x3);
	for (int i_18_ = -arg7; i_18_ < 0; i_18_++) {
	    for (int i_19_ = i; i_19_ < 0; i_19_++) {
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
	    }
	    for (int i_20_ = arg6; i_20_ < 0; i_20_++) {
		arg3 = arg1[arg4++];
		if (arg3 != 0)
		    arg0[arg5++] = arg2[arg3 & 0xff];
		else
		    arg5++;
	    }
	    arg5 += arg8;
	    arg4 += arg9;
	}
    }
    
    public void method2006(int arg0, int arg1, int arg2, int arg3) {
	int i = anInt2371;
	int i_21_ = anInt2376;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = anInt2378;
	int i_25_ = anInt2373;
	int i_26_ = (i_24_ << 16) / arg2;
	int i_27_ = (i_25_ << 16) / arg3;
	if (anInt2375 > 0) {
	    int i_28_ = ((anInt2375 << 16) + i_26_ - 1) / i_26_;
	    arg0 += i_28_;
	    i_22_ += i_28_ * i_26_ - (anInt2375 << 16);
	}
	if (anInt2374 > 0) {
	    int i_29_ = ((anInt2374 << 16) + i_27_ - 1) / i_27_;
	    arg1 += i_29_;
	    i_23_ += i_29_ * i_27_ - (anInt2374 << 16);
	}
	if (i < i_24_)
	    arg2 = ((i << 16) - i_22_ + i_26_ - 1) / i_26_;
	if (i_21_ < i_25_)
	    arg3 = ((i_21_ << 16) - i_23_ + i_27_ - 1) / i_27_;
	int i_30_ = arg0 + arg1 * Class92.anInt1432;
	int i_31_ = Class92.anInt1432 - arg2;
	if (arg1 + arg3 > Class92.anInt1436)
	    arg3 -= arg1 + arg3 - Class92.anInt1436;
	if (arg1 < Class92.anInt1438) {
	    int i_32_ = Class92.anInt1438 - arg1;
	    arg3 -= i_32_;
	    i_30_ += i_32_ * Class92.anInt1432;
	    i_23_ += i_27_ * i_32_;
	}
	if (arg0 + arg2 > Class92.anInt1434) {
	    int i_33_ = arg0 + arg2 - Class92.anInt1434;
	    arg2 -= i_33_;
	    i_31_ += i_33_;
	}
	if (arg0 < Class92.anInt1433) {
	    int i_34_ = Class92.anInt1433 - arg0;
	    arg2 -= i_34_;
	    i_30_ += i_34_;
	    i_22_ += i_26_ * i_34_;
	    i_31_ += i_34_;
	}
	method2002(Class92.anIntArray1437, aByteArray3689, anIntArray3688,
		   i_22_, i_23_, i_30_, i_31_, arg2, arg3, i_26_, i_27_, i);
    }
    
    public Class148_Sub1 method2007() {
	Class148_Sub1 class148_sub1
	    = new Class148_Sub1(anInt2371, anInt2376, anIntArray3688.length);
	class148_sub1.anInt2378 = anInt2378;
	class148_sub1.anInt2373 = anInt2373;
	class148_sub1.anInt2375 = anInt2375;
	class148_sub1.anInt2374 = anInt2374;
	int i = aByteArray3689.length;
	for (int i_35_ = 0; i_35_ < i; i_35_++)
	    class148_sub1.aByteArray3689[i_35_] = aByteArray3689[i_35_];
	class148_sub1.anIntArray3688 = anIntArray3688;
	return class148_sub1;
    }
    
    public static void method2008(int[] arg0, byte[] arg1, int[] arg2,
				  int arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	int i = 256 - arg9;
	for (int i_36_ = -arg6; i_36_ < 0; i_36_++) {
	    for (int i_37_ = -arg5; i_37_ < 0; i_37_++) {
		int i_38_ = arg1[arg3++];
		if (i_38_ != 0) {
		    i_38_ = arg2[i_38_ & 0xff];
		    int i_39_ = arg0[arg4];
		    arg0[arg4++]
			= (((i_38_ & 0xff00ff) * arg9 + (i_39_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((i_38_ & 0xff00) * arg9 + (i_39_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method2001(int arg0, int arg1) {
	arg0 += anInt2375;
	arg1 += anInt2374;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_40_ = 0;
	int i_41_ = anInt2376;
	int i_42_ = anInt2371;
	int i_43_ = Class92.anInt1432 - i_42_;
	int i_44_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_45_ = Class92.anInt1438 - arg1;
	    i_41_ -= i_45_;
	    arg1 = Class92.anInt1438;
	    i_40_ += i_45_ * i_42_;
	    i += i_45_ * Class92.anInt1432;
	}
	if (arg1 + i_41_ > Class92.anInt1436)
	    i_41_ -= arg1 + i_41_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_46_ = Class92.anInt1433 - arg0;
	    i_42_ -= i_46_;
	    arg0 = Class92.anInt1433;
	    i_40_ += i_46_;
	    i += i_46_;
	    i_44_ += i_46_;
	    i_43_ += i_46_;
	}
	if (arg0 + i_42_ > Class92.anInt1434) {
	    int i_47_ = arg0 + i_42_ - Class92.anInt1434;
	    i_42_ -= i_47_;
	    i_44_ += i_47_;
	    i_43_ += i_47_;
	}
	if (i_42_ > 0 && i_41_ > 0)
	    method2005(Class92.anIntArray1437, aByteArray3689, anIntArray3688,
		       0, i_40_, i, i_42_, i_41_, i_43_, i_44_);
    }
    
    public void method2009() {
	if (anInt2371 != anInt2378 || anInt2376 != anInt2373) {
	    byte[] is = new byte[anInt2378 * anInt2373];
	    int i = 0;
	    for (int i_48_ = 0; i_48_ < anInt2376; i_48_++) {
		for (int i_49_ = 0; i_49_ < anInt2371; i_49_++)
		    is[i_49_ + anInt2375 + (i_48_ + anInt2374) * anInt2378]
			= aByteArray3689[i++];
	    }
	    aByteArray3689 = is;
	    anInt2371 = anInt2378;
	    anInt2376 = anInt2373;
	    anInt2375 = 0;
	    anInt2374 = 0;
	}
    }
    
    public Class148_Sub1(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, byte[] arg6, int[] arg7) {
	anInt2378 = arg0;
	anInt2373 = arg1;
	anInt2375 = arg2;
	anInt2374 = arg3;
	anInt2371 = arg4;
	anInt2376 = arg5;
	aByteArray3689 = arg6;
	anIntArray3688 = arg7;
    }
    
    public void method2010() {
	int i = 0;
	int i_50_ = aByteArray3689.length - 7;
	while (i < i_50_) {
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	    aByteArray3689[i++] = (byte) 0;
	}
	i_50_ += 7;
	while (i < i_50_)
	    aByteArray3689[i++] = (byte) 0;
    }
    
    public Class148_Sub1(int arg0, int arg1, int arg2) {
	anInt2378 = anInt2371 = arg0;
	anInt2373 = anInt2376 = arg1;
	anInt2375 = anInt2374 = 0;
	aByteArray3689 = new byte[arg0 * arg1];
	anIntArray3688 = new int[arg2];
    }
}
