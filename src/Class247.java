import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ir")
public abstract class Class247
{
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "Lfv;")
    static Class175 field3172;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = -2137229897)
    static int field3176;
    @ObfuscatedName("w")
    @ObfuscatedGetter(intValue = 883985551)
    int field3171;
    @ObfuscatedName("s")
    int[] field3161;
    @ObfuscatedName("l")
    int[] field3160;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Lgh;")
    Class198 field3163;
    @ObfuscatedName("q")
    int[] field3164;
    @ObfuscatedName("k")
    int[] field3162;
    @ObfuscatedName("i")
    int[] field3166;
    @ObfuscatedName("x")
    int[][] field3167;
    @ObfuscatedName("e")
    int[][] field3168;
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "[Lgh;")
    Class198[] field3173;
    @ObfuscatedName("b")
    Object[] field3165;
    @ObfuscatedName("n")
    Object[][] field3169;
    @ObfuscatedName("g")
    @ObfuscatedGetter(intValue = 516934159)
    public int field3175;
    @ObfuscatedName("m")
    boolean field3174;
    @ObfuscatedName("r")
    boolean field3170;
    
    static {
        Class247.field3172 = new Class175();
        Class247.field3176 = 0;
    }
    
    Class247(final boolean field3174, final boolean field3175) {
        this.field3174 = field3174;
        this.field3170 = field3175;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([BB)V", garbageValue = "65")
    void method4622(final byte[] array) {
        this.field3175 = Class187.method3812(array, 0, array.length);
        final Class182 class182 = new Class182(Class47.method912(array));
        final int method3544 = class182.method3544();
        if (method3544 < 5 || method3544 > 7) {
            throw new RuntimeException("");
        }
        if (method3544 >= 6) {
            class182.method3671();
        }
        final int method3545 = class182.method3544();
        if (method3544 >= 7) {
            this.field3171 = class182.method3611();
        }
        else {
            this.field3171 = class182.method3550();
        }
        int n = 0;
        int n2 = -1;
        this.field3161 = new int[this.field3171];
        if (method3544 >= 7) {
            for (int i = 0; i < this.field3171; ++i) {
                n = (this.field3161[i] = n + class182.method3611());
                if (this.field3161[i] > n2) {
                    n2 = this.field3161[i];
                }
            }
        }
        else {
            for (int j = 0; j < this.field3171; ++j) {
                n = (this.field3161[j] = n + class182.method3550());
                if (this.field3161[j] > n2) {
                    n2 = this.field3161[j];
                }
            }
        }
        this.field3164 = new int[n2 + 1];
        this.field3162 = new int[n2 + 1];
        this.field3166 = new int[n2 + 1];
        this.field3167 = new int[n2 + 1][];
        this.field3165 = new Object[n2 + 1];
        this.field3169 = new Object[n2 + 1][];
        if (method3545 != 0) {
            this.field3160 = new int[n2 + 1];
            for (int k = 0; k < this.field3171; ++k) {
                this.field3160[this.field3161[k]] = class182.method3671();
            }
            this.field3163 = new Class198(this.field3160);
        }
        for (int l = 0; l < this.field3171; ++l) {
            this.field3164[this.field3161[l]] = class182.method3671();
        }
        for (int n3 = 0; n3 < this.field3171; ++n3) {
            this.field3162[this.field3161[n3]] = class182.method3671();
        }
        for (int n4 = 0; n4 < this.field3171; ++n4) {
            this.field3166[this.field3161[n4]] = class182.method3550();
        }
        if (method3544 >= 7) {
            for (int n5 = 0; n5 < this.field3171; ++n5) {
                final int n6 = this.field3161[n5];
                final int n7 = this.field3166[n6];
                int n8 = 0;
                int n9 = -1;
                this.field3167[n6] = new int[n7];
                for (int n10 = 0; n10 < n7; ++n10) {
                    final int[] array2 = this.field3167[n6];
                    final int n11 = n10;
                    final int n12 = n8 += class182.method3611();
                    array2[n11] = n12;
                    final int n13 = n12;
                    if (n13 > n9) {
                        n9 = n13;
                    }
                }
                this.field3169[n6] = new Object[n9 + 1];
            }
        }
        else {
            for (int n14 = 0; n14 < this.field3171; ++n14) {
                final int n15 = this.field3161[n14];
                final int n16 = this.field3166[n15];
                int n17 = 0;
                int n18 = -1;
                this.field3167[n15] = new int[n16];
                for (int n19 = 0; n19 < n16; ++n19) {
                    final int[] array3 = this.field3167[n15];
                    final int n20 = n19;
                    final int n21 = n17 += class182.method3550();
                    array3[n20] = n21;
                    final int n22 = n21;
                    if (n22 > n18) {
                        n18 = n22;
                    }
                }
                this.field3169[n15] = new Object[n18 + 1];
            }
        }
        if (method3545 != 0) {
            this.field3168 = new int[n2 + 1][];
            this.field3173 = new Class198[n2 + 1];
            for (int n23 = 0; n23 < this.field3171; ++n23) {
                final int n24 = this.field3161[n23];
                final int n25 = this.field3166[n24];
                this.field3168[n24] = new int[this.field3169[n24].length];
                for (int n26 = 0; n26 < n25; ++n26) {
                    this.field3168[n24][this.field3167[n24][n26]] = class182.method3671();
                }
                this.field3173[n24] = new Class198(this.field3168[n24]);
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "-114")
    void vmethod4721(final int n) {
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(III)[B", garbageValue = "1818456524")
    public byte[] method4625(final int n, final int n2) {
        return this.method4628(n, n2, null);
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II[IB)[B", garbageValue = "18")
    public byte[] method4628(final int n, final int n2, final int[] array) {
        if (n < 0 || n >= this.field3169.length || this.field3169[n] == null || n2 < 0 || n2 >= this.field3169[n].length) {
            return null;
        }
        if (this.field3169[n][n2] == null && !this.method4693(n, array)) {
            this.vmethod4722(n);
            if (!this.method4693(n, array)) {
                return null;
            }
        }
        final byte[] method2211 = Class97.method2211(this.field3169[n][n2], false);
        if (this.field3170) {
            this.field3169[n][n2] = null;
        }
        return method2211;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IIB)Z", garbageValue = "1")
    public boolean method4696(final int n, final int n2) {
        if (n < 0 || n >= this.field3169.length || this.field3169[n] == null || n2 < 0 || n2 >= this.field3169[n].length) {
            return false;
        }
        if (this.field3169[n][n2] != null) {
            return true;
        }
        if (this.field3165[n] != null) {
            return true;
        }
        this.vmethod4722(n);
        return this.field3165[n] != null;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "107")
    public boolean method4627(final int n) {
        if (this.field3169.length == 1) {
            return this.method4696(0, n);
        }
        if (this.field3169[n].length == 1) {
            return this.method4696(n, 0);
        }
        throw new RuntimeException();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "14")
    public boolean method4707(final int n) {
        if (this.field3165[n] != null) {
            return true;
        }
        this.vmethod4722(n);
        return this.field3165[n] != null;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "758366307")
    public boolean method4629() {
        boolean b = true;
        for (int i = 0; i < this.field3161.length; ++i) {
            final int n = this.field3161[i];
            if (this.field3165[n] == null) {
                this.vmethod4722(n);
                if (this.field3165[n] == null) {
                    b = false;
                }
            }
        }
        return b;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(IB)I", garbageValue = "35")
    int vmethod4727(final int n) {
        if (this.field3165[n] != null) {
            return 100;
        }
        return 0;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(II)[B", garbageValue = "-265893488")
    public byte[] method4689(final int n) {
        if (this.field3169.length == 1) {
            return this.method4625(0, n);
        }
        if (this.field3169[n].length == 1) {
            return this.method4625(n, 0);
        }
        throw new RuntimeException();
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(III)[B", garbageValue = "-322980430")
    public byte[] method4676(final int n, final int n2) {
        if (n < 0 || n >= this.field3169.length || this.field3169[n] == null || n2 < 0 || n2 >= this.field3169[n].length) {
            return null;
        }
        if (this.field3169[n][n2] == null && !this.method4693(n, null)) {
            this.vmethod4722(n);
            if (!this.method4693(n, null)) {
                return null;
            }
        }
        return Class97.method2211(this.field3169[n][n2], false);
    }
    
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "(IS)[B", garbageValue = "-10823")
    public byte[] method4626(final int n) {
        if (this.field3169.length == 1) {
            return this.method4676(0, n);
        }
        if (this.field3169[n].length == 1) {
            return this.method4676(n, 0);
        }
        throw new RuntimeException();
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "10")
    void vmethod4722(final int n) {
    }
    
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "(II)[I", garbageValue = "889237551")
    public int[] method4668(final int n) {
        return this.field3167[n];
    }
    
    @ObfuscatedName("m")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "180707885")
    public int method4636(final int n) {
        return this.field3169[n].length;
    }
    
    @ObfuscatedName("r")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "252467795")
    public int method4637() {
        return this.field3169.length;
    }
    
    @ObfuscatedName("t")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "59")
    public void method4702() {
        for (int i = 0; i < this.field3165.length; ++i) {
            this.field3165[i] = null;
        }
    }
    
    @ObfuscatedName("o")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "38")
    public void method4639(final int n) {
        for (int i = 0; i < this.field3169[n].length; ++i) {
            this.field3169[n][i] = null;
        }
    }
    
    @ObfuscatedName("y")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2135464480")
    public void method4640() {
        for (int i = 0; i < this.field3169.length; ++i) {
            if (this.field3169[i] != null) {
                for (int j = 0; j < this.field3169[i].length; ++j) {
                    this.field3169[i][j] = null;
                }
            }
        }
    }
    
    @ObfuscatedName("a")
    @ObfuscatedSignature(signature = "(I[IB)Z", garbageValue = "123")
    boolean method4693(final int n, final int[] array) {
        if (this.field3165[n] == null) {
            return false;
        }
        final int n2 = this.field3166[n];
        final int[] array2 = this.field3167[n];
        final Object[] array3 = this.field3169[n];
        boolean b = true;
        for (int i = 0; i < n2; ++i) {
            if (array3[array2[i]] == null) {
                b = false;
                break;
            }
        }
        if (b) {
            return true;
        }
        byte[] array4;
        if (array != null && (array[0] != 0 || array[1] != 0 || array[2] != 0 || array[3] != 0)) {
            array4 = Class97.method2211(this.field3165[n], true);
            final Class182 class182 = new Class182(array4);
            class182.method3570(array, 5, class182.payload.length);
        }
        else {
            array4 = Class97.method2211(this.field3165[n], false);
        }
        final byte[] method912 = Class47.method912(array4);
        if (this.field3174) {
            this.field3165[n] = null;
        }
        if (n2 > 1) {
            int length = method912.length;
            final int n3 = method912[--length] & 0xFF;
            final int n4 = length - n2 * n3 * 4;
            final Class182 class183 = new Class182(method912);
            final int[] array5 = new int[n2];
            class183.field2339 = n4;
            for (int j = 0; j < n3; ++j) {
                int n5 = 0;
                for (int k = 0; k < n2; ++k) {
                    n5 += class183.method3671();
                    final int[] array6 = array5;
                    final int n6 = k;
                    array6[n6] += n5;
                }
            }
            final byte[][] array7 = new byte[n2][];
            for (int l = 0; l < n2; ++l) {
                array7[l] = new byte[array5[l]];
                array5[l] = 0;
            }
            class183.field2339 = n4;
            int n7 = 0;
            for (int n8 = 0; n8 < n3; ++n8) {
                int n9 = 0;
                for (int n10 = 0; n10 < n2; ++n10) {
                    n9 += class183.method3671();
                    System.arraycopy(method912, n7, array7[n10], array5[n10], n9);
                    final int[] array8 = array5;
                    final int n11 = n10;
                    array8[n11] += n9;
                    n7 += n9;
                }
            }
            for (int n12 = 0; n12 < n2; ++n12) {
                if (!this.field3170) {
                    array3[array2[n12]] = Class159.method3324(array7[n12], false);
                }
                else {
                    array3[array2[n12]] = array7[n12];
                }
            }
        }
        else if (!this.field3170) {
            array3[array2[0]] = Class159.method3324(method912, false);
        }
        else {
            array3[array2[0]] = method912;
        }
        return true;
    }
    
    @ObfuscatedName("c")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)I", garbageValue = "258440210")
    public int method4642(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.field3163.method3967(Class277.method5240(lowerCase));
    }
    
    @ObfuscatedName("v")
    @ObfuscatedSignature(signature = "(ILjava/lang/String;I)I", garbageValue = "-981702486")
    public int method4643(final int n, String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.field3173[n].method3967(Class277.method5240(lowerCase));
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;B)Z", garbageValue = "9")
    public boolean method4644(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int method3967 = this.field3163.method3967(Class277.method5240(lowerCase));
        return method3967 >= 0 && this.field3173[method3967].method3967(Class277.method5240(lowerCase2)) >= 0;
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;I)[B", garbageValue = "222409025")
    public byte[] method4684(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int method3967 = this.field3163.method3967(Class277.method5240(lowerCase));
        return this.method4625(method3967, this.field3173[method3967].method3967(Class277.method5240(lowerCase2)));
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;Ljava/lang/String;I)Z", garbageValue = "-1256800993")
    public boolean method4646(String lowerCase, String lowerCase2) {
        lowerCase = lowerCase.toLowerCase();
        lowerCase2 = lowerCase2.toLowerCase();
        final int method3967 = this.field3163.method3967(Class277.method5240(lowerCase));
        return this.method4696(method3967, this.field3173[method3967].method3967(Class277.method5240(lowerCase2)));
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)Z", garbageValue = "-574756361")
    public boolean method4704(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.method4707(this.field3163.method3967(Class277.method5240(lowerCase)));
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)V", garbageValue = "-1722462563")
    public void method4648(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        final int method3967 = this.field3163.method3967(Class277.method5240(lowerCase));
        if (method3967 < 0) {
            return;
        }
        this.vmethod4721(method3967);
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(Ljava/lang/String;I)I", garbageValue = "17959811")
    public int method4687(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.vmethod4727(this.field3163.method3967(Class277.method5240(lowerCase)));
    }
}
