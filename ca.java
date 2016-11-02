/*
 * Decompiled with CFR 0_118.
 */
public class ca
extends z {
    public static int a;
    static a b;
    public int c;
    static cN[] d;
    int e;
    public String f = "null";
    public int g = -1530229008;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public int k = 0;
    public int l = 0;
    public int m = -634828929;
    public boolean n = false;
    int o = 492117005;
    int p = 0;
    int q = 959436883;
    int r = -1976830921;
    int s = 0;
    int t = 277653161;
    short[] u;
    short[] v;
    short[] w;
    short[] x;
    public boolean y = false;
    int z = 112306683;
    int A = -1830515813;
    int B = -1209387861;
    int C = 2123626629;
    int D = -16960105;
    int E = 522275853;
    public int F = 0;
    public int G = 1297858855;
    public int H = 1236475361;
    int I = -227599488;
    int[] J;
    int[] K;
    int L = -1397589120;
    int M = -752964992;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    int Q = 1221893825;
    int R = -1053045751;
    public String[] S = new String[]{null, null, du.c, null, null};
    public String[] T = new String[]{null, null, null, null, du.d};
    public int U = -1;
    public int V = -1;
    public boolean W;

    void a(cY cY2) {
        this.W = true;
        int n2;
        while ((n2 = cY2.d()) != 0) {
            this.a(cY2, n2);
        }
        return;
    }

    void a(cY cY2, int n2) {
        if (n2 == 1) {
            this.e = cY2.f() * -1054390825;
        } else if (n2 == 2) {
            this.f = cY2.l();
        } else if (n2 == 4) {
            this.g = cY2.f() * 1014994651;
        } else if (n2 == 5) {
            this.h = cY2.f() * -263973679;
        } else if (n2 == 6) {
            this.i = cY2.f() * 78727147;
        } else if (n2 == 7) {
            this.j = cY2.f() * 63991361;
            if (this.j * 889627073 > 32767) {
                this.j -= 1849753600;
            }
        } else if (n2 == 8) {
            this.k = cY2.f() * 2102295875;
            if (this.k * -722274453 > 32767) {
                this.k -= 2101542912;
            }
        } else if (n2 == 11) {
            this.l = -1951064907;
        } else if (n2 == 12) {
            this.m = cY2.i() * -634828929;
        } else if (n2 == 16) {
            this.n = true;
        } else if (n2 == 23) {
            this.o = cY2.f() * -492117005;
            this.p = cY2.d() * -1813776585;
        } else if (n2 == 24) {
            this.q = cY2.f() * -959436883;
        } else if (n2 == 25) {
            this.r = cY2.f() * 1976830921;
            this.s = cY2.d() * -2010187323;
        } else if (n2 == 26) {
            this.t = cY2.f() * -277653161;
        } else if (n2 >= 30 && n2 < 35) {
            this.S[n2 - 30] = cY2.l();
            if (this.S[n2 - 30].equalsIgnoreCase(du.e)) {
                this.S[n2 - 30] = null;
            }
        } else if (n2 >= 35 && n2 < 40) {
            this.T[n2 - 35] = cY2.l();
        } else if (n2 == 40) {
            int n3 = cY2.d();
            this.u = new short[n3];
            this.v = new short[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                this.u[i2] = (short)cY2.f();
                this.v[i2] = (short)cY2.f();
            }
        } else if (n2 == 41) {
            int n4 = cY2.d();
            this.w = new short[n4];
            this.x = new short[n4];
            for (int i3 = 0; i3 < n4; ++i3) {
                this.w[i3] = (short)cY2.f();
                this.x[i3] = (short)cY2.f();
            }
        } else if (n2 == 65) {
            this.y = true;
        } else if (n2 == 78) {
            this.z = cY2.f() * -112306683;
        } else if (n2 == 79) {
            this.A = cY2.f() * 1830515813;
        } else if (n2 == 90) {
            this.B = cY2.f() * 1209387861;
        } else if (n2 == 91) {
            this.C = cY2.f() * -2123626629;
        } else if (n2 == 92) {
            this.D = cY2.f() * 16960105;
        } else if (n2 == 93) {
            this.E = cY2.f() * -522275853;
        } else if (n2 == 95) {
            this.F = cY2.f() * -147237813;
        } else if (n2 == 97) {
            this.G = cY2.f() * -1297858855;
        } else if (n2 == 98) {
            this.H = cY2.f() * -1236475361;
        } else if (n2 >= 100 && n2 < 110) {
            if (this.J == null) {
                this.J = new int[10];
                this.K = new int[10];
            }
            this.J[n2 - 100] = cY2.f();
            this.K[n2 - 100] = cY2.f();
        } else if (n2 == 110) {
            this.I = cY2.f() * 1977933367;
        } else if (n2 == 111) {
            this.L = cY2.f() * 1935238391;
        } else if (n2 == 112) {
            this.M = cY2.f() * -442090155;
        } else if (n2 == 113) {
            this.N = cY2.e() * -437318773;
        } else if (n2 == 114) {
            this.O = cY2.e() * 859393051;
        } else if (n2 == 115) {
            this.P = cY2.d() * 2016092763;
        } else if (n2 == 139) {
            this.Q = cY2.f() * -1221893825;
        } else if (n2 == 140) {
            this.R = cY2.f() * 1053045751;
        } else if (n2 == 148) {
            this.U = cY2.f();
        } else if (n2 == 149) {
            this.V = cY2.f();
        }
    }

    void a(ca ca2, ca ca3) {
        this.e = ca2.e * 1;
        this.g = ca2.g * 1;
        this.h = ca2.h * 1;
        this.i = ca2.i * 1;
        this.F = ca2.F * 1;
        this.j = ca2.j * 1;
        this.k = ca2.k * 1;
        this.u = ca2.u;
        this.v = ca2.v;
        this.w = ca2.w;
        this.x = ca2.x;
        this.f = ca3.f;
        this.n = ca3.n;
        this.m = ca3.m * 1;
        this.l = -1951064907;
    }

    void b(ca ca2, ca ca3) {
        this.e = ca2.e * 1;
        this.g = ca2.g * 1;
        this.h = ca2.h * 1;
        this.i = ca2.i * 1;
        this.F = ca2.F * 1;
        this.j = ca2.j * 1;
        this.k = ca2.k * 1;
        this.u = ca2.u;
        this.v = ca2.v;
        this.w = ca2.w;
        this.x = ca2.x;
        this.l = ca2.l * 1;
        this.f = ca3.f;
        this.m = 0;
        this.n = false;
        this.y = false;
    }

    void c(ca ca2, ca ca3) {
        this.e = ca2.e * 1;
        this.g = ca2.g * 1;
        this.h = ca2.h * 1;
        this.i = ca2.i * 1;
        this.F = ca2.F * 1;
        this.j = ca2.j * 1;
        this.k = ca2.k * 1;
        this.u = ca3.u;
        this.v = ca3.v;
        this.w = ca3.w;
        this.x = ca3.x;
        this.f = ca3.f;
        this.n = ca3.n;
        this.l = ca3.l * 1;
        this.o = ca3.o * 1;
        this.q = ca3.q * 1;
        this.z = ca3.z * 1;
        this.r = ca3.r * 1;
        this.t = ca3.t * 1;
        this.A = ca3.A * 1;
        this.B = ca3.B * 1;
        this.D = ca3.D * 1;
        this.C = ca3.C * 1;
        this.E = ca3.E * 1;
        this.P = ca3.P * 1;
        this.S = ca3.S;
        this.T = new String[5];
        if (ca3.T != null) {
            for (int i2 = 0; i2 < 4; ++i2) {
                this.T[i2] = ca3.T[i2];
            }
        }
        this.T[4] = du.i;
        this.m = 0;
    }

    public static final cX a(int n2, int n3, int n4, int n5, int n6, boolean bl2) {
        cX cX2;
        cB cB2;
        if (n3 == -1) {
            n6 = 0;
        } else if (n6 == 2 && n3 != 1) {
            n6 = 1;
        }
        long l2 = ((long)n4 << 38) + (long)n2 + ((long)n3 << 16) + ((long)n6 << 40) + ((long)n5 << 42);
        if (!bl2 && (cX2 = (cX)aq.m.a(l2)) != null) {
            return cX2;
        }
        ca ca2 = bH.j(n2);
        if (n3 > 1 && ca2.J != null) {
            int n7 = -1;
            for (int i2 = 0; i2 < 10; ++i2) {
                if (n3 < ca2.K[i2] || ca2.K[i2] == 0) continue;
                n7 = ca2.J[i2];
            }
            if (n7 != -1) {
                ca2 = bH.j(n7);
            }
        }
        if ((cB2 = ca2.c(1)) == null) {
            return null;
        }
        cX cX3 = null;
        if (ca2.H * -993125921 != -1 ? (cX3 = ca.a(ca2.G * -1776131735, 10, 1, 0, 0, true)) == null : (ca2.R * -1715175993 != -1 ? (cX3 = ca.a(ca2.Q * -210825537, n3, n4, n5, 0, false)) == null : ca2.V != -1 && (cX3 = ca.a(ca2.U, n3, 0, 0, 0, false)) == null)) {
            return null;
        }
        int[] arrn = dd.A;
        int n8 = dd.B;
        int n9 = dd.C;
        int[] arrn2 = new int[4];
        dd.b(arrn2);
        cX2 = new cX(36, 32);
        dd.a(cX2.a, 36, 32);
        dd.g();
        de.a();
        de.a(16, 16);
        de.n = false;
        if (ca2.V != -1) {
            cX3.b(0, 0);
        }
        int n10 = ca2.g * 2131785043;
        if (bl2) {
            n10 = (int)(1.5 * (double)n10);
        } else if (n4 == 2) {
            n10 = (int)(1.04 * (double)n10);
        }
        int n11 = n10 * de.t[ca2.h * -1802976207] >> 16;
        int n12 = n10 * de.u[ca2.h * -1802976207] >> 16;
        cB2.a();
        cB2.a(0, ca2.i * 877439171, ca2.F * -774449821, ca2.h * -1802976207, ca2.j * 889627073, ca2.k * -722274453 + n11 + cB2.aN * -695779227 / 2, n12 + ca2.k * -722274453);
        if (ca2.R * -1715175993 != -1) {
            cX3.b(0, 0);
        }
        if (n4 >= 1) {
            cX2.c(1);
        }
        if (n4 >= 2) {
            cX2.c(16777215);
        }
        if (n5 != 0) {
            cX2.a(n5);
        }
        dd.a(cX2.a, 36, 32);
        if (ca2.H * -993125921 != -1) {
            cX3.b(0, 0);
        }
        if (n6 == 1 || n6 == 2 && ca2.l * 833352093 == 1) {
            cj.e.a(bw.a(n3), 0, 9, 16776960, 1);
        }
        if (!bl2) {
            aq.m.a(cX2, l2);
        }
        dd.a(arrn, n8, n9);
        dd.a(arrn2);
        de.a();
        de.n = true;
        return cX2;
    }

    public final da a(int n2) {
        int n3;
        da da2;
        if (this.J != null && n2 > 1) {
            int n4 = -1;
            for (n3 = 0; n3 < 10; ++n3) {
                if (n2 < this.K[n3] || this.K[n3] == 0) continue;
                n4 = this.J[n3];
            }
            if (n4 != -1) {
                return bH.j(n4).a(1);
            }
        }
        if ((da2 = da.a(bt.b, this.e * -1065714201, 0)) == null) {
            return null;
        }
        if (this.I * 192362375 != 128 || this.L * -1864065849 != 128 || this.M * -1066936323 != 128) {
            da2.b(this.I * 192362375, this.L * -1864065849, this.M * -1066936323);
        }
        if (this.u != null) {
            for (n3 = 0; n3 < this.u.length; ++n3) {
                da2.a(this.u[n3], this.v[n3]);
            }
        }
        if (this.w != null) {
            for (n3 = 0; n3 < this.w.length; ++n3) {
                da2.b(this.w[n3], this.x[n3]);
            }
        }
        return da2;
    }

    public ca b(int n2) {
        if (this.J != null && n2 > 1) {
            int n3 = -1;
            for (int i2 = 0; i2 < 10; ++i2) {
                if (n2 < this.K[i2] || this.K[i2] == 0) continue;
                n3 = this.J[i2];
            }
            if (n3 != -1) {
                return bH.j(n3);
            }
        }
        return this;
    }

    public final boolean a(boolean bl2) {
        int n2 = this.B * 581949949;
        int n3 = this.D * -1515231783;
        if (bl2) {
            n2 = this.C * -1056522317;
            n3 = this.E * 957226299;
        }
        if (n2 == -1) {
            return true;
        }
        boolean bl3 = true;
        if (!bt.b.b(n2, 0, 183776178)) {
            bl3 = false;
        }
        if (n3 != -1 && !bt.b.b(n3, 0, 913249120)) {
            bl3 = false;
        }
        return bl3;
    }

    public final da b(boolean bl2) {
        int n2 = this.o * -923439813;
        int n3 = this.q * 1026282533;
        int n4 = this.z * 135071437;
        if (bl2) {
            n2 = this.r * -219283847;
            n3 = this.t * 1201840743;
            n4 = this.A * -257942163;
        }
        if (n2 == -1) {
            return null;
        }
        da da2 = da.a(bt.b, n2, 0);
        if (n3 != -1) {
            da[] arrda;
            da da3 = da.a(bt.b, n3, 0);
            if (n4 != -1) {
                arrda = da.a(bt.b, n4, 0);
                da[] arrda2 = new da[]{da2, da3, arrda};
                da2 = new da(arrda2, 3);
            } else {
                arrda = new da[]{da2, da3};
                da2 = new da(arrda, 2);
            }
        }
        if (!bl2 && this.p * 527003271 != 0) {
            da2.a(0, this.p * 527003271, 0);
        }
        if (bl2 && this.s * 891952397 != 0) {
            da2.a(0, this.s * 891952397, 0);
        }
        if (this.u != null) {
            for (int i2 = 0; i2 < this.u.length; ++i2) {
                da2.a(this.u[i2], this.v[i2]);
            }
        }
        if (this.w != null) {
            for (int i3 = 0; i3 < this.w.length; ++i3) {
                da2.b(this.w[i3], this.x[i3]);
            }
        }
        return da2;
    }

    public final da c(boolean bl2) {
        int n2 = this.B * 581949949;
        int n3 = this.D * -1515231783;
        if (bl2) {
            n2 = this.C * -1056522317;
            n3 = this.E * 957226299;
        }
        if (n2 == -1) {
            return null;
        }
        da da2 = da.a(bt.b, n2, 0);
        if (n3 != -1) {
            da da3 = da.a(bt.b, n3, 0);
            da[] arrda = new da[]{da2, da3};
            da2 = new da(arrda, 2);
        }
        if (this.u != null) {
            for (int i2 = 0; i2 < this.u.length; ++i2) {
                da2.a(this.u[i2], this.v[i2]);
            }
        }
        if (this.w != null) {
            for (int i3 = 0; i3 < this.w.length; ++i3) {
                da2.b(this.w[i3], this.x[i3]);
            }
        }
        return da2;
    }

    public final cB c(int n2) {
        int n3;
        cB cB2;
        if (this.J != null && n2 > 1) {
            int n4 = -1;
            for (int i2 = 0; i2 < 10; ++i2) {
                if (n2 < this.K[i2] || this.K[i2] == 0) continue;
                n4 = this.J[i2];
            }
            if (n4 != -1) {
                return bH.j(n4).c(1);
            }
        }
        if ((cB2 = (cB)aq.l.a(this.c * 1539412267)) != null) {
            return cB2;
        }
        da da2 = da.a(bt.b, this.e * -1065714201, 0);
        if (da2 == null) {
            return null;
        }
        if (this.I * 192362375 != 128 || this.L * -1864065849 != 128 || this.M * -1066936323 != 128) {
            da2.b(this.I * 192362375, this.L * -1864065849, this.M * -1066936323);
        }
        if (this.u != null) {
            for (n3 = 0; n3 < this.u.length; ++n3) {
                da2.a(this.u[n3], this.v[n3]);
            }
        }
        if (this.w != null) {
            for (n3 = 0; n3 < this.w.length; ++n3) {
                da2.b(this.w[n3], this.x[n3]);
            }
        }
        cB2 = da2.a(64 + this.N * 1037157411, 768 + this.O * 517891679, -50, -10, -50);
        cB2.v = true;
        aq.l.a(cB2, this.c * 1539412267);
        return cB2;
    }

    static cX[] a() {
        cX[] arrcX = new cX[dg.b * -877080713];
        for (int i2 = 0; i2 < dg.b * -877080713; ++i2) {
            cX cX2 = arrcX[i2] = new cX();
            cX2.b = dg.f * 1155403717;
            cX2.d = dg.a * 1186444245;
            cX2.g = dg.d[i2];
            cX2.f = dg.e[i2];
            cX2.c = aP.b[i2];
            cX2.e = bH.fn[i2];
            int n2 = cX2.e * cX2.c;
            byte[] arrby = cS.b[i2];
            cX2.a = new int[n2];
            for (int i3 = 0; i3 < n2; ++i3) {
                cX2.a[i3] = dB.c[arrby[i3] & 255];
            }
        }
        dB.a();
        return arrcX;
    }

    ca() {
    }

    public final boolean d(boolean bl2) {
        int n2 = this.o * -923439813;
        int n3 = this.q * 1026282533;
        int n4 = this.z * 135071437;
        if (bl2) {
            n2 = this.r * -219283847;
            n3 = this.t * 1201840743;
            n4 = this.A * -257942163;
        }
        if (n2 == -1) {
            return true;
        }
        boolean bl3 = true;
        if (!bt.b.b(n2, 0, 839387507)) {
            bl3 = false;
        }
        if (n3 != -1 && !bt.b.b(n3, 0, -1673125648)) {
            bl3 = false;
        }
        if (n4 != -1 && !bt.b.b(n4, 0, -180792512)) {
            bl3 = false;
        }
        return bl3;
    }

    static cX c() {
        cX cX2 = new cX();
        cX2.b = dg.f * 1155403717;
        cX2.d = dg.a * 1186444245;
        cX2.g = dg.d[0];
        cX2.f = dg.e[0];
        cX2.c = aP.b[0];
        cX2.e = bH.fn[0];
        int n2 = cX2.e * cX2.c;
        byte[] arrby = cS.b[0];
        cX2.a = new int[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            cX2.a[i2] = dB.c[arrby[i2] & 255];
        }
        dB.a();
        return cX2;
    }
}

