/*
 * Decompiled with CFR 0_118.
 */
public class bK {
    byte a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public bK(cY cY2, boolean bl2) {
        this.a = cY2.e();
        this.b = cY2.f() * -19469067;
        this.c = cY2.i() * -578803967;
        this.d = cY2.i() * -1248938609;
        this.e = cY2.i() * -377919849;
        this.f = cY2.i() * 432259385;
        if (bl2) {
            this.a(dy.a(cY2, -1659910775), -129);
        }
    }

    public int a() {
        return this.a & 7;
    }

    public int b() {
        return (this.a & 8) == 8 ? 1 : 0;
    }

    void a(int n2) {
        this.a = (byte)(this.a & -8);
        this.a = (byte)(this.a | n2 & 7);
    }

    public bK() {
    }

    void a(Integer n2, short s2) {
    }

    void a(int n2, int n3) {
        this.a = (byte)(this.a & -9);
        if (n2 == 1) {
            this.a = (byte)(this.a | 8);
        }
    }
}

