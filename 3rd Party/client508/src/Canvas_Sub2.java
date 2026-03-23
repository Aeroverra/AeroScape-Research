/* Canvas_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.event.FocusListener;

import javax.media.opengl.GL;

public abstract class Canvas_Sub2 extends Canvas implements FocusListener
{
    public static int anInt54 = 0;
    public static int anInt55;
    public static int anInt56;
    public static int anInt57;
    public static int anInt58;
    public static int anInt59;
    public static int anInt60;
    public static int anInt61;
    public static int[] anIntArray62
	= { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81,
	    82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104,
	    105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16,
	    17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68,
	    66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49,
	    36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233,
	    224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4,
	    5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
	    -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    public static int anInt63;
    public static int anInt64;
    public static int[] anIntArray65 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };
    public static int anInt66;
    
    public static void method61(int arg0, int arg1, int arg2, int arg3,
				Class133 arg4, long arg5, Class133 arg6,
				Class133 arg7) {
	Class115 class115 = new Class115();
	class115.aClass133_1919 = arg4;
	class115.anInt1913 = arg1 * 128 + 64;
	class115.anInt1925 = arg2 * 128 + 64;
	class115.anInt1911 = arg3;
	class115.aLong1915 = arg5;
	class115.aClass133_1926 = arg6;
	class115.aClass133_1921 = arg7;
	int i = 0;
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 != null) {
	    for (int i_0_ = 0; i_0_ < class14_sub29.anInt3242; i_0_++) {
		Class40 class40 = class14_sub29.aClass40Array3257[i_0_];
		if ((class40.aLong677 & 0x400000L) == 4194304L) {
		    int i_1_ = class40.aClass133_679.method1781();
		    if (i_1_ != -32768 && i_1_ < i)
			i = i_1_;
		}
	    }
	}
	class115.anInt1914 = -i;
	if (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1][arg2]
	    == null)
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1][arg2]
		= new Class14_Sub29(arg0, arg1, arg2);
	Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1][arg2]
	    .aClass115_3256
	    = class115;
    }
    
    public static float[] method62(float[] arg0, boolean arg1) {
    while_20_:
	do {
	    do {
		float[] fs;
		try {
		    if (!arg1)
			break;
		    fs = null;
		} catch (RuntimeException runtimeexception) {
		    break while_20_;
		}
		return fs;
	    } while (false);
	    do {
		float[] fs;
		try {
		    anInt59++;
		    if (null != arg0)
			break;
		    fs = null;
		} catch (RuntimeException runtimeexception) {
		    break while_20_;
		}
		return fs;
	    } while (false);
	    float[] fs;
	    try {
		float[] fs_2_ = new float[arg0.length];
		Class72.method1323(arg0, 0, fs_2_, 0, arg0.length);
		fs = fs_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return fs;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("jd.B("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ')'));
    }
    
    public static void method63(byte arg0) {
	try {
	    while (-28
		   >= ((Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method840
			(Class14_Sub8_Sub12.anInt4280, (byte) -103))
		       ^ 0xffffffff)) {
		int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
			    .method842(0, 15);
		if (-32768 == (i ^ 0xffffffff))
		    break;
		boolean bool = false;
		if (null == Class14_Sub4.aClass133_Sub1_Sub2Array2785[i]) {
		    Class14_Sub4.aClass133_Sub1_Sub2Array2785[i]
			= new Class133_Sub1_Sub2();
		    bool = true;
		}
		Class133_Sub1_Sub2 class133_sub1_sub2
		    = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i];
		Class14_Sub2_Sub15.anIntArray3965
		    [Class14_Sub8_Sub13.anInt4306++]
		    = i;
		class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
		class133_sub1_sub2.aClass12_4949
		    = Class126.method1744(Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method842(0, 14),
					  170);
		int i_3_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		if (1 == i_3_)
		    Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i;
		int i_4_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    5);
		if (15 < i_4_)
		    i_4_ -= 32;
		int i_5_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    5);
		if ((i_5_ ^ 0xffffffff) < -16)
		    i_5_ -= 32;
		int i_6_ = (Class133.anIntArray2179
			    [Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				 .method842(0, 3)]);
		if (bool)
		    class133_sub1_sub2.anInt3469
			= class133_sub1_sub2.anInt3461 = i_6_;
		int i_7_
		    = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method842(0,
									    1);
		class133_sub1_sub2.anInt3457
		    = class133_sub1_sub2.aClass12_4949.anInt296;
		class133_sub1_sub2.anInt3433
		    = class133_sub1_sub2.aClass12_4949.anInt323;
		class133_sub1_sub2.anInt3463
		    = class133_sub1_sub2.aClass12_4949.anInt276;
		class133_sub1_sub2.anInt3493
		    = class133_sub1_sub2.aClass12_4949.anInt334;
		class133_sub1_sub2.anInt3484
		    = class133_sub1_sub2.aClass12_4949.anInt284;
		class133_sub1_sub2.anInt3454
		    = class133_sub1_sub2.aClass12_4949.anInt318;
		class133_sub1_sub2.anInt3492
		    = class133_sub1_sub2.aClass12_4949.anInt303;
		class133_sub1_sub2.anInt3432
		    = class133_sub1_sub2.aClass12_4949.anInt339;
		if (class133_sub1_sub2.anInt3492 == 0)
		    class133_sub1_sub2.anInt3461 = 0;
		class133_sub1_sub2.anInt3471
		    = class133_sub1_sub2.aClass12_4949.anInt286;
		class133_sub1_sub2.method1800((byte) -79,
					      i_4_ + (Class14_Sub3
						      .aClass133_Sub1_Sub1_2748
						      .anIntArray3443[0]),
					      (i_7_ ^ 0xffffffff) == -2,
					      (Class14_Sub3
					       .aClass133_Sub1_Sub1_2748
					       .anIntArray3476[0]) + i_5_);
		if (class133_sub1_sub2.aClass12_4949.method212((byte) -128))
		    Class12.method213(class133_sub1_sub2.anIntArray3476[0],
				      class133_sub1_sub2.anIntArray3443[0],
				      null, (byte) -35,
				      Class14_Sub2_Sub3.anInt3785, null,
				      class133_sub1_sub2, 0);
	    }
	    Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method848((byte) -99);
	    anInt56++;
	    if (arg0 > -95)
		method63((byte) 49);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jd.A(" + arg0 + ')');
	}
    }
    
    public static void method64(byte arg0) {
	try {
	    anInt64++;
	    for (Class14_Sub2_Sub10 class14_sub2_sub10
		     = (Class14_Sub2_Sub10) Class4.aClass2_127.method77(0);
		 class14_sub2_sub10 != null;
		 class14_sub2_sub10
		     = ((Class14_Sub2_Sub10)
			Class4.aClass2_127.method84(arg0 + -164))) {
		Class133_Sub6 class133_sub6
		    = class14_sub2_sub10.aClass133_Sub6_3870;
		if (((Class14_Sub2_Sub3.anInt3785 ^ 0xffffffff)
		     != (class133_sub6.anInt3655 ^ 0xffffffff))
		    || ((class133_sub6.anInt3644 ^ 0xffffffff)
			> (Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)))
		    class14_sub2_sub10.method233(0);
		else if ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
			 <= (class133_sub6.anInt3679 ^ 0xffffffff)) {
		    if (-1 > (class133_sub6.anInt3669 ^ 0xffffffff)) {
			Class133_Sub1_Sub2 class133_sub1_sub2
			    = (Class14_Sub4.aClass133_Sub1_Sub2Array2785
			       [-1 + class133_sub6.anInt3669]);
			if (class133_sub1_sub2 != null
			    && ((class133_sub1_sub2.anInt3495 ^ 0xffffffff)
				<= -1)
			    && 13312 > class133_sub1_sub2.anInt3495
			    && ((class133_sub1_sub2.anInt3436 ^ 0xffffffff)
				<= -1)
			    && -13313 < (class133_sub1_sub2.anInt3436
					 ^ 0xffffffff))
			    class133_sub6.method1849
				(Class14_Sub2_Sub20.anInt4064, (byte) -122,
				 class133_sub1_sub2.anInt3495,
				 class133_sub1_sub2.anInt3436,
				 (Class26.method1017((class133_sub1_sub2
						      .anInt3495),
						     class133_sub6.anInt3655,
						     (byte) 6,
						     (class133_sub1_sub2
						      .anInt3436))
				  - class133_sub6.anInt3667));
		    }
		    if (0 > class133_sub6.anInt3669) {
			int i = -1 + -class133_sub6.anInt3669;
			Class133_Sub1_Sub1 class133_sub1_sub1;
			if ((i ^ 0xffffffff)
			    == (Class14_Sub2_Sub10.anInt3868 ^ 0xffffffff))
			    class133_sub1_sub1
				= Class14_Sub3.aClass133_Sub1_Sub1_2748;
			else
			    class133_sub1_sub1
				= (Class14_Sub8_Sub23
				   .aClass133_Sub1_Sub1Array4474[i]);
			if (null != class133_sub1_sub1
			    && -1 >= (class133_sub1_sub1.anInt3495
				      ^ 0xffffffff)
			    && 13312 > class133_sub1_sub1.anInt3495
			    && -1 >= (class133_sub1_sub1.anInt3436
				      ^ 0xffffffff)
			    && ((class133_sub1_sub1.anInt3436 ^ 0xffffffff)
				> -13313))
			    class133_sub6.method1849
				(Class14_Sub2_Sub20.anInt4064, (byte) -122,
				 class133_sub1_sub1.anInt3495,
				 class133_sub1_sub1.anInt3436,
				 (Class26.method1017((class133_sub1_sub1
						      .anInt3495),
						     class133_sub6.anInt3655,
						     (byte) 21,
						     (class133_sub1_sub1
						      .anInt3436))
				  + -class133_sub6.anInt3667));
		    }
		    class133_sub6.method1851(-95, Class51.anInt839);
		    Class14_Sub8_Sub8.method519
			(Class14_Sub2_Sub3.anInt3785,
			 (int) class133_sub6.aDouble3678,
			 (int) class133_sub6.aDouble3646,
			 (int) class133_sub6.aDouble3633, 60, class133_sub6,
			 class133_sub6.anInt3665, -1L, false);
		}
	    }
	    if (arg0 != 89)
		method67(-82, -8, 63, null, -103, (byte) 13, 37, -117);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jd.G(" + arg0 + ')');
	}
    }
    
    public static void method65(byte arg0) {
	try {
	    anIntArray65 = null;
	    if (arg0 != -7)
		anIntArray62 = null;
	    anIntArray62 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "jd.E(" + arg0 + ')');
	}
    }
    
    public static void method66(boolean arg0) {
    while_22_:
	do {
	while_21_:
	    do {
		do {
		    try {
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_21_;
		    }
		    return;
		} while (false);
		try {
		    anInt57++;
		    if ((Class43.aString721.toLowerCase().indexOf("microsoft")
			 ^ 0xffffffff)
			!= 0) {
			anIntArray62[223] = 28;
			anIntArray62[190] = 72;
			anIntArray62[220] = 74;
			anIntArray62[221] = 43;
			anIntArray62[186] = 57;
			anIntArray62[188] = 71;
			anIntArray62[219] = 42;
			anIntArray62[189] = 26;
			anIntArray62[192] = 58;
			anIntArray62[187] = 27;
			anIntArray62[191] = 73;
			anIntArray62[222] = 59;
		    } else {
			anIntArray62[45] = 26;
			anIntArray62[46] = 72;
			anIntArray62[47] = 73;
			anIntArray62[92] = 74;
			anIntArray62[93] = 43;
			anIntArray62[91] = 42;
			anIntArray62[59] = 57;
			anIntArray62[44] = 71;
			anIntArray62[61] = 27;
			if (Class43.aMethod707 == null) {
			    anIntArray62[222] = 59;
			    anIntArray62[192] = 58;
			} else {
			    anIntArray62[222] = 58;
			    anIntArray62[192] = 28;
			    anIntArray62[520] = 59;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_22_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "jd.D(" + arg0 + ')');
	} while (false);
    }
    
    public static void method67(int arg0, int arg1, int arg2, byte[][][] arg3,
				int arg4, byte arg5, int arg6, int arg7) {
	Class67.anInt1059++;
	Class107.anInt1806 = 0;
	int i = arg6 - 16;
	int i_8_ = arg6 + 16;
	int i_9_ = arg7 - 16;
	int i_10_ = arg7 + 16;
	for (int i_11_ = Class14_Sub23.anInt3134; i_11_ < Class83.anInt1338;
	     i_11_++) {
	    Class14_Sub29[][] class14_sub29s
		= Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_11_];
	    for (int i_12_ = Class7_Sub1.anInt2659;
		 i_12_ < Class14_Sub8_Sub37.anInt4722; i_12_++) {
		for (int i_13_ = Class14_Sub9_Sub3.anInt4849;
		     i_13_ < Class14_Sub8_Sub26.anInt4526; i_13_++) {
		    Class14_Sub29 class14_sub29 = class14_sub29s[i_12_][i_13_];
		    if (class14_sub29 != null) {
			if (!(Class53.aBooleanArrayArray873
			      [i_12_ - Class71.anInt1101 + Class73.anInt1108]
			      [i_13_ - Class102.anInt1724 + Class73.anInt1108])
			    || (arg3 != null && i_11_ >= arg4
				&& arg3[i_11_][i_12_][i_13_] == arg5)) {
			    class14_sub29.aBoolean3235 = false;
			    class14_sub29.aBoolean3240 = false;
			    class14_sub29.anInt3231 = 0;
			    if (i_12_ >= i && i_12_ <= i_8_ && i_13_ >= i_9_
				&& i_13_ <= i_10_) {
				if (class14_sub29.aClass113_3250 != null) {
				    Class113 class113
					= class14_sub29.aClass113_3250;
				    class113.aClass133_1877.method1790
					(class113.anInt1886,
					 class113.anInt1886,
					 class113.anInt1878,
					 class113.anInt1878, 124);
				    if (class113.aClass133_1884 != null)
					class113.aClass133_1884.method1790
					    (class113.anInt1886,
					     class113.anInt1886,
					     class113.anInt1878,
					     class113.anInt1878, -123);
				}
				if (class14_sub29.aClass37_3255 != null) {
				    Class37 class37
					= class14_sub29.aClass37_3255;
				    class37.aClass133_642.method1790
					(class37.anInt633, class37.anInt633,
					 class37.anInt653, class37.anInt653,
					 -1);
				    if (class37.aClass133_638 != null)
					class37.aClass133_638.method1790
					    (class37.anInt633,
					     class37.anInt633,
					     class37.anInt653,
					     class37.anInt653, -119);
				}
				if (class14_sub29.aClass4_3237 != null) {
				    Class4 class4 = class14_sub29.aClass4_3237;
				    class4.aClass133_124.method1790
					(class4.anInt122, class4.anInt122,
					 class4.anInt136, class4.anInt136,
					 -123);
				}
				if (class14_sub29.aClass40Array3257 != null) {
				    for (int i_14_ = 0;
					 i_14_ < class14_sub29.anInt3242;
					 i_14_++) {
					Class40 class40
					    = (class14_sub29.aClass40Array3257
					       [i_14_]);
					class40.aClass133_679.method1790
					    (class40.anInt678,
					     class40.anInt669,
					     class40.anInt670,
					     class40.anInt668, 69);
				    }
				}
			    }
			} else {
			    class14_sub29.aBoolean3235 = true;
			    class14_sub29.aBoolean3240 = true;
			    if (class14_sub29.anInt3242 > 0)
				class14_sub29.aBoolean3251 = true;
			    else
				class14_sub29.aBoolean3251 = false;
			    Class107.anInt1806++;
			}
		    }
		}
	    }
	}
	boolean bool = (Class114.anIntArrayArrayArray1896
			== Class150.anIntArrayArrayArray2419);
	GL gl = Class121.aGL2030;
	gl.glPushMatrix();
	gl.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
	if (bool) {
	    Class83.method1409();
	    Class132.method1778(3, (byte) 121, -1);
	    Class14_Sub30.aBoolean3269 = true;
	    Class8.method142();
	    Class7_Sub1.anInt2653 = -1;
	    Class14_Sub8_Sub35.anInt4675 = -1;
	    for (int i_15_ = 0;
		 i_15_ < (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464
			  [0]).length;
		 i_15_++) {
		Class14_Sub27 class14_sub27
		    = (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[0]
		       [i_15_]);
		float f = 251.5F - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F);
		if (class14_sub27.anInt3190 != Class7_Sub1.anInt2653) {
		    Class7_Sub1.anInt2653 = class14_sub27.anInt3190;
		    Class68.method1304(54, class14_sub27.anInt3190);
		    Class57.method1246(Class115.method1590(false));
		}
		class14_sub27.method922((Class125_Sub1
					 .aClass14_Sub29ArrayArrayArray3368),
					f, false);
	    }
	    Class8.method143();
	} else {
	    for (int i_16_ = Class14_Sub23.anInt3134;
		 i_16_ < Class83.anInt1338; i_16_++) {
		for (int i_17_ = 0;
		     i_17_ < (RuntimeException_Sub1
			      .aClass14_Sub27ArrayArray2464[i_16_]).length;
		     i_17_++) {
		    Class14_Sub27 class14_sub27
			= (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464
			   [i_16_][i_17_]);
		    float f = (201.5F - 50.0F * (float) i_16_
			       - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F));
		    if (class14_sub27.anInt3204 != -1
			&& Class3.anInterface3_117
			       .method12(true, class14_sub27.anInt3204) == 4
			&& Class15.aBoolean374)
			Class68.method1304(7, class14_sub27.anInt3190);
		    class14_sub27.method922
			(Class125_Sub1.aClass14_Sub29ArrayArrayArray3368, f,
			 false);
		}
		if (i_16_ == 0 && Class89.anInt1413 > 0) {
		    Class121.method1640(101.5F);
		    Class151.method2038(Class71.anInt1101, Class102.anInt1724,
					Class73.anInt1108, arg1,
					Class53.aBooleanArrayArray873,
					Class114.anIntArrayArrayArray1896[0]);
		}
	    }
	    Class10.method195(Class71.anInt1101, Class102.anInt1724,
			      Class125_Sub1.aClass14_Sub29ArrayArrayArray3368);
	}
	gl.glPopMatrix();
	for (int i_18_ = Class14_Sub23.anInt3134; i_18_ < Class83.anInt1338;
	     i_18_++) {
	    Class14_Sub29[][] class14_sub29s
		= Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_18_];
	    for (int i_19_ = -Class73.anInt1108; i_19_ <= 0; i_19_++) {
		int i_20_ = Class71.anInt1101 + i_19_;
		int i_21_ = Class71.anInt1101 - i_19_;
		if (i_20_ >= Class7_Sub1.anInt2659
		    || i_21_ < Class14_Sub8_Sub37.anInt4722) {
		    for (int i_22_ = -Class73.anInt1108; i_22_ <= 0; i_22_++) {
			int i_23_ = Class102.anInt1724 + i_22_;
			int i_24_ = Class102.anInt1724 - i_22_;
			if (i_20_ >= Class7_Sub1.anInt2659) {
			    if (i_23_ >= Class14_Sub9_Sub3.anInt4849) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_20_][i_23_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   true);
			    }
			    if (i_24_ < Class14_Sub8_Sub26.anInt4526) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_20_][i_24_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   true);
			    }
			}
			if (i_21_ < Class14_Sub8_Sub37.anInt4722) {
			    if (i_23_ >= Class14_Sub9_Sub3.anInt4849) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_21_][i_23_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   true);
			    }
			    if (i_24_ < Class14_Sub8_Sub26.anInt4526) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_21_][i_24_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   true);
			    }
			}
			if (Class107.anInt1806 == 0) {
			    if (!bool)
				Class142.aBoolean2299 = false;
			    return;
			}
		    }
		}
	    }
	}
	for (int i_25_ = Class14_Sub23.anInt3134; i_25_ < Class83.anInt1338;
	     i_25_++) {
	    Class14_Sub29[][] class14_sub29s
		= Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_25_];
	    for (int i_26_ = -Class73.anInt1108; i_26_ <= 0; i_26_++) {
		int i_27_ = Class71.anInt1101 + i_26_;
		int i_28_ = Class71.anInt1101 - i_26_;
		if (i_27_ >= Class7_Sub1.anInt2659
		    || i_28_ < Class14_Sub8_Sub37.anInt4722) {
		    for (int i_29_ = -Class73.anInt1108; i_29_ <= 0; i_29_++) {
			int i_30_ = Class102.anInt1724 + i_29_;
			int i_31_ = Class102.anInt1724 - i_29_;
			if (i_27_ >= Class7_Sub1.anInt2659) {
			    if (i_30_ >= Class14_Sub9_Sub3.anInt4849) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_27_][i_30_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   false);
			    }
			    if (i_31_ < Class14_Sub8_Sub26.anInt4526) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_27_][i_31_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   false);
			    }
			}
			if (i_28_ < Class14_Sub8_Sub37.anInt4722) {
			    if (i_30_ >= Class14_Sub9_Sub3.anInt4849) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_28_][i_30_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   false);
			    }
			    if (i_31_ < Class14_Sub8_Sub26.anInt4526) {
				Class14_Sub29 class14_sub29
				    = class14_sub29s[i_28_][i_31_];
				if (class14_sub29 != null
				    && class14_sub29.aBoolean3235)
				    Class14_Sub4.method454(class14_sub29,
							   false);
			    }
			}
			if (Class107.anInt1806 == 0) {
			    if (!bool)
				Class142.aBoolean2299 = false;
			    return;
			}
		    }
		}
	    }
	}
	Class142.aBoolean2299 = false;
    }
    
    public static int method68(int arg0, int arg1) {
    while_23_:
	do {
	    do {
		int i;
		try {
		    if (arg1 == -1)
			break;
		    i = -123;
		} catch (RuntimeException runtimeexception) {
		    break while_23_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt61++;
		i = arg0 >>> -1641167990;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "jd.H(" + arg0 + ',' + arg1 + ')');
    }
    
    public static int method69(int arg0, int arg1) {
	int i;
	try {
	    i = arg0 ^ arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("jd.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    static {
	anInt63 = 0;
    }
}
