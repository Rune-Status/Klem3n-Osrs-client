import java.util.Random;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@ObfuscatedName("kk")
public abstract class Class299 extends Class314
{
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "[Lly;")
    public static Class317[] field3698;
    @ObfuscatedName("b")
    static int field3700;
    @ObfuscatedName("n")
    static int field3691;
    @ObfuscatedName("f")
    static int field3702;
    @ObfuscatedName("g")
    static int field3708;
    @ObfuscatedName("m")
    static int field3704;
    @ObfuscatedName("r")
    static int field3692;
    @ObfuscatedName("t")
    static int field3706;
    @ObfuscatedName("o")
    static int field3701;
    @ObfuscatedName("y")
    static int field3705;
    @ObfuscatedName("a")
    static Random field3709;
    @ObfuscatedName("j")
    static String[] field3710;
    @ObfuscatedName("z")
    byte[][] field3707;
    @ObfuscatedName("w")
    int[] field3703;
    @ObfuscatedName("s")
    int[] field3689;
    @ObfuscatedName("l")
    int[] field3690;
    @ObfuscatedName("u")
    int[] field3693;
    @ObfuscatedName("q")
    int[] field3694;
    @ObfuscatedName("k")
    public int field3695;
    @ObfuscatedName("i")
    public int field3696;
    @ObfuscatedName("x")
    public int field3697;
    @ObfuscatedName("p")
    byte[] field3699;
    
    static {
        Class299.field3700 = -1;
        Class299.field3691 = -1;
        Class299.field3702 = -1;
        Class299.field3708 = -1;
        Class299.field3704 = 0;
        Class299.field3692 = 0;
        Class299.field3706 = 256;
        Class299.field3701 = 0;
        Class299.field3705 = 0;
        Class299.field3709 = new Random();
        Class299.field3710 = new String[100];
    }
    
    Class299(final byte[] array, final int[] field3693, final int[] field3694, final int[] field3695, final int[] field3696, final int[] array2, final byte[][] field3697) {
        this.field3707 = new byte[256][];
        this.field3695 = 0;
        this.field3693 = field3693;
        this.field3694 = field3694;
        this.field3689 = field3695;
        this.field3690 = field3696;
        this.method5540(array);
        this.field3707 = field3697;
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        for (int i = 0; i < 256; ++i) {
            if (this.field3694[i] < n && this.field3690[i] != 0) {
                n = this.field3694[i];
            }
            if (this.field3694[i] + this.field3690[i] > n2) {
                n2 = this.field3694[i] + this.field3690[i];
            }
        }
        this.field3696 = this.field3695 - n;
        this.field3697 = n2 - this.field3695;
    }
    
    Class299(final byte[] array) {
        this.field3707 = new byte[256][];
        this.field3695 = 0;
        this.method5540(array);
    }
    
    @ObfuscatedName("z")
    abstract void vmethod5536(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    @ObfuscatedName("w")
    abstract void vmethod5542(final byte[] p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6);
    
    @ObfuscatedName("x")
    void method5540(final byte[] array) {
        this.field3703 = new int[256];
        if (array.length == 257) {
            for (int i = 0; i < this.field3703.length; ++i) {
                this.field3703[i] = (array[i] & 0xFF);
            }
            this.field3695 = (array[256] & 0xFF);
        }
        else {
            int n = 0;
            for (int j = 0; j < 256; ++j) {
                this.field3703[j] = (array[n++] & 0xFF);
            }
            final int[] array2 = new int[256];
            final int[] array3 = new int[256];
            for (int k = 0; k < 256; ++k) {
                array2[k] = (array[n++] & 0xFF);
            }
            for (int l = 0; l < 256; ++l) {
                array3[l] = (array[n++] & 0xFF);
            }
            final byte[][] array4 = new byte[256][];
            for (int n2 = 0; n2 < 256; ++n2) {
                array4[n2] = new byte[array2[n2]];
                byte b = 0;
                for (int n3 = 0; n3 < array4[n2].length; ++n3) {
                    b += array[n++];
                    array4[n2][n3] = b;
                }
            }
            final byte[][] array5 = new byte[256][];
            for (int n4 = 0; n4 < 256; ++n4) {
                array5[n4] = new byte[array2[n4]];
                byte b2 = 0;
                for (int n5 = 0; n5 < array5[n4].length; ++n5) {
                    b2 += array[n++];
                    array5[n4][n5] = b2;
                }
            }
            this.field3699 = new byte[65536];
            for (int n6 = 0; n6 < 256; ++n6) {
                if (n6 != 32 && n6 != 160) {
                    for (int n7 = 0; n7 < 256; ++n7) {
                        if (n7 != 32) {
                            if (n7 != 160) {
                                this.field3699[n7 + (n6 << 8)] = (byte)method5599(array4, array5, array3, this.field3703, array2, n6, n7);
                            }
                        }
                    }
                }
            }
            this.field3695 = array3[32] + array2[32];
        }
    }
    
    @ObfuscatedName("p")
    int method5516(char c) {
        if (c == ' ') {
            c = ' ';
        }
        return this.field3703[Class166.method3441(c) & 0xFF];
    }
    
    @ObfuscatedName("b")
    public int method5517(final String s) {
        if (s == null) {
            return 0;
        }
        int n = -1;
        int n2 = -1;
        int n3 = 0;
        for (int i = 0; i < s.length(); ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n = i;
            }
            else {
                if (char1 == '>' && n != -1) {
                    final String substring = s.substring(n + 1, i);
                    n = -1;
                    if (substring.equals("lt")) {
                        char1 = '<';
                    }
                    else if (substring.equals("gt")) {
                        char1 = '>';
                    }
                    else {
                        if (substring.startsWith("img=")) {
                            try {
                                n3 += Class299.field3698[Class68.method1693(substring.substring(4), 10, true)].field3784;
                                n2 = -1;
                            }
                            catch (Exception ex) {}
                        }
                        continue;
                    }
                }
                if (char1 == ' ') {
                    char1 = ' ';
                }
                if (n == -1) {
                    n3 += this.field3703[(char)(Class166.method3441(char1) & 0xFF)];
                    if (this.field3699 != null && n2 != -1) {
                        n3 += this.field3699[char1 + (n2 << 8)];
                    }
                    n2 = char1;
                }
            }
        }
        return n3;
    }
    
    @ObfuscatedName("n")
    public int method5518(final String s, final int[] array, final String[] array2) {
        if (s == null) {
            return 0;
        }
        int n = 0;
        int length = 0;
        final StringBuilder sb = new StringBuilder(100);
        int n2 = -1;
        byte b = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        int n6 = 0;
        for (int length2 = s.length(), i = 0; i < length2; ++i) {
            char char1 = s.charAt(i);
            if (char1 == '<') {
                n4 = i;
            }
            else {
                if (char1 == '>' && n4 != -1) {
                    final String substring = s.substring(n4 + 1, i);
                    n4 = -1;
                    sb.append('<');
                    sb.append(substring);
                    sb.append('>');
                    if (substring.equals("br")) {
                        array2[n6] = sb.toString().substring(length, sb.length());
                        ++n6;
                        length = sb.length();
                        n = 0;
                        n2 = -1;
                        n5 = 0;
                    }
                    else if (substring.equals("lt")) {
                        n += this.method5516('<');
                        if (this.field3699 != null && n5 != -1) {
                            n += this.field3699[(n5 << 8) + 60];
                        }
                        n5 = 60;
                    }
                    else if (substring.equals("gt")) {
                        n += this.method5516('>');
                        if (this.field3699 != null && n5 != -1) {
                            n += this.field3699[(n5 << 8) + 62];
                        }
                        n5 = 62;
                    }
                    else if (substring.startsWith("img=")) {
                        try {
                            n += Class299.field3698[Class68.method1693(substring.substring(4), 10, true)].field3784;
                            n5 = 0;
                        }
                        catch (Exception ex) {}
                    }
                    char1 = '\0';
                }
                if (n4 == -1) {
                    if (char1 != '\0') {
                        sb.append(char1);
                        n += this.method5516(char1);
                        if (this.field3699 != null && n5 != -1) {
                            n += this.field3699[char1 + (n5 << 8)];
                        }
                        n5 = char1;
                    }
                    if (char1 == ' ') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 1;
                    }
                    if (array != null && n > array[(n6 < array.length) ? n6 : (array.length - 1)] && n2 >= 0) {
                        array2[n6] = sb.toString().substring(length, n2 - n3);
                        ++n6;
                        length = n2;
                        n2 = -1;
                        n -= b;
                        n5 = 0;
                    }
                    if (char1 == '-') {
                        n2 = sb.length();
                        b = (byte)n;
                        n3 = 0;
                    }
                }
            }
        }
        final String string = sb.toString();
        if (string.length() > length) {
            array2[n6++] = string.substring(length, string.length());
        }
        return n6;
    }
    
    @ObfuscatedName("f")
    public int method5519(final String s, final int n) {
        final int method5518 = this.method5518(s, new int[] { n }, Class299.field3710);
        int n2 = 0;
        for (int i = 0; i < method5518; ++i) {
            final int method5519 = this.method5517(Class299.field3710[i]);
            if (method5519 > n2) {
                n2 = method5519;
            }
        }
        return n2;
    }
    
    @ObfuscatedName("g")
    public int method5520(final String s, final int n) {
        return this.method5518(s, new int[] { n }, Class299.field3710);
    }
    
    @ObfuscatedName("r")
    public void method5522(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        this.method5514(s, n, n2);
    }
    
    @ObfuscatedName("t")
    public void method5523(final String s, final int n, final int n2, final int n3, final int n4, final int field3706) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        Class299.field3706 = field3706;
        this.method5514(s, n, n2);
    }
    
    @ObfuscatedName("o")
    public void method5524(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        this.method5514(s, n - this.method5517(s), n2);
    }
    
    @ObfuscatedName("y")
    public void method5525(final String s, final int n, final int n2, final int n3, final int n4) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        this.method5514(s, n - this.method5517(s) / 2, n2);
    }
    
    @ObfuscatedName("a")
    public int method5526(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, int n8, int field3695) {
        if (s == null) {
            return 0;
        }
        this.method5531(n5, n6);
        if (field3695 == 0) {
            field3695 = this.field3695;
        }
        int[] array = { n3 };
        if (n4 < field3695 + this.field3696 + this.field3697 && n4 < field3695 + field3695) {
            array = null;
        }
        final int method5518 = this.method5518(s, array, Class299.field3710);
        if (n8 == 3 && method5518 == 1) {
            n8 = 1;
        }
        int n9;
        if (n8 == 0) {
            n9 = n2 + this.field3696;
        }
        else if (n8 == 1) {
            n9 = n2 + (n4 - this.field3696 - this.field3697 - field3695 * (method5518 - 1)) / 2 + this.field3696;
        }
        else if (n8 == 2) {
            n9 = n2 + n4 - this.field3697 - field3695 * (method5518 - 1);
        }
        else {
            int n10 = (n4 - this.field3696 - this.field3697 - field3695 * (method5518 - 1)) / (method5518 + 1);
            if (n10 < 0) {
                n10 = 0;
            }
            n9 = n2 + n10 + this.field3696;
            field3695 += n10;
        }
        for (int i = 0; i < method5518; ++i) {
            if (n7 == 0) {
                this.method5514(Class299.field3710[i], n, n9);
            }
            else if (n7 == 1) {
                this.method5514(Class299.field3710[i], n + (n3 - this.method5517(Class299.field3710[i])) / 2, n9);
            }
            else if (n7 == 2) {
                this.method5514(Class299.field3710[i], n + n3 - this.method5517(Class299.field3710[i]), n9);
            }
            else if (i == method5518 - 1) {
                this.method5514(Class299.field3710[i], n, n9);
            }
            else {
                this.method5533(Class299.field3710[i], n3);
                this.method5514(Class299.field3710[i], n, n9);
                Class299.field3701 = 0;
            }
            n9 += field3695;
        }
        return method5518;
    }
    
    @ObfuscatedName("c")
    public void method5609(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        final int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 2.0 + n5 / 5.0) * 5.0);
        }
        this.method5549(s, n - this.method5517(s) / 2, n2, null, array);
    }
    
    @ObfuscatedName("v")
    public void method5575(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        final int[] array = new int[s.length()];
        final int[] array2 = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 5.0 + n5 / 5.0) * 5.0);
            array2[i] = (int)(Math.sin(i / 3.0 + n5 / 5.0) * 5.0);
        }
        this.method5549(s, n - this.method5517(s) / 2, n2, array, array2);
    }
    
    @ObfuscatedName("af")
    public void method5539(final String s, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        double n7 = 7.0 - n6 / 8.0;
        if (n7 < 0.0) {
            n7 = 0.0;
        }
        final int[] array = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = (int)(Math.sin(i / 1.5 + n5 / 1.0) * n7);
        }
        this.method5549(s, n - this.method5517(s) / 2, n2, null, array);
    }
    
    @ObfuscatedName("ah")
    public void method5530(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (s == null) {
            return;
        }
        this.method5531(n3, n4);
        Class299.field3709.setSeed(n5);
        Class299.field3706 = 192 + (Class299.field3709.nextInt() & 0x1F);
        final int[] array = new int[s.length()];
        int n6 = 0;
        for (int i = 0; i < s.length(); ++i) {
            array[i] = n6;
            if ((Class299.field3709.nextInt() & 0x3) == 0x0) {
                ++n6;
            }
        }
        this.method5549(s, n, n2, array, null);
    }
    
    @ObfuscatedName("ab")
    void method5531(final int n, final int n2) {
        Class299.field3700 = -1;
        Class299.field3691 = -1;
        Class299.field3702 = n2;
        Class299.field3708 = n2;
        Class299.field3704 = n;
        Class299.field3692 = n;
        Class299.field3706 = 256;
        Class299.field3701 = 0;
        Class299.field3705 = 0;
    }
    
    @ObfuscatedName("aw")
    void method5532(final String s) {
        try {
            if (s.startsWith("col=")) {
                Class299.field3692 = Class138.method3137(s.substring(4), 16);
            }
            else if (s.equals("/col")) {
                Class299.field3692 = Class299.field3704;
            }
            else if (s.startsWith("str=")) {
                Class299.field3700 = Class138.method3137(s.substring(4), 16);
            }
            else if (s.equals("str")) {
                Class299.field3700 = 8388608;
            }
            else if (s.equals("/str")) {
                Class299.field3700 = -1;
            }
            else if (s.startsWith("u=")) {
                Class299.field3691 = Class138.method3137(s.substring(2), 16);
            }
            else if (s.equals("u")) {
                Class299.field3691 = 0;
            }
            else if (s.equals("/u")) {
                Class299.field3691 = -1;
            }
            else if (s.startsWith("shad=")) {
                Class299.field3708 = Class138.method3137(s.substring(5), 16);
            }
            else if (s.equals("shad")) {
                Class299.field3708 = 0;
            }
            else if (s.equals("/shad")) {
                Class299.field3708 = Class299.field3702;
            }
            else if (s.equals("br")) {
                this.method5531(Class299.field3704, Class299.field3702);
            }
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("ak")
    void method5533(final String s, final int n) {
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<') {
                b = true;
            }
            else if (char1 == '>') {
                b = false;
            }
            else if (!b && char1 == ' ') {
                ++n2;
            }
        }
        if (n2 > 0) {
            Class299.field3701 = (n - this.method5517(s) << 8) / n2;
        }
    }
    
    @ObfuscatedName("as")
    void method5514(final String s, int n, int n2) {
        n2 -= this.field3695;
        int n3 = -1;
        int n4 = -1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n5 = (char)(Class166.method3441(s.charAt(i)) & 0xFF);
                if (n5 == 60) {
                    n3 = i;
                }
                else {
                    if (n5 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n5 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n5 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    final Class317 class317 = Class299.field3698[Class68.method1693(substring.substring(4), 10, true)];
                                    class317.method5829(n, n2 + this.field3695 - class317.field3783);
                                    n += class317.field3784;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.method5532(substring);
                            continue;
                        }
                    }
                    if (n5 == 160) {
                        n5 = 32;
                    }
                    if (n3 == -1) {
                        if (this.field3699 != null && n4 != -1) {
                            n += this.field3699[n5 + (n4 << 8)];
                        }
                        final int n6 = this.field3689[n5];
                        final int n7 = this.field3690[n5];
                        if (n5 != 32) {
                            if (Class299.field3706 == 256) {
                                if (Class299.field3708 != -1) {
                                    method5538(this.field3707[n5], n + this.field3693[n5] + 1, n2 + this.field3694[n5] + 1, n6, n7, Class299.field3708);
                                }
                                this.vmethod5536(this.field3707[n5], n + this.field3693[n5], n2 + this.field3694[n5], n6, n7, Class299.field3692);
                            }
                            else {
                                if (Class299.field3708 != -1) {
                                    method5583(this.field3707[n5], n + this.field3693[n5] + 1, n2 + this.field3694[n5] + 1, n6, n7, Class299.field3708, Class299.field3706);
                                }
                                this.vmethod5542(this.field3707[n5], n + this.field3693[n5], n2 + this.field3694[n5], n6, n7, Class299.field3692, Class299.field3706);
                            }
                        }
                        else if (Class299.field3701 > 0) {
                            Class299.field3705 += Class299.field3701;
                            n += Class299.field3705 >> 8;
                            Class299.field3705 &= 0xFF;
                        }
                        final int n8 = this.field3703[n5];
                        if (Class299.field3700 != -1) {
                            Class314.method5736(n, n2 + (int)(this.field3695 * 0.7), n8, Class299.field3700);
                        }
                        if (Class299.field3691 != -1) {
                            Class314.method5736(n, n2 + this.field3695 + 1, n8, Class299.field3691);
                        }
                        n += n8;
                        n4 = n5;
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("an")
    void method5549(final String s, int n, int n2, final int[] array, final int[] array2) {
        n2 -= this.field3695;
        int n3 = -1;
        int n4 = -1;
        int n5 = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != '\0') {
                int n6 = (char)(Class166.method3441(s.charAt(i)) & 0xFF);
                if (n6 == 60) {
                    n3 = i;
                }
                else {
                    if (n6 == 62 && n3 != -1) {
                        final String substring = s.substring(n3 + 1, i);
                        n3 = -1;
                        if (substring.equals("lt")) {
                            n6 = 60;
                        }
                        else if (substring.equals("gt")) {
                            n6 = 62;
                        }
                        else {
                            if (substring.startsWith("img=")) {
                                try {
                                    int n7;
                                    if (array != null) {
                                        n7 = array[n5];
                                    }
                                    else {
                                        n7 = 0;
                                    }
                                    int n8;
                                    if (array2 != null) {
                                        n8 = array2[n5];
                                    }
                                    else {
                                        n8 = 0;
                                    }
                                    ++n5;
                                    final Class317 class317 = Class299.field3698[Class68.method1693(substring.substring(4), 10, true)];
                                    class317.method5829(n7 + n, n8 + (n2 + this.field3695 - class317.field3783));
                                    n += class317.field3784;
                                    n4 = -1;
                                }
                                catch (Exception ex) {}
                                continue;
                            }
                            this.method5532(substring);
                            continue;
                        }
                    }
                    if (n6 == 160) {
                        n6 = 32;
                    }
                    if (n3 == -1) {
                        if (this.field3699 != null && n4 != -1) {
                            n += this.field3699[n6 + (n4 << 8)];
                        }
                        final int n9 = this.field3689[n6];
                        final int n10 = this.field3690[n6];
                        int n11;
                        if (array != null) {
                            n11 = array[n5];
                        }
                        else {
                            n11 = 0;
                        }
                        int n12;
                        if (array2 != null) {
                            n12 = array2[n5];
                        }
                        else {
                            n12 = 0;
                        }
                        ++n5;
                        if (n6 != 32) {
                            if (Class299.field3706 == 256) {
                                if (Class299.field3708 != -1) {
                                    method5538(this.field3707[n6], n11 + n + this.field3693[n6] + 1, n2 + n12 + this.field3694[n6] + 1, n9, n10, Class299.field3708);
                                }
                                this.vmethod5536(this.field3707[n6], n11 + n + this.field3693[n6], n2 + n12 + this.field3694[n6], n9, n10, Class299.field3692);
                            }
                            else {
                                if (Class299.field3708 != -1) {
                                    method5583(this.field3707[n6], n11 + n + this.field3693[n6] + 1, n2 + n12 + this.field3694[n6] + 1, n9, n10, Class299.field3708, Class299.field3706);
                                }
                                this.vmethod5542(this.field3707[n6], n11 + n + this.field3693[n6], n2 + n12 + this.field3694[n6], n9, n10, Class299.field3692, Class299.field3706);
                            }
                        }
                        else if (Class299.field3701 > 0) {
                            Class299.field3705 += Class299.field3701;
                            n += Class299.field3705 >> 8;
                            Class299.field3705 &= 0xFF;
                        }
                        final int n13 = this.field3703[n6];
                        if (Class299.field3700 != -1) {
                            Class314.method5736(n, n2 + (int)(this.field3695 * 0.7), n13, Class299.field3700);
                        }
                        if (Class299.field3691 != -1) {
                            Class314.method5736(n, n2 + this.field3695, n13, Class299.field3691);
                        }
                        n += n13;
                        n4 = n6;
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("e")
    static int method5599(final byte[][] array, final byte[][] array2, final int[] array3, final int[] array4, final int[] array5, final int n, final int n2) {
        final int n3 = array3[n];
        final int n4 = n3 + array5[n];
        final int n5 = array3[n2];
        final int n6 = n5 + array5[n2];
        int n7 = n3;
        if (n5 > n3) {
            n7 = n5;
        }
        int n8;
        if (n6 < (n8 = n4)) {
            n8 = n6;
        }
        int n9 = array4[n];
        if (array4[n2] < n9) {
            n9 = array4[n2];
        }
        final byte[] array6 = array2[n];
        final byte[] array7 = array[n2];
        int n10 = n7 - n3;
        int n11 = n7 - n5;
        for (int i = n7; i < n8; ++i) {
            final byte b = (byte)(array6[n10++] + array7[n11++]);
            if (b < n9) {
                n9 = b;
            }
        }
        return -n9;
    }
    
    @ObfuscatedName("m")
    public static String method5521(final String s) {
        final int length = s.length();
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '<' || char1 == '>') {
                n += 3;
            }
        }
        final StringBuilder sb = new StringBuilder(length + n);
        for (int j = 0; j < length; ++j) {
            final char char2 = s.charAt(j);
            if (char2 == '<') {
                sb.append("<lt>");
            }
            else if (char2 == '>') {
                sb.append("<gt>");
            }
            else {
                sb.append(char2);
            }
        }
        return sb.toString();
    }
    
    @ObfuscatedName("ao")
    static void method5538(final byte[] array, int field3765, int field3766, int n, int n2, final int n3) {
        int n4 = field3765 + field3766 * Class314.field3761;
        int n5 = Class314.field3761 - n;
        int n6 = 0;
        int n7 = 0;
        if (field3766 < Class314.field3763) {
            final int n8 = Class314.field3763 - field3766;
            n2 -= n8;
            field3766 = Class314.field3763;
            n7 += n * n8;
            n4 += n8 * Class314.field3761;
        }
        if (field3766 + n2 > Class314.field3764) {
            n2 -= field3766 + n2 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n9 = Class314.field3765 - field3765;
            n -= n9;
            field3765 = Class314.field3765;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (n + field3765 > Class314.field3760) {
            final int n10 = n + field3765 - Class314.field3760;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        method5556(Class314.field3766, array, n3, n7, n4, n, n2, n5, n6);
    }
    
    @ObfuscatedName("at")
    static void method5556(final int[] array, final byte[] array2, final int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                if (array2[n2++] != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @ObfuscatedName("ai")
    static void method5583(final byte[] array, int field3765, int field3766, int n, int n2, final int n3, final int n4) {
        int n5 = field3765 + field3766 * Class314.field3761;
        int n6 = Class314.field3761 - n;
        int n7 = 0;
        int n8 = 0;
        if (field3766 < Class314.field3763) {
            final int n9 = Class314.field3763 - field3766;
            n2 -= n9;
            field3766 = Class314.field3763;
            n8 += n * n9;
            n5 += n9 * Class314.field3761;
        }
        if (field3766 + n2 > Class314.field3764) {
            n2 -= field3766 + n2 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n10 = Class314.field3765 - field3765;
            n -= n10;
            field3765 = Class314.field3765;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (n + field3765 > Class314.field3760) {
            final int n11 = n + field3765 - Class314.field3760;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n > 0 && n2 > 0) {
            method5585(Class314.field3766, array, n3, n8, n5, n, n2, n6, n7, n4);
        }
    }
    
    @ObfuscatedName("ac")
    static void method5585(final int[] array, final byte[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, int n8) {
        n = ((n & 0xFF00) * n8 & 0xFF0000) + (n8 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
        n8 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                if (array2[n2++] != 0) {
                    final int n9 = array[n3];
                    array[n3++] = (((n9 & 0xFF00) * n8 & 0xFF0000) + ((n9 & 0xFF00FF) * n8 & 0xFF00FF00) >> 8) + n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
}
