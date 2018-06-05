import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kt")
public class Class292 extends Class287
{
    @ObfuscatedName("z")
    boolean field3648;
    @ObfuscatedName("w")
    boolean field3650;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkt;I)I", garbageValue = "1391171788")
    int method5452(final Class292 class292) {
        if (super.field3628 == Client.field581 && Client.field581 != class292.field3628) {
            return -1;
        }
        if (Client.field581 == class292.field3628 && super.field3628 != Client.field581) {
            return 1;
        }
        if (super.field3628 != 0 && class292.field3628 == 0) {
            return -1;
        }
        if (class292.field3628 != 0 && super.field3628 == 0) {
            return 1;
        }
        if (this.field3648 && !class292.field3648) {
            return -1;
        }
        if (!this.field3648 && class292.field3648) {
            return 1;
        }
        if (this.field3650 && !class292.field3650) {
            return -1;
        }
        if (!this.field3650 && class292.field3650) {
            return 1;
        }
        if (super.field3628 != 0) {
            return super.field3627 - class292.field3627;
        }
        return class292.field3627 - super.field3627;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(Ljx;B)I", garbageValue = "97")
    @Override
    public int vmethod5453(final Class282 class282) {
        return this.method5452((Class292)class282);
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.method5452((Class292)o);
    }
}
