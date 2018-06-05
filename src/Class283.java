import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jf")
public abstract class Class283 implements Comparator
{
    @ObfuscatedName("w")
    Comparator field3613;
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Ljava/util/Comparator;I)V", garbageValue = "726846986")
    final void method5307(final Comparator field3613) {
        if (this.field3613 == null) {
            this.field3613 = field3613;
        }
        else if (this.field3613 instanceof Class283) {
            ((Class283)this.field3613).method5307(field3613);
        }
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(Ljx;Ljx;I)I", garbageValue = "-366074461")
    protected final int method5308(final Class282 class282, final Class282 class283) {
        if (this.field3613 == null) {
            return 0;
        }
        return this.field3613.compare(class282, class283);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
}
