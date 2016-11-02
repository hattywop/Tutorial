/*
 * Decompiled with CFR 0_118.
 */
public class bo {
    static final void a(String string) {
        String string2;
        if (string != null && (string2 = aC.a(string, bH.O, -1668818814)) != null) {
            for (int i2 = 0; i2 < bH.eT * 389772333; ++i2) {
                aG aG2 = bH.eV[i2];
                String string3 = aG2.i;
                String string4 = aC.a(string3, bH.O, -1997515050);
                boolean bl2 = string != null && string3 != null ? (!string.startsWith("#") && !string3.startsWith("#") ? string2.equals(string4) : string.equals(string3)) : false;
                if (!bl2) continue;
                for (int i3 = i2; i3 < (bH.eT -= 681507749) * 389772333; ++i3) {
                    bH.eV[i3] = bH.eV[1 + i3];
                }
                bH.dy = bH.dq * 1609802529;
                bH.aF.a(157);
                bH.aF.d(du.a(string));
                bH.aF.a(string);
                break;
            }
        }
    }
}

