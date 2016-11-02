/*
 * Decompiled with CFR 0_118.
 */
import java.applet.Applet;
import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class aF {
    static cX[] a;
    int b;
    int c;
    int d;
    int e;

    public static void a(a a2, a a3, int n2) {
        b.b = a2;
        b.c = a3;
    }

    aF(aF aF2) {
        this.b = aF2.b * 1;
        this.c = aF2.c * 1;
        this.d = aF2.d * 1;
        this.e = aF2.e * 1;
    }

    aF() {
    }

    static final void a(int n2, int n3, int n4, int n5, cX cX2, x x2, byte by2) {
        if (cX2 != null) {
            int n6 = bH.bf * 1847328669 + bH.bs * -1072839225 & 2047;
            int n7 = n5 * n5 + n4 * n4;
            if (n7 <= 6400) {
                int n8 = de.t[n6];
                int n9 = de.u[n6];
                n8 = n8 * 256 / (256 + bH.bh * 461573195);
                n9 = n9 * 256 / (256 + bH.bh * 461573195);
                int n10 = n9 * n4 + n5 * n8 >> 16;
                int n11 = n9 * n5 - n4 * n8 >> 16;
                if (n7 > 2500) {
                    cX2.a(n10 + x2.b * -2016633209 / 2 - cX2.b / 2, x2.c * -633411239 / 2 - n11 - cX2.d / 2, n2, n3, x2.b * -2016633209, x2.c * -633411239, x2.e, x2.d);
                } else {
                    cX2.b(n10 + n2 + x2.b * -2016633209 / 2 - cX2.b / 2, n3 + x2.c * -633411239 / 2 - n11 - cX2.d / 2);
                }
            }
        }
    }

    static final void a(byte by2) {
        block66 : {
            try {
                int n2;
                Object object;
                int n3;
                Object object2;
                if (bH.ay * 638704689 == 0) {
                    if (bH.fd != null) {
                        bH.fd.c();
                        bH.fd = null;
                    }
                    aT.c = null;
                    bH.aQ = false;
                    bH.az = 0;
                    bH.ay = 362544337;
                }
                if (bH.ay * 638704689 == 1) {
                    if (aT.c == null) {
                        aT.c = aK.c.a(C.a, dC.i * 751829209);
                    }
                    if (aT.c.f == 2) {
                        throw new IOException();
                    }
                    if (aT.c.f == 1) {
                        bH.fd = new dn((Socket)aT.c.d, aK.c);
                        aT.c = null;
                        bH.ay = 725088674;
                    }
                }
                if (bH.ay * 638704689 == 2) {
                    bH.aF.h = 0;
                    bH.aF.d(14);
                    bH.fd.b(bH.aF.g, 0, 1);
                    bH.aH.h = 0;
                    bH.ay = 1087633011;
                }
                if (bH.ay * 638704689 == 3) {
                    if (dz.a != null) {
                        dz.a.e();
                    }
                    if (bH.ff != null) {
                        bH.ff.e();
                    }
                    n3 = bH.fd.b();
                    if (dz.a != null) {
                        dz.a.e();
                    }
                    if (bH.ff != null) {
                        bH.ff.e();
                    }
                    if (n3 != 0) {
                        aP.a(n3);
                        return;
                    }
                    bH.aH.h = 0;
                    bH.ay = 1812721685;
                }
                if (bH.ay * 638704689 == 5) {
                    object = new int[]{(int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7), (int)(Math.random() * 9.9999999E7)};
                    bH.aF.h = 0;
                    bH.aF.d(1);
                    bH.aF.d(cQ.A.a(-914243711));
                    bH.aF.g(object[0]);
                    bH.aF.g(object[1]);
                    bH.aF.g(object[2]);
                    bH.aF.g((int)object[3]);
                    switch (cQ.A.f * 1595593885) {
                        case 0: {
                            bH.aF.g((Integer)ag.d.e.get(y.a(cQ.y)));
                            bH.aF.h += 920886596;
                            break;
                        }
                        case 1: {
                            bH.aF.h += 1841773192;
                            break;
                        }
                        case 2: 
                        case 3: {
                            bH.aF.f(bs.a * 1582697257);
                            bH.aF.h -= 2070117227;
                        }
                    }
                    bH.aF.a(cQ.z);
                    bH.aF.a(aA.d, aA.e);
                    bH.aG.h = 0;
                    if (bH.X * -684224463 == 40) {
                        bH.aG.d(18);
                    } else {
                        bH.aG.d(16);
                    }
                    bH.aG.e(0);
                    n3 = bH.aG.h * 1736753585;
                    bH.aG.g(91);
                    bH.aG.c(bH.aF.g, 0, bH.aF.h * 1736753585);
                    n2 = bH.aG.h * 1736753585;
                    bH.aG.a(cQ.y);
                    bH.aG.d((bH.R ? 1 : 0) << 1 | (bH.ae ? 1 : 0));
                    bH.aG.e(aJ.f * 2104430923);
                    bH.aG.e(aQ.a * -1064642111);
                    cT.a(bH.aG, -287563413);
                    bH.aG.a(bH.K);
                    bH.aG.g(bH.G * 742258379);
                    bH.aG.c(de.a(new int[26], new int[12], -12858125, 2, 7, 16, 16, 32, 32, -1, -1, 3, false), 0, 16);
                    object2 = new cY(bQ.b.b(-1738009259));
                    bQ.b.a((cY)object2, 1991591458);
                    bH.aG.c(object2.g, 0, object2.g.length);
                    bH.aG.d(bH.fo * 1424975117);
                    bH.aG.g(aM.a.a * -212693501);
                    bH.aG.g(m.a.a * -212693501);
                    bH.aG.g(bw.a.a * -212693501);
                    bH.aG.g(bw.b.a * -212693501);
                    bH.aG.g(bH.F.a * -212693501);
                    bH.aG.g(V.c.a * -212693501);
                    bH.aG.g(aG.g.a * -212693501);
                    bH.aG.g(am.o.a * -212693501);
                    bH.aG.g(dg.c.a * -212693501);
                    bH.aG.g(dj.l.a * -212693501);
                    bH.aG.g(bH.fh.a * -212693501);
                    bH.aG.g(bQ.d.a * -212693501);
                    bH.aG.g(dn.a.a * -212693501);
                    bH.aG.g(Q.a.a * -212693501);
                    bH.aG.g(dy.b.a * -212693501);
                    bH.aG.g(bH.E.a * -212693501);
                    bH.aG.c(bH.ft, 0, bH.ft.length);
                    bH.aG.v(bH.aG.h * 1736753585 - n3);
                    bH.fd.b(bH.aG.g, 0, bH.aG.h * 1736753585);
                    bH.aF.a((int[])object);
                    int n4 = 0;
                    while (n4 < 4) {
                        Object object3 = object;
                        int n5 = n4++;
                        object3[n5] = object3[n5] + 50;
                    }
                    bH.aH.a((int[])object);
                    bH.ay = -2119701274;
                }
                if (bH.ay * 638704689 == 6 && bH.fd.a() > 0) {
                    int n6 = bH.fd.b();
                    if (n6 == 21 && bH.X * -684224463 == 20) {
                        bH.ay = -1757156937;
                    } else if (n6 == 2) {
                        bH.ay = -1032068263;
                    } else {
                        if (n6 == 15 && bH.X * -684224463 == 40) {
                            aV.a(21061);
                            return;
                        }
                        if (n6 == 23 && bH.aA * -857753919 < 1) {
                            bH.aA -= 1937123007;
                            bH.ay = 0;
                        } else {
                            if (n6 != 29) {
                                aP.a(n6);
                                return;
                            }
                            bH.ay = -306979589;
                        }
                    }
                }
                if (bH.ay * 638704689 == 7 && bH.fd.a() > 0) {
                    bH.aB = (bH.fd.b() + 3) * -1274447284;
                    bH.ay = -1394612600;
                }
                if (bH.ay * 638704689 == 8) {
                    bH.az = 0;
                    dz.a(du.K, du.L, "" + bH.aB * -104756715 / 60 + du.M);
                    if ((bH.aB -= 265090365) * -104756715 <= 0) {
                        bH.ay = 0;
                    }
                    break block66;
                }
                if (bH.ay * 638704689 == 9 && bH.fd.a() >= 13) {
                    boolean bl2 = bH.fd.b() == 1;
                    bH.fd.a(bH.aH.g, 0, 4);
                    bH.aH.h = 0;
                    boolean bl3 = false;
                    if (bl2) {
                        n3 = bH.aH.a() << 24;
                        n3 |= bH.aH.a() << 16;
                        n3 |= bH.aH.a() << 8;
                        n3 |= bH.aH.a();
                        n2 = y.a(cQ.y);
                        if (ag.d.e.size() >= 10 && !ag.d.e.containsKey(n2)) {
                            Iterator iterator = ag.d.e.entrySet().iterator();
                            iterator.next();
                            iterator.remove();
                        }
                        ag.d.e.put(n2, n3);
                        cD.a(-1973222429);
                    }
                    bH.cY = bH.fd.b() * 381650523;
                    bH.cY = 763301046;
                    bH.da = bH.fd.b() == 1;
                    bH.ch = bH.fd.b() * -435565545;
                    bH.ch = (bH.ch * -1731449945 << 8) * -435565545;
                    bH.ch += bH.fd.b() * -435565545;
                    bH.ci = bH.fd.b() * -2078755183;
                    bH.fd.a(bH.aH.g, 0, 1);
                    bH.aH.h = 0;
                    bH.aJ = bH.aH.a() * 426797213;
                    bH.fd.a(bH.aH.g, 0, 2);
                    bH.aH.h = 0;
                    bH.aI = bH.aH.f() * 20645833;
                    if (bH.ci * -1090925967 == 1) {
                        try {
                            aX.a((Applet)bH.M, "zap", 405529889);
                        }
                        catch (Throwable var6_10) {}
                    } else {
                        try {
                            aX.a((Applet)bH.M, "unzap", -1944461525);
                        }
                        catch (Throwable var6_11) {
                            // empty catch block
                        }
                    }
                    bH.ay = -669523926;
                }
                if (bH.ay * 638704689 != 10) {
                    if (bH.ay * 638704689 == 11 && bH.fd.a() >= 2) {
                        bH.aH.h = 0;
                        bH.fd.a(bH.aH.g, 0, 2);
                        bH.aH.h = 0;
                        aH.c = bH.aH.f() * -184802271;
                        bH.ay = 55564748;
                    }
                    if (bH.ay * 638704689 == 12 && bH.fd.a() >= aH.c * -42180639) {
                        bH.aH.h = 0;
                        bH.fd.a(bH.aH.g, 0, aH.c * -42180639);
                        bH.aH.h = 0;
                        object = bH.aH.l();
                        object2 = bH.aH.l();
                        String string = bH.aH.l();
                        dz.a((String)object, (String)object2, string);
                        bn.a(10);
                    }
                    if ((bH.az += 355091295) * -1088890721 > 2000) {
                        if (bH.aA * -857753919 < 1) {
                            dC.i = dC.i * 751829209 == c.e * -1805689375 ? bT.b * 191036863 : c.e * 471081033;
                            bH.aA -= 1937123007;
                            bH.ay = 0;
                        } else {
                            aP.a(-3);
                        }
                    }
                } else if (bH.fd.a() >= bH.aI * 1964753529) {
                    int n7;
                    bH.aH.h = 0;
                    bH.fd.a(bH.aH.g, 0, bH.aI * 1964753529);
                    bH.ag = -2561770266170829527L;
                    bH.aj = -1183622521;
                    bE.c.d = 0;
                    c.b = true;
                    bH.ak = true;
                    bH.ee = 1468476784576452353L;
                    O.b = new cu();
                    bH.aF.h = 0;
                    bH.aH.h = 0;
                    bH.aJ = -426797213;
                    bH.aM = 1437130987;
                    bH.aN = 1540362023;
                    bH.aO = 1844699783;
                    bH.aK = 0;
                    bH.al = 0;
                    bH.aP = 0;
                    bH.am = 0;
                    bH.cz = 0;
                    bH.cy = false;
                    cb.a(0, 1190760194);
                    r.a(-455257838);
                    bH.cK = 0;
                    bH.cM = false;
                    bH.eu = 0;
                    bH.aY = ((int)(Math.random() * 100.0) - 50) * -1699939609;
                    bH.ba = ((int)(Math.random() * 110.0) - 55) * -799120519;
                    bH.bc = ((int)(Math.random() * 80.0) - 40) * 1670501287;
                    bH.bf = ((int)(Math.random() * 120.0) - 60) * 1936293557;
                    bH.bh = ((int)(Math.random() * 30.0) - 20) * 598826339;
                    bH.bs = ((int)(Math.random() * 20.0) - 10 & 2047) * -1768657929;
                    bH.eo = 0;
                    bH.eh = -1611844029;
                    bH.em = 0;
                    bH.en = 0;
                    bH.av = cS.d;
                    bH.aw = cS.d;
                    bH.cc = 0;
                    bH.aD = 0;
                    for (n7 = 0; n7 < 2048; ++n7) {
                        bH.cb[n7] = null;
                        bH.cg[n7] = null;
                    }
                    for (n7 = 0; n7 < 32768; ++n7) {
                        bH.aC[n7] = null;
                    }
                    cP.ar = bH.cb[2047] = new cP();
                    bH.cp = 787648439;
                    bH.cs.a();
                    bH.ct.a();
                    for (n7 = 0; n7 < 4; ++n7) {
                        for (n3 = 0; n3 < 104; ++n3) {
                            for (n2 = 0; n2 < 104; ++n2) {
                                bH.cq[n7][n3][n2] = null;
                            }
                        }
                    }
                    bH.cr = new bA();
                    bH.eU = 0;
                    bH.eT = 0;
                    bH.eX = 0;
                    for (n7 = 0; n7 < bU.b * -1601269221; ++n7) {
                        object = bU.a(n7, -117);
                        if (object == null) continue;
                        I.i[n7] = 0;
                        I.j[n7] = 0;
                    }
                    for (n7 = 0; n7 < bH.dD.length; ++n7) {
                        bH.dD[n7] = -1;
                    }
                    bH.cZ = -1834997571;
                    if (bH.cR * 1787246131 != -1) {
                        br.a(bH.cR * 1787246131);
                    }
                    object = (ce)bH.cS.a();
                    while (object != null) {
                        dz.a((ce)object, true, 1345746199);
                        object = (ce)bH.cS.b();
                    }
                    bH.cR = 1855539973;
                    bH.cS = new bP(8);
                    bH.cV = null;
                    bH.cy = false;
                    bH.cz = 0;
                    bH.eZ.a(null, new int[]{0, 0, 0, 0, 0}, false, -1);
                    for (n7 = 0; n7 < 8; ++n7) {
                        bH.cm[n7] = null;
                        bH.cn[n7] = false;
                    }
                    bh.a();
                    bH.af = true;
                    for (n7 = 0; n7 < 100; ++n7) {
                        bH.dL[n7] = true;
                    }
                    bH.aF.a(141);
                    bH.aF.d(cq.e(889111020));
                    bH.aF.e(aJ.f * 2104430923);
                    bH.aF.e(aQ.a * -1064642111);
                    bH.ef = null;
                    bE.a = 0;
                    aM.b = null;
                    for (n7 = 0; n7 < 8; ++n7) {
                        bH.fc[n7] = new bK();
                    }
                    aj.j = null;
                    c.c = 1338229385;
                    cO.a(false);
                    bH.aJ = -426797213;
                }
            }
            catch (IOException var1_14) {
                if (bH.aA * -857753919 < 1) {
                    dC.i = c.e * -1805689375 == dC.i * 751829209 ? bT.b * 191036863 : c.e * 471081033;
                    bH.aA -= 1937123007;
                    bH.ay = 0;
                }
                aP.a(-2);
            }
        }
    }
}

