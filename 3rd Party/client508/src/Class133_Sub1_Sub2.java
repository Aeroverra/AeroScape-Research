/* Class133_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class133_Sub1_Sub2 extends Class133_Sub1
{
    public static int[] anIntArray4944 = new int[2000];
    public static Class14_Sub23[] aClass14_Sub23Array4945;
    public static int anInt4946;
    public static int anInt4947;
    public static Class124 aClass124_4948
	= Class14_Sub2_Sub2.method263(1178, "scrollen:");
    public Class12 aClass12_4949;
    public static Class124 aClass124_4950
	= Class14_Sub2_Sub2.method263(1178, "weiss:");
    public static long[] aLongArray4951 = new long[200];
    public static int anInt4952;
    public static int anInt4953;
    
    public static void method1811(int arg0) {
	try {
	    aClass124_4950 = null;
	    aClass14_Sub23Array4945 = null;
	    anIntArray4944 = null;
	    aLongArray4951 = null;
	    if (arg0 != -1)
		anIntArray4944 = null;
	    aClass124_4948 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jf.B(" + arg0 + ')');
	}
    }
    
    public int method1781() {
	int i;
	try {
	    anInt4952++;
	    i = anInt3449;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "jf.H()");
	}
	return i;
    }
    
    public boolean method1804(byte arg0) {
    while_1191_:
	do {
	    do {
		boolean bool;
		try {
		    anInt4946++;
		    if (null != aClass12_4949)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_1191_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		if (arg0 != 115)
		    method1811(100);
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "jf.A(" + arg0 + ')');
    }
    
    public void method1792(int arg0, int arg1, int arg2, int arg3, int arg4,
			   int arg5, int arg6, int arg7, long arg8) {
    while_1193_:
	do {
	while_1192_:
	    do {
		do {
		    try {
			anInt4953++;
			if (null != aClass12_4949)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1192_;
		    }
		    return;
		} while (false);
		Class46 class46;
		Class46 class46_0_;
		Class133_Sub7 class133_sub7;
		do {
		    try {
			class46 = ((anInt3445 == -1
				    || (anInt3467 ^ 0xffffffff) != -1)
				   ? null : Class41.method1129(anInt3445, 32));
			class46_0_
			    = ((-1 == anInt3452
				|| ((anInt3452 ^ 0xffffffff) == (anInt3433
								 ^ 0xffffffff)
				    && class46 != null))
			       ? null : Class41.method1129(anInt3452, -39));
			class133_sub7
			    = aClass12_4949.method209(anInt3483, anInt3501,
						      class46, class46_0_,
						      -55);
			if (class133_sub7 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1192_;
		    }
		    return;
		} while (false);
		try {
		    anInt3449 = class133_sub7.method1781();
		    Class12 class12 = aClass12_4949;
		    if (class12.anIntArray329 != null)
			class12 = class12.method217((byte) -18);
		    if (Class14_Sub8_Sub25.aBoolean4518
			&& class12.aBoolean330) {
			Class133_Sub7 class133_sub7_1_
			    = (Class76.method1359
			       (-10345, anInt3495,
				null == class46_0_ ? class46 : class46_0_,
				class133_sub7, aClass12_4949.aShort313,
				aClass12_4949.aByte321, anInt3500,
				aClass12_4949.aByte331,
				aClass12_4949.aShort285, arg0, anInt3436,
				class46_0_ != null ? anInt3483 : anInt3501,
				aClass12_4949.anInt334, aBoolean3488));
			float f = Class121.method1653();
			float f_2_ = Class121.method1624();
			Class121.method1646();
			Class121.method1635(f, f_2_ - 150.0F);
			class133_sub7_1_.method1792(0, arg1, arg2, arg3, arg4,
						    arg5, arg6, arg7, -1L);
			Class121.method1625();
			Class121.method1635(f, f_2_);
		    }
		    int i = 0;
		    int i_3_ = 0;
		    int i_4_ = 0;
		    if (0 != aClass12_4949.aShort280
			|| -1 != (aClass12_4949.aShort315 ^ 0xffffffff)) {
			int i_5_ = aClass12_4949.aShort280;
			int i_6_ = Class3.anIntArray111[arg0];
			int i_7_ = aClass12_4949.aShort315;
			int i_8_ = Class3.anIntArray108[arg0];
			int i_9_ = -i_5_ / 2;
			int i_10_ = -i_7_ / 2;
			int i_11_
			    = i_6_ * i_10_ + -(i_9_ * i_8_) >> 1220113392;
			int i_12_ = i_5_ / 2;
			int i_13_ = i_8_ * i_10_ - -(i_9_ * i_6_) >> 106290096;
			int i_14_
			    = Class26.method1017(i_13_ + anInt3495,
						 Class14_Sub2_Sub3.anInt3785,
						 (byte) -1, anInt3436 + i_11_);
			int i_15_ = -i_7_ / 2;
			int i_16_
			    = -(i_12_ * i_8_) + i_6_ * i_15_ >> -1112575920;
			int i_17_
			    = i_8_ * i_15_ - -(i_12_ * i_6_) >> 1175808528;
			int i_18_ = -i_5_ / 2;
			int i_19_
			    = Class26.method1017(i_17_ + anInt3495,
						 Class14_Sub2_Sub3.anInt3785,
						 (byte) -16,
						 i_16_ + anInt3436);
			int i_20_ = i_7_ / 2;
			int i_21_ = i_6_ * i_18_ + i_20_ * i_8_ >> -1063233520;
			int i_22_
			    = i_6_ * i_20_ + -(i_18_ * i_8_) >> -519417616;
			int i_23_
			    = Class26.method1017(anInt3495 - -i_21_,
						 Class14_Sub2_Sub3.anInt3785,
						 (byte) -111,
						 anInt3436 - -i_22_);
			int i_24_ = i_7_ / 2;
			int i_25_ = i_5_ / 2;
			int i_26_ = i_6_ * i_25_ + i_24_ * i_8_ >> -1461743664;
			int i_27_
			    = -(i_25_ * i_8_) + i_6_ * i_24_ >> 1413452144;
			int i_28_
			    = Class26.method1017(i_26_ + anInt3495,
						 Class14_Sub2_Sub3.anInt3785,
						 (byte) -111,
						 anInt3436 - -i_27_);
			int i_29_
			    = ((i_28_ ^ 0xffffffff) < (i_23_ ^ 0xffffffff)
			       ? i_23_ : i_28_);
			int i_30_
			    = ((i_14_ ^ 0xffffffff) <= (i_19_ ^ 0xffffffff)
			       ? i_19_ : i_14_);
			i_4_ = i_14_ - -i_28_;
			if ((i_4_ ^ 0xffffffff) < (i_19_ + i_23_ ^ 0xffffffff))
			    i_4_ = i_19_ - -i_23_;
			if (0 != i_7_) {
			    i = 0x7ff & (int) (Math.atan2((double) (-i_29_
								    + i_30_),
							  (double) i_7_)
					       * 325.95);
			    if ((i ^ 0xffffffff) != -1)
				class133_sub7.method1861(i);
			}
			int i_31_ = i_28_ > i_19_ ? i_19_ : i_28_;
			int i_32_ = i_14_ < i_23_ ? i_14_ : i_23_;
			if (-1 != (i_5_ ^ 0xffffffff)) {
			    i_3_ = (int) (Math.atan2((double) (i_32_ + -i_31_),
						     (double) i_5_)
					  * 325.95) & 0x7ff;
			    if (0 != i_3_)
				class133_sub7.method1858(i_3_);
			}
			i_4_ = -anInt3500 + (i_4_ >> -1548434975);
			if ((i_4_ ^ 0xffffffff) != -1)
			    class133_sub7.method1855(0, i_4_, 0);
		    }
		    Class133_Sub7 class133_sub7_33_ = null;
		    if (-1 != anInt3487 && (anInt3470 ^ 0xffffffff) != 0) {
			Class60 class60
			    = Class127.method1749(anInt3487, (byte) 73);
			class133_sub7_33_ = class60.method1267(0, anInt3470);
			if (null != class133_sub7_33_) {
			    class133_sub7_33_.method1855(0, -anInt3475, 0);
			    if (class60.aBoolean978) {
				if ((i ^ 0xffffffff) != -1)
				    class133_sub7_33_.method1861(i);
				if (-1 != (i_3_ ^ 0xffffffff))
				    class133_sub7_33_.method1858(i_3_);
				if (-1 != (i_4_ ^ 0xffffffff))
				    class133_sub7_33_.method1855(0, i_4_, 0);
			    }
			}
		    }
		    if (aClass12_4949.anInt334 == 1)
			class133_sub7.aBoolean3687 = true;
		    class133_sub7.method1792(arg0, arg1, arg2, arg3, arg4,
					     arg5, arg6, arg7, arg8);
		    if (class133_sub7_33_ != null) {
			if (-2 == (aClass12_4949.anInt334 ^ 0xffffffff))
			    class133_sub7_33_.aBoolean3687 = true;
			class133_sub7_33_.method1792(arg0, arg1, arg2, arg3,
						     arg4, arg5, arg6, arg7,
						     arg8);
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1193_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("jf.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ')'));
	} while (false);
    }
}
