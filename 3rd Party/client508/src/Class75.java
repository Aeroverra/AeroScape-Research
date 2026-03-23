/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.awt.Component;

public class Class75
{
    public static int anInt1143;
    public static int anInt1144;
    public static int anInt1145;
    public static int anInt1146;
    public static Class20 aClass20_1147;
    public static int anInt1148;
    public static int anInt1149;
    public int[] anIntArray1150;
    public static int anInt1151;
    public static Class124 aClass124_1152
	= Class14_Sub2_Sub2.method263(1178, "leuchten1:");
    public static int anInt1153;
    public Class14_Sub9 aClass14_Sub9_1154;
    public static int anInt1155;
    public static int anInt1156;
    public static int anInt1157;
    public int anInt1158 = 32;
    public static int anInt1159;
    public long aLong1160 = Class84.method1413((byte) 103);
    public static int anInt1161;
    public static int anInt1162;
    public static int anInt1163;
    public static int anInt1164;
    public static Class124 aClass124_1165
	= Class14_Sub2_Sub2.method263(1178, "Bitte warten Sie)3)3)3");
    public static int anInt1166;
    public static Class9_Sub1 aClass9_Sub1_1167;
    public static int anInt1168;
    public boolean aBoolean1169 = true;
    public int anInt1170;
    public int anInt1171;
    public int anInt1172;
    public int anInt1173;
    public int anInt1174;
    public long aLong1175 = 0L;
    public int anInt1176;
    public static int anInt1177;
    public int anInt1178;
    public Class14_Sub9[] aClass14_Sub9Array1179;
    public Class14_Sub9[] aClass14_Sub9Array1180;
    public long aLong1181;
    public static Class124 aClass124_1182;
    public static Class124 aClass124_1183;
    public static Class148[] aClass148Array1184;
    
    public void method1335() throws Exception {
	try {
	    anInt1149++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "kl.F()");
	}
    }
    
    public void method1336(Class14_Sub9 arg0, int arg1, int arg2) {
	try {
	    if (arg2 != 15621)
		aClass9_Sub1_1167 = null;
	    int i = arg1 >> -415809691;
	    anInt1144++;
	    Class14_Sub9 class14_sub9 = aClass14_Sub9Array1180[i];
	    if (null == class14_sub9)
		aClass14_Sub9Array1179[i] = arg0;
	    else
		class14_sub9.aClass14_Sub9_2867 = arg0;
	    aClass14_Sub9Array1180[i] = arg0;
	    arg0.anInt2865 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kl.H("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public static Class124 method1337(Class14_Sub10 arg0, int arg1) {
	Class124 class124;
	try {
	    anInt1143++;
	    if (arg1 != 32767)
		method1343(-4, 118, -32, -119, 126);
	    class124 = Class148.method1998(32767, (byte) -125, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kl.N("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
	return class124;
    }
    
    public void method1338(int arg0) {
	try {
	    anInt1168++;
	    aBoolean1169 = true;
	    if (arg0 != 255)
		anInt1174 = -99;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kl.I(" + arg0 + ')');
	}
    }
    
    public static void method1339(Class133 arg0, int arg1, int arg2,
				  int arg3) {
	if (arg2 < Class99_Sub2.anInt3338) {
	    Class14_Sub29 class14_sub29
		= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg1]
		   [arg2 + 1][arg3]);
	    if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
		&& class14_sub29.aClass4_3237.aClass133_124.method1784())
		arg0.method1788(class14_sub29.aClass4_3237.aClass133_124, 128,
				0, 0, true);
	}
	if (arg3 < Class99_Sub2.anInt3338) {
	    Class14_Sub29 class14_sub29
		= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg1][arg2]
		   [arg3 + 1]);
	    if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
		&& class14_sub29.aClass4_3237.aClass133_124.method1784())
		arg0.method1788(class14_sub29.aClass4_3237.aClass133_124, 0, 0,
				128, true);
	}
	if (arg2 < Class99_Sub2.anInt3338
	    && arg3 < Class14_Sub8_Sub15.anInt4337) {
	    Class14_Sub29 class14_sub29
		= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg1]
		   [arg2 + 1][arg3 + 1]);
	    if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
		&& class14_sub29.aClass4_3237.aClass133_124.method1784())
		arg0.method1788(class14_sub29.aClass4_3237.aClass133_124, 128,
				0, 128, true);
	}
	if (arg2 < Class99_Sub2.anInt3338 && arg3 > 0) {
	    Class14_Sub29 class14_sub29
		= (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg1]
		   [arg2 + 1][arg3 - 1]);
	    if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
		&& class14_sub29.aClass4_3237.aClass133_124.method1784())
		arg0.method1788(class14_sub29.aClass4_3237.aClass133_124, 128,
				0, -128, true);
	}
    }
    
    public static void method1340(byte arg0) {
    while_919_:
	do {
	while_918_:
	    do {
		do {
		    try {
			anInt1162++;
			if (null != Class14_Sub2_Sub19.aClass104_4037)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_918_;
		    }
		    return;
		} while (false);
		try {
		    try {
			int i = -107 / ((32 - arg0) / 38);
			byte[] is = Class14_Sub2_Sub19.aClass104_4037
					.method1533((byte) 81);
			if (null != is) {
			    Class14_Sub10 class14_sub10
				= new Class14_Sub10(is);
			    Class73.anInt1129
				= class14_sub10.method784((byte) 111);
			    Class133_Sub1.aClass45Array3435
				= new Class45[Class73.anInt1129];
			    for (int i_0_ = 0;
				 ((Class73.anInt1129 ^ 0xffffffff)
				  < (i_0_ ^ 0xffffffff));
				 i_0_++) {
				Class45 class45
				    = (Class133_Sub1.aClass45Array3435[i_0_]
				       = new Class45());
				int i_1_ = class14_sub10.method784((byte) 127);
				class45.aBoolean749
				    = (i_1_ & 0x8000 ^ 0xffffffff) != -1;
				class45.anInt744 = 0x7fff & i_1_;
				class45.aClass124_741
				    = class14_sub10.method797(9467);
				class45.anInt752 = class14_sub10.method805(0);
				class45.anInt742 = i_0_;
				int i_2_ = class14_sub10.method784((byte) 121);
				class45.anInt745
				    = Class47.method1182(i_2_, -1);
			    }
			    Class14_Sub2_Sub11.method309
				(Class133_Sub1.aClass45Array3435,
				 Class133_Sub1.aClass45Array3435.length + -1,
				 (byte) 127, 0);
			    Class14_Sub2_Sub19.aClass104_4037 = null;
			}
		    } catch (Exception exception) {
			exception.printStackTrace();
			Class14_Sub2_Sub19.aClass104_4037 = null;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_919_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "kl.K(" + arg0 + ')');
	} while (false);
    }
    
    public synchronized void method1341(int arg0) {
    while_924_:
	do {
	while_923_:
	    do {
		do {
		    try {
			anInt1177++;
			if (null != anIntArray1150)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_923_;
		    }
		    return;
		} while (false);
		long l;
	    while_922_:
		do {
		while_921_:
		    do {
		    while_920_:
			do {
			    do {
				try {
				    l = Class84.method1413((byte) 111);
				    try {
					if (aLong1181 == 0L)
					    break while_920_;
					if ((aLong1181 ^ 0xffffffffffffffffL)
					    >= (l ^ 0xffffffffffffffffL))
					    break;
				    } catch (Exception exception) {
					break while_921_;
				    }
				} catch (RuntimeException runtimeexception) {
				    break while_923_;
				}
				return;
			    } while (false);
			    try {
				method1347(anInt1174);
				aLong1181 = 0L;
				aBoolean1169 = true;
			    } catch (Exception exception) {
				break while_921_;
			    }
			} while (false);
			if (arg0 >= -43)
			    method1337(null, 30);
			int i = 0;
			try {
			i = method1342();
			} catch (Exception exception) {
			break;
			}
			if (anInt1171 < -i + anInt1172)
			    anInt1171 = -i + anInt1172;
			int i_3_ = anInt1173 - -anInt1170;
			if (-16385 > (i_3_ + 256 ^ 0xffffffff))
			    i_3_ = 16128;
			if (anInt1174 < 256 + i_3_) {
			    i = 0;
			    anInt1174 += 1024;
			    if ((anInt1174 ^ 0xffffffff) < -16385)
				anInt1174 = 16384;
			    method1351();
				try {
			    method1347(anInt1174);
				} catch (Exception exception) {
				break;
				}
			    aBoolean1169 = true;
			    if ((anInt1174 ^ 0xffffffff)
				> (256 + i_3_ ^ 0xffffffff)) {
				i_3_ = -256 + anInt1174;
				anInt1170 = -anInt1173 + i_3_;
			    }
			}
			while ((i_3_ ^ 0xffffffff) < (i ^ 0xffffffff)) {
			    i += 256;
			    method1349(anIntArray1150, 256);
				try {
			    method1353();
				} catch (Exception exception) {
				break;
				}
			}
			if ((l ^ 0xffffffffffffffffL)
			    < (aLong1175 ^ 0xffffffffffffffffL)) {
			    if (aBoolean1169)
				aBoolean1169 = false;
			    else {
				if (anInt1171 == 0
				    && (anInt1178 ^ 0xffffffff) == -1) {
				    method1351();
				    aLong1181 = 2000L + l;
				    return;
				}
				try {
				    try {
					anInt1170
					    = Math.min(anInt1178, anInt1171);
					anInt1178 = anInt1171;
				    } catch (Exception exception) {
					break;
				    }
				} catch (RuntimeException runtimeexception) {
				    break while_923_;
				}
			    }
			    aLong1175 = 2000L + l;
			    anInt1171 = 0;
			}
			anInt1172 = i;
			break while_922_;
		    } while (false);
		    Object object = new Throwable();
		    method1351();
		    aLong1181 = l - -2000L;
		} while (false);
		try {
		    if (l > aLong1160 - -500000L)
			l = aLong1160;
		    for (/**/; aLong1160 + 5000L < l;
			 aLong1160 += (long) (256000 / Class115.anInt1909))
			method1348(0, 256);
		} catch (Exception exception) {
		    aLong1160 = l;
		}
		break while_924_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "kl.O(" + arg0 + ')');
	} while (false);
    }
    
    public int method1342() throws Exception {
	int i;
	try {
	    anInt1164++;
	    i = anInt1174;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "kl.E()");
	}
	return i;
    }
    
    public static void method1343(int arg0, int arg1, int arg2, int arg3,
				  int arg4) {
	try {
	    anInt1161++;
	    if (Class14_Sub2_Sub11.anInt3881 == 1)
		Class14_Sub2_Sub15.aClass14_Sub2_Sub19Array3958
		    [Class14_Sub2_Sub17.anInt4017 / 100].method391
		    (Class14_Sub8_Sub9.anInt4243 - 8,
		     Class14_Sub8_Sub25.anInt4515 + -8);
	    int i = 100 % ((arg1 - 62) / 41);
	    if (-3 == (Class14_Sub2_Sub11.anInt3881 ^ 0xffffffff))
		Class14_Sub2_Sub15.aClass14_Sub2_Sub19Array3958
		    [4 - -(Class14_Sub2_Sub17.anInt4017 / 100)].method391
		    (-8 + Class14_Sub8_Sub9.anInt4243,
		     Class14_Sub8_Sub25.anInt4515 + -8);
	    Class14_Sub14.method868(67);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kl.P(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ arg4 + ')'));
	}
    }
    
    public synchronized void method1344(boolean arg0) {
	try {
	    anInt1156++;
	    aBoolean1169 = arg0;
	    try {
		method1335();
	    } catch (Exception exception) {
		method1351();
		aLong1181 = Class84.method1413((byte) -57) + 2000L;
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kl.R(" + arg0 + ')');
	}
    }
    
    public synchronized void method1345(int arg0) {
    while_926_:
	do {
	while_925_:
	    do {
		do {
		    try {
			if (Class69.aClass90_1070 != null) {
			    boolean bool = true;
			    for (int i = 0; (i ^ 0xffffffff) > -3; i++) {
				if (this == (Class69.aClass90_1070
					     .aClass75Array1422[i]))
				    Class69.aClass90_1070.aClass75Array1422[i]
					= null;
				if (Class69.aClass90_1070.aClass75Array1422[i]
				    != null)
				    bool = false;
			    }
			    if (bool) {
				Class69.aClass90_1070.aBoolean1428 = true;
				while (Class69.aClass90_1070.aBoolean1419)
				    Class14_Sub13.method864(50L, (byte) 64);
				Class69.aClass90_1070 = null;
			    }
			}
			method1351();
			if (arg0 == 25065)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_925_;
		    }
		    return;
		} while (false);
		try {
		    anInt1145++;
		    anIntArray1150 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_926_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "kl.S(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1346(byte arg0) {
	try {
	    aClass148Array1184 = null;
	    aClass20_1147 = null;
	    aClass124_1165 = null;
	    aClass9_Sub1_1167 = null;
	    aClass124_1152 = null;
	    aClass124_1183 = null;
	    aClass124_1182 = null;
	    if (arg0 < 73)
		method1339(null, -101, -120, 98);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kl.J(" + arg0 + ')');
	}
    }
    
    public void method1347(int arg0) throws Exception {
	try {
	    anInt1166++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kl.B(" + arg0 + ')');
	}
    }
    
    public void method1348(int arg0, int arg1) {
	try {
	    anInt1153++;
	    anInt1176 -= arg1;
	    if (anInt1176 < arg0)
		anInt1176 = 0;
	    if (null != aClass14_Sub9_1154)
		aClass14_Sub9_1154.method692(arg1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kl.M(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public void method1349(int[] arg0, int arg1) {
	int i = arg1;
	if (Class14_Sub2_Sub2.aBoolean3763)
	    i <<= 1;
	Class72.method1321(arg0, 0, i);
	anInt1176 -= arg1;
	if (aClass14_Sub9_1154 != null && anInt1176 <= 0) {
	    anInt1176 += Class115.anInt1909 >> 4;
	    Class14_Sub2_Sub19.method394((byte) -33, aClass14_Sub9_1154);
	    method1336(aClass14_Sub9_1154, aClass14_Sub9_1154.method691(),
		       15621);
	    int i_4_ = 0;
	    int i_5_ = 255;
	    int i_6_ = 7;
	while_927_:
	    while (i_5_ != 0) {
		int i_7_;
		int i_8_;
		if (i_6_ < 0) {
		    i_7_ = i_6_ & 0x3;
		    i_8_ = -(i_6_ >> 2);
		} else {
		    i_7_ = i_6_;
		    i_8_ = 0;
		}
		for (int i_9_ = i_5_ >>> i_7_ & 0x11111111; i_9_ != 0;
		     i_9_ >>>= 4) {
		    if ((i_9_ & 0x1) != 0) {
			i_5_ &= 1 << i_7_ ^ 0xffffffff;
			Class14_Sub9 class14_sub9 = null;
			Class14_Sub9 class14_sub9_10_
			    = aClass14_Sub9Array1179[i_7_];
			while (class14_sub9_10_ != null) {
			    Class14_Sub12 class14_sub12
				= class14_sub9_10_.aClass14_Sub12_2866;
			    if (class14_sub12 != null
				&& class14_sub12.anInt2953 > i_8_) {
				i_5_ |= 1 << i_7_;
				class14_sub9 = class14_sub9_10_;
				class14_sub9_10_
				    = class14_sub9_10_.aClass14_Sub9_2867;
			    } else {
				class14_sub9_10_.aBoolean2864 = true;
				int i_11_ = class14_sub9_10_.method690();
				i_4_ += i_11_;
				if (class14_sub12 != null)
				    class14_sub12.anInt2953 += i_11_;
				if (i_4_ >= anInt1158)
				    break while_927_;
				Class14_Sub9 class14_sub9_12_
				    = class14_sub9_10_.method688();
				if (class14_sub9_12_ != null) {
				    int i_13_ = class14_sub9_10_.anInt2865;
				    for (/**/; class14_sub9_12_ != null;
					 class14_sub9_12_
					     = class14_sub9_10_.method686())
					method1336(class14_sub9_12_,
						   (i_13_ * class14_sub9_12_
								.method691()
						    >> 8),
						   15621);
				}
				Class14_Sub9 class14_sub9_14_
				    = class14_sub9_10_.aClass14_Sub9_2867;
				class14_sub9_10_.aClass14_Sub9_2867 = null;
				if (class14_sub9 == null)
				    aClass14_Sub9Array1179[i_7_]
					= class14_sub9_14_;
				else
				    class14_sub9.aClass14_Sub9_2867
					= class14_sub9_14_;
				if (class14_sub9_14_ == null)
				    aClass14_Sub9Array1180[i_7_]
					= class14_sub9;
				class14_sub9_10_ = class14_sub9_14_;
			    }
			}
		    }
		    i_7_ += 4;
		    i_8_++;
		}
		i_6_--;
	    }
	    for (i_6_ = 0; i_6_ < 8; i_6_++) {
		Class14_Sub9 class14_sub9 = aClass14_Sub9Array1179[i_6_];
		aClass14_Sub9Array1179[i_6_] = aClass14_Sub9Array1180[i_6_]
		    = null;
		Class14_Sub9 class14_sub9_15_;
		for (/**/; class14_sub9 != null;
		     class14_sub9 = class14_sub9_15_) {
		    class14_sub9_15_ = class14_sub9.aClass14_Sub9_2867;
		    class14_sub9.aClass14_Sub9_2867 = null;
		}
	    }
	}
	if (anInt1176 < 0)
	    anInt1176 = 0;
	if (aClass14_Sub9_1154 != null)
	    aClass14_Sub9_1154.method687(arg0, 0, arg1);
	aLong1160 = Class84.method1413((byte) -95);
    }
    
    public void method1350(Component arg0) throws Exception {
	try {
	    anInt1157++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "kl.A(" + (arg0 != null
							  ? "{...}"
							  : "null") + ')');
	}
    }
    
    public void method1351() {
	try {
	    anInt1159++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "kl.D()");
	}
    }
    
    public synchronized void method1352(Class14_Sub9 arg0, boolean arg1) {
	try {
	    anInt1146++;
	    aClass14_Sub9_1154 = arg0;
	    if (arg1)
		method1339(null, 29, -75, -79);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("kl.T("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	}
    }
    
    public void method1353() throws Exception {
	try {
	    anInt1148++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "kl.C()");
	}
    }
    
    public Class75() {
	anInt1172 = 0;
	anInt1171 = 0;
	anInt1178 = 0;
	aClass14_Sub9Array1179 = new Class14_Sub9[8];
	anInt1176 = 0;
	aClass14_Sub9Array1180 = new Class14_Sub9[8];
	aLong1181 = 0L;
    }
    
    static {
	anInt1163 = -1;
	aClass20_1147 = new Class20(64);
	aClass124_1183
	    = Class14_Sub2_Sub2.method263(1178, "Loading sprites )2 ");
	aClass124_1182 = aClass124_1183;
    }
}
