/*
 * Decompiled with CFR 0_118.
 */
public class N {
    U a;
    U b;

    public void a(U u2) {
        if (u2.b != null) {
            u2.a();
        }
        u2.b = this.b.b;
        u2.a = this.b;
        u2.b.a = u2;
        u2.a.b = u2;
    }

    public U a() {
        U u2 = this.b.a;
        if (u2 != this.b) {
            this.a = u2.a;
            return u2;
        }
        this.a = null;
        return null;
    }

    public N() {
        this.b.a = this.b = new U();
        this.b.b = this.b;
    }

    public U b() {
        U u2 = this.a;
        if (u2 == this.b) {
            this.a = null;
            return null;
        }
        this.a = u2.a;
        return u2;
    }
}

