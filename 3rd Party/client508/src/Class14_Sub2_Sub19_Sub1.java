/* Class14_Sub2_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub19_Sub1 extends Class14_Sub2_Sub19
{
    public int[] anIntArray5088;
    
    public void method389(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4035;
	    int i_0_ = anInt4042;
	    int i_1_ = 0;
	    int i_2_ = 0;
	    int i_3_ = anInt4034;
	    int i_4_ = anInt4046;
	    int i_5_ = (i_3_ << 16) / arg2;
	    int i_6_ = (i_4_ << 16) / arg3;
	    if (anInt4033 > 0) {
		int i_7_ = ((anInt4033 << 16) + i_5_ - 1) / i_5_;
		arg0 += i_7_;
		i_1_ += i_7_ * i_5_ - (anInt4033 << 16);
	    }
	    if (anInt4050 > 0) {
		int i_8_ = ((anInt4050 << 16) + i_6_ - 1) / i_6_;
		arg1 += i_8_;
		i_2_ += i_8_ * i_6_ - (anInt4050 << 16);
	    }
	    if (i < i_3_)
		arg2 = ((i << 16) - i_1_ + i_5_ - 1) / i_5_;
	    if (i_0_ < i_4_)
		arg3 = ((i_0_ << 16) - i_2_ + i_6_ - 1) / i_6_;
	    int i_9_ = arg0 + arg1 * Class92.anInt1432;
	    int i_10_ = Class92.anInt1432 - arg2;
	    if (arg1 + arg3 > Class92.anInt1436)
		arg3 -= arg1 + arg3 - Class92.anInt1436;
	    if (arg1 < Class92.anInt1438) {
		int i_11_ = Class92.anInt1438 - arg1;
		arg3 -= i_11_;
		i_9_ += i_11_ * Class92.anInt1432;
		i_2_ += i_6_ * i_11_;
	    }
	    if (arg0 + arg2 > Class92.anInt1434) {
		int i_12_ = arg0 + arg2 - Class92.anInt1434;
		arg2 -= i_12_;
		i_10_ += i_12_;
	    }
	    if (arg0 < Class92.anInt1433) {
		int i_13_ = Class92.anInt1433 - arg0;
		arg2 -= i_13_;
		i_9_ += i_13_;
		i_1_ += i_5_ * i_13_;
		i_10_ += i_13_;
	    }
	    method414(Class92.anIntArray1437, anIntArray5088, 0, i_1_, i_2_,
		      i_9_, i_10_, arg2, arg3, i_5_, i_6_, i);
	}
    }
    
    public void method391(int arg0, int arg1) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_14_ = 0;
	int i_15_ = anInt4042;
	int i_16_ = anInt4035;
	int i_17_ = Class92.anInt1432 - i_16_;
	int i_18_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_19_ = Class92.anInt1438 - arg1;
	    i_15_ -= i_19_;
	    arg1 = Class92.anInt1438;
	    i_14_ += i_19_ * i_16_;
	    i += i_19_ * Class92.anInt1432;
	}
	if (arg1 + i_15_ > Class92.anInt1436)
	    i_15_ -= arg1 + i_15_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_20_ = Class92.anInt1433 - arg0;
	    i_16_ -= i_20_;
	    arg0 = Class92.anInt1433;
	    i_14_ += i_20_;
	    i += i_20_;
	    i_18_ += i_20_;
	    i_17_ += i_20_;
	}
	if (arg0 + i_16_ > Class92.anInt1434) {
	    int i_21_ = arg0 + i_16_ - Class92.anInt1434;
	    i_16_ -= i_21_;
	    i_18_ += i_21_;
	    i_17_ += i_21_;
	}
	if (i_16_ > 0 && i_15_ > 0)
	    method401(Class92.anIntArray1437, anIntArray5088, 0, i_14_, i,
		      i_16_, i_15_, i_17_, i_18_);
    }
    
    public static void method401(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_22_ = -arg6; i_22_ < 0; i_22_++) {
	    for (int i_23_ = i; i_23_ < 0; i_23_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_24_ = arg5; i_24_ < 0; i_24_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4035;
	    int i_25_ = anInt4042;
	    int i_26_ = 0;
	    int i_27_ = 0;
	    int i_28_ = anInt4034;
	    int i_29_ = anInt4046;
	    int i_30_ = (i_28_ << 16) / arg2;
	    int i_31_ = (i_29_ << 16) / arg3;
	    if (anInt4033 > 0) {
		int i_32_ = ((anInt4033 << 16) + i_30_ - 1) / i_30_;
		arg0 += i_32_;
		i_26_ += i_32_ * i_30_ - (anInt4033 << 16);
	    }
	    if (anInt4050 > 0) {
		int i_33_ = ((anInt4050 << 16) + i_31_ - 1) / i_31_;
		arg1 += i_33_;
		i_27_ += i_33_ * i_31_ - (anInt4050 << 16);
	    }
	    if (i < i_28_)
		arg2 = ((i << 16) - i_26_ + i_30_ - 1) / i_30_;
	    if (i_25_ < i_29_)
		arg3 = ((i_25_ << 16) - i_27_ + i_31_ - 1) / i_31_;
	    int i_34_ = arg0 + arg1 * Class92.anInt1432;
	    int i_35_ = Class92.anInt1432 - arg2;
	    if (arg1 + arg3 > Class92.anInt1436)
		arg3 -= arg1 + arg3 - Class92.anInt1436;
	    if (arg1 < Class92.anInt1438) {
		int i_36_ = Class92.anInt1438 - arg1;
		arg3 -= i_36_;
		i_34_ += i_36_ * Class92.anInt1432;
		i_27_ += i_31_ * i_36_;
	    }
	    if (arg0 + arg2 > Class92.anInt1434) {
		int i_37_ = arg0 + arg2 - Class92.anInt1434;
		arg2 -= i_37_;
		i_35_ += i_37_;
	    }
	    if (arg0 < Class92.anInt1433) {
		int i_38_ = Class92.anInt1433 - arg0;
		arg2 -= i_38_;
		i_34_ += i_38_;
		i_26_ += i_30_ * i_38_;
		i_35_ += i_38_;
	    }
	    method409(Class92.anIntArray1437, anIntArray5088, 0, i_26_, i_27_,
		      i_34_, i_35_, arg2, arg3, i_30_, i_31_, i, arg4);
	}
    }
    
    public void method402(int arg0) {
	if (anInt4035 != anInt4034 || anInt4042 != anInt4046) {
	    int i = arg0;
	    if (i > anInt4033)
		i = anInt4033;
	    int i_39_ = arg0;
	    if (i_39_ + anInt4033 + anInt4035 > anInt4034)
		i_39_ = anInt4034 - anInt4033 - anInt4035;
	    int i_40_ = arg0;
	    if (i_40_ > anInt4050)
		i_40_ = anInt4050;
	    int i_41_ = arg0;
	    if (i_41_ + anInt4050 + anInt4042 > anInt4046)
		i_41_ = anInt4046 - anInt4050 - anInt4042;
	    int i_42_ = anInt4035 + i + i_39_;
	    int i_43_ = anInt4042 + i_40_ + i_41_;
	    int[] is = new int[i_42_ * i_43_];
	    for (int i_44_ = 0; i_44_ < anInt4042; i_44_++) {
		for (int i_45_ = 0; i_45_ < anInt4035; i_45_++)
		    is[(i_44_ + i_40_) * i_42_ + (i_45_ + i)]
			= anIntArray5088[i_44_ * anInt4035 + i_45_];
	    }
	    anIntArray5088 = is;
	    anInt4035 = i_42_;
	    anInt4042 = i_43_;
	    anInt4033 -= i;
	    anInt4050 -= i_40_;
	}
    }
    
    public static void method403(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10) {
	int i = 256 - arg9;
	int i_46_ = (arg10 & 0xff00ff) * i & ~0xff00ff;
	int i_47_ = (arg10 & 0xff00) * i & 0xff0000;
	arg10 = (i_46_ | i_47_) >>> 8;
	for (int i_48_ = -arg6; i_48_ < 0; i_48_++) {
	    for (int i_49_ = -arg5; i_49_ < 0; i_49_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0) {
		    i_46_ = (arg2 & 0xff00ff) * arg9 & ~0xff00ff;
		    i_47_ = (arg2 & 0xff00) * arg9 & 0xff0000;
		    arg0[arg4++] = ((i_46_ | i_47_) >>> 8) + arg10;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method404() {
	if (anInt4035 != anInt4034 || anInt4042 != anInt4046) {
	    int[] is = new int[anInt4034 * anInt4046];
	    for (int i = 0; i < anInt4042; i++) {
		for (int i_50_ = 0; i_50_ < anInt4035; i_50_++)
		    is[(i + anInt4050) * anInt4034 + (i_50_ + anInt4033)]
			= anIntArray5088[i * anInt4035 + i_50_];
	    }
	    anIntArray5088 = is;
	    anInt4035 = anInt4034;
	    anInt4042 = anInt4046;
	    anInt4033 = 0;
	    anInt4050 = 0;
	}
    }
    
    public void method398(int arg0, int arg1, int arg2) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_51_ = 0;
	int i_52_ = anInt4042;
	int i_53_ = anInt4035;
	int i_54_ = Class92.anInt1432 - i_53_;
	int i_55_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_56_ = Class92.anInt1438 - arg1;
	    i_52_ -= i_56_;
	    arg1 = Class92.anInt1438;
	    i_51_ += i_56_ * i_53_;
	    i += i_56_ * Class92.anInt1432;
	}
	if (arg1 + i_52_ > Class92.anInt1436)
	    i_52_ -= arg1 + i_52_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_57_ = Class92.anInt1433 - arg0;
	    i_53_ -= i_57_;
	    arg0 = Class92.anInt1433;
	    i_51_ += i_57_;
	    i += i_57_;
	    i_55_ += i_57_;
	    i_54_ += i_57_;
	}
	if (arg0 + i_53_ > Class92.anInt1434) {
	    int i_58_ = arg0 + i_53_ - Class92.anInt1434;
	    i_53_ -= i_58_;
	    i_55_ += i_58_;
	    i_54_ += i_58_;
	}
	if (i_53_ > 0 && i_52_ > 0)
	    method407(Class92.anIntArray1437, anIntArray5088, 0, i_51_, i,
		      i_53_, i_52_, i_54_, i_55_, arg2);
    }
    
    public static void method405(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	for (int i = -arg5; i < 0; i++) {
	    int i_59_ = arg3 + arg4 - 3;
	    while (arg3 < i_59_) {
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
		arg0[arg3++] = arg1[arg2++];
	    }
	    i_59_ += 3;
	    while (arg3 < i_59_)
		arg0[arg3++] = arg1[arg2++];
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public void method406() {
	int[] is = new int[anInt4035 * anInt4042];
	int i = 0;
	for (int i_60_ = anInt4042 - 1; i_60_ >= 0; i_60_--) {
	    for (int i_61_ = 0; i_61_ < anInt4035; i_61_++)
		is[i++] = anIntArray5088[i_61_ + i_60_ * anInt4035];
	}
	anIntArray5088 = is;
	anInt4050 = anInt4046 - anInt4042 - anInt4050;
    }
    
    public static void method407(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	int i = 256 - arg9;
	for (int i_62_ = -arg6; i_62_ < 0; i_62_++) {
	    for (int i_63_ = -arg5; i_63_ < 0; i_63_++) {
		arg2 = arg1[arg3++];
		if (arg2 != 0) {
		    int i_64_ = arg0[arg4];
		    arg0[arg4++]
			= (((arg2 & 0xff00ff) * arg9 + (i_64_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((arg2 & 0xff00) * arg9 + (i_64_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method408(int arg0) {
	for (int i = anInt4042 - 1; i > 0; i--) {
	    int i_65_ = i * anInt4035;
	    for (int i_66_ = anInt4035 - 1; i_66_ > 0; i_66_--) {
		if (anIntArray5088[i_66_ + i_65_] == 0
		    && anIntArray5088[i_66_ + i_65_ - 1 - anInt4035] != 0)
		    anIntArray5088[i_66_ + i_65_] = arg0;
	    }
	}
    }
    
    public static void method409(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12) {
	int i = 256 - arg12;
	int i_67_ = arg3;
	for (int i_68_ = -arg8; i_68_ < 0; i_68_++) {
	    int i_69_ = (arg4 >> 16) * arg11;
	    for (int i_70_ = -arg7; i_70_ < 0; i_70_++) {
		arg2 = arg1[(arg3 >> 16) + i_69_];
		if (arg2 != 0) {
		    int i_71_ = arg0[arg5];
		    arg0[arg5++]
			= (((arg2 & 0xff00ff) * arg12 + (i_71_ & 0xff00ff) * i
			    & ~0xff00ff)
			   + ((arg2 & 0xff00) * arg12 + (i_71_ & 0xff00) * i
			      & 0xff0000)) >> 8;
		} else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i_67_;
	    arg5 += arg6;
	}
    }
    
    public void method410(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anIntArray5088.length; i++) {
	    int i_72_ = anIntArray5088[i];
	    if (i_72_ != 0) {
		int i_73_ = i_72_ >> 16 & 0xff;
		i_73_ += arg0;
		if (i_73_ < 1)
		    i_73_ = 1;
		else if (i_73_ > 255)
		    i_73_ = 255;
		int i_74_ = i_72_ >> 8 & 0xff;
		i_74_ += arg1;
		if (i_74_ < 1)
		    i_74_ = 1;
		else if (i_74_ > 255)
		    i_74_ = 255;
		int i_75_ = i_72_ & 0xff;
		i_75_ += arg2;
		if (i_75_ < 1)
		    i_75_ = 1;
		else if (i_75_ > 255)
		    i_75_ = 255;
		anIntArray5088[i] = (i_73_ << 16) + (i_74_ << 8) + i_75_;
	    }
	}
    }
    
    public void method390(int arg0, int arg1) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_76_ = 0;
	int i_77_ = anInt4042;
	int i_78_ = anInt4035;
	int i_79_ = Class92.anInt1432 - i_78_;
	int i_80_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_81_ = Class92.anInt1438 - arg1;
	    i_77_ -= i_81_;
	    arg1 = Class92.anInt1438;
	    i_76_ += i_81_ * i_78_;
	    i += i_81_ * Class92.anInt1432;
	}
	if (arg1 + i_77_ > Class92.anInt1436)
	    i_77_ -= arg1 + i_77_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_82_ = Class92.anInt1433 - arg0;
	    i_78_ -= i_82_;
	    arg0 = Class92.anInt1433;
	    i_76_ += i_82_;
	    i += i_82_;
	    i_80_ += i_82_;
	    i_79_ += i_82_;
	}
	if (arg0 + i_78_ > Class92.anInt1434) {
	    int i_83_ = arg0 + i_78_ - Class92.anInt1434;
	    i_78_ -= i_83_;
	    i_80_ += i_83_;
	    i_79_ += i_83_;
	}
	if (i_78_ > 0 && i_77_ > 0)
	    method405(Class92.anIntArray1437, anIntArray5088, i_76_, i, i_78_,
		      i_77_, i_79_, i_80_);
    }
    
    public void method411(int arg0) {
	int[] is = new int[anInt4035 * anInt4042];
	int i = 0;
	for (int i_84_ = 0; i_84_ < anInt4042; i_84_++) {
	    for (int i_85_ = 0; i_85_ < anInt4035; i_85_++) {
		int i_86_ = anIntArray5088[i];
		if (i_86_ == 0) {
		    if (i_85_ > 0 && anIntArray5088[i - 1] != 0)
			i_86_ = arg0;
		    else if (i_84_ > 0 && anIntArray5088[i - anInt4035] != 0)
			i_86_ = arg0;
		    else if (i_85_ < anInt4035 - 1
			     && anIntArray5088[i + 1] != 0)
			i_86_ = arg0;
		    else if (i_84_ < anInt4042 - 1
			     && anIntArray5088[i + anInt4035] != 0)
			i_86_ = arg0;
		}
		is[i++] = i_86_;
	    }
	}
	anIntArray5088 = is;
    }
    
    public void method412() {
	int[] is = new int[anInt4035 * anInt4042];
	int i = 0;
	for (int i_87_ = 0; i_87_ < anInt4042; i_87_++) {
	    for (int i_88_ = anInt4035 - 1; i_88_ >= 0; i_88_--)
		is[i++] = anIntArray5088[i_88_ + i_87_ * anInt4035];
	}
	anIntArray5088 = is;
	anInt4033 = anInt4034 - anInt4035 - anInt4033;
    }
    
    public void method395(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg5 != 0) {
	    arg0 -= anInt4033 << 4;
	    arg1 -= anInt4050 << 4;
	    double d = (double) (arg4 & 0xffff) * 9.587379924285257E-5;
	    int i = (int) Math.floor(Math.sin(d) * (double) arg5 + 0.5);
	    int i_89_ = (int) Math.floor(Math.cos(d) * (double) arg5 + 0.5);
	    int i_90_ = -arg0 * i_89_ + -arg1 * i;
	    int i_91_ = --arg0 * i + -arg1 * i_89_;
	    int i_92_ = ((anInt4035 << 4) - arg0) * i_89_ + -arg1 * i;
	    int i_93_ = -((anInt4035 << 4) - arg0) * i + -arg1 * i_89_;
	    int i_94_ = -arg0 * i_89_ + ((anInt4042 << 4) - arg1) * i;
	    int i_95_ = --arg0 * i + ((anInt4042 << 4) - arg1) * i_89_;
	    int i_96_ = (((anInt4035 << 4) - arg0) * i_89_
			 + ((anInt4042 << 4) - arg1) * i);
	    int i_97_ = (-((anInt4035 << 4) - arg0) * i
			 + ((anInt4042 << 4) - arg1) * i_89_);
	    int i_98_;
	    int i_99_;
	    if (i_90_ < i_92_) {
		i_98_ = i_90_;
		i_99_ = i_92_;
	    } else {
		i_98_ = i_92_;
		i_99_ = i_90_;
	    }
	    if (i_94_ < i_98_)
		i_98_ = i_94_;
	    if (i_96_ < i_98_)
		i_98_ = i_96_;
	    if (i_94_ > i_99_)
		i_99_ = i_94_;
	    if (i_96_ > i_99_)
		i_99_ = i_96_;
	    int i_100_;
	    int i_101_;
	    if (i_91_ < i_93_) {
		i_100_ = i_91_;
		i_101_ = i_93_;
	    } else {
		i_100_ = i_93_;
		i_101_ = i_91_;
	    }
	    if (i_95_ < i_100_)
		i_100_ = i_95_;
	    if (i_97_ < i_100_)
		i_100_ = i_97_;
	    if (i_95_ > i_101_)
		i_101_ = i_95_;
	    if (i_97_ > i_101_)
		i_101_ = i_97_;
	    i_98_ >>= 12;
	    i_99_ = i_99_ + 4095 >> 12;
	    i_100_ >>= 12;
	    i_101_ = i_101_ + 4095 >> 12;
	    i_98_ += arg2;
	    i_99_ += arg2;
	    i_100_ += arg3;
	    i_101_ += arg3;
	    i_98_ >>= 4;
	    i_99_ = i_99_ + 15 >> 4;
	    i_100_ >>= 4;
	    i_101_ = i_101_ + 15 >> 4;
	    if (i_98_ < Class92.anInt1433)
		i_98_ = Class92.anInt1433;
	    if (i_99_ > Class92.anInt1434)
		i_99_ = Class92.anInt1434;
	    if (i_100_ < Class92.anInt1438)
		i_100_ = Class92.anInt1438;
	    if (i_101_ > Class92.anInt1436)
		i_101_ = Class92.anInt1436;
	    i_99_ = i_98_ - i_99_;
	    if (i_99_ < 0) {
		i_101_ = i_100_ - i_101_;
		if (i_101_ < 0) {
		    int i_102_ = i_100_ * Class92.anInt1432 + i_98_;
		    double d_103_ = 1.6777216E7 / (double) arg5;
		    int i_104_ = (int) Math.floor(Math.sin(d) * d_103_ + 0.5);
		    int i_105_ = (int) Math.floor(Math.cos(d) * d_103_ + 0.5);
		    int i_106_ = (i_98_ << 4) + 8 - arg2;
		    int i_107_ = (i_100_ << 4) + 8 - arg3;
		    int i_108_ = (arg0 << 8) - (i_107_ * i_104_ >> 4);
		    int i_109_ = (arg1 << 8) + (i_107_ * i_105_ >> 4);
		    if (i_105_ == 0) {
			if (i_104_ == 0) {
			    int i_110_ = i_101_;
			    while (i_110_ < 0) {
				int i_111_ = i_102_;
				int i_112_ = i_108_;
				int i_113_ = i_109_;
				int i_114_ = i_99_;
				if (i_112_ >= 0 && i_113_ >= 0
				    && i_112_ - (anInt4035 << 12) < 0
				    && i_113_ - (anInt4042 << 12) < 0) {
				    for (/**/; i_114_ < 0; i_114_++) {
					int i_115_
					    = (anIntArray5088
					       [((i_113_ >> 12) * anInt4035
						 + (i_112_ >> 12))]);
					if (i_115_ != 0)
					    Class92.anIntArray1437[i_111_++]
						= i_115_;
					else
					    i_111_++;
				    }
				}
				i_110_++;
				i_102_ += Class92.anInt1432;
			    }
			} else if (i_104_ < 0) {
			    int i_116_ = i_101_;
			    while (i_116_ < 0) {
				int i_117_ = i_102_;
				int i_118_ = i_108_;
				int i_119_ = i_109_ + (i_106_ * i_104_ >> 4);
				int i_120_ = i_99_;
				if (i_118_ >= 0
				    && i_118_ - (anInt4035 << 12) < 0) {
				    int i_121_;
				    if ((i_121_ = i_119_ - (anInt4042 << 12))
					>= 0) {
					i_121_ = (i_104_ - i_121_) / i_104_;
					i_120_ += i_121_;
					i_119_ += i_104_ * i_121_;
					i_117_ += i_121_;
				    }
				    if ((i_121_ = (i_119_ - i_104_) / i_104_)
					> i_120_)
					i_120_ = i_121_;
				    for (/**/; i_120_ < 0; i_120_++) {
					int i_122_
					    = (anIntArray5088
					       [((i_119_ >> 12) * anInt4035
						 + (i_118_ >> 12))]);
					if (i_122_ != 0)
					    Class92.anIntArray1437[i_117_++]
						= i_122_;
					else
					    i_117_++;
					i_119_ += i_104_;
				    }
				}
				i_116_++;
				i_108_ -= i_104_;
				i_102_ += Class92.anInt1432;
			    }
			} else {
			    int i_123_ = i_101_;
			    while (i_123_ < 0) {
				int i_124_ = i_102_;
				int i_125_ = i_108_;
				int i_126_ = i_109_ + (i_106_ * i_104_ >> 4);
				int i_127_ = i_99_;
				if (i_125_ >= 0
				    && i_125_ - (anInt4035 << 12) < 0) {
				    if (i_126_ < 0) {
					int i_128_
					    = (i_104_ - 1 - i_126_) / i_104_;
					i_127_ += i_128_;
					i_126_ += i_104_ * i_128_;
					i_124_ += i_128_;
				    }
				    int i_129_;
				    if ((i_129_
					 = (1 + i_126_ - (anInt4042 << 12)
					    - i_104_) / i_104_)
					> i_127_)
					i_127_ = i_129_;
				    for (/**/; i_127_ < 0; i_127_++) {
					int i_130_
					    = (anIntArray5088
					       [((i_126_ >> 12) * anInt4035
						 + (i_125_ >> 12))]);
					if (i_130_ != 0)
					    Class92.anIntArray1437[i_124_++]
						= i_130_;
					else
					    i_124_++;
					i_126_ += i_104_;
				    }
				}
				i_123_++;
				i_108_ -= i_104_;
				i_102_ += Class92.anInt1432;
			    }
			}
		    } else if (i_105_ < 0) {
			if (i_104_ == 0) {
			    int i_131_ = i_101_;
			    while (i_131_ < 0) {
				int i_132_ = i_102_;
				int i_133_ = i_108_ + (i_106_ * i_105_ >> 4);
				int i_134_ = i_109_;
				int i_135_ = i_99_;
				if (i_134_ >= 0
				    && i_134_ - (anInt4042 << 12) < 0) {
				    int i_136_;
				    if ((i_136_ = i_133_ - (anInt4035 << 12))
					>= 0) {
					i_136_ = (i_105_ - i_136_) / i_105_;
					i_135_ += i_136_;
					i_133_ += i_105_ * i_136_;
					i_132_ += i_136_;
				    }
				    if ((i_136_ = (i_133_ - i_105_) / i_105_)
					> i_135_)
					i_135_ = i_136_;
				    for (/**/; i_135_ < 0; i_135_++) {
					int i_137_
					    = (anIntArray5088
					       [((i_134_ >> 12) * anInt4035
						 + (i_133_ >> 12))]);
					if (i_137_ != 0)
					    Class92.anIntArray1437[i_132_++]
						= i_137_;
					else
					    i_132_++;
					i_133_ += i_105_;
				    }
				}
				i_131_++;
				i_109_ += i_105_;
				i_102_ += Class92.anInt1432;
			    }
			} else if (i_104_ < 0) {
			    int i_138_ = i_101_;
			    while (i_138_ < 0) {
				int i_139_ = i_102_;
				int i_140_ = i_108_ + (i_106_ * i_105_ >> 4);
				int i_141_ = i_109_ + (i_106_ * i_104_ >> 4);
				int i_142_ = i_99_;
				int i_143_;
				if ((i_143_ = i_140_ - (anInt4035 << 12))
				    >= 0) {
				    i_143_ = (i_105_ - i_143_) / i_105_;
				    i_142_ += i_143_;
				    i_140_ += i_105_ * i_143_;
				    i_141_ += i_104_ * i_143_;
				    i_139_ += i_143_;
				}
				if ((i_143_ = (i_140_ - i_105_) / i_105_)
				    > i_142_)
				    i_142_ = i_143_;
				if ((i_143_ = i_141_ - (anInt4042 << 12))
				    >= 0) {
				    i_143_ = (i_104_ - i_143_) / i_104_;
				    i_142_ += i_143_;
				    i_140_ += i_105_ * i_143_;
				    i_141_ += i_104_ * i_143_;
				    i_139_ += i_143_;
				}
				if ((i_143_ = (i_141_ - i_104_) / i_104_)
				    > i_142_)
				    i_142_ = i_143_;
				for (/**/; i_142_ < 0; i_142_++) {
				    int i_144_ = (anIntArray5088
						  [((i_141_ >> 12) * anInt4035
						    + (i_140_ >> 12))]);
				    if (i_144_ != 0)
					Class92.anIntArray1437[i_139_++]
					    = i_144_;
				    else
					i_139_++;
				    i_140_ += i_105_;
				    i_141_ += i_104_;
				}
				i_138_++;
				i_108_ -= i_104_;
				i_109_ += i_105_;
				i_102_ += Class92.anInt1432;
			    }
			} else {
			    int i_145_ = i_101_;
			    while (i_145_ < 0) {
				int i_146_ = i_102_;
				int i_147_ = i_108_ + (i_106_ * i_105_ >> 4);
				int i_148_ = i_109_ + (i_106_ * i_104_ >> 4);
				int i_149_ = i_99_;
				int i_150_;
				if ((i_150_ = i_147_ - (anInt4035 << 12))
				    >= 0) {
				    i_150_ = (i_105_ - i_150_) / i_105_;
				    i_149_ += i_150_;
				    i_147_ += i_105_ * i_150_;
				    i_148_ += i_104_ * i_150_;
				    i_146_ += i_150_;
				}
				if ((i_150_ = (i_147_ - i_105_) / i_105_)
				    > i_149_)
				    i_149_ = i_150_;
				if (i_148_ < 0) {
				    i_150_ = (i_104_ - 1 - i_148_) / i_104_;
				    i_149_ += i_150_;
				    i_147_ += i_105_ * i_150_;
				    i_148_ += i_104_ * i_150_;
				    i_146_ += i_150_;
				}
				if ((i_150_ = (1 + i_148_ - (anInt4042 << 12)
					       - i_104_) / i_104_)
				    > i_149_)
				    i_149_ = i_150_;
				for (/**/; i_149_ < 0; i_149_++) {
				    int i_151_ = (anIntArray5088
						  [((i_148_ >> 12) * anInt4035
						    + (i_147_ >> 12))]);
				    if (i_151_ != 0)
					Class92.anIntArray1437[i_146_++]
					    = i_151_;
				    else
					i_146_++;
				    i_147_ += i_105_;
				    i_148_ += i_104_;
				}
				i_145_++;
				i_108_ -= i_104_;
				i_109_ += i_105_;
				i_102_ += Class92.anInt1432;
			    }
			}
		    } else if (i_104_ == 0) {
			int i_152_ = i_101_;
			while (i_152_ < 0) {
			    int i_153_ = i_102_;
			    int i_154_ = i_108_ + (i_106_ * i_105_ >> 4);
			    int i_155_ = i_109_;
			    int i_156_ = i_99_;
			    if (i_155_ >= 0
				&& i_155_ - (anInt4042 << 12) < 0) {
				if (i_154_ < 0) {
				    int i_157_
					= (i_105_ - 1 - i_154_) / i_105_;
				    i_156_ += i_157_;
				    i_154_ += i_105_ * i_157_;
				    i_153_ += i_157_;
				}
				int i_158_;
				if ((i_158_ = (1 + i_154_ - (anInt4035 << 12)
					       - i_105_) / i_105_)
				    > i_156_)
				    i_156_ = i_158_;
				for (/**/; i_156_ < 0; i_156_++) {
				    int i_159_ = (anIntArray5088
						  [((i_155_ >> 12) * anInt4035
						    + (i_154_ >> 12))]);
				    if (i_159_ != 0)
					Class92.anIntArray1437[i_153_++]
					    = i_159_;
				    else
					i_153_++;
				    i_154_ += i_105_;
				}
			    }
			    i_152_++;
			    i_109_ += i_105_;
			    i_102_ += Class92.anInt1432;
			}
		    } else if (i_104_ < 0) {
			int i_160_ = i_101_;
			while (i_160_ < 0) {
			    int i_161_ = i_102_;
			    int i_162_ = i_108_ + (i_106_ * i_105_ >> 4);
			    int i_163_ = i_109_ + (i_106_ * i_104_ >> 4);
			    int i_164_ = i_99_;
			    if (i_162_ < 0) {
				int i_165_ = (i_105_ - 1 - i_162_) / i_105_;
				i_164_ += i_165_;
				i_162_ += i_105_ * i_165_;
				i_163_ += i_104_ * i_165_;
				i_161_ += i_165_;
			    }
			    int i_166_;
			    if ((i_166_ = (1 + i_162_ - (anInt4035 << 12)
					   - i_105_) / i_105_)
				> i_164_)
				i_164_ = i_166_;
			    if ((i_166_ = i_163_ - (anInt4042 << 12)) >= 0) {
				i_166_ = (i_104_ - i_166_) / i_104_;
				i_164_ += i_166_;
				i_162_ += i_105_ * i_166_;
				i_163_ += i_104_ * i_166_;
				i_161_ += i_166_;
			    }
			    if ((i_166_ = (i_163_ - i_104_) / i_104_) > i_164_)
				i_164_ = i_166_;
			    for (/**/; i_164_ < 0; i_164_++) {
				int i_167_
				    = (anIntArray5088
				       [(i_163_ >> 12) * anInt4035 + (i_162_
								      >> 12)]);
				if (i_167_ != 0)
				    Class92.anIntArray1437[i_161_++] = i_167_;
				else
				    i_161_++;
				i_162_ += i_105_;
				i_163_ += i_104_;
			    }
			    i_160_++;
			    i_108_ -= i_104_;
			    i_109_ += i_105_;
			    i_102_ += Class92.anInt1432;
			}
		    } else {
			int i_168_ = i_101_;
			while (i_168_ < 0) {
			    int i_169_ = i_102_;
			    int i_170_ = i_108_ + (i_106_ * i_105_ >> 4);
			    int i_171_ = i_109_ + (i_106_ * i_104_ >> 4);
			    int i_172_ = i_99_;
			    if (i_170_ < 0) {
				int i_173_ = (i_105_ - 1 - i_170_) / i_105_;
				i_172_ += i_173_;
				i_170_ += i_105_ * i_173_;
				i_171_ += i_104_ * i_173_;
				i_169_ += i_173_;
			    }
			    int i_174_;
			    if ((i_174_ = (1 + i_170_ - (anInt4035 << 12)
					   - i_105_) / i_105_)
				> i_172_)
				i_172_ = i_174_;
			    if (i_171_ < 0) {
				i_174_ = (i_104_ - 1 - i_171_) / i_104_;
				i_172_ += i_174_;
				i_170_ += i_105_ * i_174_;
				i_171_ += i_104_ * i_174_;
				i_169_ += i_174_;
			    }
			    if ((i_174_ = (1 + i_171_ - (anInt4042 << 12)
					   - i_104_) / i_104_)
				> i_172_)
				i_172_ = i_174_;
			    for (/**/; i_172_ < 0; i_172_++) {
				int i_175_
				    = (anIntArray5088
				       [(i_171_ >> 12) * anInt4035 + (i_170_
								      >> 12)]);
				if (i_175_ != 0)
				    Class92.anIntArray1437[i_169_++] = i_175_;
				else
				    i_169_++;
				i_170_ += i_105_;
				i_171_ += i_104_;
			    }
			    i_168_++;
			    i_108_ -= i_104_;
			    i_109_ += i_105_;
			    i_102_ += Class92.anInt1432;
			}
		    }
		}
	    }
	}
    }
    
    public void method413() {
	Class92.method1455(anIntArray5088, anInt4035, anInt4042);
    }
    
    public static void method414(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11) {
	int i = arg3;
	for (int i_176_ = -arg8; i_176_ < 0; i_176_++) {
	    int i_177_ = (arg4 >> 16) * arg11;
	    for (int i_178_ = -arg7; i_178_ < 0; i_178_++) {
		arg2 = arg1[(arg3 >> 16) + i_177_];
		if (arg2 != 0)
		    arg0[arg5++] = arg2;
		else
		    arg5++;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public Class14_Sub2_Sub19_Sub1(int arg0, int arg1, int arg2, int arg3,
				   int arg4, int arg5, int[] arg6) {
	anInt4034 = arg0;
	anInt4046 = arg1;
	anInt4033 = arg2;
	anInt4050 = arg3;
	anInt4035 = arg4;
	anInt4042 = arg5;
	anIntArray5088 = arg6;
    }
    
    public Class14_Sub2_Sub19_Sub1(int arg0, int arg1) {
	anIntArray5088 = new int[arg0 * arg1];
	anInt4035 = anInt4034 = arg0;
	anInt4042 = anInt4046 = arg1;
	anInt4033 = anInt4050 = 0;
    }
    
    public void method400(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 == 256)
	    method391(arg0, arg1);
	else {
	    arg0 += anInt4033;
	    arg1 += anInt4050;
	    int i = arg0 + arg1 * Class92.anInt1432;
	    int i_179_ = 0;
	    int i_180_ = anInt4042;
	    int i_181_ = anInt4035;
	    int i_182_ = Class92.anInt1432 - i_181_;
	    int i_183_ = 0;
	    if (arg1 < Class92.anInt1438) {
		int i_184_ = Class92.anInt1438 - arg1;
		i_180_ -= i_184_;
		arg1 = Class92.anInt1438;
		i_179_ += i_184_ * i_181_;
		i += i_184_ * Class92.anInt1432;
	    }
	    if (arg1 + i_180_ > Class92.anInt1436)
		i_180_ -= arg1 + i_180_ - Class92.anInt1436;
	    if (arg0 < Class92.anInt1433) {
		int i_185_ = Class92.anInt1433 - arg0;
		i_181_ -= i_185_;
		arg0 = Class92.anInt1433;
		i_179_ += i_185_;
		i += i_185_;
		i_183_ += i_185_;
		i_182_ += i_185_;
	    }
	    if (arg0 + i_181_ > Class92.anInt1434) {
		int i_186_ = arg0 + i_181_ - Class92.anInt1434;
		i_181_ -= i_186_;
		i_183_ += i_186_;
		i_182_ += i_186_;
	    }
	    if (i_181_ > 0 && i_180_ > 0)
		method403(Class92.anIntArray1437, anIntArray5088, 0, i_179_, i,
			  i_181_, i_180_, i_182_, i_183_, arg2, arg3);
	}
    }
}
