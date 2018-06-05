import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.Image;
import java.awt.image.PixelGrabber;
import java.io.InputStream;
import javax.imageio.ImageIO;
import java.io.ByteArrayInputStream;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("je")
public class Class284 extends Class285
{
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Llm;")
    final Class322 field3615;
    
    public Class284(final Class322 field3615) {
        super(400);
        this.field3615 = field3615;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)Ljx;", garbageValue = "2139940378")
    @Override
    Class282 vmethod5461() {
        return new Class286();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)[Ljx;", garbageValue = "828432673")
    @Override
    Class282[] vmethod5462(final int n) {
        return new Class286[n];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;II)V", garbageValue = "777447956")
    public void method5317(final Class182 class182, final int n) {
        while (class182.field2339 < n) {
            final boolean b = (class182.method3544() & 0x1) == 0x1;
            final Class291 class183 = new Class291(class182.method3738(), this.field3615);
            final Class291 class184 = new Class291(class182.method3738(), this.field3615);
            class182.method3738();
            if (class183 == null || !class183.method5441()) {
                throw new IllegalStateException();
            }
            Class286 class185 = (Class286)this.method5331(class183);
            if (b) {
                final Class286 class186 = (Class286)this.method5331(class184);
                if (class186 != null && class186 != class185) {
                    if (class185 != null) {
                        this.method5334(class186);
                    }
                    else {
                        class185 = class186;
                    }
                }
            }
            if (class185 != null) {
                this.method5338(class185, class183, class184);
            }
            else {
                if (this.method5327() >= 400) {
                    continue;
                }
                ((Class286)this.method5335(class183, class184)).field3624 = this.method5327();
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([BI)Lll;", garbageValue = "105126678")
    public static final Class318 method5324(final byte[] array) {
        try {
            final BufferedImage read = ImageIO.read(new ByteArrayInputStream(array));
            final int width = read.getWidth();
            final int height = read.getHeight();
            final int[] array2 = new int[width * height];
            new PixelGrabber(read, 0, 0, width, height, array2, 0, width).grabPixels();
            return new Class318(array2, width, height);
        }
        catch (IOException ex) {}
        catch (InterruptedException ex2) {}
        return new Class318(0, 0);
    }
}
