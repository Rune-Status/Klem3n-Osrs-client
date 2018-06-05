import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bu")
public final class Class60 extends Class63
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lkm;")
    Class291 field552;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lhd;")
    Class227 field546;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1998294681)
    int field570;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1980153081)
    int field548;
    @ObfuscatedName("q")
    String[] field550;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -2003980775)
    int field551;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1248875317)
    int field564;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 2078576503)
    int field562;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1490301437)
    int field545;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1922127141)
    int field555;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -479135119)
    int field556;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -316850739)
    int field557;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 265765217)
    int field558;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "Ldc;")
    Class119 field563;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 668730737)
    int field559;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 293985015)
    int field547;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -1873032529)
    int field565;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -1295532419)
    int field553;
    @ObfuscatedName("y")
    boolean field560;
    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -1403765271)
    int field568;
    @ObfuscatedName("j")
    boolean field566;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 723692473)
    int field567;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -2042887495)
    int field574;
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field569;
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field554;
    @ObfuscatedName("af")
    boolean field571;
    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = -672131463)
    int field572;
    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = 329940333)
    int field573;
    
    Class60() {
        this.field570 = -1;
        this.field548 = -1;
        this.field550 = new String[3];
        for (int i = 0; i < 3; ++i) {
            this.field550[i] = "";
        }
        this.field551 = 0;
        this.field564 = 0;
        this.field545 = 0;
        this.field555 = 0;
        this.field560 = false;
        this.field568 = 0;
        this.field566 = false;
        this.field569 = Class289.field3633;
        this.field554 = Class289.field3633;
        this.field571 = false;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "833204307")
    final void method1082(final Class182 class182) {
        class182.field2339 = 0;
        final int method3544 = class182.method3544();
        this.field570 = class182.method3681();
        this.field548 = class182.method3681();
        int method3545 = -1;
        this.field568 = 0;
        final int[] array = new int[12];
        for (int i = 0; i < 12; ++i) {
            final int method3546 = class182.method3544();
            if (method3546 == 0) {
                array[i] = 0;
            }
            else {
                array[i] = class182.method3544() + (method3546 << 8);
                if (i == 0 && array[0] == 65535) {
                    method3545 = class182.method3550();
                    break;
                }
                if (array[i] >= 512) {
                    final int field3462 = Class111.method2563(array[i] - 512).field3462;
                    if (field3462 != 0) {
                        this.field568 = field3462;
                    }
                }
            }
        }
        final int[] array2 = new int[5];
        for (int j = 0; j < 5; ++j) {
            int method3547 = class182.method3544();
            if (method3547 < 0 || method3547 >= Class227.field2572[j].length) {
                method3547 = 0;
            }
            array2[j] = method3547;
        }
        super.field893 = class182.method3550();
        if (super.field893 == 65535) {
            super.field893 = -1;
        }
        super.field877 = class182.method3550();
        if (super.field877 == 65535) {
            super.field877 = -1;
        }
        super.field878 = super.field877;
        super.field899 = class182.method3550();
        if (super.field899 == 65535) {
            super.field899 = -1;
        }
        super.field880 = class182.method3550();
        if (super.field880 == 65535) {
            super.field880 = -1;
        }
        super.field870 = class182.method3550();
        if (super.field870 == 65535) {
            super.field870 = -1;
        }
        super.field882 = class182.method3550();
        if (super.field882 == 65535) {
            super.field882 = -1;
        }
        super.field883 = class182.method3550();
        if (super.field883 == 65535) {
            super.field883 = -1;
        }
        this.field552 = new Class291(class182.method3738(), Class36.field306);
        this.method1084();
        this.method1086();
        if (this == Class138.field1876) {
            Class152.field1939 = this.field552.method5447();
        }
        this.field551 = class182.method3544();
        this.field564 = class182.method3550();
        this.field566 = (class182.method3544() == 1);
        if (Client.field777 == 0 && Client.field747 >= 2) {
            this.field566 = false;
        }
        if (this.field546 == null) {
            this.field546 = new Class227();
        }
        this.field546.method4462(array, array2, method3544 == 1, method3545);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-514053088")
    boolean method1083() {
        if (this.field569 == Class289.field3633) {
            this.method1085();
        }
        return this.field569 == Class289.field3631;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-540228134")
    void method1084() {
        this.field569 = Class289.field3633;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-35")
    void method1085() {
        this.field569 = (Class181.field2332.method1637(this.field552) ? Class289.field3631 : Class289.field3634);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-1597718431")
    boolean method1104() {
        if (this.field554 == Class289.field3633) {
            this.method1087();
        }
        return this.field554 == Class289.field3631;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "480560408")
    void method1086() {
        this.field554 = Class289.field3633;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1372893329")
    void method1087() {
        this.field554 = ((Class14.field94 != null && Class14.field94.method5329(this.field552)) ? Class289.field3631 : Class289.field3634);
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-77")
    int method1088() {
        if (this.field546 != null && this.field546.field2569 != -1) {
            return Class270.method5157(this.field546.field2569).field3497;
        }
        return 1;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        if (this.field546 == null) {
            return null;
        }
        final Class273 class273 = (super.field903 != -1 && super.field906 == 0) ? Class3.method25(super.field903) : null;
        Class119 method4468 = this.field546.method4468(class273, super.field904, (super.field900 != -1 && !this.field560 && (super.field900 != super.field893 || class273 == null)) ? Class3.method25(super.field900) : null, super.field908);
        if (method4468 == null) {
            return null;
        }
        method4468.method2670();
        super.field925 = method4468.field1781;
        if (!this.field560 && super.field891 != -1 && super.field876 != -1) {
            final Class119 method4469 = Class57.method1035(super.field891).method4866(super.field876);
            if (method4469 != null) {
                method4469.method2718(0, -super.field871, 0);
                method4468 = new Class119(new Class119[] { method4468, method4469 }, 2);
            }
        }
        if (!this.field560 && this.field563 != null) {
            if (Client.field591 >= this.field555) {
                this.field563 = null;
            }
            if (Client.field591 >= this.field545 && Client.field591 < this.field555) {
                final Class119 field563 = this.field563;
                field563.method2718(this.field556 - super.field931, this.field557 - this.field562, this.field558 - super.field881);
                if (super.field926 == 512) {
                    field563.method2677();
                    field563.method2677();
                    field563.method2677();
                }
                else if (super.field926 == 1024) {
                    field563.method2677();
                    field563.method2677();
                }
                else if (super.field926 == 1536) {
                    field563.method2677();
                }
                method4468 = new Class119(new Class119[] { method4468, field563 }, 2);
                if (super.field926 == 512) {
                    field563.method2677();
                }
                else if (super.field926 == 1024) {
                    field563.method2677();
                    field563.method2677();
                }
                else if (super.field926 == 1536) {
                    field563.method2677();
                    field563.method2677();
                    field563.method2677();
                }
                field563.method2718(super.field931 - this.field556, this.field562 - this.field557, super.field881 - this.field558);
            }
        }
        method4468.field1603 = true;
        return method4468;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(IIBI)V", garbageValue = "-1440413395")
    final void method1106(final int n, final int n2, final byte b) {
        if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
            super.field903 = -1;
        }
        super.field920 = -1;
        if (n < 0 || n >= 104 || n2 < 0 || n2 >= 104) {
            this.method1103(n, n2);
        }
        else if (super.field922[0] < 0 || super.field922[0] >= 104 || super.field872[0] < 0 || super.field872[0] >= 104) {
            this.method1103(n, n2);
        }
        else {
            if (b == 2) {
                Class62.method1538(this, n, n2, (byte)2);
            }
            this.method1105(n, n2, b);
        }
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-2124327900")
    void method1103(final int n, final int n2) {
        super.field909 = 0;
        super.field930 = 0;
        super.field923 = 0;
        super.field922[0] = n;
        super.field872[0] = n2;
        final int method1088 = this.method1088();
        super.field931 = method1088 * 64 + super.field922[0] * 128;
        super.field881 = method1088 * 64 + super.field872[0] * 128;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(IIBB)V", garbageValue = "12")
    final void method1105(final int n, final int n2, final byte b) {
        if (super.field909 < 9) {
            ++super.field909;
        }
        for (int i = super.field909; i > 0; --i) {
            super.field922[i] = super.field922[i - 1];
            super.field872[i] = super.field872[i - 1];
            super.field928[i] = super.field928[i - 1];
        }
        super.field922[0] = n;
        super.field872[0] = n2;
        super.field928[0] = b;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "5")
    @Override
    final boolean vmethod1786() {
        return this.field546 != null;
    }
    
    @ObfuscatedName("ja")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1852538691")
    static void method1120(final int n, final int n2) {
        Class171.method3451(Class229.field2588, n, n2);
        Class229.field2588 = null;
    }
    
    @ObfuscatedName("ju")
    @ObfuscatedSignature(signature = "(Lhi;I)V", garbageValue = "941710605")
    static void method1114(final Class230 class230) {
        if (class230.field2627 == Client.field830) {
            Client.field697[class230.field2737] = true;
        }
    }
}
