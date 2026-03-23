/* Class14_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub12_Sub1 extends Class14_Sub12
{
    public int anInt4895;
    public int anInt4896;
    public boolean aBoolean4897;
    public int anInt4898;
    public byte[] aByteArray4899;
    
    public Class14_Sub12_Sub1 method857(Class18 arg0) {
	aByteArray4899 = arg0.method961(true, aByteArray4899);
	anInt4895 = arg0.method964((byte) -56, anInt4895);
	if (anInt4896 == anInt4898)
	    anInt4896 = anInt4898 = arg0.method963(anInt4896, 102);
	else {
	    anInt4896 = arg0.method963(anInt4896, 92);
	    anInt4898 = arg0.method963(anInt4898, 43);
	    if (anInt4896 == anInt4898)
		anInt4896--;
	}
	return this;
    }
    
    public Class14_Sub12_Sub1(int arg0, byte[] arg1, int arg2, int arg3) {
	anInt4895 = arg0;
	aByteArray4899 = arg1;
	anInt4896 = arg2;
	anInt4898 = arg3;
    }
    
    public Class14_Sub12_Sub1(int arg0, byte[] arg1, int arg2, int arg3,
			      boolean arg4) {
	anInt4895 = arg0;
	aByteArray4899 = arg1;
	anInt4896 = arg2;
	anInt4898 = arg3;
	aBoolean4897 = arg4;
    }
}
