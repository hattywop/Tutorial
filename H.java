/*
 * Decompiled with CFR 0_118.
 */
public class H {
    cY a = new cY(null);
    int b;
    int c;
    int[] d;
    long e;
    int[] f;
    int[] g;
    int[] h;
    static byte[] i = new byte[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    H(byte[] arrby) {
        this.a(arrby);
    }

    void a(byte[] arrby) {
        this.a.g = arrby;
        this.a.h = 154732842;
        int n2 = this.a.f();
        this.b = this.a.f();
        this.c = 500000;
        this.d = new int[n2];
        int n3 = 0;
        while (n3 < n2) {
            int n4 = this.a.i();
            int n5 = this.a.i();
            if (n4 == 1297379947) {
                this.d[n3] = this.a.h * 1736753585;
                ++n3;
            }
            this.a.h += n5 * 1303963473;
        }
        this.e = 0;
        this.f = new int[n2];
        for (n3 = 0; n3 < n2; ++n3) {
            this.f[n3] = this.d[n3];
        }
        this.g = new int[n2];
        this.h = new int[n2];
    }

    boolean a() {
        int n2 = this.f.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.f[i2] < 0) continue;
            return false;
        }
        return true;
    }

    void b() {
        this.a.g = null;
        this.d = null;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    void a(int n2) {
        this.f[n2] = this.a.h * 1736753585;
    }

    void c() {
        this.a.h = -1303963473;
    }

    int b(int n2) {
        int n3 = this.d(n2);
        return n3;
    }

    void c(int n2) {
        this.a.h = this.f[n2] * 1303963473;
    }

    int d(int n2) {
        int n3;
        int n4;
        byte by2 = this.a.g[this.a.h * 1736753585];
        if (by2 < 0) {
            this.h[n2] = n3 = by2 & 255;
            this.a.h += 1303963473;
        } else {
            n3 = this.h[n2];
        }
        if (n3 != 240 && n3 != 247) {
            return this.a(n2, n3);
        }
        int n5 = this.a.x(-2040339769);
        if (n3 == 247 && n5 > 0 && ((n4 = this.a.g[this.a.h * 1736753585] & 255) >= 241 && n4 <= 243 || n4 == 246 || n4 == 248 || n4 >= 250 && n4 <= 252 || n4 == 254)) {
            this.a.h += 1303963473;
            this.h[n2] = n4;
            return this.a(n2, n4);
        }
        this.a.h += n5 * 1303963473;
        return 0;
    }

    int d() {
        int n2 = this.f.length;
        int n3 = -1;
        int n4 = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.f[i2] < 0 || this.g[i2] >= n4) continue;
            n3 = i2;
            n4 = this.g[i2];
        }
        return n3;
    }

    void a(long l2) {
        this.e = l2;
        int n2 = this.f.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.g[i2] = 0;
            this.h[i2] = 0;
            this.a.h = this.d[i2] * 1303963473;
            this.e(i2);
            this.f[i2] = this.a.h * 1736753585;
        }
    }

    boolean e() {
        return this.a.g != null;
    }

    H() {
    }

    void e(int n2) {
        int n3 = this.a.x(-2040339769);
        int[] arrn = this.g;
        int n4 = n2;
        arrn[n4] = arrn[n4] + n3;
    }

    long f(int n2) {
        return this.e + (long)n2 * (long)this.c;
    }

    int f() {
        return this.f.length;
    }

    int a(int n2, int n3) {
        if (n3 == 255) {
            int n4 = this.a.d();
            int n5 = this.a.x(-2040339769);
            if (n4 == 47) {
                this.a.h += n5 * 1303963473;
                return 1;
            }
            if (n4 == 81) {
                int n6 = this.a.h();
                int n7 = this.g[n2];
                this.e += (long)n7 * (long)(this.c - n6);
                this.c = n6;
                this.a.h += (n5 -= 3) * 1303963473;
                return 2;
            }
            this.a.h += n5 * 1303963473;
            return 3;
        }
        byte by2 = i[n3 - 128];
        int n8 = n3;
        if (by2 >= 1) {
            n8 = n3 | this.a.d() << 8;
        }
        if (by2 >= 2) {
            n8 |= this.a.d() << 16;
        }
        return n8;
    }
}

