/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Random;

public class Class138
{
    public static Class124 aClass124_2207
	= Class14_Sub2_Sub2.method263(1178, "(U3");
    public int anInt2208;
    public int anInt2209;
    public static int anInt2210;
    public static int anInt2211;
    public static int anInt2212;
    public static int anInt2213;
    public static int anInt2214;
    public static Class124 aClass124_2215
	= Class14_Sub2_Sub2.method263(1178, "Angreifen");
    public static int anInt2216;
    public int anInt2217;
    public static Class124 aClass124_2218;
    public static Class124 aClass124_2219;
    public static float aFloat2220;
    public static int anInt2221;
    public static Class9_Sub1 aClass9_Sub1_2222;
    public static int anInt2223;
    public static int[] anIntArray2224;
    public static int anInt2225;
    public static Class124 aClass124_2226;
    public static Class124 aClass124_2227;
    
    public static void method1944(boolean arg0) {
	try {
	    Class14_Sub8_Sub10.anInt4255 = 0;
	    Class64.anInt1012 = 0;
	    Class14_Sub2_Sub18.method378((byte) -51);
	    anInt2225++;
	    Canvas_Sub2.method63((byte) -110);
	    Class14_Sub8_Sub25.method615(300);
	    for (int i = 0; (i ^ 0xffffffff) > (Class14_Sub8_Sub10.anInt4255
						^ 0xffffffff); i++) {
		int i_0_ = Class36.anIntArray626[i];
		if ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
		    != ((Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_]
			 .anInt3447)
			^ 0xffffffff)) {
		    if (Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_]
			    .aClass12_4949.method212((byte) -128))
			Class37.method1112((Class14_Sub4
					    .aClass133_Sub1_Sub2Array2785
					    [i_0_]),
					   (byte) -26);
		    Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_]
			.aClass12_4949
			= null;
		    Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_] = null;
		}
	    }
	    if ((Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.anInt2908
		 ^ 0xffffffff)
		!= (Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff))
		throw new RuntimeException("gnp1 pos:"
					   + (Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .anInt2908)
					   + " psize:"
					   + Class14_Sub8_Sub12.anInt4280);
	    for (int i = 0; Class14_Sub8_Sub13.anInt4306 > i; i++) {
		if ((Class14_Sub4.aClass133_Sub1_Sub2Array2785
		     [Class14_Sub2_Sub15.anIntArray3965[i]])
		    == null)
		    throw new RuntimeException("gnp2 pos:" + i + " size:"
					       + Class14_Sub8_Sub13.anInt4306);
	    }
	    if (arg0)
		aClass124_2207 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "uh.B(" + arg0 + ')');
	}
    }
    
    public static void method1945(byte arg0, Class14_Sub10 arg1) {
    while_1240_:
	do {
	while_1239_:
	    do {
		do {
		    try {
			anInt2213++;
			if (arg0 == -102)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1239_;
		    }
		    return;
		} while (false);
		try {
		    while (arg1.aByteArray2895.length > arg1.anInt2908) {
			boolean bool = false;
			int i = 0;
			int i_1_ = 0;
			if ((arg1.method798(103) ^ 0xffffffff) == -2) {
			    bool = true;
			    i = arg1.method798(-15);
			    i_1_ = arg1.method798(-57);
			}
			int i_2_ = arg1.method798(-72);
			int i_3_ = arg1.method798(60);
			int i_4_ = -Class65.anInt1034 + i_2_ * 64;
			int i_5_ = (-(i_3_ * 64) + Class35.anInt603
				    + (-1 + Class14_Sub8_Sub15.anInt4332));
			if (i_4_ >= 0 && (-63 + i_5_ ^ 0xffffffff) <= -1
			    && ((63 + i_4_ ^ 0xffffffff)
				> (Class14_Sub2_Sub9.anInt3856 ^ 0xffffffff))
			    && i_5_ < Class14_Sub8_Sub15.anInt4332) {
			    int i_6_ = i_4_ >> -818880986;
			    int i_7_ = i_5_ >> -448610682;
			    for (int i_8_ = 0; -65 < (i_8_ ^ 0xffffffff);
				 i_8_++) {
				for (int i_9_ = 0; i_9_ < 64; i_9_++) {
				    if (!bool
					|| (i_8_ >= i * 8 && i_8_ < 8 + i * 8
					    && 8 * i_1_ <= i_9_
					    && ((8 * i_1_ - -8 ^ 0xffffffff)
						< (i_9_ ^ 0xffffffff)))) {
					byte i_10_
					    = arg1.method780((byte) -77);
					if (i_10_ != 0) {
					    if (null
						== (Class14_Sub8_Sub10
						    .aByteArrayArrayArray4257
						    [i_6_][i_7_]))
						Class14_Sub8_Sub10
						    .aByteArrayArrayArray4257
						    [i_6_][i_7_]
						    = new byte[4096];
					    Class14_Sub8_Sub10
						.aByteArrayArrayArray4257[i_6_]
						[i_7_]
						[i_8_ + (63 + -i_9_
							 << -1825862682)]
						= i_10_;
					    byte i_11_
						= arg1.method780((byte) -77);
					    if ((Class14_Sub8_Sub3
						 .aByteArrayArrayArray4130
						 [i_6_][i_7_])
						== null)
						Class14_Sub8_Sub3
						    .aByteArrayArrayArray4130
						    [i_6_][i_7_]
						    = new byte[4096];
					    Class14_Sub8_Sub3
						.aByteArrayArrayArray4130[i_6_]
						[i_7_]
						[i_8_ + (63 - i_9_
							 << -1196931610)]
						= i_11_;
					}
				    }
				}
			    }
			} else {
			    for (int i_12_ = 0; (!bool ? 4096 : 64) > i_12_;
				 i_12_++) {
				byte i_13_ = arg1.method780((byte) -77);
				if ((i_13_ ^ 0xffffffff) != -1)
				    arg1.anInt2908++;
			    }
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1240_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("uh.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public static void method1946(int arg0) {
	try {
	    anInt2211++;
	    if (arg0 != 139)
		aClass124_2227 = null;
	    if (Class134.aClass75_2588 != null)
		Class134.aClass75_2588.method1341(arg0 ^ ~0xfb);
	    if (null != Class14_Sub8_Sub35.aClass75_4682)
		Class14_Sub8_Sub35.aClass75_4682.method1341(-50);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "uh.C(" + arg0 + ')');
	}
    }
    
    public static String method1947(int arg0, Throwable arg1)
	throws IOException {
	String string;
	try {
	    anInt2216++;
	    String string_14_;
	    if (!(arg1 instanceof RuntimeException_Sub1))
		string_14_ = "";
	    else {
		RuntimeException_Sub1 runtimeexception_sub1
		    = (RuntimeException_Sub1) arg1;
		arg1 = runtimeexception_sub1.aThrowable2461;
		string_14_ = runtimeexception_sub1.aString2457 + " | ";
	    }
	    StringWriter stringwriter = new StringWriter();
	    PrintWriter printwriter = new PrintWriter(stringwriter);
	    arg1.printStackTrace(printwriter);
	    printwriter.close();
	    String string_15_ = stringwriter.toString();
	    if (arg0 != 41)
		method1948(-37);
	    BufferedReader bufferedreader
		= new BufferedReader(new StringReader(string_15_));
	    String string_16_ = bufferedreader.readLine();
	    for (;;) {
		String string_17_ = bufferedreader.readLine();
		if (null == string_17_)
		    break;
		int i = string_17_.indexOf('(');
		int i_18_ = string_17_.indexOf(')', 1 + i);
		if (0 <= i && -1 >= (i_18_ ^ 0xffffffff)) {
		    String string_19_ = string_17_.substring(1 + i, i_18_);
		    int i_20_ = string_19_.indexOf(".java:");
		    if ((i_20_ ^ 0xffffffff) <= -1) {
			string_19_ = (string_19_.substring(0, i_20_)
				      + string_19_.substring(i_20_ - -5));
			string_14_ += string_19_ + ' ';
			continue;
		    }
		    string_17_ = string_17_.substring(0, i);
		}
		string_17_ = string_17_.trim();
		string_17_
		    = string_17_.substring(1 + string_17_.lastIndexOf(' '));
		string_17_
		    = string_17_.substring(string_17_.lastIndexOf('\t') - -1);
		string_14_ += string_17_ + ' ';
	    }
	    string_14_ += "| " + (String) string_16_;
	    string = string_14_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return string;
    }
    
    public static void method1948(int arg0) {
	try {
	    aClass124_2207 = null;
	    aClass124_2227 = null;
	    aClass124_2219 = null;
	    aClass124_2215 = null;
	    aClass124_2218 = null;
	    if (arg0 < 19)
		method1950(-26, 122, 124, 44, null, 84);
	    aClass124_2226 = null;
	    anIntArray2224 = null;
	    aClass9_Sub1_2222 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "uh.G(" + arg0 + ')');
	}
    }
    
    public static int method1949(Random arg0, int arg1, int arg2) {
    while_1241_:
	do {
	    do {
		int i;
		try {
		    anInt2221++;
		    if ((arg1 ^ 0xffffffff) >= -1)
			throw new IllegalArgumentException();
		    if (!Class116.method1594(arg1, 474))
			break;
		    i = (int) ((((long) arg0.nextInt() & 0xffffffffL)
				* (long) arg1)
			       >> -1424455328);
		} catch (RuntimeException runtimeexception) {
		    break while_1241_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		if (arg2 != -32640)
		    method1948(17);
		int i_21_ = -2147483648 + -(int) (4294967296L % (long) arg1);
		int i_22_;
		do
		    i_22_ = arg0.nextInt();
		while ((i_21_ ^ 0xffffffff) >= (i_22_ ^ 0xffffffff));
		i = Class14_Sub8_Sub13.method545((byte) -107, arg1, i_22_);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("uh.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public static Frame method1950(int arg0, int arg1, int arg2, int arg3,
				   Class43 arg4, int arg5) {
    while_1243_:
	do {
	    do {
		Frame frame;
		try {
		    anInt2212++;
		    if (arg4.method1146((byte) -89))
			break;
		    frame = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1243_;
		}
		return frame;
	    } while (false);
	while_1242_:
	    do {
		Class88[] class88s;
		do {
		    Frame frame;
		    try {
			if (arg5 != 0)
			    break while_1242_;
			class88s = Class14_Sub18.method884(-3189, arg4);
			if (class88s != null)
			    break;
			frame = null;
		    } catch (RuntimeException runtimeexception) {
			break while_1243_;
		    }
		    return frame;
		} while (false);
		Frame frame;
		try {
		    boolean bool = false;
		    for (int i = 0;
			 (i ^ 0xffffffff) > (class88s.length ^ 0xffffffff);
			 i++) {
			if (class88s[i].anInt1396 == arg3
			    && ((class88s[i].anInt1397 ^ 0xffffffff)
				== (arg0 ^ 0xffffffff))
			    && ((arg2 ^ 0xffffffff) == -1
				|| arg2 == class88s[i].anInt1403)
			    && (!bool
				|| (arg5 ^ 0xffffffff) > (class88s[i].anInt1402
							  ^ 0xffffffff))) {
			    arg5 = class88s[i].anInt1402;
			    bool = true;
			}
		    }
		    if (bool)
			break;
		    frame = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1243_;
		}
		return frame;
	    } while (false);
	    Class31 class31;
	    Frame frame;
	    do {
		Frame frame_23_;
		try {
		    class31
			= arg4.method1137(arg0, (byte) 112, arg5, arg2, arg3);
		    while ((class31.anInt529 ^ 0xffffffff) == -1)
			Class14_Sub13.method864(10L, (byte) 64);
		    frame = (Frame) class31.anObject530;
		    if (null != frame)
			break;
		    frame_23_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1243_;
		}
		return frame_23_;
	    } while (false);
	    do {
		Frame frame_24_;
		try {
		    if ((class31.anInt529 ^ 0xffffffff) != -3)
			break;
		    Class14_Sub2_Sub4.method278(arg4, frame, 121);
		    frame_24_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1243_;
		}
		return frame_24_;
	    } while (false);
	    Frame frame_25_;
	    try {
		if (arg1 < 75)
		    method1944(true);
		frame_25_ = frame;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return frame_25_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("uh.E(" + arg0 + ',' + arg1 + ','
					    + arg2 + ',' + arg3 + ','
					    + (arg4 != null ? "{...}" : "null")
					    + ',' + arg5 + ')'));
    }
    
    static {
	anInt2210 = 0;
	anInt2214 = -1;
	anInt2223 = 0;
	aClass124_2227 = Class14_Sub2_Sub2.method263(1178, "Ausw-=hlen");
	aClass124_2218 = Class14_Sub2_Sub2.method263(1178, "Please remove ");
	anIntArray2224 = new int[128];
	aClass124_2219 = aClass124_2218;
	aClass124_2226 = aClass124_2218;
    }
}
