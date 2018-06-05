import java.util.Iterator;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gy")
public class Class203 implements Iterable
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2419;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2420;
    
    public Class203() {
        this.field2419 = new Class204();
        this.field2419.field2422 = this.field2419;
        this.field2419.field2423 = this.field2419;
    }
    
    @ObfuscatedName("z")
    public void method4030() {
        while (this.field2419.field2422 != this.field2419) {
            this.field2419.field2422.method4064();
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lga;)V")
    public void method4031(final Class204 class204) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = this.field2419.field2423;
        class204.field2422 = this.field2419;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lga;)V")
    public void method4038(final Class204 class204) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = this.field2419;
        class204.field2422 = this.field2419.field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4048() {
        return this.method4034(null);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lga;)Lga;")
    Class204 method4034(final Class204 class204) {
        Class204 field2422;
        if (class204 == null) {
            field2422 = this.field2419.field2422;
        }
        else {
            field2422 = class204;
        }
        if (field2422 == this.field2419) {
            return this.field2420 = null;
        }
        this.field2420 = field2422.field2422;
        return field2422;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Lga;")
    public Class204 method4033() {
        final Class204 field2420 = this.field2420;
        if (field2420 == this.field2419) {
            return this.field2420 = null;
        }
        this.field2420 = field2420.field2422;
        return field2420;
    }
    
    @ObfuscatedName("x")
    public boolean method4043() {
        return this.field2419.field2422 == this.field2419;
    }
    
    @Override
    public Iterator iterator() {
        return new Class199(this);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lga;Lga;)V")
    public static void method4036(final Class204 class204, final Class204 field2423) {
        if (class204.field2423 != null) {
            class204.method4064();
        }
        class204.field2423 = field2423;
        class204.field2422 = field2423.field2422;
        class204.field2423.field2422 = class204;
        class204.field2422.field2423 = class204;
    }
}
