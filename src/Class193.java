import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("gz")
public class Class193
{
    @ObfuscatedName("z")
    public static void method3873(final byte[] array, int i, final byte[] array2, int n, int n2) {
        if (array2 == array) {
            if (n == i) {
                return;
            }
            if (n > i && n < n2 + i) {
                for (i += --n2, n += n2, n2 = i - n2, n2 += 7; i >= n2; array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--], array2[n--] = array[i--]) {}
                for (n2 -= 7; i >= n2; array2[n--] = array[i--]) {}
                return;
            }
        }
        for (n2 += i, n2 -= 7; i < n2; array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++], array2[n++] = array[i++]) {}
        for (n2 += 7; i < n2; array2[n++] = array[i++]) {}
    }
    
    @ObfuscatedName("p")
    public static void method3895(final int[] array, int i, int n) {
        for (n = n + i - 7; i < n; array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0, array[i++] = 0) {}
        for (n += 7; i < n; array[i++] = 0) {}
    }
}
