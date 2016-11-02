/*
 * Decompiled with CFR 0_118.
 */
public final class al {
    int a;
    int b;
    static cZ c;
    int d;
    int e;
    int f;
    public dh g;
    public dh h;
    int i;
    static dn j;
    int k;
    public int l = 0;
    int m = 0;

    static final void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (c.c * 1572449351 != n2 || ao.a * -932948791 != n3 || bH.aR * 1286856103 != n4 && bH.ae) {
            int n9;
            int n8;
            c.c = n2 * -1338229385;
            ao.a = n3 * -846461575;
            bH.aR = n4 * 1070529047;
            if (!bH.ae) {
                bH.aR = 0;
            }
            bn.a(25);
            aL.a(du.l, true, -1714673297);
            int n10 = bw.c * -1719983039;
            int n11 = ce.c * 803568843;
            bw.c = (n2 - 6) * -82354680;
            ce.c = (n3 - 6) * -627030248;
            int n12 = bw.c * -1719983039 - n10;
            int n13 = ce.c * 803568843 - n11;
            n10 = bw.c * -1719983039;
            n11 = ce.c * 803568843;
            for (n8 = 0; n8 < 32768; ++n8) {
                cG cG2 = bH.aC[n8];
                if (cG2 == null) continue;
                n9 = 0;
                while (n9 < 10) {
                    int[] arrn = cG2.ah;
                    int n14 = n9;
                    arrn[n14] = arrn[n14] - n12;
                    int[] arrn2 = cG2.ai;
                    int n15 = n9++;
                    arrn2[n15] = arrn2[n15] - n13;
                }
                cG2.v -= n12 * 577025920;
                cG2.w -= n13 * 1219883136;
            }
            for (n8 = 0; n8 < 2048; ++n8) {
                cP cP2 = bH.cb[n8];
                if (cP2 == null) continue;
                n9 = 0;
                while (n9 < 10) {
                    int[] arrn = cP2.ah;
                    int n16 = n9;
                    arrn[n16] = arrn[n16] - n12;
                    int[] arrn3 = cP2.ai;
                    int n17 = n9++;
                    arrn3[n17] = arrn3[n17] - n13;
                }
                cP2.v -= n12 * 577025920;
                cP2.w -= n13 * 1219883136;
            }
            u.d = n4 * 1191917245;
            cP.ar.a(n5, n6, false, 14);
            boolean bl2 = false;
            int n18 = 104;
            int n19 = 1;
            if (n12 < 0) {
                int n20 = 103;
                n18 = -1;
                n19 = -1;
            }
            int n21 = 0;
            int n22 = 104;
            int n23 = 1;
            if (n13 < 0) {
                n21 = 103;
                n22 = -1;
                n23 = -1;
            }
            for (int i2 = n20; i2 != n18; i2 += n19) {
                for (int i3 = n21; i3 != n22; i3 += n23) {
                    int n24 = n12 + i2;
                    int n25 = i3 + n13;
                    for (int i4 = 0; i4 < 4; ++i4) {
                        bH.cq[i4][i2][i3] = n24 >= 0 && n25 >= 0 && n24 < 104 && n25 < 104 ? bH.cq[i4][n24][n25] : null;
                    }
                }
            }
            cr cr2 = (cr)bH.cr.g();
            while (cr2 != null) {
                cr2.f -= n12 * -401458613;
                cr2.j -= n13 * -1241200405;
                if (cr2.f * 754007907 < 0 || cr2.j * 1618190275 < 0 || cr2.f * 754007907 >= 104 || cr2.j * 1618190275 >= 104) {
                    cr2.m();
                }
                cr2 = (cr)bH.cr.e();
            }
            if (bH.em * -1846442735 != 0) {
                bH.em -= n12 * -2075522063;
                bH.en -= n13 * -700155223;
            }
            bH.eu = 0;
            bH.eA = false;
            bH.eh = -1611844029;
            bH.ct.a();
            bH.cs.a();
        }
    }
}

