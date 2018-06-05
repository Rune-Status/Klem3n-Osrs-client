import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kg")
public class Class310
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 314571957)
    public int field3746;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -107586563)
    public int field3743;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1771158899)
    public int field3747;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 2007958137)
    public int field3745;
    
    public Class310(final int n, final int n2, final int n3, final int n4) {
        this.method5679(n, n2);
        this.method5680(n3, n4);
    }
    
    public Class310(final int n, final int n2) {
        this(0, 0, n, n2);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "1588913620")
    public void method5679(final int field3746, final int field3747) {
        this.field3746 = field3746;
        this.field3743 = field3747;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-997918539")
    public void method5680(final int field3747, final int field3748) {
        this.field3747 = field3747;
        this.field3745 = field3748;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lkg;Lkg;I)V", garbageValue = "1253988141")
    public void method5681(final Class310 class310, final Class310 class311) {
        this.method5682(class310, class311);
        this.method5683(class310, class311);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Lkg;Lkg;B)V", garbageValue = "-2")
    void method5682(final Class310 class310, final Class310 class311) {
        class311.field3746 = this.field3746;
        class311.field3747 = this.field3747;
        if (this.field3746 < class310.field3746) {
            class311.field3747 -= class310.field3746 - this.field3746;
            class311.field3746 = class310.field3746;
        }
        if (class311.method5684() > class310.method5684()) {
            class311.field3747 -= class311.method5684() - class310.method5684();
        }
        if (class311.field3747 < 0) {
            class311.field3747 = 0;
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lkg;Lkg;I)V", garbageValue = "-1807714345")
    void method5683(final Class310 class310, final Class310 class311) {
        class311.field3743 = this.field3743;
        class311.field3745 = this.field3745;
        if (this.field3743 < class310.field3743) {
            class311.field3745 -= class310.field3743 - this.field3743;
            class311.field3743 = class310.field3743;
        }
        if (class311.method5685() > class310.method5685()) {
            class311.field3745 -= class311.method5685() - class310.method5685();
        }
        if (class311.field3745 < 0) {
            class311.field3745 = 0;
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "-33")
    int method5684() {
        return this.field3746 + this.field3747;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1611748891")
    int method5685() {
        return this.field3743 + this.field3745;
    }
    
    @Override
    public String toString() {
        return null;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "95")
    public static void method5697() {
        Class313.field3759 = new Class203();
    }
}
