/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class56
{
    public static int[] anIntArray913;
    public static Class124 aClass124_914
	= Class14_Sub2_Sub2
	      .method263(1178, "Please wait )2 attempting to reestablish)3");
    public static int anInt915;
    public static int anInt916;
    public static int[] anIntArray917;
    public static int anInt918;
    public static Class124[] aClass124Array919;
    public static int anInt920;
    public static int anInt921;
    public static Class49 aClass49_922;
    public static Class124 aClass124_923;
    
    public static void method1237(int arg0) {
    while_844_:
	do {
	while_843_:
	    do {
		do {
		    try {
			aClass124_923 = null;
			aClass49_922 = null;
			anIntArray917 = null;
			if (arg0 == 1232386310)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_843_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray913 = null;
		    aClass124Array919 = null;
		    aClass124_914 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_844_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "h.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1238(int arg0, boolean arg1) {
	try {
	    anInt915++;
	    int i;
	    byte[][] is;
	    if (arg1) {
		i = 1;
		is = Class14_Sub2_Sub12.aByteArrayArray3913;
	    } else {
		i = 4;
		is = Class5.aByteArrayArray139;
	    }
	    if (arg0 != 9857)
		method1240();
	    for (int i_0_ = 0; (i_0_ ^ 0xffffffff) > (i ^ 0xffffffff);
		 i_0_++) {
		Class138.method1946(139);
		for (int i_1_ = 0; i_1_ < 13; i_1_++) {
		    for (int i_2_ = 0; 13 > i_2_; i_2_++) {
			int i_3_
			    = Class7.anIntArrayArrayArray169[i_0_][i_1_][i_2_];
			boolean bool = false;
			if (-1 != i_3_) {
			    int i_4_ = i_3_ >> -746115208 & 0x3;
			    if (!arg1 || (i_4_ ^ 0xffffffff) == -1) {
				int i_5_ = 0x3 & i_3_ >> 1628828385;
				int i_6_ = (0xffc245 & i_3_) >> -1581384274;
				int i_7_ = (i_3_ & 0x3ffd) >> 648839907;
				int i_8_
				    = (i_6_ / 8 << -918041624) - -(i_7_ / 8);
				for (int i_9_ = 0;
				     ((Class14_Sub8.anIntArray2858.length
				       ^ 0xffffffff)
				      < (i_9_ ^ 0xffffffff));
				     i_9_++) {
				    if ((Class14_Sub8.anIntArray2858[i_9_]
					 ^ 0xffffffff) == (i_8_ ^ 0xffffffff)
					&& null != is[i_9_]) {
					bool = true;
					Class133_Sub3.method1833
					    (arg1, 8 * i_1_, i_5_, is[i_9_],
					     i_0_, 8 * i_2_, (byte) -123, i_4_,
					     (i_6_ & 0x7) * 8,
					     8 * (0x7 & i_7_),
					     Class14_Sub21.aClass32Array3100);
					break;
				    }
				}
			    }
			}
			if (!bool)
			    Class107.method1547(i_0_, i_2_ * 8, i_1_ * 8, 8, 8,
						false);
		    }
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("h.C(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static Class14_Sub2_Sub19_Sub1 method1239(int arg0) {
	Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
	try {
	    anInt921++;
	    byte[] is = Class12.aByteArrayArray310[0];
	    int i = Class76.anIntArray1204[arg0] * Class17.anIntArray402[0];
	    Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_10_;
	    if (Class125_Sub4.aBooleanArray3416[0]) {
		int[] is_11_ = new int[i];
		byte[] is_12_ = Class98.aByteArrayArray1667[0];
		for (int i_13_ = 0; i_13_ < i; i_13_++)
		    is_11_[i_13_]
			= (Class66.method1294
			   (Class14_Sub8_Sub26.method617(-16777216,
							 (is_12_[i_13_]
							  << -1598838472)),
			    (Class73.anIntArray1114
			     [Class14_Sub8_Sub26.method617(is[i_13_], 255)])));
		class14_sub2_sub19_sub1_10_
		    = (new Class14_Sub2_Sub19_Sub1_Sub1
		       (Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
			Class40.anIntArray675[0],
			Class14_Sub2_Sub12.anIntArray3918[0],
			Class17.anIntArray402[0], Class76.anIntArray1204[0],
			is_11_));
	    } else {
		int[] is_14_ = new int[i];
		for (int i_15_ = 0; (i_15_ ^ 0xffffffff) > (i ^ 0xffffffff);
		     i_15_++)
		    is_14_[i_15_]
			= (Class73.anIntArray1114
			   [Class14_Sub8_Sub26.method617(is[i_15_], 255)]);
		class14_sub2_sub19_sub1_10_
		    = new Class14_Sub2_Sub19_Sub1(Class14_Sub11.anInt2952,
						  Class14_Sub30.anInt3279,
						  Class40.anIntArray675[0],
						  (Class14_Sub2_Sub12
						   .anIntArray3918[0]),
						  Class17.anIntArray402[0],
						  Class76.anIntArray1204[0],
						  is_14_);
	    }
	    Class129.method1761((byte) 83);
	    class14_sub2_sub19_sub1 = class14_sub2_sub19_sub1_10_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "h.B(" + arg0 + ')');
	}
	return class14_sub2_sub19_sub1;
    }
    
    public static void method1240() {
	for (int i = 0; i < Class83.anInt1338; i++) {
	    for (int i_16_ = 0; i_16_ < Class99_Sub2.anInt3338; i_16_++) {
		for (int i_17_ = 0; i_17_ < Class14_Sub8_Sub15.anInt4337;
		     i_17_++)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[i_16_][i_17_]
			= null;
	    }
	}
	for (int i = 0; i < Class14_Sub8_Sub26.anInt4533; i++)
	    Class51.aClass85Array838[i] = null;
	Class14_Sub8_Sub26.anInt4533 = 0;
	for (int i = 0; i < Class14_Sub8_Sub38.anInt4727; i++)
	    Class14_Sub20.aClass40Array3093[i] = null;
	Class14_Sub8_Sub38.anInt4727 = 0;
	for (int i = 0; i < Class14_Sub8_Sub4.aClass40Array4143.length; i++)
	    Class14_Sub8_Sub4.aClass40Array4143[i] = null;
    }
    
    static {
	anIntArray913 = new int[25];
	anInt918 = 0;
	aClass124Array919 = new Class124[8];
	aClass124_923 = aClass124_914;
	aClass49_922 = new Class49();
    }
}
