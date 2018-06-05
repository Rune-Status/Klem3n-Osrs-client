import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iw")
public enum Class244 implements Class188
{
    field3146("runelite", 0, "runescape", "RuneScape", 0), 
    field3141("runelite", 1, "stellardawn", "Stellar Dawn", 1), 
    field3142("runelite", 2, "game3", "Game 3", 2), 
    field3143("runelite", 3, "game4", "Game 4", 3), 
    field3140("runelite", 4, "game5", "Game 5", 4), 
    field3145("runelite", 5, "oldscape", "RuneScape 2007", 5);
    
    @ObfuscatedName("k")
    public final String field3144;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = -974844683)
    final int field3147;
    
    Class244(final String s, final int n, final String field3144, final String s2, final int field3145) {
        this.field3144 = field3144;
        this.field3147 = field3145;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "59")
    @Override
    public int vmethod5815() {
        return this.field3147;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;I)[B", garbageValue = "-1251005186")
    public static byte[] method4618(final CharSequence charSequence) {
        final int length = charSequence.length();
        final byte[] array = new byte[length];
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 <= '\0' || char1 >= '\u0080') && (char1 < ' ' || char1 > '\u00ff')) {
                if (char1 == '\u20ac') {
                    array[i] = -128;
                }
                else if (char1 == '\u201a') {
                    array[i] = -126;
                }
                else if (char1 == '\u0192') {
                    array[i] = -125;
                }
                else if (char1 == '\u201e') {
                    array[i] = -124;
                }
                else if (char1 == '\u2026') {
                    array[i] = -123;
                }
                else if (char1 == '\u2020') {
                    array[i] = -122;
                }
                else if (char1 == '\u2021') {
                    array[i] = -121;
                }
                else if (char1 == '\u02c6') {
                    array[i] = -120;
                }
                else if (char1 == '\u2030') {
                    array[i] = -119;
                }
                else if (char1 == '\u0160') {
                    array[i] = -118;
                }
                else if (char1 == '\u2039') {
                    array[i] = -117;
                }
                else if (char1 == '\u0152') {
                    array[i] = -116;
                }
                else if (char1 == '\u017d') {
                    array[i] = -114;
                }
                else if (char1 == '\u2018') {
                    array[i] = -111;
                }
                else if (char1 == '\u2019') {
                    array[i] = -110;
                }
                else if (char1 == '\u201c') {
                    array[i] = -109;
                }
                else if (char1 == '\u201d') {
                    array[i] = -108;
                }
                else if (char1 == '\u2022') {
                    array[i] = -107;
                }
                else if (char1 == '\u2013') {
                    array[i] = -106;
                }
                else if (char1 == '\u2014') {
                    array[i] = -105;
                }
                else if (char1 == '\u02dc') {
                    array[i] = -104;
                }
                else if (char1 == '\u2122') {
                    array[i] = -103;
                }
                else if (char1 == '\u0161') {
                    array[i] = -102;
                }
                else if (char1 == '\u203a') {
                    array[i] = -101;
                }
                else if (char1 == '\u0153') {
                    array[i] = -100;
                }
                else if (char1 == '\u017e') {
                    array[i] = -98;
                }
                else if (char1 == '\u0178') {
                    array[i] = -97;
                }
                else {
                    array[i] = 63;
                }
            }
            else {
                array[i] = (byte)char1;
            }
        }
        return array;
    }
}
