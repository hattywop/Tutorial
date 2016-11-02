/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;

public abstract class ba {
    static int a;
    public static bL b;
    static cY c;

    public abstract void a(Component var1, byte var2);

    public abstract void a(Component var1, int var2);

    public static int a(CharSequence charSequence, int n2, byte by2) {
        return cG.a(charSequence, n2, true, 1);
    }

    public abstract int a(byte var1);

    static void a(dC[] arrdC, int n2, int n3, int[] arrn, int[] arrn2, int n4) {
        if (n2 < n3) {
            int n5 = n2 - 1;
            int n6 = n3 + 1;
            int n7 = (n2 + n3) / 2;
            dC dC2 = arrdC[n7];
            arrdC[n7] = arrdC[n2];
            arrdC[n2] = dC2;
            while (n5 < n6) {
                int n8;
                int n9;
                int n10;
                boolean bl2 = true;
                block1 : do {
                    --n6;
                    for (n10 = 0; n10 < 4; ++n10) {
                        if (arrn[n10] == 2) {
                            n8 = arrdC[n6].g * -373679473;
                            n9 = dC2.g * -373679473;
                        } else if (arrn[n10] == 1) {
                            n8 = arrdC[n6].b * 1599434219;
                            n9 = dC2.b * 1599434219;
                            if (n8 == -1 && arrn2[n10] == 1) {
                                n8 = 2001;
                            }
                            if (n9 == -1 && arrn2[n10] == 1) {
                                n9 = 2001;
                            }
                        } else if (arrn[n10] == 3) {
                            n8 = arrdC[n6].a() ? 1 : 0;
                            n9 = dC2.a() ? 1 : 0;
                        } else {
                            n8 = arrdC[n6].c * 1685233739;
                            n9 = dC2.c * 1685233739;
                        }
                        if (n8 != n9) {
                            if (arrn2[n10] == 1 && n8 > n9 || arrn2[n10] == 0 && n8 < n9) continue block1;
                            bl2 = false;
                            continue block1;
                        }
                        if (n10 != 3) continue;
                        bl2 = false;
                    }
                } while (bl2);
                bl2 = true;
                block3 : do {
                    ++n5;
                    for (n10 = 0; n10 < 4; ++n10) {
                        if (arrn[n10] == 2) {
                            n8 = arrdC[n5].g * -373679473;
                            n9 = dC2.g * -373679473;
                        } else if (arrn[n10] == 1) {
                            n8 = arrdC[n5].b * 1599434219;
                            n9 = dC2.b * 1599434219;
                            if (n8 == -1 && arrn2[n10] == 1) {
                                n8 = 2001;
                            }
                            if (n9 == -1 && arrn2[n10] == 1) {
                                n9 = 2001;
                            }
                        } else if (arrn[n10] == 3) {
                            n8 = arrdC[n5].a() ? 1 : 0;
                            n9 = dC2.a() ? 1 : 0;
                        } else {
                            n8 = arrdC[n5].c * 1685233739;
                            n9 = dC2.c * 1685233739;
                        }
                        if (n8 != n9) {
                            if (arrn2[n10] == 1 && n8 < n9 || arrn2[n10] == 0 && n8 > n9) continue block3;
                            bl2 = false;
                            continue block3;
                        }
                        if (n10 != 3) continue;
                        bl2 = false;
                    }
                } while (bl2);
                if (n5 >= n6) continue;
                dC dC3 = arrdC[n5];
                arrdC[n5] = arrdC[n6];
                arrdC[n6] = dC3;
            }
            ba.a(arrdC, n2, n6, arrn, arrn2, -1772996848);
            ba.a(arrdC, n6 + 1, n3, arrn, arrn2, 56772071);
        }
    }

    public static void a(String string, Throwable throwable, byte by2) {
        try {
            String string2 = "";
            if (throwable != null) {
                Loader.a(throwable);
                string2 = m.a(throwable, -386359746);
            }
            if (string != null) {
                if (throwable != null) {
                    string2 = string2 + " | ";
                }
                string2 = string2 + string;
            }
            string2 = string2.replace(':', '.');
            string2 = string2.replace('@', '_');
            string2 = string2.replace('&', '_');
            string2 = string2.replace('#', '_');
            Loader.a(string2);
        }
        catch (Exception var3_4) {
            // empty catch block
        }
    }
}

