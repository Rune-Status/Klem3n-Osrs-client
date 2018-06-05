import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ha")
public class Class226
{
    @ObfuscatedName("fj")
    @ObfuscatedGetter(intValue = 1986316761)
    static int field2568;
    @ObfuscatedName("gi")
    @ObfuscatedGetter(intValue = -1575232807)
    static int field2563;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 208134387)
    public int field2567;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 44298731)
    public int field2564;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -187382705)
    public int field2565;
    
    public Class226(final Class226 class226) {
        this.field2567 = class226.field2567;
        this.field2564 = class226.field2564;
        this.field2565 = class226.field2565;
    }
    
    public Class226(final int field2567, final int field2568, final int field2569) {
        this.field2567 = field2567;
        this.field2564 = field2568;
        this.field2565 = field2569;
    }
    
    public Class226() {
        this.field2567 = -1;
    }
    
    public Class226(final int n) {
        if (n == -1) {
            this.field2567 = -1;
        }
        else {
            this.field2567 = (n >> 28 & 0x3);
            this.field2564 = (n >> 14 & 0x3FFF);
            this.field2565 = (n & 0x3FFF);
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "-2113986105")
    public void method4436(final int field2567, final int field2568, final int field2569) {
        this.field2567 = field2567;
        this.field2564 = field2568;
        this.field2565 = field2569;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1904396734")
    public int method4437() {
        return this.field2567 << 28 | this.field2564 << 14 | this.field2565;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lha;I)Z", garbageValue = "-1097701365")
    boolean method4439(final Class226 class226) {
        return this.field2567 == class226.field2567 && this.field2564 == class226.field2564 && this.field2565 == class226.field2565;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = "-1171766630")
    String method4441(final String s) {
        return this.field2567 + s + (this.field2564 >> 6) + s + (this.field2565 >> 6) + s + (this.field2564 & 0x3F) + s + (this.field2565 & 0x3F);
    }
    
    @Override
    public int hashCode() {
        return this.method4437();
    }
    
    @Override
    public String toString() {
        return this.method4441(",");
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class226 && this.method4439((Class226)o));
    }
}
