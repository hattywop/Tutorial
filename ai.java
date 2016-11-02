/*
 * Decompiled with CFR 0_118.
 */
public class ai {
    int a = ci.a(16);
    int b = ci.a(24);
    int c = ci.a(24);
    int d = ci.a(24) + 1;
    int e = ci.a(6) + 1;
    int f = ci.a(8);
    int[] g;

    ai() {
        int n2;
        int[] arrn = new int[this.e];
        for (n2 = 0; n2 < this.e; ++n2) {
            boolean bl2;
            int n3 = 0;
            int n4 = ci.a(3);
            boolean bl3 = bl2 = ci.a() != 0;
            if (bl2) {
                n3 = ci.a(5);
            }
            arrn[n2] = n3 << 3 | n4;
        }
        this.g = new int[this.e * 8];
        for (n2 = 0; n2 < this.e * 8; ++n2) {
            this.g[n2] = (arrn[n2 >> 3] & 1 << (n2 & 7)) != 0 ? ci.a(8) : -1;
        }
    }

    void a(float[] arrf, int n2, boolean bl2) {
        int n3;
        for (n3 = 0; n3 < n2; ++n3) {
            arrf[n3] = 0.0f;
        }
        if (!bl2) {
            n3 = ci.l[this.f].a;
            int n4 = this.c - this.b;
            int n5 = n4 / this.d;
            int[] arrn = new int[n5];
            for (int i2 = 0; i2 < 8; ++i2) {
                int n6 = 0;
                block2 : while (n6 < n5) {
                    int n8;
                    int n7;
                    if (i2 == 0) {
                        n8 = ci.l[this.f].b();
                        for (n7 = n3 - 1; n7 >= 0; --n7) {
                            if (n6 + n7 < n5) {
                                arrn[n6 + n7] = n8 % this.e;
                            }
                            n8 /= this.e;
                        }
                    }
                    for (n8 = 0; n8 < n3; ++n8) {
                        n7 = arrn[n6];
                        int n9 = this.g[n7 * 8 + i2];
                        if (n9 >= 0) {
                            int n10;
                            reference var17_18;
                            int n11 = this.b + n6 * this.d;
                            bk bk2 = ci.l[n9];
                            if (this.a == 0) {
                                n10 = this.d / bk2.a;
                                for (int i3 = 0; i3 < n10; ++i3) {
                                    var17_18 = (reference)bk2.a();
                                    for (int i4 = 0; i4 < bk2.a; ++i4) {
                                        float[] arrf2 = arrf;
                                        int n12 = n11 + i3 + i4 * n10;
                                        arrf2[n12] = arrf2[n12] + var17_18[i4];
                                    }
                                }
                            } else {
                                n10 = 0;
                                while (n10 < this.d) {
                                    float[] arrf3 = bk2.a();
                                    for (var17_18 = 0; var17_18 < bk2.a; ++var17_18) {
                                        float[] arrf4 = arrf;
                                        int n13 = n11 + n10;
                                        arrf4[n13] = arrf4[n13] + arrf3[var17_18];
                                        ++n10;
                                    }
                                }
                            }
                        }
                        if (++n6 >= n5) continue block2;
                    }
                }
            }
        }
    }
}

