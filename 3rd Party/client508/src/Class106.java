/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class106
{
    public static Class148[] aClass148Array1777;
    public static int anInt1778;
    public static byte[][] aByteArrayArray1779 = new byte[1000][];
    public int[] anIntArray1780;
    public static Class124 aClass124_1781;
    public static Class124 aClass124_1782
	= Class14_Sub2_Sub2.method263(1178, "Continue");
    public static boolean aBoolean1783;
    public int[] anIntArray1784;
    public static int anInt1785;
    public int anInt1786;
    public static int anInt1787;
    public int anInt1788;
    public static int anInt1789;
    public static int[] anIntArray1790;
    public static int anInt1791;
    public static int anInt1792;
    public int anInt1793;
    public int anInt1794;
    
    public static void method1540(Class14_Sub10_Sub1 arg0, int arg1,
				  int arg2) {
    while_1041_:
	do {
	    do {
		try {
		    anInt1789++;
		    if (arg2 == -15)
			break;
		} catch (RuntimeException runtimeexception) {
		    break while_1041_;
		}
		return;
	    } while (false);
	while_1040_:
	    for (;;) {
		Class14_Sub7 class14_sub7;
		do {
		    try {
			class14_sub7
			    = ((Class14_Sub7)
			       Class40.aClass2_664.method77(arg2 ^ ~0xe));
			if (null != class14_sub7)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1040_;
		    }
		    return;
		} while (false);
		do {
		    try {
			boolean bool = false;
			for (int i = 0; i < class14_sub7.anInt2821; i++) {
			    if (null != class14_sub7.aClass31Array2828[i]) {
				if (-3 == ((class14_sub7.aClass31Array2828[i]
					    .anInt529)
					   ^ 0xffffffff))
				    class14_sub7.anIntArray2820[i] = -5;
				if (-1 == ((class14_sub7.aClass31Array2828[i]
					    .anInt529)
					   ^ 0xffffffff))
				    bool = true;
			    }
			    if (null != class14_sub7.aClass31Array2824[i]) {
				if ((class14_sub7.aClass31Array2824[i].anInt529
				     ^ 0xffffffff)
				    == -3)
				    class14_sub7.anIntArray2820[i] = -6;
				if (0 == (class14_sub7.aClass31Array2824[i]
					  .anInt529))
				    bool = true;
			    }
			}
			if (!bool)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1040_;
		    }
		    return;
		} while (false);
		try {
		    arg0.method843(0, arg1);
		    arg0.method809(false, 0);
		    int i = arg0.anInt2908;
		    arg0.method803(class14_sub7.anInt2830, 92);
		    for (int i_0_ = 0;
			 ((i_0_ ^ 0xffffffff)
			  > (class14_sub7.anInt2821 ^ 0xffffffff));
			 i_0_++) {
			if (-1 != (class14_sub7.anIntArray2820[i_0_]
				   ^ 0xffffffff))
			    arg0.method809(false,
					   class14_sub7.anIntArray2820[i_0_]);
			else {
			    try {
				int i_1_ = class14_sub7.anIntArray2825[i_0_];
				if (-1 != (i_1_ ^ 0xffffffff)) {
				    if (-2 == (i_1_ ^ 0xffffffff)) {
					Field field
					    = ((Field)
					       (class14_sub7.aClass31Array2828
						[i_0_].anObject530));
					field.setInt(null,
						     (class14_sub7
						      .anIntArray2819[i_0_]));
					arg0.method809(false, 0);
				    } else if (2 == i_1_) {
					Field field
					    = ((Field)
					       (class14_sub7.aClass31Array2828
						[i_0_].anObject530));
					int i_2_ = field.getModifiers();
					arg0.method809(false, 0);
					arg0.method803(i_2_, arg2 ^ ~0x5f);
				    }
				} else {
				    Field field = (Field) (class14_sub7
							   .aClass31Array2828
							   [i_0_].anObject530);
				    int i_3_ = field.getInt(null);
				    arg0.method809(false, 0);
				    arg0.method803(i_3_, 110);
				}
				if ((i_1_ ^ 0xffffffff) == -4) {
				    Method method
					= ((Method)
					   (class14_sub7.aClass31Array2824
					    [i_0_].anObject530));
				    byte[][] is
					= (class14_sub7
					   .aByteArrayArrayArray2823[i_0_]);
				    Object[] objects = new Object[is.length];
				    for (int i_4_ = 0;
					 ((is.length ^ 0xffffffff)
					  < (i_4_ ^ 0xffffffff));
					 i_4_++) {
					ObjectInputStream objectinputstream
					    = (new ObjectInputStream
					       (new ByteArrayInputStream
						(is[i_4_])));
					objects[i_4_]
					    = objectinputstream.readObject();
				    }
				    Object object
					= method.invoke(null, objects);
				    if (null != object) {
					if (!(object instanceof Number)) {
					    if (object instanceof Class124) {
						arg0.method809(false, 2);
						arg0.method814(32768,
							       ((Class124)
								object));
					    } else
						arg0.method809(false, 4);
					} else {
					    arg0.method809(false, 1);
					    arg0.method817(((Number) object)
							       .longValue(),
							   127);
					}
				    } else
					arg0.method809(false, 0);
				} else if (i_1_ == 4) {
				    Method method
					= ((Method)
					   (class14_sub7.aClass31Array2824
					    [i_0_].anObject530));
				    int i_5_ = method.getModifiers();
				    arg0.method809(false, 0);
				    arg0.method803(i_5_, 84);
				}
			    } catch (ClassNotFoundException classnotfoundexception) {
				arg0.method809(false, -10);
			    } catch (InvalidClassException invalidclassexception) {
				arg0.method809(false, -11);
			    } catch (StreamCorruptedException streamcorruptedexception) {
				arg0.method809(false, -12);
			    } catch (OptionalDataException optionaldataexception) {
				arg0.method809(false, -13);
			    } catch (IllegalAccessException illegalaccessexception) {
				arg0.method809(false, -14);
			    } catch (IllegalArgumentException illegalargumentexception) {
				arg0.method809(false, -15);
			    } catch (InvocationTargetException invocationtargetexception) {
				arg0.method809(false, -16);
			    } catch (SecurityException securityexception) {
				arg0.method809(false, -17);
			    } catch (IOException ioexception) {
				arg0.method809(false, -18);
			    } catch (NullPointerException nullpointerexception) {
				arg0.method809(false, -19);
			    } catch (Exception exception) {
				arg0.method809(false, -20);
			    } catch (Throwable throwable) {
				arg0.method809(false, -21);
			    }
			}
		    }
		    arg0.method786(i, (byte) -99);
		    arg0.method804(arg0.anInt2908 + -i, (byte) 32);
		    class14_sub7.method233(0);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("qg.E("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public static void method1541(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, int arg6, boolean arg7,
				  int arg8, int arg9) {
    while_1043_:
	do {
	while_1042_:
	    do {
		Class14_Sub14 class14_sub14;
		do {
		    try {
			anInt1787++;
			Class14_Sub14 class14_sub14_6_
			    = (Class14_Sub14) Class33.aClass2_583.method77(0);
			class14_sub14 = null;
			for (/**/; class14_sub14_6_ != null;
			     class14_sub14_6_
				 = ((Class14_Sub14)
				    Class33.aClass2_583.method84(-60))) {
			    if (class14_sub14_6_.anInt2969 == arg3
				&& ((class14_sub14_6_.anInt2967 ^ 0xffffffff)
				    == (arg0 ^ 0xffffffff))
				&& arg4 == class14_sub14_6_.anInt2970
				&& ((class14_sub14_6_.anInt2971 ^ 0xffffffff)
				    == (arg8 ^ 0xffffffff))) {
				class14_sub14 = class14_sub14_6_;
				break;
			    }
			}
			if (null == class14_sub14) {
			    class14_sub14 = new Class14_Sub14();
			    class14_sub14.anInt2971 = arg8;
			    class14_sub14.anInt2970 = arg4;
			    class14_sub14.anInt2967 = arg0;
			    class14_sub14.anInt2969 = arg3;
			    Class7_Sub3_Sub1.method141(4, class14_sub14);
			    Class33.aClass2_583.method80(class14_sub14,
							 (byte) -122);
			}
			class14_sub14.anInt2975 = arg5;
			class14_sub14.anInt2980 = arg6;
			class14_sub14.anInt2965 = arg2;
			class14_sub14.anInt2976 = arg9;
			if (!arg7)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1042_;
		    }
		    return;
		} while (false);
		try {
		    class14_sub14.anInt2981 = arg1;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1043_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("qg.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ arg6 + ',' + arg7 + ','
						+ arg8 + ',' + arg9 + ')'));
	} while (false);
    }
    
    public static void method1542(int arg0) {
	try {
	    aByteArrayArray1779 = null;
	    aClass124_1782 = null;
	    int i = -24 % ((28 - arg0) / 51);
	    aClass124_1781 = null;
	    anIntArray1790 = null;
	    aClass148Array1777 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qg.D(" + arg0 + ')');
	}
    }
    
    public int method1543(byte arg0) {
	try {
	    return 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qg.C(" + arg0 + ')');
	}
    }
    
    public void method1544(byte arg0) {
	try {
	    anInt1785++;
	    if (arg0 != 98)
		anInt1794 = -119;
	    anInt1788 += ++anInt1786;
	    for (int i = 0; -257 < (i ^ 0xffffffff); i++) {
		int i_7_ = anIntArray1784[i];
		if (-1 == (i & 0x2 ^ 0xffffffff)) {
		    if ((i & 0x1) != 0)
			anInt1794 ^= anInt1794 >>> -669299546;
		    else
			anInt1794 ^= anInt1794 << 1217528141;
		} else if (0 == (0x1 & i))
		    anInt1794 ^= anInt1794 << 1424641666;
		else
		    anInt1794 ^= anInt1794 >>> -540042992;
		anInt1794 += anIntArray1784[0xff & 128 + i];
		int i_8_;
		anIntArray1784[i] = i_8_
		    = (anInt1788
		       + (anInt1794
			  + (anIntArray1784
			     [Class14_Sub8_Sub26.method617(i_7_ >> 1574994466,
							   255)])));
		anIntArray1780[i] = anInt1788
		    = ((anIntArray1784
			[Class14_Sub8_Sub26
			     .method617(i_8_ >> 337529416 >> 583732514, 255)])
		       + i_7_);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qg.G(" + arg0 + ')');
	}
    }
    
    public static Class124[] method1545(int arg0, Class124[] arg1) {
	Class124[] class124s;
	try {
	    anInt1778++;
	    if (arg0 != 5)
		aClass124_1782 = null;
	    Class124[] class124s_9_ = new Class124[5];
	    for (int i = 0; (i ^ 0xffffffff) > -6; i++) {
		class124s_9_[i]
		    = (Class14_Sub8_Sub7.method515
		       ((new Class124[]
			 { Class83.method1407(Canvas_Sub2.method69(arg0, 101),
					      i),
			   Class14_Sub8.aClass124_2859 }),
			(byte) -25));
		if (null != arg1 && arg1[i] != null)
		    class124s_9_[i]
			= Class14_Sub8_Sub7.method515((new Class124[]
						       { class124s_9_[i],
							 arg1[i] }),
						      (byte) -28);
	    }
	    class124s = class124s_9_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qg.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return class124s;
    }
    
    public void method1546(int arg0) {
	try {
	    anInt1792++;
	    int i_10_;
	    int i_11_;
	    int i_12_;
	    int i_13_;
	    int i_14_;
	    int i_15_;
	    int i_16_;
	    int i = (i_10_ = i_11_ = i_12_ = i_13_ = i_14_ = i_15_ = i_16_
		     = -1640531527);
	    for (int i_17_ = 0; -5 < (i_17_ ^ 0xffffffff); i_17_++) {
		i ^= i_10_ << 1334620523;
		i_10_ += i_11_;
		i_10_ ^= i_11_ >>> 1904946210;
		i_12_ += i;
		i_11_ += i_12_;
		i_13_ += i_10_;
		i_11_ ^= i_12_ << 647208072;
		i_12_ += i_13_;
		i_14_ += i_11_;
		i_12_ ^= i_13_ >>> 1945472976;
		i_15_ += i_12_;
		i_13_ += i_14_;
		i_13_ ^= i_14_ << -610971414;
		i_14_ += i_15_;
		i_14_ ^= i_15_ >>> -482371804;
		i += i_14_;
		i_16_ += i_13_;
		i_15_ += i_16_;
		i_15_ ^= i_16_ << -249951448;
		i_10_ += i_15_;
		i_16_ += i;
		i_16_ ^= i >>> 706496745;
		i += i_10_;
		i_11_ += i_16_;
	    }
	    for (int i_18_ = 0; -257 < (i_18_ ^ 0xffffffff); i_18_ += 8) {
		i_16_ += anIntArray1780[i_18_ + 7];
		i_13_ += anIntArray1780[4 + i_18_];
		i_11_ += anIntArray1780[i_18_ + 2];
		i_15_ += anIntArray1780[6 + i_18_];
		i_12_ += anIntArray1780[i_18_ + 3];
		i += anIntArray1780[i_18_];
		i_14_ += anIntArray1780[i_18_ - -5];
		i_10_ += anIntArray1780[1 + i_18_];
		i ^= i_10_ << 1376060523;
		i_10_ += i_11_;
		i_12_ += i;
		i_10_ ^= i_11_ >>> -885003070;
		i_13_ += i_10_;
		i_11_ += i_12_;
		i_11_ ^= i_12_ << -768129720;
		i_12_ += i_13_;
		i_12_ ^= i_13_ >>> -1829852176;
		i_15_ += i_12_;
		i_14_ += i_11_;
		i_13_ += i_14_;
		i_13_ ^= i_14_ << -534546934;
		i_14_ += i_15_;
		i_14_ ^= i_15_ >>> -1367916476;
		i_16_ += i_13_;
		i_15_ += i_16_;
		i += i_14_;
		i_15_ ^= i_16_ << -1108839992;
		i_16_ += i;
		i_16_ ^= i >>> 552015241;
		i_11_ += i_16_;
		i_10_ += i_15_;
		i += i_10_;
		anIntArray1784[i_18_] = i;
		anIntArray1784[i_18_ - -1] = i_10_;
		anIntArray1784[2 + i_18_] = i_11_;
		anIntArray1784[i_18_ - -3] = i_12_;
		anIntArray1784[i_18_ - -4] = i_13_;
		anIntArray1784[5 + i_18_] = i_14_;
		anIntArray1784[i_18_ - -6] = i_15_;
		anIntArray1784[i_18_ + 7] = i_16_;
	    }
	    for (int i_19_ = 0; i_19_ < 256; i_19_ += 8) {
		i += anIntArray1784[i_19_];
		i_14_ += anIntArray1784[i_19_ + 5];
		i_12_ += anIntArray1784[i_19_ + 3];
		i_16_ += anIntArray1784[7 + i_19_];
		i_13_ += anIntArray1784[4 + i_19_];
		i_11_ += anIntArray1784[i_19_ - -2];
		i_15_ += anIntArray1784[i_19_ - -6];
		i_10_ += anIntArray1784[1 + i_19_];
		i ^= i_10_ << -1812183061;
		i_12_ += i;
		i_10_ += i_11_;
		i_10_ ^= i_11_ >>> 1480707618;
		i_13_ += i_10_;
		i_11_ += i_12_;
		i_11_ ^= i_12_ << -333941848;
		i_12_ += i_13_;
		i_14_ += i_11_;
		i_12_ ^= i_13_ >>> 1591180560;
		i_15_ += i_12_;
		i_13_ += i_14_;
		i_13_ ^= i_14_ << 655336458;
		i_16_ += i_13_;
		i_14_ += i_15_;
		i_14_ ^= i_15_ >>> -2052380188;
		i_15_ += i_16_;
		i += i_14_;
		i_15_ ^= i_16_ << -1218336632;
		i_10_ += i_15_;
		i_16_ += i;
		i_16_ ^= i >>> -1414258935;
		i += i_10_;
		anIntArray1784[i_19_] = i;
		anIntArray1784[i_19_ - -1] = i_10_;
		i_11_ += i_16_;
		anIntArray1784[2 + i_19_] = i_11_;
		anIntArray1784[3 + i_19_] = i_12_;
		anIntArray1784[i_19_ + 4] = i_13_;
		anIntArray1784[5 + i_19_] = i_14_;
		anIntArray1784[i_19_ + 6] = i_15_;
		anIntArray1784[7 + i_19_] = i_16_;
	    }
	    method1544((byte) 98);
	    anInt1793 = 256;
	    if (arg0 != 255)
		method1544((byte) -65);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "qg.B(" + arg0 + ')');
	}
    }
    
    public Class106() {
	/* empty */
    }
    
    public Class106(int[] arg0) {
	try {
	    anIntArray1784 = new int[256];
	    anIntArray1780 = new int[256];
	    for (int i = 0; (i ^ 0xffffffff) > (arg0.length ^ 0xffffffff); i++)
		anIntArray1780[i] = arg0[i];
	    method1546(255);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("qg.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass124_1781 = aClass124_1782;
    }
}
