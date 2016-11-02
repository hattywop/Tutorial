/*
 * Decompiled with CFR 0_118.
 */
public class bp {
    static final void a(cZ cZ2, int n2, int n3) {
        if (!(bH.eo * 382216283 != 0 && bH.eo * 382216283 != 3 || cD.n * 332680755 != 1 && (aG.f || cD.n * 332680755 != 4))) {
            x x2 = cZ2.a(31);
            if (x2 == null) {
                return;
            }
            int n4 = cD.o * 1837550337 - n2;
            int n5 = cD.p * -1013575437 - n3;
            if (x2.a(n4, n5, -1653816978)) {
                int n6 = bH.bs * -1072839225 + bH.bf * 1847328669 & 2047;
                int n7 = de.t[n6];
                int n8 = de.u[n6];
                n7 = (256 + bH.bh * 461573195) * n7 >> 8;
                n8 = n8 * (bH.bh * 461573195 + 256) >> 8;
                int n9 = (n5 -= x2.c * -633411239 / 2) * n7 + (n4 -= x2.b * -2016633209 / 2) * n8 >> 11;
                int n10 = n5 * n8 - n4 * n7 >> 11;
                int n11 = n9 + cP.ar.v * -1051150961 >> 7;
                int n12 = cP.ar.w * -844883935 - n10 >> 7;
                bH.aF.a(70);
                bH.aF.d(18);
                bH.aF.s(cb.e[82] ? (cb.e[81] ? 2 : 1) : 0);
                bH.aF.l(n12 + ce.c * 803568843);
                bH.aF.q(bw.c * -1719983039 + n11);
                bH.aF.d(n4);
                bH.aF.d(n5);
                bH.aF.e(bH.bs * -1072839225);
                bH.aF.d(57);
                bH.aF.d(bH.bf * 1847328669);
                bH.aF.d(bH.bh * 461573195);
                bH.aF.d(89);
                bH.aF.e(cP.ar.v * -1051150961);
                bH.aF.e(cP.ar.w * -844883935);
                bH.aF.d(63);
                bH.em = n11 * -2075522063;
                bH.en = n12 * -700155223;
            }
        }
    }

    static String a(int n2) {
        return "<img=" + n2 + ">";
    }
}

