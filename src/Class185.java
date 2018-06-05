import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ge")
public class Class185
{
    @ObfuscatedName("e")
    static final int[] field2361;
    @ObfuscatedName("p")
    static final int[] field2362;
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "Lgk;")
    public static Class182 field2359;
    @ObfuscatedName("h")
    static int[] field2364;
    
    static {
        field2361 = new int[2048];
        field2362 = new int[2048];
        final double n = 0.0030679615757712823;
        for (int i = 0; i < 2048; ++i) {
            Class185.field2361[i] = (int)(65536.0 * Math.sin(n * i));
            Class185.field2362[i] = (int)(65536.0 * Math.cos(n * i));
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(S)V", garbageValue = "29745")
    public static void method3787() {
        if (Class48.field429 != null) {
            synchronized (Class48.field429) {
                Class48.field429 = null;
            }
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(ZZI)I", garbageValue = "-249249572")
    public static int method3786(final boolean b, final boolean b2) {
        return 0 + Class250.field3198 + Class250.field3211;
    }
}
