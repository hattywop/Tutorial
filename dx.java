/*
 * Decompiled with CFR 0_118.
 */
public class dx
implements dw {
    double a = 1.0;
    int b = 0;
    bA c = new bA();
    int d = -569392512;
    a e;
    int f;
    dv[] g;

    public void a(double d2) {
        this.a = d2;
        this.a(89);
    }

    @Override
    public int[] a(int n2, int n3) {
        dv dv2 = this.g[n2];
        if (dv2 != null) {
            if (dv2.a != null) {
                this.c.b(dv2);
                dv2.b = true;
                return dv2.a;
            }
            boolean bl2 = dv2.a(this.a, this.d * -1752235699, this.e);
            if (bl2) {
                if (this.b * 1731592125 == 0) {
                    dv dv3 = (dv)this.c.b();
                    dv3.a();
                } else {
                    this.b -= 1784001429;
                }
                this.c.b(dv2);
                dv2.b = true;
                return dv2.a;
            }
        }
        return null;
    }

    public dx(a a2, a a3, int n2, double d2, int n3) {
        this.e = a3;
        this.f = n2 * -996600599;
        this.b = this.f * -627364403;
        this.a = d2;
        this.d = n3 * 1908154245;
        int[] arrn = a2.d(0, 1773905318);
        int n4 = arrn.length;
        this.g = new dv[a2.b(0)];
        for (int i2 = 0; i2 < n4; ++i2) {
            cY cY2 = new cY(a2.b(0, arrn[i2]));
            this.g[arrn[i2]] = new dv(cY2);
        }
    }

    @Override
    public boolean b(int n2, byte by2) {
        return this.d * -1752235699 == 64;
    }

    public void c(int n2, int n3) {
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            dv dv2 = this.g[i2];
            if (dv2 == null || dv2.i == 0 || !dv2.b) continue;
            dv2.a(n2);
            dv2.b = false;
        }
    }

    public void a(byte by2) {
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            if (this.g[i2] == null) continue;
            this.g[i2].a();
        }
        this.c = new bA();
        this.b = this.f * -627364403;
    }

    @Override
    public boolean a(int n2, byte by2) {
        return this.g[n2].d;
    }

    @Override
    public int b(int n2, int n3) {
        return this.g[n2] != null ? this.g[n2].c : 0;
    }

    static final int a(int n2) {
        if (!ag.d.f) {
            int n3 = c.a(c.f * -1967123133, q.b * 681386919, u.d * -1093536619, -1847964236);
            return n3 - cD.a * 113597655 < 800 && (ax.i[u.d * -1093536619][c.f * -1967123133 >> 7][q.b * 681386919 >> 7] & 4) != 0 ? u.d * -1093536619 : 3;
        }
        return u.d * -1093536619;
    }

    static void a(cP cP2, int n2, int n3, byte by2) {
        if (cP2.r * 1287875615 == n2 && n2 != -1) {
            int n4 = c.b((int)n2).l * -991178587;
            if (n4 == 1) {
                cP2.W = 0;
                cP2.X = 0;
                cP2.Y = n3 * -88244917;
                cP2.Z = 0;
            }
            if (n4 == 2) {
                cP2.Z = 0;
            }
        } else if (n2 == -1 || cP2.r * 1287875615 == -1 || c.b((int)n2).h * -251389863 >= c.b((int)(cP2.r * 1287875615)).h * -251389863) {
            cP2.r = n2 * 1940983775;
            cP2.W = 0;
            cP2.X = 0;
            cP2.Y = n3 * -88244917;
            cP2.Z = 0;
            cP2.t = cP2.s * 1030099461;
        }
    }
}

