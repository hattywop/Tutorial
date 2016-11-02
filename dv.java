/*
 * Decompiled with CFR 0_118.
 */
public class dv
extends cF {
    int[] a;
    boolean b = false;
    int c;
    boolean d;
    int[] e;
    int[] f;
    int[] g;
    int[] h;
    int i;
    int j;
    static int[] k;

    boolean a(double d2, int n2, a a2) {
        int n3;
        for (n3 = 0; n3 < this.e.length; ++n3) {
            if (a2.a(this.e[n3], -116) != null) continue;
            return false;
        }
        n3 = n2 * n2;
        this.a = new int[n3];
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            boolean bl2;
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = this.e[i2];
            byte[] arrby = a2.f(n8, 1325486518);
            if (arrby == null) {
                bl2 = false;
            } else {
                cU.b(arrby, -1850242590);
                bl2 = true;
            }
            cN cN2 = !bl2 ? null : av.b(1975377584);
            cN2.a();
            arrby = cN2.d;
            int[] arrn = cN2.c;
            int n9 = this.h[i2];
            if ((n9 & -16777216) == 16777216) {
                // empty if block
            }
            if ((n9 & -16777216) == 33554432) {
                // empty if block
            }
            if ((n9 & -16777216) == 50331648) {
                n4 = n9 & 16711935;
                n6 = n9 >> 8 & 255;
                for (n5 = 0; n5 < arrn.length; ++n5) {
                    n7 = arrn[n5];
                    if ((n7 & 65535) != n7 >> 8) continue;
                    arrn[n5] = n4 * n7 >> 8 & 16711935 | n6 * (n7 &= 255) & 65280;
                }
            }
            for (n4 = 0; n4 < arrn.length; ++n4) {
                arrn[n4] = de.a(arrn[n4], d2);
            }
            n4 = i2 == 0 ? 0 : this.f[i2 - 1];
            if (i2 == 0) {
                // empty if block
            }
            if (n4 == 0) {
                if (cN2.e == n2) {
                    for (n6 = 0; n6 < n3; ++n6) {
                        this.a[n6] = arrn[arrby[n6] & 255];
                    }
                } else if (cN2.e == 64 && n2 == 128) {
                    n6 = 0;
                    for (n5 = 0; n5 < n2; ++n5) {
                        for (n7 = 0; n7 < n2; ++n7) {
                            this.a[n6++] = arrn[arrby[(n7 >> 1) + (n5 >> 1 << 6)] & 255];
                        }
                    }
                } else {
                    if (cN2.e != 128 || n2 != 64) {
                        throw new RuntimeException();
                    }
                    n6 = 0;
                    for (n5 = 0; n5 < n2; ++n5) {
                        for (n7 = 0; n7 < n2; ++n7) {
                            this.a[n6++] = arrn[arrby[(n7 << 1) + (n5 << 1 << 7)] & 255];
                        }
                    }
                }
            }
            if (n4 == 1) {
                // empty if block
            }
            if (n4 == 2) {
                // empty if block
            }
            if (n4 != 3) continue;
        }
        return true;
    }

    void a() {
        this.a = null;
    }

    dv(cY cY2) {
        this.c = cY2.f();
        this.d = cY2.d() == 1;
        int n2 = cY2.d();
        if (n2 >= 1 && n2 <= 4) {
            int n3;
            this.e = new int[n2];
            for (n3 = 0; n3 < n2; ++n3) {
                this.e[n3] = cY2.f();
            }
            if (n2 > 1) {
                this.f = new int[n2 - 1];
                for (n3 = 0; n3 < n2 - 1; ++n3) {
                    this.f[n3] = cY2.d();
                }
            }
            if (n2 > 1) {
                this.g = new int[n2 - 1];
                for (n3 = 0; n3 < n2 - 1; ++n3) {
                    this.g[n3] = cY2.d();
                }
            }
            this.h = new int[n2];
            for (n3 = 0; n3 < n2; ++n3) {
                this.h[n3] = cY2.i();
            }
        } else {
            throw new RuntimeException();
        }
        this.i = cY2.d();
        this.j = cY2.d();
        this.a = null;
    }

    void a(int n2) {
        if (this.a != null) {
            int n3;
            int n4;
            int[] arrn;
            int n5;
            int n6;
            int n7;
            int n8;
            if (this.i == 1 || this.i == 3) {
                if (k == null || k.length < this.a.length) {
                    k = new int[this.a.length];
                }
                n4 = this.a.length == 4096 ? 64 : 128;
                n6 = this.a.length;
                n7 = n4 * n2 * this.j;
                n5 = n6 - 1;
                if (this.i == 1) {
                    n7 = - n7;
                }
                for (n3 = 0; n3 < n6; ++n3) {
                    n8 = n3 + n7 & n5;
                    dv.k[n3] = this.a[n8];
                }
                arrn = this.a;
                this.a = k;
                k = arrn;
            }
            if (this.i == 2 || this.i == 4) {
                if (k == null || k.length < this.a.length) {
                    k = new int[this.a.length];
                }
                n4 = this.a.length == 4096 ? 64 : 128;
                n6 = this.a.length;
                n7 = n2 * this.j;
                n5 = n4 - 1;
                if (this.i == 2) {
                    n7 = - n7;
                }
                for (n3 = 0; n3 < n6; n3 += n4) {
                    for (n8 = 0; n8 < n4; ++n8) {
                        int n9 = n3 + n8;
                        int n10 = n3 + (n8 + n7 & n5);
                        dv.k[n9] = this.a[n10];
                    }
                }
                arrn = this.a;
                this.a = k;
                k = arrn;
            }
        }
    }
}

