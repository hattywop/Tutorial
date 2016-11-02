/*
 * Decompiled with CFR 0_118.
 */
public class U {
    U a;
    U b;

    public void a() {
        if (this.b != null) {
            this.b.a = this.a;
            this.a.b = this.b;
            this.a = null;
            this.b = null;
        }
    }
}

