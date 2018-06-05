import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gj")
public final class Class200
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgw;")
    Class206 field2409;
    @ObfuscatedName("w")
    int field2406;
    @ObfuscatedName("s")
    int field2407;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgx;")
    Class202 field2408;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lgo;")
    Class194 field2405;
    
    public Class200(final int n) {
        this.field2409 = new Class206();
        this.field2405 = new Class194();
        this.field2406 = n;
        this.field2407 = n;
        int n2;
        for (n2 = 1; n2 + n2 < n; n2 += n2) {}
        this.field2408 = new Class202(n2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(J)Lgw;")
    public Class206 method3989(final long n) {
        final Class206 class206 = (Class206)this.field2408.method4020(n);
        if (class206 != null) {
            this.field2405.method3910(class206);
        }
        return class206;
    }
    
    @ObfuscatedName("w")
    public void method3982(final long n) {
        final Class206 class206 = (Class206)this.field2408.method4020(n);
        if (class206 != null) {
            class206.method4064();
            class206.method4101();
            ++this.field2407;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgw;J)V")
    public void method3983(final Class206 class206, final long n) {
        if (this.field2407 == 0) {
            final Class206 method3922 = this.field2405.method3922();
            method3922.method4064();
            method3922.method4101();
            if (method3922 == this.field2409) {
                final Class206 method3923 = this.field2405.method3922();
                method3923.method4064();
                method3923.method4101();
            }
        }
        else {
            --this.field2407;
        }
        this.field2408.method4016(class206, n);
        this.field2405.method3910(class206);
    }
    
    @ObfuscatedName("l")
    public void method3984() {
        this.field2405.method3912();
        this.field2408.method4017();
        this.field2409 = new Class206();
        this.field2407 = this.field2406;
    }
}
