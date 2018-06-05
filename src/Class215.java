import java.util.Iterator;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hj")
public class Class215 implements Iterable
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgw;")
    public Class206 field2445;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgw;")
    Class206 field2444;
    
    public Class215() {
        this.field2445 = new Class206();
        this.field2445.field2426 = this.field2445;
        this.field2445.field2427 = this.field2445;
    }
    
    @ObfuscatedName("z")
    public void method4168() {
        while (this.field2445.field2426 != this.field2445) {
            this.field2445.field2426.method4101();
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgw;)V")
    public void method4155(final Class206 class206) {
        if (class206.field2427 != null) {
            class206.method4101();
        }
        class206.field2427 = this.field2445.field2427;
        class206.field2426 = this.field2445;
        class206.field2427.field2426 = class206;
        class206.field2426.field2427 = class206;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "()Lgw;")
    Class206 method4156() {
        final Class206 field2426 = this.field2445.field2426;
        if (field2426 == this.field2445) {
            return null;
        }
        field2426.method4101();
        return field2426;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "()Lgw;")
    Class206 method4177() {
        return this.method4160(null);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgw;)Lgw;")
    Class206 method4160(final Class206 class206) {
        Class206 field2426;
        if (class206 == null) {
            field2426 = this.field2445.field2426;
        }
        else {
            field2426 = class206;
        }
        if (field2426 == this.field2445) {
            return this.field2444 = null;
        }
        this.field2444 = field2426.field2426;
        return field2426;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Lgw;")
    Class206 method4159() {
        final Class206 field2444 = this.field2444;
        if (field2444 == this.field2445) {
            return this.field2444 = null;
        }
        this.field2444 = field2444.field2426;
        return field2444;
    }
    
    @Override
    public Iterator iterator() {
        return new Class214(this);
    }
}
