/* Class36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Class36 implements Runnable
{
    public OutputStream anOutputStream604;
    public static int anInt605;
    public Class31 aClass31_606;
    public static int anInt607;
    public static int anInt608;
    public Socket aSocket609;
    public static int anInt610;
    public Class43 aClass43_611;
    public static int anInt612 = 0;
    public int anInt613 = 0;
    public static int anInt614;
    public static int anInt615;
    public boolean aBoolean616;
    public InputStream anInputStream617;
    public static int anInt618;
    public int anInt619;
    public boolean aBoolean620 = false;
    public static Class52 aClass52_621;
    public byte[] aByteArray622;
    public static int anInt623;
    public static int anInt624;
    public static int anInt625;
    public static int[] anIntArray626 = new int[1000];
    public static int anInt627;
    public static Class124 aClass124_628;
    public static int anInt629;
    public static int anInt630;
    public static int anInt631;
    public static int[] anIntArray632;
    
    public static Class40 method1098(int arg0, int arg1, int arg2) {
	Class14_Sub29 class14_sub29
	    = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[arg0][arg1]
	       [arg2]);
	if (class14_sub29 == null)
	    return null;
	for (int i = 0; i < class14_sub29.anInt3242; i++) {
	    Class40 class40 = class14_sub29.aClass40Array3257[i];
	    if ((class40.aLong677 >> 29 & 0x3L) == 2L
		&& class40.anInt668 == arg1 && class40.anInt678 == arg2) {
		Class63.method1279(class40);
		return class40;
	    }
	}
	return null;
    }
    
    public void method1099(int arg0, byte[] arg1, int arg2, int arg3)
	throws IOException {
    while_715_:
	do {
	while_714_:
	    do {
		do {
		    try {
			anInt625++;
			if (!aBoolean620)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_714_;
		    }
		    return;
		} while (false);
		try {
		    if (arg2 != -1)
			method1106(9);
		    int i;
		    for (/**/; (arg0 ^ 0xffffffff) < -1; arg0 -= i) {
			i = anInputStream617.read(arg1, arg3, arg0);
			if ((i ^ 0xffffffff) >= -1)
			    throw new EOFException();
			arg3 += i;
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_715_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ee.D(" + arg0 + ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ',' + arg3
						+ ')'));
	} while (false);
    }
    
    public void method1100(int arg0, int arg1, int arg2, byte[] arg3)
	throws IOException {
    while_717_:
	do {
	while_716_:
	    do {
		do {
		    try {
			anInt623++;
			if (!aBoolean620)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_716_;
		    }
		    return;
		} while (false);
		try {
		    if (aBoolean616) {
			aBoolean616 = false;
			throw new IOException();
		    }
		    if (null == aByteArray622)
			aByteArray622 = new byte[5000];
		    Class36 class36 = this;
		    synchronized (class36) {
			int i = 0;
			if (arg1 != 3)
			    aClass52_621 = null;
			for (/**/; (i ^ 0xffffffff) > (arg2 ^ 0xffffffff);
			     i++) {
			    aByteArray622[anInt619] = arg3[i + arg0];
			    anInt619 = (anInt619 + 1) % 5000;
			    if (anInt619 == (4900 + anInt613) % 5000)
				throw new IOException();
			}
			if (null == aClass31_606)
			    aClass31_606 = aClass43_611.method1143(3, this, 0);
			this.notifyAll();
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_717_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("ee.J(" + arg0 + ',' + arg1
						+ ',' + arg2 + ','
						+ (arg3 != null ? "{...}"
						   : "null")
						+ ')'));
	} while (false);
    }
    
    public void method1101(byte arg0) {
    while_719_:
	do {
	while_718_:
	    do {
		do {
		    try {
			int i = -28 % ((arg0 - 63) / 47);
			anInt614++;
			if (!aBoolean620)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_718_;
		    }
		    return;
		} while (false);
		try {
		    Class36 class36 = this;
		    synchronized (class36) {
			aBoolean620 = true;
			this.notifyAll();
		    }
		    if (aClass31_606 != null) {
			while (0 == aClass31_606.anInt529)
			    Class14_Sub13.method864(1L, (byte) 64);
			if (1 == aClass31_606.anInt529) {
			    try {
				((Thread) aClass31_606.anObject530).join();
			    } catch (InterruptedException interruptedexception) {
				/* empty */
			    }
			}
		    }
		    aClass31_606 = null;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_719_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "ee.H(" + arg0 + ')');
	} while (false);
    }
    
    public static void method1102(byte arg0) {
	try {
	    aClass124_628 = null;
	    anIntArray626 = null;
	    aClass52_621 = null;
	    anIntArray632 = null;
	    if (arg0 != -40)
		anInt612 = -95;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ee.B(" + arg0 + ')');
	}
    }
    
    public static int method1103(byte arg0, int arg1) {
	int i;
	try {
	    int i_0_ = -116 / ((-81 - arg0) / 45);
	    anInt605++;
	    i = arg1 & 0x7f;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ee.C(" + arg0 + ',' + arg1
						+ ')'));
	}
	return i;
    }
    
    public int method1104(int arg0) throws IOException {
    while_720_:
	do {
	    do {
		int i;
		try {
		    if (arg0 == 24249)
			break;
		    i = -62;
		} catch (RuntimeException runtimeexception) {
		    break while_720_;
		}
		return i;
	    } while (false);
	    do {
		int i;
		try {
		    anInt624++;
		    if (!aBoolean620)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_720_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anInputStream617.available();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ee.I(" + arg0 + ')');
    }
    
    public void run() {
	try {
	    anInt607++;
	    try {
	    while_724_:
		for (;;) {
		    Class36 class36;
		    int i;
		    int i_1_;
		while_723_:
		    do {
			synchronized (this) {
		    while_722_:
			do {
			while_721_:
			    do {
				do {
				    try {
					if (anInt619 != anInt613)
					    break while_721_;
					if (!aBoolean620)
					    break;
				    } catch (Throwable throwable) {
					break while_722_;
				    }
				    break while_724_;
				} while (false);
				try {
				    try {
					this.wait();
				    } catch (InterruptedException interruptedexception) {
					/* empty */
				    }
				} catch (Throwable throwable) {
				    break while_722_;
				}
			    } while (false);
			    if (anInt613 <= anInt619)
				i = -anInt613 + anInt619;
			    else
				i = -anInt613 + 5000;
			    i_1_ = anInt613;
			    break while_723_;
			} while (false);
			RuntimeException object = new RuntimeException();
			throw object;
			}
		    } while (false);
		    if (0 < i) {
			try {
			    anOutputStream604.write(aByteArray622, i_1_, i);
			} catch (IOException ioexception) {
			    aBoolean616 = true;
			}
			anInt613 = (anInt613 - -i) % 5000;
			try {
			    if ((anInt619 ^ 0xffffffff)
				== (anInt613 ^ 0xffffffff))
				anOutputStream604.flush();
			} catch (IOException ioexception) {
			    aBoolean616 = true;
			}
		    }
		}
		try {
		    if (anInputStream617 != null)
			anInputStream617.close();
		    if (anOutputStream604 != null)
			anOutputStream604.close();
		    if (null != aSocket609)
			aSocket609.close();
		} catch (IOException ioexception) {
		    /* empty */
		}
		aByteArray622 = null;
	    } catch (Exception exception) {
		Class14_Sub9_Sub3.method738(null, exception, 95);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception, "ee.run()");
	}
    }
    
    public static boolean method1105(byte arg0, int arg1) {
	boolean bool;
	try {
	    anInt618++;
	    int i = -98 % ((-24 - arg0) / 62);
	    bool = (arg1 >> -1160673387 & 0x1 ^ 0xffffffff) != -1;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ee.G(" + arg0 + ',' + arg1
						+ ')'));
	}
	return bool;
    }
    
    public static void method1106(int arg0) {
	try {
	    anInt608++;
	    if (Class14_Sub8.aFloat2854 > Class90.aFloat1426) {
		Class90.aFloat1426 += (double) Class90.aFloat1426 / 30.0;
		if (Class14_Sub8.aFloat2854 < Class90.aFloat1426)
		    Class90.aFloat1426 = Class14_Sub8.aFloat2854;
		Class39.method1126((byte) -22);
	    } else if (Class14_Sub8.aFloat2854 < Class90.aFloat1426) {
		Class90.aFloat1426 -= (double) Class90.aFloat1426 / 30.0;
		if (Class90.aFloat1426 < Class14_Sub8.aFloat2854)
		    Class90.aFloat1426 = Class14_Sub8.aFloat2854;
		Class39.method1126((byte) -22);
	    }
	    if (arg0 != Class20.anInt427 && -1 != Class14_Sub18.anInt3050) {
		int i = Class20.anInt427 - Class37.anInt644;
		if ((i ^ 0xffffffff) > -3 || -3 > (i ^ 0xffffffff))
		    i >>= 4;
		int i_2_ = Class14_Sub18.anInt3050 + -Class133_Sub6.anInt3659;
		Class37.anInt644 -= -i;
		if (i_2_ < 2 || i_2_ > 2)
		    i_2_ >>= 4;
		if (0 == i && i_2_ == 0) {
		    Class14_Sub18.anInt3050 = -1;
		    Class20.anInt427 = -1;
		}
		Class133_Sub6.anInt3659 -= -i_2_;
		Class39.method1126((byte) -22);
	    }
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ee.A(" + arg0 + ')');
	}
    }
    
    public int method1107(byte arg0) throws IOException {
    while_725_:
	do {
	    do {
		int i;
		try {
		    anInt615++;
		    if (arg0 != 30)
			aBoolean616 = false;
		    if (!aBoolean620)
			break;
		    i = 0;
		} catch (RuntimeException runtimeexception) {
		    break while_725_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		i = anInputStream617.read();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	Throwable throwable = new Throwable();
	throw Class14_Sub8_Sub14.method554(throwable, "ee.F(" + arg0 + ')');
    }
    
    public void finalize() {
	try {
	    anInt627++;
	    method1101((byte) 121);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "ee.finalize()");
	}
    }
    
    public Class36(Socket arg0, Class43 arg1) throws IOException {
	aBoolean616 = false;
	anInt619 = 0;
	try {
	    aClass43_611 = arg1;
	    aSocket609 = arg0;
	    aSocket609.setSoTimeout(30000);
	    aSocket609.setTcpNoDelay(true);
	    anInputStream617 = aSocket609.getInputStream();
	    anOutputStream604 = aSocket609.getOutputStream();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("ee.<init>("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    static {
	aClass52_621 = new Class52(260);
	aClass124_628 = Class14_Sub2_Sub2.method263(1178, " <col=ffff00>");
	anIntArray632 = new int[128];
    }
}
