import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("jb")
public class Class280
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(longValue = -2788066611507117795L)
    long field3599;
    @ObfuscatedName("w")
    @ObfuscatedGetter(longValue = -9141763007911040395L)
    long field3598;
    @ObfuscatedName("s")
    public boolean field3597;
    @ObfuscatedName("l")
    @ObfuscatedGetter(longValue = 7389818107012479155L)
    long field3600;
    @ObfuscatedName("u")
    @ObfuscatedGetter(longValue = 5136999404285714875L)
    long field3601;
    @ObfuscatedName("q")
    @ObfuscatedGetter(longValue = -6017885431335410913L)
    long field3602;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = 1130447619)
    int field3604;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 866548259)
    int field3603;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -646636543)
    int field3605;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = 1822961763)
    int field3606;
    
    public Class280() {
        this.field3599 = -1L;
        this.field3598 = -1L;
        this.field3597 = false;
        this.field3600 = 0L;
        this.field3601 = 0L;
        this.field3602 = 0L;
        this.field3604 = 0;
        this.field3603 = 0;
        this.field3605 = 0;
        this.field3606 = 0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "92")
    public void method5244() {
        this.field3599 = Class182.method3547();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-92")
    public void method5262() {
        if (-1L != this.field3599) {
            this.field3601 = Class182.method3547() - this.field3599;
            this.field3599 = -1L;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "-2082197473")
    public void method5246(final int field3604) {
        this.field3598 = Class182.method3547();
        this.field3604 = field3604;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-222960010")
    public void method5247() {
        if (this.field3598 != -1L) {
            this.field3600 = Class182.method3547() - this.field3598;
            this.field3598 = -1L;
        }
        ++this.field3605;
        this.field3597 = true;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-656792455")
    public void method5248() {
        this.field3597 = false;
        this.field3603 = 0;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-450246624")
    public void method5249() {
        this.method5247();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "58")
    public void method5245(final Class182 class182) {
        long n = this.field3601 / 10L;
        if (n < 0L) {
            n = 0L;
        }
        else if (n > 65535L) {
            n = 65535L;
        }
        class182.method3755((int)n);
        long n2 = this.field3600 / 10L;
        if (n2 < 0L) {
            n2 = 0L;
        }
        else if (n2 > 65535L) {
            n2 = 65535L;
        }
        class182.method3755((int)n2);
        long n3 = this.field3602 / 10L;
        if (n3 < 0L) {
            n3 = 0L;
        }
        else if (n3 > 65535L) {
            n3 = 65535L;
        }
        class182.method3755((int)n3);
        class182.method3755(this.field3604);
        class182.method3755(this.field3603);
        class182.method3755(this.field3605);
        class182.method3755(this.field3606);
    }
}
