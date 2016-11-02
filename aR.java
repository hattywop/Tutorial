/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Font;
import java.io.File;
import java.net.URL;
import java.util.Hashtable;

public class aR {
    protected static Font a;
    static File b;
    static byte[][] c;
    static boolean d;
    static Hashtable e;

    static boolean a() {
        try {
            if (cC.b == null) {
                cC.b = new bQ(aK.c, new URL(aw.c));
            } else {
                byte[] arrby = cC.b.a();
                if (arrby != null) {
                    cY cY2 = new cY(arrby);
                    dC.j = cY2.f() * 1895949711;
                    aE.a = new dC[dC.j * 1121294703];
                    for (int i2 = 0; i2 < dC.j * 1121294703; ++i2) {
                        dC dC2 = aE.a[i2] = new dC();
                        dC2.c = cY2.f() * -469751453;
                        int n2 = cY2.i();
                        dC2.d = n2 * 1718530509;
                        dC2.a = cY2.l();
                        dC2.f = cY2.l();
                        dC2.h = cY2.d() * 1614881501;
                        dC2.b = cY2.g() * -2010623293;
                        dC2.g = i2 * -1258830737;
                    }
                    ba.a(aE.a, 0, aE.a.length - 1, dC.m, dC.l, 2046332763);
                    cC.b = null;
                    return true;
                }
            }
        }
        catch (Exception var0_1) {
            var0_1.printStackTrace();
            cC.b = null;
        }
        return false;
    }

    static final void a(int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9 = 256;
        if ((cQ.o += n2 * 481926528) * 348057075 > aV.a.length) {
            cQ.o -= aV.a.length * -1472629957;
            n6 = (int)(Math.random() * 12.0);
            if (!bH.B) {
                dj.a(ca.d[n6]);
            }
        }
        n6 = 0;
        int n10 = n2 * 128;
        int n11 = (n9 - n2) * 128;
        for (n4 = 0; n4 < n11; ++n4) {
            n8 = av.d[n6 + n10] - aV.a[n6 + cQ.o * 348057075 & aV.a.length - 1] * n2 / 6;
            if (n8 < 0) {
                n8 = 0;
            }
            av.d[n6++] = n8;
        }
        for (n4 = n9 - n2; n4 < n9; ++n4) {
            n8 = n4 * 128;
            for (n7 = 0; n7 < 128; ++n7) {
                n5 = (int)(Math.random() * 100.0);
                av.d[n7 + n8] = n5 < 50 && n7 > 10 && n7 < 118 ? 255 : 0;
            }
        }
        if (cQ.m * 948700643 > 0) {
            cQ.m -= n2 * 961388332;
        }
        if (cQ.n * -476800185 > 0) {
            // empty if block
        }
        if (cQ.m * 948700643 == 0 && (cQ.n -= n2 * -1058375204) * -476800185 == 0) {
            n4 = (int)(Math.random() * (double)(2000 / n2));
            if (n4 == 0) {
                cQ.m = 1302277120;
            }
            if (n4 == 1) {
                cQ.n = -361112576;
            }
        }
        for (n4 = 0; n4 < n9 - n2; ++n4) {
            cQ.l[n4] = cQ.l[n2 + n4];
        }
        for (n4 = n9 - n2; n4 < n9; ++n4) {
            cQ.l[n4] = (int)(Math.sin((double)(cQ.r * -133635249) / 14.0) * 16.0 + Math.sin((double)(cQ.r * -133635249) / 15.0) * 14.0 + Math.sin((double)(cQ.r * -133635249) / 16.0) * 12.0);
            cQ.r += 1705399215;
        }
        cQ.p += n2 * -903418597;
        n4 = ((bH.S * 1026470457 & 1) + n2) / 2;
        if (n4 > 0) {
            int n12;
            for (n8 = 0; n8 < cQ.p * -1921483924; ++n8) {
                n7 = (int)(Math.random() * 124.0) + 2;
                n5 = (int)(Math.random() * 128.0) + 128;
                av.d[n7 + (n5 << 7)] = 192;
            }
            cQ.p = 0;
            for (n8 = 0; n8 < n9; ++n8) {
                n7 = 0;
                n5 = n8 * 128;
                for (n12 = - n4; n12 < 128; ++n12) {
                    if (n4 + n12 < 128) {
                        n7 += av.d[n4 + n5 + n12];
                    }
                    if (n12 - (1 + n4) >= 0) {
                        n7 -= av.d[n5 + n12 - (1 + n4)];
                    }
                    if (n12 < 0) continue;
                    v.a[n12 + n5] = n7 / (n4 * 2 + 1);
                }
            }
            for (n8 = 0; n8 < 128; ++n8) {
                n7 = 0;
                for (n5 = - n4; n5 < n9; ++n5) {
                    n12 = n5 * 128;
                    if (n5 + n4 < n9) {
                        n7 += v.a[n4 * 128 + n12 + n8];
                    }
                    if (n5 - (1 + n4) >= 0) {
                        n7 -= v.a[n8 + n12 - (1 + n4) * 128];
                    }
                    if (n5 < 0) continue;
                    av.d[n12 + n8] = n7 / (n4 * 2 + 1);
                }
            }
        }
    }

    static {
        d = false;
        e = new Hashtable(16);
    }
}

