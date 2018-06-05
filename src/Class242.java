import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iz")
public enum Class242 implements Class188
{
    field3125("runelite", 0, 0, -1, true, false, true), 
    field3119("runelite", 1, 1, 0, true, true, true), 
    field3121("runelite", 2, 2, 1, true, true, false), 
    field3120("runelite", 3, 3, 2, false, false, true), 
    field3122("runelite", 4, 4, 3, false, false, true), 
    field3118("runelite", 5, 5, 10, false, false, true);
    
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -609392397)
    final int field3124;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1058981555)
    public final int field3128;
    @ObfuscatedName("x")
    public final boolean field3126;
    @ObfuscatedName("e")
    public final boolean field3127;
    
    Class242(final String s, final int n, final int field3124, final int field3125, final boolean b, final boolean field3126, final boolean field3127) {
        this.field3124 = field3124;
        this.field3128 = field3125;
        this.field3126 = field3126;
        this.field3127 = field3127;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3124;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1507833078")
    public static void method4605() {
        if (Class250.field3200 != null) {
            Class250.field3200.vmethod3346();
        }
    }
}
