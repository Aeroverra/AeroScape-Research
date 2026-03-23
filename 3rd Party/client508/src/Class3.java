/* Class3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class3
{
    public static boolean aBoolean103 = false;
    public static boolean aBoolean104;
    public static int[] anIntArray105 = new int[2048];
    public static int anInt106;
    public static boolean aBoolean107;
    public static int[] anIntArray108;
    public static int anInt109;
    public static int anInt110;
    public static int[] anIntArray111;
    public static boolean aBoolean112;
    public static int[] anIntArray113;
    public static int[] anIntArray114;
    public static float aFloat115;
    public static int anInt116;
    public static Interface3 anInterface3_117;
    public static int anInt118;
    public static int[] anIntArray119;
    public static boolean aBoolean120;
    
    public static void method90(int arg0, int arg1) {
	int i = anIntArray113[0];
	int i_0_ = i / Class92.anInt1432;
	int i_1_ = i - i_0_ * Class92.anInt1432;
	anInt118 = arg0 - i_1_;
	anInt110 = arg1 - i_0_;
	Class20.anInt425 = -anInt118;
	Class14_Sub8_Sub27.anInt4547 = anInt109 - anInt118;
	Class58.anInt948 = -anInt110;
	Class70.anInt1081 = anInt106 - anInt110;
    }
    
    public static void method91(byte[] arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7) {
	int i = 0;
	if (arg2 != arg1)
	    i = (arg5 - arg4 << 16) / (arg2 - arg1);
	int i_2_ = 0;
	if (arg3 != arg2)
	    i_2_ = (arg6 - arg5 << 16) / (arg3 - arg2);
	int i_3_ = 0;
	if (arg3 != arg1)
	    i_3_ = (arg4 - arg6 << 16) / (arg1 - arg3);
	if (arg1 <= arg2 && arg1 <= arg3) {
	    if (arg2 < arg3) {
		arg6 = arg4 <<= 16;
		if (arg1 < 0) {
		    arg6 -= i_3_ * arg1;
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		arg5 <<= 16;
		if (arg2 < 0) {
		    arg5 -= i_2_ * arg2;
		    arg2 = 0;
		}
		if (arg1 != arg2 && i_3_ < i || arg1 == arg2 && i_3_ > i_2_) {
		    arg3 -= arg2;
		    arg2 -= arg1;
		    arg1 *= arg7;
		    while (--arg2 >= 0) {
			method99(arg0, arg1, 0, arg6 >> 16, arg4 >> 16);
			arg6 += i_3_;
			arg4 += i;
			arg1 += arg7;
		    }
		    while (--arg3 >= 0) {
			method99(arg0, arg1, 0, arg6 >> 16, arg5 >> 16);
			arg6 += i_3_;
			arg5 += i_2_;
			arg1 += arg7;
		    }
		} else {
		    arg3 -= arg2;
		    arg2 -= arg1;
		    arg1 *= arg7;
		    while (--arg2 >= 0) {
			method99(arg0, arg1, 0, arg4 >> 16, arg6 >> 16);
			arg6 += i_3_;
			arg4 += i;
			arg1 += arg7;
		    }
		    while (--arg3 >= 0) {
			method99(arg0, arg1, 0, arg5 >> 16, arg6 >> 16);
			arg6 += i_3_;
			arg5 += i_2_;
			arg1 += arg7;
		    }
		}
	    } else {
		arg5 = arg4 <<= 16;
		if (arg1 < 0) {
		    arg5 -= i_3_ * arg1;
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		arg6 <<= 16;
		if (arg3 < 0) {
		    arg6 -= i_2_ * arg3;
		    arg3 = 0;
		}
		if (arg1 != arg3 && i_3_ < i || arg1 == arg3 && i_2_ > i) {
		    arg2 -= arg3;
		    arg3 -= arg1;
		    arg1 *= arg7;
		    while (--arg3 >= 0) {
			method99(arg0, arg1, 0, arg5 >> 16, arg4 >> 16);
			arg5 += i_3_;
			arg4 += i;
			arg1 += arg7;
		    }
		    while (--arg2 >= 0) {
			method99(arg0, arg1, 0, arg6 >> 16, arg4 >> 16);
			arg6 += i_2_;
			arg4 += i;
			arg1 += arg7;
		    }
		} else {
		    arg2 -= arg3;
		    arg3 -= arg1;
		    arg1 *= arg7;
		    while (--arg3 >= 0) {
			method99(arg0, arg1, 0, arg4 >> 16, arg5 >> 16);
			arg5 += i_3_;
			arg4 += i;
			arg1 += arg7;
		    }
		    while (--arg2 >= 0) {
			method99(arg0, arg1, 0, arg4 >> 16, arg6 >> 16);
			arg6 += i_2_;
			arg4 += i;
			arg1 += arg7;
		    }
		}
	    }
	} else if (arg2 <= arg3) {
	    if (arg3 < arg1) {
		arg4 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg4 -= i * arg2;
		    arg5 -= i_2_ * arg2;
		    arg2 = 0;
		}
		arg6 <<= 16;
		if (arg3 < 0) {
		    arg6 -= i_3_ * arg3;
		    arg3 = 0;
		}
		if (arg2 != arg3 && i < i_2_ || arg2 == arg3 && i > i_3_) {
		    arg1 -= arg3;
		    arg3 -= arg2;
		    arg2 *= arg7;
		    while (--arg3 >= 0) {
			method99(arg0, arg2, 0, arg4 >> 16, arg5 >> 16);
			arg4 += i;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		    while (--arg1 >= 0) {
			method99(arg0, arg2, 0, arg4 >> 16, arg6 >> 16);
			arg4 += i;
			arg6 += i_3_;
			arg2 += arg7;
		    }
		} else {
		    arg1 -= arg3;
		    arg3 -= arg2;
		    arg2 *= arg7;
		    while (--arg3 >= 0) {
			method99(arg0, arg2, 0, arg5 >> 16, arg4 >> 16);
			arg4 += i;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		    while (--arg1 >= 0) {
			method99(arg0, arg2, 0, arg6 >> 16, arg4 >> 16);
			arg4 += i;
			arg6 += i_3_;
			arg2 += arg7;
		    }
		}
	    } else {
		arg6 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg6 -= i * arg2;
		    arg5 -= i_2_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		if (arg1 < 0) {
		    arg4 -= i_3_ * arg1;
		    arg1 = 0;
		}
		if (i < i_2_) {
		    arg3 -= arg1;
		    arg1 -= arg2;
		    arg2 *= arg7;
		    while (--arg1 >= 0) {
			method99(arg0, arg2, 0, arg6 >> 16, arg5 >> 16);
			arg6 += i;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		    while (--arg3 >= 0) {
			method99(arg0, arg2, 0, arg4 >> 16, arg5 >> 16);
			arg4 += i_3_;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		} else {
		    arg3 -= arg1;
		    arg1 -= arg2;
		    arg2 *= arg7;
		    while (--arg1 >= 0) {
			method99(arg0, arg2, 0, arg5 >> 16, arg6 >> 16);
			arg6 += i;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		    while (--arg3 >= 0) {
			method99(arg0, arg2, 0, arg5 >> 16, arg4 >> 16);
			arg4 += i_3_;
			arg5 += i_2_;
			arg2 += arg7;
		    }
		}
	    }
	} else if (arg1 < arg2) {
	    arg5 = arg6 <<= 16;
	    if (arg3 < 0) {
		arg5 -= i_2_ * arg3;
		arg6 -= i_3_ * arg3;
		arg3 = 0;
	    }
	    arg4 <<= 16;
	    if (arg1 < 0) {
		arg4 -= i * arg1;
		arg1 = 0;
	    }
	    if (i_2_ < i_3_) {
		arg2 -= arg1;
		arg1 -= arg3;
		arg3 *= arg7;
		while (--arg1 >= 0) {
		    method99(arg0, arg3, 0, arg5 >> 16, arg6 >> 16);
		    arg5 += i_2_;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
		while (--arg2 >= 0) {
		    method99(arg0, arg3, 0, arg5 >> 16, arg4 >> 16);
		    arg5 += i_2_;
		    arg4 += i;
		    arg3 += arg7;
		}
	    } else {
		arg2 -= arg1;
		arg1 -= arg3;
		arg3 *= arg7;
		while (--arg1 >= 0) {
		    method99(arg0, arg3, 0, arg6 >> 16, arg5 >> 16);
		    arg5 += i_2_;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
		while (--arg2 >= 0) {
		    method99(arg0, arg3, 0, arg4 >> 16, arg5 >> 16);
		    arg5 += i_2_;
		    arg4 += i;
		    arg3 += arg7;
		}
	    }
	} else {
	    arg4 = arg6 <<= 16;
	    if (arg3 < 0) {
		arg4 -= i_2_ * arg3;
		arg6 -= i_3_ * arg3;
		arg3 = 0;
	    }
	    arg5 <<= 16;
	    if (arg2 < 0) {
		arg5 -= i * arg2;
		arg2 = 0;
	    }
	    if (i_2_ < i_3_) {
		arg1 -= arg2;
		arg2 -= arg3;
		arg3 *= arg7;
		while (--arg2 >= 0) {
		    method99(arg0, arg3, 0, arg4 >> 16, arg6 >> 16);
		    arg4 += i_2_;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
		while (--arg1 >= 0) {
		    method99(arg0, arg3, 0, arg5 >> 16, arg6 >> 16);
		    arg5 += i;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
	    } else {
		arg1 -= arg2;
		arg2 -= arg3;
		arg3 *= arg7;
		while (--arg2 >= 0) {
		    method99(arg0, arg3, 0, arg6 >> 16, arg4 >> 16);
		    arg4 += i_2_;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
		while (--arg1 >= 0) {
		    method99(arg0, arg3, 0, arg6 >> 16, arg5 >> 16);
		    arg5 += i;
		    arg6 += i_3_;
		    arg3 += arg7;
		}
	    }
	}
    }
    
    public static void method92(int[] arg0, int arg1, int arg2, int arg3,
				int arg4, int arg5) {
	if (aBoolean112) {
	    if (arg5 > anInt109)
		arg5 = anInt109;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg3 = arg5 - arg4 >> 2;
	    if (anInt116 == 0) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		    arg0[arg1++] = arg2;
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg2;
	    } else if (anInt116 == 254) {
		while (--arg3 >= 0) {
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		    arg0[arg1++] = arg0[arg1];
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0)
		    arg0[arg1++] = arg0[arg1];
	    } else {
		int i = anInt116;
		int i_4_ = 256 - anInt116;
		arg2 = (((arg2 & 0xff00ff) * i_4_ >> 8 & 0xff00ff)
			+ ((arg2 & 0xff00) * i_4_ >> 8 & 0xff00));
		while (--arg3 >= 0) {
		    int i_5_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_5_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_5_ & 0xff00) * i >> 8 & 0xff00));
		    i_5_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_5_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_5_ & 0xff00) * i >> 8 & 0xff00));
		    i_5_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_5_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_5_ & 0xff00) * i >> 8 & 0xff00));
		    i_5_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_5_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_5_ & 0xff00) * i >> 8 & 0xff00));
		}
		arg3 = arg5 - arg4 & 0x3;
		while (--arg3 >= 0) {
		    int i_6_ = arg0[arg1];
		    arg0[arg1++]
			= (arg2 + ((i_6_ & 0xff00ff) * i >> 8 & 0xff00ff)
			   + ((i_6_ & 0xff00) * i >> 8 & 0xff00));
		}
	    }
	}
    }
    
    public static void method93(Interface3 arg0) {
	anInterface3_117 = arg0;
    }
    
    public static void method94(int arg0, int arg1) {
	int i = arg0 * 128;
	for (int i_7_ = arg0; i_7_ < arg1; i_7_++) {
	    double d = (double) (i_7_ >> 3) / 64.0 + 0.0078125;
	    double d_8_ = (double) (i_7_ & 0x7) / 8.0 + 0.0625;
	    for (int i_9_ = 0; i_9_ < 128; i_9_++) {
		double d_10_ = (double) i_9_ / 128.0;
		double d_11_ = d_10_;
		double d_12_ = d_10_;
		double d_13_ = d_10_;
		if (d_8_ != 0.0) {
		    double d_14_;
		    if (d_10_ < 0.5)
			d_14_ = d_10_ * (1.0 + d_8_);
		    else
			d_14_ = d_10_ + d_8_ - d_10_ * d_8_;
		    double d_15_ = 2.0 * d_10_ - d_14_;
		    double d_16_ = d + 0.3333333333333333;
		    if (d_16_ > 1.0)
			d_16_--;
		    double d_17_ = d;
		    double d_18_ = d - 0.3333333333333333;
		    if (d_18_ < 0.0)
			d_18_++;
		    if (6.0 * d_16_ < 1.0)
			d_11_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_16_;
		    else if (2.0 * d_16_ < 1.0)
			d_11_ = d_14_;
		    else if (3.0 * d_16_ < 2.0)
			d_11_ = d_15_ + ((d_14_ - d_15_)
					 * (0.6666666666666666 - d_16_) * 6.0);
		    else
			d_11_ = d_15_;
		    if (6.0 * d_17_ < 1.0)
			d_12_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_17_;
		    else if (2.0 * d_17_ < 1.0)
			d_12_ = d_14_;
		    else if (3.0 * d_17_ < 2.0)
			d_12_ = d_15_ + ((d_14_ - d_15_)
					 * (0.6666666666666666 - d_17_) * 6.0);
		    else
			d_12_ = d_15_;
		    if (6.0 * d_18_ < 1.0)
			d_13_ = d_15_ + (d_14_ - d_15_) * 6.0 * d_18_;
		    else if (2.0 * d_18_ < 1.0)
			d_13_ = d_14_;
		    else if (3.0 * d_18_ < 2.0)
			d_13_ = d_15_ + ((d_14_ - d_15_)
					 * (0.6666666666666666 - d_18_) * 6.0);
		    else
			d_13_ = d_15_;
		}
		d_11_ = Math.pow(d_11_, (double) aFloat115);
		d_12_ = Math.pow(d_12_, (double) aFloat115);
		d_13_ = Math.pow(d_13_, (double) aFloat115);
		int i_19_ = (int) (d_11_ * 256.0);
		int i_20_ = (int) (d_12_ * 256.0);
		int i_21_ = (int) (d_13_ * 256.0);
		int i_22_ = (i_19_ << 16) + (i_20_ << 8) + i_21_;
		if (i_22_ == 0)
		    i_22_ = 1;
		anIntArray119[i++] = i_22_;
	    }
	}
    }
    
    public static void method95(float arg0) {
	aFloat115 = arg0;
	aFloat115 += Math.random() * 0.03 - 0.015;
    }
    
    public static void method96(int[] arg0, int[] arg1, int arg2, int arg3,
				int arg4, int arg5, int arg6, int arg7,
				int arg8, int arg9, int arg10, int arg11,
				int arg12, int arg13, int arg14) {
	if (aBoolean112) {
	    if (arg6 > anInt109)
		arg6 = anInt109;
	    if (arg5 < 0)
		arg5 = 0;
	}
	if (arg5 < arg6) {
	    arg4 += arg5;
	    arg7 += arg8 * arg5;
	    int i = arg6 - arg5;
	    if (aBoolean120) {
		int i_23_ = arg5 - anInt118;
		arg9 += (arg12 >> 3) * i_23_;
		arg10 += (arg13 >> 3) * i_23_;
		arg11 += (arg14 >> 3) * i_23_;
		int i_24_ = arg11 >> 12;
		int i_25_;
		int i_26_;
		if (i_24_ != 0) {
		    i_25_ = arg9 / i_24_;
		    i_26_ = arg10 / i_24_;
		} else {
		    i_25_ = 0;
		    i_26_ = 0;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		i_24_ = arg11 >> 12;
		int i_27_;
		int i_28_;
		if (i_24_ != 0) {
		    i_27_ = arg9 / i_24_;
		    i_28_ = arg10 / i_24_;
		} else {
		    i_27_ = 0;
		    i_28_ = 0;
		}
		arg2 = (i_25_ << 20) + i_26_;
		int i_29_ = (i_27_ - i_25_ >> 3 << 20) + (i_28_ - i_26_ >> 3);
		i >>= 3;
		arg8 <<= 3;
		int i_30_ = arg7 >> 8;
		if (aBoolean104) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			    i_25_ = i_27_;
			    i_26_ = i_28_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_24_ = arg11 >> 12;
			    if (i_24_ != 0) {
				i_27_ = arg9 / i_24_;
				i_28_ = arg10 / i_24_;
			    } else {
				i_27_ = 0;
				i_28_ = 0;
			    }
			    arg2 = (i_25_ << 20) + i_26_;
			    i_29_ = (i_27_ - i_25_ >> 3 << 20) + (i_28_ - i_26_
								  >> 3);
			    arg7 += arg8;
			    i_30_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_30_ & 0xff0000))
				   >> 8);
			    arg2 += i_29_;
			} while (--i > 0);
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			    i_25_ = i_27_;
			    i_26_ = i_28_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_24_ = arg11 >> 12;
			    if (i_24_ != 0) {
				i_27_ = arg9 / i_24_;
				i_28_ = arg10 / i_24_;
			    } else {
				i_27_ = 0;
				i_28_ = 0;
			    }
			    arg2 = (i_25_ << 20) + i_26_;
			    i_29_ = (i_27_ - i_25_ >> 3 << 20) + (i_28_ - i_26_
								  >> 3);
			    arg7 += arg8;
			    i_30_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0xfc0) + (arg2 >>> 26)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_30_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_30_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_29_;
			} while (--i > 0);
		    }
		}
	    } else {
		int i_31_ = arg5 - anInt118;
		arg9 += (arg12 >> 3) * i_31_;
		arg10 += (arg13 >> 3) * i_31_;
		arg11 += (arg14 >> 3) * i_31_;
		int i_32_ = arg11 >> 14;
		int i_33_;
		int i_34_;
		if (i_32_ != 0) {
		    i_33_ = arg9 / i_32_;
		    i_34_ = arg10 / i_32_;
		} else {
		    i_33_ = 0;
		    i_34_ = 0;
		}
		arg9 += arg12;
		arg10 += arg13;
		arg11 += arg14;
		i_32_ = arg11 >> 14;
		int i_35_;
		int i_36_;
		if (i_32_ != 0) {
		    i_35_ = arg9 / i_32_;
		    i_36_ = arg10 / i_32_;
		} else {
		    i_35_ = 0;
		    i_36_ = 0;
		}
		arg2 = (i_33_ << 18) + i_34_;
		int i_37_ = (i_35_ - i_33_ >> 3 << 18) + (i_36_ - i_34_ >> 3);
		i >>= 3;
		arg8 <<= 3;
		int i_38_ = arg7 >> 8;
		if (aBoolean104) {
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			    i_33_ = i_35_;
			    i_34_ = i_36_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_32_ = arg11 >> 14;
			    if (i_32_ != 0) {
				i_35_ = arg9 / i_32_;
				i_36_ = arg10 / i_32_;
			    } else {
				i_35_ = 0;
				i_36_ = 0;
			    }
			    arg2 = (i_33_ << 18) + i_34_;
			    i_37_ = (i_35_ - i_33_ >> 3 << 18) + (i_36_ - i_34_
								  >> 3);
			    arg7 += arg8;
			    i_38_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)];
			    arg0[arg4++]
				= ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
				    + ((arg3 & 0xff00) * i_38_ & 0xff0000))
				   >> 8);
			    arg2 += i_37_;
			} while (--i > 0);
		    }
		} else {
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			    i_33_ = i_35_;
			    i_34_ = i_36_;
			    arg9 += arg12;
			    arg10 += arg13;
			    arg11 += arg14;
			    i_32_ = arg11 >> 14;
			    if (i_32_ != 0) {
				i_35_ = arg9 / i_32_;
				i_36_ = arg10 / i_32_;
			    } else {
				i_35_ = 0;
				i_36_ = 0;
			    }
			    arg2 = (i_33_ << 18) + i_34_;
			    i_37_ = (i_35_ - i_33_ >> 3 << 18) + (i_36_ - i_34_
								  >> 3);
			    arg7 += arg8;
			    i_38_ = arg7 >> 8;
			} while (--i > 0);
		    }
		    i = arg6 - arg5 & 0x7;
		    if (i > 0) {
			do {
			    if ((arg3 = arg1[(arg2 & 0x3f80) + (arg2 >>> 25)])
				!= 0)
				arg0[arg4]
				    = ((((arg3 & 0xff00ff) * i_38_ & ~0xff00ff)
					+ ((arg3 & 0xff00) * i_38_ & 0xff0000))
				       >> 8);
			    arg4++;
			    arg2 += i_37_;
			} while (--i > 0);
		    }
		}
	    }
	}
    }
    
    public static void method97() {
	method101(Class92.anInt1433, Class92.anInt1438, Class92.anInt1434,
		  Class92.anInt1436);
    }
    
    public static void method98
	(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6,
	 int arg7, int arg8, int arg9, int arg10, int arg11, int arg12,
	 int arg13, int arg14, int arg15, int arg16, int arg17, int arg18) {
	int[] is = anInterface3_117.method11(aFloat115, arg18, 31);
	if (is == null || anInt116 > 10) {
	    int i = anInterface3_117.method5(arg18, (byte) -121);
	    aBoolean103 = true;
	    method104(arg0, arg1, arg2, arg3, arg4, arg5, method100(i, arg6),
		      method100(i, arg7), method100(i, arg8));
	} else {
	    aBoolean120 = anInterface3_117.method15(1, arg18);
	    aBoolean104 = anInterface3_117.method6(arg18, -105);
	    int i = arg4 - arg3;
	    int i_39_ = arg1 - arg0;
	    int i_40_ = arg5 - arg3;
	    int i_41_ = arg2 - arg0;
	    int i_42_ = arg7 - arg6;
	    int i_43_ = arg8 - arg6;
	    int i_44_ = 0;
	    if (arg1 != arg0)
		i_44_ = (arg4 - arg3 << 16) / (arg1 - arg0);
	    int i_45_ = 0;
	    if (arg2 != arg1)
		i_45_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	    int i_46_ = 0;
	    if (arg2 != arg0)
		i_46_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	    int i_47_ = i * i_41_ - i_40_ * i_39_;
	    if (i_47_ != 0) {
		int i_48_ = (i_42_ * i_41_ - i_43_ * i_39_ << 9) / i_47_;
		int i_49_ = (i_43_ * i - i_42_ * i_40_ << 9) / i_47_;
		arg10 = arg9 - arg10;
		arg13 = arg12 - arg13;
		arg16 = arg15 - arg16;
		arg11 -= arg9;
		arg14 -= arg12;
		arg17 -= arg15;
		int i_50_ = arg11 * arg12 - arg14 * arg9 << 14;
		int i_51_ = arg14 * arg15 - arg17 * arg12 << 8;
		int i_52_ = arg17 * arg9 - arg11 * arg15 << 5;
		int i_53_ = arg10 * arg12 - arg13 * arg9 << 14;
		int i_54_ = arg13 * arg15 - arg16 * arg12 << 8;
		int i_55_ = arg16 * arg9 - arg10 * arg15 << 5;
		int i_56_ = arg13 * arg11 - arg10 * arg14 << 14;
		int i_57_ = arg16 * arg14 - arg13 * arg17 << 8;
		int i_58_ = arg10 * arg17 - arg16 * arg11 << 5;
		if (arg0 <= arg1 && arg0 <= arg2) {
		    if (arg0 < anInt106) {
			if (arg1 > anInt106)
			    arg1 = anInt106;
			if (arg2 > anInt106)
			    arg2 = anInt106;
			arg6 = (arg6 << 9) - i_48_ * arg3 + i_48_;
			if (arg1 < arg2) {
			    arg5 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg5 -= i_46_ * arg0;
				arg3 -= i_44_ * arg0;
				arg6 -= i_49_ * arg0;
				arg0 = 0;
			    }
			    arg4 <<= 16;
			    if (arg1 < 0) {
				arg4 -= i_45_ * arg1;
				arg1 = 0;
			    }
			    int i_59_ = arg0 - anInt110;
			    i_50_ += i_52_ * i_59_;
			    i_53_ += i_55_ * i_59_;
			    i_56_ += i_58_ * i_59_;
			    if (arg0 != arg1 && i_46_ < i_44_
				|| arg0 == arg1 && i_46_ > i_45_) {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray113[arg0];
				while (--arg1 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg5 >> 16, arg3 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_46_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg5 >> 16, arg4 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_46_;
				    arg4 += i_45_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    } else {
				arg2 -= arg1;
				arg1 -= arg0;
				arg0 = anIntArray113[arg0];
				while (--arg1 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg3 >> 16, arg5 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_46_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg4 >> 16, arg5 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_46_;
				    arg4 += i_45_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    }
			} else {
			    arg4 = arg3 <<= 16;
			    if (arg0 < 0) {
				arg4 -= i_46_ * arg0;
				arg3 -= i_44_ * arg0;
				arg6 -= i_49_ * arg0;
				arg0 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_45_ * arg2;
				arg2 = 0;
			    }
			    int i_60_ = arg0 - anInt110;
			    i_50_ += i_52_ * i_60_;
			    i_53_ += i_55_ * i_60_;
			    i_56_ += i_58_ * i_60_;
			    if (arg0 != arg2 && i_46_ < i_44_
				|| arg0 == arg2 && i_45_ > i_44_) {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray113[arg0];
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg4 >> 16, arg3 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg4 += i_46_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg1 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg5 >> 16, arg3 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_45_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    } else {
				arg1 -= arg2;
				arg2 -= arg0;
				arg0 = anIntArray113[arg0];
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg3 >> 16, arg4 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg4 += i_46_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg1 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg0, arg3 >> 16, arg5 >> 16,
					     arg6, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_45_;
				    arg3 += i_44_;
				    arg6 += i_49_;
				    arg0 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    }
			}
		    }
		} else if (arg1 <= arg2) {
		    if (arg1 < anInt106) {
			if (arg2 > anInt106)
			    arg2 = anInt106;
			if (arg0 > anInt106)
			    arg0 = anInt106;
			arg7 = (arg7 << 9) - i_48_ * arg4 + i_48_;
			if (arg2 < arg0) {
			    arg3 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg3 -= i_44_ * arg1;
				arg4 -= i_45_ * arg1;
				arg7 -= i_49_ * arg1;
				arg1 = 0;
			    }
			    arg5 <<= 16;
			    if (arg2 < 0) {
				arg5 -= i_46_ * arg2;
				arg2 = 0;
			    }
			    int i_61_ = arg1 - anInt110;
			    i_50_ += i_52_ * i_61_;
			    i_53_ += i_55_ * i_61_;
			    i_56_ += i_58_ * i_61_;
			    if (arg1 != arg2 && i_44_ < i_45_
				|| arg1 == arg2 && i_44_ > i_46_) {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray113[arg1];
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg3 >> 16, arg4 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_44_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg0 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg3 >> 16, arg5 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_44_;
				    arg5 += i_46_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    } else {
				arg0 -= arg2;
				arg2 -= arg1;
				arg1 = anIntArray113[arg1];
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg4 >> 16, arg3 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_44_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg0 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg5 >> 16, arg3 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_44_;
				    arg5 += i_46_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    }
			} else {
			    arg5 = arg4 <<= 16;
			    if (arg1 < 0) {
				arg5 -= i_44_ * arg1;
				arg4 -= i_45_ * arg1;
				arg7 -= i_49_ * arg1;
				arg1 = 0;
			    }
			    arg3 <<= 16;
			    if (arg0 < 0) {
				arg3 -= i_46_ * arg0;
				arg0 = 0;
			    }
			    int i_62_ = arg1 - anInt110;
			    i_50_ += i_52_ * i_62_;
			    i_53_ += i_55_ * i_62_;
			    i_56_ += i_58_ * i_62_;
			    if (i_44_ < i_45_) {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray113[arg1];
				while (--arg0 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg5 >> 16, arg4 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_44_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg3 >> 16, arg4 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_46_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    } else {
				arg2 -= arg0;
				arg0 -= arg1;
				arg1 = anIntArray113[arg1];
				while (--arg0 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg4 >> 16, arg5 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg5 += i_44_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
				while (--arg2 >= 0) {
				    method96(Class92.anIntArray1437, is, 0, 0,
					     arg1, arg4 >> 16, arg3 >> 16,
					     arg7, i_48_, i_50_, i_53_, i_56_,
					     i_51_, i_54_, i_57_);
				    arg3 += i_46_;
				    arg4 += i_45_;
				    arg7 += i_49_;
				    arg1 += Class92.anInt1432;
				    i_50_ += i_52_;
				    i_53_ += i_55_;
				    i_56_ += i_58_;
				}
			    }
			}
		    }
		} else if (arg2 < anInt106) {
		    if (arg0 > anInt106)
			arg0 = anInt106;
		    if (arg1 > anInt106)
			arg1 = anInt106;
		    arg8 = (arg8 << 9) - i_48_ * arg5 + i_48_;
		    if (arg0 < arg1) {
			arg4 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg4 -= i_45_ * arg2;
			    arg5 -= i_46_ * arg2;
			    arg8 -= i_49_ * arg2;
			    arg2 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_44_ * arg0;
			    arg0 = 0;
			}
			int i_63_ = arg2 - anInt110;
			i_50_ += i_52_ * i_63_;
			i_53_ += i_55_ * i_63_;
			i_56_ += i_58_ * i_63_;
			if (i_45_ < i_46_) {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray113[arg2];
			    while (--arg0 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg4 >> 16, arg5 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_45_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			    while (--arg1 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg4 >> 16, arg3 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_45_;
				arg3 += i_44_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			} else {
			    arg1 -= arg0;
			    arg0 -= arg2;
			    arg2 = anIntArray113[arg2];
			    while (--arg0 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg5 >> 16, arg4 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_45_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			    while (--arg1 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg3 >> 16, arg4 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_45_;
				arg3 += i_44_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			}
		    } else {
			arg3 = arg5 <<= 16;
			if (arg2 < 0) {
			    arg3 -= i_45_ * arg2;
			    arg5 -= i_46_ * arg2;
			    arg8 -= i_49_ * arg2;
			    arg2 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_44_ * arg1;
			    arg1 = 0;
			}
			int i_64_ = arg2 - anInt110;
			i_50_ += i_52_ * i_64_;
			i_53_ += i_55_ * i_64_;
			i_56_ += i_58_ * i_64_;
			if (i_45_ < i_46_) {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray113[arg2];
			    while (--arg1 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg3 >> 16, arg5 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg3 += i_45_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			    while (--arg0 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg4 >> 16, arg5 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_44_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			} else {
			    arg0 -= arg1;
			    arg1 -= arg2;
			    arg2 = anIntArray113[arg2];
			    while (--arg1 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg5 >> 16, arg3 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg3 += i_45_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			    while (--arg0 >= 0) {
				method96(Class92.anIntArray1437, is, 0, 0,
					 arg2, arg5 >> 16, arg4 >> 16, arg8,
					 i_48_, i_50_, i_53_, i_56_, i_51_,
					 i_54_, i_57_);
				arg4 += i_44_;
				arg5 += i_46_;
				arg8 += i_49_;
				arg2 += Class92.anInt1432;
				i_50_ += i_52_;
				i_53_ += i_55_;
				i_56_ += i_58_;
			    }
			}
		    }
		}
	    }
	}
    }
    
    public static void method99(byte[] arg0, int arg1, int arg2, int arg3,
				int arg4) {
	if (arg3 < arg4) {
	    arg1 += arg3;
	    arg2 = arg4 - arg3 >> 2;
	    while (--arg2 >= 0) {
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
		arg0[arg1++] = (byte) 1;
	    }
	    arg2 = arg4 - arg3 & 0x3;
	    while (--arg2 >= 0)
		arg0[arg1++] = (byte) 1;
	}
    }
    
    public static int method100(int arg0, int arg1) {
	arg1 = arg1 * (arg0 & 0x7f) >> 7;
	if (arg1 < 2)
	    arg1 = 2;
	else if (arg1 > 126)
	    arg1 = 126;
	return (arg0 & 0xff80) + arg1;
    }
    
    public static void method101(int arg0, int arg1, int arg2, int arg3) {
	anInt109 = arg2 - arg0;
	anInt106 = arg3 - arg1;
	method102();
	if (anIntArray113.length < anInt106)
	    anIntArray113
		= new int[Class14_Sub8_Sub33.method653(anInt106, 89)];
	int i = arg1 * Class92.anInt1432 + arg0;
	for (int i_65_ = 0; i_65_ < anInt106; i_65_++) {
	    anIntArray113[i_65_] = i;
	    i += Class92.anInt1432;
	}
    }
    
    public static void method102() {
	anInt118 = anInt109 / 2;
	anInt110 = anInt106 / 2;
	Class20.anInt425 = -anInt118;
	Class14_Sub8_Sub27.anInt4547 = anInt109 - anInt118;
	Class58.anInt948 = -anInt110;
	Class70.anInt1081 = anInt106 - anInt110;
    }
    
    public static void method103(float arg0) {
	method95(arg0);
	method94(0, 512);
    }
    
    public static void method104(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = arg4 - arg3;
	int i_66_ = arg1 - arg0;
	int i_67_ = arg5 - arg3;
	int i_68_ = arg2 - arg0;
	int i_69_ = arg7 - arg6;
	int i_70_ = arg8 - arg6;
	int i_71_;
	if (arg2 != arg1)
	    i_71_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	else
	    i_71_ = 0;
	int i_72_;
	if (arg1 != arg0)
	    i_72_ = (i << 16) / i_66_;
	else
	    i_72_ = 0;
	int i_73_;
	if (arg2 != arg0)
	    i_73_ = (i_67_ << 16) / i_68_;
	else
	    i_73_ = 0;
	int i_74_ = i * i_68_ - i_67_ * i_66_;
	if (i_74_ != 0) {
	    int i_75_ = (i_69_ * i_68_ - i_70_ * i_66_ << 8) / i_74_;
	    int i_76_ = (i_70_ * i - i_69_ * i_67_ << 8) / i_74_;
	    if (arg0 <= arg1 && arg0 <= arg2) {
		if (arg0 < anInt106) {
		    if (arg1 > anInt106)
			arg1 = anInt106;
		    if (arg2 > anInt106)
			arg2 = anInt106;
		    arg6 = (arg6 << 8) - i_75_ * arg3 + i_75_;
		    if (arg1 < arg2) {
			arg5 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg5 -= i_73_ * arg0;
			    arg3 -= i_72_ * arg0;
			    arg6 -= i_76_ * arg0;
			    arg0 = 0;
			}
			arg4 <<= 16;
			if (arg1 < 0) {
			    arg4 -= i_71_ * arg1;
			    arg1 = 0;
			}
			if (arg0 != arg1 && i_73_ < i_72_
			    || arg0 == arg1 && i_73_ > i_71_) {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray113[arg0];
			    while (--arg1 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6, i_75_);
				arg5 += i_73_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg6, i_75_);
				arg5 += i_73_;
				arg4 += i_71_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			} else {
			    arg2 -= arg1;
			    arg1 -= arg0;
			    arg0 = anIntArray113[arg0];
			    while (--arg1 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6, i_75_);
				arg5 += i_73_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg6, i_75_);
				arg5 += i_73_;
				arg4 += i_71_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			}
		    } else {
			arg4 = arg3 <<= 16;
			if (arg0 < 0) {
			    arg4 -= i_73_ * arg0;
			    arg3 -= i_72_ * arg0;
			    arg6 -= i_76_ * arg0;
			    arg0 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_71_ * arg2;
			    arg2 = 0;
			}
			if (arg0 != arg2 && i_73_ < i_72_
			    || arg0 == arg2 && i_71_ > i_72_) {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray113[arg0];
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg6, i_75_);
				arg4 += i_73_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			    while (--arg1 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg6, i_75_);
				arg5 += i_71_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			} else {
			    arg1 -= arg2;
			    arg2 -= arg0;
			    arg0 = anIntArray113[arg0];
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg6, i_75_);
				arg4 += i_73_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			    while (--arg1 >= 0) {
				method105(Class92.anIntArray1437, arg0, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg6, i_75_);
				arg5 += i_71_;
				arg3 += i_72_;
				arg6 += i_76_;
				arg0 += Class92.anInt1432;
			    }
			}
		    }
		}
	    } else if (arg1 <= arg2) {
		if (arg1 < anInt106) {
		    if (arg2 > anInt106)
			arg2 = anInt106;
		    if (arg0 > anInt106)
			arg0 = anInt106;
		    arg7 = (arg7 << 8) - i_75_ * arg4 + i_75_;
		    if (arg2 < arg0) {
			arg3 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg3 -= i_72_ * arg1;
			    arg4 -= i_71_ * arg1;
			    arg7 -= i_76_ * arg1;
			    arg1 = 0;
			}
			arg5 <<= 16;
			if (arg2 < 0) {
			    arg5 -= i_73_ * arg2;
			    arg2 = 0;
			}
			if (arg1 != arg2 && i_72_ < i_71_
			    || arg1 == arg2 && i_72_ > i_73_) {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray113[arg1];
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7, i_75_);
				arg3 += i_72_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			    while (--arg0 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg3 >> 16, arg5 >> 16, arg7, i_75_);
				arg3 += i_72_;
				arg5 += i_73_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			} else {
			    arg0 -= arg2;
			    arg2 -= arg1;
			    arg1 = anIntArray113[arg1];
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7, i_75_);
				arg3 += i_72_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			    while (--arg0 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg5 >> 16, arg3 >> 16, arg7, i_75_);
				arg3 += i_72_;
				arg5 += i_73_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			}
		    } else {
			arg5 = arg4 <<= 16;
			if (arg1 < 0) {
			    arg5 -= i_72_ * arg1;
			    arg4 -= i_71_ * arg1;
			    arg7 -= i_76_ * arg1;
			    arg1 = 0;
			}
			arg3 <<= 16;
			if (arg0 < 0) {
			    arg3 -= i_73_ * arg0;
			    arg0 = 0;
			}
			if (i_72_ < i_71_) {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray113[arg1];
			    while (--arg0 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg5 >> 16, arg4 >> 16, arg7, i_75_);
				arg5 += i_72_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg3 >> 16, arg4 >> 16, arg7, i_75_);
				arg3 += i_73_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			} else {
			    arg2 -= arg0;
			    arg0 -= arg1;
			    arg1 = anIntArray113[arg1];
			    while (--arg0 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg4 >> 16, arg5 >> 16, arg7, i_75_);
				arg5 += i_72_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			    while (--arg2 >= 0) {
				method105(Class92.anIntArray1437, arg1, 0, 0,
					  arg4 >> 16, arg3 >> 16, arg7, i_75_);
				arg3 += i_73_;
				arg4 += i_71_;
				arg7 += i_76_;
				arg1 += Class92.anInt1432;
			    }
			}
		    }
		}
	    } else if (arg2 < anInt106) {
		if (arg0 > anInt106)
		    arg0 = anInt106;
		if (arg1 > anInt106)
		    arg1 = anInt106;
		arg8 = (arg8 << 8) - i_75_ * arg5 + i_75_;
		if (arg0 < arg1) {
		    arg4 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg4 -= i_71_ * arg2;
			arg5 -= i_73_ * arg2;
			arg8 -= i_76_ * arg2;
			arg2 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_72_ * arg0;
			arg0 = 0;
		    }
		    if (i_71_ < i_73_) {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray113[arg2];
			while (--arg0 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg4 >> 16, arg5 >> 16, arg8, i_75_);
			    arg4 += i_71_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
			while (--arg1 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg4 >> 16, arg3 >> 16, arg8, i_75_);
			    arg4 += i_71_;
			    arg3 += i_72_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
		    } else {
			arg1 -= arg0;
			arg0 -= arg2;
			arg2 = anIntArray113[arg2];
			while (--arg0 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg5 >> 16, arg4 >> 16, arg8, i_75_);
			    arg4 += i_71_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
			while (--arg1 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg3 >> 16, arg4 >> 16, arg8, i_75_);
			    arg4 += i_71_;
			    arg3 += i_72_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
		    }
		} else {
		    arg3 = arg5 <<= 16;
		    if (arg2 < 0) {
			arg3 -= i_71_ * arg2;
			arg5 -= i_73_ * arg2;
			arg8 -= i_76_ * arg2;
			arg2 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_72_ * arg1;
			arg1 = 0;
		    }
		    if (i_71_ < i_73_) {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray113[arg2];
			while (--arg1 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg3 >> 16, arg5 >> 16, arg8, i_75_);
			    arg3 += i_71_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
			while (--arg0 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg4 >> 16, arg5 >> 16, arg8, i_75_);
			    arg4 += i_72_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
		    } else {
			arg0 -= arg1;
			arg1 -= arg2;
			arg2 = anIntArray113[arg2];
			while (--arg1 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg5 >> 16, arg3 >> 16, arg8, i_75_);
			    arg3 += i_71_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
			while (--arg0 >= 0) {
			    method105(Class92.anIntArray1437, arg2, 0, 0,
				      arg5 >> 16, arg4 >> 16, arg8, i_75_);
			    arg4 += i_72_;
			    arg5 += i_73_;
			    arg8 += i_76_;
			    arg2 += Class92.anInt1432;
			}
		    }
		}
	    }
	}
    }
    
    public static void method105(int[] arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	if (aBoolean112) {
	    if (arg5 > anInt109)
		arg5 = anInt109;
	    if (arg4 < 0)
		arg4 = 0;
	}
	if (arg4 < arg5) {
	    arg1 += arg4;
	    arg6 += arg7 * arg4;
	    if (aBoolean107) {
		arg3 = arg5 - arg4 >> 2;
		arg7 <<= 2;
		if (anInt116 == 0) {
		    if (arg3 > 0) {
			do {
			    arg2 = anIntArray119[arg6 >> 8];
			    arg6 += arg7;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			    arg0[arg1++] = arg2;
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = anIntArray119[arg6 >> 8];
			do
			    arg0[arg1++] = arg2;
			while (--arg3 > 0);
		    }
		} else {
		    int i = anInt116;
		    int i_77_ = 256 - anInt116;
		    if (arg3 > 0) {
			do {
			    arg2 = anIntArray119[arg6 >> 8];
			    arg6 += arg7;
			    arg2 = (((arg2 & 0xff00ff) * i_77_ >> 8 & 0xff00ff)
				    + ((arg2 & 0xff00) * i_77_ >> 8 & 0xff00));
			    int i_78_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_78_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_78_ & 0xff00) * i >> 8 & 0xff00));
			    i_78_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_78_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_78_ & 0xff00) * i >> 8 & 0xff00));
			    i_78_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_78_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_78_ & 0xff00) * i >> 8 & 0xff00));
			    i_78_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_78_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_78_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		    arg3 = arg5 - arg4 & 0x3;
		    if (arg3 > 0) {
			arg2 = anIntArray119[arg6 >> 8];
			arg2 = (((arg2 & 0xff00ff) * i_77_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_77_ >> 8 & 0xff00));
			do {
			    int i_79_ = arg0[arg1];
			    arg0[arg1++]
				= (arg2
				   + ((i_79_ & 0xff00ff) * i >> 8 & 0xff00ff)
				   + ((i_79_ & 0xff00) * i >> 8 & 0xff00));
			} while (--arg3 > 0);
		    }
		}
	    } else {
		arg3 = arg5 - arg4;
		if (anInt116 == 0) {
		    do {
			arg0[arg1++] = anIntArray119[arg6 >> 8];
			arg6 += arg7;
		    } while (--arg3 > 0);
		} else {
		    int i = anInt116;
		    int i_80_ = 256 - anInt116;
		    do {
			arg2 = anIntArray119[arg6 >> 8];
			arg6 += arg7;
			arg2 = (((arg2 & 0xff00ff) * i_80_ >> 8 & 0xff00ff)
				+ ((arg2 & 0xff00) * i_80_ >> 8 & 0xff00));
			int i_81_ = arg0[arg1];
			arg0[arg1++]
			    = (arg2 + ((i_81_ & 0xff00ff) * i >> 8 & 0xff00ff)
			       + ((i_81_ & 0xff00) * i >> 8 & 0xff00));
		    } while (--arg3 > 0);
		}
	    }
	}
    }
    
    public static void method106() {
	anIntArray113 = null;
	anIntArray119 = null;
	anInterface3_117 = null;
	anIntArray114 = null;
	anIntArray105 = null;
	anIntArray108 = null;
	anIntArray111 = null;
    }
    
    public static void method107(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6) {
	int i = 0;
	if (arg1 != arg0)
	    i = (arg4 - arg3 << 16) / (arg1 - arg0);
	int i_82_ = 0;
	if (arg2 != arg1)
	    i_82_ = (arg5 - arg4 << 16) / (arg2 - arg1);
	int i_83_ = 0;
	if (arg2 != arg0)
	    i_83_ = (arg3 - arg5 << 16) / (arg0 - arg2);
	if (arg0 <= arg1 && arg0 <= arg2) {
	    if (arg0 < anInt106) {
		if (arg1 > anInt106)
		    arg1 = anInt106;
		if (arg2 > anInt106)
		    arg2 = anInt106;
		if (arg1 < arg2) {
		    arg5 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg5 -= i_83_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg4 <<= 16;
		    if (arg1 < 0) {
			arg4 -= i_82_ * arg1;
			arg1 = 0;
		    }
		    if (arg0 != arg1 && i_83_ < i
			|| arg0 == arg1 && i_83_ > i_82_) {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray113[arg0];
			while (--arg1 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg5 >> 16, arg3 >> 16);
			    arg5 += i_83_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg5 >> 16, arg4 >> 16);
			    arg5 += i_83_;
			    arg4 += i_82_;
			    arg0 += Class92.anInt1432;
			}
		    } else {
			arg2 -= arg1;
			arg1 -= arg0;
			arg0 = anIntArray113[arg0];
			while (--arg1 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg3 >> 16, arg5 >> 16);
			    arg5 += i_83_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg4 >> 16, arg5 >> 16);
			    arg5 += i_83_;
			    arg4 += i_82_;
			    arg0 += Class92.anInt1432;
			}
		    }
		} else {
		    arg4 = arg3 <<= 16;
		    if (arg0 < 0) {
			arg4 -= i_83_ * arg0;
			arg3 -= i * arg0;
			arg0 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_82_ * arg2;
			arg2 = 0;
		    }
		    if (arg0 != arg2 && i_83_ < i
			|| arg0 == arg2 && i_82_ > i) {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray113[arg0];
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg4 >> 16, arg3 >> 16);
			    arg4 += i_83_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
			while (--arg1 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg5 >> 16, arg3 >> 16);
			    arg5 += i_82_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
		    } else {
			arg1 -= arg2;
			arg2 -= arg0;
			arg0 = anIntArray113[arg0];
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg3 >> 16, arg4 >> 16);
			    arg4 += i_83_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
			while (--arg1 >= 0) {
			    method92(Class92.anIntArray1437, arg0, arg6, 0,
				     arg3 >> 16, arg5 >> 16);
			    arg5 += i_82_;
			    arg3 += i;
			    arg0 += Class92.anInt1432;
			}
		    }
		}
	    }
	} else if (arg1 <= arg2) {
	    if (arg1 < anInt106) {
		if (arg2 > anInt106)
		    arg2 = anInt106;
		if (arg0 > anInt106)
		    arg0 = anInt106;
		if (arg2 < arg0) {
		    arg3 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg3 -= i * arg1;
			arg4 -= i_82_ * arg1;
			arg1 = 0;
		    }
		    arg5 <<= 16;
		    if (arg2 < 0) {
			arg5 -= i_83_ * arg2;
			arg2 = 0;
		    }
		    if (arg1 != arg2 && i < i_82_
			|| arg1 == arg2 && i > i_83_) {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray113[arg1];
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg3 >> 16, arg4 >> 16);
			    arg3 += i;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
			while (--arg0 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg3 >> 16, arg5 >> 16);
			    arg3 += i;
			    arg5 += i_83_;
			    arg1 += Class92.anInt1432;
			}
		    } else {
			arg0 -= arg2;
			arg2 -= arg1;
			arg1 = anIntArray113[arg1];
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg4 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
			while (--arg0 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg5 >> 16, arg3 >> 16);
			    arg3 += i;
			    arg5 += i_83_;
			    arg1 += Class92.anInt1432;
			}
		    }
		} else {
		    arg5 = arg4 <<= 16;
		    if (arg1 < 0) {
			arg5 -= i * arg1;
			arg4 -= i_82_ * arg1;
			arg1 = 0;
		    }
		    arg3 <<= 16;
		    if (arg0 < 0) {
			arg3 -= i_83_ * arg0;
			arg0 = 0;
		    }
		    if (i < i_82_) {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray113[arg1];
			while (--arg0 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg5 >> 16, arg4 >> 16);
			    arg5 += i;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg3 >> 16, arg4 >> 16);
			    arg3 += i_83_;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
		    } else {
			arg2 -= arg0;
			arg0 -= arg1;
			arg1 = anIntArray113[arg1];
			while (--arg0 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg4 >> 16, arg5 >> 16);
			    arg5 += i;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
			while (--arg2 >= 0) {
			    method92(Class92.anIntArray1437, arg1, arg6, 0,
				     arg4 >> 16, arg3 >> 16);
			    arg3 += i_83_;
			    arg4 += i_82_;
			    arg1 += Class92.anInt1432;
			}
		    }
		}
	    }
	} else if (arg2 < anInt106) {
	    if (arg0 > anInt106)
		arg0 = anInt106;
	    if (arg1 > anInt106)
		arg1 = anInt106;
	    if (arg0 < arg1) {
		arg4 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg4 -= i_82_ * arg2;
		    arg5 -= i_83_ * arg2;
		    arg2 = 0;
		}
		arg3 <<= 16;
		if (arg0 < 0) {
		    arg3 -= i * arg0;
		    arg0 = 0;
		}
		if (i_82_ < i_83_) {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray113[arg2];
		    while (--arg0 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg4 >> 16, arg5 >> 16);
			arg4 += i_82_;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		    while (--arg1 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg4 >> 16, arg3 >> 16);
			arg4 += i_82_;
			arg3 += i;
			arg2 += Class92.anInt1432;
		    }
		} else {
		    arg1 -= arg0;
		    arg0 -= arg2;
		    arg2 = anIntArray113[arg2];
		    while (--arg0 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg5 >> 16, arg4 >> 16);
			arg4 += i_82_;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		    while (--arg1 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg3 >> 16, arg4 >> 16);
			arg4 += i_82_;
			arg3 += i;
			arg2 += Class92.anInt1432;
		    }
		}
	    } else {
		arg3 = arg5 <<= 16;
		if (arg2 < 0) {
		    arg3 -= i_82_ * arg2;
		    arg5 -= i_83_ * arg2;
		    arg2 = 0;
		}
		arg4 <<= 16;
		if (arg1 < 0) {
		    arg4 -= i * arg1;
		    arg1 = 0;
		}
		if (i_82_ < i_83_) {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray113[arg2];
		    while (--arg1 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg3 >> 16, arg5 >> 16);
			arg3 += i_82_;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		    while (--arg0 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg4 >> 16, arg5 >> 16);
			arg4 += i;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		} else {
		    arg0 -= arg1;
		    arg1 -= arg2;
		    arg2 = anIntArray113[arg2];
		    while (--arg1 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg5 >> 16, arg3 >> 16);
			arg3 += i_82_;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		    while (--arg0 >= 0) {
			method92(Class92.anIntArray1437, arg2, arg6, 0,
				 arg5 >> 16, arg4 >> 16);
			arg4 += i;
			arg5 += i_83_;
			arg2 += Class92.anInt1432;
		    }
		}
	    }
	}
    }
    
    static {
	aBoolean104 = false;
	anIntArray111 = new int[2048];
	aFloat115 = 1.0F;
	anIntArray114 = new int[512];
	anInt116 = 0;
	aBoolean107 = true;
	anIntArray113 = new int[1024];
	anIntArray108 = new int[2048];
	aBoolean112 = false;
	anIntArray119 = new int[65536];
	aBoolean120 = false;
	for (int i = 1; i < 512; i++)
	    anIntArray114[i] = 32768 / i;
	for (int i = 1; i < 2048; i++)
	    anIntArray105[i] = 65536 / i;
	for (int i = 0; i < 2048; i++) {
	    anIntArray108[i]
		= (int) (65536.0 * Math.sin((double) i * 0.0030679615));
	    anIntArray111[i]
		= (int) (65536.0 * Math.cos((double) i * 0.0030679615));
	}
    }
}
