/*
 * Decompiled with CFR 0_118.
 */
public final class cW {
    z a;

    public void a(z z2) {
        if (z2.al != null) {
            z2.b();
        }
        z2.al = this.a.al;
        z2.ak = this.a;
        z2.al.ak = z2;
        z2.ak.al = z2;
    }

    public void b(z z2) {
        if (z2.al != null) {
            z2.b();
        }
        z2.al = this.a;
        z2.ak = this.a.ak;
        z2.al.ak = z2;
        z2.ak.al = z2;
    }

    public z a() {
        z z2 = this.a.ak;
        return z2 != this.a ? z2 : null;
    }

    void b() {
        z z2;
        while ((z2 = this.a.ak) != this.a) {
            z2.b();
        }
        return;
    }

    z c() {
        z z2 = this.a.ak;
        if (z2 == this.a) {
            return null;
        }
        z2.b();
        return z2;
    }

    public cW() {
        this.a.ak = this.a = new z();
        this.a.al = this.a;
    }
}

