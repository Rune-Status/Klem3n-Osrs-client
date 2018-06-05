import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ji")
public class Class265 extends Class206
{
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3334;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgu;")
    Class197 field3335;
    
    static {
        Class265.field3334 = new Class200(64);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "-12113")
    public void method4961() {
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "-1049647297")
    public void method4960(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4967(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "49")
    void method4967(final Class182 class182, final int n) {
        if (n == 249) {
            this.field3335 = Class39.method691(class182, this.field3335);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "1625397785")
    public int method4962(final int n, final int n2) {
        return Class67.method1668(this.field3335, n, n2);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;I)Ljava/lang/String;", garbageValue = "1321856430")
    public String method4963(final int n, final String s) {
        return Class17.method171(this.field3335, n, s);
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;", garbageValue = "-15504")
    public static String method4976(final CharSequence charSequence) {
        final int length = charSequence.length();
        final char[] array = new char[length];
        for (int i = 0; i < length; ++i) {
            array[i] = '*';
        }
        return new String(array);
    }
}
