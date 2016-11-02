/*
 * Decompiled with CFR 0_118.
 */
import java.util.Calendar;
import java.util.Date;

public class c
extends z {
    public static a a;
    public static boolean b;
    static int c;
    static cX[] d;
    static int e;
    static int f;
    public int g;
    public int h;
    public int i;
    public static n j;
    public int k = 0;
    public int l = 564096023;
    public boolean m = true;
    public int n = -411774367;
    public int o;
    public int p;
    public int q;

    static void a(int n2, int n3, int n4, int n5, int n6, int n7, aD aD2, df df2) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        if (bH.ae && (ax.i[0][n3][n4] & 2) == 0) {
            if ((ax.i[n2][n3][n4] & 16) != 0) {
                return;
            }
            if (B.a(n2, n3, n4) != bH.aR * 1286856103) {
                return;
            }
        }
        if (n2 < ax.j * 2066106645) {
            ax.j = n2 * -1445478851;
        }
        cI cI2 = cI.a(n5);
        if (n6 != 1 && n6 != 3) {
            n12 = cI2.f * 1832905927;
            n9 = cI2.g * 1221908201;
        } else {
            n12 = cI2.g * 1221908201;
            n9 = cI2.f * 1832905927;
        }
        if (n12 + n3 <= 104) {
            n10 = n3 + (n12 >> 1);
            n8 = (n12 + 1 >> 1) + n3;
        } else {
            n10 = n3;
            n8 = n3 + 1;
        }
        if (n4 + n9 <= 104) {
            n13 = (n9 >> 1) + n4;
            n11 = n4 + (1 + n9 >> 1);
        } else {
            n13 = n4;
            n11 = 1 + n4;
        }
        int[][] arrn = ax.h[n2];
        int n14 = arrn[n8][n11] + arrn[n8][n13] + arrn[n10][n13] + arrn[n10][n11] >> 2;
        int n15 = (n3 << 7) + (n12 << 6);
        int n16 = (n9 << 6) + (n4 << 7);
        int n17 = 1073741824 + (n4 << 7) + n3 + (n5 << 14);
        if (cI2.j * -1087968583 == 0) {
            n17 -= Integer.MIN_VALUE;
        }
        int n18 = n7 + (n6 << 6);
        if (cI2.H * 1493581111 == 1) {
            n18 += 256;
        }
        if (cI2.a(3)) {
            cL.a(n2, n3, n4, cI2, n6, -206976648);
        }
        if (n7 == 22) {
            if (!bH.ae || cI2.j * -1087968583 != 0 || cI2.h * 445231797 == 1 || cI2.F) {
                dh dh2 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(22, n6, arrn, n15, n14, n16, 2053790860) : new w(n5, 22, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh2, n17, n18);
                if (cI2.h * 445231797 == 1 && df2 != null) {
                    df2.b(n3, n4, 268736529);
                }
            }
        } else if (n7 != 10 && n7 != 11) {
            if (n7 >= 12) {
                dh dh3 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(n7, n6, arrn, n15, n14, n16, 917059467) : new w(n5, n7, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, 1, 1, dh3, 0, n17, n18);
                if (n7 >= 12 && n7 <= 17 && n7 != 13 && n2 > 0) {
                    int[] arrn2 = dy.a[n2][n3];
                    int n19 = n4;
                    arrn2[n19] = arrn2[n19] | 2340;
                }
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.a(n3, n4, n12, n9, cI2.i, -811648827);
                }
            } else if (n7 == 0) {
                dh dh4 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(0, n6, arrn, n15, n14, n16, 1995636436) : new w(n5, 0, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh4, null, ax.k[n6], 0, n17, n18);
                if (n6 == 0) {
                    if (cI2.x) {
                        ax.b[n2][n3][n4] = 50;
                        ax.b[n2][n3][1 + n4] = 50;
                    }
                    if (cI2.m) {
                        int[] arrn3 = dy.a[n2][n3];
                        int n20 = n4;
                        arrn3[n20] = arrn3[n20] | 585;
                    }
                } else if (n6 == 1) {
                    if (cI2.x) {
                        ax.b[n2][n3][n4 + 1] = 50;
                        ax.b[n2][n3 + 1][n4 + 1] = 50;
                    }
                    if (cI2.m) {
                        int[] arrn4 = dy.a[n2][n3];
                        int n21 = n4 + 1;
                        arrn4[n21] = arrn4[n21] | 1170;
                    }
                } else if (n6 == 2) {
                    if (cI2.x) {
                        ax.b[n2][n3 + 1][n4] = 50;
                        ax.b[n2][1 + n3][n4 + 1] = 50;
                    }
                    if (cI2.m) {
                        int[] arrn5 = dy.a[n2][n3 + 1];
                        int n22 = n4;
                        arrn5[n22] = arrn5[n22] | 585;
                    }
                } else if (n6 == 3) {
                    if (cI2.x) {
                        ax.b[n2][n3][n4] = 50;
                        ax.b[n2][1 + n3][n4] = 50;
                    }
                    if (cI2.m) {
                        int[] arrn6 = dy.a[n2][n3];
                        int n23 = n4;
                        arrn6[n23] = arrn6[n23] | 1170;
                    }
                }
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.b(n3, n4, n7, n6, cI2.i, -44953324);
                }
                if (cI2.o * 1661784949 != 16) {
                    aD2.a(n2, n3, n4, cI2.o * 1661784949);
                }
            } else if (n7 == 1) {
                dh dh5 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(1, n6, arrn, n15, n14, n16, 2144708541) : new w(n5, 1, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh5, null, ax.l[n6], 0, n17, n18);
                if (cI2.x) {
                    if (n6 == 0) {
                        ax.b[n2][n3][1 + n4] = 50;
                    } else if (n6 == 1) {
                        ax.b[n2][1 + n3][1 + n4] = 50;
                    } else if (n6 == 2) {
                        ax.b[n2][1 + n3][n4] = 50;
                    } else if (n6 == 3) {
                        ax.b[n2][n3][n4] = 50;
                    }
                }
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.b(n3, n4, n7, n6, cI2.i, -998297127);
                }
            } else if (n7 == 2) {
                dh dh6;
                dh dh7;
                int n24 = 1 + n6 & 3;
                if (cI2.n * 181561261 == -1 && cI2.P == null) {
                    dh6 = cI2.a(2, 4 + n6, arrn, n15, n14, n16, 1645110031);
                    dh7 = cI2.a(2, n24, arrn, n15, n14, n16, 1636195738);
                } else {
                    dh6 = new w(n5, 2, 4 + n6, n2, n3, n4, cI2.n * 181561261, true, null);
                    dh7 = new w(n5, 2, n24, n2, n3, n4, cI2.n * 181561261, true, null);
                }
                aD2.a(n2, n3, n4, n14, dh6, dh7, ax.k[n6], ax.k[n24], n17, n18);
                if (cI2.m) {
                    if (n6 == 0) {
                        int[] arrn7 = dy.a[n2][n3];
                        int n25 = n4;
                        arrn7[n25] = arrn7[n25] | 585;
                        int[] arrn8 = dy.a[n2][n3];
                        int n26 = n4 + 1;
                        arrn8[n26] = arrn8[n26] | 1170;
                    } else if (n6 == 1) {
                        int[] arrn9 = dy.a[n2][n3];
                        int n27 = 1 + n4;
                        arrn9[n27] = arrn9[n27] | 1170;
                        int[] arrn10 = dy.a[n2][1 + n3];
                        int n28 = n4;
                        arrn10[n28] = arrn10[n28] | 585;
                    } else if (n6 == 2) {
                        int[] arrn11 = dy.a[n2][1 + n3];
                        int n29 = n4;
                        arrn11[n29] = arrn11[n29] | 585;
                        int[] arrn12 = dy.a[n2][n3];
                        int n30 = n4;
                        arrn12[n30] = arrn12[n30] | 1170;
                    } else if (n6 == 3) {
                        int[] arrn13 = dy.a[n2][n3];
                        int n31 = n4;
                        arrn13[n31] = arrn13[n31] | 1170;
                        int[] arrn14 = dy.a[n2][n3];
                        int n32 = n4;
                        arrn14[n32] = arrn14[n32] | 585;
                    }
                }
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.b(n3, n4, n7, n6, cI2.i, -1896507846);
                }
                if (cI2.o * 1661784949 != 16) {
                    aD2.a(n2, n3, n4, cI2.o * 1661784949);
                }
            } else if (n7 == 3) {
                dh dh8 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(3, n6, arrn, n15, n14, n16, 2036625276) : new w(n5, 3, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh8, null, ax.l[n6], 0, n17, n18);
                if (cI2.x) {
                    if (n6 == 0) {
                        ax.b[n2][n3][n4 + 1] = 50;
                    } else if (n6 == 1) {
                        ax.b[n2][1 + n3][1 + n4] = 50;
                    } else if (n6 == 2) {
                        ax.b[n2][n3 + 1][n4] = 50;
                    } else if (n6 == 3) {
                        ax.b[n2][n3][n4] = 50;
                    }
                }
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.b(n3, n4, n7, n6, cI2.i, -297680746);
                }
            } else if (n7 == 9) {
                dh dh9 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(n7, n6, arrn, n15, n14, n16, 1347450502) : new w(n5, n7, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, 1, 1, dh9, 0, n17, n18);
                if (cI2.h * 445231797 != 0 && df2 != null) {
                    df2.a(n3, n4, n12, n9, cI2.i, 1144191199);
                }
                if (cI2.o * 1661784949 != 16) {
                    aD2.a(n2, n3, n4, cI2.o * 1661784949);
                }
            } else if (n7 == 4) {
                dh dh10 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(4, n6, arrn, n15, n14, n16, 1572777473) : new w(n5, 4, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh10, (dh)null, ax.k[n6], 0, 0, 0, n17, n18);
            } else if (n7 == 5) {
                int n33 = 16;
                int n34 = aD2.r(n2, n3, n4);
                if (n34 != 0) {
                    n33 = cI.a((int)(n34 >> 14 & 32767)).o * 1661784949;
                }
                dh dh11 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(4, n6, arrn, n15, n14, n16, 507368404) : new w(n5, 4, n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh11, (dh)null, ax.k[n6], 0, n33 * ax.m[n6], n33 * ax.n[n6], n17, n18);
            } else if (n7 == 6) {
                int n35 = 8;
                int n36 = aD2.r(n2, n3, n4);
                if (n36 != 0) {
                    n35 = cI.a((int)(n36 >> 14 & 32767)).o * 1661784949 / 2;
                }
                dh dh12 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(4, 4 + n6, arrn, n15, n14, n16, 1588364867) : new w(n5, 4, 4 + n6, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh12, (dh)null, 256, n6, ax.o[n6] * n35, ax.p[n6] * n35, n17, n18);
            } else if (n7 == 7) {
                int n37 = n6 + 2 & 3;
                dh dh13 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(4, n37 + 4, arrn, n15, n14, n16, 2145027723) : new w(n5, 4, n37 + 4, n2, n3, n4, cI2.n * 181561261, true, null);
                aD2.a(n2, n3, n4, n14, dh13, (dh)null, 256, n37, 0, 0, n17, n18);
            } else if (n7 == 8) {
                dh dh14;
                dh dh15;
                int n38 = 8;
                int n39 = aD2.r(n2, n3, n4);
                if (n39 != 0) {
                    n38 = cI.a((int)(n39 >> 14 & 32767)).o * 1661784949 / 2;
                }
                int n40 = n6 + 2 & 3;
                if (cI2.n * 181561261 == -1 && cI2.P == null) {
                    dh14 = cI2.a(4, n6 + 4, arrn, n15, n14, n16, 1130444215);
                    dh15 = cI2.a(4, n40 + 4, arrn, n15, n14, n16, 1190994787);
                } else {
                    dh14 = new w(n5, 4, 4 + n6, n2, n3, n4, cI2.n * 181561261, true, null);
                    dh15 = new w(n5, 4, n40 + 4, n2, n3, n4, cI2.n * 181561261, true, null);
                }
                aD2.a(n2, n3, n4, n14, dh14, dh15, 256, n6, ax.o[n6] * n38, n38 * ax.p[n6], n17, n18);
            }
        } else {
            dh dh16 = cI2.n * 181561261 == -1 && cI2.P == null ? cI2.a(10, n6, arrn, n15, n14, n16, 1468923263) : new w(n5, 10, n6, n2, n3, n4, cI2.n * 181561261, true, null);
            if (dh16 != null && aD2.a(n2, n3, n4, n14, n12, n9, dh16, n7 == 11 ? 256 : 0, n17, n18) && cI2.x) {
                byte by2 = 15;
                if (dh16 instanceof cB && (by2 = ((cB)dh16).d() / 4) > 30) {
                    by2 = 30;
                }
                for (int i2 = 0; i2 <= n12; ++i2) {
                    for (int i3 = 0; i3 <= n9; ++i3) {
                        if (by2 <= ax.b[n2][i2 + n3][n4 + i3]) continue;
                        ax.b[n2][i2 + n3][n4 + i3] = by2;
                    }
                }
            }
            if (cI2.h * 445231797 != 0 && df2 != null) {
                df2.a(n3, n4, n12, n9, cI2.i, -1066605189);
            }
        }
    }

    static final int a(int n2, int n3, int n4, int n5) {
        int n6 = n2 >> 7;
        int n7 = n3 >> 7;
        if (n6 >= 0 && n7 >= 0 && n6 <= 103 && n7 <= 103) {
            int n8 = n4;
            if (n4 < 3 && (ax.i[1][n6][n7] & 2) == 2) {
                n8 = n4 + 1;
            }
            int n9 = n2 & 127;
            int n10 = n3 & 127;
            int n11 = (128 - n9) * ax.h[n8][n6][n7] + n9 * ax.h[n8][n6 + 1][n7] >> 7;
            int n12 = ax.h[n8][n6][n7 + 1] * (128 - n9) + n9 * ax.h[n8][1 + n6][1 + n7] >> 7;
            return n11 * (128 - n10) + n12 * n10 >> 7;
        }
        return 0;
    }

    public void a(cY cY2, int n2, int n3) {
        int n4;
        while ((n4 = cY2.d()) != 0) {
            this.a(cY2, n4, n2, -1841);
        }
        return;
    }

    void a(int n2, byte by2) {
        double d2 = (double)(n2 >> 16 & 255) / 256.0;
        double d3 = (double)(n2 >> 8 & 255) / 256.0;
        double d4 = (double)(n2 & 255) / 256.0;
        double d5 = d2;
        if (d3 < d2) {
            d5 = d3;
        }
        if (d4 < d5) {
            d5 = d4;
        }
        double d6 = d2;
        if (d3 > d2) {
            d6 = d3;
        }
        if (d4 > d6) {
            d6 = d4;
        }
        double d7 = 0.0;
        double d8 = 0.0;
        double d9 = (d5 + d6) / 2.0;
        if (d5 != d6) {
            if (d9 < 0.5) {
                d8 = (d6 - d5) / (d6 + d5);
            }
            if (d9 >= 0.5) {
                d8 = (d6 - d5) / (2.0 - d6 - d5);
            }
            if (d6 == d2) {
                d7 = (d3 - d4) / (d6 - d5);
            } else if (d6 == d3) {
                d7 = (d4 - d2) / (d6 - d5) + 2.0;
            } else if (d6 == d4) {
                d7 = 4.0 + (d2 - d3) / (d6 - d5);
            }
        }
        this.g = (int)(256.0 * (d7 /= 6.0)) * 1149821763;
        this.h = (int)(d8 * 256.0) * -1869113727;
        this.i = (int)(d9 * 256.0) * -1901275357;
        if (this.h * 1145219457 < 0) {
            this.h = 0;
        } else if (this.h * 1145219457 > 255) {
            this.h = 117369471;
        }
        if (this.i * -1337519989 < 0) {
            this.i = 0;
        } else if (this.i * -1337519989 > 255) {
            this.i = 506088413;
        }
    }

    public static String a(long l2) {
        ao.d.setTime(new Date(l2));
        int n2 = ao.d.get(7);
        int n3 = ao.d.get(5);
        int n4 = ao.d.get(2);
        int n5 = ao.d.get(1);
        int n6 = ao.d.get(11);
        int n7 = ao.d.get(12);
        int n8 = ao.d.get(13);
        return ao.c[n2 - 1] + ", " + n3 / 10 + n3 % 10 + "-" + ao.b[0][n4] + "-" + n5 + " " + n6 / 10 + n6 % 10 + ":" + n7 / 10 + n7 % 10 + ":" + n8 / 10 + n8 % 10 + " GMT";
    }

    public void a(int n2) {
        if (this.n * -978801057 != -1) {
            this.a(this.n * -978801057, 100);
            this.o = this.g * 1008037405;
            this.p = this.h * 80170949;
            this.q = this.i * -951588533;
        }
        this.a(this.k * -1819361419, 61);
    }

    void a(cY cY2, int n2, int n3, short s2) {
        if (n2 == 1) {
            this.k = cY2.h() * 504551645;
        } else if (n2 == 2) {
            this.l = cY2.d() * -564096023;
        } else if (n2 == 5) {
            this.m = false;
        } else if (n2 == 7) {
            this.n = cY2.h() * 411774367;
        } else if (n2 == 8) {
            // empty if block
        }
    }

    public static d b(int n2) {
        d d2 = (d)d.m.a(n2);
        if (d2 == null) {
            byte[] arrby = d.c.b(12, n2);
            d2 = new d();
            d2.t = n2;
            if (arrby != null) {
                d2.a(new cY(arrby), -20);
            }
            d2.a(-1874858378);
            d.m.a(d2, n2);
            return d2;
        }
        return d2;
    }

    static final int a(int n2, int n3, int n4) {
        int n5 = n2 / n4;
        int n6 = n2 & n4 - 1;
        int n7 = n3 / n4;
        int n8 = n3 & n4 - 1;
        int n9 = I.a(n5, n7);
        int n10 = I.a(n5 + 1, n7);
        int n11 = I.a(n5, n7 + 1);
        int n12 = I.a(1 + n5, 1 + n7);
        int n13 = ar.a(n9, n10, n6, n4, -1085912552);
        int n14 = ar.a(n11, n12, n6, n4, 1526004661);
        return ar.a(n13, n14, n8, n4, -117542228);
    }

    static {
        j = new n(64);
    }
}

