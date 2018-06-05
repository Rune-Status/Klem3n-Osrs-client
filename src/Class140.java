import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ex")
public class Class140 extends Class283
{
    @ObfuscatedName("z")
    final boolean field1883;
    
    public Class140(final boolean field1883) {
        this.field1883 = field1883;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "-359404132")
    int method3147(final Class287 class287, final Class287 class288) {
        if (Client.field581 == class287.field3628 && class288.field3628 == Client.field581) {
            return this.field1883 ? (class287.field3627 - class288.field3627) : (class288.field3627 - class287.field3627);
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3147((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "-1")
    public static boolean method3150(final int n) {
        return (n >> 29 & 0x1) != 0x0;
    }
}
