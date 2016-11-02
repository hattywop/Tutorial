/*
 * Decompiled with CFR 0_118.
 */
public class dj
extends cF {
    Object[] a;
    boolean b;
    int c;
    int d;
    cZ e;
    int f;
    cZ g;
    int h;
    int i;
    String j;
    int k;
    static p l;

    static void a() {
        ce ce2 = (ce)bH.cS.a();
        while (ce2 != null) {
            int n2 = ce2.a * -1385416029;
            if (bZ.a(n2)) {
                int n3;
                cZ cZ2;
                boolean bl2 = true;
                cZ[] arrcZ = cZ.e[n2];
                for (n3 = 0; n3 < arrcZ.length; ++n3) {
                    if (arrcZ[n3] == null) continue;
                    bl2 = arrcZ[n3].r;
                    break;
                }
                if (!bl2 && (cZ2 = aK.a(n3 = (int)ce2.am)) != null) {
                    bw.a(cZ2);
                }
            }
            ce2 = (ce)bH.cS.b();
        }
    }

    static String a(String string, boolean bl2) {
        String string2;
        String string3 = string2 = !bl2 ? "http://" : "https://";
        if (bH.I * -134799277 == 1) {
            string = string + "-wtrc";
        } else if (bH.I * -134799277 == 2) {
            string = string + "-wtqa";
        } else if (bH.I * -134799277 == 3) {
            string = string + "-wtwip";
        } else if (bH.I * -134799277 == 5) {
            string = string + "-wti";
        } else if (bH.I * -134799277 == 4) {
            string = "local";
        }
        String string4 = "";
        if (bH.K != null) {
            string4 = "/p=" + bH.K;
        }
        String string5 = "www.os-scape.com/";
        return string2 + string5;
    }

    static void a(cN cN2) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 256;
        for (n4 = 0; n4 < aV.a.length; ++n4) {
            aV.a[n4] = 0;
        }
        for (n4 = 0; n4 < 5000; ++n4) {
            n2 = (int)(Math.random() * 128.0 * (double)n6);
            aV.a[n2] = (int)(Math.random() * 256.0);
        }
        for (n4 = 0; n4 < 20; ++n4) {
            for (n2 = 1; n2 < n6 - 1; ++n2) {
                for (n3 = 1; n3 < 127; ++n3) {
                    n5 = (n2 << 7) + n3;
                    aa.a[n5] = (aV.a[n5 + 128] + aV.a[n5 - 1] + aV.a[1 + n5] + aV.a[n5 - 128]) / 4;
                }
            }
            int[] arrn = aV.a;
            aV.a = aa.a;
            aa.a = arrn;
        }
        if (cN2 != null) {
            n4 = 0;
            for (n2 = 0; n2 < cN2.f; ++n2) {
                for (n3 = 0; n3 < cN2.e; ++n3) {
                    if (cN2.d[n4++] == 0) continue;
                    n5 = 16 + n3 + cN2.g;
                    int n7 = 16 + n2 + cN2.h;
                    int n8 = (n7 << 7) + n5;
                    aV.a[n8] = 0;
                }
            }
        }
    }

    public static cX[] a(a a2, String string, String string2) {
        int n2 = a2.a(string);
        int n3 = a2.a(n2, string2, -73);
        return aA.a(a2, n2, n3, 16);
    }

    public static boolean a(int n2, int n3) {
        return (n2 >> n3 + 1 & 1) != 0;
    }
}

