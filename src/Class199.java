import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gm")
public class Class199 implements Iterator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgy;")
    Class203 field2404;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2403;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2402;
    
    Class199(final Class203 field2404) {
        this.field2402 = null;
        this.field2404 = field2404;
        this.field2403 = this.field2404.field2419.field2422;
        this.field2402 = null;
    }
    
    @Override
    public Object next() {
        Class204 field2403 = this.field2403;
        if (field2403 == this.field2404.field2419) {
            field2403 = null;
            this.field2403 = null;
        }
        else {
            this.field2403 = field2403.field2422;
        }
        return this.field2402 = field2403;
    }
    
    @Override
    public boolean hasNext() {
        return this.field2404.field2419 != this.field2403;
    }
    
    @Override
    public void remove() {
        if (this.field2402 == null) {
            throw new IllegalStateException();
        }
        this.field2402.method4064();
        this.field2402 = null;
    }
}
