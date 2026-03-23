/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

public class Class87
{
    public boolean aBoolean1390 = false;
    public int anInt1391 = 0;
    public static String aString1392
	= ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| "
	   + String.valueOf('\u00c4') + String.valueOf('\u00cb')
	   + String.valueOf('\u00cf') + String.valueOf('\u00d6')
	   + String.valueOf('\u00dc') + String.valueOf('\u00e4')
	   + String.valueOf('\u00eb') + String.valueOf('\u00ef')
	   + String.valueOf('\u00f6') + String.valueOf('\u00fc')
	   + String.valueOf('\u00ff') + String.valueOf('\u00df'));
    public byte[] aByteArray1393 = new byte[100000];
    public static int anInt1394 = aString1392.length();
    public static int[] anIntArray1395 = new int[256];
    
    public int method1425() {
	return aByteArray1393[6];
    }
    
    public void method1426(int[] arg0, byte[] arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6, int arg7, int arg8) {
	for (int i = -arg6; i < 0; i++) {
	    for (int i_0_ = -arg5; i_0_ < 0; i_0_++) {
		int i_1_ = arg1[arg3++] & 0xff;
		if (i_1_ > 30) {
		    if (i_1_ >= 230)
			arg0[arg4++] = arg2;
		    else {
			int i_2_ = arg0[arg4];
			arg0[arg4++] = ((((arg2 & 0xff00ff) * i_1_
					  + (i_2_ & 0xff00ff) * (256 - i_1_))
					 & ~0xff00ff)
					+ (((arg2 & 0xff00) * i_1_
					    + (i_2_ & 0xff00) * (256 - i_1_))
					   & 0xff0000)) >> 8;
		    }
		} else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public void method1427(Class124 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	if (aBoolean1390 || arg3 == 0)
	    arg4 = false;
	for (int i = 0; i < arg0.method1693(0); i++) {
	    int i_3_ = anIntArray1395[arg0.method1710(0, i)];
	    if (arg4) {
		method1428(i_3_, arg1 + 1, arg2, 1, aByteArray1393);
		method1428(i_3_, arg1, arg2 + 1, 1, aByteArray1393);
	    }
	    method1428(i_3_, arg1, arg2, arg3, aByteArray1393);
	    arg1 += aByteArray1393[i_3_ + 7];
	}
    }
    
    public void method1428(int arg0, int arg1, int arg2, int arg3,
			   byte[] arg4) {
	int i = arg1 + arg4[arg0 + 5];
	int i_4_ = arg2 - arg4[arg0 + 6];
	int i_5_ = arg4[arg0 + 3];
	int i_6_ = arg4[arg0 + 4];
	int i_7_ = arg4[arg0] * 16384 + arg4[arg0 + 1] * 128 + arg4[arg0 + 2];
	int i_8_ = i + i_4_ * Class92.anInt1432;
	int i_9_ = Class92.anInt1432 - i_5_;
	int i_10_ = 0;
	if (i_4_ < Class92.anInt1438) {
	    int i_11_ = Class92.anInt1438 - i_4_;
	    i_6_ -= i_11_;
	    i_4_ = Class92.anInt1438;
	    i_7_ += i_11_ * i_5_;
	    i_8_ += i_11_ * Class92.anInt1432;
	}
	if (i_4_ + i_6_ >= Class92.anInt1436)
	    i_6_ -= i_4_ + i_6_ - Class92.anInt1436 + 1;
	if (i < Class92.anInt1433) {
	    int i_12_ = Class92.anInt1433 - i;
	    i_5_ -= i_12_;
	    i = Class92.anInt1433;
	    i_7_ += i_12_;
	    i_8_ += i_12_;
	    i_10_ += i_12_;
	    i_9_ += i_12_;
	}
	if (i + i_5_ >= Class92.anInt1434) {
	    int i_13_ = i + i_5_ - Class92.anInt1434 + 1;
	    i_5_ -= i_13_;
	    i_10_ += i_13_;
	    i_9_ += i_13_;
	}
	if (i_5_ > 0 && i_6_ > 0) {
	    if (aBoolean1390)
		method1426(Class92.anIntArray1437, arg4, arg3, i_7_, i_8_,
			   i_5_, i_6_, i_9_, i_10_);
	    else
		method1430(Class92.anIntArray1437, arg4, arg3, i_7_, i_8_,
			   i_5_, i_6_, i_9_, i_10_);
	}
    }
    
    public void method1429(Class124 arg0, int arg1, int arg2, int arg3,
			   boolean arg4) {
	int i = method1431(arg0) / 2;
	int i_14_ = method1425();
	if (arg1 - i <= Class92.anInt1434 && arg1 + i >= Class92.anInt1433
	    && arg2 - i_14_ <= Class92.anInt1436 && arg2 >= 0)
	    method1427(arg0, arg1 - i, arg2, arg3, arg4);
    }
    
    public void method1430(int[] arg0, byte[] arg1, int arg2, int arg3,
			   int arg4, int arg5, int arg6, int arg7, int arg8) {
	int i = -(arg5 >> 2);
	arg5 = -(arg5 & 0x3);
	for (int i_15_ = -arg6; i_15_ < 0; i_15_++) {
	    for (int i_16_ = i; i_16_ < 0; i_16_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    for (int i_17_ = arg5; i_17_ < 0; i_17_++) {
		if (arg1[arg3++] != 0)
		    arg0[arg4++] = arg2;
		else
		    arg4++;
	    }
	    arg4 += arg7;
	    arg3 += arg8;
	}
    }
    
    public int method1431(Class124 arg0) {
	int i = 0;
	for (int i_18_ = 0; i_18_ < arg0.method1693(0); i_18_++) {
	    if (arg0.method1710(0, i_18_) == 64
		&& i_18_ + 4 < arg0.method1693(0)
		&& arg0.method1710(0, i_18_ + 4) == 64)
		i_18_ += 4;
	    else if (arg0.method1710(0, i_18_) == 126
		     && i_18_ + 4 < arg0.method1693(0)
		     && arg0.method1710(0, i_18_ + 4) == 126)
		i_18_ += 4;
	    else
		i += (aByteArray1393
		      [anIntArray1395[arg0.method1710(0, i_18_)] + 7]);
	}
	return i;
    }
    
    public int method1432() {
	return aByteArray1393[8] - 1;
    }
    
    public void method1433(Font arg0, FontMetrics arg1, char arg2, int arg3,
			   boolean arg4) {
	int i = arg1.charWidth(arg2);
	int i_19_ = i;
	if (arg4) {
	    try {
		if (arg2 == '/')
		    arg4 = false;
		if (arg2 == 'f' || arg2 == 't' || arg2 == 'w' || arg2 == 'v'
		    || arg2 == 'k' || arg2 == 'x' || arg2 == 'y' || arg2 == 'A'
		    || arg2 == 'V' || arg2 == 'W')
		    i++;
	    } catch (Exception exception) {
		/* empty */
	    }
	}
	int i_20_ = arg1.getMaxAscent();
	int i_21_ = arg1.getMaxAscent() + arg1.getMaxDescent();
	int i_22_ = arg1.getHeight();
	Image image = Class49.aCanvas819.createImage(i, i_21_);
	Graphics graphics = image.getGraphics();
	graphics.setColor(Color.black);
	graphics.fillRect(0, 0, i, i_21_);
	graphics.setColor(Color.white);
	graphics.setFont(arg0);
	graphics.drawString(arg2 + "", 0, i_20_);
	if (arg4)
	    graphics.drawString(arg2 + "", 1, i_20_);
	int[] is = new int[i * i_21_];
	PixelGrabber pixelgrabber
	    = new PixelGrabber(image, 0, 0, i, i_21_, is, 0, i);
	try {
	    pixelgrabber.grabPixels();
	} catch (Exception exception) {
	    /* empty */
	}
	image.flush();
	Object object = null;
	int i_23_ = 0;
	int i_24_ = 0;
	int i_25_ = i;
	int i_26_ = i_21_;
    while_978_:
	for (int i_27_ = 0; i_27_ < i_21_; i_27_++) {
	    for (int i_28_ = 0; i_28_ < i; i_28_++) {
		int i_29_ = is[i_28_ + i_27_ * i];
		if ((i_29_ & 0xffffff) != 0) {
		    i_24_ = i_27_;
		    break while_978_;
		}
	    }
	}
    while_979_:
	for (int i_30_ = 0; i_30_ < i; i_30_++) {
	    for (int i_31_ = 0; i_31_ < i_21_; i_31_++) {
		int i_32_ = is[i_30_ + i_31_ * i];
		if ((i_32_ & 0xffffff) != 0) {
		    i_23_ = i_30_;
		    break while_979_;
		}
	    }
	}
    while_980_:
	for (int i_33_ = i_21_ - 1; i_33_ >= 0; i_33_--) {
	    for (int i_34_ = 0; i_34_ < i; i_34_++) {
		int i_35_ = is[i_34_ + i_33_ * i];
		if ((i_35_ & 0xffffff) != 0) {
		    i_26_ = i_33_ + 1;
		    break while_980_;
		}
	    }
	}
    while_981_:
	for (int i_36_ = i - 1; i_36_ >= 0; i_36_--) {
	    for (int i_37_ = 0; i_37_ < i_21_; i_37_++) {
		int i_38_ = is[i_36_ + i_37_ * i];
		if ((i_38_ & 0xffffff) != 0) {
		    i_25_ = i_36_ + 1;
		    break while_981_;
		}
	    }
	}
	aByteArray1393[arg3 * 9 + 0] = (byte) (anInt1391 / 16384);
	aByteArray1393[arg3 * 9 + 1] = (byte) (anInt1391 / 128 & 0x7f);
	aByteArray1393[arg3 * 9 + 2] = (byte) (anInt1391 & 0x7f);
	aByteArray1393[arg3 * 9 + 3] = (byte) (i_25_ - i_23_);
	aByteArray1393[arg3 * 9 + 4] = (byte) (i_26_ - i_24_);
	aByteArray1393[arg3 * 9 + 5] = (byte) i_23_;
	aByteArray1393[arg3 * 9 + 6] = (byte) (i_20_ - i_24_);
	aByteArray1393[arg3 * 9 + 7] = (byte) i_19_;
	aByteArray1393[arg3 * 9 + 8] = (byte) i_22_;
	for (int i_39_ = i_24_; i_39_ < i_26_; i_39_++) {
	    for (int i_40_ = i_23_; i_40_ < i_25_; i_40_++) {
		int i_41_ = is[i_40_ + i_39_ * i] & 0xff;
		if (i_41_ > 30 && i_41_ < 230)
		    aBoolean1390 = true;
		aByteArray1393[anInt1391++] = (byte) i_41_;
	    }
	}
    }
    
    public Class87(int arg0, boolean arg1, Component arg2) {
	anInt1391 = anInt1394 * 9;
	aBoolean1390 = false;
	Font font = new Font("Helvetica", arg1 ? 1 : 0, arg0);
	FontMetrics fontmetrics = arg2.getFontMetrics(font);
	for (int i = 0; i < anInt1394; i++)
	    method1433(font, fontmetrics, aString1392.charAt(i), i, false);
	if (arg1 && aBoolean1390) {
	    anInt1391 = anInt1394 * 9;
	    aBoolean1390 = false;
	    font = new Font("Helvetica", 0, arg0);
	    fontmetrics = arg2.getFontMetrics(font);
	    for (int i = 0; i < anInt1394; i++)
		method1433(font, fontmetrics, aString1392.charAt(i), i, false);
	    if (!aBoolean1390) {
		anInt1391 = anInt1394 * 9;
		aBoolean1390 = false;
		for (int i = 0; i < anInt1394; i++)
		    method1433(font, fontmetrics, aString1392.charAt(i), i,
			       true);
	    }
	}
	byte[] is = new byte[anInt1391];
	for (int i = 0; i < anInt1391; i++)
	    is[i] = aByteArray1393[i];
	aByteArray1393 = is;
    }
    
    public static void method1434() {
	aString1392 = null;
	anIntArray1395 = null;
    }
    
    static {
	for (int i = 0; i < 256; i++) {
	    int i_42_ = aString1392.indexOf(i);
	    if (i_42_ == -1)
		i_42_ = 74;
	    anIntArray1395[i] = i_42_ * 9;
	}
    }
}
