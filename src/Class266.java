import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jy")
public class Class266 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3338;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3342;
    @ObfuscatedName("bi")
    @ObfuscatedSignature(signature = "Lid;")
    static Class243 field3346;
    @ObfuscatedName("s")
    public char field3336;
    @ObfuscatedName("l")
    public char field3337;
    @ObfuscatedName("u")
    public String field3340;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1596194807)
    public int field3341;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 689327517)
    public int field3345;
    @ObfuscatedName("i")
    public int[] field3343;
    @ObfuscatedName("x")
    public int[] field3344;
    @ObfuscatedName("e")
    public String[] field3339;
    
    static {
        Class266.field3342 = new Class200(64);
    }
    
    Class266() {
        this.field3340 = "null";
        this.field3345 = 0;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "2")
    void method4978(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4979(class182, method3544);
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;IB)V", garbageValue = "1")
    void method4979(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3336 = (char)class182.method3544();
        }
        else if (n == 2) {
            this.field3337 = (char)class182.method3544();
        }
        else if (n == 3) {
            this.field3340 = class182.method3738();
        }
        else if (n == 4) {
            this.field3341 = class182.method3671();
        }
        else if (n == 5) {
            this.field3345 = class182.method3550();
            this.field3343 = new int[this.field3345];
            this.field3339 = new String[this.field3345];
            for (int i = 0; i < this.field3345; ++i) {
                this.field3343[i] = class182.method3671();
                this.field3339[i] = class182.method3738();
            }
        }
        else if (n == 6) {
            this.field3345 = class182.method3550();
            this.field3343 = new int[this.field3345];
            this.field3344 = new int[this.field3345];
            for (int j = 0; j < this.field3345; ++j) {
                this.field3343[j] = class182.method3671();
                this.field3344[j] = class182.method3671();
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-530255352")
    public int method4980() {
        return this.field3345;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(DDIB)[D", garbageValue = "2")
    public static double[] method4986(final double n, final double n2, final int n3) {
        final double[] array = new double[n3 * 2 + 1];
        for (int i = -n3, n4 = 0; i <= n3; ++i, ++n4) {
            final double[] array2 = array;
            final int n5 = n4;
            final double n6 = (i - n) / n2;
            array2[n5] = Math.exp(-n6 * n6 / 2.0) / Math.sqrt(6.283185307179586) / n2;
        }
        return array;
    }
}
