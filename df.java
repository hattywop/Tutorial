/*
 * Decompiled with CFR 0_118.
 */
public class df {
    static dk a;
    int b = 0;
    int c = 0;
    int d;
    int e;
    public int[][] f;

    public void a(int n2, int n3, int n4, int n5, boolean bl2, int n6) {
        int n7 = 256;
        if (bl2) {
            n7 += 131072;
        }
        n3 -= this.c * -1170276793;
        for (int i2 = n2 -= this.b * 1812566561; i2 < n4 + n2; ++i2) {
            if (i2 < 0 || i2 >= this.d * 92043199) continue;
            for (int i3 = n3; i3 < n5 + n3; ++i3) {
                if (i3 < 0 || i3 >= this.e * 987536373) continue;
                this.a(i2, i3, n7, -9);
            }
        }
    }

    public void a(int n2, int n3, int n4, int n5, int n6, boolean bl2, short s2) {
        int n7;
        int n8 = 256;
        if (bl2) {
            n8 += 131072;
        }
        n2 -= this.b * 1812566561;
        n3 -= this.c * -1170276793;
        if (n6 == 1 || n6 == 3) {
            n7 = n4;
            n4 = n5;
            n5 = n7;
        }
        for (n7 = n2; n7 < n4 + n2; ++n7) {
            if (n7 < 0 || n7 >= this.d * 92043199) continue;
            for (int i2 = n3; i2 < n3 + n5; ++i2) {
                if (i2 < 0 || i2 >= this.e * 987536373) continue;
                this.a(n7, i2, n8, -2129684690);
            }
        }
    }

    public void b(int n2, int n3, int n4, int n5, boolean bl2, int n6) {
        n2 -= this.b * 1812566561;
        n3 -= this.c * -1170276793;
        if (n4 == 0) {
            if (n5 == 0) {
                this.a(n2, n3, 128, -2);
                this.a(n2 - 1, n3, 8, -39);
            }
            if (n5 == 1) {
                this.a(n2, n3, 2, 2);
                this.a(n2, 1 + n3, 32, -68);
            }
            if (n5 == 2) {
                this.a(n2, n3, 8, -77);
                this.a(1 + n2, n3, 128, -52);
            }
            if (n5 == 3) {
                this.a(n2, n3, 32, -5);
                this.a(n2, n3 - 1, 2, -1);
            }
        }
        if (n4 == 1 || n4 == 3) {
            if (n5 == 0) {
                this.a(n2, n3, 1, -14);
                this.a(n2 - 1, n3 + 1, 16, -18);
            }
            if (n5 == 1) {
                this.a(n2, n3, 4, -121);
                this.a(n2 + 1, 1 + n3, 64, 0);
            }
            if (n5 == 2) {
                this.a(n2, n3, 16, -43);
                this.a(n2 + 1, n3 - 1, 1, -71);
            }
            if (n5 == 3) {
                this.a(n2, n3, 64, -100);
                this.a(n2 - 1, n3 - 1, 4, 5);
            }
        }
        if (n4 == 2) {
            if (n5 == 0) {
                this.a(n2, n3, 130, -57);
                this.a(n2 - 1, n3, 8, -40);
                this.a(n2, n3 + 1, 32, -59);
            }
            if (n5 == 1) {
                this.a(n2, n3, 10, -124);
                this.a(n2, n3 + 1, 32, -66);
                this.a(n2 + 1, n3, 128, 1);
            }
            if (n5 == 2) {
                this.a(n2, n3, 40, -108);
                this.a(1 + n2, n3, 128, -112);
                this.a(n2, n3 - 1, 2, -100);
            }
            if (n5 == 3) {
                this.a(n2, n3, 160, -35);
                this.a(n2, n3 - 1, 2, -47);
                this.a(n2 - 1, n3, 8, -11);
            }
        }
        if (bl2) {
            if (n4 == 0) {
                if (n5 == 0) {
                    this.a(n2, n3, 65536, -19);
                    this.a(n2 - 1, n3, 4096, -27);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 1024, -115);
                    this.a(n2, n3 + 1, 16384, -27);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 4096, -115);
                    this.a(1 + n2, n3, 65536, -65);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 16384, -61);
                    this.a(n2, n3 - 1, 1024, -1);
                }
            }
            if (n4 == 1 || n4 == 3) {
                if (n5 == 0) {
                    this.a(n2, n3, 512, 3);
                    this.a(n2 - 1, n3 + 1, 8192, -33);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 2048, -90);
                    this.a(1 + n2, n3 + 1, 32768, -97);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 8192, -121);
                    this.a(n2 + 1, n3 - 1, 512, -84);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 32768, -50);
                    this.a(n2 - 1, n3 - 1, 2048, -77);
                }
            }
            if (n4 == 2) {
                if (n5 == 0) {
                    this.a(n2, n3, 66560, -33);
                    this.a(n2 - 1, n3, 4096, -35);
                    this.a(n2, n3 + 1, 16384, -69);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 5120, -121);
                    this.a(n2, n3 + 1, 16384, -78);
                    this.a(n2 + 1, n3, 65536, -66);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 20480, -29);
                    this.a(n2 + 1, n3, 65536, -26);
                    this.a(n2, n3 - 1, 1024, -87);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 81920, -119);
                    this.a(n2, n3 - 1, 1024, -18);
                    this.a(n2 - 1, n3, 4096, -35);
                }
            }
        }
    }

    public void a(int n2, int n3, int n4) {
        int[] arrn = this.f[n2 -= this.b * 1812566561];
        int n5 = n3 -= this.c * -1170276793;
        arrn[n5] = arrn[n5] | 2097152;
    }

    public void b(int n2, int n3, int n4) {
        int[] arrn = this.f[n2 -= this.b * 1812566561];
        int n5 = n3 -= this.c * -1170276793;
        arrn[n5] = arrn[n5] | 262144;
    }

    void a(int n2, int n3, int n4, int n5) {
        int[] arrn = this.f[n2];
        int n6 = n3;
        arrn[n6] = arrn[n6] & ~ n4;
    }

    public void a(byte by2) {
        for (int i2 = 0; i2 < this.d * 92043199; ++i2) {
            for (int i3 = 0; i3 < this.e * 987536373; ++i3) {
                this.f[i2][i3] = i2 != 0 && i3 != 0 && i2 < this.d * 92043199 - 5 && i3 < this.e * 987536373 - 5 ? 16777216 : 16777215;
            }
        }
    }

    void a(int n2, int n3, int n4, byte by2) {
        int[] arrn = this.f[n2];
        int n5 = n3;
        arrn[n5] = arrn[n5] | n4;
    }

    public void c(int n2, int n3, int n4) {
        int[] arrn = this.f[n2 -= this.b * 1812566561];
        int n5 = n3 -= this.c * -1170276793;
        arrn[n5] = arrn[n5] & -262145;
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2, byte by2) {
        n2 -= this.b * 1812566561;
        n3 -= this.c * -1170276793;
        if (n4 == 0) {
            if (n5 == 0) {
                this.a(n2, n3, 128, -1652813290);
                this.a(n2 - 1, n3, 8, 45908779);
            }
            if (n5 == 1) {
                this.a(n2, n3, 2, 1794365099);
                this.a(n2, 1 + n3, 32, 53854458);
            }
            if (n5 == 2) {
                this.a(n2, n3, 8, -2120495830);
                this.a(n2 + 1, n3, 128, -560628494);
            }
            if (n5 == 3) {
                this.a(n2, n3, 32, 1572139256);
                this.a(n2, n3 - 1, 2, 1029882763);
            }
        }
        if (n4 == 1 || n4 == 3) {
            if (n5 == 0) {
                this.a(n2, n3, 1, 1591614710);
                this.a(n2 - 1, 1 + n3, 16, 1732259204);
            }
            if (n5 == 1) {
                this.a(n2, n3, 4, 1482516053);
                this.a(1 + n2, n3 + 1, 64, -1668399313);
            }
            if (n5 == 2) {
                this.a(n2, n3, 16, -1435347875);
                this.a(n2 + 1, n3 - 1, 1, -581800763);
            }
            if (n5 == 3) {
                this.a(n2, n3, 64, -1153317556);
                this.a(n2 - 1, n3 - 1, 4, -957869131);
            }
        }
        if (n4 == 2) {
            if (n5 == 0) {
                this.a(n2, n3, 130, -1943449581);
                this.a(n2 - 1, n3, 8, 50706670);
                this.a(n2, 1 + n3, 32, 357888824);
            }
            if (n5 == 1) {
                this.a(n2, n3, 10, 2130041913);
                this.a(n2, n3 + 1, 32, -1571889000);
                this.a(1 + n2, n3, 128, -1366839164);
            }
            if (n5 == 2) {
                this.a(n2, n3, 40, 200160834);
                this.a(1 + n2, n3, 128, 808519981);
                this.a(n2, n3 - 1, 2, -1685687232);
            }
            if (n5 == 3) {
                this.a(n2, n3, 160, 1142934621);
                this.a(n2, n3 - 1, 2, -1383694488);
                this.a(n2 - 1, n3, 8, 59652686);
            }
        }
        if (bl2) {
            if (n4 == 0) {
                if (n5 == 0) {
                    this.a(n2, n3, 65536, -1412234962);
                    this.a(n2 - 1, n3, 4096, -980264543);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 1024, 1595208817);
                    this.a(n2, 1 + n3, 16384, -1747593045);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 4096, 1592930130);
                    this.a(n2 + 1, n3, 65536, 1764275142);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 16384, -525157894);
                    this.a(n2, n3 - 1, 1024, 246804641);
                }
            }
            if (n4 == 1 || n4 == 3) {
                if (n5 == 0) {
                    this.a(n2, n3, 512, 1731379825);
                    this.a(n2 - 1, n3 + 1, 8192, -1882800493);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 2048, -751960724);
                    this.a(n2 + 1, n3 + 1, 32768, 1416973281);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 8192, -991017955);
                    this.a(n2 + 1, n3 - 1, 512, 1987420188);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 32768, -1254867198);
                    this.a(n2 - 1, n3 - 1, 2048, 1563413352);
                }
            }
            if (n4 == 2) {
                if (n5 == 0) {
                    this.a(n2, n3, 66560, -3281480);
                    this.a(n2 - 1, n3, 4096, 617331402);
                    this.a(n2, n3 + 1, 16384, 2075909063);
                }
                if (n5 == 1) {
                    this.a(n2, n3, 5120, -2021391996);
                    this.a(n2, n3 + 1, 16384, 671273589);
                    this.a(1 + n2, n3, 65536, -560339116);
                }
                if (n5 == 2) {
                    this.a(n2, n3, 20480, -1235953771);
                    this.a(n2 + 1, n3, 65536, 1771703252);
                    this.a(n2, n3 - 1, 1024, -224835243);
                }
                if (n5 == 3) {
                    this.a(n2, n3, 81920, -1002049858);
                    this.a(n2, n3 - 1, 1024, -1660360938);
                    this.a(n2 - 1, n3, 4096, 40611142);
                }
            }
        }
    }

    public df(int n2, int n3) {
        this.d = n2 * -654084033;
        this.e = n3 * -1511065507;
        this.f = new int[this.d * 92043199][this.e * 987536373];
        this.a(37);
    }
}

