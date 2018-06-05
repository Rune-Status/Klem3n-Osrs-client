import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("an")
public class Class32
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 2003642713)
    int field282;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1427733301)
    int field287;
    @ObfuscatedName("s")
    int[][] field283;
    @ObfuscatedName("l")
    int[][] field281;
    @ObfuscatedName("u")
    int[][] field285;
    @ObfuscatedName("q")
    int[][] field286;
    
    Class32(final int field282, final int field283) {
        this.field282 = field282;
        this.field287 = field283;
        this.field283 = new int[field282][field283];
        this.field281 = new int[field282][field283];
        this.field285 = new int[field282][field283];
        this.field286 = new int[field282][field283];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIILiq;S)V", garbageValue = "11065")
    void method541(final int n, final int n2, final int n3, final Class259 class259) {
        if (class259 == null) {
            return;
        }
        if (n3 + n < 0 || n3 + n2 < 0) {
            return;
        }
        if (n - n3 > this.field282 || n2 - n3 > this.field287) {
            return;
        }
        final int max = Math.max(0, n - n3);
        final int min = Math.min(this.field282, n3 + n);
        final int max2 = Math.max(0, n2 - n3);
        final int min2 = Math.min(this.field287, n3 + n2);
        for (int i = max; i < min; ++i) {
            for (int j = max2; j < min2; ++j) {
                final int[] array = this.field283[i];
                final int n4 = j;
                array[n4] += class259.field3284 * 256 / class259.field3281;
                final int[] array2 = this.field281[i];
                final int n5 = j;
                array2[n5] += class259.field3287;
                final int[] array3 = this.field285[i];
                final int n6 = j;
                array3[n6] += class259.field3286;
                final int[] array4 = this.field286[i];
                final int n7 = j;
                ++array4[n7];
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIB)I", garbageValue = "1")
    int method547(final int n, final int n2) {
        if (n < 0 || n2 < 0 || n >= this.field282 || n2 >= this.field287) {
            return 0;
        }
        if (this.field285[n][n2] == 0) {
            return 0;
        }
        return Class143.method3167(this.field283[n][n2] / this.field286[n][n2] / 256.0, this.field281[n][n2] / this.field286[n][n2] / 256.0, this.field285[n][n2] / this.field286[n][n2] / 256.0);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "15233496")
    static int method540(final int n, final Class84 class84, final boolean b) {
        if (n == 100) {
            Class69.field1003 -= 3;
            final int n2 = Class69.field999[Class69.field1003];
            final int field2721 = Class69.field999[Class69.field1003 + 1];
            final int field2722 = Class69.field999[Class69.field1003 + 2];
            if (field2721 == 0) {
                throw new RuntimeException();
            }
            final Class230 method434 = Class26.method434(n2);
            if (method434.field2736 == null) {
                method434.field2736 = new Class230[field2722 + 1];
            }
            if (method434.field2736.length <= field2722) {
                final Class230[] field2723 = new Class230[field2722 + 1];
                for (int i = 0; i < method434.field2736.length; ++i) {
                    field2723[i] = method434.field2736[i];
                }
                method434.field2736 = field2723;
            }
            if (field2722 > 0 && method434.field2736[field2722 - 1] == null) {
                throw new RuntimeException("" + (field2722 - 1));
            }
            final Class230 class85 = new Class230();
            class85.field2721 = field2721;
            final Class230 class86 = class85;
            final Class230 class87 = class85;
            final int field2724 = method434.field2691;
            class87.field2691 = field2724;
            class86.field2605 = field2724;
            class85.field2606 = field2722;
            class85.field2604 = true;
            method434.field2736[field2722] = class85;
            if (b) {
                Class276.field3561 = class85;
            }
            else {
                Class260.field3301 = class85;
            }
            Class60.method1114(method434);
            return 1;
        }
        else {
            if (n == 101) {
                final Class230 class88 = b ? Class276.field3561 : Class260.field3301;
                final Class230 method435 = Class26.method434(class88.field2691);
                method435.field2736[class88.field2606] = null;
                Class60.method1114(method435);
                return 1;
            }
            if (n == 102) {
                final Class230 method436 = Class26.method434(Class69.field999[--Class69.field1003]);
                method436.field2736 = null;
                Class60.method1114(method436);
                return 1;
            }
            if (n == 200) {
                Class69.field1003 -= 2;
                final int n3 = Class69.field999[Class69.field1003];
                final int n4 = Class69.field999[Class69.field1003 + 1];
                final Class230 method437 = Class146.method3191(n3, n4);
                if (method437 != null && n4 != -1) {
                    Class69.field999[++Class69.field1003 - 1] = 1;
                    if (b) {
                        Class276.field3561 = method437;
                    }
                    else {
                        Class260.field3301 = method437;
                    }
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                return 1;
            }
            if (n == 201) {
                final Class230 method438 = Class26.method434(Class69.field999[--Class69.field1003]);
                if (method438 != null) {
                    Class69.field999[++Class69.field1003 - 1] = 1;
                    if (b) {
                        Class276.field3561 = method438;
                    }
                    else {
                        Class260.field3301 = method438;
                    }
                }
                else {
                    Class69.field999[++Class69.field1003 - 1] = 0;
                }
                return 1;
            }
            return 2;
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(IIII)I", garbageValue = "-2015845683")
    static final int method549(final int n, final int n2, final int n3) {
        final int n4 = n / n3;
        final int n5 = n & n3 - 1;
        final int n6 = n2 / n3;
        return Class123.method2870(Class123.method2870(Class186.method3805(n4, n6), Class186.method3805(n4 + 1, n6), n5, n3), Class123.method2870(Class186.method3805(n4, n6 + 1), Class186.method3805(n4 + 1, n6 + 1), n5, n3), n2 & n3 - 1, n3);
    }
    
    @ObfuscatedName("ef")
    @ObfuscatedSignature(signature = "(Lic;Ljava/lang/String;I)V", garbageValue = "2071314705")
    static void method548(final Class249 class249, final String s) {
        Client.field781.add(new Class52(class249, s));
    }
}
