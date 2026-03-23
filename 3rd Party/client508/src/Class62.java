/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class62
{
    public static int anInt986;
    public static int anInt987;
    public static int anInt988 = 0;
    public static Class14_Sub10 aClass14_Sub10_989;
    public static int anInt990 = 0;
    public static Class52 aClass52_991 = new Class52(30);
    public static int[] anIntArray992;
    public static Class9 aClass9_993;
    public static Class124 aClass124_994
	= Class14_Sub2_Sub2.method263(1178, ":");
    public static Class124 aClass124_995
	= Class14_Sub2_Sub2.method263(1178, "k");
    
    public static void method1274(int arg0) {
    while_865_:
	do {
	while_864_:
	    do {
		do {
		    try {
			aClass52_991 = null;
			aClass124_994 = null;
			anIntArray992 = null;
			aClass124_995 = null;
			if (arg0 > 33)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_864_;
		    }
		    return;
		} while (false);
		try {
		    aClass9_993 = null;
		    aClass14_Sub10_989 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_865_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "hi.A(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1275(int arg0, int arg1, int arg2) {
    while_867_:
	do {
	while_866_:
	    do {
		do {
		    try {
			anInt986++;
			Class82.anInt1330 = (Class150.aClass71ArrayArray2421
					     [arg0][arg1].anInt1087);
			Class49.anInt815 = (Class150.aClass71ArrayArray2421
					    [arg0][arg1].anInt1097);
			if (arg2 == 1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_866_;
		    }
		    return;
		} while (false);
		try {
		    Class52.anInt847 = (Class150.aClass71ArrayArray2421[arg0]
					[arg1].anInt1090);
		    Class57.method1252((float) Class82.anInt1330,
				       (float) Class49.anInt815,
				       (float) Class52.anInt847);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_867_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("hi.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
}
