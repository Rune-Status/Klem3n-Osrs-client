import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ho")
public class Class216
{
    @ObfuscatedName("z")
    byte[] field2447;
    @ObfuscatedName("w")
    byte[] field2449;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 2049158647)
    int field2448;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1438007951)
    int field2450;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2031677397)
    int field2446;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1415705735)
    int field2451;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1604102077)
    int field2453;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -560836309)
    int field2452;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 341977341)
    int field2454;
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgi;IB)V", garbageValue = "1")
    static final void method4179(final Class189 class189, final int n) {
        final int field2339 = class189.field2339;
        Class81.field1165 = 0;
        Class177.method3512(class189);
        for (int i = 0; i < Class81.field1165; ++i) {
            final int n2 = Class81.field1166[i];
            final Class60 class190 = Client.field610[n2];
            int method3544 = class189.method3544();
            if ((method3544 & 0x80) != 0x0) {
                method3544 += class189.method3544() << 8;
            }
            byte method3545 = -1;
            if ((method3544 & 0x200) != 0x0) {
                method3545 = class189.method3610();
            }
            if ((method3544 & 0x8) != 0x0) {
                class190.field884 = class189.method3738();
                if (class190.field884.charAt(0) == '~') {
                    class190.field884 = class190.field884.substring(1);
                    Class143.method3172(2, class190.field552.method5447(), class190.field884);
                }
                else if (class190 == Class138.field1876) {
                    Class143.method3172(2, class190.field552.method5447(), class190.field884);
                }
                class190.field885 = false;
                class190.field888 = 0;
                class190.field927 = 0;
                class190.field887 = 150;
            }
            if ((method3544 & 0x800) != 0x0) {
                class190.field891 = class189.method3646();
                final int method3546 = class189.method3595();
                class190.field871 = method3546 >> 16;
                class190.field911 = (method3546 & 0xFFFF) + Client.field591;
                class190.field876 = 0;
                class190.field910 = 0;
                if (class190.field911 > Client.field591) {
                    class190.field876 = -1;
                }
                if (class190.field891 == 65535) {
                    class190.field891 = -1;
                }
            }
            if ((method3544 & 0x400) != 0x0) {
                for (int j = 0; j < 3; ++j) {
                    class190.field550[j] = class189.method3738();
                }
            }
            if ((method3544 & 0x20) != 0x0) {
                int method3547 = class189.method3646();
                if (method3547 == 65535) {
                    method3547 = -1;
                }
                Class134.method3102(class190, method3547, class189.method3577());
            }
            if ((method3544 & 0x40) != 0x0) {
                final int method3548 = class189.method3585();
                final Class242 class191 = (Class242)Class76.method1803(Class20.method216(), class189.method3577());
                final boolean field2340 = class189.method3607() == 1;
                final int method3549 = class189.method3544();
                final int field2341 = class189.field2339;
                if (class190.field552 != null && class190.field546 != null) {
                    boolean b = false;
                    if (class191.field3127 && Class181.field2332.method1630(class190.field552)) {
                        b = true;
                    }
                    if (!b && Client.field694 == 0 && !class190.field566) {
                        Class81.field1154.field2339 = 0;
                        class189.method3539(Class81.field1154.payload, 0, method3549);
                        Class81.field1154.field2339 = 0;
                        final Class182 field2342 = Class81.field1154;
                        String method3551;
                        try {
                            int method3550 = field2342.method3562();
                            if (method3550 > 32767) {
                                method3550 = 32767;
                            }
                            final byte[] array = new byte[method3550];
                            final Class182 class192 = field2342;
                            class192.field2339 += Class300.field3712.method3480(field2342.payload, field2342.field2339, array, 0, method3550);
                            method3551 = Class78.method1831(array, 0, method3550);
                        }
                        catch (Exception ex) {
                            method3551 = "Cabbage";
                        }
                        final String method3552 = Class299.method5521(Class51.method998(method3551));
                        class190.field884 = method3552.trim();
                        class190.field888 = method3548 >> 8;
                        class190.field927 = (method3548 & 0xFF);
                        class190.field887 = 150;
                        class190.field885 = field2340;
                        class190.field886 = (class190 != Class138.field1876 && class191.field3127 && "" != Client.field796 && method3552.toLowerCase().indexOf(Client.field796) == -1);
                        int n3;
                        if (class191.field3126) {
                            n3 = (field2340 ? 91 : 1);
                        }
                        else {
                            n3 = (field2340 ? 90 : 2);
                        }
                        if (class191.field3128 != -1) {
                            Class143.method3172(n3, "<img=" + class191.field3128 + ">" + class190.field552.method5447(), method3552);
                        }
                        else {
                            Class143.method3172(n3, class190.field552.method5447(), method3552);
                        }
                    }
                }
                class189.field2339 = method3549 + field2341;
            }
            if ((method3544 & 0x1000) != 0x0) {
                Class81.field1153[n2] = class189.method3610();
            }
            if ((method3544 & 0x1) != 0x0) {
                final int method3553 = class189.method3577();
                if (method3553 > 0) {
                    for (int k = 0; k < method3553; ++k) {
                        int method3554 = -1;
                        int n4 = -1;
                        int method3555 = -1;
                        int n5 = class189.method3562();
                        if (n5 == 32767) {
                            n5 = class189.method3562();
                            n4 = class189.method3562();
                            method3554 = class189.method3562();
                            method3555 = class189.method3562();
                        }
                        else if (n5 != 32766) {
                            n4 = class189.method3562();
                        }
                        else {
                            n5 = -1;
                        }
                        class190.method1542(n5, n4, method3554, method3555, Client.field591, class189.method3562());
                    }
                }
                final int method3556 = class189.method3544();
                if (method3556 > 0) {
                    for (int l = 0; l < method3556; ++l) {
                        final int method3557 = class189.method3562();
                        final int method3558 = class189.method3562();
                        if (method3558 != 32767) {
                            final int method3559 = class189.method3562();
                            final int method3560 = class189.method3577();
                            class190.method1543(method3557, Client.field591, method3558, method3559, method3560, (method3558 > 0) ? class189.method3607() : method3560);
                        }
                        else {
                            class190.method1557(method3557);
                        }
                    }
                }
            }
            if ((method3544 & 0x100) != 0x0) {
                class190.field913 = class189.method3660();
                class190.field915 = class189.method3610();
                class190.field916 = class189.method3660();
                class190.field929 = class189.method3610();
                class190.field917 = class189.method3550() + Client.field591;
                class190.field918 = class189.method3646() + Client.field591;
                class190.field919 = class189.method3646();
                if (class190.field571) {
                    final Class60 class193 = class190;
                    class193.field913 += class190.field572;
                    final Class60 class194 = class190;
                    class194.field915 += class190.field573;
                    final Class60 class195 = class190;
                    class195.field916 += class190.field572;
                    final Class60 class196 = class190;
                    class196.field929 += class190.field573;
                    class190.field909 = 0;
                }
                else {
                    final Class60 class197 = class190;
                    class197.field913 += class190.field922[0];
                    final Class60 class198 = class190;
                    class198.field915 += class190.field872[0];
                    final Class60 class199 = class190;
                    class199.field916 += class190.field922[0];
                    final Class60 class200 = class190;
                    class200.field929 += class190.field872[0];
                    class190.field909 = 1;
                }
                class190.field930 = 0;
            }
            if ((method3544 & 0x10) != 0x0) {
                class190.field897 = class189.method3585();
                if (class190.field897 == 65535) {
                    class190.field897 = -1;
                }
            }
            if ((method3544 & 0x4) != 0x0) {
                final int method3561 = class189.method3577();
                final byte[] array2 = new byte[method3561];
                final Class182 class201 = new Class182(array2);
                class189.method3539(array2, 0, method3561);
                class190.method1082(Class81.field1157[n2] = class201);
            }
            if ((method3544 & 0x2) != 0x0) {
                class190.field920 = class189.method3550();
                if (class190.field909 == 0) {
                    class190.field926 = class190.field920;
                    class190.field920 = -1;
                }
            }
            if (class190.field571) {
                if (method3545 == 127) {
                    class190.method1103(class190.field572, class190.field573);
                }
                else {
                    byte b2;
                    if (method3545 != -1) {
                        b2 = method3545;
                    }
                    else {
                        b2 = Class81.field1153[n2];
                    }
                    class190.method1106(class190.field572, class190.field573, b2);
                }
            }
        }
        if (class189.field2339 - field2339 != n) {
            throw new RuntimeException(class189.field2339 - field2339 + " " + n);
        }
    }
    
    @ObfuscatedName("ji")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1403972661")
    static final void method4178(final int n) {
        if (!Class261.method4931(n)) {
            return;
        }
        final Class230[] array = Class42.field366[n];
        for (int i = 0; i < array.length; ++i) {
            final Class230 class230 = array[i];
            if (class230 != null) {
                class230.field2728 = 0;
                class230.field2613 = 0;
            }
        }
    }
}
