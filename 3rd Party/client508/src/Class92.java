/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class92
{
    public static int anInt1432;
    public static int anInt1433;
    public static int anInt1434;
    public static int anInt1435;
    public static int anInt1436 = 0;
    public static int[] anIntArray1437;
    public static int anInt1438;
    public static int[] anIntArray1439;
    public static int[] anIntArray1440;
    
    public static void method1452(int[] arg0) {
	arg0[0] = anInt1433;
	arg0[1] = anInt1438;
	arg0[2] = anInt1434;
	arg0[3] = anInt1436;
    }
    
    public static void method1453(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 < 0)
	    arg0 = 0;
	if (arg1 < 0)
	    arg1 = 0;
	if (arg2 > anInt1432)
	    arg2 = anInt1432;
	if (arg3 > anInt1435)
	    arg3 = anInt1435;
	anInt1433 = arg0;
	anInt1438 = arg1;
	anInt1434 = arg2;
	anInt1436 = arg3;
	method1456();
    }
    
    public static void method1454(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg0 < anInt1433) {
	    arg2 -= anInt1433 - arg0;
	    arg0 = anInt1433;
	}
	if (arg1 < anInt1438) {
	    arg3 -= anInt1438 - arg1;
	    arg1 = anInt1438;
	}
	if (arg0 + arg2 > anInt1434)
	    arg2 = anInt1434 - arg0;
	if (arg1 + arg3 > anInt1436)
	    arg3 = anInt1436 - arg1;
	int i = anInt1432 - arg2;
	int i_0_ = arg0 + arg1 * anInt1432;
	for (int i_1_ = -arg3; i_1_ < 0; i_1_++) {
	    for (int i_2_ = -arg2; i_2_ < 0; i_2_++)
		anIntArray1437[i_0_++] = arg4;
	    i_0_ += i;
	}
    }
    
    public static void method1455(int[] arg0, int arg1, int arg2) {
	anIntArray1437 = arg0;
	anInt1432 = arg1;
	anInt1435 = arg2;
	method1453(0, 0, arg1, arg2);
    }
    
    public static void method1456() {
	anIntArray1440 = null;
	anIntArray1439 = null;
    }
    
    public static void method1457(int arg0, int arg1, int arg2) {
	if (arg0 >= anInt1433 && arg1 >= anInt1438 && arg0 < anInt1434
	    && arg1 < anInt1436)
	    anIntArray1437[arg0 + arg1 * anInt1432] = arg2;
    }
    
    public static void method1458(int arg0, int arg1, int arg2, int arg3) {
	if (arg1 >= anInt1438 && arg1 < anInt1436) {
	    if (arg0 < anInt1433) {
		arg2 -= anInt1433 - arg0;
		arg0 = anInt1433;
	    }
	    if (arg0 + arg2 > anInt1434)
		arg2 = anInt1434 - arg0;
	    int i = arg0 + arg1 * anInt1432;
	    for (int i_3_ = 0; i_3_ < arg2; i_3_++)
		anIntArray1437[i + i_3_] = arg3;
	}
    }
    
    public static void method1459(int[] arg0) {
	anInt1433 = arg0[0];
	anInt1438 = arg0[1];
	anInt1434 = arg0[2];
	anInt1436 = arg0[3];
	method1456();
    }
    
    public static void method1460(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	if (arg4 != 0) {
	    if (arg4 == 256)
		method1462(arg0, arg1, arg2, arg3);
	    else {
		if (arg2 < 0)
		    arg2 = -arg2;
		int i = 256 - arg4;
		int i_4_ = (arg3 >> 16 & 0xff) * arg4;
		int i_5_ = (arg3 >> 8 & 0xff) * arg4;
		int i_6_ = (arg3 & 0xff) * arg4;
		int i_7_ = arg1 - arg2;
		if (i_7_ < anInt1438)
		    i_7_ = anInt1438;
		int i_8_ = arg1 + arg2 + 1;
		if (i_8_ > anInt1436)
		    i_8_ = anInt1436;
		int i_9_ = i_7_;
		int i_10_ = arg2 * arg2;
		int i_11_ = 0;
		int i_12_ = arg1 - i_9_;
		int i_13_ = i_12_ * i_12_;
		int i_14_ = i_13_ - i_12_;
		if (arg1 > i_8_)
		    arg1 = i_8_;
		while (i_9_ < arg1) {
		    for (/**/; i_14_ <= i_10_ || i_13_ <= i_10_;
			 i_14_ += i_11_++ + i_11_)
			i_13_ += i_11_ + i_11_;
		    int i_15_ = arg0 - i_11_ + 1;
		    if (i_15_ < anInt1433)
			i_15_ = anInt1433;
		    int i_16_ = arg0 + i_11_;
		    if (i_16_ > anInt1434)
			i_16_ = anInt1434;
		    int i_17_ = i_15_ + i_9_ * anInt1432;
		    for (int i_18_ = i_15_; i_18_ < i_16_; i_18_++) {
			int i_19_ = (anIntArray1437[i_17_] >> 16 & 0xff) * i;
			int i_20_ = (anIntArray1437[i_17_] >> 8 & 0xff) * i;
			int i_21_ = (anIntArray1437[i_17_] & 0xff) * i;
			int i_22_ = ((i_4_ + i_19_ >> 8 << 16)
				     + (i_5_ + i_20_ >> 8 << 8)
				     + (i_6_ + i_21_ >> 8));
			anIntArray1437[i_17_++] = i_22_;
		    }
		    i_9_++;
		    i_13_ -= i_12_-- + i_12_;
		    i_14_ -= i_12_ + i_12_;
		}
		i_11_ = arg2;
		i_12_ = -i_12_;
		i_14_ = i_12_ * i_12_ + i_10_;
		i_13_ = i_14_ - i_11_;
		i_14_ -= i_12_;
		while (i_9_ < i_8_) {
		    for (/**/; i_14_ > i_10_ && i_13_ > i_10_;
			 i_13_ -= i_11_ + i_11_)
			i_14_ -= i_11_-- + i_11_;
		    int i_23_ = arg0 - i_11_;
		    if (i_23_ < anInt1433)
			i_23_ = anInt1433;
		    int i_24_ = arg0 + i_11_;
		    if (i_24_ > anInt1434 - 1)
			i_24_ = anInt1434 - 1;
		    int i_25_ = i_23_ + i_9_ * anInt1432;
		    for (int i_26_ = i_23_; i_26_ <= i_24_; i_26_++) {
			int i_27_ = (anIntArray1437[i_25_] >> 16 & 0xff) * i;
			int i_28_ = (anIntArray1437[i_25_] >> 8 & 0xff) * i;
			int i_29_ = (anIntArray1437[i_25_] & 0xff) * i;
			int i_30_ = ((i_4_ + i_27_ >> 8 << 16)
				     + (i_5_ + i_28_ >> 8 << 8)
				     + (i_6_ + i_29_ >> 8));
			anIntArray1437[i_25_++] = i_30_;
		    }
		    i_9_++;
		    i_14_ += i_12_ + i_12_;
		    i_13_ += i_12_++ + i_12_;
		}
	    }
	}
    }
    
    public static void method1461(int arg0, int arg1, int arg2, int arg3) {
	if (arg0 >= anInt1433 && arg0 < anInt1434) {
	    if (arg1 < anInt1438) {
		arg2 -= anInt1438 - arg1;
		arg1 = anInt1438;
	    }
	    if (arg1 + arg2 > anInt1436)
		arg2 = anInt1436 - arg1;
	    int i = arg0 + arg1 * anInt1432;
	    for (int i_31_ = 0; i_31_ < arg2; i_31_++)
		anIntArray1437[i + i_31_ * anInt1432] = arg3;
	}
    }
    
    public static void method1462(int arg0, int arg1, int arg2, int arg3) {
	if (arg2 == 0)
	    method1457(arg0, arg1, arg3);
	else {
	    if (arg2 < 0)
		arg2 = -arg2;
	    int i = arg1 - arg2;
	    if (i < anInt1438)
		i = anInt1438;
	    int i_32_ = arg1 + arg2 + 1;
	    if (i_32_ > anInt1436)
		i_32_ = anInt1436;
	    int i_33_ = i;
	    int i_34_ = arg2 * arg2;
	    int i_35_ = 0;
	    int i_36_ = arg1 - i_33_;
	    int i_37_ = i_36_ * i_36_;
	    int i_38_ = i_37_ - i_36_;
	    if (arg1 > i_32_)
		arg1 = i_32_;
	    while (i_33_ < arg1) {
		for (/**/; i_38_ <= i_34_ || i_37_ <= i_34_;
		     i_38_ += i_35_++ + i_35_)
		    i_37_ += i_35_ + i_35_;
		int i_39_ = arg0 - i_35_ + 1;
		if (i_39_ < anInt1433)
		    i_39_ = anInt1433;
		int i_40_ = arg0 + i_35_;
		if (i_40_ > anInt1434)
		    i_40_ = anInt1434;
		int i_41_ = i_39_ + i_33_ * anInt1432;
		for (int i_42_ = i_39_; i_42_ < i_40_; i_42_++)
		    anIntArray1437[i_41_++] = arg3;
		i_33_++;
		i_37_ -= i_36_-- + i_36_;
		i_38_ -= i_36_ + i_36_;
	    }
	    i_35_ = arg2;
	    i_36_ = i_33_ - arg1;
	    i_38_ = i_36_ * i_36_ + i_34_;
	    i_37_ = i_38_ - i_35_;
	    i_38_ -= i_36_;
	    while (i_33_ < i_32_) {
		for (/**/; i_38_ > i_34_ && i_37_ > i_34_;
		     i_37_ -= i_35_ + i_35_)
		    i_38_ -= i_35_-- + i_35_;
		int i_43_ = arg0 - i_35_;
		if (i_43_ < anInt1433)
		    i_43_ = anInt1433;
		int i_44_ = arg0 + i_35_;
		if (i_44_ > anInt1434 - 1)
		    i_44_ = anInt1434 - 1;
		int i_45_ = i_43_ + i_33_ * anInt1432;
		for (int i_46_ = i_43_; i_46_ <= i_44_; i_46_++)
		    anIntArray1437[i_45_++] = arg3;
		i_33_++;
		i_38_ += i_36_ + i_36_;
		i_37_ += i_36_++ + i_36_;
	    }
	}
    }
    
    public static void method1463() {
	anIntArray1437 = null;
	anIntArray1440 = null;
	anIntArray1439 = null;
    }
    
    static {
	anInt1433 = 0;
	anInt1434 = 0;
	anInt1438 = 0;
    }
}
