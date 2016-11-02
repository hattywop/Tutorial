/*
 * Decompiled with CFR 0_118.
 */
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;

public final class o {
    long a;
    RandomAccessFile b;
    long c;
    public static String d;
    public static String[] e;

    public static o a(String string, String string2, boolean bl2, int n2) {
        File file = new File(bg.a, "preferences" + string + ".dat");
        if (file.exists()) {
            try {
                o o2 = new o(file, "rw", 10000);
                return o2;
            }
            catch (IOException var5_6) {
                // empty catch block
            }
        }
        String string3 = "";
        if (bg.d * -960009521 == 33) {
            string3 = "_rc";
        } else if (bg.d * -960009521 == 34) {
            string3 = "_wip";
        }
        File file2 = new File(d, "osscape_" + string2 + "_preferences" + string + string3 + ".dat");
        if (!bl2 && file2.exists()) {
            try {
                o o3 = new o(file2, "rw", 10000);
                return o3;
            }
            catch (IOException var8_11) {
                // empty catch block
            }
        }
        try {
            o o4 = new o(file, "rw", 10000);
            return o4;
        }
        catch (IOException var8_12) {
            throw new RuntimeException();
        }
    }

    final void a(long l2) {
        this.b.seek(l2);
        this.a = -8272730773054730887L * l2;
    }

    public final void a() {
        if (this.b != null) {
            this.b.close();
            this.b = null;
        }
    }

    public final long b() {
        return this.b.length();
    }

    public final int a(byte[] arrby, int n2, int n3) {
        int n4 = this.b.read(arrby, n2, n3);
        if (n4 > 0) {
            this.a += -8272730773054730887L * (long)n4;
        }
        return n4;
    }

    protected void finalize() {
        if (this.b != null) {
            this.a();
        }
    }

    public final void b(byte[] arrby, int n2, int n3) {
        if ((long)n3 + this.a * -5463366847873381175L > this.c * 4154921993714465717L) {
            this.b.seek(this.c * 4154921993714465717L + 1);
            this.b.write(1);
            throw new EOFException();
        }
        this.b.write(arrby, n2, n3);
        this.a += (long)n3 * -8272730773054730887L;
    }

    public o(File file, String string, long l2) {
        if (l2 == -1) {
            l2 = Long.MAX_VALUE;
        }
        if (file.length() >= l2) {
            file.delete();
        }
        System.out.printf("RAF @ %s %n", file.getAbsoluteFile());
        this.b = new RandomAccessFile(file, string);
        this.c = l2 * 8305230546561817245L;
        this.a = 0;
        int n2 = this.b.read();
        if (n2 != -1 && !string.equals("r")) {
            this.b.seek(0);
            this.b.write(n2);
        }
        this.b.seek(0);
    }
}

