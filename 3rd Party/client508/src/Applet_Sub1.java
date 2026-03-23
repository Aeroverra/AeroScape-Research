/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

public abstract class Applet_Sub1 extends Applet
    implements Runnable, FocusListener, WindowListener
{
    public static int anInt1;
    public static int anInt2;
    public static int anInt3;
    public boolean aBoolean4 = false;
    public static int anInt5;
    public static volatile long aLong6 = 0L;
    public static int anInt7;
    public static int anInt8;
    public static int anInt9;
    public static int anInt10;
    public static int anInt11;
    public static int anInt12;
    public static int anInt13;
    public static int anInt14;
    public static int anInt15;
    public static int anInt16;
    public static int anInt17;
    public static int anInt18;
    public static int anInt19;
    public static boolean[] aBooleanArray20;
    public static int anInt21;
    public static short aShort22 = 32767;
    public static int anInt23;
    public static int anInt24;
    public static int anInt25;
    public static int anInt26;
    public static int anInt27;
    public static int anInt28;
    public static int anInt29;
    public static int anInt30;
    public static int anInt31;
    public static int anInt32;
    public static int anInt33;
    public static int anInt34;
    public static int anInt35;
    public static int anInt36;
    public static int anInt37;
    public static int anInt38;
    public static int anInt39;
    
    public abstract void method25(int i);
    
    public void method26(int arg0) {
	try {
	    anInt9++;
	    if (arg0 <= 113)
		method38(false);
	    long l = (Class14_Sub2_Sub12.aLongArray3914
		      [Class14_Sub8_Sub26.anInt4530]);
	    long l_0_ = Class84.method1413((byte) -76);
	    Class14_Sub2_Sub12.aLongArray3914[Class14_Sub8_Sub26.anInt4530]
		= l_0_;
	    if (-1L != (l ^ 0xffffffffffffffffL)
		&& (l ^ 0xffffffffffffffffL) > (l_0_ ^ 0xffffffffffffffffL)) {
		int i = (int) (l_0_ - l);
		Class14_Sub9_Sub3.anInt4843 = ((i >> 2088120481) + 32000) / i;
	    }
	    Class14_Sub8_Sub26.anInt4530
		= 0x1f & 1 + Class14_Sub8_Sub26.anInt4530;
	    if (50 < Class74.anInt1136++) {
		Class74.anInt1136 -= 50;
		Class141.aBoolean2244 = true;
		Class49.aCanvas819.setSize(Class83.anInt1340,
					   Class14_Sub20.anInt3094);
		Class49.aCanvas819.setVisible(true);
		if (Class14_Sub14.aFrame2986 == null
		    || null != Class14_Sub2_Sub15.aFrame3962)
		    Class49.aCanvas819.setLocation(Class55.anInt895,
						   Class76.anInt1197);
		else {
		    Insets insets = Class14_Sub14.aFrame2986.getInsets();
		    Class49.aCanvas819.setLocation((Class55.anInt895
						    + insets.left),
						   (Class76.anInt1197
						    + insets.top));
		}
	    }
	    method29(1);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pb.AA(" + arg0 + ')');
	}
    }
    
    public void windowDeactivated(WindowEvent arg0) {
	try {
	    anInt33++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowDeactivated("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void focusGained(FocusEvent arg0) {
	try {
	    Class131.aBoolean2154 = true;
	    anInt21++;
	    Class141.aBoolean2244 = true;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.focusGained("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public URL getCodeBase() {
	try {
    while_0_:
	do {
	    do {
		URL url_0_;
		try {
		    anInt19++;
		    if (Class14_Sub14.aFrame2986 == null)
			break;
		    url_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return url_0_;
	    } while (false);
	    do {
		URL url_1_;
		try {
		    if (Class14_Sub8_Sub34.aClass43_4647 == null
			|| (this
			    == Class14_Sub8_Sub34.aClass43_4647.anApplet712))
			break;
		    url_1_ = Class14_Sub8_Sub34.aClass43_4647.anApplet712
			     .getCodeBase();
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return url_1_;
	    } while (false);
		URL url_2_;
	    try {
		url_2_ = super.getCodeBase();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return url_2_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public void update(Graphics arg0) {
	try {
	    anInt34++;
	    paint(arg0);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.update("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static Class21 method27(int arg0, int arg1) {
	try {
    while_1_:
	do {
	    do {
		Class21 class21_0_;
		try {
		    anInt10++;
		    Class21 class21
			= ((Class21)
			   Class14_Sub6.aClass52_2817.method1210((byte) 64,
								 (long) arg0));
		    if (class21 == null)
			break;
		    class21_0_ = class21;
		} catch (RuntimeException runtimeexception) {
		    break while_1_;
		}
		return class21_0_;
	    } while (false);
		Class21 class21_1_;
	    try {
		byte[] is = Class14_Sub5.aClass9_2792.method163(arg0, 3, 0);
		Class21 class21 = new Class21();
		if (null != is)
		    class21.method980(-29502, new Class14_Sub10(is));
		if (arg1 != -4)
		    method30(-23, -113);
		Class14_Sub6.aClass52_2817.method1205((byte) -93, class21,
						      (long) arg0);
		class21_1_ = class21;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class21_1_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   "pb.JA(" + arg0 + ',' + arg1 + ')');
	}
	return null;
    }
    
    public void start() {
    while_3_:
	do {
	try {
	while_2_:
	    do {
		do {
		    try {
			anInt11++;
			if (Class96.anApplet_Sub1_1632 == this
			    && !Class14_Sub2_Sub5.aBoolean3818)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_2_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub36.aLong4704 = 0L;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_3_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable, "pb.start()");
		}
	} while (false);
    }
    
    public void method28(String arg0, int arg1) {
    while_5_:
	do {
	try {
	while_4_:
	    do {
		do {
		    try {
			anInt14++;
			if (!aBoolean4)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_4_;
		    }
		    return;
		} while (false);
		do {
		    try {
			aBoolean4 = true;
			if (arg1 == -1)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_4_;
		    }
		    return;
		} while (false);
		try {
		    System.out.println("error_game_" + arg0);
		    try {
			getAppletContext().showDocument(new URL(getCodeBase(),
								("error_game_"
								 + arg0
								 + ".ws")),
							"_top");
		    } catch (Exception exception) {
			/* empty */
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_5_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("pb.BA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ',' + arg1 + ')'));
	    }
	} while (false);
    }
    
    public String getParameter(String arg0) {
	try {
    while_6_:
	do {
	    do {
		String string_0_;
		try {
		    anInt5++;
		    if (null == Class14_Sub14.aFrame2986)
			break;
		    string_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_6_;
		}
		return string_0_;
	    } while (false);
	    do {
		String string_1_;
		try {
		    if (null == Class14_Sub8_Sub34.aClass43_4647
			|| (this
			    == Class14_Sub8_Sub34.aClass43_4647.anApplet712))
			break;
		    string_1_ = Class14_Sub8_Sub34.aClass43_4647.anApplet712
			     .getParameter(arg0);
		} catch (RuntimeException runtimeexception) {
		    break while_6_;
		}
		return string_1_;
	    } while (false);
		String string_2_;
	    try {
		string_2_ = super.getParameter(arg0);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return string_2_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable,
					   ("pb.getParameter("
					    + (arg0 != null ? "{...}" : "null")
					    + ')'));
	}
	return null;
    }
    
    public abstract void method29(int i);
    
    public void windowIconified(WindowEvent arg0) {
	try {
	    anInt24++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowIconified("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public static void method30(int arg0, int arg1) {
	try {
	    Class65.anInt1025 = 1000 / arg1;
	    int i = 63 % ((73 - arg0) / 37);
	    anInt29++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.IA(" + arg0 + ',' + arg1
						+ ')'));
	}
    }
    
    public static void method31(Class9 arg0, byte arg1, Interface5 arg2,
				Class9 arg3) {
	try {
	    Class14_Sub8_Sub18.aClass9_4384 = arg0;
	    anInt8++;
	    if (arg1 != -4)
		method31(null, (byte) 11, null, null);
	    Class14_Sub2_Sub8.aClass9_3850 = arg3;
	    Canvas_Sub1.anInterface5_48 = arg2;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554
		      (runtimeexception,
		       ("pb.V(" + (arg0 != null ? "{...}" : "null") + ','
			+ arg1 + ',' + (arg2 != null ? "{...}" : "null") + ','
			+ (arg3 != null ? "{...}" : "null") + ')'));
	}
    }
    
    public abstract void init();
    
    public void method32(int arg0, int arg1, int arg2, int arg3, String arg4,
			 int arg5, byte arg6) {
    while_8_:
	do {
	try {
	while_7_:
	    do {
		do {
		    try {
			try {
			    Class76.anInt1197 = 0;
			    Class96.anApplet_Sub1_1632 = this;
			    Class14_Sub2_Sub21.anInt4086
				= Class14_Sub20.anInt3094 = arg2;
			    Class14_Sub8_Sub32.anInt4622
				= Class83.anInt1340 = arg3;
			    Class55.anInt895 = 0;
			    Class14_Sub8_Sub32.anInt4614 = arg1;
			    Class14_Sub14.aFrame2986 = new Frame();
			    Class14_Sub14.aFrame2986.setTitle("Jagex");
			    Class14_Sub14.aFrame2986.setResizable(true);
			    Class14_Sub14.aFrame2986.addWindowListener(this);
			    Class14_Sub14.aFrame2986.setVisible(true);
			    Class14_Sub14.aFrame2986.toFront();
			    Insets insets
				= Class14_Sub14.aFrame2986.getInsets();
			    Class14_Sub14.aFrame2986.setSize
				((Class14_Sub8_Sub32.anInt4622
				  + (insets.left - -insets.right)),
				 (insets.bottom
				  + (insets.top
				     + Class14_Sub2_Sub21.anInt4086)));
			    Class14.aClass43_358
				= Class14_Sub8_Sub34.aClass43_4647
				= new Class43(true, null, arg5, arg4, arg0);
			    Class14_Sub8_Sub34.aClass43_4647
				.method1143(5, this, 0);
			} catch (Exception exception) {
			    Class14_Sub9_Sub3.method738(null, exception, 95);
			}
			if (arg6 > 43)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_7_;
		    }
		    return;
		} while (false);
		try {
		    anInt3++;
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_8_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("pb.W(" + arg0 + ',' + arg1
						+ ',' + arg2 + ',' + arg3 + ','
						+ (arg4 != null ? "{...}"
						   : "null")
						+ ',' + arg5 + ',' + arg6
						+ ')'));
	    }
	} while (false);
    }
    
    public synchronized void paint(Graphics arg0) {
    while_10_:
	do {
	try {
	while_9_:
	    do {
		do {
		    try {
			anInt7++;
			if (Class96.anApplet_Sub1_1632 == this
			    && !Class14_Sub2_Sub5.aBoolean3818)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_9_;
		    }
		    return;
		} while (false);
		try {
		    Class141.aBoolean2244 = true;
		    if (null != Class43.aString723
			&& !Class43.aString723.startsWith("1.5")) {
			/* empty */
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_10_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "pb.paint(" + (arg0 != null
							      ? "{...}"
							      : "null") + ')');
	    }
	} while (false);
    }
    
    public abstract void method33(int i);
    
    public void windowActivated(WindowEvent arg0) {
	try {
	    anInt13++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowActivated("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void stop() {
    while_12_:
	do {
	try {
	while_11_:
	    do {
		do {
		    try {
			anInt26++;
			if (Class96.anApplet_Sub1_1632 == this
			    && !Class14_Sub2_Sub5.aBoolean3818)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_11_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub36.aLong4704
			= 4000L + Class84.method1413((byte) 123);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_12_;
	    } while (false);
	    } catch (Throwable throwable) {
	    throw Class14_Sub8_Sub14.method554(throwable, "pb.stop()");
	    }
	} while (false);
    }
    
    public abstract void method34(boolean bool);
    
    public void windowDeiconified(WindowEvent arg0) {
	try {
	    anInt30++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowDeiconified("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method35(String arg0, String arg1, byte arg2) {
    while_14_:
	do {
	while_13_:
	    do {
		do {
		    try {
			int i = 112 / ((arg2 - -57) / 40);
			anInt23++;
			if (!aBoolean4)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_13_;
		    }
		    return;
		} while (false);
		try {
		    aBoolean4 = true;
		    System.out.println("error_game_" + arg1);
		    try {
			getAppletContext().showDocument(new URL(getCodeBase(),
								("error_game_"
								 + arg1
								 + ".ws?"
								 + arg0)),
							"_top");
		    } catch (Exception exception) {
			/* empty */
		    }
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_14_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       ("pb.EA("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ','
						+ (arg1 != null ? "{...}"
						   : "null")
						+ ',' + arg2 + ')'));
	} while (false);
    }
    
  public void method36(boolean arg0, byte arg1) {
    try {
      anInt2 += 1;
      synchronized (this) {
        if (Class14_Sub2_Sub5.aBoolean3818)
        return;
        Class14_Sub2_Sub5.aBoolean3818 = true;
        if (arg1 >= -3)
        aLong6 = 34L;
      }
      if (null != Class14_Sub8_Sub34.aClass43_4647.anApplet712)
      Class14_Sub8_Sub34.aClass43_4647.anApplet712.destroy();
      try {
        method38(true);
      } catch (Exception exception1) {
      }
      if (Class49.aCanvas819 != null)
      try {
        Class49.aCanvas819.removeFocusListener(this);
        Class49.aCanvas819.getParent().remove(Class49.aCanvas819);
      } catch (Exception exception2) {
      }
      if (Class14_Sub8_Sub34.aClass43_4647 != null)
      try {
        Class14_Sub8_Sub34.aClass43_4647.method1150((byte) 8);
      } catch (Exception exception3) {
      }
      method33(31);
      if (null != Class14_Sub14.aFrame2986)
        try {
          System.exit(0);
        } catch (Throwable throwable) {
        }
      System.out.println("Shutdown complete - clean:" + arg0);
    } catch (RuntimeException runtimeException) {
      throw Class14_Sub8_Sub14.method554(runtimeException, "pb.U(" + arg0 + ',' + arg1 + ')');
    }
  }
    
    public static void providesignlink(Class43 arg0) {
	try {
	    Class14.aClass43_358 = Class14_Sub8_Sub34.aClass43_4647 = arg0;
	    anInt12++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.providesignlink("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void windowClosing(WindowEvent arg0) {
	try {
	    anInt1++;
	    destroy();
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowClosing("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void run() {
    while_20_:
	do {
	while_19_:
	    do {
	    while_18_:
		do {
		while_17_:
		    do {
		    while_16_:
			do {
			    do {
				try {
				    anInt18++;
				    try {
					if (null == Class43.aString721)
					    break while_16_;
					String string
					    = Class43.aString721.toLowerCase();
					if (0 != (string.indexOf("sun")
						  ^ 0xffffffff)
					    || (string.indexOf("apple")
						^ 0xffffffff) != 0)
					    break;
					if (0 == (string.indexOf("ibm")
						  ^ 0xffffffff)
					    || (null != Class43.aString723
						&& !Class43.aString723
							.equals("1.4.2")))
					    break while_16_;
					method28("wrongjava", -1);
				    } catch (Exception exception) {
					break while_17_;
				    }
				} catch (RuntimeException runtimeexception) {
				    break while_19_;
				}
				return;
			    } while (false);
			    do {
				try {
				    String string = Class43.aString723;
				    if (!string.equals("1.1")
					&& !string.startsWith("1.1.")
					&& !string.equals("1.2")
					&& !string.startsWith("1.2."))
					break;
				    method28("wrongjava", -1);
				} catch (Exception exception) {
				    break while_17_;
				}
				return;
			    } while (false);
			    try {
				try {
				    Class59.anInt959 = 5;
				} catch (Exception exception) {
				    break while_17_;
				}
			    } catch (RuntimeException runtimeexception) {
				break while_19_;
			    }
			} while (false);
			if (Class14_Sub8_Sub34.aClass43_4647.anApplet712
			    != null) {
			    Method method = Class43.aMethod702;
			    if (method != null) {
				try {
				    method.invoke((Class14_Sub8_Sub34
						   .aClass43_4647.anApplet712),
						  (new Object[]
						   { Boolean.TRUE }));
				} catch (Throwable throwable) {
				    /* empty */
				}
			    }
			}
			method37(5);
			method25(-1);
			Class48.aClass99_804 = Class125_Sub3.method1736(123);
			while ((Class14_Sub8_Sub36.aLong4704
				^ 0xffffffffffffffffL) == -1L
			       || ((Class14_Sub8_Sub36.aLong4704
				    ^ 0xffffffffffffffffL)
				   < (Class84.method1413((byte) -70)
				      ^ 0xffffffffffffffffL))) {
			    Class102.anInt1702
				= (Class48.aClass99_804.method1501
				   (Class59.anInt959, -1, Class65.anInt1025));
			    for (int i = 0;
				 ((i ^ 0xffffffff)
				  > (Class102.anInt1702 ^ 0xffffffff));
				 i++)
				method42((byte) 113);
			    method26(118);
			    Class14_Sub8_Sub14.method555(41,
							 (Class14_Sub8_Sub34
							  .aClass43_4647),
							 Class49.aCanvas819);
			}
			break while_18_;
		    } while (false);
		    Throwable throwable = new Throwable();
		    Class14_Sub9_Sub3.method738(null, throwable, 95);
		    method28("crash", -1);
		} while (false);
		method36(true, (byte) -100);
		break while_20_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "pb.run()");
	} while (false);
    }
    
    public AppletContext getAppletContext() {
	try {
    while_21_:
	do {
	    do {
		AppletContext appletcontext_0_;
		try {
		    anInt25++;
		    if (null == Class14_Sub14.aFrame2986)
			break;
		    appletcontext_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_21_;
		}
		return appletcontext_0_;
	    } while (false);
	    do {
		AppletContext appletcontext_1_;
		try {
		    if (null == Class14_Sub8_Sub34.aClass43_4647
			|| (this
			    == Class14_Sub8_Sub34.aClass43_4647.anApplet712))
			break;
		    appletcontext_1_ = Class14_Sub8_Sub34.aClass43_4647.anApplet712
			     .getAppletContext();
		} catch (RuntimeException runtimeexception) {
		    break while_21_;
		}
		return appletcontext_1_;
	    } while (false);
		AppletContext appletcontext_2_;
	    try {
		appletcontext_2_ = super.getAppletContext();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return appletcontext_2_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "pb.getAppletContext()");
	}
	return null;
    }
    
    public synchronized void method37(int arg0) {
	try {
	    if (Class49.aCanvas819 != null) {
		Class49.aCanvas819.removeFocusListener(this);
		Class49.aCanvas819.getParent().remove(Class49.aCanvas819);
	    }
	    anInt17++;
	    Container container;
	    if (null == Class14_Sub2_Sub15.aFrame3962) {
		if (Class14_Sub14.aFrame2986 == null)
		    container = Class14_Sub8_Sub34.aClass43_4647.anApplet712;
		else
		    container = Class14_Sub14.aFrame2986;
	    } else
		container = Class14_Sub2_Sub15.aFrame3962;
	    container.setLayout(null);
	    Class49.aCanvas819 = new Canvas_Sub1(this);
	    Class49.aCanvas819.setIgnoreRepaint(true);
	    if (arg0 != 5)
		aBooleanArray20 = null;
	    container.add(Class49.aCanvas819);
	    Class49.aCanvas819.setSize(Class83.anInt1340,
				       Class14_Sub20.anInt3094);
	    Class49.aCanvas819.setVisible(true);
	    if (Class14_Sub14.aFrame2986 == container) {
		Insets insets = Class14_Sub14.aFrame2986.getInsets();
		Class49.aCanvas819.setLocation(Class55.anInt895 + insets.left,
					       insets.top + Class76.anInt1197);
	    } else
		Class49.aCanvas819.setLocation(Class55.anInt895,
					       Class76.anInt1197);
	    Class49.aCanvas819.addFocusListener(this);
	    Class49.aCanvas819.requestFocus();
	    Class131.aBoolean2154 = true;
	    Class83.aBoolean1342 = true;
	    Class141.aBoolean2244 = true;
	    Class54.aBoolean877 = false;
	    Class14_Sub2_Sub18.aLong4029 = Class84.method1413((byte) -51);
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pb.GA(" + arg0 + ')');
	}
    }
    
    public void focusLost(FocusEvent arg0) {
	try {
	    Class131.aBoolean2154 = false;
	    anInt31++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.focusLost("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public abstract void method38(boolean bool);
    
    public void destroy() {
    while_23_:
	do {
	while_22_:
	    do {
		do {
		    try {
			anInt28++;
			if (this == Class96.anApplet_Sub1_1632
			    && !Class14_Sub2_Sub5.aBoolean3818)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_22_;
		    }
		    return;
		} while (false);
		try {
		    Class14_Sub8_Sub36.aLong4704
			= Class84.method1413((byte) 110);
		    Class14_Sub13.method864(5000L, (byte) 64);
		    Class14.aClass43_358 = null;
		    method36(false, (byte) -67);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_23_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable, "pb.destroy()");
	} while (false);
    }
    
    public URL getDocumentBase() {
	try {
    while_24_:
	do {
	    do {
		URL url_0_;
		try {
		    anInt32++;
		    if (Class14_Sub14.aFrame2986 == null)
			break;
		    url_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_24_;
		}
		return url_0_;
	    } while (false);
	    do {
		URL url_1_;
		try {
		    if (Class14_Sub8_Sub34.aClass43_4647 == null
			|| (this
			    == Class14_Sub8_Sub34.aClass43_4647.anApplet712))
			break;
		    url_1_ = Class14_Sub8_Sub34.aClass43_4647.anApplet712
			     .getDocumentBase();
		} catch (RuntimeException runtimeexception) {
		    break while_24_;
		}
		return url_1_;
	    } while (false);
		URL url_2_;
	    try {
		url_2_ = super.getDocumentBase();
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return url_2_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "pb.getDocumentBase()");
	}
	return null;
    }
    
    public static void method39(boolean arg0) {
	try {
	    aBooleanArray20 = null;
	    if (arg0 != true)
		aBooleanArray20 = null;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       "pb.CA(" + arg0 + ')');
	}
    }
    
  public void method40(int arg0, int arg1, int arg2, int arg3, int arg4) {
    try {
      anInt15 += 1;
      try {
        if (Class96.anApplet_Sub1_1632 != null) {
        Class14_Sub8_Sub18.anInt4386 += 1;
        if ((Class14_Sub8_Sub18.anInt4386 ^ 0xFFFFFFFF) <= -4) {
        method28("alreadyloaded", -1);
        return;
	}
        getAppletContext().showDocument(getDocumentBase(), "_self");
        return;
	}
        Class14_Sub8_Sub32.anInt4614 = arg4;
        Class14_Sub2_Sub21.anInt4086 = Class14_Sub20.anInt3094 = arg1;
        if (arg2 != 13062)
          aBooleanArray20 = (boolean[])null;
        Class96.anApplet_Sub1_1632 = this;
        Class76.anInt1197 = 0;
        Class14_Sub8_Sub32.anInt4622 = Class83.anInt1340 = arg3;
        Class55.anInt895 = 0;
        String str = getParameter("openwinjs");
        if ((null == str) || (!(str.equals("1"))))
          Class106.aBoolean1783 = false;
        else
          Class106.aBoolean1783 = true;

        if (Class14_Sub8_Sub34.aClass43_4647 == null)
        Class14.aClass43_358 = Class14_Sub8_Sub34.aClass43_4647 = new Class43(false, this, arg0, null, 0);

        Class14_Sub8_Sub34.aClass43_4647.method1143(5, this, 0);
      }
      catch (Exception localException)
      {
        Class14_Sub9_Sub3.method738(null, localException, 95);
        method28("crash", -1);
      }
    } catch (RuntimeException localRuntimeException) {
      throw Class14_Sub8_Sub14.method554(localRuntimeException, "pb.FA(" + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
    }
  }
  
  public void windowClosed(WindowEvent arg0) {
    try {
      anInt36 += 1;
    } catch (RuntimeException localRuntimeException) {
      throw Class14_Sub8_Sub14.method554(localRuntimeException, "pb.windowClosed(" + ((arg0 != null) ? "{...}" : "null") + ')');
    }
  }
    
    public boolean method41(int arg0) {
	try {
    while_26_:
	do {
	    String string;
	    do {
		boolean bool_0_;
		try {
		    anInt35++;
		    string = getDocumentBase().getHost().toLowerCase();
		    if (string.equals("InevitableIP")
			&& !string.endsWith("InevitableIP"))
			break;
		    bool_0_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return bool_0_;
	    } while (false);
	    do {
		boolean bool_1_;
		try {
		    if (!string.equals("rsjserver.com")
			&& !string.endsWith(".rsjserver.com"))
			break;
		    bool_1_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return bool_1_;
	    } while (false);
	    do {
		boolean bool_2_;
		try {
		    if (!string.endsWith("127.0.0.1"))
			break;
		    bool_2_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return bool_2_;
	    } while (false);
	    do {
		boolean bool_3_;
		try {
		    if (arg0 == 0)
			break;
		    bool_3_ = false;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return bool_3_;
	    } while (false);
	    do {
		boolean bool_4_;
		try {
		    for (/**/;
			 (0 < string.length()
			  && ((string.charAt(string.length() - 1) ^ 0xffffffff)
			      <= -49)
			  && string.charAt(string.length() - 1) <= '9');
			 string = string.substring(0, string.length() + -1)) {
			/* empty */
		    }
		    if (!string.endsWith("192.168.1."))
			break;
		    bool_4_ = true;
		} catch (RuntimeException runtimeexception) {
		    break while_26_;
		}
		return bool_4_;
	    } while (false);
		boolean bool_5_;
	    try {
		method28("invalidhost", arg0 ^ 0xffffffff);
		bool_5_ = false;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return bool_5_;
	} while (false);
	} catch (Throwable throwable) {
	throw Class14_Sub8_Sub14.method554(throwable, "pb.DA(" + arg0 + ')');
	}
	return false;
    }
    
    public void windowOpened(WindowEvent arg0) {
	try {
	    anInt16++;
	} catch (RuntimeException runtimeexception) {
	    throw Class14_Sub8_Sub14.method554(runtimeexception,
					       ("pb.windowOpened("
						+ (arg0 != null ? "{...}"
						   : "null")
						+ ')'));
	}
    }
    
    public void method42(byte arg0) {
    while_28_:
	do {
	while_27_:
	    do {
		long l;
		do {
		    try {
			anInt27++;
			l = Class84.method1413((byte) -37);
			if (arg0 >= 100)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_27_;
		    }
		    return;
		} while (false);
		try {
		    long l_1_ = (Class14_Sub8_Sub9.aLongArray4233
				 [Class14_Sub2_Sub7.anInt3820]);
		    if ((l_1_ ^ 0xffffffffffffffffL) != -1L
			&& ((l ^ 0xffffffffffffffffL)
			    < (l_1_ ^ 0xffffffffffffffffL))) {
			/* empty */
		    }
		    Class14_Sub8_Sub9.aLongArray4233[(Class14_Sub2_Sub7
						      .anInt3820)]
			= l;
		    Class14_Sub2_Sub7.anInt3820
			= 0x1f & Class14_Sub2_Sub7.anInt3820 - -1;
		    Applet_Sub1 applet_sub1 = this;
		    synchronized (applet_sub1) {
			Class83.aBoolean1342 = Class131.aBoolean2154;
		    }
		    method34(true);
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_28_;
	    } while (false);
	    Throwable throwable = new Throwable();
	    throw Class14_Sub8_Sub14.method554(throwable,
					       "pb.HA(" + arg0 + ')');
	} while (false);
    }
    
    static {
	aBooleanArray20
	    = new boolean[] { true, true, true, true, true, true, true, true,
			      true, true, true, true, true, true, true, true,
			      true, true, true, true, true, true, true, true,
			      false };
    }
}