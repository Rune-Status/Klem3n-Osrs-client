import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ObfuscatedName("fn")
public class Class172 extends Class204
{
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "[Lfn;")
    static Class172[] field2256;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 2054951839)
    static int field2258;
    @ObfuscatedName("i")
    static int[] field2260;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lfi;")
    Class169 field2254;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 9187127)
    int field2253;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgi;")
    public Class189 field2257;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -590159423)
    public int field2255;
    
    static {
        Class172.field2256 = new Class172[300];
        Class172.field2258 = 0;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1433475815")
    public void method3460() {
        if (Class172.field2258 >= Class172.field2256.length) {
            return;
        }
        Class172.field2256[++Class172.field2258 - 1] = this;
    }
    
    @ObfuscatedName("z")
    public static String method3457(long n) {
        if (n <= 0L || n >= 6582952005840035281L) {
            return null;
        }
        if (n % 37L == 0L) {
            return null;
        }
        int n2 = 0;
        for (long n3 = n; n3 != 0L; n3 /= 37L) {
            ++n2;
        }
        final StringBuilder sb = new StringBuilder(n2);
        while (n != 0L) {
            final long n4 = n;
            n /= 37L;
            char c = Class303.field3720[(int)(n4 - n * 37L)];
            if (c == '_') {
                final int n5 = sb.length() - 1;
                sb.setCharAt(n5, Character.toUpperCase(sb.charAt(n5)));
                c = ' ';
            }
            sb.append(c);
        }
        sb.reverse();
        sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
        return sb.toString();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lll;IIII)V", garbageValue = "-1222974971")
    static void method3458(final Class318 class318, final int n, final int n2, final int n3) {
        Class23.field188.method3998(class318, RunException.method716(n, n2, n3), class318.field3791.length * 4);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-101")
    static void method3456() {
        Class83.field1180.clear();
        Class83.field1181.method3951();
        Class83.field1184.method4168();
        Class83.field1186 = 0;
    }
}
