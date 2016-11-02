/*
 * Decompiled with CFR 0_118.
 */
import java.util.Comparator;

final class Y
implements Comparator {
    static cZ a;

    Y() {
    }

    public int a(bF bF2, bF bF3, byte by2) {
        return bF2.c * 1435047135 < bF3.c * 1435047135 ? -1 : (bF2.c * 1435047135 == bF3.c * 1435047135 ? 0 : 1);
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    public int compare(Object object, Object object2) {
        return this.a((bF)object, (bF)object2, 53);
    }

    public static int a(int n2, int n3, int n4) {
        return (n4 &= 3) == 0 ? n3 : (n4 == 1 ? 7 - n2 : (n4 == 2 ? 7 - n3 : n2));
    }
}

