/*
 * Decompiled with CFR 0_118.
 */
public class bV {
    int[] a;

    public int a(int n2) {
        int n3 = (this.a.length >> 1) - 1;
        int n4 = n2 & n3;
        int n5;
        while ((n5 = this.a[n4 + n4 + 1]) != -1) {
            if (this.a[n4 + n4] == n2) {
                return n5;
            }
            n4 = n4 + 1 & n3;
        }
        return -1;
    }

    public bV(int[] arrn) {
        int n2;
        int n3;
        for (n3 = 1; n3 <= arrn.length + (arrn.length >> 1); n3 <<= 1) {
        }
        this.a = new int[n3 + n3];
        for (n2 = 0; n2 < n3 + n3; ++n2) {
            this.a[n2] = -1;
        }
        n2 = 0;
        while (n2 < arrn.length) {
            int n4 = arrn[n2] & n3 - 1;
            while (this.a[n4 + n4 + 1] != -1) {
                n4 = n4 + 1 & n3 - 1;
            }
            this.a[n4 + n4] = arrn[n2];
            this.a[n4 + n4 + 1] = n2++;
        }
    }
}

