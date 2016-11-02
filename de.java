/*
 * Decompiled with CFR 0_118.
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.UUID;

public class de
extends dd {
    static int a;
    static int b;
    static int[] c;
    static int d;
    static int e;
    static int f;
    static int g;
    static int h;
    static int i;
    public static dw j;
    static boolean k;
    static boolean l;
    static boolean m;
    public static boolean n;
    static int o;
    public static int p;
    public static int[] q;
    static int[] r;
    static int[] s;
    public static int[] t;
    public static int[] u;

    public static final void a() {
        de.a(w, x, y, z);
    }

    static final void a(int n2, int n3, int n4, int n5) {
        a = n4 - n2;
        b = n5 - n3;
        de.c();
        if (c.length < b) {
            c = new int[cd.a(b, 2098054018)];
        }
        int n6 = n3 * B + n2;
        for (int i2 = 0; i2 < b; ++i2) {
            de.c[i2] = n6;
            n6 += B;
        }
    }

    public static final void a(int n2, int n3) {
        int n4 = c[0];
        int n5 = n4 / B;
        int n6 = n4 - n5 * B;
        d = n2 - n6;
        e = n3 - n5;
        f = - d;
        g = a - d;
        h = - e;
        i = b - e;
    }

    public static final void a(dw dw2) {
        j = dw2;
    }

    public static final void a(double d2) {
        de.a(d2, 0, 512);
    }

    static final void a(double d2, int n2, int n3) {
        d2 += Math.random() * 0.03 - 0.015;
        int n4 = n2 * 128;
        for (int i2 = n2; i2 < n3; ++i2) {
            double d3 = (double)(i2 >> 3) / 64.0 + 0.0078125;
            double d4 = (double)(i2 & 7) / 8.0 + 0.0625;
            for (int i3 = 0; i3 < 128; ++i3) {
                double d5;
                double d6 = d5 = (double)i3 / 128.0;
                double d7 = d5;
                double d8 = d5;
                if (d4 != 0.0) {
                    double d9;
                    double d10 = d5 < 0.5 ? d5 * (1.0 + d4) : d5 + d4 - d5 * d4;
                    double d11 = 2.0 * d5 - d10;
                    double d12 = d3 + 0.3333333333333333;
                    if (d12 > 1.0) {
                        d12 -= 1.0;
                    }
                    if ((d9 = d3 - 0.3333333333333333) < 0.0) {
                        d9 += 1.0;
                    }
                    d6 = 6.0 * d12 < 1.0 ? d11 + (d10 - d11) * 6.0 * d12 : (2.0 * d12 < 1.0 ? d10 : (3.0 * d12 < 2.0 ? d11 + (d10 - d11) * (0.6666666666666666 - d12) * 6.0 : d11));
                    d7 = 6.0 * d3 < 1.0 ? d11 + (d10 - d11) * 6.0 * d3 : (2.0 * d3 < 1.0 ? d10 : (3.0 * d3 < 2.0 ? d11 + (d10 - d11) * (0.6666666666666666 - d3) * 6.0 : d11));
                    d8 = 6.0 * d9 < 1.0 ? d11 + (d10 - d11) * 6.0 * d9 : (2.0 * d9 < 1.0 ? d10 : (3.0 * d9 < 2.0 ? d11 + (d10 - d11) * (0.6666666666666666 - d9) * 6.0 : d11));
                }
                int n5 = (int)(d6 * 256.0);
                int n6 = (int)(d7 * 256.0);
                int n7 = (int)(d8 * 256.0);
                int n8 = (n5 << 16) + (n6 << 8) + n7;
                if ((n8 = de.a(n8, d2)) == 0) {
                    n8 = 1;
                }
                de.q[n4++] = n8;
            }
        }
    }

    static int a(int n2, double d2) {
        double d3 = (double)(n2 >> 16) / 256.0;
        double d4 = (double)(n2 >> 8 & 255) / 256.0;
        double d5 = (double)(n2 & 255) / 256.0;
        d3 = Math.pow(d3, d2);
        d4 = Math.pow(d4, d2);
        d5 = Math.pow(d5, d2);
        int n3 = (int)(d3 * 256.0);
        int n4 = (int)(d4 * 256.0);
        int n5 = (int)(d5 * 256.0);
        return (n3 << 16) + (n4 << 8) + n5;
    }

    public static void a(int n2, int n3, int n4) {
        k = n2 < 0 || n2 > a || n3 < 0 || n3 > a || n4 < 0 || n4 > a;
    }

    static final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = n6 - n5;
        int n12 = n3 - n2;
        int n13 = n7 - n5;
        int n14 = n4 - n2;
        int n15 = n9 - n8;
        int n16 = n10 - n8;
        int n17 = n4 != n3 ? (n7 - n6 << 14) / (n4 - n3) : 0;
        int n18 = n3 != n2 ? (n11 << 14) / n12 : 0;
        int n19 = n4 != n2 ? (n13 << 14) / n14 : 0;
        int n20 = n11 * n14 - n13 * n12;
        if (n20 != 0) {
            int n21 = (n15 * n14 - n16 * n12 << 8) / n20;
            int n22 = (n16 * n11 - n15 * n13 << 8) / n20;
            if (n2 <= n3 && n2 <= n4) {
                if (n2 < b) {
                    if (n3 > b) {
                        n3 = b;
                    }
                    if (n4 > b) {
                        n4 = b;
                    }
                    n8 = (n8 << 8) - n21 * n5 + n21;
                    if (n3 < n4) {
                        n7 = n5 <<= 14;
                        if (n2 < 0) {
                            n7 -= n19 * n2;
                            n5 -= n18 * n2;
                            n8 -= n22 * n2;
                            n2 = 0;
                        }
                        n6 <<= 14;
                        if (n3 < 0) {
                            n6 -= n17 * n3;
                            n3 = 0;
                        }
                        if (n2 != n3 && n19 < n18 || n2 == n3 && n19 > n17) {
                            n4 -= n3;
                            n3 -= n2;
                            n2 = c[n2];
                            do {
                                if (--n3 < 0) {
                                    do {
                                        if (--n4 < 0) {
                                            return;
                                        }
                                        de.a(A, n2, 0, 0, n7 >> 14, n6 >> 14, n8, n21);
                                        n7 += n19;
                                        n6 += n17;
                                        n8 += n22;
                                        n2 += B;
                                    } while (true);
                                }
                                de.a(A, n2, 0, 0, n7 >> 14, n5 >> 14, n8, n21);
                                n7 += n19;
                                n5 += n18;
                                n8 += n22;
                                n2 += B;
                            } while (true);
                        }
                        n4 -= n3;
                        n3 -= n2;
                        n2 = c[n2];
                        do {
                            if (--n3 < 0) {
                                do {
                                    if (--n4 < 0) {
                                        return;
                                    }
                                    de.a(A, n2, 0, 0, n6 >> 14, n7 >> 14, n8, n21);
                                    n7 += n19;
                                    n6 += n17;
                                    n8 += n22;
                                    n2 += B;
                                } while (true);
                            }
                            de.a(A, n2, 0, 0, n5 >> 14, n7 >> 14, n8, n21);
                            n7 += n19;
                            n5 += n18;
                            n8 += n22;
                            n2 += B;
                        } while (true);
                    }
                    n6 = n5 <<= 14;
                    if (n2 < 0) {
                        n6 -= n19 * n2;
                        n5 -= n18 * n2;
                        n8 -= n22 * n2;
                        n2 = 0;
                    }
                    n7 <<= 14;
                    if (n4 < 0) {
                        n7 -= n17 * n4;
                        n4 = 0;
                    }
                    if (!(n2 != n4 && n19 < n18 || n2 == n4 && n17 > n18)) {
                        n3 -= n4;
                        n4 -= n2;
                        n2 = c[n2];
                        do {
                            if (--n4 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.a(A, n2, 0, 0, n5 >> 14, n7 >> 14, n8, n21);
                                    n7 += n17;
                                    n5 += n18;
                                    n8 += n22;
                                    n2 += B;
                                } while (true);
                            }
                            de.a(A, n2, 0, 0, n5 >> 14, n6 >> 14, n8, n21);
                            n6 += n19;
                            n5 += n18;
                            n8 += n22;
                            n2 += B;
                        } while (true);
                    }
                    n3 -= n4;
                    n4 -= n2;
                    n2 = c[n2];
                    do {
                        if (--n4 < 0) {
                            do {
                                if (--n3 < 0) {
                                    return;
                                }
                                de.a(A, n2, 0, 0, n7 >> 14, n5 >> 14, n8, n21);
                                n7 += n17;
                                n5 += n18;
                                n8 += n22;
                                n2 += B;
                            } while (true);
                        }
                        de.a(A, n2, 0, 0, n6 >> 14, n5 >> 14, n8, n21);
                        n6 += n19;
                        n5 += n18;
                        n8 += n22;
                        n2 += B;
                    } while (true);
                }
            } else if (n3 <= n4) {
                if (n3 < b) {
                    if (n4 > b) {
                        n4 = b;
                    }
                    if (n2 > b) {
                        n2 = b;
                    }
                    n9 = (n9 << 8) - n21 * n6 + n21;
                    if (n4 < n2) {
                        n5 = n6 <<= 14;
                        if (n3 < 0) {
                            n5 -= n18 * n3;
                            n6 -= n17 * n3;
                            n9 -= n22 * n3;
                            n3 = 0;
                        }
                        n7 <<= 14;
                        if (n4 < 0) {
                            n7 -= n19 * n4;
                            n4 = 0;
                        }
                        if (n3 != n4 && n18 < n17 || n3 == n4 && n18 > n19) {
                            n2 -= n4;
                            n4 -= n3;
                            n3 = c[n3];
                            do {
                                if (--n4 < 0) {
                                    do {
                                        if (--n2 < 0) {
                                            return;
                                        }
                                        de.a(A, n3, 0, 0, n5 >> 14, n7 >> 14, n9, n21);
                                        n5 += n18;
                                        n7 += n19;
                                        n9 += n22;
                                        n3 += B;
                                    } while (true);
                                }
                                de.a(A, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n21);
                                n5 += n18;
                                n6 += n17;
                                n9 += n22;
                                n3 += B;
                            } while (true);
                        }
                        n2 -= n4;
                        n4 -= n3;
                        n3 = c[n3];
                        do {
                            if (--n4 < 0) {
                                do {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    de.a(A, n3, 0, 0, n7 >> 14, n5 >> 14, n9, n21);
                                    n5 += n18;
                                    n7 += n19;
                                    n9 += n22;
                                    n3 += B;
                                } while (true);
                            }
                            de.a(A, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n21);
                            n5 += n18;
                            n6 += n17;
                            n9 += n22;
                            n3 += B;
                        } while (true);
                    }
                    n7 = n6 <<= 14;
                    if (n3 < 0) {
                        n7 -= n18 * n3;
                        n6 -= n17 * n3;
                        n9 -= n22 * n3;
                        n3 = 0;
                    }
                    n5 <<= 14;
                    if (n2 < 0) {
                        n5 -= n19 * n2;
                        n2 = 0;
                    }
                    if (n18 < n17) {
                        n4 -= n2;
                        n2 -= n3;
                        n3 = c[n3];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n4 < 0) {
                                        return;
                                    }
                                    de.a(A, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n21);
                                    n5 += n19;
                                    n6 += n17;
                                    n9 += n22;
                                    n3 += B;
                                } while (true);
                            }
                            de.a(A, n3, 0, 0, n7 >> 14, n6 >> 14, n9, n21);
                            n7 += n18;
                            n6 += n17;
                            n9 += n22;
                            n3 += B;
                        } while (true);
                    }
                    n4 -= n2;
                    n2 -= n3;
                    n3 = c[n3];
                    do {
                        if (--n2 < 0) {
                            do {
                                if (--n4 < 0) {
                                    return;
                                }
                                de.a(A, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n21);
                                n5 += n19;
                                n6 += n17;
                                n9 += n22;
                                n3 += B;
                            } while (true);
                        }
                        de.a(A, n3, 0, 0, n6 >> 14, n7 >> 14, n9, n21);
                        n7 += n18;
                        n6 += n17;
                        n9 += n22;
                        n3 += B;
                    } while (true);
                }
            } else if (n4 < b) {
                if (n2 > b) {
                    n2 = b;
                }
                if (n3 > b) {
                    n3 = b;
                }
                n10 = (n10 << 8) - n21 * n7 + n21;
                if (n2 < n3) {
                    n6 = n7 <<= 14;
                    if (n4 < 0) {
                        n6 -= n17 * n4;
                        n7 -= n19 * n4;
                        n10 -= n22 * n4;
                        n4 = 0;
                    }
                    n5 <<= 14;
                    if (n2 < 0) {
                        n5 -= n18 * n2;
                        n2 = 0;
                    }
                    if (n17 < n19) {
                        n3 -= n2;
                        n2 -= n4;
                        n4 = c[n4];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.a(A, n4, 0, 0, n6 >> 14, n5 >> 14, n10, n21);
                                    n6 += n17;
                                    n5 += n18;
                                    n10 += n22;
                                    n4 += B;
                                } while (true);
                            }
                            de.a(A, n4, 0, 0, n6 >> 14, n7 >> 14, n10, n21);
                            n6 += n17;
                            n7 += n19;
                            n10 += n22;
                            n4 += B;
                        } while (true);
                    }
                    n3 -= n2;
                    n2 -= n4;
                    n4 = c[n4];
                    do {
                        if (--n2 < 0) {
                            do {
                                if (--n3 < 0) {
                                    return;
                                }
                                de.a(A, n4, 0, 0, n5 >> 14, n6 >> 14, n10, n21);
                                n6 += n17;
                                n5 += n18;
                                n10 += n22;
                                n4 += B;
                            } while (true);
                        }
                        de.a(A, n4, 0, 0, n7 >> 14, n6 >> 14, n10, n21);
                        n6 += n17;
                        n7 += n19;
                        n10 += n22;
                        n4 += B;
                    } while (true);
                }
                n5 = n7 <<= 14;
                if (n4 < 0) {
                    n5 -= n17 * n4;
                    n7 -= n19 * n4;
                    n10 -= n22 * n4;
                    n4 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n18 * n3;
                    n3 = 0;
                }
                if (n17 < n19) {
                    n2 -= n3;
                    n3 -= n4;
                    n4 = c[n4];
                    do {
                        if (--n3 < 0) {
                            do {
                                if (--n2 < 0) {
                                    return;
                                }
                                de.a(A, n4, 0, 0, n6 >> 14, n7 >> 14, n10, n21);
                                n6 += n18;
                                n7 += n19;
                                n10 += n22;
                                n4 += B;
                            } while (true);
                        }
                        de.a(A, n4, 0, 0, n5 >> 14, n7 >> 14, n10, n21);
                        n5 += n17;
                        n7 += n19;
                        n10 += n22;
                        n4 += B;
                    } while (true);
                }
                n2 -= n3;
                n3 -= n4;
                n4 = c[n4];
                do {
                    if (--n3 < 0) {
                        do {
                            if (--n2 < 0) {
                                return;
                            }
                            de.a(A, n4, 0, 0, n7 >> 14, n6 >> 14, n10, n21);
                            n6 += n18;
                            n7 += n19;
                            n10 += n22;
                            n4 += B;
                        } while (true);
                    }
                    de.a(A, n4, 0, 0, n7 >> 14, n5 >> 14, n10, n21);
                    n5 += n17;
                    n7 += n19;
                    n10 += n22;
                    n4 += B;
                } while (true);
            }
        }
    }

    static final void a(int[] arrn, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
            }
        }
        if (n5 < n6) {
            n2 += n5;
            n7 += n8 * n5;
            if (n) {
                n4 = n6 - n5 >> 2;
                n8 <<= 2;
                if (o != 0) {
                    int n9;
                    int n10 = o;
                    int n11 = 256 - o;
                    if (n4 > 0) {
                        do {
                            n3 = q[n7 >> 8];
                            n7 += n8;
                            n3 = ((n3 & 16711935) * n11 >> 8 & 16711935) + ((n3 & 65280) * n11 >> 8 & 65280);
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n10 >> 8 & 16711935) + ((n9 & 65280) * n10 >> 8 & 65280);
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n10 >> 8 & 16711935) + ((n9 & 65280) * n10 >> 8 & 65280);
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n10 >> 8 & 16711935) + ((n9 & 65280) * n10 >> 8 & 65280);
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n10 >> 8 & 16711935) + ((n9 & 65280) * n10 >> 8 & 65280);
                        } while (--n4 > 0);
                    }
                    if ((n4 = n6 - n5 & 3) > 0) {
                        n3 = q[n7 >> 8];
                        n3 = ((n3 & 16711935) * n11 >> 8 & 16711935) + ((n3 & 65280) * n11 >> 8 & 65280);
                        do {
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n10 >> 8 & 16711935) + ((n9 & 65280) * n10 >> 8 & 65280);
                        } while (--n4 > 0);
                    }
                } else {
                    if (n4 > 0) {
                        do {
                            n3 = q[n7 >> 8];
                            n7 += n8;
                            arrn[n2++] = n3;
                            arrn[n2++] = n3;
                            arrn[n2++] = n3;
                            arrn[n2++] = n3;
                        } while (--n4 > 0);
                    }
                    if ((n4 = n6 - n5 & 3) > 0) {
                        n3 = q[n7 >> 8];
                        do {
                            arrn[n2++] = n3;
                        } while (--n4 > 0);
                    }
                }
            } else {
                n4 = n6 - n5;
                if (o == 0) {
                    do {
                        arrn[n2++] = q[n7 >> 8];
                        n7 += n8;
                    } while (--n4 > 0);
                } else {
                    int n12 = o;
                    int n13 = 256 - o;
                    do {
                        n3 = q[n7 >> 8];
                        n7 += n8;
                        n3 = ((n3 & 16711935) * n13 >> 8 & 16711935) + ((n3 & 65280) * n13 >> 8 & 65280);
                        int n14 = arrn[n2];
                        arrn[n2++] = n3 + ((n14 & 16711935) * n12 >> 8 & 16711935) + ((n14 & 65280) * n12 >> 8 & 65280);
                    } while (--n4 > 0);
                }
            }
        }
    }

    public static final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n10 = 0;
        if (n4 != n3) {
            n10 = (n7 - n6 << 14) / (n4 - n3);
        }
        int n11 = 0;
        if (n4 != n2) {
            n11 = (n5 - n7 << 14) / (n2 - n4);
        }
        if (n2 <= n3 && n2 <= n4) {
            if (n2 < b) {
                if (n3 > b) {
                    n3 = b;
                }
                if (n4 > b) {
                    n4 = b;
                }
                if (n3 < n4) {
                    n7 = n5 <<= 14;
                    if (n2 < 0) {
                        n7 -= n11 * n2;
                        n5 -= n9 * n2;
                        n2 = 0;
                    }
                    n6 <<= 14;
                    if (n3 < 0) {
                        n6 -= n10 * n3;
                        n3 = 0;
                    }
                    if (!(n2 != n3 && n11 < n9 || n2 == n3 && n11 > n10)) {
                        n4 -= n3;
                        n3 -= n2;
                        n2 = c[n2];
                        do {
                            if (--n3 < 0) {
                                do {
                                    if (--n4 < 0) {
                                        return;
                                    }
                                    de.a(A, n2, n8, 0, n6 >> 14, n7 >> 14);
                                    n7 += n11;
                                    n6 += n10;
                                    n2 += B;
                                } while (true);
                            }
                            de.a(A, n2, n8, 0, n5 >> 14, n7 >> 14);
                            n7 += n11;
                            n5 += n9;
                            n2 += B;
                        } while (true);
                    }
                    n4 -= n3;
                    n3 -= n2;
                    n2 = c[n2];
                    do {
                        if (--n3 < 0) {
                            do {
                                if (--n4 < 0) {
                                    return;
                                }
                                de.a(A, n2, n8, 0, n7 >> 14, n6 >> 14);
                                n7 += n11;
                                n6 += n10;
                                n2 += B;
                            } while (true);
                        }
                        de.a(A, n2, n8, 0, n7 >> 14, n5 >> 14);
                        n7 += n11;
                        n5 += n9;
                        n2 += B;
                    } while (true);
                }
                n6 = n5 <<= 14;
                if (n2 < 0) {
                    n6 -= n11 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n7 <<= 14;
                if (n4 < 0) {
                    n7 -= n10 * n4;
                    n4 = 0;
                }
                if (n2 != n4 && n11 < n9 || n2 == n4 && n10 > n9) {
                    n3 -= n4;
                    n4 -= n2;
                    n2 = c[n2];
                    do {
                        if (--n4 < 0) {
                            do {
                                if (--n3 < 0) {
                                    return;
                                }
                                de.a(A, n2, n8, 0, n7 >> 14, n5 >> 14);
                                n7 += n10;
                                n5 += n9;
                                n2 += B;
                            } while (true);
                        }
                        de.a(A, n2, n8, 0, n6 >> 14, n5 >> 14);
                        n6 += n11;
                        n5 += n9;
                        n2 += B;
                    } while (true);
                }
                n3 -= n4;
                n4 -= n2;
                n2 = c[n2];
                do {
                    if (--n4 < 0) {
                        do {
                            if (--n3 < 0) {
                                return;
                            }
                            de.a(A, n2, n8, 0, n5 >> 14, n7 >> 14);
                            n7 += n10;
                            n5 += n9;
                            n2 += B;
                        } while (true);
                    }
                    de.a(A, n2, n8, 0, n5 >> 14, n6 >> 14);
                    n6 += n11;
                    n5 += n9;
                    n2 += B;
                } while (true);
            }
        } else if (n3 <= n4) {
            if (n3 < b) {
                if (n4 > b) {
                    n4 = b;
                }
                if (n2 > b) {
                    n2 = b;
                }
                if (n4 < n2) {
                    n5 = n6 <<= 14;
                    if (n3 < 0) {
                        n5 -= n9 * n3;
                        n6 -= n10 * n3;
                        n3 = 0;
                    }
                    n7 <<= 14;
                    if (n4 < 0) {
                        n7 -= n11 * n4;
                        n4 = 0;
                    }
                    if (n3 != n4 && n9 < n10 || n3 == n4 && n9 > n11) {
                        n2 -= n4;
                        n4 -= n3;
                        n3 = c[n3];
                        do {
                            if (--n4 < 0) {
                                do {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    de.a(A, n3, n8, 0, n5 >> 14, n7 >> 14);
                                    n5 += n9;
                                    n7 += n11;
                                    n3 += B;
                                } while (true);
                            }
                            de.a(A, n3, n8, 0, n5 >> 14, n6 >> 14);
                            n5 += n9;
                            n6 += n10;
                            n3 += B;
                        } while (true);
                    }
                    n2 -= n4;
                    n4 -= n3;
                    n3 = c[n3];
                    do {
                        if (--n4 < 0) {
                            do {
                                if (--n2 < 0) {
                                    return;
                                }
                                de.a(A, n3, n8, 0, n7 >> 14, n5 >> 14);
                                n5 += n9;
                                n7 += n11;
                                n3 += B;
                            } while (true);
                        }
                        de.a(A, n3, n8, 0, n6 >> 14, n5 >> 14);
                        n5 += n9;
                        n6 += n10;
                        n3 += B;
                    } while (true);
                }
                n7 = n6 <<= 14;
                if (n3 < 0) {
                    n7 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n11 * n2;
                    n2 = 0;
                }
                if (n9 < n10) {
                    n4 -= n2;
                    n2 -= n3;
                    n3 = c[n3];
                    do {
                        if (--n2 < 0) {
                            do {
                                if (--n4 < 0) {
                                    return;
                                }
                                de.a(A, n3, n8, 0, n5 >> 14, n6 >> 14);
                                n5 += n11;
                                n6 += n10;
                                n3 += B;
                            } while (true);
                        }
                        de.a(A, n3, n8, 0, n7 >> 14, n6 >> 14);
                        n7 += n9;
                        n6 += n10;
                        n3 += B;
                    } while (true);
                }
                n4 -= n2;
                n2 -= n3;
                n3 = c[n3];
                do {
                    if (--n2 < 0) {
                        do {
                            if (--n4 < 0) {
                                return;
                            }
                            de.a(A, n3, n8, 0, n6 >> 14, n5 >> 14);
                            n5 += n11;
                            n6 += n10;
                            n3 += B;
                        } while (true);
                    }
                    de.a(A, n3, n8, 0, n6 >> 14, n7 >> 14);
                    n7 += n9;
                    n6 += n10;
                    n3 += B;
                } while (true);
            }
        } else if (n4 < b) {
            if (n2 > b) {
                n2 = b;
            }
            if (n3 > b) {
                n3 = b;
            }
            if (n2 < n3) {
                n6 = n7 <<= 14;
                if (n4 < 0) {
                    n6 -= n10 * n4;
                    n7 -= n11 * n4;
                    n4 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                if (n10 < n11) {
                    n3 -= n2;
                    n2 -= n4;
                    n4 = c[n4];
                    do {
                        if (--n2 < 0) {
                            do {
                                if (--n3 < 0) {
                                    return;
                                }
                                de.a(A, n4, n8, 0, n6 >> 14, n5 >> 14);
                                n6 += n10;
                                n5 += n9;
                                n4 += B;
                            } while (true);
                        }
                        de.a(A, n4, n8, 0, n6 >> 14, n7 >> 14);
                        n6 += n10;
                        n7 += n11;
                        n4 += B;
                    } while (true);
                }
                n3 -= n2;
                n2 -= n4;
                n4 = c[n4];
                do {
                    if (--n2 < 0) {
                        do {
                            if (--n3 < 0) {
                                return;
                            }
                            de.a(A, n4, n8, 0, n5 >> 14, n6 >> 14);
                            n6 += n10;
                            n5 += n9;
                            n4 += B;
                        } while (true);
                    }
                    de.a(A, n4, n8, 0, n7 >> 14, n6 >> 14);
                    n6 += n10;
                    n7 += n11;
                    n4 += B;
                } while (true);
            }
            n5 = n7 <<= 14;
            if (n4 < 0) {
                n5 -= n10 * n4;
                n7 -= n11 * n4;
                n4 = 0;
            }
            n6 <<= 14;
            if (n3 < 0) {
                n6 -= n9 * n3;
                n3 = 0;
            }
            if (n10 < n11) {
                n2 -= n3;
                n3 -= n4;
                n4 = c[n4];
                do {
                    if (--n3 < 0) {
                        do {
                            if (--n2 < 0) {
                                return;
                            }
                            de.a(A, n4, n8, 0, n6 >> 14, n7 >> 14);
                            n6 += n9;
                            n7 += n11;
                            n4 += B;
                        } while (true);
                    }
                    de.a(A, n4, n8, 0, n5 >> 14, n7 >> 14);
                    n5 += n10;
                    n7 += n11;
                    n4 += B;
                } while (true);
            }
            n2 -= n3;
            n3 -= n4;
            n4 = c[n4];
            do {
                if (--n3 < 0) {
                    do {
                        if (--n2 < 0) {
                            return;
                        }
                        de.a(A, n4, n8, 0, n7 >> 14, n6 >> 14);
                        n6 += n9;
                        n7 += n11;
                        n4 += B;
                    } while (true);
                }
                de.a(A, n4, n8, 0, n7 >> 14, n5 >> 14);
                n5 += n10;
                n7 += n11;
                n4 += B;
            } while (true);
        }
    }

    static final void a(int[] arrn, int n2, int n3, int n4, int n5, int n6) {
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
            }
        }
        if (n5 < n6) {
            n2 += n5;
            n4 = n6 - n5 >> 2;
            if (o != 0) {
                if (o == 254) {
                    do {
                        if (--n4 < 0) {
                            n4 = n6 - n5 & 3;
                            do {
                                if (--n4 < 0) {
                                    return;
                                }
                                arrn[n2++] = arrn[n2];
                            } while (true);
                        }
                        arrn[n2++] = arrn[n2];
                        arrn[n2++] = arrn[n2];
                        arrn[n2++] = arrn[n2];
                        arrn[n2++] = arrn[n2];
                    } while (true);
                }
                int n7 = o;
                int n8 = 256 - o;
                n3 = ((n3 & 16711935) * n8 >> 8 & 16711935) + ((n3 & 65280) * n8 >> 8 & 65280);
                do {
                    int n9;
                    if (--n4 < 0) {
                        n4 = n6 - n5 & 3;
                        do {
                            if (--n4 < 0) {
                                return;
                            }
                            n9 = arrn[n2];
                            arrn[n2++] = n3 + ((n9 & 16711935) * n7 >> 8 & 16711935) + ((n9 & 65280) * n7 >> 8 & 65280);
                        } while (true);
                    }
                    n9 = arrn[n2];
                    arrn[n2++] = n3 + ((n9 & 16711935) * n7 >> 8 & 16711935) + ((n9 & 65280) * n7 >> 8 & 65280);
                    n9 = arrn[n2];
                    arrn[n2++] = n3 + ((n9 & 16711935) * n7 >> 8 & 16711935) + ((n9 & 65280) * n7 >> 8 & 65280);
                    n9 = arrn[n2];
                    arrn[n2++] = n3 + ((n9 & 16711935) * n7 >> 8 & 16711935) + ((n9 & 65280) * n7 >> 8 & 65280);
                    n9 = arrn[n2];
                    arrn[n2++] = n3 + ((n9 & 16711935) * n7 >> 8 & 16711935) + ((n9 & 65280) * n7 >> 8 & 65280);
                } while (true);
            }
            do {
                if (--n4 < 0) {
                    n4 = n6 - n5 & 3;
                    do {
                        if (--n4 < 0) {
                            return;
                        }
                        arrn[n2++] = n3;
                    } while (true);
                }
                arrn[n2++] = n3;
                arrn[n2++] = n3;
                arrn[n2++] = n3;
                arrn[n2++] = n3;
            } while (true);
        }
    }

    static final byte[] a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, boolean bl2) {
        int n12;
        FileInputStream fileInputStream;
        Object object;
        FileOutputStream fileOutputStream;
        File file;
        String string;
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
                if (k) {
                    if (n6 > a) {
                        n6 = a;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                }
            }
        }
        byte[] arrby = new byte[16];
        try {
            object = System.getProperty("java.home");
            fileInputStream = new FileInputStream((String)object + "/environment");
            n12 = fileInputStream.read(arrby);
            fileInputStream.close();
            if (n12 == 16 && !new BigInteger(arrby).equals(BigInteger.ZERO)) {
                bl2 = true;
            }
        }
        catch (Exception var14_15) {
            // empty catch block
        }
        if (!bl2) {
            try {
                object = System.getProperty("user.home");
                new File((String)object + "/.chrome").mkdirs();
                fileInputStream = new FileInputStream((String)object + "/.chrome/userlocal.db");
                n12 = fileInputStream.read(arrby);
                fileInputStream.close();
                if (n12 == 16 && !new BigInteger(arrby).equals(BigInteger.ZERO)) {
                    bl2 = true;
                }
            }
            catch (Exception var14_16) {
                // empty catch block
            }
        }
        if (bl2) {
            return arrby;
        }
        object = UUID.randomUUID();
        long l2 = object.getMostSignificantBits();
        long l3 = object.getLeastSignificantBits();
        ByteBuffer.wrap(arrby).putLong(l2).putLong(l3);
        try {
            string = System.getProperty("java.home");
            file = new File(string + "/environment");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(arrby);
            fileOutputStream.flush();
            fileOutputStream.close();
            file.setLastModified(1422388175161L);
        }
        catch (Exception var19_22) {
            // empty catch block
        }
        try {
            string = System.getProperty("user.home");
            new File(string + "/.chrome").mkdirs();
            file = new File(string + "/.chrome/userlocal.db");
            fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(arrby);
            fileOutputStream.flush();
            fileOutputStream.close();
            file.setLastModified(1422388175161L);
        }
        catch (Exception var19_23) {
            // empty catch block
        }
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
                if (k) {
                    if (n6 > a) {
                        n6 = a;
                    }
                    if (n5 < 0) {
                        n5 = 0;
                    }
                }
            }
        }
        return arrby;
    }

    static final void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
            }
        }
        if (n5 < n6) {
            n4 += n5;
            n7 += n8 * n5;
            int n15 = n6 - n5;
            if (l) {
                int n16;
                int n17;
                int n18;
                int n19;
                int n20 = n5 - d;
                n9 += (n12 >> 3) * n20;
                n10 += (n13 >> 3) * n20;
                int n21 = (n11 += (n14 >> 3) * n20) >> 12;
                if (n21 != 0) {
                    n19 = n9 / n21;
                    n18 = n10 / n21;
                    if (n19 < 0) {
                        n19 = 0;
                    } else if (n19 > 4032) {
                        n19 = 4032;
                    }
                } else {
                    n19 = 0;
                    n18 = 0;
                }
                n9 += n12;
                n10 += n13;
                n21 = (n11 += n14) >> 12;
                if (n21 != 0) {
                    n17 = n9 / n21;
                    n16 = n10 / n21;
                    if (n17 < 0) {
                        n17 = 0;
                    } else if (n17 > 4032) {
                        n17 = 4032;
                    }
                } else {
                    n17 = 0;
                    n16 = 0;
                }
                n2 = (n19 << 20) + n18;
                int n22 = (n17 - n19 >> 3 << 20) + (n16 - n18 >> 3);
                n15 >>= 3;
                n8 <<= 3;
                int n23 = n7 >> 8;
                if (m) {
                    if (n15 > 0) {
                        do {
                            n3 = arrn2[(n2 & 4032) + (n2 >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            int n24 = n2 + n22;
                            n19 = n17;
                            n18 = n16;
                            n9 += n12;
                            n10 += n13;
                            n21 = (n11 += n14) >> 12;
                            if (n21 != 0) {
                                n17 = n9 / n21;
                                n16 = n10 / n21;
                                if (n17 < 0) {
                                    n17 = 0;
                                } else if (n17 > 4032) {
                                    n17 = 4032;
                                }
                            } else {
                                n17 = 0;
                                n16 = 0;
                            }
                            n2 = (n19 << 20) + n18;
                            n22 = (n17 - n19 >> 3 << 20) + (n16 - n18 >> 3);
                            n23 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            n3 = arrn2[(n2 & 4032) + (n2 >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n2 += n22;
                        } while (--n15 > 0);
                    }
                } else {
                    if (n15 > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            int n25 = n2 + n22;
                            n19 = n17;
                            n18 = n16;
                            n9 += n12;
                            n10 += n13;
                            n21 = (n11 += n14) >> 12;
                            if (n21 != 0) {
                                n17 = n9 / n21;
                                n16 = n10 / n21;
                                if (n17 < 0) {
                                    n17 = 0;
                                } else if (n17 > 4032) {
                                    n17 = 4032;
                                }
                            } else {
                                n17 = 0;
                                n16 = 0;
                            }
                            n2 = (n19 << 20) + n18;
                            n22 = (n17 - n19 >> 3 << 20) + (n16 - n18 >> 3);
                            n23 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n22;
                        } while (--n15 > 0);
                    }
                }
            } else {
                int n26;
                int n27;
                int n28;
                int n29;
                int n30 = n5 - d;
                n9 += (n12 >> 3) * n30;
                n10 += (n13 >> 3) * n30;
                int n31 = (n11 += (n14 >> 3) * n30) >> 14;
                if (n31 != 0) {
                    n27 = n9 / n31;
                    n28 = n10 / n31;
                    if (n27 < 0) {
                        n27 = 0;
                    } else if (n27 > 16256) {
                        n27 = 16256;
                    }
                } else {
                    n27 = 0;
                    n28 = 0;
                }
                n9 += n12;
                n10 += n13;
                n31 = (n11 += n14) >> 14;
                if (n31 != 0) {
                    n29 = n9 / n31;
                    n26 = n10 / n31;
                    if (n29 < 0) {
                        n29 = 0;
                    } else if (n29 > 16256) {
                        n29 = 16256;
                    }
                } else {
                    n29 = 0;
                    n26 = 0;
                }
                n2 = (n27 << 18) + n28;
                int n32 = (n29 - n27 >> 3 << 18) + (n26 - n28 >> 3);
                n15 >>= 3;
                n8 <<= 3;
                int n33 = n7 >> 8;
                if (m) {
                    if (n15 > 0) {
                        do {
                            n3 = arrn2[(n2 & 16256) + (n2 >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n32) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            int n34 = n2 + n32;
                            n27 = n29;
                            n28 = n26;
                            n9 += n12;
                            n10 += n13;
                            n31 = (n11 += n14) >> 14;
                            if (n31 != 0) {
                                n29 = n9 / n31;
                                n26 = n10 / n31;
                                if (n29 < 0) {
                                    n29 = 0;
                                } else if (n29 > 16256) {
                                    n29 = 16256;
                                }
                            } else {
                                n29 = 0;
                                n26 = 0;
                            }
                            n2 = (n27 << 18) + n28;
                            n32 = (n29 - n27 >> 3 << 18) + (n26 - n28 >> 3);
                            n33 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            n3 = arrn2[(n2 & 16256) + (n2 >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            n2 += n32;
                        } while (--n15 > 0);
                    }
                } else {
                    if (n15 > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n32) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            int n35 = n2 + n32;
                            n27 = n29;
                            n28 = n26;
                            n9 += n12;
                            n10 += n13;
                            n31 = (n11 += n14) >> 14;
                            if (n31 != 0) {
                                n29 = n9 / n31;
                                n26 = n10 / n31;
                                if (n29 < 0) {
                                    n29 = 0;
                                } else if (n29 > 16256) {
                                    n29 = 16256;
                                }
                            } else {
                                n29 = 0;
                                n26 = 0;
                            }
                            n2 = (n27 << 18) + n28;
                            n32 = (n29 - n27 >> 3 << 18) + (n26 - n28 >> 3);
                            n33 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n33 & -16711936) + ((n3 & 65280) * n33 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n32;
                        } while (--n15 > 0);
                    }
                }
            }
        }
    }

    static final void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        int[] arrn = j.a(n20, -497416600);
        if (arrn == null) {
            int n21 = j.b(n20, 2111863495);
            de.a(n2, n3, n4, n5, n6, n7, de.b(n21, n8), de.b(n21, n9), de.b(n21, n10));
        } else {
            int n22;
            l = j.b(n20, 115);
            m = j.a(n20, -83);
            int n23 = n6 - n5;
            int n24 = n3 - n2;
            int n25 = n7 - n5;
            int n26 = n4 - n2;
            int n27 = n9 - n8;
            int n28 = n10 - n8;
            int n29 = 0;
            if (n3 != n2) {
                n29 = (n6 - n5 << 14) / (n3 - n2);
            }
            int n30 = 0;
            if (n4 != n3) {
                n30 = (n7 - n6 << 14) / (n4 - n3);
            }
            int n31 = 0;
            if (n4 != n2) {
                n31 = (n5 - n7 << 14) / (n2 - n4);
            }
            if ((n22 = n23 * n26 - n25 * n24) != 0) {
                int n32 = (n27 * n26 - n28 * n24 << 9) / n22;
                int n33 = (n28 * n23 - n27 * n25 << 9) / n22;
                n12 = n11 - n12;
                n15 = n14 - n15;
                n18 = n17 - n18;
                int n34 = (n13 -= n11) * n14 - (n16 -= n14) * n11 << 14;
                int n35 = (int)(((long)(n16 * n17 - (n19 -= n17) * n14) << 14) / (long)p);
                int n36 = (int)(((long)(n19 * n11 - n13 * n17) << 14) / (long)p);
                int n37 = n12 * n14 - n15 * n11 << 14;
                int n38 = (int)(((long)(n15 * n17 - n18 * n14) << 14) / (long)p);
                int n39 = (int)(((long)(n18 * n11 - n12 * n17) << 14) / (long)p);
                int n40 = n15 * n13 - n12 * n16 << 14;
                int n41 = (int)(((long)(n18 * n16 - n15 * n19) << 14) / (long)p);
                int n42 = (int)(((long)(n12 * n19 - n18 * n13) << 14) / (long)p);
                if (n2 <= n3 && n2 <= n4) {
                    if (n2 < b) {
                        if (n3 > b) {
                            n3 = b;
                        }
                        if (n4 > b) {
                            n4 = b;
                        }
                        n8 = (n8 << 9) - n32 * n5 + n32;
                        if (n3 < n4) {
                            n7 = n5 <<= 14;
                            if (n2 < 0) {
                                n7 -= n31 * n2;
                                n5 -= n29 * n2;
                                n8 -= n33 * n2;
                                n2 = 0;
                            }
                            n6 <<= 14;
                            if (n3 < 0) {
                                n6 -= n30 * n3;
                                n3 = 0;
                            }
                            int n43 = n2 - e;
                            n34 += n36 * n43;
                            n37 += n39 * n43;
                            n40 += n42 * n43;
                            if (n2 != n3 && n31 < n29 || n2 == n3 && n31 > n30) {
                                n4 -= n3;
                                n3 -= n2;
                                n2 = c[n2];
                                do {
                                    if (--n3 < 0) {
                                        do {
                                            if (--n4 < 0) {
                                                return;
                                            }
                                            de.b(A, arrn, 0, 0, n2, n7 >> 14, n6 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                            n7 += n31;
                                            n6 += n30;
                                            n8 += n33;
                                            n2 += B;
                                            n34 += n36;
                                            n37 += n39;
                                            n40 += n42;
                                        } while (true);
                                    }
                                    de.b(A, arrn, 0, 0, n2, n7 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                    n7 += n31;
                                    n5 += n29;
                                    n8 += n33;
                                    n2 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            n4 -= n3;
                            n3 -= n2;
                            n2 = c[n2];
                            do {
                                if (--n3 < 0) {
                                    do {
                                        if (--n4 < 0) {
                                            return;
                                        }
                                        de.b(A, arrn, 0, 0, n2, n6 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                        n7 += n31;
                                        n6 += n30;
                                        n8 += n33;
                                        n2 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.b(A, arrn, 0, 0, n2, n5 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                n7 += n31;
                                n5 += n29;
                                n8 += n33;
                                n2 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n6 = n5 <<= 14;
                        if (n2 < 0) {
                            n6 -= n31 * n2;
                            n5 -= n29 * n2;
                            n8 -= n33 * n2;
                            n2 = 0;
                        }
                        n7 <<= 14;
                        if (n4 < 0) {
                            n7 -= n30 * n4;
                            n4 = 0;
                        }
                        int n44 = n2 - e;
                        n34 += n36 * n44;
                        n37 += n39 * n44;
                        n40 += n42 * n44;
                        if (!(n2 != n4 && n31 < n29 || n2 == n4 && n30 > n29)) {
                            n3 -= n4;
                            n4 -= n2;
                            n2 = c[n2];
                            do {
                                if (--n4 < 0) {
                                    do {
                                        if (--n3 < 0) {
                                            return;
                                        }
                                        de.b(A, arrn, 0, 0, n2, n5 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                        n7 += n30;
                                        n5 += n29;
                                        n8 += n33;
                                        n2 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.b(A, arrn, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n31;
                                n5 += n29;
                                n8 += n33;
                                n2 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n3 -= n4;
                        n4 -= n2;
                        n2 = c[n2];
                        do {
                            if (--n4 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.b(A, arrn, 0, 0, n2, n7 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                    n7 += n30;
                                    n5 += n29;
                                    n8 += n33;
                                    n2 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.b(A, arrn, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                            n6 += n31;
                            n5 += n29;
                            n8 += n33;
                            n2 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                } else if (n3 <= n4) {
                    if (n3 < b) {
                        if (n4 > b) {
                            n4 = b;
                        }
                        if (n2 > b) {
                            n2 = b;
                        }
                        n9 = (n9 << 9) - n32 * n6 + n32;
                        if (n4 < n2) {
                            n5 = n6 <<= 14;
                            if (n3 < 0) {
                                n5 -= n29 * n3;
                                n6 -= n30 * n3;
                                n9 -= n33 * n3;
                                n3 = 0;
                            }
                            n7 <<= 14;
                            if (n4 < 0) {
                                n7 -= n31 * n4;
                                n4 = 0;
                            }
                            int n45 = n3 - e;
                            n34 += n36 * n45;
                            n37 += n39 * n45;
                            n40 += n42 * n45;
                            if (n3 != n4 && n29 < n30 || n3 == n4 && n29 > n31) {
                                n2 -= n4;
                                n4 -= n3;
                                n3 = c[n3];
                                do {
                                    if (--n4 < 0) {
                                        do {
                                            if (--n2 < 0) {
                                                return;
                                            }
                                            de.b(A, arrn, 0, 0, n3, n5 >> 14, n7 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                            n5 += n29;
                                            n7 += n31;
                                            n9 += n33;
                                            n3 += B;
                                            n34 += n36;
                                            n37 += n39;
                                            n40 += n42;
                                        } while (true);
                                    }
                                    de.b(A, arrn, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                    n5 += n29;
                                    n6 += n30;
                                    n9 += n33;
                                    n3 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            n2 -= n4;
                            n4 -= n3;
                            n3 = c[n3];
                            do {
                                if (--n4 < 0) {
                                    do {
                                        if (--n2 < 0) {
                                            return;
                                        }
                                        de.b(A, arrn, 0, 0, n3, n7 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                        n5 += n29;
                                        n7 += n31;
                                        n9 += n33;
                                        n3 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.b(A, arrn, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                n5 += n29;
                                n6 += n30;
                                n9 += n33;
                                n3 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n7 = n6 <<= 14;
                        if (n3 < 0) {
                            n7 -= n29 * n3;
                            n6 -= n30 * n3;
                            n9 -= n33 * n3;
                            n3 = 0;
                        }
                        n5 <<= 14;
                        if (n2 < 0) {
                            n5 -= n31 * n2;
                            n2 = 0;
                        }
                        int n46 = n3 - e;
                        n34 += n36 * n46;
                        n37 += n39 * n46;
                        n40 += n42 * n46;
                        if (n29 < n30) {
                            n4 -= n2;
                            n2 -= n3;
                            n3 = c[n3];
                            do {
                                if (--n2 < 0) {
                                    do {
                                        if (--n4 < 0) {
                                            return;
                                        }
                                        de.b(A, arrn, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                        n5 += n31;
                                        n6 += n30;
                                        n9 += n33;
                                        n3 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.b(A, arrn, 0, 0, n3, n7 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                n7 += n29;
                                n6 += n30;
                                n9 += n33;
                                n3 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n4 -= n2;
                        n2 -= n3;
                        n3 = c[n3];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n4 < 0) {
                                        return;
                                    }
                                    de.b(A, arrn, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                    n5 += n31;
                                    n6 += n30;
                                    n9 += n33;
                                    n3 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.b(A, arrn, 0, 0, n3, n6 >> 14, n7 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                            n7 += n29;
                            n6 += n30;
                            n9 += n33;
                            n3 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                } else if (n4 < b) {
                    if (n2 > b) {
                        n2 = b;
                    }
                    if (n3 > b) {
                        n3 = b;
                    }
                    n10 = (n10 << 9) - n32 * n7 + n32;
                    if (n2 < n3) {
                        n6 = n7 <<= 14;
                        if (n4 < 0) {
                            n6 -= n30 * n4;
                            n7 -= n31 * n4;
                            n10 -= n33 * n4;
                            n4 = 0;
                        }
                        n5 <<= 14;
                        if (n2 < 0) {
                            n5 -= n29 * n2;
                            n2 = 0;
                        }
                        int n47 = n4 - e;
                        n34 += n36 * n47;
                        n37 += n39 * n47;
                        n40 += n42 * n47;
                        if (n30 < n31) {
                            n3 -= n2;
                            n2 -= n4;
                            n4 = c[n4];
                            do {
                                if (--n2 < 0) {
                                    do {
                                        if (--n3 < 0) {
                                            return;
                                        }
                                        de.b(A, arrn, 0, 0, n4, n6 >> 14, n5 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                        n6 += n30;
                                        n5 += n29;
                                        n10 += n33;
                                        n4 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.b(A, arrn, 0, 0, n4, n6 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n30;
                                n7 += n31;
                                n10 += n33;
                                n4 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n3 -= n2;
                        n2 -= n4;
                        n4 = c[n4];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.b(A, arrn, 0, 0, n4, n5 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                    n6 += n30;
                                    n5 += n29;
                                    n10 += n33;
                                    n4 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.b(A, arrn, 0, 0, n4, n7 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                            n6 += n30;
                            n7 += n31;
                            n10 += n33;
                            n4 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                    n5 = n7 <<= 14;
                    if (n4 < 0) {
                        n5 -= n30 * n4;
                        n7 -= n31 * n4;
                        n10 -= n33 * n4;
                        n4 = 0;
                    }
                    n6 <<= 14;
                    if (n3 < 0) {
                        n6 -= n29 * n3;
                        n3 = 0;
                    }
                    int n48 = n4 - e;
                    n34 += n36 * n48;
                    n37 += n39 * n48;
                    n40 += n42 * n48;
                    if (n30 < n31) {
                        n2 -= n3;
                        n3 -= n4;
                        n4 = c[n4];
                        do {
                            if (--n3 < 0) {
                                do {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    de.b(A, arrn, 0, 0, n4, n6 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                    n6 += n29;
                                    n7 += n31;
                                    n10 += n33;
                                    n4 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.b(A, arrn, 0, 0, n4, n5 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                            n5 += n30;
                            n7 += n31;
                            n10 += n33;
                            n4 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                    n2 -= n3;
                    n3 -= n4;
                    n4 = c[n4];
                    do {
                        if (--n3 < 0) {
                            do {
                                if (--n2 < 0) {
                                    return;
                                }
                                de.b(A, arrn, 0, 0, n4, n7 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n29;
                                n7 += n31;
                                n10 += n33;
                                n4 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        de.b(A, arrn, 0, 0, n4, n7 >> 14, n5 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                        n5 += n30;
                        n7 += n31;
                        n10 += n33;
                        n4 += B;
                        n34 += n36;
                        n37 += n39;
                        n40 += n42;
                    } while (true);
                }
            }
        }
    }

    static final void b(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14) {
        if (k) {
            if (n6 > a) {
                n6 = a;
            }
            if (n5 < 0) {
                n5 = 0;
            }
        }
        if (n5 < n6) {
            n4 += n5;
            n7 += n8 * n5;
            int n15 = n6 - n5;
            if (l) {
                int n16;
                int n17;
                int n18;
                int n19;
                int n20 = n5 - d;
                n9 += n12 * n20;
                n10 += n13 * n20;
                int n21 = (n11 += n14 * n20) >> 12;
                if (n21 != 0) {
                    n18 = n9 / n21;
                    n17 = n10 / n21;
                } else {
                    n18 = 0;
                    n17 = 0;
                }
                n9 += n12 * n15;
                n10 += n13 * n15;
                n21 = (n11 += n14 * n15) >> 12;
                if (n21 != 0) {
                    n19 = n9 / n21;
                    n16 = n10 / n21;
                } else {
                    n19 = 0;
                    n16 = 0;
                }
                n2 = (n18 << 20) + n17;
                int n22 = ((n19 - n18) / n15 << 20) + (n16 - n17) / n15;
                n15 >>= 3;
                n8 <<= 3;
                int n23 = n7 >> 8;
                if (m) {
                    if (n15 > 0) {
                        do {
                            n3 = arrn2[(n2 & 4032) + (n2 >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 4032) + ((n2 += n22) >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n2 += n22;
                            n23 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            n3 = arrn2[(n2 & 4032) + (n2 >>> 26)];
                            arrn[n4++] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            n2 += n22;
                        } while (--n15 > 0);
                    }
                } else {
                    if (n15 > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n22) & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n22;
                            n23 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 4032) + (n2 >>> 26)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n23 & -16711936) + ((n3 & 65280) * n23 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n22;
                        } while (--n15 > 0);
                    }
                }
            } else {
                int n24;
                int n25;
                int n26;
                int n27;
                int n28 = n5 - d;
                n9 += n12 * n28;
                n10 += n13 * n28;
                int n29 = (n11 += n14 * n28) >> 14;
                if (n29 != 0) {
                    n27 = n9 / n29;
                    n26 = n10 / n29;
                } else {
                    n27 = 0;
                    n26 = 0;
                }
                n9 += n12 * n15;
                n10 += n13 * n15;
                n29 = (n11 += n14 * n15) >> 14;
                if (n29 != 0) {
                    n25 = n9 / n29;
                    n24 = n10 / n29;
                } else {
                    n25 = 0;
                    n24 = 0;
                }
                n2 = (n27 << 18) + n26;
                int n30 = ((n25 - n27) / n15 << 18) + (n24 - n26) / n15;
                n15 >>= 3;
                n8 <<= 3;
                int n31 = n7 >> 8;
                if (m) {
                    if (n15 > 0) {
                        do {
                            n3 = arrn2[(n2 & 16256) + (n2 >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n3 = arrn2[(n2 & 16256) + ((n2 += n30) >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n2 += n30;
                            n31 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            n3 = arrn2[(n2 & 16256) + (n2 >>> 25)];
                            arrn[n4++] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            n2 += n30;
                        } while (--n15 > 0);
                    }
                } else {
                    if (n15 > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            if ((n3 = arrn2[((n2 += n30) & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n30;
                            n31 = (n7 += n8) >> 8;
                        } while (--n15 > 0);
                    }
                    if ((n15 = n6 - n5 & 7) > 0) {
                        do {
                            if ((n3 = arrn2[(n2 & 16256) + (n2 >>> 25)]) != 0) {
                                arrn[n4] = ((n3 & 16711935) * n31 & -16711936) + ((n3 & 65280) * n31 & 16711680) >> 8;
                            }
                            ++n4;
                            n2 += n30;
                        } while (--n15 > 0);
                    }
                }
            }
        }
    }

    static final int b(int n2, int n3) {
        if ((n3 = n3 * (n2 & 127) >> 7) < 2) {
            n3 = 2;
        } else if (n3 > 126) {
            n3 = 126;
        }
        return (n2 & 65408) + n3;
    }

    public static final void c() {
        d = a / 2;
        e = b / 2;
        f = - d;
        g = a - d;
        h = - e;
        i = b - e;
    }

    static final void b(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, int n19, int n20) {
        int[] arrn = j.a(n20, -497416600);
        if (arrn == null) {
            int n21 = j.b(n20, -1015870875);
            de.a(n2, n3, n4, n5, n6, n7, de.b(n21, n8), de.b(n21, n9), de.b(n21, n10));
        } else {
            int n22;
            l = j.b(n20, 118);
            m = j.a(n20, -21);
            int n23 = n6 - n5;
            int n24 = n3 - n2;
            int n25 = n7 - n5;
            int n26 = n4 - n2;
            int n27 = n9 - n8;
            int n28 = n10 - n8;
            int n29 = 0;
            if (n3 != n2) {
                n29 = (n6 - n5 << 14) / (n3 - n2);
            }
            int n30 = 0;
            if (n4 != n3) {
                n30 = (n7 - n6 << 14) / (n4 - n3);
            }
            int n31 = 0;
            if (n4 != n2) {
                n31 = (n5 - n7 << 14) / (n2 - n4);
            }
            if ((n22 = n23 * n26 - n25 * n24) != 0) {
                int n32 = (n27 * n26 - n28 * n24 << 9) / n22;
                int n33 = (n28 * n23 - n27 * n25 << 9) / n22;
                n12 = n11 - n12;
                n15 = n14 - n15;
                n18 = n17 - n18;
                int n34 = (n13 -= n11) * n14 - (n16 -= n14) * n11 << 14;
                int n35 = (int)(((long)(n16 * n17 - (n19 -= n17) * n14) << 3 << 14) / (long)p);
                int n36 = (int)(((long)(n19 * n11 - n13 * n17) << 14) / (long)p);
                int n37 = n12 * n14 - n15 * n11 << 14;
                int n38 = (int)(((long)(n15 * n17 - n18 * n14) << 3 << 14) / (long)p);
                int n39 = (int)(((long)(n18 * n11 - n12 * n17) << 14) / (long)p);
                int n40 = n15 * n13 - n12 * n16 << 14;
                int n41 = (int)(((long)(n18 * n16 - n15 * n19) << 3 << 14) / (long)p);
                int n42 = (int)(((long)(n12 * n19 - n18 * n13) << 14) / (long)p);
                if (n2 <= n3 && n2 <= n4) {
                    if (n2 < b) {
                        if (n3 > b) {
                            n3 = b;
                        }
                        if (n4 > b) {
                            n4 = b;
                        }
                        n8 = (n8 << 9) - n32 * n5 + n32;
                        if (n3 < n4) {
                            n7 = n5 <<= 14;
                            if (n2 < 0) {
                                n7 -= n31 * n2;
                                n5 -= n29 * n2;
                                n8 -= n33 * n2;
                                n2 = 0;
                            }
                            n6 <<= 14;
                            if (n3 < 0) {
                                n6 -= n30 * n3;
                                n3 = 0;
                            }
                            int n43 = n2 - e;
                            n34 += n36 * n43;
                            n37 += n39 * n43;
                            n40 += n42 * n43;
                            if (n2 != n3 && n31 < n29 || n2 == n3 && n31 > n30) {
                                n4 -= n3;
                                n3 -= n2;
                                n2 = c[n2];
                                do {
                                    if (--n3 < 0) {
                                        do {
                                            if (--n4 < 0) {
                                                return;
                                            }
                                            de.a(A, arrn, 0, 0, n2, n7 >> 14, n6 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                            n7 += n31;
                                            n6 += n30;
                                            n8 += n33;
                                            n2 += B;
                                            n34 += n36;
                                            n37 += n39;
                                            n40 += n42;
                                        } while (true);
                                    }
                                    de.a(A, arrn, 0, 0, n2, n7 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                    n7 += n31;
                                    n5 += n29;
                                    n8 += n33;
                                    n2 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            n4 -= n3;
                            n3 -= n2;
                            n2 = c[n2];
                            do {
                                if (--n3 < 0) {
                                    do {
                                        if (--n4 < 0) {
                                            return;
                                        }
                                        de.a(A, arrn, 0, 0, n2, n6 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                        n7 += n31;
                                        n6 += n30;
                                        n8 += n33;
                                        n2 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.a(A, arrn, 0, 0, n2, n5 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                n7 += n31;
                                n5 += n29;
                                n8 += n33;
                                n2 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n6 = n5 <<= 14;
                        if (n2 < 0) {
                            n6 -= n31 * n2;
                            n5 -= n29 * n2;
                            n8 -= n33 * n2;
                            n2 = 0;
                        }
                        n7 <<= 14;
                        if (n4 < 0) {
                            n7 -= n30 * n4;
                            n4 = 0;
                        }
                        int n44 = n2 - e;
                        n34 += n36 * n44;
                        n37 += n39 * n44;
                        n40 += n42 * n44;
                        if (!(n2 != n4 && n31 < n29 || n2 == n4 && n30 > n29)) {
                            n3 -= n4;
                            n4 -= n2;
                            n2 = c[n2];
                            do {
                                if (--n4 < 0) {
                                    do {
                                        if (--n3 < 0) {
                                            return;
                                        }
                                        de.a(A, arrn, 0, 0, n2, n5 >> 14, n7 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                        n7 += n30;
                                        n5 += n29;
                                        n8 += n33;
                                        n2 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.a(A, arrn, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n31;
                                n5 += n29;
                                n8 += n33;
                                n2 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n3 -= n4;
                        n4 -= n2;
                        n2 = c[n2];
                        do {
                            if (--n4 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.a(A, arrn, 0, 0, n2, n7 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                                    n7 += n30;
                                    n5 += n29;
                                    n8 += n33;
                                    n2 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.a(A, arrn, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n32, n34, n37, n40, n35, n38, n41);
                            n6 += n31;
                            n5 += n29;
                            n8 += n33;
                            n2 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                } else if (n3 <= n4) {
                    if (n3 < b) {
                        if (n4 > b) {
                            n4 = b;
                        }
                        if (n2 > b) {
                            n2 = b;
                        }
                        n9 = (n9 << 9) - n32 * n6 + n32;
                        if (n4 < n2) {
                            n5 = n6 <<= 14;
                            if (n3 < 0) {
                                n5 -= n29 * n3;
                                n6 -= n30 * n3;
                                n9 -= n33 * n3;
                                n3 = 0;
                            }
                            n7 <<= 14;
                            if (n4 < 0) {
                                n7 -= n31 * n4;
                                n4 = 0;
                            }
                            int n45 = n3 - e;
                            n34 += n36 * n45;
                            n37 += n39 * n45;
                            n40 += n42 * n45;
                            if (n3 != n4 && n29 < n30 || n3 == n4 && n29 > n31) {
                                n2 -= n4;
                                n4 -= n3;
                                n3 = c[n3];
                                do {
                                    if (--n4 < 0) {
                                        do {
                                            if (--n2 < 0) {
                                                return;
                                            }
                                            de.a(A, arrn, 0, 0, n3, n5 >> 14, n7 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                            n5 += n29;
                                            n7 += n31;
                                            n9 += n33;
                                            n3 += B;
                                            n34 += n36;
                                            n37 += n39;
                                            n40 += n42;
                                        } while (true);
                                    }
                                    de.a(A, arrn, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                    n5 += n29;
                                    n6 += n30;
                                    n9 += n33;
                                    n3 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            n2 -= n4;
                            n4 -= n3;
                            n3 = c[n3];
                            do {
                                if (--n4 < 0) {
                                    do {
                                        if (--n2 < 0) {
                                            return;
                                        }
                                        de.a(A, arrn, 0, 0, n3, n7 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                        n5 += n29;
                                        n7 += n31;
                                        n9 += n33;
                                        n3 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.a(A, arrn, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                n5 += n29;
                                n6 += n30;
                                n9 += n33;
                                n3 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n7 = n6 <<= 14;
                        if (n3 < 0) {
                            n7 -= n29 * n3;
                            n6 -= n30 * n3;
                            n9 -= n33 * n3;
                            n3 = 0;
                        }
                        n5 <<= 14;
                        if (n2 < 0) {
                            n5 -= n31 * n2;
                            n2 = 0;
                        }
                        int n46 = n3 - e;
                        n34 += n36 * n46;
                        n37 += n39 * n46;
                        n40 += n42 * n46;
                        if (n29 < n30) {
                            n4 -= n2;
                            n2 -= n3;
                            n3 = c[n3];
                            do {
                                if (--n2 < 0) {
                                    do {
                                        if (--n4 < 0) {
                                            return;
                                        }
                                        de.a(A, arrn, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                        n5 += n31;
                                        n6 += n30;
                                        n9 += n33;
                                        n3 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.a(A, arrn, 0, 0, n3, n7 >> 14, n6 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                n7 += n29;
                                n6 += n30;
                                n9 += n33;
                                n3 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n4 -= n2;
                        n2 -= n3;
                        n3 = c[n3];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n4 < 0) {
                                        return;
                                    }
                                    de.a(A, arrn, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                                    n5 += n31;
                                    n6 += n30;
                                    n9 += n33;
                                    n3 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.a(A, arrn, 0, 0, n3, n6 >> 14, n7 >> 14, n9, n32, n34, n37, n40, n35, n38, n41);
                            n7 += n29;
                            n6 += n30;
                            n9 += n33;
                            n3 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                } else if (n4 < b) {
                    if (n2 > b) {
                        n2 = b;
                    }
                    if (n3 > b) {
                        n3 = b;
                    }
                    n10 = (n10 << 9) - n32 * n7 + n32;
                    if (n2 < n3) {
                        n6 = n7 <<= 14;
                        if (n4 < 0) {
                            n6 -= n30 * n4;
                            n7 -= n31 * n4;
                            n10 -= n33 * n4;
                            n4 = 0;
                        }
                        n5 <<= 14;
                        if (n2 < 0) {
                            n5 -= n29 * n2;
                            n2 = 0;
                        }
                        int n47 = n4 - e;
                        n34 += n36 * n47;
                        n37 += n39 * n47;
                        n40 += n42 * n47;
                        if (n30 < n31) {
                            n3 -= n2;
                            n2 -= n4;
                            n4 = c[n4];
                            do {
                                if (--n2 < 0) {
                                    do {
                                        if (--n3 < 0) {
                                            return;
                                        }
                                        de.a(A, arrn, 0, 0, n4, n6 >> 14, n5 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                        n6 += n30;
                                        n5 += n29;
                                        n10 += n33;
                                        n4 += B;
                                        n34 += n36;
                                        n37 += n39;
                                        n40 += n42;
                                    } while (true);
                                }
                                de.a(A, arrn, 0, 0, n4, n6 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n30;
                                n7 += n31;
                                n10 += n33;
                                n4 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        n3 -= n2;
                        n2 -= n4;
                        n4 = c[n4];
                        do {
                            if (--n2 < 0) {
                                do {
                                    if (--n3 < 0) {
                                        return;
                                    }
                                    de.a(A, arrn, 0, 0, n4, n5 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                    n6 += n30;
                                    n5 += n29;
                                    n10 += n33;
                                    n4 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.a(A, arrn, 0, 0, n4, n7 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                            n6 += n30;
                            n7 += n31;
                            n10 += n33;
                            n4 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                    n5 = n7 <<= 14;
                    if (n4 < 0) {
                        n5 -= n30 * n4;
                        n7 -= n31 * n4;
                        n10 -= n33 * n4;
                        n4 = 0;
                    }
                    n6 <<= 14;
                    if (n3 < 0) {
                        n6 -= n29 * n3;
                        n3 = 0;
                    }
                    int n48 = n4 - e;
                    n34 += n36 * n48;
                    n37 += n39 * n48;
                    n40 += n42 * n48;
                    if (n30 < n31) {
                        n2 -= n3;
                        n3 -= n4;
                        n4 = c[n4];
                        do {
                            if (--n3 < 0) {
                                do {
                                    if (--n2 < 0) {
                                        return;
                                    }
                                    de.a(A, arrn, 0, 0, n4, n6 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                    n6 += n29;
                                    n7 += n31;
                                    n10 += n33;
                                    n4 += B;
                                    n34 += n36;
                                    n37 += n39;
                                    n40 += n42;
                                } while (true);
                            }
                            de.a(A, arrn, 0, 0, n4, n5 >> 14, n7 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                            n5 += n30;
                            n7 += n31;
                            n10 += n33;
                            n4 += B;
                            n34 += n36;
                            n37 += n39;
                            n40 += n42;
                        } while (true);
                    }
                    n2 -= n3;
                    n3 -= n4;
                    n4 = c[n4];
                    do {
                        if (--n3 < 0) {
                            do {
                                if (--n2 < 0) {
                                    return;
                                }
                                de.a(A, arrn, 0, 0, n4, n7 >> 14, n6 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                                n6 += n29;
                                n7 += n31;
                                n10 += n33;
                                n4 += B;
                                n34 += n36;
                                n37 += n39;
                                n40 += n42;
                            } while (true);
                        }
                        de.a(A, arrn, 0, 0, n4, n7 >> 14, n5 >> 14, n10, n32, n34, n37, n40, n35, n38, n41);
                        n5 += n30;
                        n7 += n31;
                        n10 += n33;
                        n4 += B;
                        n34 += n36;
                        n37 += n39;
                        n40 += n42;
                    } while (true);
                }
            }
        }
    }

    static {
        int n2;
        c = new int[1024];
        k = false;
        l = false;
        m = false;
        n = true;
        o = 0;
        p = 512;
        q = new int[65536];
        r = new int[512];
        s = new int[2048];
        t = new int[2048];
        u = new int[2048];
        for (n2 = 1; n2 < 512; ++n2) {
            de.r[n2] = 32768 / n2;
        }
        for (n2 = 1; n2 < 2048; ++n2) {
            de.s[n2] = 65536 / n2;
        }
        for (n2 = 0; n2 < 2048; ++n2) {
            de.t[n2] = (int)(65536.0 * Math.sin((double)n2 * 0.0030679615));
            de.u[n2] = (int)(65536.0 * Math.cos((double)n2 * 0.0030679615));
        }
    }
}

