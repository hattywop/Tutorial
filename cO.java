/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;

public class cO {
    protected static int e;
    public static int f;
    public static boolean g;
    int h;
    public static int i;
    cm j;
    long k = 0;
    boolean l = true;
    int m = 0;
    long n = C.a(255) * 9097749355702074551L;
    int o;
    int p;
    int q = 0;
    long r = 0;
    int s = 0;
    int[] t;
    static ag u;
    int v = 279813920;
    int w = 0;
    cm[] x = new cm[8];
    cm[] y = new cm[8];

    public final synchronized void a(cm cm2, byte by2) {
        this.j = cm2;
    }

    public final synchronized void b(int n2) {
        if (this.t != null) {
            long l2 = C.a(255);
            try {
                int n3;
                int n4;
                if (this.k * 3377015987257929069L != 0) {
                    if (l2 < this.k * 3377015987257929069L) {
                        return;
                    }
                    this.a(this.o * -1450371813);
                    this.k = 0;
                    this.l = true;
                }
                if (this.q * -2020738743 - (n4 = this.b()) > this.m * -686867523) {
                    this.m = (this.q * -2020738743 - n4) * 2096715669;
                }
                if (256 + (n3 = this.h * 1177621975 + this.p * -504629513) > 16384) {
                    n3 = 16128;
                }
                if (n3 + 256 > this.o * -1450371813) {
                    this.o += 16010240;
                    if (this.o * -1450371813 > 16384) {
                        this.o = 256163840;
                    }
                    this.a();
                    this.a(this.o * -1450371813);
                    n4 = 0;
                    this.l = true;
                    if (256 + n3 > this.o * -1450371813) {
                        n3 = this.o * -1450371813 - 256;
                        this.p = (n3 - this.h * 1177621975) * 423996103;
                    }
                }
                while (n4 < n3) {
                    this.a(this.t, 256);
                    this.c();
                    n4 += 256;
                }
                if (l2 > 5791573765782046013L * this.r) {
                    if (!this.l) {
                        if (this.m * -686867523 == 0 && this.s * -310890005 == 0) {
                            this.a();
                            this.k = (l2 + 2000) * 5919533943435633765L;
                            return;
                        }
                        this.p = Math.min(this.s * -310890005, this.m * -686867523) * 423996103;
                        this.s = this.m * 1833875191;
                    } else {
                        this.l = false;
                    }
                    this.m = 0;
                    this.r = -4157439246045939179L * (2000 + l2);
                }
                this.q = n4 * -1637070599;
            }
            catch (Exception var4_4) {
                this.a();
                this.k = 5919533943435633765L * (l2 + 2000);
            }
            try {
                if (l2 > this.n * 7275558122260947207L + 500000) {
                    l2 = 7275558122260947207L * this.n;
                }
                while (l2 > 5000 + 7275558122260947207L * this.n) {
                    this.a(256, 1705035456);
                    this.n += (long)(256000 / (i * -46901051)) * 9097749355702074551L;
                }
            }
            catch (Exception var4_5) {
                this.n = 9097749355702074551L * l2;
            }
        }
    }

    public final synchronized void c(int n2) {
        if (u != null) {
            boolean bl2 = true;
            for (int i2 = 0; i2 < 2; ++i2) {
                if (this == cO.u.e[i2]) {
                    cO.u.e[i2] = null;
                }
                if (cO.u.e[i2] == null) continue;
                bl2 = false;
            }
            if (bl2) {
                cO.u.f = true;
                while (cO.u.g) {
                    ao.a(50);
                }
                u = null;
            }
        }
        this.a();
        this.t = null;
    }

    void a(Component component) {
    }

    void a() {
    }

    void d() {
    }

    final void a(int[] arrn, int n2) {
        int n3 = n2;
        if (g) {
            n3 = n2 << 1;
        }
        i.a(arrn, 0, n3);
        this.w -= n2 * 689867139;
        if (this.j != null && this.w * 241945899 <= 0) {
            cm cm2;
            this.w += (i * -46901051 >> 4) * 689867139;
            cA.a(this.j, -2112682385);
            this.a(this.j, this.j.b(), -22);
            int n4 = 0;
            int n5 = 255;
            int n6 = 7;
            block0 : while (n5 != 0) {
                int n7;
                int n8;
                if (n6 < 0) {
                    n7 = n6 & 3;
                    n8 = - (n6 >> 2);
                } else {
                    n7 = n6;
                    n8 = 0;
                }
                for (int i2 = n5 >>> n7 & 286331153; i2 != 0; i2 >>>= 4) {
                    if ((i2 & 1) != 0) {
                        n5 &= ~ (1 << n7);
                        cm2 = null;
                        cm cm3 = this.x[n7];
                        while (cm3 != null) {
                            cc cc2 = cm3.b;
                            if (cc2 != null && cc2.a > n8) {
                                n5 |= 1 << n7;
                                cm2 = cm3;
                                cm3 = cm3.c;
                                continue;
                            }
                            cm3.d = true;
                            int n9 = cm3.a();
                            n4 += n9;
                            if (cc2 != null) {
                                cc2.a += n9;
                            }
                            if (n4 >= this.v * -494955191) break block0;
                            cm cm4 = cm3.c();
                            if (cm4 != null) {
                                int n10 = cm3.a;
                                while (cm4 != null) {
                                    this.a(cm4, n10 * cm4.b() >> 8, 10);
                                    cm4 = cm3.d();
                                }
                            }
                            cm cm5 = cm3.c;
                            cm3.c = null;
                            if (cm2 == null) {
                                this.x[n7] = cm5;
                            } else {
                                cm2.c = cm5;
                            }
                            if (cm5 == null) {
                                this.y[n7] = cm2;
                            }
                            cm3 = cm5;
                        }
                    }
                    n7 += 4;
                    ++n8;
                }
                --n6;
            }
            for (n6 = 0; n6 < 8; ++n6) {
                cm cm6 = this.x[n6];
                cm[] arrcm = this.x;
                this.y[n6] = null;
                arrcm[n6] = null;
                while (cm6 != null) {
                    cm2 = cm6.c;
                    cm6.c = null;
                    cm6 = cm2;
                }
            }
        }
        if (this.w * 241945899 < 0) {
            this.w = 0;
        }
        if (this.j != null) {
            this.j.a(arrn, 0, n2);
        }
        this.n = C.a(255) * 9097749355702074551L;
    }

    public final synchronized void d(int n2) {
        this.l = true;
        try {
            this.d();
        }
        catch (Exception var2_2) {
            this.a();
            this.k = (C.a(255) + 2000) * 5919533943435633765L;
        }
    }

    int b() {
        return this.o * -1450371813;
    }

    final void a(int n2, int n3) {
        this.w -= n2 * 689867139;
        if (this.w * 241945899 < 0) {
            this.w = 0;
        }
        if (this.j != null) {
            this.j.a(n2);
        }
    }

    final void a(cm cm2, int n2, byte by2) {
        int n3 = n2 >> 5;
        cm cm3 = this.y[n3];
        if (cm3 == null) {
            this.x[n3] = cm2;
        } else {
            cm3.c = cm2;
        }
        this.y[n3] = cm2;
        cm2.a = n2;
    }

    void a(int n2) {
    }

    public final void e() {
        this.l = true;
    }

    void c() {
    }

    static final void a(t t2) {
        if (t2.ag * -1936020065 != 0) {
            int n2;
            int n3;
            int n4;
            cG cG2;
            if (t2.Q * 1253370921 != -1 && t2.Q * 1253370921 < 32768 && (cG2 = bH.aC[t2.Q * 1253370921]) != null) {
                n3 = t2.v * -1051150961 - cG2.v * -1051150961;
                n4 = t2.w * -844883935 - cG2.w * -844883935;
                if (n3 != 0 || n4 != 0) {
                    t2.b = ((int)(Math.atan2(n3, n4) * 325.949) & 2047) * 1686641467;
                }
            }
            if (t2.Q * 1253370921 >= 32768) {
                cP cP2;
                int n5 = t2.Q * 1253370921 - 32768;
                if (bH.ch * -1731449945 == n5) {
                    n5 = 2047;
                }
                if ((cP2 = bH.cb[n5]) != null) {
                    n4 = t2.v * -1051150961 - cP2.v * -1051150961;
                    int n6 = t2.w * -844883935 - cP2.w * -844883935;
                    if (n4 != 0 || n6 != 0) {
                        t2.b = ((int)(Math.atan2(n4, n6) * 325.949) & 2047) * 1686641467;
                    }
                }
            }
            if (!(t2.R * -171614763 == 0 && t2.S * 384997749 == 0 || t2.s * -1429276161 != 0 && t2.u * -1785378405 <= 0)) {
                int n7 = t2.v * -1051150961 - (t2.R * 1901557056 - bw.c * 1590235200 - bw.c * 1590235200);
                n3 = t2.w * -844883935 - (t2.S * -1129947840 - ce.c * -111201600 - ce.c * -111201600);
                if (n7 != 0 || n3 != 0) {
                    t2.b = ((int)(Math.atan2(n7, n3) * 325.949) & 2047) * 1686641467;
                }
                t2.R = 0;
                t2.S = 0;
            }
            if ((n2 = t2.b * -1099823629 - t2.a * 1933495885 & 2047) != 0) {
                t2.af -= 1291408463;
                if (n2 > 1024) {
                    t2.a -= t2.ag * -624469605;
                    boolean bl2 = true;
                    if (n2 < t2.ag * -1936020065 || n2 > 2048 - t2.ag * -1936020065) {
                        t2.a = t2.b * -131283649;
                        bl2 = false;
                    }
                    if (t2.T * -1834510973 == t2.z * -71832567 && (t2.af * -222118575 > 25 || bl2)) {
                        t2.T = t2.A * 522440809 != -1 ? t2.A * 673024675 : t2.C * -1666602161;
                    }
                } else {
                    t2.a += t2.ag * -624469605;
                    boolean bl3 = true;
                    if (n2 < t2.ag * -1936020065 || n2 > 2048 - t2.ag * -1936020065) {
                        t2.a = t2.b * -131283649;
                        bl3 = false;
                    }
                    if (t2.T * -1834510973 == t2.z * -71832567 && (t2.af * -222118575 > 25 || bl3)) {
                        t2.T = t2.B * -1797134015 != -1 ? t2.B * -1042313493 : t2.C * -1666602161;
                    }
                }
                t2.a = (t2.a * 1933495885 & 2047) * 1352080005;
            } else {
                t2.af = 0;
            }
        }
    }

    static int a(dC dC2, dC dC3, int n2, boolean bl2, int n3) {
        if (n2 == 1) {
            int n4 = dC2.b * 1599434219;
            int n5 = dC3.b * 1599434219;
            if (!bl2) {
                if (n4 == -1) {
                    n4 = 2001;
                }
                if (n5 == -1) {
                    n5 = 2001;
                }
            }
            return n4 - n5;
        }
        return n2 == 2 ? dC2.h * -1139554955 - dC3.h * -1139554955 : (n2 == 3 ? (dC2.f.equals("-") ? (dC3.f.equals("-") ? 0 : (bl2 ? -1 : 1)) : (dC3.f.equals("-") ? (bl2 ? 1 : -1) : dC2.f.compareTo(dC3.f))) : (n2 == 4 ? (dC2.f() ? (dC3.f() ? 0 : 1) : (dC3.f() ? -1 : 0)) : (n2 == 5 ? (dC2.d() ? (dC3.d() ? 0 : 1) : (dC3.d() ? -1 : 0)) : (n2 == 6 ? (dC2.e() ? (dC3.e() ? 0 : 1) : (dC3.e() ? -1 : 0)) : (n2 == 7 ? (dC2.a() ? (dC3.a() ? 0 : 1) : (dC3.a() ? -1 : 0)) : dC2.c * 1685233739 - dC3.c * 1685233739)))));
    }

    static final void a(boolean bl2) {
        bH.aV = bl2;
        if (!bH.aV) {
            int n2 = (bH.aI * 1964753529 - bH.aH.h * 1736753585) / 16;
            av.c = new int[n2][4];
            for (int i2 = 0; i2 < n2; ++i2) {
                for (int i3 = 0; i3 < 4; ++i3) {
                    av.c[i2][i3] = bH.aH.C();
                }
            }
            int n3 = bH.aH.f();
            int n4 = bH.aH.y();
            int n5 = bH.aH.s();
            int n6 = bH.aH.v();
            int n7 = bH.aH.F();
            g.b = new int[n2];
            t.d = new int[n2];
            bd.a = new int[n2];
            aR.c = new byte[n2][];
            av.b = new byte[n2][];
            boolean bl3 = false;
            if ((n4 / 8 == 48 || n4 / 8 == 49) && n3 / 8 == 48) {
                bl3 = true;
            }
            if (n4 / 8 == 48 && n3 / 8 == 148) {
                bl3 = true;
            }
            n2 = 0;
            for (int i4 = (n4 - 6) / 8; i4 <= (n4 + 6) / 8; ++i4) {
                for (int i5 = (n3 - 6) / 8; i5 <= (n3 + 6) / 8; ++i5) {
                    int n8 = i5 + (i4 << 8);
                    if (bl3 && (i5 == 49 || i5 == 149 || i5 == 147 || i4 == 50 || i4 == 49 && i5 == 47)) continue;
                    g.b[n2] = n8;
                    t.d[n2] = V.c.a("m" + i4 + "_" + i5);
                    bd.a[n2] = V.c.a("l" + i4 + "_" + i5);
                    ++n2;
                }
            }
            al.a(n4, n3, n6, n7, n5, 1434585208);
        } else {
            int n9;
            int n10;
            int n11;
            int n12;
            int n13 = bH.aH.y();
            int n14 = bH.aH.f();
            int n15 = bH.aH.F();
            int n16 = bH.aH.u();
            bH.aH.b();
            for (n12 = 0; n12 < 4; ++n12) {
                for (n11 = 0; n11 < 13; ++n11) {
                    for (n9 = 0; n9 < 13; ++n9) {
                        n10 = bH.aH.b(1);
                        bH.aW[n12][n11][n9] = n10 == 1 ? bH.aH.b(26) : -1;
                    }
                }
            }
            bH.aH.c();
            int n17 = (bH.aI * 1964753529 - bH.aH.h * 1736753585) / 16;
            av.c = new int[n17][4];
            for (n11 = 0; n11 < n17; ++n11) {
                for (n12 = 0; n12 < 4; ++n12) {
                    av.c[n11][n12] = bH.aH.D();
                }
            }
            n12 = bH.aH.s();
            g.b = new int[n17];
            t.d = new int[n17];
            bd.a = new int[n17];
            aR.c = new byte[n17][];
            av.b = new byte[n17][];
            n17 = 0;
            for (n9 = 0; n9 < 4; ++n9) {
                for (int i6 = 0; i6 < 13; ++i6) {
                    for (int i7 = 0; i7 < 13; ++i7) {
                        int n18;
                        n10 = bH.aW[n9][i6][i7];
                        if (n10 == -1) continue;
                        int n19 = n10 >> 14 & 1023;
                        int n20 = n10 >> 3 & 2047;
                        int n21 = n20 / 8 + (n19 / 8 << 8);
                        for (n18 = 0; n18 < n17; ++n18) {
                            if (g.b[n18] != n21) continue;
                            n21 = -1;
                            break;
                        }
                        if (n21 == -1) continue;
                        g.b[n17] = n21;
                        n18 = n21 >> 8 & 255;
                        int n22 = n21 & 255;
                        t.d[n17] = V.c.a("m" + n18 + "_" + n22);
                        bd.a[n17] = V.c.a("l" + n18 + "_" + n22);
                        ++n17;
                    }
                }
            }
            al.a(n15, n14, n16, n12, n13, 1348291685);
        }
    }

    public static byte[] a(Object object, boolean bl2, int n2) {
        if (object == null) {
            return null;
        }
        if (!(object instanceof byte[])) {
            if (object instanceof bC) {
                bC bC2 = (bC)object;
                return bC2.a(-2117824380);
            }
            throw new IllegalArgumentException();
        }
        byte[] arrby = (byte[])object;
        return bl2 ? bH.a(arrby, 1485776901) : arrby;
    }

    static void a(int n2, String string, byte by2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < bH.cc * -796710281; ++i2) {
            cP cP2 = bH.cb[bH.cd[i2]];
            if (cP2 == null || cP2.aF == null || !cP2.aF.equalsIgnoreCase(string)) continue;
            if (n2 == 1) {
                bH.aF.a(199);
                bH.aF.s(0);
                bH.aF.n(bH.cd[i2]);
            } else if (n2 == 4) {
                bH.aF.a(56);
                bH.aF.d(0);
                bH.aF.e(bH.cd[i2]);
            } else if (n2 == 6) {
                bH.aF.a(218);
                bH.aF.q(bH.cd[i2]);
                bH.aF.w(0);
            } else if (n2 == 7) {
                bH.aF.a(95);
                bH.aF.d(0);
                bH.aF.e(bH.cd[i2]);
            }
            bl2 = true;
            break;
        }
        if (!bl2) {
            bn.a(4, "", du.bT + string);
        }
    }
}

