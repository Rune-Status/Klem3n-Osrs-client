import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jk")
public class Class260 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3292;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field3290;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 726327701)
    public static int field3294;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    public static Class200 field3291;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field3301;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1006781997)
    public int field3293;
    @ObfuscatedName("q")
    int[] field3299;
    @ObfuscatedName("k")
    short[] field3302;
    @ObfuscatedName("i")
    short[] field3296;
    @ObfuscatedName("x")
    short[] field3297;
    @ObfuscatedName("e")
    short[] field3298;
    @ObfuscatedName("p")
    int[] field3289;
    @ObfuscatedName("b")
    public boolean field3295;
    
    static {
        Class260.field3291 = new Class200(64);
    }
    
    Class260() {
        this.field3293 = -1;
        this.field3289 = new int[] { -1, -1, -1, -1, -1 };
        this.field3295 = false;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "-148271753")
    void method4894(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4909(class182, method3544);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "-1740935180")
    void method4909(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3293 = class182.method3544();
        }
        else if (n == 2) {
            final int method3544 = class182.method3544();
            this.field3299 = new int[method3544];
            for (int i = 0; i < method3544; ++i) {
                this.field3299[i] = class182.method3550();
            }
        }
        else if (n == 3) {
            this.field3295 = true;
        }
        else if (n == 40) {
            final int method3545 = class182.method3544();
            this.field3302 = new short[method3545];
            this.field3296 = new short[method3545];
            for (int j = 0; j < method3545; ++j) {
                this.field3302[j] = (short)class182.method3550();
                this.field3296[j] = (short)class182.method3550();
            }
        }
        else if (n == 41) {
            final int method3546 = class182.method3544();
            this.field3297 = new short[method3546];
            this.field3298 = new short[method3546];
            for (int k = 0; k < method3546; ++k) {
                this.field3297[k] = (short)class182.method3550();
                this.field3298[k] = (short)class182.method3550();
            }
        }
        else if (n >= 60 && n < 70) {
            this.field3289[n - 60] = class182.method3550();
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "2")
    public boolean method4896() {
        if (this.field3299 == null) {
            return true;
        }
        boolean b = true;
        for (int i = 0; i < this.field3299.length; ++i) {
            if (!Class260.field3290.method4696(this.field3299[i], 0)) {
                b = false;
            }
        }
        return b;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)Ldb;", garbageValue = "1023847556")
    public Class113 method4897() {
        if (this.field3299 == null) {
            return null;
        }
        final Class113[] array = new Class113[this.field3299.length];
        for (int i = 0; i < this.field3299.length; ++i) {
            array[i] = Class113.method2568(Class260.field3290, this.field3299[i], 0);
        }
        Class113 class113;
        if (array.length == 1) {
            class113 = array[0];
        }
        else {
            class113 = new Class113(array, array.length);
        }
        if (this.field3302 != null) {
            for (int j = 0; j < this.field3302.length; ++j) {
                class113.method2581(this.field3302[j], this.field3296[j]);
            }
        }
        if (this.field3297 != null) {
            for (int k = 0; k < this.field3297.length; ++k) {
                class113.method2582(this.field3297[k], this.field3298[k]);
            }
        }
        return class113;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "2062826807")
    public boolean method4905() {
        boolean b = true;
        for (int i = 0; i < 5; ++i) {
            if (this.field3289[i] != -1 && !Class260.field3290.method4696(this.field3289[i], 0)) {
                b = false;
            }
        }
        return b;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)Ldb;", garbageValue = "1278198342")
    public Class113 method4899() {
        final Class113[] array = new Class113[5];
        int n = 0;
        for (int i = 0; i < 5; ++i) {
            if (this.field3289[i] != -1) {
                array[n++] = Class113.method2568(Class260.field3290, this.field3289[i], 0);
            }
        }
        final Class113 class113 = new Class113(array, n);
        if (this.field3302 != null) {
            for (int j = 0; j < this.field3302.length; ++j) {
                class113.method2581(this.field3302[j], this.field3296[j]);
            }
        }
        if (this.field3297 != null) {
            for (int k = 0; k < this.field3297.length; ++k) {
                class113.method2582(this.field3297[k], this.field3298[k]);
            }
        }
        return class113;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIII)I", garbageValue = "-30984690")
    static int method4908(final int n, int n2, final int n3) {
        if (n3 > 179) {
            n2 /= 2;
        }
        if (n3 > 192) {
            n2 /= 2;
        }
        if (n3 > 217) {
            n2 /= 2;
        }
        if (n3 > 243) {
            n2 /= 2;
        }
        return (n2 / 32 << 7) + (n / 4 << 10) + n3 / 2;
    }
}
