import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("id")
public class Class243
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lid;")
    static final Class243 field3131;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lid;")
    static final Class243 field3132;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lid;")
    static final Class243 field3136;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lid;")
    static final Class243 field3134;
    @ObfuscatedName("f")
    static int[] field3137;
    @ObfuscatedName("c")
    @ObfuscatedGetter(intValue = -848859815)
    public static int field3138;
    @ObfuscatedName("fs")
    @ObfuscatedSignature(signature = "[Lly;")
    static Class317[] field3139;
    @ObfuscatedName("u")
    public final String field3135;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -2135504665)
    final int field3133;
    
    static {
        field3131 = new Class243("LIVE", 0);
        field3132 = new Class243("BUILDLIVE", 3);
        field3136 = new Class243("RC", 1);
        field3134 = new Class243("WIP", 2);
    }
    
    Class243(final String field3135, final int field3136) {
        this.field3135 = field3135;
        this.field3133 = field3136;
    }
    
    @ObfuscatedName("ik")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;IIIIZB)V", garbageValue = "-15")
    static final void method4612(final String s, final String s2, final int n, final int n2, final int n3, final int n4, final boolean b) {
        if (Client.field716) {
            return;
        }
        if (Client.field771 < 500) {
            Client.field735[Client.field771] = s;
            Client.field740[Client.field771] = s2;
            Client.field720[Client.field771] = n;
            Client.field794[Client.field771] = n2;
            Client.field718[Client.field771] = n3;
            Client.field851[Client.field771] = n4;
            Client.field590[Client.field771] = b;
            ++Client.field771;
        }
    }
}
