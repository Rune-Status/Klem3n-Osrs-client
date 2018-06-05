import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("da")
public class Class117
{
    @ObfuscatedName("z")
    static int[] field1551;
    @ObfuscatedName("w")
    static int[] field1543;
    @ObfuscatedName("s")
    static int[] field1544;
    @ObfuscatedName("l")
    static int[] field1545;
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "Ldt;")
    Class124 field1546;
    @ObfuscatedName("q")
    int field1547;
    @ObfuscatedName("k")
    int[] field1548;
    @ObfuscatedName("i")
    int[] field1549;
    @ObfuscatedName("x")
    int[] field1542;
    @ObfuscatedName("e")
    int[] field1550;
    @ObfuscatedName("p")
    boolean field1552;
    
    static {
        Class117.field1551 = new int[500];
        Class117.field1543 = new int[500];
        Class117.field1544 = new int[500];
        Class117.field1545 = new int[500];
    }
    
    Class117(final byte[] array, final Class124 field1546) {
        this.field1546 = null;
        this.field1547 = -1;
        this.field1552 = false;
        this.field1546 = field1546;
        final Class182 class182 = new Class182(array);
        final Class182 class183 = new Class182(array);
        class182.field2339 = 2;
        final int method3544 = class182.method3544();
        int n = -1;
        int field1547 = 0;
        class183.field2339 = method3544 + class182.field2339;
        for (int i = 0; i < method3544; ++i) {
            final int method3545 = class182.method3544();
            if (method3545 > 0) {
                if (this.field1546.field1706[i] != 0) {
                    for (int j = i - 1; j > n; --j) {
                        if (this.field1546.field1706[j] == 0) {
                            Class117.field1551[field1547] = j;
                            Class117.field1543[field1547] = 0;
                            Class117.field1544[field1547] = 0;
                            Class117.field1545[field1547] = 0;
                            ++field1547;
                            break;
                        }
                    }
                }
                Class117.field1551[field1547] = i;
                int n2 = 0;
                if (this.field1546.field1706[i] == 3) {
                    n2 = 128;
                }
                if ((method3545 & 0x1) != 0x0) {
                    Class117.field1543[field1547] = class183.method3561();
                }
                else {
                    Class117.field1543[field1547] = n2;
                }
                if ((method3545 & 0x2) != 0x0) {
                    Class117.field1544[field1547] = class183.method3561();
                }
                else {
                    Class117.field1544[field1547] = n2;
                }
                if ((method3545 & 0x4) != 0x0) {
                    Class117.field1545[field1547] = class183.method3561();
                }
                else {
                    Class117.field1545[field1547] = n2;
                }
                n = i;
                ++field1547;
                if (this.field1546.field1706[i] == 5) {
                    this.field1552 = true;
                }
            }
        }
        if (array.length != class183.field2339) {
            throw new RuntimeException();
        }
        this.field1547 = field1547;
        this.field1548 = new int[field1547];
        this.field1549 = new int[field1547];
        this.field1542 = new int[field1547];
        this.field1550 = new int[field1547];
        for (int k = 0; k < field1547; ++k) {
            this.field1548[k] = Class117.field1551[k];
            this.field1549[k] = Class117.field1543[k];
            this.field1542[k] = Class117.field1544[k];
            this.field1550[k] = Class117.field1545[k];
        }
    }
}
