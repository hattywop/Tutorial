/*
 * Decompiled with CFR 0_118.
 */
public class x
extends z {
    static aW a;
    public int b;
    public int c;
    public int[] d;
    public int[] e;
    int f;

    x(int n2, int n3, int[] arrn, int[] arrn2, int n4) {
        this.b = n2 * -92682441;
        this.c = n3 * -1917268247;
        this.d = arrn;
        this.e = arrn2;
        this.f = n4 * 808490715;
    }

    public boolean a(int n2, int n3, int n4) {
        int n5;
        if (n3 >= 0 && n3 < this.e.length && n2 >= (n5 = this.e[n3]) && n2 <= this.d[n3] + n5) {
            return true;
        }
        return false;
    }
}

