/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Shape;
import java.awt.image.ColorModel;
import java.awt.image.DirectColorModel;
import java.awt.image.ImageConsumer;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Hashtable;

public final class cU
extends bL
implements ImageObserver,
ImageProducer {
    static bJ a;
    ImageConsumer f;
    ColorModel g;

    @Override
    final void a(int n2, int n3, Component component, byte by2) {
        this.b = n2 * -1467126307;
        this.d = n3 * -952133303;
        this.c = new int[n2 * n3 + 1];
        this.g = new DirectColorModel(32, 16711680, 65280, 255);
        this.e = component.createImage(this);
        this.b();
        component.prepareImage(this.e, this);
        this.b();
        component.prepareImage(this.e, this);
        this.b();
        component.prepareImage(this.e, this);
        this.a();
    }

    @Override
    public final void a(Graphics graphics, int n2, int n3, int n4) {
        this.b();
        graphics.drawImage(this.e, n2, n3, this);
    }

    @Override
    public final void a(Graphics graphics, int n2, int n3, int n4, int n5, byte by2) {
        this.a(n2, n3, n4, n5, -2137943106);
        Shape shape = graphics.getClip();
        graphics.clipRect(n2, n3, n4, n5);
        graphics.drawImage(this.e, 0, 0, this);
        graphics.setClip(shape);
    }

    @Override
    public synchronized boolean isConsumer(ImageConsumer imageConsumer) {
        return this.f == imageConsumer;
    }

    static void a(int n2, int n3, byte by2) {
        if (bH.ep * -250760527 != 0 && n2 != -1) {
            db.a(bQ.d, n2, 0, bH.ep * -250760527, false);
            bH.er = true;
        }
    }

    @Override
    public void startProduction(ImageConsumer imageConsumer) {
        this.addConsumer(imageConsumer);
    }

    @Override
    public void requestTopDownLeftRightResend(ImageConsumer imageConsumer) {
    }

    synchronized void b() {
        if (this.f != null) {
            this.f.setPixels(0, 0, this.b * -568569227, this.d * 774678777, this.g, this.c, 0, this.b * -568569227);
            this.f.imageComplete(2);
        }
    }

    synchronized void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.f != null) {
            this.f.setPixels(n2, n3, n4, n5, this.g, this.c, n3 * this.b * -568569227 + n2, this.b * -568569227);
            this.f.imageComplete(2);
        }
    }

    @Override
    public boolean imageUpdate(Image image, int n2, int n3, int n4, int n5, int n6) {
        return true;
    }

    @Override
    public synchronized void addConsumer(ImageConsumer imageConsumer) {
        this.f = imageConsumer;
        imageConsumer.setDimensions(this.b * -568569227, this.d * 774678777);
        imageConsumer.setProperties(null);
        imageConsumer.setColorModel(this.g);
        imageConsumer.setHints(14);
    }

    @Override
    public synchronized void removeConsumer(ImageConsumer imageConsumer) {
        if (imageConsumer == this.f) {
            this.f = null;
        }
    }

    public static void a(cY cY2, int n2, int n3) {
        bx bx2 = new bx();
        bx2.b = cY2.d() * -514768457;
        bx2.d = cY2.i() * -924051709;
        bx2.c = new int[bx2.b * -782078969];
        bx2.a = new int[bx2.b * -782078969];
        bx2.g = new Field[bx2.b * -782078969];
        bx2.f = new int[bx2.b * -782078969];
        bx2.e = new Method[bx2.b * -782078969];
        bx2.h = new byte[bx2.b * -782078969][][];
        for (int i2 = 0; i2 < bx2.b * -782078969; ++i2) {
            try {
                String string;
                String string2;
                int n4;
                int n5 = cY2.d();
                if (n5 != 0 && n5 != 1 && n5 != 2) {
                    int n6;
                    Method[] arrmethod;
                    if (n5 != 3 && n5 != 4) continue;
                    string = cY2.l();
                    string2 = cY2.l();
                    n4 = cY2.d();
                    String[] arrstring = new String[n4];
                    for (int i3 = 0; i3 < n4; ++i3) {
                        arrstring[i3] = cY2.l();
                    }
                    String string3 = cY2.l();
                    byte[][] arrarrby = new byte[n4][];
                    if (n5 == 3) {
                        for (int i4 = 0; i4 < n4; ++i4) {
                            n6 = cY2.i();
                            arrarrby[i4] = new byte[n6];
                            cY2.a(arrarrby[i4], 0, n6);
                        }
                    }
                    bx2.c[i2] = n5;
                    Class[] arrclass = new Class[n4];
                    for (n6 = 0; n6 < n4; ++n6) {
                        arrclass[n6] = di.a(arrstring[n6], -921817989);
                    }
                    Class class_ = di.a(string3, -684648065);
                    if (di.a(string, -1520131529).getClassLoader() == null) {
                        throw new SecurityException();
                    }
                    Method[] arrmethod2 = arrmethod = di.a(string, -639756416).getDeclaredMethods();
                    for (int i5 = 0; i5 < arrmethod2.length; ++i5) {
                        Class<?>[] arrclass2;
                        Method method = arrmethod2[i5];
                        if (!method.getName().equals(string2) || arrclass.length != (arrclass2 = method.getParameterTypes()).length) continue;
                        boolean bl2 = true;
                        for (int i6 = 0; i6 < arrclass.length; ++i6) {
                            if (arrclass[i6] == arrclass2[i6]) continue;
                            bl2 = false;
                            break;
                        }
                        if (!bl2 || class_ != method.getReturnType()) continue;
                        bx2.e[i2] = method;
                    }
                    bx2.h[i2] = arrarrby;
                    continue;
                }
                string = cY2.l();
                string2 = cY2.l();
                n4 = 0;
                if (n5 == 1) {
                    n4 = cY2.i();
                }
                bx2.c[i2] = n5;
                bx2.f[i2] = n4;
                if (di.a(string, -212672452).getClassLoader() == null) {
                    throw new SecurityException();
                }
                bx2.g[i2] = di.a(string, -349357321).getDeclaredField(string2);
                continue;
            }
            catch (ClassNotFoundException var5_6) {
                var5_6.printStackTrace();
                bx2.a[i2] = -1;
                continue;
            }
            catch (SecurityException var5_7) {
                var5_7.printStackTrace();
                bx2.a[i2] = -2;
                continue;
            }
            catch (NullPointerException var5_8) {
                var5_8.printStackTrace();
                bx2.a[i2] = -3;
                continue;
            }
            catch (Exception var5_9) {
                var5_9.printStackTrace();
                bx2.a[i2] = -4;
                continue;
            }
            catch (Throwable var5_10) {
                var5_10.printStackTrace();
                bx2.a[i2] = -5;
            }
        }
        O.b.a(bx2);
    }

    public static void b(byte[] arrby, int n2) {
        int n3;
        cY cY2 = new cY(arrby);
        cY2.h = (arrby.length - 2) * 1303963473;
        dg.b = cY2.f() * 1133427271;
        dg.d = new int[dg.b * -877080713];
        dg.e = new int[dg.b * -877080713];
        aP.b = new int[dg.b * -877080713];
        bH.fn = new int[dg.b * -877080713];
        cS.b = new byte[dg.b * -877080713][];
        cY2.h = (arrby.length - 7 - dg.b * 1573288888) * 1303963473;
        dg.f = cY2.f() * 2054985485;
        dg.a = cY2.f() * -1324487299;
        int n4 = (cY2.d() & 255) + 1;
        for (n3 = 0; n3 < dg.b * -877080713; ++n3) {
            dg.d[n3] = cY2.f();
        }
        for (n3 = 0; n3 < dg.b * -877080713; ++n3) {
            dg.e[n3] = cY2.f();
        }
        for (n3 = 0; n3 < dg.b * -877080713; ++n3) {
            aP.b[n3] = cY2.f();
        }
        for (n3 = 0; n3 < dg.b * -877080713; ++n3) {
            bH.fn[n3] = cY2.f();
        }
        cY2.h = (arrby.length - 7 - dg.b * 1573288888 - (n4 - 1) * 3) * 1303963473;
        dB.c = new int[n4];
        for (n3 = 1; n3 < n4; ++n3) {
            dB.c[n3] = cY2.h();
            if (dB.c[n3] != 0) continue;
            dB.c[n3] = 1;
        }
        cY2.h = 0;
        for (n3 = 0; n3 < dg.b * -877080713; ++n3) {
            int n5;
            int n6 = aP.b[n3];
            int n7 = bH.fn[n3];
            int n8 = n6 * n7;
            byte[] arrby2 = new byte[n8];
            cS.b[n3] = arrby2;
            int n9 = cY2.d();
            if (n9 == 0) {
                for (n5 = 0; n5 < n8; ++n5) {
                    arrby2[n5] = cY2.e();
                }
                continue;
            }
            if (n9 != 1) continue;
            for (n5 = 0; n5 < n6; ++n5) {
                for (int i2 = 0; i2 < n7; ++i2) {
                    arrby2[n6 * i2 + n5] = cY2.e();
                }
            }
        }
    }
}

