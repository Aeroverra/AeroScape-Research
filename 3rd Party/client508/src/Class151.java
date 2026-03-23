/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class151
{
    public static Class13[][] aClass13ArrayArray2427;
    public static Class148_Sub1 aClass148_Sub1_2428;
    public static int anInt2429;
    public static int anInt2430;
    public static Class148_Sub1[] aClass148_Sub1Array2431;
    
    public static void method2026(Class148_Sub1 arg0, int arg1, int arg2,
				  int arg3) {
	if (arg0 != null) {
	    int i = arg1 - (arg2 * Class57.anInt934 >> 8) >> 3;
	    int i_0_ = arg3 - (arg2 * Class57.anInt928 >> 8) >> 3;
	    method2028(arg0, aClass148_Sub1_2428, i + 1, i_0_ + 1);
	}
    }
    
    public static void method2027(byte[] arg0, byte[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	for (int i = -16; i < 0; i++) {
	    for (int i_1_ = -4; i_1_ < 0; i_1_++) {
		arg0[arg3++] += arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += arg1[arg2];
		arg2 += arg5;
	    }
	    arg3 += arg4;
	    arg2 += arg6;
	}
    }
    
    public static void method2028(Class148_Sub1 arg0, Class148_Sub1 arg1,
				  int arg2, int arg3) {
	arg2 += arg0.anInt2375;
	arg3 += arg0.anInt2374;
	int i = arg2 + arg3 * arg1.anInt2371;
	int i_2_ = 0;
	int i_3_ = arg0.anInt2376;
	int i_4_ = arg0.anInt2371;
	int i_5_ = arg1.anInt2371 - i_4_;
	int i_6_ = 0;
	if (arg3 <= 0) {
	    int i_7_ = 1 - arg3;
	    i_3_ -= i_7_;
	    i_2_ += i_7_ * i_4_;
	    i += i_7_ * arg1.anInt2371;
	    arg3 = 1;
	}
	if (arg3 + i_3_ >= arg1.anInt2376) {
	    int i_8_ = arg3 + i_3_ + 1 - arg1.anInt2376;
	    i_3_ -= i_8_;
	}
	if (arg2 <= 0) {
	    int i_9_ = 1 - arg2;
	    i_4_ -= i_9_;
	    i_2_ += i_9_;
	    i += i_9_;
	    i_6_ += i_9_;
	    i_5_ += i_9_;
	    arg2 = 1;
	}
	if (arg2 + i_4_ >= arg1.anInt2371) {
	    int i_10_ = arg2 + i_4_ + 1 - arg1.anInt2371;
	    i_4_ -= i_10_;
	    i_6_ += i_10_;
	    i_5_ += i_10_;
	}
	if (i_4_ > 0 && i_3_ > 0) {
	    method2033(arg1.aByteArray3689, arg0.aByteArray3689, i_2_, i, i_4_,
		       i_3_, i_5_, i_6_);
	    method2034(arg2, arg3, i_4_, i_3_);
	}
    }
    
    public static void method2029(int arg0, int arg1) {
	anInt2429 = arg0 + 7 >> 3;
	anInt2430 = arg1 + 7 >> 3;
	aClass148_Sub1_2428
	    = new Class148_Sub1(anInt2429 * 128 + 2, anInt2430 * 128 + 2, 0);
	aClass13ArrayArray2427 = new Class13[anInt2429][anInt2430];
	for (int i = 0; i < anInt2429; i++) {
	    for (int i_11_ = 0; i_11_ < anInt2430; i_11_++)
		aClass13ArrayArray2427[i][i_11_] = new Class13();
	}
    }
    
    public static void method2030(Class148_Sub1 arg0, int arg1, int arg2,
				  int arg3) {
	if (arg0 != null) {
	    int i = arg1 - (arg2 * Class57.anInt934 >> 8) >> 3;
	    int i_12_ = arg3 - (arg2 * Class57.anInt928 >> 8) >> 3;
	    method2035(arg0, aClass148_Sub1_2428, i + 1, i_12_ + 1);
	}
    }
    
    public static boolean method2031(Class148_Sub1 arg0, Class148_Sub1 arg1,
				     int arg2, int arg3) {
	arg2 += arg0.anInt2375;
	arg3 += arg0.anInt2374;
	int i = arg2 + arg3 * arg1.anInt2371;
	int i_13_ = arg0.anInt2376;
	int i_14_ = arg0.anInt2371;
	int i_15_ = arg1.anInt2371 - i_14_;
	if (arg3 <= 0) {
	    int i_16_ = 1 - arg3;
	    i_13_ -= i_16_;
	    i += i_16_ * arg1.anInt2371;
	    arg3 = 1;
	}
	if (arg3 + i_13_ >= arg1.anInt2376) {
	    int i_17_ = arg3 + i_13_ + 1 - arg1.anInt2376;
	    i_13_ -= i_17_;
	}
	if (arg2 <= 0) {
	    int i_18_ = 1 - arg2;
	    i_14_ -= i_18_;
	    i += i_18_;
	    i_15_ += i_18_;
	    arg2 = 1;
	}
	if (arg2 + i_14_ >= arg1.anInt2371) {
	    int i_19_ = arg2 + i_14_ + 1 - arg1.anInt2371;
	    i_14_ -= i_19_;
	    i_15_ += i_19_;
	}
	if (i_14_ <= 0 || i_13_ <= 0)
	    return false;
	int i_20_ = 8;
	i_15_ += (i_20_ - 1) * arg1.anInt2371;
	method2034(arg2, arg3, i_14_, i_13_);
	return method2039(arg1.aByteArray3689, i, i_14_, i_13_, i_15_, i_20_);
    }
    
    public static boolean method2032(Class148_Sub1 arg0, int arg1, int arg2,
				     int arg3) {
	if (arg0 == null)
	    return false;
	int i = arg1 - (arg2 * Class57.anInt934 >> 8) >> 3;
	int i_21_ = arg3 - (arg2 * Class57.anInt928 >> 8) >> 3;
	return method2031(arg0, aClass148_Sub1_2428, i + 1, i_21_ + 1);
    }
    
    public static void method2033(byte[] arg0, byte[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	int i = -(arg4 >> 2);
	arg4 = -(arg4 & 0x3);
	for (int i_22_ = -arg5; i_22_ < 0; i_22_++) {
	    for (int i_23_ = i; i_23_ < 0; i_23_++) {
		arg0[arg3++] += arg1[arg2++];
		arg0[arg3++] += arg1[arg2++];
		arg0[arg3++] += arg1[arg2++];
		arg0[arg3++] += arg1[arg2++];
	    }
	    for (int i_24_ = arg4; i_24_ < 0; i_24_++)
		arg0[arg3++] += arg1[arg2++];
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public static void method2034(int arg0, int arg1, int arg2, int arg3) {
	int i = arg0 - 1 >> 7;
	int i_25_ = arg0 - 1 + arg2 - 1 >> 7;
	int i_26_ = arg1 - 1 >> 7;
	int i_27_ = arg1 - 1 + arg3 - 1 >> 7;
	for (int i_28_ = i; i_28_ <= i_25_; i_28_++) {
	    for (int i_29_ = i_26_; i_29_ <= i_27_; i_29_++)
		aClass13ArrayArray2427[i_28_][i_29_].aBoolean346 = true;
	}
    }
    
    public static void method2035(Class148_Sub1 arg0, Class148_Sub1 arg1,
				  int arg2, int arg3) {
	arg2 += arg0.anInt2375;
	arg3 += arg0.anInt2374;
	int i = arg2 + arg3 * arg1.anInt2371;
	int i_30_ = 0;
	int i_31_ = arg0.anInt2376;
	int i_32_ = arg0.anInt2371;
	int i_33_ = arg1.anInt2371 - i_32_;
	int i_34_ = 0;
	if (arg3 <= 0) {
	    int i_35_ = 1 - arg3;
	    i_31_ -= i_35_;
	    i_30_ += i_35_ * i_32_;
	    i += i_35_ * arg1.anInt2371;
	    arg3 = 1;
	}
	if (arg3 + i_31_ >= arg1.anInt2376) {
	    int i_36_ = arg3 + i_31_ + 1 - arg1.anInt2376;
	    i_31_ -= i_36_;
	}
	if (arg2 <= 0) {
	    int i_37_ = 1 - arg2;
	    i_32_ -= i_37_;
	    i_30_ += i_37_;
	    i += i_37_;
	    i_34_ += i_37_;
	    i_33_ += i_37_;
	    arg2 = 1;
	}
	if (arg2 + i_32_ >= arg1.anInt2371) {
	    int i_38_ = arg2 + i_32_ + 1 - arg1.anInt2371;
	    i_32_ -= i_38_;
	    i_34_ += i_38_;
	    i_33_ += i_38_;
	}
	if (i_32_ > 0 && i_31_ > 0) {
	    method2041(arg1.aByteArray3689, arg0.aByteArray3689, i_30_, i,
		       i_32_, i_31_, i_33_, i_34_);
	    method2034(arg2, arg3, i_32_, i_31_);
	}
    }
    
    public static void method2036(byte[] arg0, byte[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6) {
	for (int i = -16; i < 0; i++) {
	    for (int i_39_ = -4; i_39_ < 0; i_39_++) {
		arg0[arg3++] += 1 - arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += 1 - arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += 1 - arg1[arg2];
		arg2 += arg5;
		arg0[arg3++] += 1 - arg1[arg2];
		arg2 += arg5;
	    }
	    arg3 += arg4;
	    arg2 += arg6;
	}
    }
    
    public static void method2037(Class148_Sub1 arg0, Class148_Sub1 arg1,
				  int arg2, int arg3, int arg4, boolean arg5) {
	if (arg2 > 0 && arg3 > 0 && arg2 + 16 < arg1.anInt2371
	    && arg3 + 16 < arg1.anInt2376) {
	    int i = arg2 + arg3 * arg1.anInt2371;
	    int i_40_ = arg1.anInt2371 - 16;
	    int i_41_;
	    int i_42_;
	    int i_43_;
	    if (arg4 == 0) {
		i_41_ = 240;
		i_42_ = 1;
		i_43_ = -i_42_ * 16 - 16;
	    } else if (arg4 == 1) {
		i_41_ = 255;
		i_42_ = -16;
		i_43_ = -i_42_ * 16 - 1;
	    } else if (arg4 == 2) {
		i_41_ = 15;
		i_42_ = -1;
		i_43_ = -i_42_ * 16 + 16;
	    } else {
		i_41_ = 0;
		i_42_ = 16;
		i_43_ = -i_42_ * 16 + 1;
	    }
	    if (arg5)
		method2036(arg1.aByteArray3689, arg0.aByteArray3689, i_41_, i,
			   i_40_, i_42_, i_43_);
	    else
		method2027(arg1.aByteArray3689, arg0.aByteArray3689, i_41_, i,
			   i_40_, i_42_, i_43_);
	    method2034(arg2, arg3, 16, 16);
	}
    }
    
    public static void method2038(int arg0, int arg1, int arg2, int arg3,
				  boolean[][] arg4, int[][] arg5) {
	GL gl = Class121.aGL2030;
	Class121.method1638(1);
	Class121.method1656(1);
	Class121.method1651();
	Class121.method1639(false);
	Class132.method1778(0, (byte) 121, 0);
	gl.glDepthMask(false);
	for (int i = 0; i < anInt2429; i++) {
	    for (int i_44_ = 0; i_44_ < anInt2430; i_44_++) {
	    while_1319_:
		for (int i_45_ = i * 8; i_45_ < i * 8 + 8; i_45_++) {
		    if (i_45_ - arg0 >= -arg2 && i_45_ - arg0 <= arg2) {
			for (int i_46_ = i_44_ * 8; i_46_ < i_44_ * 8 + 8;
			     i_46_++) {
			    if (i_46_ - arg1 >= -arg2 && i_46_ - arg1 <= arg2
				&& (arg4[i_45_ - arg0 + arg2]
				    [i_46_ - arg1 + arg2])) {
				Class13 class13
				    = aClass13ArrayArray2427[i][i_44_];
				if (class13.aBoolean346) {
				    class13.method226(aClass148_Sub1_2428, i,
						      i_44_);
				    class13.aBoolean346 = false;
				}
				gl.glPushMatrix();
				gl.glTranslatef((float) (i * 1024), 0.0F,
						(float) (i_44_ * 1024));
				class13.method228();
				gl.glPopMatrix();
				break while_1319_;
			    }
			}
		    }
		}
	    }
	}
	gl.glEnableClientState(32886);
	gl.glDepthMask(true);
	Class121.method1645();
    }
    
    public static boolean method2039(byte[] arg0, int arg1, int arg2, int arg3,
				     int arg4, int arg5) {
	int i = arg2 % arg5;
	int i_47_;
	if (i != 0)
	    i_47_ = arg5 - i;
	else
	    i_47_ = 0;
	int i_48_ = -((arg3 + arg5 - 1) / arg5);
	int i_49_ = -((arg2 + arg5 - 1) / arg5);
	for (int i_50_ = i_48_; i_50_ < 0; i_50_++) {
	    for (int i_51_ = i_49_; i_51_ < 0; i_51_++) {
		if (arg0[arg1] == 0)
		    return true;
		arg1 += arg5;
	    }
	    arg1 -= i_47_;
	    if (arg0[arg1 - 1] == 0)
		return true;
	    arg1 += arg4;
	}
	return false;
    }
    
    public static void method2040() {
	aClass148_Sub1_2428 = null;
	aClass148_Sub1Array2431 = null;
	aClass13ArrayArray2427 = null;
    }
    
    public static void method2041(byte[] arg0, byte[] arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, int arg7) {
	int i = -(arg4 >> 2);
	arg4 = -(arg4 & 0x3);
	for (int i_52_ = -arg5; i_52_ < 0; i_52_++) {
	    for (int i_53_ = i; i_53_ < 0; i_53_++) {
		arg0[arg3++] -= arg1[arg2++];
		arg0[arg3++] -= arg1[arg2++];
		arg0[arg3++] -= arg1[arg2++];
		arg0[arg3++] -= arg1[arg2++];
	    }
	    for (int i_54_ = arg4; i_54_ < 0; i_54_++)
		arg0[arg3++] -= arg1[arg2++];
	    arg3 += arg6;
	    arg2 += arg7;
	}
    }
    
    public static void method2042(int arg0, int arg1, boolean arg2,
				  boolean arg3, int arg4, int arg5, int arg6,
				  int arg7, int arg8, int arg9) {
	if ((!arg2 || !arg3) && (!arg2 || arg0 != 1) && (!arg3 || arg0 != 0)) {
	    int i = arg4 << 7;
	    int i_55_ = arg6 + arg7 + arg8 + arg9 >> 2;
	    int i_56_ = arg5 << 7;
	    int i_57_ = i - (i_55_ * Class57.anInt934 >> 8) >> 3;
	    int i_58_ = i_56_ - (i_55_ * Class57.anInt928 >> 8) >> 3;
	    if (arg0 == 0 || arg0 == 1 || !arg2 && !arg3)
		method2028(aClass148_Sub1Array2431[1], aClass148_Sub1_2428,
			   i_57_ + 1, i_58_ + 1);
	    else
		method2037(aClass148_Sub1Array2431[arg0], aClass148_Sub1_2428,
			   i_57_ + 1, i_58_ + 1, arg1, arg2);
	}
    }
}
