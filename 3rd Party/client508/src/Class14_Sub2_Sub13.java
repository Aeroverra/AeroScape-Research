/* Class14_Sub2_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub2_Sub13 extends Class14_Sub2
{
    public static int anInt3919;
    public int anInt3920;
    public static int anInt3921;
    public static byte[][] aByteArrayArray3922 = new byte[250][];
    public static int anInt3923;
    public static long[] aLongArray3924 = new long[500];
    public Class124 aClass124_3925;
    public static Class124 aClass124_3926;
    public static int anInt3927;
    public static int anInt3928;
    public static int anInt3929;
    public static int anInt3930;
    public static int anInt3931 = 0;
    public static int anInt3932;
    public static int anInt3933;
    
    public static void method325(int arg0) {
	try {
	    aClass124_3926 = null;
	    if (arg0 != 8)
		method325(-31);
	    aLongArray3924 = null;
	    aByteArrayArray3922 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ma.F(" + arg0 + ')');
	}
    }
    
    public void method326(boolean arg0) {
    while_202_:
	do {
	while_201_:
	    do {
		do {
		    try {
			anInt3919++;
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_201_;
		    }
		    return;
		} while (false);
		try {
		    aLong2737 |= ~0x7fffffffffffffffL;
		    if (-1L == (method330((byte) -104) ^ 0xffffffffffffffffL))
			Class14_Sub8_Sub27.aClass81_4546.method1401(false,
								    this);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_202_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ma.G(" + arg0 + ')');
	} while (false);
    }
    
    public Class14_Sub2_Sub13(int arg0, int arg1) {
	try {
	    aLong355 = (long) arg0 << 1428384800 | (long) arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ma.<init>(" + arg0 + ','
						+ arg1 + ')'));
	}
    }
    
    public void method327(byte arg0) {
    while_204_:
	do {
	while_203_:
	    do {
		do {
		    try {
			anInt3921++;
			aLong2737 = (Class84.method1413((byte) -126) - -500L
				     | aLong2737 & ~0x7fffffffffffffffL);
			if (arg0 == 51)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_203_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8.aClass81_2844.method1401(false, this);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_204_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ma.A(" + arg0 + ')');
	} while (false);
    }
    
    public int method328(byte arg0) {
	int i;
	try {
	    if (arg0 != 114)
		aClass124_3926 = null;
	    anInt3933++;
	    i = (int) (aLong355 >>> -1161423072 & 0xffL);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ma.B(" + arg0 + ')');
	}
	return i;
    }
    
    public static void method329(boolean arg0) {
    while_206_:
	do {
	while_205_:
	    do {
		do {
		    try {
			anInt3932++;
			Class14_Sub2_Sub1.method259(false, 11988);
			client.anInt2648 = 0;
			boolean bool = arg0;
			for (int i = 0; i < Class5.aByteArrayArray139.length;
			     i++) {
			    if (Class62.anIntArray992[i] != -1
				&& Class5.aByteArrayArray139[i] == null) {
				Class5.aByteArrayArray139[i]
				    = (Class14_Sub13.aClass9_Sub1_2958
					   .method163
				       (0, Class62.anIntArray992[i], 0));
				if (Class5.aByteArrayArray139[i] == null) {
				    bool = false;
				    client.anInt2648++;
				}
			    }
			    if (-1 != Class150.anIntArray2422[i]
				&& (Class14_Sub20.aByteArrayArray3097[i]
				    == null)) {
				Class14_Sub20.aByteArrayArray3097[i]
				    = (Class14_Sub13.aClass9_Sub1_2958
					   .method149
				       (-23245, 0,
					Class125_Sub3.anIntArrayArray3391[i],
					Class150.anIntArray2422[i]));
				if (null
				    == Class14_Sub20.aByteArrayArray3097[i]) {
				    bool = false;
				    client.anInt2648++;
				}
			    }
			    if (-1 != Class14_Sub2_Sub15.anIntArray3955[i]
				&& null == (Class14_Sub2_Sub12
					    .aByteArrayArray3913[i])) {
				Class14_Sub2_Sub12.aByteArrayArray3913[i]
				    = (Class14_Sub13.aClass9_Sub1_2958
					   .method163
				       (0,
					Class14_Sub2_Sub15.anIntArray3955[i],
					0));
				if (Class14_Sub2_Sub12.aByteArrayArray3913[i]
				    == null) {
				    client.anInt2648++;
				    bool = false;
				}
			    }
			    if (((Class14_Sub22.anIntArray3119[i] ^ 0xffffffff)
				 != 0)
				&& null == Class14.aByteArrayArray362[i]) {
				Class14.aByteArrayArray362[i]
				    = (Class14_Sub13.aClass9_Sub1_2958
					   .method163
				       (0, Class14_Sub22.anIntArray3119[i],
					0));
				if (Class14.aByteArrayArray362[i] == null) {
				    client.anInt2648++;
				    bool = false;
				}
			    }
			    if (Class134.anIntArray2590 != null
				&& null == (Class14_Sub8_Sub28
					    .aByteArrayArray4556[i])
				&& Class134.anIntArray2590[i] != -1) {
				Class14_Sub8_Sub28.aByteArrayArray4556[i]
				    = (Class14_Sub13.aClass9_Sub1_2958
					   .method149
				       (-23245, 0,
					Class125_Sub3.anIntArrayArray3391[i],
					Class134.anIntArray2590[i]));
				if (Class14_Sub8_Sub28.aByteArrayArray4556[i]
				    == null) {
				    bool = false;
				    client.anInt2648++;
				}
			    }
			}
			if (Class70.aClass14_Sub2_Sub5_1078 == null
			    || !(Class7_Sub1.aClass9_Sub1_2657.method166
				 ((byte) -83,
				  (Class14_Sub8_Sub7.method515
				   ((new Class124[]
				     { (Class70.aClass14_Sub2_Sub5_1078
					.aClass124_3804),
				       Class14_Sub8_Sub6.aClass124_4192 }),
				    (byte) -109)))))
			    Class79.aClass146_1261 = null;
			else if (!Class7_Sub1.aClass9_Sub1_2657.method160
				  ((Class14_Sub8_Sub7.method515
				    ((new Class124[]
				      { (Class70.aClass14_Sub2_Sub5_1078
					 .aClass124_3804),
					Class14_Sub8_Sub6.aClass124_4192 }),
				     (byte) -34)),
				   (byte) -102)) {
			    client.anInt2648++;
			    bool = false;
			} else
			    Class79.aClass146_1261
				= (Class14_Sub8_Sub6.method507
				   (arg0,
				    (Class14_Sub8_Sub7.method515
				     ((new Class124[]
				       { (Class70.aClass14_Sub2_Sub5_1078
					  .aClass124_3804),
					 Class14_Sub8_Sub6.aClass124_4192 }),
				      (byte) -69)),
				    Class7_Sub1.aClass9_Sub1_2657));
			if (bool)
			    break;
			Class14_Sub18.anInt3064 = 1;
		    } catch (RuntimeException runtimeexception) {
			break while_205_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class149.anInt2383 = 0;
			boolean bool = true;
			for (int i = 0; ((i ^ 0xffffffff)
					 > (Class5.aByteArrayArray139.length
					    ^ 0xffffffff)); i++) {
			    byte[] is = Class14_Sub20.aByteArrayArray3097[i];
			    if (null != is) {
				int i_0_ = ((Class14_Sub8.anIntArray2858[i]
					     & 0xff) * 64
					    - Class58.anInt947);
				int i_1_ = ((Class14_Sub8.anIntArray2858[i]
					     >> -1976931128) * 64
					    + -Class133_Sub6.anInt3676);
				if (Class7_Sub2_Sub1.aBoolean3699) {
				    i_1_ = 10;
				    i_0_ = 10;
				}
				bool &= Class60.method1265((byte) -64, i_0_,
							   is, i_1_);
			    }
			    is = Class14.aByteArrayArray362[i];
			    if (is != null) {
				int i_2_
				    = (64 * (Class14_Sub8.anIntArray2858[i]
					     >> -1145500312)
				       - Class133_Sub6.anInt3676);
				int i_3_
				    = (-Class58.anInt947
				       + ((0xff
					   & Class14_Sub8.anIntArray2858[i])
					  * 64));
				if (Class7_Sub2_Sub1.aBoolean3699) {
				    i_3_ = 10;
				    i_2_ = 10;
				}
				bool &= Class60.method1265((byte) -52, i_3_,
							   is, i_2_);
			    }
			}
			if (bool)
			    break;
			Class14_Sub18.anInt3064 = 2;
		    } catch (RuntimeException runtimeexception) {
			break while_205_;
		    }
		    return;
		} while (false);
		try {
		    if (Class14_Sub18.anInt3064 != 0)
			Class84.method1411(true,
					   (Class14_Sub8_Sub7.method515
					    ((new Class124[]
					      { client.aClass124_2639,
						Class26_Sub2.aClass124_3301 }),
					     (byte) -76)),
					   true);
		    Class138.method1946(139);
		    Class14_Sub3.method451(0);
		    boolean bool = false;
		    Class56.method1240();
		    for (int i = 0; Class5.aByteArrayArray139.length > i;
			 i++) {
			if (null != Class14.aByteArrayArray362[i]
			    || (Class14_Sub2_Sub12.aByteArrayArray3913[i]
				!= null)) {
			    bool = true;
			    break;
			}
		    }
		    if (!Class15.aBoolean374)
			bool = false;
		    if (!bool)
			Class47.method1184();
		    else
			Class14_Sub11.method855(1);
		    for (int i = 0; (i ^ 0xffffffff) > -5; i++)
			Class14_Sub21.aClass32Array3100[i].method1071(true);
		    for (int i = 0; 4 > i; i++) {
			for (int i_4_ = 0; -105 < (i_4_ ^ 0xffffffff);
			     i_4_++) {
			    for (int i_5_ = 0; (i_5_ ^ 0xffffffff) > -105;
				 i_5_++)
				Class14_Sub8_Sub4.aByteArrayArrayArray4142
				    [i][i_4_][i_5_]
				    = (byte) 0;
			}
		    }
		    Class137.method1941(false, (byte) -84);
		    Class151.aClass148_Sub1_2428.method2010();
		    for (int i = 0; (i ^ 0xffffffff) > -14; i++) {
			for (int i_6_ = 0; -14 < (i_6_ ^ 0xffffffff); i_6_++)
			    Class151.aClass13ArrayArray2427[i][i_6_]
				.aBoolean346
				= true;
		    }
		    Class10.method201();
		    Class142.method1976((byte) 61);
		    Class138.method1946(139);
		    System.gc();
		    Class14_Sub2_Sub1.method259(true, 11988);
		    Class14_Sub29.method935(5, false);
		    if (!Class7_Sub2_Sub1.aBoolean3699) {
			Class100.method1512(false, (byte) -105);
			Class14_Sub2_Sub1.method259(true, 11988);
			int i = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anIntArray3443[0])
				 >> -879618589);
			int i_7_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .anIntArray3476[0])
				    >> 1455509251);
			Class62.method1275(i_7_, i, 1);
			Class45.method1166(false, !arg0);
			if (null != Class14_Sub8_Sub28.aByteArrayArray4556)
			    Class14_Sub22.method901((byte) -27);
		    }
		    if (Class7_Sub2_Sub1.aBoolean3699) {
			Class56.method1238(9857, false);
			Class14_Sub2_Sub1.method259(true, 11988);
			int i = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				  .anIntArray3476[0])
				 >> 1102196771);
			int i_8_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748
				     .anIntArray3443[0])
				    >> 1306837251);
			Class62.method1275(i, i_8_, 1);
			Class45.method1163(false, -83);
		    }
		    Class14_Sub3.method451(0);
		    Class14_Sub2_Sub1.method259(true, 11988);
		    Class14_Sub8_Sub2
			.method488(59, Class14_Sub21.aClass32Array3100, false);
		    Class10.method199();
		    Class14_Sub2_Sub1.method259(true, 11988);
		    int i = Class7_Sub2.anInt2676;
		    if (Class14_Sub2_Sub3.anInt3785 < i)
			i = Class14_Sub2_Sub3.anInt3785;
		    if (Class14_Sub2_Sub3.anInt3785 + -1 > i)
			i = Class14_Sub2_Sub3.anInt3785 + -1;
		    if (!Class128.method1755(130068615))
			Class109.method1566(Class7_Sub2.anInt2676);
		    else
			Class109.method1566(0);
		    Class63.method1278(-112);
		    if (bool) {
			Class14_Sub8_Sub28.method627(true);
			Class14_Sub29.method935(5, true);
			if (!Class7_Sub2_Sub1.aBoolean3699) {
			    Class100.method1512(true, (byte) -102);
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class45.method1166(true, !arg0);
			}
			if (Class7_Sub2_Sub1.aBoolean3699) {
			    Class56.method1238(9857, true);
			    Class14_Sub2_Sub1.method259(true, 11988);
			    Class45.method1163(true, -70);
			}
			Class14_Sub3.method451(0);
			Class14_Sub2_Sub1.method259(true, 11988);
			Class14_Sub8_Sub2.method488(-90,
						    (Class14_Sub21
						     .aClass32Array3100),
						    true);
			Class14_Sub2_Sub1.method259(true, 11988);
			Class63.method1278(-99);
			Class14_Sub8_Sub28.method627(false);
		    }
		    for (int i_9_ = 0; 13 > i_9_; i_9_++) {
			for (int i_10_ = 0; i_10_ < 13; i_10_++)
			    Class151.aClass13ArrayArray2427[i_9_][i_10_]
				.method227
				(Class114.anIntArrayArrayArray1896[0],
				 i_9_ * 8, i_10_ * 8);
		    }
		    for (int i_11_ = 0; -105 < (i_11_ ^ 0xffffffff); i_11_++) {
			for (int i_12_ = 0; 104 > i_12_; i_12_++)
			    Class67.method1300(i_12_, 9210, i_11_);
		    }
		    Class14_Sub8_Sub23.method602(-1);
		    Class138.method1946(139);
		    Class68.method1307((byte) -58);
		    Class14_Sub3.method451(0);
		    if (null != Class14_Sub14.aFrame2986
			&& null != Class14_Sub15.aClass36_2990
			&& 25 == Class14_Sub8_Sub16.anInt4356) {
			Class55.aClass14_Sub10_Sub1_891.method843(0, 22);
			Class7_Sub2_Sub1.anInt3704++;
			Class55.aClass14_Sub10_Sub1_891.method803(1057001181,
								  103);
		    }
		    if (!Class7_Sub2_Sub1.aBoolean3699) {
			int i_13_ = (Class129.anInt2133 + -6) / 8;
			int i_14_ = (Class129.anInt2133 - -6) / 8;
			int i_15_ = (6 + Class49.anInt818) / 8;
			int i_16_ = (-6 + Class49.anInt818) / 8;
			for (int i_17_ = -1 + i_13_; 1 + i_14_ >= i_17_;
			     i_17_++) {
			    for (int i_18_ = i_16_ + -1; i_18_ <= 1 + i_15_;
				 i_18_++) {
				if ((i_17_ ^ 0xffffffff) > (i_13_ ^ 0xffffffff)
				    || (i_17_ ^ 0xffffffff) < (i_14_
							       ^ 0xffffffff)
				    || (i_16_ ^ 0xffffffff) < (i_18_
							       ^ 0xffffffff)
				    || (i_15_ ^ 0xffffffff) > (i_18_
							       ^ 0xffffffff)) {
				    Class14_Sub13.aClass9_Sub1_2958.method162
					((byte) -106,
					 (Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { Class35.aClass124_601,
					      Class83.method1407(59, i_17_),
					      Class111.aClass124_1866,
					      Class83.method1407(114,
								 i_18_) }),
					   (byte) -10)));
				    Class14_Sub13.aClass9_Sub1_2958.method162
					((byte) -106,
					 (Class14_Sub8_Sub7.method515
					  ((new Class124[]
					    { Class111.aClass124_1863,
					      Class83.method1407(92, i_17_),
					      Class111.aClass124_1866,
					      Class83.method1407(33, i_18_) }),
					   (byte) -32)));
				}
			    }
			}
		    }
		    if (28 == Class14_Sub8_Sub16.anInt4356)
			Class126.method1743(27252, 10);
		    else {
			Class126.method1743(27252, 30);
			if (Class14_Sub15.aClass36_2990 != null)
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 60);
		    }
		    Class138.method1946(139);
		    Class14_Sub8_Sub11.method531((byte) -112);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_206_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ma.D(" + arg0 + ')');
	} while (false);
    }
    
    public long method330(byte arg0) {
	long l;
	try {
	    int i = -120 % ((arg0 - -31) / 63);
	    anInt3923++;
	    l = 0x7fffffffffffffffL & aLong2737;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ma.C(" + arg0 + ')');
	}
	return l;
    }
    
    public int method331(int arg0) {
    while_207_:
	do {
	    do {
		int i;
		try {
		    if (arg0 == 8709)
			break;
		    i = 56;
		} catch (RuntimeException runtimeexception) {
		    break while_207_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		anInt3928++;
		i = (int) aLong355;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ma.E(" + arg0 + ')');
    }
    
    static {
	anInt3929 = -1;
	aClass124_3926 = Class14_Sub2_Sub2.method263(1178, "p11_full");
    }
}
