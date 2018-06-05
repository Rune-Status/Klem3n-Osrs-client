import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import net.runelite.mapping.ObfuscatedSignature;
import java.util.Comparator;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("w")
public class Class1
{
    @ObfuscatedName("mt")
    @ObfuscatedGetter(intValue = -1202584647)
    static int field15;
    @ObfuscatedName("w")
    public static Comparator field9;
    @ObfuscatedName("s")
    public static Comparator field13;
    @ObfuscatedName("l")
    public static Comparator field11;
    @ObfuscatedName("u")
    public static Comparator field16;
    @ObfuscatedName("ea")
    @ObfuscatedSignature(signature = "Lkv;")
    static Class296 field14;
    @ObfuscatedName("z")
    public final List field10;
    
    static {
        Class1.field9 = new Class7();
        new Class0();
        Class1.field13 = new Class5();
        Class1.field11 = new Class6();
        Class1.field16 = new Class3();
    }
    
    public Class1(final Class182 class182, final boolean b) {
        final int method3550 = class182.method3550();
        byte b2;
        if (class182.method3544() == 1) {
            b2 = 1;
        }
        else {
            b2 = 0;
        }
        final int method3551 = class182.method3550();
        this.field10 = new ArrayList(method3551);
        for (int i = 0; i < method3551; ++i) {
            this.field10.add(new Class2(class182, b2, method3550));
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/util/Comparator;ZB)V", garbageValue = "48")
    public void method9(final Comparator comparator, final boolean b) {
        if (b) {
            Collections.sort((List<Object>)this.field10, comparator);
        }
        else {
            Collections.sort((List<Object>)this.field10, (Comparator<? super Object>)Collections.reverseOrder((Comparator<? super Class1>)comparator));
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "319934987")
    public static final boolean method8() {
        synchronized (Class39.field337) {
            if (Class39.field352 == Class39.field350) {
                return false;
            }
            Class163.field2016 = Class39.field348[Class39.field350];
            Class39.field342 = Class39.field346[Class39.field350];
            Class39.field350 = (Class39.field350 + 1 & 0x7F);
            return true;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Ljv;", garbageValue = "1")
    public static Class272 method15(final int n) {
        final Class272 class272 = (Class272)Class272.field3524.method3989(n);
        if (class272 != null) {
            return class272;
        }
        final byte[] method4625 = Class272.field3529.method4625(4, n);
        final Class272 class273 = new Class272();
        if (method4625 != null) {
            class273.method5194(new Class182(method4625), n);
        }
        class273.method5195();
        Class272.field3524.method3983(class273, n);
        return class273;
    }
    
    @ObfuscatedName("il")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Lhi;I)Ljava/lang/String;", garbageValue = "1244240994")
    static String method11(String string, final Class230 class230) {
        if (string.indexOf("%") != -1) {
            for (int i = 1; i <= 5; ++i) {
                while (true) {
                    final int index = string.indexOf("%" + i);
                    if (index == -1) {
                        break;
                    }
                    final String substring = string.substring(0, index);
                    final int method3119 = Class137.method3119(class230, i - 1);
                    String string2;
                    if (method3119 < 999999999) {
                        string2 = Integer.toString(method3119);
                    }
                    else {
                        string2 = "*";
                    }
                    string = substring + string2 + string.substring(index + 2);
                }
            }
        }
        return string;
    }
    
    @ObfuscatedName("js")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1214880142")
    static final void method13() {
        Client.field828 = Client.field801;
        Class54.field489 = true;
    }
}
