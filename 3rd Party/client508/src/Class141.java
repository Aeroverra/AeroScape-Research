/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class141 implements KeyListener, FocusListener
{
    public static Class94 aClass94_2239;
    public static int anInt2240;
    public static int anInt2241;
    public static Class87 aClass87_2242;
    public static int anInt2243;
    public static volatile boolean aBoolean2244;
    public static Interface2[] anInterface2Array2245;
    public static int[] anIntArray2246 = new int[32];
    public static int anInt2247;
    public static int anInt2248;
    public static int anInt2249;
    public static int anInt2250;
    public static int anInt2251;
    public static int anInt2252;
    public static Class9_Sub1[] aClass9_Sub1Array2253;
    public static int anInt2254;
    
    public static void method1960(int arg0, int arg1) {
	try {
	    Class9.aClass52_236.method1208((byte) -112, arg0);
	    Class14_Sub2_Sub19.aClass52_4053.method1208((byte) -112, arg0);
	    if (arg1 <= 35)
		method1963(-128, null, -90, (byte) 3, null);
	    anInt2251++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.B(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static int method1961(int arg0, byte arg1, int arg2, int arg3) {
	int i;
	try {
	    int i_0_ = (Class3.anIntArray119
			[Class133_Sub7_Sub1.method1880(arg3, arg0)]);
	    anInt2247++;
	    if ((arg2 ^ 0xffffffff) < -1) {
		int i_1_ = Class3.anInterface3_117.method14(arg2 & 0xffff, 96);
		if (-1 != (i_1_ ^ 0xffffffff)) {
		    int i_2_;
		    if (arg0 < 0)
			i_2_ = 0;
		    else if (arg0 <= 127)
			i_2_ = arg0 * 131586;
		    else
			i_2_ = 16777215;
		    if (-257 == (i_1_ ^ 0xffffffff))
			i_0_ = i_2_;
		    else {
			int i_3_ = i_1_;
			int i_4_ = -i_1_ + 256;
			i_0_
			    = ((i_3_ * (i_2_ & 0xff00) + i_4_ * (0xff00 & i_0_)
				& 0xff0000)
			       + ((i_3_ * (0xff00ff & i_2_)
				   - -(i_4_ * (i_0_ & 0xff00ff)))
				  & ~0xff00ff)) >> 413287016;
		    }
		}
		int i_5_ = Class3.anInterface3_117.method9(0xffff & arg2, -90);
		if (0 != i_5_) {
		    i_5_ += 256;
		    int i_6_ = ((i_0_ & 0xff0000) >> -820745680) * i_5_;
		    int i_7_ = i_5_ * (0xff & i_0_ >> -1488385592);
		    int i_8_ = i_5_ * (0xff & i_0_);
		    if (-65536 > (i_6_ ^ 0xffffffff))
			i_6_ = 65535;
		    if (i_8_ > 65535)
			i_8_ = 65535;
		    if (-65536 > (i_7_ ^ 0xffffffff))
			i_7_ = 65535;
		    i_0_ = (i_8_ >> 466593000) + ((0xff00a8
						   & i_6_ << -2024659096)
						  + (i_7_ & 0xff00));
		}
	    }
	    if (arg1 < 105)
		anIntArray2246 = null;
	    i = i_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	}
	return i;
    }
    
    public void keyTyped(KeyEvent arg0) {
	try {
	    if (Class14_Sub8_Sub9.aClass141_4239 != null) {
		int i = Class14_Sub8_Sub36.method671(arg0, 0);
		if ((i ^ 0xffffffff) <= -1) {
		    int i_9_ = 0x7f & 1 + Class7_Sub3.anInt2682;
		    if ((Class14_Sub9_Sub3.anInt4850 ^ 0xffffffff)
			!= (i_9_ ^ 0xffffffff)) {
			Class138.anIntArray2224[Class7_Sub3.anInt2682] = -1;
			Class36.anIntArray632[Class7_Sub3.anInt2682] = i;
			Class7_Sub3.anInt2682 = i_9_;
		    }
		}
	    }
	    arg0.consume();
	    anInt2254++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.keyTyped("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void focusLost(FocusEvent arg0) {
	try {
	    anInt2248++;
	    if (Class14_Sub8_Sub9.aClass141_4239 != null)
		Class120.anInt2014 = -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.focusLost("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1962(boolean arg0) {
	try {
	    aClass9_Sub1Array2253 = null;
	    if (arg0)
		anInt2252 = -116;
	    anInterface2Array2245 = null;
	    aClass94_2239 = null;
	    anIntArray2246 = null;
	    aClass87_2242 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vb.C(" + arg0 + ')');
	}
    }
    
    public synchronized void keyPressed(KeyEvent arg0) {
	try {
	    if (null != Class14_Sub8_Sub9.aClass141_4239) {
		Class86.anInt1385 = 0;
		int i = arg0.getKeyCode();
		if (i >= 0 && i < Canvas_Sub2.anIntArray62.length) {
		    i = Canvas_Sub2.anIntArray62[i];
		    if ((i & 0x80 ^ 0xffffffff) != -1)
			i = -1;
		} else
		    i = -1;
		if (0 <= Class120.anInt2014 && -1 >= (i ^ 0xffffffff)) {
		    Class14_Sub8_Sub3.anIntArray4139[Class120.anInt2014] = i;
		    Class120.anInt2014 = 0x7f & Class120.anInt2014 + 1;
		    if ((Class120.anInt2014 ^ 0xffffffff)
			== (Class14_Sub8_Sub4.anInt4146 ^ 0xffffffff))
			Class120.anInt2014 = -1;
		}
		if (-1 >= (i ^ 0xffffffff)) {
		    int i_10_ = 0x7f & 1 + Class7_Sub3.anInt2682;
		    if (i_10_ != Class14_Sub9_Sub3.anInt4850) {
			Class138.anIntArray2224[Class7_Sub3.anInt2682] = i;
			Class36.anIntArray632[Class7_Sub3.anInt2682] = -1;
			Class7_Sub3.anInt2682 = i_10_;
		    }
		}
		int i_11_ = arg0.getModifiers();
		if ((0xa & i_11_ ^ 0xffffffff) != -1 || i == 85 || 10 == i)
		    arg0.consume();
	    }
	    anInt2241++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.keyPressed("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    anInt2250++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.focusGained("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method1963(int arg0, Object[] arg1, int arg2, byte arg3,
				  long[] arg4) {
	try {
	    if (arg3 != 85)
		aClass94_2239 = null;
	    anInt2243++;
	    if ((arg2 ^ 0xffffffff) < (arg0 ^ 0xffffffff)) {
		int i = arg0;
		int i_12_ = (arg0 + arg2) / 2;
		long l = arg4[i_12_];
		arg4[i_12_] = arg4[arg2];
		arg4[arg2] = l;
		Object object = arg1[i_12_];
		arg1[i_12_] = arg1[arg2];
		arg1[arg2] = object;
		for (int i_13_ = arg0;
		     (i_13_ ^ 0xffffffff) > (arg2 ^ 0xffffffff); i_13_++) {
		    if (((long) (0x1 & i_13_) + l ^ 0xffffffffffffffffL)
			< (arg4[i_13_] ^ 0xffffffffffffffffL)) {
			long l_14_ = arg4[i_13_];
			arg4[i_13_] = arg4[i];
			arg4[i] = l_14_;
			Object object_15_ = arg1[i_13_];
			arg1[i_13_] = arg1[i];
			arg1[i++] = object_15_;
		    }
		}
		arg4[arg2] = arg4[i];
		arg4[i] = l;
		arg1[arg2] = arg1[i];
		arg1[i] = object;
		method1963(arg0, arg1, i - 1, (byte) 85, arg4);
		method1963(i - -1, arg1, arg2, (byte) 85, arg4);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public synchronized void keyReleased(KeyEvent arg0) {
	try {
	    if (null != Class14_Sub8_Sub9.aClass141_4239) {
		Class86.anInt1385 = 0;
		int i = arg0.getKeyCode();
		if (i < 0
		    || (i ^ 0xffffffff) <= (Canvas_Sub2.anIntArray62.length
					    ^ 0xffffffff))
		    i = -1;
		else
		    i = ~0x80 & Canvas_Sub2.anIntArray62[i];
		if (-1 >= (Class120.anInt2014 ^ 0xffffffff)
		    && -1 >= (i ^ 0xffffffff)) {
		    Class14_Sub8_Sub3.anIntArray4139[Class120.anInt2014]
			= i ^ 0xffffffff;
		    Class120.anInt2014 = 1 + Class120.anInt2014 & 0x7f;
		    if (Class14_Sub8_Sub4.anInt4146 == Class120.anInt2014)
			Class120.anInt2014 = -1;
		}
	    }
	    arg0.consume();
	    anInt2240++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vb.keyReleased("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aBoolean2244 = true;
	aClass9_Sub1Array2253 = new Class9_Sub1[256];
    }
}
