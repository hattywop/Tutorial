/*
 * Decompiled with CFR 0_118.
 */
import java.util.Random;

public class dt {
    static int[] a;
    static int[] b;
    static int[] c;
    static int[] d;
    static int[] e;
    static int[] f;
    static int[] g;
    static int[] h;
    ds i;
    ds j;
    ds k;
    ds l;
    ds m;
    ds n;
    ds o;
    ds p;
    int q = 0;
    int r = 100;
    int s = 500;
    int t = 0;
    dq u;
    ds v;
    int[] w = new int[]{0, 0, 0, 0, 0};
    int[] x = new int[]{0, 0, 0, 0, 0};
    int[] y = new int[]{0, 0, 0, 0, 0};

    final int[] a(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        i.a(c, 0, n2);
        if (n3 < 10) {
            return c;
        }
        double d2 = (double)n2 / ((double)n3 + 0.0);
        this.i.a();
        this.j.a();
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        if (this.k != null) {
            this.k.a();
            this.l.a();
            n12 = (int)((double)(this.k.c - this.k.b) * 32.768 / d2);
            n13 = (int)((double)this.k.b * 32.768 / d2);
        }
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        if (this.m != null) {
            this.m.a();
            this.n.a();
            n15 = (int)((double)(this.m.c - this.m.b) * 32.768 / d2);
            n16 = (int)((double)this.m.b * 32.768 / d2);
        }
        for (n8 = 0; n8 < 5; ++n8) {
            if (this.w[n8] == 0) continue;
            dt.d[n8] = 0;
            dt.e[n8] = (int)((double)this.y[n8] * d2);
            dt.f[n8] = (this.w[n8] << 14) / 100;
            dt.g[n8] = (int)((double)(this.i.c - this.i.b) * 32.768 * Math.pow(1.0057929410678534, this.x[n8]) / d2);
            dt.h[n8] = (int)((double)this.i.b * 32.768 / d2);
        }
        for (n8 = 0; n8 < n2; ++n8) {
            n11 = this.i.a(n2);
            n6 = this.j.a(n2);
            if (this.k != null) {
                n5 = this.k.a(n2);
                n9 = this.l.a(n2);
                n11 += this.a(n14, n9, this.k.a) >> 1;
                n14 += (n5 * n12 >> 16) + n13;
            }
            if (this.m != null) {
                n5 = this.m.a(n2);
                n9 = this.n.a(n2);
                n6 = n6 * ((this.a(n17, n9, this.m.a) >> 1) + 32768) >> 15;
                n17 += (n5 * n15 >> 16) + n16;
            }
            for (n5 = 0; n5 < 5; ++n5) {
                if (this.w[n5] == 0 || (n9 = n8 + e[n5]) >= n2) continue;
                int[] arrn = c;
                int n18 = n9;
                arrn[n18] = arrn[n18] + this.a(d[n5], n6 * f[n5] >> 15, this.i.a);
                int[] arrn2 = d;
                int n19 = n5;
                arrn2[n19] = arrn2[n19] + ((n11 * g[n5] >> 16) + h[n5]);
            }
        }
        if (this.o != null) {
            this.o.a();
            this.p.a();
            n8 = 0;
            n7 = 0;
            n10 = 1;
            for (n5 = 0; n5 < n2; ++n5) {
                n9 = this.o.a(n2);
                n4 = this.p.a(n2);
                n11 = n10 != 0 ? this.o.b + ((this.o.c - this.o.b) * n9 >> 8) : this.o.b + ((this.o.c - this.o.b) * n4 >> 8);
                if ((n8 += 256) >= n11) {
                    n8 = 0;
                    int n20 = n10 = n10 == 0 ? 1 : 0;
                }
                if (n10 == 0) continue;
                dt.c[n5] = 0;
            }
        }
        if (this.q > 0 && this.r > 0) {
            for (n11 = n8 = (int)((double)this.q * d2); n11 < n2; ++n11) {
                int[] arrn = c;
                int n21 = n11;
                arrn[n21] = arrn[n21] + c[n11 - n8] * this.r / 100;
            }
        }
        if (this.u.c[0] > 0 || this.u.c[1] > 0) {
            this.v.a();
            n8 = this.v.a(n2 + 1);
            n11 = this.u.a(0, (float)n8 / 65536.0f);
            n6 = this.u.a(1, (float)n8 / 65536.0f);
            if (n2 >= n11 + n6) {
                n5 = 0;
                n9 = n6;
                if (n6 > n2 - n11) {
                    n9 = n2 - n11;
                }
                while (n5 < n9) {
                    n4 = (int)((long)c[n5 + n11] * (long)dq.b >> 16);
                    for (n7 = 0; n7 < n11; ++n7) {
                        n4 += (int)((long)c[n5 + n11 - 1 - n7] * (long)dq.h[0][n7] >> 16);
                    }
                    for (n7 = 0; n7 < n5; ++n7) {
                        n4 -= (int)((long)c[n5 - 1 - n7] * (long)dq.h[1][n7] >> 16);
                    }
                    dt.c[n5] = n4;
                    n8 = this.v.a(n2 + 1);
                    ++n5;
                }
                n9 = 128;
                do {
                    if (n9 > n2 - n11) {
                        n9 = n2 - n11;
                    }
                    while (n5 < n9) {
                        n7 = (int)((long)c[n5 + n11] * (long)dq.b >> 16);
                        for (n10 = 0; n10 < n11; ++n10) {
                            n7 += (int)((long)c[n5 + n11 - 1 - n10] * (long)dq.h[0][n10] >> 16);
                        }
                        for (n10 = 0; n10 < n6; ++n10) {
                            n7 -= (int)((long)c[n5 - 1 - n10] * (long)dq.h[1][n10] >> 16);
                        }
                        dt.c[n5] = n7;
                        n8 = this.v.a(n2 + 1);
                        ++n5;
                    }
                    if (n5 >= n2 - n11) {
                        while (n5 < n2) {
                            n7 = 0;
                            for (n10 = n5 + n11 - n2; n10 < n11; ++n10) {
                                n7 += (int)((long)c[n5 + n11 - 1 - n10] * (long)dq.h[0][n10] >> 16);
                            }
                            for (n10 = 0; n10 < n6; ++n10) {
                                n7 -= (int)((long)c[n5 - 1 - n10] * (long)dq.h[1][n10] >> 16);
                            }
                            dt.c[n5] = n7;
                            this.v.a(n2 + 1);
                            ++n5;
                        }
                        break;
                    }
                    n11 = this.u.a(0, (float)n8 / 65536.0f);
                    n6 = this.u.a(1, (float)n8 / 65536.0f);
                    n9 += 128;
                } while (true);
            }
        }
        for (n8 = 0; n8 < n2; ++n8) {
            if (c[n8] < -32768) {
                dt.c[n8] = -32768;
            }
            if (c[n8] <= 32767) continue;
            dt.c[n8] = 32767;
        }
        return c;
    }

    final int a(int n2, int n3, int n4) {
        return n4 == 1 ? ((n2 & 32767) < 16384 ? n3 : - n3) : (n4 == 2 ? b[n2 & 32767] * n3 >> 14 : (n4 == 3 ? ((n2 & 32767) * n3 >> 14) - n3 : (n4 == 4 ? a[n2 / 2607 & 32767] * n3 : 0)));
    }

    final void a(cY cY2) {
        int n2;
        this.i = new ds();
        this.i.a(cY2);
        this.j = new ds();
        this.j.a(cY2);
        int n3 = cY2.d();
        if (n3 != 0) {
            cY2.h -= 1303963473;
            this.k = new ds();
            this.k.a(cY2);
            this.l = new ds();
            this.l.a(cY2);
        }
        if ((n3 = cY2.d()) != 0) {
            cY2.h -= 1303963473;
            this.m = new ds();
            this.m.a(cY2);
            this.n = new ds();
            this.n.a(cY2);
        }
        if ((n3 = cY2.d()) != 0) {
            cY2.h -= 1303963473;
            this.o = new ds();
            this.o.a(cY2);
            this.p = new ds();
            this.p.a(cY2);
        }
        for (int i2 = 0; i2 < 10 && (n2 = cY2.q()) != 0; ++i2) {
            this.w[i2] = n2;
            this.x[i2] = cY2.p();
            this.y[i2] = cY2.q();
        }
        this.q = cY2.q();
        this.r = cY2.q();
        this.s = cY2.f();
        this.t = cY2.f();
        this.u = new dq();
        this.v = new ds();
        this.u.a(cY2, this.v);
    }

    static {
        int n2;
        a = new int[32768];
        Random random = new Random(0);
        for (n2 = 0; n2 < 32768; ++n2) {
            dt.a[n2] = (random.nextInt() & 2) - 1;
        }
        b = new int[32768];
        for (n2 = 0; n2 < 32768; ++n2) {
            dt.b[n2] = (int)(Math.sin((double)n2 / 5215.1903) * 16384.0);
        }
        c = new int[220500];
        d = new int[5];
        e = new int[5];
        f = new int[5];
        g = new int[5];
        h = new int[5];
    }
}

