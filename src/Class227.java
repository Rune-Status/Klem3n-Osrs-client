import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hd")
public class Class227
{
    @ObfuscatedName("k")
    public static short[] field2575;
    @ObfuscatedName("i")
    public static short[][] field2572;
    @ObfuscatedName("x")
    public static short[] field2577;
    @ObfuscatedName("e")
    public static short[][] field2578;
    @ObfuscatedName("p")
    static final int[] field2579;
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "Lgj;")
    static Class200 field2580;
    @ObfuscatedName("z")
    int[] field2570;
    @ObfuscatedName("w")
    int[] field2576;
    @ObfuscatedName("s")
    public boolean field2571;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = 1734814155)
    public int field2569;
    @ObfuscatedName("u")
    @ObfuscatedGetter(longValue = -1819394091005678963L)
    long field2573;
    @ObfuscatedName("q")
    @ObfuscatedGetter(longValue = 7379530444611537843L)
    long field2574;
    
    static {
        field2579 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
        Class227.field2580 = new Class200(260);
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([I[IZII)V", garbageValue = "1119812304")
    public void method4462(int[] field2570, final int[] field2571, final boolean field2572, final int field2573) {
        if (field2570 == null) {
            field2570 = new int[12];
            for (int i = 0; i < 7; ++i) {
                for (int j = 0; j < Class260.field3294; ++j) {
                    final Class260 method23 = Class2.method23(j);
                    if (method23 != null && !method23.field3295 && (field2572 ? 7 : 0) + i == method23.field3293) {
                        field2570[Class227.field2579[i]] = j + 256;
                        break;
                    }
                }
            }
        }
        this.field2570 = field2570;
        this.field2576 = field2571;
        this.field2571 = field2572;
        this.field2569 = field2573;
        this.method4467();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IZI)V", garbageValue = "-1617344099")
    public void method4478(final int n, final boolean b) {
        if (n == 1 && this.field2571) {
            return;
        }
        int n2 = this.field2570[Class227.field2579[n]];
        if (n2 == 0) {
            return;
        }
        n2 -= 256;
        Class260 method23;
        do {
            if (!b) {
                if (--n2 < 0) {
                    n2 = Class260.field3294 - 1;
                }
            }
            else if (++n2 >= Class260.field3294) {
                n2 = 0;
            }
            method23 = Class2.method23(n2);
        } while (method23 == null || method23.field3295 || n + (this.field2571 ? 7 : 0) != method23.field3293);
        this.field2570[Class227.field2579[n]] = n2 + 256;
        this.method4467();
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IZB)V", garbageValue = "43")
    public void method4493(final int n, final boolean b) {
        int n2 = this.field2576[n];
        if (!b) {
            int n3;
            do {
                if (--n2 < 0) {
                    n2 = Class227.field2572[n].length - 1;
                }
                if (n == 4 && n2 >= 8) {
                    n3 = 0;
                }
                else {
                    n3 = 1;
                }
            } while (n3 == 0);
        }
        else {
            int n4;
            do {
                if (++n2 >= Class227.field2572[n].length) {
                    n2 = 0;
                }
                if (n == 4 && n2 >= 8) {
                    n4 = 0;
                }
                else {
                    n4 = 1;
                }
            } while (n4 == 0);
        }
        this.field2576[n] = n2;
        this.method4467();
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "-75355904")
    public void method4465(final boolean b) {
        if (this.field2571 == b) {
            return;
        }
        this.method4462(null, this.field2576, b, -1);
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(Lgk;B)V", garbageValue = "-121")
    public void method4466(final Class182 class182) {
        class182.method3532(this.field2571 ? 1 : 0);
        for (int i = 0; i < 7; ++i) {
            final int n = this.field2570[Class227.field2579[i]];
            if (n == 0) {
                class182.method3532(-1);
            }
            else {
                class182.method3532(n - 256);
            }
        }
        for (int j = 0; j < 5; ++j) {
            class182.method3532(this.field2576[j]);
        }
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "1868947460")
    void method4467() {
        final long field2573 = this.field2573;
        final int n = this.field2570[5];
        final int n2 = this.field2570[9];
        this.field2570[5] = n2;
        this.field2570[9] = n;
        this.field2573 = 0L;
        for (int i = 0; i < 12; ++i) {
            this.field2573 <<= 4;
            if (this.field2570[i] >= 256) {
                this.field2573 += this.field2570[i] - 256;
            }
        }
        if (this.field2570[0] >= 256) {
            this.field2573 += this.field2570[0] - 256 >> 4;
        }
        if (this.field2570[1] >= 256) {
            this.field2573 += this.field2570[1] - 256 >> 8;
        }
        for (int j = 0; j < 5; ++j) {
            this.field2573 <<= 3;
            this.field2573 += this.field2576[j];
        }
        this.field2573 <<= 1;
        this.field2573 += (this.field2571 ? 1 : 0);
        this.field2570[5] = n;
        this.field2570[9] = n2;
        if (field2573 != 0L && this.field2573 != field2573) {
            Class227.field2580.method3982(field2573);
        }
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(Ljn;ILjn;II)Ldc;", garbageValue = "960437328")
    public Class119 method4468(final Class273 class273, final int n, final Class273 class274, final int n2) {
        if (this.field2569 != -1) {
            return Class270.method5157(this.field2569).method5162(class273, n, class274, n2);
        }
        long field2573 = this.field2573;
        int[] field2574 = this.field2570;
        if (class273 != null && (class273.field3548 >= 0 || class273.field3549 >= 0)) {
            field2574 = new int[12];
            for (int i = 0; i < 12; ++i) {
                field2574[i] = this.field2570[i];
            }
            if (class273.field3548 >= 0) {
                field2573 += class273.field3548 - this.field2570[5] << 40;
                field2574[5] = class273.field3548;
            }
            if (class273.field3549 >= 0) {
                field2573 += class273.field3549 - this.field2570[3] << 48;
                field2574[3] = class273.field3549;
            }
        }
        Class119 method2589 = (Class119)Class227.field2580.method3989(field2573);
        if (method2589 == null) {
            int n3 = 0;
            for (int j = 0; j < 12; ++j) {
                final int n4 = field2574[j];
                if (n4 >= 256 && n4 < 512 && !Class2.method23(n4 - 256).method4896()) {
                    n3 = 1;
                }
                if (n4 >= 512 && !Class111.method2563(n4 - 512).method5095(this.field2571)) {
                    n3 = 1;
                }
            }
            if (n3 != 0) {
                if (this.field2574 != -1L) {
                    method2589 = (Class119)Class227.field2580.method3989(this.field2574);
                }
                if (method2589 == null) {
                    return null;
                }
            }
            if (method2589 == null) {
                final Class113[] array = new Class113[12];
                int n5 = 0;
                for (int k = 0; k < 12; ++k) {
                    final int n6 = field2574[k];
                    if (n6 >= 256 && n6 < 512) {
                        final Class113 method2590 = Class2.method23(n6 - 256).method4897();
                        if (method2590 != null) {
                            array[n5++] = method2590;
                        }
                    }
                    if (n6 >= 512) {
                        final Class113 method2591 = Class111.method2563(n6 - 512).method5128(this.field2571);
                        if (method2591 != null) {
                            array[n5++] = method2591;
                        }
                    }
                }
                final Class113 class275 = new Class113(array, n5);
                for (int l = 0; l < 5; ++l) {
                    if (this.field2576[l] < Class227.field2572[l].length) {
                        class275.method2581(Class227.field2575[l], Class227.field2572[l][this.field2576[l]]);
                    }
                    if (this.field2576[l] < Class227.field2578[l].length) {
                        class275.method2581(Class227.field2577[l], Class227.field2578[l][this.field2576[l]]);
                    }
                }
                method2589 = class275.method2589(64, 850, -30, -50, -30);
                Class227.field2580.method3983(method2589, field2573);
                this.field2574 = field2573;
            }
        }
        if (class273 == null && class274 == null) {
            return method2589;
        }
        Class119 class276;
        if (class273 != null && class274 != null) {
            class276 = class273.method5221(method2589, n, class274, n2);
        }
        else if (class273 != null) {
            class276 = class273.method5215(method2589, n);
        }
        else {
            class276 = class274.method5215(method2589, n2);
        }
        return class276;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(I)Ldb;", garbageValue = "-299870207")
    Class113 method4469() {
        if (this.field2569 != -1) {
            return Class270.method5157(this.field2569).method5158();
        }
        int n = 0;
        for (int i = 0; i < 12; ++i) {
            final int n2 = this.field2570[i];
            if (n2 >= 256 && n2 < 512 && !Class2.method23(n2 - 256).method4905()) {
                n = 1;
            }
            if (n2 >= 512 && !Class111.method2563(n2 - 512).method5097(this.field2571)) {
                n = 1;
            }
        }
        if (n != 0) {
            return null;
        }
        final Class113[] array = new Class113[12];
        int n3 = 0;
        for (int j = 0; j < 12; ++j) {
            final int n4 = this.field2570[j];
            if (n4 >= 256 && n4 < 512) {
                final Class113 method4899 = Class2.method23(n4 - 256).method4899();
                if (method4899 != null) {
                    array[n3++] = method4899;
                }
            }
            if (n4 >= 512) {
                final Class113 method4900 = Class111.method2563(n4 - 512).method5098(this.field2571);
                if (method4900 != null) {
                    array[n3++] = method4900;
                }
            }
        }
        final Class113 class113 = new Class113(array, n3);
        for (int k = 0; k < 5; ++k) {
            if (this.field2576[k] < Class227.field2572[k].length) {
                class113.method2581(Class227.field2575[k], Class227.field2572[k][this.field2576[k]]);
            }
            if (this.field2576[k] < Class227.field2578[k].length) {
                class113.method2581(Class227.field2577[k], Class227.field2578[k][this.field2576[k]]);
            }
        }
        return class113;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-709591289")
    public int method4483() {
        if (this.field2569 == -1) {
            return (this.field2570[0] << 15) + this.field2570[1] + (this.field2570[11] << 5) + (this.field2570[8] << 10) + (this.field2576[0] << 25) + (this.field2576[4] << 20);
        }
        return 305419896 + Class270.method5157(this.field2569).field3510;
    }
}
