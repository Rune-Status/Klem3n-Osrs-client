import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bn")
public class Class64 extends Class204
{
    @ObfuscatedName("d")
    static int[] field936;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -854731803)
    int field934;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1588453017)
    int field935;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1549500065)
    int field938;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 2023364683)
    int field937;
    
    Class64(final int field934, final int field935, final int field936, final int field937) {
        this.field934 = field934;
        this.field935 = field935;
        this.field938 = field936;
        this.field937 = field937;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-2116871828")
    void method1559(final int field934, final int field935, final int field936, final int field937) {
        this.field934 = field934;
        this.field935 = field935;
        this.field938 = field936;
        this.field937 = field937;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "66")
    static void method1560() {
        Class224.field2554 = new int[2000];
        int i = 0;
        for (int n = 240, n2 = 12; i < 16; ++i, n -= n2) {
            Class224.field2554[i] = Class143.method3167(n / 360.0f, 0.9998999834060669, 0.075f + i * 0.425f / 16.0f);
        }
        int n3 = 48;
        final int n4 = n3 / 6;
        while (i < Class224.field2554.length) {
            final int n5 = i * 2;
            final int method3167 = Class143.method3167(n3 / 360.0f, 0.9998999834060669, 0.5);
            while (i < n5 && i < Class224.field2554.length) {
                Class224.field2554[i] = method3167;
                ++i;
            }
            n3 -= n4;
        }
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "-95")
    static int method1558(final int n, final Class84 class84, final boolean b) {
        if (n == 6600) {
            Class18.method196().method6011(Class13.field82, (Class138.field1876.field931 >> 7) + Class62.field868, (Class138.field1876.field881 >> 7) + Client.field754, true);
            return 1;
        }
        if (n == 6601) {
            final int n2 = Class69.field999[--Class69.field1003];
            String method210 = "";
            final Class20 method211 = Class18.method196().method6029(n2);
            if (method211 != null) {
                method210 = method211.method210();
            }
            Class69.field1001[++Class55.field497 - 1] = method210;
            return 1;
        }
        if (n == 6602) {
            Class18.method196().method6012(Class69.field999[--Class69.field1003]);
            return 1;
        }
        if (n == 6603) {
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6026();
            return 1;
        }
        if (n == 6604) {
            Class18.method196().method6023(Class69.field999[--Class69.field1003]);
            return 1;
        }
        if (n == 6605) {
            Class69.field999[++Class69.field1003 - 1] = (Class18.method196().method6096() ? 1 : 0);
            return 1;
        }
        if (n == 6606) {
            final Class226 class85 = new Class226(Class69.field999[--Class69.field1003]);
            Class18.method196().method6054(class85.field2564, class85.field2565);
            return 1;
        }
        if (n == 6607) {
            final Class226 class86 = new Class226(Class69.field999[--Class69.field1003]);
            Class18.method196().method6031(class86.field2564, class86.field2565);
            return 1;
        }
        if (n == 6608) {
            final Class226 class87 = new Class226(Class69.field999[--Class69.field1003]);
            Class18.method196().method6046(class87.field2567, class87.field2564, class87.field2565);
            return 1;
        }
        if (n == 6609) {
            final Class226 class88 = new Class226(Class69.field999[--Class69.field1003]);
            Class18.method196().method6033(class88.field2567, class88.field2564, class88.field2565);
            return 1;
        }
        if (n == 6610) {
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6002();
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6035();
            return 1;
        }
        if (n == 6611) {
            final Class20 method212 = Class18.method196().method6029(Class69.field999[--Class69.field1003]);
            if (method212 == null) {
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method212.method256().method4437();
            }
            return 1;
        }
        if (n == 6612) {
            final Class20 method213 = Class18.method196().method6029(Class69.field999[--Class69.field1003]);
            if (method213 == null) {
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = (method213.method214() - method213.method258() + 1) * 64;
                Class69.field999[++Class69.field1003 - 1] = (method213.method249() - method213.method247() + 1) * 64;
            }
            return 1;
        }
        if (n == 6613) {
            final Class20 method214 = Class18.method196().method6029(Class69.field999[--Class69.field1003]);
            if (method214 == null) {
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
                Class69.field999[++Class69.field1003 - 1] = 0;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method214.method258() * 64;
                Class69.field999[++Class69.field1003 - 1] = method214.method247() * 64;
                Class69.field999[++Class69.field1003 - 1] = method214.method214() * 64 + 64 - 1;
                Class69.field999[++Class69.field1003 - 1] = method214.method249() * 64 + 64 - 1;
            }
            return 1;
        }
        if (n == 6614) {
            final Class20 method215 = Class18.method196().method6029(Class69.field999[--Class69.field1003]);
            if (method215 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method215.method212();
            }
            return 1;
        }
        if (n == 6615) {
            final Class226 method216 = Class18.method196().method6001();
            if (method216 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method216.field2564;
                Class69.field999[++Class69.field1003 - 1] = method216.field2565;
            }
            return 1;
        }
        if (n == 6616) {
            Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6153();
            return 1;
        }
        if (n == 6617) {
            final Class226 class89 = new Class226(Class69.field999[--Class69.field1003]);
            final Class20 method217 = Class18.method196().method6014();
            if (method217 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = -1;
                return 1;
            }
            final int[] method218 = method217.method213(class89.field2567, class89.field2564, class89.field2565);
            if (method218 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method218[0];
                Class69.field999[++Class69.field1003 - 1] = method218[1];
            }
            return 1;
        }
        else if (n == 6618) {
            final Class226 class90 = new Class226(Class69.field999[--Class69.field1003]);
            final Class20 method219 = Class18.method196().method6014();
            if (method219 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
                Class69.field999[++Class69.field1003 - 1] = -1;
                return 1;
            }
            final Class226 method220 = method219.method205(class90.field2564, class90.field2565);
            if (method220 == null) {
                Class69.field999[++Class69.field1003 - 1] = -1;
            }
            else {
                Class69.field999[++Class69.field1003 - 1] = method220.method4437();
            }
            return 1;
        }
        else {
            if (n == 6619) {
                Class69.field1003 -= 2;
                Class18.method196().method6073(Class18.method196().method6029(Class69.field999[Class69.field1003]), new Class226(Class138.field1876.field567, (Class138.field1876.field931 >> 7) + Class62.field868, (Class138.field1876.field881 >> 7) + Client.field754), new Class226(Class69.field999[Class69.field1003 + 1]), false);
                return 1;
            }
            if (n == 6620) {
                Class69.field1003 -= 2;
                Class18.method196().method6073(Class18.method196().method6029(Class69.field999[Class69.field1003]), new Class226(Class138.field1876.field567, (Class138.field1876.field931 >> 7) + Class62.field868, (Class138.field1876.field881 >> 7) + Client.field754), new Class226(Class69.field999[Class69.field1003 + 1]), true);
                return 1;
            }
            if (n == 6621) {
                Class69.field1003 -= 2;
                final int n3 = Class69.field999[Class69.field1003];
                final Class226 class91 = new Class226(Class69.field999[Class69.field1003 + 1]);
                final Class20 method221 = Class18.method196().method6029(n3);
                if (method221 == null) {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                    return 1;
                }
                Class69.field999[++Class69.field1003 - 1] = (method221.method202(class91.field2567, class91.field2564, class91.field2565) ? 1 : 0);
                return 1;
            }
            else {
                if (n == 6622) {
                    Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6142();
                    Class69.field999[++Class69.field1003 - 1] = Class18.method196().method6038();
                    return 1;
                }
                if (n == 6623) {
                    final Class226 class92 = new Class226(Class69.field999[--Class69.field1003]);
                    final Class20 method222 = Class18.method196().method6116(class92.field2567, class92.field2564, class92.field2565);
                    if (method222 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = method222.method207();
                    }
                    return 1;
                }
                if (n == 6624) {
                    Class18.method196().method6089(Class69.field999[--Class69.field1003]);
                    return 1;
                }
                if (n == 6625) {
                    Class18.method196().method6040();
                    return 1;
                }
                if (n == 6626) {
                    Class18.method196().method6041(Class69.field999[--Class69.field1003]);
                    return 1;
                }
                if (n == 6627) {
                    Class18.method196().method6042();
                    return 1;
                }
                if (n == 6628) {
                    Class18.method196().method6034(Class69.field999[--Class69.field1003] == 1);
                    return 1;
                }
                if (n == 6629) {
                    Class18.method196().method6106(Class69.field999[--Class69.field1003]);
                    return 1;
                }
                if (n == 6630) {
                    Class18.method196().method6152(Class69.field999[--Class69.field1003]);
                    return 1;
                }
                if (n == 6631) {
                    Class18.method196().method6114();
                    return 1;
                }
                if (n == 6632) {
                    Class18.method196().method6047(Class69.field999[--Class69.field1003] == 1);
                    return 1;
                }
                if (n == 6633) {
                    Class69.field1003 -= 2;
                    Class18.method196().method6048(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1] == 1);
                    return 1;
                }
                if (n == 6634) {
                    Class69.field1003 -= 2;
                    Class18.method196().method6049(Class69.field999[Class69.field1003], Class69.field999[Class69.field1003 + 1] == 1);
                    return 1;
                }
                if (n == 6635) {
                    Class69.field999[++Class69.field1003 - 1] = (Class18.method196().method6050() ? 1 : 0);
                    return 1;
                }
                if (n == 6636) {
                    Class69.field999[++Class69.field1003 - 1] = (Class18.method196().method6051(Class69.field999[--Class69.field1003]) ? 1 : 0);
                    return 1;
                }
                if (n == 6637) {
                    Class69.field999[++Class69.field1003 - 1] = (Class18.method196().method6052(Class69.field999[--Class69.field1003]) ? 1 : 0);
                    return 1;
                }
                if (n == 6638) {
                    Class69.field1003 -= 2;
                    final Class226 method223 = Class18.method196().method6100(Class69.field999[Class69.field1003], new Class226(Class69.field999[Class69.field1003 + 1]));
                    if (method223 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = method223.method4437();
                    }
                    return 1;
                }
                if (n == 6639) {
                    final Class28 method224 = Class18.method196().method6146();
                    if (method224 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = method224.field240;
                        Class69.field999[++Class69.field1003 - 1] = method224.field236.method4437();
                    }
                    return 1;
                }
                if (n == 6640) {
                    final Class28 method225 = Class18.method196().method6186();
                    if (method225 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = method225.field240;
                        Class69.field999[++Class69.field1003 - 1] = method225.field236.method4437();
                    }
                    return 1;
                }
                if (n == 6693) {
                    final Class255 class93 = Class255.field3246[Class69.field999[--Class69.field1003]];
                    if (class93.field3241 == null) {
                        Class69.field1001[++Class55.field497 - 1] = "";
                    }
                    else {
                        Class69.field1001[++Class55.field497 - 1] = class93.field3241;
                    }
                    return 1;
                }
                if (n == 6694) {
                    Class69.field999[++Class69.field1003 - 1] = Class255.field3246[Class69.field999[--Class69.field1003]].field3243;
                    return 1;
                }
                if (n == 6695) {
                    final Class255 class94 = Class255.field3246[Class69.field999[--Class69.field1003]];
                    if (class94 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = class94.field3240;
                    }
                    return 1;
                }
                if (n == 6696) {
                    final Class255 class95 = Class255.field3246[Class69.field999[--Class69.field1003]];
                    if (class95 == null) {
                        Class69.field999[++Class69.field1003 - 1] = -1;
                    }
                    else {
                        Class69.field999[++Class69.field1003 - 1] = class95.field3239;
                    }
                    return 1;
                }
                if (n == 6697) {
                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field307;
                    return 1;
                }
                if (n == 6698) {
                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field311.method4437();
                    return 1;
                }
                if (n == 6699) {
                    Class69.field999[++Class69.field1003 - 1] = Class312.field3750.field308.method4437();
                    return 1;
                }
                return 2;
            }
        }
    }
    
    @ObfuscatedName("is")
    @ObfuscatedSignature(signature = "(Lhi;IIZI)V", garbageValue = "-1969536993")
    static void method1563(final Class230 class230, final int n, final int n2, final boolean b) {
        final int field2675 = class230.field2675;
        final int field2676 = class230.field2621;
        if (class230.field2612 == 0) {
            class230.field2675 = class230.field2616;
        }
        else if (class230.field2612 == 1) {
            class230.field2675 = n - class230.field2616;
        }
        else if (class230.field2612 == 2) {
            class230.field2675 = class230.field2616 * n >> 14;
        }
        if (class230.field2624 == 0) {
            class230.field2621 = class230.field2617;
        }
        else if (class230.field2624 == 1) {
            class230.field2621 = n2 - class230.field2617;
        }
        else if (class230.field2624 == 2) {
            class230.field2621 = n2 * class230.field2617 >> 14;
        }
        if (class230.field2612 == 4) {
            class230.field2675 = class230.field2621 * class230.field2622 / class230.field2623;
        }
        if (class230.field2624 == 4) {
            class230.field2621 = class230.field2623 * class230.field2675 / class230.field2622;
        }
        if (class230.field2609 == 1337) {
            Client.field784 = class230;
        }
        if (b && class230.field2715 != null && (field2675 != class230.field2675 || field2676 != class230.field2621)) {
            final Class56 class231 = new Class56();
            class231.field506 = class230;
            class231.field512 = class230.field2715;
            Client.field638.method4073(class231);
        }
    }
}
