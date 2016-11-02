/*
 * Decompiled with CFR 0_118.
 */
public class ci
extends cF {
    static int a;
    static int b;
    int c;
    int d;
    int e;
    int f;
    boolean g;
    byte[][] h;
    static int i;
    static int j;
    static float[] k;
    static bk[] l;
    static ah[] m;
    static ai[] n;
    static ad[] o;
    static boolean[] p;
    static int[] q;
    static float[] r;
    static float[] s;
    static float[] t;
    static int[] u;
    static float[] v;
    static float[] w;
    static float[] x;
    static int[] y;
    float[] z;
    int A;
    int B;
    boolean C;
    static boolean D;
    byte[] E;
    int F;
    int G;
    static byte[] H;

    static int a() {
        int n2 = H[b] >> a & 1;
        b += ++a >> 3;
        a &= 7;
        return n2;
    }

    static int a(int n2) {
        int n3;
        int n4 = 0;
        int n5 = 0;
        while (n2 >= 8 - a) {
            n3 = 8 - a;
            int n6 = (1 << n3) - 1;
            n4 += (H[b] >> a & n6) << n5;
            a = 0;
            ++b;
            n5 += n3;
            n2 -= n3;
        }
        if (n2 > 0) {
            n3 = (1 << n2) - 1;
            n4 += (H[b] >> a & n3) << n5;
            a += n2;
        }
        return n4;
    }

    void a(byte[] arrby) {
        cY cY2 = new cY(arrby);
        this.c = cY2.i();
        this.d = cY2.i();
        this.e = cY2.i();
        this.f = cY2.i();
        if (this.f < 0) {
            this.f ^= -1;
            this.g = true;
        }
        int n2 = cY2.i();
        this.h = new byte[n2][];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4 = 0;
            do {
                n3 = cY2.d();
                n4 += n3;
            } while (n3 >= 255);
            byte[] arrby2 = new byte[n4];
            cY2.a(arrby2, 0, n4);
            this.h[i2] = arrby2;
        }
    }

    static void b(byte[] arrby) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        ci.a(arrby, 0);
        i = 1 << ci.a(4);
        j = 1 << ci.a(4);
        k = new float[j];
        for (n3 = 0; n3 < 2; ++n3) {
            n2 = n3 != 0 ? j : i;
            n4 = n2 >> 1;
            n6 = n2 >> 2;
            n5 = n2 >> 3;
            float[] arrf = new float[n4];
            for (int i2 = 0; i2 < n6; ++i2) {
                arrf[i2 * 2] = (float)Math.cos((double)(i2 * 4) * 3.141592653589793 / (double)n2);
                arrf[i2 * 2 + 1] = - (float)Math.sin((double)(i2 * 4) * 3.141592653589793 / (double)n2);
            }
            float[] arrf2 = new float[n4];
            for (int i3 = 0; i3 < n6; ++i3) {
                arrf2[i3 * 2] = (float)Math.cos((double)(i3 * 2 + 1) * 3.141592653589793 / (double)(n2 * 2));
                arrf2[i3 * 2 + 1] = (float)Math.sin((double)(i3 * 2 + 1) * 3.141592653589793 / (double)(n2 * 2));
            }
            float[] arrf3 = new float[n6];
            for (int i4 = 0; i4 < n5; ++i4) {
                arrf3[i4 * 2] = (float)Math.cos((double)(i4 * 4 + 2) * 3.141592653589793 / (double)n2);
                arrf3[i4 * 2 + 1] = - (float)Math.sin((double)(i4 * 4 + 2) * 3.141592653589793 / (double)n2);
            }
            int[] arrn = new int[n5];
            int n7 = bH.b(n5 - 1, 1004321507);
            for (int i5 = 0; i5 < n5; ++i5) {
                arrn[i5] = cP.b(i5, n7, -746271537);
            }
            if (n3 != 0) {
                v = arrf;
                w = arrf2;
                x = arrf3;
                y = arrn;
                continue;
            }
            r = arrf;
            s = arrf2;
            t = arrf3;
            u = arrn;
        }
        n3 = ci.a(8) + 1;
        l = new bk[n3];
        for (n2 = 0; n2 < n3; ++n2) {
            ci.l[n2] = new bk();
        }
        n2 = ci.a(6) + 1;
        for (n4 = 0; n4 < n2; ++n4) {
            ci.a(16);
        }
        n2 = ci.a(6) + 1;
        m = new ah[n2];
        for (n4 = 0; n4 < n2; ++n4) {
            ci.m[n4] = new ah();
        }
        n4 = ci.a(6) + 1;
        n = new ai[n4];
        for (n6 = 0; n6 < n4; ++n6) {
            ci.n[n6] = new ai();
        }
        n6 = ci.a(6) + 1;
        o = new ad[n6];
        for (n5 = 0; n5 < n6; ++n5) {
            ci.o[n5] = new ad();
        }
        n5 = ci.a(6) + 1;
        p = new boolean[n5];
        q = new int[n5];
        for (int i6 = 0; i6 < n5; ++i6) {
            ci.p[i6] = ci.a() != 0;
            ci.a(16);
            ci.a(16);
            ci.q[i6] = ci.a(8);
        }
    }

    float[] b(int n2) {
        reference var20_21;
        int n8;
        float[] arrf;
        int n6;
        int n4;
        int n7;
        boolean bl2;
        int n9;
        int n5;
        ai ai2 /* !! */ ;
        int n3;
        ci.a(this.h[n2], 0);
        ci.a();
        int n10 = ci.a(bH.b(q.length - 1, 601745597));
        boolean bl3 = p[n10];
        int n11 = bl3 ? j : i;
        boolean bl4 = false;
        boolean bl5 = false;
        if (bl3) {
            bl4 = ci.a() != 0;
            bl5 = ci.a() != 0;
        }
        int n12 = n11 >> 1;
        if (bl3 && !bl4) {
            n9 = (n11 >> 2) - (i >> 2);
            n7 = (n11 >> 2) + (i >> 2);
            n4 = i >> 1;
        } else {
            n9 = 0;
            n7 = n12;
            n4 = n11 >> 1;
        }
        if (bl3 && !bl5) {
            n3 = n11 - (n11 >> 2) - (i >> 2);
            n5 = n11 - (n11 >> 2) + (i >> 2);
            n8 = i >> 1;
        } else {
            n3 = n12;
            n5 = n11;
            n8 = n11 >> 1;
        }
        ad ad2 = o[q[n10]];
        int n13 = ad2.b;
        int n14 = ad2.c[n13];
        boolean bl6 = bl2 = !m[n14].a();
        for (n14 = 0; n14 < ad2.a; ++n14) {
            ai2 /* !! */  = n[ad2.d[n14]];
            var20_21 = k;
            ai2 /* !! */ .a(var20_21, n11 >> 1, bl6);
        }
        if (!bl2) {
            n14 = ad2.b;
            int n15 = ad2.c[n14];
            m[n15].a(k, n11 >> 1);
        }
        if (bl2) {
            for (n14 = n11 >> 1; n14 < n11; ++n14) {
                ci.k[n14] = 0.0f;
            }
        } else {
            float f7;
            int n22;
            float f5;
            float f4;
            int n21;
            float f2;
            float f6;
            int n18;
            int n17;
            int n16;
            int n19;
            int n20;
            float f3;
            n14 = n11 >> 1;
            ai2 /* !! */  = (ai)(n11 >> 2);
            int n23 = n11 >> 3;
            arrf = k;
            n6 = 0;
            while (n6 < n14) {
                float[] arrf2 = arrf;
                int n15 = n6++;
                arrf2[n15] = arrf2[n15] * 0.5f;
            }
            for (n6 = n14; n6 < n11; ++n6) {
                arrf[n6] = - arrf[n11 - n6 - 1];
            }
            float[] arrf3 = bl3 ? v : r;
            float[] arrf4 = bl3 ? w : s;
            float[] arrf5 = bl3 ? x : t;
            int[] arrn = bl3 ? y : u;
            for (n20 = 0; n20 < ai2 /* !! */ ; ++n20) {
                f6 = arrf[n20 * 4] - arrf[n11 - n20 * 4 - 1];
                f7 = arrf[n20 * 4 + 2] - arrf[n11 - n20 * 4 - 3];
                f4 = arrf3[n20 * 2];
                f2 = arrf3[n20 * 2 + 1];
                arrf[n11 - n20 * 4 - 1] = f6 * f4 - f7 * f2;
                arrf[n11 - n20 * 4 - 3] = f6 * f2 + f7 * f4;
            }
            for (n20 = 0; n20 < n23; ++n20) {
                f6 = arrf[n14 + 3 + n20 * 4];
                f7 = arrf[n14 + 1 + n20 * 4];
                f4 = arrf[n20 * 4 + 3];
                f2 = arrf[n20 * 4 + 1];
                arrf[n14 + 3 + n20 * 4] = f6 + f4;
                arrf[n14 + 1 + n20 * 4] = f7 + f2;
                f3 = arrf3[n14 - 4 - n20 * 4];
                f5 = arrf3[n14 - 3 - n20 * 4];
                arrf[n20 * 4 + 3] = (f6 - f4) * f3 - (f7 - f2) * f5;
                arrf[n20 * 4 + 1] = (f7 - f2) * f3 + (f6 - f4) * f5;
            }
            n20 = bH.b(n11 - 1, 1232779812);
            for (n16 = 0; n16 < n20 - 3; ++n16) {
                n21 = n11 >> n16 + 2;
                n22 = 8 << n16;
                for (n19 = 0; n19 < 2 << n16; ++n19) {
                    n17 = n11 - n21 * 2 * n19;
                    n18 = n11 - n21 * (n19 * 2 + 1);
                    for (int i2 = 0; i2 < n11 >> n16 + 4; ++i2) {
                        int n25 = i2 * 4;
                        float f8 = arrf[n17 - 1 - n25];
                        float f9 = arrf[n17 - 3 - n25];
                        float f10 = arrf[n18 - 1 - n25];
                        float f11 = arrf[n18 - 3 - n25];
                        arrf[n17 - 1 - n25] = f8 + f10;
                        arrf[n17 - 3 - n25] = f9 + f11;
                        float f12 = arrf3[i2 * n22];
                        float f13 = arrf3[i2 * n22 + 1];
                        arrf[n18 - 1 - n25] = (f8 - f10) * f12 - (f9 - f11) * f13;
                        arrf[n18 - 3 - n25] = (f9 - f11) * f12 + (f8 - f10) * f13;
                    }
                }
            }
            for (n16 = 1; n16 < n23 - 1; ++n16) {
                n21 = arrn[n16];
                if (n16 >= n21) continue;
                n22 = n16 * 8;
                n19 = n21 * 8;
                f3 = arrf[n22 + 1];
                arrf[n22 + 1] = arrf[n19 + 1];
                arrf[n19 + 1] = f3;
                f3 = arrf[n22 + 3];
                arrf[n22 + 3] = arrf[n19 + 3];
                arrf[n19 + 3] = f3;
                f3 = arrf[n22 + 5];
                arrf[n22 + 5] = arrf[n19 + 5];
                arrf[n19 + 5] = f3;
                f3 = arrf[n22 + 7];
                arrf[n22 + 7] = arrf[n19 + 7];
                arrf[n19 + 7] = f3;
            }
            for (n16 = 0; n16 < n14; ++n16) {
                arrf[n16] = arrf[n16 * 2 + 1];
            }
            for (n16 = 0; n16 < n23; ++n16) {
                arrf[n11 - 1 - n16 * 2] = arrf[n16 * 4];
                arrf[n11 - 2 - n16 * 2] = arrf[n16 * 4 + 1];
                arrf[n11 - ai2 /* !! */  - 1 - n16 * 2] = arrf[n16 * 4 + 2];
                arrf[n11 - ai2 /* !! */  - 2 - n16 * 2] = arrf[n16 * 4 + 3];
            }
            for (n16 = 0; n16 < n23; ++n16) {
                f7 = arrf5[n16 * 2];
                f4 = arrf5[n16 * 2 + 1];
                f2 = arrf[n14 + n16 * 2];
                f3 = arrf[n14 + n16 * 2 + 1];
                f5 = arrf[n11 - 2 - n16 * 2];
                n17 = (int)arrf[n11 - 1 - n16 * 2];
                n18 = (int)(f4 * (f2 - f5) + f7 * (f3 + n17));
                arrf[n14 + n16 * 2] = (f2 + f5 + n18) * 0.5f;
                arrf[n11 - 2 - n16 * 2] = (f2 + f5 - n18) * 0.5f;
                n18 = (int)(f4 * (f3 + n17) - f7 * (f2 - f5));
                arrf[n14 + n16 * 2 + 1] = (f3 - n17 + n18) * 0.5f;
                arrf[n11 - 1 - n16 * 2] = (- f3 + n17 + n18) * 0.5f;
            }
            for (n16 = 0; n16 < ai2 /* !! */ ; ++n16) {
                arrf[n16] = arrf[n16 * 2 + n14] * arrf4[n16 * 2] + arrf[n16 * 2 + 1 + n14] * arrf4[n16 * 2 + 1];
                arrf[n14 - 1 - n16] = arrf[n16 * 2 + n14] * arrf4[n16 * 2 + 1] - arrf[n16 * 2 + 1 + n14] * arrf4[n16 * 2];
            }
            for (n16 = 0; n16 < ai2 /* !! */ ; ++n16) {
                arrf[n11 - ai2 /* !! */  + n16] = - arrf[n16];
            }
            for (n16 = 0; n16 < ai2 /* !! */ ; ++n16) {
                arrf[n16] = arrf[ai2 /* !! */  + n16];
            }
            for (n16 = 0; n16 < ai2 /* !! */ ; ++n16) {
                arrf[ai2 /* !! */  + n16] = - arrf[ai2 /* !! */  - n16 - true];
            }
            for (n16 = 0; n16 < ai2 /* !! */ ; ++n16) {
                arrf[n14 + n16] = arrf[n11 - n16 - 1];
            }
            n16 = n9;
            while (n16 < n7) {
                f7 = (float)Math.sin(((double)(n16 - n9) + 0.5) / (double)n4 * 0.5 * 3.141592653589793);
                float[] arrf6 = k;
                int n24 = n16++;
                arrf6[n24] = arrf6[n24] * (float)Math.sin(1.5707963267948966 * (double)f7 * (double)f7);
            }
            n16 = n3;
            while (n16 < n5) {
                f7 = (float)Math.sin(((double)(n16 - n3) + 0.5) / (double)n8 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                float[] arrf7 = k;
                int n25 = n16++;
                arrf7[n25] = arrf7[n25] * (float)Math.sin(1.5707963267948966 * (double)f7 * (double)f7);
            }
        }
        arrf = null;
        if (this.A > 0) {
            ai2 /* !! */  = (ai)(this.A + n11 >> 2);
            arrf = new float[ai2 /* !! */ ];
            if (!this.C) {
                var20_21 = (reference)false ? 1 : 0;
                while (var20_21 < this.B) {
                    n6 = (this.A >> 1) + var20_21;
                    float[] arrf8 = arrf;
                    reference v7 = var20_21++;
                    arrf8[v7] = arrf8[v7] + this.z[n6];
                }
            }
            if (!bl2) {
                for (var20_21 = (reference)n9; var20_21 < n11 >> 1; ++var20_21) {
                    n6 = arrf.length - (n11 >> 1) + var20_21;
                    float[] arrf9 = arrf;
                    int n26 = n6;
                    arrf9[n26] = arrf9[n26] + k[var20_21];
                }
            }
        }
        float[] arrf10 = this.z;
        this.z = k;
        k = arrf10;
        this.A = n11;
        this.B = n5 - (n11 >> 1);
        this.C = bl2;
        return arrf;
    }

    static ci a(a a2, int n2, int n3) {
        if (!ci.a(a2)) {
            a2.b(n2, n3, -1406635708);
            return null;
        }
        byte[] arrby = a2.b(n2, n3);
        return arrby == null ? null : new ci(arrby);
    }

    ci(byte[] arrby) {
        this.a(arrby);
    }

    static boolean a(a a2) {
        if (!D) {
            byte[] arrby = a2.b(0, 0);
            if (arrby == null) {
                return false;
            }
            ci.b(arrby);
            D = true;
        }
        return true;
    }

    ch a(int[] arrn) {
        byte[] arrby;
        if (arrn != null && arrn[0] <= 0) {
            return null;
        }
        if (this.E == null) {
            this.A = 0;
            this.z = new float[j];
            this.E = new byte[this.d];
            this.F = 0;
            this.G = 0;
        }
        while (this.G < this.h.length) {
            if (arrn != null && arrn[0] <= 0) {
                return null;
            }
            arrby = this.b(this.G);
            if (arrby != null) {
                int n2 = arrby.length;
                int n3 = this.F;
                if (n2 > this.d - n3) {
                    n2 = this.d - n3;
                }
                for (int i2 = 0; i2 < n2; ++i2) {
                    int n4 = (int)(128.0f + arrby[i2] * 128.0f);
                    if ((n4 & -256) != 0) {
                        n4 = ~ n4 >> 31;
                    }
                    this.E[n3++] = (byte)(n4 - 128);
                }
                if (arrn != null) {
                    int[] arrn2 = arrn;
                    arrn2[0] = arrn2[0] - (n3 - this.F);
                }
                this.F = n3;
            }
            ++this.G;
        }
        this.z = null;
        arrby = this.E;
        this.E = null;
        return new ch(this.c, arrby, this.e, this.f, this.g);
    }

    static void a(byte[] arrby, int n2) {
        H = arrby;
        b = n2;
        a = 0;
    }

    static float c(int n2) {
        int n3 = n2 & 2097151;
        int n4 = n2 & Integer.MIN_VALUE;
        int n5 = (n2 & 2145386496) >> 21;
        if (n4 != 0) {
            n3 = - n3;
        }
        return (float)((double)n3 * Math.pow(2.0, n5 - 788));
    }

    static {
        D = false;
    }
}

