import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("il")
public class Class245 extends Class204
{
    @ObfuscatedName("pq")
    @ObfuscatedGetter(intValue = 117401965)
    static int field3154;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 2021384191)
    int field3150;
    @ObfuscatedName("w")
    byte[] field3149;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lff;")
    Class162 field3151;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lic;")
    Class249 field3152;
    
    @ObfuscatedName("hj")
    @ObfuscatedSignature(signature = "(ZLgi;B)V", garbageValue = "30")
    static final void method4619(final boolean b, final Class189 class189) {
        Client.field701 = 0;
        Client.field624 = 0;
        final Class189 field1219 = Client.field626.field1219;
        field1219.method3823();
        final int method3817 = field1219.method3817(8);
        if (method3817 < Client.field622) {
            for (int i = method3817; i < Client.field622; ++i) {
                Client.field702[++Client.field701 - 1] = Client.field639[i];
            }
        }
        if (method3817 > Client.field622) {
            throw new RuntimeException("");
        }
        Client.field622 = 0;
        for (int j = 0; j < method3817; ++j) {
            final int n = Client.field639[j];
            final Class72 class190 = Client.field843[n];
            if (field1219.method3817(1) == 0) {
                Client.field639[++Client.field622 - 1] = n;
                class190.field914 = Client.field591;
            }
            else {
                final int method3818 = field1219.method3817(2);
                if (method3818 == 0) {
                    Client.field639[++Client.field622 - 1] = n;
                    class190.field914 = Client.field591;
                    Client.field666[++Client.field624 - 1] = n;
                }
                else if (method3818 == 1) {
                    Client.field639[++Client.field622 - 1] = n;
                    class190.field914 = Client.field591;
                    class190.method1794(field1219.method3817(3), (byte)1);
                    if (field1219.method3817(1) == 1) {
                        Client.field666[++Client.field624 - 1] = n;
                    }
                }
                else if (method3818 == 2) {
                    Client.field639[++Client.field622 - 1] = n;
                    class190.field914 = Client.field591;
                    class190.method1794(field1219.method3817(3), (byte)2);
                    class190.method1794(field1219.method3817(3), (byte)2);
                    if (field1219.method3817(1) == 1) {
                        Client.field666[++Client.field624 - 1] = n;
                    }
                }
                else if (method3818 == 3) {
                    Client.field702[++Client.field701 - 1] = n;
                }
            }
        }
        Class30.method500(b, class189);
        for (int k = 0; k < Client.field624; ++k) {
            final Class72 class191 = Client.field843[Client.field666[k]];
            final int method3819 = class189.method3544();
            if ((method3819 & 0x4) != 0x0) {
                class191.field891 = class189.method3646();
                final int method3820 = class189.method3770();
                class191.field871 = method3820 >> 16;
                class191.field911 = (method3820 & 0xFFFF) + Client.field591;
                class191.field876 = 0;
                class191.field910 = 0;
                if (class191.field911 > Client.field591) {
                    class191.field876 = -1;
                }
                if (class191.field891 == 65535) {
                    class191.field891 = -1;
                }
            }
            if ((method3819 & 0x1) != 0x0) {
                final int method3821 = class189.method3585();
                final int method3822 = class189.method3585();
                final int n2 = class191.field931 - (method3821 - Class62.field868 - Class62.field868) * 64;
                final int n3 = class191.field881 - (method3822 - Client.field754 - Client.field754) * 64;
                if (n2 != 0 || n3 != 0) {
                    class191.field920 = ((int)(Math.atan2(n2, n3) * 325.949) & 0x7FF);
                }
            }
            if ((method3819 & 0x40) != 0x0) {
                final int method3823 = class189.method3577();
                if (method3823 > 0) {
                    for (int l = 0; l < method3823; ++l) {
                        int method3824 = -1;
                        int n4 = -1;
                        int method3825 = -1;
                        int n5 = class189.method3562();
                        if (n5 == 32767) {
                            n5 = class189.method3562();
                            n4 = class189.method3562();
                            method3824 = class189.method3562();
                            method3825 = class189.method3562();
                        }
                        else if (n5 != 32766) {
                            n4 = class189.method3562();
                        }
                        else {
                            n5 = -1;
                        }
                        class191.method1542(n5, n4, method3824, method3825, Client.field591, class189.method3562());
                    }
                }
                final int method3826 = class189.method3577();
                if (method3826 > 0) {
                    for (int n6 = 0; n6 < method3826; ++n6) {
                        final int method3827 = class189.method3562();
                        final int method3828 = class189.method3562();
                        if (method3828 != 32767) {
                            final int method3829 = class189.method3562();
                            final int method3830 = class189.method3765();
                            class191.method1543(method3827, Client.field591, method3828, method3829, method3830, (method3828 > 0) ? class189.method3765() : method3830);
                        }
                        else {
                            class191.method1557(method3827);
                        }
                    }
                }
            }
            if ((method3819 & 0x8) != 0x0) {
                class191.field1037 = Class270.method5157(class189.method3613());
                class191.field874 = class191.field1037.field3497;
                class191.field924 = class191.field1037.field3500;
                class191.field899 = class191.field1037.field3498;
                class191.field880 = class191.field1037.field3495;
                class191.field870 = class191.field1037.field3502;
                class191.field882 = class191.field1037.field3501;
                class191.field893 = class191.field1037.field3519;
                class191.field877 = class191.field1037.field3496;
                class191.field878 = class191.field1037.field3486;
            }
            if ((method3819 & 0x10) != 0x0) {
                class191.field897 = class189.method3585();
                if (class191.field897 == 65535) {
                    class191.field897 = -1;
                }
            }
            if ((method3819 & 0x20) != 0x0) {
                int method3831 = class189.method3613();
                if (method3831 == 65535) {
                    method3831 = -1;
                }
                final int method3832 = class189.method3544();
                if (method3831 == class191.field903 && method3831 != -1) {
                    final int field1220 = Class3.method25(method3831).field3553;
                    if (field1220 == 1) {
                        class191.field904 = 0;
                        class191.field901 = 0;
                        class191.field906 = method3832;
                        class191.field907 = 0;
                    }
                    if (field1220 == 2) {
                        class191.field907 = 0;
                    }
                }
                else if (method3831 == -1 || class191.field903 == -1 || Class3.method25(method3831).field3547 >= Class3.method25(class191.field903).field3547) {
                    class191.field903 = method3831;
                    class191.field904 = 0;
                    class191.field901 = 0;
                    class191.field906 = method3832;
                    class191.field907 = 0;
                    class191.field930 = class191.field909;
                }
            }
            if ((method3819 & 0x2) != 0x0) {
                class191.field884 = class189.method3738();
                class191.field887 = 100;
            }
        }
        for (int n7 = 0; n7 < Client.field701; ++n7) {
            final int n8 = Client.field702[n7];
            if (Client.field843[n8].field914 != Client.field591) {
                Client.field843[n8].field1037 = null;
                Client.field843[n8] = null;
            }
        }
        if (class189.field2339 != Client.field626.field1225) {
            throw new RuntimeException(class189.field2339 + "," + Client.field626.field1225);
        }
        for (int n9 = 0; n9 < Client.field622; ++n9) {
            if (Client.field843[Client.field639[n9]] == null) {
                throw new RuntimeException(n9 + "," + Client.field622);
            }
        }
    }
    
    @ObfuscatedName("jp")
    @ObfuscatedSignature(signature = "([Lhi;II)V", garbageValue = "-2000374394")
    static final void method4620(final Class230[] array, final int n) {
        for (int i = 0; i < array.length; ++i) {
            final Class230 class230 = array[i];
            if (class230 != null) {
                if (class230.field2605 == n) {
                    if (!class230.field2604 || !Class81.method1885(class230)) {
                        if (class230.field2721 == 0) {
                            if (!class230.field2604 && Class81.method1885(class230) && class230 != Class143.field1897) {
                                continue;
                            }
                            method4620(array, class230.field2691);
                            if (class230.field2736 != null) {
                                method4620(class230.field2736, class230.field2691);
                            }
                            final Class55 class231 = (Class55)Client.field741.method4020(class230.field2691);
                            if (class231 != null) {
                                Class21.method270(class231.field501);
                            }
                        }
                        if (class230.field2721 == 6) {
                            if (class230.field2595 != -1 || class230.field2653 != -1) {
                                int n2;
                                if (Class132.method3097(class230)) {
                                    n2 = class230.field2653;
                                }
                                else {
                                    n2 = class230.field2595;
                                }
                                if (n2 != -1) {
                                    final Class273 method25 = Class3.method25(n2);
                                    final Class230 class232 = class230;
                                    class232.field2613 += Client.field700;
                                    while (class230.field2613 > method25.field3541[class230.field2728]) {
                                        final Class230 class233 = class230;
                                        class233.field2613 -= method25.field3541[class230.field2728];
                                        final Class230 class234 = class230;
                                        ++class234.field2728;
                                        if (class230.field2728 >= method25.field3540.length) {
                                            final Class230 class235 = class230;
                                            class235.field2728 -= method25.field3544;
                                            if (class230.field2728 < 0 || class230.field2728 >= method25.field3540.length) {
                                                class230.field2728 = 0;
                                            }
                                        }
                                        Class60.method1114(class230);
                                    }
                                }
                            }
                            if (class230.field2732 != 0 && !class230.field2604) {
                                final int n3 = class230.field2732 >> 16;
                                final int n4 = class230.field2732 << 16 >> 16;
                                final int n5 = n3 * Client.field700;
                                final int n6 = n4 * Client.field700;
                                class230.field2656 = (n5 + class230.field2656 & 0x7FF);
                                class230.field2657 = (n6 + class230.field2657 & 0x7FF);
                                Class60.method1114(class230);
                            }
                        }
                    }
                }
            }
        }
    }
}
