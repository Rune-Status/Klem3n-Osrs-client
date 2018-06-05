import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gp")
public class Class184
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(longValue = -7929231222859405373L)
    static long field2351;
    @ObfuscatedName("w")
    @ObfuscatedGetter(longValue = 2010951404606687319L)
    static long field2350;
    
    @ObfuscatedName("hy")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "805819777")
    static void method3785(final int n, final int n2) {
        int method5517 = Class293.field3660.method5517("Choose Option");
        for (int i = 0; i < Client.field771; ++i) {
            final int method5518 = Class293.field3660.method5517(Class18.method176(i));
            if (method5518 > method5517) {
                method5517 = method5518;
            }
        }
        method5517 += 8;
        final int n3 = Client.field771 * 15 + 22;
        int field435 = n - method5517 / 2;
        if (method5517 + field435 > Class82.field1179) {
            field435 = Class82.field1179 - method5517;
        }
        if (field435 < 0) {
            field435 = 0;
        }
        int field436 = n2;
        if (field436 + n3 > Class243.field3138) {
            field436 = Class243.field3138 - n3;
        }
        if (field436 < 0) {
            field436 = 0;
        }
        Class48.field435 = field435;
        Class0.field1 = field436;
        Class135.field1856 = method5517;
        Class151.field1933 = Client.field771 * 15 + 22;
    }
}
