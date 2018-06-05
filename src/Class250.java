import java.util.zip.CRC32;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ia")
public class Class250
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lfd;")
    public static Class157 field3200;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1110937007)
    public static int field3197;
    @ObfuscatedName("s")
    @ObfuscatedGetter(longValue = -5739275915681687991L)
    public static long field3203;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgx;")
    public static Class202 field3212;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -1165925)
    public static int field3211;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lgx;")
    public static Class202 field3199;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1214867787)
    public static int field3198;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Lgo;")
    public static Class194 field3202;
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "Lgx;")
    static Class202 field3204;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 351524551)
    public static int field3205;
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "Lgx;")
    public static Class202 field3206;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -887226239)
    public static int field3207;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Lig;")
    public static Class246 field3208;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "Lgk;")
    public static Class182 field3209;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = 2092860897)
    public static int field3210;
    @ObfuscatedName("o")
    public static CRC32 field3196;
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "[Lic;")
    public static Class249[] field3201;
    @ObfuscatedName("j")
    public static byte field3213;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 42575595)
    public static int field3214;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -1264842351)
    public static int field3215;
    
    static {
        Class250.field3197 = 0;
        Class250.field3212 = new Class202(4096);
        Class250.field3211 = 0;
        Class250.field3199 = new Class202(32);
        Class250.field3198 = 0;
        Class250.field3202 = new Class194();
        Class250.field3204 = new Class202(4096);
        Class250.field3205 = 0;
        Class250.field3206 = new Class202(4096);
        Class250.field3207 = 0;
        Class250.field3209 = new Class182(8);
        Class250.field3210 = 0;
        Class250.field3196 = new CRC32();
        Class250.field3201 = new Class249[256];
        Class250.field3213 = 0;
        Class250.field3214 = 0;
        Class250.field3215 = 0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;Lir;Lir;I)V", garbageValue = "1897264020")
    public static void method4766(final Class247 field3367, final Class247 field3368, final Class247 field3369) {
        Class267.field3367 = field3367;
        Class267.field3348 = field3368;
        Class139.field1877 = field3369;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(CI)C", garbageValue = "-365895890")
    public static char method4770(final char c) {
        switch (c) {
            default: {
                return Character.toLowerCase(c);
            }
            case '\u00cd':
            case '\u00ce':
            case '\u00cf':
            case '\u00ed':
            case '\u00ee':
            case '\u00ef': {
                return 'i';
            }
            case '\u00ff':
            case '\u0178': {
                return 'y';
            }
            case '\u00df': {
                return 'b';
            }
            case '\u00d9':
            case '\u00da':
            case '\u00db':
            case '\u00dc':
            case '\u00f9':
            case '\u00fa':
            case '\u00fb':
            case '\u00fc': {
                return 'u';
            }
            case '\u00d2':
            case '\u00d3':
            case '\u00d4':
            case '\u00d5':
            case '\u00d6':
            case '\u00f2':
            case '\u00f3':
            case '\u00f4':
            case '\u00f5':
            case '\u00f6': {
                return 'o';
            }
            case '\u00d1':
            case '\u00f1': {
                return 'n';
            }
            case '\u00c0':
            case '\u00c1':
            case '\u00c2':
            case '\u00c3':
            case '\u00c4':
            case '\u00e0':
            case '\u00e1':
            case '\u00e2':
            case '\u00e3':
            case '\u00e4': {
                return 'a';
            }
            case '\u00c8':
            case '\u00c9':
            case '\u00ca':
            case '\u00cb':
            case '\u00e8':
            case '\u00e9':
            case '\u00ea':
            case '\u00eb': {
                return 'e';
            }
            case '\u00c7':
            case '\u00e7': {
                return 'c';
            }
            case ' ':
            case '-':
            case '_':
            case ' ': {
                return '_';
            }
            case '#':
            case '[':
            case ']': {
                return c;
            }
        }
    }
}
