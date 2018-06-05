import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gb")
public class Class187
{
    @ObfuscatedName("ix")
    @ObfuscatedGetter(intValue = -83256289)
    static int field2372;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([BIII)I", garbageValue = "988087011")
    public static int method3812(final byte[] array, final int n, final int n2) {
        int n3 = -1;
        for (int i = n; i < n2; ++i) {
            n3 = (n3 >>> 8 ^ Class182.field2336[(n3 ^ array[i]) & 0xFF]);
        }
        return ~n3;
    }
}
