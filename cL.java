/*
 * Decompiled with CFR 0_118.
 */
import java.applet.Applet;
import java.io.IOException;
import java.io.PrintStream;

public class cL {
    public static void a(a a2, a a3, a a4, a a5, int n2) {
        cZ.b = a2;
        cZ.i = a3;
        cZ.c = a4;
        cZ.d = a5;
        cZ.e = new cZ[cZ.b.b(-63)][];
        cZ.a = new boolean[cZ.b.b(-120)];
    }

    static final boolean a(int n2) {
        if (bH.fd == null) {
            return false;
        }
        try {
            Object object;
            int n3 = bH.fd.a();
            if (n3 == 0) {
                return false;
            }
            if (bH.aJ * -2146869835 == -1) {
                bH.fd.a(bH.aH.g, 0, 1);
                bH.aH.h = 0;
                bH.aJ = bH.aH.a() * 426797213;
                bH.aI = cK.a[bH.aJ * -2146869835] * 20645833;
                if (bH.aJ * -2146869835 == 246) {
                    bH.aI = -20645833;
                }
                --n3;
            }
            if (bH.aI * 1964753529 == -1) {
                if (n3 <= 0) {
                    return false;
                }
                bH.fd.a(bH.aH.g, 0, 1);
                bH.aI = (bH.aH.g[0] & 255) * 20645833;
                --n3;
            }
            if (bH.aI * 1964753529 == -2) {
                if (n3 <= 1) {
                    return false;
                }
                bH.fd.a(bH.aH.g, 0, 2);
                bH.aH.h = 0;
                bH.aI = bH.aH.f() * 20645833;
                n3 -= 2;
            }
            if (n3 < bH.aI * 1964753529) {
                return false;
            }
            bH.aH.h = 0;
            bH.fd.a(bH.aH.g, 0, bH.aI * 1964753529);
            bH.aK = 0;
            bH.aO = bH.aN * -1789153887;
            bH.aN = bH.aM * 956357557;
            bH.aM = bH.aJ * -1381983527;
            if (bH.aJ * -2146869835 == 2) {
                int n4 = bH.aH.f();
                bH.H = n4 * 1718530509 * -1893770233;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 193) {
                int n5 = bH.aH.F();
                int n6 = bH.aH.v();
                int n7 = bH.aH.E();
                ce ce2 = (ce)bH.cS.a(n7);
                if (ce2 != null) {
                    dz.a(ce2, n5 != ce2.a * -1385416029, 1345746199);
                }
                bL.a(n7, n5, n6);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 239) {
                int n8 = bH.aH.s();
                int n9 = bH.aH.C();
                int n10 = n8 >> 10 & 31;
                int n11 = n8 >> 5 & 31;
                int n12 = n8 & 31;
                int n13 = (n10 << 19) + (n11 << 11) + (n12 << 3);
                cZ cZ2 = aK.a(n9);
                if (n13 != cZ2.W * 1480230763) {
                    cZ2.W = n13 * -963482301;
                    bw.a(cZ2);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 160 || bH.aJ * -2146869835 == 113 || bH.aJ * -2146869835 == 245 || bH.aJ * -2146869835 == 197 || bH.aJ * -2146869835 == 101 || bH.aJ * -2146869835 == 244 || bH.aJ * -2146869835 == 145 || bH.aJ * -2146869835 == 95 || bH.aJ * -2146869835 == 186 || bH.aJ * -2146869835 == 63) {
                aE.a();
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 225) {
                cO.a(true);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 104) {
                String string = bH.aH.l();
                long l2 = bH.aH.j();
                long l3 = bH.aH.f();
                long l4 = bH.aH.h();
                bR bR2 = (bR)bU.a(cZ.b(-22), bH.aH.d(), 1897298915);
                long l5 = (l3 << 32) + l4;
                boolean bl2 = false;
                for (int i2 = 0; i2 < 100; ++i2) {
                    if (l5 != bH.dZ[i2]) continue;
                    bl2 = true;
                    break;
                }
                if (bR2.d && aj.a(string)) {
                    bl2 = true;
                }
                if (!bl2 && bH.ca * -246740433 == 0) {
                    String string2;
                    bH.dZ[bH.ea * 1965929751] = l5;
                    bH.ea = (bH.ea * 1965929751 + 1) % 100 * -1112616281;
                    cJ cJ2 = bH.aH;
                    try {
                        String string3;
                        int n14 = cJ2.q();
                        if (n14 > 32767) {
                            n14 = 32767;
                        }
                        byte[] arrby = new byte[n14];
                        cJ2.h += ab.a.a(cJ2.g, cJ2.h * 1736753585, arrby, 0, n14, 1536079938) * 1303963473;
                        string2 = string3 = aV.a(arrby, 0, n14, 1967361289);
                    }
                    catch (Exception var31_128) {
                        string2 = "Cabbage";
                    }
                    string2 = dc.b(aC.a(string2, 2118678300));
                    if (bR2.b * 1684664313 != -1) {
                        bY.a(9, bp.a(bR2.b * 1684664313) + string, string2, bL.a(l2), -629065166);
                    } else {
                        bY.a(9, string, string2, bL.a(l2), 1298747405);
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 252) {
                int n15 = bH.aH.i();
                int n16 = bH.aH.f();
                if (n15 < -70000) {
                    n16 += 32768;
                }
                cZ cZ3 = n15 >= 0 ? aK.a(n15) : null;
                while (bH.aH.h * 1736753585 < bH.aI * 1964753529) {
                    int n17 = bH.aH.q();
                    int n18 = bH.aH.f();
                    int n19 = 0;
                    if (n18 != 0 && (n19 = bH.aH.d()) == 255) {
                        n19 = bH.aH.i();
                    }
                    if (cZ3 != null && n17 >= 0 && n17 < cZ3.H.length) {
                        cZ3.H[n17] = n18;
                        cZ3.I[n17] = n19;
                    }
                    bH.b(n16, n17, n18 - 1, n19);
                }
                if (cZ3 != null) {
                    bw.a(cZ3);
                }
                dj.a();
                bH.dt[(bH.du += 1158399665) * -84622767 - 1 & 31] = n16 & 32767;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 5) {
                int n20 = bH.aH.E();
                df.a = aK.c.a(n20, 1580628845);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 234) {
                cQ.a(false);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 188) {
                bH.aH.h -= 2143728420;
                if (bH.aH.H()) {
                    cJ cJ3 = bH.aH;
                    int n21 = bH.aH.h * 1736753585 - 28;
                    if (bg.f != null) {
                        try {
                            bg.f.a(0);
                            bg.f.b(cJ3.g, n21, 24, 1744727329);
                        }
                        catch (Exception var21_149) {
                            // empty catch block
                        }
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 58) {
                bH.eU = -1812119817;
                bH.dy = bH.dq * 1609802529;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 235) {
                int n22;
                bZ bZ2;
                int n23 = bH.aH.i();
                int n24 = bH.aH.f();
                if (n23 < -70000) {
                    n24 += 32768;
                }
                cZ cZ4 = n23 >= 0 ? aK.a(n23) : null;
                if (cZ4 != null) {
                    for (int i3 = 0; i3 < cZ4.H.length; ++i3) {
                        cZ4.H[i3] = 0;
                        cZ4.I[i3] = 0;
                    }
                }
                if ((bZ2 = (bZ)bZ.e.a(n24)) != null) {
                    for (n22 = 0; n22 < bZ2.a.length; ++n22) {
                        bZ2.a[n22] = -1;
                        bZ2.b[n22] = 0;
                    }
                }
                n22 = bH.aH.f();
                for (int i4 = 0; i4 < n22; ++i4) {
                    int n25 = bH.aH.f();
                    int n26 = bH.aH.d();
                    if (n26 == 255) {
                        n26 = bH.aH.E();
                    }
                    if (cZ4 != null && i4 < cZ4.H.length) {
                        cZ4.H[i4] = n25;
                        cZ4.I[i4] = n26;
                    }
                    bH.b(n24, i4, n25 - 1, n26);
                }
                if (cZ4 != null) {
                    bw.a(cZ4);
                }
                dj.a();
                bH.dt[(bH.du += 1158399665) * -84622767 - 1 & 31] = n24 & 32767;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 248) {
                int n27 = bH.aH.f();
                int n28 = bH.aH.d();
                int n29 = bH.aH.f();
                cL.a(n27, n28, n29);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 67) {
                int n30;
                for (n30 = 0; n30 < bH.cb.length; ++n30) {
                    if (bH.cb[n30] == null) continue;
                    bH.cb[n30].r = -1940983775;
                }
                for (n30 = 0; n30 < bH.aC.length; ++n30) {
                    if (bH.aC[n30] == null) continue;
                    bH.aC[n30].r = -1940983775;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 38) {
                String string;
                long l6;
                int n31;
                Object object2;
                bH.dz = bH.dq * 1312885291;
                if (bH.aI * 1964753529 == 0) {
                    bH.ef = null;
                    bH.eg = null;
                    bE.a = 0;
                    aM.b = null;
                    bH.aJ = -426797213;
                    return true;
                }
                bH.eg = bH.aH.l();
                long l7 = l6 = bH.aH.j();
                if (l6 > 0 && l6 < 6582952005840035281L) {
                    if (l6 % 37 == 0) {
                        string = null;
                    } else {
                        n31 = 0;
                        for (long i5 = l6; i5 != 0; i5 /= 37) {
                            ++n31;
                        }
                        object2 = new StringBuilder(n31);
                        while (l7 != 0) {
                            long l8 = l7;
                            object2.append(bc.b[(int)(l8 - 37 * (l7 /= 37))]);
                        }
                        string = object2.reverse().toString();
                    }
                } else {
                    string = null;
                }
                bH.ef = string;
                cf.a = bH.aH.e();
                n31 = bH.aH.d();
                if (n31 == 255) {
                    bH.aJ = -426797213;
                    return true;
                }
                bE.a = n31 * 1168379141;
                object2 = new ct[100];
                for (int i6 = 0; i6 < bE.a * -1787316275; ++i6) {
                    object2[i6] = new ct();
                    object2[i6].c = bH.aH.l();
                    object2[i6].d = aC.a(object2[i6].c, bH.O, -2051437637);
                    object2[i6].a = bH.aH.f() * -1785505117;
                    object2[i6].b = bH.aH.e();
                    bH.aH.l();
                    if (!object2[i6].c.equals(cP.ar.aF)) continue;
                    bZ.d = object2[i6].b;
                }
                boolean bl3 = false;
                int n32 = bE.a * -1787316275;
                while (n32 > 0) {
                    bl3 = true;
                    for (int i7 = 0; i7 < --n32; ++i7) {
                        if (object2[i7].d.compareTo(object2[1 + i7].d) <= 0) continue;
                        Object object3 = object2[i7];
                        object2[i7] = object2[i7 + 1];
                        object2[i7 + 1] = object3;
                        bl3 = false;
                    }
                    if (!bl3) continue;
                }
                aM.b = object2;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 120) {
                int n33 = bH.aH.i();
                boolean bl4 = bH.aH.u() == 1;
                cZ cZ5 = aK.a(n33);
                if (cZ5.G != bl4) {
                    cZ5.G = bl4;
                    bw.a(cZ5);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 49) {
                int n34 = bH.aH.d();
                int n35 = bH.aH.d();
                int n36 = bH.aH.d();
                int n37 = bH.aH.d();
                bH.eB[n34] = true;
                bH.eC[n34] = n35;
                bH.eD[n34] = n36;
                bH.eE[n34] = n37;
                bH.eF[n34] = 0;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 33) {
                int n38 = bH.aH.i();
                cZ cZ6 = aK.a(n38);
                for (int i8 = 0; i8 < cZ6.H.length; ++i8) {
                    cZ6.H[i8] = -1;
                    cZ6.H[i8] = 0;
                }
                bw.a(cZ6);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 60) {
                String string;
                String string4 = bH.aH.l();
                cJ cJ4 = bH.aH;
                try {
                    String string5;
                    int n39 = cJ4.q();
                    if (n39 > 32767) {
                        n39 = 32767;
                    }
                    byte[] arrby = new byte[n39];
                    cJ4.h += ab.a.a(cJ4.g, cJ4.h * 1736753585, arrby, 0, n39, -2061204776) * 1303963473;
                    string = string5 = aV.a(arrby, 0, n39, 1643959059);
                }
                catch (Exception var33_140) {
                    string = "Cabbage";
                }
                string = dc.b(aC.a(string, 1634974047));
                bn.a(6, string4, string);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 78) {
                int n40 = bH.aH.q();
                boolean bl5 = bH.aH.d() == 1;
                String string = "";
                boolean bl6 = false;
                if (bl5 && aj.a(string = bH.aH.l())) {
                    bl6 = true;
                }
                String string6 = bH.aH.l();
                if (n40 == 69) {
                    bj.a(string6, true, false);
                    bH.aJ = -426797213;
                    return true;
                }
                if (!bl6) {
                    bn.a(n40, string, string6);
                }
                if (n40 == 29) {
                    bB.a(string6);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 195) {
                Object object4;
                Object object5;
                while (bH.aH.h * 1736753585 < bH.aI * 1964753529) {
                    boolean bl7;
                    aG aG2;
                    boolean bl8 = bH.aH.d() == 1;
                    object5 = bH.aH.l();
                    object4 = bH.aH.l();
                    int n41 = bH.aH.f();
                    int n42 = bH.aH.d();
                    int n43 = bH.aH.d();
                    boolean bl9 = (n43 & 2) != 0;
                    boolean bl10 = bl7 = (n43 & 1) != 0;
                    if (n41 > 0) {
                        bH.aH.l();
                        bH.aH.d();
                        bH.aH.i();
                    }
                    bH.aH.l();
                    for (int i9 = 0; i9 < bH.eT * 389772333; ++i9) {
                        aG2 = bH.eV[i9];
                        if (!bl8) {
                            if (!object5.equals(aG2.i)) continue;
                            if (aG2.c * -261257351 != n41) {
                                boolean bl11 = true;
                                V v2 = (V)bH.eW.a();
                                while (v2 != null) {
                                    if (v2.f.equals(object5)) {
                                        if (n41 != 0 && v2.g == 0) {
                                            v2.a();
                                            bl11 = false;
                                        } else if (n41 == 0 && v2.g != 0) {
                                            v2.a();
                                            bl11 = false;
                                        }
                                    }
                                    v2 = (V)bH.eW.b();
                                }
                                if (bl11) {
                                    bH.eW.a(new V((String)object5, n41));
                                }
                                aG2.c = n41 * -802999607;
                            }
                            aG2.b = object4;
                            aG2.d = n42 * -764597223;
                            aG2.a = bl9;
                            aG2.e = bl7;
                            object5 = null;
                            break;
                        }
                        if (!object4.equals(aG2.i)) continue;
                        aG2.i = object5;
                        aG2.b = object4;
                        object5 = null;
                        break;
                    }
                    if (object5 == null || bH.eT * 389772333 >= 400) continue;
                    bH.eV[bH.eT * 389772333] = aG2 = new aG();
                    aG2.i = object5;
                    aG2.b = object4;
                    aG2.c = n41 * -802999607;
                    aG2.d = n42 * -764597223;
                    aG2.a = bl9;
                    aG2.e = bl7;
                    bH.eT += 681507749;
                }
                bH.eU = 670727662;
                bH.dy = bH.dq * 1609802529;
                boolean bl12 = false;
                int n44 = bH.eT * 389772333;
                while (n44 > 0) {
                    bl12 = true;
                    for (int i10 = 0; i10 < --n44; ++i10) {
                        boolean bl13 = false;
                        aG aG3 = bH.eV[i10];
                        object5 = bH.eV[i10 + 1];
                        if (bH.J * 1425499025 != aG3.c * -261257351 && bH.J * 1425499025 == object5.c * -261257351) {
                            bl13 = true;
                        }
                        if (!bl13 && aG3.c * -261257351 == 0 && object5.c * -261257351 != 0) {
                            bl13 = true;
                        }
                        if (!bl13 && !aG3.a && object5.a) {
                            bl13 = true;
                        }
                        if (!bl13 && !aG3.e && object5.e) {
                            bl13 = true;
                        }
                        if (!bl13) continue;
                        object4 = bH.eV[i10];
                        bH.eV[i10] = bH.eV[i10 + 1];
                        bH.eV[1 + i10] = object4;
                        bl12 = false;
                    }
                    if (!bl12) continue;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 167) {
                dj.a();
                int n45 = bH.aH.v();
                int n46 = bH.aH.D();
                int n47 = bH.aH.t();
                bH.cw[n47] = n46;
                bH.cu[n47] = n45;
                bH.cv[n47] = 1;
                for (int i11 = 0; i11 < 98; ++i11) {
                    if (n46 < dm.b[i11]) continue;
                    bH.cv[n47] = 2 + i11;
                }
                bH.dv[(bH.dw -= 1644873877) * -44417725 - 1 & 31] = n47;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 133) {
                int n48 = bH.aH.v();
                int n49 = bH.aH.u();
                String string = bH.aH.l();
                if (n49 >= 1 && n49 <= 8) {
                    if (string.equalsIgnoreCase("null")) {
                        string = null;
                    }
                    bH.cm[n49 - 1] = string;
                    bH.cn[n49 - 1] = n48 == 0;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 14) {
                int n50 = bH.aH.D();
                int n51 = bH.aH.g();
                cZ cZ7 = aK.a(n50);
                if (n51 != cZ7.ai * -335970573 || n51 == -1) {
                    cZ7.ai = n51 * 1616693819;
                    cZ7.bI = 0;
                    cZ7.bJ = 0;
                    bw.a(cZ7);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 105) {
                int n52 = bH.aH.D();
                int n53 = bH.aH.F();
                cZ cZ8 = aK.a(n52);
                if (cZ8.ae * 1661118609 != 2 || n53 != cZ8.af * -982469919) {
                    cZ8.ae = -1119080222;
                    cZ8.af = n53 * 999821601;
                    bw.a(cZ8);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 61) {
                dj.a();
                bH.cX = bH.aH.g() * 1914240165;
                bH.dC = bH.dq * 108236717;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 37) {
                int n54 = bH.aH.C();
                int n55 = bH.aH.s();
                int n56 = bH.aH.F();
                int n57 = bH.aH.F();
                cZ cZ9 = aK.a(n54);
                if (n55 != cZ9.aq * -1788131197 || n56 != cZ9.ar * 1096480275 || cZ9.ap * -1256377801 != n57) {
                    cZ9.aq = n55 * 193807915;
                    cZ9.ar = n56 * 1932084251;
                    cZ9.ap = n57 * 866853767;
                    bw.a(cZ9);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 159) {
                int n58 = bH.aH.s();
                if (n58 == 65535) {
                    n58 = -1;
                }
                int n59 = bH.aH.C();
                int n60 = bH.aH.E();
                int n61 = bH.aH.f();
                if (n61 == 65535) {
                    n61 = -1;
                }
                for (int i12 = n61; i12 <= n58; ++i12) {
                    long l9 = (long)i12 + ((long)n59 << 32);
                    cF cF2 = bH.dI.a(l9);
                    if (cF2 != null) {
                        cF2.m();
                    }
                    bH.dI.a(new bX(n60), l9);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 230) {
                bH.am = bH.aH.d() * 1260862725;
                if (bH.am * 1066731469 == 1) {
                    bH.an = bH.aH.f() * -377558041;
                }
                if (bH.am * 1066731469 >= 2 && bH.am * 1066731469 <= 6) {
                    if (bH.am * 1066731469 == 2) {
                        bH.as = -1570029248;
                        bH.at = -1777288512;
                    }
                    if (bH.am * 1066731469 == 3) {
                        bH.as = 0;
                        bH.at = -1777288512;
                    }
                    if (bH.am * 1066731469 == 4) {
                        bH.as = 1154908800;
                        bH.at = -1777288512;
                    }
                    if (bH.am * 1066731469 == 5) {
                        bH.as = -1570029248;
                        bH.at = 0;
                    }
                    if (bH.am * 1066731469 == 6) {
                        bH.as = -1570029248;
                        bH.at = 740390272;
                    }
                    bH.am = -1773241846;
                    bH.ap = bH.aH.f() * -1482462703;
                    bH.aq = bH.aH.f() * 2099856463;
                    bH.ar = bH.aH.d() * 1818408695;
                }
                if (bH.am * 1066731469 == 10) {
                    bH.ao = bH.aH.f() * 1031675027;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 51) {
                int n62 = bH.aH.i();
                int n63 = bH.aH.y();
                if (n63 == 65535) {
                    n63 = -1;
                }
                int n64 = bH.aH.E();
                cZ cZ10 = aK.a(n62);
                if (!cZ10.r) {
                    if (n63 == -1) {
                        cZ10.ae = 0;
                        bH.aJ = -426797213;
                        return true;
                    }
                    ca ca2 = bH.j(n63);
                    cZ10.ae = 2056806852;
                    cZ10.af = n63 * 999821601;
                    cZ10.aq = ca2.h * -2103748037;
                    cZ10.ar = ca2.i * -2128308079;
                    cZ10.ap = ca2.g * -1569860500 / n64 * 866853767;
                    bw.a(cZ10);
                } else {
                    cZ10.bG = n63 * 801052415;
                    cZ10.bH = n64 * -117852123;
                    ca ca3 = bH.j(n63);
                    cZ10.aq = ca3.h * -2103748037;
                    cZ10.ar = ca3.i * -2128308079;
                    cZ10.aG = ca3.F * -1263339933;
                    cZ10.aE = ca3.j * 615584475;
                    cZ10.aF = ca3.k * -798173031;
                    cZ10.ap = ca3.g * 690567109;
                    cZ10.bE = ca3.l * 833352093 == 1 ? 1465661813 : -1363643670;
                    if (cZ10.aP * -726159965 > 0) {
                        cZ10.ap = cZ10.ap * -1549383968 / (cZ10.aP * -726159965) * 866853767;
                    } else if (cZ10.x * -769280817 > 0) {
                        cZ10.ap = cZ10.ap * -1549383968 / (cZ10.x * -769280817) * 866853767;
                    }
                    bw.a(cZ10);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 16) {
                cO.a(false);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 153) {
                bt.c = bH.aH.u() * 1231171733;
                bH.fk = bH.aH.u() * -559168027;
                while (bH.aH.h * 1736753585 < bH.aI * 1964753529) {
                    bH.aJ = bH.aH.d() * 426797213;
                    aE.a();
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 117) {
                int n65;
                int n66;
                int n67;
                int n68 = bH.aI * 1964753529 + bH.aH.h * 1736753585;
                int n69 = bH.aH.f();
                int n70 = bH.aH.f();
                if (bH.cR * 1787246131 != n69) {
                    bH.cR = n69 * -1855539973;
                    w.a(false, -57);
                    dB.a(bH.cR * 1787246131);
                    cz.a(bH.cR * 1787246131, -375953389);
                    for (int i13 = 0; i13 < 100; ++i13) {
                        bH.dL[i13] = true;
                    }
                }
                while (n70-- > 0) {
                    n67 = bH.aH.i();
                    n66 = bH.aH.f();
                    n65 = bH.aH.d();
                    ce ce3 = (ce)bH.cS.a(n67);
                    if (ce3 != null && n66 != ce3.a * -1385416029) {
                        dz.a(ce3, true, 1345746199);
                        ce3 = null;
                    }
                    if (ce3 == null) {
                        ce3 = bL.a(n67, n66, n65);
                    }
                    ce3.d = true;
                }
                ce ce4 = (ce)bH.cS.a();
                while (ce4 != null) {
                    if (ce4.d) {
                        ce4.d = false;
                    } else {
                        dz.a(ce4, true, 1345746199);
                    }
                    ce4 = (ce)bH.cS.b();
                }
                bH.dI = new bP(512);
                while (bH.aH.h * 1736753585 < n68) {
                    n67 = bH.aH.i();
                    n66 = bH.aH.f();
                    n65 = bH.aH.f();
                    int n71 = bH.aH.i();
                    for (int i14 = n66; i14 <= n65; ++i14) {
                        long l10 = ((long)n67 << 32) + (long)i14;
                        bH.dI.a(new bX(n71), l10);
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 79) {
                int n72;
                int n73;
                int n74;
                int n75;
                cP cP2;
                int n76;
                ++bH.y;
                bH.cj = 0;
                bH.ce = 0;
                bH.aH.b();
                int n77 = bH.aH.b(1);
                if (n77 != 0) {
                    int n78;
                    n72 = bH.aH.b(2);
                    if (n72 == 0) {
                        bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = 2047;
                    } else if (n72 == 1) {
                        n75 = bH.aH.b(3);
                        cP.ar.a(n75, false);
                        n78 = bH.aH.b(1);
                        if (n78 == 1) {
                            bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = 2047;
                        }
                    } else if (n72 == 2) {
                        n75 = bH.aH.b(3);
                        cP.ar.a(n75, true);
                        n78 = bH.aH.b(3);
                        cP.ar.a(n78, true);
                        n74 = bH.aH.b(1);
                        if (n74 == 1) {
                            bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = 2047;
                        }
                    } else if (n72 == 3) {
                        n75 = bH.aH.b(7);
                        n78 = bH.aH.b(1);
                        n74 = bH.aH.b(7);
                        n73 = bH.aH.b(1);
                        if (n73 == 1) {
                            bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = 2047;
                        }
                        u.d = bH.aH.b(2) * 1191917245;
                        cP.ar.a(n74, n75, n78 == 1, 14);
                    }
                }
                if ((n77 = bH.aH.b(8)) < bH.cc * -796710281) {
                    for (n72 = n77; n72 < bH.cc * -796710281; ++n72) {
                        bH.ck[(bH.cj += 880507307) * -807159549 - 1] = bH.cd[n72];
                    }
                }
                if (n77 > bH.cc * -796710281) {
                    throw new RuntimeException("");
                }
                bH.cc = 0;
                for (n72 = 0; n72 < n77; ++n72) {
                    int n79;
                    int n80;
                    n75 = bH.cd[n72];
                    cP2 = bH.cb[n75];
                    n74 = bH.aH.b(1);
                    if (n74 == 0) {
                        bH.cd[(bH.cc -= 549466297) * -796710281 - 1] = n75;
                        cP2.ad = bH.S * 489897939;
                        continue;
                    }
                    n73 = bH.aH.b(2);
                    if (n73 == 0) {
                        bH.cd[(bH.cc -= 549466297) * -796710281 - 1] = n75;
                        cP2.ad = bH.S * 489897939;
                        bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = n75;
                        continue;
                    }
                    if (n73 == 1) {
                        bH.cd[(bH.cc -= 549466297) * -796710281 - 1] = n75;
                        cP2.ad = bH.S * 489897939;
                        n80 = bH.aH.b(3);
                        cP2.a(n80, false);
                        n79 = bH.aH.b(1);
                        if (n79 != 1) continue;
                        bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = n75;
                        continue;
                    }
                    if (n73 == 2) {
                        bH.cd[(bH.cc -= 549466297) * -796710281 - 1] = n75;
                        cP2.ad = bH.S * 489897939;
                        n80 = bH.aH.b(3);
                        cP2.a(n80, true);
                        n79 = bH.aH.b(3);
                        cP2.a(n79, true);
                        n76 = bH.aH.b(1);
                        if (n76 != 1) continue;
                        bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = n75;
                        continue;
                    }
                    if (n73 != 3) continue;
                    bH.ck[(bH.cj += 880507307) * -807159549 - 1] = n75;
                }
                bH.l(-1434852589);
                for (n77 = 0; n77 < bH.ce * -435618589; ++n77) {
                    int n81;
                    int n82;
                    int n83;
                    int n84;
                    int n85;
                    n72 = bH.cf[n77];
                    cP2 = bH.cb[n72];
                    int n86 = bH.aH.d();
                    if ((n86 & 128) != 0) {
                        n86 += bH.aH.d() << 8;
                    }
                    if ((n86 & 64) != 0) {
                        n85 = bH.aH.F();
                        n83 = bH.aH.t();
                        cP2.a(n85, n83, bH.S * 1026470457);
                        cP2.P = bH.S * 1810132455 - 2012164012;
                        cP2.e = bH.aH.d() * -1158152579;
                        cP2.f = bH.aH.t() * 1033095941;
                    }
                    if ((n86 & 1) != 0) {
                        cP2.Q = bH.aH.F() * 357265433;
                        if (cP2.Q * 1253370921 == 65535) {
                            cP2.Q = -357265433;
                        }
                    }
                    if ((n86 & 256) != 0) {
                        cP2.aa = bH.aH.f() * 1325550547;
                        n85 = bH.aH.E();
                        cP2.j = (n85 >> 16) * 1119651467;
                        cP2.i = (bH.S * 1026470457 + (n85 & 65535)) * 433468627;
                        cP2.ab = 0;
                        cP2.ac = 0;
                        if (cP2.i * -1244118181 > bH.S * 1026470457) {
                            cP2.ab = 708692887;
                        }
                        if (cP2.aa * -1444330405 == 65535) {
                            cP2.aa = -1325550547;
                        }
                    }
                    if ((n86 & 2) != 0) {
                        cP2.H = bH.aH.l();
                        if (cP2.H.charAt(0) == '~') {
                            cP2.H = cP2.H.substring(1);
                            bn.a(2, cP2.aF, cP2.H);
                        } else if (cP.ar == cP2) {
                            bn.a(2, cP2.aF, cP2.H);
                        }
                        cP2.c = false;
                        cP2.K = 0;
                        cP2.L = 0;
                        cP2.J = 2010966242;
                    }
                    if ((n86 & 8) != 0) {
                        n74 = bH.aH.d();
                        byte[] arrby = new byte[n74];
                        cY cY2 = new cY(arrby);
                        bH.aH.b(arrby, 0, n74);
                        bH.cg[n72] = cY2;
                        cP2.a(cY2);
                    }
                    if ((n86 & 1024) != 0) {
                        n85 = bH.aH.t();
                        cP2.k = n85 * 1337821425;
                        n83 = bH.aH.u();
                        cP2.m = n83 * -1220278451;
                        n82 = bH.aH.u();
                        cP2.l = n82 * -843099727;
                        n81 = bH.aH.v();
                        cP2.n = n81 * -753515983;
                        n84 = bH.aH.f();
                        cP2.h = (n84 + bH.S * 1026470457) * -607885345;
                        int n87 = bH.aH.F();
                        cP2.g = (n87 + bH.S * 1026470457) * 1210315727;
                        int n88 = bH.aH.t();
                        cP2.p = n88 * 884983917;
                        cP2.s = -519240193;
                        cP2.t = 0;
                    }
                    if ((n86 & 4) != 0) {
                        cP2.R = bH.aH.s() * 72414077;
                        cP2.S = bH.aH.s() * 246722269;
                    }
                    if ((n86 & 32) != 0) {
                        n85 = bH.aH.F();
                        bR bR3 = (bR)bU.a(cZ.b(-102), bH.aH.t(), 1937910734);
                        n82 = bH.aH.u() == 1 ? 1 : 0;
                        n81 = bH.aH.u();
                        n76 = bH.aH.h * 1736753585;
                        if (cP2.aF != null && cP2.aJ != null) {
                            n84 = 0;
                            if (bR3.d && aj.a(cP2.aF)) {
                                n84 = 1;
                            }
                            if (n84 == 0 && bH.ca * -246740433 == 0 && !cP2.aI) {
                                int n89;
                                Object object6;
                                bH.au.h = 0;
                                bH.aH.a(bH.au.g, 0, n81);
                                bH.au.h = 0;
                                cY cY3 = bH.au;
                                try {
                                    n89 = cY3.q();
                                    if (n89 > 32767) {
                                        n89 = 32767;
                                    }
                                    byte[] arrby = new byte[n89];
                                    cY3.h += ab.a.a(cY3.g, cY3.h * 1736753585, arrby, 0, n89, -1359249603) * 1303963473;
                                    object6 = object = (Object)aV.a(arrby, 0, n89, 1622614080);
                                }
                                catch (Exception var49_268) {
                                    object6 = "Cabbage";
                                }
                                object6 = dc.b(aC.a((String)object6, 1332945648));
                                cP2.H = object6.trim();
                                cP2.K = (n85 >> 8) * 1394262111;
                                cP2.L = (n85 & 255) * 856626875;
                                cP2.J = 2010966242;
                                cP2.c = n82;
                                boolean bl14 = cP2.I = cP.ar != cP2 && bR3.d && bH.dY != "" && object6.toLowerCase().indexOf(bH.dY) == -1;
                                if (bR3.c) {
                                    n89 = n82 != 0 ? 91 : 1;
                                } else {
                                    int n90 = n89 = n82 != 0 ? 90 : 2;
                                }
                                if (bR3.b * 1684664313 != -1) {
                                    bn.a(n89, bp.a(bR3.b * 1684664313) + cP2.aF, (String)object6);
                                } else {
                                    bn.a(n89, cP2.aF, (String)object6);
                                }
                            }
                        }
                        bH.aH.h = (n76 + n81) * 1303963473;
                    }
                    if ((n86 & 16) != 0) {
                        n74 = bH.aH.s();
                        if (n74 == 65535) {
                            n74 = -1;
                        }
                        n73 = bH.aH.t();
                        dx.a(cP2, n74, n73, -17);
                    }
                    if ((n86 & 512) == 0) continue;
                    n85 = bH.aH.F();
                    n83 = bH.aH.d();
                    cP2.a(n85, n83, bH.S * 1026470457);
                    cP2.P = bH.S * 1810132455 - 2012164012;
                    cP2.e = bH.aH.v() * -1158152579;
                    cP2.f = bH.aH.u() * 1033095941;
                }
                for (n77 = 0; n77 < bH.cj * -807159549; ++n77) {
                    n72 = bH.ck[n77];
                    if (bH.cb[n72].ad * 354830915 == bH.S * 1026470457) continue;
                    bH.cb[n72] = null;
                }
                if (bH.aH.h * 1736753585 != bH.aI * 1964753529) {
                    throw new RuntimeException("" + bH.aH.h * 1736753585 + aB.c + bH.aI * 1964753529);
                }
                for (n77 = 0; n77 < bH.cc * -796710281; ++n77) {
                    if (bH.cb[bH.cd[n77]] != null) continue;
                    throw new RuntimeException("" + n77 + aB.c + bH.cc * -796710281);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 182) {
                bH.eA = true;
                w.b = bH.aH.d() * -2125036847;
                aw.a = bH.aH.d() * -844963033;
                cz.a = bH.aH.f() * -862136053;
                ba.a = bH.aH.d() * 1473239971;
                cQ.g = bH.aH.d() * 1052421375;
                if (cQ.g * 1935430399 >= 100) {
                    c.f = 50846400 + w.b * -1021657728;
                    q.b = aw.a * 2037303424 - 1907030592;
                    cD.a = (c.a(c.f * -1967123133, q.b * 681386919, u.d * -1093536619, -1847964236) - cz.a * -984470877) * 653219559;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 155) {
                bH.eA = false;
                for (int i15 = 0; i15 < 5; ++i15) {
                    bH.eB[i15] = false;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 154) {
                String string = bH.aH.l();
                Object[] arrobject = new Object[string.length() + 1];
                for (int i16 = string.length() - 1; i16 >= 0; --i16) {
                    if (string.charAt(i16) == 's') {
                        arrobject[i16 + 1] = bH.aH.l();
                        continue;
                    }
                    arrobject[1 + i16] = bH.aH.i();
                }
                arrobject[0] = bH.aH.i();
                dj dj2 = new dj();
                dj2.a = arrobject;
                cZ.a(dj2);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 246) {
                String string = bH.aH.l();
                new Thread(new cM(string)).start();
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 24) {
                bH.em = bH.aH.d() * -2075522063;
                if (bH.em * -1846442735 == 255) {
                    bH.em = 0;
                }
                if ((bH.en = bH.aH.d() * -700155223) * -1524315751 == 255) {
                    bH.en = 0;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 4) {
                int n91 = bH.aH.u();
                int n92 = bH.aH.v();
                int n93 = bH.aH.d();
                u.d = (n93 >> 1) * 1191917245;
                cP.ar.a(n91, n92, (n93 & 1) == 1, 14);
                bH.aJ = -426797213;
                System.out.printf("var41: %d, var3: %d, var43: %d", n91, n92, n93);
                return true;
            }
            if (bH.aJ * -2146869835 == 172) {
                int n94 = bH.aH.C();
                cZ cZ11 = aK.a(n94);
                cZ11.ae = -1678620333;
                cZ11.af = cP.ar.aJ.a(899129507) * 999821601;
                bw.a(cZ11);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 47) {
                int n95;
                int n96 = bH.aH.F();
                I.i[n96] = n95 = bH.aH.E();
                if (I.j[n96] != n95) {
                    I.j[n96] = n95;
                    am.a(n96, -15508);
                }
                bH.dr[(bH.ds -= 1071090989) * -539970213 - 1 & 31] = n96;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 106) {
                bH.eo = bH.aH.d() * -713504813;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 242) {
                boolean bl15;
                boolean bl16 = bl15 = bH.aH.d() == 1;
                if (bl15) {
                    bg.e = (C.a(255) - bH.aH.j()) * 1300896244636982313L;
                    aj.j = new dA(bH.aH);
                } else {
                    aj.j = null;
                }
                bH.dB = bH.dq * 554463163;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 144) {
                int n97 = bH.aH.t();
                bH.fk = n97 * -559168027;
                int n98 = bH.aH.d();
                bt.c = n98 * 1231171733;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 250) {
                bH.dW = bH.aH.d() * -1443662223;
                bH.dX = bH.aH.d() * 1525861331;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 89) {
                int n99 = bH.aH.f();
                bZ bZ3 = (bZ)bZ.e.a(n99);
                if (bZ3 != null) {
                    bZ3.m();
                }
                bH.dt[(bH.du += 1158399665) * -84622767 - 1 & 31] = n99 & 32767;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 173) {
                for (int i17 = 0; i17 < I.j.length; ++i17) {
                    if (I.j[i17] == I.i[i17]) continue;
                    I.j[i17] = I.i[i17];
                    am.a(i17, -5444);
                    bH.dr[(bH.ds -= 1071090989) * -539970213 - 1 & 31] = i17;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 174) {
                int n100 = bH.aH.i();
                int n101 = bH.aH.y();
                cZ cZ12 = aK.a(n100);
                if (cZ12 != null && cZ12.s * -1878336627 == 0) {
                    if (n101 > cZ12.F * -124837617 - cZ12.by * 539675235) {
                        n101 = cZ12.F * -124837617 - cZ12.by * 539675235;
                    }
                    if (n101 < 0) {
                        n101 = 0;
                    }
                    if (cZ12.bC * -650026719 != n101) {
                        cZ12.bC = n101 * 1811636961;
                        bw.a(cZ12);
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 31) {
                while (bH.aH.h * 1736753585 < bH.aI * 1964753529) {
                    bE bE2;
                    int n102 = bH.aH.d();
                    boolean bl17 = (n102 & 1) == 1;
                    String string = bH.aH.l();
                    String string7 = bH.aH.l();
                    bH.aH.l();
                    for (int i18 = 0; i18 < bH.eX * 601840989; ++i18) {
                        bE2 = bH.eY[i18];
                        if (bl17) {
                            if (!string7.equals(bE2.f)) continue;
                            bE2.f = string;
                            bE2.b = string7;
                            string = null;
                            break;
                        }
                        if (!string.equals(bE2.f)) continue;
                        bE2.f = string;
                        bE2.b = string7;
                        string = null;
                        break;
                    }
                    if (string == null || bH.eX * 601840989 >= 400) continue;
                    bH.eY[bH.eX * 601840989] = bE2 = new bE();
                    bE2.f = string;
                    bE2.b = string7;
                    bH.eX += 1879695093;
                }
                bH.dy = bH.dq * 1609802529;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 198) {
                dC dC2 = new dC();
                dC2.a = bH.aH.l();
                dC2.c = bH.aH.f() * -469751453;
                int n103 = bH.aH.i();
                dC2.d = n103 * 1718530509;
                bn.a(45);
                bH.fd.c();
                bH.fd = null;
                bG.a(dC2);
                bH.aJ = -426797213;
                return false;
            }
            if (bH.aJ * -2146869835 == 161) {
                cY.e = v.a(bH.aH.d(), 1205);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 139) {
                if (bH.cR * 1787246131 != -1) {
                    aJ.a(bH.cR * 1787246131, 0);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 124) {
                cU.a(bH.aH, bH.aI * 1964753529, -711928237);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 99) {
                String string = bH.aH.l();
                long l11 = bH.aH.f();
                long l12 = bH.aH.h();
                bR bR4 = (bR)bU.a(cZ.b(-84), bH.aH.d(), 2080596118);
                long l13 = l12 + (l11 << 32);
                boolean bl18 = false;
                for (int i19 = 0; i19 < 100; ++i19) {
                    if (l13 != bH.dZ[i19]) continue;
                    bl18 = true;
                    break;
                }
                if (aj.a(string)) {
                    bl18 = true;
                }
                if (!bl18 && bH.ca * -246740433 == 0) {
                    String string8;
                    bH.dZ[bH.ea * 1965929751] = l13;
                    bH.ea = (1 + bH.ea * 1965929751) % 100 * -1112616281;
                    cJ cJ5 = bH.aH;
                    try {
                        String string9;
                        int n104 = cJ5.q();
                        if (n104 > 32767) {
                            n104 = 32767;
                        }
                        byte[] arrby = new byte[n104];
                        cJ5.h += ab.a.a(cJ5.g, cJ5.h * 1736753585, arrby, 0, n104, -1902021787) * 1303963473;
                        string8 = string9 = aV.a(arrby, 0, n104, 1821902210);
                    }
                    catch (Exception var50_272) {
                        string8 = "Cabbage";
                    }
                    string8 = dc.b(aC.a(string8, 1807110952));
                    object = bR4.c ? 7 : 3;
                    if (bR4.b * 1684664313 != -1) {
                        bn.a((int)object, bp.a(bR4.b * 1684664313) + string, string8);
                    } else {
                        bn.a((int)object, string, string8);
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 196) {
                cQ.a(true);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 136) {
                O.a(59);
                bH.aJ = -426797213;
                return false;
            }
            if (bH.aJ * -2146869835 == 190) {
                byte by2 = bH.aH.x();
                int n105 = bH.aH.F();
                I.i[n105] = by2;
                if (I.j[n105] != by2) {
                    I.j[n105] = by2;
                    am.a(n105, -13905);
                }
                bH.dr[(bH.ds -= 1071090989) * -539970213 - 1 & 31] = n105;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 107) {
                cZ cZ13;
                int n106 = bH.aH.E();
                int n107 = bH.aH.C();
                ce ce5 = (ce)bH.cS.a(n107);
                ce ce6 = (ce)bH.cS.a(n106);
                if (ce6 != null) {
                    dz.a(ce6, ce5 == null || ce6.a * -1385416029 != ce5.a * -1385416029, 1345746199);
                }
                if (ce5 != null) {
                    ce5.m();
                    bH.cS.a(ce5, n106);
                }
                if ((cZ13 = aK.a(n107)) != null) {
                    bw.a(cZ13);
                }
                if ((cZ13 = aK.a(n106)) != null) {
                    bw.a(cZ13);
                    aO.a(cZ.e[cZ13.bt * 1582464481 >>> 16], cZ13, true);
                }
                if (bH.cR * 1787246131 != -1) {
                    aJ.a(bH.cR * 1787246131, 1);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 231) {
                int n108 = bH.aH.f();
                if (n108 == 65535) {
                    n108 = -1;
                }
                dy.a(n108, -2036717338);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 175) {
                int n109 = bH.aH.s();
                if (n109 == 65535) {
                    n109 = -1;
                }
                int n110 = bH.aH.B();
                cU.a(n109, n110, -43);
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 135) {
                bH.al = bH.aH.f() * 772647426;
                bH.dC = bH.dq * 108236717;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 233) {
                String string;
                bH.K = string = bH.aH.l();
                try {
                    String string10 = bH.M.getParameter(bs.o.b);
                    String string11 = bH.M.getParameter(bs.p.b);
                    String string12 = string10 + "settings=" + string + "; version=1; path=/; domain=" + string11;
                    string12 = string.length() == 0 ? string12 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0" : string12 + "; Expires=" + c.a(C.a(255) + 94608000000L) + "; Max-Age=" + 94608000;
                    aX.a((Applet)bH.M, "document.cookie=\"" + string12 + "\"", -125);
                }
                catch (Throwable var39_205) {
                    // empty catch block
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 131) {
                bH.eA = true;
                ax.g = bH.aH.d() * 660111577;
                dB.b = bH.aH.d() * 690044465;
                t.o = bH.aH.f() * -766471883;
                cP.av = bH.aH.d() * -138722029;
                aS.b = bH.aH.d() * -1775269453;
                if (aS.b * -817214085 >= 100) {
                    int n111 = ax.g * 704623744 + 64;
                    int n112 = dB.b * -1750243200 + 64;
                    int n113 = c.a(n111, n112, u.d * -1093536619, -1847964236) - t.o * 276298013;
                    int n114 = n111 - c.f * -1967123133;
                    int n115 = n113 - cD.a * 113597655;
                    int n116 = n112 - q.b * 681386919;
                    int n117 = (int)Math.sqrt(n114 * n114 + n116 * n116);
                    bH.fg = ((int)(Math.atan2(n115, n117) * 325.949) & 2047) * 34393649;
                    aj.h = ((int)(Math.atan2(n114, n116) * -325.949) & 2047) * -112245797;
                    if (bH.fg * -1557542191 < 128) {
                        bH.fg = 107419776;
                    }
                    if (bH.fg * -1557542191 > 383) {
                        bH.fg = 287865679;
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 177) {
                String string = bH.aH.l();
                int n118 = bH.aH.f();
                byte by3 = bH.aH.e();
                boolean bl19 = false;
                if (by3 == -128) {
                    bl19 = true;
                }
                if (bl19) {
                    int n119;
                    if (bE.a * -1787316275 == 0) {
                        bH.aJ = -426797213;
                        return true;
                    }
                    boolean bl20 = false;
                    for (n119 = 0; !(n119 >= bE.a * -1787316275 || aM.b[n119].c.equals(string) && n118 == aM.b[n119].a * -206755573); ++n119) {
                    }
                    if (n119 < bE.a * -1787316275) {
                        while (n119 < bE.a * -1787316275 - 1) {
                            aM.b[n119] = aM.b[1 + n119];
                            ++n119;
                        }
                        aM.b[(bE.a -= 1168379141) * -1787316275] = null;
                    }
                } else {
                    int n120;
                    int n121;
                    bH.aH.l();
                    ct ct2 = new ct();
                    ct2.c = string;
                    ct2.d = aC.a(ct2.c, bH.O, -2130384532);
                    ct2.a = n118 * -1785505117;
                    ct2.b = by3;
                    for (n120 = bE.a * -1787316275 - 1; n120 >= 0; --n120) {
                        n121 = aM.b[n120].d.compareTo(ct2.d);
                        if (n121 == 0) {
                            aM.b[n120].a = n118 * -1785505117;
                            aM.b[n120].b = by3;
                            if (string.equals(cP.ar.aF)) {
                                bZ.d = by3;
                            }
                            bH.dz = bH.dq * 1312885291;
                            bH.aJ = -426797213;
                            return true;
                        }
                        if (n121 < 0) break;
                    }
                    if (bE.a * -1787316275 >= aM.b.length) {
                        bH.aJ = -426797213;
                        return true;
                    }
                    for (n121 = bE.a * -1787316275 - 1; n121 > n120; --n121) {
                        aM.b[1 + n121] = aM.b[n121];
                    }
                    if (bE.a * -1787316275 == 0) {
                        aM.b = new ct[100];
                    }
                    aM.b[1 + n120] = ct2;
                    bE.a += 1168379141;
                    if (string.equals(cP.ar.aF)) {
                        bZ.d = by3;
                    }
                }
                bH.dz = bH.dq * 1312885291;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 20) {
                int n122 = bH.aH.D();
                String string = bH.aH.l();
                try {
                    int n123 = n122 >> 16;
                    int n124 = n122 & 65535;
                    cZ cZ14 = null;
                    if (n123 == 399) {
                        if (n124 >= 16 && n124 <= 34) {
                            cZ14 = aK.a((int)26148871).p[n124 - 16];
                            if (string.equals("<DELETE>")) {
                                aK.a((int)26148871).p[n124 - 16] = null;
                                cZ14 = aK.a(n122);
                            }
                        } else {
                            cZ14 = n124 >= 35 && n124 <= 144 ? aK.a((int)26148872).p[n124 - 35] : (n124 >= 145 && n124 <= 157 ? aK.a((int)26148873).p[n124 - 146] : aK.a(n122));
                        }
                    } else {
                        cZ14 = aK.a(n122);
                    }
                    if (!string.equals(cZ14.U)) {
                        cZ14.U = string;
                        bw.a(cZ14);
                    }
                }
                catch (Exception var41_240) {
                    // empty catch block
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 80) {
                int n125 = bH.aH.A();
                int n126 = bH.aH.z();
                int n127 = bH.aH.C();
                cZ cZ15 = aK.a(n127);
                if (cZ15.v * 1254348635 != n126 || cZ15.w * 1905475965 != n125 || cZ15.av * 282167005 != 0 || cZ15.aw * -1554609611 != 0) {
                    cZ15.v = n126 * 1530429651;
                    cZ15.w = n125 * -1351876651;
                    cZ15.av = 0;
                    cZ15.aw = 0;
                    bw.a(cZ15);
                    aM.a(cZ15);
                    if (cZ15.s * -1878336627 == 0) {
                        aO.a(cZ.e[n127 >> 16], cZ15, false);
                    }
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 54) {
                bt.c = bH.aH.t() * 1231171733;
                bH.fk = bH.aH.u() * -559168027;
                for (int i20 = bt.c * -1886971203; i20 < 8 + bt.c * -1886971203; ++i20) {
                    for (int i21 = bH.fk * 616951789; i21 < 8 + bH.fk * 616951789; ++i21) {
                        if (bH.cq[u.d * -1093536619][i20][i21] == null) continue;
                        bH.cq[u.d * -1093536619][i20][i21] = null;
                        dy.b(i20, i21);
                    }
                }
                cr cr2 = (cr)bH.cr.g();
                while (cr2 != null) {
                    if (cr2.f * 754007907 >= bt.c * -1886971203 && cr2.f * 754007907 < bt.c * -1886971203 + 8 && cr2.j * 1618190275 >= bH.fk * 616951789 && cr2.j * 1618190275 < 8 + bH.fk * 616951789 && u.d * -1093536619 == cr2.a * -1806974757) {
                        cr2.o = 0;
                    }
                    cr2 = (cr)bH.cr.e();
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 253) {
                int n128 = bH.aH.f();
                if (n128 == 65535) {
                    n128 = -1;
                }
                cP.as = n128;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 26) {
                int n129 = bH.aH.d();
                if (bH.aH.d() == 0) {
                    bH.fc[n129] = new bK();
                    bH.aH.h += 1996506034;
                } else {
                    bH.aH.h -= 1303963473;
                    bH.fc[n129] = new bK(bH.aH, false);
                }
                bH.dA = bH.dq * -1454914357;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 115) {
                dj.a();
                bH.cW = bH.aH.d() * 1641176015;
                bH.dC = bH.dq * 108236717;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 142) {
                int n130 = bH.aH.y();
                int n131 = bH.aH.i();
                int n132 = bH.aH.F();
                cZ cZ16 = aK.a(n131);
                cZ16.bD = ((n130 << 16) + n132) * -999881371;
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 111) {
                int n133 = bH.aH.s();
                int n134 = bH.aH.E();
                cZ cZ17 = aK.a(n134);
                if (cZ17.ae * 1661118609 != 1 || n133 != cZ17.af * -982469919) {
                    cZ17.ae = -559540111;
                    cZ17.af = n133 * 999821601;
                    bw.a(cZ17);
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 181) {
                int n135 = bH.aH.i();
                ce ce7 = (ce)bH.cS.a(n135);
                if (ce7 != null) {
                    dz.a(ce7, true, 1345746199);
                }
                if (bH.cV != null) {
                    bw.a(bH.cV);
                    bH.cV = null;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 45) {
                int n136 = bH.aH.F();
                try {
                    bH.cR = n136 * -1855539973;
                    w.a(false, -101);
                    dB.a(n136);
                    cz.a(bH.cR * 1787246131, -1051839745);
                }
                catch (Exception var39_212) {
                    // empty catch block
                }
                for (int i22 = 0; i22 < 100; ++i22) {
                    bH.dL[i22] = true;
                }
                bH.aJ = -426797213;
                return true;
            }
            if (bH.aJ * -2146869835 == 28) {
                for (int i23 = 0; i23 < bU.b * -1601269221; ++i23) {
                    bU bU2 = bU.a(i23, -30);
                    if (bU2 == null) continue;
                    I.i[i23] = 0;
                    I.j[i23] = 0;
                }
                dj.a();
                bH.ds += 84826720;
                bH.aJ = -426797213;
                return true;
            }
            ba.a("" + bH.aJ * -2146869835 + aB.c + bH.aN * -1223323799 + aB.c + bH.aO * -1483162423 + aB.c + bH.aI * 1964753529, null, 1);
            O.a(122);
        }
        catch (IOException var3_2) {
            aP.a();
        }
        catch (Exception var3_3) {
            var3_3.printStackTrace();
            String string = "" + bH.aJ * -2146869835 + aB.c + bH.aN * -1223323799 + aB.c + bH.aO * -1483162423 + aB.c + bH.aI * 1964753529 + aB.c + (bw.c * -1719983039 + cP.ar.ah[0]) + aB.c + (cP.ar.ai[0] + ce.c * 803568843) + aB.c;
            for (int i24 = 0; i24 < bH.aI * 1964753529 && i24 < 50; ++i24) {
                string = string + bH.aH.g[i24] + aB.c;
            }
            ba.a(string, var3_3, 1);
            O.a(52);
        }
        return true;
    }

    static void a(int n2, int n3, int n4, cI cI2, int n5, int n6) {
        cs cs2 = new cs();
        cs2.f = n2 * -1603653567;
        cs2.c = n3 * -729203072;
        cs2.d = n4 * 1031704448;
        int n7 = cI2.f * 1832905927;
        int n8 = cI2.g * 1221908201;
        if (n5 == 1 || n5 == 3) {
            n7 = cI2.g * 1221908201;
            n8 = cI2.f * 1832905927;
        }
        cs2.h = (n7 + n3) * 1016622720;
        cs2.e = (n8 + n4) * 815341184;
        cs2.i = cI2.J * 136265569;
        cs2.j = cI2.K * 948119936;
        cs2.k = cI2.M * 1077586367;
        cs2.l = cI2.N * -1990256399;
        cs2.m = cI2.O;
        if (cI2.P != null) {
            cs2.a = cI2;
            cs2.a(112);
        }
        cs.o.a(cs2);
        if (cs2.m != null) {
            cs2.b = (cs2.k * 478375745 + (int)(Math.random() * (double)(cs2.l * 623135975 - cs2.k * 478375745))) * 55643609;
        }
    }

    static void a(int n2, int n3, int n4) {
        if (bH.es * 696556151 != 0 && n3 != 0 && bH.eu * 1104054789 < 50) {
            bH.ev[bH.eu * 1104054789] = n2;
            bH.ew[bH.eu * 1104054789] = n3;
            bH.ex[bH.eu * 1104054789] = n4;
            bH.ez[bH.eu * 1104054789] = null;
            bH.ey[bH.eu * 1104054789] = 0;
            bH.eu += 1213510349;
        }
    }

    public static dB b(int n2) {
        dB dB2 = (dB)dB.g.a(n2);
        if (dB2 != null) {
            return dB2;
        }
        byte[] arrby = dB.a.b(14, n2);
        dB2 = new dB();
        if (arrby != null) {
            dB2.a(new cY(arrby));
        }
        dB.g.a(dB2, n2);
        return dB2;
    }

    static final void a() {
        if (bH.ff != null) {
            bH.ff.b(2108784567);
        }
        if (dz.a != null) {
            dz.a.b(81692230);
        }
    }

    static final void a(byte by2) {
        for (int i2 = 0; i2 < bH.aD * 1974577941; ++i2) {
            int n2 = bH.aE[i2];
            cG cG2 = bH.aC[n2];
            if (cG2 == null) continue;
            bE.a(cG2);
        }
    }

    public static void c(int n2) {
        try {
            bg.g.a(1342412894);
            for (int i2 = 0; i2 < bg.b * 1014582983; ++i2) {
                aP.c[i2].a(1697522513);
            }
            bg.h.a(1680338613);
            bg.f.a(1839792503);
        }
        catch (Exception var1_2) {
            // empty catch block
        }
    }

    static final int a(int n2, int n3, byte by2) {
        if (n2 == -1) {
            return 12345678;
        }
        if ((n3 = (n2 & 127) * n3 / 128) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return n3 + (n2 & 65408);
    }
}

