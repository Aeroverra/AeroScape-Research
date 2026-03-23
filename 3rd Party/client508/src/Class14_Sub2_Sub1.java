/* Class14_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.IOException;
import java.nio.ByteBuffer;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

public class Class14_Sub2_Sub1 extends Class14_Sub2
{
    public static int[] anIntArray3720;
    public static Class66[] aClass66Array3721;
    public static int anInt3722;
    public static int anInt3723;
    public static Class124 aClass124_3724
	= Class14_Sub2_Sub2.method263(1178, " )2> <col=ffff00>");
    public int anInt3725;
    public boolean aBoolean3726;
    public static int anInt3727;
    public static int anInt3728;
    public static int anInt3729;
    public boolean aBoolean3730;
    public int anInt3731;
    public static int anInt3732;
    public static int anInt3733;
    public static int anInt3734;
    public int anInt3735;
    public static int anInt3736;
    public static int anInt3737;
    public boolean aBoolean3738;
    public static int anInt3739;
    public static int anInt3740;
    public static int anInt3741;
    public Class107 aClass107_3742;
    public boolean aBoolean3743;
    public int anInt3744;
    public int[] anIntArray3745;
    public boolean aBoolean3746 = false;
    public static Class124 aClass124_3747;
    public static int anInt3748;
    public static int anInt3749;
    public float aFloat3750;
    public int anInt3751;
    public int anInt3752;
    public int anInt3753;
    
    public static Class124 method249(int arg0, int arg1) {
    while_141_:
	do {
	    do {
		Class124 class124;
		try {
		    anInt3737++;
		    if (-100001 >= (arg1 ^ 0xffffffff))
			break;
		    class124 = (Class14_Sub8_Sub7.method515
				(new Class124[] { Class64.aClass124_1010,
						  Class83.method1407(68, arg1),
						  Class149.aClass124_2390 },
				 (byte) -33));
		} catch (RuntimeException runtimeexception) {
		    break while_141_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (arg0 >= 12)
			break;
		    class124 = null;
		} catch (RuntimeException runtimeexception) {
		    break while_141_;
		}
		return class124;
	    } while (false);
	    do {
		Class124 class124;
		try {
		    if (arg1 >= 10000000)
			break;
		    class124
			= (Class14_Sub8_Sub7.method515
			   (new Class124[] { Class150.aClass124_2418,
					     Class83.method1407(99,
								arg1 / 1000),
					     Class111.aClass124_1864,
					     Class149.aClass124_2390 },
			    (byte) -14));
		} catch (RuntimeException runtimeexception) {
		    break while_141_;
		}
		return class124;
	    } while (false);
	    Class124 class124;
	    try {
		class124
		    = (Class14_Sub8_Sub7.method515
		       ((new Class124[]
			 { Class14_Sub17.aClass124_3026,
			   Class83.method1407(71, arg1 / 1000000),
			   Class41.aClass124_695, Class149.aClass124_2390 }),
			(byte) -37));
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class124;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   "ag.C(" + arg0 + ',' + arg1 + ')');
    }
    
    public static void method250(int arg0, boolean arg1) {
    while_143_:
	do {
	while_142_:
	    do {
		do {
		    try {
			anInt3733++;
			if (Class126.method1741((byte) 50, arg0))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_142_;
		    }
		    return;
		} while (false);
		try {
		    Class125_Sub3.method1735((byte) 31, -1,
					     (Class1.aClass94ArrayArray75
					      [arg0]));
		    if (arg1)
			method256(null, null, 49);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_143_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ag.I(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public static Object method251(boolean arg0, byte[] arg1, int arg2) {
    while_144_:
	do {
	    do {
		Object object;
		try {
		    anInt3736++;
		    if (null != arg1)
			break;
		    object = null;
		} catch (RuntimeException runtimeexception) {
		    break while_144_;
		}
		return object;
	    } while (false);
	    do {
		Class126 class126;
		try {
		    if (136 >= arg1.length || Class14_Sub8_Sub10.aBoolean4245)
			break;
		    try {
			Class126 class126_0_
			    = ((Class126)
			       Class.forName("Class126_Sub1").newInstance());
			class126_0_.method1740(arg1, 101);
			class126 = class126_0_;
		    } catch (Throwable throwable) {
			try {
			    Object object = new Throwable();
			    Class14_Sub8_Sub10.aBoolean4245 = true;
			    break;
			} catch (RuntimeException PUSH) {
			    break while_144_;
			}
		    }
		} catch (RuntimeException runtimeexception) {
		    break while_144_;
		}
		return class126;
	    } while (false);
	    if (arg2 > -67)
		return null;
	    do {
		byte[] is;
		try {
		    if (!arg0)
			break;
		    is = Class14_Sub8_Sub26.method616(arg1, 84);
		} catch (RuntimeException runtimeexception) {
		    break while_144_;
		}
		return is;
	    } while (false);
	    byte[] is;
	    try {
		is = arg1;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ag.G(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ')'));
    }
    
    public boolean method252(Interface3 arg0, boolean arg1, int arg2,
			     Class9 arg3) {
    while_145_:
	do {
	    do {
		boolean bool;
		try {
		    anInt3734++;
		    if (aClass107_3742.method1548(arg0, -122, arg3))
			break;
		    bool = false;
		} catch (RuntimeException runtimeexception) {
		    break while_145_;
		}
		return bool;
	    } while (false);
	    boolean bool;
	    try {
		GL gl = Class121.aGL2030;
		int i = arg1 ? 64 : 128;
		int i_1_ = Class37.method1111(0);
		if ((0x1 & i_1_ ^ 0xffffffff) == -1) {
		    if (-1 != anInt3744)
			Class121.method1632(anInt3744);
		    else {
			int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			anInt3731 = Class11.anInt267;
			anInt3744 = is[0];
			Class121.method1632(anInt3744);
			ByteBuffer bytebuffer
			    = (ByteBuffer.wrap
			       (aClass107_3742.method1555(i, arg0, 0.7,
							  aBoolean3738, i,
							  (byte) -94, arg3)));
			if (-3 != (anInt3752 ^ 0xffffffff)) {
			    if (1 != anInt3752) {
				gl.glTexImage2D(3553, 0, 6408, i, i, 0, 6408,
						5121, bytebuffer);
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
				Class11.anInt266
				    += bytebuffer.limit() - anInt3753;
				anInt3753 = bytebuffer.limit();
			    } else {
				int i_2_ = 0;
				for (;;) {
				    gl.glTexImage2D(3553, i_2_++, 6408, i, i,
						    0, 6408, 5121, bytebuffer);
				    i >>= 1;
				    if (-1 == (i ^ 0xffffffff))
					break;
				    bytebuffer
					= ByteBuffer.wrap(aClass107_3742
							      .method1555
							  (i, arg0, 0.7,
							   aBoolean3738, i,
							   (byte) -84, arg3));
				}
				gl.glTexParameteri(3553, 10241, 9987);
				gl.glTexParameteri(3553, 10240, 9729);
				Class11.anInt266
				    += bytebuffer.limit() * 4 / 3 - anInt3753;
				anInt3753 = 4 * bytebuffer.limit() / 3;
			    }
			} else {
			    GLU glu = new GLU();
			    glu.gluBuild2DMipmaps(3553, 6408, i, i, 6408, 5121,
						  bytebuffer);
			    gl.glTexParameteri(3553, 10241, 9987);
			    gl.glTexParameteri(3553, 10240, 9729);
			    Class11.anInt266
				+= 4 * bytebuffer.limit() / 3 - anInt3753;
			    anInt3753 = 4 * bytebuffer.limit() / 3;
			}
			gl.glTexParameteri(3553, 10242,
					   !aBoolean3743 ? 33071 : 10497);
			gl.glTexParameteri(3553, 10243,
					   aBoolean3726 ? 10497 : 33071);
		    }
		}
		if (-1 == (0x2 & i_1_ ^ 0xffffffff))
		    Class121.method1638(anInt3725);
		if (arg2 <= 99)
		    method258(12);
		if ((0x4 & i_1_) == 0)
		    Class121.method1656(0);
		if ((0x8 & i_1_) == 0) {
		    if (anInt3751 == 0 && anInt3735 == 0)
			Class121.method1651();
		    else {
			float f = ((float) (anInt3751 * Class121.anInt2045)
				   / (float) i);
			float f_3_ = ((float) (anInt3735 * Class121.anInt2045)
				      / (float) i);
			Class121.method1641(f_3_, f, 0.0F);
		    }
		}
		bool = true;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ag.A("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public void method253(int arg0, boolean arg1) {
    while_147_:
	do {
	while_146_:
	    do {
		do {
		    try {
			anInt3740++;
			if (anIntArray3745 != null)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_146_;
		    }
		    return;
		} while (false);
		try {
		    if (arg1)
			aClass124_3747 = null;
		    if (0 != anInt3751 || anInt3735 != 0) {
			if (Class120.anIntArray2002 == null
			    || (anIntArray3745.length
				> Class120.anIntArray2002.length))
			    Class120.anIntArray2002
				= new int[anIntArray3745.length];
			int i = (-4097 != (anIntArray3745.length ^ 0xffffffff)
				 ? 128 : 64);
			int i_4_ = anIntArray3745.length;
			int i_5_ = i + -1;
			int i_6_ = anInt3735 * arg0;
			int i_7_ = i * arg0 * anInt3751;
			int i_8_ = i_4_ - 1;
			for (int i_9_ = 0; i_4_ > i_9_; i_9_ += i) {
			    int i_10_ = i_8_ & i_7_ + i_9_;
			    for (int i_11_ = 0; i_11_ < i; i_11_++) {
				int i_12_ = i_9_ - -i_11_;
				int i_13_ = i_10_ + (i_5_ & i_6_ + i_11_);
				Class120.anIntArray2002[i_12_]
				    = anIntArray3745[i_13_];
			    }
			}
			int[] is = anIntArray3745;
			anIntArray3745 = Class120.anIntArray2002;
			Class120.anIntArray2002 = is;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_147_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ag.E(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public boolean method254(Class9 arg0, int arg1, Interface3 arg2) {
	boolean bool;
	try {
	    anInt3727++;
	    if (arg1 != 255)
		method254(null, -71, null);
	    bool = aClass107_3742.method1548(arg2, -120, arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ag.H("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ')'));
	}
	return bool;
    }
    
    public int[] method255(Interface3 arg0, float arg1, int arg2, Class9 arg3,
			   boolean arg4) {
    while_149_:
	do {
	while_148_:
	    do {
		do {
		    int[] is;
		    try {
			anInt3748++;
			if (anIntArray3745 != null && arg1 == aFloat3750)
			    break while_148_;
			if (aClass107_3742.method1548(arg0, -119, arg3))
			    break;
			is = null;
		    } catch (RuntimeException runtimeexception) {
			break while_149_;
		    }
		    return is;
		} while (false);
		try {
		    int i = !arg4 ? 128 : 64;
		    anIntArray3745
			= aClass107_3742.method1553(i, true, 0, aBoolean3738,
						    arg3, (double) arg1, i,
						    arg0);
		    aFloat3750 = arg1;
		    if (aBoolean3730) {
			int[] is = new int[i];
			int[] is_14_ = new int[i];
			int[] is_15_ = new int[i];
			int[] is_16_ = new int[i * i];
			int i_17_ = i;
			int i_18_ = i;
			int i_20_;
			int i_19_ = i_20_ = 1 * i_18_;
			int i_21_ = -1 + i_18_;
			int i_22_ = i_18_ * i_17_;
			int i_23_ = -1 + i_17_;
			for (int i_24_ = 2; -1 >= (i_24_ ^ 0xffffffff);
			     i_24_--) {
			    for (int i_25_ = i_21_; -1 >= (i_25_ ^ 0xffffffff);
				 i_25_--) {
				int i_26_ = anIntArray3745[--i_20_];
				is[i_25_]
				    += (Class14_Sub8_Sub26.method617(i_26_,
								     16770996)
					>> 1384039440);
				is_14_[i_25_]
				    += (Class14_Sub8_Sub26.method617(i_26_,
								     65357)
					>> 1335142504);
				is_15_[i_25_]
				    += Class14_Sub8_Sub26.method617(i_26_,
								    255);
			    }
			    if (i_20_ == 0)
				i_20_ = i_22_;
			}
			int i_27_ = i_22_;
			for (int i_28_ = i_23_; i_28_ >= 0; i_28_--) {
			    int i_29_ = 1;
			    int i_31_;
			    int i_32_;
			    int i_30_ = i_31_ = i_32_ = 0;
			    for (int i_33_ = 2; -1 >= (i_33_ ^ 0xffffffff);
				 i_33_--) {
				i_29_--;
				i_30_ += is[i_29_];
				i_32_ += is_14_[i_29_];
				i_31_ += is_15_[i_29_];
				if ((i_29_ ^ 0xffffffff) == -1)
				    i_29_ = i_18_;
			    }
			    int i_34_ = 1;
			    for (int i_35_ = i_21_; -1 >= (i_35_ ^ 0xffffffff);
				 i_35_--) {
				i_29_--;
				i_34_--;
				int i_36_ = i_32_ / 9;
				int i_37_ = i_30_ / 9;
				int i_38_ = i_31_ / 9;
				is_16_[--i_27_]
				    = (Class66.method1294
				       (i_38_,
					Class66.method1294((i_37_
							    << -1062953648),
							   (i_36_
							    << 1339810216))));
				i_30_ += -is[i_34_] + is[i_29_];
				i_31_ += -is_15_[i_34_] + is_15_[i_29_];
				i_32_ += -is_14_[i_34_] + is_14_[i_29_];
				if ((i_29_ ^ 0xffffffff) == -1)
				    i_29_ = i_18_;
				if ((i_34_ ^ 0xffffffff) == -1)
				    i_34_ = i_18_;
			    }
			    for (int i_39_ = i_21_; (i_39_ ^ 0xffffffff) <= -1;
				 i_39_--) {
				int i_40_ = anIntArray3745[--i_19_];
				int i_41_ = anIntArray3745[--i_20_];
				is[i_39_] += (-(Class14_Sub8_Sub26.method617
						(i_40_ >> 539359024, 255))
					      + (Class14_Sub8_Sub26.method617
						 (i_41_ >> 1869706832, 255)));
				is_14_[i_39_]
				    += (-(Class14_Sub8_Sub26.method617
					  (i_40_ >> 939296680, 255))
					+ (Class14_Sub8_Sub26.method617
					   (255, i_41_ >> 1878628040)));
				is_15_[i_39_]
				    += (Class14_Sub8_Sub26.method617(255,
								     i_41_)
					+ -Class14_Sub8_Sub26
					       .method617(255, i_40_));
			    }
			    if ((i_20_ ^ 0xffffffff) == -1)
				i_20_ = i_22_;
			    if (-1 == (i_19_ ^ 0xffffffff))
				i_19_ = i_22_;
			}
			anIntArray3745 = is_16_;
		    }
		} catch (RuntimeException runtimeexception) {
		    break while_149_;
		}
	    } while (false);
	    if (arg2 != -1)
		return null;
	    int[] is;
	    try {
		is = anIntArray3745;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ag.B("
					    + (arg0 != null ? "{...}" : "null")
					    + ',' + arg1 + ',' + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ',' + arg4 + ')'));
    }
    
    public static void method256(short[] arg0, Class124[] arg1, int arg2) {
	try {
	    int i = 109 / ((arg2 - -71) / 49);
	    anInt3741++;
	    Class14_Sub8_Sub9.method525(arg1, -25279, arg1.length - 1, 0,
					arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ag.F("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public void finalize() throws Throwable {
	try {
	    anInt3729++;
	    if (0 != (anInt3744 ^ 0xffffffff)) {
		Class11.method202(anInt3744, anInt3753, anInt3731);
		anInt3753 = 0;
		anInt3744 = -1;
	    }
	    super.finalize();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ag.finalize()");
	}
    }
    
    public int[] method257(boolean arg0, Class9 arg1, boolean arg2,
			   Interface3 arg3) {
    while_150_:
	do {
	    do {
		int[] is;
		try {
		    anInt3722++;
		    if (aClass107_3742.method1548(arg3, -120, arg1))
			break;
		    is = null;
		} catch (RuntimeException runtimeexception) {
		    break while_150_;
		}
		return is;
	    } while (false);
	    int[] is;
	    try {
		int i = arg2 ? 64 : 128;
		if (arg0)
		    method253(-104, true);
		is = aClass107_3742.method1553(i, false, 0, aBoolean3738, arg1,
					       1.0, i, arg3);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return is;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("ag.D(" + arg0 + ','
					    + (arg1 != null ? "{...}" : "null")
					    + ',' + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ')'));
    }
    
    public static void method258(int arg0) {
    while_152_:
	do {
	while_151_:
	    do {
		do {
		    try {
			aClass66Array3721 = null;
			anIntArray3720 = null;
			aClass124_3747 = null;
			if (arg0 == 1869706832)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_151_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_3724 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_152_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ag.J(" + arg0 + ')');
	} while (false);
    }
    
    public static void method259(boolean arg0, int arg1) {
    while_154_:
	do {
	while_153_:
	    do {
		do {
		    try {
			if (arg1 == 11988)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_153_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class138.method1946(139);
			anInt3723++;
			if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == -31
			    || -26 == (Class14_Sub8_Sub16.anInt4356
				       ^ 0xffffffff))
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_153_;
		    }
		    return;
		} while (false);
		do {
		    try {
			Class9.anInt246++;
			if (-51 >= (Class9.anInt246 ^ 0xffffffff) || arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_153_;
		    }
		    return;
		} while (false);
		try {
		    Class9.anInt246 = 0;
		    if (!Class89.aBoolean1416
			&& null != Class14_Sub15.aClass36_2990) {
			Class32.anInt571++;
			Class55.aClass14_Sub10_Sub1_891.method843(0, 115);
			try {
			    Class14_Sub15.aClass36_2990.method1100
				(0, 3,
				 Class55.aClass14_Sub10_Sub1_891.anInt2908,
				 (Class55.aClass14_Sub10_Sub1_891
				  .aByteArray2895));
			    Class55.aClass14_Sub10_Sub1_891.anInt2908 = 0;
			} catch (IOException ioexception) {
			    Class89.aBoolean1416 = true;
			}
		    }
		    Class138.method1946(139);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_154_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14
		      .method554(throwable, "ag.K(" + arg0 + ',' + arg1 + ')');
	} while (false);
    }
    
    public Class14_Sub2_Sub1(Class14_Sub10 arg0) {
	anInt3744 = -1;
	anInt3753 = 0;
	try {
	    aClass107_3742 = new Class107(arg0);
	    aBoolean3730 = 1 == arg0.method798(-48);
	    aBoolean3738 = arg0.method798(-84) == 1;
	    aBoolean3743 = -2 == (arg0.method798(110) ^ 0xffffffff);
	    aBoolean3726 = 1 == arg0.method798(-41);
	    int i = 0x3 & arg0.method798(-118);
	    anInt3735 = arg0.method780((byte) -77);
	    anInt3751 = arg0.method780((byte) -77);
	    int i_42_ = arg0.method798(111);
	    arg0.method798(-40);
	    if ((i ^ 0xffffffff) == -2)
		anInt3725 = 2;
	    else if (2 != i) {
		if (3 != i)
		    anInt3725 = 0;
		else
		    anInt3725 = 4;
	    } else
		anInt3725 = 3;
	    anInt3752 = 0xf & i_42_ >> 452939012;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ag.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	anIntArray3720 = new int[200];
	anInt3732 = 1;
	aClass124_3747
	    = Class14_Sub2_Sub2.method263(1178,
					  "Lade Benutzeroberfl-=che )2 ");
	anInt3739 = 0;
	anInt3749 = 0;
	anInt3728 = 0;
	aClass66Array3721 = new Class66[4];
    }
}
