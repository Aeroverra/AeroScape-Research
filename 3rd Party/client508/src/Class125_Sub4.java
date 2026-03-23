/* Class125_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class125_Sub4 extends Class125
{
    public static boolean[] aBooleanArray3416;
    public static int anInt3417;
    public int anInt3418;
    public static int anInt3419;
    public static Class124 aClass124_3420
	= Class14_Sub2_Sub2.method263(1178, "null");
    public int anInt3421;
    public static int anInt3422;
    public static int anInt3423;
    public static int anInt3424;
    public int anInt3425;
    public int anInt3426;
    public static Class9 aClass9_3427;
    public static Class124 aClass124_3428
	= Class14_Sub2_Sub2.method263(1178, "(U0a )2 via: ");
    
    public void method1726(int arg0, int arg1, int arg2) {
    while_1130_:
	do {
	while_1129_:
	    do {
		do {
		    try {
			anInt3423++;
			if (arg0 >= 39)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1129_;
		    }
		    return;
		} while (false);
		try {
		    int i = arg2 * anInt3426 >> 494118188;
		    int i_0_ = arg2 * anInt3421 >> -1000581588;
		    int i_1_ = arg1 * anInt3418 >> -48958836;
		    int i_2_ = arg1 * anInt3425 >> -263518196;
		    Class85.method1417(i, i_1_, i_2_, 0, anInt2079, i_0_);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1130_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("rg.D(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public void method1721(boolean arg0, int arg1, int arg2) {
	try {
	    anInt3424++;
	    if (arg0 != true)
		aBooleanArray3416 = null;
	    int i = anInt3426 * arg1 >> -1325647572;
	    int i_3_ = arg2 * anInt3418 >> 2127042796;
	    int i_4_ = arg1 * anInt3421 >> 673335244;
	    int i_5_ = arg2 * anInt3425 >> 1407654412;
	    Class86.method1423(anInt2086, i_4_, i_5_, i, anInt2083, i_3_, 111);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rg.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1739(int arg0) {
	try {
	    aClass124_3428 = null;
	    aBooleanArray3416 = null;
	    aClass124_3420 = null;
	    aClass9_3427 = null;
	    if (arg0 >= -3)
		method1739(10);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rg.H(" + arg0 + ')');
	}
    }
    
    public Class125_Sub4(int arg0, int arg1, int arg2, int arg3, int arg4,
			 int arg5, int arg6) {
	super(arg4, arg5, arg6);
	try {
	    anInt3426 = arg0;
	    anInt3418 = arg1;
	    anInt3425 = arg3;
	    anInt3421 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rg.<init>(" + arg0 + ','
						+ arg1 + ',' + arg2 + ','
						+ arg3 + ',' + arg4 + ','
						+ arg5 + ',' + arg6 + ')'));
	}
    }
    
    public void method1724(int arg0, int arg1, int arg2) {
	try {
	    if (arg1 != -6)
		method1739(103);
	    anInt3417++;
	    int i = anInt3426 * arg2 >> -145523284;
	    int i_6_ = arg2 * anInt3421 >> -288035284;
	    int i_7_ = arg0 * anInt3418 >> 1351417292;
	    int i_8_ = arg0 * anInt3425 >> -386346164;
	    Class14_Sub2_Sub18_Sub2.method386(i_8_, i_6_, i, anInt2086,
					      anInt2083, anInt2079, i_7_,
					      -25230);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rg.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
}
