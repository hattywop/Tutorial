/*
 * Decompiled with CFR 0_118.
 */
public class b
extends z {
    int a;
    static a b;
    static a c;
    protected static int d;
    static n e;
    static n f;
    public int g = 1140458533;
    int h = 711925632;
    int i = 446051968;
    int j = 0;
    int k = 0;
    int l = 0;
    int m;
    short[] n;
    short[] o;
    short[] p;
    short[] q;

    void a(cY cY2) {
        int n2;
        while ((n2 = cY2.d()) != 0) {
            this.a(cY2, n2);
        }
        return;
    }

    public static int a(int n2) {
        dB dB2 = cL.b(n2);
        int n3 = dB2.d * -2125842197;
        int n4 = dB2.e * -96319771;
        int n5 = dB2.f * 1068024283;
        int n6 = I.h[n5 - n4];
        return I.j[n3] >> n4 & n6;
    }

    public final cB b(int n2) {
        void var3_6;
        cB cB2 = (cB)f.a(this.a * 668756005);
        if (cB2 == null) {
            int n3;
            da da2 = da.a(c, this.m * 1166865539, 0);
            if (da2 == null) {
                return null;
            }
            if (this.n != null) {
                for (n3 = 0; n3 < this.n.length; ++n3) {
                    da2.a(this.n[n3], this.o[n3]);
                }
            }
            if (this.p != null) {
                for (n3 = 0; n3 < this.p.length; ++n3) {
                    da2.b(this.p[n3], this.q[n3]);
                }
            }
            cB2 = da2.a(this.k * -157824907 + 64, 850 + this.l * 1459197473, -30, -50, -30);
            f.a(cB2, this.a * 668756005);
        }
        if (this.g * 28936275 != -1 && n2 != -1) {
            cB cB3 = c.b(this.g * 28936275).c(cB2, n2, 415198856);
        } else {
            cB cB4 = cB2.b(true);
        }
        if (this.h * 1561596351 != 128 || this.i * -159531675 != 128) {
            var3_6.a(this.h * 1561596351, this.i * -159531675, this.h * 1561596351);
        }
        if (this.j * -2101797565 != 0) {
            if (this.j * -2101797565 == 90) {
                var3_6.e();
            }
            if (this.j * -2101797565 == 180) {
                var3_6.e();
                var3_6.e();
            }
            if (this.j * -2101797565 == 270) {
                var3_6.e();
                var3_6.e();
                var3_6.e();
            }
        }
        return var3_6;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(cY cY2, int n2) {
        if (n2 == 1) {
            this.m = cY2.f() * 1666841131;
            return;
        } else if (n2 == 2) {
            this.g = cY2.f() * -1140458533;
            return;
        } else if (n2 == 4) {
            this.h = cY2.f() * -1571496385;
            return;
        } else if (n2 == 5) {
            this.i = cY2.f() * -1305138067;
            return;
        } else if (n2 == 6) {
            this.j = cY2.f() * -752527509;
            return;
        } else if (n2 == 7) {
            this.k = cY2.d() * 1022478301;
            return;
        } else if (n2 == 8) {
            this.l = cY2.d() * -1260950047;
            return;
        } else {
            if (n2 == 40) {
                int n3 = cY2.d();
                this.n = new short[n3];
                this.o = new short[n3];
                int n4 = 0;
                while (n4 < n3) {
                    this.n[n4] = (short)cY2.f();
                    this.o[n4] = (short)cY2.f();
                    ++n4;
                }
                return;
            }
            if (n2 != 41) return;
            int n5 = cY2.d();
            this.p = new short[n5];
            this.q = new short[n5];
            int n6 = 0;
            while (n6 < n5) {
                this.p[n6] = (short)cY2.f();
                this.q[n6] = (short)cY2.f();
                ++n6;
            }
            return;
        }
    }

    static final void a(byte[] arrby, int n2, int n3, int n4, int n5, df[] arrdf, byte by2) {
        int n6;
        int n7;
        for (int i2 = 0; i2 < 4; ++i2) {
            for (n6 = 0; n6 < 64; ++n6) {
                for (n7 = 0; n7 < 64; ++n7) {
                    if (n2 + n6 <= 0 || n2 + n6 >= 103 || n7 + n3 <= 0 || n7 + n3 >= 103) continue;
                    int[] arrn = arrdf[i2].f[n2 + n6];
                    int n8 = n7 + n3;
                    arrn[n8] = arrn[n8] & -16777217;
                }
            }
        }
        cY cY2 = new cY(arrby);
        for (n6 = 0; n6 < 4; ++n6) {
            for (n7 = 0; n7 < 64; ++n7) {
                for (int i3 = 0; i3 < 64; ++i3) {
                    aL.a(cY2, n6, n7 + n2, n3 + i3, n4, n5, 0, -805248053);
                }
            }
        }
    }

    static {
        e = new n(64);
        f = new n(30);
    }
}

