/* Class133_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class Class133_Sub7 extends Class133
{
    public boolean aBoolean3687 = false;
    
    public abstract void method1855(int i, int i_0_, int i_1_);
    
    public abstract int method1856();
    
    public abstract void method1857(Class14_Sub2_Sub15 class14_sub2_sub15,
				    int i, boolean bool);
    
    public abstract void method1858(int i);
    
    public abstract void method1859(Class14_Sub2_Sub15 class14_sub2_sub15,
				    int i);
    
    public abstract Class133_Sub7 method1860(boolean bool, boolean bool_2_);
    
    public abstract void method1861(int i);
    
    public abstract void method1862(int i, int i_3_, int i_4_, int i_5_,
				    int i_6_, int i_7_, int i_8_);
    
    public void method1863(int[][] arg0, int arg1, int arg2, int arg3,
			   int arg4, int arg5) {
	boolean bool = false;
	boolean bool_9_ = false;
	boolean bool_10_ = false;
	int i = -arg4 / 2;
	int i_11_ = -arg5 / 2;
	int i_12_ = method1864(arg0, arg1 + i, arg3 + i_11_);
	int i_13_ = arg4 / 2;
	int i_14_ = -arg5 / 2;
	int i_15_ = method1864(arg0, arg1 + i_13_, arg3 + i_14_);
	int i_16_ = -arg4 / 2;
	int i_17_ = arg5 / 2;
	int i_18_ = method1864(arg0, arg1 + i_16_, arg3 + i_17_);
	int i_19_ = arg4 / 2;
	int i_20_ = arg5 / 2;
	int i_21_ = method1864(arg0, arg1 + i_19_, arg3 + i_20_);
	int i_22_ = i_12_ < i_15_ ? i_12_ : i_15_;
	int i_23_ = i_18_ < i_21_ ? i_18_ : i_21_;
	int i_24_ = i_15_ < i_21_ ? i_15_ : i_21_;
	int i_25_ = i_12_ < i_18_ ? i_12_ : i_18_;
	if (arg5 != 0) {
	    int i_26_
		= ((int) (Math.atan2((double) (i_22_ - i_23_), (double) arg5)
			  * 325.95)
		   & 0x7ff);
	    if (i_26_ != 0)
		method1861(i_26_);
	}
	if (arg4 != 0) {
	    int i_27_
		= ((int) (Math.atan2((double) (i_25_ - i_24_), (double) arg4)
			  * 325.95)
		   & 0x7ff);
	    if (i_27_ != 0)
		method1858(i_27_);
	}
	int i_28_ = i_12_ + i_21_;
	if (i_15_ + i_18_ < i_28_)
	    i_28_ = i_15_ + i_18_;
	i_28_ = (i_28_ >> 1) - arg2;
	if (i_28_ != 0)
	    method1855(0, i_28_, 0);
    }
    
    public static int method1864(int[][] arg0, int arg1, int arg2) {
	int i = arg1 >> 7;
	int i_29_ = arg2 >> 7;
	if (i < 0 || i_29_ < 0 || i >= arg0.length || i_29_ >= arg0[0].length)
	    return 0;
	int i_30_ = arg1 & 0x7f;
	int i_31_ = arg2 & 0x7f;
	int i_32_
	    = arg0[i][i_29_] * (128 - i_30_) + arg0[i + 1][i_29_] * i_30_ >> 7;
	int i_33_ = ((arg0[i][i_29_ + 1] * (128 - i_30_)
		      + arg0[i + 1][i_29_ + 1] * i_30_)
		     >> 7);
	return i_32_ * (128 - i_31_) + i_33_ * i_31_ >> 7;
    }
    
    public abstract int method1865();
    
    public abstract int method1866();
    
    public abstract int method1867();
    
    public abstract int method1868();
    
    public abstract void method1869(int i, int i_34_, int i_35_);
    
    public abstract int method1781();
    
    public abstract Class133_Sub7 method1870(boolean bool, boolean bool_36_);
    
    public abstract void method1871();
    
    public abstract void method1872();
    
    public abstract void method1873(Class14_Sub2_Sub15 class14_sub2_sub15,
				    int i,
				    Class14_Sub2_Sub15 class14_sub2_sub15_37_,
				    int i_38_, int[] is, boolean bool);
    
    public abstract void method1792(int i, int i_39_, int i_40_, int i_41_,
				    int i_42_, int i_43_, int i_44_, int i_45_,
				    long l);
    
    public abstract void method1874(int i);
    
    public abstract void method1875();
}
