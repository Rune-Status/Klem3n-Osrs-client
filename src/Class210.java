import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Iterator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hf")
public class Class210 implements Iterator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgu;")
    Class197 field2437;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2435;
    @ObfuscatedName("s")
    int field2436;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2434;
    
    Class210(final Class197 field2437) {
        this.field2434 = null;
        this.field2437 = field2437;
        this.method4124();
    }
    
    @ObfuscatedName("p")
    void method4124() {
        this.field2435 = this.field2437.field2397[0].field2422;
        this.field2436 = 1;
        this.field2434 = null;
    }
    
    @Override
    public boolean hasNext() {
        if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
            return true;
        }
        while (this.field2436 < this.field2437.field2398) {
            if (this.field2437.field2397[this.field2436++].field2422 != this.field2437.field2397[this.field2436 - 1]) {
                this.field2435 = this.field2437.field2397[this.field2436 - 1].field2422;
                return true;
            }
            this.field2435 = this.field2437.field2397[this.field2436 - 1];
        }
        return false;
    }
    
    @Override
    public void remove() {
        if (this.field2434 == null) {
            throw new IllegalStateException();
        }
        this.field2434.method4064();
        this.field2434 = null;
    }
    
    @Override
    public Object next() {
        if (this.field2437.field2397[this.field2436 - 1] != this.field2435) {
            final Class204 field2435 = this.field2435;
            this.field2435 = field2435.field2422;
            return this.field2434 = field2435;
        }
        while (this.field2436 < this.field2437.field2398) {
            final Class204 field2436 = this.field2437.field2397[this.field2436++].field2422;
            if (field2436 != this.field2437.field2397[this.field2436 - 1]) {
                this.field2435 = field2436.field2422;
                return this.field2434 = field2436;
            }
        }
        return null;
    }
}
