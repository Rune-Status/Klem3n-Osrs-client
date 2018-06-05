import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("ll")
public final class Class318 extends Class314
{
    @ObfuscatedName("z")
    public int[] field3791;
    @ObfuscatedName("w")
    public int field3787;
    @ObfuscatedName("s")
    public int field3788;
    @ObfuscatedName("l")
    public int field3793;
    @ObfuscatedName("u")
    int field3790;
    @ObfuscatedName("q")
    public int field3796;
    @ObfuscatedName("k")
    public int field3792;
    
    public Class318(final int[] field3791, final int n, final int n2) {
        this.field3791 = field3791;
        this.field3796 = n;
        this.field3787 = n;
        this.field3792 = n2;
        this.field3788 = n2;
        this.field3790 = 0;
        this.field3793 = 0;
    }
    
    public Class318(final int n, final int n2) {
        this(new int[n2 * n], n, n2);
    }
    
    Class318() {
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "()Lll;")
    public Class318 method5840() {
        final Class318 class318 = new Class318(this.field3787, this.field3788);
        class318.field3796 = this.field3796;
        class318.field3792 = this.field3792;
        class318.field3793 = this.field3796 - this.field3787 - this.field3793;
        class318.field3790 = this.field3790;
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = 0; j < this.field3787; ++j) {
                class318.field3791[j + i * this.field3787] = this.field3791[i * this.field3787 + this.field3787 - 1 - j];
            }
        }
        return class318;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "()Lll;")
    public Class318 method5852() {
        final Class318 class318 = new Class318(this.field3796, this.field3792);
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = 0; j < this.field3787; ++j) {
                class318.field3791[j + (i + this.field3790) * this.field3796 + this.field3793] = this.field3791[j + i * this.field3787];
            }
        }
        return class318;
    }
    
    @ObfuscatedName("s")
    public void method5850() {
        Class314.method5718(this.field3791, this.field3787, this.field3788);
    }
    
    @ObfuscatedName("l")
    public void method5843() {
        if (this.field3787 == this.field3796 && this.field3788 == this.field3792) {
            return;
        }
        final int[] field3791 = new int[this.field3796 * this.field3792];
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = 0; j < this.field3787; ++j) {
                field3791[j + (i + this.field3790) * this.field3796 + this.field3793] = this.field3791[j + i * this.field3787];
            }
        }
        this.field3791 = field3791;
        this.field3787 = this.field3796;
        this.field3788 = this.field3792;
        this.field3793 = 0;
        this.field3790 = 0;
    }
    
    @ObfuscatedName("u")
    public void method5844(final int n) {
        if (this.field3787 == this.field3796 && this.field3788 == this.field3792) {
            return;
        }
        int field3793 = n;
        if (field3793 > this.field3793) {
            field3793 = this.field3793;
        }
        int n2 = n;
        if (n2 + this.field3793 + this.field3787 > this.field3796) {
            n2 = this.field3796 - this.field3793 - this.field3787;
        }
        int field3794 = n;
        if (field3794 > this.field3790) {
            field3794 = this.field3790;
        }
        int n3 = n;
        if (n3 + this.field3790 + this.field3788 > this.field3792) {
            n3 = this.field3792 - this.field3790 - this.field3788;
        }
        final int field3795 = field3793 + n2 + this.field3787;
        final int field3796 = field3794 + n3 + this.field3788;
        final int[] field3797 = new int[field3795 * field3796];
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = 0; j < this.field3787; ++j) {
                field3797[field3795 * (i + field3794) + j + field3793] = this.field3791[j + i * this.field3787];
            }
        }
        this.field3791 = field3797;
        this.field3787 = field3795;
        this.field3788 = field3796;
        this.field3793 -= field3793;
        this.field3790 -= field3794;
    }
    
    @ObfuscatedName("q")
    public void method5934() {
        final int[] field3791 = new int[this.field3787 * this.field3788];
        int n = 0;
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = this.field3787 - 1; j >= 0; --j) {
                field3791[n++] = this.field3791[j + i * this.field3787];
            }
        }
        this.field3791 = field3791;
        this.field3793 = this.field3796 - this.field3787 - this.field3793;
    }
    
    @ObfuscatedName("i")
    public void method5842() {
        final int[] field3791 = new int[this.field3787 * this.field3788];
        int n = 0;
        for (int i = this.field3788 - 1; i >= 0; --i) {
            for (int j = 0; j < this.field3787; ++j) {
                field3791[n++] = this.field3791[j + i * this.field3787];
            }
        }
        this.field3791 = field3791;
        this.field3790 = this.field3792 - this.field3788 - this.field3790;
    }
    
    @ObfuscatedName("x")
    public void method5847(final int n) {
        final int[] field3791 = new int[this.field3787 * this.field3788];
        int n2 = 0;
        for (int i = 0; i < this.field3788; ++i) {
            for (int j = 0; j < this.field3787; ++j) {
                int n3 = this.field3791[n2];
                if (n3 == 0) {
                    if (j > 0 && this.field3791[n2 - 1] != 0) {
                        n3 = n;
                    }
                    else if (i > 0 && this.field3791[n2 - this.field3787] != 0) {
                        n3 = n;
                    }
                    else if (j < this.field3787 - 1 && this.field3791[n2 + 1] != 0) {
                        n3 = n;
                    }
                    else if (i < this.field3788 - 1 && this.field3791[n2 + this.field3787] != 0) {
                        n3 = n;
                    }
                }
                field3791[n2++] = n3;
            }
        }
        this.field3791 = field3791;
    }
    
    @ObfuscatedName("e")
    public void method5848(final int n) {
        for (int i = this.field3788 - 1; i > 0; --i) {
            final int n2 = i * this.field3787;
            for (int j = this.field3787 - 1; j > 0; --j) {
                if (this.field3791[j + n2] == 0 && this.field3791[j + n2 - 1 - this.field3787] != 0) {
                    this.field3791[j + n2] = n;
                }
            }
        }
    }
    
    @ObfuscatedName("p")
    public void method5849(int field3765, int field3766) {
        field3765 += this.field3793;
        field3766 += this.field3790;
        int n = field3765 + field3766 * Class314.field3761;
        int n2 = 0;
        int field3767 = this.field3788;
        int field3768 = this.field3787;
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
        method5926(Class314.field3766, this.field3791, n2, n, field3768, field3767, n3, n4);
    }
    
    @ObfuscatedName("n")
    public void method5851(int field3765, int field3766) {
        field3765 += this.field3793;
        field3766 += this.field3790;
        int n = field3765 + field3766 * Class314.field3761;
        int n2 = 0;
        int field3767 = this.field3788;
        int field3768 = this.field3787;
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
        method5859(Class314.field3766, this.field3791, 0, n2, n, field3768, field3767, n3, n4);
    }
    
    @ObfuscatedName("g")
    public void method5853(int n, int n2, int n3, int n4) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        final int field3787 = this.field3787;
        final int field3788 = this.field3788;
        int n5 = 0;
        int n6 = 0;
        final int field3789 = this.field3796;
        final int field3790 = this.field3792;
        final int n7 = (field3789 << 16) / n3;
        final int n8 = (field3790 << 16) / n4;
        if (this.field3793 > 0) {
            final int n9 = (n7 + (this.field3793 << 16) - 1) / n7;
            n += n9;
            n5 += n9 * n7 - (this.field3793 << 16);
        }
        if (this.field3790 > 0) {
            final int n10 = (n8 + (this.field3790 << 16) - 1) / n8;
            n2 += n10;
            n6 += n10 * n8 - (this.field3790 << 16);
        }
        if (field3787 < field3789) {
            n3 = (n7 + ((field3787 << 16) - n5) - 1) / n7;
        }
        if (field3788 < field3790) {
            n4 = (n8 + ((field3788 << 16) - n6) - 1) / n8;
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
        method5854(Class314.field3766, this.field3791, 0, n5, n6, n11, n12, n3, n4, n7, n8, field3787);
    }
    
    @ObfuscatedName("r")
    public void method5855(int field3765, int field3766, final int n, final int n2) {
        if (n == 256) {
            this.method5851(field3765, field3766);
            return;
        }
        field3765 += this.field3793;
        field3766 += this.field3790;
        int n3 = field3765 + field3766 * Class314.field3761;
        int n4 = 0;
        int field3767 = this.field3788;
        int field3768 = this.field3787;
        int n5 = Class314.field3761 - field3768;
        int n6 = 0;
        if (field3766 < Class314.field3763) {
            final int n7 = Class314.field3763 - field3766;
            field3767 -= n7;
            field3766 = Class314.field3763;
            n4 += n7 * field3768;
            n3 += n7 * Class314.field3761;
        }
        if (field3767 + field3766 > Class314.field3764) {
            field3767 -= field3767 + field3766 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n8 = Class314.field3765 - field3765;
            field3768 -= n8;
            field3765 = Class314.field3765;
            n4 += n8;
            n3 += n8;
            n6 += n8;
            n5 += n8;
        }
        if (field3768 + field3765 > Class314.field3760) {
            final int n9 = field3768 + field3765 - Class314.field3760;
            field3768 -= n9;
            n6 += n9;
            n5 += n9;
        }
        if (field3768 <= 0 || field3767 <= 0) {
            return;
        }
        method5897(Class314.field3766, this.field3791, 0, n4, n3, field3768, field3767, n5, n6, n, n2);
    }
    
    @ObfuscatedName("o")
    public void method5857(int field3765, int field3766, final int n) {
        field3765 += this.field3793;
        field3766 += this.field3790;
        int n2 = field3765 + field3766 * Class314.field3761;
        int n3 = 0;
        int field3767 = this.field3788;
        int field3768 = this.field3787;
        int n4 = Class314.field3761 - field3768;
        int n5 = 0;
        if (field3766 < Class314.field3763) {
            final int n6 = Class314.field3763 - field3766;
            field3767 -= n6;
            field3766 = Class314.field3763;
            n3 += n6 * field3768;
            n2 += n6 * Class314.field3761;
        }
        if (field3767 + field3766 > Class314.field3764) {
            field3767 -= field3767 + field3766 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n7 = Class314.field3765 - field3765;
            field3768 -= n7;
            field3765 = Class314.field3765;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (field3768 + field3765 > Class314.field3760) {
            final int n8 = field3768 + field3765 - Class314.field3760;
            field3768 -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (field3768 <= 0 || field3767 <= 0) {
            return;
        }
        method5846(Class314.field3766, this.field3791, 0, n3, n2, field3768, field3767, n4, n5, n);
    }
    
    @ObfuscatedName("a")
    public void method5856(int n, int n2, int n3, int n4, final int n5) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        final int field3787 = this.field3787;
        final int field3788 = this.field3788;
        int n6 = 0;
        int n7 = 0;
        final int field3789 = this.field3796;
        final int field3790 = this.field3792;
        final int n8 = (field3789 << 16) / n3;
        final int n9 = (field3790 << 16) / n4;
        if (this.field3793 > 0) {
            final int n10 = (n8 + (this.field3793 << 16) - 1) / n8;
            n += n10;
            n6 += n10 * n8 - (this.field3793 << 16);
        }
        if (this.field3790 > 0) {
            final int n11 = (n9 + (this.field3790 << 16) - 1) / n9;
            n2 += n11;
            n7 += n11 * n9 - (this.field3790 << 16);
        }
        if (field3787 < field3789) {
            n3 = (n8 + ((field3787 << 16) - n6) - 1) / n8;
        }
        if (field3788 < field3790) {
            n4 = (n9 + ((field3788 << 16) - n7) - 1) / n9;
        }
        int n12 = n + n2 * Class314.field3761;
        int n13 = Class314.field3761 - n3;
        if (n2 + n4 > Class314.field3764) {
            n4 -= n2 + n4 - Class314.field3764;
        }
        if (n2 < Class314.field3763) {
            final int n14 = Class314.field3763 - n2;
            n4 -= n14;
            n12 += n14 * Class314.field3761;
            n7 += n9 * n14;
        }
        if (n3 + n > Class314.field3760) {
            final int n15 = n3 + n - Class314.field3760;
            n3 -= n15;
            n13 += n15;
        }
        if (n < Class314.field3765) {
            final int n16 = Class314.field3765 - n;
            n3 -= n16;
            n12 += n16;
            n6 += n8 * n16;
            n13 += n16;
        }
        method5860(Class314.field3766, this.field3791, 0, n6, n7, n12, n13, n3, n4, n8, n9, field3787, n5);
    }
    
    @ObfuscatedName("v")
    public void method5861(int field3765, int field3766, final int n) {
        field3765 += this.field3793;
        field3766 += this.field3790;
        int n2 = field3765 + field3766 * Class314.field3761;
        int n3 = 0;
        int field3767 = this.field3788;
        int field3768 = this.field3787;
        int n4 = Class314.field3761 - field3768;
        int n5 = 0;
        if (field3766 < Class314.field3763) {
            final int n6 = Class314.field3763 - field3766;
            field3767 -= n6;
            field3766 = Class314.field3763;
            n3 += n6 * field3768;
            n2 += n6 * Class314.field3761;
        }
        if (field3767 + field3766 > Class314.field3764) {
            field3767 -= field3767 + field3766 - Class314.field3764;
        }
        if (field3765 < Class314.field3765) {
            final int n7 = Class314.field3765 - field3765;
            field3768 -= n7;
            field3765 = Class314.field3765;
            n3 += n7;
            n2 += n7;
            n5 += n7;
            n4 += n7;
        }
        if (field3768 + field3765 > Class314.field3760) {
            final int n8 = field3768 + field3765 - Class314.field3760;
            field3768 -= n8;
            n5 += n8;
            n4 += n8;
        }
        if (field3768 <= 0 || field3767 <= 0) {
            return;
        }
        if (n == 256) {
            method5862(0, 0, 0, Class314.field3766, this.field3791, n3, 0, n2, 0, field3768, field3767, n4, n5);
        }
        else {
            method5917(0, 0, 0, Class314.field3766, this.field3791, n3, 0, n2, 0, field3768, field3767, n4, n5, n);
        }
    }
    
    @ObfuscatedName("ab")
    public void method5904(int n, int n2, int n3, int n4, final int n5) {
        if (n3 <= 0 || n4 <= 0) {
            return;
        }
        final int field3787 = this.field3787;
        final int field3788 = this.field3788;
        int n6 = 0;
        int n7 = 0;
        final int field3789 = this.field3796;
        final int field3790 = this.field3792;
        final int n8 = (field3789 << 16) / n3;
        final int n9 = (field3790 << 16) / n4;
        if (this.field3793 > 0) {
            final int n10 = (n8 + (this.field3793 << 16) - 1) / n8;
            n += n10;
            n6 += n10 * n8 - (this.field3793 << 16);
        }
        if (this.field3790 > 0) {
            final int n11 = (n9 + (this.field3790 << 16) - 1) / n9;
            n2 += n11;
            n7 += n11 * n9 - (this.field3790 << 16);
        }
        if (field3787 < field3789) {
            n3 = (n8 + ((field3787 << 16) - n6) - 1) / n8;
        }
        if (field3788 < field3790) {
            n4 = (n9 + ((field3788 << 16) - n7) - 1) / n9;
        }
        int n12 = n + n2 * Class314.field3761;
        int n13 = Class314.field3761 - n3;
        if (n2 + n4 > Class314.field3764) {
            n4 -= n2 + n4 - Class314.field3764;
        }
        if (n2 < Class314.field3763) {
            final int n14 = Class314.field3763 - n2;
            n4 -= n14;
            n12 += n14 * Class314.field3761;
            n7 += n9 * n14;
        }
        if (n3 + n > Class314.field3760) {
            final int n15 = n3 + n - Class314.field3760;
            n3 -= n15;
            n13 += n15;
        }
        if (n < Class314.field3765) {
            final int n16 = Class314.field3765 - n;
            n3 -= n16;
            n12 += n16;
            n6 += n8 * n16;
            n13 += n16;
        }
        if (n5 == 256) {
            method5933(0, 0, 0, n6, this.field3791, Class314.field3766, 0, 0, -n4, n7, n12, n13, n3, n8, n9, field3787);
        }
        else {
            method5913(0, 0, 0, n6, this.field3791, Class314.field3766, 0, 0, -n4, n7, n12, n13, n3, n8, n9, field3787, n5);
        }
    }
    
    @ObfuscatedName("as")
    public void method5867(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        final int n7 = (n2 < 0) ? (-n2) : 0;
        final int n8 = (n2 + this.field3788 <= n6) ? this.field3788 : (n6 - n2);
        final int n9 = (n < 0) ? (-n) : 0;
        final int n10 = (this.field3787 + n <= n5) ? this.field3787 : (n5 - n);
        int n11 = n3 + n9 + (n7 + n2 + n4) * Class314.field3761 + n;
        int n12 = n7 + n2;
        for (int i = n7; i < n8; ++i) {
            final int n13 = array[n12];
            final int n14 = array2[n12++];
            int n15 = n11;
            int n16;
            if (n < n13) {
                n16 = n13 - n;
                n15 += n16 - n9;
            }
            else {
                n16 = n9;
            }
            int field3787;
            if (this.field3787 + n <= n13 + n14) {
                field3787 = this.field3787;
            }
            else {
                field3787 = n13 + n14 - n;
            }
            for (int j = n16; j < field3787; ++j) {
                final int n17 = this.field3791[j + i * this.field3787];
                if (n17 != 0) {
                    Class314.field3766[n15++] = n17;
                }
                else {
                    ++n15;
                }
            }
            n11 += Class314.field3761;
        }
    }
    
    @ObfuscatedName("an")
    public void method5845(int i, int j, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int[] array, final int[] array2) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5 / 326.11) * 65536.0);
            final int n10 = (int)(Math.cos(n5 / 326.11) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = n8 * n11 + n7 * n12 + (n3 << 16);
            int n14 = n8 * n12 - n7 * n11 + (n4 << 16);
            int n15 = i + j * Class314.field3761;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = array[j];
                n17 = n15 + n16;
                n18 = n13 + n12 * n16;
                n19 = n14 - n11 * n16;
                for (i = -array2[j]; i < 0; ++i) {
                    Class314.field3766[n17++] = this.field3791[this.field3787 * (n19 >> 16) + (n18 >> 16)];
                    n18 += n12;
                    n19 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += Class314.field3761;
            }
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("ao")
    public void method5865(int i, int j, final int n, final int n2, final int n3, final int n4, final double n5, final int n6) {
        try {
            final int n7 = -n / 2;
            final int n8 = -n2 / 2;
            final int n9 = (int)(Math.sin(n5) * 65536.0);
            final int n10 = (int)(Math.cos(n5) * 65536.0);
            final int n11 = n9 * n6 >> 8;
            final int n12 = n10 * n6 >> 8;
            int n13 = n8 * n11 + n7 * n12 + (n3 << 16);
            int n14 = n8 * n12 - n7 * n11 + (n4 << 16);
            int n15 = i + j * Class314.field3761;
            int n16;
            int n17;
            int n18;
            int n19;
            for (j = 0; j < n2; ++j) {
                n16 = n15;
                n17 = n13;
                n18 = n14;
                for (i = -n; i < 0; ++i) {
                    n19 = this.field3791[this.field3787 * (n18 >> 16) + (n17 >> 16)];
                    if (n19 != 0) {
                        Class314.field3766[n16++] = n19;
                    }
                    else {
                        ++n16;
                    }
                    n17 += n12;
                    n18 -= n11;
                }
                n13 += n11;
                n14 += n12;
                n15 += Class314.field3761;
            }
        }
        catch (Exception ex) {}
    }
    
    @ObfuscatedName("at")
    public void method5870(final int n, final int n2, final int n3, final int n4) {
        this.method5871(this.field3796 << 3, this.field3792 << 3, n << 4, n2 << 4, n3, n4);
    }
    
    @ObfuscatedName("ai")
    void method5871(int n, int n2, final int n3, final int n4, final int n5, final int n6) {
        if (n6 == 0) {
            return;
        }
        n -= this.field3793 << 4;
        n2 -= this.field3790 << 4;
        final double n7 = (n5 & 0xFFFF) * 9.587379924285257E-5;
        final int n8 = (int)Math.floor(Math.sin(n7) * n6 + 0.5);
        final int n9 = (int)Math.floor(Math.cos(n7) * n6 + 0.5);
        final int n10 = n9 * -n + -n2 * n8;
        final int n11 = -n2 * n9 + n8 * -(-n);
        final int n12 = n9 * ((this.field3787 << 4) - n) + -n2 * n8;
        final int n13 = n8 * -((this.field3787 << 4) - n) + -n2 * n9;
        final int n14 = ((this.field3788 << 4) - n2) * n8 + n9 * -n;
        final int n15 = ((this.field3788 << 4) - n2) * n9 + n8 * -(-n);
        final int n16 = ((this.field3788 << 4) - n2) * n8 + n9 * ((this.field3787 << 4) - n);
        final int n17 = ((this.field3788 << 4) - n2) * n9 + n8 * -((this.field3787 << 4) - n);
        int n18;
        int n19;
        if (n10 < n12) {
            n18 = n10;
            n19 = n12;
        }
        else {
            n18 = n12;
            n19 = n10;
        }
        if (n14 < n18) {
            n18 = n14;
        }
        if (n16 < n18) {
            n18 = n16;
        }
        if (n14 > n19) {
            n19 = n14;
        }
        if (n16 > n19) {
            n19 = n16;
        }
        int n20;
        int n21;
        if (n11 < n13) {
            n20 = n11;
            n21 = n13;
        }
        else {
            n20 = n13;
            n21 = n11;
        }
        if (n15 < n20) {
            n20 = n15;
        }
        if (n17 < n20) {
            n20 = n17;
        }
        if (n15 > n21) {
            n21 = n15;
        }
        if (n17 > n21) {
            n21 = n17;
        }
        final int n22 = n18 >> 12;
        final int n23 = n19 + 4095 >> 12;
        final int n24 = n20 >> 12;
        final int n25 = n21 + 4095 >> 12;
        final int n26 = n3 + n22;
        final int n27 = n3 + n23;
        final int n28 = n24 + n4;
        final int n29 = n25 + n4;
        int field3765 = n26 >> 4;
        int field3766 = n27 + 15 >> 4;
        int field3767 = n28 >> 4;
        int field3768 = n29 + 15 >> 4;
        if (field3765 < Class314.field3765) {
            field3765 = Class314.field3765;
        }
        if (field3766 > Class314.field3760) {
            field3766 = Class314.field3760;
        }
        if (field3767 < Class314.field3763) {
            field3767 = Class314.field3763;
        }
        if (field3768 > Class314.field3764) {
            field3768 = Class314.field3764;
        }
        final int n30 = field3765 - field3766;
        if (n30 >= 0) {
            return;
        }
        final int n31 = field3767 - field3768;
        if (n31 >= 0) {
            return;
        }
        int n32 = field3765 + field3767 * Class314.field3761;
        final double n33 = 1.6777216E7 / n6;
        final int n34 = (int)Math.floor(Math.sin(n7) * n33 + 0.5);
        final int n35 = (int)Math.floor(Math.cos(n7) * n33 + 0.5);
        final int n36 = (field3765 << 4) + 8 - n3;
        final int n37 = (field3767 << 4) + 8 - n4;
        int n38 = (n << 8) - (n37 * n34 >> 4);
        int n39 = (n37 * n35 >> 4) + (n2 << 8);
        if (n35 == 0) {
            if (n34 == 0) {
                for (int i = n31; i < 0; ++i, n32 += Class314.field3761) {
                    int n40 = n32;
                    final int n41 = n38;
                    final int n42 = n39;
                    int j = n30;
                    if (n41 >= 0) {
                        if (n42 >= 0) {
                            if (n41 - (this.field3787 << 12) < 0) {
                                if (n42 - (this.field3788 << 12) < 0) {
                                    while (j < 0) {
                                        final int n43 = this.field3791[(n41 >> 12) + (n42 >> 12) * this.field3787];
                                        if (n43 != 0) {
                                            Class314.field3766[n40++] = n43;
                                        }
                                        else {
                                            ++n40;
                                        }
                                        ++j;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int k = n31; k < 0; ++k, n38 -= n34, n32 += Class314.field3761) {
                    int n44 = n32;
                    final int n45 = n38;
                    int n46 = (n36 * n34 >> 4) + n39;
                    int l = n30;
                    if (n45 >= 0) {
                        if (n45 - (this.field3787 << 12) < 0) {
                            final int n47;
                            if ((n47 = n46 - (this.field3788 << 12)) >= 0) {
                                final int n48 = (n34 - n47) / n34;
                                l += n48;
                                n46 += n34 * n48;
                                n44 += n48;
                            }
                            final int n49;
                            if ((n49 = (n46 - n34) / n34) > l) {
                                l = n49;
                            }
                            while (l < 0) {
                                final int n50 = this.field3791[(n45 >> 12) + (n46 >> 12) * this.field3787];
                                if (n50 != 0) {
                                    Class314.field3766[n44++] = n50;
                                }
                                else {
                                    ++n44;
                                }
                                n46 += n34;
                                ++l;
                            }
                        }
                    }
                }
            }
            else {
                for (int n51 = n31; n51 < 0; ++n51, n38 -= n34, n32 += Class314.field3761) {
                    int n52 = n32;
                    final int n53 = n38;
                    int n54 = (n36 * n34 >> 4) + n39;
                    int n55 = n30;
                    if (n53 >= 0) {
                        if (n53 - (this.field3787 << 12) < 0) {
                            if (n54 < 0) {
                                final int n56 = (n34 - 1 - n54) / n34;
                                n55 += n56;
                                n54 += n34 * n56;
                                n52 += n56;
                            }
                            final int n57;
                            if ((n57 = (n54 + 1 - (this.field3788 << 12) - n34) / n34) > n55) {
                                n55 = n57;
                            }
                            while (n55 < 0) {
                                final int n58 = this.field3791[(n53 >> 12) + (n54 >> 12) * this.field3787];
                                if (n58 != 0) {
                                    Class314.field3766[n52++] = n58;
                                }
                                else {
                                    ++n52;
                                }
                                n54 += n34;
                                ++n55;
                            }
                        }
                    }
                }
            }
        }
        else if (n35 < 0) {
            if (n34 == 0) {
                for (int n59 = n31; n59 < 0; ++n59, n39 += n35, n32 += Class314.field3761) {
                    int n60 = n32;
                    int n61 = (n36 * n35 >> 4) + n38;
                    final int n62 = n39;
                    int n63 = n30;
                    if (n62 >= 0) {
                        if (n62 - (this.field3788 << 12) < 0) {
                            final int n64;
                            if ((n64 = n61 - (this.field3787 << 12)) >= 0) {
                                final int n65 = (n35 - n64) / n35;
                                n63 += n65;
                                n61 += n35 * n65;
                                n60 += n65;
                            }
                            final int n66;
                            if ((n66 = (n61 - n35) / n35) > n63) {
                                n63 = n66;
                            }
                            while (n63 < 0) {
                                final int n67 = this.field3791[(n61 >> 12) + (n62 >> 12) * this.field3787];
                                if (n67 != 0) {
                                    Class314.field3766[n60++] = n67;
                                }
                                else {
                                    ++n60;
                                }
                                n61 += n35;
                                ++n63;
                            }
                        }
                    }
                }
            }
            else if (n34 < 0) {
                for (int n68 = n31; n68 < 0; ++n68, n38 -= n34, n39 += n35, n32 += Class314.field3761) {
                    int n69 = n32;
                    int n70 = (n36 * n35 >> 4) + n38;
                    int n71 = (n36 * n34 >> 4) + n39;
                    int n72 = n30;
                    final int n73;
                    if ((n73 = n70 - (this.field3787 << 12)) >= 0) {
                        final int n74 = (n35 - n73) / n35;
                        n72 += n74;
                        n70 += n35 * n74;
                        n71 += n34 * n74;
                        n69 += n74;
                    }
                    final int n75;
                    if ((n75 = (n70 - n35) / n35) > n72) {
                        n72 = n75;
                    }
                    final int n76;
                    if ((n76 = n71 - (this.field3788 << 12)) >= 0) {
                        final int n77 = (n34 - n76) / n34;
                        n72 += n77;
                        n70 += n35 * n77;
                        n71 += n34 * n77;
                        n69 += n77;
                    }
                    final int n78;
                    if ((n78 = (n71 - n34) / n34) > n72) {
                        n72 = n78;
                    }
                    while (n72 < 0) {
                        final int n79 = this.field3791[(n70 >> 12) + (n71 >> 12) * this.field3787];
                        if (n79 != 0) {
                            Class314.field3766[n69++] = n79;
                        }
                        else {
                            ++n69;
                        }
                        n70 += n35;
                        n71 += n34;
                        ++n72;
                    }
                }
            }
            else {
                for (int n80 = n31; n80 < 0; ++n80, n38 -= n34, n39 += n35, n32 += Class314.field3761) {
                    int n81 = n32;
                    int n82 = (n36 * n35 >> 4) + n38;
                    int n83 = (n36 * n34 >> 4) + n39;
                    int n84 = n30;
                    final int n85;
                    if ((n85 = n82 - (this.field3787 << 12)) >= 0) {
                        final int n86 = (n35 - n85) / n35;
                        n84 += n86;
                        n82 += n35 * n86;
                        n83 += n34 * n86;
                        n81 += n86;
                    }
                    final int n87;
                    if ((n87 = (n82 - n35) / n35) > n84) {
                        n84 = n87;
                    }
                    if (n83 < 0) {
                        final int n88 = (n34 - 1 - n83) / n34;
                        n84 += n88;
                        n82 += n35 * n88;
                        n83 += n34 * n88;
                        n81 += n88;
                    }
                    final int n89;
                    if ((n89 = (n83 + 1 - (this.field3788 << 12) - n34) / n34) > n84) {
                        n84 = n89;
                    }
                    while (n84 < 0) {
                        final int n90 = this.field3791[(n82 >> 12) + (n83 >> 12) * this.field3787];
                        if (n90 != 0) {
                            Class314.field3766[n81++] = n90;
                        }
                        else {
                            ++n81;
                        }
                        n82 += n35;
                        n83 += n34;
                        ++n84;
                    }
                }
            }
        }
        else if (n34 == 0) {
            for (int n91 = n31; n91 < 0; ++n91, n39 += n35, n32 += Class314.field3761) {
                int n92 = n32;
                int n93 = (n36 * n35 >> 4) + n38;
                final int n94 = n39;
                int n95 = n30;
                if (n94 >= 0) {
                    if (n94 - (this.field3788 << 12) < 0) {
                        if (n93 < 0) {
                            final int n96 = (n35 - 1 - n93) / n35;
                            n95 += n96;
                            n93 += n35 * n96;
                            n92 += n96;
                        }
                        final int n97;
                        if ((n97 = (n93 + 1 - (this.field3787 << 12) - n35) / n35) > n95) {
                            n95 = n97;
                        }
                        while (n95 < 0) {
                            final int n98 = this.field3791[(n93 >> 12) + (n94 >> 12) * this.field3787];
                            if (n98 != 0) {
                                Class314.field3766[n92++] = n98;
                            }
                            else {
                                ++n92;
                            }
                            n93 += n35;
                            ++n95;
                        }
                    }
                }
            }
        }
        else if (n34 < 0) {
            for (int n99 = n31; n99 < 0; ++n99, n38 -= n34, n39 += n35, n32 += Class314.field3761) {
                int n100 = n32;
                int n101 = (n36 * n35 >> 4) + n38;
                int n102 = (n36 * n34 >> 4) + n39;
                int n103 = n30;
                if (n101 < 0) {
                    final int n104 = (n35 - 1 - n101) / n35;
                    n103 += n104;
                    n101 += n35 * n104;
                    n102 += n34 * n104;
                    n100 += n104;
                }
                final int n105;
                if ((n105 = (n101 + 1 - (this.field3787 << 12) - n35) / n35) > n103) {
                    n103 = n105;
                }
                final int n106;
                if ((n106 = n102 - (this.field3788 << 12)) >= 0) {
                    final int n107 = (n34 - n106) / n34;
                    n103 += n107;
                    n101 += n35 * n107;
                    n102 += n34 * n107;
                    n100 += n107;
                }
                final int n108;
                if ((n108 = (n102 - n34) / n34) > n103) {
                    n103 = n108;
                }
                while (n103 < 0) {
                    final int n109 = this.field3791[(n101 >> 12) + (n102 >> 12) * this.field3787];
                    if (n109 != 0) {
                        Class314.field3766[n100++] = n109;
                    }
                    else {
                        ++n100;
                    }
                    n101 += n35;
                    n102 += n34;
                    ++n103;
                }
            }
        }
        else {
            for (int n110 = n31; n110 < 0; ++n110, n38 -= n34, n39 += n35, n32 += Class314.field3761) {
                int n111 = n32;
                int n112 = (n36 * n35 >> 4) + n38;
                int n113 = (n36 * n34 >> 4) + n39;
                int n114 = n30;
                if (n112 < 0) {
                    final int n115 = (n35 - 1 - n112) / n35;
                    n114 += n115;
                    n112 += n35 * n115;
                    n113 += n34 * n115;
                    n111 += n115;
                }
                final int n116;
                if ((n116 = (n112 + 1 - (this.field3787 << 12) - n35) / n35) > n114) {
                    n114 = n116;
                }
                if (n113 < 0) {
                    final int n117 = (n34 - 1 - n113) / n34;
                    n114 += n117;
                    n112 += n35 * n117;
                    n113 += n34 * n117;
                    n111 += n117;
                }
                final int n118;
                if ((n118 = (n113 + 1 - (this.field3788 << 12) - n34) / n34) > n114) {
                    n114 = n118;
                }
                while (n114 < 0) {
                    final int n119 = this.field3791[(n112 >> 12) + (n113 >> 12) * this.field3787];
                    if (n119 != 0) {
                        Class314.field3766[n111++] = n119;
                    }
                    else {
                        ++n111;
                    }
                    n112 += n35;
                    n113 += n34;
                    ++n114;
                }
            }
        }
    }
    
    @ObfuscatedName("ac")
    public void method5872(final int n, final int n2, final int n3, final int n4) {
        if (n3 > this.field3796 || n4 > this.field3792) {
            throw new IllegalArgumentException();
        }
        int field3765 = n3 * this.field3793 / this.field3796 + n;
        int field3766 = (n3 * (this.field3793 + this.field3787) + this.field3796 - 1) / this.field3796 + n;
        int field3767 = n2 + n4 * this.field3790 / this.field3792;
        int field3768 = n2 + (this.field3792 + (this.field3790 + this.field3788) * n4 - 1) / this.field3792;
        if (field3765 < Class314.field3765) {
            field3765 = Class314.field3765;
        }
        if (field3766 > Class314.field3760) {
            field3766 = Class314.field3760;
        }
        if (field3767 < Class314.field3763) {
            field3767 = Class314.field3763;
        }
        if (field3768 > Class314.field3764) {
            field3768 = Class314.field3764;
        }
        if (field3765 >= field3766 || field3767 >= field3768) {
            return;
        }
        int n5 = field3765 + field3767 * Class314.field3761;
        final int n6 = Class314.field3761 - (field3766 - field3765);
        if (n5 >= Class314.field3766.length) {
            return;
        }
        for (int i = field3767; i < field3768; ++i) {
            for (int j = field3765; j < field3766; ++j) {
                final int n7 = j - n << 4;
                final int n8 = i - n2 << 4;
                int n9 = n7 * this.field3796 / n3 - (this.field3793 << 4);
                int n10 = (n7 + 16) * this.field3796 / n3 - (this.field3793 << 4);
                int n11 = n8 * this.field3792 / n4 - (this.field3790 << 4);
                int n12 = (n8 + 16) * this.field3792 / n4 - (this.field3790 << 4);
                final int n13 = (n10 - n9) * (n12 - n11) >> 1;
                if (n13 != 0) {
                    if (n9 < 0) {
                        n9 = 0;
                    }
                    if (n10 >= this.field3787 << 4) {
                        n10 = this.field3787 << 4;
                    }
                    if (n11 < 0) {
                        n11 = 0;
                    }
                    if (n12 >= this.field3788 << 4) {
                        n12 = this.field3788 << 4;
                    }
                    --n10;
                    --n12;
                    final int n14 = 16 - (n9 & 0xF);
                    final int n15 = (n10 & 0xF) + 1;
                    final int n16 = 16 - (n11 & 0xF);
                    final int n17 = (n12 & 0xF) + 1;
                    final int n18 = n9 >> 4;
                    final int n19 = n10 >> 4;
                    final int n20 = n11 >> 4;
                    final int n21 = n12 >> 4;
                    int n22 = 0;
                    int n23 = 0;
                    int n24 = 0;
                    int n25 = 0;
                    for (int k = n20; k <= n21; ++k) {
                        int n26 = 16;
                        if (k == n20) {
                            n26 = n16;
                        }
                        if (k == n21) {
                            n26 = n17;
                        }
                        for (int l = n18; l <= n19; ++l) {
                            final int n27 = this.field3791[l + k * this.field3787];
                            if (n27 != 0) {
                                final int n28 = n26;
                                int n29;
                                if (l == n18) {
                                    n29 = n28 * n14;
                                }
                                else if (l == n19) {
                                    n29 = n28 * n15;
                                }
                                else {
                                    n29 = n28 << 4;
                                }
                                n25 += n29;
                                n22 += n29 * (n27 >> 16 & 0xFF);
                                n23 += n29 * (n27 >> 8 & 0xFF);
                                n24 += (n27 & 0xFF) * n29;
                            }
                        }
                    }
                    if (n25 >= n13) {
                        int n30 = n24 / n25 + (n22 / n25 << 16) + (n23 / n25 << 8);
                        if (n30 == 0) {
                            n30 = 1;
                        }
                        Class314.field3766[n5] = n30;
                    }
                    ++n5;
                }
            }
            n5 += n6;
        }
    }
    
    @ObfuscatedName("b")
    static void method5926(final int[] array, final int[] array2, int n, int i, final int n2, final int n3, final int n4, final int n5) {
        for (int j = -n3; j < 0; ++j) {
            int n6;
            for (n6 = i + n2 - 3; i < n6; array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++], array[i++] = array2[n++]) {}
            for (n6 += 3; i < n6; array[i++] = array2[n++]) {}
            i += n4;
            n += n5;
        }
    }
    
    @ObfuscatedName("f")
    static void method5859(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7) {
        final int n8 = -(n4 >> 2);
        n4 = -(n4 & 0x3);
        for (int i = -n5; i < 0; ++i) {
            for (int j = n8; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            for (int k = n4; k < 0; ++k) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @ObfuscatedName("m")
    static void method5854(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10) {
        final int n11 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n12 = n10 * (n3 >> 16);
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n12];
                if (n != 0) {
                    array[n4++] = n;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n11;
            n4 += n5;
        }
    }
    
    @ObfuscatedName("t")
    static void method5897(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8, int n9) {
        final int n10 = 256 - n8;
        n9 = (((n9 & 0xFF00FF) * n10 & 0xFF00FF00) | ((n9 & 0xFF00) * n10 & 0xFF0000)) >>> 8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    array[n3++] = n9 + (((n8 * (n & 0xFF00FF) & 0xFF00FF00) | ((n & 0xFF00) * n8 & 0xFF0000)) >>> 8);
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @ObfuscatedName("y")
    static void method5846(final int[] array, final int[] array2, int n, int n2, int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int n9 = 256 - n8;
        for (int i = -n5; i < 0; ++i) {
            for (int j = -n4; j < 0; ++j) {
                n = array2[n2++];
                if (n != 0) {
                    final int n10 = array[n3];
                    array[n3++] = ((n10 & 0xFF00FF) * n9 + n8 * (n & 0xFF00FF) & 0xFF00FF00) + ((n & 0xFF00) * n8 + n9 * (n10 & 0xFF00) & 0xFF0000) >> 8;
                }
                else {
                    ++n3;
                }
            }
            n3 += n6;
            n2 += n7;
        }
    }
    
    @ObfuscatedName("c")
    static void method5860(final int[] array, final int[] array2, int n, int n2, int n3, int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final int n11) {
        final int n12 = 256 - n11;
        final int n13 = n2;
        for (int i = -n7; i < 0; ++i) {
            final int n14 = n10 * (n3 >> 16);
            for (int j = -n6; j < 0; ++j) {
                n = array2[(n2 >> 16) + n14];
                if (n != 0) {
                    final int n15 = array[n4];
                    array[n4++] = ((n & 0xFF00) * n11 + n12 * (n15 & 0xFF00) & 0xFF0000) + ((n15 & 0xFF00FF) * n12 + n11 * (n & 0xFF00FF) & 0xFF00FF00) >> 8;
                }
                else {
                    ++n4;
                }
                n2 += n8;
            }
            n3 += n9;
            n2 = n13;
            n4 += n5;
        }
    }
    
    @ObfuscatedName("af")
    static void method5862(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    @ObfuscatedName("ah")
    static void method5917(int n, int n2, int n3, final int[] array, final int[] array2, int n4, int i, int n5, int j, final int n6, final int n7, final int n8, final int n9, final int n10) {
        for (j = -n7; j < 0; ++j) {
            for (i = -n6; i < 0; ++i) {
                n = array2[n4++];
                if (n != 0) {
                    n2 = n10 * (n & 0xFF00FF);
                    n = (n2 & 0xFF00FF00) + (n10 * n - n2 & 0xFF0000) >>> 8;
                    n2 = array[n5];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array[n5++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n5;
                }
            }
            n5 += n8;
            n4 += n9;
        }
    }
    
    @ObfuscatedName("aw")
    static void method5933(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12) {
        final int n13 = n4;
        while (j < 0) {
            n5 = n12 * (n6 >> 16);
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n13;
            n7 += n8;
            ++j;
        }
    }
    
    @ObfuscatedName("ak")
    static void method5913(int n, int n2, int n3, int n4, final int[] array, final int[] array2, int i, int n5, int j, int n6, int n7, final int n8, final int n9, final int n10, final int n11, final int n12, final int n13) {
        final int n14 = n4;
        while (j < 0) {
            n5 = n12 * (n6 >> 16);
            for (i = -n9; i < 0; ++i) {
                n = array[(n4 >> 16) + n5];
                if (n != 0) {
                    n2 = (n & 0xFF00FF) * n13;
                    n = (n2 & 0xFF00FF00) + (n * n13 - n2 & 0xFF0000) >>> 8;
                    n2 = array2[n7];
                    n3 = n + n2;
                    n = (n & 0xFF00FF) + (n2 & 0xFF00FF);
                    n2 = (n & 0x1000100) + (n3 - n & 0x10000);
                    array2[n7++] = (n3 - n2 | n2 - (n2 >>> 8));
                }
                else {
                    ++n7;
                }
                n4 += n10;
            }
            n6 += n11;
            n4 = n14;
            n7 += n8;
            ++j;
        }
    }
}
