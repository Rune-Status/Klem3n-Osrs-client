import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("eh")
public class Class136
{
    @ObfuscatedName("fl")
    @ObfuscatedSignature(signature = "Lll;")
    static Class318 field1862;
    @ObfuscatedName("z")
    final URL field1867;
    @ObfuscatedName("w")
    volatile boolean field1859;
    @ObfuscatedName("s")
    volatile byte[] field1861;
    
    Class136(final URL field1867) {
        this.field1867 = field1867;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(S)Z", garbageValue = "3647")
    public boolean method3117() {
        return this.field1859;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)[B", garbageValue = "228107899")
    public byte[] method3116() {
        return this.field1861;
    }
}
