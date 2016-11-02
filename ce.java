/*
 * Decompiled with CFR 0_118.
 */
public class ce
extends cF {
    int a;
    int b;
    static int c;
    boolean d = false;

    static final void a(byte[] arrby, int n2, int n3, aD aD2, df[] arrdf) {
        cY cY2 = new cY(arrby);
        int n4 = -1;
        int n5;
        block0 : while ((n5 = cY2.q()) != 0) {
            n4 += n5;
            int n6 = 0;
            do {
                int n7;
                if ((n7 = cY2.q()) == 0) continue block0;
                int n8 = (n6 += n7 - 1) & 63;
                int n9 = n6 >> 6 & 63;
                int n10 = n6 >> 12;
                int n11 = cY2.d();
                int n12 = n11 >> 2;
                int n13 = n11 & 3;
                int n14 = n9 + n2;
                int n15 = n8 + n3;
                if (n14 <= 0 || n15 <= 0 || n14 >= 103 || n15 >= 103) continue;
                int n16 = bw.c * -1719983039 + n14;
                int n17 = c * 803568843 + n15;
                if (n16 == 3092 && n17 == 3507 && n10 == 0 || n16 == 3092 && n17 == 3506 && n10 == 0 || n16 == 3093 && n17 == 3506 && n10 == 0 || n16 == 3092 && n17 == 3514 && n10 == 0 || n16 == 3093 && n17 == 3514 && n10 == 0 || n16 == 3092 && n17 == 3513 && n10 == 0) continue;
                int n18 = n10;
                if ((ax.i[1][n14][n15] & 2) == 2) {
                    n18 = n10 - 1;
                }
                df df2 = null;
                if (n18 >= 0) {
                    df2 = arrdf[n18];
                }
                c.a(n10, n14, n15, n4, n13, n12, aD2, df2);
            } while (true);
            break;
        }
        return;
    }
}

