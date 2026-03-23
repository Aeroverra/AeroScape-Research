/* Class14_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.DataInputStream;
import java.net.URL;

public class Class14_Sub9_Sub3 extends Class14_Sub9
{
    public static int anInt4843;
    public static Class124 aClass124_4844;
    public static int anInt4845;
    public static int anInt4846;
    public static int anInt4847;
    public static volatile int anInt4848 = -1;
    public static int anInt4849;
    public static int anInt4850 = 0;
    public static int[] anIntArray4851;
    public static int anInt4852;
    public static int anInt4853;
    public static int anInt4854;
    public static int anInt4855;
    public Class14_Sub9_Sub1 aClass14_Sub9_Sub1_4856;
    public static int anInt4857;
    public Class2 aClass2_4858 = new Class2();
    public Class14_Sub9_Sub2 aClass14_Sub9_Sub2_4859 = new Class14_Sub9_Sub2();
    
    public void method687(int[] arg0, int arg1, int arg2) {
	try {
	    aClass14_Sub9_Sub2_4859.method687(arg0, arg1, arg2);
	while_551_:
	    for (Class14_Sub18 class14_sub18
		     = (Class14_Sub18) aClass2_4858.method77(0);
		 class14_sub18 != null;
		 class14_sub18 = (Class14_Sub18) aClass2_4858.method84(-116)) {
		if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
		    int i = arg1;
		    int i_0_ = arg2;
		while_549_:
		    do {
			do {
			    if (class14_sub18.anInt3048 >= i_0_)
				break while_549_;
			    method737(arg0, class14_sub18.anInt3048, i,
				      i_0_ + i, class14_sub18, -78);
			    i_0_ -= class14_sub18.anInt3048;
			    i += class14_sub18.anInt3048;
			} while (!aClass14_Sub9_Sub1_4856.method725
				  (arg0, class14_sub18, 81, i_0_, i));
			continue while_551_;
		    } while (false);
		    method737(arg0, i_0_, i, i_0_ + i, class14_sub18, -82);
		    class14_sub18.anInt3048 -= i_0_;
		}
	    }
	    anInt4854++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kk.D("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public Class14_Sub9 method686() {
	do {
	    try {
		anInt4845++;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	while_552_:
	    for (;;) {
		Class14_Sub18 class14_sub18
		    = (Class14_Sub18) aClass2_4858.method84(-92);
		if (class14_sub18 == null)
		    return null;
		do {
		    Class14_Sub9_Sub4 class14_sub9_sub4;
		    try {
			if (class14_sub18.aClass14_Sub9_Sub4_3051 == null)
			    break;
			class14_sub9_sub4
			    = class14_sub18.aClass14_Sub9_Sub4_3051;
		    } catch (RuntimeException runtimeexception) {
			break while_552_;
		    }
		    return class14_sub9_sub4;
		} while (false);
		try {
		    /* empty */
		} catch (RuntimeException runtimeexception) {
		    break;
		}
	    }
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "kk.I()");
    }
    
    public Class14_Sub9 method688() {
    while_553_:
	do {
	    Class14_Sub18 class14_sub18;
	    do {
		Class14_Sub9 class14_sub9;
		try {
		    anInt4852++;
		    class14_sub18 = (Class14_Sub18) aClass2_4858.method77(0);
		    if (null != class14_sub18)
			break;
		    class14_sub9 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_553_;
		}
		return class14_sub9;
	    } while (false);
	    do {
		Class14_Sub9_Sub4 class14_sub9_sub4;
		try {
		    if (null == class14_sub18.aClass14_Sub9_Sub4_3051)
			break;
		    class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
		} catch (RuntimeException runtimeexception) {
		    break while_553_;
		}
		return class14_sub9_sub4;
	    } while (false);
	    Class14_Sub9 class14_sub9;
	    try {
		class14_sub9 = method686();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class14_sub9;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "kk.L()");
    }
    
    public static void method736(int arg0) {
    while_555_:
	do {
	while_554_:
	    do {
		do {
		    try {
			anIntArray4851 = null;
			if (arg0 == 0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_554_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_4844 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_555_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "kk.B(" + arg0 + ')');
	} while (false);
    }
    
    public int method690() {
	int i;
	try {
	    anInt4853++;
	    i = 0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "kk.F()");
	}
	return i;
    }
    
    public void method737(int[] arg0, int arg1, int arg2, int arg3,
			  Class14_Sub18 arg4, int arg5) {
	try {
	    anInt4847++;
	    int i = -56 % ((arg5 - -15) / 48);
	    if (0 != (0x4
		      & aClass14_Sub9_Sub1_4856.anIntArray4817[arg4.anInt3053])
		&& (arg4.anInt3041 ^ 0xffffffff) > -1) {
		int i_1_
		    = (aClass14_Sub9_Sub1_4856.anIntArray4796[arg4.anInt3053]
		       / Class115.anInt1909);
		for (;;) {
		    int i_2_ = (i_1_ + (1048575 + -arg4.anInt3044)) / i_1_;
		    if (arg1 < i_2_)
			break;
		    arg4.aClass14_Sub9_Sub4_3051.method687(arg0, arg2, i_2_);
		    int i_3_ = Class115.anInt1909 / 100;
		    arg1 -= i_2_;
		    arg2 += i_2_;
		    int i_4_ = 262144 / i_1_;
		    arg4.anInt3044 += i_1_ * i_2_ - 1048576;
		    Class14_Sub9_Sub4 class14_sub9_sub4
			= arg4.aClass14_Sub9_Sub4_3051;
		    if ((i_4_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff))
			i_3_ = i_4_;
		    if (-1 == ((aClass14_Sub9_Sub1_4856.anIntArray4826
				[arg4.anInt3053])
			       ^ 0xffffffff))
			arg4.aClass14_Sub9_Sub4_3051
			    = (Class14_Sub9_Sub4.method763
			       (arg4.aClass14_Sub12_Sub1_3059,
				class14_sub9_sub4.method767(),
				class14_sub9_sub4.method769(),
				class14_sub9_sub4.method758()));
		    else {
			arg4.aClass14_Sub9_Sub4_3051
			    = (Class14_Sub9_Sub4.method763
			       (arg4.aClass14_Sub12_Sub1_3059,
				class14_sub9_sub4.method767(), 0,
				class14_sub9_sub4.method758()));
			aClass14_Sub9_Sub1_4856.method705
			    (114, arg4,
			     -1 < ((arg4.aClass14_Sub28_3054.aShortArray3223
				    [arg4.anInt3037])
				   ^ 0xffffffff));
			arg4.aClass14_Sub9_Sub4_3051
			    .method747(i_3_, class14_sub9_sub4.method769());
		    }
		    if (((arg4.aClass14_Sub28_3054.aShortArray3223
			  [arg4.anInt3037])
			 ^ 0xffffffff)
			> -1)
			arg4.aClass14_Sub9_Sub4_3051.method765(-1);
		    class14_sub9_sub4.method777(i_3_);
		    class14_sub9_sub4.method687(arg0, arg2, arg3 + -arg2);
		    if (class14_sub9_sub4.method776())
			aClass14_Sub9_Sub2_4859.method735(class14_sub9_sub4);
		}
		arg4.anInt3044 += i_1_ * arg1;
	    }
	    arg4.aClass14_Sub9_Sub4_3051.method687(arg0, arg2, arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kk.E("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2 + ','
						+ arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ')'));
	}
    }
    
    public static void method738(String arg0, Throwable arg1, int arg2) {
	anInt4857++;
    while_557_:
	do {
	while_556_:
	    do {
		String string;
		do {
		    try {
			string = "";
			if (null != arg1)
			    string = Class138.method1947(41, arg1);
			if (null != arg0) {
			    if (null != arg1)
				string += " | ";
			    string += (String) arg0;
			}
			System.out.println("Error: " + string);
			string = string.replace(':', '.');
			string = string.replace('@', '_');
			string = string.replace('&', '_');
			string = string.replace('#', (char) arg2);
			if (Class14.aClass43_358.anApplet712 != null)
			    break;
		    } catch (Exception exception) {
			break while_556_;
		    }
		    return;
		} while (false);
		try {
		    Class31 class31
			= (Class14.aClass43_358.method1147
			   ((byte) -119,
			    new URL(Class14.aClass43_358.anApplet712
					.getCodeBase(),
				    ("clienterror.ws?c="
				     + Class14_Sub8_Sub32.anInt4614 + "&u="
				     + Class48.aLong802 + "&v1="
				     + Class43.aString721 + "&v2="
				     + Class43.aString723 + "&e=" + string))));
		    while (class31.anInt529 == 0)
			Class14_Sub13.method864(1L, (byte) 64);
		    if (1 == class31.anInt529) {
			DataInputStream datainputstream
			    = (DataInputStream) class31.anObject530;
			datainputstream.read();
			datainputstream.close();
		    }
		} catch (Exception exception) {
		    break;
		}
		break while_557_;
	    } while (false);
	    Object object = new Throwable();
	} while (false);
    }
    
    public void method692(int arg0) {
	try {
	    aClass14_Sub9_Sub2_4859.method692(arg0);
	    anInt4855++;
	    Class14_Sub18 class14_sub18
		= (Class14_Sub18) aClass2_4858.method77(0);
	while_560_:
	    for (/**/; class14_sub18 != null;
		 class14_sub18 = (Class14_Sub18) aClass2_4858.method84(-59)) {
		if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
		    int i = arg0;
		while_558_:
		    do {
			do {
			    if ((class14_sub18.anInt3048 ^ 0xffffffff)
				<= (i ^ 0xffffffff))
				break while_558_;
			    method739(class14_sub18, -39,
				      class14_sub18.anInt3048);
			    i -= class14_sub18.anInt3048;
			} while (!aClass14_Sub9_Sub1_4856.method725
				  (null, class14_sub18, 107, i, 0));
			continue while_560_;
		    } while (false);
		    method739(class14_sub18, -39, i);
		    class14_sub18.anInt3048 -= i;
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kk.J(" + arg0 + ')');
	}
    }
    
    public void method739(Class14_Sub18 arg0, int arg1, int arg2) {
	try {
	    int i = 14 / ((arg1 - 31) / 54);
	    if (0 != (aClass14_Sub9_Sub1_4856.anIntArray4817[arg0.anInt3053]
		      & 0x4)
		&& 0 > arg0.anInt3041) {
		int i_5_
		    = (aClass14_Sub9_Sub1_4856.anIntArray4796[arg0.anInt3053]
		       / Class115.anInt1909);
		int i_6_ = (-arg0.anInt3044 + (1048575 + i_5_)) / i_5_;
		arg0.anInt3044 = 0xfffff & i_5_ * arg2 + arg0.anInt3044;
		if ((arg2 ^ 0xffffffff) <= (i_6_ ^ 0xffffffff)) {
		    if (aClass14_Sub9_Sub1_4856.anIntArray4826[arg0.anInt3053]
			== 0)
			arg0.aClass14_Sub9_Sub4_3051
			    = (Class14_Sub9_Sub4.method763
			       (arg0.aClass14_Sub12_Sub1_3059,
				arg0.aClass14_Sub9_Sub4_3051.method767(),
				arg0.aClass14_Sub9_Sub4_3051.method769(),
				arg0.aClass14_Sub9_Sub4_3051.method758()));
		    else {
			arg0.aClass14_Sub9_Sub4_3051
			    = (Class14_Sub9_Sub4.method763
			       (arg0.aClass14_Sub12_Sub1_3059,
				arg0.aClass14_Sub9_Sub4_3051.method767(), 0,
				arg0.aClass14_Sub9_Sub4_3051.method758()));
			aClass14_Sub9_Sub1_4856.method705
			    (-6, arg0, 0 > (arg0.aClass14_Sub28_3054
					    .aShortArray3223[arg0.anInt3037]));
		    }
		    if ((arg0.aClass14_Sub28_3054.aShortArray3223
			 [arg0.anInt3037])
			< 0)
			arg0.aClass14_Sub9_Sub4_3051.method765(-1);
		    arg2 = arg0.anInt3044 / i_5_;
		}
	    }
	    anInt4846++;
	    arg0.aClass14_Sub9_Sub4_3051.method692(arg2);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kk.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public Class14_Sub9_Sub3(Class14_Sub9_Sub1 arg0) {
	try {
	    aClass14_Sub9_Sub1_4856 = arg0;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kk.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anInt4843 = 0;
	anIntArray4851 = new int[2000];
	aClass124_4844 = Class14_Sub2_Sub2.method263(1178, "details");
    }
}
