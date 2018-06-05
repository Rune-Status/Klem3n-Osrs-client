import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("lt")
public class Class314 extends Class206
{
    @ObfuscatedName("ah")
    public static int[] field3766;
    @ObfuscatedName("ab")
    public static int field3761;
    @ObfuscatedName("aw")
    public static int field3762;
    @ObfuscatedName("ak")
    public static int field3763;
    @ObfuscatedName("as")
    public static int field3764;
    @ObfuscatedName("an")
    public static int field3765;
    @ObfuscatedName("ao")
    protected static int field3760;
    
    static {
        Class314.field3763 = 0;
        Class314.field3764 = 0;
        Class314.field3765 = 0;
        Class314.field3760 = 0;
    }
    
    @ObfuscatedName("dz")
    public static void method5718(final int[] field3766, final int field3767, final int field3768) {
        Class314.field3766 = field3766;
        method5720(0, 0, Class314.field3761 = field3767, Class314.field3762 = field3768);
    }
    
    @ObfuscatedName("dn")
    public static void method5719() {
        Class314.field3765 = 0;
        Class314.field3763 = 0;
        Class314.field3760 = Class314.field3761;
        Class314.field3764 = Class314.field3762;
    }
    
    @ObfuscatedName("dg")
    public static void method5720(int field3765, int field3766, int field3767, int field3768) {
        if (field3765 < 0) {
            field3765 = 0;
        }
        if (field3766 < 0) {
            field3766 = 0;
        }
        if (field3767 > Class314.field3761) {
            field3767 = Class314.field3761;
        }
        if (field3768 > Class314.field3762) {
            field3768 = Class314.field3762;
        }
        Class314.field3765 = field3765;
        Class314.field3763 = field3766;
        Class314.field3760 = field3767;
        Class314.field3764 = field3768;
    }
    
    @ObfuscatedName("dy")
    public static void method5790(final int field3765, final int field3766, final int field3767, final int field3768) {
        if (Class314.field3765 < field3765) {
            Class314.field3765 = field3765;
        }
        if (Class314.field3763 < field3766) {
            Class314.field3763 = field3766;
        }
        if (Class314.field3760 > field3767) {
            Class314.field3760 = field3767;
        }
        if (Class314.field3764 > field3768) {
            Class314.field3764 = field3768;
        }
    }
    
    @ObfuscatedName("dv")
    public static void method5722(final int[] array) {
        array[0] = Class314.field3765;
        array[1] = Class314.field3763;
        array[2] = Class314.field3760;
        array[3] = Class314.field3764;
    }
    
    @ObfuscatedName("de")
    public static void method5723(final int[] array) {
        Class314.field3765 = array[0];
        Class314.field3763 = array[1];
        Class314.field3760 = array[2];
        Class314.field3764 = array[3];
    }
    
    @ObfuscatedName("dp")
    public static void method5724() {
        int i;
        int n;
        for (i = 0, n = Class314.field3761 * Class314.field3762 - 7; i < n; Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0, Class314.field3766[i++] = 0) {}
        for (n += 7; i < n; Class314.field3766[i++] = 0) {}
    }
    
    @ObfuscatedName("db")
    static void method5744(final int n, int n2, int n3, final int n4) {
        if (n3 == 0) {
            method5730(n, n2, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        int field3763 = n2 - n3;
        if (field3763 < Class314.field3763) {
            field3763 = Class314.field3763;
        }
        int field3764 = n3 + n2 + 1;
        if (field3764 > Class314.field3764) {
            field3764 = Class314.field3764;
        }
        int i = field3763;
        final int n5 = n3 * n3;
        int n6 = 0;
        int n7 = n2 - i;
        int n8 = n7 * n7;
        int n9 = n8 - n7;
        if (n2 > field3764) {
            n2 = field3764;
        }
        while (i < n2) {
            while (n9 <= n5 || n8 <= n5) {
                n8 = n8 + n6 + n6;
                n9 += n6 + ++n6;
            }
            int field3765 = n - n6 + 1;
            if (field3765 < Class314.field3765) {
                field3765 = Class314.field3765;
            }
            int field3766 = n + n6;
            if (field3766 > Class314.field3760) {
                field3766 = Class314.field3760;
            }
            int n10 = field3765 + i * Class314.field3761;
            for (int j = field3765; j < field3766; ++j) {
                Class314.field3766[n10++] = n4;
            }
            ++i;
            n8 -= n7 + --n7;
            n9 -= n7 + n7;
        }
        int n11 = n3;
        int n12 = i - n2;
        final int n13 = n5 + n12 * n12;
        for (int n14 = n13 - n11, n15 = n13 - n12; i < field3764; ++i, n15 = n15 + n12 + n12, n14 += n12 + ++n12) {
            while (n15 > n5 && n14 > n5) {
                n15 -= n11 + --n11;
                n14 -= n11 + n11;
            }
            int field3767 = n - n11;
            if (field3767 < Class314.field3765) {
                field3767 = Class314.field3765;
            }
            int n16 = n + n11;
            if (n16 > Class314.field3760 - 1) {
                n16 = Class314.field3760 - 1;
            }
            int n17 = field3767 + i * Class314.field3761;
            for (int k = field3767; k <= n16; ++k) {
                Class314.field3766[n17++] = n4;
            }
        }
    }
    
    @ObfuscatedName("dq")
    public static void method5784(final int n, int n2, int n3, final int n4, final int n5) {
        if (n5 == 0) {
            return;
        }
        if (n5 == 256) {
            method5744(n, n2, n3, n4);
            return;
        }
        if (n3 < 0) {
            n3 = -n3;
        }
        final int n6 = 256 - n5;
        final int n7 = (n4 >> 16 & 0xFF) * n5;
        final int n8 = (n4 >> 8 & 0xFF) * n5;
        final int n9 = n5 * (n4 & 0xFF);
        int field3763 = n2 - n3;
        if (field3763 < Class314.field3763) {
            field3763 = Class314.field3763;
        }
        int field3764 = n3 + n2 + 1;
        if (field3764 > Class314.field3764) {
            field3764 = Class314.field3764;
        }
        int i = field3763;
        final int n10 = n3 * n3;
        int n11 = 0;
        int n12 = n2 - i;
        int n13 = n12 * n12;
        int n14 = n13 - n12;
        if (n2 > field3764) {
            n2 = field3764;
        }
        while (i < n2) {
            while (n14 <= n10 || n13 <= n10) {
                n13 = n13 + n11 + n11;
                n14 += n11 + ++n11;
            }
            int field3765 = n - n11 + 1;
            if (field3765 < Class314.field3765) {
                field3765 = Class314.field3765;
            }
            int field3766 = n + n11;
            if (field3766 > Class314.field3760) {
                field3766 = Class314.field3760;
            }
            int n15 = field3765 + i * Class314.field3761;
            for (int j = field3765; j < field3766; ++j) {
                Class314.field3766[n15++] = (n9 + n6 * (Class314.field3766[n15] & 0xFF) >> 8) + (n7 + n6 * (Class314.field3766[n15] >> 16 & 0xFF) >> 8 << 16) + (n8 + (Class314.field3766[n15] >> 8 & 0xFF) * n6 >> 8 << 8);
            }
            ++i;
            n13 -= n12 + --n12;
            n14 -= n12 + n12;
        }
        int n16 = n3;
        int n17 = -n12;
        final int n18 = n10 + n17 * n17;
        for (int n19 = n18 - n16, n20 = n18 - n17; i < field3764; ++i, n20 = n20 + n17 + n17, n19 += n17 + ++n17) {
            while (n20 > n10 && n19 > n10) {
                n20 -= n16 + --n16;
                n19 -= n16 + n16;
            }
            int field3767 = n - n16;
            if (field3767 < Class314.field3765) {
                field3767 = Class314.field3765;
            }
            int n21 = n + n16;
            if (n21 > Class314.field3760 - 1) {
                n21 = Class314.field3760 - 1;
            }
            int n22 = field3767 + i * Class314.field3761;
            for (int k = field3767; k <= n21; ++k) {
                Class314.field3766[n22++] = (n9 + n6 * (Class314.field3766[n22] & 0xFF) >> 8) + (n7 + n6 * (Class314.field3766[n22] >> 16 & 0xFF) >> 8 << 16) + (n8 + (Class314.field3766[n22] >> 8 & 0xFF) * n6 >> 8 << 8);
            }
        }
    }
    
    @ObfuscatedName("dx")
    public static void method5727(int field3765, int field3766, int n, int n2, int n3, final int n4) {
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        n3 = (n4 * (n3 & 0xFF00FF) >> 8 & 0xFF00FF) + (n4 * (n3 & 0xFF00) >> 8 & 0xFF00);
        final int n5 = 256 - n4;
        final int n6 = Class314.field3761 - n;
        int n7 = field3765 + Class314.field3761 * field3766;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n8 = Class314.field3766[n7];
                Class314.field3766[n7++] = ((n8 & 0xFF00FF) * n5 >> 8 & 0xFF00FF) + (n5 * (n8 & 0xFF00) >> 8 & 0xFF00) + n3;
            }
            n7 += n6;
        }
    }
    
    @ObfuscatedName("du")
    public static void method5763(int field3765, int field3766, int n, int n2, final int n3) {
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        final int n4 = Class314.field3761 - n;
        int n5 = field3765 + Class314.field3761 * field3766;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                Class314.field3766[n5++] = n3;
            }
            n5 += n4;
        }
    }
    
    @ObfuscatedName("da")
    public static void method5728(int field3765, int field3766, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n7 = 0;
        final int n8 = (n4 != n3 || n6 != n5) ? (65536 / n2) : -1;
        int n9 = n5;
        int n10 = 256 - n9;
        int n11 = n3;
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n7 += (Class314.field3763 - field3766) * n8;
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        final int n12 = Class314.field3761 - n;
        int n13 = field3765 + Class314.field3761 * field3766;
        for (int i = -n2; i < 0; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n14 = Class314.field3766[n13];
                final int n15 = n11 + n14;
                final int n16 = (n11 & 0xFF00FF) + (n14 & 0xFF00FF);
                final int n17 = (n16 & 0x1000100) + (n15 - n16 & 0x10000);
                if (n10 == 0) {
                    Class314.field3766[n13++] = (n15 - n17 | n17 - (n17 >>> 8));
                }
                else {
                    final int n18 = n15 - n17 | n17 - (n17 >>> 8);
                    Class314.field3766[n13++] = ((n18 & 0xFF00FF) * n9 >> 8 & 0xFF00FF) + ((n14 & 0xFF00FF) * n10 >> 8 & 0xFF00FF) + (n9 * (n18 & 0xFF00) >> 8 & 0xFF00) + (n10 * (n14 & 0xFF00) >> 8 & 0xFF00);
                }
            }
            if (n8 > 0) {
                n7 += n8;
                final int n19 = 65536 - n7 >> 8;
                final int n20 = n7 >> 8;
                if (n6 != n5) {
                    n9 = (65536 - n7) * n5 + n7 * n6 >> 16;
                    n10 = 256 - n9;
                }
                if (n4 != n3) {
                    n11 = (n20 * (n4 & 0xFF00FF) + n19 * (n3 & 0xFF00FF) & 0xFF00FF00) + (n20 * (n4 & 0xFF00) + n19 * (n3 & 0xFF00) & 0xFF0000) >>> 8;
                }
            }
            n13 += n12;
        }
    }
    
    @ObfuscatedName("dd")
    public static void method5729(int field3765, int field3766, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n7 = 0;
        final int n8 = (n4 != n3 || n6 != n5) ? (65536 / n2) : -1;
        int n9 = n5;
        int n10 = 256 - n9;
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n7 += (Class314.field3763 - field3766) * n8;
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        int n11 = n3 >> 16;
        int n12 = (n3 & 0xFF00) >> 8;
        int n13 = n3 & 0xFF;
        final int n14 = Class314.field3761 - n;
        int n15 = field3765 + Class314.field3761 * field3766;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n16 = Class314.field3766[n15];
                final int n17 = n16 >> 16;
                final int n18 = (n16 & 0xFF00) >> 8;
                final int n19 = n16 & 0xFF;
                int n20;
                int n21;
                int n22;
                if (n10 == 0) {
                    n20 = ((n17 < 127) ? (n11 * n17 >> 7) : (255 - ((255 - n11) * (255 - n17) >> 7)));
                    n21 = ((n18 < 127) ? (n12 * n18 >> 7) : (255 - ((255 - n12) * (255 - n18) >> 7)));
                    n22 = ((n19 < 127) ? (n13 * n19 >> 7) : (255 - ((255 - n13) * (255 - n19) >> 7)));
                }
                else {
                    n20 = ((n17 < 127) ? (n17 * n10 + (n11 * n17 * n9 >> 7) >> 8) : (n9 * (255 - ((255 - n11) * (255 - n17) >> 7)) + n17 * n10 >> 8));
                    n21 = ((n18 < 127) ? (n18 * n10 + (n12 * n18 * n9 >> 7) >> 8) : (n9 * (255 - ((255 - n12) * (255 - n18) >> 7)) + n18 * n10 >> 8));
                    n22 = ((n19 < 127) ? (n19 * n10 + (n13 * n19 * n9 >> 7) >> 8) : (n9 * (255 - ((255 - n13) * (255 - n19) >> 7)) + n19 * n10 >> 8));
                }
                Class314.field3766[n15++] = n22 + (n21 << 8) + (n20 << 16);
            }
            if (n8 > 0) {
                n7 += n8;
                final int n23 = 65536 - n7 >> 8;
                final int n24 = n7 >> 8;
                if (n6 != n5) {
                    n9 = (65536 - n7) * n5 + n7 * n6 >> 16;
                    n10 = 256 - n9;
                }
                if (n4 != n3) {
                    final int n25 = (n24 * (n4 & 0xFF00FF) + n23 * (n3 & 0xFF00FF) & 0xFF00FF00) + (n24 * (n4 & 0xFF00) + n23 * (n3 & 0xFF00) & 0xFF0000) >>> 8;
                    n11 = n25 >> 16;
                    n12 = (n25 & 0xFF00) >> 8;
                    n13 = (n25 & 0xFF);
                }
            }
            n15 += n14;
        }
    }
    
    @ObfuscatedName("dc")
    public static void method5739(int field3765, int field3766, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n7 = 0;
        final int n8 = 65536 / n2;
        int n9 = n5;
        int n10 = 256 - n9;
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n7 += (Class314.field3763 - field3766) * n8;
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        int n11 = n3 & 0xFF0000;
        int n12 = n3 & 0xFF00;
        int n13 = n3 & 0xFF;
        int n14 = n11 * n9 >> 8;
        int n15 = n12 * n9 >> 8;
        int n16 = n13 * n9 >> 8;
        final int n17 = Class314.field3761 - n;
        int n18 = field3765 + Class314.field3761 * field3766;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n19 = Class314.field3766[n18];
                final int n20 = n19 & 0xFF0000;
                final int n21 = (n20 <= n11) ? n20 : ((n10 == 0) ? n11 : (n14 + (n20 * n10 >> 8) & 0xFF0000));
                final int n22 = n19 & 0xFF00;
                final int n23 = (n22 <= n12) ? n22 : ((n10 == 0) ? n12 : (n15 + (n22 * n10 >> 8) & 0xFF00));
                final int n24 = n19 & 0xFF;
                Class314.field3766[n18++] = n21 + n23 + ((n24 <= n13) ? n24 : ((n10 == 0) ? n13 : (n16 + (n24 * n10 >> 8))));
            }
            if (n8 > 0) {
                n7 += n8;
                final int n25 = 65536 - n7 >> 8;
                final int n26 = n7 >> 8;
                if (n6 != n5) {
                    n9 = (65536 - n7) * n5 + n7 * n6 >> 16;
                    n10 = 256 - n9;
                }
                if (n4 != n3) {
                    final int n27 = (n26 * (n4 & 0xFF00FF) + n25 * (n3 & 0xFF00FF) & 0xFF00FF00) + (n26 * (n4 & 0xFF00) + n25 * (n3 & 0xFF00) & 0xFF0000) >>> 8;
                    n11 = (n27 & 0xFF0000);
                    n12 = (n27 & 0xFF00);
                    n13 = (n27 & 0xFF);
                    n14 = n11 * n9 >> 8;
                    n15 = n12 * n9 >> 8;
                    n16 = n13 * n9 >> 8;
                }
            }
            n18 += n17;
        }
    }
    
    @ObfuscatedName("ds")
    public static void method5726(int field3765, int field3766, int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n2 <= 0 || n <= 0) {
            return;
        }
        int n7 = 0;
        final int n8 = 65536 / n2;
        int n9 = n5;
        int n10 = 256 - n9;
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n7 += (Class314.field3763 - field3766) * n8;
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        int n11 = n3 & 0xFF0000;
        int n12 = n3 & 0xFF00;
        int n13 = n3 & 0xFF;
        int n14 = n11 * n9 >> 8;
        int n15 = n12 * n9 >> 8;
        int n16 = n13 * n9 >> 8;
        final int n17 = Class314.field3761 - n;
        int n18 = field3765 + Class314.field3761 * field3766;
        for (int i = 0; i < n2; ++i) {
            for (int j = -n; j < 0; ++j) {
                final int n19 = Class314.field3766[n18];
                final int n20 = n19 & 0xFF0000;
                final int n21 = (n20 >= n11) ? n20 : ((n10 == 0) ? n11 : (n14 + (n20 * n10 >> 8) & 0xFF0000));
                final int n22 = n19 & 0xFF00;
                final int n23 = (n22 >= n12) ? n22 : ((n10 == 0) ? n12 : (n15 + (n22 * n10 >> 8) & 0xFF00));
                final int n24 = n19 & 0xFF;
                Class314.field3766[n18++] = n21 + n23 + ((n24 >= n13) ? n24 : ((n10 == 0) ? n13 : (n16 + (n24 * n10 >> 8))));
            }
            if (n8 > 0) {
                n7 += n8;
                final int n25 = 65536 - n7 >> 8;
                final int n26 = n7 >> 8;
                if (n6 != n5) {
                    n9 = (65536 - n7) * n5 + n7 * n6 >> 16;
                    n10 = 256 - n9;
                }
                if (n4 != n3) {
                    final int n27 = (n26 * (n4 & 0xFF00FF) + n25 * (n3 & 0xFF00FF) & 0xFF00FF00) + (n26 * (n4 & 0xFF00) + n25 * (n3 & 0xFF00) & 0xFF0000) >>> 8;
                    n11 = (n27 & 0xFF0000);
                    n12 = (n27 & 0xFF00);
                    n13 = (n27 & 0xFF);
                    n14 = n11 * n9 >> 8;
                    n15 = n12 * n9 >> 8;
                    n16 = n13 * n9 >> 8;
                }
            }
            n18 += n17;
        }
    }
    
    @ObfuscatedName("dw")
    public static void method5748(int field3765, int field3766, int n, int n2, final int n3, final int n4) {
        if (n <= 0 || n2 <= 0) {
            return;
        }
        int n5 = 0;
        final int n6 = 65536 / n2;
        if (field3765 < Class314.field3765) {
            n -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3766 < Class314.field3763) {
            n5 += (Class314.field3763 - field3766) * n6;
            n2 -= Class314.field3763 - field3766;
            field3766 = Class314.field3763;
        }
        if (field3765 + n > Class314.field3760) {
            n = Class314.field3760 - field3765;
        }
        if (n2 + field3766 > Class314.field3764) {
            n2 = Class314.field3764 - field3766;
        }
        final int n7 = Class314.field3761 - n;
        int n8 = field3765 + Class314.field3761 * field3766;
        for (int i = -n2; i < 0; ++i) {
            final int n9 = 65536 - n5 >> 8;
            final int n10 = n5 >> 8;
            final int n11 = (n10 * (n4 & 0xFF00FF) + n9 * (n3 & 0xFF00FF) & 0xFF00FF00) + (n10 * (n4 & 0xFF00) + n9 * (n3 & 0xFF00) & 0xFF0000) >>> 8;
            for (int j = -n; j < 0; ++j) {
                Class314.field3766[n8++] = n11;
            }
            n8 += n7;
            n5 += n6;
        }
    }
    
    @ObfuscatedName("dl")
    @ObfuscatedSignature(signature = "(IIIIII[BIZ)V", garbageValue = "1")
    public static void method5733(final int n, final int n2, int n3, int n4, final int n5, final int n6, final byte[] array, final int n7) {
        if (n + n3 < 0 || n4 + n2 < 0) {
            return;
        }
        if (n < Class314.field3761 && n2 < Class314.field3762) {
            int n8 = 0;
            int n9 = 0;
            if (n < 0) {
                n8 -= n;
                n3 += n;
            }
            if (n2 < 0) {
                n9 -= n2;
                n4 += n2;
            }
            if (n + n3 > Class314.field3761) {
                n3 = Class314.field3761 - n;
            }
            if (n4 + n2 > Class314.field3762) {
                n4 = Class314.field3762 - n2;
            }
            final int n10 = array.length / n7;
            final int n11 = Class314.field3761 - n3;
            final int n12 = n5 >>> 24;
            final int n13 = n6 >>> 24;
            if (n12 == 255 && n13 == 255) {
                int n14 = n + n8 + (n9 + n2) * Class314.field3761;
                for (int i = n9 + n2; i < n4 + n9 + n2; ++i) {
                    for (int j = n + n8; j < n + n8 + n3; ++j) {
                        if (array[(j - n) % n7 + (i - n2) % n10 * n7] != 0) {
                            Class314.field3766[n14++] = n6;
                        }
                        else {
                            Class314.field3766[n14++] = n5;
                        }
                    }
                    n14 += n11;
                }
            }
            else {
                int n15 = n + n8 + (n9 + n2) * Class314.field3761;
                for (int k = n9 + n2; k < n4 + n9 + n2; ++k) {
                    for (int l = n + n8; l < n + n8 + n3; ++l) {
                        final int n16 = (k - n2) % n10;
                        final int n17 = (l - n) % n7;
                        int n18 = n5;
                        if (array[n17 + n16 * n7] != 0) {
                            n18 = n6;
                        }
                        final int n19 = n18 >>> 24;
                        final int n20 = 255 - n19;
                        final int n21 = Class314.field3766[n15];
                        Class314.field3766[n15++] = ((n18 & 0xFF00FF) * n19 + (n21 & 0xFF00FF) * n20 & 0xFF00FF00) + (n19 * (n18 & 0xFF00) + n20 * (n21 & 0xFF00) & 0xFF0000) >> 8;
                    }
                    n15 += n11;
                }
            }
        }
    }
    
    @ObfuscatedName("di")
    public static void method5734(final int n, final int n2, final int n3, final int n4, final int n5) {
        method5736(n, n2, n3, n5);
        method5736(n, n4 + n2 - 1, n3, n5);
        method5738(n, n2, n4, n5);
        method5738(n + n3 - 1, n2, n4, n5);
    }
    
    @ObfuscatedName("dt")
    public static void method5741(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        method5785(n, n2, n3, n5, n6);
        method5785(n, n4 + n2 - 1, n3, n5, n6);
        if (n4 >= 3) {
            method5752(n, n2 + 1, n4 - 2, n5, n6);
            method5752(n + n3 - 1, n2 + 1, n4 - 2, n5, n6);
        }
    }
    
    @ObfuscatedName("dm")
    public static void method5736(int field3765, final int n, int n2, final int n3) {
        if (n < Class314.field3763 || n >= Class314.field3764) {
            return;
        }
        if (field3765 < Class314.field3765) {
            n2 -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3765 + n2 > Class314.field3760) {
            n2 = Class314.field3760 - field3765;
        }
        final int n4 = field3765 + Class314.field3761 * n;
        for (int i = 0; i < n2; ++i) {
            Class314.field3766[n4 + i] = n3;
        }
    }
    
    @ObfuscatedName("dk")
    static void method5785(int field3765, final int n, int n2, final int n3, final int n4) {
        if (n < Class314.field3763 || n >= Class314.field3764) {
            return;
        }
        if (field3765 < Class314.field3765) {
            n2 -= Class314.field3765 - field3765;
            field3765 = Class314.field3765;
        }
        if (field3765 + n2 > Class314.field3760) {
            n2 = Class314.field3760 - field3765;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = n4 * (n3 & 0xFF);
        int n9 = field3765 + Class314.field3761 * n;
        for (int i = 0; i < n2; ++i) {
            Class314.field3766[n9++] = (n8 + n5 * (Class314.field3766[n9] & 0xFF) >> 8) + (n6 + n5 * (Class314.field3766[n9] >> 16 & 0xFF) >> 8 << 16) + (n7 + (Class314.field3766[n9] >> 8 & 0xFF) * n5 >> 8 << 8);
        }
    }
    
    @ObfuscatedName("df")
    public static void method5738(final int n, int field3763, int n2, final int n3) {
        if (n < Class314.field3765 || n >= Class314.field3760) {
            return;
        }
        if (field3763 < Class314.field3763) {
            n2 -= Class314.field3763 - field3763;
            field3763 = Class314.field3763;
        }
        if (n2 + field3763 > Class314.field3764) {
            n2 = Class314.field3764 - field3763;
        }
        final int n4 = n + Class314.field3761 * field3763;
        for (int i = 0; i < n2; ++i) {
            Class314.field3766[n4 + i * Class314.field3761] = n3;
        }
    }
    
    @ObfuscatedName("dr")
    static void method5752(final int n, int field3763, int n2, final int n3, final int n4) {
        if (n < Class314.field3765 || n >= Class314.field3760) {
            return;
        }
        if (field3763 < Class314.field3763) {
            n2 -= Class314.field3763 - field3763;
            field3763 = Class314.field3763;
        }
        if (n2 + field3763 > Class314.field3764) {
            n2 = Class314.field3764 - field3763;
        }
        final int n5 = 256 - n4;
        final int n6 = (n3 >> 16 & 0xFF) * n4;
        final int n7 = (n3 >> 8 & 0xFF) * n4;
        final int n8 = n4 * (n3 & 0xFF);
        int n9 = n + Class314.field3761 * field3763;
        for (int i = 0; i < n2; ++i) {
            Class314.field3766[n9] = (n8 + n5 * (Class314.field3766[n9] & 0xFF) >> 8) + (n6 + n5 * (Class314.field3766[n9] >> 16 & 0xFF) >> 8 << 16) + (n7 + (Class314.field3766[n9] >> 8 & 0xFF) * n5 >> 8 << 8);
            n9 += Class314.field3761;
        }
    }
    
    @ObfuscatedName("dj")
    public static void method5765(int i, int j, int n, int n2, final int n3) {
        n -= i;
        n2 -= j;
        if (n2 == 0) {
            if (n >= 0) {
                method5736(i, j, n + 1, n3);
            }
            else {
                method5736(i + n, j, -n + 1, n3);
            }
            return;
        }
        if (n == 0) {
            if (n2 >= 0) {
                method5738(i, j, n2 + 1, n3);
            }
            else {
                method5738(i, n2 + j, -n2 + 1, n3);
            }
            return;
        }
        if (n2 + n < 0) {
            i += n;
            n = -n;
            j += n2;
            n2 = -n2;
        }
        if (n > n2) {
            j <<= 16;
            j += 32768;
            n2 <<= 16;
            final int n4 = (int)Math.floor(n2 / n + 0.5);
            n += i;
            if (i < Class314.field3765) {
                j += n4 * (Class314.field3765 - i);
                i = Class314.field3765;
            }
            if (n >= Class314.field3760) {
                n = Class314.field3760 - 1;
            }
            while (i <= n) {
                final int n5 = j >> 16;
                if (n5 >= Class314.field3763 && n5 < Class314.field3764) {
                    Class314.field3766[i + n5 * Class314.field3761] = n3;
                }
                j += n4;
                ++i;
            }
        }
        else {
            i <<= 16;
            i += 32768;
            n <<= 16;
            final int n6 = (int)Math.floor(n / n2 + 0.5);
            n2 += j;
            if (j < Class314.field3763) {
                i += (Class314.field3763 - j) * n6;
                j = Class314.field3763;
            }
            if (n2 >= Class314.field3764) {
                n2 = Class314.field3764 - 1;
            }
            while (j <= n2) {
                final int n7 = i >> 16;
                if (n7 >= Class314.field3765 && n7 < Class314.field3760) {
                    Class314.field3766[n7 + Class314.field3761 * j] = n3;
                }
                i += n6;
                ++j;
            }
        }
    }
    
    @ObfuscatedName("ew")
    static void method5730(final int n, final int n2, final int n3) {
        if (n < Class314.field3765 || n2 < Class314.field3763 || n >= Class314.field3760 || n2 >= Class314.field3764) {
            return;
        }
        Class314.field3766[n + Class314.field3761 * n2] = n3;
    }
    
    @ObfuscatedName("es")
    public static void method5742(int i, int j, final int n, final int[] array, final int[] array2) {
        int n2 = i + Class314.field3761 * j;
        int n3;
        for (j = 0; j < array.length; ++j) {
            n3 = n2 + array[j];
            for (i = -array2[j]; i < 0; ++i) {
                Class314.field3766[n3++] = n;
            }
            n2 += Class314.field3761;
        }
    }
}
