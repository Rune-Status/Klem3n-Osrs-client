import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fl")
public class Class171
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2249;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2242;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2244;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2243;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2245;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2246;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2241;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2248;
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2247;
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "Lfl;")
    public static final Class171 field2250;
    @ObfuscatedName("fr")
    static byte[][] field2252;
    
    static {
        field2249 = new Class171(5);
        field2242 = new Class171(3);
        field2244 = new Class171(7);
        field2243 = new Class171(4);
        field2245 = new Class171(14);
        field2246 = new Class171(15);
        field2241 = new Class171(6);
        field2248 = new Class171(4);
        field2247 = new Class171(2);
        field2250 = new Class171(5);
    }
    
    Class171(final int n) {
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(IIIIIILdm;Lfk;I)V", garbageValue = "1712806345")
    static final void method3450(final int field442, final int n, final int n2, final int n3, final int n4, final int n5, final Class125 class125, final Class164 class126) {
        if (Client.field585 && (Class50.field443[0][n][n2] & 0x2) == 0x0 && (Class50.field443[field442][n][n2] & 0x10) != 0x0) {
            return;
        }
        if (field442 < Class50.field442) {
            Class50.field442 = field442;
        }
        final Class268 method2527 = Class110.method2527(n3);
        int n6;
        int n7;
        if (n4 == 1 || n4 == 3) {
            n6 = method2527.field3385;
            n7 = method2527.field3384;
        }
        else {
            n6 = method2527.field3384;
            n7 = method2527.field3385;
        }
        int n8;
        int n9;
        if (n6 + n <= 104) {
            n8 = (n6 >> 1) + n;
            n9 = (n6 + 1 >> 1) + n;
        }
        else {
            n8 = n;
            n9 = n + 1;
        }
        int n10;
        int n11;
        if (n7 + n2 <= 104) {
            n10 = (n7 >> 1) + n2;
            n11 = n2 + (n7 + 1 >> 1);
        }
        else {
            n10 = n2;
            n11 = n2 + 1;
        }
        final int[][] array = Class50.field459[field442];
        final int n12 = array[n8][n10] + array[n9][n10] + array[n8][n11] + array[n9][n11] >> 2;
        final int n13 = (n << 7) + (n6 << 6);
        final int n14 = (n2 << 7) + (n7 << 6);
        final long method2528 = Class76.method1804(n, n2, 2, method2527.field3388 == 0, n3);
        int n15 = n5 + (n4 << 6);
        if (method2527.field3409 == 1) {
            n15 += 256;
        }
        if (method2527.method5024()) {
            Class181.method3528(field442, n, n2, method2527, n4);
        }
        if (n5 == 22) {
            if (Client.field585 && method2527.field3388 == 0 && method2527.field3386 != 1 && !method2527.field3407) {
                return;
            }
            Class127 method2529;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2529 = method2527.method5079(22, n4, array, n13, n12, n14);
            }
            else {
                method2529 = new Class85(n3, 22, n4, field442, n, n2, method2527.field3372, true, null);
            }
            class125.method3009(field442, n, n2, n12, method2529, method2528, n15);
            if (method2527.field3386 == 1 && class126 != null) {
                class126.method3410(n, n2);
            }
        }
        else {
            if (n5 == 10 || n5 == 11) {
                Class127 method2530;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2530 = method2527.method5079(10, n4, array, n13, n12, n14);
                }
                else {
                    method2530 = new Class85(n3, 10, n4, field442, n, n2, method2527.field3372, true, null);
                }
                if (method2530 != null && class125.method2882(field442, n, n2, n12, n6, n7, method2530, (n5 == 11) ? 256 : 0, method2528, n15) && method2527.field3400) {
                    int n16 = 15;
                    if (method2530 instanceof Class119) {
                        n16 = ((Class119)method2530).method2672() / 4;
                        if (n16 > 30) {
                            n16 = 30;
                        }
                    }
                    for (int i = 0; i <= n6; ++i) {
                        for (int j = 0; j <= n7; ++j) {
                            if (n16 > Class50.field447[field442][i + n][j + n2]) {
                                Class50.field447[field442][i + n][j + n2] = (byte)n16;
                            }
                        }
                    }
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3394(n, n2, n6, n7, method2527.field3404);
                }
                return;
            }
            if (n5 >= 12) {
                Class127 method2531;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2531 = method2527.method5079(n5, n4, array, n13, n12, n14);
                }
                else {
                    method2531 = new Class85(n3, n5, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2882(field442, n, n2, n12, 1, 1, method2531, 0, method2528, n15);
                if (n5 >= 12 && n5 <= 17 && n5 != 13 && field442 > 0) {
                    final int[] array2 = Class37.field325[field442][n];
                    array2[n2] |= 0x924;
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3394(n, n2, n6, n7, method2527.field3404);
                }
                return;
            }
            if (n5 == 0) {
                Class127 method2532;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2532 = method2527.method5079(0, n4, array, n13, n12, n14);
                }
                else {
                    method2532 = new Class85(n3, 0, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2927(field442, n, n2, n12, method2532, null, Class50.field450[n4], 0, method2528, n15);
                if (n4 == 0) {
                    if (method2527.field3400) {
                        Class50.field447[field442][n][n2] = 50;
                        Class50.field447[field442][n][n2 + 1] = 50;
                    }
                    if (method2527.field3383) {
                        final int[] array3 = Class37.field325[field442][n];
                        array3[n2] |= 0x249;
                    }
                }
                else if (n4 == 1) {
                    if (method2527.field3400) {
                        Class50.field447[field442][n][n2 + 1] = 50;
                        Class50.field447[field442][n + 1][n2 + 1] = 50;
                    }
                    if (method2527.field3383) {
                        final int[] array4 = Class37.field325[field442][n];
                        final int n17 = n2 + 1;
                        array4[n17] |= 0x492;
                    }
                }
                else if (n4 == 2) {
                    if (method2527.field3400) {
                        Class50.field447[field442][n + 1][n2] = 50;
                        Class50.field447[field442][n + 1][n2 + 1] = 50;
                    }
                    if (method2527.field3383) {
                        final int[] array5 = Class37.field325[field442][n + 1];
                        array5[n2] |= 0x249;
                    }
                }
                else if (n4 == 3) {
                    if (method2527.field3400) {
                        Class50.field447[field442][n][n2] = 50;
                        Class50.field447[field442][n + 1][n2] = 50;
                    }
                    if (method2527.field3383) {
                        final int[] array6 = Class37.field325[field442][n];
                        array6[n2] |= 0x492;
                    }
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3393(n, n2, n5, n4, method2527.field3404);
                }
                if (method2527.field3379 != 16) {
                    class125.method3053(field442, n, n2, method2527.field3379);
                }
                return;
            }
            if (n5 == 1) {
                Class127 method2533;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2533 = method2527.method5079(1, n4, array, n13, n12, n14);
                }
                else {
                    method2533 = new Class85(n3, 1, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2927(field442, n, n2, n12, method2533, null, Class50.field451[n4], 0, method2528, n15);
                if (method2527.field3400) {
                    if (n4 == 0) {
                        Class50.field447[field442][n][n2 + 1] = 50;
                    }
                    else if (n4 == 1) {
                        Class50.field447[field442][n + 1][n2 + 1] = 50;
                    }
                    else if (n4 == 2) {
                        Class50.field447[field442][n + 1][n2] = 50;
                    }
                    else if (n4 == 3) {
                        Class50.field447[field442][n][n2] = 50;
                    }
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3393(n, n2, n5, n4, method2527.field3404);
                }
                return;
            }
            if (n5 == 2) {
                final int n18 = n4 + 1 & 0x3;
                Class127 method2534;
                Class127 method2535;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2534 = method2527.method5079(2, n4 + 4, array, n13, n12, n14);
                    method2535 = method2527.method5079(2, n18, array, n13, n12, n14);
                }
                else {
                    method2534 = new Class85(n3, 2, n4 + 4, field442, n, n2, method2527.field3372, true, null);
                    method2535 = new Class85(n3, 2, n18, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2927(field442, n, n2, n12, method2534, method2535, Class50.field450[n4], Class50.field450[n18], method2528, n15);
                if (method2527.field3383) {
                    if (n4 == 0) {
                        final int[] array7 = Class37.field325[field442][n];
                        array7[n2] |= 0x249;
                        final int[] array8 = Class37.field325[field442][n];
                        final int n19 = 1 + n2;
                        array8[n19] |= 0x492;
                    }
                    else if (n4 == 1) {
                        final int[] array9 = Class37.field325[field442][n];
                        final int n20 = 1 + n2;
                        array9[n20] |= 0x492;
                        final int[] array10 = Class37.field325[field442][n + 1];
                        array10[n2] |= 0x249;
                    }
                    else if (n4 == 2) {
                        final int[] array11 = Class37.field325[field442][n + 1];
                        array11[n2] |= 0x249;
                        final int[] array12 = Class37.field325[field442][n];
                        array12[n2] |= 0x492;
                    }
                    else if (n4 == 3) {
                        final int[] array13 = Class37.field325[field442][n];
                        array13[n2] |= 0x492;
                        final int[] array14 = Class37.field325[field442][n];
                        array14[n2] |= 0x249;
                    }
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3393(n, n2, n5, n4, method2527.field3404);
                }
                if (method2527.field3379 != 16) {
                    class125.method3053(field442, n, n2, method2527.field3379);
                }
                return;
            }
            if (n5 == 3) {
                Class127 method2536;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2536 = method2527.method5079(3, n4, array, n13, n12, n14);
                }
                else {
                    method2536 = new Class85(n3, 3, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2927(field442, n, n2, n12, method2536, null, Class50.field451[n4], 0, method2528, n15);
                if (method2527.field3400) {
                    if (n4 == 0) {
                        Class50.field447[field442][n][n2 + 1] = 50;
                    }
                    else if (n4 == 1) {
                        Class50.field447[field442][n + 1][n2 + 1] = 50;
                    }
                    else if (n4 == 2) {
                        Class50.field447[field442][n + 1][n2] = 50;
                    }
                    else if (n4 == 3) {
                        Class50.field447[field442][n][n2] = 50;
                    }
                }
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3393(n, n2, n5, n4, method2527.field3404);
                }
                return;
            }
            if (n5 == 9) {
                Class127 method2537;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2537 = method2527.method5079(n5, n4, array, n13, n12, n14);
                }
                else {
                    method2537 = new Class85(n3, n5, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2882(field442, n, n2, n12, 1, 1, method2537, 0, method2528, n15);
                if (method2527.field3386 != 0 && class126 != null) {
                    class126.method3394(n, n2, n6, n7, method2527.field3404);
                }
                if (method2527.field3379 != 16) {
                    class125.method3053(field442, n, n2, method2527.field3379);
                }
                return;
            }
            if (n5 == 4) {
                Class127 method2538;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2538 = method2527.method5079(4, n4, array, n13, n12, n14);
                }
                else {
                    method2538 = new Class85(n3, 4, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2881(field442, n, n2, n12, method2538, null, Class50.field450[n4], 0, 0, 0, method2528, n15);
                return;
            }
            if (n5 == 5) {
                int field443 = 16;
                final long method2539 = class125.method2898(field442, n, n2);
                if (method2539 != 0L) {
                    field443 = Class110.method2527(Class39.method673(method2539)).field3379;
                }
                Class127 method2540;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2540 = method2527.method5079(4, n4, array, n13, n12, n14);
                }
                else {
                    method2540 = new Class85(n3, 4, n4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2881(field442, n, n2, n12, method2540, null, Class50.field450[n4], 0, field443 * Class50.field452[n4], field443 * Class50.field453[n4], method2528, n15);
                return;
            }
            if (n5 == 6) {
                int n21 = 8;
                final long method2541 = class125.method2898(field442, n, n2);
                if (0L != method2541) {
                    n21 = Class110.method2527(Class39.method673(method2541)).field3379 / 2;
                }
                Class127 method2542;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2542 = method2527.method5079(4, n4 + 4, array, n13, n12, n14);
                }
                else {
                    method2542 = new Class85(n3, 4, n4 + 4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2881(field442, n, n2, n12, method2542, null, 256, n4, n21 * Class50.field458[n4], n21 * Class50.field449[n4], method2528, n15);
                return;
            }
            if (n5 == 7) {
                final int n22 = n4 + 2 & 0x3;
                Class127 method2543;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2543 = method2527.method5079(4, n22 + 4, array, n13, n12, n14);
                }
                else {
                    method2543 = new Class85(n3, 4, n22 + 4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2881(field442, n, n2, n12, method2543, null, 256, n22, 0, 0, method2528, n15);
                return;
            }
            if (n5 == 8) {
                int n23 = 8;
                final long method2544 = class125.method2898(field442, n, n2);
                if (0L != method2544) {
                    n23 = Class110.method2527(Class39.method673(method2544)).field3379 / 2;
                }
                final int n24 = n4 + 2 & 0x3;
                Class127 method2545;
                Class127 method2546;
                if (method2527.field3372 == -1 && method2527.field3410 == null) {
                    method2545 = method2527.method5079(4, n4 + 4, array, n13, n12, n14);
                    method2546 = method2527.method5079(4, n24 + 4, array, n13, n12, n14);
                }
                else {
                    method2545 = new Class85(n3, 4, n4 + 4, field442, n, n2, method2527.field3372, true, null);
                    method2546 = new Class85(n3, 4, n24 + 4, field442, n, n2, method2527.field3372, true, null);
                }
                class125.method2881(field442, n, n2, n12, method2545, method2546, 256, n4, n23 * Class50.field458[n4], n23 * Class50.field449[n4], method2528, n15);
            }
        }
    }
    
    @ObfuscatedName("hr")
    @ObfuscatedSignature(signature = "(Lbf;III)V", garbageValue = "-1489132269")
    static final void method3451(final Class75 class75, final int n, final int n2) {
        Class39.method692(class75.field1066, class75.field1060, class75.field1061, class75.field1062, class75.field1063, class75.field1063, n, n2);
    }
}
