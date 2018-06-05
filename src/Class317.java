import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ly")
public final class Class317 extends Class314
{
    @ObfuscatedName("z")
    public byte[] field3785;
    @ObfuscatedName("w")
    public int[] field3779;
    @ObfuscatedName("s")
    public int field3780;
    @ObfuscatedName("l")
    public int field3781;
    @ObfuscatedName("u")
    public int field3782;
    @ObfuscatedName("q")
    public int field3778;
    @ObfuscatedName("k")
    public int field3784;
    @ObfuscatedName("i")
    public int field3783;
    
    @ObfuscatedName("z")
    public void method5824() {
        if (this.field3780 == this.field3784 && this.field3781 == this.field3783) {
            return;
        }
        final byte[] field3785 = new byte[this.field3784 * this.field3783];
        int n = 0;
        for (int i = 0; i < this.field3781; ++i) {
            for (int j = 0; j < this.field3780; ++j) {
                field3785[j + (i + this.field3778) * this.field3784 + this.field3782] = this.field3785[n++];
            }
        }
        this.field3785 = field3785;
        this.field3780 = this.field3784;
        this.field3781 = this.field3783;
        this.field3782 = 0;
        this.field3778 = 0;
    }
    
    @ObfuscatedName("w")
    public void method5822(final int n, final int n2, final int n3) {
        for (int i = 0; i < this.field3779.length; ++i) {
            int n4 = (this.field3779[i] >> 16 & 0xFF) + n;
            if (n4 < 0) {
                n4 = 0;
            }
            else if (n4 > 255) {
                n4 = 255;
            }
            int n5 = (this.field3779[i] >> 8 & 0xFF) + n2;
            if (n5 < 0) {
                n5 = 0;
            }
            else if (n5 > 255) {
                n5 = 255;
            }
            int n6 = n3 + (this.field3779[i] & 0xFF);
            if (n6 < 0) {
                n6 = 0;
            }
            else if (n6 > 255) {
                n6 = 255;
            }
            this.field3779[i] = n6 + (n5 << 8) + (n4 << 16);
        }
    }
    
    @ObfuscatedName("s")
    public void method5829(int field3765, int field3766) {
        field3765 += this.field3782;
        field3766 += this.field3778;
        int n = field3765 + field3766 * Class314.field3761;
        int n2 = 0;
        int field3767 = this.field3781;
        int field3768 = this.field3780;
        int n3 = Class314.field3761 - field3768;
        int n4 = 0;
        if (field3766 < Class314.field3763) {
            final int n5 = Class314.field3763 - field3766;
            field3767 -= n5;
            field3766 = Class314.field3763;
            n2 += n5 * field3768;
            n += n5 * Class314.field3761;
        }
        if (field3767 + field3766 > Class314.field3764) {
            field3767 -= field3767 + field3766 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n6 = Class314.field3765 - field3765;
            field3768 -= n6;
            field3765 = Class314.field3765;
            n2 += n6;
            n += n6;
            n4 += n6;
            n3 += n6;
        }
        if (field3768 + field3765 > Class314.field3760) {
            final int n7 = field3768 + field3765 - Class314.field3760;
            field3768 -= n7;
            n4 += n7;
            n3 += n7;
        }
        if (field3768 <= 0 || field3767 <= 0) {
            return;
        }
        method5823(Class314.field3766, this.field3785, this.field3779, n2, n, field3768, field3767, n3, n4);
    }
    
    @ObfuscatedName("u")
    public void method5825(int n, int n2, int n3, int n4) {
        final int field3780 = this.field3780;
        final int field3781 = this.field3781;
        int n5 = 0;
        int n6 = 0;
        final int field3782 = this.field3784;
        final int field3783 = this.field3783;
        final int n7 = (field3782 << 16) / n3;
        final int n8 = (field3783 << 16) / n4;
        if (this.field3782 > 0) {
            final int n9 = (n7 + (this.field3782 << 16) - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (this.field3782 << 16);
        }
        if (this.field3778 > 0) {
            final int n10 = (n8 + (this.field3778 << 16) - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (this.field3778 << 16);
        }
        if (field3780 < field3782) {
            n3 = (n7 + ((field3780 << 16) - n5) - 1) / n7;
        }
        if (field3781 < field3783) {
            n4 = (n8 + ((field3781 << 16) - n6) - 1) / n8;
        }
        int n11 = n + n2 * Class314.field3761;
        int n12 = Class314.field3761 - n3;
        if (n2 + n4 > Class314.field3764) {
            n4 -= n2 + n4 - Class314.field3764;
        }
        if (n2 < Class314.field3763) {
            final int n13 = Class314.field3763 - n2;
            n4 -= n13;
            n11 += n13 * Class314.field3761;
            n6 += n8 * n13;
        }
        if (n3 + n > Class314.field3760) {
            final int n14 = n3 + n - Class314.field3760;
            n3 -= n14;
            n12 += n14;
        }
        if (n < Class314.field3765) {
            final int n15 = Class314.field3765 - n;
            n3 -= n15;
            n11 += n15;
            n5 += n7 * n15;
            n12 += n15;
        }
        method5826(Class314.field3766, this.field3785, this.field3779, n5, n6, n11, n12, n3, n4, n7, n8, field3780);
    }
    
    @ObfuscatedName("l")
    static void method5823(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6) {
        final int n7 = -(n3 >> 2);
        n3 = -(n3 & 0x3);
        for (int i = -n4; i < 0; ++i) {
            for (int j = n7; j < 0; ++j) {
                final byte b = array2[n++];
                if (b != 0) {
                    array[n2++] = array3[b & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b2 = array2[n++];
                if (b2 != 0) {
                    array[n2++] = array3[b2 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b3 = array2[n++];
                if (b3 != 0) {
                    array[n2++] = array3[b3 & 0xFF];
                }
                else {
                    ++n2;
                }
                final byte b4 = array2[n++];
                if (b4 != 0) {
                    array[n2++] = array3[b4 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            for (int k = n3; k < 0; ++k) {
                final byte b5 = array2[n++];
                if (b5 != 0) {
                    array[n2++] = array3[b5 & 0xFF];
                }
                else {
                    ++n2;
                }
            }
            n2 += n5;
            n += n6;
        }
    }
    
    @ObfuscatedName("q")
    static void method5826(final int[] array, final byte[] array2, final int[] array3, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9) {
        final int n10 = n;
        for (int i = -n6; i < 0; ++i) {
            final int n11 = n9 * (n2 >> 16);
            for (int j = -n5; j < 0; ++j) {
                final byte b = array2[(n >> 16) + n11];
                if (b != 0) {
                    array[n3++] = array3[b & 0xFF];
                }
                else {
                    ++n3;
                }
                n += n7;
            }
            n2 += n8;
            n = n10;
            n3 += n4;
        }
    }
}
