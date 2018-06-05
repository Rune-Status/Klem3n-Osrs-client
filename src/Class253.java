import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iu")
public class Class253 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3226;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3228;
    @ObfuscatedName("ch")
    static boolean field3229;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 690841177)
    public int field3227;
    
    static {
        Class253.field3228 = new Class200(64);
    }
    
    Class253() {
        this.field3227 = 0;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "884121490")
    void method4799(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4805(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "646065158")
    void method4805(final Class182 class182, final int n) {
        if (n == 2) {
            this.field3227 = class182.method3550();
        }
    }
    
    @ObfuscatedName("hc")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "843953881")
    static final void method4808(final int n, final int n2) {
        final Class205 class205 = Client.field708[Class13.field82][n][n2];
        if (class205 == null) {
            Class28.field248.method2877(Class13.field82, n, n2);
            return;
        }
        long n3 = -99999999L;
        Class80 class206 = null;
        for (Class80 class207 = (Class80)class205.method4098(); class207 != null; class207 = (Class80)class205.method4079()) {
            final Class269 method2563 = Class111.method2563(class207.field1151);
            long n4 = method2563.field3445;
            if (method2563.field3444 == 1) {
                n4 *= class207.field1148 + 1;
            }
            if (n4 > n3) {
                n3 = n4;
                class206 = class207;
            }
        }
        if (class206 == null) {
            Class28.field248.method2877(Class13.field82, n, n2);
            return;
        }
        class205.method4074(class206);
        Class80 class208 = null;
        Class127 class209 = null;
        for (Class80 class210 = (Class80)class205.method4098(); class210 != null; class210 = (Class80)class205.method4079()) {
            if (class210.field1151 != class206.field1151) {
                if (class208 == null) {
                    class208 = class210;
                }
                if (class208.field1151 != class210.field1151 && class209 == null) {
                    class209 = class210;
                }
            }
        }
        Class28.field248.method2879(Class13.field82, n, n2, Class27.method460(n * 128 + 64, n2 * 128 + 64, Class13.field82), class206, Class76.method1804(n, n2, 3, false, 0), class208, class209);
    }
}
