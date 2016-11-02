/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;

public final class aW {
    ac a = null;
    ac b = null;
    int c = 1337053704;
    int d;
    static byte[] e = new byte[520];

    static final void a(int n2, int n3, int n4, int n5, String string, String string2, int n6, int n7, byte by2) {
        int n8;
        cP cP2;
        cG cG2;
        int n9;
        cZ cZ2;
        if (n4 >= 2000) {
            n4 -= 2000;
        }
        if (n4 == 4) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(6);
            bH.aF.e(n5 >> 14 & 32767);
            bH.aF.d(cb.e[82] ? 1 : 0);
            bH.aF.l(n3 + ce.c * 803568843);
            bH.aF.l(n2 + bw.c * -1719983039);
        }
        if (n4 == 21) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(155);
            bH.aF.n(n5);
            bH.aF.l(bw.c * -1719983039 + n2);
            bH.aF.e(n3 + ce.c * 803568843);
            bH.aF.d(cb.e[82] ? 1 : 0);
        }
        if (n4 == 20) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(12);
            bH.aF.e(n3 + ce.c * 803568843);
            bH.aF.p(cb.e[82] ? 1 : 0);
            bH.aF.e(n5);
            bH.aF.e(n2 + bw.c * -1719983039);
        }
        if (n4 == 1) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(150);
            bH.aF.q(aB.a * 2106654977);
            bH.aF.o(bQ.c * -1356904377);
            bH.aF.n(n5 >> 14 & 32767);
            bH.aF.d(cb.e[82] ? 1 : 0);
            bH.aF.q(ce.c * 803568843 + n3);
            bH.aF.e(D.a * -1072007021);
            bH.aF.n(bw.c * -1719983039 + n2);
        }
        if (n4 == 39) {
            bH.aF.a(123);
            bH.aF.n(n2);
            bH.aF.g(n3);
            bH.aF.q(n5);
            bH.bS = 0;
            aZ.a = aK.a(n3);
            bH.bT = n2 * -1530235251;
        }
        if (n4 == 47 && (cP2 = bH.cb[n5]) != null) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(56);
            bH.aF.d(cb.e[82] ? 1 : 0);
            bH.aF.e(n5);
        }
        if (n4 == 40) {
            bH.aF.a(200);
            bH.aF.e(n5);
            bH.aF.q(n2);
            bH.aF.i(n3);
            bH.bS = 0;
            aZ.a = aK.a(n3);
            bH.bT = n2 * -1530235251;
        }
        if (n4 == 10 && (cG2 = bH.aC[n5]) != null) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(254);
            bH.aF.p(cb.e[82] ? 1 : 0);
            bH.aF.l(n5);
        }
        if (n4 == 1002) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.aF.a(213);
            bH.aF.n(n5 >> 14 & 32767);
        }
        if (n4 == 29) {
            bH.aF.a(34);
            bH.aF.g(n3);
            cZ2 = aK.a(n3);
            if (cZ2.E != null && cZ2.E[0][0] == 5 && I.j[n8 = cZ2.E[0][1]] != cZ2.D[0]) {
                I.j[n8] = cZ2.D[0];
                am.a(n8, 4754);
            }
        }
        if (n4 == 11 && (cG2 = bH.aC[n5]) != null) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(31);
            bH.aF.l(n5);
            bH.aF.d(cb.e[82] ? 1 : 0);
        }
        if (n4 == 13 && (cG2 = bH.aC[n5]) != null) {
            bH.bO = n6 * 1315483603;
            bH.bP = n7 * -613726713;
            bH.bR = -1136925898;
            bH.bQ = 0;
            bH.em = n2 * -2075522063;
            bH.en = n3 * -700155223;
            bH.aF.a(139);
            bH.aF.s(cb.e[82] ? 1 : 0);
            bH.aF.l(n5);
        }
        if (n4 == 34) {
            bH.aF.a(122);
            bH.aF.l(n2);
            bH.aF.u(n3);
            bH.aF.n(n5);
            bH.bS = 0;
            aZ.a = aK.a(n3);
            bH.bT = n2 * -1530235251;
        }
        if (n4 == 25) {
            cZ2 = aK.b(n3, n2, -7192);
            if (cZ2 != null) {
                bz.a(255);
                n9 = bH.a(cZ2);
                n8 = n9 >> 11 & 63;
                int n10 = cZ2.bG * -181409537;
                cZ cZ3 = aK.b(n3, n2, -3655);
                if (cZ3 != null && cZ3.aW != null) {
                    dj dj2 = new dj();
                    dj2.e = cZ3;
                    dj2.a = cZ3.aW;
                    cZ.a(dj2);
                }
                bH.cO = n10 * 2106201685;
                bH.cM = true;
                aS.a = n3 * 604877399;
                bH.cN = n2 * -1832237769;
                cC.c = n8 * 1733312341;
                bw.a(cZ3);
                bH.cK = 0;
                int n11 = bH.a(cZ2);
                int n12 = n11 >> 11 & 63;
                String string3 = n12 == 0 ? null : (cZ2.ak != null && cZ2.ak.trim().length() != 0 ? cZ2.ak : null);
                bH.cP = string3;
                if (bH.cP == null) {
                    bH.cP = "Null";
                }
                bH.cQ = cZ2.r ? cZ2.aJ + am.a(16777215) : am.a(65280) + cZ2.al + am.a(16777215);
            }
        } else {
            if (n4 == 58 && (cZ2 = aK.b(n3, n2, 14064)) != null) {
                bH.aF.a(224);
                bH.aF.n(n2);
                bH.aF.q(bH.cO * -1266010371);
                bH.aF.l(bH.cN * -1911127929);
                bH.aF.n(cZ2.bG * -181409537);
                bH.aF.u(aS.a * -464823961);
                bH.aF.i(n3);
            }
            if (n4 == 22) {
                bH.bO = n6 * 1315483603;
                bH.bP = n7 * -613726713;
                bH.bR = -1136925898;
                bH.bQ = 0;
                bH.em = n2 * -2075522063;
                bH.en = n3 * -700155223;
                bH.aF.a(252);
                bH.aF.n(bw.c * -1719983039 + n2);
                bH.aF.q(n3 + ce.c * 803568843);
                bH.aF.e(n5);
                bH.aF.p(cb.e[82] ? 1 : 0);
            }
            if ((n4 == 57 || n4 == 1007) && (cZ2 = aK.b(n3, n2, 21688)) != null) {
                bf.a(n5, n3, n2, cZ2.bG * -181409537, string2, -635196373);
            }
            if (n4 == 28) {
                bH.aF.a(34);
                bH.aF.g(n3);
                cZ2 = aK.a(n3);
                if (cZ2.E != null && cZ2.E[0][0] == 5) {
                    n8 = cZ2.E[0][1];
                    I.j[n8] = 1 - I.j[n8];
                    am.a(n8, -7179);
                }
            }
            if (n4 == 32) {
                bH.aF.a(3);
                bH.aF.g(n3);
                bH.aF.n(bH.cN * -1911127929);
                bH.aF.g(aS.a * -464823961);
                bH.aF.l(n2);
                bH.aF.l(n5);
                bH.bS = 0;
                aZ.a = aK.a(n3);
                bH.bT = n2 * -1530235251;
            }
            if (n4 == 2) {
                bH.bO = n6 * 1315483603;
                bH.bP = n7 * -613726713;
                bH.bR = -1136925898;
                bH.bQ = 0;
                bH.em = n2 * -2075522063;
                bH.en = n3 * -700155223;
                bH.aF.a(206);
                bH.aF.w(cb.e[82] ? 1 : 0);
                bH.aF.q(n3 + ce.c * 803568843);
                bH.aF.i(aS.a * -464823961);
                bH.aF.n(n5 >> 14 & 32767);
                bH.aF.q(n2 + bw.c * -1719983039);
                bH.aF.l(bH.cN * -1911127929);
            }
            if (n4 == 5) {
                bH.bO = n6 * 1315483603;
                bH.bP = n7 * -613726713;
                bH.bR = -1136925898;
                bH.bQ = 0;
                bH.em = n2 * -2075522063;
                bH.en = n3 * -700155223;
                bH.aF.a(94);
                bH.aF.l(n2 + bw.c * -1719983039);
                bH.aF.e(n3 + ce.c * 803568843);
                bH.aF.e(n5 >> 14 & 32767);
                bH.aF.p(cb.e[82] ? 1 : 0);
            }
            if (n4 == 44 && (cP2 = bH.cb[n5]) != null) {
                bH.bO = n6 * 1315483603;
                bH.bP = n7 * -613726713;
                bH.bR = -1136925898;
                bH.bQ = 0;
                bH.em = n2 * -2075522063;
                bH.en = n3 * -700155223;
                bH.aF.a(199);
                bH.aF.s(cb.e[82] ? 1 : 0);
                bH.aF.n(n5);
            }
            if (n4 == 38) {
                bz.a(255);
                cZ2 = aK.a(n3);
                bH.cK = 56079881;
                aB.a = n2 * -1552941311;
                bQ.c = n3 * 488235383;
                D.a = n5 * 1801282971;
                bw.a(cZ2);
                bH.cL = am.a(16748608) + bH.j((int)n5).f + am.a(16777215);
                if (bH.cL == null) {
                    bH.cL = "null";
                }
            } else {
                if (n4 == 48 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(175);
                    bH.aF.n(n5);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                }
                if (n4 == 23) {
                    cr.m.n(u.d * -1093536619, n2, n3);
                }
                if (n4 == 41) {
                    bH.aF.a(26);
                    bH.aF.g(n3);
                    bH.aF.l(n5);
                    bH.aF.l(n2);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 7 && (cG2 = bH.aC[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(132);
                    bH.aF.e(aB.a * 2106654977);
                    bH.aF.l(n5);
                    bH.aF.u(bQ.c * -1356904377);
                    bH.aF.q(D.a * -1072007021);
                    bH.aF.s(cb.e[82] ? 1 : 0);
                }
                if (n4 == 36) {
                    int n13 = 92;
                    bH.aF.a(88);
                    bH.aF.l(n5);
                    bH.aF.g(n3);
                    bH.aF.q(n2);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 46 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(229);
                    bH.aF.l(n5);
                    bH.aF.w(cb.e[82] ? 1 : 0);
                }
                if (n4 == 1003) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    cG2 = bH.aC[n5];
                    if (cG2 != null) {
                        cH cH2 = cG2.aq;
                        if (cH2.F != null) {
                            cH2 = cH2.a();
                        }
                        if (cH2 != null) {
                            bH.aF.a(130);
                            bH.aF.n(cH2.b * 1380254665);
                        }
                    }
                }
                if (n4 == 26) {
                    aA.a();
                }
                if (n4 == 9 && (cG2 = bH.aC[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(189);
                    bH.aF.n(n5);
                    bH.aF.w(cb.e[82] ? 1 : 0);
                }
                if (n4 == 8 && (cG2 = bH.aC[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(40);
                    bH.aF.n(bH.cN * -1911127929);
                    bH.aF.u(aS.a * -464823961);
                    bH.aF.d(cb.e[82] ? 1 : 0);
                    bH.aF.l(n5);
                }
                if (n4 == 35) {
                    bH.aF.a(212);
                    bH.aF.e(n2);
                    bH.aF.u(n3);
                    bH.aF.n(n5);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 1001) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(30);
                    bH.aF.q(n2 + bw.c * -1719983039);
                    bH.aF.n(ce.c * 803568843 + n3);
                    bH.aF.s(cb.e[82] ? 1 : 0);
                    bH.aF.e(n5 >> 14 & 32767);
                }
                if (n4 == 3) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(185);
                    bH.aF.l(n5 >> 14 & 32767);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                    bH.aF.e(n3 + ce.c * 803568843);
                    bH.aF.l(bw.c * -1719983039 + n2);
                }
                if (n4 == 19) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(2);
                    bH.aF.n(n5);
                    bH.aF.n(n3 + ce.c * 803568843);
                    bH.aF.q(bw.c * -1719983039 + n2);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                }
                if (n4 == 16) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(72);
                    bH.aF.e(D.a * -1072007021);
                    bH.aF.o(bQ.c * -1356904377);
                    bH.aF.n(n3 + ce.c * 803568843);
                    bH.aF.l(n5);
                    bH.aF.l(n2 + bw.c * -1719983039);
                    bH.aF.e(aB.a * 2106654977);
                    bH.aF.s(cb.e[82] ? 1 : 0);
                }
                if (n4 == 37) {
                    bH.aF.a(246);
                    bH.aF.l(n2);
                    bH.aF.q(n5);
                    bH.aF.g(n3);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 1004) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.aF.a(156);
                    bH.aF.l(n5);
                }
                if (n4 == 51 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(220);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                    bH.aF.e(n5);
                }
                if (n4 == 33) {
                    bH.aF.a(165);
                    bH.aF.l(n2);
                    bH.aF.e(n5);
                    bH.aF.i(n3);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 50 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(95);
                    bH.aF.d(cb.e[82] ? 1 : 0);
                    bH.aF.e(n5);
                }
                if (n4 == 18) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(186);
                    bH.aF.q(ce.c * 803568843 + n3);
                    bH.aF.s(cb.e[82] ? 1 : 0);
                    bH.aF.q(n2 + bw.c * -1719983039);
                    bH.aF.q(n5);
                }
                if (n4 == 45 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(237);
                    bH.aF.n(n5);
                    bH.aF.w(cb.e[82] ? 1 : 0);
                }
                if (n4 == 31) {
                    bH.aF.a(107);
                    bH.aF.i(n3);
                    bH.aF.q(n2);
                    bH.aF.l(aB.a * 2106654977);
                    bH.aF.q(n5);
                    bH.aF.l(D.a * -1072007021);
                    bH.aF.i(bQ.c * -1356904377);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 15 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(110);
                    bH.aF.e(bH.cN * -1911127929);
                    bH.aF.n(n5);
                    bH.aF.u(aS.a * -464823961);
                    bH.aF.d(cb.e[82] ? 1 : 0);
                }
                if (n4 == 12 && (cG2 = bH.aC[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(76);
                    bH.aF.w(cb.e[82] ? 1 : 0);
                    bH.aF.l(n5);
                }
                if (n4 == 14 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(37);
                    bH.aF.g(bQ.c * -1356904377);
                    bH.aF.q(n5);
                    bH.aF.e(aB.a * 2106654977);
                    bH.aF.s(cb.e[82] ? 1 : 0);
                    bH.aF.n(D.a * -1072007021);
                }
                if (n4 == 24) {
                    cZ2 = aK.a(n3);
                    n9 = 1;
                    if (cZ2.u * -202095703 > 0) {
                        n9 = (int)aT.a(cZ2, -3) ? 1 : 0;
                    }
                    if (n9 != 0) {
                        bH.aF.a(34);
                        bH.aF.g(n3);
                    }
                }
                if (n4 == 49 && (cP2 = bH.cb[n5]) != null) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(218);
                    bH.aF.q(n5);
                    bH.aF.w(cb.e[82] ? 1 : 0);
                }
                if (n4 == 1005) {
                    cZ2 = aK.a(n3);
                    if (cZ2 != null && cZ2.I[n2] >= 100000) {
                        bn.a(27, "", "" + cZ2.I[n2] + " x " + bH.j((int)n5).f);
                    } else {
                        bH.aF.a(156);
                        bH.aF.l(n5);
                    }
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 6) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(24);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                    bH.aF.e(bw.c * -1719983039 + n2);
                    bH.aF.e(n5 >> 14 & 32767);
                    bH.aF.n(ce.c * 803568843 + n3);
                }
                if (n4 == 43) {
                    bH.aF.a(125);
                    bH.aF.e(n5);
                    bH.aF.l(n2);
                    bH.aF.u(n3);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 42) {
                    bH.aF.a(211);
                    bH.aF.n(n2);
                    bH.aF.g(n3);
                    bH.aF.n(n5);
                    bH.bS = 0;
                    aZ.a = aK.a(n3);
                    bH.bT = n2 * -1530235251;
                }
                if (n4 == 30 && bH.cV == null) {
                    aK.a(n3, n2, 4032);
                    bH.cV = aK.b(n3, n2, 4516);
                    bw.a(bH.cV);
                }
                if (n4 == 17) {
                    bH.bO = n6 * 1315483603;
                    bH.bP = n7 * -613726713;
                    bH.bR = -1136925898;
                    bH.bQ = 0;
                    bH.em = n2 * -2075522063;
                    bH.en = n3 * -700155223;
                    bH.aF.a(242);
                    bH.aF.g(aS.a * -464823961);
                    bH.aF.l(n2 + bw.c * -1719983039);
                    bH.aF.l(ce.c * 803568843 + n3);
                    bH.aF.n(n5);
                    bH.aF.e(bH.cN * -1911127929);
                    bH.aF.p(cb.e[82] ? 1 : 0);
                }
                if (bH.cK * -1710049223 != 0) {
                    bH.cK = 0;
                    bw.a(aK.a(bQ.c * -1356904377));
                }
                if (bH.cM) {
                    bz.a(255);
                }
                if (aZ.a != null && bH.bS * 756602047 == 0) {
                    bw.a(aZ.a);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public byte[] a(int n2) {
        ac ac2;
        ac ac3 = ac2 = this.a;
        synchronized (ac3) {
            try {
                if (this.b.c(-1606211368) < (long)(6 + n2 * 6)) {
                    return null;
                }
                this.b.a((long)(n2 * 6));
                this.b.a(e, 0, 6, -209747204);
                int n3 = (e[2] & 255) + ((e[0] & 255) << 16) + ((e[1] & 255) << 8);
                int n4 = ((e[4] & 255) << 8) + ((e[3] & 255) << 16) + (e[5] & 255);
                if (n3 < 0 || n3 > this.c * 1691233917) {
                    return null;
                }
                if (n4 <= 0 || (long)n4 > this.a.c(2081122554) / 520) {
                    return null;
                }
                byte[] arrby = new byte[n3];
                int n5 = 0;
                int n6 = 0;
                while (n5 < n3) {
                    if (n4 == 0) {
                        return null;
                    }
                    this.a.a((long)(n4 * 520));
                    int n7 = n3 - n5;
                    if (n7 > 512) {
                        n7 = 512;
                    }
                    this.a.a(e, 0, n7 + 8, -1449235454);
                    int n8 = ((e[0] & 255) << 8) + (e[1] & 255);
                    int n9 = (e[3] & 255) + ((e[2] & 255) << 8);
                    int n10 = ((e[5] & 255) << 8) + ((e[4] & 255) << 16) + (e[6] & 255);
                    int n11 = e[7] & 255;
                    if (n2 != n8 || n9 != n6 || this.d * 2050793387 != n11) {
                        return null;
                    }
                    if (n10 < 0 || (long)n10 > this.a.c(1027604024) / 520) {
                        return null;
                    }
                    for (int i2 = 0; i2 < n7; ++i2) {
                        arrby[n5++] = e[i2 + 8];
                    }
                    n4 = n10;
                    ++n6;
                }
                byte[] arrby2 = arrby;
                return arrby2;
            }
            catch (IOException var4_5) {
                return null;
            }
        }
    }

    public aW(int n2, ac ac2, ac ac3, int n3) {
        this.d = n2 * 530670339;
        this.a = ac2;
        this.b = ac3;
        this.c = n3 * 1585920725;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    boolean a(int n2, byte[] arrby, int n3, boolean bl2, int n4) {
        ac ac2;
        ac ac3 = ac2 = this.a;
        synchronized (ac3) {
            boolean bl3;
            try {
                int n5;
                if (bl2) {
                    if (this.b.c(2143349893) < (long)(6 + n2 * 6)) {
                        return false;
                    }
                    this.b.a((long)(n2 * 6));
                    this.b.a(e, 0, 6, 602160758);
                    n5 = ((e[3] & 255) << 16) + ((e[4] & 255) << 8) + (e[5] & 255);
                    if (n5 <= 0 || (long)n5 > this.a.c(1916476923) / 520) {
                        return false;
                    }
                } else {
                    n5 = (int)((this.a.c(-1167510203) + 519) / 520);
                    if (n5 == 0) {
                        n5 = 1;
                    }
                }
                aW.e[0] = (byte)(n3 >> 16);
                aW.e[1] = (byte)(n3 >> 8);
                aW.e[2] = (byte)n3;
                aW.e[3] = (byte)(n5 >> 16);
                aW.e[4] = (byte)(n5 >> 8);
                aW.e[5] = (byte)n5;
                this.b.a((long)(n2 * 6));
                this.b.b(e, 0, 6, 1769550700);
                int n6 = 0;
                int n7 = 0;
                while (n6 < n3) {
                    int n8;
                    int n9 = 0;
                    if (bl2) {
                        this.a.a((long)(n5 * 520));
                        try {
                            this.a.a(e, 0, 8, 295289594);
                        }
                        catch (EOFException var14_15) {
                            break;
                        }
                        n8 = (e[1] & 255) + ((e[0] & 255) << 8);
                        int n10 = (e[3] & 255) + ((e[2] & 255) << 8);
                        n9 = (e[6] & 255) + ((e[5] & 255) << 8) + ((e[4] & 255) << 16);
                        int n11 = e[7] & 255;
                        if (n8 != n2 || n7 != n10 || n11 != this.d * 2050793387) {
                            return false;
                        }
                        if (n9 < 0 || (long)n9 > this.a.c(-632127161) / 520) {
                            return false;
                        }
                    }
                    if (n9 == 0) {
                        bl2 = false;
                        n9 = (int)((this.a.c(680587379) + 519) / 520);
                        if (n9 == 0) {
                            ++n9;
                        }
                        if (n9 == n5) {
                            ++n9;
                        }
                    }
                    if (n3 - n6 <= 512) {
                        n9 = 0;
                    }
                    aW.e[0] = (byte)(n2 >> 8);
                    aW.e[1] = (byte)n2;
                    aW.e[2] = (byte)(n7 >> 8);
                    aW.e[3] = (byte)n7;
                    aW.e[4] = (byte)(n9 >> 16);
                    aW.e[5] = (byte)(n9 >> 8);
                    aW.e[6] = (byte)n9;
                    aW.e[7] = (byte)(this.d * 2050793387);
                    this.a.a((long)(n5 * 520));
                    this.a.b(e, 0, 8, 2066579113);
                    n8 = n3 - n6;
                    if (n8 > 512) {
                        n8 = 512;
                    }
                    this.a.b(arrby, n6, n8, 1871848158);
                    n6 += n8;
                    n5 = n9;
                    ++n7;
                }
                bl3 = true;
            }
            catch (IOException var9_9) {
                return false;
            }
            return bl3;
        }
    }

    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        ac ac2;
        ac ac3 = ac2 = this.a;
        synchronized (ac3) {
            if (n3 >= 0 && n3 <= this.c * 1691233917) {
                boolean bl2 = this.a(n2, arrby, n3, true, -218714770);
                if (!bl2) {
                    bl2 = this.a(n2, arrby, n3, false, 1054377071);
                }
                return bl2;
            }
            throw new IllegalArgumentException();
        }
    }

    static void a(s s2, s s3, s s4, boolean bl2, byte by2) {
        if (bl2) {
            cQ.j = (aJ.f * 2104430923 - bH.dT * 1386143757) / 2 * -1646540671;
            cQ.k = cQ.j * -2012744469 - 1809848210;
        }
        if (cQ.F) {
            av.a(s2, s3, 20);
        } else {
            char[] arrc;
            int n2;
            String string;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            String string2;
            int n8;
            String string3;
            int n9;
            Object object;
            int n10;
            int n11;
            int n12;
            int n13;
            int n14;
            if (bl2) {
                Z.a.a(cQ.j * -468945023, 0);
                cQ.d.a(382 + cQ.j * -468945023, 0);
                if (!bH.C) {
                    I.a.a(382 + cQ.j * -468945023 - I.a.c / 2, 18);
                }
            }
            if (bH.X * -684224463 == 0 || bH.X * -684224463 == 5) {
                int n15 = 20;
                s2.c(du.cZ, cQ.k * 23501379 + 180, 245 - n15, 16777215, -1);
                n12 = 253 - n15;
                dd.c(180 + cQ.k * 23501379 - 152, n12, 304, 34, 9179409);
                dd.c(180 + cQ.k * 23501379 - 151, n12 + 1, 302, 32, 0);
                dd.b(180 + cQ.k * 23501379 - 150, 2 + n12, cQ.s * -2136314695, 30, 9179409);
                dd.b(cQ.k * 23501379 + 180 - 150 + cQ.s * -2136314695, n12 + 2, 300 - cQ.s * -2136314695, 30, 0);
                s2.c(cQ.t, 180 + cQ.k * 23501379, 276 - n15, 16777215, -1);
            }
            if (bH.X * -684224463 == 20) {
                cQ.b.a(cQ.k * 23501379 + 180 - cQ.b.e / 2, 271 - cQ.b.f / 2);
                n3 = 211;
                s2.c(cQ.v, 180 + cQ.k * 23501379, n3, 16776960, 0);
                n14 = n3 + 15;
                s2.c(cQ.w, 180 + cQ.k * 23501379, n14, 16776960, 0);
                s2.c(cQ.x, cQ.k * 23501379 + 180, n14 += 15, 16776960, 0);
                n14 += 15;
                n14 += 10;
                if (cQ.u * -1261736495 != 4) {
                    s2.a(du.df, 180 + cQ.k * 23501379 - 110, n14, 16777215, 0);
                    n2 = 200;
                    String string4 = cQ.y;
                    while (s2.a(string4) > n2) {
                        string4 = string4.substring(0, string4.length() - 1);
                    }
                    s2.a(dc.b(string4), cQ.k * 23501379 + 180 - 70, n14, 16777215, 0);
                    n14 += 15;
                    string3 = du.dg;
                    string2 = cQ.z;
                    n6 = string2.length();
                    arrc = new char[n6];
                    for (n4 = 0; n4 < n6; ++n4) {
                        arrc[n4] = 42;
                    }
                    string = new String(arrc);
                    s2.a(string3 + string, 180 + cQ.k * 23501379 - 108, n14, 16777215, 0);
                    n14 += 15;
                }
            }
            if (bH.X * -684224463 == 10 || bH.X * -684224463 == 11) {
                cQ.b.a(cQ.k * 23501379, 171);
                if (cQ.u * -1261736495 == 0) {
                    n3 = 251;
                    s2.c(du.di, 180 + cQ.k * 23501379, n3, 16776960, 0);
                    n14 = n3 + 30;
                    n12 = cQ.k * 23501379 + 180 - 80;
                    n11 = 291;
                    cQ.c.a(n12 - 73, n11 - 20);
                    s2.a(du.dj, n12 - 73, n11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    n12 = cQ.k * 23501379 + 180 + 80;
                    cQ.c.a(n12 - 73, n11 - 20);
                    n3 = 357;
                    s2.a(du.dk, n12 - 73, n11 - 20, 144, 40, 16777215, 0, 1, 1, 0);
                    s3.c(du.dT, cQ.k * 23501379 + 180, n3, 16776960, 0);
                } else if (cQ.u * -1261736495 == 1) {
                    s2.c(du.db, cQ.k * 23501379 + 180, 211, 16776960, 0);
                    n3 = 236;
                    s2.c(cQ.v, cQ.k * 23501379 + 180, n3, 16777215, 0);
                    n14 = n3 + 15;
                    s2.c(cQ.w, cQ.k * 23501379 + 180, n14, 16777215, 0);
                    s2.c(cQ.x, 180 + cQ.k * 23501379, n14 += 15, 16777215, 0);
                    n14 += 15;
                    n12 = cQ.k * 23501379 + 180 - 80;
                    n11 = 321;
                    cQ.c.a(n12 - 73, n11 - 20);
                    s2.c(du.h, n12, n11 + 5, 16777215, 0);
                    n12 = 80 + cQ.k * 23501379 + 180;
                    cQ.c.a(n12 - 73, n11 - 20);
                    s2.c(du.dm, n12, 5 + n11, 16777215, 0);
                } else if (cQ.u * -1261736495 == 2) {
                    n3 = 211;
                    s2.c(cQ.v, 180 + cQ.k * 23501379, n3, 16776960, 0);
                    n14 = n3 + 15;
                    s2.c(cQ.w, cQ.k * 23501379 + 180, n14, 16776960, 0);
                    s2.c(cQ.x, 180 + cQ.k * 23501379, n14 += 15, 16776960, 0);
                    n14 += 15;
                    s2.a(du.df, 180 + cQ.k * 23501379 - 110, n14 += 10, 16777215, 0);
                    n2 = 200;
                    String string5 = cQ.y;
                    while (s2.a(string5) > n2) {
                        string5 = string5.substring(1);
                    }
                    s2.a(dc.b(string5) + (cQ.C * -763095547 == 0 & bH.S * 1026470457 % 40 < 20 ? new StringBuilder().append(am.a(16776960)).append(aB.d).toString() : ""), 180 + cQ.k * 23501379 - 70, n14, 16777215, 0);
                    n14 += 15;
                    string3 = du.dg;
                    string2 = cQ.z;
                    n6 = string2.length();
                    arrc = new char[n6];
                    for (n4 = 0; n4 < n6; ++n4) {
                        arrc[n4] = 42;
                    }
                    string = new String(arrc);
                    s2.a(string3 + string + (cQ.C * -763095547 == 1 & bH.S * 1026470457 % 40 < 20 ? new StringBuilder().append(am.a(16776960)).append(aB.d).toString() : ""), 180 + cQ.k * 23501379 - 108, n14, 16777215, 0);
                    n14 += 15;
                    n8 = 180 + cQ.k * 23501379 - 80;
                    n5 = 321;
                    cQ.c.a(n8 - 73, n5 - 20);
                    s2.c(du.dl, n8, 5 + n5, 16777215, 0);
                    n8 = 80 + cQ.k * 23501379 + 180;
                    cQ.c.a(n8 - 73, n5 - 20);
                    s2.c(du.dm, n8, n5 + 5, 16777215, 0);
                    n3 = 357;
                    s3.c(du.dn, cQ.k * 23501379 + 180, n3, 16776960, 0);
                } else if (cQ.u * -1261736495 == 4) {
                    s2.c(du.dc, cQ.k * 23501379 + 180, 211, 16776960, 0);
                    n3 = 236;
                    s2.c(cQ.v, 180 + cQ.k * 23501379, n3, 16777215, 0);
                    n14 = n3 + 15;
                    s2.c(cQ.w, cQ.k * 23501379 + 180, n14, 16777215, 0);
                    s2.c(cQ.x, 180 + cQ.k * 23501379, n14 += 15, 16777215, 0);
                    n14 += 15;
                    String string6 = du.dh;
                    string3 = V.d;
                    n13 = string3.length();
                    char[] arrc2 = new char[n13];
                    for (n6 = 0; n6 < n13; ++n6) {
                        arrc2[n6] = 42;
                    }
                    String string7 = new String(arrc2);
                    s2.a(string6 + string7 + (bH.S * 1026470457 % 40 < 20 ? new StringBuilder().append(am.a(16776960)).append(aB.d).toString() : ""), 180 + cQ.k * 23501379 - 108, n14, 16777215, 0);
                    s2.a(du.j, 180 + cQ.k * 23501379 - 9, n14 -= 8, 16776960, 0);
                    s2.a(du.k, cQ.k * 23501379 + 180 - 9, n14 += 15, 16776960, 0);
                    n9 = 180 + cQ.k * 23501379 - 9 + s2.a(du.k) + 15;
                    n13 = n14 - s2.c;
                    object = cQ.B ? cS.c : cQ.a;
                    object.a(n9, n13);
                    n14 += 15;
                    n6 = 180 + cQ.k * 23501379 - 80;
                    n7 = 321;
                    cQ.c.a(n6 - 73, n7 - 20);
                    s2.c(du.h, n6, 5 + n7, 16777215, 0);
                    n6 = cQ.k * 23501379 + 180 + 80;
                    cQ.c.a(n6 - 73, n7 - 20);
                    s2.c(du.dm, n6, n7 + 5, 16777215, 0);
                    s3.c(du.dd, 180 + cQ.k * 23501379, n7 + 36, 255, 0);
                } else if (cQ.u * -1261736495 == 5) {
                    s2.c(du.do, 180 + cQ.k * 23501379, 201, 16776960, 0);
                    n3 = 221;
                    s4.c(cQ.v, cQ.k * 23501379 + 180, n3, 16776960, 0);
                    n14 = n3 + 15;
                    s4.c(cQ.w, cQ.k * 23501379 + 180, n14, 16776960, 0);
                    s4.c(cQ.x, 180 + cQ.k * 23501379, n14 += 15, 16776960, 0);
                    n14 += 15;
                    s2.a(du.dp, cQ.k * 23501379 + 180 - 145, n14 += 14, 16777215, 0);
                    n2 = 174;
                    String string8 = cQ.y;
                    while (s2.a(string8) > n2) {
                        string8 = string8.substring(1);
                    }
                    s2.a(dc.b(string8) + (bH.S * 1026470457 % 40 < 20 ? new StringBuilder().append(am.a(16776960)).append(aB.d).toString() : ""), 180 + cQ.k * 23501379 - 34, n14, 16777215, 0);
                    n14 += 15;
                    n10 = 180 + cQ.k * 23501379 - 80;
                    int n16 = 321;
                    cQ.c.a(n10 - 73, n16 - 20);
                    s2.c(du.dq, n10, 5 + n16, 16777215, 0);
                    n10 = 180 + cQ.k * 23501379 + 80;
                    cQ.c.a(n10 - 73, n16 - 20);
                    s2.c(du.dr, n10, 5 + n16, 16777215, 0);
                } else if (cQ.u * -1261736495 == 6) {
                    n3 = 211;
                    s2.c(cQ.v, cQ.k * 23501379 + 180, n3, 16776960, 0);
                    n14 = n3 + 15;
                    s2.c(cQ.w, cQ.k * 23501379 + 180, n14, 16776960, 0);
                    s2.c(cQ.x, 180 + cQ.k * 23501379, n14 += 15, 16776960, 0);
                    n14 += 15;
                    n12 = cQ.k * 23501379 + 180;
                    n11 = 321;
                    cQ.c.a(n12 - 73, n11 - 20);
                    s2.c(du.dr, n12, n11 + 5, 16777215, 0);
                }
            }
            if (cQ.q * -2057645811 > 0 && !bH.A) {
                aR.a(cQ.q * -2057645811, 626868295);
                cQ.q = 0;
            }
            n3 = 256;
            if (cQ.m * 948700643 > 0) {
                for (n12 = 0; n12 < 256; ++n12) {
                    aQ.c[n12] = cQ.m * 948700643 > 768 ? r.a(ay.n[n12], dC.e[n12], 1024 - cQ.m * 948700643, -2067546620) : (cQ.m * 948700643 > 256 ? dC.e[n12] : r.a(dC.e[n12], ay.n[n12], 256 - cQ.m * 948700643, -562867895));
                }
            } else if (cQ.n * -476800185 > 0) {
                for (n12 = 0; n12 < 256; ++n12) {
                    aQ.c[n12] = cQ.n * -476800185 > 768 ? r.a(ay.n[n12], cS.a[n12], 1024 - cQ.n * -476800185, -473723166) : (cQ.n * -476800185 > 256 ? cS.a[n12] : r.a(cS.a[n12], ay.n[n12], 256 - cQ.n * -476800185, -1076935946));
                }
            } else {
                for (n12 = 0; n12 < 256; ++n12) {
                    aQ.c[n12] = ay.n[n12];
                }
            }
            dd.g(cQ.j * -468945023, 9, 128 + cQ.j * -468945023, 7 + n3);
            Z.a.a(cQ.j * -468945023, 0);
            dd.f();
            n12 = 0;
            n11 = cQ.j * -468945023 + ba.b.b * -822155747;
            for (n10 = 1; n10 < n3 - 1; ++n10) {
                n5 = (n3 - n10) * cQ.l[n10] / n3;
                n9 = 22 + n5;
                if (n9 < 0) {
                    n9 = 0;
                }
                n12 += n9;
                for (n13 = n9; n13 < 128; ++n13) {
                    if ((n8 = av.d[n12++]) != 0) {
                        n6 = n8;
                        int n17 = 256 - n8;
                        n8 = aQ.c[n8];
                        n4 = ba.b.c[n11];
                        ba.b.c[n11++] = ((n8 & 16711935) * n6 + (n4 & 16711935) * n17 & -16711936) + ((n4 & 65280) * n17 + (n8 & 65280) * n6 & 16711680) >> 8;
                        continue;
                    }
                    ++n11;
                }
                n11 += n9 + ba.b.b * -568569227 - 128;
            }
            dd.g(cQ.j * -468945023 + 765 - 128, 9, 765 + cQ.j * -468945023, 7 + n3);
            if (bH.z) {
                cQ.d.a(382 + cQ.j * -468945023, 0);
            }
            dd.f();
            n12 = 0;
            n11 = cQ.j * -468945023 + ba.b.b * -822155747 + 24 + 637;
            for (n10 = 1; n10 < n3 - 1; ++n10) {
                n5 = (n3 - n10) * cQ.l[n10] / n3;
                n9 = 103 - n5;
                n11 += n5;
                for (n13 = 0; n13 < n9; ++n13) {
                    if ((n8 = av.d[n12++]) != 0) {
                        n6 = n8;
                        int n18 = 256 - n8;
                        n8 = aQ.c[n8];
                        n4 = ba.b.c[n11];
                        ba.b.c[n11++] = (n18 * (n4 & 65280) + n6 * (n8 & 65280) & 16711680) + (n6 * (n8 & 16711935) + (n4 & 16711935) * n18 & -16711936) >> 8;
                        continue;
                    }
                    ++n11;
                }
                n12 += 128 - n9;
                n11 += ba.b.b * -568569227 - n9 - n5;
            }
            O.a[ag.d.g ? 1 : 0].a(cQ.j * -468945023 + 765 - 40, 463);
            if (bH.X * -684224463 > 5 && bH.L * 1017874057 == 0) {
                if (dl.b != null) {
                    n14 = cQ.j * -468945023 + 5;
                    n2 = 463;
                    int n19 = 100;
                    n7 = 35;
                    dl.b.a(n14, n2);
                    if (bH.J * 1425499025 == 1) {
                        s2.c("Realism", n14 + n19 / 2, n2 + n7 / 2 - 2, 16777215, 0);
                    } else if (bH.J * 1425499025 == 2) {
                        s2.c("PvP", n14 + n19 / 2, n2 + n7 / 2 - 2, 16777215, 0);
                    } else if (bH.J * 1425499025 == 2) {
                        s2.c("Economy", n14 + n19 / 2, n2 + n7 / 2 - 2, 16777215, 0);
                    } else {
                        s2.c(du.dL + " " + bH.J * 1425499025, n14 + n19 / 2, n2 + n7 / 2 - 2, 16777215, 0);
                    }
                    if (cC.b != null) {
                        s3.c(du.dR, n14 + n19 / 2, 12 + n7 / 2 + n2, 16777215, 0);
                    } else {
                        s3.c(du.dS, n19 / 2 + n14, 12 + n7 / 2 + n2, 16777215, 0);
                    }
                } else {
                    dl.b = aj.a(dg.c, "sl_button", "", 96);
                }
            }
            try {
                object = aQ.b.getGraphics();
                ba.b.a((Graphics)object, 0, 0, 577474655);
            }
            catch (Exception var23_32) {
                aQ.b.repaint();
            }
        }
    }
}

