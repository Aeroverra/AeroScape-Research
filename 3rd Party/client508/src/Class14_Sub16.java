/* Class14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub16 extends Class14
{
    public byte[] aByteArray3002;
    public Class55 aClass55_3003;
    
    public static Class14_Sub16 method875(Class9 arg0, int arg1, int arg2) {
	byte[] is = arg0.method163(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class14_Sub16(new Class14_Sub10(is));
    }
    
    public void method876() {
	aClass55_3003 = null;
    }
    
    public void method877() {
	if (aClass55_3003 == null) {
	    aClass55_3003 = new Class55(16);
	    int[] is = new int[16];
	    int[] is_0_ = new int[16];
	    is[9] = is_0_[9] = 128;
	    Class27 class27 = new Class27(aByteArray3002);
	    int i = class27.method1043();
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		class27.method1048(i_1_);
		class27.method1042(i_1_);
		class27.method1036(i_1_);
	    }
	while_599_:
	    for (;;) {
		int i_2_ = class27.method1044();
		int i_3_ = class27.anIntArray507[i_2_];
		while (class27.anIntArray507[i_2_] == i_3_) {
		    class27.method1048(i_2_);
		    int i_4_ = class27.method1039(i_2_);
		    if (i_4_ == 1) {
			class27.method1045();
			class27.method1036(i_2_);
			if (!class27.method1041())
			    break;
			break while_599_;
		    }
		    int i_5_ = i_4_ & 0xf0;
		    if (i_5_ == 176) {
			int i_6_ = i_4_ & 0xf;
			int i_7_ = i_4_ >> 8 & 0x7f;
			int i_8_ = i_4_ >> 16 & 0x7f;
			if (i_7_ == 0)
			    is[i_6_] = (is[i_6_] & ~0x1fc000) + (i_8_ << 14);
			if (i_7_ == 32)
			    is[i_6_] = (is[i_6_] & ~0x3f80) + (i_8_ << 7);
		    }
		    if (i_5_ == 192) {
			int i_9_ = i_4_ & 0xf;
			int i_10_ = i_4_ >> 8 & 0x7f;
			is_0_[i_9_] = is[i_9_] + i_10_;
		    }
		    if (i_5_ == 144) {
			int i_11_ = i_4_ & 0xf;
			int i_12_ = i_4_ >> 8 & 0x7f;
			int i_13_ = i_4_ >> 16 & 0x7f;
			if (i_13_ > 0) {
			    int i_14_ = is_0_[i_11_];
			    Class14_Sub17 class14_sub17
				= ((Class14_Sub17)
				   aClass55_3003.method1230((long) i_14_,
							    (byte) -9));
			    if (class14_sub17 == null) {
				class14_sub17
				    = new Class14_Sub17(new byte[128]);
				aClass55_3003.method1224(8, (long) i_14_,
							 class14_sub17);
			    }
			    class14_sub17.aByteArray3011[i_12_] = (byte) 1;
			}
		    }
		    class27.method1042(i_2_);
		    class27.method1036(i_2_);
		}
	    }
	}
    }
    
    public Class14_Sub16(Class14_Sub10 arg0) {
	arg0.anInt2908 = arg0.aByteArray2895.length - 3;
	int i = arg0.method798(80);
	int i_15_ = arg0.method784((byte) 108);
	int i_16_ = 14 + i * 10;
	arg0.anInt2908 = 0;
	int i_17_ = 0;
	int i_18_ = 0;
	int i_19_ = 0;
	int i_20_ = 0;
	int i_21_ = 0;
	int i_22_ = 0;
	int i_23_ = 0;
	int i_24_ = 0;
    while_597_:
	for (int i_25_ = 0; i_25_ < i; i_25_++) {
	    int i_26_ = -1;
	    for (;;) {
		int i_27_ = arg0.method798(-65);
		if (i_27_ != i_26_)
		    i_16_++;
		i_26_ = i_27_ & 0xf;
		if (i_27_ == 7)
		    continue while_597_;
		if (i_27_ == 23)
		    i_17_++;
		else if (i_26_ == 0)
		    i_19_++;
		else if (i_26_ == 1)
		    i_20_++;
		else if (i_26_ == 2)
		    i_18_++;
		else if (i_26_ == 3)
		    i_21_++;
		else if (i_26_ == 4)
		    i_22_++;
		else if (i_26_ == 5)
		    i_23_++;
		else {
		    if (i_26_ != 6)
			break;
		    i_24_++;
		}
	    }
	    throw new RuntimeException();
	}
	i_16_ += 5 * i_17_;
	i_16_ += 2 * (i_19_ + i_20_ + i_18_ + i_21_ + i_23_);
	i_16_ += i_22_ + i_24_;
	int i_28_ = arg0.anInt2908;
	int i_29_ = (i + i_17_ + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_
		     + i_24_);
	for (int i_30_ = 0; i_30_ < i_29_; i_30_++)
	    arg0.method800(127);
	i_16_ += arg0.anInt2908 - i_28_;
	int i_31_ = arg0.anInt2908;
	int i_32_ = 0;
	int i_33_ = 0;
	int i_34_ = 0;
	int i_35_ = 0;
	int i_36_ = 0;
	int i_37_ = 0;
	int i_38_ = 0;
	int i_39_ = 0;
	int i_40_ = 0;
	int i_41_ = 0;
	int i_42_ = 0;
	int i_43_ = 0;
	int i_44_ = 0;
	for (int i_45_ = 0; i_45_ < i_18_; i_45_++) {
	    i_44_ = i_44_ + arg0.method798(-41) & 0x7f;
	    if (i_44_ == 0 || i_44_ == 32)
		i_24_++;
	    else if (i_44_ == 1)
		i_32_++;
	    else if (i_44_ == 33)
		i_33_++;
	    else if (i_44_ == 7)
		i_34_++;
	    else if (i_44_ == 39)
		i_35_++;
	    else if (i_44_ == 10)
		i_36_++;
	    else if (i_44_ == 42)
		i_37_++;
	    else if (i_44_ == 99)
		i_38_++;
	    else if (i_44_ == 98)
		i_39_++;
	    else if (i_44_ == 101)
		i_40_++;
	    else if (i_44_ == 100)
		i_41_++;
	    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120 || i_44_ == 121
		     || i_44_ == 123)
		i_42_++;
	    else
		i_43_++;
	}
	int i_46_ = 0;
	int i_47_ = arg0.anInt2908;
	arg0.anInt2908 += i_42_;
	int i_48_ = arg0.anInt2908;
	arg0.anInt2908 += i_23_;
	int i_49_ = arg0.anInt2908;
	arg0.anInt2908 += i_22_;
	int i_50_ = arg0.anInt2908;
	arg0.anInt2908 += i_21_;
	int i_51_ = arg0.anInt2908;
	arg0.anInt2908 += i_32_;
	int i_52_ = arg0.anInt2908;
	arg0.anInt2908 += i_34_;
	int i_53_ = arg0.anInt2908;
	arg0.anInt2908 += i_36_;
	int i_54_ = arg0.anInt2908;
	arg0.anInt2908 += i_19_ + i_20_ + i_23_;
	int i_55_ = arg0.anInt2908;
	arg0.anInt2908 += i_19_;
	int i_56_ = arg0.anInt2908;
	arg0.anInt2908 += i_43_;
	int i_57_ = arg0.anInt2908;
	arg0.anInt2908 += i_20_;
	int i_58_ = arg0.anInt2908;
	arg0.anInt2908 += i_33_;
	int i_59_ = arg0.anInt2908;
	arg0.anInt2908 += i_35_;
	int i_60_ = arg0.anInt2908;
	arg0.anInt2908 += i_37_;
	int i_61_ = arg0.anInt2908;
	arg0.anInt2908 += i_24_;
	int i_62_ = arg0.anInt2908;
	arg0.anInt2908 += i_21_;
	int i_63_ = arg0.anInt2908;
	arg0.anInt2908 += i_38_;
	int i_64_ = arg0.anInt2908;
	arg0.anInt2908 += i_39_;
	int i_65_ = arg0.anInt2908;
	arg0.anInt2908 += i_40_;
	int i_66_ = arg0.anInt2908;
	arg0.anInt2908 += i_41_;
	int i_67_ = arg0.anInt2908;
	arg0.anInt2908 += i_17_ * 3;
	aByteArray3002 = new byte[i_16_];
	Class14_Sub10 class14_sub10 = new Class14_Sub10(aByteArray3002);
	class14_sub10.method803(1297377380, 65);
	class14_sub10.method803(6, 72);
	class14_sub10.method833((byte) 86, i > 1 ? 1 : 0);
	class14_sub10.method833((byte) 99, i);
	class14_sub10.method833((byte) 122, i_15_);
	arg0.anInt2908 = i_28_;
	int i_68_ = 0;
	int i_69_ = 0;
	int i_70_ = 0;
	int i_71_ = 0;
	int i_72_ = 0;
	int i_73_ = 0;
	int i_74_ = 0;
	int[] is = new int[128];
	i_44_ = 0;
	for (int i_75_ = 0; i_75_ < i; i_75_++) {
	    class14_sub10.method803(1297379947, 80);
	    class14_sub10.anInt2908 += 4;
	    int i_76_ = class14_sub10.anInt2908;
	    int i_77_ = -1;
	while_598_:
	    do {
		for (;;) {
		    int i_78_ = arg0.method800(127);
		    class14_sub10.method787(i_78_, -5227);
		    int i_79_ = arg0.aByteArray2895[i_46_++] & 0xff;
		    boolean bool = i_79_ != i_77_;
		    i_77_ = i_79_ & 0xf;
		    if (i_79_ == 7) {
			if (bool)
			    class14_sub10.method809(false, 255);
			class14_sub10.method809(false, 47);
			class14_sub10.method809(false, 0);
			break while_598_;
		    }
		    if (i_79_ == 23) {
			if (bool)
			    class14_sub10.method809(false, 255);
			class14_sub10.method809(false, 81);
			class14_sub10.method809(false, 3);
			class14_sub10.method809(false,
						arg0.aByteArray2895[i_67_++]);
			class14_sub10.method809(false,
						arg0.aByteArray2895[i_67_++]);
			class14_sub10.method809(false,
						arg0.aByteArray2895[i_67_++]);
		    } else {
			i_68_ ^= i_79_ >> 4;
			if (i_77_ == 0) {
			    if (bool)
				class14_sub10.method809(false, 144 + i_68_);
			    i_69_ += arg0.aByteArray2895[i_54_++];
			    i_70_ += arg0.aByteArray2895[i_55_++];
			    class14_sub10.method809(false, i_69_ & 0x7f);
			    class14_sub10.method809(false, i_70_ & 0x7f);
			} else if (i_77_ == 1) {
			    if (bool)
				class14_sub10.method809(false, 128 + i_68_);
			    i_69_ += arg0.aByteArray2895[i_54_++];
			    i_71_ += arg0.aByteArray2895[i_57_++];
			    class14_sub10.method809(false, i_69_ & 0x7f);
			    class14_sub10.method809(false, i_71_ & 0x7f);
			} else if (i_77_ == 2) {
			    if (bool)
				class14_sub10.method809(false, 176 + i_68_);
			    i_44_
				= i_44_ + arg0.aByteArray2895[i_31_++] & 0x7f;
			    class14_sub10.method809(false, i_44_);
			    int i_80_;
			    if (i_44_ == 0 || i_44_ == 32)
				i_80_ = arg0.aByteArray2895[i_61_++];
			    else if (i_44_ == 1)
				i_80_ = arg0.aByteArray2895[i_51_++];
			    else if (i_44_ == 33)
				i_80_ = arg0.aByteArray2895[i_58_++];
			    else if (i_44_ == 7)
				i_80_ = arg0.aByteArray2895[i_52_++];
			    else if (i_44_ == 39)
				i_80_ = arg0.aByteArray2895[i_59_++];
			    else if (i_44_ == 10)
				i_80_ = arg0.aByteArray2895[i_53_++];
			    else if (i_44_ == 42)
				i_80_ = arg0.aByteArray2895[i_60_++];
			    else if (i_44_ == 99)
				i_80_ = arg0.aByteArray2895[i_63_++];
			    else if (i_44_ == 98)
				i_80_ = arg0.aByteArray2895[i_64_++];
			    else if (i_44_ == 101)
				i_80_ = arg0.aByteArray2895[i_65_++];
			    else if (i_44_ == 100)
				i_80_ = arg0.aByteArray2895[i_66_++];
			    else if (i_44_ == 64 || i_44_ == 65 || i_44_ == 120
				     || i_44_ == 121 || i_44_ == 123)
				i_80_ = arg0.aByteArray2895[i_47_++];
			    else
				i_80_ = arg0.aByteArray2895[i_56_++];
			    i_80_ += is[i_44_];
			    is[i_44_] = i_80_;
			    class14_sub10.method809(false, i_80_ & 0x7f);
			} else if (i_77_ == 3) {
			    if (bool)
				class14_sub10.method809(false, 224 + i_68_);
			    i_72_ += arg0.aByteArray2895[i_62_++];
			    i_72_ += arg0.aByteArray2895[i_50_++] << 7;
			    class14_sub10.method809(false, i_72_ & 0x7f);
			    class14_sub10.method809(false, i_72_ >> 7 & 0x7f);
			} else if (i_77_ == 4) {
			    if (bool)
				class14_sub10.method809(false, 208 + i_68_);
			    i_73_ += arg0.aByteArray2895[i_49_++];
			    class14_sub10.method809(false, i_73_ & 0x7f);
			} else if (i_77_ == 5) {
			    if (bool)
				class14_sub10.method809(false, 160 + i_68_);
			    i_69_ += arg0.aByteArray2895[i_54_++];
			    i_74_ += arg0.aByteArray2895[i_48_++];
			    class14_sub10.method809(false, i_69_ & 0x7f);
			    class14_sub10.method809(false, i_74_ & 0x7f);
			} else {
			    if (i_77_ != 6)
				break;
			    if (bool)
				class14_sub10.method809(false, 192 + i_68_);
			    class14_sub10.method809(false, (arg0.aByteArray2895
							    [i_61_++]));
			}
		    }
		}
		throw new RuntimeException();
	    } while (false);
	    class14_sub10.method826((byte) -128,
				    class14_sub10.anInt2908 - i_76_);
	}
    }
}
