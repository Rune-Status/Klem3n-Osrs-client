import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("eo")
public final class Class133
{
    @ObfuscatedName("pv")
    @ObfuscatedGetter(intValue = -470021269)
    static int field1834;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 855735479)
    int field1826;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -2145900331)
    int field1832;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -568631363)
    int field1828;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -970601677)
    int field1825;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 409489705)
    int field1827;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -995153033)
    int field1830;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1452216279)
    int field1829;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Ldf;")
    public Class127 field1823;
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "Ldf;")
    public Class127 field1831;
    @ObfuscatedName("e")
    @ObfuscatedGetter(longValue = -9170110495421091263L)
    public long field1824;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1910323591)
    int field1833;
    
    Class133() {
        this.field1824 = 0L;
        this.field1833 = 0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Lce;", garbageValue = "-1297454162")
    static Class84 method3099(final int n) {
        final Class84 class84 = (Class84)Class84.field1190.method3989(n);
        if (class84 != null) {
            return class84;
        }
        final byte[] method4625 = Client.field854.method4625(n, 0);
        if (method4625 == null) {
            return null;
        }
        final Class84 method4626 = Class10.method97(method4625);
        Class84.field1190.method3983(method4626, n);
        return method4626;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([Ljava/lang/String;[SB)V", garbageValue = "4")
    public static void method3100(final String[] array, final short[] array2) {
        method3101(array, array2, 0, array.length - 1);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([Ljava/lang/String;[SIII)V", garbageValue = "-659552878")
    static void method3101(final String[] array, final short[] array2, final int n, final int n2) {
        if (n < n2) {
            final int n3 = (n2 + n) / 2;
            int n4 = n;
            final String s = array[n3];
            array[n3] = array[n2];
            array[n2] = s;
            final short n5 = array2[n3];
            array2[n3] = array2[n2];
            array2[n2] = n5;
            for (int i = n; i < n2; ++i) {
                if (s == null || (array[i] != null && array[i].compareTo(s) < (i & 0x1))) {
                    final String s2 = array[i];
                    array[i] = array[n4];
                    array[n4] = s2;
                    final short n6 = array2[i];
                    array2[i] = array2[n4];
                    array2[n4++] = n6;
                }
            }
            array[n2] = array[n4];
            array[n4] = s;
            array2[n2] = array2[n4];
            array2[n4] = n5;
            method3101(array, array2, n, n4 - 1);
            method3101(array, array2, n4 + 1, n2);
        }
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "30")
    static final void method3098() {
        final int n = 256;
        if (Class78.field1088 > 0) {
            for (int i = 0; i < 256; ++i) {
                if (Class78.field1088 > 768) {
                    Class77.field1077[i] = Class33.method558(Class64.field936[i], Class185.field2364[i], 1024 - Class78.field1088);
                }
                else if (Class78.field1088 > 256) {
                    Class77.field1077[i] = Class185.field2364[i];
                }
                else {
                    Class77.field1077[i] = Class33.method558(Class185.field2364[i], Class64.field936[i], 256 - Class78.field1088);
                }
            }
        }
        else if (Class78.field1094 > 0) {
            for (int j = 0; j < 256; ++j) {
                if (Class78.field1094 > 768) {
                    Class77.field1077[j] = Class33.method558(Class64.field936[j], Class11.field69[j], 1024 - Class78.field1094);
                }
                else if (Class78.field1094 > 256) {
                    Class77.field1077[j] = Class11.field69[j];
                }
                else {
                    Class77.field1077[j] = Class33.method558(Class11.field69[j], Class64.field936[j], 256 - Class78.field1094);
                }
            }
        }
        else {
            for (int k = 0; k < 256; ++k) {
                Class77.field1077[k] = Class64.field936[k];
            }
        }
        Class314.method5720(Class78.field1082, 9, Class78.field1082 + 128, n + 7);
        Class78.field1092.method5849(Class78.field1082, 0);
        Class314.method5719();
        int n2 = 0;
        int n3 = Class163.field2014.field3767 * 9 + Class78.field1082;
        for (int l = 1; l < n - 1; ++l) {
            int n4 = Class78.field1093[l] * (n - l) / n + 22;
            if (n4 < 0) {
                n4 = 0;
            }
            n2 += n4;
            for (int n5 = n4; n5 < 128; ++n5) {
                final int n6 = Class40.field357[n2++];
                if (n6 != 0) {
                    final int n7 = n6;
                    final int n8 = 256 - n6;
                    final int n9 = Class77.field1077[n6];
                    final int n10 = Class163.field2014.field3768[n3];
                    Class163.field2014.field3768[n3++] = ((n9 & 0xFF00FF) * n7 + (n10 & 0xFF00FF) * n8 & 0xFF00FF00) + (n7 * (n9 & 0xFF00) + n8 * (n10 & 0xFF00) & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n4 + Class163.field2014.field3767 - 128;
        }
        Class314.method5720(Class78.field1082 + 765 - 128, 9, Class78.field1082 + 765, n + 7);
        Class78.field1087.method5849(Class78.field1082 + 382, 0);
        Class314.method5719();
        int n11 = 0;
        int n12 = Class163.field2014.field3767 * 9 + Class78.field1082 + 637 + 24;
        for (int n13 = 1; n13 < n - 1; ++n13) {
            final int n14 = Class78.field1093[n13] * (n - n13) / n;
            final int n15 = 103 - n14;
            int n16 = n12 + n14;
            for (int n17 = 0; n17 < n15; ++n17) {
                final int n18 = Class40.field357[n11++];
                if (n18 != 0) {
                    final int n19 = n18;
                    final int n20 = 256 - n18;
                    final int n21 = Class77.field1077[n18];
                    final int n22 = Class163.field2014.field3768[n16];
                    Class163.field2014.field3768[n16++] = ((n21 & 0xFF00FF) * n19 + (n22 & 0xFF00FF) * n20 & 0xFF00FF00) + (n20 * (n22 & 0xFF00) + n19 * (n21 & 0xFF00) & 0xFF0000) >> 8;
                }
                else {
                    ++n16;
                }
            }
            n11 += 128 - n15;
            n12 = n16 + (Class163.field2014.field3767 - n15 - n14);
        }
    }
}
