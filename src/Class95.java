import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cx")
public class Class95
{
    @ObfuscatedName("u")
    @ObfuscatedGetter(intValue = -2011144979)
    public static int field1300;
    @ObfuscatedName("q")
    protected static boolean field1295;
    @ObfuscatedName("n")
    @ObfuscatedSignature(signature = "Lcr;")
    public static Class89 field1297;
    @ObfuscatedName("f")
    protected int[] field1299;
    @ObfuscatedName("g")
    @ObfuscatedSignature(signature = "Ldo;")
    Class105 field1311;
    @ObfuscatedName("m")
    @ObfuscatedGetter(intValue = 175968633)
    int field1298;
    @ObfuscatedName("r")
    @ObfuscatedGetter(longValue = 3596213632832081127L)
    long field1305;
    @ObfuscatedName("t")
    @ObfuscatedGetter(intValue = 1071187089)
    int field1302;
    @ObfuscatedName("o")
    @ObfuscatedGetter(intValue = 515202779)
    int field1303;
    @ObfuscatedName("y")
    @ObfuscatedGetter(intValue = 2049583437)
    int field1306;
    @ObfuscatedName("a")
    @ObfuscatedGetter(longValue = -4154193984933604857L)
    long field1294;
    @ObfuscatedName("j")
    @ObfuscatedGetter(intValue = 1453548117)
    int field1304;
    @ObfuscatedName("d")
    @ObfuscatedGetter(intValue = 1903884361)
    int field1307;
    @ObfuscatedName("h")
    @ObfuscatedGetter(intValue = -1788167479)
    int field1308;
    @ObfuscatedName("c")
    @ObfuscatedGetter(longValue = 4750042735159967147L)
    long field1301;
    @ObfuscatedName("v")
    boolean field1310;
    @ObfuscatedName("as")
    @ObfuscatedGetter(intValue = 647567121)
    int field1313;
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "[Ldo;")
    Class105[] field1312;
    @ObfuscatedName("ao")
    @ObfuscatedSignature(signature = "[Ldo;")
    Class105[] field1309;
    
    protected Class95() {
        this.field1298 = 32;
        this.field1305 = Class182.method3547();
        this.field1294 = 0L;
        this.field1304 = 0;
        this.field1307 = 0;
        this.field1308 = 0;
        this.field1301 = 0L;
        this.field1310 = true;
        this.field1313 = 0;
        this.field1312 = new Class105[8];
        this.field1309 = new Class105[8];
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2015063069")
    protected void vmethod2176() throws Exception {
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IS)V", garbageValue = "255")
    protected void vmethod2163(final int n) throws Exception {
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(B)I", garbageValue = "83")
    protected int vmethod2153() throws Exception {
        return this.field1302;
    }
    
    @ObfuscatedName("l")
    protected void vmethod2154() throws Exception {
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-1323448603")
    protected void vmethod2155() {
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-2047206903")
    protected void vmethod2156() throws Exception {
    }
    
    @ObfuscatedName("ah")
    @ObfuscatedSignature(signature = "(Ldo;I)V", garbageValue = "-1537187837")
    public final synchronized void method2143(final Class105 field1311) {
        this.field1311 = field1311;
    }
    
    @ObfuscatedName("ab")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "947574541")
    public final synchronized void method2144() {
        if (this.field1299 == null) {
            return;
        }
        long field1305 = Class182.method3547();
        try {
            if (this.field1294 != 0L) {
                if (field1305 < this.field1294) {
                    return;
                }
                this.vmethod2163(this.field1302);
                this.field1294 = 0L;
                this.field1310 = true;
            }
            int i = this.vmethod2153();
            if (this.field1308 - i > this.field1304) {
                this.field1304 = this.field1308 - i;
            }
            int n = this.field1303 + this.field1306;
            if (n + 256 > 16384) {
                n = 16128;
            }
            if (n + 256 > this.field1302) {
                this.field1302 += 1024;
                if (this.field1302 > 16384) {
                    this.field1302 = 16384;
                }
                this.vmethod2155();
                this.vmethod2163(this.field1302);
                i = 0;
                this.field1310 = true;
                if (n + 256 > this.field1302) {
                    n = this.field1302 - 256;
                    this.field1306 = n - this.field1303;
                }
            }
            while (i < n) {
                this.method2149(this.field1299, 256);
                this.vmethod2154();
                i += 256;
            }
            if (field1305 > this.field1301) {
                if (!this.field1310) {
                    if (this.field1304 == 0 && this.field1307 == 0) {
                        this.vmethod2155();
                        this.field1294 = field1305 + 2000L;
                        return;
                    }
                    this.field1306 = Math.min(this.field1307, this.field1304);
                    this.field1307 = this.field1304;
                }
                else {
                    this.field1310 = false;
                }
                this.field1304 = 0;
                this.field1301 = field1305 + 2000L;
            }
            this.field1308 = i;
        }
        catch (Exception ex) {
            this.vmethod2155();
            this.field1294 = 2000L + field1305;
        }
        try {
            if (field1305 > 500000L + this.field1305) {
                field1305 = this.field1305;
            }
            while (field1305 > 5000L + this.field1305) {
                this.method2188(256);
                this.field1305 += 256000 / Class95.field1300;
            }
        }
        catch (Exception ex2) {
            this.field1305 = field1305;
        }
    }
    
    @ObfuscatedName("aw")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1969429173")
    public final void method2145() {
        this.field1310 = true;
    }
    
    @ObfuscatedName("ak")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-58675993")
    public final synchronized void method2146() {
        this.field1310 = true;
        try {
            this.vmethod2156();
        }
        catch (Exception ex) {
            this.vmethod2155();
            this.field1294 = Class182.method3547() + 2000L;
        }
    }
    
    @ObfuscatedName("as")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "-917768670")
    public final synchronized void method2147() {
        if (Class69.field1010 != null) {
            boolean b = true;
            for (int i = 0; i < 2; ++i) {
                if (this == Class69.field1010.field1327[i]) {
                    Class69.field1010.field1327[i] = null;
                }
                if (Class69.field1010.field1327[i] != null) {
                    b = false;
                }
            }
            if (b) {
                Class135.field1855.shutdownNow();
                Class135.field1855 = null;
                Class69.field1010 = null;
            }
        }
        this.vmethod2155();
        this.field1299 = null;
    }
    
    @ObfuscatedName("an")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "52")
    final void method2188(final int n) {
        this.field1313 -= n;
        if (this.field1313 < 0) {
            this.field1313 = 0;
        }
        if (this.field1311 != null) {
            this.field1311.vmethod4386(n);
        }
    }
    
    @ObfuscatedName("ao")
    final void method2149(final int[] array, final int n) {
        int n2 = n;
        if (Class95.field1295) {
            n2 <<= 1;
        }
        Class193.method3895(array, 0, n2);
        this.field1313 -= n;
        if (this.field1311 != null && this.field1313 <= 0) {
            this.field1313 += Class95.field1300 >> 4;
            Class84.method1956(this.field1311);
            this.method2184(this.field1311, this.field1311.vmethod2435());
            int n3 = 0;
            int i = 255;
            int n4 = 7;
        Label_0135:
            while (i != 0) {
                int n5;
                int n6;
                if (n4 < 0) {
                    n5 = (n4 & 0x3);
                    n6 = -(n4 >> 2);
                }
                else {
                    n5 = n4;
                    n6 = 0;
                }
                for (int j = i >>> n5 & 0x11111111; j != 0; j >>>= 4) {
                    if ((j & 0x1) != 0x0) {
                        i &= ~(1 << n5);
                        Class105 class105 = null;
                        Class105 field1382 = this.field1312[n5];
                        while (field1382 != null) {
                            final Class108 field1383 = field1382.field1383;
                            if (field1383 != null && field1383.field1416 > n6) {
                                i |= 1 << n5;
                                class105 = field1382;
                                field1382 = field1382.field1382;
                            }
                            else {
                                field1382.field1385 = true;
                                final int vmethod4395 = field1382.vmethod4395();
                                n3 += vmethod4395;
                                if (field1383 != null) {
                                    final Class108 class106 = field1383;
                                    class106.field1416 += vmethod4395;
                                }
                                if (n3 >= this.field1298) {
                                    break Label_0135;
                                }
                                Class105 class107 = field1382.vmethod4382();
                                if (class107 != null) {
                                    final int field1384 = field1382.field1384;
                                    while (class107 != null) {
                                        this.method2184(class107, field1384 * class107.vmethod2435() >> 8);
                                        class107 = field1382.vmethod4389();
                                    }
                                }
                                final Class105 field1385 = field1382.field1382;
                                field1382.field1382 = null;
                                if (class105 == null) {
                                    this.field1312[n5] = field1385;
                                }
                                else {
                                    class105.field1382 = field1385;
                                }
                                if (field1385 == null) {
                                    this.field1309[n5] = class105;
                                }
                                field1382 = field1385;
                            }
                        }
                    }
                    n5 += 4;
                    ++n6;
                }
                --n4;
            }
            for (int k = 0; k < 8; ++k) {
                Class105 class108 = this.field1312[k];
                this.field1312[k] = (this.field1309[k] = null);
                while (class108 != null) {
                    final Class105 field1386 = class108.field1382;
                    class108.field1382 = null;
                    class108 = field1386;
                }
            }
        }
        if (this.field1313 < 0) {
            this.field1313 = 0;
        }
        if (this.field1311 != null) {
            this.field1311.vmethod4385(array, 0, n);
        }
        this.field1305 = Class182.method3547();
    }
    
    @ObfuscatedName("ai")
    @ObfuscatedSignature(signature = "(Ldo;II)V", garbageValue = "465802976")
    final void method2184(final Class105 field1382, final int field1383) {
        final int n = field1383 >> 5;
        final Class105 class105 = this.field1309[n];
        if (class105 == null) {
            this.field1312[n] = field1382;
        }
        else {
            class105.field1382 = field1382;
        }
        this.field1309[n] = field1382;
        field1382.field1384 = field1383;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Ljava/lang/Throwable;Ljava/lang/String;)Len;")
    public static Class152 method2195(final Throwable t, final String s) {
        Class152 class152;
        if (t instanceof Class152) {
            class152 = (Class152)t;
            final StringBuilder sb = new StringBuilder();
            final Class152 class153 = class152;
            class153.field1941 = sb.append(class153.field1941).append(' ').append(s).toString();
        }
        else {
            class152 = new Class152(t, s);
        }
        return class152;
    }
}
