/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class84
{
    public static int anInt1343;
    public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_1344;
    public static Class124 aClass124_1345;
    public static int anInt1346;
    public static Class124 aClass124_1347;
    public static int anInt1348;
    public static Class124 aClass124_1349;
    public static Class124 aClass124_1350
	= Class14_Sub2_Sub2.method263(1178, "Lade Titelbild )2 ");
    public static int anInt1351;
    public static Class124 aClass124_1352;
    
    public static void method1411(boolean arg0, Class124 arg1, boolean arg2) {
	try {
	    anInt1343++;
	    if (arg2 != true)
		aClass124_1345 = null;
	    int i = 4;
	    int i_0_ = 6 - -i;
	    int i_1_ = i + 6;
	    int i_2_ = aClass14_Sub2_Sub16_1344.method344(arg1, 250);
	    int i_3_ = aClass14_Sub2_Sub16_1344.method358(arg1, 250) * 13;
	    Class25.method1004(-i + i_0_, i_1_ - i, i + i_2_ + i,
			       i + i_3_ - -i, 0);
	    Class25.method1003(i_0_ + -i, -i + i_1_, i + i + i_2_,
			       i + (i + i_3_), 16777215);
	    aClass14_Sub2_Sub16_1344.method359(arg1, i_0_, i_1_, i_2_, i_3_,
					       16777215, -1, 1, 1, 0);
	    Class14_Sub13.method862(125, i + (i_2_ - -i), i_3_ + (i - -i),
				    -i + i_1_, -i + i_0_);
	    if (!arg0)
		Class71.method1317(i_1_, i_3_, i_2_, -91, i_0_);
	    else
		Class121.method1657();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("mf.B(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static int method1412(byte arg0) {
    while_973_:
	do {
	    do {
		int i;
		try {
		    if (arg0 <= -124)
			break;
		    i = -34;
		} catch (RuntimeException runtimeexception) {
		    break while_973_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt1351++;
		i = 16;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "mf.C(" + arg0 + ')');
    }
    
    public static synchronized long method1413(byte arg0) {
	long l;
	try {
	    anInt1348++;
	    long l_4_ = System.currentTimeMillis();
	    if (l_4_ < Class53.aLong870)
		Class48.aLong807 += -l_4_ + Class53.aLong870;
	    int i = 61 / ((arg0 - 40) / 63);
	    Class53.aLong870 = l_4_;
	    l = Class48.aLong807 + l_4_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mf.D(" + arg0 + ')');
	}
	return l;
    }
    
    public static void method1414(boolean arg0) {
	try {
	    aClass124_1345 = null;
	    aClass124_1349 = null;
	    aClass124_1347 = null;
	    aClass14_Sub2_Sub16_1344 = null;
	    aClass124_1352 = null;
	    aClass124_1350 = null;
	    if (arg0)
		aClass14_Sub2_Sub16_1344 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "mf.A(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_1349
	    = Class14_Sub2_Sub2.method263(1178, "Bitte entfernen Sie ");
	aClass124_1345 = Class14_Sub2_Sub2.method263(1178, "green:");
	aClass124_1352 = aClass124_1345;
	aClass124_1347 = aClass124_1345;
    }
}
