import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.awt.Graphics;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.image.ColorModel;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.awt.Point;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.DirectColorModel;
import java.awt.image.DataBufferInt;
import java.awt.Image;
import java.awt.Component;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ad")
public final class Class46 extends Class315
{
    @ObfuscatedName("z")
    Component field384;
    @ObfuscatedName("w")
    Image field383;
    
    Class46(final int field3767, final int field3768, final Component component) {
        super.field3767 = field3767;
        super.field3769 = field3768;
        super.field3768 = new int[field3768 * field3767 + 1];
        final DataBufferInt dataBufferInt = new DataBufferInt(super.field3768, super.field3768.length);
        final DirectColorModel directColorModel = new DirectColorModel(32, 16711680, 65280, 255);
        this.field383 = new BufferedImage(directColorModel, Raster.createWritableRaster(directColorModel.createCompatibleSampleModel(super.field3767, super.field3769), dataBufferInt, null), false, new Hashtable<Object, Object>());
        this.method751(component);
        this.method5808();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/awt/Component;B)V", garbageValue = "-102")
    final void method751(final Component field384) {
        this.field384 = field384;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1986786716")
    @Override
    public final void vmethod5809(final int n, final int n2) {
        this.method754(this.field384.getGraphics(), n, n2);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-661513186")
    @Override
    public final void vmethod5810(final int n, final int n2, final int n3, final int n4) {
        this.method755(this.field384.getGraphics(), n, n2, n3, n4);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/awt/Graphics;III)V", garbageValue = "1968187025")
    final void method754(final Graphics graphics, final int n, final int n2) {
        try {
            graphics.drawImage(this.field383, n, n2, this.field384);
        }
        catch (Exception ex) {
            this.field384.repaint();
        }
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Ljava/awt/Graphics;IIIIB)V", garbageValue = "1")
    final void method755(final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
        try {
            final Shape clip = graphics.getClip();
            graphics.clipRect(n, n2, n3, n4);
            graphics.drawImage(this.field383, 0, 0, this.field384);
            graphics.setClip(clip);
        }
        catch (Exception ex) {
            this.field384.repaint();
        }
    }
}
