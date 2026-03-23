/* Class85 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class85
{
    public int anInt1353;
    public int anInt1354;
    public static int anInt1355;
    public int anInt1356;
    public int anInt1357;
    public int anInt1358;
    public int anInt1359;
    public int anInt1360;
    public int anInt1361;
    public static Class18 aClass18_1362;
    public int anInt1363;
    public int anInt1364;
    public static Class124 aClass124_1365
	= Class14_Sub2_Sub2.method263(1178, "hint_headicons");
    public int anInt1366;
    public int anInt1367;
    public int anInt1368;
    public static int anInt1369;
    public static int anInt1370;
    public int anInt1371;
    public static Class94 aClass94_1372;
    public int anInt1373;
    public int anInt1374;
    public static int anInt1375;
    public int anInt1376;
    public int anInt1377;
    
    public static void method1415(int arg0) {
	try {
	    if (!Class14_Sub8_Sub29.aBooleanArray4581[98]) {
		if (!Class14_Sub8_Sub29.aBooleanArray4581[99])
		    Class138.anInt2210 /= 2;
		else
		    Class138.anInt2210 += (-Class138.anInt2210 + -12) / 2;
	    } else
		Class138.anInt2210 += (-Class138.anInt2210 + 12) / 2;
	    int i = (Class7_Sub1.anInt2655
		     + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
	    if (Class14_Sub8_Sub29.aBooleanArray4581[96])
		Class14_Sub8_Sub18.anInt4382
		    += (-Class14_Sub8_Sub18.anInt4382 + -24) / 2;
	    else if (!Class14_Sub8_Sub29.aBooleanArray4581[97])
		Class14_Sub8_Sub18.anInt4382 /= 2;
	    else
		Class14_Sub8_Sub18.anInt4382
		    += (24 - Class14_Sub8_Sub18.anInt4382) / 2;
	    Class2.anInt102 += Class138.anInt2210 / 2;
	    Class14_Sub8_Sub19.anInt4408
		+= Class14_Sub8_Sub18.anInt4382 / arg0;
	    anInt1370++;
	    int i_0_ = (Class14_Sub8_Sub25.anInt4520
			+ Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436);
	    if (499 < (-i + Class140.anInt2238 ^ 0xffffffff)
		|| (-i + Class140.anInt2238 ^ 0xffffffff) < -501
		|| -500 > Class55.anInt905 - i_0_
		|| 500 < -i_0_ + Class55.anInt905) {
		Class140.anInt2238 = i;
		Class55.anInt905 = i_0_;
	    }
	    if (Class140.anInt2238 != i)
		Class140.anInt2238 += (i - Class140.anInt2238) / 16;
	    if ((Class55.anInt905 ^ 0xffffffff) != (i_0_ ^ 0xffffffff))
		Class55.anInt905 += (-Class55.anInt905 + i_0_) / 16;
	    Class33.method1084((byte) 101);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mh.B(" + arg0 + ')');
	}
    }
    
    public static void method1416(int arg0) {
	try {
	    aClass94_1372 = null;
	    if (arg0 != 2)
		method1417(-97, -57, 88, -69, -59, -98);
	    aClass124_1365 = null;
	    aClass18_1362 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mh.C(" + arg0 + ')');
	}
    }
    
    public static void method1417(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5) {
	try {
	    if (arg3 != 0)
		method1415(-44);
	    if ((arg0 ^ 0xffffffff) > (Class118.anInt1982 ^ 0xffffffff)
		|| (Class14_Sub8_Sub14.anInt4327 ^ 0xffffffff) > (arg5
								  ^ 0xffffffff)
		|| (Class14_Sub17.anInt3005 ^ 0xffffffff) < (arg1 ^ 0xffffffff)
		|| (Class59.anInt955 ^ 0xffffffff) > (arg2 ^ 0xffffffff))
		Class14_Sub2_Sub12.method324(arg0, arg4, arg2, arg5,
					     (byte) -128, arg1);
	    else
		Class14_Sub8_Sub38.method674((byte) 92, arg5, arg4, arg0, arg1,
					     arg2);
	    anInt1375++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("mh.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    static {
	anInt1355 = 0;
    }
}
