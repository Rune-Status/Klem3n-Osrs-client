import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ab")
public class Class28
{
    @ObfuscatedName("ph")
    @ObfuscatedSignature(signature = "Lcx;")
    static Class95 field244;
    @ObfuscatedName("bo")
    static String field238;
    @ObfuscatedName("bx")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field237;
    @ObfuscatedName("ex")
    @ObfuscatedSignature(signature = "Ler;")
    static Class135 field249;
    @ObfuscatedName("fc")
    @ObfuscatedSignature(signature = "Ldm;")
    static Class125 field248;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -634505767)
    public final int field240;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lha;")
    public final Class226 field236;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lha;")
    public final Class226 field243;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -39739323)
    final int field242;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1039553607)
    final int field239;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Ld;")
    final Class22 field246;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1300917331)
    int field235;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 484533419)
    int field245;
    
    Class28(final int field240, final Class226 field241, final Class226 field242, final Class22 field243) {
        this.field240 = field240;
        this.field243 = field241;
        this.field236 = field242;
        this.field246 = field243;
        final Class318 method4815 = Class255.field3246[this.field240].method4815(false);
        if (method4815 != null) {
            this.field242 = method4815.field3787;
            this.field239 = method4815.field3788;
        }
        else {
            this.field242 = 0;
            this.field239 = 0;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-2020334736")
    boolean method464(final int n, final int n2) {
        return this.method465(n, n2) || this.method466(n, n2);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-1022312970")
    boolean method465(final int n, final int n2) {
        final Class255 class255 = Class255.field3246[this.field240];
        switch (class255.field3252.field3482) {
            case 2: {
                if (n < this.field235 || n >= this.field235 + this.field242) {
                    return false;
                }
                break;
            }
            case 0: {
                if (n < this.field235 - this.field242 / 2 || n > this.field242 / 2 + this.field235) {
                    return false;
                }
                break;
            }
            case 1: {
                if (n <= this.field235 - this.field242 || n > this.field235) {
                    return false;
                }
                break;
            }
        }
        switch (class255.field3253.field3223) {
            case 2: {
                if (n2 <= this.field245 - this.field239 || n2 > this.field245) {
                    return false;
                }
                break;
            }
            case 1: {
                if (n2 < this.field245 - this.field239 / 2 || n2 > this.field239 / 2 + this.field245) {
                    return false;
                }
                break;
            }
            case 0: {
                if (n2 < this.field245 || n2 >= this.field245 + this.field239) {
                    return false;
                }
                break;
            }
        }
        return true;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIB)Z", garbageValue = "-43")
    boolean method466(final int n, final int n2) {
        return this.field246 != null && n >= this.field235 - this.field246.field184 / 2 && n <= this.field246.field184 / 2 + this.field235 && n2 >= this.field245 && n2 <= this.field246.field182 + this.field245;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1804250172")
    static final void method475() {
        Class143.method3172(30, "", "Your ignore list is full. Max of 100 for free users, and 400 for members");
    }
    
    @ObfuscatedName("if")
    @ObfuscatedSignature(signature = "(Ljq;IIII)V", garbageValue = "-801364707")
    static final void method474(Class271 method5189, final int n, final int n2, final int n3) {
        if (Client.field771 >= 400) {
            return;
        }
        if (method5189.field3516 != null) {
            method5189 = method5189.method5189();
        }
        if (method5189 == null) {
            return;
        }
        if (!method5189.field3504) {
            return;
        }
        if (method5189.field3517 && Client.field748 != n) {
            return;
        }
        String s = method5189.field3491;
        if (method5189.field3508 != 0) {
            s = s + Class135.method3113(method5189.field3508, Class138.field1876.field551) + " " + " (" + "level-" + method5189.field3508 + ")";
        }
        if (method5189.field3517 && Client.field725) {
            Class50.method993("Examine", Class6.method71(16776960) + s, 1003, n, n2, n3);
        }
        if (Client.field733 == 1) {
            Class50.method993("Use", Client.field734 + " " + "->" + " " + Class6.method71(16776960) + s, 7, n, n2, n3);
        }
        else if (Client.field785) {
            if ((Class63.field932 & 0x2) == 0x2) {
                Class50.method993(Client.field612, Client.field739 + " " + "->" + " " + Class6.method71(16776960) + s, 8, n, n2, n3);
            }
        }
        else {
            final int n4 = (method5189.field3517 && Client.field725) ? 2000 : 0;
            final String[] field3506 = method5189.field3506;
            if (field3506 != null) {
                for (int i = 4; i >= 0; --i) {
                    if (field3506[i] != null && !field3506[i].equalsIgnoreCase("Attack")) {
                        int n5 = 0;
                        if (i == 0) {
                            n5 = n4 + 9;
                        }
                        if (i == 1) {
                            n5 = n4 + 10;
                        }
                        if (i == 2) {
                            n5 = n4 + 11;
                        }
                        if (i == 3) {
                            n5 = n4 + 12;
                        }
                        if (i == 4) {
                            n5 = n4 + 13;
                        }
                        Class50.method993(field3506[i], Class6.method71(16776960) + s, n5, n, n2, n3);
                    }
                }
            }
            if (field3506 != null) {
                for (int j = 4; j >= 0; --j) {
                    if (field3506[j] != null && field3506[j].equalsIgnoreCase("Attack")) {
                        int n6 = 0;
                        if (Client.field780 != Class77.field1074) {
                            if (Client.field780 == Class77.field1075 || (Class77.field1080 == Client.field780 && method5189.field3508 > Class138.field1876.field551)) {
                                n6 = 2000;
                            }
                            int n7 = 0;
                            if (j == 0) {
                                n7 = n6 + 9;
                            }
                            if (j == 1) {
                                n7 = n6 + 10;
                            }
                            if (j == 2) {
                                n7 = n6 + 11;
                            }
                            if (j == 3) {
                                n7 = n6 + 12;
                            }
                            if (j == 4) {
                                n7 = n6 + 13;
                            }
                            Class50.method993(field3506[j], Class6.method71(16776960) + s, n7, n, n2, n3);
                        }
                    }
                }
            }
            if (!method5189.field3517 || !Client.field725) {
                Class50.method993("Examine", Class6.method71(16776960) + s, 1003, n, n2, n3);
            }
        }
    }
    
    @ObfuscatedName("iw")
    @ObfuscatedSignature(signature = "([Lhi;IIIIIIIII)V", garbageValue = "1699160696")
    static final void method467(final Class230[] field1814, final int n, final int n2, final int n3, final int n4, final int n5, final int field1815, final int field1816, final int n6) {
        Class314.method5720(n2, n3, n4, n5);
        Class122.method2862();
        for (int i = 0; i < field1814.length; ++i) {
            final Class230 class230 = field1814[i];
            if (class230 != null) {
                if (class230.field2605 != n) {
                    if (n != -1412584499) {
                        continue;
                    }
                    if (class230 != Client.field583) {
                        continue;
                    }
                }
                int field1817;
                if (n6 == -1) {
                    Client.field786[Client.field603] = class230.field2618 + field1815;
                    Client.field787[Client.field603] = field1816 + class230.field2619;
                    Client.field641[Client.field603] = class230.field2675;
                    Client.field789[Client.field603] = class230.field2621;
                    field1817 = ++Client.field603 - 1;
                }
                else {
                    field1817 = n6;
                }
                class230.field2737 = field1817;
                class230.field2627 = Client.field591;
                if (!class230.field2604 || !Class81.method1885(class230)) {
                    if (class230.field2609 > 0) {
                        final int field1818 = class230.field2609;
                        if (field1818 == 324) {
                            if (Client.field842 == -1) {
                                Client.field842 = class230.field2640;
                                Client.field586 = class230.field2641;
                            }
                            if (Client.field841.field2571) {
                                class230.field2640 = Client.field842;
                            }
                            else {
                                class230.field2640 = Client.field586;
                            }
                        }
                        else if (field1818 == 325) {
                            if (Client.field842 == -1) {
                                Client.field842 = class230.field2640;
                                Client.field586 = class230.field2641;
                            }
                            if (Client.field841.field2571) {
                                class230.field2640 = Client.field586;
                            }
                            else {
                                class230.field2640 = Client.field842;
                            }
                        }
                        else if (field1818 == 327) {
                            class230.field2656 = 150;
                            class230.field2657 = ((int)(Math.sin(Client.field591 / 40.0) * 256.0) & 0x7FF);
                            class230.field2665 = 5;
                            class230.field2593 = 0;
                        }
                        else if (field1818 == 328) {
                            class230.field2656 = 150;
                            class230.field2657 = ((int)(Math.sin(Client.field591 / 40.0) * 256.0) & 0x7FF);
                            class230.field2665 = 5;
                            class230.field2593 = 1;
                        }
                    }
                    int field1819 = class230.field2618 + field1815;
                    int field1820 = field1816 + class230.field2619;
                    int field1821 = class230.field2636;
                    if (class230 == Client.field583) {
                        if (n != -1412584499 && !class230.field2634) {
                            Class132.field1814 = field1814;
                            Class297.field3687 = field1815;
                            Class1.field15 = field1816;
                            continue;
                        }
                        if (Client.field763 && Client.field601) {
                            final int field1822 = Class48.field425;
                            final int n7 = Class48.field426 * 673804999;
                            int field1823 = field1822 - Client.field753;
                            int field1824 = n7 - Client.field749;
                            if (field1823 < Client.field757) {
                                field1823 = Client.field757;
                            }
                            if (field1823 + class230.field2675 > Client.field757 + Client.field752.field2675) {
                                field1823 = Client.field757 + Client.field752.field2675 - class230.field2675;
                            }
                            if (field1824 < Client.field758) {
                                field1824 = Client.field758;
                            }
                            if (field1824 + class230.field2621 > Client.field758 + Client.field752.field2621) {
                                field1824 = Client.field758 + Client.field752.field2621 - class230.field2621;
                            }
                            field1819 = field1823;
                            field1820 = field1824;
                        }
                        if (!class230.field2634) {
                            field1821 = 128;
                        }
                    }
                    int n8;
                    int n9;
                    int n10;
                    int n11;
                    if (class230.field2721 == 2) {
                        n8 = n2;
                        n9 = n3;
                        n10 = n4;
                        n11 = n5;
                    }
                    else if (class230.field2721 == 9) {
                        int n12 = field1819;
                        int n13 = field1820;
                        int n14 = field1819 + class230.field2675;
                        int n15 = field1820 + class230.field2621;
                        if (n14 < n12) {
                            final int n16 = n12;
                            n12 = n14;
                            n14 = n16;
                        }
                        if (n15 < n13) {
                            final int n17 = n13;
                            n13 = n15;
                            n15 = n17;
                        }
                        ++n14;
                        ++n15;
                        n8 = ((n12 > n2) ? n12 : n2);
                        n9 = ((n13 > n3) ? n13 : n3);
                        n10 = ((n14 < n4) ? n14 : n4);
                        n11 = ((n15 < n5) ? n15 : n5);
                    }
                    else {
                        final int n18 = field1819 + class230.field2675;
                        final int n19 = field1820 + class230.field2621;
                        n8 = ((field1819 > n2) ? field1819 : n2);
                        n9 = ((field1820 > n3) ? field1820 : n3);
                        n10 = ((n18 < n4) ? n18 : n4);
                        n11 = ((n19 < n5) ? n19 : n5);
                    }
                    if (class230.field2604) {
                        if (n8 >= n10) {
                            continue;
                        }
                        if (n9 >= n11) {
                            continue;
                        }
                    }
                    if (class230.field2609 != 0) {
                        if (class230.field2609 == 1336) {
                            if (Client.field597) {
                                field1820 += 15;
                                Class63.field933.method5524("Fps:" + Class47.field393, field1819 + class230.field2675, field1820, 16776960, -1);
                                field1820 += 15;
                                final Runtime runtime = Runtime.getRuntime();
                                final int n20 = (int)((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
                                int n21 = 16776960;
                                if (n20 > 327680 && !Client.field585) {
                                    n21 = 16711680;
                                }
                                Class63.field933.method5524("Mem:" + n20 + "k", field1819 + class230.field2675, field1820, n21, -1);
                                field1820 += 15;
                            }
                            continue;
                        }
                        else {
                            if (class230.field2609 == 1337) {
                                Client.field729 = field1819;
                                Client.field730 = field1820;
                                final int n22 = field1819;
                                final int n23 = field1820;
                                final int field1825 = class230.field2675;
                                final int field1826 = class230.field2621;
                                ++Client.field687;
                                Class148.method3198();
                                Class162.method3380();
                                Class54.method1019();
                                Class24.method424(true);
                                Class67.method1655();
                                Class24.method424(false);
                                for (Class79 class231 = (Class79)Client.field710.method4098(); class231 != null; class231 = (Class79)Client.field710.method4079()) {
                                    if (class231.field1121 == Class13.field82 && Client.field591 <= class231.field1127) {
                                        if (Client.field591 >= class231.field1126) {
                                            if (class231.field1135 > 0) {
                                                final Class72 class232 = Client.field843[class231.field1135 - 1];
                                                if (class232 != null && class232.field931 >= 0 && class232.field931 < 13312 && class232.field881 >= 0 && class232.field881 < 13312) {
                                                    class231.method1849(class232.field931, class232.field881, Class27.method460(class232.field931, class232.field881, class231.field1121) - class231.field1123, Client.field591);
                                                }
                                            }
                                            if (class231.field1135 < 0) {
                                                final int n24 = -class231.field1135 - 1;
                                                Class60 field1827;
                                                if (n24 == Client.field628) {
                                                    field1827 = Class138.field1876;
                                                }
                                                else {
                                                    field1827 = Client.field610[n24];
                                                }
                                                if (field1827 != null && field1827.field931 >= 0 && field1827.field931 < 13312 && field1827.field881 >= 0 && field1827.field881 < 13312) {
                                                    class231.method1849(field1827.field931, field1827.field881, Class27.method460(field1827.field931, field1827.field881, class231.field1121) - class231.field1123, Client.field591);
                                                }
                                            }
                                            class231.method1850(Client.field700);
                                            Class28.field248.method2883(Class13.field82, (int)class231.field1144, (int)class231.field1125, (int)class231.field1137, 60, class231, class231.field1140, -1L, false);
                                        }
                                    }
                                    else {
                                        class231.method4064();
                                    }
                                }
                                for (Class70 class233 = (Class70)Client.field711.method4098(); class233 != null; class233 = (Class70)Client.field711.method4079()) {
                                    if (class233.field1014 != Class13.field82 || class233.field1021) {
                                        class233.method4064();
                                    }
                                    else if (Client.field591 >= class233.field1012) {
                                        class233.method1771(Client.field700);
                                        if (class233.field1021) {
                                            class233.method4064();
                                        }
                                        else {
                                            Class28.field248.method2883(class233.field1014, class233.field1015, class233.field1016, class233.field1017, 60, class233, 0, -1L, false);
                                        }
                                    }
                                }
                                RunException.method714(n22, n23, field1825, field1826, true);
                                final int field1828 = Client.field762;
                                final int field1829 = Client.field837;
                                final int field1830 = Client.field838;
                                final int field1831 = Client.field662;
                                Class314.method5720(field1828, field1829, field1830 + field1828, field1831 + field1829);
                                Class122.method2862();
                                if (!Client.field822) {
                                    int field1832 = Client.field649;
                                    if (Client.field738 / 256 > field1832) {
                                        field1832 = Client.field738 / 256;
                                    }
                                    if (Client.field823[4] && Client.field825[4] + 128 > field1832) {
                                        field1832 = Client.field825[4] + 128;
                                    }
                                    Class49.method951(Class109.field1428, Class269.field3478, Class2.field23, field1832, Client.field717 & 0x7FF, field1832 * 3 + 600);
                                }
                                int method108;
                                if (!Client.field822) {
                                    method108 = Class12.method108();
                                }
                                else {
                                    int n25;
                                    if (Class10.field61.field960) {
                                        n25 = Class13.field82;
                                    }
                                    else if (Class27.method460(Class109.field1431, Class226.field2563, Class13.field82) - Class123.field1702 < 800 && (Class50.field443[Class13.field82][Class109.field1431 >> 7][Class226.field2563 >> 7] & 0x4) != 0x0) {
                                        n25 = Class13.field82;
                                    }
                                    else {
                                        n25 = 3;
                                    }
                                    method108 = n25;
                                }
                                final int field1833 = Class109.field1431;
                                final int field1834 = Class123.field1702;
                                final int field1835 = Class226.field2563;
                                final int field1836 = Class7.field41;
                                final int field1837 = Class85.field1201;
                                for (int j = 0; j < 5; ++j) {
                                    if (Client.field823[j]) {
                                        final int n26 = (int)(Math.random() * (Client.field824[j] * 2 + 1) - Client.field824[j] + Math.sin(Client.field705[j] * (Client.field826[j] / 100.0)) * Client.field825[j]);
                                        if (j == 0) {
                                            Class109.field1431 += n26;
                                        }
                                        if (j == 1) {
                                            Class123.field1702 += n26;
                                        }
                                        if (j == 2) {
                                            Class226.field2563 += n26;
                                        }
                                        if (j == 3) {
                                            Class85.field1201 = (n26 + Class85.field1201 & 0x7FF);
                                        }
                                        if (j == 4) {
                                            Class7.field41 += n26;
                                            if (Class7.field41 < 128) {
                                                Class7.field41 = 128;
                                            }
                                            if (Class7.field41 > 383) {
                                                Class7.field41 = 383;
                                            }
                                        }
                                    }
                                }
                                int n27 = Class48.field425;
                                int field1838 = Class48.field426 * 673804999;
                                if (Class48.field431 != 0) {
                                    n27 = Class48.field432;
                                    field1838 = Class48.field428;
                                }
                                if (n27 >= field1828 && n27 < field1828 + field1830 && field1838 >= field1829 && field1838 < field1829 + field1831) {
                                    Class47.method913(n27 - field1828, field1838 - field1829);
                                }
                                else {
                                    Class120.field1650 = false;
                                    Class120.field1656 = 0;
                                }
                                Class54.method1017();
                                Class314.method5763(field1828, field1829, field1830, field1831, 0);
                                Class54.method1017();
                                final int field1839 = Class122.field1678;
                                Class122.field1678 = Client.field840;
                                Class28.field248.method2912(Class109.field1431, Class123.field1702, Class226.field2563, Class7.field41, Class85.field1201, method108);
                                Class122.field1678 = field1839;
                                Class54.method1017();
                                Class28.field248.method3017();
                                Client.field667 = 0;
                                boolean b = false;
                                int n28 = -1;
                                int n29 = -1;
                                final int field1840 = Class81.field1167;
                                final int[] field1841 = Class81.field1159;
                                int k = 0;
                            Label_4210_Outer:
                                while (k < field1840 + Client.field622) {
                                    while (true) {
                                        Class63 class234 = null;
                                        Label_5735: {
                                            if (k >= field1840) {
                                                class234 = Client.field843[Client.field639[k - field1840]];
                                                break Label_5735;
                                            }
                                            class234 = Client.field610[field1841[k]];
                                            if (field1841[k] == Client.field707) {
                                                b = true;
                                                n28 = k;
                                            }
                                            else {
                                                if (class234 != Class138.field1876) {
                                                    break Label_5735;
                                                }
                                                n29 = k;
                                            }
                                            ++k;
                                            continue Label_4210_Outer;
                                        }
                                        Class35.method628(class234, k, field1828, field1829, field1830, field1831);
                                        continue;
                                    }
                                }
                                if (Client.field699 && n29 != -1) {
                                    Class35.method628(Class138.field1876, n29, field1828, field1829, field1830, field1831);
                                }
                                if (b) {
                                    Class35.method628(Client.field610[Client.field707], n28, field1828, field1829, field1830, field1831);
                                }
                                for (int l = 0; l < Client.field667; ++l) {
                                    final int n30 = Client.field669[l];
                                    int n31 = Client.field670[l];
                                    final int n32 = Client.field672[l];
                                    final int n33 = Client.field671[l];
                                    int n34 = 1;
                                    while (n34 != 0) {
                                        n34 = 0;
                                        for (int n35 = 0; n35 < l; ++n35) {
                                            if (n31 + 2 > Client.field670[n35] - Client.field671[n35] && n31 - n33 < Client.field670[n35] + 2 && n30 - n32 < Client.field672[n35] + Client.field669[n35] && n32 + n30 > Client.field669[n35] - Client.field672[n35] && Client.field670[n35] - Client.field671[n35] < n31) {
                                                n31 = Client.field670[n35] - Client.field671[n35];
                                                n34 = 1;
                                            }
                                        }
                                    }
                                    Client.field679 = Client.field669[l];
                                    final int[] field1842 = Client.field670;
                                    final int n36 = l;
                                    final int field1843 = n31;
                                    field1842[n36] = field1843;
                                    Client.field680 = field1843;
                                    final String s = Client.field721[l];
                                    if (Client.field742 == 0) {
                                        int n37 = 16776960;
                                        if (Client.field673[l] < 6) {
                                            n37 = Client.field731[Client.field673[l]];
                                        }
                                        if (Client.field673[l] == 6) {
                                            n37 = ((Client.field687 % 20 < 10) ? 16711680 : 16776960);
                                        }
                                        if (Client.field673[l] == 7) {
                                            n37 = ((Client.field687 % 20 < 10) ? 255 : 65535);
                                        }
                                        if (Client.field673[l] == 8) {
                                            n37 = ((Client.field687 % 20 < 10) ? 45056 : 8454016);
                                        }
                                        if (Client.field673[l] == 9) {
                                            final int n38 = 150 - Client.field675[l];
                                            if (n38 < 50) {
                                                n37 = n38 * 1280 + 16711680;
                                            }
                                            else if (n38 < 100) {
                                                n37 = 16776960 - (n38 - 50) * 327680;
                                            }
                                            else if (n38 < 150) {
                                                n37 = (n38 - 100) * 5 + 65280;
                                            }
                                        }
                                        if (Client.field673[l] == 10) {
                                            final int n39 = 150 - Client.field675[l];
                                            if (n39 < 50) {
                                                n37 = n39 * 5 + 16711680;
                                            }
                                            else if (n39 < 100) {
                                                n37 = 16711935 - (n39 - 50) * 327680;
                                            }
                                            else if (n39 < 150) {
                                                n37 = (n39 - 100) * 327680 + 255 - (n39 - 100) * 5;
                                            }
                                        }
                                        if (Client.field673[l] == 11) {
                                            final int n40 = 150 - Client.field675[l];
                                            if (n40 < 50) {
                                                n37 = 16777215 - n40 * 327685;
                                            }
                                            else if (n40 < 100) {
                                                n37 = (n40 - 50) * 327685 + 65280;
                                            }
                                            else if (n40 < 150) {
                                                n37 = 16777215 - (n40 - 100) * 327680;
                                            }
                                        }
                                        if (Client.field674[l] == 0) {
                                            Class293.field3660.method5525(s, field1828 + Client.field679, field1829 + Client.field680, n37, 0);
                                        }
                                        if (Client.field674[l] == 1) {
                                            Class293.field3660.method5609(s, field1828 + Client.field679, field1829 + Client.field680, n37, 0, Client.field687);
                                        }
                                        if (Client.field674[l] == 2) {
                                            Class293.field3660.method5575(s, field1828 + Client.field679, field1829 + Client.field680, n37, 0, Client.field687);
                                        }
                                        if (Client.field674[l] == 3) {
                                            Class293.field3660.method5539(s, field1828 + Client.field679, field1829 + Client.field680, n37, 0, Client.field687, 150 - Client.field675[l]);
                                        }
                                        if (Client.field674[l] == 4) {
                                            final int n41 = (150 - Client.field675[l]) * (Class293.field3660.method5517(s) + 100) / 150;
                                            Class314.method5790(field1828 + Client.field679 - 50, field1829, field1828 + Client.field679 + 50, field1829 + field1831);
                                            Class293.field3660.method5522(s, field1828 + Client.field679 + 50 - n41, field1829 + Client.field680, n37, 0);
                                            Class314.method5720(field1828, field1829, field1828 + field1830, field1831 + field1829);
                                        }
                                        if (Client.field674[l] == 5) {
                                            final int n42 = 150 - Client.field675[l];
                                            int n43 = 0;
                                            if (n42 < 25) {
                                                n43 = n42 - 25;
                                            }
                                            else if (n42 > 125) {
                                                n43 = n42 - 125;
                                            }
                                            Class314.method5790(field1828, field1829 + Client.field680 - Class293.field3660.field3695 - 1, field1830 + field1828, field1829 + Client.field680 + 5);
                                            Class293.field3660.method5525(s, field1828 + Client.field679, n43 + field1829 + Client.field680, n37, 0);
                                            Class314.method5720(field1828, field1829, field1828 + field1830, field1829 + field1831);
                                        }
                                    }
                                    else {
                                        Class293.field3660.method5525(s, field1828 + Client.field679, field1829 + Client.field680, 16776960, 0);
                                    }
                                }
                                if (Client.field599 == 2) {
                                    Class238.method4594((Client.field602 - Class62.field868 << 7) + Client.field605, (Client.field818 - Client.field754 << 7) + Client.field637, Client.field604 * 2);
                                    if (Client.field679 > -1 && Client.field591 % 20 < 10) {
                                        Class150.field1926[0].method5851(field1828 + Client.field679 - 12, field1829 + Client.field680 - 28);
                                    }
                                }
                                ((Class111)Class122.field1667).method2537(Client.field700);
                                Class16.method158(field1828, field1829, field1830, field1831);
                                Class109.field1431 = field1833;
                                Class123.field1702 = field1834;
                                Class226.field2563 = field1835;
                                Class7.field41 = field1836;
                                Class85.field1201 = field1837;
                                if (Client.field625 && Class185.method3786(true, false) == 0) {
                                    Client.field625 = false;
                                }
                                if (Client.field625) {
                                    Class314.method5763(field1828, field1829, field1830, field1831, 0);
                                    Class83.method1933("Loading - please wait.", false);
                                }
                                Client.field697[class230.field2737] = true;
                                Class314.method5720(n2, n3, n4, n5);
                                continue;
                            }
                            if (class230.field2609 == 1338) {
                                Class173.method3473(class230, field1819, field1820, field1817);
                                Class314.method5720(n2, n3, n4, n5);
                                continue;
                            }
                            if (class230.field2609 == 1339) {
                                final Class224 method109 = class230.method4517(false);
                                if (method109 != null) {
                                    if (Client.field810 < 3) {
                                        Class128.field1791.method5845(field1819, field1820, method109.field2553, method109.field2549, 25, 25, Client.field717, 256, method109.field2551, method109.field2550);
                                    }
                                    else {
                                        Class314.method5742(field1819, field1820, 0, method109.field2551, method109.field2550);
                                    }
                                }
                                Class314.method5720(n2, n3, n4, n5);
                                continue;
                            }
                            if (class230.field2609 == 1400) {
                                Class53.field476.method6018(field1819, field1820, class230.field2675, class230.field2621, Client.field591);
                            }
                            if (class230.field2609 == 1401) {
                                Class53.field476.method6022(field1819, field1820, class230.field2675, class230.field2621);
                            }
                        }
                    }
                    if (class230.field2721 == 0) {
                        if (!class230.field2604 && class230.field2625 && class230 != Class143.field1897) {
                            continue;
                        }
                        if (!class230.field2604) {
                            if (class230.field2663 > class230.field2629 - class230.field2621) {
                                class230.field2663 = class230.field2629 - class230.field2621;
                            }
                            if (class230.field2663 < 0) {
                                class230.field2663 = 0;
                            }
                        }
                        method467(field1814, class230.field2691, n8, n9, n10, n11, field1819 - class230.field2626, field1820 - class230.field2663, field1817);
                        if (class230.field2736 != null) {
                            method467(class230.field2736, class230.field2691, n8, n9, n10, n11, field1819 - class230.field2626, field1820 - class230.field2663, field1817);
                        }
                        final Class55 class235 = (Class55)Client.field741.method4020(class230.field2691);
                        if (class235 != null) {
                            Class35.method630(class235.field501, n8, n9, n10, n11, field1819, field1820, field1817);
                        }
                        Class314.method5720(n2, n3, n4, n5);
                        Class122.method2862();
                    }
                    if (Client.field792 || Client.field723[field1817] || Client.field790 > 1) {
                        if (class230.field2721 == 0 && !class230.field2604 && class230.field2629 > class230.field2621) {
                            final int n44 = field1819 + class230.field2675;
                            final int field1844 = class230.field2663;
                            final int field1845 = class230.field2621;
                            final int field1846 = class230.field2629;
                            Class243.field3139[0].method5829(n44, field1820);
                            Class243.field3139[1].method5829(n44, field1845 + field1820 - 16);
                            Class314.method5763(n44, field1820 + 16, 16, field1845 - 32, Client.field643);
                            int n45 = field1845 * (field1845 - 32) / field1846;
                            if (n45 < 8) {
                                n45 = 8;
                            }
                            final int n46 = field1844 * (field1845 - 32 - n45) / (field1846 - field1845);
                            Class314.method5763(n44, field1820 + n46 + 16, 16, n45, Client.field584);
                            Class314.method5738(n44, n46 + field1820 + 16, n45, Client.field646);
                            Class314.method5738(n44 + 1, field1820 + n46 + 16, n45, Client.field646);
                            Class314.method5736(n44, field1820 + n46 + 16, 16, Client.field646);
                            Class314.method5736(n44, n46 + field1820 + 17, 16, Client.field646);
                            Class314.method5738(n44 + 15, field1820 + n46 + 16, n45, Client.field836);
                            Class314.method5738(n44 + 14, n46 + field1820 + 17, n45 - 1, Client.field836);
                            Class314.method5736(n44, field1820 + n46 + n45 + 15, 16, Client.field836);
                            Class314.method5736(n44 + 1, n46 + field1820 + n45 + 14, 15, Client.field836);
                        }
                        if (class230.field2721 != 1) {
                            if (class230.field2721 == 2) {
                                int n47 = 0;
                                for (int n48 = 0; n48 < class230.field2617; ++n48) {
                                    for (int n49 = 0; n49 < class230.field2616; ++n49) {
                                        int n50 = field1819 + n49 * (class230.field2672 + 32);
                                        int n51 = n48 * (class230.field2673 + 32) + field1820;
                                        if (n47 < 20) {
                                            n50 += class230.field2685[n47];
                                            n51 += class230.field2738[n47];
                                        }
                                        if (class230.field2724[n47] > 0) {
                                            final int n52 = class230.field2724[n47] - 1;
                                            if ((n50 + 32 > n2 && n50 < n4 && n51 + 32 > n3 && n51 < n5) || (class230 == Class276.field3559 && n47 == Client.field688)) {
                                                Class318 class236;
                                                if (Client.field733 == 1 && n47 == Class13.field84 && class230.field2691 == Class187.field2372) {
                                                    class236 = Class21.method276(n52, class230.field2725[n47], 2, 0, 2, false);
                                                }
                                                else {
                                                    class236 = Class21.method276(n52, class230.field2725[n47], 1, 3153952, 2, false);
                                                }
                                                if (class236 != null) {
                                                    if (class230 == Class276.field3559 && n47 == Client.field688) {
                                                        int n53 = Class48.field425 - Client.field678;
                                                        int n54 = Class48.field426 * 673804999 - Client.field821;
                                                        if (n53 < 5 && n53 > -5) {
                                                            n53 = 0;
                                                        }
                                                        if (n54 < 5 && n54 > -5) {
                                                            n54 = 0;
                                                        }
                                                        if (Client.field693 < 5) {
                                                            n53 = 0;
                                                            n54 = 0;
                                                        }
                                                        class236.method5857(n53 + n50, n51 + n54, 128);
                                                        if (n != -1) {
                                                            final Class230 class237 = field1814[n & 0xFFFF];
                                                            if (n54 + n51 < Class314.field3763 && class237.field2663 > 0) {
                                                                int field1847 = (Class314.field3763 - n51 - n54) * Client.field700 / 3;
                                                                if (field1847 > Client.field700 * 10) {
                                                                    field1847 = Client.field700 * 10;
                                                                }
                                                                if (field1847 > class237.field2663) {
                                                                    field1847 = class237.field2663;
                                                                }
                                                                final Class230 class238 = class237;
                                                                class238.field2663 -= field1847;
                                                                Client.field821 += field1847;
                                                                Class60.method1114(class237);
                                                            }
                                                            if (n54 + n51 + 32 > Class314.field3764 && class237.field2663 < class237.field2629 - class237.field2621) {
                                                                int n55 = (n54 + n51 + 32 - Class314.field3764) * Client.field700 / 3;
                                                                if (n55 > Client.field700 * 10) {
                                                                    n55 = Client.field700 * 10;
                                                                }
                                                                if (n55 > class237.field2629 - class237.field2621 - class237.field2663) {
                                                                    n55 = class237.field2629 - class237.field2621 - class237.field2663;
                                                                }
                                                                final Class230 class239 = class237;
                                                                class239.field2663 += n55;
                                                                Client.field821 -= n55;
                                                                Class60.method1114(class237);
                                                            }
                                                        }
                                                    }
                                                    else if (class230 == Class240.field3096 && n47 == Client.field582) {
                                                        class236.method5857(n50, n51, 128);
                                                    }
                                                    else {
                                                        class236.method5851(n50, n51);
                                                    }
                                                }
                                                else {
                                                    Class60.method1114(class230);
                                                }
                                            }
                                        }
                                        else if (class230.field2676 != null && n47 < 20) {
                                            final Class318 method110 = class230.method4509(n47);
                                            if (method110 != null) {
                                                method110.method5851(n50, n51);
                                            }
                                            else if (Class230.field2603) {
                                                Class60.method1114(class230);
                                            }
                                        }
                                        ++n47;
                                    }
                                }
                            }
                            else if (class230.field2721 == 3) {
                                int n56;
                                if (Class132.method3097(class230)) {
                                    n56 = class230.field2631;
                                    if (class230 == Class143.field1897 && class230.field2633 != 0) {
                                        n56 = class230.field2633;
                                    }
                                }
                                else {
                                    n56 = class230.field2630;
                                    if (class230 == Class143.field1897 && class230.field2632 != 0) {
                                        n56 = class230.field2632;
                                    }
                                }
                                if (class230.field2710) {
                                    switch (class230.field2701.field3776) {
                                        default: {
                                            if (field1821 == 0) {
                                                Class314.method5763(field1819, field1820, class230.field2675, class230.field2621, n56);
                                                break;
                                            }
                                            Class314.method5727(field1819, field1820, class230.field2675, class230.field2621, n56, 256 - (field1821 & 0xFF));
                                            break;
                                        }
                                        case 4: {
                                            Class314.method5726(field1819, field1820, class230.field2675, class230.field2621, class230.field2630, class230.field2631, 256 - (class230.field2636 & 0xFF), 256 - (class230.field2608 & 0xFF));
                                            break;
                                        }
                                        case 3: {
                                            Class314.method5739(field1819, field1820, class230.field2675, class230.field2621, class230.field2630, class230.field2631, 256 - (class230.field2636 & 0xFF), 256 - (class230.field2608 & 0xFF));
                                            break;
                                        }
                                        case 2: {
                                            Class314.method5729(field1819, field1820, class230.field2675, class230.field2621, class230.field2630, class230.field2631, 256 - (class230.field2636 & 0xFF), 256 - (class230.field2608 & 0xFF));
                                            break;
                                        }
                                        case 1: {
                                            Class314.method5728(field1819, field1820, class230.field2675, class230.field2621, class230.field2630, class230.field2631, 256 - (class230.field2636 & 0xFF), 256 - (class230.field2608 & 0xFF));
                                            break;
                                        }
                                    }
                                }
                                else if (field1821 == 0) {
                                    Class314.method5734(field1819, field1820, class230.field2675, class230.field2621, n56);
                                }
                                else {
                                    Class314.method5741(field1819, field1820, class230.field2675, class230.field2621, n56, 256 - (field1821 & 0xFF));
                                }
                            }
                            else if (class230.field2721 == 4) {
                                final Class298 method111 = class230.method4545();
                                if (method111 == null) {
                                    if (Class230.field2603) {
                                        Class60.method1114(class230);
                                    }
                                }
                                else {
                                    String s2 = class230.field2667;
                                    int n57;
                                    if (Class132.method3097(class230)) {
                                        n57 = class230.field2631;
                                        if (class230 == Class143.field1897 && class230.field2633 != 0) {
                                            n57 = class230.field2633;
                                        }
                                        if (class230.field2717.length() > 0) {
                                            s2 = class230.field2717;
                                        }
                                    }
                                    else {
                                        n57 = class230.field2630;
                                        if (class230 == Class143.field1897 && class230.field2632 != 0) {
                                            n57 = class230.field2632;
                                        }
                                    }
                                    if (class230.field2604 && class230.field2649 != -1) {
                                        final Class269 method112 = Class111.method2563(class230.field2649);
                                        s2 = method112.field3433;
                                        if (s2 == null) {
                                            s2 = "null";
                                        }
                                        if ((method112.field3444 == 1 || class230.field2727 != 1) && class230.field2727 != -1) {
                                            s2 = Class6.method71(16748608) + s2 + "</col>" + " " + 'x' + Class35.method623(class230.field2727);
                                        }
                                    }
                                    if (class230 == Client.field744) {
                                        s2 = "Please wait...";
                                        n57 = class230.field2630;
                                    }
                                    if (!class230.field2604) {
                                        s2 = Class1.method11(s2, class230);
                                    }
                                    method111.method5526(s2, field1819, field1820, class230.field2675, class230.field2621, n57, class230.field2671 ? 0 : -1, class230.field2669, class230.field2681, class230.field2668);
                                }
                            }
                            else if (class230.field2721 == 5) {
                                if (!class230.field2604) {
                                    final Class318 method113 = class230.method4508(Class132.method3097(class230));
                                    if (method113 != null) {
                                        method113.method5851(field1819, field1820);
                                    }
                                    else if (Class230.field2603) {
                                        Class60.method1114(class230);
                                    }
                                }
                                else {
                                    Class318 class240;
                                    if (class230.field2649 != -1) {
                                        class240 = Class21.method276(class230.field2649, class230.field2727, class230.field2644, class230.field2645, class230.field2664, false);
                                    }
                                    else {
                                        class240 = class230.method4508(false);
                                    }
                                    if (class240 != null) {
                                        final int field1848 = class240.field3796;
                                        final int field1849 = class240.field3792;
                                        if (class230.field2643) {
                                            Class314.method5790(field1819, field1820, field1819 + class230.field2675, field1820 + class230.field2621);
                                            final int n58 = (field1848 - 1 + class230.field2675) / field1848;
                                            final int n59 = (field1849 - 1 + class230.field2621) / field1849;
                                            for (int n60 = 0; n60 < n58; ++n60) {
                                                for (int n61 = 0; n61 < n59; ++n61) {
                                                    if (class230.field2596 != 0) {
                                                        class240.method5870(field1848 / 2 + field1819 + n60 * field1848, field1849 / 2 + field1820 + field1849 * n61, class230.field2596, 4096);
                                                    }
                                                    else if (field1821 != 0) {
                                                        class240.method5857(field1819 + n60 * field1848, field1820 + field1849 * n61, 256 - (field1821 & 0xFF));
                                                    }
                                                    else {
                                                        class240.method5851(field1819 + field1848 * n60, field1820 + field1849 * n61);
                                                    }
                                                }
                                            }
                                            Class314.method5720(n2, n3, n4, n5);
                                        }
                                        else {
                                            final int n62 = class230.field2675 * 4096 / field1848;
                                            if (class230.field2596 != 0) {
                                                class240.method5870(class230.field2675 / 2 + field1819, class230.field2621 / 2 + field1820, class230.field2596, n62);
                                            }
                                            else if (field1821 != 0) {
                                                class240.method5856(field1819, field1820, class230.field2675, class230.field2621, 256 - (field1821 & 0xFF));
                                            }
                                            else if (field1848 == class230.field2675 && field1849 == class230.field2621) {
                                                class240.method5851(field1819, field1820);
                                            }
                                            else {
                                                class240.method5853(field1819, field1820, class230.field2675, class230.field2621);
                                            }
                                        }
                                    }
                                    else if (Class230.field2603) {
                                        Class60.method1114(class230);
                                    }
                                }
                            }
                            else if (class230.field2721 == 6) {
                                final boolean method114 = Class132.method3097(class230);
                                int n63;
                                if (method114) {
                                    n63 = class230.field2653;
                                }
                                else {
                                    n63 = class230.field2595;
                                }
                                Class119 class241 = null;
                                int n64 = 0;
                                if (class230.field2649 != -1) {
                                    final Class269 method115 = Class111.method2563(class230.field2649);
                                    if (method115 != null) {
                                        class241 = method115.method5094(class230.field2727).method5093(1);
                                        if (class241 != null) {
                                            class241.method2670();
                                            n64 = class241.field1781 / 2;
                                        }
                                        else {
                                            Class60.method1114(class230);
                                        }
                                    }
                                }
                                else if (class230.field2665 == 5) {
                                    if (class230.field2593 == 0) {
                                        class241 = Client.field841.method4468(null, -1, null, -1);
                                    }
                                    else {
                                        class241 = Class138.field1876.vmethod3067();
                                    }
                                }
                                else if (n63 == -1) {
                                    class241 = class230.method4510(null, -1, method114, Class138.field1876.field546);
                                    if (class241 == null && Class230.field2603) {
                                        Class60.method1114(class230);
                                    }
                                }
                                else {
                                    class241 = class230.method4510(Class3.method25(n63), class230.field2728, method114, Class138.field1876.field546);
                                    if (class241 == null && Class230.field2603) {
                                        Class60.method1114(class230);
                                    }
                                }
                                Class122.method2827(class230.field2675 / 2 + field1819, class230.field2621 / 2 + field1820);
                                final int n65 = Class122.field1681[class230.field2656] * class230.field2704 >> 16;
                                final int n66 = Class122.field1693[class230.field2656] * class230.field2704 >> 16;
                                if (class241 != null) {
                                    if (!class230.field2604) {
                                        class241.method2682(0, class230.field2657, 0, class230.field2656, 0, n65, n66);
                                    }
                                    else {
                                        class241.method2670();
                                        if (class230.field2662) {
                                            class241.method2710(0, class230.field2657, class230.field2658, class230.field2656, class230.field2592, n65 + n64 + class230.field2655, n66 + class230.field2655, class230.field2704);
                                        }
                                        else {
                                            class241.method2682(0, class230.field2657, class230.field2658, class230.field2656, class230.field2592, n64 + n65 + class230.field2655, n66 + class230.field2655);
                                        }
                                    }
                                }
                                Class122.method2832();
                            }
                            else {
                                if (class230.field2721 == 7) {
                                    final Class298 method116 = class230.method4545();
                                    if (method116 == null) {
                                        if (Class230.field2603) {
                                            Class60.method1114(class230);
                                        }
                                        continue;
                                    }
                                    else {
                                        int n67 = 0;
                                        for (int n68 = 0; n68 < class230.field2617; ++n68) {
                                            for (int n69 = 0; n69 < class230.field2616; ++n69) {
                                                if (class230.field2724[n67] > 0) {
                                                    final Class269 method117 = Class111.method2563(class230.field2724[n67] - 1);
                                                    String s3;
                                                    if (method117.field3444 != 1 && class230.field2725[n67] == 1) {
                                                        s3 = Class6.method71(16748608) + method117.field3433 + "</col>";
                                                    }
                                                    else {
                                                        s3 = Class6.method71(16748608) + method117.field3433 + "</col>" + " " + 'x' + Class35.method623(class230.field2725[n67]);
                                                    }
                                                    final int n70 = n69 * (class230.field2672 + 115) + field1819;
                                                    final int n71 = field1820 + (class230.field2673 + 12) * n68;
                                                    if (class230.field2669 == 0) {
                                                        method116.method5522(s3, n70, n71, class230.field2630, class230.field2671 ? 0 : -1);
                                                    }
                                                    else if (class230.field2669 == 1) {
                                                        method116.method5525(s3, class230.field2675 / 2 + n70, n71, class230.field2630, class230.field2671 ? 0 : -1);
                                                    }
                                                    else {
                                                        method116.method5524(s3, n70 + class230.field2675 - 1, n71, class230.field2630, class230.field2671 ? 0 : -1);
                                                    }
                                                }
                                                ++n67;
                                            }
                                        }
                                    }
                                }
                                if (class230.field2721 == 8 && class230 == Class141.field1888 && Client.field623 == Client.field732) {
                                    int n72 = 0;
                                    int n73 = 0;
                                    final Class298 field1850 = Class63.field933;
                                    String s4 = Class1.method11(class230.field2667, class230);
                                    while (s4.length() > 0) {
                                        final int index = s4.indexOf("<br>");
                                        String substring;
                                        if (index != -1) {
                                            substring = s4.substring(0, index);
                                            s4 = s4.substring(index + 4);
                                        }
                                        else {
                                            substring = s4;
                                            s4 = "";
                                        }
                                        final int method118 = field1850.method5517(substring);
                                        if (method118 > n72) {
                                            n72 = method118;
                                        }
                                        n73 = n73 + field1850.field3695 + 1;
                                    }
                                    n72 += 6;
                                    n73 += 7;
                                    int n74 = field1819 + class230.field2675 - 5 - n72;
                                    int n75 = field1820 + class230.field2621 + 5;
                                    if (n74 < field1819 + 5) {
                                        n74 = field1819 + 5;
                                    }
                                    if (n72 + n74 > n4) {
                                        n74 = n4 - n72;
                                    }
                                    if (n73 + n75 > n5) {
                                        n75 = n5 - n73;
                                    }
                                    Class314.method5763(n74, n75, n72, n73, 16777120);
                                    Class314.method5734(n74, n75, n72, n73, 0);
                                    final String field1851 = class230.field2667;
                                    int n76 = n75 + field1850.field3695 + 2;
                                    String s5 = Class1.method11(field1851, class230);
                                    while (s5.length() > 0) {
                                        final int index2 = s5.indexOf("<br>");
                                        String substring2;
                                        if (index2 != -1) {
                                            substring2 = s5.substring(0, index2);
                                            s5 = s5.substring(index2 + 4);
                                        }
                                        else {
                                            substring2 = s5;
                                            s5 = "";
                                        }
                                        field1850.method5522(substring2, n74 + 3, n76, 0, -1);
                                        n76 = n76 + field1850.field3695 + 1;
                                    }
                                }
                                if (class230.field2721 == 9) {
                                    int n77;
                                    int n78;
                                    int n79;
                                    int n80;
                                    if (class230.field2639) {
                                        n77 = field1819;
                                        n78 = field1820 + class230.field2621;
                                        n79 = field1819 + class230.field2675;
                                        n80 = field1820;
                                    }
                                    else {
                                        n77 = field1819;
                                        n78 = field1820;
                                        n79 = field1819 + class230.field2675;
                                        n80 = field1820 + class230.field2621;
                                    }
                                    if (class230.field2638 == 1) {
                                        Class314.method5765(n77, n78, n79, n80, class230.field2630);
                                    }
                                    else {
                                        final int n81 = n77;
                                        final int n82 = n78;
                                        final int field1852 = class230.field2630;
                                        final int field1853 = class230.field2638;
                                        final int n83 = n79 - n81;
                                        final int n84 = n80 - n82;
                                        final int n85 = (n83 >= 0) ? n83 : (-n83);
                                        final int n86 = (n84 >= 0) ? n84 : (-n84);
                                        int n87 = n85;
                                        if (n87 < n86) {
                                            n87 = n86;
                                        }
                                        if (n87 != 0) {
                                            int n88 = (n83 << 16) / n87;
                                            int n89 = (n84 << 16) / n87;
                                            if (n89 <= n88) {
                                                n88 = -n88;
                                            }
                                            else {
                                                n89 = -n89;
                                            }
                                            final int n90 = field1853 * n89 >> 17;
                                            final int n91 = n89 * field1853 + 1 >> 17;
                                            final int n92 = field1853 * n88 >> 17;
                                            final int n93 = n88 * field1853 + 1 >> 17;
                                            final int n94 = n81 - Class314.field3765;
                                            final int n95 = n82 - Class314.field3763;
                                            final int n96 = n94 + n90;
                                            final int n97 = n94 - n91;
                                            final int n98 = n94 + n83 - n91;
                                            final int n99 = n90 + n83 + n94;
                                            final int n100 = n95 + n92;
                                            final int n101 = n95 - n93;
                                            final int n102 = n95 + n84 - n93;
                                            final int n103 = n95 + n84 + n92;
                                            Class122.method2793(n96, n97, n98);
                                            Class122.method2796(n100, n101, n102, n96, n97, n98, field1852);
                                            Class122.method2793(n96, n98, n99);
                                            Class122.method2796(n100, n102, n103, n96, n98, n99, field1852);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
