/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Image;

public class bn {
    static s a;
    public static a b;

    static void a(int n2, String string, String string2) {
        bY.a(n2, string, string2, null, 670743811);
    }

    static void a(int n2) {
        if (bH.X * -684224463 != n2) {
            if (bH.X * -684224463 == 0) {
                ag.c = null;
                aR.a = null;
                aG.j = null;
            }
            if (n2 == 20 || n2 == 40 || n2 == 45) {
                bH.ay = 0;
                bH.az = 0;
                bH.aA = 0;
            }
            if (n2 != 20 && n2 != 40 && w.a != null) {
                w.a.c();
                w.a = null;
            }
            if (bH.X * -684224463 == 25) {
                bH.W = 0;
                bH.U = 0;
                bH.aS = 1619520155;
                bH.V = 0;
                bH.aT = -1369685237;
            }
            if (n2 != 5 && n2 != 10) {
                if (n2 == 20) {
                    t.a(aQ.b, dg.c, true, bH.X * -684224463 == 11 ? 4 : 0);
                } else if (n2 == 11) {
                    t.a(aQ.b, dg.c, false, 4);
                } else if (cQ.e) {
                    cQ.b = null;
                    cQ.c = null;
                    if (!bH.B) {
                        ca.d = null;
                    }
                    if (!bH.z) {
                        Z.a = null;
                        cQ.d = null;
                    }
                    if (!bH.C) {
                        I.a = null;
                    }
                    O.a = null;
                    cQ.a = null;
                    cS.c = null;
                    bH.fe = null;
                    cQ.f = null;
                    aq.f = null;
                    aC.h = null;
                    dl.b = null;
                    ay.n = null;
                    dC.e = null;
                    cS.a = null;
                    aQ.c = null;
                    aV.a = null;
                    aa.a = null;
                    av.d = null;
                    v.a = null;
                    p.h(2, 1127013233);
                    bH.a(true, 36);
                    cQ.e = false;
                }
            } else {
                t.a(aQ.b, dg.c, true, 0);
            }
            bH.X = n2 * -124925743;
        }
    }

    static final void a() {
        if (bH.ae && bH.aR * 1286856103 != u.d * -1093536619) {
            al.a(c.c * 1572449351, ao.a * -932948791, u.d * -1093536619, cP.ar.ah[0], cP.ar.ai[0], 220808185);
        } else if (bH.eh * -1923892843 != u.d * -1093536619) {
            int n2;
            int n3;
            int n4;
            int n5;
            bH.eh = u.d * -863727871;
            int n6 = u.d * -1093536619;
            int[] arrn = cQ.h.a;
            int n7 = arrn.length;
            for (n3 = 0; n3 < n7; ++n3) {
                arrn[n3] = 0;
            }
            for (n3 = 1; n3 < 103; ++n3) {
                n4 = 24628 + (103 - n3) * 2048;
                for (n5 = 1; n5 < 103; ++n5) {
                    if ((ax.i[n6][n5][n3] & 24) == 0) {
                        cr.m.a(arrn, n4, 512, n6, n5, n3);
                    }
                    if (n6 < 3 && (ax.i[n6 + 1][n5][n3] & 8) != 0) {
                        cr.m.a(arrn, n4, 512, 1 + n6, n5, n3);
                    }
                    n4 += 4;
                }
            }
            n3 = (238 + (int)(Math.random() * 20.0) - 10 << 16) + (238 + (int)(Math.random() * 20.0) - 10 << 8) + (238 + (int)(Math.random() * 20.0) - 10);
            n4 = 238 + (int)(Math.random() * 20.0) - 10 << 16;
            cQ.h.d();
            for (n5 = 1; n5 < 103; ++n5) {
                for (n2 = 1; n2 < 103; ++n2) {
                    if ((ax.i[n6][n2][n5] & 24) == 0) {
                        aT.a(n6, n2, n5, n3, n4, -1750156853);
                    }
                    if (n6 >= 3 || (ax.i[n6 + 1][n2][n5] & 8) == 0) continue;
                    aT.a(1 + n6, n2, n5, n3, n4, -1995676366);
                }
            }
            bH.ei = 0;
            for (n5 = 0; n5 < 104; ++n5) {
                for (n2 = 0; n2 < 104; ++n2) {
                    int n8;
                    int n9;
                    int n10 = cr.m.i(u.d * -1093536619, n5, n2);
                    if (n10 != 0) {
                        n10 = n10 >> 14 & 32767;
                        n8 = cI.a((int)n10).v * -845701083;
                        if (n8 >= 0) {
                            n9 = n5;
                            int n11 = n2;
                            if (n8 != 22 && n8 != 29 && n8 != 34 && n8 != 36 && n8 != 46 && n8 != 47 && n8 != 48) {
                                int[][] arrn2 = bH.aU[u.d * -1093536619].f;
                                for (int i2 = 0; i2 < 10; ++i2) {
                                    int n12 = (int)(Math.random() * 4.0);
                                    if (n12 == 0 && n9 > 0 && n9 > n5 - 3 && (arrn2[n9 - 1][n11] & 19136776) == 0) {
                                        --n9;
                                    }
                                    if (n12 == 1 && n9 < 103 && n9 < 3 + n5 && (arrn2[n9 + 1][n11] & 19136896) == 0) {
                                        ++n9;
                                    }
                                    if (n12 == 2 && n11 > 0 && n11 > n2 - 3 && (arrn2[n9][n11 - 1] & 19136770) == 0) {
                                        --n11;
                                    }
                                    if (n12 != 3 || n11 >= 103 || n11 >= n2 + 3 || (arrn2[n9][1 + n11] & 19136800) != 0) continue;
                                    ++n11;
                                }
                            }
                            bH.el[bH.ei * -1281668133] = aH.b[n8];
                            bH.ej[bH.ei * -1281668133] = n9;
                            bH.ek[bH.ei * -1281668133] = n11;
                            bH.ei += 347322451;
                        }
                    }
                    n8 = bw.c * -1719983039 + n5;
                    n9 = ce.c * 803568843 + n2;
                    if (n8 == 3096 && n9 == 3511) {
                        bH.el[bH.ei * -1281668133] = I.b;
                        bH.ej[bH.ei * -1281668133] = n5;
                        bH.ek[bH.ei * -1281668133] = n2;
                        bH.ei += 347322451;
                        continue;
                    }
                    if (n8 == 3102 && n9 == 3497) {
                        bH.el[bH.ei * -1281668133] = I.c;
                        bH.ej[bH.ei * -1281668133] = n5;
                        bH.ek[bH.ei * -1281668133] = n2;
                        bH.ei += 347322451;
                        continue;
                    }
                    if (n8 == 3087 && n9 == 3510) {
                        bH.el[bH.ei * -1281668133] = I.d;
                        bH.ej[bH.ei * -1281668133] = n5;
                        bH.ek[bH.ei * -1281668133] = n2;
                        bH.ei += 347322451;
                        continue;
                    }
                    if (n8 == 3079 && n9 == 3492) {
                        bH.el[bH.ei * -1281668133] = I.f;
                        bH.ej[bH.ei * -1281668133] = n5;
                        bH.ek[bH.ei * -1281668133] = n2;
                        bH.ei += 347322451;
                        continue;
                    }
                    if (n8 == 3069 && n9 == 3517) {
                        bH.el[bH.ei * -1281668133] = I.e;
                        bH.ej[bH.ei * -1281668133] = n5;
                        bH.ek[bH.ei * -1281668133] = n2;
                        bH.ei += 347322451;
                        continue;
                    }
                    if (n8 != 3103 || n9 != 3481) continue;
                    bH.el[bH.ei * -1281668133] = I.g;
                    bH.ej[bH.ei * -1281668133] = n5;
                    bH.ek[bH.ei * -1281668133] = n2;
                    bH.ei += 347322451;
                }
            }
            ba.b.a();
        }
    }
}

