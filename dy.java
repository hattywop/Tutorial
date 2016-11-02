/*
 * Decompiled with CFR 0_118.
 */
public final class dy
extends dh {
    static int[][][] a;
    static p b;
    protected static int c;
    int d = 0;
    int e = 0;
    boolean f = false;
    int g;
    int h;
    int i;
    int j;
    int k;
    int l;
    d m;

    static Integer a(cY cY2, int n2) {
        int n3 = 0;
        boolean bl2 = false;
        int n4;
        block0 : while ((n4 = cY2.d()) != 255) {
            if (n4 != 0) {
                throw new IllegalStateException("");
            }
            do {
                int n5;
                if ((n5 = cY2.d()) == 255) continue block0;
                cY2.h -= 1303963473;
                if (cY2.f() != 0) {
                    throw new IllegalStateException("");
                }
                if (bl2) {
                    throw new IllegalStateException("");
                }
                n3 = cY2.i();
                bl2 = true;
            } while (true);
            break;
        }
        return bl2 ? Integer.valueOf(n3) : null;
    }

    final void b(int n2) {
        if (!this.f) {
            this.d += n2 * -1637791935;
            while (this.d * 1809795265 > this.m.o[this.e * -540453505]) {
                this.d -= this.m.o[this.e * -540453505] * -1637791935;
                this.e += 1850239615;
                if (this.e * -540453505 < this.m.q.length) continue;
                this.f = true;
                break;
            }
        }
    }

    @Override
    protected final cB a(int n2) {
        b b2 = cS.b(this.g * 273203395);
        cB cB2 = this.f ? b2.b(-1) : b2.b(this.e * -540453505);
        return cB2 == null ? null : cB2;
    }

    dy(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        this.g = n2 * 900460523;
        this.h = n3 * -1536923887;
        this.i = n4 * 1448924049;
        this.j = n5 * -1657580653;
        this.k = n6 * -615285735;
        this.l = (n7 + n8) * 1745880721;
        int n9 = cS.b((int)(this.g * 273203395)).g * 28936275;
        if (n9 != -1) {
            this.f = false;
            this.m = c.b(n9);
        } else {
            this.f = true;
        }
    }

    static void a(int n2, int n3) {
        if (n2 == -1 && !bH.er) {
            D.a();
        } else if (n2 != -1 && bH.eq * -759346757 != n2 && bH.ep * -250760527 != 0 && !bH.er) {
            p p2 = aG.g;
            int n4 = bH.ep * -250760527;
            do.i = -438370161;
            do.f = p2;
            do.h = n2 * -534518349;
            do.g = 0;
            do.a = n4 * 1862121751;
            br.a = false;
            as.b = 46493510;
        }
        bH.eq = n2 * -32697485;
    }

    static final void b(int n2, int n3) {
        bA bA2 = bH.cq[u.d * -1093536619][n2][n3];
        if (bA2 == null) {
            cr.m.d(u.d * -1093536619, n2, n3);
        } else {
            long l2 = -99999999;
            u u2 = null;
            u u3 = (u)bA2.g();
            while (u3 != null) {
                ca ca2 = bH.j(u3.b * 1500342151);
                long l3 = ca2.m * -2063697793;
                if (ca2.l * 833352093 == 1) {
                    l3 *= (long)(1 + u3.a * 640802101);
                }
                if (l3 > l2) {
                    l2 = l3;
                    u2 = u3;
                }
                u3 = (u)bA2.e();
            }
            if (u2 == null) {
                cr.m.d(u.d * -1093536619, n2, n3);
            } else {
                void var7_8;
                bA2.b(u2);
                java.lang.Object var7_7 = null;
                u u4 = null;
                u3 = (u)bA2.g();
                while (u3 != null) {
                    if (u2.b * 1500342151 != u3.b * 1500342151) {
                        if (var7_8 == null) {
                            u u5 = u3;
                        }
                        if (u3.b * 1500342151 != var7_8.b * 1500342151 && u4 == null) {
                            u4 = u3;
                        }
                    }
                    u3 = (u)bA2.e();
                }
                int n4 = n2 + (n3 << 7) + 1610612736;
                cr.m.a(u.d * -1093536619, n2, n3, c.a(64 + n2 * 128, n3 * 128 + 64, u.d * -1093536619, -1847964236), u2, n4, (dh)var7_8, u4);
            }
        }
    }
}

