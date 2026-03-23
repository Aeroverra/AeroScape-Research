/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class95
{
    public static int anInt1615;
    public int anInt1616 = 0;
    public static int anInt1617;
    public int anInt1618 = -1;
    public int anInt1619;
    public Class14_Sub22[] aClass14_Sub22Array1620;
    public int anInt1621;
    public static int anInt1622;
    public static boolean[][] aBooleanArrayArray1623
	= { { true, true, true }, { false, false }, { false, true },
	    { true, false }, { false, true, true }, { true, false, true },
	    { false, true, false }, { true, false, false } };
    public static int anInt1624;
    public static int anInt1625;
    public int[][][] anIntArrayArrayArray1626;
    public Class2 aClass2_1627 = new Class2();
    public boolean aBoolean1628 = false;
    public static int anInt1629;
    
    public int[][] method1481(int arg0, int arg1) {
    while_1002_:
	do {
	    do {
		int[][] is;
		try {
		    if (arg0 != 1)
			method1486(122, -91, (byte) 99, null, null);
		    anInt1617++;
		    if ((anInt1619 ^ 0xffffffff) != (anInt1621 ^ 0xffffffff))
			break;
		    aBoolean1628 = null == aClass14_Sub22Array1620[arg1];
		    aClass14_Sub22Array1620[arg1] = Class37.aClass14_Sub22_652;
		    is = anIntArrayArrayArray1626[arg1];
		} catch (RuntimeException runtimeexception) {
		    break while_1002_;
		}
		return is;
	    } while (false);
	    do {
		int[][] is;
		try {
		    if (1 != anInt1621)
			break;
		    aBoolean1628
			= (arg1 ^ 0xffffffff) != (anInt1618 ^ 0xffffffff);
		    anInt1618 = arg1;
		    is = anIntArrayArrayArray1626[0];
		} catch (RuntimeException runtimeexception) {
		    break while_1002_;
		}
		return is;
	    } while (false);
	    int[][] is;
	    try {
		Class14_Sub22 class14_sub22 = aClass14_Sub22Array1620[arg1];
		if (null == class14_sub22) {
		    aBoolean1628 = true;
		    if ((anInt1621 ^ 0xffffffff) >= (anInt1616 ^ 0xffffffff)) {
			Class14_Sub22 class14_sub22_0_
			    = (Class14_Sub22) aClass2_1627.method83(-1);
			class14_sub22
			    = new Class14_Sub22(arg1,
						class14_sub22_0_.anInt3118);
			aClass14_Sub22Array1620[class14_sub22_0_.anInt3120]
			    = null;
			class14_sub22_0_.method233(0);
		    } else {
			class14_sub22 = new Class14_Sub22(arg1, anInt1616);
			anInt1616++;
		    }
		    aClass14_Sub22Array1620[arg1] = class14_sub22;
		} else
		    aBoolean1628 = false;
		aClass2_1627.method87((byte) -114, class14_sub22);
		is = anIntArrayArrayArray1626[class14_sub22.anInt3118];
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ol.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public static int method1482(int arg0, int arg1, int arg2) {
	int i;
	try {
	    if (arg0 < arg1) {
		int i_1_ = arg0;
		arg0 = arg1;
		arg1 = i_1_;
	    }
	    int i_2_;
	    for (/**/; arg1 != 0; arg1 = i_2_) {
		i_2_ = arg0 % arg1;
		arg0 = arg1;
	    }
	    anInt1629++;
	    i_2_ = 121 % ((-64 - arg2) / 38);
	    i = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ol.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
	return i;
    }
    
    public void method1483(int arg0) {
	try {
	    anInt1625++;
	    if (arg0 != 2)
		method1484(-80);
	    for (int i = 0; (anInt1621 ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		anIntArrayArrayArray1626[i][0] = null;
		anIntArrayArrayArray1626[i][1] = null;
		anIntArrayArrayArray1626[i][2] = null;
		anIntArrayArrayArray1626[i] = null;
	    }
	    anIntArrayArrayArray1626 = null;
	    aClass14_Sub22Array1620 = null;
	    aClass2_1627.method81((byte) -95);
	    aClass2_1627 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ol.E(" + arg0 + ')');
	}
    }
    
    public static void method1484(int arg0) {
	try {
	    aBooleanArrayArray1623 = null;
	    if (arg0 != 2)
		method1482(-119, 17, 43);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ol.D(" + arg0 + ')');
	}
    }
    
    public int[][][] method1485(byte arg0) {
	int[][][] is;
	try {
	    anInt1615++;
	    if (anInt1621 != anInt1619)
		throw new RuntimeException
			  ("Can only retrieve a full image cache");
	    for (int i = 0; i < anInt1621; i++)
		aClass14_Sub22Array1620[i] = Class37.aClass14_Sub22_652;
	    if (arg0 != 52)
		method1483(-35);
	    is = anIntArrayArrayArray1626;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ol.F(" + arg0 + ')');
	}
	return is;
    }
    
    public static void method1486(int arg0, int arg1, byte arg2, int[] arg3,
				  int[] arg4) {
	try {
	    anInt1624++;
	    if ((arg1 ^ 0xffffffff) > (arg0 ^ 0xffffffff)) {
		int i = (arg1 - -arg0) / 2;
		int i_3_ = arg4[i];
		int i_4_ = arg1;
		arg4[i] = arg4[arg0];
		arg4[arg0] = i_3_;
		int i_5_ = arg3[i];
		arg3[i] = arg3[arg0];
		arg3[arg0] = i_5_;
		for (int i_6_ = arg1;
		     (i_6_ ^ 0xffffffff) > (arg0 ^ 0xffffffff); i_6_++) {
		    if ((i_3_ - -(0x1 & i_6_) ^ 0xffffffff)
			> (arg4[i_6_] ^ 0xffffffff)) {
			int i_7_ = arg4[i_6_];
			arg4[i_6_] = arg4[i_4_];
			arg4[i_4_] = i_7_;
			int i_8_ = arg3[i_6_];
			arg3[i_6_] = arg3[i_4_];
			arg3[i_4_++] = i_8_;
		    }
		}
		arg4[arg0] = arg4[i_4_];
		arg4[i_4_] = i_3_;
		arg3[arg0] = arg3[i_4_];
		arg3[i_4_] = i_5_;
		method1486(i_4_ + -1, arg1, (byte) -110, arg3, arg4);
		method1486(arg0, i_4_ - -1, (byte) -110, arg3, arg4);
	    }
	    if (arg2 != -110)
		method1486(-100, -47, (byte) -14, null, null);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ol.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public Class95(int arg0, int arg1, int arg2) {
	try {
	    anInt1619 = arg1;
	    aClass14_Sub22Array1620 = new Class14_Sub22[anInt1619];
	    anInt1621 = arg0;
	    anIntArrayArrayArray1626 = new int[anInt1621][3][arg2];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ol.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ')'));
	}
    }
    
    static {
	anInt1622 = 0;
    }
}
