import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("at")
public class Class34 extends Class16
{
    @ObfuscatedName("rx")
    @ObfuscatedSignature(signature = "Lff;")
    static Class162 field302;
    @ObfuscatedName("ej")
    @ObfuscatedGetter(intValue = -1954811163)
    static int field301;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = 708492455)
    int field299;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = 890340593)
    int field297;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 1440084157)
    int field298;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = -747624987)
    int field296;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;Lgk;I)V", garbageValue = "-1293834661")
    void method561(final Class182 class182, final Class182 class183) {
        if (class183.method3544() != Class25.field209.field211) {
            throw new IllegalStateException("");
        }
        super.field120 = class183.method3544();
        super.field121 = class183.method3544();
        super.field127 = class183.method3550();
        super.field117 = class183.method3550();
        this.field299 = class183.method3544();
        this.field297 = class183.method3544();
        super.field118 = class183.method3550();
        super.field119 = class183.method3550();
        this.field298 = class183.method3544();
        this.field296 = class183.method3544();
        super.field121 = Math.min(super.field121, 4);
        super.field125 = new short[1][64][64];
        super.field123 = new short[super.field121][64][64];
        super.field124 = new byte[super.field121][64][64];
        super.field116 = new byte[super.field121][64][64];
        super.field126 = new Class19[super.field121][64][64][];
        if (class182.method3544() != Class24.field204.field205) {
            throw new IllegalStateException("");
        }
        final int method3544 = class182.method3544();
        final int method3545 = class182.method3544();
        final int method3546 = class182.method3544();
        final int method3547 = class182.method3544();
        if (method3544 != super.field118 || method3545 != super.field119 || method3546 != this.field298 || method3547 != this.field296) {
            throw new IllegalStateException("");
        }
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                this.method150(i + this.field298 * 8, j + this.field296 * 8, class182);
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-1697676286")
    boolean method562(final int n, final int n2) {
        return n >= this.field298 * 8 && n2 >= this.field296 * 8 && n < this.field298 * 8 + 8 && n2 < this.field296 * 8 + 8;
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "1")
    int method584() {
        return this.field299;
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(S)I", garbageValue = "-552")
    int method564() {
        return this.field297;
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "421563863")
    int method565() {
        return this.field298;
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-2136604695")
    int method563() {
        return this.field296;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class34)) {
            return false;
        }
        final Class34 class34 = (Class34)o;
        return class34.field118 == super.field118 && super.field119 == class34.field119 && class34.field298 == this.field298 && class34.field296 == this.field296;
    }
    
    @Override
    public int hashCode() {
        return super.field118 | super.field119 << 8 | this.field298 << 16 | this.field296 << 24;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1158823389")
    static void method586() {
        if (Class78.field1108 && Class78.field1106 != null && Class78.field1106.length() > 0) {
            Class78.field1102 = 1;
        }
        else {
            Class78.field1102 = 0;
        }
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(IIIB)I", garbageValue = "-10")
    static final int method560(final int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
    }
    
    @ObfuscatedName("hb")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "995963221")
    static void method585() {
        if (!Client.field785) {
            return;
        }
        final Class230 method3191 = Class146.method3191(Class40.field361, Client.field736);
        if (method3191 != null && method3191.field2698 != null) {
            final Class56 class56 = new Class56();
            class56.field506 = method3191;
            class56.field512 = method3191.field2698;
            Class68.method1696(class56);
        }
        Client.field785 = false;
        Class60.method1114(method3191);
    }
}
