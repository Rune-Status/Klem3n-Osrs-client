import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dp")
public final class Class112
{
    @ObfuscatedName("bo")
    @ObfuscatedSignature(signature = "Liw;")
    static Class244 field1455;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Ldf;")
    Class127 field1447;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1713209305)
    int field1450;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -487172753)
    int field1448;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -629897321)
    int field1449;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Ldf;")
    Class127 field1451;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Ldf;")
    Class127 field1452;
    @ObfuscatedName("k")
    @ObfuscatedGetter(longValue = -7021382517737045299L)
    long field1456;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -766143801)
    int field1454;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIILfw;Lfk;Z[I[II)I", garbageValue = "190310969")
    public static int method2566(final int n, final int n2, final int n3, final Class166 class166, final Class164 class167, final boolean b, final int[] array, final int[] array2) {
        for (int i = 0; i < 128; ++i) {
            for (int j = 0; j < 128; ++j) {
                Class165.field2035[i][j] = 0;
                Class165.field2041[i][j] = 99999999;
            }
        }
        int n16 = 0;
        Label_0240: {
            if (n3 == 1) {
                int n4 = n;
                int n5 = n2;
                final int n6 = 64;
                final int n7 = 64;
                final int n8 = n - n6;
                final int n9 = n2 - n7;
                Class165.field2035[n6][n7] = 99;
                Class165.field2041[n6][n7] = 0;
                int k = 0;
                int n10 = 0;
                Class165.field2039[k] = n4;
                Class165.field2038[k++] = n5;
                final int[][] field2029 = class167.field2029;
                while (true) {
                    while (k != n10) {
                        n4 = Class165.field2039[n10];
                        n5 = Class165.field2038[n10];
                        n10 = (n10 + 1 & 0xFFF);
                        final int n11 = n4 - n8;
                        final int n12 = n5 - n9;
                        final int n13 = n4 - class167.field2025;
                        final int n14 = n5 - class167.field2026;
                        if (class166.vmethod3440(1, n4, n5, class167)) {
                            Class19.field152 = n4;
                            Class165.field2037 = n5;
                            final int n15 = 1;
                            n16 = n15;
                            break Label_0240;
                        }
                        final int n17 = Class165.field2041[n11][n12] + 1;
                        if (n11 > 0 && Class165.field2035[n11 - 1][n12] == 0 && (field2029[n13 - 1][n14] & 0x1240108) == 0x0) {
                            Class165.field2039[k] = n4 - 1;
                            Class165.field2038[k] = n5;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11 - 1][n12] = 2;
                            Class165.field2041[n11 - 1][n12] = n17;
                        }
                        if (n11 < 127 && Class165.field2035[n11 + 1][n12] == 0 && (field2029[n13 + 1][n14] & 0x1240180) == 0x0) {
                            Class165.field2039[k] = n4 + 1;
                            Class165.field2038[k] = n5;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11 + 1][n12] = 8;
                            Class165.field2041[n11 + 1][n12] = n17;
                        }
                        if (n12 > 0 && Class165.field2035[n11][n12 - 1] == 0 && (field2029[n13][n14 - 1] & 0x1240102) == 0x0) {
                            Class165.field2039[k] = n4;
                            Class165.field2038[k] = n5 - 1;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11][n12 - 1] = 1;
                            Class165.field2041[n11][n12 - 1] = n17;
                        }
                        if (n12 < 127 && Class165.field2035[n11][n12 + 1] == 0 && (field2029[n13][n14 + 1] & 0x1240120) == 0x0) {
                            Class165.field2039[k] = n4;
                            Class165.field2038[k] = n5 + 1;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11][n12 + 1] = 4;
                            Class165.field2041[n11][n12 + 1] = n17;
                        }
                        if (n11 > 0 && n12 > 0 && Class165.field2035[n11 - 1][n12 - 1] == 0 && (field2029[n13 - 1][n14 - 1] & 0x124010E) == 0x0 && (field2029[n13 - 1][n14] & 0x1240108) == 0x0 && (field2029[n13][n14 - 1] & 0x1240102) == 0x0) {
                            Class165.field2039[k] = n4 - 1;
                            Class165.field2038[k] = n5 - 1;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11 - 1][n12 - 1] = 3;
                            Class165.field2041[n11 - 1][n12 - 1] = n17;
                        }
                        if (n11 < 127 && n12 > 0 && Class165.field2035[n11 + 1][n12 - 1] == 0 && (field2029[n13 + 1][n14 - 1] & 0x1240183) == 0x0 && (field2029[n13 + 1][n14] & 0x1240180) == 0x0 && (field2029[n13][n14 - 1] & 0x1240102) == 0x0) {
                            Class165.field2039[k] = n4 + 1;
                            Class165.field2038[k] = n5 - 1;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11 + 1][n12 - 1] = 9;
                            Class165.field2041[n11 + 1][n12 - 1] = n17;
                        }
                        if (n11 > 0 && n12 < 127 && Class165.field2035[n11 - 1][n12 + 1] == 0 && (field2029[n13 - 1][n14 + 1] & 0x1240138) == 0x0 && (field2029[n13 - 1][n14] & 0x1240108) == 0x0 && (field2029[n13][n14 + 1] & 0x1240120) == 0x0) {
                            Class165.field2039[k] = n4 - 1;
                            Class165.field2038[k] = n5 + 1;
                            k = (k + 1 & 0xFFF);
                            Class165.field2035[n11 - 1][n12 + 1] = 6;
                            Class165.field2041[n11 - 1][n12 + 1] = n17;
                        }
                        if (n11 >= 127 || n12 >= 127 || Class165.field2035[n11 + 1][n12 + 1] != 0 || (field2029[n13 + 1][n14 + 1] & 0x12401E0) != 0x0 || (field2029[n13 + 1][n14] & 0x1240180) != 0x0 || (field2029[n13][n14 + 1] & 0x1240120) != 0x0) {
                            continue;
                        }
                        Class165.field2039[k] = n4 + 1;
                        Class165.field2038[k] = n5 + 1;
                        k = (k + 1 & 0xFFF);
                        Class165.field2035[n11 + 1][n12 + 1] = 12;
                        Class165.field2041[n11 + 1][n12 + 1] = n17;
                    }
                    Class19.field152 = n4;
                    Class165.field2037 = n5;
                    final int n15 = 0;
                    continue;
                }
            }
            if (n3 == 2) {
                n16 = (Class40.method693(n, n2, class166, class167) ? 1 : 0);
            }
            else {
                n16 = (Class21.method273(n, n2, n3, class166, class167) ? 1 : 0);
            }
        }
        final int n18 = n - 64;
        final int n19 = n2 - 64;
        int field2030 = Class19.field152;
        int field2031 = Class165.field2037;
        if (n16 == 0) {
            int n20 = Integer.MAX_VALUE;
            int n21 = Integer.MAX_VALUE;
            final int n22 = 10;
            final int field2032 = class166.field2043;
            final int field2033 = class166.field2048;
            final int field2034 = class166.field2042;
            final int field2035 = class166.field2045;
            for (int l = field2032 - n22; l <= n22 + field2032; ++l) {
                for (int n23 = field2033 - n22; n23 <= n22 + field2033; ++n23) {
                    final int n24 = l - n18;
                    final int n25 = n23 - n19;
                    if (n24 >= 0 && n25 >= 0 && n24 < 128 && n25 < 128 && Class165.field2041[n24][n25] < 100) {
                        int n26 = 0;
                        if (l < field2032) {
                            n26 = field2032 - l;
                        }
                        else if (l > field2034 + field2032 - 1) {
                            n26 = l - (field2034 + field2032 - 1);
                        }
                        int n27 = 0;
                        if (n23 < field2033) {
                            n27 = field2033 - n23;
                        }
                        else if (n23 > field2033 + field2035 - 1) {
                            n27 = n23 - (field2033 + field2035 - 1);
                        }
                        final int n28 = n26 * n26 + n27 * n27;
                        if (n28 < n20 || (n20 == n28 && Class165.field2041[n24][n25] < n21)) {
                            n20 = n28;
                            n21 = Class165.field2041[n24][n25];
                            field2030 = l;
                            field2031 = n23;
                        }
                    }
                }
            }
            if (n20 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (n == field2030 && field2031 == n2) {
            return 0;
        }
        int n29 = 0;
        Class165.field2039[n29] = field2030;
        Class165.field2038[n29++] = field2031;
        int n31;
        int n30 = n31 = Class165.field2035[field2030 - n18][field2031 - n19];
        while (n != field2030 || field2031 != n2) {
            if (n30 != n31) {
                n30 = n31;
                Class165.field2039[n29] = field2030;
                Class165.field2038[n29++] = field2031;
            }
            if ((n31 & 0x2) != 0x0) {
                ++field2030;
            }
            else if ((n31 & 0x8) != 0x0) {
                --field2030;
            }
            if ((n31 & 0x1) != 0x0) {
                ++field2031;
            }
            else if ((n31 & 0x4) != 0x0) {
                --field2031;
            }
            n31 = Class165.field2035[field2030 - n18][field2031 - n19];
        }
        int n32 = 0;
        while (n29-- > 0) {
            array[n32] = Class165.field2039[n29];
            array2[n32++] = Class165.field2038[n29];
            if (n32 >= array.length) {
                break;
            }
        }
        return n32;
    }
    
    @ObfuscatedName("hd")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "464504900")
    static final void method2564(final int n) {
        if (n < 0) {
            return;
        }
        Class39.method692(Client.field718[n], Client.field851[n], Client.field720[n], Client.field794[n], Client.field735[n], Client.field740[n], Class48.field432, Class48.field428);
    }
    
    @ObfuscatedName("jz")
    @ObfuscatedSignature(signature = "(Lhi;II)Ljava/lang/String;", garbageValue = "878774611")
    static String method2565(final Class230 class230, final int n) {
        if (!Class97.method2214(Class24.method425(class230), n) && class230.field2706 == null) {
            return null;
        }
        if (class230.field2680 == null || class230.field2680.length <= n || class230.field2680[n] == null || class230.field2680[n].trim().length() == 0) {
            return null;
        }
        return class230.field2680[n];
    }
}
