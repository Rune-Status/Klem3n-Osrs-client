import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dz")
public class Class106
{
    @ObfuscatedName("z")
    int field1388;
    @ObfuscatedName("w")
    int field1387;
    @ObfuscatedName("s")
    int[] field1389;
    @ObfuscatedName("l")
    int[] field1386;
    
    Class106() {
        Class92.method2108(16);
        this.field1388 = ((Class92.method2093() != 0) ? (Class92.method2108(4) + 1) : 1);
        if (Class92.method2093() != 0) {
            Class92.method2108(8);
        }
        Class92.method2108(2);
        if (this.field1388 > 1) {
            this.field1387 = Class92.method2108(4);
        }
        this.field1389 = new int[this.field1388];
        this.field1386 = new int[this.field1388];
        for (int i = 0; i < this.field1388; ++i) {
            Class92.method2108(8);
            this.field1389[i] = Class92.method2108(8);
            this.field1386[i] = Class92.method2108(8);
        }
    }
}
