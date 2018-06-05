import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fy")
public class Class174
{
    @ObfuscatedName("z")
    int[] field2265;
    @ObfuscatedName("w")
    byte[] field2264;
    @ObfuscatedName("s")
    int[] field2267;
    
    public Class174(final byte[] field2264) {
        final int length = field2264.length;
        this.field2265 = new int[length];
        this.field2264 = field2264;
        final int[] array = new int[33];
        this.field2267 = new int[8];
        int n = 0;
        for (int i = 0; i < length; ++i) {
            final byte b = field2264[i];
            if (b != 0) {
                final int n2 = 1 << 32 - b;
                final int n3 = array[b];
                this.field2265[i] = n3;
                int n4;
                if ((n3 & n2) != 0x0) {
                    n4 = array[b - 1];
                }
                else {
                    n4 = (n3 | n2);
                    for (int j = b - 1; j >= 1; --j) {
                        final int n5 = array[j];
                        if (n3 != n5) {
                            break;
                        }
                        final int n6 = 1 << 32 - j;
                        if ((n5 & n6) != 0x0) {
                            array[j] = array[j - 1];
                            break;
                        }
                        array[j] = (n5 | n6);
                    }
                }
                array[b] = n4;
                for (int k = b + 1; k <= 32; ++k) {
                    if (n3 == array[k]) {
                        array[k] = n4;
                    }
                }
                int n7 = 0;
                for (byte b2 = 0; b2 < b; ++b2) {
                    if ((n3 & Integer.MIN_VALUE >>> b2) != 0x0) {
                        if (this.field2267[n7] == 0) {
                            this.field2267[n7] = n;
                        }
                        n7 = this.field2267[n7];
                    }
                    else {
                        ++n7;
                    }
                    if (n7 >= this.field2267.length) {
                        final int[] field2265 = new int[this.field2267.length * 2];
                        for (int l = 0; l < this.field2267.length; ++l) {
                            field2265[l] = this.field2267[l];
                        }
                        this.field2267 = field2265;
                    }
                }
                this.field2267[n7] = ~i;
                if (n7 >= n) {
                    n = n7 + 1;
                }
            }
        }
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "([BII[BII)I", garbageValue = "-1994775044")
    public int method3475(final byte[] array, int i, int n, final byte[] array2, final int n2) {
        int n3 = 0;
        int n4 = n2 << 3;
        int n5;
        int n6;
        byte b;
        int n7;
        byte b2;
        int n8;
        int n9;
        for (n += i; i < n; ++i) {
            n5 = (array[i] & 0xFF);
            n6 = this.field2265[n5];
            b = this.field2264[n5];
            if (b == 0) {
                throw new RuntimeException("");
            }
            n7 = n4 >> 3;
            b2 = (byte)(n4 & 0x7);
            n8 = (n3 & -b2 >> 31);
            n9 = (b + b2 - 1 >> 3) + n7;
            b2 += 24;
            array2[n7] = (byte)(n3 = (n8 | n6 >>> b2));
            if (n7 < n9) {
                ++n7;
                b2 -= 8;
                array2[n7] = (byte)(n3 = n6 >>> b2);
                if (n7 < n9) {
                    ++n7;
                    b2 -= 8;
                    array2[n7] = (byte)(n3 = n6 >>> b2);
                    if (n7 < n9) {
                        ++n7;
                        b2 -= 8;
                        array2[n7] = (byte)(n3 = n6 >>> b2);
                        if (n7 < n9) {
                            ++n7;
                            b2 -= 8;
                            array2[n7] = (byte)(n3 = n6 << -b2);
                        }
                    }
                }
            }
            n4 += b;
        }
        return (n4 + 7 >> 3) - n2;
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "([BI[BIII)I", garbageValue = "1741371195")
    public int method3480(final byte[] array, final int n, final byte[] array2, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = 0;
        n3 += n2;
        int n5 = n;
        while (true) {
            final byte b = array[n5];
            if (b < 0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n6;
            if ((n6 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n6;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x40) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n7;
            if ((n7 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n7;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x20) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n8;
            if ((n8 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n8;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x10) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n9;
            if ((n9 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n9;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x8) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n10;
            if ((n10 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n10;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x4) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n11;
            if ((n11 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n11;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x2) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n12;
            if ((n12 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n12;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            if ((b & 0x1) != 0x0) {
                n4 = this.field2267[n4];
            }
            else {
                ++n4;
            }
            final int n13;
            if ((n13 = this.field2267[n4]) < 0) {
                array2[n2++] = (byte)~n13;
                if (n2 >= n3) {
                    break;
                }
                n4 = 0;
            }
            ++n5;
        }
        return n5 + 1 - n;
    }
}
