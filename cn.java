/*
 * Decompiled with CFR 0_118.
 */
public class cn
extends cm {
    int e = 0;
    int f = -1;
    bA g = new bA();
    bA h = new bA();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void a(int[] arrn, int n2, int n3) {
        do {
            cl cl2;
            if (this.f < 0) {
                this.c(arrn, n2, n3);
                return;
            }
            if (this.e + n3 < this.f) {
                this.e += n3;
                this.c(arrn, n2, n3);
                return;
            }
            int n4 = this.f - this.e;
            this.c(arrn, n2, n4);
            n2 += n4;
            n3 -= n4;
            this.e += n4;
            this.e();
            cl cl3 = cl2 = (cl)this.h.g();
            synchronized (cl3) {
                int n5 = cl2.a(this);
                if (n5 < 0) {
                    cl2.a = 0;
                    this.a(cl2);
                } else {
                    cl2.a = n5;
                    this.a(cl2.an, cl2);
                }
                continue;
            }
        } while (n3 != 0);
    }

    public final synchronized void a(cm cm2) {
        this.g.b(cm2);
    }

    public final synchronized void b(cm cm2) {
        cm2.m();
    }

    void e() {
        if (this.e > 0) {
            cl cl2 = (cl)this.h.g();
            while (cl2 != null) {
                cl2.a -= this.e;
                cl2 = (cl)this.h.e();
            }
            this.f -= this.e;
            this.e = 0;
        }
    }

    void a(cl cl2) {
        cl2.m();
        cl2.a();
        cF cF2 = this.h.b.an;
        this.f = cF2 == this.h.b ? -1 : ((cl)cF2).a;
    }

    @Override
    protected cm d() {
        return (cm)this.g.e();
    }

    void c(int[] arrn, int n2, int n3) {
        cm cm2 = (cm)this.g.g();
        while (cm2 != null) {
            cm2.b(arrn, n2, n3);
            cm2 = (cm)this.g.e();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final synchronized void a(int n2) {
        do {
            cl cl2;
            if (this.f < 0) {
                this.b(n2);
                return;
            }
            if (this.e + n2 < this.f) {
                this.e += n2;
                this.b(n2);
                return;
            }
            int n3 = this.f - this.e;
            this.b(n3);
            n2 -= n3;
            this.e += n3;
            this.e();
            cl cl3 = cl2 = (cl)this.h.g();
            synchronized (cl3) {
                int n4 = cl2.a(this);
                if (n4 < 0) {
                    cl2.a = 0;
                    this.a(cl2);
                } else {
                    cl2.a = n4;
                    this.a(cl2.an, cl2);
                }
                continue;
            }
        } while (n2 != 0);
    }

    void b(int n2) {
        cm cm2 = (cm)this.g.g();
        while (cm2 != null) {
            cm2.a(n2);
            cm2 = (cm)this.g.e();
        }
    }

    @Override
    protected cm c() {
        return (cm)this.g.g();
    }

    @Override
    protected int a() {
        return 0;
    }

    void a(cF cF2, cl cl2) {
        while (cF2 != this.h.b && ((cl)cF2).a <= cl2.a) {
            cF2 = cF2.an;
        }
        bA.a(cl2, cF2);
        this.f = ((cl)this.h.b.an).a;
    }
}

