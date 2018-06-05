import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fh")
public class Class165
{
    @ObfuscatedName("s")
    static int[][] field2035;
    @ObfuscatedName("l")
    static int[][] field2041;
    @ObfuscatedName("u")
    static byte[][][] field2033;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 294749139)
    static int field2037;
    @ObfuscatedName("i")
    static int[] field2039;
    @ObfuscatedName("x")
    static int[] field2038;
    
    static {
        Class165.field2035 = new int[128][128];
        Class165.field2041 = new int[128][128];
        Class165.field2039 = new int[4096];
        Class165.field2038 = new int[4096];
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2015697461")
    static final boolean method3437() {
        return Class120.field1650;
    }
}
