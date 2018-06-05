import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jz")
public class Class281 extends Class287
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field3608;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lkd;")
    Class289 field3609;
    
    Class281() {
        this.field3608 = Class289.field3633;
        this.field3609 = Class289.field3633;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-255402165")
    void method5272() {
        this.field3608 = Class289.field3633;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-818055706")
    public final boolean method5266() {
        if (this.field3608 == Class289.field3633) {
            this.method5264();
        }
        return this.field3608 == Class289.field3631;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1286872736")
    void method5264() {
        this.field3608 = (Class181.field2332.field970.method5329(super.field3610) ? Class289.field3631 : Class289.field3634);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-47")
    void method5273() {
        this.field3609 = Class289.field3633;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "924663410")
    public final boolean method5267() {
        if (this.field3609 == Class289.field3633) {
            this.method5268();
        }
        return this.field3609 == Class289.field3631;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1219918340")
    void method5268() {
        this.field3609 = (Class181.field2332.field975.method5329(super.field3610) ? Class289.field3631 : Class289.field3634);
    }
}
