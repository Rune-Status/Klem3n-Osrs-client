import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ii")
public class Class257 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3264;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3260;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 1654146755)
    static int field3259;
    @ObfuscatedName("s")
    public boolean field3261;
    
    static {
        Class257.field3260 = new Class200(64);
    }
    
    Class257() {
        this.field3261 = false;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "75")
    void method4852(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4854(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;IS)V", garbageValue = "1000")
    void method4854(final Class182 class182, final int n) {
        if (n == 2) {
            this.field3261 = true;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Lir;I)V", garbageValue = "-1839091252")
    public static void method4851(final Class247 field3292, final Class247 field3293) {
        Class260.field3292 = field3292;
        Class260.field3290 = field3293;
        Class260.field3294 = Class260.field3292.method4636(3);
    }
}
