/*
 * Decompiled with CFR 0_118.
 */
import java.io.IOException;

public class aK {
    int[] a;
    bz b;
    public static dl c;
    String[] d;
    int e = 154706627;

    static final void a(boolean bl2, int n2) {
        cL.a();
        if ((bH.aL -= 1630754957) * 1616238011 >= 50 || bl2) {
            bH.aL = 0;
            if (!bH.aQ && bH.fd != null) {
                bH.aF.a(25);
                try {
                    bH.fd.b(bH.aF.g, 0, bH.aF.h * 1736753585);
                    bH.aF.h = 0;
                }
                catch (IOException var2_2) {
                    bH.aQ = true;
                }
            }
        }
    }

    static void a(int n2, int n3, short s2) {
        bH.aF.a(124);
        bH.aF.i(n2);
        bH.aF.q(n3);
    }

    public static cZ b(int n2, int n3, short s2) {
        cZ cZ2 = aK.a(n2);
        return n3 == -1 ? cZ2 : (cZ2 != null && cZ2.p != null && n3 < cZ2.p.length ? cZ2.p[n3] : null);
    }

    public static cZ a(int n2) {
        boolean bl2;
        int n3 = n2 >> 16;
        int n4 = n2 & 65535;
        if (!(cZ.e[n3] != null && cZ.e[n3][n4] != null || (bl2 = bZ.a(n3)))) {
            return null;
        }
        return cZ.e[n3][n4];
    }
}

