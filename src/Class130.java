import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ew")
public class Class130 extends Class206
{
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lir;")
    public static Class247 field1801;
    @ObfuscatedName("l")
    static String[] field1800;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "[Lda;")
    Class117[] field1802;
    
    public Class130(final Class247 class247, final Class247 class248, final int n, final boolean b) {
        final Class205 class249 = new Class205();
        this.field1802 = new Class117[class247.method4636(n)];
        final int[] method4668 = class247.method4668(n);
        for (int i = 0; i < method4668.length; ++i) {
            final byte[] method4669 = class247.method4625(n, method4668[i]);
            Class124 class250 = null;
            final int n2 = (method4669[0] & 0xFF) << 8 | (method4669[1] & 0xFF);
            for (Class124 class251 = (Class124)class249.method4098(); class251 != null; class251 = (Class124)class249.method4079()) {
                if (n2 == class251.field1704) {
                    class250 = class251;
                    break;
                }
            }
            if (class250 == null) {
                class250 = new Class124(n2, class248.method4676(n2, 0));
                class249.method4073(class250);
            }
            this.field1802[method4668[i]] = new Class117(method4669, class250);
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(II)Z", garbageValue = "1439746475")
    public boolean method3075(final int n) {
        return this.field1802[n].field1552;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)Liu;", garbageValue = "1311567042")
    public static Class253 method3074(final int n) {
        final Class253 class253 = (Class253)Class253.field3228.method3989(n);
        if (class253 != null) {
            return class253;
        }
        final byte[] method4625 = Class253.field3226.method4625(5, n);
        final Class253 class254 = new Class253();
        if (method4625 != null) {
            class254.method4799(new Class182(method4625));
        }
        Class253.field3228.method3983(class254, n);
        return class254;
    }
    
    @ObfuscatedName("jg")
    @ObfuscatedSignature(signature = "(IB)V", garbageValue = "0")
    static void method3077(final int n) {
        for (Class211 class211 = (Class211)Client.field783.method4018(); class211 != null; class211 = (Class211)Client.field783.method4019()) {
            if (n == (class211.field2421 >> 48 & 0xFFFFL)) {
                class211.method4064();
            }
        }
    }
}
