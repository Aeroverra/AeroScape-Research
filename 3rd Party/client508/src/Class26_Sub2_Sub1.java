/* Class26_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26_Sub2_Sub1 extends Class26_Sub2
{
    public byte[] aByteArray4901;
    
    public byte[] method1033(int arg0, int arg1, int arg2) {
	aByteArray4901 = new byte[arg0 * arg1 * arg2 * 2];
	method1020(arg1, arg2, arg0, 0);
	return aByteArray4901;
    }
    
    public Class26_Sub2_Sub1() {
	super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
    
    public void method1031(int arg0, byte arg1) {
	int i = arg0 * 2;
	int i_0_ = arg1 & 0xff;
	aByteArray4901[i++] = (byte) (3 * i_0_ >> 5);
	aByteArray4901[i] = (byte) (i_0_ >> 2);
    }
}
