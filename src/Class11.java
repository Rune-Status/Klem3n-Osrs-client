import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("b")
public class Class11
{
    @ObfuscatedName("pl")
    @ObfuscatedGetter(intValue = -1317413597)
    static int field68;
    @ObfuscatedName("c")
    static int[] field69;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Lir;Lir;Lir;S)V", garbageValue = "22982")
    public static void method100(final Class247 field2729, final Class247 field2730, final Class247 field2731, final Class247 field2732) {
        Class230.field2729 = field2729;
        Class230.field2642 = field2730;
        Signlink.field1956 = field2731;
        Class230.field2598 = field2732;
        Class42.field366 = new Class230[Class230.field2729.method4637()][];
        Class175.field2271 = new boolean[Class230.field2729.method4637()];
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1543564143")
    static int method99() {
        return 11;
    }
    
    @ObfuscatedName("gr")
    @ObfuscatedSignature(signature = "(Lbu;ZI)V", garbageValue = "-863688081")
    static void method98(final Class60 class60, final boolean b) {
        if (class60 != null && class60.vmethod1786() && !class60.field566) {
            class60.field560 = false;
            if (((Client.field585 && Class81.field1167 > 50) || Class81.field1167 > 200) && b && class60.field893 == class60.field900) {
                class60.field560 = true;
            }
            final int n = class60.field931 >> 7;
            final int n2 = class60.field881 >> 7;
            if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
                final long method1804 = Class76.method1804(0, 0, 0, false, class60.field574);
                if (class60.field563 != null && Client.field591 >= class60.field545 && Client.field591 < class60.field555) {
                    class60.field560 = false;
                    class60.field562 = Class27.method460(class60.field931, class60.field881, Class13.field82);
                    class60.field889 = Client.field591;
                    Class28.field248.method3010(Class13.field82, class60.field931, class60.field881, class60.field562, 60, class60, class60.field905, method1804, class60.field559, class60.field547, class60.field565, class60.field553);
                }
                else {
                    if ((class60.field931 & 0x7F) == 0x40 && (class60.field881 & 0x7F) == 0x40) {
                        if (Client.field761[n][n2] == Client.field687) {
                            return;
                        }
                        Client.field761[n][n2] = Client.field687;
                    }
                    class60.field562 = Class27.method460(class60.field931, class60.field881, Class13.field82);
                    class60.field889 = Client.field591;
                    Class28.field248.method2883(Class13.field82, class60.field931, class60.field881, class60.field562, 60, class60, class60.field905, method1804, class60.field873);
                }
            }
        }
    }
}
