import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kc")
public class Class295
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3678;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3672;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3668;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3673;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3670;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lkc;")
    public static final Class295 field3669;
    @ObfuscatedName("fa")
    static int[] field3676;
    @ObfuscatedName("k")
    final String field3671;
    @ObfuscatedName("i")
    String field3666;
    
    static {
        field3678 = new Class295("PLAIN11", "p11_full");
        field3672 = new Class295("PLAIN12", "p12_full");
        field3668 = new Class295("BOLD12", "b12_full");
        field3673 = new Class295("VERDANA11", "verdana_11pt_regular");
        field3670 = new Class295("VERDANA13", "verdana_13pt_regular");
        field3669 = new Class295("VERDANA15", "verdana_15pt_regular");
    }
    
    Class295(final String field3671, final String field3672) {
        this.field3671 = field3671;
        this.field3666 = field3672;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[Lkc;", garbageValue = "106")
    public static Class295[] method5498() {
        return new Class295[] { Class295.field3673, Class295.field3668, Class295.field3678, Class295.field3672, Class295.field3670, Class295.field3669 };
    }
    
    @ObfuscatedName("fs")
    @ObfuscatedSignature(signature = "(Lba;I)V", garbageValue = "1542414635")
    static final void method5502(final Class63 class63) {
        class63.field873 = false;
        if (class63.field900 != -1) {
            final Class273 method25 = Class3.method25(class63.field900);
            if (method25 != null && method25.field3540 != null) {
                ++class63.field902;
                if (class63.field908 < method25.field3540.length && class63.field902 > method25.field3541[class63.field908]) {
                    class63.field902 = 1;
                    Class173.method3471(method25, ++class63.field908, class63.field931, class63.field881);
                }
                if (class63.field908 >= method25.field3540.length) {
                    class63.field902 = 0;
                    Class173.method3471(method25, class63.field908 = 0, class63.field931, class63.field881);
                }
            }
            else {
                class63.field900 = -1;
            }
        }
        if (class63.field891 != -1 && Client.field591 >= class63.field911) {
            if (class63.field876 < 0) {
                class63.field876 = 0;
            }
            final int field3271 = Class57.method1035(class63.field891).field3271;
            if (field3271 != -1) {
                final Class273 method26 = Class3.method25(field3271);
                if (method26 != null && method26.field3540 != null) {
                    ++class63.field910;
                    if (class63.field876 < method26.field3540.length && class63.field910 > method26.field3541[class63.field876]) {
                        class63.field910 = 1;
                        Class173.method3471(method26, ++class63.field876, class63.field931, class63.field881);
                    }
                    if (class63.field876 >= method26.field3540.length && (class63.field876 < 0 || class63.field876 >= method26.field3540.length)) {
                        class63.field891 = -1;
                    }
                }
                else {
                    class63.field891 = -1;
                }
            }
            else {
                class63.field891 = -1;
            }
        }
        if (class63.field903 != -1 && class63.field906 <= 1 && Class3.method25(class63.field903).field3551 == 1 && class63.field930 > 0 && class63.field917 <= Client.field591 && class63.field918 < Client.field591) {
            class63.field906 = 1;
            return;
        }
        if (class63.field903 != -1 && class63.field906 == 0) {
            final Class273 method27 = Class3.method25(class63.field903);
            if (method27 != null && method27.field3540 != null) {
                ++class63.field901;
                if (class63.field904 < method27.field3540.length && class63.field901 > method27.field3541[class63.field904]) {
                    class63.field901 = 1;
                    Class173.method3471(method27, ++class63.field904, class63.field931, class63.field881);
                }
                if (class63.field904 >= method27.field3540.length) {
                    class63.field904 -= method27.field3544;
                    ++class63.field907;
                    if (class63.field907 >= method27.field3550) {
                        class63.field903 = -1;
                    }
                    else if (class63.field904 < 0 || class63.field904 >= method27.field3540.length) {
                        class63.field903 = -1;
                    }
                    else {
                        Class173.method3471(method27, class63.field904, class63.field931, class63.field881);
                    }
                }
                class63.field873 = method27.field3546;
            }
            else {
                class63.field903 = -1;
            }
        }
        if (class63.field906 > 0) {
            --class63.field906;
        }
    }
    
    @ObfuscatedName("jl")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "911738943")
    static void method5501() {
        for (Class55 class55 = (Class55)Client.field741.method4018(); class55 != null; class55 = (Class55)Client.field741.method4019()) {
            final int field501 = class55.field501;
            if (Class261.method4931(field501)) {
                boolean field502 = true;
                final Class230[] array = Class42.field366[field501];
                for (int i = 0; i < array.length; ++i) {
                    if (array[i] != null) {
                        field502 = array[i].field2604;
                        break;
                    }
                }
                if (!field502) {
                    final Class230 method434 = Class26.method434((int)class55.field2421);
                    if (method434 != null) {
                        Class60.method1114(method434);
                    }
                }
            }
        }
    }
}
