/*
 * Decompiled with CFR 0_118.
 */
public class dB
extends z {
    public static a a;
    static int b;
    static int[] c;
    public int d;
    public int e;
    public int f;
    static n g;

    void a(cY cY2) {
        int n2;
        while ((n2 = cY2.d()) != 0) {
            this.a(cY2, n2);
        }
        return;
    }

    static void a() {
        dg.d = null;
        dg.e = null;
        aP.b = null;
        bH.fn = null;
        c = null;
        cS.b = null;
    }

    void a(cY cY2, int n2) {
        if (n2 == 1) {
            this.d = cY2.f() * 321564611;
            this.e = cY2.d() * 1683949293;
            this.f = cY2.d() * 199447123;
        }
    }

    static final void a(int n2) {
        if (bZ.a(n2)) {
            cZ[] arrcZ = cZ.e[n2];
            for (int i2 = 0; i2 < arrcZ.length; ++i2) {
                cZ cZ2 = arrcZ[i2];
                if (cZ2 == null) continue;
                cZ2.bI = 0;
                cZ2.bJ = 0;
            }
        }
    }

    static {
        g = new n(64);
    }
}

