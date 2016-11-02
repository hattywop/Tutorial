/*
 * Decompiled with CFR 0_118.
 */
public class cq
extends cm {
    int e = 1423203584;
    boolean f;
    long g;
    int h;
    int i;
    long j;
    int k = 690276800;
    int[] l = new int[16];
    int[] m = new int[16];
    int[] n = new int[16];
    int[] o = new int[16];
    int[] p = new int[16];
    int[] q = new int[16];
    int[] r = new int[16];
    int[] s = new int[16];
    int[] t = new int[16];
    int[] u = new int[16];
    int[] v = new int[16];
    int[] w = new int[16];
    int[] x = new int[16];
    int[] y = new int[16];
    int[] z = new int[16];
    cg[][] A = new cg[16][128];
    cg[][] B = new cg[16][128];
    H C = new H();
    cp D;
    bP E;

    void a(cg cg2, boolean bl2, byte by2) {
        int n2;
        int n3 = cg2.s.b.length;
        if (bl2 && cg2.s.f) {
            int n4 = n3 + n3 - cg2.s.d;
            n2 = (int)((long)this.x[cg2.o * 2114974573] * (long)n4 >> 6);
            if (n2 >= (n3 <<= 8)) {
                n2 = n3 + n3 - 1 - n2;
                cg2.u.a(true);
            }
        } else {
            n2 = (int)((long)n3 * (long)this.x[cg2.o * 2114974573] >> 6);
        }
        cg2.u.e(n2);
    }

    public synchronized void a(int n2, byte by2) {
        this.e = n2 * 1716835421;
    }

    int a(byte by2) {
        return this.e * -1243111435;
    }

    int a(cg cg2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        F f2 = cg2.t;
        int n7 = 4096 + this.l[cg2.o * 2114974573] * this.n[cg2.o * 2114974573] >> 13;
        n7 = 16384 + n7 * n7 >> 15;
        n7 = cg2.d * -763464025 * n7 + 16384 >> 15;
        n7 = this.e * -1243111435 * n7 + 128 >> 8;
        if (f2.a * -2080964847 > 0) {
            n7 = (int)((double)n7 * Math.pow(0.5, (double)(f2.a * -2080964847) * (double)(cg2.f * -1439901009) * 1.953125E-5) + 0.5);
        }
        if (f2.g != null) {
            n5 = cg2.j * -1695729519;
            n6 = f2.g[1 + cg2.k * -1846924877];
            if (cg2.k * -1846924877 < f2.g.length - 2) {
                n4 = (f2.g[cg2.k * -1846924877] & 255) << 8;
                n3 = (f2.g[cg2.k * -1846924877 + 2] & 255) << 8;
                n6 += (f2.g[3 + cg2.k * -1846924877] - n6) * (n5 - n4) / (n3 - n4);
            }
            n7 = 32 + n6 * n7 >> 6;
        }
        if (cg2.l * 719007803 > 0 && f2.f != null) {
            n5 = cg2.l * 719007803;
            n6 = f2.f[cg2.n * -437862515 + 1];
            if (cg2.n * -437862515 < f2.f.length - 2) {
                n4 = (f2.f[cg2.n * -437862515] & 255) << 8;
                n3 = (f2.f[2 + cg2.n * -437862515] & 255) << 8;
                n6 += (n5 - n4) * (f2.f[cg2.n * -437862515 + 3] - n6) / (n3 - n4);
            }
            n7 = n6 * n7 + 32 >> 6;
        }
        return n7;
    }

    public synchronized void a(db db2, boolean bl2, int n2) {
        this.b(27);
        this.C.a(db2.b);
        this.f = bl2;
        this.g = 0;
        int n3 = this.C.f();
        for (int i2 = 0; i2 < n3; ++i2) {
            this.C.c(i2);
            this.C.e(i2);
            this.C.a(i2);
        }
        this.h = this.C.d() * 1857679;
        this.i = this.C.g[this.h * -1428568465] * -638054151;
        this.j = this.C.f(this.i * 1904193865) * 1395177067055174127L;
    }

    public synchronized void b(byte by2) {
        this.C.b();
        this.b(2089284912);
    }

    public synchronized boolean c(byte by2) {
        return this.C.e();
    }

    void a(int n2, int n3, int n4) {
        this.o[n2] = n3;
        this.q[n2] = n3 & -128;
        this.b(n2, n3, -1064642111);
    }

    void b(int n2, int n3, int n4) {
        if (this.p[n2] != n3) {
            this.p[n2] = n3;
            for (int i2 = 0; i2 < 128; ++i2) {
                this.B[n2][i2] = null;
            }
        }
    }

    void a(int n2, int n3, int n4, int n5) {
        ch ch2;
        cF cF22;
        this.b(n2, n3, 64, 2018724867);
        if ((this.u[n2] & 2) != 0) {
            cF cF22 = (cg)this.D.f.d();
            while (cF22 != null) {
                if (n2 == cF22.o * 2114974573 && cF22.l * 719007803 < 0) {
                    this.A[n2][cF22.i * -795828631] = null;
                    this.A[n2][n3] = cF22;
                    int n6 = cF22.a * 1080499421 + (cF22.g * -1558114147 * cF22.h * -103369499 >> 12);
                    cF22.a += (n3 - cF22.i * -795828631 << 8) * 2057214837;
                    cF22.g = (n6 - cF22.a * 1080499421) * 1674442165;
                    cF22.h = -24195072;
                    cF22.i = n3 * -1935224359;
                    return;
                }
                cF22 = (cg)this.D.f.f();
            }
        }
        if ((cF22 = (cf)this.E.a(this.p[n2])) != null && (ch2 = cF22.d[n3]) != null) {
            cg cg2 = new cg();
            cg2.o = n2 * 567873125;
            cg2.r = cF22;
            cg2.s = ch2;
            cg2.t = cF22.h[n3];
            cg2.c = cF22.i[n3] * 1395228449;
            cg2.i = n3 * -1935224359;
            cg2.d = (1024 + cF22.f[n3] * cF22.j * -33356305 * n4 * n4 >> 11) * 934531351;
            cg2.e = (cF22.g[n3] & 255) * -61893665;
            cg2.a = ((n3 << 8) - (cF22.e[n3] & 32767)) * 2057214837;
            cg2.f = 0;
            cg2.j = 0;
            cg2.k = 0;
            cg2.l = 1195890445;
            cg2.n = 0;
            if (this.x[n2] == 0) {
                cg2.u = co.a(ch2, this.b(cg2, 1991048695), this.a(cg2, 519598730), this.c(cg2, -1125975651));
            } else {
                cg2.u = co.a(ch2, this.b(cg2, 1987593206), 0, this.c(cg2, -1904059167));
                this.a(cg2, cF22.e[n3] < 0, 14);
            }
            if (cF22.e[n3] < 0) {
                cg2.u.b(-1);
            }
            if (cg2.c * 921879777 >= 0) {
                cg cg3 = this.B[n2][cg2.c * 921879777];
                if (cg3 != null && cg3.l * 719007803 < 0) {
                    this.A[n2][cg3.i * -795828631] = null;
                    cg3.l = 0;
                }
                this.B[n2][cg2.c * 921879777] = cg2;
            }
            this.D.f.a(cg2);
            this.A[n2][n3] = cg2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public synchronized boolean a(db var1_1, a var2_2, dp var3_3, int var4_4, int var5_5) {
        var1_1.b();
        var6_6 = true;
        var7_7 = null;
        if (var4_4 > 0) {
            var7_7 = new int[]{var4_4};
        }
        var8_8 = (ck)var1_1.a.a();
        do {
            if (var8_8 == null) {
                if (var6_6 == false) return var6_6;
                var1_1.a();
                return var6_6;
            }
            var9_9 = (int)var8_8.am;
            var10_10 = (cf)this.E.a(var9_9);
            if (var10_10 != null) ** GOTO lbl20
            var10_10 = bE.a(var2_2, var9_9);
            if (var10_10 == null) {
                var6_6 = false;
            } else {
                this.E.a(var10_10, var9_9);
lbl20: // 2 sources:
                if (!var10_10.a(var3_3, var8_8.a, var7_7, -58)) {
                    var6_6 = false;
                }
            }
            var8_8 = (ck)var1_1.a.b();
        } while (true);
    }

    public synchronized void a(int n2, int n3, byte by2) {
        this.a(n2, n3, 576942506);
    }

    void c(int n2, int n3, int n4) {
    }

    @Override
    protected synchronized cm c() {
        return this.D;
    }

    void a(int n2, int n3) {
        cg cg2 = (cg)this.D.f.g();
        while (cg2 != null) {
            if (n2 < 0 || n2 == cg2.o * 2114974573) {
                if (cg2.u != null) {
                    cg2.u.g(cO.i * -46901051 / 100);
                    if (cg2.u.j()) {
                        this.D.g.a(cg2.u);
                    }
                    cg2.a(1883320653);
                }
                if (cg2.l * 719007803 < 0) {
                    this.A[cg2.o * 2114974573][cg2.i * -795828631] = null;
                }
                cg2.m();
            }
            cg2 = (cg)this.D.f.e();
        }
    }

    public cq() {
        this.D = new cp(this);
        this.E = new bP(128);
        this.b(-487808451);
    }

    void b(int n2) {
        int n3;
        this.a(-1, 377335837);
        this.d(-1, -1155181543);
        for (n3 = 0; n3 < 16; ++n3) {
            this.p[n3] = this.o[n3];
        }
        for (n3 = 0; n3 < 16; ++n3) {
            this.q[n3] = this.o[n3] & -128;
        }
    }

    void b(int n2, int n3) {
        if ((this.u[n2] & 4) != 0) {
            cg cg2 = (cg)this.D.f.g();
            while (cg2 != null) {
                if (n2 == cg2.o * 2114974573) {
                    cg2.q = 0;
                }
                cg2 = (cg)this.D.f.e();
            }
        }
    }

    void b(int n2, byte by2) {
        int n3 = n2 & 240;
        if (n3 == 128) {
            int n4 = n2 & 15;
            int n5 = n2 >> 8 & 127;
            int n6 = n2 >> 16 & 127;
            this.b(n4, n5, n6, 2010108182);
        } else if (n3 == 144) {
            int n7 = n2 & 15;
            int n8 = n2 >> 8 & 127;
            int n9 = n2 >> 16 & 127;
            if (n9 > 0) {
                this.a(n7, n8, n9, -1400606107);
            } else {
                this.b(n7, n8, 64, 2006954600);
            }
        } else if (n3 == 160) {
            int n10 = n2 & 15;
            int n11 = n2 >> 8 & 127;
            int n12 = n2 >> 16 & 127;
            this.a(n10, n11, n12, 6);
        } else if (n3 == 176) {
            int n13;
            int n14 = n2 & 15;
            int n15 = n2 >> 8 & 127;
            int n16 = n2 >> 16 & 127;
            if (n15 == 0) {
                this.q[n14] = (n16 << 14) + (this.q[n14] & -2080769);
            }
            if (n15 == 32) {
                this.q[n14] = (this.q[n14] & -16257) + (n16 << 7);
            }
            if (n15 == 1) {
                this.s[n14] = (this.s[n14] & -16257) + (n16 << 7);
            }
            if (n15 == 33) {
                this.s[n14] = (this.s[n14] & -128) + n16;
            }
            if (n15 == 5) {
                this.t[n14] = (this.t[n14] & -16257) + (n16 << 7);
            }
            if (n15 == 37) {
                this.t[n14] = n16 + (this.t[n14] & -128);
            }
            if (n15 == 7) {
                this.l[n14] = (n16 << 7) + (this.l[n14] & -16257);
            }
            if (n15 == 39) {
                this.l[n14] = n16 + (this.l[n14] & -128);
            }
            if (n15 == 10) {
                this.m[n14] = (this.m[n14] & -16257) + (n16 << 7);
            }
            if (n15 == 42) {
                this.m[n14] = n16 + (this.m[n14] & -128);
            }
            if (n15 == 11) {
                this.n[n14] = (this.n[n14] & -16257) + (n16 << 7);
            }
            if (n15 == 43) {
                this.n[n14] = (this.n[n14] & -128) + n16;
            }
            if (n15 == 64) {
                if (n16 >= 64) {
                    int[] arrn = this.u;
                    int n17 = n14;
                    arrn[n17] = arrn[n17] | 1;
                } else {
                    int[] arrn = this.u;
                    int n18 = n14;
                    arrn[n18] = arrn[n18] & -2;
                }
            }
            if (n15 == 65) {
                if (n16 >= 64) {
                    int[] arrn = this.u;
                    int n19 = n14;
                    arrn[n19] = arrn[n19] | 2;
                } else {
                    this.e(n14, 1499726391);
                    int[] arrn = this.u;
                    int n20 = n14;
                    arrn[n20] = arrn[n20] & -3;
                }
            }
            if (n15 == 99) {
                this.v[n14] = (n16 << 7) + (this.v[n14] & 127);
            }
            if (n15 == 98) {
                this.v[n14] = n16 + (this.v[n14] & 16256);
            }
            if (n15 == 101) {
                this.v[n14] = (this.v[n14] & 127) + 16384 + (n16 << 7);
            }
            if (n15 == 100) {
                this.v[n14] = (this.v[n14] & 16256) + 16384 + n16;
            }
            if (n15 == 120) {
                this.a(n14, -2105884689);
            }
            if (n15 == 121) {
                this.d(n14, -1379067553);
            }
            if (n15 == 123) {
                this.c(n14, -205736182);
            }
            if (n15 == 6 && (n13 = this.v[n14]) == 16384) {
                this.w[n14] = (n16 << 7) + (this.w[n14] & -16257);
            }
            if (n15 == 38 && (n13 = this.v[n14]) == 16384) {
                this.w[n14] = (this.w[n14] & -128) + n16;
            }
            if (n15 == 16) {
                this.x[n14] = (n16 << 7) + (this.x[n14] & -16257);
            }
            if (n15 == 48) {
                this.x[n14] = n16 + (this.x[n14] & -128);
            }
            if (n15 == 81) {
                if (n16 >= 64) {
                    int[] arrn = this.u;
                    int n21 = n14;
                    arrn[n21] = arrn[n21] | 4;
                } else {
                    this.b(n14, 1652430977);
                    int[] arrn = this.u;
                    int n22 = n14;
                    arrn[n22] = arrn[n22] & -5;
                }
            }
            if (n15 == 17) {
                this.d(n14, (this.y[n14] & -16257) + (n16 << 7), 1882634827);
            }
            if (n15 == 49) {
                this.d(n14, (this.y[n14] & -128) + n16, 2019886680);
            }
        } else if (n3 == 192) {
            int n23 = n2 & 15;
            int n24 = n2 >> 8 & 127;
            this.b(n23, this.q[n23] + n24, -1064642111);
        } else if (n3 == 208) {
            int n25 = n2 & 15;
            int n26 = n2 >> 8 & 127;
            this.c(n25, n26, -642245569);
        } else if (n3 == 224) {
            int n27 = n2 & 15;
            int n28 = (n2 >> 8 & 127) + (n2 >> 9 & 16256);
            this.b(n27, n28, 68);
        } else {
            n3 = n2 & 255;
            if (n3 == 255) {
                this.b(1458886881);
            }
        }
    }

    void d(int n2, int n3, int n4) {
        this.y[n2] = n3;
        this.z[n2] = (int)(2097152.0 * Math.pow(2.0, (double)n3 * 5.4931640625E-4) + 0.5);
    }

    int b(cg cg2, int n2) {
        int n3;
        int n4 = cg2.a * 1080499421 + (cg2.h * -103369499 * cg2.g * -1558114147 >> 12);
        n4 += (this.r[cg2.o * 2114974573] - 8192) * this.w[cg2.o * 2114974573] >> 12;
        F f2 = cg2.t;
        if (f2.h * -1018763351 > 0 && (f2.d * -1310972373 > 0 || this.s[cg2.o * 2114974573] > 0)) {
            n3 = f2.d * -1310972373 << 2;
            int n5 = f2.i * -1865429001 << 1;
            if (cg2.m * -1716322373 < n5) {
                n3 = cg2.m * -1716322373 * n3 / n5;
            }
            double d2 = Math.sin(0.01227184630308513 * (double)(cg2.p * 1789086901 & 511));
            n4 += (int)((double)(n3 += this.s[cg2.o * 2114974573] >> 7) * d2);
        }
        return (n3 = (int)((double)(cg2.s.c * 256) * Math.pow(2.0, 3.255208333333333E-4 * (double)n4) / (double)(cO.i * -46901051) + 0.5)) < 1 ? 1 : n3;
    }

    @Override
    protected synchronized cm d() {
        return null;
    }

    @Override
    protected synchronized int a() {
        return 0;
    }

    @Override
    protected synchronized void a(int[] arrn, int n2, int n3) {
        if (this.C.e()) {
            int n4 = this.k * -1178137521 * this.C.b / (cO.i * -46901051);
            do {
                long l2;
                if (-1882446869992899313L * this.j - (l2 = (long)n4 * (long)n3 + 497425111599032637L * this.g) >= 0) {
                    this.g = -4477008562629577195L * l2;
                    break;
                }
                int n5 = (int)(((long)n4 + (-1882446869992899313L * this.j - this.g * 497425111599032637L) - 1) / (long)n4);
                this.g += (long)n4 * (long)n5 * -4477008562629577195L;
                this.D.a(arrn, n2, n5);
                n2 += n5;
                n3 -= n5;
                this.d(16);
            } while (this.C.e());
        }
        this.D.a(arrn, n2, n3);
    }

    @Override
    protected synchronized void a(int n2) {
        if (this.C.e()) {
            int n3 = this.C.b * this.k * -1178137521 / (cO.i * -46901051);
            do {
                long l2;
                if (this.j * -1882446869992899313L - (l2 = (long)n3 * (long)n2 + 497425111599032637L * this.g) >= 0) {
                    this.g = l2 * -4477008562629577195L;
                    break;
                }
                int n4 = (int)(((long)n3 + (this.j * -1882446869992899313L - 497425111599032637L * this.g) - 1) / (long)n3);
                this.g += -4477008562629577195L * (long)n3 * (long)n4;
                this.D.a(n4);
                n2 -= n4;
                this.d(97);
            } while (this.C.e());
        }
        this.D.a(n2);
    }

    void d(byte by2) {
        int n2 = this.h * -1428568465;
        int n3 = this.i * 1904193865;
        long l2 = this.j * -1882446869992899313L;
        while (n3 == this.i * 1904193865) {
            while (this.C.g[n2] == n3) {
                this.C.c(n2);
                int n4 = this.C.b(n2);
                if (n4 == 1) {
                    this.C.c();
                    this.C.a(n2);
                    if (!this.C.a()) break;
                    if (!this.f || n3 == 0) {
                        this.b(-803809717);
                        this.C.b();
                        return;
                    }
                    this.C.a(l2);
                    break;
                }
                if ((n4 & 128) != 0) {
                    this.b(n4, -119);
                }
                this.C.e(n2);
                this.C.a(n2);
            }
            n2 = this.C.d();
            n3 = this.C.g[n2];
            l2 = this.C.f(n3);
        }
        this.h = n2 * 1857679;
        this.i = n3 * -638054151;
        this.j = 1395177067055174127L * l2;
    }

    boolean a(cg cg2, byte by2) {
        if (cg2.u == null) {
            if (cg2.l * 719007803 >= 0) {
                cg2.m();
                if (cg2.c * 921879777 > 0 && this.B[cg2.o * 2114974573][cg2.c * 921879777] == cg2) {
                    this.B[cg2.o * 2114974573][cg2.c * 921879777] = null;
                }
            }
            return true;
        }
        return false;
    }

    synchronized void c(int n2) {
        cf cf2 = (cf)this.E.a();
        while (cf2 != null) {
            cf2.m();
            cf2 = (cf)this.E.b();
        }
    }

    boolean a(cg cg2, int[] arrn, int n2, int n3, int n4) {
        cg2.b = cO.i * -46901051 / 100 * 537115961;
        if (cg2.l * 719007803 < 0 || cg2.u != null && !cg2.u.i()) {
            int n5 = cg2.h * -103369499;
            if (n5 > 0) {
                if ((n5 -= (int)(16.0 * Math.pow(2.0, (double)this.t[cg2.o * 2114974573] * 4.921259842519685E-4) + 0.5)) < 0) {
                    n5 = 0;
                }
                cg2.h = n5 * -579868435;
            }
            cg2.u.f(this.b(cg2, 1357837077));
            F f2 = cg2.t;
            boolean bl2 = false;
            cg2.m -= 761926285;
            cg2.p += f2.h * -1339163739;
            double d2 = 5.086263020833333E-6 * (double)((cg2.g * -1558114147 * cg2.h * -103369499 >> 12) + (cg2.i * -795828631 - 60 << 8));
            if (f2.a * -2080964847 > 0) {
                cg2.f = f2.c * 1806465307 > 0 ? (cg2.f += (int)(128.0 * Math.pow(2.0, d2 * (double)(f2.c * 1806465307)) + 0.5) * -781140913) : (cg2.f -= 1201789056);
            }
            if (f2.g != null) {
                cg2.j = f2.b * -918845069 > 0 ? (cg2.j += (int)(128.0 * Math.pow(2.0, d2 * (double)(f2.b * -918845069)) + 0.5) * 703432817) : (cg2.j -= 154912640);
                while (cg2.k * -1846924877 < f2.g.length - 2 && cg2.j * -1695729519 > (f2.g[2 + cg2.k * -1846924877] & 255) << 8) {
                    cg2.k -= 253666570;
                }
                if (cg2.k * -1846924877 == f2.g.length - 2 && f2.g[cg2.k * -1846924877 + 1] == 0) {
                    bl2 = true;
                }
            }
            if (cg2.l * 719007803 >= 0 && f2.f != null && (this.u[cg2.o * 2114974573] & 1) == 0 && (cg2.c * 921879777 < 0 || this.B[cg2.o * 2114974573][cg2.c * 921879777] != cg2)) {
                cg2.l = f2.e * 485290785 > 0 ? (cg2.l += (int)(128.0 * Math.pow(2.0, d2 * (double)(f2.e * 485290785)) + 0.5) * -1195890445) : (cg2.l += 1544845696);
                while (cg2.n * -437862515 < f2.f.length - 2 && cg2.l * 719007803 > (f2.f[2 + cg2.n * -437862515] & 255) << 8) {
                    cg2.n += 1581856394;
                }
                if (cg2.n * -437862515 == f2.f.length - 2) {
                    bl2 = true;
                }
            }
            if (bl2) {
                cg2.u.g(cg2.b * 1112154377);
                if (arrn != null) {
                    cg2.u.a(arrn, n2, n3);
                } else {
                    cg2.u.a(n3);
                }
                if (cg2.u.j()) {
                    this.D.g.a(cg2.u);
                }
                cg2.a(160298134);
                if (cg2.l * 719007803 >= 0) {
                    cg2.m();
                    if (cg2.c * 921879777 > 0 && this.B[cg2.o * 2114974573][cg2.c * 921879777] == cg2) {
                        this.B[cg2.o * 2114974573][cg2.c * 921879777] = null;
                    }
                }
                return true;
            }
            cg2.u.a(cg2.b * 1112154377, this.a(cg2, 2055634713), this.c(cg2, 1177291339));
            return false;
        }
        cg2.a(-2124492641);
        cg2.m();
        if (cg2.c * 921879777 > 0 && this.B[cg2.o * 2114974573][cg2.c * 921879777] == cg2) {
            this.B[cg2.o * 2114974573][cg2.c * 921879777] = null;
        }
        return true;
    }

    void c(int n2, int n3) {
        cg cg2 = (cg)this.D.f.g();
        while (cg2 != null) {
            if ((n2 < 0 || cg2.o * 2114974573 == n2) && cg2.l * 719007803 < 0) {
                this.A[cg2.o * 2114974573][cg2.i * -795828631] = null;
                cg2.l = 0;
            }
            cg2 = (cg)this.D.f.e();
        }
    }

    void a(int n2, int n3, int n4, byte by2) {
    }

    public synchronized void d(int n2) {
        cf cf2 = (cf)this.E.a();
        while (cf2 != null) {
            cf2.a(-1366136424);
            cf2 = (cf)this.E.b();
        }
    }

    void b(int n2, int n3, int n4, int n5) {
        cg cg2 = this.A[n2][n3];
        if (cg2 != null) {
            this.A[n2][n3] = null;
            if ((this.u[n2] & 2) != 0) {
                cg cg3 = (cg)this.D.f.g();
                while (cg3 != null) {
                    if (cg2.o * 2114974573 == cg3.o * 2114974573 && cg3.l * 719007803 < 0 && cg3 != cg2) {
                        cg2.l = 0;
                        break;
                    }
                    cg3 = (cg)this.D.f.e();
                }
            } else {
                cg2.l = 0;
            }
        }
    }

    void d(int n2, int n3) {
        if (n2 >= 0) {
            this.l[n2] = 12800;
            this.m[n2] = 8192;
            this.n[n2] = 16383;
            this.r[n2] = 8192;
            this.s[n2] = 0;
            this.t[n2] = 8192;
            this.e(n2, -430696940);
            this.b(n2, 1652430977);
            this.u[n2] = 0;
            this.v[n2] = 32767;
            this.w[n2] = 256;
            this.x[n2] = 0;
            this.d(n2, 8192, 223876049);
        } else {
            for (n2 = 0; n2 < 16; ++n2) {
                this.d(n2, 1755896549);
            }
        }
    }

    void b(int n2, int n3, byte by2) {
        this.r[n2] = n3;
    }

    void e(int n2, int n3) {
        if ((this.u[n2] & 2) != 0) {
            cg cg2 = (cg)this.D.f.g();
            while (cg2 != null) {
                if (n2 == cg2.o * 2114974573 && this.A[n2][cg2.i * -795828631] == null && cg2.l * 719007803 < 0) {
                    cg2.l = 0;
                }
                cg2 = (cg)this.D.f.e();
            }
        }
    }

    int c(cg cg2, int n2) {
        int n3 = this.m[cg2.o * 2114974573];
        return n3 >= 8192 ? 16384 - ((128 - cg2.e * -1358567393) * (16384 - n3) + 32 >> 6) : n3 * cg2.e * -1358567393 + 32 >> 6;
    }

    static int e(int n2) {
        return bH.R ? 2 : 1;
    }

    static final void a(t t2, int n2, byte by2) {
        bZ.a(t2.v * -1051150961, t2.w * -844883935, n2);
    }
}

