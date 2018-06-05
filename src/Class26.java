import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("af")
public class Class26
{
    @ObfuscatedName("bg")
    static String field219;
    @ObfuscatedName("by")
    @ObfuscatedSignature(signature = "Lbq;")
    static Class57 field220;
    @ObfuscatedName("dc")
    @ObfuscatedGetter(intValue = 1566983967)
    static int field223;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lfi;Lgs;I)Lfn;", garbageValue = "-1221349687")
    public static Class172 method433(final Class169 field2254, final Class190 class190) {
        Class172 class191;
        if (Class172.field2258 == 0) {
            class191 = new Class172();
        }
        else {
            class191 = Class172.field2256[--Class172.field2258];
        }
        final Class172 class192 = class191;
        class192.field2254 = field2254;
        class192.field2253 = field2254.field2177;
        if (class192.field2253 == -1) {
            class192.field2257 = new Class189(260);
        }
        else if (class192.field2253 == -2) {
            class192.field2257 = new Class189(10000);
        }
        else if (class192.field2253 <= 18) {
            class192.field2257 = new Class189(20);
        }
        else if (class192.field2253 <= 98) {
            class192.field2257 = new Class189(100);
        }
        else {
            class192.field2257 = new Class189(260);
        }
        class192.field2257.method3838(class190);
        class192.field2257.method3819(class192.field2254.field2233);
        class192.field2255 = 0;
        return class192;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Lhi;", garbageValue = "-49")
    public static Class230 method434(final int n) {
        final int n2 = n >> 16;
        final int n3 = n & 0xFFFF;
        if ((Class42.field366[n2] == null || Class42.field366[n2][n3] == null) && !Class261.method4931(n2)) {
            return null;
        }
        return Class42.field366[n2][n3];
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1481626830")
    public static void method427(final int field37) {
        Class217.field2460 = 1;
        Class138.field1871 = null;
        Class217.field2461 = -1;
        Class217.field2462 = -1;
        Class309.field3740 = 0;
        Class217.field2463 = false;
        Class6.field37 = field37;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(Lbb;Lbb;IZB)I", garbageValue = "30")
    static int method428(final Class65 class65, final Class65 class66, final int n, final boolean b) {
        if (n == 1) {
            int field955 = class65.field955;
            int field956 = class66.field955;
            if (!b) {
                if (field955 == -1) {
                    field955 = 2001;
                }
                if (field956 == -1) {
                    field956 = 2001;
                }
            }
            return field955 - field956;
        }
        if (n == 2) {
            return class65.field952 - class66.field952;
        }
        if (n == 3) {
            if (class65.field951.equals("-")) {
                if (class66.field951.equals("-")) {
                    return 0;
                }
                return b ? -1 : 1;
            }
            else {
                if (class66.field951.equals("-")) {
                    return b ? 1 : -1;
                }
                return class65.field951.compareTo(class66.field951);
            }
        }
        else {
            if (n == 4) {
                return class65.method1569() ? (class66.method1569() ? 0 : 1) : (class66.method1569() ? -1 : 0);
            }
            if (n == 5) {
                return class65.method1567() ? (class66.method1567() ? 0 : 1) : (class66.method1567() ? -1 : 0);
            }
            if (n == 6) {
                return class65.method1568() ? (class66.method1568() ? 0 : 1) : (class66.method1568() ? -1 : 0);
            }
            if (n == 7) {
                return class65.method1589() ? (class66.method1589() ? 0 : 1) : (class66.method1589() ? -1 : 0);
            }
            return class65.field947 - class66.field947;
        }
    }
}
