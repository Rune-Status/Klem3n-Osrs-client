import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ie")
public class Class255 extends Class206
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field3237;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lie;")
    public static Class255[] field3246;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 238787811)
    public static int field3236;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field3251;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -38826489)
    public final int field3238;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1319997115)
    public int field3239;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 437595613)
    int field3234;
    @ObfuscatedName("i")
    public String field3241;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 984232407)
    public int field3242;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1009560253)
    public int field3243;
    @ObfuscatedName("b")
    public String[] field3244;
    @ObfuscatedName("n")
    public String field3255;
    @ObfuscatedName("f")
    int[] field3245;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 257365583)
    int field3247;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = -164184983)
    int field3235;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -571209577)
    int field3249;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1516283323)
    int field3248;
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "Ljd;")
    public Class270 field3252;
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "Lis;")
    public Class252 field3253;
    @ObfuscatedName("a")
    int[] field3250;
    @ObfuscatedName("j")
    byte[] field3254;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 1537771069)
    public int field3240;
    
    static {
        Class255.field3251 = new Class200(256);
    }
    
    public Class255(final int field3238) {
        this.field3239 = -1;
        this.field3234 = -1;
        this.field3243 = 0;
        this.field3244 = new String[5];
        this.field3247 = Integer.MAX_VALUE;
        this.field3235 = Integer.MAX_VALUE;
        this.field3249 = Integer.MIN_VALUE;
        this.field3248 = Integer.MIN_VALUE;
        this.field3252 = Class270.field3479;
        this.field3253 = Class252.field3222;
        this.field3240 = -1;
        this.field3238 = field3238;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;I)V", garbageValue = "248610403")
    public void method4816(final Class182 class182) {
        while (true) {
            final int method3544 = class182.method3544();
            if (method3544 == 0) {
                break;
            }
            this.method4817(class182, method3544);
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lgk;IS)V", garbageValue = "4032")
    void method4817(final Class182 class182, final int n) {
        if (n == 1) {
            this.field3239 = class182.method3546();
        }
        else if (n == 2) {
            this.field3234 = class182.method3546();
        }
        else if (n == 3) {
            this.field3241 = class182.method3738();
        }
        else if (n == 4) {
            this.field3242 = class182.method3552();
        }
        else if (n == 5) {
            class182.method3552();
        }
        else if (n == 6) {
            this.field3243 = class182.method3544();
        }
        else if (n == 7) {
            final int method3544 = class182.method3544();
            if ((method3544 & 0x1) == 0x0) {}
            if ((method3544 & 0x2) == 0x2) {}
        }
        else if (n == 8) {
            class182.method3544();
        }
        else if (n >= 10 && n <= 14) {
            this.field3244[n - 10] = class182.method3738();
        }
        else if (n == 15) {
            final int method3545 = class182.method3544();
            this.field3245 = new int[method3545 * 2];
            for (int i = 0; i < method3545 * 2; ++i) {
                this.field3245[i] = class182.method3551();
            }
            class182.method3671();
            this.field3250 = new int[class182.method3544()];
            for (int j = 0; j < this.field3250.length; ++j) {
                this.field3250[j] = class182.method3671();
            }
            this.field3254 = new byte[method3545];
            for (int k = 0; k < method3545; ++k) {
                this.field3254[k] = class182.method3681();
            }
        }
        else if (n != 16) {
            if (n == 17) {
                this.field3255 = class182.method3738();
            }
            else if (n == 18) {
                class182.method3546();
            }
            else if (n == 19) {
                this.field3240 = class182.method3550();
            }
            else if (n == 21) {
                class182.method3671();
            }
            else if (n == 22) {
                class182.method3671();
            }
            else if (n == 23) {
                class182.method3544();
                class182.method3544();
                class182.method3544();
            }
            else if (n == 24) {
                class182.method3551();
                class182.method3551();
            }
            else if (n == 25) {
                class182.method3546();
            }
            else if (n == 28) {
                class182.method3544();
            }
            else if (n == 29) {
                this.field3252 = (Class270)Class76.method1803(new Class270[] { Class270.field3479, Class270.field3484, Class270.field3481 }, class182.method3544());
            }
            else if (n == 30) {
                this.field3253 = (Class252)Class76.method1803(new Class252[] { Class252.field3221, Class252.field3222, Class252.field3224 }, class182.method3544());
            }
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1083458707")
    public void method4828() {
        if (this.field3245 != null) {
            for (int i = 0; i < this.field3245.length; i += 2) {
                if (this.field3245[i] < this.field3247) {
                    this.field3247 = this.field3245[i];
                }
                else if (this.field3245[i] > this.field3249) {
                    this.field3249 = this.field3245[i];
                }
                if (this.field3245[i + 1] < this.field3235) {
                    this.field3235 = this.field3245[i + 1];
                }
                else if (this.field3245[i + 1] > this.field3248) {
                    this.field3248 = this.field3245[i + 1];
                }
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(ZB)Lll;", garbageValue = "-62")
    public Class318 method4815(final boolean b) {
        return this.method4820(this.field3239);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(II)Lll;", garbageValue = "-1422561199")
    Class318 method4820(final int n) {
        if (n < 0) {
            return null;
        }
        final Class318 class318 = (Class318)Class255.field3251.method3989(n);
        if (class318 != null) {
            return class318;
        }
        final Class318 method4499 = Class229.method4499(Class255.field3237, n, 0);
        if (method4499 != null) {
            Class255.field3251.method3983(method4499, n);
        }
        return method4499;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-51")
    public int method4821() {
        return this.field3238;
    }
}
