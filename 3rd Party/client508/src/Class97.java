/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class97
    implements MouseListener, MouseMotionListener, FocusListener
{
    public static Class124 aClass124_1637;
    public static byte[] aByteArray1638
	= { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109,
	    110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122,
	    48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
    public static int anInt1639;
    public static Class124 aClass124_1640;
    public static int anInt1641;
    public static int anInt1642;
    public static int anInt1643;
    public static int anInt1644;
    public static byte[][][] aByteArrayArrayArray1645;
    public static int anInt1646;
    public static Class2 aClass2_1647;
    public static int anInt1648;
    public static int anInt1649;
    public static int anInt1650;
    public static Class148_Sub1[] aClass148_Sub1Array1651;
    public static int anInt1652;
    public static int anInt1653;
    public static int anInt1654;
    public static int anInt1655;
    public static int anInt1656;
    public static Class94 aClass94_1657;
    
    public static Class150 method1489(int arg0, int arg1) {
    while_1007_:
	do {
	    do {
		Class150 class150;
		try {
		    Class150 class150_0_
			= (Class150) Class14_Sub2_Sub14.aClass52_3942
					 .method1210((byte) 90, (long) arg0);
		    anInt1643++;
		    if (class150_0_ == null)
			break;
		    class150 = class150_0_;
		} catch (RuntimeException runtimeexception) {
		    break while_1007_;
		}
		return class150;
	    } while (false);
	    do {
		Class150 class150;
		try {
		    if (arg1 == -9810)
			break;
		    class150 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1007_;
		}
		return class150;
	    } while (false);
	    Class150 class150;
	    try {
		byte[] is = Class14.aClass9_372.method163(arg0, 4, 0);
		Class150 class150_1_ = new Class150();
		if (is != null)
		    class150_1_.method2024(arg0, 0, new Class14_Sub10(is));
		Class14_Sub2_Sub14.aClass52_3942
		    .method1205((byte) -93, class150_1_, (long) arg0);
		class150 = class150_1_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class150;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "pa.A(" + arg0 + ',' + arg1 + ')');
    }
    
    public void mouseClicked(MouseEvent arg0) {
	try {
	    if (arg0.isPopupTrigger())
		arg0.consume();
	    anInt1654++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseClicked("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mouseReleased(MouseEvent arg0) {
	try {
	    do {
		if (null != Class67.aClass97_1055) {
		    Class14_Sub8_Sub31.anInt4602 = 0;
		    Class14_Sub4.anInt2790 = 0;
		    int i = arg0.getModifiers();
		    if (-1 == (i & 0x8 ^ 0xffffffff)) {
			/* empty */
		    }
		    if ((0x4 & i) == 0) {
			/* empty */
		    }
		    if (0 == (0x10 & i))
			break;
		}
	    } while (false);
	    if (arg0.isPopupTrigger())
		arg0.consume();
	    anInt1639++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseReleased("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mouseMoved(MouseEvent arg0) {
	try {
	    anInt1648++;
	    if (null != Class67.aClass97_1055) {
		Class14_Sub8_Sub31.anInt4602 = 0;
		Class14_Sub8_Sub37.anInt4724 = arg0.getX();
		Class14_Sub9_Sub3.anInt4848 = arg0.getY();
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseMoved("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mouseEntered(MouseEvent arg0) {
	try {
	    if (null != Class67.aClass97_1055) {
		Class14_Sub8_Sub31.anInt4602 = 0;
		Class14_Sub8_Sub37.anInt4724 = arg0.getX();
		Class14_Sub9_Sub3.anInt4848 = arg0.getY();
	    }
	    anInt1650++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseEntered("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1490(byte arg0) {
    while_1009_:
	do {
	while_1008_:
	    do {
		do {
		    try {
			aClass124_1640 = null;
			aByteArray1638 = null;
			if (arg0 == 110)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1008_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_1637 = null;
		    aClass148_Sub1Array1651 = null;
		    aByteArrayArrayArray1645 = null;
		    aClass2_1647 = null;
		    aClass94_1657 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1009_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "pa.B(" + arg0 + ')');
	} while (false);
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt1642++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.focusGained("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mouseExited(MouseEvent arg0) {
	try {
	    if (null != Class67.aClass97_1055) {
		Class14_Sub8_Sub31.anInt4602 = 0;
		Class14_Sub8_Sub37.anInt4724 = -1;
		Class14_Sub9_Sub3.anInt4848 = -1;
	    }
	    anInt1655++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseExited("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1491(int arg0, int arg1, int arg2, int arg3,
				  boolean arg4, int arg5, int arg6,
				  Class94 arg7) {
	try {
	    if (Class54.aBoolean881)
		Class14_Sub2_Sub1.anInt3739 = 32;
	    else
		Class14_Sub2_Sub1.anInt3739 = 0;
	    anInt1646++;
	    Class54.aBoolean881 = false;
	    if (0 != Class14_Sub8_Sub30.anInt4599) {
		if ((arg0 ^ 0xffffffff) < (arg5 ^ 0xffffffff)
		    || arg5 >= arg0 - -16 || arg2 < arg1
		    || 16 + arg1 <= arg2) {
		    if ((arg0 ^ 0xffffffff) < (arg5 ^ 0xffffffff)
			|| arg5 >= arg0 - -16
			|| (-16 + (arg1 - -arg6) ^ 0xffffffff) < (arg2
								  ^ 0xffffffff)
			|| arg1 - -arg6 <= arg2) {
			if (arg5 >= -Class14_Sub2_Sub1.anInt3739 + arg0
			    && (arg0 + (16 - -Class14_Sub2_Sub1.anInt3739)
				^ 0xffffffff) < (arg5 ^ 0xffffffff)
			    && (16 + arg1 ^ 0xffffffff) >= (arg2 ^ 0xffffffff)
			    && ((arg6 + (arg1 + -16) ^ 0xffffffff)
				< (arg2 ^ 0xffffffff))) {
			    int i = (arg6 - 32) * arg6 / arg3;
			    if (-9 < (i ^ 0xffffffff))
				i = 8;
			    int i_2_ = -i + (-32 + arg6);
			    int i_3_ = -16 + arg2 - (arg1 - -(i / 2));
			    arg7.anInt1547 = i_3_ * (arg3 + -arg6) / i_2_;
			    Class103.method1531((byte) -118, arg7);
			    Class54.aBoolean881 = true;
			}
		    } else {
			arg7.anInt1547 += 4;
			Class103.method1531((byte) -48, arg7);
		    }
		} else {
		    arg7.anInt1547 -= 4;
		    Class103.method1531((byte) -120, arg7);
		}
	    }
	    if (Class113.anInt1881 != 0) {
		int i = arg7.anInt1518;
		if ((-i + arg0 ^ 0xffffffff) >= (arg5 ^ 0xffffffff)
		    && arg1 <= arg2
		    && (arg5 ^ 0xffffffff) > (arg0 - -16 ^ 0xffffffff)
		    && (arg6 + arg1 ^ 0xffffffff) <= (arg2 ^ 0xffffffff)) {
		    arg7.anInt1547 += 45 * Class113.anInt1881;
		    Class103.method1531((byte) -72, arg7);
		}
	    }
	    if (arg4 != true)
		anInt1656 = -97;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.C(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ','
						+ (arg7 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	try {
	    anInt1641++;
	    if (Class67.aClass97_1055 != null)
		Class14_Sub4.anInt2790 = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.focusLost("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mousePressed(MouseEvent arg0) {
	try {
	    anInt1644++;
	    do {
		if (Class67.aClass97_1055 != null) {
		    Class14_Sub8_Sub31.anInt4602 = 0;
		    Class111.anInt1860 = arg0.getX();
		    Class118.anInt1976 = arg0.getY();
		    Applet_Sub1.aLong6 = Class84.method1413((byte) -65);
		    if (arg0.isMetaDown()) {
			Class127.anInt2105 = 2;
			Class14_Sub4.anInt2790 = 2;
		    } else {
			Class127.anInt2105 = 1;
			Class14_Sub4.anInt2790 = 1;
		    }
		    int i = arg0.getModifiers();
		    if (0 == (i & 0x8)) {
			/* empty */
		    }
		    if ((0x4 & i) == 0) {
			/* empty */
		    }
		    if (-1 != (0x10 & i ^ 0xffffffff))
			break;
		}
	    } while (false);
	    if (arg0.isPopupTrigger())
		arg0.consume();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mousePressed("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void mouseDragged(MouseEvent arg0) {
	try {
	    if (null != Class67.aClass97_1055) {
		Class14_Sub8_Sub31.anInt4602 = 0;
		Class14_Sub8_Sub37.anInt4724 = arg0.getX();
		Class14_Sub9_Sub3.anInt4848 = arg0.getY();
	    }
	    anInt1653++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pa.mouseDragged("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_1637
	    = Class14_Sub2_Sub2.method263(1178,
					  " is already on your friend list)3");
	anInt1652 = 2;
	aClass124_1640 = aClass124_1637;
	aClass2_1647 = new Class2();
    }
}
