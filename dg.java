/*
 * Decompiled with CFR 0_118.
 */
public class dg {
    static int a;
    static int b;
    static p c;
    static int[] d;
    static int[] e;
    static int f;

    static final void a(aD aD2, df[] arrdf, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        for (n6 = 0; n6 < 4; ++n6) {
            for (n10 = 0; n10 < 104; ++n10) {
                for (n12 = 0; n12 < 104; ++n12) {
                    if ((ax.i[n6][n10][n12] & 1) != 1) continue;
                    n3 = n6;
                    if ((ax.i[1][n10][n12] & 2) == 2) {
                        n3 = n6 - 1;
                    }
                    if (n3 < 0) continue;
                    arrdf[n3].a(n10, n12, -565099536);
                }
            }
        }
        if ((ax.q += ((int)(Math.random() * 5.0) - 2) * 1624995311) * -283354865 < -8) {
            ax.q = -115060600;
        }
        if (ax.q * -283354865 > 8) {
            ax.q = 115060600;
        }
        if ((ax.r += ((int)(Math.random() * 5.0) - 2) * -1659611771) * -2025039027 < -16) {
            ax.r = 783984560;
        }
        if (ax.r * -2025039027 > 16) {
            ax.r = -783984560;
        }
        for (n6 = 0; n6 < 4; ++n6) {
            byte[][] arrby = ax.b[n6];
            n14 = (int)Math.sqrt(5100.0);
            n16 = n14 * 768 >> 8;
            for (n8 = 1; n8 < 103; ++n8) {
                for (n15 = 1; n15 < 103; ++n15) {
                    n18 = ax.h[n6][n15 + 1][n8] - ax.h[n6][n15 - 1][n8];
                    n11 = ax.h[n6][n15][n8 + 1] - ax.h[n6][n15][n8 - 1];
                    n9 = (int)Math.sqrt(n18 * n18 + 65536 + n11 * n11);
                    n4 = (n18 << 8) / n9;
                    n5 = 65536 / n9;
                    n17 = (n11 << 8) / n9;
                    n13 = (n17 * -50 + n5 * -10 + n4 * -50) / n16 + 96;
                    n7 = (arrby[n15][n8 - 1] >> 2) + (arrby[n15 - 1][n8] >> 2) + (arrby[n15 + 1][n8] >> 3) + (arrby[n15][n8 + 1] >> 3) + (arrby[n15][n8] >> 1);
                    ax.c[n15][n8] = n13 - n7;
                }
            }
            for (n8 = 0; n8 < 104; ++n8) {
                bU.a[n8] = 0;
                ax.e[n8] = 0;
                ax.d[n8] = 0;
                bd.b[n8] = 0;
                bv.b[n8] = 0;
            }
            for (n8 = -5; n8 < 109; ++n8) {
                for (n15 = 0; n15 < 104; ++n15) {
                    dz dz2;
                    n18 = n8 + 5;
                    if (n18 >= 0 && n18 < 104 && (n19 = ax.f[n6][n18][n15] & 255) > 0) {
                        dz2 = bT.b(n19 - 1);
                        int[] arrn = bU.a;
                        int n20 = n15;
                        arrn[n20] = arrn[n20] + dz2.h * 244099387;
                        int[] arrn2 = ax.e;
                        int n21 = n15;
                        arrn2[n21] = arrn2[n21] + dz2.e * 625515891;
                        int[] arrn3 = ax.d;
                        int n22 = n15;
                        arrn3[n22] = arrn3[n22] + dz2.f * 983176725;
                        int[] arrn4 = bd.b;
                        int n23 = n15;
                        arrn4[n23] = arrn4[n23] + dz2.g * 496779365;
                        int[] arrn5 = bv.b;
                        int n24 = n15;
                        arrn5[n24] = arrn5[n24] + 1;
                    }
                    if ((n11 = n8 - 5) < 0 || n11 >= 104 || (n19 = ax.f[n6][n11][n15] & 255) <= 0) continue;
                    dz2 = bT.b(n19 - 1);
                    int[] arrn = bU.a;
                    int n25 = n15;
                    arrn[n25] = arrn[n25] - dz2.h * 244099387;
                    int[] arrn6 = ax.e;
                    int n26 = n15;
                    arrn6[n26] = arrn6[n26] - dz2.e * 625515891;
                    int[] arrn7 = ax.d;
                    int n27 = n15;
                    arrn7[n27] = arrn7[n27] - dz2.f * 983176725;
                    int[] arrn8 = bd.b;
                    int n28 = n15;
                    arrn8[n28] = arrn8[n28] - dz2.g * 496779365;
                    int[] arrn9 = bv.b;
                    int n29 = n15;
                    arrn9[n29] = arrn9[n29] - 1;
                }
                if (n8 < 1 || n8 >= 103) continue;
                n15 = 0;
                n18 = 0;
                n11 = 0;
                n9 = 0;
                n4 = 0;
                for (n5 = -5; n5 < 109; ++n5) {
                    int n30;
                    int n31;
                    int n32;
                    byte[] arrby2;
                    c c2;
                    int n33;
                    byte by2;
                    int n34;
                    c c3;
                    int n35;
                    int n36;
                    n17 = 5 + n5;
                    if (n17 >= 0 && n17 < 104) {
                        n15 += bU.a[n17];
                        n18 += ax.e[n17];
                        n11 += ax.d[n17];
                        n9 += bd.b[n17];
                        n4 += bv.b[n17];
                    }
                    if ((n13 = n5 - 5) >= 0 && n13 < 104) {
                        n15 -= bU.a[n13];
                        n18 -= ax.e[n13];
                        n11 -= ax.d[n13];
                        n9 -= bd.b[n13];
                        n4 -= bv.b[n13];
                    }
                    if (n5 < 1 || n5 >= 103 || bH.ae && (ax.i[0][n8][n5] & 2) == 0 && ((ax.i[n6][n8][n5] & 16) != 0 || B.a(n6, n8, n5) != bH.aR * 1286856103)) continue;
                    if (n6 < ax.j * 2066106645) {
                        ax.j = n6 * -1445478851;
                    }
                    n19 = ax.f[n6][n8][n5] & 255;
                    int n37 = ax.a[n6][n8][n5] & 255;
                    if (n19 <= 0 && n37 <= 0) continue;
                    int n38 = ax.h[n6][n8][n5];
                    int n39 = ax.h[n6][n8 + 1][n5];
                    int n40 = ax.h[n6][1 + n8][1 + n5];
                    int n41 = ax.h[n6][n8][n5 + 1];
                    int n42 = ax.c[n8][n5];
                    int n43 = ax.c[1 + n8][n5];
                    int n44 = ax.c[n8 + 1][n5 + 1];
                    int n45 = ax.c[n8][1 + n5];
                    int n46 = -1;
                    int n47 = -1;
                    if (n19 > 0) {
                        n30 = n15 * 256 / n9;
                        n36 = n18 / n4;
                        int n48 = n11 / n4;
                        n46 = bH.c(n30, n36, n48, 2113124323);
                        n30 = ax.q * -283354865 + n30 & 255;
                        if ((n48 += ax.r * -2025039027) < 0) {
                            n48 = 0;
                        } else if (n48 > 255) {
                            n48 = 255;
                        }
                        n47 = bH.c(n30, n36, n48, 1874514574);
                    }
                    if (n6 > 0) {
                        by2 = 1;
                        if (n19 == 0 && aA.a[n6][n8][n5] != 0) {
                            by2 = 0;
                        }
                        if (n37 > 0) {
                            n32 = n37 - 1;
                            c3 = (c)c.j.a(n32);
                            if (c3 != null) {
                                c2 = c3;
                            } else {
                                arrby2 = c.a.b(4, n32);
                                c3 = new c();
                                if (arrby2 != null) {
                                    c3.a(new cY(arrby2), n32, 172561201);
                                }
                                c3.a(2026077536);
                                c.j.a(c3, n32);
                                c2 = c3;
                            }
                            if (!c2.m) {
                                by2 = 0;
                            }
                        }
                        if (by2 != 0 && n38 == n39 && n38 == n40 && n41 == n38) {
                            int[] arrn = dy.a[n6][n8];
                            int n49 = n5;
                            arrn[n49] = arrn[n49] | 2340;
                        }
                    }
                    n30 = 0;
                    if (n47 != -1) {
                        n30 = de.q[cL.a(n47, 96, -42)];
                    }
                    if (n37 == 0) {
                        aD2.a(n6, n8, n5, 0, 0, -1, n38, n39, n40, n41, cL.a(n46, n42, -70), cL.a(n46, n43, -64), cL.a(n46, n44, -126), cL.a(n46, n45, -49), 0, 0, 0, 0, n30, 0);
                        continue;
                    }
                    n36 = 1 + aA.a[n6][n8][n5];
                    by2 = g.a[n6][n8][n5];
                    n32 = n37 - 1;
                    c2 = (c)c.j.a(n32);
                    if (c2 != null) {
                        c3 = c2;
                    } else {
                        arrby2 = c.a.b(4, n32);
                        c2 = new c();
                        if (arrby2 != null) {
                            c2.a(new cY(arrby2), n32, -588862085);
                        }
                        c2.a(1358365794);
                        c.j.a(c2, n32);
                        c3 = c2;
                    }
                    int n50 = c3.l * 886010969;
                    if (n50 >= 0) {
                        n35 = de.j.b(n50, -1469500798);
                        n31 = -1;
                    } else if (c3.k * -1819361419 == 16711935) {
                        n31 = -2;
                        n50 = -1;
                        n35 = -2;
                    } else {
                        n31 = bH.c(c3.g * 1355235691, c3.h * 1145219457, c3.i * -1337519989, 2029747383);
                        n33 = ax.q * -283354865 + c3.g * 1355235691 & 255;
                        n34 = c3.i * -1337519989 + ax.r * -2025039027;
                        if (n34 < 0) {
                            n34 = 0;
                        } else if (n34 > 255) {
                            n34 = 255;
                        }
                        n35 = bH.c(n33, c3.h * 1145219457, n34, 2039529248);
                    }
                    n33 = 0;
                    if (n35 != -2) {
                        n33 = de.q[aH.a(n35, 96, 69)];
                    }
                    if (c3.n * -978801057 != -1) {
                        n34 = c3.o * -261851353 + ax.q * -283354865 & 255;
                        int n51 = ax.r * -2025039027 + c3.q * -496357951;
                        if (n51 < 0) {
                            n51 = 0;
                        } else if (n51 > 255) {
                            n51 = 255;
                        }
                        n35 = bH.c(n34, c3.p * 108950157, n51, 1893954894);
                        n33 = de.q[aH.a(n35, 96, -16)];
                    }
                    aD2.a(n6, n8, n5, n36, by2, n50, n38, n39, n40, n41, cL.a(n46, n42, -16), cL.a(n46, n43, -87), cL.a(n46, n44, -91), cL.a(n46, n45, -117), aH.a(n31, n42, -24), aH.a(n31, n43, -107), aH.a(n31, n44, 73), aH.a(n31, n45, 10), n30, n33);
                }
            }
            for (n8 = 1; n8 < 103; ++n8) {
                for (n15 = 1; n15 < 103; ++n15) {
                    aD2.e(n6, n15, n8, B.a(n6, n15, n8));
                }
            }
            ax.f[n6] = null;
            ax.a[n6] = null;
            aA.a[n6] = null;
            g.a[n6] = null;
            ax.b[n6] = null;
        }
        aD2.j(-50, -10, -50);
        for (n6 = 0; n6 < 104; ++n6) {
            for (n10 = 0; n10 < 104; ++n10) {
                if ((ax.i[1][n6][n10] & 2) != 2) continue;
                aD2.a(n6, n10);
            }
        }
        n6 = 1;
        n10 = 2;
        n12 = 4;
        for (n3 = 0; n3 < 4; ++n3) {
            if (n3 > 0) {
                n6 <<= 3;
                n10 <<= 3;
                n12 <<= 3;
            }
            for (int i2 = 0; i2 <= n3; ++i2) {
                for (n7 = 0; n7 <= 104; ++n7) {
                    for (n13 = 0; n13 <= 104; ++n13) {
                        if ((dy.a[i2][n13][n7] & n6) != 0) {
                            n16 = n7;
                            n8 = i2;
                            n15 = i2;
                            for (n14 = n7; n14 > 0 && (dy.a[i2][n13][n14 - 1] & n6) != 0; --n14) {
                            }
                            while (n16 < 104 && (dy.a[i2][n13][n16 + 1] & n6) != 0) {
                                ++n16;
                            }
                            block20 : while (n8 > 0) {
                                for (n18 = n14; n18 <= n16; ++n18) {
                                    if ((dy.a[n8 - 1][n13][n18] & n6) == 0) break block20;
                                }
                                --n8;
                            }
                            block22 : while (n15 < n3) {
                                for (n18 = n14; n18 <= n16; ++n18) {
                                    if ((dy.a[n15 + 1][n13][n18] & n6) == 0) break block22;
                                }
                                ++n15;
                            }
                            if ((n18 = (1 + (n16 - n14)) * (1 + n15 - n8)) >= 8) {
                                n19 = 240;
                                n9 = ax.h[n15][n13][n14] - n19;
                                n4 = ax.h[n8][n13][n14];
                                aD.b(n3, 1, n13 * 128, n13 * 128, n14 * 128, 128 + n16 * 128, n9, n4);
                                for (n5 = n8; n5 <= n15; ++n5) {
                                    n17 = n14;
                                    while (n17 <= n16) {
                                        int[] arrn = dy.a[n5][n13];
                                        int n52 = n17++;
                                        arrn[n52] = arrn[n52] & ~ n6;
                                    }
                                }
                            }
                        }
                        if ((dy.a[i2][n13][n7] & n10) != 0) {
                            n16 = n13;
                            n8 = i2;
                            n15 = i2;
                            for (n14 = n13; n14 > 0 && (dy.a[i2][n14 - 1][n7] & n10) != 0; --n14) {
                            }
                            while (n16 < 104 && (dy.a[i2][n16 + 1][n7] & n10) != 0) {
                                ++n16;
                            }
                            block28 : while (n8 > 0) {
                                for (n18 = n14; n18 <= n16; ++n18) {
                                    if ((dy.a[n8 - 1][n18][n7] & n10) == 0) break block28;
                                }
                                --n8;
                            }
                            block30 : while (n15 < n3) {
                                for (n18 = n14; n18 <= n16; ++n18) {
                                    if ((dy.a[1 + n15][n18][n7] & n10) == 0) break block30;
                                }
                                ++n15;
                            }
                            if ((n18 = (1 + (n16 - n14)) * (1 + n15 - n8)) >= 8) {
                                n19 = 240;
                                n9 = ax.h[n15][n14][n7] - n19;
                                n4 = ax.h[n8][n14][n7];
                                aD.b(n3, 2, n14 * 128, n16 * 128 + 128, n7 * 128, n7 * 128, n9, n4);
                                for (n5 = n8; n5 <= n15; ++n5) {
                                    for (n17 = n14; n17 <= n16; ++n17) {
                                        int[] arrn = dy.a[n5][n17];
                                        int n53 = n7;
                                        arrn[n53] = arrn[n53] & ~ n10;
                                    }
                                }
                            }
                        }
                        if ((dy.a[i2][n13][n7] & n12) == 0) continue;
                        n14 = n13;
                        n16 = n13;
                        n15 = n7;
                        for (n8 = n7; n8 > 0 && (dy.a[i2][n13][n8 - 1] & n12) != 0; --n8) {
                        }
                        while (n15 < 104 && (dy.a[i2][n13][n15 + 1] & n12) != 0) {
                            ++n15;
                        }
                        block36 : while (n14 > 0) {
                            for (n18 = n8; n18 <= n15; ++n18) {
                                if ((dy.a[i2][n14 - 1][n18] & n12) == 0) break block36;
                            }
                            --n14;
                        }
                        block38 : while (n16 < 104) {
                            for (n18 = n8; n18 <= n15; ++n18) {
                                if ((dy.a[i2][n16 + 1][n18] & n12) == 0) break block38;
                            }
                            ++n16;
                        }
                        if ((n15 - n8 + 1) * (n16 - n14 + 1) < 4) continue;
                        n18 = ax.h[i2][n14][n8];
                        aD.b(n3, 4, n14 * 128, n16 * 128 + 128, n8 * 128, n15 * 128 + 128, n18, n18);
                        for (n11 = n14; n11 <= n16; ++n11) {
                            n9 = n8;
                            while (n9 <= n15) {
                                int[] arrn = dy.a[i2][n11];
                                int n54 = n9++;
                                arrn[n54] = arrn[n54] & ~ n12;
                            }
                        }
                    }
                }
            }
        }
    }

    static final void a(aE aE2, int n2) {
        if (cP.ar.v * -1051150961 >> 7 == bH.em * -1846442735 && cP.ar.w * -844883935 >> 7 == bH.en * -1524315751) {
            bH.em = 0;
        }
        int n3 = bH.cc * -796710281;
        if (aE2 == aE.b || aE.c == aE2) {
            n3 = 1;
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            cP cP2;
            int n4;
            if (aE.b == aE2) {
                cP2 = cP.ar;
                n4 = 33538048;
            } else if (aE2 == aE.c) {
                cP2 = bH.cb[bH.cp * -208567815];
                n4 = bH.cp * -208567815 << 14;
            } else {
                cP2 = bH.cb[bH.cd[i2]];
                n4 = bH.cd[i2] << 14;
                if (aE2 == aE.e && bH.cd[i2] == bH.cp * -208567815) continue;
            }
            if (cP2 == null || !cP2.a_(-1231433691) || cP2.aI) continue;
            cP2.aM = false;
            if ((bH.ae && bH.cc * -796710281 > 50 || bH.cc * -796710281 > 200) && aE.b != aE2 && cP2.T * -1834510973 == cP2.z * -71832567) {
                cP2.aM = true;
            }
            int n5 = cP2.v * -1051150961 >> 7;
            int n6 = cP2.w * -844883935 >> 7;
            if (n5 < 0 || n5 >= 104 || n6 < 0 || n6 >= 104) continue;
            if (cP2.aB != null && bH.S * 1026470457 >= cP2.aK * -106872329 && bH.S * 1026470457 < cP2.aL * -1632611687) {
                cP2.aM = false;
                cP2.aq = c.a(cP2.v * -1051150961, cP2.w * -844883935, u.d * -1093536619, -1847964236) * 1927276675;
                cr.m.a(u.d * -1093536619, cP2.v * -1051150961, cP2.w * -844883935, cP2.aq * 901097003, 60, (dh)cP2, cP2.a * 1933495885, n4, cP2.ap * 1919165871, cP2.ax * 993969261, cP2.aw * -962033859, cP2.au * 1521604999);
                continue;
            }
            if ((cP2.v * -1051150961 & 127) == 64 && (cP2.w * -844883935 & 127) == 64) {
                if (bH.bK[n5][n6] == bH.bL * -246782549) continue;
                bH.bK[n5][n6] = bH.bL * -246782549;
            }
            cP2.aq = c.a(cP2.v * -1051150961, cP2.w * -844883935, u.d * -1093536619, -1847964236) * 1927276675;
            cr.m.a(u.d * -1093536619, cP2.v * -1051150961, cP2.w * -844883935, cP2.aq * 901097003, 60, cP2, cP2.a * 1933495885, n4, cP2.x);
        }
    }
}

