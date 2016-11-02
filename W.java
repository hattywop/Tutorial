/*
 * Decompiled with CFR 0_118.
 */
import java.util.Comparator;

final class W
implements Comparator {
    W() {
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    int a(bF bF2, bF bF3) {
        return bF2.e.d * 122603887 >= bF3.e.d * 122603887 ? (bF3.e.d * 122603887 == bF2.e.d * 122603887 ? 0 : 1) : -1;
    }

    public int compare(Object object, Object object2) {
        return this.a((bF)object, (bF)object2);
    }
}

