/*
 * Decompiled with CFR 0_118.
 */
public class e {
    static int[] a = new int[500];
    static int[] b = new int[500];
    static int[] c = new int[500];
    static int[] d = new int[500];
    g e = null;
    int f = -1;
    boolean g = false;
    int[] h;
    int[] i;
    int[] j;
    int[] k;

    e(byte[] arrby, g g2) {
        int n2;
        this.e = g2;
        cY cY2 = new cY(arrby);
        cY cY3 = new cY(arrby);
        cY2.h = -1687040350;
        int n3 = cY2.d();
        int n4 = -1;
        int n5 = 0;
        cY3.h = (cY2.h * 1736753585 + n3) * 1303963473;
        for (n2 = 0; n2 < n3; ++n2) {
            int n6;
            int n7 = cY2.d();
            if (n7 <= 0) continue;
            if (this.e.e[n2] != 0) {
                for (n6 = n2 - 1; n6 > n4; --n6) {
                    if (this.e.e[n6] != 0) continue;
                    e.a[n5] = n6;
                    e.b[n5] = 0;
                    e.c[n5] = 0;
                    e.d[n5] = 0;
                    ++n5;
                    break;
                }
            }
            e.a[n5] = n2;
            n6 = 0;
            if (this.e.e[n2] == 3) {
                n6 = 128;
            }
            e.b[n5] = (n7 & 1) != 0 ? cY3.p() : n6;
            e.c[n5] = (n7 & 2) != 0 ? cY3.p() : n6;
            e.d[n5] = (n7 & 4) != 0 ? cY3.p() : n6;
            n4 = n2;
            ++n5;
            if (this.e.e[n2] != 5) continue;
            this.g = true;
        }
        if (cY3.h * 1736753585 != arrby.length) {
            throw new RuntimeException();
        }
        this.f = n5;
        this.h = new int[n5];
        this.i = new int[n5];
        this.j = new int[n5];
        this.k = new int[n5];
        for (n2 = 0; n2 < n5; ++n2) {
            this.h[n2] = a[n2];
            this.i[n2] = b[n2];
            this.j[n2] = c[n2];
            this.k[n2] = d[n2];
        }
    }
}

