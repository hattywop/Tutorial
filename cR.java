/*
 * Decompiled with CFR 0_118.
 */
public class cR {
    int[] a;
    int[] b;
    public boolean c;
    int d;
    long e;
    static int[] f = new int[]{8, 11, 4, 6, 9, 7, 10};
    long g;

    public int a(int n2) {
        return this.d * 942739005 == -1 ? (this.a[8] << 10) + (this.a[0] << 15) + (this.b[0] << 25) + (this.b[4] << 20) + (this.a[11] << 5) + this.a[1] : 305419896 + cH.a((int)(this.d * 942739005)).b * 1380254665;
    }

    public void a(int[] arrn, int[] arrn2, boolean bl2, int n2) {
        if (arrn == null) {
            arrn = new int[12];
            block0 : for (int i2 = 0; i2 < 7; ++i2) {
                for (int i3 = 0; i3 < bT.c * -1534763975; ++i3) {
                    bT bT2 = bH.a(i3, -1899122064);
                    if (bT2 == null || bT2.g || bT2.e * -1568050933 != i2 + (bl2 ? 7 : 0)) continue;
                    arrn[cR.f[i2]] = 256 + i3;
                    continue block0;
                }
            }
        }
        this.a = arrn;
        this.b = arrn2;
        this.c = bl2;
        this.d = n2 * 271284501;
        this.a();
    }

    public void a(int n2, boolean bl2) {
        int n3;
        if (!(n2 == 1 && this.c || (n3 = this.a[f[n2]]) == 0)) {
            bT bT2;
            n3 -= 256;
            do {
                if (!bl2) {
                    if (--n3 >= 0) continue;
                    n3 = bT.c * -1534763975 - 1;
                    continue;
                }
                if (++n3 < bT.c * -1534763975) continue;
                n3 = 0;
            } while ((bT2 = bH.a(n3, -1899122064)) == null || bT2.g || bT2.e * -1568050933 != (this.c ? 7 : 0) + n2);
            this.a[cR.f[n2]] = n3 + 256;
            this.a();
        }
    }

    public void b(int n2, boolean bl2) {
        int n3 = this.b[n2];
        if (!bl2) {
            do {
                if (--n3 >= 0) continue;
                n3 = by.f[n2].length - 1;
            } while (!bf.a(n2, n3, 367839608));
        } else {
            do {
                if (++n3 < by.f[n2].length) continue;
                n3 = 0;
            } while (!bf.a(n2, n3, 367839608));
        }
        this.b[n2] = n3;
        this.a();
    }

    public void a(boolean bl2) {
        if (this.c != bl2) {
            this.a(null, this.b, bl2, -1);
        }
    }

    public void a(cY cY2) {
        int n2;
        cY2.d(this.c ? 1 : 0);
        for (n2 = 0; n2 < 7; ++n2) {
            int n3 = this.a[f[n2]];
            if (n3 == 0) {
                cY2.d(-1);
                continue;
            }
            cY2.d(n3 - 256);
        }
        for (n2 = 0; n2 < 5; ++n2) {
            cY2.d(this.b[n2]);
        }
    }

    void a() {
        int n2;
        int n3;
        long l2 = this.e * -3008304834187156363L;
        int n4 = this.a[5];
        this.a[5] = n2 = this.a[9];
        this.a[9] = n4;
        this.e = 0;
        for (n3 = 0; n3 < 12; ++n3) {
            this.e = (this.e * -3008304834187156363L << 4) * 5855792400499903453L;
            if (this.a[n3] < 256) continue;
            this.e += 5855792400499903453L * (long)(this.a[n3] - 256);
        }
        if (this.a[0] >= 256) {
            this.e += (long)(this.a[0] - 256 >> 4) * 5855792400499903453L;
        }
        if (this.a[1] >= 256) {
            this.e += (long)(this.a[1] - 256 >> 8) * 5855792400499903453L;
        }
        for (n3 = 0; n3 < 5; ++n3) {
            this.e = (this.e * -3008304834187156363L << 3) * 5855792400499903453L;
            this.e += 5855792400499903453L * (long)this.b[n3];
        }
        this.e = 5855792400499903453L * (-3008304834187156363L * this.e << 1);
        this.e += (long)this.c ? 1 : 0 * 5855792400499903453L;
        this.a[5] = n4;
        this.a[9] = n2;
        if (l2 != 0 && l2 != -3008304834187156363L * this.e) {
            bH.s.b(l2);
        }
    }

    da b() {
        int n2;
        int n3;
        if (this.d * 942739005 != -1) {
            return cH.a(this.d * 942739005).a(-85);
        }
        boolean bl2 = false;
        for (int i2 = 0; i2 < 12; ++i2) {
            n3 = this.a[i2];
            if (n3 >= 256 && n3 < 512 && !bH.a(n3 - 256, -1899122064).c()) {
                bl2 = true;
            }
            if (n3 < 512 || bH.j(n3 - 512).a(this.c)) continue;
            bl2 = true;
        }
        if (bl2) {
            return null;
        }
        da[] arrda = new da[12];
        n3 = 0;
        for (int i3 = 0; i3 < 12; ++i3) {
            da da2;
            n2 = this.a[i3];
            if (n2 >= 256 && n2 < 512 && (da2 = bH.a(n2 - 256, -1899122064).d()) != null) {
                arrda[n3++] = da2;
            }
            if (n2 < 512 || (da2 = bH.j(n2 - 512).c(this.c)) == null) continue;
            arrda[n3++] = da2;
        }
        da da3 = new da(arrda, n3);
        for (n2 = 0; n2 < 5; ++n2) {
            if (this.b[n2] < by.f[n2].length) {
                da3.a(by.e[n2], by.f[n2][this.b[n2]]);
            }
            if (this.b[n2] >= by.g[n2].length) continue;
            da3.a(by.h[n2], by.g[n2][this.b[n2]]);
        }
        return da3;
    }

    public cB a(d d2, int n2, d d3, int n3, int n4) {
        cB cB2;
        if (this.d * 942739005 != -1) {
            return cH.a(this.d * 942739005).a(d2, n2, d3, n3, 290126029);
        }
        long l2 = -3008304834187156363L * this.e;
        int[] arrn = this.a;
        if (d2 != null && (d2.i * 1369697391 >= 0 || d2.j * 241398875 >= 0)) {
            arrn = new int[12];
            for (int i2 = 0; i2 < 12; ++i2) {
                arrn[i2] = this.a[i2];
            }
            if (d2.i * 1369697391 >= 0) {
                l2 += (long)(d2.i * 1369697391 - this.a[5] << 40);
                arrn[5] = d2.i * 1369697391;
            }
            if (d2.j * 241398875 >= 0) {
                l2 += (long)(d2.j * 241398875 - this.a[3] << 48);
                arrn[3] = d2.j * 241398875;
            }
        }
        if ((cB2 = (cB)bH.s.a(l2)) == null) {
            int n5;
            boolean bl2 = false;
            for (int i3 = 0; i3 < 12; ++i3) {
                n5 = arrn[i3];
                if (n5 >= 256 && n5 < 512 && !bH.a(n5 - 256, -1899122064).e()) {
                    bl2 = true;
                }
                if (n5 < 512 || bH.j(n5 - 512).d(this.c)) continue;
                bl2 = true;
            }
            if (bl2) {
                if (3821891208152933781L * this.g != -1) {
                    cB2 = (cB)bH.s.a(3821891208152933781L * this.g);
                }
                if (cB2 == null) {
                    return null;
                }
            }
            if (cB2 == null) {
                int n6;
                da[] arrda = new da[12];
                n5 = 0;
                for (int i4 = 0; i4 < 12; ++i4) {
                    da da2;
                    n6 = arrn[i4];
                    if (n6 >= 256 && n6 < 512 && (da2 = bH.a(n6 - 256, -1899122064).a()) != null) {
                        arrda[n5++] = da2;
                    }
                    if (n6 < 512 || (da2 = bH.j(n6 - 512).b(this.c)) == null) continue;
                    arrda[n5++] = da2;
                }
                da da3 = new da(arrda, n5);
                for (n6 = 0; n6 < 5; ++n6) {
                    if (this.b[n6] < by.f[n6].length) {
                        da3.a(by.e[n6], by.f[n6][this.b[n6]]);
                    }
                    if (this.b[n6] >= by.g[n6].length) continue;
                    da3.a(by.h[n6], by.g[n6][this.b[n6]]);
                }
                cB2 = da3.a(64, 850, -30, -50, -30);
                bH.s.a(cB2, l2);
                this.g = l2 * 186498087929658813L;
            }
        }
        if (d2 == null && d3 == null) {
            return cB2;
        }
        cB cB3 = d2 != null && d3 != null ? d2.a(cB2, n2, d3, n3, 226287739) : (d2 != null ? d2.b(cB2, n2, 244288509) : d3.b(cB2, n3, 1939180479));
        return cB3;
    }
}

