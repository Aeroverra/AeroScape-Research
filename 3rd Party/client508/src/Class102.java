/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class102
{
    public static int anInt1701;
    public static int anInt1702;
    public static int anInt1703;
    public static int anInt1704;
    public static int anInt1705;
    public long aLong1706;
    public static boolean aBoolean1707;
    public static int anInt1708;
    public static int anInt1709;
    public static Class124 aClass124_1710
	= Class14_Sub2_Sub2.method263(1178, "Stufe)2");
    public boolean aBoolean1711;
    public static Class9_Sub1 aClass9_Sub1_1712;
    public long aLong1713;
    public static int anInt1714;
    public int[] anIntArray1715;
    public static int anInt1716;
    public static int anInt1717;
    public static int anInt1718;
    public static int anInt1719;
    public int anInt1720;
    public static int anInt1721;
    public int[] anIntArray1722;
    public static int anInt1723;
    public static int anInt1724;
    
    public Class133_Sub7 method1516(Class46 arg0, int arg1, int arg2, int arg3,
				    Class46 arg4) {
    while_1028_:
	do {
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    if (arg2 == -13)
			break;
		    class133_sub7 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1028_;
		}
		return class133_sub7;
	    } while (false);
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt1704++;
		    if ((anInt1720 ^ 0xffffffff) == 0)
			break;
		    class133_sub7
			= Class126.method1744(anInt1720, 170)
			      .method209(arg1, arg3, arg4, arg0, -110);
		} catch (RuntimeException runtimeexception) {
		    break while_1028_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	while_1027_:
	    do {
		long l;
		int[] is;
		do {
		    Class133_Sub7 class133_sub7_0_;
		    try {
			l = aLong1713;
			is = anIntArray1715;
			if (null != arg4
			    && ((arg4.anInt771 ^ 0xffffffff) <= -1
				|| (arg4.anInt781 ^ 0xffffffff) <= -1)) {
			    is = new int[12];
			    for (int i = 0; 12 > i; i++)
				is[i] = anIntArray1715[i];
			    if (-1 >= (arg4.anInt771 ^ 0xffffffff)) {
				if (65535 == arg4.anInt771) {
				    is[5] = 0;
				    l ^= ~0xffffffffL;
				} else {
				    is[5] = Class66.method1294(1073741824,
							       arg4.anInt771);
				    l ^= (long) is[5] << -282067296;
				}
			    }
			    if (-1 >= (arg4.anInt781 ^ 0xffffffff)) {
				if (arg4.anInt781 == 65535) {
				    is[3] = 0;
				    l ^= 0xffffffffL;
				} else {
				    is[3] = Class66.method1294(1073741824,
							       arg4.anInt781);
				    l ^= (long) is[3];
				}
			    }
			}
			class133_sub7
			    = ((Class133_Sub7)
			       Class36.aClass52_621.method1210((byte) 65, l));
			if (null != class133_sub7)
			    break while_1027_;
			boolean bool = false;
			for (int i = 0; i < 12; i++) {
			    int i_1_ = is[i];
			    if (-1 == (0x40000000 & i_1_ ^ 0xffffffff)) {
				if (0 != (~0x7fffffff & i_1_)
				    && !Applet_Sub1.method27
					    (i_1_ & 0x3fffffff, -4)
					    .method982(false))
				    bool = true;
			    } else if (!Class14_Sub8_Sub24.method605
					    (89, i_1_ & 0x3fffffff).method1964
					(aBoolean1711, (byte) -72))
				bool = true;
			}
			if (!bool)
			    break;
			if (aLong1706 != -1L)
			    class133_sub7
				= ((Class133_Sub7)
				   Class36.aClass52_621.method1210((byte) 89,
								   aLong1706));
			if (class133_sub7 != null)
			    break;
			class133_sub7_0_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_1028_;
		    }
		    return class133_sub7_0_;
		} while (false);
		try {
		    if (null == class133_sub7) {
			Class133_Sub2[] class133_sub2s = new Class133_Sub2[12];
			int i = 0;
			for (int i_2_ = 0; -13 < (i_2_ ^ 0xffffffff); i_2_++) {
			    int i_3_ = is[i_2_];
			    if (0 == (0x40000000 & i_3_)) {
				if (0 != (~0x7fffffff & i_3_)) {
				    Class133_Sub2 class133_sub2
					= Applet_Sub1.method27
					      (0x3fffffff & i_3_, -4)
					      .method981((byte) -47);
				    if (class133_sub2 != null)
					class133_sub2s[i++] = class133_sub2;
				}
			    } else {
				Class133_Sub2 class133_sub2
				    = Class14_Sub8_Sub24.method605
					  (98, i_3_ & 0x3fffffff)
					  .method1965(arg2 + 52, aBoolean1711);
				if (class133_sub2 != null)
				    class133_sub2s[i++] = class133_sub2;
			    }
			}
			int i_4_ = is[0];
			if ((i_4_ & 0x40000000 ^ 0xffffffff) != -1) {
			    Class142 class142
				= Class14_Sub8_Sub24
				      .method605(100, 0x3fffffff & i_4_);
			    if (null != class142.anIntArrayArray2289) {
				for (int i_5_ = 0;
				     ((class142.anIntArrayArray2289.length
				       ^ 0xffffffff)
				      < (i_5_ ^ 0xffffffff));
				     i_5_++) {
				    if ((null
					 != class142.anIntArrayArray2289[i_5_])
					&& class133_sub2s[i_5_ - -1] != null) {
					int i_6_
					    = (class142.anIntArrayArray2289
					       [i_5_][0]);
					int i_7_
					    = (class142.anIntArrayArray2289
					       [i_5_][1]);
					int i_8_
					    = (class142.anIntArrayArray2289
					       [i_5_][4]);
					int i_9_
					    = (class142.anIntArrayArray2289
					       [i_5_][2]);
					int i_10_
					    = (class142.anIntArrayArray2289
					       [i_5_][3]);
					int i_11_
					    = (class142.anIntArrayArray2289
					       [i_5_][5]);
					class133_sub2s[i_5_ + 1]
					    .method1825(i_6_, i_7_, i_9_);
					class133_sub2s[1 + i_5_]
					    .method1817(i_10_, i_8_, i_11_);
				    }
				}
			    }
			}
			Class133_Sub2 class133_sub2
			    = new Class133_Sub2(class133_sub2s, i);
			for (int i_12_ = 0; 5 > i_12_; i_12_++) {
			    if ((Class14_Sub8_Sub24.aShortArrayArray4496
				 [i_12_]).length
				> anIntArray1722[i_12_])
				class133_sub2.method1813
				    (Class53.aShortArray866[i_12_],
				     (Class14_Sub8_Sub24.aShortArrayArray4496
				      [i_12_][anIntArray1722[i_12_]]));
			    if (anIntArray1722[i_12_]
				< Class2.aShortArrayArray98[i_12_].length)
				class133_sub2.method1813
				    (Class24.aShortArray471[i_12_],
				     (Class2.aShortArrayArray98[i_12_]
				      [anIntArray1722[i_12_]]));
			}
			class133_sub7
			    = class133_sub2.method1827(64, 850, -30, -50, -30);
			((Class133_Sub7_Sub2) class133_sub7).method1895
			    (false, false, true, true, false, false, true);
			Class36.aClass52_621.method1205((byte) -93,
							class133_sub7, l);
			aLong1706 = l;
		    }
		} catch (RuntimeException runtimeexception) {
		    break while_1028_;
		}
	    } while (false);
	    Class133_Sub7 class133_sub7_13_;
	    if (arg4 != null || null != arg0) {
		if (null != arg4 && null != arg0)
		    class133_sub7_13_ = arg4.method1178(arg1, (byte) 46, arg3,
							class133_sub7, arg0);
		else if (arg4 == null)
		    class133_sub7_13_
			= arg0.method1168((byte) 123, arg1, class133_sub7);
		else
		    class133_sub7_13_
			= arg4.method1168((byte) 120, arg3, class133_sub7);
	    } else
		return class133_sub7;
	    Class133_Sub7 class133_sub7_14_;
	    try {
		class133_sub7_14_ = class133_sub7_13_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_14_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pl.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + arg3 + ','
					    + (arg4 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method1517(boolean arg0) {
	try {
	    anInt1705++;
	    long l = aLong1713;
	    aLong1713 = -1L;
	    long[] ls = Class60.aLongArray967;
	    for (int i = 0; 12 > i; i++) {
		aLong1713 = (aLong1713 >>> 260104264
			     ^ ls[(int) (0xffL & ((long) (anIntArray1715[i]
							  >> -1759491592)
						  ^ aLong1713))]);
		aLong1713 = (aLong1713 >>> -376301624
			     ^ ls[(int) (0xffL & ((long) (anIntArray1715[i]
							  >> 579895952)
						  ^ aLong1713))]);
		aLong1713 = (aLong1713 >>> 933304776
			     ^ ls[(int) (0xffL & (aLong1713
						  ^ (long) (anIntArray1715[i]
							    >> -602267992)))]);
		aLong1713 = (aLong1713 >>> 535250056
			     ^ ls[(int) (((long) anIntArray1715[i] ^ aLong1713)
					 & 0xffL)]);
	    }
	    if (arg0)
		anIntArray1722 = null;
	    for (int i = 0; -6 < (i ^ 0xffffffff); i++)
		aLong1713
		    = (aLong1713 >>> -1270617976
		       ^ ls[(int) (0xffL
				   & (aLong1713 ^ (long) anIntArray1722[i]))]);
	    aLong1713
		= (aLong1713 >>> 202110792
		   ^ ls[(int) (((long) (aBoolean1711 ? 1 : 0) ^ aLong1713)
			       & 0xffL)]);
	    if ((l ^ 0xffffffffffffffffL) != -1L && l != aLong1713)
		Class36.aClass52_621.method1204(0, l);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pl.G(" + arg0 + ')');
	}
    }
    
    public void method1518(int arg0, int arg1, int arg2) {
    while_1030_:
	do {
	while_1029_:
	    do {
		int i;
		do {
		    try {
			anInt1723++;
			i = client.anIntArray2644[arg0];
			if (-1 != (anIntArray1715[i] ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1029_;
		    }
		    return;
		} while (false);
		do {
		    try {
			if (null != Applet_Sub1.method27(arg1, -4))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_1029_;
		    }
		    return;
		} while (false);
		try {
		    anIntArray1715[i] = Class66.method1294(-2147483648, arg1);
		    if (arg2 <= 112)
			method1526(true, 116, 35);
		    method1517(false);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_1030_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("pl.I(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
    public void method1519(boolean arg0, boolean arg1) {
	try {
	    aBoolean1711 = arg0;
	    method1517(arg1);
	    anInt1701++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pl.J(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public int method1520(int arg0) {
    while_1031_:
	do {
	    do {
		int i;
		try {
		    if (arg0 != 1073741824)
			aLong1706 = 5L;
		    anInt1716++;
		    if (0 != (anInt1720 ^ 0xffffffff))
			break;
		    i = ((anIntArray1715[11] << -462464123)
			 + (anIntArray1715[0] << 1079866511)
			 + (anIntArray1722[0] << 1894839801)
			 - (-(anIntArray1722[4] << -1802968524)
			    - (anIntArray1715[8] << -1990338774)
			    - anIntArray1715[1]));
		} catch (RuntimeException runtimeexception) {
		    break while_1031_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = (Class126.method1744(anInt1720, arg0 ^ 0x400000aa).anInt337
		     + 305419896);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "pl.H(" + arg0 + ')');
    }
    
    public Class133_Sub7 method1521(Class46 arg0, int arg1, int arg2) {
    while_1033_:
	do {
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt1719++;
		    if (arg1 != 1073741823)
			method1516(null, 5, -39, 66, null);
		    if (0 == (anInt1720 ^ 0xffffffff))
			break;
		    class133_sub7 = Class126.method1744(anInt1720, 170)
					.method224((byte) -113, arg0, arg2);
		} catch (RuntimeException runtimeexception) {
		    break while_1033_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	while_1032_:
	    do {
		do {
		    Class133_Sub7 class133_sub7_15_;
		    try {
			class133_sub7
			    = ((Class133_Sub7)
			       Class70.aClass52_1079.method1210((byte) 79,
								aLong1713));
			if (class133_sub7 != null)
			    break while_1032_;
			boolean bool = false;
			for (int i = 0; i < 12; i++) {
			    int i_16_ = anIntArray1715[i];
			    if ((0x40000000 & i_16_) != 0) {
				if (!Class14_Sub8_Sub24.method605
					 (arg1 + -1073741729,
					  0x3fffffff & i_16_)
					 .method1975(0, aBoolean1711))
				    bool = true;
			    } else if (-1 != (~0x7fffffff & i_16_ ^ 0xffffffff)
				       && !Applet_Sub1.method27
					       (i_16_ & 0x3fffffff, -4)
					       .method983(false))
				bool = true;
			}
			if (!bool)
			    break;
			class133_sub7_15_ = null;
		    } catch (RuntimeException runtimeexception) {
			break while_1033_;
		    }
		    return class133_sub7_15_;
		} while (false);
		try {
		    int i = 0;
		    Class133_Sub2[] class133_sub2s = new Class133_Sub2[12];
		    for (int i_17_ = 0; (i_17_ ^ 0xffffffff) > -13; i_17_++) {
			int i_18_ = anIntArray1715[i_17_];
			if ((0x40000000 & i_18_) != 0) {
			    Class133_Sub2 class133_sub2
				= Class14_Sub8_Sub24.method605
				      (arg1 ^ 0x3fffffa8, 0x3fffffff & i_18_)
				      .method1973(-107, aBoolean1711);
			    if (null != class133_sub2)
				class133_sub2s[i++] = class133_sub2;
			} else if (-1 != (~0x7fffffff & i_18_ ^ 0xffffffff)) {
			    Class133_Sub2 class133_sub2
				= Applet_Sub1.method27
				      (i_18_ & 0x3fffffff, arg1 ^ ~0x3ffffffc)
				      .method977((byte) 61);
			    if (null != class133_sub2)
				class133_sub2s[i++] = class133_sub2;
			}
		    }
		    Class133_Sub2 class133_sub2
			= new Class133_Sub2(class133_sub2s, i);
		    for (int i_19_ = 0; (i_19_ ^ 0xffffffff) > -6; i_19_++) {
			if (anIntArray1722[i_19_]
			    < (Class14_Sub8_Sub24.aShortArrayArray4496
			       [i_19_]).length)
			    class133_sub2.method1813
				(Class53.aShortArray866[i_19_],
				 (Class14_Sub8_Sub24.aShortArrayArray4496
				  [i_19_][anIntArray1722[i_19_]]));
			if (anIntArray1722[i_19_]
			    < Class2.aShortArrayArray98[i_19_].length)
			    class133_sub2.method1813((Class24.aShortArray471
						      [i_19_]),
						     (Class2.aShortArrayArray98
						      [i_19_]
						      [(anIntArray1722
							[i_19_])]));
		    }
		    class133_sub7
			= class133_sub2.method1827(64, 768, -50, -10, -50);
		    Class70.aClass52_1079.method1205((byte) -93, class133_sub7,
						     aLong1713);
		} catch (RuntimeException runtimeexception) {
		    break while_1033_;
		}
	    } while (false);
	    if (null != arg0)
		class133_sub7 = arg0.method1167(arg2, 65535, class133_sub7);
	    return class133_sub7;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pl.B("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ')'));
    }
    
    public void method1522(int[] arg0, int arg1, boolean arg2, int[] arg3,
			   int arg4) {
	try {
	    if (null == arg0) {
		arg0 = new int[12];
		for (int i = 0; -8 < (i ^ 0xffffffff); i++) {
		    for (int i_20_ = 0; ((Class38.anInt2617 ^ 0xffffffff)
					 < (i_20_ ^ 0xffffffff)); i_20_++) {
			Class21 class21 = Applet_Sub1.method27(i_20_, -4);
			if (null != class21 && !class21.aBoolean449
			    && (arg2 ? 7 : 0) + i == class21.anInt446) {
			    arg0[client.anIntArray2644[i]]
				= Class66.method1294(i_20_, -2147483648);
			    break;
			}
		    }
		}
	    }
	    anIntArray1715 = arg0;
	    int i = -94 / ((arg4 - -18) / 61);
	    anInt1720 = arg1;
	    anInt1714++;
	    aBoolean1711 = arg2;
	    anIntArray1722 = arg3;
	    method1517(false);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pl.C("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ',' + arg4 + ')'));
	}
    }
    
    public static int method1523(int arg0, int arg1) {
    while_1034_:
	do {
	    do {
		int i;
		try {
		    anInt1703++;
		    if ((65 > arg0 || (arg0 ^ 0xffffffff) < -91)
			&& (192 > arg0 || (arg0 ^ 0xffffffff) < -223
			    || 215 == arg0))
			break;
		    i = 32 + arg0;
		} catch (RuntimeException runtimeexception) {
		    break while_1034_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (-160 != (arg0 ^ 0xffffffff))
			break;
		    i = 255;
		} catch (RuntimeException runtimeexception) {
		    break while_1034_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg1 != 6427)
			method1523(-60, 113);
		    if (140 != arg0)
			break;
		    i = 156;
		} catch (RuntimeException runtimeexception) {
		    break while_1034_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = arg0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "pl.D(" + arg0 + ',' + arg1 + ')');
    }
    
    public Class133_Sub7 method1524(int arg0, int arg1, int arg2, Class46 arg3,
				    int arg4) {
    while_1035_:
	do {
	    long l;
	    do {
		Class133_Sub7 class133_sub7;
		try {
		    anInt1721++;
		    l = ((long) arg0 << -170181088
			 | (long) (arg2 << -2060400816) | (long) arg0);
		    if (arg4 >= 46)
			break;
		    class133_sub7 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1035_;
		}
		return class133_sub7;
	    } while (false);
	    Class133_Sub7 class133_sub7;
	    do {
		Class133_Sub7 class133_sub7_21_;
		try {
		    class133_sub7
			= ((Class133_Sub7)
			   Class70.aClass52_1079.method1210((byte) 64, l));
		    if (class133_sub7 != null)
			break;
		    Class133_Sub2[] class133_sub2s = new Class133_Sub2[2];
		    int i = 0;
		    if (Applet_Sub1.method27(arg0, -4).method983(false)
			&& Applet_Sub1.method27(arg2, -4).method983(false)) {
			Class133_Sub2 class133_sub2
			    = Applet_Sub1.method27(arg0, -4)
				  .method977((byte) 61);
			if (class133_sub2 != null)
			    class133_sub2s[i++] = class133_sub2;
			class133_sub2 = Applet_Sub1.method27(arg2, -4)
					    .method977((byte) 61);
			if (class133_sub2 != null)
			    class133_sub2s[i++] = class133_sub2;
			class133_sub2 = new Class133_Sub2(class133_sub2s, i);
			for (int i_22_ = 0; -6 < (i_22_ ^ 0xffffffff);
			     i_22_++) {
			    if (((Class14_Sub8_Sub24.aShortArrayArray4496
				  [i_22_]).length
				 ^ 0xffffffff)
				< (anIntArray1722[i_22_] ^ 0xffffffff))
				class133_sub2.method1813
				    (Class53.aShortArray866[i_22_],
				     (Class14_Sub8_Sub24.aShortArrayArray4496
				      [i_22_][anIntArray1722[i_22_]]));
			    if (Class2.aShortArrayArray98[i_22_].length
				> anIntArray1722[i_22_])
				class133_sub2.method1813
				    (Class24.aShortArray471[i_22_],
				     (Class2.aShortArrayArray98[i_22_]
				      [anIntArray1722[i_22_]]));
			}
			class133_sub7
			    = class133_sub2.method1827(64, 768, -50, -10, -50);
			Class70.aClass52_1079.method1205((byte) -93,
							 class133_sub7, l);
			break;
		    }
		    class133_sub7_21_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1035_;
		}
		return class133_sub7_21_;
	    } while (false);
	    Class133_Sub7 class133_sub7_23_;
	    try {
		if (null != arg3)
		    class133_sub7
			= arg3.method1167(arg1, 65535, class133_sub7);
		class133_sub7_23_ = class133_sub7;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class133_sub7_23_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pl.F(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ',' + arg4 + ')'));
    }
    
    public static void method1525(int arg0) {
	try {
	    aClass9_Sub1_1712 = null;
	    aClass124_1710 = null;
	    int i = 103 % ((arg0 - 67) / 47);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pl.E(" + arg0 + ')');
	}
    }
    
    public void method1526(boolean arg0, int arg1, int arg2) {
	try {
	    anInt1718++;
	    anIntArray1722[arg2] = arg1;
	    method1517(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pl.K(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    static {
	anInt1709 = 0;
	anInt1717 = 0;
    }
}
