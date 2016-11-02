/*
 * Decompiled with CFR 0_118.
 */
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

public class bQ {
    static s a;
    static cA b;
    static int c;
    static p d;
    static int e;
    DataInputStream f;
    int g;
    int h;
    byte[] i;
    int j;
    byte[] k = new byte[4];
    dk l;
    long m;

    byte[] a() {
        int n2;
        if (C.a(255) > -475575183579082141L * this.m) {
            throw new IOException();
        }
        if (this.g * -1502629331 == 0) {
            if (this.l.f == 2) {
                throw new IOException();
            }
            if (this.l.f == 1) {
                this.f = (DataInputStream)this.l.d;
                this.g = -1881576027;
            }
        }
        if (this.g * -1502629331 == 1 && (n2 = this.f.available()) > 0) {
            if (n2 + this.h * 1266010029 > 4) {
                n2 = 4 - this.h * 1266010029;
            }
            this.h += this.f.read(this.k, this.h * 1266010029, n2) * 41366565;
            if (this.h * 1266010029 == 4) {
                int n3 = new cY(this.k).i();
                this.i = new byte[n3];
                this.g = 531815242;
            }
        }
        if (this.g * -1502629331 == 2 && (n2 = this.f.available()) > 0) {
            if (this.j * 1842810291 + n2 > this.i.length) {
                n2 = this.i.length - this.j * 1842810291;
            }
            this.j += this.f.read(this.i, this.j * 1842810291, n2) * 733636987;
            if (this.i.length == this.j * 1842810291) {
                return this.i;
            }
        }
        return null;
    }

    static void a(int n2, int n3, int n4, int n5, byte by2) {
        cs cs2 = (cs)cs.o.g();
        while (cs2 != null) {
            if (cs2.i * -1608116241 != -1 || cs2.m != null) {
                int n6 = 0;
                if (n3 > cs2.h * -1029232779) {
                    n6 += n3 - cs2.h * -1029232779;
                } else if (n3 < cs2.c * -731482411) {
                    n6 += cs2.c * -731482411 - n3;
                }
                if (n4 > cs2.e * -530221803) {
                    n6 += n4 - cs2.e * -530221803;
                } else if (n4 < cs2.d * -227524897) {
                    n6 += cs2.d * -227524897 - n4;
                }
                if (n6 - 64 <= cs2.j * 2136376279 && bH.et * -1977859941 != 0 && n2 == cs2.f * 1974067137) {
                    Object object;
                    if ((n6 -= 64) < 0) {
                        n6 = 0;
                    }
                    int n7 = (cs2.j * 2136376279 - n6) * bH.et * -1977859941 / (cs2.j * 2136376279);
                    if (cs2.n == null) {
                        dr dr2;
                        if (cs2.i * -1608116241 >= 0 && (dr2 = dr.a(bH.F, cs2.i * -1608116241, 0)) != null) {
                            object = dr2.b().a(bc.a);
                            co co2 = co.a((ch)object, 100, n7);
                            co2.b(-1);
                            cC.a.a(co2);
                            cs2.n = co2;
                        }
                    } else {
                        cs2.n.c(n7);
                    }
                    if (cs2.g == null) {
                        int n8;
                        if (cs2.m != null && (cs2.b -= n5 * 55643609) * 1009689193 <= 0 && (object = dr.a(bH.F, cs2.m[n8 = (int)(Math.random() * (double)cs2.m.length)], 0)) != null) {
                            ch ch2 = object.b().a(bc.a);
                            co co3 = co.a(ch2, 100, n7);
                            co3.b(0);
                            cC.a.a(co3);
                            cs2.g = co3;
                            cs2.b = (cs2.k * 478375745 + (int)(Math.random() * (double)(cs2.l * 623135975 - cs2.k * 478375745))) * 55643609;
                        }
                    } else {
                        cs2.g.c(n7);
                        if (!cs2.g.n()) {
                            cs2.g = null;
                        }
                    }
                } else {
                    if (cs2.n != null) {
                        cC.a.b(cs2.n);
                        cs2.n = null;
                    }
                    if (cs2.g != null) {
                        cC.a.b(cs2.g);
                        cs2.g = null;
                    }
                }
            }
            cs2 = (cs)cs.o.e();
        }
    }

    static final void a(String string, boolean bl2, int n2) {
        if (string != null) {
            if ((bH.eX * 601840989 < 100 || bH.ci * -1090925967 == 1) && bH.eX * 601840989 < 400) {
                String string2 = aC.a(string, bH.O, -1542592146);
                if (string2 != null) {
                    String string3;
                    Object object;
                    String string4;
                    int n3;
                    for (n3 = 0; n3 < bH.eX * 601840989; ++n3) {
                        object = bH.eY[n3];
                        string4 = aC.a(object.f, bH.O, -1781936336);
                        if (string4 != null && string4.equals(string2)) {
                            bn.a(31, "", string + du.ck);
                            return;
                        }
                        if (object.b == null || (string3 = aC.a(object.b, bH.O, -1992860654)) == null || !string3.equals(string2)) continue;
                        bn.a(31, "", string + du.ck);
                        return;
                    }
                    for (n3 = 0; n3 < bH.eT * 389772333; ++n3) {
                        object = bH.eV[n3];
                        string4 = aC.a(object.i, bH.O, -1837733720);
                        if (string4 != null && string4.equals(string2)) {
                            bn.a(31, "", du.cp + string + du.cq);
                            return;
                        }
                        if (object.b == null || (string3 = aC.a(object.b, bH.O, -1719269775)) == null || !string3.equals(string2)) continue;
                        bn.a(31, "", du.cp + string + du.cq);
                        return;
                    }
                    if (aC.a(cP.ar.aF, bH.O, -1545418178).equals(string2)) {
                        bn.a(31, "", du.cm);
                    } else {
                        bH.aF.a(181);
                        bH.aF.d(du.a(string));
                        bH.aF.a(string);
                    }
                }
            } else {
                bn.a(31, "", du.cj);
            }
        }
    }

    static void a(byte by2) {
        for (int i2 = 0; i2 < (bH.cz += 439682997) * 1324290403; ++i2) {
            boolean bl2;
            int n2 = bH.cC[i2];
            boolean bl3 = bl2 = n2 == 57 || n2 == 58 || n2 == 1007 || n2 == 25 || n2 == 30;
            if (!bl2 || i2 >= bH.cz * 1324290403 - 1) continue;
            for (int i3 = i2; i3 < bH.cz * 1324290403 - 1; ++i3) {
                bH.cE[i3] = bH.cE[i3 + 1];
                bH.cF[i3] = bH.cF[i3 + 1];
                bH.cC[i3] = bH.cC[i3 + 1];
                bH.cD[i3] = bH.cD[i3 + 1];
                bH.cA[i3] = bH.cA[1 + i3];
                bH.cB[i3] = bH.cB[1 + i3];
            }
        }
    }

    bQ(dl dl2, URL uRL) {
        this.l = dl2.a(uRL, 17);
        this.g = 0;
        this.m = (C.a(255) + 30000) * -5100844620741345461L;
    }
}

