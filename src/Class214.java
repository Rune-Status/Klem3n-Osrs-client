import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hc")
public class Class214 implements Iterator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lhj;")
    Class215 field2442;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgw;")
    Class206 field2441;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgw;")
    Class206 field2443;
    
    Class214(final Class215 field2442) {
        this.field2443 = null;
        this.field2442 = field2442;
        this.field2441 = this.field2442.field2445.field2426;
        this.field2443 = null;
    }
    
    @Override
    public boolean hasNext() {
        return this.field2442.field2445 != this.field2441;
    }
    
    @Override
    public Object next() {
        Class206 field2441 = this.field2441;
        if (field2441 == this.field2442.field2445) {
            field2441 = null;
            this.field2441 = null;
        }
        else {
            this.field2441 = field2441.field2426;
        }
        return this.field2443 = field2441;
    }
    
    @Override
    public void remove() {
        if (this.field2443 == null) {
            throw new IllegalStateException();
        }
        this.field2443.method4101();
        this.field2443 = null;
    }
}
