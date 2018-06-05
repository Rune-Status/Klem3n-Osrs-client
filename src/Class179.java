import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fs")
public class Class179
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Lid;", garbageValue = "909001219")
    public static Class243 method3517(final int n) {
        final Class243[] array = { Class243.field3132, Class243.field3136, Class243.field3131, Class243.field3134 };
        for (int i = 0; i < array.length; ++i) {
            final Class243 class243 = array[i];
            if (n == class243.field3133) {
                return class243;
            }
        }
        return null;
    }
}
