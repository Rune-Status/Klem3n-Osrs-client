import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("iy")
public class Class238
{
    @ObfuscatedName("gj")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "111587198")
    static final void method4594(int n, int n2, final int n3) {
        if (n < 128 || n2 < 128 || n > 13056 || n2 > 13056) {
            Client.field679 = -1;
            Client.field680 = -1;
            return;
        }
        final int n4 = Class27.method460(n, n2, Class13.field82) - n3;
        n -= Class109.field1431;
        final int n5 = n4 - Class123.field1702;
        n2 -= Class226.field2563;
        final int n6 = Class122.field1681[Class7.field41];
        final int n7 = Class122.field1693[Class7.field41];
        final int n8 = Class122.field1681[Class85.field1201];
        final int n9 = Class122.field1693[Class85.field1201];
        final int n10 = n8 * n2 + n * n9 >> 16;
        n2 = n9 * n2 - n * n8 >> 16;
        n = n10;
        final int n11 = n7 * n5 - n6 * n2 >> 16;
        n2 = n5 * n6 + n7 * n2 >> 16;
        final int n12 = n11;
        if (n2 >= 50) {
            Client.field679 = n * Client.field840 / n2 + Client.field838 / 2;
            Client.field680 = n12 * Client.field840 / n2 + Client.field662 / 2;
        }
        else {
            Client.field679 = -1;
            Client.field680 = -1;
        }
    }
}
