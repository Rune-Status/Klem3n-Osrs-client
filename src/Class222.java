import java.io.IOException;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("hz")
public class Class222 extends Class105
{
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lhg;")
    Class218 field2545;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lgn;")
    Class205 field2543;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lca;")
    Class88 field2544;
    
    Class222(final Class218 field2545) {
        this.field2543 = new Class205();
        this.field2544 = new Class88();
        this.field2545 = field2545;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lhn;[IIIIB)V", garbageValue = "-60")
    void method4387(final Class219 class219, final int[] array, int n, int n2, final int n3) {
        if ((this.field2545.field2478[class219.field2500] & 0x4) != 0x0 && class219.field2508 < 0) {
            final int n4 = this.field2545.field2483[class219.field2500] / Class95.field1300;
            while (true) {
                final int n5 = (n4 + 1048575 - class219.field2514) / n4;
                if (n5 > n2) {
                    break;
                }
                class219.field2512.vmethod4385(array, n, n5);
                n += n5;
                n2 -= n5;
                class219.field2514 += n4 * n5 - 1048576;
                int n6 = Class95.field1300 / 100;
                final int n7 = 262144 / n4;
                if (n7 < n6) {
                    n6 = n7;
                }
                final Class103 field2512 = class219.field2512;
                if (this.field2545.field2471[class219.field2500] == 0) {
                    class219.field2512 = Class103.method2256(class219.field2496, field2512.method2351(), field2512.method2262(), field2512.method2263());
                }
                else {
                    class219.field2512 = Class103.method2256(class219.field2496, field2512.method2351(), 0, field2512.method2263());
                    this.field2545.method4208(class219, class219.field2517.field2534[class219.field2502] < 0);
                    class219.field2512.method2408(n6, field2512.method2262());
                }
                if (class219.field2517.field2534[class219.field2502] < 0) {
                    class219.field2512.method2258(-1);
                }
                field2512.method2269(n6);
                field2512.vmethod4385(array, n, n3 - n);
                if (!field2512.method2273()) {
                    continue;
                }
                this.field2544.method2032(field2512);
            }
            class219.field2514 += n2 * n4;
        }
        class219.field2512.vmethod4385(array, n, n2);
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(Lhn;II)V", garbageValue = "-1604012040")
    void method4388(final Class219 class219, int n) {
        if ((this.field2545.field2478[class219.field2500] & 0x4) != 0x0 && class219.field2508 < 0) {
            final int n2 = this.field2545.field2483[class219.field2500] / Class95.field1300;
            final int n3 = (n2 + 1048575 - class219.field2514) / n2;
            class219.field2514 = (n2 * n + class219.field2514 & 0xFFFFF);
            if (n3 <= n) {
                if (this.field2545.field2471[class219.field2500] == 0) {
                    class219.field2512 = Class103.method2256(class219.field2496, class219.field2512.method2351(), class219.field2512.method2262(), class219.field2512.method2263());
                }
                else {
                    class219.field2512 = Class103.method2256(class219.field2496, class219.field2512.method2351(), 0, class219.field2512.method2263());
                    this.field2545.method4208(class219, class219.field2517.field2534[class219.field2502] < 0);
                }
                if (class219.field2517.field2534[class219.field2502] < 0) {
                    class219.field2512.method2258(-1);
                }
                n = class219.field2514 / n2;
            }
        }
        class219.field2512.vmethod4386(n);
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4382() {
        final Class219 class219 = (Class219)this.field2543.method4098();
        if (class219 == null) {
            return null;
        }
        if (class219.field2512 != null) {
            return class219.field2512;
        }
        return this.vmethod4389();
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "()Ldo;")
    @Override
    protected Class105 vmethod4389() {
        while (true) {
            final Class219 class219 = (Class219)this.field2543.method4079();
            if (class219 == null) {
                return null;
            }
            if (class219.field2512 != null) {
                return class219.field2512;
            }
        }
    }
    
    @ObfuscatedName("x")
    @Override
    protected int vmethod4395() {
        return 0;
    }
    
    @ObfuscatedName("e")
    @Override
    protected void vmethod4385(final int[] array, final int n, final int n2) {
        this.field2544.vmethod4385(array, n, n2);
    Label_0039:
        for (Class219 class219 = (Class219)this.field2543.method4098(); class219 != null; class219 = (Class219)this.field2543.method4079()) {
            if (!this.field2545.method4230(class219)) {
                int n3 = n;
                int i = n2;
                while (i > class219.field2513) {
                    this.method4387(class219, array, n3, class219.field2513, n3 + i);
                    n3 += class219.field2513;
                    i -= class219.field2513;
                    if (this.field2545.method4231(class219, array, n3, i)) {
                        continue Label_0039;
                    }
                }
                this.method4387(class219, array, n3, i, n3 + i);
                final Class219 class220 = class219;
                class220.field2513 -= i;
            }
        }
    }
    
    @ObfuscatedName("b")
    @Override
    protected void vmethod4386(final int n) {
        this.field2544.vmethod4386(n);
    Label_0034:
        for (Class219 class219 = (Class219)this.field2543.method4098(); class219 != null; class219 = (Class219)this.field2543.method4079()) {
            if (!this.field2545.method4230(class219)) {
                int i = n;
                while (i > class219.field2513) {
                    this.method4388(class219, class219.field2513);
                    i -= class219.field2513;
                    if (this.field2545.method4231(class219, null, 0, i)) {
                        continue Label_0034;
                    }
                }
                this.method4388(class219, i);
                final Class219 class220 = class219;
                class220.field2513 -= i;
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "1679554365")
    public static void method4410(final boolean b) {
        if (Class250.field3200 == null) {
            return;
        }
        try {
            final Class182 class182 = new Class182(4);
            class182.method3532(b ? 2 : 3);
            class182.method3534(0);
            Class250.field3200.vmethod3347(class182.payload, 0, 4);
        }
        catch (IOException ex) {
            try {
                Class250.field3200.vmethod3346();
            }
            catch (Exception ex2) {}
            ++Class250.field3215;
            Class250.field3200 = null;
        }
    }
}
