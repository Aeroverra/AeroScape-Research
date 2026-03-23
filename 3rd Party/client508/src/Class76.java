/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

import java.awt.*;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class Class76 {
    public static int anInt1185;
    public byte[] aByteArray1186;
    public long aLong1187;
    public long aLong1188;
    public static int anInt1189;
    public long aLong1190 = -1L;
    public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array1191;
    public static Class124 aClass124_1192
            = Class14_Sub2_Sub2.method263(1178, "runes");
    public static int anInt1193;
    public static int anInt1194;
    public static int anInt1195;
    public static int anInt1196;
    public static int anInt1197;
    public long aLong1198;
    public static int anInt1199;
    public long aLong1200;
    public static int anInt1201;
    public Class30 aClass30_1202;
    public static Class124 aClass124_1203;
    public static int[] anIntArray1204;
    public long aLong1205 = -1L;
    public static int anInt1206;
    public static int anInt1207 = 2;
    public byte[] aByteArray1208;
    public static int anInt1209;
    public int anInt1210;
    public static Class88[] aClass88Array1211;
    public static int anInt1212;
    public static int anInt1213;
    public int anInt1214 = 0;
    public static int anInt1215;

    public static void method1356(boolean arg0, Component arg1) {
        try {
            anInt1195++;
            if (arg0)
                anIntArray1204 = null;
            arg1.removeMouseListener(Class67.aClass97_1055);
            arg1.removeMouseMotionListener(Class67.aClass97_1055);
            arg1.removeFocusListener(Class67.aClass97_1055);
            Class14_Sub4.anInt2790 = 0;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    ("la.D(" + arg0 + ','
                            + (arg1 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public static int method1357(int arg0) {
        try {
            while_0_:
            do {
                int i_1_;
                do {
                    int i_0_;
                    try {
                        if (arg0 == -21193)
                            break;
                        i_0_ = -102;
                    } catch (RuntimeException runtimeexception) {
                        break while_0_;
                    }
                    return i_0_;
                } while (false);
                try {
                    anInt1189++;
                    i_1_ = 6;
                } catch (RuntimeException runtimeexception) {
                    break;
                }
                return i_1_;
            } while (false);
        } catch (Throwable throwable) {
            throw Class14_Sub8_Sub14.method554(throwable, "la.H(" + arg0 + ')');
        }
        return 0;
    }

    public void method1358(int arg0) throws IOException {
        while_2_:
        do {
            try {
                while_1_:
                do {
                    do {
                        try {
                            if (arg0 == -1473276056)
                                break;
                        } catch (RuntimeException runtimeexception) {
                            break while_1_;
                        }
                        return;
                    } while (false);
                    try {
                        anInt1201++;
                        method1369(-98);
                        aClass30_1202.method1057(25861);
                    } catch (RuntimeException runtimeexception) {
                        break;
                    }
                    break while_2_;
                } while (false);
            } catch (Throwable throwable) {
                throw Class14_Sub8_Sub14.method554(throwable,
                        "la.L(" + arg0 + ')');
            }
        } while (false);
    }

    public static Class133_Sub7 method1359
            (int arg0, int arg1, Class46 arg2, Class133_Sub7 arg3, int arg4,
             int arg5, int arg6, int arg7, int arg8, int arg9, int arg10,
             int arg11, int arg12, boolean arg13) {
        Class133_Sub7 aClass133_Sub7;
        try {
            if (arg0 != -10345)
                method1364(-75);
            long l = ((long) ((arg7 << 1119056696)
                    + ((arg5 << 775837968) + arg12))
                    + (((long) arg4 << 16156896)
                    - -((long) arg8 << -1607228368)));
            anInt1212++;
            Class133_Sub7 class133_sub7
                    = ((Class133_Sub7)
                    Class14_Sub11.aClass52_2946.method1210((byte) 112, l));
            if (null == class133_sub7) {
                int i;
                if ((arg12 ^ 0xffffffff) == -2)
                    i = 9;
                else if ((arg12 ^ 0xffffffff) != -3) {
                    if (-4 != (arg12 ^ 0xffffffff)) {
                        if (4 == arg12)
                            i = 18;
                        else
                            i = 21;
                    } else
                        i = 15;
                } else
                    i = 12;
                int i_0_ = 3;
                Class133_Sub2 class133_sub2
                        = new Class133_Sub2(1 - -(i_0_ * i), -i + 2 * i * i_0_, 0);
                int i_1_ = class133_sub2.method1818(0, 0, 0);
                int[] is = {64, 96, 128};
                int[][] is_2_ = new int[i_0_][i];
                for (int i_3_ = 0; (i_0_ ^ 0xffffffff) < (i_3_ ^ 0xffffffff);
                     i_3_++) {
                    int i_4_ = is[i_3_];
                    int i_5_ = is[i_3_];
                    for (int i_6_ = 0; (i ^ 0xffffffff) < (i_6_ ^ 0xffffffff);
                         i_6_++) {
                        int i_7_ = (i_6_ << 1405084395) / i;
                        int i_8_ = (i_5_ * Class3.anIntArray111[i_7_] + arg10
                                >> 255813040);
                        int i_9_ = (i_4_ * Class3.anIntArray108[i_7_] + arg1
                                >> 1305137168);
                        is_2_[i_3_][i_6_]
                                = class133_sub2.method1818(i_9_, 0, i_8_);
                    }
                }
                for (int i_10_ = 0; (i_10_ ^ 0xffffffff) > (i_0_ ^ 0xffffffff);
                     i_10_++) {
                    int i_11_ = (256 * i_10_ - -128) / i_0_;
                    int i_12_ = -i_11_ + 256;
                    byte i_13_
                            = (byte) (arg7 * i_11_ + i_12_ * arg5 >> -1470100216);
                    short i_14_
                            = (short) (((i_12_ * (0xfc00 & arg4) + i_11_ * (0xfc00
                            & arg8)
                            & 0xfc0000)
                            + (0x38000 & ((arg4 & 0x380) * i_12_
                            + (0x380 & arg8) * i_11_))
                            + ((i_12_ * (0x7f & arg4)
                            + (0x7f & arg8) * i_11_)
                            & 0x7f00))
                            >> 499562728);
                    for (int i_15_ = 0; i > i_15_; i_15_++) {
                        if ((i_10_ ^ 0xffffffff) == -1)
                            class133_sub2.method1820(i_1_,
                                    is_2_[0][(1 + i_15_) % i],
                                    is_2_[0][i_15_], (byte) 1,
                                    i_14_, i_13_);
                        else {
                            class133_sub2.method1820(is_2_[i_10_ - 1][i_15_],
                                    (is_2_[i_10_ + -1]
                                            [(1 + i_15_) % i]),
                                    (is_2_[i_10_]
                                            [(i_15_ + 1) % i]),
                                    (byte) 1, i_14_, i_13_);
                            class133_sub2.method1820(is_2_[-1 + i_10_][i_15_],
                                    (is_2_[i_10_]
                                            [(1 + i_15_) % i]),
                                    is_2_[i_10_][i_15_],
                                    (byte) 1, i_14_, i_13_);
                        }
                    }
                }
                class133_sub7
                        = class133_sub2.method1827(64, 768, -50, -10, -50);
                Class14_Sub11.aClass52_2946.method1205((byte) -93,
                        class133_sub7, l);
            }
            int i = arg12 * 64 + -1;
            int i_16_ = -i;
            int i_17_ = -i;
            int i_18_ = i;
            int i_19_ = i;
            if (arg13) {
                if (1152 < arg9 && arg9 < 1920)
                    i_19_ += 128;
                if (-129 > (arg9 ^ 0xffffffff) && (arg9 ^ 0xffffffff) > -897)
                    i_16_ -= 128;
                if (-641 > (arg9 ^ 0xffffffff) && arg9 < 1408)
                    i_18_ += 128;
                if (arg9 > 1664 || (arg9 ^ 0xffffffff) > -385)
                    i_17_ -= 128;
            }
            int i_20_ = arg3.method1867();
            if (i_16_ > i_20_)
                i_20_ = i_16_;
            int i_21_ = arg3.method1856();
            if (i_19_ < i_21_)
                i_21_ = i_19_;
            int i_22_ = arg3.method1868();
            int i_23_ = arg3.method1865();
            if ((i_22_ ^ 0xffffffff) > (i_17_ ^ 0xffffffff))
                i_22_ = i_17_;
            if (i_23_ > i_18_)
                i_23_ = i_18_;
            Class14_Sub2_Sub15 class14_sub2_sub15 = null;
            if (arg2 != null) {
                arg11 = arg2.anIntArray768[arg11];
                class14_sub2_sub15
                        = Class14_Sub4.method457(3, arg11 >> -23403824);
                arg11 &= 0xffff;
            }
            if (class14_sub2_sub15 != null) {
                class133_sub7
                        = (class133_sub7.method1870
                        (!class14_sub2_sub15.method338((byte) 113, arg11),
                                true));
                class133_sub7.method1869((i_21_ - i_20_) / 2, 128,
                        (i_23_ + -i_22_) / 2);
                class133_sub7.method1855((i_21_ + i_20_) / 2, 0,
                        (i_22_ - -i_23_) / 2);
                class133_sub7.method1859(class14_sub2_sub15, arg11);
            } else {
                class133_sub7 = class133_sub7.method1870(true, true);
                class133_sub7.method1869((i_21_ + -i_20_) / 2, 128,
                        (-i_22_ + i_23_) / 2);
                class133_sub7.method1855((i_20_ - -i_21_) / 2, 0,
                        (i_23_ + i_22_) / 2);
            }
            if (0 != arg9)
                class133_sub7.method1874(arg9);
            Class133_Sub7_Sub2 class133_sub7_sub2
                    = (Class133_Sub7_Sub2) class133_sub7;
            if (arg6 != Class26.method1017(arg1 - -i_20_,
                    Class14_Sub2_Sub3.anInt3785,
                    (byte) 117, arg10 - -i_22_)
                    || arg6 != Class26.method1017(arg1 + i_21_,
                    Class14_Sub2_Sub3.anInt3785,
                    (byte) 77, i_23_ + arg10)) {
                for (int i_24_ = 0; class133_sub7_sub2.anInt5033 > i_24_;
                     i_24_++)
                    class133_sub7_sub2.anIntArray5022[i_24_]
                            += Class26.method1017((class133_sub7_sub2
                            .anIntArray5027[i_24_]) - -arg1,
                            Class14_Sub2_Sub3.anInt3785,
                            (byte) -109,
                            arg10 + (class133_sub7_sub2
                                    .anIntArray5010
                                    [i_24_])) - arg6;
                class133_sub7_sub2.aClass50_5013.aBoolean820 = false;
                class133_sub7_sub2.aClass41_5028.aBoolean682 = false;
            }
            aClass133_Sub7 = class133_sub7;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554
                    (runtimeexception,
                            ("la.K(" + arg0 + ',' + arg1 + ','
                                    + (arg2 != null ? "{...}" : "null") + ','
                                    + (arg3 != null ? "{...}" : "null") + ',' + arg4 + ','
                                    + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ','
                                    + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ','
                                    + arg13 + ')'));
        }
        return aClass133_Sub7;
    }

    public long method1360(byte arg0) {
        long long_0_;
        try {
            if (arg0 >= -27)
                method1359(-30, 41, null, null, -34, -47, -89, -20, 121, 6,
                        -86, 6, -58, false);
            anInt1199++;
            long_0_ = aLong1198;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "la.E(" + arg0 + ')');
        }
        return long_0_;
    }

    public void method1361(int arg0, long arg1) throws IOException {
        try {
            anInt1196++;
            if (arg1 < (long) arg0)
                throw new IOException("Invalid seek to " + arg1 + " in file "
                        + method1367(-1));
            aLong1187 = arg1;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    ("la.F(" + arg0 + ',' + arg1
                            + ')'));
        }
    }

    public void method1362(int arg0, int arg1, byte arg2, byte[] arg3)
            throws IOException {
        while_6_:
        do {
            try {
                while_5_:
                do {
                    while_4_:
                    do {
                        while_3_:
                        do {
                            do {
                                try {
                                    anInt1194++;
                                    try {
                                        if (((long) arg1 + aLong1187
                                                ^ 0xffffffffffffffffL)
                                                < (aLong1198 ^ 0xffffffffffffffffL))
                                            aLong1198 = aLong1187 + (long) arg1;
                                        if (aLong1205 != -1L
                                                && (((aLong1205 ^ 0xffffffffffffffffL)
                                                < (aLong1187
                                                ^ 0xffffffffffffffffL))
                                                || (((long) anInt1214 + aLong1205
                                                ^ 0xffffffffffffffffL)
                                                > (aLong1187
                                                ^ 0xffffffffffffffffL))))
                                            method1369(-41);
                                        if (0L != (aLong1205 ^ 0xffffffffffffffffL)
                                                && (((long) aByteArray1186.length
                                                + aLong1205)
                                                < (long) arg1 + aLong1187)) {
                                            int i
                                                    = (int) (aLong1205 - aLong1187
                                                    + (long) aByteArray1186.length);
                                            Class72.method1322
                                                    (arg3, arg0, aByteArray1186,
                                                            (int) (aLong1187 + -aLong1205),
                                                            i);
                                            arg1 -= i;
                                            arg0 += i;
                                            aLong1187 += (long) i;
                                            anInt1214 = aByteArray1186.length;
                                            method1369(122);
                                        }
                                        if ((arg1 ^ 0xffffffff)
                                                >= (aByteArray1186.length
                                                ^ 0xffffffff))
                                            break;
                                        if (aLong1200 != aLong1187) {
                                            aClass30_1202.method1058(-118,
                                                    aLong1187);
                                            aLong1200 = aLong1187;
                                        }
                                        aClass30_1202.method1056(arg0, arg1, arg3,
                                                -20563);
                                        long l = -1L;
                                        aLong1200 += (long) arg1;
                                        if (aLong1200 > aLong1188)
                                            aLong1188 = aLong1200;
                                        if (aLong1187 >= aLong1190
                                                && (aLong1187
                                                < aLong1190 + (long) anInt1210))
                                            l = aLong1187;
                                        else if (aLong1187 <= aLong1190
                                                && ((aLong1187 - -(long) arg1
                                                ^ 0xffffffffffffffffL)
                                                < (aLong1190
                                                ^ 0xffffffffffffffffL)))
                                            l = aLong1190;
                                        long l_25_ = -1L;
                                        if (((aLong1190 ^ 0xffffffffffffffffL)
                                                <= ((long) arg1 + aLong1187
                                                ^ 0xffffffffffffffffL))
                                                || (aLong1190 - -(long) anInt1210
                                                < aLong1187 - -(long) arg1)) {
                                            if ((aLong1187
                                                    < (long) anInt1210 + aLong1190)
                                                    && (((long) anInt1210 + aLong1190
                                                    ^ 0xffffffffffffffffL)
                                                    >= ((long) arg1 + aLong1187
                                                    ^ 0xffffffffffffffffL)))
                                                l_25_
                                                        = aLong1190 + (long) anInt1210;
                                        } else
                                            l_25_ = (long) arg1 + aLong1187;
                                        if (-1L < l
                                                && ((l ^ 0xffffffffffffffffL)
                                                > (l_25_ ^ 0xffffffffffffffffL))) {
                                            int i = (int) (-l + l_25_);
                                            Class72.method1322
                                                    (arg3,
                                                            (int) (-aLong1187
                                                                    + (l + (long) arg0)),
                                                            aByteArray1208,
                                                            (int) (-aLong1190 + l), i);
                                        }
                                        aLong1187 += (long) arg1;
                                    } catch (IOException ioexception) {
                                        break while_3_;
                                    }
                                } catch (RuntimeException runtimeexception) {
                                    break while_5_;
                                }
                                return;
                            } while (false);
                            do {
                                try {
                                    if ((arg1 ^ 0xffffffff) >= -1)
                                        break;
                                    if (-1L == aLong1205)
                                        aLong1205 = aLong1187;
                                    Class72.method1322(arg3, arg0, aByteArray1186,
                                            (int) (-aLong1205
                                                    + aLong1187),
                                            arg1);
                                    aLong1187 += (long) arg1;
                                    if ((aLong1187 + -aLong1205
                                            ^ 0xffffffffffffffffL)
                                            < ((long) anInt1214 ^ 0xffffffffffffffffL))
                                        anInt1214 = (int) (aLong1187 + -aLong1205);
                                } catch (RuntimeException runtimeexception) {
                                    break while_5_;
                                }
                                return;
                            } while (false);
                            try {
                                break while_4_;
                            } catch (RuntimeException runtimeexception) {
                                break while_5_;
                            }
                        } while (false);
                        RuntimeException runtimeexception = new RuntimeException();
                        aLong1200 = -1L;
                        throw runtimeexception;
                    } while (false);
                    if (arg2 < 40)
                        method1367(57);
                    break while_6_;
                } while (false);
            } catch (Throwable throwable) {
                throw Class14_Sub8_Sub14.method554(throwable,
                        ("la.J(" + arg0 + ',' + arg1
                                + ',' + arg2 + ','
                                + (arg3 != null ? "{...}"
                                : "null")
                                + ')'));
            }
        } while (false);
    }

    public static void method1363(int[][] arg0, int arg1) {
        while_8_:
        do {
            try {
                while_7_:
                do {
                    do {
                        try {
                            if (arg1 == 0)
                                break;
                        } catch (RuntimeException runtimeexception) {
                            break while_7_;
                        }
                        return;
                    } while (false);
                    try {
                        anInt1206++;
                        Class14_Sub2_Sub19.anIntArrayArray4038 = arg0;
                    } catch (RuntimeException runtimeexception) {
                        break;
                    }
                    break while_8_;
                } while (false);
            } catch (Throwable throwable) {
                throw Class14_Sub8_Sub14.method554(throwable,
                        ("la.B("
                                + (arg0 != null ? "{...}"
                                : "null")
                                + ',' + arg1 + ')'));
            }
        } while (false);
    }

    public static void method1364(int arg0) {
        try {
            aClass14_Sub2_Sub19Array1191 = null;
            if (arg0 <= 2)
                method1363(null, 116);
            aClass88Array1211 = null;
            anIntArray1204 = null;
            aClass124_1203 = null;
            aClass124_1192 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "la.C(" + arg0 + ')');
        }
    }

    public void method1365(boolean arg0) throws IOException {
        try {
            anInt1210 = 0;
            if (arg0 != true)
                anInt1214 = 73;
            if (aLong1187 != aLong1200) {
                aClass30_1202.method1058(-94, aLong1187);
                aLong1200 = aLong1187;
            }
            anInt1213++;
            aLong1190 = aLong1187;
            while ((anInt1210 ^ 0xffffffff)
                    > (aByteArray1208.length ^ 0xffffffff)) {
                int i = aByteArray1208.length + -anInt1210;
                if (-200000001 > (i ^ 0xffffffff))
                    i = 200000000;
                int i_26_ = aClass30_1202.method1060(aByteArray1208, 0,
                        anInt1210, i);
                if (-1 == i_26_)
                    break;
                anInt1210 += i_26_;
                aLong1200 += (long) i_26_;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "la.I(" + arg0 + ')');
        }
    }

    public void method1366(byte arg0, byte[] arg1) throws IOException {
        try {
            method1368(false, arg1, 0, arg1.length);
            anInt1185++;
            if (arg0 != -33)
                anInt1210 = -89;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    ("la.G(" + arg0 + ','
                            + (arg1 != null ? "{...}"
                            : "null")
                            + ')'));
        }
    }

    public File method1367(int arg0) {
        try {
            while_9_:
            do {
                File file_1_;
                do {
                    File file_0_;
                    try {
                        anInt1209++;
                        if (arg0 == -1)
                            break;
                        file_0_ = null;
                    } catch (RuntimeException runtimeexception) {
                        break while_9_;
                    }
                    return file_0_;
                } while (false);
                try {
                    file_1_ = aClass30_1202.method1059((byte) 121);
                } catch (RuntimeException runtimeexception) {
                    break;
                }
                return file_1_;
            } while (false);
        } catch (Throwable throwable) {
            throw Class14_Sub8_Sub14.method554(throwable, "la.M(" + arg0 + ')');
        }
        return null;
    }

    public void method1368(boolean arg0, byte arg1[], int arg2, int arg3)
            throws IOException {
        try {
            anInt1215++;
            if (arg0)
                return;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception, "la.N(" + arg0 + ',' + (arg1 == null ? "null" : "{...}") + ',' + arg2 + ',' + arg3 + ')');
        }
        if (arg3 + arg2 > arg1.length)
            throw new ArrayIndexOutOfBoundsException((arg3 + arg2) - arg1.length);
        if (~aLong1205 != 0L && aLong1187 >= aLong1205 && ~((long) anInt1214 + aLong1205) <= ~(aLong1187 - -(long) arg3)) {
            Class72.method1322(aByteArray1186, (int) (-aLong1205 + aLong1187), arg1, arg2, arg3);
            aLong1187 += arg3;
            return;
        }
        try {
            long l = aLong1187;
            int i = arg2;
            int j = arg3;
            if (aLong1187 >= aLong1190 && aLong1190 - -(long) anInt1210 > aLong1187) {
                int k = (int) ((long) anInt1210 + (aLong1190 + -aLong1187));
                if (arg3 < k)
                    k = arg3;
                arg3 -= k;
                Class72.method1322(aByteArray1208, (int) (-aLong1190 + aLong1187), arg1, arg2, k);
                arg2 += k;
                aLong1187 += k;
            }
            if (~arg3 < ~aByteArray1208.length) {
                aClass30_1202.method1058(-78, aLong1187);
                aLong1200 = aLong1187;
                do {
                    if (0 >= arg3)
                        break;
                    int i1 = aClass30_1202.method1060(arg1, 0, arg2, arg3);
                    if (i1 == -1)
                        break;
                    aLong1200 += i1;
                    arg2 += i1;
                    arg3 -= i1;
                    aLong1187 += i1;
                } while (true);
            } else if (arg3 > 0) {
                method1365(true);
                int j1 = arg3;
                if (anInt1210 < j1)
                    j1 = anInt1210;
                arg3 -= j1;
                Class72.method1322(aByteArray1208, 0, arg1, arg2, j1);
                aLong1187 += j1;
                arg2 += j1;
            }
            if (aLong1205 != -1L) {
                if (aLong1187 < aLong1205 && ~arg3 < -1) {
                    int k1 = arg2 + (int) (-aLong1187 + aLong1205);
                    if (k1 > arg3 + arg2)
                        k1 = arg3 + arg2;
                    while (~k1 < ~arg2) {
                        arg3--;
                        arg1[arg2++] = 0;
                        aLong1187++;
                    }
                }
                long l2 = -1L;
                if (~l > ~((long) anInt1214 + aLong1205) && (long) anInt1214 + aLong1205 <= l - -(long) j)
                    l2 = aLong1205 - -(long) anInt1214;
                else if (aLong1205 < l - -(long) j && (long) anInt1214 + aLong1205 >= (long) j + l)
                    l2 = l + (long) j;
                long l1 = -1L;
                if (l <= aLong1205 && ~((long) j + l) < ~aLong1205)
                    l1 = aLong1205;
                else if (~aLong1205 >= ~l && (long) anInt1214 + aLong1205 > l)
                    l1 = l;
                if (-1L < l1 && ~l2 < ~l1) {
                    int i2 = (int) (-l1 + l2);
                    Class72.method1322(aByteArray1186, (int) (-aLong1205 + l1), arg1, (int) (-l + l1) + i, i2);
                    if (~aLong1187 > ~l2) {
                        arg3 = (int) ((long) arg3 - (-aLong1187 + l2));
                        aLong1187 = l2;
                    }
                }
            }
        } catch (IOException ioexception) {
            aLong1200 = -1L;
            throw ioexception;
        }
        if (-1 > ~arg3)
            throw new EOFException();
    }

    public void method1369(int arg0) throws IOException {
        try {
            anInt1193++;
            int i = -15 / ((67 - arg0) / 54);
            if (0L != (aLong1205 ^ 0xffffffffffffffffL)) {
                long l = -1L;
                long l_35_ = -1L;
                if (aLong1205 != aLong1200) {
                    aClass30_1202.method1058(-106, aLong1205);
                    aLong1200 = aLong1205;
                }
                aClass30_1202.method1056(0, anInt1214, aByteArray1186, -20563);
                if ((long) anInt1214 + aLong1205 > aLong1190
                        && (aLong1190 - -(long) anInt1210
                        >= (long) anInt1214 + aLong1205))
                    l = aLong1205 - -(long) anInt1214;
                else if (aLong1205 < aLong1190 - -(long) anInt1210
                        && (aLong1190 + (long) anInt1210
                        <= aLong1205 + (long) anInt1214))
                    l = aLong1190 - -(long) anInt1210;
                aLong1200 += (long) anInt1214;
                if ((aLong1188 ^ 0xffffffffffffffffL)
                        > (aLong1200 ^ 0xffffffffffffffffL))
                    aLong1188 = aLong1200;
                if ((aLong1190 ^ 0xffffffffffffffffL) < (aLong1205
                        ^ 0xffffffffffffffffL)
                        || ((aLong1205 ^ 0xffffffffffffffffL)
                        <= (aLong1190 - -(long) anInt1210
                        ^ 0xffffffffffffffffL))) {
                    if (aLong1205 <= aLong1190
                            && (long) anInt1214 + aLong1205 > aLong1190)
                        l_35_ = aLong1190;
                } else
                    l_35_ = aLong1205;
                if (0L > (l_35_ ^ 0xffffffffffffffffL)
                        && (l ^ 0xffffffffffffffffL) < (l_35_
                        ^ 0xffffffffffffffffL)) {
                    int i_36_ = (int) (l - l_35_);
                    Class72.method1322(aByteArray1186,
                            (int) (l_35_ - aLong1205),
                            aByteArray1208,
                            (int) (-aLong1190 + l_35_), i_36_);
                }
                aLong1205 = -1L;
                anInt1214 = 0;
            }
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "la.A(" + arg0 + ')');
        }
    }

    public Class76(Class30 arg0, int arg1, int arg2) throws IOException {
        try {
            aClass30_1202 = arg0;
            aLong1198 = aLong1188 = arg0.method1061((byte) -68);
            aLong1187 = 0L;
            aByteArray1208 = new byte[arg1];
            aByteArray1186 = new byte[arg2];
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    ("la.<init>("
                            + (arg0 != null ? "{...}"
                            : "null")
                            + ',' + arg1 + ',' + arg2
                            + ')'));
        }
    }

    static {
        anInt1197 = 0;
        aClass124_1203 = Class14_Sub2_Sub2.method263(1178, "Okay");
    }
}