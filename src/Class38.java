import java.awt.event.MouseWheelEvent;
import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Component;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.MouseWheelListener;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("aa")
public final class Class38 implements Class156, MouseWheelListener
{
    @ObfuscatedName("z")
    @ObfuscatedGetter(intValue = 853846113)
    int field328;
    
    Class38() {
        this.field328 = 0;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/awt/Component;I)V", garbageValue = "1305046280")
    void method665(final Component component) {
        component.addMouseWheelListener(this);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/awt/Component;I)V", garbageValue = "1338502209")
    void method668(final Component component) {
        component.removeMouseWheelListener(this);
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-371619108")
    @Override
    public synchronized int vmethod3278() {
        final int field328 = this.field328;
        this.field328 = 0;
        return field328;
    }
    
    @Override
    public synchronized void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
        this.field328 += mouseWheelEvent.getWheelRotation();
    }
}
