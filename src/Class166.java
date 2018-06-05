import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fw")
public abstract class Class166
{
    @ObfuscatedName("ba")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field2047;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 272064631)
    public int field2043;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 356397509)
    public int field2048;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1693431647)
    public int field2042;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1351347947)
    public int field2045;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIILfk;B)Z", garbageValue = "27")
    protected abstract boolean vmethod3440(final int p0, final int p1, final int p2, final Class164 p3);
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(CI)B", garbageValue = "177794495")
    public static byte method3441(final char c) {
        byte b;
        if ((c <= '\0' || c >= '\u0080') && (c < ' ' || c > '\u00ff')) {
            if (c == '\u20ac') {
                b = -128;
            }
            else if (c == '\u201a') {
                b = -126;
            }
            else if (c == '\u0192') {
                b = -125;
            }
            else if (c == '\u201e') {
                b = -124;
            }
            else if (c == '\u2026') {
                b = -123;
            }
            else if (c == '\u2020') {
                b = -122;
            }
            else if (c == '\u2021') {
                b = -121;
            }
            else if (c == '\u02c6') {
                b = -120;
            }
            else if (c == '\u2030') {
                b = -119;
            }
            else if (c == '\u0160') {
                b = -118;
            }
            else if (c == '\u2039') {
                b = -117;
            }
            else if (c == '\u0152') {
                b = -116;
            }
            else if (c == '\u017d') {
                b = -114;
            }
            else if (c == '\u2018') {
                b = -111;
            }
            else if (c == '\u2019') {
                b = -110;
            }
            else if (c == '\u201c') {
                b = -109;
            }
            else if (c == '\u201d') {
                b = -108;
            }
            else if (c == '\u2022') {
                b = -107;
            }
            else if (c == '\u2013') {
                b = -106;
            }
            else if (c == '\u2014') {
                b = -105;
            }
            else if (c == '\u02dc') {
                b = -104;
            }
            else if (c == '\u2122') {
                b = -103;
            }
            else if (c == '\u0161') {
                b = -102;
            }
            else if (c == '\u203a') {
                b = -101;
            }
            else if (c == '\u0153') {
                b = -100;
            }
            else if (c == '\u017e') {
                b = -98;
            }
            else if (c == '\u0178') {
                b = -97;
            }
            else {
                b = 63;
            }
        }
        else {
            b = (byte)c;
        }
        return b;
    }
}
