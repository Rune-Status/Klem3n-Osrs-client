import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dh")
public class Class104
{
    @ObfuscatedName("q")
    static float[][] field1370;
    @ObfuscatedName("k")
    static int[][] field1376;
    @ObfuscatedName("i")
    static float field1381;
    @ObfuscatedName("x")
    static int field1378;
    @ObfuscatedName("z")
    int[] field1373;
    @ObfuscatedName("s")
    int[][][] field1379;
    @ObfuscatedName("l")
    int[][][] field1377;
    @ObfuscatedName("u")
    int[] field1374;
    
    static {
        Class104.field1370 = new float[2][8];
        Class104.field1376 = new int[2][8];
    }
    
    Class104() {
        this.field1373 = new int[2];
        this.field1379 = new int[2][2][4];
        this.field1377 = new int[2][2][4];
        this.field1374 = new int[2];
    }
    
    @ObfuscatedName("z")
    float method2420(final int n, final int n2, final float n3) {
        return 1.0f - (float)Math.pow(10.0, -((this.field1377[n][0][n2] + n3 * (this.field1377[n][1][n2] - this.field1377[n][0][n2])) * 0.0015258789f) / 20.0f);
    }
    
    @ObfuscatedName("s")
    float method2422(final int n, final int n2, final float n3) {
        return method2421((this.field1379[n][0][n2] + n3 * (this.field1379[n][1][n2] - this.field1379[n][0][n2])) * 1.2207031E-4f);
    }
    
    @ObfuscatedName("l")
    int method2428(final int n, final float n2) {
        if (n == 0) {
            Class104.field1381 = (float)Math.pow(0.1, (this.field1374[0] + (this.field1374[1] - this.field1374[0]) * n2) * 0.0030517578f / 20.0f);
            Class104.field1378 = (int)(Class104.field1381 * 65536.0f);
        }
        if (this.field1373[n] == 0) {
            return 0;
        }
        final float method2420 = this.method2420(n, 0, n2);
        Class104.field1370[n][0] = -2.0f * method2420 * (float)Math.cos(this.method2422(n, 0, n2));
        Class104.field1370[n][1] = method2420 * method2420;
        for (int i = 1; i < this.field1373[n]; ++i) {
            final float method2421 = this.method2420(n, i, n2);
            final float n3 = -2.0f * method2421 * (float)Math.cos(this.method2422(n, i, n2));
            final float n4 = method2421 * method2421;
            Class104.field1370[n][i * 2 + 1] = Class104.field1370[n][i * 2 - 1] * n4;
            Class104.field1370[n][i * 2] = Class104.field1370[n][i * 2 - 1] * n3 + Class104.field1370[n][i * 2 - 2] * n4;
            for (int j = i * 2 - 1; j >= 2; --j) {
                final float[] array = Class104.field1370[n];
                final int n5 = j;
                array[n5] += Class104.field1370[n][j - 1] * n3 + Class104.field1370[n][j - 2] * n4;
            }
            final float[] array2 = Class104.field1370[n];
            final int n6 = 1;
            array2[n6] += Class104.field1370[n][0] * n3 + n4;
            final float[] array3 = Class104.field1370[n];
            final int n7 = 0;
            array3[n7] += n3;
        }
        if (n == 0) {
            for (int k = 0; k < this.field1373[0] * 2; ++k) {
                final float[] array4 = Class104.field1370[0];
                final int n8 = k;
                array4[n8] *= Class104.field1381;
            }
        }
        for (int l = 0; l < this.field1373[n] * 2; ++l) {
            Class104.field1376[n][l] = (int)(Class104.field1370[n][l] * 65536.0f);
        }
        return this.field1373[n] * 2;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgk;Lcj;)V")
    final void method2425(final Class182 class182, final Class96 class183) {
        final int method3544 = class182.method3544();
        this.field1373[0] = method3544 >> 4;
        this.field1373[1] = (method3544 & 0xF);
        if (method3544 != 0) {
            this.field1374[0] = class182.method3550();
            this.field1374[1] = class182.method3550();
            final int method3545 = class182.method3544();
            for (int i = 0; i < 2; ++i) {
                for (int j = 0; j < this.field1373[i]; ++j) {
                    this.field1379[i][0][j] = class182.method3550();
                    this.field1377[i][0][j] = class182.method3550();
                }
            }
            for (int k = 0; k < 2; ++k) {
                for (int l = 0; l < this.field1373[k]; ++l) {
                    if ((method3545 & 1 << k * 4 << l) != 0x0) {
                        this.field1379[k][1][l] = class182.method3550();
                        this.field1377[k][1][l] = class182.method3550();
                    }
                    else {
                        this.field1379[k][1][l] = this.field1379[k][0][l];
                        this.field1377[k][1][l] = this.field1377[k][0][l];
                    }
                }
            }
            if (method3545 != 0 || this.field1374[1] != this.field1374[0]) {
                class183.method2197(class182);
            }
        }
        else {
            this.field1374[this.field1374[1] = 0] = 0;
        }
    }
    
    @ObfuscatedName("w")
    static float method2421(final float n) {
        return 32.703197f * (float)Math.pow(2.0, n) * 3.1415927f / 11025.0f;
    }
}
