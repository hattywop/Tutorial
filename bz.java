/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Component;
import java.io.IOException;

public class bz
extends z {
    String[] a;
    int[] b;
    int c;
    int d;
    static cZ e;
    int f;
    int[] g;
    int h;
    static n i;

    static void a(int n2) {
        int n3 = aJ.f * 2104430923;
        int n4 = aQ.a * -1064642111;
        if (cO.e * 1822130227 < n3) {
            n3 = cO.e * 1822130227;
        }
        if (dy.c * -733282123 < n4) {
            n4 = dy.c * -733282123;
        }
        if (ag.d != null) {
            try {
                bH bH2 = bH.M;
                Object[] arrobject = new Object[]{cq.e(2126812738)};
            }
            catch (Throwable var3_4) {
                // empty catch block
            }
        }
    }

    static void b(int n2) {
        if (bH.ax * 1523524053 == 0) {
            cr.m = new aD(4, 104, 104, ax.h);
            for (int i2 = 0; i2 < 4; ++i2) {
                bH.aU[i2] = new df(104, 104);
            }
            cQ.h = new cX(512, 512);
            cQ.t = du.o;
            cQ.s = 1669447431;
            bH.ax = 356857284;
        } else if (bH.ax * 1523524053 == 20) {
            int[] arrn = new int[9];
            for (int i3 = 0; i3 < 9; ++i3) {
                int n3 = 128 + i3 * 32 + 15;
                int n4 = n3 * 3 + 600;
                int n5 = de.t[n3];
                arrn[i3] = n5 * n4 >> 16;
            }
            aD.a(arrn, 500, 800, 512, 334);
            cQ.t = du.p;
            cQ.s = -956072434;
            bH.ax = -1612197722;
        } else if (bH.ax * 1523524053 == 30) {
            aM.a = bH.a(0, false, true, true, 719007803);
            m.a = bH.a(1, false, true, true, 719007803);
            bw.a = bH.a(2, true, false, true, 719007803);
            bw.b = bH.a(3, false, true, true, 719007803);
            bH.F = bH.a(4, false, true, true, 719007803);
            V.c = bH.a(5, true, true, true, 719007803);
            aG.g = bH.a(6, true, true, false, 719007803);
            am.o = bH.a(7, false, true, true, 719007803);
            dg.c = bH.a(8, false, true, true, 719007803);
            dj.l = bH.a(9, false, true, true, 719007803);
            bH.fh = bH.a(10, false, true, true, 719007803);
            bQ.d = bH.a(11, false, true, true, 719007803);
            dn.a = bH.a(12, false, true, true, 719007803);
            Q.a = bH.a(13, true, false, true, 719007803);
            dy.b = bH.a(14, false, true, false, 719007803);
            bH.E = bH.a(15, false, true, true, 719007803);
            cQ.t = du.q;
            cQ.s = -1912144868;
            bH.ax = 713714568;
        } else if (bH.ax * 1523524053 == 40) {
            int n6 = 0;
            int n7 = n6 + aM.a.d(403675217) * 4 / 100;
            n7 += m.a.d(403675217) * 4 / 100;
            n7 += bw.a.d(403675217) * 2 / 100;
            n7 += bw.b.d(403675217) * 2 / 100;
            n7 += bH.F.d(403675217) * 6 / 100;
            n7 += V.c.d(403675217) * 4 / 100;
            n7 += aG.g.d(403675217) * 2 / 100;
            n7 += am.o.d(403675217) * 60 / 100;
            n7 += dg.c.d(403675217) * 2 / 100;
            n7 += dj.l.d(403675217) * 2 / 100;
            n7 += bH.fh.d(403675217) * 2 / 100;
            n7 += bQ.d.d(403675217) * 2 / 100;
            n7 += dn.a.d(403675217) * 2 / 100;
            n7 += Q.a.d(403675217) * 2 / 100;
            n7 += dy.b.d(403675217) * 2 / 100;
            if ((n7 += bH.E.d(403675217) * 2 / 100) != 100) {
                if (n7 != 0) {
                    cQ.t = du.r + n7 + "%";
                }
                cQ.s = 1426749994;
            } else {
                cQ.t = du.s;
                cQ.s = 1426749994;
                bH.ax = -270812935;
            }
        } else if (bH.ax * 1523524053 == 45) {
            boolean bl2 = !bH.ae;
            cO.i = -1170216006;
            cO.g = bl2;
            cO.f = -955798922;
            cq cq2 = new cq();
            cq2.a(9, 128, 47);
            dz.a = bH.a(aK.c, aQ.b, 0, 22050, 0);
            dz.a.a(cq2, 0);
            p p2 = bH.E;
            p p3 = dy.b;
            p p4 = bH.F;
            do.e = p2;
            do.b = p3;
            do.c = p4;
            do.d = cq2;
            bH.ff = bH.a(aK.c, aQ.b, 1, 2048, 0);
            cC.a = new cn();
            bH.ff.a(cC.a, 0);
            bc.a = new C(22050, cO.i * -46901051);
            cQ.t = du.t;
            cQ.s = -1198769871;
            bH.ax = -1255340438;
        } else if (bH.ax * 1523524053 == 50) {
            int n8 = 0;
            if (an.a == null) {
                an.a = aG.a(dg.c, Q.a, "p11_full", "", 12295440);
            } else {
                ++n8;
            }
            if (bQ.a == null) {
                bQ.a = aG.a(dg.c, Q.a, "p12_full", "", -1090536767);
            } else {
                ++n8;
            }
            if (bn.a == null) {
                bn.a = aG.a(dg.c, Q.a, "b12_full", "", -407545207);
            } else {
                ++n8;
            }
            if (n8 < 3) {
                cQ.t = du.u + n8 * 100 / 3 + "%";
                cQ.s = 470677560;
            } else {
                bQ.b = new cA(true);
                cQ.t = du.v;
                cQ.s = 470677560;
                bH.ax = 1070571852;
            }
        } else if (bH.ax * 1523524053 == 60) {
            p p5 = bH.fh;
            p p6 = dg.c;
            int n9 = 0;
            if (p5.b("title.jpg", "", 14)) {
                ++n9;
            }
            if (p6.b("logo", "", 115)) {
                ++n9;
            }
            if (p6.b("titlebox", "", 30)) {
                ++n9;
            }
            if (p6.b("titlebutton", "", 36)) {
                ++n9;
            }
            if (p6.b("runes", "", 65)) {
                ++n9;
            }
            if (p6.b("title_mute", "", 83)) {
                ++n9;
            }
            if (p6.a("options_radio_buttons,0", -112)) {
                ++n9;
            }
            if (p6.a("options_radio_buttons,2", -1)) {
                ++n9;
            }
            p6.b("sl_back", "", 25);
            p6.b("sl_flags", "", 31);
            p6.b("sl_arrows", "", 99);
            p6.b("sl_stars", "", 81);
            p6.b("sl_button", "", 97);
            int n10 = 8;
            if (n9 < n10) {
                cQ.t = du.w + n9 * 100 / n10 + "%";
                cQ.s = -485394874;
            } else {
                cQ.t = du.x;
                cQ.s = -485394874;
                bn.a(5);
                bH.ax = -898483154;
            }
        } else if (bH.ax * 1523524053 == 70) {
            if (!bw.a.a(-119)) {
                cQ.t = du.y + bw.a.c(117) + "%";
                cQ.s = -1441467308;
            } else {
                p p7 = bw.a;
                c.a = p7;
                aJ.a(bw.a);
                f.a(bw.a, am.o);
                p p8 = bw.a;
                p p9 = am.o;
                boolean bl3 = bH.ae;
                bn.b = p8;
                cI.a = p9;
                bH.t = bl3;
                p p10 = bw.a;
                p p11 = am.o;
                cH.c = p10;
                cH.a = p11;
                cY.a(bw.a, am.o, bH.N, an.a, 15);
                aE.a(bw.a, aM.a, m.a, 779588927);
                aF.a(bw.a, am.o, -2142837775);
                p p12 = bw.a;
                dB.a = p12;
                p p13 = bw.a;
                bU.c = p13;
                bU.b = bU.c.b(16) * 1572075539;
                cL.a(bw.b, am.o, dg.c, Q.a, 471759137);
                p p14 = bw.a;
                q.a = p14;
                aT.a(bw.a, -397400647);
                cQ.t = du.z;
                cQ.s = -1441467308;
                bH.ax = 1427429136;
            }
        } else if (bH.ax * 1523524053 != 80) {
            if (bH.ax * 1523524053 == 90) {
                if (!dj.l.a(-41)) {
                    cQ.t = du.C + dj.l.c(105) + "%";
                    cQ.s = -14717314;
                } else {
                    dx dx2 = new dx(dj.l, dg.c, 20, 0.8, bH.ae ? 64 : 128);
                    de.a(dx2);
                    de.a(0.8);
                    cQ.t = du.D;
                    cQ.s = -14717314;
                    bH.ax = -184768586;
                }
            } else if (bH.ax * 1523524053 == 110) {
                bE.c = new cC();
                aK.c.a(bE.c, 10, 7);
                cQ.t = du.E;
                cQ.s = -2115133206;
                bH.ax = 2141143704;
            } else if (bH.ax * 1523524053 == 120) {
                if (!bH.fh.b("huffman", "", 8)) {
                    cQ.t = du.F + 0 + "%";
                    cQ.s = 1129626144;
                } else {
                    aQ aQ2;
                    ab.a = aQ2 = new aQ(bH.fh.a("huffman", "", 0));
                    cQ.t = du.G;
                    cQ.s = 1129626144;
                    bH.ax = 172088698;
                }
            } else if (bH.ax * 1523524053 == 130) {
                if (!bw.b.a(-120)) {
                    cQ.t = du.H + bw.b.c(88) * 4 / 5 + "%";
                    cQ.s = -970789748;
                } else if (!dn.a.a(-57)) {
                    cQ.t = du.H + (80 + dn.a.c(79) / 6) + "%";
                    cQ.s = -970789748;
                } else if (!Q.a.a(-90)) {
                    cQ.t = du.H + (96 + Q.a.c(34) / 20) + "%";
                    cQ.s = -970789748;
                } else {
                    cQ.t = du.I;
                    cQ.s = -970789748;
                    bH.ax = -1796966308;
                }
            } else if (bH.ax * 1523524053 == 140) {
                bn.a(10);
            }
        } else {
            int n11 = 0;
            if (ag.b == null) {
                ag.b = t.a((a)dg.c, "compass", "");
            } else {
                ++n11;
            }
            if (bv.c == null) {
                bv.c = t.a((a)dg.c, "mapedge", "");
            } else {
                ++n11;
            }
            if (dA.a == null) {
                dA.a = ao.a(dg.c, "mapscene", "", -771714776);
            } else {
                ++n11;
            }
            if (aH.b == null) {
                aH.b = dj.a(dg.c, "mapfunction", "");
            } else {
                ++n11;
            }
            if (c.d == null) {
                c.d = dj.a(dg.c, "hitmarks", "");
            } else {
                ++n11;
            }
            if (cP.aA == null) {
                cP.aA = dj.a(dg.c, "headicons_pk", "");
            } else {
                ++n11;
            }
            if (as.a == null) {
                as.a = dj.a(dg.c, "headicons_prayer", "");
            } else {
                ++n11;
            }
            if (aF.a == null) {
                aF.a = dj.a(dg.c, "headicons_hint", "");
            } else {
                ++n11;
            }
            if (dp.a == null) {
                dp.a = dj.a(dg.c, "mapmarker", "");
            } else {
                ++n11;
            }
            if (bH.D == null) {
                bH.D = dj.a(dg.c, "cross", "");
            } else {
                ++n11;
            }
            if (aG.h == null) {
                aG.h = dj.a(dg.c, "mapdots", "");
            } else {
                ++n11;
            }
            if (aP.a == null) {
                aP.a = ao.a(dg.c, "scrollbar", "", -1221833667);
            } else {
                ++n11;
            }
            if (bj.a == null) {
                bj.a = ao.a(dg.c, "mod_icons", "", -1885082922);
                if (bj.a != null) {
                    String[] arrstring = new String[]{"pumpkin", "bloodmoneycoin", "pvpironman", "hitbox", "skotizo", "helper", "coins", "sword", "shield", "shutdown", "bountyhiscore", "bounty5", "bounty4", "bounty3", "bounty2", "bounty1", "playtime", "votepoints", "vote", "announcement", "main", "pure", "berserker", "hybrid", "youtuber", "ratio", "deaths", "kills", "wilderness", "playersonline", "clockicon", "questionmark"};
                    cN[] arrcN = new cN[bj.a.length + arrstring.length];
                    System.arraycopy(bj.a, 0, arrcN, 0, bj.a.length);
                    try {
                        for (int i4 = 1; i4 < arrstring.length; ++i4) {
                            arrcN[arrcN.length - i4] = Loader.c(arrstring[i4 - 1] + ".png");
                        }
                    }
                    catch (IOException var11_36) {
                        var11_36.printStackTrace();
                    }
                    bj.a = arrcN;
                }
            } else {
                ++n11;
            }
            if (n11 < 13) {
                cQ.t = du.A + n11 * 100 / 13 + "%";
                cQ.s = 1897427554;
            } else {
                dc.a = bj.a;
                bv.c.a();
                int n12 = (int)(Math.random() * 21.0) - 10;
                int n13 = (int)(Math.random() * 21.0) - 10;
                int n14 = (int)(Math.random() * 21.0) - 10;
                int n15 = (int)(Math.random() * 41.0) - 20;
                for (int i5 = 0; i5 < aH.b.length; ++i5) {
                    aH.b[i5].b(n15 + n12, n13 + n15, n15 + n14);
                }
                dA.a[0].a(n15 + n12, n15 + n13, n14 + n15);
                cQ.t = du.B;
                cQ.s = 1897427554;
                bH.ax = -541625870;
            }
        }
    }

    public static void c(int n2) {
        b.e.a();
        b.f.a();
    }

    static void a(short s2) {
        if (bH.cM) {
            cZ cZ2 = aK.b(aS.a * -464823961, bH.cN * -1911127929, -18366);
            if (cZ2 != null && cZ2.aV != null) {
                dj dj2 = new dj();
                dj2.e = cZ2;
                dj2.a = cZ2.aV;
                cZ.a(dj2);
            }
            bH.cM = false;
            bw.a(cZ2);
        }
    }

    static final void a(int n2, int n3, int n4, int n5) {
        int n6;
        for (n6 = 0; n6 < 8; ++n6) {
            for (int i2 = 0; i2 < 8; ++i2) {
                ax.h[n2][n6 + n3][i2 + n4] = 0;
            }
        }
        if (n3 > 0) {
            for (n6 = 1; n6 < 8; ++n6) {
                ax.h[n2][n3][n6 + n4] = ax.h[n2][n3 - 1][n4 + n6];
            }
        }
        if (n4 > 0) {
            for (n6 = 1; n6 < 8; ++n6) {
                ax.h[n2][n3 + n6][n4] = ax.h[n2][n6 + n3][n4 - 1];
            }
        }
        if (n3 > 0 && ax.h[n2][n3 - 1][n4] != 0) {
            ax.h[n2][n3][n4] = ax.h[n2][n3 - 1][n4];
        } else if (n4 > 0 && ax.h[n2][n3][n4 - 1] != 0) {
            ax.h[n2][n3][n4] = ax.h[n2][n3][n4 - 1];
        } else if (n3 > 0 && n4 > 0 && ax.h[n2][n3 - 1][n4 - 1] != 0) {
            ax.h[n2][n3][n4] = ax.h[n2][n3 - 1][n4 - 1];
        }
    }

    public static bL a(int n2, int n3, Component component, byte by2) {
        try {
            be be2 = new be();
            be2.a(n2, n3, component, 13);
            return be2;
        }
        catch (Throwable var4_5) {
            cU cU2 = new cU();
            cU2.a(n2, n3, component, 3);
            return cU2;
        }
    }

    static {
        i = new n(128);
    }
}

