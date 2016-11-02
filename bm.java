/*
 * Decompiled with CFR 0_118.
 */
public class bm {
    static char[] a;
    static char[] b;
    static int[] c;

    static {
        int n2;
        a = new char[64];
        for (n2 = 0; n2 < 26; ++n2) {
            bm.a[n2] = (char)(n2 + 65);
        }
        for (n2 = 26; n2 < 52; ++n2) {
            bm.a[n2] = (char)(n2 + 97 - 26);
        }
        for (n2 = 52; n2 < 62; ++n2) {
            bm.a[n2] = (char)(48 + n2 - 52);
        }
        bm.a[62] = 43;
        bm.a[63] = 47;
        b = new char[64];
        for (n2 = 0; n2 < 26; ++n2) {
            bm.b[n2] = (char)(65 + n2);
        }
        for (n2 = 26; n2 < 52; ++n2) {
            bm.b[n2] = (char)(n2 + 97 - 26);
        }
        for (n2 = 52; n2 < 62; ++n2) {
            bm.b[n2] = (char)(n2 + 48 - 52);
        }
        bm.b[62] = 42;
        bm.b[63] = 45;
        c = new int[128];
        for (n2 = 0; n2 < c.length; ++n2) {
            bm.c[n2] = -1;
        }
        for (n2 = 65; n2 <= 90; ++n2) {
            bm.c[n2] = n2 - 65;
        }
        for (n2 = 97; n2 <= 122; ++n2) {
            bm.c[n2] = n2 - 97 + 26;
        }
        for (n2 = 48; n2 <= 57; ++n2) {
            bm.c[n2] = 52 + (n2 - 48);
        }
        int[] arrn = c;
        bm.c[43] = 62;
        arrn[42] = 62;
        int[] arrn2 = c;
        bm.c[47] = 63;
        arrn2[45] = 63;
    }
}

