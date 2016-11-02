/*
 * Decompiled with CFR 0_118.
 */
import java.util.Iterator;

public class M
implements Iterator {
    cF a = null;
    cu b;
    cF c;

    M(cu cu2) {
        this.b = cu2;
        this.c = this.b.a.an;
        this.a = null;
    }

    public Object next() {
        cF cF2 = this.c;
        if (cF2 == this.b.a) {
            cF2 = null;
            this.c = null;
        } else {
            this.c = cF2.an;
        }
        this.a = cF2;
        return cF2;
    }

    @Override
    public boolean hasNext() {
        return this.c != this.b.a;
    }

    @Override
    public void remove() {
        if (this.a == null) {
            throw new IllegalStateException();
        }
        this.a.m();
        this.a = null;
    }
}

