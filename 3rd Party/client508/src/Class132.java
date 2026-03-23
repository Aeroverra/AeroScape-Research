/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class132
{
    public static int anInt2165;
    public static int anInt2166;
    public static Class55 aClass55_2167;
    public static int anInt2168;
    public static long aLong2169 = 0L;
    public static boolean aBoolean2170;
    public static Class87 aClass87_2171;
    public static Class124 aClass124_2172;
    
    public static void method1776(boolean arg0) {
	try {
	    aClass124_2172 = null;
	    aClass55_2167 = null;
	    if (arg0 != true)
		method1778(-36, (byte) 38, -50);
	    aClass87_2171 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "th.C(" + arg0 + ')');
	}
    }
    
    public static void method1777(byte arg0, Class9 arg1) {
    while_1160_:
	do {
	while_1159_:
	    do {
		do {
		    try {
			if (arg0 == -57)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1159_;
		    }
		    return;
		} while (false);
		try {
		    Class71.aClass9_1084 = arg1;
		    anInt2168++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1160_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("th.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method1778(int arg0, byte arg1, int arg2) {
    while_1164_:
	do {
	while_1163_:
	    do {
	    while_1162_:
		do {
		while_1161_:
		    do {
			do {
			    try {
				int i = -12 / ((55 - arg1) / 54);
				anInt2166++;
				if (arg0 == 4 && !Class15.aBoolean374) {
				    arg0 = 2;
				    arg2 = 2;
				}
				if ((arg0 ^ 0xffffffff)
				    == (Class14_Sub2_Sub15.anInt3957
					^ 0xffffffff))
				    break while_1161_;
				if (!Class14_Sub30.aBoolean3269)
				    break;
			    } catch (RuntimeException runtimeexception) {
				break while_1163_;
			    }
			    return;
			} while (false);
			try {
			    if (Class14_Sub2_Sub15.anInt3957 != 0)
				Class141.anInterface2Array2245
				    [Class14_Sub2_Sub15.anInt3957].method2();
			    if (-1 != (arg0 ^ 0xffffffff)) {
				Interface2 interface2
				    = Class141.anInterface2Array2245[arg0];
				interface2.method4();
				interface2.method1(arg2);
			    }
			    Class112.anInt1871 = arg2;
			    Class14_Sub2_Sub15.anInt3957 = arg0;
			    break while_1162_;
			} catch (RuntimeException runtimeexception) {
			    break while_1163_;
			}
		    } while (false);
		    if (0 != arg0 && Class112.anInt1871 != arg2) {
			Class141.anInterface2Array2245[arg0].method1(arg2);
			Class112.anInt1871 = arg2;
		    }
		} while (false);
		break while_1164_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("th.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public static void method1779(int arg0) {
    while_1166_:
	do {
	while_1165_:
	    do {
		int i;
		int i_0_;
		int i_1_;
		do {
		    try {
			anInt2165++;
			i = Class55.anInt895;
			i_0_ = Class76.anInt1197;
			i_1_ = (Class14_Sub8_Sub32.anInt4622
				+ -Class83.anInt1340 - i);
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1165_;
		    }
		    return;
		} while (false);
		try {
		    int i_2_ = (-Class14_Sub20.anInt3094
				+ (Class14_Sub2_Sub21.anInt4086 + -i_0_));
		    if (-1 > (i ^ 0xffffffff) || -1 > (i_1_ ^ 0xffffffff)
			|| -1 > (i_0_ ^ 0xffffffff) || 0 < i_2_) {
			try {
			    Container container;
			    if (null != Class14_Sub2_Sub15.aFrame3962)
				container = Class14_Sub2_Sub15.aFrame3962;
			    else if (null == Class14_Sub14.aFrame2986)
				container = (Class14_Sub8_Sub34.aClass43_4647
					     .anApplet712);
			    else
				container = Class14_Sub14.aFrame2986;
			    int i_3_ = 0;
			    int i_4_ = 0;
			    if (container == Class14_Sub14.aFrame2986) {
				Insets insets
				    = Class14_Sub14.aFrame2986.getInsets();
				i_4_ = insets.left;
				i_3_ = insets.top;
			    }
			    Graphics graphics = container.getGraphics();
			    graphics.setColor(Color.black);
			    if (i > 0)
				graphics.fillRect(i_4_, i_3_, i,
						  (Class14_Sub2_Sub21
						   .anInt4086));
			    if (i_0_ > 0)
				graphics.fillRect(i_4_, i_3_,
						  Class14_Sub8_Sub32.anInt4622,
						  i_0_);
			    if (i_1_ > 0)
				graphics.fillRect((Class14_Sub8_Sub32.anInt4622
						   + (i_4_ + -i_1_)),
						  i_3_, i_1_,
						  (Class14_Sub2_Sub21
						   .anInt4086));
			    if (-1 > (i_2_ ^ 0xffffffff))
				graphics.fillRect(i_4_,
						  (-i_2_ + i_3_
						   + (Class14_Sub2_Sub21
						      .anInt4086)),
						  Class14_Sub8_Sub32.anInt4622,
						  i_2_);
			} catch (Exception exception) {
			    /* empty */
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1166_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "th.A(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass55_2167 = new Class55(32);
	aBoolean2170 = false;
	aClass124_2172 = Class14_Sub2_Sub2.method263(1178, "(U0a )2 in: ");
    }
}
