import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fg")
public class Class173
{
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = "1423471307")
    static void method3472(final int n, final String s, final String s2, final String s3) {
        Class86 class86 = (Class86) Class83.field1180.get(n);
        if (class86 == null) {
            class86 = new Class86();
            Class83.field1180.put(n, class86);
        }
        final Class58 method1964 = class86.method1964(n, s, s2, s3);
        Class83.field1181.method3944(method1964, method1964.field540);
        Class83.field1184.method4155(method1964);
        Client.field770 = Client.field801;
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "1923178651")
    static int method3469(final int n, final Class84 class84, final boolean b) {
        if (n == 3300) {
            Class69.field999[++Class69.field1003 - 1] = Client.field591;
            return 1;
        }
        if (n == 3301) {
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = Class230.method4559(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
            return 1;
        }
        if (n == 3302) {
            Class69.field1003 -= 2;
            final int n2 = Class69.field999[Class69.field1003];
            final int n3 = Class69.field999[Class69.field1003 + 1];
            final int[] field999 = Class69.field999;
            final int n4 = ++Class69.field1003 - 1;
            final Class53 class85 = (Class53)Class53.field474.method4020(n2);
            int n5;
            if (class85 == null) {
                n5 = 0;
            }
            else if (n3 >= 0 && n3 < class85.field473.length) {
                n5 = class85.field473[n3];
            }
            else {
                n5 = 0;
            }
            field999[n4] = n5;
            return 1;
        }
        if (n == 3303) {
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = Class139.method3143(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
            return 1;
        }
        if (n == 3304) {
            Class69.field999[++Class69.field1003 - 1] = Class130.method3074(Class69.field999[--Class69.field1003]).field3227;
            return 1;
        }
        if (n == 3305) {
            Class69.field999[++Class69.field1003 - 1] = Client.field712[Class69.field999[--Class69.field1003]];
            return 1;
        }
        if (n == 3306) {
            Class69.field999[++Class69.field1003 - 1] = Client.field713[Class69.field999[--Class69.field1003]];
            return 1;
        }
        if (n == 3307) {
            Class69.field999[++Class69.field1003 - 1] = Client.field640[Class69.field999[--Class69.field1003]];
            return 1;
        }
        if (n == 3308) {
            Class69.field999[++Class69.field1003 - 1] = ((Class138.field1876.field931 >> 7) + Class62.field868 << 14) + ((Class138.field1876.field881 >> 7) + Client.field754) + (Class13.field82 << 28);
            return 1;
        }
        if (n == 3309) {
            Class69.field999[++Class69.field1003 - 1] = (Class69.field999[--Class69.field1003] >> 14 & 0x3FFF);
            return 1;
        }
        if (n == 3310) {
            Class69.field999[++Class69.field1003 - 1] = Class69.field999[--Class69.field1003] >> 28;
            return 1;
        }
        if (n == 3311) {
            Class69.field999[++Class69.field1003 - 1] = (Class69.field999[--Class69.field1003] & 0x3FFF);
            return 1;
        }
        if (n == 3312) {
            Class69.field999[++Class69.field1003 - 1] = (Client.field668 ? 1 : 0);
            return 1;
        }
        if (n == 3313) {
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = Class230.method4559(Class69.field999[Class69.field1003] + 32768, Class69.field999[Class69.field1003 + 1]);
            return 1;
        }
        if (n == 3314) {
            Class69.field1003 -= 2;
            final int n6 = Class69.field999[Class69.field1003] + 32768;
            final int n7 = Class69.field999[Class69.field1003 + 1];
            final int[] field1000 = Class69.field999;
            final int n8 = ++Class69.field1003 - 1;
            final Class53 class86 = (Class53)Class53.field474.method4020(n6);
            int n9;
            if (class86 == null) {
                n9 = 0;
            }
            else if (n7 >= 0 && n7 < class86.field473.length) {
                n9 = class86.field473[n7];
            }
            else {
                n9 = 0;
            }
            field1000[n8] = n9;
            return 1;
        }
        if (n == 3315) {
            Class69.field1003 -= 2;
            Class69.field999[++Class69.field1003 - 1] = Class139.method3143(Class69.field999[Class69.field1003] + 32768, Class69.field999[Class69.field1003 + 1]);
            return 1;
        }
        if (n == 3316) {
            if (Client.field747 >= 2) {
                Class69.field999[++Class69.field1003 - 1] = Client.field747;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 3317) {
            Class69.field999[++Class69.field1003 - 1] = Client.field598;
            return 1;
        }
        if (n == 3318) {
            Class69.field999[++Class69.field1003 - 1] = Client.field581;
            return 1;
        }
        if (n == 3321) {
            Class69.field999[++Class69.field1003 - 1] = Client.field745;
            return 1;
        }
        if (n == 3322) {
            Class69.field999[++Class69.field1003 - 1] = Client.field782;
            return 1;
        }
        if (n == 3323) {
            if (Client.field776) {
                Class69.field999[++Class69.field1003 - 1] = 1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            return 1;
        }
        if (n == 3324) {
            Class69.field999[++Class69.field1003 - 1] = Client.field632;
            return 1;
        }
        if (n == 3325) {
            Class69.field1003 -= 4;
            Class69.field999[++Class69.field1003 - 1] = (Class69.field999[Class69.field1003 + 1] << 14) + Class69.field999[Class69.field1003] + (Class69.field999[Class69.field1003 + 2] << 28) + Class69.field999[Class69.field1003 + 3];
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("fi")
    @ObfuscatedSignature(signature = "(Ljn;IIII)V", garbageValue = "1672351117")
    static void method3471(final Class273 class273, final int n, final int n2, final int n3) {
        if (Client.field656 >= 50 || Client.field815 == 0) {
            return;
        }
        if (class273.field3543 == null || n >= class273.field3543.length) {
            return;
        }
        final int n4 = class273.field3543[n];
        if (n4 == 0) {
            return;
        }
        final int n5 = n4 >> 8;
        final int n6 = n4 >> 4 & 0x7;
        final int n7 = n4 & 0xF;
        Client.field817[Client.field656] = n5;
        Client.field676[Client.field656] = n6;
        Client.field819[Client.field656] = 0;
        Client.field719[Client.field656] = null;
        Client.field820[Client.field656] = n7 + ((n3 - 64) / 128 << 8) + ((n2 - 64) / 128 << 16);
        ++Client.field656;
    }
    
    @ObfuscatedName("iy")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "1")
    static boolean method3470(final int n) {
        return n == 57 || n == 58 || n == 1007 || n == 25 || n == 30;
    }
    
    @ObfuscatedName("jq")
    @ObfuscatedSignature(signature = "(Lhi;IIIS)V", garbageValue = "-9115")
    static final void method3473(final Class230 class230, final int n, final int n2, final int n3) {
        Class54.method1017();
        final Class224 method4517 = class230.method4517(false);
        if (method4517 == null) {
            return;
        }
        Class314.method5720(n, n2, method4517.field2553 + n, n2 + method4517.field2549);
        if (Client.field810 != 2 && Client.field810 != 5) {
            Class72.field1038.method5845(n, n2, method4517.field2553, method4517.field2549, Class138.field1876.field931 / 32 + 48, 464 - Class138.field1876.field881 / 32, Client.field717 & 0x7FF, 256, method4517.field2551, method4517.field2550);
            for (int i = 0; i < Client.field724; ++i) {
                Class55.method1022(n, n2, Client.field805[i] * 4 + 2 - Class138.field1876.field931 / 32, Client.field806[i] * 4 + 2 - Class138.field1876.field881 / 32, Client.field816[i], method4517);
            }
            for (int j = 0; j < 104; ++j) {
                for (int k = 0; k < 104; ++k) {
                    if (Client.field708[Class13.field82][j][k] != null) {
                        Class55.method1022(n, n2, j * 4 + 2 - Class138.field1876.field931 / 32, k * 4 + 2 - Class138.field1876.field881 / 32, Class36.field314[0], method4517);
                    }
                }
            }
            for (int l = 0; l < Client.field622; ++l) {
                final Class72 class231 = Client.field843[Client.field639[l]];
                if (class231 != null && class231.vmethod1786()) {
                    Class271 class232 = class231.field1037;
                    if (class232 != null && class232.field3516 != null) {
                        class232 = class232.method5189();
                    }
                    if (class232 != null && class232.field3507 && class232.field3504) {
                        Class55.method1022(n, n2, class231.field931 / 32 - Class138.field1876.field931 / 32, class231.field881 / 32 - Class138.field1876.field881 / 32, Class36.field314[1], method4517);
                    }
                }
            }
            final int field1167 = Class81.field1167;
            final int[] field1168 = Class81.field1159;
            for (int n4 = 0; n4 < field1167; ++n4) {
                final Class60 class233 = Client.field610[field1168[n4]];
                if (class233 != null && class233.vmethod1786() && !class233.field566 && class233 != Class138.field1876) {
                    final int n5 = class233.field931 / 32 - Class138.field1876.field931 / 32;
                    final int n6 = class233.field881 / 32 - Class138.field1876.field881 / 32;
                    boolean b = false;
                    if (Class138.field1876.field568 != 0 && class233.field568 != 0 && class233.field568 == Class138.field1876.field568) {
                        b = true;
                    }
                    if (class233.method1083()) {
                        Class55.method1022(n, n2, n5, n6, Class36.field314[3], method4517);
                    }
                    else if (b) {
                        Class55.method1022(n, n2, n5, n6, Class36.field314[4], method4517);
                    }
                    else if (class233.method1104()) {
                        Class55.method1022(n, n2, n5, n6, Class36.field314[5], method4517);
                    }
                    else {
                        Class55.method1022(n, n2, n5, n6, Class36.field314[2], method4517);
                    }
                }
            }
            if (Client.field599 != 0 && Client.field591 % 20 < 10) {
                if (Client.field599 == 1 && Client.field600 >= 0 && Client.field600 < Client.field843.length) {
                    final Class72 class234 = Client.field843[Client.field600];
                    if (class234 != null) {
                        Class121.method2783(n, n2, class234.field931 / 32 - Class138.field1876.field931 / 32, class234.field881 / 32 - Class138.field1876.field881 / 32, Class111.field1446[1], method4517);
                    }
                }
                if (Client.field599 == 2) {
                    Class121.method2783(n, n2, Client.field602 * 4 - Class62.field868 * 4 + 2 - Class138.field1876.field931 / 32, Client.field818 * 4 - Client.field754 * 4 + 2 - Class138.field1876.field881 / 32, Class111.field1446[1], method4517);
                }
                if (Client.field599 == 10 && Client.field579 >= 0 && Client.field579 < Client.field610.length) {
                    final Class60 class235 = Client.field610[Client.field579];
                    if (class235 != null) {
                        Class121.method2783(n, n2, class235.field931 / 32 - Class138.field1876.field931 / 32, class235.field881 / 32 - Class138.field1876.field881 / 32, Class111.field1446[1], method4517);
                    }
                }
            }
            if (Client.field808 != 0) {
                Class55.method1022(n, n2, Client.field808 * 4 + 2 - Class138.field1876.field931 / 32, Client.field809 * 4 + 2 - Class138.field1876.field881 / 32, Class111.field1446[0], method4517);
            }
            if (!Class138.field1876.field566) {
                Class314.method5763(method4517.field2553 / 2 + n - 1, method4517.field2549 / 2 + n2 - 1, 3, 3, 16777215);
            }
        }
        else {
            Class314.method5742(n, n2, 0, method4517.field2551, method4517.field2550);
        }
        Client.field788[n3] = true;
    }
}
