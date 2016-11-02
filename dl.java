/*
 * Decompiled with CFR 0_118.
 */
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

public class dl
implements Runnable {
    bW a;
    static cN b;
    dk c = null;
    dk d = null;
    boolean e = false;
    public static String f;
    static String g;
    public EventQueue h;
    Thread i;

    static final void a(int n2, int n3, int n4, boolean bl2, int n5) {
        if (bZ.a(n2)) {
            aV.a(cZ.e[n2], -1, n3, n4, bl2, -711223216);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public final void run() {
        do {
            dl dl2 = this;
            synchronized (dl2) {
                do {
                    if (this.e) {
                        return;
                    }
                    if (this.c != null) {
                        dk dk2 = this.c;
                        this.c = this.c.e;
                        if (this.c != null) break;
                        this.d = null;
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException var3_7) {}
                } while (true);
            }
            try {
                Object object;
                int n2 = dk2.b * 65210863;
                if (n2 == 1) {
                    dk2.d = new Socket(InetAddress.getByName((String)dk2.a), dk2.c);
                } else if (n2 == 2) {
                    object = new Thread((Runnable)dk2.a);
                    object.setDaemon(true);
                    object.start();
                    object.setPriority(dk2.c);
                    dk2.d = object;
                } else if (n2 == 4) {
                    dk2.d = new DataInputStream(((URL)dk2.a).openStream());
                } else if (n2 == 3) {
                    object = "" + (dk2.c >> 24 & 255) + "." + (dk2.c >> 16 & 255) + "." + (dk2.c >> 8 & 255) + "." + (dk2.c & 255);
                    dk2.d = InetAddress.getByName((String)object).getHostName();
                }
                dk2.f = 1;
                continue;
            }
            catch (ThreadDeath var2_4) {
                throw var2_4;
            }
            catch (Throwable var2_5) {
                var2_5.printStackTrace();
                dk2.f = 2;
                continue;
            }
            break;
        } while (true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final dk a(int n2, int n3, Object object) {
        dk dk2 = new dk();
        dk2.b = n2 * 88818959;
        dk2.c = n3;
        dk2.a = object;
        dl dl2 = this;
        synchronized (dl2) {
            if (this.d != null) {
                this.d.e = dk2;
                this.d = dk2;
            } else {
                this.d = this.c = dk2;
            }
            this.notify();
            return dk2;
        }
    }

    public final dk a(String string, int n2) {
        return this.a(1, n2, string);
    }

    public final dk a(Runnable runnable, int n2, byte by2) {
        return this.a(2, n2, runnable);
    }

    public final dk a(int n2, int n3) {
        return this.a(3, n2, null);
    }

    public final dk a(URL uRL, byte by2) {
        return this.a(4, 0, uRL);
    }

    public final bW a(int n2) {
        return this.a;
    }

    dl() {
        f = "Unknown";
        g = "1.1";
        try {
            f = System.getProperty("java.vendor");
            g = System.getProperty("java.version");
        }
        catch (Exception var1_1) {
            // empty catch block
        }
        try {
            this.h = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable var1_2) {
            // empty catch block
        }
        this.e = false;
        this.i = new Thread(this);
        this.i.setPriority(10);
        this.i.setDaemon(true);
        this.i.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    final void a(byte by2) {
        dl dl2 = this;
        synchronized (dl2) {
            this.e = true;
            this.notifyAll();
        }
        try {
            this.i.join();
        }
        catch (InterruptedException var2_3) {
            // empty catch block
        }
    }
}

