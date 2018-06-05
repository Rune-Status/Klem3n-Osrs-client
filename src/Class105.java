import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("do")
public abstract class Class105 extends Class204
{
    @ObfuscatedName("w")
    volatile boolean field1385;
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "Ldo;")
    Class105 field1382;
    @ObfuscatedName("t")
    int field1384;
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "Ldg;")
    Class108 field1383;
    
    protected Class105() {
        this.field1385 = true;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Ldo;")
    protected abstract Class105 vmethod4382();
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Ldo;")
    protected abstract Class105 vmethod4389();
    
    @ObfuscatedName("x")
    protected abstract int vmethod4395();
    
    @ObfuscatedName("e")
    protected abstract void vmethod4385(final int[] p0, final int p1, final int p2);
    
    @ObfuscatedName("b")
    protected abstract void vmethod4386(final int p0);
    
    @ObfuscatedName("ax")
    int vmethod2435() {
        return 255;
    }
    
    @ObfuscatedName("fg")
    final void method2439(final int[] array, final int n, final int n2) {
        if (this.field1385) {
            this.vmethod4385(array, n, n2);
        }
        else {
            this.vmethod4386(n2);
        }
    }
}
