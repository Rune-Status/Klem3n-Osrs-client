import java.util.Iterator;
import java.io.IOException;
import java.net.Socket;
import java.awt.event.WindowEvent;
import java.awt.event.FocusEvent;
import java.awt.Rectangle;
import java.net.URL;
import java.awt.image.ImageObserver;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Container;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import java.awt.event.KeyListener;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.StringSelection;
import java.awt.Component;
import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.EventQueue;
import java.awt.datatransfer.Clipboard;
import java.awt.Canvas;
import java.awt.Frame;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.WindowListener;
import java.awt.event.FocusListener;
import java.applet.Applet;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("aj")
public abstract class Class47 extends Applet implements Runnable, FocusListener, WindowListener
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lev;")
    protected static Signlink field392;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Laj;")
    static Class47 field386;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1414651903)
    static int field387;
    @ObfuscatedName("u")
    @ObfuscatedGetter(longValue = -5838759279061655367L)
    static long field388;
    @ObfuscatedName("q")
    static boolean field389;
    @ObfuscatedName("e")
    @ObfuscatedGetter(intValue = -1662117949)
    static int field391;
    @ObfuscatedName("p")
    @ObfuscatedGetter(intValue = 1070405191)
    static int field385;
    @ObfuscatedName("b")
    @ObfuscatedGetter(intValue = -1422310459)
    protected static int field393;
    @ObfuscatedName("g")
    protected static long[] field394;
    @ObfuscatedName("r")
    protected static long[] field404;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = 1878379069)
    static int field413;
    @ObfuscatedName("az")
    static volatile boolean field390;
    @ObfuscatedName("aj")
    @ObfuscatedGetter(longValue = -3346366327004911519L)
    static long field415;
    @ObfuscatedName("ax")
    @ObfuscatedGetter(longValue = 1928704871308797659L)
    static long field416;
    @ObfuscatedName("k")
    boolean field401;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 2027069893)
    protected int field396;
    @ObfuscatedName("a")
    @ObfuscatedGetter(intValue = -81949229)
    protected int field397;
    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 1346865451)
    int field398;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 2128545057)
    int field411;
    @ObfuscatedName("v")
    @ObfuscatedGetter(intValue = -385865539)
    int field395;
    @ObfuscatedName("af")
    @ObfuscatedGetter(intValue = -1565245549)
    int field402;
    @ObfuscatedName("ah")
    @ObfuscatedGetter(intValue = -318529133)
    int field400;
    @ObfuscatedName("ab")
    @ObfuscatedGetter(intValue = 1497598001)
    int field414;
    @ObfuscatedName("as")
    Frame field403;
    @ObfuscatedName("an")
    Canvas field405;
    @ObfuscatedName("ao")
    volatile boolean field406;
    @ObfuscatedName("ac")
    boolean field408;
    @ObfuscatedName("ap")
    volatile boolean field409;
    @ObfuscatedName("aa")
    @ObfuscatedGetter(longValue = 2801001644697647105L)
    volatile long field410;
    @ObfuscatedName("av")
    @ObfuscatedSignature(signature = "Laa;")
    Class38 field407;
    @ObfuscatedName("al")
    Clipboard field412;
    @ObfuscatedName("ae")
    final EventQueue field399;
    
    static {
        Class47.field386 = null;
        Class47.field387 = 0;
        Class47.field388 = 0L;
        Class47.field389 = false;
        Class47.field391 = 20;
        Class47.field385 = 1;
        Class47.field393 = 0;
        Class47.field394 = new long[32];
        Class47.field404 = new long[32];
        Class47.field413 = 500;
        Class47.field390 = true;
        Class47.field415 = -1L;
        Class47.field416 = -1L;
    }
    
    protected Class47() {
        this.field401 = false;
        this.field398 = 0;
        this.field411 = 0;
        this.field406 = true;
        this.field408 = false;
        this.field409 = false;
        this.field410 = 0L;
        EventQueue systemEventQueue = null;
        try {
            systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
        }
        catch (Throwable t) {}
        this.field399 = systemEventQueue;
        Class95.field1297 = new Class40();
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "349970276")
    protected final void method906(final int field400, final int field401) {
        if (this.field400 != field400 || field401 != this.field414) {
            this.method784();
        }
        this.field400 = field400;
        this.field414 = field401;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Ljava/lang/Object;B)V", garbageValue = "-2")
    final void method768(final Object o) {
        if (this.field399 == null) {
            return;
        }
        for (int n = 0; n < 50 && this.field399.peekEvent() != null; ++n) {
            Class63.method1539(1L);
        }
        if (o != null) {
            this.field399.postEvent(new ActionEvent(o, 1001, "dummy"));
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(B)Lfp;", garbageValue = "10")
    protected Class156 method769() {
        if (this.field407 == null) {
            (this.field407 = new Class38()).method665(this.field405);
        }
        return this.field407;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1223644500")
    protected void method770() {
        this.field412 = this.getToolkit().getSystemClipboard();
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;S)V", garbageValue = "8637")
    protected void method771(final String s) {
        this.field412.setContents(new StringSelection(s), null);
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "0")
    protected final void method772() {
        if (Signlink.javaVendor.toLowerCase().indexOf("microsoft") != -1) {
            Class39.field334[186] = 57;
            Class39.field334[187] = 27;
            Class39.field334[188] = 71;
            Class39.field334[189] = 26;
            Class39.field334[190] = 72;
            Class39.field334[191] = 73;
            Class39.field334[192] = 58;
            Class39.field334[219] = 42;
            Class39.field334[220] = 74;
            Class39.field334[221] = 43;
            Class39.field334[222] = 59;
            Class39.field334[223] = 28;
        }
        else {
            Class39.field334[44] = 71;
            Class39.field334[45] = 26;
            Class39.field334[46] = 72;
            Class39.field334[47] = 73;
            Class39.field334[59] = 57;
            Class39.field334[61] = 27;
            Class39.field334[91] = 42;
            Class39.field334[92] = 74;
            Class39.field334[93] = 43;
            Class39.field334[192] = 28;
            Class39.field334[222] = 58;
            Class39.field334[520] = 59;
        }
        final Canvas field405 = this.field405;
        field405.setFocusTraversalKeysEnabled(false);
        field405.addKeyListener(Class39.field337);
        field405.addFocusListener(Class39.field337);
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "45124386")
    protected final void method791() {
        final Canvas field405 = this.field405;
        field405.addMouseListener(Class48.field429);
        field405.addMouseMotionListener(Class48.field429);
        field405.addFocusListener(Class48.field429);
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1629251833")
    final void method854() {
        final Container method799 = this.method799();
        if (method799 == null) {
            return;
        }
        final Class310 method800 = this.method800();
        this.field396 = Math.max(method800.field3747, this.field395);
        this.field397 = Math.max(method800.field3745, this.field402);
        if (this.field396 <= 0) {
            this.field396 = 1;
        }
        if (this.field397 <= 0) {
            this.field397 = 1;
        }
        Class82.field1179 = Math.min(this.field396, this.field400);
        Class243.field3138 = Math.min(this.field397, this.field414);
        this.field398 = (this.field396 - Class82.field1179) / 2;
        this.field411 = 0;
        this.field405.setSize(Class82.field1179, Class243.field3138);
        Class163.field2014 = new Class46(Class82.field1179, Class243.field3138, this.field405);
        if (method799 == this.field403) {
            final Insets insets = this.field403.getInsets();
            this.field405.setLocation(this.field398 + insets.left, insets.top + this.field411);
        }
        else {
            this.field405.setLocation(this.field398, this.field411);
        }
        this.field406 = true;
        this.vmethod1144();
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2141234055")
    protected abstract void vmethod1144();
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1970135042")
    void method776() {
        final int field398 = this.field398;
        final int field399 = this.field411;
        final int n = this.field396 - Class82.field1179 - field398;
        final int n2 = this.field397 - Class243.field3138 - field399;
        if (field398 <= 0 && n <= 0 && field399 <= 0) {
            if (n2 <= 0) {
                return;
            }
        }
        try {
            final Container method799 = this.method799();
            int left = 0;
            int top = 0;
            if (method799 == this.field403) {
                final Insets insets = this.field403.getInsets();
                left = insets.left;
                top = insets.top;
            }
            final Graphics graphics = method799.getGraphics();
            graphics.setColor(Color.black);
            if (field398 > 0) {
                graphics.fillRect(left, top, field398, this.field397);
            }
            if (field399 > 0) {
                graphics.fillRect(left, top, this.field396, field399);
            }
            if (n > 0) {
                graphics.fillRect(left + this.field396 - n, top, n, this.field397);
            }
            if (n2 > 0) {
                graphics.fillRect(left, top + this.field397 - n2, this.field396, n2);
            }
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    final void method777() {
        final Canvas field405 = this.field405;
        field405.removeKeyListener(Class39.field337);
        field405.removeFocusListener(Class39.field337);
        Class39.field329 = -1;
        final Canvas field406 = this.field405;
        field406.removeMouseListener(Class48.field429);
        field406.removeMouseMotionListener(Class48.field429);
        field406.removeFocusListener(Class48.field429);
        Class48.field424 = 0;
        if (this.field407 != null) {
            this.field407.method668(this.field405);
        }
        this.replaceCanvas();
        final Canvas field407 = this.field405;
        field407.setFocusTraversalKeysEnabled(false);
        field407.addKeyListener(Class39.field337);
        field407.addFocusListener(Class39.field337);
        final Canvas field408 = this.field405;
        field408.addMouseListener(Class48.field429);
        field408.addMouseMotionListener(Class48.field429);
        field408.addFocusListener(Class48.field429);
        if (this.field407 != null) {
            this.field407.method665(this.field405);
        }
        this.method784();
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "1907342193")
    protected final void method778(final int field1179, final int field1180, final int field1181) {
        try {
            if (Class47.field386 != null) {
                ++Class47.field387;
                if (Class47.field387 >= 3) {
                    this.error("alreadyloaded");
                    return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
            }
            else {
                Class47.field386 = this;
                Class82.field1179 = field1179;
                Class243.field3138 = field1180;
                Class42.field362 = field1181;
                Class152.field1938 = this;
                if (Class47.field392 == null) {
                    Class47.field392 = new Signlink();
                }
                
                Class47.field392.method3249(this, 1);
            }
        }
        catch (Exception ex) {
            Class5.method65(null, ex);
            this.error("crash");
        }
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1647866935")
    final synchronized void replaceCanvas() {
        final Container method799 = this.method799();
        if (this.field405 != null) {
            this.field405.removeFocusListener(this);
            method799.remove(this.field405);
        }
        Class82.field1179 = Math.max(method799.getWidth(), this.field395);
        Class243.field3138 = Math.max(method799.getHeight(), this.field402);
        if (this.field403 != null) {
            final Insets insets = this.field403.getInsets();
            Class82.field1179 -= insets.right + insets.left;
            Class243.field3138 -= insets.bottom + insets.top;
        }
        method799.add(this.field405 = new Class42(this));
        this.field405.setSize(Class82.field1179, Class243.field3138);
        this.field405.setVisible(true);
        this.field405.setBackground(Color.BLACK);
        if (method799 == this.field403) {
            final Insets insets2 = this.field403.getInsets();
            this.field405.setLocation(insets2.left + this.field398, insets2.top + this.field411);
        }
        else {
            this.field405.setLocation(this.field398, this.field411);
        }
        this.field405.addFocusListener(this);
        this.field405.requestFocus();
        this.field406 = true;
        if (Class163.field2014 != null && Class82.field1179 == Class163.field2014.field3767 && Class243.field3138 == Class163.field2014.field3769) {
            ((Class46)Class163.field2014).method751(this.field405);
            Class163.field2014.vmethod5809(0, 0);
        }
        else {
            Class163.field2014 = new Class46(Class82.field1179, Class243.field3138, this.field405);
        }
        this.field409 = false;
        this.field410 = Class182.method3547();
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "375421429")
    protected final boolean method774() {
        String s = this.getDocumentBase().getHost().toLowerCase();
        if (s.equals("jagex.com") || s.endsWith(".jagex.com")) {
            return true;
        }
        if (s.equals("runescape.com") || s.endsWith(".runescape.com")) {
            return true;
        }
        if (s.endsWith("127.0.0.1")) {
            return true;
        }
        while (s.length() > 0 && s.charAt(s.length() - 1) >= '0' && s.charAt(s.length() - 1) <= '9') {
            s = s.substring(0, s.length() - 1);
        }
        if (s.endsWith("192.168.1.")) {
            return true;
        }
        this.error("invalidhost");
        return false;
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "2136042033")
    void method781() {
        final long method3547 = Class182.method3547();
        final long n = Class47.field404[Class20.field172];
        Class47.field404[Class20.field172] = method3547;
        Class20.field172 = (Class20.field172 + 1 & 0x1F);
        if (0L == n || method3547 > n) {}
        synchronized (this) {
            Class18.field146 = Class47.field390;
        }
        this.vmethod1136();
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "243481673")
    void method782() {
        final Container method799 = this.method799();
        final long method800 = Class182.method3547();
        final long n = Class47.field394[Class257.field3259];
        Class47.field394[Class257.field3259] = method800;
        Class257.field3259 = (Class257.field3259 + 1 & 0x1F);
        if (0L != n && method800 > n) {
            final int n2 = (int)(method800 - n);
            Class47.field393 = ((n2 >> 1) + 32000) / n2;
        }
        if (++Class47.field413 - 1 > 50) {
            Class47.field413 -= 50;
            this.field406 = true;
            this.field405.setSize(Class82.field1179, Class243.field3138);
            this.field405.setVisible(true);
            if (method799 == this.field403) {
                final Insets insets = this.field403.getInsets();
                this.field405.setLocation(this.field398 + insets.left, this.field411 + insets.top);
            }
            else {
                this.field405.setLocation(this.field398, this.field411);
            }
        }
        if (this.field409) {
            this.method777();
        }
        this.method783();
        this.vmethod1137(this.field406);
        if (this.field406) {
            this.method776();
        }
        this.field406 = false;
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-460416978")
    final void method783() {
        final Class310 method800 = this.method800();
        if (method800.field3747 != this.field396 || this.field397 != method800.field3745 || this.field408) {
            this.method854();
            this.field408 = false;
        }
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "1")
    final void method784() {
        this.field408 = true;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-199508735")
    final synchronized void method785() {
        if (Class47.field389) {
            return;
        }
        Class47.field389 = true;
        try {
            this.field405.removeFocusListener(this);
        }
        catch (Exception ex) {}
        try {
            this.vmethod1187();
        }
        catch (Exception ex2) {}
        if (this.field403 != null) {
            try {
                System.exit(0);
            }
            catch (Throwable t) {}
        }
        if (Class47.field392 != null) {
            try {
                Class47.field392.method3256();
            }
            catch (Exception ex3) {}
        }
        this.vmethod1132();
    }
    
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1300111147")
    protected abstract void setUp();
    
    @ObfuscatedName("at")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1052023991")
    protected abstract void vmethod1136();
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "(ZB)V", garbageValue = "0")
    protected abstract void vmethod1137(final boolean p0);
    
    @ObfuscatedName("ac")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2060326728")
    protected abstract void vmethod1187();
    
    @ObfuscatedName("ap")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;ZI)V", garbageValue = "490645637")
    protected final void method796(final int n, final String s, final boolean b) {
        try {
            final Graphics graphics = this.field405.getGraphics();
            if (Signlink.field1961 == null) {
                Signlink.field1961 = new Font("Helvetica", 1, 13);
                Class29.field256 = this.field405.getFontMetrics(Signlink.field1961);
            }
            if (b) {
                graphics.setColor(Color.black);
                graphics.fillRect(0, 0, Class82.field1179, Class243.field3138);
            }
            final Color color = new Color(140, 17, 17);
            try {
                if (Class71.field1028 == null) {
                    Class71.field1028 = this.field405.createImage(304, 34);
                }
                final Graphics graphics2 = Class71.field1028.getGraphics();
                graphics2.setColor(color);
                graphics2.drawRect(0, 0, 303, 33);
                graphics2.fillRect(2, 2, n * 3, 30);
                graphics2.setColor(Color.black);
                graphics2.drawRect(1, 1, 301, 31);
                graphics2.fillRect(n * 3 + 2, 2, 300 - n * 3, 30);
                graphics2.setFont(Signlink.field1961);
                graphics2.setColor(Color.white);
                graphics2.drawString(s, (304 - Class29.field256.stringWidth(s)) / 2, 22);
                graphics.drawImage(Class71.field1028, Class82.field1179 / 2 - 152, Class243.field3138 / 2 - 18, null);
            }
            catch (Exception ex) {
                final int n2 = Class82.field1179 / 2 - 152;
                final int n3 = Class243.field3138 / 2 - 18;
                graphics.setColor(color);
                graphics.drawRect(n2, n3, 303, 33);
                graphics.fillRect(n2 + 2, n3 + 2, n * 3, 30);
                graphics.setColor(Color.black);
                graphics.drawRect(n2 + 1, n3 + 1, 301, 31);
                graphics.fillRect(n2 + n * 3 + 2, n3 + 2, 300 - n * 3, 30);
                graphics.setFont(Signlink.field1961);
                graphics.setColor(Color.white);
                graphics.drawString(s, n2 + (304 - Class29.field256.stringWidth(s)) / 2, n3 + 22);
            }
        }
        catch (Exception ex2) {
            this.field405.repaint();
        }
    }
    
    @ObfuscatedName("aa")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-82")
    protected final void method842() {
        Class71.field1028 = null;
        Signlink.field1961 = null;
        Class29.field256 = null;
    }
    
    @ObfuscatedName("ar")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "1327956818")
    protected void error(final String s) {
        if (this.field401) {
            return;
        }
        this.field401 = true;
        System.out.println("error_game_" + s);
        try {
            this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + s + ".ws"), "_self");
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("au")
    @ObfuscatedSignature(signature = "(I)Ljava/awt/Container;", garbageValue = "-1235194173")
    Container method799() {
        if (this.field403 != null) {
            return this.field403;
        }
        return this;
    }
    
    @ObfuscatedName("av")
    @ObfuscatedSignature(signature = "(B)Lkg;", garbageValue = "20")
    Class310 method800() {
        final Container method799 = this.method799();
        int max = Math.max(method799.getWidth(), this.field395);
        int max2 = Math.max(method799.getHeight(), this.field402);
        if (this.field403 != null) {
            final Insets insets = this.field403.getInsets();
            max -= insets.left + insets.right;
            max2 -= insets.top + insets.bottom;
        }
        return new Class310(max, max2);
    }
    
    @ObfuscatedName("al")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-997320713")
    protected final boolean method801() {
        return this.field403 != null;
    }
    
    @ObfuscatedName("az")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1676093665")
    protected abstract void vmethod1132();
    
    @Override
    public final void destroy() {
        if (this != Class47.field386 || Class47.field389) {
            return;
        }
        Class47.field388 = Class182.method3547();
        Class63.method1539(5000L);
        this.method785();
    }
    
    @Override
    public final synchronized void paint(final Graphics graphics) {
        if (this != Class47.field386 || Class47.field389) {
            return;
        }
        this.field406 = true;
        if (Class182.method3547() - this.field410 > 1000L) {
            final Rectangle clipBounds = graphics.getClipBounds();
            if (clipBounds == null || (clipBounds.width >= Class82.field1179 && clipBounds.height >= Class243.field3138)) {
                this.field409 = true;
            }
        }
    }
  
    public void run() {
        try {
            if (Signlink.javaVendor != null) {
                final String lowerCase = Signlink.javaVendor.toLowerCase();
                if (lowerCase.indexOf("sun") != -1 || lowerCase.indexOf("apple") != -1) {
                    final String field1954 = Signlink.javaVersion;
                    if (field1954.equals("1.1") || field1954.startsWith("1.1.") || field1954.equals("1.2") || field1954.startsWith("1.2.") || field1954.equals("1.3") || field1954.startsWith("1.3.") || field1954.equals("1.4") || field1954.startsWith("1.4.") || field1954.equals("1.5") || field1954.startsWith("1.5.") || field1954.equals("1.6.0")) {
                        this.error("wrongjava");
                        return;
                    }
                    if (field1954.startsWith("1.6.0_")) {
                        int i;
                        for (i = 6; i < field1954.length(); ++i) {
                            final char char1 = field1954.charAt(i);
                            if (char1 < '0' || char1 > '9') {
                                break;
                            }
                        }
                        final String substring = field1954.substring(6, i);
                        if (Class102.method2249(substring) && Class68.method1693(substring, 10, true) < 10) {
                            this.error("wrongjava");
                            return;
                        }
                    }
                    Class47.field385 = 5;
                }
            }
            this.setFocusCycleRoot(true);
            this.replaceCanvas();
            this.setUp();
            RunException.timer = RunException.method712();
            while (Class47.field388 == 0L || Class182.method3547() < Class47.field388) {
                Class8.field48 = RunException.timer.vmethod3331(Class47.field391, Class47.field385);
                for (int j = 0; j < Class8.field48; ++j) {
                    this.method781();
                }
                this.method782();
                this.method768(this.field405);
            }
        }
        catch (Exception ex) {
            Class5.method65(null, ex);
            this.error("crash");
        }
        this.method785();
    }
    
    @Override
    public final void start() {
        if (this != Class47.field386 || Class47.field389) {
            return;
        }
        Class47.field388 = 0L;
    }
    
    @Override
    public final void stop() {
        if (this != Class47.field386 || Class47.field389) {
            return;
        }
        Class47.field388 = Class182.method3547() + 4000L;
    }
    
    @Override
    public final void update(final Graphics graphics) {
        this.paint(graphics);
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
        Class47.field390 = true;
        this.field406 = true;
    }
    
    @Override
    public final void focusLost(final FocusEvent focusEvent) {
        Class47.field390 = false;
    }
    
    @Override
    public final void windowDeactivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowIconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowOpened(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowDeiconified(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowActivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowClosed(final WindowEvent windowEvent) {
    }
    
    @Override
    public final void windowClosing(final WindowEvent windowEvent) {
        this.destroy();
    }
    
    @Override
    public abstract void init();
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Ljava/net/Socket;IIB)Lfd;", garbageValue = "-82")
    public static Class157 method911(final Socket socket, final int n, final int n2) throws IOException {
        return new Class159(socket, n, n2);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "-7")
    static int method909(int n, final Class84 class84, final boolean b) {
        int n2 = -1;
        Class230 method434;
        if (n >= 2000) {
            n -= 1000;
            n2 = Class69.field999[--Class69.field1003];
            method434 = Class26.method434(n2);
        }
        else {
            method434 = (b ? Class276.field3561 : Class260.field3301);
        }
        if (n == 1000) {
            Class69.field1003 -= 4;
            method434.field2607 = Class69.field999[Class69.field1003];
            method434.field2615 = Class69.field999[Class69.field1003 + 1];
            method434.field2610 = Class69.field999[Class69.field1003 + 2];
            method434.field2611 = Class69.field999[Class69.field1003 + 3];
            Class60.method1114(method434);
            Class182.field2334.method1152(method434);
            if (n2 != -1 && method434.field2721 == 0) {
                Class163.method3388(Class42.field366[n2 >> 16], method434, false);
            }
            return 1;
        }
        if (n == 1001) {
            Class69.field1003 -= 4;
            method434.field2616 = Class69.field999[Class69.field1003];
            method434.field2617 = Class69.field999[Class69.field1003 + 1];
            method434.field2612 = Class69.field999[Class69.field1003 + 2];
            method434.field2624 = Class69.field999[Class69.field1003 + 3];
            Class60.method1114(method434);
            Class182.field2334.method1152(method434);
            if (n2 != -1 && method434.field2721 == 0) {
                Class163.method3388(Class42.field366[n2 >> 16], method434, false);
            }
            return 1;
        }
        if (n == 1003) {
            final boolean field2625 = Class69.field999[--Class69.field1003] == 1;
            if (field2625 != method434.field2625) {
                method434.field2625 = field2625;
                Class60.method1114(method434);
            }
            return 1;
        }
        if (n == 1005) {
            method434.field2648 = (Class69.field999[--Class69.field1003] == 1);
            return 1;
        }
        if (n == 1006) {
            method434.field2740 = (Class69.field999[--Class69.field1003] == 1);
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "670224222")
    static void method910() {
        final Iterator iterator = Class83.field1181.iterator();
        while (iterator.hasNext()) {
            ((Class58) iterator.next()).method1042();
        }
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "0")
    public static final void method913(final int field1648, final int field1649) {
        Class120.field1648 = field1648;
        Class120.field1649 = field1649;
        Class120.field1650 = true;
        Class120.field1656 = 0;
        Class120.field1652 = false;
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(ILce;ZI)I", garbageValue = "794717505")
    static int method914(final int n, final Class84 class84, final boolean b) {
        final Class230 class85 = b ? Class276.field3561 : Class260.field3301;
        if (n == 1800) {
            Class69.field999[++Class69.field1003 - 1] = Signlink.method3252(Class24.method425(class85));
            return 1;
        }
        if (n == 1801) {
            int n2 = Class69.field999[--Class69.field1003];
            --n2;
            if (class85.field2680 == null || n2 >= class85.field2680.length || class85.field2680[n2] == null) {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = class85.field2680[n2];
            }
            return 1;
        }
        if (n == 1802) {
            if (class85.field2679 == null) {
                Class69.field1001[++Class55.field497 - 1] = "";
            }
            else {
                Class69.field1001[++Class55.field497 - 1] = class85.field2679;
            }
            return 1;
        }
        return 2;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "([BI)[B", garbageValue = "-1083003215")
    static final byte[] method912(final byte[] array) {
        final Class182 class182 = new Class182(array);
        final int method3544 = class182.method3544();
        final int method3545 = class182.method3671();
        if (method3545 < 0 || (Class247.field3176 != 0 && method3545 > Class247.field3176)) {
            throw new RuntimeException();
        }
        if (method3544 == 0) {
            final byte[] array2 = new byte[method3545];
            class182.method3539(array2, 0, method3545);
            return array2;
        }
        final int method3546 = class182.method3671();
        if (method3546 < 0 || (Class247.field3176 != 0 && method3546 > Class247.field3176)) {
            throw new RuntimeException();
        }
        final byte[] array3 = new byte[method3546];
        if (method3544 == 1) {
            Class176.method3489(array3, method3546, array, method3545, 9);
        }
        else {
            Class247.field3172.method3483(class182, array3);
        }
        return array3;
    }
}
