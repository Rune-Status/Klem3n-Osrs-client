import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ao")
public class Class33 extends Class20
{
    @ObfuscatedName("mn")
    @ObfuscatedSignature(signature = "Lfp;")
    static Class156 field294;
    @ObfuscatedName("n")
    HashSet field292;
    @ObfuscatedName("f")
    HashSet field291;
    @ObfuscatedName("g")
    List field290;
    
    @ObfuscatedName("bb")
    @ObfuscatedSignature(signature = "(Lgk;Lgk;Lgk;IZB)V", garbageValue = "-46")
    void method550(final Class182 class182, final Class182 class183, final Class182 class184, final int n, final boolean b) {
        this.method200(class182, n);
        final int method3550 = class184.method3550();
        this.field292 = new HashSet(method3550);
        for (int i = 0; i < method3550; ++i) {
            final Class10 class185 = new Class10();
            try {
                class185.method95(class183, class184);
            }
            catch (IllegalStateException ex) {
                continue;
            }
            this.field292.add(class185);
        }
        final int method3551 = class184.method3550();
        this.field291 = new HashSet(method3551);
        for (int j = 0; j < method3551; ++j) {
            final Class34 class186 = new Class34();
            try {
                class186.method561(class183, class184);
            }
            catch (IllegalStateException ex2) {
                continue;
            }
            this.field291.add(class186);
        }
        this.method551(class183, b);
    }
    
    @ObfuscatedName("bx")
    @ObfuscatedSignature(signature = "(Lgk;ZI)V", garbageValue = "-182782257")
    void method551(final Class182 class182, final boolean b) {
        this.field290 = new LinkedList();
        for (int method3550 = class182.method3550(), i = 0; i < method3550; ++i) {
            final int method3551 = class182.method3546();
            final Class226 class183 = new Class226(class182.method3671());
            final boolean b2 = class182.method3544() == 1;
            if (b || !b2) {
                this.field290.add(new Class13(method3551, class183));
            }
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "([BIII)Z", garbageValue = "1833687101")
    static final boolean method557(final byte[] array, final int n, final int n2) {
        boolean b = true;
        final Class182 class182 = new Class182(array);
        int n3 = -1;
    Label_0069_Outer:
        while (true) {
            final int method3563 = class182.method3563();
            if (method3563 == 0) {
                break;
            }
            n3 += method3563;
            int n4 = 0;
            int n5 = 0;
            while (true) {
                if (n5 != 0) {
                    if (class182.method3562() == 0) {
                        break;
                    }
                    class182.method3544();
                }
                else {
                    final int method3564 = class182.method3562();
                    if (method3564 == 0) {
                        break;
                    }
                    n4 += method3564 - 1;
                    final int n6 = n4 & 0x3F;
                    final int n7 = n4 >> 6 & 0x3F;
                    final int n8 = class182.method3544() >> 2;
                    final int n9 = n7 + n;
                    final int n10 = n6 + n2;
                    if (n9 <= 0 || n10 <= 0 || n9 >= 103 || n10 >= 103) {
                        continue Label_0069_Outer;
                    }
                    final Class268 method3565 = Class110.method2527(n3);
                    if (n8 == 22 && Client.field585 && method3565.field3388 == 0 && method3565.field3386 != 1 && !method3565.field3407) {
                        continue Label_0069_Outer;
                    }
                    if (!method3565.method5051()) {
                        ++Client.field635;
                        b = false;
                    }
                    n5 = 1;
                }
            }
            while (true) {
                continue Label_0069_Outer;
            }
        }
        return b;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(IIII)I", garbageValue = "-2008842241")
    static final int method558(final int n, final int n2, final int n3) {
        final int n4 = 256 - n3;
        return ((n2 & 0xFF00) * n3 + (n & 0xFF00) * n4 & 0xFF0000) + ((n2 & 0xFF00FF) * n3 + n4 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
    }
    
    @ObfuscatedName("fr")
    @ObfuscatedSignature(signature = "(II)V", garbageValue = "2035290647")
    static void method559(final int n) {
        if (n == -3) {
            Class2.method22("Connection timed out.", "Please try using a different world.", "");
        }
        else if (n == -2) {
            Class2.method22("", "Error connecting to server.", "");
        }
        else if (n == -1) {
            Class2.method22("No response from server.", "Please try using a different world.", "");
        }
        else if (n == 3) {
            Class78.field1081 = 3;
        }
        else if (n == 4) {
            Class2.method22("Your account has been disabled.", "Please check your message-centre for details.", "");
        }
        else if (n == 5) {
            Class2.method22("Your account has not logged out from its last", "session or the server is too busy right now.", "Please try again in a few minutes.");
        }
        else if (n == 6) {
            Class2.method22("RuneScape has been updated!", "Please reload this page.", "");
        }
        else if (n == 7) {
            Class2.method22("This world is full.", "Please use a different world.", "");
        }
        else if (n == 8) {
            Class2.method22("Unable to connect.", "Login server offline.", "");
        }
        else if (n == 9) {
            Class2.method22("Login limit exceeded.", "Too many connections from your address.", "");
        }
        else if (n == 10) {
            Class2.method22("Unable to connect.", "Bad session id.", "");
        }
        else if (n == 11) {
            Class2.method22("We suspect someone knows your password.", "Press 'change your password' on front page.", "");
        }
        else if (n == 12) {
            Class2.method22("You need a members account to login to this world.", "Please subscribe, or use a different world.", "");
        }
        else if (n == 13) {
            Class2.method22("Could not complete login.", "Please try using a different world.", "");
        }
        else if (n == 14) {
            Class2.method22("The server is being updated.", "Please wait 1 minute and try again.", "");
        }
        else if (n == 16) {
            Class2.method22("Too many login attempts.", "Please wait a few minutes before trying again.", "");
        }
        else if (n == 17) {
            Class2.method22("You are standing in a members-only area.", "To play on this world move to a free area first", "");
        }
        else if (n == 18) {
            Class2.method22("Account locked as we suspect it has been stolen.", "Press 'recover a locked account' on front page.", "");
        }
        else if (n == 19) {
            Class2.method22("This world is running a closed Beta.", "Sorry invited players only.", "Please use a different world.");
        }
        else if (n == 20) {
            Class2.method22("Invalid loginserver requested.", "Please try using a different world.", "");
        }
        else if (n == 22) {
            Class2.method22("Malformed login packet.", "Please try again.", "");
        }
        else if (n == 23) {
            Class2.method22("No reply from loginserver.", "Please wait 1 minute and try again.", "");
        }
        else if (n == 24) {
            Class2.method22("Error loading your profile.", "Please contact customer support.", "");
        }
        else if (n == 25) {
            Class2.method22("Unexpected loginserver response.", "Please try using a different world.", "");
        }
        else if (n == 26) {
            Class2.method22("This computers address has been blocked", "as it was used to break our rules.", "");
        }
        else if (n == 27) {
            Class2.method22("", "Service unavailable.", "");
        }
        else if (n == 31) {
            Class2.method22("Your account must have a displayname set", "in order to play the game.  Please set it", "via the website, or the main game.");
        }
        else if (n == 32) {
            Class2.method22("Your attempt to log into your account was", "unsuccessful.  Don't worry, you can sort", "this out by visiting the billing system.");
        }
        else if (n == 37) {
            Class2.method22("Your account is currently inaccessible.", "Please try again in a few minutes.", "");
        }
        else if (n == 38) {
            Class2.method22("You need to vote to play!", "Visit runescape.com and vote,", "and then come back here!");
        }
        else if (n == 55) {
            Class78.field1081 = 8;
        }
        else {
            if (n == 56) {
                Class2.method22("Enter the 6-digit code generated by your", "authenticator app.", "");
                Class48.method947(11);
                return;
            }
            if (n == 57) {
                Class2.method22("The code you entered was incorrect.", "Please try again.", "");
                Class48.method947(11);
                return;
            }
            if (n == 61) {
                Class78.field1081 = 7;
            }
            else {
                Class2.method22("Unexpected server response", "Please try using a different world.", "");
            }
        }
        Class48.method947(10);
    }
}
