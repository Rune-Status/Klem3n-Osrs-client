import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jq")
public class Class271 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3490;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3487;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3488;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3489;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 791272887)
    public int field3510;
    @ObfuscatedName("q")
    public String field3491;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -254804359)
    public int field3497;
    @ObfuscatedName("i")
    int[] field3493;
    @ObfuscatedName("x")
    int[] field3515;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1114292373)
    public int field3519;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1340441257)
    public int field3496;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1278546655)
    public int field3486;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -549599927)
    public int field3498;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1839913521)
    public int field3495;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -420302217)
    public int field3502;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 116081011)
    public int field3501;
    @ObfuscatedName("r")
    short[] field3492;
    @ObfuscatedName("t")
    short[] field3503;
    @ObfuscatedName("o")
    short[] field3514;
    @ObfuscatedName("y")
    short[] field3505;
    @ObfuscatedName("a")
    public String[] field3506;
    @ObfuscatedName("j")
    public boolean field3507;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = -152867383)
    public int field3508;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = 1933108527)
    int field3509;
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = 680879601)
    int field3521;
    @ObfuscatedName("v")
    public boolean field3511;
    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -1940547865)
    int field3512;
    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = 1896315157)
    int field3513;
    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = -543090749)
    public int field3494;
    @ObfuscatedName("aw")
    @ObfuscatedGetter(intValue = -1117793583)
    public int field3500;
    @ObfuscatedName("ak")
    public int[] field3516;
    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 1305673173)
    int field3499;
    @ObfuscatedName("an")
    @ObfuscatedGetter(intValue = -332297953)
    int field3518;
    @ObfuscatedName("ao")
    public boolean field3504;
    @ObfuscatedName("at")
    public boolean field3520;
    @ObfuscatedName("ai")
    public boolean field3517;
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "Lgu;")
    Class197 field3522;
    
    static {
        Class271.field3488 = new Class200(64);
        Class271.field3489 = new Class200(50);
    }
    
    Class271() {
        this.field3491 = "null";
        this.field3497 = 1;
        this.field3519 = -1;
        this.field3496 = -1;
        this.field3486 = -1;
        this.field3498 = -1;
        this.field3495 = -1;
        this.field3502 = -1;
        this.field3501 = -1;
        this.field3506 = new String[5];
        this.field3507 = true;
        this.field3508 = -1;
        this.field3509 = 128;
        this.field3521 = 128;
        this.field3511 = false;
        this.field3512 = 0;
        this.field3513 = 0;
        this.field3494 = -1;
        this.field3500 = 32;
        this.field3499 = -1;
        this.field3518 = -1;
        this.field3504 = true;
        this.field3520 = true;
        this.field3517 = false;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "392")
    void method5159() {
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "-1539738926")
    void method5186(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method5160(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-1656965495")
    void method5160(final Class182 class182, final int n) {
        if (n == 1) {
            final int method3544 = class182.method3544();
            this.field3493 = new int[method3544];
            for (int i = 0; i < method3544; ++i) {
                this.field3493[i] = class182.method3550();
            }
        }
        else if (n == 2) {
            this.field3491 = class182.method3738();
        }
        else if (n == 12) {
            this.field3497 = class182.method3544();
        }
        else if (n == 13) {
            this.field3519 = class182.method3550();
        }
        else if (n == 14) {
            this.field3498 = class182.method3550();
        }
        else if (n == 15) {
            this.field3496 = class182.method3550();
        }
        else if (n == 16) {
            this.field3486 = class182.method3550();
        }
        else if (n == 17) {
            this.field3498 = class182.method3550();
            this.field3495 = class182.method3550();
            this.field3502 = class182.method3550();
            this.field3501 = class182.method3550();
        }
        else if (n >= 30 && n < 35) {
            this.field3506[n - 30] = class182.method3738();
            if (this.field3506[n - 30].equalsIgnoreCase("Hidden")) {
                this.field3506[n - 30] = null;
            }
        }
        else if (n == 40) {
            final int method3545 = class182.method3544();
            this.field3492 = new short[method3545];
            this.field3503 = new short[method3545];
            for (int j = 0; j < method3545; ++j) {
                this.field3492[j] = (short)class182.method3550();
                this.field3503[j] = (short)class182.method3550();
            }
        }
        else if (n == 41) {
            final int method3546 = class182.method3544();
            this.field3514 = new short[method3546];
            this.field3505 = new short[method3546];
            for (int k = 0; k < method3546; ++k) {
                this.field3514[k] = (short)class182.method3550();
                this.field3505[k] = (short)class182.method3550();
            }
        }
        else if (n == 60) {
            final int method3547 = class182.method3544();
            this.field3515 = new int[method3547];
            for (int l = 0; l < method3547; ++l) {
                this.field3515[l] = class182.method3550();
            }
        }
        else if (n == 93) {
            this.field3507 = false;
        }
        else if (n == 95) {
            this.field3508 = class182.method3550();
        }
        else if (n == 97) {
            this.field3509 = class182.method3550();
        }
        else if (n == 98) {
            this.field3521 = class182.method3550();
        }
        else if (n == 99) {
            this.field3511 = true;
        }
        else if (n == 100) {
            this.field3512 = class182.method3681();
        }
        else if (n == 101) {
            this.field3513 = class182.method3681() * 5;
        }
        else if (n == 102) {
            this.field3494 = class182.method3550();
        }
        else if (n == 103) {
            this.field3500 = class182.method3550();
        }
        else if (n == 106 || n == 118) {
            this.field3499 = class182.method3550();
            if (this.field3499 == 65535) {
                this.field3499 = -1;
            }
            this.field3518 = class182.method3550();
            if (this.field3518 == 65535) {
                this.field3518 = -1;
            }
            int method3548 = -1;
            if (n == 118) {
                method3548 = class182.method3550();
                if (method3548 == 65535) {
                    method3548 = -1;
                }
            }
            final int method3549 = class182.method3544();
            this.field3516 = new int[method3549 + 2];
            for (int n2 = 0; n2 <= method3549; ++n2) {
                this.field3516[n2] = class182.method3550();
                if (this.field3516[n2] == 65535) {
                    this.field3516[n2] = -1;
                }
            }
            this.field3516[method3549 + 1] = method3548;
        }
        else if (n == 107) {
            this.field3504 = false;
        }
        else if (n == 109) {
            this.field3520 = false;
        }
        else if (n == 111) {
            this.field3517 = true;
        }
        else if (n == 249) {
            this.field3522 = Class39.method691(class182, this.field3522);
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ljn;ILjn;II)Ldc;", garbageValue = "-639258306")
    public final Class119 method5162(final Class273 class273, final int n, final Class273 class274, final int n2) {
        if (this.field3516 == null) {
            Class119 method2589 = (Class119)Class271.field3489.method3989(this.field3510);
            if (method2589 == null) {
                boolean b = false;
                for (int i = 0; i < this.field3493.length; ++i) {
                    if (!Class271.field3487.method4696(this.field3493[i], 0)) {
                        b = true;
                    }
                }
                if (b) {
                    return null;
                }
                final Class113[] array = new Class113[this.field3493.length];
                for (int j = 0; j < this.field3493.length; ++j) {
                    array[j] = Class113.method2568(Class271.field3487, this.field3493[j], 0);
                }
                Class113 class275;
                if (array.length == 1) {
                    class275 = array[0];
                }
                else {
                    class275 = new Class113(array, array.length);
                }
                if (this.field3492 != null) {
                    for (int k = 0; k < this.field3492.length; ++k) {
                        class275.method2581(this.field3492[k], this.field3503[k]);
                    }
                }
                if (this.field3514 != null) {
                    for (int l = 0; l < this.field3514.length; ++l) {
                        class275.method2582(this.field3514[l], this.field3505[l]);
                    }
                }
                method2589 = class275.method2589(this.field3512 + 64, this.field3513 + 850, -30, -50, -30);
                Class271.field3489.method3983(method2589, this.field3510);
            }
            Class119 class276;
            if (class273 != null && class274 != null) {
                class276 = class273.method5221(method2589, n, class274, n2);
            }
            else if (class273 != null) {
                class276 = class273.method5215(method2589, n);
            }
            else if (class274 != null) {
                class276 = class274.method5215(method2589, n2);
            }
            else {
                class276 = method2589.method2666(true);
            }
            if (this.field3509 != 128 || this.field3521 != 128) {
                class276.method2681(this.field3509, this.field3521, this.field3509);
            }
            return class276;
        }
        final Class271 method2590 = this.method5189();
        if (method2590 == null) {
            return null;
        }
        return method2590.method5162(class273, n, class274, n2);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(B)Ldb;", garbageValue = "-30")
    public final Class113 method5158() {
        if (this.field3516 != null) {
            final Class271 method5189 = this.method5189();
            if (method5189 == null) {
                return null;
            }
            return method5189.method5158();
        }
        else {
            if (this.field3515 == null) {
                return null;
            }
            boolean b = false;
            for (int i = 0; i < this.field3515.length; ++i) {
                if (!Class271.field3487.method4696(this.field3515[i], 0)) {
                    b = true;
                }
            }
            if (b) {
                return null;
            }
            final Class113[] array = new Class113[this.field3515.length];
            for (int j = 0; j < this.field3515.length; ++j) {
                array[j] = Class113.method2568(Class271.field3487, this.field3515[j], 0);
            }
            Class113 class113;
            if (array.length == 1) {
                class113 = array[0];
            }
            else {
                class113 = new Class113(array, array.length);
            }
            if (this.field3492 != null) {
                for (int k = 0; k < this.field3492.length; ++k) {
                    class113.method2581(this.field3492[k], this.field3503[k]);
                }
            }
            if (this.field3514 != null) {
                for (int l = 0; l < this.field3514.length; ++l) {
                    class113.method2582(this.field3514[l], this.field3505[l]);
                }
            }
            return class113;
        }
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)Ljq;", garbageValue = "-1834963481")
    public final Class271 method5189() {
        int method3389 = -1;
        if (this.field3499 != -1) {
            method3389 = Class163.method3389(this.field3499);
        }
        else if (this.field3518 != -1) {
            method3389 = Class225.field2558[this.field3518];
        }
        int n;
        if (method3389 >= 0 && method3389 < this.field3516.length - 1) {
            n = this.field3516[method3389];
        }
        else {
            n = this.field3516[this.field3516.length - 1];
        }
        if (n != -1) {
            return Class270.method5157(n);
        }
        return null;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "981349968")
    public boolean method5165() {
        if (this.field3516 == null) {
            return true;
        }
        int method3389 = -1;
        if (this.field3499 != -1) {
            method3389 = Class163.method3389(this.field3499);
        }
        else if (this.field3518 != -1) {
            method3389 = Class225.field2558[this.field3518];
        }
        if (method3389 >= 0 && method3389 < this.field3516.length) {
            return this.field3516[method3389] != -1;
        }
        return this.field3516[this.field3516.length - 1] != -1;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "33823014")
    public int method5166(final int n, final int n2) {
        return Class67.method1668(this.field3522, n, n2);
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;B)Ljava/lang/String;", garbageValue = "37")
    public String method5167(final int n, final String s) {
        return Class17.method171(this.field3522, n, s);
    }
}
