import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bp")
public class Class53 extends Class204
{
    @ObfuscatedName("ri")
    @ObfuscatedSignature(signature = "Llw;")
    static Class321 field476;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgx;")
    static Class202 field474;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lly;")
    static Class317 field472;
    @ObfuscatedName("w")
    int[] field477;
    @ObfuscatedName("s")
    int[] field473;
    
    static {
        Class53.field474 = new Class202(32);
    }
    
    Class53() {
        this.field477 = new int[] { -1 };
        this.field473 = new int[] { 0 };
    }
    
    @ObfuscatedName("fa")
    @ObfuscatedSignature(signature = "(IZZZB)Lic;", garbageValue = "95")
    static Class249 method1009(final int n, final boolean b, final boolean b2, final boolean b3) {
        Class162 class162 = null;
        if (Class155.field1969 != null) {
            class162 = new Class162(n, Class155.field1969, Class76.field1068[n], 1000000);
        }
        return new Class249(class162, Class34.field302, n, b, b2, b3);
    }
    
    @ObfuscatedName("jc")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1595845951")
    static final void method1012() {
        for (int i = 0; i < Class81.field1167; ++i) {
            Client.field610[Class81.field1159[i]].method1084();
        }
        Class37.method640();
        if (Class14.field94 != null) {
            Class14.field94.method5467();
        }
    }
}
