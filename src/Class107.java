import java.util.Random;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("dn")
public class Class107
{
    @ObfuscatedName("t")
    static int[] field1407;
    @ObfuscatedName("o")
    static int[] field1408;
    @ObfuscatedName("y")
    static int[] field1409;
    @ObfuscatedName("j")
    static int[] field1390;
    @ObfuscatedName("d")
    static int[] field1399;
    @ObfuscatedName("h")
    static int[] field1413;
    @ObfuscatedName("c")
    static int[] field1414;
    @ObfuscatedName("v")
    static int[] field1411;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1400;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1401;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1392;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1393;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1394;
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1395;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1396;
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1397;
    @ObfuscatedName("x")
    int[] field1406;
    @ObfuscatedName("e")
    int[] field1415;
    @ObfuscatedName("p")
    int[] field1412;
    @ObfuscatedName("b")
    int field1398;
    @ObfuscatedName("n")
    int field1402;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Ldh;")
    Class104 field1403;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "Lcj;")
    Class96 field1410;
    @ObfuscatedName("m")
    int field1404;
    @ObfuscatedName("r")
    int field1405;
    
    static {
        Class107.field1408 = new int[32768];
        final Random random = new Random(0L);
        for (int i = 0; i < 32768; ++i) {
            Class107.field1408[i] = (random.nextInt() & 0x2) - 1;
        }
        Class107.field1409 = new int[32768];
        for (int j = 0; j < 32768; ++j) {
            Class107.field1409[j] = (int)(Math.sin(j / 5215.1903) * 16384.0);
        }
        Class107.field1407 = new int[220500];
        Class107.field1390 = new int[5];
        Class107.field1399 = new int[5];
        Class107.field1413 = new int[5];
        Class107.field1414 = new int[5];
        Class107.field1411 = new int[5];
    }
    
    Class107() {
        this.field1406 = new int[] { 0, 0, 0, 0, 0 };
        this.field1415 = new int[] { 0, 0, 0, 0, 0 };
        this.field1412 = new int[] { 0, 0, 0, 0, 0 };
        this.field1398 = 0;
        this.field1402 = 100;
        this.field1404 = 500;
        this.field1405 = 0;
    }
    
    @ObfuscatedName("z")
    final int[] method2464(final int n, final int n2) {
        Class193.method3895(Class107.field1407, 0, n);
        if (n2 < 10) {
            return Class107.field1407;
        }
        final double n3 = n / (n2 + 0.0);
        this.field1400.method2198();
        this.field1401.method2198();
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        if (this.field1392 != null) {
            this.field1392.method2198();
            this.field1393.method2198();
            n4 = (int)((this.field1392.field1318 - this.field1392.field1314) * 32.768 / n3);
            n5 = (int)(this.field1392.field1314 * 32.768 / n3);
        }
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        if (this.field1394 != null) {
            this.field1394.method2198();
            this.field1395.method2198();
            n7 = (int)((this.field1394.field1318 - this.field1394.field1314) * 32.768 / n3);
            n8 = (int)(this.field1394.field1314 * 32.768 / n3);
        }
        for (int i = 0; i < 5; ++i) {
            if (this.field1406[i] != 0) {
                Class107.field1390[i] = 0;
                Class107.field1399[i] = (int)(this.field1412[i] * n3);
                Class107.field1413[i] = (this.field1406[i] << 14) / 100;
                Class107.field1414[i] = (int)((this.field1400.field1318 - this.field1400.field1314) * 32.768 * Math.pow(1.0057929410678534, this.field1415[i]) / n3);
                Class107.field1411[i] = (int)(this.field1400.field1314 * 32.768 / n3);
            }
        }
        for (int j = 0; j < n; ++j) {
            int method2206 = this.field1400.method2206(n);
            int method2207 = this.field1401.method2206(n);
            if (this.field1392 != null) {
                final int method2208 = this.field1392.method2206(n);
                method2206 += this.method2467(n6, this.field1393.method2206(n), this.field1392.field1317) >> 1;
                n6 = n6 + n5 + (method2208 * n4 >> 16);
            }
            if (this.field1394 != null) {
                final int method2209 = this.field1394.method2206(n);
                method2207 = method2207 * ((this.method2467(n9, this.field1395.method2206(n), this.field1394.field1317) >> 1) + 32768) >> 15;
                n9 = n9 + n8 + (method2209 * n7 >> 16);
            }
            for (int k = 0; k < 5; ++k) {
                if (this.field1406[k] != 0) {
                    final int n10 = Class107.field1399[k] + j;
                    if (n10 < n) {
                        final int[] field1407 = Class107.field1407;
                        final int n11 = n10;
                        field1407[n11] += this.method2467(Class107.field1390[k], method2207 * Class107.field1413[k] >> 15, this.field1400.field1317);
                        final int[] field1408 = Class107.field1390;
                        final int n12 = k;
                        field1408[n12] += (method2206 * Class107.field1414[k] >> 16) + Class107.field1411[k];
                    }
                }
            }
        }
        if (this.field1396 != null) {
            this.field1396.method2198();
            this.field1397.method2198();
            int n13 = 0;
            boolean b = true;
            for (int l = 0; l < n; ++l) {
                final int method2210 = this.field1396.method2206(n);
                final int method2211 = this.field1397.method2206(n);
                int n14;
                if (b) {
                    n14 = (method2210 * (this.field1396.field1318 - this.field1396.field1314) >> 8) + this.field1396.field1314;
                }
                else {
                    n14 = (method2211 * (this.field1396.field1318 - this.field1396.field1314) >> 8) + this.field1396.field1314;
                }
                n13 += 256;
                if (n13 >= n14) {
                    n13 = 0;
                    b = !b;
                }
                if (b) {
                    Class107.field1407[l] = 0;
                }
            }
        }
        if (this.field1398 > 0 && this.field1402 > 0) {
            int n16;
            for (int n15 = n16 = (int)(this.field1398 * n3); n16 < n; ++n16) {
                final int[] field1409 = Class107.field1407;
                final int n17 = n16;
                field1409[n17] += Class107.field1407[n16 - n15] * this.field1402 / 100;
            }
        }
        if (this.field1403.field1373[0] > 0 || this.field1403.field1373[1] > 0) {
            this.field1410.method2198();
            int n18 = this.field1410.method2206(n + 1);
            int n19 = this.field1403.method2428(0, n18 / 65536.0f);
            int n20 = this.field1403.method2428(1, n18 / 65536.0f);
            if (n >= n19 + n20) {
                int n21 = 0;
                int n22 = n20;
                if (n22 > n - n19) {
                    n22 = n - n19;
                }
                while (n21 < n22) {
                    int n23 = Class107.field1407[n21 + n19] * Class104.field1378 >> 16;
                    for (int n24 = 0; n24 < n19; ++n24) {
                        n23 += Class107.field1407[n21 + n19 - 1 - n24] * Class104.field1376[0][n24] >> 16;
                    }
                    for (int n25 = 0; n25 < n21; ++n25) {
                        n23 -= Class107.field1407[n21 - 1 - n25] * Class104.field1376[1][n25] >> 16;
                    }
                    Class107.field1407[n21] = n23;
                    n18 = this.field1410.method2206(n + 1);
                    ++n21;
                }
                int n26 = 128;
                while (true) {
                    if (n26 > n - n19) {
                        n26 = n - n19;
                    }
                    while (n21 < n26) {
                        int n27 = Class107.field1407[n21 + n19] * Class104.field1378 >> 16;
                        for (int n28 = 0; n28 < n19; ++n28) {
                            n27 += Class107.field1407[n21 + n19 - 1 - n28] * Class104.field1376[0][n28] >> 16;
                        }
                        for (int n29 = 0; n29 < n20; ++n29) {
                            n27 -= Class107.field1407[n21 - 1 - n29] * Class104.field1376[1][n29] >> 16;
                        }
                        Class107.field1407[n21] = n27;
                        n18 = this.field1410.method2206(n + 1);
                        ++n21;
                    }
                    if (n21 >= n - n19) {
                        break;
                    }
                    n19 = this.field1403.method2428(0, n18 / 65536.0f);
                    n20 = this.field1403.method2428(1, n18 / 65536.0f);
                    n26 += 128;
                }
                while (n21 < n) {
                    int n30 = 0;
                    for (int n31 = n21 + n19 - n; n31 < n19; ++n31) {
                        n30 += Class107.field1407[n21 + n19 - 1 - n31] * Class104.field1376[0][n31] >> 16;
                    }
                    for (int n32 = 0; n32 < n20; ++n32) {
                        n30 -= Class107.field1407[n21 - 1 - n32] * Class104.field1376[1][n32] >> 16;
                    }
                    Class107.field1407[n21] = n30;
                    this.field1410.method2206(n + 1);
                    ++n21;
                }
            }
        }
        for (int n33 = 0; n33 < n; ++n33) {
            if (Class107.field1407[n33] < -32768) {
                Class107.field1407[n33] = -32768;
            }
            if (Class107.field1407[n33] > 32767) {
                Class107.field1407[n33] = 32767;
            }
        }
        return Class107.field1407;
    }
    
    @ObfuscatedName("w")
    final int method2467(final int n, final int n2, final int n3) {
        if (n3 == 1) {
            if ((n & 0x7FFF) < 16384) {
                return n2;
            }
            return -n2;
        }
        else {
            if (n3 == 2) {
                return Class107.field1409[n & 0x7FFF] * n2 >> 14;
            }
            if (n3 == 3) {
                return (n2 * (n & 0x7FFF) >> 14) - n2;
            }
            if (n3 == 4) {
                return n2 * Class107.field1408[n / 2607 & 0x7FFF];
            }
            return 0;
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(Lgk;)V")
    final void method2466(final Class182 class182) {
        (this.field1400 = new Class96()).method2199(class182);
        (this.field1401 = new Class96()).method2199(class182);
        if (class182.method3544() != 0) {
            --class182.field2339;
            (this.field1392 = new Class96()).method2199(class182);
            (this.field1393 = new Class96()).method2199(class182);
        }
        if (class182.method3544() != 0) {
            --class182.field2339;
            (this.field1394 = new Class96()).method2199(class182);
            (this.field1395 = new Class96()).method2199(class182);
        }
        if (class182.method3544() != 0) {
            --class182.field2339;
            (this.field1396 = new Class96()).method2199(class182);
            (this.field1397 = new Class96()).method2199(class182);
        }
        for (int i = 0; i < 10; ++i) {
            final int method3562 = class182.method3562();
            if (method3562 == 0) {
                break;
            }
            this.field1406[i] = method3562;
            this.field1415[i] = class182.method3561();
            this.field1412[i] = class182.method3562();
        }
        this.field1398 = class182.method3562();
        this.field1402 = class182.method3562();
        this.field1404 = class182.method3550();
        this.field1405 = class182.method3550();
        this.field1403 = new Class104();
        this.field1410 = new Class96();
        this.field1403.method2425(class182, this.field1410);
    }
}
