import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bc")
public class Class67
{
    @ObfuscatedName("ag")
    @ObfuscatedGetter(intValue = 973416531)
    static int field978;
    @ObfuscatedName("fu")
    static int[][] field973;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Llm;")
    final Class322 field974;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lkf;")
    public final Class290 field970;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lje;")
    public final Class284 field975;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1943530059)
    int field976;
    
    Class67(final Class322 field974) {
        this.field976 = 0;
        this.field974 = field974;
        this.field970 = new Class290(field974);
        this.field975 = new Class284(field974);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2083457181")
    boolean method1624() {
        return this.field976 == 2;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1458971090")
    final void method1625() {
        this.field976 = 1;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-2029618051")
    final void method1679(final Class182 class182, final int n) {
        this.field970.method5424(class182, n);
        this.field976 = 2;
        Class53.method1012();
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "916911588")
    final void method1627() {
        for (Class294 class294 = (Class294)this.field970.field3639.method4111(); class294 != null; class294 = (Class294)this.field970.field3639.method4114()) {
            if (class294.field3665 < Class182.method3547() / 1000L - 5L) {
                if (class294.field3664 > 0) {
                    Class143.method3172(5, "", class294.field3662 + " has logged in.");
                }
                if (class294.field3664 == 0) {
                    Class143.method3172(5, "", class294.field3662 + " has logged out.");
                }
                class294.method4121();
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-746063861")
    final void method1628() {
        this.field976 = 0;
        this.field970.method5326();
        this.field975.method5326();
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lkm;ZI)Z", garbageValue = "-1961233435")
    final boolean method1660(final Class291 class291, final boolean b) {
        return class291 != null && (class291.equals(Class138.field1876.field552) || this.field970.method5423(class291, b));
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Lkm;I)Z", garbageValue = "-1614375319")
    final boolean method1630(final Class291 class291) {
        return class291 != null && this.field975.method5329(class291);
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;B)V", garbageValue = "25")
    final void method1631(final String s) {
        if (s == null) {
            return;
        }
        final Class291 class291 = new Class291(s, this.field974);
        if (!class291.method5441()) {
            return;
        }
        if (this.method1632()) {
            Class143.method3172(30, "", "Your friend list is full. Max of 200 for free users, and 400 for members");
            return;
        }
        if (Class138.field1876.field552.equals(class291)) {
            Class143.method3172(30, "", "You can't add yourself to your own friend list");
            return;
        }
        if (this.method1660(class291, false)) {
            Class233.method4588(s);
            return;
        }
        if (this.method1630(class291)) {
            Class51.method995(s);
            return;
        }
        final Class172 method433 = Class26.method433(Class169.field2194, Client.field626.field1218);
        method433.field2257.method3532(Class316.method5820(s));
        method433.field2257.method3699(s);
        Client.field626.method1980(method433);
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1546113149")
    final boolean method1632() {
        return this.field970.method5328() || (this.field970.method5327() >= 200 && Client.field698 != 1);
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;B)V", garbageValue = "1")
    final void method1633(final String s) {
        if (s == null) {
            return;
        }
        final Class291 class291 = new Class291(s, this.field974);
        if (!class291.method5441()) {
            return;
        }
        if (this.method1634()) {
            Class28.method475();
            return;
        }
        if (Class138.field1876.field552.equals(class291)) {
            Class143.method3172(30, "", "You can't add yourself to your own ignore list");
            return;
        }
        if (this.method1630(class291)) {
            Class21.method271(s);
            return;
        }
        if (this.method1660(class291, false)) {
            Class143.method3172(30, "", "Please remove " + s + " from your friend list first");
            return;
        }
        final Class172 method433 = Class26.method433(Class169.field2221, Client.field626.field1218);
        method433.field2257.method3532(Class316.method5820(s));
        method433.field2257.method3699(s);
        Client.field626.method1980(method433);
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(S)Z", garbageValue = "128")
    final boolean method1634() {
        return this.field975.method5328() || (this.field975.method5327() >= 100 && Client.field698 != 1);
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-434645488")
    final void method1665(final String s) {
        if (s == null) {
            return;
        }
        final Class291 class291 = new Class291(s, this.field974);
        if (!class291.method5441()) {
            return;
        }
        if (this.field970.method5393(class291)) {
            Client.field647 = Client.field801;
            final Class172 method433 = Class26.method433(Class169.field2203, Client.field626.field1218);
            method433.field2257.method3532(Class316.method5820(s));
            method433.field2257.method3699(s);
            Client.field626.method1980(method433);
        }
        Class53.method1012();
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-636186966")
    final void method1636(final String s) {
        if (s == null) {
            return;
        }
        final Class291 class291 = new Class291(s, this.field974);
        if (!class291.method5441()) {
            return;
        }
        if (this.field975.method5393(class291)) {
            Client.field647 = Client.field801;
            final Class172 method433 = Class26.method433(Class169.field2157, Client.field626.field1218);
            method433.field2257.method3532(Class316.method5820(s));
            method433.field2257.method3699(s);
            Client.field626.method1980(method433);
        }
        Class47.method910();
        if (Class14.field94 != null) {
            Class14.field94.method5468();
        }
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(Lkm;I)Z", garbageValue = "1644898931")
    final boolean method1637(final Class291 class291) {
        final Class292 class292 = (Class292)this.field970.method5330(class291);
        return class292 != null && class292.method5415();
    }
    
    @ObfuscatedName("z")
    public static boolean method1683(final long n) {
        boolean b = n != 0L;
        if (b) {
            b = ((int)(n >>> 16 & 0x1L) != 1);
        }
        return b;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgu;IIS)I", garbageValue = "-17706")
    static int method1668(final Class197 class197, final int n, final int n2) {
        if (class197 == null) {
            return n2;
        }
        final Class211 class198 = (Class211)class197.method3945(n);
        if (class198 == null) {
            return n2;
        }
        return class198.field2438;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "1734020068")
    public static void method1685(final int n, int n2) {
        final Class263 class263 = (Class263)Class263.field3321.method3989(n);
        Class263 class264;
        if (class263 != null) {
            class264 = class263;
        }
        else {
            final byte[] method4625 = Class263.field3322.method4625(14, n);
            final Class263 class265 = new Class263();
            if (method4625 != null) {
                class265.method4941(new Class182(method4625));
            }
            Class263.field3321.method3983(class265, n);
            class264 = class265;
        }
        final Class263 class266 = class264;
        final int field3320 = class266.field3320;
        final int field3321 = class266.field3323;
        final int n3 = Class225.field2557[class266.field3326 - field3321];
        if (n2 < 0 || n2 > n3) {
            n2 = 0;
        }
        final int n4 = n3 << field3321;
        Class225.field2558[field3320] = ((Class225.field2558[field3320] & ~n4) | (n2 << field3321 & n4));
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(Lly;B)V", garbageValue = "-7")
    static final void method1682(final Class317 class317) {
        final int n = 256;
        for (int i = 0; i < Class186.field2367.length; ++i) {
            Class186.field2367[i] = 0;
        }
        for (int j = 0; j < 5000; ++j) {
            Class186.field2367[(int)(Math.random() * 128.0 * n)] = (int)(Math.random() * 256.0);
        }
        for (int k = 0; k < 20; ++k) {
            for (int l = 1; l < n - 1; ++l) {
                for (int n2 = 1; n2 < 127; ++n2) {
                    final int n3 = n2 + (l << 7);
                    Class81.field1169[n3] = (Class186.field2367[n3 - 128] + Class186.field2367[n3 + 1] + Class186.field2367[n3 + 128] + Class186.field2367[n3 - 1]) / 4;
                }
            }
            final int[] field2367 = Class186.field2367;
            Class186.field2367 = Class81.field1169;
            Class81.field1169 = field2367;
        }
        if (class317 != null) {
            int n4 = 0;
            for (int n5 = 0; n5 < class317.field3781; ++n5) {
                for (int n6 = 0; n6 < class317.field3780; ++n6) {
                    if (class317.field3785[n4++] != 0) {
                        Class186.field2367[n6 + class317.field3782 + 16 + (n5 + class317.field3778 + 16 << 7)] = 0;
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("gc")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1786186478")
    static void method1655() {
        final int field1167 = Class81.field1167;
        final int[] field1168 = Class81.field1159;
        for (int i = 0; i < field1167; ++i) {
            if (field1168[i] != Client.field707 && field1168[i] != Client.field628) {
                Class11.method98(Client.field610[field1168[i]], true);
            }
        }
    }
}
