/* Class114 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;

public class Class114
{
    public static int anInt1890;
    public static int anInt1891;
    public static int anInt1892;
    public static int[] anIntArray1893 = { 1, -1, -1, 1 };
    public static int anInt1894;
    public static int anInt1895;
    public static int[][][] anIntArrayArrayArray1896;
    public int anInt1897 = 65000;
    public int anInt1898;
    public static int anInt1899;
    public static Class124 aClass124_1900
	= Class14_Sub2_Sub2.method263(1178, "mapscene");
    public Class76 aClass76_1901 = null;
    public static int[] anIntArray1902 = new int[100];
    public static int anInt1903;
    public static int anInt1904;
    public Class76 aClass76_1905 = null;
    
    public byte[] method1582(int arg0, int arg1) {
	byte[] abytearray = null;
	try {
    while_2_:
	do {
	    Class76 class76;
	synchronized (aClass76_1901) {
	while_1_:
	    do {
	    while_0_:
		do {
		    do {
			try {
			    anInt1904++;
			    try {
				    if ((aClass76_1905.method1360((byte) -94)
					 ^ 0xffffffffffffffffL)
					<= ((long) (6 + 6 * arg1)
					    ^ 0xffffffffffffffffL))
					break;
				    abytearray = null;
			    } catch (Exception exception) {
				break while_1_;
			    }
			} catch (RuntimeException runtimeexception) {
			    break while_2_;
			}
			return abytearray;
		    } while (false);
		    int i;
		    int i_0_;
		    do {
			try {
			    try {
				aClass76_1905.method1361(0, (long) (6 * arg1));
				aClass76_1905.method1368
				    (false,
				     Class14_Sub8_Sub39_Sub1.aByteArray5102, 0,
				     6);
				i = ((0xff00
				      & (Class14_Sub8_Sub39_Sub1.aByteArray5102
					 [1]) << -1060183416)
				     + ((Class14_Sub8_Sub39_Sub1.aByteArray5102
					 [0]) << 2031355504
					& 0xff0000)
				     - -(0xff & (Class14_Sub8_Sub39_Sub1
						 .aByteArray5102[2])));
				i_0_ = ((0xff & (Class14_Sub8_Sub39_Sub1
						 .aByteArray5102[5]))
					+ (((0xff & (Class14_Sub8_Sub39_Sub1
						     .aByteArray5102[4]))
					    << 1891373928)
					   + (((Class14_Sub8_Sub39_Sub1
						.aByteArray5102[3])
					       & 0xff)
					      << 570473104)));
				if ((i ^ 0xffffffff) <= -1 && i <= anInt1897)
				    break;
				abytearray = null;
			    } catch (java.io.IOException ioexception) {
				break while_0_;
			    }
			} catch (Exception exception) {
			    break while_1_;
			}
			return abytearray;
		    } while (false);
		    do {
			try {
				if (-1 > (i_0_ ^ 0xffffffff)
				    && (((long) i_0_ ^ 0xffffffffffffffffL)
					>= (aClass76_1901
						.method1360((byte) -56) / 520L
					    ^ 0xffffffffffffffffL)))
				    break;
				abytearray = null;
			} catch (Exception exception) {
			    break while_1_;
			}
			return abytearray;
		    } while (false);
		    int i_1_;
		    byte[] is;
		    int i_2_;
		    try {
			    i_1_ = 0;
			    if (arg0 <= 122)
				aClass76_1901 = null;
			    is = new byte[i];
			    i_2_ = 0;
		    } catch (Exception exception) {
			break while_1_;
		    }
		    while ((i ^ 0xffffffff) < (i_1_ ^ 0xffffffff)) {
			if (-1 == (i_0_ ^ 0xffffffff)) {
			    abytearray = null;
			    return abytearray;
			}
			int i_3_;
			int i_4_;
			do {
			    try {
				try {
				    aClass76_1901
					.method1361(0, (long) (520 * i_0_));
				    i_3_ = -i_1_ + i;
				    if (i_3_ > 512)
					i_3_ = 512;
				    aClass76_1901.method1368
					(false,
					 (Class14_Sub8_Sub39_Sub1
					  .aByteArray5102),
					 0, 8 + i_3_);
				    int i_5_
					= (((Class14_Sub8_Sub39_Sub1
					     .aByteArray5102[2]) << -1860788184
					    & 0xff00)
					   + ((Class14_Sub8_Sub39_Sub1
					       .aByteArray5102[3])
					      & 0xff));
				    int i_6_
					= (((Class14_Sub8_Sub39_Sub1
					     .aByteArray5102[0]) << -1030171096
					    & 0xff00)
					   + ((Class14_Sub8_Sub39_Sub1
					       .aByteArray5102[1])
					      & 0xff));
				    i_4_
					= (((0xff & (Class14_Sub8_Sub39_Sub1
						     .aByteArray5102[5]))
					    << -1034758232)
					   + (((0xff & (Class14_Sub8_Sub39_Sub1
							.aByteArray5102[4]))
					       << -1939533264)
					      + ((Class14_Sub8_Sub39_Sub1
						  .aByteArray5102[6])
						 & 0xff)));
				    int i_7_ = 0xff & (Class14_Sub8_Sub39_Sub1
						       .aByteArray5102[7]);
				    if (arg1 == i_6_ && i_2_ == i_5_
					&& anInt1898 == i_7_)
					break;
				    abytearray = null;
				} catch (java.io.IOException ioexception) {
				    break while_0_;
				}
			    } catch (Exception exception) {
				break while_1_;
			    }
			    return abytearray;
			} while (false);
			do {
			    try {
				    if ((i_4_ ^ 0xffffffff) <= -1
					&& ((aClass76_1901
						 .method1360((byte) -55) / 520L
					     ^ 0xffffffffffffffffL)
					    <= ((long) i_4_
						^ 0xffffffffffffffffL)))
					break;
				    abytearray = null;
			    } catch (Exception exception) {
				break while_1_;
			    }
			    return abytearray;
			} while (false);
			try {
				for (int i_8_ = 0;
				     (i_8_ ^ 0xffffffff) > (i_3_ ^ 0xffffffff);
				     i_8_++)
				    is[i_1_++] = (Class14_Sub8_Sub39_Sub1
						  .aByteArray5102[8 + i_8_]);
				i_0_ = i_4_;
				i_2_++;
			} catch (Exception exception) {
			    break while_1_;
			}
		    }
		    abytearray = is;
		    return abytearray;
		} while (false);
		try {
		    abytearray = null;
		} catch (Exception exception) {
		    break;
		}
		return abytearray;
	    } while (false);
	  }
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   "rl.D(" + arg0 + ',' + arg1 + ')');
	}
	return abytearray;
    }
    
    public boolean method1583(int arg0, byte[] arg1, int arg2, int arg3) {
	boolean bool_0_ = method1584(arg3, true, arg0, arg1, 91);
	try {
	    anInt1899++;
	    Class76 class76;
	    synchronized (aClass76_1901) {
	    try {
		if ((arg3 ^ 0xffffffff) > arg2 || anInt1897 < arg3)
		    throw new IllegalArgumentException();
		boolean bool = method1584(arg3, true, arg0, arg1, 91);
		if (!bool)
		    bool = method1584(arg3, false, arg0, arg1, 122);
		bool_0_ = bool;
	    } catch (Exception exception) {
		try {
		try {
		    RuntimeException runtimeexception = new RuntimeException();
		    throw runtimeexception;
		} catch (RuntimeException runtimeexception) {
		    /* empty */
		}
		} catch (Throwable throwable) {
		throw Class14_Sub8_Sub14.method554(throwable,
						   ("rl.C(" + arg0 + ','
						    + (arg1 != null ? "{...}"
						       : "null")
						    + ',' + arg2 + ',' + arg3
						    + ')'));
		  }
	    }
	  }
	} catch (RuntimeException runtimeexception) {
	    /* empty */
	}
	return bool_0_;
    }
    
    public boolean method1584(int arg0, boolean arg1, int arg2, byte[] arg3,
			      int arg4) {
	System.out.println("hi");
	boolean abool = false;
	try {
    while_7_:
	do {
	    Class76 class76;
	synchronized (aClass76_1901) {
	while_6_:
	    do {
	    while_5_:
		do {
		    int i;
		while_3_:
		    do {
			do {
			    try {
				anInt1895++;
				try {
				    if (arg4 < 86)
					anIntArray1893 = null;
					if (!arg1) {
					    i = (int) ((519L + (aClass76_1901
								    .method1360
								((byte) -39)))
						       / 520L);
					    if ((i ^ 0xffffffff) == -1)
						i = 1;
					    break while_3_;
					}
					if ((long) (6 * arg2 + 6)
					    <= aClass76_1905
						   .method1360((byte) -103))
					    break;
					abool = false;
				} catch (Exception exception) {
				    break while_6_;
				}
			    } catch (RuntimeException runtimeexception) {
				break while_7_;
			    }
			    return abool;
			} while (false);
			try {
			    try {
				aClass76_1905.method1361(0, (long) (arg2 * 6));
				aClass76_1905.method1368
				    (false,
				     Class14_Sub8_Sub39_Sub1.aByteArray5102, 0,
				     6);
				i = ((Class14_Sub8_Sub39_Sub1.aByteArray5102[5]
				      & 0xff)
				     + ((0xff & (Class14_Sub8_Sub39_Sub1
						 .aByteArray5102[3]))
					<< 1678464912)
				     + (((Class14_Sub8_Sub39_Sub1
					  .aByteArray5102[4])
					 & 0xff)
					<< -2030871864));
				if ((i ^ 0xffffffff) < -1
				    && ((long) i
					<= (aClass76_1901
						.method1360((byte) -116)
					    / 520L)))
				    break;
				abool = false;
			    } catch (java.io.IOException ioexception) {
				break while_5_;
			    }
			} catch (Exception exception) {
			    break while_6_;
			}
			return abool;
		    } while (false);
		    int i_9_;
		    int i_10_;
		    try {
			try {
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[3]
				= (byte) (i >> -496354320);
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[1]
				= (byte) (arg0 >> 1556466536);
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[4]
				= (byte) (i >> -1916889944);
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[2]
				= (byte) arg0;
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[0]
				= (byte) (arg0 >> 2077572816);
			    Class14_Sub8_Sub39_Sub1.aByteArray5102[5]
				= (byte) i;
			    aClass76_1905.method1361(0, (long) (6 * arg2));
			    aClass76_1905.method1362(0, 6, (byte) 94,
						     (Class14_Sub8_Sub39_Sub1
						      .aByteArray5102));
			    i_9_ = 0;
			    i_10_ = 0;
			} catch (java.io.IOException ioexception) {
			    break;
			}
		    } catch (Exception exception) {
			break while_6_;
		    }
		while_4_:
		    while (i_9_ < arg0) {
			int i_11_ = 0;
			do {
			    if (arg1) {
				aClass76_1901.method1361(0, (long) (520 * i));
				try {
				    aClass76_1901.method1368
					(false, (Class14_Sub8_Sub39_Sub1
						 .aByteArray5102), 0, 8);
				} catch (EOFException eofexception) {
				    break while_4_;
				}
				int i_12_
				    = ((0xff & (Class14_Sub8_Sub39_Sub1
						.aByteArray5102[1]))
				       + (0xff00 & ((Class14_Sub8_Sub39_Sub1
						     .aByteArray5102[0])
						    << -1212070616)));
				i_11_ = ((0xff0000
					  & (Class14_Sub8_Sub39_Sub1
					     .aByteArray5102[4]) << 20788048)
					 - -(0xff00 & ((Class14_Sub8_Sub39_Sub1
							.aByteArray5102[5])
						       << 642797672))
					 - -((Class14_Sub8_Sub39_Sub1
					      .aByteArray5102[6])
					     & 0xff));
				int i_13_ = (((Class14_Sub8_Sub39_Sub1
					       .aByteArray5102[3])
					      & 0xff)
					     + (((Class14_Sub8_Sub39_Sub1
						  .aByteArray5102[2])
						 & 0xff)
						<< 1147096168));
				int i_14_ = 0xff & (Class14_Sub8_Sub39_Sub1
						    .aByteArray5102[7]);
				if (arg2 != i_12_ || i_10_ != i_13_
				    || i_14_ != anInt1898) {
				    abool = false;
				    return abool;
				}
				try {
					if (0 <= i_11_
					    && (((aClass76_1901
						      .method1360((byte) -74)
						  / 520L)
						 ^ 0xffffffffffffffffL)
						<= ((long) i_11_
						    ^ 0xffffffffffffffffL)))
					    break;
					abool = false;
				} catch (Exception exception) {
				    break while_6_;
				}
				return abool;
			    }
			} while (false);
			try {
			    try {
				if (i_11_ == 0) {
				    arg1 = false;
				    i_11_ = (int) ((aClass76_1901
							.method1360((byte) -54)
						    + 519L)
						   / 520L);
				    if (-1 == (i_11_ ^ 0xffffffff))
					i_11_++;
				    if ((i ^ 0xffffffff)
					== (i_11_ ^ 0xffffffff))
					i_11_++;
				}
				Class14_Sub8_Sub39_Sub1.aByteArray5102[3]
				    = (byte) i_10_;
				Class14_Sub8_Sub39_Sub1.aByteArray5102[1]
				    = (byte) arg2;
				Class14_Sub8_Sub39_Sub1.aByteArray5102[0]
				    = (byte) (arg2 >> -1151980952);
				Class14_Sub8_Sub39_Sub1.aByteArray5102[7]
				    = (byte) anInt1898;
				int i_15_ = arg0 + -i_9_;
				if (512 < i_15_)
				    i_15_ = 512;
				if (512 >= -i_9_ + arg0)
				    i_11_ = 0;
				Class14_Sub8_Sub39_Sub1.aByteArray5102[5]
				    = (byte) (i_11_ >> -753001912);
				Class14_Sub8_Sub39_Sub1.aByteArray5102[2]
				    = (byte) (i_10_ >> 374894408);
				Class14_Sub8_Sub39_Sub1.aByteArray5102[4]
				    = (byte) (i_11_ >> -1164115952);
				i_10_++;
				Class14_Sub8_Sub39_Sub1.aByteArray5102[6]
				    = (byte) i_11_;
				aClass76_1901.method1361(0, (long) (520 * i));
				aClass76_1901.method1362
				    (0, 8, (byte) 45,
				     Class14_Sub8_Sub39_Sub1.aByteArray5102);
				i = i_11_;
				aClass76_1901.method1362(i_9_, i_15_,
							 (byte) 92, arg3);
				i_9_ += i_15_;
			    } catch (java.io.IOException ioexception) {
				break while_5_;
			    }
			} catch (Exception exception) {
			    break while_6_;
			}
		    }
		    abool = true;
		    return abool;
		} while (false);
		try {
		    abool = false;
		} catch (Exception exception) {
		    break;
		}
		return abool;
	    } while (false);
	  }
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("rl.B(" + arg0 + ',' + arg1 + ','
					    + arg2 + ','
					    + (arg3 != null ? "{...}" : "null")
					    + ',' + arg4 + ')'));
	}
	return abool;
    }
    
    public static void method1585(boolean arg0) {
    while_9_:
	do {
	try {
	while_8_:
	    do {
		do {
		    try {
			anIntArray1893 = null;
			if (!arg0)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_8_;
		    }
		    return;
		} while (false);
		try {
		    aClass124_1900 = null;
		    anIntArrayArrayArray1896 = null;
		    anIntArray1902 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_9_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "rl.E(" + arg0 + ')');
		}
	} while (false);
    }
    
    public static void method1586(int[] arg0, Object[] arg1, byte arg2) {
	try {
	    anInt1894++;
	    Class14_Sub2_Sub7.method289((byte) 124, arg0.length - 1, arg0,
					arg1, 0);
	    int i = -12 % ((-5 - arg2) / 58);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rl.A("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	}
    }
    
    public static void method1587(Class124 arg0, int arg1, int arg2) {
	try {
	    anInt1890++;
	    Class124 class124 = arg0.method1688(15).method1685(0);
	    boolean bool = false;
	    for (int i = arg1; i < Class14_Sub10.anInt2878; i++) {
		Class133_Sub1_Sub1 class133_sub1_sub1
		    = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474
		       [Class14.anIntArray351[i]]);
		if (null != class133_sub1_sub1
		    && null != class133_sub1_sub1.aClass124_4922
		    && class133_sub1_sub1.aClass124_4922
			   .method1717(40, class124)) {
		    Class14_Sub8_Sub35.method663
			((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476
			  [0]),
			 1, 0, 0, (byte) 109,
			 (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443
			  [0]),
			 false, 0, class133_sub1_sub1.anIntArray3476[0], 2, 1,
			 class133_sub1_sub1.anIntArray3443[0]);
		    if (-2 != (arg2 ^ 0xffffffff)) {
			if (-5 == (arg2 ^ 0xffffffff)) {
			    Class124.anInt2483++;
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 253);
			    Class55.aClass14_Sub10_Sub1_891.method801
				((byte) -56, Class14.anIntArray351[i]);
			} else if ((arg2 ^ 0xffffffff) != -7) {
			    if ((arg2 ^ 0xffffffff) == -8) {
				Class54.anInt880++;
				Class55.aClass14_Sub10_Sub1_891.method843(0,
									  93);
				Class55.aClass14_Sub10_Sub1_891.method801
				    ((byte) -119, Class14.anIntArray351[i]);
			    }
			} else {
			    Class55.aClass14_Sub10_Sub1_891.method843(0, 35);
			    Class115.anInt1912++;
			    Class55.aClass14_Sub10_Sub1_891.method801
				((byte) -122, Class14.anIntArray351[i]);
			}
		    } else {
			Class55.aClass14_Sub10_Sub1_891.method843(0, 160);
			Class55.aClass14_Sub10_Sub1_891
			    .method838(-1676904088, Class14.anIntArray351[i]);
			Class14_Sub8_Sub16.anInt4350++;
		    }
		    bool = true;
		    break;
		}
	    }
	    if (!bool)
		Class15.method943((Class14_Sub8_Sub7.method515
				   (new Class124[] { Class125.aClass124_2077,
						     class124 },
				    (byte) -120)),
				  false, Class14_Sub8_Sub9.aClass124_4244, 0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rl.F("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ',' + arg2
						+ ')'));
	}
    }
    
    public String toString() {
	String string_0_;
	try {
	    anInt1903++;
	    string_0_ = "Cache:" + anInt1898;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "rl.toString()");
	}
	return string_0_;
    }
    
    public Class114(int arg0, Class76 arg1, Class76 arg2, int arg3) {
	try {
	    anInt1897 = arg3;
	    anInt1898 = arg0;
	    aClass76_1905 = arg2;
	    aClass76_1901 = arg1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("rl.<init>(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg2 != null ? "{...}"
						   : "null")
						+ ',' + arg3 + ')'));
	}
    }
}