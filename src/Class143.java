import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ei")
public class Class143 extends Class283
{
    @ObfuscatedName("no")
    @ObfuscatedSignature(signature = "Lkb;")
    static Class307 field1899;
    @ObfuscatedName("fd")
    static int[] field1900;
    @ObfuscatedName("kl")
    @ObfuscatedSignature(signature = "Lhi;")
    static Class230 field1897;
    @ObfuscatedName("z")
    final boolean field1893;
    
    public Class143(final boolean field1893) {
        this.field1893 = field1893;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;B)I", garbageValue = "3")
    int method3165(final Class287 class287, final Class287 class288) {
        if (class288.field3628 != class287.field3628) {
            return this.field1893 ? (class287.field3628 - class288.field3628) : (class288.field3628 - class287.field3628);
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3165((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;Ljava/lang/String;B)V", garbageValue = "16")
    static void method3172(final int n, final String s, final String s2) {
        Class173.method3472(n, s, s2, null);
    }
    
    @ObfuscatedName("z")
    public static final int method3167(final double n, final double n2, final double n3) {
        double n4 = n3;
        double n5 = n3;
        double n6 = n3;
        if (0.0 != n2) {
            double n7;
            if (n3 < 0.5) {
                n7 = n3 * (n2 + 1.0);
            }
            else {
                n7 = n3 + n2 - n2 * n3;
            }
            final double n8 = 2.0 * n3 - n7;
            double n9 = n + 0.3333333333333333;
            if (n9 > 1.0) {
                --n9;
            }
            double n10 = n - 0.3333333333333333;
            if (n10 < 0.0) {
                ++n10;
            }
            if (6.0 * n9 < 1.0) {
                n4 = n8 + n9 * (6.0 * (n7 - n8));
            }
            else if (n9 * 2.0 < 1.0) {
                n4 = n7;
            }
            else if (n9 * 3.0 < 2.0) {
                n4 = n8 + 6.0 * ((0.6666666666666666 - n9) * (n7 - n8));
            }
            else {
                n4 = n8;
            }
            if (n * 6.0 < 1.0) {
                n5 = n8 + n * (6.0 * (n7 - n8));
            }
            else if (2.0 * n < 1.0) {
                n5 = n7;
            }
            else if (3.0 * n < 2.0) {
                n5 = 6.0 * ((0.6666666666666666 - n) * (n7 - n8)) + n8;
            }
            else {
                n5 = n8;
            }
            if (n10 * 6.0 < 1.0) {
                n6 = (n7 - n8) * 6.0 * n10 + n8;
            }
            else if (2.0 * n10 < 1.0) {
                n6 = n7;
            }
            else if (3.0 * n10 < 2.0) {
                n6 = (n7 - n8) * (0.6666666666666666 - n10) * 6.0 + n8;
            }
            else {
                n6 = n8;
            }
        }
        return (int)(256.0 * n6) + ((int)(n5 * 256.0) << 8) + ((int)(n4 * 256.0) << 16);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "-329911544")
    public static int method3173(int n) {
        int n2 = 0;
        if (n < 0 || n >= 65536) {
            n >>>= 16;
            n2 += 16;
        }
        if (n >= 256) {
            n >>>= 8;
            n2 += 8;
        }
        if (n >= 16) {
            n >>>= 4;
            n2 += 4;
        }
        if (n >= 4) {
            n >>>= 2;
            n2 += 2;
        }
        if (n >= 1) {
            n >>>= 1;
            ++n2;
        }
        return n + n2;
    }
}
