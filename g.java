/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.io.IOException;

public class g
extends cF {
    static byte[][][] a;
    static int[] b;
    int c;
    int d;
    int[] e;
    int[][] f;

    public static void a(Component component, byte by2) {
        component.removeKeyListener(cb.d);
        component.removeFocusListener(cb.d);
        cb.b = -245266475;
    }

    g(int n2, byte[] arrby) {
        int n3;
        this.c = n2 * 1057589195;
        cY cY2 = new cY(arrby);
        this.d = cY2.d() * -170105547;
        this.e = new int[this.d * 35947805];
        this.f = new int[this.d * 35947805][];
        for (n3 = 0; n3 < this.d * 35947805; ++n3) {
            this.e[n3] = cY2.d();
        }
        for (n3 = 0; n3 < this.d * 35947805; ++n3) {
            this.f[n3] = new int[cY2.d()];
        }
        for (n3 = 0; n3 < this.d * 35947805; ++n3) {
            for (int i2 = 0; i2 < this.f[n3].length; ++i2) {
                this.f[n3][i2] = cY2.d();
            }
        }
    }

    public static void a(dn dn2, boolean bl2, int n2) {
        if (bq.b != null) {
            try {
                bq.b.c();
            }
            catch (Exception var3_3) {
                // empty catch block
            }
            bq.b = null;
        }
        bq.b = dn2;
        bH.a(bl2, 88);
        bq.m.h = 0;
        cY.f = null;
        bq.a = null;
        bq.n = 0;
        do {
            y y2;
            if ((y2 = (y)bq.f.a()) == null) {
                do {
                    if ((y2 = (y)bq.k.a()) == null) {
                        if (bq.q != 0) {
                            try {
                                cY cY2 = new cY(4);
                                cY2.d(4);
                                cY2.d(bq.q);
                                cY2.e(0);
                                bq.b.b(cY2.g, 0, 4);
                            }
                            catch (IOException var4_6) {
                                try {
                                    bq.b.c();
                                }
                                catch (Exception var5_7) {
                                    // empty catch block
                                }
                                bq.s += 629140595;
                                bq.b = null;
                            }
                        }
                        bq.c = 0;
                        aw.b = C.a(255) * 4667296355062474809L;
                        return;
                    }
                    bq.h.b(y2);
                    bq.i.a(y2, y2.am);
                    bq.j += 61937553;
                    bq.l += 434769637;
                } while (true);
            }
            bq.d.a(y2, y2.am);
            bq.e += 913411167;
            bq.g -= 111830449;
        } while (true);
    }
}

