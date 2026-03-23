/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class113
{
    public Class133 aClass133_1877;
    public int anInt1878;
    public static int anInt1879;
    public int anInt1880;
    public static int anInt1881 = 0;
    public int anInt1882;
    public static int anInt1883;
    public Class133 aClass133_1884;
    public static int anInt1885;
    public int anInt1886;
    public long aLong1887 = 0L;
    public int anInt1888;
    public static int anInt1889;
    
    public static void method1580(boolean arg0) {
	try {
	    anInt1889++;
	    Class64.anInt1012 = 0;
	    Class14_Sub8_Sub10.anInt4255 = 0;
	    Class59.method1262(arg0);
	    Class41.method1131(-128);
	    Class125_Sub1.method1728((byte) 22);
	    Class14_Sub8_Sub17.method571(false);
	    for (int i = 0; Class14_Sub8_Sub10.anInt4255 > i; i++) {
		int i_0_ = Class36.anIntArray626[i];
		if ((Class14_Sub2_Sub20.anInt4064 ^ 0xffffffff)
		    != ((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_]
			 .anInt3447)
			^ 0xffffffff)) {
		    if (0 < (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			     [i_0_].anInt4917))
			Class14_Sub8_Sub14.method551
			    ((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
			      [i_0_]),
			     -574);
		    Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_]
			= null;
		}
	    }
	    if ((Class14_Sub8_Sub12.anInt4280 ^ 0xffffffff)
		!= (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.anInt2908
		    ^ 0xffffffff))
		throw new RuntimeException("gpp1 pos:"
					   + (Class14_Sub8_Sub38
					      .aClass14_Sub10_Sub1_4734
					      .anInt2908)
					   + " psize:"
					   + Class14_Sub8_Sub12.anInt4280);
	    for (int i = 0; i < Class14_Sub10.anInt2878; i++) {
		if ((Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
		     [Class14.anIntArray351[i]])
		    == null)
		    throw new RuntimeException("gpp2 pos:" + i + " size:"
					       + Class14_Sub10.anInt2878);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rf.A(" + arg0 + ')');
	}
    }
    
    public static boolean method1581(int arg0) {
    while_1061_:
	do {
	while_1060_:
	    do {
	    while_1059_:
		do {
		while_1058_:
		    do {
			do {
			    boolean bool;
			    try {
				anInt1883++;
				try {
				    if (-3 != (Class14_Sub2_Sub11.anInt3889
					       ^ 0xffffffff))
					break while_1058_;
				    if (Class14_Sub9_Sub1.aClass14_Sub16_4780
					!= null)
					break;
				    Class14_Sub9_Sub1.aClass14_Sub16_4780
					= (Class14_Sub16.method875
					   (Class9_Sub1.aClass9_2696,
					    Class38.anInt2624,
					    Class14_Sub2_Sub13.anInt3930));
				    if (null != (Class14_Sub9_Sub1
						 .aClass14_Sub16_4780))
					break;
				    bool = false;
				} catch (Exception exception) {
				    break while_1059_;
				}
			    } catch (RuntimeException runtimeexception) {
				break while_1061_;
			    }
			    return bool;
			} while (false);
			boolean bool;
			try {
			    if (Class52.aClass120_854 == null)
				Class52.aClass120_854
				    = new Class120((Class14_Sub2_Sub14
						    .aClass9_3945),
						   Class44.aClass9_725);
			    if (!Class133_Sub5.aClass14_Sub9_Sub1_3625
				     .method706
				 (22050, Class14_Sub9_Sub1.aClass14_Sub16_4780,
				  -67, Class59.aClass9_957,
				  Class52.aClass120_854))
				break;
			    Class133_Sub5.aClass14_Sub9_Sub1_3625
				.method715(-22255);
			    Class133_Sub5.aClass14_Sub9_Sub1_3625
				.method710(-28225, Class73.anInt1132);
			    Class133_Sub5.aClass14_Sub9_Sub1_3625.method719
				(0, Class35.aBoolean593,
				 Class14_Sub9_Sub1.aClass14_Sub16_4780);
			    Class9_Sub1.aClass9_2696 = null;
			    Class14_Sub2_Sub11.anInt3889 = 0;
			    Class52.aClass120_854 = null;
			    Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
			    bool = true;
			} catch (Exception exception) {
			    break while_1059_;
			}
			return bool;
		    } while (false);
		    try {
			break while_1060_;
		    } catch (RuntimeException runtimeexception) {
			break while_1061_;
		    }
		} while (false);
		Exception exception = new Exception();
		exception.printStackTrace();
		Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(75);
		Class52.aClass120_854 = null;
		Class14_Sub2_Sub11.anInt3889 = 0;
		Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
		Class9_Sub1.aClass9_2696 = null;
	    } while (false);
	    if (arg0 != 0)
		anInt1881 = -15;
	    return false;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "rf.B(" + arg0 + ')');
    }
    
    static {
	anInt1879 = 0;
    }
}
