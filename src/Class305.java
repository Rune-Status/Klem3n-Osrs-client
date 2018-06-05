import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kq")
public final class Class305
{
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -259078735)
    static int field3729;
    @ObfuscatedName("p")
    static int[] field3725;
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(I)Lly;", garbageValue = "1052310546")
    static Class317 method5658() {
        final Class317 class317 = new Class317();
        class317.field3784 = Class305.field3729;
        class317.field3783 = Class319.field3798;
        class317.field3782 = Class7.field45[0];
        class317.field3778 = Class225.field2562[0];
        class317.field3780 = Class319.field3800[0];
        class317.field3781 = Class319.field3799[0];
        class317.field3779 = Class172.field2260;
        class317.field3785 = Class319.field3801[0];
        Class7.field45 = null;
        Class225.field2562 = null;
        Class319.field3800 = null;
        Class319.field3799 = null;
        Class172.field2260 = null;
        Class319.field3801 = null;
        return class317;
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "1903036691")
    static int method5659(int n, final Class84 class84, final boolean b) {
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            method434 = Class26.method434(Class69.field999[--Class69.field1003]);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        if (n != 1927) {
            return 2;
        }
        if (Class69.field1009 >= 10) {
            throw new RuntimeException();
        }
        if (method434.field2715 == null) {
            return 0;
        }
        final Class56 class85 = new Class56();
        class85.field506 = method434;
        class85.field512 = method434.field2715;
        class85.field514 = Class69.field1009 + 1;
        Client.field638.method4073(class85);
        return 1;
    }
}
