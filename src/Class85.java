import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ch")
public class Class85 extends Class127
{
    @ObfuscatedName("gc")
    @ObfuscatedGetter(intValue = -127094665)
    static int field1201;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -718862821)
    int field1207;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 715597741)
    int field1204;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 811632703)
    int field1200;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 263990655)
    int field1206;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1730539295)
    int field1198;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2035092851)
    int field1203;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Ljn;")
    Class273 field1202;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1387682185)
    int field1205;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -71136025)
    int field1199;
    
    Class85(final int field1207, final int field1208, final int field1209, final int field1210, final int field1211, final int field1212, final int n, final boolean b, final Class127 class127) {
        this.field1207 = field1207;
        this.field1204 = field1208;
        this.field1200 = field1209;
        this.field1206 = field1210;
        this.field1198 = field1211;
        this.field1203 = field1212;
        if (n != -1) {
            this.field1202 = Class3.method25(n);
            this.field1205 = 0;
            this.field1199 = Client.field591 - 1;
            if (this.field1202.field3553 == 0 && class127 != null && class127 instanceof Class85) {
                final Class85 class128 = (Class85)class127;
                if (this.field1202 == class128.field1202) {
                    this.field1205 = class128.field1205;
                    this.field1199 = class128.field1199;
                    return;
                }
            }
            if (b && this.field1202.field3544 != -1) {
                this.field1205 = (int)(Math.random() * this.field1202.field3540.length);
                this.field1199 -= (int)(Math.random() * this.field1202.field3541[this.field1205]);
            }
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        if (this.field1202 != null) {
            int i = Client.field591 - this.field1199;
            if (i > 100 && this.field1202.field3544 > 0) {
                i = 100;
            }
            while (i > this.field1202.field3541[this.field1205]) {
                i -= this.field1202.field3541[this.field1205];
                ++this.field1205;
                if (this.field1205 >= this.field1202.field3540.length) {
                    this.field1205 -= this.field1202.field3544;
                    if (this.field1205 < 0 || this.field1205 >= this.field1202.field3540.length) {
                        this.field1202 = null;
                        break;
                    }
                    continue;
                }
            }
            this.field1199 = Client.field591 - i;
        }
        Class268 class268 = Class110.method2527(this.field1207);
        if (class268.field3410 != null) {
            class268 = class268.method5056();
        }
        if (class268 == null) {
            return null;
        }
        int n;
        int n2;
        if (this.field1200 == 1 || this.field1200 == 3) {
            n = class268.field3385;
            n2 = class268.field3384;
        }
        else {
            n = class268.field3384;
            n2 = class268.field3385;
        }
        final int n3 = (n >> 1) + this.field1198;
        final int n4 = (n + 1 >> 1) + this.field1198;
        final int n5 = (n2 >> 1) + this.field1203;
        final int n6 = (n2 + 1 >> 1) + this.field1203;
        final int[][] array = Class50.field459[this.field1206];
        return class268.method5032(this.field1204, this.field1200, array, (this.field1198 << 7) + (n << 6), array[n4][n6] + array[n3][n6] + array[n4][n5] + array[n3][n5] >> 2, (this.field1203 << 7) + (n2 << 6), this.field1202, this.field1205);
    }
    
    @ObfuscatedName("fy")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    static final void method1962() {
        if (Client.field655 == 0) {
            final int field931 = Class138.field1876.field931;
            final int field932 = Class138.field1876.field881;
            if (Class109.field1428 - field931 < -500 || Class109.field1428 - field931 > 500 || Class2.field23 - field932 < -500 || Class2.field23 - field932 > 500) {
                Class109.field1428 = field931;
                Class2.field23 = field932;
            }
            if (field931 != Class109.field1428) {
                Class109.field1428 += (field931 - Class109.field1428) / 16;
            }
            if (field932 != Class2.field23) {
                Class2.field23 += (field932 - Class2.field23) / 16;
            }
            final int n = Class109.field1428 >> 7;
            final int n2 = Class2.field23 >> 7;
            final int method460 = Class27.method460(Class109.field1428, Class2.field23, Class13.field82);
            int n3 = 0;
            if (n > 3 && n2 > 3 && n < 100 && n2 < 100) {
                for (int i = n - 4; i <= n + 4; ++i) {
                    for (int j = n2 - 4; j <= n2 + 4; ++j) {
                        int field933 = Class13.field82;
                        if (field933 < 3 && (Class50.field443[1][i][j] & 0x2) == 0x2) {
                            ++field933;
                        }
                        final int n4 = method460 - Class50.field459[field933][i][j];
                        if (n4 > n3) {
                            n3 = n4;
                        }
                    }
                }
            }
            int n5 = n3 * 192;
            if (n5 > 98048) {
                n5 = 98048;
            }
            if (n5 < 32768) {
                n5 = 32768;
            }
            if (n5 > Client.field738) {
                Client.field738 += (n5 - Client.field738) / 24;
            }
            else if (n5 < Client.field738) {
                Client.field738 += (n5 - Client.field738) / 80;
            }
            Class269.field3478 = Class27.method460(Class138.field1876.field931, Class138.field1876.field881, Class13.field82) - Client.field644;
        }
        else if (Client.field655 == 1) {
            Class181.method3527();
            int field934 = -1;
            if (Class39.field341[33]) {
                field934 = 0;
            }
            else if (Class39.field341[49]) {
                field934 = 1024;
            }
            if (Class39.field341[48]) {
                if (field934 == 0) {
                    field934 = 1792;
                }
                else if (field934 == 1024) {
                    field934 = 1280;
                }
                else {
                    field934 = 1536;
                }
            }
            else if (Class39.field341[50]) {
                if (field934 == 0) {
                    field934 = 256;
                }
                else if (field934 == 1024) {
                    field934 = 768;
                }
                else {
                    field934 = 512;
                }
            }
            int field935 = 0;
            if (Class39.field341[35]) {
                field935 = -1;
            }
            else if (Class39.field341[51]) {
                field935 = 1;
            }
            int field936 = 0;
            if (field934 >= 0 || field935 != 0) {
                field936 = (Class39.field341[81] ? Client.field661 : Client.field750) * 16;
                Client.field613 = field934;
                Client.field659 = field935;
            }
            if (Client.field657 < field936) {
                Client.field657 += field936 / 8;
                if (Client.field657 > field936) {
                    Client.field657 = field936;
                }
            }
            else if (Client.field657 > field936) {
                Client.field657 = Client.field657 * 9 / 10;
            }
            if (Client.field657 > 0) {
                final int n6 = Client.field657 / 16;
                if (Client.field613 >= 0) {
                    final int n7 = Client.field613 - Class85.field1201 & 0x7FF;
                    final int n8 = Class122.field1681[n7];
                    final int n9 = Class122.field1693[n7];
                    Class109.field1428 += n8 * n6 / 65536;
                    Class2.field23 += n6 * n9 / 65536;
                }
                if (Client.field659 != 0) {
                    Class269.field3478 += n6 * Client.field659;
                    if (Class269.field3478 > 0) {
                        Class269.field3478 = 0;
                    }
                }
            }
            else {
                Client.field613 = -1;
                Client.field659 = -1;
            }
            if (Class39.field341[13]) {
                Client.field626.method1980(Class26.method433(Class169.field2142, Client.field626.field1218));
                Client.field655 = 0;
            }
        }
        if (Class48.field419 == 4 && Class253.field3229) {
            final int n10 = Class48.field426 * 673804999 - Client.field654;
            Client.field652 = n10 * 2;
            Client.field654 = ((n10 != -1 && n10 != 1) ? ((Class48.field426 * 673804999 + Client.field654) / 2) : (Class48.field426 * 673804999));
            final int n11 = Client.field653 - Class48.field425;
            Client.field608 = n11 * 2;
            Client.field653 = ((n11 != -1 && n11 != 1) ? ((Class48.field425 + Client.field653) / 2) : Class48.field425);
        }
        else {
            if (Class39.field341[96]) {
                Client.field608 += (-24 - Client.field608) / 2;
            }
            else if (Class39.field341[97]) {
                Client.field608 += (24 - Client.field608) / 2;
            }
            else {
                Client.field608 /= 2;
            }
            if (Class39.field341[98]) {
                Client.field652 += (12 - Client.field652) / 2;
            }
            else if (Class39.field341[99]) {
                Client.field652 += (-12 - Client.field652) / 2;
            }
            else {
                Client.field652 /= 2;
            }
            Client.field654 = Class48.field426 * 673804999;
            Client.field653 = Class48.field425;
        }
        Client.field717 = (Client.field608 / 2 + Client.field717 & 0x7FF);
        Client.field649 += Client.field652 / 2;
        if (Client.field649 < 128) {
            Client.field649 = 128;
        }
        if (Client.field649 > 383) {
            Client.field649 = 383;
        }
    }
}
