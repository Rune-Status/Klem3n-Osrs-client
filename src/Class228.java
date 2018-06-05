import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hr")
public class Class228
{
    @ObfuscatedName("z")
    public static final short[] field2582;
    @ObfuscatedName("w")
    public static final short[][] field2583;
    @ObfuscatedName("s")
    public static final short[] field2586;
    @ObfuscatedName("l")
    public static final short[][] field2585;
    
    static {
        field2582 = new short[] { 6798, 8741, 25238, 4626, 4550 };
        field2583 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 17050, 0, 127, -31821 } };
        field2586 = new short[] { -10304, 9104, -1, -1, -1 };
        field2585 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "1857567287")
    static int method4495(int n, final Class84 class84, final boolean b) {
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        String substring = Class69.field1001[--Class55.field497];
        int[] field2635 = null;
        if (substring.length() > 0 && substring.charAt(substring.length() - 1) == 'Y') {
            int n2 = Class69.field999[--Class69.field1003];
            if (n2 > 0) {
                field2635 = new int[n2];
                while (n2-- > 0) {
                    field2635[n2] = Class69.field999[--Class69.field1003];
                }
            }
            substring = substring.substring(0, substring.length() - 1);
        }
        Object[] field2636 = new Object[substring.length() + 1];
        for (int i = field2636.length - 1; i >= 1; --i) {
            if (substring.charAt(i - 1) == 's') {
                field2636[i] = Class69.field1001[--Class55.field497];
            }
            else {
                field2636[i] = new Integer(Class69.field999[--Class69.field1003]);
            }
        }
        final int n3 = Class69.field999[--Class69.field1003];
        if (n3 != -1) {
            field2636[0] = new Integer(n3);
        }
        else {
            field2636 = null;
        }
        if (n == 1400) {
            method434.field2688 = field2636;
        }
        else if (n == 1401) {
            method434.field2614 = field2636;
        }
        else if (n == 1402) {
            method434.field2690 = field2636;
        }
        else if (n == 1403) {
            method434.field2692 = field2636;
        }
        else if (n == 1404) {
            method434.field2694 = field2636;
        }
        else if (n == 1405) {
            method434.field2695 = field2636;
        }
        else if (n == 1406) {
            method434.field2698 = field2636;
        }
        else if (n == 1407) {
            method434.field2699 = field2636;
            method434.field2700 = field2635;
        }
        else if (n == 1408) {
            method434.field2705 = field2636;
        }
        else if (n == 1409) {
            method434.field2706 = field2636;
        }
        else if (n == 1410) {
            method434.field2696 = field2636;
        }
        else if (n == 1411) {
            method434.field2689 = field2636;
        }
        else if (n == 1412) {
            method434.field2594 = field2636;
        }
        else if (n == 1414) {
            method434.field2670 = field2636;
            method434.field2733 = field2635;
        }
        else if (n == 1415) {
            method434.field2703 = field2636;
            method434.field2635 = field2635;
        }
        else if (n == 1416) {
            method434.field2734 = field2636;
        }
        else if (n == 1417) {
            method434.field2707 = field2636;
        }
        else if (n == 1418) {
            method434.field2708 = field2636;
        }
        else if (n == 1419) {
            method434.field2637 = field2636;
        }
        else if (n == 1420) {
            method434.field2718 = field2636;
        }
        else if (n == 1421) {
            method434.field2711 = field2636;
        }
        else if (n == 1422) {
            method434.field2712 = field2636;
        }
        else if (n == 1423) {
            method434.field2654 = field2636;
        }
        else if (n == 1424) {
            method434.field2714 = field2636;
        }
        else if (n == 1425) {
            method434.field2716 = field2636;
        }
        else if (n == 1426) {
            method434.field2693 = field2636;
        }
        else {
            if (n != 1427) {
                return 2;
            }
            method434.field2715 = field2636;
        }
        method434.field2686 = true;
        return 1;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(IIIIIIII)Z", garbageValue = "-861297609")
    static final boolean method4494(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final int n8 = Class120.field1649 + n7;
        if (n8 < n && n8 < n2 && n8 < n3) {
            return false;
        }
        final int n9 = Class120.field1649 - n7;
        if (n9 > n && n9 > n2 && n9 > n3) {
            return false;
        }
        final int n10 = Class120.field1648 + n7;
        if (n10 < n4 && n10 < n5 && n10 < n6) {
            return false;
        }
        final int n11 = Class120.field1648 - n7;
        return n11 <= n4 || n11 <= n5 || n11 <= n6;
    }
}
