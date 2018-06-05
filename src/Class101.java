import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ck")
public class Class101
{
    @ObfuscatedName("z")
    int field1339;
    @ObfuscatedName("w")
    int field1340;
    @ObfuscatedName("s")
    int field1344;
    @ObfuscatedName("l")
    int field1341;
    @ObfuscatedName("u")
    int field1343;
    @ObfuscatedName("q")
    int field1342;
    @ObfuscatedName("k")
    int[] field1345;
    
    Class101() {
        this.field1339 = Class92.method2108(16);
        this.field1340 = Class92.method2108(24);
        this.field1344 = Class92.method2108(24);
        this.field1341 = Class92.method2108(24) + 1;
        this.field1343 = Class92.method2108(6) + 1;
        this.field1342 = Class92.method2108(8);
        final int[] array = new int[this.field1343];
        for (int i = 0; i < this.field1343; ++i) {
            int method2108 = 0;
            final int method2109 = Class92.method2108(3);
            if (Class92.method2093() != 0) {
                method2108 = Class92.method2108(5);
            }
            array[i] = (method2108 << 3 | method2109);
        }
        this.field1345 = new int[this.field1343 * 8];
        for (int j = 0; j < this.field1343 * 8; ++j) {
            this.field1345[j] = (((array[j >> 3] & 1 << (j & 0x7)) != 0x0) ? Class92.method2108(8) : -1);
        }
    }
    
    @ObfuscatedName("z")
    void method2234(final float[] array, final int n, final boolean b) {
        for (int i = 0; i < n; ++i) {
            array[i] = 0.0f;
        }
        if (b) {
            return;
        }
        final int field1235 = Class92.field1254[this.field1342].field1235;
        final int n2 = (this.field1344 - this.field1340) / this.field1341;
        final int[] array2 = new int[n2];
        for (int j = 0; j < 8; ++j) {
            int k = 0;
            while (k < n2) {
                if (j == 0) {
                    int method2055 = Class92.field1254[this.field1342].method2055();
                    for (int l = field1235 - 1; l >= 0; --l) {
                        if (k + l < n2) {
                            array2[k + l] = method2055 % this.field1343;
                        }
                        method2055 /= this.field1343;
                    }
                }
                for (int n3 = 0; n3 < field1235; ++n3) {
                    final int n4 = this.field1345[j + array2[k] * 8];
                    if (n4 >= 0) {
                        final int n5 = k * this.field1341 + this.field1340;
                        final Class90 class90 = Class92.field1254[n4];
                        if (this.field1339 == 0) {
                            for (int n6 = this.field1341 / class90.field1235, n7 = 0; n7 < n6; ++n7) {
                                final float[] method2056 = class90.method2062();
                                for (int n8 = 0; n8 < class90.field1235; ++n8) {
                                    final int n9 = n5 + n7 + n8 * n6;
                                    array[n9] += method2056[n8];
                                }
                            }
                        }
                        else {
                            int n10 = 0;
                            while (n10 < this.field1341) {
                                final float[] method2057 = class90.method2062();
                                for (int n11 = 0; n11 < class90.field1235; ++n11) {
                                    final int n12 = n5 + n10;
                                    array[n12] += method2057[n11];
                                    ++n10;
                                }
                            }
                        }
                    }
                    if (++k >= n2) {
                        break;
                    }
                }
            }
        }
    }
}
