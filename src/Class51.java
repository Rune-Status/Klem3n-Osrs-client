import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ag")
public class Class51
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lce;")
    Class84 field466;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = -1485415085)
    int field463;
    @ObfuscatedName("s")
    int[] field462;
    @ObfuscatedName("l")
    String[] field465;
    
    Class51() {
        this.field463 = -1;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(S)[Ljr;", garbageValue = "128")
    public static Class279[] method996() {
        return new Class279[] { Class279.field3596, Class279.field3580, Class279.field3582, Class279.field3585, Class279.field3593, Class279.field3587, Class279.field3583, Class279.field3595, Class279.field3592, Class279.field3588, Class279.field3586, Class279.field3590, Class279.field3594, Class279.field3589, Class279.field3581, Class279.field3584 };
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;B)Ljava/lang/String;", garbageValue = "1")
    public static String method998(final String s) {
        final int length = s.length();
        final char[] array = new char[length];
        int n = 2;
        for (int i = 0; i < length; ++i) {
            char c = s.charAt(i);
            if (n == 0) {
                c = Character.toLowerCase(c);
            }
            else if (n == 2 || Character.isUpperCase(c)) {
                c = Class291.method5450(c);
            }
            if (Character.isLetter(c)) {
                n = 0;
            }
            else if (c == '.' || c == '?' || c == '!') {
                n = 2;
            }
            else if (Character.isSpaceChar(c)) {
                if (n != 2) {
                    n = 1;
                }
            }
            else {
                n = 1;
            }
            array[i] = c;
        }
        return new String(array);
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-827181248")
    static final void method995(final String s) {
        Class143.method3172(30, "", "Please remove " + s + " from your ignore list first");
    }
    
    @ObfuscatedName("gy")
    @ObfuscatedSignature(signature = "(ZLgi;I)V", garbageValue = "1560742456")
    static final void method994(final boolean field759, final Class189 class189) {
        if (!(Client.field759 = field759)) {
            final int method3613 = class189.method3613();
            final int method3614 = class189.method3646();
            final int method3615 = class189.method3550();
            Class67.field973 = new int[method3615][4];
            for (int i = 0; i < method3615; ++i) {
                for (int j = 0; j < 4; ++j) {
                    Class67.field973[i][j] = class189.method3671();
                }
            }
            Class143.field1900 = new int[method3615];
            Class295.field3676 = new int[method3615];
            Class9.field56 = new int[method3615];
            Class171.field2252 = new byte[method3615][];
            Class29.field253 = new byte[method3615][];
            boolean b = false;
            if ((method3613 / 8 == 48 || method3613 / 8 == 49) && method3614 / 8 == 48) {
                b = true;
            }
            if (method3613 / 8 == 48 && method3614 / 8 == 148) {
                b = true;
            }
            int n = 0;
            for (int k = (method3613 - 6) / 8; k <= (method3613 + 6) / 8; ++k) {
                int l = (method3614 - 6) / 8;
            Label_0413_Outer:
                while (l <= (method3614 + 6) / 8) {
                    final int n2 = l + (k << 8);
                    while (true) {
                        Label_0473: {
                            if (!b) {
                                break Label_0473;
                            }
                            if (l != 49 && l != 149 && l != 147 && k != 50) {
                                if (k != 49 || l != 47) {
                                    break Label_0473;
                                }
                            }
                            ++l;
                            continue Label_0413_Outer;
                        }
                        Class143.field1900[n] = n2;
                        Class295.field3676[n] = Class246.field3159.method4642("m" + k + "_" + l);
                        Class9.field56[n] = Class246.field3159.method4642("l" + k + "_" + l);
                        ++n;
                        continue;
                    }
                }
            }
            Class62.method1537(method3613, method3614, true);
        }
        else {
            final int method3616 = class189.method3585();
            final int method3617 = class189.method3585();
            final boolean b2 = class189.method3544() == 1;
            final int method3618 = class189.method3550();
            class189.method3823();
            for (int n3 = 0; n3 < 4; ++n3) {
                for (int n4 = 0; n4 < 13; ++n4) {
                    for (int n5 = 0; n5 < 13; ++n5) {
                        if (class189.method3817(1) == 1) {
                            Client.field645[n3][n4][n5] = class189.method3817(26);
                        }
                        else {
                            Client.field645[n3][n4][n5] = -1;
                        }
                    }
                }
            }
            class189.method3816();
            Class67.field973 = new int[method3618][4];
            for (int n6 = 0; n6 < method3618; ++n6) {
                for (int n7 = 0; n7 < 4; ++n7) {
                    Class67.field973[n6][n7] = class189.method3671();
                }
            }
            Class143.field1900 = new int[method3618];
            Class295.field3676 = new int[method3618];
            Class9.field56 = new int[method3618];
            Class171.field2252 = new byte[method3618][];
            Class29.field253 = new byte[method3618][];
            int n8 = 0;
            for (int n9 = 0; n9 < 4; ++n9) {
                for (int n10 = 0; n10 < 13; ++n10) {
                    for (int n11 = 0; n11 < 13; ++n11) {
                        final int n12 = Client.field645[n9][n10][n11];
                        if (n12 != -1) {
                            int n13 = ((n12 >> 14 & 0x3FF) / 8 << 8) + (n12 >> 3 & 0x7FF) / 8;
                            for (int n14 = 0; n14 < n8; ++n14) {
                                if (Class143.field1900[n14] == n13) {
                                    n13 = -1;
                                    break;
                                }
                            }
                            if (n13 != -1) {
                                Class143.field1900[n8] = n13;
                                final int n15 = n13 >> 8 & 0xFF;
                                final int n16 = n13 & 0xFF;
                                Class295.field3676[n8] = Class246.field3159.method4642("m" + n15 + "_" + n16);
                                Class9.field56[n8] = Class246.field3159.method4642("l" + n15 + "_" + n16);
                                ++n8;
                            }
                        }
                    }
                }
            }
            Class62.method1537(method3616, method3617, !b2);
        }
    }
    
    @ObfuscatedName("hn")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "1470602086")
    static final void method997(final int n, final int n2) {
        if (Client.field771 < 2 && Client.field733 == 0 && !Client.field785) {
            return;
        }
        if (!Client.field728) {
            return;
        }
        final int n3 = Client.field771 - 1;
        String s;
        if (Client.field733 == 1 && Client.field771 < 2) {
            s = "Use" + " " + Client.field734 + " " + "->";
        }
        else if (Client.field785 && Client.field771 < 2) {
            s = Client.field612 + " " + Client.field739 + " " + "->";
        }
        else {
            s = Class18.method176(n3);
        }
        if (Client.field771 > 2) {
            s = s + Class6.method71(16777215) + " " + '/' + " " + (Client.field771 - 2) + " more options";
        }
        Class293.field3660.method5530(s, n + 4, n2 + 15, 16777215, 0, Client.field591 / 1000);
    }
}
