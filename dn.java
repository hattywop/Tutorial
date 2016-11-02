/*
 * Decompiled with CFR 0_118.
 */
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class dn
implements Runnable {
    static p a;
    boolean b = false;
    byte[] c;
    int d = 0;
    dk e;
    int f = 0;
    boolean g = false;
    dl h;
    Socket i;
    InputStream j;
    OutputStream k;

    public int a() {
        return this.g ? 0 : this.j.available();
    }

    public void a(byte[] arrby, int n2, int n3) {
        if (!this.g) {
            while (n3 > 0) {
                int n4 = this.j.read(arrby, n2, n3);
                if (n4 <= 0) {
                    throw new EOFException();
                }
                n2 += n4;
                n3 -= n4;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(byte[] arrby, int n2, int n3) {
        if (!this.g) {
            if (this.b) {
                this.b = false;
                throw new IOException();
            }
            if (this.c == null) {
                this.c = new byte[5000];
            }
            dn dn2 = this;
            synchronized (dn2) {
                for (int i2 = 0; i2 < n3; ++i2) {
                    this.c[this.d * 1692815575] = arrby[n2 + i2];
                    this.d = (1 + this.d * 1692815575) % 5000 * 25404135;
                    if (this.d * 1692815575 != (this.f * -757138255 + 4900) % 5000) continue;
                    throw new IOException();
                }
                if (this.e == null) {
                    this.e = this.h.a(this, 3, 7);
                }
                this.notifyAll();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        try {
            do {
                var3_5 = this;
                // MONITORENTER : var3_5
                if (this.f * -757138255 == this.d * 1692815575) {
                    if (this.g) {
                        // MONITOREXIT : var3_5
                        ** try [egrp 5[TRYBLOCK] [6 : 195->240)] { 
lbl9: // 1 sources:
                        break;
                    }
                    try {
                        this.wait();
                    }
                    catch (InterruptedException var4_8) {
                        // empty catch block
                    }
                }
                var1_1 = this.f * -757138255;
                var2_4 = this.d * 1692815575 >= this.f * -757138255 ? this.d * 1692815575 - this.f * -757138255 : 5000 - this.f * -757138255;
                // MONITOREXIT : var3_5
                if (var2_4 <= 0) continue;
                try {
                    this.k.write(this.c, var1_1, var2_4);
                }
                catch (IOException var3_6) {
                    this.b = true;
                }
                this.f = (this.f * -757138255 + var2_4) % 5000 * 950389841;
                try {
                    if (this.f * -757138255 != this.d * 1692815575) continue;
                    this.k.flush();
                }
                catch (IOException var3_7) {
                    this.b = true;
                }
            } while (true);
            {
                if (this.j != null) {
                    this.j.close();
                }
                if (this.k != null) {
                    this.k.close();
                }
                if (this.i != null) {
                    this.i.close();
                }
            }
lbl39: // 1 sources:
            catch (IOException var1_2) {
                // empty catch block
            }
            this.c = null;
            return;
        }
        catch (Exception var1_3) {
            ba.a(null, var1_3, 1);
        }
    }

    public int b() {
        return this.g ? 0 : this.j.read();
    }

    public dn(Socket socket, dl dl2) {
        this.h = dl2;
        this.i = socket;
        this.i.setSoTimeout(30000);
        this.i.setTcpNoDelay(true);
        this.j = this.i.getInputStream();
        this.k = this.i.getOutputStream();
    }

    protected void finalize() {
        this.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        if (!this.g) {
            dn dn2 = this;
            synchronized (dn2) {
                this.g = true;
                this.notifyAll();
            }
            if (this.e != null) {
                while (this.e.f == 0) {
                    ao.a(1);
                }
                if (this.e.f == 1) {
                    try {
                        ((Thread)this.e.d).join();
                    }
                    catch (InterruptedException var1_2) {
                        // empty catch block
                    }
                }
            }
            this.e = null;
        }
    }

    static boolean a(cZ cZ2, byte by2) {
        if (bH.db) {
            if (bH.a(cZ2) != 0) {
                return false;
            }
            if (cZ2.s * -1878336627 == 0) {
                return false;
            }
        }
        return cZ2.G;
    }
}

