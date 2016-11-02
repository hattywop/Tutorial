/*
 * Decompiled with CFR 0_118.
 */
public class ds {
    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i = 2;
    int[] j = new int[2];
    int[] k = new int[2];

    final void a(cY cY2) {
        this.a = cY2.d();
        this.b = cY2.i();
        this.c = cY2.i();
        this.b(cY2);
    }

    final void a() {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = 0;
    }

    ds() {
        this.j[0] = 0;
        this.j[1] = 65535;
        this.k[0] = 0;
        this.k[1] = 65535;
    }

    final void b(cY cY2) {
        this.i = cY2.d();
        this.j = new int[this.i];
        this.k = new int[this.i];
        for (int i2 = 0; i2 < this.i; ++i2) {
            this.j[i2] = cY2.f();
            this.k[i2] = cY2.f();
        }
    }

    final int a(int n2) {
        if (this.h >= this.d) {
            this.g = this.k[this.e++] << 15;
            if (this.e >= this.i) {
                this.e = this.i - 1;
            }
            this.d = (int)((double)this.j[this.e] / 65536.0 * (double)n2);
            if (this.d > this.h) {
                this.f = ((this.k[this.e] << 15) - this.g) / (this.d - this.h);
            }
        }
        this.g += this.f;
        ++this.h;
        return this.g - this.f >> 15;
    }
}

