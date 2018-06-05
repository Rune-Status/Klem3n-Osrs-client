import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.util.Comparator;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kp")
public class Class308 implements Comparator
{
    @ObfuscatedName("z")
    final boolean field3738;
    
    public Class308(final boolean field3738) {
        this.field3738 = field3738;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljx;Ljx;B)I", garbageValue = "-98")
    int method5664(final Class282 class282, final Class282 class283) {
        return this.field3738 ? class282.vmethod5453(class283) : class283.vmethod5453(class282);
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        return this.method5664((Class282)o, (Class282)o2);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o);
    }
}
