import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("i")
final class Class7 implements Comparator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field42;
    @ObfuscatedName("l")
    static int[] field45;
    @ObfuscatedName("gs")
    @ObfuscatedGetter(intValue = -567041405)
    static int field41;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;I)I", garbageValue = "-657628450")
    int method76(final Class2 class2, final Class2 class3) {
        return (class2.field20 < class3.field20) ? -1 : ((class3.field20 == class2.field20) ? 0 : 1);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method76((Class2)o, (Class2)o2);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IS)Z", garbageValue = "24612")
    public static boolean method83(final int n) {
        return (n >> 28 & 0x1) != 0x0;
    }
}
