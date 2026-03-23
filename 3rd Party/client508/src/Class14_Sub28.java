/* Class14_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub28 extends Class14
{
    public Class14_Sub12_Sub1[] aClass14_Sub12_Sub1Array3212;
    public byte[] aByteArray3213;
    public static int anInt3214;
    public static int anInt3215;
    public static int anInt3216;
    public static Class52 aClass52_3217;
    public int[] anIntArray3218;
    public static Class124 aClass124_3219
	= Class14_Sub2_Sub2.method263(1178, "Loading config )2 ");
    public byte[] aByteArray3220;
    public Class127[] aClass127Array3221;
    public static int anInt3222 = 0;
    public short[] aShortArray3223;
    public int anInt3224;
    public static int[] anIntArray3225;
    public static Class124 aClass124_3226 = aClass124_3219;
    public byte[] aByteArray3227;
    public static Class124 aClass124_3228;
    public static Class124 aClass124_3229;
    public static Class94 aClass94_3230;
    
    public static void method926(byte arg0) {
    while_618_:
	do {
	while_617_:
	    do {
		do {
		    try {
			aClass124_3228 = null;
			anIntArray3225 = null;
			if (arg0 == 27)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_617_;
		    }
		    return;
		} while (false);
		try {
		    aClass52_3217 = null;
		    aClass124_3226 = null;
		    aClass94_3230 = null;
		    aClass124_3229 = null;
		    aClass124_3219 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_618_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "v.C(" + arg0 + ')');
	} while (false);
    }
    
    public boolean method927(int[] arg0, Class120 arg1, boolean arg2,
			     byte[] arg3) {
	boolean bool;
	try {
	    boolean bool_0_ = arg2;
	    anInt3215++;
	    Class14_Sub12_Sub1 class14_sub12_sub1 = null;
	    int i = 0;
	    for (int i_1_ = 0; (i_1_ ^ 0xffffffff) > -129; i_1_++) {
		if (arg3 == null || (arg3[i_1_] ^ 0xffffffff) != -1) {
		    int i_2_ = anIntArray3218[i_1_];
		    if (i_2_ != 0) {
			if (i_2_ != i) {
			    i = i_2_;
			    i_2_--;
			    if (0 == (i_2_ & 0x1))
				class14_sub12_sub1
				    = arg1.method1619(arg0, 23698,
						      i_2_ >> -607532382);
			    else
				class14_sub12_sub1
				    = arg1.method1618(arg0, (byte) -38,
						      i_2_ >> 259848322);
			    if (null == class14_sub12_sub1)
				bool_0_ = false;
			}
			if (class14_sub12_sub1 != null) {
			    aClass14_Sub12_Sub1Array3212[i_1_]
				= class14_sub12_sub1;
			    anIntArray3218[i_1_] = 0;
			}
		    }
		}
	    }
	    bool = bool_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("v.B(" + (arg0 != null ? "{...}" : "null") + ','
			+ (arg1 != null ? "{...}" : "null") + ',' + arg2 + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
	return bool;
    }
    
    public static void method928(int arg0) {
	try {
	    anInt3214++;
	    if (arg0 != 16867)
		aClass124_3226 = null;
	    boolean bool = false;
	    while (!bool) {
		bool = true;
		for (int i = 0;
		     ((Class14_Sub8_Sub38.anInt4729 + -1 ^ 0xffffffff)
		      < (i ^ 0xffffffff));
		     i++) {
		    if ((Class14_Sub29.aShortArray3262[i] ^ 0xffffffff) > -1001
			&& (Class14_Sub29.aShortArray3262[i - -1]
			    ^ 0xffffffff) < -1001) {
			bool = false;
			Class124 class124
			    = RuntimeException_Sub1.aClass124Array2459[i];
			RuntimeException_Sub1.aClass124Array2459[i]
			    = RuntimeException_Sub1.aClass124Array2459[i + 1];
			RuntimeException_Sub1.aClass124Array2459[i + 1]
			    = class124;
			Class124 class124_3_ = Class112.aClass124Array1875[i];
			Class112.aClass124Array1875[i]
			    = Class112.aClass124Array1875[1 + i];
			Class112.aClass124Array1875[1 + i] = class124_3_;
			int i_4_ = Class14_Sub8_Sub27.anIntArray4544[i];
			Class14_Sub8_Sub27.anIntArray4544[i]
			    = Class14_Sub8_Sub27.anIntArray4544[1 + i];
			Class14_Sub8_Sub27.anIntArray4544[i + 1] = i_4_;
			i_4_ = Class26_Sub1.anIntArray3288[i];
			Class26_Sub1.anIntArray3288[i]
			    = Class26_Sub1.anIntArray3288[1 + i];
			Class26_Sub1.anIntArray3288[i - -1] = i_4_;
			short i_5_ = Class14_Sub29.aShortArray3262[i];
			Class14_Sub29.aShortArray3262[i]
			    = Class14_Sub29.aShortArray3262[i + 1];
			Class14_Sub29.aShortArray3262[1 + i] = i_5_;
			long l = Class14_Sub2_Sub13.aLongArray3924[i];
			Class14_Sub2_Sub13.aLongArray3924[i]
			    = Class14_Sub2_Sub13.aLongArray3924[i + 1];
			Class14_Sub2_Sub13.aLongArray3924[1 + i] = l;
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "v.D(" + arg0 + ')');
	}
    }
    
    public void method929(byte arg0) {
	try {
	    anInt3216++;
	    anIntArray3218 = null;
	    if (arg0 > -53)
		method926((byte) 99);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "v.A(" + arg0 + ')');
	}
    }
    
    public Class14_Sub28() {
	/* empty */
    }
    
    public Class14_Sub28(byte[] arg0) {
	try {
	    aByteArray3227 = new byte[128];
	    anIntArray3218 = new int[128];
	    aClass14_Sub12_Sub1Array3212 = new Class14_Sub12_Sub1[128];
	    aShortArray3223 = new short[128];
	    aByteArray3213 = new byte[128];
	    aClass127Array3221 = new Class127[128];
	    aByteArray3220 = new byte[128];
	    int i = 0;
	    Class14_Sub10 class14_sub10;
	    for (class14_sub10 = new Class14_Sub10(arg0);
		 (class14_sub10.aByteArray2895[i + class14_sub10.anInt2908]
		  != 0);
		 i++) {
		/* empty */
	    }
	    byte[] is = new byte[i];
	    for (int i_6_ = 0; i > i_6_; i_6_++)
		is[i_6_] = class14_sub10.method780((byte) -77);
	    class14_sub10.anInt2908++;
	    i++;
	    int i_7_ = class14_sub10.anInt2908;
	    class14_sub10.anInt2908 += i;
	    int i_8_;
	    for (i_8_ = 0;
		 (class14_sub10.aByteArray2895[class14_sub10.anInt2908 - -i_8_]
		  ^ 0xffffffff) != -1;
		 i_8_++) {
		/* empty */
	    }
	    byte[] is_9_ = new byte[i_8_];
	    for (int i_10_ = 0; i_8_ > i_10_; i_10_++)
		is_9_[i_10_] = class14_sub10.method780((byte) -77);
	    class14_sub10.anInt2908++;
	    int i_11_ = class14_sub10.anInt2908;
	    int i_12_ = 0;
	    i_8_++;
	    for (class14_sub10.anInt2908 += i_8_;
		 -1 != ((class14_sub10.aByteArray2895
			 [class14_sub10.anInt2908 + i_12_])
			^ 0xffffffff);
		 i_12_++) {
		/* empty */
	    }
	    byte[] is_13_ = new byte[i_12_];
	    for (int i_14_ = 0; i_14_ < i_12_; i_14_++)
		is_13_[i_14_] = class14_sub10.method780((byte) -77);
	    i_12_++;
	    class14_sub10.anInt2908++;
	    byte[] is_15_ = new byte[i_12_];
	    int i_16_;
	    if (-2 > (i_12_ ^ 0xffffffff)) {
		i_16_ = 2;
		is_15_[1] = (byte) 1;
		int i_17_ = 1;
		for (int i_18_ = 2; i_12_ > i_18_; i_18_++) {
		    int i_19_ = class14_sub10.method798(80);
		    if (-1 == (i_19_ ^ 0xffffffff))
			i_17_ = i_16_++;
		    else {
			if (i_19_ <= i_17_)
			    i_19_--;
			i_17_ = i_19_;
		    }
		    is_15_[i_18_] = (byte) i_17_;
		}
	    } else
		i_16_ = i_12_;
	    Class127[] class127s = new Class127[i_16_];
	    for (int i_20_ = 0;
		 (class127s.length ^ 0xffffffff) < (i_20_ ^ 0xffffffff);
		 i_20_++) {
		Class127 class127 = class127s[i_20_] = new Class127();
		int i_21_ = class14_sub10.method798(-23);
		if (-1 > (i_21_ ^ 0xffffffff))
		    class127.aByteArray2109 = new byte[2 * i_21_];
		i_21_ = class14_sub10.method798(-73);
		if ((i_21_ ^ 0xffffffff) < -1) {
		    class127.aByteArray2098 = new byte[i_21_ * 2 + 2];
		    class127.aByteArray2098[1] = (byte) 64;
		}
	    }
	    int i_22_ = class14_sub10.method798(-87);
	    int i_23_ = 0;
	    byte[] is_24_ = i_22_ <= 0 ? null : new byte[i_22_ * 2];
	    i_22_ = class14_sub10.method798(56);
	    for (/**/; -1 != ((class14_sub10.aByteArray2895
			       [class14_sub10.anInt2908 + i_23_])
			      ^ 0xffffffff); i_23_++) {
		/* empty */
	    }
	    byte[] is_25_ = new byte[i_23_];
	    byte[] is_26_
		= (i_22_ ^ 0xffffffff) >= -1 ? null : new byte[2 * i_22_];
	    for (int i_27_ = 0; i_23_ > i_27_; i_27_++)
		is_25_[i_27_] = class14_sub10.method780((byte) -77);
	    class14_sub10.anInt2908++;
	    i_23_++;
	    int i_28_ = 0;
	    for (int i_29_ = 0; i_29_ < 128; i_29_++) {
		i_28_ += class14_sub10.method798(104);
		aShortArray3223[i_29_] = (short) i_28_;
	    }
	    i_28_ = 0;
	    for (int i_30_ = 0; (i_30_ ^ 0xffffffff) > -129; i_30_++) {
		i_28_ += class14_sub10.method798(125);
		aShortArray3223[i_30_] += i_28_ << -1905362744;
	    }
	    int i_31_ = 0;
	    int i_32_ = 0;
	    int i_33_ = 0;
	    for (int i_34_ = 0; i_34_ < 128; i_34_++) {
		if (0 == i_32_) {
		    if ((i_31_ ^ 0xffffffff) <= (is_25_.length ^ 0xffffffff))
			i_32_ = -1;
		    else
			i_32_ = is_25_[i_31_++];
		    i_33_ = class14_sub10.method800(127);
		}
		i_32_--;
		aShortArray3223[i_34_]
		    += (Class14_Sub8_Sub26.method617(-1 + i_33_, 2)
			<< -632449618);
		anIntArray3218[i_34_] = i_33_;
	    }
	    i_31_ = 0;
	    i_32_ = 0;
	    int i_35_ = 0;
	    for (int i_36_ = 0; -129 < (i_36_ ^ 0xffffffff); i_36_++) {
		if ((anIntArray3218[i_36_] ^ 0xffffffff) != -1) {
		    if (-1 == (i_32_ ^ 0xffffffff)) {
			if ((is.length ^ 0xffffffff) >= (i_31_ ^ 0xffffffff))
			    i_32_ = -1;
			else
			    i_32_ = is[i_31_++];
			i_35_ = class14_sub10.aByteArray2895[i_7_++] - 1;
		    }
		    aByteArray3220[i_36_] = (byte) i_35_;
		    i_32_--;
		}
	    }
	    i_31_ = 0;
	    int i_37_ = 0;
	    i_32_ = 0;
	    for (int i_38_ = 0; 128 > i_38_; i_38_++) {
		if (anIntArray3218[i_38_] != 0) {
		    if (-1 == (i_32_ ^ 0xffffffff)) {
			if (i_31_ >= is_9_.length)
			    i_32_ = -1;
			else
			    i_32_ = is_9_[i_31_++];
			i_37_ = (class14_sub10.aByteArray2895[i_11_++] - -16
				 << 1924459266);
		    }
		    i_32_--;
		    aByteArray3227[i_38_] = (byte) i_37_;
		}
	    }
	    Class127 class127 = null;
	    i_31_ = 0;
	    i_32_ = 0;
	    for (int i_39_ = 0; (i_39_ ^ 0xffffffff) > -129; i_39_++) {
		if (0 != anIntArray3218[i_39_]) {
		    if (0 == i_32_) {
			class127 = class127s[is_15_[i_31_]];
			if (i_31_ >= is_13_.length)
			    i_32_ = -1;
			else
			    i_32_ = is_13_[i_31_++];
		    }
		    i_32_--;
		    aClass127Array3221[i_39_] = class127;
		}
	    }
	    i_32_ = 0;
	    i_31_ = 0;
	    int i_40_ = 0;
	    for (int i_41_ = 0; (i_41_ ^ 0xffffffff) > -129; i_41_++) {
		if (i_32_ == 0) {
		    if ((i_31_ ^ 0xffffffff) <= (is_25_.length ^ 0xffffffff))
			i_32_ = -1;
		    else
			i_32_ = is_25_[i_31_++];
		    if (0 < anIntArray3218[i_41_])
			i_40_ = class14_sub10.method798(-122) + 1;
		}
		i_32_--;
		aByteArray3213[i_41_] = (byte) i_40_;
	    }
	    anInt3224 = class14_sub10.method798(-107) + 1;
	    for (int i_42_ = 0; (i_42_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_42_++) {
		Class127 class127_43_ = class127s[i_42_];
		if (class127_43_.aByteArray2109 != null) {
		    for (int i_44_ = 1;
			 ((i_44_ ^ 0xffffffff)
			  > (class127_43_.aByteArray2109.length ^ 0xffffffff));
			 i_44_ += 2)
			class127_43_.aByteArray2109[i_44_]
			    = class14_sub10.method780((byte) -77);
		}
		if (null != class127_43_.aByteArray2098) {
		    for (int i_45_ = 3;
			 ((class127_43_.aByteArray2098.length - 2 ^ 0xffffffff)
			  < (i_45_ ^ 0xffffffff));
			 i_45_ += 2)
			class127_43_.aByteArray2098[i_45_]
			    = class14_sub10.method780((byte) -77);
		}
	    }
	    if (null != is_24_) {
		for (int i_46_ = 1; is_24_.length > i_46_; i_46_ += 2)
		    is_24_[i_46_] = class14_sub10.method780((byte) -77);
	    }
	    if (null != is_26_) {
		for (int i_47_ = 1;
		     (i_47_ ^ 0xffffffff) > (is_26_.length ^ 0xffffffff);
		     i_47_ += 2)
		    is_26_[i_47_] = class14_sub10.method780((byte) -77);
	    }
	    for (int i_48_ = 0; i_16_ > i_48_; i_48_++) {
		Class127 class127_49_ = class127s[i_48_];
		if (class127_49_.aByteArray2098 != null) {
		    i_28_ = 0;
		    for (int i_50_ = 2;
			 i_50_ < class127_49_.aByteArray2098.length;
			 i_50_ += 2) {
			i_28_ = class14_sub10.method798(73) + (1 + i_28_);
			class127_49_.aByteArray2098[i_50_] = (byte) i_28_;
		    }
		}
	    }
	    for (int i_51_ = 0; (i_51_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_51_++) {
		Class127 class127_52_ = class127s[i_51_];
		if (class127_52_.aByteArray2109 != null) {
		    i_28_ = 0;
		    for (int i_53_ = 2;
			 ((class127_52_.aByteArray2109.length ^ 0xffffffff)
			  < (i_53_ ^ 0xffffffff));
			 i_53_ += 2) {
			i_28_ = class14_sub10.method798(97) + (1 + i_28_);
			class127_52_.aByteArray2109[i_53_] = (byte) i_28_;
		    }
		}
	    }
	    if (is_24_ != null) {
		i_28_ = class14_sub10.method798(-34);
		is_24_[0] = (byte) i_28_;
		for (int i_54_ = 2; i_54_ < is_24_.length; i_54_ += 2) {
		    i_28_ = 1 + (i_28_ - -class14_sub10.method798(-24));
		    is_24_[i_54_] = (byte) i_28_;
		}
		int i_55_ = is_24_[0];
		int i_56_ = is_24_[1];
		for (int i_57_ = 0;
		     (i_57_ ^ 0xffffffff) > (i_55_ ^ 0xffffffff); i_57_++)
		    aByteArray3213[i_57_]
			= (byte) (i_56_ * aByteArray3213[i_57_] + 32
				  >> 1985793062);
		int i_58_ = 2;
		while (i_58_ < is_24_.length) {
		    int i_59_ = is_24_[i_58_];
		    int i_60_ = is_24_[1 + i_58_];
		    i_58_ += 2;
		    int i_61_
			= (i_59_ + -i_55_) * i_56_ + (-i_55_ + i_59_) / 2;
		    for (int i_62_ = i_55_; i_62_ < i_59_; i_62_++) {
			int i_63_
			    = Class14_Sub2_Sub3.method270(i_61_, 1,
							  -i_55_ + i_59_);
			aByteArray3213[i_62_]
			    = (byte) (aByteArray3213[i_62_] * i_63_ - -32
				      >> 1761226822);
			i_61_ += i_60_ + -i_56_;
		    }
		    i_55_ = i_59_;
		    i_56_ = i_60_;
		}
		Object object = null;
		for (int i_64_ = i_55_; -129 < (i_64_ ^ 0xffffffff); i_64_++)
		    aByteArray3213[i_64_]
			= (byte) (32 + aByteArray3213[i_64_] * i_56_
				  >> 336180742);
	    }
	    if (is_26_ != null) {
		i_28_ = class14_sub10.method798(-111);
		is_26_[0] = (byte) i_28_;
		for (int i_65_ = 2;
		     (is_26_.length ^ 0xffffffff) < (i_65_ ^ 0xffffffff);
		     i_65_ += 2) {
		    i_28_ = class14_sub10.method798(-102) + (1 + i_28_);
		    is_26_[i_65_] = (byte) i_28_;
		}
		int i_66_ = is_26_[0];
		int i_67_ = is_26_[1] << -646170463;
		for (int i_68_ = 0; i_68_ < i_66_; i_68_++) {
		    int i_69_ = (aByteArray3227[i_68_] & 0xff) + i_67_;
		    if (-1 < (i_69_ ^ 0xffffffff))
			i_69_ = 0;
		    if (-129 > (i_69_ ^ 0xffffffff))
			i_69_ = 128;
		    aByteArray3227[i_68_] = (byte) i_69_;
		}
		int i_70_ = 2;
		while (i_70_ < is_26_.length) {
		    int i_71_ = is_26_[1 + i_70_] << -757019519;
		    int i_72_ = is_26_[i_70_];
		    int i_73_ = (i_72_ - i_66_) * i_67_ + (-i_66_ + i_72_) / 2;
		    for (int i_74_ = i_66_; i_72_ > i_74_; i_74_++) {
			int i_75_ = Class14_Sub2_Sub3.method270(i_73_, 1,
								i_72_ - i_66_);
			int i_76_ = (0xff & aByteArray3227[i_74_]) + i_75_;
			if (0 > i_76_)
			    i_76_ = 0;
			if (i_76_ > 128)
			    i_76_ = 128;
			aByteArray3227[i_74_] = (byte) i_76_;
			i_73_ += -i_67_ + i_71_;
		    }
		    i_70_ += 2;
		    i_66_ = i_72_;
		    i_67_ = i_71_;
		}
		for (int i_77_ = i_66_; (i_77_ ^ 0xffffffff) > -129; i_77_++) {
		    int i_78_ = (aByteArray3227[i_77_] & 0xff) - -i_67_;
		    if ((i_78_ ^ 0xffffffff) > -1)
			i_78_ = 0;
		    if ((i_78_ ^ 0xffffffff) < -129)
			i_78_ = 128;
		    aByteArray3227[i_77_] = (byte) i_78_;
		}
		Object object = null;
	    }
	    for (int i_79_ = 0; i_79_ < i_16_; i_79_++)
		class127s[i_79_].anInt2097 = class14_sub10.method798(105);
	    for (int i_80_ = 0; (i_80_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_80_++) {
		Class127 class127_81_ = class127s[i_80_];
		if (class127_81_.aByteArray2109 != null)
		    class127_81_.anInt2096 = class14_sub10.method798(87);
		if (class127_81_.aByteArray2098 != null)
		    class127_81_.anInt2099 = class14_sub10.method798(-12);
		if (class127_81_.anInt2097 > 0)
		    class127_81_.anInt2106 = class14_sub10.method798(-41);
	    }
	    for (int i_82_ = 0; (i_82_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_82_++)
		class127s[i_82_].anInt2103 = class14_sub10.method798(-21);
	    for (int i_83_ = 0; (i_83_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_83_++) {
		Class127 class127_84_ = class127s[i_83_];
		if (class127_84_.anInt2103 > 0)
		    class127_84_.anInt2108 = class14_sub10.method798(109);
	    }
	    for (int i_85_ = 0; (i_85_ ^ 0xffffffff) > (i_16_ ^ 0xffffffff);
		 i_85_++) {
		Class127 class127_86_ = class127s[i_85_];
		if ((class127_86_.anInt2108 ^ 0xffffffff) < -1)
		    class127_86_.anInt2100 = class14_sub10.method798(62);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "v.<init>(" + (arg0 != null
							      ? "{...}"
							      : "null") + ')');
	}
    }
    
    static {
	anIntArray3225 = new int[] { 1, 2, 4, 8 };
	aClass52_3217 = new Class52(4);
	aClass124_3228
	    = Class14_Sub2_Sub2.method263(1178, "Please wait)3)3)3");
	aClass94_3230 = null;
	aClass124_3229 = aClass124_3228;
    }
}
