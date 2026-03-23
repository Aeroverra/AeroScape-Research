/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Class22
{
    public static int anInt458;
    public static Class9_Sub1 aClass9_Sub1_459;
    public static int anInt460;
    public static int anInt461 = 0;
    public static int anInt462;
    public static int anInt463;
    public static Class98 aClass98_464;
    
    public static void method984(int arg0, int arg1, boolean arg2, Color arg3,
				 Class124 arg4) {
	try {
	    try {
		Graphics graphics = Class49.aCanvas819.getGraphics();
		if (null == Class123.aFont2063) {
		    Class123.aFont2063 = new Font("Helvetica", 1, 13);
		    Class14_Sub19.aFontMetrics3081
			= Class49.aCanvas819
			      .getFontMetrics(Class123.aFont2063);
		}
		if (arg2) {
		    graphics.setColor(Color.black);
		    graphics.fillRect(0, 0, Class83.anInt1340,
				      Class14_Sub20.anInt3094);
		}
		if (arg3 == null)
		    arg3 = new Color(140, 17, 17);
		try {
		    if (Class14_Sub2_Sub8.anImage3830 == null)
			Class14_Sub2_Sub8.anImage3830
			    = Class49.aCanvas819.createImage(304, 34);
		    Graphics graphics_0_
			= Class14_Sub2_Sub8.anImage3830.getGraphics();
		    graphics_0_.setColor(arg3);
		    graphics_0_.drawRect(0, 0, 303, 33);
		    graphics_0_.fillRect(2, 2, 3 * arg0, 30);
		    graphics_0_.setColor(Color.black);
		    graphics_0_.drawRect(1, 1, 301, 31);
		    graphics_0_.fillRect(2 - -(arg0 * 3), 2, 300 - 3 * arg0,
					 30);
		    graphics_0_.setFont(Class123.aFont2063);
		    graphics_0_.setColor(Color.white);
		    if (arg1 != -1644)
			method987(109, 6, -69, -24, 29, -66, 34, 77, 72, 117,
				  5, -23, -52, -27, 53, -13, -88, 5, 64, 110);
		    arg4.method1713(false,
				    (-arg4.method1695((Class14_Sub19
						       .aFontMetrics3081),
						      (byte) -94)
				     + 304) / 2,
				    22, graphics_0_);
		    graphics.drawImage(Class14_Sub2_Sub8.anImage3830,
				       Class83.anInt1340 / 2 - 152,
				       Class14_Sub20.anInt3094 / 2 - 18, null);
		} catch (Exception exception) {
		    int i = Class83.anInt1340 / 2 - 152;
		    int i_1_ = Class14_Sub20.anInt3094 / 2 + -18;
		    graphics.setColor(arg3);
		    graphics.drawRect(i, i_1_, 303, 33);
		    graphics.fillRect(2 + i, i_1_ - -2, arg0 * 3, 30);
		    graphics.setColor(Color.black);
		    graphics.drawRect(i + 1, i_1_ - -1, 301, 31);
		    graphics.fillRect(3 * arg0 + i + 2, i_1_ - -2,
				      300 - 3 * arg0, 30);
		    graphics.setFont(Class123.aFont2063);
		    graphics.setColor(Color.white);
		    arg4.method1713(false,
				    i + (304
					 - arg4.method1695((Class14_Sub19
							    .aFontMetrics3081),
							   (byte) -91)) / 2,
				    i_1_ + 22, graphics);
		}
		if (null != Class14_Sub8_Sub39_Sub1.aClass124_5099) {
		    graphics.setFont(Class123.aFont2063);
		    graphics.setColor(Color.white);
		    Class14_Sub8_Sub39_Sub1.aClass124_5099.method1713
			(false,
			 (Class83.anInt1340 / 2
			  + -((Class14_Sub8_Sub39_Sub1.aClass124_5099
				   .method1695
			       (Class14_Sub19.aFontMetrics3081, (byte) -106))
			      / 2)),
			 Class14_Sub20.anInt3094 / 2 - 26, graphics);
		}
	    } catch (Exception exception) {
		Class49.aCanvas819.repaint();
	    }
	    anInt462++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ch.B(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static Class148_Sub1 method985(int arg0) {
    while_651_:
	do {
	    do {
		Class148_Sub1 class148_sub1;
		try {
		    anInt463++;
		    if (arg0 <= -51)
			break;
		    class148_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_651_;
		}
		return class148_sub1;
	    } while (false);
	    Class148_Sub1 class148_sub1;
	    try {
		Class148_Sub1 class148_sub1_2_
		    = new Class148_Sub1(Class14_Sub11.anInt2952,
					Class14_Sub30.anInt3279,
					Class40.anIntArray675[0],
					Class14_Sub2_Sub12.anIntArray3918[0],
					Class17.anIntArray402[0],
					Class76.anIntArray1204[0],
					Class12.aByteArrayArray310[0],
					Class73.anIntArray1114);
		Class129.method1761((byte) 123);
		class148_sub1 = class148_sub1_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class148_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ch.A(" + arg0 + ')');
    }
    
    public static void method986(Class124 arg0, int arg1) {
	try {
	    Class69.method1311((byte) -128);
	    int i = 94 / ((arg1 - -27) / 33);
	    Class14_Sub2_Sub3.method274(arg0, 100);
	    anInt458++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ch.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public static void method987(int arg0, int arg1, int arg2, int arg3,
				 int arg4, int arg5, int arg6, int arg7,
				 int arg8, int arg9, int arg10, int arg11,
				 int arg12, int arg13, int arg14, int arg15,
				 int arg16, int arg17, int arg18, int arg19) {
	if (arg3 == 0) {
	    Class153 class153
		= new Class153(arg10, arg11, arg12, arg13, -1, arg18, false);
	    for (int i = arg0; i >= 0; i--) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg1]
		     [arg2])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[arg1][arg2]
			= new Class14_Sub29(i, arg1, arg2);
	    }
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass153_3248
		= class153;
	} else if (arg3 == 1) {
	    Class153 class153
		= new Class153(arg14, arg15, arg16, arg17, arg5, arg19,
			       arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
	    for (int i = arg0; i >= 0; i--) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg1]
		     [arg2])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[arg1][arg2]
			= new Class14_Sub29(i, arg1, arg2);
	    }
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass153_3248
		= class153;
	} else {
	    Class6 class6
		= new Class6(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8,
			     arg9, arg10, arg11, arg12, arg13, arg14, arg15,
			     arg16, arg17, arg18, arg19);
	    for (int i = arg0; i >= 0; i--) {
		if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][arg1]
		     [arg2])
		    == null)
		    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			[arg1][arg2]
			= new Class14_Sub29(i, arg1, arg2);
	    }
	    Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
		[arg2].aClass6_3233
		= class6;
	}
    }
    
    public static void method988(byte arg0) {
	try {
	    aClass9_Sub1_459 = null;
	    aClass98_464 = null;
	    int i = -50 % ((-31 - arg0) / 33);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ch.E(" + arg0 + ')');
	}
    }
}
