import java.awt.Graphics;
import java.awt.Component;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import java.awt.Canvas;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("al")
public final class Class42 extends Canvas
{
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 1710290887)
    public static int field362;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "[[Lhi;")
    public static Class230[][] field366;
    @ObfuscatedName("z")
    Component field365;
    
    Class42(final Component field365) {
        this.field365 = field365;
    }
    
    @Override
    public final void update(final Graphics graphics) {
        this.field365.update(graphics);
    }
    
    @Override
    public final void paint(final Graphics graphics) {
        this.field365.paint(graphics);
    }
}
