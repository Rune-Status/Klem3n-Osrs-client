import java.lang.ref.SoftReference;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gf")
public class Class207 extends Class212
{
    @ObfuscatedName("z")
    SoftReference field2429;
    
    Class207(final Object o, final int n) {
        super(n);
        this.field2429 = new SoftReference(o);
    }
    
    @ObfuscatedName("z")
    @Override
    Object vmethod4137() {
        return this.field2429.get();
    }
    
    @ObfuscatedName("w")
    @Override
    boolean vmethod4136() {
        return true;
    }
}
