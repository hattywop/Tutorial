/*
 * Decompiled with CFR 0_118.
 */
public class cH
extends z {
    static a a;
    public int b;
    static a c;
    int[] d;
    public String e = "null";
    public int f = 1718814713;
    public int g = 1071081845;
    public int h = 1248855625;
    public int i = 2029694883;
    public int j = 743030905;
    public int k = -1049662297;
    public int l = -2108174335;
    public int m = -1551627733;
    short[] n;
    short[] o;
    short[] p;
    short[] q;
    int[] r;
    public boolean s = true;
    public int t = -1335533653;
    int u = -235447680;
    int v = -530429824;
    public boolean w = false;
    int x = 0;
    int y = 0;
    public int z = -1549806575;
    public int A = -1830636768;
    int B = 758679315;
    public boolean C = true;
    int D = -1720135211;
    public boolean E = true;
    public int[] F;
    public boolean G = false;
    public int H = -1487997722;
    public String[] I = new String[5];
    public static n J;
    public static n K;

    public static cH a(int n2) {
        cH cH2 = (cH)J.a(n2);
        if (cH2 != null) {
            return cH2;
        }
        byte[] arrby = c.b(9, n2);
        cH2 = new cH();
        cH2.b = n2 * 691439225;
        if (arrby != null) {
            cH2.a(new cY(arrby));
        }
        if (n2 == 4398) {
            cH2.e = "Edgeville Wizard";
            cH.a(cH2, "Previous", 2);
        }
        if (n2 == 4399) {
            cH2.e = "Varrock Wizard";
            cH.a(cH2, "Previous", 2);
        }
        if (n2 == 4802) {
            cH2.e = "Cosmetics";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, "Shop 2", 2);
            cH.a(cH2, "Shop 3", 3);
            cH.a(cH2, "Shop 4", 4);
        }
        if (n2 == 4256) {
            cH2.e = "Untradables";
            cH.a(cH2, "Shop 1", 0);
        }
        if (n2 == 4298) {
            cH2.e = "Miscellaneous";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, "Shop 2", 2);
            cH.a(cH2, "Shop 3", 3);
            cH.a(cH2, "Shop 4", 4);
        }
        if (n2 == 4291) {
            cH2.e = "Barrows";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, "Repair", 2);
        }
        if (n2 == 4180) {
            cH2.e = "Free Melee Shop";
            cH.a(cH2, "Shop 1", 0);
        }
        if (n2 == 4181) {
            cH2.e = "Free Range Shop";
            cH.a(cH2, "Shop 1", 0);
        }
        if (n2 == 4179) {
            cH2.e = "Free Mage Shop";
            cH.a(cH2, "Shop 1", 0);
        }
        if (n2 == 4400) {
            cH2.e = "Lumbridge Wizard";
            cH.a(cH2, "Previous", 2);
        }
        if (n2 == 2462) {
            cH2.e = "Shanomi";
            cH.a(cH2, "Trade", 2);
        }
        if (n2 == 5523) {
            cH2.e = "Game Mode Manager";
            cH.a(cH2, "Quick-change", 2);
        }
        if (n2 == 2643) {
            cH.a(cH2, "op0", 0);
            cH.a(cH2, "op1 aka attack", 1);
            cH.a(cH2, "op2", 2);
            cH.a(cH2, "op3", 3);
            cH.a(cH2, "op4", 4);
        }
        if (n2 == 508 || n2 == 509 || n2 == 514 || n2 == 515) {
            cH.a(cH2, "General store", 2);
            cH.a(cH2, "Supplies", 3);
        }
        if (n2 == 4159) {
            cH2.e = "Edgeville Wizard";
            cH.a(cH2, "Previous", 2);
        }
        if (n2 == 4293) {
            cH2.e = "Supplies";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, null, 2);
            cH.a(cH2, null, 3);
            cH.a(cH2, null, 4);
        }
        if (n2 == 4295) {
            cH2.e = "Gear";
            cH.a(cH2, "Magic", 0);
            cH.a(cH2, "Range", 2);
            cH.a(cH2, "Melee", 3);
        }
        if (n2 == 4736) {
            cH2.e = "Heraldic";
            cH.a(cH2, "Shop 1", 0);
        }
        if (n2 == 2200) {
            cH2.e = "Team capes";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, null, 2);
        }
        if (n2 == 1173) {
            cH2.e = "Wares";
            cH.a(cH2, "Shop 1", 0);
            cH.a(cH2, "Shop 2", 2);
        }
        if (n2 == 276) {
            cH2.e = "OS-Scape Guide";
            cH.a(cH2, "Vote Now", 0);
            cH.a(cH2, "Open Store", 2);
            cH.a(cH2, "View Tutorial", 3);
            cH.a(cH2, "Latest Updates", 4);
        }
        if (n2 == 4398) {
            cH2.e = "Edgeville Wizard";
            cH.a(cH2, "Previous", 2);
        }
        if (n2 == 5156) {
            cH2.e = "Donation Manager";
            cH.a(cH2, "Talk-to", 0);
            cH.a(cH2, "Teleports", 1);
            cH.a(cH2, "Online Store", 2);
            cH.a(cH2, "Donation Tiers", 3);
        }
        if (n2 == 6526) {
            cH2.e = "Voting";
            cH.a(cH2, "Information", 0);
            cH.a(cH2, "Point Exchange", 2);
            cH.a(cH2, "Open Web Page", 3);
        }
        if (n2 == 560) {
            cH.a(cH2, "Trade", 2);
        }
        if (n2 == 1787) {
            cH2.e = "PvP Wizard";
            cH.a(cH2, "Talk-to", 0);
            cH.a(cH2, "Edgeville", 2);
            cH.a(cH2, "Canifis", 3);
            cH.a(cH2, "Varrock", 4);
        }
        if (n2 == 6904) {
            cH2.e = "Shop";
            cH2.t = 0;
            cH.a(cH2, "Melee Weapon", 0);
            cH.a(cH2, "Melee Armor", 2);
        }
        if (n2 == 6906) {
            cH2.e = "Shop";
            cH2.t = 0;
            cH.a(cH2, "Range Weapon", 0);
            cH.a(cH2, "Range Armor", 2);
            cH.a(cH2, "Range Ammo", 3);
        }
        if (n2 == 6908) {
            cH2.e = "Shop";
            cH2.t = 0;
            cH.a(cH2, "Magic Weapon", 0);
            cH.a(cH2, "Magic Robe", 2);
            cH.a(cH2, "Rune", 3);
            cH.a(cH2, "Teleport", 4);
        }
        if (n2 == 3481) {
            cH2.e = "Count";
            cH2.t = 0;
            cH2.H = 3481;
            cH.a(cH2, null, 1);
            cH.a(cH2, "Talk-to", 0);
            cH.a(cH2, "Answer Riddle", 2);
        }
        if (n2 == 3461) {
            cH2.e = "Count's Assistant";
            cH.a(cH2, "Talk-to", 0);
        }
        if (n2 == 3359) {
            cH2.e = "Zombie Priest";
            cH.a(cH2, null, 1);
            cH2.t = 0;
        }
        cH2.c();
        J.a(cH2, n2);
        return cH2;
    }

    public final cH a() {
        int n2 = -1;
        if (this.B * 744334565 != -1) {
            n2 = b.a(this.B * 744334565);
        } else if (this.D * 808067203 != -1) {
            n2 = I.j[this.D * 808067203];
        }
        return n2 >= 0 && n2 < this.F.length && this.F[n2] != -1 ? cH.a(this.F[n2]) : null;
    }

    void a(cY cY2, int n2) {
        if (n2 == 1) {
            int n3 = cY2.d();
            this.d = new int[n3];
            for (int i2 = 0; i2 < n3; ++i2) {
                this.d[i2] = cY2.f();
            }
        } else if (n2 == 2) {
            this.e = cY2.l();
        } else if (n2 == 12) {
            this.f = cY2.d() * 1718814713;
        } else if (n2 == 13) {
            this.g = cY2.f() * -1071081845;
        } else if (n2 == 14) {
            this.h = cY2.f() * -1248855625;
        } else if (n2 == 15) {
            this.i = cY2.f() * -2029694883;
        } else if (n2 == 16) {
            this.j = cY2.f() * -743030905;
        } else if (n2 == 17) {
            this.h = cY2.f() * -1248855625;
            this.k = cY2.f() * 1049662297;
            this.l = cY2.f() * 2108174335;
            this.m = cY2.f() * 1551627733;
        } else if (n2 >= 30 && n2 < 35) {
            this.I[n2 - 30] = cY2.l();
            if (this.I[n2 - 30].equalsIgnoreCase(du.e)) {
                this.I[n2 - 30] = null;
            }
        } else if (n2 == 40) {
            int n4 = cY2.d();
            this.n = new short[n4];
            this.o = new short[n4];
            for (int i3 = 0; i3 < n4; ++i3) {
                this.n[i3] = (short)cY2.f();
                this.o[i3] = (short)cY2.f();
            }
        } else if (n2 == 41) {
            int n5 = cY2.d();
            this.p = new short[n5];
            this.q = new short[n5];
            for (int i4 = 0; i4 < n5; ++i4) {
                this.p[i4] = (short)cY2.f();
                this.q[i4] = (short)cY2.f();
            }
        } else if (n2 == 60) {
            int n6 = cY2.d();
            this.r = new int[n6];
            for (int i5 = 0; i5 < n6; ++i5) {
                this.r[i5] = cY2.f();
            }
        } else if (n2 == 93) {
            this.s = false;
        } else if (n2 == 95) {
            this.t = cY2.f() * 1335533653;
        } else if (n2 == 97) {
            this.u = cY2.f() * 870575797;
        } else if (n2 == 98) {
            this.v = cY2.f() * -440351599;
        } else if (n2 == 99) {
            this.w = true;
        } else if (n2 != 100) {
            if (n2 == 101) {
                this.y = cY2.e() * 1814026781;
            } else if (n2 == 102) {
                this.z = cY2.f() * 1549806575;
            } else if (n2 == 103) {
                this.A = cY2.f() * -1533602407;
            } else if (n2 == 106) {
                this.B = cY2.f() * -758679315;
                if (this.B * 744334565 == 65535) {
                    this.B = 758679315;
                }
                this.D = cY2.f() * 1720135211;
                if (this.D * 808067203 == 65535) {
                    this.D = -1720135211;
                }
                int n7 = cY2.d();
                this.F = new int[n7 + 1];
                for (int i6 = 0; i6 <= n7; ++i6) {
                    this.F[i6] = cY2.f();
                    if (this.F[i6] != 65535) continue;
                    this.F[i6] = -1;
                }
            } else if (n2 == 107) {
                this.C = false;
            } else if (n2 == 109) {
                this.E = false;
            } else if (n2 == 111) {
                this.G = true;
            } else if (n2 == 112) {
                this.H = cY2.d() * -1910752419;
            }
        } else {
            this.x = cY2.e() * 139171809;
        }
    }

    public final cB a(d d2, int n2, d d3, int n3, int n4) {
        if (this.F != null) {
            cH cH2 = this.a();
            return cH2 == null ? null : cH2.a(d2, n2, d3, n3, 2068635374);
        }
        cB cB2 = (cB)K.a(this.b * 1380254665);
        if (cB2 == null) {
            int n5;
            boolean bl2 = false;
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                if (a.b(this.d[i2], 0, 1375477207)) continue;
                bl2 = true;
            }
            if (bl2) {
                return null;
            }
            da[] arrda = new da[this.d.length];
            for (n5 = 0; n5 < this.d.length; ++n5) {
                arrda[n5] = da.a(a, this.d[n5], 0);
            }
            da da2 = arrda.length == 1 ? arrda[0] : new da(arrda, arrda.length);
            if (this.n != null) {
                for (n5 = 0; n5 < this.n.length; ++n5) {
                    da2.a(this.n[n5], this.o[n5]);
                }
            }
            if (this.p != null) {
                for (n5 = 0; n5 < this.p.length; ++n5) {
                    da2.b(this.p[n5], this.q[n5]);
                }
            }
            cB2 = da2.a(this.x * 771681313 + 64, this.y * -390162167 + 850, -30, -50, -30);
            K.a(cB2, this.b * 1380254665);
        }
        cB cB3 = d2 != null && d3 != null ? d2.a(cB2, n2, d3, n3, -2097228551) : (d2 == null ? (d3 != null ? d3.b(cB2, n3, 1900259663) : cB2.a(true)) : d2.b(cB2, n2, 870470561));
        if (this.u * 1402081181 != 128 || this.v * -654082959 != 128) {
            cB3.a(this.u * 1402081181, this.v * -654082959, this.u * 1402081181);
        }
        return cB3;
    }

    void c() {
    }

    public boolean b(int n2) {
        if (this.F != null) {
            int n3 = -1;
            if (this.B * 744334565 != -1) {
                n3 = b.a(this.B * 744334565);
            } else if (this.D * 808067203 != -1) {
                n3 = I.j[this.D * 808067203];
            }
            return n3 >= 0 && n3 < this.F.length && this.F[n3] != -1;
        }
        return true;
    }

    void a(cY cY2) {
        int n2;
        while ((n2 = cY2.d()) != 0) {
            this.a(cY2, n2);
        }
        return;
    }

    public final da a(byte by2) {
        int n2;
        if (this.F != null) {
            cH cH2 = this.a();
            return cH2 == null ? null : cH2.a(11);
        }
        if (this.r == null) {
            return null;
        }
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.r.length; ++i2) {
            if (a.b(this.r[i2], 0, -200970970)) continue;
            bl2 = true;
        }
        if (bl2) {
            return null;
        }
        da[] arrda = new da[this.r.length];
        for (int i3 = 0; i3 < this.r.length; ++i3) {
            arrda[i3] = da.a(a, this.r[i3], 0);
        }
        da da2 = arrda.length == 1 ? arrda[0] : new da(arrda, arrda.length);
        if (this.n != null) {
            for (n2 = 0; n2 < this.n.length; ++n2) {
                da2.a(this.n[n2], this.o[n2]);
            }
        }
        if (this.p != null) {
            for (n2 = 0; n2 < this.p.length; ++n2) {
                da2.b(this.p[n2], this.q[n2]);
            }
        }
        return da2;
    }

    public static void a(cH cH2, String string, int n2) {
        if (cH2.I[n2] == null) {
            cH2.I[n2] = new String();
        }
        cH2.I[n2] = string;
    }

    static {
        J = new n(64);
        K = new n(50);
    }
}

