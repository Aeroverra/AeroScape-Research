import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Display
{
    private GraphicsDevice agraphicsdevice;
    private DisplayMode adisplaymode;

    public int[] getDisPlayModes(byte i) {
	int[] is;
	try {
	    DisplayMode[] displaymodes = agraphicsdevice.getDisplayModes();
	    int[] is_0_ = new int[displaymodes.length << -16239870];
	    if (i != -82)
		adisplaymode = null;
	    for (int i_1_ = 0; i_1_ < displaymodes.length; i_1_++) {
		is_0_[i_1_ << -1545939070] = displaymodes[i_1_].getWidth();
		is_0_[1 + (i_1_ << 1000435362)]
		    = displaymodes[i_1_].getHeight();
		is_0_[(i_1_ << 205177890) - -2]
		    = displaymodes[i_1_].getBitDepth();
		is_0_[3 + (i_1_ << 573975426)]
		    = displaymodes[i_1_].getRefreshRate();
	    }
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return is;
    }
    
    public Display() throws Exception {
    while_1_:
	do {
	try {
	while_0_:
	    do {
		do {
		    int i;
		    GraphicsDevice[] graphicsdevices;
		    try {
			GraphicsEnvironment graphicsenvironment
			    = GraphicsEnvironment
				  .getLocalGraphicsEnvironment();
			agraphicsdevice = graphicsenvironment.getDefaultScreenDevice();
			if (agraphicsdevice.isFullScreenSupported())
			    break;
			GraphicsDevice[] graphicsdevices_2_
			    = graphicsenvironment.getScreenDevices();
			i = 0;
			graphicsdevices = graphicsdevices_2_;
		    } catch (RuntimeException runtimeexception) {
			break while_0_;
		    }
		    while ((graphicsdevices.length ^ 0xffffffff)
			   < (i ^ 0xffffffff)) {
			GraphicsDevice graphicsdevice = graphicsdevices[i];
			if (graphicsdevice != null
			    && graphicsdevice.isFullScreenSupported()) {
			    agraphicsdevice = graphicsdevice;
			    return;
			}
			try {
			    i++;
			} catch (RuntimeException runtimeexception) {
			    break while_0_;
			}
		    }
		    throw new Exception();
		} while (false);
		break while_1_;
	    } while (false);
	    } catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	  }
	} while (false);
    }
    
    public void goFullScreen(byte i, int i_3_, int i_4_, int i_5_, int i_6_,
		  Frame frame) {
    while_3_:
	do {
	try {
	while_2_:
	    do {
		do {
		    try {
			adisplaymode = agraphicsdevice.getDisplayMode();
			if (adisplaymode == null)
			    throw new NullPointerException();
			frame.setUndecorated(true);
			frame.enableInputMethods(false);
			getGraphicsDevice(frame, (byte) -123);
			if (i == 16)
			    break;
		    } catch (RuntimeException runtimeexception) {
			break while_2_;
		    }
		    return;
		} while (false);
		try {
		    if (-1 == (i_4_ ^ 0xffffffff)) {
			int i_7_ = adisplaymode.getRefreshRate();
			DisplayMode[] displaymodes = agraphicsdevice.getDisplayModes();
			boolean bool = false;
			for (int i_8_ = 0; i_8_ < displaymodes.length;
			     i_8_++) {
			    if (displaymodes[i_8_].getWidth() == i_3_
				&& i_5_ == displaymodes[i_8_].getHeight()
				&& displaymodes[i_8_].getBitDepth() == i_6_) {
				int i_9_ = displaymodes[i_8_].getRefreshRate();
				if (!bool || (Math.abs(i_9_ + -i_7_)
					      < Math.abs(i_4_ + -i_7_))) {
				    i_4_ = i_9_;
				    bool = true;
				}
			    }
			}
			if (!bool)
			    i_4_ = i_7_;
		    }
		    agraphicsdevice.setDisplayMode(new DisplayMode(i_3_, i_5_, i_6_, i_4_));
		} catch (RuntimeException runtimeexception) {
		    break;
		}
		break while_3_;
	    } while (false);
	    } catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	  }
	} while (false);
    }
    
    public void setDisplayMode(byte i) {
	try {
	    if (adisplaymode != null) {
		agraphicsdevice.setDisplayMode(adisplaymode);
		if (!agraphicsdevice.getDisplayMode().equals(adisplaymode))
		    throw new RuntimeException
			      ("Did not return to correct resolution!");
		adisplaymode = null;
	    }
	    if (i > -89)
		adisplaymode = null;
	    getGraphicsDevice(null, (byte) -128);
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
    
    private void getGraphicsDevice(Frame frame, byte i) {
	try {
	    boolean bool = false;
	    try {
		Field field = Class.forName("sun.awt.Win32GraphicsDevice")
				  .getDeclaredField("valid");
		field.setAccessible(true);
		boolean bool_10_ = ((Boolean) field.get(agraphicsdevice)).booleanValue();
		if (bool_10_) {
		    field.set(agraphicsdevice, Boolean.FALSE);
		    bool = true;
		}
	    } catch (Throwable throwable) {
		/* empty */
	    }
	    if (i > -113)
		adisplaymode = null;
	    try {
		agraphicsdevice.setFullScreenWindow(frame);
	    } catch (RuntimeException runtimeexception) {
		if (bool) {
		    try {
			Field field
			    = Class.forName("sun.awt.Win32GraphicsDevice")
				  .getDeclaredField("valid");
			field.set(agraphicsdevice, Boolean.TRUE);
		    } catch (Throwable throwable) {
			/* empty */
		    }
		}
		throw runtimeexception;
	    }
	    if (bool) {
		try {
		    Field field = Class.forName
				      ("sun.awt.Win32GraphicsDevice")
				      .getDeclaredField("valid");
		    field.set(agraphicsdevice, Boolean.TRUE);
		} catch (Throwable throwable) {
		    /* empty */
		}
	    }
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
    }
}