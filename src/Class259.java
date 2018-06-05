import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iq")
public class Class259 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3283;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3282;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -299191193)
    int field3288;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1454643395)
    public int field3284;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1887824785)
    public int field3287;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1637596643)
    public int field3286;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1884630157)
    public int field3281;
    
    static {
        Class259.field3282 = new Class200(64);
    }
    
    Class259() {
        this.field3288 = 0;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1291543523")
    void method4875() {
        this.method4885(this.field3288);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "1570676740")
    void method4880(final Class182 class182, final int n) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4881(class182, method3544, n);
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgk;IIB)V", garbageValue = "-45")
    void method4881(final Class182 class182, final int n, final int n2) {
        if (n == 1) {
            this.field3288 = class182.method3552();
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-82283989")
    void method4885(final int n) {
        final double n2 = (n >> 16 & 0xFF) / 256.0;
        final double n3 = (n >> 8 & 0xFF) / 256.0;
        final double n4 = (n & 0xFF) / 256.0;
        double n5 = n2;
        if (n3 < n5) {
            n5 = n3;
        }
        if (n4 < n5) {
            n5 = n4;
        }
        double n6 = n2;
        if (n3 > n6) {
            n6 = n3;
        }
        if (n4 > n6) {
            n6 = n4;
        }
        double n7 = 0.0;
        double n8 = 0.0;
        final double n9 = (n6 + n5) / 2.0;
        if (n5 != n6) {
            if (n9 < 0.5) {
                n8 = (n6 - n5) / (n6 + n5);
            }
            if (n9 >= 0.5) {
                n8 = (n6 - n5) / (2.0 - n6 - n5);
            }
            if (n6 == n2) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n6 == n3) {
                n7 = 2.0 + (n4 - n2) / (n6 - n5);
            }
            else if (n6 == n4) {
                n7 = (n2 - n3) / (n6 - n5) + 4.0;
            }
        }
        final double n10 = n7 / 6.0;
        this.field3287 = (int)(n8 * 256.0);
        this.field3286 = (int)(256.0 * n9);
        if (this.field3287 < 0) {
            this.field3287 = 0;
        }
        else if (this.field3287 > 255) {
            this.field3287 = 255;
        }
        if (this.field3286 < 0) {
            this.field3286 = 0;
        }
        else if (this.field3286 > 255) {
            this.field3286 = 255;
        }
        if (n9 > 0.5) {
            this.field3281 = (int)(n8 * (1.0 - n9) * 512.0);
        }
        else {
            this.field3281 = (int)(512.0 * (n8 * n9));
        }
        if (this.field3281 < 1) {
            this.field3281 = 1;
        }
        this.field3284 = (int)(n10 * this.field3281);
    }
}
