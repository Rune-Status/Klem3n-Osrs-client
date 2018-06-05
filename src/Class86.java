import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cw")
public class Class86
{
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1175004073)
    public static int field1212;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Lbh;")
    Class58[] field1209;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 177761561)
    int field1210;
    
    Class86() {
        this.field1209 = new Class58[100];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Lbh;", garbageValue = "55")
    Class58 method1964(final int n, final String s, final String s2, final String s3) {
        Class58 class58 = this.field1209[99];
        for (int i = this.field1210; i > 0; --i) {
            if (i != 100) {
                this.field1209[i] = this.field1209[i - 1];
            }
        }
        if (class58 == null) {
            class58 = new Class58(n, s, s3, s2);
        }
        else {
            class58.method4064();
            class58.method4101();
            class58.method1070(n, s, s3, s2);
        }
        this.field1209[0] = class58;
        if (this.field1210 < 100) {
            ++this.field1210;
        }
        return class58;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)Lbh;", garbageValue = "78")
    Class58 method1965(final int n) {
        if (n < 0 || n >= this.field1210) {
            return null;
        }
        return this.field1209[n];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "8454016")
    int method1976() {
        return this.field1210;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIIIIIB)I", garbageValue = "-1")
    public static int method1970(final int n, final int n2, int n3, int n4, int n5, final int n6) {
        if ((n6 & 0x1) == 0x1) {
            final int n7 = n4;
            n4 = n5;
            n5 = n7;
        }
        n3 &= 0x3;
        if (n3 == 0) {
            return n2;
        }
        if (n3 == 1) {
            return 7 - n - (n4 - 1);
        }
        if (n3 == 2) {
            return 7 - n2 - (n5 - 1);
        }
        return n;
    }
}
