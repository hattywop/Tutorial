/*
 * Decompiled with CFR 0_118.
 */
public abstract class dh
extends z {
    public int aN = 878907848;

    void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        cB cB2 = this.a(1560023972);
        if (cB2 != null) {
            this.aN = cB2.aN * 1;
            cB2.a(n2, n3, n4, n5, n6, n7, n8, n9, n10);
        }
    }

    static final void a(int n2, int n3, int n4, int n5, byte by2) {
        for (int i2 = 0; i2 < bH.dJ * -2099955589; ++i2) {
            if (bH.dO[i2] + bH.dQ[i2] <= n2 || bH.dO[i2] >= n4 + n2 || bH.dP[i2] + bH.dR[i2] <= n3 || bH.dP[i2] >= n5 + n3) continue;
            bH.dM[i2] = true;
        }
    }

    protected cB a(int n2) {
        return null;
    }

    static final String a(int n2, byte by2) {
        String string = Integer.toString(n2);
        for (int i2 = string.length() - 3; i2 > 0; i2 -= 3) {
            string = string.substring(0, i2) + aB.c + string.substring(i2);
        }
        return string.length() > 9 ? " " + am.a(65408) + string.substring(0, string.length() - 8) + du.cf + " " + aB.e + string + aB.f + aB.i : (string.length() <= 6 ? " " + am.a(16776960) + string + aB.i : " " + am.a(16777215) + string.substring(0, string.length() - 4) + du.cg + " " + aB.e + string + aB.f + aB.i);
    }
}

