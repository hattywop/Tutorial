/*
 * Decompiled with CFR 0_118.
 */
import java.util.Map;

public class r
extends z {
    int a;
    int b;
    int c;
    String d;
    String e;
    String f;

    void a(int n2, String string, String string2, String string3, int n3) {
        int n4 = (bH.fs += 945207589) * 2036382381 - 1;
        this.a = n4 * -696217951;
        this.b = bH.S * -298467899;
        this.c = n2 * -520272377;
        this.d = string;
        this.e = string2;
        this.f = string3;
    }

    static final int a(int n2, int n3, int n4, int n5) {
        int n6 = 256 - n4;
        return ((n2 & 16711935) * n6 + (n3 & 16711935) * n4 & -16711936) + (n6 * (n2 & 65280) + n4 * (n3 & 65280) & 16711680) >> 8;
    }

    r(int n2, String string, String string2, String string3) {
        int n3 = (bH.fs += 945207589) * 2036382381 - 1;
        this.a = n3 * -696217951;
        this.b = bH.S * -298467899;
        this.c = n2 * -520272377;
        this.d = string;
        this.e = string2;
        this.f = string3;
    }

    static void a(int n2) {
        bH.fp.clear();
        bH.fq.a();
        bH.fr.a();
        bH.fs = 0;
    }

    static final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, byte by2) {
        if (n4 >= 1 && n5 >= 1 && n4 <= 102 && n5 <= 102) {
            int n9;
            if (bH.ae && n2 != u.d * -1093536619) {
                return;
            }
            int n10 = 0;
            boolean bl2 = true;
            boolean bl3 = false;
            boolean bl4 = false;
            if (n3 == 0) {
                n10 = cr.m.r(n2, n4, n5);
            }
            if (n3 == 1) {
                n10 = cr.m.g(n2, n4, n5);
            }
            if (n3 == 2) {
                n10 = cr.m.h(n2, n4, n5);
            }
            if (n3 == 3) {
                n10 = cr.m.i(n2, n4, n5);
            }
            if (n10 != 0) {
                cI cI2;
                n9 = cr.m.b(n2, n4, n5, n10);
                int n11 = n10 >> 14 & 32767;
                int n12 = n9 & 31;
                int n13 = n9 >> 6 & 3;
                if (n3 == 0) {
                    cr.m.a(n2, n4, n5);
                    cI2 = cI.a(n11);
                    if (cI2.h * 445231797 != 0) {
                        bH.aU[n2].a(n4, n5, n12, n13, cI2.i, 76);
                    }
                }
                if (n3 == 1) {
                    cr.m.b(n2, n4, n5);
                }
                if (n3 == 2) {
                    cr.m.o(n2, n4, n5);
                    cI2 = cI.a(n11);
                    if (cI2.f * 1832905927 + n4 > 103 || cI2.f * 1832905927 + n5 > 103 || cI2.g * 1221908201 + n4 > 103 || cI2.g * 1221908201 + n5 > 103) {
                        return;
                    }
                    if (cI2.h * 445231797 != 0) {
                        bH.aU[n2].a(n4, n5, cI2.f * 1832905927, cI2.g * 1221908201, n13, cI2.i, -20620);
                    }
                }
                if (n3 == 3) {
                    cr.m.c(n2, n4, n5);
                    cI2 = cI.a(n11);
                    if (cI2.h * 445231797 == 1) {
                        bH.aU[n2].c(n4, n5, -1367809230);
                    }
                }
            }
            if (n6 >= 0) {
                n9 = n2;
                if (n2 < 3 && (ax.i[1][n4][n5] & 2) == 2) {
                    n9 = n2 + 1;
                }
                h.a(n2, n9, n4, n5, n6, n7, n8, cr.m, bH.aU[n2], -55);
            }
        }
    }
}

