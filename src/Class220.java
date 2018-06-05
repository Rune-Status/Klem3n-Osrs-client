import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("he")
public class Class220
{
    @ObfuscatedName("e")
    static final byte[] field2527;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lgk;")
    Class182 field2530;
    @ObfuscatedName("w")
    int field2519;
    @ObfuscatedName("s")
    int[] field2520;
    @ObfuscatedName("l")
    int[] field2521;
    @ObfuscatedName("u")
    int[] field2525;
    @ObfuscatedName("q")
    int[] field2523;
    @ObfuscatedName("k")
    int field2524;
    @ObfuscatedName("x")
    long field2526;
    
    static {
        field2527 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    }
    
    Class220(final byte[] array) {
        this.field2530 = new Class182(null);
        this.method4328(array);
    }
    
    Class220() {
        this.field2530 = new Class182(null);
    }
    
    @ObfuscatedName("z")
    void method4328(final byte[] field2338) {
        this.field2530.payload = field2338;
        this.field2530.field2339 = 10;
        final int method3550 = this.field2530.method3550();
        this.field2519 = this.field2530.method3550();
        this.field2524 = 500000;
        this.field2520 = new int[method3550];
        int i = 0;
        while (i < method3550) {
            final int method3551 = this.field2530.method3671();
            final int method3552 = this.field2530.method3671();
            if (method3551 == 1297379947) {
                this.field2520[i] = this.field2530.field2339;
                ++i;
            }
            final Class182 field2339 = this.field2530;
            field2339.field2339 += method3552;
        }
        this.field2526 = 0L;
        this.field2521 = new int[method3550];
        for (int j = 0; j < method3550; ++j) {
            this.field2521[j] = this.field2520[j];
        }
        this.field2525 = new int[method3550];
        this.field2523 = new int[method3550];
    }
    
    @ObfuscatedName("w")
    void method4329() {
        this.field2530.payload = null;
        this.field2520 = null;
        this.field2521 = null;
        this.field2525 = null;
        this.field2523 = null;
    }
    
    @ObfuscatedName("s")
    boolean method4345() {
        return this.field2530.payload != null;
    }
    
    @ObfuscatedName("l")
    int method4331() {
        return this.field2521.length;
    }
    
    @ObfuscatedName("u")
    void method4350(final int n) {
        this.field2530.field2339 = this.field2521[n];
    }
    
    @ObfuscatedName("q")
    void method4333(final int n) {
        this.field2521[n] = this.field2530.field2339;
    }
    
    @ObfuscatedName("i")
    void method4334() {
        this.field2530.field2339 = -1;
    }
    
    @ObfuscatedName("x")
    void method4335(final int n) {
        final int method3566 = this.field2530.method3566();
        final int[] field2525 = this.field2525;
        field2525[n] += method3566;
    }
    
    @ObfuscatedName("e")
    int method4336(final int n) {
        return this.method4327(n);
    }
    
    @ObfuscatedName("p")
    int method4327(final int n) {
        final byte b = this.field2530.payload[this.field2530.field2339];
        int n2;
        if (b < 0) {
            n2 = (b & 0xFF);
            this.field2523[n] = n2;
            final Class182 field2530 = this.field2530;
            ++field2530.field2339;
        }
        else {
            n2 = this.field2523[n];
        }
        if (n2 != 240 && n2 != 247) {
            return this.method4337(n, n2);
        }
        final int method3566 = this.field2530.method3566();
        if (n2 == 247 && method3566 > 0) {
            final int n3 = this.field2530.payload[this.field2530.field2339] & 0xFF;
            if ((n3 >= 241 && n3 <= 243) || n3 == 246 || n3 == 248 || (n3 >= 250 && n3 <= 252) || n3 == 254) {
                final Class182 field2531 = this.field2530;
                ++field2531.field2339;
                this.field2523[n] = n3;
                return this.method4337(n, n3);
            }
        }
        final Class182 field2532 = this.field2530;
        field2532.field2339 += method3566;
        return 0;
    }
    
    @ObfuscatedName("b")
    int method4337(final int n, final int n2) {
        if (n2 != 255) {
            final byte b = Class220.field2527[n2 - 128];
            int n3 = n2;
            if (b >= 1) {
                n3 |= this.field2530.method3544() << 8;
            }
            if (b >= 2) {
                n3 |= this.field2530.method3544() << 16;
            }
            return n3;
        }
        final int method3544 = this.field2530.method3544();
        int method3545 = this.field2530.method3566();
        if (method3544 == 47) {
            final Class182 field2530 = this.field2530;
            field2530.field2339 += method3545;
            return 1;
        }
        if (method3544 == 81) {
            final int method3546 = this.field2530.method3552();
            method3545 -= 3;
            this.field2526 += this.field2525[n] * (this.field2524 - method3546);
            this.field2524 = method3546;
            final Class182 field2531 = this.field2530;
            field2531.field2339 += method3545;
            return 2;
        }
        final Class182 field2532 = this.field2530;
        field2532.field2339 += method3545;
        return 3;
    }
    
    @ObfuscatedName("n")
    long method4338(final int n) {
        return this.field2526 + n * this.field2524;
    }
    
    @ObfuscatedName("f")
    int method4339() {
        final int length = this.field2521.length;
        int n = -1;
        int n2 = Integer.MAX_VALUE;
        for (int i = 0; i < length; ++i) {
            if (this.field2521[i] >= 0 && this.field2525[i] < n2) {
                n = i;
                n2 = this.field2525[i];
            }
        }
        return n;
    }
    
    @ObfuscatedName("g")
    boolean method4340() {
        for (int length = this.field2521.length, i = 0; i < length; ++i) {
            if (this.field2521[i] >= 0) {
                return false;
            }
        }
        return true;
    }
    
    @ObfuscatedName("m")
    void method4341(final long field2526) {
        this.field2526 = field2526;
        for (int length = this.field2521.length, i = 0; i < length; ++i) {
            this.field2525[i] = 0;
            this.field2523[i] = 0;
            this.field2530.field2339 = this.field2520[i];
            this.method4335(i);
            this.field2521[i] = this.field2530.field2339;
        }
    }
}
