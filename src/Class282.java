import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jx")
public class Class282 implements Comparable
{
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lkm;")
    Class291 field3610;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lkm;")
    Class291 field3611;
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(I)Lkm;", garbageValue = "-1680166277")
    public Class291 method5287() {
        return this.field3610;
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(B)Ljava/lang/String;", garbageValue = "109")
    public String method5288() {
        if (this.field3610 == null) {
            return "";
        }
        return this.field3610.method5447();
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(B)Ljava/lang/String;", garbageValue = "-92")
    public String method5289() {
        if (this.field3611 == null) {
            return "";
        }
        return this.field3611.method5447();
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(Lkm;Lkm;I)V", garbageValue = "224434676")
    void method5290(final Class291 field3610, final Class291 field3611) {
        if (field3610 == null) {
            throw new NullPointerException();
        }
        this.field3610 = field3610;
        this.field3611 = field3611;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(Ljx;B)I", garbageValue = "97")
    public int vmethod5453(final Class282 class282) {
        return this.field3610.method5435(class282.field3610);
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.vmethod5453((Class282)o);
    }
}
