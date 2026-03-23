/* Class14_Sub2_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class14_Sub2_Sub18 extends Class14_Sub2
{
    public static int[] anIntArray4023;
    public static Class124[] aClass124Array4024 = new Class124[100];
    public static int anInt4025;
    public static Class124 aClass124_4026
	= Class14_Sub2_Sub2.method263(1178, "::tele ");
    public static int anInt4027;
    public static int anInt4028;
    public static volatile long aLong4029 = 0L;
    
    public abstract Object method377(boolean bool);
    
    public static void method378(byte arg0) {
	try {
	    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method845(true);
	    int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			.method842(arg0 + 51, 8);
	    if ((i ^ 0xffffffff)
		> (Class14_Sub8_Sub13.anInt4306 ^ 0xffffffff)) {
		for (int i_0_ = i; ((Class14_Sub8_Sub13.anInt4306 ^ 0xffffffff)
				    < (i_0_ ^ 0xffffffff)); i_0_++)
		    Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++]
			= Class14_Sub2_Sub15.anIntArray3965[i_0_];
	    }
	    anInt4025++;
	    if ((Class14_Sub8_Sub13.anInt4306 ^ 0xffffffff) > (i ^ 0xffffffff))
		throw new RuntimeException("gnpov1");
	    if (arg0 != -51)
		method380(99, null, null, false);
	    Class14_Sub8_Sub13.anInt4306 = 0;
	    for (int i_1_ = 0; i_1_ < i; i_1_++) {
		int i_2_ = Class14_Sub2_Sub15.anIntArray3965[i_1_];
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_2_];
		int i_3_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		if (-1 == (i_3_ ^ 0xffffffff)) {
		    Class14_Sub2_Sub15.anIntArray3965
			[Class14_Sub8_Sub13.anInt4306++]
			= i_2_;
		    class133_sub1_sub2.anInt3447
			= Class14_Sub2_Sub20.anInt4064;
		} else {
		    int i_4_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				   .method842(0, 2);
		    if (i_4_ == 0) {
			Class14_Sub2_Sub15.anIntArray3965
			    [Class14_Sub8_Sub13.anInt4306++]
			    = i_2_;
			class133_sub1_sub2.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++]
			    = i_2_;
		    } else if (i_4_ == 1) {
			Class14_Sub2_Sub15.anIntArray3965
			    [Class14_Sub8_Sub13.anInt4306++]
			    = i_2_;
			class133_sub1_sub2.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			int i_5_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(0, 3);
			class133_sub1_sub2.method1799(false, (byte) -84, i_5_);
			int i_6_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(arg0 + 51, 1);
			if ((i_6_ ^ 0xffffffff) == -2)
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= i_2_;
		    } else if (2 == i_4_) {
			Class14_Sub2_Sub15.anIntArray3965
			    [Class14_Sub8_Sub13.anInt4306++]
			    = i_2_;
			class133_sub1_sub2.anInt3447
			    = Class14_Sub2_Sub20.anInt4064;
			int i_7_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(0, 3);
			class133_sub1_sub2.method1799(true, (byte) 84, i_7_);
			int i_8_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(0, 3);
			class133_sub1_sub2.method1799(true, (byte) 106, i_8_);
			int i_9_ = Class14_Sub8_Sub38
				       .aClass14_Sub10_Sub1_4734
				       .method842(arg0 + 51, 1);
			if (i_9_ == 1)
			    Class14_Sub2_Sub7.anIntArray3825
				[Class64.anInt1012++]
				= i_2_;
		    } else if (i_4_ == 3)
			Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++]
			    = i_2_;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sd.K(" + arg0 + ')');
	}
    }
    
    public abstract boolean method379(byte i);
    
    public static void method380(int arg0, Class124 arg1, Class124 arg2,
				 boolean arg3) {
    while_216_:
	do {
	while_215_:
	    do {
		do {
		    try {
			Class14_Sub8_Sub9.aClass124_4242 = arg1;
			Class14_Sub8_Sub30.anInt4598 = 0;
			Class75.anInt1163 = arg0;
			if (arg3 != true)
			    method380(-127, null, null, true);
			anInt4028++;
			Class89.aBoolean1416 = false;
			Class14_Sub8_Sub9.aClass124_4241 = arg2;
			if (!(Class14_Sub8_Sub9.aClass124_4241.method1704
			      (Class14_Sub8_Sub9.aClass124_4244, (byte) 88))
			    && !(Class14_Sub8_Sub9.aClass124_4242.method1704
				 (Class14_Sub8_Sub9.aClass124_4244,
				  (byte) 67)))
			    break;
			Class142.anInt2315 = 0;
			Class14_Sub8_Sub26.anInt4525 = 3;
		    } catch (RuntimeException runtimeexception) {
			break while_215_;
		    }
		    return;
		} while (false);
		try {
		    Class142.anInt2315 = 1;
		    Class14_Sub20.anInt3087 = 0;
		    Class14_Sub8_Sub26.anInt4525 = -3;
		    Class7.anInt179 = 0;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_216_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("sd.J(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	} while (false);
    }
    
    public static void method381(int arg0) {
	try {
	    aClass124Array4024 = null;
	    anIntArray4023 = null;
	    if (arg0 >= -35)
		method382((byte) -123);
	    aClass124_4026 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "sd.H(" + arg0 + ')');
	}
    }
    
    public static void method382(byte arg0) {
    while_218_:
	do {
	while_217_:
	    do {
		do {
		    try {
			if (arg0 >= 115)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_217_;
		    }
		    return;
		} while (false);
		try {
		    anInt4027++;
		    int i = Class133_Sub3.aClass14_Sub2_Sub16_3567
				.method361(Class64.aClass124_1011);
		    for (int i_10_ = 0; i_10_ < Class14_Sub8_Sub38.anInt4729;
			 i_10_++) {
			int i_11_
			    = (Class133_Sub3.aClass14_Sub2_Sub16_3567.method361
			       (Class46.method1170((byte) -99, i_10_)));
			if (i_11_ > i)
			    i = i_11_;
		    }
		    i += 8;
		    int i_12_ = 21 + Class14_Sub8_Sub38.anInt4729 * 15;
		    int i_13_ = -(i / 2) + Class14_Sub8_Sub33.anInt4629;
		    if (i + i_13_ > Class83.anInt1340)
			i_13_ = Class83.anInt1340 - i;
		    if (i_13_ < 0)
			i_13_ = 0;
		    int i_14_ = Class14_Sub8_Sub32.anInt4613;
		    if ((i_12_ + i_14_ ^ 0xffffffff)
			< (Class14_Sub20.anInt3094 ^ 0xffffffff))
			i_14_ = Class14_Sub20.anInt3094 + -i_12_;
		    if ((i_14_ ^ 0xffffffff) > -1)
			i_14_ = 0;
		    if (Class14_Sub8_Sub31.anInt4608 != 1) {
			if (((Class125_Sub1.anInt3367 ^ 0xffffffff)
			     == (Class14_Sub8_Sub33.anInt4629 ^ 0xffffffff))
			    && ((Class14_Sub8_Sub32.anInt4613 ^ 0xffffffff)
				== (Class139.anInt2230 ^ 0xffffffff))) {
			    Class14_Sub14.anInt2984 = i;
			    Class14_Sub8_Sub27.anInt4550
				= 22 + Class14_Sub8_Sub38.anInt4729 * 15;
			    Class14_Sub8_Sub31.anInt4608 = 0;
			    Class133_Sub5.aBoolean3628 = true;
			    Class14_Sub2_Sub8.anInt3832 = i_14_;
			    Class26.anInt500 = i_13_;
			} else {
			    Class14_Sub8_Sub31.anInt4608 = 1;
			    Class26_Sub2.anInt3299 = Class125_Sub1.anInt3367;
			    Class95.anInt1622 = Class139.anInt2230;
			}
		    } else if ((Class26_Sub2.anInt3299
				== Class14_Sub8_Sub33.anInt4629)
			       && (Class14_Sub8_Sub32.anInt4613
				   == Class95.anInt1622)) {
			Class14_Sub8_Sub31.anInt4608 = 0;
			Class14_Sub8_Sub27.anInt4550
			    = Class14_Sub8_Sub38.anInt4729 * 15 + 22;
			Class14_Sub14.anInt2984 = i;
			Class133_Sub5.aBoolean3628 = true;
			Class14_Sub2_Sub8.anInt3832 = i_14_;
			Class26.anInt500 = i_13_;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_218_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "sd.I(" + arg0 + ')');
	} while (false);
    }
}
