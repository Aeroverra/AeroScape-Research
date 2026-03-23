/* Class143 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class143
{
    public Class14_Sub5 aClass14_Sub5_2329;
    public static short[] aShortArray2330;
    public short[] aShortArray2331;
    public boolean aBoolean2332 = false;
    public short[] aShortArray2333;
    public static short[] aShortArray2334;
    public short[] aShortArray2335;
    public int anInt2336;
    public static short[] aShortArray2337 = new short[500];
    public short[] aShortArray2338;
    public static short[] aShortArray2339;
    public short[] aShortArray2340;
    public static short[] aShortArray2341;
    
    public static void method1981() {
	aShortArray2330 = null;
	aShortArray2334 = null;
	aShortArray2339 = null;
	aShortArray2337 = null;
	aShortArray2341 = null;
    }
    
    public Class143(byte[] arg0, Class14_Sub5 arg1) {
	aClass14_Sub5_2329 = null;
	anInt2336 = -1;
	aClass14_Sub5_2329 = arg1;
	Class14_Sub10 class14_sub10 = new Class14_Sub10(arg0);
	Class14_Sub10 class14_sub10_0_ = new Class14_Sub10(arg0);
	class14_sub10.anInt2908 = 2;
	int i = class14_sub10.method798(92);
	int i_1_ = 0;
	int i_2_ = -1;
	int i_3_ = -1;
	class14_sub10_0_.anInt2908 = class14_sub10.anInt2908 + i;
	for (int i_4_ = 0; i_4_ < i; i_4_++) {
	    if (aClass14_Sub5_2329.anIntArray2795[i_4_] == 0)
		i_2_ = i_4_;
	    int i_5_ = class14_sub10.method798(-119);
	    if (i_5_ > 0) {
		if (aClass14_Sub5_2329.anIntArray2795[i_4_] == 0)
		    i_3_ = i_4_;
		aShortArray2330[i_1_] = (short) i_4_;
		short i_6_ = 0;
		if (aClass14_Sub5_2329.anIntArray2795[i_4_] == 3)
		    i_6_ = (short) 128;
		if ((i_5_ & 0x1) != 0)
		    aShortArray2334[i_1_]
			= (short) class14_sub10_0_.method793(-879985848);
		else
		    aShortArray2334[i_1_] = i_6_;
		if ((i_5_ & 0x2) != 0)
		    aShortArray2339[i_1_]
			= (short) class14_sub10_0_.method793(-879985848);
		else
		    aShortArray2339[i_1_] = i_6_;
		if ((i_5_ & 0x4) != 0)
		    aShortArray2337[i_1_]
			= (short) class14_sub10_0_.method793(-879985848);
		else
		    aShortArray2337[i_1_] = i_6_;
		if (aClass14_Sub5_2329.anIntArray2795[i_4_] == 2) {
		    aShortArray2334[i_1_]
			= (short) (((aShortArray2334[i_1_] & 0xff) << 3)
				   + (aShortArray2334[i_1_] >> 8 & 0x7));
		    aShortArray2339[i_1_]
			= (short) (((aShortArray2339[i_1_] & 0xff) << 3)
				   + (aShortArray2339[i_1_] >> 8 & 0x7));
		    aShortArray2337[i_1_]
			= (short) (((aShortArray2337[i_1_] & 0xff) << 3)
				   + (aShortArray2337[i_1_] >> 8 & 0x7));
		}
		aShortArray2341[i_1_] = (short) -1;
		if (aClass14_Sub5_2329.anIntArray2795[i_4_] >= 1
		    && aClass14_Sub5_2329.anIntArray2795[i_4_] <= 3
		    && i_2_ > i_3_) {
		    aShortArray2341[i_1_] = (short) i_2_;
		    i_3_ = i_2_;
		}
		i_1_++;
		if (aClass14_Sub5_2329.anIntArray2795[i_4_] == 5)
		    aBoolean2332 = true;
	    }
	}
	if (class14_sub10_0_.anInt2908 != arg0.length)
	    throw new RuntimeException();
	anInt2336 = i_1_;
	aShortArray2335 = new short[i_1_];
	aShortArray2331 = new short[i_1_];
	aShortArray2340 = new short[i_1_];
	aShortArray2333 = new short[i_1_];
	aShortArray2338 = new short[i_1_];
	for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
	    aShortArray2335[i_7_] = aShortArray2330[i_7_];
	    aShortArray2331[i_7_] = aShortArray2334[i_7_];
	    aShortArray2340[i_7_] = aShortArray2339[i_7_];
	    aShortArray2333[i_7_] = aShortArray2337[i_7_];
	    aShortArray2338[i_7_] = aShortArray2341[i_7_];
	}
    }
    
    static {
	aShortArray2330 = new short[500];
	aShortArray2341 = new short[500];
	aShortArray2339 = new short[500];
	aShortArray2334 = new short[500];
    }
}
