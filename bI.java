/*
 * Decompiled with CFR 0_118.
 */
final class bI
implements Runnable {
    bI() {
    }

    @Override
    public void run() {
        bH.ft = af.a(J.a());
        if (bH.ft == null || bH.ft.length == 0) {
            bH.ft = new byte[20];
        }
    }
}

