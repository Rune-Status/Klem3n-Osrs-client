import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fo")
public final class Class176
{
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "Lfb;")
    static Class181 field2280;
    
    static {
        Class176.field2280 = new Class181();
    }
    
    @ObfuscatedName("z")
    public static int method3489(final byte[] field2305, int field2306, final byte[] field2307, final int n, final int field2308) {
        synchronized (Class176.field2280) {
            Class176.field2280.strm = field2307;
            Class176.field2280.next_in = field2308;
            Class176.field2280.field2305 = field2305;
            Class176.field2280.field2313 = 0;
            Class176.field2280.field2310 = field2306;
            Class176.field2280.total_in_lo32 = 0;
            Class176.field2280.total_in_hi32 = 0;
            Class176.field2280.total_out_lo32 = 0;
            Class176.field2280.field2295 = 0;
            method3491(Class176.field2280);
            field2306 -= Class176.field2280.field2310;
            Class176.field2280.strm = null;
            Class176.field2280.field2305 = null;
            return field2306;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lfb;)V")
    static void method3500(final Class181 class181) {
        byte field2307 = class181.field2307;
        int field2308 = class181.field2308;
        int field2309 = class181.field2325;
        int field2310 = class181.field2314;
        final int[] field2311 = Class25.tt;
        int field2312 = class181.field2304;
        final byte[] field2313 = class181.field2305;
        int field2314 = class181.field2313;
        final int field2315;
        int i = field2315 = class181.field2310;
        final int n = class181.field2331 + 1;
        while (true) {
            Block_10: {
                Block_7: {
                    Block_5: {
                        Block_2: {
                            while (true) {
                                Label_0153: {
                                    if (field2308 > 0) {
                                        while (i != 0) {
                                            if (field2308 == 1) {
                                                if (i == 0) {
                                                    break Block_5;
                                                }
                                                field2313[field2314] = field2307;
                                                ++field2314;
                                                --i;
                                                break Label_0153;
                                            }
                                            else {
                                                field2313[field2314] = field2307;
                                                --field2308;
                                                ++field2314;
                                                --i;
                                            }
                                        }
                                        break;
                                    }
                                }
                                int j = 1;
                                while (j != 0) {
                                    j = 0;
                                    if (field2309 == n) {
                                        break Block_2;
                                    }
                                    field2307 = (byte)field2310;
                                    final int n2 = field2311[field2312];
                                    final byte b = (byte)(n2 & 0xFF);
                                    field2312 = n2 >> 8;
                                    ++field2309;
                                    if (b != field2310) {
                                        field2310 = b;
                                        if (i == 0) {
                                            break Block_7;
                                        }
                                        field2313[field2314] = field2307;
                                        ++field2314;
                                        --i;
                                        j = 1;
                                    }
                                    else {
                                        if (field2309 != n) {
                                            continue;
                                        }
                                        if (i == 0) {
                                            break Block_10;
                                        }
                                        field2313[field2314] = field2307;
                                        ++field2314;
                                        --i;
                                        j = 1;
                                    }
                                }
                                field2308 = 2;
                                final int n3 = field2311[field2312];
                                final byte b2 = (byte)(n3 & 0xFF);
                                field2312 = n3 >> 8;
                                if (++field2309 == n) {
                                    continue;
                                }
                                if (b2 != field2310) {
                                    field2310 = b2;
                                }
                                else {
                                    field2308 = 3;
                                    final int n4 = field2311[field2312];
                                    final byte b3 = (byte)(n4 & 0xFF);
                                    field2312 = n4 >> 8;
                                    if (++field2309 == n) {
                                        continue;
                                    }
                                    if (b3 != field2310) {
                                        field2310 = b3;
                                    }
                                    else {
                                        final int n5 = field2311[field2312];
                                        final byte b4 = (byte)(n5 & 0xFF);
                                        final int n6 = n5 >> 8;
                                        ++field2309;
                                        field2308 = (b4 & 0xFF) + 4;
                                        final int n7 = field2311[n6];
                                        field2310 = (byte)(n7 & 0xFF);
                                        field2312 = n7 >> 8;
                                        ++field2309;
                                    }
                                }
                            }
                            final int field2316 = class181.field2295;
                            class181.field2295 += field2315 - i;
                            if (class181.field2295 < field2316) {}
                            class181.field2307 = field2307;
                            class181.field2308 = field2308;
                            class181.field2325 = field2309;
                            class181.field2314 = field2310;
                            Class25.tt = field2311;
                            class181.field2304 = field2312;
                            class181.field2305 = field2313;
                            class181.field2313 = field2314;
                            class181.field2310 = i;
                            return;
                        }
                        field2308 = 0;
                        continue;
                    }
                    field2308 = 1;
                    continue;
                }
                field2308 = 1;
                continue;
            }
            field2308 = 1;
            continue;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lfb;)V")
    static void method3491(final Class181 class181) {
        int n = 0;
        int[] array = null;
        int[] array2 = null;
        int[] array3 = null;
        class181.blockSize100k = 1;
        if (Class25.tt == null) {
            Class25.tt = new int[class181.blockSize100k * 100000];
        }
        int i = 1;
        while (i != 0) {
            if (method3492(class181) == 23) {
                return;
            }
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            method3492(class181);
            if (method3493(class181) != 0) {}
            class181.field2534 = 0;
            class181.field2534 = (class181.field2534 << 8 | (method3492(class181) & 0xFF));
            class181.field2534 = (class181.field2534 << 8 | (method3492(class181) & 0xFF));
            class181.field2534 = (class181.field2534 << 8 | (method3492(class181) & 0xFF));
            for (int j = 0; j < 16; ++j) {
                if (method3493(class181) == 1) {
                    class181.field2296[j] = true;
                }
                else {
                    class181.field2296[j] = false;
                }
            }
            for (int k = 0; k < 256; ++k) {
                class181.field2319[k] = false;
            }
            for (int l = 0; l < 16; ++l) {
                if (class181.field2296[l]) {
                    for (int n2 = 0; n2 < 16; ++n2) {
                        if (method3493(class181) == 1) {
                            class181.field2319[n2 + l * 16] = true;
                        }
                    }
                }
            }
            method3494(class181);
            final int n3 = class181.field2318 + 2;
            final int method3490 = method3490(3, class181);
            final int method3491 = method3490(15, class181);
            for (int n4 = 0; n4 < method3491; ++n4) {
                int n5 = 0;
                while (method3493(class181) != 0) {
                    ++n5;
                }
                class181.field2328[n4] = (byte)n5;
            }
            final byte[] array4 = new byte[6];
            for (byte b = 0; b < method3490; ++b) {
                array4[b] = b;
            }
            for (int n6 = 0; n6 < method3491; ++n6) {
                byte b2 = class181.field2328[n6];
                final byte b3 = array4[b2];
                while (b2 > 0) {
                    array4[b2] = array4[b2 - 1];
                    --b2;
                }
                array4[0] = b3;
                class181.field2324[n6] = b3;
            }
            for (byte b4 = 0; b4 < method3490; ++b4) {
                int method3492 = method3490(5, class181);
                for (int n7 = 0; n7 < n3; ++n7) {
                    while (method3493(class181) != 0) {
                        if (method3493(class181) == 0) {
                            ++method3492;
                        }
                        else {
                            --method3492;
                        }
                    }
                    class181.field2303[b4][n7] = (byte)method3492;
                }
            }
            for (byte b5 = 0; b5 < method3490; ++b5) {
                byte b6 = 32;
                byte b7 = 0;
                for (int n8 = 0; n8 < n3; ++n8) {
                    if (class181.field2303[b5][n8] > b7) {
                        b7 = class181.field2303[b5][n8];
                    }
                    if (class181.field2303[b5][n8] < b6) {
                        b6 = class181.field2303[b5][n8];
                    }
                }
                method3495(class181.field2301[b5], class181.field2297[b5], class181.field2329[b5], class181.field2303[b5], b6, b7, n3);
                class181.field2330[b5] = b6;
            }
            final int n9 = class181.field2318 + 1;
            int n10 = -1;
            int n11 = 0;
            for (int n12 = 0; n12 <= 255; ++n12) {
                class181.field2315[n12] = 0;
            }
            int n13 = 4095;
            for (int n14 = 15; n14 >= 0; --n14) {
                for (int n15 = 15; n15 >= 0; --n15) {
                    class181.field2322[n13] = (byte)(n15 + n14 * 16);
                    --n13;
                }
                class181.field2323[n14] = n13 + 1;
            }
            int field2331 = 0;
            if (n11 == 0) {
                ++n10;
                n11 = 50;
                final byte b8 = class181.field2324[n10];
                n = class181.field2330[b8];
                array = class181.field2301[b8];
                array3 = class181.field2329[b8];
                array2 = class181.field2297[b8];
            }
            --n11;
            int n16;
            int method3493;
            for (n16 = n, method3493 = method3490(n16, class181); method3493 > array[n16]; ++n16, method3493 = (method3493 << 1 | method3493(class181))) {}
            int n34 = 0;
            int method3495 = 0;
            for (int n17 = array3[method3493 - array2[n16]]; n17 != n9; n17 = array3[method3495 - array2[n34]]) {
                if (n17 == 0 || n17 == 1) {
                    int n18 = -1;
                    int n19 = 1;
                    do {
                        if (n17 == 0) {
                            n18 += n19;
                        }
                        else if (n17 == 1) {
                            n18 += n19 * 2;
                        }
                        n19 *= 2;
                        if (n11 == 0) {
                            ++n10;
                            n11 = 50;
                            final byte b9 = class181.field2324[n10];
                            n = class181.field2330[b9];
                            array = class181.field2301[b9];
                            array3 = class181.field2329[b9];
                            array2 = class181.field2297[b9];
                        }
                        --n11;
                        int n20;
                        int method3494;
                        for (n20 = n, method3494 = method3490(n20, class181); method3494 > array[n20]; ++n20, method3494 = (method3494 << 1 | method3493(class181))) {}
                        n17 = array3[method3494 - array2[n20]];
                    } while (n17 == 0 || n17 == 1);
                    ++n18;
                    final byte b10 = class181.field2321[class181.field2322[class181.field2323[0]] & 0xFF];
                    final int[] field2332 = class181.field2315;
                    final int n21 = b10 & 0xFF;
                    field2332[n21] += n18;
                    while (n18 > 0) {
                        Class25.tt[field2331] = (b10 & 0xFF);
                        ++field2331;
                        --n18;
                    }
                }
                else {
                    int n22 = n17 - 1;
                    byte b11;
                    if (n22 < 16) {
                        final int n23 = class181.field2323[0];
                        b11 = class181.field2322[n23 + n22];
                        while (n22 > 3) {
                            final int n24 = n23 + n22;
                            class181.field2322[n24] = class181.field2322[n24 - 1];
                            class181.field2322[n24 - 1] = class181.field2322[n24 - 2];
                            class181.field2322[n24 - 2] = class181.field2322[n24 - 3];
                            class181.field2322[n24 - 3] = class181.field2322[n24 - 4];
                            n22 -= 4;
                        }
                        while (n22 > 0) {
                            class181.field2322[n23 + n22] = class181.field2322[n23 + n22 - 1];
                            --n22;
                        }
                        class181.field2322[n23] = b11;
                    }
                    else {
                        int n25 = n22 / 16;
                        int n26 = class181.field2323[n25] + n22 % 16;
                        b11 = class181.field2322[n26];
                        while (n26 > class181.field2323[n25]) {
                            class181.field2322[n26] = class181.field2322[n26 - 1];
                            --n26;
                        }
                        final int[] field2333 = class181.field2323;
                        final int n27 = n25;
                        ++field2333[n27];
                        while (n25 > 0) {
                            final int[] field2334 = class181.field2323;
                            final int n28 = n25;
                            --field2334[n28];
                            class181.field2322[class181.field2323[n25]] = class181.field2322[class181.field2323[n25 - 1] + 16 - 1];
                            --n25;
                        }
                        final int[] field2335 = class181.field2323;
                        final int n29 = 0;
                        --field2335[n29];
                        class181.field2322[class181.field2323[0]] = b11;
                        if (class181.field2323[0] == 0) {
                            int n30 = 4095;
                            for (int n31 = 15; n31 >= 0; --n31) {
                                for (int n32 = 15; n32 >= 0; --n32) {
                                    class181.field2322[n30] = class181.field2322[class181.field2323[n31] + n32];
                                    --n30;
                                }
                                class181.field2323[n31] = n30 + 1;
                            }
                        }
                    }
                    final int[] field2336 = class181.field2315;
                    final int n33 = class181.field2321[b11 & 0xFF] & 0xFF;
                    ++field2336[n33];
                    Class25.tt[field2331] = (class181.field2321[b11 & 0xFF] & 0xFF);
                    ++field2331;
                    if (n11 == 0) {
                        ++n10;
                        n11 = 50;
                        final byte b12 = class181.field2324[n10];
                        n = class181.field2330[b12];
                        array = class181.field2301[b12];
                        array3 = class181.field2329[b12];
                        array2 = class181.field2297[b12];
                    }
                    --n11;
                    for (n34 = n, method3495 = method3490(n34, class181); method3495 > array[n34]; ++n34, method3495 = (method3495 << 1 | method3493(class181))) {}
                }
            }
            class181.field2308 = 0;
            class181.field2307 = 0;
            class181.field2317[0] = 0;
            for (int n35 = 1; n35 <= 256; ++n35) {
                class181.field2317[n35] = class181.field2315[n35 - 1];
            }
            for (int n36 = 1; n36 <= 256; ++n36) {
                final int[] field2337 = class181.field2317;
                final int n37 = n36;
                field2337[n37] += class181.field2317[n36 - 1];
            }
            for (int n38 = 0; n38 < field2331; ++n38) {
                final byte b13 = (byte)(Class25.tt[n38] & 0xFF);
                final int[] field2338 = Class25.tt;
                final int n39 = class181.field2317[b13 & 0xFF];
                field2338[n39] |= n38 << 8;
                final int[] field2339 = class181.field2317;
                final int n40 = b13 & 0xFF;
                ++field2339[n40];
            }
            class181.field2304 = Class25.tt[class181.field2534] >> 8;
            class181.field2325 = 0;
            class181.field2304 = Class25.tt[class181.field2304];
            class181.field2314 = (byte)(class181.field2304 & 0xFF);
            class181.field2304 >>= 8;
            ++class181.field2325;
            class181.field2331 = field2331;
            method3500(class181);
            if (class181.field2331 + 1 == class181.field2325 && class181.field2308 == 0) {
                i = 1;
            }
            else {
                i = 0;
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lfb;)B")
    static byte method3492(final Class181 class181) {
        return (byte)method3490(8, class181);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lfb;)B")
    static byte method3493(final Class181 class181) {
        return (byte)method3490(1, class181);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(ILfb;)I")
    static int method3490(final int var0, final Class181 var1) {
        while(var1.total_in_lo32 < var0) {
            var1.total_in_hi32 = var1.total_in_hi32 << 8 | var1.strm[var1.next_in] & 255;
            var1.total_in_lo32 += 8;
            ++var1.next_in;
            ++var1.total_out_lo32;
            if(var1.total_out_lo32 == 0) {
               ;
            }
         }

         int var3 = var1.total_in_hi32 >> var1.total_in_lo32 - var0 & (1 << var0) - 1;
         var1.total_in_lo32 -= var0;
         return var3;
      }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Lfb;)V")
    static void method3494(final Class181 class181) {
        class181.field2318 = 0;
        for (int i = 0; i < 256; ++i) {
            if (class181.field2319[i]) {
                class181.field2321[class181.field2318] = (byte)i;
                ++class181.field2318;
            }
        }
    }
    
    @ObfuscatedName("x")
    static void method3495(final int[] array, final int[] array2, final int[] array3, final byte[] array4, final int n, final int n2, final int n3) {
        int n4 = 0;
        for (int i = n; i <= n2; ++i) {
            for (int j = 0; j < n3; ++j) {
                if (i == array4[j]) {
                    array3[n4] = j;
                    ++n4;
                }
            }
        }
        for (int k = 0; k < 23; ++k) {
            array2[k] = 0;
        }
        for (int l = 0; l < n3; ++l) {
            final byte b = (byte)(array4[l] + 1);
            ++array2[b];
        }
        for (int n5 = 1; n5 < 23; ++n5) {
            final int n6 = n5;
            array2[n6] += array2[n5 - 1];
        }
        for (int n7 = 0; n7 < 23; ++n7) {
            array[n7] = 0;
        }
        int n8 = 0;
        for (int n9 = n; n9 <= n2; ++n9) {
            final int n10 = array2[n9 + 1] - array2[n9] + n8;
            array[n9] = n10 - 1;
            n8 = n10 << 1;
        }
        for (int n11 = n + 1; n11 <= n2; ++n11) {
            array2[n11] = (array[n11 - 1] + 1 << 1) - array2[n11];
        }
    }
}
