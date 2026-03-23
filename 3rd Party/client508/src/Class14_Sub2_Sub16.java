/* Class14_Sub2_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Random;

public abstract class Class14_Sub2_Sub16 extends Class14_Sub2
{
    public int[] anIntArray3966;
    public static Class124 aClass124_3967;
    public int[] anIntArray3968;
    public int anInt3969;
    public static Class124 aClass124_3970;
    public Class148[] aClass148Array3971;
    public static Class124 aClass124_3972;
    public static Class124 aClass124_3973;
    public static Class124 aClass124_3974;
    public static Class124 aClass124_3975;
    public static Class124 aClass124_3976
	= Class14_Sub2_Sub2.method263(1178, "str=");
    public static Class124 aClass124_3977;
    public int anInt3978 = 0;
    public static Class124 aClass124_3979;
    public byte[] aByteArray3980;
    public static Class124 aClass124_3981;
    public static Class124 aClass124_3982;
    public static Class124 aClass124_3983;
    public static Class124 aClass124_3984;
    public static Class124 aClass124_3985;
    public static Class124 aClass124_3986;
    public static Class124 aClass124_3987;
    public static Class124 aClass124_3988;
    public int[] anIntArray3989;
    public static Class124 aClass124_3990;
    public int[] anIntArray3991;
    public static Class124 aClass124_3992;
    public int[] anIntArray3993;
    public static Class124 aClass124_3994;
    public static Class124 aClass124_3995;
    public int[] anIntArray3996;
    public static Class124 aClass124_3997;
    public static Class124 aClass124_3998;
    public int anInt3999;
    public static Class124 aClass124_4000;
    public static int anInt4001;
    public static int anInt4002;
    public static int anInt4003;
    public static int anInt4004;
    public static int anInt4005;
    public static int anInt4006;
    public static int anInt4007;
    public static int anInt4008;
    public static int anInt4009;
    public static int anInt4010;
    public static Class124[] aClass124Array4011;
    
    public int method342(int arg0) {
	return anIntArray3996[arg0 & 0xff];
    }
    
    public void method343(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4, int arg5, int arg6) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    double d = 7.0 - (double) arg6 / 8.0;
	    if (d < 0.0)
		d = 0.0;
	    int[] is = new int[arg0.anInt2507];
	    for (int i = 0; i < arg0.anInt2507; i++)
		is[i] = (int) (Math.sin((double) i / 1.5 + (double) arg5 / 1.0)
			       * d);
	    method355(arg0, arg1 - method361(arg0) / 2, arg2, null, is);
	}
    }
    
    public int method344(Class124 arg0, int arg1) {
	int i = method351(arg0, new int[] { arg1 }, aClass124Array4011);
	int i_0_ = 0;
	for (int i_1_ = 0; i_1_ < i; i_1_++) {
	    int i_2_ = method361(aClass124Array4011[i_1_]);
	    if (i_2_ > i_0_)
		i_0_ = i_2_;
	}
	return i_0_;
    }
    
    public void method345(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    method356(arg0, arg1 - method361(arg0) / 2, arg2);
	}
    }
    
    public void method346(int arg0, int arg1, int arg2) {
	anInt4010 = -1;
	anInt4009 = -1;
	anInt4002 = anInt4004 = arg1;
	anInt4007 = anInt4005 = arg0;
	anInt4003 = anInt4001 = arg2;
	anInt4006 = 0;
	anInt4008 = 0;
    }
    
    public void method347(Class124 arg0) {
	try {
	    if (arg0.method1690(aClass124_3979, 33))
		anInt4007 = arg0.method1696(4, 15).method1671(255, 16);
	    else if (arg0.method1704(aClass124_3998, (byte) 93))
		anInt4007 = anInt4005;
	    else if (arg0.method1690(aClass124_4000, 33))
		anInt4003 = arg0.method1696(6, 15).method1702(126);
	    else if (arg0.method1704(aClass124_3974, (byte) 105))
		anInt4003 = anInt4001;
	    else if (arg0.method1690(aClass124_3976, 33))
		anInt4010 = arg0.method1696(4, 15).method1671(255, 16);
	    else if (arg0.method1704(aClass124_3987, (byte) 112))
		anInt4010 = 8388608;
	    else if (arg0.method1704(aClass124_3984, (byte) 121))
		anInt4010 = -1;
	    else if (arg0.method1690(aClass124_3983, 33))
		anInt4009 = arg0.method1696(2, 15).method1671(255, 16);
	    else if (arg0.method1704(aClass124_3994, (byte) 93))
		anInt4009 = 0;
	    else if (arg0.method1704(aClass124_3972, (byte) 69))
		anInt4009 = -1;
	    else if (arg0.method1690(aClass124_3981, 33))
		anInt4002 = arg0.method1696(5, 15).method1671(255, 16);
	    else if (arg0.method1704(aClass124_3970, (byte) 64))
		anInt4002 = 0;
	    else if (arg0.method1704(aClass124_3973, (byte) 97))
		anInt4002 = anInt4004;
	    else if (arg0.method1704(aClass124_3988, (byte) 115))
		method346(anInt4005, anInt4004, anInt4001);
	} catch (Exception exception) {
	    /* empty */
	}
    }
    
    public void method348(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    method356(arg0, arg1 - method361(arg0), arg2);
	}
    }
    
    public abstract void method349(int i, int i_3_, int i_4_, int i_5_,
				   int i_6_, int i_7_, boolean bool);
    
    public int method350(Class124 arg0, int arg1, int arg2, int arg3, int arg4,
			 Random arg5, int arg6) {
	if (arg0 == null)
	    return 0;
	arg5.setSeed((long) arg6);
	method346(arg3, arg4, 192 + (arg5.nextInt() & 0x1f));
	int[] is = new int[arg0.anInt2507];
	int i = 0;
	for (int i_8_ = 0; i_8_ < arg0.anInt2507; i_8_++) {
	    is[i_8_] = i;
	    if ((arg5.nextInt() & 0x3) == 0)
		i++;
	}
	method355(arg0, arg1, arg2, is, null);
	return i;
    }
    
    public int method351(Class124 arg0, int[] arg1, Class124[] arg2) {
	if (arg0 == null)
	    return 0;
	aClass124_3975.method1699(0, (byte) 42);
	int i = 0;
	int i_9_ = 0;
	int i_10_ = -1;
	int i_11_ = 0;
	int i_12_ = 0;
	int i_13_ = -1;
	int i_14_ = -1;
	int i_15_ = 0;
	int i_16_ = arg0.method1693(0);
	for (int i_17_ = 0; i_17_ < i_16_; i_17_++) {
	    int i_18_ = arg0.method1710(0, i_17_);
	    if (i_18_ == 60)
		i_13_ = i_17_;
	    else {
		if (i_18_ == 62 && i_13_ != -1) {
		    Class124 class124
			= arg0.method1697(i_13_ + 1, i_17_, (byte) -104);
		    i_13_ = -1;
		    aClass124_3975.method1686((byte) -5, 60);
		    aClass124_3975.method1675((byte) -128, class124);
		    aClass124_3975.method1686((byte) -5, 62);
		    if (class124.method1704(aClass124_3988, (byte) 97)) {
			if (arg2[i_15_] != null) {
			    arg2[i_15_].method1699(0, (byte) 75);
			    arg2[i_15_]
				= arg2[i_15_].method1668(aClass124_3975,
							 aClass124_3975
							     .method1693(0),
							 0, i_9_);
			} else
			    arg2[i_15_]
				= aClass124_3975.method1697(i_9_,
							    aClass124_3975
								.method1693(0),
							    (byte) -104);
			i_15_++;
			i_9_ = aClass124_3975.method1693(0);
			i = 0;
			i_10_ = -1;
			i_14_ = -1;
		    } else if (class124.method1704(aClass124_3995,
						   (byte) 96)) {
			i += method342(60);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 60];
			i_14_ = 60;
		    } else if (class124.method1704(aClass124_3982,
						   (byte) 69)) {
			i += method342(62);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 62];
			i_14_ = 62;
		    } else if (class124.method1704(aClass124_3986,
						   (byte) 99)) {
			i += method342(160);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 160];
			i_14_ = 160;
		    } else if (class124.method1704(aClass124_3967,
						   (byte) 63)) {
			i += method342(173);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 173];
			i_14_ = 173;
		    } else if (class124.method1704(aClass124_3977,
						   (byte) 64)) {
			i += method342(215);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 215];
			i_14_ = 215;
		    } else if (class124.method1704(aClass124_3985,
						   (byte) 51)) {
			i += method342(128);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 128];
			i_14_ = 128;
		    } else if (class124.method1704(aClass124_3997,
						   (byte) 76)) {
			i += method342(169);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 169];
			i_14_ = 169;
		    } else if (class124.method1704(aClass124_3990,
						   (byte) 120)) {
			i += method342(174);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + 174];
			i_14_ = 174;
		    } else if (class124.method1690(aClass124_3992, 33)) {
			try {
			    int i_19_
				= class124.method1696(4, 15).method1702(106);
			    i += aClass148Array3971[i_19_].anInt2378;
			    i_14_ = -1;
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		    i_18_ = -1;
		}
		if (i_13_ == -1) {
		    if (i_18_ != -1) {
			aClass124_3975.method1686((byte) -5, i_18_);
			i += method342(i_18_);
			if (aByteArray3980 != null && i_14_ != -1)
			    i += aByteArray3980[(i_14_ << 8) + i_18_];
			i_14_ = i_18_;
		    }
		    if (i_18_ == 32) {
			i_10_ = aClass124_3975.method1693(0);
			i_11_ = i;
			i_12_ = 1;
		    }
		    if (arg1 != null
			&& i > arg1[(i_15_ < arg1.length ? i_15_
				     : arg1.length - 1)]
			&& i_10_ >= 0) {
			if (arg2[i_15_] != null) {
			    arg2[i_15_].method1699(0, (byte) 52);
			    arg2[i_15_]
				= arg2[i_15_].method1668(aClass124_3975,
							 i_10_ - i_12_, 0,
							 i_9_);
			} else
			    arg2[i_15_]
				= aClass124_3975.method1697(i_9_,
							    i_10_ - i_12_,
							    (byte) -104);
			i_15_++;
			i_9_ = i_10_;
			i_10_ = -1;
			i -= i_11_;
			i_14_ = -1;
		    }
		    if (i_18_ == 45) {
			i_10_ = aClass124_3975.method1693(0);
			i_11_ = i;
			i_12_ = 0;
		    }
		}
	    }
	}
	if (aClass124_3975.method1693(0) > i_9_) {
	    if (arg2[i_15_] != null) {
		arg2[i_15_].method1699(0, (byte) 120);
		arg2[i_15_]
		    = arg2[i_15_].method1668(aClass124_3975,
					     aClass124_3975.method1693(0), 0,
					     i_9_);
	    } else
		arg2[i_15_]
		    = aClass124_3975.method1697(i_9_,
						aClass124_3975.method1693(0),
						(byte) -104);
	    i_15_++;
	}
	return i_15_;
    }
    
    public void method352(Class148[] arg0, int[] arg1) {
	if (arg1 != null && arg1.length != arg0.length)
	    throw new IllegalArgumentException();
	aClass148Array3971 = arg0;
	anIntArray3968 = arg1;
    }
    
    public void method353(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4, int arg5) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    int[] is = new int[arg0.anInt2507];
	    for (int i = 0; i < arg0.anInt2507; i++)
		is[i] = (int) (Math.sin((double) i / 2.0 + (double) arg5 / 5.0)
			       * 5.0);
	    method355(arg0, arg1 - method361(arg0) / 2, arg2, null, is);
	}
    }
    
    public void method354(int arg0, int arg1) {
	anInt4010 = -1;
	anInt4009 = -1;
	anInt4002 = anInt4004 = arg1;
	anInt4007 = anInt4005 = arg0;
	anInt4003 = anInt4001 = 256;
	anInt4006 = 0;
	anInt4008 = 0;
    }
    
    public void method355(Class124 arg0, int arg1, int arg2, int[] arg3,
			  int[] arg4) {
	arg2 -= anInt3978;
	int i = -1;
	int i_20_ = -1;
	int i_21_ = 0;
	for (int i_22_ = 0; i_22_ < arg0.anInt2507; i_22_++) {
	    int i_23_ = arg0.aByteArray2495[i_22_] & 0xff;
	    if (i_23_ == 60)
		i = i_22_;
	    else {
		if (i_23_ == 62 && i != -1) {
		    Class124 class124
			= arg0.method1697(i + 1, i_22_, (byte) -104);
		    i = -1;
		    if (class124.method1704(aClass124_3995, (byte) 90))
			i_23_ = 60;
		    else if (class124.method1704(aClass124_3982, (byte) 116))
			i_23_ = 62;
		    else if (class124.method1704(aClass124_3986, (byte) 78))
			i_23_ = 160;
		    else if (class124.method1704(aClass124_3967, (byte) 127))
			i_23_ = 173;
		    else if (class124.method1704(aClass124_3977, (byte) 80))
			i_23_ = 215;
		    else if (class124.method1704(aClass124_3985, (byte) 111))
			i_23_ = 128;
		    else if (class124.method1704(aClass124_3997, (byte) 74))
			i_23_ = 169;
		    else if (class124.method1704(aClass124_3990, (byte) 114))
			i_23_ = 174;
		    else {
			if (class124.method1690(aClass124_3992, 33)) {
			    try {
				int i_24_;
				if (arg3 != null)
				    i_24_ = arg3[i_21_];
				else
				    i_24_ = 0;
				int i_25_;
				if (arg4 != null)
				    i_25_ = arg4[i_21_];
				else
				    i_25_ = 0;
				i_21_++;
				int i_26_ = class124.method1696(4, 15)
						.method1702(78);
				Class148 class148 = aClass148Array3971[i_26_];
				int i_27_ = (anIntArray3968 != null
					     ? anIntArray3968[i_26_]
					     : class148.anInt2373);
				if (anInt4003 == 256)
				    class148.method2001(arg1 + i_24_,
							(arg2 + anInt3978
							 - i_27_ + i_25_));
				else
				    class148.method1999(arg1 + i_24_,
							(arg2 + anInt3978
							 - i_27_ + i_25_),
							anInt4003);
				arg1 += class148.anInt2378;
				i_20_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method347(class124);
			continue;
		    }
		}
		if (i == -1) {
		    if (aByteArray3980 != null && i_20_ != -1)
			arg1 += aByteArray3980[(i_20_ << 8) + i_23_];
		    int i_28_ = anIntArray3989[i_23_];
		    int i_29_ = anIntArray3991[i_23_];
		    int i_30_;
		    if (arg3 != null)
			i_30_ = arg3[i_21_];
		    else
			i_30_ = 0;
		    int i_31_;
		    if (arg4 != null)
			i_31_ = arg4[i_21_];
		    else
			i_31_ = 0;
		    i_21_++;
		    if (i_23_ != 32) {
			if (anInt4003 == 256) {
			    if (anInt4002 != -1)
				method349(i_23_,
					  (arg1 + anIntArray3966[i_23_] + 1
					   + i_30_),
					  (arg2 + anIntArray3993[i_23_] + 1
					   + i_31_),
					  i_28_, i_29_, anInt4002, true);
			    method349(i_23_,
				      arg1 + anIntArray3966[i_23_] + i_30_,
				      arg2 + anIntArray3993[i_23_] + i_31_,
				      i_28_, i_29_, anInt4007, false);
			} else {
			    if (anInt4002 != -1)
				method363(i_23_,
					  (arg1 + anIntArray3966[i_23_] + 1
					   + i_30_),
					  (arg2 + anIntArray3993[i_23_] + 1
					   + i_31_),
					  i_28_, i_29_, anInt4002, anInt4003,
					  true);
			    method363(i_23_,
				      arg1 + anIntArray3966[i_23_] + i_30_,
				      arg2 + anIntArray3993[i_23_] + i_31_,
				      i_28_, i_29_, anInt4007, anInt4003,
				      false);
			}
		    } else if (anInt4006 > 0) {
			anInt4008 += anInt4006;
			arg1 += anInt4008 >> 8;
			anInt4008 &= 0xff;
		    }
		    int i_32_ = anIntArray3996[i_23_];
		    if (anInt4010 != -1)
			Class25.method1007(arg1,
					   arg2 + (int) ((double) anInt3978
							 * 0.7),
					   i_32_, anInt4010);
		    if (anInt4009 != -1)
			Class25.method1007(arg1, arg2 + anInt3978, i_32_,
					   anInt4009);
		    arg1 += i_32_;
		    i_20_ = i_23_;
		}
	    }
	}
    }
    
    public void method356(Class124 arg0, int arg1, int arg2) {
	arg2 -= anInt3978;
	int i = -1;
	int i_33_ = -1;
	for (int i_34_ = 0; i_34_ < arg0.anInt2507; i_34_++) {
	    int i_35_ = arg0.aByteArray2495[i_34_] & 0xff;
	    if (i_35_ == 60)
		i = i_34_;
	    else {
		if (i_35_ == 62 && i != -1) {
		    Class124 class124
			= arg0.method1697(i + 1, i_34_, (byte) -104);
		    i = -1;
		    if (class124.method1704(aClass124_3995, (byte) 64))
			i_35_ = 60;
		    else if (class124.method1704(aClass124_3982, (byte) 115))
			i_35_ = 62;
		    else if (class124.method1704(aClass124_3986, (byte) 104))
			i_35_ = 160;
		    else if (class124.method1704(aClass124_3967, (byte) 85))
			i_35_ = 173;
		    else if (class124.method1704(aClass124_3977, (byte) 51))
			i_35_ = 215;
		    else if (class124.method1704(aClass124_3985, (byte) 44))
			i_35_ = 128;
		    else if (class124.method1704(aClass124_3997, (byte) 113))
			i_35_ = 169;
		    else if (class124.method1704(aClass124_3990, (byte) 85))
			i_35_ = 174;
		    else {
			if (class124.method1690(aClass124_3992, 33)) {
			    try {
				int i_36_ = class124.method1696(4, 15)
						.method1702(126);
				Class148 class148 = aClass148Array3971[i_36_];
				int i_37_ = (anIntArray3968 != null
					     ? anIntArray3968[i_36_]
					     : class148.anInt2373);
				if (anInt4003 == 256)
				    class148.method2001(arg1, (arg2 + anInt3978
							       - i_37_));
				else
				    class148.method1999(arg1,
							(arg2 + anInt3978
							 - i_37_),
							anInt4003);
				arg1 += class148.anInt2378;
				i_33_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			} else
			    method347(class124);
			continue;
		    }
		}
		if (i == -1) {
		    if (aByteArray3980 != null && i_33_ != -1)
			arg1 += aByteArray3980[(i_33_ << 8) + i_35_];
		    int i_38_ = anIntArray3989[i_35_];
		    int i_39_ = anIntArray3991[i_35_];
		    if (i_35_ != 32) {
			if (anInt4003 == 256) {
			    if (anInt4002 != -1)
				method349(i_35_,
					  arg1 + anIntArray3966[i_35_] + 1,
					  arg2 + anIntArray3993[i_35_] + 1,
					  i_38_, i_39_, anInt4002, true);
			    method349(i_35_, arg1 + anIntArray3966[i_35_],
				      arg2 + anIntArray3993[i_35_], i_38_,
				      i_39_, anInt4007, false);
			} else {
			    if (anInt4002 != -1)
				method363(i_35_,
					  arg1 + anIntArray3966[i_35_] + 1,
					  arg2 + anIntArray3993[i_35_] + 1,
					  i_38_, i_39_, anInt4002, anInt4003,
					  true);
			    method363(i_35_, arg1 + anIntArray3966[i_35_],
				      arg2 + anIntArray3993[i_35_], i_38_,
				      i_39_, anInt4007, anInt4003, false);
			}
		    } else if (anInt4006 > 0) {
			anInt4008 += anInt4006;
			arg1 += anInt4008 >> 8;
			anInt4008 &= 0xff;
		    }
		    int i_40_ = anIntArray3996[i_35_];
		    if (anInt4010 != -1)
			Class25.method1007(arg1,
					   arg2 + (int) ((double) anInt3978
							 * 0.7),
					   i_40_, anInt4010);
		    if (anInt4009 != -1)
			Class25.method1007(arg1, arg2 + anInt3978 + 1, i_40_,
					   anInt4009);
		    arg1 += i_40_;
		    i_33_ = i_35_;
		}
	    }
	}
    }
    
    public void method357(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4, int arg5) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    int[] is = new int[arg0.anInt2507];
	    int[] is_41_ = new int[arg0.anInt2507];
	    for (int i = 0; i < arg0.anInt2507; i++) {
		is[i] = (int) (Math.sin((double) i / 5.0 + (double) arg5 / 5.0)
			       * 5.0);
		is_41_[i]
		    = (int) (Math.sin((double) i / 3.0 + (double) arg5 / 5.0)
			     * 5.0);
	    }
	    method355(arg0, arg1 - method361(arg0) / 2, arg2, is, is_41_);
	}
    }
    
    public int method358(Class124 arg0, int arg1) {
	return method351(arg0, new int[] { arg1 }, aClass124Array4011);
    }
    
    public int method359(Class124 arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9) {
	return method365(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 256, arg7,
			 arg8, arg9);
    }
    
    public void method360(byte[] arg0) {
	anIntArray3996 = new int[256];
	if (arg0.length == 257) {
	    for (int i = 0; i < anIntArray3996.length; i++)
		anIntArray3996[i] = arg0[i] & 0xff;
	    anInt3978 = arg0[256] & 0xff;
	} else {
	    int i = 0;
	    for (int i_42_ = 0; i_42_ < 256; i_42_++)
		anIntArray3996[i_42_] = arg0[i++] & 0xff;
	    int[] is = new int[256];
	    int[] is_43_ = new int[256];
	    for (int i_44_ = 0; i_44_ < 256; i_44_++)
		is[i_44_] = arg0[i++] & 0xff;
	    for (int i_45_ = 0; i_45_ < 256; i_45_++)
		is_43_[i_45_] = arg0[i++] & 0xff;
	    byte[][] is_46_ = new byte[256][];
	    for (int i_47_ = 0; i_47_ < 256; i_47_++) {
		is_46_[i_47_] = new byte[is[i_47_]];
		byte i_48_ = 0;
		for (int i_49_ = 0; i_49_ < is_46_[i_47_].length; i_49_++) {
		    i_48_ += arg0[i++];
		    is_46_[i_47_][i_49_] = i_48_;
		}
	    }
	    byte[][] is_50_ = new byte[256][];
	    for (int i_51_ = 0; i_51_ < 256; i_51_++) {
		is_50_[i_51_] = new byte[is[i_51_]];
		byte i_52_ = 0;
		for (int i_53_ = 0; i_53_ < is_50_[i_51_].length; i_53_++) {
		    i_52_ += arg0[i++];
		    is_50_[i_51_][i_53_] = i_52_;
		}
	    }
	    aByteArray3980 = new byte[65536];
	    for (int i_54_ = 0; i_54_ < 256; i_54_++) {
		if (i_54_ != 32 && i_54_ != 160) {
		    for (int i_55_ = 0; i_55_ < 256; i_55_++) {
			if (i_55_ != 32 && i_55_ != 160)
			    aByteArray3980[(i_54_ << 8) + i_55_]
				= (byte) method366(is_46_, is_50_, is_43_,
						   anIntArray3996, is, i_54_,
						   i_55_);
		    }
		}
	    }
	    anInt3978 = is_43_[32] + is[32];
	}
    }
    
    public int method361(Class124 arg0) {
	if (arg0 == null)
	    return 0;
	int i = -1;
	int i_56_ = -1;
	int i_57_ = 0;
	for (int i_58_ = 0; i_58_ < arg0.anInt2507; i_58_++) {
	    int i_59_ = arg0.aByteArray2495[i_58_] & 0xff;
	    if (i_59_ == 60)
		i = i_58_;
	    else {
		if (i_59_ == 62 && i != -1) {
		    Class124 class124
			= arg0.method1697(i + 1, i_58_, (byte) -104);
		    i = -1;
		    if (class124.method1704(aClass124_3995, (byte) 89))
			i_59_ = 60;
		    else if (class124.method1704(aClass124_3982, (byte) 127))
			i_59_ = 62;
		    else if (class124.method1704(aClass124_3986, (byte) 69))
			i_59_ = 160;
		    else if (class124.method1704(aClass124_3967, (byte) 66))
			i_59_ = 173;
		    else if (class124.method1704(aClass124_3977, (byte) 68))
			i_59_ = 215;
		    else if (class124.method1704(aClass124_3985, (byte) 125))
			i_59_ = 128;
		    else if (class124.method1704(aClass124_3997, (byte) 95))
			i_59_ = 169;
		    else if (class124.method1704(aClass124_3990, (byte) 124))
			i_59_ = 174;
		    else {
			if (class124.method1690(aClass124_3992, 33)) {
			    try {
				int i_60_ = class124.method1696(4, 15)
						.method1702(60);
				i_57_ += aClass148Array3971[i_60_].anInt2378;
				i_56_ = -1;
			    } catch (Exception exception) {
				/* empty */
			    }
			}
			continue;
		    }
		}
		if (i == -1) {
		    i_57_ += anIntArray3996[i_59_];
		    if (aByteArray3980 != null && i_56_ != -1)
			i_57_ += aByteArray3980[(i_56_ << 8) + i_59_];
		    i_56_ = i_59_;
		}
	    }
	}
	return i_57_;
    }
    
    public void method362(Class124 arg0, int arg1) {
	int i = 0;
	boolean bool = false;
	for (int i_61_ = 0; i_61_ < arg0.method1693(0); i_61_++) {
	    int i_62_ = arg0.method1710(0, i_61_);
	    if (i_62_ == 60)
		bool = true;
	    else if (i_62_ == 62)
		bool = false;
	    else if (!bool && i_62_ == 32)
		i++;
	}
	if (i > 0)
	    anInt4006 = (arg1 - method361(arg0) << 8) / i;
    }
    
    public abstract void method363(int i, int i_63_, int i_64_, int i_65_,
				   int i_66_, int i_67_, int i_68_,
				   boolean bool);
    
    public void method364(Class124 arg0, int arg1, int arg2, int arg3,
			  int arg4) {
	if (arg0 != null) {
	    method354(arg3, arg4);
	    method356(arg0, arg1, arg2);
	}
    }
    
    public int method365(Class124 arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6, int arg7, int arg8, int arg9,
			 int arg10) {
	if (arg0 == null)
	    return 0;
	method346(arg5, arg6, arg7);
	if (arg10 == 0)
	    arg10 = anInt3978;
	int[] is = { arg3 };
	if (arg4 < anInt3999 + anInt3969 + arg10 && arg4 < arg10 + arg10)
	    is = null;
	int i = method351(arg0, is, aClass124Array4011);
	if (arg9 == 3 && i == 1)
	    arg9 = 1;
	int i_69_;
	if (arg9 == 0)
	    i_69_ = arg2 + anInt3999;
	else if (arg9 == 1)
	    i_69_ = (arg2 + anInt3999
		     + (arg4 - anInt3999 - anInt3969 - (i - 1) * arg10) / 2);
	else if (arg9 == 2)
	    i_69_ = arg2 + arg4 - anInt3969 - (i - 1) * arg10;
	else {
	    int i_70_
		= (arg4 - anInt3999 - anInt3969 - (i - 1) * arg10) / (i + 1);
	    if (i_70_ < 0)
		i_70_ = 0;
	    i_69_ = arg2 + anInt3999 + i_70_;
	    arg10 += i_70_;
	}
	for (int i_71_ = 0; i_71_ < i; i_71_++) {
	    if (arg8 == 0)
		method356(aClass124Array4011[i_71_], arg1, i_69_);
	    else if (arg8 == 1)
		method356(aClass124Array4011[i_71_],
			  arg1 + ((arg3 - method361(aClass124Array4011[i_71_]))
				  / 2),
			  i_69_);
	    else if (arg8 == 2)
		method356(aClass124Array4011[i_71_],
			  arg1 + arg3 - method361(aClass124Array4011[i_71_]),
			  i_69_);
	    else if (i_71_ == i - 1)
		method356(aClass124Array4011[i_71_], arg1, i_69_);
	    else {
		method362(aClass124Array4011[i_71_], arg3);
		method356(aClass124Array4011[i_71_], arg1, i_69_);
		anInt4006 = 0;
	    }
	    i_69_ += arg10;
	}
	return i;
    }
    
    public static int method366(byte[][] arg0, byte[][] arg1, int[] arg2,
				int[] arg3, int[] arg4, int arg5, int arg6) {
	int i = arg2[arg5];
	int i_72_ = i + arg4[arg5];
	int i_73_ = arg2[arg6];
	int i_74_ = i_73_ + arg4[arg6];
	int i_75_ = i;
	if (i_73_ > i)
	    i_75_ = i_73_;
	int i_76_ = i_72_;
	if (i_74_ < i_72_)
	    i_76_ = i_74_;
	int i_77_ = arg3[arg5];
	if (arg3[arg6] < i_77_)
	    i_77_ = arg3[arg6];
	byte[] is = arg1[arg5];
	byte[] is_78_ = arg0[arg6];
	int i_79_ = i_75_ - i;
	int i_80_ = i_75_ - i_73_;
	for (int i_81_ = i_75_; i_81_ < i_76_; i_81_++) {
	    int i_82_ = is[i_79_++] + is_78_[i_80_++];
	    if (i_82_ < i_77_)
		i_77_ = i_82_;
	}
	return -i_77_;
    }
    
    public static void method367() {
	aClass124_3995 = null;
	aClass124_3982 = null;
	aClass124_3986 = null;
	aClass124_3967 = null;
	aClass124_3977 = null;
	aClass124_3985 = null;
	aClass124_3997 = null;
	aClass124_3990 = null;
	aClass124_3992 = null;
	aClass124_3988 = null;
	aClass124_3979 = null;
	aClass124_3998 = null;
	aClass124_4000 = null;
	aClass124_3974 = null;
	aClass124_3983 = null;
	aClass124_3994 = null;
	aClass124_3972 = null;
	aClass124_3981 = null;
	aClass124_3970 = null;
	aClass124_3973 = null;
	aClass124_3976 = null;
	aClass124_3987 = null;
	aClass124_3984 = null;
	aClass124_3975 = null;
	aClass124Array4011 = null;
    }
    
    public static Class124 method368(Class124 arg0) {
	int i = arg0.method1693(0);
	int i_83_ = 0;
	for (int i_84_ = 0; i_84_ < i; i_84_++) {
	    byte i_85_ = arg0.aByteArray2495[i_84_];
	    if (i_85_ == 60 || i_85_ == 62)
		i_83_ += 3;
	}
	Class124 class124 = new Class124();
	class124.anInt2507 = i + i_83_;
	class124.aByteArray2495 = new byte[class124.anInt2507];
	int i_86_ = 0;
	for (int i_87_ = 0; i_87_ < i; i_87_++) {
	    byte i_88_ = arg0.aByteArray2495[i_87_];
	    if (i_88_ == 60) {
		class124.aByteArray2495[i_86_++] = (byte) 60;
		class124.aByteArray2495[i_86_++] = (byte) 108;
		class124.aByteArray2495[i_86_++] = (byte) 116;
		class124.aByteArray2495[i_86_++] = (byte) 62;
	    } else if (i_88_ == 62) {
		class124.aByteArray2495[i_86_++] = (byte) 60;
		class124.aByteArray2495[i_86_++] = (byte) 103;
		class124.aByteArray2495[i_86_++] = (byte) 116;
		class124.aByteArray2495[i_86_++] = (byte) 62;
	    } else
		class124.aByteArray2495[i_86_++] = i_88_;
	}
	return class124;
    }
    
    public Class14_Sub2_Sub16(byte[] arg0, int[] arg1, int[] arg2, int[] arg3,
			      int[] arg4) {
	anIntArray3966 = arg1;
	anIntArray3993 = arg2;
	anIntArray3989 = arg3;
	anIntArray3991 = arg4;
	method360(arg0);
	int i = 2147483647;
	int i_89_ = -2147483648;
	for (int i_90_ = 0; i_90_ < 256; i_90_++) {
	    if (anIntArray3993[i_90_] < i && anIntArray3991[i_90_] != 0)
		i = anIntArray3993[i_90_];
	    if (anIntArray3993[i_90_] + anIntArray3991[i_90_] > i_89_)
		i_89_ = anIntArray3993[i_90_] + anIntArray3991[i_90_];
	}
	anInt3999 = anInt3978 - i;
	anInt3969 = i_89_ - anInt3978;
    }
    
    public Class14_Sub2_Sub16(byte[] arg0) {
	method360(arg0);
    }
    
    static {
	aClass124_3974 = Class14_Sub2_Sub2.method263(1178, ")4trans");
	aClass124_3977 = Class14_Sub2_Sub2.method263(1178, "times");
	aClass124_3970 = Class14_Sub2_Sub2.method263(1178, "shad");
	aClass124_3983 = Class14_Sub2_Sub2.method263(1178, "u=");
	aClass124_3985 = Class14_Sub2_Sub2.method263(1178, "euro");
	aClass124_3986 = Class14_Sub2_Sub2.method263(1178, "nbsp");
	aClass124_3981 = Class14_Sub2_Sub2.method263(1178, "shad=");
	aClass124_3992 = Class14_Sub2_Sub2.method263(1178, "img=");
	aClass124_3987 = Class14_Sub2_Sub2.method263(1178, "str");
	aClass124_3973 = Class14_Sub2_Sub2.method263(1178, ")4shad");
	aClass124_3982 = Class14_Sub2_Sub2.method263(1178, "gt");
	aClass124_3988 = Class14_Sub2_Sub2.method263(1178, "br");
	aClass124_3984 = Class14_Sub2_Sub2.method263(1178, ")4str");
	aClass124_3979 = Class14_Sub2_Sub2.method263(1178, "col=");
	aClass124_3994 = Class14_Sub2_Sub2.method263(1178, "u");
	aClass124_3972 = Class14_Sub2_Sub2.method263(1178, ")4u");
	aClass124_3997 = Class14_Sub2_Sub2.method263(1178, "copy");
	aClass124_3990 = Class14_Sub2_Sub2.method263(1178, "reg");
	aClass124_3998 = Class14_Sub2_Sub2.method263(1178, ")4col");
	aClass124_3967 = Class14_Sub2_Sub2.method263(1178, "shy");
	aClass124_4000 = Class14_Sub2_Sub2.method263(1178, "trans=");
	aClass124_3995 = Class14_Sub2_Sub2.method263(1178, "lt");
	aClass124_3975 = Class7_Sub1.method121(100, -13);
	anInt4003 = 256;
	anInt4002 = -1;
	anInt4005 = 0;
	anInt4006 = 0;
	anInt4004 = -1;
	anInt4008 = 0;
	aClass124Array4011 = new Class124[100];
	anInt4009 = -1;
	anInt4001 = 256;
	anInt4007 = 0;
	anInt4010 = -1;
    }
}
