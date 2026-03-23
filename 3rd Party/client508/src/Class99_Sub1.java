/* Class99_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class99_Sub1 extends Class99
{
    public long aLong3333 = System.nanoTime();
    
    public void method1504(byte arg0) {
	if (arg0 <= -54)
	    aLong3333 = System.nanoTime();
    }
    
    public int method1501(int arg0, int arg1, int arg2) {
    while_1013_:
	do {
	    long l;
	    do {
		int i;
		try {
		    l = aLong3333 - System.nanoTime();
		    if (arg1 == -1)
			break;
		    i = 98;
		} catch (RuntimeException runtimeexception) {
		    break while_1013_;
		}
		return i;
	    } while (false);
	    int i;
	    try {
		long l_0_ = (long) arg0 * 1000000L;
		if (l_0_ > l)
		    l = l_0_;
		Class14_Sub13.method864(l / 1000000L, (byte) 64);
		long l_1_ = System.nanoTime();
		int i_2_;
		for (i_2_ = 0;
		     (-11 < (i_2_ ^ 0xffffffff)
		      && (i_2_ < 1 || aLong3333 < l_1_));
		     aLong3333 += 1000000L * (long) arg2)
		    i_2_++;
		if (aLong3333 < l_1_)
		    aLong3333 = l_1_;
		i = i_2_;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i;
	} while (false);
	RuntimeException object = new RuntimeException();
	throw object;
    }
}
