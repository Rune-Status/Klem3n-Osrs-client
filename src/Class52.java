import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bk")
public class Class52
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lic;")
    final Class249 field469;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 2021923253)
    final int field468;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 2092559043)
    int field467;
    
    Class52(final Class249 field469, final String s) {
        this.field467 = 0;
        this.field469 = field469;
        this.field468 = field469.method4637();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-1326289978")
    boolean method1000() {
        this.field467 = 0;
        for (int i = 0; i < this.field468; ++i) {
            if (!this.field469.method4734(i) || this.field469.method4725(i)) {
                ++this.field467;
            }
        }
        return this.field467 >= this.field468;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(CI)Z", garbageValue = "1142628793")
    public static boolean method1002(final char c) {
        return (c >= ' ' && c <= '~') || (c >= ' ' && c <= '\u00ff') || (c == '\u20ac' || c == '\u0152' || c == '\u2014' || c == '\u0153' || c == '\u0178');
    }
}
