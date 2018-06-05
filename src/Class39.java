import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ar")
public final class Class39 implements KeyListener, FocusListener
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lar;")
    public static Class39 field337;
    @ObfuscatedName("cw")
    public static boolean[] field341;
    @ObfuscatedName("cf")
    public static char field342;
    @ObfuscatedName("cr")
    public static int[] field343;
    @ObfuscatedName("cv")
    @ObfuscatedGetter(intValue = -149878467)
    public static int field344;
    @ObfuscatedName("cg")
    @ObfuscatedGetter(intValue = 90351649)
    public static int field329;
    @ObfuscatedName("cs")
    static char[] field346;
    @ObfuscatedName("ct")
    static int[] field348;
    @ObfuscatedName("cc")
    public static int[] field338;
    @ObfuscatedName("cx")
    @ObfuscatedGetter(intValue = 1261945265)
    public static int field349;
    @ObfuscatedName("cj")
    @ObfuscatedGetter(intValue = 2144083495)
    public static int field350;
    @ObfuscatedName("ci")
    @ObfuscatedGetter(intValue = -1066478221)
    public static int field351;
    @ObfuscatedName("cn")
    @ObfuscatedGetter(intValue = 227916931)
    public static int field352;
    @ObfuscatedName("cp")
    @ObfuscatedGetter(intValue = 1163969327)
    public static volatile int field353;
    @ObfuscatedName("cz")
    static int[] field334;
    
    static {
        Class39.field337 = new Class39();
        Class39.field341 = new boolean[112];
        Class39.field343 = new int[128];
        Class39.field344 = 0;
        Class39.field329 = 0;
        Class39.field346 = new char[128];
        Class39.field348 = new int[128];
        Class39.field338 = new int[128];
        Class39.field349 = 0;
        Class39.field350 = 0;
        Class39.field351 = 0;
        Class39.field352 = 0;
        Class39.field353 = 0;
        Class39.field334 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
    }
    
    @Override
    public final synchronized void keyPressed(final KeyEvent keyEvent) {
        if (Class39.field337 != null) {
            final int keyCode = keyEvent.getKeyCode();
            int n;
            if (keyCode >= 0 && keyCode < Class39.field334.length) {
                n = Class39.field334[keyCode];
                if ((n & 0x80) != 0x0) {
                    n = -1;
                }
            }
            else {
                n = -1;
            }
            if (Class39.field329 >= 0 && n >= 0) {
                Class39.field343[Class39.field329] = n;
                Class39.field329 = (Class39.field329 + 1 & 0x7F);
                if (Class39.field344 == Class39.field329) {
                    Class39.field329 = -1;
                }
            }
            if (n >= 0) {
                final int field351 = Class39.field351 + 1 & 0x7F;
                if (field351 != Class39.field350) {
                    Class39.field348[Class39.field351] = n;
                    Class39.field346[Class39.field351] = '\0';
                    Class39.field351 = field351;
                }
            }
            if ((keyEvent.getModifiers() & 0xA) != 0x0 || n == 85 || n == 10) {
                keyEvent.consume();
            }
        }
    }
    
    @Override
    public final synchronized void keyReleased(final KeyEvent keyEvent) {
        if (Class39.field337 != null) {
            final int keyCode = keyEvent.getKeyCode();
            int n;
            if (keyCode >= 0 && keyCode < Class39.field334.length) {
                n = (Class39.field334[keyCode] & 0xFFFFFF7F);
            }
            else {
                n = -1;
            }
            if (Class39.field329 >= 0 && n >= 0) {
                Class39.field343[Class39.field329] = ~n;
                Class39.field329 = (Class39.field329 + 1 & 0x7F);
                if (Class39.field329 == Class39.field344) {
                    Class39.field329 = -1;
                }
            }
        }
        keyEvent.consume();
    }
    
    @Override
    public final synchronized void focusLost(final FocusEvent focusEvent) {
        if (Class39.field337 != null) {
            Class39.field329 = -1;
        }
    }
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
    }
    
    @Override
    public final void keyTyped(final KeyEvent keyEvent) {
        if (Class39.field337 != null) {
            final char keyChar = keyEvent.getKeyChar();
            if (keyChar != '\0' && keyChar != '\uffff' && Class293.method5496(keyChar)) {
                final int field351 = Class39.field351 + 1 & 0x7F;
                if (field351 != Class39.field350) {
                    Class39.field348[Class39.field351] = -1;
                    Class39.field346[Class39.field351] = keyChar;
                    Class39.field351 = field351;
                }
            }
        }
        keyEvent.consume();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;Lgu;I)Lgu;", garbageValue = "123380361")
    static final Class197 method691(final Class182 class182, Class197 class183) {
        final int method3544 = class182.method3544();
        if (class183 == null) {
            class183 = new Class197(Class146.method3193(method3544));
        }
        for (int i = 0; i < method3544; ++i) {
            final boolean b = class182.method3544() == 1;
            final int method3545 = class182.method3552();
            Class204 class184;
            if (b) {
                class184 = new Class195(class182.method3738());
            }
            else {
                class184 = new Class211(class182.method3671());
            }
            class183.method3944(class184, method3545);
        }
        return class183;
    }
    
    @ObfuscatedName("x")
    public static int method673(final long n) {
        return (int)(n >>> 17 & 0xFFFFFFFFL);
    }
    
    @ObfuscatedName("hs")
    @ObfuscatedSignature(signature = "(IIIILjava/lang/String;Ljava/lang/String;IIB)V", garbageValue = "44")
    static final void method692(final int field582, final int n, int n2, final int field583, final String s, final String s2, final int n3, final int n4) {
        if (n2 >= 2000) {
            n2 -= 2000;
        }
        Label_3643: {
            if (n2 == 1) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method433 = Class26.method433(Class169.field2199, Client.field626.field1218);
                method433.field2257.method3771(Class297.field3683);
                method433.field2257.method3532(Class39.field341[82] ? 1 : 0);
                method433.field2257.method3673(Class187.field2372);
                method433.field2257.method3582(field582 + Class62.field868);
                method433.field2257.method3755(Client.field754 + n);
                method433.field2257.method3583(field583);
                method433.field2257.method3755(Class13.field84);
                Client.field626.method1980(method433);
            }
            else if (n2 == 2) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method434 = Class26.method433(Class169.field2172, Client.field626.field1218);
                method434.field2257.method3532(Class39.field341[82] ? 1 : 0);
                method434.field2257.method3594(Class40.field361);
                method434.field2257.method3771(Client.field754 + n);
                method434.field2257.method3771(Client.field736);
                method434.field2257.method3583(field582 + Class62.field868);
                method434.field2257.method3771(field583);
                Client.field626.method1980(method434);
            }
            else if (n2 == 3) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method435 = Class26.method433(Class169.field2186, Client.field626.field1218);
                method435.field2257.method3755(Client.field754 + n);
                method435.field2257.method3583(field582 + Class62.field868);
                method435.field2257.method3755(field583);
                method435.field2257.method3532(Class39.field341[82] ? 1 : 0);
                Client.field626.method1980(method435);
            }
            else if (n2 == 4) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method436 = Class26.method433(Class169.field2169, Client.field626.field1218);
                method436.field2257.method3582(field582 + Class62.field868);
                method436.field2257.method3755(Client.field754 + n);
                method436.field2257.method3574(Class39.field341[82] ? 1 : 0);
                method436.field2257.method3771(field583);
                Client.field626.method1980(method436);
            }
            else if (n2 == 5) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method437 = Class26.method433(Class169.field2216, Client.field626.field1218);
                method437.field2257.method3771(Client.field754 + n);
                method437.field2257.method3771(field582 + Class62.field868);
                method437.field2257.method3771(field583);
                method437.field2257.method3575(Class39.field341[82] ? 1 : 0);
                Client.field626.method1980(method437);
            }
            else if (n2 == 6) {
                Client.field681 = n3;
                Client.field682 = n4;
                Client.field684 = 2;
                Client.field803 = 0;
                Client.field808 = field582;
                Client.field809 = n;
                final Class172 method438 = Class26.method433(Class169.field2232, Client.field626.field1218);
                method438.field2257.method3583(field583);
                method438.field2257.method3575(Class39.field341[82] ? 1 : 0);
                method438.field2257.method3771(field582 + Class62.field868);
                method438.field2257.method3582(Client.field754 + n);
                Client.field626.method1980(method438);
            }
            else if (n2 == 7) {
                if (Client.field843[field583] != null) {
                    Client.field681 = n3;
                    Client.field682 = n4;
                    Client.field684 = 2;
                    Client.field803 = 0;
                    Client.field808 = field582;
                    Client.field809 = n;
                    final Class172 method439 = Class26.method433(Class169.field2184, Client.field626.field1218);
                    method439.field2257.method3755(Class13.field84);
                    method439.field2257.method3576(Class39.field341[82] ? 1 : 0);
                    method439.field2257.method3582(field583);
                    method439.field2257.method3583(Class297.field3683);
                    method439.field2257.method3594(Class187.field2372);
                    Client.field626.method1980(method439);
                }
            }
            else {
                Label_1391: {
                    if (n2 == 8) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method440 = Class26.method433(Class169.field2204, Client.field626.field1218);
                            method440.field2257.method3707(Class40.field361);
                            method440.field2257.method3583(Client.field736);
                            method440.field2257.method3582(field583);
                            method440.field2257.method3532(Class39.field341[82] ? 1 : 0);
                            Client.field626.method1980(method440);
                        }
                    }
                    else if (n2 == 9) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method441 = Class26.method433(Class169.field2207, Client.field626.field1218);
                            method441.field2257.method3583(field583);
                            method441.field2257.method3575(Class39.field341[82] ? 1 : 0);
                            Client.field626.method1980(method441);
                        }
                    }
                    else if (n2 == 10) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method442 = Class26.method433(Class169.field2223, Client.field626.field1218);
                            method442.field2257.method3771(field583);
                            method442.field2257.method3576(Class39.field341[82] ? 1 : 0);
                            Client.field626.method1980(method442);
                        }
                    }
                    else if (n2 == 11) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method443 = Class26.method433(Class169.field2198, Client.field626.field1218);
                            method443.field2257.method3574(Class39.field341[82] ? 1 : 0);
                            method443.field2257.method3771(field583);
                            Client.field626.method1980(method443);
                        }
                    }
                    else if (n2 == 12) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method444 = Class26.method433(Class169.field2229, Client.field626.field1218);
                            method444.field2257.method3574(Class39.field341[82] ? 1 : 0);
                            method444.field2257.method3582(field583);
                            Client.field626.method1980(method444);
                        }
                    }
                    else if (n2 == 13) {
                        if (Client.field843[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method445 = Class26.method433(Class169.field2208, Client.field626.field1218);
                            method445.field2257.method3583(field583);
                            method445.field2257.method3575(Class39.field341[82] ? 1 : 0);
                            Client.field626.method1980(method445);
                        }
                    }
                    else if (n2 == 14) {
                        if (Client.field610[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method446 = Class26.method433(Class169.field2189, Client.field626.field1218);
                            method446.field2257.method3771(Class13.field84);
                            method446.field2257.method3582(Class297.field3683);
                            method446.field2257.method3673(Class187.field2372);
                            method446.field2257.method3576(Class39.field341[82] ? 1 : 0);
                            method446.field2257.method3755(field583);
                            Client.field626.method1980(method446);
                        }
                    }
                    else if (n2 == 15) {
                        if (Client.field610[field583] != null) {
                            Client.field681 = n3;
                            Client.field682 = n4;
                            Client.field684 = 2;
                            Client.field803 = 0;
                            Client.field808 = field582;
                            Client.field809 = n;
                            final Class172 method447 = Class26.method433(Class169.field2212, Client.field626.field1218);
                            method447.field2257.method3687(Class40.field361);
                            method447.field2257.method3582(field583);
                            method447.field2257.method3583(Client.field736);
                            method447.field2257.method3574(Class39.field341[82] ? 1 : 0);
                            Client.field626.method1980(method447);
                        }
                    }
                    else if (n2 == 16) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method448 = Class26.method433(Class169.field2234, Client.field626.field1218);
                        method448.field2257.method3771(field583);
                        method448.field2257.method3532(Class39.field341[82] ? 1 : 0);
                        method448.field2257.method3583(Class297.field3683);
                        method448.field2257.method3583(field582 + Class62.field868);
                        method448.field2257.method3755(Client.field754 + n);
                        method448.field2257.method3707(Class187.field2372);
                        method448.field2257.method3755(Class13.field84);
                        Client.field626.method1980(method448);
                    }
                    else if (n2 == 17) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method449 = Class26.method433(Class169.field2143, Client.field626.field1218);
                        method449.field2257.method3583(field583);
                        method449.field2257.method3582(field582 + Class62.field868);
                        method449.field2257.method3583(Client.field736);
                        method449.field2257.method3771(Client.field754 + n);
                        method449.field2257.method3673(Class40.field361);
                        method449.field2257.method3532(Class39.field341[82] ? 1 : 0);
                        Client.field626.method1980(method449);
                    }
                    else if (n2 == 18) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method450 = Class26.method433(Class169.field2210, Client.field626.field1218);
                        method450.field2257.method3771(Client.field754 + n);
                        method450.field2257.method3575(Class39.field341[82] ? 1 : 0);
                        method450.field2257.method3583(field582 + Class62.field868);
                        method450.field2257.method3755(field583);
                        Client.field626.method1980(method450);
                    }
                    else if (n2 == 19) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method451 = Class26.method433(Class169.field2214, Client.field626.field1218);
                        method451.field2257.method3582(field583);
                        method451.field2257.method3583(field582 + Class62.field868);
                        method451.field2257.method3582(Client.field754 + n);
                        method451.field2257.method3576(Class39.field341[82] ? 1 : 0);
                        Client.field626.method1980(method451);
                    }
                    else if (n2 == 20) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method452 = Class26.method433(Class169.field2161, Client.field626.field1218);
                        method452.field2257.method3755(field582 + Class62.field868);
                        method452.field2257.method3583(field583);
                        method452.field2257.method3582(Client.field754 + n);
                        method452.field2257.method3575(Class39.field341[82] ? 1 : 0);
                        Client.field626.method1980(method452);
                    }
                    else if (n2 == 21) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method453 = Class26.method433(Class169.field2205, Client.field626.field1218);
                        method453.field2257.method3583(Client.field754 + n);
                        method453.field2257.method3583(field583);
                        method453.field2257.method3582(field582 + Class62.field868);
                        method453.field2257.method3574(Class39.field341[82] ? 1 : 0);
                        Client.field626.method1980(method453);
                    }
                    else if (n2 == 22) {
                        Client.field681 = n3;
                        Client.field682 = n4;
                        Client.field684 = 2;
                        Client.field803 = 0;
                        Client.field808 = field582;
                        Client.field809 = n;
                        final Class172 method454 = Class26.method433(Class169.field2147, Client.field626.field1218);
                        method454.field2257.method3582(field583);
                        method454.field2257.method3582(field582 + Class62.field868);
                        method454.field2257.method3755(Client.field754 + n);
                        method454.field2257.method3576(Class39.field341[82] ? 1 : 0);
                        Client.field626.method1980(method454);
                    }
                    else if (n2 == 23) {
                        if (Client.field716) {
                            Class28.field248.method2974();
                        }
                        else {
                            Class28.field248.method2909(Class13.field82, field582, n, true);
                        }
                    }
                    else if (n2 == 24) {
                        final Class230 method455 = Class26.method434(n);
                        boolean method456 = true;
                        if (method455.field2609 > 0) {
                            method456 = Class25.method426(method455);
                        }
                        if (method456) {
                            final Class172 method457 = Class26.method433(Class169.field2230, Client.field626.field1218);
                            method457.field2257.method3707(n);
                            Client.field626.method1980(method457);
                        }
                    }
                    else {
                        if (n2 == 25) {
                            final Class230 method458 = Class146.method3191(n, field582);
                            if (method458 != null) {
                                Class34.method585();
                                Class155.method3275(n, field582, Signlink.method3252(Class24.method425(method458)), method458.field2649);
                                Client.field733 = 0;
                                Client.field612 = Class151.method3239(method458);
                                if (Client.field612 == null) {
                                    Client.field612 = "Null";
                                }
                                if (method458.field2604) {
                                    Client.field739 = method458.field2679 + Class6.method71(16777215);
                                }
                                else {
                                    Client.field739 = Class6.method71(65280) + method458.field2722 + Class6.method71(16777215);
                                }
                            }
                            return;
                        }
                        if (n2 == 26) {
                            Client.field626.method1980(Class26.method433(Class169.field2195, Client.field626.field1218));
                            for (Class55 class55 = (Class55)Client.field741.method4018(); class55 != null; class55 = (Class55)Client.field741.method4019()) {
                                if (class55.field494 == 0 || class55.field494 == 3) {
                                    Class20.method261(class55, true);
                                }
                            }
                            if (Client.field744 != null) {
                                Class60.method1114(Client.field744);
                                Client.field744 = null;
                            }
                        }
                        else if (n2 == 28) {
                            final Class172 method459 = Class26.method433(Class169.field2230, Client.field626.field1218);
                            method459.field2257.method3707(n);
                            Client.field626.method1980(method459);
                            final Class230 method460 = Class26.method434(n);
                            if (method460.field2659 != null && method460.field2659[0][0] == 5) {
                                final int n5 = method460.field2659[0][1];
                                Class225.field2558[n5] = 1 - Class225.field2558[n5];
                                Class45.method749(n5);
                            }
                        }
                        else if (n2 == 29) {
                            final Class172 method461 = Class26.method433(Class169.field2230, Client.field626.field1218);
                            method461.field2257.method3707(n);
                            Client.field626.method1980(method461);
                            final Class230 method462 = Class26.method434(n);
                            if (method462.field2659 != null && method462.field2659[0][0] == 5) {
                                final int n6 = method462.field2659[0][1];
                                if (Class225.field2558[n6] != method462.field2720[0]) {
                                    Class225.field2558[n6] = method462.field2720[0];
                                    Class45.method749(n6);
                                }
                            }
                        }
                        else if (n2 == 30) {
                            if (Client.field744 == null) {
                                Class82.method1921(n, field582);
                                Class60.method1114(Client.field744 = Class146.method3191(n, field582));
                            }
                        }
                        else {
                            Label_0683: {
                                if (n2 == 31) {
                                    final Class172 method463 = Class26.method433(Class169.field2196, Client.field626.field1218);
                                    method463.field2257.method3687(Class187.field2372);
                                    method463.field2257.method3582(field582);
                                    method463.field2257.method3582(Class297.field3683);
                                    method463.field2257.method3594(n);
                                    method463.field2257.method3755(Class13.field84);
                                    method463.field2257.method3582(field583);
                                    Client.field626.method1980(method463);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 32) {
                                    final Class172 method464 = Class26.method433(Class169.field2165, Client.field626.field1218);
                                    method464.field2257.method3673(Class40.field361);
                                    method464.field2257.method3755(Client.field736);
                                    method464.field2257.method3594(n);
                                    method464.field2257.method3771(field582);
                                    method464.field2257.method3583(field583);
                                    Client.field626.method1980(method464);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 33) {
                                    final Class172 method465 = Class26.method433(Class169.field2175, Client.field626.field1218);
                                    method465.field2257.method3771(field582);
                                    method465.field2257.method3583(field583);
                                    method465.field2257.method3707(n);
                                    Client.field626.method1980(method465);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 34) {
                                    final Class172 method466 = Class26.method433(Class169.field2193, Client.field626.field1218);
                                    method466.field2257.method3755(field582);
                                    method466.field2257.method3582(field583);
                                    method466.field2257.method3687(n);
                                    Client.field626.method1980(method466);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 35) {
                                    final Class172 method467 = Class26.method433(Class169.field2166, Client.field626.field1218);
                                    method467.field2257.method3582(field582);
                                    method467.field2257.method3673(n);
                                    method467.field2257.method3582(field583);
                                    Client.field626.method1980(method467);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 36) {
                                    final Class172 method468 = Class26.method433(Class169.field2191, Client.field626.field1218);
                                    method468.field2257.method3771(field583);
                                    method468.field2257.method3583(field582);
                                    method468.field2257.method3673(n);
                                    Client.field626.method1980(method468);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else if (n2 == 37) {
                                    final Class172 method469 = Class26.method433(Class169.field2197, Client.field626.field1218);
                                    method469.field2257.method3673(n);
                                    method469.field2257.method3582(field582);
                                    method469.field2257.method3583(field583);
                                    Client.field626.method1980(method469);
                                    Client.field686 = 0;
                                    Class240.field3096 = Class26.method434(n);
                                    Client.field582 = field582;
                                }
                                else {
                                    if (n2 == 38) {
                                        Class34.method585();
                                        final Class230 method470 = Class26.method434(n);
                                        Client.field733 = 1;
                                        Class13.field84 = field582;
                                        Class187.field2372 = n;
                                        Class297.field3683 = field583;
                                        Class60.method1114(method470);
                                        Client.field734 = Class6.method71(16748608) + Class111.method2563(field583).field3433 + Class6.method71(16777215);
                                        if (Client.field734 == null) {
                                            Client.field734 = "null";
                                        }
                                        return;
                                    }
                                    if (n2 == 39) {
                                        final Class172 method471 = Class26.method433(Class169.field2171, Client.field626.field1218);
                                        method471.field2257.method3594(n);
                                        method471.field2257.method3583(field583);
                                        method471.field2257.method3771(field582);
                                        Client.field626.method1980(method471);
                                        Client.field686 = 0;
                                        Class240.field3096 = Class26.method434(n);
                                        Client.field582 = field582;
                                    }
                                    else if (n2 == 40) {
                                        final Class172 method472 = Class26.method433(Class169.field2151, Client.field626.field1218);
                                        method472.field2257.method3707(n);
                                        method472.field2257.method3582(field583);
                                        method472.field2257.method3582(field582);
                                        Client.field626.method1980(method472);
                                        Client.field686 = 0;
                                        Class240.field3096 = Class26.method434(n);
                                        Client.field582 = field582;
                                    }
                                    else if (n2 == 41) {
                                        final Class172 method473 = Class26.method433(Class169.field2202, Client.field626.field1218);
                                        method473.field2257.method3582(field583);
                                        method473.field2257.method3582(field582);
                                        method473.field2257.method3687(n);
                                        Client.field626.method1980(method473);
                                        Client.field686 = 0;
                                        Class240.field3096 = Class26.method434(n);
                                        Client.field582 = field582;
                                    }
                                    else if (n2 == 42) {
                                        final Class172 method474 = Class26.method433(Class169.field2200, Client.field626.field1218);
                                        method474.field2257.method3771(field583);
                                        method474.field2257.method3594(n);
                                        method474.field2257.method3755(field582);
                                        Client.field626.method1980(method474);
                                        Client.field686 = 0;
                                        Class240.field3096 = Class26.method434(n);
                                        Client.field582 = field582;
                                    }
                                    else if (n2 == 43) {
                                        final Class172 method475 = Class26.method433(Class169.field2140, Client.field626.field1218);
                                        method475.field2257.method3583(field583);
                                        method475.field2257.method3707(n);
                                        method475.field2257.method3582(field582);
                                        Client.field626.method1980(method475);
                                        Client.field686 = 0;
                                        Class240.field3096 = Class26.method434(n);
                                        Client.field582 = field582;
                                    }
                                    else if (n2 == 44) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method476 = Class26.method433(Class169.field2206, Client.field626.field1218);
                                            method476.field2257.method3532(Class39.field341[82] ? 1 : 0);
                                            method476.field2257.method3755(field583);
                                            Client.field626.method1980(method476);
                                        }
                                    }
                                    else if (n2 == 45) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method477 = Class26.method433(Class169.field2181, Client.field626.field1218);
                                            method477.field2257.method3576(Class39.field341[82] ? 1 : 0);
                                            method477.field2257.method3755(field583);
                                            Client.field626.method1980(method477);
                                        }
                                    }
                                    else if (n2 == 46) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method478 = Class26.method433(Class169.field2137, Client.field626.field1218);
                                            method478.field2257.method3574(Class39.field341[82] ? 1 : 0);
                                            method478.field2257.method3583(field583);
                                            Client.field626.method1980(method478);
                                        }
                                    }
                                    else if (n2 == 47) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method479 = Class26.method433(Class169.field2220, Client.field626.field1218);
                                            method479.field2257.method3771(field583);
                                            method479.field2257.method3532(Class39.field341[82] ? 1 : 0);
                                            Client.field626.method1980(method479);
                                        }
                                    }
                                    else if (n2 == 48) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method480 = Class26.method433(Class169.field2217, Client.field626.field1218);
                                            method480.field2257.method3576(Class39.field341[82] ? 1 : 0);
                                            method480.field2257.method3771(field583);
                                            Client.field626.method1980(method480);
                                        }
                                    }
                                    else if (n2 == 49) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method481 = Class26.method433(Class169.field2163, Client.field626.field1218);
                                            method481.field2257.method3575(Class39.field341[82] ? 1 : 0);
                                            method481.field2257.method3771(field583);
                                            Client.field626.method1980(method481);
                                        }
                                    }
                                    else if (n2 == 50) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method482 = Class26.method433(Class169.field2222, Client.field626.field1218);
                                            method482.field2257.method3582(field583);
                                            method482.field2257.method3574(Class39.field341[82] ? 1 : 0);
                                            Client.field626.method1980(method482);
                                        }
                                    }
                                    else if (n2 == 51) {
                                        if (Client.field610[field583] != null) {
                                            Client.field681 = n3;
                                            Client.field682 = n4;
                                            Client.field684 = 2;
                                            Client.field803 = 0;
                                            Client.field808 = field582;
                                            Client.field809 = n;
                                            final Class172 method483 = Class26.method433(Class169.field2178, Client.field626.field1218);
                                            method483.field2257.method3771(field583);
                                            method483.field2257.method3575(Class39.field341[82] ? 1 : 0);
                                            Client.field626.method1980(method483);
                                        }
                                    }
                                    else {
                                        if (n2 != 57) {
                                            if (n2 == 58) {
                                                final Class230 method484 = Class146.method3191(n, field582);
                                                if (method484 != null) {
                                                    final Class172 method485 = Class26.method433(Class169.field2159, Client.field626.field1218);
                                                    method485.field2257.method3673(Class40.field361);
                                                    method485.field2257.method3771(Client.field737);
                                                    method485.field2257.method3673(n);
                                                    method485.field2257.method3582(method484.field2649);
                                                    method485.field2257.method3755(field582);
                                                    method485.field2257.method3755(Client.field736);
                                                    Client.field626.method1980(method485);
                                                }
                                                break Label_1391;
                                            }
                                            else {
                                                if (n2 == 1001) {
                                                    Client.field681 = n3;
                                                    Client.field682 = n4;
                                                    Client.field684 = 2;
                                                    Client.field803 = 0;
                                                    Client.field808 = field582;
                                                    Client.field809 = n;
                                                    final Class172 method486 = Class26.method433(Class169.field2139, Client.field626.field1218);
                                                    method486.field2257.method3582(Client.field754 + n);
                                                    method486.field2257.method3771(field583);
                                                    method486.field2257.method3583(field582 + Class62.field868);
                                                    method486.field2257.method3532(Class39.field341[82] ? 1 : 0);
                                                    Client.field626.method1980(method486);
                                                    break Label_1391;
                                                }
                                                if (n2 == 1002) {
                                                    Client.field681 = n3;
                                                    Client.field682 = n4;
                                                    Client.field684 = 2;
                                                    Client.field803 = 0;
                                                    final Class172 method487 = Class26.method433(Class169.field2162, Client.field626.field1218);
                                                    method487.field2257.method3755(field583);
                                                    Client.field626.method1980(method487);
                                                    break Label_3643;
                                                }
                                                if (n2 == 1003) {
                                                    Client.field681 = n3;
                                                    Client.field682 = n4;
                                                    Client.field684 = 2;
                                                    Client.field803 = 0;
                                                    final Class72 class56 = Client.field843[field583];
                                                    if (class56 == null) {
                                                        break Label_3643;
                                                    }
                                                    Class271 class57 = class56.field1037;
                                                    if (class57.field3516 != null) {
                                                        class57 = class57.method5189();
                                                    }
                                                    if (class57 != null) {
                                                        final Class172 method488 = Class26.method433(Class169.field2146, Client.field626.field1218);
                                                        method488.field2257.method3582(class57.field3510);
                                                        Client.field626.method1980(method488);
                                                    }
                                                    break Label_3643;
                                                }
                                                else {
                                                    if (n2 == 1004) {
                                                        Client.field681 = n3;
                                                        Client.field682 = n4;
                                                        Client.field684 = 2;
                                                        Client.field803 = 0;
                                                        final Class172 method489 = Class26.method433(Class169.field2182, Client.field626.field1218);
                                                        method489.field2257.method3583(field583);
                                                        Client.field626.method1980(method489);
                                                        break Label_1391;
                                                    }
                                                    if (n2 == 1005) {
                                                        final Class230 method490 = Class26.method434(n);
                                                        if (method490 != null && method490.field2725[field582] >= 100000) {
                                                            Class143.method3172(27, "", method490.field2725[field582] + " x " + Class111.method2563(field583).field3433);
                                                        }
                                                        else {
                                                            final Class172 method491 = Class26.method433(Class169.field2182, Client.field626.field1218);
                                                            method491.field2257.method3583(field583);
                                                            Client.field626.method1980(method491);
                                                        }
                                                        Client.field686 = 0;
                                                        Class240.field3096 = Class26.method434(n);
                                                        Client.field582 = field582;
                                                        break Label_3643;
                                                    }
                                                    if (n2 != 1007) {
                                                        if (n2 != 1008 && n2 != 1010 && n2 != 1009) {
                                                            if (n2 != 1011) {
                                                                if (n2 != 1012) {
                                                                    break Label_0683;
                                                                }
                                                            }
                                                        }
                                                        Class53.field476.method6008(n2, field583, new Class226(field582), new Class226(n));
                                                        break Label_1391;
                                                    }
                                                }
                                            }
                                        }
                                        final Class230 method492 = Class146.method3191(n, field582);
                                        if (method492 != null) {
                                            Class45.method747(field583, n, field582, method492.field2649, s2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (Client.field733 != 0) {
            Client.field733 = 0;
            Class60.method1114(Class26.method434(Class187.field2372));
        }
        if (Client.field785) {
            Class34.method585();
        }
        if (Class240.field3096 != null && Client.field686 == 0) {
            Class60.method1114(Class240.field3096);
        }
    }
}
