/*
 * Decompiled with CFR 0_118.
 */
import java.util.Iterator;

public class L
implements Iterator {
    z a = null;
    z b;
    T c;

    @Override
    public void remove() {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        this.a.b();
        this.a = null;
    }

    public Object next() {
        z z2 = this.b;
        if (z2 != this.c.a) {
            this.b = z2.ak;
        } else {
            z2 = null;
            this.b = null;
        }
        this.a = z2;
        return z2;
    }

    L(T t2) {
        this.c = t2;
        this.b = this.c.a.ak;
        this.a = null;
    }

    @Override
    public boolean hasNext() {
        return this.b != this.c.a;
    }
}

