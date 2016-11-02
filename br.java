/*
 * Decompiled with CFR 0_118.
 */
public class br {
    public static boolean a;

    public static void a(int n2) {
        if (n2 != -1 && cZ.a[n2]) {
            cZ.b.e(n2, -1803791194);
            if (cZ.e[n2] != null) {
                boolean bl2 = true;
                for (int i2 = 0; i2 < cZ.e[n2].length; ++i2) {
                    if (cZ.e[n2][i2] == null) continue;
                    if (cZ.e[n2][i2].s * -1878336627 != 2) {
                        cZ.e[n2][i2] = null;
                        continue;
                    }
                    bl2 = false;
                }
                if (bl2) {
                    cZ.e[n2] = null;
                }
                cZ.a[n2] = false;
            }
        }
    }

    br() {
        throw new Error();
    }
}

