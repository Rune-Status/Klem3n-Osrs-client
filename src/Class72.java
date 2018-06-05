import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("br")
public final class Class72 extends Class63
{
    @ObfuscatedName("op")
    @ObfuscatedSignature(signature = "Lll;")
    static Class318 field1038;
    @ObfuscatedName("pz")
    @ObfuscatedGetter(intValue = -856093161)
    static int field1033;
    @ObfuscatedName("b")
    static int[] field1035;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Ljq;")
    Class271 field1037;
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IBB)V", garbageValue = "70")
    final void method1794(final int n, final byte b) {
        int n2 = super.field922[0];
        int n3 = super.field872[0];
        if (n == 0) {
            --n2;
            ++n3;
        }
        if (n == 1) {
            ++n3;
        }
        if (n == 2) {
            ++n2;
            ++n3;
        }
        if (n == 3) {
            --n2;
        }
        if (n == 4) {
            ++n2;
        }
        if (n == 5) {
            --n2;
            --n3;
        }
        if (n == 6) {
            --n3;
        }
        if (n == 7) {
            ++n2;
            --n3;
        }
        if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
            super.field903 = -1;
        }
        if (super.field909 < 9) {
            ++super.field909;
        }
        for (int i = super.field909; i > 0; --i) {
            super.field922[i] = super.field922[i - 1];
            super.field872[i] = super.field872[i - 1];
            super.field928[i] = super.field928[i - 1];
        }
        super.field922[0] = n2;
        super.field872[0] = n3;
        super.field928[0] = b;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIZI)V", garbageValue = "1896882090")
    final void method1788(final int n, final int n2, final boolean b) {
        if (super.field903 != -1 && Class3.method25(super.field903).field3535 == 1) {
            super.field903 = -1;
        }
        if (!b) {
            final int n3 = n - super.field922[0];
            final int n4 = n2 - super.field872[0];
            if (n3 >= -8 && n3 <= 8 && n4 >= -8 && n4 <= 8) {
                if (super.field909 < 9) {
                    ++super.field909;
                }
                for (int i = super.field909; i > 0; --i) {
                    super.field922[i] = super.field922[i - 1];
                    super.field872[i] = super.field872[i - 1];
                    super.field928[i] = super.field928[i - 1];
                }
                super.field922[0] = n;
                super.field872[0] = n2;
                super.field928[0] = 1;
                return;
            }
        }
        super.field909 = 0;
        super.field930 = 0;
        super.field923 = 0;
        super.field922[0] = n;
        super.field872[0] = n2;
        super.field931 = super.field874 * 64 + super.field922[0] * 128;
        super.field881 = super.field874 * 64 + super.field872[0] * 128;
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(I)Ldc;", garbageValue = "2119202332")
    @Override
    protected final Class119 vmethod3067() {
        if (this.field1037 == null) {
            return null;
        }
        final Class273 class273 = (super.field903 != -1 && super.field906 == 0) ? Class3.method25(super.field903) : null;
        Class119 method5162 = this.field1037.method5162(class273, super.field904, (super.field900 != -1 && (super.field900 != super.field893 || class273 == null)) ? Class3.method25(super.field900) : null, super.field908);
        if (method5162 == null) {
            return null;
        }
        method5162.method2670();
        super.field925 = method5162.field1781;
        if (super.field891 != -1 && super.field876 != -1) {
            final Class119 method5163 = Class57.method1035(super.field891).method4866(super.field876);
            if (method5163 != null) {
                method5163.method2718(0, -super.field871, 0);
                method5162 = new Class119(new Class119[] { method5162, method5163 }, 2);
            }
        }
        if (this.field1037.field3497 == 1) {
            method5162.field1603 = true;
        }
        return method5162;
    }
    
    @ObfuscatedName("f")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "5")
    @Override
    final boolean vmethod1786() {
        return this.field1037 != null;
    }
}
