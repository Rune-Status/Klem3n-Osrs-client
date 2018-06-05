import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hv")
public class Class224 extends Class206
{
    @ObfuscatedName("pr")
    @ObfuscatedGetter(intValue = -1966696999)
    static int field2555;
    @ObfuscatedName("x")
    static int[] field2554;
    @ObfuscatedName("cn")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field2548;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -260867157)
    public final int field2553;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1228930619)
    public final int field2549;
    @ObfuscatedName("s")
    public final int[] field2550;
    @ObfuscatedName("l")
    public final int[] field2551;
    
    Class224(final int field2553, final int field2554, final int[] field2555, final int[] field2556, final int n) {
        this.field2553 = field2553;
        this.field2549 = field2554;
        this.field2550 = field2555;
        this.field2551 = field2556;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIB)Z", garbageValue = "1")
    public boolean method4423(final int n, final int n2) {
        if (n2 >= 0 && n2 < this.field2551.length) {
            final int n3 = this.field2551[n2];
            if (n >= n3 && n <= n3 + this.field2550[n2]) {
                return true;
            }
        }
        return false;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Lir;I)I", garbageValue = "-1700861018")
    static int method4426(final Class247 class247, final Class247 class248) {
        int n = 0;
        if (class247.method4646("title.jpg", "")) {
            ++n;
        }
        if (class248.method4646("logo", "")) {
            ++n;
        }
        if (class248.method4646("logo_deadman_mode", "")) {
            ++n;
        }
        if (class248.method4646("titlebox", "")) {
            ++n;
        }
        if (class248.method4646("titlebutton", "")) {
            ++n;
        }
        if (class248.method4646("runes", "")) {
            ++n;
        }
        if (class248.method4646("title_mute", "")) {
            ++n;
        }
        if (class248.method4646("options_radio_buttons,0", "")) {
            ++n;
        }
        if (class248.method4646("options_radio_buttons,2", "")) {
            ++n;
        }
        if (class248.method4646("options_radio_buttons,4", "")) {
            ++n;
        }
        if (class248.method4646("options_radio_buttons,6", "")) {
            ++n;
        }
        class248.method4646("sl_back", "");
        class248.method4646("sl_flags", "");
        class248.method4646("sl_arrows", "");
        class248.method4646("sl_stars", "");
        class248.method4646("sl_button", "");
        return n;
    }
    
    @ObfuscatedName("gf")
    @ObfuscatedSignature(signature = "(IIIIII)V", garbageValue = "-1148957073")
    static final void method4422(final int n, final int n2, final int n3, final int n4, final int n5) {
        final long method2898 = Class28.field248.method2898(n, n2, n3);
        if (method2898 != 0L) {
            final int method2899 = Class28.field248.method2902(n, n2, n3, method2898);
            final int n6 = method2899 >> 6 & 0x3;
            final int n7 = method2899 & 0x1F;
            int n8 = n4;
            boolean b = method2898 != 0L;
            if (b) {
                b = ((int)(method2898 >>> 16 & 0x1L) != 1);
            }
            if (b) {
                n8 = n5;
            }
            final int[] field3791 = Class72.field1038.field3791;
            final int n9 = n2 * 4 + (103 - n3) * 2048 + 24624;
            final Class268 method2900 = Class110.method2527(Class39.method673(method2898));
            if (method2900.field3415 != -1) {
                final Class317 class317 = Class25.field214[method2900.field3415];
                if (class317 != null) {
                    class317.method5829((method2900.field3384 * 4 - class317.field3780) / 2 + n2 * 4 + 48, (method2900.field3385 * 4 - class317.field3781) / 2 + (104 - n3 - method2900.field3385) * 4 + 48);
                }
            }
            else {
                if (n7 == 0 || n7 == 2) {
                    if (n6 == 0) {
                        field3791[n9 + 512] = (field3791[n9] = n8);
                        field3791[n9 + 1536] = (field3791[n9 + 1024] = n8);
                    }
                    else if (n6 == 1) {
                        field3791[n9 + 1] = (field3791[n9] = n8);
                        field3791[n9 + 3] = (field3791[n9 + 2] = n8);
                    }
                    else if (n6 == 2) {
                        field3791[n9 + 512 + 3] = (field3791[n9 + 3] = n8);
                        field3791[n9 + 1536 + 3] = (field3791[n9 + 1024 + 3] = n8);
                    }
                    else if (n6 == 3) {
                        field3791[n9 + 1536 + 1] = (field3791[n9 + 1536] = n8);
                        field3791[n9 + 1536 + 3] = (field3791[n9 + 1536 + 2] = n8);
                    }
                }
                if (n7 == 3) {
                    if (n6 == 0) {
                        field3791[n9] = n8;
                    }
                    else if (n6 == 1) {
                        field3791[n9 + 3] = n8;
                    }
                    else if (n6 == 2) {
                        field3791[n9 + 1536 + 3] = n8;
                    }
                    else if (n6 == 3) {
                        field3791[n9 + 1536] = n8;
                    }
                }
                if (n7 == 2) {
                    if (n6 == 3) {
                        field3791[n9 + 512] = (field3791[n9] = n8);
                        field3791[n9 + 1536] = (field3791[n9 + 1024] = n8);
                    }
                    else if (n6 == 0) {
                        field3791[n9 + 1] = (field3791[n9] = n8);
                        field3791[n9 + 3] = (field3791[n9 + 2] = n8);
                    }
                    else if (n6 == 1) {
                        field3791[n9 + 512 + 3] = (field3791[n9 + 3] = n8);
                        field3791[n9 + 1536 + 3] = (field3791[n9 + 1024 + 3] = n8);
                    }
                    else if (n6 == 2) {
                        field3791[n9 + 1536 + 1] = (field3791[n9 + 1536] = n8);
                        field3791[n9 + 1536 + 3] = (field3791[n9 + 1536 + 2] = n8);
                    }
                }
            }
        }
        final long method2901 = Class28.field248.method2900(n, n2, n3);
        if (0L != method2901) {
            final int method2902 = Class28.field248.method2902(n, n2, n3, method2901);
            final int n10 = method2902 >> 6 & 0x3;
            final int n11 = method2902 & 0x1F;
            final Class268 method2903 = Class110.method2527(Class39.method673(method2901));
            if (method2903.field3415 != -1) {
                final Class317 class318 = Class25.field214[method2903.field3415];
                if (class318 != null) {
                    class318.method5829(n2 * 4 + (method2903.field3384 * 4 - class318.field3780) / 2 + 48, (104 - n3 - method2903.field3385) * 4 + (method2903.field3385 * 4 - class318.field3781) / 2 + 48);
                }
            }
            else if (n11 == 9) {
                int n12 = 15658734;
                if (Class67.method1683(method2901)) {
                    n12 = 15597568;
                }
                final int[] field3792 = Class72.field1038.field3791;
                final int n13 = n2 * 4 + (103 - n3) * 2048 + 24624;
                if (n10 != 0 && n10 != 2) {
                    field3792[n13 + 1 + 512] = (field3792[n13] = n12);
                    field3792[n13 + 1536 + 3] = (field3792[n13 + 1024 + 2] = n12);
                }
                else {
                    field3792[n13 + 1 + 1024] = (field3792[n13 + 1536] = n12);
                    field3792[n13 + 3] = (field3792[n13 + 512 + 2] = n12);
                }
            }
        }
        final long method2904 = Class28.field248.method2901(n, n2, n3);
        if (method2904 != 0L) {
            final Class268 method2905 = Class110.method2527(Class39.method673(method2904));
            if (method2905.field3415 != -1) {
                final Class317 class319 = Class25.field214[method2905.field3415];
                if (class319 != null) {
                    class319.method5829(n2 * 4 + (method2905.field3384 * 4 - class319.field3780) / 2 + 48, (method2905.field3385 * 4 - class319.field3781) / 2 + (104 - n3 - method2905.field3385) * 4 + 48);
                }
            }
        }
    }
}
