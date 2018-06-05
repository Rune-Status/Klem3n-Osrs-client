import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import java.lang.management.GarbageCollectorMXBean;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dw")
public class Class121
{
    @ObfuscatedName("ad")
    static GarbageCollectorMXBean field1660;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -2066832217)
    int field1666;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -917159191)
    int field1665;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1983063125)
    int field1661;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -397804509)
    int field1662;
    
    Class121() {
    }
    
    Class121(final Class121 class121) {
        this.field1665 = class121.field1665;
        this.field1661 = class121.field1661;
        this.field1662 = class121.field1662;
        this.field1666 = class121.field1666;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "32")
    static void method2782(final int n) {
        final Class53 class53 = (Class53)Class53.field474.method4020(n);
        if (class53 == null) {
            return;
        }
        for (int i = 0; i < class53.field477.length; ++i) {
            class53.field477[i] = -1;
            class53.field473[i] = 0;
        }
    }
    
    @ObfuscatedName("jv")
    @ObfuscatedSignature(signature = "(IIIILll;Lhv;I)V", garbageValue = "606939264")
    static final void method2783(final int n, final int n2, final int n3, final int n4, final Class318 class318, final Class224 class319) {
        final int n5 = n4 * n4 + n3 * n3;
        if (n5 > 4225 && n5 < 90000) {
            final int n6 = Client.field717 & 0x7FF;
            final int n7 = Class122.field1681[n6];
            final int n8 = Class122.field1693[n6];
            final double atan2 = Math.atan2(n8 * n3 + n4 * n7 >> 16, n4 * n8 - n7 * n3 >> 16);
            final int n9 = class319.field2553 / 2 - 25;
            final int n10 = (int)(Math.sin(atan2) * n9);
            final int n11 = (int)(Math.cos(atan2) * n9);
            final int n12 = 20;
            Class136.field1862.method5865(n10 + (n + class319.field2553 / 2 - n12 / 2), class319.field2549 / 2 + n2 - n12 / 2 - n11 - 10, n12, n12, 15, 15, atan2, 256);
        }
        else {
            Class55.method1022(n, n2, n3, n4, class318, class319);
        }
    }
}
