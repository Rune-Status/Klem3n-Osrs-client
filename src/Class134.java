import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ek")
public final class Class134
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Ldf;")
    public Class127 field1844;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1650174027)
    int field1841;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 220137999)
    int field1837;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -461194739)
    int field1838;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1049351685)
    int field1839;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 2137493405)
    int field1845;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1953890163)
    int field1842;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1165658199)
    int field1843;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -902758735)
    int field1840;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 949196043)
    int field1850;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1947694915)
    int field1846;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 1135945905)
    int field1847;
    @ObfuscatedName("n")
    @ObfuscatedGetter(longValue = -7950024877031331151L)
    public long field1848;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -2116359181)
    int field1849;
    
    Class134() {
        this.field1848 = 0L;
        this.field1849 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIB)Lce;", garbageValue = "-10")
    static Class84 method3104(final int n, final int n2) {
        final Class84 class84 = (Class84)Class84.field1190.method3989(n << 16);
        if (class84 != null) {
            return class84;
        }
        final int method4642 = Client.field854.method4642(String.valueOf(n));
        if (method4642 == -1) {
            return null;
        }
        final byte[] method4643 = Client.field854.method4689(method4642);
        if (method4643 != null) {
            if (method4643.length <= 1) {
                return null;
            }
            final Class84 method4644 = Class10.method97(method4643);
            if (method4644 != null) {
                Class84.field1190.method3983(method4644, n << 16);
                return method4644;
            }
        }
        return null;
    }
    
    @ObfuscatedName("fb")
    @ObfuscatedSignature(signature = "(Lbu;III)V", garbageValue = "-1928445443")
    static void method3102(final Class60 class60, final int field903, final int n) {
        if (class60.field903 == field903 && field903 != -1) {
            final int field904 = Class3.method25(field903).field3553;
            if (field904 == 1) {
                class60.field904 = 0;
                class60.field901 = 0;
                class60.field906 = n;
                class60.field907 = 0;
            }
            if (field904 == 2) {
                class60.field907 = 0;
            }
        }
        else if (field903 == -1 || class60.field903 == -1 || Class3.method25(field903).field3547 >= Class3.method25(class60.field903).field3547) {
            class60.field903 = field903;
            class60.field904 = 0;
            class60.field901 = 0;
            class60.field906 = n;
            class60.field907 = 0;
            class60.field930 = class60.field909;
        }
    }
    
    @ObfuscatedName("ih")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "176398255")
    static final void method3103() {
        int i = 0;
        while (i == 0) {
            i = 1;
            for (int j = 0; j < Client.field771 - 1; ++j) {
                if (Client.field720[j] < 1000 && Client.field720[j + 1] > 1000) {
                    final String s = Client.field740[j];
                    Client.field740[j] = Client.field740[j + 1];
                    Client.field740[j + 1] = s;
                    final String s2 = Client.field735[j];
                    Client.field735[j] = Client.field735[j + 1];
                    Client.field735[j + 1] = s2;
                    final int n = Client.field720[j];
                    Client.field720[j] = Client.field720[j + 1];
                    Client.field720[j + 1] = n;
                    final int n2 = Client.field718[j];
                    Client.field718[j] = Client.field718[j + 1];
                    Client.field718[j + 1] = n2;
                    final int n3 = Client.field851[j];
                    Client.field851[j] = Client.field851[j + 1];
                    Client.field851[j + 1] = n3;
                    final int n4 = Client.field794[j];
                    Client.field794[j] = Client.field794[j + 1];
                    Client.field794[j + 1] = n4;
                    final boolean b = Client.field590[j];
                    Client.field590[j] = Client.field590[j + 1];
                    Client.field590[j + 1] = b;
                    i = 0;
                }
            }
        }
    }
}
