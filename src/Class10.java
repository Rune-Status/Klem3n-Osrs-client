import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("p")
public class Class10 extends Class16
{
    @ObfuscatedName("qn")
    @ObfuscatedSignature(signature = "Lbx;")
    static Class66 field61;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lgk;Lgk;I)V", garbageValue = "-1858538420")
    void method95(final Class182 class182, final Class182 class183) {
        if (class183.method3544() != Class25.field212.field211) {
            throw new IllegalStateException("");
        }
        super.field120 = class183.method3544();
        super.field121 = class183.method3544();
        super.field127 = class183.method3550();
        super.field117 = class183.method3550();
        super.field118 = class183.method3550();
        super.field119 = class183.method3550();
        super.field121 = Math.min(super.field121, 4);
        super.field125 = new short[1][64][64];
        super.field123 = new short[super.field121][64][64];
        super.field124 = new byte[super.field121][64][64];
        super.field116 = new byte[super.field121][64][64];
        super.field126 = new Class19[super.field121][64][64][];
        if (class182.method3544() != Class24.field208.field205) {
            throw new IllegalStateException("");
        }
        final int method3544 = class182.method3544();
        final int method3545 = class182.method3544();
        if (method3544 != super.field118 || method3545 != super.field119) {
            throw new IllegalStateException("");
        }
        for (int i = 0; i < 64; ++i) {
            for (int j = 0; j < 64; ++j) {
                this.method150(i, j, class182);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class10)) {
            return false;
        }
        final Class10 class10 = (Class10)o;
        return super.field118 == class10.field118 && class10.field119 == super.field119;
    }
    
    @Override
    public int hashCode() {
        return super.field118 | super.field119 << 8;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "-1588398214")
    static void method96(final int n, final int n2, final int n3, final int n4) {
        Class53 class53 = (Class53)Class53.field474.method4020(n);
        if (class53 == null) {
            class53 = new Class53();
            Class53.field474.method4016(class53, n);
        }
        if (class53.field477.length <= n2) {
            final int[] field477 = new int[n2 + 1];
            final int[] field478 = new int[n2 + 1];
            for (int i = 0; i < class53.field477.length; ++i) {
                field477[i] = class53.field477[i];
                field478[i] = class53.field473[i];
            }
            for (int j = class53.field477.length; j < n2; ++j) {
                field477[j] = -1;
                field478[j] = 0;
            }
            class53.field477 = field477;
            class53.field473 = field478;
        }
        class53.field477[n2] = n3;
        class53.field473[n2] = n4;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "([BI)Lce;", garbageValue = "-2110987509")
    static Class84 method97(final byte[] array) {
        final Class84 class84 = new Class84();
        final Class182 class85 = new Class182(array);
        class85.field2339 = class85.payload.length - 2;
        final int field2339 = class85.payload.length - 2 - class85.method3550() - 12;
        class85.field2339 = field2339;
        final int method3671 = class85.method3671();
        class84.field1192 = class85.method3550();
        class84.field1193 = class85.method3550();
        class84.field1188 = class85.method3550();
        class84.field1195 = class85.method3550();
        final int method3672 = class85.method3544();
        if (method3672 > 0) {
            class84.field1194 = class84.method1944(method3672);
            for (int i = 0; i < method3672; ++i) {
                int method3673 = class85.method3550();
                final Class197 class86 = new Class197((method3673 > 0) ? Class146.method3193(method3673) : 1);
                class84.field1194[i] = class86;
                while (method3673-- > 0) {
                    class86.method3944(new Class211(class85.method3671()), class85.method3671());
                }
            }
        }
        class85.field2339 = 0;
        class85.method3752();
        class84.field1189 = new int[method3671];
        class84.field1196 = new int[method3671];
        class84.field1191 = new String[method3671];
        int n = 0;
        while (class85.field2339 < field2339) {
            final int method3674 = class85.method3550();
            if (method3674 == 3) {
                class84.field1191[n] = class85.method3738();
            }
            else if (method3674 < 100 && method3674 != 21 && method3674 != 38 && method3674 != 39) {
                class84.field1196[n] = class85.method3671();
            }
            else {
                class84.field1196[n] = class85.method3544();
            }
            class84.field1189[n++] = method3674;
        }
        return class84;
    }
    
    @ObfuscatedName("fp")
    @ObfuscatedSignature(signature = "(I)Z", garbageValue = "-1245329475")
    static boolean method92() {
        if (Client.field781 == null || Client.field606 >= Client.field781.size()) {
            return true;
        }
        while (Client.field606 < Client.field781.size()) {
            if (!((Class52) Client.field781.get(Client.field606)).method1000()) {
                return false;
            }
            ++Client.field606;
        }
        return true;
    }
}
