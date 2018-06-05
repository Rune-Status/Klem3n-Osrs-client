import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kh")
public class Class304
{
    @ObfuscatedName("z")
    public static char[] field3722;
    @ObfuscatedName("w")
    static char[] field3723;
    @ObfuscatedName("s")
    static int[] field3724;
    
    static {
        Class304.field3722 = new char[64];
        for (int i = 0; i < 26; ++i) {
            Class304.field3722[i] = (char)(i + 65);
        }
        for (int j = 26; j < 52; ++j) {
            Class304.field3722[j] = (char)(j + 97 - 26);
        }
        for (int k = 52; k < 62; ++k) {
            Class304.field3722[k] = (char)(k + 48 - 52);
        }
        Class304.field3722[62] = '+';
        Class304.field3722[63] = '/';
        Class304.field3723 = new char[64];
        for (int l = 0; l < 26; ++l) {
            Class304.field3723[l] = (char)(l + 65);
        }
        for (int n = 26; n < 52; ++n) {
            Class304.field3723[n] = (char)(n + 97 - 26);
        }
        for (int n2 = 52; n2 < 62; ++n2) {
            Class304.field3723[n2] = (char)(n2 + 48 - 52);
        }
        Class304.field3723[62] = '*';
        Class304.field3723[63] = '-';
        Class304.field3724 = new int[128];
        for (int n3 = 0; n3 < Class304.field3724.length; ++n3) {
            Class304.field3724[n3] = -1;
        }
        for (int n4 = 65; n4 <= 90; ++n4) {
            Class304.field3724[n4] = n4 - 65;
        }
        for (int n5 = 97; n5 <= 122; ++n5) {
            Class304.field3724[n5] = n5 - 97 + 26;
        }
        for (int n6 = 48; n6 <= 57; ++n6) {
            Class304.field3724[n6] = n6 - 48 + 52;
        }
        Class304.field3724[42] = (Class304.field3724[43] = 62);
        Class304.field3724[45] = (Class304.field3724[47] = 63);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;S)Ljava/lang/String;", garbageValue = "-7958")
    public static String method5634(final CharSequence charSequence) {
        final int length = charSequence.length();
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            final char char1 = charSequence.charAt(i);
            if ((char1 < 'a' || char1 > 'z') && ((char1 < 'A' || char1 > 'Z') && (char1 < '0' || char1 > '9') && char1 != '.' && char1 != '-' && char1 != '*' && char1 != '_')) {
                if (char1 == ' ') {
                    sb.append('+');
                }
                else {
                    final byte method3441 = Class166.method3441(char1);
                    sb.append('%');
                    final int n = method3441 >> 4 & 0xF;
                    if (n >= 10) {
                        sb.append((char)(n + 55));
                    }
                    else {
                        sb.append((char)(n + 48));
                    }
                    final byte b = (byte)(method3441 & 0xF);
                    if (b >= 10) {
                        sb.append((char)(b + 55));
                    }
                    else {
                        sb.append((char)(b + 48));
                    }
                }
            }
            else {
                sb.append(char1);
            }
        }
        return sb.toString();
    }
    
    @ObfuscatedName("in")
    @ObfuscatedSignature(signature = "([Lhi;IIIZB)V", garbageValue = "-81")
    static void method5635(final Class230[] array, final int n, final int n2, final int n3, final boolean b) {
        for (int i = 0; i < array.length; ++i) {
            final Class230 class230 = array[i];
            if (class230 != null) {
                if (class230.field2605 == n) {
                    Class64.method1563(class230, n2, n3, b);
                    Class22.method281(class230, n2, n3);
                    if (class230.field2626 > class230.field2628 - class230.field2675) {
                        class230.field2626 = class230.field2628 - class230.field2675;
                    }
                    if (class230.field2626 < 0) {
                        class230.field2626 = 0;
                    }
                    if (class230.field2663 > class230.field2629 - class230.field2621) {
                        class230.field2663 = class230.field2629 - class230.field2621;
                    }
                    if (class230.field2663 < 0) {
                        class230.field2663 = 0;
                    }
                    if (class230.field2721 == 0) {
                        Class163.method3388(array, class230, b);
                    }
                }
            }
        }
    }
}
