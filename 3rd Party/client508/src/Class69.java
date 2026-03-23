/* Class69 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class69
{
    public static float aFloat1066;
    public static Class124 aClass124_1067;
    public static Class124 aClass124_1068;
    public static long aLong1069 = 0L;
    public static Class90 aClass90_1070;
    public static int anInt1071;
    public static int anInt1072;
    public static int anInt1073;
    public static int anInt1074;
    
    public static void method1308(int arg0, byte arg1) {
	try {
	    anInt1074++;
	    Class73.anInt1132 = 0;
	    Class14_Sub2_Sub11.anInt3889 = 1;
	    Class38.anInt2624 = -1;
	    Class14_Sub2_Sub13.anInt3930 = -1;
	    Class35.aBoolean593 = false;
	    if (arg1 > -7)
		method1311((byte) -37);
	    Class14_Sub15.anInt2989 = arg0;
	    Class9_Sub1.aClass9_2696 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ja.A(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method1309(int arg0) {
	try {
	    aClass124_1068 = null;
	    aClass90_1070 = null;
	    if (arg0 != 21954)
		method1309(54);
	    aClass124_1067 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ja.B(" + arg0 + ')');
	}
    }
    
    public static boolean method1310(int arg0, int arg1, int arg2) {
	for (int i = 0; i < Class133_Sub6.anInt3634; i++) {
	    Class85 class85 = Class14_Sub20.aClass85Array3092[i];
	    if (class85.anInt1376 == 1) {
		int i_0_ = class85.anInt1353 - arg0;
		if (i_0_ > 0) {
		    int i_1_
			= class85.anInt1359 + (class85.anInt1360 * i_0_ >> 8);
		    int i_2_
			= class85.anInt1366 + (class85.anInt1354 * i_0_ >> 8);
		    int i_3_
			= class85.anInt1368 + (class85.anInt1371 * i_0_ >> 8);
		    int i_4_
			= class85.anInt1358 + (class85.anInt1367 * i_0_ >> 8);
		    if (arg2 >= i_1_ && arg2 <= i_2_ && arg1 >= i_3_
			&& arg1 <= i_4_)
			return true;
		}
	    } else if (class85.anInt1376 == 2) {
		int i_5_ = arg0 - class85.anInt1353;
		if (i_5_ > 0) {
		    int i_6_
			= class85.anInt1359 + (class85.anInt1360 * i_5_ >> 8);
		    int i_7_
			= class85.anInt1366 + (class85.anInt1354 * i_5_ >> 8);
		    int i_8_
			= class85.anInt1368 + (class85.anInt1371 * i_5_ >> 8);
		    int i_9_
			= class85.anInt1358 + (class85.anInt1367 * i_5_ >> 8);
		    if (arg2 >= i_6_ && arg2 <= i_7_ && arg1 >= i_8_
			&& arg1 <= i_9_)
			return true;
		}
	    } else if (class85.anInt1376 == 3) {
		int i_10_ = class85.anInt1359 - arg2;
		if (i_10_ > 0) {
		    int i_11_
			= class85.anInt1353 + (class85.anInt1356 * i_10_ >> 8);
		    int i_12_
			= class85.anInt1361 + (class85.anInt1357 * i_10_ >> 8);
		    int i_13_
			= class85.anInt1368 + (class85.anInt1371 * i_10_ >> 8);
		    int i_14_
			= class85.anInt1358 + (class85.anInt1367 * i_10_ >> 8);
		    if (arg0 >= i_11_ && arg0 <= i_12_ && arg1 >= i_13_
			&& arg1 <= i_14_)
			return true;
		}
	    } else if (class85.anInt1376 == 4) {
		int i_15_ = arg2 - class85.anInt1359;
		if (i_15_ > 0) {
		    int i_16_
			= class85.anInt1353 + (class85.anInt1356 * i_15_ >> 8);
		    int i_17_
			= class85.anInt1361 + (class85.anInt1357 * i_15_ >> 8);
		    int i_18_
			= class85.anInt1368 + (class85.anInt1371 * i_15_ >> 8);
		    int i_19_
			= class85.anInt1358 + (class85.anInt1367 * i_15_ >> 8);
		    if (arg0 >= i_16_ && arg0 <= i_17_ && arg1 >= i_18_
			&& arg1 <= i_19_)
			return true;
		}
	    } else if (class85.anInt1376 == 5) {
		int i_20_ = arg1 - class85.anInt1368;
		if (i_20_ > 0) {
		    int i_21_
			= class85.anInt1353 + (class85.anInt1356 * i_20_ >> 8);
		    int i_22_
			= class85.anInt1361 + (class85.anInt1357 * i_20_ >> 8);
		    int i_23_
			= class85.anInt1359 + (class85.anInt1360 * i_20_ >> 8);
		    int i_24_
			= class85.anInt1366 + (class85.anInt1354 * i_20_ >> 8);
		    if (arg0 >= i_21_ && arg0 <= i_22_ && arg2 >= i_23_
			&& arg2 <= i_24_)
			return true;
		}
	    }
	}
	return false;
    }
    
    public static void method1311(byte arg0) {
	try {
	    anInt1073++;
	    Class79.aShortArrayArrayArray1247 = null;
	    Class14_Sub8_Sub32.anInt4616 = 0;
	    Class97.aClass94_1657 = null;
	    Class56.anIntArray917 = null;
	    Class14_Sub8_Sub3.aByteArrayArrayArray4130 = null;
	    int i = -112 / ((68 - arg0) / 44);
	    Class14_Sub2_Sub5.aByteArrayArrayArray3816 = null;
	    Class14_Sub22.anIntArrayArrayArray3125 = null;
	    Class14_Sub2_Sub9.aByteArrayArrayArray3864 = null;
	    Class86.aByteArrayArrayArray1383 = null;
	    Class14_Sub25.anIntArrayArrayArray3174 = null;
	    Class14_Sub8_Sub10.aByteArrayArrayArray4257 = null;
	    Class7_Sub1.aClass14_Sub2_Sub5_2665 = null;
	    Class35.aClass2_589.method81((byte) -124);
	    Class133_Sub1.aClass14_Sub2_Sub19_3505 = null;
	    Class14_Sub8_Sub35.aClass87_4672 = null;
	    Class152.aClass146_2435 = null;
	    Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836 = null;
	    Class48.aClass87_803 = null;
	    Class52.aClass87_858 = null;
	    Class132.aClass87_2171 = null;
	    Class14_Sub17.aClass87_3004 = null;
	    Class48.aClass87_805 = null;
	    Class141.aClass87_2242 = null;
	    Class54.aClass87_888 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ja.D(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_1068 = Class14_Sub2_Sub2.method263(1178, "floorshadows");
	aClass124_1067
	    = (Class14_Sub2_Sub2.method263
	       (1178,
		"Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3"));
    }
}
