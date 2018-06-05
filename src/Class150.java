import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ed")
public class Class150 extends Class160
{
    @ObfuscatedName("pp")
    @ObfuscatedGetter(intValue = 692825213)
    static int field1928;
    @ObfuscatedName("fg")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field1919;
    @ObfuscatedName("fv")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field1926;
    @ObfuscatedName("z")
    long[] field1922;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 1263861109)
    int field1920;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1448416021)
    int field1921;
    @ObfuscatedName("l")
    @ObfuscatedGetter(longValue = -5065002419865856429L)
    long field1925;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 699699497)
    int field1923;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = 918453221)
    int field1924;
    
    Class150() {
        this.field1922 = new long[10];
        this.field1920 = 256;
        this.field1921 = 1;
        this.field1923 = 0;
        this.field1925 = Class182.method3547();
        for (int i = 0; i < 10; ++i) {
            this.field1922[i] = this.field1925;
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2021286604")
    @Override
    public void vmethod3330() {
        for (int i = 0; i < 10; ++i) {
            this.field1922[i] = 0L;
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)I", garbageValue = "2142370282")
    @Override
    public int vmethod3331(final int field1921, final int field1922) {
        final int field1923 = this.field1920;
        final int field1924 = this.field1921;
        this.field1920 = 300;
        this.field1921 = 1;
        this.field1925 = Class182.method3547();
        if (0L == this.field1922[this.field1924]) {
            this.field1920 = field1923;
            this.field1921 = field1924;
        }
        else if (this.field1925 > this.field1922[this.field1924]) {
            this.field1920 = (int)(field1921 * 2560 / (this.field1925 - this.field1922[this.field1924]));
        }
        if (this.field1920 < 25) {
            this.field1920 = 25;
        }
        if (this.field1920 > 256) {
            this.field1920 = 256;
            this.field1921 = (int)(field1921 - (this.field1925 - this.field1922[this.field1924]) / 10L);
        }
        if (this.field1921 > field1921) {
            this.field1921 = field1921;
        }
        this.field1922[this.field1924] = this.field1925;
        this.field1924 = (this.field1924 + 1) % 10;
        if (this.field1921 > 1) {
            for (int i = 0; i < 10; ++i) {
                if (this.field1922[i] != 0L) {
                    this.field1922[i] += this.field1921;
                }
            }
        }
        if (this.field1921 < field1922) {
            this.field1921 = field1922;
        }
        Class63.method1539(this.field1921);
        int n = 0;
        while (this.field1923 < 256) {
            ++n;
            this.field1923 += this.field1920;
        }
        this.field1923 &= 0xFF;
        return n;
    }
}
