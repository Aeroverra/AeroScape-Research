/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class1
{
    public static int anInt67;
    public static int anInt68;
    public static int[] anIntArray69 = new int[32];
    public static Class2 aClass2_70;
    public static Class124 aClass124_71;
    public static Class124 aClass124_72;
    public static int anInt73;
    public static boolean aBoolean74;
    public static Class94[][] aClass94ArrayArray75;
    
    public static void method70(int arg0, int arg1, int arg2) {
	for (int i = 0; i < Class83.anInt1338; i++) {
	    for (int i_0_ = 0; i_0_ < Class99_Sub2.anInt3338; i_0_++) {
		for (int i_1_ = 0; i_1_ < Class14_Sub8_Sub15.anInt4337;
		     i_1_++) {
		    Class14_Sub29 class14_sub29
			= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i]
			   [i_0_][i_1_]);
		    if (class14_sub29 != null) {
			Class113 class113 = class14_sub29.aClass113_3250;
			if (class113 != null
			    && class113.aClass133_1877.method1784()) {
			    Class133_Sub1.method1803(class113.aClass133_1877,
						     i, i_0_, i_1_, 1, 1);
			    if (class113.aClass133_1884 != null
				&& class113.aClass133_1884.method1784()) {
				Class133_Sub1.method1803((class113
							  .aClass133_1884),
							 i, i_0_, i_1_, 1, 1);
				class113.aClass133_1877.method1788
				    (class113.aClass133_1884, 0, 0, 0, false);
				class113.aClass133_1884
				    = class113.aClass133_1884
					  .method1791(arg0, arg1, arg2);
			    }
			    class113.aClass133_1877
				= class113.aClass133_1877
				      .method1791(arg0, arg1, arg2);
			}
			for (int i_2_ = 0; i_2_ < class14_sub29.anInt3242;
			     i_2_++) {
			    Class40 class40
				= class14_sub29.aClass40Array3257[i_2_];
			    if (class40 != null
				&& class40.aClass133_679.method1784()) {
				Class133_Sub1.method1803
				    (class40.aClass133_679, i, i_0_, i_1_,
				     class40.anInt670 - class40.anInt668 + 1,
				     class40.anInt669 - class40.anInt678 + 1);
				class40.aClass133_679
				    = class40.aClass133_679
					  .method1791(arg0, arg1, arg2);
			    }
			}
			Class4 class4 = class14_sub29.aClass4_3237;
			if (class4 != null
			    && class4.aClass133_124.method1784()) {
			    Class75.method1339(class4.aClass133_124, i, i_0_,
					       i_1_);
			    class4.aClass133_124
				= class4.aClass133_124.method1791(arg0, arg1,
								  arg2);
			}
		    }
		}
	    }
	}
    }
    
    public static void method71(Class114 arg0, int arg1, byte arg2,
				byte[] arg3) {
	try {
	    anInt67++;
	    Class14_Sub19 class14_sub19 = new Class14_Sub19();
	    int i = 61 / ((arg2 - 22) / 55);
	    class14_sub19.aLong355 = (long) arg1;
	    class14_sub19.anInt3067 = 0;
	    class14_sub19.aClass114_3077 = arg0;
	    class14_sub19.aByteArray3069 = arg3;
	    Class2 class2 = Class14_Sub8_Sub19.aClass2_4404;
	    synchronized (class2) {
		Class14_Sub8_Sub19.aClass2_4404.method80(class14_sub19,
							 (byte) -127);
	    }
	    Class14_Sub9_Sub1.method696((byte) -119);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ab.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method72(boolean arg0) {
	try {
	    anIntArray69 = null;
	    aClass124_71 = null;
	    aClass124_72 = null;
	    aClass2_70 = null;
	    if (arg0)
		aClass94ArrayArray75 = null;
	    aClass94ArrayArray75 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ab.B(" + arg0 + ')');
	}
    }
    
    public static int method73(byte arg0) {
    while_24_:
	do {
	    do {
		int i;
		try {
		    anInt68++;
		    if (Class14_Sub2_Sub15.aFrame3962 == null)
			break;
		    i = 2;
		} catch (RuntimeException runtimeexception) {
		    break while_24_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    if (arg0 != -58)
			aClass124_72 = null;
		    if (!Class52.aBoolean845)
			break;
		    i = 1;
		} catch (RuntimeException runtimeexception) {
		    break while_24_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ab.C(" + arg0 + ')');
    }
    
    static {
	int i = 2;
	for (int i_3_ = 0; (i_3_ ^ 0xffffffff) > -33; i_3_++) {
	    anIntArray69[i_3_] = i - 1;
	    i += i;
	}
	aClass124_71
	    = (Class14_Sub2_Sub2.method263
	       (1178,
		"Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100"));
	aClass124_72 = Class14_Sub2_Sub2.method263(1178, "Mem:");
	aClass2_70 = new Class2();
	anInt73 = 0;
	aBoolean74 = false;
    }
}
