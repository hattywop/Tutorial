/*
 * Decompiled with CFR 0_118.
 */
public class bE {
    static int a;
    String b;
    static cC c;
    public static char d;
    static cZ e;
    String f;

    static cf a(a a2, int n2) {
        byte[] arrby = a2.f(n2, -1197108614);
        return arrby == null ? null : new cf(arrby);
    }

    static final void a(String string) {
        String string2;
        if (string != null && (string2 = aC.a(string, bH.O, -1903418053)) != null) {
            for (int i2 = 0; i2 < bH.eX * 601840989; ++i2) {
                bE bE2 = bH.eY[i2];
                String string3 = bE2.f;
                String string4 = aC.a(string3, bH.O, -1713077817);
                boolean bl2 = string != null && string3 != null ? (!string.startsWith("#") && !string3.startsWith("#") ? string2.equals(string4) : string.equals(string3)) : false;
                if (!bl2) continue;
                for (int i3 = i2; i3 < (bH.eX -= 1879695093) * 601840989; ++i3) {
                    bH.eY[i3] = bH.eY[1 + i3];
                }
                bH.dy = bH.dq * 1609802529;
                bH.aF.a(59);
                bH.aF.d(du.a(string));
                bH.aF.a(string);
                break;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static final void a(t var0) {
        if (var0.h * 1613108255 <= bH.S * 1026470457) ** GOTO lbl4
        aI.a(var0, -435303136);
        ** GOTO lbl99
lbl4: // 1 sources:
        if (var0.g * 468464431 < bH.S * 1026470457) ** GOTO lbl7
        S.a(var0);
        ** GOTO lbl99
lbl7: // 1 sources:
        var0.T = var0.z * 705547907;
        if (var0.s * -1429276161 != 0) ** GOTO lbl11
        var0.u = 0;
        ** GOTO lbl99
lbl11: // 1 sources:
        if (var0.r * 1287875615 == -1 || var0.Y * -82959261 != 0) ** GOTO lbl-1000
        var1_1 = c.b(var0.r * 1287875615);
        if (var0.t * -2051913933 > 0 && var1_1.d * -1239714469 == 0) {
            var0.u -= 1597115245;
        } else if (var0.t * -2051913933 <= 0 && var1_1.e * 1962873195 == 0) {
            var0.u -= 1597115245;
        } else lbl-1000: // 2 sources:
        {
            var1_2 = var0.v * -1051150961;
            var2_3 = var0.w * -844883935;
            var3_4 = var0.ah[var0.s * -1429276161 - 1] * 128 + var0.y * -1408204480;
            var4_5 = var0.ai[var0.s * -1429276161 - 1] * 128 + var0.y * -1408204480;
            if (var3_4 - var1_2 <= 256 && var3_4 - var1_2 >= -256 && var4_5 - var2_3 <= 256 && var4_5 - var2_3 >= -256) {
                if (var1_2 < var3_4) {
                    var0.b = var2_3 < var4_5 ? -1467472128 : (var2_3 > var4_5 ? -1195467520 : 816013824);
                } else if (var1_2 > var3_4) {
                    var0.b = var2_3 < var4_5 ? -1739476736 : (var2_3 > var4_5 ? -2011481344 : 272004608);
                } else if (var2_3 < var4_5) {
                    var0.b = 544009216;
                } else if (var2_3 > var4_5) {
                    var0.b = 0;
                }
                var5_6 = var0.b * -1099823629 - var0.a * 1933495885 & 2047;
                if (var5_6 > 1024) {
                    var5_6 -= 2048;
                }
                var6_7 = var0.D * -1106791307;
                if (var5_6 >= -256 && var5_6 <= 256) {
                    var6_7 = var0.C * -1173314451;
                } else if (var5_6 >= 256 && var5_6 < 768) {
                    var6_7 = var0.F * 132389503;
                } else if (var5_6 >= -768 && var5_6 <= -256) {
                    var6_7 = var0.E * 991276803;
                }
                if (var6_7 == -1) {
                    var6_7 = var0.C * -1173314451;
                }
                var0.T = var6_7 * -304340693;
                var7_8 = 4;
                var8_9 = true;
                if (!(var0 instanceof cG) || (var8_9 = ((cG)var0).aq.E)) {
                    if (var0.b * -1099823629 != var0.a * 1933495885 && var0.Q * 1253370921 == -1 && var0.ag * -1936020065 != 0) {
                        var7_8 = 2;
                    }
                    if (var0.s * -1429276161 > 2) {
                        var7_8 = 6;
                    }
                    if (var0.s * -1429276161 > 3) {
                        var7_8 = 8;
                    }
                    if (var0.u * -1785378405 > 0 && var0.s * -1429276161 > 1) {
                        var7_8 = 8;
                        var0.u += 1597115245;
                    }
                } else {
                    if (var0.s * -1429276161 > 1) {
                        var7_8 = 6;
                    }
                    if (var0.s * -1429276161 > 2) {
                        var7_8 = 8;
                    }
                    if (var0.u * -1785378405 > 0 && var0.s * -1429276161 > 1) {
                        var7_8 = 8;
                        var0.u += 1597115245;
                    }
                }
                if (var0.aj[var0.s * -1429276161 - 1]) {
                    var7_8 <<= 1;
                }
                if (var7_8 >= 8 && var0.T * -1834510973 == var0.C * -1173314451 && var0.G * 16372225 != -1) {
                    var0.T = var0.G * -1008441557;
                }
                if (var1_2 < var3_4) {
                    var0.v += var7_8 * 373606767;
                    if (var0.v * -1051150961 > var3_4) {
                        var0.v = var3_4 * 373606767;
                    }
                } else if (var1_2 > var3_4) {
                    var0.v -= var7_8 * 373606767;
                    if (var0.v * -1051150961 < var3_4) {
                        var0.v = var3_4 * 373606767;
                    }
                }
                if (var2_3 < var4_5) {
                    var0.w += var7_8 * -1030657055;
                    if (var0.w * -844883935 > var4_5) {
                        var0.w = var4_5 * -1030657055;
                    }
                } else if (var2_3 > var4_5) {
                    var0.w -= var7_8 * -1030657055;
                    if (var0.w * -844883935 < var4_5) {
                        var0.w = var4_5 * -1030657055;
                    }
                }
                if (var0.v * -1051150961 == var3_4 && var0.w * -844883935 == var4_5) {
                    var0.s += 519240193;
                    if (var0.t * -2051913933 > 0) {
                        var0.t -= 1984367611;
                    }
                }
            } else {
                var0.v = var3_4 * 373606767;
                var0.w = var4_5 * -1030657055;
            }
        }
lbl99: // 7 sources:
        if (var0.v * -1051150961 < 128 || var0.w * -844883935 < 128 || var0.v * -1051150961 >= 13184 || var0.w * -844883935 >= 13184) {
            var0.r = -1940983775;
            var0.aa = -1325550547;
            var0.h = 0;
            var0.g = 0;
            var0.v = var0.ah[0] * 577025920 + var0.y * 1705200320;
            var0.w = var0.y * -708355776 + var0.ai[0] * 1219883136;
            var0.a();
        }
        if (var0 == cP.ar && (var0.v * -1051150961 < 1536 || var0.w * -844883935 < 1536 || var0.v * -1051150961 >= 11776 || var0.w * -844883935 >= 11776)) {
            var0.r = -1940983775;
            var0.aa = -1325550547;
            var0.h = 0;
            var0.g = 0;
            var0.v = var0.ah[0] * 577025920 + var0.y * 1705200320;
            var0.w = var0.ai[0] * 1219883136 + var0.y * -708355776;
            var0.a();
        }
        cO.a(var0);
        E.a(var0);
    }
}

