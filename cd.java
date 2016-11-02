/*
 * Decompiled with CFR 0_118.
 */
public final class cd
extends cF {
    int a;
    ak b;
    aq c;
    int d;
    aC e;
    aj f;
    cd g;
    int h;
    boolean i;
    al j;
    boolean k;
    int l;
    int m;
    as n;
    int o;
    boolean p;
    ay[] q = new ay[5];
    int[] r = new int[5];
    int s = 0;
    int t;
    int u;
    int v;
    int w;

    cd(int n2, int n3, int n4) {
        this.t = n2 * -2030123745;
        this.u = this.t * -1528628183;
        this.v = n3 * -1101018753;
        this.w = n4 * 940856295;
    }

    public static int a(int n2, int n3) {
        --n2;
        n2 |= n2 >>> 1;
        n2 |= n2 >>> 2;
        n2 |= n2 >>> 4;
        n2 |= n2 >>> 8;
        n2 |= n2 >>> 16;
        return n2 + 1;
    }
}

