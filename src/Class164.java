import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;

// 
// Decompiled by Procyon v0.5.30
// 

@ObfuscatedName("fk")
public class Class164
{
    @ObfuscatedName("ao")
    @ObfuscatedGetter(intValue = 2146339647)
    int field2025;
    @ObfuscatedName("at")
    @ObfuscatedGetter(intValue = -1748488477)
    int field2026;
    @ObfuscatedName("ai")
    @ObfuscatedGetter(intValue = -229074279)
    int field2027;
    @ObfuscatedName("ac")
    @ObfuscatedGetter(intValue = 1893638093)
    int field2030;
    @ObfuscatedName("ap")
    public int[][] field2029;
    
    public Class164(final int field2027, final int field2028) {
        this.field2025 = 0;
        this.field2026 = 0;
        this.field2027 = field2027;
        this.field2030 = field2028;
        this.field2029 = new int[this.field2027][this.field2030];
        this.method3392();
    }
    
    @ObfuscatedName("z")
    @ObfuscatedSignature(signature = "(B)V", garbageValue = "87")
    public void method3392() {
        for (int i = 0; i < this.field2027; ++i) {
            for (int j = 0; j < this.field2030; ++j) {
                if (i != 0 && j != 0 && i < this.field2027 - 5 && j < this.field2030 - 5) {
                    this.field2029[i][j] = 16777216;
                }
                else {
                    this.field2029[i][j] = 16777215;
                }
            }
        }
    }
    
    @ObfuscatedName("w")
    @ObfuscatedSignature(signature = "(IIIIZI)V", garbageValue = "1912386247")
    public void method3393(int n, int n2, final int n3, final int n4, final boolean b) {
        n -= this.field2025;
        n2 -= this.field2026;
        if (n3 == 0) {
            if (n4 == 0) {
                this.method3397(n, n2, 128);
                this.method3397(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.method3397(n, n2, 2);
                this.method3397(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.method3397(n, n2, 8);
                this.method3397(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.method3397(n, n2, 32);
                this.method3397(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.method3397(n, n2, 1);
                this.method3397(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.method3397(n, n2, 4);
                this.method3397(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.method3397(n, n2, 16);
                this.method3397(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.method3397(n, n2, 64);
                this.method3397(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.method3397(n, n2, 130);
                this.method3397(n - 1, n2, 8);
                this.method3397(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.method3397(n, n2, 10);
                this.method3397(n, n2 + 1, 32);
                this.method3397(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.method3397(n, n2, 40);
                this.method3397(n + 1, n2, 128);
                this.method3397(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.method3397(n, n2, 160);
                this.method3397(n, n2 - 1, 2);
                this.method3397(n - 1, n2, 8);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.method3397(n, n2, 65536);
                    this.method3397(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.method3397(n, n2, 1024);
                    this.method3397(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.method3397(n, n2, 4096);
                    this.method3397(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.method3397(n, n2, 16384);
                    this.method3397(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.method3397(n, n2, 512);
                    this.method3397(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.method3397(n, n2, 2048);
                    this.method3397(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.method3397(n, n2, 8192);
                    this.method3397(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.method3397(n, n2, 32768);
                    this.method3397(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.method3397(n, n2, 66560);
                    this.method3397(n - 1, n2, 4096);
                    this.method3397(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.method3397(n, n2, 5120);
                    this.method3397(n, n2 + 1, 16384);
                    this.method3397(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.method3397(n, n2, 20480);
                    this.method3397(n + 1, n2, 65536);
                    this.method3397(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.method3397(n, n2, 81920);
                    this.method3397(n, n2 - 1, 1024);
                    this.method3397(n - 1, n2, 4096);
                }
            }
        }
    }
    
    @ObfuscatedName("s")
    @ObfuscatedSignature(signature = "(IIIIZB)V", garbageValue = "126")
    public void method3394(int n, int n2, final int n3, final int n4, final boolean b) {
        int n5 = 256;
        if (b) {
            n5 += 131072;
        }
        n -= this.field2025;
        n2 -= this.field2026;
        for (int i = n; i < n3 + n; ++i) {
            if (i >= 0 && i < this.field2027) {
                for (int j = n2; j < n2 + n4; ++j) {
                    if (j >= 0 && j < this.field2030) {
                        this.method3397(i, j, n5);
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("l")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-770386169")
    public void method3395(int n, int n2) {
        n -= this.field2025;
        n2 -= this.field2026;
        final int[] array = this.field2029[n];
        final int n3 = n2;
        array[n3] |= 0x200000;
    }
    
    @ObfuscatedName("u")
    @ObfuscatedSignature(signature = "(IIB)V", garbageValue = "90")
    public void method3410(int n, int n2) {
        n -= this.field2025;
        n2 -= this.field2026;
        final int[] array = this.field2029[n];
        final int n3 = n2;
        array[n3] |= 0x40000;
    }
    
    @ObfuscatedName("q")
    @ObfuscatedSignature(signature = "(IIIS)V", garbageValue = "23621")
    void method3397(final int n, final int n2, final int n3) {
        final int[] array = this.field2029[n];
        array[n2] |= n3;
    }
    
    @ObfuscatedName("i")
    @ObfuscatedSignature(signature = "(IIIIZI)V", garbageValue = "-30475067")
    public void method3391(int n, int n2, final int n3, final int n4, final boolean b) {
        n -= this.field2025;
        n2 -= this.field2026;
        if (n3 == 0) {
            if (n4 == 0) {
                this.method3400(n, n2, 128);
                this.method3400(n - 1, n2, 8);
            }
            if (n4 == 1) {
                this.method3400(n, n2, 2);
                this.method3400(n, n2 + 1, 32);
            }
            if (n4 == 2) {
                this.method3400(n, n2, 8);
                this.method3400(n + 1, n2, 128);
            }
            if (n4 == 3) {
                this.method3400(n, n2, 32);
                this.method3400(n, n2 - 1, 2);
            }
        }
        if (n3 == 1 || n3 == 3) {
            if (n4 == 0) {
                this.method3400(n, n2, 1);
                this.method3400(n - 1, n2 + 1, 16);
            }
            if (n4 == 1) {
                this.method3400(n, n2, 4);
                this.method3400(n + 1, n2 + 1, 64);
            }
            if (n4 == 2) {
                this.method3400(n, n2, 16);
                this.method3400(n + 1, n2 - 1, 1);
            }
            if (n4 == 3) {
                this.method3400(n, n2, 64);
                this.method3400(n - 1, n2 - 1, 4);
            }
        }
        if (n3 == 2) {
            if (n4 == 0) {
                this.method3400(n, n2, 130);
                this.method3400(n - 1, n2, 8);
                this.method3400(n, n2 + 1, 32);
            }
            if (n4 == 1) {
                this.method3400(n, n2, 10);
                this.method3400(n, n2 + 1, 32);
                this.method3400(n + 1, n2, 128);
            }
            if (n4 == 2) {
                this.method3400(n, n2, 40);
                this.method3400(n + 1, n2, 128);
                this.method3400(n, n2 - 1, 2);
            }
            if (n4 == 3) {
                this.method3400(n, n2, 160);
                this.method3400(n, n2 - 1, 2);
                this.method3400(n - 1, n2, 8);
            }
        }
        if (b) {
            if (n3 == 0) {
                if (n4 == 0) {
                    this.method3400(n, n2, 65536);
                    this.method3400(n - 1, n2, 4096);
                }
                if (n4 == 1) {
                    this.method3400(n, n2, 1024);
                    this.method3400(n, n2 + 1, 16384);
                }
                if (n4 == 2) {
                    this.method3400(n, n2, 4096);
                    this.method3400(n + 1, n2, 65536);
                }
                if (n4 == 3) {
                    this.method3400(n, n2, 16384);
                    this.method3400(n, n2 - 1, 1024);
                }
            }
            if (n3 == 1 || n3 == 3) {
                if (n4 == 0) {
                    this.method3400(n, n2, 512);
                    this.method3400(n - 1, n2 + 1, 8192);
                }
                if (n4 == 1) {
                    this.method3400(n, n2, 2048);
                    this.method3400(n + 1, n2 + 1, 32768);
                }
                if (n4 == 2) {
                    this.method3400(n, n2, 8192);
                    this.method3400(n + 1, n2 - 1, 512);
                }
                if (n4 == 3) {
                    this.method3400(n, n2, 32768);
                    this.method3400(n - 1, n2 - 1, 2048);
                }
            }
            if (n3 == 2) {
                if (n4 == 0) {
                    this.method3400(n, n2, 66560);
                    this.method3400(n - 1, n2, 4096);
                    this.method3400(n, n2 + 1, 16384);
                }
                if (n4 == 1) {
                    this.method3400(n, n2, 5120);
                    this.method3400(n, n2 + 1, 16384);
                    this.method3400(n + 1, n2, 65536);
                }
                if (n4 == 2) {
                    this.method3400(n, n2, 20480);
                    this.method3400(n + 1, n2, 65536);
                    this.method3400(n, n2 - 1, 1024);
                }
                if (n4 == 3) {
                    this.method3400(n, n2, 81920);
                    this.method3400(n, n2 - 1, 1024);
                    this.method3400(n - 1, n2, 4096);
                }
            }
        }
    }
    
    @ObfuscatedName("x")
    @ObfuscatedSignature(signature = "(IIIIIZI)V", garbageValue = "1761910676")
    public void method3399(int n, int n2, int n3, int n4, final int n5, final boolean b) {
        int n6 = 256;
        if (b) {
            n6 += 131072;
        }
        n -= this.field2025;
        n2 -= this.field2026;
        if (n5 == 1 || n5 == 3) {
            final int n7 = n3;
            n3 = n4;
            n4 = n7;
        }
        for (int i = n; i < n3 + n; ++i) {
            if (i >= 0 && i < this.field2027) {
                for (int j = n2; j < n2 + n4; ++j) {
                    if (j >= 0 && j < this.field2030) {
                        this.method3400(i, j, n6);
                    }
                }
            }
        }
    }
    
    @ObfuscatedName("e")
    @ObfuscatedSignature(signature = "(IIII)V", garbageValue = "2133692895")
    void method3400(final int n, final int n2, final int n3) {
        final int[] array = this.field2029[n];
        array[n2] &= ~n3;
    }
    
    @ObfuscatedName("p")
    @ObfuscatedSignature(signature = "(III)V", garbageValue = "-1440413395")
    public void method3401(int n, int n2) {
        n -= this.field2025;
        n2 -= this.field2026;
        final int[] array = this.field2029[n];
        final int n3 = n2;
        array[n3] &= 0xFFFBFFFF;
    }
}
