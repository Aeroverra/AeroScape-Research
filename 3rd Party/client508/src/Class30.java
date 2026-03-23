/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class30
{
    public long aLong521;
    public long aLong522;
    public File aFile523;
    public RandomAccessFile aRandomAccessFile524;
    
    public void method1056(int arg0, int arg1, byte[] arg2, int arg3)
	throws IOException {
	if ((aLong522 + (long) arg1 ^ 0xffffffffffffffffL)
	    < (aLong521 ^ 0xffffffffffffffffL)) {
	    aRandomAccessFile524.seek(aLong521 - -1L);
	    aRandomAccessFile524.write(1);
	    throw new EOFException();
	}
	aRandomAccessFile524.write(arg2, arg0, arg1);
	if (arg3 == -20563)
	    aLong522 += (long) arg1;
    }
    
    public void method1057(int arg0) throws IOException {
	if (aRandomAccessFile524 != null) {
	    aRandomAccessFile524.close();
	    aRandomAccessFile524 = null;
	}
	if (arg0 != 25861)
	    method1059((byte) -28);
    }
    
    public void method1058(int arg0, long arg1) throws IOException {
	aRandomAccessFile524.seek(arg1);
	aLong522 = arg1;
	if (arg0 >= -66)
	    method1059((byte) 97);
    }
    
    public File method1059(byte arg0) {
	File file;
	try {
	    if (arg0 < 119)
		aRandomAccessFile524 = null;
	    file = aFile523;
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return file;
    }
    
    public void finalize() throws Throwable {
	if (aRandomAccessFile524 != null) {
	    System.out.println
		("Warning! fileondisk " + aFile523
		 + " not closed correctly using close(). Auto-closing instead. ");
	    method1057(25861);
	}
    }
    
    public int method1060(byte[] arg0, int arg1, int arg2, int arg3)
	throws IOException {
    while_659_:
	do {
	    int i;
	    do {
		int i_0_;
		try {
		    i = aRandomAccessFile524.read(arg0, arg2, arg3);
		    if (arg1 == 0)
			break;
		    i_0_ = 41;
		} catch (RuntimeException runtimeexception) {
		    break while_659_;
		}
		return i_0_;
	    } while (false);
	    int i_1_;
	    try {
		if (-1 > (i ^ 0xffffffff))
		    aLong522 += (long) i;
		i_1_ = i;
	    } catch (RuntimeException runtimeexception) {
		break;
	    }
	    return i_1_;
	} while (false);
	RuntimeException object = new RuntimeException();
	throw object;
    }
    
    public Class30(File arg0, String arg1, long arg2) throws IOException {
	if (-1L == arg2)
	    arg2 = 9223372036854775807L;
	if ((arg2 ^ 0xffffffffffffffffL)
	    >= (arg0.length() ^ 0xffffffffffffffffL))
	    arg0.delete();
	aRandomAccessFile524 = new RandomAccessFile(arg0, arg1);
	aLong522 = 0L;
	aLong521 = arg2;
	aFile523 = arg0;
	int i = aRandomAccessFile524.read();
	if (-1 != i && !arg1.equals("r")) {
	    aRandomAccessFile524.seek(0L);
	    aRandomAccessFile524.write(i);
	}
	aRandomAccessFile524.seek(0L);
    }
    
    public long method1061(byte arg0) throws IOException {
	long l;
	try {
	    if (arg0 > -44)
		aRandomAccessFile524 = null;
	    l = aRandomAccessFile524.length();
	} catch (RuntimeException runtimeexception) {
	    throw runtimeexception;
	}
	return l;
    }
}
