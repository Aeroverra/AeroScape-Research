/* Class14_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub9_Sub4 extends Class14_Sub9
{
    public int anInt4860;
    public boolean aBoolean4861;
    public int anInt4862;
    public int anInt4863;
    public int anInt4864;
    public int anInt4865;
    public int anInt4866;
    public int anInt4867;
    public int anInt4868;
    public int anInt4869;
    public int anInt4870;
    public int anInt4871;
    public int anInt4872;
    public int anInt4873;
    public int anInt4874;
    
    public Class14_Sub9 method686() {
	return null;
    }
    
    public synchronized void method687(int[] arg0, int arg1, int arg2) {
	if (anInt4868 == 0 && anInt4867 == 0)
	    method692(arg2);
	else {
	    Class14_Sub12_Sub1 class14_sub12_sub1
		= (Class14_Sub12_Sub1) aClass14_Sub12_2866;
	    int i = anInt4860 << 8;
	    int i_0_ = anInt4865 << 8;
	    int i_1_ = class14_sub12_sub1.aByteArray4899.length << 8;
	    int i_2_ = i_0_ - i;
	    if (i_2_ <= 0)
		anInt4871 = 0;
	    int i_3_ = arg1;
	    arg2 += arg1;
	    if (anInt4869 < 0) {
		if (anInt4873 > 0)
		    anInt4869 = 0;
		else {
		    method742();
		    method233(0);
		    return;
		}
	    }
	    if (anInt4869 >= i_1_) {
		if (anInt4873 < 0)
		    anInt4869 = i_1_ - 1;
		else {
		    method742();
		    method233(0);
		    return;
		}
	    }
	    if (anInt4871 < 0) {
		if (aBoolean4861) {
		    if (anInt4873 < 0) {
			i_3_ = method766(arg0, i_3_, i, arg2,
					 (class14_sub12_sub1.aByteArray4899
					  [anInt4860]));
			if (anInt4869 >= i)
			    return;
			anInt4869 = i + i - 1 - anInt4869;
			anInt4873 = -anInt4873;
		    }
		    for (;;) {
			i_3_ = method770(arg0, i_3_, i_0_, arg2,
					 (class14_sub12_sub1.aByteArray4899
					  [anInt4865 - 1]));
			if (anInt4869 < i_0_)
			    break;
			anInt4869 = i_0_ + i_0_ - 1 - anInt4869;
			anInt4873 = -anInt4873;
			i_3_ = method766(arg0, i_3_, i, arg2,
					 (class14_sub12_sub1.aByteArray4899
					  [anInt4860]));
			if (anInt4869 >= i)
			    break;
			anInt4869 = i + i - 1 - anInt4869;
			anInt4873 = -anInt4873;
		    }
		} else if (anInt4873 < 0) {
		    for (;;) {
			i_3_ = method766(arg0, i_3_, i, arg2,
					 (class14_sub12_sub1.aByteArray4899
					  [anInt4865 - 1]));
			if (anInt4869 >= i)
			    break;
			anInt4869 = i_0_ - 1 - (i_0_ - 1 - anInt4869) % i_2_;
		    }
		} else {
		    for (;;) {
			i_3_ = method770(arg0, i_3_, i_0_, arg2,
					 (class14_sub12_sub1.aByteArray4899
					  [anInt4860]));
			if (anInt4869 < i_0_)
			    break;
			anInt4869 = i + (anInt4869 - i) % i_2_;
		    }
		}
	    } else {
		do {
		    if (anInt4871 > 0) {
			if (aBoolean4861) {
			    if (anInt4873 < 0) {
				i_3_ = method766(arg0, i_3_, i, arg2,
						 (class14_sub12_sub1
						  .aByteArray4899[anInt4860]));
				if (anInt4869 >= i)
				    return;
				anInt4869 = i + i - 1 - anInt4869;
				anInt4873 = -anInt4873;
				if (--anInt4871 == 0)
				    break;
			    }
			    do {
				i_3_ = method770(arg0, i_3_, i_0_, arg2,
						 (class14_sub12_sub1
						  .aByteArray4899
						  [anInt4865 - 1]));
				if (anInt4869 < i_0_)
				    return;
				anInt4869 = i_0_ + i_0_ - 1 - anInt4869;
				anInt4873 = -anInt4873;
				if (--anInt4871 == 0)
				    break;
				i_3_ = method766(arg0, i_3_, i, arg2,
						 (class14_sub12_sub1
						  .aByteArray4899[anInt4860]));
				if (anInt4869 >= i)
				    return;
				anInt4869 = i + i - 1 - anInt4869;
				anInt4873 = -anInt4873;
			    } while (--anInt4871 != 0);
			} else if (anInt4873 < 0) {
			    for (;;) {
				i_3_ = method766(arg0, i_3_, i, arg2,
						 (class14_sub12_sub1
						  .aByteArray4899
						  [anInt4865 - 1]));
				if (anInt4869 >= i)
				    return;
				int i_4_ = (i_0_ - 1 - anInt4869) / i_2_;
				if (i_4_ >= anInt4871) {
				    anInt4869 += i_2_ * anInt4871;
				    anInt4871 = 0;
				    break;
				}
				anInt4869 += i_2_ * i_4_;
				anInt4871 -= i_4_;
			    }
			} else {
			    for (;;) {
				i_3_ = method770(arg0, i_3_, i_0_, arg2,
						 (class14_sub12_sub1
						  .aByteArray4899[anInt4860]));
				if (anInt4869 < i_0_)
				    return;
				int i_5_ = (anInt4869 - i) / i_2_;
				if (i_5_ >= anInt4871) {
				    anInt4869 -= i_2_ * anInt4871;
				    anInt4871 = 0;
				    break;
				}
				anInt4869 -= i_2_ * i_5_;
				anInt4871 -= i_5_;
			    }
			}
		    }
		} while (false);
		if (anInt4873 < 0) {
		    method766(arg0, i_3_, 0, arg2, 0);
		    if (anInt4869 < 0) {
			anInt4869 = -1;
			method742();
			method233(0);
		    }
		} else {
		    method770(arg0, i_3_, i_1_, arg2, 0);
		    if (anInt4869 >= i_1_) {
			anInt4869 = i_1_;
			method742();
			method233(0);
		    }
		}
	    }
	}
    }
    
    public static int method740(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, Class14_Sub9_Sub4 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg2 - (arg8 - 1)) > arg7)
	    arg6 = arg7;
	arg9.anInt4863 += arg9.anInt4862 * (arg6 - arg3);
	arg9.anInt4864 += arg9.anInt4874 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt4870 = arg4 >> 2;
	arg9.anInt4869 = arg2 << 8;
	return arg3;
    }
    
    public synchronized void method741(int arg0) {
	if (anInt4873 < 0)
	    anInt4873 = -arg0;
	else
	    anInt4873 = arg0;
    }
    
    public void method742() {
	if (anInt4867 != 0) {
	    if (anInt4868 == -2147483648)
		anInt4868 = 0;
	    anInt4867 = 0;
	    method745();
	}
    }
    
    public static int method743
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class14_Sub9_Sub4 arg13, int arg14, int arg15) {
	arg13.anInt4870 -= arg13.anInt4872 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 + 256 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || (arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14) / arg14) > arg11)
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt4870 += arg13.anInt4872 * arg5;
	arg13.anInt4863 = arg6;
	arg13.anInt4864 = arg7;
	arg13.anInt4869 = arg4;
	return arg5;
    }
    
    public static int method744
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10, int arg11,
	 int arg12, Class14_Sub9_Sub4 arg13, int arg14, int arg15) {
	arg13.anInt4870 -= arg13.anInt4872 * arg5;
	if (arg14 == 0
	    || (arg10 = arg5 + (arg12 - arg4 + arg14 - 257) / arg14) > arg11)
	    arg10 = arg11;
	arg5 <<= 1;
	arg10 <<= 1;
	while (arg5 < arg10) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	if (arg14 == 0
	    || ((arg10 = (arg5 >> 1) + (arg12 - arg4 + arg14 - 1) / arg14)
		> arg11))
	    arg10 = arg11;
	arg10 <<= 1;
	arg1 = arg15;
	while (arg5 < arg10) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg6 += arg8;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg7 += arg9;
	    arg4 += arg14;
	}
	arg5 >>= 1;
	arg13.anInt4870 += arg13.anInt4872 * arg5;
	arg13.anInt4863 = arg6;
	arg13.anInt4864 = arg7;
	arg13.anInt4869 = arg4;
	return arg5;
    }
    
    public synchronized void method692(int arg0) {
	if (anInt4867 > 0) {
	    if (arg0 >= anInt4867) {
		if (anInt4868 == -2147483648) {
		    anInt4868 = 0;
		    anInt4870 = anInt4863 = anInt4864 = 0;
		    method233(0);
		    arg0 = anInt4867;
		}
		anInt4867 = 0;
		method745();
	    } else {
		anInt4870 += anInt4872 * arg0;
		anInt4863 += anInt4862 * arg0;
		anInt4864 += anInt4874 * arg0;
		anInt4867 -= arg0;
	    }
	}
	Class14_Sub12_Sub1 class14_sub12_sub1
	    = (Class14_Sub12_Sub1) aClass14_Sub12_2866;
	int i = anInt4860 << 8;
	int i_6_ = anInt4865 << 8;
	int i_7_ = class14_sub12_sub1.aByteArray4899.length << 8;
	int i_8_ = i_6_ - i;
	if (i_8_ <= 0)
	    anInt4871 = 0;
	if (anInt4869 < 0) {
	    if (anInt4873 > 0)
		anInt4869 = 0;
	    else {
		method742();
		method233(0);
		return;
	    }
	}
	if (anInt4869 >= i_7_) {
	    if (anInt4873 < 0)
		anInt4869 = i_7_ - 1;
	    else {
		method742();
		method233(0);
		return;
	    }
	}
	anInt4869 += anInt4873 * arg0;
	if (anInt4871 < 0) {
	    if (aBoolean4861) {
		if (anInt4873 < 0) {
		    if (anInt4869 >= i)
			return;
		    anInt4869 = i + i - 1 - anInt4869;
		    anInt4873 = -anInt4873;
		}
		while (anInt4869 >= i_6_) {
		    anInt4869 = i_6_ + i_6_ - 1 - anInt4869;
		    anInt4873 = -anInt4873;
		    if (anInt4869 >= i)
			break;
		    anInt4869 = i + i - 1 - anInt4869;
		    anInt4873 = -anInt4873;
		}
	    } else if (anInt4873 < 0) {
		if (anInt4869 < i)
		    anInt4869 = i_6_ - 1 - (i_6_ - 1 - anInt4869) % i_8_;
	    } else if (anInt4869 >= i_6_)
		anInt4869 = i + (anInt4869 - i) % i_8_;
	} else {
	    do {
		if (anInt4871 > 0) {
		    if (aBoolean4861) {
			if (anInt4873 < 0) {
			    if (anInt4869 >= i)
				return;
			    anInt4869 = i + i - 1 - anInt4869;
			    anInt4873 = -anInt4873;
			    if (--anInt4871 == 0)
				break;
			}
			do {
			    if (anInt4869 < i_6_)
				return;
			    anInt4869 = i_6_ + i_6_ - 1 - anInt4869;
			    anInt4873 = -anInt4873;
			    if (--anInt4871 == 0)
				break;
			    if (anInt4869 >= i)
				return;
			    anInt4869 = i + i - 1 - anInt4869;
			    anInt4873 = -anInt4873;
			} while (--anInt4871 != 0);
		    } else {
			if (anInt4873 < 0) {
			    if (anInt4869 < i) {
				int i_9_ = (i_6_ - 1 - anInt4869) / i_8_;
				if (i_9_ >= anInt4871) {
				    anInt4869 += i_8_ * anInt4871;
				    anInt4871 = 0;
				    break;
				}
				anInt4869 += i_8_ * i_9_;
				anInt4871 -= i_9_;
			    }
			} else if (anInt4869 >= i_6_) {
			    int i_10_ = (anInt4869 - i) / i_8_;
			    if (i_10_ >= anInt4871) {
				anInt4869 -= i_8_ * anInt4871;
				anInt4871 = 0;
				break;
			    }
			    anInt4869 -= i_8_ * i_10_;
			    anInt4871 -= i_10_;
			}
			return;
		    }
		}
	    } while (false);
	    if (anInt4873 < 0) {
		if (anInt4869 < 0) {
		    anInt4869 = -1;
		    method742();
		    method233(0);
		}
	    } else if (anInt4869 >= i_7_) {
		anInt4869 = i_7_;
		method742();
		method233(0);
	    }
	}
    }
    
    public void method745() {
	anInt4870 = anInt4868;
	anInt4863 = method754(anInt4868, anInt4866);
	anInt4864 = method762(anInt4868, anInt4866);
    }
    
    public synchronized void method746(int arg0, int arg1, int arg2) {
	if (arg0 == 0)
	    method756(arg1, arg2);
	else {
	    int i = method754(arg1, arg2);
	    int i_11_ = method762(arg1, arg2);
	    if (anInt4863 == i && anInt4864 == i_11_)
		anInt4867 = 0;
	    else {
		int i_12_ = arg1 - anInt4870;
		if (anInt4870 - arg1 > i_12_)
		    i_12_ = anInt4870 - arg1;
		if (i - anInt4863 > i_12_)
		    i_12_ = i - anInt4863;
		if (anInt4863 - i > i_12_)
		    i_12_ = anInt4863 - i;
		if (i_11_ - anInt4864 > i_12_)
		    i_12_ = i_11_ - anInt4864;
		if (anInt4864 - i_11_ > i_12_)
		    i_12_ = anInt4864 - i_11_;
		if (arg0 > i_12_)
		    arg0 = i_12_;
		anInt4867 = arg0;
		anInt4868 = arg1;
		anInt4866 = arg2;
		anInt4872 = (arg1 - anInt4870) / arg0;
		anInt4862 = (i - anInt4863) / arg0;
		anInt4874 = (i_11_ - anInt4864) / arg0;
	    }
	}
    }
    
    public synchronized void method747(int arg0, int arg1) {
	method746(arg0, arg1, method758());
    }
    
    public boolean method748() {
	return (anInt4869 < 0
		|| anInt4869 >= (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				 .aByteArray4899).length << 8);
    }
    
    public static int method749(int arg0, byte[] arg1, int[] arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, int arg10, int arg11,
				Class14_Sub9_Sub4 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg3 - (arg11 - 1)) > arg10)
	    arg9 = arg10;
	arg12.anInt4870 += arg12.anInt4872 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt4863 = arg5 >> 2;
	arg12.anInt4864 = arg6 >> 2;
	arg12.anInt4869 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static int method750
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class14_Sub9_Sub4 arg11, int arg12, int arg13) {
	arg11.anInt4863 -= arg11.anInt4862 * arg5;
	arg11.anInt4864 -= arg11.anInt4874 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg0 = arg13;
	arg1 = arg12;
	while (arg5 < arg8) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg1;
	}
	arg11.anInt4863 += arg11.anInt4862 * arg5;
	arg11.anInt4864 += arg11.anInt4874 * arg5;
	arg11.anInt4870 = arg6;
	arg11.anInt4869 = arg4;
	return arg5;
    }
    
    public static int method751(int arg0, int arg1, byte[] arg2, int[] arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class14_Sub9_Sub4 arg10,
				int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 + 256 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff)) * arg6
		    >> 6);
	    arg4 += arg11;
	}
	if (arg11 == 0 || (arg7 = arg5 + (arg9 - arg4 + arg11) / arg11) > arg8)
	    arg7 = arg8;
	arg0 = arg12;
	arg1 = arg11;
	while (arg5 < arg7) {
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg4 >> 8] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg1;
	}
	arg10.anInt4869 = arg4;
	return arg5;
    }
    
    public static int method752(int arg0, int arg1, byte[] arg2, int[] arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class14_Sub9_Sub4 arg10,
				int arg11, int arg12) {
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 257) / arg11) > arg8)
	    arg7 = arg8;
	while (arg5 < arg7) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg4 += arg11;
	}
	if (arg11 == 0
	    || (arg7 = arg5 + (arg9 - arg4 + arg11 - 1) / arg11) > arg8)
	    arg7 = arg8;
	arg1 = arg12;
	while (arg5 < arg7) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg4 += arg11;
	}
	arg10.anInt4869 = arg4;
	return arg5;
    }
    
    public static int method753
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class14_Sub9_Sub4 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg0 = (arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || ((arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12 - 1) / arg12)
		> arg9))
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg0 = (arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt4869 = arg4;
	return arg5 >> 1;
    }
    
    public static int method754(int arg0, int arg1) {
	return (arg1 < 0 ? arg0
		: (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1)
						   * 1.220703125E-4)
			 + 0.5));
    }
    
    public static int method755
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class14_Sub9_Sub4 arg11, int arg12, int arg13) {
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 + 256 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg5 <<= 1;
	arg8 <<= 1;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1 - 1];
	    arg0 = (arg0 << 8) + (arg2[arg1] - arg0) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = (arg5 >> 1) + (arg10 - arg4 + arg12) / arg12) > arg9)
	    arg8 = arg9;
	arg8 <<= 1;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = (arg1 << 8) + (arg2[arg4 >> 8] - arg1) * (arg4 & 0xff);
	    arg3[arg5++] += arg0 * arg6 >> 6;
	    arg3[arg5++] += arg0 * arg7 >> 6;
	    arg4 += arg12;
	}
	arg11.anInt4869 = arg4;
	return arg5 >> 1;
    }
    
    public synchronized void method756(int arg0, int arg1) {
	anInt4868 = arg0;
	anInt4866 = arg1;
	anInt4867 = 0;
	method745();
    }
    
    public static int method757(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				Class14_Sub9_Sub4 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg7 - arg2) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2++] * arg4;
	arg8.anInt4869 = arg2 << 8;
	return arg3;
    }
    
    public synchronized int method758() {
	return anInt4866 < 0 ? -1 : anInt4866;
    }
    
    public boolean method759() {
	int i = anInt4868;
	int i_13_;
	int i_14_;
	if (i == -2147483648)
	    i = i_13_ = i_14_ = 0;
	else {
	    i_13_ = method754(i, anInt4866);
	    i_14_ = method762(i, anInt4866);
	}
	if (anInt4870 != i || anInt4863 != i_13_ || anInt4864 != i_14_) {
	    if (anInt4870 < i) {
		anInt4872 = 1;
		anInt4867 = i - anInt4870;
	    } else if (anInt4870 > i) {
		anInt4872 = -1;
		anInt4867 = anInt4870 - i;
	    } else
		anInt4872 = 0;
	    if (anInt4863 < i_13_) {
		anInt4862 = 1;
		if (anInt4867 == 0 || anInt4867 > i_13_ - anInt4863)
		    anInt4867 = i_13_ - anInt4863;
	    } else if (anInt4863 > i_13_) {
		anInt4862 = -1;
		if (anInt4867 == 0 || anInt4867 > anInt4863 - i_13_)
		    anInt4867 = anInt4863 - i_13_;
	    } else
		anInt4862 = 0;
	    if (anInt4864 < i_14_) {
		anInt4874 = 1;
		if (anInt4867 == 0 || anInt4867 > i_14_ - anInt4864)
		    anInt4867 = i_14_ - anInt4864;
	    } else if (anInt4864 > i_14_) {
		anInt4874 = -1;
		if (anInt4867 == 0 || anInt4867 > anInt4864 - i_14_)
		    anInt4867 = anInt4864 - i_14_;
	    } else
		anInt4874 = 0;
	    return false;
	}
	if (anInt4868 == -2147483648) {
	    anInt4868 = 0;
	    anInt4870 = anInt4863 = anInt4864 = 0;
	    method233(0);
	    return true;
	}
	method745();
	return false;
    }
    
    public synchronized void method760(int arg0) {
	method756(arg0, method758());
    }
    
    public static int method761
	(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5,
	 int arg6, int arg7, int arg8, int arg9, int arg10,
	 Class14_Sub9_Sub4 arg11, int arg12, int arg13) {
	arg11.anInt4863 -= arg11.anInt4862 * arg5;
	arg11.anInt4864 -= arg11.anInt4874 * arg5;
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 257) / arg12) > arg9)
	    arg8 = arg9;
	while (arg5 < arg8) {
	    arg1 = arg4 >> 8;
	    arg0 = arg2[arg1];
	    arg3[arg5++]
		+= (((arg0 << 8) + (arg2[arg1 + 1] - arg0) * (arg4 & 0xff))
		    * arg6) >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	if (arg12 == 0
	    || (arg8 = arg5 + (arg10 - arg4 + arg12 - 1) / arg12) > arg9)
	    arg8 = arg9;
	arg1 = arg13;
	while (arg5 < arg8) {
	    arg0 = arg2[arg4 >> 8];
	    arg3[arg5++]
		+= ((arg0 << 8) + (arg1 - arg0) * (arg4 & 0xff)) * arg6 >> 6;
	    arg6 += arg7;
	    arg4 += arg12;
	}
	arg11.anInt4863 += arg11.anInt4862 * arg5;
	arg11.anInt4864 += arg11.anInt4874 * arg5;
	arg11.anInt4870 = arg6;
	arg11.anInt4869 = arg4;
	return arg5;
    }
    
    public static int method762(int arg0, int arg1) {
	return (arg1 < 0 ? -arg0
		: (int) (((double) arg0
			  * Math.sqrt((double) arg1 * 1.220703125E-4))
			 + 0.5));
    }
    
    public static Class14_Sub9_Sub4 method763(Class14_Sub12_Sub1 arg0,
					      int arg1, int arg2, int arg3) {
	if (arg0.aByteArray4899 == null || arg0.aByteArray4899.length == 0)
	    return null;
	return new Class14_Sub9_Sub4(arg0, arg1, arg2, arg3);
    }
    
    public static int method764(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, Class14_Sub9_Sub4 arg9) {
	arg2 >>= 8;
	arg8 >>= 8;
	arg4 <<= 2;
	arg5 <<= 2;
	if ((arg6 = arg3 + arg8 - arg2) > arg7)
	    arg6 = arg7;
	arg9.anInt4863 += arg9.anInt4862 * (arg6 - arg3);
	arg9.anInt4864 += arg9.anInt4874 * (arg6 - arg3);
	arg6 -= 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg6 += 3;
	while (arg3 < arg6) {
	    arg1[arg3++] += arg0[arg2++] * arg4;
	    arg4 += arg5;
	}
	arg9.anInt4870 = arg4 >> 2;
	arg9.anInt4869 = arg2 << 8;
	return arg3;
    }
    
    public synchronized void method765(int arg0) {
	anInt4871 = arg0;
    }
    
    public int method766(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt4867 > 0) {
	    int i = arg1 + anInt4867;
	    if (i > arg3)
		i = arg3;
	    anInt4867 += arg1;
	    if (anInt4873 == -256 && (anInt4869 & 0xff) == 0) {
		if (Class14_Sub2_Sub2.aBoolean3763)
		    arg1 = method749(0,
				     ((Class14_Sub12_Sub1)
				      aClass14_Sub12_2866).aByteArray4899,
				     arg0, anInt4869, arg1, anInt4863,
				     anInt4864, anInt4862, anInt4874, 0, i,
				     arg2, this);
		else
		    arg1 = method740(((Class14_Sub12_Sub1)
				      aClass14_Sub12_2866).aByteArray4899,
				     arg0, anInt4869, arg1, anInt4870,
				     anInt4872, 0, i, arg2, this);
	    } else if (Class14_Sub2_Sub2.aBoolean3763)
		arg1 = method743(0, 0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4863, anInt4864,
				 anInt4862, anInt4874, 0, i, arg2, this,
				 anInt4873, arg4);
	    else
		arg1 = method750(0, 0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4870, anInt4872,
				 0, i, arg2, this, anInt4873, arg4);
	    anInt4867 -= arg1;
	    if (anInt4867 != 0)
		return arg1;
	    if (method759())
		return arg3;
	}
	if (anInt4873 == -256 && (anInt4869 & 0xff) == 0) {
	    if (Class14_Sub2_Sub2.aBoolean3763)
		return method774(0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4863, anInt4864,
				 0, arg3, arg2, this);
	    return method771((((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			      .aByteArray4899),
			     arg0, anInt4869, arg1, anInt4870, 0, arg3, arg2,
			     this);
	}
	if (Class14_Sub2_Sub2.aBoolean3763)
	    return method755(0, 0,
			     (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			      .aByteArray4899),
			     arg0, anInt4869, arg1, anInt4863, anInt4864, 0,
			     arg3, arg2, this, anInt4873, arg4);
	return method751(0, 0,
			 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			  .aByteArray4899),
			 arg0, anInt4869, arg1, anInt4870, 0, arg3, arg2, this,
			 anInt4873, arg4);
    }
    
    public synchronized int method767() {
	return anInt4873 < 0 ? -anInt4873 : anInt4873;
    }
    
    public int method690() {
	if (anInt4868 == 0 && anInt4867 == 0)
	    return 0;
	return 1;
    }
    
    public synchronized void method768(int arg0) {
	method756(arg0 << 6, method758());
    }
    
    public synchronized int method769() {
	return anInt4868 == -2147483648 ? 0 : anInt4868;
    }
    
    public int method691() {
	int i = anInt4870 * 3 >> 6;
	i = (i ^ i >> 31) + (i >>> 31);
	if (anInt4871 == 0)
	    i -= i * anInt4869 / ((((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				   .aByteArray4899).length
				  << 8);
	else if (anInt4871 >= 0)
	    i -= i * anInt4860 / (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899).length;
	return i > 255 ? 255 : i;
    }
    
    public int method770(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
	while (anInt4867 > 0) {
	    int i = arg1 + anInt4867;
	    if (i > arg3)
		i = arg3;
	    anInt4867 += arg1;
	    if (anInt4873 == 256 && (anInt4869 & 0xff) == 0) {
		if (Class14_Sub2_Sub2.aBoolean3763)
		    arg1 = method772(0,
				     ((Class14_Sub12_Sub1)
				      aClass14_Sub12_2866).aByteArray4899,
				     arg0, anInt4869, arg1, anInt4863,
				     anInt4864, anInt4862, anInt4874, 0, i,
				     arg2, this);
		else
		    arg1 = method764(((Class14_Sub12_Sub1)
				      aClass14_Sub12_2866).aByteArray4899,
				     arg0, anInt4869, arg1, anInt4870,
				     anInt4872, 0, i, arg2, this);
	    } else if (Class14_Sub2_Sub2.aBoolean3763)
		arg1 = method744(0, 0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4863, anInt4864,
				 anInt4862, anInt4874, 0, i, arg2, this,
				 anInt4873, arg4);
	    else
		arg1 = method761(0, 0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4870, anInt4872,
				 0, i, arg2, this, anInt4873, arg4);
	    anInt4867 -= arg1;
	    if (anInt4867 != 0)
		return arg1;
	    if (method759())
		return arg3;
	}
	if (anInt4873 == 256 && (anInt4869 & 0xff) == 0) {
	    if (Class14_Sub2_Sub2.aBoolean3763)
		return method773(0,
				 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
				  .aByteArray4899),
				 arg0, anInt4869, arg1, anInt4863, anInt4864,
				 0, arg3, arg2, this);
	    return method757((((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			      .aByteArray4899),
			     arg0, anInt4869, arg1, anInt4870, 0, arg3, arg2,
			     this);
	}
	if (Class14_Sub2_Sub2.aBoolean3763)
	    return method753(0, 0,
			     (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			      .aByteArray4899),
			     arg0, anInt4869, arg1, anInt4863, anInt4864, 0,
			     arg3, arg2, this, anInt4873, arg4);
	return method752(0, 0,
			 (((Class14_Sub12_Sub1) aClass14_Sub12_2866)
			  .aByteArray4899),
			 arg0, anInt4869, arg1, anInt4870, 0, arg3, arg2, this,
			 anInt4873, arg4);
    }
    
    public static int method771(byte[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				Class14_Sub9_Sub4 arg8) {
	arg2 >>= 8;
	arg7 >>= 8;
	arg4 <<= 2;
	if ((arg5 = arg3 + arg2 - (arg7 - 1)) > arg6)
	    arg5 = arg6;
	arg5 -= 3;
	while (arg3 < arg5) {
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	    arg1[arg3++] += arg0[arg2--] * arg4;
	}
	arg5 += 3;
	while (arg3 < arg5)
	    arg1[arg3++] += arg0[arg2--] * arg4;
	arg8.anInt4869 = arg2 << 8;
	return arg3;
    }
    
    public static int method772(int arg0, byte[] arg1, int[] arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, int arg10, int arg11,
				Class14_Sub9_Sub4 arg12) {
	arg3 >>= 8;
	arg11 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	arg7 <<= 2;
	arg8 <<= 2;
	if ((arg9 = arg4 + arg11 - arg3) > arg10)
	    arg9 = arg10;
	arg12.anInt4870 += arg12.anInt4872 * (arg9 - arg4);
	arg4 <<= 1;
	arg9 <<= 1;
	arg9 -= 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg9 += 6;
	while (arg4 < arg9) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg5 += arg7;
	    arg2[arg4++] += arg0 * arg6;
	    arg6 += arg8;
	}
	arg12.anInt4863 = arg5 >> 2;
	arg12.anInt4864 = arg6 >> 2;
	arg12.anInt4869 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static int method773(int arg0, byte[] arg1, int[] arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class14_Sub9_Sub4 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg9 - arg3) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3++];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt4869 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public Class14_Sub9_Sub4(Class14_Sub12_Sub1 arg0, int arg1, int arg2) {
	aClass14_Sub12_2866 = arg0;
	anInt4860 = arg0.anInt4896;
	anInt4865 = arg0.anInt4898;
	aBoolean4861 = arg0.aBoolean4897;
	anInt4873 = arg1;
	anInt4868 = arg2;
	anInt4866 = 8192;
	anInt4869 = 0;
	method745();
    }
    
    public static int method774(int arg0, byte[] arg1, int[] arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, Class14_Sub9_Sub4 arg10) {
	arg3 >>= 8;
	arg9 >>= 8;
	arg5 <<= 2;
	arg6 <<= 2;
	if ((arg7 = arg4 + arg3 - (arg9 - 1)) > arg8)
	    arg7 = arg8;
	arg4 <<= 1;
	arg7 <<= 1;
	arg7 -= 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg7 += 6;
	while (arg4 < arg7) {
	    arg0 = arg1[arg3--];
	    arg2[arg4++] += arg0 * arg5;
	    arg2[arg4++] += arg0 * arg6;
	}
	arg10.anInt4869 = arg3 << 8;
	return arg4 >> 1;
    }
    
    public static Class14_Sub9_Sub4 method775(Class14_Sub12_Sub1 arg0,
					      int arg1, int arg2) {
	if (arg0.aByteArray4899 == null || arg0.aByteArray4899.length == 0)
	    return null;
	return new Class14_Sub9_Sub4(arg0,
				     (int) ((long) arg0.anInt4895 * 256L
					    * (long) arg1
					    / (long) (100
						      * Class115.anInt1909)),
				     arg2 << 6);
    }
    
    public boolean method776() {
	return anInt4867 != 0;
    }
    
    public Class14_Sub9 method688() {
	return null;
    }
    
    public synchronized void method777(int arg0) {
	if (arg0 == 0) {
	    method760(0);
	    method233(0);
	} else if (anInt4863 == 0 && anInt4864 == 0) {
	    anInt4867 = 0;
	    anInt4868 = 0;
	    anInt4870 = 0;
	    method233(0);
	} else {
	    int i = -anInt4870;
	    if (anInt4870 > i)
		i = anInt4870;
	    if (-anInt4863 > i)
		i = -anInt4863;
	    if (anInt4863 > i)
		i = anInt4863;
	    if (-anInt4864 > i)
		i = -anInt4864;
	    if (anInt4864 > i)
		i = anInt4864;
	    if (arg0 > i)
		arg0 = i;
	    anInt4867 = arg0;
	    anInt4868 = -2147483648;
	    anInt4872 = -anInt4870 / arg0;
	    anInt4862 = -anInt4863 / arg0;
	    anInt4874 = -anInt4864 / arg0;
	}
    }
    
    public Class14_Sub9_Sub4(Class14_Sub12_Sub1 arg0, int arg1, int arg2,
			     int arg3) {
	aClass14_Sub12_2866 = arg0;
	anInt4860 = arg0.anInt4896;
	anInt4865 = arg0.anInt4898;
	aBoolean4861 = arg0.aBoolean4897;
	anInt4873 = arg1;
	anInt4868 = arg2;
	anInt4866 = arg3;
	anInt4869 = 0;
	method745();
    }
    
    public synchronized void method778(int arg0) {
	int i
	    = (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899.length
	       << 8);
	if (arg0 < -1)
	    arg0 = -1;
	if (arg0 > i)
	    arg0 = i;
	anInt4869 = arg0;
    }
    
    public synchronized void method779(boolean arg0) {
	anInt4873 = (anInt4873 ^ anInt4873 >> 31) + (anInt4873 >>> 31);
	if (arg0)
	    anInt4873 = -anInt4873;
    }
}
