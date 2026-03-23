/* Class43 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Vector;

public class Class43 implements Runnable
{
    public Interface4 anInterface4_701;
    public static Method aMethod702;
    public boolean aBoolean703 = false;
    public static String aString704;
    public static String aString705;
    public static String aString706;
    public static Method aMethod707;
    public static int anInt708 = 1;
    public static String aString709;
    public Display aDisplay;
    public Class30[] aClass30Array711;
    public Applet anApplet712 = null;
    public EventQueue anEventQueue713;
    public Class31 aClass31_714;
    public Class31 aClass31_715;
    public Class30 aClass30_716 = null;
    public static String aString717;
    public Thread aThread718;
    public File aFile719;
    public Class30 aClass30_720;
    public static String aString721;
    public Class30 aClass30_722;
    public static String aString723;
    public File aFile724;
    
    public Class31 method1135(Frame arg0, int arg1) {
	try {
    while_0_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg1 == -30170)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_0_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(7, arg0, 0, 0, -127);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1136(int arg0) {
	Class31 class31_0_;
	try {
	    if (arg0 != -12444)
		aString709 = null;
	    class31_0_ = method1138(5, null, 0, 0, -126);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31_0_;
    }
    
    public Class31 method1137(int arg0, byte arg1, int arg2, int arg3,
			      int arg4) {
	try {
    while_1_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg1 >= 101)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_1_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(6, null, arg0 + (arg4 << -1377977616),
				arg3 + (arg2 << -945372080), -126);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1138(int arg0, Object arg1, int arg2, int arg3,
			      int arg4) {
	try {
    while_2_:
	do {
	Class31 class31_1_;
	    Class31 class31;
	    do {
		Class31 class31_0_;
		try {
		    class31 = new Class31();
		    class31.anInt526 = arg2;
		    class31.anObject528 = arg1;
		    class31.anInt527 = arg3;
		    if (arg4 < -125)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_2_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31.anInt525 = arg0;
		Class43 class43 = this;
		synchronized (class43) {
		    if (null != aClass31_714) {
			aClass31_714.aClass31_531 = class31;
			aClass31_714 = class31;
		    } else
			aClass31_714 = aClass31_715 = class31;
		    this.notify();
		}
		class31_1_ = class31;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Interface4 method1139(byte arg0) {
	Interface4 interface_0_;
	try {
	    int i = -75 / ((-51 - arg0) / 49);
	    interface_0_ = anInterface4_701;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return interface_0_;
    }
    
    public Class31 method1140(int arg0, Class arg1, String arg2) {
	Class31 class31;
	try {
	    int i = -27 / ((arg0 - 38) / 55);
	    class31 = method1138(9, new Object[] { arg1, arg2 }, 0, 0, -126);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31;
    }
    
    public Class31 method1141(byte arg0, int arg1) {
	Class31 class31;
	try {
	    if (arg0 != 48)
		method1147((byte) 68, null);
	    class31 = method1138(3, null, arg1, 0, -127);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31;
    }
    
    public Class31 method1142(Class arg0, int arg1) {
	try {
    while_3_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg1 == 10)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_3_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(10, arg0, 0, 0, -128);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1143(int arg0, Runnable arg1, int arg2) {
	try {
    while_4_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg2 == 0)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_4_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(2, arg1, arg0, 0, -126);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public void method1144(int arg0, int arg1, int arg2, String arg3) {
        if (((arg0 ^ 0xffffffff) > -33) && ((arg0 ^ 0xffffffff) < -35))
        arg0 = 32;

        String[] strings = {"./"};
        String[] strings_0_ = {"cache", ".file_store_" + arg0};

        int i = 0;
        if (arg1 > -72)
            return;

        for (; i < 2; ++i) {
            int j = 0;
            for (; (strings_0_.length ^ 0xffffffff) < (j ^ 0xffffffff); ++j) {
                int k = 0;
                for (; k < strings.length; ++k) {
                    try {
                        String str = strings[k];
                        if ((str.length() ^ 0xffffffff) < -1 && !new File(str).exists())
                        continue;
                        
                        File file_0_ = new File(str + strings_0_[j]);
                        if (i == 1 && !file_0_.exists()) {
                            boolean bool1 = file_0_.mkdir();
                            if (!bool1)
                                continue;
                        }
                        if (this.aClass30_716 == null)
                        try {
                            File file_1_ = new File(file_0_, "random.dat");
                            if ((-2 == (i ^ 0xffffffff)) || (file_1_.exists())) {
                                this.aClass30_716 = new Class30(file_1_, "rw", 25L);
                            }
                        } catch (Exception exception2) {
                            this.aClass30_716 = null;
                        }

                        if (null == this.aFile724)
                        try {
                            file_0_ = new File(file_0_, arg3);
                            if (-2 == (i ^ 0xffffffff) && !file_0_.exists()) {
                                boolean bool2 = file_0_.mkdir();
                                if (!(bool2))
                                    continue;
                            }
                            File file_2_ = new File(file_0_, "main_file_cache.dat2");
                            if (0 == i && !file_2_.exists())
                            continue;

                            this.aClass30_720 = new Class30(file_2_, "rw", 104857600L);
                            this.aClass30Array711 = new Class30[arg2];

                            int l = 0;
                            for (; arg2 > l; ++l) {
                                this.aClass30Array711[l] = new Class30(new File(file_0_, "main_file_cache.idx" + l), "rw", 1048576L);
                            }
                            this.aClass30_722 = new Class30(new File(file_0_, "main_file_cache.idx255"), "rw", 1048576L);
                            label644:
                            this.aFile719 = (this.aFile724 = file_0_);
                        } catch (Exception exception) {
                            try {
                                this.aClass30_720.method1057(25861);
                                int i1 = 0;
                                for (; (arg2 ^ 0xffffffff) < (i1 ^ 0xffffffff); ++i1) {
                                    this.aClass30Array711[i1].method1057(25861);
                                }
                                this.aClass30_722.method1057(25861);
                            } catch (Exception exception1) {
                            }
                            this.aClass30_720 = (this.aClass30_722 = null);
                            this.aClass30Array711 = null;
                            this.aFile719 = (this.aFile724 = null);
                        }
                    } catch (Exception exception) {
			/* empty */
                    }
                    if ((null != this.aClass30_716) && (null != this.aFile724)) {
                        return;
                    }
                }
            }
        }
        if (null == this.aFile724) {
            throw new RuntimeException();
        }
    }
    
    public Class31 method1145(Class arg0, byte arg1) {
	Class31 class31;
	try {
	    if (arg1 < 26)
		method1138(21, null, 101, -52, 109);
	    class31 = method1138(13, arg0, 0, 0, -126);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31;
    }
    
    public boolean method1146(byte arg0) {
	boolean bool_0_;
	try {
	    int i = -57 / ((arg0 - 52) / 61);
	    bool_0_ = aDisplay != null;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return bool_0_;
    }
    
    public Class31 method1147(byte arg0, URL arg1) {
	Class31 class31;
	try {
	    if (arg0 > -83)
		method1143(-61, null, 2);
	    class31 = method1138(4, arg1, 0, 0, -127);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31;
    }
    
    public Class30 method1148(int arg0, String arg1) {
	try {
    while_5_:
	do {
	Class30 class30_1_;
	    do {
		Class30 class30_0_;
		try {
		    if (arg0 == 5)
			break;
		    class30_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_5_;
		}
		return class30_0_;
	    } while (false);
	    String[] strings;
	    int i;
	    try {
		strings = new String[] { "c:/tscache/", "/tscache/",
					 aString706, "c:/windows/",
					 "c:/winnt/", "c:/", "/tmp/", "" };
		i = 0;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    for (/**/; (strings.length ^ 0xffffffff) < (i ^ 0xffffffff); i++) {
		String string = strings[i];
		if (-1 <= (string.length() ^ 0xffffffff)
		    || new File(string).exists()) {
		    try {
			Class30 class30
			    = new Class30(new File(string,
						   ("jagex_" + arg1
						    + "_preferences.dat")),
					  "rw", 10000L);
			class30_1_ = class30;
		    } catch (Exception exception) {
			try {
			    Object object;
			    continue;
			} catch (RuntimeException runtimeexception) {
			    break while_5_;
			}
		    }
		    return class30_1_;
		}
	    }
	    return null;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1149(String arg0, Class[] arg1, Class arg2,
			      int arg3) {
	try {
    while_6_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg3 < -100)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_6_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(8, new Object[] { arg2, arg0, arg1 }, 0, 0,
				-128);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public void method1150(byte arg0) {
	Class43 class43 = this;
	synchronized (class43) {
	    if (arg0 <= 3)
		method1146((byte) 103);
	    aBoolean703 = true;
	    this.notifyAll();
	}
	try {
	    aThread718.join();
	} catch (InterruptedException interruptedexception) {
	    /* empty */
	}
	if (null != aClass30_720) {
	    try {
		aClass30_720.method1057(25861);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass30_722 != null) {
	    try {
		aClass30_722.method1057(25861);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
	if (aClass30Array711 != null) {
	    for (int i = 0;
		 (i ^ 0xffffffff) > (aClass30Array711.length ^ 0xffffffff);
		 i++) {
		if (null != aClass30Array711[i]) {
		    try {
			aClass30Array711[i].method1057(25861);
		    } catch (IOException ioexception) {
			/* empty */
		    }
		}
	    }
	}
	if (aClass30_716 != null) {
	    try {
		aClass30_716.method1057(25861);
	    } catch (IOException ioexception) {
		/* empty */
	    }
	}
    }
    
    public Class31 method1151(Class arg0, boolean arg1) {
	try {
    while_7_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (!arg1)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_7_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(11, arg0, 0, 0, -127);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1152(String arg0, int arg1) {
	try {
    while_8_:
	do {
	Class31 class31_1_;
	    do {
		Class31 class31_0_;
		try {
		    if (arg1 == 0)
			break;
		    class31_0_ = null;
		} catch (RuntimeException runtimeexception) {
		    break while_8_;
		}
		return class31_0_;
	    } while (false);
	    try {
		class31_1_ = method1138(12, arg0, 0, 0, -126);
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return class31_1_;
	} while (false);
	} catch (RuntimeException runtimeexception) {
	throw runtimeexception;
	}
	return null;
    }
    
    public Class31 method1153(int arg0, String arg1, int arg2) {
	Class31 class31;
	try {
	    if (arg0 != 0)
		aClass30_716 = null;
	    class31 = method1138(1, arg1, arg2, 0, -126);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return class31;
    }
    
    public void run() {
	try {
    while_11_:
	for (;;) {
	    Class43 class43 = this;
	while_10_:
	    for (;;) {
		do {
		    try {
			if (!aBoolean703)
			    break;
		    } catch (Throwable throwable) {
		    }
		    return;
		} while (false);
		try {
		    Class31 class31 = null;
		while_9_:
		    do {
			try {
			do {
			synchronized(this) {
			    try {
				if (aClass31_715 != null) {
				    class31 = aClass31_715;
				    aClass31_715 = aClass31_715.aClass31_531;
				    if (aClass31_715 == null)
					aClass31_714 = null;
				} else {
				    try {
					this.wait();
				    } catch (InterruptedException interruptedexception) {
					/* empty */
				    }
				    continue while_10_;
				}
			    } catch (Throwable throwable) {
				break;
			    }
			    break while_9_;
			  }
			} while (false);
			} catch (RuntimeException runtimeexception) {
			throw runtimeexception;
			}
		    } while (false);
		    try {
			int i = class31.anInt525;
			if (i == 1)
			    class31.anObject530
				= new Socket((InetAddress.getByName
					      ((String) class31.anObject528)),
					     class31.anInt526);
			else if (2 != i) {
			    if (4 != i) {
				if (8 != i) {
				    if (-10 == (i ^ 0xffffffff)) {
					Object[] objects
					    = (Object[]) class31.anObject528;
					if (((Class) objects[0])
						.getClassLoader()
					    == null)
					    throw new SecurityException();
					class31.anObject530
					    = (((Class) objects[0])
						   .getDeclaredField
					       ((String) objects[1]));
				    } else if (-4 != (i ^ 0xffffffff)) {
					if (-6 != (i ^ 0xffffffff)) {
					    if ((i ^ 0xffffffff) != -7) {
						if (7 == i)
						    aDisplay
							.setDisplayMode((byte) -125);
						else if (-11
							 == (i ^ 0xffffffff)) {
						    Class[] var_classes
							= { (Class.forName
							     ("java.lang.Class")),
							    (Class.forName
							     ("java.lang.String")) };
						    Runtime runtime
							= Runtime.getRuntime();
						    if (!aString705.startsWith
							 ("mac")) {
							Method method
							    = (Class.forName
								   ("java.lang.Runtime")
								   .getDeclaredMethod
							       ("loadLibrary0",
								var_classes));
							method.setAccessible
							    (true);
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								"jawt" }));
							method.setAccessible
							    (false);
						    }
						    Method method
							= (Class.forName
							       ("java.lang.Runtime")
							       .getDeclaredMethod
							   ("load0",
							    var_classes));
						    method.setAccessible(true);
						    if ((aString705.startsWith
							 ("linux"))
							|| (aString705
								.startsWith
							    ("sunos"))) {
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "libgluegen-rt.so")
								     .toString
								 ()) }));
							Class var_class
							    = (((Class)
								(class31
								 .anObject528))
								   .getClassLoader
								   ().loadClass
							       ("com.sun.opengl.impl.x11.DRIHack"));
							var_class.getMethod
							    ("begin",
							     new Class[0])
							    .invoke
							    (null,
							     new Object[0]);
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "libjogl.so").getAbsoluteFile() 
								     .toString
								 ()) }));
							var_class.getMethod
							    ("end",
							     new Class[0])
							    .invoke
							    (null,
							     new Object[0]);
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "libjogl_awt.so").getAbsoluteFile()
								     .toString
								 ()) }));
						    } else if (aString705
								   .startsWith
							       ("mac")) {
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "libjogl.jnilib").getAbsoluteFile()
								     .toString
								 ()) }));
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "libjogl_awt.jnilib").getAbsoluteFile()
								     .toString
								 ()) }));
						    } else {
							if (!aString705
								 .startsWith
							     ("win"))
							    throw new Exception
								      ();
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "jogl.dll").getAbsoluteFile()
								     .toString
								 ()) }));
							method.invoke
							    (runtime,
							     (new Object[]
							      { (class31
								 .anObject528),
								(new File
								     (aFile719,
								      "jogl_awt.dll").getAbsoluteFile()
								     .toString
								 ()) }));
						    }
						    method
							.setAccessible(false);
						} else if (-14
							   == (i
							       ^ 0xffffffff)) {
						    Class[] var_classes
							= { (Class.forName
							     ("java.lang.Class")),
							    (Class.forName
							     ("java.lang.String")) };
						    Runtime runtime
							= Runtime.getRuntime();
						    Method method
							= (Class.forName
							       ("java.lang.Runtime")
							       .getDeclaredMethod
							   ("load0",
							    var_classes));
						    method.setAccessible(true);
						    method.invoke
							(runtime,
							 (new Object[]
							  { (class31
							     .anObject528),
							    new File
								(aFile719,
								 "browsercontrol.dll").getAbsoluteFile()
								.toString() }));
						    method
							.setAccessible(false);
						} else if (11 == i) {
						    Field field
							= (Class.forName
							       ("java.lang.ClassLoader")
							       .getDeclaredField
							   ("nativeLibraries"));
						    field.setAccessible(true);
						    Vector vector
							= ((Vector)
							   (field.get
							    (((Class)
							      (class31
							       .anObject528))
								 .getClassLoader
							     ())));
						    for (int i_11_ = 0;
							 i_11_ < vector.size();
							 i_11_++) {
							Object object
							    = (vector.elementAt
							       (i_11_));
							Method method
							    = (object.getClass
								   ()
								   .getDeclaredMethod
							       ("finalize",
								new Class[0]));
							method.setAccessible
							    (true);
							method.invoke
							    (object,
							     new Object[0]);
							method.setAccessible
							    (false);
						    }
						    field.setAccessible(false);
						} else {
						    if (-13
							!= (i ^ 0xffffffff))
							throw new Exception();
						    String string
							= ((String)
							   (class31
							    .anObject528));
						    Class30 class30
							= method1148(5,
								     string);
						    class31.anObject530
							= class30;
						}
					    } else {
						Frame frame
						    = (new Frame
						       ("Jagex Full Screen"));
						class31.anObject530 = frame;
						frame.setResizable(false);
						aDisplay.goFullScreen((byte) 16,
						     (class31.anInt526
						      >>> -908566256),
						     class31.anInt527 & 0xffff,
						     0xffff & class31.anInt526,
						     (class31.anInt527
						      >> -917489456),
						     frame);
					    }
					} else
					    class31.anObject530
						= aDisplay
						      .getDisPlayModes((byte) -82);
				    } else {
					String string
					    = ((0xff & (class31.anInt526
							>> 1454586232))
					       + "."
					       + ((class31.anInt526 & 0xff6688)
						  >> -918474864)
					       + "."
					       + ((class31.anInt526
						   >> 1092728552)
						  & 0xff)
					       + "."
					       + (class31.anInt526 & 0xff));
					class31.anObject530
					    = InetAddress.getByName(string)
						  .getHostName();
				    }
				} else {
				    Object[] objects
					= (Object[]) class31.anObject528;
				    if (((Class) objects[0]).getClassLoader()
					== null)
					throw new SecurityException();
				    class31.anObject530
					= (((Class) objects[0])
					       .getDeclaredMethod
					   ((String) objects[1],
					    (Class[]) objects[2]));
				}
			    } else
				class31.anObject530
				    = new DataInputStream(((URL)
							   class31.anObject528)
							      .openStream());
			} else {
			    Thread thread
				= new Thread((Runnable) class31.anObject528);
			    thread.setDaemon(true);
			    thread.start();
			    thread.setPriority(class31.anInt526);
			    class31.anObject530 = thread;
			}
			class31.anInt529 = 1;
		    } catch (ThreadDeath threaddeath) {
			throw threaddeath;
		    } catch (Throwable throwable) {
			class31.anInt529 = 2;
		    }
		    break;
		} catch (RuntimeException runtimeexception) {
		    break while_11_;
		}
	    }
	}
	} catch (RuntimeException runtimeexception) {
		throw runtimeexception;
	}
    }
    
    public Class43(boolean arg0, Applet arg1, int arg2, String arg3,
		   int arg4) {
	aClass31_715 = null;
	aClass31_714 = null;
	aFile719 = null;
	aClass30_720 = null;
	aFile724 = null;
	aClass30_722 = null;
	aString721 = "Unknown";
	anApplet712 = arg1;
	aString723 = "1.1";
	try {
	    aString721 = System.getProperty("java.vendor");
	    aString723 = System.getProperty("java.version");
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    aString709 = System.getProperty("os.name");
	} catch (Exception exception) {
	    aString709 = "Unknown";
	}
	aString705 = aString709.toLowerCase();
	try {
	    aString704 = System.getProperty("os.arch").toLowerCase();
	} catch (Exception exception) {
	    aString704 = "";
	}
	try {
	    aString717 = System.getProperty("os.version").toLowerCase();
	} catch (Exception exception) {
	    aString717 = "";
	}
	try {
	    aString706 = System.getProperty("user.home");
	    if (aString706 != null)
		aString706 += "/";
	} catch (Exception exception) {
	    /* empty */
	}
	if (null == aString706)
	    aString706 = "~/";
	try {
	    anEventQueue713
		= Toolkit.getDefaultToolkit().getSystemEventQueue();
	} catch (Throwable throwable) {
	    /* empty */
	}
	try {
	    if (null == arg1)
		aMethod707
		    = (Class.forName("java.awt.Component").getDeclaredMethod
		       ("setFocusTraversalKeysEnabled",
			new Class[] { Boolean.TYPE }));
	    else
		aMethod707
		    = arg1.getClass().getMethod("setFocusTraversalKeysEnabled",
						new Class[] { Boolean.TYPE });
	} catch (Exception exception) {
	    /* empty */
	}
	try {
	    if (null != arg1)
		aMethod702
		    = arg1.getClass().getMethod("setFocusCycleRoot",
						new Class[] { Boolean.TYPE });
	    else
		aMethod702
		    = (Class.forName("java.awt.Container").getDeclaredMethod
		       ("setFocusCycleRoot", new Class[] { Boolean.TYPE }));
	} catch (Exception exception) {
	    /* empty */
	}
	if (arg0) {
	    method1144(arg2, -101, arg4, arg3);
	    try {
		aDisplay = new Display();
	    } catch (Throwable throwable) {
		/* empty */
	    }
	}
	if (arg0) {
	    ThreadGroup threadgroup = Thread.currentThread().getThreadGroup();
	    ThreadGroup threadgroup_12_ = threadgroup.getParent();
	    Thread[] threads = new Thread[1000];
	    for (/**/; null != threadgroup_12_;
		 threadgroup_12_ = threadgroup.getParent())
		threadgroup = threadgroup_12_;
	    threadgroup.enumerate(threads);
	    for (int i = 0; threads.length > i; i++) {
		if (null != threads[i]
		    && threads[i].getName().startsWith("AWT"))
		    threads[i].setPriority(1);
	    }
	}
	aBoolean703 = false;
	aThread718 = new Thread(this);
	aThread718.setPriority(10);
	aThread718.setDaemon(true);
	aThread718.start();
    }
}