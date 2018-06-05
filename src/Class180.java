import net.runelite.mapping.ObfuscatedSignature;
import java.nio.ByteBuffer;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fe")
public class Class180 extends Class186
{
    @ObfuscatedName("z")
    ByteBuffer field2293;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)[B", garbageValue = "-44")
    @Override
    byte[] vmethod3789() {
        final byte[] array = new byte[this.field2293.capacity()];
        this.field2293.position(0);
        this.field2293.get(array);
        return array;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([BI)V", garbageValue = "339302128")
    @Override
    void vmethod3792(final byte[] array) {
        (this.field2293 = ByteBuffer.allocateDirect(array.length)).position(0);
        this.field2293.put(array);
    }
}
