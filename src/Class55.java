import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bj")
public class Class55 extends Class204
{
    @ObfuscatedName("rz")
    @ObfuscatedGetter(intValue = -150808717)
    static int field495;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1708585715)
    static int field497;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = -432145823)
    int field501;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1556790455)
    int field494;
    @ObfuscatedName("s")
    boolean field496;
    
    Class55() {
        this.field496 = false;
    }
    
    @ObfuscatedName("jn")
    @ObfuscatedSignature(signature = "(IIIILll;Lhv;B)V", garbageValue = "103")
    static final void method1022(final int n, final int n2, final int n3, final int n4, final Class318 class318, final Class224 class319) {
        if (class318 == null) {
            return;
        }
        final int n5 = Client.field717 & 0x7FF;
        final int n6 = n4 * n4 + n3 * n3;
        if (n6 > 6400) {
            return;
        }
        final int n7 = Class122.field1681[n5];
        final int n8 = Class122.field1693[n5];
        final int n9 = n4 * n7 + n8 * n3 >> 16;
        final int n10 = n4 * n8 - n7 * n3 >> 16;
        if (n6 > 2500) {
            class318.method5867(n9 + class319.field2553 / 2 - class318.field3796 / 2, class319.field2549 / 2 - n10 - class318.field3792 / 2, n, n2, class319.field2553, class319.field2549, class319.field2551, class319.field2550);
        }
        else {
            class318.method5851(n + n9 + class319.field2553 / 2 - class318.field3796 / 2, class319.field2549 / 2 + n2 - n10 - class318.field3792 / 2);
        }
    }
}
