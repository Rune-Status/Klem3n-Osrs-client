import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ds")
public class Class120
{
    @ObfuscatedName("z")
    public static boolean field1650;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -2004293301)
    static int field1648;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1960982477)
    static int field1649;
    @ObfuscatedName("l")
    static boolean field1652;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1347288675)
    static int field1657;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2010243593)
    static int field1659;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1154137323)
    static int field1651;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -160115827)
    static int field1654;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1132219127)
    static int field1655;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 127802141)
    public static int field1656;
    @ObfuscatedName("g")
    public static long[] field1647;
    
    static {
        Class120.field1650 = false;
        Class120.field1648 = 0;
        Class120.field1649 = 0;
        Class120.field1652 = false;
        Class120.field1656 = 0;
        Class120.field1647 = new long[1000];
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIZIZB)V", garbageValue = "40")
    static void method2781(final int n, final int n2, final int n3, final boolean b, final int n4, final boolean b2) {
        if (n < n2) {
            final int n5 = (n + n2) / 2;
            int n6 = n;
            final Class65 class65 = Class65.field949[n5];
            Class65.field949[n5] = Class65.field949[n2];
            Class65.field949[n2] = class65;
            for (int i = n; i < n2; ++i) {
                if (Class109.method2503(Class65.field949[i], class65, n3, b, n4, b2) <= 0) {
                    final Class65 class66 = Class65.field949[i];
                    Class65.field949[i] = Class65.field949[n6];
                    Class65.field949[n6++] = class66;
                }
            }
            Class65.field949[n2] = Class65.field949[n6];
            Class65.field949[n6] = class65;
            method2781(n, n6 - 1, n3, b, n4, b2);
            method2781(n6 + 1, n2, n3, b, n4, b2);
        }
    }
}
