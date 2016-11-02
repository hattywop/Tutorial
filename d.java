/*
 * Decompiled with CFR 0_118.
 */
public class d
extends z {
    static a a;
    static a b;
    static a c;
    public int d = -962573011;
    public int e = 398814397;
    public int f = -71042647;
    public boolean g = false;
    public int h = 95448973;
    public int i = 2114784625;
    public int j = 1711498285;
    public int k = 1546644807;
    public int l = 1228877402;
    public static n m;
    public static n n;
    public int[] o;
    int[] p;
    public int[] q;
    int[] r;
    public int[] s;
    public int t;

    void a(cY cY2, byte by2) {
        int n2;
        while ((n2 = cY2.d()) != 0) {
            this.a(cY2, n2, -118);
        }
        return;
    }

    void a(int n2) {
        if (this.d * -1239714469 == -1) {
            this.d = this.p != null ? 1925146022 : 0;
        }
        if (this.e * 1962873195 == -1) {
            this.e = this.p != null ? -797628794 : 0;
        }
    }

    cB a(cB cB2, int n2, int n3, byte by2) {
        n2 = this.q[n2];
        f f2 = aH.a(n2 >> 16, 90);
        n2 &= 65535;
        if (f2 == null) {
            return cB2.a(true);
        }
        cB cB3 = cB2.a(!f2.a(n2));
        if ((n3 &= 3) == 1) {
            cB3.g();
        } else if (n3 == 2) {
            cB3.f();
        } else if (n3 == 3) {
            cB3.e();
        }
        cB3.a(f2, n2);
        if (n3 == 1) {
            cB3.e();
        } else if (n3 == 2) {
            cB3.f();
        } else if (n3 == 3) {
            cB3.g();
        }
        return cB3;
    }

    public cB a(cB cB2, int n2, int n3) {
        int n4 = this.q[n2];
        f f2 = aH.a(n4 >> 16, -12);
        n4 &= 65535;
        if (f2 == null) {
            return cB2.a(true);
        }
        f f3 = null;
        int n5 = 0;
        if (this.r != null && n2 < this.r.length) {
            n5 = this.r[n2];
            f3 = aH.a(n5 >> 16, -19);
            n5 &= 65535;
        }
        if (f3 != null && n5 != 65535) {
            cB cB3 = cB2.a(!f2.a(n4) & !f3.a(n5));
            cB3.a(f2, n4);
            cB3.a(f3, n5);
            return cB3;
        }
        cB cB4 = cB2.a(!f2.a(n4));
        cB4.a(f2, n4);
        return cB4;
    }

    public cB a(cB cB2, int n2, d d2, int n3, int n4) {
        n2 = this.q[n2];
        f f2 = aH.a(n2 >> 16, 81);
        n2 &= 65535;
        if (f2 == null) {
            return d2.b(cB2, n3, 682616430);
        }
        n3 = d2.q[n3];
        f f3 = aH.a(n3 >> 16, 52);
        n3 &= 65535;
        if (f3 == null) {
            cB cB3 = cB2.a(!f2.a(n2));
            cB3.a(f2, n2);
            return cB3;
        }
        cB cB4 = cB2.a(!f2.a(n2) & !f3.a(n3));
        cB4.a(f2, n2, f3, n3, this.p);
        return cB4;
    }

    public cB b(cB cB2, int n2, int n3) {
        n2 = this.q[n2];
        f f2 = aH.a(n2 >> 16, 90);
        n2 &= 65535;
        if (f2 == null) {
            return cB2.a(true);
        }
        cB cB3 = cB2.a(!f2.a(n2));
        cB3.a(f2, n2);
        return cB3;
    }

    cB c(cB cB2, int n2, int n3) {
        n2 = this.q[n2];
        f f2 = aH.a(n2 >> 16, 19);
        n2 &= 65535;
        if (f2 == null) {
            return cB2.b(true);
        }
        cB cB3 = cB2.b(!f2.a(n2));
        cB3.a(f2, n2);
        return cB3;
    }

    void a(cY cY2, int n2, byte by2) {
        if (n2 == 1) {
            int n3;
            int n4 = cY2.f();
            this.o = new int[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                this.o[n3] = cY2.f();
            }
            this.q = new int[n4];
            for (n3 = 0; n3 < n4; ++n3) {
                this.q[n3] = cY2.f();
            }
            n3 = 0;
            while (n3 < n4) {
                int[] arrn = this.q;
                int n5 = n3++;
                arrn[n5] = arrn[n5] + (cY2.f() << 16);
            }
        } else if (n2 == 2) {
            this.f = cY2.f() * 71042647;
        } else if (n2 == 3) {
            int n6 = cY2.d();
            this.p = new int[1 + n6];
            for (int i2 = 0; i2 < n6; ++i2) {
                this.p[i2] = cY2.d();
            }
            this.p[n6] = 9999999;
        } else if (n2 == 4) {
            this.g = true;
        } else if (n2 == 5) {
            this.h = cY2.d() * 1737076713;
        } else if (n2 == 6) {
            this.i = cY2.f() * -2114784625;
        } else if (n2 == 7) {
            this.j = cY2.f() * -1711498285;
        } else if (n2 == 8) {
            this.k = cY2.d() * -1936635187;
        } else if (n2 != 9) {
            if (n2 != 10) {
                if (n2 == 11) {
                    this.l = cY2.d() * -1533044947;
                } else if (n2 == 12) {
                    int n7;
                    int n8 = cY2.d();
                    this.r = new int[n8];
                    for (n7 = 0; n7 < n8; ++n7) {
                        this.r[n7] = cY2.f();
                    }
                    n7 = 0;
                    while (n7 < n8) {
                        int[] arrn = this.r;
                        int n9 = n7++;
                        arrn[n9] = arrn[n9] + (cY2.f() << 16);
                    }
                } else if (n2 == 13) {
                    int n10 = cY2.d();
                    this.s = new int[n10];
                    for (int i3 = 0; i3 < n10; ++i3) {
                        this.s[i3] = cY2.h();
                    }
                }
            } else {
                this.e = cY2.d() * -398814397;
            }
        } else {
            this.d = cY2.d() * 962573011;
        }
    }

    public static boolean a(char c2, int n2) {
        return c2 >= '0' && c2 <= '9';
    }

    static {
        m = new n(64);
        n = new n(100);
    }
}

