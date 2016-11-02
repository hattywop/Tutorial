/*
 * Decompiled with CFR 0_118.
 */
public final class aC {
    static cZ[] a;
    int b;
    int c;
    int d;
    public int e;
    public dh f;
    int g;
    static cN[] h;

    public static String a(CharSequence charSequence, P p2, int n2) {
        int n3;
        int n4;
        if (charSequence == null) {
            return null;
        }
        int n5 = charSequence.length();
        for (n3 = 0; n3 < n5; ++n3) {
            boolean bl2;
            n4 = charSequence.charAt(n3);
            boolean bl3 = bl2 = n4 == 160 || n4 == 32 || n4 == 95 || n4 == 45;
            if (!bl2) break;
        }
        while (n5 > n3 && u.a(charSequence.charAt(n5 - 1), 696219286)) {
            --n5;
        }
        n4 = n5 - n3;
        if (n4 >= 1 && n4 <= az.a(p2, -1373253709)) {
            StringBuilder stringBuilder = new StringBuilder(n4);
            for (int i2 = n3; i2 < n5; ++i2) {
                boolean bl4;
                char c2;
                char c3 = charSequence.charAt(i2);
                if (Character.isISOControl(c3)) {
                    bl4 = false;
                } else if (aw.a(c3, -364521760)) {
                    bl4 = true;
                } else {
                    char[] arrc = bh.a;
                    int n6 = 0;
                    block3 : do {
                        char c4;
                        if (n6 >= arrc.length) {
                            arrc = bh.b;
                            for (n6 = 0; n6 < arrc.length; ++n6) {
                                c4 = arrc[n6];
                                if (c4 != c3) continue;
                                bl4 = true;
                                break block3;
                            }
                            bl4 = false;
                            break;
                        }
                        c4 = arrc[n6];
                        if (c3 == c4) {
                            bl4 = true;
                            break;
                        }
                        ++n6;
                    } while (true);
                }
                if (!bl4 || (c2 = cb.a(c3, 7)) == '\u0000') continue;
                stringBuilder.append(c2);
            }
            if (stringBuilder.length() == 0) {
                return null;
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static String a(String string, int n2) {
        int n3 = string.length();
        char[] arrc = new char[n3];
        int n4 = 2;
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = string.charAt(i2);
            if (n4 == 0) {
                c2 = Character.toLowerCase(c2);
            } else if (n4 == 2 || Character.isUpperCase(c2)) {
                char c3 = c2 != '\u00b5' && c2 != '\u0192' ? Character.toTitleCase(c2) : c2;
                c2 = c3;
            }
            if (Character.isLetter(c2)) {
                n4 = 0;
            } else if (c2 != '.' && c2 != '?' && c2 != '!') {
                if (Character.isSpaceChar(c2)) {
                    if (n4 != 2) {
                        n4 = 1;
                    }
                } else {
                    n4 = 1;
                }
            } else {
                n4 = 2;
            }
            arrc[i2] = c2;
        }
        return new String(arrc);
    }

    static String[] a(String[] arrstring) {
        String[] arrstring2 = new String[5];
        for (int i2 = 0; i2 < 5; ++i2) {
            arrstring2[i2] = "" + i2 + ": ";
            if (arrstring == null || arrstring[i2] == null) continue;
            arrstring2[i2] = arrstring2[i2] + arrstring[i2];
        }
        return arrstring2;
    }
}

