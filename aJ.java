/*
 * Decompiled with CFR 0_118.
 */
public class aJ {
    int a;
    int b;
    String c;
    int d;
    int e;
    public static int f;

    public static void a(a a2) {
        dz.c = a2;
    }

    public static void a() {
        aq.m.a();
    }

    static void a(cZ cZ2, int n2, int n3, boolean bl2) {
        int n4 = cZ2.bx * 2096072399;
        int n5 = cZ2.by * 539675235;
        if (cZ2.at * -865812299 == 0) {
            cZ2.bx = cZ2.x * -311266815;
        } else if (cZ2.at * -865812299 == 1) {
            cZ2.bx = (n2 - cZ2.x * -769280817) * -517619665;
        } else if (cZ2.at * -865812299 == 2) {
            cZ2.bx = (cZ2.x * -769280817 * n2 >> 14) * -517619665;
        }
        if (cZ2.au * -39629627 == 0) {
            cZ2.by = cZ2.y * -71498513;
        } else if (cZ2.au * -39629627 == 1) {
            cZ2.by = (n3 - cZ2.y * 791903853) * -189135029;
        } else if (cZ2.au * -39629627 == 2) {
            cZ2.by = (n3 * cZ2.y * 791903853 >> 14) * -189135029;
        }
        if (cZ2.at * -865812299 == 4) {
            cZ2.bx = cZ2.bz * -292993385 * cZ2.by * 539675235 / (cZ2.bA * 2112087779) * -517619665;
        }
        if (cZ2.au * -39629627 == 4) {
            cZ2.by = cZ2.bx * 2096072399 * cZ2.bA * 2112087779 / (cZ2.bz * -292993385) * -189135029;
        }
        if (bH.db && cZ2.s * -1878336627 == 0) {
            if (cZ2.by * 539675235 < 5 && cZ2.bx * 2096072399 < 5) {
                cZ2.by = -945675145;
                cZ2.bx = 1706868971;
            } else {
                if (cZ2.by * 539675235 <= 0) {
                    cZ2.by = -945675145;
                }
                if (cZ2.bx * 2096072399 <= 0) {
                    cZ2.bx = 1706868971;
                }
            }
        }
        if (cZ2.u * -202095703 == 1337) {
            bH.dd = cZ2;
        }
        if (bl2 && cZ2.m != null && (n4 != cZ2.bx * 2096072399 || n5 != cZ2.by * 539675235)) {
            dj dj2 = new dj();
            dj2.e = cZ2;
            dj2.a = cZ2.m;
            bH.dF.a(dj2);
        }
    }

    static final void a(int n2, int n3) {
        if (bZ.a(n2)) {
            bc.a(cZ.e[n2], n3);
        }
    }
}

