/*
 * Decompiled with CFR 0_118.
 */
import java.io.IOException;
import java.util.zip.CRC32;

public class an {
    static s a;
    static int b;

    static final void a(int n2, int n3, int n4, int n5, int n6) {
        int n8;
        int n7;
        if (bH.cK * -1710049223 == 0 && !bH.cM) {
            B.a(du.bZ, "", 23, 0, n2 - n4, n3 - n5);
        }
        int n9 = -1;
        int n10 = -1;
        for (n8 = 0; n8 < cB.G; ++n8) {
            int n11;
            Object object;
            Object object2;
            n7 = cB.af[n8];
            int n12 = n7 & 127;
            int n13 = n7 >> 7 & 127;
            int n14 = n7 >> 29 & 3;
            int n15 = n7 >> 14 & 32767;
            if (n10 == n7) continue;
            n10 = n7;
            if (n14 == 2 && cr.m.b(u.d * -1093536619, n12, n13, n7) >= 0) {
                void var13_17;
                cI cI2 = cI.a(n15);
                if (cI2.P != null) {
                    cI cI3 = cI2.c(-190961142);
                }
                if (var13_17 == null) continue;
                if (bH.cK * -1710049223 == 1) {
                    B.a(du.bU, bH.cL + " " + aB.g + " " + am.a(65535) + var13_17.c, 1, n7, n12, n13);
                } else if (bH.cM) {
                    if ((cC.c * 253871613 & 4) == 4) {
                        B.a(bH.cP, bH.cQ + " " + aB.g + " " + am.a(65535) + var13_17.c, 2, n7, n12, n13);
                    }
                } else {
                    object2 = var13_17.Q;
                    if (bH.dc) {
                        object2 = aC.a((String[])object2);
                    }
                    if (object2 != null) {
                        for (n11 = 4; n11 >= 0; --n11) {
                            if (object2[n11] == null) continue;
                            object = false;
                            if (n11 == 0) {
                                object = 3;
                            }
                            if (n11 == 1) {
                                object = 4;
                            }
                            if (n11 == 2) {
                                object = 5;
                            }
                            if (n11 == 3) {
                                object = 6;
                            }
                            if (n11 == 4) {
                                object = 1001;
                            }
                            B.a((String)object2[n11], am.a(65535) + var13_17.c, (int)object, n7, n12, n13);
                        }
                    }
                    B.a(du.bV, am.a(65535) + var13_17.c, 1002, var13_17.b * 1944152765 << 14, n12, n13);
                }
            }
            if (n14 == 1) {
                object = bH.aC[n15];
                if (object == null) continue;
                if (object.aq.f * 951781961 == 1 && (object.v * -1051150961 & 127) == 64 && (object.w * -844883935 & 127) == 64) {
                    for (n11 = 0; n11 < bH.aD * 1974577941; ++n11) {
                        cG cG2 = bH.aC[bH.aE[n11]];
                        if (cG2 == null || object == cG2 || cG2.aq.f * 951781961 != 1 || cG2.v * -1051150961 != object.v * -1051150961 || cG2.w * -844883935 != object.w * -844883935) continue;
                        bw.a(cG2.aq, bH.aE[n11], n12, n13, 691442848);
                    }
                    for (n11 = 0; n11 < bH.cc * -796710281; ++n11) {
                        object2 = bH.cb[bH.cd[n11]];
                        if (object2 == null || object.v * -1051150961 != object2.v * -1051150961 || object2.w * -844883935 != object.w * -844883935) continue;
                        cY.a((cP)object2, bH.cd[n11], n12, n13, -2069332470);
                    }
                }
                bw.a(object.aq, n15, n12, n13, 350086051);
            }
            if (n14 == 0) {
                object = bH.cb[n15];
                if (object == null) continue;
                if ((object.v * -1051150961 & 127) == 64 && (object.w * -844883935 & 127) == 64) {
                    for (n11 = 0; n11 < bH.aD * 1974577941; ++n11) {
                        cG cG3 = bH.aC[bH.aE[n11]];
                        if (cG3 == null || cG3.aq.f * 951781961 != 1 || cG3.v * -1051150961 != object.v * -1051150961 || object.w * -844883935 != cG3.w * -844883935) continue;
                        bw.a(cG3.aq, bH.aE[n11], n12, n13, 1444042458);
                    }
                    for (n11 = 0; n11 < bH.cc * -796710281; ++n11) {
                        object2 = bH.cb[bH.cd[n11]];
                        if (object2 == null || object == object2 || object.v * -1051150961 != object2.v * -1051150961 || object2.w * -844883935 != object.w * -844883935) continue;
                        cY.a((cP)object2, bH.cd[n11], n12, n13, -1666349144);
                    }
                }
                if (bH.cp * -208567815 != n15) {
                    cY.a((cP)object, n15, n12, n13, -1762739084);
                } else {
                    n9 = n7;
                }
            }
            if (n14 != 3 || (object = bH.cq[u.d * -1093536619][n12][n13]) == null) continue;
            u u2 = (u)object.d();
            while (u2 != null) {
                ca ca2 = bH.j(u2.b * 1500342151);
                if (bH.cK * -1710049223 == 1) {
                    B.a(du.bU, bH.cL + " " + aB.g + " " + am.a(16748608) + ca2.f, 16, u2.b * 1500342151, n12, n13);
                } else if (bH.cM) {
                    if ((cC.c * 253871613 & 1) == 1) {
                        B.a(bH.cP, bH.cQ + " " + aB.g + " " + am.a(16748608) + ca2.f, 17, u2.b * 1500342151, n12, n13);
                    }
                } else {
                    String[] arrstring = ca2.S;
                    if (bH.dc) {
                        arrstring = aC.a(arrstring);
                    }
                    for (int i2 = 4; i2 >= 0; --i2) {
                        if (arrstring != null && arrstring[i2] != null) {
                            int n16 = 0;
                            if (i2 == 0) {
                                n16 = 18;
                            }
                            if (i2 == 1) {
                                n16 = 19;
                            }
                            if (i2 == 2) {
                                n16 = 20;
                            }
                            if (i2 == 3) {
                                n16 = 21;
                            }
                            if (i2 == 4) {
                                n16 = 22;
                            }
                            B.a(arrstring[i2], am.a(16748608) + ca2.f, n16, u2.b * 1500342151, n12, n13);
                            continue;
                        }
                        if (i2 != 2) continue;
                        B.a(du.c, am.a(16748608) + ca2.f, 20, u2.b * 1500342151, n12, n13);
                    }
                    B.a(du.bV, am.a(16748608) + ca2.f, 1004, u2.b * 1500342151, n12, n13);
                }
                u2 = (u)object.f();
            }
        }
        if (n9 != -1) {
            n8 = n9 & 127;
            n7 = n9 >> 7 & 127;
            cP cP2 = bH.cb[bH.cp * -208567815];
            cY.a(cP2, bH.cp * -208567815, n8, n7, -1956531586);
        }
    }

    public static void a(int n2) {
        if (bq.b != null) {
            bq.b.c();
        }
    }

    public static boolean b(int n2) {
        long l2 = C.a(255);
        int n3 = (int)(l2 - aw.b * -2138204234370644471L);
        aw.b = l2 * 4667296355062474809L;
        if (n3 > 200) {
            n3 = 200;
        }
        bq.c += n3 * 508368235;
        if (bq.l * 1479147795 == 0 && bq.g * -1432304815 == 0 && bq.j * -1715959439 == 0 && bq.e * 1403506591 == 0) {
            return true;
        }
        if (bq.b == null) {
            return false;
        }
        try {
            cY cY2;
            y y2;
            if (bq.c * 689860419 > 30000) {
                throw new IOException();
            }
            while ((bq.g += 111830449) * -1432304815 < 20 && (bq.e -= 913411167) * 1403506591 > 0) {
                y2 = (y)bq.d.a();
                cY2 = new cY(4);
                cY2.d(1);
                cY2.f((int)y2.am);
                bq.b.b(cY2.g, 0, 4);
                bq.f.a(y2, y2.am);
            }
            while ((bq.l -= 434769637) * 1479147795 < 20 && (bq.j -= 61937553) * -1715959439 > 0) {
                y2 = (y)bq.h.a();
                cY2 = new cY(4);
                cY2.d(0);
                cY2.f((int)y2.am);
                bq.b.b(cY2.g, 0, 4);
                y2.b();
                bq.k.a(y2, y2.am);
            }
            for (int i2 = 0; i2 < 100; ++i2) {
                int n4;
                Object object;
                int n5;
                long l3;
                int n6;
                int n7;
                int n8 = bq.b.a();
                if (n8 < 0) {
                    throw new IOException();
                }
                if (n8 == 0) break;
                bq.c = 0;
                int n9 = 0;
                if (cY.f == null) {
                    n9 = 8;
                } else if (bq.n * -1706250695 == 0) {
                    n9 = 1;
                }
                if (n9 > 0) {
                    n7 = n9 - bq.m.h * 1736753585;
                    if (n7 > n8) {
                        n7 = n8;
                    }
                    bq.b.a(bq.m.g, bq.m.h * 1736753585, n7);
                    if (bq.q != 0) {
                        for (n6 = 0; n6 < n7; ++n6) {
                            byte[] arrby = bq.m.g;
                            int n10 = n6 + bq.m.h * 1736753585;
                            arrby[n10] = (byte)(arrby[n10] ^ bq.q);
                        }
                    }
                    bq.m.h += n7 * 1303963473;
                    if (bq.m.h * 1736753585 < n9) break;
                    if (cY.f == null) {
                        bq.m.h = 0;
                        n6 = bq.m.d();
                        n5 = bq.m.f();
                        object = bq.m.d();
                        n4 = bq.m.i();
                        l3 = n5 + (n6 << 16);
                        y y3 = (y)bq.f.a(l3);
                        bt.a = true;
                        if (y3 == null) {
                            y3 = (y)bq.k.a(l3);
                            bt.a = false;
                        }
                        if (y3 == null) {
                            throw new IOException();
                        }
                        int n11 = object == 0 ? 5 : 9;
                        cY.f = y3;
                        bq.a = new cY(cY.f.b + n11 + n4);
                        bq.a.d((int)object);
                        bq.a.g(n4);
                        bq.n = -1914240952;
                        bq.m.h = 0;
                        continue;
                    }
                    if (bq.n * -1706250695 != 0) continue;
                    if (bq.m.g[0] == -1) {
                        bq.n = -776151031;
                        bq.m.h = 0;
                        continue;
                    }
                    cY.f = null;
                    continue;
                }
                n6 = 512 - bq.n * -1706250695;
                n7 = bq.a.g.length - cY.f.b;
                if (n6 > n7 - bq.a.h * 1736753585) {
                    n6 = n7 - bq.a.h * 1736753585;
                }
                if (n6 > n8) {
                    n6 = n8;
                }
                bq.b.a(bq.a.g, bq.a.h * 1736753585, n6);
                if (bq.q != 0) {
                    for (n5 = 0; n5 < n6; ++n5) {
                        byte[] arrby = bq.a.g;
                        int n12 = n5 + bq.a.h * 1736753585;
                        arrby[n12] = (byte)(arrby[n12] ^ bq.q);
                    }
                }
                bq.a.h += n6 * 1303963473;
                bq.n += n6 * -776151031;
                if (n7 == bq.a.h * 1736753585) {
                    if (cY.f.am == 0xFF00FF) {
                        ba.c = bq.a;
                        for (n5 = 0; n5 < 256; ++n5) {
                            object = bq.p[n5];
                            if (object == null) continue;
                            ba.c.h = n5 * 1841773192 - 2070117227;
                            n4 = ba.c.i();
                            l3 = ba.c.i();
                            object.g(n4, (int)l3);
                        }
                    } else {
                        bq.o.reset();
                        bq.o.update(bq.a.g, 0, n7);
                        n5 = (int)bq.o.getValue();
                        if (n5 != cY.f.a * 492229115) {
                            try {
                                bq.b.c();
                            }
                            catch (Exception var13_15) {
                                // empty catch block
                            }
                            bq.r -= 671763761;
                            bq.b = null;
                            bq.q = (byte)(Math.random() * 255.0 + 1.0);
                            return false;
                        }
                        bq.r = 0;
                        bq.s = 0;
                        cY.f.c.a((int)(cY.f.am & 65535), bq.a.g, (cY.f.am & 0xFF0000) == 0xFF0000, bt.a, 91);
                    }
                    cY.f.m();
                    if (bt.a) {
                        bq.g -= 111830449;
                    } else {
                        bq.l += 434769637;
                    }
                    bq.n = 0;
                    cY.f = null;
                    bq.a = null;
                    continue;
                }
                if (bq.n * -1706250695 != 512) break;
                bq.n = 0;
            }
            return true;
        }
        catch (IOException var4_4) {
            try {
                bq.b.c();
            }
            catch (Exception var5_6) {
                // empty catch block
            }
            bq.s += 629140595;
            bq.b = null;
            return false;
        }
    }
}

