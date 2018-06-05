import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Line;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.AudioFormat;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("az")
public class Class44 extends Class95
{
    @ObfuscatedName("z")
    AudioFormat field373;
    @ObfuscatedName("w")
    SourceDataLine field374;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -1571871947)
    int field372;
    @ObfuscatedName("l")
    byte[] field375;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2015063069")
    @Override
    protected void vmethod2176() {
        this.field373 = new AudioFormat(Class95.field1300, 16, Class95.field1295 ? 2 : 1, true, false);
        this.field375 = new byte[256 << (Class95.field1295 ? 2 : 1)];
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IS)V", garbageValue = "255")
    @Override
    protected void vmethod2163(final int field372) throws LineUnavailableException {
        try {
            (this.field374 = (SourceDataLine)AudioSystem.getLine(new DataLine.Info(SourceDataLine.class, this.field373, field372 << (Class95.field1295 ? 2 : 1)))).open();
            this.field374.start();
            this.field372 = field372;
        }
        catch (LineUnavailableException ex) {
            final int n = (field372 >>> 1 & 0x55555555) + (field372 & 0x55555555);
            final int n2 = (n >>> 2 & 0x33333333) + (n & 0x33333333);
            final int n3 = (n2 >>> 4) + n2 & 0xF0F0F0F;
            final int n4 = (n3 >>> 8) + n3;
            if (((n4 >>> 16) + n4 & 0xFF) != 0x1) {
                this.vmethod2163(Class146.method3193(field372));
                return;
            }
            this.field374 = null;
            throw ex;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "83")
    @Override
    protected int vmethod2153() {
        return this.field372 - (this.field374.available() >> (Class95.field1295 ? 2 : 1));
    }
    
    @ObfuscatedName("l")
    @Override
    protected void vmethod2154() {
        int n = 256;
        if (Class95.field1295) {
            n <<= 1;
        }
        for (int i = 0; i < n; ++i) {
            int n2 = super.field1299[i];
            if ((n2 + 8388608 & 0xFF000000) != 0x0) {
                n2 = (0x7FFFFF ^ n2 >> 31);
            }
            this.field375[i * 2] = (byte)(n2 >> 8);
            this.field375[i * 2 + 1] = (byte)(n2 >> 16);
        }
        this.field374.write(this.field375, 0, n << 1);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1323448603")
    @Override
    protected void vmethod2155() {
        if (this.field374 != null) {
            this.field374.close();
            this.field374 = null;
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2047206903")
    @Override
    protected void vmethod2156() {
        this.field374.flush();
    }
}
