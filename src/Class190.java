import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gs")
public final class Class190
{
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1238242625)
    int field2381;
    @ObfuscatedName("u")
    int[] field2384;
    @ObfuscatedName("q")
    int[] field2386;
    @ObfuscatedName("k")
    @ObfuscatedGetter(intValue = -32911809)
    int field2387;
    @ObfuscatedName("i")
    @ObfuscatedGetter(intValue = 165032263)
    int field2385;
    @ObfuscatedName("x")
    @ObfuscatedGetter(intValue = -248497899)
    int field2382;
    
    public Class190(final int[] array) {
        this.field2386 = new int[256];
        this.field2384 = new int[256];
        for (int i = 0; i < array.length; ++i) {
            this.field2384[i] = array[i];
        }
        this.method3861();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1244339201")
    final int method3850() {
        final boolean b = false;
        final int field2381 = this.field2381 - 1;
        this.field2381 = field2381;
        if ((b ? 1 : 0) == field2381 + 1) {
            this.method3852();
            this.field2381 = 255;
        }
        return this.field2384[this.field2381];
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "1777636866")
    final int method3853() {
        if (this.field2381 == 0) {
            this.method3852();
            this.field2381 = 256;
        }
        return this.field2384[this.field2381 - 1];
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-544469787")
    final void method3852() {
        this.field2385 += ++this.field2382;
        for (int i = 0; i < 256; ++i) {
            final int n = this.field2386[i];
            if ((i & 0x2) == 0x0) {
                if ((i & 0x1) == 0x0) {
                    this.field2387 ^= this.field2387 << 13;
                }
                else {
                    this.field2387 ^= this.field2387 >>> 6;
                }
            }
            else if ((i & 0x1) == 0x0) {
                this.field2387 ^= this.field2387 << 2;
            }
            else {
                this.field2387 ^= this.field2387 >>> 16;
            }
            this.field2387 += this.field2386[128 + i & 0xFF];
            this.field2384[i] = (this.field2385 = this.field2386[((this.field2386[i] = this.field2386[(n & 0x3FC) >> 2] + this.field2385 + this.field2387) >> 8 & 0x3FC) >> 2] + n);
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-322691741")
    final void method3861() {
        int n = -1640531527;
        int n2 = -1640531527;
        int n3 = -1640531527;
        int n4 = -1640531527;
        int n5 = -1640531527;
        int n6 = -1640531527;
        int n7 = -1640531527;
        int n8 = -1640531527;
        for (int i = 0; i < 4; ++i) {
            final int n9 = n8 ^ n7 << 11;
            final int n10 = n5 + n9;
            final int n11 = n7 + n6 ^ n6 >>> 2;
            final int n12 = n4 + n11;
            final int n13 = n6 + n10 ^ n10 << 8;
            final int n14 = n3 + n13;
            n5 = (n10 + n12 ^ n12 >>> 16);
            final int n15 = n2 + n5;
            n4 = (n12 + n14 ^ n14 << 10);
            final int n16 = n + n4;
            n3 = (n14 + n15 ^ n15 >>> 4);
            final int n17 = n9 + n3;
            n2 = (n15 + n16 ^ n16 << 8);
            n7 = n11 + n2;
            n = (n16 + n17 ^ n17 >>> 9);
            n6 = n13 + n;
            n8 = n17 + n7;
        }
        for (int j = 0; j < 256; j += 8) {
            final int n18 = n8 + this.field2384[j];
            final int n19 = n7 + this.field2384[j + 1];
            final int n20 = n6 + this.field2384[j + 2];
            final int n21 = n5 + this.field2384[j + 3];
            final int n22 = n4 + this.field2384[j + 4];
            final int n23 = this.field2384[j + 5] + n3;
            final int n24 = n2 + this.field2384[j + 6];
            final int n25 = this.field2384[j + 7] + n;
            final int n26 = n18 ^ n19 << 11;
            final int n27 = n21 + n26;
            final int n28 = n19 + n20 ^ n20 >>> 2;
            final int n29 = n22 + n28;
            final int n30 = n20 + n27 ^ n27 << 8;
            final int n31 = n23 + n30;
            n5 = (n27 + n29 ^ n29 >>> 16);
            final int n32 = n24 + n5;
            n4 = (n29 + n31 ^ n31 << 10);
            final int n33 = n25 + n4;
            n3 = (n31 + n32 ^ n32 >>> 4);
            final int n34 = n26 + n3;
            n2 = (n32 + n33 ^ n33 << 8);
            n7 = n28 + n2;
            n = (n33 + n34 ^ n34 >>> 9);
            n6 = n30 + n;
            n8 = n34 + n7;
            this.field2386[j] = n8;
            this.field2386[j + 1] = n7;
            this.field2386[j + 2] = n6;
            this.field2386[j + 3] = n5;
            this.field2386[j + 4] = n4;
            this.field2386[j + 5] = n3;
            this.field2386[j + 6] = n2;
            this.field2386[j + 7] = n;
        }
        for (int k = 0; k < 256; k += 8) {
            final int n35 = n8 + this.field2386[k];
            final int n36 = n7 + this.field2386[k + 1];
            final int n37 = n6 + this.field2386[k + 2];
            final int n38 = this.field2386[k + 3] + n5;
            final int n39 = this.field2386[k + 4] + n4;
            final int n40 = this.field2386[k + 5] + n3;
            final int n41 = n2 + this.field2386[k + 6];
            final int n42 = n + this.field2386[k + 7];
            final int n43 = n35 ^ n36 << 11;
            final int n44 = n38 + n43;
            final int n45 = n36 + n37 ^ n37 >>> 2;
            final int n46 = n39 + n45;
            final int n47 = n37 + n44 ^ n44 << 8;
            final int n48 = n40 + n47;
            n5 = (n44 + n46 ^ n46 >>> 16);
            final int n49 = n41 + n5;
            n4 = (n46 + n48 ^ n48 << 10);
            final int n50 = n42 + n4;
            n3 = (n48 + n49 ^ n49 >>> 4);
            final int n51 = n43 + n3;
            n2 = (n49 + n50 ^ n50 << 8);
            n7 = n45 + n2;
            n = (n50 + n51 ^ n51 >>> 9);
            n6 = n47 + n;
            n8 = n51 + n7;
            this.field2386[k] = n8;
            this.field2386[k + 1] = n7;
            this.field2386[k + 2] = n6;
            this.field2386[k + 3] = n5;
            this.field2386[k + 4] = n4;
            this.field2386[k + 5] = n3;
            this.field2386[k + 6] = n2;
            this.field2386[k + 7] = n;
        }
        this.method3852();
        this.field2381 = 256;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IS)I", garbageValue = "-25401")
    public static int method3865(final int n) {
        return n >> 17 & 0x7;
    }
}
