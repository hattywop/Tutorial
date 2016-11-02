/*
 * Decompiled with CFR 0_118.
 */
import java.awt.AWTEvent;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;

public class ag
implements Runnable {
    dl a;
    static cX b;
    protected static Image c;
    static bw d;
    volatile cO[] e = new cO[2];
    volatile boolean f = false;
    volatile boolean g = false;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        this.g = true;
        try {
            try {
                while (!this.f) {
                    cO cO2;
                    for (int i2 = 0; i2 < 2; ++i2) {
                        cO2 = this.e[i2];
                        if (cO2 == null) continue;
                        cO2.b(134121842);
                    }
                    ao.a(10);
                    dl dl2 = this.a;
                    cO2 = null;
                    if (dl2.h == null) continue;
                    for (int i3 = 0; i3 < 50 && dl2.h.peekEvent() != null; ++i3) {
                        ao.a(1);
                    }
                    if (cO2 == null) continue;
                    dl2.h.postEvent(new ActionEvent(cO2, 1001, "dummy"));
                }
            }
            catch (Exception var1_2) {
                ba.a(null, var1_2, 1);
                this.g = false;
                this.g = false;
                return;
            }
            this.g = false;
        }
        finally {
            this.g = false;
        }
    }
}

