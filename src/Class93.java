import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ct")
public class Class93 extends Class108
{
    @ObfuscatedName("z")
    public int field1279;
    @ObfuscatedName("w")
    public byte[] field1278;
    @ObfuscatedName("s")
    public int field1277;
    @ObfuscatedName("l")
    int field1280;
    @ObfuscatedName("u")
    public boolean field1281;
    
    Class93(final int field1279, final byte[] field1280, final int field1281, final int field1282) {
        this.field1279 = field1279;
        this.field1278 = field1280;
        this.field1277 = field1281;
        this.field1280 = field1282;
    }
    
    Class93(final int field1279, final byte[] field1280, final int field1281, final int field1282, final boolean field1283) {
        this.field1279 = field1279;
        this.field1278 = field1280;
        this.field1277 = field1281;
        this.field1280 = field1282;
        this.field1281 = field1283;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lcu;)Lct;")
    public Class93 method2115(final Class102 class102) {
        this.field1278 = class102.method2239(this.field1278);
        this.field1279 = class102.method2240(this.field1279);
        if (this.field1277 == this.field1280) {
            final int method2241 = class102.method2241(this.field1277);
            this.field1280 = method2241;
            this.field1277 = method2241;
        }
        else {
            this.field1277 = class102.method2241(this.field1277);
            this.field1280 = class102.method2241(this.field1280);
            if (this.field1277 == this.field1280) {
                --this.field1277;
            }
        }
        return this;
    }
}
