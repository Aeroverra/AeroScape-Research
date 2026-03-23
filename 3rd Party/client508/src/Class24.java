/* Class24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class Class24 implements Runnable {
    public static int anInt465 = 0;
    public static int anInt466;
    public static int[] anIntArray467 = new int[32];
    public static int[] anIntArray468;
    public static int anInt469;
    public static Class124 aClass124_470
            = Class14_Sub2_Sub2.method263(1178, "mapfunction");
    public static short[] aShortArray471;
    public static int anInt472;
    public static int anInt473;
    public static Class124 aClass124_474;

    public void run() {
        try {
            anInt472 += 1;
            try {
                for (;;) {
                    Class14_Sub19 class14_sub19;
                    synchronized (Class14_Sub8_Sub19.aClass2_4404) {
                        class14_sub19 = (Class14_Sub19) Class14_Sub8_Sub19.aClass2_4404.method77(0);
                    }
                    if (null != class14_sub19) {
                        if ((class14_sub19.anInt3067 ^ 0xFFFFFFFF) != -1) {
                            if (class14_sub19.anInt3067 == 1) {
                                class14_sub19.aByteArray3069 = class14_sub19.aClass114_3077.method1582(124, (int) class14_sub19.aLong355);
                                synchronized (Class14_Sub8_Sub19.aClass2_4404) {
                                    Class2.aClass2_99.method80(class14_sub19, (byte) -121);
                                }
                            }
                        } else {
                            class14_sub19.aClass114_3077.method1583((int) class14_sub19.aLong355, class14_sub19.aByteArray3069, -1, class14_sub19.aByteArray3069.length);
                            synchronized (Class14_Sub8_Sub19.aClass2_4404) {
                                class14_sub19.method233(0);
                            }

                        }
                        synchronized (Class14_Sub8_Sub20.anObject4417) {
                            if (Class138.anInt2223 <= 1) {
                                Class138.anInt2223 = 0;
                                Class14_Sub8_Sub20.anObject4417.notifyAll();
                                return;
                            }
                            label181:
                            label239:
                            Class138.anInt2223 = 600;
                        }
                    } else {
                        Class14_Sub13.method864(100L, (byte) 64);
                        synchronized (Class14_Sub8_Sub20.anObject4417) {
                            if (Class138.anInt2223 <= 1) {
                                Class138.anInt2223 = 0;
                                Class14_Sub8_Sub20.anObject4417.notifyAll();
                                return;
                            }
                            Class138.anInt2223 -= 1;
                        }
                    }
                }
            } catch (Exception localException) {
                Class14_Sub9_Sub3.method738(null, localException, 95);
            }
        } catch (RuntimeException localRuntimeException) {
            throw Class14_Sub8_Sub14.method554(localRuntimeException, "ck.run()");
        }
    }

    public static void method991(byte arg0) {
        try {
            Class148.aClass52_2370.method1209((byte) -96);
            anInt469++;
            if (arg0 != -2)
                aClass124_474 = null;
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "ck.A(" + arg0 + ')');
        }
    }

    public static void method992(byte arg0) {
        try {
            aShortArray471 = null;
            anIntArray467 = null;
            anIntArray468 = null;
            aClass124_474 = null;
            aClass124_470 = null;
            if (arg0 != 64)
                method991((byte) 83);
        } catch (RuntimeException runtimeexception) {
            throw Class14_Sub8_Sub14.method554(runtimeexception,
                    "ck.C(" + arg0 + ')');
        }
    }

    public static int method993(boolean arg0, int arg1, int arg2, int arg3) {
        boolean bool;
        try {
            while_1_:
            do {
                int i_3_;
                Class14_Sub25 class14_sub25;
                do {
                    int i_0_ = 0;
                    try {
                        class14_sub25
                                = ((Class14_Sub25)
                                Class132.aClass55_2167.method1230((long) arg3,
                                        (byte) -128));
                        anInt473++;
                        if (null != class14_sub25)
                            break;
                        bool = false;
                    } catch (RuntimeException runtimeexception) {
                        break while_1_;
                    }
                    return i_0_;
                } while (false);
                int i;
                int i_2_;
                do {
                    int i_1_;
                    try {
                        i = 0;
                        i_2_ = 0;
                        if (arg1 == -28006)
                            break;
                        i_1_ = 16;
                    } catch (RuntimeException runtimeexception) {
                        break while_1_;
                    }
                    return i_1_;
                } while (false);
                try {
                    for (/**/;
                             ((i_2_ ^ 0xffffffff)
                                     > (class14_sub25.anIntArray3178.length ^ 0xffffffff));
                             i_2_++) {
                        if (-1 >= (class14_sub25.anIntArray3178[i_2_] ^ 0xffffffff)
                                && ((Class108.anInt1816 ^ 0xffffffff)
                                < (class14_sub25.anIntArray3178[i_2_]
                                ^ 0xffffffff))) {
                            Class142 class142
                                    = Class14_Sub8_Sub24.method605(96, (class14_sub25
                                    .anIntArray3178
                                    [i_2_]));
                            if (class142.aClass55_2260 != null) {
                                Class14_Sub1 class14_sub1
                                        = ((Class14_Sub1)
                                        class142.aClass55_2260
                                                .method1230((long) arg2, (byte) 81));
                                if (class14_sub1 != null) {
                                    if (!arg0)
                                        i += class14_sub1.anInt2714;
                                    else
                                        i += (class14_sub25.anIntArray3177[i_2_]
                                                * class14_sub1.anInt2714);
                                }
                            }
                        }
                    }
                    i_3_ = i;
                } catch (RuntimeException runtimeexception) {
                    break;
                }
                return i_3_;
            } while (false);
        } catch (Throwable throwable) {
            throw Class14_Sub8_Sub14.method554(throwable,
                    ("ck.B(" + arg0 + ',' + arg1 + ','
                            + arg2 + ',' + arg3 + ')'));
        }
        return 0;
    }

    static {
        anIntArray468 = new int[4096];
        for (int i = 0; i < 4096; i++)
            anIntArray468[i] = Class52.method1207((byte) -124, i);
        aClass124_474 = Class14_Sub2_Sub2.method263(1178, "rect_debug=");
    }
}