import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("go")
public final class Class194
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgw;")
    Class206 field2393;
    
    public Class194() {
        this.field2393 = new Class206();
        this.field2393.field2426 = this.field2393;
        this.field2393.field2427 = this.field2393;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgw;)V")
    public void method3910(final Class206 class206) {
        if (class206.field2427 != null) {
            class206.method4101();
        }
        class206.field2427 = this.field2393.field2427;
        class206.field2426 = this.field2393;
        class206.field2427.field2426 = class206;
        class206.field2426.field2427 = class206;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgw;)V")
    public void method3908(final Class206 class206) {
        if (class206.field2427 != null) {
            class206.method4101();
        }
        class206.field2427 = this.field2393;
        class206.field2426 = this.field2393.field2426;
        class206.field2427.field2426 = class206;
        class206.field2426.field2427 = class206;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "()Lgw;")
    Class206 method3922() {
        final Class206 field2426 = this.field2393.field2426;
        if (field2426 == this.field2393) {
            return null;
        }
        field2426.method4101();
        return field2426;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Lgw;")
    public Class206 method3932() {
        final Class206 field2426 = this.field2393.field2426;
        if (field2426 == this.field2393) {
            return null;
        }
        return field2426;
    }
    
    @ObfuscatedName("q")
    void method3912() {
        while (true) {
            final Class206 field2426 = this.field2393.field2426;
            if (field2426 == this.field2393) {
                break;
            }
            field2426.method4101();
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgw;Lgw;)V")
    static void method3909(final Class206 class206, final Class206 field2427) {
        if (class206.field2427 != null) {
            class206.method4101();
        }
        class206.field2427 = field2427;
        class206.field2426 = field2427.field2426;
        class206.field2427.field2426 = class206;
        class206.field2426.field2427 = class206;
    }
}
