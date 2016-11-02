/*
 * Decompiled with CFR 0_118.
 */
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

final class cy
implements Runnable {
    cy() {
    }

    @Override
    public void run() {
        try {
            boolean bl2 = false;
            try {
                Class.forName("javafx.scene.Scene").getDeclaredMethods();
                Class.forName("javafx.application.Application").getDeclaredMethods();
                bl2 = true;
            }
            catch (Throwable var2_3) {
                var2_3.printStackTrace();
            }
            String string = "http://pvp.os-scape.com/javaversion.php?javafx_present=" + bl2 + "&java_version=" + URLEncoder.encode(String.valueOf(System.getProperty("java.version")));
            new URL(string).openConnection().getInputStream().close();
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }
}

