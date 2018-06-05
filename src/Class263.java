import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jl")
public class Class263 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3322;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3321;
    @ObfuscatedName("n")
    static int[] field3325;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -738108461)
    public int field3320;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 676822163)
    public int field3323;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1532826907)
    public int field3326;
    
    static {
        Class263.field3321 = new Class200(64);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "-1902884964")
    public void method4941(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4942(class182, method3544);
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "1481115001")
    void method4942(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3320 = class182.method3550();
            this.field3323 = class182.method3544();
            this.field3326 = class182.method3544();
        }
    }
}
