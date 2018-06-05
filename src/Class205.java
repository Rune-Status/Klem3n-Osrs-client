import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gn")
public class Class205
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lga;")
    public Class204 field2425;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2424;
    
    public Class205() {
        this.field2425 = new Class204();
        this.field2425.field2422 = this.field2425;
        this.field2425.field2423 = this.field2425;
    }
    
    @ObfuscatedName("z")
    public void method4072() {
        while (true) {
            final Class204 field2422 = this.field2425.field2422;
            if (field2422 == this.field2425) {
                break;
            }
            field2422.method4064();
        }
        this.field2424 = null;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lga;)V")
    public void method4073(final Class204 class204) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = this.field2425.field2423;
        class204.field2422 = this.field2425;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lga;)V")
    public void method4074(final Class204 class204) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = this.field2425;
        class204.field2422 = this.field2425.field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4076() {
        final Class204 field2422 = this.field2425.field2422;
        if (field2422 == this.field2425) {
            return null;
        }
        field2422.method4064();
        return field2422;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4080() {
        final Class204 field2423 = this.field2425.field2423;
        if (field2423 == this.field2425) {
            return null;
        }
        field2423.method4064();
        return field2423;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4098() {
        final Class204 field2422 = this.field2425.field2422;
        if (field2422 == this.field2425) {
            return this.field2424 = null;
        }
        this.field2424 = field2422.field2422;
        return field2422;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4083() {
        final Class204 field2423 = this.field2425.field2423;
        if (field2423 == this.field2425) {
            return this.field2424 = null;
        }
        this.field2424 = field2423.field2423;
        return field2423;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4079() {
        final Class204 field2424 = this.field2424;
        if (field2424 == this.field2425) {
            return this.field2424 = null;
        }
        this.field2424 = field2424.field2422;
        return field2424;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4093() {
        final Class204 field2424 = this.field2424;
        if (field2424 == this.field2425) {
            return this.field2424 = null;
        }
        this.field2424 = field2424.field2423;
        return field2424;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lga;Lga;)V")
    public static void method4075(final Class204 class204, final Class204 field2422) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = field2422.field2423;
        class204.field2422 = field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
}
