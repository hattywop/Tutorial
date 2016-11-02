/*
 * Decompiled with CFR 0_118.
 */
import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.RandomAccessFile;

public final class A
extends Canvas {
    Component a;

    @Override
    public final void update(Graphics graphics) {
        this.a.update(graphics);
    }

    A(Component component) {
        this.a = component;
    }

    @Override
    public final void paint(Graphics graphics) {
        this.a.paint(graphics);
    }

    public static boolean a(File file, boolean bl2) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            int n2 = randomAccessFile.read();
            randomAccessFile.seek(0);
            randomAccessFile.write(n2);
            randomAccessFile.seek(0);
            randomAccessFile.close();
            if (bl2) {
                file.delete();
            }
            return true;
        }
        catch (Exception var2_3) {
            return false;
        }
    }
}

