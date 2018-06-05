import net.runelite.mapping.ObfuscatedSignature;
import java.awt.Image;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("bv")
public class Class71 extends Class204
{
    @ObfuscatedName("at")
    static Image field1028;
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "Lja;")
    Class261 field1025;
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "Lgy;")
    Class203 field1026;
    
    Class71(final Class261 field1025) {
        this.field1026 = new Class203();
        this.field1025 = field1025;
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(IIIII)V", garbageValue = "2106192110")
    void method1772(final int n, final int n2, final int n3, final int n4) {
        Class204 class204 = null;
        int n5 = 0;
        for (Class64 class205 = (Class64)this.field1026.method4048(); class205 != null; class205 = (Class64)this.field1026.method4033()) {
            ++n5;
            if (class205.field934 == n) {
                class205.method1559(n, n2, n3, n4);
                return;
            }
            if (class205.field934 <= n) {
                class204 = class205;
            }
        }
        if (class204 == null) {
            if (n5 < 4) {
                this.field1026.method4038(new Class64(n, n2, n3, n4));
            }
            return;
        }
        Class203.method4036(new Class64(n, n2, n3, n4), class204);
        if (n5 >= 4) {
            this.field1026.method4048().method4064();
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(II)Lbn;", garbageValue = "1625981633")
    Class64 method1773(final int n) {
        Class64 class64 = (Class64)this.field1026.method4048();
        if (class64 == null || class64.field934 > n) {
            return null;
        }
        for (Class64 class65 = (Class64)this.field1026.method4033(); class65 != null && class65.field934 <= n; class65 = (Class64)this.field1026.method4033()) {
            class64.method4064();
            class64 = class65;
        }
        if (this.field1025.field3313 + class64.field934 + class64.field937 > n) {
            return class64;
        }
        class64.method4064();
        return null;
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(B)Z", garbageValue = "44")
    boolean method1774() {
        return this.field1026.method4043();
    }
    
    @ObfuscatedName("b")
    @ObfuscatedSignature(signature = "(I)Lll;", garbageValue = "792090098")
    static Class318 method1781() {
        final Class318 class318 = new Class318();
        class318.field3796 = Class305.field3729;
        class318.field3792 = Class319.field3798;
        class318.field3793 = Class7.field45[0];
        class318.field3790 = Class225.field2562[0];
        class318.field3787 = Class319.field3800[0];
        class318.field3788 = Class319.field3799[0];
        final int n = class318.field3788 * class318.field3787;
        final byte[] array = Class319.field3801[0];
        class318.field3791 = new int[n];
        for (int i = 0; i < n; ++i) {
            class318.field3791[i] = Class172.field2260[array[i] & 0xFF];
        }
        Class7.field45 = null;
        Class225.field2562 = null;
        Class319.field3800 = null;
        Class319.field3799 = null;
        Class172.field2260 = null;
        Class319.field3801 = null;
        return class318;
    }
}
