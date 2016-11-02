/*
 * Decompiled with CFR 0_118.
 */
import java.io.File;
import java.io.IOException;

public class bs {
    static int a;
    public String b;
    public static bs c;
    public static bs d;
    public static bs e;
    public static bs f;
    public static bs g;
    public static bs h;
    public static bs i;
    public static bs j;
    public static bs k;
    public static bs l;
    public static bs m;
    public static bs n;
    public static bs o;
    public static bs p;
    public static bs q;

    public static void a(File file, File file2) {
        try {
            o o2 = new o(bl.a, "rw", 10000);
            cY cY2 = new cY(500);
            cY2.d(3);
            cY2.d(file2 != null ? 1 : 0);
            cY2.a((CharSequence)file.getPath());
            if (file2 != null) {
                cY2.a((CharSequence)file2.getPath());
            }
            o2.b(cY2.g, 0, cY2.h * 1736753585);
            o2.a();
        }
        catch (IOException var2_3) {
            var2_3.printStackTrace();
        }
    }

    bs(String string, String string2) {
        this.b = string2;
    }

    static {
        c = new bs("13", "13");
        d = new bs("9", "9");
        e = new bs("15", "15");
        f = new bs("4", "4");
        g = new bs("8", "8");
        h = new bs("10", "10");
        i = new bs("2", "2");
        j = new bs("12", "12");
        k = new bs("14", "14");
        l = new bs("7", "7");
        m = new bs("11", "11");
        n = new bs("3", "3");
        o = new bs("5", "5");
        p = new bs("1", "1");
        q = new bs("6", "6");
    }
}

