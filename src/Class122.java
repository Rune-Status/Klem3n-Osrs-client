import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dl")
public class Class122 extends Class314
{
    @ObfuscatedName("z")
    static boolean field1677;
    @ObfuscatedName("w")
    static boolean field1668;
    @ObfuscatedName("s")
    static boolean field1669;
    @ObfuscatedName("l")
    public static boolean field1670;
    @ObfuscatedName("u")
    static int field1671;
    @ObfuscatedName("b")
    public static int field1678;
    @ObfuscatedName("n")
    static int field1687;
    @ObfuscatedName("f")
    static int field1689;
    @ObfuscatedName("g")
    static int field1688;
    @ObfuscatedName("m")
    static int field1672;
    @ObfuscatedName("r")
    static int field1683;
    @ObfuscatedName("t")
    static int field1684;
    @ObfuscatedName("o")
    static int field1685;
    @ObfuscatedName("y")
    static int field1686;
    @ObfuscatedName("a")
    static int[] field1682;
    @ObfuscatedName("j")
    public static int[] field1675;
    @ObfuscatedName("d")
    @ObfuscatedSignature(signature = "Les;")
    public static Class131 field1667;
    @ObfuscatedName("h")
    static int[] field1690;
    @ObfuscatedName("c")
    static int[] field1691;
    @ObfuscatedName("v")
    public static int[] field1681;
    @ObfuscatedName("af")
    public static int[] field1693;
    
    static {
        Class122.field1677 = false;
        Class122.field1668 = false;
        Class122.field1669 = false;
        Class122.field1670 = true;
        Class122.field1671 = 0;
        Class122.field1678 = 512;
        Class122.field1682 = new int[1024];
        Class122.field1675 = new int[65536];
        Class122.field1690 = new int[512];
        Class122.field1691 = new int[2048];
        Class122.field1681 = new int[2048];
        Class122.field1693 = new int[2048];
        for (int i = 1; i < 512; ++i) {
            Class122.field1690[i] = 32768 / i;
        }
        for (int j = 1; j < 2048; ++j) {
            Class122.field1691[j] = 65536 / j;
        }
        for (int k = 0; k < 2048; ++k) {
            Class122.field1681[k] = (int)(65536.0 * Math.sin(k * 0.0030679615));
            Class122.field1693[k] = (int)(65536.0 * Math.cos(k * 0.0030679615));
        }
    }
    
    @ObfuscatedName("z")
    public static final void method2862() {
        method2786(Class314.field3765, Class314.field3763, Class314.field3760, Class314.field3764);
    }
    
    @ObfuscatedName("w")
    static final void method2786(final int n, final int n2, final int n3, final int n4) {
        Class122.field1688 = n3 - n;
        Class122.field1672 = n4 - n2;
        method2832();
        if (Class122.field1682.length < Class122.field1672) {
            Class122.field1682 = new int[Class146.method3193(Class122.field1672)];
        }
        int n5 = n + Class314.field3761 * n2;
        for (int i = 0; i < Class122.field1672; ++i) {
            Class122.field1682[i] = n5;
            n5 += Class314.field3761;
        }
    }
    
    @ObfuscatedName("s")
    public static final void method2832() {
        Class122.field1687 = Class122.field1688 / 2;
        Class122.field1689 = Class122.field1672 / 2;
        Class122.field1683 = -Class122.field1687;
        Class122.field1684 = Class122.field1688 - Class122.field1687;
        Class122.field1685 = -Class122.field1689;
        Class122.field1686 = Class122.field1672 - Class122.field1689;
    }
    
    @ObfuscatedName("l")
    public static final void method2827(final int n, final int n2) {
        final int n3 = Class122.field1682[0];
        final int n4 = n3 / Class314.field3761;
        Class122.field1687 = n - (n3 - n4 * Class314.field3761);
        Class122.field1689 = n2 - n4;
        Class122.field1683 = -Class122.field1687;
        Class122.field1684 = Class122.field1688 - Class122.field1687;
        Class122.field1685 = -Class122.field1689;
        Class122.field1686 = Class122.field1672 - Class122.field1689;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Les;)V")
    public static final void method2789(final Class131 field1667) {
        Class122.field1667 = field1667;
    }
    
    @ObfuscatedName("q")
    public static final void method2830(final double n) {
        method2791(n, 0, 512);
    }
    
    @ObfuscatedName("i")
    static final void method2791(final double n, final int n2, final int n3) {
        int n4 = n2 * 128;
        for (int i = n2; i < n3; ++i) {
            final double n5 = (i >> 3) / 64.0 + 0.0078125;
            final double n6 = (i & 0x7) / 8.0 + 0.0625;
            for (int j = 0; j < 128; ++j) {
                double n10;
                double n9;
                double n8;
                final double n7 = n8 = (n9 = (n10 = j / 128.0));
                if (n6 != 0.0) {
                    double n11;
                    if (n7 < 0.5) {
                        n11 = n7 * (1.0 + n6);
                    }
                    else {
                        n11 = n7 + n6 - n7 * n6;
                    }
                    final double n12 = 2.0 * n7 - n11;
                    double n13 = n5 + 0.3333333333333333;
                    if (n13 > 1.0) {
                        --n13;
                    }
                    final double n14 = n5;
                    double n15 = n5 - 0.3333333333333333;
                    if (n15 < 0.0) {
                        ++n15;
                    }
                    if (6.0 * n13 < 1.0) {
                        n10 = n12 + (n11 - n12) * 6.0 * n13;
                    }
                    else if (2.0 * n13 < 1.0) {
                        n10 = n11;
                    }
                    else if (3.0 * n13 < 2.0) {
                        n10 = n12 + (n11 - n12) * (0.6666666666666666 - n13) * 6.0;
                    }
                    else {
                        n10 = n12;
                    }
                    if (6.0 * n14 < 1.0) {
                        n9 = n12 + (n11 - n12) * 6.0 * n14;
                    }
                    else if (2.0 * n14 < 1.0) {
                        n9 = n11;
                    }
                    else if (3.0 * n14 < 2.0) {
                        n9 = n12 + (n11 - n12) * (0.6666666666666666 - n14) * 6.0;
                    }
                    else {
                        n9 = n12;
                    }
                    if (6.0 * n15 < 1.0) {
                        n8 = n12 + (n11 - n12) * 6.0 * n15;
                    }
                    else if (2.0 * n15 < 1.0) {
                        n8 = n11;
                    }
                    else if (3.0 * n15 < 2.0) {
                        n8 = n12 + (n11 - n12) * (0.6666666666666666 - n15) * 6.0;
                    }
                    else {
                        n8 = n12;
                    }
                }
                int method2792 = method2792((int)(n8 * 256.0) + ((int)(n9 * 256.0) << 8) + ((int)(n10 * 256.0) << 16), n);
                if (method2792 == 0) {
                    method2792 = 1;
                }
                Class122.field1675[n4++] = method2792;
            }
        }
    }
    
    @ObfuscatedName("x")
    static int method2792(final int n, final double n2) {
        return (int)(Math.pow((n & 0xFF) / 256.0, n2) * 256.0) + ((int)(Math.pow((n >> 8 & 0xFF) / 256.0, n2) * 256.0) << 8) + ((int)(Math.pow((n >> 16) / 256.0, n2) * 256.0) << 16);
    }
    
    @ObfuscatedName("e")
    public static void method2793(final int n, final int n2, final int n3) {
        Class122.field1677 = (n < 0 || n > Class122.field1688 || n2 < 0 || n2 > Class122.field1688 || n3 < 0 || n3 > Class122.field1688);
    }
    
    @ObfuscatedName("p")
    static final void method2794(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9) {
        final int n10 = n5 - n4;
        final int n11 = n2 - n;
        final int n12 = n6 - n4;
        final int n13 = n3 - n;
        final int n14 = n8 - n7;
        final int n15 = n9 - n7;
        int n16;
        if (n3 != n2) {
            n16 = (n6 - n5 << 14) / (n3 - n2);
        }
        else {
            n16 = 0;
        }
        int n17;
        if (n != n2) {
            n17 = (n10 << 14) / n11;
        }
        else {
            n17 = 0;
        }
        int n18;
        if (n != n3) {
            n18 = (n12 << 14) / n13;
        }
        else {
            n18 = 0;
        }
        final int n19 = n10 * n13 - n12 * n11;
        if (n19 == 0) {
            return;
        }
        final int n20 = (n14 * n13 - n15 * n11 << 8) / n19;
        final int n21 = (n15 * n10 - n14 * n12 << 8) / n19;
        if (n <= n2 && n <= n3) {
            if (n >= Class122.field1672) {
                return;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            n7 = n20 + ((n7 << 8) - n4 * n20);
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n * n18;
                    n4 -= n * n17;
                    n7 -= n * n21;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n16 * n2;
                    n2 = 0;
                }
                if ((n == n2 || n18 >= n17) && (n != n2 || n18 <= n16)) {
                    n3 -= n2;
                    n2 -= n;
                    n = Class122.field1682[n];
                    while (--n2 >= 0) {
                        method2795(Class314.field3766, n, 0, 0, n4 >> 14, n6 >> 14, n7, n20);
                        n6 += n18;
                        n4 += n17;
                        n7 += n21;
                        n += Class314.field3761;
                    }
                    while (--n3 >= 0) {
                        method2795(Class314.field3766, n, 0, 0, n5 >> 14, n6 >> 14, n7, n20);
                        n6 += n18;
                        n5 += n16;
                        n7 += n21;
                        n += Class314.field3761;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = Class122.field1682[n];
                while (--n2 >= 0) {
                    method2795(Class314.field3766, n, 0, 0, n6 >> 14, n4 >> 14, n7, n20);
                    n6 += n18;
                    n4 += n17;
                    n7 += n21;
                    n += Class314.field3761;
                }
                while (--n3 >= 0) {
                    method2795(Class314.field3766, n, 0, 0, n6 >> 14, n5 >> 14, n7, n20);
                    n6 += n18;
                    n5 += n16;
                    n7 += n21;
                    n += Class314.field3761;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n * n18;
                    n4 -= n * n17;
                    n7 -= n * n21;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n16 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n18 >= n17) && (n != n3 || n16 <= n17)) {
                    n2 -= n3;
                    n3 -= n;
                    n = Class122.field1682[n];
                    while (--n3 >= 0) {
                        method2795(Class314.field3766, n, 0, 0, n4 >> 14, n5 >> 14, n7, n20);
                        n5 += n18;
                        n4 += n17;
                        n7 += n21;
                        n += Class314.field3761;
                    }
                    while (--n2 >= 0) {
                        method2795(Class314.field3766, n, 0, 0, n4 >> 14, n6 >> 14, n7, n20);
                        n6 += n16;
                        n4 += n17;
                        n7 += n21;
                        n += Class314.field3761;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = Class122.field1682[n];
                while (--n3 >= 0) {
                    method2795(Class314.field3766, n, 0, 0, n5 >> 14, n4 >> 14, n7, n20);
                    n5 += n18;
                    n4 += n17;
                    n7 += n21;
                    n += Class314.field3761;
                }
                while (--n2 >= 0) {
                    method2795(Class314.field3766, n, 0, 0, n6 >> 14, n4 >> 14, n7, n20);
                    n6 += n16;
                    n4 += n17;
                    n7 += n21;
                    n += Class314.field3761;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= Class122.field1672) {
                return;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            n8 = n20 + ((n8 << 8) - n20 * n5);
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n17 * n2;
                    n5 -= n16 * n2;
                    n8 -= n21 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n18 * n3;
                    n3 = 0;
                }
                if ((n3 == n2 || n17 >= n16) && (n3 != n2 || n17 <= n18)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n3 >= 0) {
                        method2795(Class314.field3766, n2, 0, 0, n5 >> 14, n4 >> 14, n8, n20);
                        n4 += n17;
                        n5 += n16;
                        n8 += n21;
                        n2 += Class314.field3761;
                    }
                    while (--n >= 0) {
                        method2795(Class314.field3766, n2, 0, 0, n6 >> 14, n4 >> 14, n8, n20);
                        n4 += n17;
                        n6 += n18;
                        n8 += n21;
                        n2 += Class314.field3761;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = Class122.field1682[n2];
                while (--n3 >= 0) {
                    method2795(Class314.field3766, n2, 0, 0, n4 >> 14, n5 >> 14, n8, n20);
                    n4 += n17;
                    n5 += n16;
                    n8 += n21;
                    n2 += Class314.field3761;
                }
                while (--n >= 0) {
                    method2795(Class314.field3766, n2, 0, 0, n4 >> 14, n6 >> 14, n8, n20);
                    n4 += n17;
                    n6 += n18;
                    n8 += n21;
                    n2 += Class314.field3761;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n17 * n2;
                    n5 -= n16 * n2;
                    n8 -= n21 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n18;
                    n = 0;
                }
                if (n17 < n16) {
                    n3 -= n;
                    n -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n >= 0) {
                        method2795(Class314.field3766, n2, 0, 0, n6 >> 14, n5 >> 14, n8, n20);
                        n6 += n17;
                        n5 += n16;
                        n8 += n21;
                        n2 += Class314.field3761;
                    }
                    while (--n3 >= 0) {
                        method2795(Class314.field3766, n2, 0, 0, n4 >> 14, n5 >> 14, n8, n20);
                        n4 += n18;
                        n5 += n16;
                        n8 += n21;
                        n2 += Class314.field3761;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = Class122.field1682[n2];
                while (--n >= 0) {
                    method2795(Class314.field3766, n2, 0, 0, n5 >> 14, n6 >> 14, n8, n20);
                    n6 += n17;
                    n5 += n16;
                    n8 += n21;
                    n2 += Class314.field3761;
                }
                while (--n3 >= 0) {
                    method2795(Class314.field3766, n2, 0, 0, n5 >> 14, n4 >> 14, n8, n20);
                    n4 += n18;
                    n5 += n16;
                    n8 += n21;
                    n2 += Class314.field3761;
                }
            }
        }
        else {
            if (n3 >= Class122.field1672) {
                return;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            n9 = n20 + ((n9 << 8) - n6 * n20);
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n16 * n3;
                    n6 -= n18 * n3;
                    n9 -= n21 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n17;
                    n = 0;
                }
                if (n16 < n18) {
                    n2 -= n;
                    n -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n >= 0) {
                        method2795(Class314.field3766, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n20);
                        n5 += n16;
                        n6 += n18;
                        n9 += n21;
                        n3 += Class314.field3761;
                    }
                    while (--n2 >= 0) {
                        method2795(Class314.field3766, n3, 0, 0, n5 >> 14, n4 >> 14, n9, n20);
                        n5 += n16;
                        n4 += n17;
                        n9 += n21;
                        n3 += Class314.field3761;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = Class122.field1682[n3];
                while (--n >= 0) {
                    method2795(Class314.field3766, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n20);
                    n5 += n16;
                    n6 += n18;
                    n9 += n21;
                    n3 += Class314.field3761;
                }
                while (--n2 >= 0) {
                    method2795(Class314.field3766, n3, 0, 0, n4 >> 14, n5 >> 14, n9, n20);
                    n5 += n16;
                    n4 += n17;
                    n9 += n21;
                    n3 += Class314.field3761;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n16 * n3;
                    n6 -= n18 * n3;
                    n9 -= n21 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n17 * n2;
                    n2 = 0;
                }
                if (n16 < n18) {
                    n -= n2;
                    n2 -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n2 >= 0) {
                        method2795(Class314.field3766, n3, 0, 0, n4 >> 14, n6 >> 14, n9, n20);
                        n4 += n16;
                        n6 += n18;
                        n9 += n21;
                        n3 += Class314.field3761;
                    }
                    while (--n >= 0) {
                        method2795(Class314.field3766, n3, 0, 0, n5 >> 14, n6 >> 14, n9, n20);
                        n5 += n17;
                        n6 += n18;
                        n9 += n21;
                        n3 += Class314.field3761;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = Class122.field1682[n3];
                while (--n2 >= 0) {
                    method2795(Class314.field3766, n3, 0, 0, n6 >> 14, n4 >> 14, n9, n20);
                    n4 += n16;
                    n6 += n18;
                    n9 += n21;
                    n3 += Class314.field3761;
                }
                while (--n >= 0) {
                    method2795(Class314.field3766, n3, 0, 0, n6 >> 14, n5 >> 14, n9, n20);
                    n5 += n17;
                    n6 += n18;
                    n9 += n21;
                    n3 += Class314.field3761;
                }
            }
        }
    }
    
    @ObfuscatedName("b")
    static final void method2795(final int[] array, int n, int n2, int n3, int n4, int field1688, int n5, int n6) {
        if (Class122.field1677) {
            if (field1688 > Class122.field1688) {
                field1688 = Class122.field1688;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= field1688) {
            return;
        }
        n += n4;
        n5 += n4 * n6;
        if (Class122.field1670) {
            n3 = field1688 - n4 >> 2;
            n6 <<= 2;
            if (Class122.field1671 == 0) {
                if (n3 > 0) {
                    do {
                        n2 = Class122.field1675[n5 >> 8];
                        n5 += n6;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
                n3 = (field1688 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = Class122.field1675[n5 >> 8];
                    do {
                        array[n++] = n2;
                    } while (--n3 > 0);
                }
            }
            else {
                final int field1689 = Class122.field1671;
                final int n7 = 256 - Class122.field1671;
                if (n3 > 0) {
                    do {
                        n2 = Class122.field1675[n5 >> 8];
                        n5 += n6;
                        n2 = (n7 * (n2 & 0xFF00) >> 8 & 0xFF00) + (n7 * (n2 & 0xFF00FF) >> 8 & 0xFF00FF);
                        final int n8 = array[n];
                        array[n++] = ((n8 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n8 & 0xFF00) >> 8 & 0xFF00);
                        final int n9 = array[n];
                        array[n++] = ((n9 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n9 & 0xFF00) >> 8 & 0xFF00);
                        final int n10 = array[n];
                        array[n++] = ((n10 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n10 & 0xFF00) >> 8 & 0xFF00);
                        final int n11 = array[n];
                        array[n++] = ((n11 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n11 & 0xFF00) >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
                n3 = (field1688 - n4 & 0x3);
                if (n3 > 0) {
                    n2 = Class122.field1675[n5 >> 8];
                    n2 = (n7 * (n2 & 0xFF00) >> 8 & 0xFF00) + (n7 * (n2 & 0xFF00FF) >> 8 & 0xFF00FF);
                    do {
                        final int n12 = array[n];
                        array[n++] = ((n12 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n12 & 0xFF00) >> 8 & 0xFF00);
                    } while (--n3 > 0);
                }
            }
            return;
        }
        n3 = field1688 - n4;
        if (Class122.field1671 == 0) {
            do {
                array[n++] = Class122.field1675[n5 >> 8];
                n5 += n6;
            } while (--n3 > 0);
        }
        else {
            final int field1690 = Class122.field1671;
            final int n13 = 256 - Class122.field1671;
            do {
                n2 = Class122.field1675[n5 >> 8];
                n5 += n6;
                n2 = (n13 * (n2 & 0xFF00) >> 8 & 0xFF00) + (n13 * (n2 & 0xFF00FF) >> 8 & 0xFF00FF);
                final int n14 = array[n];
                array[n++] = ((n14 & 0xFF00FF) * field1690 >> 8 & 0xFF00FF) + n2 + (field1690 * (n14 & 0xFF00) >> 8 & 0xFF00);
            } while (--n3 > 0);
        }
    }
    
    @ObfuscatedName("n")
    public static final void method2796(int n, int n2, int n3, int n4, int n5, int n6, final int n7) {
        int n8 = 0;
        if (n != n2) {
            n8 = (n5 - n4 << 14) / (n2 - n);
        }
        int n9 = 0;
        if (n3 != n2) {
            n9 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n10 = 0;
        if (n != n3) {
            n10 = (n4 - n6 << 14) / (n - n3);
        }
        if (n <= n2 && n <= n3) {
            if (n >= Class122.field1672) {
                return;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n * n10;
                    n4 -= n * n8;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                if ((n != n2 && n10 < n8) || (n == n2 && n10 > n9)) {
                    n3 -= n2;
                    n2 -= n;
                    n = Class122.field1682[n];
                    while (--n2 >= 0) {
                        method2825(Class314.field3766, n, n7, 0, n6 >> 14, n4 >> 14);
                        n6 += n10;
                        n4 += n8;
                        n += Class314.field3761;
                    }
                    while (--n3 >= 0) {
                        method2825(Class314.field3766, n, n7, 0, n6 >> 14, n5 >> 14);
                        n6 += n10;
                        n5 += n9;
                        n += Class314.field3761;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = Class122.field1682[n];
                while (--n2 >= 0) {
                    method2825(Class314.field3766, n, n7, 0, n4 >> 14, n6 >> 14);
                    n6 += n10;
                    n4 += n8;
                    n += Class314.field3761;
                }
                while (--n3 >= 0) {
                    method2825(Class314.field3766, n, n7, 0, n5 >> 14, n6 >> 14);
                    n6 += n10;
                    n5 += n9;
                    n += Class314.field3761;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n * n10;
                    n4 -= n * n8;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n9 * n3;
                    n3 = 0;
                }
                if ((n == n3 || n10 >= n8) && (n != n3 || n9 <= n8)) {
                    n2 -= n3;
                    n3 -= n;
                    n = Class122.field1682[n];
                    while (--n3 >= 0) {
                        method2825(Class314.field3766, n, n7, 0, n4 >> 14, n5 >> 14);
                        n5 += n10;
                        n4 += n8;
                        n += Class314.field3761;
                    }
                    while (--n2 >= 0) {
                        method2825(Class314.field3766, n, n7, 0, n4 >> 14, n6 >> 14);
                        n6 += n9;
                        n4 += n8;
                        n += Class314.field3761;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = Class122.field1682[n];
                while (--n3 >= 0) {
                    method2825(Class314.field3766, n, n7, 0, n5 >> 14, n4 >> 14);
                    n5 += n10;
                    n4 += n8;
                    n += Class314.field3761;
                }
                while (--n2 >= 0) {
                    method2825(Class314.field3766, n, n7, 0, n6 >> 14, n4 >> 14);
                    n6 += n9;
                    n4 += n8;
                    n += Class314.field3761;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= Class122.field1672) {
                return;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                if ((n3 == n2 || n8 >= n9) && (n3 != n2 || n8 <= n10)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n3 >= 0) {
                        method2825(Class314.field3766, n2, n7, 0, n5 >> 14, n4 >> 14);
                        n4 += n8;
                        n5 += n9;
                        n2 += Class314.field3761;
                    }
                    while (--n >= 0) {
                        method2825(Class314.field3766, n2, n7, 0, n6 >> 14, n4 >> 14);
                        n4 += n8;
                        n6 += n10;
                        n2 += Class314.field3761;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = Class122.field1682[n2];
                while (--n3 >= 0) {
                    method2825(Class314.field3766, n2, n7, 0, n4 >> 14, n5 >> 14);
                    n4 += n8;
                    n5 += n9;
                    n2 += Class314.field3761;
                }
                while (--n >= 0) {
                    method2825(Class314.field3766, n2, n7, 0, n4 >> 14, n6 >> 14);
                    n4 += n8;
                    n6 += n10;
                    n2 += Class314.field3761;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n8 * n2;
                    n5 -= n9 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n10;
                    n = 0;
                }
                if (n8 < n9) {
                    n3 -= n;
                    n -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n >= 0) {
                        method2825(Class314.field3766, n2, n7, 0, n6 >> 14, n5 >> 14);
                        n6 += n8;
                        n5 += n9;
                        n2 += Class314.field3761;
                    }
                    while (--n3 >= 0) {
                        method2825(Class314.field3766, n2, n7, 0, n4 >> 14, n5 >> 14);
                        n4 += n10;
                        n5 += n9;
                        n2 += Class314.field3761;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = Class122.field1682[n2];
                while (--n >= 0) {
                    method2825(Class314.field3766, n2, n7, 0, n5 >> 14, n6 >> 14);
                    n6 += n8;
                    n5 += n9;
                    n2 += Class314.field3761;
                }
                while (--n3 >= 0) {
                    method2825(Class314.field3766, n2, n7, 0, n5 >> 14, n4 >> 14);
                    n4 += n10;
                    n5 += n9;
                    n2 += Class314.field3761;
                }
            }
        }
        else {
            if (n3 >= Class122.field1672) {
                return;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n8;
                    n = 0;
                }
                if (n9 < n10) {
                    n2 -= n;
                    n -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n >= 0) {
                        method2825(Class314.field3766, n3, n7, 0, n5 >> 14, n6 >> 14);
                        n5 += n9;
                        n6 += n10;
                        n3 += Class314.field3761;
                    }
                    while (--n2 >= 0) {
                        method2825(Class314.field3766, n3, n7, 0, n5 >> 14, n4 >> 14);
                        n5 += n9;
                        n4 += n8;
                        n3 += Class314.field3761;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = Class122.field1682[n3];
                while (--n >= 0) {
                    method2825(Class314.field3766, n3, n7, 0, n6 >> 14, n5 >> 14);
                    n5 += n9;
                    n6 += n10;
                    n3 += Class314.field3761;
                }
                while (--n2 >= 0) {
                    method2825(Class314.field3766, n3, n7, 0, n4 >> 14, n5 >> 14);
                    n5 += n9;
                    n4 += n8;
                    n3 += Class314.field3761;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n9 * n3;
                    n6 -= n10 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n8 * n2;
                    n2 = 0;
                }
                if (n9 < n10) {
                    n -= n2;
                    n2 -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n2 >= 0) {
                        method2825(Class314.field3766, n3, n7, 0, n4 >> 14, n6 >> 14);
                        n4 += n9;
                        n6 += n10;
                        n3 += Class314.field3761;
                    }
                    while (--n >= 0) {
                        method2825(Class314.field3766, n3, n7, 0, n5 >> 14, n6 >> 14);
                        n5 += n8;
                        n6 += n10;
                        n3 += Class314.field3761;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = Class122.field1682[n3];
                while (--n2 >= 0) {
                    method2825(Class314.field3766, n3, n7, 0, n6 >> 14, n4 >> 14);
                    n4 += n9;
                    n6 += n10;
                    n3 += Class314.field3761;
                }
                while (--n >= 0) {
                    method2825(Class314.field3766, n3, n7, 0, n6 >> 14, n5 >> 14);
                    n5 += n8;
                    n6 += n10;
                    n3 += Class314.field3761;
                }
            }
        }
    }
    
    @ObfuscatedName("f")
    static final void method2825(final int[] array, int n, int n2, int n3, int n4, int field1688) {
        if (Class122.field1677) {
            if (field1688 > Class122.field1688) {
                field1688 = Class122.field1688;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= field1688) {
            return;
        }
        n += n4;
        n3 = field1688 - n4 >> 2;
        if (Class122.field1671 == 0) {
            while (--n3 >= 0) {
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
                array[n++] = n2;
            }
            n3 = (field1688 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = n2;
            }
        }
        else if (Class122.field1671 == 254) {
            while (--n3 >= 0) {
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
                array[n++] = array[n];
            }
            n3 = (field1688 - n4 & 0x3);
            while (--n3 >= 0) {
                array[n++] = array[n];
            }
        }
        else {
            final int field1689 = Class122.field1671;
            final int n5 = 256 - Class122.field1671;
            n2 = (n5 * (n2 & 0xFF00) >> 8 & 0xFF00) + (n5 * (n2 & 0xFF00FF) >> 8 & 0xFF00FF);
            while (--n3 >= 0) {
                final int n6 = array[n];
                array[n++] = ((n6 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n6 & 0xFF00) >> 8 & 0xFF00);
                final int n7 = array[n];
                array[n++] = ((n7 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n7 & 0xFF00) >> 8 & 0xFF00);
                final int n8 = array[n];
                array[n++] = ((n8 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n8 & 0xFF00) >> 8 & 0xFF00);
                final int n9 = array[n];
                array[n++] = ((n9 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n9 & 0xFF00) >> 8 & 0xFF00);
            }
            n3 = (field1688 - n4 & 0x3);
            while (--n3 >= 0) {
                final int n10 = array[n];
                array[n++] = ((n10 & 0xFF00FF) * field1689 >> 8 & 0xFF00FF) + n2 + (field1689 * (n10 & 0xFF00) >> 8 & 0xFF00);
            }
        }
    }
    
    @ObfuscatedName("g")
    static final void method2804(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, final int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19) {
        final int[] vmethod3079 = Class122.field1667.vmethod3079(n19);
        if (vmethod3079 == null) {
            final int vmethod3080 = Class122.field1667.vmethod3092(n19);
            method2794(n, n2, n3, n4, n5, n6, method2802(vmethod3080, n7), method2802(vmethod3080, n8), method2802(vmethod3080, n9));
            return;
        }
        Class122.field1669 = Class122.field1667.vmethod3082(n19);
        Class122.field1668 = Class122.field1667.vmethod3081(n19);
        final int n20 = n5 - n4;
        final int n21 = n2 - n;
        final int n22 = n6 - n4;
        final int n23 = n3 - n;
        final int n24 = n8 - n7;
        final int n25 = n9 - n7;
        int n26 = 0;
        if (n != n2) {
            n26 = (n5 - n4 << 14) / (n2 - n);
        }
        int n27 = 0;
        if (n3 != n2) {
            n27 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n28 = 0;
        if (n != n3) {
            n28 = (n4 - n6 << 14) / (n - n3);
        }
        final int n29 = n20 * n23 - n22 * n21;
        if (n29 == 0) {
            return;
        }
        final int n30 = (n24 * n23 - n25 * n21 << 9) / n29;
        final int n31 = (n25 * n20 - n24 * n22 << 9) / n29;
        n11 = n10 - n11;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n12 -= n10;
        n15 -= n13;
        n18 -= n16;
        final int n32 = n12 * n13 - n10 * n15 << 14;
        final int n33 = (n16 * n15 - n18 * n13 << 3 << 14) / Class122.field1678;
        final int n34 = (n18 * n10 - n12 * n16 << 14) / Class122.field1678;
        final int n35 = n11 * n13 - n14 * n10 << 14;
        final int n36 = (n14 * n16 - n17 * n13 << 3 << 14) / Class122.field1678;
        final int n37 = (n17 * n10 - n11 * n16 << 14) / Class122.field1678;
        final int n38 = n14 * n12 - n11 * n15 << 14;
        final int n39 = (n17 * n15 - n14 * n18 << 3 << 14) / Class122.field1678;
        final int n40 = (n18 * n11 - n12 * n17 << 14) / Class122.field1678;
        if (n <= n2 && n <= n3) {
            if (n >= Class122.field1672) {
                return;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            n7 = n30 + ((n7 << 9) - n4 * n30);
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n * n28;
                    n4 -= n * n26;
                    n7 -= n * n31;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n27 * n2;
                    n2 = 0;
                }
                final int n41 = n - Class122.field1689;
                int n42 = n32 + n34 * n41;
                int n43 = n35 + n37 * n41;
                int n44 = n38 + n40 * n41;
                if ((n == n2 || n28 >= n26) && (n != n2 || n28 <= n27)) {
                    n3 -= n2;
                    n2 -= n;
                    n = Class122.field1682[n];
                    while (--n2 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                        n6 += n28;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n42 += n34;
                        n43 += n37;
                        n44 += n40;
                    }
                    while (--n3 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n, n5 >> 14, n6 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                        n6 += n28;
                        n5 += n27;
                        n7 += n31;
                        n += Class314.field3761;
                        n42 += n34;
                        n43 += n37;
                        n44 += n40;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = Class122.field1682[n];
                while (--n2 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                    n6 += n28;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n42 += n34;
                    n43 += n37;
                    n44 += n40;
                }
                while (--n3 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n5 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                    n6 += n28;
                    n5 += n27;
                    n7 += n31;
                    n += Class314.field3761;
                    n42 += n34;
                    n43 += n37;
                    n44 += n40;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n * n28;
                    n4 -= n * n26;
                    n7 -= n * n31;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n27 * n3;
                    n3 = 0;
                }
                final int n45 = n - Class122.field1689;
                int n46 = n32 + n34 * n45;
                int n47 = n35 + n37 * n45;
                int n48 = n38 + n40 * n45;
                if ((n == n3 || n28 >= n26) && (n != n3 || n27 <= n26)) {
                    n2 -= n3;
                    n3 -= n;
                    n = Class122.field1682[n];
                    while (--n3 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n5 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                        n5 += n28;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n46 += n34;
                        n47 += n37;
                        n48 += n40;
                    }
                    while (--n2 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                        n6 += n27;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n46 += n34;
                        n47 += n37;
                        n48 += n40;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = Class122.field1682[n];
                while (--n3 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n, n5 >> 14, n4 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                    n5 += n28;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n46 += n34;
                    n47 += n37;
                    n48 += n40;
                }
                while (--n2 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                    n6 += n27;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n46 += n34;
                    n47 += n37;
                    n48 += n40;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= Class122.field1672) {
                return;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            n8 = n30 + ((n8 << 9) - n30 * n5);
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n26 * n2;
                    n5 -= n27 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n28 * n3;
                    n3 = 0;
                }
                final int n49 = n2 - Class122.field1689;
                int n50 = n32 + n34 * n49;
                int n51 = n35 + n37 * n49;
                int n52 = n38 + n40 * n49;
                if ((n3 == n2 || n26 >= n27) && (n3 != n2 || n26 <= n28)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n3 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                        n4 += n26;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n50 += n34;
                        n51 += n37;
                        n52 += n40;
                    }
                    while (--n >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n2, n6 >> 14, n4 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                        n4 += n26;
                        n6 += n28;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n50 += n34;
                        n51 += n37;
                        n52 += n40;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = Class122.field1682[n2];
                while (--n3 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                    n4 += n26;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n50 += n34;
                    n51 += n37;
                    n52 += n40;
                }
                while (--n >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n6 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                    n4 += n26;
                    n6 += n28;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n50 += n34;
                    n51 += n37;
                    n52 += n40;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n26 * n2;
                    n5 -= n27 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n28;
                    n = 0;
                }
                final int n53 = n2 - Class122.field1689;
                int n54 = n32 + n34 * n53;
                int n55 = n35 + n37 * n53;
                int n56 = n38 + n40 * n53;
                if (n26 < n27) {
                    n3 -= n;
                    n -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                        n6 += n26;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n54 += n34;
                        n55 += n37;
                        n56 += n40;
                    }
                    while (--n3 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                        n4 += n28;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n54 += n34;
                        n55 += n37;
                        n56 += n40;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = Class122.field1682[n2];
                while (--n >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                    n6 += n26;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n54 += n34;
                    n55 += n37;
                    n56 += n40;
                }
                while (--n3 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                    n4 += n28;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n54 += n34;
                    n55 += n37;
                    n56 += n40;
                }
            }
        }
        else {
            if (n3 >= Class122.field1672) {
                return;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            n9 = (n9 << 9) - n6 * n30 + n30;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n27 * n3;
                    n6 -= n28 * n3;
                    n9 -= n31 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n26;
                    n = 0;
                }
                final int n57 = n3 - Class122.field1689;
                int n58 = n32 + n34 * n57;
                int n59 = n35 + n37 * n57;
                int n60 = n38 + n40 * n57;
                if (n27 < n28) {
                    n2 -= n;
                    n -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                        n5 += n27;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n58 += n34;
                        n59 += n37;
                        n60 += n40;
                    }
                    while (--n2 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n4 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                        n5 += n27;
                        n4 += n26;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n58 += n34;
                        n59 += n37;
                        n60 += n40;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = Class122.field1682[n3];
                while (--n >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                    n5 += n27;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n58 += n34;
                    n59 += n37;
                    n60 += n40;
                }
                while (--n2 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n3, n4 >> 14, n5 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                    n5 += n27;
                    n4 += n26;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n58 += n34;
                    n59 += n37;
                    n60 += n40;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n27 * n3;
                    n6 -= n28 * n3;
                    n9 -= n31 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n26 * n2;
                    n2 = 0;
                }
                final int n61 = n3 - Class122.field1689;
                int n62 = n32 + n34 * n61;
                int n63 = n35 + n37 * n61;
                int n64 = n38 + n40 * n61;
                if (n27 < n28) {
                    n -= n2;
                    n2 -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n2 >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n3, n4 >> 14, n6 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                        n4 += n27;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n62 += n34;
                        n63 += n37;
                        n64 += n40;
                    }
                    while (--n >= 0) {
                        method2813(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                        n5 += n26;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n62 += n34;
                        n63 += n37;
                        n64 += n40;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = Class122.field1682[n3];
                while (--n2 >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n4 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                    n4 += n27;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n62 += n34;
                    n63 += n37;
                    n64 += n40;
                }
                while (--n >= 0) {
                    method2813(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                    n5 += n26;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n62 += n34;
                    n63 += n37;
                    n64 += n40;
                }
            }
        }
    }
    
    @ObfuscatedName("m")
    static final void method2813(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int field1688, int n5, int n6, int n7, int n8, int n9, final int n10, final int n11, final int n12) {
        if (Class122.field1677) {
            if (field1688 > Class122.field1688) {
                field1688 = Class122.field1688;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= field1688) {
            return;
        }
        n3 += n4;
        n5 += n4 * n6;
        final int n13 = field1688 - n4;
        if (Class122.field1669) {
            final int n14 = n4 - Class122.field1687;
            n7 += n14 * (n10 >> 3);
            n8 += (n11 >> 3) * n14;
            n9 += n14 * (n12 >> 3);
            final int n15 = n9 >> 12;
            int n16;
            int n17;
            if (n15 != 0) {
                n16 = n7 / n15;
                n17 = n8 / n15;
                if (n16 < 0) {
                    n16 = 0;
                }
                else if (n16 > 4032) {
                    n16 = 4032;
                }
            }
            else {
                n16 = 0;
                n17 = 0;
            }
            n7 += n10;
            n8 += n11;
            n9 += n12;
            final int n18 = n9 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n7 / n18;
                n20 = n8 / n18;
                if (n19 < 0) {
                    n19 = 0;
                }
                else if (n19 > 4032) {
                    n19 = 4032;
                }
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n = (n16 << 20) + n17;
            int n21 = (n20 - n17 >> 3) + (n19 - n16 >> 3 << 20);
            int n22 = n13 >> 3;
            n6 <<= 3;
            int n23 = n5 >> 8;
            if (Class122.field1668) {
                if (n22 > 0) {
                    do {
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        final int n24 = n19;
                        final int n25 = n20;
                        n7 += n10;
                        n8 += n11;
                        n9 += n12;
                        final int n26 = n9 >> 12;
                        if (n26 != 0) {
                            n19 = n7 / n26;
                            n20 = n8 / n26;
                            if (n19 < 0) {
                                n19 = 0;
                            }
                            else if (n19 > 4032) {
                                n19 = 4032;
                            }
                        }
                        else {
                            n19 = 0;
                            n20 = 0;
                        }
                        n = (n24 << 20) + n25;
                        n21 = (n20 - n25 >> 3) + (n19 - n24 >> 3 << 20);
                        n5 += n6;
                        n23 = n5 >> 8;
                    } while (--n22 > 0);
                }
                int n27 = field1688 - n4 & 0x7;
                if (n27 > 0) {
                    do {
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                    } while (--n27 > 0);
                }
            }
            else {
                if (n22 > 0) {
                    do {
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        final int n28 = n19;
                        final int n29 = n20;
                        n7 += n10;
                        n8 += n11;
                        n9 += n12;
                        final int n30 = n9 >> 12;
                        if (n30 != 0) {
                            n19 = n7 / n30;
                            n20 = n8 / n30;
                            if (n19 < 0) {
                                n19 = 0;
                            }
                            else if (n19 > 4032) {
                                n19 = 4032;
                            }
                        }
                        else {
                            n19 = 0;
                            n20 = 0;
                        }
                        n = (n28 << 20) + n29;
                        n21 = (n20 - n29 >> 3) + (n19 - n28 >> 3 << 20);
                        n5 += n6;
                        n23 = n5 >> 8;
                    } while (--n22 > 0);
                }
                int n31 = field1688 - n4 & 0x7;
                if (n31 > 0) {
                    do {
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                    } while (--n31 > 0);
                }
            }
        }
        else {
            final int n32 = n4 - Class122.field1687;
            n7 += n32 * (n10 >> 3);
            n8 += (n11 >> 3) * n32;
            n9 += n32 * (n12 >> 3);
            final int n33 = n9 >> 14;
            int n34;
            int n35;
            if (n33 != 0) {
                n34 = n7 / n33;
                n35 = n8 / n33;
                if (n34 < 0) {
                    n34 = 0;
                }
                else if (n34 > 16256) {
                    n34 = 16256;
                }
            }
            else {
                n34 = 0;
                n35 = 0;
            }
            n7 += n10;
            n8 += n11;
            n9 += n12;
            final int n36 = n9 >> 14;
            int n37;
            int n38;
            if (n36 != 0) {
                n37 = n7 / n36;
                n38 = n8 / n36;
                if (n37 < 0) {
                    n37 = 0;
                }
                else if (n37 > 16256) {
                    n37 = 16256;
                }
            }
            else {
                n37 = 0;
                n38 = 0;
            }
            n = (n34 << 18) + n35;
            int n39 = (n38 - n35 >> 3) + (n37 - n34 >> 3 << 18);
            int n40 = n13 >> 3;
            n6 <<= 3;
            int n41 = n5 >> 8;
            if (Class122.field1668) {
                if (n40 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                        final int n42 = n37;
                        final int n43 = n38;
                        n7 += n10;
                        n8 += n11;
                        n9 += n12;
                        final int n44 = n9 >> 14;
                        if (n44 != 0) {
                            n37 = n7 / n44;
                            n38 = n8 / n44;
                            if (n37 < 0) {
                                n37 = 0;
                            }
                            else if (n37 > 16256) {
                                n37 = 16256;
                            }
                        }
                        else {
                            n37 = 0;
                            n38 = 0;
                        }
                        n = (n42 << 18) + n43;
                        n39 = (n38 - n43 >> 3) + (n37 - n42 >> 3 << 18);
                        n5 += n6;
                        n41 = n5 >> 8;
                    } while (--n40 > 0);
                }
                int n45 = field1688 - n4 & 0x7;
                if (n45 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        n += n39;
                    } while (--n45 > 0);
                }
            }
            else {
                if (n40 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                        final int n46 = n37;
                        final int n47 = n38;
                        n7 += n10;
                        n8 += n11;
                        n9 += n12;
                        final int n48 = n9 >> 14;
                        if (n48 != 0) {
                            n37 = n7 / n48;
                            n38 = n8 / n48;
                            if (n37 < 0) {
                                n37 = 0;
                            }
                            else if (n37 > 16256) {
                                n37 = 16256;
                            }
                        }
                        else {
                            n37 = 0;
                            n38 = 0;
                        }
                        n = (n46 << 18) + n47;
                        n39 = (n38 - n47 >> 3) + (n37 - n46 >> 3 << 18);
                        n5 += n6;
                        n41 = n5 >> 8;
                    } while (--n40 > 0);
                }
                int n49 = field1688 - n4 & 0x7;
                if (n49 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n41 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n41 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n39;
                    } while (--n49 > 0);
                }
            }
        }
    }
    
    @ObfuscatedName("r")
    static final void method2800(int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, final int n10, int n11, int n12, final int n13, int n14, int n15, final int n16, int n17, int n18, final int n19) {
        final int[] vmethod3079 = Class122.field1667.vmethod3079(n19);
        if (vmethod3079 == null) {
            final int vmethod3080 = Class122.field1667.vmethod3092(n19);
            method2794(n, n2, n3, n4, n5, n6, method2802(vmethod3080, n7), method2802(vmethod3080, n8), method2802(vmethod3080, n9));
            return;
        }
        Class122.field1669 = Class122.field1667.vmethod3082(n19);
        Class122.field1668 = Class122.field1667.vmethod3081(n19);
        final int n20 = n5 - n4;
        final int n21 = n2 - n;
        final int n22 = n6 - n4;
        final int n23 = n3 - n;
        final int n24 = n8 - n7;
        final int n25 = n9 - n7;
        int n26 = 0;
        if (n != n2) {
            n26 = (n5 - n4 << 14) / (n2 - n);
        }
        int n27 = 0;
        if (n3 != n2) {
            n27 = (n6 - n5 << 14) / (n3 - n2);
        }
        int n28 = 0;
        if (n != n3) {
            n28 = (n4 - n6 << 14) / (n - n3);
        }
        final int n29 = n20 * n23 - n22 * n21;
        if (n29 == 0) {
            return;
        }
        final int n30 = (n24 * n23 - n25 * n21 << 9) / n29;
        final int n31 = (n25 * n20 - n24 * n22 << 9) / n29;
        n11 = n10 - n11;
        n14 = n13 - n14;
        n17 = n16 - n17;
        n12 -= n10;
        n15 -= n13;
        n18 -= n16;
        final int n32 = n12 * n13 - n10 * n15 << 14;
        final int n33 = (n16 * n15 - n18 * n13 << 14) / Class122.field1678;
        final int n34 = (n18 * n10 - n12 * n16 << 14) / Class122.field1678;
        final int n35 = n11 * n13 - n14 * n10 << 14;
        final int n36 = (n14 * n16 - n17 * n13 << 14) / Class122.field1678;
        final int n37 = (n17 * n10 - n11 * n16 << 14) / Class122.field1678;
        final int n38 = n14 * n12 - n11 * n15 << 14;
        final int n39 = (n17 * n15 - n14 * n18 << 14) / Class122.field1678;
        final int n40 = (n18 * n11 - n12 * n17 << 14) / Class122.field1678;
        if (n <= n2 && n <= n3) {
            if (n >= Class122.field1672) {
                return;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            n7 = n30 + ((n7 << 9) - n4 * n30);
            if (n2 < n3) {
                n4 = (n6 = n4 << 14);
                if (n < 0) {
                    n6 -= n * n28;
                    n4 -= n * n26;
                    n7 -= n * n31;
                    n = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n27 * n2;
                    n2 = 0;
                }
                final int n41 = n - Class122.field1689;
                int n42 = n32 + n34 * n41;
                int n43 = n35 + n37 * n41;
                int n44 = n38 + n40 * n41;
                if ((n == n2 || n28 >= n26) && (n != n2 || n28 <= n27)) {
                    n3 -= n2;
                    n2 -= n;
                    n = Class122.field1682[n];
                    while (--n2 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                        n6 += n28;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n42 += n34;
                        n43 += n37;
                        n44 += n40;
                    }
                    while (--n3 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n, n5 >> 14, n6 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                        n6 += n28;
                        n5 += n27;
                        n7 += n31;
                        n += Class314.field3761;
                        n42 += n34;
                        n43 += n37;
                        n44 += n40;
                    }
                    return;
                }
                n3 -= n2;
                n2 -= n;
                n = Class122.field1682[n];
                while (--n2 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                    n6 += n28;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n42 += n34;
                    n43 += n37;
                    n44 += n40;
                }
                while (--n3 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n5 >> 14, n7, n30, n42, n43, n44, n33, n36, n39);
                    n6 += n28;
                    n5 += n27;
                    n7 += n31;
                    n += Class314.field3761;
                    n42 += n34;
                    n43 += n37;
                    n44 += n40;
                }
            }
            else {
                n4 = (n5 = n4 << 14);
                if (n < 0) {
                    n5 -= n * n28;
                    n4 -= n * n26;
                    n7 -= n * n31;
                    n = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n27 * n3;
                    n3 = 0;
                }
                final int n45 = n - Class122.field1689;
                int n46 = n32 + n34 * n45;
                int n47 = n35 + n37 * n45;
                int n48 = n38 + n40 * n45;
                if ((n == n3 || n28 >= n26) && (n != n3 || n27 <= n26)) {
                    n2 -= n3;
                    n3 -= n;
                    n = Class122.field1682[n];
                    while (--n3 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n5 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                        n5 += n28;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n46 += n34;
                        n47 += n37;
                        n48 += n40;
                    }
                    while (--n2 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n, n4 >> 14, n6 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                        n6 += n27;
                        n4 += n26;
                        n7 += n31;
                        n += Class314.field3761;
                        n46 += n34;
                        n47 += n37;
                        n48 += n40;
                    }
                    return;
                }
                n2 -= n3;
                n3 -= n;
                n = Class122.field1682[n];
                while (--n3 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n, n5 >> 14, n4 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                    n5 += n28;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n46 += n34;
                    n47 += n37;
                    n48 += n40;
                }
                while (--n2 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n, n6 >> 14, n4 >> 14, n7, n30, n46, n47, n48, n33, n36, n39);
                    n6 += n27;
                    n4 += n26;
                    n7 += n31;
                    n += Class314.field3761;
                    n46 += n34;
                    n47 += n37;
                    n48 += n40;
                }
            }
        }
        else if (n2 <= n3) {
            if (n2 >= Class122.field1672) {
                return;
            }
            if (n3 > Class122.field1672) {
                n3 = Class122.field1672;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            n8 = n30 + ((n8 << 9) - n30 * n5);
            if (n3 < n) {
                n5 = (n4 = n5 << 14);
                if (n2 < 0) {
                    n4 -= n26 * n2;
                    n5 -= n27 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n6 <<= 14;
                if (n3 < 0) {
                    n6 -= n28 * n3;
                    n3 = 0;
                }
                final int n49 = n2 - Class122.field1689;
                int n50 = n32 + n34 * n49;
                int n51 = n35 + n37 * n49;
                int n52 = n38 + n40 * n49;
                if ((n3 == n2 || n26 >= n27) && (n3 != n2 || n26 <= n28)) {
                    n -= n3;
                    n3 -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n3 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                        n4 += n26;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n50 += n34;
                        n51 += n37;
                        n52 += n40;
                    }
                    while (--n >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n2, n6 >> 14, n4 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                        n4 += n26;
                        n6 += n28;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n50 += n34;
                        n51 += n37;
                        n52 += n40;
                    }
                    return;
                }
                n -= n3;
                n3 -= n2;
                n2 = Class122.field1682[n2];
                while (--n3 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                    n4 += n26;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n50 += n34;
                    n51 += n37;
                    n52 += n40;
                }
                while (--n >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n6 >> 14, n8, n30, n50, n51, n52, n33, n36, n39);
                    n4 += n26;
                    n6 += n28;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n50 += n34;
                    n51 += n37;
                    n52 += n40;
                }
            }
            else {
                n5 = (n6 = n5 << 14);
                if (n2 < 0) {
                    n6 -= n26 * n2;
                    n5 -= n27 * n2;
                    n8 -= n31 * n2;
                    n2 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n28;
                    n = 0;
                }
                final int n53 = n2 - Class122.field1689;
                int n54 = n32 + n34 * n53;
                int n55 = n35 + n37 * n53;
                int n56 = n38 + n40 * n53;
                if (n26 < n27) {
                    n3 -= n;
                    n -= n2;
                    n2 = Class122.field1682[n2];
                    while (--n >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n2, n6 >> 14, n5 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                        n6 += n26;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n54 += n34;
                        n55 += n37;
                        n56 += n40;
                    }
                    while (--n3 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n2, n4 >> 14, n5 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                        n4 += n28;
                        n5 += n27;
                        n8 += n31;
                        n2 += Class314.field3761;
                        n54 += n34;
                        n55 += n37;
                        n56 += n40;
                    }
                    return;
                }
                n3 -= n;
                n -= n2;
                n2 = Class122.field1682[n2];
                while (--n >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n6 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                    n6 += n26;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n54 += n34;
                    n55 += n37;
                    n56 += n40;
                }
                while (--n3 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n2, n5 >> 14, n4 >> 14, n8, n30, n54, n55, n56, n33, n36, n39);
                    n4 += n28;
                    n5 += n27;
                    n8 += n31;
                    n2 += Class314.field3761;
                    n54 += n34;
                    n55 += n37;
                    n56 += n40;
                }
            }
        }
        else {
            if (n3 >= Class122.field1672) {
                return;
            }
            if (n > Class122.field1672) {
                n = Class122.field1672;
            }
            if (n2 > Class122.field1672) {
                n2 = Class122.field1672;
            }
            n9 = (n9 << 9) - n6 * n30 + n30;
            if (n < n2) {
                n6 = (n5 = n6 << 14);
                if (n3 < 0) {
                    n5 -= n27 * n3;
                    n6 -= n28 * n3;
                    n9 -= n31 * n3;
                    n3 = 0;
                }
                n4 <<= 14;
                if (n < 0) {
                    n4 -= n * n26;
                    n = 0;
                }
                final int n57 = n3 - Class122.field1689;
                int n58 = n32 + n34 * n57;
                int n59 = n35 + n37 * n57;
                int n60 = n38 + n40 * n57;
                if (n27 < n28) {
                    n2 -= n;
                    n -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                        n5 += n27;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n58 += n34;
                        n59 += n37;
                        n60 += n40;
                    }
                    while (--n2 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n4 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                        n5 += n27;
                        n4 += n26;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n58 += n34;
                        n59 += n37;
                        n60 += n40;
                    }
                    return;
                }
                n2 -= n;
                n -= n3;
                n3 = Class122.field1682[n3];
                while (--n >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                    n5 += n27;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n58 += n34;
                    n59 += n37;
                    n60 += n40;
                }
                while (--n2 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n3, n4 >> 14, n5 >> 14, n9, n30, n58, n59, n60, n33, n36, n39);
                    n5 += n27;
                    n4 += n26;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n58 += n34;
                    n59 += n37;
                    n60 += n40;
                }
            }
            else {
                n6 = (n4 = n6 << 14);
                if (n3 < 0) {
                    n4 -= n27 * n3;
                    n6 -= n28 * n3;
                    n9 -= n31 * n3;
                    n3 = 0;
                }
                n5 <<= 14;
                if (n2 < 0) {
                    n5 -= n26 * n2;
                    n2 = 0;
                }
                final int n61 = n3 - Class122.field1689;
                int n62 = n32 + n34 * n61;
                int n63 = n35 + n37 * n61;
                int n64 = n38 + n40 * n61;
                if (n27 < n28) {
                    n -= n2;
                    n2 -= n3;
                    n3 = Class122.field1682[n3];
                    while (--n2 >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n3, n4 >> 14, n6 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                        n4 += n27;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n62 += n34;
                        n63 += n37;
                        n64 += n40;
                    }
                    while (--n >= 0) {
                        method2847(Class314.field3766, vmethod3079, 0, 0, n3, n5 >> 14, n6 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                        n5 += n26;
                        n6 += n28;
                        n9 += n31;
                        n3 += Class314.field3761;
                        n62 += n34;
                        n63 += n37;
                        n64 += n40;
                    }
                    return;
                }
                n -= n2;
                n2 -= n3;
                n3 = Class122.field1682[n3];
                while (--n2 >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n4 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                    n4 += n27;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n62 += n34;
                    n63 += n37;
                    n64 += n40;
                }
                while (--n >= 0) {
                    method2847(Class314.field3766, vmethod3079, 0, 0, n3, n6 >> 14, n5 >> 14, n9, n30, n62, n63, n64, n33, n36, n39);
                    n5 += n26;
                    n6 += n28;
                    n9 += n31;
                    n3 += Class314.field3761;
                    n62 += n34;
                    n63 += n37;
                    n64 += n40;
                }
            }
        }
    }
    
    @ObfuscatedName("t")
    static final void method2847(final int[] array, final int[] array2, int n, int n2, int n3, int n4, int field1688, int n5, int n6, int n7, int n8, int n9, final int n10, final int n11, final int n12) {
        if (Class122.field1677) {
            if (field1688 > Class122.field1688) {
                field1688 = Class122.field1688;
            }
            if (n4 < 0) {
                n4 = 0;
            }
        }
        if (n4 >= field1688) {
            return;
        }
        n3 += n4;
        n5 += n4 * n6;
        final int n13 = field1688 - n4;
        if (Class122.field1669) {
            final int n14 = n4 - Class122.field1687;
            n7 += n14 * n10;
            n8 += n11 * n14;
            n9 += n14 * n12;
            final int n15 = n9 >> 12;
            int n16;
            int n17;
            if (n15 != 0) {
                n16 = n7 / n15;
                n17 = n8 / n15;
            }
            else {
                n16 = 0;
                n17 = 0;
            }
            n7 += n13 * n10;
            n8 += n11 * n13;
            n9 += n13 * n12;
            final int n18 = n9 >> 12;
            int n19;
            int n20;
            if (n18 != 0) {
                n19 = n7 / n18;
                n20 = n8 / n18;
            }
            else {
                n19 = 0;
                n20 = 0;
            }
            n = (n16 << 20) + n17;
            final int n21 = (n20 - n17) / n13 + ((n19 - n16) / n13 << 20);
            int n22 = n13 >> 3;
            n6 <<= 3;
            int n23 = n5 >> 8;
            if (Class122.field1668) {
                if (n22 > 0) {
                    do {
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                        n5 += n6;
                        n23 = n5 >> 8;
                    } while (--n22 > 0);
                }
                int n24 = field1688 - n4 & 0x7;
                if (n24 > 0) {
                    do {
                        n2 = array2[(n >>> 26) + (n & 0xFC0)];
                        array[n3++] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        n += n21;
                    } while (--n24 > 0);
                }
            }
            else {
                if (n22 > 0) {
                    do {
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                        n5 += n6;
                        n23 = n5 >> 8;
                    } while (--n22 > 0);
                }
                int n25 = field1688 - n4 & 0x7;
                if (n25 > 0) {
                    do {
                        if ((n2 = array2[(n >>> 26) + (n & 0xFC0)]) != 0) {
                            array[n3] = (n23 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n23 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n21;
                    } while (--n25 > 0);
                }
            }
        }
        else {
            final int n26 = n4 - Class122.field1687;
            n7 += n26 * n10;
            n8 += n11 * n26;
            n9 += n26 * n12;
            final int n27 = n9 >> 14;
            int n28;
            int n29;
            if (n27 != 0) {
                n28 = n7 / n27;
                n29 = n8 / n27;
            }
            else {
                n28 = 0;
                n29 = 0;
            }
            n7 += n13 * n10;
            n8 += n11 * n13;
            n9 += n13 * n12;
            final int n30 = n9 >> 14;
            int n31;
            int n32;
            if (n30 != 0) {
                n31 = n7 / n30;
                n32 = n8 / n30;
            }
            else {
                n31 = 0;
                n32 = 0;
            }
            n = (n28 << 18) + n29;
            final int n33 = (n32 - n29) / n13 + ((n31 - n28) / n13 << 18);
            int n34 = n13 >> 3;
            n6 <<= 3;
            int n35 = n5 >> 8;
            if (Class122.field1668) {
                if (n34 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                        n5 += n6;
                        n35 = n5 >> 8;
                    } while (--n34 > 0);
                }
                int n36 = field1688 - n4 & 0x7;
                if (n36 > 0) {
                    do {
                        n2 = array2[(n & 0x3F80) + (n >>> 25)];
                        array[n3++] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        n += n33;
                    } while (--n36 > 0);
                }
            }
            else {
                if (n34 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                        n5 += n6;
                        n35 = n5 >> 8;
                    } while (--n34 > 0);
                }
                int n37 = field1688 - n4 & 0x7;
                if (n37 > 0) {
                    do {
                        if ((n2 = array2[(n & 0x3F80) + (n >>> 25)]) != 0) {
                            array[n3] = (n35 * (n2 & 0xFF00) & 0xFF0000) + ((n2 & 0xFF00FF) * n35 & 0xFF00FF00) >> 8;
                        }
                        ++n3;
                        n += n33;
                    } while (--n37 > 0);
                }
            }
        }
    }
    
    @ObfuscatedName("o")
    static final int method2802(final int n, int n2) {
        n2 = (n & 0x7F) * n2 >> 7;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
    
    @ObfuscatedName("y")
    static final int method2803(final int n, final int n2, final int n3, final int n4) {
        return n * n3 + n4 * n2 >> 16;
    }
    
    @ObfuscatedName("a")
    static final int method2828(final int n, final int n2, final int n3, final int n4) {
        return n3 * n2 - n4 * n >> 16;
    }
    
    @ObfuscatedName("c")
    static final int method2805(final int n, final int n2, final int n3, final int n4) {
        return n * n3 - n4 * n2 >> 16;
    }
    
    @ObfuscatedName("v")
    static final int method2806(final int n, final int n2, final int n3, final int n4) {
        return n4 * n + n3 * n2 >> 16;
    }
    
    @ObfuscatedName("af")
    static final int method2807(final int n, final int n2, final int n3, final int n4) {
        return n * n3 + n4 * n2 >> 16;
    }
    
    @ObfuscatedName("ah")
    static final int method2790(final int n, final int n2, final int n3, final int n4) {
        return n3 * n2 - n4 * n >> 16;
    }
}
