import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ez")
public class Class149 extends Class160
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(longValue = 8091709939901434705L)
    long field1918;
    
    Class149() {
        this.field1918 = System.nanoTime();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2021286604")
    @Override
    public void vmethod3330() {
        this.field1918 = System.nanoTime();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "2142370282")
    @Override
    public int vmethod3331(final int n, final int n2) {
        final long n3 = 1000000L * n2;
        long n4 = this.field1918 - System.nanoTime();
        if (n4 < n3) {
            n4 = n3;
        }
        Class63.method1539(n4 / 1000000L);
        long nanoTime;
        int n5;
        for (nanoTime = System.nanoTime(), n5 = 0; n5 < 10 && (n5 < 1 || this.field1918 < nanoTime); ++n5, this.field1918 += 1000000L * n) {}
        if (this.field1918 < nanoTime) {
            this.field1918 = nanoTime;
        }
        return n5;
    }
}
