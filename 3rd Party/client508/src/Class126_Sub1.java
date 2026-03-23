/* Class126_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.nio.ByteBuffer;

public class Class126_Sub1 extends Class126
{
    public ByteBuffer aByteBuffer3429;
    
    public void method1740(byte[] arg0, int arg1) {
	aByteBuffer3429 = ByteBuffer.allocateDirect(arg0.length);
	aByteBuffer3429.position(0);
	aByteBuffer3429.put(arg0);
	if (arg1 <= 91)
	    method1740(null, 121);
    }
    
    public byte[] method1745(byte arg0) {
	byte[] is;
	try {
	    byte[] is_0_ = new byte[aByteBuffer3429.capacity()];
	    if (arg0 != -45)
		method1740(null, -47);
	    aByteBuffer3429.position(0);
	    aByteBuffer3429.get(is_0_);
	    is = is_0_;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return is;
    }
}
