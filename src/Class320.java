import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ld")
public class Class320
{
    @ObfuscatedName("q")
    String field3807;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field3805;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1352233263)
    int field3803;
    @ObfuscatedName("x")
    boolean field3810;
    
    Class320(final Class247 field3805) {
        this.field3803 = 0;
        this.field3810 = false;
        this.field3805 = field3805;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1415895752")
    void method5995(final String field3807) {
        if (field3807 == null || field3807.isEmpty()) {
            return;
        }
        if (field3807 == this.field3807) {
            return;
        }
        this.field3807 = field3807;
        this.field3803 = 0;
        this.field3810 = false;
        this.method5985();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "30")
    int method5985() {
        if (this.field3803 < 25) {
            if (!this.field3805.method4646(Class29.field251.field255, this.field3807)) {
                return this.field3803;
            }
            this.field3803 = 25;
        }
        if (this.field3803 == 25) {
            if (!this.field3805.method4646(this.field3807, Class29.field262.field255)) {
                return 25 + this.field3805.method4687(this.field3807) * 25 / 100;
            }
            this.field3803 = 50;
        }
        if (this.field3803 == 50) {
            if (this.field3805.method4644(Class29.field257.field255, this.field3807) && !this.field3805.method4646(Class29.field257.field255, this.field3807)) {
                return 50;
            }
            this.field3803 = 75;
        }
        if (this.field3803 == 75) {
            if (!this.field3805.method4646(this.field3807, Class29.field254.field255)) {
                return 75;
            }
            this.field3803 = 100;
            this.field3810 = true;
        }
        return this.field3803;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-2033116061")
    boolean method5987() {
        return this.field3810;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-2104443590")
    int method5988() {
        return this.field3803;
    }
}
