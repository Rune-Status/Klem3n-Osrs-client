import java.util.Iterator;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gu")
public final class Class197 implements Iterable
{
    @ObfuscatedName("z")
    int field2398;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lga;")
    Class204[] field2397;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2400;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2399;
    @ObfuscatedName("u")
    int field2396;
    
    public Class197(final int field2398) {
        this.field2396 = 0;
        this.field2398 = field2398;
        this.field2397 = new Class204[field2398];
        for (int i = 0; i < field2398; ++i) {
            final Class204[] field2399 = this.field2397;
            final int n = i;
            final Class204 class204 = new Class204();
            field2399[n] = class204;
            final Class204 class205 = class204;
            class205.field2422 = class205;
            class205.field2423 = class205;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(J)Lga;")
    public Class204 method3945(final long n) {
        final Class204 class204 = this.field2397[(int)(n & this.field2398 - 1)];
        this.field2400 = class204.field2422;
        while (class204 != this.field2400) {
            if (this.field2400.field2421 == n) {
                final Class204 field2400 = this.field2400;
                this.field2400 = this.field2400.field2422;
                return field2400;
            }
            this.field2400 = this.field2400.field2422;
        }
        return this.field2400 = null;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lga;J)V")
    public void method3944(final Class204 class204, final long field2421) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        final Class204 field2422 = this.field2397[(int)(field2421 & this.field2398 - 1)];
        class204.field2423 = field2422.field2423;
        class204.field2422 = field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
        class204.field2421 = field2421;
    }
    
    @ObfuscatedName("s")
    public void method3951() {
        for (int i = 0; i < this.field2398; ++i) {
            final Class204 class204 = this.field2397[i];
            while (true) {
                final Class204 field2422 = class204.field2422;
                if (field2422 == class204) {
                    break;
                }
                field2422.method4064();
            }
        }
        this.field2400 = null;
        this.field2399 = null;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method3955() {
        this.field2396 = 0;
        return this.method3947();
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method3947() {
        if (this.field2396 > 0 && this.field2397[this.field2396 - 1] != this.field2399) {
            final Class204 field2399 = this.field2399;
            this.field2399 = field2399.field2422;
            return field2399;
        }
        while (this.field2396 < this.field2398) {
            final Class204 field2400 = this.field2397[this.field2396++].field2422;
            if (field2400 != this.field2397[this.field2396 - 1]) {
                this.field2399 = field2400.field2422;
                return field2400;
            }
        }
        return null;
    }
    
    @Override
    public Iterator iterator() {
        return new Class210(this);
    }
}
