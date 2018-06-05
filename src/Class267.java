import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jp")
public class Class267 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3367;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3348;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3349;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3356;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3351;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 1731359987)
    int field3353;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 876302883)
    public int field3364;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -936204619)
    public int field3355;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 953756281)
    int field3358;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -1421911827)
    int field3357;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1039819635)
    int field3350;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1076964871)
    int field3359;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = -2143237969)
    public int field3365;
    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 161849281)
    public int field3361;
    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -86534117)
    public int field3354;
    @ObfuscatedName("j")
    String field3363;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 988347075)
    public int field3360;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -203018777)
    public int field3347;
    @ObfuscatedName("c")
    public int[] field3366;
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = 738164645)
    int field3362;
    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = 606288513)
    int field3368;
    
    static {
        Class267.field3349 = new Class200(64);
        Class267.field3356 = new Class200(64);
        Class267.field3351 = new Class200(20);
    }
    
    Class267() {
        this.field3353 = -1;
        this.field3364 = 16777215;
        this.field3355 = 70;
        this.field3358 = -1;
        this.field3357 = -1;
        this.field3350 = -1;
        this.field3359 = -1;
        this.field3365 = 0;
        this.field3361 = 0;
        this.field3354 = -1;
        this.field3363 = "";
        this.field3360 = -1;
        this.field3347 = 0;
        this.field3362 = -1;
        this.field3368 = -1;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-40")
    void method4990(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4991(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "67")
    void method4991(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3353 = class182.method3546();
        }
        else if (n == 2) {
            this.field3364 = class182.method3552();
        }
        else if (n == 3) {
            this.field3358 = class182.method3546();
        }
        else if (n == 4) {
            this.field3350 = class182.method3546();
        }
        else if (n == 5) {
            this.field3357 = class182.method3546();
        }
        else if (n == 6) {
            this.field3359 = class182.method3546();
        }
        else if (n == 7) {
            this.field3365 = class182.method3551();
        }
        else if (n == 8) {
            this.field3363 = class182.method3558();
        }
        else if (n == 9) {
            this.field3355 = class182.method3550();
        }
        else if (n == 10) {
            this.field3361 = class182.method3551();
        }
        else if (n == 11) {
            this.field3354 = 0;
        }
        else if (n == 12) {
            this.field3360 = class182.method3544();
        }
        else if (n == 13) {
            this.field3347 = class182.method3551();
        }
        else if (n == 14) {
            this.field3354 = class182.method3550();
        }
        else if (n == 17 || n == 18) {
            this.field3362 = class182.method3550();
            if (this.field3362 == 65535) {
                this.field3362 = -1;
            }
            this.field3368 = class182.method3550();
            if (this.field3368 == 65535) {
                this.field3368 = -1;
            }
            int method3550 = -1;
            if (n == 18) {
                method3550 = class182.method3550();
                if (method3550 == 65535) {
                    method3550 = -1;
                }
            }
            final int method3551 = class182.method3544();
            this.field3366 = new int[method3551 + 2];
            for (int i = 0; i <= method3551; ++i) {
                this.field3366[i] = class182.method3550();
                if (this.field3366[i] == 65535) {
                    this.field3366[i] = -1;
                }
            }
            this.field3366[method3551 + 1] = method3550;
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)Ljp;", garbageValue = "-1562489008")
    public final Class267 method4995() {
        int method3389 = -1;
        if (this.field3362 != -1) {
            method3389 = Class163.method3389(this.field3362);
        }
        else if (this.field3368 != -1) {
            method3389 = Class225.field2558[this.field3368];
        }
        int n;
        if (method3389 >= 0 && method3389 < this.field3366.length - 1) {
            n = this.field3366[method3389];
        }
        else {
            n = this.field3366[this.field3366.length - 1];
        }
        if (n != -1) {
            return Class14.method123(n);
        }
        return null;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IB)Ljava/lang/String;", garbageValue = "-99")
    public String method5014(final int n) {
        String s = this.field3363;
        while (true) {
            final int index = s.indexOf("%1");
            if (index < 0) {
                break;
            }
            s = s.substring(0, index) + Integer.toString(n) + s.substring(index + 2);
        }
        return s;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "2147112407")
    public Class318 method4994() {
        if (this.field3358 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class267.field3356.method3989(this.field3358);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class267.field3348, this.field3358, 0);
        if (method4499 != null) {
            Class267.field3356.method3983(method4499, this.field3358);
        }
        return method4499;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "1102937480")
    public Class318 method5000() {
        if (this.field3357 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class267.field3356.method3989(this.field3357);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class267.field3348, this.field3357, 0);
        if (method4499 != null) {
            Class267.field3356.method3983(method4499, this.field3357);
        }
        return method4499;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(B)Lll;", garbageValue = "96")
    public Class318 method4996() {
        if (this.field3350 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class267.field3356.method3989(this.field3350);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class267.field3348, this.field3350, 0);
        if (method4499 != null) {
            Class267.field3356.method3983(method4499, this.field3350);
        }
        return method4499;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "720850716")
    public Class318 method4997() {
        if (this.field3359 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class267.field3356.method3989(this.field3359);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class267.field3348, this.field3359, 0);
        if (method4499 != null) {
            Class267.field3356.method3983(method4499, this.field3359);
        }
        return method4499;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(B)Lkj;", garbageValue = "1")
    public Class298 method4998() {
        if (this.field3353 == -1) {
            return null;
        }
        final Class298 class298 = (Class298)Class267.field3351.method3989(this.field3353);
        if (class298 != null) {
            return class298;
        }
        final Class298 method1058 = Class58.method1058(Class267.field3348, Class139.field1877, this.field3353, 0);
        if (method1058 != null) {
            Class267.field3351.method3983(method1058, this.field3353);
        }
        return method1058;
    }
}
