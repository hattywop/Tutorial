/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;
import java.awt.image.PixelGrabber;

public final class cX
extends dd {
    public int[] a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public cX(int n2, int n3) {
        this.a = new int[n2 * n3];
        this.c = this.b = n2;
        this.e = this.d = n3;
        this.f = 0;
        this.g = 0;
    }

    public cX(byte[] arrby, Component component) {
        try {
            Image image = Toolkit.getDefaultToolkit().createImage(arrby);
            MediaTracker mediaTracker = new MediaTracker(component);
            mediaTracker.addImage(image, 0);
            mediaTracker.waitForAll();
            this.c = image.getWidth(component);
            this.e = image.getHeight(component);
            this.b = this.c;
            this.d = this.e;
            this.g = 0;
            this.f = 0;
            this.a = new int[this.c * this.e];
            PixelGrabber pixelGrabber = new PixelGrabber(image, 0, 0, this.c, this.e, this.a, 0, this.c);
            pixelGrabber.grabPixels();
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if ((this.a[i2] & 16777215) != 16711935) continue;
                this.a[i2] = 0;
            }
        }
        catch (InterruptedException var3_4) {
            // empty catch block
        }
    }

    public void a(int n2, int n3, int n4, int n5) {
        if (n4 > 0 && n5 > 0) {
            int n6;
            int n7;
            int n8 = this.c;
            int n9 = this.e;
            int n10 = 0;
            int n11 = 0;
            int n12 = this.b;
            int n13 = this.d;
            int n14 = (n12 << 16) / n4;
            int n15 = (n13 << 16) / n5;
            if (this.g > 0) {
                n7 = ((this.g << 16) + n14 - 1) / n14;
                n2 += n7;
                n10 += n7 * n14 - (this.g << 16);
            }
            if (this.f > 0) {
                n7 = ((this.f << 16) + n15 - 1) / n15;
                n3 += n7;
                n11 += n7 * n15 - (this.f << 16);
            }
            if (n8 < n12) {
                n4 = ((n8 << 16) - n10 + n14 - 1) / n14;
            }
            if (n9 < n13) {
                n5 = ((n9 << 16) - n11 + n15 - 1) / n15;
            }
            n7 = n2 + n3 * B;
            int n16 = B - n4;
            if (n3 + n5 > z) {
                n5 -= n3 + n5 - z;
            }
            if (n3 < x) {
                n6 = x - n3;
                n5 -= n6;
                n7 += n6 * B;
                n11 += n15 * n6;
            }
            if (n2 + n4 > y) {
                n6 = n2 + n4 - y;
                n4 -= n6;
                n16 += n6;
            }
            if (n2 < w) {
                n6 = w - n2;
                n4 -= n6;
                n7 += n6;
                n10 += n14 * n6;
                n16 += n6;
            }
            cX.a(A, this.a, 0, n10, n11, n7, n16, n4, n5, n14, n15, n8);
        }
    }

    public void b(int n2, int n3, int n4, int n5) {
        this.a(this.b << 3, this.d << 3, n2 << 4, n3 << 4, n4, n5);
    }

    public void a() {
        if (this.c != this.b || this.e != this.d) {
            int[] arrn = new int[this.b * this.d];
            for (int i2 = 0; i2 < this.e; ++i2) {
                for (int i3 = 0; i3 < this.c; ++i3) {
                    arrn[(i2 + this.f) * this.b + i3 + this.g] = this.a[i2 * this.c + i3];
                }
            }
            this.a = arrn;
            this.c = this.b;
            this.e = this.d;
            this.g = 0;
            this.f = 0;
        }
    }

    public void c() {
        int[] arrn = new int[this.c * this.e];
        int n2 = 0;
        for (int i2 = this.e - 1; i2 >= 0; --i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                arrn[n2++] = this.a[i3 + i2 * this.c];
            }
        }
        this.a = arrn;
        this.f = this.d - this.e - this.f;
    }

    public void a(int n2) {
        for (int i2 = this.e - 1; i2 > 0; --i2) {
            int n3 = i2 * this.c;
            for (int i3 = this.c - 1; i3 > 0; --i3) {
                if (this.a[i3 + n3] != 0 || this.a[i3 + n3 - 1 - this.c] == 0) continue;
                this.a[i3 + n3] = n2;
            }
        }
    }

    public void a(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.g) + (n3 += this.f) * B;
        int n6 = 0;
        int n7 = this.e;
        int n8 = this.c;
        int n9 = B - n8;
        int n10 = 0;
        if (n3 < x) {
            n4 = x - n3;
            n7 -= n4;
            n3 = x;
            n6 += n4 * n8;
            n5 += n4 * B;
        }
        if (n3 + n7 > z) {
            n7 -= n3 + n7 - z;
        }
        if (n2 < w) {
            n4 = w - n2;
            n8 -= n4;
            n2 = w;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > y) {
            n4 = n2 + n8 - y;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            cX.a(A, this.a, n6, n5, n8, n7, n9, n10);
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7) {
        for (int i2 = - n5; i2 < 0; ++i2) {
            int n8 = n3 + n4 - 3;
            while (n3 < n8) {
                arrn[n3++] = arrn2[n2++];
                arrn[n3++] = arrn2[n2++];
                arrn[n3++] = arrn2[n2++];
                arrn[n3++] = arrn2[n2++];
            }
            while (n3 < (n8 += 3)) {
                arrn[n3++] = arrn2[n2++];
            }
            n3 += n6;
            n2 += n7;
        }
    }

    public void b(int n2, int n3) {
        int n4;
        int n5 = (n2 += this.g) + (n3 += this.f) * B;
        int n6 = 0;
        int n7 = this.e;
        int n8 = this.c;
        int n9 = B - n8;
        int n10 = 0;
        if (n3 < x) {
            n4 = x - n3;
            n7 -= n4;
            n3 = x;
            n6 += n4 * n8;
            n5 += n4 * B;
        }
        if (n3 + n7 > z) {
            n7 -= n3 + n7 - z;
        }
        if (n2 < w) {
            n4 = w - n2;
            n8 -= n4;
            n2 = w;
            n6 += n4;
            n5 += n4;
            n10 += n4;
            n9 += n4;
        }
        if (n2 + n8 > y) {
            n4 = n2 + n8 - y;
            n8 -= n4;
            n10 += n4;
            n9 += n4;
        }
        if (n8 > 0 && n7 > 0) {
            cX.a(A, this.a, 0, n6, n5, n8, n7, n9, n10);
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9 = - (n5 >> 2);
        n5 = - (n5 & 3);
        for (int i2 = - n6; i2 < 0; ++i2) {
            int n10;
            for (n10 = n9; n10 < 0; ++n10) {
                if ((n2 = arrn2[n3++]) != 0) {
                    arrn[n4++] = n2;
                } else {
                    ++n4;
                }
                n2 = arrn2[n3++];
                if (n2 != 0) {
                    arrn[n4++] = n2;
                } else {
                    ++n4;
                }
                n2 = arrn2[n3++];
                if (n2 != 0) {
                    arrn[n4++] = n2;
                } else {
                    ++n4;
                }
                n2 = arrn2[n3++];
                if (n2 != 0) {
                    arrn[n4++] = n2;
                    continue;
                }
                ++n4;
            }
            for (n10 = n5; n10 < 0; ++n10) {
                if ((n2 = arrn2[n3++]) != 0) {
                    arrn[n4++] = n2;
                    continue;
                }
                ++n4;
            }
            n4 += n7;
            n3 += n8;
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12) {
        int n13 = 256 - n12;
        int n14 = n3;
        for (int i2 = - n8; i2 < 0; ++i2) {
            int n15 = (n4 >> 16) * n11;
            for (int i3 = - n7; i3 < 0; ++i3) {
                n2 = arrn2[(n3 >> 16) + n15];
                if (n2 != 0) {
                    int n16 = arrn[n5];
                    arrn[n5++] = ((n2 & 16711935) * n12 + (n16 & 16711935) * n13 & -16711936) + ((n2 & 65280) * n12 + (n16 & 65280) * n13 & 16711680) >> 8;
                } else {
                    ++n5;
                }
                n3 += n9;
            }
            n4 += n10;
            n3 = n14;
            n5 += n6;
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        int n12 = n3;
        for (int i2 = - n8; i2 < 0; ++i2) {
            int n13 = (n4 >> 16) * n11;
            for (int i3 = - n7; i3 < 0; ++i3) {
                n2 = arrn2[(n3 >> 16) + n13];
                if (n2 != 0) {
                    arrn[n5++] = n2;
                } else {
                    ++n5;
                }
                n3 += n9;
            }
            n4 += n10;
            n3 = n12;
            n5 += n6;
        }
    }

    public void c(int n2, int n3, int n4, int n5) {
        if (n4 == 256) {
            this.b(n2, n3);
        } else {
            int n6;
            int n7 = (n2 += this.g) + (n3 += this.f) * B;
            int n8 = 0;
            int n9 = this.e;
            int n10 = this.c;
            int n11 = B - n10;
            int n12 = 0;
            if (n3 < x) {
                n6 = x - n3;
                n9 -= n6;
                n3 = x;
                n8 += n6 * n10;
                n7 += n6 * B;
            }
            if (n3 + n9 > z) {
                n9 -= n3 + n9 - z;
            }
            if (n2 < w) {
                n6 = w - n2;
                n10 -= n6;
                n2 = w;
                n8 += n6;
                n7 += n6;
                n12 += n6;
                n11 += n6;
            }
            if (n2 + n10 > y) {
                n6 = n2 + n10 - y;
                n10 -= n6;
                n12 += n6;
                n11 += n6;
            }
            if (n10 > 0 && n9 > 0) {
                cX.a(A, this.a, 0, n8, n7, n10, n9, n11, n12, n4, n5);
            }
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10) {
        int n11 = 256 - n9;
        int n12 = (n10 & 16711935) * n11 & -16711936;
        int n13 = (n10 & 65280) * n11 & 16711680;
        n10 = (n12 | n13) >>> 8;
        for (int i2 = - n6; i2 < 0; ++i2) {
            for (int i3 = - n5; i3 < 0; ++i3) {
                if ((n2 = arrn2[n3++]) != 0) {
                    n12 = (n2 & 16711935) * n9 & -16711936;
                    n13 = (n2 & 65280) * n9 & 16711680;
                    arrn[n4++] = ((n12 | n13) >>> 8) + n10;
                    continue;
                }
                ++n4;
            }
            n4 += n7;
            n3 += n8;
        }
    }

    public void a(int n2, int n3, int n4) {
        int n5;
        int n6 = (n2 += this.g) + (n3 += this.f) * B;
        int n7 = 0;
        int n8 = this.e;
        int n9 = this.c;
        int n10 = B - n9;
        int n11 = 0;
        if (n3 < x) {
            n5 = x - n3;
            n8 -= n5;
            n3 = x;
            n7 += n5 * n9;
            n6 += n5 * B;
        }
        if (n3 + n8 > z) {
            n8 -= n3 + n8 - z;
        }
        if (n2 < w) {
            n5 = w - n2;
            n9 -= n5;
            n2 = w;
            n7 += n5;
            n6 += n5;
            n11 += n5;
            n10 += n5;
        }
        if (n2 + n9 > y) {
            n5 = n2 + n9 - y;
            n9 -= n5;
            n11 += n5;
            n10 += n5;
        }
        if (n9 > 0 && n8 > 0) {
            cX.a(A, this.a, 0, n7, n6, n9, n8, n10, n11, n4);
        }
    }

    static void a(int[] arrn, int[] arrn2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        int n10 = 256 - n9;
        for (int i2 = - n6; i2 < 0; ++i2) {
            for (int i3 = - n5; i3 < 0; ++i3) {
                if ((n2 = arrn2[n3++]) != 0) {
                    int n11 = arrn[n4];
                    arrn[n4++] = ((n2 & 16711935) * n9 + (n11 & 16711935) * n10 & -16711936) + ((n2 & 65280) * n9 + (n11 & 65280) * n10 & 16711680) >> 8;
                    continue;
                }
                ++n4;
            }
            n4 += n7;
            n3 += n8;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int[] arrn, int[] arrn2) {
        int n8 = n3 < 0 ? - n3 : 0;
        int n9 = n3 + this.e <= n7 ? this.e : n7 - n3;
        int n10 = n2 < 0 ? - n2 : 0;
        int n11 = n2 + this.c <= n6 ? this.c : n6 - n2;
        int n12 = n4 + n2 + n10 + (n5 + n3 + n8) * B;
        int n13 = n3 + n8;
        for (int i2 = n8; i2 < n9; ++i2) {
            int n14;
            int n15 = arrn[n13];
            int n16 = arrn2[n13++];
            int n17 = n12;
            if (n2 < n15) {
                n14 = n15 - n2;
                n17 = n12 + (n14 - n10);
            } else {
                n14 = n10;
            }
            int n18 = n2 + this.c <= n15 + n16 ? this.c : n15 + n16 - n2;
            for (int i3 = n14; i3 < n18; ++i3) {
                int n19 = this.a[i3 + i2 * this.c];
                if (n19 != 0) {
                    cX.A[n17++] = n19;
                    continue;
                }
                ++n17;
            }
            n12 += B;
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int[] arrn, int[] arrn2) {
        try {
            int n10 = (- n4) / 2;
            int n11 = (- n5) / 2;
            int n12 = (int)(Math.sin((double)n8 / 326.11) * 65536.0);
            int n13 = (int)(Math.cos((double)n8 / 326.11) * 65536.0);
            n12 = n12 * n9 >> 8;
            n13 = n13 * n9 >> 8;
            int n14 = (n6 << 16) + n11 * n12 + n10 * n13;
            int n15 = (n7 << 16) + (n11 * n13 - n10 * n12);
            int n16 = n2 + n3 * B;
            for (n3 = 0; n3 < n5; ++n3) {
                int n17 = arrn[n3];
                int n18 = n16 + n17;
                int n19 = n14 + n13 * n17;
                int n20 = n15 - n12 * n17;
                for (n2 = - arrn2[n3]; n2 < 0; ++n2) {
                    cX.A[n18++] = this.a[(n19 >> 16) + (n20 >> 16) * this.c];
                    n19 += n13;
                    n20 -= n12;
                }
                n14 += n12;
                n15 += n13;
                n16 += B;
            }
        }
        catch (Exception var11_12) {
            // empty catch block
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, int n7, double d2, int n8) {
        try {
            int n9 = (- n4) / 2;
            int n10 = (- n5) / 2;
            int n11 = (int)(Math.sin(d2) * 65536.0);
            int n12 = (int)(Math.cos(d2) * 65536.0);
            n11 = n11 * n8 >> 8;
            n12 = n12 * n8 >> 8;
            int n13 = (n6 << 16) + n10 * n11 + n9 * n12;
            int n14 = (n7 << 16) + (n10 * n12 - n9 * n11);
            int n15 = n2 + n3 * B;
            for (n3 = 0; n3 < n5; ++n3) {
                int n16 = n15;
                int n17 = n13;
                int n18 = n14;
                for (n2 = - n4; n2 < 0; ++n2) {
                    int n19 = this.a[(n17 >> 16) + (n18 >> 16) * this.c];
                    if (n19 != 0) {
                        cX.A[n16++] = n19;
                    } else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += B;
            }
        }
        catch (Exception var10_10) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        if (n7 == 0) return;
        double d2 = (double)(n6 & 65535) * 9.587379924285257E-5;
        int n12 = (int)Math.floor(Math.sin(d2) * (double)n7 + 0.5);
        int n13 = (int)Math.floor(Math.cos(d2) * (double)n7 + 0.5);
        int n14 = (- (n2 -= this.g << 4)) * n13 + (- (n3 -= this.f << 4)) * n12;
        int n15 = (- - n2) * n12 + (- n3) * n13;
        int n16 = ((this.c << 4) - n2) * n13 + (- n3) * n12;
        int n17 = (- (this.c << 4) - n2) * n12 + (- n3) * n13;
        int n18 = (- n2) * n13 + ((this.e << 4) - n3) * n12;
        int n19 = (- - n2) * n12 + ((this.e << 4) - n3) * n13;
        int n20 = ((this.c << 4) - n2) * n13 + ((this.e << 4) - n3) * n12;
        int n21 = (- (this.c << 4) - n2) * n12 + ((this.e << 4) - n3) * n13;
        if (n14 < n16) {
            n11 = n14;
            n9 = n16;
        } else {
            n11 = n16;
            n9 = n14;
        }
        if (n18 < n11) {
            n11 = n18;
        }
        if (n20 < n11) {
            n11 = n20;
        }
        if (n18 > n9) {
            n9 = n18;
        }
        if (n20 > n9) {
            n9 = n20;
        }
        if (n15 < n17) {
            n8 = n15;
            n10 = n17;
        } else {
            n8 = n17;
            n10 = n15;
        }
        if (n19 < n8) {
            n8 = n19;
        }
        if (n21 < n8) {
            n8 = n21;
        }
        if (n19 > n10) {
            n10 = n19;
        }
        if (n21 > n10) {
            n10 = n21;
        }
        n11 >>= 12;
        n9 = n9 + 4095 >> 12;
        n8 >>= 12;
        n10 = n10 + 4095 >> 12;
        n11 += n4;
        n9 += n4;
        n8 += n5;
        n10 += n5;
        n9 = n9 + 15 >> 4;
        n8 >>= 4;
        n10 = n10 + 15 >> 4;
        if ((n11 >>= 4) < w) {
            n11 = w;
        }
        if (n9 > y) {
            n9 = y;
        }
        if (n8 < x) {
            n8 = x;
        }
        if (n10 > z) {
            n10 = z;
        }
        if ((n9 = n11 - n9) >= 0 || (n10 = n8 - n10) >= 0) return;
        int n22 = n8 * B + n11;
        double d3 = 1.6777216E7 / (double)n7;
        int n23 = (int)Math.floor(Math.sin(d2) * d3 + 0.5);
        int n24 = (int)Math.floor(Math.cos(d2) * d3 + 0.5);
        int n25 = (n11 << 4) + 8 - n4;
        int n26 = (n8 << 4) + 8 - n5;
        int n27 = (n2 << 8) - (n26 * n23 >> 4);
        int n28 = (n3 << 8) + (n26 * n24 >> 4);
        if (n24 == 0) {
            if (n23 == 0) {
                int n29 = n10;
                while (n29 < 0) {
                    int n30 = n22;
                    int n31 = n27;
                    int n32 = n28;
                    if (n27 >= 0 && n28 >= 0 && n27 - (this.c << 12) < 0 && n28 - (this.e << 12) < 0) {
                        for (int i2 = n9; i2 < 0; ++i2) {
                            int n33 = this.a[(n32 >> 12) * this.c + (n31 >> 12)];
                            if (n33 != 0) {
                                cX.A[n30++] = n33;
                                continue;
                            }
                            ++n30;
                        }
                    }
                    ++n29;
                    n22 += B;
                }
                return;
            } else if (n23 < 0) {
                int n34 = n10;
                while (n34 < 0) {
                    int n35 = n22;
                    int n36 = n27;
                    int n37 = n28 + (n25 * n23 >> 4);
                    int n38 = n9;
                    if (n27 >= 0 && n27 - (this.c << 12) < 0) {
                        int n39 = n37 - (this.e << 12);
                        if (n39 >= 0) {
                            n39 = (n23 - n39) / n23;
                            n38 = n9 + n39;
                            n37 += n23 * n39;
                            n35 = n22 + n39;
                        }
                        if ((n39 = (n37 - n23) / n23) > n38) {
                            n38 = n39;
                        }
                        while (n38 < 0) {
                            int n40 = this.a[(n37 >> 12) * this.c + (n36 >> 12)];
                            if (n40 != 0) {
                                cX.A[n35++] = n40;
                            } else {
                                ++n35;
                            }
                            n37 += n23;
                            ++n38;
                        }
                    }
                    ++n34;
                    n27 -= n23;
                    n22 += B;
                }
                return;
            } else {
                int n41 = n10;
                while (n41 < 0) {
                    int n42 = n22;
                    int n43 = n27;
                    int n44 = n28 + (n25 * n23 >> 4);
                    int n45 = n9;
                    if (n27 >= 0 && n27 - (this.c << 12) < 0) {
                        int n46;
                        if (n44 < 0) {
                            n46 = (n23 - 1 - n44) / n23;
                            n45 = n9 + n46;
                            n44 += n23 * n46;
                            n42 = n22 + n46;
                        }
                        if ((n46 = (1 + n44 - (this.e << 12) - n23) / n23) > n45) {
                            n45 = n46;
                        }
                        while (n45 < 0) {
                            int n47 = this.a[(n44 >> 12) * this.c + (n43 >> 12)];
                            if (n47 != 0) {
                                cX.A[n42++] = n47;
                            } else {
                                ++n42;
                            }
                            n44 += n23;
                            ++n45;
                        }
                    }
                    ++n41;
                    n27 -= n23;
                    n22 += B;
                }
            }
            return;
        } else if (n24 < 0) {
            if (n23 == 0) {
                int n48 = n10;
                while (n48 < 0) {
                    int n49 = n22;
                    int n50 = n27 + (n25 * n24 >> 4);
                    int n51 = n28;
                    int n52 = n9;
                    if (n28 >= 0 && n28 - (this.e << 12) < 0) {
                        int n53 = n50 - (this.c << 12);
                        if (n53 >= 0) {
                            n53 = (n24 - n53) / n24;
                            n52 = n9 + n53;
                            n50 += n24 * n53;
                            n49 = n22 + n53;
                        }
                        if ((n53 = (n50 - n24) / n24) > n52) {
                            n52 = n53;
                        }
                        while (n52 < 0) {
                            int n54 = this.a[(n51 >> 12) * this.c + (n50 >> 12)];
                            if (n54 != 0) {
                                cX.A[n49++] = n54;
                            } else {
                                ++n49;
                            }
                            n50 += n24;
                            ++n52;
                        }
                    }
                    ++n48;
                    n28 += n24;
                    n22 += B;
                }
                return;
            } else if (n23 < 0) {
                int n55 = n10;
                while (n55 < 0) {
                    int n56 = n22;
                    int n57 = n27 + (n25 * n24 >> 4);
                    int n58 = n28 + (n25 * n23 >> 4);
                    int n59 = n9;
                    int n60 = n57 - (this.c << 12);
                    if (n60 >= 0) {
                        n60 = (n24 - n60) / n24;
                        n59 = n9 + n60;
                        n57 += n24 * n60;
                        n58 += n23 * n60;
                        n56 = n22 + n60;
                    }
                    if ((n60 = (n57 - n24) / n24) > n59) {
                        n59 = n60;
                    }
                    if ((n60 = n58 - (this.e << 12)) >= 0) {
                        n60 = (n23 - n60) / n23;
                        n59 += n60;
                        n57 += n24 * n60;
                        n58 += n23 * n60;
                        n56 += n60;
                    }
                    if ((n60 = (n58 - n23) / n23) > n59) {
                        n59 = n60;
                    }
                    while (n59 < 0) {
                        int n61 = this.a[(n58 >> 12) * this.c + (n57 >> 12)];
                        if (n61 != 0) {
                            cX.A[n56++] = n61;
                        } else {
                            ++n56;
                        }
                        n57 += n24;
                        n58 += n23;
                        ++n59;
                    }
                    ++n55;
                    n27 -= n23;
                    n28 += n24;
                    n22 += B;
                }
                return;
            } else {
                int n62 = n10;
                while (n62 < 0) {
                    int n63 = n22;
                    int n64 = n27 + (n25 * n24 >> 4);
                    int n65 = n28 + (n25 * n23 >> 4);
                    int n66 = n9;
                    int n67 = n64 - (this.c << 12);
                    if (n67 >= 0) {
                        n67 = (n24 - n67) / n24;
                        n66 = n9 + n67;
                        n64 += n24 * n67;
                        n65 += n23 * n67;
                        n63 = n22 + n67;
                    }
                    if ((n67 = (n64 - n24) / n24) > n66) {
                        n66 = n67;
                    }
                    if (n65 < 0) {
                        n67 = (n23 - 1 - n65) / n23;
                        n66 += n67;
                        n64 += n24 * n67;
                        n65 += n23 * n67;
                        n63 += n67;
                    }
                    if ((n67 = (1 + n65 - (this.e << 12) - n23) / n23) > n66) {
                        n66 = n67;
                    }
                    while (n66 < 0) {
                        int n68 = this.a[(n65 >> 12) * this.c + (n64 >> 12)];
                        if (n68 != 0) {
                            cX.A[n63++] = n68;
                        } else {
                            ++n63;
                        }
                        n64 += n24;
                        n65 += n23;
                        ++n66;
                    }
                    ++n62;
                    n27 -= n23;
                    n28 += n24;
                    n22 += B;
                }
            }
            return;
        } else if (n23 == 0) {
            int n69 = n10;
            while (n69 < 0) {
                int n70 = n22;
                int n71 = n27 + (n25 * n24 >> 4);
                int n72 = n28;
                int n73 = n9;
                if (n28 >= 0 && n28 - (this.e << 12) < 0) {
                    int n74;
                    if (n71 < 0) {
                        n74 = (n24 - 1 - n71) / n24;
                        n73 = n9 + n74;
                        n71 += n24 * n74;
                        n70 = n22 + n74;
                    }
                    if ((n74 = (1 + n71 - (this.c << 12) - n24) / n24) > n73) {
                        n73 = n74;
                    }
                    while (n73 < 0) {
                        int n75 = this.a[(n72 >> 12) * this.c + (n71 >> 12)];
                        if (n75 != 0) {
                            cX.A[n70++] = n75;
                        } else {
                            ++n70;
                        }
                        n71 += n24;
                        ++n73;
                    }
                }
                ++n69;
                n28 += n24;
                n22 += B;
            }
            return;
        } else if (n23 < 0) {
            int n76 = n10;
            while (n76 < 0) {
                int n77;
                int n78 = n22;
                int n79 = n27 + (n25 * n24 >> 4);
                int n80 = n28 + (n25 * n23 >> 4);
                int n81 = n9;
                if (n79 < 0) {
                    n77 = (n24 - 1 - n79) / n24;
                    n81 = n9 + n77;
                    n79 += n24 * n77;
                    n80 += n23 * n77;
                    n78 = n22 + n77;
                }
                if ((n77 = (1 + n79 - (this.c << 12) - n24) / n24) > n81) {
                    n81 = n77;
                }
                if ((n77 = n80 - (this.e << 12)) >= 0) {
                    n77 = (n23 - n77) / n23;
                    n81 += n77;
                    n79 += n24 * n77;
                    n80 += n23 * n77;
                    n78 += n77;
                }
                if ((n77 = (n80 - n23) / n23) > n81) {
                    n81 = n77;
                }
                while (n81 < 0) {
                    int n82 = this.a[(n80 >> 12) * this.c + (n79 >> 12)];
                    if (n82 != 0) {
                        cX.A[n78++] = n82;
                    } else {
                        ++n78;
                    }
                    n79 += n24;
                    n80 += n23;
                    ++n81;
                }
                ++n76;
                n27 -= n23;
                n28 += n24;
                n22 += B;
            }
            return;
        } else {
            int n83 = n10;
            while (n83 < 0) {
                int n84;
                int n85 = n22;
                int n86 = n27 + (n25 * n24 >> 4);
                int n87 = n28 + (n25 * n23 >> 4);
                int n88 = n9;
                if (n86 < 0) {
                    n84 = (n24 - 1 - n86) / n24;
                    n88 = n9 + n84;
                    n86 += n24 * n84;
                    n87 += n23 * n84;
                    n85 = n22 + n84;
                }
                if ((n84 = (1 + n86 - (this.c << 12) - n24) / n24) > n88) {
                    n88 = n84;
                }
                if (n87 < 0) {
                    n84 = (n23 - 1 - n87) / n23;
                    n88 += n84;
                    n86 += n24 * n84;
                    n87 += n23 * n84;
                    n85 += n84;
                }
                if ((n84 = (1 + n87 - (this.e << 12) - n23) / n23) > n88) {
                    n88 = n84;
                }
                while (n88 < 0) {
                    int n89 = this.a[(n87 >> 12) * this.c + (n86 >> 12)];
                    if (n89 != 0) {
                        cX.A[n85++] = n89;
                    } else {
                        ++n85;
                    }
                    n86 += n24;
                    n87 += n23;
                    ++n88;
                }
                ++n83;
                n27 -= n23;
                n28 += n24;
                n22 += B;
            }
        }
    }

    cX() {
    }

    public void b(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            int n5 = this.a[i2];
            if (n5 == 0) continue;
            int n6 = n5 >> 16 & 255;
            if ((n6 += n2) < 1) {
                n6 = 1;
            } else if (n6 > 255) {
                n6 = 255;
            }
            int n7 = n5 >> 8 & 255;
            if ((n7 += n3) < 1) {
                n7 = 1;
            } else if (n7 > 255) {
                n7 = 255;
            }
            int n8 = n5 & 255;
            if ((n8 += n4) < 1) {
                n8 = 1;
            } else if (n8 > 255) {
                n8 = 255;
            }
            this.a[i2] = (n6 << 16) + (n7 << 8) + n8;
        }
    }

    public void b(int n2) {
        if (this.c != this.b || this.e != this.d) {
            int n3 = n2;
            if (n2 > this.g) {
                n3 = this.g;
            }
            int n4 = n2;
            if (n2 + this.g + this.c > this.b) {
                n4 = this.b - this.g - this.c;
            }
            int n5 = n2;
            if (n2 > this.f) {
                n5 = this.f;
            }
            int n6 = n2;
            if (n2 + this.f + this.e > this.d) {
                n6 = this.d - this.f - this.e;
            }
            int n7 = this.c + n3 + n4;
            int n8 = this.e + n5 + n6;
            int[] arrn = new int[n7 * n8];
            for (int i2 = 0; i2 < this.e; ++i2) {
                for (int i3 = 0; i3 < this.c; ++i3) {
                    arrn[(i2 + n5) * n7 + i3 + n3] = this.a[i2 * this.c + i3];
                }
            }
            this.a = arrn;
            this.c = n7;
            this.e = n8;
            this.g -= n3;
            this.f -= n5;
        }
    }

    public void d() {
        cX.a(this.a, this.c, this.e);
    }

    public void e() {
        int[] arrn = new int[this.c * this.e];
        int n2 = 0;
        for (int i2 = 0; i2 < this.e; ++i2) {
            for (int i3 = this.c - 1; i3 >= 0; --i3) {
                arrn[n2++] = this.a[i3 + i2 * this.c];
            }
        }
        this.a = arrn;
        this.g = this.b - this.c - this.g;
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (n4 > 0 && n5 > 0) {
            int n7;
            int n8;
            int n9 = this.c;
            int n10 = this.e;
            int n11 = 0;
            int n12 = 0;
            int n13 = this.b;
            int n14 = this.d;
            int n15 = (n13 << 16) / n4;
            int n16 = (n14 << 16) / n5;
            if (this.g > 0) {
                n7 = ((this.g << 16) + n15 - 1) / n15;
                n2 += n7;
                n11 += n7 * n15 - (this.g << 16);
            }
            if (this.f > 0) {
                n7 = ((this.f << 16) + n16 - 1) / n16;
                n3 += n7;
                n12 += n7 * n16 - (this.f << 16);
            }
            if (n9 < n13) {
                n4 = ((n9 << 16) - n11 + n15 - 1) / n15;
            }
            if (n10 < n14) {
                n5 = ((n10 << 16) - n12 + n16 - 1) / n16;
            }
            n7 = n2 + n3 * B;
            int n17 = B - n4;
            if (n3 + n5 > z) {
                n5 -= n3 + n5 - z;
            }
            if (n3 < x) {
                n8 = x - n3;
                n5 -= n8;
                n7 += n8 * B;
                n12 += n16 * n8;
            }
            if (n2 + n4 > y) {
                n8 = n2 + n4 - y;
                n4 -= n8;
                n17 += n8;
            }
            if (n2 < w) {
                n8 = w - n2;
                n4 -= n8;
                n7 += n8;
                n11 += n15 * n8;
                n17 += n8;
            }
            cX.a(A, this.a, 0, n11, n12, n7, n17, n4, n5, n15, n16, n9, n6);
        }
    }

    public void c(int n2) {
        int[] arrn = new int[this.c * this.e];
        int n3 = 0;
        for (int i2 = 0; i2 < this.e; ++i2) {
            for (int i3 = 0; i3 < this.c; ++i3) {
                int n4 = this.a[n3];
                if (n4 == 0) {
                    if (i3 > 0 && this.a[n3 - 1] != 0) {
                        n4 = n2;
                    } else if (i2 > 0 && this.a[n3 - this.c] != 0) {
                        n4 = n2;
                    } else if (i3 < this.c - 1 && this.a[n3 + 1] != 0) {
                        n4 = n2;
                    } else if (i2 < this.e - 1 && this.a[n3 + this.c] != 0) {
                        n4 = n2;
                    }
                }
                arrn[n3++] = n4;
            }
        }
        this.a = arrn;
    }
}

