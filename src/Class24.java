import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("c")
public class Class24
{
    @ObfuscatedName("pk")
    @ObfuscatedGetter(intValue = -1187037229)
    static int field203;
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "Lc;")
    static final Class24 field208;
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "Lc;")
    static final Class24 field204;
    @ObfuscatedName("de")
    @ObfuscatedSignature(signature = "Lic;")
    static Class249 field207;
    @ObfuscatedName("s")
    @ObfuscatedGetter(intValue = -636830447)
    final int field205;
    
    static {
        field208 = new Class24(0);
        field204 = new Class24(1);
    }
    
    Class24(final int field205) {
        this.field205 = field205;
    }
    
    @ObfuscatedName("gz")
    @ObfuscatedSignature(signature = "(ZI)V", garbageValue = "-1818336157")
    static final void method424(final boolean b) {
        for (int i = 0; i < Client.field622; ++i) {
            final Class72 class72 = Client.field843[Client.field639[i]];
            if (class72 != null && class72.vmethod1786() && class72.field1037.field3511 == b && class72.field1037.method5165()) {
                final int n = class72.field931 >> 7;
                final int n2 = class72.field881 >> 7;
                if (n >= 0 && n < 104 && n2 >= 0 && n2 < 104) {
                    if (class72.field874 == 1 && (class72.field931 & 0x7F) == 0x40 && (class72.field881 & 0x7F) == 0x40) {
                        if (Client.field761[n][n2] == Client.field687) {
                            continue;
                        }
                        Client.field761[n][n2] = Client.field687;
                    }
                    final long method1804 = Class76.method1804(0, 0, 1, !class72.field1037.field3504, Client.field639[i]);
                    class72.field889 = Client.field591;
                    Class28.field248.method2883(Class13.field82, class72.field931, class72.field881, Class27.method460(class72.field874 * 64 - 64 + class72.field931, class72.field874 * 64 - 64 + class72.field881, Class13.field82), class72.field874 * 64 - 64 + 60, class72, class72.field905, method1804, class72.field873);
                }
            }
        }
    }
    
    @ObfuscatedName("jr")
    @ObfuscatedSignature(signature = "(Lhi;B)I", garbageValue = "-51")
    static int method425(final Class230 class230) {
        final Class211 class231 = (Class211)Client.field783.method4020(class230.field2606 + (class230.field2691 << 32));
        if (class231 != null) {
            return class231.field2438;
        }
        return class230.field2678;
    }
}
