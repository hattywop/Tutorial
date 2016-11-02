/*
 * Decompiled with CFR 0_118.
 */
public final class aq {
    int a;
    int b;
    int c;
    int d;
    int e;
    static cN[] f;
    public dh g;
    public dh h;
    public int i = 0;
    int j = 0;
    static n k;
    static n l;
    static n m;

    public static void a() {
        k.a();
        l.a();
        m.a();
    }

    public static String a(CharSequence charSequence) {
        int n2 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = charSequence.charAt(i2);
            if (!(c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 >= '0' && c2 <= '9' || c2 == '.' || c2 == '-' || c2 == '*' || c2 == '_')) {
                if (c2 == ' ') {
                    stringBuilder.append('+');
                    continue;
                }
                byte by2 = aL.a(c2, -1305953540);
                stringBuilder.append('%');
                int n3 = by2 >> 4 & 15;
                if (n3 >= 10) {
                    stringBuilder.append((char)(55 + n3));
                } else {
                    stringBuilder.append((char)(n3 + 48));
                }
                n3 = by2 & 15;
                if (n3 >= 10) {
                    stringBuilder.append((char)(55 + n3));
                    continue;
                }
                stringBuilder.append((char)(48 + n3));
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    static {
        k = new n(64);
        l = new n(50);
        m = new n(200);
    }
}

