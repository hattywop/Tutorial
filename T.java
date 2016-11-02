/*
 * Decompiled with CFR 0_118.
 */
import java.util.Iterator;

public class T
implements Iterable {
    public z a;

    public void a(z z2) {
        if (z2.al != null) {
            z2.b();
        }
        z2.al = this.a.al;
        z2.ak = this.a;
        z2.al.ak = z2;
        z2.ak.al = z2;
    }

    public void a() {
        while (this.a.ak != this.a) {
            this.a.ak.b();
        }
    }

    public T() {
        this.a.ak = this.a = new z();
        this.a.al = this.a;
    }

    public Iterator iterator() {
        return new L(this);
    }
}

