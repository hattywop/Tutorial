/*
 * Decompiled with CFR 0_118.
 */
public class I {
    static cX a;
    static cX b;
    static cX c;
    static cX d;
    static cX e;
    static cX f;
    static cX g;
    public static int[] h;
    public static int[] i;
    public static int[] j;
    public static int k;

    static final void a(cZ[] arrcZ, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        dd.g(n3, n4, n5, n6);
        de.a();
        for (int i2 = 0; i2 < arrcZ.length; ++i2) {
            Object object3;
            int n13;
            int n27;
            int n12;
            int n22;
            int n19;
            int n15;
            Object object2;
            int n28;
            Object object6;
            int n21;
            Object object;
            int n25;
            Object object5;
            int n11;
            int n24;
            int n14;
            int n29;
            int n26;
            int n23;
            Object object4;
            int n30;
            int n18;
            int n17;
            int n16;
            int n20;
            cZ cZ2 = arrcZ[i2];
            if (cZ2 == null || n2 != cZ2.A * -1588791493 && (n2 != -1412584499 || cZ2 != bH.de)) continue;
            if (n9 == -1) {
                bH.dO[bH.dJ * -2099955589] = n7 + cZ2.bv * -18591297;
                bH.dP[bH.dJ * -2099955589] = cZ2.bw * -591061715 + n8;
                bH.dQ[bH.dJ * -2099955589] = cZ2.bx * 2096072399;
                bH.dR[bH.dJ * -2099955589] = cZ2.by * 539675235;
                n11 = (bH.dJ += 1544677043) * -2099955589 - 1;
            } else {
                n11 = n9;
            }
            cZ2.bQ = n11 * -1906039751;
            cZ2.bR = bH.S * 1240692497;
            if (cZ2.r && dn.a(cZ2, -84)) continue;
            if (cZ2.u * -202095703 > 0) {
                n23 = cZ2.u * -202095703;
                if (n23 == 324) {
                    if (bH.fa * -1127175711 == -1) {
                        bH.fa = cZ2.ac * -732631169;
                        bH.fb = cZ2.ad * 256982125;
                    }
                    cZ2.ac = bH.eZ.c ? bH.fa * -608513921 : bH.fb * 1328542583;
                } else if (n23 == 325) {
                    if (bH.fa * -1127175711 == -1) {
                        bH.fa = cZ2.ac * -732631169;
                        bH.fb = cZ2.ad * 256982125;
                    }
                    cZ2.ac = bH.eZ.c ? bH.fb * 1328542583 : bH.fa * -608513921;
                } else if (n23 == 327) {
                    cZ2.aq = -993583822;
                    cZ2.ar = ((int)(Math.sin((double)(bH.S * 1026470457) / 40.0) * 256.0) & 2047) * 1932084251;
                    cZ2.ae = 1497266741;
                    cZ2.af = 0;
                } else if (n23 == 328) {
                    cZ2.aq = -993583822;
                    cZ2.ar = ((int)(Math.sin((double)(bH.S * 1026470457) / 40.0) * 256.0) & 2047) * 1932084251;
                    cZ2.ae = 1497266741;
                    cZ2.af = 999821601;
                }
            }
            n23 = cZ2.bv * -18591297 + n7;
            int n31 = cZ2.bw * -591061715 + n8;
            int n32 = cZ2.z * -745264641;
            if (bH.de == cZ2) {
                if (n2 != -1412584499 && !cZ2.aR) {
                    aC.a = arrcZ;
                    cr.i = n7 * 1172528277;
                    an.b = n8 * -1428012323;
                    continue;
                }
                if (bH.dp && bH.dj) {
                    n25 = cD.l * -1031552075;
                    n21 = cD.m * 1941423145;
                    n21 -= bH.dh * -1974758323;
                    if ((n25 -= bH.dg * 493969285) < bH.dk * 456811279) {
                        n25 = bH.dk * 456811279;
                    }
                    if (cZ2.bx * 2096072399 + n25 > bH.dk * 456811279 + bH.df.bx * 2096072399) {
                        n25 = bH.dk * 456811279 + bH.df.bx * 2096072399 - cZ2.bx * 2096072399;
                    }
                    if (n21 < bH.dl * -1802796197) {
                        n21 = bH.dl * -1802796197;
                    }
                    if (cZ2.by * 539675235 + n21 > bH.dl * -1802796197 + bH.df.by * 539675235) {
                        n21 = bH.df.by * 539675235 + bH.dl * -1802796197 - cZ2.by * 539675235;
                    }
                    n23 = n25;
                    n31 = n21;
                }
                if (!cZ2.aR) {
                    n32 = 128;
                }
            }
            if (cZ2.s * -1878336627 == 2) {
                n25 = n3;
                n21 = n4;
                n19 = n5;
                n22 = n6;
            } else if (cZ2.s * -1878336627 == 9) {
                n30 = n23;
                n27 = n31;
                n14 = n23 + cZ2.bx * 2096072399;
                n15 = cZ2.by * 539675235 + n31;
                if (n14 < n23) {
                    n30 = n14;
                    n14 = n23;
                }
                if (n15 < n31) {
                    n27 = n15;
                    n15 = n31;
                }
                n25 = n30 > n3 ? n30 : n3;
                n21 = n27 > n4 ? n27 : n4;
                n19 = n14 < n5 ? ++n14 : n5;
                n22 = n15 < n6 ? ++n15 : n6;
            } else {
                n30 = n23 + cZ2.bx * 2096072399;
                n27 = cZ2.by * 539675235 + n31;
                n25 = n23 > n3 ? n23 : n3;
                n21 = n31 > n4 ? n31 : n4;
                n19 = n30 < n5 ? n30 : n5;
                int n33 = n22 = n27 < n6 ? n27 : n6;
            }
            if (cZ2.r && (n25 >= n19 || n21 >= n22)) continue;
            if (cZ2.u * -202095703 != 0) {
                Object object7;
                int n35;
                int n34;
                int n36;
                boolean bl2;
                if (cZ2.u * -202095703 == 1336) {
                    if (!bH.P) continue;
                    bQ.a.b("Fps:" + bH.k * -1026684785, cZ2.bx * 2096072399 + n23, n31 += 15, 16776960, -1);
                    n31 += 15;
                    object = Runtime.getRuntime();
                    n27 = (int)((object.totalMemory() - object.freeMemory()) / 1024);
                    n14 = 16776960;
                    if (n27 > 32768 && bH.ae) {
                        n14 = 16711680;
                    }
                    if (n27 > 65536 && !bH.ae) {
                        n14 = 16711680;
                    }
                    bQ.a.b("Mem:" + n27 + "k", cZ2.bx * 2096072399 + n23, n31, n14, -1);
                    bQ.a.b("Tick:" + bH.y, cZ2.bx * 2096072399 + n23, n31 += 15, n14, -1);
                    n31 += 15;
                    continue;
                }
                if (cZ2.u * -202095703 == 1337) {
                    bH.cG = n23 * -276627093;
                    bH.cH = n31 * -1244965977;
                    n14 = cZ2.bx * 2096072399;
                    n15 = cZ2.by * 539675235;
                    bH.bL += 126184707;
                    dg.a(aE.b, 97326121);
                    boolean bl3 = false;
                    if (bH.cp * -208567815 >= 0) {
                        for (n16 = 0; n16 < bH.cc * -796710281; ++n16) {
                            if (bH.cp * -208567815 != bH.cd[n16]) continue;
                            bl3 = true;
                            break;
                        }
                    }
                    if (bl3) {
                        dg.a(aE.c, 97326121);
                    }
                    bH.a(true);
                    dg.a(bl3 ? aE.e : aE.d, 97326121);
                    bH.a(false);
                    object3 = (v)bH.cs.g();
                    while (object3 != null) {
                        if (object3.n * -435574017 == u.d * -1093536619 && bH.S * 1026470457 <= object3.s * -588609769) {
                            if (bH.S * 1026470457 >= object3.r * -122170489) {
                                if (object3.v * 1237058141 > 0 && (object6 = bH.aC[object3.v * 1237058141 - 1]) != null && object6.v * -1051150961 >= 0 && object6.v * -1051150961 < 13312 && object6.w * -844883935 >= 0 && object6.w * -844883935 < 13312) {
                                    object3.a(object6.v * -1051150961, object6.w * -844883935, c.a(object6.v * -1051150961, object6.w * -844883935, object3.n * -435574017, -1847964236) - object3.w * 585463173, bH.S * 1026470457, -198864424);
                                }
                                if (object3.v * 1237058141 < 0) {
                                    n24 = - object3.v * 1237058141 - 1;
                                    object6 = n24 == bH.ch * -1731449945 ? cP.ar : bH.cb[n24];
                                    if (object6 != null && object6.v * -1051150961 >= 0 && object6.v * -1051150961 < 13312 && object6.w * -844883935 >= 0 && object6.w * -844883935 < 13312) {
                                        object3.a(object6.v * -1051150961, object6.w * -844883935, c.a(object6.v * -1051150961, object6.w * -844883935, object3.n * -435574017, -1847964236) - object3.w * 585463173, bH.S * 1026470457, 508838514);
                                    }
                                }
                                object3.a(bH.bk * -880137347, 1379744165);
                                cr.m.a(u.d * -1093536619, (int)object3.b, (int)object3.c, (int)object3.d, 60, (dh)object3, object3.y * -516374917, -1, false);
                            }
                        } else {
                            object3.m();
                        }
                        object3 = (v)bH.cs.e();
                    }
                    object3 = (dy)bH.ct.g();
                    while (object3 != null) {
                        if (object3.h * 233138673 == u.d * -1093536619 && !object3.f) {
                            if (bH.S * 1026470457 >= object3.l * -1358136719) {
                                object3.b(bH.bk * -880137347);
                                if (object3.f) {
                                    object3.m();
                                } else {
                                    cr.m.a(object3.h * 233138673, object3.i * 1696877937, object3.j * -1385315685, object3.k * -1261559767, 60, (dh)object3, 0, -1, false);
                                }
                            }
                        } else {
                            object3.m();
                        }
                        object3 = (dy)bH.ct.e();
                    }
                    bw.a(n23, n31, n14, n15, true, -82959261);
                    n30 = bH.eO * -292311905;
                    n27 = bH.eP * 123887831;
                    n14 = bH.eQ * -476732681;
                    n15 = bH.eR * -186527881;
                    dd.g(n30, n27, n14 + n30, n27 + n15);
                    de.a();
                    if (!bH.eA) {
                        n16 = bH.br * 1608861963;
                        if (bH.bz * 1355677181 / 256 > n16) {
                            n16 = bH.bz * 1355677181 / 256;
                        }
                        if (bH.eB[4] && bH.eD[4] + 128 > n16) {
                            n16 = 128 + bH.eD[4];
                        }
                        n20 = bH.bc * 823763991 + bH.bs * -1072839225 & 2047;
                        n24 = di.a * 1220633301;
                        n26 = c.a(cP.ar.v * -1051150961, cP.ar.w * -844883935, u.d * -1093536619, -1847964236) - k;
                        n17 = cp.e * -307703921;
                        n18 = n16 * 3 + 600;
                        n29 = 2048 - n16 & 2047;
                        n12 = 2048 - n20 & 2047;
                        object5 = 0;
                        object4 = 0;
                        object2 = n18;
                        if (n29 != 0) {
                            n28 = de.t[n29];
                            int n362 = de.u[n29];
                            object6 = object4 * n362 - n28 * n18 >> 16;
                            object2 = object4 * n28 + n362 * n18 >> 16;
                            object4 = object6;
                        }
                        if (n12 != 0) {
                            n28 = de.t[n12];
                            int n37 = de.u[n12];
                            object6 = object5 * n37 + object2 * n28 >> 16;
                            object2 = object2 * n37 - object5 * n28 >> 16;
                            object5 = object6;
                        }
                        c.f = (n24 - object5) * 1074536299;
                        cD.a = (n26 - object4) * 653219559;
                        q.b = (n17 - object2) * -1774627817;
                        bH.fg = n16 * 34393649;
                        aj.h = n20 * -112245797;
                    }
                    if (!bH.eA) {
                        if (ag.d.f) {
                            n20 = u.d * -1093536619;
                        } else {
                            n24 = 3;
                            if (bH.fg * -1557542191 < 310) {
                                n26 = c.f * -1967123133 >> 7;
                                n17 = q.b * 681386919 >> 7;
                                n18 = cP.ar.v * -1051150961 >> 7;
                                n29 = cP.ar.w * -844883935 >> 7;
                                if ((ax.i[u.d * -1093536619][n26][n17] & 4) != 0) {
                                    n24 = u.d * -1093536619;
                                }
                                n12 = n18 > n26 ? n18 - n26 : n26 - n18;
                                object5 = n29 > n17 ? n29 - n17 : n17 - n29;
                                if (n12 > object5) {
                                    object4 = object5 * 65536 / n12;
                                    object2 = 32768;
                                    while (n18 != n26) {
                                        if (n26 < n18) {
                                            ++n26;
                                        } else if (n26 > n18) {
                                            --n26;
                                        }
                                        if ((ax.i[u.d * -1093536619][n26][n17] & 4) != 0) {
                                            n24 = u.d * -1093536619;
                                        }
                                        if ((object2 += object4) < 65536) continue;
                                        object2 -= 65536;
                                        if (n17 < n29) {
                                            ++n17;
                                        } else if (n17 > n29) {
                                            --n17;
                                        }
                                        if ((ax.i[u.d * -1093536619][n26][n17] & 4) == 0) continue;
                                        n24 = u.d * -1093536619;
                                    }
                                } else {
                                    object4 = n12 * 65536 / object5;
                                    object2 = 32768;
                                    while (n29 != n17) {
                                        if (n17 < n29) {
                                            ++n17;
                                        } else if (n17 > n29) {
                                            --n17;
                                        }
                                        if ((ax.i[u.d * -1093536619][n26][n17] & 4) != 0) {
                                            n24 = u.d * -1093536619;
                                        }
                                        if ((object2 += object4) < 65536) continue;
                                        object2 -= 65536;
                                        if (n26 < n18) {
                                            ++n26;
                                        } else if (n26 > n18) {
                                            --n26;
                                        }
                                        if ((ax.i[u.d * -1093536619][n26][n17] & 4) == 0) continue;
                                        n24 = u.d * -1093536619;
                                    }
                                }
                            }
                            if ((ax.i[u.d * -1093536619][cP.ar.v * -1051150961 >> 7][cP.ar.w * -844883935 >> 7] & 4) != 0) {
                                n24 = u.d * -1093536619;
                            }
                            n20 = n24;
                        }
                        n16 = n20;
                    } else {
                        n16 = dx.a(2147122237);
                    }
                    n20 = c.f * -1967123133;
                    n24 = cD.a * 113597655;
                    n26 = q.b * 681386919;
                    n17 = bH.fg * -1557542191;
                    n18 = aj.h * 167182419;
                    for (n29 = 0; n29 < 5; ++n29) {
                        if (!bH.eB[n29]) continue;
                        n12 = (int)(Math.random() * (double)(1 + bH.eC[n29] * 2) - (double)bH.eC[n29] + Math.sin((double)bH.eF[n29] * ((double)bH.eE[n29] / 100.0)) * (double)bH.eD[n29]);
                        if (n29 == 0) {
                            c.f += n12 * 1074536299;
                        }
                        if (n29 == 1) {
                            cD.a += n12 * 653219559;
                        }
                        if (n29 == 2) {
                            q.b += n12 * -1774627817;
                        }
                        if (n29 == 3) {
                            aj.h = (aj.h * 167182419 + n12 & 2047) * -112245797;
                        }
                        if (n29 != 4) continue;
                        if ((bH.fg += n12 * 34393649) * -1557542191 < 128) {
                            bH.fg = 107419776;
                        }
                        if (bH.fg * -1557542191 <= 383) continue;
                        bH.fg = 287865679;
                    }
                    n29 = cD.l * -1031552075;
                    n12 = cD.m * 1941423145;
                    if (cD.n * 332680755 != 0) {
                        n29 = cD.o * 1837550337;
                        n12 = cD.p * -1013575437;
                    }
                    if (n29 >= n30 && n29 < n14 + n30 && n12 >= n27 && n12 < n27 + n15) {
                        cB.ac = true;
                        cB.G = 0;
                        cB.ad = n29 - n30;
                        cB.ae = n12 - n27;
                    } else {
                        cB.ac = false;
                        cB.G = 0;
                    }
                    cL.a();
                    dd.b(n30, n27, n14, n15, 0);
                    cL.a();
                    object5 = de.p;
                    de.p = bH.eS * -1951712977;
                    cr.m.a(c.f * -1967123133, cD.a * 113597655, q.b * 681386919, bH.fg * -1557542191, aj.h * 167182419, n16);
                    de.p = object5;
                    cL.a();
                    cr.m.c();
                    bH.bA = 0;
                    n34 = 0;
                    object2 = -1;
                    for (n28 = -1; n28 < bH.cc * -796710281 + bH.aD * 1974577941; ++n28) {
                        if (n28 == -1) {
                            object7 = cP.ar;
                        } else if (n28 < bH.cc * -796710281) {
                            object7 = bH.cb[bH.cd[n28]];
                            if (bH.cp * -208567815 == bH.cd[n28]) {
                                n34 = 1;
                                object2 = n28;
                                continue;
                            }
                        } else {
                            object7 = bH.aC[bH.aE[n28 - bH.cc * -796710281]];
                        }
                        bH.a((t)object7, n28, n30, n27, n14, n15, -2014477560);
                    }
                    if (n34 != 0) {
                        bH.a(bH.cb[bH.cp * -208567815], (int)object2, n30, n27, n14, n15, -361892581);
                    }
                    for (n28 = 0; n28 < bH.bA * -738319905; ++n28) {
                        int n38 = bH.bC[n28];
                        object6 = bH.bD[n28];
                        object7 = bH.bF[n28];
                        n35 = bH.bE[n28];
                        bl2 = true;
                        while (bl2) {
                            void var44_68;
                            bl2 = false;
                            n36 = 0;
                            while (++var44_68 < n28) {
                                if (object6 + 2 <= bH.bD[var44_68] - bH.bE[var44_68] || object6 - n35 >= bH.bD[var44_68] + 2 || n38 - object7 >= bH.bC[var44_68] + bH.bF[var44_68] || n38 + object7 <= bH.bC[var44_68] - bH.bF[var44_68] || bH.bD[var44_68] - bH.bE[var44_68] >= object6) continue;
                                object6 = bH.bD[var44_68] - bH.bE[var44_68];
                                bl2 = true;
                            }
                        }
                        bH.bM = bH.bC[n28] * -1738216931;
                        Object object8 = object6;
                        bH.bD[n28] = object8;
                        bH.bN = object8 * -1048260499;
                        String string = bH.bJ[n28];
                        if (bH.cT * 1704469337 == 0) {
                            int n37;
                            int n39 = 16776960;
                            if (bH.bG[n28] < 6) {
                                n39 = bH.dV[bH.bG[n28]];
                            }
                            if (bH.bG[n28] == 6) {
                                int n40 = n39 = bH.bL * -246782549 % 20 < 10 ? 16711680 : 16776960;
                            }
                            if (bH.bG[n28] == 7) {
                                int n41 = n39 = bH.bL * -246782549 % 20 < 10 ? 255 : 65535;
                            }
                            if (bH.bG[n28] == 8) {
                                int n42 = n39 = bH.bL * -246782549 % 20 < 10 ? 45056 : 8454016;
                            }
                            if (bH.bG[n28] == 9) {
                                n37 = 150 - bH.bI[n28];
                                if (n37 < 50) {
                                    n39 = n37 * 1280 + 16711680;
                                } else if (n37 < 100) {
                                    n39 = 16776960 - (n37 - 50) * 327680;
                                } else if (n37 < 150) {
                                    n39 = (n37 - 100) * 5 + 65280;
                                }
                            }
                            if (bH.bG[n28] == 10) {
                                n37 = 150 - bH.bI[n28];
                                if (n37 < 50) {
                                    n39 = n37 * 5 + 16711680;
                                } else if (n37 < 100) {
                                    n39 = 16711935 - (n37 - 50) * 327680;
                                } else if (n37 < 150) {
                                    n39 = 255 + (n37 - 100) * 327680 - (n37 - 100) * 5;
                                }
                            }
                            if (bH.bG[n28] == 11) {
                                n37 = 150 - bH.bI[n28];
                                if (n37 < 50) {
                                    n39 = 16777215 - n37 * 327685;
                                } else if (n37 < 100) {
                                    n39 = 65280 + (n37 - 50) * 327685;
                                } else if (n37 < 150) {
                                    n39 = 16777215 - (n37 - 100) * 327680;
                                }
                            }
                            if (bH.bH[n28] == 0) {
                                bn.a.c(string, bH.bM * 972236853 + n30, bH.bN * 1023916389 + n27, n39, 0);
                            }
                            if (bH.bH[n28] == 1) {
                                bn.a.a(string, bH.bM * 972236853 + n30, n27 + bH.bN * 1023916389, n39, 0, bH.bL * -246782549);
                            }
                            if (bH.bH[n28] == 2) {
                                bn.a.b(string, bH.bM * 972236853 + n30, n27 + bH.bN * 1023916389, n39, 0, bH.bL * -246782549);
                            }
                            if (bH.bH[n28] == 3) {
                                bn.a.a(string, bH.bM * 972236853 + n30, n27 + bH.bN * 1023916389, n39, 0, bH.bL * -246782549, 150 - bH.bI[n28]);
                            }
                            if (bH.bH[n28] == 4) {
                                n37 = (150 - bH.bI[n28]) * (bn.a.a(string) + 100) / 150;
                                dd.d(n30 + bH.bM * 972236853 - 50, n27, 50 + bH.bM * 972236853 + n30, n27 + n15);
                                bn.a.a(string, n30 + bH.bM * 972236853 + 50 - n37, n27 + bH.bN * 1023916389, n39, 0);
                                dd.g(n30, n27, n14 + n30, n27 + n15);
                            }
                            if (bH.bH[n28] != 5) continue;
                            n37 = 150 - bH.bI[n28];
                            int n43 = 0;
                            if (n37 < 25) {
                                n43 = n37 - 25;
                            } else if (n37 > 125) {
                                n43 = n37 - 125;
                            }
                            dd.d(n30, n27 + bH.bN * 1023916389 - bn.a.c - 1, n30 + n14, n27 + bH.bN * 1023916389 + 5);
                            bn.a.c(string, bH.bM * 972236853 + n30, n27 + bH.bN * 1023916389 + n43, n39, 0);
                            dd.g(n30, n27, n14 + n30, n27 + n15);
                            continue;
                        }
                        bn.a.c(string, bH.bM * 972236853 + n30, n27 + bH.bN * 1023916389, 16776960, 0);
                    }
                    if (bH.am * 1066731469 == 2) {
                        bZ.a(bH.as * 309401549 + (bH.ap * -115292431 - bw.c * -1719983039 << 7), (bH.aq * -1991814481 - ce.c * 803568843 << 7) + bH.at * 1751602627, bH.ar * 961926542);
                        if (bH.bM * 972236853 > -1 && bH.S * 1026470457 % 20 < 10) {
                            aF.a[0].b(n30 + bH.bM * 972236853 - 12, n27 + bH.bN * 1023916389 - 28);
                        }
                    }
                    ((dx)de.j).c(bH.bk * -880137347, 485536965);
                    if (bH.bR * 27331731 == 1) {
                        bH.D[bH.bQ * 822284833 / 100].b(bH.bO * 1738571867 - 8, bH.bP * 1504921527 - 8);
                    }
                    if (bH.bR * 27331731 == 2) {
                        bH.D[4 + bH.bQ * 822284833 / 100].b(bH.bO * 1738571867 - 8, bH.bP * 1504921527 - 8);
                    }
                    bH.ca = 0;
                    object4 = bw.c * -1719983039 + (cP.ar.v * -1051150961 >> 7);
                    object2 = ce.c * 803568843 + (cP.ar.w * -844883935 >> 7);
                    if (object4 >= 3053 && object4 <= 3156 && object2 >= 3056 && object2 <= 3136) {
                        bH.ca = 635206863;
                    }
                    if (object4 >= 3072 && object4 <= 3118 && object2 >= 9492 && object2 <= 9535) {
                        bH.ca = 635206863;
                    }
                    if (bH.ca * -246740433 == 1 && object4 >= 3139 && object4 <= 3199 && object2 >= 3008 && object2 <= 3062) {
                        bH.ca = 0;
                    }
                    c.f = n20 * 1074536299;
                    cD.a = n24 * 653219559;
                    q.b = n26 * -1774627817;
                    bH.fg = n17 * 34393649;
                    aj.h = n18 * -112245797;
                    if (bH.af && (object2 = (Object)((object7 = (Object)false) + bq.e * 1403506591 + bq.g * -1432304815)) == false) {
                        bH.af = false;
                    }
                    if (bH.af) {
                        dd.b(n30, n27, n14, n15, 0);
                        aL.a(du.l, false, -1714673297);
                    }
                    bH.dL[cZ2.bQ * -1567323639] = true;
                    dd.g(n3, n4, n5, n6);
                    continue;
                }
                if (cZ2.u * -202095703 == 1338) {
                    cL.a();
                    object = cZ2.a(31);
                    if (object != null) {
                        block270 : {
                            dd.g(n23, n31, object.b * -2016633209 + n23, n31 + object.c * -633411239);
                            if (bH.eo * 382216283 != 2 && bH.eo * 382216283 != 5) {
                                n27 = bH.bs * -1072839225 + bH.bf * 1847328669 & 2047;
                                n14 = cP.ar.v * -1051150961 / 32 + 48;
                                n15 = 464 - cP.ar.w * -844883935 / 32;
                                cQ.h.a(n23, n31, object.b * -2016633209, object.c * -633411239, n14, n15, n27, 256 + bH.bh * 461573195, object.e, object.d);
                                for (int i3 = 0; i3 < bH.ei * -1281668133; ++i3) {
                                    n16 = 2 + bH.ej[i3] * 4 - cP.ar.v * -1051150961 / 32;
                                    n20 = bH.ek[i3] * 4 + 2 - cP.ar.w * -844883935 / 32;
                                    aF.a(n23, n31, n16, n20, bH.el[i3], (x)object, 84);
                                }
                                n13 = 0;
                                do {
                                    if (n13 >= 104) {
                                        for (object3 = (Object)false; object3 < bH.aD * 1974577941; ++object3) {
                                            cG cG2 = bH.aC[bH.aE[object3]];
                                            if (cG2 == null || !cG2.a_(930976114)) continue;
                                            cH cH2 = cG2.aq;
                                            if (cH2 != null && cH2.F != null) {
                                                cH2 = cH2.a();
                                            }
                                            if (cH2 == null || !cH2.s || !cH2.C) continue;
                                            object7 = cG2.v * -1051150961 / 32 - cP.ar.v * -1051150961 / 32;
                                            n35 = cG2.w * -844883935 / 32 - cP.ar.w * -844883935 / 32;
                                            aF.a(n23, n31, (int)object7, n35, aG.h[1], (x)object, 71);
                                        }
                                        for (object3 = (Object)false; object3 < bH.cc * -796710281; ++object3) {
                                            cP cP2 = bH.cb[bH.cd[object3]];
                                            if (cP2 == null || !cP2.a_(1533224275) || cP2.aI) continue;
                                            n34 = cP2.v * -1051150961 / 32 - cP.ar.v * -1051150961 / 32;
                                            object7 = cP2.w * -844883935 / 32 - cP.ar.w * -844883935 / 32;
                                            n35 = 0;
                                            if (aO.a(cP2.aF, true, 758283072)) {
                                                n35 = 1;
                                            }
                                            bl2 = false;
                                            for (n36 = 0; n36 < bE.a * -1787316275; ++n36) {
                                                if (!cP2.aF.equals(aM.b[n36].c)) continue;
                                                bl2 = true;
                                                break;
                                            }
                                            n36 = 0;
                                            if (cP.ar.aE * -1891106653 != 0 && cP2.aE * -1891106653 != 0 && cP.ar.aE * -1891106653 == cP2.aE * -1891106653) {
                                                n36 = 1;
                                            }
                                            if (n35 != 0) {
                                                aF.a(n23, n31, n34, (int)object7, aG.h[3], (x)object, 103);
                                                continue;
                                            }
                                            if (n36 != 0) {
                                                aF.a(n23, n31, n34, (int)object7, aG.h[4], (x)object, 17);
                                                continue;
                                            }
                                            if (bl2) {
                                                aF.a(n23, n31, n34, (int)object7, aG.h[5], (x)object, 9);
                                                continue;
                                            }
                                            aF.a(n23, n31, n34, (int)object7, aG.h[2], (x)object, 112);
                                        }
                                        if (bH.am * 1066731469 != 0 && bH.S * 1026470457 % 20 < 10) {
                                            cP cP3;
                                            cG cG3;
                                            if (bH.am * 1066731469 == 1 && bH.an * -1890256937 >= 0 && bH.an * -1890256937 < bH.aC.length && (cG3 = bH.aC[bH.an * -1890256937]) != null) {
                                                n16 = cG3.v * -1051150961 / 32 - cP.ar.v * -1051150961 / 32;
                                                n20 = cG3.w * -844883935 / 32 - cP.ar.w * -844883935 / 32;
                                                aj.a(n23, n31, n16, n20, dp.a[1], (x)object, -1725738410);
                                            }
                                            if (bH.am * 1066731469 == 2) {
                                                n13 = bH.ap * -461169724 - bw.c * 1710002436 + 2 - cP.ar.v * -1051150961 / 32;
                                                n16 = bH.aq * 622676668 - ce.c * -1080691924 + 2 - cP.ar.w * -844883935 / 32;
                                                aj.a(n23, n31, n13, n16, dp.a[1], (x)object, 2032336324);
                                            }
                                            if (bH.am * 1066731469 == 10 && bH.ao * -1467260517 >= 0 && bH.ao * -1467260517 < bH.cb.length && (cP3 = bH.cb[bH.ao * -1467260517]) != null) {
                                                n16 = cP3.v * -1051150961 / 32 - cP.ar.v * -1051150961 / 32;
                                                n20 = cP3.w * -844883935 / 32 - cP.ar.w * -844883935 / 32;
                                                aj.a(n23, n31, n16, n20, dp.a[1], (x)object, 456699135);
                                            }
                                        }
                                        if (bH.em * -1846442735 != 0) {
                                            n13 = 2 + bH.em * 1204163652 - cP.ar.v * -1051150961 / 32;
                                            n16 = 2 + bH.en * -1802295708 - cP.ar.w * -844883935 / 32;
                                            aF.a(n23, n31, n13, n16, dp.a[0], (x)object, 12);
                                        }
                                        if (!cP.ar.aI) {
                                            dd.b(object.b * -2016633209 / 2 + n23 - 1, object.c * -633411239 / 2 + n31 - 1, 3, 3, 16777215);
                                        }
                                        break block270;
                                    }
                                    for (n16 = 0; n16 < 104; ++n16) {
                                        bA bA2 = bH.cq[u.d * -1093536619][n13][n16];
                                        if (bA2 == null) continue;
                                        n24 = 2 + n13 * 4 - cP.ar.v * -1051150961 / 32;
                                        n26 = n16 * 4 + 2 - cP.ar.w * -844883935 / 32;
                                        aF.a(n23, n31, n24, n26, aG.h[0], (x)object, 67);
                                    }
                                    ++n13;
                                } while (true);
                            }
                            dd.a(n23, n31, 0, object.e, object.d);
                        }
                        bH.dM[n11] = true;
                    }
                    dd.g(n3, n4, n5, n6);
                    continue;
                }
                if (cZ2.u * -202095703 == 1339) {
                    bv.a(cZ2, n23, n31);
                    dd.g(n3, n4, n5, n6);
                    continue;
                }
            }
            if (cZ2.s * -1878336627 == 0) {
                if (!cZ2.r && dn.a(cZ2, -127) && cZ2 != dp.b) continue;
                if (!cZ2.r) {
                    if (cZ2.bC * -650026719 > cZ2.F * -124837617 - cZ2.by * 539675235) {
                        cZ2.bC = cZ2.F * -282538961 - cZ2.by * 1999030019;
                    }
                    if (cZ2.bC * -650026719 < 0) {
                        cZ2.bC = 0;
                    }
                }
                I.a(arrcZ, cZ2.bt * 1582464481, n25, n21, n19, n22, n23 - cZ2.bB * 706996303, n31 - cZ2.bC * -650026719, n11, 1528185521);
                if (cZ2.p != null) {
                    I.a(cZ2.p, cZ2.bt * 1582464481, n25, n21, n19, n22, n23 - cZ2.bB * 706996303, n31 - cZ2.bC * -650026719, n11, 1688729996);
                }
                if ((object = (ce)bH.cS.a(cZ2.bt * 1582464481)) != null) {
                    ar.a(object.a * -1385416029, n25, n21, n19, n22, n23, n31, n11, 500874896);
                }
                dd.g(n3, n4, n5, n6);
                de.a();
            }
            if (!bH.R && !bH.dN[n11] && bH.dS * 1189118443 <= 1) continue;
            if (cZ2.F * -124837617 != 0 && cZ2.s * -1878336627 == 0 && !cZ2.r && cZ2.F * -124837617 > cZ2.by * 539675235) {
                n30 = n23 + cZ2.bx * 2096072399;
                n27 = cZ2.bC * -650026719;
                n14 = cZ2.by * 539675235;
                n15 = cZ2.F * -124837617;
                aP.a[0].a(n30, n31);
                aP.a[1].a(n30, n14 + n31 - 16);
                dd.b(n30, n31 + 16, 16, n14 - 32, bH.bl * 509008949);
                n13 = n14 * (n14 - 32) / n15;
                if (n13 < 8) {
                    n13 = 8;
                }
                n16 = (n14 - 32 - n13) * n27 / (n15 - n14);
                dd.b(n30, n16 + n31 + 16, 16, n13, bH.bm * 655345101);
                dd.e(n30, n16 + 16 + n31, n13, bH.bo * 1244417581);
                dd.e(n30 + 1, 16 + n31 + n16, n13, bH.bo * 1244417581);
                dd.f(n30, n16 + 16 + n31, 16, bH.bo * 1244417581);
                dd.f(n30, n16 + 17 + n31, 16, bH.bo * 1244417581);
                dd.e(n30 + 15, 16 + n31 + n16, n13, bH.bn * 1946241419);
                dd.e(14 + n30, n31 + 17 + n16, n13 - 1, bH.bn * 1946241419);
                dd.f(n30, n13 + n16 + 15 + n31, 16, bH.bn * 1946241419);
                dd.f(n30 + 1, n13 + 14 + n31 + n16, 15, bH.bn * 1946241419);
            }
            if (cZ2.s * -1878336627 == 1) continue;
            if (cZ2.s * -1878336627 == 2) {
                n30 = 0;
                for (n27 = 0; n27 < cZ2.y * 791903853; ++n27) {
                    for (n14 = 0; n14 < cZ2.x * -769280817; ++n14) {
                        n15 = (cZ2.P * 1620079109 + 32) * n14 + n23;
                        n13 = n31 + n27 * (32 + cZ2.Q * -1753308347);
                        if (n30 < 20) {
                            n15 += cZ2.R[n30];
                            n13 += cZ2.S[n30];
                        }
                        if (cZ2.H[n30] <= 0) {
                            if (cZ2.T != null && n30 < 20) {
                                object = cZ2.c(n30, -2049138166);
                                if (object != null) {
                                    object.b(n15, n13);
                                } else if (cZ.bo) {
                                    bw.a(cZ2);
                                }
                            }
                        } else {
                            boolean bl4 = false;
                            boolean bl5 = false;
                            n24 = cZ2.H[n30] - 1;
                            if (n15 + 32 > n3 && n15 < n5 && n13 + 32 > n4 && n13 < n6 || cZ2 == bz.e && bH.bU * -1636511263 == n30) {
                                cX cX2 = bH.cK * -1710049223 == 1 && aB.a * 2106654977 == n30 && bQ.c * -1356904377 == cZ2.bt * 1582464481 ? ca.a(n24, cZ2.I[n30], 2, 0, 2, false) : ca.a(n24, cZ2.I[n30], 1, 3153952, 2, false);
                                if (cX2 != null) {
                                    if (bz.e == cZ2 && n30 == bH.bU * -1636511263) {
                                        n16 = cD.l * -1031552075 - bH.bV * 302755351;
                                        n20 = cD.m * 1941423145 - bH.bW * 757042921;
                                        if (n16 < Loader.c && n16 > - Loader.c) {
                                            n16 = 0;
                                        }
                                        if (n20 < Loader.c && n20 > - Loader.c) {
                                            n20 = 0;
                                        }
                                        if (bH.bZ * 1856246101 < Loader.c) {
                                            n16 = 0;
                                            n20 = 0;
                                        }
                                        cX2.a(n15 + n16, n20 + n13, 128);
                                        if (n2 != -1) {
                                            cZ cZ3 = arrcZ[n2 & 65535];
                                            if (n20 + n13 < dd.x && cZ3.bC * -650026719 > 0) {
                                                n18 = bH.bk * -880137347 * (dd.x - n13 - n20) / 3;
                                                if (n18 > bH.bk * -211438878) {
                                                    n18 = bH.bk * -211438878;
                                                }
                                                if (n18 > cZ3.bC * -650026719) {
                                                    n18 = cZ3.bC * -650026719;
                                                }
                                                cZ3.bC -= n18 * 1811636961;
                                                bH.bW += n18 * -1031526055;
                                                bw.a(cZ3);
                                            }
                                            if (n20 + n13 + 32 > dd.z && cZ3.bC * -650026719 < cZ3.F * -124837617 - cZ3.by * 539675235) {
                                                n18 = (n20 + n13 + 32 - dd.z) * bH.bk * -880137347 / 3;
                                                if (n18 > bH.bk * -211438878) {
                                                    n18 = bH.bk * -211438878;
                                                }
                                                if (n18 > cZ3.F * -124837617 - cZ3.by * 539675235 - cZ3.bC * -650026719) {
                                                    n18 = cZ3.F * -124837617 - cZ3.by * 539675235 - cZ3.bC * -650026719;
                                                }
                                                cZ3.bC += n18 * 1811636961;
                                                bH.bW -= n18 * -1031526055;
                                                bw.a(cZ3);
                                            }
                                        }
                                    } else if (cZ2 == aZ.a && bH.bT * -1116128187 == n30) {
                                        cX2.a(n15, n13, 128);
                                    } else {
                                        cX2.b(n15, n13);
                                    }
                                } else {
                                    bw.a(cZ2);
                                }
                            }
                        }
                        ++n30;
                    }
                }
                continue;
            }
            if (cZ2.s * -1878336627 == 3) {
                if (aG.a(cZ2, -1004317500)) {
                    n30 = cZ2.Z * 846810285;
                    if (dp.b == cZ2 && cZ2.ab * 913250325 != 0) {
                        n30 = cZ2.ab * 913250325;
                    }
                } else {
                    n30 = cZ2.W * 1480230763;
                    if (cZ2 == dp.b && cZ2.aa * -315882783 != 0) {
                        n30 = cZ2.aa * -315882783;
                    }
                }
                if (n32 == 0) {
                    if (cZ2.O) {
                        dd.b(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, n30);
                        continue;
                    }
                    dd.c(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, n30);
                    continue;
                }
                if (cZ2.O) {
                    dd.b(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, n30, 256 - (n32 & 255));
                    continue;
                }
                dd.d(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, n30, 256 - (n32 & 255));
                continue;
            }
            if (cZ2.s * -1878336627 == 4) {
                object = cZ2.c(2);
                if (object == null) {
                    if (!cZ.bo) continue;
                    bw.a(cZ2);
                    continue;
                }
                object3 = cZ2.U;
                if (aG.a(cZ2, -1812488417)) {
                    n27 = cZ2.Z * 846810285;
                    if (cZ2 == dp.b && cZ2.ab * 913250325 != 0) {
                        n27 = cZ2.ab * 913250325;
                    }
                    if (cZ2.V.length() > 0) {
                        object3 = cZ2.V;
                    }
                } else {
                    n27 = cZ2.W * 1480230763;
                    if (cZ2 == dp.b && cZ2.aa * -315882783 != 0) {
                        n27 = cZ2.aa * -315882783;
                    }
                }
                if (cZ2.r && cZ2.bG * -181409537 != -1) {
                    ca ca2 = bH.j(cZ2.bG * -181409537);
                    object3 = ca2.f;
                    if (object3 == null) {
                        object3 = "null";
                    }
                    if ((ca2.l * 833352093 == 1 || cZ2.bH * 1867752365 != 1) && cZ2.bH * 1867752365 != -1) {
                        object3 = am.a(16748608) + (String)object3 + aB.i + " " + 'x' + dh.a(cZ2.bH * 1867752365, -10);
                    }
                }
                if (cZ2 == bH.cV) {
                    object6 = null;
                    object3 = du.cc;
                    n27 = cZ2.W * 1480230763;
                }
                if (!cZ2.r) {
                    object3 = cD.a((String)object3, cZ2, 34);
                }
                object.a((String)object3, n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, n27, cZ2.X ? 0 : -1, cZ2.K * -961446265, cZ2.L * 558461029, cZ2.M * 1836856239);
                continue;
            }
            if (cZ2.s * -1878336627 == 5) {
                if (!cZ2.r) {
                    object3 = cZ2.a(aG.a(cZ2, -1259436780), -1683547213);
                    if (object3 != null) {
                        object3.b(n23, n31);
                        continue;
                    }
                    if (!cZ.bo) continue;
                    bw.a(cZ2);
                    continue;
                }
                object3 = cZ2.bG * -181409537 != -1 ? ca.a(cZ2.bG * -181409537, cZ2.bH * 1867752365, cZ2.aC * -958976749, cZ2.aD * 1414771397, cZ2.bE * -1148842275, false) : cZ2.a(false, -1683547213);
                if (object3 == null) {
                    if (!cZ.bo) continue;
                    bw.a(cZ2);
                    continue;
                }
                n27 = object3.b;
                n14 = object3.d;
                if (!cZ2.aB) {
                    n15 = cZ2.bx * -127078400 / n27;
                    if (cZ2.ay * -180984737 != 0) {
                        object3.b(n23 + cZ2.bx * 2096072399 / 2, n31 + cZ2.by * 539675235 / 2, cZ2.ay * -180984737, n15);
                        continue;
                    }
                    if (n32 != 0) {
                        object3.a(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235, 256 - (n32 & 255));
                        continue;
                    }
                    if (cZ2.bx * 2096072399 == n27 && n14 == cZ2.by * 539675235) {
                        object3.b(n23, n31);
                        continue;
                    }
                    object3.a(n23, n31, cZ2.bx * 2096072399, cZ2.by * 539675235);
                    continue;
                }
                dd.d(n23, n31, n23 + cZ2.bx * 2096072399, cZ2.by * 539675235 + n31);
                n15 = (cZ2.bx * 2096072399 + (n27 - 1)) / n27;
                n13 = (cZ2.by * 539675235 + (n14 - 1)) / n14;
                for (n16 = 0; n16 < n15; ++n16) {
                    for (n20 = 0; n20 < n13; ++n20) {
                        if (cZ2.ay * -180984737 != 0) {
                            object3.b(n27 / 2 + n27 * n16 + n23, n14 / 2 + n14 * n20 + n31, cZ2.ay * -180984737, 4096);
                            continue;
                        }
                        if (n32 != 0) {
                            object3.a(n16 * n27 + n23, n31 + n14 * n20, 256 - (n32 & 255));
                            continue;
                        }
                        object3.b(n23 + n27 * n16, n14 * n20 + n31);
                    }
                }
                dd.g(n3, n4, n5, n6);
                continue;
            }
            if (cZ2.s * -1878336627 == 6) {
                object6 = aG.a(cZ2, -622202512);
                n27 = object6 != false ? cZ2.aj * 658207607 : cZ2.ai * -335970573;
                cB cB2 = null;
                n15 = 0;
                if (cZ2.bG * -181409537 != -1) {
                    object3 = bH.j(cZ2.bG * -181409537);
                    if (object3 != null) {
                        cB2 = (object3 = object3.b(cZ2.bH * 1867752365)).c(1);
                        if (cB2 != null) {
                            cB2.a();
                            n15 = cB2.aN * -695779227 / 2;
                        } else {
                            bw.a(cZ2);
                        }
                    }
                } else if (cZ2.ae * 1661118609 == 5) {
                    cB2 = cZ2.af * -982469919 == 0 ? bH.eZ.a(null, -1, null, -1, -599050511) : cP.ar.a(1704725433);
                } else if (n27 == -1) {
                    cB2 = cZ2.a(null, -1, (boolean)object6, cP.ar.aJ, -1443846749);
                    if (cB2 == null && cZ.bo) {
                        bw.a(cZ2);
                    }
                } else {
                    d d2 = c.b(n27);
                    cB2 = cZ2.a(d2, cZ2.bI * 920672345, (boolean)object6, cP.ar.aJ, -2116185844);
                    if (cB2 == null && cZ.bo) {
                        bw.a(cZ2);
                    }
                }
                de.a(n23 + cZ2.bx * 2096072399 / 2, cZ2.by * 539675235 / 2 + n31);
                n13 = cZ2.ap * -1256377801 * de.t[cZ2.aq * -1788131197] >> 16;
                n16 = cZ2.ap * -1256377801 * de.u[cZ2.aq * -1788131197] >> 16;
                if (cB2 != null) {
                    if (!cZ2.r) {
                        cB2.a(0, cZ2.ar * 1096480275, 0, cZ2.aq * -1788131197, 0, n13, n16);
                    } else {
                        cB2.a();
                        if (cZ2.aK) {
                            cB2.b(0, cZ2.ar * 1096480275, cZ2.aG * -1964550911, cZ2.aq * -1788131197, cZ2.aE * 1021889171, cZ2.aF * -357548381 + n13 + n15, n16 + cZ2.aF * -357548381, cZ2.ap * -1256377801);
                        } else {
                            cB2.a(0, cZ2.ar * 1096480275, cZ2.aG * -1964550911, cZ2.aq * -1788131197, cZ2.aE * 1021889171, n15 + n13 + cZ2.aF * -357548381, n16 + cZ2.aF * -357548381);
                        }
                    }
                }
                de.c();
                continue;
            }
            if (cZ2.s * -1878336627 == 7) {
                object = cZ2.c(2);
                if (object == null) {
                    if (!cZ.bo) continue;
                    bw.a(cZ2);
                    continue;
                }
                n27 = 0;
                for (n14 = 0; n14 < cZ2.y * 791903853; ++n14) {
                    for (n15 = 0; n15 < cZ2.x * -769280817; ++n15) {
                        if (cZ2.H[n27] > 0) {
                            object3 = bH.j(cZ2.H[n27] - 1);
                            String string = object3.l * 833352093 != 1 && cZ2.I[n27] == 1 ? am.a(16748608) + object3.f + aB.i : am.a(16748608) + object3.f + aB.i + " " + 'x' + dh.a(cZ2.I[n27], -87);
                            n20 = n23 + (cZ2.P * 1620079109 + 115) * n15;
                            n24 = n31 + n14 * (cZ2.Q * -1753308347 + 12);
                            if (cZ2.K * -961446265 == 0) {
                                object.a(string, n20, n24, cZ2.W * 1480230763, cZ2.X ? 0 : -1);
                            } else if (cZ2.K * -961446265 == 1) {
                                object.c(string, n20 + cZ2.bx * 2096072399 / 2, n24, cZ2.W * 1480230763, cZ2.X ? 0 : -1);
                            } else {
                                object.b(string, n20 + cZ2.bx * 2096072399 - 1, n24, cZ2.W * 1480230763, cZ2.X ? 0 : -1);
                            }
                        }
                        ++n27;
                    }
                }
            }
            if (cZ2.s * -1878336627 == 8 && cZ2 == al.c && bH.cI * -486881813 == bH.cJ * -886888511) {
                n30 = 0;
                n27 = 0;
                s s2 = bQ.a;
                String string = cZ2.U;
                string = cD.a(string, cZ2, 39);
                while (string.length() > 0) {
                    String string2;
                    n16 = string.indexOf(aB.h);
                    if (n16 != -1) {
                        string2 = string.substring(0, n16);
                        string = string.substring(n16 + 4);
                    } else {
                        string2 = string;
                        string = "";
                    }
                    n20 = s2.a(string2);
                    if (n20 > n30) {
                        n30 = n20;
                    }
                    n27 += s2.c + 1;
                }
                n27 += 7;
                n16 = cZ2.bx * 2096072399 + n23 - 5 - (n30 += 6);
                n20 = cZ2.by * 539675235 + n31 + 5;
                if (n16 < n23 + 5) {
                    n16 = n23 + 5;
                }
                if (n30 + n16 > n5) {
                    n16 = n5 - n30;
                }
                if (n20 + n27 > n6) {
                    n20 = n6 - n27;
                }
                dd.b(n16, n20, n30, n27, 16777120);
                dd.c(n16, n20, n30, n27, 0);
                string = cZ2.U;
                n24 = 2 + n20 + s2.c;
                string = cD.a(string, cZ2, 117);
                while (string.length() > 0) {
                    String string3;
                    n26 = string.indexOf(aB.h);
                    if (n26 != -1) {
                        string3 = string.substring(0, n26);
                        string = string.substring(n26 + 4);
                    } else {
                        string3 = string;
                        string = "";
                    }
                    s2.a(string3, n16 + 3, n24, 0, -1);
                    n24 += s2.c + 1;
                }
            }
            if (cZ2.s * -1878336627 != 9) continue;
            if (cZ2.aI * 1185979973 == 1) {
                if (cZ2.aQ) {
                    n30 = n23;
                    n27 = cZ2.by * 539675235 + n31;
                    n14 = cZ2.bx * 2096072399 + n23;
                    n15 = n31;
                } else {
                    n30 = n23;
                    n27 = n31;
                    n14 = cZ2.bx * 2096072399 + n23;
                    n15 = cZ2.by * 539675235 + n31;
                }
                dd.f(n30, n27, n14, n15, cZ2.W * 1480230763);
                continue;
            }
            n30 = cZ2.bx * 2096072399 >= 0 ? cZ2.bx * 2096072399 : - cZ2.bx * 2096072399;
            n27 = cZ2.by * 539675235 >= 0 ? cZ2.by * 539675235 : - cZ2.by * 539675235;
            n14 = n30;
            if (n30 < n27) {
                n14 = n27;
            }
            if (n14 == 0) continue;
            n13 = (cZ2.by * 539675235 << 16) / n14;
            n15 = (cZ2.bx * 2096072399 << 16) / n14;
            if (n13 <= n15) {
                n15 = - n15;
            } else {
                n13 = - n13;
            }
            n16 = n13 * cZ2.aI * 1185979973 >> 17;
            n20 = n13 * cZ2.aI * 1185979973 + 1 >> 17;
            n24 = cZ2.aI * 1185979973 * n15 >> 17;
            n26 = cZ2.aI * 1185979973 * n15 + 1 >> 17;
            n17 = n16 + n23;
            n18 = n23 - n20;
            n29 = n23 + cZ2.bx * 2096072399 - n20;
            n12 = n23 + cZ2.bx * 2096072399 + n16;
            object5 = n31 + n24;
            object4 = n31 - n26;
            object2 = cZ2.by * 539675235 + n31 - n26;
            n28 = n24 + cZ2.by * 539675235 + n31;
            de.a(n17, n18, n29);
            de.a((int)object5, (int)object4, (int)object2, n17, n18, n29, cZ2.W * 1480230763);
            de.a(n17, n29, n12);
            de.a((int)object5, (int)object2, n28, n17, n29, n12, cZ2.W * 1480230763);
        }
    }

    static final int a(int n2, int n3) {
        int n4 = cP.a(n2 - 1, n3 - 1) + cP.a(1 + n2, n3 - 1) + cP.a(n2 - 1, 1 + n3) + cP.a(1 + n2, 1 + n3);
        int n5 = cP.a(n2 - 1, n3) + cP.a(n2 + 1, n3) + cP.a(n2, n3 - 1) + cP.a(n2, 1 + n3);
        int n6 = cP.a(n2, n3);
        return n6 / 4 + n4 / 16 + n5 / 8;
    }

    static {
        h = new int[32];
        int n2 = 2;
        for (int i2 = 0; i2 < 32; ++i2) {
            I.h[i2] = n2 - 1;
            n2 += n2;
        }
        i = new int[2000];
        j = new int[2000];
        k = 50;
    }
}

