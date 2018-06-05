import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("l")
final class Class3 implements Comparator
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ls;Ls;I)I", garbageValue = "2100734637")
    int method24(final Class2 class2, final Class2 class3) {
        return (class2.field17.field33 < class3.field17.field33) ? -1 : ((class3.field17.field33 == class2.field17.field33) ? 0 : 1);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method24((Class2)o, (Class2)o2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Ljn;", garbageValue = "1221940475")
    public static Class273 method25(final int n) {
        final Class273 class273 = (Class273)Class273.field3552.method3989(n);
        if (class273 != null) {
            return class273;
        }
        final byte[] method4625 = Class273.field3538.method4625(12, n);
        final Class273 class274 = new Class273();
        if (method4625 != null) {
            class274.method5212(new Class182(method4625));
        }
        class274.method5220();
        Class273.field3552.method3983(class274, n);
        return class274;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "-32")
    public static int method32(final int n) {
        return Class37.method662(Class120.field1647[n]);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Ljava/lang/CharSequence;I)I", garbageValue = "1737027052")
    public static int method35(final CharSequence charSequence) {
        final int length = charSequence.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            n = (n << 5) - n + charSequence.charAt(i);
        }
        return n;
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1924220675")
    public static void method34() {
        Class268.field3371.method3984();
        Class268.field3391.method3984();
        Class268.field3370.method3984();
        Class268.field3374.method3984();
    }
    
    @ObfuscatedName("fz")
    @ObfuscatedSignature(signature = "(Lba;I)V", garbageValue = "-1623829882")
    static final void method26(final Class63 class63) {
        if (class63.field924 == 0) {
            return;
        }
        if (class63.field897 != -1) {
            Class63 class64 = null;
            if (class63.field897 < 32768) {
                class64 = Client.field843[class63.field897];
            }
            else if (class63.field897 >= 32768) {
                class64 = Client.field610[class63.field897 - 32768];
            }
            if (class64 != null) {
                final int n = class63.field931 - class64.field931;
                final int n2 = class63.field881 - class64.field881;
                if (n != 0 || n2 != 0) {
                    class63.field926 = ((int)(Math.atan2(n, n2) * 325.949) & 0x7FF);
                }
            }
            else if (class63.field898) {
                class63.field897 = -1;
                class63.field898 = false;
            }
        }
        if (class63.field920 != -1 && (class63.field909 == 0 || class63.field923 > 0)) {
            class63.field926 = class63.field920;
            class63.field920 = -1;
        }
        final int n3 = class63.field926 - class63.field905 & 0x7FF;
        if (n3 == 0 && class63.field898) {
            class63.field897 = -1;
            class63.field898 = false;
        }
        if (n3 != 0) {
            ++class63.field875;
            if (n3 > 1024) {
                class63.field905 -= class63.field924;
                boolean b = true;
                if (n3 < class63.field924 || n3 > 2048 - class63.field924) {
                    class63.field905 = class63.field926;
                    b = false;
                }
                if (class63.field893 == class63.field900 && (class63.field875 > 25 || b)) {
                    if (class63.field877 != -1) {
                        class63.field900 = class63.field877;
                    }
                    else {
                        class63.field900 = class63.field899;
                    }
                }
            }
            else {
                class63.field905 += class63.field924;
                boolean b2 = true;
                if (n3 < class63.field924 || n3 > 2048 - class63.field924) {
                    class63.field905 = class63.field926;
                    b2 = false;
                }
                if (class63.field893 == class63.field900 && (class63.field875 > 25 || b2)) {
                    if (class63.field878 != -1) {
                        class63.field900 = class63.field878;
                    }
                    else {
                        class63.field900 = class63.field899;
                    }
                }
            }
            class63.field905 &= 0x7FF;
        }
        else {
            class63.field875 = 0;
        }
    }
}
