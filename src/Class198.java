import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gh")
public class Class198
{
    @ObfuscatedName("z")
    int[] field2401;
    
    public Class198(final int[] array) {
        int i;
        for (i = 1; i <= (array.length >> 1) + array.length; i <<= 1) {}
        this.field2401 = new int[i + i];
        for (int j = 0; j < i + i; ++j) {
            this.field2401[j] = -1;
        }
        for (int k = 0; k < array.length; ++k) {
            int n;
            for (n = (array[k] & i - 1); this.field2401[n + n + 1] != -1; n = (n + 1 & i - 1)) {}
            this.field2401[n + n] = array[k];
            this.field2401[n + n + 1] = k;
        }
    }
    
    @ObfuscatedName("z")
    public int method3967(final int n) {
        final int n2 = (this.field2401.length >> 1) - 1;
        int n3 = n & n2;
        while (true) {
            final int n4 = this.field2401[n3 + n3 + 1];
            if (n4 == -1) {
                return -1;
            }
            if (this.field2401[n3 + n3] == n) {
                return n4;
            }
            n3 = (n3 + 1 & n2);
        }
    }
}
