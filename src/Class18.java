import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("o")
public class Class18 implements Class31
{
    @ObfuscatedName("d")
    static String field143;
    @ObfuscatedName("aq")
    protected static boolean field146;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 1991100519)
    int field137;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1519554033)
    int field148;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1074920077)
    int field138;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1335404787)
    int field139;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 150706285)
    int field140;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 620984285)
    int field141;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1655913713)
    int field142;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 568773153)
    int field136;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1297358037)
    int field144;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -910953089)
    int field145;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(La;B)V", garbageValue = "-105")
    @Override
    public void vmethod635(final Class20 class20) {
        if (class20.field166 > this.field142) {
            class20.field166 = this.field142;
        }
        if (class20.field167 < this.field144) {
            class20.field167 = this.field144;
        }
        if (class20.field168 > this.field136) {
            class20.field168 = this.field136;
        }
        if (class20.field162 < this.field145) {
            class20.field162 = this.field145;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIII)Z", garbageValue = "2090621319")
    @Override
    public boolean vmethod636(final int n, final int n2, final int n3) {
        return n >= this.field137 && n < this.field137 + this.field148 && n2 >> 6 >= this.field138 && n2 >> 6 <= this.field140 && n3 >> 6 >= this.field139 && n3 >> 6 <= this.field141;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)Z", garbageValue = "-658565537")
    @Override
    public boolean vmethod637(final int n, final int n2) {
        return n >> 6 >= this.field142 && n >> 6 <= this.field144 && n2 >> 6 >= this.field136 && n2 >> 6 <= this.field145;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(IIIB)[I", garbageValue = "56")
    @Override
    public int[] vmethod638(final int n, final int n2, final int n3) {
        if (!this.vmethod636(n, n2, n3)) {
            return null;
        }
        return new int[] { this.field142 * 64 - this.field138 * 64 + n2, n3 + (this.field136 * 64 - this.field139 * 64) };
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(III)Lha;", garbageValue = "2128900046")
    @Override
    public Class226 vmethod659(final int n, final int n2) {
        if (!this.vmethod637(n, n2)) {
            return null;
        }
        return new Class226(this.field137, this.field138 * 64 - this.field142 * 64 + n, this.field139 * 64 - this.field136 * 64 + n2);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-40")
    @Override
    public void vmethod639(final Class182 class182) {
        this.field137 = class182.method3544();
        this.field148 = class182.method3544();
        this.field138 = class182.method3550();
        this.field139 = class182.method3550();
        this.field140 = class182.method3550();
        this.field141 = class182.method3550();
        this.field142 = class182.method3550();
        this.field136 = class182.method3550();
        this.field144 = class182.method3550();
        this.field145 = class182.method3550();
        this.method179();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-76")
    void method179() {
    }
    
    @ObfuscatedName("el")
    @ObfuscatedSignature(signature = "(I)Llw;", garbageValue = "-948375195")
    static Class321 method196() {
        return Class53.field476;
    }
    
    @ObfuscatedName("ij")
    @ObfuscatedSignature(signature = "(II)Ljava/lang/String;", garbageValue = "1298964684")
    static String method176(final int n) {
        if (n < 0) {
            return "";
        }
        if (Client.field740[n].length() > 0) {
            return Client.field735[n] + " " + Client.field740[n];
        }
        return Client.field735[n];
    }
}
