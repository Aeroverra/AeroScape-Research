/* Class26_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class26_Sub1_Sub1 extends Class26_Sub1
{
    public byte[] aByteArray4900;
    
    public byte[] method1029(int arg0, int arg1, int arg2) {
	aByteArray4900 = new byte[arg0 * arg1 * arg2 * 2];
	method1020(arg1, arg2, arg0, 0);
	return aByteArray4900;
    }
    
    public void method1026(int arg0, byte arg1) {
	int i = arg0 * 2;
	arg1 = (byte) (127 + ((arg1 & 0xff) >> 1));
	aByteArray4900[i++] = arg1;
	aByteArray4900[i] = arg1;
    }
    
    public Class26_Sub1_Sub1() {
	super(12, 5, 16, 2, 2, 0.45F);
    }
}
