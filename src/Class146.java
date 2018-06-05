import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("et")
public enum Class146 implements Class188
{
    field1908("runelite", 0, 3, 0), 
    field1910("runelite", 1, 1, 1), 
    field1907("runelite", 2, 2, 2), 
    field1905("runelite", 3, 0, 3);
    
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1737035263)
    public final int field1909;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -999687567)
    final int field1906;
    
    Class146(final String s, final int n, final int field1909, final int field1910) {
        this.field1909 = field1909;
        this.field1906 = field1910;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field1906;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "5")
    public static int method3193(int n) {
        n = (--n | n >>> 1);
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return n + 1;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)Lhi;", garbageValue = "-1708513832")
    public static Class230 method3191(final int n, final int n2) {
        final Class230 method434 = Class26.method434(n);
        if (n2 == -1) {
            return method434;
        }
        if (method434 == null || method434.field2736 == null || n2 >= method434.field2736.length) {
            return null;
        }
        return method434.field2736[n2];
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "0")
    public static void method3190(final Class182 class182, final int n) {
        if (Class155.field1968 != null) {
            try {
                Class155.field1968.method2476(0L);
                Class155.field1968.method2481(class182.payload, n, 24);
            }
            catch (Exception ex) {}
        }
    }
}
