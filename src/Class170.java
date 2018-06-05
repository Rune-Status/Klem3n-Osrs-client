import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fq")
public class Class170 implements Class167
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lfq;")
    public static final Class170 field2237;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lfq;")
    static final Class170 field2236;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lfq;")
    public static final Class170 field2235;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lfq;")
    public static final Class170 field2238;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "[Lfq;")
    static final Class170[] field2240;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1358043829)
    public final int field2239;
    
    static {
        field2237 = new Class170(14, 0);
        field2236 = new Class170(15, 4);
        field2235 = new Class170(16, -2);
        field2238 = new Class170(18, -2);
        field2240 = new Class170[32];
        final Class170[] array = { Class170.field2235, Class170.field2236, Class170.field2237, Class170.field2238 };
        for (int i = 0; i < array.length; ++i) {
            Class170.field2240[array[i].field2239] = array[i];
        }
    }
    
    Class170(final int field2239, final int n) {
        this.field2239 = field2239;
    }
    
    @ObfuscatedName("hw")
    @ObfuscatedSignature(signature = "(IIIIIIIB)V", garbageValue = "15")
    static final void method3449(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7) {
        if (n3 >= 1 && n4 >= 1 && n3 <= 102 && n4 <= 102) {
            if (Client.field585 && n != Class13.field82) {
                return;
            }
            long n8 = 0L;
            if (n2 == 0) {
                n8 = Class28.field248.method2898(n, n3, n4);
            }
            if (n2 == 1) {
                n8 = Class28.field248.method2899(n, n3, n4);
            }
            if (n2 == 2) {
                n8 = Class28.field248.method2900(n, n3, n4);
            }
            if (n2 == 3) {
                n8 = Class28.field248.method2901(n, n3, n4);
            }
            if (n8 != 0L) {
                final int method2902 = Class28.field248.method2902(n, n3, n4, n8);
                final int method2903 = Class39.method673(n8);
                final int n9 = method2902 & 0x1F;
                final int n10 = method2902 >> 6 & 0x3;
                if (n2 == 0) {
                    Class28.field248.method2889(n, n3, n4);
                    final Class268 method2904 = Class110.method2527(method2903);
                    if (method2904.field3386 != 0) {
                        Client.field642[n].method3391(n3, n4, n9, n10, method2904.field3404);
                    }
                }
                if (n2 == 1) {
                    Class28.field248.method2890(n, n3, n4);
                }
                if (n2 == 2) {
                    Class28.field248.method2891(n, n3, n4);
                    final Class268 method2905 = Class110.method2527(method2903);
                    if (n3 + method2905.field3384 > 103 || n4 + method2905.field3384 > 103 || n3 + method2905.field3385 > 103 || n4 + method2905.field3385 > 103) {
                        return;
                    }
                    if (method2905.field3386 != 0) {
                        Client.field642[n].method3399(n3, n4, method2905.field3384, method2905.field3385, n10, method2905.field3404);
                    }
                }
                if (n2 == 3) {
                    Class28.field248.method2971(n, n3, n4);
                    if (Class110.method2527(method2903).field3386 == 1) {
                        Client.field642[n].method3401(n3, n4);
                    }
                }
            }
            if (n5 >= 0) {
                int n11 = n;
                if (n11 < 3 && (Class50.field443[1][n3][n4] & 0x2) == 0x2) {
                    ++n11;
                }
                Class262.method4939(n, n11, n3, n4, n5, n6, n7, Class28.field248, Client.field642[n]);
            }
        }
    }
    
    @ObfuscatedName("im")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2129925873")
    static void method3448() {
        for (int i = 0; i < Client.field771; ++i) {
            if (Class173.method3470(Client.field720[i])) {
                if (i < Client.field771 - 1) {
                    for (int j = i; j < Client.field771 - 1; ++j) {
                        Client.field735[j] = Client.field735[j + 1];
                        Client.field740[j] = Client.field740[j + 1];
                        Client.field720[j] = Client.field720[j + 1];
                        Client.field794[j] = Client.field794[j + 1];
                        Client.field718[j] = Client.field718[j + 1];
                        Client.field851[j] = Client.field851[j + 1];
                        Client.field590[j] = Client.field590[j + 1];
                    }
                }
                --i;
                --Client.field771;
            }
        }
        Class184.method3785(Class135.field1856 / 2 + Class48.field435, Class0.field1);
    }
}
