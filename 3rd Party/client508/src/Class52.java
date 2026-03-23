/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class52
{
    public static int anInt843;
    public static Class124 aClass124_844;
    public static boolean aBoolean845 = true;
    public static int anInt846;
    public static int anInt847;
    public static int anInt848;
    public int anInt849;
    public static Class124 aClass124_850;
    public static int anInt851;
    public Class55 aClass55_852;
    public static int anInt853;
    public static Class120 aClass120_854;
    public static int anInt855;
    public static int anInt856;
    public static Class124 aClass124_857;
    public static Class87 aClass87_858;
    public static Class124[] aClass124Array859;
    public static int anInt860;
    public static int anInt861;
    public static int anInt862;
    public Class81 aClass81_863 = new Class81();
    public int anInt864;
    
    public static int method1202(int arg0, int arg1) {
	int i;
	try {
	    arg1 = ((~0x55555554 & arg1) >>> 976332641) + (0x55555555 & arg1);
	    arg1
		= ((arg1 & ~0x33333332) >>> -1460804222) + (arg1 & 0x33333333);
	    arg1 = arg0 & (arg1 >>> 13535844) + arg1;
	    arg1 += arg1 >>> 504213768;
	    anInt856++;
	    arg1 += arg1 >>> 2031096656;
	    i = arg1 & 0xff;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gg.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public void method1203(byte arg0) {
	try {
	    aClass81_863.method1395((byte) 7);
	    aClass55_852.method1234(0);
	    anInt864 = anInt849;
	    if (arg0 > -31)
		aClass124_850 = null;
	    anInt860++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gg.A(" + arg0 + ')');
	}
    }
    
    public void method1204(int arg0, long arg1) {
    while_817_:
	do {
	while_816_:
	    do {
		Class14_Sub2_Sub18 class14_sub2_sub18;
		do {
		    try {
			class14_sub2_sub18
			    = ((Class14_Sub2_Sub18)
			       aClass55_852.method1230(arg1, (byte) -119));
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_816_;
		    }
		    return;
		} while (false);
		try {
		    if (null != class14_sub2_sub18) {
			class14_sub2_sub18.method233(0);
			class14_sub2_sub18.method246(-26366);
			anInt864++;
		    }
		    anInt862++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_817_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "gg.B(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public void method1205(byte arg0, Object arg1, long arg2) {
	try {
	    method1204(0, arg2);
	    if ((anInt864 ^ 0xffffffff) == -1) {
		Class14_Sub2_Sub18 class14_sub2_sub18
		    = (Class14_Sub2_Sub18) aClass81_863.method1397(-3);
		class14_sub2_sub18.method233(0);
		class14_sub2_sub18.method246(-26366);
	    } else
		anInt864--;
	    anInt861++;
	    if (arg0 != -93)
		method1206((byte) 26);
	    Class14_Sub2_Sub18_Sub2 class14_sub2_sub18_sub2
		= new Class14_Sub2_Sub18_Sub2(arg1);
	    aClass55_852.method1224(8, arg2, class14_sub2_sub18_sub2);
	    aClass81_863.method1401(false, class14_sub2_sub18_sub2);
	    class14_sub2_sub18_sub2.aLong2737 = 0L;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gg.F(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1206(byte arg0) {
	try {
	    aClass87_858 = null;
	    aClass124_857 = null;
	    aClass124Array859 = null;
	    int i = 115 % ((arg0 - -18) / 45);
	    aClass124_850 = null;
	    aClass124_844 = null;
	    aClass120_854 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gg.H(" + arg0 + ')');
	}
    }
    
    public static int method1207(byte arg0, int arg1) {
	int i;
	try {
	    if (arg0 >= -57)
		method1206((byte) -48);
	    anInt846++;
	    int i_0_ = arg1 * (arg1 * arg1 >> 75060012) >> -896491924;
	    int i_1_ = 6 * arg1 + -61440;
	    int i_2_ = (i_1_ * arg1 >> -641795124) + 40960;
	    i = i_2_ * i_0_ >> 1931685196;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gg.G(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public void method1208(byte arg0, int arg1) {
	try {
	    if (null != Class14_Sub8_Sub3.aClass39_4137) {
		for (Class14_Sub2_Sub18 class14_sub2_sub18
			 = ((Class14_Sub2_Sub18)
			    aClass81_863.method1400((byte) 19));
		     null != class14_sub2_sub18;
		     class14_sub2_sub18
			 = ((Class14_Sub2_Sub18)
			    aClass81_863.method1402(arg0 ^ 0x6de2))) {
		    if (!class14_sub2_sub18.method379((byte) -82)) {
			if (((long) arg1 ^ 0xffffffffffffffffL)
			    > (++class14_sub2_sub18.aLong2737
			       ^ 0xffffffffffffffffL)) {
			    Class14_Sub2_Sub18 class14_sub2_sub18_3_
				= (Class14_Sub8_Sub3.aClass39_4137.method1123
				   (class14_sub2_sub18, arg0 + 198));
			    aClass55_852.method1224(8,
						    (class14_sub2_sub18
						     .aLong355),
						    class14_sub2_sub18_3_);
			    Class14_Sub2_Sub8.method301(class14_sub2_sub18,
							false,
							class14_sub2_sub18_3_);
			    class14_sub2_sub18.method233(0);
			    class14_sub2_sub18.method246(-26366);
			}
		    } else if (null == class14_sub2_sub18.method377(true)) {
			class14_sub2_sub18.method233(arg0 ^ ~0x6f);
			class14_sub2_sub18.method246(-26366);
			anInt864++;
		    }
		}
	    }
	    anInt851++;
	    if (arg0 != -112)
		method1208((byte) -42, -8);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("gg.E(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method1209(byte arg0) {
	try {
	    Class14_Sub2_Sub18 class14_sub2_sub18
		= (Class14_Sub2_Sub18) aClass81_863.method1400((byte) 66);
	    if (arg0 != -96)
		method1206((byte) 85);
	    for (/**/; class14_sub2_sub18 != null;
		 class14_sub2_sub18
		     = (Class14_Sub2_Sub18) aClass81_863.method1402(-28046)) {
		if (class14_sub2_sub18.method379((byte) -72)) {
		    class14_sub2_sub18.method233(arg0 ^ ~0x5f);
		    class14_sub2_sub18.method246(arg0 ^ 0x66a2);
		    anInt864++;
		}
	    }
	    anInt843++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gg.D(" + arg0 + ')');
	}
    }
    
    public Object method1210(byte arg0, long arg1) {
    while_818_:
	do {
	    Class14_Sub2_Sub18 class14_sub2_sub18;
	    do {
		Object object;
		try {
		    class14_sub2_sub18
			= ((Class14_Sub2_Sub18)
			   aClass55_852.method1230(arg1, (byte) -116));
		    if (arg0 >= 56)
			break;
		    object = null;
		} catch (RuntimeException runtimeexception) {
		    break while_818_;
		}
		return object;
	    } while (false);
	    do {
		Object object;
		try {
		    anInt855++;
		    if (null != class14_sub2_sub18)
			break;
		    object = null;
		} catch (RuntimeException runtimeexception) {
		    break while_818_;
		}
		return object;
	    } while (false);
	    Object object;
	    do {
		Object object_4_;
		try {
		    object = class14_sub2_sub18.method377(true);
		    if (null != object)
			break;
		    class14_sub2_sub18.method233(0);
		    class14_sub2_sub18.method246(-26366);
		    anInt864++;
		    object_4_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_818_;
		}
		return object_4_;
	    } while (false);
	    Object object_5_;
	    try {
		if (!class14_sub2_sub18.method379((byte) -126)) {
		    aClass81_863.method1401(false, class14_sub2_sub18);
		    class14_sub2_sub18.aLong2737 = 0L;
		} else {
		    Class14_Sub2_Sub18_Sub2 class14_sub2_sub18_sub2
			= new Class14_Sub2_Sub18_Sub2(object);
		    aClass55_852.method1224(8, class14_sub2_sub18.aLong355,
					    class14_sub2_sub18_sub2);
		    aClass81_863.method1401(false, class14_sub2_sub18_sub2);
		    class14_sub2_sub18_sub2.aLong2737 = 0L;
		    class14_sub2_sub18.method233(0);
		    class14_sub2_sub18.method246(-26366);
		}
		object_5_ = object;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return object_5_;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "gg.I(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method1211(Class124 arg0, boolean arg1, int arg2) {
    while_822_:
	do {
	while_821_:
	    do {
		do {
		    try {
			anInt848++;
			if (arg2 >= 35)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_821_;
		    }
		    return;
		} while (false);
	    while_820_:
		do {
		while_819_:
		    do {
			do {
			    try {
				if (!arg1)
				    break while_819_;
				if (!Class106.aBoolean1783)
				    break;
				try {
				    Class144.method1982
					((byte) 122, "openjs",
					 (Class14_Sub8_Sub34.aClass43_4647
					  .anApplet712),
					 (new Object[]
					  { arg0.method1691
						(0, Class96
							.anApplet_Sub1_1632
							.getCodeBase())
						.toString() }));
				} catch (Throwable throwable) {
				    try {
					Object object = new Throwable();
					break;
				    } catch (RuntimeException PUSH) {
					break while_821_;
				    }
				}
			    } catch (RuntimeException runtimeexception) {
				break while_821_;
			    }
			    return;
			} while (false);
			try {
			    Class96.anApplet_Sub1_1632.getAppletContext()
				.showDocument
				(arg0.method1691(0, Class96
							.anApplet_Sub1_1632
							.getCodeBase()),
				 "_blank");
			} catch (Exception exception) {
			    /* empty */
			}
			break while_820_;
		    } while (false);
		    try {
			Class96.anApplet_Sub1_1632.getAppletContext()
			    .showDocument
			    (arg0.method1691(0, Class96.anApplet_Sub1_1632
						    .getCodeBase()),
			     "_top");
		    } catch (Exception exception) {
			/* empty */
		    }
		} while (false);
		break while_822_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("gg.J("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	} while (false);
    }
    
    public Class52(int arg0) {
	try {
	    anInt864 = arg0;
	    anInt849 = arg0;
	    int i;
	    for (i = 1; (i - -i ^ 0xffffffff) > (arg0 ^ 0xffffffff); i += i) {
		/* empty */
	    }
	    aClass55_852 = new Class55(i);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "gg.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aClass124_844 = Class14_Sub2_Sub2.method263(1178, "showingVideoAd");
	aClass124_857 = Class14_Sub2_Sub2.method263(1178, "<col=ff7000>");
	aClass124_850 = Class14_Sub2_Sub2.method263(1178, "scrollbar");
	anInt853 = 0;
    }
}
