/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import javax.media.opengl.GL;

public class Class83
{
    public static Class9 aClass9_1335;
    public static int anInt1336;
    public static int anInt1337;
    public static int anInt1338;
    public static Class52 aClass52_1339 = new Class52(20);
    public static int anInt1340;
    public static Class112[] aClass112Array1341 = new Class112[50];
    public static boolean aBoolean1342;
    
    public static Class124 method1407(int arg0, int arg1) {
	Class124 class124;
	try {
	    anInt1336++;
	    if (arg0 < 8)
		method1410(-29);
	    class124 = Class54.method1220(arg1, true, false, 10);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("md.B(" + arg0 + ',' + arg1
						+ ')'));
	}
	return class124;
    }
    
    public static void method1408(Class133_Sub1_Sub1 arg0, int arg1,
				  boolean arg2, int arg3) {
    while_972_:
	do {
	while_971_:
	    do {
		do {
		    try {
			if ((arg3 ^ 0xffffffff) == (arg0.anInt3445
						    ^ 0xffffffff)
			    && (arg3 ^ 0xffffffff) != 0) {
			    Class46 class46 = Class41.method1129(arg3, -128);
			    int i = class46.anInt753;
			    if (1 == i) {
				arg0.anInt3458 = 0;
				arg0.anInt3467 = arg1;
				arg0.anInt3501 = 0;
				arg0.anInt3482 = 0;
				Class14_Sub8_Sub6.method509
				    (arg0.anInt3495, arg0.anInt3501, 59,
				     (Class14_Sub3.aClass133_Sub1_Sub1_2748
				      == arg0),
				     class46, arg0.anInt3436);
			    }
			    if (2 == i)
				arg0.anInt3482 = 0;
			} else if (arg3 == -1 || -1 == arg0.anInt3445
				   || ((Class41.method1129(arg3, -119).anInt777
					^ 0xffffffff)
				       <= ((Class41.method1129
					    (arg0.anInt3445, 92).anInt777)
					   ^ 0xffffffff))) {
			    arg0.anInt3467 = arg1;
			    arg0.anInt3458 = 0;
			    arg0.anInt3501 = 0;
			    arg0.anInt3477 = arg0.anInt3498;
			    arg0.anInt3482 = 0;
			    arg0.anInt3445 = arg3;
			    if (0 != (arg0.anInt3445 ^ 0xffffffff))
				Class14_Sub8_Sub6.method509
				    (arg0.anInt3495, arg0.anInt3501, -115,
				     arg0 == (Class14_Sub3
					      .aClass133_Sub1_Sub1_2748),
				     Class41.method1129(arg0.anInt3445, 87),
				     arg0.anInt3436);
			}
			if (!arg2)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_971_;
		    }
		    return;
		} while (false);
		try {
		    anInt1337++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_972_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("md.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ')'));
	} while (false);
    }
    
    public static void method1409() {
	GL gl = Class121.aGL2030;
	gl.glDisableClientState(32886);
	Class121.method1639(false);
	gl.glDisable(2929);
	gl.glPushAttrib(128);
	gl.glFogf(2915, 3072.0F);
	Class121.method1646();
	for (int i = 0;
	     i < Class14_Sub30.aClass14_Sub27ArrayArray3273[0].length; i++) {
	    Class14_Sub27 class14_sub27
		= Class14_Sub30.aClass14_Sub27ArrayArray3273[0][i];
	    if (class14_sub27.anInt3204 >= 0
		&& (Class3.anInterface3_117.method12(true,
						     class14_sub27.anInt3204)
		    == 4)) {
		gl.glColor4fv(Class14_Sub8_Sub34
				  .method657(81, class14_sub27.anInt3190),
			      0);
		float f = 201.5F - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F);
		class14_sub27.method922((Class125_Sub1
					 .aClass14_Sub29ArrayArrayArray3368),
					f, true);
	    }
	}
	gl.glEnableClientState(32886);
	Class121.method1645();
	gl.glEnable(2929);
	gl.glPopAttrib();
	Class121.method1625();
    }
    
    public static void method1410(int arg0) {
	try {
	    if (arg0 != -28990)
		method1410(-53);
	    aClass9_1335 = null;
	    aClass52_1339 = null;
	    aClass112Array1341 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "md.A(" + arg0 + ')');
	}
    }
}
