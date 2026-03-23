/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class136
{
    public static Class117 aClass117_2191 = new Class117();
    
    public static void method1929() {
	aClass117_2191 = null;
    }
    
    public static void method1930(Class117 arg0) {
	boolean bool = false;
	boolean bool_0_ = false;
	boolean bool_1_ = false;
	boolean bool_2_ = false;
	boolean bool_3_ = false;
	boolean bool_4_ = false;
	boolean bool_5_ = false;
	boolean bool_6_ = false;
	boolean bool_7_ = false;
	boolean bool_8_ = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	boolean bool_11_ = false;
	boolean bool_12_ = false;
	boolean bool_13_ = false;
	boolean bool_14_ = false;
	boolean bool_15_ = false;
	boolean bool_16_ = false;
	int i = 0;
	int[] is = null;
	int[] is_17_ = null;
	int[] is_18_ = null;
	arg0.anInt1947 = 1;
	if (Class124.anIntArray2473 == null)
	    Class124.anIntArray2473 = new int[arg0.anInt1947 * 100000];
	boolean bool_19_ = true;
	while (bool_19_) {
	    byte i_20_ = method1937(arg0);
	    if (i_20_ == 23)
		break;
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1937(arg0);
	    i_20_ = method1935(arg0);
	    if (i_20_ == 0) {
		/* empty */
	    }
	    arg0.anInt1942 = 0;
	    int i_21_ = method1937(arg0);
	    arg0.anInt1942 = arg0.anInt1942 << 8 | i_21_ & 0xff;
	    i_21_ = method1937(arg0);
	    arg0.anInt1942 = arg0.anInt1942 << 8 | i_21_ & 0xff;
	    i_21_ = method1937(arg0);
	    arg0.anInt1942 = arg0.anInt1942 << 8 | i_21_ & 0xff;
	    for (int i_22_ = 0; i_22_ < 16; i_22_++) {
		i_20_ = method1935(arg0);
		if (i_20_ == 1)
		    arg0.aBooleanArray1957[i_22_] = true;
		else
		    arg0.aBooleanArray1957[i_22_] = false;
	    }
	    for (int i_23_ = 0; i_23_ < 256; i_23_++)
		arg0.aBooleanArray1965[i_23_] = false;
	    for (int i_24_ = 0; i_24_ < 16; i_24_++) {
		if (arg0.aBooleanArray1957[i_24_]) {
		    for (int i_25_ = 0; i_25_ < 16; i_25_++) {
			i_20_ = method1935(arg0);
			if (i_20_ == 1)
			    arg0.aBooleanArray1965[i_24_ * 16 + i_25_] = true;
		    }
		}
	    }
	    method1936(arg0);
	    int i_26_ = arg0.anInt1940 + 2;
	    int i_27_ = method1933(3, arg0);
	    int i_28_ = method1933(15, arg0);
	    for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
		int i_30_ = 0;
		for (;;) {
		    i_20_ = method1935(arg0);
		    if (i_20_ == 0)
			break;
		    i_30_++;
		}
		arg0.aByteArray1962[i_29_] = (byte) i_30_;
	    }
	    byte[] is_31_ = new byte[6];
	    for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
		is_31_[i_32_] = i_32_;
	    for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
		byte i_34_ = arg0.aByteArray1962[i_33_];
		byte i_35_ = is_31_[i_34_];
		for (/**/; i_34_ > 0; i_34_--)
		    is_31_[i_34_] = is_31_[i_34_ - 1];
		is_31_[0] = i_35_;
		arg0.aByteArray1936[i_33_] = i_35_;
	    }
	    for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
		int i_37_ = method1933(5, arg0);
		for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
		    for (;;) {
			i_20_ = method1935(arg0);
			if (i_20_ == 0)
			    break;
			i_20_ = method1935(arg0);
			if (i_20_ == 0)
			    i_37_++;
			else
			    i_37_--;
		    }
		    arg0.aByteArrayArray1967[i_36_][i_38_] = (byte) i_37_;
		}
	    }
	    for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
		int i_40_ = 32;
		byte i_41_ = 0;
		for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
		    if (arg0.aByteArrayArray1967[i_39_][i_42_] > i_41_)
			i_41_ = arg0.aByteArrayArray1967[i_39_][i_42_];
		    if (arg0.aByteArrayArray1967[i_39_][i_42_] < i_40_)
			i_40_ = arg0.aByteArrayArray1967[i_39_][i_42_];
		}
		method1931(arg0.anIntArrayArray1955[i_39_],
			   arg0.anIntArrayArray1956[i_39_],
			   arg0.anIntArrayArray1937[i_39_],
			   arg0.aByteArrayArray1967[i_39_], i_40_, i_41_,
			   i_26_);
		arg0.anIntArray1969[i_39_] = i_40_;
	    }
	    int i_43_ = arg0.anInt1940 + 1;
	    int i_44_ = -1;
	    int i_45_ = 0;
	    for (int i_46_ = 0; i_46_ <= 255; i_46_++)
		arg0.anIntArray1935[i_46_] = 0;
	    int i_47_ = 4095;
	    for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
		for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
		    arg0.aByteArray1966[i_47_] = (byte) (i_48_ * 16 + i_49_);
		    i_47_--;
		}
		arg0.anIntArray1968[i_48_] = i_47_ + 1;
	    }
	    int i_50_ = 0;
	    if (i_45_ == 0) {
		i_44_++;
		i_45_ = 50;
		byte i_51_ = arg0.aByteArray1936[i_44_];
		i = arg0.anIntArray1969[i_51_];
		is = arg0.anIntArrayArray1955[i_51_];
		is_18_ = arg0.anIntArrayArray1937[i_51_];
		is_17_ = arg0.anIntArrayArray1956[i_51_];
	    }
	    i_45_--;
	    int i_52_ = i;
	    int i_53_;
	    int i_54_;
	    for (i_54_ = method1933(i_52_, arg0); i_54_ > is[i_52_];
		 i_54_ = i_54_ << 1 | i_53_) {
		i_52_++;
		i_53_ = method1935(arg0);
	    }
	    int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
	    while (i_55_ != i_43_) {
		if (i_55_ == 0 || i_55_ == 1) {
		    int i_56_ = -1;
		    int i_57_ = 1;
		    do {
			if (i_55_ == 0)
			    i_56_ += 1 * i_57_;
			else if (i_55_ == 1)
			    i_56_ += 2 * i_57_;
			i_57_ *= 2;
			if (i_45_ == 0) {
			    i_44_++;
			    i_45_ = 50;
			    byte i_58_ = arg0.aByteArray1936[i_44_];
			    i = arg0.anIntArray1969[i_58_];
			    is = arg0.anIntArrayArray1955[i_58_];
			    is_18_ = arg0.anIntArrayArray1937[i_58_];
			    is_17_ = arg0.anIntArrayArray1956[i_58_];
			}
			i_45_--;
			i_52_ = i;
			for (i_54_ = method1933(i_52_, arg0);
			     i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
			    i_52_++;
			    i_53_ = method1935(arg0);
			}
			i_55_ = is_18_[i_54_ - is_17_[i_52_]];
		    } while (i_55_ == 0 || i_55_ == 1);
		    i_56_++;
		    i_21_ = (arg0.aByteArray1959
			     [(arg0.aByteArray1966[arg0.anIntArray1968[0]]
			       & 0xff)]);
		    arg0.anIntArray1935[i_21_ & 0xff] += i_56_;
		    for (/**/; i_56_ > 0; i_56_--) {
			Class124.anIntArray2473[i_50_] = i_21_ & 0xff;
			i_50_++;
		    }
		} else {
		    int i_59_ = i_55_ - 1;
		    if (i_59_ < 16) {
			int i_60_ = arg0.anIntArray1968[0];
			i_20_ = arg0.aByteArray1966[i_60_ + i_59_];
			for (/**/; i_59_ > 3; i_59_ -= 4) {
			    int i_61_ = i_60_ + i_59_;
			    arg0.aByteArray1966[i_61_]
				= arg0.aByteArray1966[i_61_ - 1];
			    arg0.aByteArray1966[i_61_ - 1]
				= arg0.aByteArray1966[i_61_ - 2];
			    arg0.aByteArray1966[i_61_ - 2]
				= arg0.aByteArray1966[i_61_ - 3];
			    arg0.aByteArray1966[i_61_ - 3]
				= arg0.aByteArray1966[i_61_ - 4];
			}
			for (/**/; i_59_ > 0; i_59_--)
			    arg0.aByteArray1966[i_60_ + i_59_]
				= arg0.aByteArray1966[i_60_ + i_59_ - 1];
			arg0.aByteArray1966[i_60_] = i_20_;
		    } else {
			int i_62_ = i_59_ / 16;
			int i_63_ = i_59_ % 16;
			int i_64_ = arg0.anIntArray1968[i_62_] + i_63_;
			i_20_ = arg0.aByteArray1966[i_64_];
			for (/**/; i_64_ > arg0.anIntArray1968[i_62_]; i_64_--)
			    arg0.aByteArray1966[i_64_]
				= arg0.aByteArray1966[i_64_ - 1];
			arg0.anIntArray1968[i_62_]++;
			for (/**/; i_62_ > 0; i_62_--) {
			    arg0.anIntArray1968[i_62_]--;
			    arg0.aByteArray1966[arg0.anIntArray1968[i_62_]]
				= (arg0.aByteArray1966
				   [arg0.anIntArray1968[i_62_ - 1] + 16 - 1]);
			}
			arg0.anIntArray1968[0]--;
			arg0.aByteArray1966[arg0.anIntArray1968[0]] = i_20_;
			if (arg0.anIntArray1968[0] == 0) {
			    i_47_ = 4095;
			    for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
				for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
				    arg0.aByteArray1966[i_47_]
					= (arg0.aByteArray1966
					   [(arg0.anIntArray1968[i_65_]
					     + i_66_)]);
				    i_47_--;
				}
				arg0.anIntArray1968[i_65_] = i_47_ + 1;
			    }
			}
		    }
		    arg0.anIntArray1935[(arg0.aByteArray1959[i_20_ & 0xff]
					 & 0xff)]++;
		    Class124.anIntArray2473[i_50_]
			= arg0.aByteArray1959[i_20_ & 0xff] & 0xff;
		    i_50_++;
		    if (i_45_ == 0) {
			i_44_++;
			i_45_ = 50;
			byte i_67_ = arg0.aByteArray1936[i_44_];
			i = arg0.anIntArray1969[i_67_];
			is = arg0.anIntArrayArray1955[i_67_];
			is_18_ = arg0.anIntArrayArray1937[i_67_];
			is_17_ = arg0.anIntArrayArray1956[i_67_];
		    }
		    i_45_--;
		    i_52_ = i;
		    for (i_54_ = method1933(i_52_, arg0); i_54_ > is[i_52_];
			 i_54_ = i_54_ << 1 | i_53_) {
			i_52_++;
			i_53_ = method1935(arg0);
		    }
		    i_55_ = is_18_[i_54_ - is_17_[i_52_]];
		}
	    }
	    arg0.anInt1970 = 0;
	    arg0.aByte1960 = (byte) 0;
	    arg0.anIntArray1938[0] = 0;
	    for (int i_68_ = 1; i_68_ <= 256; i_68_++)
		arg0.anIntArray1938[i_68_] = arg0.anIntArray1935[i_68_ - 1];
	    for (int i_69_ = 1; i_69_ <= 256; i_69_++)
		arg0.anIntArray1938[i_69_] += arg0.anIntArray1938[i_69_ - 1];
	    for (int i_70_ = 0; i_70_ < i_50_; i_70_++) {
		i_21_ = (byte) (Class124.anIntArray2473[i_70_] & 0xff);
		Class124.anIntArray2473[arg0.anIntArray1938[i_21_ & 0xff]]
		    |= i_70_ << 8;
		arg0.anIntArray1938[i_21_ & 0xff]++;
	    }
	    arg0.anInt1946 = Class124.anIntArray2473[arg0.anInt1942] >> 8;
	    arg0.anInt1939 = 0;
	    arg0.anInt1946 = Class124.anIntArray2473[arg0.anInt1946];
	    arg0.anInt1953 = (byte) (arg0.anInt1946 & 0xff);
	    arg0.anInt1946 >>= 8;
	    arg0.anInt1939++;
	    arg0.anInt1943 = i_50_;
	    method1932(arg0);
	    if (arg0.anInt1939 == arg0.anInt1943 + 1 && arg0.anInt1970 == 0)
		bool_19_ = true;
	    else
		bool_19_ = false;
	}
    }
    
    public static void method1931(int[] arg0, int[] arg1, int[] arg2,
				  byte[] arg3, int arg4, int arg5, int arg6) {
	int i = 0;
	for (int i_71_ = arg4; i_71_ <= arg5; i_71_++) {
	    for (int i_72_ = 0; i_72_ < arg6; i_72_++) {
		if (arg3[i_72_] == i_71_) {
		    arg2[i] = i_72_;
		    i++;
		}
	    }
	}
	for (int i_73_ = 0; i_73_ < 23; i_73_++)
	    arg1[i_73_] = 0;
	for (int i_74_ = 0; i_74_ < arg6; i_74_++)
	    arg1[arg3[i_74_] + 1]++;
	for (int i_75_ = 1; i_75_ < 23; i_75_++)
	    arg1[i_75_] += arg1[i_75_ - 1];
	for (int i_76_ = 0; i_76_ < 23; i_76_++)
	    arg0[i_76_] = 0;
	int i_77_ = 0;
	for (int i_78_ = arg4; i_78_ <= arg5; i_78_++) {
	    i_77_ += arg1[i_78_ + 1] - arg1[i_78_];
	    arg0[i_78_] = i_77_ - 1;
	    i_77_ <<= 1;
	}
	for (int i_79_ = arg4 + 1; i_79_ <= arg5; i_79_++)
	    arg1[i_79_] = (arg0[i_79_ - 1] + 1 << 1) - arg1[i_79_];
    }
    
    public static void method1932(Class117 arg0) {
	byte i = arg0.aByte1960;
	int i_80_ = arg0.anInt1970;
	int i_81_ = arg0.anInt1939;
	int i_82_ = arg0.anInt1953;
	int[] is = Class124.anIntArray2473;
	int i_83_ = arg0.anInt1946;
	byte[] is_84_ = arg0.aByteArray1954;
	int i_85_ = arg0.anInt1944;
	int i_86_ = arg0.anInt1949;
	int i_87_ = i_86_;
	int i_88_ = arg0.anInt1943 + 1;
    while_1237_:
	for (;;) {
	    if (i_80_ > 0) {
		for (;;) {
		    if (i_86_ == 0)
			break while_1237_;
		    if (i_80_ == 1)
			break;
		    is_84_[i_85_] = i;
		    i_80_--;
		    i_85_++;
		    i_86_--;
		}
		if (i_86_ == 0) {
		    i_80_ = 1;
		    break;
		}
		is_84_[i_85_] = i;
		i_85_++;
		i_86_--;
	    }
	    boolean bool = true;
	    while (bool) {
		bool = false;
		if (i_81_ == i_88_) {
		    i_80_ = 0;
		    break while_1237_;
		}
		i = (byte) i_82_;
		i_83_ = is[i_83_];
		int i_89_ = (byte) (i_83_ & 0xff);
		i_83_ >>= 8;
		i_81_++;
		if (i_89_ != i_82_) {
		    i_82_ = i_89_;
		    if (i_86_ == 0) {
			i_80_ = 1;
			break while_1237_;
		    }
		    is_84_[i_85_] = i;
		    i_85_++;
		    i_86_--;
		    bool = true;
		} else if (i_81_ == i_88_) {
		    if (i_86_ == 0) {
			i_80_ = 1;
			break while_1237_;
		    }
		    is_84_[i_85_] = i;
		    i_85_++;
		    i_86_--;
		    bool = true;
		}
	    }
	    i_80_ = 2;
	    i_83_ = is[i_83_];
	    int i_90_ = (byte) (i_83_ & 0xff);
	    i_83_ >>= 8;
	    if (++i_81_ != i_88_) {
		if (i_90_ != i_82_)
		    i_82_ = i_90_;
		else {
		    i_80_ = 3;
		    i_83_ = is[i_83_];
		    i_90_ = (byte) (i_83_ & 0xff);
		    i_83_ >>= 8;
		    if (++i_81_ != i_88_) {
			if (i_90_ != i_82_)
			    i_82_ = i_90_;
			else {
			    i_83_ = is[i_83_];
			    i_90_ = (byte) (i_83_ & 0xff);
			    i_83_ >>= 8;
			    i_81_++;
			    i_80_ = (i_90_ & 0xff) + 4;
			    i_83_ = is[i_83_];
			    i_82_ = (byte) (i_83_ & 0xff);
			    i_83_ >>= 8;
			    i_81_++;
			}
		    }
		}
	    }
	}
	int i_91_ = arg0.anInt1963;
	arg0.anInt1963 += i_87_ - i_86_;
	if (arg0.anInt1963 >= i_91_) {
	    /* empty */
	}
	arg0.aByte1960 = i;
	arg0.anInt1970 = i_80_;
	arg0.anInt1939 = i_81_;
	arg0.anInt1953 = i_82_;
	Class124.anIntArray2473 = is;
	arg0.anInt1946 = i_83_;
	arg0.aByteArray1954 = is_84_;
	arg0.anInt1944 = i_85_;
	arg0.anInt1949 = i_86_;
    }
    
    public static int method1933(int arg0, Class117 arg1) {
	int i;
	for (;;) {
	    if (arg1.anInt1972 >= arg0) {
		int i_92_ = (arg1.anInt1951 >> arg1.anInt1972 - arg0
			     & (1 << arg0) - 1);
		arg1.anInt1972 -= arg0;
		i = i_92_;
		break;
	    }
	    arg1.anInt1951 = (arg1.anInt1951 << 8
			      | arg1.aByteArray1971[arg1.anInt1950] & 0xff);
	    arg1.anInt1972 += 8;
	    arg1.anInt1950++;
	    arg1.anInt1964++;
	    if (arg1.anInt1964 == 0) {
		/* empty */
	    }
	}
	return i;
    }
    
    public static int method1934(byte[] arg0, int arg1, byte[] arg2, int arg3,
				 int arg4) {
	Class117 class117 = aClass117_2191;
	int i;
	synchronized (class117) {
	    aClass117_2191.aByteArray1971 = arg2;
	    aClass117_2191.anInt1950 = arg4;
	    aClass117_2191.aByteArray1954 = arg0;
	    aClass117_2191.anInt1944 = 0;
	    aClass117_2191.anInt1949 = arg1;
	    aClass117_2191.anInt1972 = 0;
	    aClass117_2191.anInt1951 = 0;
	    aClass117_2191.anInt1964 = 0;
	    aClass117_2191.anInt1963 = 0;
	    method1930(aClass117_2191);
	    arg1 -= aClass117_2191.anInt1949;
	    aClass117_2191.aByteArray1971 = null;
	    aClass117_2191.aByteArray1954 = null;
	    i = arg1;
	}
	return i;
    }
    
    public static byte method1935(Class117 arg0) {
	return (byte) method1933(1, arg0);
    }
    
    public static void method1936(Class117 arg0) {
	arg0.anInt1940 = 0;
	for (int i = 0; i < 256; i++) {
	    if (arg0.aBooleanArray1965[i]) {
		arg0.aByteArray1959[arg0.anInt1940] = (byte) i;
		arg0.anInt1940++;
	    }
	}
    }
    
    public static byte method1937(Class117 arg0) {
	return (byte) method1933(8, arg0);
    }
}
