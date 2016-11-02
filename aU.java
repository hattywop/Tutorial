/*
 * Decompiled with CFR 0_118.
 */
public final class aU {
    static az a = new az();

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int a(byte[] arrby, int n2, byte[] arrby2, int n3, int n4) {
        az az2;
        az az3 = az2 = a;
        synchronized (az3) {
            aU.a.p = arrby2;
            aU.a.w = n4 * -1326152903;
            aU.a.k = arrby;
            aU.a.x = 0;
            aU.a.d = n2 * 1860233573;
            aU.a.i = 0;
            aU.a.h = 0;
            aU.a.o = 0;
            aU.a.e = 0;
            aU.e(a);
            aU.a.p = null;
            aU.a.k = null;
            return n2 -= aU.a.d * -1345314707;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static void a(az var0) {
        var1_1 = var0.f;
        var2_2 = var0.g * -2134742141;
        var3_3 = var0.b * -1485093569;
        var4_4 = var0.l * 1015964001;
        var5_5 = f.b;
        var6_6 = var0.m * -1489006633;
        var7_7 = var0.k;
        var8_8 = var0.x * 1074759737;
        var9_9 = var0.d * -1345314707;
        var10_10 = var0.a * -464409865 + 1;
        block0 : do {
            if (var2_2 <= 0) ** GOTO lbl27
            while (var9_9 != 0) {
                if (var2_2 == 1) {
                    if (var9_9 == 0) {
                        var2_2 = 1;
                        break block0;
                    }
                    var7_7[var8_8] = var1_1;
                    ++var8_8;
                    --var9_9;
                } else {
                    var7_7[var8_8] = var1_1;
                    --var2_2;
                    ++var8_8;
                    --var9_9;
                    continue;
                }
lbl27: // 2 sources:
                var11_11 = 1;
                while (var11_11 != 0) {
                    var11_11 = 0;
                    if (var3_3 == var10_10) {
                        var2_2 = 0;
                        break block0;
                    }
                    var1_1 = (byte)var4_4;
                    var6_6 = var5_5[var6_6];
                    var12_12 = (byte)(var6_6 & 255);
                    var6_6 >>= 8;
                    ++var3_3;
                    if (var12_12 != var4_4) {
                        var4_4 = var12_12;
                        if (var9_9 == 0) {
                            var2_2 = 1;
                            break block0;
                        }
                        var7_7[var8_8] = var1_1;
                        ++var8_8;
                        --var9_9;
                        var11_11 = 1;
                        continue;
                    }
                    if (var3_3 != var10_10) continue;
                    if (var9_9 == 0) {
                        var2_2 = 1;
                        break block0;
                    }
                    var7_7[var8_8] = var1_1;
                    ++var8_8;
                    --var9_9;
                    var11_11 = 1;
                }
                var2_2 = 2;
                var6_6 = var5_5[var6_6];
                var12_12 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                if (++var3_3 == var10_10) continue block0;
                if (var12_12 != var4_4) {
                    var4_4 = var12_12;
                    continue block0;
                }
                var2_2 = 3;
                var6_6 = var5_5[var6_6];
                var12_12 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                if (++var3_3 == var10_10) continue block0;
                if (var12_12 != var4_4) {
                    var4_4 = var12_12;
                    continue block0;
                }
                var6_6 = var5_5[var6_6];
                var12_12 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                ++var3_3;
                var2_2 = (var12_12 & 255) + 4;
                var6_6 = var5_5[var6_6];
                var4_4 = (byte)(var6_6 & 255);
                var6_6 >>= 8;
                ++var3_3;
                continue block0;
                continue block0;
            }
            break block0;
            break;
        } while (true);
        var11_11 = var0.e * 327807537;
        var0.e += (var9_9 - var9_9) * -540137775;
        if (var0.e * 327807537 < var11_11) {
            // empty if block
        }
        var0.f = var1_1;
        var0.g = var2_2 * -728728789;
        var0.b = var3_3 * 2090150591;
        var0.l = var4_4 * -1057881439;
        f.b = var5_5;
        var0.m = var6_6 * -1480469529;
        var0.k = var7_7;
        var0.x = var8_8 * 1771693577;
        var0.d = var9_9 * 1860233573;
    }

    static int a(int n2, az az2) {
        while (az2.i * -1763983995 < n2) {
            az2.h = (az2.h * 2043638395 << 8 | az2.p[az2.w * 1748204297] & 255) * 2140183731;
            az2.i -= 526017944;
            az2.w -= 1326152903;
            az2.o -= 1992926219;
            if (az2.o * 196556893 != 0) continue;
        }
        int n3 = az2.h * 2043638395 >> az2.i * -1763983995 - n2 & (1 << n2) - 1;
        az2.i -= n2 * 1007989581;
        return n3;
    }

    static void b(az az2) {
        az2.n = 0;
        for (int i2 = 0; i2 < 256; ++i2) {
            if (!az2.A[i2]) continue;
            az2.C[az2.n * -1627653711] = (byte)i2;
            az2.n -= 881414319;
        }
    }

    static void a(byte by2) {
    }

    static void a(int[] arrn, int[] arrn2, int[] arrn3, byte[] arrby, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = 0;
        for (n5 = n2; n5 <= n3; ++n5) {
            for (n6 = 0; n6 < n4; ++n6) {
                if (arrby[n6] != n5) continue;
                arrn3[n7] = n6;
                ++n7;
            }
        }
        for (n5 = 0; n5 < 23; ++n5) {
            arrn2[n5] = 0;
        }
        for (n5 = 0; n5 < n4; ++n5) {
            int[] arrn4 = arrn2;
            int n8 = arrby[n5] + 1;
            arrn4[n8] = arrn4[n8] + 1;
        }
        for (n5 = 1; n5 < 23; ++n5) {
            int[] arrn5 = arrn2;
            int n9 = n5;
            arrn5[n9] = arrn5[n9] + arrn2[n5 - 1];
        }
        for (n5 = 0; n5 < 23; ++n5) {
            arrn[n5] = 0;
        }
        n6 = 0;
        for (n5 = n2; n5 <= n3; ++n5) {
            arrn[n5] = (n6 += arrn2[n5 + 1] - arrn2[n5]) - 1;
            n6 <<= 1;
        }
        for (n5 = n2 + 1; n5 <= n3; ++n5) {
            arrn2[n5] = (arrn[n5 - 1] + 1 << 1) - arrn2[n5];
        }
    }

    static byte c(az az2) {
        return (byte)aU.a(8, az2);
    }

    static byte d(az az2) {
        return (byte)aU.a(1, az2);
    }

    static void e(az az2) {
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        boolean bl5 = false;
        boolean bl6 = false;
        boolean bl7 = false;
        boolean bl8 = false;
        boolean bl9 = false;
        boolean bl10 = false;
        boolean bl11 = false;
        boolean bl12 = false;
        boolean bl13 = false;
        boolean bl14 = false;
        boolean bl15 = false;
        boolean bl16 = false;
        boolean bl17 = false;
        boolean bl18 = false;
        boolean bl19 = false;
        int n2 = 0;
        int[] arrn = null;
        int[] arrn2 = null;
        int[] arrn3 = null;
        az2.c = 1300789993;
        if (f.b == null) {
            f.b = new int[az2.c * 1085533600];
        }
        boolean bl20 = true;
        while (bl20) {
            int n3;
            int n4;
            int n5;
            byte by2;
            int n6;
            int n7;
            byte by3;
            int n8;
            int n9;
            int n10;
            byte by4 = aU.c(az2);
            if (by4 == 23) {
                return;
            }
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.c(az2);
            by4 = aU.d(az2);
            if (by4 != 0) {
                // empty if block
            }
            az2.j = 0;
            by4 = aU.c(az2);
            az2.j = (az2.j * -523466351 << 8 | by4 & 255) * -2147002511;
            by4 = aU.c(az2);
            az2.j = (az2.j * -523466351 << 8 | by4 & 255) * -2147002511;
            by4 = aU.c(az2);
            az2.j = (az2.j * -523466351 << 8 | by4 & 255) * -2147002511;
            for (n6 = 0; n6 < 16; ++n6) {
                by4 = aU.d(az2);
                az2.B[n6] = by4 == 1;
            }
            for (n6 = 0; n6 < 256; ++n6) {
                az2.A[n6] = false;
            }
            for (n6 = 0; n6 < 16; ++n6) {
                if (!az2.B[n6]) continue;
                for (n8 = 0; n8 < 16; ++n8) {
                    by4 = aU.d(az2);
                    if (by4 != 1) continue;
                    az2.A[n6 * 16 + n8] = true;
                }
            }
            aU.b(az2);
            int n11 = az2.n * -1627653711 + 2;
            int n12 = aU.a(3, az2);
            int n13 = aU.a(15, az2);
            for (n6 = 0; n6 < n13; ++n6) {
                n8 = 0;
                do {
                    if ((by4 = aU.d(az2)) == 0) break;
                    ++n8;
                } while (true);
                az2.G[n6] = (byte)n8;
            }
            byte[] arrby = new byte[6];
            for (n4 = 0; n4 < n12; n4 = (int)((byte)(n4 + 1))) {
                int n14 = n4;
                int n15 = n4;
                arrby[n14] = n15;
            }
            for (n6 = 0; n6 < n13; ++n6) {
                n10 = arrby[n4];
                for (n4 = az2.G[n6]; n4 > 0; n4 = (int)((byte)(n4 - 1))) {
                    arrby[n4] = arrby[n4 - 1];
                }
                arrby[0] = n10;
                az2.F[n6] = n10;
            }
            for (n10 = 0; n10 < n12; ++n10) {
                n5 = aU.a(5, az2);
                for (n6 = 0; n6 < n11; ++n6) {
                    do {
                        if ((by4 = aU.d(az2)) == 0) break;
                        by4 = aU.d(az2);
                        if (by4 == 0) {
                            ++n5;
                            continue;
                        }
                        --n5;
                    } while (true);
                    az2.H[n10][n6] = (byte)n5;
                }
            }
            for (n10 = 0; n10 < n12; ++n10) {
                n5 = 32;
                n3 = 0;
                for (n6 = 0; n6 < n11; ++n6) {
                    if (az2.H[n10][n6] > n3) {
                        n3 = az2.H[n10][n6];
                    }
                    if (az2.H[n10][n6] >= n5) continue;
                    n5 = az2.H[n10][n6];
                }
                aU.a(az2.I[n10], az2.J[n10], az2.K[n10], az2.H[n10], n5, n3, n11);
                az2.L[n10] = n5;
            }
            n5 = az2.n * -1627653711 + 1;
            n3 = -1;
            int n16 = 0;
            for (n6 = 0; n6 <= 255; ++n6) {
                az2.y[n6] = 0;
            }
            int n17 = 4095;
            for (n7 = 15; n7 >= 0; --n7) {
                for (n9 = 15; n9 >= 0; --n9) {
                    az2.D[n17] = (byte)(n7 * 16 + n9);
                    --n17;
                }
                az2.E[n7] = n17 + 1;
            }
            int n18 = 0;
            if (n16 == 0) {
                n16 = 50;
                by3 = az2.F[++n3];
                n2 = az2.L[by3];
                arrn = az2.I[by3];
                arrn3 = az2.K[by3];
                arrn2 = az2.J[by3];
            }
            int n19 = n16 - 1;
            int n20 = n2;
            int n21 = aU.a(n2, az2);
            while (n21 > arrn[n20]) {
                ++n20;
                by2 = aU.d(az2);
                n21 = n21 << 1 | by2;
            }
            int n22 = arrn3[n21 - arrn2[n20]];
            while (n22 != n5) {
                int n23;
                int n24;
                int n25;
                if (n22 == 0 || n22 == 1) {
                    n23 = -1;
                    n25 = 1;
                    do {
                        if (n22 == 0) {
                            n23 += n25 * 1;
                        } else if (n22 == 1) {
                            n23 += n25 * 2;
                        }
                        n25 *= 2;
                        if (n19 == 0) {
                            n19 = 50;
                            by3 = az2.F[++n3];
                            n2 = az2.L[by3];
                            arrn = az2.I[by3];
                            arrn3 = az2.K[by3];
                            arrn2 = az2.J[by3];
                        }
                        --n19;
                        n20 = n2;
                        n21 = aU.a(n2, az2);
                        while (n21 > arrn[n20]) {
                            ++n20;
                            by2 = aU.d(az2);
                            n21 = n21 << 1 | by2;
                        }
                    } while ((n22 = arrn3[n21 - arrn2[n20]]) == 0 || n22 == 1);
                    by4 = az2.C[az2.D[az2.E[0]] & 255];
                    int[] arrn4 = az2.y;
                    int n26 = by4 & 255;
                    arrn4[n26] = arrn4[n26] + ++n23;
                    while (n23 > 0) {
                        f.b[n18] = by4 & 255;
                        ++n18;
                        --n23;
                    }
                    continue;
                }
                n23 = n22 - true;
                if (n23 < 16) {
                    n25 = az2.E[0];
                    by4 = az2.D[n25 + n23];
                    while (n23 > 3) {
                        n24 = n25 + n23;
                        az2.D[n24] = az2.D[n24 - 1];
                        az2.D[n24 - 1] = az2.D[n24 - 2];
                        az2.D[n24 - 2] = az2.D[n24 - 3];
                        az2.D[n24 - 3] = az2.D[n24 - 4];
                        n23 -= 4;
                    }
                    while (n23 > 0) {
                        az2.D[n25 + n23] = az2.D[n25 + n23 - 1];
                        --n23;
                    }
                    az2.D[n25] = by4;
                } else {
                    n24 = n23 / 16;
                    int n27 = n23 % 16;
                    by4 = az2.D[n25];
                    for (n25 = az2.E[n24] + n27; n25 > az2.E[n24]; --n25) {
                        az2.D[n25] = az2.D[n25 - 1];
                    }
                    int[] arrn5 = az2.E;
                    int n28 = n24;
                    arrn5[n28] = arrn5[n28] + 1;
                    while (n24 > 0) {
                        int[] arrn6 = az2.E;
                        int n29 = n24;
                        arrn6[n29] = arrn6[n29] - 1;
                        az2.D[az2.E[n24]] = az2.D[az2.E[n24 - 1] + 16 - 1];
                        --n24;
                    }
                    int[] arrn7 = az2.E;
                    arrn7[0] = arrn7[0] - 1;
                    az2.D[az2.E[0]] = by4;
                    if (az2.E[0] == 0) {
                        n17 = 4095;
                        for (n7 = 15; n7 >= 0; --n7) {
                            for (n9 = 15; n9 >= 0; --n9) {
                                az2.D[n17] = az2.D[az2.E[n7] + n9];
                                --n17;
                            }
                            az2.E[n7] = n17 + 1;
                        }
                    }
                }
                int[] arrn8 = az2.y;
                int n30 = az2.C[by4 & 255] & 255;
                arrn8[n30] = arrn8[n30] + 1;
                f.b[n18] = az2.C[by4 & 255] & 255;
                ++n18;
                if (n19 == 0) {
                    n19 = 50;
                    by3 = az2.F[++n3];
                    n2 = az2.L[by3];
                    arrn = az2.I[by3];
                    arrn3 = az2.K[by3];
                    arrn2 = az2.J[by3];
                }
                --n19;
                n20 = n2;
                n21 = aU.a(n2, az2);
                while (n21 > arrn[n20]) {
                    ++n20;
                    by2 = aU.d(az2);
                    n21 = n21 << 1 | by2;
                }
                n22 = arrn3[n21 - arrn2[n20]];
            }
            az2.g = 0;
            az2.f = 0;
            az2.z[0] = 0;
            for (n6 = 1; n6 <= 256; ++n6) {
                az2.z[n6] = az2.y[n6 - 1];
            }
            for (n6 = 1; n6 <= 256; ++n6) {
                int[] arrn9 = az2.z;
                int n31 = n6;
                arrn9[n31] = arrn9[n31] + az2.z[n6 - 1];
            }
            for (n6 = 0; n6 < n18; ++n6) {
                by4 = (byte)(f.b[n6] & 255);
                int[] arrn10 = f.b;
                int n32 = az2.z[by4 & 255];
                arrn10[n32] = arrn10[n32] | n6 << 8;
                int[] arrn11 = az2.z;
                int n33 = by4 & 255;
                arrn11[n33] = arrn11[n33] + 1;
            }
            az2.m = (f.b[az2.j * -523466351] >> 8) * -1480469529;
            az2.b = 0;
            az2.m = f.b[az2.m * -1489006633] * -1480469529;
            az2.l = (byte)(az2.m * -1489006633 & 255) * -1057881439;
            az2.m = (az2.m * -1489006633 >> 8) * -1480469529;
            az2.b += 2090150591;
            az2.a = n18 * 1479292615;
            aU.a(az2);
            if (az2.b * -1485093569 == az2.a * -464409865 + 1 && az2.g * -2134742141 == 0) {
                bl20 = true;
                continue;
            }
            bl20 = false;
        }
    }
}

