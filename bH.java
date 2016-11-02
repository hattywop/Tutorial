/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class bH
extends h {
    public static n s = new n(260);
    public static boolean t = false;
    public static n u = new n(64);
    public static n v = new n(500);
    public static n w = new n(30);
    public static n x = new n(30);
    public static int y;
    static boolean z;
    static boolean A;
    static boolean B;
    static boolean C;
    static cX[] D;
    static p E;
    static p F;
    static int G;
    static int H;
    static int I;
    static int J;
    static String K;
    static int L;
    static bH M;
    static boolean N;
    static P O;
    static boolean P;
    static long Q;
    static boolean R;
    static int S;
    static int T;
    static int U;
    static int V;
    static int W;
    static int X;
    static int Y;
    static dk Z;
    static int aa;
    static long ab;
    static int ac;
    static boolean ad;
    static boolean ae;
    static boolean af;
    static long ag;
    static int ah;
    static int ai;
    static int aj;
    static boolean ak;
    static int al;
    static int am;
    static int an;
    static int ao;
    static int ap;
    static int aq;
    static int ar;
    static int as;
    static int at;
    static cY au;
    static cS av;
    static cS aw;
    static int ax;
    static int ay;
    static int az;
    static int aA;
    static int aB;
    static cG[] aC;
    static int aD;
    static int[] aE;
    static cJ aF;
    static cJ aG;
    static cJ aH;
    static int aI;
    static int aJ;
    static int aK;
    static int aL;
    static int aM;
    static int aN;
    static int aO;
    static int aP;
    static boolean aQ;
    static int aR;
    static int aS;
    static int aT;
    static df[] aU;
    static boolean aV;
    static int[][][] aW;
    static int[] aX;
    static int aY;
    static int aZ;
    static int ba;
    static int bb;
    static int bc;
    static int bd;
    static int be;
    static int bf;
    static int bg;
    static int bh;
    static int bi;
    static int bj;
    static int bk;
    static int bl;
    static int bm;
    static int bn;
    static int bo;
    static boolean bp;
    static int bq;
    static int br;
    static int bs;
    static int bt;
    static int bu;
    static int bv;
    static int bw;
    static int bx;
    static boolean by;
    static int bz;
    static int bA;
    static int bB;
    static int[] bC;
    static int[] bD;
    static int[] bE;
    static int[] bF;
    static int[] bG;
    static int[] bH;
    static int[] bI;
    static String[] bJ;
    static int[][] bK;
    static int bL;
    static int bM;
    static int bN;
    static int bO;
    static int bP;
    static int bQ;
    static int bR;
    static int bS;
    static int bT;
    static int bU;
    static int bV;
    static int bW;
    static int bX;
    static boolean bY;
    static int bZ;
    static int ca;
    static cP[] cb;
    static int cc;
    static int[] cd;
    static int ce;
    static int[] cf;
    static cY[] cg;
    static int ch;
    static int ci;
    static int cj;
    static int[] ck;
    static int[] cl;
    static String[] cm;
    static boolean[] cn;
    static int[] co;
    static int cp;
    static bA[][][] cq;
    static bA cr;
    static bA cs;
    static bA ct;
    static int[] cu;
    static int[] cv;
    static int[] cw;
    static int cx;
    static boolean cy;
    static int cz;
    static int[] cA;
    static int[] cB;
    static int[] cC;
    static int[] cD;
    static String[] cE;
    static String[] cF;
    static int cG;
    static int cH;
    static int cI;
    static int cJ;
    static int cK;
    static String cL;
    static boolean cM;
    static int cN;
    static int cO;
    static String cP;
    static String cQ;
    static int cR;
    static bP cS;
    static int cT;
    static int cU;
    static cZ cV;
    static int cW;
    static int cX;
    static int cY;
    static int cZ;
    static boolean da;
    static boolean db;
    static boolean dc;
    static cZ dd;
    static cZ de;
    static cZ df;
    static int dg;
    static int dh;
    static cZ di;
    static boolean dj;
    static int dk;
    static int dl;
    static boolean dm;
    static int dn;
    static int do;
    static boolean dp;
    static int dq;
    static int[] dr;
    static int ds;
    static int[] dt;
    static int du;
    static int[] dv;
    static int dw;
    static int dx;
    static int dy;
    static int dz;
    static int dA;
    static int dB;
    static int dC;
    static int[] dD;
    static String[] dE;
    static bA dF;
    static bA dG;
    static bA dH;
    static bP dI;
    static int dJ;
    static int dK;
    static boolean[] dL;
    static boolean[] dM;
    static boolean[] dN;
    static int[] dO;
    static int[] dP;
    static int[] dQ;
    static int[] dR;
    static int dS;
    static int dT;
    static int dU;
    static int[] dV;
    static int dW;
    static int dX;
    static String dY;
    static long[] dZ;
    static int ea;
    static int eb;
    static int[] ec;
    static int[] ed;
    static long ee;
    static String ef;
    static String eg;
    static int eh;
    static int ei;
    static int[] ej;
    static int[] ek;
    static cX[] el;
    static int em;
    static int en;
    static int eo;
    static int ep;
    static int eq;
    static boolean er;
    static int es;
    static int et;
    static int eu;
    static int[] ev;
    static int[] ew;
    static int[] ex;
    static int[] ey;
    static dr[] ez;
    static boolean eA;
    static boolean[] eB;
    static int[] eC;
    static int[] eD;
    static int[] eE;
    static int[] eF;
    static short eG;
    static short eH;
    static short eI;
    static short eJ;
    static short eK;
    static short eL;
    static short eM;
    static short eN;
    static int eO;
    static int eP;
    static int eQ;
    static int eR;
    static int eS;
    static int eT;
    static int eU;
    static aG[] eV;
    static N eW;
    static int eX;
    static bE[] eY;
    static cR eZ;
    static int fa;
    static int fb;
    static bK[] fc;
    static dn fd;
    static cX[] fe;
    static cO ff;
    static int fg;
    static p fh;
    static bG fi;
    static int fj;
    static int fk;
    static da[] fl;
    static Clipboard fm;
    static int[] fn;
    static int fo;
    static Map fp;
    static R fq;
    static T fr;
    static int fs;
    public static byte[] ft;

    static int a(cZ cZ2) {
        bX bX2 = (bX)dI.a(((long)(cZ2.bt * 1582464481) << 32) + (long)(cZ2.bu * -1395083971));
        return bX2 != null ? bX2.a : cZ2.J * 770935883;
    }

    static final void a(boolean bl2) {
        for (int i2 = 0; i2 < aD * 1974577941; ++i2) {
            cG cG2 = aC[aE[i2]];
            int n2 = (aE[i2] << 14) + 536870912;
            if (cG2 == null || !cG2.a_(670283898) || bl2 != cG2.aq.w || !cG2.aq.b(-113726317)) continue;
            int n3 = cG2.v * -1051150961 >> 7;
            int n4 = cG2.w * -844883935 >> 7;
            if (n3 < 0 || n3 >= 104 || n4 < 0 || n4 >= 104) continue;
            if (cG2.y * -357547515 == 1 && (cG2.v * -1051150961 & 127) == 64 && (cG2.w * -844883935 & 127) == 64) {
                if (bK[n3][n4] == bL * -246782549) continue;
                bH.bK[n3][n4] = bL * -246782549;
            }
            if (!cG2.aq.C) {
                n2 -= Integer.MIN_VALUE;
            }
            cr.m.a(u.d * -1093536619, cG2.v * -1051150961, cG2.w * -844883935, c.a(cG2.v * -1051150961 + (cG2.y * -1408204480 - 64), cG2.w * -844883935 + (cG2.y * -1408204480 - 64), u.d * -1093536619, -1847964236), 60 + (cG2.y * -1408204480 - 64), cG2, cG2.a * 1933495885, n2, cG2.x);
        }
    }

    public static bT a(int n2, int n3) {
        bT bT2 = (bT)bT.l.a(n2);
        if (bT2 != null) {
            return bT2;
        }
        byte[] arrby = bT.d.b(3, n2);
        bT2 = new bT();
        if (arrby != null) {
            bT2.a(new cY(arrby));
        }
        bT.l.a(bT2, n2);
        return bT2;
    }

    public static int a(byte[] arrby, int n2, int n3, int n4) {
        int n5 = -1;
        for (int i2 = n2; i2 < n3; ++i2) {
            n5 = n5 >>> 8 ^ cY.i[(n5 ^ arrby[i2]) & 255];
        }
        return n5 ^= -1;
    }

    public static int a(CharSequence charSequence) {
        int n2 = charSequence.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = (n3 << 5) - n3 + aL.a(charSequence.charAt(i2), -1305953540);
        }
        return n3;
    }

    static void a(p p2, int n2, int n3, int n4, byte by2, boolean bl2, int n5) {
        long l2 = (n2 << 16) + n3;
        y y2 = (y)bq.d.a(l2);
        if (y2 == null && (y2 = (y)bq.f.a(l2)) == null) {
            y2 = (y)bq.i.a(l2);
            if (y2 != null) {
                if (bl2) {
                    y2.b();
                    bq.d.a(y2, l2);
                    bq.j -= 61937553;
                    bq.e += 913411167;
                }
            } else {
                if (!bl2 && (y2 = (y)bq.k.a(l2)) != null) {
                    return;
                }
                y2 = new y();
                y2.c = p2;
                y2.a = n4 * -1975545549;
                y2.b = by2;
                if (bl2) {
                    bq.d.a(y2, l2);
                    bq.e += 913411167;
                } else {
                    bq.h.a(y2);
                    bq.i.a(y2, l2);
                    bq.j += 61937553;
                }
            }
        }
    }

    public static di a(Throwable throwable, String string) {
        di di2;
        if (throwable instanceof di) {
            di2 = (di)throwable;
            di2.d = di2.d + ' ' + string;
        } else {
            di2 = new di(throwable, string);
        }
        return di2;
    }

    static final byte[] a(byte[] arrby) {
        cY cY2 = new cY(arrby);
        int n2 = cY2.d();
        int n3 = cY2.i();
        if (n3 >= 0 && (fj * -1248471115 == 0 || n3 <= fj * -1248471115)) {
            if (n2 == 0) {
                byte[] arrby2 = new byte[n3];
                cY2.a(arrby2, 0, n3);
                return arrby2;
            }
            int n4 = cY2.i();
            if (n4 > 1000000) {
                System.err.println("XTEA crash intercepted; returning null bytes");
                return new byte[100];
            }
            if (n4 >= 0 && (fj * -1248471115 == 0 || n4 <= fj * -1248471115)) {
                byte[] arrby3 = new byte[n4];
                if (n2 == 1) {
                    aU.a(arrby3, n4, arrby, n3, 9);
                } else {
                    fi.a(cY2, arrby3);
                }
                return arrby3;
            }
            System.err.println("ERROR IN ARCHIVELOADING; RETURNING EMPTY ARRAY");
            return new byte[100];
        }
        throw new RuntimeException();
    }

    static byte[] a(byte[] arrby, int n2) {
        int n3 = arrby.length;
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, 0, arrby2, 0, n3);
        return arrby2;
    }

    public static Object a(byte[] arrby, boolean bl2, int n2) {
        if (arrby == null) {
            return null;
        }
        if (arrby.length > 136 && !bC.b) {
            try {
                bD bD2 = new bD();
                bD2.a(arrby, 6);
                return bD2;
            }
            catch (Throwable var3_4) {
                bC.b = true;
            }
        }
        return bl2 ? bH.a(arrby, 1909259689) : arrby;
    }

    static boolean a(String string, int n2) {
        return aY.a(string, n2);
    }

    static final void i(int n2) {
        aB.a(847197597);
        dz.i.a();
        bT.l.a();
        u.a();
        v.a();
        w.a();
        x.a();
        cH.J.a();
        cH.K.a();
        aq.a();
        d.m.a();
        d.n.a();
        bz.c(-129675959);
        cC.a(1028119334);
        aE.b(118802121);
        s.a();
        cZ.bp.a();
        cZ.bq.a();
        cZ.br.a();
        cZ.bs.a();
        ((dx)de.j).a(89);
        bz.i.a();
        aM.a.c(-669970278);
        m.a.c(1608683902);
        bw.b.c(1885095067);
        F.c(-2049641598);
        V.c.c(-41205488);
        aG.g.c(-411286526);
        am.o.c(1589042013);
        dg.c.c(-507048750);
        dj.l.c(-374052206);
        fh.c(1816423067);
        bQ.d.c(1867178164);
        dn.a.c(-1296203819);
    }

    static final void a(t t2, int n2, int n3, int n4, int n5, int n6, int n7) {
        if (t2 != null && t2.a_(-1882572939)) {
            int n8;
            cH cH2;
            if (t2 instanceof cG) {
                cH2 = ((cG)t2).aq;
                if (cH2.F != null) {
                    cH2 = cH2.a();
                }
                if (cH2 == null) {
                    return;
                }
            }
            if (n2 < cc * -796710281) {
                n8 = 30;
                cP cP2 = (cP)t2;
                if (cP2.aI) {
                    return;
                }
                if (cP2.aC * -1470097365 != -1 || cP2.aD * -1015290317 != -1) {
                    cq.a(t2, 15 + t2.ae * -1416784945, 1);
                    if (bM * 972236853 > -1) {
                        if (cP2.aC * -1470097365 != -1) {
                            cP.aA[cP2.aC * -1470097365].b(n3 + bM * 972236853 - 12, bN * 1023916389 + n4 - n8);
                            n8 += 25;
                        }
                        if (cP2.aD * -1015290317 != -1) {
                            as.a[cP2.aD * -1015290317].b(n3 + bM * 972236853 - 12, bN * 1023916389 + n4 - n8);
                            n8 += 25;
                        }
                    }
                }
                if (n2 >= 0 && am * 1066731469 == 10 && cd[n2] == ao * -1467260517) {
                    cq.a(t2, t2.ae * -1416784945 + 15, 1);
                    if (bM * 972236853 > -1) {
                        aF.a[1].b(n3 + bM * 972236853 - 12, bN * 1023916389 + n4 - n8);
                    }
                }
            } else {
                cH2 = ((cG)t2).aq;
                if (cH2.F != null) {
                    cH2 = cH2.a();
                }
                if (cH2.z * 278946575 >= 0 && cH2.z * 278946575 < as.a.length) {
                    cq.a(t2, 15 + t2.ae * -1416784945, 1);
                    if (bM * 972236853 > -1) {
                        as.a[cH2.z * 278946575].b(bM * 972236853 + n3 - 12, bN * 1023916389 + n4 - 30);
                    }
                }
                if (am * 1066731469 == 1 && an * -1890256937 == aE[n2 - cc * -796710281] && S * 1026470457 % 20 < 10) {
                    cq.a(t2, t2.ae * -1416784945 + 15, 1);
                    if (bM * 972236853 > -1) {
                        aF.a[0].b(n3 + bM * 972236853 - 12, n4 + bN * 1023916389 - 28);
                    }
                }
            }
            if (t2.H != null && (n2 >= cc * -796710281 || !t2.I && (dW * 500271761 == 4 || !t2.c && (dW * 500271761 == 0 || dW * 500271761 == 3 || dW * 500271761 == 1 && aO.a(((cP)t2).aF, false, 1407840630))))) {
                cq.a(t2, t2.ae * -1416784945, 1);
                if (bM * 972236853 > -1 && bA * -738319905 < bB * 2060170727) {
                    bH.bF[bH.bA * -738319905] = bn.a.a(t2.H) / 2;
                    bH.bE[bH.bA * -738319905] = bn.a.c;
                    bH.bC[bH.bA * -738319905] = bM * 972236853;
                    bH.bD[bH.bA * -738319905] = bN * 1023916389;
                    bH.bG[bH.bA * -738319905] = t2.K * -726164577;
                    bH.bH[bH.bA * -738319905] = t2.L * 997113459;
                    bH.bI[bH.bA * -738319905] = t2.J * -1182929285;
                    bH.bJ[bH.bA * -738319905] = t2.H;
                    bA -= 186721761;
                }
            }
            if (t2.P * -243623201 > S * 1026470457) {
                cq.a(t2, 15 + t2.ae * -1416784945, 1);
                if (bM * 972236853 > -1) {
                    void var9_15;
                    if (n2 < cc * -796710281) {
                        n8 = 30;
                    } else {
                        cH n9 = ((cG)t2).aq;
                        n8 = n9.H * 1130688757;
                    }
                    int n9 = t2.e * -1406670123 * n8 / (t2.f * 1012550093);
                    if (n9 > n8) {
                        int n10 = n8;
                    } else if (n9 == 0 && t2.e * -1406670123 > 0) {
                        boolean bl2 = true;
                    }
                    dd.b(bM * 972236853 + n3 - n8 / 2, n4 + bN * 1023916389 - 3, (int)var9_15, 5, 65280);
                    dd.b(bM * 972236853 + n3 - n8 / 2 + var9_15, n4 + bN * 1023916389 - 3, n8 - var9_15, 5, 16711680);
                }
            }
            for (n8 = 0; n8 < 4; ++n8) {
                if (t2.O[n8] <= S * 1026470457) continue;
                cq.a(t2, t2.ae * -1416784945 / 2, 1);
                if (bM * 972236853 <= -1) continue;
                if (n8 == 1) {
                    bN -= 509626500;
                }
                if (n8 == 2) {
                    bM += 303450189;
                    bN += 1892670398;
                }
                if (n8 == 3) {
                    bM -= 303450189;
                    bN += 1892670398;
                }
                c.d[t2.N[n8]].b(n3 + bM * 972236853 - 12, n4 + bN * 1023916389 - 12);
                an.a.c(Integer.toString(t2.M[n8]), n3 + bM * 972236853 - 1, 3 + n4 + bN * 1023916389, 16777215, 0);
            }
        }
    }

    public static int b(int n2, int n3) {
        int n4 = 0;
        if (n2 < 0 || n2 >= 65536) {
            n2 >>>= 16;
            n4 += 16;
        }
        if (n2 >= 256) {
            n2 >>>= 8;
            n4 += 8;
        }
        if (n2 >= 16) {
            n2 >>>= 4;
            n4 += 4;
        }
        if (n2 >= 4) {
            n2 >>>= 2;
            n4 += 2;
        }
        if (n2 >= 1) {
            n2 >>>= 1;
            ++n4;
        }
        return n2 + n4;
    }

    public static ca j(int n2) {
        int n3;
        ca ca2 = (ca)aq.k.a(n2);
        if (ca2 != null) {
            return ca2;
        }
        byte[] arrby = ca.b.b(10, n2);
        ca2 = new ca();
        ca2.c = n2 * -1222204029;
        if (arrby != null) {
            ca2.a(new cY(arrby));
        }
        if (ca2.H * -993125921 != -1) {
            ca2.a(bH.j(ca2.H * -993125921), bH.j(ca2.G * -1776131735));
        }
        if (ca2.R * -1715175993 != -1) {
            ca2.c(bH.j(ca2.R * -1715175993), bH.j(ca2.Q * -210825537));
        }
        if (ca2.V != -1) {
            ca2.b(bH.j(ca2.V), bH.j(ca2.U));
        }
        if (!aa.b && ca2.n) {
            ca2.f = du.b;
            ca2.y = false;
            ca2.S = null;
            ca2.T = null;
            ca2.P = 0;
        }
        for (n3 = 20445; n3 < 20517; n3 += 2) {
            if (n2 != n3 || ca2.T[0] != null && (ca2.T[0] == null || ca2.T[0].equals("Fix"))) continue;
            ca2.T[0] = "Fix";
        }
        for (n3 = 20537; n3 < 20543; n3 += 2) {
            if (n2 != n3 || ca2.T[0] != null && (ca2.T[0] == null || ca2.T[0].equals("Fix"))) continue;
            ca2.T[0] = "Fix";
        }
        if (n2 == 12020) {
            ca2.f = "Dice Bag";
            ca2.T[0] = "Roll";
            ca2.T[1] = null;
            ca2.T[2] = null;
            ca2.T[3] = null;
            ca2.T[4] = null;
        }
        if (n2 == 5520) {
            ca2.f = "Q&A Book";
        }
        if (n2 == 13438) {
            ca2.f = "3rd Age Mystery Box";
            ca2.T[0] = "Open";
            ca2.T[1] = null;
            ca2.T[2] = null;
            ca2.T[3] = null;
            ca2.T[4] = null;
        }
        if (n2 == 8148) {
            ca2.f = "Pet Box";
            ca2.T = new String[]{"Open", null, null, null, null};
        }
        if (n2 == 1857) {
            ca2.T = new String[5];
            ca2.T[0] = "0: Select";
            ca2.T[1] = "1: Equip";
            ca2.T[2] = "2: Op1";
            ca2.T[3] = "3: Op2";
            ca2.T[4] = "4: Drop";
            ca2.S = new String[5];
            ca2.S[0] = "action-0: ?";
            ca2.S[1] = "action-1: ?";
            ca2.S[2] = "action-2: pickup";
            ca2.S[3] = "action-3: lay";
            ca2.S[4] = "action-4: ?";
        }
        if (n2 == 717) {
            ca2.f = "Count's Clues";
        }
        if (n2 == 20766) {
            ca2.f = "Count's Key";
        }
        aq.k.a(ca2, n2);
        return ca2;
    }

    static void b(int n2, int n3, int n4, int n5) {
        bZ bZ2 = (bZ)bZ.e.a(n2);
        if (bZ2 == null) {
            bZ2 = new bZ();
            bZ.e.a(bZ2, n2);
        }
        if (bZ2.a.length <= n3) {
            int n6;
            int[] arrn = new int[n3 + 1];
            int[] arrn2 = new int[n3 + 1];
            for (n6 = 0; n6 < bZ2.a.length; ++n6) {
                arrn[n6] = bZ2.a[n6];
                arrn2[n6] = bZ2.b[n6];
            }
            for (n6 = bZ2.a.length; n6 < n3; ++n6) {
                arrn[n6] = -1;
                arrn2[n6] = 0;
            }
            bZ2.a = arrn;
            bZ2.b = arrn2;
        }
        bZ2.a[n3] = n4;
        bZ2.b[n3] = n5;
    }

    public static bz k(int n2) {
        bz bz2 = (bz)bz.i.a(n2);
        if (bz2 != null) {
            return bz2;
        }
        byte[] arrby = dn.a.b(n2, 0);
        if (arrby == null) {
            return null;
        }
        bz2 = new bz();
        cY cY2 = new cY(arrby);
        cY2.h = (cY2.g.length - 12) * 1303963473;
        int n3 = cY2.i();
        bz2.c = cY2.f() * 1801124909;
        bz2.d = cY2.f() * 995599977;
        bz2.h = cY2.f() * 1944843387;
        bz2.f = cY2.f() * 1998161553;
        cY2.h = 0;
        cY2.k();
        bz2.g = new int[n3];
        bz2.b = new int[n3];
        bz2.a = new String[n3];
        int n4 = 0;
        while (cY2.h * 1736753585 < cY2.g.length - 12) {
            int n5 = cY2.f();
            if (n5 == 3) {
                bz2.a[n4] = cY2.l();
            } else {
                bz2.b[n4] = n5 < 100 && n5 != 21 && n5 != 38 && n5 != 39 ? cY2.i() : cY2.d();
            }
            bz2.g[n4++] = n5;
        }
        bz.i.a(bz2, n2);
        return bz2;
    }

    static final void l(int n2) {
        int n3;
        while (aH.c(aI * 1964753529) >= 11 && (n3 = aH.b(11)) != 2047) {
            int n4;
            boolean bl2 = false;
            if (cb[n3] == null) {
                bH.cb[n3] = new cP();
                if (cg[n3] != null) {
                    cb[n3].a(cg[n3]);
                }
                bl2 = true;
            }
            bH.cd[(bH.cc -= 549466297) * -796710281 - 1] = n3;
            cP cP2 = cb[n3];
            cP2.ad = S * 489897939;
            int n5 = aH.b(5);
            if (n5 > 15) {
                n5 -= 32;
            }
            if ((n4 = aH.b(5)) > 15) {
                n4 -= 32;
            }
            int n6 = co[aH.b(3)];
            if (bl2) {
                cP2.a = n6 * 1352080005;
                cP2.b = cP2.a * -601642305;
            }
            int n7 = aH.b(1);
            int n8 = aH.b(1);
            if (n8 == 1) {
                bH.cf[(bH.ce -= 302765877) * -435618589 - 1] = n3;
            }
            cP2.a(n4 + cP.ar.ah[0], n5 + cP.ar.ai[0], n7 == 1, 14);
        }
        aH.c();
    }

    @Override
    public final void init() {
        if (this.b(-1902859617)) {
            int n2;
            int n3;
            Object object;
            Object object2;
            String string;
            Object object3;
            bs[] arrbs;
            int n4;
            bs[] arrbs2 = arrbs = new bs[]{bs.h, bs.p, bs.f, bs.i, bs.k, bs.m, bs.d, bs.n, bs.l, bs.c, bs.g, bs.q, bs.j, bs.e, bs.o};
            block26 : for (n3 = 0; n3 < arrbs2.length; ++n3) {
                object3 = arrbs2[n3];
                string = Loader.b(object3.b);
                if (string == null) continue;
                switch (Integer.parseInt(object3.b)) {
                    case 2: {
                        if (string.equalsIgnoreCase(aB.b)) {
                            N = true;
                            continue block26;
                        }
                        N = false;
                        continue block26;
                    }
                    case 3: {
                        G = Integer.parseInt(string) * -675594525;
                        continue block26;
                    }
                    case 4: {
                        cU.a = (bJ)bU.a(aY.a(), Integer.parseInt(string), 2052635667);
                        if (cU.a == bJ.f) {
                            O = P.a;
                            continue block26;
                        }
                        O = P.b;
                    }
                    default: {
                        continue block26;
                    }
                    case 6: {
                        fo = Integer.parseInt(string) * -557911611;
                        continue block26;
                    }
                    case 7: {
                        H = Integer.parseInt(string) * -1614837605;
                        continue block26;
                    }
                    case 9: {
                        I = Integer.parseInt(string) * -73128997;
                        continue block26;
                    }
                    case 10: {
                        J = Integer.parseInt(string) * -1172587151;
                        continue block26;
                    }
                    case 11: {
                        K = string;
                        continue block26;
                    }
                    case 12: {
                        L = Integer.parseInt(string) * -1553215559;
                        continue block26;
                    }
                    case 13: {
                        if (!string.equalsIgnoreCase(aB.b)) continue block26;
                        continue block26;
                    }
                    case 14: {
                        aw.c = "http://world1.os-scape.com:8181/worldlist.ws";
                        continue block26;
                    }
                    case 15: {
                        n4 = Integer.parseInt(string);
                        object2 = new m[]{m.e, m.d, m.b, m.c};
                        m[] arrm = object2;
                        n2 = 0;
                        do {
                            if (n2 >= arrm.length) {
                                object2 = null;
                                break;
                            }
                            object = arrm[n2];
                            if (object.g * 213306333 == n4) {
                                object2 = object;
                                break;
                            }
                            ++n2;
                        } while (true);
                        f.a = object2;
                    }
                }
            }
            dC.g();
            C.a = this.getCodeBase().getHost();
            de.a(new int[26], new int[12], -12858125, 2, 7, 16, 16, 32, 32, -1, -1, 3, false);
            object3 = f.a.f;
            int n5 = 0;
            try {
                bg.b = 1674653552;
                bg.d = n5 * -718316497;
                try {
                    ay.l = System.getProperty("os.name");
                }
                catch (Exception var9_11) {
                    ay.l = "Unknown";
                }
                cf.b = ay.l.toLowerCase();
                try {
                    o.d = System.getProperty("user.home");
                    if (o.d != null) {
                        o.d = o.d + "/";
                    }
                }
                catch (Exception var9_12) {
                    // empty catch block
                }
                try {
                    if (cf.b.startsWith("win")) {
                        if (o.d == null) {
                            o.d = System.getenv("USERPROFILE");
                        }
                    } else if (o.d == null) {
                        o.d = System.getenv("HOME");
                    }
                    if (o.d != null) {
                        o.d = o.d + "/";
                    }
                }
                catch (Exception var9_13) {
                    // empty catch block
                }
                if (o.d == null) {
                    o.d = "~/";
                }
                aU.a(62);
                o.e = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", o.d, "/tmp/", ""};
                bg.c = new String[]{".osscape_cache_" + bg.d * -960009521};
                block28 : for (n3 = 0; n3 < 4; ++n3) {
                    int n6;
                    Object object4;
                    Object object5;
                    File file;
                    string = n3 == 0 ? "" : "" + n3;
                    object2 = new File(o.d + File.separatorChar + ".osscape");
                    if (!object2.exists()) {
                        object2.mkdirs();
                    }
                    bl.a = new File(o.d + File.separatorChar + ".osscape", "osscape_cl_oldschool_" + (String)object3 + string + ".dat");
                    object = null;
                    String string2 = null;
                    boolean bl2 = false;
                    if (bl.a.exists()) {
                        try {
                            int n7;
                            object5 = new o(bl.a, "rw", 10000);
                            object4 = new File[]((int)object5.b());
                            while (object4.h * 1736753585 < object4.g.length) {
                                n7 = object5.a(object4.g, object4.h * 1736753585, object4.g.length - object4.h * 1736753585);
                                if (n7 == -1) {
                                    throw new IOException();
                                }
                                object4.h += n7 * 1303963473;
                            }
                            object4.h = 0;
                            n7 = object4.d();
                            if (n7 < 1 || n7 > 3) {
                                throw new IOException("" + n7);
                            }
                            n6 = 0;
                            if (n7 > 1) {
                                n6 = object4.d();
                            }
                            if (n7 <= 2) {
                                object = object4.o();
                                if (n6 == 1) {
                                    string2 = object4.o();
                                }
                            } else {
                                object = object4.G();
                                if (n6 == 1) {
                                    string2 = object4.G();
                                }
                            }
                            object5.a();
                        }
                        catch (IOException var14_20) {
                            var14_20.printStackTrace();
                        }
                        if (object != null && !(file = new File((String)object)).exists()) {
                            object = null;
                        }
                        if (object != null && !A.a(file = new File((String)object, "test.dat"), true)) {
                            object = null;
                        }
                    }
                    if (object == null && n3 == 0) {
                        block30 : for (int i2 = 0; i2 < bg.c.length; ++i2) {
                            for (n2 = 0; n2 < o.e.length; ++n2) {
                                object4 = new File(o.e[n2] + bg.c[i2] + File.separatorChar + "oldschool" + File.separatorChar);
                                if (!object4.exists() || !A.a(new File((File)object4, "test.dat"), true)) continue;
                                object = object4.toString();
                                bl2 = true;
                                break block30;
                            }
                        }
                    }
                    if (object == null) {
                        object = o.d + File.separatorChar + ".osscape" + string + File.separatorChar + "cache" + File.separatorChar + "oldschool" + File.separatorChar + (String)object3 + File.separatorChar;
                        bl2 = true;
                    }
                    if (string2 != null) {
                        object5 = new File(string2);
                        file = new File((String)object);
                        try {
                            object4 = object5.listFiles();
                            File[] arrfile = object4;
                            for (n6 = 0; n6 < arrfile.length; ++n6) {
                                File file2 = arrfile[n6];
                                File file3 = new File(file, file2.getName());
                                boolean bl3 = file2.renameTo(file3);
                                if (bl3) continue;
                                throw new IOException();
                            }
                        }
                        catch (Exception var15_23) {
                            var15_23.printStackTrace();
                        }
                        bl2 = true;
                    }
                    if (bl2) {
                        bs.a(new File((String)object), null);
                    }
                    if (!(bg.a = (object5 = new File((String)object))).exists()) {
                        bg.a.mkdirs();
                    }
                    if ((object4 = bg.a.listFiles()) == null) break;
                    File[] arrfile = object4;
                    for (n4 = 0; n4 < arrfile.length; ++n4) {
                        File file4 = arrfile[n4];
                        if (A.a(file4, false)) continue;
                        continue block28;
                    }
                }
                dC.a(bg.a);
                u.a(126);
                bg.g = new ac(new o(ax.a("main_file_cache.dat2", -21), "rw", 1048576000), 5200, 0);
                bg.h = new ac(new o(ax.a("main_file_cache.idx255", -11), "rw", 0x100000), 6000, 0);
                aP.c = new ac[bg.b * 1014582983];
                for (n3 = 0; n3 < bg.b * 1014582983; ++n3) {
                    aP.c[n3] = new ac(new o(ax.a("main_file_cache.idx" + n3, -94), "rw", 0x100000), 6000, 0);
                }
            }
            catch (Exception var9_14) {
                ba.a(null, var9_14, 1);
            }
            M = this;
            this.a(765, 503, 86, -64415416);
        }
    }

    @Override
    protected final void c(int n2) {
        bb bb2;
        c.e = 1098229281 * (I * -134799277 == 0 ? Loader.b : 40000 + J * 1425499025);
        bT.b = -417358633 * (I * -134799277 == 0 ? 443 : J * 1425499025 + 50000);
        dC.i = c.e * 471081033;
        by.e = by.a;
        by.f = by.b;
        by.h = by.c;
        by.g = by.d;
        if (dl.f.toLowerCase().indexOf("microsoft") != -1) {
            cb.n[186] = 57;
            cb.n[187] = 27;
            cb.n[188] = 71;
            cb.n[189] = 26;
            cb.n[190] = 72;
            cb.n[191] = 73;
            cb.n[192] = 58;
            cb.n[219] = 42;
            cb.n[220] = 74;
            cb.n[221] = 43;
            cb.n[222] = 59;
            cb.n[223] = 28;
        } else {
            cb.n[44] = 71;
            cb.n[45] = 26;
            cb.n[46] = 72;
            cb.n[47] = 73;
            cb.n[59] = 57;
            cb.n[61] = 27;
            cb.n[91] = 42;
            cb.n[92] = 74;
            cb.n[93] = 43;
            cb.n[192] = 28;
            cb.n[222] = 58;
            cb.n[520] = 59;
        }
        Canvas canvas = aQ.b;
        canvas.setFocusTraversalKeysEnabled(false);
        canvas.addKeyListener(cb.d);
        canvas.addFocusListener(cb.d);
        Canvas canvas2 = aQ.b;
        canvas2.addMouseListener(cD.j);
        canvas2.addMouseMotionListener(cD.j);
        canvas2.addFocusListener(cD.j);
        try {
            bb2 = new bb();
        }
        catch (Throwable var5_5) {
            bb2 = null;
        }
        aA.c = bb2;
        if (aA.c != null) {
            aA.c.a((Component)aQ.b, 50);
        }
        x.a = new aW(255, bg.g, bg.h, 500000);
        o o2 = null;
        bw bw2 = new bw();
        try {
            int n3;
            o2 = o.a("", cU.a.g, false, 963366455);
            byte[] arrby = new byte[(int)o2.b()];
            for (int i2 = 0; i2 < arrby.length; i2 += n3) {
                n3 = o2.a(arrby, i2, arrby.length - i2);
                if (n3 != -1) continue;
                throw new IOException();
            }
            bw2 = new bw(new cY(arrby));
        }
        catch (Exception var7_9) {
            // empty catch block
        }
        try {
            if (o2 != null) {
                o2.a();
            }
        }
        catch (Exception var7_10) {
            // empty catch block
        }
        ag.d = bw2;
        fm = this.getToolkit().getSystemClipboard();
        dz.a(this, bG.a);
        if (I * -134799277 != 0) {
            P = true;
        }
        int n4 = ag.d.d * 1158077189;
        Q = 0;
        R = n4 >= 2;
        bv.a();
        if (X * -684224463 >= 25) {
            aF.a(141);
            aF.d(cq.e(-1412378987));
            aF.e(aJ.f * 2104430923);
            aF.e(aQ.a * -1064642111);
        }
        d = true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected final void e(int n2) {
        S += 650746889;
        this.e(98);
        do {
            cj cj2;
            bA bA2 = D.c;
            Object object = bA2;
            synchronized (object) {
                cj2 = (cj)D.d.c();
            }
            if (cj2 == null) {
                Throwable throwable;
                int n3;
                aA.a(8);
                cL.a();
                Object object2 = object = cb.d;
                synchronized (object2) {
                    cb.a += 365711147;
                    cb.l = cb.m * 776092841;
                    cb.k = 0;
                    if (cb.b * -1022982525 >= 0) {
                        while (cb.g * 20527529 != cb.b * -1022982525) {
                            n3 = cb.f[cb.g * 20527529];
                            cb.g = (cb.g * 20527529 + 1 & 127) * -1409123687;
                            if (n3 < 0) {
                                cb.e[n3 ^ -1] = false;
                                continue;
                            }
                            if (!cb.e[n3] && cb.k * 81863853 < cb.j.length - 1) {
                                cb.j[(cb.k -= 1947214043) * 81863853 - 1] = n3;
                            }
                            cb.e[n3] = true;
                        }
                    } else {
                        for (n3 = 0; n3 < 112; ++n3) {
                            cb.e[n3] = false;
                        }
                        cb.b = cb.g * -604903581;
                    }
                    cb.m = cb.c * -1893425567;
                }
                Object object3 = object2 = cD.j;
                synchronized (object3) {
                    cD.k = cD.c * 1405368281;
                    cD.l = cD.d * 1008788163;
                    cD.m = cD.e * 1954754289;
                    cD.n = cD.i * -1237391709;
                    cD.o = cD.f * -1825792431;
                    cD.p = cD.g * 1805479901;
                    cD.q = cD.h * -1270734219713552515L;
                    cD.i = 0;
                }
                if (aA.c != null) {
                    int n4 = aA.c.a(117);
                    T = n4 * 1547349623;
                }
                if (X * -684224463 == 0) {
                    bz.b(-1825976783);
                    cJ.a.a(-19);
                    for (throwable = (Throwable)false ? 1 : 0; throwable < 32; ++throwable) {
                        bH.l[throwable] = 0;
                    }
                    for (throwable = (Throwable)false ? 1 : 0; throwable < 32; ++throwable) {
                        bH.m[throwable] = 0;
                    }
                    b.d = 0;
                } else if (X * -684224463 == 5) {
                    bH.a();
                    bz.b(-2090491589);
                    cJ.a.a(-84);
                    for (throwable = (Throwable)false ? 1 : 0; throwable < 32; ++throwable) {
                        bH.l[throwable] = 0;
                    }
                    for (throwable = (Throwable)false ? 1 : 0; throwable < 32; ++throwable) {
                        bH.m[throwable] = 0;
                    }
                    b.d = 0;
                } else if (X * -684224463 != 10 && X * -684224463 != 11) {
                    if (X * -684224463 == 20) {
                        bH.a();
                        aF.a(-23);
                    } else if (X * -684224463 == 25) {
                        aK.a(false, 2096072399);
                        U = 0;
                        boolean bl2 = true;
                        for (n3 = 0; n3 < aR.c.length; ++n3) {
                            if (t.d[n3] != -1 && aR.c[n3] == null) {
                                aR.c[n3] = V.c.b(t.d[n3], 0);
                                if (aR.c[n3] == null) {
                                    bl2 = false;
                                    U += 214469313;
                                }
                            }
                            if (bd.a[n3] == -1 || av.b[n3] != null) continue;
                            av.b[n3] = V.c.a(bd.a[n3], 0, av.c[n3]);
                            if (av.b[n3] != null) continue;
                            bl2 = false;
                            U += 214469313;
                        }
                        if (!bl2) {
                            W = 809934399;
                        } else {
                            byte[] arrby;
                            int n5;
                            int n6;
                            V = 0;
                            bl2 = true;
                            for (n3 = 0; n3 < aR.c.length; ++n3) {
                                arrby = av.b[n3];
                                if (arrby == null) continue;
                                n5 = (g.b[n3] >> 8) * 64 - bw.c * -1719983039;
                                n6 = (g.b[n3] & 255) * 64 - ce.c * 803568843;
                                if (aV) {
                                    n5 = 10;
                                    n6 = 10;
                                }
                                bl2 &= dp.a(arrby, n5, n6);
                            }
                            if (!bl2) {
                                W = 1619868798;
                            } else {
                                int n7;
                                int n8;
                                if (W * 1765953983 != 0) {
                                    aL.a(du.l + aB.h + aB.e + 100 + "%" + aB.f, true, -1714673297);
                                }
                                cL.a();
                                bH.i(1600056708);
                                cL.a();
                                cr.m.a();
                                cL.a();
                                System.gc();
                                for (n3 = 0; n3 < 4; ++n3) {
                                    aU[n3].a(-49);
                                }
                                for (n3 = 0; n3 < 4; ++n3) {
                                    for (int i2 = 0; i2 < 104; ++i2) {
                                        for (n5 = 0; n5 < 104; ++n5) {
                                            ax.i[n3][i2][n5] = 0;
                                        }
                                    }
                                }
                                cL.a();
                                S.a();
                                n3 = aR.c.length;
                                C.a(1119335650);
                                aK.a(true, 2096072399);
                                if (!aV) {
                                    byte[] arrby2;
                                    int n9;
                                    for (n9 = 0; n9 < n3; ++n9) {
                                        n5 = (g.b[n9] >> 8) * 64 - bw.c * -1719983039;
                                        n6 = (g.b[n9] & 255) * 64 - ce.c * 803568843;
                                        arrby2 = aR.c[n9];
                                        if (arrby2 == null) continue;
                                        cL.a();
                                        b.a(arrby2, n5, n6, c.c * -305307080 - 48, ao.a * 1126344264 - 48, aU, 8);
                                    }
                                    for (n9 = 0; n9 < n3; ++n9) {
                                        n5 = (g.b[n9] >> 8) * 64 - bw.c * -1719983039;
                                        n6 = (g.b[n9] & 255) * 64 - ce.c * 803568843;
                                        arrby2 = aR.c[n9];
                                        if (arrby2 != null || ao.a * -932948791 >= 800) continue;
                                        cL.a();
                                        bq.a(n5, n6, 64, 64, 1602338140);
                                    }
                                    aK.a(true, 2096072399);
                                    for (n9 = 0; n9 < n3; ++n9) {
                                        byte[] arrby3 = av.b[n9];
                                        if (arrby3 == null) continue;
                                        n6 = (g.b[n9] >> 8) * 64 - bw.c * -1719983039;
                                        n8 = (g.b[n9] & 255) * 64 - ce.c * 803568843;
                                        cL.a();
                                        ce.a(arrby3, n6, n8, cr.m, aU);
                                    }
                                }
                                if (aV) {
                                    arrby = (byte[])false ? 1 : 0;
                                    do {
                                        int n10;
                                        int n11;
                                        int n12;
                                        if (arrby >= 4) {
                                            for (arrby = (byte[])false ? 1 : 0; arrby < 13; ++arrby) {
                                                for (n5 = 0; n5 < 13; ++n5) {
                                                    n6 = aW[0][arrby][n5];
                                                    if (n6 != -1) continue;
                                                    bq.a((int)(arrby * 8), n5 * 8, 8, 8, -1106805124);
                                                }
                                            }
                                            aK.a(true, 2096072399);
                                            for (arrby = (byte[])false ? 1 : 0; arrby < 4; ++arrby) {
                                                cL.a();
                                                for (n5 = 0; n5 < 13; ++n5) {
                                                    block30 : for (n6 = 0; n6 < 13; ++n6) {
                                                        n8 = aW[arrby][n5][n6];
                                                        if (n8 == -1) continue;
                                                        int n13 = n8 >> 24 & 3;
                                                        int n14 = n8 >> 1 & 3;
                                                        n7 = n8 >> 14 & 1023;
                                                        n12 = n8 >> 3 & 2047;
                                                        n11 = n12 / 8 + (n7 / 8 << 8);
                                                        for (n10 = 0; n10 < g.b.length; ++n10) {
                                                            if (n11 != g.b[n10] || av.b[n10] == null) continue;
                                                            dz.a(av.b[n10], (int)arrby, n5 * 8, n6 * 8, n13, (n7 & 7) * 8, (n12 & 7) * 8, n14, cr.m, aU, 1768800462);
                                                            continue block30;
                                                        }
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        cL.a();
                                        for (n5 = 0; n5 < 13; ++n5) {
                                            for (n6 = 0; n6 < 13; ++n6) {
                                                boolean bl3 = false;
                                                int n15 = aW[arrby][n5][n6];
                                                if (n15 != -1) {
                                                    int n16 = n15 >> 24 & 3;
                                                    n7 = n15 >> 1 & 3;
                                                    n12 = n15 >> 14 & 1023;
                                                    n11 = n15 >> 3 & 2047;
                                                    n10 = n11 / 8 + (n12 / 8 << 8);
                                                    for (int i3 = 0; i3 < g.b.length; ++i3) {
                                                        int n17;
                                                        if (n10 != g.b[i3] || aR.c[i3] == null) continue;
                                                        byte[] arrby4 = aR.c[i3];
                                                        int n18 = n5 * 8;
                                                        int n19 = n6 * 8;
                                                        int n20 = (n12 & 7) * 8;
                                                        int n21 = (n11 & 7) * 8;
                                                        df[] arrdf = aU;
                                                        for (int i4 = 0; i4 < 8; ++i4) {
                                                            for (n17 = 0; n17 < 8; ++n17) {
                                                                if (i4 + n18 <= 0 || n18 + i4 >= 103 || n19 + n17 <= 0 || n19 + n17 >= 103) continue;
                                                                int[] arrn = arrdf[arrby].f[n18 + i4];
                                                                int n22 = n19 + n17;
                                                                arrn[n22] = arrn[n22] & -16777217;
                                                            }
                                                        }
                                                        cY cY2 = new cY(arrby4);
                                                        for (n17 = 0; n17 < 4; ++n17) {
                                                            for (int i5 = 0; i5 < 64; ++i5) {
                                                                for (int i6 = 0; i6 < 64; ++i6) {
                                                                    if (n17 == n16 && i5 >= n20 && i5 < 8 + n20 && i6 >= n21 && i6 < n21 + 8) {
                                                                        aL.a(cY2, (int)arrby, n18 + ax.a(i5 & 7, i6 & 7, n7, -15), n19 + Y.a(i5 & 7, i6 & 7, n7), 0, 0, n7, -436015020);
                                                                        continue;
                                                                    }
                                                                    aL.a(cY2, 0, -1, -1, 0, 0, 0, 843850242);
                                                                }
                                                            }
                                                        }
                                                        bl3 = true;
                                                        break;
                                                    }
                                                }
                                                if (bl3) continue;
                                                bz.a((int)arrby, n5 * 8, n6 * 8, 1672071013);
                                            }
                                        }
                                        ++arrby;
                                    } while (true);
                                }
                                aK.a(true, 2096072399);
                                bH.i(1802634026);
                                cL.a();
                                dg.a(cr.m, aU, 2028049246);
                                aK.a(true, 2096072399);
                                arrby = (byte[])(ax.j * 2066106645);
                                if (arrby > u.d * -1093536619) {
                                    arrby = (byte[])(u.d * -1093536619);
                                }
                                if (arrby < u.d * -1093536619 - 1) {
                                    arrby = (byte[])(u.d * -1093536619 - 1);
                                }
                                if (ae) {
                                    cr.m.a(ax.j * 2066106645);
                                } else {
                                    cr.m.a(0);
                                }
                                for (n5 = 0; n5 < 104; ++n5) {
                                    for (n6 = 0; n6 < 104; ++n6) {
                                        dy.b(n5, n6);
                                    }
                                }
                                cL.a();
                                cr cr2 = (cr)cr.g();
                                while (cr2 != null) {
                                    if (cr2.o * -786095411 == -1) {
                                        cr2.n = 0;
                                        bZ.a(cr2);
                                    } else {
                                        cr2.m();
                                    }
                                    cr2 = (cr)cr.e();
                                }
                                v.a();
                                if (aO.a != null) {
                                    aF.a(214);
                                    aF.g(1057001181);
                                }
                                if (!aV) {
                                    n5 = (c.c * 1572449351 - 6) / 8;
                                    n6 = (c.c * 1572449351 + 6) / 8;
                                    n8 = (ao.a * -932948791 - 6) / 8;
                                    int n23 = (ao.a * -932948791 + 6) / 8;
                                    for (int i7 = n5 - 1; i7 <= 1 + n6; ++i7) {
                                        for (n7 = n8 - 1; n7 <= 1 + n23; ++n7) {
                                            if (i7 >= n5 && i7 <= n6 && n7 >= n8 && n7 <= n23) continue;
                                            V.c.a("m" + i7 + "_" + n7, -1835396502);
                                            V.c.a("l" + i7 + "_" + n7, -1414748092);
                                        }
                                    }
                                }
                                bn.a(30);
                                cL.a();
                                ax.f = null;
                                ax.a = null;
                                aA.a = null;
                                g.a = null;
                                dy.a = null;
                                ax.b = null;
                                ax.c = null;
                                bU.a = null;
                                ax.e = null;
                                ax.d = null;
                                bd.b = null;
                                bv.b = null;
                                aF.a(69);
                                cJ.a.a(-5);
                                for (n5 = 0; n5 < 32; ++n5) {
                                    bH.l[n5] = 0;
                                }
                                for (n5 = 0; n5 < 32; ++n5) {
                                    bH.m[n5] = 0;
                                }
                                b.d = 0;
                            }
                        }
                    }
                } else {
                    bH.a();
                }
                if (X * -684224463 == 30) {
                    w.b(1260040613);
                } else if (X * -684224463 == 40 || X * -684224463 == 45) {
                    aF.a(-72);
                }
                return;
            }
            cj2.d.a(cj2.c, (int)cj2.am, cj2.b, false, 76);
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected final void c(byte by2) {
        Object object;
        Object object2;
        if (bE.c != null) {
            bE.c.e = false;
        }
        bE.c = null;
        if (fd != null) {
            fd.c();
            fd = null;
        }
        if (cb.d != null) {
            object2 = object = cb.d;
            synchronized (object2) {
                cb.d = null;
            }
        }
        if (cD.j != null) {
            object2 = object = cD.j;
            synchronized (object2) {
                cD.j = null;
            }
        }
        aA.c = null;
        if (dz.a != null) {
            dz.a.c(-99158889);
        }
        if (ff != null) {
            ff.c(-99158889);
        }
        an.a(-302659003);
        object2 = object = D.e;
        synchronized (object2) {
            if (D.b * 1739579873 != 0) {
                D.b = 953426465;
                try {
                    D.e.wait();
                }
                catch (InterruptedException var4_5) {
                    // empty catch block
                }
            }
        }
        cL.c(-623222018);
    }

    void e(byte by2) {
        boolean bl2;
        if (X * -684224463 != 1000 && !(bl2 = an.b(-1657076487))) {
            this.m(601623862);
        }
    }

    void m(int n2) {
        if (bq.r * -1001122769 >= 4) {
            this.a("js5crc", 2);
            X = -371691416;
        } else {
            if (bq.s * 195991739 >= 4) {
                if (X * -684224463 <= 5) {
                    this.a("js5io", 2);
                    X = -371691416;
                    return;
                }
                Y = -436727112;
                bq.s = 1887421785;
            }
            if ((Y -= 1069301281) * 469681633 + 1 <= 0) {
                try {
                    if (aa * -302792499 == 0) {
                        Z = aK.c.a(C.a, dC.i * 751829209);
                    }
                    if ((aa -= 1048433659) * -302792499 == 1) {
                        if (bH.Z.f == 2) {
                            this.a(-1, -5);
                            return;
                        }
                        if (bH.Z.f == 1) {
                            aa -= 1048433659;
                        }
                    }
                    if (aa * -302792499 == 2) {
                        al.j = new dn((Socket)bH.Z.d, aK.c);
                        cY cY2 = new cY(5);
                        cY2.d(15);
                        cY2.g(91);
                        al.j.b(cY2.g, 0, 5);
                        aa -= 1048433659;
                        ab = C.a(255) * 6543028040007707241L;
                    }
                    if (aa * -302792499 == 3) {
                        if (X * -684224463 > 5 && al.j.a() <= 0) {
                            if (C.a(255) - 5478959463529956825L * ab > 30000) {
                                this.a(-2, 94);
                                return;
                            }
                        } else {
                            int n3 = al.j.b();
                            if (n3 != 0) {
                                this.a(n3, 71);
                                return;
                            }
                            aa -= 1048433659;
                        }
                    }
                    if (aa * -302792499 == 4) {
                        g.a(al.j, X * -684224463 > 20, 60256045);
                        Z = null;
                        al.j = null;
                        aa = 0;
                        ac = 0;
                    }
                }
                catch (IOException var2_4) {
                    this.a(-3, -27);
                }
            }
        }
    }

    void a(int n2, byte by2) {
        Z = null;
        al.j = null;
        aa = 0;
        dC.i = dC.i * 751829209 != c.e * -1805689375 ? c.e * 471081033 : bT.b * 191036863;
        if ((ac -= 1057819419) * -1273386771 < 2 || n2 != 7 && n2 != 9) {
            if (ac * -1273386771 >= 2 && n2 == 6) {
                this.a("js5connect_outofdate", 2);
                X = -371691416;
            } else if (ac * -1273386771 >= 4) {
                if (X * -684224463 <= 5) {
                    this.a("js5connect", 2);
                    X = -371691416;
                } else {
                    Y = -436727112;
                }
            }
        } else if (X * -684224463 <= 5) {
            this.a("js5connect_full", 2);
            X = -371691416;
        } else {
            Y = -436727112;
        }
    }

    static void a() {
        if (cQ.F) {
            if (cD.n * 332680755 == 1 || !aG.f && cD.n * 332680755 == 4) {
                int n2 = 280 + cQ.j * -468945023;
                if (cD.o * 1837550337 >= n2 && cD.o * 1837550337 <= 14 + n2 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                    aI.a(0, 0, 1882649131);
                } else if (cD.o * 1837550337 >= n2 + 15 && cD.o * 1837550337 <= 80 + n2 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                    aI.a(0, 1, -1895665187);
                } else {
                    int n3 = 390 + cQ.j * -468945023;
                    if (cD.o * 1837550337 >= n3 && cD.o * 1837550337 <= n3 + 14 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                        aI.a(1, 0, 1119413582);
                    } else if (cD.o * 1837550337 >= 15 + n3 && cD.o * 1837550337 <= 80 + n3 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                        aI.a(1, 1, 543514357);
                    } else {
                        int n4 = 500 + cQ.j * -468945023;
                        if (cD.o * 1837550337 >= n4 && cD.o * 1837550337 <= n4 + 14 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                            aI.a(2, 0, -1178019331);
                        } else if (cD.o * 1837550337 >= 15 + n4 && cD.o * 1837550337 <= n4 + 80 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                            aI.a(2, 1, -420624681);
                        } else {
                            int n5 = 610 + cQ.j * -468945023;
                            if (cD.o * 1837550337 >= n5 && cD.o * 1837550337 <= n5 + 14 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                                aI.a(3, 0, 1880779856);
                            } else if (cD.o * 1837550337 >= 15 + n5 && cD.o * 1837550337 <= 80 + n5 && cD.p * -1013575437 >= 4 && cD.p * -1013575437 <= 18) {
                                aI.a(3, 1, 1953864397);
                            } else if (cD.o * 1837550337 >= 708 + cQ.j * -468945023 && cD.p * -1013575437 >= 4 && cD.o * 1837550337 <= 708 + cQ.j * -468945023 + 50 && cD.p * -1013575437 <= 20) {
                                cQ.F = false;
                                Z.a.a(cQ.j * -468945023, 0);
                                cQ.d.a(382 + cQ.j * -468945023, 0);
                                if (!C) {
                                    I.a.a(382 + cQ.j * -468945023 - I.a.c / 2, 18);
                                }
                            } else if (cQ.G * 624623853 != -1) {
                                dC dC2 = aE.a[cQ.G * 624623853];
                                bG.a(dC2);
                                cQ.F = false;
                                Z.a.a(cQ.j * -468945023, 0);
                                cQ.d.a(cQ.j * -468945023 + 382, 0);
                                if (!C) {
                                    I.a.a(382 + cQ.j * -468945023 - I.a.c / 2, 18);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if ((cD.n * 332680755 == 1 || !aG.f && cD.n * 332680755 == 4) && cD.o * 1837550337 >= 765 + cQ.j * -468945023 - 50 && cD.p * -1013575437 >= 453) {
                ag.d.g = !ag.d.g;
                cD.a(-1600199621);
                if (!ag.d.g) {
                    aA.a(aG.g, "scape main", "", 255, false, 2);
                } else {
                    D.a();
                }
            }
            if (X * -684224463 != 5) {
                cQ.q -= 2005965371;
                if (X * -684224463 == 10 || X * -684224463 == 11) {
                    int n6;
                    int n7;
                    int n8;
                    int n9;
                    if (L * 1017874057 == 0) {
                        if (cD.n * 332680755 == 1 || !aG.f && cD.n * 332680755 == 4) {
                            n7 = 5 + cQ.j * -468945023;
                            n6 = 463;
                            n8 = 100;
                            n9 = 35;
                            if (cD.o * 1837550337 >= n7 && cD.o * 1837550337 <= n8 + n7 && cD.p * -1013575437 >= n6 && cD.p * -1013575437 <= n9 + n6) {
                                if (aR.a()) {
                                    cQ.F = true;
                                }
                                return;
                            }
                        }
                        if (cC.b != null && aR.a()) {
                            cQ.F = true;
                        }
                    }
                    n7 = cD.n * 332680755;
                    int n10 = cD.o * 1837550337;
                    int n11 = cD.p * -1013575437;
                    if (!aG.f && n7 == 4) {
                        n7 = 1;
                    }
                    if (cQ.u * -1261736495 == 0) {
                        int n12 = cQ.k * 23501379 + 180 - 80;
                        n6 = 291;
                        if (n7 == 1 && n10 >= n12 - 75 && n10 <= 75 + n12 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                            bj.a("http://www.os-scape.com/register", true, false);
                        }
                        n8 = 361;
                        if (n7 == 1 && n11 >= n8 - 15 && n11 < n8) {
                            bj.a("http://www.os-scape.com/register", true, false);
                            return;
                        }
                        n12 = 180 + cQ.k * 23501379 + 80;
                        if (n7 == 1 && n10 >= n12 - 75 && n10 <= n12 + 75 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                            if (J * 1425499025 == 1) {
                                cQ.v = du.dW;
                                cQ.w = du.dX;
                                cQ.x = du.ea;
                                cQ.u = -807924943;
                                cQ.C = 0;
                            } else if (J * 1425499025 == 2) {
                                cQ.v = du.dU;
                                cQ.w = du.dV;
                                cQ.x = du.ea;
                                cQ.u = -807924943;
                                cQ.C = 0;
                            } else if (J * 1425499025 == 3) {
                                cQ.v = du.dY;
                                cQ.w = du.dZ;
                                cQ.x = du.ea;
                                cQ.u = -807924943;
                                cQ.C = 0;
                            } else {
                                cQ.v = du.a;
                                cQ.w = du.da;
                                cQ.x = du.a;
                                cQ.u = -1615849886;
                                cQ.C = 0;
                            }
                        }
                    } else if (cQ.u * -1261736495 != 1) {
                        if (cQ.u * -1261736495 == 2) {
                            n8 = 231;
                            int n13 = n8 + 30;
                            if (n7 == 1 && n11 >= n13 - 15 && n11 < n13) {
                                cQ.C = 0;
                            }
                            if (n7 == 1 && n11 >= n13 - 15 && n11 < (n13 += 15)) {
                                cQ.C = 510740173;
                            }
                            n13 += 15;
                            n8 = 361;
                            if (n7 == 1 && n11 >= n8 - 15 && n11 < n8) {
                                bj.a("http://forum.os-scape.com/login.php?do=lostpw", true, false);
                                return;
                            }
                            if (n7 == 1 && n10 >= 255 && n11 >= 214 && n10 <= 365 && n11 <= 230) {
                                bj.a("http://forum.os-scape.com/forumdisplay.php?31-Help-Desk", true, false);
                                return;
                            }
                            n9 = 180 + cQ.k * 23501379 - 80;
                            int n14 = 321;
                            if (n7 == 1 && n10 >= n9 - 75 && n10 <= 75 + n9 && n11 >= n14 - 20 && n11 <= 20 + n14) {
                                if ((cQ.y = cQ.y.trim()).length() == 0) {
                                    dz.a(du.bn, du.bo, du.bp);
                                    return;
                                }
                                if (cQ.z.length() == 0) {
                                    dz.a(du.bq, du.br, du.bs);
                                    return;
                                }
                                dz.a(du.a, du.de, du.a);
                                cQ.A = ag.d.e.containsKey(y.a(cQ.y)) ? cz.b : cz.d;
                                bn.a(20);
                                return;
                            }
                            n9 = 260 + cQ.k * 23501379;
                            if (n7 == 1 && n10 >= n9 - 75 && n10 <= 75 + n9 && n11 >= n14 - 20 && n11 <= 20 + n14) {
                                cQ.u = 0;
                                cQ.y = "";
                                cQ.z = "";
                                bs.a = 0;
                                V.d = "";
                                cQ.B = true;
                            }
                            while (dp.a(0)) {
                                boolean bl2 = false;
                                for (int i2 = 0; i2 < cQ.D.length(); ++i2) {
                                    if (bE.d != cQ.D.charAt(i2)) continue;
                                    bl2 = true;
                                    break;
                                }
                                if (aH.a * 875997027 == 13) {
                                    cQ.u = 0;
                                    cQ.y = "";
                                    cQ.z = "";
                                    bs.a = 0;
                                    V.d = "";
                                    cQ.B = true;
                                    continue;
                                }
                                if (cQ.C * -763095547 == 0) {
                                    if (aH.a * 875997027 == 85 && cQ.y.length() > 0) {
                                        cQ.y = cQ.y.substring(0, cQ.y.length() - 1);
                                    }
                                    if (aH.a * 875997027 == 84 || aH.a * 875997027 == 80) {
                                        cQ.C = 510740173;
                                    }
                                    if (!bl2 || cQ.y.length() >= 320) continue;
                                    cQ.y = cQ.y + bE.d;
                                    continue;
                                }
                                if (cQ.C * -763095547 != 1) continue;
                                if (aH.a * 875997027 == 85 && cQ.z.length() > 0) {
                                    cQ.z = cQ.z.substring(0, cQ.z.length() - 1);
                                }
                                if (aH.a * 875997027 == 84 || aH.a * 875997027 == 80) {
                                    cQ.C = 0;
                                }
                                if (aH.a * 875997027 == 84) {
                                    if ((cQ.y = cQ.y.trim()).length() == 0) {
                                        dz.a(du.bn, du.bo, du.bp);
                                        return;
                                    }
                                    if (cQ.z.length() == 0) {
                                        dz.a(du.bq, du.br, du.bs);
                                        return;
                                    }
                                    dz.a(du.a, du.de, du.a);
                                    cQ.A = ag.d.e.containsKey(y.a(cQ.y)) ? cz.b : cz.d;
                                    bn.a(20);
                                    return;
                                }
                                if (!bl2 || cQ.z.length() >= 20) continue;
                                cQ.z = cQ.z + bE.d;
                            }
                            return;
                        }
                        if (cQ.u * -1261736495 == 4) {
                            int n15 = cQ.k * 23501379 + 180 - 80;
                            n6 = 321;
                            if (n7 == 1 && n10 >= n15 - 75 && n10 <= 75 + n15 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                                V.d.trim();
                                if (V.d.length() != 6) {
                                    dz.a(du.a, du.J, du.a);
                                    return;
                                }
                                bs.a = Integer.parseInt(V.d) * 1721221401;
                                V.d = "";
                                cQ.A = cQ.B ? cz.c : cz.e;
                                dz.a(du.a, du.de, du.a);
                                bn.a(20);
                                return;
                            }
                            if (n7 == 1 && n10 >= cQ.k * 23501379 + 180 - 9 && n10 <= 180 + cQ.k * 23501379 + 130 && n11 >= 263 && n11 <= 296) {
                                boolean bl3 = cQ.B = !cQ.B;
                            }
                            if (n7 == 1 && n10 >= cQ.k * 23501379 + 180 - 34 && n10 <= 180 + cQ.k * 23501379 + 34 && n11 >= 351 && n11 <= 363) {
                                bj.a(dj.a("secure", true) + "m=totp-authenticator/disableTOTPRequest", true, false);
                            }
                            n15 = cQ.k * 23501379 + 180 + 80;
                            if (n7 == 1 && n10 >= n15 - 75 && n10 <= 75 + n15 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                                cQ.u = 0;
                                cQ.y = "";
                                cQ.z = "";
                                bs.a = 0;
                                V.d = "";
                            }
                            while (dp.a(0)) {
                                boolean bl4 = false;
                                for (n9 = 0; n9 < cQ.E.length(); ++n9) {
                                    if (bE.d != cQ.E.charAt(n9)) continue;
                                    bl4 = true;
                                    break;
                                }
                                if (aH.a * 875997027 == 13) {
                                    cQ.u = 0;
                                    cQ.y = "";
                                    cQ.z = "";
                                    bs.a = 0;
                                    V.d = "";
                                    continue;
                                }
                                if (aH.a * 875997027 == 85 && V.d.length() > 0) {
                                    V.d = V.d.substring(0, V.d.length() - 1);
                                }
                                if (aH.a * 875997027 == 84) {
                                    V.d.trim();
                                    if (V.d.length() != 6) {
                                        dz.a(du.a, du.J, du.a);
                                        return;
                                    }
                                    bs.a = Integer.parseInt(V.d) * 1721221401;
                                    V.d = "";
                                    cQ.A = cQ.B ? cz.c : cz.e;
                                    dz.a(du.a, du.de, du.a);
                                    bn.a(20);
                                    return;
                                }
                                if (!bl4 || V.d.length() >= 6) continue;
                                V.d = V.d + bE.d;
                            }
                        } else if (cQ.u * -1261736495 == 5) {
                            int n16 = 180 + cQ.k * 23501379 - 80;
                            n6 = 321;
                            if (n7 == 1 && n10 >= n16 - 75 && n10 <= n16 + 75 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                                dp.a(2115531962);
                                return;
                            }
                            n16 = 80 + cQ.k * 23501379 + 180;
                            if (n7 == 1 && n10 >= n16 - 75 && n10 <= 75 + n16 && n11 >= n6 - 20 && n11 <= n6 + 20) {
                                cQ.v = du.a;
                                cQ.w = du.da;
                                cQ.x = du.a;
                                cQ.u = -1615849886;
                                cQ.C = 0;
                                cQ.z = "";
                            }
                            while (dp.a(0)) {
                                boolean bl5 = false;
                                for (n9 = 0; n9 < cQ.D.length(); ++n9) {
                                    if (bE.d != cQ.D.charAt(n9)) continue;
                                    bl5 = true;
                                    break;
                                }
                                if (aH.a * 875997027 == 13) {
                                    cQ.v = du.a;
                                    cQ.w = du.da;
                                    cQ.x = du.a;
                                    cQ.u = -1615849886;
                                    cQ.C = 0;
                                    cQ.z = "";
                                    continue;
                                }
                                if (aH.a * 875997027 == 85 && cQ.y.length() > 0) {
                                    cQ.y = cQ.y.substring(0, cQ.y.length() - 1);
                                }
                                if (aH.a * 875997027 == 84) {
                                    dp.a(1758781412);
                                    return;
                                }
                                if (!bl5 || cQ.y.length() >= 320) continue;
                                cQ.y = cQ.y + bE.d;
                            }
                        } else if (cQ.u * -1261736495 == 6) {
                            do {
                                if (!dp.a(0)) {
                                    n8 = 321;
                                    if (n7 == 1 && n11 >= n8 - 20 && n11 <= 20 + n8) {
                                        cQ.v = du.a;
                                        cQ.w = du.da;
                                        cQ.x = du.a;
                                        cQ.u = -1615849886;
                                        cQ.C = 0;
                                        cQ.z = "";
                                    }
                                    return;
                                }
                                if (aH.a * 875997027 != 84 && aH.a * 875997027 != 13) continue;
                                cQ.v = du.a;
                                cQ.w = du.da;
                                cQ.x = du.a;
                                cQ.u = -1615849886;
                                cQ.C = 0;
                                cQ.z = "";
                            } while (true);
                        }
                    } else {
                        while (dp.a(0)) {
                            if (aH.a * 875997027 == 84) {
                                cQ.v = du.a;
                                cQ.w = du.da;
                                cQ.x = du.a;
                                cQ.u = -1615849886;
                                cQ.C = 0;
                                continue;
                            }
                            if (aH.a * 875997027 != 13) continue;
                            cQ.u = 0;
                        }
                        int n17 = cQ.k * 23501379 + 180 - 80;
                        n6 = 321;
                        if (n7 == 1 && n10 >= n17 - 75 && n10 <= 75 + n17 && n11 >= n6 - 20 && n11 <= 20 + n6) {
                            cQ.v = du.a;
                            cQ.w = du.da;
                            cQ.x = du.a;
                            cQ.u = -1615849886;
                            cQ.C = 0;
                        }
                        n17 = 260 + cQ.k * 23501379;
                        if (n7 == 1 && n10 >= n17 - 75 && n10 <= 75 + n17 && n11 >= n6 - 20 && n11 <= n6 + 20) {
                            cQ.u = 0;
                        }
                    }
                }
            }
        }
    }

    @Override
    protected final void d(int n2) {
        boolean bl2;
        int n3;
        block66 : {
            block65 : {
                try {
                    if (do.i * 216145519 != 2) break block65;
                    if (w.d == null && (w.d = db.a(do.f, do.h * -853454469, do.g * -1483716129)) == null) {
                        bl2 = false;
                        break block66;
                    }
                    if (bf.a == null) {
                        bf.a = new dp(do.c, do.b);
                    }
                    if (!do.d.a(w.d, do.e, bf.a, 22050, 1423463568)) break block65;
                    do.d.d(-466334053);
                    do.d.a(do.a * 1521159847, 0);
                    do.d.a(w.d, br.a, -621869226);
                    do.i = 0;
                    w.d = null;
                    bf.a = null;
                    do.f = null;
                    bl2 = true;
                    break block66;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    do.d.b(65);
                    do.i = 0;
                    w.d = null;
                    bf.a = null;
                    do.f = null;
                }
            }
            bl2 = false;
        }
        if (bl2 && er && dz.a != null) {
            dz.a.d(1403343118);
        }
        if (X * -684224463 == 10 || X * -684224463 == 20 || X * -684224463 == 30) {
            if (4890424432757411589L * Q != 0 && C.a(255) > Q * 4890424432757411589L) {
                int n4 = cq.e(916322624);
                Q = 0;
                R = n4 >= 2;
                bv.a();
                if (X * -684224463 >= 25) {
                    aF.a(141);
                    aF.d(cq.e(-523850341));
                    aF.e(aJ.f * 2104430923);
                    aF.e(aQ.a * -1064642111);
                }
                d = true;
            } else if (e) {
                g.a(aQ.b, 32);
                Canvas canvas = aQ.b;
                canvas.removeMouseListener(cD.j);
                canvas.removeMouseMotionListener(cD.j);
                canvas.removeFocusListener(cD.j);
                cD.c = 0;
                if (aA.c != null) {
                    aA.c.a((Component)aQ.b, 1073201912);
                }
                M.a(1389930970);
                aQ.b.setBackground(Color.black);
                Canvas bl3 = aQ.b;
                bl3.setFocusTraversalKeysEnabled(false);
                bl3.addKeyListener(cb.d);
                bl3.addFocusListener(cb.d);
                Canvas i2 = aQ.b;
                i2.addMouseListener(cD.j);
                i2.addMouseMotionListener(cD.j);
                i2.addFocusListener(cD.j);
                if (aA.c != null) {
                    aA.c.a((Component)aQ.b, 50);
                }
                if (cR * 1787246131 != -1) {
                    w.a(false, -99);
                }
                q = true;
            }
        }
        Dimension dimension = this.b(-15);
        if (dimension.width != cO.e * 1822130227 || dimension.height != dy.c * -733282123 || q) {
            bv.a();
            Q = (C.a(255) + 500) * 2121214902543181261L;
            q = false;
        }
        boolean bl3 = false;
        if (d) {
            d = false;
            bl3 = true;
            for (int n5 = 0; n5 < 100; ++n5) {
                bH.dL[n5] = true;
            }
        }
        if (bl3) {
            ax.a(-1515195159);
        }
        if (X * -684224463 == 0) {
            aw.a(cQ.s * 719550867, cQ.t, null, bl3, 79);
        } else if (X * -684224463 == 5) {
            aW.a(bn.a, an.a, bQ.a, bl3, -20);
        } else if (X * -684224463 != 10 && X * -684224463 != 11) {
            if (X * -684224463 == 20) {
                aW.a(bn.a, an.a, bQ.a, bl3, -2);
            } else if (X * -684224463 == 25) {
                if (W * 1765953983 == 1) {
                    if (U * 1226769729 > aS * -1773605997) {
                        aS = U * -975398821;
                    }
                    int n6 = (aS * 1514013366 - U * 1208944306) / (aS * -1773605997);
                    aL.a(du.l + aB.h + aB.e + n6 + "%" + aB.f, false, -1714673297);
                } else if (W * 1765953983 == 2) {
                    if (V * 2022338491 > aT * -980029277) {
                        aT = V * -1436238327;
                    }
                    int n7 = 50 + (aT * -1756823594 - V * -1962290554) / (aT * -980029277);
                    aL.a(du.l + aB.h + aB.e + n7 + "%" + aB.f, false, -1714673297);
                } else {
                    aL.a(du.l, false, -1714673297);
                }
            } else if (X * -684224463 == 30) {
                int graphics;
                int n4;
                if (cR * 1787246131 != -1) {
                    aQ.a(cR * 1787246131, -621512993);
                }
                for (n4 = 0; n4 < dJ * -2099955589; ++n4) {
                    if (dL[n4]) {
                        bH.dM[n4] = true;
                    }
                    bH.dN[n4] = dL[n4];
                    bH.dL[n4] = false;
                }
                dK = S * -90122983;
                cG = 276627093;
                cH = 1244965977;
                bE.e = null;
                if (cR * 1787246131 != -1) {
                    dJ = 0;
                    ar.a(cR * 1787246131, 0, 0, aJ.f * 2104430923, aQ.a * -1064642111, 0, 0, -1, 420878521);
                }
                dd.f();
                if (!cy) {
                    if (cG * 1187980099 != -1) {
                        n4 = cG * 1187980099;
                        n3 = cH * -1807211497;
                        if (cz * 1324290403 >= 2 || cK * -1710049223 != 0 || cM) {
                            String n9;
                            if (cK * -1710049223 == 1 && cz * 1324290403 < 2) {
                                n9 = du.bU + du.ce + cL + " " + aB.g;
                            } else if (cM && cz * 1324290403 < 2) {
                                n9 = cP + du.ce + cQ + " " + aB.g;
                            } else {
                                graphics = cz * 1324290403 - 1;
                                String n10 = cF[graphics].length() > 0 ? cE[graphics] + du.ce + cF[graphics] : cE[graphics];
                                n9 = n10;
                            }
                            if (cz * 1324290403 > 2) {
                                n9 = n9 + am.a(16777215) + " " + '/' + " " + (cz * 1324290403 - 2) + du.bY;
                            }
                            bn.a.c(n9, n4 + 4, 15 + n3, 16777215, 0, S * 1026470457 / 1000);
                        }
                    }
                } else {
                    n4 = cr.l * 681506315;
                    n3 = w.c * 1953108583;
                    int n5 = cQ.i * 1712819025;
                    int n6 = t.q * -2090618933;
                    graphics = 6116423;
                    dd.b(n4, n3, n5, n6, graphics);
                    dd.b(n4 + 1, n3 + 1, n5 - 2, 16, 0);
                    dd.c(n4 + 1, 18 + n3, n5 - 2, n6 - 19, 0);
                    bn.a.a(du.bX, n4 + 3, n3 + 14, graphics, -1);
                    int n7 = cD.l * -1031552075;
                    int n8 = cD.m * 1941423145;
                    for (int i2 = 0; i2 < cz * 1324290403; ++i2) {
                        int n9 = n3 + 31 + (cz * 1324290403 - 1 - i2) * 15;
                        int n10 = 16777215;
                        if (n7 > n4 && n7 < n5 + n4 && n8 > n9 - 13 && n8 < 3 + n9) {
                            n10 = 16776960;
                        }
                        s s2 = bn.a;
                        String string = cF[i2].length() > 0 ? cE[i2] + du.ce + cF[i2] : cE[i2];
                        s2.a(string, 3 + n4, n9, n10, 0);
                    }
                    dh.a(cr.l * 681506315, w.c * 1953108583, cQ.i * 1712819025, t.q * -2090618933, 127);
                }
                if (dS * 1189118443 == 3) {
                    for (n4 = 0; n4 < dJ * -2099955589; ++n4) {
                        if (dN[n4]) {
                            dd.b(dO[n4], dP[n4], dQ[n4], dR[n4], 16711935, 128);
                            continue;
                        }
                        if (!dM[n4]) continue;
                        dd.b(dO[n4], dP[n4], dQ[n4], dR[n4], 16711680, 128);
                    }
                }
                bQ.a(u.d * -1093536619, cP.ar.v * -1051150961, cP.ar.w * -844883935, bk * -880137347, 80);
                bk = 0;
            } else if (X * -684224463 == 40) {
                aL.a(du.m + aB.h + du.n, false, -1714673297);
            } else if (X * -684224463 == 45) {
                aL.a(du.cc, false, -1714673297);
            }
        } else {
            aW.a(bn.a, an.a, bQ.a, bl3, 1);
        }
        if (X * -684224463 == 30 && dS * 1189118443 == 0 && !bl3) {
            try {
                Graphics graphics = aQ.b.getGraphics();
                for (n3 = 0; n3 < dJ * -2099955589; ++n3) {
                    if (!dM[n3]) continue;
                    ba.b.a(graphics, dO[n3], dP[n3], dQ[n3], dR[n3], 54);
                    bH.dM[n3] = false;
                }
            }
            catch (Exception var8_17) {
                aQ.b.repaint();
            }
        } else if (X * -684224463 > 0) {
            try {
                Graphics graphics = aQ.b.getGraphics();
                ba.b.a(graphics, 0, 0, 1475498425);
                for (n3 = 0; n3 < dJ * -2099955589; ++n3) {
                    bH.dM[n3] = false;
                }
            }
            catch (Exception var8_18) {
                aQ.b.repaint();
            }
        }
    }

    @Override
    protected final void h(int n2) {
    }

    static p a(int n2, boolean bl2, boolean bl3, boolean bl4, int n3) {
        aW aW2 = null;
        if (bg.g != null) {
            aW2 = new aW(n2, bg.g, aP.c[n2], 1000000);
        }
        return new p(aW2, x.a, n2, bl2, bl3, bl4);
    }

    public static void a(boolean bl2, byte by2) {
        if (bq.b != null) {
            try {
                cY cY2 = new cY(4);
                cY2.d(bl2 ? 2 : 3);
                cY2.f(0);
                bq.b.b(cY2.g, 0, 4);
            }
            catch (IOException var2_3) {
                try {
                    bq.b.c();
                }
                catch (Exception var3_4) {
                    // empty catch block
                }
                bq.s += 629140595;
                bq.b = null;
            }
        }
    }

    public static final cO a(dl dl2, Component component, int n2, int n3, byte by2) {
        if (cO.i * -46901051 == 0) {
            throw new IllegalStateException();
        }
        if (n2 >= 0 && n2 < 2) {
            if (n3 < 256) {
                n3 = 256;
            }
            try {
                au au2 = new au();
                au2.t = new int[(cO.g ? 2 : 1) * 256];
                au2.h = n3 * -582636057;
                au2.a(component);
                au2.o = ((n3 & -1024) + 1024) * -1384104685;
                if (au2.o * -1450371813 > 16384) {
                    au2.o = 256163840;
                }
                au2.a(au2.o * -1450371813);
                if (cO.f * -1683473421 > 0 && cO.u == null) {
                    cO.u = new ag();
                    cO.u.a = dl2;
                    dl2.a(cO.u, cO.f * -1683473421, 7);
                }
                if (cO.u != null) {
                    if (cO.u.e[n2] != null) {
                        throw new IllegalArgumentException();
                    }
                    cO.u.e[n2] = au2;
                }
                return au2;
            }
            catch (Throwable var5_6) {
                try {
                    at at2 = new at(dl2, n2);
                    at2.t = new int[(cO.g ? 2 : 1) * 256];
                    at2.h = n3 * -582636057;
                    at2.a(component);
                    at2.o = 256163840;
                    at2.a(at2.o * -1450371813);
                    if (cO.f * -1683473421 > 0 && cO.u == null) {
                        cO.u = new ag();
                        cO.u.a = dl2;
                        dl2.a(cO.u, cO.f * -1683473421, 7);
                    }
                    if (cO.u != null) {
                        if (cO.u.e[n2] != null) {
                            throw new IllegalArgumentException();
                        }
                        cO.u.e[n2] = at2;
                    }
                    return at2;
                }
                catch (Throwable var6_8) {
                    return new cO();
                }
            }
        }
        throw new IllegalArgumentException();
    }

    static final int c(int n2, int n3, int n4, int n5) {
        if (n4 > 179) {
            n3 /= 2;
        }
        if (n4 > 192) {
            n3 /= 2;
        }
        if (n4 > 217) {
            n3 /= 2;
        }
        if (n4 > 243) {
            n3 /= 2;
        }
        int n6 = (n3 / 32 << 7) + (n2 / 4 << 10) + n4 / 2;
        return n6;
    }

    static final boolean b(int n2, byte by2) {
        if (n2 < 0) {
            return false;
        }
        int n3 = cC[n2];
        if (n3 >= 2000) {
            n3 -= 2000;
        }
        return n3 == 1007;
    }

    static final void n(int n2) {
        bw.a(de);
        bQ.e += 136802995;
        if (dm && dj) {
            dj dj2;
            int n3 = cD.l * -1031552075;
            int n4 = cD.m * 1941423145;
            n4 -= dh * -1974758323;
            if ((n3 -= dg * 493969285) < dk * 456811279) {
                n3 = dk * 456811279;
            }
            if (bH.de.bx * 2096072399 + n3 > dk * 456811279 + bH.df.bx * 2096072399) {
                n3 = bH.df.bx * 2096072399 + dk * 456811279 - bH.de.bx * 2096072399;
            }
            if (n4 < dl * -1802796197) {
                n4 = dl * -1802796197;
            }
            if (n4 + bH.de.by * 539675235 > dl * -1802796197 + bH.df.by * 539675235) {
                n4 = bH.df.by * 539675235 + dl * -1802796197 - bH.de.by * 539675235;
            }
            int n5 = n3 - dn * -409412663;
            int n6 = n4 - do * 568342063;
            int n7 = bH.de.aM * 1658015637;
            if (bQ.e * 1969654907 > bH.de.aN * 244194293 && (n5 > n7 || n5 < - n7 || n6 > n7 || n6 < - n7)) {
                dp = true;
            }
            int n8 = n3 - dk * 456811279 + bH.df.bB * 706996303;
            int n9 = n4 - dl * -1802796197 + bH.df.bC * -650026719;
            if (bH.de.bh != null && dp) {
                dj2 = new dj();
                dj2.e = de;
                dj2.c = n8 * -2053567695;
                dj2.i = n9 * 1536383743;
                dj2.a = bH.de.bh;
                cZ.a(dj2);
            }
            if (cD.k * 445478637 == 0) {
                if (dp) {
                    if (bH.de.bi != null) {
                        dj2 = new dj();
                        dj2.e = de;
                        dj2.c = n8 * -2053567695;
                        dj2.i = n9 * 1536383743;
                        dj2.g = di;
                        dj2.a = bH.de.bi;
                        cZ.a(dj2);
                    }
                    if (di != null && v.a(de, -1592922968) != null) {
                        aF.a(50);
                        aF.q(bH.di.bG * -181409537);
                        aF.q(bH.de.bG * -181409537);
                        aF.e(bH.di.bu * -1395083971);
                        aF.e(bH.de.bu * -1395083971);
                        aF.o(bH.de.bt * 1582464481);
                        aF.o(bH.di.bt * 1582464481);
                    }
                } else if ((cx * -696348949 == 1 || bH.b(cz * 1324290403 - 1, 1)) && cz * 1324290403 > 2) {
                    v.a(dg * 493969285 + dn * -409412663, do * 568342063 + dh * -1974758323, -1717111969);
                } else if (cz * 1324290403 > 0) {
                    as.a(dg * 493969285 + dn * -409412663, do * 568342063 + dh * -1974758323, 832789918);
                }
                de = null;
            }
        } else if (bQ.e * 1969654907 > 1) {
            de = null;
        }
    }

    static {
        z = true;
        A = true;
        B = true;
        C = true;
        H = 0;
        I = 0;
        J = -1172587151;
        L = 0;
        N = false;
        P = false;
        S = 0;
        X = 0;
        ad = true;
        ae = false;
        af = true;
        ag = -2561770266170829527L;
        ah = 357731023;
        ai = 1290332263;
        aj = -1183622521;
        ak = true;
        al = 0;
        am = 0;
        an = 0;
        ao = 0;
        ap = 0;
        aq = 0;
        ar = 0;
        as = 0;
        at = 0;
        au = new cY(new byte[5000]);
        fi = new bG();
        fj = 0;
        fl = new da[4];
        fp = new HashMap();
        fq = new R(1024);
        fr = new T();
        fs = 0;
        av = cS.d;
        aw = cS.d;
        ax = 0;
        aa = 0;
        Y = 0;
        ac = 0;
        ay = 0;
        az = 0;
        aA = 0;
        aB = 0;
        aC = new cG[32768];
        aD = 0;
        aE = new int[32768];
        aF = new cJ(5000);
        aG = new cJ(5000);
        aH = new cJ(5000);
        aI = 0;
        aJ = 0;
        aK = 0;
        aL = 0;
        aM = 0;
        aN = 0;
        aO = 0;
        aP = 0;
        aQ = false;
        aR = 0;
        U = 0;
        aS = 1619520155;
        V = 0;
        aT = -1369685237;
        W = 0;
        aU = new df[4];
        aV = false;
        aW = new int[4][13][13];
        aX = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        aY = 0;
        aZ = 993942234;
        ba = 0;
        bb = -849707682;
        bc = 0;
        bd = 1630497051;
        be = 0;
        bf = 0;
        bg = 87705858;
        bh = 0;
        bi = 1679310403;
        bj = 0;
        bk = 0;
        bl = 701003023;
        bm = 1833510911;
        bn = 930044431;
        bo = 1999767588;
        bp = false;
        bq = 0;
        br = -1860349568;
        bs = 0;
        bt = 0;
        bu = 0;
        bv = 0;
        bw = 0;
        bx = 0;
        by = false;
        bz = 0;
        bA = 0;
        bB = 1890038782;
        bC = new int[bB * 2060170727];
        bD = new int[bB * 2060170727];
        bE = new int[bB * 2060170727];
        bF = new int[bB * 2060170727];
        bG = new int[bB * 2060170727];
        bH = new int[bB * 2060170727];
        bI = new int[bB * 2060170727];
        bJ = new String[bB * 2060170727];
        bK = new int[104][104];
        bL = 0;
        bM = 1738216931;
        bN = 1048260499;
        bO = 0;
        bP = 0;
        bQ = 0;
        bR = 0;
        bS = 0;
        bT = 0;
        bU = 0;
        bV = 0;
        bW = 0;
        bX = 0;
        bY = false;
        bZ = 0;
        ca = 0;
        cb = new cP[2048];
        cc = 0;
        cd = new int[2048];
        new Thread(new bI()).start();
        ce = 0;
        cf = new int[2048];
        cg = new cY[2048];
        ch = 435565545;
        ci = 0;
        cj = 0;
        ck = new int[1000];
        cl = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        cm = new String[8];
        cn = new boolean[8];
        co = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        cp = 787648439;
        cq = new bA[4][104][104];
        cr = new bA();
        cs = new bA();
        ct = new bA();
        cu = new int[25];
        cv = new int[25];
        cw = new int[25];
        cx = 0;
        cy = false;
        cz = 0;
        cA = new int[500];
        cB = new int[500];
        cC = new int[500];
        cD = new int[500];
        cE = new String[500];
        cF = new String[500];
        cG = 276627093;
        cH = 1244965977;
        cI = 0;
        cJ = 2022005938;
        cK = 0;
        cL = null;
        cM = false;
        cN = 1832237769;
        cO = -2106201685;
        cP = null;
        cQ = null;
        cR = 1855539973;
        cS = new bP(8);
        cT = 0;
        cU = 0;
        cV = null;
        cW = 0;
        cX = 0;
        cY = 0;
        cZ = -1834997571;
        da = false;
        db = false;
        dc = false;
        dd = null;
        de = null;
        df = null;
        dg = 0;
        dh = 0;
        di = null;
        dj = false;
        dk = -1418079215;
        dl = -1618015443;
        dm = false;
        dn = -70397561;
        do = 1380790065;
        dp = false;
        dq = -718730433;
        dr = new int[32];
        ds = 0;
        dt = new int[32];
        du = 0;
        dv = new int[32];
        dw = 0;
        dx = 0;
        dy = 0;
        dz = 0;
        dA = 0;
        dB = 0;
        dC = 0;
        dD = new int[2000];
        dE = new String[1000];
        T = 0;
        dF = new bA();
        dG = new bA();
        dH = new bA();
        dI = new bP(512);
        dJ = 0;
        dK = 1337494590;
        dL = new boolean[100];
        dM = new boolean[100];
        dN = new boolean[100];
        dO = new int[100];
        dP = new int[100];
        dQ = new int[100];
        dR = new int[100];
        dS = 0;
        Q = 0;
        R = true;
        dT = 994247345;
        dU = -1943197525;
        dV = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        dW = 0;
        dX = 0;
        dY = "";
        dZ = new long[100];
        ea = 0;
        eb = 0;
        ec = new int[128];
        ed = new int[128];
        ee = 1468476784576452353L;
        ef = null;
        eg = null;
        eh = -1611844029;
        ei = 0;
        ej = new int[1000];
        ek = new int[1000];
        el = new cX[1000];
        em = 0;
        en = 0;
        eo = 0;
        ep = 2109930159;
        eq = 32697485;
        er = false;
        es = 631129145;
        et = -1246157843;
        eu = 0;
        ev = new int[50];
        ew = new int[50];
        ex = new int[50];
        ey = new int[50];
        ez = new dr[50];
        eA = false;
        eB = new boolean[5];
        eC = new int[5];
        eD = new int[5];
        eE = new int[5];
        eF = new int[5];
        eG = 256;
        eH = 205;
        eI = 256;
        eJ = 320;
        eK = 1;
        eL = 32767;
        eM = 1;
        eN = 32767;
        eO = 0;
        eP = 0;
        eQ = 0;
        eR = 0;
        eS = 0;
        eT = 0;
        eU = 0;
        eV = new aG[400];
        eW = new N();
        eX = 0;
        eY = new bE[400];
        eZ = new cR();
        fa = -327244321;
        fb = 1642680743;
        fc = new bK[8];
    }
}

