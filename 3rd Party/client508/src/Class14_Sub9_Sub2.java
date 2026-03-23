/* Class14_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class14_Sub9_Sub2 extends Class14_Sub9
{
    public Class2 aClass2_4839 = new Class2();
    public Class2 aClass2_4840 = new Class2();
    public int anInt4841 = -1;
    public int anInt4842 = 0;
    
    public Class14_Sub9 method688() {
	return (Class14_Sub9) aClass2_4839.method77(0);
    }
    
    public void method729(Class14 arg0, Class14_Sub26 arg1) {
	for (/**/;
	     (arg0 != aClass2_4840.aClass14_84
	      && ((Class14_Sub26) arg0).anInt3179 <= arg1.anInt3179);
	     arg0 = arg0.aClass14_368) {
	    /* empty */
	}
	Class14_Sub18.method882(-17344, arg0, arg1);
	anInt4841 = (((Class14_Sub26) aClass2_4840.aClass14_84.aClass14_368)
		     .anInt3179);
    }
    
    public synchronized void method730(Class14_Sub9 arg0) {
	arg0.method233(0);
    }
    
    public synchronized void method687(int[] arg0, int arg1, int arg2) {
	do {
	    if (anInt4841 < 0) {
		method732(arg0, arg1, arg2);
		break;
	    }
	    if (anInt4842 + arg2 < anInt4841) {
		anInt4842 += arg2;
		method732(arg0, arg1, arg2);
		break;
	    }
	    int i = anInt4841 - anInt4842;
	    method732(arg0, arg1, i);
	    arg1 += i;
	    arg2 -= i;
	    anInt4842 += i;
	    method733();
	    Class14_Sub26 class14_sub26
		= (Class14_Sub26) aClass2_4840.method77(0);
	    Class14_Sub26 class14_sub26_0_ = class14_sub26;
	    synchronized (class14_sub26_0_) {
		int i_1_ = class14_sub26.method918(this);
		if (i_1_ < 0) {
		    class14_sub26.anInt3179 = 0;
		    method731(class14_sub26);
		} else {
		    class14_sub26.anInt3179 = i_1_;
		    method729(class14_sub26.aClass14_368, class14_sub26);
		}
	    }
	} while (arg2 != 0);
    }
    
    public synchronized void method692(int arg0) {
	do {
	    if (anInt4841 < 0) {
		method734(arg0);
		break;
	    }
	    if (anInt4842 + arg0 < anInt4841) {
		anInt4842 += arg0;
		method734(arg0);
		break;
	    }
	    int i = anInt4841 - anInt4842;
	    method734(i);
	    arg0 -= i;
	    anInt4842 += i;
	    method733();
	    Class14_Sub26 class14_sub26
		= (Class14_Sub26) aClass2_4840.method77(0);
	    Class14_Sub26 class14_sub26_2_ = class14_sub26;
	    synchronized (class14_sub26_2_) {
		int i_3_ = class14_sub26.method918(this);
		if (i_3_ < 0) {
		    class14_sub26.anInt3179 = 0;
		    method731(class14_sub26);
		} else {
		    class14_sub26.anInt3179 = i_3_;
		    method729(class14_sub26.aClass14_368, class14_sub26);
		}
	    }
	} while (arg0 != 0);
    }
    
    public int method690() {
	return 0;
    }
    
    public void method731(Class14_Sub26 arg0) {
	arg0.method233(0);
	arg0.method919();
	Class14 class14 = aClass2_4840.aClass14_84.aClass14_368;
	if (class14 == aClass2_4840.aClass14_84)
	    anInt4841 = -1;
	else
	    anInt4841 = ((Class14_Sub26) class14).anInt3179;
    }
    
    public void method732(int[] arg0, int arg1, int arg2) {
	for (Class14_Sub9 class14_sub9
		 = (Class14_Sub9) aClass2_4839.method77(0);
	     class14_sub9 != null;
	     class14_sub9 = (Class14_Sub9) aClass2_4839.method84(-81))
	    class14_sub9.method689(arg0, arg1, arg2);
    }
    
    public Class14_Sub9 method686() {
	return (Class14_Sub9) aClass2_4839.method84(-78);
    }
    
    public void method733() {
	if (anInt4842 > 0) {
	    for (Class14_Sub26 class14_sub26
		     = (Class14_Sub26) aClass2_4840.method77(0);
		 class14_sub26 != null;
		 class14_sub26 = (Class14_Sub26) aClass2_4840.method84(-122))
		class14_sub26.anInt3179 -= anInt4842;
	    anInt4841 -= anInt4842;
	    anInt4842 = 0;
	}
    }
    
    public void method734(int arg0) {
	for (Class14_Sub9 class14_sub9
		 = (Class14_Sub9) aClass2_4839.method77(0);
	     class14_sub9 != null;
	     class14_sub9 = (Class14_Sub9) aClass2_4839.method84(-127))
	    class14_sub9.method692(arg0);
    }
    
    public synchronized void method735(Class14_Sub9 arg0) {
	aClass2_4839.method87((byte) -107, arg0);
    }
}
