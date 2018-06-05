import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ix")
public final class Class241
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IS)Ljo;", garbageValue = "-21845")
    public static Class264 method4603(final int n) {
        final Class264 class264 = (Class264)Class264.field3328.method3989(n);
        if (class264 != null) {
            return class264;
        }
        final byte[] method4625 = Class264.field3327.method4625(11, n);
        final Class264 class265 = new Class264();
        if (method4625 != null) {
            class265.method4948(new Class182(method4625));
        }
        class265.method4954();
        Class264.field3328.method3983(class265, n);
        return class265;
    }
    
    @ObfuscatedName("hf")
    @ObfuscatedSignature(signature = "(IIIIIIIIIB)V", garbageValue = "-35")
    static final void method4602(final int field861, final int field862, final int field863, final int field864, final int field865, final int field866, final int field867, final int field868, final int field869) {
        Class62 class62 = null;
        for (Class62 class63 = (Class62)Client.field714.method4098(); class63 != null; class63 = (Class62)Client.field714.method4079()) {
            if (field861 == class63.field861 && class63.field857 == field862 && field863 == class63.field858 && field864 == class63.field856) {
                class62 = class63;
                break;
            }
        }
        if (class62 == null) {
            class62 = new Class62();
            class62.field861 = field861;
            class62.field856 = field864;
            class62.field857 = field862;
            class62.field858 = field863;
            Class74.method1800(class62);
            Client.field714.method4073(class62);
        }
        class62.field862 = field865;
        class62.field864 = field866;
        class62.field863 = field867;
        class62.field855 = field868;
        class62.field860 = field869;
    }
}
