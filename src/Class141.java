import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ea")
public class Class141 extends Class283
{
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 325680983)
    static int field1885;
    @ObfuscatedName("ku")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field1888;
    @ObfuscatedName("z")
    final boolean field1886;
    
    public Class141(final boolean field1886) {
        this.field1886 = field1886;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "-2110971659")
    int method3153(final Class287 class287, final Class287 class288) {
        if (class287.field3628 != 0 && class288.field3628 != 0) {
            return this.field1886 ? (class287.field3627 - class288.field3627) : (class288.field3627 - class287.field3627);
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3153((Class287)o, (Class287)o2);
    }
}
