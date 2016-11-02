/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Graphics;

public class av {
    protected static int a;
    static byte[][] b;
    static int[][] c;
    static int[] d;
    int e;
    r[] f = new r[100];

    r a(int n2, String string, String string2, String string3, int n3) {
        r r2 = this.f[99];
        for (int i2 = this.e * 20030413; i2 > 0; --i2) {
            if (i2 == 100) continue;
            this.f[i2] = this.f[i2 - 1];
        }
        if (r2 == null) {
            r2 = new r(n2, string, string3, string2);
        } else {
            r2.m();
            r2.b();
            r2.a(n2, string, string3, string2, -967770898);
        }
        this.f[0] = r2;
        if (this.e * 20030413 < 100) {
            this.e += 1307836677;
        }
        return r2;
    }

    r a(int n2, byte by2) {
        return n2 >= 0 && n2 < this.e * 20030413 ? this.f[n2] : null;
    }

    int a(int n2) {
        return this.e * 20030413;
    }

    static void a(s s2, s s3, byte by2) {
        int n2;
        int n3;
        int n4;
        int n5;
        if (bH.fe == null) {
            bH.fe = dj.a(dg.c, "sl_back", "");
        }
        if (cQ.f == null) {
            cQ.f = ao.a(dg.c, "sl_flags", "", -1075208800);
        }
        if (aq.f == null) {
            aq.f = ao.a(dg.c, "sl_arrows", "", -1653204550);
        }
        if (aC.h == null) {
            aC.h = ao.a(dg.c, "sl_stars", "", -1784743029);
        }
        dd.b(cQ.j * -468945023, 23, 765, 480, 0);
        dd.c(cQ.j * -468945023, 0, 125, 23, 12425273, 9135624);
        dd.c(cQ.j * -468945023 + 125, 0, 640, 23, 5197647, 2697513);
        s2.c(du.dI, cQ.j * -468945023 + 62, 15, 0, -1);
        if (aC.h != null) {
            aC.h[1].a(140 + cQ.j * -468945023, 1);
            s3.a(du.dJ, 152 + cQ.j * -468945023, 10, 16777215, -1);
            aC.h[0].a(cQ.j * -468945023 + 140, 12);
            s3.a(du.dK, cQ.j * -468945023 + 152, 21, 16777215, -1);
        }
        if (aq.f != null) {
            n3 = cQ.j * -468945023 + 280;
            if (dC.m[0] == 0 && dC.l[0] == 0) {
                aq.f[2].a(n3, 4);
            } else {
                aq.f[0].a(n3, 4);
            }
            if (dC.m[0] == 0 && dC.l[0] == 1) {
                aq.f[3].a(n3 + 15, 4);
            } else {
                aq.f[1].a(n3 + 15, 4);
            }
            s2.a(du.dL, 32 + n3, 17, 16777215, -1);
            n4 = 390 + cQ.j * -468945023;
            if (dC.m[0] == 1 && dC.l[0] == 0) {
                aq.f[2].a(n4, 4);
            } else {
                aq.f[0].a(n4, 4);
            }
            if (dC.m[0] == 1 && dC.l[0] == 1) {
                aq.f[3].a(n4 + 15, 4);
            } else {
                aq.f[1].a(15 + n4, 4);
            }
            s2.a(du.dM, 32 + n4, 17, 16777215, -1);
            n5 = 500 + cQ.j * -468945023;
            if (dC.m[0] == 2 && dC.l[0] == 0) {
                aq.f[2].a(n5, 4);
            } else {
                aq.f[0].a(n5, 4);
            }
            if (dC.m[0] == 2 && dC.l[0] == 1) {
                aq.f[3].a(n5 + 15, 4);
            } else {
                aq.f[1].a(15 + n5, 4);
            }
            s2.a(du.dN, n5 + 32, 17, 16777215, -1);
            n2 = cQ.j * -468945023 + 610;
            if (dC.m[0] == 3 && dC.l[0] == 0) {
                aq.f[2].a(n2, 4);
            } else {
                aq.f[0].a(n2, 4);
            }
            if (dC.m[0] == 3 && dC.l[0] == 1) {
                aq.f[3].a(15 + n2, 4);
            } else {
                aq.f[1].a(n2 + 15, 4);
            }
            s2.a(du.dO, 32 + n2, 17, 16777215, -1);
        }
        dd.b(cQ.j * -468945023 + 708, 4, 50, 16, 0);
        s3.c(du.dm, cQ.j * -468945023 + 708 + 25, 16, 16777215, -1);
        n3 = 0;
        n4 = 33554432;
        n5 = bH.H * -456057453 & n4;
        for (n2 = 0; n2 < dC.j * 1121294703; ++n2) {
            dC dC2 = aE.a[n2];
            if (n5 != (dC2.d * 438674181 & n4) && (dC2.d * 438674181 & n4) != 0) continue;
            ++n3;
        }
        cQ.G = -806313189;
        if (bH.fe != null) {
            int n6;
            int n7;
            int n8;
            int n9 = 88;
            int n10 = 19;
            int n11 = 765 / (n9 + 1);
            int n12 = 480 / (n10 + 1);
            do {
                n6 = n12;
                n8 = n11;
                if ((n11 - 1) * n12 >= n3) {
                    --n11;
                }
                if ((n12 - 1) * n11 >= n3) {
                    --n12;
                }
                if (n11 * (n12 - 1) < n3) continue;
                --n12;
            } while (n6 != n12 || n8 != n11);
            n6 = (765 - n11 * n9) / (1 + n11);
            if (n6 > 5) {
                n6 = 5;
            }
            if ((n8 = (480 - n10 * n12) / (1 + n12)) > 5) {
                n8 = 5;
            }
            int n13 = (765 - n11 * n9 - n6 * (n11 - 1)) / 2;
            int n14 = (480 - n10 * n12 - (n12 - 1) * n8) / 2;
            int n15 = 23 + n14;
            int n16 = n13 + cQ.j * -468945023;
            int n17 = 0;
            boolean bl2 = false;
            for (n7 = 0; n7 < dC.j * 1121294703; ++n7) {
                int n18;
                dC dC3 = aE.a[n7];
                boolean bl3 = true;
                String string = Integer.toString(dC3.b * 1599434219);
                if (dC3.b * 1599434219 == -1) {
                    string = du.dP;
                    bl3 = false;
                } else if (dC3.b * 1599434219 > 1980) {
                    string = du.dQ;
                    bl3 = false;
                }
                int n19 = 0;
                if (dC3.c()) {
                    n18 = dC3.a() ? 7 : 6;
                } else if (dC3.b()) {
                    n19 = 16711680;
                    n18 = dC3.a() ? 5 : 4;
                } else {
                    n18 = dC3.e() ? (dC3.a() ? 3 : 2) : (dC3.a() ? 1 : 0);
                }
                if (cD.l * -1031552075 >= n16 && cD.m * 1941423145 >= n15 && cD.l * -1031552075 < n9 + n16 && cD.m * 1941423145 < n15 + n10 && bl3) {
                    cQ.G = n7 * 806313189;
                    bH.fe[n18].c(n16, n15, 128, 16777215);
                    bl2 = true;
                } else {
                    bH.fe[n18].a(n16, n15);
                }
                if (cQ.f != null) {
                    cQ.f[(dC3.a() ? 8 : 0) + dC3.h * -1139554955].a(29 + n16, n15);
                }
                s2.c(Integer.toString(dC3.c * 1685233739), 15 + n16, 5 + n15 + n10 / 2, n19, -1);
                s3.c(string, 60 + n16, n10 / 2 + n15 + 5, 268435455, -1);
                n15 += n10 + n8;
                if (++n17 < n12) continue;
                n15 = n14 + 23;
                n16 += n9 + n6;
                n17 = 0;
            }
            if (bl2) {
                n7 = s3.a(aE.a[cQ.G * 624623853].f) + 6;
                int n20 = s3.c + 8;
                dd.b(cD.l * -1031552075 - n7 / 2, 5 + cD.m * 1941423145 + 20, n7, n20, 16777120);
                dd.c(cD.l * -1031552075 - n7 / 2, 20 + cD.m * 1941423145 + 5, n7, n20, 0);
                s3.c(aE.a[cQ.G * 624623853].f, cD.l * -1031552075, 4 + s3.c + cD.m * 1941423145 + 20 + 5, 0, -1);
            }
        }
        try {
            Graphics graphics = aQ.b.getGraphics();
            ba.b.a(graphics, 0, 0, 1810226472);
        }
        catch (Exception var7_10) {
            aQ.b.repaint();
        }
    }

    public static int a(int n2, int n3) {
        return n2 <= 0 ? (n2 < 0 ? -1 : 0) : 1;
    }

    public static cN b(int n2) {
        cN cN2 = new cN();
        cN2.a = dg.f * 1155403717;
        cN2.b = dg.a * 1186444245;
        cN2.g = dg.d[0];
        cN2.h = dg.e[0];
        cN2.e = aP.b[0];
        cN2.f = bH.fn[0];
        cN2.c = dB.c;
        cN2.d = cS.b[0];
        dB.a();
        return cN2;
    }
}

