import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ah")
public class Class27 implements Class31
{
    @ObfuscatedName("ql")
    @ObfuscatedSignature(signature = "Llg;")
    static Class324 field228;
    @ObfuscatedName("rq")
    static short[] field231;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -1816385673)
    static int field230;
    @ObfuscatedName("ed")
    @ObfuscatedGetter(intValue = 1306481991)
    static int field224;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 538244709)
    int field226;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -169692371)
    int field225;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1674803295)
    int field234;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -560747201)
    int field227;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -499712717)
    int field233;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 1093650467)
    int field229;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(La;B)V", garbageValue = "-105")
    @Override
    public void vmethod635(final Class20 class20) {
        if (class20.field166 > this.field233) {
            class20.field166 = this.field233;
        }
        if (class20.field167 < this.field233) {
            class20.field167 = this.field233;
        }
        if (class20.field168 > this.field229) {
            class20.field168 = this.field229;
        }
        if (class20.field162 < this.field229) {
            class20.field162 = this.field229;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIII)Z", garbageValue = "2090621319")
    @Override
    public boolean vmethod636(final int n, final int n2, final int n3) {
        return n >= this.field226 && n < this.field226 + this.field225 && n2 >> 6 == this.field234 && n3 >> 6 == this.field227;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-658565537")
    @Override
    public boolean vmethod637(final int n, final int n2) {
        return n >> 6 == this.field233 && n2 >> 6 == this.field229;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIB)[I", garbageValue = "56")
    @Override
    public int[] vmethod638(final int n, final int n2, final int n3) {
        if (!this.vmethod636(n, n2, n3)) {
            return null;
        }
        return new int[] { this.field233 * 64 - this.field234 * 64 + n2, n3 + (this.field229 * 64 - this.field227 * 64) };
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(III)Lha;", garbageValue = "2128900046")
    @Override
    public Class226 vmethod659(final int n, final int n2) {
        if (!this.vmethod637(n, n2)) {
            return null;
        }
        return new Class226(this.field226, this.field234 * 64 - this.field233 * 64 + n, this.field227 * 64 - this.field229 * 64 + n2);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-40")
    @Override
    public void vmethod639(final Class182 class182) {
        this.field226 = class182.method3544();
        this.field225 = class182.method3544();
        this.field234 = class182.method3550();
        this.field227 = class182.method3550();
        this.field233 = class182.method3550();
        this.field229 = class182.method3550();
        this.method442();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "23")
    void method442() {
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "60")
    public static int method435(final int n) {
        return Class109.method2484(Class120.field1647[n]);
    }
    
    @ObfuscatedName("gl")
    @ObfuscatedSignature(signature = "(IIII)I", garbageValue = "585185755")
    static final int method460(final int n, final int n2, final int n3) {
        final int n4 = n >> 7;
        final int n5 = n2 >> 7;
        if (n4 >= 0 && n5 >= 0 && n4 <= 103 && n5 <= 103) {
            int n6 = n3;
            if (n6 < 3 && (Class50.field443[1][n4][n5] & 0x2) == 0x2) {
                ++n6;
            }
            final int n7 = n & 0x7F;
            final int n8 = n2 & 0x7F;
            return (n7 * Class50.field459[n6][n4 + 1][n5 + 1] + Class50.field459[n6][n4][n5 + 1] * (128 - n7) >> 7) * n8 + ((128 - n7) * Class50.field459[n6][n4][n5] + n7 * Class50.field459[n6][n4 + 1][n5] >> 7) * (128 - n8) >> 7;
        }
        return 0;
    }
}
