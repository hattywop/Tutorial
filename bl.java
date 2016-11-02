/*
 * Decompiled with CFR 0_118.
 */
import java.io.File;

public class bl {
    public static File a;
    static char[] b;

    static void a(int n2, int n3, int n4, boolean bl2, int n5, boolean bl3) {
        if (n2 < n3) {
            int n6 = (n3 + n2) / 2;
            int n7 = n2;
            dC dC2 = aE.a[n6];
            aE.a[n6] = aE.a[n3];
            aE.a[n3] = dC2;
            for (int i2 = n2; i2 < n3; ++i2) {
                int n8;
                dC dC3 = aE.a[i2];
                int n9 = cO.a(dC3, dC2, n4, bl2, 1726054500);
                if (n9 != 0) {
                    n8 = bl2 ? - n9 : n9;
                } else if (n5 == -1) {
                    n8 = 0;
                } else {
                    int n10 = cO.a(dC3, dC2, n5, bl3, 1320270287);
                    n8 = bl3 ? - n10 : n10;
                }
                if (n8 > 0) continue;
                dC dC4 = aE.a[i2];
                aE.a[i2] = aE.a[n7];
                aE.a[n7++] = dC4;
            }
            aE.a[n3] = aE.a[n7];
            aE.a[n7] = dC2;
            bl.a(n2, n7 - 1, n4, bl2, n5, bl3);
            bl.a(n7 + 1, n3, n4, bl2, n5, bl3);
        }
    }

    static {
        b = new char[]{'\u20ac', '\u0000', '\u201a', '\u0192', '\u201e', '\u2026', '\u2020', '\u2021', '\u02c6', '\u2030', '\u0160', '\u2039', '\u0152', '\u0000', '\u017d', '\u0000', '\u0000', '\u2018', '\u2019', '\u201c', '\u201d', '\u2022', '\u2013', '\u2014', '\u02dc', '\u2122', '\u0161', '\u203a', '\u0153', '\u0000', '\u017e', '\u0178'};
    }
}

