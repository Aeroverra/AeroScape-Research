/* Class71 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.net.Socket;

public class Class71
{
    public static int anInt1083 = 0;
    public static Class9 aClass9_1084;
    public static int anInt1085 = 0;
    public static int[] anIntArray1086 = { 0, 1, 2, 3 };
    public int anInt1087;
    public int anInt1088;
    public float aFloat1089;
    public int anInt1090;
    public static int anInt1091;
    public static Class55 aClass55_1092;
    public int anInt1093;
    public static int anInt1094;
    public float aFloat1095;
    public float aFloat1096;
    public int anInt1097;
    public static int anInt1098;
    public static Class124 aClass124_1099
	= Class14_Sub2_Sub2.method263(1178, "_labels");
    public int anInt1100;
    public static int anInt1101;
    
    public static void method1315(int arg0) {
    while_893_:
	do {
	while_892_:
	    do {
		do {
		    try {
			anInt1094++;
			if (arg0 != Class142.anInt2315
			    && 5 != Class142.anInt2315)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_892_;
		    }
		    return;
		} while (false);
	    while_891_:
		do {
		while_890_:
		    do {
			do {
			    try {
				if ((++Class14_Sub20.anInt3087 ^ 0xffffffff)
				    >= -2001)
				    break;
				if (Class14_Sub15.aClass36_2990 != null) {
				    Class14_Sub15.aClass36_2990
					.method1101((byte) 113);
				    Class14_Sub15.aClass36_2990 = null;
				}
				if (-2 < (Class7.anInt179 ^ 0xffffffff)) {
				    Class14_Sub20.anInt3087 = 0;
				    Class142.anInt2315 = 1;
				    if (Class131.anInt2164
					!= Class84.anInt1346)
					Class131.anInt2164 = Class84.anInt1346;
				    else
					Class131.anInt2164
					    = Class99_Sub2.anInt3348;
				    Class7.anInt179++;
				    break;
				}
				Class14_Sub8_Sub26.anInt4525 = -5;
				Class142.anInt2315 = 0;
			    } catch (RuntimeException runtimeexception) {
				break while_892_;
			    }
			    return;
			} while (false);
		    while_885_:
			do {
			    do {
				try {
				    if (-2
					== (Class142.anInt2315 ^ 0xffffffff)) {
					Class14_Sub8_Sub22.aClass31_4454
					    = (Class14_Sub8_Sub34
						   .aClass43_4647.method1153
					       (0,
						Class14_Sub8_Sub31.aString4605,
						Class131.anInt2164));
					Class142.anInt2315 = 2;
				    }
				    if (Class142.anInt2315 != 2)
					break while_885_;
				    if (-3 == ((Class14_Sub8_Sub22
						.aClass31_4454.anInt529)
					       ^ 0xffffffff))
					throw new IOException();
				    if (1 == (Class14_Sub8_Sub22.aClass31_4454
					      .anInt529))
					break;
				} catch (IOException ioexception) {
				    break while_890_;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
				return;
			    } while (false);
			    do {
				try {
				    Class14_Sub15.aClass36_2990
					= new Class36(((Socket)
						       (Class14_Sub8_Sub22
							.aClass31_4454
							.anObject530)),
						      (Class14_Sub8_Sub34
						       .aClass43_4647));
				    Class14_Sub8_Sub22.aClass31_4454 = null;
				    long l
					= (Class48.aLong802
					   = Class14_Sub8_Sub9
						 .aClass124_4241
						 .method1692(0));
				    int i = (int) (l >> -728053296 & 0x1fL);
				    Class55.aClass14_Sub10_Sub1_891.anInt2908
					= 0;
				    Class55.aClass14_Sub10_Sub1_891
					.method809(false, 14);
				    Class55.aClass14_Sub10_Sub1_891
					.method809(false, i);
				    Class14_Sub15.aClass36_2990.method1100
					(0, 3, 2,
					 (Class55.aClass14_Sub10_Sub1_891
					  .aByteArray2895));
				    if (Class14_Sub8_Sub35.aClass75_4682
					!= null)
					Class14_Sub8_Sub35.aClass75_4682
					    .method1338(255);
				    if (null != Class134.aClass75_2588)
					Class134.aClass75_2588.method1338(255);
				    int i_0_ = Class14_Sub15.aClass36_2990
						   .method1107((byte) 30);
				    if (null
					!= Class14_Sub8_Sub35.aClass75_4682)
					Class14_Sub8_Sub35.aClass75_4682
					    .method1338(arg0 ^ 0xff);
				    if (Class134.aClass75_2588 != null)
					Class134.aClass75_2588.method1338(255);
				    if (i_0_ == 0)
					break;
				    Class14_Sub8_Sub26.anInt4525 = i_0_;
				    Class142.anInt2315 = 0;
				    Class14_Sub15.aClass36_2990
					.method1101((byte) -23);
				    Class14_Sub15.aClass36_2990 = null;
				} catch (IOException ioexception) {
				    break while_890_;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
				return;
			    } while (false);
			    try {
				Class142.anInt2315 = 3;
			    } catch (RuntimeException runtimeexception) {
				break while_892_;
			    }
			} while (false);
			if ((Class142.anInt2315 ^ 0xffffffff) == -4) {
				try {
			    if (-9 < (Class14_Sub15.aClass36_2990
					  .method1104(24249)
				      ^ 0xffffffff))
				return;
				} catch (IOException ioexception) {
				break while_890_;
				}
			    try {
				Class14_Sub15.aClass36_2990.method1099
				    (8, (Class14_Sub8_Sub38
					 .aClass14_Sub10_Sub1_4734
					 .aByteArray2895), -1, 0);
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .anInt2908
				    = 0;
				Class69.aLong1069
				    = Class14_Sub8_Sub38
					  .aClass14_Sub10_Sub1_4734
					  .method796(85);
				Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
				int[] is = new int[4];
				is[3] = (int) Class69.aLong1069;
				is[0] = (int) (Math.random() * 9.9999999E7);
				is[2] = (int) (Class69.aLong1069 >> 606048928);
				is[1] = (int) (Math.random() * 9.9999999E7);
				Class55.aClass14_Sub10_Sub1_891
				    .method809(false, 10);
				Class55.aClass14_Sub10_Sub1_891
				    .method803(is[0], 120);
				Class55.aClass14_Sub10_Sub1_891
				    .method803(is[1], 92);
				Class55.aClass14_Sub10_Sub1_891
				    .method803(is[2], 116);
				Class55.aClass14_Sub10_Sub1_891
				    .method803(is[3], arg0 ^ 0x44);
				Class55.aClass14_Sub10_Sub1_891.method817
				    (Class14_Sub8_Sub9.aClass124_4241
					 .method1692(0),
				     arg0 ^ 0x56);
				Class55.aClass14_Sub10_Sub1_891.method814
				    (32768, Class14_Sub8_Sub9.aClass124_4242);
				Class55.aClass14_Sub10_Sub1_891.method794
				    (Class9_Sub1.aBigInteger2704,
				     Class152.aBigInteger2433, 0);
				Class70.aClass14_Sub10_Sub1_1080.anInt2908 = 0;
				if (-41 == (Class14_Sub8_Sub16.anInt4356
					    ^ 0xffffffff))
				    Class70.aClass14_Sub10_Sub1_1080
					.method809(false, 18);
				else
				    Class70.aClass14_Sub10_Sub1_1080
					.method809(false, 16);
				Class70.aClass14_Sub10_Sub1_1080.method833
				    ((byte) 91,
				     (151
				      + (Class55.aClass14_Sub10_Sub1_891
					 .anInt2908)
				      + Class107.method1550((Class14_Sub9_Sub1
							     .aClass124_4829),
							    (byte) -107)));
				Class70.aClass14_Sub10_Sub1_1080
				    .method803(508, 116);
				Class70.aClass14_Sub10_Sub1_1080
				    .method809(false, Class75.anInt1163);
				Class70.aClass14_Sub10_Sub1_1080
				    .method809(false, 1);
				Class70.aClass14_Sub10_Sub1_1080.method809
				    (false, Class1.method73((byte) -58));
				Class70.aClass14_Sub10_Sub1_1080
				    .method833((byte) 89, Class83.anInt1340);
				Class70.aClass14_Sub10_Sub1_1080.method833
				    ((byte) 103, Class14_Sub20.anInt3094);
				Class39.method1125((Class70
						    .aClass14_Sub10_Sub1_1080),
						   (byte) -108);
				Class70.aClass14_Sub10_Sub1_1080.method814
				    (arg0 + 32768,
				     Class14_Sub9_Sub1.aClass124_4829);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub2_Sub11.anInt3884, 96);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub6.method463((byte) -124), 69);
				Class9.aBoolean214 = true;
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class75.aClass9_Sub1_1167.anInt242,
				     arg0 ^ 0x56);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class109.aClass9_Sub1_1834.anInt242, 95);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class138.aClass9_Sub1_2222.anInt242, 96);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub17.aClass9_Sub1_3021.anInt242,
				     arg0 ^ 0x49);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub10.aClass9_Sub1_2901.anInt242,
				     66);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub13.aClass9_Sub1_2958.anInt242,
				     arg0 + 75);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class125_Sub2.aClass9_Sub1_3374.anInt242,
				     98);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub8_Sub38.aClass9_Sub1_4739
				      .anInt242),
				     65);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub3.aClass9_Sub1_2750.anInt242,
				     76);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class98.aClass9_Sub1_1666.anInt242, 122);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub8_Sub14.aClass9_Sub1_4323
				      .anInt242),
				     82);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub8_Sub31.aClass9_Sub1_4603
				      .anInt242),
				     arg0 ^ 0x60);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub8_Sub26.aClass9_Sub1_4521
				      .anInt242),
				     99);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class64.aClass9_Sub1_1015.anInt242,
				     arg0 ^ 0x76);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub2_Sub18_Sub2.aClass9_Sub1_5085
				      .anInt242),
				     arg0 + 109);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class47.aClass9_Sub1_790.anInt242,
				     arg0 ^ 0x59);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class89.aClass9_Sub1_1407.anInt242, 118);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14.aClass9_Sub1_369.anInt242, 127);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class102.aClass9_Sub1_1712.anInt242, 90);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class127.aClass9_Sub1_2111.anInt242, 101);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class22.aClass9_Sub1_459.anInt242, 65);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class100.aClass9_Sub1_1690.anInt242, 112);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub8.aClass9_Sub1_2848.anInt242,
				     106);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class7_Sub1.aClass9_Sub1_2657.anInt242,
				     97);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class14_Sub21.aClass9_Sub1_3111.anInt242,
				     85);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    (Class28.aClass9_Sub1_513.anInt242, 97);
				Class70.aClass14_Sub10_Sub1_1080.method803
				    ((Class14_Sub2_Sub7.aClass9_Sub1_3824
				      .anInt242),
				     105);
				Class70.aClass14_Sub10_Sub1_1080.method807
				    (Class55.aClass14_Sub10_Sub1_891.anInt2908,
				     (Class55.aClass14_Sub10_Sub1_891
				      .aByteArray2895),
				     0, -1076444960);
				Class14_Sub15.aClass36_2990.method1100
				    (0, 3,
				     (Class70.aClass14_Sub10_Sub1_1080
				      .anInt2908),
				     (Class70.aClass14_Sub10_Sub1_1080
				      .aByteArray2895));
				Class55.aClass14_Sub10_Sub1_891
				    .method850(is, -122);
				for (int i = 0; -5 < (i ^ 0xffffffff); i++)
				    is[i] += 50;
				Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
				    .method850(is, -127);
				Class142.anInt2315 = 4;
			    } catch (IOException ioexception) {
				break;
			    } catch (RuntimeException runtimeexception) {
				break while_892_;
			    }
			}
		    while_887_:
			do {
			    if (-5 == (Class142.anInt2315 ^ 0xffffffff)) {
				try {
				if (1 > Class14_Sub15.aClass36_2990
					    .method1104(24249))
				    return;
				} catch (IOException ioexception) {
				break while_890_;
				}
			    while_886_:
				do {
				    int i;
				    do {
					try {
					    i = Class14_Sub15.aClass36_2990
						    .method1107((byte) 30);
					    if (-22 == (i ^ 0xffffffff))
						break while_886_;
					    if (-2 != (i ^ 0xffffffff))
						break;
					    Class142.anInt2315 = 5;
					    Class14_Sub8_Sub26.anInt4525 = i;
					} catch (IOException ioexception) {
					    break while_890_;
					} catch (RuntimeException runtimeexception) {
					    break while_892_;
					}
					return;
				    } while (false);
				    do {
					try {
					    if (2 == i) {
						Class142.anInt2315 = 8;
						break while_887_;
					    }
					    if ((i ^ 0xffffffff) != -16)
						break;
					    Class142.anInt2315 = 0;
					    Class14_Sub8_Sub26.anInt4525 = i;
					} catch (RuntimeException runtimeexception) {
					    break while_892_;
					}
					return;
				    } while (false);
				    do {
					try {
					    if (i == 23 && (Class7.anInt179
							    ^ 0xffffffff) > -2)
						break;
					    Class14_Sub8_Sub26.anInt4525 = i;
					    Class142.anInt2315 = 0;
					    Class14_Sub15.aClass36_2990
						.method1101((byte) 121);
					    Class14_Sub15.aClass36_2990 = null;
					} catch (RuntimeException runtimeexception) {
					    break while_892_;
					}
					return;
				    } while (false);
				    try {
					Class142.anInt2315 = 1;
					Class7.anInt179++;
					Class14_Sub20.anInt3087 = 0;
					Class14_Sub15.aClass36_2990
					    .method1101((byte) -85);
					Class14_Sub15.aClass36_2990 = null;
				    } catch (RuntimeException runtimeexception) {
					break while_892_;
				    }
				    return;
				} while (false);
				try {
				    Class142.anInt2315 = 7;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
			    }
			} while (false);
			if (Class142.anInt2315 == 6) {
			    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 17);
				try {
			    Class14_Sub15.aClass36_2990.method1100
				(0, 3,
				 Class55.aClass14_Sub10_Sub1_891.anInt2908,
				 (Class55.aClass14_Sub10_Sub1_891
				  .aByteArray2895));
				} catch (IOException ioexception) {
					break while_890_;
				}
			    Class142.anInt2315 = 4;
			} else {
			while_888_:
			    do {
				do {
				    try {
					if (-8 != (Class142.anInt2315
						   ^ 0xffffffff))
					    break while_888_;
					if (Class14_Sub15.aClass36_2990
						.method1104(24249)
					    >= 1)
					    break;
				    } catch (IOException ioexception) {
					break while_890_;
				    } catch (RuntimeException runtimeexception) {
					break while_892_;
				    }
				    return;
				} while (false);
				try {
				    Class14_Sub8_Sub30.anInt4598
					= 60 * (Class14_Sub15.aClass36_2990
						    .method1107((byte) 30)
						- -3);
				    Class142.anInt2315 = 0;
				    Class14_Sub8_Sub26.anInt4525 = 21;
				    Class14_Sub15.aClass36_2990
					.method1101((byte) -113);
				    Class14_Sub15.aClass36_2990 = null;
				} catch (IOException ioexception) {
				    break while_890_;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
				return;
			    } while (false);
			while_889_:
			    do {
				do {
				    try {
					if (8 != Class142.anInt2315)
					    break while_889_;
					if ((Class14_Sub15.aClass36_2990
						 .method1104(24249)
					     ^ 0xffffffff)
					    <= -12)
					    break;
				    } catch (IOException ioexception) {
					break while_890_;
				    } catch (RuntimeException runtimeexception) {
					break while_892_;
				    }
				    return;
				} while (false);
				try {
				    Class14_Sub15.aClass36_2990.method1099
					(11, (Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .aByteArray2895), -1, 0);
				    Class14_Sub8_Sub38
					.aClass14_Sub10_Sub1_4734.anInt2908
					= 0;
				    Class152.anInt2439
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method798(107);
				    Class14_Sub10.anInt2889
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method798(96);
				    Class146.anInt2365
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method798(96);
				    if (Class146.anInt2365 == 1) {
					try {
					    Class35.aClass124_597.method1666
						((Class14_Sub8_Sub34
						  .aClass43_4647.anApplet712),
						 false);
					} catch (Throwable throwable) {
					    /* empty */
					}
				    } else {
					try {
					    Class18.aClass124_415.method1666
						((Class14_Sub8_Sub34
						  .aClass43_4647.anApplet712),
						 false);
					} catch (Throwable throwable) {
					    /* empty */
					}
				    }
				    Class14_Sub2_Sub21.anInt4081
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method798(arg0 ^ ~0x7e);
				    Class14_Sub8_Sub10.aBoolean4249
					= (Class14_Sub8_Sub38
					       .aClass14_Sub10_Sub1_4734
					       .method798(54)
					   ^ 0xffffffff) == -2;
				    Class14_Sub2_Sub10.anInt3868
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method784((byte) 117);
				    Class14_Sub20.anInt3090
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method798(107);
				    Class133_Sub4.anInt3579
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method847(arg0 ^ 0xff);
				    Class14_Sub8_Sub12.anInt4280
					= Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .method784((byte) 121);
				    Class142.anInt2315 = 9;
				} catch (IOException ioexception) {
				    break while_890_;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
			    } while (false);
			    if (Class142.anInt2315 == 9) {
				try {
				if ((Class14_Sub15.aClass36_2990
					 .method1104(24249)
				     ^ 0xffffffff)
				    <= (Class14_Sub8_Sub12.anInt4280
					^ 0xffffffff)) {
				    try {
					Class14_Sub8_Sub38
					    .aClass14_Sub10_Sub1_4734.anInt2908
					    = 0;
					Class14_Sub15.aClass36_2990.method1099
					    (Class14_Sub8_Sub12.anInt4280,
					     (Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .aByteArray2895),
					     -1, 0);
					Class14_Sub8_Sub26.anInt4525 = 2;
					Class142.anInt2315 = 0;
					Class37.method1109(12827);
					Class129.anInt2133 = -1;
					Class139.method1951((byte) -119,
							    false);
					Class133_Sub4.anInt3579 = -1;
				    } catch (IOException ioexception) {
					break;
				    } catch (RuntimeException runtimeexception) {
					break while_892_;
				    }
				}
				} catch (IOException ioexception) {
				    break while_890_;
				}
			    } else {
				try {
				    break while_891_;
				} catch (RuntimeException runtimeexception) {
				    break while_892_;
				}
			    }
			    return;
			}
			return;
		    } while (false);
		    Object object = new Throwable();
		    if (Class14_Sub15.aClass36_2990 != null) {
			Class14_Sub15.aClass36_2990.method1101((byte) 125);
			Class14_Sub15.aClass36_2990 = null;
		    }
		    if (1 <= Class7.anInt179) {
			Class142.anInt2315 = 0;
			Class14_Sub8_Sub26.anInt4525 = -4;
		    } else {
			Class7.anInt179++;
			Class14_Sub20.anInt3087 = 0;
			Class142.anInt2315 = 1;
			if ((Class131.anInt2164 ^ 0xffffffff)
			    != (Class84.anInt1346 ^ 0xffffffff))
			    Class131.anInt2164 = Class84.anInt1346;
			else
			    Class131.anInt2164 = Class99_Sub2.anInt3348;
		    }
		} while (false);
		break while_893_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ji.B(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1316(boolean arg0) {
	try {
	    aClass124_1099 = null;
	    aClass9_1084 = null;
	    aClass55_1092 = null;
	    anIntArray1086 = null;
	    if (arg0 != true)
		anInt1101 = 105;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ji.C(" + arg0 + ')');
	}
    }
    
    public static void method1317(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt1091++;
	    int i = 0;
	    int i_1_ = -40 / ((32 - arg3) / 52);
	    for (/**/;
		 (i ^ 0xffffffff) > (Class14_Sub17.anInt3012 ^ 0xffffffff);
		 i++) {
		if (((arg4 ^ 0xffffffff)
		     > (Class110.anIntArray1854[i] + Class9.anIntArray215[i]
			^ 0xffffffff))
		    && (Class9.anIntArray215[i] ^ 0xffffffff) > (arg2 + arg4
								 ^ 0xffffffff)
		    && (arg0 ^ 0xffffffff) > ((Class74.anIntArray1135[i]
					       - -Class137.anIntArray2205[i])
					      ^ 0xffffffff)
		    && ((Class74.anIntArray1135[i] ^ 0xffffffff)
			> (arg1 + arg0 ^ 0xffffffff)))
		    Class7_Sub2_Sub1.aBooleanArray3703[i] = true;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ji.A(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public static void method1318(byte arg0) {
	try {
	    anInt1098++;
	    for (int i = 0; i < Class2.anInt96; i++) {
		Class14_Sub2_Sub14.anIntArray3949[i]--;
		if (-10 > Class14_Sub2_Sub14.anIntArray3949[i]) {
		    Class2.anInt96--;
		    for (int i_2_ = i;
			 (i_2_ ^ 0xffffffff) > (Class2.anInt96 ^ 0xffffffff);
			 i_2_++) {
			Class153.anIntArray2454[i_2_]
			    = Class153.anIntArray2454[1 + i_2_];
			Class137.aClass91Array2197[i_2_]
			    = Class137.aClass91Array2197[1 + i_2_];
			Class14_Sub2_Sub19.anIntArray4052[i_2_]
			    = Class14_Sub2_Sub19.anIntArray4052[i_2_ - -1];
			Class14_Sub2_Sub14.anIntArray3949[i_2_]
			    = Class14_Sub2_Sub14.anIntArray3949[1 + i_2_];
			Class116.anIntArray1928[i_2_]
			    = Class116.anIntArray1928[1 + i_2_];
		    }
		    i--;
		} else {
		    Class91 class91 = Class137.aClass91Array2197[i];
		    if (class91 == null) {
			class91
			    = Class91.method1451((Class14_Sub10
						  .aClass9_Sub1_2901),
						 Class153.anIntArray2454[i],
						 0);
			if (null == class91)
			    continue;
			Class14_Sub2_Sub14.anIntArray3949[i]
			    += class91.method1450();
			Class137.aClass91Array2197[i] = class91;
		    }
		    if (Class14_Sub2_Sub14.anIntArray3949[i] < 0) {
			int i_3_;
			if ((Class116.anIntArray1928[i] ^ 0xffffffff) == -1)
			    i_3_ = Class14_Sub29.anInt3266;
			else {
			    int i_4_
				= (Class116.anIntArray1928[i] & 0xff) * 128;
			    int i_5_ = ((Class116.anIntArray1928[i] & 0xfffc5c)
					>> -717654160);
			    int i_6_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3495)
					+ (64 + 128 * i_5_));
			    int i_7_ = ((0xff17 & Class116.anIntArray1928[i])
					>> -744663992);
			    if (0 > i_6_)
				i_6_ = -i_6_;
			    int i_8_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748
					  .anInt3436)
					+ (i_7_ * 128 + 64));
			    if ((i_8_ ^ 0xffffffff) > -1)
				i_8_ = -i_8_;
			    int i_9_ = -128 + (i_8_ + i_6_);
			    if (i_4_ < i_9_) {
				Class14_Sub2_Sub14.anIntArray3949[i] = -100;
				continue;
			    }
			    if (0 > i_9_)
				i_9_ = 0;
			    i_3_ = Class100.anInt1691 * (i_4_ - i_9_) / i_4_;
			}
			if ((i_3_ ^ 0xffffffff) < -1) {
			    Class14_Sub12_Sub1 class14_sub12_sub1
				= class91.method1449()
				      .method857(Class85.aClass18_1362);
			    Class14_Sub9_Sub4 class14_sub9_sub4
				= (Class14_Sub9_Sub4.method775
				   (class14_sub12_sub1, 100, i_3_));
			    class14_sub9_sub4.method765(-1
							+ (Class14_Sub2_Sub19
							   .anIntArray4052
							   [i]));
			    Class33.aClass14_Sub9_Sub2_585
				.method735(class14_sub9_sub4);
			}
			Class14_Sub2_Sub14.anIntArray3949[i] = -100;
		    }
		}
	    }
	    if (arg0 != 112)
		method1318((byte) 70);
	    if (Class14_Sub7.aBoolean2827 && !Class14_Sub11.method852(14326)) {
		if (-1 != (Class14_Sub23.anInt3135 ^ 0xffffffff)
		    && Class14_Sub8.anInt2856 != -1)
		    Class33.method1087(1936, 0, false, Class14_Sub8.anInt2856,
				       Class125_Sub2.aClass9_Sub1_3374,
				       Class14_Sub23.anInt3135);
		Class14_Sub7.aBoolean2827 = false;
	    } else if (0 != Class14_Sub23.anInt3135
		       && 0 != (Class14_Sub8.anInt2856 ^ 0xffffffff)
		       && !Class14_Sub11.method852(arg0 + 14214)) {
		Class118.anInt1986++;
		Class55.aClass14_Sub10_Sub1_891.method843(0, 247);
		Class55.aClass14_Sub10_Sub1_891
		    .method803(Class14_Sub8.anInt2856, arg0 ^ 0x16);
		Class14_Sub8.anInt2856 = -1;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ji.D(" + arg0 + ')');
	}
    }
    
    public Class71() {
	try {
	    anInt1097 = -60;
	    aFloat1095 = 1.2F;
	    aFloat1096 = 0.69921875F;
	    anInt1100 = 0;
	    anInt1090 = -50;
	    anInt1088 = Class57.anInt935;
	    aFloat1089 = 1.1523438F;
	    anInt1093 = Class57.anInt929;
	    anInt1087 = -50;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ji.<init>()");
	}
    }
    
    public Class71(Class14_Sub10 arg0) {
	try {
	    int i = arg0.method798(113);
	    if (0 == (0x1 & i))
		anInt1088 = Class57.anInt935;
	    else
		anInt1088 = arg0.method812((byte) -97);
	    if (-1 == (0x2 & i ^ 0xffffffff))
		aFloat1089 = 1.1523438F;
	    else
		aFloat1089 = (float) arg0.method784((byte) 110) / 256.0F;
	    if (0 != (i & 0x4))
		aFloat1096 = (float) arg0.method784((byte) 122) / 256.0F;
	    else
		aFloat1096 = 0.69921875F;
	    if (-1 == (i & 0x8 ^ 0xffffffff))
		aFloat1095 = 1.2F;
	    else
		aFloat1095 = (float) arg0.method784((byte) 120) / 256.0F;
	    if ((0x10 & i) != 0) {
		anInt1087 = arg0.method805(0);
		anInt1097 = arg0.method805(0);
		anInt1090 = arg0.method805(0);
	    } else {
		anInt1097 = -60;
		anInt1090 = -50;
		anInt1087 = -50;
	    }
	    if ((i & 0x20 ^ 0xffffffff) == -1)
		anInt1093 = Class57.anInt929;
	    else
		anInt1093 = arg0.method812((byte) -96);
	    if (0 == (0x40 & i))
		anInt1100 = 0;
	    else
		anInt1100 = arg0.method784((byte) 111);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ji.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass55_1092 = new Class55(4096);
    }
}
