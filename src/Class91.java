import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("cg")
public class Class91
{
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "[Ldn;")
    Class107[] field1241;
    @ObfuscatedName("s")
    int field1239;
    @ObfuscatedName("l")
    int field1240;
    
    Class91(final Class182 class182) {
        this.field1241 = new Class107[10];
        for (int i = 0; i < 10; ++i) {
            if (class182.method3544() != 0) {
                --class182.field2339;
                (this.field1241[i] = new Class107()).method2466(class182);
            }
        }
        this.field1239 = class182.method3550();
        this.field1240 = class182.method3550();
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "()Lct;")
    public Class93 method2069() {
        return new Class93(22050, this.method2068(), this.field1239 * 22050 / 1000, this.field1240 * 22050 / 1000);
    }
    
    @ObfuscatedName("s")
    public final int method2070() {
        int n = 9999999;
        for (int i = 0; i < 10; ++i) {
            if (this.field1241[i] != null && this.field1241[i].field1405 / 20 < n) {
                n = this.field1241[i].field1405 / 20;
            }
        }
        if (this.field1239 < this.field1240 && this.field1239 / 20 < n) {
            n = this.field1239 / 20;
        }
        if (n != 9999999 && n != 0) {
            for (int j = 0; j < 10; ++j) {
                if (this.field1241[j] != null) {
                    final Class107 class107 = this.field1241[j];
                    class107.field1405 -= n * 20;
                }
            }
            if (this.field1239 < this.field1240) {
                this.field1239 -= n * 20;
                this.field1240 -= n * 20;
            }
            return n;
        }
        return 0;
    }
    
    @ObfuscatedName("l")
    final byte[] method2068() {
        int n = 0;
        for (int i = 0; i < 10; ++i) {
            if (this.field1241[i] != null && this.field1241[i].field1404 + this.field1241[i].field1405 > n) {
                n = this.field1241[i].field1404 + this.field1241[i].field1405;
            }
        }
        if (n == 0) {
            return new byte[0];
        }
        final byte[] array = new byte[n * 22050 / 1000];
        for (int j = 0; j < 10; ++j) {
            if (this.field1241[j] != null) {
                final int n2 = this.field1241[j].field1404 * 22050 / 1000;
                final int n3 = this.field1241[j].field1405 * 22050 / 1000;
                final int[] method2464 = this.field1241[j].method2464(n2, this.field1241[j].field1404);
                for (int k = 0; k < n2; ++k) {
                    int n4 = (method2464[k] >> 8) + array[k + n3];
                    if ((n4 + 128 & 0xFFFFFF00) != 0x0) {
                        n4 = (n4 >> 31 ^ 0x7F);
                    }
                    array[k + n3] = (byte)n4;
                }
            }
        }
        return array;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(Lir;II)Lcg;")
    public static Class91 method2071(final Class247 class247, final int n, final int n2) {
        final byte[] method4625 = class247.method4625(n, n2);
        if (method4625 == null) {
            return null;
        }
        return new Class91(new Class182(method4625));
    }
}
