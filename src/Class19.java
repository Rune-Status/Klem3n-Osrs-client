import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("y")
public class Class19
{
    @ObfuscatedName("qi")
    @ObfuscatedSignature(signature = "Lw;")
    static Class1 field154;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -746355455)
    static int field152;
    @ObfuscatedName("k")
    static byte[][][] field159;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -628993611)
    final int field158;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 982920549)
    final int field155;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 454780769)
    final int field157;
    
    Class19(final int field158, final int field159, final int field160) {
        this.field158 = field158;
        this.field155 = field159;
        this.field157 = field160;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(II)Lew;", garbageValue = "-838426399")
    static Class130 method198(final int n) {
        final Class130 class130 = (Class130)Class273.field3539.method3989(n);
        if (class130 != null) {
            return class130;
        }
        final Class247 field3536 = Class273.field3536;
        final Class247 field3537 = Class273.field3537;
        boolean b = true;
        final int[] method4668 = field3536.method4668(n);
        for (int i = 0; i < method4668.length; ++i) {
            final byte[] method4669 = field3536.method4676(n, method4668[i]);
            if (method4669 == null) {
                b = false;
            }
            else if (field3537.method4676((method4669[0] & 0xFF) << 8 | (method4669[1] & 0xFF), 0) == null) {
                b = false;
            }
        }
        Class130 class131;
        if (!b) {
            class131 = null;
        }
        else {
            try {
                class131 = new Class130(field3536, field3537, n, false);
            }
            catch (Exception ex) {
                class131 = null;
            }
        }
        final Class130 class132 = class131;
        if (class132 != null) {
            Class273.field3539.method3983(class132, n);
        }
        return class132;
    }
    
    @ObfuscatedName("kx")
    @ObfuscatedSignature(signature = "(IIIZI)V", garbageValue = "-185686221")
    public static void method197(final int n, final int n2, final int n3, final boolean b) {
        final Class172 method433 = Class26.method433(Class169.field2156, Client.field626.field1218);
        method433.field2257.method3575(n3);
        method433.field2257.method3594(b ? Client.field853 : 0);
        method433.field2257.method3583(n2);
        method433.field2257.method3771(n);
        Client.field626.method1980(method433);
    }
}
