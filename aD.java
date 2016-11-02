/*
 * Decompiled with CFR 0_118.
 */
public class aD {
    int a = 0;
    int b = 0;
    public static boolean c = true;
    static int d = 0;
    static int e = 0;
    static ay[] f = new ay[100];
    static boolean g = false;
    static int h = 0;
    static int i = 0;
    static int j = 0;
    public static int k = -1;
    public static int l = -1;
    static int m = 4;
    static int[] n = new int[m];
    static am[][] o = new am[m][500];
    static int p = 0;
    static am[] q = new am[500];
    static bA r = new bA();
    static int[] s = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
    static int[] t = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
    static int[] u = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
    static int[] v = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
    static int[] w = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
    static int[] x = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
    static int[] y = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
    static boolean[][][][] z = new boolean[8][32][51][51];
    static int A;
    static int B;
    static int C;
    static int D;
    static int E;
    static int F;
    static int G;
    static int H;
    static int I;
    static int J;
    static int K;
    static boolean[][] L;
    static int M;
    static int N;
    static int O;
    static int P;
    static int Q;
    static int R;
    static int S;
    static int T;
    static int U;
    ay[] V = new ay[5000];
    int[][] W = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
    int[][] X = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
    int Y;
    int Z;
    int aa;
    cd[][][] ab;
    int[][][] ac;
    int[][][] ad;

    public void a() {
        int n2;
        int n3;
        for (n2 = 0; n2 < this.Y; ++n2) {
            for (n3 = 0; n3 < this.Z; ++n3) {
                for (int i2 = 0; i2 < this.aa; ++i2) {
                    this.ab[n2][n3][i2] = null;
                }
            }
        }
        for (n2 = 0; n2 < m; ++n2) {
            for (n3 = 0; n3 < n[n2]; ++n3) {
                aD.o[n2][n3] = null;
            }
            aD.n[n2] = 0;
        }
        for (n2 = 0; n2 < this.a; ++n2) {
            this.V[n2] = null;
        }
        this.a = 0;
        for (n2 = 0; n2 < f.length; ++n2) {
            aD.f[n2] = null;
        }
    }

    public void a(int n2) {
        this.b = n2;
        for (int i2 = 0; i2 < this.Z; ++i2) {
            for (int i3 = 0; i3 < this.aa; ++i3) {
                if (this.ab[n2][i2][i3] != null) continue;
                this.ab[n2][i2][i3] = new cd(n2, i2, i3);
            }
        }
    }

    public void a(int n2, int n3) {
        cd cd2 = this.ab[0][n2][n3];
        for (int i2 = 0; i2 < 3; ++i2) {
            this.ab[i2][n2][n3] = this.ab[i2 + 1][n2][n3];
            cd cd3 = this.ab[i2][n2][n3];
            if (cd3 == null) continue;
            cd3.t += 2030123745;
            for (int i3 = 0; i3 < cd3.m * -1988543331; ++i3) {
                ay ay2 = cd3.q[i3];
                if ((ay2.o * 2064355509 >> 29 & 3) != 2 || ay2.e * 974211349 != n2 || ay2.g * 26398035 != n3) continue;
                ay2.m -= 1554205931;
            }
        }
        if (this.ab[0][n2][n3] == null) {
            this.ab[0][n2][n3] = new cd(0, n2, n3);
        }
        this.ab[0][n2][n3].g = cd2;
        this.ab[3][n2][n3] = null;
    }

    public void a(int n2, int n3, int n4, int n5, dh dh2, int n6, dh dh3, dh dh4) {
        aj aj2 = new aj();
        aj2.d = dh2;
        aj2.b = n3 * 807165824 + 403582912;
        aj2.c = n4 * -88815488 - 44407744;
        aj2.a = n5 * 1265647705;
        aj2.i = n6 * 1608567821;
        aj2.e = dh3;
        aj2.f = dh4;
        int n7 = 0;
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            for (int i2 = 0; i2 < cd2.m * -1988543331; ++i2) {
                if ((cd2.q[i2].p * -924305457 & 256) != 256 || !(cd2.q[i2].c instanceof cB)) continue;
                cB cB2 = (cB)cd2.q[i2].c;
                cB2.a();
                if (cB2.aN * -695779227 <= n7) continue;
                n7 = cB2.aN * -695779227;
            }
        }
        aj2.g = n7 * 1620480151;
        if (this.ab[n2][n3][n4] == null) {
            this.ab[n2][n3][n4] = new cd(n2, n3, n4);
        }
        this.ab[n2][n3][n4].f = aj2;
    }

    public void a(int n2, int n3, int n4, int n5, dh dh2, dh dh3, int n6, int n7, int n8, int n9) {
        if (dh2 != null || dh3 != null) {
            aq aq2 = new aq();
            aq2.i = n8 * -289909937;
            aq2.j = n9 * -1592113075;
            aq2.b = n3 * 688727936 - 1803119680;
            aq2.c = n4 * -1029665920 + 1632650688;
            aq2.d = n5 * -82761751;
            aq2.h = dh2;
            aq2.g = dh3;
            aq2.a = n6 * -1473627473;
            aq2.e = n7 * 361916571;
            for (int i2 = n2; i2 >= 0; --i2) {
                if (this.ab[i2][n3][n4] != null) continue;
                this.ab[i2][n3][n4] = new cd(i2, n3, n4);
            }
            this.ab[n2][n3][n4].c = aq2;
        }
    }

    public void a(int n2, int n3, int n4, int n5, dh dh2, dh dh3, int n6, int n7, int n8, int n9, int n10, int n11) {
        if (dh2 != null) {
            al al2 = new al();
            al2.l = n10 * -1713765193;
            al2.m = n11 * -1482230449;
            al2.a = n3 * -1871511424 + 1211727936;
            al2.k = n4 * 1299199360 + 649599680;
            al2.b = n5 * -1871858097;
            al2.g = dh2;
            al2.h = dh3;
            al2.d = n6 * -1532218829;
            al2.i = n7 * 1093461913;
            al2.e = n8 * -371331331;
            al2.f = n9 * -653275453;
            for (int i2 = n2; i2 >= 0; --i2) {
                if (this.ab[i2][n3][n4] != null) continue;
                this.ab[i2][n3][n4] = new cd(i2, n3, n4);
            }
            this.ab[n2][n3][n4].j = al2;
        }
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, dh dh2, int n7, int n8, boolean bl2) {
        if (dh2 == null) {
            return true;
        }
        int n9 = n3 - n6;
        int n10 = n4 - n6;
        int n11 = n3 + n6;
        int n12 = n4 + n6;
        if (bl2) {
            if (n7 > 640 && n7 < 1408) {
                n12 += 128;
            }
            if (n7 > 1152 && n7 < 1920) {
                n11 += 128;
            }
            if (n7 > 1664 || n7 < 384) {
                n10 -= 128;
            }
            if (n7 > 128 && n7 < 896) {
                n9 -= 128;
            }
        }
        return this.a(n2, n9, n10, (n11 /= 128) - (n9 /= 128) + 1, (n12 /= 128) - (n10 /= 128) + 1, n3, n4, n5, dh2, n7, true, n8, 0);
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, dh dh2, int n7, int n8, int n9, int n10, int n11, int n12) {
        return dh2 == null ? true : this.a(n2, n9, n10, n11 - n9 + 1, n12 - n10 + 1, n3, n4, n5, dh2, n7, true, n8, 0);
    }

    boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, dh dh2, int n10, boolean bl2, int n11, int n12) {
        int n13;
        cd cd2;
        for (int i2 = n3; i2 < n3 + n5; ++i2) {
            for (n13 = n4; n13 < n4 + n6; ++n13) {
                if (i2 < 0 || n13 < 0 || i2 >= this.Z || n13 >= this.aa) {
                    return false;
                }
                cd2 = this.ab[n2][i2][n13];
                if (cd2 == null || cd2.m * -1988543331 < 5) continue;
                return false;
            }
        }
        ay ay2 = new ay();
        ay2.o = n11 * -1618158179;
        ay2.p = n12 * -1343918289;
        ay2.m = n2 * 1554205931;
        ay2.a = n7 * 1281627321;
        ay2.b = n8 * -1909554719;
        ay2.k = n9 * 1153148755;
        ay2.c = dh2;
        ay2.d = n10 * -722655397;
        ay2.e = n3 * 538230333;
        ay2.g = n4 * 1497824987;
        ay2.f = (n3 + n5 - 1) * -997233943;
        ay2.h = (n4 + n6 - 1) * 212312201;
        for (n13 = n3; n13 < n3 + n5; ++n13) {
            for (cd2 = (cd)n4; cd2 < n4 + n6; ++cd2) {
                int n14 = 0;
                if (n13 > n3) {
                    ++n14;
                }
                if (n13 < n3 + n5 - 1) {
                    n14 += 4;
                }
                if (cd2 > n4) {
                    n14 += 8;
                }
                if (cd2 < n4 + n6 - 1) {
                    n14 += 2;
                }
                for (int i3 = n2; i3 >= 0; --i3) {
                    if (this.ab[i3][n13][cd2] != null) continue;
                    this.ab[i3][n13][cd2] = new cd(i3, n13, (int)cd2);
                }
                cd cd3 = this.ab[n2][n13][cd2];
                cd3.q[cd3.m * -1988543331] = ay2;
                cd3.r[cd3.m * -1988543331] = n14;
                cd3.s = (cd3.s * 577334149 | n14) * 1544672589;
                cd3.m += 1022306741;
            }
        }
        if (bl2) {
            this.V[this.a++] = ay2;
        }
        return true;
    }

    public void a(int n2, int n3, int n4, int n5) {
        al al2;
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null && (al2 = cd2.j) != null) {
            al2.e = al2.e * 551951957 * n5 / 16 * -371331331;
            al2.f = al2.f * -1013919253 * n5 / 16 * -653275453;
        }
    }

    public void a(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            cd2.c = null;
        }
    }

    public void b(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            cd2.j = null;
        }
    }

    public void c(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            cd2.e = null;
        }
    }

    public void d(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            cd2.f = null;
        }
    }

    public void a(int n2, int n3, int n4, int n5, dh dh2, int n6, int n7) {
        if (dh2 != null) {
            aC aC2 = new aC();
            aC2.f = dh2;
            aC2.b = n3 * -682359680 + 1806303808;
            aC2.c = n4 * 428621952 + 214310976;
            aC2.d = n5 * 1947560011;
            aC2.e = n6 * 1874525795;
            aC2.g = n7 * -1138532503;
            if (this.ab[n2][n3][n4] == null) {
                this.ab[n2][n3][n4] = new cd(n2, n3, n4);
            }
            this.ab[n2][n3][n4].e = aC2;
        }
    }

    public al e(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 == null ? null : cd2.j;
    }

    public aC f(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 != null && cd2.e != null ? cd2.e : null;
    }

    void a(ay ay2) {
        for (int i2 = ay2.e * 974211349; i2 <= ay2.f * 910560601; ++i2) {
            for (int i3 = ay2.g * 26398035; i3 <= ay2.h * 1865668025; ++i3) {
                int n2;
                cd cd2 = this.ab[ay2.m * 1696005059][i2][i3];
                if (cd2 == null) continue;
                for (n2 = 0; n2 < cd2.m * -1988543331; ++n2) {
                    if (cd2.q[n2] != ay2) continue;
                    cd2.m -= 1022306741;
                    for (int i4 = n2; i4 < cd2.m * -1988543331; ++i4) {
                        cd2.q[i4] = cd2.q[i4 + 1];
                        cd2.r[i4] = cd2.r[i4 + 1];
                    }
                    cd2.q[cd2.m * -1988543331] = null;
                    break;
                }
                cd2.s = 0;
                for (n2 = 0; n2 < cd2.m * -1988543331; ++n2) {
                    cd2.s = (cd2.s * 577334149 | cd2.r[n2]) * 1544672589;
                }
            }
        }
    }

    public int g(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 != null && cd2.j != null ? cd2.j.l * -133424889 : 0;
    }

    public int h(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < cd2.m * -1988543331; ++i2) {
            ay ay2 = cd2.q[i2];
            if ((ay2.o * 2064355509 >> 29 & 3) != 2 || ay2.e * 974211349 != n3 || ay2.g * 26398035 != n4) continue;
            return ay2.o * 2064355509;
        }
        return 0;
    }

    public int i(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 != null && cd2.e != null ? cd2.e.e * 714830667 : 0;
    }

    public int b(int n2, int n3, int n4, int n5) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 == null) {
            return -1;
        }
        if (cd2.c != null && cd2.c.i * -1209998417 == n5) {
            return cd2.c.j * -1544408955 & 255;
        }
        if (cd2.j != null && cd2.j.l * -133424889 == n5) {
            return cd2.j.m * -1152974417 & 255;
        }
        if (cd2.e != null && cd2.e.e * 714830667 == n5) {
            return cd2.e.g * -42000167 & 255;
        }
        for (int i2 = 0; i2 < cd2.m * -1988543331; ++i2) {
            if (cd2.q[i2].o * 2064355509 != n5) continue;
            return cd2.q[i2].p * -924305457 & 255;
        }
        return -1;
    }

    public void j(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.Y; ++i2) {
            for (int i3 = 0; i3 < this.Z; ++i3) {
                for (int i4 = 0; i4 < this.aa; ++i4) {
                    Object object;
                    da da2;
                    cd cd2 = this.ab[i2][i3][i4];
                    if (cd2 == null) continue;
                    aq aq2 = cd2.c;
                    if (aq2 != null && aq2.h instanceof da) {
                        object = (da)aq2.h;
                        this.a((da)object, i2, i3, i4, 1, 1);
                        if (aq2.g instanceof da) {
                            da2 = (da)aq2.g;
                            this.a(da2, i2, i3, i4, 1, 1);
                            da.a((da)object, da2, 0, 0, 0, false);
                            aq2.g = da2.a(da2.J, da2.K, n2, n3, n4);
                        }
                        aq2.h = object.a(object.J, object.K, n2, n3, n4);
                    }
                    for (int i5 = 0; i5 < cd2.m * -1988543331; ++i5) {
                        ay ay2 = cd2.q[i5];
                        if (ay2 == null || !(ay2.c instanceof da)) continue;
                        da da3 = (da)ay2.c;
                        this.a(da3, i2, i3, i4, ay2.f * 910560601 - ay2.e * 974211349 + 1, ay2.h * 1865668025 - ay2.g * 26398035 + 1);
                        ay2.c = da3.a(da3.J, da3.K, n2, n3, n4);
                    }
                    object = cd2.e;
                    if (object == null || !(object.f instanceof da)) continue;
                    da2 = (da)object.f;
                    this.a(da2, i2, i3, i4);
                    object.f = da2.a(da2.J, da2.K, n2, n3, n4);
                }
            }
        }
    }

    void a(da da2, int n2, int n3, int n4, int n5, int n6) {
        boolean bl2 = true;
        int n7 = n3;
        int n8 = n3 + n5;
        int n9 = n4 - 1;
        int n10 = n4 + n6;
        for (int i2 = n2; i2 <= n2 + 1; ++i2) {
            if (i2 == this.Y) continue;
            for (int i3 = n7; i3 <= n8; ++i3) {
                if (i3 < 0 || i3 >= this.Z) continue;
                for (int i4 = n9; i4 <= n10; ++i4) {
                    cd cd2;
                    if (i4 < 0 || i4 >= this.aa || bl2 && i3 < n8 && i4 < n10 && (i4 >= n4 || i3 == n3) || (cd2 = this.ab[i2][i3][i4]) == null) continue;
                    int n11 = (this.ad[i2][i3][i4] + this.ad[i2][i3 + 1][i4] + this.ad[i2][i3][i4 + 1] + this.ad[i2][i3 + 1][i4 + 1]) / 4 - (this.ad[n2][n3][n4] + this.ad[n2][n3 + 1][n4] + this.ad[n2][n3][n4 + 1] + this.ad[n2][n3 + 1][n4 + 1]) / 4;
                    aq aq2 = cd2.c;
                    if (aq2 != null) {
                        da da3;
                        if (aq2.h instanceof da) {
                            da3 = (da)aq2.h;
                            da.a(da2, da3, (i3 - n3) * 128 + (1 - n5) * 64, n11, (i4 - n4) * 128 + (1 - n6) * 64, bl2);
                        }
                        if (aq2.g instanceof da) {
                            da3 = (da)aq2.g;
                            da.a(da2, da3, (i3 - n3) * 128 + (1 - n5) * 64, n11, (i4 - n4) * 128 + (1 - n6) * 64, bl2);
                        }
                    }
                    for (int i5 = 0; i5 < cd2.m * -1988543331; ++i5) {
                        ay ay2 = cd2.q[i5];
                        if (ay2 == null || !(ay2.c instanceof da)) continue;
                        da da4 = (da)ay2.c;
                        int n12 = ay2.f * 910560601 - ay2.e * 974211349 + 1;
                        int n13 = ay2.h * 1865668025 - ay2.g * 26398035 + 1;
                        da.a(da2, da4, (ay2.e * 974211349 - n3) * 128 + (n12 - n5) * 64, n11, (ay2.g * 26398035 - n4) * 128 + (n13 - n6) * 64, bl2);
                    }
                }
            }
            --n7;
            bl2 = false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(int[] arrn, int n2, int n3, int n4, int n5, int n6) {
        cd cd2 = this.ab[n4][n5][n6];
        if (cd2 == null) return;
        as as2 = cd2.n;
        if (as2 != null) {
            int n7 = as2.i * -2048700131;
            if (n7 == 0) return;
            int n8 = 0;
            while (n8 < 4) {
                arrn[n2] = n7;
                arrn[n2 + 1] = n7;
                arrn[n2 + 2] = n7;
                arrn[n2 + 3] = n7;
                n2 += n3;
                ++n8;
            }
            return;
        }
        ak ak2 = cd2.b;
        if (ak2 == null) return;
        int n9 = ak2.i;
        int n10 = ak2.j;
        int n11 = ak2.k;
        int n12 = ak2.l;
        int[] arrn2 = this.W[n9];
        int[] arrn3 = this.X[n10];
        int n13 = 0;
        if (n11 != 0) {
            int n14 = 0;
            while (n14 < 4) {
                arrn[n2] = arrn2[arrn3[n13++]] == 0 ? n11 : n12;
                arrn[n2 + 1] = arrn2[arrn3[n13++]] == 0 ? n11 : n12;
                arrn[n2 + 2] = arrn2[arrn3[n13++]] == 0 ? n11 : n12;
                arrn[n2 + 3] = arrn2[arrn3[n13++]] == 0 ? n11 : n12;
                n2 += n3;
                ++n14;
            }
            return;
        }
        int n15 = 0;
        while (n15 < 4) {
            if (arrn2[arrn3[n13++]] != 0) {
                arrn[n2] = n12;
            }
            if (arrn2[arrn3[n13++]] != 0) {
                arrn[n2 + 1] = n12;
            }
            if (arrn2[arrn3[n13++]] != 0) {
                arrn[n2 + 2] = n12;
            }
            if (arrn2[arrn3[n13++]] != 0) {
                arrn[n2 + 3] = n12;
            }
            n2 += n3;
            ++n15;
        }
    }

    public static void a(int[] arrn, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        A = 0;
        B = 0;
        C = n4;
        D = n5;
        E = n4 / 2;
        F = n5 / 2;
        boolean[][][][] arrbl = new boolean[9][32][53][53];
        for (n6 = 128; n6 <= 384; n6 += 32) {
            for (n12 = 0; n12 < 2048; n12 += 64) {
                G = de.t[n6];
                H = de.u[n6];
                I = de.t[n12];
                J = de.u[n12];
                n11 = (n6 - 128) / 32;
                n7 = n12 / 64;
                for (n8 = -26; n8 <= 26; ++n8) {
                    for (n9 = -26; n9 <= 26; ++n9) {
                        n10 = n8 * 128;
                        int n13 = n9 * 128;
                        boolean bl2 = false;
                        for (int i2 = - n2; i2 <= n3; i2 += 128) {
                            if (!aD.k(n10, arrn[n11] + i2, n13)) continue;
                            bl2 = true;
                            break;
                        }
                        arrbl[n11][n7][n8 + 25 + 1][n9 + 25 + 1] = bl2;
                    }
                }
            }
        }
        for (n6 = 0; n6 < 8; ++n6) {
            for (n12 = 0; n12 < 32; ++n12) {
                for (n11 = -25; n11 < 25; ++n11) {
                    for (n7 = -25; n7 < 25; ++n7) {
                        n8 = 0;
                        block9 : for (n9 = -1; n9 <= 1; ++n9) {
                            for (n10 = -1; n10 <= 1; ++n10) {
                                if (arrbl[n6][n12][n11 + n9 + 25 + 1][n7 + n10 + 25 + 1]) {
                                    n8 = 1;
                                    break block9;
                                }
                                if (arrbl[n6][(n12 + 1) % 31][n11 + n9 + 25 + 1][n7 + n10 + 25 + 1]) {
                                    n8 = 1;
                                    break block9;
                                }
                                if (arrbl[n6 + 1][n12][n11 + n9 + 25 + 1][n7 + n10 + 25 + 1]) {
                                    n8 = 1;
                                    break block9;
                                }
                                if (!arrbl[n6 + 1][(n12 + 1) % 31][n11 + n9 + 25 + 1][n7 + n10 + 25 + 1]) continue;
                                n8 = 1;
                                break block9;
                            }
                        }
                        aD.z[n6][n12][n11 + 25][n7 + 25] = n8;
                    }
                }
            }
        }
    }

    static boolean k(int n2, int n3, int n4) {
        int n5 = n4 * I + n2 * J >> 16;
        int n6 = n4 * J - n2 * I >> 16;
        int n7 = n3 * G + n6 * H >> 16;
        int n8 = n3 * H - n6 * G >> 16;
        if (n7 >= 50 && n7 <= 3500) {
            int n9 = E + n5 * de.p / n7;
            int n10 = F + n8 * de.p / n7;
            return n9 >= A && n9 <= C && n10 >= B && n10 <= D;
        }
        return false;
    }

    public aq l(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 == null ? null : cd2.c;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        cd[][] arrcd;
        int n10;
        cd cd2;
        int n11;
        int n12;
        int n13;
        cd cd3;
        if (n2 < 0) {
            n2 = 0;
        } else if (n2 >= this.Z * 128) {
            n2 = this.Z * 128 - 1;
        }
        if (n4 < 0) {
            n4 = 0;
        } else if (n4 >= this.aa * 128) {
            n4 = this.aa * 128 - 1;
        }
        ++K;
        G = de.t[n5];
        H = de.u[n5];
        I = de.t[n6];
        J = de.u[n6];
        L = z[(n5 - 128) / 32][n6 / 64];
        M = n2;
        N = n3;
        O = n4;
        P = n2 / 128;
        Q = n4 / 128;
        e = n7;
        R = P - 25;
        if (R < 0) {
            R = 0;
        }
        if ((aD.S = Q - 25) < 0) {
            S = 0;
        }
        if ((aD.T = P + 25) > this.Z) {
            T = this.Z;
        }
        if ((aD.U = Q + 25) > this.aa) {
            U = this.aa;
        }
        this.b();
        d = 0;
        for (n11 = this.b; n11 < this.Y; ++n11) {
            arrcd = this.ab[n11];
            for (n9 = aD.R; n9 < T; ++n9) {
                for (n13 = aD.S; n13 < U; ++n13) {
                    cd2 = arrcd[n9][n13];
                    if (cd2 == null) continue;
                    if (cd2.h * 1385763605 > n7 || !L[n9 - P + 25][n13 - Q + 25] && this.ad[n11][n9][n13] - n3 < 2000) {
                        cd2.i = false;
                        cd2.p = false;
                        cd2.l = 0;
                        continue;
                    }
                    cd2.i = true;
                    cd2.p = true;
                    cd2.k = cd2.m * -1988543331 > 0;
                    ++d;
                }
            }
        }
        for (n11 = this.b; n11 < this.Y; ++n11) {
            arrcd = this.ab[n11];
            for (n9 = -25; n9 <= 0; ++n9) {
                n13 = P + n9;
                n12 = P - n9;
                if (n13 < R && n12 >= T) continue;
                for (cd2 = (cd)-25; cd2 <= 0; ++cd2) {
                    n8 = Q + cd2;
                    n10 = Q - cd2;
                    if (n13 >= R) {
                        if (n8 >= S && (cd3 = arrcd[n13][n8]) != null && cd3.i) {
                            this.a(cd3, true);
                        }
                        if (n10 < U && (cd3 = arrcd[n13][n10]) != null && cd3.i) {
                            this.a(cd3, true);
                        }
                    }
                    if (n12 < T) {
                        if (n8 >= S && (cd3 = arrcd[n12][n8]) != null && cd3.i) {
                            this.a(cd3, true);
                        }
                        if (n10 < U && (cd3 = arrcd[n12][n10]) != null && cd3.i) {
                            this.a(cd3, true);
                        }
                    }
                    if (d != 0) continue;
                    g = false;
                    return;
                }
            }
        }
        for (n11 = this.b; n11 < this.Y; ++n11) {
            arrcd = this.ab[n11];
            for (n9 = -25; n9 <= 0; ++n9) {
                n13 = P + n9;
                n12 = P - n9;
                if (n13 < R && n12 >= T) continue;
                for (cd2 = (cd)-25; cd2 <= 0; ++cd2) {
                    n8 = Q + cd2;
                    n10 = Q - cd2;
                    if (n13 >= R) {
                        if (n8 >= S && (cd3 = arrcd[n13][n8]) != null && cd3.i) {
                            this.a(cd3, false);
                        }
                        if (n10 < U && (cd3 = arrcd[n13][n10]) != null && cd3.i) {
                            this.a(cd3, false);
                        }
                    }
                    if (n12 < T) {
                        if (n8 >= S && (cd3 = arrcd[n12][n8]) != null && cd3.i) {
                            this.a(cd3, false);
                        }
                        if (n10 < U && (cd3 = arrcd[n12][n10]) != null && cd3.i) {
                            this.a(cd3, false);
                        }
                    }
                    if (d != 0) continue;
                    g = false;
                    return;
                }
            }
        }
        g = false;
    }

    void a(cd cd2, boolean bl2) {
        r.a(cd2);
        cd cd3;
        while ((cd3 = (cd)r.c()) != null) {
            int n2;
            int n3;
            Object object;
            Object object2;
            int n4;
            int n5;
            boolean bl3;
            int n6;
            cd cd4;
            int n7;
            Object object3;
            Object object4;
            int n8;
            int n9;
            int n10;
            cd cd5;
            if (!cd3.p) continue;
            int n11 = cd3.v * 1554380415;
            int n12 = cd3.w * 159715287;
            int n13 = cd3.t * -99977505;
            int n14 = cd3.u * 1627601863;
            cd[][] arrcd = this.ab[n13];
            if (cd3.i) {
                if (bl2) {
                    if (n13 > 0 && (cd5 = this.ab[n13 - 1][n11][n12]) != null && cd5.p || n11 <= P && n11 > R && (cd5 = arrcd[n11 - 1][n12]) != null && cd5.p && (cd5.i || (cd3.s * 577334149 & 1) == 0) || n11 >= P && n11 < T - 1 && (cd5 = arrcd[n11 + 1][n12]) != null && cd5.p && (cd5.i || (cd3.s * 577334149 & 4) == 0) || n12 <= Q && n12 > S && (cd5 = arrcd[n11][n12 - 1]) != null && cd5.p && (cd5.i || (cd3.s * 577334149 & 8) == 0) || n12 >= Q && n12 < U - 1 && (cd5 = arrcd[n11][n12 + 1]) != null && cd5.p && (cd5.i || (cd3.s * 577334149 & 2) == 0)) {
                        continue;
                    }
                } else {
                    bl2 = true;
                }
                cd3.i = false;
                if (cd3.g != null) {
                    cd5 = cd3.g;
                    if (cd5.n != null) {
                        if (!this.m(0, n11, n12)) {
                            this.a(cd5.n, 0, G, H, I, J, n11, n12);
                        }
                    } else if (cd5.b != null && !this.m(0, n11, n12)) {
                        this.a(cd5.b, G, H, I, J, n11, n12);
                    }
                    if ((object2 = cd5.c) != null) {
                        object2.h.a(0, G, H, I, J, object2.b * -955073361 - M, object2.d * 1177296985 - N, object2.c * -1387002201 - O, object2.i * -1209998417);
                    }
                    for (n4 = 0; n4 < cd5.m * -1988543331; ++n4) {
                        object3 = cd5.q[n4];
                        if (object3 == null) continue;
                        object3.c.a(object3.d * -1282494253, G, H, I, J, object3.a * 1753592201 - M, object3.k * 1547252955 - N, object3.b * 1772978721 - O, object3.o * 2064355509);
                    }
                }
                bl3 = false;
                if (cd3.n != null) {
                    if (!this.m(n14, n11, n12)) {
                        bl3 = true;
                        if (cd3.n.f * 1410994793 != 12345678 || g && n13 <= h) {
                            this.a(cd3.n, n14, G, H, I, J, n11, n12);
                        }
                    }
                } else if (cd3.b != null && !this.m(n14, n11, n12)) {
                    bl3 = true;
                    this.a(cd3.b, G, H, I, J, n11, n12);
                }
                n9 = 0;
                n4 = 0;
                aq aq2 = cd3.c;
                object = cd3.j;
                if (aq2 != null || object != null) {
                    if (P == n11) {
                        ++n9;
                    } else if (P < n11) {
                        n9 += 2;
                    }
                    if (Q == n12) {
                        n9 += 3;
                    } else if (Q > n12) {
                        n9 += 6;
                    }
                    n4 = s[n9];
                    cd3.o = u[n9] * -1400606107;
                }
                if (aq2 != null) {
                    if ((aq2.a * 1148148815 & t[n9]) != 0) {
                        if (aq2.a * 1148148815 == 16) {
                            cd3.l = 1719792565;
                            cd3.a = v[n9] * 93020713;
                            cd3.d = -1232829595 - cd3.a * -148912225;
                        } else if (aq2.a * 1148148815 == 32) {
                            cd3.l = -855382166;
                            cd3.a = w[n9] * 93020713;
                            cd3.d = 1829308106 - cd3.a * -148912225;
                        } else if (aq2.a * 1148148815 == 64) {
                            cd3.l = -1710764332;
                            cd3.a = x[n9] * 93020713;
                            cd3.d = -636351084 - cd3.a * -148912225;
                        } else {
                            cd3.l = 864410399;
                            cd3.a = y[n9] * 93020713;
                            cd3.d = 596478511 - cd3.a * -148912225;
                        }
                    } else {
                        cd3.l = 0;
                    }
                    if ((aq2.a * 1148148815 & n4) != 0 && !this.c(n14, n11, n12, aq2.a * 1148148815)) {
                        aq2.h.a(0, G, H, I, J, aq2.b * -955073361 - M, aq2.d * 1177296985 - N, aq2.c * -1387002201 - O, aq2.i * -1209998417);
                    }
                    if ((aq2.e * 194198931 & n4) != 0 && !this.c(n14, n11, n12, aq2.e * 194198931)) {
                        aq2.g.a(0, G, H, I, J, aq2.b * -955073361 - M, aq2.d * 1177296985 - N, aq2.c * -1387002201 - O, aq2.i * -1209998417);
                    }
                }
                if (object != null && !this.d(n14, n11, n12, object.g.aN * -695779227)) {
                    if ((object.d * -2051925765 & n4) != 0) {
                        object.g.a(0, G, H, I, J, object.a * -444392959 - M + object.e * 551951957, object.b * -952000337 - N, object.k * -1033450429 - O + object.f * -1013919253, object.l * -133424889);
                    } else if (object.d * -2051925765 == 256) {
                        n7 = object.a * -444392959 - M;
                        n2 = object.b * -952000337 - N;
                        n6 = object.k * -1033450429 - O;
                        n5 = object.i * -1967817559;
                        n10 = n5 != 1 && n5 != 2 ? n7 : - n7;
                        object4 = n5 != 2 && n5 != 3 ? n6 : - n6;
                        if (object4 < n10) {
                            object.g.a(0, G, H, I, J, n7 + object.e * 551951957, n2, n6 + object.f * -1013919253, object.l * -133424889);
                        } else if (object.h != null) {
                            object.h.a(0, G, H, I, J, n7, n2, n6, object.l * -133424889);
                        }
                    }
                }
                if (bl3) {
                    aj aj2;
                    aC aC2 = cd3.e;
                    if (aC2 != null) {
                        aC2.f.a(0, G, H, I, J, aC2.b * 740386361 - M, aC2.d * -1384832669 - N, aC2.c * -16439423 - O, aC2.e * 714830667);
                    }
                    if ((aj2 = cd3.f) != null && aj2.g * -941232345 == 0) {
                        if (aj2.e != null) {
                            aj2.e.a(0, G, H, I, J, aj2.b * 1595881279 - M, aj2.a * 1665861609 - N, aj2.c * 435844977 - O, aj2.i * 1241408197);
                        }
                        if (aj2.f != null) {
                            aj2.f.a(0, G, H, I, J, aj2.b * 1595881279 - M, aj2.a * 1665861609 - N, aj2.c * 435844977 - O, aj2.i * 1241408197);
                        }
                        if (aj2.d != null) {
                            aj2.d.a(0, G, H, I, J, aj2.b * 1595881279 - M, aj2.a * 1665861609 - N, aj2.c * 435844977 - O, aj2.i * 1241408197);
                        }
                    }
                }
                if ((n7 = cd3.s * 577334149) != 0) {
                    if (n11 < P && (n7 & 4) != 0 && (cd4 = arrcd[n11 + 1][n12]) != null && cd4.p) {
                        r.a(cd4);
                    }
                    if (n12 < Q && (n7 & 2) != 0 && (cd4 = arrcd[n11][n12 + 1]) != null && cd4.p) {
                        r.a(cd4);
                    }
                    if (n11 > P && (n7 & 1) != 0 && (cd4 = arrcd[n11 - 1][n12]) != null && cd4.p) {
                        r.a(cd4);
                    }
                    if (n12 > Q && (n7 & 8) != 0 && (cd4 = arrcd[n11][n12 - 1]) != null && cd4.p) {
                        r.a(cd4);
                    }
                }
            }
            if (cd3.l * 782559191 != 0) {
                bl3 = true;
                for (n9 = 0; n9 < cd3.m * -1988543331; ++n9) {
                    if (cd3.q[n9].j * -89979809 == K || (cd3.r[n9] & cd3.l * 782559191) != cd3.a * -2080810471) continue;
                    bl3 = false;
                    break;
                }
                if (bl3) {
                    object2 = cd3.c;
                    if (!this.c(n14, n11, n12, object2.a * 1148148815)) {
                        object2.h.a(0, G, H, I, J, object2.b * -955073361 - M, object2.d * 1177296985 - N, object2.c * -1387002201 - O, object2.i * -1209998417);
                    }
                    cd3.l = 0;
                }
            }
            if (cd3.k) {
                try {
                    int n15 = cd3.m * -1988543331;
                    cd3.k = false;
                    n9 = 0;
                    block5 : for (n4 = 0; n4 < n15; ++n4) {
                        object3 = cd3.q[n4];
                        if (object3.j * -89979809 == K) continue;
                        for (n3 = object3.e * 974211349; n3 <= object3.f * 910560601; ++n3) {
                            for (n7 = object3.g * 26398035; n7 <= object3.h * 1865668025; ++n7) {
                                cd4 = arrcd[n3][n7];
                                if (cd4.i) {
                                    cd3.k = true;
                                    continue block5;
                                }
                                if (cd4.l * 782559191 == 0) continue;
                                n6 = 0;
                                if (n3 > object3.e * 974211349) {
                                    ++n6;
                                }
                                if (n3 < object3.f * 910560601) {
                                    n6 += 4;
                                }
                                if (n7 > object3.g * 26398035) {
                                    n6 += 8;
                                }
                                if (n7 < object3.h * 1865668025) {
                                    n6 += 2;
                                }
                                if ((n6 & cd4.l * 782559191) != cd3.d * 1316610887) continue;
                                cd3.k = true;
                                continue block5;
                            }
                        }
                        aD.f[n9++] = object3;
                        n7 = object3.f * 910560601 - P;
                        n3 = P - object3.e * 974211349;
                        if (n7 > n3) {
                            n3 = n7;
                        }
                        object3.i = (n6 = object3.h * 1865668025 - Q) > (n2 = Q - object3.g * 26398035) ? (n3 + n6) * 1013031121 : (n3 + n2) * 1013031121;
                    }
                    while (n9 > 0) {
                        n4 = -50;
                        n8 = -1;
                        for (n3 = 0; n3 < n9; ++n3) {
                            object = f[n3];
                            if (object.j * -89979809 == K) continue;
                            if (object.i * 144357425 > n4) {
                                n4 = object.i * 144357425;
                                n8 = n3;
                                continue;
                            }
                            if (object.i * 144357425 != n4 || (n2 = object.a * 1753592201 - M) * n2 + (n6 = object.b * 1772978721 - O) * n6 <= (n5 = aD.f[n8].a * 1753592201 - M) * n5 + (n10 = aD.f[n8].b * 1772978721 - O) * n10) continue;
                            n8 = n3;
                        }
                        if (n8 == -1) break;
                        object = f[n8];
                        object.j = K * 406607775;
                        if (!this.b(n14, object.e * 974211349, object.f * 910560601, object.g * 26398035, object.h * 1865668025, object.c.aN * -695779227)) {
                            object.c.a(object.d * -1282494253, G, H, I, J, object.a * 1753592201 - M, object.k * 1547252955 - N, object.b * 1772978721 - O, object.o * 2064355509);
                        }
                        for (n7 = object.e * 974211349; n7 <= object.f * 910560601; ++n7) {
                            for (n2 = object.g * 26398035; n2 <= object.h * 1865668025; ++n2) {
                                object4 = arrcd[n7][n2];
                                if (object4.l * 782559191 != 0) {
                                    r.a((cF)object4);
                                    continue;
                                }
                                if (n7 == n11 && n2 == n12 || !object4.p) continue;
                                r.a((cF)object4);
                            }
                        }
                    }
                    if (cd3.k) continue;
                }
                catch (Exception var23_26) {
                    cd3.k = false;
                }
            }
            if (!cd3.p || cd3.l * 782559191 != 0 || n11 <= P && n11 > R && (cd5 = arrcd[n11 - 1][n12]) != null && cd5.p || n11 >= P && n11 < T - 1 && (cd5 = arrcd[n11 + 1][n12]) != null && cd5.p || n12 <= Q && n12 > S && (cd5 = arrcd[n11][n12 - 1]) != null && cd5.p || n12 >= Q && n12 < U - 1 && (cd5 = arrcd[n11][n12 + 1]) != null && cd5.p) continue;
            cd3.p = false;
            --d;
            object2 = cd3.f;
            if (object2 != null && object2.g * -941232345 != 0) {
                if (object2.e != null) {
                    object2.e.a(0, G, H, I, J, object2.b * 1595881279 - M, object2.a * 1665861609 - N - object2.g * -941232345, object2.c * 435844977 - O, object2.i * 1241408197);
                }
                if (object2.f != null) {
                    object2.f.a(0, G, H, I, J, object2.b * 1595881279 - M, object2.a * 1665861609 - N - object2.g * -941232345, object2.c * 435844977 - O, object2.i * 1241408197);
                }
                if (object2.d != null) {
                    object2.d.a(0, G, H, I, J, object2.b * 1595881279 - M, object2.a * 1665861609 - N - object2.g * -941232345, object2.c * 435844977 - O, object2.i * 1241408197);
                }
            }
            if (cd3.o * -1390153875 != 0) {
                aq aq3;
                object3 = cd3.j;
                if (object3 != null && !this.d(n14, n11, n12, object3.g.aN * -695779227)) {
                    if ((object3.d * -2051925765 & cd3.o * -1390153875) != 0) {
                        object3.g.a(0, G, H, I, J, object3.a * -444392959 - M + object3.e * 551951957, object3.b * -952000337 - N, object3.k * -1033450429 - O + object3.f * -1013919253, object3.l * -133424889);
                    } else if (object3.d * -2051925765 == 256) {
                        n4 = object3.a * -444392959 - M;
                        n8 = object3.b * -952000337 - N;
                        n3 = object3.k * -1033450429 - O;
                        n7 = object3.i * -1967817559;
                        n2 = n7 != 1 && n7 != 2 ? n4 : - n4;
                        n6 = n7 != 2 && n7 != 3 ? n3 : - n3;
                        if (n6 >= n2) {
                            object3.g.a(0, G, H, I, J, n4 + object3.e * 551951957, n8, n3 + object3.f * -1013919253, object3.l * -133424889);
                        } else if (object3.h != null) {
                            object3.h.a(0, G, H, I, J, n4, n8, n3, object3.l * -133424889);
                        }
                    }
                }
                if ((aq3 = cd3.c) != null) {
                    if ((aq3.e * 194198931 & cd3.o * -1390153875) != 0 && !this.c(n14, n11, n12, aq3.e * 194198931)) {
                        aq3.g.a(0, G, H, I, J, aq3.b * -955073361 - M, aq3.d * 1177296985 - N, aq3.c * -1387002201 - O, aq3.i * -1209998417);
                    }
                    if ((aq3.a * 1148148815 & cd3.o * -1390153875) != 0 && !this.c(n14, n11, n12, aq3.a * 1148148815)) {
                        aq3.h.a(0, G, H, I, J, aq3.b * -955073361 - M, aq3.d * 1177296985 - N, aq3.c * -1387002201 - O, aq3.i * -1209998417);
                    }
                }
            }
            if (n13 < this.Y - 1 && (object3 = this.ab[n13 + 1][n11][n12]) != null && object3.p) {
                r.a((cF)object3);
            }
            if (n11 < P && (object3 = arrcd[n11 + 1][n12]) != null && object3.p) {
                r.a((cF)object3);
            }
            if (n12 < Q && (object3 = arrcd[n11][n12 + 1]) != null && object3.p) {
                r.a((cF)object3);
            }
            if (n11 > P && (object3 = arrcd[n11 - 1][n12]) != null && object3.p) {
                r.a((cF)object3);
            }
            if (n12 <= Q || (object3 = arrcd[n11][n12 - 1]) == null || !object3.p) continue;
            r.a((cF)object3);
        }
        return;
    }

    void a(ak ak2, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13 = ak2.m.length;
        for (n12 = 0; n12 < n13; ++n12) {
            n11 = ak2.m[n12] - M;
            n8 = ak2.n[n12] - N;
            n10 = ak2.o[n12] - O;
            n9 = n10 * n4 + n11 * n5 >> 16;
            n10 = n10 * n5 - n11 * n4 >> 16;
            n11 = n9;
            n9 = n8 * n3 - n10 * n2 >> 16;
            if ((n10 = n8 * n2 + n10 * n3 >> 16) < 50) {
                return;
            }
            if (ak2.v != null) {
                ak.c[n12] = n11;
                ak.d[n12] = n9;
                ak.e[n12] = n10;
            }
            ak.a[n12] = de.d + n11 * de.p / n10;
            ak.b[n12] = de.e + n9 * de.p / n10;
        }
        de.o = 0;
        n13 = ak2.p.length;
        for (n12 = 0; n12 < n13; ++n12) {
            n11 = ak2.p[n12];
            n9 = ak.a[n11];
            n8 = ak2.q[n12];
            int n14 = ak.a[n8];
            n10 = ak2.r[n12];
            int n15 = ak.b[n10];
            int n16 = ak.b[n8];
            int n17 = ak.b[n11];
            int n18 = ak.a[n10];
            if ((n9 - n14) * (n15 - n16) - (n17 - n16) * (n18 - n14) <= 0) continue;
            de.k = false;
            if (n9 < 0 || n14 < 0 || n18 < 0 || n9 > de.a || n14 > de.a || n18 > de.a) {
                de.k = true;
            }
            if (g && this.a(i, j, n17, n16, n15, n9, n14, n18)) {
                k = n6;
                l = n7;
            }
            if (ak2.v != null && ak2.v[n12] != -1) {
                if (!c) {
                    if (ak2.h) {
                        de.a(n17, n16, n15, n9, n14, n18, ak2.s[n12], ak2.t[n12], ak2.u[n12], ak.c[0], ak.c[1], ak.c[3], ak.d[0], ak.d[1], ak.d[3], ak.e[0], ak.e[1], ak.e[3], ak2.v[n12]);
                        continue;
                    }
                    de.a(n17, n16, n15, n9, n14, n18, ak2.s[n12], ak2.t[n12], ak2.u[n12], ak.c[n11], ak.c[n8], ak.c[n10], ak.d[n11], ak.d[n8], ak.d[n10], ak.e[n11], ak.e[n8], ak.e[n10], ak2.v[n12]);
                    continue;
                }
                int n19 = de.j.b(ak2.v[n12], 1814652323);
                de.a(n17, n16, n15, n9, n14, n18, aD.b(n19, ak2.s[n12]), aD.b(n19, ak2.t[n12]), aD.b(n19, ak2.u[n12]));
                continue;
            }
            if (ak2.s[n12] == 12345678) continue;
            de.a(n17, n16, n15, n9, n14, n18, ak2.s[n12], ak2.t[n12], ak2.u[n12]);
        }
    }

    static final int b(int n2, int n3) {
        if ((n3 = n3 * (n2 & 127) >> 7) >= 2) {
            if (n3 > 126) {
                n3 = 126;
            }
        } else {
            n3 = 2;
        }
        return (n2 & 65408) + n3;
    }

    boolean a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        if (n3 < n4 && n3 < n5 && n3 < n6) {
            return false;
        }
        if (n3 > n4 && n3 > n5 && n3 > n6) {
            return false;
        }
        if (n2 < n7 && n2 < n8 && n2 < n9) {
            return false;
        }
        if (n2 > n7 && n2 > n8 && n2 > n9) {
            return false;
        }
        int n10 = (n3 - n4) * (n8 - n7) - (n2 - n7) * (n5 - n4);
        int n11 = (n3 - n6) * (n7 - n9) - (n2 - n9) * (n4 - n6);
        int n12 = (n3 - n5) * (n9 - n8) - (n2 - n8) * (n6 - n5);
        return n10 * n12 > 0 && n12 * n11 > 0;
    }

    void b() {
        int n2 = n[e];
        am[] arram = o[e];
        p = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3;
            int n4;
            int n5;
            boolean bl2;
            int n6;
            am am2 = arram[i2];
            if (am2.r * 2100503345 == 1) {
                n6 = am2.k * 1526951523 - P + 25;
                if (n6 < 0 || n6 > 50) continue;
                n3 = am2.c * -161539115 - Q + 25;
                if (n3 < 0) {
                    n3 = 0;
                }
                if ((n5 = am2.f * -397567009 - Q + 25) > 50) {
                    n5 = 50;
                }
                bl2 = false;
                while (n3 <= n5) {
                    if (!L[n6][n3++]) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) continue;
                n4 = M - am2.q * -87664291;
                if (n4 > 32) {
                    am2.e = 669940033;
                } else {
                    if (n4 >= -32) continue;
                    am2.e = 1339880066;
                    n4 = - n4;
                }
                am2.n = (am2.g * -840190769 - O << 8) / n4 * 1898861439;
                am2.p = (am2.d * 1433494849 - O << 8) / n4 * -1848987725;
                am2.a = (am2.i * 1085621233 - N << 8) / n4 * -2073296299;
                am2.s = (am2.j * -1794318859 - N << 8) / n4 * -134855345;
                aD.q[aD.p++] = am2;
                continue;
            }
            if (am2.r * 2100503345 == 2) {
                n6 = am2.c * -161539115 - Q + 25;
                if (n6 < 0 || n6 > 50) continue;
                n3 = am2.k * 1526951523 - P + 25;
                if (n3 < 0) {
                    n3 = 0;
                }
                if ((n5 = am2.b * 1136304423 - P + 25) > 50) {
                    n5 = 50;
                }
                bl2 = false;
                while (n3 <= n5) {
                    if (!L[n3++][n6]) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) continue;
                n4 = O - am2.g * -840190769;
                if (n4 > 32) {
                    am2.e = 2009820099;
                } else {
                    if (n4 >= -32) continue;
                    am2.e = -1615207164;
                    n4 = - n4;
                }
                am2.l = (am2.q * -87664291 - M << 8) / n4 * -310537311;
                am2.m = (am2.h * -1977435303 - M << 8) / n4 * 538391901;
                am2.a = (am2.i * 1085621233 - N << 8) / n4 * -2073296299;
                am2.s = (am2.j * -1794318859 - N << 8) / n4 * -134855345;
                aD.q[aD.p++] = am2;
                continue;
            }
            if (am2.r * 2100503345 != 4 || (n6 = am2.i * 1085621233 - N) <= 128) continue;
            n3 = am2.c * -161539115 - Q + 25;
            if (n3 < 0) {
                n3 = 0;
            }
            if ((n5 = am2.f * -397567009 - Q + 25) > 50) {
                n5 = 50;
            }
            if (n3 > n5) continue;
            int n7 = am2.k * 1526951523 - P + 25;
            if (n7 < 0) {
                n7 = 0;
            }
            if ((n4 = am2.b * 1136304423 - P + 25) > 50) {
                n4 = 50;
            }
            boolean bl3 = false;
            block3 : for (int i3 = n7; i3 <= n4; ++i3) {
                for (int i4 = n3; i4 <= n5; ++i4) {
                    if (!L[i3][i4]) continue;
                    bl3 = true;
                    break block3;
                }
            }
            if (!bl3) continue;
            am2.e = -945267131;
            am2.l = (am2.q * -87664291 - M << 8) / n6 * -310537311;
            am2.m = (am2.h * -1977435303 - M << 8) / n6 * 538391901;
            am2.n = (am2.g * -840190769 - O << 8) / n6 * 1898861439;
            am2.p = (am2.d * 1433494849 - O << 8) / n6 * -1848987725;
            aD.q[aD.p++] = am2;
        }
    }

    boolean m(int n2, int n3, int n4) {
        int n5 = this.ac[n2][n3][n4];
        if (n5 == - K) {
            return false;
        }
        if (n5 == K) {
            return true;
        }
        int n6 = n3 << 7;
        int n7 = n4 << 7;
        if (this.p(n6 + 1, this.ad[n2][n3][n4], n7 + 1) && this.p(n6 + 128 - 1, this.ad[n2][n3 + 1][n4], n7 + 1) && this.p(n6 + 128 - 1, this.ad[n2][n3 + 1][n4 + 1], n7 + 128 - 1) && this.p(n6 + 1, this.ad[n2][n3][n4 + 1], n7 + 128 - 1)) {
            this.ac[n2][n3][n4] = K;
            return true;
        }
        this.ac[n2][n3][n4] = - K;
        return false;
    }

    boolean c(int n2, int n3, int n4, int n5) {
        if (!this.m(n2, n3, n4)) {
            return false;
        }
        int n6 = n3 << 7;
        int n7 = n4 << 7;
        int n8 = this.ad[n2][n3][n4] - 1;
        int n9 = n8 - 120;
        int n10 = n8 - 230;
        int n11 = n8 - 238;
        if (n5 < 16) {
            if (n5 == 1) {
                if (n6 > M) {
                    if (!this.p(n6, n8, n7)) {
                        return false;
                    }
                    if (!this.p(n6, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.p(n6, n9, n7)) {
                        return false;
                    }
                    if (!this.p(n6, n9, n7 + 128)) {
                        return false;
                    }
                }
                if (!this.p(n6, n10, n7)) {
                    return false;
                }
                if (!this.p(n6, n10, n7 + 128)) {
                    return false;
                }
                return true;
            }
            if (n5 == 2) {
                if (n7 < O) {
                    if (!this.p(n6, n8, n7 + 128)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.p(n6, n9, n7 + 128)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n9, n7 + 128)) {
                        return false;
                    }
                }
                if (!this.p(n6, n10, n7 + 128)) {
                    return false;
                }
                if (!this.p(n6 + 128, n10, n7 + 128)) {
                    return false;
                }
                return true;
            }
            if (n5 == 4) {
                if (n6 < M) {
                    if (!this.p(n6 + 128, n8, n7)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n8, n7 + 128)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.p(n6 + 128, n9, n7)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n9, n7 + 128)) {
                        return false;
                    }
                }
                if (!this.p(n6 + 128, n10, n7)) {
                    return false;
                }
                if (!this.p(n6 + 128, n10, n7 + 128)) {
                    return false;
                }
                return true;
            }
            if (n5 == 8) {
                if (n7 > O) {
                    if (!this.p(n6, n8, n7)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n8, n7)) {
                        return false;
                    }
                }
                if (n2 > 0) {
                    if (!this.p(n6, n9, n7)) {
                        return false;
                    }
                    if (!this.p(n6 + 128, n9, n7)) {
                        return false;
                    }
                }
                if (!this.p(n6, n10, n7)) {
                    return false;
                }
                if (!this.p(n6 + 128, n10, n7)) {
                    return false;
                }
                return true;
            }
        }
        return !this.p(n6 + 64, n11, n7 + 64) ? false : (n5 == 16 ? this.p(n6, n10, n7 + 128) : (n5 == 32 ? this.p(n6 + 128, n10, n7 + 128) : (n5 == 64 ? this.p(n6 + 128, n10, n7) : (n5 == 128 ? this.p(n6, n10, n7) : true))));
    }

    boolean d(int n2, int n3, int n4, int n5) {
        if (this.m(n2, n3, n4)) {
            int n6 = n3 << 7;
            int n7 = n4 << 7;
            return this.p(n6 + 1, this.ad[n2][n3][n4] - n5, n7 + 1) && this.p(n6 + 128 - 1, this.ad[n2][n3 + 1][n4] - n5, n7 + 1) && this.p(n6 + 128 - 1, this.ad[n2][n3 + 1][n4 + 1] - n5, n7 + 128 - 1) && this.p(n6 + 1, this.ad[n2][n3][n4 + 1] - n5, n7 + 128 - 1);
        }
        return false;
    }

    boolean b(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        if (n3 == n4 && n5 == n6) {
            if (!this.m(n2, n3, n5)) {
                return false;
            }
            int n10 = n3 << 7;
            int n11 = n5 << 7;
            return this.p(n10 + 1, this.ad[n2][n3][n5] - n7, n11 + 1) && this.p(n10 + 128 - 1, this.ad[n2][n3 + 1][n5] - n7, n11 + 1) && this.p(n10 + 128 - 1, this.ad[n2][n3 + 1][n5 + 1] - n7, n11 + 128 - 1) && this.p(n10 + 1, this.ad[n2][n3][n5 + 1] - n7, n11 + 128 - 1);
        }
        for (n9 = n3; n9 <= n4; ++n9) {
            for (n8 = n5; n8 <= n6; ++n8) {
                if (this.ac[n2][n9][n8] != - K) continue;
                return false;
            }
        }
        n9 = (n3 << 7) + 1;
        int n12 = this.ad[n2][n3][n5] - n7;
        n8 = (n5 << 7) + 2;
        if (!this.p(n9, n12, n8)) {
            return false;
        }
        int n13 = (n4 << 7) - 1;
        if (!this.p(n13, n12, n8)) {
            return false;
        }
        int n14 = (n6 << 7) - 1;
        if (!this.p(n9, n12, n14)) {
            return false;
        }
        if (!this.p(n13, n12, n14)) {
            return false;
        }
        return true;
    }

    public void n(int n2, int n3, int n4) {
        g = true;
        h = n2;
        i = n3;
        j = n4;
        k = -1;
        l = -1;
    }

    void a(da da2, int n2, int n3, int n4) {
        cd cd2;
        da da3;
        if (n3 < this.Z && (cd2 = this.ab[n2][n3 + 1][n4]) != null && cd2.e != null && cd2.e.f instanceof da) {
            da3 = (da)cd2.e.f;
            da.a(da2, da3, 128, 0, 0, true);
        }
        if (n4 < this.Z && (cd2 = this.ab[n2][n3][n4 + 1]) != null && cd2.e != null && cd2.e.f instanceof da) {
            da3 = (da)cd2.e.f;
            da.a(da2, da3, 0, 0, 128, true);
        }
        if (n3 < this.Z && n4 < this.aa && (cd2 = this.ab[n2][n3 + 1][n4 + 1]) != null && cd2.e != null && cd2.e.f instanceof da) {
            da3 = (da)cd2.e.f;
            da.a(da2, da3, 128, 0, 128, true);
        }
        if (n3 < this.Z && n4 > 0 && (cd2 = this.ab[n2][n3 + 1][n4 - 1]) != null && cd2.e != null && cd2.e.f instanceof da) {
            da3 = (da)cd2.e.f;
            da.a(da2, da3, 128, 0, -128, true);
        }
    }

    public boolean a(int n2, int n3, int n4, int n5, int n6, int n7, dh dh2, int n8, int n9, int n10) {
        if (dh2 == null) {
            return true;
        }
        int n11 = n3 * 128 + n6 * 64;
        int n12 = n4 * 128 + n7 * 64;
        return this.a(n2, n3, n4, n6, n7, n11, n12, n5, dh2, n8, false, n9, n10);
    }

    public void o(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            for (int i2 = 0; i2 < cd2.m * -1988543331; ++i2) {
                ay ay2 = cd2.q[i2];
                if ((ay2.o * 2064355509 >> 29 & 3) != 2 || ay2.e * 974211349 != n3 || ay2.g * 26398035 != n4) continue;
                this.a(ay2);
                return;
            }
        }
    }

    boolean p(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < p; ++i2) {
            int n5;
            int n6;
            int n7;
            int n8;
            int n9;
            am am2 = q[i2];
            if (am2.e * -250931519 == 1) {
                n5 = am2.q * -87664291 - n2;
                if (n5 <= 0) continue;
                n9 = am2.g * -840190769 + (am2.n * -1162515329 * n5 >> 8);
                n7 = am2.d * 1433494849 + (am2.p * 211392379 * n5 >> 8);
                n6 = am2.i * 1085621233 + (am2.a * 715188989 * n5 >> 8);
                n8 = am2.j * -1794318859 + (am2.s * 315994543 * n5 >> 8);
                if (n4 < n9 || n4 > n7 || n3 < n6 || n3 > n8) continue;
                return true;
            }
            if (am2.e * -250931519 == 2) {
                n5 = n2 - am2.q * -87664291;
                if (n5 <= 0) continue;
                n9 = am2.g * -840190769 + (am2.n * -1162515329 * n5 >> 8);
                n7 = am2.d * 1433494849 + (am2.p * 211392379 * n5 >> 8);
                n6 = am2.i * 1085621233 + (am2.a * 715188989 * n5 >> 8);
                n8 = am2.j * -1794318859 + (am2.s * 315994543 * n5 >> 8);
                if (n4 < n9 || n4 > n7 || n3 < n6 || n3 > n8) continue;
                return true;
            }
            if (am2.e * -250931519 == 3) {
                n5 = am2.g * -840190769 - n4;
                if (n5 <= 0) continue;
                n9 = am2.q * -87664291 + (am2.l * 210833505 * n5 >> 8);
                n7 = am2.h * -1977435303 + (am2.m * -464206091 * n5 >> 8);
                n6 = am2.i * 1085621233 + (am2.a * 715188989 * n5 >> 8);
                n8 = am2.j * -1794318859 + (am2.s * 315994543 * n5 >> 8);
                if (n2 < n9 || n2 > n7 || n3 < n6 || n3 > n8) continue;
                return true;
            }
            if (am2.e * -250931519 == 4) {
                n5 = n4 - am2.g * -840190769;
                if (n5 <= 0) continue;
                n9 = am2.q * -87664291 + (am2.l * 210833505 * n5 >> 8);
                n7 = am2.h * -1977435303 + (am2.m * -464206091 * n5 >> 8);
                n6 = am2.i * 1085621233 + (am2.a * 715188989 * n5 >> 8);
                n8 = am2.j * -1794318859 + (am2.s * 315994543 * n5 >> 8);
                if (n2 < n9 || n2 > n7 || n3 < n6 || n3 > n8) continue;
                return true;
            }
            if (am2.e * -250931519 != 5 || (n5 = n3 - am2.i * 1085621233) <= 0) continue;
            n9 = am2.q * -87664291 + (am2.l * 210833505 * n5 >> 8);
            n7 = am2.h * -1977435303 + (am2.m * -464206091 * n5 >> 8);
            n6 = am2.g * -840190769 + (am2.n * -1162515329 * n5 >> 8);
            n8 = am2.d * 1433494849 + (am2.p * 211392379 * n5 >> 8);
            if (n2 < n9 || n2 > n7 || n4 < n6 || n4 > n8) continue;
            return true;
        }
        return false;
    }

    public ay q(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 == null) {
            return null;
        }
        for (int i2 = 0; i2 < cd2.m * -1988543331; ++i2) {
            ay ay2 = cd2.q[i2];
            if ((ay2.o * 2064355509 >> 29 & 3) != 2 || ay2.e * 974211349 != n3 || ay2.g * 26398035 != n4) continue;
            return ay2;
        }
        return null;
    }

    public aD(int n2, int n3, int n4, int[][][] arrn) {
        this.Y = n2;
        this.Z = n3;
        this.aa = n4;
        this.ab = new cd[n2][n3][n4];
        this.ac = new int[n2][n3 + 1][n4 + 1];
        this.ad = arrn;
        this.a();
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        am am2 = new am();
        am2.k = n4 / 128 * 135693131;
        am2.b = n5 / 128 * 1580252823;
        am2.c = n6 / 128 * 1599292797;
        am2.f = n7 / 128 * -257302497;
        am2.r = n3 * -916367919;
        am2.q = n4 * -955989259;
        am2.h = n5 * -1558455063;
        am2.g = n6 * -602353105;
        am2.d = n7 * -479843647;
        am2.i = n8 * -1309192943;
        am2.j = n9 * 373106269;
        int[] arrn = n;
        int n10 = n2;
        int n11 = arrn[n10];
        arrn[n10] = n11 + 1;
        aD.o[n2][n11] = am2;
    }

    public void e(int n2, int n3, int n4, int n5) {
        cd cd2 = this.ab[n2][n3][n4];
        if (cd2 != null) {
            this.ab[n2][n3][n4].h = n5 * -480664515;
        }
    }

    public void c() {
        for (int i2 = 0; i2 < this.a; ++i2) {
            ay ay2 = this.V[i2];
            this.a(ay2);
            this.V[i2] = null;
        }
        this.a = 0;
    }

    public int r(int n2, int n3, int n4) {
        cd cd2 = this.ab[n2][n3][n4];
        return cd2 != null && cd2.c != null ? cd2.c.i * -1209998417 : 0;
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20, int n21) {
        if (n5 != 0) {
            if (n5 != 1) {
                ak ak2 = new ak(n5, n6, n7, n3, n4, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21);
                for (int i2 = n2; i2 >= 0; --i2) {
                    if (this.ab[i2][n3][n4] != null) continue;
                    this.ab[i2][n3][n4] = new cd(i2, n3, n4);
                }
                this.ab[n2][n3][n4].b = ak2;
            } else {
                as as2 = new as(n16, n17, n18, n19, n7, n21, n8 == n9 && n8 == n10 && n8 == n11);
                for (int i3 = n2; i3 >= 0; --i3) {
                    if (this.ab[i3][n3][n4] != null) continue;
                    this.ab[i3][n3][n4] = new cd(i3, n3, n4);
                }
                this.ab[n2][n3][n4].n = as2;
            }
        } else {
            as as3 = new as(n12, n13, n14, n15, -1, n20, false);
            for (int i4 = n2; i4 >= 0; --i4) {
                if (this.ab[i4][n3][n4] != null) continue;
                this.ab[i4][n3][n4] = new cd(i4, n3, n4);
            }
            this.ab[n2][n3][n4].n = as3;
        }
    }

    void a(as as2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int n10;
        int n11;
        int n12;
        int n13 = n12 = (n7 << 7) - M;
        int n14 = n10 = (n8 << 7) - O;
        int n15 = n11 = n13 + 128;
        int n16 = n9 = n14 + 128;
        int n17 = this.ad[n2][n7][n8] - N;
        int n18 = this.ad[n2][n7 + 1][n8] - N;
        int n19 = this.ad[n2][n7 + 1][n8 + 1] - N;
        int n20 = this.ad[n2][n7][n8 + 1] - N;
        int n21 = n14 * n5 + n13 * n6 >> 16;
        n14 = n14 * n6 - n13 * n5 >> 16;
        n13 = n21;
        n21 = n17 * n4 - n14 * n3 >> 16;
        n14 = n17 * n3 + n14 * n4 >> 16;
        n17 = n21;
        if (n14 >= 50) {
            n21 = n10 * n5 + n15 * n6 >> 16;
            n10 = n10 * n6 - n15 * n5 >> 16;
            n15 = n21;
            n21 = n18 * n4 - n10 * n3 >> 16;
            n10 = n18 * n3 + n10 * n4 >> 16;
            n18 = n21;
            if (n10 >= 50) {
                n21 = n16 * n5 + n11 * n6 >> 16;
                n16 = n16 * n6 - n11 * n5 >> 16;
                n11 = n21;
                n21 = n19 * n4 - n16 * n3 >> 16;
                n16 = n19 * n3 + n16 * n4 >> 16;
                n19 = n21;
                if (n16 >= 50) {
                    n21 = n9 * n5 + n12 * n6 >> 16;
                    n9 = n9 * n6 - n12 * n5 >> 16;
                    n12 = n21;
                    n21 = n20 * n4 - n9 * n3 >> 16;
                    if ((n9 = n20 * n3 + n9 * n4 >> 16) >= 50) {
                        int n22;
                        int n23 = de.d + n13 * de.p / n14;
                        int n24 = de.e + n17 * de.p / n14;
                        int n25 = de.d + n15 * de.p / n10;
                        int n26 = de.e + n18 * de.p / n10;
                        int n27 = de.d + n11 * de.p / n16;
                        int n28 = de.e + n19 * de.p / n16;
                        int n29 = de.d + n12 * de.p / n9;
                        int n30 = de.e + n21 * de.p / n9;
                        de.o = 0;
                        if ((n27 - n29) * (n26 - n30) - (n28 - n30) * (n25 - n29) > 0) {
                            de.k = false;
                            if (n27 < 0 || n29 < 0 || n25 < 0 || n27 > de.a || n29 > de.a || n25 > de.a) {
                                de.k = true;
                            }
                            if (g && this.a(i, j, n28, n30, n26, n27, n29, n25)) {
                                k = n7;
                                l = n8;
                            }
                            if (as2.h * -916753167 == -1) {
                                if (as2.f * 1410994793 != 12345678) {
                                    de.a(n28, n30, n26, n27, n29, n25, as2.f * 1410994793, as2.g * -1067140039, as2.e * -1889290015);
                                }
                            } else if (!c) {
                                if (as2.c) {
                                    de.a(n28, n30, n26, n27, n29, n25, as2.f * 1410994793, as2.g * -1067140039, as2.e * -1889290015, n13, n15, n12, n17, n18, n21, n14, n10, n9, as2.h * -916753167);
                                } else {
                                    de.a(n28, n30, n26, n27, n29, n25, as2.f * 1410994793, as2.g * -1067140039, as2.e * -1889290015, n11, n12, n15, n19, n21, n18, n16, n9, n10, as2.h * -916753167);
                                }
                            } else {
                                n22 = de.j.b(as2.h * -916753167, 684776233);
                                de.a(n28, n30, n26, n27, n29, n25, aD.b(n22, as2.f * 1410994793), aD.b(n22, as2.g * -1067140039), aD.b(n22, as2.e * -1889290015));
                            }
                        }
                        if ((n23 - n25) * (n30 - n26) - (n24 - n26) * (n29 - n25) > 0) {
                            de.k = false;
                            if (n23 < 0 || n25 < 0 || n29 < 0 || n23 > de.a || n25 > de.a || n29 > de.a) {
                                de.k = true;
                            }
                            if (g && this.a(i, j, n24, n26, n30, n23, n25, n29)) {
                                k = n7;
                                l = n8;
                            }
                            if (as2.h * -916753167 == -1) {
                                if (as2.d * 1604693801 != 12345678) {
                                    de.a(n24, n26, n30, n23, n25, n29, as2.d * 1604693801, as2.e * -1889290015, as2.g * -1067140039);
                                }
                            } else if (c) {
                                n22 = de.j.b(as2.h * -916753167, -2129085716);
                                de.a(n24, n26, n30, n23, n25, n29, aD.b(n22, as2.d * 1604693801), aD.b(n22, as2.e * -1889290015), aD.b(n22, as2.g * -1067140039));
                            } else {
                                de.a(n24, n26, n30, n23, n25, n29, as2.d * 1604693801, as2.e * -1889290015, as2.g * -1067140039, n13, n15, n12, n17, n18, n21, n14, n10, n9, as2.h * -916753167);
                            }
                        }
                    }
                }
            }
        }
    }
}

