/*
 * Decompiled with CFR 0_118.
 */
public class cz
implements bS {
    static int a;
    public static cz b;
    public static cz c;
    public static cz d;
    public static cz e;
    public int f;
    int g;

    cz(int n2, int n3) {
        this.f = n2 * -14003787;
        this.g = n3 * -799590333;
    }

    @Override
    public int a(int n2) {
        return this.g * 100455531;
    }

    static void a(int n2, int n3) {
        if (n2 != -1 && bZ.a(n2)) {
            cZ[] arrcZ = cZ.e[n2];
            for (int i2 = 0; i2 < arrcZ.length; ++i2) {
                cZ cZ2 = arrcZ[i2];
                if (cZ2.aS == null) continue;
                dj dj2 = new dj();
                dj2.e = cZ2;
                dj2.a = cZ2.aS;
                bt.a(dj2, 2000000);
            }
        }
    }

    static {
        b = new cz(0, 0);
        c = new cz(2, 1);
        d = new cz(1, 2);
        e = new cz(3, 3);
    }
}

