import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("el")
public class Class148 implements Class147
{
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1540985035)
    public static int field1913;
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "-75")
    static void method3195(final int n, final int n2) {
        final int[] field946 = new int[4];
        final int[] field947 = new int[4];
        field946[0] = n;
        field947[0] = n2;
        int n3 = 1;
        for (int i = 0; i < 4; ++i) {
            if (Class65.field946[i] != n) {
                field946[n3] = Class65.field946[i];
                field947[n3] = Class65.field939[i];
                ++n3;
            }
        }
        Class65.field946 = field946;
        Class65.field939 = field947;
        Class22.method282(Class65.field949, 0, Class65.field949.length - 1, Class65.field946, Class65.field939);
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-557133146")
    public static boolean method3196() {
        try {
            if (Class217.field2460 == 2) {
                if (Class177.field2285 == null) {
                    Class177.field2285 = Class223.method4415(Class138.field1871, Class217.field2461, Class217.field2462);
                    if (Class177.field2285 == null) {
                        return false;
                    }
                }
                if (Class80.field1149 == null) {
                    Class80.field1149 = new Class98(Class217.field2458, Class217.field2464);
                }
                if (Class217.field2459.method4198(Class177.field2285, Class177.field2284, Class80.field1149, 22050)) {
                    Class217.field2459.method4199();
                    Class217.field2459.method4236(Class309.field3740);
                    Class217.field2459.method4267(Class177.field2285, Class217.field2463);
                    Class217.field2460 = 0;
                    Class177.field2285 = null;
                    Class80.field1149 = null;
                    Class138.field1871 = null;
                    return true;
                }
            }
        }
        catch (Exception ex) {
            ex.printStackTrace();
            Class217.field2459.method4202();
            Class217.field2460 = 0;
            Class177.field2285 = null;
            Class80.field1149 = null;
            Class138.field1871 = null;
        }
        return false;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "-2017324363")
    public static boolean method3197(final int n) {
        return (n >> 31 & 0x1) != 0x0;
    }
    
    @ObfuscatedName("gt")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    static void method3198() {
        if (Class138.field1876.field931 >> 7 == Client.field808 && Class138.field1876.field881 >> 7 == Client.field809) {
            Client.field808 = 0;
        }
    }
}
