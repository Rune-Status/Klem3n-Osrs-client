import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("de")
public class Class111 implements Class131
{
    @ObfuscatedName("fo")
    @ObfuscatedSignature(signature = "[Lll;")
    static Class318[] field1446;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "[Ldu;")
    Class116[] field1441;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lgn;")
    Class205 field1444;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = 114884877)
    int field1440;
    @ObfuscatedName("l")
    @ObfuscatedGetter(intValue = -1966961957)
    int field1439;
    @ObfuscatedName("u")
    double field1442;
    @ObfuscatedName("q")
    @ObfuscatedGetter(intValue = -1617478817)
    int field1443;
    @ObfuscatedName("k")
    @ObfuscatedSignature(signature = "Lir;")
    Class247 field1438;
    
    public Class111(final Class247 class247, final Class247 field1438, final int field1439, final double field1440, final int field1441) {
        this.field1444 = new Class205();
        this.field1439 = 0;
        this.field1442 = 1.0;
        this.field1443 = 128;
        this.field1438 = field1438;
        this.field1440 = field1439;
        this.field1439 = this.field1440;
        this.field1442 = field1440;
        this.field1443 = field1441;
        final int[] method4668 = class247.method4668(0);
        final int length = method4668.length;
        this.field1441 = new Class116[class247.method4636(0)];
        for (int i = 0; i < length; ++i) {
            this.field1441[method4668[i]] = new Class116(new Class182(class247.method4625(0, method4668[i])));
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(I)I", garbageValue = "-1808085828")
    public int method2530() {
        int n = 0;
        int n2 = 0;
        final Class116[] field1441 = this.field1441;
        for (int i = 0; i < field1441.length; ++i) {
            final Class116 class116 = field1441[i];
            if (class116 != null && class116.field1533 != null) {
                n += class116.field1533.length;
                final int[] field1442 = class116.field1533;
                for (int j = 0; j < field1442.length; ++j) {
                    if (this.field1438.method4627(field1442[j])) {
                        ++n2;
                    }
                }
            }
        }
        if (n == 0) {
            return 0;
        }
        return n2 * 100 / n;
    }
    
    @ObfuscatedName("w")
    public void method2544(final double field1442) {
        this.field1442 = field1442;
        this.method2561();
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(II)[I", garbageValue = "-1935357081")
    @Override
    public int[] vmethod3079(final int n) {
        final Class116 class116 = this.field1441[n];
        if (class116 != null) {
            if (class116.field1539 != null) {
                this.field1444.method4074(class116);
                class116.field1540 = true;
                return class116.field1539;
            }
            if (class116.method2661(this.field1442, this.field1443, this.field1438)) {
                if (this.field1439 == 0) {
                    ((Class116)this.field1444.method4080()).method2656();
                }
                else {
                    --this.field1439;
                }
                this.field1444.method4074(class116);
                class116.field1540 = true;
                return class116.field1539;
            }
        }
        return null;
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(II)I", garbageValue = "2017103535")
    @Override
    public int vmethod3092(final int n) {
        if (this.field1441[n] != null) {
            return this.field1441[n].field1527;
        }
        return 0;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IB)Z", garbageValue = "70")
    @Override
    public boolean vmethod3081(final int n) {
        return this.field1441[n].field1530;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "443897939")
    @Override
    public boolean vmethod3082(final int n) {
        return this.field1443 == 64;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(I)V", garbageValue = "566742688")
    public void method2561() {
        for (int i = 0; i < this.field1441.length; ++i) {
            if (this.field1441[i] != null) {
                this.field1441[i].method2656();
            }
        }
        this.field1444 = new Class205();
        this.field1439 = this.field1440;
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "0")
    public void method2537(final int n) {
        for (int i = 0; i < this.field1441.length; ++i) {
            final Class116 class116 = this.field1441[i];
            if (class116 != null && class116.field1537 != 0 && class116.field1540) {
                class116.method2657(n);
                class116.field1540 = false;
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IB)Ljt;", garbageValue = "56")
    public static Class269 method2563(final int field3431) {
        final Class269 class269 = (Class269)Class269.field3461.method3989(field3431);
        if (class269 != null) {
            return class269;
        }
        final byte[] method4625 = Class269.field3424.method4625(10, field3431);
        final Class269 class270 = new Class269();
        class270.field3431 = field3431;
        if (method4625 != null) {
            class270.method5090(new Class182(method4625));
        }
        class270.method5087();
        if (class270.field3465 != -1) {
            class270.method5126(method2563(class270.field3465), method2563(class270.field3464));
        }
        if (class270.field3475 != -1) {
            class270.method5110(method2563(class270.field3475), method2563(class270.field3473));
        }
        if (class270.field3477 != -1) {
            class270.method5091(method2563(class270.field3477), method2563(class270.field3476));
        }
        if (!Class269.field3426 && class270.field3446) {
            class270.field3433 = "Members object";
            class270.field3436 = false;
            class270.field3447 = null;
            class270.field3425 = null;
            class270.field3449 = -1;
            class270.field3462 = 0;
            if (class270.field3472 != null) {
                int n = 0;
                for (Class204 class271 = class270.field3472.method3955(); class271 != null; class271 = class270.field3472.method3947()) {
                    if (Class241.method4603((int)class271.field2421).field3332) {
                        class271.method4064();
                    }
                    else {
                        n = 1;
                    }
                }
                if (n == 0) {
                    class270.field3472 = null;
                }
            }
        }
        Class269.field3461.method3983(class270, field3431);
        return class270;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "-33")
    static void method2562() {
        Class81.field1167 = 0;
        for (int i = 0; i < 2048; ++i) {
            Class81.field1157[i] = null;
            Class81.field1153[i] = 1;
        }
    }
    
    @ObfuscatedName("af")
    @ObfuscatedSignature(signature = "(ILce;ZB)I", garbageValue = "41")
    static int method2531(final int n, final Class84 class84, final boolean b) {
        if (n == 5630) {
            Client.field627 = 250;
            return 1;
        }
        return 2;
    }
}
