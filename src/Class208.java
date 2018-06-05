import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hp")
public class Class208
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lhk;")
    Class209 field2431;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lhk;")
    Class209 field2430;
    
    public Class208() {
        this.field2431 = new Class209();
        this.field2431.field2432 = this.field2431;
        this.field2431.field2433 = this.field2431;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lhk;)V")
    public void method4112(final Class209 class209) {
        if (class209.field2433 != null) {
            class209.method4121();
        }
        class209.field2433 = this.field2431.field2433;
        class209.field2432 = this.field2431;
        class209.field2433.field2432 = class209;
        class209.field2432.field2433 = class209;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "()Lhk;")
    public Class209 method4111() {
        final Class209 field2432 = this.field2431.field2432;
        if (field2432 == this.field2431) {
            return this.field2430 = null;
        }
        this.field2430 = field2432.field2432;
        return field2432;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "()Lhk;")
    public Class209 method4114() {
        final Class209 field2430 = this.field2430;
        if (field2430 == this.field2431) {
            return this.field2430 = null;
        }
        this.field2430 = field2430.field2432;
        return field2430;
    }
}
