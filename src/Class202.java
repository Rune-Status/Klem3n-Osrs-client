import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gx")
public final class Class202
{
    @ObfuscatedName("z")
    int field2414;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lga;")
    Class204[] field2415;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2416;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2417;
    @ObfuscatedName("u")
    int field2418;
    
    public Class202(final int field2414) {
        this.field2418 = 0;
        this.field2414 = field2414;
        this.field2415 = new Class204[field2414];
        for (int i = 0; i < field2414; ++i) {
            final Class204[] field2415 = this.field2415;
            final int n = i;
            final Class204 class204 = new Class204();
            field2415[n] = class204;
            final Class204 class205 = class204;
            class205.field2422 = class205;
            class205.field2423 = class205;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(J)Lga;")
    public Class204 method4020(final long n) {
        final Class204 class204 = this.field2415[(int)(n & this.field2414 - 1)];
        this.field2416 = class204.field2422;
        while (class204 != this.field2416) {
            if (this.field2416.field2421 == n) {
                final Class204 field2416 = this.field2416;
                this.field2416 = this.field2416.field2422;
                return field2416;
            }
            this.field2416 = this.field2416.field2422;
        }
        return this.field2416 = null;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lga;J)V")
    public void method4016(final Class204 class204, final long field2421) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        final Class204 field2422 = this.field2415[(int)(field2421 & this.field2414 - 1)];
        class204.field2423 = field2422.field2423;
        class204.field2422 = field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
        class204.field2421 = field2421;
    }
    
    @ObfuscatedName("s")
    void method4017() {
        for (int i = 0; i < this.field2414; ++i) {
            final Class204 class204 = this.field2415[i];
            while (true) {
                final Class204 field2422 = class204.field2422;
                if (field2422 == class204) {
                    break;
                }
                field2422.method4064();
            }
        }
        this.field2416 = null;
        this.field2417 = null;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4018() {
        this.field2418 = 0;
        return this.method4019();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4019() {
        if (this.field2418 > 0 && this.field2415[this.field2418 - 1] != this.field2417) {
            final Class204 field2417 = this.field2417;
            this.field2417 = field2417.field2422;
            return field2417;
        }
        while (this.field2418 < this.field2414) {
            final Class204 field2418 = this.field2415[this.field2418++].field2422;
            if (field2418 != this.field2415[this.field2418 - 1]) {
                this.field2417 = field2418.field2422;
                return field2418;
            }
        }
        return null;
    }
}
