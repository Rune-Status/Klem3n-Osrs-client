import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ec")
public class Class139 extends Class283
{
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lir;")
    static Class247 field1877;
    @ObfuscatedName("z")
    final boolean field1881;
    
    public Class139(final boolean field1881) {
        this.field1881 = field1881;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkz;Lkz;B)I", garbageValue = "58")
    int method3139(final Class287 class287, final Class287 class288) {
        if (Client.field581 == class287.field3628) {
            if (class288.field3628 != Client.field581) {
                return this.field1881 ? -1 : 1;
            }
        }
        else if (class288.field3628 == Client.field581) {
            return this.field1881 ? 1 : -1;
        }
        return this.method5308(class287, class288);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method3139((Class287)o, (Class287)o2);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "-1945605014")
    static int method3143(final int n, final int n2) {
        final Class53 class53 = (Class53)Class53.field474.method4020(n);
        if (class53 == null) {
            return 0;
        }
        if (n2 == -1) {
            return 0;
        }
        int n3 = 0;
        for (int i = 0; i < class53.field473.length; ++i) {
            if (class53.field477[i] == n2) {
                n3 += class53.field473[i];
            }
        }
        return n3;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(CIB)I", garbageValue = "125")
    static int method3145(final char c, final int n) {
        char c2 = (char)(c << 4);
        if (Character.isUpperCase(c) || Character.isTitleCase(c)) {
            c2 = (char)((Character.toLowerCase(c) << 4) + '\u0001');
        }
        return c2;
    }
    
    @ObfuscatedName("kf")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "497607232")
    static String method3138(String substring) {
        final Class242[] method216 = Class20.method216();
        for (int i = 0; i < method216.length; ++i) {
            final Class242 class242 = method216[i];
            if (class242.field3128 != -1 && substring.startsWith("<img=" + class242.field3128 + ">")) {
                substring = substring.substring(6 + Integer.toString(class242.field3128).length());
                break;
            }
        }
        return substring;
    }
}
