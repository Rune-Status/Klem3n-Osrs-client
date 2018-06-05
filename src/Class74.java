import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bw")
public class Class74
{
    @ObfuscatedName("hh")
    @ObfuscatedSignature(signature = "(Lbl;B)V", garbageValue = "7")
    static final void method1800(final Class62 class62) {
        long n = 0L;
        int method673 = -1;
        int field866 = 0;
        int field867 = 0;
        if (class62.field856 == 0) {
            n = Class28.field248.method2898(class62.field861, class62.field857, class62.field858);
        }
        if (class62.field856 == 1) {
            n = Class28.field248.method2899(class62.field861, class62.field857, class62.field858);
        }
        if (class62.field856 == 2) {
            n = Class28.field248.method2900(class62.field861, class62.field857, class62.field858);
        }
        if (class62.field856 == 3) {
            n = Class28.field248.method2901(class62.field861, class62.field857, class62.field858);
        }
        if (0L != n) {
            final int method674 = Class28.field248.method2902(class62.field861, class62.field857, class62.field858, n);
            method673 = Class39.method673(n);
            field866 = (method674 & 0x1F);
            field867 = (method674 >> 6 & 0x3);
        }
        class62.field859 = method673;
        class62.field866 = field866;
        class62.field865 = field867;
    }
}
