import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jo")
public class Class264 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3327;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3328;
    @ObfuscatedName("s")
    char field3331;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 916691841)
    public int field3330;
    @ObfuscatedName("u")
    public String field3333;
    @ObfuscatedName("q")
    boolean field3332;
    
    static {
        Class264.field3328 = new Class200(64);
    }
    
    Class264() {
        this.field3332 = true;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "99")
    void method4954() {
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-16")
    void method4948(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4950(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "-29")
    void method4950(final Class182 class182, final int n) {
        if (n == 1) {
            int n2 = class182.method3681() & 0xFF;
            if (n2 == 0) {
                throw new IllegalArgumentException("");
            }
            if (n2 >= 128 && n2 < 160) {
                int n3 = Class301.field3714[n2 - 128];
                if (n3 == 0) {
                    n3 = 63;
                }
                n2 = n3;
            }
            this.field3331 = (char)n2;
        }
        else if (n == 2) {
            this.field3330 = class182.method3671();
        }
        else if (n == 4) {
            this.field3332 = false;
        }
        else if (n == 5) {
            this.field3333 = class182.method3738();
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "1271827872")
    public boolean method4951() {
        return this.field3331 == 's';
    }
}
