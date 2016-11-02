/*
 * Decompiled with CFR 0_118.
 */
import java.util.HashMap;

public class aH {
    public static int a;
    static cX[] b;
    static int c;

    static final int a(int n2, int n3, byte by2) {
        if (n2 == -2) {
            return 12345678;
        }
        if (n2 == -1) {
            if (n3 < 2) {
                n3 = 2;
            } else if (n3 > 126) {
                n3 = 126;
            }
            return n3;
        }
        if ((n3 = n3 * (n2 & 127) / 128) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 65408) + n3;
    }

    static f a(int n2, byte by2) {
        f f2 = (f)d.n.a(n2);
        if (f2 != null) {
            return f2;
        }
        f2 = C.a(d.a, d.b, n2, false, 843654049);
        if (f2 != null) {
            d.n.a(f2, n2);
        }
        return f2;
    }

    static {
        new HashMap();
    }
}

