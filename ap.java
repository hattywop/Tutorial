/*
 * Decompiled with CFR 0_118.
 */
import java.util.Comparator;

final class ap
implements Comparator {
    boolean a;

    int a(bF bF2, bF bF3, int n2) {
        if (bF3.c * 1435047135 == bF2.c * 1435047135) {
            return 0;
        }
        if (this.a) {
            if (bH.J * 1425499025 == bF2.c * 1435047135) {
                return -1;
            }
            if (bH.J * 1425499025 == bF3.c * 1435047135) {
                return 1;
            }
        }
        return bF2.c * 1435047135 < bF3.c * 1435047135 ? -1 : 1;
    }

    @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    ap(boolean bl2) {
        this.a = bl2;
    }

    public int compare(Object object, Object object2) {
        return this.a((bF)object, (bF)object2, -1775411380);
    }
}

