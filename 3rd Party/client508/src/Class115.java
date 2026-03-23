/* Class115 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class115
{
    public static Class124 aClass124_1906
	= Class14_Sub2_Sub2.method263(1178, "<col=ffffff> )4 ");
    public static int anInt1907;
    public static Class124 aClass124_1908
	= Class14_Sub2_Sub2.method263(1178, "hint_mapedge");
    public static int anInt1909;
    public static Class124 aClass124_1910;
    public int anInt1911;
    public static int anInt1912;
    public int anInt1913;
    public int anInt1914;
    public long aLong1915;
    public static int[] anIntArray1916 = { 1, 4 };
    public static int[] anIntArray1917;
    public static int anInt1918;
    public Class133 aClass133_1919;
    public static int anInt1920;
    public Class133 aClass133_1921;
    public static int anInt1922;
    public static int anInt1923;
    public static Class124 aClass124_1924;
    public int anInt1925;
    public Class133 aClass133_1926;
    public static int anInt1927;
    
    public static void method1588(byte arg0) {
	try {
	    aClass124_1908 = null;
	    anIntArray1917 = null;
	    aClass124_1924 = null;
	    aClass124_1910 = null;
	    anIntArray1916 = null;
	    if (arg0 <= 83)
		method1592((byte) -120);
	    aClass124_1906 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "s.D(" + arg0 + ')');
	}
    }
    
    public static int method1589(byte arg0) {
	int i;
	try {
	    anInt1918++;
	    int i_0_ = 26 % ((73 - arg0) / 47);
	    i = 2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "s.B(" + arg0 + ')');
	}
	return i;
    }
    
    public static float[] method1590(boolean arg0) {
    while_1065_:
	do {
	    float f;
	    float f_1_;
	    float f_2_;
	    do {
		float[] fs;
		try {
		    anInt1922++;
		    f = Class57.method1247() + Class57.method1249();
		    int i = Class57.method1251();
		    Class14_Sub2_Sub15.aFloatArray3964[3] = 1.0F;
		    float f_3_ = (float) (0xff & i >> -67461104) / 255.0F;
		    f_1_ = 0.58823526F;
		    float f_4_ = (float) (i & 0xff) / 255.0F;
		    Class14_Sub2_Sub15.aFloatArray3964[0]
			= f * (f_3_ * Class14_Sub25.aFloatArray3171[0] * f_1_);
		    Class14_Sub2_Sub15.aFloatArray3964[2]
			= f * (f_1_
			       * (Class14_Sub25.aFloatArray3171[2] * f_4_));
		    f_2_ = (float) ((0xffc6 & i) >> -1645030520) / 255.0F;
		    if (!arg0)
			break;
		    fs = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1065_;
		}
		return fs;
	    } while (false);
	    float[] fs;
	    try {
		Class14_Sub2_Sub15.aFloatArray3964[1]
		    = Class14_Sub25.aFloatArray3171[1] * f_2_ * f_1_ * f;
		fs = Class14_Sub2_Sub15.aFloatArray3964;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return fs;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "s.A(" + arg0 + ')');
    }
    
    public static void method1591(int arg0, int arg1, int arg2) {
	try {
	    Class65.anInt1031++;
	    Class55.aClass14_Sub10_Sub1_891.method843(arg2, 63);
	    anInt1923++;
	    Class55.aClass14_Sub10_Sub1_891.method801((byte) -114, arg0);
	    Class55.aClass14_Sub10_Sub1_891.method785(arg2 ^ ~0x55, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("s.F(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1592(byte arg0) {
	try {
	    if (arg0 != 23)
		aClass124_1906 = null;
	    Class14_Sub28.aClass52_3217.method1203((byte) -54);
	    anInt1920++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "s.C(" + arg0 + ')');
	}
    }
    
    public static void method1593(int arg0) {
    while_1071_:
	do {
	while_1070_:
	    do {
		do {
		    try {
			anInt1907++;
			if (-1 != (Class56.anInt918 ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1070_;
		    }
		    return;
		} while (false);
	    while_1069_:
		do {
		while_1068_:
		    do {
			do {
			    try {
				if (++Class14_Sub8_Sub35.anInt4686 <= 2000)
				    break;
				if (null != Class14_Sub15.aClass36_2990) {
				    Class14_Sub15.aClass36_2990
					.method1101((byte) 120);
				    Class14_Sub15.aClass36_2990 = null;
				}
				if ((Class129.anInt2136 ^ 0xffffffff) > -2) {
				    Class56.anInt918 = 1;
				    if ((Class84.anInt1346 ^ 0xffffffff)
					== (Class131.anInt2164 ^ 0xffffffff))
					Class131.anInt2164
					    = Class99_Sub2.anInt3348;
				    else
					Class131.anInt2164 = Class84.anInt1346;
				    Class129.anInt2136++;
				    Class14_Sub8_Sub35.anInt4686 = 0;
				    break;
				}
				Class14_Sub2.anInt2734 = -5;
				Class56.anInt918 = 0;
			    } catch (RuntimeException runtimeexception) {
				break while_1070_;
			    }
			    return;
			} while (false);
		    while_1066_:
			do {
			    do {
				try {
				    if ((Class56.anInt918 ^ 0xffffffff)
					== arg0) {
					Class14_Sub8_Sub22.aClass31_4454
					    = (Class14_Sub8_Sub34
						   .aClass43_4647.method1153
					       (0,
						Class14_Sub8_Sub31.aString4605,
						Class131.anInt2164));
					Class56.anInt918 = 2;
				    }
				    if (Class56.anInt918 != 2)
					break while_1066_;
				    if (-3 == ((Class14_Sub8_Sub22
						.aClass31_4454.anInt529)
					       ^ 0xffffffff))
					throw new IOException();
				    if (((Class14_Sub8_Sub22.aClass31_4454
					  .anInt529)
					 ^ 0xffffffff)
					== -2)
					break;
				} catch (IOException ioexception) {
				    break while_1068_;
				} catch (RuntimeException runtimeexception) {
				    break while_1070_;
				}
				return;
			    } while (false);
			    try {
				Class14_Sub15.aClass36_2990
				    = new Class36((Socket) (Class14_Sub8_Sub22
							    .aClass31_4454
							    .anObject530),
						  (Class14_Sub8_Sub34
						   .aClass43_4647));
				Class14_Sub8_Sub22.aClass31_4454 = null;
				Class14_Sub15.aClass36_2990.method1100
				    (0, 3,
				     Class55.aClass14_Sub10_Sub1_891.anInt2908,
				     (Class55.aClass14_Sub10_Sub1_891
				      .aByteArray2895));
				if (null != Class14_Sub8_Sub35.aClass75_4682)
				    Class14_Sub8_Sub35.aClass75_4682
					.method1338(arg0 ^ ~0xfe);
				if (null != Class134.aClass75_2588)
				    Class134.aClass75_2588.method1338(255);
				int i = Class14_Sub15.aClass36_2990
					    .method1107((byte) 30);
				if (Class14_Sub8_Sub35.aClass75_4682 != null)
				    Class14_Sub8_Sub35.aClass75_4682
					.method1338(255);
				if (null != Class134.aClass75_2588)
				    Class134.aClass75_2588.method1338(255);
				if (i == 21) {
				    Class56.anInt918 = 3;
				    break;
				}
				Class14_Sub2.anInt2734 = i;
				Class56.anInt918 = 0;
				Class14_Sub15.aClass36_2990
				    .method1101((byte) 119);
				Class14_Sub15.aClass36_2990 = null;
			    } catch (IOException ioexception) {
				break while_1068_;
			    } catch (RuntimeException runtimeexception) {
				break while_1070_;
			    }
			    return;
			} while (false);
		    while_1067_:
			do {
			    do {
				try {
				    if (3 != Class56.anInt918)
					break while_1067_;
				    if (1 <= Class14_Sub15.aClass36_2990
						 .method1104(24249))
					break;
				} catch (IOException ioexception) {
				    break while_1068_;
				} catch (RuntimeException runtimeexception) {
				    break while_1070_;
				}
				return;
			    } while (false);
			    try {
				Class14_Sub8_Sub27.aClass124Array4549
				    = new Class124[Class14_Sub15
						       .aClass36_2990
						       .method1107((byte) 30)];
				Class56.anInt918 = 4;
			    } catch (IOException ioexception) {
				break while_1068_;
			    } catch (RuntimeException runtimeexception) {
				break while_1070_;
			    }
			} while (false);
			if (-5 == (Class56.anInt918 ^ 0xffffffff)) {
			try {
			    if (Class14_Sub15.aClass36_2990.method1104(24249)
				>= 8 * (Class14_Sub8_Sub27
					.aClass124Array4549).length) {
				try {
				    Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734.anInt2908
					= 0;
				    Class14_Sub15.aClass36_2990.method1099
					((Class14_Sub8_Sub27
					  .aClass124Array4549).length * 8,
					 (Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .aByteArray2895),
					 arg0 + 1, 0);
				    for (int i = 0;
					 (((Class14_Sub8_Sub27
					    .aClass124Array4549).length
					   ^ 0xffffffff)
					  < (i ^ 0xffffffff));
					 i++)
					Class14_Sub8_Sub27
					    .aClass124Array4549[i]
					    = (Class46.method1174
					       (Class14_Sub8_Sub38
						    .aClass14_Sub10_Sub1_4734
						    .method796(-128),
						(byte) 123));
				    Class14_Sub2.anInt2734 = 21;
				    Class56.anInt918 = 0;
				    Class14_Sub15.aClass36_2990
					.method1101((byte) 116);
				    Class14_Sub15.aClass36_2990 = null;
				} catch (IOException ioexception) {
				    break;
				} catch (RuntimeException runtimeexception) {
				    break while_1070_;
				}
			    }
			} catch (IOException ioexception) {
				break while_1068_;
			}
			} else {
			    try {
				break while_1069_;
			    } catch (RuntimeException runtimeexception) {
				break while_1070_;
			    }
			}
			return;
		    } while (false);
		    Object object = new Throwable();
		    if (null != Class14_Sub15.aClass36_2990) {
			Class14_Sub15.aClass36_2990.method1101((byte) 124);
			Class14_Sub15.aClass36_2990 = null;
		    }
		    if (-2 >= (Class129.anInt2136 ^ 0xffffffff)) {
			Class14_Sub2.anInt2734 = -4;
			Class56.anInt918 = 0;
		    } else {
			Class129.anInt2136++;
			if ((Class84.anInt1346 ^ 0xffffffff)
			    == (Class131.anInt2164 ^ 0xffffffff))
			    Class131.anInt2164 = Class99_Sub2.anInt3348;
			else
			    Class131.anInt2164 = Class84.anInt1346;
			Class56.anInt918 = 1;
			Class14_Sub8_Sub35.anInt4686 = 0;
		    }
		} while (false);
		break while_1071_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "s.E(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aClass124_1910 = Class14_Sub2_Sub2.method263(1178, "leuchten2:");
	aClass124_1924
	    = Class14_Sub2_Sub2.method263(1178, "Gegenstand f-Ur Mitglieder");
    }
}
