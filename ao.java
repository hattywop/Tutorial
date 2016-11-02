/*
 * Decompiled with CFR 0_118.
 */
import java.util.Calendar;
import java.util.TimeZone;

public class ao {
    static int a;
    static String[][] b;
    static String[] c;
    static Calendar d;

    static final void a(cZ[] arrcZ, int n2, int n3, int n4, int n5, int n6, int n7, int n8, byte by2) {
        for (int i2 = 0; i2 < arrcZ.length; ++i2) {
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
            int n20;
            int n21;
            cZ cZ2 = arrcZ[i2];
            if (cZ2 == null || cZ2.r && cZ2.s * -1878336627 != 0 && !cZ2.bn && bH.a(cZ2) == 0 && cZ2 != bH.df && cZ2.u * -202095703 != 1338 || n2 != cZ2.A * -1588791493 || cZ2.r && dn.a(cZ2, -50)) continue;
            int n22 = n7 + cZ2.bv * -18591297;
            int n23 = n8 + cZ2.bw * -591061715;
            if (cZ2.s * -1878336627 == 2) {
                n14 = n3;
                n10 = n4;
                n18 = n5;
                n15 = n6;
            } else if (cZ2.s * -1878336627 == 9) {
                n17 = n22;
                n11 = n23;
                n21 = cZ2.bx * 2096072399 + n22;
                n19 = cZ2.by * 539675235 + n23;
                if (n21 < n22) {
                    n17 = n21;
                    n21 = n22;
                }
                if (n19 < n23) {
                    n11 = n19;
                    n19 = n23;
                }
                n14 = n17 > n3 ? n17 : n3;
                n10 = n11 > n4 ? n11 : n4;
                n18 = n21 < n5 ? ++n21 : n5;
                n15 = n19 < n6 ? ++n19 : n6;
            } else {
                n17 = n22 + cZ2.bx * 2096072399;
                n11 = cZ2.by * 539675235 + n23;
                n14 = n22 > n3 ? n22 : n3;
                n10 = n23 > n4 ? n23 : n4;
                n18 = n17 < n5 ? n17 : n5;
                int n24 = n15 = n11 < n6 ? n11 : n6;
            }
            if (bH.de == cZ2) {
                bH.dm = true;
                bH.dn = n22 * 70397561;
                bH.do = n23 * -1380790065;
            }
            if (cZ2.r && (n14 >= n18 || n10 >= n15)) continue;
            n17 = cD.l * -1031552075;
            n11 = cD.m * 1941423145;
            if (cD.n * 332680755 != 0) {
                n17 = cD.o * 1837550337;
                n11 = cD.p * -1013575437;
            }
            if (cZ2.u * -202095703 == 1337) {
                if (bH.af || bH.cy || n17 < n14 || n11 < n10 || n17 >= n18 || n11 >= n15) continue;
                an.a(n17, n11, n14, n10, -387339345);
                continue;
            }
            if (cZ2.u * -202095703 == 1338) {
                bp.a(cZ2, n22, n23);
                continue;
            }
            if (!bH.cy && n17 >= n14 && n11 >= n10 && n17 < n18 && n11 < n15) {
                q.a(cZ2, n17 - n22, n11 - n23);
            }
            if (cZ2.s * -1878336627 == 0) {
                ce ce2;
                if (!cZ2.r && dn.a(cZ2, 8) && cZ2 != dp.b) continue;
                ao.a(arrcZ, cZ2.bt * 1582464481, n14, n10, n18, n15, n22 - cZ2.bB * 706996303, n23 - cZ2.bC * -650026719, -1);
                if (cZ2.p != null) {
                    ao.a(cZ2.p, cZ2.bt * 1582464481, n14, n10, n18, n15, n22 - cZ2.bB * 706996303, n23 - cZ2.bC * -650026719, -1);
                }
                if ((ce2 = (ce)bH.cS.a(cZ2.bt * 1582464481)) != null) {
                    if (ce2.b * -1355411471 == 0 && cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15 && !bH.cy && !bH.db) {
                        dj dj2 = (dj)bH.dF.g();
                        while (dj2 != null) {
                            if (dj2.b) {
                                dj2.m();
                                dj2.e.bK = false;
                            }
                            dj2 = (dj)bH.dF.e();
                        }
                        if (bQ.e * 1969654907 == 0) {
                            bH.de = null;
                            bH.df = null;
                        }
                        if (!bH.cy) {
                            bH.cE[0] = du.dm;
                            bH.cF[0] = "";
                            bH.cC[0] = 1006;
                            bH.cz = -439682997;
                        }
                    }
                    di.a(ce2.a * -1385416029, n14, n10, n18, n15, n22, n23, -4);
                }
            }
            if (cZ2.r) {
                if (!cZ2.az) {
                    if (cZ2.aA && cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15) {
                        dj dj3 = (dj)bH.dF.g();
                        while (dj3 != null) {
                            if (dj3.b && dj3.e.bj == dj3.a) {
                                dj3.m();
                            }
                            dj3 = (dj)bH.dF.e();
                        }
                    }
                } else if (cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15) {
                    dj dj4 = (dj)bH.dF.g();
                    while (dj4 != null) {
                        if (dj4.b) {
                            dj4.m();
                            dj4.e.bK = false;
                        }
                        dj4 = (dj)bH.dF.e();
                    }
                    if (bQ.e * 1969654907 == 0) {
                        bH.de = null;
                        bH.df = null;
                    }
                    if (!bH.cy) {
                        bH.cE[0] = du.dm;
                        bH.cF[0] = "";
                        bH.cC[0] = 1006;
                        bH.cz = -439682997;
                    }
                }
                n16 = cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15 ? 1 : 0;
                n20 = 0;
                if ((cD.k * 445478637 == 1 || !aG.f && cD.k * 445478637 == 4) && n16 != 0) {
                    n20 = 1;
                }
                n9 = 0;
                if ((cD.n * 332680755 == 1 || !aG.f && cD.n * 332680755 == 4) && cD.o * 1837550337 >= n14 && cD.p * -1013575437 >= n10 && cD.o * 1837550337 < n18 && cD.p * -1013575437 < n15) {
                    n9 = 1;
                }
                if (n9 != 0) {
                    B.a(cZ2, cD.o * 1837550337 - n22, cD.p * -1013575437 - n23);
                }
                if (bH.de != null && bH.de != cZ2 && n16 != 0) {
                    boolean bl2;
                    int n25 = bH.a(cZ2);
                    boolean bl3 = bl2 = (n25 >> 20 & 1) != 0;
                    if (bl2) {
                        bH.di = cZ2;
                    }
                }
                if (cZ2 == bH.df) {
                    bH.dj = true;
                    bH.dk = n22 * 1418079215;
                    bH.dl = n23 * 1618015443;
                }
                if (cZ2.bn) {
                    dj dj5;
                    int n26;
                    if (n16 != 0 && bH.T * 498699079 != 0 && cZ2.bj != null) {
                        dj dj6 = new dj();
                        dj6.b = true;
                        dj6.e = cZ2;
                        dj6.i = bH.T * 227389881;
                        dj6.a = cZ2.bj;
                        bH.dF.a(dj6);
                    }
                    if (bH.de != null || bz.e != null || bH.cy) {
                        n9 = 0;
                        n20 = 0;
                        n16 = 0;
                    }
                    if (!cZ2.bL && n9 != 0) {
                        cZ2.bL = true;
                        if (cZ2.bd != null) {
                            dj dj7 = new dj();
                            dj7.b = true;
                            dj7.e = cZ2;
                            dj7.c = (cD.o * 1837550337 - n22) * -2053567695;
                            dj7.i = (cD.p * -1013575437 - n23) * 1536383743;
                            dj7.a = cZ2.bd;
                            bH.dF.a(dj7);
                        }
                    }
                    if (cZ2.bL && n20 != 0 && cZ2.be != null) {
                        dj dj8 = new dj();
                        dj8.b = true;
                        dj8.e = cZ2;
                        dj8.c = (cD.l * -1031552075 - n22) * -2053567695;
                        dj8.i = (cD.m * 1941423145 - n23) * 1536383743;
                        dj8.a = cZ2.be;
                        bH.dF.a(dj8);
                    }
                    if (cZ2.bL && n20 == 0) {
                        cZ2.bL = false;
                        if (cZ2.bf != null) {
                            dj dj9 = new dj();
                            dj9.b = true;
                            dj9.e = cZ2;
                            dj9.c = (cD.l * -1031552075 - n22) * -2053567695;
                            dj9.i = (cD.m * 1941423145 - n23) * 1536383743;
                            dj9.a = cZ2.bf;
                            bH.dH.a(dj9);
                        }
                    }
                    if (n20 != 0 && cZ2.bg != null) {
                        dj dj10 = new dj();
                        dj10.b = true;
                        dj10.e = cZ2;
                        dj10.c = (cD.l * -1031552075 - n22) * -2053567695;
                        dj10.i = (cD.m * 1941423145 - n23) * 1536383743;
                        dj10.a = cZ2.bg;
                        bH.dF.a(dj10);
                    }
                    if (!cZ2.bK && n16 != 0) {
                        cZ2.bK = true;
                        if (cZ2.aT != null) {
                            dj dj11 = new dj();
                            dj11.b = true;
                            dj11.e = cZ2;
                            dj11.c = (cD.l * -1031552075 - n22) * -2053567695;
                            dj11.i = (cD.m * 1941423145 - n23) * 1536383743;
                            dj11.a = cZ2.aT;
                            bH.dF.a(dj11);
                        }
                    }
                    if (cZ2.bK && n16 != 0 && cZ2.bc != null) {
                        dj dj12 = new dj();
                        dj12.b = true;
                        dj12.e = cZ2;
                        dj12.c = (cD.l * -1031552075 - n22) * -2053567695;
                        dj12.i = (cD.m * 1941423145 - n23) * 1536383743;
                        dj12.a = cZ2.bc;
                        bH.dF.a(dj12);
                    }
                    if (cZ2.bK && n16 == 0) {
                        cZ2.bK = false;
                        if (cZ2.aU != null) {
                            dj dj13 = new dj();
                            dj13.b = true;
                            dj13.e = cZ2;
                            dj13.c = (cD.l * -1031552075 - n22) * -2053567695;
                            dj13.i = (cD.m * 1941423145 - n23) * 1536383743;
                            dj13.a = cZ2.aU;
                            bH.dH.a(dj13);
                        }
                    }
                    if (cZ2.ba != null) {
                        dj dj14 = new dj();
                        dj14.e = cZ2;
                        dj14.a = cZ2.ba;
                        bH.dG.a(dj14);
                    }
                    if (cZ2.aX != null && bH.ds * -539970213 > cZ2.bN * 530516545) {
                        block84 : {
                            if (cZ2.bk != null && bH.ds * -539970213 - cZ2.bN * 530516545 <= 32) {
                                for (n13 = cZ2.bN * 530516545; n13 < bH.ds * -539970213; ++n13) {
                                    int n27 = bH.dr[n13 & 31];
                                    for (int i3 = 0; i3 < cZ2.bk.length; ++i3) {
                                        if (n27 != cZ2.bk[i3]) continue;
                                        dj5 = new dj();
                                        dj5.e = cZ2;
                                        dj5.a = cZ2.aX;
                                        bH.dF.a(dj5);
                                        break block84;
                                    }
                                }
                            } else {
                                dj dj15 = new dj();
                                dj15.e = cZ2;
                                dj15.a = cZ2.aX;
                                bH.dF.a(dj15);
                            }
                        }
                        cZ2.bN = bH.ds * 975536283;
                    }
                    if (cZ2.aY != null && bH.du * -84622767 > cZ2.bO * -648939829) {
                        block85 : {
                            if (cZ2.bl != null && bH.du * -84622767 - cZ2.bO * -648939829 <= 32) {
                                for (n13 = cZ2.bO * -648939829; n13 < bH.du * -84622767; ++n13) {
                                    n26 = bH.dt[n13 & 31];
                                    for (int i4 = 0; i4 < cZ2.bl.length; ++i4) {
                                        if (cZ2.bl[i4] != n26) continue;
                                        dj5 = new dj();
                                        dj5.e = cZ2;
                                        dj5.a = cZ2.aY;
                                        bH.dF.a(dj5);
                                        break block85;
                                    }
                                }
                            } else {
                                dj dj16 = new dj();
                                dj16.e = cZ2;
                                dj16.a = cZ2.aY;
                                bH.dF.a(dj16);
                            }
                        }
                        cZ2.bO = bH.du * -1488000045;
                    }
                    if (cZ2.aZ != null && bH.dw * -44417725 > cZ2.bP * -312838873) {
                        block86 : {
                            if (cZ2.bm != null && bH.dw * -44417725 - cZ2.bP * -312838873 <= 32) {
                                for (n13 = cZ2.bP * -312838873; n13 < bH.dw * -44417725; ++n13) {
                                    n26 = bH.dv[n13 & 31];
                                    for (int i5 = 0; i5 < cZ2.bm.length; ++i5) {
                                        if (n26 != cZ2.bm[i5]) continue;
                                        dj5 = new dj();
                                        dj5.e = cZ2;
                                        dj5.a = cZ2.aZ;
                                        bH.dF.a(dj5);
                                        break block86;
                                    }
                                }
                            } else {
                                dj dj17 = new dj();
                                dj17.e = cZ2;
                                dj17.a = cZ2.aZ;
                                bH.dF.a(dj17);
                            }
                        }
                        cZ2.bP = bH.dw * -1901748091;
                    }
                    if (bH.dx * 408056177 > cZ2.bM * 301551831 && cZ2.q != null) {
                        dj dj18 = new dj();
                        dj18.e = cZ2;
                        dj18.a = cZ2.q;
                        bH.dF.a(dj18);
                    }
                    if (bH.dy * -1412764705 > cZ2.bM * 301551831 && cZ2.k != null) {
                        dj dj19 = new dj();
                        dj19.e = cZ2;
                        dj19.a = cZ2.k;
                        bH.dF.a(dj19);
                    }
                    if (bH.dz * -1231214147 > cZ2.bM * 301551831 && cZ2.f != null) {
                        dj dj20 = new dj();
                        dj20.e = cZ2;
                        dj20.a = cZ2.f;
                        bH.dF.a(dj20);
                    }
                    if (bH.dA * -369109667 > cZ2.bM * 301551831 && cZ2.n != null) {
                        dj dj21 = new dj();
                        dj21.e = cZ2;
                        dj21.a = cZ2.n;
                        bH.dF.a(dj21);
                    }
                    if (bH.dB * -705690419 > cZ2.bM * 301551831 && cZ2.o != null) {
                        dj dj22 = new dj();
                        dj22.e = cZ2;
                        dj22.a = cZ2.o;
                        bH.dF.a(dj22);
                    }
                    if (bH.dC * 1979638683 > cZ2.bM * 301551831 && cZ2.l != null) {
                        dj dj23 = new dj();
                        dj23.e = cZ2;
                        dj23.a = cZ2.l;
                        bH.dF.a(dj23);
                    }
                    cZ2.bM = bH.dq * 613926489;
                    if (cZ2.j != null) {
                        for (n13 = 0; n13 < bH.eb * 858685769; ++n13) {
                            dj dj24 = new dj();
                            dj24.e = cZ2;
                            dj24.h = bH.ed[n13] * 268995583;
                            dj24.d = bH.ec[n13] * 1645811793;
                            dj24.a = cZ2.j;
                            bH.dF.a(dj24);
                        }
                    }
                }
            }
            if (cZ2.r || bH.de != null || bz.e != null || bH.cy) continue;
            if ((cZ2.B * -1224986539 >= 0 || cZ2.aa * -315882783 != 0) && cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15) {
                dp.b = cZ2.B * -1224986539 >= 0 ? arrcZ[cZ2.B * -1224986539] : cZ2;
            }
            if (cZ2.s * -1878336627 == 8 && cD.l * -1031552075 >= n14 && cD.m * 1941423145 >= n10 && cD.l * -1031552075 < n18 && cD.m * 1941423145 < n15) {
                al.c = cZ2;
            }
            if (cZ2.F * -124837617 <= cZ2.by * 539675235) continue;
            n21 = cZ2.bx * 2096072399 + n22;
            n19 = cZ2.by * 539675235;
            n16 = cZ2.F * -124837617;
            n13 = cD.l * -1031552075;
            int n28 = cD.m * 1941423145;
            bH.bq = bH.bp ? -1889899168 : 0;
            bH.bp = false;
            if (cD.k * 445478637 == 1 || !aG.f && cD.k * 445478637 == 4) {
                if (n13 >= n21 && n13 < 16 + n21 && n28 >= n23 && n28 < n23 + 16) {
                    cZ2.bC += 1343386748;
                    bw.a(cZ2);
                } else if (n13 >= n21 && n13 < n21 + 16 && n28 >= n19 + n23 - 16 && n28 < n19 + n23) {
                    cZ2.bC -= 1343386748;
                    bw.a(cZ2);
                } else if (n13 >= n21 - bH.bq * 1948631363 && n13 < 16 + n21 + bH.bq * 1948631363 && n28 >= n23 + 16 && n28 < n23 + n19 - 16) {
                    int n29 = (n19 - 32) * n19 / n16;
                    if (n29 < 8) {
                        n29 = 8;
                    }
                    n20 = n28 - n23 - 16 - n29 / 2;
                    n9 = n19 - 32 - n29;
                    cZ2.bC = (n16 - n19) * n20 / n9 * 1811636961;
                    bw.a(cZ2);
                    bH.bp = true;
                }
            }
            if (bH.T * 498699079 == 0 || n13 < n21 - (n12 = cZ2.bx * 2096072399) || n28 < n23 || n13 >= 16 + n21 || n28 > n23 + n19) continue;
            cZ2.bC += bH.T * 1732746523;
            bw.a(cZ2);
        }
    }

    public static final void a(long l2) {
        if (l2 > 0) {
            if (l2 % 10 == 0) {
                long l3 = l2 - 1;
                try {
                    Thread.sleep(l3);
                }
                catch (InterruptedException var4_3) {
                    // empty catch block
                }
                try {
                    Thread.sleep(1);
                }
                catch (InterruptedException var4_4) {}
            } else {
                try {
                    Thread.sleep(l2);
                }
                catch (InterruptedException var2_2) {
                    // empty catch block
                }
            }
        }
    }

    static int a(int n2, int n3) {
        bZ bZ2 = (bZ)bZ.e.a(n2);
        if (bZ2 == null || n3 == -1) {
            return 0;
        }
        int n4 = 0;
        for (int i2 = 0; i2 < bZ2.b.length; ++i2) {
            if (n3 != bZ2.a[i2]) continue;
            n4 += bZ2.b[i2];
        }
        return n4;
    }

    public static cN[] a(a a2, String string, String string2, int n2) {
        int n3;
        int n4 = a2.a(string);
        cN[] arrcN = t.a(a2, n4, n3 = a2.a(n4, string2, 105)) ? bL.a(28) : null;
        return arrcN;
    }

    static {
        b = new String[][]{{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}, {"Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez"}};
        c = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        Calendar.getInstance(TimeZone.getTimeZone("Europe/London"));
        d = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}

