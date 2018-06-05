import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("if")
public enum Class240 implements Class188
{
    field3101("runelite", 0, 3, 0), 
    field3107("runelite", 1, 5, 1), 
    field3097("runelite", 2, 7, 2), 
    field3099("runelite", 3, 2, 3), 
    field3100("runelite", 4, 6, 4), 
    field3098("runelite", 5, 4, 5), 
    field3102("runelite", 6, 1, 6), 
    field3103("runelite", 7, 0, 7);
    
    @ObfuscatedName("ip")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field3096;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1490628439)
    public final int field3104;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -838974909)
    final int field3105;
    
    Class240(final String s, final int n, final int field3104, final int field3105) {
        this.field3104 = field3104;
        this.field3105 = field3105;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3105;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lgi;II)Z", garbageValue = "-641567256")
    static boolean method4601(final Class189 class189, final int field574) {
        final int method3817 = class189.method3817(2);
        if (method3817 == 0) {
            if (class189.method3817(1) != 0) {
                method4601(class189, field574);
            }
            final int method3818 = class189.method3817(13);
            final int method3819 = class189.method3817(13);
            if (class189.method3817(1) == 1) {
                Class81.field1166[++Class81.field1165 - 1] = field574;
            }
            if (Client.field610[field574] != null) {
                throw new RuntimeException();
            }
            final Class60[] field575 = Client.field610;
            final Class60 class190 = new Class60();
            field575[field574] = class190;
            final Class60 class191 = class190;
            class191.field574 = field574;
            if (Class81.field1157[field574] != null) {
                class191.method1082(Class81.field1157[field574]);
            }
            class191.field926 = Class81.field1163[field574];
            class191.field897 = Class81.field1164[field574];
            final int n = Class81.field1162[field574];
            final int n2 = n >> 28;
            final int n3 = n >> 14 & 0xFF;
            final int n4 = n & 0xFF;
            class191.field928[0] = Class81.field1153[field574];
            class191.field567 = (byte)n2;
            class191.method1103((n3 << 13) + method3818 - Class62.field868, (n4 << 13) + method3819 - Client.field754);
            class191.field571 = false;
            return true;
        }
        else {
            if (method3817 == 1) {
                final int method3820 = class189.method3817(2);
                final int n5 = Class81.field1162[field574];
                Class81.field1162[field574] = (n5 & 0xFFFFFFF) + (((n5 >> 28) + method3820 & 0x3) << 28);
                return false;
            }
            if (method3817 == 2) {
                final int method3821 = class189.method3817(5);
                final int n6 = method3821 >> 3;
                final int n7 = method3821 & 0x7;
                final int n8 = Class81.field1162[field574];
                final int n9 = (n8 >> 28) + n6 & 0x3;
                int n10 = n8 >> 14 & 0xFF;
                int n11 = n8 & 0xFF;
                if (n7 == 0) {
                    --n10;
                    --n11;
                }
                if (n7 == 1) {
                    --n11;
                }
                if (n7 == 2) {
                    ++n10;
                    --n11;
                }
                if (n7 == 3) {
                    --n10;
                }
                if (n7 == 4) {
                    ++n10;
                }
                if (n7 == 5) {
                    --n10;
                    ++n11;
                }
                if (n7 == 6) {
                    ++n11;
                }
                if (n7 == 7) {
                    ++n10;
                    ++n11;
                }
                Class81.field1162[field574] = (n10 << 14) + n11 + (n9 << 28);
                return false;
            }
            final int method3822 = class189.method3817(18);
            final int n12 = method3822 >> 16;
            final int n13 = method3822 >> 8 & 0xFF;
            final int n14 = method3822 & 0xFF;
            final int n15 = Class81.field1162[field574];
            Class81.field1162[field574] = ((n13 + (n15 >> 14) & 0xFF) << 14) + (n14 + n15 & 0xFF) + (((n15 >> 28) + n12 & 0x3) << 28);
            return false;
        }
    }
}
