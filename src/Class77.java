import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bm")
public enum Class77 implements Class188
{
    field1080("runelite", 0, 0), 
    field1075("runelite", 1, 1), 
    field1076("runelite", 2, 2), 
    field1074("runelite", 3, 3);
    
    @ObfuscatedName("j")
    static int[] field1077;
    @ObfuscatedName("cx")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field1079;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 58517799)
    final int field1078;
    
    Class77(final String s, final int n, final int field1078) {
        this.field1078 = field1078;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field1078;
    }
}
