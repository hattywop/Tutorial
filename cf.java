/*
 * Decompiled with CFR 0_118.
 */
public class cf
extends cF {
    static byte a;
    public static String b;
    int[] c = new int[128];
    ch[] d = new ch[128];
    short[] e = new short[128];
    byte[] f = new byte[128];
    byte[] g = new byte[128];
    F[] h = new F[128];
    byte[] i = new byte[128];
    int j;

    boolean a(dp dp2, byte[] arrby, int[] arrn, byte by2) {
        boolean bl2 = true;
        int n2 = 0;
        ch ch2 = null;
        for (int i2 = 0; i2 < 128; ++i2) {
            int n3;
            if (arrby != null && arrby[i2] == 0 || (n3 = this.c[i2]) == 0) continue;
            if (n3 != n2) {
                n2 = n3--;
                ch2 = (n3 & 1) == 0 ? dp2.a(n3 >> 2, arrn, -107) : dp2.b(n3 >> 2, arrn, 48);
                if (ch2 == null) {
                    bl2 = false;
                }
            }
            if (ch2 == null) continue;
            this.d[i2] = ch2;
            this.c[i2] = 0;
        }
        return bl2;
    }

    void a(int n2) {
        this.c = null;
    }

    cf(byte[] arrby) {
        F f2;
        int n2;
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
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        cY cY2 = new cY(arrby);
        int n21 = 0;
        while (cY2.g[n21 + cY2.h * 1736753585] != 0) {
            ++n21;
        }
        byte[] arrby2 = new byte[n21];
        for (n17 = 0; n17 < n21; ++n17) {
            arrby2[n17] = cY2.e();
        }
        cY2.h += 1303963473;
        n17 = cY2.h * 1736753585;
        cY2.h += ++n21 * 1303963473;
        int n22 = 0;
        while (cY2.g[cY2.h * 1736753585 + n22] != 0) {
            ++n22;
        }
        byte[] arrby3 = new byte[n22];
        for (n11 = 0; n11 < n22; ++n11) {
            arrby3[n11] = cY2.e();
        }
        cY2.h += 1303963473;
        n11 = cY2.h * 1736753585;
        cY2.h += ++n22 * 1303963473;
        int n23 = 0;
        while (cY2.g[cY2.h * 1736753585 + n23] != 0) {
            ++n23;
        }
        byte[] arrby4 = new byte[n23];
        for (int i2 = 0; i2 < n23; ++i2) {
            arrby4[i2] = cY2.e();
        }
        cY2.h += 1303963473;
        byte[] arrby5 = new byte[++n23];
        if (n23 > 1) {
            arrby5[1] = 1;
            int n24 = 1;
            n20 = 2;
            for (n8 = 2; n8 < n23; ++n8) {
                int n25 = cY2.d();
                if (n25 == 0) {
                    n24 = n20++;
                } else {
                    if (n25 <= n24) {
                        --n25;
                    }
                    n24 = n25;
                }
                arrby5[n8] = (byte)n24;
            }
        } else {
            n20 = n23;
        }
        F[] arrf = new F[n20];
        for (n8 = 0; n8 < arrf.length; ++n8) {
            F f3 = arrf[n8] = new F();
            int n26 = cY2.d();
            if (n26 > 0) {
                f3.g = new byte[n26 * 2];
            }
            if ((n26 = cY2.d()) <= 0) continue;
            f3.f = new byte[2 + n26 * 2];
            f3.f[1] = 64;
        }
        n8 = cY2.d();
        byte[] arrby6 = n8 > 0 ? new byte[n8 * 2] : null;
        n8 = cY2.d();
        byte[] arrby7 = n8 > 0 ? new byte[n8 * 2] : null;
        int n27 = 0;
        while (cY2.g[cY2.h * 1736753585 + n27] != 0) {
            ++n27;
        }
        byte[] arrby8 = new byte[n27];
        for (n19 = 0; n19 < n27; ++n19) {
            arrby8[n19] = cY2.e();
        }
        cY2.h += 1303963473;
        ++n27;
        n19 = 0;
        for (n7 = 0; n7 < 128; ++n7) {
            this.e[n7] = (short)(n19 += cY2.d());
        }
        n19 = 0;
        for (n7 = 0; n7 < 128; ++n7) {
            this.e[n7] = (short)(this.e[n7] + ((n19 += cY2.d()) << 8));
        }
        n7 = 0;
        int n28 = 0;
        int n29 = 0;
        for (n5 = 0; n5 < 128; ++n5) {
            if (n7 == 0) {
                n7 = n28 < arrby8.length ? arrby8[n28++] : -1;
                n29 = cY2.x(-2040339769);
            }
            this.e[n5] = (short)(this.e[n5] + ((n29 - 1 & 2) << 14));
            this.c[n5] = n29;
            --n7;
        }
        n7 = 0;
        n28 = 0;
        n5 = 0;
        for (n10 = 0; n10 < 128; ++n10) {
            if (this.c[n10] == 0) continue;
            if (n7 == 0) {
                n7 = n28 < arrby2.length ? arrby2[n28++] : -1;
                n5 = cY2.g[n17++] - 1;
            }
            this.i[n10] = (byte)n5;
            --n7;
        }
        n7 = 0;
        n28 = 0;
        n10 = 0;
        for (int i3 = 0; i3 < 128; ++i3) {
            if (this.c[i3] == 0) continue;
            if (n7 == 0) {
                n7 = n28 < arrby3.length ? arrby3[n28++] : -1;
                n10 = cY2.g[n11++] + 16 << 2;
            }
            this.g[i3] = (byte)n10;
            --n7;
        }
        n7 = 0;
        n28 = 0;
        F f4 = null;
        for (n14 = 0; n14 < 128; ++n14) {
            if (this.c[n14] == 0) continue;
            if (n7 == 0) {
                f4 = arrf[arrby5[n28]];
                n7 = n28 < arrby4.length ? arrby4[n28++] : -1;
            }
            this.h[n14] = f4;
            --n7;
        }
        n7 = 0;
        n28 = 0;
        n14 = 0;
        for (n13 = 0; n13 < 128; ++n13) {
            if (n7 == 0) {
                n7 = n28 >= arrby8.length ? -1 : arrby8[n28++];
                if (this.c[n13] > 0) {
                    n14 = cY2.d() + 1;
                }
            }
            this.f[n13] = (byte)n14;
            --n7;
        }
        this.j = (cY2.d() + 1) * 511101199;
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.g != null) {
                for (n3 = 1; n3 < f2.g.length; n3 += 2) {
                    f2.g[n3] = cY2.e();
                }
            }
            if (f2.f == null) continue;
            for (n3 = 3; n3 < f2.f.length - 2; n3 += 2) {
                f2.f[n3] = cY2.e();
            }
        }
        if (arrby6 != null) {
            for (n13 = 1; n13 < arrby6.length; n13 += 2) {
                arrby6[n13] = cY2.e();
            }
        }
        if (arrby7 != null) {
            for (n13 = 1; n13 < arrby7.length; n13 += 2) {
                arrby7[n13] = cY2.e();
            }
        }
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.f == null) continue;
            n19 = 0;
            for (n3 = 2; n3 < f2.f.length; n3 += 2) {
                n19 = 1 + n19 + cY2.d();
                f2.f[n3] = (byte)n19;
            }
        }
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.g == null) continue;
            n19 = 0;
            for (n3 = 2; n3 < f2.g.length; n3 += 2) {
                n19 = 1 + n19 + cY2.d();
                f2.g[n3] = (byte)n19;
            }
        }
        if (arrby6 != null) {
            n19 = cY2.d();
            arrby6[0] = (byte)n19;
            for (n13 = 2; n13 < arrby6.length; n13 += 2) {
                n19 = 1 + n19 + cY2.d();
                arrby6[n13] = (byte)n19;
            }
            n9 = arrby6[0];
            n2 = arrby6[1];
            for (n3 = 0; n3 < n9; ++n3) {
                this.f[n3] = (byte)(32 + this.f[n3] * n2 >> 6);
            }
            for (n3 = 2; n3 < arrby6.length; n3 += 2) {
                n4 = arrby6[n3];
                n16 = arrby6[n3 + 1];
                n18 = (n4 - n9) * n2 + (n4 - n9) / 2;
                for (n12 = n9; n12 < n4; ++n12) {
                    n6 = dz.a(n18, n4 - n9, 1);
                    this.f[n12] = (byte)(this.f[n12] * n6 + 32 >> 6);
                    n18 += n16 - n2;
                }
                n9 = n4;
                n2 = n16;
            }
            for (n15 = n9; n15 < 128; ++n15) {
                this.f[n15] = (byte)(32 + n2 * this.f[n15] >> 6);
            }
            java.lang.Object var15_20 = null;
        }
        if (arrby7 != null) {
            n19 = cY2.d();
            arrby7[0] = (byte)n19;
            for (n13 = 2; n13 < arrby7.length; n13 += 2) {
                n19 = 1 + n19 + cY2.d();
                arrby7[n13] = (byte)n19;
            }
            n9 = arrby7[0];
            n2 = arrby7[1] << 1;
            for (n3 = 0; n3 < n9; ++n3) {
                n15 = (this.g[n3] & 255) + n2;
                if (n15 < 0) {
                    n15 = 0;
                }
                if (n15 > 128) {
                    n15 = 128;
                }
                this.g[n3] = (byte)n15;
            }
            for (n3 = 2; n3 < arrby7.length; n3 += 2) {
                n4 = arrby7[n3];
                n16 = arrby7[1 + n3] << 1;
                n18 = (n4 - n9) * n2 + (n4 - n9) / 2;
                for (n12 = n9; n12 < n4; ++n12) {
                    n6 = dz.a(n18, n4 - n9, 1);
                    int n30 = n6 + (this.g[n12] & 255);
                    if (n30 < 0) {
                        n30 = 0;
                    }
                    if (n30 > 128) {
                        n30 = 128;
                    }
                    this.g[n12] = (byte)n30;
                    n18 += n16 - n2;
                }
                n9 = n4;
                n2 = n16;
            }
            for (n15 = n9; n15 < 128; ++n15) {
                n16 = n2 + (this.g[n15] & 255);
                if (n16 < 0) {
                    n16 = 0;
                }
                if (n16 > 128) {
                    n16 = 128;
                }
                this.g[n15] = (byte)n16;
            }
            java.lang.Object var39_47 = null;
        }
        for (n13 = 0; n13 < n20; ++n13) {
            arrf[n13].a = cY2.d() * 1148047857;
        }
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.g != null) {
                f2.b = cY2.d() * 82887611;
            }
            if (f2.f != null) {
                f2.e = cY2.d() * -1824239391;
            }
            if (f2.a * -2080964847 <= 0) continue;
            f2.c = cY2.d() * -512476909;
        }
        for (n13 = 0; n13 < n20; ++n13) {
            arrf[n13].h = cY2.d() * -1016419175;
        }
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.h * -1018763351 <= 0) continue;
            f2.d = cY2.d() * 1778739331;
        }
        for (n13 = 0; n13 < n20; ++n13) {
            f2 = arrf[n13];
            if (f2.d * -1310972373 <= 0) continue;
            f2.i = cY2.d() * 871211463;
        }
    }
}

