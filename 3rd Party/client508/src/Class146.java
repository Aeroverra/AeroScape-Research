/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.util.Calendar;
import java.util.TimeZone;

public class Class146
{
    public int[] anIntArray2350;
    public static Calendar aCalendar2351;
    public static int anInt2352;
    public int anInt2353;
    public short[] aShortArray2354;
    public byte[] aByteArray2355;
    public static int anInt2356;
    public static int anInt2357 = 0;
    public static int anInt2358;
    public static int anInt2359;
    public static int anInt2360;
    public short[] aShortArray2361;
    public Class124[] aClass124Array2362;
    public static int anInt2363;
    public static long aLong2364;
    public static int anInt2365;
    
    public boolean method1990(int arg0, int arg1) {
	boolean bool;
	try {
	    anInt2356++;
	    if (arg0 >= -66)
		anIntArray2350 = null;
	    bool = 0 != (aByteArray2355[arg1] & 0x4);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vk.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public static Class14_Sub2_Sub16_Sub1 method1991
	(int arg0, Class9 arg1, Class9 arg2, int arg3, int arg4) {
    while_1266_:
	do {
	    do {
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1;
		try {
		    anInt2352++;
		    if (Class109.method1564(-2, arg0, arg4, arg1))
			break;
		    class14_sub2_sub16_sub1 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1266_;
		}
		return class14_sub2_sub16_sub1;
	    } while (false);
	    Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1;
	    try {
		if (arg3 != -13824)
		    anInt2357 = 59;
		class14_sub2_sub16_sub1
		    = Class14_Sub2_Sub14.method336(4, arg2.method163(arg0,
								     arg4, 0));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub2_sub16_sub1;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("vk.B(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ','
					    + (arg2 != null ? "{...}" : "null")
					    + ',' + arg3 + ',' + arg4 + ')'));
    }
    
    public static Class148_Sub1[] method1992(byte arg0) {
	Class148_Sub1[] class148_sub1s;
	try {
	    Class148_Sub1[] class148_sub1s_0_
		= new Class148_Sub1[Class32.anInt547];
	    for (int i = 0; (i ^ 0xffffffff) > (Class32.anInt547 ^ 0xffffffff);
		 i++)
		class148_sub1s_0_[i]
		    = new Class148_Sub1(Class14_Sub11.anInt2952,
					Class14_Sub30.anInt3279,
					Class40.anIntArray675[i],
					Class14_Sub2_Sub12.anIntArray3918[i],
					Class17.anIntArray402[i],
					Class76.anIntArray1204[i],
					Class12.aByteArrayArray310[i],
					Class73.anIntArray1114);
	    anInt2359++;
	    Class129.method1761((byte) 103);
	    if (arg0 != -111)
		method1995(71);
	    class148_sub1s = class148_sub1s_0_;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vk.D(" + arg0 + ')');
	}
	return class148_sub1s;
    }
    
    public static void method1993(int arg0, int arg1, int arg2, int arg3,
				  int arg4, int arg5, Class32 arg6) {
	try {
	    anInt2363++;
	    long l = 0L;
	    if ((arg1 ^ 0xffffffff) != -1) {
		if (-2 == (arg1 ^ 0xffffffff))
		    l = Class14_Sub2_Sub12.method323(arg3, arg5, arg2);
		else if (arg1 == 2)
		    l = Class14_Sub8_Sub38.method675(arg3, arg5, arg2);
		else if (3 == arg1)
		    l = Class14_Sub8_Sub19.method578(arg3, arg5, arg2);
	    } else
		l = Class2.method79(arg3, arg5, arg2);
	    int i = -1;
	    i = (int) (l >>> -1940164576) & 0x7fffffff;
	    boolean bool = false;
	    boolean bool_1_ = false;
	    int i_2_ = (int) l >> 595268084 & 0x3;
	    int i_3_ = 0x1f & (int) l >> 929097486;
	    if (arg4 != 4)
		method1993(73, -127, 84, 72, 79, -102, null);
	    Class79 class79 = Class79.method1377((byte) -106, i);
	    if (class79.method1392(-127))
		Class14_Sub2_Sub21.method434(arg5, arg3, class79, arg4 ^ 0x84,
					     arg2);
	    if (l != 0L) {
		Class133 class133 = null;
		Class133 class133_4_ = null;
		if ((arg1 ^ 0xffffffff) == -1) {
		    Class113 class113
			= Class14_Sub8_Sub39.method681(arg3, arg5, arg2);
		    if (null != class113) {
			class133_4_ = class113.aClass133_1884;
			class133 = class113.aClass133_1877;
		    }
		    if (0 != class79.anInt1229)
			arg6.method1077(i_3_, -1, class79.aBoolean1248, i_2_,
					arg2, arg5);
		} else if (arg1 == 1) {
		    Class37 class37 = Class86.method1418(arg3, arg5, arg2);
		    if (null != class37) {
			class133_4_ = class37.aClass133_638;
			class133 = class37.aClass133_642;
		    }
		} else if (arg1 != 2) {
		    if (3 == arg1) {
			Class4 class4
			    = Class14_Sub8_Sub31.method649(arg3, arg5, arg2);
			if (null != class4)
			    class133 = class4.aClass133_124;
			if ((class79.anInt1229 ^ 0xffffffff) == -2)
			    arg6.method1069(arg4 ^ ~0x40004, arg2, arg5);
		    }
		} else {
		    Class40 class40 = Class36.method1098(arg3, arg5, arg2);
		    if (null != class40)
			class133 = class40.aClass133_679;
		    if (class79.anInt1229 != 0
			&& (class79.anInt1227 + arg5 ^ 0xffffffff) > -105
			&& -105 < (class79.anInt1227 + arg2 ^ 0xffffffff)
			&& (class79.anInt1245 + arg5 ^ 0xffffffff) > -105
			&& arg2 + class79.anInt1245 < 104)
			arg6.method1068(class79.aBoolean1248, i_2_, (byte) -93,
					class79.anInt1245, class79.anInt1227,
					arg5, arg2);
		}
		if (class79.aBoolean1253) {
		    if (i_3_ == 2) {
			if (!(class133 instanceof Class133_Sub4))
			    Class68.method1305(arg5, 4 - -i_2_, 0, class79,
					       i_3_, 0, arg2, arg0, (byte) 93);
			else
			    ((Class133_Sub4) class133).method1836(true);
			if (!(class133_4_ instanceof Class133_Sub4))
			    Class68.method1305(arg5, 0x3 & 1 + i_2_, 0,
					       class79, i_3_, 0, arg2, arg0,
					       (byte) 94);
			else
			    ((Class133_Sub4) class133_4_).method1836(true);
		    } else if ((i_3_ ^ 0xffffffff) != -6) {
			if (i_3_ != 6) {
			    if (-8 == (i_3_ ^ 0xffffffff)) {
				if (!(class133 instanceof Class133_Sub4))
				    Class68.method1305(arg5,
						       (i_2_ - -2 & 0x3) + 4,
						       0, class79, 4, 0, arg2,
						       arg0, (byte) 115);
				else
				    ((Class133_Sub4) class133)
					.method1836(true);
			    } else if (i_3_ == 8) {
				if (!(class133 instanceof Class133_Sub4))
				    Class68.method1305(arg5, i_2_ + 4,
						       8 * (Class14_Sub2_Sub9
							    .anIntArray3859
							    [i_2_]),
						       class79, 4,
						       (Class114.anIntArray1893
							[i_2_]) * 8,
						       arg2, arg0, (byte) 107);
				else
				    ((Class133_Sub4) class133)
					.method1836(true);
				if (class133_4_ instanceof Class133_Sub4)
				    ((Class133_Sub4) class133_4_)
					.method1836(true);
				else
				    Class68.method1305(arg5,
						       (i_2_ + 2 & 0x3) + 4,
						       ((Class14_Sub2_Sub9
							 .anIntArray3859[i_2_])
							* 8),
						       class79, 4,
						       (Class114.anIntArray1893
							[i_2_]) * 8,
						       arg2, arg0, (byte) 125);
			    } else if (i_3_ == 11) {
				if (class133 instanceof Class133_Sub4)
				    ((Class133_Sub4) class133)
					.method1836(true);
				else
				    Class68.method1305(arg5, 4 - -i_2_, 0,
						       class79, 10, 0, arg2,
						       arg0, (byte) 110);
			    } else if (class133 instanceof Class133_Sub4)
				((Class133_Sub4) class133).method1836(true);
			    else
				Class68.method1305(arg5, i_2_, 0, class79,
						   i_3_, 0, arg2, arg0,
						   (byte) 86);
			} else if (!(class133 instanceof Class133_Sub4))
			    Class68.method1305(arg5, 4 + i_2_,
					       8 * (Class14_Sub2_Sub9
						    .anIntArray3859[i_2_]),
					       class79, 4,
					       (Class114.anIntArray1893[i_2_]
						* 8),
					       arg2, arg0, (byte) 107);
			else
			    ((Class133_Sub4) class133).method1836(true);
		    } else if (class133 instanceof Class133_Sub4)
			((Class133_Sub4) class133).method1836(true);
		    else
			Class68.method1305(arg5, i_2_,
					   Class9.anIntArray212[i_2_] * 8,
					   class79, 4,
					   (Class14_Sub19.anIntArray3074[i_2_]
					    * 8),
					   arg2, arg0, (byte) 100);
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vk.E(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ',' + arg5 + ','
						+ (arg6 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public int method1994(int arg0, boolean arg1) {
	int i;
	try {
	    anInt2360++;
	    if (arg1)
		method1993(51, -3, 103, -52, 116, -107, null);
	    i = 0x3 & aByteArray2355[arg0];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("vk.A(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public static void method1995(int arg0) {
	try {
	    int i = -15 % ((arg0 - -32) / 54);
	    aCalendar2351 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vk.F(" + arg0 + ')');
	}
    }
    
    public Class146(int arg0) {
	try {
	    anInt2353 = arg0;
	    aByteArray2355 = new byte[anInt2353];
	    aShortArray2361 = new short[anInt2353];
	    anIntArray2350 = new int[anInt2353];
	    aClass124Array2362 = new Class124[anInt2353];
	    aShortArray2354 = new short[anInt2353];
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "vk.<init>(" + arg0 + ')');
	}
    }
    
    static {
	aCalendar2351 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
	anInt2365 = 0;
    }
}
