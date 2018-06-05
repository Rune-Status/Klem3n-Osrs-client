import java.io.IOException;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cb")
public final class Class80 extends Class127
{
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lcn;")
    public static Class98 field1149;
    @ObfuscatedName("ck")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field1147;
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 540016053)
    int field1151;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 119742129)
    int field1148;
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        return Class111.method2563(this.field1151).method5093(this.field1148);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(S)Lbx;", garbageValue = "-27003")
    static Class66 method1859() {
        Class110 method283 = null;
        Class66 class66 = new Class66();
        try {
            method283 = Class22.method283("", Class112.field1455.field3144, false);
            final byte[] array = new byte[(int)method283.method2509()];
            int method284;
            for (int i = 0; i < array.length; i += method284) {
                method284 = method283.method2510(array, i, array.length - i);
                if (method284 == -1) {
                    throw new IOException();
                }
            }
            class66 = new Class66(new Class182(array));
        }
        catch (Exception ex) {}
        try {
            if (method283 != null) {
                method283.method2507();
            }
        }
        catch (Exception ex2) {}
        return class66;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-1165618806")
    public static void method1866(final int field417) {
        Class48.field417 = field417;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "916064134")
    public static int method1864(final int n) {
        return Class39.method673(Class120.field1647[n]);
    }
    
    @ObfuscatedName("fo")
    @ObfuscatedSignature(signature = "(Lba;B)V", garbageValue = "-41")
    static final void method1865(final Class63 class63) {
        if (class63.field918 == Client.field591 || class63.field903 == -1 || class63.field906 != 0 || class63.field901 + 1 > Class3.method25(class63.field903).field3541[class63.field904]) {
            final int n = class63.field918 - class63.field917;
            final int n2 = Client.field591 - class63.field917;
            final int n3 = class63.field913 * 128 + class63.field874 * 64;
            final int n4 = class63.field915 * 128 + class63.field874 * 64;
            final int n5 = class63.field916 * 128 + class63.field874 * 64;
            final int n6 = class63.field929 * 128 + class63.field874 * 64;
            class63.field931 = (n2 * n5 + n3 * (n - n2)) / n;
            class63.field881 = (n2 * n6 + n4 * (n - n2)) / n;
        }
        class63.field923 = 0;
        class63.field926 = class63.field919;
        class63.field905 = class63.field926;
    }
}
