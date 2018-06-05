import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("du")
public class Class116 extends Class204
{
    @ObfuscatedName("g")
    static int[] field1541;
    @ObfuscatedName("u")
    int field1527;
    @ObfuscatedName("q")
    boolean field1530;
    @ObfuscatedName("k")
    int[] field1533;
    @ObfuscatedName("i")
    int[] field1535;
    @ObfuscatedName("x")
    int[] field1532;
    @ObfuscatedName("e")
    int[] field1536;
    @ObfuscatedName("p")
    int field1537;
    @ObfuscatedName("b")
    int field1538;
    @ObfuscatedName("n")
    int[] field1539;
    @ObfuscatedName("f")
    boolean field1540;
    
    Class116(final Class182 class182) {
        this.field1540 = false;
        this.field1527 = class182.method3550();
        this.field1530 = (class182.method3544() == 1);
        final int method3544 = class182.method3544();
        if (method3544 >= 1 && method3544 <= 4) {
            this.field1533 = new int[method3544];
            for (int i = 0; i < method3544; ++i) {
                this.field1533[i] = class182.method3550();
            }
            if (method3544 > 1) {
                this.field1535 = new int[method3544 - 1];
                for (int j = 0; j < method3544 - 1; ++j) {
                    this.field1535[j] = class182.method3544();
                }
            }
            if (method3544 > 1) {
                this.field1532 = new int[method3544 - 1];
                for (int k = 0; k < method3544 - 1; ++k) {
                    this.field1532[k] = class182.method3544();
                }
            }
            this.field1536 = new int[method3544];
            for (int l = 0; l < method3544; ++l) {
                this.field1536[l] = class182.method3671();
            }
            this.field1537 = class182.method3544();
            this.field1538 = class182.method3544();
            this.field1539 = null;
            return;
        }
        throw new RuntimeException();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(DILir;)Z")
    boolean method2661(final double n, final int n2, final Class247 class247) {
        for (int i = 0; i < this.field1533.length; ++i) {
            if (class247.method4626(this.field1533[i]) == null) {
                return false;
            }
        }
        final int n3 = n2 * n2;
        this.field1539 = new int[n3];
        for (int j = 0; j < this.field1533.length; ++j) {
            final Class317 method4589 = Class233.method4589(class247, this.field1533[j]);
            method4589.method5824();
            final byte[] field3785 = method4589.field3785;
            final int[] field3786 = method4589.field3779;
            final int n4 = this.field1536[j];
            if ((n4 & 0xFF000000) == 0x1000000) {}
            if ((n4 & 0xFF000000) == 0x2000000) {}
            if ((n4 & 0xFF000000) == 0x3000000) {
                final int n5 = n4 & 0xFF00FF;
                final int n6 = n4 >> 8 & 0xFF;
                for (int k = 0; k < field3786.length; ++k) {
                    final int n7 = field3786[k];
                    if (n7 >> 8 == (n7 & 0xFFFF)) {
                        final int n8 = n7 & 0xFF;
                        field3786[k] = ((n5 * n8 >> 8 & 0xFF00FF) | (n6 * n8 & 0xFF00));
                    }
                }
            }
            for (int l = 0; l < field3786.length; ++l) {
                field3786[l] = Class122.method2792(field3786[l], n);
            }
            int n9;
            if (j == 0) {
                n9 = 0;
            }
            else {
                n9 = this.field1535[j - 1];
            }
            if (n9 == 0) {
                if (n2 == method4589.field3780) {
                    for (int n10 = 0; n10 < n3; ++n10) {
                        this.field1539[n10] = field3786[field3785[n10] & 0xFF];
                    }
                }
                else if (method4589.field3780 == 64 && n2 == 128) {
                    int n11 = 0;
                    for (int n12 = 0; n12 < n2; ++n12) {
                        for (int n13 = 0; n13 < n2; ++n13) {
                            this.field1539[n11++] = field3786[field3785[(n12 >> 1 << 6) + (n13 >> 1)] & 0xFF];
                        }
                    }
                }
                else {
                    if (method4589.field3780 != 128 || n2 != 64) {
                        throw new RuntimeException();
                    }
                    int n14 = 0;
                    for (int n15 = 0; n15 < n2; ++n15) {
                        for (int n16 = 0; n16 < n2; ++n16) {
                            this.field1539[n14++] = field3786[field3785[(n16 << 1) + (n15 << 1 << 7)] & 0xFF];
                        }
                    }
                }
            }
            if (n9 == 1) {}
            if (n9 == 2) {}
            if (n9 == 3) {}
        }
        return true;
    }
    
    @ObfuscatedName("w")
    void method2656() {
        this.field1539 = null;
    }
    
    @ObfuscatedName("s")
    void method2657(final int n) {
        if (this.field1539 == null) {
            return;
        }
        if (this.field1537 == 1 || this.field1537 == 3) {
            if (Class116.field1541 == null || Class116.field1541.length < this.field1539.length) {
                Class116.field1541 = new int[this.field1539.length];
            }
            int n2;
            if (this.field1539.length == 4096) {
                n2 = 64;
            }
            else {
                n2 = 128;
            }
            final int length = this.field1539.length;
            int n3 = n2 * this.field1538 * n;
            final int n4 = length - 1;
            if (this.field1537 == 1) {
                n3 = -n3;
            }
            for (int i = 0; i < length; ++i) {
                Class116.field1541[i] = this.field1539[i + n3 & n4];
            }
            final int[] field1539 = this.field1539;
            this.field1539 = Class116.field1541;
            Class116.field1541 = field1539;
        }
        if (this.field1537 == 2 || this.field1537 == 4) {
            if (Class116.field1541 == null || Class116.field1541.length < this.field1539.length) {
                Class116.field1541 = new int[this.field1539.length];
            }
            int n5;
            if (this.field1539.length == 4096) {
                n5 = 64;
            }
            else {
                n5 = 128;
            }
            final int length2 = this.field1539.length;
            int n6 = this.field1538 * n;
            final int n7 = n5 - 1;
            if (this.field1537 == 2) {
                n6 = -n6;
            }
            for (int j = 0; j < length2; j += n5) {
                for (int k = 0; k < n5; ++k) {
                    Class116.field1541[j + k] = this.field1539[j + (k + n6 & n7)];
                }
            }
            final int[] field1540 = this.field1539;
            this.field1539 = Class116.field1541;
            Class116.field1541 = field1540;
        }
    }
}
