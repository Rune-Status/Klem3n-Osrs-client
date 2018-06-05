import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("li")
public enum Class316 implements Class188
{
    field3775("runelite", 0, 0, 0), 
    field3771("runelite", 1, 1, 1), 
    field3772("runelite", 2, 2, 2), 
    field3773("runelite", 3, 3, 3), 
    field3774("runelite", 4, 4, 4);
    
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1008174629)
    public final int field3776;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1612299179)
    final int field3770;
    
    Class316(final String s, final int n, final int field3776, final int field3777) {
        this.field3776 = field3776;
        this.field3770 = field3777;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3770;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;S)I", garbageValue = "256")
    public static int method5820(final String s) {
        return s.length() + 1;
    }
}
