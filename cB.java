/*
 * Decompiled with CFR 0_118.
 */
public class cB
extends dh {
    int a = 0;
    int b = 0;
    int c = 0;
    int[] d;
    int[] e;
    int[] f;
    int[] g;
    int[] h;
    int[] i;
    int[] j;
    int[] k;
    byte[] l;
    byte[] m;
    byte[] n;
    short[] o;
    byte p = 0;
    int[] q;
    int[] r;
    int[] s;
    int[][] t;
    int[][] u;
    public boolean v = false;
    int[] w;
    int x;
    static byte[] y = new byte[1];
    int z;
    int A;
    int B;
    int C;
    static int D;
    static int E;
    static int F;
    public static int G;
    static cB H;
    static cB I;
    static byte[] J;
    static boolean[] K;
    static boolean[] L;
    static int[] M;
    static int[] N;
    static int[] O;
    static int[] P;
    static int[] Q;
    static int[] R;
    static int[] S;
    static int[][] T;
    static int[] U;
    static int[][] V;
    static int[] W;
    static int[] X;
    static int[] Y;
    static int[] Z;
    static int[] aa;
    static int[] ab;
    public static boolean ac;
    public static int ad;
    public static int ae;
    public static int[] af;
    static int[] ag;
    static int[] ah;
    static int[] ai;
    static int[] aj;

    public cB a(int[][] arrn, int n2, int n3, int n4, boolean bl2, int n5) {
        this.a();
        int n6 = n2 - this.A;
        int n7 = n2 + this.A;
        int n8 = n4 - this.A;
        int n9 = n4 + this.A;
        if (n6 >= 0 && n7 + 128 >> 7 < arrn.length && n8 >= 0 && n9 + 128 >> 7 < arrn[0].length) {
            cB cB2;
            n7 = n7 + 127 >> 7;
            n9 = n9 + 127 >> 7;
            if (arrn[n6 >>= 7][n8 >>= 7] == n3 && arrn[n7][n8] == n3 && arrn[n6][n9] == n3 && arrn[n7][n9] == n3) {
                return this;
            }
            if (bl2) {
                cB2 = new cB();
                cB2.a = this.a;
                cB2.b = this.b;
                cB2.c = this.c;
                cB2.d = this.d;
                cB2.e = this.e;
                cB2.f = this.f;
                cB2.g = this.g;
                cB2.h = this.h;
                cB2.i = this.i;
                cB2.j = this.j;
                cB2.k = this.k;
                cB2.l = this.l;
                cB2.m = this.m;
                cB2.n = this.n;
                cB2.o = this.o;
                cB2.p = this.p;
                cB2.q = this.q;
                cB2.r = this.r;
                cB2.s = this.s;
                cB2.t = this.t;
                cB2.u = this.u;
                cB2.v = this.v;
                cB2.w = new int[cB2.a];
            } else {
                cB2 = this;
            }
            if (n5 == 0) {
                for (int i2 = 0; i2 < cB2.a; ++i2) {
                    int n10 = this.d[i2] + n2;
                    int n11 = this.e[i2] + n4;
                    int n12 = n10 & 127;
                    int n13 = n11 & 127;
                    int n14 = n10 >> 7;
                    int n15 = n11 >> 7;
                    int n16 = arrn[n14][n15] * (128 - n12) + arrn[n14 + 1][n15] * n12 >> 7;
                    int n17 = arrn[n14][n15 + 1] * (128 - n12) + arrn[n14 + 1][n15 + 1] * n12 >> 7;
                    int n18 = n16 * (128 - n13) + n17 * n13 >> 7;
                    cB2.w[i2] = this.w[i2] + n18 - n3;
                }
            } else {
                for (int i3 = 0; i3 < cB2.a; ++i3) {
                    int n19 = (- this.w[i3] << 16) / (this.aN * -695779227);
                    if (n19 >= n5) continue;
                    int n20 = this.d[i3] + n2;
                    int n21 = this.e[i3] + n4;
                    int n22 = n20 & 127;
                    int n23 = n21 & 127;
                    int n24 = n20 >> 7;
                    int n25 = n21 >> 7;
                    int n26 = arrn[n24][n25] * (128 - n22) + arrn[n24 + 1][n25] * n22 >> 7;
                    int n27 = arrn[n24][n25 + 1] * (128 - n22) + arrn[n24 + 1][n25 + 1] * n22 >> 7;
                    int n28 = n26 * (128 - n23) + n27 * n23 >> 7;
                    cB2.w[i3] = this.w[i3] + (n28 - n3) * (n5 - n19) / n5;
                }
            }
            cB2.x = 0;
            return cB2;
        }
        return this;
    }

    public cB a(boolean bl2) {
        if (!bl2 && y.length < this.b) {
            y = new byte[this.b + 100];
        }
        return this.a(bl2, H, y);
    }

    cB a(boolean bl2, cB cB2, byte[] arrby) {
        int n2;
        cB2.a = this.a;
        cB2.b = this.b;
        cB2.c = this.c;
        if (cB2.d == null || cB2.d.length < this.a) {
            cB2.d = new int[this.a + 100];
            cB2.w = new int[this.a + 100];
            cB2.e = new int[this.a + 100];
        }
        for (n2 = 0; n2 < this.a; ++n2) {
            cB2.d[n2] = this.d[n2];
            cB2.w[n2] = this.w[n2];
            cB2.e[n2] = this.e[n2];
        }
        if (bl2) {
            cB2.m = this.m;
        } else {
            cB2.m = arrby;
            if (this.m == null) {
                for (n2 = 0; n2 < this.b; ++n2) {
                    cB2.m[n2] = 0;
                }
            } else {
                for (n2 = 0; n2 < this.b; ++n2) {
                    cB2.m[n2] = this.m[n2];
                }
            }
        }
        cB2.f = this.f;
        cB2.g = this.g;
        cB2.h = this.h;
        cB2.i = this.i;
        cB2.j = this.j;
        cB2.k = this.k;
        cB2.l = this.l;
        cB2.n = this.n;
        cB2.o = this.o;
        cB2.p = this.p;
        cB2.q = this.q;
        cB2.r = this.r;
        cB2.s = this.s;
        cB2.t = this.t;
        cB2.u = this.u;
        cB2.v = this.v;
        cB2.x = 0;
        return cB2;
    }

    public void a() {
        if (this.x != 1) {
            this.x = 1;
            this.aN = 0;
            this.z = 0;
            this.A = 0;
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n2;
                int n3 = this.d[i2];
                int n4 = this.w[i2];
                int n5 = this.e[i2];
                if (- n4 > this.aN * -695779227) {
                    this.aN = (- n4) * -54955667;
                }
                if (n4 > this.z) {
                    this.z = n4;
                }
                if ((n2 = n3 * n3 + n5 * n5) <= this.A) continue;
                this.A = n2;
            }
            this.A = (int)(Math.sqrt(this.A) + 0.99);
            this.B = (int)(Math.sqrt(this.A * this.A + this.aN * -695779227 * this.aN * -695779227) + 0.99);
            this.C = this.B + (int)(Math.sqrt(this.A * this.A + this.z * this.z) + 0.99);
        }
    }

    void c() {
        if (this.x != 2) {
            this.x = 2;
            this.A = 0;
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n2 = this.d[i2];
                int n3 = this.e[i2];
                int n4 = this.w[i2];
                int n5 = n2 * n2 + n3 * n3 + n4 * n4;
                if (n5 <= this.A) continue;
                this.A = n5;
            }
            this.B = this.A = (int)(Math.sqrt(this.A) + 0.99);
            this.C = this.A + this.A;
        }
    }

    public int d() {
        this.a();
        return this.A;
    }

    public void a(f f2, int n2) {
        if (this.t != null && n2 != -1) {
            e e2 = f2.c[n2];
            g g2 = e2.e;
            D = 0;
            E = 0;
            F = 0;
            for (int i2 = 0; i2 < e2.f; ++i2) {
                int n3 = e2.h[i2];
                this.a(g2.e[n3], g2.f[n3], e2.i[i2], e2.j[i2], e2.k[i2]);
            }
            this.x = 0;
        }
    }

    public void a(f f2, int n2, f f3, int n3, int[] arrn) {
        if (n2 != -1) {
            if (arrn != null && n3 != -1) {
                int n4;
                int n5;
                e e2 = f2.c[n2];
                e e3 = f3.c[n3];
                g g2 = e2.e;
                D = 0;
                E = 0;
                F = 0;
                int n6 = 0;
                int n7 = n6 + 1;
                int n8 = arrn[n6];
                for (n4 = 0; n4 < e2.f; ++n4) {
                    n5 = e2.h[n4];
                    while (n5 > n8) {
                        n8 = arrn[n7++];
                    }
                    if (n5 == n8 && g2.e[n5] != 0) continue;
                    this.a(g2.e[n5], g2.f[n5], e2.i[n4], e2.j[n4], e2.k[n4]);
                }
                D = 0;
                E = 0;
                F = 0;
                n6 = 0;
                n7 = n6 + 1;
                n8 = arrn[n6];
                for (n4 = 0; n4 < e3.f; ++n4) {
                    n5 = e3.h[n4];
                    while (n5 > n8) {
                        n8 = arrn[n7++];
                    }
                    if (n5 != n8 && g2.e[n5] != 0) continue;
                    this.a(g2.e[n5], g2.f[n5], e3.i[n4], e3.j[n4], e3.k[n4]);
                }
                this.x = 0;
            } else {
                this.a(f2, n2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(int n2, int[] arrn, int n3, int n4, int n5) {
        int n6 = arrn.length;
        if (n2 == 0) {
            int n7 = 0;
            D = 0;
            E = 0;
            F = 0;
            for (int i2 = 0; i2 < n6; ++i2) {
                int n8 = arrn[i2];
                if (n8 >= this.t.length) continue;
                int[] arrn2 = this.t[n8];
                for (int i3 = 0; i3 < arrn2.length; ++i3) {
                    int n9 = arrn2[i3];
                    D += this.d[n9];
                    E += this.w[n9];
                    F += this.e[n9];
                    ++n7;
                }
            }
            if (n7 > 0) {
                D = D / n7 + n3;
                E = E / n7 + n4;
                F = F / n7 + n5;
                return;
            } else {
                D = n3;
                E = n4;
                F = n5;
            }
            return;
        } else {
            if (n2 == 1) {
                int n10 = 0;
                while (n10 < n6) {
                    int n11 = arrn[n10];
                    if (n11 < this.t.length) {
                        int[] arrn3 = this.t[n11];
                        for (int i4 = 0; i4 < arrn3.length; ++i4) {
                            int n12 = arrn3[i4];
                            int[] arrn4 = this.d;
                            int n13 = n12;
                            arrn4[n13] = arrn4[n13] + n3;
                            int[] arrn5 = this.w;
                            int n14 = n12;
                            arrn5[n14] = arrn5[n14] + n4;
                            int[] arrn6 = this.e;
                            int n15 = n12;
                            arrn6[n15] = arrn6[n15] + n5;
                        }
                    }
                    ++n10;
                }
                return;
            }
            if (n2 == 2) {
                int n16 = 0;
                while (n16 < n6) {
                    int n17 = arrn[n16];
                    if (n17 < this.t.length) {
                        int[] arrn7 = this.t[n17];
                        for (int i5 = 0; i5 < arrn7.length; ++i5) {
                            int n18;
                            int n19;
                            int n20;
                            int n21 = arrn7[i5];
                            int[] arrn8 = this.d;
                            int n22 = n21;
                            arrn8[n22] = arrn8[n22] - D;
                            int[] arrn9 = this.w;
                            int n23 = n21;
                            arrn9[n23] = arrn9[n23] - E;
                            int[] arrn10 = this.e;
                            int n24 = n21;
                            arrn10[n24] = arrn10[n24] - F;
                            int n25 = (n3 & 255) * 8;
                            int n26 = (n4 & 255) * 8;
                            int n27 = (n5 & 255) * 8;
                            if (n27 != 0) {
                                n19 = ag[n27];
                                n18 = ah[n27];
                                n20 = this.w[n21] * n19 + this.d[n21] * n18 >> 16;
                                this.w[n21] = this.w[n21] * n18 - this.d[n21] * n19 >> 16;
                                this.d[n21] = n20;
                            }
                            if (n25 != 0) {
                                n19 = ag[n25];
                                n18 = ah[n25];
                                n20 = this.w[n21] * n18 - this.e[n21] * n19 >> 16;
                                this.e[n21] = this.w[n21] * n19 + this.e[n21] * n18 >> 16;
                                this.w[n21] = n20;
                            }
                            if (n26 != 0) {
                                n19 = ag[n26];
                                n18 = ah[n26];
                                n20 = this.e[n21] * n19 + this.d[n21] * n18 >> 16;
                                this.e[n21] = this.e[n21] * n18 - this.d[n21] * n19 >> 16;
                                this.d[n21] = n20;
                            }
                            int[] arrn11 = this.d;
                            int n28 = n21;
                            arrn11[n28] = arrn11[n28] + D;
                            int[] arrn12 = this.w;
                            int n29 = n21;
                            arrn12[n29] = arrn12[n29] + E;
                            int[] arrn13 = this.e;
                            int n30 = n21;
                            arrn13[n30] = arrn13[n30] + F;
                        }
                    }
                    ++n16;
                }
                return;
            }
            if (n2 == 3) {
                int n31 = 0;
                while (n31 < n6) {
                    int n32 = arrn[n31];
                    if (n32 < this.t.length) {
                        int[] arrn14 = this.t[n32];
                        for (int i6 = 0; i6 < arrn14.length; ++i6) {
                            int n33 = arrn14[i6];
                            int[] arrn15 = this.d;
                            int n34 = n33;
                            arrn15[n34] = arrn15[n34] - D;
                            int[] arrn16 = this.w;
                            int n35 = n33;
                            arrn16[n35] = arrn16[n35] - E;
                            int[] arrn17 = this.e;
                            int n36 = n33;
                            arrn17[n36] = arrn17[n36] - F;
                            this.d[n33] = this.d[n33] * n3 / 128;
                            this.w[n33] = this.w[n33] * n4 / 128;
                            this.e[n33] = this.e[n33] * n5 / 128;
                            int[] arrn18 = this.d;
                            int n37 = n33;
                            arrn18[n37] = arrn18[n37] + D;
                            int[] arrn19 = this.w;
                            int n38 = n33;
                            arrn19[n38] = arrn19[n38] + E;
                            int[] arrn20 = this.e;
                            int n39 = n33;
                            arrn20[n39] = arrn20[n39] + F;
                        }
                    }
                    ++n31;
                }
                return;
            }
            if (n2 != 5 || this.u == null || this.m == null) return;
            int n40 = 0;
            while (n40 < n6) {
                int n41 = arrn[n40];
                if (n41 < this.u.length) {
                    int[] arrn21 = this.u[n41];
                    for (int i7 = 0; i7 < arrn21.length; ++i7) {
                        int n42 = arrn21[i7];
                        int n43 = (this.m[n42] & 255) + n3 * 8;
                        if (n43 < 0) {
                            n43 = 0;
                        } else if (n43 > 255) {
                            n43 = 255;
                        }
                        this.m[n42] = (byte)n43;
                    }
                }
                ++n40;
            }
            return;
        }
    }

    public void e() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n2 = this.d[i2];
            this.d[i2] = this.e[i2];
            this.e[i2] = - n2;
        }
        this.x = 0;
    }

    public void f() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.d[i2] = - this.d[i2];
            this.e[i2] = - this.e[i2];
        }
        this.x = 0;
    }

    public void g() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n2 = this.e[i2];
            this.e[i2] = this.d[i2];
            this.d[i2] = - n2;
        }
        this.x = 0;
    }

    public void b(int n2) {
        int n3 = ag[n2];
        int n4 = ah[n2];
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n5 = this.w[i2] * n4 - this.e[i2] * n3 >> 16;
            this.e[i2] = this.w[i2] * n3 + this.e[i2] * n4 >> 16;
            this.w[i2] = n5;
        }
        this.x = 0;
    }

    public void a(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.a; ++i2) {
            this.d[i2] = this.d[i2] * n2 / 128;
            this.w[i2] = this.w[i2] * n3 / 128;
            this.e[i2] = this.e[i2] * n4 / 128;
        }
        this.x = 0;
    }

    public final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        cB.S[0] = -1;
        if (this.x != 2 && this.x != 1) {
            this.c();
        }
        int n9 = de.d;
        int n10 = de.e;
        int n11 = ag[n2];
        int n12 = ah[n2];
        int n13 = ag[n3];
        int n14 = ah[n3];
        int n15 = ag[n4];
        int n16 = ah[n4];
        int n17 = ag[n5];
        int n18 = ah[n5];
        int n19 = n7 * n17 + n8 * n18 >> 16;
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n20;
            int n21 = this.d[i2];
            int n22 = this.w[i2];
            int n23 = this.e[i2];
            if (n4 != 0) {
                n20 = n22 * n15 + n21 * n16 >> 16;
                n22 = n22 * n16 - n21 * n15 >> 16;
                n21 = n20;
            }
            if (n2 != 0) {
                n20 = n22 * n12 - n23 * n11 >> 16;
                n23 = n22 * n11 + n23 * n12 >> 16;
                n22 = n20;
            }
            if (n3 != 0) {
                n20 = n23 * n13 + n21 * n14 >> 16;
                n23 = n23 * n14 - n21 * n13 >> 16;
                n21 = n20;
            }
            n20 = (n22 += n7) * n18 - (n23 += n8) * n17 >> 16;
            n23 = n22 * n17 + n23 * n18 >> 16;
            cB.O[i2] = n23 - n19;
            cB.M[i2] = n9 + (n21 += n6) * de.p / n23;
            cB.N[i2] = n10 + n20 * de.p / n23;
            if (this.c <= 0) continue;
            cB.P[i2] = n21;
            cB.Q[i2] = n20;
            cB.R[i2] = n23;
        }
        try {
            this.a(false, false, 0);
        }
        catch (Exception var19_20) {
            // empty catch block
        }
    }

    cB() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void a(boolean bl2, boolean bl3, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        if (this.C >= 1600) return;
        for (n10 = 0; n10 < this.C; ++n10) {
            cB.S[n10] = 0;
        }
        for (n10 = 0; n10 < this.b; ++n10) {
            int n13;
            int n14;
            int n15;
            if (this.k[n10] == -2) continue;
            n4 = this.f[n10];
            n8 = this.g[n10];
            n7 = this.h[n10];
            n3 = M[n4];
            n11 = M[n8];
            int n16 = M[n7];
            if (!bl2 || n3 != -5000 && n11 != -5000 && n16 != -5000) {
                if (bl3 && this.a(ad, ae, N[n4], N[n8], N[n7], n3, n11, n16)) {
                    cB.af[cB.G++] = n2;
                    bl3 = false;
                }
                if ((n3 - n11) * (N[n7] - N[n8]) - (N[n4] - N[n8]) * (n16 - n11) <= 0) continue;
                cB.L[n10] = false;
                cB.K[n10] = n3 < 0 || n11 < 0 || n16 < 0 || n3 > de.a || n11 > de.a || n16 > de.a;
                n15 = (O[n4] + O[n8] + O[n7]) / 3 + this.B;
                int[] arrn = S;
                int n17 = n15;
                int n18 = arrn[n17];
                arrn[n17] = n18 + 1;
                cB.T[n15][n18] = n10;
                continue;
            }
            n15 = P[n4];
            n12 = P[n8];
            n9 = P[n7];
            n5 = Q[n4];
            n6 = Q[n8];
            int n19 = Q[n7];
            int n20 = R[n4];
            int n21 = R[n8];
            int n22 = R[n7];
            int n23 = (n5 -= n6) * (n22 -= n21) - (n20 -= n21) * (n19 -= n6);
            if (n12 * n23 + n6 * (n13 = n20 * (n9 -= n12) - (n15 -= n12) * n22) + n21 * (n14 = n15 * n19 - n5 * n9) <= 0) continue;
            cB.L[n10] = true;
            int n24 = (O[n4] + O[n8] + O[n7]) / 3 + this.B;
            int[] arrn = S;
            int n25 = n24;
            int n26 = arrn[n25];
            arrn[n25] = n26 + 1;
            cB.T[n24][n26] = n10;
        }
        if (this.l == null) {
            for (n10 = this.C - 1; n10 >= 0; --n10) {
                n4 = S[n10];
                if (n4 <= 0) continue;
                int[] arrn = T[n10];
                for (n7 = 0; n7 < n4; ++n7) {
                    this.c(arrn[n7]);
                }
            }
            return;
        } else {
            for (n10 = 0; n10 < 12; ++n10) {
                cB.U[n10] = 0;
                cB.Y[n10] = 0;
            }
            for (n10 = this.C - 1; n10 >= 0; --n10) {
                n4 = S[n10];
                if (n4 <= 0) continue;
                int[] arrn = T[n10];
                for (n7 = 0; n7 < n4; ++n7) {
                    n3 = arrn[n7];
                    n5 = this.l[n3];
                    int[] arrn2 = U;
                    int n27 = n5;
                    arrn2[n27] = arrn2[n27] + 1;
                    cB.V[n5][n16] = n3;
                    if (n5 < 10) {
                        int[] arrn3 = Y;
                        int n28 = n5;
                        arrn3[n28] = arrn3[n28] + n10;
                        continue;
                    }
                    if (n5 == 10) {
                        cB.W[n16] = n10;
                        continue;
                    }
                    cB.X[n16] = n10;
                }
            }
            n10 = 0;
            if (U[1] > 0 || U[2] > 0) {
                n10 = (Y[1] + Y[2]) / (U[1] + U[2]);
            }
            n4 = 0;
            if (U[3] > 0 || U[4] > 0) {
                n4 = (Y[3] + Y[4]) / (U[3] + U[4]);
            }
            n8 = 0;
            if (U[6] > 0 || U[8] > 0) {
                n8 = (Y[6] + Y[8]) / (U[6] + U[8]);
            }
            n3 = 0;
            n11 = U[10];
            int[] arrn = V[10];
            int[] arrn4 = W;
            if (n3 == n11) {
                n3 = 0;
                n11 = U[11];
                arrn = V[11];
                arrn4 = X;
            }
            n7 = n3 < n11 ? arrn4[n3] : -1000;
            n12 = 0;
            while (n12 < 10) {
                while (n12 == 0 && n7 > n10) {
                    this.c(arrn[n3++]);
                    if (n3 == n11 && arrn != V[11]) {
                        n3 = 0;
                        n11 = U[11];
                        arrn = V[11];
                        arrn4 = X;
                    }
                    if (n3 < n11) {
                        n7 = arrn4[n3];
                        continue;
                    }
                    n7 = -1000;
                }
                while (n12 == 3 && n7 > n4) {
                    this.c(arrn[n3++]);
                    if (n3 == n11 && arrn != V[11]) {
                        n3 = 0;
                        n11 = U[11];
                        arrn = V[11];
                        arrn4 = X;
                    }
                    if (n3 < n11) {
                        n7 = arrn4[n3];
                        continue;
                    }
                    n7 = -1000;
                }
                while (n12 == 5 && n7 > n8) {
                    this.c(arrn[n3++]);
                    if (n3 == n11 && arrn != V[11]) {
                        n3 = 0;
                        n11 = U[11];
                        arrn = V[11];
                        arrn4 = X;
                    }
                    if (n3 < n11) {
                        n7 = arrn4[n3];
                        continue;
                    }
                    n7 = -1000;
                }
                n9 = U[n12];
                int[] arrn5 = V[n12];
                for (n6 = 0; n6 < n9; ++n6) {
                    this.c(arrn5[n6]);
                }
                ++n12;
            }
            return;
        }
    }

    public void b(int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.a) {
            int[] arrn = this.d;
            int n6 = n5;
            arrn[n6] = arrn[n6] + n2;
            int[] arrn2 = this.w;
            int n7 = n5;
            arrn2[n7] = arrn2[n7] + n3;
            int[] arrn3 = this.e;
            int n8 = n5++;
            arrn3[n8] = arrn3[n8] + n4;
        }
        this.x = 0;
    }

    final boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        return n3 < n4 && n3 < n5 && n3 < n6 ? false : (n3 > n4 && n3 > n5 && n3 > n6 ? false : (n2 < n7 && n2 < n8 && n2 < n9 ? false : n2 <= n7 || n2 <= n8 || n2 <= n9));
    }

    final void c(int n2) {
        if (L[n2]) {
            this.d(n2);
        } else {
            int n3 = this.f[n2];
            int n4 = this.g[n2];
            int n5 = this.h[n2];
            de.k = K[n2];
            de.o = this.m == null ? 0 : this.m[n2] & 255;
            if (this.o != null && this.o[n2] != -1) {
                int n6;
                int n7;
                int n8;
                if (this.n != null && this.n[n2] != -1) {
                    int n9 = this.n[n2] & 255;
                    n6 = this.q[n9];
                    n8 = this.r[n9];
                    n7 = this.s[n9];
                } else {
                    n6 = n3;
                    n8 = n4;
                    n7 = n5;
                }
                if (this.k[n2] == -1) {
                    de.b(N[n3], N[n4], N[n5], M[n3], M[n4], M[n5], this.i[n2], this.i[n2], this.i[n2], P[n6], P[n8], P[n7], Q[n6], Q[n8], Q[n7], R[n6], R[n8], R[n7], this.o[n2]);
                } else {
                    de.b(N[n3], N[n4], N[n5], M[n3], M[n4], M[n5], this.i[n2], this.j[n2], this.k[n2], P[n6], P[n8], P[n7], Q[n6], Q[n8], Q[n7], R[n6], R[n8], R[n7], this.o[n2]);
                }
            } else if (this.k[n2] == -1) {
                de.a(N[n3], N[n4], N[n5], M[n3], M[n4], M[n5], ai[this.i[n2]]);
            } else {
                de.a(N[n3], N[n4], N[n5], M[n3], M[n4], M[n5], this.i[n2], this.j[n2], this.k[n2]);
            }
        }
    }

    public final void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        cB.S[0] = -1;
        if (this.x != 2 && this.x != 1) {
            this.c();
        }
        int n10 = de.d;
        int n11 = de.e;
        int n12 = ag[n2];
        int n13 = ah[n2];
        int n14 = ag[n3];
        int n15 = ah[n3];
        int n16 = ag[n4];
        int n17 = ah[n4];
        int n18 = ag[n5];
        int n19 = ah[n5];
        int n20 = n7 * n18 + n8 * n19 >> 16;
        for (int i2 = 0; i2 < this.a; ++i2) {
            int n21;
            int n22 = this.d[i2];
            int n23 = this.w[i2];
            int n24 = this.e[i2];
            if (n4 != 0) {
                n21 = n23 * n16 + n22 * n17 >> 16;
                n23 = n23 * n17 - n22 * n16 >> 16;
                n22 = n21;
            }
            if (n2 != 0) {
                n21 = n23 * n13 - n24 * n12 >> 16;
                n24 = n23 * n12 + n24 * n13 >> 16;
                n23 = n21;
            }
            if (n3 != 0) {
                n21 = n24 * n14 + n22 * n15 >> 16;
                n24 = n24 * n15 - n22 * n14 >> 16;
                n22 = n21;
            }
            n21 = (n23 += n7) * n19 - (n24 += n8) * n18 >> 16;
            n24 = n23 * n18 + n24 * n19 >> 16;
            cB.O[i2] = n24 - n20;
            cB.M[i2] = n10 + (n22 += n6) * de.p / n9;
            cB.N[i2] = n11 + n21 * de.p / n9;
            if (this.c <= 0) continue;
            cB.P[i2] = n22;
            cB.Q[i2] = n21;
            cB.R[i2] = n24;
        }
        try {
            this.a(false, false, 0);
        }
        catch (Exception var20_21) {
            // empty catch block
        }
    }

    final void d(int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = de.d;
        int n12 = de.e;
        int n13 = 0;
        int n14 = this.f[n2];
        int n15 = this.g[n2];
        int n16 = this.h[n2];
        int n17 = R[n14];
        int n18 = R[n15];
        int n19 = R[n16];
        de.o = this.m == null ? 0 : this.m[n2] & 255;
        if (n17 >= 50) {
            cB.Z[n13] = M[n14];
            cB.aa[n13] = N[n14];
            cB.ab[n13++] = this.i[n2];
        } else {
            n5 = P[n14];
            n10 = Q[n14];
            n8 = this.i[n2];
            if (n19 >= 50) {
                n3 = (50 - n17) * aj[n19 - n17];
                cB.Z[n13] = n11 + (n5 + ((P[n16] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n16] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.k[n2] - n8) * n3 >> 16);
            }
            if (n18 >= 50) {
                n3 = (50 - n17) * aj[n18 - n17];
                cB.Z[n13] = n11 + (n5 + ((P[n15] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n15] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.j[n2] - n8) * n3 >> 16);
            }
        }
        if (n18 >= 50) {
            cB.Z[n13] = M[n15];
            cB.aa[n13] = N[n15];
            cB.ab[n13++] = this.j[n2];
        } else {
            n5 = P[n15];
            n10 = Q[n15];
            n8 = this.j[n2];
            if (n17 >= 50) {
                n3 = (50 - n18) * aj[n17 - n18];
                cB.Z[n13] = n11 + (n5 + ((P[n14] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n14] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.i[n2] - n8) * n3 >> 16);
            }
            if (n19 >= 50) {
                n3 = (50 - n18) * aj[n19 - n18];
                cB.Z[n13] = n11 + (n5 + ((P[n16] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n16] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.k[n2] - n8) * n3 >> 16);
            }
        }
        if (n19 >= 50) {
            cB.Z[n13] = M[n16];
            cB.aa[n13] = N[n16];
            cB.ab[n13++] = this.k[n2];
        } else {
            n5 = P[n16];
            n10 = Q[n16];
            n8 = this.k[n2];
            if (n18 >= 50) {
                n3 = (50 - n19) * aj[n18 - n19];
                cB.Z[n13] = n11 + (n5 + ((P[n15] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n15] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.j[n2] - n8) * n3 >> 16);
            }
            if (n17 >= 50) {
                n3 = (50 - n19) * aj[n17 - n19];
                cB.Z[n13] = n11 + (n5 + ((P[n14] - n5) * n3 >> 16)) * de.p / 50;
                cB.aa[n13] = n12 + (n10 + ((Q[n14] - n10) * n3 >> 16)) * de.p / 50;
                cB.ab[n13++] = n8 + ((this.i[n2] - n8) * n3 >> 16);
            }
        }
        n5 = Z[0];
        n10 = Z[1];
        n8 = Z[2];
        n3 = aa[0];
        int n20 = aa[1];
        int n21 = aa[2];
        de.k = false;
        if (n13 == 3) {
            if (n5 < 0 || n10 < 0 || n8 < 0 || n5 > de.a || n10 > de.a || n8 > de.a) {
                de.k = true;
            }
            if (this.o != null && this.o[n2] != -1) {
                if (this.n != null && this.n[n2] != -1) {
                    n4 = this.n[n2] & 255;
                    n9 = this.q[n4];
                    n6 = this.r[n4];
                    n7 = this.s[n4];
                } else {
                    n9 = n14;
                    n6 = n15;
                    n7 = n16;
                }
                if (this.k[n2] == -1) {
                    de.b(n3, n20, n21, n5, n10, n8, this.i[n2], this.i[n2], this.i[n2], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], this.o[n2]);
                } else {
                    de.b(n3, n20, n21, n5, n10, n8, ab[0], ab[1], ab[2], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], this.o[n2]);
                }
            } else if (this.k[n2] == -1) {
                de.a(n3, n20, n21, n5, n10, n8, ai[this.i[n2]]);
            } else {
                de.a(n3, n20, n21, n5, n10, n8, ab[0], ab[1], ab[2]);
            }
        }
        if (n13 == 4) {
            if (n5 < 0 || n10 < 0 || n8 < 0 || n5 > de.a || n10 > de.a || n8 > de.a || Z[3] < 0 || Z[3] > de.a) {
                de.k = true;
            }
            if (this.o != null && this.o[n2] != -1) {
                if (this.n != null && this.n[n2] != -1) {
                    n4 = this.n[n2] & 255;
                    n9 = this.q[n4];
                    n6 = this.r[n4];
                    n7 = this.s[n4];
                } else {
                    n9 = n14;
                    n6 = n15;
                    n7 = n16;
                }
                short s2 = this.o[n2];
                if (this.k[n2] == -1) {
                    de.b(n3, n20, n21, n5, n10, n8, this.i[n2], this.i[n2], this.i[n2], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], s2);
                    de.b(n3, n21, aa[3], n5, n8, Z[3], this.i[n2], this.i[n2], this.i[n2], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], s2);
                } else {
                    de.b(n3, n20, n21, n5, n10, n8, ab[0], ab[1], ab[2], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], s2);
                    de.b(n3, n21, aa[3], n5, n8, Z[3], ab[0], ab[2], ab[3], P[n9], P[n6], P[n7], Q[n9], Q[n6], Q[n7], R[n9], R[n6], R[n7], s2);
                }
            } else if (this.k[n2] == -1) {
                n9 = ai[this.i[n2]];
                de.a(n3, n20, n21, n5, n10, n8, n9);
                de.a(n3, n21, aa[3], n5, n8, Z[3], n9);
            } else {
                de.a(n3, n20, n21, n5, n10, n8, ab[0], ab[1], ab[2]);
                de.a(n3, n21, aa[3], n5, n8, Z[3], ab[0], ab[2], ab[3]);
            }
        }
    }

    public cB(cB[] arrcB, int n2) {
        cB cB2;
        int n3;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.p = -1;
        for (n3 = 0; n3 < n2; ++n3) {
            cB2 = arrcB[n3];
            if (cB2 == null) continue;
            this.a += cB2.a;
            this.b += cB2.b;
            this.c += cB2.c;
            if (cB2.l != null) {
                bl2 = true;
            } else {
                if (this.p == -1) {
                    this.p = cB2.p;
                }
                if (this.p != cB2.p) {
                    bl2 = true;
                }
            }
            bl3 |= cB2.m != null;
            bl4 |= cB2.o != null;
            bl5 |= cB2.n != null;
        }
        this.d = new int[this.a];
        this.w = new int[this.a];
        this.e = new int[this.a];
        this.f = new int[this.b];
        this.g = new int[this.b];
        this.h = new int[this.b];
        this.i = new int[this.b];
        this.j = new int[this.b];
        this.k = new int[this.b];
        if (bl2) {
            this.l = new byte[this.b];
        }
        if (bl3) {
            this.m = new byte[this.b];
        }
        if (bl4) {
            this.o = new short[this.b];
        }
        if (bl5) {
            this.n = new byte[this.b];
        }
        if (this.c > 0) {
            this.q = new int[this.c];
            this.r = new int[this.c];
            this.s = new int[this.c];
        }
        this.a = 0;
        this.b = 0;
        this.c = 0;
        for (n3 = 0; n3 < n2; ++n3) {
            int n4;
            cB2 = arrcB[n3];
            if (cB2 == null) continue;
            for (n4 = 0; n4 < cB2.b; ++n4) {
                this.f[this.b] = cB2.f[n4] + this.a;
                this.g[this.b] = cB2.g[n4] + this.a;
                this.h[this.b] = cB2.h[n4] + this.a;
                this.i[this.b] = cB2.i[n4];
                this.j[this.b] = cB2.j[n4];
                this.k[this.b] = cB2.k[n4];
                if (bl2) {
                    this.l[this.b] = cB2.l != null ? cB2.l[n4] : cB2.p;
                }
                if (bl3 && cB2.m != null) {
                    this.m[this.b] = cB2.m[n4];
                }
                if (bl4) {
                    this.o[this.b] = cB2.o != null ? cB2.o[n4] : -1;
                }
                if (bl5) {
                    this.n[this.b] = cB2.n != null && cB2.n[n4] != -1 ? (byte)(cB2.n[n4] + this.c) : -1;
                }
                ++this.b;
            }
            for (n4 = 0; n4 < cB2.c; ++n4) {
                this.q[this.c] = cB2.q[n4] + this.a;
                this.r[this.c] = cB2.r[n4] + this.a;
                this.s[this.c] = cB2.s[n4] + this.a;
                ++this.c;
            }
            for (n4 = 0; n4 < cB2.a; ++n4) {
                this.d[this.a] = cB2.d[n4];
                this.w[this.a] = cB2.w[n4];
                this.e[this.a] = cB2.e[n4];
                ++this.a;
            }
        }
    }

    public cB b(boolean bl2) {
        if (!bl2 && J.length < this.b) {
            J = new byte[this.b + 100];
        }
        return this.a(bl2, I, J);
    }

    @Override
    void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        cB.S[0] = -1;
        if (this.x != 1) {
            this.a();
        }
        if ((n17 = (n18 = n8 * n3 + (n14 = n9 * n6 - n7 * n5 >> 16) * n4 >> 16) + (n11 = this.A * n4 >> 16)) > 50 && n18 < 3500 && (n12 = ((n21 = n9 * n5 + n7 * n6 >> 16) - this.A) * de.p) / n17 < de.g && (n19 = (n21 + this.A) * de.p) / n17 > de.f && (n22 = ((n13 = n8 * n4 - n14 * n3 >> 16) + (n15 = this.A * n3 >> 16)) * de.p) / n17 > de.h && (n16 = (n13 - (n20 = n15 + (this.aN * -695779227 * n4 >> 16))) * de.p) / n17 < de.i) {
            int n23;
            int n24;
            int n25;
            int n26 = n11 + (this.aN * -695779227 * n3 >> 16);
            boolean bl2 = false;
            boolean bl3 = false;
            if (n18 - n26 <= 50) {
                bl3 = true;
            }
            boolean bl4 = bl3 || this.c > 0;
            boolean bl5 = false;
            if (n10 > 0 && ac) {
                n24 = n18 - n11;
                if (n24 <= 50) {
                    n24 = 50;
                }
                if (n21 > 0) {
                    n12 /= n17;
                    n19 /= n24;
                } else {
                    n19 /= n17;
                    n12 /= n24;
                }
                if (n13 > 0) {
                    n16 /= n17;
                    n22 /= n24;
                } else {
                    n22 /= n17;
                    n16 /= n24;
                }
                n23 = ad - de.d;
                n25 = ae - de.e;
                if (n23 > n12 && n23 < n19 && n25 > n16 && n25 < n22) {
                    if (this.v) {
                        cB.af[cB.G++] = n10;
                    } else {
                        bl5 = true;
                    }
                }
            }
            n24 = de.d;
            n23 = de.e;
            n25 = 0;
            int n27 = 0;
            if (n2 != 0) {
                n25 = ag[n2];
                n27 = ah[n2];
            }
            for (int i2 = 0; i2 < this.a; ++i2) {
                int n28;
                int n29 = this.d[i2];
                int n30 = this.w[i2];
                int n31 = this.e[i2];
                if (n2 != 0) {
                    n28 = n31 * n25 + n29 * n27 >> 16;
                    n31 = n31 * n27 - n29 * n25 >> 16;
                    n29 = n28;
                }
                n28 = (n31 += n9) * n5 + (n29 += n7) * n6 >> 16;
                n31 = n31 * n6 - n29 * n5 >> 16;
                n29 = n28;
                n28 = (n30 += n8) * n4 - n31 * n3 >> 16;
                n31 = n30 * n3 + n31 * n4 >> 16;
                cB.O[i2] = n31 - n18;
                if (n31 >= 50) {
                    cB.M[i2] = n24 + n29 * de.p / n31;
                    cB.N[i2] = n23 + n28 * de.p / n31;
                } else {
                    cB.M[i2] = -5000;
                    bl2 = true;
                }
                if (!bl4) continue;
                cB.P[i2] = n29;
                cB.Q[i2] = n28;
                cB.R[i2] = n31;
            }
            try {
                this.a(bl2, bl5, n10);
            }
            catch (Exception var31_32) {
                // empty catch block
            }
        }
    }

    static {
        G = 0;
        H = new cB();
        I = new cB();
        J = new byte[1];
        K = new boolean[4096];
        L = new boolean[4096];
        M = new int[4096];
        N = new int[4096];
        O = new int[4096];
        P = new int[4096];
        Q = new int[4096];
        R = new int[4096];
        S = new int[1600];
        T = new int[1600][512];
        U = new int[12];
        V = new int[12][2000];
        W = new int[2000];
        X = new int[2000];
        Y = new int[12];
        Z = new int[10];
        aa = new int[10];
        ab = new int[10];
        ac = false;
        ad = 0;
        ae = 0;
        af = new int[1000];
        ag = de.t;
        ah = de.u;
        ai = de.q;
        aj = de.s;
    }
}

