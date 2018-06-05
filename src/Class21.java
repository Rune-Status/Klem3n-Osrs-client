import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("j")
public final class Class21
{
    @ObfuscatedName("rb")
    @ObfuscatedSignature(signature = "Lin;")
    public static Class251 field175;
    @ObfuscatedName("cu")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field179;
    @ObfuscatedName("w")
    final int[] field178;
    
    Class21() {
        this.field178 = new int[4096];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lan;B)V", garbageValue = "-31")
    final void method265(final Class32 class32) {
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                this.field178[i * 64 + j] = (class32.method547(i, j) | 0xFF000000);
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIB)I", garbageValue = "9")
    final int method272(final int n, final int n2) {
        return this.field178[n * 64 + n2];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;III)[Lly;", garbageValue = "-711086556")
    static Class317[] method278(final Class247 class247, final int n, final int n2) {
        if (!Class306.method5660(class247, n, n2)) {
            return null;
        }
        return Class49.method950();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;I)V", garbageValue = "1802927852")
    public static void method277(final Class247 field3529) {
        Class272.field3529 = field3529;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)Lio;", garbageValue = "-116299600")
    public static Class256 method275(final int n) {
        final Class256 class256 = (Class256)Class256.field3257.method3989(n);
        if (class256 != null) {
            return class256;
        }
        final byte[] method4625 = Class256.field3258.method4625(19, n);
        final Class256 class257 = new Class256();
        if (method4625 != null) {
            class257.method4848(new Class182(method4625));
        }
        Class256.field3257.method3983(class257, n);
        return class257;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIILfw;Lfk;B)Z", garbageValue = "96")
    static final boolean method273(final int n, final int n2, final int n3, final Class166 class166, final Class164 class167) {
        int n4 = n;
        int n5 = n2;
        final int n6 = 64;
        final int n7 = 64;
        final int n8 = n - n6;
        final int n9 = n2 - n7;
        Class165.field2035[n6][n7] = 99;
        Class165.field2041[n6][n7] = 0;
        int n10 = 0;
        int i = 0;
        Class165.field2039[n10] = n4;
        Class165.field2038[n10++] = n5;
        final int[][] field2029 = class167.field2029;
        while (i != n10) {
            n4 = Class165.field2039[i];
            n5 = Class165.field2038[i];
            i = (i + 1 & 0xFFF);
            final int n11 = n4 - n8;
            final int n12 = n5 - n9;
            final int n13 = n4 - class167.field2025;
            final int n14 = n5 - class167.field2026;
            if (class166.vmethod3440(n3, n4, n5, class167)) {
                Class19.field152 = n4;
                Class165.field2037 = n5;
                return true;
            }
            final int n15 = Class165.field2041[n11][n12] + 1;
            Label_0226: {
                if (n11 > 0 && Class165.field2035[n11 - 1][n12] == 0) {
                    if ((field2029[n13 - 1][n14] & 0x124010E) == 0x0) {
                        if ((field2029[n13 - 1][n14 + n3 - 1] & 0x1240138) == 0x0) {
                            for (int j = 1; j < n3 - 1; ++j) {
                                if ((field2029[n13 - 1][j + n14] & 0x124013E) != 0x0) {
                                    break Label_0226;
                                }
                            }
                            Class165.field2039[n10] = n4 - 1;
                            Class165.field2038[n10] = n5;
                            n10 = (n10 + 1 & 0xFFF);
                            Class165.field2035[n11 - 1][n12] = 2;
                            Class165.field2041[n11 - 1][n12] = n15;
                        }
                    }
                }
            }
            Label_0276: {
                if (n11 < 128 - n3) {
                    if (Class165.field2035[n11 + 1][n12] == 0) {
                        if ((field2029[n13 + n3][n14] & 0x1240183) == 0x0) {
                            if ((field2029[n13 + n3][n14 + n3 - 1] & 0x12401E0) == 0x0) {
                                for (int k = 1; k < n3 - 1; ++k) {
                                    if ((field2029[n13 + n3][n14 + k] & 0x12401E3) != 0x0) {
                                        break Label_0276;
                                    }
                                }
                                Class165.field2039[n10] = n4 + 1;
                                Class165.field2038[n10] = n5;
                                n10 = (n10 + 1 & 0xFFF);
                                Class165.field2035[n11 + 1][n12] = 8;
                                Class165.field2041[n11 + 1][n12] = n15;
                            }
                        }
                    }
                }
            }
            Label_0304: {
                if (n12 > 0 && Class165.field2035[n11][n12 - 1] == 0) {
                    if ((field2029[n13][n14 - 1] & 0x124010E) == 0x0) {
                        if ((field2029[n13 + n3 - 1][n14 - 1] & 0x1240183) == 0x0) {
                            for (int l = 1; l < n3 - 1; ++l) {
                                if ((field2029[n13 + l][n14 - 1] & 0x124018F) != 0x0) {
                                    break Label_0304;
                                }
                            }
                            Class165.field2039[n10] = n4;
                            Class165.field2038[n10] = n5 - 1;
                            n10 = (n10 + 1 & 0xFFF);
                            Class165.field2035[n11][n12 - 1] = 1;
                            Class165.field2041[n11][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_0362: {
                if (n12 < 128 - n3) {
                    if (Class165.field2035[n11][n12 + 1] == 0) {
                        if ((field2029[n13][n14 + n3] & 0x1240138) == 0x0) {
                            if ((field2029[n13 + n3 - 1][n14 + n3] & 0x12401E0) == 0x0) {
                                for (int n16 = 1; n16 < n3 - 1; ++n16) {
                                    if ((field2029[n16 + n13][n14 + n3] & 0x12401F8) != 0x0) {
                                        break Label_0362;
                                    }
                                }
                                Class165.field2039[n10] = n4;
                                Class165.field2038[n10] = n5 + 1;
                                n10 = (n10 + 1 & 0xFFF);
                                Class165.field2035[n11][n12 + 1] = 4;
                                Class165.field2041[n11][n12 + 1] = n15;
                            }
                        }
                    }
                }
            }
            Label_0401: {
                if (n11 > 0 && n12 > 0 && Class165.field2035[n11 - 1][n12 - 1] == 0) {
                    if ((field2029[n13 - 1][n14 - 1] & 0x124010E) == 0x0) {
                        for (int n17 = 1; n17 < n3; ++n17) {
                            if ((field2029[n13 - 1][n17 + (n14 - 1)] & 0x124013E) != 0x0) {
                                break Label_0401;
                            }
                            if ((field2029[n17 + (n13 - 1)][n14 - 1] & 0x124018F) != 0x0) {
                                break Label_0401;
                            }
                        }
                        Class165.field2039[n10] = n4 - 1;
                        Class165.field2038[n10] = n5 - 1;
                        n10 = (n10 + 1 & 0xFFF);
                        Class165.field2035[n11 - 1][n12 - 1] = 3;
                        Class165.field2041[n11 - 1][n12 - 1] = n15;
                    }
                }
            }
            Label_0461: {
                if (n11 < 128 - n3 && n12 > 0) {
                    if (Class165.field2035[n11 + 1][n12 - 1] == 0) {
                        if ((field2029[n13 + n3][n14 - 1] & 0x1240183) == 0x0) {
                            for (int n18 = 1; n18 < n3; ++n18) {
                                if ((field2029[n13 + n3][n18 + (n14 - 1)] & 0x12401E3) != 0x0) {
                                    break Label_0461;
                                }
                                if ((field2029[n13 + n18][n14 - 1] & 0x124018F) != 0x0) {
                                    break Label_0461;
                                }
                            }
                            Class165.field2039[n10] = n4 + 1;
                            Class165.field2038[n10] = n5 - 1;
                            n10 = (n10 + 1 & 0xFFF);
                            Class165.field2035[n11 + 1][n12 - 1] = 9;
                            Class165.field2041[n11 + 1][n12 - 1] = n15;
                        }
                    }
                }
            }
            Label_0528: {
                if (n11 > 0 && n12 < 128 - n3) {
                    if (Class165.field2035[n11 - 1][n12 + 1] == 0) {
                        if ((field2029[n13 - 1][n14 + n3] & 0x1240138) == 0x0) {
                            for (int n19 = 1; n19 < n3; ++n19) {
                                if ((field2029[n13 - 1][n19 + n14] & 0x124013E) != 0x0) {
                                    break Label_0528;
                                }
                                if ((field2029[n19 + (n13 - 1)][n14 + n3] & 0x12401F8) != 0x0) {
                                    break Label_0528;
                                }
                            }
                            Class165.field2039[n10] = n4 - 1;
                            Class165.field2038[n10] = n5 + 1;
                            n10 = (n10 + 1 & 0xFFF);
                            Class165.field2035[n11 - 1][n12 + 1] = 6;
                            Class165.field2041[n11 - 1][n12 + 1] = n15;
                        }
                    }
                }
            }
            if (n11 >= 128 - n3 || n12 >= 128 - n3 || Class165.field2035[n11 + 1][n12 + 1] != 0) {
                continue;
            }
            if ((field2029[n13 + n3][n14 + n3] & 0x12401E0) != 0x0) {
                continue;
            }
            
            boolean skip = false;
            
            for (int n20 = 1; n20 < n3; ++n20) {
                if ((field2029[n20 + n13][n14 + n3] & 0x12401F8) != 0x0) {
                	skip = true;
                	break;
                }
                if ((field2029[n13 + n3][n14 + n20] & 0x12401E3) != 0x0) {
                	skip = true;
                	break;
                }
            }
            if(!skip)
            {
	            Class165.field2039[n10] = n4 + 1;
	            Class165.field2038[n10] = n5 + 1;
	            n10 = (n10 + 1 & 0xFFF);
	            Class165.field2035[n11 + 1][n12 + 1] = 12;
	            Class165.field2041[n11 + 1][n12 + 1] = n15;
            }
        }
        Class19.field152 = n4;
        Class165.field2037 = n5;
        return false;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lir;Ljava/lang/String;Ljava/lang/String;I)[Lll;", garbageValue = "1309811201")
    public static Class318[] method279(final Class247 class247, final String s, final String s2) {
        final int method4642 = class247.method4642(s);
        Class318[] array;
        if (!Class306.method5660(class247, method4642, class247.method4643(method4642, s2))) {
            array = null;
        }
        else {
            final Class318[] array2 = new Class318[Class319.field3802];
            for (int i = 0; i < Class319.field3802; ++i) {
                final Class318[] array3 = array2;
                final int n = i;
                final Class318 class248 = new Class318();
                array3[n] = class248;
                final Class318 class249 = class248;
                class249.field3796 = Class305.field3729;
                class249.field3792 = Class319.field3798;
                class249.field3793 = Class7.field45[i];
                class249.field3790 = Class225.field2562[i];
                class249.field3787 = Class319.field3800[i];
                class249.field3788 = Class319.field3799[i];
                final int n2 = class249.field3788 * class249.field3787;
                final byte[] array4 = Class319.field3801[i];
                class249.field3791 = new int[n2];
                for (int j = 0; j < n2; ++j) {
                    class249.field3791[j] = Class172.field2260[array4[j] & 0xFF];
                }
            }
            Class7.field45 = null;
            Class225.field2562 = null;
            Class319.field3800 = null;
            Class319.field3799 = null;
            Class172.field2260 = null;
            Class319.field3801 = null;
            array = array2;
        }
        return array;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "-1457560196")
    static int method274(int n, final Class84 class84, final boolean b) {
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        if (n == 1300) {
            final int n2 = Class69.field999[--Class69.field1003] - 1;
            if (n2 < 0 || n2 > 9) {
                --Class55.field497;
                return 1;
            }
            method434.method4512(n2, Class69.field1001[--Class55.field497]);
            return 1;
        }
        else {
            if (n == 1301) {
                Class69.field1003 -= 2;
                method434.field2666 = Class146.method3191(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1]);
                return 1;
            }
            if (n == 1302) {
                method434.field2634 = (Class69.field999[--Class69.field1003] == 1);
                return 1;
            }
            if (n == 1303) {
                method434.field2682 = Class69.field999[--Class69.field1003];
                return 1;
            }
            if (n == 1304) {
                method434.field2684 = Class69.field999[--Class69.field1003];
                return 1;
            }
            if (n == 1305) {
                method434.field2679 = Class69.field1001[--Class55.field497];
                return 1;
            }
            if (n == 1306) {
                method434.field2661 = Class69.field1001[--Class55.field497];
                return 1;
            }
            if (n == 1307) {
                method434.field2680 = null;
                return 1;
            }
            return 2;
        }
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(IIIIIZI)Lll;", garbageValue = "-1686094834")
    public static final Class318 method276(final int n, final int n2, final int n3, final int n4, int n5, final boolean b) {
        if (n2 == -1) {
            n5 = 0;
        }
        else if (n5 == 2 && n2 != 1) {
            n5 = 1;
        }
        final long n6 = (n4 << 42) + ((n5 << 40) + ((n3 << 38) + ((n2 << 16) + n)));
        if (!b) {
            final Class318 class318 = (Class318)Class269.field3429.method3989(n6);
            if (class318 != null) {
                return class318;
            }
        }
        Class269 class319 = Class111.method2563(n);
        if (n2 > 1 && class319.field3420 != null) {
            int n7 = -1;
            for (int i = 0; i < 10; ++i) {
                if (n2 >= class319.field3459[i] && class319.field3459[i] != 0) {
                    n7 = class319.field3420[i];
                }
            }
            if (n7 != -1) {
                class319 = Class111.method2563(n7);
            }
        }
        final Class119 method5093 = class319.method5093(1);
        if (method5093 == null) {
            return null;
        }
        Class318 class320 = null;
        if (class319.field3465 != -1) {
            class320 = method276(class319.field3464, 10, 1, 0, 0, true);
            if (class320 == null) {
                return null;
            }
        }
        else if (class319.field3475 != -1) {
            class320 = method276(class319.field3473, n2, n3, n4, 0, false);
            if (class320 == null) {
                return null;
            }
        }
        else if (class319.field3477 != -1) {
            class320 = method276(class319.field3476, n2, 0, 0, 0, false);
            if (class320 == null) {
                return null;
            }
        }
        final int[] field3766 = Class314.field3766;
        final int field3767 = Class314.field3761;
        final int field3768 = Class314.field3762;
        final int[] array = new int[4];
        Class314.method5722(array);
        final Class318 class321 = new Class318(36, 32);
        Class314.method5718(class321.field3791, 36, 32);
        Class314.method5724();
        Class122.method2862();
        Class122.method2827(16, 16);
        Class122.field1670 = false;
        if (class319.field3477 != -1) {
            class320.method5851(0, 0);
        }
        int field3769 = class319.field3438;
        if (b) {
            field3769 *= (int)1.5;
        }
        else if (n3 == 2) {
            field3769 *= (int)1.04;
        }
        final int n8 = field3769 * Class122.field1681[class319.field3439] >> 16;
        final int n9 = field3769 * Class122.field1693[class319.field3439] >> 16;
        method5093.method2670();
        method5093.method2682(0, class319.field3440, class319.field3474, class319.field3439, class319.field3442, method5093.field1781 / 2 + n8 + class319.field3443, n9 + class319.field3443);
        if (class319.field3475 != -1) {
            class320.method5851(0, 0);
        }
        if (n3 >= 1) {
            class321.method5847(1);
        }
        if (n3 >= 2) {
            class321.method5847(16777215);
        }
        if (n4 != 0) {
            class321.method5848(n4);
        }
        Class314.method5718(class321.field3791, 36, 32);
        if (class319.field3465 != -1) {
            class320.method5851(0, 0);
        }
        if (n5 == 1 || (n5 == 2 && class319.field3444 == 1)) {
            final Class298 field3770 = Class269.field3466;
            String s;
            if (n2 < 100000) {
                s = "<col=ffff00>" + n2 + "</col>";
            }
            else if (n2 < 10000000) {
                s = "<col=ffffff>" + n2 / 1000 + "K" + "</col>";
            }
            else {
                s = "<col=00ff80>" + n2 / 1000000 + "M" + "</col>";
            }
            field3770.method5522(s, 0, 9, 16776960, 1);
        }
        if (!b) {
            Class269.field3429.method3983(class321, n6);
        }
        Class314.method5718(field3766, field3767, field3768);
        Class314.method5723(array);
        Class122.method2862();
        Class122.field1670 = true;
        return class321;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1994445247")
    static final void method271(final String s) {
        Class143.method3172(30, "", s + " is already on your ignore list");
    }
    
    @ObfuscatedName("jo")
    @ObfuscatedSignature(signature = "(Lhi;I)Lhi;", garbageValue = "-1594952261")
    static Class230 method264(final Class230 class230) {
        Class230 method434 = class230;
        final int method435 = Class190.method3865(Class24.method425(method434));
        Class230 class231 = null;
        Label_0017: {
            if (method435 == 0) {
                class231 = null;
            }
            else {
                for (int i = 0; i < method435; ++i) {
                    method434 = Class26.method434(method434.field2605);
                    if (method434 == null) {
                        class231 = null;
                        break Label_0017;
                    }
                }
                class231 = method434;
            }
        }
        Class230 field2666 = class231;
        if (field2666 == null) {
            field2666 = class230.field2666;
        }
        return field2666;
    }
    
    @ObfuscatedName("jy")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1316208853")
    static final void method270(final int n) {
        if (!Class261.method4931(n)) {
            return;
        }
        Class245.method4620(Class42.field366[n], -1);
    }
}
