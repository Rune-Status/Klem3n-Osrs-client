import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("eg")
public class Class144 extends Class283
{
    @ObfuscatedName("z")
    final boolean field1902;
    
    public Class144(final boolean field1902) {
        this.field1902 = field1902;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;B)I", garbageValue = "66")
    int method3175(final Class287 class287, final Class287 class288) {
        if (class288.field3629 != class287.field3629) {
            return this.field1902 ? (class287.field3629 - class288.field3629) : (class288.field3629 - class287.field3629);
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3175((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Lir;B)V", garbageValue = "15")
    public static void method3181(final Class247 field3304, final Class247 field3305) {
        Class261.field3304 = field3304;
        Class261.field3314 = field3305;
    }
}
