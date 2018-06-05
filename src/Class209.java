import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hk")
public class Class209
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lhk;")
    Class209 field2432;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lhk;")
    Class209 field2433;
    
    @ObfuscatedName("z")
    public void method4121() {
        if (this.field2433 == null) {
            return;
        }
        this.field2433.field2432 = this.field2432;
        this.field2432.field2433 = this.field2433;
        this.field2432 = null;
        this.field2433 = null;
    }
}
