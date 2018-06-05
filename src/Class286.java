import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kx")
public class Class286 extends Class282
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 399210531)
    int field3624;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lkx;I)I", garbageValue = "2142390446")
    int method5406(final Class286 class286) {
        return this.field3624 - class286.field3624;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(Ljx;B)I", garbageValue = "97")
    @Override
    public int vmethod5453(final Class282 class282) {
        return this.method5406((Class286)class282);
    }
    
    @Override
    public int compareTo(final Object o) {
        return this.method5406((Class286)o);
    }
}
