import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ga")
public class Class204
{
    @ObfuscatedName("cs")
    public long field2421;
    @ObfuscatedName("ct")
    @ObfuscatedSignature(signature = "Lga;")
    public Class204 field2422;
    @ObfuscatedName("cc")
    @ObfuscatedSignature(signature = "Lga;")
    Class204 field2423;
    
    @ObfuscatedName("jm")
    public void method4064() {
        if (this.field2423 == null) {
            return;
        }
        this.field2423.field2422 = this.field2422;
        this.field2422.field2423 = this.field2423;
        this.field2422 = null;
        this.field2423 = null;
    }
    
    @ObfuscatedName("jw")
    public boolean method4065() {
        return this.field2423 != null;
    }
}
