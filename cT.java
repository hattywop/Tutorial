/*
 * Decompiled with CFR 0_118.
 */
import java.io.IOException;

public class cT {
    public int a;
    static cT b = new cT(0);
    public static cT c = new cT(1);
    static cT d = new cT(2);

    cT(int n2) {
        this.a = n2 * -921122911;
    }

    public static void a(cY cY2, int n2) {
        byte[] arrby = new byte[24];
        try {
            int n3;
            bg.f.a(0);
            bg.f.a(arrby, -1830055126);
            for (n3 = 0; n3 < 24 && arrby[n3] == 0; ++n3) {
            }
            if (n3 >= 24) {
                throw new IOException();
            }
        }
        catch (Exception var3_4) {
            for (int i2 = 0; i2 < 24; ++i2) {
                arrby[i2] = -1;
            }
        }
        cY2.c(arrby, 0, 24);
    }
}

