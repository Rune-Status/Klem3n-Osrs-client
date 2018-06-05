import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("it")
public class Class254 extends Class206
{
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 215378471)
    public static int field3232;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3231;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -740255657)
    public int field3230;
    
    static {
        Class254.field3231 = new Class200(64);
    }
    
    Class254() {
        this.field3230 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "531410703")
    void method4809(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4810(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "-13")
    void method4810(final Class182 class182, final int n) {
        if (n == 5) {
            this.field3230 = class182.method3550();
        }
    }
}
