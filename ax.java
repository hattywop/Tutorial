/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public final class ax {
    static byte[][][] a;
    static byte[][][] b;
    static int[][] c;
    static int[] d;
    static int[] e;
    static byte[][][] f;
    static int g;
    static int[][][] h;
    static byte[][][] i;
    static int j;
    static int[] k;
    static int[] l;
    static int[] m;
    static int[] n;
    static int[] o;
    static int[] p;
    static int q;
    static int r;

    public static int a(int n2, int n3, int n4, byte by2) {
        return (n4 &= 3) == 0 ? n2 : (n4 == 1 ? n3 : (n4 == 2 ? 7 - n2 : 7 - n3));
    }

    static void a(int n2) {
        int n3 = bH.n * -467838879;
        int n4 = bH.o * -1456024027;
        int n5 = cO.e * 1822130227 - aJ.f * 2104430923 - n3;
        int n6 = dy.c * -733282123 - aQ.a * -1064642111 - n4;
        if (n3 > 0 || n5 > 0 || n4 > 0 || n6 > 0) {
            try {
                Object object;
                Container container = bH.M.g(-288911122);
                int n7 = 0;
                int n8 = 0;
                if (aO.a == container) {
                    object = aO.a.getInsets();
                    n7 = object.left;
                    n8 = object.top;
                }
                object = container.getGraphics();
                object.setColor(Color.black);
                if (n3 > 0) {
                    object.fillRect(n7, n8, n3, dy.c * -733282123);
                }
                if (n4 > 0) {
                    object.fillRect(n7, n8, cO.e * 1822130227, n4);
                }
                if (n5 > 0) {
                    object.fillRect(n7 + cO.e * 1822130227 - n5, n8, n5, dy.c * -733282123);
                }
                if (n6 > 0) {
                    object.fillRect(n7, dy.c * -733282123 + n8 - n6, cO.e * 1822130227, n6);
                }
            }
            catch (Exception var5_6) {
                // empty catch block
            }
        }
    }

    public static File a(String string, byte by2) {
        if (!aR.d) {
            throw new RuntimeException("");
        }
        File file = (File)aR.e.get(string);
        if (file != null) {
            return file;
        }
        File file2 = new File(aR.b, string);
        RandomAccessFile randomAccessFile = null;
        try {
            File file3 = new File(file2.getParent());
            if (!file3.exists()) {
                throw new RuntimeException("");
            }
            randomAccessFile = new RandomAccessFile(file2, "rw");
            int n2 = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(n2);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            aR.e.put(string, file2);
            return file2;
        }
        catch (Exception var5_6) {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                    randomAccessFile = null;
                }
            }
            catch (Exception var6_8) {
                // empty catch block
            }
            throw new RuntimeException();
        }
    }

    static {
        h = new int[4][105][105];
        i = new byte[4][104][104];
        j = -1368485481;
        k = new int[]{1, 2, 4, 8};
        l = new int[]{16, 32, 64, 128};
        m = new int[]{1, 0, -1, 0};
        n = new int[]{0, -1, 0, 1};
        o = new int[]{1, -1, -1, 1};
        p = new int[]{-1, -1, 1, 1};
        q = ((int)(Math.random() * 17.0) - 8) * 1624995311;
        r = ((int)(Math.random() * 33.0) - 16) * -1659611771;
    }
}

