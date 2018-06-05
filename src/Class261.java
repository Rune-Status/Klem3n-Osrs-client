import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ja")
public class Class261 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3304;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3314;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3305;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3306;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1290574683)
    public int field3317;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 293385999)
    public int field3310;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 497866573)
    public int field3307;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1257044637)
    public int field3312;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1902915669)
    public int field3308;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1500429693)
    public int field3313;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 1619382661)
    int field3315;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = -1784458549)
    int field3316;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 555187831)
    public int field3311;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -835956497)
    public int field3318;
    
    static {
        Class261.field3305 = new Class200(64);
        Class261.field3306 = new Class200(64);
    }
    
    public Class261() {
        this.field3310 = 255;
        this.field3307 = 255;
        this.field3312 = -1;
        this.field3308 = 1;
        this.field3313 = 70;
        this.field3315 = -1;
        this.field3316 = -1;
        this.field3311 = 30;
        this.field3318 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "2067333055")
    public void method4915(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4916(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-2130142641")
    void method4916(final Class182 class182, final int n) {
        if (n == 1) {
            class182.method3550();
        }
        else if (n == 2) {
            this.field3310 = class182.method3544();
        }
        else if (n == 3) {
            this.field3307 = class182.method3544();
        }
        else if (n == 4) {
            this.field3312 = 0;
        }
        else if (n == 5) {
            this.field3313 = class182.method3550();
        }
        else if (n == 6) {
            class182.method3544();
        }
        else if (n == 7) {
            this.field3315 = class182.method3546();
        }
        else if (n == 8) {
            this.field3316 = class182.method3546();
        }
        else if (n == 11) {
            this.field3312 = class182.method3550();
        }
        else if (n == 14) {
            this.field3311 = class182.method3544();
        }
        else if (n == 15) {
            this.field3318 = class182.method3544();
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "-1987129787")
    public Class318 method4917() {
        if (this.field3315 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class261.field3306.method3989(this.field3315);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class261.field3314, this.field3315, 0);
        if (method4499 != null) {
            Class261.field3306.method3983(method4499, this.field3315);
        }
        return method4499;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "879523324")
    public Class318 method4918() {
        if (this.field3316 < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class261.field3306.method3989(this.field3316);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class261.field3314, this.field3316, 0);
        if (method4499 != null) {
            Class261.field3306.method3983(method4499, this.field3316);
        }
        return method4499;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "97")
    public static boolean method4931(final int n) {
        if (Class175.field2271[n]) {
            return true;
        }
        if (!Class230.field2729.method4707(n)) {
            return false;
        }
        final int method4636 = Class230.field2729.method4636(n);
        if (method4636 == 0) {
            return Class175.field2271[n] = true;
        }
        if (Class42.field366[n] == null) {
            Class42.field366[n] = new Class230[method4636];
        }
        for (int i = 0; i < method4636; ++i) {
            if (Class42.field366[n][i] == null) {
                final byte[] method4637 = Class230.field2729.method4625(n, i);
                if (method4637 != null) {
                    Class42.field366[n][i] = new Class230();
                    Class42.field366[n][i].field2691 = i + (n << 16);
                    if (method4637[0] == -1) {
                        Class42.field366[n][i].method4532(new Class182(method4637));
                    }
                    else {
                        Class42.field366[n][i].method4549(new Class182(method4637));
                    }
                }
            }
        }
        return Class175.field2271[n] = true;
    }
}
