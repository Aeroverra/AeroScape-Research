/* Class9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.math.BigInteger;

public class Class9_Sub1 extends Class9
{
    public int anInt2687;
    public static int anInt2688;
    public Class114 aClass114_2689;
    public static int anInt2690;
    public boolean aBoolean2691 = false;
    public int anInt2692;
    public Class114 aClass114_2693;
    public static int anInt2694;
    public static int anInt2695;
    public static Class9 aClass9_2696;
    public volatile boolean aBoolean2697 = false;
    public volatile boolean[] aBooleanArray2698;
    public static int anInt2699;
    public int anInt2700;
    public static int anInt2701;
    public static int anInt2702;
    public int anInt2703 = -1;
    public static BigInteger aBigInteger2704
	= (new BigInteger
	   ("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
    public static int anInt2705;
    public static int anInt2706;
    public static int anInt2707;
    public static int anInt2708;
    
    public void method164(int arg0, int arg1) {
    while_94_:
	do {
	while_93_:
	    do {
		do {
		    try {
			anInt2706++;
			if (method153(arg1, -1))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_93_;
		    }
		    return;
		} while (false);
		try {
		    int i = 79 % ((arg0 - -86) / 36);
		    if (null == aClass114_2689 || aBooleanArray2698 == null
			|| !aBooleanArray2698[arg1])
			Class14_Sub8_Sub29.method633((byte) 2, 100, this,
						     anInt2687, true,
						     anIntArray202[arg1],
						     arg1);
		    else
			Class63.method1277(-5761, this, arg1, aClass114_2689);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_94_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "wl.U(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public void method174(byte arg0, int arg1) {
    while_96_:
	do {
	while_95_:
	    do {
		do {
		    try {
			anInt2708++;
			if (arg0 > -62)
			    anInt2703 = 62;
			if (method153(arg1, -1))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_95_;
		    }
		    return;
		} while (false);
		try {
		    Class133_Sub3.method1832(arg1, (byte) -73, anInt2687);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_96_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("wl.EA(" + arg0 + ',' + arg1
						+ ')'));
	} while (false);
    }
    
    public static int method179(int arg0, int arg1, byte arg2) {
    while_97_:
	do {
	    int i;
	    int i_0_;
	    do {
		int i_1_;
		try {
		    anInt2695++;
		    i = (Class14_Sub8_Sub39.method678(false, -1 + arg0,
						      -1 + arg1)
			 + Class14_Sub8_Sub39.method678(false, 1 + arg0,
							-1 + arg1)
			 - (-Class14_Sub8_Sub39.method678(false, arg0 - 1,
							  arg1 + 1)
			    + -Class14_Sub8_Sub39.method678(false, 1 + arg0,
							    arg1 - -1)));
		    i_0_
			= (Class14_Sub8_Sub39.method678(false, arg0 + -1, arg1)
			   + (Class14_Sub8_Sub39.method678(false, 1 + arg0,
							   arg1)
			      + Class14_Sub8_Sub39.method678(false, arg0,
							     -1 + arg1))
			   - -Class14_Sub8_Sub39.method678(false, arg0,
							   1 + arg1));
		    if (arg2 == -75)
			break;
		    i_1_ = -9;
		} catch (RuntimeException runtimeexception) {
		    break while_97_;
		}
		return i_1_;
	    } while (false);
	    int i_2_;
	    try {
		int i_3_ = Class14_Sub8_Sub39.method678(false, arg0, arg1);
		i_2_ = i_3_ / 4 + i / 16 - -(i_0_ / 8);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_2_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("wl.KA(" + arg0 + ',' + arg1 + ','
					    + arg2 + ')'));
    }
    
    public Class9_Sub1(Class114 arg0, Class114 arg1, int arg2, boolean arg3,
		       boolean arg4, boolean arg5) {
	super(arg3, arg4);
	try {
	    aClass114_2693 = arg1;
	    aBoolean2691 = arg5;
	    anInt2687 = arg2;
	    aClass114_2689 = arg0;
	    Class20.method969(anInt2687, this, (byte) -71);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wl.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ')'));
	}
    }
    
    public void method180(int arg0, int arg1, int arg2) {
	try {
	    anInt2701++;
	    anInt2692 = arg2;
	    if (arg0 != -6)
		aClass114_2693 = null;
	    anInt2700 = arg1;
	    if (aClass114_2693 == null)
		Class14_Sub8_Sub29.method633((byte) 0, 126, this, 255, true,
					     anInt2692, anInt2687);
	    else
		Class63.method1277(-5761, this, anInt2687, aClass114_2693);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wl.MA(" + arg0 + ',' + arg1
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method181(int arg0) {
	try {
	    aBigInteger2704 = null;
	    aClass9_2696 = null;
	    if (arg0 != 97)
		aBigInteger2704 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "wl.QA(" + arg0 + ')');
	}
    }
    
    public void method182(Class114 arg0, int arg1, byte[] arg2, boolean arg3,
			  byte arg4) {
    while_102_:
	do {
	while_101_:
	    do {
		do {
		    try {
			anInt2694++;
			if (arg4 == 55)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_101_;
		    }
		    return;
		} while (false);
	    while_100_:
		do {
		while_99_:
		    do {
			do {
			    try {
				if (arg0 != aClass114_2693)
				    break while_99_;
				if (aBoolean2697)
				    throw new RuntimeException();
				if (null != arg2)
				    break;
				Class14_Sub8_Sub29.method633((byte) 0, 120,
							     this, 255, true,
							     anInt2692,
							     anInt2687);
			    } catch (RuntimeException runtimeexception) {
				break while_101_;
			    }
			    return;
			} while (false);
			do {
			    try {
				Class7.aCRC32_171.reset();
				Class7.aCRC32_171.update(arg2, 0, arg2.length);
				int i = (int) Class7.aCRC32_171.getValue();
				if ((anInt2692 ^ 0xffffffff)
				    == (i ^ 0xffffffff))
				    break;
				Class14_Sub8_Sub29.method633((byte) 0, 120,
							     this, 255, true,
							     anInt2692,
							     anInt2687);
			    } catch (RuntimeException runtimeexception) {
				break while_101_;
			    }
			    return;
			} while (false);
			Class14_Sub10 class14_sub10;
		    while_98_:
			do {
			    do {
				try {
				    try {
					class14_sub10
					    = (new Class14_Sub10
					       (Class7_Sub3_Sub1
						    .method139(-28009, arg2)));
				    } catch (RuntimeException runtimeexception) {
					Class14_Sub8_Sub29.method633
					    ((byte) 0, 124, this, 255, true,
					     anInt2692, anInt2687);
					break;
				    }
				    break while_98_;
				} catch (RuntimeException runtimeexception) {
				    break while_101_;
				}
			    } while (false);
			    return;
			} while (false);
			int i;
			do {
			    try {
				i = class14_sub10.method798(arg4 + 54);
				if ((i ^ 0xffffffff) == -6 || i == 6)
				    break;
				Class14_Sub8_Sub29.method633((byte) 0, 114,
							     this, 255, true,
							     anInt2692,
							     anInt2687);
			    } catch (RuntimeException runtimeexception) {
				break while_101_;
			    }
			    return;
			} while (false);
			do {
			    try {
				int i_4_ = 0;
				if ((i ^ 0xffffffff) <= -7)
				    i_4_
					= class14_sub10.method812((byte) -107);
				if ((i_4_ ^ 0xffffffff)
				    == (anInt2700 ^ 0xffffffff))
				    break;
				Class14_Sub8_Sub29.method633((byte) 0, 101,
							     this, 255, true,
							     anInt2692,
							     anInt2687);
			    } catch (RuntimeException runtimeexception) {
				break while_101_;
			    }
			    return;
			} while (false);
			try {
			    method147(arg2, arg4 ^ 0x38);
			    method185(-24792);
			    break while_100_;
			} catch (RuntimeException runtimeexception) {
			    break while_101_;
			}
		    } while (false);
		    if (!arg3
			&& (anInt2703 ^ 0xffffffff) == (arg1 ^ 0xffffffff))
			aBoolean2697 = true;
		    if (arg2 == null || (arg2.length ^ 0xffffffff) >= -3) {
			aBooleanArray2698[arg1] = false;
			if (aBoolean2691 || arg3)
			    Class14_Sub8_Sub29.method633((byte) 2, arg4 ^ 0x45,
							 this, anInt2687, arg3,
							 anIntArray202[arg1],
							 arg1);
			break;
		    }
		    do {
			try {
			    Class7.aCRC32_171.reset();
			    Class7.aCRC32_171.update(arg2, 0,
						     arg2.length + -2);
			    int i = (int) Class7.aCRC32_171.getValue();
			    int i_5_ = ((arg2[arg2.length - 1] & 0xff)
					+ ((0xff & arg2[-2 + arg2.length])
					   << 1295933416));
			    if (((anIntArray202[arg1] ^ 0xffffffff)
				 == (i ^ 0xffffffff))
				&& (i_5_ ^ 0xffffffff) == (anIntArray194[arg1]
							   ^ 0xffffffff))
				break;
			    aBooleanArray2698[arg1] = false;
			    if (aBoolean2691 || arg3)
				Class14_Sub8_Sub29.method633((byte) 2, 108,
							     this, anInt2687,
							     arg3,
							     (anIntArray202
							      [arg1]),
							     arg1);
			} catch (RuntimeException runtimeexception) {
			    break while_101_;
			}
			return;
		    } while (false);
		    try {
			aBooleanArray2698[arg1] = true;
			if (arg3)
			    anObjectArray192[arg1]
				= Class14_Sub2_Sub1.method251(false, arg2,
							      -109);
		    } catch (RuntimeException runtimeexception) {
			break while_101_;
		    }
		} while (false);
		break while_102_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("wl.PA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ',' + arg4
						+ ')'));
	} while (false);
    }
    
    public void method183(int arg0, byte[] arg1, boolean arg2, byte arg3,
			  boolean arg4) {
	try {
	    int i = -53 / ((-79 - arg3) / 43);
	    anInt2702++;
	    if (!arg2) {
		arg1[arg1.length - 2]
		    = (byte) (anIntArray194[arg0] >> 429511912);
		arg1[arg1.length + -1] = (byte) anIntArray194[arg0];
		if (aClass114_2689 != null) {
		    Class1.method71(aClass114_2689, arg0, (byte) -79, arg1);
		    aBooleanArray2698[arg0] = true;
		}
		if (arg4)
		    anObjectArray192[arg0]
			= Class14_Sub2_Sub1.method251(false, arg1, -106);
	    } else {
		if (aBoolean2697)
		    throw new RuntimeException();
		if (null != aClass114_2693)
		    Class1.method71(aClass114_2693, anInt2687, (byte) 107,
				    arg1);
		method147(arg1, 15);
		method185(-24792);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("wl.NA(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public int method178(int arg0, int arg1) {
    while_103_:
	do {
	    do {
		int i;
		try {
		    anInt2699++;
		    if (method153(arg1, -1))
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_103_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg0 != 0)
			method186((byte) 83);
		    if (anObjectArray192[arg1] == null)
			break;
		    i = 100;
		} catch (RuntimeException runtimeexception) {
		    break while_103_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (!aBooleanArray2698[arg1])
			break;
		    i = 100;
		} catch (RuntimeException runtimeexception) {
		    break while_103_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = Class133_Sub3.method1829(anInt2687, -127, arg1);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "wl.FA(" + arg0 + ',' + arg1 + ')');
    }
    
    public static boolean method184(byte arg0, int arg1) {
    while_104_:
	do {
	    do {
		boolean bool;
		try {
		    if (arg0 >= 42)
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_104_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		anInt2705++;
		bool = (arg1 >= 97 && arg1 <= 122
			|| arg1 >= 65 && -91 <= (arg1 ^ 0xffffffff));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "wl.LA(" + arg0 + ',' + arg1 + ')');
    }
    
    public void method185(int arg0) {
    while_106_:
	do {
	while_105_:
	    do {
		do {
		    try {
			anInt2707++;
			aBooleanArray2698
			    = new boolean[anObjectArray192.length];
			for (int i = 0;
			     ((aBooleanArray2698.length ^ 0xffffffff)
			      < (i ^ 0xffffffff));
			     i++)
			    aBooleanArray2698[i] = false;
			if (null != aClass114_2689)
			    break;
			aBoolean2697 = true;
		    } catch (RuntimeException runtimeexception) {
			break while_105_;
		    }
		    return;
		} while (false);
		int i;
		do {
		    try {
			anInt2703 = -1;
			i = 0;
			if (arg0 == -24792)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_105_;
		    }
		    return;
		} while (false);
		try {
		    for (/**/; (i ^ 0xffffffff) > (aBooleanArray2698.length
						   ^ 0xffffffff); i++) {
			if (0 < anIntArray203[i]) {
			    Class149.method2018(this, i, aClass114_2689, true);
			    anInt2703 = i;
			}
		    }
		    if (-1 == anInt2703)
			aBoolean2697 = true;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_106_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "wl.RA(" + arg0 + ')');
	} while (false);
    }
    
    public int method186(byte arg0) {
    while_107_:
	do {
	    do {
		int i;
		try {
		    anInt2690++;
		    if (!aBoolean2697)
			break;
		    i = 100;
		} catch (RuntimeException runtimeexception) {
		    break while_107_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (null == anObjectArray192)
			break;
		    i = 99;
		} catch (RuntimeException runtimeexception) {
		    break while_107_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		int i_6_ = Class133_Sub3.method1829(255, -121, anInt2687);
		if (arg0 < 54)
		    method183(-9, null, false, (byte) -91, false);
		if (100 <= i_6_)
		    i_6_ = 99;
		i = i_6_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "wl.OA(" + arg0 + ')');
    }
}
