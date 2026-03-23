/* Class14_Sub2_Sub19_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub19_Sub1_Sub1 extends Class14_Sub2_Sub19_Sub1
{
    public static void method415(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12) {
	int i = arg3;
	for (int i_0_ = -arg8; i_0_ < 0; i_0_++) {
	    int i_1_ = (arg4 >> 16) * arg11;
	    for (int i_2_ = -arg7; i_2_ < 0; i_2_++) {
		int i_3_ = arg1[(arg3 >> 16) + i_1_];
		int i_4_ = arg0[arg5];
		int i_5_ = (i_3_ >>> 24) - (255 - arg12);
		if (i_5_ < 0)
		    i_5_ = 0;
		int i_6_ = 256 - i_5_;
		arg0[arg5++]
		    = (((i_3_ & 0xff00ff) * i_5_ + (i_4_ & 0xff00ff) * i_6_
			& ~0xff00ff)
		       + ((i_3_ & 0xff00) * i_5_ + (i_4_ & 0xff00) * i_6_
			  & 0xff0000)) >> 8;
		arg3 += arg9;
	    }
	    arg4 += arg10;
	    arg3 = i;
	    arg5 += arg6;
	}
    }
    
    public void method398(int arg0, int arg1, int arg2) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_7_ = 0;
	int i_8_ = anInt4042;
	int i_9_ = anInt4035;
	int i_10_ = Class92.anInt1432 - i_9_;
	int i_11_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_12_ = Class92.anInt1438 - arg1;
	    i_8_ -= i_12_;
	    arg1 = Class92.anInt1438;
	    i_7_ += i_12_ * i_9_;
	    i += i_12_ * Class92.anInt1432;
	}
	if (arg1 + i_8_ > Class92.anInt1436)
	    i_8_ -= arg1 + i_8_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_13_ = Class92.anInt1433 - arg0;
	    i_9_ -= i_13_;
	    arg0 = Class92.anInt1433;
	    i_7_ += i_13_;
	    i += i_13_;
	    i_11_ += i_13_;
	    i_10_ += i_13_;
	}
	if (arg0 + i_9_ > Class92.anInt1434) {
	    int i_14_ = arg0 + i_9_ - Class92.anInt1434;
	    i_9_ -= i_14_;
	    i_11_ += i_14_;
	    i_10_ += i_14_;
	}
	if (i_9_ > 0 && i_8_ > 0)
	    method418(Class92.anIntArray1437, anIntArray5088, 0, i_7_, i, i_9_,
		      i_8_, i_10_, i_11_, arg2);
    }
    
    public void method391(int arg0, int arg1) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_15_ = 0;
	int i_16_ = anInt4042;
	int i_17_ = anInt4035;
	int i_18_ = Class92.anInt1432 - i_17_;
	int i_19_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_20_ = Class92.anInt1438 - arg1;
	    i_16_ -= i_20_;
	    arg1 = Class92.anInt1438;
	    i_15_ += i_20_ * i_17_;
	    i += i_20_ * Class92.anInt1432;
	}
	if (arg1 + i_16_ > Class92.anInt1436)
	    i_16_ -= arg1 + i_16_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_21_ = Class92.anInt1433 - arg0;
	    i_17_ -= i_21_;
	    arg0 = Class92.anInt1433;
	    i_15_ += i_21_;
	    i += i_21_;
	    i_19_ += i_21_;
	    i_18_ += i_21_;
	}
	if (arg0 + i_17_ > Class92.anInt1434) {
	    int i_22_ = arg0 + i_17_ - Class92.anInt1434;
	    i_17_ -= i_22_;
	    i_19_ += i_22_;
	    i_18_ += i_22_;
	}
	if (i_17_ > 0 && i_16_ > 0)
	    method417(Class92.anIntArray1437, anIntArray5088, 0, i_15_, i,
		      i_17_, i_16_, i_18_, i_19_);
    }
    
    public void method390(int arg0, int arg1) {
	arg0 += anInt4033;
	arg1 += anInt4050;
	int i = arg0 + arg1 * Class92.anInt1432;
	int i_23_ = 0;
	int i_24_ = anInt4042;
	int i_25_ = anInt4035;
	int i_26_ = Class92.anInt1432 - i_25_;
	int i_27_ = 0;
	if (arg1 < Class92.anInt1438) {
	    int i_28_ = Class92.anInt1438 - arg1;
	    i_24_ -= i_28_;
	    arg1 = Class92.anInt1438;
	    i_23_ += i_28_ * i_25_;
	    i += i_28_ * Class92.anInt1432;
	}
	if (arg1 + i_24_ > Class92.anInt1436)
	    i_24_ -= arg1 + i_24_ - Class92.anInt1436;
	if (arg0 < Class92.anInt1433) {
	    int i_29_ = Class92.anInt1433 - arg0;
	    i_25_ -= i_29_;
	    arg0 = Class92.anInt1433;
	    i_23_ += i_29_;
	    i += i_29_;
	    i_27_ += i_29_;
	    i_26_ += i_29_;
	}
	if (arg0 + i_25_ > Class92.anInt1434) {
	    int i_30_ = arg0 + i_25_ - Class92.anInt1434;
	    i_25_ -= i_30_;
	    i_27_ += i_30_;
	    i_26_ += i_30_;
	}
	if (i_25_ > 0 && i_24_ > 0)
	    method416(Class92.anIntArray1437, anIntArray5088, i_23_, i, i_25_,
		      i_24_, i_26_, i_27_);
    }
    
    public static void method416(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7) {
	for (int i = -arg5; i < 0; i++) {
	    int i_31_ = arg3 + arg4;
	    while (arg3 < i_31_) {
		int i_32_ = arg1[arg2] >>> 24;
		int i_33_ = 256 - i_32_;
		int i_34_ = arg1[arg2++];
		int i_35_ = arg0[arg3];
		arg0[arg3++]
		    = (((i_34_ & 0xff00ff) * i_32_ + (i_35_ & 0xff00ff) * i_33_
			& ~0xff00ff)
		       + ((i_34_ & 0xff00) * i_32_ + (i_35_ & 0xff00) * i_33_
			  & 0xff0000)) >> 8;
	    }
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public static void method417(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8) {
	int i = -arg5;
	for (int i_36_ = -arg6; i_36_ < 0; i_36_++) {
	    for (int i_37_ = i; i_37_ < 0; i_37_++) {
		int i_38_ = arg1[arg3] >>> 24;
		int i_39_ = 256 - i_38_;
		int i_40_ = arg1[arg3++];
		int i_41_ = arg0[arg4];
		arg0[arg4++]
		    = (((i_40_ & 0xff00ff) * i_38_ + (i_41_ & 0xff00ff) * i_39_
			& ~0xff00ff)
		       + ((i_40_ & 0xff00) * i_38_ + (i_41_ & 0xff00) * i_39_
			  & 0xff0000)) >> 8;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public Class14_Sub2_Sub19_Sub1_Sub1(int arg0, int arg1, int arg2, int arg3,
					int arg4, int arg5, int[] arg6) {
	super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }
    
    public void method395(int arg0, int arg1, int arg2, int arg3, int arg4,
			  int arg5) {
	if (arg5 != 0) {
	    arg0 -= anInt4033 << 4;
	    arg1 -= anInt4050 << 4;
	    double d = (double) (arg4 & 0xffff) * 9.587379924285257E-5;
	    int i = (int) Math.floor(Math.sin(d) * (double) arg5 + 0.5);
	    int i_42_ = (int) Math.floor(Math.cos(d) * (double) arg5 + 0.5);
	    int i_43_ = -arg0 * i_42_ + -arg1 * i;
	    int i_44_ = --arg0 * i + -arg1 * i_42_;
	    int i_45_ = ((anInt4035 << 4) - arg0) * i_42_ + -arg1 * i;
	    int i_46_ = -((anInt4035 << 4) - arg0) * i + -arg1 * i_42_;
	    int i_47_ = -arg0 * i_42_ + ((anInt4042 << 4) - arg1) * i;
	    int i_48_ = --arg0 * i + ((anInt4042 << 4) - arg1) * i_42_;
	    int i_49_ = (((anInt4035 << 4) - arg0) * i_42_
			 + ((anInt4042 << 4) - arg1) * i);
	    int i_50_ = (-((anInt4035 << 4) - arg0) * i
			 + ((anInt4042 << 4) - arg1) * i_42_);
	    int i_51_;
	    int i_52_;
	    if (i_43_ < i_45_) {
		i_51_ = i_43_;
		i_52_ = i_45_;
	    } else {
		i_51_ = i_45_;
		i_52_ = i_43_;
	    }
	    if (i_47_ < i_51_)
		i_51_ = i_47_;
	    if (i_49_ < i_51_)
		i_51_ = i_49_;
	    if (i_47_ > i_52_)
		i_52_ = i_47_;
	    if (i_49_ > i_52_)
		i_52_ = i_49_;
	    int i_53_;
	    int i_54_;
	    if (i_44_ < i_46_) {
		i_53_ = i_44_;
		i_54_ = i_46_;
	    } else {
		i_53_ = i_46_;
		i_54_ = i_44_;
	    }
	    if (i_48_ < i_53_)
		i_53_ = i_48_;
	    if (i_50_ < i_53_)
		i_53_ = i_50_;
	    if (i_48_ > i_54_)
		i_54_ = i_48_;
	    if (i_50_ > i_54_)
		i_54_ = i_50_;
	    i_51_ >>= 12;
	    i_52_ = i_52_ + 4095 >> 12;
	    i_53_ >>= 12;
	    i_54_ = i_54_ + 4095 >> 12;
	    i_51_ += arg2;
	    i_52_ += arg2;
	    i_53_ += arg3;
	    i_54_ += arg3;
	    i_51_ >>= 4;
	    i_52_ = i_52_ + 15 >> 4;
	    i_53_ >>= 4;
	    i_54_ = i_54_ + 15 >> 4;
	    if (i_51_ < Class92.anInt1433)
		i_51_ = Class92.anInt1433;
	    if (i_52_ > Class92.anInt1434)
		i_52_ = Class92.anInt1434;
	    if (i_53_ < Class92.anInt1438)
		i_53_ = Class92.anInt1438;
	    if (i_54_ > Class92.anInt1436)
		i_54_ = Class92.anInt1436;
	    i_52_ = i_51_ - i_52_;
	    if (i_52_ < 0) {
		i_54_ = i_53_ - i_54_;
		if (i_54_ < 0) {
		    int i_55_ = i_53_ * Class92.anInt1432 + i_51_;
		    double d_56_ = 1.6777216E7 / (double) arg5;
		    int i_57_ = (int) Math.floor(Math.sin(d) * d_56_ + 0.5);
		    int i_58_ = (int) Math.floor(Math.cos(d) * d_56_ + 0.5);
		    int i_59_ = (i_51_ << 4) + 8 - arg2;
		    int i_60_ = (i_53_ << 4) + 8 - arg3;
		    int i_61_ = (arg0 << 8) - (i_60_ * i_57_ >> 4);
		    int i_62_ = (arg1 << 8) + (i_60_ * i_58_ >> 4);
		    if (i_58_ == 0) {
			if (i_57_ == 0) {
			    int i_63_ = i_54_;
			    while (i_63_ < 0) {
				int i_64_ = i_55_;
				int i_65_ = i_61_;
				int i_66_ = i_62_;
				int i_67_ = i_52_;
				if (i_65_ >= 0 && i_66_ >= 0
				    && i_65_ - (anInt4035 << 12) < 0
				    && i_66_ - (anInt4042 << 12) < 0) {
				    for (/**/; i_67_ < 0; i_67_++) {
					int i_68_
					    = (anIntArray5088
					       [((i_66_ >> 12) * anInt4035
						 + (i_65_ >> 12))]);
					int i_69_
					    = Class92.anIntArray1437[i_64_];
					int i_70_ = i_68_ >>> 24;
					int i_71_ = 256 - i_70_;
					Class92.anIntArray1437[i_64_++]
					    = ((((i_68_ & 0xff00ff) * i_70_
						 + (i_69_ & 0xff00ff) * i_71_)
						& ~0xff00ff)
					       + (((i_68_ & 0xff00) * i_70_
						   + (i_69_ & 0xff00) * i_71_)
						  & 0xff0000)) >> 8;
				    }
				}
				i_63_++;
				i_55_ += Class92.anInt1432;
			    }
			} else if (i_57_ < 0) {
			    int i_72_ = i_54_;
			    while (i_72_ < 0) {
				int i_73_ = i_55_;
				int i_74_ = i_61_;
				int i_75_ = i_62_ + (i_59_ * i_57_ >> 4);
				int i_76_ = i_52_;
				if (i_74_ >= 0
				    && i_74_ - (anInt4035 << 12) < 0) {
				    int i_77_;
				    if ((i_77_ = i_75_ - (anInt4042 << 12))
					>= 0) {
					i_77_ = (i_57_ - i_77_) / i_57_;
					i_76_ += i_77_;
					i_75_ += i_57_ * i_77_;
					i_73_ += i_77_;
				    }
				    if ((i_77_ = (i_75_ - i_57_) / i_57_)
					> i_76_)
					i_76_ = i_77_;
				    for (/**/; i_76_ < 0; i_76_++) {
					int i_78_
					    = (anIntArray5088
					       [((i_75_ >> 12) * anInt4035
						 + (i_74_ >> 12))]);
					int i_79_
					    = Class92.anIntArray1437[i_73_];
					int i_80_ = i_78_ >>> 24;
					int i_81_ = 256 - i_80_;
					Class92.anIntArray1437[i_73_++]
					    = ((((i_78_ & 0xff00ff) * i_80_
						 + (i_79_ & 0xff00ff) * i_81_)
						& ~0xff00ff)
					       + (((i_78_ & 0xff00) * i_80_
						   + (i_79_ & 0xff00) * i_81_)
						  & 0xff0000)) >> 8;
					i_75_ += i_57_;
				    }
				}
				i_72_++;
				i_61_ -= i_57_;
				i_55_ += Class92.anInt1432;
			    }
			} else {
			    int i_82_ = i_54_;
			    while (i_82_ < 0) {
				int i_83_ = i_55_;
				int i_84_ = i_61_;
				int i_85_ = i_62_ + (i_59_ * i_57_ >> 4);
				int i_86_ = i_52_;
				if (i_84_ >= 0
				    && i_84_ - (anInt4035 << 12) < 0) {
				    if (i_85_ < 0) {
					int i_87_
					    = (i_57_ - 1 - i_85_) / i_57_;
					i_86_ += i_87_;
					i_85_ += i_57_ * i_87_;
					i_83_ += i_87_;
				    }
				    int i_88_;
				    if ((i_88_ = (1 + i_85_ - (anInt4042 << 12)
						  - i_57_) / i_57_)
					> i_86_)
					i_86_ = i_88_;
				    for (/**/; i_86_ < 0; i_86_++) {
					int i_89_
					    = (anIntArray5088
					       [((i_85_ >> 12) * anInt4035
						 + (i_84_ >> 12))]);
					int i_90_
					    = Class92.anIntArray1437[i_83_];
					int i_91_ = i_89_ >>> 24;
					int i_92_ = 256 - i_91_;
					Class92.anIntArray1437[i_83_++]
					    = ((((i_89_ & 0xff00ff) * i_91_
						 + (i_90_ & 0xff00ff) * i_92_)
						& ~0xff00ff)
					       + (((i_89_ & 0xff00) * i_91_
						   + (i_90_ & 0xff00) * i_92_)
						  & 0xff0000)) >> 8;
					i_85_ += i_57_;
				    }
				}
				i_82_++;
				i_61_ -= i_57_;
				i_55_ += Class92.anInt1432;
			    }
			}
		    } else if (i_58_ < 0) {
			if (i_57_ == 0) {
			    int i_93_ = i_54_;
			    while (i_93_ < 0) {
				int i_94_ = i_55_;
				int i_95_ = i_61_ + (i_59_ * i_58_ >> 4);
				int i_96_ = i_62_;
				int i_97_ = i_52_;
				if (i_96_ >= 0
				    && i_96_ - (anInt4042 << 12) < 0) {
				    int i_98_;
				    if ((i_98_ = i_95_ - (anInt4035 << 12))
					>= 0) {
					i_98_ = (i_58_ - i_98_) / i_58_;
					i_97_ += i_98_;
					i_95_ += i_58_ * i_98_;
					i_94_ += i_98_;
				    }
				    if ((i_98_ = (i_95_ - i_58_) / i_58_)
					> i_97_)
					i_97_ = i_98_;
				    for (/**/; i_97_ < 0; i_97_++) {
					int i_99_
					    = (anIntArray5088
					       [((i_96_ >> 12) * anInt4035
						 + (i_95_ >> 12))]);
					int i_100_
					    = Class92.anIntArray1437[i_94_];
					int i_101_ = i_99_ >>> 24;
					int i_102_ = 256 - i_101_;
					Class92.anIntArray1437[i_94_++]
					    = ((((i_99_ & 0xff00ff) * i_101_
						 + ((i_100_ & 0xff00ff)
						    * i_102_))
						& ~0xff00ff)
					       + (((i_99_ & 0xff00) * i_101_
						   + ((i_100_ & 0xff00)
						      * i_102_))
						  & 0xff0000)) >> 8;
					i_95_ += i_58_;
				    }
				}
				i_93_++;
				i_62_ += i_58_;
				i_55_ += Class92.anInt1432;
			    }
			} else if (i_57_ < 0) {
			    int i_103_ = i_54_;
			    while (i_103_ < 0) {
				int i_104_ = i_55_;
				int i_105_ = i_61_ + (i_59_ * i_58_ >> 4);
				int i_106_ = i_62_ + (i_59_ * i_57_ >> 4);
				int i_107_ = i_52_;
				int i_108_;
				if ((i_108_ = i_105_ - (anInt4035 << 12))
				    >= 0) {
				    i_108_ = (i_58_ - i_108_) / i_58_;
				    i_107_ += i_108_;
				    i_105_ += i_58_ * i_108_;
				    i_106_ += i_57_ * i_108_;
				    i_104_ += i_108_;
				}
				if ((i_108_ = (i_105_ - i_58_) / i_58_)
				    > i_107_)
				    i_107_ = i_108_;
				if ((i_108_ = i_106_ - (anInt4042 << 12))
				    >= 0) {
				    i_108_ = (i_57_ - i_108_) / i_57_;
				    i_107_ += i_108_;
				    i_105_ += i_58_ * i_108_;
				    i_106_ += i_57_ * i_108_;
				    i_104_ += i_108_;
				}
				if ((i_108_ = (i_106_ - i_57_) / i_57_)
				    > i_107_)
				    i_107_ = i_108_;
				for (/**/; i_107_ < 0; i_107_++) {
				    int i_109_ = (anIntArray5088
						  [((i_106_ >> 12) * anInt4035
						    + (i_105_ >> 12))]);
				    int i_110_
					= Class92.anIntArray1437[i_104_];
				    int i_111_ = i_109_ >>> 24;
				    int i_112_ = 256 - i_111_;
				    Class92.anIntArray1437[i_104_++]
					= ((((i_109_ & 0xff00ff) * i_111_
					     + (i_110_ & 0xff00ff) * i_112_)
					    & ~0xff00ff)
					   + (((i_109_ & 0xff00) * i_111_
					       + (i_110_ & 0xff00) * i_112_)
					      & 0xff0000)) >> 8;
				    i_105_ += i_58_;
				    i_106_ += i_57_;
				}
				i_103_++;
				i_61_ -= i_57_;
				i_62_ += i_58_;
				i_55_ += Class92.anInt1432;
			    }
			} else {
			    int i_113_ = i_54_;
			    while (i_113_ < 0) {
				int i_114_ = i_55_;
				int i_115_ = i_61_ + (i_59_ * i_58_ >> 4);
				int i_116_ = i_62_ + (i_59_ * i_57_ >> 4);
				int i_117_ = i_52_;
				int i_118_;
				if ((i_118_ = i_115_ - (anInt4035 << 12))
				    >= 0) {
				    i_118_ = (i_58_ - i_118_) / i_58_;
				    i_117_ += i_118_;
				    i_115_ += i_58_ * i_118_;
				    i_116_ += i_57_ * i_118_;
				    i_114_ += i_118_;
				}
				if ((i_118_ = (i_115_ - i_58_) / i_58_)
				    > i_117_)
				    i_117_ = i_118_;
				if (i_116_ < 0) {
				    i_118_ = (i_57_ - 1 - i_116_) / i_57_;
				    i_117_ += i_118_;
				    i_115_ += i_58_ * i_118_;
				    i_116_ += i_57_ * i_118_;
				    i_114_ += i_118_;
				}
				if ((i_118_ = (1 + i_116_ - (anInt4042 << 12)
					       - i_57_) / i_57_)
				    > i_117_)
				    i_117_ = i_118_;
				for (/**/; i_117_ < 0; i_117_++) {
				    int i_119_ = (anIntArray5088
						  [((i_116_ >> 12) * anInt4035
						    + (i_115_ >> 12))]);
				    int i_120_
					= Class92.anIntArray1437[i_114_];
				    int i_121_ = i_119_ >>> 24;
				    int i_122_ = 256 - i_121_;
				    Class92.anIntArray1437[i_114_++]
					= ((((i_119_ & 0xff00ff) * i_121_
					     + (i_120_ & 0xff00ff) * i_122_)
					    & ~0xff00ff)
					   + (((i_119_ & 0xff00) * i_121_
					       + (i_120_ & 0xff00) * i_122_)
					      & 0xff0000)) >> 8;
				    i_115_ += i_58_;
				    i_116_ += i_57_;
				}
				i_113_++;
				i_61_ -= i_57_;
				i_62_ += i_58_;
				i_55_ += Class92.anInt1432;
			    }
			}
		    } else if (i_57_ == 0) {
			int i_123_ = i_54_;
			while (i_123_ < 0) {
			    int i_124_ = i_55_;
			    int i_125_ = i_61_ + (i_59_ * i_58_ >> 4);
			    int i_126_ = i_62_;
			    int i_127_ = i_52_;
			    if (i_126_ >= 0
				&& i_126_ - (anInt4042 << 12) < 0) {
				if (i_125_ < 0) {
				    int i_128_ = (i_58_ - 1 - i_125_) / i_58_;
				    i_127_ += i_128_;
				    i_125_ += i_58_ * i_128_;
				    i_124_ += i_128_;
				}
				int i_129_;
				if ((i_129_ = (1 + i_125_ - (anInt4035 << 12)
					       - i_58_) / i_58_)
				    > i_127_)
				    i_127_ = i_129_;
				for (/**/; i_127_ < 0; i_127_++) {
				    int i_130_ = (anIntArray5088
						  [((i_126_ >> 12) * anInt4035
						    + (i_125_ >> 12))]);
				    int i_131_
					= Class92.anIntArray1437[i_124_];
				    int i_132_ = i_130_ >>> 24;
				    int i_133_ = 256 - i_132_;
				    Class92.anIntArray1437[i_124_++]
					= ((((i_130_ & 0xff00ff) * i_132_
					     + (i_131_ & 0xff00ff) * i_133_)
					    & ~0xff00ff)
					   + (((i_130_ & 0xff00) * i_132_
					       + (i_131_ & 0xff00) * i_133_)
					      & 0xff0000)) >> 8;
				    i_125_ += i_58_;
				}
			    }
			    i_123_++;
			    i_62_ += i_58_;
			    i_55_ += Class92.anInt1432;
			}
		    } else if (i_57_ < 0) {
			int i_134_ = i_54_;
			while (i_134_ < 0) {
			    int i_135_ = i_55_;
			    int i_136_ = i_61_ + (i_59_ * i_58_ >> 4);
			    int i_137_ = i_62_ + (i_59_ * i_57_ >> 4);
			    int i_138_ = i_52_;
			    if (i_136_ < 0) {
				int i_139_ = (i_58_ - 1 - i_136_) / i_58_;
				i_138_ += i_139_;
				i_136_ += i_58_ * i_139_;
				i_137_ += i_57_ * i_139_;
				i_135_ += i_139_;
			    }
			    int i_140_;
			    if ((i_140_ = (1 + i_136_ - (anInt4035 << 12)
					   - i_58_) / i_58_)
				> i_138_)
				i_138_ = i_140_;
			    if ((i_140_ = i_137_ - (anInt4042 << 12)) >= 0) {
				i_140_ = (i_57_ - i_140_) / i_57_;
				i_138_ += i_140_;
				i_136_ += i_58_ * i_140_;
				i_137_ += i_57_ * i_140_;
				i_135_ += i_140_;
			    }
			    if ((i_140_ = (i_137_ - i_57_) / i_57_) > i_138_)
				i_138_ = i_140_;
			    for (/**/; i_138_ < 0; i_138_++) {
				int i_141_
				    = (anIntArray5088
				       [(i_137_ >> 12) * anInt4035 + (i_136_
								      >> 12)]);
				int i_142_ = Class92.anIntArray1437[i_135_];
				int i_143_ = i_141_ >>> 24;
				int i_144_ = 256 - i_143_;
				Class92.anIntArray1437[i_135_++]
				    = ((((i_141_ & 0xff00ff) * i_143_
					 + (i_142_ & 0xff00ff) * i_144_)
					& ~0xff00ff)
				       + (((i_141_ & 0xff00) * i_143_
					   + (i_142_ & 0xff00) * i_144_)
					  & 0xff0000)) >> 8;
				i_136_ += i_58_;
				i_137_ += i_57_;
			    }
			    i_134_++;
			    i_61_ -= i_57_;
			    i_62_ += i_58_;
			    i_55_ += Class92.anInt1432;
			}
		    } else {
			int i_145_ = i_54_;
			while (i_145_ < 0) {
			    int i_146_ = i_55_;
			    int i_147_ = i_61_ + (i_59_ * i_58_ >> 4);
			    int i_148_ = i_62_ + (i_59_ * i_57_ >> 4);
			    int i_149_ = i_52_;
			    if (i_147_ < 0) {
				int i_150_ = (i_58_ - 1 - i_147_) / i_58_;
				i_149_ += i_150_;
				i_147_ += i_58_ * i_150_;
				i_148_ += i_57_ * i_150_;
				i_146_ += i_150_;
			    }
			    int i_151_;
			    if ((i_151_ = (1 + i_147_ - (anInt4035 << 12)
					   - i_58_) / i_58_)
				> i_149_)
				i_149_ = i_151_;
			    if (i_148_ < 0) {
				i_151_ = (i_57_ - 1 - i_148_) / i_57_;
				i_149_ += i_151_;
				i_147_ += i_58_ * i_151_;
				i_148_ += i_57_ * i_151_;
				i_146_ += i_151_;
			    }
			    if ((i_151_ = (1 + i_148_ - (anInt4042 << 12)
					   - i_57_) / i_57_)
				> i_149_)
				i_149_ = i_151_;
			    for (/**/; i_149_ < 0; i_149_++) {
				int i_152_
				    = (anIntArray5088
				       [(i_148_ >> 12) * anInt4035 + (i_147_
								      >> 12)]);
				int i_153_ = Class92.anIntArray1437[i_146_];
				int i_154_ = i_152_ >>> 24;
				int i_155_ = 256 - i_154_;
				Class92.anIntArray1437[i_146_++]
				    = ((((i_152_ & 0xff00ff) * i_154_
					 + (i_153_ & 0xff00ff) * i_155_)
					& ~0xff00ff)
				       + (((i_152_ & 0xff00) * i_154_
					   + (i_153_ & 0xff00) * i_155_)
					  & 0xff0000)) >> 8;
				i_147_ += i_58_;
				i_148_ += i_57_;
			    }
			    i_145_++;
			    i_61_ -= i_57_;
			    i_62_ += i_58_;
			    i_55_ += Class92.anInt1432;
			}
		    }
		}
	    }
	}
    }
    
    public static void method418(int[] arg0, int[] arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9) {
	for (int i = -arg6; i < 0; i++) {
	    for (int i_156_ = -arg5; i_156_ < 0; i_156_++) {
		int i_157_ = (arg1[arg3] >>> 24) - (255 - arg9);
		if (i_157_ < 0)
		    i_157_ = 0;
		int i_158_ = 256 - i_157_;
		int i_159_ = arg1[arg3++];
		int i_160_ = arg0[arg4];
		arg0[arg4++] = ((((i_159_ & 0xff00ff) * i_157_
				  + (i_160_ & 0xff00ff) * i_158_)
				 & ~0xff00ff)
				+ (((i_159_ & 0xff00) * i_157_
				    + (i_160_ & 0xff00) * i_158_)
				   & 0xff0000)) >> 8;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method396(int arg0, int arg1, int arg2, int arg3, int arg4) {
	if (arg2 > 0 && arg3 > 0) {
	    int i = anInt4035;
	    int i_161_ = anInt4042;
	    int i_162_ = 0;
	    int i_163_ = 0;
	    int i_164_ = anInt4034;
	    int i_165_ = anInt4046;
	    int i_166_ = (i_164_ << 16) / arg2;
	    int i_167_ = (i_165_ << 16) / arg3;
	    if (anInt4033 > 0) {
		int i_168_ = ((anInt4033 << 16) + i_166_ - 1) / i_166_;
		arg0 += i_168_;
		i_162_ += i_168_ * i_166_ - (anInt4033 << 16);
	    }
	    if (anInt4050 > 0) {
		int i_169_ = ((anInt4050 << 16) + i_167_ - 1) / i_167_;
		arg1 += i_169_;
		i_163_ += i_169_ * i_167_ - (anInt4050 << 16);
	    }
	    if (i < i_164_)
		arg2 = ((i << 16) - i_162_ + i_166_ - 1) / i_166_;
	    if (i_161_ < i_165_)
		arg3 = ((i_161_ << 16) - i_163_ + i_167_ - 1) / i_167_;
	    int i_170_ = arg0 + arg1 * Class92.anInt1432;
	    int i_171_ = Class92.anInt1432 - arg2;
	    if (arg1 + arg3 > Class92.anInt1436)
		arg3 -= arg1 + arg3 - Class92.anInt1436;
	    if (arg1 < Class92.anInt1438) {
		int i_172_ = Class92.anInt1438 - arg1;
		arg3 -= i_172_;
		i_170_ += i_172_ * Class92.anInt1432;
		i_163_ += i_167_ * i_172_;
	    }
	    if (arg0 + arg2 > Class92.anInt1434) {
		int i_173_ = arg0 + arg2 - Class92.anInt1434;
		arg2 -= i_173_;
		i_171_ += i_173_;
	    }
	    if (arg0 < Class92.anInt1433) {
		int i_174_ = Class92.anInt1433 - arg0;
		arg2 -= i_174_;
		i_170_ += i_174_;
		i_162_ += i_166_ * i_174_;
		i_171_ += i_174_;
	    }
	    method415(Class92.anIntArray1437, anIntArray5088, 0, i_162_,
		      i_163_, i_170_, i_171_, arg2, arg3, i_166_, i_167_, i,
		      arg4);
	}
    }
}
