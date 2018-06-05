import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gg")
public class Class183
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -1482189207)
    static int field2344;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -2077994379)
    static int field2346;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 298568903)
    static int field2342;
    @ObfuscatedName("l")
    static byte[][] field2340;
    @ObfuscatedName("u")
    static byte[][] field2343;
    @ObfuscatedName("q")
    static byte[][] field2345;
    @ObfuscatedName("k")
    static int[] field2348;
    @ObfuscatedName("i")
    static int[] field2347;
    @ObfuscatedName("x")
    static byte[][][] field2341;
    
    static {
        Class183.field2344 = 0;
        Class183.field2346 = 0;
        Class183.field2342 = 0;
        Class183.field2340 = new byte[1000][];
        Class183.field2343 = new byte[250][];
        Class183.field2345 = new byte[50][];
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IZI)[B", garbageValue = "-2010983682")
    static synchronized byte[] method3773(final int n, final boolean b) {
        if (n != 100) {
            if (n < 100) {}
        }
        else if (Class183.field2344 > 0) {
            final byte[] array = Class183.field2340[--Class183.field2344];
            Class183.field2340[Class183.field2344] = null;
            return array;
        }
        if (n != 5000) {
            if (n < 5000) {}
        }
        else if (Class183.field2346 > 0) {
            final byte[] array2 = Class183.field2343[--Class183.field2346];
            Class183.field2343[Class183.field2346] = null;
            return array2;
        }
        if (n != 30000) {
            if (n < 30000) {}
        }
        else if (Class183.field2342 > 0) {
            final byte[] array3 = Class183.field2345[--Class183.field2342];
            Class183.field2345[Class183.field2342] = null;
            return array3;
        }
        if (Class183.field2341 != null) {
            for (int i = 0; i < Class183.field2348.length; ++i) {
                if (Class183.field2348[i] != n) {
                    if (n < Class183.field2348[i]) {}
                }
                else if (Class183.field2347[i] > 0) {
                    final byte[][] array4 = Class183.field2341[i];
                    final int[] field2347 = Class183.field2347;
                    final int n2 = i;
                    final int n3 = field2347[n2] - 1;
                    field2347[n2] = n3;
                    final byte[] array5 = array4[n3];
                    Class183.field2341[i][Class183.field2347[i]] = null;
                    return array5;
                }
            }
        }
        return new byte[n];
    }
}
