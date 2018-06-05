import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cn")
public class Class98
{
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 866276291)
    static int field1335;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field1334;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field1331;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgx;")
    Class202 field1332;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgx;")
    Class202 field1333;
    
    public Class98(final Class247 field1334, final Class247 field1335) {
        this.field1332 = new Class202(256);
        this.field1333 = new Class202(256);
        this.field1334 = field1334;
        this.field1331 = field1335;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II[IB)Lct;", garbageValue = "0")
    Class93 method2223(final int n, final int n2, final int[] array) {
        final long n3 = (n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16;
        final Class93 class93 = (Class93)this.field1333.method4020(n3);
        if (class93 != null) {
            return class93;
        }
        if (array != null && array[0] <= 0) {
            return null;
        }
        final Class91 method2071 = Class91.method2071(this.field1334, n, n2);
        if (method2071 == null) {
            return null;
        }
        final Class93 method2072 = method2071.method2069();
        this.field1333.method4016(method2072, n3);
        if (array != null) {
            final int n4 = 0;
            array[n4] -= method2072.field1278.length;
        }
        return method2072;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II[II)Lct;", garbageValue = "70852076")
    Class93 method2218(final int n, final int n2, final int[] array) {
        final long n3 = ((n2 ^ ((n << 4 & 0xFFFF) | n >>> 12)) | n << 16) ^ 0x100000000L;
        final Class93 class93 = (Class93)this.field1333.method4020(n3);
        if (class93 != null) {
            return class93;
        }
        if (array != null && array[0] <= 0) {
            return null;
        }
        Class92 method2088 = (Class92)this.field1332.method4020(n3);
        if (method2088 == null) {
            method2088 = Class92.method2088(this.field1331, n, n2);
            if (method2088 == null) {
                return null;
            }
            this.field1332.method4016(method2088, n3);
        }
        final Class93 method2089 = method2088.method2083(array);
        if (method2089 == null) {
            return null;
        }
        method2088.method4064();
        this.field1333.method4016(method2089, n3);
        return method2089;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I[II)Lct;", garbageValue = "2090805346")
    public Class93 method2216(final int n, final int[] array) {
        if (this.field1334.method4637() == 1) {
            return this.method2223(0, n, array);
        }
        if (this.field1334.method4636(n) == 1) {
            return this.method2223(n, 0, array);
        }
        throw new RuntimeException();
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I[II)Lct;", garbageValue = "1187754020")
    public Class93 method2220(final int n, final int[] array) {
        if (this.field1331.method4637() == 1) {
            return this.method2218(0, n, array);
        }
        if (this.field1331.method4636(n) == 1) {
            return this.method2218(n, 0, array);
        }
        throw new RuntimeException();
    }
}
