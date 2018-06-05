import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("am")
public final class Class49
{
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "Leh;")
    static Class136 field439;
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)Liq;", garbageValue = "860567064")
    public static Class259 method953(final int n) {
        final Class259 class259 = (Class259)Class259.field3282.method3989(n);
        if (class259 != null) {
            return class259;
        }
        final byte[] method4625 = Class259.field3283.method4625(1, n);
        final Class259 class260 = new Class259();
        if (method4625 != null) {
            class260.method4880(new Class182(method4625), n);
        }
        class260.method4875();
        Class259.field3282.method3983(class260, n);
        return class260;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-66")
    static void method952() {
        Class50.field445 = null;
        Class165.field2033 = null;
        Class50.field446 = null;
        Class19.field159 = null;
        Class37.field325 = null;
        Class50.field447 = null;
        Class50.field448 = null;
        Class50.field454 = null;
        Class305.field3725 = null;
        Class72.field1035 = null;
        Class263.field3325 = null;
        Class243.field3137 = null;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)[Lly;", garbageValue = "2064294997")
    static Class317[] method950() {
        final Class317[] array = new Class317[Class319.field3802];
        for (int i = 0; i < Class319.field3802; ++i) {
            final Class317[] array2 = array;
            final int n = i;
            final Class317 class317 = new Class317();
            array2[n] = class317;
            final Class317 class318 = class317;
            class318.field3784 = Class305.field3729;
            class318.field3783 = Class319.field3798;
            class318.field3782 = Class7.field45[i];
            class318.field3778 = Class225.field2562[i];
            class318.field3780 = Class319.field3800[i];
            class318.field3781 = Class319.field3799[i];
            class318.field3779 = Class172.field2260;
            class318.field3785 = Class319.field3801[i];
        }
        Class7.field45 = null;
        Class225.field2562 = null;
        Class319.field3800 = null;
        Class319.field3799 = null;
        Class172.field2260 = null;
        Class319.field3801 = null;
        return array;
    }
    
    @ObfuscatedName("gx")
    @ObfuscatedSignature(signature = "(IIIIIIB)V", garbageValue = "35")
    static final void method951(final int n, final int n2, final int n3, final int field41, final int field42, final int n4) {
        final int n5 = 2048 - field41 & 0x7FF;
        final int n6 = 2048 - field42 & 0x7FF;
        int n7 = 0;
        int n8 = 0;
        int n9 = n4;
        if (n5 != 0) {
            final int n10 = Class122.field1681[n5];
            final int n11 = Class122.field1693[n5];
            final int n12 = n11 * n8 - n9 * n10 >> 16;
            n9 = n11 * n9 + n8 * n10 >> 16;
            n8 = n12;
        }
        if (n6 != 0) {
            final int n13 = Class122.field1681[n6];
            final int n14 = Class122.field1693[n6];
            final int n15 = n7 * n14 + n13 * n9 >> 16;
            n9 = n9 * n14 - n7 * n13 >> 16;
            n7 = n15;
        }
        Class109.field1431 = n - n7;
        Class123.field1702 = n2 - n8;
        Class226.field2563 = n3 - n9;
        Class7.field41 = field41;
        Class85.field1201 = field42;
        if (Client.field655 == 1 && Client.field747 >= 2 && Client.field591 % 50 == 0 && (Class109.field1428 >> 7 != Class138.field1876.field931 >> 7 || Class2.field23 >> 7 != Class138.field1876.field881 >> 7)) {
            Class19.method197((Class109.field1428 >> 7) + Class62.field868, (Class2.field23 >> 7) + Client.field754, Class138.field1876.field567, true);
        }
    }
}
