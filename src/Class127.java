import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("df")
public abstract class Class127 extends Class206
{
    @ObfuscatedName("cg")
    @ObfuscatedGetter(intValue = 762597167)
    public int field1781;
    
    protected Class127() {
        this.field1781 = 1000;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    protected Class119 vmethod3067() {
        return null;
    }
    
    @ObfuscatedName("cx")
    void vmethod3063(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9) {
        final Class119 vmethod3067 = this.vmethod3067();
        if (vmethod3067 != null) {
            this.field1781 = vmethod3067.field1781;
            vmethod3067.vmethod3063(n, n2, n3, n4, n5, n6, n7, n8, n9);
        }
    }
}
