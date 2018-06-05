import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("kj")
public final class Class298 extends Class299
{
    public Class298(final byte[] array, final int[] array2, final int[] array3, final int[] array4, final int[] array5, final int[] array6, final byte[][] array7) {
        super(array, array2, array3, array4, array5, array6, array7);
    }
    
    public Class298(final byte[] array) {
        super(array);
    }
    
    @ObfuscatedName("z")
    @Override
    final void vmethod5536(final byte[] array, int field3765, int field3766, int n, int n2, final int n3) {
        int n4 = field3766 * Class314.field3761 + field3765;
        int n5 = Class314.field3761 - n;
        int n6 = 0;
        int n7 = 0;
        if (field3766 < Class314.field3763) {
            final int n8 = Class314.field3763 - field3766;
            n2 -= n8;
            field3766 = Class314.field3763;
            n7 += n8 * n;
            n4 += n8 * Class314.field3761;
        }
        if (field3766 + n2 > Class314.field3764) {
            n2 -= field3766 + n2 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n9 = Class314.field3765 - field3765;
            n -= n9;
            field3765 = Class314.field3765;
            n7 += n9;
            n4 += n9;
            n6 += n9;
            n5 += n9;
        }
        if (field3765 + n > Class314.field3760) {
            final int n10 = field3765 + n - Class314.field3760;
            n -= n10;
            n6 += n10;
            n5 += n10;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        Class299.method5556(Class314.field3766, array, n3, n7, n4, n, n2, n5, n6);
    }
    
    @ObfuscatedName("w")
    @Override
    final void vmethod5542(final byte[] array, int field3765, int field3766, int n, int n2, final int n3, final int n4) {
        int n5 = field3766 * Class314.field3761 + field3765;
        int n6 = Class314.field3761 - n;
        int n7 = 0;
        int n8 = 0;
        if (field3766 < Class314.field3763) {
            final int n9 = Class314.field3763 - field3766;
            n2 -= n9;
            field3766 = Class314.field3763;
            n8 += n9 * n;
            n5 += n9 * Class314.field3761;
        }
        if (field3766 + n2 > Class314.field3764) {
            n2 -= field3766 + n2 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n10 = Class314.field3765 - field3765;
            n -= n10;
            field3765 = Class314.field3765;
            n8 += n10;
            n5 += n10;
            n7 += n10;
            n6 += n10;
        }
        if (field3765 + n > Class314.field3760) {
            final int n11 = field3765 + n - Class314.field3760;
            n -= n11;
            n7 += n11;
            n6 += n11;
        }
        if (n <= 0 || n2 <= 0) {
            return;
        }
        Class299.method5585(Class314.field3766, array, n3, n8, n5, n, n2, n6, n7, n4);
    }
}
