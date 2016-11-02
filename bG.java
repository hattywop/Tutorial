/*
 * Decompiled with CFR 0_118.
 */
import java.util.zip.Inflater;

public class bG {
    protected static String a;
    Inflater b;
    public static int[] c;

    public void a(cY cY2, byte[] arrby) {
        if (cY2.g[cY2.h * 1736753585] == 31 && cY2.g[1 + cY2.h * 1736753585] == -117) {
            if (this.b == null) {
                this.b = new Inflater(true);
            }
            try {
                this.b.setInput(cY2.g, 10 + cY2.h * 1736753585, cY2.g.length - (18 + cY2.h * 1736753585));
                this.b.inflate(arrby);
            }
            catch (Exception var3_3) {
                this.b.reset();
                throw new RuntimeException("");
            }
        } else {
            throw new RuntimeException("");
        }
        this.b.reset();
    }

    static int a(int n2, int n3) {
        bZ bZ2 = (bZ)bZ.e.a(n2);
        return bZ2 == null ? -1 : (n3 >= 0 && n3 < bZ2.a.length ? bZ2.a[n3] : -1);
    }

    static void a(dC dC2) {
        if (dC2.a() != bH.N) {
            bH.N = dC2.a();
            di.a(dC2.a(), -1540505320);
        }
        C.a = dC2.a;
        bH.J = dC2.c * 1557733403;
        bH.H = dC2.d * -1893770233;
        c.e = 1098229281 * (bH.I * -134799277 == 0 ? Loader.b : dC2.c * 1685233739 + 40000);
        bT.b = -417358633 * (bH.I * -134799277 == 0 ? 443 : dC2.c * 1685233739 + 50000);
        dC.i = c.e * 471081033;
    }

    static {
        c = new int[]{6944, 7409, 4483, 11744, 11748, 24101, 24347, 25808, 26707, 27249, 27251, 27264, 27253, 27291, 18491, 21301, 10058, 6943, 27718, 27719, 27720, 27721, 7478, 10060, 14886, 10562, 28861};
    }
}

