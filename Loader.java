/*
 * Decompiled with CFR 0_118.
 */
import java.applet.AppletContext;
import java.applet.AppletStub;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Loader
implements AppletStub {
    public static String a = "93.158.237.2";
    public static int b = 43594;
    public static int c = 15;
    public static Loader d;
    public static Properties e;
    public static boolean f;
    private static String g;

    public static void main(String[] arrstring) {
        Loader.f();
        Loader.b();
        if (arrstring.length > 1) {
            g = arrstring[1];
        }
        Loader.c();
        EventQueue.invokeLater(new cv());
    }

    private static void c() {
        try {
            Scanner scanner = new Scanner(new File(System.getProperty("user.home") + "/oss-drag-value.txt"));
            c = Integer.parseInt(scanner.nextLine());
            scanner.close();
        }
        catch (FileNotFoundException var0_1) {
            // empty catch block
        }
    }

    public static void a() {
        FileWriter fileWriter = null;
        try {
            File file = new File(System.getProperty("user.home") + "/oss-drag-value.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            fileWriter = new FileWriter(file);
            fileWriter.write(String.valueOf(c));
            fileWriter.close();
        }
        catch (IOException var1_2) {
            // empty catch block
        }
    }

    public static void b() {
        new Thread(new cw()).start();
    }

    private void d() {
        try {
            this.e();
            bH bH2 = new bH();
            bH2.setStub(this);
            bH2.init();
            bH2.start();
            JFrame jFrame = new JFrame("OS-Scape - Where every tick counts");
            jFrame.setDefaultCloseOperation(3);
            jFrame.add(bH2);
            Thread.setDefaultUncaughtExceptionHandler(new cx(this));
            try {
                jFrame.setIconImages(Arrays.asList(ImageIO.read(Loader.class.getResourceAsStream("/icon-48.png")), ImageIO.read(Loader.class.getResourceAsStream("/icon-16.png"))));
            }
            catch (Exception var3_4) {
                var3_4.printStackTrace();
            }
            jFrame.setVisible(true);
            JFrame jFrame2 = new JFrame();
            jFrame2.pack();
            Insets insets = jFrame2.getInsets();
            jFrame.setSize(765 + insets.left + insets.right, 503 + insets.top + insets.bottom);
            jFrame.setLocationRelativeTo(null);
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }

    public static void a(Throwable throwable) {
        String string = o.d;
        if (string.length() < 1) {
            string = System.getProperty("user.home");
        }
        try {
            File file = new File(string + File.separatorChar + ".osscape" + File.separatorChar + "error-log.txt");
            if (!new File(file.getParent()).exists()) {
                new File(file.getParent()).mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            throwable.printStackTrace(printWriter);
            printWriter.flush();
            printWriter.write("\n");
            printWriter.flush();
            printWriter.close();
            System.err.println("Captured error! Please report this! Located at user-home/.osscape/error-log.txt");
        }
        catch (FileNotFoundException var2_3) {
            var2_3.printStackTrace();
        }
        catch (IOException var2_4) {
            var2_4.printStackTrace();
        }
    }

    public static void a(String string) {
        String string2 = o.d;
        if (string2.length() < 1) {
            string2 = System.getProperty("user.home");
        }
        try {
            File file = new File(string2 + File.separatorChar + ".osscape" + File.separatorChar + "error-log.txt");
            if (!new File(file.getParent()).exists()) {
                new File(file.getParent()).mkdirs();
            }
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.write(string);
            printWriter.flush();
            printWriter.write("\n");
            printWriter.flush();
            printWriter.close();
            System.err.println("Captured error! Please report this! Located at user-home/.osscape/error-log.txt");
        }
        catch (FileNotFoundException var2_3) {
            var2_3.printStackTrace();
        }
        catch (IOException var2_4) {
            var2_4.printStackTrace();
        }
    }

    private void e() {
        try {
            String string;
            URL uRL = Loader.class.getResource("/params.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(g == null ? uRL.openConnection().getInputStream() : new ByteArrayInputStream(g.getBytes())));
            ArrayList<String> arrayList = new ArrayList<String>();
            while ((string = bufferedReader.readLine()) != null) {
                arrayList.add(string);
            }
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                String string2 = (String)iterator.next();
                if (!string2.contains("param=")) continue;
                string2 = string2.replace("param=", "");
                String string3 = string2.substring(0, string2.indexOf("="));
                String string4 = string2.substring(string2.indexOf("=") + 1, string2.length());
                e.put(string3, string4);
                if (!string3.equals("ip")) continue;
                a = string4;
            }
        }
        catch (Exception var1_2) {
            var1_2.printStackTrace();
        }
    }

    @Override
    public void appletResize(int n2, int n3) {
    }

    public static String b(String string) {
        return (String)e.get(string);
    }

    @Override
    public String getParameter(String string) {
        return (String)e.get(string);
    }

    @Override
    public URL getDocumentBase() {
        try {
            return new URL("http://" + a);
        }
        catch (MalformedURLException var1_1) {
            var1_1.printStackTrace();
            return null;
        }
    }

    @Override
    public URL getCodeBase() {
        try {
            return new URL("http://" + a);
        }
        catch (MalformedURLException var1_1) {
            var1_1.printStackTrace();
            return null;
        }
    }

    @Override
    public AppletContext getAppletContext() {
        return null;
    }

    @Override
    public boolean isActive() {
        return true;
    }

    public static cN c(String string) {
        cN cN2 = new cN();
        BufferedImage bufferedImage = ImageIO.read(Loader.class.getResourceAsStream("/" + string));
        cN2.a = cN2.e = bufferedImage.getWidth();
        cN2.b = cN2.f = bufferedImage.getHeight();
        cN2.h = 0;
        cN2.g = 0;
        int[] arrn = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), arrn, 0, bufferedImage.getWidth());
        cN2.d = new byte[bufferedImage.getWidth() * bufferedImage.getHeight()];
        cN2.c = new int[255];
        int n2 = 0;
        cN2.c[n2++] = 1;
        for (int i2 = 0; i2 < cN2.d.length; ++i2) {
            int n3 = arrn[i2] & 16777215;
            if (n3 == 16711935) {
                cN2.d[i2] = 0;
                continue;
            }
            int n4 = Arrays.binarySearch(cN2.c, n3);
            if (n4 < 0) {
                n4 = n2;
                cN2.c[n2++] = n3;
            }
            cN2.d[i2] = (byte)n4;
        }
        return cN2;
    }

    private static void f() {
        new Thread(new cy()).start();
    }

    static /* synthetic */ void a(Loader loader) {
        loader.d();
    }

    static {
        e = new Properties();
        f = false;
    }
}

