import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bl")
public final class Class62 extends Class204
{
    @ObfuscatedName("er")
    @ObfuscatedSignature(signature = "Lfd;")
    static Class157 field869;
    @ObfuscatedName("el")
    @ObfuscatedGetter(intValue = 701830261)
    static int field868;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 1275517341)
    int field859;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1431899603)
    int field861;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1725586571)
    int field856;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 963481089)
    int field857;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -773006769)
    int field858;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -3180471)
    int field865;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -66772787)
    int field866;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 920179015)
    int field862;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 208398471)
    int field863;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 2065155657)
    int field864;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -37170881)
    int field855;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 1332159199)
    int field860;
    
    Class62() {
        this.field855 = 0;
        this.field860 = -1;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Lfn;", garbageValue = "2059542848")
    public static Class172 method1536() {
        Class172 class172;
        if (Class172.field2258 == 0) {
            class172 = new Class172();
        }
        else {
            class172 = Class172.field2256[--Class172.field2258];
        }
        final Class172 class173 = class172;
        class173.field2254 = null;
        class173.field2253 = 0;
        class173.field2257 = new Class189(5000);
        return class173;
    }
    
    @ObfuscatedName("ga")
    @ObfuscatedSignature(signature = "(IIZI)V", garbageValue = "-149430841")
    static final void method1537(final int field224, final int field225, final boolean b) {
        if (b && field224 == Class27.field224 && Class34.field301 == field225) {
            return;
        }
        Class27.field224 = field224;
        Class34.field301 = field225;
        Class48.method947(25);
        Class83.method1933("Loading - please wait.", true);
        final int field226 = Class62.field868;
        final int field227 = Client.field754;
        Class62.field868 = (field224 - 6) * 8;
        Client.field754 = (field225 - 6) * 8;
        final int n = Class62.field868 - field226;
        final int n2 = Client.field754 - field227;
        final int field228 = Class62.field868;
        final int field229 = Client.field754;
        for (int i = 0; i < 32768; ++i) {
            final Class72 class72 = Client.field843[i];
            if (class72 != null) {
                for (int j = 0; j < 10; ++j) {
                    final int[] field230 = class72.field922;
                    final int n3 = j;
                    field230[n3] -= n;
                    final int[] field231 = class72.field872;
                    final int n4 = j;
                    field231[n4] -= n2;
                }
                final Class72 class73 = class72;
                class73.field931 -= n * 128;
                final Class72 class74 = class72;
                class74.field881 -= n2 * 128;
            }
        }
        for (int k = 0; k < 2048; ++k) {
            final Class60 class75 = Client.field610[k];
            if (class75 != null) {
                for (int l = 0; l < 10; ++l) {
                    final int[] field232 = class75.field922;
                    final int n5 = l;
                    field232[n5] -= n;
                    final int[] field233 = class75.field872;
                    final int n6 = l;
                    field233[n6] -= n2;
                }
                final Class60 class76 = class75;
                class76.field931 -= n * 128;
                final Class60 class77 = class75;
                class77.field881 -= n2 * 128;
            }
        }
        int n7 = 0;
        int n8 = 104;
        int n9 = 1;
        if (n < 0) {
            n7 = 103;
            n8 = -1;
            n9 = -1;
        }
        int n10 = 0;
        int n11 = 104;
        int n12 = 1;
        if (n2 < 0) {
            n10 = 103;
            n11 = -1;
            n12 = -1;
        }
        for (int n13 = n7; n8 != n13; n13 += n9) {
            for (int n14 = n10; n14 != n11; n14 += n12) {
                final int n15 = n + n13;
                final int n16 = n14 + n2;
                for (int n17 = 0; n17 < 4; ++n17) {
                    if (n15 >= 0 && n16 >= 0 && n15 < 104 && n16 < 104) {
                        Client.field708[n17][n13][n14] = Client.field708[n17][n15][n16];
                    }
                    else {
                        Client.field708[n17][n13][n14] = null;
                    }
                }
            }
        }
        for (Class62 class78 = (Class62)Client.field714.method4098(); class78 != null; class78 = (Class62)Client.field714.method4079()) {
            final Class62 class79 = class78;
            class79.field857 -= n;
            final Class62 class80 = class78;
            class80.field858 -= n2;
            if (class78.field857 < 0 || class78.field858 < 0 || class78.field857 >= 104 || class78.field858 >= 104) {
                class78.method4064();
            }
        }
        if (Client.field808 != 0) {
            Client.field808 -= n;
            Client.field809 -= n2;
        }
        Client.field656 = 0;
        Client.field822 = false;
        Class109.field1431 -= n << 7;
        Class226.field2563 -= n2 << 7;
        Class109.field1428 -= n << 7;
        Class2.field23 -= n2 << 7;
        Client.field651 = -1;
        Client.field711.method4072();
        Client.field710.method4072();
        for (int n18 = 0; n18 < 4; ++n18) {
            Client.field642[n18].method3392();
        }
    }
    
    @ObfuscatedName("hm")
    @ObfuscatedSignature(signature = "(Lbu;IIBB)V", garbageValue = "-55")
    static final void method1538(final Class60 class60, final int field2043, final int field2044, final byte b) {
        final int n = class60.field922[0];
        final int n2 = class60.field872[0];
        final int method1088 = class60.method1088();
        if (n < method1088 || n >= 104 - method1088 || n2 < method1088 || n2 >= 104 - method1088) {
            return;
        }
        if (field2043 < method1088 || field2043 >= 104 - method1088 || field2044 < method1088 || field2044 >= 104 - method1088) {
            return;
        }
        final int n3 = n;
        final int n4 = n2;
        final int method1089 = class60.method1088();
        Client.field849.field2043 = field2043;
        Client.field849.field2048 = field2044;
        Client.field849.field2042 = 1;
        Client.field849.field2045 = 1;
        final int method1090 = Class112.method2566(n3, n4, method1089, Client.field849, Client.field642[class60.field567], true, Client.field850, Client.field596);
        if (method1090 < 1) {
            return;
        }
        for (int i = 0; i < method1090 - 1; ++i) {
            class60.method1105(Client.field850[i], Client.field596[i], b);
        }
    }
}
