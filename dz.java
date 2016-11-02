/*
 * Decompiled with CFR 0_118.
 */
import java.applet.Applet;

public class dz
extends z {
    static cO a;
    static int b;
    static a c;
    int d = 0;
    public int e;
    public int f;
    public int g;
    public int h;
    public static n i;

    void a(int n2) {
        this.a(this.d * -777226959, -311347148);
    }

    static void a(String string, String string2, String string3) {
        cQ.v = string;
        cQ.w = string2;
        cQ.x = string3;
    }

    void a(cY cY2, int n2, int n3, int n4) {
        if (n2 == 1) {
            this.d = cY2.h() * 1206961105;
        }
    }

    void a(int n2, int n3) {
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
            } else if (d3 == d6) {
                d7 = (d4 - d2) / (d6 - d5) + 2.0;
            } else if (d4 == d6) {
                d7 = (d2 - d3) / (d6 - d5) + 4.0;
            }
        }
        d7 /= 6.0;
        this.e = (int)(d8 * 256.0) * -1484271685;
        this.f = (int)(d9 * 256.0) * 1459226941;
        if (this.e * 625515891 < 0) {
            this.e = 0;
        } else if (this.e * 625515891 > 255) {
            this.e = -532157627;
        }
        if (this.f * 983176725 < 0) {
            this.f = 0;
        } else if (this.f * 983176725 > 255) {
            this.f = -1559284797;
        }
        this.g = d9 > 0.5 ? (int)(512.0 * d8 * (1.0 - d9)) * 1293709677 : (int)(d9 * d8 * 512.0) * 1293709677;
        if (this.g * 496779365 < 1) {
            this.g = 1293709677;
        }
        this.h = (int)((double)(this.g * 496779365) * d7) * 266618867;
    }

    void a(cY cY2, int n2, int n3) {
        int n4;
        while ((n4 = cY2.d()) != 0) {
            this.a(cY2, n4, n2, 1991220509);
        }
        return;
    }

    public static void a(Applet applet, String string) {
        aY.a = applet;
        aY.b = string;
    }

    static final void a(ce ce2, boolean bl2, int n2) {
        int n3 = ce2.a * -1385416029;
        int n4 = (int)ce2.am;
        ce2.m();
        if (bl2) {
            br.a(n3);
        }
        cF cF2 = (bX)bH.dI.a();
        while (cF2 != null) {
            if ((long)n3 == (cF2.am >> 48 & 65535)) {
                cF2.m();
            }
            cF2 = (bX)bH.dI.b();
        }
        cF2 = aK.a(n4);
        if (cF2 != null) {
            bw.a((cZ)cF2);
        }
        bQ.a(13);
        if (bH.cR * 1787246131 != -1) {
            aJ.a(bH.cR * 1787246131, 1);
        }
    }

    public static int a(int n2, int n3, byte by2) {
        int n4 = n2 >>> 31;
        return (n4 + n2) / n3 - n4;
    }

    static final void a(byte[] arrby, int n2, int n3, int n4, int n5, int n6, int n7, int n8, aD aD2, df[] arrdf, int n9) {
        cY cY2 = new cY(arrby);
        int n10 = -1;
        int n11;
        block0 : while ((n11 = cY2.q()) != 0) {
            n10 += n11;
            int n12 = 0;
            do {
                int n13;
                int n14;
                int n15;
                if ((n13 = cY2.q()) == 0) continue block0;
                int n16 = (n12 += n13 - 1) & 63;
                int n17 = n12 >> 6 & 63;
                int n18 = n12 >> 12;
                int n19 = cY2.d();
                int n20 = n19 >> 2;
                int n21 = n19 & 3;
                if (n5 != n18 || n17 < n6 || n17 >= n6 + 8 || n16 < n7 || n16 >= 8 + n7) continue;
                cI cI2 = cI.a(n10);
                int n22 = n3 + cY.a(n17 & 7, n16 & 7, n8, cI2.f * 1832905927, cI2.g * 1221908201, n21, 675644959);
                int n23 = n17 & 7;
                int n24 = n16 & 7;
                int n25 = cI2.f * 1832905927;
                int n26 = cI2.g * 1221908201;
                if ((n21 & 1) == 1) {
                    n15 = n25;
                    n25 = n26;
                    n26 = n15;
                }
                int n27 = (n14 = n8 & 3) == 0 ? n24 : (n14 == 1 ? 7 - n23 - (n25 - 1) : (n14 == 2 ? 7 - n24 - (n26 - 1) : n23));
                n15 = n27 + n4;
                if (n22 <= 0 || n15 <= 0 || n22 >= 103 || n15 >= 103) continue;
                int n28 = n2;
                if ((ax.i[1][n22][n15] & 2) == 2) {
                    n28 = n2 - 1;
                }
                df df2 = null;
                if (n28 >= 0) {
                    df2 = arrdf[n28];
                }
                c.a(n2, n22, n15, n10, n8 + n21 & 3, n20, aD2, df2);
            } while (true);
            break;
        }
        return;
    }

    static {
        i = new n(64);
    }
}

