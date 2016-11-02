/*
 * Decompiled with CFR 0_118.
 */
import java.io.File;

public class dC {
    String a;
    int b;
    int c;
    int d;
    static int[] e;
    String f;
    int g;
    int h;
    static int i;
    static int j;
    static int k;
    static int[] l;
    static int[] m;

    boolean a() {
        return (1 & this.d * 438674181) != 0;
    }

    boolean b() {
        return (536870912 & this.d * 438674181) != 0;
    }

    boolean c() {
        return (33554432 & this.d * 438674181) != 0;
    }

    boolean d() {
        return (2 & this.d * 438674181) != 0;
    }

    boolean e() {
        return (4 & this.d * 438674181) != 0;
    }

    static void a(String[] arrstring, short[] arrs, int n2, int n3) {
        if (n2 < n3) {
            int n4 = (n3 + n2) / 2;
            int n5 = n2;
            String string = arrstring[n4];
            arrstring[n4] = arrstring[n3];
            arrstring[n3] = string;
            short s2 = arrs[n4];
            arrs[n4] = arrs[n3];
            arrs[n3] = s2;
            for (int i2 = n2; i2 < n3; ++i2) {
                if (string != null && (arrstring[i2] == null || arrstring[i2].compareTo(string) >= (i2 & 1))) continue;
                String string2 = arrstring[i2];
                arrstring[i2] = arrstring[n5];
                arrstring[n5] = string2;
                short s3 = arrs[i2];
                arrs[i2] = arrs[n5];
                arrs[n5++] = s3;
            }
            arrstring[n3] = arrstring[n5];
            arrstring[n5] = string;
            arrs[n3] = arrs[n5];
            arrs[n5] = s2;
            dC.a(arrstring, arrs, n2, n5 - 1);
            dC.a(arrstring, arrs, n5 + 1, n3);
        }
    }

    public static void a(File file) {
        aR.b = file;
        if (!aR.b.exists()) {
            throw new RuntimeException("");
        }
        aR.d = true;
    }

    boolean f() {
        return (8 & this.d * 438674181) != 0;
    }

    static final void g() {
        aD.c = false;
        bH.ae = false;
    }

    static {
        j = 0;
        k = 0;
        l = new int[]{1, 1, 1, 1};
        m = new int[]{0, 1, 2, 3};
    }
}

