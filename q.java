/*
 * Decompiled with CFR 0_118.
 */
public class q
extends z {
    public static a a;
    static int b;
    static n c;
    public int d = 0;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static final void a(cZ var0, int var1_1, int var2_2) {
        if (var0.t * -1021998289 == 1) {
            B.a(var0.as, "", 24, 0, 0, var0.bt * 1582464481);
        }
        if (var0.t * -1021998289 == 2 && !bH.cM) {
            var3_3 = bH.a(var0);
            var4_4 = var3_3 >> 11 & 63;
            var5_5 = var4_4 == 0 ? null : (var0.ak != null && var0.ak.trim().length() != 0 ? var0.ak : null);
            if (var5_5 != null) {
                B.a(var5_5, am.a(65280) + var0.al, 25, 0, -1, var0.bt * 1582464481);
            }
        }
        if (var0.t * -1021998289 == 3) {
            B.a(du.cd, "", 26, 0, 0, var0.bt * 1582464481);
        }
        if (var0.t * -1021998289 == 4) {
            B.a(var0.as, "", 28, 0, 0, var0.bt * 1582464481);
        }
        if (var0.t * -1021998289 == 5) {
            B.a(var0.as, "", 29, 0, 0, var0.bt * 1582464481);
        }
        if (var0.t * -1021998289 == 6 && bH.cV == null) {
            B.a(var0.as, "", 30, 0, -1, var0.bt * 1582464481);
        }
        if (var0.s * -1878336627 != 2) ** GOTO lbl106
        var7_6 = 0;
        block0 : for (var8_7 = 0; var8_7 < var0.by * 539675235; ++var8_7) {
            var3_3 = 0;
            do {
                if (var3_3 >= var0.bx * 2096072399) continue block0;
                var6_10 = (32 + var0.P * 1620079109) * var3_3;
                var9_11 = var8_7 * (32 + var0.Q * -1753308347);
                if (var7_6 < 20) {
                    var6_10 += var0.R[var7_6];
                    var9_11 += var0.S[var7_6];
                }
                if (var1_1 < var6_10 || var2_2 < var9_11 || var1_1 >= var6_10 + 32 || var2_2 >= 32 + var9_11) ** GOTO lbl103
                bH.bX = var7_6 * -1255302371;
                bE.e = var0;
                if (var0.H[var7_6] <= 0) ** GOTO lbl103
                var10_12 = bH.j(var0.H[var7_6] - 1);
                if (bH.cK * -1710049223 != 1) ** GOTO lbl40
                var11_13 = bH.a(var0);
                v0 = var12_15 = (var11_13 >> 30 & 1) != 0 ? 1 : 0;
                if (var12_15 == 0) ** GOTO lbl40
                if (bQ.c * -1356904377 != var0.bt * 1582464481 || aB.a * 2106654977 != var7_6) {
                    B.a(du.bU, bH.cL + " " + aB.g + " " + am.a(16748608) + var10_12.f, 31, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                }
                ** GOTO lbl103
lbl40: // 2 sources:
                if (!bH.cM) ** GOTO lbl47
                var11_13 = bH.a(var0);
                v1 = var12_15 = (var11_13 >> 30 & 1) != 0 ? 1 : 0;
                if (var12_15 == 0) ** GOTO lbl47
                if ((cC.c * 253871613 & 16) == 16) {
                    B.a(bH.cP, bH.cQ + " " + aB.g + " " + am.a(16748608) + var10_12.f, 32, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                }
                ** GOTO lbl103
lbl47: // 2 sources:
                var11_14 = var10_12.T;
                if (bH.dc) {
                    var11_14 = aC.a(var11_14);
                }
                v2 = var13_16 = ((var12_15 = bH.a(var0)) >> 30 & 1) != 0;
                if (!var13_16) ** GOTO lbl61
                for (var14_17 = 4; var14_17 >= 3; --var14_17) {
                    if (var11_14 != null && var11_14[var14_17] != null) {
                        var15_18 = var14_17 == 3 ? 36 : 37;
                        B.a(var11_14[var14_17], am.a(16748608) + var10_12.f, var15_18, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                        continue;
                    }
                    if (var14_17 != 4) continue;
                    B.a(du.d, am.a(16748608) + var10_12.f, 37, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                }
lbl61: // 2 sources:
                v3 = var15_18 = ((var14_17 = bH.a(var0)) >> 31 & 1) != 0 ? 1 : 0;
                if (var15_18 != 0) {
                    B.a(du.bU, am.a(16748608) + var10_12.f, 38, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                }
                v4 = var17_20 = ((var16_19 = bH.a(var0)) >> 30 & 1) != 0;
                if (var17_20 && var11_14 != null) {
                    for (var18_21 = 2; var18_21 >= 0; --var18_21) {
                        if (var11_14[var18_21] == null) continue;
                        var19_22 = 0;
                        if (var18_21 == 0) {
                            var19_22 = 33;
                        } else if (var18_21 == 1) {
                            var19_22 = 34;
                        } else if (var18_21 == 2) {
                            var19_22 = 35;
                        }
                        B.a(var11_14[var18_21], am.a(16748608) + var10_12.f, var19_22, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                    }
                }
                var11_14 = var0.Y;
                if (bH.dc) {
                    var11_14 = aC.a(var11_14);
                }
                if (var11_14 != null) {
                    for (var18_21 = 4; var18_21 >= 0; --var18_21) {
                        if (var11_14[var18_21] == null) continue;
                        var19_22 = 0;
                        if (var18_21 == 0) {
                            var19_22 = 39;
                        } else if (var18_21 == 1) {
                            var19_22 = 40;
                        } else if (var18_21 == 2) {
                            var19_22 = 41;
                        } else if (var18_21 == 3) {
                            var19_22 = 42;
                        } else if (var18_21 == 4) {
                            var19_22 = 43;
                        }
                        B.a(var11_14[var18_21], am.a(16748608) + var10_12.f, var19_22, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
                    }
                }
                B.a(du.bV, am.a(16748608) + var10_12.f, 1005, var10_12.c * 1539412267, var7_6, var0.bt * 1582464481);
lbl103: // 5 sources:
                ++var7_6;
                ++var3_3;
            } while (true);
        }
lbl106: // 2 sources:
        if (var0.r == false) return;
        if (bH.cM) {
            var4_4 = bH.a(var0);
            if ((var4_4 >> 21 & 1) == 0) return;
            v5 = 1;
            var8_7 = v5;
            if (var8_7 == 0) return;
            if ((cC.c * 253871613 & 32) != 32) return;
            B.a(bH.cP, bH.cQ + " " + aB.g + " " + var0.aJ, 58, 0, var0.bu * -1395083971, var0.bt * 1582464481);
            return;
        }
        for (var7_6 = 9; var7_6 >= 5; --var7_6) {
            var8_8 = dj.a(bH.a(var0), var7_6) == false && var0.bb == null ? null : (var0.aL != null && var0.aL.length > var7_6 && var0.aL[var7_6] != null && var0.aL[var7_6].trim().length() != 0 ? var0.aL[var7_6] : null);
            if (var8_8 == null) continue;
            B.a(var8_8, var0.aJ, 1007, 1 + var7_6, var0.bu * -1395083971, var0.bt * 1582464481);
        }
        var3_3 = bH.a(var0);
        var4_4 = var3_3 >> 11 & 63;
        var5_5 = var4_4 == 0 ? null : (var0.ak != null && var0.ak.trim().length() != 0 ? var0.ak : null);
        if (var5_5 != null) {
            B.a(var5_5, var0.aJ, 25, 0, var0.bu * -1395083971, var0.bt * 1582464481);
        }
        var3_3 = 4;
        do {
            if (var3_3 < 0) {
                var6_10 = bH.a(var0);
                if ((var6_10 & 1) == 0) return;
                v6 = 1;
                var8_7 = v6;
                if (var8_7 == 0) return;
                B.a(du.h, "", 30, 0, var0.bu * -1395083971, var0.bt * 1582464481);
                return;
            }
            var8_9 = dj.a(bH.a(var0), var3_3) == false && var0.bb == null ? null : (var0.aL != null && var0.aL.length > var3_3 && var0.aL[var3_3] != null && var0.aL[var3_3].trim().length() != 0 ? var0.aL[var3_3] : null);
            if (var8_9 != null) {
                B.a(var8_9, var0.aJ, 57, 1 + var3_3, var0.bu * -1395083971, var0.bt * 1582464481);
            }
            --var3_3;
        } while (true);
    }

    void a(cY cY2, int n2) {
        int n3;
        while ((n3 = cY2.d()) != 0) {
            this.a(cY2, n3, 9);
        }
        return;
    }

    void a(cY cY2, int n2, byte by2) {
        if (n2 == 2) {
            this.d = cY2.f() * 714845219;
        }
    }

    public static bv a(int n2) {
        bv bv2 = (bv)bv.d.a(n2);
        if (bv2 == null) {
            byte[] arrby = bv.a.b(8, n2);
            bv2 = new bv();
            bv2.m = n2;
            if (arrby != null) {
                bv2.a(new cY(arrby));
            }
            bv.d.a(bv2, n2);
            return bv2;
        }
        return bv2;
    }

    static {
        c = new n(64);
    }
}

