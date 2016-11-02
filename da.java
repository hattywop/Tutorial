/*
 * Decompiled with CFR 0_118.
 */
public class da
extends dh {
    int[][] a;
    int[][] b;
    int[] c;
    int[] d;
    int e = 0;
    int f = 0;
    byte g = 0;
    boolean h = false;
    int i;
    int[] j;
    int[] k;
    int[] l;
    short[] m;
    short[] n;
    byte[] o;
    int[] p;
    int[] q;
    int[] r;
    byte[] s;
    byte[] t;
    byte[] u;
    byte[] v;
    short[] w;
    short[] x;
    short[] y;
    short[] z;
    short[] A;
    short[] B;
    short[] C;
    byte[] D;
    short[] E;
    short[] F;
    aF[] G;
    aI[] H;
    aF[] I;
    public short J;
    public short K;
    int L;
    int M;
    int N;
    int O;
    int P;
    static int Q = 0;
    static int[] R = new int[10000];
    static int[] S = new int[10000];
    static int[] T = de.t;
    static int[] U = de.u;

    void a() {
        int n2;
        int[] arrn;
        int n3;
        int n4;
        if (this.c != null) {
            arrn = new int[256];
            n4 = 0;
            for (n3 = 0; n3 < this.e; ++n3) {
                n2 = this.c[n3];
                int[] arrn2 = arrn;
                int n5 = n2;
                arrn2[n5] = arrn2[n5] + 1;
                if (n2 <= n4) continue;
                n4 = n2;
            }
            this.a = new int[n4 + 1][];
            for (n3 = 0; n3 <= n4; ++n3) {
                this.a[n3] = new int[arrn[n3]];
                arrn[n3] = 0;
            }
            n3 = 0;
            while (n3 < this.e) {
                n2 = this.c[n3];
                int[] arrn3 = arrn;
                int n6 = n2;
                int n7 = arrn3[n6];
                arrn3[n6] = n7 + 1;
                this.a[n2][n7] = n3++;
            }
            this.c = null;
        }
        if (this.d != null) {
            arrn = new int[256];
            n4 = 0;
            for (n3 = 0; n3 < this.f; ++n3) {
                n2 = this.d[n3];
                int[] arrn4 = arrn;
                int n8 = n2;
                arrn4[n8] = arrn4[n8] + 1;
                if (n2 <= n4) continue;
                n4 = n2;
            }
            this.b = new int[n4 + 1][];
            for (n3 = 0; n3 <= n4; ++n3) {
                this.b[n3] = new int[arrn[n3]];
                arrn[n3] = 0;
            }
            n3 = 0;
            while (n3 < this.f) {
                n2 = this.d[n3];
                int[] arrn5 = arrn;
                int n9 = n2;
                int n10 = arrn5[n9];
                arrn5[n9] = n10 + 1;
                this.b[n2][n10] = n3++;
            }
            this.d = null;
        }
    }

    public da(da da2, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        int n2;
        this.e = da2.e;
        this.f = da2.f;
        this.i = da2.i;
        if (bl2) {
            this.j = da2.j;
            this.k = da2.k;
            this.l = da2.l;
        } else {
            this.j = new int[this.e];
            this.k = new int[this.e];
            this.l = new int[this.e];
            for (n2 = 0; n2 < this.e; ++n2) {
                this.j[n2] = da2.j[n2];
                this.k[n2] = da2.k[n2];
                this.l[n2] = da2.l[n2];
            }
        }
        if (bl3) {
            this.m = da2.m;
        } else {
            this.m = new short[this.f];
            for (n2 = 0; n2 < this.f; ++n2) {
                this.m[n2] = da2.m[n2];
            }
        }
        if (!bl4 && da2.n != null) {
            this.n = new short[this.f];
            for (n2 = 0; n2 < this.f; ++n2) {
                this.n[n2] = da2.n[n2];
            }
        } else {
            this.n = da2.n;
        }
        if (bl5) {
            this.o = da2.o;
        } else {
            this.o = new byte[this.f];
            if (da2.o == null) {
                for (n2 = 0; n2 < this.f; ++n2) {
                    this.o[n2] = 0;
                }
            } else {
                for (n2 = 0; n2 < this.f; ++n2) {
                    this.o[n2] = da2.o[n2];
                }
            }
        }
        this.p = da2.p;
        this.q = da2.q;
        this.r = da2.r;
        this.s = da2.s;
        this.t = da2.t;
        this.u = da2.u;
        this.g = da2.g;
        this.v = da2.v;
        this.w = da2.w;
        this.x = da2.x;
        this.y = da2.y;
        this.z = da2.z;
        this.A = da2.A;
        this.B = da2.B;
        this.C = da2.C;
        this.D = da2.D;
        this.E = da2.E;
        this.F = da2.F;
        this.c = da2.c;
        this.d = da2.d;
        this.a = da2.a;
        this.b = da2.b;
        this.G = da2.G;
        this.H = da2.H;
        this.I = da2.I;
        this.J = da2.J;
        this.K = da2.K;
    }

    void a(byte[] arrby) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        cY cY2 = new cY(arrby);
        cY cY3 = new cY(arrby);
        cY cY4 = new cY(arrby);
        cY cY5 = new cY(arrby);
        cY cY6 = new cY(arrby);
        cY cY7 = new cY(arrby);
        cY cY8 = new cY(arrby);
        cY2.h = (arrby.length - 23) * 1303963473;
        int n10 = cY2.f();
        int n11 = cY2.f();
        int n12 = cY2.d();
        int n13 = cY2.d();
        int n14 = cY2.d();
        int n15 = cY2.d();
        int n16 = cY2.d();
        int n17 = cY2.d();
        int n18 = cY2.d();
        int n19 = cY2.f();
        int n20 = cY2.f();
        int n21 = cY2.f();
        int n22 = cY2.f();
        int n23 = cY2.f();
        int n24 = 0;
        int n25 = 0;
        int n26 = 0;
        if (n12 > 0) {
            this.v = new byte[n12];
            cY2.h = 0;
            for (n5 = 0; n5 < n12; ++n5) {
                this.v[n5] = cY2.e();
                n8 = this.v[n5];
                if (n8 == 0) {
                    ++n24;
                }
                if (n8 >= 1 && n8 <= 3) {
                    ++n25;
                }
                if (n8 != 2) continue;
                ++n26;
            }
        }
        n8 = n5 = n12 + n10;
        if (n13 == 1) {
            n5 += n11;
        }
        int n27 = n5;
        int n28 = n5 += n11;
        if (n14 == 255) {
            n5 += n11;
        }
        int n29 = n5;
        if (n16 == 1) {
            n5 += n11;
        }
        int n30 = n5;
        if (n18 == 1) {
            n5 += n10;
        }
        int n31 = n5;
        if (n15 == 1) {
            n5 += n11;
        }
        int n32 = n5;
        int n33 = n5 += n22;
        if (n17 == 1) {
            n5 += n11 * 2;
        }
        int n34 = n5;
        int n35 = n5 += n23;
        int n36 = n5 += n11 * 2;
        int n37 = n5 += n19;
        int n38 = n5 += n20;
        int n39 = n5 += n21;
        int n40 = n5 += n24 * 6;
        int n41 = n5 += n25 * 6;
        int n42 = n5 += n25 * 6;
        int n43 = n5 += n25 * 2;
        int n44 = n5 += n25;
        n5 += n25 * 2 + n26 * 2;
        this.e = n10;
        this.f = n11;
        this.i = n12;
        this.j = new int[n10];
        this.k = new int[n10];
        this.l = new int[n10];
        this.p = new int[n11];
        this.q = new int[n11];
        this.r = new int[n11];
        if (n18 == 1) {
            this.c = new int[n10];
        }
        if (n13 == 1) {
            this.s = new byte[n11];
        }
        if (n14 == 255) {
            this.t = new byte[n11];
        } else {
            this.g = (byte)n14;
        }
        if (n15 == 1) {
            this.o = new byte[n11];
        }
        if (n16 == 1) {
            this.d = new int[n11];
        }
        if (n17 == 1) {
            this.n = new short[n11];
        }
        if (n17 == 1 && n12 > 0) {
            this.u = new byte[n11];
        }
        this.m = new short[n11];
        if (n12 > 0) {
            this.w = new short[n12];
            this.x = new short[n12];
            this.y = new short[n12];
            if (n25 > 0) {
                this.z = new short[n25];
                this.A = new short[n25];
                this.B = new short[n25];
                this.C = new short[n25];
                this.D = new byte[n25];
                this.E = new short[n25];
            }
            if (n26 > 0) {
                this.F = new short[n26];
            }
        }
        cY2.h = n12 * 1303963473;
        cY3.h = n36 * 1303963473;
        cY4.h = n37 * 1303963473;
        cY5.h = n38 * 1303963473;
        cY6.h = n30 * 1303963473;
        int n45 = 0;
        int n46 = 0;
        int n47 = 0;
        for (n2 = 0; n2 < n10; ++n2) {
            n4 = cY2.d();
            n6 = 0;
            if ((n4 & 1) != 0) {
                n6 = cY3.p();
            }
            n9 = 0;
            if ((n4 & 2) != 0) {
                n9 = cY4.p();
            }
            n3 = 0;
            if ((n4 & 4) != 0) {
                n3 = cY5.p();
            }
            this.j[n2] = n45 + n6;
            this.k[n2] = n46 + n9;
            this.l[n2] = n47 + n3;
            n45 = this.j[n2];
            n46 = this.k[n2];
            n47 = this.l[n2];
            if (n18 != 1) continue;
            this.c[n2] = cY6.d();
        }
        cY2.h = n35 * 1303963473;
        cY3.h = n8 * 1303963473;
        cY4.h = n28 * 1303963473;
        cY5.h = n31 * 1303963473;
        cY6.h = n29 * 1303963473;
        cY7.h = n33 * 1303963473;
        cY8.h = n34 * 1303963473;
        for (n2 = 0; n2 < n11; ++n2) {
            this.m[n2] = (short)cY2.f();
            if (n13 == 1) {
                this.s[n2] = cY3.e();
            }
            if (n14 == 255) {
                this.t[n2] = cY4.e();
            }
            if (n15 == 1) {
                this.o[n2] = cY5.e();
            }
            if (n16 == 1) {
                this.d[n2] = cY6.d();
            }
            if (n17 == 1) {
                this.n[n2] = (short)(cY7.f() - 1);
            }
            if (this.u == null || this.n[n2] == -1) continue;
            this.u[n2] = (byte)(cY8.d() - 1);
        }
        cY2.h = n32 * 1303963473;
        cY3.h = n27 * 1303963473;
        n2 = 0;
        n4 = 0;
        n6 = 0;
        n9 = 0;
        for (n3 = 0; n3 < n11; ++n3) {
            n7 = cY3.d();
            if (n7 == 1) {
                n2 = n9 + cY2.p();
                n4 = n2 + cY2.p();
                n9 = n6 = n4 + cY2.p();
                this.p[n3] = n2;
                this.q[n3] = n4;
                this.r[n3] = n6;
            }
            if (n7 == 2) {
                n4 = n6;
                n9 = n6 = n9 + cY2.p();
                this.p[n3] = n2;
                this.q[n3] = n4;
                this.r[n3] = n6;
            }
            if (n7 == 3) {
                n2 = n6;
                n9 = n6 = n9 + cY2.p();
                this.p[n3] = n2;
                this.q[n3] = n4;
                this.r[n3] = n6;
            }
            if (n7 != 4) continue;
            int n48 = n2;
            n2 = n4;
            n4 = n48;
            n9 = n6 = cY2.p() + n9;
            this.p[n3] = n2;
            this.q[n3] = n48;
            this.r[n3] = n6;
        }
        cY2.h = n39 * 1303963473;
        cY3.h = n40 * 1303963473;
        cY4.h = n41 * 1303963473;
        cY5.h = n42 * 1303963473;
        cY6.h = n43 * 1303963473;
        cY7.h = n44 * 1303963473;
        for (n3 = 0; n3 < n12; ++n3) {
            n7 = this.v[n3] & 255;
            if (n7 == 0) {
                this.w[n3] = (short)cY2.f();
                this.x[n3] = (short)cY2.f();
                this.y[n3] = (short)cY2.f();
            }
            if (n7 == 1) {
                this.w[n3] = (short)cY3.f();
                this.x[n3] = (short)cY3.f();
                this.y[n3] = (short)cY3.f();
                this.z[n3] = (short)cY4.f();
                this.A[n3] = (short)cY4.f();
                this.B[n3] = (short)cY4.f();
                this.C[n3] = (short)cY5.f();
                this.D[n3] = cY6.e();
                this.E[n3] = (short)cY7.f();
            }
            if (n7 == 2) {
                this.w[n3] = (short)cY3.f();
                this.x[n3] = (short)cY3.f();
                this.y[n3] = (short)cY3.f();
                this.z[n3] = (short)cY4.f();
                this.A[n3] = (short)cY4.f();
                this.B[n3] = (short)cY4.f();
                this.C[n3] = (short)cY5.f();
                this.D[n3] = cY6.e();
                this.E[n3] = (short)cY7.f();
                this.F[n3] = (short)cY7.f();
            }
            if (n7 != 3) continue;
            this.w[n3] = (short)cY3.f();
            this.x[n3] = (short)cY3.f();
            this.y[n3] = (short)cY3.f();
            this.z[n3] = (short)cY4.f();
            this.A[n3] = (short)cY4.f();
            this.B[n3] = (short)cY4.f();
            this.C[n3] = (short)cY5.f();
            this.D[n3] = cY6.e();
            this.E[n3] = (short)cY7.f();
        }
        cY2.h = n5 * 1303963473;
        if (cY2.d() != 0) {
            new aw();
            cY2.f();
            cY2.f();
            cY2.f();
            cY2.i();
        }
    }

    public da(da[] arrda, int n2) {
        da da2;
        int n3;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        this.e = 0;
        this.f = 0;
        this.i = 0;
        this.g = -1;
        for (n3 = 0; n3 < n2; ++n3) {
            da2 = arrda[n3];
            if (da2 == null) continue;
            this.e += da2.e;
            this.f += da2.f;
            this.i += da2.i;
            if (da2.t != null) {
                bl3 = true;
            } else {
                if (this.g == -1) {
                    this.g = da2.g;
                }
                if (this.g != da2.g) {
                    bl3 = true;
                }
            }
            bl2 |= da2.s != null;
            bl4 |= da2.o != null;
            bl5 |= da2.d != null;
            bl6 |= da2.n != null;
            bl7 |= da2.u != null;
        }
        this.j = new int[this.e];
        this.k = new int[this.e];
        this.l = new int[this.e];
        this.c = new int[this.e];
        this.p = new int[this.f];
        this.q = new int[this.f];
        this.r = new int[this.f];
        if (bl2) {
            this.s = new byte[this.f];
        }
        if (bl3) {
            this.t = new byte[this.f];
        }
        if (bl4) {
            this.o = new byte[this.f];
        }
        if (bl5) {
            this.d = new int[this.f];
        }
        if (bl6) {
            this.n = new short[this.f];
        }
        if (bl7) {
            this.u = new byte[this.f];
        }
        this.m = new short[this.f];
        if (this.i > 0) {
            this.v = new byte[this.i];
            this.w = new short[this.i];
            this.x = new short[this.i];
            this.y = new short[this.i];
            this.z = new short[this.i];
            this.A = new short[this.i];
            this.B = new short[this.i];
            this.C = new short[this.i];
            this.D = new byte[this.i];
            this.E = new short[this.i];
            this.F = new short[this.i];
        }
        this.e = 0;
        this.f = 0;
        this.i = 0;
        for (n3 = 0; n3 < n2; ++n3) {
            int n4;
            da2 = arrda[n3];
            if (da2 == null) continue;
            for (n4 = 0; n4 < da2.f; ++n4) {
                if (bl2 && da2.s != null) {
                    this.s[this.f] = da2.s[n4];
                }
                if (bl3) {
                    this.t[this.f] = da2.t != null ? da2.t[n4] : da2.g;
                }
                if (bl4 && da2.o != null) {
                    this.o[this.f] = da2.o[n4];
                }
                if (bl5 && da2.d != null) {
                    this.d[this.f] = da2.d[n4];
                }
                if (bl6) {
                    this.n[this.f] = da2.n != null ? da2.n[n4] : -1;
                }
                if (bl7) {
                    this.u[this.f] = da2.u != null && da2.u[n4] != -1 ? (byte)(da2.u[n4] + this.i) : -1;
                }
                this.m[this.f] = da2.m[n4];
                this.p[this.f] = this.a(da2, da2.p[n4]);
                this.q[this.f] = this.a(da2, da2.q[n4]);
                this.r[this.f] = this.a(da2, da2.r[n4]);
                ++this.f;
            }
            for (n4 = 0; n4 < da2.i; ++n4) {
                this.v[this.i] = da2.v[n4];
                byte by2 = this.v[this.i];
                if (by2 == 0) {
                    this.w[this.i] = (short)this.a(da2, (int)da2.w[n4]);
                    this.x[this.i] = (short)this.a(da2, (int)da2.x[n4]);
                    this.y[this.i] = (short)this.a(da2, (int)da2.y[n4]);
                }
                if (by2 >= 1 && by2 <= 3) {
                    this.w[this.i] = da2.w[n4];
                    this.x[this.i] = da2.x[n4];
                    this.y[this.i] = da2.y[n4];
                    this.z[this.i] = da2.z[n4];
                    this.A[this.i] = da2.A[n4];
                    this.B[this.i] = da2.B[n4];
                    this.C[this.i] = da2.C[n4];
                    this.D[this.i] = da2.D[n4];
                    this.E[this.i] = da2.E[n4];
                }
                if (by2 == 2) {
                    this.F[this.i] = da2.F[n4];
                }
                ++this.i;
            }
        }
    }

    final int a(da da2, int n2) {
        int n3 = -1;
        int n4 = da2.j[n2];
        int n5 = da2.k[n2];
        int n6 = da2.l[n2];
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (n4 != this.j[i2] || n5 != this.k[i2] || n6 != this.l[i2]) continue;
            n3 = i2;
            break;
        }
        if (n3 == -1) {
            this.j[this.e] = n4;
            this.k[this.e] = n5;
            this.l[this.e] = n6;
            if (da2.c != null) {
                this.c[this.e] = da2.c[n2];
            }
            n3 = this.e++;
        }
        return n3;
    }

    public da c() {
        da da2 = new da();
        if (this.s != null) {
            da2.s = new byte[this.f];
            for (int i2 = 0; i2 < this.f; ++i2) {
                da2.s[i2] = this.s[i2];
            }
        }
        da2.e = this.e;
        da2.f = this.f;
        da2.i = this.i;
        da2.j = this.j;
        da2.k = this.k;
        da2.l = this.l;
        da2.p = this.p;
        da2.q = this.q;
        da2.r = this.r;
        da2.t = this.t;
        da2.o = this.o;
        da2.u = this.u;
        da2.m = this.m;
        da2.n = this.n;
        da2.g = this.g;
        da2.v = this.v;
        da2.w = this.w;
        da2.x = this.x;
        da2.y = this.y;
        da2.z = this.z;
        da2.A = this.A;
        da2.B = this.B;
        da2.C = this.C;
        da2.D = this.D;
        da2.E = this.E;
        da2.F = this.F;
        da2.c = this.c;
        da2.d = this.d;
        da2.a = this.a;
        da2.b = this.b;
        da2.G = this.G;
        da2.H = this.H;
        da2.J = this.J;
        da2.K = this.K;
        return da2;
    }

    public da a(int[][] arrn, int n2, int n3, int n4, boolean bl2, int n5) {
        this.h();
        int n6 = n2 + this.M;
        int n7 = n2 + this.N;
        int n8 = n4 + this.P;
        int n9 = n4 + this.O;
        if (n6 >= 0 && n7 + 128 >> 7 < arrn.length && n8 >= 0 && n9 + 128 >> 7 < arrn[0].length) {
            da da2;
            n7 = n7 + 127 >> 7;
            n9 = n9 + 127 >> 7;
            if (arrn[n6 >>= 7][n8 >>= 7] == n3 && arrn[n7][n8] == n3 && arrn[n6][n9] == n3 && arrn[n7][n9] == n3) {
                return this;
            }
            if (bl2) {
                da2 = new da();
                da2.e = this.e;
                da2.f = this.f;
                da2.i = this.i;
                da2.j = this.j;
                da2.l = this.l;
                da2.p = this.p;
                da2.q = this.q;
                da2.r = this.r;
                da2.s = this.s;
                da2.t = this.t;
                da2.o = this.o;
                da2.u = this.u;
                da2.m = this.m;
                da2.n = this.n;
                da2.g = this.g;
                da2.v = this.v;
                da2.w = this.w;
                da2.x = this.x;
                da2.y = this.y;
                da2.z = this.z;
                da2.A = this.A;
                da2.B = this.B;
                da2.C = this.C;
                da2.D = this.D;
                da2.E = this.E;
                da2.F = this.F;
                da2.c = this.c;
                da2.d = this.d;
                da2.a = this.a;
                da2.b = this.b;
                da2.J = this.J;
                da2.K = this.K;
                da2.k = new int[da2.e];
            } else {
                da2 = this;
            }
            if (n5 == 0) {
                for (int i2 = 0; i2 < da2.e; ++i2) {
                    int n10 = this.j[i2] + n2;
                    int n11 = this.l[i2] + n4;
                    int n12 = n10 & 127;
                    int n13 = n11 & 127;
                    int n14 = n10 >> 7;
                    int n15 = n11 >> 7;
                    int n16 = arrn[n14][n15] * (128 - n12) + arrn[n14 + 1][n15] * n12 >> 7;
                    int n17 = arrn[n14][n15 + 1] * (128 - n12) + arrn[n14 + 1][n15 + 1] * n12 >> 7;
                    int n18 = n16 * (128 - n13) + n17 * n13 >> 7;
                    da2.k[i2] = this.k[i2] + n18 - n3;
                }
            } else {
                for (int i3 = 0; i3 < da2.e; ++i3) {
                    int n19 = (- this.k[i3] << 16) / (this.aN * -695779227);
                    if (n19 >= n5) continue;
                    int n20 = this.j[i3] + n2;
                    int n21 = this.l[i3] + n4;
                    int n22 = n20 & 127;
                    int n23 = n21 & 127;
                    int n24 = n20 >> 7;
                    int n25 = n21 >> 7;
                    int n26 = arrn[n24][n25] * (128 - n22) + arrn[n24 + 1][n25] * n22 >> 7;
                    int n27 = arrn[n24][n25 + 1] * (128 - n22) + arrn[n24 + 1][n25 + 1] * n22 >> 7;
                    int n28 = n26 * (128 - n23) + n27 * n23 >> 7;
                    da2.k[i3] = this.k[i3] + (n28 - n3) * (n5 - n19) / n5;
                }
            }
            da2.g();
            return da2;
        }
        return this;
    }

    public void d() {
        for (int i2 = 0; i2 < this.e; ++i2) {
            int n2 = this.l[i2];
            this.l[i2] = this.j[i2];
            this.j[i2] = - n2;
        }
        this.g();
    }

    public void b(int n2) {
        int n3 = T[n2];
        int n4 = U[n2];
        for (int i2 = 0; i2 < this.e; ++i2) {
            int n5 = this.l[i2] * n3 + this.j[i2] * n4 >> 16;
            this.l[i2] = this.l[i2] * n4 - this.j[i2] * n3 >> 16;
            this.j[i2] = n5;
        }
        this.g();
    }

    public void a(int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < this.e) {
            int[] arrn = this.j;
            int n6 = n5;
            arrn[n6] = arrn[n6] + n2;
            int[] arrn2 = this.k;
            int n7 = n5;
            arrn2[n7] = arrn2[n7] + n3;
            int[] arrn3 = this.l;
            int n8 = n5++;
            arrn3[n8] = arrn3[n8] + n4;
        }
        this.g();
    }

    public void a(short s2, short s3) {
        for (int i2 = 0; i2 < this.f; ++i2) {
            if (this.m[i2] != s2) continue;
            this.m[i2] = s3;
        }
    }

    public void b(short s2, short s3) {
        if (this.n != null) {
            for (int i2 = 0; i2 < this.f; ++i2) {
                if (this.n[i2] != s2) continue;
                this.n[i2] = s3;
            }
        }
    }

    public void e() {
        int n2;
        for (n2 = 0; n2 < this.e; ++n2) {
            this.l[n2] = - this.l[n2];
        }
        for (n2 = 0; n2 < this.f; ++n2) {
            int n3 = this.p[n2];
            this.p[n2] = this.r[n2];
            this.r[n2] = n3;
        }
        this.g();
    }

    public void f() {
        if (this.G == null) {
            int n2;
            this.G = new aF[this.e];
            for (n2 = 0; n2 < this.e; ++n2) {
                this.G[n2] = new aF();
            }
            for (n2 = 0; n2 < this.f; ++n2) {
                Object object;
                int n3;
                int n4 = this.p[n2];
                int n5 = this.q[n2];
                int n6 = this.r[n2];
                int n7 = this.j[n5] - this.j[n4];
                int n8 = this.k[n5] - this.k[n4];
                int n9 = this.l[n5] - this.l[n4];
                int n10 = this.j[n6] - this.j[n4];
                int n11 = this.k[n6] - this.k[n4];
                int n12 = this.l[n6] - this.l[n4];
                int n13 = n8 * n12 - n11 * n9;
                int n14 = n9 * n10 - n12 * n7;
                for (n3 = n7 * n11 - n10 * n8; n13 > 8192 || n14 > 8192 || n3 > 8192 || n13 < -8192 || n14 < -8192 || n3 < -8192; n13 >>= 1, n14 >>= 1, n3 >>= 1) {
                }
                int n15 = (int)Math.sqrt(n13 * n13 + n14 * n14 + n3 * n3);
                if (n15 <= 0) {
                    n15 = 1;
                }
                n13 = n13 * 256 / n15;
                n14 = n14 * 256 / n15;
                n3 = n3 * 256 / n15;
                byte by2 = this.s == null ? 0 : this.s[n2];
                if (by2 == 0) {
                    object = this.G[n4];
                    object.b += n13 * -570058601;
                    object.c += n14 * -182465231;
                    object.d += n3 * -2102398547;
                    object.e += 1531761631;
                    object = this.G[n5];
                    object.b += n13 * -570058601;
                    object.c += n14 * -182465231;
                    object.d += n3 * -2102398547;
                    object.e += 1531761631;
                    object = this.G[n6];
                    object.b += n13 * -570058601;
                    object.c += n14 * -182465231;
                    object.d += n3 * -2102398547;
                    object.e += 1531761631;
                    continue;
                }
                if (by2 != 1) continue;
                if (this.H == null) {
                    this.H = new aI[this.f];
                }
                this.H[n2] = new aI();
                object = this.H[n2];
                object.b = n13 * -1972503663;
                object.a = n14 * 234782301;
                object.c = n3 * 1591541357;
            }
        }
    }

    void g() {
        this.G = null;
        this.I = null;
        this.H = null;
        this.h = false;
    }

    void h() {
        if (!this.h) {
            this.aN = 0;
            this.L = 0;
            this.M = 999999;
            this.N = -999999;
            this.O = -99999;
            this.P = 99999;
            for (int i2 = 0; i2 < this.e; ++i2) {
                int n2 = this.j[i2];
                int n3 = this.k[i2];
                int n4 = this.l[i2];
                if (n2 < this.M) {
                    this.M = n2;
                }
                if (n2 > this.N) {
                    this.N = n2;
                }
                if (n4 < this.P) {
                    this.P = n4;
                }
                if (n4 > this.O) {
                    this.O = n4;
                }
                if (- n3 > this.aN * -695779227) {
                    this.aN = (- n3) * -54955667;
                }
                if (n3 <= this.L) continue;
                this.L = n3;
            }
            this.h = true;
        }
    }

    static void a(da da2, da da3, int n2, int n3, int n4, boolean bl2) {
        int n5;
        da2.h();
        da2.f();
        da3.h();
        da3.f();
        ++Q;
        int n6 = 0;
        int[] arrn = da3.j;
        int n7 = da3.e;
        for (n5 = 0; n5 < da2.e; ++n5) {
            int n8;
            int n9;
            int n10;
            aF aF2 = da2.G[n5];
            if (aF2.e * -1906792417 == 0 || (n10 = da2.k[n5] - n3) > da3.L || (n8 = da2.j[n5] - n2) < da3.M || n8 > da3.N || (n9 = da2.l[n5] - n4) < da3.P || n9 > da3.O) continue;
            for (int i2 = 0; i2 < n7; ++i2) {
                aF aF3;
                aF aF4;
                aF aF5 = da3.G[i2];
                if (n8 != arrn[i2] || n9 != da3.l[i2] || n10 != da3.k[i2] || aF5.e * -1906792417 == 0) continue;
                if (da2.I == null) {
                    da2.I = new aF[da2.e];
                }
                if (da3.I == null) {
                    da3.I = new aF[n7];
                }
                if ((aF4 = da2.I[n5]) == null) {
                    aF4 = da2.I[n5] = new aF(aF2);
                }
                if ((aF3 = da3.I[i2]) == null) {
                    aF3 = da3.I[i2] = new aF(aF5);
                }
                aF4.b += aF5.b * 1;
                aF4.c += aF5.c * 1;
                aF4.d += aF5.d * 1;
                aF4.e += aF5.e * 1;
                aF3.b += aF2.b * 1;
                aF3.c += aF2.c * 1;
                aF3.d += aF2.d * 1;
                aF3.e += aF2.e * 1;
                ++n6;
                da.R[n5] = Q;
                da.S[i2] = Q;
            }
        }
        if (n6 >= 3 && bl2) {
            for (n5 = 0; n5 < da2.f; ++n5) {
                if (R[da2.p[n5]] != Q || R[da2.q[n5]] != Q || R[da2.r[n5]] != Q) continue;
                if (da2.s == null) {
                    da2.s = new byte[da2.f];
                }
                da2.s[n5] = 2;
            }
            for (n5 = 0; n5 < da3.f; ++n5) {
                if (S[da3.p[n5]] != Q || S[da3.q[n5]] != Q || S[da3.r[n5]] != Q) continue;
                if (da3.s == null) {
                    da3.s = new byte[da3.f];
                }
                da3.s[n5] = 2;
            }
        }
    }

    static final int a(int n2, int n3) {
        if ((n3 = n3 * (n2 & 127) >> 7) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 65408) + n3;
    }

    da() {
    }

    public void i() {
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.j[i2] = - this.j[i2];
            this.l[i2] = - this.l[i2];
        }
        this.g();
    }

    public void b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.e; ++i2) {
            this.j[i2] = this.j[i2] * n2 / 128;
            this.k[i2] = this.k[i2] * n3 / 128;
            this.l[i2] = this.l[i2] * n4 / 128;
        }
        this.g();
    }

    public void j() {
        for (int i2 = 0; i2 < this.e; ++i2) {
            int n2 = this.j[i2];
            this.j[i2] = this.l[i2];
            this.l[i2] = - n2;
        }
        this.g();
    }

    da(byte[] arrby) {
        if (arrby[arrby.length - 1] == -1 && arrby[arrby.length - 2] == -1) {
            this.a(arrby);
        } else {
            this.b(arrby);
        }
    }

    void b(byte[] arrby) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        boolean bl2 = false;
        boolean bl3 = false;
        cY cY2 = new cY(arrby);
        cY cY3 = new cY(arrby);
        cY cY4 = new cY(arrby);
        cY cY5 = new cY(arrby);
        cY cY6 = new cY(arrby);
        cY2.h = (arrby.length - 18) * 1303963473;
        int n10 = cY2.f();
        int n11 = cY2.f();
        int n12 = cY2.d();
        int n13 = cY2.d();
        int n14 = cY2.d();
        int n15 = cY2.d();
        int n16 = cY2.d();
        int n17 = cY2.d();
        int n18 = cY2.f();
        int n19 = cY2.f();
        int n20 = cY2.f();
        int n21 = cY2.f();
        int n22 = 0;
        int n23 = n9 = n22 + n10;
        int n24 = n9 += n11;
        if (n14 == 255) {
            n9 += n11;
        }
        int n25 = n9;
        if (n16 == 1) {
            n9 += n11;
        }
        int n26 = n9;
        if (n13 == 1) {
            n9 += n11;
        }
        int n27 = n9;
        if (n17 == 1) {
            n9 += n10;
        }
        int n28 = n9;
        if (n15 == 1) {
            n9 += n11;
        }
        int n29 = n9;
        int n30 = n9 += n21;
        int n31 = n9 += n11 * 2;
        int n32 = n9 += n12 * 6;
        int n33 = n9 += n18;
        int n34 = (n9 += n19) + n20;
        this.e = n10;
        this.f = n11;
        this.i = n12;
        this.j = new int[n10];
        this.k = new int[n10];
        this.l = new int[n10];
        this.p = new int[n11];
        this.q = new int[n11];
        this.r = new int[n11];
        if (n12 > 0) {
            this.v = new byte[n12];
            this.w = new short[n12];
            this.x = new short[n12];
            this.y = new short[n12];
        }
        if (n17 == 1) {
            this.c = new int[n10];
        }
        if (n13 == 1) {
            this.s = new byte[n11];
            this.u = new byte[n11];
            this.n = new short[n11];
        }
        if (n14 == 255) {
            this.t = new byte[n11];
        } else {
            this.g = (byte)n14;
        }
        if (n15 == 1) {
            this.o = new byte[n11];
        }
        if (n16 == 1) {
            this.d = new int[n11];
        }
        this.m = new short[n11];
        cY2.h = n22 * 1303963473;
        cY3.h = n32 * 1303963473;
        cY4.h = n33 * 1303963473;
        cY5.h = n9 * 1303963473;
        cY6.h = n27 * 1303963473;
        int n35 = 0;
        int n36 = 0;
        int n37 = 0;
        for (n8 = 0; n8 < n10; ++n8) {
            n7 = cY2.d();
            n2 = 0;
            if ((n7 & 1) != 0) {
                n2 = cY3.p();
            }
            n4 = 0;
            if ((n7 & 2) != 0) {
                n4 = cY4.p();
            }
            n6 = 0;
            if ((n7 & 4) != 0) {
                n6 = cY5.p();
            }
            this.j[n8] = n35 + n2;
            this.k[n8] = n36 + n4;
            this.l[n8] = n37 + n6;
            n35 = this.j[n8];
            n36 = this.k[n8];
            n37 = this.l[n8];
            if (n17 != 1) continue;
            this.c[n8] = cY6.d();
        }
        cY2.h = n30 * 1303963473;
        cY3.h = n26 * 1303963473;
        cY4.h = n24 * 1303963473;
        cY5.h = n28 * 1303963473;
        cY6.h = n25 * 1303963473;
        for (n8 = 0; n8 < n11; ++n8) {
            this.m[n8] = (short)cY2.f();
            if (n13 == 1) {
                n7 = cY3.d();
                if ((n7 & 1) == 1) {
                    this.s[n8] = 1;
                    bl2 = true;
                } else {
                    this.s[n8] = 0;
                }
                if ((n7 & 2) == 2) {
                    this.u[n8] = (byte)(n7 >> 2);
                    this.n[n8] = this.m[n8];
                    this.m[n8] = 127;
                    if (this.n[n8] != -1) {
                        bl3 = true;
                    }
                } else {
                    this.u[n8] = -1;
                    this.n[n8] = -1;
                }
            }
            if (n14 == 255) {
                this.t[n8] = cY4.e();
            }
            if (n15 == 1) {
                this.o[n8] = cY5.e();
            }
            if (n16 != 1) continue;
            this.d[n8] = cY6.d();
        }
        cY2.h = n29 * 1303963473;
        cY3.h = n23 * 1303963473;
        n8 = 0;
        n7 = 0;
        n2 = 0;
        n4 = 0;
        for (n6 = 0; n6 < n11; ++n6) {
            n3 = cY3.d();
            if (n3 == 1) {
                n8 = cY2.p() + n4;
                n7 = cY2.p() + n8;
                n4 = n2 = cY2.p() + n7;
                this.p[n6] = n8;
                this.q[n6] = n7;
                this.r[n6] = n2;
            }
            if (n3 == 2) {
                n7 = n2;
                n4 = n2 = cY2.p() + n4;
                this.p[n6] = n8;
                this.q[n6] = n7;
                this.r[n6] = n2;
            }
            if (n3 == 3) {
                n8 = n2;
                n4 = n2 = cY2.p() + n4;
                this.p[n6] = n8;
                this.q[n6] = n7;
                this.r[n6] = n2;
            }
            if (n3 != 4) continue;
            n5 = n8;
            n8 = n7;
            n7 = n5;
            n4 = n2 = cY2.p() + n4;
            this.p[n6] = n8;
            this.q[n6] = n5;
            this.r[n6] = n2;
        }
        cY2.h = n31 * 1303963473;
        for (n6 = 0; n6 < n12; ++n6) {
            this.v[n6] = 0;
            this.w[n6] = (short)cY2.f();
            this.x[n6] = (short)cY2.f();
            this.y[n6] = (short)cY2.f();
        }
        if (this.u != null) {
            boolean bl4 = false;
            for (n3 = 0; n3 < n11; ++n3) {
                n5 = this.u[n3] & 255;
                if (n5 == 255) continue;
                if ((this.w[n5] & 65535) == this.p[n3] && (this.x[n5] & 65535) == this.q[n3] && (this.y[n5] & 65535) == this.r[n3]) {
                    this.u[n3] = -1;
                    continue;
                }
                bl4 = true;
            }
            if (!bl4) {
                this.u = null;
            }
        }
        if (!bl3) {
            this.n = null;
        }
        if (!bl2) {
            this.s = null;
        }
    }

    public final cB a(int n2, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        this.f();
        int n9 = (int)Math.sqrt(n4 * n4 + n5 * n5 + n6 * n6);
        int n10 = n3 * n9 >> 8;
        cB cB2 = new cB();
        cB2.i = new int[this.f];
        cB2.j = new int[this.f];
        cB2.k = new int[this.f];
        if (this.i > 0 && this.u != null) {
            int[] arrn = new int[this.i];
            for (n8 = 0; n8 < this.f; ++n8) {
                if (this.u[n8] == -1) continue;
                int[] arrn2 = arrn;
                int n11 = this.u[n8] & 255;
                arrn2[n11] = arrn2[n11] + 1;
            }
            cB2.c = 0;
            for (n8 = 0; n8 < this.i; ++n8) {
                if (arrn[n8] <= 0 || this.v[n8] != 0) continue;
                ++cB2.c;
            }
            cB2.q = new int[cB2.c];
            cB2.r = new int[cB2.c];
            cB2.s = new int[cB2.c];
            n8 = 0;
            for (n7 = 0; n7 < this.i; ++n7) {
                if (arrn[n7] > 0 && this.v[n7] == 0) {
                    cB2.q[n8] = this.w[n7] & 65535;
                    cB2.r[n8] = this.x[n7] & 65535;
                    cB2.s[n8] = this.y[n7] & 65535;
                    arrn[n7] = n8++;
                    continue;
                }
                arrn[n7] = -1;
            }
            cB2.n = new byte[this.f];
            for (n7 = 0; n7 < this.f; ++n7) {
                cB2.n[n7] = this.u[n7] != -1 ? (byte)arrn[this.u[n7] & 255] : -1;
            }
        }
        for (int i2 = 0; i2 < this.f; ++i2) {
            aI aI2;
            int n12;
            aF aF2;
            n8 = this.s == null ? 0 : this.s[i2];
            n7 = this.o == null ? 0 : this.o[i2];
            int n13 = this.n == null ? -1 : this.n[i2];
            if (n7 == -2) {
                n8 = 3;
            }
            if (n7 == -1) {
                n8 = 2;
            }
            if (n13 == -1) {
                if (n8 != 0) {
                    if (n8 == 1) {
                        aI2 = this.H[i2];
                        n12 = n2 + (n4 * aI2.b * -2103958159 + n5 * aI2.a * -1496693259 + n6 * aI2.c * 1192147813) / (n10 + n10 / 2);
                        cB2.i[i2] = da.a(this.m[i2] & 65535, n12);
                        cB2.k[i2] = -1;
                        continue;
                    }
                    if (n8 == 3) {
                        cB2.i[i2] = 128;
                        cB2.k[i2] = -1;
                        continue;
                    }
                    cB2.k[i2] = -2;
                    continue;
                }
                int n14 = this.m[i2] & 65535;
                aF2 = this.I != null && this.I[this.p[i2]] != null ? this.I[this.p[i2]] : this.G[this.p[i2]];
                n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
                cB2.i[i2] = da.a(n14, n12);
                aF2 = this.I != null && this.I[this.q[i2]] != null ? this.I[this.q[i2]] : this.G[this.q[i2]];
                n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
                cB2.j[i2] = da.a(n14, n12);
                aF2 = this.I != null && this.I[this.r[i2]] != null ? this.I[this.r[i2]] : this.G[this.r[i2]];
                n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
                cB2.k[i2] = da.a(n14, n12);
                continue;
            }
            if (n8 != 0) {
                if (n8 == 1) {
                    aI2 = this.H[i2];
                    n12 = n2 + (n4 * aI2.b * -2103958159 + n5 * aI2.a * -1496693259 + n6 * aI2.c * 1192147813) / (n10 + n10 / 2);
                    cB2.i[i2] = da.c(n12);
                    cB2.k[i2] = -1;
                    continue;
                }
                cB2.k[i2] = -2;
                continue;
            }
            aF2 = this.I != null && this.I[this.p[i2]] != null ? this.I[this.p[i2]] : this.G[this.p[i2]];
            n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
            cB2.i[i2] = da.c(n12);
            aF2 = this.I != null && this.I[this.q[i2]] != null ? this.I[this.q[i2]] : this.G[this.q[i2]];
            n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
            cB2.j[i2] = da.c(n12);
            aF2 = this.I != null && this.I[this.r[i2]] != null ? this.I[this.r[i2]] : this.G[this.r[i2]];
            n12 = n2 + (n4 * aF2.b * -1201182937 + n5 * aF2.c * -249140271 + n6 * aF2.d * -537880027) / (n10 * aF2.e * -1906792417);
            cB2.k[i2] = da.c(n12);
        }
        this.a();
        cB2.a = this.e;
        cB2.d = this.j;
        cB2.w = this.k;
        cB2.e = this.l;
        cB2.b = this.f;
        cB2.f = this.p;
        cB2.g = this.q;
        cB2.h = this.r;
        cB2.l = this.t;
        cB2.m = this.o;
        cB2.p = this.g;
        cB2.t = this.a;
        cB2.u = this.b;
        cB2.o = this.n;
        return cB2;
    }

    static final int c(int n2) {
        if (n2 < 2) {
            n2 = 2;
        } else if (n2 > 126) {
            n2 = 126;
        }
        return n2;
    }

    public static da a(a a2, int n2, int n3) {
        byte[] arrby = a2.b(n2, n3);
        return arrby == null ? null : new da(arrby);
    }
}

