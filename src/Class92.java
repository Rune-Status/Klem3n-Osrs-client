import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cs")
public class Class92 extends Class204
{
    @ObfuscatedName("k")
    static byte[] field1266;
    @ObfuscatedName("i")
    static int field1250;
    @ObfuscatedName("x")
    static int field1262;
    @ObfuscatedName("e")
    static int field1252;
    @ObfuscatedName("p")
    static int field1259;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "[Lcv;")
    static Class90[] field1254;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "[Lcc;")
    static Class94[] field1255;
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "[Lck;")
    static Class101[] field1273;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "[Ldz;")
    static Class106[] field1257;
    @ObfuscatedName("m")
    static boolean[] field1258;
    @ObfuscatedName("r")
    static int[] field1243;
    @ObfuscatedName("t")
    static boolean field1260;
    @ObfuscatedName("d")
    static float[] field1265;
    @ObfuscatedName("h")
    static float[] field1251;
    @ObfuscatedName("c")
    static float[] field1269;
    @ObfuscatedName("v")
    static float[] field1268;
    @ObfuscatedName("af")
    static float[] field1247;
    @ObfuscatedName("ah")
    static float[] field1270;
    @ObfuscatedName("ab")
    static float[] field1271;
    @ObfuscatedName("aw")
    static int[] field1272;
    @ObfuscatedName("ak")
    static int[] field1267;
    @ObfuscatedName("z")
    byte[][] field1263;
    @ObfuscatedName("w")
    int field1244;
    @ObfuscatedName("s")
    int field1245;
    @ObfuscatedName("l")
    int field1246;
    @ObfuscatedName("u")
    int field1253;
    @ObfuscatedName("q")
    boolean field1248;
    @ObfuscatedName("o")
    float[] field1261;
    @ObfuscatedName("y")
    int field1264;
    @ObfuscatedName("a")
    int field1249;
    @ObfuscatedName("j")
    boolean field1256;
    @ObfuscatedName("as")
    byte[] field1274;
    @ObfuscatedName("an")
    int field1275;
    @ObfuscatedName("ao")
    int field1276;
    
    static {
        Class92.field1260 = false;
    }
    
    Class92(final byte[] array) {
        this.method2094(array);
    }
    
    @ObfuscatedName("u")
    void method2094(final byte[] array) {
        final Class182 class182 = new Class182(array);
        this.field1244 = class182.method3671();
        this.field1245 = class182.method3671();
        this.field1246 = class182.method3671();
        this.field1253 = class182.method3671();
        if (this.field1253 < 0) {
            this.field1253 ^= -1;
            this.field1248 = true;
        }
        final int method3671 = class182.method3671();
        this.field1263 = new byte[method3671][];
        for (int i = 0; i < method3671; ++i) {
            int n = 0;
            int method3672;
            do {
                method3672 = class182.method3544();
                n += method3672;
            } while (method3672 >= 255);
            final byte[] array2 = new byte[n];
            class182.method3539(array2, 0, n);
            this.field1263[i] = array2;
        }
    }
    
    @ObfuscatedName("i")
    float[] method2086(final int n) {
        method2081(this.field1263[n], 0);
        method2093();
        final int method2108 = method2108(Class143.method3173(Class92.field1243.length - 1));
        final boolean b = Class92.field1258[method2108];
        final int field1264 = b ? Class92.field1259 : Class92.field1252;
        int n2 = 0;
        int n3 = 0;
        if (b) {
            n2 = ((method2093() != 0) ? 1 : 0);
            n3 = ((method2093() != 0) ? 1 : 0);
        }
        final int n4 = field1264 >> 1;
        int n5;
        int n6;
        int n7;
        if (b && n2 == 0) {
            n5 = (field1264 >> 2) - (Class92.field1252 >> 2);
            n6 = (Class92.field1252 >> 2) + (field1264 >> 2);
            n7 = Class92.field1252 >> 1;
        }
        else {
            n5 = 0;
            n6 = n4;
            n7 = field1264 >> 1;
        }
        int n8;
        int n9;
        int n10;
        if (b && n3 == 0) {
            n8 = field1264 - (field1264 >> 2) - (Class92.field1252 >> 2);
            n9 = (Class92.field1252 >> 2) + (field1264 - (field1264 >> 2));
            n10 = Class92.field1252 >> 1;
        }
        else {
            n8 = n4;
            n9 = field1264;
            n10 = field1264 >> 1;
        }
        final Class106 class106 = Class92.field1257[Class92.field1243[method2108]];
        final boolean b2;
        final boolean field1265 = b2 = !Class92.field1255[class106.field1389[class106.field1387]].method2121();
        for (int i = 0; i < class106.field1388; ++i) {
            Class92.field1273[class106.field1386[i]].method2234(Class92.field1265, field1264 >> 1, b2);
        }
        if (!field1265) {
            Class92.field1255[class106.field1389[class106.field1387]].method2141(Class92.field1265, field1264 >> 1);
        }
        if (field1265) {
            for (int j = field1264 >> 1; j < field1264; ++j) {
                Class92.field1265[j] = 0.0f;
            }
        }
        else {
            final int n11 = field1264 >> 1;
            final int n12 = field1264 >> 2;
            final int n13 = field1264 >> 3;
            final float[] field1266 = Class92.field1265;
            for (int k = 0; k < n11; ++k) {
                final float[] array = field1266;
                final int n14 = k;
                array[n14] *= 0.5f;
            }
            for (int l = n11; l < field1264; ++l) {
                field1266[l] = -field1266[field1264 - l - 1];
            }
            final float[] array2 = b ? Class92.field1247 : Class92.field1251;
            final float[] array3 = b ? Class92.field1270 : Class92.field1269;
            final float[] array4 = b ? Class92.field1271 : Class92.field1268;
            final int[] array5 = b ? Class92.field1267 : Class92.field1272;
            for (int n15 = 0; n15 < n12; ++n15) {
                final float n16 = field1266[n15 * 4] - field1266[field1264 - n15 * 4 - 1];
                final float n17 = field1266[n15 * 4 + 2] - field1266[field1264 - n15 * 4 - 3];
                final float n18 = array2[n15 * 2];
                final float n19 = array2[n15 * 2 + 1];
                field1266[field1264 - n15 * 4 - 1] = n16 * n18 - n17 * n19;
                field1266[field1264 - n15 * 4 - 3] = n16 * n19 + n17 * n18;
            }
            for (int n20 = 0; n20 < n13; ++n20) {
                final float n21 = field1266[n11 + n20 * 4 + 3];
                final float n22 = field1266[n11 + n20 * 4 + 1];
                final float n23 = field1266[n20 * 4 + 3];
                final float n24 = field1266[n20 * 4 + 1];
                field1266[n11 + n20 * 4 + 3] = n21 + n23;
                field1266[n11 + n20 * 4 + 1] = n22 + n24;
                final float n25 = array2[n11 - 4 - n20 * 4];
                final float n26 = array2[n11 - 3 - n20 * 4];
                field1266[n20 * 4 + 3] = (n21 - n23) * n25 - (n22 - n24) * n26;
                field1266[n20 * 4 + 1] = (n22 - n24) * n25 + (n21 - n23) * n26;
            }
            for (int method2109 = Class143.method3173(field1264 - 1), n27 = 0; n27 < method2109 - 3; ++n27) {
                final int n28 = field1264 >> n27 + 2;
                final int n29 = 8 << n27;
                for (int n30 = 0; n30 < 2 << n27; ++n30) {
                    final int n31 = field1264 - n28 * n30 * 2;
                    final int n32 = field1264 - n28 * (n30 * 2 + 1);
                    for (int n33 = 0; n33 < field1264 >> n27 + 4; ++n33) {
                        final int n34 = n33 * 4;
                        final float n35 = field1266[n31 - 1 - n34];
                        final float n36 = field1266[n31 - 3 - n34];
                        final float n37 = field1266[n32 - 1 - n34];
                        final float n38 = field1266[n32 - 3 - n34];
                        field1266[n31 - 1 - n34] = n35 + n37;
                        field1266[n31 - 3 - n34] = n36 + n38;
                        final float n39 = array2[n33 * n29];
                        final float n40 = array2[n33 * n29 + 1];
                        field1266[n32 - 1 - n34] = (n35 - n37) * n39 - (n36 - n38) * n40;
                        field1266[n32 - 3 - n34] = (n36 - n38) * n39 + (n35 - n37) * n40;
                    }
                }
            }
            for (int n41 = 1; n41 < n13 - 1; ++n41) {
                final int n42 = array5[n41];
                if (n41 < n42) {
                    final int n43 = n41 * 8;
                    final int n44 = n42 * 8;
                    final float n45 = field1266[n43 + 1];
                    field1266[n43 + 1] = field1266[n44 + 1];
                    field1266[n44 + 1] = n45;
                    final float n46 = field1266[n43 + 3];
                    field1266[n43 + 3] = field1266[n44 + 3];
                    field1266[n44 + 3] = n46;
                    final float n47 = field1266[n43 + 5];
                    field1266[n43 + 5] = field1266[n44 + 5];
                    field1266[n44 + 5] = n47;
                    final float n48 = field1266[n43 + 7];
                    field1266[n43 + 7] = field1266[n44 + 7];
                    field1266[n44 + 7] = n48;
                }
            }
            for (int n49 = 0; n49 < n11; ++n49) {
                field1266[n49] = field1266[n49 * 2 + 1];
            }
            for (int n50 = 0; n50 < n13; ++n50) {
                field1266[field1264 - 1 - n50 * 2] = field1266[n50 * 4];
                field1266[field1264 - 2 - n50 * 2] = field1266[n50 * 4 + 1];
                field1266[field1264 - n12 - 1 - n50 * 2] = field1266[n50 * 4 + 2];
                field1266[field1264 - n12 - 2 - n50 * 2] = field1266[n50 * 4 + 3];
            }
            for (int n51 = 0; n51 < n13; ++n51) {
                final float n52 = array4[n51 * 2];
                final float n53 = array4[n51 * 2 + 1];
                final float n54 = field1266[n11 + n51 * 2];
                final float n55 = field1266[n11 + n51 * 2 + 1];
                final float n56 = field1266[field1264 - 2 - n51 * 2];
                final float n57 = field1266[field1264 - 1 - n51 * 2];
                final float n58 = n53 * (n54 - n56) + n52 * (n55 + n57);
                field1266[n11 + n51 * 2] = (n54 + n56 + n58) * 0.5f;
                field1266[field1264 - 2 - n51 * 2] = (n54 + n56 - n58) * 0.5f;
                final float n59 = n53 * (n55 + n57) - n52 * (n54 - n56);
                field1266[n11 + n51 * 2 + 1] = (n55 - n57 + n59) * 0.5f;
                field1266[field1264 - 1 - n51 * 2] = (-n55 + n57 + n59) * 0.5f;
            }
            for (int n60 = 0; n60 < n12; ++n60) {
                field1266[n60] = field1266[n11 + n60 * 2] * array3[n60 * 2] + field1266[n11 + n60 * 2 + 1] * array3[n60 * 2 + 1];
                field1266[n11 - 1 - n60] = field1266[n11 + n60 * 2] * array3[n60 * 2 + 1] - field1266[n11 + n60 * 2 + 1] * array3[n60 * 2];
            }
            for (int n61 = 0; n61 < n12; ++n61) {
                field1266[n61 + (field1264 - n12)] = -field1266[n61];
            }
            for (int n62 = 0; n62 < n12; ++n62) {
                field1266[n62] = field1266[n12 + n62];
            }
            for (int n63 = 0; n63 < n12; ++n63) {
                field1266[n12 + n63] = -field1266[n12 - n63 - 1];
            }
            for (int n64 = 0; n64 < n12; ++n64) {
                field1266[n11 + n64] = field1266[field1264 - n64 - 1];
            }
            for (int n65 = n5; n65 < n6; ++n65) {
                final float n66 = (float)Math.sin((n65 - n5 + 0.5) / n7 * 0.5 * 3.141592653589793);
                final float[] field1267 = Class92.field1265;
                final int n67 = n65;
                field1267[n67] *= (float)Math.sin(1.5707963267948966 * n66 * n66);
            }
            for (int n68 = n8; n68 < n9; ++n68) {
                final float n69 = (float)Math.sin((n68 - n8 + 0.5) / n10 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                final float[] field1268 = Class92.field1265;
                final int n70 = n68;
                field1268[n70] *= (float)Math.sin(1.5707963267948966 * n69 * n69);
            }
        }
        float[] array6 = null;
        if (this.field1264 > 0) {
            array6 = new float[field1264 + this.field1264 >> 2];
            if (!this.field1256) {
                for (int n71 = 0; n71 < this.field1249; ++n71) {
                    final int n72 = n71 + (this.field1264 >> 1);
                    final float[] array7 = array6;
                    final int n73 = n71;
                    array7[n73] += this.field1261[n72];
                }
            }
            if (!field1265) {
                for (int n74 = n5; n74 < field1264 >> 1; ++n74) {
                    final int n75 = array6.length - (field1264 >> 1) + n74;
                    final float[] array8 = array6;
                    final int n76 = n75;
                    array8[n76] += Class92.field1265[n74];
                }
            }
        }
        final float[] field1269 = this.field1261;
        this.field1261 = Class92.field1265;
        Class92.field1265 = field1269;
        this.field1264 = field1264;
        this.field1249 = n9 - (field1264 >> 1);
        this.field1256 = field1265;
        return array6;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "([I)Lct;")
    Class93 method2083(final int[] array) {
        if (array != null && array[0] <= 0) {
            return null;
        }
        if (this.field1274 == null) {
            this.field1264 = 0;
            this.field1261 = new float[Class92.field1259];
            this.field1274 = new byte[this.field1245];
            this.field1275 = 0;
            this.field1276 = 0;
        }
        while (this.field1276 < this.field1263.length) {
            if (array != null && array[0] <= 0) {
                return null;
            }
            final float[] method2086 = this.method2086(this.field1276);
            if (method2086 != null) {
                int field1275 = this.field1275;
                int length = method2086.length;
                if (length > this.field1245 - field1275) {
                    length = this.field1245 - field1275;
                }
                for (int i = 0; i < length; ++i) {
                    int n = (int)(128.0f + method2086[i] * 128.0f);
                    if ((n & 0xFFFFFF00) != 0x0) {
                        n = ~n >> 31;
                    }
                    this.field1274[field1275++] = (byte)(n - 128);
                }
                if (array != null) {
                    final int n2 = 0;
                    array[n2] -= field1275 - this.field1275;
                }
                this.field1275 = field1275;
            }
            ++this.field1276;
        }
        this.field1261 = null;
        final byte[] field1276 = this.field1274;
        this.field1274 = null;
        return new Class93(this.field1244, field1276, this.field1246, this.field1253, this.field1248);
    }
    
    @ObfuscatedName("z")
    static float method2106(final int n) {
        int n2 = n & 0x1FFFFF;
        final int n3 = n & Integer.MIN_VALUE;
        final int n4 = (n & 0x7FE00000) >> 21;
        if (n3 != 0) {
            n2 = -n2;
        }
        return (float)(n2 * Math.pow(2.0, n4 - 788));
    }
    
    @ObfuscatedName("w")
    static void method2081(final byte[] field1266, final int field1267) {
        Class92.field1266 = field1266;
        Class92.field1250 = field1267;
        Class92.field1262 = 0;
    }
    
    @ObfuscatedName("s")
    static int method2093() {
        final int n = Class92.field1266[Class92.field1250] >> Class92.field1262 & 0x1;
        ++Class92.field1262;
        Class92.field1250 += Class92.field1262 >> 3;
        Class92.field1262 &= 0x7;
        return n;
    }
    
    @ObfuscatedName("l")
    static int method2108(int i) {
        int n = 0;
        int n2 = 0;
        while (i >= 8 - Class92.field1262) {
            final int n3 = 8 - Class92.field1262;
            n += (Class92.field1266[Class92.field1250] >> Class92.field1262 & (1 << n3) - 1) << n2;
            Class92.field1262 = 0;
            ++Class92.field1250;
            n2 += n3;
            i -= n3;
        }
        if (i > 0) {
            n += (Class92.field1266[Class92.field1250] >> Class92.field1262 & (1 << i) - 1) << n2;
            Class92.field1262 += i;
        }
        return n;
    }
    
    @ObfuscatedName("q")
    static void method2082(final byte[] array) {
        method2081(array, 0);
        Class92.field1252 = 1 << method2108(4);
        Class92.field1259 = 1 << method2108(4);
        Class92.field1265 = new float[Class92.field1259];
        for (int i = 0; i < 2; ++i) {
            final int n = (i != 0) ? Class92.field1259 : Class92.field1252;
            final int n2 = n >> 1;
            final int n3 = n >> 2;
            final int n4 = n >> 3;
            final float[] array2 = new float[n2];
            for (int j = 0; j < n3; ++j) {
                array2[j * 2] = (float)Math.cos(j * 4 * 3.141592653589793 / n);
                array2[j * 2 + 1] = -(float)Math.sin(j * 4 * 3.141592653589793 / n);
            }
            final float[] array3 = new float[n2];
            for (int k = 0; k < n3; ++k) {
                array3[k * 2] = (float)Math.cos((k * 2 + 1) * 3.141592653589793 / (n * 2));
                array3[k * 2 + 1] = (float)Math.sin((k * 2 + 1) * 3.141592653589793 / (n * 2));
            }
            final float[] array4 = new float[n3];
            for (int l = 0; l < n4; ++l) {
                array4[l * 2] = (float)Math.cos((l * 4 + 2) * 3.141592653589793 / n);
                array4[l * 2 + 1] = -(float)Math.sin((l * 4 + 2) * 3.141592653589793 / n);
            }
            final int[] array5 = new int[n4];
            final int method3173 = Class143.method3173(n4 - 1);
            for (int n5 = 0; n5 < n4; ++n5) {
                final int[] array6 = array5;
                final int n6 = n5;
                int n7 = n5;
                int n8 = method3173;
                int n9 = 0;
                while (n8 > 0) {
                    n9 = (n9 << 1 | (n7 & 0x1));
                    n7 >>>= 1;
                    --n8;
                }
                array6[n6] = n9;
            }
            if (i != 0) {
                Class92.field1247 = array2;
                Class92.field1270 = array3;
                Class92.field1271 = array4;
                Class92.field1267 = array5;
            }
            else {
                Class92.field1251 = array2;
                Class92.field1269 = array3;
                Class92.field1268 = array4;
                Class92.field1272 = array5;
            }
        }
        final int n10 = method2108(8) + 1;
        Class92.field1254 = new Class90[n10];
        for (int n11 = 0; n11 < n10; ++n11) {
            Class92.field1254[n11] = new Class90();
        }
        for (int n12 = method2108(6) + 1, n13 = 0; n13 < n12; ++n13) {
            method2108(16);
        }
        final int n14 = method2108(6) + 1;
        Class92.field1255 = new Class94[n14];
        for (int n15 = 0; n15 < n14; ++n15) {
            Class92.field1255[n15] = new Class94();
        }
        final int n16 = method2108(6) + 1;
        Class92.field1273 = new Class101[n16];
        for (int n17 = 0; n17 < n16; ++n17) {
            Class92.field1273[n17] = new Class101();
        }
        final int n18 = method2108(6) + 1;
        Class92.field1257 = new Class106[n18];
        for (int n19 = 0; n19 < n18; ++n19) {
            Class92.field1257[n19] = new Class106();
        }
        final int n20 = method2108(6) + 1;
        Class92.field1258 = new boolean[n20];
        Class92.field1243 = new int[n20];
        for (int n21 = 0; n21 < n20; ++n21) {
            Class92.field1258[n21] = (method2093() != 0);
            method2108(16);
            method2108(16);
            Class92.field1243[n21] = method2108(8);
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(Lir;)Z")
    static boolean method2087(final Class247 class247) {
        if (!Class92.field1260) {
            final byte[] method4625 = class247.method4625(0, 0);
            if (method4625 == null) {
                return false;
            }
            method2082(method4625);
            Class92.field1260 = true;
        }
        return true;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(Lir;II)Lcs;")
    static Class92 method2088(final Class247 class247, final int n, final int n2) {
        if (!method2087(class247)) {
            class247.method4696(n, n2);
            return null;
        }
        final byte[] method4625 = class247.method4625(n, n2);
        if (method4625 == null) {
            return null;
        }
        return new Class92(method4625);
    }
}
