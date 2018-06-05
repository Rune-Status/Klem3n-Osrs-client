import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ep")
public class Class138 extends Class283
{
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field1871;
    @ObfuscatedName("ii")
    @ObfuscatedSignature(signature = "Lbu;")
    static Class60 field1876;
    @ObfuscatedName("z")
    final boolean field1872;
    
    public Class138(final boolean field1872) {
        this.field1872 = field1872;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;I)I", garbageValue = "-1072609889")
    int method3128(final Class287 class287, final Class287 class288) {
        if (Client.field581 == class287.field3628 && class288.field3628 == Client.field581) {
            return this.field1872 ? class287.method5287().method5435(class288.method5287()) : class288.method5287().method5435(class287.method5287());
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3128((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;IB)I", garbageValue = "-22")
    public static int method3137(final CharSequence charSequence, final int n) {
        return Class68.method1693(charSequence, n, true);
    }
}
