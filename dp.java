/*
 * Decompiled with CFR 0_118.
 */
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class dp {
    static cX[] a;
    static cZ b;
    bP c = new bP(256);
    bP d = new bP(256);
    a e;
    a f;

    ch a(int n2, int n3, int[] arrn) {
        int n4 = n3 ^ (n2 << 4 & 65535 | n2 >>> 12);
        long l2 = n4 |= n2 << 16;
        ch ch2 = (ch)this.d.a(l2);
        if (ch2 != null) {
            return ch2;
        }
        if (arrn != null && arrn[0] <= 0) {
            return null;
        }
        dr dr2 = dr.a(this.e, n2, n3);
        if (dr2 == null) {
            return null;
        }
        ch2 = dr2.b();
        this.d.a(ch2, l2);
        if (arrn != null) {
            int[] arrn2 = arrn;
            arrn2[0] = arrn2[0] - ch2.b.length;
        }
        return ch2;
    }

    ch a(int n2, int n3, int[] arrn, byte by2) {
        int n4 = n3 ^ (n2 << 4 & 65535 | n2 >>> 12);
        long l2 = (long)(n4 |= n2 << 16) ^ 0x100000000L;
        ch ch2 = (ch)this.d.a(l2);
        if (ch2 != null) {
            return ch2;
        }
        if (arrn != null && arrn[0] <= 0) {
            return null;
        }
        ci ci2 = (ci)this.c.a(l2);
        if (ci2 == null) {
            ci2 = ci.a(this.f, n2, n3);
            if (ci2 == null) {
                return null;
            }
            this.c.a(ci2, l2);
        }
        if ((ch2 = ci2.a(arrn)) == null) {
            return null;
        }
        ci2.m();
        this.d.a(ch2, l2);
        return ch2;
    }

    public ch a(int n2, int[] arrn, byte by2) {
        if (this.e.b(0) != 1) {
            if (this.e.b(n2) != 1) {
                throw new RuntimeException();
            }
            return this.a(n2, 0, arrn);
        }
        return this.a(0, n2, arrn);
    }

    static void a(int n2) {
        if ((cQ.y = cQ.y.trim()).length() == 0) {
            dz.a(du.ds, du.dt, du.du);
        } else {
            int n3;
            long l2 = aY.b();
            if (l2 == 0) {
                n3 = 5;
            } else {
                int n4;
                block31 : {
                    int n5;
                    String string;
                    String string2 = cQ.y;
                    Random random = new Random();
                    cY cY2 = new cY(128);
                    cY cY3 = new cY(128);
                    int[] arrn = new int[]{random.nextInt(), random.nextInt(), (int)(l2 >> 32), (int)l2};
                    cY2.d(10);
                    for (n5 = 0; n5 < 4; ++n5) {
                        cY2.g(random.nextInt());
                    }
                    cY2.g(arrn[0]);
                    cY2.g(arrn[1]);
                    cY2.b(l2);
                    cY2.b(0);
                    for (n5 = 0; n5 < 4; ++n5) {
                        cY2.g(random.nextInt());
                    }
                    cY2.a(ar.a, ar.b);
                    cY3.d(10);
                    for (n5 = 0; n5 < 3; ++n5) {
                        cY3.g(random.nextInt());
                    }
                    cY3.b(random.nextLong());
                    cY3.a(random.nextLong());
                    cT.a(cY3, 1414336477);
                    cY3.b(random.nextLong());
                    cY3.a(ar.a, ar.b);
                    n5 = du.a(string2);
                    if (n5 % 8 != 0) {
                        n5 += 8 - n5 % 8;
                    }
                    cY cY4 = new cY(n5);
                    cY4.a(string2);
                    cY4.h = n5 * 1303963473;
                    cY4.b(arrn);
                    cY cY5 = new cY(cY4.h * 1736753585 + cY3.h * 1736753585 + cY2.h * 1736753585 + 5);
                    cY5.d(2);
                    cY5.d(cY2.h * 1736753585);
                    cY5.c(cY2.g, 0, cY2.h * 1736753585);
                    cY5.d(cY3.h * 1736753585);
                    cY5.c(cY3.g, 0, cY3.h * 1736753585);
                    cY5.e(cY4.h * 1736753585);
                    cY5.c(cY4.g, 0, cY4.h * 1736753585);
                    byte[] arrby = cY5.g;
                    String string3 = string = dp.a(arrby, 0, arrby.length, 46321444);
                    try {
                        URL uRL = new URL(dj.a("services", false) + "m=accountappeal/login.ws");
                        URLConnection uRLConnection = uRL.openConnection();
                        uRLConnection.setDoInput(true);
                        uRLConnection.setDoOutput(true);
                        uRLConnection.setConnectTimeout(5000);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(uRLConnection.getOutputStream());
                        outputStreamWriter.write("data2=" + aq.a(string3) + "&dest=" + aq.a("passwordchoice.ws"));
                        outputStreamWriter.flush();
                        InputStream inputStream = uRLConnection.getInputStream();
                        cY5 = new cY(new byte[1000]);
                        do {
                            int n6;
                            if ((n6 = inputStream.read(cY5.g, cY5.h * 1736753585, 1000 - cY5.h * 1736753585)) == -1) {
                                String string4;
                                boolean bl2;
                                block32 : {
                                    outputStreamWriter.close();
                                    inputStream.close();
                                    string4 = new String(cY5.g);
                                    if (string4.startsWith("OFFLINE")) {
                                        n4 = 4;
                                        break block31;
                                    }
                                    if (string4.startsWith("WRONG")) {
                                        n4 = 7;
                                        break block31;
                                    }
                                    if (string4.startsWith("RELOAD")) {
                                        n4 = 3;
                                        break block31;
                                    }
                                    if (string4.startsWith("Not permitted for social network accounts.")) {
                                        n4 = 6;
                                        break block31;
                                    }
                                    cY5.c(arrn);
                                    while (cY5.h * 1736753585 > 0 && cY5.g[cY5.h * 1736753585 - 1] == 0) {
                                        cY5.h -= 1303963473;
                                    }
                                    string4 = new String(cY5.g, 0, cY5.h * 1736753585);
                                    if (string4 == null) {
                                        bl2 = false;
                                    } else {
                                        try {
                                            new URL(string4);
                                        }
                                        catch (MalformedURLException var23_23) {
                                            bl2 = false;
                                            break block32;
                                        }
                                        bl2 = true;
                                    }
                                }
                                if (bl2) {
                                    bj.a(string4, true, false);
                                    n4 = 2;
                                } else {
                                    n4 = 5;
                                }
                                break block31;
                            }
                            cY5.h += n6 * 1303963473;
                        } while (cY5.h * 1736753585 < 1000);
                        n4 = 5;
                    }
                    catch (Throwable var16_15) {
                        var16_15.printStackTrace();
                        n4 = 5;
                    }
                }
                n3 = n4;
            }
            switch (n3) {
                case 2: {
                    dz.a(du.a, du.dv, du.dw);
                    cQ.u = -552582362;
                    break;
                }
                case 3: {
                    dz.a(du.a, du.dx, du.a);
                    break;
                }
                case 4: {
                    dz.a(du.dy, du.dz, du.dA);
                    break;
                }
                case 5: {
                    dz.a(du.dB, du.dC, du.dD);
                    break;
                }
                case 6: {
                    dz.a(du.a, du.dE, du.a);
                    break;
                }
                case 7: {
                    dz.a(du.dF, du.dG, du.dH);
                }
            }
        }
    }

    public dp(a a2, a a3) {
        this.e = a2;
        this.f = a3;
    }

    public static String a(byte[] arrby, int n2, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < n3 + n2; i2 += 3) {
            int n5 = arrby[i2] & 255;
            stringBuilder.append(bm.a[n5 >>> 2]);
            if (i2 < n3 - 1) {
                int n6 = arrby[i2 + 1] & 255;
                stringBuilder.append(bm.a[(n5 & 3) << 4 | n6 >>> 4]);
                if (i2 < n3 - 2) {
                    int n7 = arrby[2 + i2] & 255;
                    stringBuilder.append(bm.a[(n6 & 15) << 2 | n7 >>> 6]).append(bm.a[n7 & 63]);
                    continue;
                }
                stringBuilder.append(bm.a[(n6 & 15) << 2]).append("=");
                continue;
            }
            stringBuilder.append(bm.a[(n5 & 3) << 4]).append("==");
        }
        return stringBuilder.toString();
    }

    public ch b(int n2, int[] arrn, byte by2) {
        if (this.f.b(-95) != 1) {
            if (this.f.b(n2) == 1) {
                return this.a(n2, 0, arrn, 127);
            }
            throw new RuntimeException();
        }
        return this.a(0, n2, arrn, 41);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static final boolean a(byte[] var0, int var1_1, int var2_2) {
        var3_3 = true;
        var4_4 = new cY(var0);
        var5_5 = -1;
        block0 : do lbl-1000: // 3 sources:
        {
            if ((var6_6 = var4_4.q()) == 0) {
                return var3_3;
            }
            var5_5 += var6_6;
            var7_7 = 0;
            var8_8 = false;
            do {
                if (var8_8) ** GOTO lbl27
                var9_9 = var4_4.q();
                if (var9_9 == 0) ** GOTO lbl-1000
                var10_10 = (var7_7 += var9_9 - 1) & 63;
                var11_11 = var7_7 >> 6 & 63;
                var12_12 = var4_4.d() >> 2;
                var13_13 = var11_11 + var1_1;
                var14_14 = var10_10 + var2_2;
                if (var13_13 <= 0 || var14_14 <= 0 || var13_13 >= 103 || var14_14 >= 103) continue;
                var15_15 = cI.a(var5_5);
                if (var12_12 == 22 && bH.ae && var15_15.j * -1087968583 == 0 && var15_15.h * 445231797 != 1 && !var15_15.F) continue;
                if (!var15_15.b(16711680)) {
                    bH.V += 200080755;
                    var3_3 = false;
                }
                var8_8 = true;
                continue;
lbl27: // 1 sources:
                var9_9 = var4_4.q();
                if (var9_9 == 0) continue block0;
                var4_4.d();
            } while (true);
            break;
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final boolean a(byte by2) {
        cb cb2;
        cb cb3 = cb2 = cb.d;
        synchronized (cb3) {
            if (cb.m * 1213257401 == cb.l * 418546577) {
                return false;
            }
            aH.a = cb.i[cb.l * 418546577] * 1952977483;
            bE.d = cb.h[cb.l * 418546577];
            cb.l = (cb.l * 418546577 + 1 & 127) * -201024143;
            return true;
        }
    }
}

