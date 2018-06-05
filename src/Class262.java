import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ju")
public class Class262
{
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(IIIIIIILdm;Lfk;S)V", garbageValue = "5648")
    static final void method4939(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Class125 class125, final Class164 class126) {
        final Class268 method2527 = Class110.method2527(n5);
        int n8;
        int n9;
        if (n6 == 1 || n6 == 3) {
            n8 = method2527.field3385;
            n9 = method2527.field3384;
        }
        else {
            n8 = method2527.field3384;
            n9 = method2527.field3385;
        }
        int n10;
        int n11;
        if (n8 + n3 <= 104) {
            n10 = (n8 >> 1) + n3;
            n11 = n3 + (n8 + 1 >> 1);
        }
        else {
            n10 = n3;
            n11 = n3 + 1;
        }
        int n12;
        int n13;
        if (n4 + n9 <= 104) {
            n12 = n4 + (n9 >> 1);
            n13 = n4 + (n9 + 1 >> 1);
        }
        else {
            n12 = n4;
            n13 = n4 + 1;
        }
        final int[][] array = Class50.field459[n2];
        final int n14 = array[n10][n13] + array[n10][n12] + array[n11][n12] + array[n11][n13] >> 2;
        final int n15 = (n3 << 7) + (n8 << 6);
        final int n16 = (n4 << 7) + (n9 << 6);
        final long method2528 = Class76.method1804(n3, n4, 2, method2527.field3388 == 0, n5);
        int n17 = (n6 << 6) + n7;
        if (method2527.field3409 == 1) {
            n17 += 256;
        }
        if (n7 == 22) {
            Class127 method2529;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2529 = method2527.method5031(22, n6, array, n15, n14, n16);
            }
            else {
                method2529 = new Class85(n5, 22, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method3009(n, n3, n4, n14, method2529, method2528, n17);
            if (method2527.field3386 == 1) {
                class126.method3410(n3, n4);
            }
            return;
        }
        if (n7 == 10 || n7 == 11) {
            Class127 method2530;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2530 = method2527.method5031(10, n6, array, n15, n14, n16);
            }
            else {
                method2530 = new Class85(n5, 10, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            if (method2530 != null) {
                class125.method2882(n, n3, n4, n14, n8, n9, method2530, (n7 == 11) ? 256 : 0, method2528, n17);
            }
            if (method2527.field3386 != 0) {
                class126.method3394(n3, n4, n8, n9, method2527.field3404);
            }
            return;
        }
        if (n7 >= 12) {
            Class127 method2531;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2531 = method2527.method5031(n7, n6, array, n15, n14, n16);
            }
            else {
                method2531 = new Class85(n5, n7, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2882(n, n3, n4, n14, 1, 1, method2531, 0, method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3394(n3, n4, n8, n9, method2527.field3404);
            }
            return;
        }
        if (n7 == 0) {
            Class127 method2532;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2532 = method2527.method5031(0, n6, array, n15, n14, n16);
            }
            else {
                method2532 = new Class85(n5, 0, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2927(n, n3, n4, n14, method2532, null, Class50.field450[n6], 0, method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3393(n3, n4, n7, n6, method2527.field3404);
            }
            return;
        }
        if (n7 == 1) {
            Class127 method2533;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2533 = method2527.method5031(1, n6, array, n15, n14, n16);
            }
            else {
                method2533 = new Class85(n5, 1, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2927(n, n3, n4, n14, method2533, null, Class50.field451[n6], 0, method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3393(n3, n4, n7, n6, method2527.field3404);
            }
            return;
        }
        if (n7 == 2) {
            final int n18 = n6 + 1 & 0x3;
            Class127 method2534;
            Class127 method2535;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2534 = method2527.method5031(2, n6 + 4, array, n15, n14, n16);
                method2535 = method2527.method5031(2, n18, array, n15, n14, n16);
            }
            else {
                method2534 = new Class85(n5, 2, n6 + 4, n2, n3, n4, method2527.field3372, true, null);
                method2535 = new Class85(n5, 2, n18, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2927(n, n3, n4, n14, method2534, method2535, Class50.field450[n6], Class50.field450[n18], method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3393(n3, n4, n7, n6, method2527.field3404);
            }
            return;
        }
        if (n7 == 3) {
            Class127 method2536;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2536 = method2527.method5031(3, n6, array, n15, n14, n16);
            }
            else {
                method2536 = new Class85(n5, 3, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2927(n, n3, n4, n14, method2536, null, Class50.field451[n6], 0, method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3393(n3, n4, n7, n6, method2527.field3404);
            }
            return;
        }
        if (n7 == 9) {
            Class127 method2537;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2537 = method2527.method5031(n7, n6, array, n15, n14, n16);
            }
            else {
                method2537 = new Class85(n5, n7, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2882(n, n3, n4, n14, 1, 1, method2537, 0, method2528, n17);
            if (method2527.field3386 != 0) {
                class126.method3394(n3, n4, n8, n9, method2527.field3404);
            }
            return;
        }
        if (n7 == 4) {
            Class127 method2538;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2538 = method2527.method5031(4, n6, array, n15, n14, n16);
            }
            else {
                method2538 = new Class85(n5, 4, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2881(n, n3, n4, n14, method2538, null, Class50.field450[n6], 0, 0, 0, method2528, n17);
            return;
        }
        if (n7 == 5) {
            int field3379 = 16;
            final long method2539 = class125.method2898(n, n3, n4);
            if (method2539 != 0L) {
                field3379 = Class110.method2527(Class39.method673(method2539)).field3379;
            }
            Class127 method2540;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2540 = method2527.method5031(4, n6, array, n15, n14, n16);
            }
            else {
                method2540 = new Class85(n5, 4, n6, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2881(n, n3, n4, n14, method2540, null, Class50.field450[n6], 0, field3379 * Class50.field452[n6], field3379 * Class50.field453[n6], method2528, n17);
            return;
        }
        if (n7 == 6) {
            int n19 = 8;
            final long method2541 = class125.method2898(n, n3, n4);
            if (0L != method2541) {
                n19 = Class110.method2527(Class39.method673(method2541)).field3379 / 2;
            }
            Class127 method2542;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2542 = method2527.method5031(4, n6 + 4, array, n15, n14, n16);
            }
            else {
                method2542 = new Class85(n5, 4, n6 + 4, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2881(n, n3, n4, n14, method2542, null, 256, n6, n19 * Class50.field458[n6], n19 * Class50.field449[n6], method2528, n17);
            return;
        }
        if (n7 == 7) {
            final int n20 = n6 + 2 & 0x3;
            Class127 method2543;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2543 = method2527.method5031(4, n20 + 4, array, n15, n14, n16);
            }
            else {
                method2543 = new Class85(n5, 4, n20 + 4, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2881(n, n3, n4, n14, method2543, null, 256, n20, 0, 0, method2528, n17);
            return;
        }
        if (n7 == 8) {
            int n21 = 8;
            final long method2544 = class125.method2898(n, n3, n4);
            if (0L != method2544) {
                n21 = Class110.method2527(Class39.method673(method2544)).field3379 / 2;
            }
            final int n22 = n6 + 2 & 0x3;
            Class127 method2545;
            Class127 method2546;
            if (method2527.field3372 == -1 && method2527.field3410 == null) {
                method2545 = method2527.method5031(4, n6 + 4, array, n15, n14, n16);
                method2546 = method2527.method5031(4, n22 + 4, array, n15, n14, n16);
            }
            else {
                method2545 = new Class85(n5, 4, n6 + 4, n2, n3, n4, method2527.field3372, true, null);
                method2546 = new Class85(n5, 4, n22 + 4, n2, n3, n4, method2527.field3372, true, null);
            }
            class125.method2881(n, n3, n4, n14, method2545, method2546, 256, n6, n21 * Class50.field458[n6], n21 * Class50.field449[n6], method2528, n17);
        }
    }
}
