import java.net.URI;
import java.awt.Desktop;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bh")
public class Class58 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -216410853)
    int field540;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 279680387)
    int field535;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1058139231)
    int field532;
    @ObfuscatedName("l")
    String field531;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lkm;")
    Class291 field534;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field539;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field536;
    @ObfuscatedName("i")
    String field537;
    @ObfuscatedName("x")
    String field533;
    
    Class58(final int field532, final String field533, final String field534, final String field535) {
        this.field539 = Class289.field3633;
        this.field536 = Class289.field3633;
        this.field540 = ++Class83.field1186 - 1;
        this.field535 = Client.field591;
        this.field532 = field532;
        this.field531 = field533;
        this.method1044();
        this.field537 = field534;
        this.field533 = field535;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V", garbageValue = "27")
    void method1070(final int field532, final String field533, final String field534, final String field535) {
        this.field540 = ++Class83.field1186 - 1;
        this.field535 = Client.field591;
        this.field532 = field532;
        this.field531 = field533;
        this.method1044();
        this.field537 = field534;
        this.field533 = field535;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1016035319")
    void method1048() {
        this.field539 = Class289.field3633;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1033770680")
    final boolean method1040() {
        if (this.field539 == Class289.field3633) {
            this.method1041();
        }
        return this.field539 == Class289.field3631;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1665152249")
    void method1041() {
        this.field539 = (Class181.field2332.field970.method5329(this.field534) ? Class289.field3631 : Class289.field3634);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "725816073")
    void method1042() {
        this.field536 = Class289.field3633;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1678594295")
    final boolean method1043() {
        if (this.field536 == Class289.field3633) {
            this.method1061();
        }
        return this.field536 == Class289.field3631;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2118903561")
    void method1061() {
        this.field536 = (Class181.field2332.field975.method5329(this.field534) ? Class289.field3631 : Class289.field3634);
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2077717645")
    final void method1044() {
        if (this.field531 != null) {
            this.field534 = new Class291(Class139.method3138(this.field531), Class36.field306);
        }
        else {
            this.field534 = null;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;I)V", garbageValue = "-1743479306")
    public static void method1069(final Class247 field3283) {
        Class259.field3283 = field3283;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lir;Lir;III)Lkj;", garbageValue = "-2132588897")
    public static Class298 method1058(final Class247 class247, final Class247 class248, final int n, final int n2) {
        if (!Class306.method5660(class247, n, n2)) {
            return null;
        }
        final byte[] method4625 = class248.method4625(n, n2);
        Class298 class249;
        if (method4625 == null) {
            class249 = null;
        }
        else {
            final Class298 class250 = new Class298(method4625, Class7.field45, Class225.field2562, Class319.field3800, Class319.field3799, Class172.field2260, Class319.field3801);
            Class7.field45 = null;
            Class225.field2562 = null;
            Class319.field3800 = null;
            Class319.field3799 = null;
            Class172.field2260 = null;
            Class319.field3801 = null;
            class249 = class250;
        }
        return class249;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;ZLjava/lang/String;ZB)V", garbageValue = "15")
    static void method1053(final String s, final boolean b, final String s2, final boolean b2) {
        if (b) {
            if (!b2 && Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    Desktop.getDesktop().browse(new URI(s));
                    return;
                }
                catch (Exception ex) {}
            }
            if (Class45.field379.startsWith("win") && !b2) {
                Class128.method3071(s, 0);
                return;
            }
            if (Class45.field379.startsWith("mac")) {
                Class13.method112(s, 1, s2);
                return;
            }
            Class128.method3071(s, 2);
        }
        else {
            Class128.method3071(s, 3);
        }
    }
    
    @ObfuscatedName("gm")
    @ObfuscatedSignature(signature = "(Lba;IB)V", garbageValue = "-9")
    static final void method1068(final Class63 class63, final int n) {
        Class238.method4594(class63.field931, class63.field881, n);
    }
}
