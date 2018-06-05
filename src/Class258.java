import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ib")
public class Class258 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3272;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3279;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3267;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3265;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -222748263)
    int field3280;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1890309405)
    int field3268;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -1738740977)
    public int field3271;
    @ObfuscatedName("i")
    short[] field3266;
    @ObfuscatedName("x")
    short[] field3270;
    @ObfuscatedName("e")
    short[] field3274;
    @ObfuscatedName("p")
    short[] field3275;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1496956879)
    int field3276;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -3859707)
    int field3277;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1793069157)
    int field3278;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 1287651757)
    int field3273;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 1462355847)
    int field3269;
    
    static {
        Class258.field3267 = new Class200(64);
        Class258.field3265 = new Class200(30);
    }
    
    Class258() {
        this.field3271 = -1;
        this.field3276 = 128;
        this.field3277 = 128;
        this.field3278 = 0;
        this.field3273 = 0;
        this.field3269 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "713149858")
    void method4864(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4865(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "269273917")
    void method4865(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3268 = class182.method3550();
        }
        else if (n == 2) {
            this.field3271 = class182.method3550();
        }
        else if (n == 4) {
            this.field3276 = class182.method3550();
        }
        else if (n == 5) {
            this.field3277 = class182.method3550();
        }
        else if (n == 6) {
            this.field3278 = class182.method3550();
        }
        else if (n == 7) {
            this.field3273 = class182.method3544();
        }
        else if (n == 8) {
            this.field3269 = class182.method3544();
        }
        else if (n == 40) {
            final int method3544 = class182.method3544();
            this.field3266 = new short[method3544];
            this.field3270 = new short[method3544];
            for (int i = 0; i < method3544; ++i) {
                this.field3266[i] = (short)class182.method3550();
                this.field3270[i] = (short)class182.method3550();
            }
        }
        else if (n == 41) {
            final int method3545 = class182.method3544();
            this.field3274 = new short[method3545];
            this.field3275 = new short[method3545];
            for (int j = 0; j < method3545; ++j) {
                this.field3274[j] = (short)class182.method3550();
                this.field3275[j] = (short)class182.method3550();
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II)Ldc;", garbageValue = "-226282486")
    public final Class119 method4866(final int n) {
        Class119 method2589 = (Class119)Class258.field3265.method3989(this.field3280);
        if (method2589 == null) {
            final Class113 method2590 = Class113.method2568(Class258.field3279, this.field3268, 0);
            if (method2590 == null) {
                return null;
            }
            if (this.field3266 != null) {
                for (int i = 0; i < this.field3266.length; ++i) {
                    method2590.method2581(this.field3266[i], this.field3270[i]);
                }
            }
            if (this.field3274 != null) {
                for (int j = 0; j < this.field3274.length; ++j) {
                    method2590.method2582(this.field3274[j], this.field3275[j]);
                }
            }
            method2589 = method2590.method2589(this.field3273 + 64, this.field3269 + 850, -30, -50, -30);
            Class258.field3265.method3983(method2589, this.field3280);
        }
        Class119 class119;
        if (this.field3271 != -1 && n != -1) {
            class119 = Class3.method25(this.field3271).method5217(method2589, n);
        }
        else {
            class119 = method2589.method2667(true);
        }
        if (this.field3276 != 128 || this.field3277 != 128) {
            class119.method2681(this.field3276, this.field3277, this.field3276);
        }
        if (this.field3278 != 0) {
            if (this.field3278 == 90) {
                class119.method2677();
            }
            if (this.field3278 == 180) {
                class119.method2677();
                class119.method2677();
            }
            if (this.field3278 == 270) {
                class119.method2677();
                class119.method2677();
                class119.method2677();
            }
        }
        return class119;
    }
}
