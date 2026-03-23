/* Class133_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub2 extends Class133
{
    public short aShort3506;
    public int[] anIntArray3507;
    public static int[] anIntArray3508;
    public int[][] anIntArrayArray3509;
    public int[] anIntArray3510;
    public short[] aShortArray3511;
    public short[] aShortArray3512;
    public int[] anIntArray3513;
    public byte[] aByteArray3514;
    public Class89[] aClass89Array3515;
    public byte[] aByteArray3516;
    public short aShort3517;
    public byte[] aByteArray3518;
    public static int[] anIntArray3519 = new int[10000];
    public short[] aShortArray3520;
    public int anInt3521 = 0;
    public short[] aShortArray3522;
    public static int[] anIntArray3523;
    public short aShort3524;
    public short aShort3525;
    public int[] anIntArray3526;
    public short[] aShortArray3527;
    public short[] aShortArray3528;
    public byte[] aByteArray3529;
    public int[] anIntArray3530;
    public short[] aShortArray3531;
    public int[] anIntArray3532;
    public short[] aShortArray3533;
    public byte[] aByteArray3534;
    public byte[] aByteArray3535;
    public Class138[] aClass138Array3536;
    public static int anInt3537;
    public short aShort3538;
    public short aShort3539;
    public int[] anIntArray3540;
    public byte[] aByteArray3541;
    public byte aByte3542;
    public boolean aBoolean3543 = false;
    public int anInt3544;
    public int[][] anIntArrayArray3545;
    public byte[] aByteArray3546;
    public int anInt3547;
    public byte[] aByteArray3548;
    public int[] anIntArray3549;
    public short aShort3550;
    public static int[] anIntArray3551;
    public Class89[] aClass89Array3552;
    public short aShort3553;
    public byte[] aByteArray3554;
    
    public void method1812() {
	if (!aBoolean3543) {
	    aBoolean3543 = true;
	    int i = 32767;
	    int i_0_ = 32767;
	    int i_1_ = 32767;
	    int i_2_ = -32768;
	    int i_3_ = -32768;
	    int i_4_ = -32768;
	    for (int i_5_ = 0; i_5_ < anInt3521; i_5_++) {
		int i_6_ = anIntArray3530[i_5_];
		int i_7_ = anIntArray3526[i_5_];
		int i_8_ = anIntArray3510[i_5_];
		if (i_6_ < i)
		    i = i_6_;
		if (i_6_ > i_2_)
		    i_2_ = i_6_;
		if (i_7_ < i_0_)
		    i_0_ = i_7_;
		if (i_7_ > i_3_)
		    i_3_ = i_7_;
		if (i_8_ < i_1_)
		    i_1_ = i_8_;
		if (i_8_ > i_4_)
		    i_4_ = i_8_;
	    }
	    aShort3524 = (short) i;
	    aShort3538 = (short) i_2_;
	    aShort3506 = (short) i_0_;
	    aShort3550 = (short) i_3_;
	    aShort3517 = (short) i_1_;
	    aShort3553 = (short) i_4_;
	}
    }
    
    public void method1813(short arg0, short arg1) {
	for (int i = 0; i < anInt3547; i++) {
	    if (aShortArray3533[i] == arg0)
		aShortArray3533[i] = arg1;
	}
    }
    
    public int method1814(Class133_Sub2 arg0, int arg1) {
	int i = -1;
	int i_9_ = arg0.anIntArray3530[arg1];
	int i_10_ = arg0.anIntArray3526[arg1];
	int i_11_ = arg0.anIntArray3510[arg1];
	for (int i_12_ = 0; i_12_ < anInt3521; i_12_++) {
	    if (i_9_ == anIntArray3530[i_12_] && i_10_ == anIntArray3526[i_12_]
		&& i_11_ == anIntArray3510[i_12_]) {
		i = i_12_;
		break;
	    }
	}
	if (i == -1) {
	    anIntArray3530[anInt3521] = i_9_;
	    anIntArray3526[anInt3521] = i_10_;
	    anIntArray3510[anInt3521] = i_11_;
	    if (arg0.anIntArray3513 != null)
		anIntArray3513[anInt3521] = arg0.anIntArray3513[arg1];
	    i = anInt3521++;
	}
	return i;
    }
    
    public void method1815(byte[] arg0) {
	boolean bool = false;
	boolean bool_13_ = false;
	Class14_Sub10 class14_sub10 = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_14_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_15_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_16_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_17_ = new Class14_Sub10(arg0);
	class14_sub10.anInt2908 = arg0.length - 18;
	int i = class14_sub10.method784((byte) 125);
	int i_18_ = class14_sub10.method784((byte) 125);
	int i_19_ = class14_sub10.method798(-126);
	int i_20_ = class14_sub10.method798(72);
	int i_21_ = class14_sub10.method798(84);
	int i_22_ = class14_sub10.method798(-44);
	int i_23_ = class14_sub10.method798(65);
	int i_24_ = class14_sub10.method798(104);
	int i_25_ = class14_sub10.method784((byte) 110);
	int i_26_ = class14_sub10.method784((byte) 109);
	int i_27_ = class14_sub10.method784((byte) 126);
	int i_28_ = class14_sub10.method784((byte) 107);
	int i_29_ = 0;
	int i_30_ = i_29_;
	i_29_ += i;
	int i_31_ = i_29_;
	i_29_ += i_18_;
	int i_32_ = i_29_;
	if (i_21_ == 255)
	    i_29_ += i_18_;
	int i_33_ = i_29_;
	if (i_23_ == 1)
	    i_29_ += i_18_;
	int i_34_ = i_29_;
	if (i_20_ == 1)
	    i_29_ += i_18_;
	int i_35_ = i_29_;
	if (i_24_ == 1)
	    i_29_ += i;
	int i_36_ = i_29_;
	if (i_22_ == 1)
	    i_29_ += i_18_;
	int i_37_ = i_29_;
	i_29_ += i_28_;
	int i_38_ = i_29_;
	i_29_ += i_18_ * 2;
	int i_39_ = i_29_;
	i_29_ += i_19_ * 6;
	int i_40_ = i_29_;
	i_29_ += i_25_;
	int i_41_ = i_29_;
	i_29_ += i_26_;
	int i_42_ = i_29_;
	i_29_ += i_27_;
	anInt3521 = i;
	anInt3547 = i_18_;
	anInt3544 = i_19_;
	anIntArray3530 = new int[i];
	anIntArray3526 = new int[i];
	anIntArray3510 = new int[i];
	anIntArray3549 = new int[i_18_];
	anIntArray3507 = new int[i_18_];
	anIntArray3540 = new int[i_18_];
	if (i_19_ > 0) {
	    aByteArray3514 = new byte[i_19_];
	    aShortArray3520 = new short[i_19_];
	    aShortArray3531 = new short[i_19_];
	    aShortArray3511 = new short[i_19_];
	}
	if (i_24_ == 1)
	    anIntArray3513 = new int[i];
	if (i_20_ == 1) {
	    aByteArray3534 = new byte[i_18_];
	    aByteArray3535 = new byte[i_18_];
	    aShortArray3528 = new short[i_18_];
	}
	if (i_21_ == 255)
	    aByteArray3546 = new byte[i_18_];
	else
	    aByte3542 = (byte) i_21_;
	if (i_22_ == 1)
	    aByteArray3541 = new byte[i_18_];
	if (i_23_ == 1)
	    anIntArray3532 = new int[i_18_];
	aShortArray3533 = new short[i_18_];
	class14_sub10.anInt2908 = i_30_;
	class14_sub10_14_.anInt2908 = i_40_;
	class14_sub10_15_.anInt2908 = i_41_;
	class14_sub10_16_.anInt2908 = i_42_;
	class14_sub10_17_.anInt2908 = i_35_;
	int i_43_ = 0;
	int i_44_ = 0;
	int i_45_ = 0;
	for (int i_46_ = 0; i_46_ < i; i_46_++) {
	    int i_47_ = class14_sub10.method798(-53);
	    int i_48_ = 0;
	    if ((i_47_ & 0x1) != 0)
		i_48_ = class14_sub10_14_.method793(-879985848);
	    int i_49_ = 0;
	    if ((i_47_ & 0x2) != 0)
		i_49_ = class14_sub10_15_.method793(-879985848);
	    int i_50_ = 0;
	    if ((i_47_ & 0x4) != 0)
		i_50_ = class14_sub10_16_.method793(-879985848);
	    anIntArray3530[i_46_] = i_43_ + i_48_;
	    anIntArray3526[i_46_] = i_44_ + i_49_;
	    anIntArray3510[i_46_] = i_45_ + i_50_;
	    i_43_ = anIntArray3530[i_46_];
	    i_44_ = anIntArray3526[i_46_];
	    i_45_ = anIntArray3510[i_46_];
	    if (i_24_ == 1)
		anIntArray3513[i_46_] = class14_sub10_17_.method798(115);
	}
	class14_sub10.anInt2908 = i_38_;
	class14_sub10_14_.anInt2908 = i_34_;
	class14_sub10_15_.anInt2908 = i_32_;
	class14_sub10_16_.anInt2908 = i_36_;
	class14_sub10_17_.anInt2908 = i_33_;
	for (int i_51_ = 0; i_51_ < i_18_; i_51_++) {
	    aShortArray3533[i_51_]
		= (short) class14_sub10.method784((byte) 113);
	    if (i_20_ == 1) {
		int i_52_ = class14_sub10_14_.method798(111);
		if ((i_52_ & 0x1) == 1) {
		    aByteArray3534[i_51_] = (byte) 1;
		    bool = true;
		} else
		    aByteArray3534[i_51_] = (byte) 0;
		if ((i_52_ & 0x2) == 2) {
		    aByteArray3535[i_51_] = (byte) (i_52_ >> 2);
		    aShortArray3528[i_51_] = aShortArray3533[i_51_];
		    aShortArray3533[i_51_] = (short) 127;
		    if (aShortArray3528[i_51_] != -1)
			bool_13_ = true;
		} else {
		    aByteArray3535[i_51_] = (byte) -1;
		    aShortArray3528[i_51_] = (short) -1;
		}
	    }
	    if (i_21_ == 255)
		aByteArray3546[i_51_]
		    = class14_sub10_15_.method780((byte) -77);
	    if (i_22_ == 1)
		aByteArray3541[i_51_]
		    = class14_sub10_16_.method780((byte) -77);
	    if (i_23_ == 1)
		anIntArray3532[i_51_] = class14_sub10_17_.method798(90);
	}
	class14_sub10.anInt2908 = i_37_;
	class14_sub10_14_.anInt2908 = i_31_;
	int i_53_ = 0;
	int i_54_ = 0;
	int i_55_ = 0;
	int i_56_ = 0;
	for (int i_57_ = 0; i_57_ < i_18_; i_57_++) {
	    int i_58_ = class14_sub10_14_.method798(123);
	    if (i_58_ == 1) {
		i_53_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_53_;
		i_54_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_54_;
		i_55_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_55_;
		anIntArray3549[i_57_] = i_53_;
		anIntArray3507[i_57_] = i_54_;
		anIntArray3540[i_57_] = i_55_;
	    }
	    if (i_58_ == 2) {
		i_54_ = i_55_;
		i_55_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_55_;
		anIntArray3549[i_57_] = i_53_;
		anIntArray3507[i_57_] = i_54_;
		anIntArray3540[i_57_] = i_55_;
	    }
	    if (i_58_ == 3) {
		i_53_ = i_55_;
		i_55_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_55_;
		anIntArray3549[i_57_] = i_53_;
		anIntArray3507[i_57_] = i_54_;
		anIntArray3540[i_57_] = i_55_;
	    }
	    if (i_58_ == 4) {
		int i_59_ = i_53_;
		i_53_ = i_54_;
		i_54_ = i_59_;
		i_55_ = class14_sub10.method793(-879985848) + i_56_;
		i_56_ = i_55_;
		anIntArray3549[i_57_] = i_53_;
		anIntArray3507[i_57_] = i_54_;
		anIntArray3540[i_57_] = i_55_;
	    }
	}
	class14_sub10.anInt2908 = i_39_;
	for (int i_60_ = 0; i_60_ < i_19_; i_60_++) {
	    aByteArray3514[i_60_] = (byte) 0;
	    aShortArray3520[i_60_]
		= (short) class14_sub10.method784((byte) 127);
	    aShortArray3531[i_60_]
		= (short) class14_sub10.method784((byte) 103);
	    aShortArray3511[i_60_]
		= (short) class14_sub10.method784((byte) 123);
	}
	if (aByteArray3535 != null) {
	    boolean bool_61_ = false;
	    for (int i_62_ = 0; i_62_ < i_18_; i_62_++) {
		int i_63_ = aByteArray3535[i_62_] & 0xff;
		if (i_63_ != 255) {
		    if (((aShortArray3520[i_63_] & 0xffff)
			 == anIntArray3549[i_62_])
			&& ((aShortArray3531[i_63_] & 0xffff)
			    == anIntArray3507[i_62_])
			&& ((aShortArray3511[i_63_] & 0xffff)
			    == anIntArray3540[i_62_]))
			aByteArray3535[i_62_] = (byte) -1;
		    else
			bool_61_ = true;
		}
	    }
	    if (!bool_61_)
		aByteArray3535 = null;
	}
	if (!bool_13_)
	    aShortArray3528 = null;
	if (!bool)
	    aByteArray3534 = null;
    }
    
    public void method1816() {
	aClass89Array3552 = null;
	aClass89Array3515 = null;
	aClass138Array3536 = null;
	aBoolean3543 = false;
    }
    
    public void method1817(int arg0, int arg1, int arg2) {
	if (arg2 != 0) {
	    int i = anIntArray3523[arg2];
	    int i_64_ = anIntArray3508[arg2];
	    for (int i_65_ = 0; i_65_ < anInt3521; i_65_++) {
		int i_66_ = ((anIntArray3526[i_65_] * i
			      + anIntArray3530[i_65_] * i_64_)
			     >> 16);
		anIntArray3526[i_65_] = (anIntArray3526[i_65_] * i_64_
					 - anIntArray3530[i_65_] * i) >> 16;
		anIntArray3530[i_65_] = i_66_;
	    }
	}
	if (arg0 != 0) {
	    int i = anIntArray3523[arg0];
	    int i_67_ = anIntArray3508[arg0];
	    for (int i_68_ = 0; i_68_ < anInt3521; i_68_++) {
		int i_69_ = ((anIntArray3526[i_68_] * i_67_
			      - anIntArray3510[i_68_] * i)
			     >> 16);
		anIntArray3510[i_68_]
		    = (anIntArray3526[i_68_] * i
		       + anIntArray3510[i_68_] * i_67_) >> 16;
		anIntArray3526[i_68_] = i_69_;
	    }
	}
	if (arg1 != 0) {
	    int i = anIntArray3523[arg1];
	    int i_70_ = anIntArray3508[arg1];
	    for (int i_71_ = 0; i_71_ < anInt3521; i_71_++) {
		int i_72_ = ((anIntArray3510[i_71_] * i
			      + anIntArray3530[i_71_] * i_70_)
			     >> 16);
		anIntArray3510[i_71_] = (anIntArray3510[i_71_] * i_70_
					 - anIntArray3530[i_71_] * i) >> 16;
		anIntArray3530[i_71_] = i_72_;
	    }
	}
    }
    
    public int method1818(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt3521; i++) {
	    if (anIntArray3530[i] == arg0 && anIntArray3526[i] == arg1
		&& anIntArray3510[i] == arg2)
		return i;
	}
	anIntArray3530[anInt3521] = arg0;
	anIntArray3526[anInt3521] = arg1;
	anIntArray3510[anInt3521] = arg2;
	return anInt3521++;
    }
    
    public void method1788(Class133 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	Class133_Sub2 class133_sub2 = (Class133_Sub2) arg0;
	class133_sub2.method1812();
	class133_sub2.method1826();
	anInt3537++;
	int i = 0;
	int[] is = class133_sub2.anIntArray3530;
	int i_73_ = class133_sub2.anInt3521;
	for (int i_74_ = 0; i_74_ < anInt3521; i_74_++) {
	    Class89 class89 = aClass89Array3552[i_74_];
	    if (class89.anInt1410 != 0) {
		int i_75_ = anIntArray3526[i_74_] - arg2;
		if (i_75_ >= class133_sub2.aShort3506
		    && i_75_ <= class133_sub2.aShort3550) {
		    int i_76_ = anIntArray3530[i_74_] - arg1;
		    if (i_76_ >= class133_sub2.aShort3524
			&& i_76_ <= class133_sub2.aShort3538) {
			int i_77_ = anIntArray3510[i_74_] - arg3;
			if (i_77_ >= class133_sub2.aShort3517
			    && i_77_ <= class133_sub2.aShort3553) {
			    for (int i_78_ = 0; i_78_ < i_73_; i_78_++) {
				Class89 class89_79_
				    = class133_sub2.aClass89Array3552[i_78_];
				if (i_76_ == is[i_78_]
				    && (i_77_
					== class133_sub2.anIntArray3510[i_78_])
				    && (i_75_
					== class133_sub2.anIntArray3526[i_78_])
				    && class89_79_.anInt1410 != 0) {
				    if (aClass89Array3515 == null)
					aClass89Array3515
					    = new Class89[anInt3521];
				    if (class133_sub2.aClass89Array3515
					== null)
					class133_sub2.aClass89Array3515
					    = new Class89[i_73_];
				    Class89 class89_80_
					= aClass89Array3515[i_74_];
				    if (class89_80_ == null)
					class89_80_
					    = aClass89Array3515[i_74_]
					    = new Class89(class89);
				    Class89 class89_81_
					= (class133_sub2.aClass89Array3515
					   [i_78_]);
				    if (class89_81_ == null)
					class89_81_
					    = class133_sub2
						  .aClass89Array3515[i_78_]
					    = new Class89(class89_79_);
				    class89_80_.anInt1414
					+= class89_79_.anInt1414;
				    class89_80_.anInt1404
					+= class89_79_.anInt1404;
				    class89_80_.anInt1406
					+= class89_79_.anInt1406;
				    class89_80_.anInt1410
					+= class89_79_.anInt1410;
				    class89_81_.anInt1414 += class89.anInt1414;
				    class89_81_.anInt1404 += class89.anInt1404;
				    class89_81_.anInt1406 += class89.anInt1406;
				    class89_81_.anInt1410 += class89.anInt1410;
				    i++;
				    anIntArray3519[i_74_] = anInt3537;
				    anIntArray3551[i_78_] = anInt3537;
				}
			    }
			}
		    }
		}
	    }
	}
	if (i >= 3 && arg4) {
	    for (int i_82_ = 0; i_82_ < anInt3547; i_82_++) {
		if (anIntArray3519[anIntArray3549[i_82_]] == anInt3537
		    && anIntArray3519[anIntArray3507[i_82_]] == anInt3537
		    && anIntArray3519[anIntArray3540[i_82_]] == anInt3537) {
		    if (aByteArray3534 == null)
			aByteArray3534 = new byte[anInt3547];
		    aByteArray3534[i_82_] = (byte) 2;
		}
	    }
	    for (int i_83_ = 0; i_83_ < class133_sub2.anInt3547; i_83_++) {
		if ((anIntArray3551[class133_sub2.anIntArray3549[i_83_]]
		     == anInt3537)
		    && (anIntArray3551[class133_sub2.anIntArray3507[i_83_]]
			== anInt3537)
		    && (anIntArray3551[class133_sub2.anIntArray3540[i_83_]]
			== anInt3537)) {
		    if (class133_sub2.aByteArray3534 == null)
			class133_sub2.aByteArray3534
			    = new byte[class133_sub2.anInt3547];
		    class133_sub2.aByteArray3534[i_83_] = (byte) 2;
		}
	    }
	}
    }
    
    public void method1819(short arg0, short arg1) {
	if (aShortArray3528 != null) {
	    for (int i = 0; i < anInt3547; i++) {
		if (aShortArray3528[i] == arg0)
		    aShortArray3528[i] = arg1;
	    }
	}
    }
    
    public boolean method1784() {
	return true;
    }
    
    public int method1820(int arg0, int arg1, int arg2, byte arg3, short arg4,
			  byte arg5) {
	anIntArray3549[anInt3547] = arg0;
	anIntArray3507[anInt3547] = arg1;
	anIntArray3540[anInt3547] = arg2;
	aByteArray3534[anInt3547] = arg3;
	aByteArray3535[anInt3547] = (byte) -1;
	aShortArray3533[anInt3547] = arg4;
	aShortArray3528[anInt3547] = (short) -1;
	aByteArray3541[anInt3547] = arg5;
	return anInt3547++;
    }
    
    public void method1821(byte[] arg0) {
	Class14_Sub10 class14_sub10 = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_84_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_85_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_86_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_87_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_88_ = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_89_ = new Class14_Sub10(arg0);
	class14_sub10.anInt2908 = arg0.length - 23;
	int i = class14_sub10.method784((byte) 120);
	int i_90_ = class14_sub10.method784((byte) 124);
	int i_91_ = class14_sub10.method798(-103);
	int i_92_ = class14_sub10.method798(83);
	int i_93_ = class14_sub10.method798(103);
	int i_94_ = class14_sub10.method798(-56);
	int i_95_ = class14_sub10.method798(88);
	int i_96_ = class14_sub10.method798(62);
	int i_97_ = class14_sub10.method798(74);
	int i_98_ = class14_sub10.method784((byte) 110);
	int i_99_ = class14_sub10.method784((byte) 116);
	int i_100_ = class14_sub10.method784((byte) 107);
	int i_101_ = class14_sub10.method784((byte) 115);
	int i_102_ = class14_sub10.method784((byte) 109);
	int i_103_ = 0;
	int i_104_ = 0;
	int i_105_ = 0;
	if (i_91_ > 0) {
	    aByteArray3514 = new byte[i_91_];
	    class14_sub10.anInt2908 = 0;
	    for (int i_106_ = 0; i_106_ < i_91_; i_106_++) {
		byte i_107_ = (aByteArray3514[i_106_]
			       = class14_sub10.method780((byte) -77));
		if (i_107_ == 0)
		    i_103_++;
		if (i_107_ >= 1 && i_107_ <= 3)
		    i_104_++;
		if (i_107_ == 2)
		    i_105_++;
	    }
	}
	int i_108_ = i_91_;
	int i_109_ = i_108_;
	i_108_ += i;
	int i_110_ = i_108_;
	if (i_92_ == 1)
	    i_108_ += i_90_;
	int i_111_ = i_108_;
	i_108_ += i_90_;
	int i_112_ = i_108_;
	if (i_93_ == 255)
	    i_108_ += i_90_;
	int i_113_ = i_108_;
	if (i_95_ == 1)
	    i_108_ += i_90_;
	int i_114_ = i_108_;
	if (i_97_ == 1)
	    i_108_ += i;
	int i_115_ = i_108_;
	if (i_94_ == 1)
	    i_108_ += i_90_;
	int i_116_ = i_108_;
	i_108_ += i_101_;
	int i_117_ = i_108_;
	if (i_96_ == 1)
	    i_108_ += i_90_ * 2;
	int i_118_ = i_108_;
	i_108_ += i_102_;
	int i_119_ = i_108_;
	i_108_ += i_90_ * 2;
	int i_120_ = i_108_;
	i_108_ += i_98_;
	int i_121_ = i_108_;
	i_108_ += i_99_;
	int i_122_ = i_108_;
	i_108_ += i_100_;
	int i_123_ = i_108_;
	i_108_ += i_103_ * 6;
	int i_124_ = i_108_;
	i_108_ += i_104_ * 6;
	int i_125_ = i_108_;
	i_108_ += i_104_ * 6;
	int i_126_ = i_108_;
	i_108_ += i_104_;
	int i_127_ = i_108_;
	i_108_ += i_104_;
	int i_128_ = i_108_;
	i_108_ += i_104_ + i_105_ * 2;
	anInt3521 = i;
	anInt3547 = i_90_;
	anInt3544 = i_91_;
	anIntArray3530 = new int[i];
	anIntArray3526 = new int[i];
	anIntArray3510 = new int[i];
	anIntArray3549 = new int[i_90_];
	anIntArray3507 = new int[i_90_];
	anIntArray3540 = new int[i_90_];
	if (i_97_ == 1)
	    anIntArray3513 = new int[i];
	if (i_92_ == 1)
	    aByteArray3534 = new byte[i_90_];
	if (i_93_ == 255)
	    aByteArray3546 = new byte[i_90_];
	else
	    aByte3542 = (byte) i_93_;
	if (i_94_ == 1)
	    aByteArray3541 = new byte[i_90_];
	if (i_95_ == 1)
	    anIntArray3532 = new int[i_90_];
	if (i_96_ == 1)
	    aShortArray3528 = new short[i_90_];
	if (i_96_ == 1 && i_91_ > 0)
	    aByteArray3535 = new byte[i_90_];
	aShortArray3533 = new short[i_90_];
	if (i_91_ > 0) {
	    aShortArray3520 = new short[i_91_];
	    aShortArray3531 = new short[i_91_];
	    aShortArray3511 = new short[i_91_];
	    if (i_104_ > 0) {
		aShortArray3512 = new short[i_104_];
		aShortArray3522 = new short[i_104_];
		aShortArray3527 = new short[i_104_];
		aByteArray3516 = new byte[i_104_];
		aByteArray3548 = new byte[i_104_];
		aByteArray3554 = new byte[i_104_];
	    }
	    if (i_105_ > 0) {
		aByteArray3518 = new byte[i_105_];
		aByteArray3529 = new byte[i_105_];
	    }
	}
	class14_sub10.anInt2908 = i_109_;
	class14_sub10_84_.anInt2908 = i_120_;
	class14_sub10_85_.anInt2908 = i_121_;
	class14_sub10_86_.anInt2908 = i_122_;
	class14_sub10_87_.anInt2908 = i_114_;
	int i_129_ = 0;
	int i_130_ = 0;
	int i_131_ = 0;
	for (int i_132_ = 0; i_132_ < i; i_132_++) {
	    int i_133_ = class14_sub10.method798(-106);
	    int i_134_ = 0;
	    if ((i_133_ & 0x1) != 0)
		i_134_ = class14_sub10_84_.method793(-879985848);
	    int i_135_ = 0;
	    if ((i_133_ & 0x2) != 0)
		i_135_ = class14_sub10_85_.method793(-879985848);
	    int i_136_ = 0;
	    if ((i_133_ & 0x4) != 0)
		i_136_ = class14_sub10_86_.method793(-879985848);
	    anIntArray3530[i_132_] = i_129_ + i_134_;
	    anIntArray3526[i_132_] = i_130_ + i_135_;
	    anIntArray3510[i_132_] = i_131_ + i_136_;
	    i_129_ = anIntArray3530[i_132_];
	    i_130_ = anIntArray3526[i_132_];
	    i_131_ = anIntArray3510[i_132_];
	    if (i_97_ == 1)
		anIntArray3513[i_132_] = class14_sub10_87_.method798(88);
	}
	class14_sub10.anInt2908 = i_119_;
	class14_sub10_84_.anInt2908 = i_110_;
	class14_sub10_85_.anInt2908 = i_112_;
	class14_sub10_86_.anInt2908 = i_115_;
	class14_sub10_87_.anInt2908 = i_113_;
	class14_sub10_88_.anInt2908 = i_117_;
	class14_sub10_89_.anInt2908 = i_118_;
	for (int i_137_ = 0; i_137_ < i_90_; i_137_++) {
	    aShortArray3533[i_137_]
		= (short) class14_sub10.method784((byte) 113);
	    if (i_92_ == 1)
		aByteArray3534[i_137_]
		    = class14_sub10_84_.method780((byte) -77);
	    if (i_93_ == 255)
		aByteArray3546[i_137_]
		    = class14_sub10_85_.method780((byte) -77);
	    if (i_94_ == 1)
		aByteArray3541[i_137_]
		    = class14_sub10_86_.method780((byte) -77);
	    if (i_95_ == 1)
		anIntArray3532[i_137_] = class14_sub10_87_.method798(-50);
	    if (i_96_ == 1)
		aShortArray3528[i_137_]
		    = (short) (class14_sub10_88_.method784((byte) 118) - 1);
	    if (aByteArray3535 != null) {
		if (aShortArray3528[i_137_] != -1)
		    aByteArray3535[i_137_]
			= (byte) (class14_sub10_89_.method798(-37) - 1);
		else
		    aByteArray3535[i_137_] = (byte) -1;
	    }
	}
	class14_sub10.anInt2908 = i_116_;
	class14_sub10_84_.anInt2908 = i_111_;
	int i_138_ = 0;
	int i_139_ = 0;
	int i_140_ = 0;
	int i_141_ = 0;
	for (int i_142_ = 0; i_142_ < i_90_; i_142_++) {
	    int i_143_ = class14_sub10_84_.method798(-121);
	    if (i_143_ == 1) {
		i_138_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_138_;
		i_139_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_139_;
		i_140_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_140_;
		anIntArray3549[i_142_] = i_138_;
		anIntArray3507[i_142_] = i_139_;
		anIntArray3540[i_142_] = i_140_;
	    }
	    if (i_143_ == 2) {
		i_139_ = i_140_;
		i_140_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_140_;
		anIntArray3549[i_142_] = i_138_;
		anIntArray3507[i_142_] = i_139_;
		anIntArray3540[i_142_] = i_140_;
	    }
	    if (i_143_ == 3) {
		i_138_ = i_140_;
		i_140_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_140_;
		anIntArray3549[i_142_] = i_138_;
		anIntArray3507[i_142_] = i_139_;
		anIntArray3540[i_142_] = i_140_;
	    }
	    if (i_143_ == 4) {
		int i_144_ = i_138_;
		i_138_ = i_139_;
		i_139_ = i_144_;
		i_140_ = class14_sub10.method793(-879985848) + i_141_;
		i_141_ = i_140_;
		anIntArray3549[i_142_] = i_138_;
		anIntArray3507[i_142_] = i_139_;
		anIntArray3540[i_142_] = i_140_;
	    }
	}
	class14_sub10.anInt2908 = i_123_;
	class14_sub10_84_.anInt2908 = i_124_;
	class14_sub10_85_.anInt2908 = i_125_;
	class14_sub10_86_.anInt2908 = i_126_;
	class14_sub10_87_.anInt2908 = i_127_;
	class14_sub10_88_.anInt2908 = i_128_;
	for (int i_145_ = 0; i_145_ < i_91_; i_145_++) {
	    int i_146_ = aByteArray3514[i_145_] & 0xff;
	    if (i_146_ == 0) {
		aShortArray3520[i_145_]
		    = (short) class14_sub10.method784((byte) 116);
		aShortArray3531[i_145_]
		    = (short) class14_sub10.method784((byte) 112);
		aShortArray3511[i_145_]
		    = (short) class14_sub10.method784((byte) 111);
	    }
	    if (i_146_ == 1) {
		aShortArray3520[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 108);
		aShortArray3531[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 126);
		aShortArray3511[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 116);
		aShortArray3512[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 109);
		aShortArray3522[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 115);
		aShortArray3527[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 127);
		aByteArray3516[i_145_]
		    = class14_sub10_86_.method780((byte) -77);
		aByteArray3548[i_145_]
		    = class14_sub10_87_.method780((byte) -77);
		aByteArray3554[i_145_]
		    = class14_sub10_88_.method780((byte) -77);
	    }
	    if (i_146_ == 2) {
		aShortArray3520[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 101);
		aShortArray3531[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 109);
		aShortArray3511[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 125);
		aShortArray3512[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 101);
		aShortArray3522[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 117);
		aShortArray3527[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 125);
		aByteArray3516[i_145_]
		    = class14_sub10_86_.method780((byte) -77);
		aByteArray3548[i_145_]
		    = class14_sub10_87_.method780((byte) -77);
		aByteArray3554[i_145_]
		    = class14_sub10_88_.method780((byte) -77);
		aByteArray3518[i_145_]
		    = class14_sub10_88_.method780((byte) -77);
		aByteArray3529[i_145_]
		    = class14_sub10_88_.method780((byte) -77);
	    }
	    if (i_146_ == 3) {
		aShortArray3520[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 122);
		aShortArray3531[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 122);
		aShortArray3511[i_145_]
		    = (short) class14_sub10_84_.method784((byte) 103);
		aShortArray3512[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 123);
		aShortArray3522[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 118);
		aShortArray3527[i_145_]
		    = (short) class14_sub10_85_.method784((byte) 118);
		aByteArray3516[i_145_]
		    = class14_sub10_86_.method780((byte) -77);
		aByteArray3548[i_145_]
		    = class14_sub10_87_.method780((byte) -77);
		aByteArray3554[i_145_]
		    = class14_sub10_88_.method780((byte) -77);
	    }
	}
    }
    
    public Class133_Sub7_Sub1 method1822(int arg0, int arg1, int arg2,
					 int arg3, int arg4) {
	return new Class133_Sub7_Sub1(this, arg0, arg1, arg2, arg3, arg4);
    }
    
    public void method1823() {
	if (anIntArray3513 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_147_ = 0; i_147_ < anInt3521; i_147_++) {
		int i_148_ = anIntArray3513[i_147_];
		is[i_148_]++;
		if (i_148_ > i)
		    i = i_148_;
	    }
	    anIntArrayArray3545 = new int[i + 1][];
	    for (int i_149_ = 0; i_149_ <= i; i_149_++) {
		anIntArrayArray3545[i_149_] = new int[is[i_149_]];
		is[i_149_] = 0;
	    }
	    for (int i_150_ = 0; i_150_ < anInt3521; i_150_++) {
		int i_151_ = anIntArray3513[i_150_];
		anIntArrayArray3545[i_151_][is[i_151_]++] = i_150_;
	    }
	    anIntArray3513 = null;
	}
	if (anIntArray3532 != null) {
	    int[] is = new int[256];
	    int i = 0;
	    for (int i_152_ = 0; i_152_ < anInt3547; i_152_++) {
		int i_153_ = anIntArray3532[i_152_];
		is[i_153_]++;
		if (i_153_ > i)
		    i = i_153_;
	    }
	    anIntArrayArray3509 = new int[i + 1][];
	    for (int i_154_ = 0; i_154_ <= i; i_154_++) {
		anIntArrayArray3509[i_154_] = new int[is[i_154_]];
		is[i_154_] = 0;
	    }
	    for (int i_155_ = 0; i_155_ < anInt3547; i_155_++) {
		int i_156_ = anIntArray3532[i_155_];
		anIntArrayArray3509[i_156_][is[i_156_]++] = i_155_;
	    }
	    anIntArray3532 = null;
	}
    }
    
    public static Class133_Sub2 method1824(Class9 arg0, int arg1, int arg2) {
	byte[] is = arg0.method163(arg2, arg1, 0);
	if (is == null)
	    return null;
	return new Class133_Sub2(is);
    }
    
    public Class133 method1791(int arg0, int arg1, int arg2) {
	return method1827(aShort3539, aShort3525, arg0, arg1, arg2);
    }
    
    public void method1825(int arg0, int arg1, int arg2) {
	for (int i = 0; i < anInt3521; i++) {
	    anIntArray3530[i] += arg0;
	    anIntArray3526[i] += arg1;
	    anIntArray3510[i] += arg2;
	}
	method1816();
    }
    
    public void method1826() {
	if (aClass89Array3552 == null) {
	    aClass89Array3552 = new Class89[anInt3521];
	    for (int i = 0; i < anInt3521; i++)
		aClass89Array3552[i] = new Class89();
	    for (int i = 0; i < anInt3547; i++) {
		int i_157_ = anIntArray3549[i];
		int i_158_ = anIntArray3507[i];
		int i_159_ = anIntArray3540[i];
		int i_160_ = anIntArray3530[i_158_] - anIntArray3530[i_157_];
		int i_161_ = anIntArray3526[i_158_] - anIntArray3526[i_157_];
		int i_162_ = anIntArray3510[i_158_] - anIntArray3510[i_157_];
		int i_163_ = anIntArray3530[i_159_] - anIntArray3530[i_157_];
		int i_164_ = anIntArray3526[i_159_] - anIntArray3526[i_157_];
		int i_165_ = anIntArray3510[i_159_] - anIntArray3510[i_157_];
		int i_166_ = i_161_ * i_165_ - i_164_ * i_162_;
		int i_167_ = i_162_ * i_163_ - i_165_ * i_160_;
		int i_168_;
		for (i_168_ = i_160_ * i_164_ - i_163_ * i_161_;
		     (i_166_ > 8192 || i_167_ > 8192 || i_168_ > 8192
		      || i_166_ < -8192 || i_167_ < -8192 || i_168_ < -8192);
		     i_168_ >>= 1) {
		    i_166_ >>= 1;
		    i_167_ >>= 1;
		}
		int i_169_ = (int) Math.sqrt((double) (i_166_ * i_166_
						       + i_167_ * i_167_
						       + i_168_ * i_168_));
		if (i_169_ <= 0)
		    i_169_ = 1;
		i_166_ = i_166_ * 256 / i_169_;
		i_167_ = i_167_ * 256 / i_169_;
		i_168_ = i_168_ * 256 / i_169_;
		byte i_170_;
		if (aByteArray3534 == null)
		    i_170_ = (byte) 0;
		else
		    i_170_ = aByteArray3534[i];
		if (i_170_ == 0) {
		    Class89 class89 = aClass89Array3552[i_157_];
		    class89.anInt1414 += i_166_;
		    class89.anInt1404 += i_167_;
		    class89.anInt1406 += i_168_;
		    class89.anInt1410++;
		    class89 = aClass89Array3552[i_158_];
		    class89.anInt1414 += i_166_;
		    class89.anInt1404 += i_167_;
		    class89.anInt1406 += i_168_;
		    class89.anInt1410++;
		    class89 = aClass89Array3552[i_159_];
		    class89.anInt1414 += i_166_;
		    class89.anInt1404 += i_167_;
		    class89.anInt1406 += i_168_;
		    class89.anInt1410++;
		} else if (i_170_ == 1) {
		    if (aClass138Array3536 == null)
			aClass138Array3536 = new Class138[anInt3547];
		    Class138 class138 = aClass138Array3536[i] = new Class138();
		    class138.anInt2208 = i_166_;
		    class138.anInt2217 = i_167_;
		    class138.anInt2209 = i_168_;
		}
	    }
	}
    }
    
    public Class133_Sub7 method1827(int arg0, int arg1, int arg2, int arg3,
				    int arg4) {
	Class133_Sub7_Sub2 class133_sub7_sub2
	    = new Class133_Sub7_Sub2(this, arg0, arg1, true);
	class133_sub7_sub2.method1913();
	return class133_sub7_sub2;
    }
    
    public static void method1828() {
	anIntArray3519 = null;
	anIntArray3551 = null;
	anIntArray3523 = null;
	anIntArray3508 = null;
    }
    
    public int method1781() {
	if (!aBoolean3543)
	    method1812();
	return aShort3506;
    }
    
    public void method1792(int i, int i_171_, int i_172_, int i_173_,
			   int i_174_, int i_175_, int i_176_, int i_177_,
			   long l) {
	/* empty */
    }
    
    public Class133_Sub2() {
	aByte3542 = (byte) 0;
	anInt3547 = 0;
    }
    
    public Class133_Sub2(byte[] arg0) {
	aByte3542 = (byte) 0;
	anInt3547 = 0;
	if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1)
	    method1821(arg0);
	else
	    method1815(arg0);
    }
    
    public Class133_Sub2(int arg0, int arg1, int arg2) {
	aByte3542 = (byte) 0;
	anInt3547 = 0;
	anIntArray3530 = new int[arg0];
	anIntArray3526 = new int[arg0];
	anIntArray3510 = new int[arg0];
	anIntArray3513 = new int[arg0];
	anIntArray3549 = new int[arg1];
	anIntArray3507 = new int[arg1];
	anIntArray3540 = new int[arg1];
	aByteArray3534 = new byte[arg1];
	aByteArray3546 = new byte[arg1];
	aByteArray3541 = new byte[arg1];
	aShortArray3533 = new short[arg1];
	aShortArray3528 = new short[arg1];
	aByteArray3535 = new byte[arg1];
	anIntArray3532 = new int[arg1];
	if (arg2 > 0) {
	    aByteArray3514 = new byte[arg2];
	    aShortArray3520 = new short[arg2];
	    aShortArray3531 = new short[arg2];
	    aShortArray3511 = new short[arg2];
	    aShortArray3512 = new short[arg2];
	    aShortArray3522 = new short[arg2];
	    aShortArray3527 = new short[arg2];
	    aByteArray3516 = new byte[arg2];
	    aByteArray3548 = new byte[arg2];
	    aByteArray3554 = new byte[arg2];
	    aByteArray3518 = new byte[arg2];
	    aByteArray3529 = new byte[arg2];
	}
    }
    
    public Class133_Sub2(Class133_Sub2[] arg0, int arg1) {
	aByte3542 = (byte) 0;
	anInt3547 = 0;
	boolean bool = false;
	boolean bool_178_ = false;
	boolean bool_179_ = false;
	boolean bool_180_ = false;
	boolean bool_181_ = false;
	boolean bool_182_ = false;
	anInt3521 = 0;
	anInt3547 = 0;
	anInt3544 = 0;
	aByte3542 = (byte) -1;
	for (int i = 0; i < arg1; i++) {
	    Class133_Sub2 class133_sub2 = arg0[i];
	    if (class133_sub2 != null) {
		anInt3521 += class133_sub2.anInt3521;
		anInt3547 += class133_sub2.anInt3547;
		anInt3544 += class133_sub2.anInt3544;
		if (class133_sub2.aByteArray3546 != null)
		    bool_178_ = true;
		else {
		    if (aByte3542 == -1)
			aByte3542 = class133_sub2.aByte3542;
		    if (aByte3542 != class133_sub2.aByte3542)
			bool_178_ = true;
		}
		bool = bool | class133_sub2.aByteArray3534 != null;
		bool_179_ = bool_179_ | class133_sub2.aByteArray3541 != null;
		bool_180_ = bool_180_ | class133_sub2.anIntArray3532 != null;
		bool_181_ = bool_181_ | class133_sub2.aShortArray3528 != null;
		bool_182_ = bool_182_ | class133_sub2.aByteArray3535 != null;
	    }
	}
	anIntArray3530 = new int[anInt3521];
	anIntArray3526 = new int[anInt3521];
	anIntArray3510 = new int[anInt3521];
	anIntArray3513 = new int[anInt3521];
	anIntArray3549 = new int[anInt3547];
	anIntArray3507 = new int[anInt3547];
	anIntArray3540 = new int[anInt3547];
	if (bool)
	    aByteArray3534 = new byte[anInt3547];
	if (bool_178_)
	    aByteArray3546 = new byte[anInt3547];
	if (bool_179_)
	    aByteArray3541 = new byte[anInt3547];
	if (bool_180_)
	    anIntArray3532 = new int[anInt3547];
	if (bool_181_)
	    aShortArray3528 = new short[anInt3547];
	if (bool_182_)
	    aByteArray3535 = new byte[anInt3547];
	aShortArray3533 = new short[anInt3547];
	if (anInt3544 > 0) {
	    aByteArray3514 = new byte[anInt3544];
	    aShortArray3520 = new short[anInt3544];
	    aShortArray3531 = new short[anInt3544];
	    aShortArray3511 = new short[anInt3544];
	    aShortArray3512 = new short[anInt3544];
	    aShortArray3522 = new short[anInt3544];
	    aShortArray3527 = new short[anInt3544];
	    aByteArray3516 = new byte[anInt3544];
	    aByteArray3548 = new byte[anInt3544];
	    aByteArray3554 = new byte[anInt3544];
	    aByteArray3518 = new byte[anInt3544];
	    aByteArray3529 = new byte[anInt3544];
	}
	anInt3521 = 0;
	anInt3547 = 0;
	anInt3544 = 0;
	for (int i = 0; i < arg1; i++) {
	    Class133_Sub2 class133_sub2 = arg0[i];
	    if (class133_sub2 != null) {
		for (int i_183_ = 0; i_183_ < class133_sub2.anInt3547;
		     i_183_++) {
		    if (bool && class133_sub2.aByteArray3534 != null)
			aByteArray3534[anInt3547]
			    = class133_sub2.aByteArray3534[i_183_];
		    if (bool_178_) {
			if (class133_sub2.aByteArray3546 != null)
			    aByteArray3546[anInt3547]
				= class133_sub2.aByteArray3546[i_183_];
			else
			    aByteArray3546[anInt3547]
				= class133_sub2.aByte3542;
		    }
		    if (bool_179_ && class133_sub2.aByteArray3541 != null)
			aByteArray3541[anInt3547]
			    = class133_sub2.aByteArray3541[i_183_];
		    if (bool_180_ && class133_sub2.anIntArray3532 != null)
			anIntArray3532[anInt3547]
			    = class133_sub2.anIntArray3532[i_183_];
		    if (bool_181_) {
			if (class133_sub2.aShortArray3528 != null)
			    aShortArray3528[anInt3547]
				= class133_sub2.aShortArray3528[i_183_];
			else
			    aShortArray3528[anInt3547] = (short) -1;
		    }
		    if (bool_182_) {
			if (class133_sub2.aByteArray3535 != null
			    && class133_sub2.aByteArray3535[i_183_] != -1)
			    aByteArray3535[anInt3547]
				= (byte) (class133_sub2.aByteArray3535[i_183_]
					  + anInt3544);
			else
			    aByteArray3535[anInt3547] = (byte) -1;
		    }
		    aShortArray3533[anInt3547]
			= class133_sub2.aShortArray3533[i_183_];
		    anIntArray3549[anInt3547]
			= method1814(class133_sub2,
				     class133_sub2.anIntArray3549[i_183_]);
		    anIntArray3507[anInt3547]
			= method1814(class133_sub2,
				     class133_sub2.anIntArray3507[i_183_]);
		    anIntArray3540[anInt3547]
			= method1814(class133_sub2,
				     class133_sub2.anIntArray3540[i_183_]);
		    anInt3547++;
		}
		for (int i_184_ = 0; i_184_ < class133_sub2.anInt3544;
		     i_184_++) {
		    byte i_185_ = (aByteArray3514[anInt3544]
				   = class133_sub2.aByteArray3514[i_184_]);
		    if (i_185_ == 0) {
			aShortArray3520[anInt3544]
			    = (short) method1814(class133_sub2,
						 (class133_sub2.aShortArray3520
						  [i_184_]));
			aShortArray3531[anInt3544]
			    = (short) method1814(class133_sub2,
						 (class133_sub2.aShortArray3531
						  [i_184_]));
			aShortArray3511[anInt3544]
			    = (short) method1814(class133_sub2,
						 (class133_sub2.aShortArray3511
						  [i_184_]));
		    }
		    if (i_185_ >= 1 && i_185_ <= 3) {
			aShortArray3520[anInt3544]
			    = class133_sub2.aShortArray3520[i_184_];
			aShortArray3531[anInt3544]
			    = class133_sub2.aShortArray3531[i_184_];
			aShortArray3511[anInt3544]
			    = class133_sub2.aShortArray3511[i_184_];
			aShortArray3512[anInt3544]
			    = class133_sub2.aShortArray3512[i_184_];
			aShortArray3522[anInt3544]
			    = class133_sub2.aShortArray3522[i_184_];
			aShortArray3527[anInt3544]
			    = class133_sub2.aShortArray3527[i_184_];
			aByteArray3516[anInt3544]
			    = class133_sub2.aByteArray3516[i_184_];
			aByteArray3548[anInt3544]
			    = class133_sub2.aByteArray3548[i_184_];
			aByteArray3554[anInt3544]
			    = class133_sub2.aByteArray3554[i_184_];
		    }
		    if (i_185_ == 2) {
			aByteArray3518[anInt3544]
			    = class133_sub2.aByteArray3518[i_184_];
			aByteArray3529[anInt3544]
			    = class133_sub2.aByteArray3529[i_184_];
		    }
		    anInt3544++;
		}
	    }
	}
    }
    
    static {
	anIntArray3508 = Class3.anIntArray111;
	anInt3537 = 0;
	anIntArray3551 = new int[10000];
	anIntArray3523 = Class3.anIntArray108;
    }
}
