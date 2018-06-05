import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("eb")
public class Class145 extends Class283
{
    @ObfuscatedName("z")
    final boolean field1903;
    
    public Class145(final boolean field1903) {
        this.field1903 = field1903;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "2025986991")
    int method3182(final Class287 class287, final Class287 class288) {
        if (class287.field3628 != 0 && class288.field3628 != 0) {
            return this.field1903 ? class287.method5287().method5435(class288.method5287()) : class288.method5287().method5435(class287.method5287());
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3182((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "763302428")
    public static boolean method3188(final int n) {
        return (n >> 30 & 0x1) != 0x0;
    }
}
