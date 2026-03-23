/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas
{
    public static int anInt40;
    public static float aFloat41;
    public static Class124 aClass124_42
	= Class14_Sub2_Sub2.method263(1178, "");
    public static int anInt43 = 1;
    public static int anInt44;
    public static int anInt45;
    public static Class124 aClass124_46;
    public static int anInt47;
    public static Interface5 anInterface5_48;
    public static int anInt49;
    public static short[][] aShortArrayArray50
	= { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437,
	      2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580,
	      784, 21966, 28950, -15697, -14002 },
	    { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145,
	      -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673,
	      -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 },
	    new short[0], new short[0], new short[0] };
    public static int anInt51;
    public Component aComponent52;
    public static int anInt53;
    
    public static void method58(int arg0, byte arg1, int arg2) {
	try {
	    Class14_Sub9_Sub3.anIntArray4851[arg2] = arg0;
	    anInt47++;
	    if (arg1 != -1)
		method58(63, (byte) 85, -90);
	    Class14_Sub13 class14_sub13
		= ((Class14_Sub13)
		   Class2.aClass55_92.method1230((long) arg2, (byte) -105));
	    if (null == class14_sub13) {
		class14_sub13 = new Class14_Sub13(4611686018427387905L);
		Class2.aClass55_92.method1224(8, (long) arg2, class14_sub13);
	    } else if ((class14_sub13.aLong2963 ^ 0xffffffffffffffffL)
		       != -4611686018427387906L)
		class14_sub13.aLong2963
		    = (0x4000000000000000L
		       | Class84.method1413((byte) -69) + 500L);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fm.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method59(byte arg0) {
    while_17_:
	do {
	while_16_:
	    do {
		do {
		    try {
			Class14_Sub2_Sub14.aClass52_3942
			    .method1209((byte) -96);
			if (arg0 <= -107)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_16_;
		    }
		    return;
		} while (false);
		try {
		    anInt51++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_17_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fm.C(" + arg0 + ')');
	} while (false);
    }
    
    public void update(Graphics arg0) {
	try {
	    anInt45++;
	    aComponent52.update(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fm.update("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void paint(Graphics arg0) {
	try {
	    anInt40++;
	    aComponent52.paint(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "fm.paint(" + (arg0 != null
							      ? "{...}"
							      : "null") + ')');
	}
    }
    
    public static void method60(int arg0) {
    while_19_:
	do {
	while_18_:
	    do {
		do {
		    try {
			aClass124_46 = null;
			aClass124_42 = null;
			if (arg0 == 5027)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_18_;
		    }
		    return;
		} while (false);
		try {
		    aShortArrayArray50 = null;
		    anInterface5_48 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_19_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "fm.B(" + arg0 + ')');
	} while (false);
    }
    
    public Canvas_Sub1(Component arg0) {
	try {
	    aComponent52 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("fm.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_46 = Class14_Sub2_Sub2.method263(1178, "<img=1>");
	anInterface5_48 = null;
    }
}
