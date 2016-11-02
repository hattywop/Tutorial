/*
 * Decompiled with CFR 0_118.
 */
public class dd
extends z {
    protected static int w = 0;
    public static int x = 0;
    protected static int y = 0;
    public static int z = 0;
    public static int[] A;
    public static int B;
    public static int C;

    public static void a(int[] arrn) {
        w = arrn[0];
        x = arrn[1];
        y = arrn[2];
        z = arrn[3];
    }

    public static void a(int[] arrn, int n2, int n3) {
        A = arrn;
        B = n2;
        C = n3;
        dd.g(0, 0, n2, n3);
    }

    public static void f() {
        w = 0;
        x = 0;
        y = B;
        z = C;
    }

    public static void d(int n2, int n3, int n4, int n5) {
        if (w < n2) {
            w = n2;
        }
        if (x < n3) {
            x = n3;
        }
        if (y > n4) {
            y = n4;
        }
        if (z > n5) {
            z = n5;
        }
    }

    public static void b(int[] arrn) {
        arrn[0] = w;
        arrn[1] = x;
        arrn[2] = y;
        arrn[3] = z;
    }

    public static void g() {
        int n2 = 0;
        int n3 = B * C - 7;
        while (n2 < n3) {
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
            dd.A[n2++] = 0;
        }
        while (n2 < (n3 += 7)) {
            dd.A[n2++] = 0;
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6, int n7) {
        if (n2 < w) {
            n4 -= w - n2;
            n2 = w;
        }
        if (n3 < x) {
            n5 -= x - n3;
            n3 = x;
        }
        if (n2 + n4 > y) {
            n4 = y - n2;
        }
        if (n3 + n5 > z) {
            n5 = z - n3;
        }
        n6 = ((n6 & 16711935) * n7 >> 8 & 16711935) + ((n6 & 65280) * n7 >> 8 & 65280);
        int n8 = 256 - n7;
        int n9 = B - n4;
        int n10 = n2 + n3 * B;
        for (int i2 = 0; i2 < n5; ++i2) {
            for (int i3 = - n4; i3 < 0; ++i3) {
                int n11 = A[n10];
                n11 = ((n11 & 16711935) * n8 >> 8 & 16711935) + ((n11 & 65280) * n8 >> 8 & 65280);
                dd.A[n10++] = n6 + n11;
            }
            n10 += n9;
        }
    }

    public static void b(int n2, int n3, int n4, int n5, int n6) {
        if (n2 < w) {
            n4 -= w - n2;
            n2 = w;
        }
        if (n3 < x) {
            n5 -= x - n3;
            n3 = x;
        }
        if (n2 + n4 > y) {
            n4 = y - n2;
        }
        if (n3 + n5 > z) {
            n5 = z - n3;
        }
        int n7 = B - n4;
        int n8 = n2 + n3 * B;
        for (int i2 = - n5; i2 < 0; ++i2) {
            for (int i3 = - n4; i3 < 0; ++i3) {
                dd.A[n8++] = n6;
            }
            n8 += n7;
        }
    }

    public static void c(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = 0;
        int n9 = 65536 / n5;
        if (n2 < w) {
            n4 -= w - n2;
            n2 = w;
        }
        if (n3 < x) {
            n8 += (x - n3) * n9;
            n5 -= x - n3;
            n3 = x;
        }
        if (n2 + n4 > y) {
            n4 = y - n2;
        }
        if (n3 + n5 > z) {
            n5 = z - n3;
        }
        int n10 = B - n4;
        int n11 = n2 + n3 * B;
        for (int i2 = - n5; i2 < 0; ++i2) {
            int n12 = 65536 - n8 >> 8;
            int n13 = n8 >> 8;
            int n14 = ((n6 & 16711935) * n12 + (n7 & 16711935) * n13 & -16711936) + ((n6 & 65280) * n12 + (n7 & 65280) * n13 & 16711680) >>> 8;
            for (int i3 = - n4; i3 < 0; ++i3) {
                dd.A[n11++] = n14;
            }
            n11 += n10;
            n8 += n9;
        }
    }

    public static void c(int n2, int n3, int n4, int n5, int n6) {
        dd.f(n2, n3, n4, n6);
        dd.f(n2, n3 + n5 - 1, n4, n6);
        dd.e(n2, n3, n5, n6);
        dd.e(n2 + n4 - 1, n3, n5, n6);
    }

    public static void d(int n2, int n3, int n4, int n5, int n6, int n7) {
        dd.d(n2, n3, n4, n6, n7);
        dd.d(n2, n3 + n5 - 1, n4, n6, n7);
        if (n5 >= 3) {
            dd.e(n2, n3 + 1, n5 - 2, n6, n7);
            dd.e(n2 + n4 - 1, n3 + 1, n5 - 2, n6, n7);
        }
    }

    static void d(int n2, int n3, int n4, int n5, int n6) {
        if (n3 >= x && n3 < z) {
            if (n2 < w) {
                n4 -= w - n2;
                n2 = w;
            }
            if (n2 + n4 > y) {
                n4 = y - n2;
            }
            int n7 = 256 - n6;
            int n8 = (n5 >> 16 & 255) * n6;
            int n9 = (n5 >> 8 & 255) * n6;
            int n10 = (n5 & 255) * n6;
            int n11 = n2 + n3 * B;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n12 = (A[n11] >> 16 & 255) * n7;
                int n13 = (A[n11] >> 8 & 255) * n7;
                int n14 = (A[n11] & 255) * n7;
                int n15 = (n8 + n12 >> 8 << 16) + (n9 + n13 >> 8 << 8) + (n10 + n14 >> 8);
                dd.A[n11++] = n15;
            }
        }
    }

    static void e(int n2, int n3, int n4, int n5, int n6) {
        if (n2 >= w && n2 < y) {
            if (n3 < x) {
                n4 -= x - n3;
                n3 = x;
            }
            if (n3 + n4 > z) {
                n4 = z - n3;
            }
            int n7 = 256 - n6;
            int n8 = (n5 >> 16 & 255) * n6;
            int n9 = (n5 >> 8 & 255) * n6;
            int n10 = (n5 & 255) * n6;
            int n11 = n2 + n3 * B;
            for (int i2 = 0; i2 < n4; ++i2) {
                int n12;
                int n13 = (A[n11] >> 16 & 255) * n7;
                int n14 = (A[n11] >> 8 & 255) * n7;
                int n15 = (A[n11] & 255) * n7;
                dd.A[n11] = n12 = (n8 + n13 >> 8 << 16) + (n9 + n14 >> 8 << 8) + (n10 + n15 >> 8);
                n11 += B;
            }
        }
    }

    public static void f(int n2, int n3, int n4, int n5, int n6) {
        n4 -= n2;
        if ((n5 -= n3) == 0) {
            if (n4 >= 0) {
                dd.f(n2, n3, n4 + 1, n6);
            } else {
                dd.f(n2 + n4, n3, - n4 + 1, n6);
            }
        } else if (n4 == 0) {
            if (n5 >= 0) {
                dd.e(n2, n3, n5 + 1, n6);
            } else {
                dd.e(n2, n3 + n5, - n5 + 1, n6);
            }
        } else {
            if (n4 + n5 < 0) {
                n2 += n4;
                n4 = - n4;
                n3 += n5;
                n5 = - n5;
            }
            if (n4 > n5) {
                n3 <<= 16;
                n3 += 32768;
                int n7 = (int)Math.floor((double)(n5 <<= 16) / (double)n4 + 0.5);
                n4 += n2;
                if (n2 < w) {
                    n3 += n7 * (w - n2);
                    n2 = w;
                }
                if (n4 >= y) {
                    n4 = y - 1;
                }
                while (n2 <= n4) {
                    int n8 = n3 >> 16;
                    if (n8 >= x && n8 < z) {
                        dd.A[n2 + n8 * dd.B] = n6;
                    }
                    n3 += n7;
                    ++n2;
                }
            } else {
                n2 <<= 16;
                n2 += 32768;
                int n9 = (int)Math.floor((double)(n4 <<= 16) / (double)n5 + 0.5);
                n5 += n3;
                if (n3 < x) {
                    n2 += n9 * (x - n3);
                    n3 = x;
                }
                if (n5 >= z) {
                    n5 = z - 1;
                }
                while (n3 <= n5) {
                    int n10 = n2 >> 16;
                    if (n10 >= w && n10 < y) {
                        dd.A[n10 + n3 * dd.B] = n6;
                    }
                    n2 += n9;
                    ++n3;
                }
            }
        }
    }

    public static void a(int n2, int n3, int n4, int[] arrn, int[] arrn2) {
        int n5 = n2 + n3 * B;
        for (n3 = 0; n3 < arrn.length; ++n3) {
            int n6 = n5 + arrn[n3];
            for (n2 = - arrn2[n3]; n2 < 0; ++n2) {
                dd.A[n6++] = n4;
            }
            n5 += B;
        }
    }

    public static void e(int n2, int n3, int n4, int n5) {
        if (n2 >= w && n2 < y) {
            if (n3 < x) {
                n4 -= x - n3;
                n3 = x;
            }
            if (n3 + n4 > z) {
                n4 = z - n3;
            }
            int n6 = n2 + n3 * B;
            for (int i2 = 0; i2 < n4; ++i2) {
                dd.A[n6 + i2 * dd.B] = n5;
            }
        }
    }

    public static void f(int n2, int n3, int n4, int n5) {
        if (n3 >= x && n3 < z) {
            if (n2 < w) {
                n4 -= w - n2;
                n2 = w;
            }
            if (n2 + n4 > y) {
                n4 = y - n2;
            }
            int n6 = n2 + n3 * B;
            for (int i2 = 0; i2 < n4; ++i2) {
                dd.A[n6 + i2] = n5;
            }
        }
    }

    public static void g(int n2, int n3, int n4, int n5) {
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        if (n4 > B) {
            n4 = B;
        }
        if (n5 > C) {
            n5 = C;
        }
        w = n2;
        x = n3;
        y = n4;
        z = n5;
    }
}

