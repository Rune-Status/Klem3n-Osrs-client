import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jv")
public class Class272 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3529;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3524;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1227278643)
    public int field3533;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 322304585)
    public int field3526;
    @ObfuscatedName("u")
    public boolean field3523;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1819527723)
    public int field3528;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 119640423)
    public int field3525;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -1975802877)
    public int field3530;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1348598639)
    public int field3531;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -700053543)
    public int field3527;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 2014252323)
    public int field3532;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -496210747)
    public int field3534;
    
    static {
        Class272.field3524 = new Class200(64);
    }
    
    Class272() {
        this.field3533 = 0;
        this.field3526 = -1;
        this.field3523 = true;
        this.field3528 = -1;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2121765043")
    void method5195() {
        if (this.field3528 != -1) {
            this.method5192(this.field3528);
            this.field3527 = this.field3525;
            this.field3532 = this.field3530;
            this.field3534 = this.field3531;
        }
        this.method5192(this.field3533);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-2042165277")
    void method5194(final Class182 class182, final int n) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method5191(class182, method3544, n);
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgk;III)V", garbageValue = "-1678244242")
    void method5191(final Class182 class182, final int n, final int n2) {
        if (n == 1) {
            this.field3533 = class182.method3552();
        }
        else if (n == 2) {
            this.field3526 = class182.method3544();
        }
        else if (n == 5) {
            this.field3523 = false;
        }
        else if (n == 7) {
            this.field3528 = class182.method3552();
        }
        else if (n == 8) {}
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "1230983884")
    void method5192(final int n) {
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
            if (n2 == n6) {
                n7 = (n3 - n4) / (n6 - n5);
            }
            else if (n6 == n3) {
                n7 = (n4 - n2) / (n6 - n5) + 2.0;
            }
            else if (n4 == n6) {
                n7 = (n2 - n3) / (n6 - n5) + 4.0;
            }
        }
        this.field3525 = (int)(256.0 * (n7 / 6.0));
        this.field3530 = (int)(256.0 * n8);
        this.field3531 = (int)(n9 * 256.0);
        if (this.field3530 < 0) {
            this.field3530 = 0;
        }
        else if (this.field3530 > 255) {
            this.field3530 = 255;
        }
        if (this.field3531 < 0) {
            this.field3531 = 0;
        }
        else if (this.field3531 > 255) {
            this.field3531 = 255;
        }
    }
}
