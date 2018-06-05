import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("is")
public enum Class252 implements Class188
{
    field3224("runelite", 0, 2, 0), 
    field3222("runelite", 1, 1, 1), 
    field3221("runelite", 2, 0, 2);
    
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -71275381)
    public final int field3223;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -199100421)
    final int field3225;
    
    Class252(final String s, final int n, final int field3223, final int field3224) {
        this.field3223 = field3223;
        this.field3225 = field3224;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3225;
    }
}
