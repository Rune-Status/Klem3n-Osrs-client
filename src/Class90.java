import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cv")
public class Class90
{
    @ObfuscatedName("z")
    int field1235;
    @ObfuscatedName("w")
    int field1233;
    @ObfuscatedName("s")
    int[] field1236;
    @ObfuscatedName("l")
    int[] field1234;
    @ObfuscatedName("u")
    float[][] field1237;
    @ObfuscatedName("q")
    int[] field1238;
    
    Class90() {
        Class92.method2108(24);
        this.field1235 = Class92.method2108(16);
        this.field1233 = Class92.method2108(24);
        this.field1236 = new int[this.field1233];
        if (Class92.method2093() != 0) {
            int i = 0;
            int n = Class92.method2108(5) + 1;
            while (i < this.field1233) {
                for (int method2108 = Class92.method2108(Class143.method3173(this.field1233 - i)), j = 0; j < method2108; ++j) {
                    this.field1236[i++] = n;
                }
                ++n;
            }
        }
        else {
            final boolean b = Class92.method2093() != 0;
            for (int k = 0; k < this.field1233; ++k) {
                if (b && Class92.method2093() == 0) {
                    this.field1236[k] = 0;
                }
                else {
                    this.field1236[k] = Class92.method2108(5) + 1;
                }
            }
        }
        this.method2053();
        final int method2109 = Class92.method2108(4);
        if (method2109 > 0) {
            final float method2110 = Class92.method2106(Class92.method2108(32));
            final float method2111 = Class92.method2106(Class92.method2108(32));
            final int n2 = Class92.method2108(4) + 1;
            final boolean b2 = Class92.method2093() != 0;
            int method2112;
            if (method2109 == 1) {
                method2112 = method2056(this.field1233, this.field1235);
            }
            else {
                method2112 = this.field1233 * this.field1235;
            }
            this.field1234 = new int[method2112];
            for (int l = 0; l < method2112; ++l) {
                this.field1234[l] = Class92.method2108(n2);
            }
            this.field1237 = new float[this.field1233][this.field1235];
            if (method2109 == 1) {
                for (int n3 = 0; n3 < this.field1233; ++n3) {
                    float n4 = 0.0f;
                    int n5 = 1;
                    for (int n6 = 0; n6 < this.field1235; ++n6) {
                        final float n7 = this.field1234[n3 / n5 % method2112] * method2111 + method2110 + n4;
                        this.field1237[n3][n6] = n7;
                        if (b2) {
                            n4 = n7;
                        }
                        n5 *= method2112;
                    }
                }
            }
            else {
                for (int n8 = 0; n8 < this.field1233; ++n8) {
                    float n9 = 0.0f;
                    int n10 = n8 * this.field1235;
                    for (int n11 = 0; n11 < this.field1235; ++n11) {
                        final float n12 = this.field1234[n10] * method2111 + method2110 + n9;
                        this.field1237[n8][n11] = n12;
                        if (b2) {
                            n9 = n12;
                        }
                        ++n10;
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("w")
    void method2053() {
        final int[] array = new int[this.field1233];
        final int[] array2 = new int[33];
        for (int i = 0; i < this.field1233; ++i) {
            final int n = this.field1236[i];
            if (n != 0) {
                final int n2 = 1 << 32 - n;
                final int n3 = array2[n];
                array[i] = n3;
                int n4;
                if ((n3 & n2) != 0x0) {
                    n4 = array2[n - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = n - 1; j >= 1; --j) {
                        final int n5 = array2[j];
                        if (n5 != n3) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array2[j] = array2[j - 1];
                            break;
                        }
                        array2[j] = (n5 | n6);
                    }
                }
                array2[n] = n4;
                for (int k = n + 1; k <= 32; ++k) {
                    if (array2[k] == n3) {
                        array2[k] = n4;
                    }
                }
            }
        }
        this.field1238 = new int[8];
        int n7 = 0;
        for (int l = 0; l < this.field1233; ++l) {
            final int n8 = this.field1236[l];
            if (n8 != 0) {
                final int n9 = array[l];
                int n10 = 0;
                for (int n11 = 0; n11 < n8; ++n11) {
                    if ((n9 & Integer.MIN_VALUE >>> n11) != 0x0) {
                        if (this.field1238[n10] == 0) {
                            this.field1238[n10] = n7;
                        }
                        n10 = this.field1238[n10];
                    }
                    else {
                        ++n10;
                    }
                    if (n10 >= this.field1238.length) {
                        final int[] field1238 = new int[this.field1238.length * 2];
                        for (int n12 = 0; n12 < this.field1238.length; ++n12) {
                            field1238[n12] = this.field1238[n12];
                        }
                        this.field1238 = field1238;
                    }
                }
                this.field1238[n10] = ~l;
                if (n10 >= n7) {
                    n7 = n10 + 1;
                }
            }
        }
    }
    
    @ObfuscatedName("s")
    int method2055() {
        int n;
        for (n = 0; this.field1238[n] >= 0; n = ((Class92.method2093() != 0) ? this.field1238[n] : (n + 1))) {}
        return ~this.field1238[n];
    }
    
    @ObfuscatedName("l")
    float[] method2062() {
        return this.field1237[this.method2055()];
    }
    
    @ObfuscatedName("z")
    static int method2056(final int n, final int n2) {
        int n3 = (int)Math.pow(n, 1.0 / n2) + 1;
        while (true) {
            int n4 = n3;
            int i = n2;
            int n5 = 1;
            while (i > 1) {
                if ((i & 0x1) != 0x0) {
                    n5 *= n4;
                }
                n4 *= n4;
                i >>= 1;
            }
            int n6;
            if (i == 1) {
                n6 = n5 * n4;
            }
            else {
                n6 = n5;
            }
            if (n6 <= n) {
                break;
            }
            --n3;
        }
        return n3;
    }
}
