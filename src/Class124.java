import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dt")
public class Class124 extends Class204
{
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field1708;
    @ObfuscatedName("ba")
    @ObfuscatedGetter(intValue = -1804049311)
    static int field1709;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 28942011)
    int field1704;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1349970051)
    int field1705;
    @ObfuscatedName("s")
    int[] field1706;
    @ObfuscatedName("l")
    int[][] field1707;
    
    Class124(final int field1704, final byte[] array) {
        this.field1704 = field1704;
        final Class182 class182 = new Class182(array);
        this.field1705 = class182.method3544();
        this.field1706 = new int[this.field1705];
        this.field1707 = new int[this.field1705][];
        for (int i = 0; i < this.field1705; ++i) {
            this.field1706[i] = class182.method3544();
        }
        for (int j = 0; j < this.field1705; ++j) {
            this.field1707[j] = new int[class182.method3544()];
        }
        for (int k = 0; k < this.field1705; ++k) {
            for (int l = 0; l < this.field1707[k].length; ++l) {
                this.field1707[k][l] = class182.method3544();
            }
        }
    }
}
