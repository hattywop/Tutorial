/*
 * Decompiled with CFR 0_118.
 */
public class dq {
    static float a;
    static int b;
    int[] c = new int[2];
    int[][][] d = new int[2][2][4];
    int[][][] e = new int[2][2][4];
    int[] f = new int[2];
    static float[][] g;
    static int[][] h;

    float a(int n2, int n3, float f2) {
        float f3 = (float)this.e[n2][0][n3] + f2 * (float)(this.e[n2][1][n3] - this.e[n2][0][n3]);
        return 1.0f - (float)Math.pow(10.0, (- (f3 *= 0.0015258789f)) / 20.0f);
    }

    static float a(float f2) {
        float f3 = 32.703197f * (float)Math.pow(2.0, f2);
        return f3 * 3.1415927f / 11025.0f;
    }

    float b(int n2, int n3, float f2) {
        float f3 = (float)this.d[n2][0][n3] + f2 * (float)(this.d[n2][1][n3] - this.d[n2][0][n3]);
        return dq.a(f3 *= 1.2207031E-4f);
    }

    int a(int n2, float f2) {
        float f3;
        int n3;
        if (n2 == 0) {
            f3 = (float)this.f[0] + (float)(this.f[1] - this.f[0]) * f2;
            a = (float)Math.pow(0.1, (f3 *= 0.0030517578f) / 20.0f);
            b = (int)(a * 65536.0f);
        }
        if (this.c[n2] == 0) {
            return 0;
        }
        f3 = this.a(n2, 0, f2);
        dq.g[n2][0] = -2.0f * f3 * (float)Math.cos(this.b(n2, 0, f2));
        dq.g[n2][1] = f3 * f3;
        for (n3 = 1; n3 < this.c[n2]; ++n3) {
            f3 = this.a(n2, n3, f2);
            float f4 = -2.0f * f3 * (float)Math.cos(this.b(n2, n3, f2));
            float f5 = f3 * f3;
            dq.g[n2][n3 * 2 + 1] = g[n2][n3 * 2 - 1] * f5;
            dq.g[n2][n3 * 2] = g[n2][n3 * 2 - 1] * f4 + g[n2][n3 * 2 - 2] * f5;
            for (int i2 = n3 * 2 - 1; i2 >= 2; --i2) {
                float[] arrf = g[n2];
                int n4 = i2;
                arrf[n4] = arrf[n4] + (g[n2][i2 - 1] * f4 + g[n2][i2 - 2] * f5);
            }
            float[] arrf = g[n2];
            arrf[1] = arrf[1] + (g[n2][0] * f4 + f5);
            float[] arrf2 = g[n2];
            arrf2[0] = arrf2[0] + f4;
        }
        if (n2 == 0) {
            n3 = 0;
            while (n3 < this.c[0] * 2) {
                float[] arrf = g[0];
                int n5 = n3++;
                arrf[n5] = arrf[n5] * a;
            }
        }
        for (n3 = 0; n3 < this.c[n2] * 2; ++n3) {
            dq.h[n2][n3] = (int)(g[n2][n3] * 65536.0f);
        }
        return this.c[n2] * 2;
    }

    final void a(cY cY2, ds ds2) {
        int n2 = cY2.d();
        this.c[0] = n2 >> 4;
        this.c[1] = n2 & 15;
        if (n2 != 0) {
            int n3;
            int n4;
            this.f[0] = cY2.f();
            this.f[1] = cY2.f();
            int n5 = cY2.d();
            for (n3 = 0; n3 < 2; ++n3) {
                for (n4 = 0; n4 < this.c[n3]; ++n4) {
                    this.d[n3][0][n4] = cY2.f();
                    this.e[n3][0][n4] = cY2.f();
                }
            }
            for (n3 = 0; n3 < 2; ++n3) {
                for (n4 = 0; n4 < this.c[n3]; ++n4) {
                    if ((n5 & 1 << n3 * 4 << n4) != 0) {
                        this.d[n3][1][n4] = cY2.f();
                        this.e[n3][1][n4] = cY2.f();
                        continue;
                    }
                    this.d[n3][1][n4] = this.d[n3][0][n4];
                    this.e[n3][1][n4] = this.e[n3][0][n4];
                }
            }
            if (n5 != 0 || this.f[1] != this.f[0]) {
                ds2.b(cY2);
            }
        } else {
            int[] arrn = this.f;
            this.f[1] = 0;
            arrn[0] = 0;
        }
    }

    static {
        g = new float[2][8];
        h = new int[2][8];
    }
}

