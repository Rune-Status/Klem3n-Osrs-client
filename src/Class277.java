import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jw")
public class Class277
{
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;B)I", garbageValue = "1")
    public static int method5240(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            n = (n << 5) - n + Class166.method3441(charSequence.charAt(i));
        }
        return n;
    }
}
