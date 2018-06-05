import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cu")
public class Class102
{
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field1352;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 135122197)
    int field1346;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 343750491)
    int field1350;
    @ObfuscatedName("q")
    int[][] field1351;
    
    public Class102(int field1346, int field1347) {
        if (field1347 == field1346) {
            return;
        }
        int n = field1346;
        int i = field1347;
        if (i > n) {
            final int n2 = n;
            n = i;
            i = n2;
        }
        while (i != 0) {
            final int n3 = n % i;
            n = i;
            i = n3;
        }
        final int n4 = n;
        field1346 /= n4;
        field1347 /= n4;
        this.field1346 = field1346;
        this.field1350 = field1347;
        this.field1351 = new int[field1346][14];
        for (int j = 0; j < field1346; ++j) {
            final int[] array = this.field1351[j];
            final double n5 = j / field1346 + 6.0;
            int k = (int)Math.floor(n5 - 7.0 + 1.0);
            if (k < 0) {
                k = 0;
            }
            int n6 = (int)Math.ceil(7.0 + n5);
            if (n6 > 14) {
                n6 = 14;
            }
            final double n7 = field1347 / field1346;
            while (k < n6) {
                final double n8 = (k - n5) * 3.141592653589793;
                double n9 = n7;
                if (n8 < -1.0E-4 || n8 > 1.0E-4) {
                    n9 *= Math.sin(n8) / n8;
                }
                array[k] = (int)Math.floor(n9 * (0.54 + 0.46 * Math.cos(0.2243994752564138 * (k - n5))) * 65536.0 + 0.5);
                ++k;
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([BI)[B", garbageValue = "160754994")
    byte[] method2239(byte[] array) {
        if (this.field1351 != null) {
            final int n = this.field1350 * array.length / this.field1346 + 14;
            final int[] array2 = new int[n];
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i < array.length; ++i) {
                final byte b = array[i];
                final int[] array3 = this.field1351[n3];
                for (int j = 0; j < 14; ++j) {
                    final int[] array4 = array2;
                    final int n4 = n2 + j;
                    array4[n4] += b * array3[j];
                }
                final int n5 = n3 + this.field1350;
                final int n6 = n5 / this.field1346;
                n2 += n6;
                n3 = n5 - n6 * this.field1346;
            }
            array = new byte[n];
            for (int k = 0; k < n; ++k) {
                final int n7 = array2[k] + 32768 >> 16;
                if (n7 < -128) {
                    array[k] = -128;
                }
                else if (n7 > 127) {
                    array[k] = 127;
                }
                else {
                    array[k] = (byte)n7;
                }
            }
        }
        return array;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "715273606")
    int method2240(int n) {
        if (this.field1351 != null) {
            n = n * this.field1350 / this.field1346;
        }
        return n;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "149890453")
    int method2241(int n) {
        if (this.field1351 != null) {
            n = this.field1350 * n / this.field1346 + 6;
        }
        return n;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;B)Z", garbageValue = "1")
    public static boolean method2249(final CharSequence charSequence) {
        boolean b = false;
        boolean b2 = false;
        int n = 0;
        final int length = charSequence.length();
        int i = 0;
    Label_0059_Outer:
        while (i < length) {
            int char1 = charSequence.charAt(i);
            boolean b3;
            while (true) {
                Label_0082: {
                    if (i != 0) {
                        break Label_0082;
                    }
                    if (char1 == 45) {
                        b = true;
                    }
                    else if (char1 != 43) {
                        break Label_0082;
                    }
                    ++i;
                    continue Label_0059_Outer;
                }
                if (char1 >= 48 && char1 <= 57) {
                    char1 -= 48;
                }
                else if (char1 >= 65 && char1 <= 90) {
                    char1 -= 55;
                }
                else {
                    if (char1 < 97 || char1 > 122) {
                        b3 = false;
                        return b3;
                    }
                    char1 -= 87;
                }
                if (char1 >= 10) {
                    b3 = false;
                }
                else {
                    if (b) {
                        char1 = -char1;
                    }
                    final int n2 = n * 10 + char1;
                    if (n == n2 / 10) {
                        n = n2;
                        b2 = true;
                        continue;
                    }
                    b3 = false;
                }
                break;
            }
            return b3;
        }
        return b2;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-879743478")
    static int method2238(int n, final Class84 class84, final boolean b) {
        int n2 = -1;
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            n2 = Class69.field999[--Class69.field1003];
            method434 = Class26.method434(n2);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        if (n == 1100) {
            Class69.field1003 -= 2;
            method434.field2626 = Class69.field999[Class69.field1003];
            if (method434.field2626 > method434.field2628 - method434.field2675) {
                method434.field2626 = method434.field2628 - method434.field2675;
            }
            if (method434.field2626 < 0) {
                method434.field2626 = 0;
            }
            method434.field2663 = Class69.field999[Class69.field1003 + 1];
            if (method434.field2663 > method434.field2629 - method434.field2621) {
                method434.field2663 = method434.field2629 - method434.field2621;
            }
            if (method434.field2663 < 0) {
                method434.field2663 = 0;
            }
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1101) {
            method434.field2630 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1102) {
            method434.field2710 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1103) {
            method434.field2636 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1104) {
            method434.field2638 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1105) {
            method434.field2640 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1106) {
            method434.field2596 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1107) {
            method434.field2643 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1108) {
            method434.field2665 = 1;
            method434.field2593 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1109) {
            Class69.field1003 -= 6;
            method434.field2592 = Class69.field999[Class69.field1003];
            method434.field2655 = Class69.field999[Class69.field1003 + 1];
            method434.field2656 = Class69.field999[Class69.field1003 + 2];
            method434.field2657 = Class69.field999[Class69.field1003 + 3];
            method434.field2658 = Class69.field999[Class69.field1003 + 4];
            method434.field2704 = Class69.field999[Class69.field1003 + 5];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1110) {
            final int field2595 = Class69.field999[--Class69.field1003];
            if (field2595 != method434.field2595) {
                method434.field2595 = field2595;
                method434.field2728 = 0;
                method434.field2613 = 0;
                Class60.method1114(method434);
            }
            return 1;
        }
        if (n == 1111) {
            method434.field2662 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1112) {
            final String field2596 = Class69.field1001[--Class55.field497];
            if (!field2596.equals(method434.field2667)) {
                method434.field2667 = field2596;
                Class60.method1114(method434);
            }
            return 1;
        }
        if (n == 1113) {
            method434.field2739 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1114) {
            Class69.field1003 -= 3;
            method434.field2669 = Class69.field999[Class69.field1003];
            method434.field2681 = Class69.field999[Class69.field1003 + 1];
            method434.field2668 = Class69.field999[Class69.field1003 + 2];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1115) {
            method434.field2671 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1116) {
            method434.field2644 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1117) {
            method434.field2645 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1118) {
            method434.field2646 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1119) {
            method434.field2647 = (Class69.field999[--Class69.field1003] == 1);
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1120) {
            Class69.field1003 -= 2;
            method434.field2628 = Class69.field999[Class69.field1003];
            method434.field2629 = Class69.field999[Class69.field1003 + 1];
            Class60.method1114(method434);
            if (n2 != -1 && method434.field2721 == 0) {
                Class163.method3388(Class42.field366[n2 >> 16], method434, false);
            }
            return 1;
        }
        if (n == 1121) {
            Class82.method1921(method434.field2691, method434.field2606);
            Class60.method1114(Client.field744 = method434);
            return 1;
        }
        if (n == 1122) {
            method434.field2641 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1123) {
            method434.field2631 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1124) {
            method434.field2608 = Class69.field999[--Class69.field1003];
            Class60.method1114(method434);
            return 1;
        }
        if (n == 1125) {
            final Class316 field2597 = (Class316)Class76.method1803(Class23.method423(), Class69.field999[--Class69.field1003]);
            if (field2597 != null) {
                method434.field2701 = field2597;
                Class60.method1114(method434);
            }
            return 1;
        }
        if (n == 1126) {
            method434.field2639 = (Class69.field999[--Class69.field1003] == 1);
            return 1;
        }
        if (n == 1127) {
            method434.field2726 = (Class69.field999[--Class69.field1003] == 1);
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "158001383")
    static final int method2248(final int n, int n2) {
        if (n == -1) {
            return 12345678;
        }
        n2 = (n & 0x7F) * n2 / 128;
        if (n2 < 2) {
            n2 = 2;
        }
        else if (n2 > 126) {
            n2 = 126;
        }
        return (n & 0xFF80) + n2;
    }
}
