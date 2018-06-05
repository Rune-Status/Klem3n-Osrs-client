import net.runelite.mapping.ObfuscatedSignature;
import java.io.File;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ef")
public class Class155
{
    @ObfuscatedName("l")
    static File field1964;
    @ObfuscatedName("u")
    static File field1966;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "Ldy;")
    public static Class109 field1968;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Ldy;")
    public static Class109 field1969;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Ldy;")
    public static Class109 field1970;
    @ObfuscatedName("r")
    static String[] field1965;
    
    static {
        Class155.field1968 = null;
        Class155.field1969 = null;
        Class155.field1970 = null;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;II)I", garbageValue = "75346420")
    public static int method3269(final CharSequence charSequence, final CharSequence charSequence2, final int n) {
        final int length = charSequence.length();
        final int length2 = charSequence2.length();
        char c = '\0';
        char c2 = '\0';
        char c3 = '\0';
        char c4 = '\0';
        while (c - c3 < length || c2 - c4 < length2) {
            if (c - c3 >= length) {
                return -1;
            }
            if (c2 - c4 >= length2) {
                return 1;
            }
            char char1;
            if (c3 != '\0') {
                char1 = c3;
            }
            else {
                char1 = charSequence.charAt(c++);
            }
            char char2;
            if (c4 != '\0') {
                char2 = c4;
            }
            else {
                char2 = charSequence2.charAt(c2++);
            }
            char c5;
            if (char1 == '\u00c6') {
                c5 = 'E';
            }
            else if (char1 == '\u00e6') {
                c5 = 'e';
            }
            else if (char1 == '\u00df') {
                c5 = 's';
            }
            else if (char1 == '\u0152') {
                c5 = 'E';
            }
            else if (char1 == '\u0153') {
                c5 = 'e';
            }
            else {
                c5 = '\0';
            }
            c3 = c5;
            char c6;
            if (char2 == '\u00c6') {
                c6 = 'E';
            }
            else if (char2 == '\u00e6') {
                c6 = 'e';
            }
            else if (char2 == '\u00df') {
                c6 = 's';
            }
            else if (char2 == '\u0152') {
                c6 = 'E';
            }
            else if (char2 == '\u0153') {
                c6 = 'e';
            }
            else {
                c6 = '\0';
            }
            c4 = c6;
            final char method169 = Class17.method169(char1, n);
            final char method170 = Class17.method169(char2, n);
            if (method169 == method170 || Character.toUpperCase(method169) == Character.toUpperCase(method170)) {
                continue;
            }
            final char lowerCase = Character.toLowerCase(method169);
            final char lowerCase2 = Character.toLowerCase(method170);
            if (lowerCase2 != lowerCase) {
                return Class139.method3145(lowerCase, n) - Class139.method3145(lowerCase2, n);
            }
        }
        final int min = Math.min(length, length2);
        for (int i = 0; i < min; ++i) {
            final int n2;
            final char char3 = charSequence.charAt(n2 = i);
            final char char4 = charSequence2.charAt(n2);
            if (char4 != char3 && Character.toUpperCase(char3) != Character.toUpperCase(char4)) {
                final char lowerCase3 = Character.toLowerCase(char3);
                final char lowerCase4 = Character.toLowerCase(char4);
                if (lowerCase4 != lowerCase3) {
                    return Class139.method3145(lowerCase3, n) - Class139.method3145(lowerCase4, n);
                }
            }
        }
        final char c7 = (char)(length - length2);
        if (c7 != '\0') {
            return c7;
        }
        for (int j = 0; j < min; ++j) {
            final char char5 = charSequence.charAt(j);
            final char char6 = charSequence2.charAt(j);
            if (char5 != char6) {
                return Class139.method3145(char5, n) - Class139.method3145(char6, n);
            }
        }
        return 0;
    }
    
    @ObfuscatedName("hi")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-927006489")
    static void method3275(final int field361, final int field362, final int field363, final int field364) {
        final Class230 method3191 = Class146.method3191(field361, field362);
        if (method3191 != null && method3191.field2734 != null) {
            final Class56 class56 = new Class56();
            class56.field506 = method3191;
            class56.field512 = method3191.field2734;
            Class68.method1696(class56);
        }
        Client.field737 = field364;
        Client.field785 = true;
        Class40.field361 = field361;
        Client.field736 = field362;
        Class63.field932 = field363;
        Class60.method1114(method3191);
    }
}
