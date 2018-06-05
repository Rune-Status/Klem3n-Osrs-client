import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jd")
public enum Class270 implements Class188
{
    field3484("runelite", 0, 1, 0), 
    field3479("runelite", 1, 0, 1), 
    field3481("runelite", 2, 2, 2);
    
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1528745209)
    public final int field3482;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1338680937)
    final int field3483;
    
    Class270(final String s, final int n, final int field3482, final int field3483) {
        this.field3482 = field3482;
        this.field3483 = field3483;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3483;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Ljq;", garbageValue = "1922127141")
    public static Class271 method5157(final int field3510) {
        final Class271 class271 = (Class271)Class271.field3488.method3989(field3510);
        if (class271 != null) {
            return class271;
        }
        final byte[] method4625 = Class271.field3490.method4625(9, field3510);
        final Class271 class272 = new Class271();
        class272.field3510 = field3510;
        if (method4625 != null) {
            class272.method5186(new Class182(method4625));
        }
        class272.method5159();
        Class271.field3488.method3983(class272, field3510);
        return class272;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;ZZI)V", garbageValue = "-1107846037")
    public static void method5156(final String s, final boolean b, final boolean b2) {
        Class58.method1053(s, b, "openjs", b2);
    }
}
