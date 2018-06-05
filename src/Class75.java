import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bf")
public class Class75
{
    @ObfuscatedName("a")
    public static String field1065;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -952252275)
    int field1061;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -229344617)
    int field1066;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1272979127)
    int field1060;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1365690249)
    int field1062;
    @ObfuscatedName("u")
    String field1063;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIIB)I", garbageValue = "51")
    public static int method1802(final int n, final int n2, int n3) {
        n3 &= 0x3;
        if (n3 == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n;
        }
        if (n3 == 2) {
            return 7 - n2;
        }
        return n;
    }
}
