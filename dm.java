/*
 * Decompiled with CFR 0_118.
 */
public class dm {
    public static boolean[] a = new boolean[]{true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false};
    public static int[] b = new int[99];

    static {
        int n2 = 0;
        for (int i2 = 0; i2 < 99; ++i2) {
            int n3 = 1 + i2;
            int n4 = (int)((double)n3 + 300.0 * Math.pow(2.0, (double)n3 / 7.0));
            dm.b[i2] = (n2 += n4) / 4;
        }
    }
}

