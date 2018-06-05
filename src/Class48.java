import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.FocusListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ax")
public class Class48 implements MouseListener, MouseMotionListener, FocusListener
{
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lax;")
    public static Class48 field429;
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = 1210703827)
    static volatile int field417;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -408912375)
    public static volatile int field424;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -333703105)
    public static int field425;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 1905746791)
    public static volatile int field422;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = 1976419829)
    public static int field426;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1193765943)
    public static volatile int field423;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = -182158863)
    public static int field419;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -569585645)
    public static volatile int field421;
    @ObfuscatedName("n")
    @ObfuscatedGetter(intValue = -1462111047)
    public static volatile int field420;
    @ObfuscatedName("f")
    @ObfuscatedGetter(intValue = 894647401)
    public static volatile int field434;
    @ObfuscatedName("g")
    @ObfuscatedGetter(longValue = 2696384854056822279L)
    public static volatile long field430;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 1681711897)
    public static int field431;
    @ObfuscatedName("r")
    @ObfuscatedGetter(intValue = -1469671121)
    public static int field432;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -2008842241)
    public static int field428;
    @ObfuscatedName("o")
    @ObfuscatedGetter(longValue = 7842482435590182425L)
    public static long field433;
    @ObfuscatedName("jz")
    @ObfuscatedGetter(intValue = -1699928239)
    static int field435;
    
    static {
        Class48.field429 = new Class48();
        Class48.field417 = 0;
        Class48.field424 = 0;
        Class48.field422 = -1;
        Class48.field423 = -1;
        Class48.field419 = 0;
        Class48.field425 = 0;
        Class48.field426 = 0;
        Class48.field421 = 0;
        Class48.field420 = 0;
        Class48.field434 = 0;
        Class48.field430 = 0L;
        Class48.field431 = 0;
        Class48.field432 = 0;
        Class48.field428 = 0;
        Class48.field433 = 0L;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(Ljava/awt/event/MouseEvent;I)I", garbageValue = "-1838071369")
    final int method916(final MouseEvent mouseEvent) {
        final int button = mouseEvent.getButton();
        if (mouseEvent.isAltDown() || button == 2) {
            return 4;
        }
        if (mouseEvent.isMetaDown() || button == 3) {
            return 2;
        }
        return 1;
    }
    
    @Override
    public final synchronized void mousePressed(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field420 = mouseEvent.getX();
            Class48.field434 = mouseEvent.getY();
            Class48.field430 = Class182.method3547();
            Class48.field421 = this.method916(mouseEvent);
            if (Class48.field421 != 0) {
                Class48.field424 = Class48.field421;
            }
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final synchronized void mouseReleased(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field424 = 0;
        }
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final synchronized void mouseEntered(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field422 = mouseEvent.getX();
            Class48.field423 = mouseEvent.getY();
        }
    }
    
    @Override
    public final synchronized void mouseDragged(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field422 = mouseEvent.getX();
            Class48.field423 = mouseEvent.getY();
        }
    }
    
    @Override
    public final synchronized void mouseMoved(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field422 = mouseEvent.getX();
            Class48.field423 = mouseEvent.getY();
        }
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        if (Class48.field429 != null) {
            Class48.field424 = 0;
        }
    }
    
    @Override
    public final synchronized void mouseExited(final MouseEvent mouseEvent) {
        if (Class48.field429 != null) {
            Class48.field417 = 0;
            Class48.field422 = -1;
            Class48.field423 = -1;
        }
    }
    
    @Override
    public final void mouseClicked(final MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            mouseEvent.consume();
        }
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    @ObfuscatedName("ej")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "537461702")
    static void method947(final int field589) {
        if (field589 == Client.field589) {
            return;
        }
        if (Client.field589 == 0) {
            Class182.field2334.method842();
        }
        if (field589 == 20 || field589 == 40 || field589 == 45) {
            Client.field615 = 0;
            Client.field616 = 0;
            Client.field617 = 0;
            Client.field804.method5246(field589);
            if (field589 != 20) {
                Class87.method2005(false);
            }
        }
        if (field589 != 20 && field589 != 40 && Class62.field869 != null) {
            Class62.field869.vmethod3346();
            Class62.field869 = null;
        }
        if (Client.field589 == 25) {
            Client.field751 = 0;
            Client.field633 = 0;
            Client.field634 = 1;
            Client.field635 = 0;
            Client.field636 = 1;
        }
        if (field589 == 5 || field589 == 10) {
            Class87.method1994(Class22.field183, Class175.field2270, true, 0);
        }
        else if (field589 == 20) {
            Class87.method1994(Class22.field183, Class175.field2270, true, (Client.field589 == 11) ? 4 : 0);
        }
        else if (field589 == 11) {
            Class87.method1994(Class22.field183, Class175.field2270, false, 4);
        }
        else {
            Class59.method1079();
        }
        Client.field589 = field589;
    }
    
    @ObfuscatedName("gq")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "96")
    static boolean method943() {
        return (Client.field658 & 0x2) != 0x0;
    }
    
    @ObfuscatedName("hx")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "1368654361")
    static final void method948(final int n, final int n2, final int n3, final int n4) {
        for (int i = 0; i < Client.field603; ++i) {
            if (Client.field786[i] + Client.field641[i] > n && Client.field786[i] < n + n3 && Client.field787[i] + Client.field789[i] > n2 && Client.field787[i] < n4 + n2) {
                Client.field697[i] = true;
            }
        }
    }
}
