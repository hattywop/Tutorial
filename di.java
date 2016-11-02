/*
 * Decompiled with CFR 0_118.
 */
import java.applet.Applet;

public class di
extends RuntimeException {
    static int a;
    public static String b;
    static Applet c;
    String d;
    Throwable e;

    static final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, byte by2) {
        if (!bZ.a(n2)) {
            if (by2 < 104) {
                // empty if block
            }
        } else {
            ao.a(cZ.e[n2], -1, n3, n4, n5, n6, n7, n8, -1);
        }
    }

    static Class a(String string, int n2) {
        return string.equals("B") ? Byte.TYPE : (string.equals("I") ? Integer.TYPE : (string.equals("S") ? Short.TYPE : (string.equals("J") ? Long.TYPE : (!string.equals("Z") ? (string.equals("F") ? Float.TYPE : (string.equals("D") ? Double.TYPE : (string.equals("C") ? Character.TYPE : (string.equals("void") ? Void.TYPE : Class.forName(string))))) : Boolean.TYPE))));
    }

    public static void a(boolean bl2, int n2) {
        if (aa.b != bl2) {
            aq.a();
            aa.b = bl2;
        }
    }

    di(Throwable throwable, String string) {
        this.d = string;
        this.e = throwable;
    }
}

