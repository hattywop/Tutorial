/*
 * Decompiled with CFR 0_118.
 */
public final class cP
extends t {
    int ap;
    int aq;
    static cP ar;
    static int as;
    int at;
    int au;
    static int av;
    int aw;
    int ax;
    int ay;
    int az;
    static cX[] aA;
    cB aB;
    int aC = -534242947;
    int aD = -1625392379;
    int aE = 0;
    String aF;
    int aG = 0;
    int aH = 0;
    boolean aI = false;
    cR aJ;
    int aK = 0;
    int aL = 0;
    boolean aM = false;

    @Override
    protected final cB a(int n2) {
        cB cB2;
        cB[] arrcB;
        d d2;
        if (this.aJ == null) {
            return null;
        }
        d d3 = this.r * 1287875615 != -1 && this.Y * -82959261 == 0 ? c.b(this.r * 1287875615) : null;
        cB cB3 = this.aJ.a(d3, this.W * -1478048169, d2 = this.T * -1834510973 == -1 || this.aM || this.z * -71832567 == this.T * -1834510973 && d3 != null ? null : c.b(this.T * -1834510973), this.U * 1209298591, 1040516914);
        if (cB3 == null) {
            return null;
        }
        cB3.a();
        this.ae = cB3.aN * -1471884917;
        if (!this.aM && this.aa * -1444330405 != -1 && this.ab * -2034852903 != -1 && (cB2 = cS.b(this.aa * -1444330405).b(this.ab * -2034852903)) != null) {
            cB2.b(0, - this.j * -678743773, 0);
            arrcB = new cB[]{cB3, cB2};
            cB3 = new cB(arrcB, 2);
        }
        if (!this.aM && this.aB != null) {
            if (bH.S * 1026470457 >= this.aL * -1632611687) {
                this.aB = null;
            }
            if (bH.S * 1026470457 >= this.aK * -106872329 && bH.S * 1026470457 < this.aL * -1632611687) {
                cB2 = this.aB;
                cB2.b(this.ay * 125215445 - this.v * -1051150961, this.at * 1665622937 - this.aq * 901097003, this.az * -1196626949 - this.w * -844883935);
                if (this.b * -1099823629 == 512) {
                    cB2.e();
                    cB2.e();
                    cB2.e();
                } else if (this.b * -1099823629 == 1024) {
                    cB2.e();
                    cB2.e();
                } else if (this.b * -1099823629 == 1536) {
                    cB2.e();
                }
                arrcB = new cB[]{cB3, cB2};
                cB3 = new cB(arrcB, 2);
                if (this.b * -1099823629 == 512) {
                    cB2.e();
                } else if (this.b * -1099823629 == 1024) {
                    cB2.e();
                    cB2.e();
                } else if (this.b * -1099823629 == 1536) {
                    cB2.e();
                    cB2.e();
                    cB2.e();
                }
                cB2.b(this.v * -1051150961 - this.ay * 125215445, this.aq * 901097003 - this.at * 1665622937, this.w * -844883935 - this.az * -1196626949);
            }
        }
        cB3.v = true;
        return cB3;
    }

    final void a(cY cY2) {
        int n2;
        int n3;
        cY2.h = 0;
        int n4 = cY2.d();
        this.aC = cY2.e() * 534242947;
        this.aD = cY2.e() * 1625392379;
        int n5 = -1;
        this.aE = 0;
        int[] arrn = new int[12];
        for (int i2 = 0; i2 < 12; ++i2) {
            int n6;
            n2 = cY2.d();
            if (n2 == 0) {
                arrn[i2] = 0;
                continue;
            }
            n3 = cY2.d();
            arrn[i2] = (n2 << 8) + n3;
            if (i2 == 0 && arrn[0] == 65535) {
                n5 = cY2.f();
                break;
            }
            if (arrn[i2] < 512 || (n6 = bH.j((int)(arrn[i2] - 512)).P * -986104365) == 0) continue;
            this.aE = n6 * -65883381;
        }
        int[] arrn2 = new int[5];
        for (n2 = 0; n2 < 5; ++n2) {
            n3 = cY2.d();
            if (n3 < 0 || n3 >= by.f[n2].length) {
                n3 = 0;
            }
            arrn2[n2] = n3;
        }
        this.z = cY2.f() * -597073351;
        if (this.z * -71832567 == 65535) {
            this.z = 597073351;
        }
        this.A = cY2.f() * 204914649;
        if (this.A * 522440809 == 65535) {
            this.A = -204914649;
        }
        this.B = this.A * -1544866519;
        this.C = cY2.f() * 125633893;
        if (this.C * -1173314451 == 65535) {
            this.C = -125633893;
        }
        this.D = cY2.f() * 946961373;
        if (this.D * -1106791307 == 65535) {
            this.D = -946961373;
        }
        this.E = cY2.f() * 1823978411;
        if (this.E * 991276803 == 65535) {
            this.E = -1823978411;
        }
        this.F = cY2.f() * -4348545;
        if (this.F * 132389503 == 65535) {
            this.F = 4348545;
        }
        this.G = cY2.f() * 1732914689;
        if (this.G * 16372225 == 65535) {
            this.G = -1732914689;
        }
        this.aF = cY2.l();
        if (this == ar) {
            di.b = this.aF;
        }
        this.aG = cY2.d() * -522156165;
        this.aH = cY2.f() * -161541663;
        boolean bl2 = this.aI = cY2.d() == 1;
        if (bH.I * -134799277 == 0 && bH.cY * -624018989 >= 2) {
            this.aI = false;
        }
        if (this.aJ == null) {
            this.aJ = new cR();
        }
        this.aJ.a(arrn, arrn2, n4 == 1, n5);
    }

    static final int a(int n2, int n3) {
        int n4 = n3 * 57 + n2;
        n4 ^= n4 << 13;
        int n5 = (789221 + n4 * n4 * 15731) * n4 + 1376312589 & Integer.MAX_VALUE;
        return n5 >> 19 & 255;
    }

    public static cX a(a a2, int n2, int n3, int n4) {
        return t.a(a2, n2, n3) ? ca.c() : null;
    }

    public static int b(int n2, int n3, int n4) {
        int n5 = 0;
        while (n3 > 0) {
            n5 = n5 << 1 | n2 & 1;
            n2 >>>= 1;
            --n3;
        }
        return n5;
    }

    @Override
    final boolean a_(int n2) {
        return this.aJ != null;
    }
}

