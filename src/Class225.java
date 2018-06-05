import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hy")
public class Class225
{
    @ObfuscatedName("z")
    static int[] field2557;
    @ObfuscatedName("w")
    public static int[] field2559;
    @ObfuscatedName("s")
    public static int[] field2558;
    @ObfuscatedName("u")
    static int[] field2562;
    @ObfuscatedName("eo")
    @ObfuscatedSignature(signature = "Lee;")
    static Class153 field2556;
    
    static {
        Class225.field2557 = new int[32];
        int n = 2;
        for (int i = 0; i < 32; ++i) {
            Class225.field2557[i] = n - 1;
            n += n;
        }
        Class225.field2559 = new int[2000];
        Class225.field2558 = new int[2000];
    }
}
