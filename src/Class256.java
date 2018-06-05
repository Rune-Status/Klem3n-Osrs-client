import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("io")
public class Class256 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3258;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3257;
    @ObfuscatedName("s")
    public boolean field3256;
    
    static {
        Class256.field3257 = new Class200(64);
    }
    
    Class256() {
        this.field3256 = false;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "2142685495")
    void method4848(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4839(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-1677882054")
    void method4839(final Class182 class182, final int n) {
        if (n == 2) {
            this.field3256 = true;
        }
    }
}
